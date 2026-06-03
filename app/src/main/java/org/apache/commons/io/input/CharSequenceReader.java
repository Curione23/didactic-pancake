package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class CharSequenceReader extends java.io.Reader implements java.io.Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    private final java.lang.CharSequence charSequence;
    private final java.lang.Integer end;
    private int idx;
    private int mark;
    private final int start;

    public CharSequenceReader(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CharSequenceReader(java.lang.CharSequence r2, int r3) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r0)
            return
    }

    public CharSequenceReader(java.lang.CharSequence r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            if (r4 < 0) goto L3a
            if (r5 < r4) goto L1b
            if (r3 == 0) goto La
            goto Lc
        La:
            java.lang.String r3 = ""
        Lc:
            r2.charSequence = r3
            r2.start = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.end = r3
            r2.idx = r4
            r2.mark = r4
            return
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End index is less than start "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Start index is less than zero: "
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private int end() {
            r2 = this;
            java.lang.CharSequence r0 = r2.charSequence
            int r0 = r0.length()
            java.lang.Integer r1 = r2.end
            if (r1 != 0) goto Le
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L12
        Le:
            int r1 = r1.intValue()
        L12:
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    private int start() {
            r2 = this;
            java.lang.CharSequence r0 = r2.charSequence
            int r0 = r0.length()
            int r1 = r2.start
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            int r0 = r1.start
            r1.idx = r0
            r1.mark = r0
            return
    }

    @Override // java.io.Reader
    public void mark(int r1) {
            r0 = this;
            int r1 = r0.idx
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
            int r0 = r3.idx
            int r1 = r3.end()
            if (r0 < r1) goto La
            r0 = -1
            return r0
        La:
            java.lang.CharSequence r0 = r3.charSequence
            int r1 = r3.idx
            int r2 = r1 + 1
            r3.idx = r2
            char r0 = r0.charAt(r1)
            return r0
    }

    @Override // java.io.Reader
    public int read(char[] r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.idx
            int r1 = r5.end()
            r2 = -1
            if (r0 < r1) goto La
            return r2
        La:
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r6, r0)
            if (r8 < 0) goto L90
            if (r7 < 0) goto L90
            int r0 = r7 + r8
            int r1 = r6.length
            if (r0 > r1) goto L90
            java.lang.CharSequence r0 = r5.charSequence
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L3a
            int r0 = r5.end()
            int r1 = r5.idx
            int r0 = r0 - r1
            int r8 = java.lang.Math.min(r8, r0)
            java.lang.CharSequence r0 = r5.charSequence
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r5.idx
            int r2 = r1 + r8
            r0.getChars(r1, r2, r6, r7)
            int r6 = r5.idx
            int r6 = r6 + r8
            r5.idx = r6
            return r8
        L3a:
            boolean r1 = r0 instanceof java.lang.StringBuilder
            if (r1 == 0) goto L5a
            int r0 = r5.end()
            int r1 = r5.idx
            int r0 = r0 - r1
            int r8 = java.lang.Math.min(r8, r0)
            java.lang.CharSequence r0 = r5.charSequence
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            int r1 = r5.idx
            int r2 = r1 + r8
            r0.getChars(r1, r2, r6, r7)
            int r6 = r5.idx
            int r6 = r6 + r8
            r5.idx = r6
            return r8
        L5a:
            boolean r0 = r0 instanceof java.lang.StringBuffer
            if (r0 == 0) goto L7a
            int r0 = r5.end()
            int r1 = r5.idx
            int r0 = r0 - r1
            int r8 = java.lang.Math.min(r8, r0)
            java.lang.CharSequence r0 = r5.charSequence
            java.lang.StringBuffer r0 = (java.lang.StringBuffer) r0
            int r1 = r5.idx
            int r2 = r1 + r8
            r0.getChars(r1, r2, r6, r7)
            int r6 = r5.idx
            int r6 = r6 + r8
            r5.idx = r6
            return r8
        L7a:
            r0 = 0
            r1 = r0
        L7c:
            if (r0 >= r8) goto L8f
            int r3 = r5.read()
            if (r3 != r2) goto L85
            return r1
        L85:
            int r4 = r7 + r0
            char r3 = (char) r3
            r6[r4] = r3
            int r1 = r1 + 1
            int r0 = r0 + 1
            goto L7c
        L8f:
            return r1
        L90:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Array Size="
            r1.<init>(r2)
            int r6 = r6.length
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = ", offset="
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = ", length="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // java.io.Reader
    public boolean ready() {
            r2 = this;
            int r0 = r2.idx
            int r1 = r2.end()
            if (r0 >= r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // java.io.Reader
    public void reset() {
            r1 = this;
            int r0 = r1.mark
            r1.idx = r0
            return
    }

    @Override // java.io.Reader
    public long skip(long r5) {
            r4 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L25
            int r2 = r4.idx
            int r3 = r4.end()
            if (r2 < r3) goto Lf
            return r0
        Lf:
            int r0 = r4.end()
            long r0 = (long) r0
            int r2 = r4.idx
            long r2 = (long) r2
            long r2 = r2 + r5
            long r5 = java.lang.Math.min(r0, r2)
            int r5 = (int) r5
            int r6 = r4.idx
            int r6 = r5 - r6
            r4.idx = r5
            long r5 = (long) r6
            return r5
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number of characters to skip is less than zero: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.CharSequence r0 = r3.charSequence
            int r1 = r3.start()
            int r2 = r3.end()
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
