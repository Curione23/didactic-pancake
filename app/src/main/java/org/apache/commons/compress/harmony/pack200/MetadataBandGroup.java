package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class MetadataBandGroup extends org.apache.commons.compress.harmony.pack200.BandSet {
    public static final int CONTEXT_CLASS = 0;
    public static final int CONTEXT_FIELD = 1;
    public static final int CONTEXT_METHOD = 2;
    public java.util.List<java.lang.String> T;
    public org.apache.commons.compress.harmony.pack200.IntList anno_N;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> caseD_KD;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> caseF_KF;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> caseI_KI;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> caseJ_KJ;
    public org.apache.commons.compress.harmony.pack200.IntList casearray_N;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> casec_RS;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> caseec_RU;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> caseet_RS;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> cases_RU;
    private final int context;
    private final org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> name_RU;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> nestname_RU;
    public org.apache.commons.compress.harmony.pack200.IntList nestpair_N;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> nesttype_RS;
    private int numBackwardsCalls;
    public org.apache.commons.compress.harmony.pack200.IntList pair_N;
    public org.apache.commons.compress.harmony.pack200.IntList param_NB;
    private final java.lang.String type;
    public java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> type_RS;

    public MetadataBandGroup(java.lang.String r1, int r2, org.apache.commons.compress.harmony.pack200.CpBands r3, org.apache.commons.compress.harmony.pack200.SegmentHeader r4, int r5) {
            r0 = this;
            r0.<init>(r5, r4)
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r0.param_NB = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r0.anno_N = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.type_RS = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r0.pair_N = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.name_RU = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.T = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.caseI_KI = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.caseD_KD = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.caseF_KF = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.caseJ_KJ = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.casec_RS = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.caseet_RS = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.caseec_RU = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.cases_RU = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r0.casearray_N = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.nesttype_RS = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r0.nestpair_N = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.nestname_RU = r4
            r0.type = r1
            r0.cpBands = r3
            r0.context = r2
            return
    }

    static /* synthetic */ int lambda$tagListToArray$7(java.lang.String r1) {
            r0 = 0
            char r1 = r1.charAt(r0)
            return r1
    }

    private java.lang.String nextString(java.util.Iterator<java.lang.Object> r1) {
            r0 = this;
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    private void removeOnePair() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.T
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.lang.String r0 = (java.lang.String) r0
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 64: goto La1;
                case 66: goto L96;
                case 67: goto L8b;
                case 68: goto L80;
                case 70: goto L75;
                case 73: goto L6a;
                case 74: goto L5f;
                case 83: goto L54;
                case 90: goto L46;
                case 91: goto L38;
                case 101: goto L2a;
                case 115: goto L1c;
                default: goto L1a;
            }
        L1a:
            goto Lab
        L1c:
            java.lang.String r1 = "s"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            goto Lab
        L26:
            r4 = 11
            goto Lab
        L2a:
            java.lang.String r1 = "e"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto Lab
        L34:
            r4 = 10
            goto Lab
        L38:
            java.lang.String r1 = "["
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto Lab
        L42:
            r4 = 9
            goto Lab
        L46:
            java.lang.String r1 = "Z"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            goto Lab
        L50:
            r4 = 8
            goto Lab
        L54:
            java.lang.String r1 = "S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto Lab
        L5d:
            r4 = 7
            goto Lab
        L5f:
            java.lang.String r1 = "J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L68
            goto Lab
        L68:
            r4 = 6
            goto Lab
        L6a:
            java.lang.String r1 = "I"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L73
            goto Lab
        L73:
            r4 = 5
            goto Lab
        L75:
            java.lang.String r1 = "F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7e
            goto Lab
        L7e:
            r4 = 4
            goto Lab
        L80:
            java.lang.String r1 = "D"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L89
            goto Lab
        L89:
            r4 = 3
            goto Lab
        L8b:
            java.lang.String r1 = "C"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L94
            goto Lab
        L94:
            r4 = 2
            goto Lab
        L96:
            java.lang.String r1 = "B"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9f
            goto Lab
        L9f:
            r4 = r2
            goto Lab
        La1:
            java.lang.String r1 = "@"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Laa
            goto Lab
        Laa:
            r4 = r3
        Lab:
            switch(r4) {
                case 0: goto L117;
                case 1: goto L10c;
                case 2: goto L10c;
                case 3: goto L101;
                case 4: goto Lf6;
                case 5: goto L10c;
                case 6: goto Leb;
                case 7: goto L10c;
                case 8: goto L10c;
                case 9: goto Ld3;
                case 10: goto Lbc;
                case 11: goto Lb0;
                default: goto Lae;
            }
        Lae:
            goto L139
        Lb0:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r5.cases_RU
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.remove(r1)
            goto L139
        Lbc:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r5.caseet_RS
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.remove(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r5.caseec_RU
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r1 = r5.caseet_RS
            int r1 = r1.size()
            int r1 = r1 - r2
            r0.remove(r1)
            goto L139
        Ld3:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.casearray_N
            int r1 = r0.size()
            int r1 = r1 - r2
            int r0 = r0.remove(r1)
            int r1 = r5.numBackwardsCalls
            int r1 = r1 - r0
            r5.numBackwardsCalls = r1
        Le3:
            if (r3 >= r0) goto L139
            r5.removeOnePair()
            int r3 = r3 + 1
            goto Le3
        Leb:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r0 = r5.caseJ_KJ
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.remove(r1)
            goto L139
        Lf6:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r0 = r5.caseF_KF
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.remove(r1)
            goto L139
        L101:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r0 = r5.caseD_KD
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.remove(r1)
            goto L139
        L10c:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r0 = r5.caseI_KI
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.remove(r1)
            goto L139
        L117:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r5.nesttype_RS
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.remove(r1)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.nestpair_N
            int r1 = r0.size()
            int r1 = r1 - r2
            int r0 = r0.remove(r1)
            int r1 = r5.numBackwardsCalls
            int r1 = r1 - r0
            r5.numBackwardsCalls = r1
        L131:
            if (r3 >= r0) goto L139
            r5.removeOnePair()
            int r3 = r3 + 1
            goto L131
        L139:
            return
    }

    private int[] tagListToArray(java.util.List<java.lang.String> r2) {
            r1 = this;
            java.util.stream.Stream r2 = r2.stream()
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.IntStream r2 = r2.mapToInt(r0)
            int[] r2 = r2.toArray()
            return r2
    }

    public void addAnnotation(java.lang.String r3, java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5, java.util.List<java.lang.Object> r6, java.util.List<java.lang.Integer> r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.util.List<java.lang.Integer> r10) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r2.type_RS
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r3 = r1.getCPSignature(r3)
            r0.add(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r2.pair_N
            int r0 = r4.size()
            r3.add(r0)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda1 r3 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda1
            r3.<init>(r2)
            r4.forEach(r3)
            java.util.Iterator r3 = r6.iterator()
            java.util.Iterator r4 = r5.iterator()
        L24:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L14e
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.List<java.lang.String> r6 = r2.T
            r6.add(r5)
            r5.hashCode()
            int r6 = r5.hashCode()
            r0 = -1
            switch(r6) {
                case 66: goto Lb9;
                case 67: goto Lae;
                case 68: goto La3;
                case 70: goto L98;
                case 73: goto L8d;
                case 74: goto L82;
                case 83: goto L77;
                case 90: goto L6c;
                case 99: goto L5e;
                case 101: goto L50;
                case 115: goto L42;
                default: goto L40;
            }
        L40:
            goto Lc3
        L42:
            java.lang.String r6 = "s"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L4c
            goto Lc3
        L4c:
            r0 = 10
            goto Lc3
        L50:
            java.lang.String r6 = "e"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L5a
            goto Lc3
        L5a:
            r0 = 9
            goto Lc3
        L5e:
            java.lang.String r6 = "c"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L68
            goto Lc3
        L68:
            r0 = 8
            goto Lc3
        L6c:
            java.lang.String r6 = "Z"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L75
            goto Lc3
        L75:
            r0 = 7
            goto Lc3
        L77:
            java.lang.String r6 = "S"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L80
            goto Lc3
        L80:
            r0 = 6
            goto Lc3
        L82:
            java.lang.String r6 = "J"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L8b
            goto Lc3
        L8b:
            r0 = 5
            goto Lc3
        L8d:
            java.lang.String r6 = "I"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L96
            goto Lc3
        L96:
            r0 = 4
            goto Lc3
        L98:
            java.lang.String r6 = "F"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto La1
            goto Lc3
        La1:
            r0 = 3
            goto Lc3
        La3:
            java.lang.String r6 = "D"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lac
            goto Lc3
        Lac:
            r0 = 2
            goto Lc3
        Lae:
            java.lang.String r6 = "C"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lb7
            goto Lc3
        Lb7:
            r0 = 1
            goto Lc3
        Lb9:
            java.lang.String r6 = "B"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lc2
            goto Lc3
        Lc2:
            r0 = 0
        Lc3:
            switch(r0) {
                case 0: goto L13d;
                case 1: goto L13d;
                case 2: goto L12c;
                case 3: goto L11b;
                case 4: goto L13d;
                case 5: goto L10a;
                case 6: goto L13d;
                case 7: goto L13d;
                case 8: goto Lf9;
                case 9: goto Ld9;
                case 10: goto Lc8;
                default: goto Lc6;
            }
        Lc6:
            goto L24
        Lc8:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r5 = r2.cases_RU
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.String r0 = r2.nextString(r3)
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = r6.getCPUtf8(r0)
            r5.add(r6)
            goto L24
        Ld9:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r5 = r2.caseet_RS
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.String r0 = r2.nextString(r3)
            org.apache.commons.compress.harmony.pack200.CPSignature r6 = r6.getCPSignature(r0)
            r5.add(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r5 = r2.caseec_RU
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.String r0 = r2.nextString(r3)
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = r6.getCPUtf8(r0)
            r5.add(r6)
            goto L24
        Lf9:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r5 = r2.casec_RS
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.String r0 = r2.nextString(r3)
            org.apache.commons.compress.harmony.pack200.CPSignature r6 = r6.getCPSignature(r0)
            r5.add(r6)
            goto L24
        L10a:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r5 = r2.caseJ_KJ
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.Object r0 = r3.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r6 = r6.getConstant(r0)
            r5.add(r6)
            goto L24
        L11b:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r5 = r2.caseF_KF
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.Object r0 = r3.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r6 = r6.getConstant(r0)
            r5.add(r6)
            goto L24
        L12c:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r5 = r2.caseD_KD
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.Object r0 = r3.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r6 = r6.getConstant(r0)
            r5.add(r6)
            goto L24
        L13d:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r5 = r2.caseI_KI
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r2.cpBands
            java.lang.Object r0 = r3.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r6 = r6.getConstant(r0)
            r5.add(r6)
            goto L24
        L14e:
            java.util.Iterator r3 = r7.iterator()
        L152:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L16d
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            org.apache.commons.compress.harmony.pack200.IntList r5 = r2.casearray_N
            r5.add(r4)
            int r5 = r2.numBackwardsCalls
            int r5 = r5 + r4
            r2.numBackwardsCalls = r5
            goto L152
        L16d:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda2 r3 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda2
            r3.<init>(r2)
            r8.forEach(r3)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda3 r3 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda3
            r3.<init>(r2)
            r9.forEach(r3)
            java.util.Iterator r3 = r10.iterator()
        L181:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1a0
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            org.apache.commons.compress.harmony.pack200.IntList r5 = r2.nestpair_N
            int r6 = r4.intValue()
            r5.add(r6)
            int r5 = r2.numBackwardsCalls
            int r4 = r4.intValue()
            int r5 = r5 + r4
            r2.numBackwardsCalls = r5
            goto L181
        L1a0:
            return
    }

    public void addParameterAnnotation(int r5, int[] r6, org.apache.commons.compress.harmony.pack200.IntList r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.util.List<java.lang.String> r10, java.util.List<java.lang.Object> r11, java.util.List<java.lang.Integer> r12, java.util.List<java.lang.String> r13, java.util.List<java.lang.String> r14, java.util.List<java.lang.Integer> r15) {
            r4 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.param_NB
            r0.add(r5)
            int r5 = r6.length
            r0 = 0
            r1 = r0
        L8:
            if (r1 >= r5) goto L14
            r2 = r6[r1]
            org.apache.commons.compress.harmony.pack200.IntList r3 = r4.anno_N
            r3.add(r2)
            int r1 = r1 + 1
            goto L8
        L14:
            org.apache.commons.compress.harmony.pack200.IntList r5 = r4.pair_N
            r5.addAll(r7)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda4 r5 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda4
            r5.<init>(r4)
            r8.forEach(r5)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda5 r5 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda5
            r5.<init>(r4)
            r9.forEach(r5)
            java.util.Iterator r5 = r11.iterator()
            java.util.Iterator r6 = r10.iterator()
        L31:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L15b
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.List<java.lang.String> r8 = r4.T
            r8.add(r7)
            r7.hashCode()
            int r8 = r7.hashCode()
            r9 = -1
            switch(r8) {
                case 66: goto Lc6;
                case 67: goto Lbb;
                case 68: goto Lb0;
                case 70: goto La5;
                case 73: goto L9a;
                case 74: goto L8f;
                case 83: goto L84;
                case 90: goto L79;
                case 99: goto L6b;
                case 101: goto L5d;
                case 115: goto L4f;
                default: goto L4d;
            }
        L4d:
            goto Ld0
        L4f:
            java.lang.String r8 = "s"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L59
            goto Ld0
        L59:
            r9 = 10
            goto Ld0
        L5d:
            java.lang.String r8 = "e"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L67
            goto Ld0
        L67:
            r9 = 9
            goto Ld0
        L6b:
            java.lang.String r8 = "c"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L75
            goto Ld0
        L75:
            r9 = 8
            goto Ld0
        L79:
            java.lang.String r8 = "Z"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L82
            goto Ld0
        L82:
            r9 = 7
            goto Ld0
        L84:
            java.lang.String r8 = "S"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L8d
            goto Ld0
        L8d:
            r9 = 6
            goto Ld0
        L8f:
            java.lang.String r8 = "J"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L98
            goto Ld0
        L98:
            r9 = 5
            goto Ld0
        L9a:
            java.lang.String r8 = "I"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto La3
            goto Ld0
        La3:
            r9 = 4
            goto Ld0
        La5:
            java.lang.String r8 = "F"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto Lae
            goto Ld0
        Lae:
            r9 = 3
            goto Ld0
        Lb0:
            java.lang.String r8 = "D"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto Lb9
            goto Ld0
        Lb9:
            r9 = 2
            goto Ld0
        Lbb:
            java.lang.String r8 = "C"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto Lc4
            goto Ld0
        Lc4:
            r9 = 1
            goto Ld0
        Lc6:
            java.lang.String r8 = "B"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto Lcf
            goto Ld0
        Lcf:
            r9 = r0
        Ld0:
            switch(r9) {
                case 0: goto L14a;
                case 1: goto L14a;
                case 2: goto L139;
                case 3: goto L128;
                case 4: goto L14a;
                case 5: goto L117;
                case 6: goto L14a;
                case 7: goto L14a;
                case 8: goto L106;
                case 9: goto Le6;
                case 10: goto Ld5;
                default: goto Ld3;
            }
        Ld3:
            goto L31
        Ld5:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r7 = r4.cases_RU
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.String r9 = r4.nextString(r5)
            org.apache.commons.compress.harmony.pack200.CPUTF8 r8 = r8.getCPUtf8(r9)
            r7.add(r8)
            goto L31
        Le6:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r7 = r4.caseet_RS
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.String r9 = r4.nextString(r5)
            org.apache.commons.compress.harmony.pack200.CPSignature r8 = r8.getCPSignature(r9)
            r7.add(r8)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r7 = r4.caseec_RU
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.String r9 = r4.nextString(r5)
            org.apache.commons.compress.harmony.pack200.CPUTF8 r8 = r8.getCPUtf8(r9)
            r7.add(r8)
            goto L31
        L106:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r7 = r4.casec_RS
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.String r9 = r4.nextString(r5)
            org.apache.commons.compress.harmony.pack200.CPSignature r8 = r8.getCPSignature(r9)
            r7.add(r8)
            goto L31
        L117:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r7 = r4.caseJ_KJ
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.Object r9 = r5.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r8 = r8.getConstant(r9)
            r7.add(r8)
            goto L31
        L128:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r7 = r4.caseF_KF
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.Object r9 = r5.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r8 = r8.getConstant(r9)
            r7.add(r8)
            goto L31
        L139:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r7 = r4.caseD_KD
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.Object r9 = r5.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r8 = r8.getConstant(r9)
            r7.add(r8)
            goto L31
        L14a:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r7 = r4.caseI_KI
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r4.cpBands
            java.lang.Object r9 = r5.next()
            org.apache.commons.compress.harmony.pack200.CPConstant r8 = r8.getConstant(r9)
            r7.add(r8)
            goto L31
        L15b:
            java.util.Iterator r5 = r12.iterator()
        L15f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L17a
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            org.apache.commons.compress.harmony.pack200.IntList r7 = r4.casearray_N
            r7.add(r6)
            int r7 = r4.numBackwardsCalls
            int r7 = r7 + r6
            r4.numBackwardsCalls = r7
            goto L15f
        L17a:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda6 r5 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda6
            r5.<init>(r4)
            r13.forEach(r5)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda7 r5 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda7
            r5.<init>(r4)
            r14.forEach(r5)
            java.util.Iterator r5 = r15.iterator()
        L18e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1ad
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            org.apache.commons.compress.harmony.pack200.IntList r7 = r4.nestpair_N
            int r8 = r6.intValue()
            r7.add(r8)
            int r7 = r4.numBackwardsCalls
            int r6 = r6.intValue()
            int r7 = r7 + r6
            r4.numBackwardsCalls = r7
            goto L18e
        L1ad:
            return
    }

    public boolean hasContent() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r1.type_RS
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public void incrementAnnoN() {
            r2 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.anno_N
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.increment(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$addAnnotation$0$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m2554x38f307eb(java.lang.String r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r2.name_RU
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r1.getCPUtf8(r3)
            r0.add(r3)
            return
    }

    /* JADX INFO: renamed from: lambda$addAnnotation$1$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m2555x2c828c2c(java.lang.String r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r2.nesttype_RS
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r3 = r1.getCPSignature(r3)
            r0.add(r3)
            return
    }

    /* JADX INFO: renamed from: lambda$addAnnotation$2$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m2556x2012106d(java.lang.String r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r2.nestname_RU
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r1.getCPUtf8(r3)
            r0.add(r3)
            return
    }

    /* JADX INFO: renamed from: lambda$addParameterAnnotation$3$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m2557x334022ef(java.lang.String r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r2.type_RS
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r3 = r1.getCPSignature(r3)
            r0.add(r3)
            return
    }

    /* JADX INFO: renamed from: lambda$addParameterAnnotation$4$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m2558x26cfa730(java.lang.String r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r2.name_RU
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r1.getCPUtf8(r3)
            r0.add(r3)
            return
    }

    /* JADX INFO: renamed from: lambda$addParameterAnnotation$5$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m2559x1a5f2b71(java.lang.String r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r2.nesttype_RS
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r3 = r1.getCPSignature(r3)
            r0.add(r3)
            return
    }

    /* JADX INFO: renamed from: lambda$addParameterAnnotation$6$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m2560xdeeafb2(java.lang.String r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r2.nestname_RU
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r1.getCPUtf8(r3)
            r0.add(r3)
            return
    }

    public void newEntryInAnnoN() {
            r2 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.anno_N
            r1 = 1
            r0.add(r1)
            return
    }

    public int numBackwardsCalls() {
            r1 = this;
            int r0 = r1.numBackwardsCalls
            return r0
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r9 = this;
            java.lang.String r0 = "Writing metadata band group..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            boolean r0 = r9.hasContent()
            if (r0 == 0) goto L72b
            int r0 = r9.context
            if (r0 != 0) goto L12
            java.lang.String r0 = "Class"
            goto L1a
        L12:
            r1 = 1
            if (r0 != r1) goto L18
            java.lang.String r0 = "Field"
            goto L1a
        L18:
            java.lang.String r0 = "Method"
        L1a:
            java.lang.String r1 = r9.type
            java.lang.String r2 = "AD"
            boolean r1 = r1.equals(r2)
            java.lang.String r2 = "]"
            java.lang.String r3 = " bytes from "
            java.lang.String r4 = "Wrote "
            java.lang.String r5 = "_"
            if (r1 != 0) goto L224
            java.lang.String r1 = r9.type
            r6 = 80
            int r1 = r1.indexOf(r6)
            r6 = -1
            java.lang.String r7 = " anno_N["
            if (r1 == r6) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " param_NB"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.param_NB
            int[] r6 = r6.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            byte[] r1 = r9.encodeBandInt(r1, r6, r8)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r7)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.param_NB
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " anno_N"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.anno_N
            int[] r6 = r6.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r8)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r7)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.anno_N
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " type_RS"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.type_RS
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " type_RS["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.type_RS
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " pair_N"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.pair_N
            int[] r6 = r6.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " pair_N["
            java.lang.StringBuilder r1 = r1.append(r6)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.pair_N
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " name_RU"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r9.name_RU
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " name_RU["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r9.name_RU
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
        L224:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " T"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<java.lang.String> r6 = r9.T
            int[] r6 = r9.tagListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " T["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<java.lang.String> r6 = r9.T
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseI_KI"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseI_KI
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseI_KI["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseI_KI
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseD_KD"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseD_KD
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseD_KD["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseD_KD
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseF_KF"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseF_KF
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseF_KF["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseF_KF
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseJ_KJ"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseJ_KJ
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseJ_KJ["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r6 = r9.caseJ_KJ
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " casec_RS"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.casec_RS
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " casec_RS["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.casec_RS
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseet_RS"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.caseet_RS
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseet_RS["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.caseet_RS
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseec_RU"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r9.caseec_RU
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " caseec_RU["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r9.caseec_RU
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " cases_RU"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r9.cases_RU
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " cases_RU["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r9.cases_RU
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " casearray_N"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.casearray_N
            int[] r6 = r6.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " casearray_N["
            java.lang.StringBuilder r1 = r1.append(r6)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.casearray_N
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " nesttype_RS"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.nesttype_RS
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " nesttype_RS["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r6 = r9.nesttype_RS
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " nestpair_N"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.nestpair_N
            int[] r6 = r6.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " nestpair_N["
            java.lang.StringBuilder r1 = r1.append(r6)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r9.nestpair_N
            int r6 = r6.size()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r6 = r9.type
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r6 = " nestname_RU"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r9.nestname_RU
            int[] r6 = r9.cpEntryListToArray(r6)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r9.encodeBandInt(r1, r6, r7)
            r10.write(r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r4)
            int r1 = r1.length
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r0 = r9.type
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = " nestname_RU["
            java.lang.StringBuilder r10 = r10.append(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r9.nestname_RU
            int r0 = r0.size()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r10 = r10.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r10)
        L72b:
            return
    }

    public void removeLatest() {
            r5 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.anno_N
            int r1 = r0.size()
            int r1 = r1 + (-1)
            int r0 = r0.remove(r1)
            r1 = 0
            r2 = r1
        Le:
            if (r2 >= r0) goto L33
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r3 = r5.type_RS
            int r4 = r3.size()
            int r4 = r4 + (-1)
            r3.remove(r4)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.pair_N
            int r4 = r3.size()
            int r4 = r4 + (-1)
            int r3 = r3.remove(r4)
            r4 = r1
        L28:
            if (r4 >= r3) goto L30
            r5.removeOnePair()
            int r4 = r4 + 1
            goto L28
        L30:
            int r2 = r2 + 1
            goto Le
        L33:
            return
    }
}
