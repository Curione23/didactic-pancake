package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
public class MatchRatingApproachEncoder implements org.apache.commons.codec.StringEncoder {
    private static final java.lang.String[] DOUBLE_CONSONANT = null;
    private static final java.lang.String EMPTY = "";
    private static final java.lang.String PLAIN_ASCII = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final java.lang.String SPACE = " ";
    private static final java.lang.String UNICODE = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű";

    static {
            r0 = 21
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "BB"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "CC"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "DD"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "FF"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "GG"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "HH"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "JJ"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "KK"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "LL"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "MM"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "NN"
            r0[r1] = r2
            r1 = 11
            java.lang.String r2 = "PP"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "QQ"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "RR"
            r0[r1] = r2
            r1 = 14
            java.lang.String r2 = "SS"
            r0[r1] = r2
            r1 = 15
            java.lang.String r2 = "TT"
            r0[r1] = r2
            r1 = 16
            java.lang.String r2 = "VV"
            r0[r1] = r2
            r1 = 17
            java.lang.String r2 = "WW"
            r0[r1] = r2
            r1 = 18
            java.lang.String r2 = "XX"
            r0[r1] = r2
            r1 = 19
            java.lang.String r2 = "YY"
            r0[r1] = r2
            r1 = 20
            java.lang.String r2 = "ZZ"
            r0[r1] = r2
            org.apache.commons.codec.language.MatchRatingApproachEncoder.DOUBLE_CONSONANT = r0
            return
    }

    public MatchRatingApproachEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    java.lang.String cleanName(java.lang.String r6) {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toUpperCase(r0)
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "\\-"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "[&]"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "\\'"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "\\."
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "[\\,]"
            r1[r2] = r4
        L22:
            java.lang.String r2 = ""
            if (r3 >= r0) goto L2f
            r4 = r1[r3]
            java.lang.String r6 = r6.replaceAll(r4, r2)
            int r3 = r3 + 1
            goto L22
        L2f:
            java.lang.String r6 = r5.removeAccents(r6)
            java.lang.String r0 = "\\s+"
            java.lang.String r6 = r6.replaceAll(r0, r2)
            return r6
    }

