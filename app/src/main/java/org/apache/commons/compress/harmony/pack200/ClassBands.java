package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class ClassBands extends org.apache.commons.compress.harmony.pack200.BandSet {
    private static final long[] EMPTY_LONG_ARRAY = null;
    private boolean anySyntheticClasses;
    private boolean anySyntheticFields;
    private boolean anySyntheticMethods;
    private final org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands attrBands;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> classAttributeBands;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> classEnclosingMethodClass;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> classEnclosingMethodDesc;
    private final org.apache.commons.compress.harmony.pack200.IntList classFileVersionMajor;
    private final org.apache.commons.compress.harmony.pack200.IntList classFileVersionMinor;
    private java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> classInnerClassesNameRUN;
    private java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> classInnerClassesOuterRCN;
    private final java.util.Map<org.apache.commons.compress.harmony.pack200.CPClass, java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass>> classReferencesInnerClass;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> classSignature;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> classSourceFile;
    private int[] class_InnerClasses_F;
    private int[] class_InnerClasses_N;
    private org.apache.commons.compress.harmony.pack200.CPClass[] class_InnerClasses_RC;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup class_RIA_bands;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup class_RVA_bands;
    private int[] class_attr_calls;
    private final int[] class_field_count;
    private final long[] class_flags;
    private final org.apache.commons.compress.harmony.pack200.CPClass[][] class_interface;
    private final int[] class_interface_count;
    private final int[] class_method_count;
    private final org.apache.commons.compress.harmony.pack200.CPClass[] class_super;
    private final org.apache.commons.compress.harmony.pack200.CPClass[] class_this;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> codeAttributeBands;
    private final java.util.List<java.lang.Long> codeFlags;
    private final java.util.List codeHandlerCatchPO;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> codeHandlerClass;
    private final org.apache.commons.compress.harmony.pack200.IntList codeHandlerCount;
    private final java.util.List codeHandlerEndPO;
    private final java.util.List codeHandlerStartP;
    private int[] codeHeaders;
    private final java.util.List codeLineNumberTableBciP;
    private final org.apache.commons.compress.harmony.pack200.IntList codeLineNumberTableLine;
    private final org.apache.commons.compress.harmony.pack200.IntList codeLineNumberTableN;
    private final java.util.List codeLocalVariableTableBciP;
    private final org.apache.commons.compress.harmony.pack200.IntList codeLocalVariableTableN;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> codeLocalVariableTableNameRU;
    private final org.apache.commons.compress.harmony.pack200.IntList codeLocalVariableTableSlot;
    private final java.util.List codeLocalVariableTableSpanO;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> codeLocalVariableTableTypeRS;
    private final java.util.List codeLocalVariableTypeTableBciP;
    private final org.apache.commons.compress.harmony.pack200.IntList codeLocalVariableTypeTableN;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> codeLocalVariableTypeTableNameRU;
    private final org.apache.commons.compress.harmony.pack200.IntList codeLocalVariableTypeTableSlot;
    private final java.util.List codeLocalVariableTypeTableSpanO;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> codeLocalVariableTypeTableTypeRS;
    private final org.apache.commons.compress.harmony.pack200.IntList codeMaxLocals;
    private final org.apache.commons.compress.harmony.pack200.IntList codeMaxStack;
    private int[] code_attr_calls;
    private final org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> fieldAttributeBands;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> fieldConstantValueKQ;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> fieldSignature;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup field_RIA_bands;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup field_RVA_bands;
    private int[] field_attr_calls;
    private final org.apache.commons.compress.harmony.pack200.CPNameAndType[][] field_descr;
    private final long[][] field_flags;
    private int index;
    private final int[] major_versions;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> methodAttributeBands;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> methodExceptionClasses;
    private final org.apache.commons.compress.harmony.pack200.IntList methodExceptionNumber;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> methodSignature;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup method_AD_bands;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup method_RIA_bands;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup method_RIPA_bands;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup method_RVA_bands;
    private final org.apache.commons.compress.harmony.pack200.MetadataBandGroup method_RVPA_bands;
    private int[] method_attr_calls;
    private final org.apache.commons.compress.harmony.pack200.CPNameAndType[][] method_descr;
    private final long[][] method_flags;
    private int numMethodArgs;
    private final org.apache.commons.compress.harmony.pack200.Segment segment;
    private final boolean stripDebug;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> tempFieldDesc;
    private final java.util.List<java.lang.Long> tempFieldFlags;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> tempMethodDesc;
    private final java.util.List<java.lang.Long> tempMethodFlags;
    private org.apache.commons.compress.harmony.pack200.ClassBands.TempParamAnnotation tempMethodRIPA;
    private org.apache.commons.compress.harmony.pack200.ClassBands.TempParamAnnotation tempMethodRVPA;

    private static final class TempParamAnnotation {
        int[] annoN;
        java.util.List<java.lang.Integer> caseArrayN;
        java.util.List<java.lang.String> nameRU;
        java.util.List<java.lang.String> nestNameRU;
        java.util.List<java.lang.Integer> nestPairN;
        java.util.List<java.lang.String> nestTypeRS;
        int numParams;
        org.apache.commons.compress.harmony.pack200.IntList pairN;
        java.util.List<java.lang.String> tags;
        java.util.List<java.lang.String> typeRS;
        java.util.List<java.lang.Object> values;

        TempParamAnnotation(int r2) {
                r1 = this;
                r1.<init>()
                org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
                r0.<init>()
                r1.pairN = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.typeRS = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.nameRU = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.tags = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.values = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.caseArrayN = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.nestTypeRS = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.nestNameRU = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.nestPairN = r0
                r1.numParams = r2
                int[] r2 = new int[r2]
                r1.annoN = r2
                return
        }

        void addParameterAnnotation(int r3, java.lang.String r4, java.util.List<java.lang.String> r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.Object> r7, java.util.List<java.lang.Integer> r8, java.util.List<java.lang.String> r9, java.util.List<java.lang.String> r10, java.util.List<java.lang.Integer> r11) {
                r2 = this;
                int[] r0 = r2.annoN
                r1 = r0[r3]
                int r1 = r1 + 1
                r0[r3] = r1
                java.util.List<java.lang.String> r3 = r2.typeRS
                r3.add(r4)
                org.apache.commons.compress.harmony.pack200.IntList r3 = r2.pairN
                int r4 = r5.size()
                r3.add(r4)
                java.util.List<java.lang.String> r3 = r2.nameRU
                r3.addAll(r5)
                java.util.List<java.lang.String> r3 = r2.tags
                r3.addAll(r6)
                java.util.List<java.lang.Object> r3 = r2.values
                r3.addAll(r7)
                java.util.List<java.lang.Integer> r3 = r2.caseArrayN
                r3.addAll(r8)
                java.util.List<java.lang.String> r3 = r2.nestTypeRS
                r3.addAll(r9)
                java.util.List<java.lang.String> r3 = r2.nestNameRU
                r3.addAll(r10)
                java.util.List<java.lang.Integer> r3 = r2.nestPairN
                r3.addAll(r11)
                return
        }
    }

    static {
            r0 = 0
            long[] r0 = new long[r0]
            org.apache.commons.compress.harmony.pack200.ClassBands.EMPTY_LONG_ARRAY = r0
            return
    }

    public ClassBands(org.apache.commons.compress.harmony.pack200.Segment r12, int r13, int r14, boolean r15) throws java.io.IOException {
            r11 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r12.getSegmentHeader()
            r11.<init>(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.classSourceFile = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.classEnclosingMethodClass = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.classEnclosingMethodDesc = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.classSignature = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.classFileVersionMinor = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.classFileVersionMajor = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.fieldConstantValueKQ = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.fieldSignature = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.methodSignature = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.methodExceptionNumber = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.methodExceptionClasses = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeMaxStack = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeMaxLocals = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeHandlerCount = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeHandlerStartP = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeHandlerEndPO = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeHandlerCatchPO = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeHandlerClass = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeFlags = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeLineNumberTableN = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLineNumberTableBciP = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeLineNumberTableLine = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeLocalVariableTableN = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTableBciP = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTableSpanO = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTableNameRU = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTableTypeRS = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeLocalVariableTableSlot = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeLocalVariableTypeTableN = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTypeTableBciP = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTypeTableSpanO = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTypeTableNameRU = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeLocalVariableTypeTableTypeRS = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            r11.codeLocalVariableTypeTableSlot = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.classAttributeBands = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.methodAttributeBands = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.fieldAttributeBands = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.codeAttributeBands = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.tempFieldFlags = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.tempFieldDesc = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.tempMethodFlags = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.tempMethodDesc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.classReferencesInnerClass = r0
            r11.stripDebug = r15
            r11.segment = r12
            org.apache.commons.compress.harmony.pack200.CpBands r15 = r12.getCpBands()
            r11.cpBands = r15
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r12 = r12.getAttrBands()
            r11.attrBands = r12
            org.apache.commons.compress.harmony.pack200.CPClass[] r12 = new org.apache.commons.compress.harmony.pack200.CPClass[r13]
            r11.class_this = r12
            org.apache.commons.compress.harmony.pack200.CPClass[] r12 = new org.apache.commons.compress.harmony.pack200.CPClass[r13]
            r11.class_super = r12
            int[] r12 = new int[r13]
            r11.class_interface_count = r12
            org.apache.commons.compress.harmony.pack200.CPClass[][] r12 = new org.apache.commons.compress.harmony.pack200.CPClass[r13][]
            r11.class_interface = r12
            int[] r12 = new int[r13]
            r11.class_field_count = r12
            int[] r12 = new int[r13]
            r11.class_method_count = r12
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r12 = new org.apache.commons.compress.harmony.pack200.CPNameAndType[r13][]
            r11.field_descr = r12
            long[][] r12 = new long[r13][]
            r11.field_flags = r12
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r12 = new org.apache.commons.compress.harmony.pack200.CPNameAndType[r13][]
            r11.method_descr = r12
            long[][] r12 = new long[r13][]
            r11.method_flags = r12
            r12 = 0
        L16d:
            if (r12 >= r13) goto L17c
            long[][] r15 = r11.field_flags
            long[] r0 = org.apache.commons.compress.harmony.pack200.ClassBands.EMPTY_LONG_ARRAY
            r15[r12] = r0
            long[][] r15 = r11.method_flags
            r15[r12] = r0
            int r12 = r12 + 1
            goto L16d
        L17c:
            int[] r12 = new int[r13]
            r11.major_versions = r12
            long[] r12 = new long[r13]
            r11.class_flags = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r4 = r11.segmentHeader
            java.lang.String r1 = "RVA"
            r2 = 0
            r0 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.class_RVA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r9 = r11.segmentHeader
            java.lang.String r6 = "RIA"
            r7 = 0
            r5 = r12
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r11.class_RIA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r4 = r11.segmentHeader
            java.lang.String r1 = "RVA"
            r2 = 1
            r0 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.field_RVA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r9 = r11.segmentHeader
            java.lang.String r6 = "RIA"
            r7 = 1
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r11.field_RIA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r4 = r11.segmentHeader
            java.lang.String r1 = "RVA"
            r2 = 2
            r0 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.method_RVA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r9 = r11.segmentHeader
            java.lang.String r6 = "RIA"
            r7 = 2
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r11.method_RIA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r4 = r11.segmentHeader
            java.lang.String r1 = "RVPA"
            r0 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.method_RVPA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r9 = r11.segmentHeader
            java.lang.String r6 = "RIPA"
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r11.method_RIPA_bands = r12
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r12 = new org.apache.commons.compress.harmony.pack200.MetadataBandGroup
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r11.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r4 = r11.segmentHeader
            java.lang.String r1 = "AD"
            r0 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.method_AD_bands = r12
            r11.createNewAttributeBands()
            return
    }

    protected static int countArgs(java.lang.String r9) {
            r0 = 40
            int r0 = r9.indexOf(r0)
            r1 = 41
            int r1 = r9.indexOf(r1)
            r2 = -1
            if (r0 == r2) goto L53
            if (r1 == r2) goto L53
            if (r1 < r0) goto L53
            r2 = 1
            int r0 = r0 + r2
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
        L19:
            if (r0 >= r1) goto L52
            char r7 = r9.charAt(r0)
            if (r5 == 0) goto L28
            r8 = 59
            if (r7 != r8) goto L28
            r5 = r3
            r6 = r5
            goto L4f
        L28:
            if (r5 != 0) goto L32
            r8 = 76
            if (r7 != r8) goto L32
            int r4 = r4 + 1
            r5 = r2
            goto L4f
        L32:
            r8 = 91
            if (r7 != r8) goto L38
            r6 = r2
            goto L4f
        L38:
            if (r5 == 0) goto L3b
            goto L4f
        L3b:
            if (r6 == 0) goto L41
            int r4 = r4 + 1
            r6 = r3
            goto L4f
        L41:
            r8 = 68
            if (r7 == r8) goto L4d
            r8 = 74
            if (r7 != r8) goto L4a
            goto L4d
        L4a:
            int r4 = r4 + 1
            goto L4f
        L4d:
            int r4 = r4 + 2
        L4f:
            int r0 = r0 + 1
            goto L19
        L52:
            return r4
        L53:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No arguments"
            r9.<init>(r0)
            throw r9
    }

    private void createNewAttributeBands() throws java.io.IOException {
            r7 = this;
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r0 = r7.attrBands
            java.util.List r0 = r0.getClassAttributeLayouts()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r1 = (org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition) r1
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r2 = r7.classAttributeBands
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r3 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands
            int r4 = r7.effort
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r7.cpBands
            org.apache.commons.compress.harmony.pack200.Segment r6 = r7.segment
            org.apache.commons.compress.harmony.pack200.SegmentHeader r6 = r6.getSegmentHeader()
            r3.<init>(r4, r5, r6, r1)
            r2.add(r3)
            goto La
        L2b:
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r0 = r7.attrBands
            java.util.List r0 = r0.getMethodAttributeLayouts()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r1 = (org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition) r1
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r2 = r7.methodAttributeBands
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r3 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands
            int r4 = r7.effort
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r7.cpBands
            org.apache.commons.compress.harmony.pack200.Segment r6 = r7.segment
            org.apache.commons.compress.harmony.pack200.SegmentHeader r6 = r6.getSegmentHeader()
            r3.<init>(r4, r5, r6, r1)
            r2.add(r3)
            goto L35
        L56:
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r0 = r7.attrBands
            java.util.List r0 = r0.getFieldAttributeLayouts()
            java.util.Iterator r0 = r0.iterator()
        L60:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r1 = (org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition) r1
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r2 = r7.fieldAttributeBands
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r3 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands
            int r4 = r7.effort
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r7.cpBands
            org.apache.commons.compress.harmony.pack200.Segment r6 = r7.segment
            org.apache.commons.compress.harmony.pack200.SegmentHeader r6 = r6.getSegmentHeader()
            r3.<init>(r4, r5, r6, r1)
            r2.add(r3)
            goto L60
        L81:
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r0 = r7.attrBands
            java.util.List r0 = r0.getCodeAttributeLayouts()
            java.util.Iterator r0 = r0.iterator()
        L8b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r1 = (org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition) r1
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r2 = r7.codeAttributeBands
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r3 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands
            int r4 = r7.effort
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r7.cpBands
            org.apache.commons.compress.harmony.pack200.Segment r6 = r7.segment
            org.apache.commons.compress.harmony.pack200.SegmentHeader r6 = r6.getSegmentHeader()
            r3.<init>(r4, r5, r6, r1)
            r2.add(r3)
            goto L8b
        Lac:
            return
    }

    private int[] getInts(org.apache.commons.compress.harmony.pack200.CPClass[] r5) {
            r4 = this;
            int r0 = r5.length
            int[] r1 = new int[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L13
            r3 = r5[r2]
            if (r3 == 0) goto L10
            int r3 = r3.getIndex()
            r1[r2] = r3
        L10:
            int r2 = r2 + 1
            goto L4
        L13:
            return r1
    }

    private boolean isInnerClass(java.lang.String r2) {
            r1 = this;
            r0 = 36
            int r2 = r2.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    private boolean isInnerClassOf(java.lang.String r3, org.apache.commons.compress.harmony.pack200.CPClass r4) {
            r2 = this;
            boolean r0 = r2.isInnerClass(r3)
            r1 = 0
            if (r0 == 0) goto L22
            r0 = 36
            int r0 = r3.lastIndexOf(r0)
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.String r0 = r4.toString()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1d
            r3 = 1
            return r3
        L1d:
            boolean r3 = r2.isInnerClassOf(r3, r4)
            return r3
        L22:
            return r1
    }

    static /* synthetic */ java.util.Set lambda$currentClassReferencesInnerClass$1(org.apache.commons.compress.harmony.pack200.CPClass r0) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
    }

    static /* synthetic */ int lambda$finaliseBands$2(org.apache.commons.compress.harmony.pack200.NewAttributeBands r0, org.apache.commons.compress.harmony.pack200.NewAttributeBands r1) {
            int r0 = r0.getFlagIndex()
            int r1 = r1.getFlagIndex()
            int r0 = r0 - r1
            return r0
    }

    private void renumberBci(java.util.List<java.lang.Integer> r4, org.apache.commons.compress.harmony.pack200.IntList r5, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r6) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L30
            java.lang.Object r1 = r4.get(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L11
            goto L30
        L11:
            boolean r2 = r1 instanceof org.objectweb.asm.Label
            if (r2 == 0) goto L2d
            r4.remove(r0)
            java.lang.Object r1 = r6.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r5.get(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.add(r0, r1)
        L2d:
            int r0 = r0 + (-1)
            goto L6
        L30:
            return
    }

    private void renumberDoubleOffsetBci(java.util.List<java.lang.Integer> r4, java.util.List<java.lang.Integer> r5, java.util.List<java.lang.Object> r6, org.apache.commons.compress.harmony.pack200.IntList r7, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r8) {
            r3 = this;
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L46
            java.lang.Object r1 = r6.get(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L11
            goto L46
        L11:
            boolean r2 = r1 instanceof org.objectweb.asm.Label
            if (r2 == 0) goto L43
            r6.remove(r0)
            java.lang.Object r1 = r8.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r7.get(r1)
            java.lang.Object r2 = r4.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = r1 - r2
            java.lang.Object r2 = r5.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.add(r0, r1)
        L43:
            int r0 = r0 + (-1)
            goto L6
        L46:
            return
    }

    private void renumberOffsetBci(java.util.List<java.lang.Integer> r4, java.util.List<java.lang.Integer> r5, org.apache.commons.compress.harmony.pack200.IntList r6, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r7) {
            r3 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L3b
            java.lang.Object r1 = r5.get(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L11
            goto L3b
        L11:
            boolean r2 = r1 instanceof org.objectweb.asm.Label
            if (r2 == 0) goto L38
            r5.remove(r0)
            java.lang.Object r1 = r7.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r6.get(r1)
            java.lang.Object r2 = r4.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.add(r0, r1)
        L38:
            int r0 = r0 + (-1)
            goto L6
        L3b:
            return
    }

    private int sum(int[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto Lb
            r3 = r5[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lb:
            return r2
    }

    private void writeClassAttributeBands(java.io.OutputStream r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            long[] r2 = r6.class_flags
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r6.segmentHeader
            boolean r5 = r0.have_class_flags_hi()
            java.lang.String r1 = "class_flags"
            r0 = r6
            byte[] r0 = r0.encodeFlags(r1, r2, r3, r4, r5)
            r7.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from class_flags["
            java.lang.StringBuilder r0 = r0.append(r1)
            long[] r1 = r6.class_flags
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r6.class_attr_calls
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_attr_calls"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_attr_calls["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r6.class_attr_calls
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r6.classSourceFile
            int[] r0 = r6.cpEntryOrNullListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "classSourceFile"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from classSourceFile["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r3 = r6.classSourceFile
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r6.classEnclosingMethodClass
            int[] r0 = r6.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_enclosing_method_RC"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_enclosing_method_RC["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r3 = r6.classEnclosingMethodClass
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r6.classEnclosingMethodDesc
            int[] r0 = r6.cpEntryOrNullListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_EnclosingMethod_RDN"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_EnclosingMethod_RDN["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r3 = r6.classEnclosingMethodDesc
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r6.classSignature
            int[] r0 = r6.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_Signature_RS"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_Signature_RS["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r3 = r6.classSignature
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.class_RVA_bands
            r0.pack(r7)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.class_RIA_bands
            r0.pack(r7)
            int[] r0 = r6.class_InnerClasses_N
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_InnerClasses_N"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_InnerClasses_N["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r6.class_InnerClasses_N
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.CPClass[] r0 = r6.class_InnerClasses_RC
            int[] r0 = r6.getInts(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_InnerClasses_RC"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_InnerClasses_RC["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.CPClass[] r3 = r6.class_InnerClasses_RC
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r6.class_InnerClasses_F
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_InnerClasses_F"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_InnerClasses_F["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r6.class_InnerClasses_F
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r6.classInnerClassesOuterRCN
            int[] r0 = r6.cpEntryOrNullListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_InnerClasses_outer_RCN"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_InnerClasses_outer_RCN["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r3 = r6.classInnerClassesOuterRCN
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r6.classInnerClassesNameRUN
            int[] r0 = r6.cpEntryOrNullListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "class_InnerClasses_name_RUN"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_InnerClasses_name_RUN["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r3 = r6.classInnerClassesNameRUN
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r6.classFileVersionMinor
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "classFileVersionMinor"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from classFileVersionMinor["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r6.classFileVersionMinor
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r6.classFileVersionMajor
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "classFileVersionMajor"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r2 = " bytes from classFileVersionMajor["
            java.lang.StringBuilder r0 = r0.append(r2)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r6.classFileVersionMajor
            int r2 = r2.size()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r6.classAttributeBands
            java.util.Iterator r0 = r0.iterator()
        L2bc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2cc
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.pack(r7)
            goto L2bc
        L2cc:
            return
    }

    private void writeCodeAttributeBands(java.io.OutputStream r8) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            java.util.List<java.lang.Long> r0 = r7.codeFlags
            long[] r3 = r7.longListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r7.segmentHeader
            boolean r6 = r0.have_code_flags_hi()
            java.lang.String r2 = "codeFlags"
            r1 = r7
            byte[] r0 = r1.encodeFlags(r2, r3, r4, r5, r6)
            r8.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from codeFlags["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<java.lang.Long> r1 = r7.codeFlags
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r7.code_attr_calls
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_attr_calls"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_attr_calls["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r7.code_attr_calls
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r7.codeLineNumberTableN
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LineNumberTable_N"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LineNumberTable_N["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r7.codeLineNumberTableN
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r7.codeLineNumberTableBciP
            int[] r0 = r7.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            java.lang.String r4 = "code_LineNumberTable_bci_P"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LineNumberTable_bci_P["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r7.codeLineNumberTableBciP
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r7.codeLineNumberTableLine
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LineNumberTable_line"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LineNumberTable_line["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r7.codeLineNumberTableLine
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r7.codeLocalVariableTableN
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTable_N"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTable_N["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r7.codeLocalVariableTableN
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r7.codeLocalVariableTableBciP
            int[] r0 = r7.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            java.lang.String r4 = "code_LocalVariableTable_bci_P"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTable_bci_P["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r7.codeLocalVariableTableBciP
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r7.codeLocalVariableTableSpanO
            int[] r0 = r7.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            java.lang.String r4 = "code_LocalVariableTable_span_O"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTable_span_O["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r7.codeLocalVariableTableSpanO
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r7.codeLocalVariableTableNameRU
            int[] r0 = r7.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTable_name_RU"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTable_name_RU["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r3 = r7.codeLocalVariableTableNameRU
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r7.codeLocalVariableTableTypeRS
            int[] r0 = r7.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTable_type_RS"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTable_type_RS["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r3 = r7.codeLocalVariableTableTypeRS
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r7.codeLocalVariableTableSlot
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTable_slot"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTable_slot["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r7.codeLocalVariableTableSlot
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r7.codeLocalVariableTypeTableN
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTypeTable_N"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTypeTable_N["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r7.codeLocalVariableTypeTableN
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r7.codeLocalVariableTypeTableBciP
            int[] r0 = r7.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            java.lang.String r4 = "code_LocalVariableTypeTable_bci_P"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTypeTable_bci_P["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r7.codeLocalVariableTypeTableBciP
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r7.codeLocalVariableTypeTableSpanO
            int[] r0 = r7.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            java.lang.String r4 = "code_LocalVariableTypeTable_span_O"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTypeTable_span_O["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r7.codeLocalVariableTypeTableSpanO
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r7.codeLocalVariableTypeTableNameRU
            int[] r0 = r7.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTypeTable_name_RU"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTypeTable_name_RU["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r3 = r7.codeLocalVariableTypeTableNameRU
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r7.codeLocalVariableTypeTableTypeRS
            int[] r0 = r7.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTypeTable_type_RS"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from code_LocalVariableTypeTable_type_RS["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r3 = r7.codeLocalVariableTypeTableTypeRS
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r7.codeLocalVariableTypeTableSlot
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "code_LocalVariableTypeTable_slot"
            byte[] r0 = r7.encodeBandInt(r4, r0, r3)
            r8.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r2 = " bytes from code_LocalVariableTypeTable_slot["
            java.lang.StringBuilder r0 = r0.append(r2)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r7.codeLocalVariableTypeTableSlot
            int r2 = r2.size()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r7.codeAttributeBands
            java.util.Iterator r0 = r0.iterator()
        L3a2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b2
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.pack(r8)
            goto L3a2
        L3b2:
            return
    }

    private void writeCodeBands(java.io.OutputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            int[] r0 = r5.codeHeaders
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            java.lang.String r2 = "codeHeaders"
            byte[] r0 = r5.encodeBandInt(r2, r0, r1)
            r6.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from codeHeaders["
            java.lang.StringBuilder r0 = r0.append(r1)
            int[] r1 = r5.codeHeaders
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.codeMaxStack
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "codeMaxStack"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from codeMaxStack["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.codeMaxStack
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.codeMaxLocals
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "codeMaxLocals"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from codeMaxLocals["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.codeMaxLocals
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.codeHandlerCount
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "codeHandlerCount"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from codeHandlerCount["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.codeHandlerCount
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.codeHandlerStartP
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            java.lang.String r4 = "codeHandlerStartP"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from codeHandlerStartP["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.codeHandlerStartP
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.codeHandlerEndPO
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            java.lang.String r4 = "codeHandlerEndPO"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from codeHandlerEndPO["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.codeHandlerEndPO
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.codeHandlerCatchPO
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            java.lang.String r4 = "codeHandlerCatchPO"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from codeHandlerCatchPO["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.codeHandlerCatchPO
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r5.codeHandlerClass
            int[] r0 = r5.cpEntryOrNullListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "codeHandlerClass"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r2 = " bytes from codeHandlerClass["
            java.lang.StringBuilder r0 = r0.append(r2)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r2 = r5.codeHandlerClass
            int r2 = r2.size()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            r5.writeCodeAttributeBands(r6)
            return
    }

    private void writeFieldAttributeBands(java.io.OutputStream r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            long[][] r2 = r6.field_flags
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r6.segmentHeader
            boolean r5 = r0.have_field_flags_hi()
            java.lang.String r1 = "field_flags"
            r0 = r6
            byte[] r0 = r0.encodeFlags(r1, r2, r3, r4, r5)
            r7.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from field_flags["
            java.lang.StringBuilder r0 = r0.append(r1)
            long[][] r1 = r6.field_flags
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r6.field_attr_calls
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "field_attr_calls"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from field_attr_calls["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r6.field_attr_calls
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r0 = r6.fieldConstantValueKQ
            int[] r0 = r6.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "fieldConstantValueKQ"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from fieldConstantValueKQ["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r3 = r6.fieldConstantValueKQ
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r6.fieldSignature
            int[] r0 = r6.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "fieldSignature"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r2 = " bytes from fieldSignature["
            java.lang.StringBuilder r0 = r0.append(r2)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r2 = r6.fieldSignature
            int r2 = r2.size()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.field_RVA_bands
            r0.pack(r7)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.field_RIA_bands
            r0.pack(r7)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r6.fieldAttributeBands
            java.util.Iterator r0 = r0.iterator()
        Le7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf7
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.pack(r7)
            goto Le7
        Lf7:
            return
    }

    private void writeMethodAttributeBands(java.io.OutputStream r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            long[][] r2 = r6.method_flags
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r6.segmentHeader
            boolean r5 = r0.have_method_flags_hi()
            java.lang.String r1 = "method_flags"
            r0 = r6
            byte[] r0 = r0.encodeFlags(r1, r2, r3, r4, r5)
            r7.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from method_flags["
            java.lang.StringBuilder r0 = r0.append(r1)
            long[][] r1 = r6.method_flags
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r6.method_attr_calls
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "method_attr_calls"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from method_attr_calls["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r6.method_attr_calls
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r6.methodExceptionNumber
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "methodExceptionNumber"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from methodExceptionNumber["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r6.methodExceptionNumber
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r6.methodExceptionClasses
            int[] r0 = r6.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "methodExceptionClasses"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from methodExceptionClasses["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r3 = r6.methodExceptionClasses
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r6.methodSignature
            int[] r0 = r6.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "methodSignature"
            byte[] r0 = r6.encodeBandInt(r4, r0, r3)
            r7.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r2 = " bytes from methodSignature["
            java.lang.StringBuilder r0 = r0.append(r2)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r2 = r6.methodSignature
            int r2 = r2.size()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.method_RVA_bands
            r0.pack(r7)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.method_RIA_bands
            r0.pack(r7)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.method_RVPA_bands
            r0.pack(r7)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.method_RIPA_bands
            r0.pack(r7)
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r0 = r6.method_AD_bands
            r0.pack(r7)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r6.methodAttributeBands
            java.util.Iterator r0 = r0.iterator()
        L12c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L13c
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.pack(r7)
            goto L12c
        L13c:
            return
    }

    public void addAnnotation(int r16, java.lang.String r17, boolean r18, java.util.List<java.lang.String> r19, java.util.List<java.lang.String> r20, java.util.List<java.lang.Object> r21, java.util.List<java.lang.Integer> r22, java.util.List<java.lang.String> r23, java.util.List<java.lang.String> r24, java.util.List<java.lang.Integer> r25) {
            r15 = this;
            r0 = r15
            r1 = r16
            if (r1 == 0) goto L129
            r2 = 2097152(0x200000, float:2.938736E-39)
            r3 = 4194304(0x400000, float:5.877472E-39)
            r4 = 1
            if (r1 == r4) goto L9d
            r5 = 2
            if (r1 == r5) goto L11
            goto L19e
        L11:
            if (r18 == 0) goto L58
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r6 = r0.method_RVA_bands
            r7 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r6.addAnnotation(r7, r8, r9, r10, r11, r12, r13, r14)
            java.util.List<java.lang.Long> r1 = r0.tempMethodFlags
            int r3 = r1.size()
            int r3 = r3 - r4
            java.lang.Object r1 = r1.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            int r3 = r1.intValue()
            r3 = r3 & r2
            if (r3 == 0) goto L42
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r3 = r0.method_RVA_bands
            r3.incrementAnnoN()
            goto L47
        L42:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r3 = r0.method_RVA_bands
            r3.newEntryInAnnoN()
        L47:
            java.util.List<java.lang.Long> r3 = r0.tempMethodFlags
            int r1 = r1.intValue()
            r1 = r1 | r2
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.add(r1)
            goto L19e
        L58:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r0.method_RIA_bands
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r5.addAnnotation(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List<java.lang.Long> r1 = r0.tempMethodFlags
            int r2 = r1.size()
            int r2 = r2 - r4
            java.lang.Object r1 = r1.remove(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            int r2 = r1.intValue()
            r2 = r2 & r3
            if (r2 == 0) goto L87
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.method_RIA_bands
            r2.incrementAnnoN()
            goto L8c
        L87:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.method_RIA_bands
            r2.newEntryInAnnoN()
        L8c:
            java.util.List<java.lang.Long> r2 = r0.tempMethodFlags
            int r1 = r1.intValue()
            r1 = r1 | r3
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
            goto L19e
        L9d:
            if (r18 == 0) goto Le4
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r0.field_RVA_bands
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r5.addAnnotation(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List<java.lang.Long> r1 = r0.tempFieldFlags
            int r3 = r1.size()
            int r3 = r3 - r4
            java.lang.Object r1 = r1.remove(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            int r3 = r1.intValue()
            r3 = r3 & r2
            if (r3 == 0) goto Lce
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r3 = r0.field_RVA_bands
            r3.incrementAnnoN()
            goto Ld3
        Lce:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r3 = r0.field_RVA_bands
            r3.newEntryInAnnoN()
        Ld3:
            java.util.List<java.lang.Long> r3 = r0.tempFieldFlags
            int r1 = r1.intValue()
            r1 = r1 | r2
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.add(r1)
            goto L19e
        Le4:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r0.field_RIA_bands
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r5.addAnnotation(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.List<java.lang.Long> r1 = r0.tempFieldFlags
            int r2 = r1.size()
            int r2 = r2 - r4
            java.lang.Object r1 = r1.remove(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            int r2 = r1.intValue()
            r2 = r2 & r3
            if (r2 == 0) goto L113
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.field_RIA_bands
            r2.incrementAnnoN()
            goto L118
        L113:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.field_RIA_bands
            r2.newEntryInAnnoN()
        L118:
            java.util.List<java.lang.Long> r2 = r0.tempFieldFlags
            int r1 = r1.intValue()
            r1 = r1 | r3
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
            goto L19e
        L129:
            r1 = 0
            if (r18 == 0) goto L166
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r3 = r0.class_RVA_bands
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r3.addAnnotation(r4, r5, r6, r7, r8, r9, r10, r11)
            long[] r3 = r0.class_flags
            int r4 = r0.index
            r4 = r3[r4]
            r6 = 2097152(0x200000, double:1.036131E-317)
            long r3 = r4 & r6
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L157
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r1 = r0.class_RVA_bands
            r1.incrementAnnoN()
            goto L19e
        L157:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r1 = r0.class_RVA_bands
            r1.newEntryInAnnoN()
            long[] r1 = r0.class_flags
            int r2 = r0.index
            r3 = r1[r2]
            long r3 = r3 | r6
            r1[r2] = r3
            goto L19e
        L166:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r0.class_RIA_bands
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r5.addAnnotation(r6, r7, r8, r9, r10, r11, r12, r13)
            long[] r3 = r0.class_flags
            int r4 = r0.index
            r4 = r3[r4]
            r6 = 4194304(0x400000, double:2.0722615E-317)
            long r3 = r4 & r6
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L190
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r1 = r0.class_RIA_bands
            r1.incrementAnnoN()
            goto L19e
        L190:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r1 = r0.class_RIA_bands
            r1.newEntryInAnnoN()
            long[] r1 = r0.class_flags
            int r2 = r0.index
            r3 = r1[r2]
            long r3 = r3 | r6
            r1[r2] = r3
        L19e:
            return
    }

    public void addAnnotationDefault(java.util.List<java.lang.String> r11, java.util.List<java.lang.String> r12, java.util.List<java.lang.Object> r13, java.util.List<java.lang.Integer> r14, java.util.List<java.lang.String> r15, java.util.List<java.lang.String> r16, java.util.List<java.lang.Integer> r17) {
            r10 = this;
            r0 = r10
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r1 = r0.method_AD_bands
            r2 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.addAnnotation(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List<java.lang.Long> r1 = r0.tempMethodFlags
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            java.util.List<java.lang.Long> r2 = r0.tempMethodFlags
            long r3 = r1.longValue()
            r5 = 33554432(0x2000000, double:1.6578092E-316)
            long r3 = r3 | r5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
            return
    }

    public void addClass(int r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String[] r9) {
            r3 = this;
            org.apache.commons.compress.harmony.pack200.CPClass[] r0 = r3.class_this
            int r1 = r3.index
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r6 = r2.getCPClass(r6)
            r0[r1] = r6
            org.apache.commons.compress.harmony.pack200.CPClass[] r6 = r3.class_super
            int r0 = r3.index
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r8 = r1.getCPClass(r8)
            r6[r0] = r8
            int[] r6 = r3.class_interface_count
            int r8 = r3.index
            int r0 = r9.length
            r6[r8] = r0
            org.apache.commons.compress.harmony.pack200.CPClass[][] r6 = r3.class_interface
            int r0 = r9.length
            org.apache.commons.compress.harmony.pack200.CPClass[] r0 = new org.apache.commons.compress.harmony.pack200.CPClass[r0]
            r6[r8] = r0
            org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda0 r6 = new org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda0
            r6.<init>(r3, r9)
            java.util.Arrays.setAll(r0, r6)
            int[] r6 = r3.major_versions
            int r8 = r3.index
            r6[r8] = r4
            long[] r4 = r3.class_flags
            long r0 = (long) r5
            r4[r8] = r0
            boolean r4 = r3.anySyntheticClasses
            if (r4 != 0) goto L57
            r4 = r5 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L57
            org.apache.commons.compress.harmony.pack200.Segment r4 = r3.segment
            org.apache.commons.compress.harmony.pack200.Pack200ClassReader r4 = r4.getCurrentClassReader()
            boolean r4 = r4.hasSyntheticAttributes()
            if (r4 == 0) goto L57
            org.apache.commons.compress.harmony.pack200.CpBands r4 = r3.cpBands
            java.lang.String r5 = "Synthetic"
            r4.addCPUtf8(r5)
            r4 = 1
            r3.anySyntheticClasses = r4
        L57:
            if (r7 == 0) goto L70
            long[] r4 = r3.class_flags
            int r5 = r3.index
            r8 = r4[r5]
            r0 = 524288(0x80000, double:2.590327E-318)
            long r8 = r8 | r0
            r4[r5] = r8
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r4 = r3.classSignature
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r5 = r5.getCPSignature(r7)
            r4.add(r5)
        L70:
            return
    }

    public void addClassAttribute(org.apache.commons.compress.harmony.pack200.NewAttribute r7) {
            r6 = this;
            java.lang.String r0 = r7.type
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r1 = r6.classAttributeBands
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r2
            java.lang.String r3 = r2.getAttributeName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8
            r2.addAttribute(r7)
            int r7 = r2.getFlagIndex()
            long[] r0 = r6.class_flags
            int r1 = r6.index
            r2 = r0[r1]
            r4 = 1
            int r7 = r4 << r7
            long r4 = (long) r7
            long r2 = r2 | r4
            r0[r1] = r2
            return
        L33:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No suitable definition for "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }

    public void addCode() {
            r4 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.codeHandlerCount
            r1 = 0
            r0.add(r1)
            boolean r0 = r4.stripDebug
            if (r0 != 0) goto L1a
            java.util.List<java.lang.Long> r0 = r4.codeFlags
            r2 = 4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.add(r2)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.codeLocalVariableTableN
            r0.add(r1)
        L1a:
            return
    }

    public void addCodeAttribute(org.apache.commons.compress.harmony.pack200.NewAttribute r8) {
            r7 = this;
            java.lang.String r0 = r8.type
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r1 = r7.codeAttributeBands
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r2
            java.lang.String r3 = r2.getAttributeName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8
            r2.addAttribute(r8)
            int r8 = r2.getFlagIndex()
            java.util.List<java.lang.Long> r0 = r7.codeFlags
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            java.util.List<java.lang.Long> r1 = r7.codeFlags
            long r3 = r0.longValue()
            int r8 = r2 << r8
            long r5 = (long) r8
            long r2 = r3 | r5
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r1.add(r8)
            return
        L46:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No suitable definition for "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    public void addEnclosingMethod(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            long[] r0 = r6.class_flags
            int r1 = r6.index
            r2 = r0[r1]
            r4 = 262144(0x40000, double:1.295163E-318)
            long r2 = r2 | r4
            r0[r1] = r2
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r6.classEnclosingMethodClass
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r6.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r7 = r1.getCPClass(r7)
            r0.add(r7)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r7 = r6.classEnclosingMethodDesc
            if (r8 != 0) goto L1d
            r8 = 0
            goto L23
        L1d:
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r6.cpBands
            org.apache.commons.compress.harmony.pack200.CPNameAndType r8 = r0.getCPNameAndType(r8, r9)
        L23:
            r7.add(r8)
            return
    }

    public void addField(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
            r2 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r0 = r2.tempFieldDesc
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPNameAndType r4 = r1.getCPNameAndType(r4, r5)
            r0.add(r4)
            if (r6 == 0) goto L1f
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r4 = r2.fieldSignature
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r5 = r5.getCPSignature(r6)
            r4.add(r5)
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r4
        L1f:
            if (r7 == 0) goto L2f
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r4 = r2.fieldConstantValueKQ
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPConstant r5 = r5.getConstant(r7)
            r4.add(r5)
            r4 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r4
        L2f:
            boolean r4 = r2.anySyntheticFields
            if (r4 != 0) goto L4d
            r4 = r3 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L4d
            org.apache.commons.compress.harmony.pack200.Segment r4 = r2.segment
            org.apache.commons.compress.harmony.pack200.Pack200ClassReader r4 = r4.getCurrentClassReader()
            boolean r4 = r4.hasSyntheticAttributes()
            if (r4 == 0) goto L4d
            org.apache.commons.compress.harmony.pack200.CpBands r4 = r2.cpBands
            java.lang.String r5 = "Synthetic"
            r4.addCPUtf8(r5)
            r4 = 1
            r2.anySyntheticFields = r4
        L4d:
            java.util.List<java.lang.Long> r4 = r2.tempFieldFlags
            long r5 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4.add(r3)
            return
    }

    public void addFieldAttribute(org.apache.commons.compress.harmony.pack200.NewAttribute r8) {
            r7 = this;
            java.lang.String r0 = r8.type
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r1 = r7.fieldAttributeBands
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r2
            java.lang.String r3 = r2.getAttributeName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8
            r2.addAttribute(r8)
            int r8 = r2.getFlagIndex()
            java.util.List<java.lang.Long> r0 = r7.tempFieldFlags
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            java.util.List<java.lang.Long> r1 = r7.tempFieldFlags
            long r3 = r0.longValue()
            int r8 = r2 << r8
            long r5 = (long) r8
            long r2 = r3 | r5
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r1.add(r8)
            return
        L46:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No suitable definition for "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    public void addHandler(org.objectweb.asm.Label r3, org.objectweb.asm.Label r4, org.objectweb.asm.Label r5, java.lang.String r6) {
            r2 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.codeHandlerCount
            int r1 = r0.size()
            int r1 = r1 + (-1)
            int r0 = r0.remove(r1)
            org.apache.commons.compress.harmony.pack200.IntList r1 = r2.codeHandlerCount
            int r0 = r0 + 1
            r1.add(r0)
            java.util.List r0 = r2.codeHandlerStartP
            r0.add(r3)
            java.util.List r3 = r2.codeHandlerEndPO
            r3.add(r4)
            java.util.List r3 = r2.codeHandlerCatchPO
            r3.add(r5)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r3 = r2.codeHandlerClass
            if (r6 != 0) goto L28
            r4 = 0
            goto L2e
        L28:
            org.apache.commons.compress.harmony.pack200.CpBands r4 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r4 = r4.getCPClass(r6)
        L2e:
            r3.add(r4)
            return
    }

    public void addLineNumber(int r6, org.objectweb.asm.Label r7) {
            r5 = this;
            java.util.List<java.lang.Long> r0 = r5.codeFlags
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            int r1 = r0.intValue()
            r1 = r1 & 2
            if (r1 != 0) goto L36
            java.util.List<java.lang.Long> r1 = r5.codeFlags
            int r3 = r1.size()
            int r3 = r3 - r2
            r1.remove(r3)
            java.util.List<java.lang.Long> r1 = r5.codeFlags
            int r0 = r0.intValue()
            r0 = r0 | 2
            long r3 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.add(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.codeLineNumberTableN
            r0.add(r2)
            goto L40
        L36:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.codeLineNumberTableN
            int r1 = r0.size()
            int r1 = r1 - r2
            r0.increment(r1)
        L40:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.codeLineNumberTableLine
            r0.add(r6)
            java.util.List r6 = r5.codeLineNumberTableBciP
            r6.add(r7)
            return
    }

    public void addLocalVariable(java.lang.String r6, java.lang.String r7, java.lang.String r8, org.objectweb.asm.Label r9, org.objectweb.asm.Label r10, int r11) {
            r5 = this;
            r0 = 1
            if (r8 == 0) goto L67
            java.util.List<java.lang.Long> r1 = r5.codeFlags
            int r2 = r1.size()
            int r2 = r2 - r0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            int r2 = r1.intValue()
            r2 = r2 & 8
            if (r2 != 0) goto L38
            java.util.List<java.lang.Long> r2 = r5.codeFlags
            int r3 = r2.size()
            int r3 = r3 - r0
            r2.remove(r3)
            java.util.List<java.lang.Long> r2 = r5.codeFlags
            int r1 = r1.intValue()
            r1 = r1 | 8
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
            org.apache.commons.compress.harmony.pack200.IntList r1 = r5.codeLocalVariableTypeTableN
            r1.add(r0)
            goto L42
        L38:
            org.apache.commons.compress.harmony.pack200.IntList r1 = r5.codeLocalVariableTypeTableN
            int r2 = r1.size()
            int r2 = r2 - r0
            r1.increment(r2)
        L42:
            java.util.List r1 = r5.codeLocalVariableTypeTableBciP
            r1.add(r9)
            java.util.List r1 = r5.codeLocalVariableTypeTableSpanO
            r1.add(r10)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r1 = r5.codeLocalVariableTypeTableNameRU
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r5.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r2 = r2.getCPUtf8(r6)
            r1.add(r2)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r1 = r5.codeLocalVariableTypeTableTypeRS
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r5.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r8 = r2.getCPSignature(r8)
            r1.add(r8)
            org.apache.commons.compress.harmony.pack200.IntList r8 = r5.codeLocalVariableTypeTableSlot
            r8.add(r11)
        L67:
            org.apache.commons.compress.harmony.pack200.IntList r8 = r5.codeLocalVariableTableN
            int r1 = r8.size()
            int r1 = r1 - r0
            r8.increment(r1)
            java.util.List r8 = r5.codeLocalVariableTableBciP
            r8.add(r9)
            java.util.List r8 = r5.codeLocalVariableTableSpanO
            r8.add(r10)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r8 = r5.codeLocalVariableTableNameRU
            org.apache.commons.compress.harmony.pack200.CpBands r9 = r5.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = r9.getCPUtf8(r6)
            r8.add(r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r6 = r5.codeLocalVariableTableTypeRS
            org.apache.commons.compress.harmony.pack200.CpBands r8 = r5.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r7 = r8.getCPSignature(r7)
            r6.add(r7)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r5.codeLocalVariableTableSlot
            r6.add(r11)
            return
    }

    public void addMaxStack(int r5, int r6) {
            r4 = this;
            java.util.List<java.lang.Long> r0 = r4.tempMethodFlags
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            int r0 = r0.intValue()
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List<java.lang.Long> r1 = r4.tempMethodFlags
            r1.add(r0)
            org.apache.commons.compress.harmony.pack200.IntList r1 = r4.codeMaxStack
            r1.add(r5)
            long r0 = r0.longValue()
            r2 = 8
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L33
            int r6 = r6 + (-1)
        L33:
            int r5 = r4.numMethodArgs
            int r6 = r6 - r5
            org.apache.commons.compress.harmony.pack200.IntList r5 = r4.codeMaxLocals
            r5.add(r6)
            return
    }

    public void addMethod(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String[] r8) {
            r3 = this;
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPNameAndType r5 = r0.getCPNameAndType(r5, r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r0 = r3.tempMethodDesc
            r0.add(r5)
            if (r7 == 0) goto L1b
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r5 = r3.methodSignature
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPSignature r7 = r0.getCPSignature(r7)
            r5.add(r7)
            r5 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 | r5
        L1b:
            if (r8 == 0) goto L3a
            org.apache.commons.compress.harmony.pack200.IntList r5 = r3.methodExceptionNumber
            int r7 = r8.length
            r5.add(r7)
            int r5 = r8.length
            r7 = 0
        L25:
            if (r7 >= r5) goto L37
            r0 = r8[r7]
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r1 = r3.methodExceptionClasses
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r0 = r2.getCPClass(r0)
            r1.add(r0)
            int r7 = r7 + 1
            goto L25
        L37:
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 | r5
        L3a:
            r5 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 & r4
            if (r5 == 0) goto L46
            r5 = -131073(0xfffffffffffdffff, float:NaN)
            r4 = r4 & r5
            r5 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 | r5
        L46:
            java.util.List<java.lang.Long> r5 = r3.tempMethodFlags
            long r7 = (long) r4
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5.add(r7)
            int r5 = countArgs(r6)
            r3.numMethodArgs = r5
            boolean r5 = r3.anySyntheticMethods
            if (r5 != 0) goto L74
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L74
            org.apache.commons.compress.harmony.pack200.Segment r4 = r3.segment
            org.apache.commons.compress.harmony.pack200.Pack200ClassReader r4 = r4.getCurrentClassReader()
            boolean r4 = r4.hasSyntheticAttributes()
            if (r4 == 0) goto L74
            org.apache.commons.compress.harmony.pack200.CpBands r4 = r3.cpBands
            java.lang.String r5 = "Synthetic"
            r4.addCPUtf8(r5)
            r4 = 1
            r3.anySyntheticMethods = r4
        L74:
            return
    }

    public void addMethodAttribute(org.apache.commons.compress.harmony.pack200.NewAttribute r8) {
            r7 = this;
            java.lang.String r0 = r8.type
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r1 = r7.methodAttributeBands
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r2
            java.lang.String r3 = r2.getAttributeName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8
            r2.addAttribute(r8)
            int r8 = r2.getFlagIndex()
            java.util.List<java.lang.Long> r0 = r7.tempMethodFlags
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            java.util.List<java.lang.Long> r1 = r7.tempMethodFlags
            long r3 = r0.longValue()
            int r8 = r2 << r8
            long r5 = (long) r8
            long r2 = r3 | r5
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r1.add(r8)
            return
        L46:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No suitable definition for "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    public void addParameterAnnotation(int r13, java.lang.String r14, boolean r15, java.util.List<java.lang.String> r16, java.util.List<java.lang.String> r17, java.util.List<java.lang.Object> r18, java.util.List<java.lang.Integer> r19, java.util.List<java.lang.String> r20, java.util.List<java.lang.String> r21, java.util.List<java.lang.Integer> r22) {
            r12 = this;
            r0 = r12
            if (r15 == 0) goto L43
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r1 = r0.tempMethodRVPA
            if (r1 != 0) goto L23
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r2 = new org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation
            int r1 = r0.numMethodArgs
            r2.<init>(r1)
            r0.tempMethodRVPA = r2
            r3 = r13
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r2.addParameterAnnotation(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L23:
            java.util.List<java.lang.Long> r1 = r0.tempMethodFlags
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            java.util.List<java.lang.Long> r2 = r0.tempMethodFlags
            long r3 = r1.longValue()
            r5 = 8388608(0x800000, double:4.144523E-317)
            long r3 = r3 | r5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
            goto L82
        L43:
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r1 = r0.tempMethodRIPA
            if (r1 != 0) goto L63
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r2 = new org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation
            int r1 = r0.numMethodArgs
            r2.<init>(r1)
            r0.tempMethodRIPA = r2
            r3 = r13
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r2.addParameterAnnotation(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L63:
            java.util.List<java.lang.Long> r1 = r0.tempMethodFlags
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            java.util.List<java.lang.Long> r2 = r0.tempMethodFlags
            long r3 = r1.longValue()
            r5 = 16777216(0x1000000, double:8.289046E-317)
            long r3 = r3 | r5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.add(r1)
        L82:
            return
    }

    public void addSourceFile(java.lang.String r6) {
            r5 = this;
            org.apache.commons.compress.harmony.pack200.CPClass[] r0 = r5.class_this
            int r1 = r5.index
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            r1 = 36
            int r2 = r0.indexOf(r1)
            r3 = -1
            if (r2 == r3) goto L1c
            r2 = 0
            int r1 = r0.indexOf(r1)
            java.lang.String r0 = r0.substring(r2, r1)
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 47
            int r2 = r0.lastIndexOf(r2)
            int r2 = r2 + 1
            java.lang.String r0 = r0.substring(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ".java"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L48
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r6 = r5.classSourceFile
            r0 = 0
            r6.add(r0)
            goto L53
        L48:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r5.classSourceFile
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r5.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = r1.getCPUtf8(r6)
            r0.add(r6)
        L53:
            long[] r6 = r5.class_flags
            int r0 = r5.index
            r1 = r6[r0]
            r3 = 131072(0x20000, double:6.4758E-319)
            long r1 = r1 | r3
            r6[r0] = r1
            return
    }

    public void currentClassReferencesInnerClass(org.apache.commons.compress.harmony.pack200.CPClass r4) {
            r3 = this;
            int r0 = r3.index
            org.apache.commons.compress.harmony.pack200.CPClass[] r1 = r3.class_this
            int r2 = r1.length
            if (r0 >= r2) goto L2b
            r0 = r1[r0]
            if (r0 == 0) goto L2b
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L2b
            java.lang.String r1 = r0.toString()
            boolean r1 = r3.isInnerClassOf(r1, r4)
            if (r1 != 0) goto L2b
            java.util.Map<org.apache.commons.compress.harmony.pack200.CPClass, java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass>> r1 = r3.classReferencesInnerClass
            org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda1 r2 = new org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda1
            r2.<init>()
            java.lang.Object r0 = r1.computeIfAbsent(r0, r2)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r4)
        L2b:
            return
    }

    public void doBciRenumbering(org.apache.commons.compress.harmony.pack200.IntList r9, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r10) {
            r8 = this;
            java.util.List r0 = r8.codeLineNumberTableBciP
            r8.renumberBci(r0, r9, r10)
            java.util.List r0 = r8.codeLocalVariableTableBciP
            r8.renumberBci(r0, r9, r10)
            java.util.List r0 = r8.codeLocalVariableTableBciP
            java.util.List r1 = r8.codeLocalVariableTableSpanO
            r8.renumberOffsetBci(r0, r1, r9, r10)
            java.util.List r0 = r8.codeLocalVariableTypeTableBciP
            r8.renumberBci(r0, r9, r10)
            java.util.List r0 = r8.codeLocalVariableTypeTableBciP
            java.util.List r1 = r8.codeLocalVariableTypeTableSpanO
            r8.renumberOffsetBci(r0, r1, r9, r10)
            java.util.List r0 = r8.codeHandlerStartP
            r8.renumberBci(r0, r9, r10)
            java.util.List r0 = r8.codeHandlerStartP
            java.util.List r1 = r8.codeHandlerEndPO
            r8.renumberOffsetBci(r0, r1, r9, r10)
            java.util.List r3 = r8.codeHandlerStartP
            java.util.List r4 = r8.codeHandlerEndPO
            java.util.List r5 = r8.codeHandlerCatchPO
            r2 = r8
            r6 = r9
            r7 = r10
            r2.renumberDoubleOffsetBci(r3, r4, r5, r6, r7)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r8.classAttributeBands
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.renumberBci(r9, r10)
            goto L3b
        L4b:
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r8.methodAttributeBands
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.renumberBci(r9, r10)
            goto L51
        L61:
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r8.fieldAttributeBands
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.renumberBci(r9, r10)
            goto L67
        L77:
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r0 = r8.codeAttributeBands
            java.util.Iterator r0 = r0.iterator()
        L7d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r1
            r1.renumberBci(r9, r10)
            goto L7d
        L8d:
            return
    }

    public void endOfClass() {
            r6 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r0 = r6.tempFieldDesc
            int r0 = r0.size()
            int[] r1 = r6.class_field_count
            int r2 = r6.index
            r1[r2] = r0
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r1 = r6.field_descr
            org.apache.commons.compress.harmony.pack200.CPNameAndType[] r3 = new org.apache.commons.compress.harmony.pack200.CPNameAndType[r0]
            r1[r2] = r3
            long[][] r1 = r6.field_flags
            long[] r3 = new long[r0]
            r1[r2] = r3
            r1 = 0
            r2 = r1
        L1a:
            if (r2 >= r0) goto L43
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r3 = r6.field_descr
            int r4 = r6.index
            r3 = r3[r4]
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r4 = r6.tempFieldDesc
            java.lang.Object r4 = r4.get(r2)
            org.apache.commons.compress.harmony.pack200.CPNameAndType r4 = (org.apache.commons.compress.harmony.pack200.CPNameAndType) r4
            r3[r2] = r4
            long[][] r3 = r6.field_flags
            int r4 = r6.index
            r3 = r3[r4]
            java.util.List<java.lang.Long> r4 = r6.tempFieldFlags
            java.lang.Object r4 = r4.get(r2)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r3[r2] = r4
            int r2 = r2 + 1
            goto L1a
        L43:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r0 = r6.tempMethodDesc
            int r0 = r0.size()
            int[] r2 = r6.class_method_count
            int r3 = r6.index
            r2[r3] = r0
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r2 = r6.method_descr
            org.apache.commons.compress.harmony.pack200.CPNameAndType[] r4 = new org.apache.commons.compress.harmony.pack200.CPNameAndType[r0]
            r2[r3] = r4
            long[][] r2 = r6.method_flags
            long[] r4 = new long[r0]
            r2[r3] = r4
        L5b:
            if (r1 >= r0) goto L84
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r2 = r6.method_descr
            int r3 = r6.index
            r2 = r2[r3]
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r3 = r6.tempMethodDesc
            java.lang.Object r3 = r3.get(r1)
            org.apache.commons.compress.harmony.pack200.CPNameAndType r3 = (org.apache.commons.compress.harmony.pack200.CPNameAndType) r3
            r2[r1] = r3
            long[][] r2 = r6.method_flags
            int r3 = r6.index
            r2 = r2[r3]
            java.util.List<java.lang.Long> r3 = r6.tempMethodFlags
            java.lang.Object r3 = r3.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L5b
        L84:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r0 = r6.tempFieldDesc
            r0.clear()
            java.util.List<java.lang.Long> r0 = r6.tempFieldFlags
            r0.clear()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r0 = r6.tempMethodDesc
            r0.clear()
            java.util.List<java.lang.Long> r0 = r6.tempMethodFlags
            r0.clear()
            int r0 = r6.index
            int r0 = r0 + 1
            r6.index = r0
            return
    }

    public void endOfMethod() {
            r14 = this;
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            r1 = 0
            if (r0 == 0) goto L36
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r14.method_RVPA_bands
            int r3 = r0.numParams
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            int[] r4 = r0.annoN
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            org.apache.commons.compress.harmony.pack200.IntList r5 = r0.pairN
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.String> r6 = r0.typeRS
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.String> r7 = r0.nameRU
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.String> r8 = r0.tags
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.Object> r9 = r0.values
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.Integer> r10 = r0.caseArrayN
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.String> r11 = r0.nestTypeRS
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.String> r12 = r0.nestNameRU
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRVPA
            java.util.List<java.lang.Integer> r13 = r0.nestPairN
            r2.addParameterAnnotation(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.tempMethodRVPA = r1
        L36:
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            if (r0 == 0) goto L6b
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r14.method_RIPA_bands
            int r3 = r0.numParams
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            int[] r4 = r0.annoN
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            org.apache.commons.compress.harmony.pack200.IntList r5 = r0.pairN
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.String> r6 = r0.typeRS
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.String> r7 = r0.nameRU
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.String> r8 = r0.tags
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.Object> r9 = r0.values
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.Integer> r10 = r0.caseArrayN
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.String> r11 = r0.nestTypeRS
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.String> r12 = r0.nestNameRU
            org.apache.commons.compress.harmony.pack200.ClassBands$TempParamAnnotation r0 = r14.tempMethodRIPA
            java.util.List<java.lang.Integer> r13 = r0.nestPairN
            r2.addParameterAnnotation(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.tempMethodRIPA = r1
        L6b:
            java.util.List<java.lang.Long> r0 = r14.codeFlags
            int r0 = r0.size()
            if (r0 <= 0) goto Lba
            java.util.List<java.lang.Long> r0 = r14.codeFlags
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            org.apache.commons.compress.harmony.pack200.IntList r2 = r14.codeLocalVariableTableN
            int r3 = r2.size()
            int r3 = r3 + (-1)
            int r2 = r2.get(r3)
            r3 = 4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Lba
            if (r2 != 0) goto Lba
            org.apache.commons.compress.harmony.pack200.IntList r0 = r14.codeLocalVariableTableN
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            java.util.List<java.lang.Long> r0 = r14.codeFlags
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            java.util.List<java.lang.Long> r0 = r14.codeFlags
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
        Lba:
            return
    }

    public void finaliseBands() {
            r10 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r10.segmentHeader
            int r0 = r0.getDefaultMajorVersion()
            r1 = 0
            r2 = r1
        L8:
            long[] r3 = r10.class_flags
            int r4 = r3.length
            if (r2 >= r4) goto L28
            int[] r4 = r10.major_versions
            r4 = r4[r2]
            if (r4 == r0) goto L25
            r5 = r3[r2]
            r7 = 16777216(0x1000000, double:8.289046E-317)
            long r5 = r5 | r7
            r3[r2] = r5
            org.apache.commons.compress.harmony.pack200.IntList r3 = r10.classFileVersionMajor
            r3.add(r4)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r10.classFileVersionMinor
            r3.add(r1)
        L25:
            int r2 = r2 + 1
            goto L8
        L28:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r10.codeHandlerCount
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r10.codeHeaders = r0
            r0 = r1
            r2 = r0
        L34:
            int[] r3 = r10.codeHeaders
            int r3 = r3.length
            if (r0 >= r3) goto Lba
            org.apache.commons.compress.harmony.pack200.IntList r3 = r10.codeHandlerCount
            int r4 = r0 - r2
            int r3 = r3.get(r4)
            org.apache.commons.compress.harmony.pack200.IntList r5 = r10.codeMaxLocals
            int r5 = r5.get(r4)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r10.codeMaxStack
            int r6 = r6.get(r4)
            r7 = 145(0x91, float:2.03E-43)
            r8 = 1
            if (r3 == 0) goto L79
            r9 = 209(0xd1, float:2.93E-43)
            if (r3 == r8) goto L6a
            r7 = 2
            if (r3 == r7) goto L5a
            goto L87
        L5a:
            int r5 = r5 * 7
            int r5 = r5 + r6
            int r5 = r5 + r9
            r3 = 256(0x100, float:3.59E-43)
            if (r5 >= r3) goto L87
            r3 = 7
            if (r6 >= r3) goto L87
            int[] r3 = r10.codeHeaders
            r3[r0] = r5
            goto L87
        L6a:
            int r5 = r5 * 8
            int r5 = r5 + r6
            int r5 = r5 + r7
            if (r5 >= r9) goto L87
            r3 = 8
            if (r6 >= r3) goto L87
            int[] r3 = r10.codeHeaders
            r3[r0] = r5
            goto L87
        L79:
            int r5 = r5 * 12
            int r5 = r5 + r6
            int r5 = r5 + r8
            if (r5 >= r7) goto L87
            r3 = 12
            if (r6 >= r3) goto L87
            int[] r3 = r10.codeHeaders
            r3[r0] = r5
        L87:
            int[] r3 = r10.codeHeaders
            r3 = r3[r0]
            if (r3 == 0) goto L9f
            org.apache.commons.compress.harmony.pack200.IntList r3 = r10.codeHandlerCount
            r3.remove(r4)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r10.codeMaxLocals
            r3.remove(r4)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r10.codeMaxStack
            r3.remove(r4)
            int r2 = r2 + 1
            goto Lb6
        L9f:
            org.apache.commons.compress.harmony.pack200.Segment r3 = r10.segment
            org.apache.commons.compress.harmony.pack200.SegmentHeader r3 = r3.getSegmentHeader()
            boolean r3 = r3.have_all_code_flags()
            if (r3 != 0) goto Lb6
            java.util.List<java.lang.Long> r3 = r10.codeFlags
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.add(r4)
        Lb6:
            int r0 = r0 + 1
            goto L34
        Lba:
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r1
        Lc5:
            org.apache.commons.compress.harmony.pack200.CPClass[] r4 = r10.class_this
            int r5 = r4.length
            if (r3 >= r5) goto L137
            r4 = r4[r3]
            java.util.Map<org.apache.commons.compress.harmony.pack200.CPClass, java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass>> r5 = r10.classReferencesInnerClass
            java.lang.Object r5 = r5.get(r4)
            java.util.Set r5 = (java.util.Set) r5
            if (r5 == 0) goto L134
            org.apache.commons.compress.harmony.pack200.Segment r6 = r10.segment
            org.apache.commons.compress.harmony.pack200.IcBands r6 = r6.getIcBands()
            java.lang.String r4 = r4.toString()
            java.util.List r4 = r6.getInnerClassesForOuter(r4)
            if (r4 == 0) goto Lfc
            java.util.Iterator r4 = r4.iterator()
        Lea:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lfc
            java.lang.Object r6 = r4.next()
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r6 = (org.apache.commons.compress.harmony.pack200.IcBands.IcTuple) r6
            org.apache.commons.compress.harmony.pack200.CPClass r6 = r6.C
            r5.remove(r6)
            goto Lea
        Lfc:
            java.util.Iterator r4 = r5.iterator()
            r5 = r1
        L101:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L125
            java.lang.Object r6 = r4.next()
            org.apache.commons.compress.harmony.pack200.CPClass r6 = (org.apache.commons.compress.harmony.pack200.CPClass) r6
            org.apache.commons.compress.harmony.pack200.Segment r7 = r10.segment
            org.apache.commons.compress.harmony.pack200.IcBands r7 = r7.getIcBands()
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r6 = r7.getIcTuple(r6)
            if (r6 == 0) goto L101
            boolean r7 = r6.isAnonymous()
            if (r7 != 0) goto L101
            r2.add(r6)
            int r5 = r5 + 1
            goto L101
        L125:
            if (r5 == 0) goto L134
            r0.add(r5)
            long[] r4 = r10.class_flags
            r5 = r4[r3]
            r7 = 8388608(0x800000, double:4.144523E-317)
            long r5 = r5 | r7
            r4[r3] = r5
        L134:
            int r3 = r3 + 1
            goto Lc5
        L137:
            int[] r0 = r0.toArray()
            r10.class_InnerClasses_N = r0
            int r0 = r2.size()
            org.apache.commons.compress.harmony.pack200.CPClass[] r0 = new org.apache.commons.compress.harmony.pack200.CPClass[r0]
            r10.class_InnerClasses_RC = r0
            int r0 = r2.size()
            int[] r0 = new int[r0]
            r10.class_InnerClasses_F = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.classInnerClassesOuterRCN = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.classInnerClassesNameRUN = r0
            r0 = r1
        L15c:
            org.apache.commons.compress.harmony.pack200.CPClass[] r3 = r10.class_InnerClasses_RC
            int r3 = r3.length
            if (r0 >= r3) goto L19c
            java.lang.Object r3 = r2.get(r0)
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r3 = (org.apache.commons.compress.harmony.pack200.IcBands.IcTuple) r3
            org.apache.commons.compress.harmony.pack200.CPClass[] r4 = r10.class_InnerClasses_RC
            org.apache.commons.compress.harmony.pack200.CPClass r5 = r3.C
            r4[r0] = r5
            org.apache.commons.compress.harmony.pack200.CPClass r4 = r3.C2
            if (r4 != 0) goto L17a
            org.apache.commons.compress.harmony.pack200.CPUTF8 r4 = r3.N
            if (r4 != 0) goto L17a
            int[] r3 = r10.class_InnerClasses_F
            r3[r0] = r1
            goto L199
        L17a:
            int r4 = r3.F
            if (r4 != 0) goto L185
            int[] r4 = r10.class_InnerClasses_F
            r5 = 65536(0x10000, float:9.1835E-41)
            r4[r0] = r5
            goto L18b
        L185:
            int[] r4 = r10.class_InnerClasses_F
            int r5 = r3.F
            r4[r0] = r5
        L18b:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r4 = r10.classInnerClassesOuterRCN
            org.apache.commons.compress.harmony.pack200.CPClass r5 = r3.C2
            r4.add(r5)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r4 = r10.classInnerClassesNameRUN
            org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r3.N
            r4.add(r3)
        L199:
            int r0 = r0 + 1
            goto L15c
        L19c:
            org.apache.commons.compress.harmony.pack200.IntList r0 = new org.apache.commons.compress.harmony.pack200.IntList
            r0.<init>()
            org.apache.commons.compress.harmony.pack200.IntList r2 = new org.apache.commons.compress.harmony.pack200.IntList
            r2.<init>()
            org.apache.commons.compress.harmony.pack200.IntList r3 = new org.apache.commons.compress.harmony.pack200.IntList
            r3.<init>()
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.class_RVA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L1c1
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.class_RVA_bands
            int r5 = r5.numBackwardsCalls()
            r0.add(r5)
        L1c1:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.class_RIA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L1d2
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.class_RIA_bands
            int r5 = r5.numBackwardsCalls()
            r0.add(r5)
        L1d2:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.field_RVA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L1e3
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.field_RVA_bands
            int r5 = r5.numBackwardsCalls()
            r2.add(r5)
        L1e3:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.field_RIA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L1f4
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.field_RIA_bands
            int r5 = r5.numBackwardsCalls()
            r2.add(r5)
        L1f4:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RVA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L205
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RVA_bands
            int r5 = r5.numBackwardsCalls()
            r3.add(r5)
        L205:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RIA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L216
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RIA_bands
            int r5 = r5.numBackwardsCalls()
            r3.add(r5)
        L216:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RVPA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L227
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RVPA_bands
            int r5 = r5.numBackwardsCalls()
            r3.add(r5)
        L227:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RIPA_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L238
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_RIPA_bands
            int r5 = r5.numBackwardsCalls()
            r3.add(r5)
        L238:
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_AD_bands
            boolean r5 = r5.hasContent()
            if (r5 == 0) goto L249
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r5 = r10.method_AD_bands
            int r5 = r5.numBackwardsCalls()
            r3.add(r5)
        L249:
            org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda2 r5 = new org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda2
            r5.<init>()
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r6 = r10.classAttributeBands
            r6.sort(r5)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r6 = r10.methodAttributeBands
            r6.sort(r5)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r6 = r10.fieldAttributeBands
            r6.sort(r5)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r6 = r10.codeAttributeBands
            r6.sort(r5)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r5 = r10.classAttributeBands
            java.util.Iterator r5 = r5.iterator()
        L268:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L28a
            java.lang.Object r6 = r5.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r6 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r6
            boolean r7 = r6.isUsedAtLeastOnce()
            if (r7 == 0) goto L268
            int[] r6 = r6.numBackwardsCalls()
            int r7 = r6.length
            r8 = r1
        L280:
            if (r8 >= r7) goto L268
            r9 = r6[r8]
            r0.add(r9)
            int r8 = r8 + 1
            goto L280
        L28a:
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r5 = r10.methodAttributeBands
            java.util.Iterator r5 = r5.iterator()
        L290:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2b2
            java.lang.Object r6 = r5.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r6 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r6
            boolean r7 = r6.isUsedAtLeastOnce()
            if (r7 == 0) goto L290
            int[] r6 = r6.numBackwardsCalls()
            int r7 = r6.length
            r8 = r1
        L2a8:
            if (r8 >= r7) goto L290
            r9 = r6[r8]
            r3.add(r9)
            int r8 = r8 + 1
            goto L2a8
        L2b2:
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r5 = r10.fieldAttributeBands
            java.util.Iterator r5 = r5.iterator()
        L2b8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2da
            java.lang.Object r6 = r5.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r6 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r6
            boolean r7 = r6.isUsedAtLeastOnce()
            if (r7 == 0) goto L2b8
            int[] r6 = r6.numBackwardsCalls()
            int r7 = r6.length
            r8 = r1
        L2d0:
            if (r8 >= r7) goto L2b8
            r9 = r6[r8]
            r2.add(r9)
            int r8 = r8 + 1
            goto L2d0
        L2da:
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands> r5 = r10.codeAttributeBands
            java.util.Iterator r5 = r5.iterator()
        L2e0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L302
            java.lang.Object r6 = r5.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands r6 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands) r6
            boolean r7 = r6.isUsedAtLeastOnce()
            if (r7 == 0) goto L2e0
            int[] r6 = r6.numBackwardsCalls()
            int r7 = r6.length
            r8 = r1
        L2f8:
            if (r8 >= r7) goto L2e0
            r9 = r6[r8]
            r4.add(r9)
            int r8 = r8 + 1
            goto L2f8
        L302:
            int[] r0 = r0.toArray()
            r10.class_attr_calls = r0
            int[] r0 = r2.toArray()
            r10.field_attr_calls = r0
            int[] r0 = r3.toArray()
            r10.method_attr_calls = r0
            int[] r0 = r4.toArray()
            r10.code_attr_calls = r0
            return
    }

    public boolean isAnySyntheticClasses() {
            r1 = this;
            boolean r0 = r1.anySyntheticClasses
            return r0
    }

    public boolean isAnySyntheticFields() {
            r1 = this;
            boolean r0 = r1.anySyntheticFields
            return r0
    }

    public boolean isAnySyntheticMethods() {
            r1 = this;
            boolean r0 = r1.anySyntheticMethods
            return r0
    }

    /* JADX INFO: renamed from: lambda$addClass$0$org-apache-commons-compress-harmony-pack200-ClassBands, reason: not valid java name */
    /* synthetic */ org.apache.commons.compress.harmony.pack200.CPClass m2552xbe859155(java.lang.String[] r2, int r3) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r1.cpBands
            r2 = r2[r3]
            org.apache.commons.compress.harmony.pack200.CPClass r2 = r0.getCPClass(r2)
            return r2
    }

    public int numClassesProcessed() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r14) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r13 = this;
            java.lang.String r0 = "Writing class bands..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.CPClass[] r0 = r13.class_this
            int[] r0 = r13.getInts(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r2 = "class_this"
            byte[] r0 = r13.encodeBandInt(r2, r0, r1)
            r14.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from class_this["
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.pack200.CPClass[] r1 = r13.class_this
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.CPClass[] r0 = r13.class_super
            int[] r0 = r13.getInts(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "class_super"
            byte[] r0 = r13.encodeBandInt(r4, r0, r3)
            r14.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_super["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.CPClass[] r3 = r13.class_super
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r13.class_interface_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "class_interface_count"
            byte[] r0 = r13.encodeBandInt(r4, r0, r3)
            r14.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_interface_count["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r13.class_interface_count
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r13.class_interface_count
            int r0 = r13.sum(r0)
            int[] r3 = new int[r0]
            org.apache.commons.compress.harmony.pack200.CPClass[][] r4 = r13.class_interface
            int r5 = r4.length
            r6 = 0
            r7 = r6
            r8 = r7
        Lac:
            if (r7 >= r5) goto Lc6
            r9 = r4[r7]
            if (r9 == 0) goto Lc3
            int r10 = r9.length
            r11 = r6
        Lb4:
            if (r11 >= r10) goto Lc3
            r12 = r9[r11]
            int r12 = r12.getIndex()
            r3[r8] = r12
            int r8 = r8 + 1
            int r11 = r11 + 1
            goto Lb4
        Lc3:
            int r7 = r7 + 1
            goto Lac
        Lc6:
            java.lang.String r4 = "class_interface"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r3 = r13.encodeBandInt(r4, r3, r5)
            r14.write(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            int r3 = r3.length
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = " bytes from class_interface["
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r13.class_field_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "class_field_count"
            byte[] r0 = r13.encodeBandInt(r4, r0, r3)
            r14.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_field_count["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r13.class_field_count
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r13.class_method_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "class_method_count"
            byte[] r0 = r13.encodeBandInt(r4, r0, r3)
            r14.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from class_method_count["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r13.class_method_count
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r13.class_field_count
            int r0 = r13.sum(r0)
            int[] r3 = new int[r0]
            r4 = r6
            r5 = r4
        L158:
            int r7 = r13.index
            if (r4 >= r7) goto L174
            r7 = r6
        L15d:
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r8 = r13.field_descr
            r8 = r8[r4]
            int r9 = r8.length
            if (r7 >= r9) goto L171
            r8 = r8[r7]
            int r8 = r8.getIndex()
            r3[r5] = r8
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L15d
        L171:
            int r4 = r4 + 1
            goto L158
        L174:
            java.lang.String r4 = "field_descr"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r3 = r13.encodeBandInt(r4, r3, r5)
            r14.write(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            int r3 = r3.length
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = " bytes from field_descr["
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            r13.writeFieldAttributeBands(r14)
            int[] r0 = r13.class_method_count
            int r0 = r13.sum(r0)
            int[] r3 = new int[r0]
            r4 = r6
            r5 = r4
        L1ab:
            int r7 = r13.index
            if (r4 >= r7) goto L1c7
            r7 = r6
        L1b0:
            org.apache.commons.compress.harmony.pack200.CPNameAndType[][] r8 = r13.method_descr
            r8 = r8[r4]
            int r9 = r8.length
            if (r7 >= r9) goto L1c4
            r8 = r8[r7]
            int r8 = r8.getIndex()
            r3[r5] = r8
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L1b0
        L1c4:
            int r4 = r4 + 1
            goto L1ab
        L1c7:
            java.lang.String r4 = "method_descr"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.MDELTA5
            byte[] r3 = r13.encodeBandInt(r4, r3, r5)
            r14.write(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            int r2 = r3.length
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r3 = " bytes from method_descr["
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            r13.writeMethodAttributeBands(r14)
            r13.writeClassAttributeBands(r14)
            r13.writeCodeBands(r14)
            return
    }

    public void removeCurrentClass() {
            r20 = this;
            r0 = r20
            long[] r1 = r0.class_flags
            int r2 = r0.index
            r2 = r1[r2]
            r4 = 131072(0x20000, double:6.4758E-319)
            long r1 = r2 & r4
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L1e
            java.util.List<org.apache.commons.compress.harmony.pack200.CPUTF8> r1 = r0.classSourceFile
            int r2 = r1.size()
            int r2 = r2 + (-1)
            r1.remove(r2)
        L1e:
            long[] r1 = r0.class_flags
            int r2 = r0.index
            r2 = r1[r2]
            r8 = 262144(0x40000, double:1.295163E-318)
            long r1 = r2 & r8
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L43
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r1 = r0.classEnclosingMethodClass
            int r2 = r1.size()
            int r2 = r2 + (-1)
            r1.remove(r2)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r1 = r0.classEnclosingMethodDesc
            int r2 = r1.size()
            int r2 = r2 + (-1)
            r1.remove(r2)
        L43:
            long[] r1 = r0.class_flags
            int r2 = r0.index
            r2 = r1[r2]
            r10 = 524288(0x80000, double:2.590327E-318)
            long r1 = r2 & r10
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L5d
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r1 = r0.classSignature
            int r2 = r1.size()
            int r2 = r2 + (-1)
            r1.remove(r2)
        L5d:
            long[] r1 = r0.class_flags
            int r2 = r0.index
            r2 = r1[r2]
            r12 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r2 & r12
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L71
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r1 = r0.class_RVA_bands
            r1.removeLatest()
        L71:
            long[] r1 = r0.class_flags
            int r2 = r0.index
            r2 = r1[r2]
            r14 = 4194304(0x400000, double:2.0722615E-317)
            long r1 = r2 & r14
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L85
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r1 = r0.class_RIA_bands
            r1.removeLatest()
        L85:
            java.util.List<java.lang.Long> r1 = r0.tempFieldFlags
            java.util.Iterator r1 = r1.iterator()
        L8b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r1.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r16 = r2 & r10
            int r16 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r16 == 0) goto Lac
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r8 = r0.fieldSignature
            int r9 = r8.size()
            int r9 = r9 + (-1)
            r8.remove(r9)
        Lac:
            long r8 = r2 & r4
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto Lbd
            java.util.List<org.apache.commons.compress.harmony.pack200.CPConstant<?>> r8 = r0.fieldConstantValueKQ
            int r9 = r8.size()
            int r9 = r9 + (-1)
            r8.remove(r9)
        Lbd:
            long r8 = r2 & r12
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto Lc8
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r8 = r0.field_RVA_bands
            r8.removeLatest()
        Lc8:
            long r2 = r2 & r14
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto Ld2
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.field_RIA_bands
            r2.removeLatest()
        Ld2:
            r8 = 262144(0x40000, double:1.295163E-318)
            goto L8b
        Ld6:
            java.util.List<java.lang.Long> r1 = r0.tempMethodFlags
            java.util.Iterator r1 = r1.iterator()
        Ldc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L263
            java.lang.Object r2 = r1.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r8 = r2.longValue()
            long r18 = r8 & r10
            int r2 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r2 == 0) goto Lfd
            java.util.List<org.apache.commons.compress.harmony.pack200.CPSignature> r2 = r0.methodSignature
            int r18 = r2.size()
            int r10 = r18 + (-1)
            r2.remove(r10)
        Lfd:
            r10 = 262144(0x40000, double:1.295163E-318)
            long r16 = r8 & r10
            int r2 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r2 == 0) goto L123
            org.apache.commons.compress.harmony.pack200.IntList r2 = r0.methodExceptionNumber
            int r16 = r2.size()
            int r10 = r16 + (-1)
            int r2 = r2.remove(r10)
            r10 = 0
        L113:
            if (r10 >= r2) goto L123
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r11 = r0.methodExceptionClasses
            int r16 = r11.size()
            int r3 = r16 + (-1)
            r11.remove(r3)
            int r10 = r10 + 1
            goto L113
        L123:
            long r2 = r8 & r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L21e
            org.apache.commons.compress.harmony.pack200.IntList r2 = r0.codeMaxLocals
            int r3 = r2.size()
            int r3 = r3 + (-1)
            r2.remove(r3)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r0.codeMaxStack
            int r3 = r2.size()
            int r3 = r3 + (-1)
            r2.remove(r3)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r0.codeHandlerCount
            int r3 = r2.size()
            int r3 = r3 + (-1)
            int r2 = r2.remove(r3)
            r3 = 0
        L14c:
            if (r3 >= r2) goto L16d
            java.util.List r10 = r0.codeHandlerStartP
            int r10 = r10.size()
            int r10 = r10 + (-1)
            java.util.List r11 = r0.codeHandlerStartP
            r11.remove(r10)
            java.util.List r11 = r0.codeHandlerEndPO
            r11.remove(r10)
            java.util.List r11 = r0.codeHandlerCatchPO
            r11.remove(r10)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r11 = r0.codeHandlerClass
            r11.remove(r10)
            int r3 = r3 + 1
            goto L14c
        L16d:
            boolean r2 = r0.stripDebug
            if (r2 != 0) goto L21e
            java.util.List<java.lang.Long> r2 = r0.codeFlags
            int r3 = r2.size()
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.remove(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            org.apache.commons.compress.harmony.pack200.IntList r10 = r0.codeLocalVariableTableN
            int r11 = r10.size()
            int r11 = r11 + (-1)
            int r10 = r10.remove(r11)
            r11 = 0
        L190:
            if (r11 >= r10) goto L1b9
            java.util.List r4 = r0.codeLocalVariableTableBciP
            int r4 = r4.size()
            int r4 = r4 + (-1)
            java.util.List r5 = r0.codeLocalVariableTableBciP
            r5.remove(r4)
            java.util.List r5 = r0.codeLocalVariableTableSpanO
            r5.remove(r4)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r5 = r0.codeLocalVariableTableNameRU
            r5.remove(r4)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r5 = r0.codeLocalVariableTableTypeRS
            r5.remove(r4)
            org.apache.commons.compress.harmony.pack200.IntList r5 = r0.codeLocalVariableTableSlot
            r5.remove(r4)
            int r11 = r11 + 1
            r4 = 131072(0x20000, double:6.4758E-319)
            goto L190
        L1b9:
            r4 = 8
            long r4 = r4 & r2
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L1f3
            org.apache.commons.compress.harmony.pack200.IntList r4 = r0.codeLocalVariableTypeTableN
            int r5 = r4.size()
            int r5 = r5 + (-1)
            int r4 = r4.remove(r5)
            r5 = 0
        L1cd:
            if (r5 >= r4) goto L1f3
            java.util.List r10 = r0.codeLocalVariableTypeTableBciP
            int r10 = r10.size()
            int r10 = r10 + (-1)
            java.util.List r11 = r0.codeLocalVariableTypeTableBciP
            r11.remove(r10)
            java.util.List r11 = r0.codeLocalVariableTypeTableSpanO
            r11.remove(r10)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r11 = r0.codeLocalVariableTypeTableNameRU
            r11.remove(r10)
            java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r11 = r0.codeLocalVariableTypeTableTypeRS
            r11.remove(r10)
            org.apache.commons.compress.harmony.pack200.IntList r11 = r0.codeLocalVariableTypeTableSlot
            r11.remove(r10)
            int r5 = r5 + 1
            goto L1cd
        L1f3:
            r4 = 2
            long r2 = r2 & r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L21e
            org.apache.commons.compress.harmony.pack200.IntList r2 = r0.codeLineNumberTableN
            int r3 = r2.size()
            int r3 = r3 + (-1)
            int r2 = r2.remove(r3)
            r3 = 0
        L207:
            if (r3 >= r2) goto L21e
            java.util.List r4 = r0.codeLineNumberTableBciP
            int r4 = r4.size()
            int r4 = r4 + (-1)
            java.util.List r5 = r0.codeLineNumberTableBciP
            r5.remove(r4)
            org.apache.commons.compress.harmony.pack200.IntList r5 = r0.codeLineNumberTableLine
            r5.remove(r4)
            int r3 = r3 + 1
            goto L207
        L21e:
            long r2 = r8 & r12
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L229
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.method_RVA_bands
            r2.removeLatest()
        L229:
            long r2 = r8 & r14
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L234
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.method_RIA_bands
            r2.removeLatest()
        L234:
            r2 = 8388608(0x800000, double:4.144523E-317)
            long r2 = r2 & r8
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L241
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.method_RVPA_bands
            r2.removeLatest()
        L241:
            r2 = 16777216(0x1000000, double:8.289046E-317)
            long r2 = r2 & r8
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L24e
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.method_RIPA_bands
            r2.removeLatest()
        L24e:
            r2 = 33554432(0x2000000, double:1.6578092E-316)
            long r2 = r2 & r8
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L25b
            org.apache.commons.compress.harmony.pack200.MetadataBandGroup r2 = r0.method_AD_bands
            r2.removeLatest()
        L25b:
            r4 = 131072(0x20000, double:6.4758E-319)
            r10 = 524288(0x80000, double:2.590327E-318)
            goto Ldc
        L263:
            org.apache.commons.compress.harmony.pack200.CPClass[] r1 = r0.class_this
            int r2 = r0.index
            r3 = 0
            r1[r2] = r3
            org.apache.commons.compress.harmony.pack200.CPClass[] r1 = r0.class_super
            r1[r2] = r3
            int[] r1 = r0.class_interface_count
            r4 = 0
            r1[r2] = r4
            org.apache.commons.compress.harmony.pack200.CPClass[][] r1 = r0.class_interface
            r1[r2] = r3
            int[] r1 = r0.major_versions
            r1[r2] = r4
            long[] r1 = r0.class_flags
            r1[r2] = r6
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r1 = r0.tempFieldDesc
            r1.clear()
            java.util.List<java.lang.Long> r1 = r0.tempFieldFlags
            r1.clear()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPNameAndType> r1 = r0.tempMethodDesc
            r1.clear()
            java.util.List<java.lang.Long> r1 = r0.tempMethodFlags
            r1.clear()
            int r1 = r0.index
            if (r1 <= 0) goto L29b
            int r1 = r1 + (-1)
            r0.index = r1
        L29b:
            return
    }
}
