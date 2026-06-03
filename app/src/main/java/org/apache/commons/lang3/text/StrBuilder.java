package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class StrBuilder implements java.lang.CharSequence, java.lang.Appendable, java.io.Serializable, org.apache.commons.lang3.builder.Builder<java.lang.String> {
    static final int CAPACITY = 32;
    private static final long serialVersionUID = 7628716375283629643L;
    protected char[] buffer;
    private java.lang.String newLine;
    private java.lang.String nullText;
    protected int size;

    final class StrBuilderReader extends java.io.Reader {
        private int mark;
        private int pos;
        final /* synthetic */ org.apache.commons.lang3.text.StrBuilder this$0;

        StrBuilderReader(org.apache.commons.lang3.text.StrBuilder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.Reader
        public void mark(int r1) {
                r0 = this;
                int r1 = r0.pos
                r0.mark = r1
                return
        }

        @Override // java.io.Reader
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.Reader
        public int read() {
                r3 = this;
                boolean r0 = r3.ready()
                if (r0 != 0) goto L8
                r0 = -1
                return r0
            L8:
                org.apache.commons.lang3.text.StrBuilder r0 = r3.this$0
                int r1 = r3.pos
                int r2 = r1 + 1
                r3.pos = r2
                char r0 = r0.charAt(r1)
                return r0
        }

        @Override // java.io.Reader
        public int read(char[] r4, int r5, int r6) {
                r3 = this;
                if (r5 < 0) goto L41
                if (r6 < 0) goto L41
                int r0 = r4.length
                if (r5 > r0) goto L41
                int r0 = r5 + r6
                int r1 = r4.length
                if (r0 > r1) goto L41
                if (r0 < 0) goto L41
                if (r6 != 0) goto L12
                r4 = 0
                return r4
            L12:
                int r0 = r3.pos
                org.apache.commons.lang3.text.StrBuilder r1 = r3.this$0
                int r1 = r1.size()
                if (r0 < r1) goto L1e
                r4 = -1
                return r4
            L1e:
                int r0 = r3.pos
                int r0 = r0 + r6
                org.apache.commons.lang3.text.StrBuilder r1 = r3.this$0
                int r1 = r1.size()
                if (r0 <= r1) goto L32
                org.apache.commons.lang3.text.StrBuilder r6 = r3.this$0
                int r6 = r6.size()
                int r0 = r3.pos
                int r6 = r6 - r0
            L32:
                org.apache.commons.lang3.text.StrBuilder r0 = r3.this$0
                int r1 = r3.pos
                int r2 = r1 + r6
                r0.getChars(r1, r2, r4, r5)
                int r4 = r3.pos
                int r4 = r4 + r6
                r3.pos = r4
                return r6
            L41:
                java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
                r4.<init>()
                throw r4
        }

        @Override // java.io.Reader
        public boolean ready() {
                r2 = this;
                int r0 = r2.pos
                org.apache.commons.lang3.text.StrBuilder r1 = r2.this$0
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.io.Reader
        public void reset() {
                r1 = this;
                int r0 = r1.mark
                r1.pos = r0
                return
        }

        @Override // java.io.Reader
        public long skip(long r5) {
                r4 = this;
                int r0 = r4.pos
                long r0 = (long) r0
                long r0 = r0 + r5
                org.apache.commons.lang3.text.StrBuilder r2 = r4.this$0
                int r2 = r2.size()
                long r2 = (long) r2
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L19
                org.apache.commons.lang3.text.StrBuilder r5 = r4.this$0
                int r5 = r5.size()
                int r6 = r4.pos
                int r5 = r5 - r6
                long r5 = (long) r5
            L19:
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 >= 0) goto L20
                return r0
            L20:
                int r0 = r4.pos
                int r1 = java.lang.Math.toIntExact(r5)
                int r0 = java.lang.Math.addExact(r0, r1)
                r4.pos = r0
                return r5
        }
    }

    final class StrBuilderTokenizer extends org.apache.commons.lang3.text.StrTokenizer {
        final /* synthetic */ org.apache.commons.lang3.text.StrBuilder this$0;

        StrBuilderTokenizer(org.apache.commons.lang3.text.StrBuilder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.StrTokenizer
        public java.lang.String getContent() {
                r1 = this;
                java.lang.String r0 = super.getContent()
                if (r0 != 0) goto Lc
                org.apache.commons.lang3.text.StrBuilder r0 = r1.this$0
                java.lang.String r0 = r0.toString()
            Lc:
                return r0
        }

        @Override // org.apache.commons.lang3.text.StrTokenizer
        protected java.util.List<java.lang.String> tokenize(char[] r1, int r2, int r3) {
                r0 = this;
                if (r1 != 0) goto L12
                org.apache.commons.lang3.text.StrBuilder r1 = r0.this$0
                char[] r1 = r1.buffer
                org.apache.commons.lang3.text.StrBuilder r2 = r0.this$0
                int r2 = r2.size()
                r3 = 0
                java.util.List r1 = super.tokenize(r1, r3, r2)
                return r1
            L12:
                java.util.List r1 = super.tokenize(r1, r2, r3)
                return r1
        }
    }

    final class StrBuilderWriter extends java.io.Writer {
        final /* synthetic */ org.apache.commons.lang3.text.StrBuilder this$0;

        StrBuilderWriter(org.apache.commons.lang3.text.StrBuilder r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
                r0 = this;
                return
        }

        @Override // java.io.Writer
        public void write(int r2) {
                r1 = this;
                org.apache.commons.lang3.text.StrBuilder r0 = r1.this$0
                char r2 = (char) r2
                r0.append(r2)
                return
        }

        @Override // java.io.Writer
        public void write(java.lang.String r2) {
                r1 = this;
                org.apache.commons.lang3.text.StrBuilder r0 = r1.this$0
                r0.append(r2)
                return
        }

        @Override // java.io.Writer
        public void write(java.lang.String r2, int r3, int r4) {
                r1 = this;
                org.apache.commons.lang3.text.StrBuilder r0 = r1.this$0
                r0.append(r2, r3, r4)
                return
        }

        @Override // java.io.Writer
        public void write(char[] r2) {
                r1 = this;
                org.apache.commons.lang3.text.StrBuilder r0 = r1.this$0
                r0.append(r2)
                return
        }

        @Override // java.io.Writer
        public void write(char[] r2, int r3, int r4) {
                r1 = this;
                org.apache.commons.lang3.text.StrBuilder r0 = r1.this$0
                r0.append(r2, r3, r4)
                return
        }
    }

    public StrBuilder() {
            r1 = this;
            r0 = 32
            r1.<init>(r0)
            return
    }

    public StrBuilder(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 > 0) goto L7
            r1 = 32
        L7:
            char[] r1 = new char[r1]
            r0.buffer = r1
            return
    }

    public StrBuilder(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 32
            if (r3 != 0) goto Lc
            char[] r3 = new char[r0]
            r2.buffer = r3
            goto L18
        Lc:
            int r1 = r3.length()
            int r1 = r1 + r0
            char[] r0 = new char[r1]
            r2.buffer = r0
            r2.append(r3)
        L18:
            return
    }

    private void deleteImpl(int r3, int r4, int r5) {
            r2 = this;
            char[] r0 = r2.buffer
            int r1 = r2.size
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r3 = r2.size
            int r3 = r3 - r5
            r2.size = r3
            return
    }

    static /* synthetic */ char[] lambda$ensureCapacity$0(int r0) {
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            return r0
    }

    static /* synthetic */ char[] lambda$toCharArray$2(int r0) {
            char[] r0 = new char[r0]
            return r0
    }

    static /* synthetic */ char[] lambda$toCharArray$3(int r0) {
            char[] r0 = new char[r0]
            return r0
    }

    private org.apache.commons.lang3.text.StrBuilder replaceImpl(org.apache.commons.lang3.text.StrMatcher r10, java.lang.String r11, int r12, int r13, int r14) {
            r9 = this;
            if (r10 == 0) goto L2e
            int r0 = r9.size
            if (r0 != 0) goto L7
            goto L2e
        L7:
            int r0 = org.apache.commons.lang3.StringUtils.length(r11)
            r7 = r12
        Lc:
            if (r7 >= r13) goto L2e
            if (r14 == 0) goto L2e
            char[] r1 = r9.buffer
            int r8 = r10.isMatch(r1, r7, r12, r13)
            if (r8 <= 0) goto L2b
            int r3 = r7 + r8
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r11
            r6 = r0
            r1.replaceImpl(r2, r3, r4, r5, r6)
            int r13 = r13 - r8
            int r13 = r13 + r0
            int r7 = r7 + r0
            int r7 = r7 + (-1)
            if (r14 <= 0) goto L2b
            int r14 = r14 + (-1)
        L2b:
            int r7 = r7 + 1
            goto Lc
        L2e:
            return r9
    }

    private void replaceImpl(int r4, int r5, int r6, java.lang.String r7, int r8) {
            r3 = this;
            int r0 = r3.size
            int r0 = r0 - r6
            int r0 = r0 + r8
            if (r8 == r6) goto L15
            r3.ensureCapacity(r0)
            char[] r6 = r3.buffer
            int r1 = r4 + r8
            int r2 = r3.size
            int r2 = r2 - r5
            java.lang.System.arraycopy(r6, r5, r6, r1, r2)
            r3.size = r0
        L15:
            if (r8 <= 0) goto L1d
            r5 = 0
            char[] r6 = r3.buffer
            r7.getChars(r5, r8, r6, r4)
        L1d:
            return
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.lang.Appendable
    public org.apache.commons.lang3.text.StrBuilder append(char r4) {
            r3 = this;
            int r0 = r3.length()
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            char[] r0 = r3.buffer
            int r1 = r3.size
            int r2 = r1 + 1
            r3.size = r2
            r0[r1] = r4
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder append(double r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder append(float r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder append(int r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder append(long r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    public org.apache.commons.lang3.text.StrBuilder append(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r2 = r1.appendNull()
            return r2
        L7:
            boolean r0 = r2 instanceof org.apache.commons.lang3.text.StrBuilder
            if (r0 == 0) goto L12
            org.apache.commons.lang3.text.StrBuilder r2 = (org.apache.commons.lang3.text.StrBuilder) r2
            org.apache.commons.lang3.text.StrBuilder r2 = r1.append(r2)
            return r2
        L12:
            boolean r0 = r2 instanceof java.lang.StringBuilder
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            org.apache.commons.lang3.text.StrBuilder r2 = r1.append(r2)
            return r2
        L1d:
            boolean r0 = r2 instanceof java.lang.StringBuffer
            if (r0 == 0) goto L28
            java.lang.StringBuffer r2 = (java.lang.StringBuffer) r2
            org.apache.commons.lang3.text.StrBuilder r2 = r1.append(r2)
            return r2
        L28:
            boolean r0 = r2 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L33
            java.nio.CharBuffer r2 = (java.nio.CharBuffer) r2
            org.apache.commons.lang3.text.StrBuilder r2 = r1.append(r2)
            return r2
        L33:
            java.lang.String r2 = r2.toString()
            org.apache.commons.lang3.text.StrBuilder r2 = r1.append(r2)
            return r2
    }

    @Override // java.lang.Appendable
    public org.apache.commons.lang3.text.StrBuilder append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            if (r1 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r1 = r0.appendNull()
            return r1
        L7:
            java.lang.String r1 = r1.toString()
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2, r3)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r2 = r1.appendNull()
            return r2
        L7:
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto L12
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            org.apache.commons.lang3.text.StrBuilder r2 = r1.append(r2)
            return r2
        L12:
            java.lang.String r2 = r2.toString()
            org.apache.commons.lang3.text.StrBuilder r2 = r1.append(r2)
            return r2
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.String r5) {
            r4 = this;
            if (r5 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r5 = r4.appendNull()
            return r5
        L7:
            int r0 = r5.length()
            if (r0 <= 0) goto L21
            int r1 = r4.length()
            int r2 = r1 + r0
            r4.ensureCapacity(r2)
            r2 = 0
            char[] r3 = r4.buffer
            r5.getChars(r2, r0, r3, r1)
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
        L21:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.String r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r4 = r3.appendNull()
            return r4
        L7:
            if (r5 < 0) goto L37
            int r0 = r4.length()
            if (r5 > r0) goto L37
            if (r6 < 0) goto L2f
            int r0 = r5 + r6
            int r1 = r4.length()
            if (r0 > r1) goto L2f
            if (r6 <= 0) goto L2e
            int r1 = r3.length()
            int r2 = r1 + r6
            r3.ensureCapacity(r2)
            char[] r2 = r3.buffer
            r4.getChars(r5, r0, r2, r1)
            int r4 = r3.size
            int r4 = r4 + r6
            r3.size = r4
        L2e:
            return r3
        L2f:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "length must be valid"
            r4.<init>(r5)
            throw r4
        L37:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "startIndex must be valid"
            r4.<init>(r5)
            throw r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            java.lang.String r1 = java.lang.String.format(r1, r2)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.StringBuffer r5) {
            r4 = this;
            if (r5 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r5 = r4.appendNull()
            return r5
        L7:
            int r0 = r5.length()
            if (r0 <= 0) goto L21
            int r1 = r4.length()
            int r2 = r1 + r0
            r4.ensureCapacity(r2)
            r2 = 0
            char[] r3 = r4.buffer
            r5.getChars(r2, r0, r3, r1)
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
        L21:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.StringBuffer r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r4 = r3.appendNull()
            return r4
        L7:
            if (r5 < 0) goto L37
            int r0 = r4.length()
            if (r5 > r0) goto L37
            if (r6 < 0) goto L2f
            int r0 = r5 + r6
            int r1 = r4.length()
            if (r0 > r1) goto L2f
            if (r6 <= 0) goto L2e
            int r1 = r3.length()
            int r2 = r1 + r6
            r3.ensureCapacity(r2)
            char[] r2 = r3.buffer
            r4.getChars(r5, r0, r2, r1)
            int r4 = r3.size
            int r4 = r4 + r6
            r3.size = r4
        L2e:
            return r3
        L2f:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "length must be valid"
            r4.<init>(r5)
            throw r4
        L37:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "startIndex must be valid"
            r4.<init>(r5)
            throw r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.StringBuilder r5) {
            r4 = this;
            if (r5 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r5 = r4.appendNull()
            return r5
        L7:
            int r0 = r5.length()
            if (r0 <= 0) goto L21
            int r1 = r4.length()
            int r2 = r1 + r0
            r4.ensureCapacity(r2)
            r2 = 0
            char[] r3 = r4.buffer
            r5.getChars(r2, r0, r3, r1)
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
        L21:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.lang.StringBuilder r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r4 = r3.appendNull()
            return r4
        L7:
            if (r5 < 0) goto L37
            int r0 = r4.length()
            if (r5 > r0) goto L37
            if (r6 < 0) goto L2f
            int r0 = r5 + r6
            int r1 = r4.length()
            if (r0 > r1) goto L2f
            if (r6 <= 0) goto L2e
            int r1 = r3.length()
            int r2 = r1 + r6
            r3.ensureCapacity(r2)
            char[] r2 = r3.buffer
            r4.getChars(r5, r0, r2, r1)
            int r4 = r3.size
            int r4 = r4 + r6
            r3.size = r4
        L2e:
            return r3
        L2f:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "length must be valid"
            r4.<init>(r5)
            throw r4
        L37:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "startIndex must be valid"
            r4.<init>(r5)
            throw r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.nio.CharBuffer r5) {
            r4 = this;
            if (r5 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r5 = r4.appendNull()
            return r5
        L7:
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L32
            int r0 = r5.remaining()
            int r1 = r4.length()
            int r2 = r1 + r0
            r4.ensureCapacity(r2)
            char[] r2 = r5.array()
            int r3 = r5.arrayOffset()
            int r5 = r5.position()
            int r3 = r3 + r5
            char[] r5 = r4.buffer
            java.lang.System.arraycopy(r2, r3, r5, r1, r0)
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
            goto L39
        L32:
            java.lang.String r5 = r5.toString()
            r4.append(r5)
        L39:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(java.nio.CharBuffer r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r4 = r3.appendNull()
            return r4
        L7:
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L4d
            int r0 = r4.remaining()
            if (r5 < 0) goto L45
            if (r5 > r0) goto L45
            if (r6 < 0) goto L3d
            int r1 = r5 + r6
            if (r1 > r0) goto L3d
            int r0 = r3.length()
            int r1 = r0 + r6
            r3.ensureCapacity(r1)
            char[] r1 = r4.array()
            int r2 = r4.arrayOffset()
            int r4 = r4.position()
            int r2 = r2 + r4
            int r2 = r2 + r5
            char[] r4 = r3.buffer
            java.lang.System.arraycopy(r1, r2, r4, r0, r6)
            int r4 = r3.size
            int r4 = r4 + r6
            r3.size = r4
            goto L54
        L3d:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "length must be valid"
            r4.<init>(r5)
            throw r4
        L45:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "startIndex must be valid"
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.String r4 = r4.toString()
            r3.append(r4, r5, r6)
        L54:
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder append(org.apache.commons.lang3.text.StrBuilder r5) {
            r4 = this;
            if (r5 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r5 = r4.appendNull()
            return r5
        L7:
            int r0 = r5.length()
            if (r0 <= 0) goto L23
            int r1 = r4.length()
            int r2 = r1 + r0
            r4.ensureCapacity(r2)
            char[] r5 = r5.buffer
            r2 = 0
            char[] r3 = r4.buffer
            java.lang.System.arraycopy(r5, r2, r3, r1, r0)
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
        L23:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(org.apache.commons.lang3.text.StrBuilder r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r4 = r3.appendNull()
            return r4
        L7:
            if (r5 < 0) goto L37
            int r0 = r4.length()
            if (r5 > r0) goto L37
            if (r6 < 0) goto L2f
            int r0 = r5 + r6
            int r1 = r4.length()
            if (r0 > r1) goto L2f
            if (r6 <= 0) goto L2e
            int r1 = r3.length()
            int r2 = r1 + r6
            r3.ensureCapacity(r2)
            char[] r2 = r3.buffer
            r4.getChars(r5, r0, r2, r1)
            int r4 = r3.size
            int r4 = r4 + r6
            r3.size = r4
        L2e:
            return r3
        L2f:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "length must be valid"
            r4.<init>(r5)
            throw r4
        L37:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r5 = "startIndex must be valid"
            r4.<init>(r5)
            throw r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L26
            int r5 = r4.size
            int r5 = r5 + 4
            r4.ensureCapacity(r5)
            char[] r5 = r4.buffer
            int r0 = r4.size
            int r1 = r0 + 1
            r4.size = r1
            r2 = 116(0x74, float:1.63E-43)
            r5[r0] = r2
            int r2 = r0 + 2
            r4.size = r2
            r3 = 114(0x72, float:1.6E-43)
            r5[r1] = r3
            int r0 = r0 + 3
            r4.size = r0
            r0 = 117(0x75, float:1.64E-43)
            r5[r2] = r0
            goto L51
        L26:
            int r5 = r4.size
            int r5 = r5 + 5
            r4.ensureCapacity(r5)
            char[] r5 = r4.buffer
            int r0 = r4.size
            int r1 = r0 + 1
            r4.size = r1
            r2 = 102(0x66, float:1.43E-43)
            r5[r0] = r2
            int r2 = r0 + 2
            r4.size = r2
            r3 = 97
            r5[r1] = r3
            int r1 = r0 + 3
            r4.size = r1
            r3 = 108(0x6c, float:1.51E-43)
            r5[r2] = r3
            int r0 = r0 + 4
            r4.size = r0
            r0 = 115(0x73, float:1.61E-43)
            r5[r1] = r0
        L51:
            char[] r5 = r4.buffer
            int r0 = r4.size
            int r1 = r0 + 1
            r4.size = r1
            r1 = 101(0x65, float:1.42E-43)
            r5[r0] = r1
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(char[] r5) {
            r4 = this;
            if (r5 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r5 = r4.appendNull()
            return r5
        L7:
            int r0 = r5.length
            if (r0 <= 0) goto L1e
            int r1 = r4.length()
            int r2 = r1 + r0
            r4.ensureCapacity(r2)
            r2 = 0
            char[] r3 = r4.buffer
            java.lang.System.arraycopy(r5, r2, r3, r1, r0)
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
        L1e:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder append(char[] r3, int r4, int r5) {
            r2 = this;
            if (r3 != 0) goto L7
            org.apache.commons.lang3.text.StrBuilder r3 = r2.appendNull()
            return r3
        L7:
            if (r4 < 0) goto L3e
            int r0 = r3.length
            if (r4 > r0) goto L3e
            if (r5 < 0) goto L29
            int r0 = r4 + r5
            int r1 = r3.length
            if (r0 > r1) goto L29
            if (r5 <= 0) goto L28
            int r0 = r2.length()
            int r1 = r0 + r5
            r2.ensureCapacity(r1)
            char[] r1 = r2.buffer
            java.lang.System.arraycopy(r3, r4, r1, r0, r5)
            int r3 = r2.size
            int r3 = r3 + r5
            r2.size = r3
        L28:
            return r2
        L29:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid length: "
            r4.<init>(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3e:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid startIndex: "
            r4.<init>(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(java.lang.Iterable<?> r2) {
            r1 = this;
            if (r2 == 0) goto La
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda3
            r0.<init>(r1)
            r2.forEach(r0)
        La:
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(java.util.Iterator<?> r2) {
            r1 = this;
            if (r2 == 0) goto La
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda3
            r0.<init>(r1)
            r2.forEachRemaining(r0)
        La:
            return r1
    }

    public <T> org.apache.commons.lang3.text.StrBuilder appendAll(T... r4) {
            r3 = this;
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(r4)
            if (r0 == 0) goto L12
            int r0 = r4.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto L8
        L12:
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(int r1, int r2, char r3) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.appendFixedWidthPadLeft(r1, r2, r3)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(java.lang.Object r7, int r8, char r9) {
            r6 = this;
            if (r8 <= 0) goto L42
            int r0 = r6.size
            int r0 = r0 + r8
            r6.ensureCapacity(r0)
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda2
            r0.<init>(r6)
            java.lang.String r7 = org.apache.commons.lang3.ObjectUtils.toString(r7, r0)
            if (r7 != 0) goto L15
            java.lang.String r7 = ""
        L15:
            int r0 = r7.length()
            if (r0 < r8) goto L25
            int r9 = r0 - r8
            char[] r1 = r6.buffer
            int r2 = r6.size
            r7.getChars(r9, r0, r1, r2)
            goto L3d
        L25:
            int r1 = r8 - r0
            r2 = 0
            r3 = r2
        L29:
            if (r3 >= r1) goto L35
            char[] r4 = r6.buffer
            int r5 = r6.size
            int r5 = r5 + r3
            r4[r5] = r9
            int r3 = r3 + 1
            goto L29
        L35:
            char[] r9 = r6.buffer
            int r3 = r6.size
            int r3 = r3 + r1
            r7.getChars(r2, r0, r9, r3)
        L3d:
            int r7 = r6.size
            int r7 = r7 + r8
            r6.size = r7
        L42:
            return r6
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(int r1, int r2, char r3) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.appendFixedWidthPadRight(r1, r2, r3)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(java.lang.Object r6, int r7, char r8) {
            r5 = this;
            if (r7 <= 0) goto L3f
            int r0 = r5.size
            int r0 = r0 + r7
            r5.ensureCapacity(r0)
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda2
            r0.<init>(r5)
            java.lang.String r6 = org.apache.commons.lang3.ObjectUtils.toString(r6, r0)
            if (r6 != 0) goto L15
            java.lang.String r6 = ""
        L15:
            int r0 = r6.length()
            r1 = 0
            if (r0 < r7) goto L24
            char[] r8 = r5.buffer
            int r0 = r5.size
            r6.getChars(r1, r7, r8, r0)
            goto L3a
        L24:
            int r2 = r7 - r0
            char[] r3 = r5.buffer
            int r4 = r5.size
            r6.getChars(r1, r0, r3, r4)
        L2d:
            if (r1 >= r2) goto L3a
            char[] r6 = r5.buffer
            int r3 = r5.size
            int r3 = r3 + r0
            int r3 = r3 + r1
            r6[r3] = r8
            int r1 = r1 + 1
            goto L2d
        L3a:
            int r6 = r5.size
            int r6 = r6 + r7
            r5.size = r6
        L3f:
            return r5
    }

    public org.apache.commons.lang3.text.StrBuilder appendNewLine() {
            r1 = this;
            java.lang.String r0 = r1.newLine
            if (r0 != 0) goto Lc
            java.lang.String r0 = java.lang.System.lineSeparator()
            r1.append(r0)
            return r1
        Lc:
            org.apache.commons.lang3.text.StrBuilder r0 = r1.append(r0)
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder appendNull() {
            r1 = this;
            java.lang.String r0 = r1.nullText
            if (r0 != 0) goto L5
            return r1
        L5:
            org.apache.commons.lang3.text.StrBuilder r0 = r1.append(r0)
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder appendPadding(int r5, char r6) {
            r4 = this;
            if (r5 < 0) goto L18
            int r0 = r4.size
            int r0 = r0 + r5
            r4.ensureCapacity(r0)
            r0 = 0
        L9:
            if (r0 >= r5) goto L18
            char[] r1 = r4.buffer
            int r2 = r4.size
            int r3 = r2 + 1
            r4.size = r3
            r1[r2] = r6
            int r0 = r0 + 1
            goto L9
        L18:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(char r2) {
            r1 = this;
            boolean r0 = r1.isNotEmpty()
            if (r0 == 0) goto L9
            r1.append(r2)
        L9:
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(char r2, char r3) {
            r1 = this;
            boolean r0 = r1.isNotEmpty()
            if (r0 == 0) goto La
            r1.append(r2)
            goto Ld
        La:
            r1.append(r3)
        Ld:
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(char r1, int r2) {
            r0 = this;
            if (r2 <= 0) goto L5
            r0.append(r1)
        L5:
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(java.lang.String r2) {
            r1 = this;
            r0 = 0
            org.apache.commons.lang3.text.StrBuilder r2 = r1.appendSeparator(r2, r0)
            return r2
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(java.lang.String r1, int r2) {
            r0 = this;
            if (r1 == 0) goto L7
            if (r2 <= 0) goto L7
            r0.append(r1)
        L7:
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7
            r2 = r3
        L7:
            if (r2 == 0) goto Lc
            r1.append(r2)
        Lc:
            return r1
    }

    public void appendTo(java.lang.Appendable r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof java.io.Writer
            r1 = 0
            if (r0 == 0) goto Lf
            java.io.Writer r4 = (java.io.Writer) r4
            char[] r0 = r3.buffer
            int r2 = r3.size
            r4.write(r0, r1, r2)
            goto L3c
        Lf:
            boolean r0 = r4 instanceof java.lang.StringBuilder
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            char[] r0 = r3.buffer
            int r2 = r3.size
            r4.append(r0, r1, r2)
            goto L3c
        L1d:
            boolean r0 = r4 instanceof java.lang.StringBuffer
            if (r0 == 0) goto L2b
            java.lang.StringBuffer r4 = (java.lang.StringBuffer) r4
            char[] r0 = r3.buffer
            int r2 = r3.size
            r4.append(r0, r1, r2)
            goto L3c
        L2b:
            boolean r0 = r4 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L39
            java.nio.CharBuffer r4 = (java.nio.CharBuffer) r4
            char[] r0 = r3.buffer
            int r2 = r3.size
            r4.put(r0, r1, r2)
            goto L3c
        L39:
            r4.append(r3)
        L3c:
            return
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(java.lang.Iterable<?> r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L23
            java.lang.String r0 = ""
            java.lang.String r3 = java.util.Objects.toString(r3, r0)
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            r1.append(r0)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc
            r1.append(r3)
            goto Lc
        L23:
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(java.util.Iterator<?> r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L1f
            java.lang.String r0 = ""
            java.lang.String r3 = java.util.Objects.toString(r3, r0)
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            r1.append(r0)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8
            r1.append(r3)
            goto L8
        L1f:
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(java.lang.Object[] r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 <= 0) goto L20
            java.lang.String r0 = ""
            java.lang.String r4 = java.util.Objects.toString(r4, r0)
            r0 = 0
            r0 = r3[r0]
            r2.append(r0)
            r0 = 1
        L12:
            int r1 = r3.length
            if (r0 >= r1) goto L20
            r2.append(r4)
            r1 = r3[r0]
            r2.append(r1)
            int r0 = r0 + 1
            goto L12
        L20:
            return r2
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(char r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(double r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(float r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(int r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(long r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.Object r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.String r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.String r1, int r2, int r3) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2, r3)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.StringBuffer r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.StringBuffer r1, int r2, int r3) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2, r3)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.StringBuilder r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(java.lang.StringBuilder r1, int r2, int r3) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2, r3)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(org.apache.commons.lang3.text.StrBuilder r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(org.apache.commons.lang3.text.StrBuilder r1, int r2, int r3) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2, r3)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(boolean r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(char[] r1) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(char[] r1, int r2, int r3) {
            r0 = this;
            org.apache.commons.lang3.text.StrBuilder r1 = r0.append(r1, r2, r3)
            org.apache.commons.lang3.text.StrBuilder r1 = r1.appendNewLine()
            return r1
    }

    public java.io.Reader asReader() {
            r1 = this;
            org.apache.commons.lang3.text.StrBuilder$StrBuilderReader r0 = new org.apache.commons.lang3.text.StrBuilder$StrBuilderReader
            r0.<init>(r1)
            return r0
    }

    public org.apache.commons.lang3.text.StrTokenizer asTokenizer() {
            r1 = this;
            org.apache.commons.lang3.text.StrBuilder$StrBuilderTokenizer r0 = new org.apache.commons.lang3.text.StrBuilder$StrBuilderTokenizer
            r0.<init>(r1)
            return r0
    }

    public java.io.Writer asWriter() {
            r1 = this;
            org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter r0 = new org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ java.lang.String build() {
            r1 = this;
            java.lang.String r0 = r1.build2()
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    /* JADX INFO: renamed from: build, reason: avoid collision after fix types in other method */
    public java.lang.String build2() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    public int capacity() {
            r1 = this;
            char[] r0 = r1.buffer
            int r0 = r0.length
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.length()
            if (r2 >= r0) goto Ld
            char[] r0 = r1.buffer
            char r2 = r0[r2]
            return r2
        Ld:
            java.lang.StringIndexOutOfBoundsException r0 = new java.lang.StringIndexOutOfBoundsException
            r0.<init>(r2)
            throw r0
    }

    public org.apache.commons.lang3.text.StrBuilder clear() {
            r1 = this;
            r0 = 0
            r1.size = r0
            return r1
    }

    public boolean contains(char r5) {
            r4 = this;
            char[] r0 = r4.buffer
            r1 = 0
            r2 = r1
        L4:
            int r3 = r4.size
            if (r2 >= r3) goto L11
            char r3 = r0[r2]
            if (r3 != r5) goto Le
            r5 = 1
            return r5
        Le:
            int r2 = r2 + 1
            goto L4
        L11:
            return r1
    }

    public boolean contains(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            if (r2 < 0) goto L8
            r0 = 1
        L8:
            return r0
    }

    public boolean contains(org.apache.commons.lang3.text.StrMatcher r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            if (r2 < 0) goto L8
            r0 = 1
        L8:
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder delete(int r2, int r3) {
            r1 = this;
            int r3 = r1.validateRange(r2, r3)
            int r0 = r3 - r2
            if (r0 <= 0) goto Lb
            r1.deleteImpl(r2, r3, r0)
        Lb:
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(char r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.size
            if (r0 >= r1) goto L22
            char[] r1 = r3.buffer
            char r1 = r1[r0]
            if (r1 != r4) goto L1f
            r1 = r0
        Lc:
            int r1 = r1 + 1
            int r2 = r3.size
            if (r1 >= r2) goto L18
            char[] r2 = r3.buffer
            char r2 = r2[r1]
            if (r2 == r4) goto Lc
        L18:
            int r2 = r1 - r0
            r3.deleteImpl(r0, r1, r2)
            int r0 = r1 - r2
        L1f:
            int r0 = r0 + 1
            goto L1
        L22:
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(java.lang.String r4) {
            r3 = this;
            int r0 = org.apache.commons.lang3.StringUtils.length(r4)
            if (r0 <= 0) goto L17
            r1 = 0
            int r1 = r3.indexOf(r4, r1)
        Lb:
            if (r1 < 0) goto L17
            int r2 = r1 + r0
            r3.deleteImpl(r1, r2, r0)
            int r1 = r3.indexOf(r4, r1)
            goto Lb
        L17:
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(org.apache.commons.lang3.text.StrMatcher r7) {
            r6 = this;
            int r4 = r6.size
            r5 = -1
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.apache.commons.lang3.text.StrBuilder r7 = r0.replace(r1, r2, r3, r4, r5)
            return r7
    }

    public org.apache.commons.lang3.text.StrBuilder deleteCharAt(int r3) {
            r2 = this;
            if (r3 < 0) goto Ld
            int r0 = r2.size
            if (r3 >= r0) goto Ld
            int r0 = r3 + 1
            r1 = 1
            r2.deleteImpl(r3, r0, r1)
            return r2
        Ld:
            java.lang.StringIndexOutOfBoundsException r0 = new java.lang.StringIndexOutOfBoundsException
            r0.<init>(r3)
            throw r0
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(char r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.size
            if (r0 >= r1) goto L15
            char[] r1 = r2.buffer
            char r1 = r1[r0]
            if (r1 != r3) goto L12
            int r3 = r0 + 1
            r1 = 1
            r2.deleteImpl(r0, r3, r1)
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            return r2
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(java.lang.String r3) {
            r2 = this;
            int r0 = org.apache.commons.lang3.StringUtils.length(r3)
            if (r0 <= 0) goto L12
            r1 = 0
            int r3 = r2.indexOf(r3, r1)
            if (r3 < 0) goto L12
            int r1 = r3 + r0
            r2.deleteImpl(r3, r1, r0)
        L12:
            return r2
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(org.apache.commons.lang3.text.StrMatcher r7) {
            r6 = this;
            int r4 = r6.size
            r5 = 1
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.apache.commons.lang3.text.StrBuilder r7 = r0.replace(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean endsWith(java.lang.String r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r8.length()
            r2 = 1
            if (r1 != 0) goto Lc
            return r2
        Lc:
            int r3 = r7.size
            if (r1 <= r3) goto L11
            return r0
        L11:
            int r3 = r3 - r1
            r4 = r0
        L13:
            if (r4 >= r1) goto L25
            char[] r5 = r7.buffer
            char r5 = r5[r3]
            char r6 = r8.charAt(r4)
            if (r5 == r6) goto L20
            return r0
        L20:
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L13
        L25:
            return r2
    }

    public org.apache.commons.lang3.text.StrBuilder ensureCapacity(int r4) {
            r3 = this;
            char[] r0 = r3.buffer
            int r1 = r0.length
            if (r4 <= r1) goto L15
            int r1 = r3.size
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda4 r2 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda4
            r2.<init>(r4)
            r4 = 0
            java.lang.Object r4 = org.apache.commons.lang3.ArrayUtils.arraycopy(r0, r4, r4, r1, r2)
            char[] r4 = (char[]) r4
            r3.buffer = r4
        L15:
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.apache.commons.lang3.text.StrBuilder
            if (r0 == 0) goto Le
            org.apache.commons.lang3.text.StrBuilder r2 = (org.apache.commons.lang3.text.StrBuilder) r2
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public boolean equals(org.apache.commons.lang3.text.StrBuilder r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 != 0) goto L8
            return r1
        L8:
            int r2 = r6.size
            int r3 = r7.size
            if (r2 == r3) goto Lf
            return r1
        Lf:
            char[] r3 = r6.buffer
            char[] r7 = r7.buffer
            int r2 = r2 - r0
        L14:
            if (r2 < 0) goto L20
            char r4 = r3[r2]
            char r5 = r7[r2]
            if (r4 == r5) goto L1d
            return r1
        L1d:
            int r2 = r2 + (-1)
            goto L14
        L20:
            return r0
    }

    public boolean equalsIgnoreCase(org.apache.commons.lang3.text.StrBuilder r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            int r1 = r6.size
            int r2 = r7.size
            r3 = 0
            if (r1 == r2) goto Lc
            return r3
        Lc:
            char[] r2 = r6.buffer
            char[] r7 = r7.buffer
            int r1 = r1 - r0
        L11:
            if (r1 < 0) goto L27
            char r4 = r2[r1]
            char r5 = r7[r1]
            if (r4 == r5) goto L24
            char r4 = java.lang.Character.toUpperCase(r4)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L24
            return r3
        L24:
            int r1 = r1 + (-1)
            goto L11
        L27:
            return r0
    }

    public void getChars(int r2, int r3, char[] r4, int r5) {
            r1 = this;
            if (r2 < 0) goto L21
            if (r3 < 0) goto L1b
            int r0 = r1.length()
            if (r3 > r0) goto L1b
            if (r2 > r3) goto L13
            char[] r0 = r1.buffer
            int r3 = r3 - r2
            java.lang.System.arraycopy(r0, r2, r4, r5, r3)
            return
        L13:
            java.lang.StringIndexOutOfBoundsException r2 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r3 = "end < start"
            r2.<init>(r3)
            throw r2
        L1b:
            java.lang.StringIndexOutOfBoundsException r2 = new java.lang.StringIndexOutOfBoundsException
            r2.<init>(r3)
            throw r2
        L21:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
    }

    public char[] getChars(char[] r4) {
            r3 = this;
            int r0 = r3.length()
            if (r4 == 0) goto L9
            int r1 = r4.length
            if (r1 >= r0) goto Lb
        L9:
            char[] r4 = new char[r0]
        Lb:
            char[] r1 = r3.buffer
            r2 = 0
            java.lang.Object r4 = org.apache.commons.lang3.ArrayUtils.arraycopy(r1, r2, r4, r2, r0)
            char[] r4 = (char[]) r4
            return r4
    }

    public java.lang.String getNewLineText() {
            r1 = this;
            java.lang.String r0 = r1.newLine
            return r0
    }

    public java.lang.String getNullText() {
            r1 = this;
            java.lang.String r0 = r1.nullText
            return r0
    }

    public int hashCode() {
            r4 = this;
            char[] r0 = r4.buffer
            int r1 = r4.size
            int r1 = r1 + (-1)
            r2 = 0
        L7:
            if (r1 < 0) goto L11
            int r2 = r2 * 31
            char r3 = r0[r1]
            int r2 = r2 + r3
            int r1 = r1 + (-1)
            goto L7
        L11:
            return r2
    }

    public int indexOf(char r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public int indexOf(char r4, int r5) {
            r3 = this;
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = r3.size
            r1 = -1
            if (r5 < r0) goto Lb
            return r1
        Lb:
            char[] r0 = r3.buffer
        Ld:
            int r2 = r3.size
            if (r5 >= r2) goto L19
            char r2 = r0[r5]
            if (r2 != r4) goto L16
            return r5
        L16:
            int r5 = r5 + 1
            goto Ld
        L19:
            return r1
    }

    public int indexOf(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public int indexOf(java.lang.String r1, int r2) {
            r0 = this;
            int r1 = org.apache.commons.lang3.StringUtils.indexOf(r0, r1, r2)
            return r1
    }

    public int indexOf(org.apache.commons.lang3.text.StrMatcher r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public int indexOf(org.apache.commons.lang3.text.StrMatcher r6, int r7) {
            r5 = this;
            r0 = 0
            int r7 = java.lang.Math.max(r7, r0)
            r0 = -1
            if (r6 == 0) goto L1c
            int r1 = r5.size
            if (r7 < r1) goto Ld
            goto L1c
        Ld:
            char[] r2 = r5.buffer
            r3 = r7
        L10:
            if (r3 >= r1) goto L1c
            int r4 = r6.isMatch(r2, r3, r7, r1)
            if (r4 <= 0) goto L19
            return r3
        L19:
            int r3 = r3 + 1
            goto L10
        L1c:
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r4, char r5) {
            r3 = this;
            r3.validateIndex(r4)
            int r0 = r3.size
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            char[] r0 = r3.buffer
            int r1 = r4 + 1
            int r2 = r3.size
            int r2 = r2 - r4
            java.lang.System.arraycopy(r0, r4, r0, r1, r2)
            char[] r0 = r3.buffer
            r0[r4] = r5
            int r4 = r3.size
            int r4 = r4 + 1
            r3.size = r4
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r1, double r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.insert(r1, r2)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r1, float r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.insert(r1, r2)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r1, int r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.insert(r1, r2)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r1, long r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            org.apache.commons.lang3.text.StrBuilder r1 = r0.insert(r1, r2)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r1, java.lang.Object r2) {
            r0 = this;
            if (r2 != 0) goto L9
            java.lang.String r2 = r0.nullText
            org.apache.commons.lang3.text.StrBuilder r1 = r0.insert(r1, r2)
            return r1
        L9:
            java.lang.String r2 = r2.toString()
            org.apache.commons.lang3.text.StrBuilder r1 = r0.insert(r1, r2)
            return r1
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r6, java.lang.String r7) {
            r5 = this;
            r5.validateIndex(r6)
            if (r7 != 0) goto L7
            java.lang.String r7 = r5.nullText
        L7:
            if (r7 == 0) goto L27
            int r0 = r7.length()
            if (r0 <= 0) goto L27
            int r1 = r5.size
            int r1 = r1 + r0
            r5.ensureCapacity(r1)
            char[] r2 = r5.buffer
            int r3 = r6 + r0
            int r4 = r5.size
            int r4 = r4 - r6
            java.lang.System.arraycopy(r2, r6, r2, r3, r4)
            r5.size = r1
            r1 = 0
            char[] r2 = r5.buffer
            r7.getChars(r1, r0, r2, r6)
        L27:
            return r5
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r5, boolean r6) {
            r4 = this;
            r4.validateIndex(r5)
            r0 = 101(0x65, float:1.42E-43)
            if (r6 == 0) goto L35
            int r6 = r4.size
            int r6 = r6 + 4
            r4.ensureCapacity(r6)
            char[] r6 = r4.buffer
            int r1 = r5 + 4
            int r2 = r4.size
            int r2 = r2 - r5
            java.lang.System.arraycopy(r6, r5, r6, r1, r2)
            char[] r6 = r4.buffer
            int r1 = r5 + 1
            r2 = 116(0x74, float:1.63E-43)
            r6[r5] = r2
            int r2 = r5 + 2
            r3 = 114(0x72, float:1.6E-43)
            r6[r1] = r3
            int r5 = r5 + 3
            r1 = 117(0x75, float:1.64E-43)
            r6[r2] = r1
            r6[r5] = r0
            int r5 = r4.size
            int r5 = r5 + 4
            r4.size = r5
            goto L68
        L35:
            int r6 = r4.size
            int r6 = r6 + 5
            r4.ensureCapacity(r6)
            char[] r6 = r4.buffer
            int r1 = r5 + 5
            int r2 = r4.size
            int r2 = r2 - r5
            java.lang.System.arraycopy(r6, r5, r6, r1, r2)
            char[] r6 = r4.buffer
            int r1 = r5 + 1
            r2 = 102(0x66, float:1.43E-43)
            r6[r5] = r2
            int r2 = r5 + 2
            r3 = 97
            r6[r1] = r3
            int r1 = r5 + 3
            r3 = 108(0x6c, float:1.51E-43)
            r6[r2] = r3
            int r5 = r5 + 4
            r2 = 115(0x73, float:1.61E-43)
            r6[r1] = r2
            r6[r5] = r0
            int r5 = r4.size
            int r5 = r5 + 5
            r4.size = r5
        L68:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r5, char[] r6) {
            r4 = this;
            r4.validateIndex(r5)
            if (r6 != 0) goto Lc
            java.lang.String r6 = r4.nullText
            org.apache.commons.lang3.text.StrBuilder r5 = r4.insert(r5, r6)
            return r5
        Lc:
            int r0 = r6.length
            if (r0 <= 0) goto L2a
            int r1 = r4.size
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            char[] r1 = r4.buffer
            int r2 = r5 + r0
            int r3 = r4.size
            int r3 = r3 - r5
            java.lang.System.arraycopy(r1, r5, r1, r2, r3)
            r1 = 0
            char[] r2 = r4.buffer
            java.lang.System.arraycopy(r6, r1, r2, r5, r0)
            int r5 = r4.size
            int r5 = r5 + r0
            r4.size = r5
        L2a:
            return r4
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int r4, char[] r5, int r6, int r7) {
            r3 = this;
            r3.validateIndex(r4)
            if (r5 != 0) goto Lc
            java.lang.String r5 = r3.nullText
            org.apache.commons.lang3.text.StrBuilder r4 = r3.insert(r4, r5)
            return r4
        Lc:
            if (r6 < 0) goto L4a
            int r0 = r5.length
            if (r6 > r0) goto L4a
            if (r7 < 0) goto L35
            int r0 = r6 + r7
            int r1 = r5.length
            if (r0 > r1) goto L35
            if (r7 <= 0) goto L34
            int r0 = r3.size
            int r0 = r0 + r7
            r3.ensureCapacity(r0)
            char[] r0 = r3.buffer
            int r1 = r4 + r7
            int r2 = r3.size
            int r2 = r2 - r4
            java.lang.System.arraycopy(r0, r4, r0, r1, r2)
            char[] r0 = r3.buffer
            java.lang.System.arraycopy(r5, r6, r0, r4, r7)
            int r4 = r3.size
            int r4 = r4 + r7
            r3.size = r4
        L34:
            return r3
        L35:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid length: "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4a:
            java.lang.StringIndexOutOfBoundsException r4 = new java.lang.StringIndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Invalid offset: "
            r5.<init>(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isNotEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: lambda$minimizeCapacity$1$org-apache-commons-lang3-text-StrBuilder, reason: not valid java name */
    /* synthetic */ char[] m2675x4aa5ba69() {
            r1 = this;
            int r0 = r1.length()
            char[] r0 = new char[r0]
            return r0
    }

    public int lastIndexOf(char r2) {
            r1 = this;
            int r0 = r1.size
            int r0 = r0 + (-1)
            int r2 = r1.lastIndexOf(r2, r0)
            return r2
    }

    public int lastIndexOf(char r3, int r4) {
            r2 = this;
            int r0 = r2.size
            if (r4 < r0) goto L6
            int r4 = r0 + (-1)
        L6:
            r0 = -1
            if (r4 >= 0) goto La
            return r0
        La:
            if (r4 < 0) goto L16
            char[] r1 = r2.buffer
            char r1 = r1[r4]
            if (r1 != r3) goto L13
            return r4
        L13:
            int r4 = r4 + (-1)
            goto La
        L16:
            return r0
    }

    public int lastIndexOf(java.lang.String r2) {
            r1 = this;
            int r0 = r1.size
            int r0 = r0 + (-1)
            int r2 = r1.lastIndexOf(r2, r0)
            return r2
    }

    public int lastIndexOf(java.lang.String r1, int r2) {
            r0 = this;
            int r1 = org.apache.commons.lang3.StringUtils.lastIndexOf(r0, r1, r2)
            return r1
    }

    public int lastIndexOf(org.apache.commons.lang3.text.StrMatcher r2) {
            r1 = this;
            int r0 = r1.size
            int r2 = r1.lastIndexOf(r2, r0)
            return r2
    }

    public int lastIndexOf(org.apache.commons.lang3.text.StrMatcher r5, int r6) {
            r4 = this;
            int r0 = r4.size
            if (r6 < r0) goto L6
            int r6 = r0 + (-1)
        L6:
            r0 = -1
            if (r5 == 0) goto L1d
            if (r6 >= 0) goto Lc
            goto L1d
        Lc:
            char[] r1 = r4.buffer
            int r2 = r6 + 1
        L10:
            if (r6 < 0) goto L1d
            r3 = 0
            int r3 = r5.isMatch(r1, r6, r3, r2)
            if (r3 <= 0) goto L1a
            return r6
        L1a:
            int r6 = r6 + (-1)
            goto L10
        L1d:
            return r0
    }

    public java.lang.String leftString(int r4) {
            r3 = this;
            if (r4 > 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            int r0 = r3.size
            r1 = 0
            if (r4 < r0) goto L14
            java.lang.String r4 = new java.lang.String
            char[] r0 = r3.buffer
            int r2 = r3.size
            r4.<init>(r0, r1, r2)
            return r4
        L14:
            java.lang.String r0 = new java.lang.String
            char[] r2 = r3.buffer
            r0.<init>(r2, r1, r4)
            return r0
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public java.lang.String midString(int r3, int r4) {
            r2 = this;
            if (r3 >= 0) goto L3
            r3 = 0
        L3:
            if (r4 <= 0) goto L21
            int r0 = r2.size
            if (r3 < r0) goto La
            goto L21
        La:
            int r1 = r3 + r4
            if (r0 > r1) goto L19
            java.lang.String r4 = new java.lang.String
            char[] r0 = r2.buffer
            int r1 = r2.size
            int r1 = r1 - r3
            r4.<init>(r0, r3, r1)
            return r4
        L19:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.buffer
            r0.<init>(r1, r3, r4)
            return r0
        L21:
            java.lang.String r3 = ""
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder minimizeCapacity() {
            r4 = this;
            char[] r0 = r4.buffer
            int r0 = r0.length
            int r1 = r4.length()
            if (r0 <= r1) goto L1b
            char[] r0 = r4.buffer
            int r1 = r4.size
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda0 r2 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda0
            r2.<init>(r4)
            r3 = 0
            java.lang.Object r0 = org.apache.commons.lang3.ArrayUtils.arraycopy(r0, r3, r3, r1, r2)
            char[] r0 = (char[]) r0
            r4.buffer = r0
        L1b:
            return r4
    }

    public int readFrom(java.lang.Readable r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.size
            boolean r1 = r6 instanceof java.io.Reader
            r2 = -1
            if (r1 == 0) goto L25
            java.io.Reader r6 = (java.io.Reader) r6
            int r1 = r0 + 1
            r5.ensureCapacity(r1)
        Le:
            char[] r1 = r5.buffer
            int r3 = r5.size
            int r4 = r1.length
            int r4 = r4 - r3
            int r1 = r6.read(r1, r3, r4)
            if (r1 == r2) goto L59
            int r3 = r5.size
            int r3 = r3 + r1
            r5.size = r3
            int r3 = r3 + 1
            r5.ensureCapacity(r3)
            goto Le
        L25:
            boolean r1 = r6 instanceof java.nio.CharBuffer
            if (r1 == 0) goto L42
            java.nio.CharBuffer r6 = (java.nio.CharBuffer) r6
            int r1 = r6.remaining()
            int r2 = r5.size
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            char[] r2 = r5.buffer
            int r3 = r5.size
            r6.get(r2, r3, r1)
            int r6 = r5.size
            int r6 = r6 + r1
            r5.size = r6
            goto L59
        L42:
            int r1 = r5.size
            int r1 = r1 + 1
            r5.ensureCapacity(r1)
            char[] r1 = r5.buffer
            int r3 = r5.size
            int r4 = r1.length
            int r4 = r4 - r3
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1, r3, r4)
            int r1 = r6.read(r1)
            if (r1 != r2) goto L5d
        L59:
            int r6 = r5.size
            int r6 = r6 - r0
            return r6
        L5d:
            int r3 = r5.size
            int r3 = r3 + r1
            r5.size = r3
            goto L42
    }

    public org.apache.commons.lang3.text.StrBuilder replace(int r7, int r8, java.lang.String r9) {
            r6 = this;
            int r2 = r6.validateRange(r7, r8)
            int r5 = org.apache.commons.lang3.StringUtils.length(r9)
            int r3 = r2 - r7
            r0 = r6
            r1 = r7
            r4 = r9
            r0.replaceImpl(r1, r2, r3, r4, r5)
            return r6
    }

    public org.apache.commons.lang3.text.StrBuilder replace(org.apache.commons.lang3.text.StrMatcher r7, java.lang.String r8, int r9, int r10, int r11) {
            r6 = this;
            int r4 = r6.validateRange(r9, r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            org.apache.commons.lang3.text.StrBuilder r7 = r0.replaceImpl(r1, r2, r3, r4, r5)
            return r7
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(char r4, char r5) {
            r3 = this;
            if (r4 == r5) goto L12
            r0 = 0
        L3:
            int r1 = r3.size
            if (r0 >= r1) goto L12
            char[] r1 = r3.buffer
            char r2 = r1[r0]
            if (r2 != r4) goto Lf
            r1[r0] = r5
        Lf:
            int r0 = r0 + 1
            goto L3
        L12:
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(java.lang.String r10, java.lang.String r11) {
            r9 = this;
            int r6 = org.apache.commons.lang3.StringUtils.length(r10)
            if (r6 <= 0) goto L22
            int r7 = org.apache.commons.lang3.StringUtils.length(r11)
            r0 = 0
            int r0 = r9.indexOf(r10, r0)
            r8 = r0
        L10:
            if (r8 < 0) goto L22
            int r2 = r8 + r6
            r0 = r9
            r1 = r8
            r3 = r6
            r4 = r11
            r5 = r7
            r0.replaceImpl(r1, r2, r3, r4, r5)
            int r8 = r8 + r7
            int r8 = r9.indexOf(r10, r8)
            goto L10
        L22:
            return r9
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(org.apache.commons.lang3.text.StrMatcher r7, java.lang.String r8) {
            r6 = this;
            int r4 = r6.size
            r5 = -1
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.apache.commons.lang3.text.StrBuilder r7 = r0.replace(r1, r2, r3, r4, r5)
            return r7
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(char r4, char r5) {
            r3 = this;
            if (r4 == r5) goto L13
            r0 = 0
        L3:
            int r1 = r3.size
            if (r0 >= r1) goto L13
            char[] r1 = r3.buffer
            char r2 = r1[r0]
            if (r2 != r4) goto L10
            r1[r0] = r5
            goto L13
        L10:
            int r0 = r0 + 1
            goto L3
        L13:
            return r3
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            int r3 = org.apache.commons.lang3.StringUtils.length(r7)
            if (r3 <= 0) goto L18
            r0 = 0
            int r1 = r6.indexOf(r7, r0)
            if (r1 < 0) goto L18
            int r5 = org.apache.commons.lang3.StringUtils.length(r8)
            int r2 = r1 + r3
            r0 = r6
            r4 = r8
            r0.replaceImpl(r1, r2, r3, r4, r5)
        L18:
            return r6
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(org.apache.commons.lang3.text.StrMatcher r7, java.lang.String r8) {
            r6 = this;
            int r4 = r6.size
            r5 = 1
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.apache.commons.lang3.text.StrBuilder r7 = r0.replace(r1, r2, r3, r4, r5)
            return r7
    }

    public org.apache.commons.lang3.text.StrBuilder reverse() {
            r6 = this;
            int r0 = r6.size
            if (r0 != 0) goto L5
            return r6
        L5:
            int r1 = r0 / 2
            char[] r2 = r6.buffer
            int r0 = r0 + (-1)
            r3 = 0
        Lc:
            if (r3 >= r1) goto L1b
            char r4 = r2[r3]
            char r5 = r2[r0]
            r2[r3] = r5
            r2[r0] = r4
            int r3 = r3 + 1
            int r0 = r0 + (-1)
            goto Lc
        L1b:
            return r6
    }

    public java.lang.String rightString(int r4) {
            r3 = this;
            if (r4 > 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            int r0 = r3.size
            if (r4 < r0) goto L14
            java.lang.String r4 = new java.lang.String
            char[] r0 = r3.buffer
            r1 = 0
            int r2 = r3.size
            r4.<init>(r0, r1, r2)
            return r4
        L14:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.buffer
            int r2 = r3.size
            int r2 = r2 - r4
            r0.<init>(r1, r2, r4)
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder setCharAt(int r2, char r3) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.length()
            if (r2 >= r0) goto Ld
            char[] r0 = r1.buffer
            r0[r2] = r3
            return r1
        Ld:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
    }

    public org.apache.commons.lang3.text.StrBuilder setLength(int r4) {
            r3 = this;
            if (r4 < 0) goto L1d
            int r0 = r3.size
            if (r4 >= r0) goto L9
            r3.size = r4
            goto L1c
        L9:
            if (r4 <= r0) goto L1c
            r3.ensureCapacity(r4)
            int r0 = r3.size
            r3.size = r4
        L12:
            if (r0 >= r4) goto L1c
            char[] r1 = r3.buffer
            r2 = 0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L12
        L1c:
            return r3
        L1d:
            java.lang.StringIndexOutOfBoundsException r0 = new java.lang.StringIndexOutOfBoundsException
            r0.<init>(r4)
            throw r0
    }

    public org.apache.commons.lang3.text.StrBuilder setNewLineText(java.lang.String r1) {
            r0 = this;
            r0.newLine = r1
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder setNullText(java.lang.String r2) {
            r1 = this;
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            r2 = 0
        L7:
            r1.nullText = r2
            return r1
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public boolean startsWith(java.lang.String r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = r7.length()
            r2 = 1
            if (r1 != 0) goto Lc
            return r2
        Lc:
            int r3 = r6.size
            if (r1 <= r3) goto L11
            return r0
        L11:
            r3 = r0
        L12:
            if (r3 >= r1) goto L22
            char[] r4 = r6.buffer
            char r4 = r4[r3]
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L1f
            return r0
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            return r2
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L1a
            int r0 = r1.size
            if (r3 > r0) goto L14
            if (r2 > r3) goto Ld
            java.lang.String r2 = r1.substring(r2, r3)
            return r2
        Ld:
            java.lang.StringIndexOutOfBoundsException r0 = new java.lang.StringIndexOutOfBoundsException
            int r3 = r3 - r2
            r0.<init>(r3)
            throw r0
        L14:
            java.lang.StringIndexOutOfBoundsException r2 = new java.lang.StringIndexOutOfBoundsException
            r2.<init>(r3)
            throw r2
        L1a:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
    }

    public java.lang.String substring(int r2) {
            r1 = this;
            int r0 = r1.size
            java.lang.String r2 = r1.substring(r2, r0)
            return r2
    }

    public java.lang.String substring(int r3, int r4) {
            r2 = this;
            int r4 = r2.validateRange(r3, r4)
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.buffer
            int r4 = r4 - r3
            r0.<init>(r1, r3, r4)
            return r0
    }

    public char[] toCharArray() {
            r4 = this;
            int r0 = r4.size
            if (r0 != 0) goto L7
            char[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY
            return r0
        L7:
            char[] r1 = r4.buffer
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda5 r2 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda5
            r2.<init>()
            r3 = 0
            java.lang.Object r0 = org.apache.commons.lang3.ArrayUtils.arraycopy(r1, r3, r3, r0, r2)
            char[] r0 = (char[]) r0
            return r0
    }

    public char[] toCharArray(int r4, int r5) {
            r3 = this;
            int r5 = r3.validateRange(r4, r5)
            int r5 = r5 - r4
            if (r5 != 0) goto La
            char[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY
            return r4
        La:
            char[] r0 = r3.buffer
            org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda1 r1 = new org.apache.commons.lang3.text.StrBuilder$$ExternalSyntheticLambda1
            r1.<init>()
            r2 = 0
            java.lang.Object r4 = org.apache.commons.lang3.ArrayUtils.arraycopy(r0, r4, r2, r5, r1)
            char[] r4 = (char[]) r4
            return r4
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buffer
            r2 = 0
            int r3 = r4.size
            r0.<init>(r1, r2, r3)
            return r0
    }

    public java.lang.StringBuffer toStringBuffer() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r4.size
            r0.<init>(r1)
            char[] r1 = r4.buffer
            r2 = 0
            int r3 = r4.size
            java.lang.StringBuffer r0 = r0.append(r1, r2, r3)
            return r0
    }

    public java.lang.StringBuilder toStringBuilder() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.size
            r0.<init>(r1)
            char[] r1 = r4.buffer
            r2 = 0
            int r3 = r4.size
            java.lang.StringBuilder r0 = r0.append(r1, r2, r3)
            return r0
    }

    public org.apache.commons.lang3.text.StrBuilder trim() {
            r6 = this;
            int r0 = r6.size
            if (r0 != 0) goto L5
            return r6
        L5:
            char[] r1 = r6.buffer
            r2 = 0
            r3 = r2
        L9:
            r4 = 32
            if (r3 >= r0) goto L14
            char r5 = r1[r3]
            if (r5 > r4) goto L14
            int r3 = r3 + 1
            goto L9
        L14:
            if (r3 >= r0) goto L1f
            int r5 = r0 + (-1)
            char r5 = r1[r5]
            if (r5 > r4) goto L1f
            int r0 = r0 + (-1)
            goto L14
        L1f:
            int r1 = r6.size
            if (r0 >= r1) goto L26
            r6.delete(r0, r1)
        L26:
            if (r3 <= 0) goto L2b
            r6.delete(r2, r3)
        L2b:
            return r6
    }

    protected void validateIndex(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.size
            if (r2 > r0) goto L7
            return
        L7:
            java.lang.StringIndexOutOfBoundsException r0 = new java.lang.StringIndexOutOfBoundsException
            r0.<init>(r2)
            throw r0
    }

    protected int validateRange(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L12
            int r0 = r1.size
            if (r3 <= r0) goto L7
            r3 = r0
        L7:
            if (r2 > r3) goto La
            return r3
        La:
            java.lang.StringIndexOutOfBoundsException r2 = new java.lang.StringIndexOutOfBoundsException
            java.lang.String r3 = "end < start"
            r2.<init>(r3)
            throw r2
        L12:
            java.lang.StringIndexOutOfBoundsException r3 = new java.lang.StringIndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
    }
}