    @Override // org.apache.commons.codec.Encoder
    public final java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r1.encode(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "Parameter supplied to Match Rating Approach encoder is not of type java.lang.String"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final java.lang.String encode(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = ""
            if (r5 == 0) goto L45
            boolean r1 = r0.equalsIgnoreCase(r5)
            if (r1 != 0) goto L45
            java.lang.String r1 = " "
            boolean r2 = r1.equalsIgnoreCase(r5)
            if (r2 != 0) goto L45
            int r2 = r5.length()
            r3 = 1
            if (r2 != r3) goto L1a
            goto L45
        L1a:
            java.lang.String r5 = r4.cleanName(r5)
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L45
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L2b
            goto L45
        L2b:
            java.lang.String r5 = r4.removeVowels(r5)
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L45
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L3c
            goto L45
        L3c:
            java.lang.String r5 = r4.removeDoubleConsonants(r5)
            java.lang.String r5 = r4.getFirst3Last3(r5)
            return r5
        L45:
            return r0
    }

    java.lang.String getFirst3Last3(java.lang.String r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 6
            if (r0 <= r1) goto L24
            r1 = 0
            r2 = 3
            java.lang.String r1 = r4.substring(r1, r2)
            int r2 = r0 + (-3)
            java.lang.String r4 = r4.substring(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
        L24:
            return r4
    }

    int getMinRating(int r3) {
            r2 = this;
            r0 = 4
            if (r3 > r0) goto L5
            r0 = 5
            goto L16
        L5:
            r1 = 7
            if (r3 > r1) goto L9
            goto L16
        L9:
            r0 = 11
            if (r3 > r0) goto Lf
            r0 = 3
            goto L16
        Lf:
            r0 = 12
            if (r3 != r0) goto L15
            r0 = 2
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    public boolean isEncodeEquals(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L81
            java.lang.String r1 = ""
            boolean r2 = r1.equalsIgnoreCase(r5)
            if (r2 != 0) goto L81
            java.lang.String r2 = " "
            boolean r3 = r2.equalsIgnoreCase(r5)
            if (r3 == 0) goto L14
            goto L81
        L14:
            if (r6 == 0) goto L81
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 != 0) goto L81
            boolean r1 = r2.equalsIgnoreCase(r6)
            if (r1 == 0) goto L23
            goto L81
        L23:
            int r1 = r5.length()
            r2 = 1
            if (r1 == r2) goto L81
            int r1 = r6.length()
            if (r1 != r2) goto L31
            goto L81
        L31:
            boolean r1 = r5.equalsIgnoreCase(r6)
            if (r1 == 0) goto L38
            return r2
        L38:
            java.lang.String r5 = r4.cleanName(r5)
            java.lang.String r6 = r4.cleanName(r6)
            java.lang.String r5 = r4.removeVowels(r5)
            java.lang.String r6 = r4.removeVowels(r6)
            java.lang.String r5 = r4.removeDoubleConsonants(r5)
            java.lang.String r6 = r4.removeDoubleConsonants(r6)
            java.lang.String r5 = r4.getFirst3Last3(r5)
            java.lang.String r6 = r4.getFirst3Last3(r6)
            int r1 = r5.length()
            int r3 = r6.length()
            int r1 = r1 - r3
            int r1 = java.lang.Math.abs(r1)
            r3 = 3
            if (r1 < r3) goto L69
            return r0
        L69:
            int r1 = r5.length()
            int r3 = r6.length()
            int r1 = r1 + r3
            int r1 = java.lang.Math.abs(r1)
            int r1 = r4.getMinRating(r1)
            int r5 = r4.leftToRightThenRightToLeftProcessing(r5, r6)
            if (r5 < r1) goto L81
            r0 = r2
        L81:
            return r0
    }

    boolean isVowel(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "E"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "A"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "O"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "I"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "U"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L29
            goto L2b
        L29:
            r2 = 0
            goto L2c
        L2b:
            r2 = 1
        L2c:
            return r2
    }

    int leftToRightThenRightToLeftProcessing(java.lang.String r13, java.lang.String r14) {
            r12 = this;
            char[] r0 = r13.toCharArray()
            char[] r1 = r14.toCharArray()
            int r2 = r13.length()
            int r2 = r2 + (-1)
            int r3 = r14.length()
            int r3 = r3 + (-1)
            r4 = 0
        L15:
            int r5 = r0.length
            if (r4 >= r5) goto L4d
            if (r4 <= r3) goto L1b
            goto L4d
        L1b:
            int r5 = r4 + 1
            java.lang.String r6 = r13.substring(r4, r5)
            int r7 = r2 - r4
            int r8 = r7 + 1
            java.lang.String r8 = r13.substring(r7, r8)
            java.lang.String r9 = r14.substring(r4, r5)
            int r10 = r3 - r4
            int r11 = r10 + 1
            java.lang.String r11 = r14.substring(r10, r11)
            boolean r6 = r6.equals(r9)
            r9 = 32
            if (r6 == 0) goto L41
            r0[r4] = r9
            r1[r4] = r9
        L41:
            boolean r4 = r8.equals(r11)
            if (r4 == 0) goto L4b
            r0[r7] = r9
            r1[r10] = r9
        L4b:
            r4 = r5
            goto L15
        L4d:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
            java.lang.String r14 = "\\s+"
            java.lang.String r0 = ""
            java.lang.String r13 = r13.replaceAll(r14, r0)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            java.lang.String r14 = r2.replaceAll(r14, r0)
            int r0 = r13.length()
            int r1 = r14.length()
            if (r0 <= r1) goto L78
            int r13 = r13.length()
            int r13 = 6 - r13
            int r13 = java.lang.Math.abs(r13)
            return r13
        L78:
            int r13 = r14.length()
            int r13 = 6 - r13
            int r13 = java.lang.Math.abs(r13)
            return r13
    }

    java.lang.String removeAccents(java.lang.String r7) {
            r6 = this;
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r7.length()
            r2 = 0
        Le:
            if (r2 >= r1) goto L2d
            char r3 = r7.charAt(r2)
            java.lang.String r4 = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű"
            int r4 = r4.indexOf(r3)
            r5 = -1
            if (r4 <= r5) goto L27
            java.lang.String r3 = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu"
            char r3 = r3.charAt(r4)
            r0.append(r3)
            goto L2a
        L27:
            r0.append(r3)
        L2a:
            int r2 = r2 + 1
            goto Le
        L2d:
            java.lang.String r7 = r0.toString()
            return r7
    }

    java.lang.String removeDoubleConsonants(java.lang.String r7) {
            r6 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r7 = r7.toUpperCase(r0)
            java.lang.String[] r0 = org.apache.commons.codec.language.MatchRatingApproachEncoder.DOUBLE_CONSONANT
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L21
            r4 = r0[r3]
            boolean r5 = r7.contains(r4)
            if (r5 == 0) goto L1e
            r5 = 1
            java.lang.String r5 = r4.substring(r2, r5)
            java.lang.String r7 = r7.replace(r4, r5)
        L1e:
            int r3 = r3 + 1
            goto Lb
        L21:
            return r7
    }

    java.lang.String removeVowels(java.lang.String r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.lang.String r0 = r4.substring(r0, r1)
            java.lang.String r1 = "A"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r1 = "E"
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r1 = "I"
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r1 = "O"
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r1 = "U"
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r1 = "\\s{2,}\\b"
            java.lang.String r2 = " "
            java.lang.String r4 = r4.replaceAll(r1, r2)
            boolean r1 = r3.isVowel(r0)
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
        L45:
            return r4
    }
}
