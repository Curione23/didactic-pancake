package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class ColognePhonetic implements org.apache.commons.codec.StringEncoder {
    private static final char[] AEIJOUY = null;
    private static final char[] AHKLOQRUX = null;
    private static final char[] AHKOQUX = null;
    private static final char CHAR_IGNORE = '-';
    private static final char[] CKQ = null;
    private static final char[] CSZ = null;
    private static final char[] DTX = null;
    private static final char[] FPVW = null;
    private static final char[] GKQ = null;
    private static final char[] SZ = null;

    static abstract class CologneBuffer {
        protected final char[] data;
        protected int length;

        public CologneBuffer(int r1) {
                r0 = this;
                r0.<init>()
                char[] r1 = new char[r1]
                r0.data = r1
                r1 = 0
                r0.length = r1
                return
        }

        public CologneBuffer(char[] r1) {
                r0 = this;
                r0.<init>()
                r0.data = r1
                int r1 = r1.length
                r0.length = r1
                return
        }

        protected abstract char[] copyData(int r1, int r2);

        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.length()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public int length() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = new java.lang.String
                r1 = 0
                int r2 = r3.length
                char[] r1 = r3.copyData(r1, r2)
                r0.<init>(r1)
                return r0
        }
    }

    private final class CologneInputBuffer extends org.apache.commons.codec.language.ColognePhonetic.CologneBuffer {
        final /* synthetic */ org.apache.commons.codec.language.ColognePhonetic this$0;

        public CologneInputBuffer(org.apache.commons.codec.language.ColognePhonetic r1, char[] r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        protected char[] copyData(int r5, int r6) {
                r4 = this;
                char[] r0 = new char[r6]
                char[] r1 = r4.data
                char[] r2 = r4.data
                int r2 = r2.length
                int r3 = r4.length
                int r2 = r2 - r3
                int r2 = r2 + r5
                r5 = 0
                java.lang.System.arraycopy(r1, r2, r0, r5, r6)
                return r0
        }

        public char getNextChar() {
                r2 = this;
                char[] r0 = r2.data
                int r1 = r2.getNextPos()
                char r0 = r0[r1]
                return r0
        }

        protected int getNextPos() {
                r2 = this;
                char[] r0 = r2.data
                int r0 = r0.length
                int r1 = r2.length
                int r0 = r0 - r1
                return r0
        }

        public char removeNext() {
                r2 = this;
                char r0 = r2.getNextChar()
                int r1 = r2.length
                int r1 = r1 + (-1)
                r2.length = r1
                return r0
        }
    }

    private final class CologneOutputBuffer extends org.apache.commons.codec.language.ColognePhonetic.CologneBuffer {
        private char lastCode;
        final /* synthetic */ org.apache.commons.codec.language.ColognePhonetic this$0;

        public CologneOutputBuffer(org.apache.commons.codec.language.ColognePhonetic r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r1 = 47
                r0.lastCode = r1
                return
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        protected char[] copyData(int r2, int r3) {
                r1 = this;
                char[] r0 = r1.data
                char[] r2 = java.util.Arrays.copyOfRange(r0, r2, r3)
                return r2
        }

        public void put(char r3) {
                r2 = this;
                r0 = 45
                if (r3 == r0) goto L1c
                char r0 = r2.lastCode
                if (r0 == r3) goto L1c
                r0 = 48
                if (r3 != r0) goto L10
                int r0 = r2.length
                if (r0 != 0) goto L1c
            L10:
                char[] r0 = r2.data
                int r1 = r2.length
                r0[r1] = r3
                int r0 = r2.length
                int r0 = r0 + 1
                r2.length = r0
            L1c:
                r2.lastCode = r3
                return
        }
    }

    static {
            r0 = 7
            char[] r1 = new char[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [65, 69, 73, 74, 79, 85, 89} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.AEIJOUY = r1
            r1 = 3
            char[] r2 = new char[r1]
            r2 = {x0052: FILL_ARRAY_DATA , data: [67, 83, 90} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.CSZ = r2
            r2 = 4
            char[] r2 = new char[r2]
            r2 = {x005a: FILL_ARRAY_DATA , data: [70, 80, 86, 87} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.FPVW = r2
            char[] r2 = new char[r1]
            r2 = {x0062: FILL_ARRAY_DATA , data: [71, 75, 81} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.GKQ = r2
            char[] r2 = new char[r1]
            r2 = {x006a: FILL_ARRAY_DATA , data: [67, 75, 81} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.CKQ = r2
            r2 = 9
            char[] r2 = new char[r2]
            r2 = {x0072: FILL_ARRAY_DATA , data: [65, 72, 75, 76, 79, 81, 82, 85, 88} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.AHKLOQRUX = r2
            r2 = 2
            char[] r2 = new char[r2]
            r2 = {x0080: FILL_ARRAY_DATA , data: [83, 90} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.SZ = r2
            char[] r0 = new char[r0]
            r0 = {x0086: FILL_ARRAY_DATA , data: [65, 72, 75, 79, 81, 85, 88} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.AHKOQUX = r0
            char[] r0 = new char[r1]
            r0 = {x0092: FILL_ARRAY_DATA , data: [68, 84, 88} // fill-array
            org.apache.commons.codec.language.ColognePhonetic.DTX = r0
            return
    }

    public ColognePhonetic() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean arrayContains(char[] r4, char r5) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto Le
            char r3 = r4[r2]
            if (r3 != r5) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    private char[] preprocess(java.lang.String r4) {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.GERMAN
            java.lang.String r4 = r4.toUpperCase(r0)
            char[] r4 = r4.toCharArray()
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L2e
            char r1 = r4[r0]
            r2 = 196(0xc4, float:2.75E-43)
            if (r1 == r2) goto L27
            r2 = 214(0xd6, float:3.0E-43)
            if (r1 == r2) goto L22
            r2 = 220(0xdc, float:3.08E-43)
            if (r1 == r2) goto L1d
            goto L2b
        L1d:
            r1 = 85
            r4[r0] = r1
            goto L2b
        L22:
            r1 = 79
            r4[r0] = r1
            goto L2b
        L27:
            r1 = 65
            r4[r0] = r1
        L2b:
            int r0 = r0 + 1
            goto Lb
        L2e:
            return r4
    }

    public java.lang.String colognePhonetic(java.lang.String r11) {
            r10 = this;
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer r0 = new org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer
            char[] r11 = r10.preprocess(r11)
            r0.<init>(r10, r11)
            org.apache.commons.codec.language.ColognePhonetic$CologneOutputBuffer r11 = new org.apache.commons.codec.language.ColognePhonetic$CologneOutputBuffer
            int r1 = r0.length()
            int r1 = r1 * 2
            r11.<init>(r10, r1)
            r1 = 45
            r2 = r1
        L1b:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L115
            char r3 = r0.removeNext()
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L30
            char r4 = r0.getNextChar()
            goto L31
        L30:
            r4 = r1
        L31:
            r5 = 65
            if (r3 < r5) goto L1b
            r5 = 90
            if (r3 <= r5) goto L3a
            goto L1b
        L3a:
            char[] r6 = org.apache.commons.codec.language.ColognePhonetic.AEIJOUY
            boolean r6 = arrayContains(r6, r3)
            if (r6 == 0) goto L49
            r2 = 48
            r11.put(r2)
            goto L112
        L49:
            r6 = 66
            if (r3 == r6) goto L10d
            r6 = 80
            r7 = 72
            if (r3 != r6) goto L57
            if (r4 == r7) goto L57
            goto L10d
        L57:
            r6 = 68
            if (r3 == r6) goto L5f
            r6 = 84
            if (r3 != r6) goto L6e
        L5f:
            char[] r6 = org.apache.commons.codec.language.ColognePhonetic.CSZ
            boolean r6 = arrayContains(r6, r4)
            if (r6 != 0) goto L6e
            r2 = 50
            r11.put(r2)
            goto L112
        L6e:
            char[] r6 = org.apache.commons.codec.language.ColognePhonetic.FPVW
            boolean r6 = arrayContains(r6, r3)
            if (r6 == 0) goto L7d
            r2 = 51
            r11.put(r2)
            goto L112
        L7d:
            char[] r6 = org.apache.commons.codec.language.ColognePhonetic.GKQ
            boolean r6 = arrayContains(r6, r3)
            r8 = 52
            if (r6 == 0) goto L8c
            r11.put(r8)
            goto L112
        L8c:
            r6 = 88
            r9 = 56
            if (r3 != r6) goto La2
            char[] r6 = org.apache.commons.codec.language.ColognePhonetic.CKQ
            boolean r6 = arrayContains(r6, r2)
            if (r6 != 0) goto La2
            r11.put(r8)
            r11.put(r9)
            goto L112
        La2:
            r6 = 83
            if (r3 == r6) goto L109
            if (r3 != r5) goto Laa
            goto L109
        Laa:
            r5 = 67
            if (r3 != r5) goto Ldd
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto Lc4
            char[] r2 = org.apache.commons.codec.language.ColognePhonetic.AHKLOQRUX
            boolean r2 = arrayContains(r2, r4)
            if (r2 == 0) goto Lc0
            r11.put(r8)
            goto L112
        Lc0:
            r11.put(r9)
            goto L112
        Lc4:
            char[] r5 = org.apache.commons.codec.language.ColognePhonetic.SZ
            boolean r2 = arrayContains(r5, r2)
            if (r2 != 0) goto Ld9
            char[] r2 = org.apache.commons.codec.language.ColognePhonetic.AHKOQUX
            boolean r2 = arrayContains(r2, r4)
            if (r2 != 0) goto Ld5
            goto Ld9
        Ld5:
            r11.put(r8)
            goto L112
        Ld9:
            r11.put(r9)
            goto L112
        Ldd:
            char[] r2 = org.apache.commons.codec.language.ColognePhonetic.DTX
            boolean r2 = arrayContains(r2, r3)
            if (r2 == 0) goto Le9
            r11.put(r9)
            goto L112
        Le9:
            if (r3 == r7) goto L105
            r2 = 82
            if (r3 == r2) goto Lff
            switch(r3) {
                case 76: goto Lf9;
                case 77: goto Lf3;
                case 78: goto Lf3;
                default: goto Lf2;
            }
        Lf2:
            goto L112
        Lf3:
            r2 = 54
            r11.put(r2)
            goto L112
        Lf9:
            r2 = 53
            r11.put(r2)
            goto L112
        Lff:
            r2 = 55
            r11.put(r2)
            goto L112
        L105:
            r11.put(r1)
            goto L112
        L109:
            r11.put(r9)
            goto L112
        L10d:
            r2 = 49
            r11.put(r2)
        L112:
            r2 = r3
            goto L1b
        L115:
            java.lang.String r11 = r11.toString()
            return r11
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r4) throws org.apache.commons.codec.EncoderException {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r3.encode(r4)
            return r4
        Lb:
            org.apache.commons.codec.EncoderException r0 = new org.apache.commons.codec.EncoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This method's parameter was expected to be of the type "
            r1.<init>(r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ". But actually it was of the type "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.colognePhonetic(r1)
            return r1
    }

    public boolean isEncodeEqual(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r0.colognePhonetic(r1)
            java.lang.String r2 = r0.colognePhonetic(r2)
            boolean r1 = r1.equals(r2)
            return r1
    }
}
