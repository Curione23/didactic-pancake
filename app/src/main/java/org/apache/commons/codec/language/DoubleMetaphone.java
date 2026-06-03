package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class DoubleMetaphone implements org.apache.commons.codec.StringEncoder {
    private static final java.lang.String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = null;
    private static final java.lang.String[] L_R_N_M_B_H_F_V_W_SPACE = null;
    private static final java.lang.String[] L_T_K_S_N_M_B_Z = null;
    private static final java.lang.String[] SILENT_START = null;
    private static final java.lang.String VOWELS = "AEIOUY";
    private int maxCodeLen;

    public class DoubleMetaphoneResult {
        private final java.lang.StringBuilder alternate;
        private final int maxLength;
        private final java.lang.StringBuilder primary;
        final /* synthetic */ org.apache.commons.codec.language.DoubleMetaphone this$0;

        public DoubleMetaphoneResult(org.apache.commons.codec.language.DoubleMetaphone r3, int r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r3.getMaxCodeLen()
                r0.<init>(r1)
                r2.primary = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r3 = r3.getMaxCodeLen()
                r0.<init>(r3)
                r2.alternate = r0
                r2.maxLength = r4
                return
        }

        public void append(char r1) {
                r0 = this;
                r0.appendPrimary(r1)
                r0.appendAlternate(r1)
                return
        }

        public void append(char r1, char r2) {
                r0 = this;
                r0.appendPrimary(r1)
                r0.appendAlternate(r2)
                return
        }

        public void append(java.lang.String r1) {
                r0 = this;
                r0.appendPrimary(r1)
                r0.appendAlternate(r1)
                return
        }

        public void append(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.appendPrimary(r1)
                r0.appendAlternate(r2)
                return
        }

        public void appendAlternate(char r3) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.alternate
                int r0 = r0.length()
                int r1 = r2.maxLength
                if (r0 >= r1) goto Lf
                java.lang.StringBuilder r0 = r2.alternate
                r0.append(r3)
            Lf:
                return
        }

        public void appendAlternate(java.lang.String r4) {
                r3 = this;
                int r0 = r3.maxLength
                java.lang.StringBuilder r1 = r3.alternate
                int r1 = r1.length()
                int r0 = r0 - r1
                int r1 = r4.length()
                if (r1 > r0) goto L15
                java.lang.StringBuilder r0 = r3.alternate
                r0.append(r4)
                goto L1b
            L15:
                java.lang.StringBuilder r1 = r3.alternate
                r2 = 0
                r1.append(r4, r2, r0)
            L1b:
                return
        }

        public void appendPrimary(char r3) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.primary
                int r0 = r0.length()
                int r1 = r2.maxLength
                if (r0 >= r1) goto Lf
                java.lang.StringBuilder r0 = r2.primary
                r0.append(r3)
            Lf:
                return
        }

        public void appendPrimary(java.lang.String r4) {
                r3 = this;
                int r0 = r3.maxLength
                java.lang.StringBuilder r1 = r3.primary
                int r1 = r1.length()
                int r0 = r0 - r1
                int r1 = r4.length()
                if (r1 > r0) goto L15
                java.lang.StringBuilder r0 = r3.primary
                r0.append(r4)
                goto L1b
            L15:
                java.lang.StringBuilder r1 = r3.primary
                r2 = 0
                r1.append(r4, r2, r0)
            L1b:
                return
        }

        public java.lang.String getAlternate() {
                r1 = this;
                java.lang.StringBuilder r0 = r1.alternate
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String getPrimary() {
                r1 = this;
                java.lang.StringBuilder r0 = r1.primary
                java.lang.String r0 = r0.toString()
                return r0
        }

        public boolean isComplete() {
                r2 = this;
                java.lang.StringBuilder r0 = r2.primary
                int r0 = r0.length()
                int r1 = r2.maxLength
                if (r0 < r1) goto L16
                java.lang.StringBuilder r0 = r2.alternate
                int r0 = r0.length()
                int r1 = r2.maxLength
                if (r0 < r1) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
        }
    }

    static {
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "GN"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "KN"
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "PN"
            r5 = 2
            r1[r5] = r2
            java.lang.String r2 = "WR"
            r6 = 3
            r1[r6] = r2
            java.lang.String r2 = "PS"
            r7 = 4
            r1[r7] = r2
            org.apache.commons.codec.language.DoubleMetaphone.SILENT_START = r1
            r1 = 10
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r8 = "L"
            r2[r3] = r8
            java.lang.String r9 = "R"
            r2[r4] = r9
            java.lang.String r9 = "N"
            r2[r5] = r9
            java.lang.String r10 = "M"
            r2[r6] = r10
            java.lang.String r11 = "B"
            r2[r7] = r11
            java.lang.String r12 = "H"
            r2[r0] = r12
            java.lang.String r12 = "F"
            r13 = 6
            r2[r13] = r12
            java.lang.String r12 = "V"
            r14 = 7
            r2[r14] = r12
            java.lang.String r12 = "W"
            r15 = 8
            r2[r15] = r12
            java.lang.String r12 = " "
            r16 = 9
            r2[r16] = r12
            org.apache.commons.codec.language.DoubleMetaphone.L_R_N_M_B_H_F_V_W_SPACE = r2
            r2 = 11
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r12 = "ES"
            r2[r3] = r12
            java.lang.String r12 = "EP"
            r2[r4] = r12
            java.lang.String r12 = "EB"
            r2[r5] = r12
            java.lang.String r12 = "EL"
            r2[r6] = r12
            java.lang.String r12 = "EY"
            r2[r7] = r12
            java.lang.String r12 = "IB"
            r2[r0] = r12
            java.lang.String r12 = "IL"
            r2[r13] = r12
            java.lang.String r12 = "IN"
            r2[r14] = r12
            java.lang.String r12 = "IE"
            r2[r15] = r12
            java.lang.String r12 = "EI"
            r2[r16] = r12
            java.lang.String r12 = "ER"
            r2[r1] = r12
            org.apache.commons.codec.language.DoubleMetaphone.ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = r2
            java.lang.String[] r1 = new java.lang.String[r15]
            r1[r3] = r8
            java.lang.String r2 = "T"
            r1[r4] = r2
            java.lang.String r2 = "K"
            r1[r5] = r2
            java.lang.String r2 = "S"
            r1[r6] = r2
            r1[r7] = r9
            r1[r0] = r10
            r1[r13] = r11
            java.lang.String r0 = "Z"
            r1[r14] = r0
            org.apache.commons.codec.language.DoubleMetaphone.L_T_K_S_N_M_B_Z = r1
            return
    }

    public DoubleMetaphone() {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.maxCodeLen = r0
            return
    }

    private java.lang.String cleanInput(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.trim()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toUpperCase(r0)
            return r3
    }

    private boolean conditionC0(java.lang.String r7, int r8) {
            r6 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "CHIA"
            r3 = 0
            r1[r3] = r2
            r2 = 4
            boolean r1 = contains(r7, r8, r2, r1)
            if (r1 == 0) goto L10
            return r0
        L10:
            if (r8 > r0) goto L13
            return r3
        L13:
            int r1 = r8 + (-2)
            char r2 = r6.charAt(r7, r1)
            boolean r2 = r6.isVowel(r2)
            if (r2 == 0) goto L20
            return r3
        L20:
            int r2 = r8 + (-1)
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r5 = "ACH"
            r4[r3] = r5
            r5 = 3
            boolean r2 = contains(r7, r2, r5, r4)
            if (r2 != 0) goto L30
            return r3
        L30:
            r2 = 2
            int r8 = r8 + r2
            char r8 = r6.charAt(r7, r8)
            r4 = 73
            if (r8 == r4) goto L3e
            r4 = 69
            if (r8 != r4) goto L51
        L3e:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.String r2 = "BACHER"
            r8[r3] = r2
            java.lang.String r2 = "MACHER"
            r8[r0] = r2
            r2 = 6
            boolean r7 = contains(r7, r1, r2, r8)
            if (r7 == 0) goto L50
            goto L51
        L50:
            r0 = r3
        L51:
            return r0
    }

    private boolean conditionCH0(java.lang.String r7, int r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L4
            return r0
        L4:
            r1 = 1
            int r8 = r8 + r1
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "HARAC"
            r3[r0] = r4
            java.lang.String r4 = "HARIS"
            r3[r1] = r4
            r4 = 5
            boolean r3 = contains(r7, r8, r4, r3)
            if (r3 != 0) goto L33
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r5 = "HOR"
            r3[r0] = r5
            java.lang.String r5 = "HYM"
            r3[r1] = r5
            java.lang.String r5 = "HIA"
            r3[r2] = r5
            java.lang.String r2 = "HEM"
            r5 = 3
            r3[r5] = r2
            boolean r8 = contains(r7, r8, r5, r3)
            if (r8 != 0) goto L33
            return r0
        L33:
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r2 = "CHORE"
            r8[r0] = r2
            boolean r7 = contains(r7, r0, r4, r8)
            r7 = r7 ^ r1
            return r7
    }

    private boolean conditionCH1(java.lang.String r9, int r10) {
            r8 = this;
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "VAN "
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "VON "
            r4 = 1
            r1[r4] = r2
            r2 = 4
            boolean r1 = contains(r9, r3, r2, r1)
            if (r1 != 0) goto L76
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r5 = "SCH"
            r1[r3] = r5
            r5 = 3
            boolean r1 = contains(r9, r3, r5, r1)
            if (r1 != 0) goto L76
            int r1 = r10 + (-2)
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "ORCHES"
            r6[r3] = r7
            java.lang.String r7 = "ARCHIT"
            r6[r4] = r7
            java.lang.String r7 = "ORCHID"
            r6[r0] = r7
            r7 = 6
            boolean r1 = contains(r9, r1, r7, r6)
            if (r1 != 0) goto L76
            int r1 = r10 + 2
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r7 = "T"
            r6[r3] = r7
            java.lang.String r7 = "S"
            r6[r4] = r7
            boolean r6 = contains(r9, r1, r4, r6)
            if (r6 != 0) goto L76
            int r6 = r10 + (-1)
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r7 = "A"
            r2[r3] = r7
            java.lang.String r7 = "O"
            r2[r4] = r7
            java.lang.String r7 = "U"
            r2[r0] = r7
            java.lang.String r0 = "E"
            r2[r5] = r0
            boolean r0 = contains(r9, r6, r4, r2)
            if (r0 != 0) goto L66
            if (r10 != 0) goto L77
        L66:
            java.lang.String[] r0 = org.apache.commons.codec.language.DoubleMetaphone.L_R_N_M_B_H_F_V_W_SPACE
            boolean r0 = contains(r9, r1, r4, r0)
            if (r0 != 0) goto L76
            int r10 = r10 + r4
            int r9 = r9.length()
            int r9 = r9 - r4
            if (r10 != r9) goto L77
        L76:
            r3 = r4
        L77:
            return r3
    }

    private boolean conditionL0(java.lang.String r9, int r10) {
            r8 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 - r1
            java.lang.String r2 = "ALLE"
            r3 = 4
            r4 = 0
            r5 = 2
            r6 = 1
            if (r10 != r0) goto L23
            int r0 = r10 + (-1)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r7 = "ILLO"
            r1[r4] = r7
            java.lang.String r7 = "ILLA"
            r1[r6] = r7
            r1[r5] = r2
            boolean r0 = contains(r9, r0, r3, r1)
            if (r0 == 0) goto L23
            return r6
        L23:
            int r0 = r9.length()
            int r0 = r0 - r5
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r7 = "AS"
            r1[r4] = r7
            java.lang.String r7 = "OS"
            r1[r6] = r7
            boolean r0 = contains(r9, r0, r5, r1)
            if (r0 != 0) goto L4d
            int r0 = r9.length()
            int r0 = r0 - r6
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r5 = "A"
            r1[r4] = r5
            java.lang.String r5 = "O"
            r1[r6] = r5
            boolean r0 = contains(r9, r0, r6, r1)
            if (r0 == 0) goto L59
        L4d:
            int r10 = r10 - r6
            java.lang.String[] r0 = new java.lang.String[r6]
            r0[r4] = r2
            boolean r9 = contains(r9, r10, r3, r0)
            if (r9 == 0) goto L59
            r4 = r6
        L59:
            return r4
    }

    private boolean conditionM0(java.lang.String r7, int r8) {
            r6 = this;
            int r0 = r8 + 1
            char r1 = r6.charAt(r7, r0)
            r2 = 77
            r3 = 1
            if (r1 != r2) goto Lc
            return r3
        Lc:
            int r1 = r8 + (-1)
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r4 = "UMB"
            r5 = 0
            r2[r5] = r4
            r4 = 3
            boolean r1 = contains(r7, r1, r4, r2)
            if (r1 == 0) goto L32
            int r1 = r7.length()
            int r1 = r1 - r3
            if (r0 == r1) goto L33
            r0 = 2
            int r8 = r8 + r0
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r2 = "ER"
            r1[r5] = r2
            boolean r7 = contains(r7, r8, r0, r1)
            if (r7 == 0) goto L32
            goto L33
        L32:
            r3 = r5
        L33:
            return r3
    }

    protected static boolean contains(java.lang.String r2, int r3, int r4, java.lang.String... r5) {
            r0 = 0
            if (r3 < 0) goto L1f
            int r4 = r4 + r3
            int r1 = r2.length()
            if (r4 > r1) goto L1f
            java.lang.String r2 = r2.substring(r3, r4)
            int r3 = r5.length
            r4 = r0
        L10:
            if (r4 >= r3) goto L1f
            r1 = r5[r4]
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1c
            r0 = 1
            goto L1f
        L1c:
            int r4 = r4 + 1
            goto L10
        L1f:
            return r0
    }

    private int handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L7
            r0 = 65
            r2.append(r0)
        L7:
            int r3 = r3 + 1
            return r3
    }

    private int handleC(java.lang.String r18, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r19, int r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r0.conditionC0(r1, r3)
            r5 = 75
            r6 = 2
            if (r4 == 0) goto L18
            r2.append(r5)
        L14:
            int r1 = r3 + 2
            goto L117
        L18:
            r4 = 83
            r7 = 0
            r8 = 1
            if (r3 != 0) goto L2f
            java.lang.String[] r9 = new java.lang.String[r8]
            java.lang.String r10 = "CAESAR"
            r9[r7] = r10
            r10 = 6
            boolean r9 = contains(r1, r3, r10, r9)
            if (r9 == 0) goto L2f
            r2.append(r4)
            goto L14
        L2f:
            java.lang.String[] r9 = new java.lang.String[r8]
            java.lang.String r10 = "CH"
            r9[r7] = r10
            boolean r9 = contains(r1, r3, r6, r9)
            if (r9 == 0) goto L41
            int r1 = r17.handleCH(r18, r19, r20)
            goto L117
        L41:
            java.lang.String[] r9 = new java.lang.String[r8]
            java.lang.String r10 = "CZ"
            r9[r7] = r10
            boolean r9 = contains(r1, r3, r6, r9)
            r10 = 88
            if (r9 == 0) goto L62
            int r9 = r3 + (-2)
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.String r12 = "WICZ"
            r11[r7] = r12
            r12 = 4
            boolean r9 = contains(r1, r9, r12, r11)
            if (r9 != 0) goto L62
            r2.append(r4, r10)
            goto L14
        L62:
            int r9 = r3 + 1
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.String r12 = "CIA"
            r11[r7] = r12
            r13 = 3
            boolean r11 = contains(r1, r9, r13, r11)
            if (r11 == 0) goto L78
            r2.append(r10)
        L74:
            int r1 = r3 + 3
            goto L117
        L78:
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.String r14 = "CC"
            r11[r7] = r14
            boolean r11 = contains(r1, r3, r6, r11)
            if (r11 == 0) goto L93
            if (r3 != r8) goto L8e
            char r11 = r0.charAt(r1, r7)
            r14 = 77
            if (r11 == r14) goto L93
        L8e:
            int r1 = r17.handleCC(r18, r19, r20)
            return r1
        L93:
            java.lang.String[] r11 = new java.lang.String[r13]
            java.lang.String r14 = "CK"
            r11[r7] = r14
            java.lang.String r14 = "CG"
            r11[r8] = r14
            java.lang.String r14 = "CQ"
            r11[r6] = r14
            boolean r11 = contains(r1, r3, r6, r11)
            if (r11 == 0) goto Lac
            r2.append(r5)
            goto L14
        Lac:
            java.lang.String[] r11 = new java.lang.String[r13]
            java.lang.String r14 = "CI"
            r11[r7] = r14
            java.lang.String r15 = "CE"
            r11[r8] = r15
            java.lang.String r16 = "CY"
            r11[r6] = r16
            boolean r11 = contains(r1, r3, r6, r11)
            if (r11 == 0) goto Ldc
            java.lang.String[] r5 = new java.lang.String[r13]
            java.lang.String r9 = "CIO"
            r5[r7] = r9
            java.lang.String r7 = "CIE"
            r5[r8] = r7
            r5[r6] = r12
            boolean r1 = contains(r1, r3, r13, r5)
            if (r1 == 0) goto Ld7
            r2.append(r4, r10)
            goto L14
        Ld7:
            r2.append(r4)
            goto L14
        Ldc:
            r2.append(r5)
            java.lang.String[] r2 = new java.lang.String[r13]
            java.lang.String r4 = " C"
            r2[r7] = r4
            java.lang.String r4 = " Q"
            r2[r8] = r4
            java.lang.String r4 = " G"
            r2[r6] = r4
            boolean r2 = contains(r1, r9, r6, r2)
            if (r2 == 0) goto Lf4
            goto L74
        Lf4:
            java.lang.String[] r2 = new java.lang.String[r13]
            java.lang.String r4 = "C"
            r2[r7] = r4
            java.lang.String r4 = "K"
            r2[r8] = r4
            java.lang.String r4 = "Q"
            r2[r6] = r4
            boolean r2 = contains(r1, r9, r8, r2)
            if (r2 == 0) goto L116
            java.lang.String[] r2 = new java.lang.String[r6]
            r2[r7] = r15
            r2[r8] = r14
            boolean r1 = contains(r1, r9, r6, r2)
            if (r1 != 0) goto L116
            goto L14
        L116:
            r1 = r9
        L117:
            return r1
    }

    private int handleCC(java.lang.String r8, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r9, int r10) {
            r7 = this;
            int r0 = r10 + 2
            r1 = 3
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "I"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "E"
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "H"
            r6 = 2
            r2[r6] = r3
            boolean r2 = contains(r8, r0, r5, r2)
            if (r2 == 0) goto L53
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r3 = "HU"
            r2[r4] = r3
            boolean r2 = contains(r8, r0, r6, r2)
            if (r2 != 0) goto L53
            if (r10 != r5) goto L32
            int r0 = r10 + (-1)
            char r0 = r7.charAt(r8, r0)
            r2 = 65
            if (r0 == r2) goto L45
        L32:
            int r0 = r10 + (-1)
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r3 = "UCCEE"
            r2[r4] = r3
            java.lang.String r3 = "UCCES"
            r2[r5] = r3
            r3 = 5
            boolean r8 = contains(r8, r0, r3, r2)
            if (r8 == 0) goto L4b
        L45:
            java.lang.String r8 = "KS"
            r9.append(r8)
            goto L50
        L4b:
            r8 = 88
            r9.append(r8)
        L50:
            int r0 = r10 + 3
            goto L58
        L53:
            r8 = 75
            r9.append(r8)
        L58:
            return r0
    }

    private int handleCH(java.lang.String r8, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r9, int r10) {
            r7 = this;
            r0 = 1
            r1 = 88
            r2 = 0
            r3 = 2
            r4 = 75
            if (r10 <= 0) goto L1b
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r6 = "CHAE"
            r5[r2] = r6
            r6 = 4
            boolean r5 = contains(r8, r10, r6, r5)
            if (r5 == 0) goto L1b
            r9.append(r4, r1)
        L19:
            int r10 = r10 + r3
            return r10
        L1b:
            boolean r5 = r7.conditionCH0(r8, r10)
            if (r5 == 0) goto L25
            r9.append(r4)
            goto L19
        L25:
            boolean r5 = r7.conditionCH1(r8, r10)
            if (r5 == 0) goto L2f
            r9.append(r4)
            goto L19
        L2f:
            if (r10 <= 0) goto L45
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r5 = "MC"
            r0[r2] = r5
            boolean r8 = contains(r8, r2, r3, r0)
            if (r8 == 0) goto L41
            r9.append(r4)
            goto L48
        L41:
            r9.append(r1, r4)
            goto L48
        L45:
            r9.append(r1)
        L48:
            int r10 = r10 + r3
            return r10
    }

    private int handleD(java.lang.String r8, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r9, int r10) {
            r7 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "DG"
            r3 = 0
            r1[r3] = r2
            r2 = 2
            boolean r1 = contains(r8, r10, r2, r1)
            if (r1 == 0) goto L34
            int r1 = r10 + 2
            r4 = 3
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r6 = "I"
            r5[r3] = r6
            java.lang.String r3 = "E"
            r5[r0] = r3
            java.lang.String r3 = "Y"
            r5[r2] = r3
            boolean r8 = contains(r8, r1, r0, r5)
            if (r8 == 0) goto L2e
            r8 = 74
            r9.append(r8)
            int r1 = r10 + 3
            goto L51
        L2e:
            java.lang.String r8 = "TK"
            r9.append(r8)
            goto L51
        L34:
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r4 = "DT"
            r1[r3] = r4
            java.lang.String r3 = "DD"
            r1[r0] = r3
            boolean r8 = contains(r8, r10, r2, r1)
            r1 = 84
            if (r8 == 0) goto L4c
            r9.append(r1)
            int r1 = r10 + 2
            goto L51
        L4c:
            r9.append(r1)
            int r1 = r10 + 1
        L51:
            return r1
    }

    private int handleG(java.lang.String r12, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r13, int r14, boolean r15) {
            r11 = this;
            int r0 = r14 + 1
            char r1 = r11.charAt(r12, r0)
            r2 = 72
            if (r1 != r2) goto L10
            int r12 = r11.handleGH(r12, r13, r14)
            goto L147
        L10:
            char r1 = r11.charAt(r12, r0)
            r2 = 78
            r3 = 89
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 != r2) goto L51
            java.lang.String r1 = "N"
            java.lang.String r2 = "KN"
            if (r14 != r6) goto L33
            char r7 = r11.charAt(r12, r4)
            boolean r7 = r11.isVowel(r7)
            if (r7 == 0) goto L33
            if (r15 != 0) goto L33
            r13.append(r2, r1)
            goto L66
        L33:
            int r7 = r14 + 2
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r8 = "EY"
            r6[r4] = r8
            boolean r4 = contains(r12, r7, r5, r6)
            if (r4 != 0) goto L4d
            char r12 = r11.charAt(r12, r0)
            if (r12 == r3) goto L4d
            if (r15 != 0) goto L4d
            r13.append(r1, r2)
            goto L66
        L4d:
            r13.append(r2)
            goto L66
        L51:
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r2 = "LI"
            r1[r4] = r2
            boolean r1 = contains(r12, r0, r5, r1)
            if (r1 == 0) goto L6a
            if (r15 != 0) goto L6a
            java.lang.String r12 = "KL"
            java.lang.String r15 = "L"
            r13.append(r12, r15)
        L66:
            int r12 = r14 + 2
            goto L147
        L6a:
            r15 = 74
            r1 = 75
            if (r14 != 0) goto L82
            char r2 = r11.charAt(r12, r0)
            if (r2 == r3) goto L7e
            java.lang.String[] r2 = org.apache.commons.codec.language.DoubleMetaphone.ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER
            boolean r2 = contains(r12, r0, r5, r2)
            if (r2 == 0) goto L82
        L7e:
            r13.append(r1, r15)
            goto L66
        L82:
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r7 = "ER"
            r2[r4] = r7
            boolean r2 = contains(r12, r0, r5, r2)
            java.lang.String r7 = "I"
            java.lang.String r8 = "E"
            r9 = 3
            if (r2 != 0) goto L99
            char r2 = r11.charAt(r12, r0)
            if (r2 != r3) goto Ld0
        L99:
            java.lang.String[] r2 = new java.lang.String[r9]
            java.lang.String r3 = "DANGER"
            r2[r4] = r3
            java.lang.String r3 = "RANGER"
            r2[r6] = r3
            java.lang.String r3 = "MANGER"
            r2[r5] = r3
            r3 = 6
            boolean r2 = contains(r12, r4, r3, r2)
            if (r2 != 0) goto Ld0
            int r2 = r14 + (-1)
            java.lang.String[] r3 = new java.lang.String[r5]
            r3[r4] = r8
            r3[r6] = r7
            boolean r3 = contains(r12, r2, r6, r3)
            if (r3 != 0) goto Ld0
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r10 = "RGY"
            r3[r4] = r10
            java.lang.String r10 = "OGY"
            r3[r6] = r10
            boolean r2 = contains(r12, r2, r9, r3)
            if (r2 != 0) goto Ld0
            r13.append(r1, r15)
            goto L66
        Ld0:
            java.lang.String[] r2 = new java.lang.String[r9]
            r2[r4] = r8
            r2[r6] = r7
            java.lang.String r3 = "Y"
            r2[r5] = r3
            boolean r2 = contains(r12, r0, r6, r2)
            r3 = 4
            if (r2 != 0) goto L103
            int r2 = r14 + (-1)
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r8 = "AGGI"
            r7[r4] = r8
            java.lang.String r8 = "OGGI"
            r7[r6] = r8
            boolean r2 = contains(r12, r2, r3, r7)
            if (r2 == 0) goto Lf4
            goto L103
        Lf4:
            char r12 = r11.charAt(r12, r0)
            r15 = 71
            if (r12 != r15) goto Lfe
            int r0 = r14 + 2
        Lfe:
            r13.append(r1)
            r12 = r0
            goto L147
        L103:
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r7 = "VAN "
            r2[r4] = r7
            java.lang.String r7 = "VON "
            r2[r6] = r7
            boolean r2 = contains(r12, r4, r3, r2)
            if (r2 != 0) goto L142
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r3 = "SCH"
            r2[r4] = r3
            boolean r2 = contains(r12, r4, r9, r2)
            if (r2 != 0) goto L142
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r3 = "ET"
            r2[r4] = r3
            boolean r2 = contains(r12, r0, r5, r2)
            if (r2 == 0) goto L12c
            goto L142
        L12c:
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r3 = "IER"
            r2[r4] = r3
            boolean r12 = contains(r12, r0, r9, r2)
            if (r12 == 0) goto L13d
            r13.append(r15)
            goto L66
        L13d:
            r13.append(r15, r1)
            goto L66
        L142:
            r13.append(r1)
            goto L66
        L147:
            return r12
    }

    private int handleGH(java.lang.String r12, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r13, int r14) {
            r11 = this;
            r0 = 75
            r1 = 2
            if (r14 <= 0) goto L17
            int r2 = r14 + (-1)
            char r2 = r11.charAt(r12, r2)
            boolean r2 = r11.isVowel(r2)
            if (r2 != 0) goto L17
            r13.append(r0)
        L14:
            int r14 = r14 + r1
            goto Lae
        L17:
            r2 = 73
            if (r14 != 0) goto L2e
            int r14 = r14 + r1
            char r12 = r11.charAt(r12, r14)
            if (r12 != r2) goto L29
            r12 = 74
            r13.append(r12)
            goto Lae
        L29:
            r13.append(r0)
            goto Lae
        L2e:
            java.lang.String r3 = "D"
            java.lang.String r4 = "H"
            java.lang.String r5 = "B"
            r6 = 0
            r7 = 3
            r8 = 1
            if (r14 <= r8) goto L49
            int r9 = r14 + (-2)
            java.lang.String[] r10 = new java.lang.String[r7]
            r10[r6] = r5
            r10[r8] = r4
            r10[r1] = r3
            boolean r9 = contains(r12, r9, r8, r10)
            if (r9 != 0) goto L14
        L49:
            if (r14 <= r1) goto L5b
            int r9 = r14 + (-3)
            java.lang.String[] r10 = new java.lang.String[r7]
            r10[r6] = r5
            r10[r8] = r4
            r10[r1] = r3
            boolean r3 = contains(r12, r9, r8, r10)
            if (r3 != 0) goto L14
        L5b:
            if (r14 <= r7) goto L6c
            int r3 = r14 + (-4)
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r6] = r5
            r9[r8] = r4
            boolean r3 = contains(r12, r3, r8, r9)
            if (r3 == 0) goto L6c
            goto L14
        L6c:
            if (r14 <= r1) goto L9f
            int r3 = r14 + (-1)
            char r3 = r11.charAt(r12, r3)
            r4 = 85
            if (r3 != r4) goto L9f
            int r3 = r14 + (-3)
            r4 = 5
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = "C"
            r4[r6] = r5
            java.lang.String r5 = "G"
            r4[r8] = r5
            java.lang.String r5 = "L"
            r4[r1] = r5
            java.lang.String r5 = "R"
            r4[r7] = r5
            java.lang.String r5 = "T"
            r6 = 4
            r4[r6] = r5
            boolean r3 = contains(r12, r3, r8, r4)
            if (r3 == 0) goto L9f
            r12 = 70
            r13.append(r12)
            goto L14
        L9f:
            if (r14 <= 0) goto L14
            int r3 = r14 + (-1)
            char r12 = r11.charAt(r12, r3)
            if (r12 == r2) goto L14
            r13.append(r0)
            goto L14
        Lae:
            return r14
    }

    private int handleH(java.lang.String r2, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r3, int r4) {
            r1 = this;
            if (r4 == 0) goto Le
            int r0 = r4 + (-1)
            char r0 = r1.charAt(r2, r0)
            boolean r0 = r1.isVowel(r0)
            if (r0 == 0) goto L22
        Le:
            int r0 = r4 + 1
            char r2 = r1.charAt(r2, r0)
            boolean r2 = r1.isVowel(r2)
            if (r2 == 0) goto L22
            r2 = 72
            r3.append(r2)
            int r4 = r4 + 2
            goto L24
        L22:
            int r4 = r4 + 1
        L24:
            return r4
    }

    private int handleJ(java.lang.String r11, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r12, int r13, boolean r14) {
            r10 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "JOSE"
            r1[r2] = r3
            r4 = 4
            boolean r1 = contains(r11, r13, r4, r1)
            r5 = 32
            java.lang.String r6 = "SAN "
            r7 = 72
            r8 = 74
            if (r1 != 0) goto L90
            java.lang.String[] r1 = new java.lang.String[r0]
            r1[r2] = r6
            boolean r1 = contains(r11, r2, r4, r1)
            if (r1 == 0) goto L23
            goto L90
        L23:
            r1 = 2
            r6 = 65
            if (r13 != 0) goto L36
            java.lang.String[] r9 = new java.lang.String[r0]
            r9[r2] = r3
            boolean r3 = contains(r11, r13, r4, r9)
            if (r3 != 0) goto L36
            r12.append(r8, r6)
            goto L85
        L36:
            int r3 = r13 + (-1)
            char r4 = r10.charAt(r11, r3)
            boolean r4 = r10.isVowel(r4)
            if (r4 == 0) goto L58
            if (r14 != 0) goto L58
            int r14 = r13 + 1
            char r4 = r10.charAt(r11, r14)
            if (r4 == r6) goto L54
            char r14 = r10.charAt(r11, r14)
            r4 = 79
            if (r14 != r4) goto L58
        L54:
            r12.append(r8, r7)
            goto L85
        L58:
            int r14 = r11.length()
            int r14 = r14 - r0
            if (r13 != r14) goto L63
            r12.append(r8, r5)
            goto L85
        L63:
            int r14 = r13 + 1
            java.lang.String[] r4 = org.apache.commons.codec.language.DoubleMetaphone.L_T_K_S_N_M_B_Z
            boolean r14 = contains(r11, r14, r0, r4)
            if (r14 != 0) goto L85
            r14 = 3
            java.lang.String[] r14 = new java.lang.String[r14]
            java.lang.String r4 = "S"
            r14[r2] = r4
            java.lang.String r2 = "K"
            r14[r0] = r2
            java.lang.String r2 = "L"
            r14[r1] = r2
            boolean r14 = contains(r11, r3, r0, r14)
            if (r14 != 0) goto L85
            r12.append(r8)
        L85:
            int r12 = r13 + 1
            char r11 = r10.charAt(r11, r12)
            if (r11 != r8) goto Lb4
            int r12 = r13 + 2
            goto Lb4
        L90:
            if (r13 != 0) goto L9a
            int r14 = r13 + 4
            char r14 = r10.charAt(r11, r14)
            if (r14 == r5) goto Laf
        L9a:
            int r14 = r11.length()
            if (r14 == r4) goto Laf
            java.lang.String[] r14 = new java.lang.String[r0]
            r14[r2] = r6
            boolean r11 = contains(r11, r2, r4, r14)
            if (r11 == 0) goto Lab
            goto Laf
        Lab:
            r12.append(r8, r7)
            goto Lb2
        Laf:
            r12.append(r7)
        Lb2:
            int r12 = r13 + 1
        Lb4:
            return r12
    }

    private int handleL(java.lang.String r4, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r5, int r6) {
            r3 = this;
            int r0 = r6 + 1
            char r1 = r3.charAt(r4, r0)
            r2 = 76
            if (r1 != r2) goto L1a
            boolean r4 = r3.conditionL0(r4, r6)
            if (r4 == 0) goto L14
            r5.appendPrimary(r2)
            goto L17
        L14:
            r5.append(r2)
        L17:
            int r0 = r6 + 2
            goto L1d
        L1a:
            r5.append(r2)
        L1d:
            return r0
    }

    private int handleP(java.lang.String r5, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r6, int r7) {
            r4 = this;
            int r0 = r7 + 1
            char r1 = r4.charAt(r5, r0)
            r2 = 72
            r3 = 2
            if (r1 != r2) goto L12
            r5 = 70
            r6.append(r5)
            int r7 = r7 + r3
            goto L2c
        L12:
            r1 = 80
            r6.append(r1)
            java.lang.String[] r6 = new java.lang.String[r3]
            r1 = 0
            java.lang.String r2 = "P"
            r6[r1] = r2
            java.lang.String r1 = "B"
            r2 = 1
            r6[r2] = r1
            boolean r5 = contains(r5, r0, r2, r6)
            if (r5 == 0) goto L2b
            int r0 = r7 + 2
        L2b:
            r7 = r0
        L2c:
            return r7
    }

    private int handleR(java.lang.String r7, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r8, int r9, boolean r10) {
            r6 = this;
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 82
            r3 = 2
            if (r9 != r0) goto L32
            if (r10 != 0) goto L32
            int r10 = r9 + (-2)
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r4 = "IE"
            r5 = 0
            r0[r5] = r4
            boolean r10 = contains(r7, r10, r3, r0)
            if (r10 == 0) goto L32
            int r10 = r9 + (-4)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r4 = "ME"
            r0[r5] = r4
            java.lang.String r4 = "MA"
            r0[r1] = r4
            boolean r10 = contains(r7, r10, r3, r0)
            if (r10 != 0) goto L32
            r8.appendAlternate(r2)
            goto L35
        L32:
            r8.append(r2)
        L35:
            int r8 = r9 + 1
            char r7 = r6.charAt(r7, r8)
            if (r7 != r2) goto L3f
            int r8 = r9 + 2
        L3f:
            return r8
    }

    private int handleS(java.lang.String r10, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r11, int r12, boolean r13) {
            r9 = this;
            int r0 = r12 + (-1)
            r1 = 2
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "ISL"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "YSL"
            r5 = 1
            r2[r5] = r3
            r3 = 3
            boolean r0 = contains(r10, r0, r3, r2)
            if (r0 == 0) goto L19
        L16:
            int r12 = r12 + r5
            goto L108
        L19:
            r0 = 88
            r2 = 83
            if (r12 != 0) goto L30
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "SUGAR"
            r6[r4] = r7
            r7 = 5
            boolean r6 = contains(r10, r12, r7, r6)
            if (r6 == 0) goto L30
            r11.append(r0, r2)
            goto L16
        L30:
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "SH"
            r6[r4] = r7
            boolean r6 = contains(r10, r12, r1, r6)
            r7 = 4
            if (r6 == 0) goto L61
            int r13 = r12 + 1
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.String r8 = "HEIM"
            r6[r4] = r8
            java.lang.String r4 = "HOEK"
            r6[r5] = r4
            java.lang.String r4 = "HOLM"
            r6[r1] = r4
            java.lang.String r4 = "HOLZ"
            r6[r3] = r4
            boolean r10 = contains(r10, r13, r7, r6)
            if (r10 == 0) goto L5b
            r11.append(r2)
            goto L5e
        L5b:
            r11.append(r0)
        L5e:
            int r12 = r12 + r1
            goto L108
        L61:
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r8 = "SIO"
            r6[r4] = r8
            java.lang.String r8 = "SIA"
            r6[r5] = r8
            boolean r6 = contains(r10, r12, r3, r6)
            if (r6 != 0) goto Lfe
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r8 = "SIAN"
            r6[r4] = r8
            boolean r6 = contains(r10, r12, r7, r6)
            if (r6 == 0) goto L7f
            goto Lfe
        L7f:
            java.lang.String r13 = "Z"
            if (r12 != 0) goto L9d
            int r6 = r12 + 1
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.String r8 = "M"
            r7[r4] = r8
            java.lang.String r8 = "N"
            r7[r5] = r8
            java.lang.String r8 = "L"
            r7[r1] = r8
            java.lang.String r8 = "W"
            r7[r3] = r8
            boolean r3 = contains(r10, r6, r5, r7)
            if (r3 != 0) goto La9
        L9d:
            int r3 = r12 + 1
            java.lang.String[] r6 = new java.lang.String[r5]
            r6[r4] = r13
            boolean r6 = contains(r10, r3, r5, r6)
            if (r6 == 0) goto Lbb
        La9:
            r11.append(r2, r0)
            int r11 = r12 + 1
            java.lang.String[] r0 = new java.lang.String[r5]
            r0[r4] = r13
            boolean r10 = contains(r10, r11, r5, r0)
            if (r10 == 0) goto Lb9
            goto L5e
        Lb9:
            r12 = r11
            goto L108
        Lbb:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r6 = "SC"
            r0[r4] = r6
            boolean r0 = contains(r10, r12, r1, r0)
            if (r0 == 0) goto Lcc
            int r12 = r9.handleSC(r10, r11, r12)
            goto L108
        Lcc:
            int r0 = r10.length()
            int r0 = r0 - r5
            if (r12 != r0) goto Le9
            int r0 = r12 + (-2)
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r7 = "AI"
            r6[r4] = r7
            java.lang.String r7 = "OI"
            r6[r5] = r7
            boolean r0 = contains(r10, r0, r1, r6)
            if (r0 == 0) goto Le9
            r11.appendAlternate(r2)
            goto Lec
        Le9:
            r11.append(r2)
        Lec:
            java.lang.String[] r11 = new java.lang.String[r1]
            java.lang.String r0 = "S"
            r11[r4] = r0
            r11[r5] = r13
            boolean r10 = contains(r10, r3, r5, r11)
            if (r10 == 0) goto Lfc
            goto L5e
        Lfc:
            r12 = r3
            goto L108
        Lfe:
            if (r13 == 0) goto L104
            r11.append(r2)
            goto L107
        L104:
            r11.append(r2, r0)
        L107:
            int r12 = r12 + r3
        L108:
            return r12
    }

    private int handleSC(java.lang.String r13, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r14, int r15) {
            r12 = this;
            int r0 = r15 + 2
            char r1 = r12.charAt(r13, r0)
            r2 = 72
            r3 = 83
            java.lang.String r4 = "SK"
            r5 = 0
            r6 = 1
            r7 = 3
            r8 = 2
            if (r1 != r2) goto L6b
            int r0 = r15 + 3
            r1 = 6
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "OO"
            r1[r5] = r2
            java.lang.String r2 = "ER"
            r1[r6] = r2
            java.lang.String r9 = "EN"
            r1[r8] = r9
            java.lang.String r10 = "UY"
            r1[r7] = r10
            r10 = 4
            java.lang.String r11 = "ED"
            r1[r10] = r11
            r10 = 5
            java.lang.String r11 = "EM"
            r1[r10] = r11
            boolean r1 = contains(r13, r0, r8, r1)
            if (r1 == 0) goto L4d
            java.lang.String[] r1 = new java.lang.String[r8]
            r1[r5] = r2
            r1[r6] = r9
            boolean r13 = contains(r13, r0, r8, r1)
            if (r13 == 0) goto L49
            java.lang.String r13 = "X"
            r14.append(r13, r4)
            goto L86
        L49:
            r14.append(r4)
            goto L86
        L4d:
            r0 = 88
            if (r15 != 0) goto L67
            char r1 = r12.charAt(r13, r7)
            boolean r1 = r12.isVowel(r1)
            if (r1 != 0) goto L67
            char r13 = r12.charAt(r13, r7)
            r1 = 87
            if (r13 == r1) goto L67
            r14.append(r0, r3)
            goto L86
        L67:
            r14.append(r0)
            goto L86
        L6b:
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.String r2 = "I"
            r1[r5] = r2
            java.lang.String r2 = "E"
            r1[r6] = r2
            java.lang.String r2 = "Y"
            r1[r8] = r2
            boolean r13 = contains(r13, r0, r6, r1)
            if (r13 == 0) goto L83
            r14.append(r3)
            goto L86
        L83:
            r14.append(r4)
        L86:
            int r15 = r15 + r7
            return r15
    }

    private int handleT(java.lang.String r9, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r10, int r11) {
            r8 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "TION"
            r3 = 0
            r1[r3] = r2
            r2 = 4
            boolean r1 = contains(r9, r11, r2, r1)
            r4 = 3
            if (r1 != 0) goto L8f
            r1 = 2
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r6 = "TIA"
            r5[r3] = r6
            java.lang.String r6 = "TCH"
            r5[r0] = r6
            boolean r5 = contains(r9, r11, r4, r5)
            if (r5 == 0) goto L23
            goto L8f
        L23:
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r6 = "TH"
            r5[r3] = r6
            boolean r5 = contains(r9, r11, r1, r5)
            r6 = 84
            if (r5 != 0) goto L56
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r7 = "TTH"
            r5[r3] = r7
            boolean r5 = contains(r9, r11, r4, r5)
            if (r5 == 0) goto L3e
            goto L56
        L3e:
            r10.append(r6)
            int r10 = r11 + 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r4 = "T"
            r2[r3] = r4
            java.lang.String r3 = "D"
            r2[r0] = r3
            boolean r9 = contains(r9, r10, r0, r2)
            if (r9 == 0) goto L96
            int r10 = r11 + 2
            goto L96
        L56:
            int r11 = r11 + r1
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r7 = "OM"
            r5[r3] = r7
            java.lang.String r7 = "AM"
            r5[r0] = r7
            boolean r5 = contains(r9, r11, r1, r5)
            if (r5 != 0) goto L8a
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r5 = "VAN "
            r1[r3] = r5
            java.lang.String r5 = "VON "
            r1[r0] = r5
            boolean r1 = contains(r9, r3, r2, r1)
            if (r1 != 0) goto L8a
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "SCH"
            r0[r3] = r1
            boolean r9 = contains(r9, r3, r4, r0)
            if (r9 == 0) goto L84
            goto L8a
        L84:
            r9 = 48
            r10.append(r9, r6)
            goto L8d
        L8a:
            r10.append(r6)
        L8d:
            r10 = r11
            goto L96
        L8f:
            r9 = 88
            r10.append(r9)
            int r10 = r11 + 3
        L96:
            return r10
    }

    private int handleW(java.lang.String r10, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r11, int r12) {
            r9 = this;
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "WR"
            r3 = 0
            r1[r3] = r2
            r2 = 2
            boolean r1 = contains(r10, r12, r2, r1)
            if (r1 == 0) goto L17
            r10 = 82
            r11.append(r10)
            int r12 = r12 + r2
            goto La2
        L17:
            r1 = 70
            if (r12 != 0) goto L48
            int r4 = r12 + 1
            char r5 = r9.charAt(r10, r4)
            boolean r5 = r9.isVowel(r5)
            if (r5 != 0) goto L33
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r6 = "WH"
            r5[r3] = r6
            boolean r5 = contains(r10, r12, r2, r5)
            if (r5 == 0) goto L48
        L33:
            char r10 = r9.charAt(r10, r4)
            boolean r10 = r9.isVowel(r10)
            r12 = 65
            if (r10 == 0) goto L43
            r11.append(r12, r1)
            goto L46
        L43:
            r11.append(r12)
        L46:
            r12 = r4
            goto La2
        L48:
            int r4 = r10.length()
            int r4 = r4 - r0
            if (r12 != r4) goto L5b
            int r4 = r12 + (-1)
            char r4 = r9.charAt(r10, r4)
            boolean r4 = r9.isVowel(r4)
            if (r4 != 0) goto L9e
        L5b:
            int r4 = r12 + (-1)
            r5 = 4
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "EWSKI"
            r6[r3] = r7
            java.lang.String r7 = "EWSKY"
            r6[r0] = r7
            java.lang.String r7 = "OWSKI"
            r6[r2] = r7
            java.lang.String r7 = "OWSKY"
            r8 = 3
            r6[r8] = r7
            r7 = 5
            boolean r4 = contains(r10, r4, r7, r6)
            if (r4 != 0) goto L9e
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r6 = "SCH"
            r4[r3] = r6
            boolean r4 = contains(r10, r3, r8, r4)
            if (r4 == 0) goto L85
            goto L9e
        L85:
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r2 = "WICZ"
            r1[r3] = r2
            java.lang.String r2 = "WITZ"
            r1[r0] = r2
            boolean r10 = contains(r10, r12, r5, r1)
            if (r10 == 0) goto La1
            java.lang.String r10 = "TS"
            java.lang.String r0 = "FX"
            r11.append(r10, r0)
            int r12 = r12 + r5
            goto La2
        L9e:
            r11.appendAlternate(r1)
        La1:
            int r12 = r12 + r0
        La2:
            return r12
    }

    private int handleX(java.lang.String r7, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r8, int r9) {
            r6 = this;
            r0 = 1
            if (r9 != 0) goto La
            r7 = 83
            r8.append(r7)
            int r9 = r9 + r0
            goto L52
        La:
            int r1 = r7.length()
            int r1 = r1 - r0
            r2 = 0
            r3 = 2
            if (r9 != r1) goto L38
            int r1 = r9 + (-3)
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "IAU"
            r4[r2] = r5
            java.lang.String r5 = "EAU"
            r4[r0] = r5
            r5 = 3
            boolean r1 = contains(r7, r1, r5, r4)
            if (r1 != 0) goto L3d
            int r1 = r9 + (-2)
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "AU"
            r4[r2] = r5
            java.lang.String r5 = "OU"
            r4[r0] = r5
            boolean r1 = contains(r7, r1, r3, r4)
            if (r1 != 0) goto L3d
        L38:
            java.lang.String r1 = "KS"
            r8.append(r1)
        L3d:
            int r8 = r9 + 1
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r4 = "C"
            r1[r2] = r4
            java.lang.String r2 = "X"
            r1[r0] = r2
            boolean r7 = contains(r7, r8, r0, r1)
            if (r7 == 0) goto L51
            int r9 = r9 + r3
            goto L52
        L51:
            r9 = r8
        L52:
            return r9
    }

    private int handleZ(java.lang.String r6, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r7, int r8, boolean r9) {
            r5 = this;
            int r0 = r8 + 1
            char r1 = r5.charAt(r6, r0)
            r2 = 72
            r3 = 2
            if (r1 != r2) goto L12
            r6 = 74
            r7.append(r6)
            int r8 = r8 + r3
            goto L50
        L12:
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r4 = "ZO"
            r1[r2] = r4
            java.lang.String r2 = "ZI"
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "ZA"
            r1[r3] = r2
            boolean r1 = contains(r6, r0, r3, r1)
            if (r1 != 0) goto L3e
            if (r9 == 0) goto L38
            if (r8 <= 0) goto L38
            int r9 = r8 + (-1)
            char r9 = r5.charAt(r6, r9)
            r1 = 84
            if (r9 == r1) goto L38
            goto L3e
        L38:
            r9 = 83
            r7.append(r9)
            goto L45
        L3e:
            java.lang.String r9 = "S"
            java.lang.String r1 = "TS"
            r7.append(r9, r1)
        L45:
            char r6 = r5.charAt(r6, r0)
            r7 = 90
            if (r6 != r7) goto L4f
            int r0 = r8 + 2
        L4f:
            r8 = r0
        L50:
            return r8
    }

    private boolean isSilentStart(java.lang.String r6) {
            r5 = this;
            java.lang.String[] r0 = org.apache.commons.codec.language.DoubleMetaphone.SILENT_START
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L14
            r4 = r0[r3]
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L11
            r2 = 1
            goto L14
        L11:
            int r3 = r3 + 1
            goto L5
        L14:
            return r2
    }

    private boolean isSlavoGermanic(java.lang.String r3) {
            r2 = this;
            r0 = 87
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 > r1) goto L24
            r0 = 75
            int r0 = r3.indexOf(r0)
            if (r0 > r1) goto L24
            java.lang.String r0 = "CZ"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L24
            java.lang.String r0 = "WITZ"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = 0
            goto L25
        L24:
            r3 = 1
        L25:
            return r3
    }

    private boolean isVowel(char r2) {
            r1 = this;
            java.lang.String r0 = "AEIOUY"
            int r2 = r0.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    protected char charAt(java.lang.String r2, int r3) {
            r1 = this;
            if (r3 < 0) goto Le
            int r0 = r2.length()
            if (r3 < r0) goto L9
            goto Le
        L9:
            char r2 = r2.charAt(r3)
            return r2
        Le:
            r2 = 0
            return r2
    }

    public java.lang.String doubleMetaphone(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.doubleMetaphone(r2, r0)
            return r2
    }

    public java.lang.String doubleMetaphone(java.lang.String r8, boolean r9) {
            r7 = this;
            java.lang.String r8 = r7.cleanInput(r8)
            if (r8 != 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r7.isSlavoGermanic(r8)
            boolean r1 = r7.isSilentStart(r8)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult r2 = new org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult
            int r3 = r7.getMaxCodeLen()
            r2.<init>(r7, r3)
        L19:
            boolean r3 = r2.isComplete()
            if (r3 != 0) goto Lf9
            int r3 = r8.length()
            int r3 = r3 + (-1)
            if (r1 > r3) goto Lf9
            char r3 = r8.charAt(r1)
            r4 = 199(0xc7, float:2.79E-43)
            if (r3 == r4) goto Lf0
            r4 = 209(0xd1, float:2.93E-43)
            r5 = 78
            if (r3 == r4) goto Lec
            r4 = 75
            r6 = 70
            switch(r3) {
                case 65: goto Le6;
                case 66: goto Ld5;
                case 67: goto Lcf;
                case 68: goto Lc9;
                case 69: goto Le6;
                case 70: goto Lbd;
                case 71: goto Lb7;
                case 72: goto Lb1;
                case 73: goto Le6;
                case 74: goto Lab;
                case 75: goto L9f;
                case 76: goto L99;
                case 77: goto L8d;
                case 78: goto L81;
                case 79: goto Le6;
                case 80: goto L7c;
                case 81: goto L6e;
                case 82: goto L69;
                case 83: goto L64;
                case 84: goto L5f;
                case 85: goto Le6;
                case 86: goto L4d;
                case 87: goto L48;
                case 88: goto L43;
                case 89: goto Le6;
                case 90: goto L3e;
                default: goto L3c;
            }
        L3c:
            goto Lf5
        L3e:
            int r1 = r7.handleZ(r8, r2, r1, r0)
            goto L19
        L43:
            int r1 = r7.handleX(r8, r2, r1)
            goto L19
        L48:
            int r1 = r7.handleW(r8, r2, r1)
            goto L19
        L4d:
            r2.append(r6)
            int r3 = r1 + 1
            char r4 = r7.charAt(r8, r3)
            r5 = 86
            if (r4 != r5) goto L5d
        L5a:
            int r1 = r1 + 2
            goto L19
        L5d:
            r1 = r3
            goto L19
        L5f:
            int r1 = r7.handleT(r8, r2, r1)
            goto L19
        L64:
            int r1 = r7.handleS(r8, r2, r1, r0)
            goto L19
        L69:
            int r1 = r7.handleR(r8, r2, r1, r0)
            goto L19
        L6e:
            r2.append(r4)
            int r3 = r1 + 1
            char r4 = r7.charAt(r8, r3)
            r5 = 81
            if (r4 != r5) goto L5d
            goto L5a
        L7c:
            int r1 = r7.handleP(r8, r2, r1)
            goto L19
        L81:
            r2.append(r5)
            int r3 = r1 + 1
            char r4 = r7.charAt(r8, r3)
            if (r4 != r5) goto L5d
            goto L5a
        L8d:
            r3 = 77
            r2.append(r3)
            boolean r3 = r7.conditionM0(r8, r1)
            if (r3 == 0) goto Lf5
            goto L5a
        L99:
            int r1 = r7.handleL(r8, r2, r1)
            goto L19
        L9f:
            r2.append(r4)
            int r3 = r1 + 1
            char r5 = r7.charAt(r8, r3)
            if (r5 != r4) goto L5d
            goto L5a
        Lab:
            int r1 = r7.handleJ(r8, r2, r1, r0)
            goto L19
        Lb1:
            int r1 = r7.handleH(r8, r2, r1)
            goto L19
        Lb7:
            int r1 = r7.handleG(r8, r2, r1, r0)
            goto L19
        Lbd:
            r2.append(r6)
            int r3 = r1 + 1
            char r4 = r7.charAt(r8, r3)
            if (r4 != r6) goto L5d
            goto L5a
        Lc9:
            int r1 = r7.handleD(r8, r2, r1)
            goto L19
        Lcf:
            int r1 = r7.handleC(r8, r2, r1)
            goto L19
        Ld5:
            r3 = 80
            r2.append(r3)
            int r3 = r1 + 1
            char r4 = r7.charAt(r8, r3)
            r5 = 66
            if (r4 != r5) goto L5d
            goto L5a
        Le6:
            int r1 = r7.handleAEIOUY(r2, r1)
            goto L19
        Lec:
            r2.append(r5)
            goto Lf5
        Lf0:
            r3 = 83
            r2.append(r3)
        Lf5:
            int r1 = r1 + 1
            goto L19
        Lf9:
            if (r9 == 0) goto L100
            java.lang.String r8 = r2.getAlternate()
            goto L104
        L100:
            java.lang.String r8 = r2.getPrimary()
        L104:
            return r8
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.doubleMetaphone(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "DoubleMetaphone encode parameter is not of type String"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.doubleMetaphone(r1)
            return r1
    }

    public int getMaxCodeLen() {
            r1 = this;
            int r0 = r1.maxCodeLen
            return r0
    }

    public boolean isDoubleMetaphoneEqual(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.isDoubleMetaphoneEqual(r2, r3, r0)
            return r2
    }

    public boolean isDoubleMetaphoneEqual(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            java.lang.String r1 = r0.doubleMetaphone(r1, r3)
            java.lang.String r2 = r0.doubleMetaphone(r2, r3)
            boolean r1 = org.apache.commons.codec.binary.StringUtils.equals(r1, r2)
            return r1
    }

    public void setMaxCodeLen(int r1) {
            r0 = this;
            r0.maxCodeLen = r1
            return
    }
}
