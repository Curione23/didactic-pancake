package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class MetadataBandGroup {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 riaUTF8;
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 ripaUTF8;
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 rvaUTF8;
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 rvpaUTF8;
    public int[] T;
    private int T_index;
    public int[] anno_N;
    private int anno_N_Index;
    private java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> attributes;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[] caseD_KD;
    private int caseD_KD_Index;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[] caseF_KF;
    private int caseF_KF_Index;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[] caseI_KI;
    private int caseI_KI_Index;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[] caseJ_KJ;
    private int caseJ_KJ_Index;
    public int[] casearray_N;
    private int casearray_N_Index;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] casec_RS;
    private int casec_RS_Index;
    public java.lang.String[] caseec_RU;
    private int caseec_RU_Index;
    public java.lang.String[] caseet_RS;
    private int caseet_RS_Index;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] cases_RU;
    private int cases_RU_Index;
    private final org.apache.commons.compress.harmony.unpack200.CpBands cpBands;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] name_RU;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] nestname_RU;
    private java.util.Iterator<org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> nestname_RU_Iterator;
    public int[] nestpair_N;
    private int nestpair_N_Index;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] nesttype_RS;
    private int nesttype_RS_Index;
    public int[][] pair_N;
    private int pair_N_Index;
    public int[] param_NB;
    private final java.lang.String type;
    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] type_RS;

    public MetadataBandGroup(java.lang.String r1, org.apache.commons.compress.harmony.unpack200.CpBands r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.cpBands = r2
            return
    }

    private org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation getAnnotation(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r7, int r8, java.util.Iterator<org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r9) {
            r6 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r8]
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[r8]
            r2 = 0
        L5:
            if (r2 >= r8) goto L27
            java.lang.Object r3 = r9.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r3
            r0[r2] = r3
            int[] r3 = r6.T
            int r4 = r6.T_index
            int r5 = r4 + 1
            r6.T_index = r5
            r3 = r3[r4]
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue
            java.lang.Object r5 = r6.getNextValue(r3)
            r4.<init>(r3, r5)
            r1[r2] = r4
            int r2 = r2 + 1
            goto L5
        L27:
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r9 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation
            r9.<init>(r8, r7, r0, r1)
            return r9
    }

    private org.apache.commons.compress.harmony.unpack200.bytecode.Attribute getAttribute(int r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r3, int[] r4, java.util.Iterator<org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r5) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation[r2]
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.harmony.unpack200.MetadataBandGroup$$ExternalSyntheticLambda1
            r0.<init>(r1, r3, r4, r5)
            java.util.Arrays.setAll(r2, r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute
            java.lang.String r4 = r1.type
            java.lang.String r5 = "RVA"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L19
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4 = org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.rvaUTF8
            goto L1b
        L19:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4 = org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.riaUTF8
        L1b:
            r3.<init>(r4, r2)
            return r3
    }

    private java.lang.Object getNextValue(int r6) {
            r5 = this;
            r0 = 64
            if (r6 == r0) goto Lc9
            r0 = 70
            if (r6 == r0) goto Lbe
            r0 = 83
            if (r6 == r0) goto Lb3
            r0 = 99
            if (r6 == r0) goto La8
            r0 = 101(0x65, float:1.42E-43)
            if (r6 == r0) goto L76
            r0 = 115(0x73, float:1.61E-43)
            if (r6 == r0) goto L6b
            r0 = 73
            if (r6 == r0) goto Lb3
            r0 = 74
            if (r6 == r0) goto L60
            r0 = 90
            if (r6 == r0) goto Lb3
            r0 = 91
            if (r6 == r0) goto L38
            switch(r6) {
                case 66: goto Lb3;
                case 67: goto Lb3;
                case 68: goto L2d;
                default: goto L2b;
            }
        L2b:
            r6 = 0
            return r6
        L2d:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[] r6 = r5.caseD_KD
            int r0 = r5.caseD_KD_Index
            int r1 = r0 + 1
            r5.caseD_KD_Index = r1
            r6 = r6[r0]
            return r6
        L38:
            int[] r6 = r5.casearray_N
            int r0 = r5.casearray_N_Index
            int r1 = r0 + 1
            r5.casearray_N_Index = r1
            r6 = r6[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[r6]
            r1 = 0
        L45:
            if (r1 >= r6) goto L5f
            int[] r2 = r5.T
            int r3 = r5.T_index
            int r4 = r3 + 1
            r5.T_index = r4
            r2 = r2[r3]
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue
            java.lang.Object r4 = r5.getNextValue(r2)
            r3.<init>(r2, r4)
            r0[r1] = r3
            int r1 = r1 + 1
            goto L45
        L5f:
            return r0
        L60:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[] r6 = r5.caseJ_KJ
            int r0 = r5.caseJ_KJ_Index
            int r1 = r0 + 1
            r5.caseJ_KJ_Index = r1
            r6 = r6[r0]
            return r6
        L6b:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r6 = r5.cases_RU
            int r0 = r5.cases_RU_Index
            int r1 = r0 + 1
            r5.cases_RU_Index = r1
            r6 = r6[r0]
            return r6
        L76:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String[] r0 = r5.caseet_RS
            int r1 = r5.caseet_RS_Index
            int r2 = r1 + 1
            r5.caseet_RS_Index = r2
            r0 = r0[r1]
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = ":"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String[] r0 = r5.caseec_RU
            int r1 = r5.caseec_RU_Index
            int r2 = r1 + 1
            r5.caseec_RU_Index = r2
            r0 = r0[r1]
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r5.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r6 = r0.cpNameAndTypeValue(r6)
            return r6
        La8:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r6 = r5.casec_RS
            int r0 = r5.casec_RS_Index
            int r1 = r0 + 1
            r5.casec_RS_Index = r1
            r6 = r6[r0]
            return r6
        Lb3:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[] r6 = r5.caseI_KI
            int r0 = r5.caseI_KI_Index
            int r1 = r0 + 1
            r5.caseI_KI_Index = r1
            r6 = r6[r0]
            return r6
        Lbe:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[] r6 = r5.caseF_KF
            int r0 = r5.caseF_KF_Index
            int r1 = r0 + 1
            r5.caseF_KF_Index = r1
            r6 = r6[r0]
            return r6
        Lc9:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r6 = r5.nesttype_RS
            int r0 = r5.nesttype_RS_Index
            int r1 = r0 + 1
            r5.nesttype_RS_Index = r1
            r6 = r6[r0]
            int[] r0 = r5.nestpair_N
            int r1 = r5.nestpair_N_Index
            int r2 = r1 + 1
            r5.nestpair_N_Index = r2
            r0 = r0[r1]
            java.util.Iterator<org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r1 = r5.nestname_RU_Iterator
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r6 = r5.getAnnotation(r6, r0, r1)
            return r6
    }

    private org.apache.commons.compress.harmony.unpack200.bytecode.Attribute getParameterAttribute(int r7, java.util.Iterator<org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r8) {
            r6 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[r7]
            r1 = 0
        L3:
            if (r1 >= r7) goto L2d
            int[] r2 = r6.anno_N
            int r3 = r6.anno_N_Index
            int r4 = r3 + 1
            r6.anno_N_Index = r4
            r2 = r2[r3]
            int[][] r3 = r6.pair_N
            int r4 = r6.pair_N_Index
            int r5 = r4 + 1
            r6.pair_N_Index = r5
            r3 = r3[r4]
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation[r2]
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup$$ExternalSyntheticLambda0 r4 = new org.apache.commons.compress.harmony.unpack200.MetadataBandGroup$$ExternalSyntheticLambda0
            r4.<init>(r6, r3, r8)
            java.util.Arrays.setAll(r2, r4)
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation
            r3.<init>(r2)
            r0[r1] = r3
            int r1 = r1 + 1
            goto L3
        L2d:
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute r7 = new org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute
            java.lang.String r8 = r6.type
            java.lang.String r1 = "RVPA"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L3c
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r8 = org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.rvpaUTF8
            goto L3e
        L3c:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r8 = org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.ripaUTF8
        L3e:
            r7.<init>(r8, r0)
            return r7
    }

    public static void setRiaAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.riaUTF8 = r0
            return
    }

    public static void setRipaAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.ripaUTF8 = r0
            return
    }

    public static void setRvaAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.rvaUTF8 = r0
            return
    }

    public static void setRvpaAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.rvpaUTF8 = r0
            return
    }

    public java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> getAttributes() {
            r8 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r8.attributes
            if (r0 != 0) goto Lc6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.attributes = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r0 = r8.name_RU
            java.lang.String r1 = "AD"
            r2 = 0
            if (r0 == 0) goto La1
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r3 = r8.type
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L24
            r8.T_index = r2
        L24:
            r8.caseI_KI_Index = r2
            r8.caseD_KD_Index = r2
            r8.caseF_KF_Index = r2
            r8.caseJ_KJ_Index = r2
            r8.casec_RS_Index = r2
            r8.caseet_RS_Index = r2
            r8.caseec_RU_Index = r2
            r8.cases_RU_Index = r2
            r8.casearray_N_Index = r2
            r8.nesttype_RS_Index = r2
            r8.nestpair_N_Index = r2
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r8.nestname_RU
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Iterator r1 = r1.iterator()
            r8.nestname_RU_Iterator = r1
            java.lang.String r1 = r8.type
            java.lang.String r3 = "RVA"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L86
            java.lang.String r1 = r8.type
            java.lang.String r3 = "RIA"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5b
            goto L86
        L5b:
            java.lang.String r1 = r8.type
            java.lang.String r3 = "RVPA"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6f
            java.lang.String r1 = r8.type
            java.lang.String r3 = "RIPA"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc6
        L6f:
            r8.anno_N_Index = r2
            r8.pair_N_Index = r2
            int[] r1 = r8.param_NB
            int r3 = r1.length
        L76:
            if (r2 >= r3) goto Lc6
            r4 = r1[r2]
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r5 = r8.attributes
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r4 = r8.getParameterAttribute(r4, r0)
            r5.add(r4)
            int r2 = r2 + 1
            goto L76
        L86:
            int[] r1 = r8.anno_N
            int r3 = r1.length
            if (r2 >= r3) goto Lc6
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r3 = r8.attributes
            r1 = r1[r2]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r4 = r8.type_RS
            r4 = r4[r2]
            int[][] r5 = r8.pair_N
            r5 = r5[r2]
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r1 = r8.getAttribute(r1, r4, r5, r0)
            r3.add(r1)
            int r2 = r2 + 1
            goto L86
        La1:
            java.lang.String r0 = r8.type
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc6
            int[] r0 = r8.T
            int r1 = r0.length
        Lac:
            if (r2 >= r1) goto Lc6
            r3 = r0[r2]
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r4 = r8.attributes
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r6 = new org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue
            java.lang.Object r7 = r8.getNextValue(r3)
            r6.<init>(r3, r7)
            r5.<init>(r6)
            r4.add(r5)
            int r2 = r2 + 1
            goto Lac
        Lc6:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r8.attributes
            return r0
    }

    /* JADX INFO: renamed from: lambda$getAttribute$0$org-apache-commons-compress-harmony-unpack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation m2566x45564f82(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1, int[] r2, java.util.Iterator r3, int r4) {
            r0 = this;
            r1 = r1[r4]
            r2 = r2[r4]
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r1 = r0.getAnnotation(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: lambda$getParameterAttribute$1$org-apache-commons-compress-harmony-unpack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation m2567xa92456c(int[] r3, java.util.Iterator r4, int r5) {
            r2 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r0 = r2.type_RS
            int r1 = r2.anno_N_Index
            int r1 = r1 + (-1)
            r0 = r0[r1]
            r0 = r0[r5]
            r3 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r3 = r2.getAnnotation(r0, r3, r4)
            return r3
    }
}
