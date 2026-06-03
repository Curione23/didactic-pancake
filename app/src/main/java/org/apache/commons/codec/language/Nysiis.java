package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class Nysiis implements org.apache.commons.codec.StringEncoder {
    private static final char[] CHARS_A = null;
    private static final char[] CHARS_AF = null;
    private static final char[] CHARS_C = null;
    private static final char[] CHARS_FF = null;
    private static final char[] CHARS_G = null;
    private static final char[] CHARS_N = null;
    private static final char[] CHARS_NN = null;
    private static final char[] CHARS_S = null;
    private static final char[] CHARS_SSS = null;
    private static final java.util.regex.Pattern PAT_DT_ETC = null;
    private static final java.util.regex.Pattern PAT_EE_IE = null;
    private static final java.util.regex.Pattern PAT_K = null;
    private static final java.util.regex.Pattern PAT_KN = null;
    private static final java.util.regex.Pattern PAT_MAC = null;
    private static final java.util.regex.Pattern PAT_PH_PF = null;
    private static final java.util.regex.Pattern PAT_SCH = null;
    private static final char SPACE = ' ';
    private static final int TRUE_LENGTH = 6;
    private final boolean strict;

    static {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 65
            r1[r2] = r3
            org.apache.commons.codec.language.Nysiis.CHARS_A = r1
            r1 = 2
            char[] r3 = new char[r1]
            r3 = {x0082: FILL_ARRAY_DATA , data: [65, 70} // fill-array
            org.apache.commons.codec.language.Nysiis.CHARS_AF = r3
            char[] r3 = new char[r0]
            r4 = 67
            r3[r2] = r4
            org.apache.commons.codec.language.Nysiis.CHARS_C = r3
            char[] r3 = new char[r1]
            r3 = {x0088: FILL_ARRAY_DATA , data: [70, 70} // fill-array
            org.apache.commons.codec.language.Nysiis.CHARS_FF = r3
            char[] r3 = new char[r0]
            r4 = 71
            r3[r2] = r4
            org.apache.commons.codec.language.Nysiis.CHARS_G = r3
            char[] r3 = new char[r0]
            r4 = 78
            r3[r2] = r4
            org.apache.commons.codec.language.Nysiis.CHARS_N = r3
            char[] r1 = new char[r1]
            r1 = {x008e: FILL_ARRAY_DATA , data: [78, 78} // fill-array
            org.apache.commons.codec.language.Nysiis.CHARS_NN = r1
            char[] r0 = new char[r0]
            r1 = 83
            r0[r2] = r1
            org.apache.commons.codec.language.Nysiis.CHARS_S = r0
            r0 = 3
            char[] r0 = new char[r0]
            r0 = {x0094: FILL_ARRAY_DATA , data: [83, 83, 83} // fill-array
            org.apache.commons.codec.language.Nysiis.CHARS_SSS = r0
            java.lang.String r0 = "^MAC"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.language.Nysiis.PAT_MAC = r0
            java.lang.String r0 = "^KN"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.language.Nysiis.PAT_KN = r0
            java.lang.String r0 = "^K"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.language.Nysiis.PAT_K = r0
            java.lang.String r0 = "^(PH|PF)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.language.Nysiis.PAT_PH_PF = r0
            java.lang.String r0 = "^SCH"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.language.Nysiis.PAT_SCH = r0
            java.lang.String r0 = "(EE|IE)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.language.Nysiis.PAT_EE_IE = r0
            java.lang.String r0 = "(DT|RT|RD|NT|ND)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.language.Nysiis.PAT_DT_ETC = r0
            return
    }

    public Nysiis() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public Nysiis(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.strict = r1
            return
    }

    private static boolean isVowel(char r1) {
            r0 = 65
            if (r1 == r0) goto L17
            r0 = 69
            if (r1 == r0) goto L17
            r0 = 73
            if (r1 == r0) goto L17
            r0 = 79
            if (r1 == r0) goto L17
            r0 = 85
            if (r1 != r0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            return r1
    }

    private static char[] transcodeRemaining(char r2, char r3, char r4, char r5) {
            r0 = 69
            if (r3 != r0) goto Lb
            r0 = 86
            if (r4 != r0) goto Lb
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_AF
            return r2
        Lb:
            boolean r0 = isVowel(r3)
            if (r0 == 0) goto L14
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_A
            return r2
        L14:
            r0 = 75
            if (r3 == r0) goto L6e
            r0 = 77
            if (r3 == r0) goto L6b
            r0 = 81
            if (r3 == r0) goto L68
            r0 = 90
            if (r3 == r0) goto L65
            r0 = 83
            r1 = 72
            if (r3 != r0) goto L33
            r0 = 67
            if (r4 != r0) goto L33
            if (r5 != r1) goto L33
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_SSS
            return r2
        L33:
            r5 = 80
            if (r3 != r5) goto L3c
            if (r4 != r1) goto L3c
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_FF
            return r2
        L3c:
            r5 = 0
            r0 = 1
            if (r3 != r1) goto L51
            boolean r1 = isVowel(r2)
            if (r1 == 0) goto L4c
            boolean r4 = isVowel(r4)
            if (r4 != 0) goto L51
        L4c:
            char[] r3 = new char[r0]
            r3[r5] = r2
            return r3
        L51:
            r4 = 87
            if (r3 != r4) goto L60
            boolean r4 = isVowel(r2)
            if (r4 == 0) goto L60
            char[] r3 = new char[r0]
            r3[r5] = r2
            return r3
        L60:
            char[] r2 = new char[r0]
            r2[r5] = r3
            return r2
        L65:
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_S
            return r2
        L68:
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_G
            return r2
        L6b:
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_N
            return r2
        L6e:
            r2 = 78
            if (r4 != r2) goto L75
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_NN
            return r2
        L75:
            char[] r2 = org.apache.commons.codec.language.Nysiis.CHARS_C
            return r2
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.nysiis(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "Parameter supplied to Nysiis encode is not of type java.lang.String"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.nysiis(r1)
            return r1
    }

    public boolean isStrict() {
            r1 = this;
            boolean r0 = r1.strict
            return r0
    }

    public java.lang.String nysiis(java.lang.String r11) {
            r10 = this;
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            java.lang.String r11 = org.apache.commons.codec.language.SoundexUtils.clean(r11)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto Lf
            return r11
        Lf:
            java.util.regex.Pattern r0 = org.apache.commons.codec.language.Nysiis.PAT_MAC
            java.util.regex.Matcher r11 = r0.matcher(r11)
            java.lang.String r0 = "MCC"
            java.lang.String r11 = r11.replaceFirst(r0)
            java.util.regex.Pattern r0 = org.apache.commons.codec.language.Nysiis.PAT_KN
            java.util.regex.Matcher r11 = r0.matcher(r11)
            java.lang.String r0 = "NN"
            java.lang.String r11 = r11.replaceFirst(r0)
            java.util.regex.Pattern r0 = org.apache.commons.codec.language.Nysiis.PAT_K
            java.util.regex.Matcher r11 = r0.matcher(r11)
            java.lang.String r0 = "C"
            java.lang.String r11 = r11.replaceFirst(r0)
            java.util.regex.Pattern r0 = org.apache.commons.codec.language.Nysiis.PAT_PH_PF
            java.util.regex.Matcher r11 = r0.matcher(r11)
            java.lang.String r0 = "FF"
            java.lang.String r11 = r11.replaceFirst(r0)
            java.util.regex.Pattern r0 = org.apache.commons.codec.language.Nysiis.PAT_SCH
            java.util.regex.Matcher r11 = r0.matcher(r11)
            java.lang.String r0 = "SSS"
            java.lang.String r11 = r11.replaceFirst(r0)
            java.util.regex.Pattern r0 = org.apache.commons.codec.language.Nysiis.PAT_EE_IE
            java.util.regex.Matcher r11 = r0.matcher(r11)
            java.lang.String r0 = "Y"
            java.lang.String r11 = r11.replaceFirst(r0)
            java.util.regex.Pattern r0 = org.apache.commons.codec.language.Nysiis.PAT_DT_ETC
            java.util.regex.Matcher r11 = r0.matcher(r11)
            java.lang.String r0 = "D"
            java.lang.String r11 = r11.replaceFirst(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r11.length()
            r0.<init>(r1)
            r1 = 0
            char r2 = r11.charAt(r1)
            r0.append(r2)
            char[] r11 = r11.toCharArray()
            int r2 = r11.length
            r3 = 1
            r4 = r3
        L7b:
            if (r4 >= r2) goto Lab
            int r5 = r2 + (-1)
            r6 = 32
            if (r4 >= r5) goto L88
            int r5 = r4 + 1
            char r5 = r11[r5]
            goto L89
        L88:
            r5 = r6
        L89:
            int r7 = r2 + (-2)
            if (r4 >= r7) goto L91
            int r6 = r4 + 2
            char r6 = r11[r6]
        L91:
            int r7 = r4 + (-1)
            char r8 = r11[r7]
            char r9 = r11[r4]
            char[] r5 = transcodeRemaining(r8, r9, r5, r6)
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r11, r4, r6)
            char r5 = r11[r4]
            char r6 = r11[r7]
            if (r5 == r6) goto La8
            r0.append(r5)
        La8:
            int r4 = r4 + 1
            goto L7b
        Lab:
            int r11 = r0.length()
            if (r11 <= r3) goto Lf9
            int r11 = r0.length()
            int r11 = r11 - r3
            char r11 = r0.charAt(r11)
            r2 = 83
            if (r11 != r2) goto Lcf
            int r11 = r0.length()
            int r11 = r11 - r3
            r0.deleteCharAt(r11)
            int r11 = r0.length()
            int r11 = r11 - r3
            char r11 = r0.charAt(r11)
        Lcf:
            int r2 = r0.length()
            r4 = 65
            r5 = 2
            if (r2 <= r5) goto Lef
            int r2 = r0.length()
            int r2 = r2 - r5
            char r2 = r0.charAt(r2)
            if (r2 != r4) goto Lef
            r2 = 89
            if (r11 != r2) goto Lef
            int r2 = r0.length()
            int r2 = r2 - r5
            r0.deleteCharAt(r2)
        Lef:
            if (r11 != r4) goto Lf9
            int r11 = r0.length()
            int r11 = r11 - r3
            r0.deleteCharAt(r11)
        Lf9:
            java.lang.String r11 = r0.toString()
            boolean r0 = r10.isStrict()
            if (r0 == 0) goto L110
            r0 = 6
            int r2 = r11.length()
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.String r11 = r11.substring(r1, r0)
        L110:
            return r11
    }
}
