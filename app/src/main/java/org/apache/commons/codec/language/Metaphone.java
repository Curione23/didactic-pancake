package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class Metaphone implements org.apache.commons.codec.StringEncoder {
    private static final java.lang.String FRONTV = "EIY";
    private static final java.lang.String VARSON = "CSPTG";
    private static final java.lang.String VOWELS = "AEIOU";
    private int maxCodeLen;

    public Metaphone() {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.maxCodeLen = r0
            return
    }

    private boolean isLastChar(int r2, int r3) {
            r1 = this;
            r0 = 1
            int r3 = r3 + r0
            if (r3 != r2) goto L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    private boolean isNextChar(java.lang.StringBuilder r4, int r5, char r6) {
            r3 = this;
            r0 = 0
            if (r5 < 0) goto L13
            int r1 = r4.length()
            r2 = 1
            int r1 = r1 - r2
            if (r5 >= r1) goto L13
            int r5 = r5 + r2
            char r4 = r4.charAt(r5)
            if (r4 != r6) goto L13
            r0 = r2
        L13:
            return r0
    }

    private boolean isPreviousChar(java.lang.StringBuilder r3, int r4, char r5) {
            r2 = this;
            r0 = 0
            if (r4 <= 0) goto L12
            int r1 = r3.length()
            if (r4 >= r1) goto L12
            r1 = 1
            int r4 = r4 - r1
            char r3 = r3.charAt(r4)
            if (r3 != r5) goto L12
            r0 = r1
        L12:
            return r0
    }

    private boolean isVowel(java.lang.StringBuilder r2, int r3) {
            r1 = this;
            java.lang.String r0 = "AEIOU"
            char r2 = r2.charAt(r3)
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private boolean regionMatch(java.lang.StringBuilder r3, int r4, java.lang.String r5) {
            r2 = this;
            if (r4 < 0) goto L1d
            int r0 = r5.length()
            int r0 = r0 + r4
            int r0 = r0 + (-1)
            int r1 = r3.length()
            if (r0 >= r1) goto L1d
            int r0 = r5.length()
            int r0 = r0 + r4
            java.lang.String r3 = r3.substring(r4, r0)
            boolean r3 = r3.equals(r5)
            goto L1e
        L1d:
            r3 = 0
        L1e:
            return r3
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.metaphone(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "Parameter supplied to Metaphone encode is not of type java.lang.String"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.metaphone(r1)
            return r1
    }

    public int getMaxCodeLen() {
            r1 = this;
            int r0 = r1.maxCodeLen
            return r0
    }

    public boolean isMetaphoneEqual(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r0.metaphone(r1)
            java.lang.String r2 = r0.metaphone(r2)
            boolean r1 = r1.equals(r2)
            return r1
    }

    public java.lang.String metaphone(java.lang.String r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            if (r1 == 0) goto L2a7
            int r2 = r17.length()
            if (r2 != 0) goto Le
            goto L2a7
        Le:
            r3 = 1
            if (r2 != r3) goto L18
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r2)
            return r1
        L18:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r2)
            char[] r1 = r1.toCharArray()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 40
            r2.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 10
            r4.<init>(r5)
            r5 = 0
            char r6 = r1[r5]
            r7 = 65
            r8 = 71
            r9 = 88
            r10 = 75
            r11 = 72
            r12 = 83
            if (r6 == r7) goto L84
            if (r6 == r8) goto L74
            if (r6 == r10) goto L74
            r7 = 80
            if (r6 == r7) goto L74
            r7 = 87
            if (r6 == r7) goto L59
            if (r6 == r9) goto L53
            r2.append(r1)
            goto L93
        L53:
            r1[r5] = r12
            r2.append(r1)
            goto L93
        L59:
            char r6 = r1[r3]
            r13 = 82
            if (r6 != r13) goto L65
            int r6 = r1.length
            int r6 = r6 - r3
            r2.append(r1, r3, r6)
            goto L93
        L65:
            if (r6 != r11) goto L70
            int r6 = r1.length
            int r6 = r6 - r3
            r2.append(r1, r3, r6)
            r2.setCharAt(r5, r7)
            goto L93
        L70:
            r2.append(r1)
            goto L93
        L74:
            char r6 = r1[r3]
            r7 = 78
            if (r6 != r7) goto L80
            int r6 = r1.length
            int r6 = r6 - r3
            r2.append(r1, r3, r6)
            goto L93
        L80:
            r2.append(r1)
            goto L93
        L84:
            char r6 = r1[r3]
            r7 = 69
            if (r6 != r7) goto L90
            int r6 = r1.length
            int r6 = r6 - r3
            r2.append(r1, r3, r6)
            goto L93
        L90:
            r2.append(r1)
        L93:
            int r1 = r2.length()
        L97:
            int r6 = r4.length()
            int r7 = r16.getMaxCodeLen()
            if (r6 >= r7) goto L2a2
            if (r5 >= r1) goto L2a2
            char r6 = r2.charAt(r5)
            r7 = 67
            if (r6 == r7) goto Lb3
            boolean r13 = r0.isPreviousChar(r2, r5, r6)
            if (r13 == 0) goto Lb3
            goto L28d
        Lb3:
            r13 = 74
            r14 = 84
            r15 = 70
            java.lang.String r3 = "EIY"
            switch(r6) {
                case 65: goto L288;
                case 66: goto L275;
                case 67: goto L20e;
                case 68: goto L1e9;
                case 69: goto L288;
                case 70: goto L1e4;
                case 71: goto L18a;
                case 72: goto L163;
                case 73: goto L288;
                case 74: goto L1e4;
                case 75: goto L151;
                case 76: goto L1e4;
                case 77: goto L1e4;
                case 78: goto L1e4;
                case 79: goto L288;
                case 80: goto L141;
                case 81: goto L13c;
                case 82: goto L1e4;
                case 83: goto L119;
                case 84: goto Le5;
                case 85: goto L288;
                case 86: goto Le0;
                case 87: goto Lcd;
                case 88: goto Lc5;
                case 89: goto Lcd;
                case 90: goto Lc0;
                default: goto Lbe;
            }
        Lbe:
            goto L28d
        Lc0:
            r4.append(r12)
            goto L28d
        Lc5:
            r4.append(r10)
            r4.append(r12)
            goto L28d
        Lcd:
            boolean r3 = r0.isLastChar(r1, r5)
            if (r3 != 0) goto L28d
            int r3 = r5 + 1
            boolean r3 = r0.isVowel(r2, r3)
            if (r3 == 0) goto L28d
            r4.append(r6)
            goto L28d
        Le0:
            r4.append(r15)
            goto L28d
        Le5:
            java.lang.String r3 = "TIA"
            boolean r3 = r0.regionMatch(r2, r5, r3)
            if (r3 != 0) goto L114
            java.lang.String r3 = "TIO"
            boolean r3 = r0.regionMatch(r2, r5, r3)
            if (r3 == 0) goto Lf6
            goto L114
        Lf6:
            java.lang.String r3 = "TCH"
            boolean r3 = r0.regionMatch(r2, r5, r3)
            if (r3 == 0) goto L100
            goto L28d
        L100:
            java.lang.String r3 = "TH"
            boolean r3 = r0.regionMatch(r2, r5, r3)
            if (r3 == 0) goto L10f
            r3 = 48
            r4.append(r3)
            goto L28d
        L10f:
            r4.append(r14)
            goto L28d
        L114:
            r4.append(r9)
            goto L28d
        L119:
            java.lang.String r3 = "SH"
            boolean r3 = r0.regionMatch(r2, r5, r3)
            if (r3 != 0) goto L137
            java.lang.String r3 = "SIO"
            boolean r3 = r0.regionMatch(r2, r5, r3)
            if (r3 != 0) goto L137
            java.lang.String r3 = "SIA"
            boolean r3 = r0.regionMatch(r2, r5, r3)
            if (r3 == 0) goto L132
            goto L137
        L132:
            r4.append(r12)
            goto L28d
        L137:
            r4.append(r9)
            goto L28d
        L13c:
            r4.append(r10)
            goto L28d
        L141:
            boolean r3 = r0.isNextChar(r2, r5, r11)
            if (r3 == 0) goto L14c
            r4.append(r15)
            goto L28d
        L14c:
            r4.append(r6)
            goto L28d
        L151:
            if (r5 <= 0) goto L15e
            boolean r3 = r0.isPreviousChar(r2, r5, r7)
            if (r3 != 0) goto L28d
            r4.append(r6)
            goto L28d
        L15e:
            r4.append(r6)
            goto L28d
        L163:
            boolean r3 = r0.isLastChar(r1, r5)
            if (r3 == 0) goto L16b
            goto L28d
        L16b:
            if (r5 <= 0) goto L17d
            int r3 = r5 + (-1)
            char r3 = r2.charAt(r3)
            java.lang.String r6 = "CSPTG"
            int r3 = r6.indexOf(r3)
            if (r3 < 0) goto L17d
            goto L28d
        L17d:
            int r3 = r5 + 1
            boolean r3 = r0.isVowel(r2, r3)
            if (r3 == 0) goto L28d
            r4.append(r11)
            goto L28d
        L18a:
            int r6 = r5 + 1
            boolean r7 = r0.isLastChar(r1, r6)
            if (r7 == 0) goto L19a
            boolean r7 = r0.isNextChar(r2, r5, r11)
            if (r7 == 0) goto L19a
            goto L28d
        L19a:
            boolean r7 = r0.isLastChar(r1, r6)
            if (r7 != 0) goto L1b0
            boolean r7 = r0.isNextChar(r2, r5, r11)
            if (r7 == 0) goto L1b0
            int r7 = r5 + 2
            boolean r7 = r0.isVowel(r2, r7)
            if (r7 != 0) goto L1b0
            goto L28d
        L1b0:
            if (r5 <= 0) goto L1c4
            java.lang.String r7 = "GN"
            boolean r7 = r0.regionMatch(r2, r5, r7)
            if (r7 != 0) goto L28d
            java.lang.String r7 = "GNED"
            boolean r7 = r0.regionMatch(r2, r5, r7)
            if (r7 == 0) goto L1c4
            goto L28d
        L1c4:
            boolean r7 = r0.isPreviousChar(r2, r5, r8)
            boolean r14 = r0.isLastChar(r1, r5)
            if (r14 != 0) goto L1df
            char r6 = r2.charAt(r6)
            int r3 = r3.indexOf(r6)
            if (r3 < 0) goto L1df
            if (r7 != 0) goto L1df
            r4.append(r13)
            goto L28d
        L1df:
            r4.append(r10)
            goto L28d
        L1e4:
            r4.append(r6)
            goto L28d
        L1e9:
            int r6 = r5 + 1
            boolean r6 = r0.isLastChar(r1, r6)
            if (r6 != 0) goto L209
            boolean r6 = r0.isNextChar(r2, r5, r8)
            if (r6 == 0) goto L209
            int r6 = r5 + 2
            char r7 = r2.charAt(r6)
            int r3 = r3.indexOf(r7)
            if (r3 < 0) goto L209
            r4.append(r13)
            r5 = r6
            goto L28d
        L209:
            r4.append(r14)
            goto L28d
        L20e:
            boolean r6 = r0.isPreviousChar(r2, r5, r12)
            if (r6 == 0) goto L228
            boolean r6 = r0.isLastChar(r1, r5)
            if (r6 != 0) goto L228
            int r6 = r5 + 1
            char r6 = r2.charAt(r6)
            int r6 = r3.indexOf(r6)
            if (r6 < 0) goto L228
            goto L28d
        L228:
            java.lang.String r6 = "CIA"
            boolean r6 = r0.regionMatch(r2, r5, r6)
            if (r6 == 0) goto L234
            r4.append(r9)
            goto L28d
        L234:
            boolean r6 = r0.isLastChar(r1, r5)
            if (r6 != 0) goto L24a
            int r6 = r5 + 1
            char r6 = r2.charAt(r6)
            int r3 = r3.indexOf(r6)
            if (r3 < 0) goto L24a
            r4.append(r12)
            goto L28d
        L24a:
            boolean r3 = r0.isPreviousChar(r2, r5, r12)
            if (r3 == 0) goto L25a
            boolean r3 = r0.isNextChar(r2, r5, r11)
            if (r3 == 0) goto L25a
            r4.append(r10)
            goto L28d
        L25a:
            boolean r3 = r0.isNextChar(r2, r5, r11)
            if (r3 == 0) goto L271
            if (r5 != 0) goto L26d
            r3 = 3
            if (r1 < r3) goto L26d
            r3 = 2
            boolean r3 = r0.isVowel(r2, r3)
            if (r3 == 0) goto L26d
            goto L271
        L26d:
            r4.append(r9)
            goto L28d
        L271:
            r4.append(r10)
            goto L28d
        L275:
            r3 = 77
            boolean r3 = r0.isPreviousChar(r2, r5, r3)
            if (r3 == 0) goto L284
            boolean r3 = r0.isLastChar(r1, r5)
            if (r3 == 0) goto L284
            goto L28d
        L284:
            r4.append(r6)
            goto L28d
        L288:
            if (r5 != 0) goto L28d
            r4.append(r6)
        L28d:
            r3 = 1
            int r5 = r5 + r3
            int r6 = r4.length()
            int r7 = r16.getMaxCodeLen()
            if (r6 <= r7) goto L97
            int r6 = r16.getMaxCodeLen()
            r4.setLength(r6)
            goto L97
        L2a2:
            java.lang.String r1 = r4.toString()
            return r1
        L2a7:
            java.lang.String r1 = ""
            return r1
    }

    public void setMaxCodeLen(int r1) {
            r0 = this;
            r0.maxCodeLen = r1
            return
    }
}
