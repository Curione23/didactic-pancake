package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class ClassBands extends org.apache.commons.compress.harmony.unpack200.BandSet {
    private final org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap attrMap;
    private long[] classAccessFlags;
    private java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] classAttributes;
    private final int classCount;
    private int[] classFieldCount;
    private long[] classFlags;
    private int[][] classInterfacesInts;
    private int[] classMethodCount;
    private int[] classSuperInts;
    private java.lang.String[] classThis;
    private int[] classThisInts;
    private int[] classVersionMajor;
    private int[] classVersionMinor;
    private java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] codeAttributes;
    private int[][] codeHandlerCatchPO;
    private int[][] codeHandlerClassRCN;
    private int[] codeHandlerCount;
    private int[][] codeHandlerEndPO;
    private int[][] codeHandlerStartP;
    private boolean[] codeHasAttributes;
    private int[] codeMaxNALocals;
    private int[] codeMaxStack;
    private final org.apache.commons.compress.harmony.unpack200.CpBands cpBands;
    private long[][] fieldAccessFlags;
    private java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] fieldAttributes;
    private java.lang.String[][] fieldDescr;
    private int[][] fieldDescrInts;
    private long[][] fieldFlags;
    private org.apache.commons.compress.harmony.unpack200.IcTuple[][] icLocal;
    private long[][] methodAccessFlags;
    private int[] methodAttrCalls;
    private java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] methodAttributes;
    private java.lang.String[][] methodDescr;
    private int[][] methodDescrInts;
    private long[][] methodFlags;
    private final org.apache.commons.compress.harmony.unpack200.SegmentOptions options;

    /* JADX INFO: renamed from: $r8$lambda$ZpmJ_VNnAu-jaI1Md1zDJiayPjU, reason: not valid java name */
    public static /* synthetic */ java.util.ArrayList m2561$r8$lambda$ZpmJ_VNnAujaI1Md1zDJiayPjU(java.util.Collection r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$wBZ5N9SAmxJLRX-vx8hIUeo_fgc, reason: not valid java name */
    public static /* synthetic */ java.util.ArrayList m2562$r8$lambda$wBZ5N9SAmxJLRXvx8hIUeo_fgc() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public ClassBands(org.apache.commons.compress.harmony.unpack200.Segment r2) {
            r1 = this;
            r1.<init>(r2)
            org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands r0 = r2.getAttrDefinitionBands()
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r0 = r0.getAttributeDefinitionMap()
            r1.attrMap = r0
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r2.getCpBands()
            r1.cpBands = r2
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r2 = r1.header
            int r2 = r2.getClassCount()
            r1.classCount = r2
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r2 = r1.header
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r2 = r2.getOptions()
            r1.options = r2
            return
    }

    private int getCallCount(int[][] r12, long[][] r13, int r14) {
            r11 = this;
            int r0 = r12.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L1f
            r4 = r12[r2]
            int r5 = r4.length
            r6 = r1
        La:
            if (r6 >= r5) goto L1c
            r7 = r4[r6]
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r8 = r11.attrMap
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r7 = r8.getAttributeLayout(r7, r14)
            int r7 = r7.numBackwardsCallables()
            int r3 = r3 + r7
            int r6 = r6 + 1
            goto La
        L1c:
            int r2 = r2 + 1
            goto L4
        L1f:
            int r12 = r13.length
            r0 = r1
            r2 = r0
        L22:
            if (r0 >= r12) goto L35
            r4 = r13[r0]
            int r5 = r4.length
            r6 = r1
        L28:
            if (r6 >= r5) goto L32
            r7 = r4[r6]
            long r9 = (long) r2
            long r7 = r7 | r9
            int r2 = (int) r7
            int r6 = r6 + 1
            goto L28
        L32:
            int r0 = r0 + 1
            goto L22
        L35:
            r12 = 26
            if (r1 >= r12) goto L4c
            r12 = 1
            int r12 = r12 << r1
            r12 = r12 & r2
            if (r12 == 0) goto L49
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r12 = r11.attrMap
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r12 = r12.getAttributeLayout(r1, r14)
            int r12 = r12.numBackwardsCallables()
            int r3 = r3 + r12
        L49:
            int r1 = r1 + 1
            goto L35
        L4c:
            return r3
    }

    static /* synthetic */ java.util.ArrayList lambda$parseClassAttrBands$0(int r0) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    static /* synthetic */ java.util.List lambda$parseCodeBands$1(int r0) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    private void parseClassAttrBands(java.io.InputStream r51) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r50 = this;
            r6 = r50
            r7 = r51
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r6.cpBands
            java.lang.String[] r8 = r0.getCpUTF8()
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r6.cpBands
            java.lang.String[] r9 = r0.getCpClass()
            int r0 = r6.classCount
            java.util.ArrayList[] r0 = new java.util.ArrayList[r0]
            r6.classAttributes = r0
            org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda4 r1 = new org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda4
            r1.<init>()
            java.util.Arrays.setAll(r0, r1)
            int r3 = r6.classCount
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r6.options
            boolean r5 = r0.hasClassFlagsHi()
            java.lang.String r1 = "class_flags"
            r0 = r50
            r2 = r51
            long[] r0 = r0.parseFlags(r1, r2, r3, r4, r5)
            r6.classFlags = r0
            int r0 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countBit16(r0)
            java.lang.String r1 = "class_attr_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r0 = r6.decodeBandInt(r1, r7, r2, r0)
            java.lang.String r1 = "class_attr_indexes"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r0 = r6.decodeBandInt(r1, r7, r2, r0)
            long[] r1 = r6.classFlags
            long[][] r1 = new long[][]{r1}
            r2 = 0
            int r0 = r6.getCallCount(r0, r1, r2)
            java.lang.String r1 = "class_attr_calls"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r0 = r6.decodeBandInt(r1, r7, r3, r0)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r1 = r6.attrMap
            java.lang.String r3 = "Deprecated"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = r1.getAttributeLayout(r3, r2)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r3 = r6.attrMap
            java.lang.String r4 = "SourceFile"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r3 = r3.getAttributeLayout(r4, r2)
            long[] r4 = r6.classFlags
            int r4 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r4, r3)
            java.lang.String r5 = "class_SourceFile_RUN"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r4 = r6.decodeBandInt(r5, r7, r10, r4)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r5 = r6.attrMap
            java.lang.String r10 = "EnclosingMethod"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r5 = r5.getAttributeLayout(r10, r2)
            long[] r10 = r6.classFlags
            int r10 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r10, r5)
            java.lang.String r11 = "class_EnclosingMethod_RC"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r12 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r11 = r6.decodeBandInt(r11, r7, r12, r10)
            java.lang.String r12 = "class_EnclosingMethod_RDN"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r13 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r10 = r6.decodeBandInt(r12, r7, r13, r10)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r12 = r6.attrMap
            java.lang.String r13 = "Signature"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r12 = r12.getAttributeLayout(r13, r2)
            long[] r13 = r6.classFlags
            int r13 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r13, r12)
            java.lang.String r14 = "class_Signature_RS"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r15 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r13 = r6.decodeBandInt(r14, r7, r15, r13)
            int r14 = r6.parseClassMetadataBands(r7, r0)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r15 = r6.attrMap
            r16 = r14
            java.lang.String r14 = "InnerClasses"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r14 = r15.getAttributeLayout(r14, r2)
            long[] r15 = r6.classFlags
            int r15 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r15, r14)
            java.lang.String r2 = "class_InnerClasses_N"
            r17 = r8
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r2 = r6.decodeBandInt(r2, r7, r8, r15)
            java.lang.String r8 = "class_InnerClasses_RC"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r15 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r8 = r6.decodeBandInt(r8, r7, r15, r2)
            java.lang.String r15 = "class_InnerClasses_F"
            r18 = r9
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r9 = r6.decodeBandInt(r15, r7, r9, r2)
            int r15 = r9.length
            r20 = r2
            r19 = r8
            r2 = 0
            r8 = 0
        Le4:
            if (r8 >= r15) goto L104
            r21 = r15
            r15 = r9[r8]
            r22 = r9
            int r9 = r15.length
            r23 = r14
            r14 = 0
        Lf0:
            if (r14 >= r9) goto Lfb
            r24 = r15[r14]
            if (r24 == 0) goto Lf8
            int r2 = r2 + 1
        Lf8:
            int r14 = r14 + 1
            goto Lf0
        Lfb:
            int r8 = r8 + 1
            r15 = r21
            r9 = r22
            r14 = r23
            goto Le4
        L104:
            r22 = r9
            r23 = r14
            java.lang.String r8 = "class_InnerClasses_outer_RCN"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r8 = r6.decodeBandInt(r8, r7, r9, r2)
            java.lang.String r9 = "class_InnerClasses_name_RUN"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r14 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r2 = r6.decodeBandInt(r9, r7, r14, r2)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r9 = r6.attrMap
            java.lang.String r14 = "class-file version"
            r15 = 0
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r9 = r9.getAttributeLayout(r14, r15)
            long[] r14 = r6.classFlags
            int r14 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r14, r9)
            java.lang.String r15 = "class_file_version_minor_H"
            r21 = r9
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r9 = r6.decodeBandInt(r15, r7, r9, r14)
            java.lang.String r15 = "class_file_version_major_H"
            r24 = r9
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r9 = r6.decodeBandInt(r15, r7, r9, r14)
            if (r14 <= 0) goto L147
            int r14 = r6.classCount
            int[] r15 = new int[r14]
            r6.classVersionMajor = r15
            int[] r14 = new int[r14]
            r6.classVersionMinor = r14
        L147:
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r14 = r6.header
            int r14 = r14.getDefaultClassMajorVersion()
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r15 = r6.header
            int r15 = r15.getDefaultClassMinorVersion()
            r25 = r15
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r15 = r6.options
            boolean r15 = r15.hasClassFlagsHi()
            if (r15 == 0) goto L160
            r15 = 62
            goto L162
        L160:
            r15 = 31
        L162:
            r26 = r14
            int r14 = r15 + 1
            r27 = r9
            org.apache.commons.compress.harmony.unpack200.AttributeLayout[] r9 = new org.apache.commons.compress.harmony.unpack200.AttributeLayout[r14]
            r28 = r2
            int[] r2 = new int[r14]
            r29 = r8
            java.util.List[] r8 = new java.util.List[r14]
            r30 = r13
            r13 = 0
        L175:
            if (r13 >= r15) goto L19b
            r31 = r15
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r15 = r6.attrMap
            r32 = r12
            r12 = 0
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r15 = r15.getAttributeLayout(r13, r12)
            if (r15 == 0) goto L194
            boolean r12 = r15.isDefaultLayout()
            if (r12 != 0) goto L194
            r9[r13] = r15
            long[] r12 = r6.classFlags
            int r12 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r12, r15)
            r2[r13] = r12
        L194:
            int r13 = r13 + 1
            r15 = r31
            r12 = r32
            goto L175
        L19b:
            r32 = r12
            r12 = r16
            r13 = 0
        L1a0:
            if (r13 >= r14) goto L1da
            r15 = r2[r13]
            if (r15 <= 0) goto L1cd
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r15 = r6.attrMap
            r16 = r14
            r14 = r9[r13]
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands r14 = r15.getAttributeBands(r14)
            r15 = r2[r13]
            java.util.List r15 = r14.parseAttributes(r7, r15)
            r8[r13] = r15
            r15 = r9[r13]
            int r15 = r15.numBackwardsCallables()
            r31 = r2
            if (r15 <= 0) goto L1d1
            int[] r2 = new int[r15]
            r7 = 0
            java.lang.System.arraycopy(r0, r12, r2, r7, r15)
            r14.setBackwardsCalls(r2)
            int r12 = r12 + r15
            goto L1d1
        L1cd:
            r31 = r2
            r16 = r14
        L1d1:
            int r13 = r13 + 1
            r7 = r51
            r14 = r16
            r2 = r31
            goto L1a0
        L1da:
            r16 = r14
            int r0 = r6.classCount
            org.apache.commons.compress.harmony.unpack200.IcTuple[][] r0 = new org.apache.commons.compress.harmony.unpack200.IcTuple[r0][]
            r6.icLocal = r0
            r51 = 0
            r0 = 0
            r2 = 0
            r7 = 0
            r12 = 0
            r13 = 0
            r15 = 0
        L1ea:
            int r14 = r6.classCount
            if (r15 >= r14) goto L408
            long[] r14 = r6.classFlags
            r33 = r8
            r31 = r9
            r8 = r14[r15]
            boolean r14 = r1.matches(r8)
            if (r14 == 0) goto L20b
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r14 = r6.classAttributes
            r14 = r14[r15]
            r34 = r1
            org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute
            r1.<init>()
            r14.add(r1)
            goto L20d
        L20b:
            r34 = r1
        L20d:
            boolean r1 = r3.matches(r8)
            if (r1 == 0) goto L294
            r1 = r4[r0]
            r35 = r15
            long r14 = (long) r1
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r6.cpBands
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r1 = r1.getConstantPool()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r1 = r3.getValue(r14, r1)
            if (r1 != 0) goto L27e
            java.lang.String[] r1 = r6.classThis
            r1 = r1[r35]
            r14 = 47
            int r14 = r1.lastIndexOf(r14)
            r15 = 1
            int r14 = r14 + r15
            java.lang.String r1 = r1.substring(r14)
            r14 = 46
            int r14 = r1.lastIndexOf(r14)
            int r14 = r14 + r15
            java.lang.String r1 = r1.substring(r14)
            char[] r14 = r1.toCharArray()
            r37 = r3
            r15 = 0
        L246:
            int r3 = r14.length
            if (r15 >= r3) goto L258
            char r3 = r14[r15]
            r38 = r4
            r4 = 45
            if (r3 > r4) goto L253
            r3 = -1
            goto L25c
        L253:
            int r15 = r15 + 1
            r4 = r38
            goto L246
        L258:
            r38 = r4
            r3 = -1
            r15 = -1
        L25c:
            if (r15 <= r3) goto L263
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r15)
        L263:
            org.apache.commons.compress.harmony.unpack200.CpBands r4 = r6.cpBands
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.StringBuilder r1 = r14.append(r1)
            java.lang.String r14 = ".java"
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r1 = r1.toString()
            r14 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r4.cpUTF8Value(r1, r14)
            goto L283
        L27e:
            r37 = r3
            r38 = r4
            r3 = -1
        L283:
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r4 = r6.classAttributes
            r4 = r4[r35]
            org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute r14 = new org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r1
            r14.<init>(r1)
            r4.add(r14)
            int r0 = r0 + 1
            goto L29b
        L294:
            r37 = r3
            r38 = r4
            r35 = r15
            r3 = -1
        L29b:
            boolean r1 = r5.matches(r8)
            if (r1 == 0) goto L2c5
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r6.cpBands
            r14 = r11[r2]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r1.cpClassValue(r14)
            r14 = r10[r2]
            if (r14 == 0) goto L2b6
            org.apache.commons.compress.harmony.unpack200.CpBands r15 = r6.cpBands
            int r14 = r14 + (-1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r14 = r15.cpNameAndTypeValue(r14)
            goto L2b7
        L2b6:
            r14 = 0
        L2b7:
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r15 = r6.classAttributes
            r15 = r15[r35]
            org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute
            r3.<init>(r1, r14)
            r15.add(r3)
            int r2 = r2 + 1
        L2c5:
            r1 = r32
            boolean r3 = r1.matches(r8)
            if (r3 == 0) goto L2ea
            r3 = r30[r7]
            long r14 = (long) r3
            org.apache.commons.compress.harmony.unpack200.CpBands r3 = r6.cpBands
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r3 = r3.getConstantPool()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = r1.getValue(r14, r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r3
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r14 = r6.classAttributes
            r14 = r14[r35]
            org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute r15 = new org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute
            r15.<init>(r3)
            r14.add(r15)
            int r7 = r7 + 1
        L2ea:
            r3 = r23
            boolean r14 = r3.matches(r8)
            if (r14 == 0) goto L393
            org.apache.commons.compress.harmony.unpack200.IcTuple[][] r14 = r6.icLocal
            r15 = r20[r12]
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r15 = new org.apache.commons.compress.harmony.unpack200.IcTuple[r15]
            r14[r35] = r15
            r14 = r51
            r15 = 0
        L2fd:
            org.apache.commons.compress.harmony.unpack200.IcTuple[][] r4 = r6.icLocal
            r4 = r4[r35]
            int r4 = r4.length
            if (r15 >= r4) goto L38a
            r4 = r19[r12]
            r44 = r4[r15]
            r4 = r18[r44]
            r32 = r22[r12]
            r32 = r32[r15]
            if (r32 == 0) goto L32b
            r36 = r29[r14]
            r39 = r28[r14]
            r40 = r18[r36]
            r41 = r17[r39]
            int r14 = r14 + 1
            r48 = r1
            r49 = r2
            r45 = r36
            r46 = r39
            r42 = r40
            r43 = r41
            r36 = r0
            r41 = r32
            goto L36f
        L32b:
            r36 = r0
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r6.segment
            org.apache.commons.compress.harmony.unpack200.IcBands r0 = r0.getIcBands()
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r0 = r0.getIcTuples()
            r48 = r1
            int r1 = r0.length
            r49 = r2
            r2 = 0
        L33d:
            if (r2 >= r1) goto L365
            r39 = r0[r2]
            r51 = r0
            java.lang.String r0 = r39.getC()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L360
            int r0 = r39.getF()
            java.lang.String r1 = r39.getC2()
            java.lang.String r2 = r39.getN()
            r41 = r0
            r42 = r1
            r43 = r2
            goto L36b
        L360:
            int r2 = r2 + 1
            r0 = r51
            goto L33d
        L365:
            r41 = r32
            r42 = 0
            r43 = 0
        L36b:
            r45 = -1
            r46 = -1
        L36f:
            org.apache.commons.compress.harmony.unpack200.IcTuple r0 = new org.apache.commons.compress.harmony.unpack200.IcTuple
            r39 = r0
            r40 = r4
            r47 = r15
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
            org.apache.commons.compress.harmony.unpack200.IcTuple[][] r1 = r6.icLocal
            r1 = r1[r35]
            r1[r15] = r0
            int r15 = r15 + 1
            r0 = r36
            r1 = r48
            r2 = r49
            goto L2fd
        L38a:
            r36 = r0
            r48 = r1
            r49 = r2
            int r12 = r12 + 1
            goto L39b
        L393:
            r36 = r0
            r48 = r1
            r49 = r2
            r14 = r51
        L39b:
            r0 = r21
            boolean r1 = r0.matches(r8)
            if (r1 == 0) goto L3b2
            int[] r1 = r6.classVersionMajor
            r2 = r27[r13]
            r1[r35] = r2
            int[] r1 = r6.classVersionMinor
            r2 = r24[r13]
            r1[r35] = r2
            int r13 = r13 + 1
            goto L3bc
        L3b2:
            int[] r1 = r6.classVersionMajor
            if (r1 == 0) goto L3bc
            r1[r35] = r26
            int[] r1 = r6.classVersionMinor
            r1[r35] = r25
        L3bc:
            r1 = r16
            r15 = 0
        L3bf:
            if (r15 >= r1) goto L3eb
            r2 = r31[r15]
            if (r2 == 0) goto L3e3
            boolean r2 = r2.matches(r8)
            if (r2 == 0) goto L3e3
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r2 = r6.classAttributes
            r2 = r2[r35]
            r4 = r33[r15]
            r21 = r0
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r4
            r2.add(r4)
            r2 = r33[r15]
            r2.remove(r0)
            goto L3e6
        L3e3:
            r21 = r0
            r0 = 0
        L3e6:
            int r15 = r15 + 1
            r0 = r21
            goto L3bf
        L3eb:
            r21 = r0
            r0 = 0
            int r15 = r35 + 1
            r16 = r1
            r23 = r3
            r51 = r14
            r9 = r31
            r8 = r33
            r1 = r34
            r0 = r36
            r3 = r37
            r4 = r38
            r32 = r48
            r2 = r49
            goto L1ea
        L408:
            return
    }

    private int parseClassMetadataBands(java.io.InputStream r12, int[] r13) throws org.apache.commons.compress.harmony.pack200.Pack200Exception, java.io.IOException {
            r11 = this;
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r1 = "RVA"
            r7 = 0
            r3[r7] = r1
            java.lang.String r1 = "RIA"
            r8 = 1
            r3[r8] = r1
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r1 = r11.attrMap
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r9 = r1.getAttributeLayout(r2, r7)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r1 = r11.attrMap
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r10 = r1.getAttributeLayout(r2, r7)
            long[] r1 = r11.classFlags
            int r1 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r1, r9)
            long[] r2 = r11.classFlags
            int r2 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r2, r10)
            int[] r4 = new int[]{r1, r2}
            int[] r5 = new int[r0]
            r5[r7] = r7
            r5[r8] = r7
            if (r1 <= 0) goto L42
            r1 = r13[r7]
            r5[r7] = r1
            if (r2 <= 0) goto L40
            r13 = r13[r8]
            r5[r8] = r13
            goto L4a
        L40:
            r0 = r8
            goto L4a
        L42:
            if (r2 <= 0) goto L49
            r13 = r13[r7]
            r5[r8] = r13
            goto L40
        L49:
            r0 = r7
        L4a:
            java.lang.String r6 = "class"
            r1 = r11
            r2 = r12
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup[] r12 = r1.parseMetadata(r2, r3, r4, r5, r6)
            r13 = r12[r7]
            java.util.List r13 = r13.getAttributes()
            r12 = r12[r8]
            java.util.List r12 = r12.getAttributes()
            r1 = r7
            r2 = r1
        L60:
            long[] r3 = r11.classFlags
            int r4 = r3.length
            if (r7 >= r4) goto L9a
            r4 = r3[r7]
            boolean r3 = r9.matches(r4)
            if (r3 == 0) goto L7d
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r3 = r11.classAttributes
            r3 = r3[r7]
            int r4 = r1 + 1
            java.lang.Object r1 = r13.get(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r1
            r3.add(r1)
            r1 = r4
        L7d:
            long[] r3 = r11.classFlags
            r4 = r3[r7]
            boolean r3 = r10.matches(r4)
            if (r3 == 0) goto L97
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r3 = r11.classAttributes
            r3 = r3[r7]
            int r4 = r2 + 1
            java.lang.Object r2 = r12.get(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r2
            r3.add(r2)
            r2 = r4
        L97:
            int r7 = r7 + 1
            goto L60
        L9a:
            return r0
    }

    private void parseCodeAttrBands(java.io.InputStream r39, int r40) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r38 = this;
            r6 = r38
            r7 = r39
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r6.segment
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r0.getSegmentHeader()
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r0.getOptions()
            boolean r5 = r0.hasCodeFlagsHi()
            java.lang.String r1 = "code_flags"
            r0 = r38
            r2 = r39
            r3 = r40
            long[] r0 = r0.parseFlags(r1, r2, r3, r4, r5)
            int r1 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countBit16(r0)
            java.lang.String r2 = "code_attr_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r1 = r6.decodeBandInt(r2, r7, r3, r1)
            java.lang.String r2 = "code_attr_indexes"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r1 = r6.decodeBandInt(r2, r7, r3, r1)
            int r2 = r1.length
            r4 = 0
            r5 = 0
        L37:
            r8 = 3
            if (r4 >= r2) goto L53
            r9 = r1[r4]
            int r10 = r9.length
            r11 = 0
        L3e:
            if (r11 >= r10) goto L50
            r12 = r9[r11]
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r13 = r6.attrMap
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r12 = r13.getAttributeLayout(r12, r8)
            int r12 = r12.numBackwardsCallables()
            int r5 = r5 + r12
            int r11 = r11 + 1
            goto L3e
        L50:
            int r4 = r4 + 1
            goto L37
        L53:
            java.lang.String r1 = "code_attr_calls"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r1 = r6.decodeBandInt(r1, r7, r2, r5)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r2 = r6.attrMap
            java.lang.String r4 = "LineNumberTable"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r2 = r2.getAttributeLayout(r4, r8)
            int r4 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r0, r2)
            java.lang.String r5 = "code_LineNumberTable_N"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r4 = r6.decodeBandInt(r5, r7, r9, r4)
            java.lang.String r5 = "code_LineNumberTable_bci_P"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            int[][] r5 = r6.decodeBandInt(r5, r7, r9, r4)
            java.lang.String r9 = "code_LineNumberTable_line"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r9 = r6.decodeBandInt(r9, r7, r10, r4)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r10 = r6.attrMap
            java.lang.String r11 = "LocalVariableTable"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r10 = r10.getAttributeLayout(r11, r8)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r11 = r6.attrMap
            java.lang.String r12 = "LocalVariableTypeTable"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r11 = r11.getAttributeLayout(r12, r8)
            int r12 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r0, r10)
            java.lang.String r13 = "code_LocalVariableTable_N"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r14 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r12 = r6.decodeBandInt(r13, r7, r14, r12)
            java.lang.String r13 = "code_LocalVariableTable_bci_P"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r14 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            int[][] r13 = r6.decodeBandInt(r13, r7, r14, r12)
            java.lang.String r14 = "code_LocalVariableTable_span_O"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r15 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            int[][] r14 = r6.decodeBandInt(r14, r7, r15, r12)
            java.lang.String r15 = "code_LocalVariableTable_name_RU"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r3 = r6.parseCPUTF8References(r15, r7, r3, r12)
            java.lang.String r15 = "code_LocalVariableTable_type_RS"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r8 = r6.parseCPSignatureReferences(r15, r7, r8, r12)
            java.lang.String r15 = "code_LocalVariableTable_slot"
            r17 = r8
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r8 = r6.decodeBandInt(r15, r7, r8, r12)
            int r15 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r0, r11)
            r18 = r11
            java.lang.String r11 = "code_LocalVariableTypeTable_N"
            r19 = r8
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r8 = r6.decodeBandInt(r11, r7, r8, r15)
            java.lang.String r11 = "code_LocalVariableTypeTable_bci_P"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r15 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            int[][] r11 = r6.decodeBandInt(r11, r7, r15, r8)
            java.lang.String r15 = "code_LocalVariableTypeTable_span_O"
            r20 = r11
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            int[][] r11 = r6.decodeBandInt(r15, r7, r11, r8)
            java.lang.String r15 = "code_LocalVariableTypeTable_name_RU"
            r21 = r11
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r11 = r6.parseCPUTF8References(r15, r7, r11, r8)
            java.lang.String r15 = "code_LocalVariableTypeTable_type_RS"
            r22 = r11
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r11 = r6.parseCPSignatureReferences(r15, r7, r11, r8)
            java.lang.String r15 = "code_LocalVariableTypeTable_slot"
            r23 = r11
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r11 = r6.decodeBandInt(r15, r7, r11, r8)
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r15 = r6.options
            boolean r15 = r15.hasCodeFlagsHi()
            if (r15 == 0) goto L110
            r15 = 62
            goto L112
        L110:
            r15 = 31
        L112:
            r24 = r11
            int r11 = r15 + 1
            r25 = r8
            org.apache.commons.compress.harmony.unpack200.AttributeLayout[] r8 = new org.apache.commons.compress.harmony.unpack200.AttributeLayout[r11]
            r26 = r3
            int[] r3 = new int[r11]
            r27 = r14
            java.util.List[] r14 = new java.util.List[r11]
            r28 = r13
            r13 = 0
        L125:
            if (r13 >= r15) goto L149
            r29 = r15
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r15 = r6.attrMap
            r30 = r12
            r12 = 3
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r15 = r15.getAttributeLayout(r13, r12)
            if (r15 == 0) goto L142
            boolean r16 = r15.isDefaultLayout()
            if (r16 != 0) goto L142
            r8[r13] = r15
            int r15 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r0, r15)
            r3[r13] = r15
        L142:
            int r13 = r13 + 1
            r15 = r29
            r12 = r30
            goto L125
        L149:
            r30 = r12
            r12 = 0
            r13 = 0
        L14d:
            if (r12 >= r11) goto L187
            r15 = r3[r12]
            if (r15 <= 0) goto L17a
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r15 = r6.attrMap
            r16 = r11
            r11 = r8[r12]
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands r11 = r15.getAttributeBands(r11)
            r15 = r3[r12]
            java.util.List r15 = r11.parseAttributes(r7, r15)
            r14[r12] = r15
            r15 = r8[r12]
            int r15 = r15.numBackwardsCallables()
            r29 = r3
            if (r15 <= 0) goto L17e
            int[] r3 = new int[r15]
            r7 = 0
            java.lang.System.arraycopy(r1, r13, r3, r7, r15)
            r11.setBackwardsCalls(r3)
            int r13 = r13 + r15
            goto L17e
        L17a:
            r29 = r3
            r16 = r11
        L17e:
            int r12 = r12 + 1
            r7 = r39
            r11 = r16
            r3 = r29
            goto L14d
        L187:
            r16 = r11
            r12 = r40
            r1 = 0
            r3 = 0
            r7 = 0
            r11 = 0
        L18f:
            if (r7 >= r12) goto L23e
            r12 = r0[r7]
            boolean r12 = r2.matches(r12)
            if (r12 == 0) goto L1b0
            org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute r12 = new org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute
            r13 = r4[r1]
            r15 = r5[r1]
            r29 = r2
            r2 = r9[r1]
            r12.<init>(r13, r15, r2)
            int r1 = r1 + 1
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r2 = r6.codeAttributes
            r2 = r2[r7]
            r2.add(r12)
            goto L1b2
        L1b0:
            r29 = r2
        L1b2:
            r12 = r0[r7]
            boolean r2 = r10.matches(r12)
            if (r2 == 0) goto L1d6
            org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute
            r32 = r30[r3]
            r33 = r28[r3]
            r34 = r27[r3]
            r35 = r26[r3]
            r36 = r17[r3]
            r37 = r19[r3]
            r31 = r2
            r31.<init>(r32, r33, r34, r35, r36, r37)
            int r3 = r3 + 1
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r12 = r6.codeAttributes
            r12 = r12[r7]
            r12.add(r2)
        L1d6:
            r12 = r0[r7]
            r2 = r18
            boolean r12 = r2.matches(r12)
            if (r12 == 0) goto L1fc
            org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute r12 = new org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute
            r32 = r25[r11]
            r33 = r20[r11]
            r34 = r21[r11]
            r35 = r22[r11]
            r36 = r23[r11]
            r37 = r24[r11]
            r31 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37)
            int r11 = r11 + 1
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r13 = r6.codeAttributes
            r13 = r13[r7]
            r13.add(r12)
        L1fc:
            r15 = r16
            r12 = 0
        L1ff:
            if (r12 >= r15) goto L22f
            r13 = r8[r12]
            r39 = r1
            r18 = r2
            if (r13 == 0) goto L227
            r1 = r0[r7]
            boolean r1 = r13.matches(r1)
            if (r1 == 0) goto L227
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r1 = r6.codeAttributes
            r1 = r1[r7]
            r2 = r14[r12]
            r13 = 0
            java.lang.Object r2 = r2.get(r13)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r2
            r1.add(r2)
            r1 = r14[r12]
            r1.remove(r13)
            goto L228
        L227:
            r13 = 0
        L228:
            int r12 = r12 + 1
            r1 = r39
            r2 = r18
            goto L1ff
        L22f:
            r39 = r1
            r18 = r2
            r13 = 0
            int r7 = r7 + 1
            r12 = r40
            r16 = r15
            r2 = r29
            goto L18f
        L23e:
            return
    }

    private void parseCodeBands(java.io.InputStream r17) throws org.apache.commons.compress.harmony.pack200.Pack200Exception, java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r2 = r0.attrMap
            java.lang.String r3 = "Code"
            r4 = 2
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r2 = r2.getAttributeLayout(r3, r4)
            long[][] r3 = r0.methodFlags
            int r2 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r3, r2)
            java.lang.String r3 = "code_headers"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            int[] r3 = r0.decodeBandInt(r3, r1, r5, r2)
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r0.segment
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r5 = r5.getSegmentHeader()
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r5 = r5.getOptions()
            boolean r5 = r5.hasAllCodeFlags()
            if (r5 != 0) goto L2f
            boolean[] r6 = new boolean[r2]
            r0.codeHasAttributes = r6
        L2f:
            r6 = 0
            r7 = r6
            r8 = r7
        L32:
            r9 = 1
            if (r7 >= r2) goto L44
            r10 = r3[r7]
            if (r10 != 0) goto L41
            int r8 = r8 + 1
            if (r5 != 0) goto L41
            boolean[] r10 = r0.codeHasAttributes
            r10[r7] = r9
        L41:
            int r7 = r7 + 1
            goto L32
        L44:
            java.lang.String r7 = "code_max_stack"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r7 = r0.decodeBandInt(r7, r1, r10, r8)
            java.lang.String r10 = "code_max_na_locals"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r10 = r0.decodeBandInt(r10, r1, r11, r8)
            java.lang.String r11 = "code_handler_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r12 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r11 = r0.decodeBandInt(r11, r1, r12, r8)
            int[] r12 = new int[r2]
            r0.codeMaxStack = r12
            int[] r12 = new int[r2]
            r0.codeMaxNALocals = r12
            int[] r12 = new int[r2]
            r0.codeHandlerCount = r12
            r12 = r6
            r13 = r12
        L6a:
            if (r12 >= r2) goto Le3
            r14 = r3[r12]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 < 0) goto Ldb
            if (r14 != 0) goto L8b
            int[] r14 = r0.codeMaxStack
            r15 = r7[r13]
            r14[r12] = r15
            int[] r14 = r0.codeMaxNALocals
            r15 = r10[r13]
            r14[r12] = r15
            int[] r14 = r0.codeHandlerCount
            r15 = r11[r13]
            r14[r12] = r15
            int r13 = r13 + 1
            r14 = r4
            goto Lcf
        L8b:
            r4 = 144(0x90, float:2.02E-43)
            if (r14 > r4) goto La3
            int[] r4 = r0.codeMaxStack
            int r14 = r14 + (-1)
            int r15 = r14 % 12
            r4[r12] = r15
            int[] r4 = r0.codeMaxNALocals
            int r14 = r14 / 12
            r4[r12] = r14
            int[] r4 = r0.codeHandlerCount
            r4[r12] = r6
        La1:
            r14 = 2
            goto Lcf
        La3:
            r4 = 208(0xd0, float:2.91E-43)
            if (r14 > r4) goto Lba
            int[] r4 = r0.codeMaxStack
            int r14 = r14 + (-145)
            int r15 = r14 % 8
            r4[r12] = r15
            int[] r4 = r0.codeMaxNALocals
            int r14 = r14 / 8
            r4[r12] = r14
            int[] r4 = r0.codeHandlerCount
            r4[r12] = r9
            goto La1
        Lba:
            if (r14 > r15) goto Ld3
            int[] r4 = r0.codeMaxStack
            int r14 = r14 + (-209)
            int r15 = r14 % 7
            r4[r12] = r15
            int[] r4 = r0.codeMaxNALocals
            int r14 = r14 / 7
            r4[r12] = r14
            int[] r4 = r0.codeHandlerCount
            r14 = 2
            r4[r12] = r14
        Lcf:
            int r12 = r12 + 1
            r4 = r14
            goto L6a
        Ld3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Shouldn't get here either"
            r1.<init>(r2)
            throw r1
        Ldb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Shouldn't get here"
            r1.<init>(r2)
            throw r1
        Le3:
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            int[] r4 = r0.codeHandlerCount
            java.lang.String r6 = "code_handler_start_P"
            int[][] r3 = r0.decodeBandInt(r6, r1, r3, r4)
            r0.codeHandlerStartP = r3
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            int[] r4 = r0.codeHandlerCount
            java.lang.String r6 = "code_handler_end_PO"
            int[][] r3 = r0.decodeBandInt(r6, r1, r3, r4)
            r0.codeHandlerEndPO = r3
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            int[] r4 = r0.codeHandlerCount
            java.lang.String r6 = "code_handler_catch_PO"
            int[][] r3 = r0.decodeBandInt(r6, r1, r3, r4)
            r0.codeHandlerCatchPO = r3
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r4 = r0.codeHandlerCount
            java.lang.String r6 = "code_handler_class_RCN"
            int[][] r3 = r0.decodeBandInt(r6, r1, r3, r4)
            r0.codeHandlerClassRCN = r3
            if (r5 == 0) goto L116
            goto L117
        L116:
            r2 = r8
        L117:
            java.util.List[] r3 = new java.util.List[r2]
            r0.codeAttributes = r3
            org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda0 r4 = new org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda0
            r4.<init>()
            java.util.Arrays.setAll(r3, r4)
            r0.parseCodeAttrBands(r1, r2)
            return
    }

    private void parseFieldAttrBands(java.io.InputStream r20) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r19 = this;
            r6 = r19
            r7 = r20
            int[] r3 = r6.classFieldCount
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r6.options
            boolean r5 = r0.hasFieldFlagsHi()
            java.lang.String r1 = "field_flags"
            r0 = r19
            r2 = r20
            long[][] r0 = r0.parseFlags(r1, r2, r3, r4, r5)
            r6.fieldFlags = r0
            int r0 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countBit16(r0)
            java.lang.String r1 = "field_attr_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r0 = r6.decodeBandInt(r1, r7, r2, r0)
            java.lang.String r1 = "field_attr_indexes"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r0 = r6.decodeBandInt(r1, r7, r2, r0)
            long[][] r1 = r6.fieldFlags
            r2 = 1
            int r0 = r6.getCallCount(r0, r1, r2)
            java.lang.String r1 = "field_attr_calls"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r0 = r6.decodeBandInt(r1, r7, r3, r0)
            int r1 = r6.classCount
            java.util.ArrayList[][] r1 = new java.util.ArrayList[r1][]
            r6.fieldAttributes = r1
            r3 = 0
        L44:
            int r4 = r6.classCount
            if (r3 >= r4) goto L6c
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r4 = r6.fieldAttributes
            long[][] r5 = r6.fieldFlags
            r5 = r5[r3]
            int r5 = r5.length
            java.util.ArrayList[] r5 = new java.util.ArrayList[r5]
            r4[r3] = r5
            r4 = 0
        L54:
            long[][] r5 = r6.fieldFlags
            r5 = r5[r3]
            int r5 = r5.length
            if (r4 >= r5) goto L69
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r5 = r6.fieldAttributes
            r5 = r5[r3]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5[r4] = r8
            int r4 = r4 + 1
            goto L54
        L69:
            int r3 = r3 + 1
            goto L44
        L6c:
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r3 = r6.attrMap
            java.lang.String r4 = "ConstantValue"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r3 = r3.getAttributeLayout(r4, r2)
            long[][] r4 = r6.fieldFlags
            int r4 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r4, r3)
            java.lang.String r5 = "field_ConstantValue_KQ"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r4 = r6.decodeBandInt(r5, r7, r8, r4)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r5 = r6.attrMap
            java.lang.String r8 = "Signature"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r5 = r5.getAttributeLayout(r8, r2)
            long[][] r8 = r6.fieldFlags
            int r8 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r8, r5)
            java.lang.String r9 = "field_Signature_RS"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r8 = r6.decodeBandInt(r9, r7, r10, r8)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r9 = r6.attrMap
            java.lang.String r10 = "Deprecated"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r9 = r9.getAttributeLayout(r10, r2)
            r10 = 0
            r11 = 0
            r12 = 0
        La3:
            int r13 = r6.classCount
            if (r10 >= r13) goto L175
            r13 = 0
        La8:
            long[][] r14 = r6.fieldFlags
            r14 = r14[r10]
            int r15 = r14.length
            if (r13 >= r15) goto L16a
            r1 = r14[r13]
            boolean r14 = r9.matches(r1)
            if (r14 == 0) goto Lc5
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r14 = r6.fieldAttributes
            r14 = r14[r10]
            r14 = r14[r13]
            org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute r15 = new org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute
            r15.<init>()
            r14.add(r15)
        Lc5:
            boolean r14 = r3.matches(r1)
            r15 = 58
            if (r14 == 0) goto L125
            r14 = r4[r11]
            r17 = r8
            long r7 = (long) r14
            java.lang.String[][] r14 = r6.fieldDescr
            r14 = r14[r10]
            r14 = r14[r13]
            int r18 = r14.indexOf(r15)
            r16 = 1
            int r15 = r18 + 1
            r18 = r4
            r4 = 58
            java.lang.String r14 = r14.substring(r15)
            java.lang.String r15 = "B"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L108
            java.lang.String r15 = "S"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L108
            java.lang.String r15 = "C"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L108
            java.lang.String r15 = "Z"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L10a
        L108:
            java.lang.String r14 = "I"
        L10a:
            org.apache.commons.compress.harmony.unpack200.CpBands r15 = r6.cpBands
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r15 = r15.getConstantPool()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r7 = r3.getValue(r7, r14, r15)
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r8 = r6.fieldAttributes
            r8 = r8[r10]
            r8 = r8[r13]
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute r14 = new org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute
            r14.<init>(r7)
            r8.add(r14)
            int r11 = r11 + 1
            goto L12a
        L125:
            r18 = r4
            r17 = r8
            r4 = r15
        L12a:
            boolean r1 = r5.matches(r1)
            if (r1 == 0) goto L15f
            r1 = r17[r12]
            long r1 = (long) r1
            java.lang.String[][] r7 = r6.fieldDescr
            r7 = r7[r10]
            r7 = r7[r13]
            int r4 = r7.indexOf(r4)
            r8 = 1
            int r4 = r4 + r8
            java.lang.String r4 = r7.substring(r4)
            org.apache.commons.compress.harmony.unpack200.CpBands r7 = r6.cpBands
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r7 = r7.getConstantPool()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r1 = r5.getValue(r1, r4, r7)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r1
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r2 = r6.fieldAttributes
            r2 = r2[r10]
            r2 = r2[r13]
            org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute
            r4.<init>(r1)
            r2.add(r4)
            int r12 = r12 + 1
        L15f:
            int r13 = r13 + 1
            r7 = r20
            r8 = r17
            r4 = r18
            r2 = 1
            goto La8
        L16a:
            r18 = r4
            r17 = r8
            int r10 = r10 + 1
            r7 = r20
            r2 = 1
            goto La3
        L175:
            r1 = r7
            int r2 = r6.parseFieldMetadataBands(r1, r0)
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r3 = r6.options
            boolean r3 = r3.hasFieldFlagsHi()
            if (r3 == 0) goto L185
            r3 = 62
            goto L187
        L185:
            r3 = 31
        L187:
            int r4 = r3 + 1
            org.apache.commons.compress.harmony.unpack200.AttributeLayout[] r5 = new org.apache.commons.compress.harmony.unpack200.AttributeLayout[r4]
            int[] r7 = new int[r4]
            java.util.List[] r8 = new java.util.List[r4]
            r9 = 0
        L190:
            if (r9 >= r3) goto L1ae
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r10 = r6.attrMap
            r11 = 1
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r10 = r10.getAttributeLayout(r9, r11)
            if (r10 == 0) goto L1ab
            boolean r12 = r10.isDefaultLayout()
            if (r12 != 0) goto L1ab
            r5[r9] = r10
            long[][] r12 = r6.fieldFlags
            int r10 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r12, r10)
            r7[r9] = r10
        L1ab:
            int r9 = r9 + 1
            goto L190
        L1ae:
            r3 = 0
        L1af:
            if (r3 >= r4) goto L1da
            r9 = r7[r3]
            if (r9 <= 0) goto L1d7
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r9 = r6.attrMap
            r10 = r5[r3]
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands r9 = r9.getAttributeBands(r10)
            r10 = r7[r3]
            java.util.List r10 = r9.parseAttributes(r1, r10)
            r8[r3] = r10
            r10 = r5[r3]
            int r10 = r10.numBackwardsCallables()
            if (r10 <= 0) goto L1d7
            int[] r11 = new int[r10]
            r12 = 0
            java.lang.System.arraycopy(r0, r2, r11, r12, r10)
            r9.setBackwardsCalls(r11)
            int r2 = r2 + r10
        L1d7:
            int r3 = r3 + 1
            goto L1af
        L1da:
            r12 = 0
        L1db:
            int r0 = r6.classCount
            if (r12 >= r0) goto L23b
            r0 = 0
        L1e0:
            long[][] r1 = r6.fieldFlags
            r1 = r1[r12]
            int r2 = r1.length
            if (r0 >= r2) goto L237
            r2 = r1[r0]
            r1 = 0
            r7 = 0
        L1eb:
            if (r1 >= r4) goto L233
            r9 = r5[r1]
            if (r9 == 0) goto L22f
            boolean r9 = r9.matches(r2)
            if (r9 == 0) goto L22f
            r9 = r5[r1]
            int r9 = r9.getIndex()
            r10 = 15
            if (r9 >= r10) goto L217
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r9 = r6.fieldAttributes
            r9 = r9[r12]
            r9 = r9[r0]
            int r10 = r7 + 1
            r11 = r8[r1]
            r13 = 0
            java.lang.Object r11 = r11.get(r13)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r11 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r11
            r9.add(r7, r11)
            r7 = r10
            goto L229
        L217:
            r13 = 0
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r9 = r6.fieldAttributes
            r9 = r9[r12]
            r9 = r9[r0]
            r10 = r8[r1]
            java.lang.Object r10 = r10.get(r13)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r10 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r10
            r9.add(r10)
        L229:
            r9 = r8[r1]
            r9.remove(r13)
            goto L230
        L22f:
            r13 = 0
        L230:
            int r1 = r1 + 1
            goto L1eb
        L233:
            r13 = 0
            int r0 = r0 + 1
            goto L1e0
        L237:
            r13 = 0
            int r12 = r12 + 1
            goto L1db
        L23b:
            return
    }

    private void parseFieldBands(java.io.InputStream r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r3.classFieldCount
            java.lang.String r2 = "field_descr"
            int[][] r0 = r3.decodeBandInt(r2, r4, r0, r1)
            r3.fieldDescrInts = r0
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r3.cpBands
            java.lang.String[] r1 = r1.getCpDescriptor()
            java.lang.String[][] r0 = r3.getReferences(r0, r1)
            r3.fieldDescr = r0
            r3.parseFieldAttrBands(r4)
            return
    }

    private int parseFieldMetadataBands(java.io.InputStream r14, int[] r15) throws org.apache.commons.compress.harmony.pack200.Pack200Exception, java.io.IOException {
            r13 = this;
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r1 = "RVA"
            r7 = 0
            r3[r7] = r1
            java.lang.String r1 = "RIA"
            r8 = 1
            r3[r8] = r1
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r1 = r13.attrMap
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r9 = r1.getAttributeLayout(r2, r8)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r1 = r13.attrMap
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r10 = r1.getAttributeLayout(r2, r8)
            long[][] r1 = r13.fieldFlags
            int r1 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r1, r9)
            long[][] r2 = r13.fieldFlags
            int r2 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r2, r10)
            int[] r4 = new int[]{r1, r2}
            int[] r5 = new int[r0]
            r5[r7] = r7
            r5[r8] = r7
            if (r1 <= 0) goto L42
            r1 = r15[r7]
            r5[r7] = r1
            if (r2 <= 0) goto L40
            r15 = r15[r8]
            r5[r8] = r15
            goto L4a
        L40:
            r0 = r8
            goto L4a
        L42:
            if (r2 <= 0) goto L49
            r15 = r15[r7]
            r5[r8] = r15
            goto L40
        L49:
            r0 = r7
        L4a:
            java.lang.String r6 = "field"
            r1 = r13
            r2 = r14
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup[] r14 = r1.parseMetadata(r2, r3, r4, r5, r6)
            r15 = r14[r7]
            java.util.List r15 = r15.getAttributes()
            r14 = r14[r8]
            java.util.List r14 = r14.getAttributes()
            r1 = r7
            r2 = r1
            r3 = r2
        L61:
            long[][] r4 = r13.fieldFlags
            int r4 = r4.length
            if (r1 >= r4) goto Lac
            r4 = r7
        L67:
            long[][] r5 = r13.fieldFlags
            r5 = r5[r1]
            int r6 = r5.length
            if (r4 >= r6) goto La9
            r11 = r5[r4]
            boolean r5 = r9.matches(r11)
            if (r5 == 0) goto L88
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r5 = r13.fieldAttributes
            r5 = r5[r1]
            r5 = r5[r4]
            int r6 = r2 + 1
            java.lang.Object r2 = r15.get(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r2
            r5.add(r2)
            r2 = r6
        L88:
            long[][] r5 = r13.fieldFlags
            r5 = r5[r1]
            r11 = r5[r4]
            boolean r5 = r10.matches(r11)
            if (r5 == 0) goto La6
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r5 = r13.fieldAttributes
            r5 = r5[r1]
            r5 = r5[r4]
            int r6 = r3 + 1
            java.lang.Object r3 = r14.get(r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r3
            r5.add(r3)
            r3 = r6
        La6:
            int r4 = r4 + 1
            goto L67
        La9:
            int r1 = r1 + 1
            goto L61
        Lac:
            return r0
    }

    private org.apache.commons.compress.harmony.unpack200.MetadataBandGroup[] parseMetadata(java.io.InputStream r23, java.lang.String[] r24, int[] r25, int[] r26, java.lang.String r27) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r22 = this;
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r27
            int r0 = r8.length
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup[] r10 = new org.apache.commons.compress.harmony.unpack200.MetadataBandGroup[r0]
            r12 = 0
        Lc:
            int r0 = r8.length
            if (r12 >= r0) goto L399
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup r0 = new org.apache.commons.compress.harmony.unpack200.MetadataBandGroup
            r1 = r8[r12]
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r6.cpBands
            r0.<init>(r1, r2)
            r10[r12] = r0
            r13 = r8[r12]
            r0 = 80
            int r0 = r13.indexOf(r0)
            java.lang.String r14 = "_"
            if (r0 < 0) goto L4d
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "_param_NB"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            r3 = r25[r12]
            int[] r1 = r6.decodeBandInt(r1, r7, r2, r3)
            r0.param_NB = r1
        L4d:
            java.lang.String r0 = "AD"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L10d
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "_anno_N"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r3 = r25[r12]
            int[] r1 = r6.decodeBandInt(r1, r7, r2, r3)
            r0.anno_N = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "_type_RS"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r3 = r10[r12]
            int[] r3 = r3.anno_N
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r1 = r6.parseCPSignatureReferences(r1, r7, r2, r3)
            r0.type_RS = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "_pair_N"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r3 = r10[r12]
            int[] r3 = r3.anno_N
            int[][] r1 = r6.decodeBandInt(r1, r7, r2, r3)
            r0.pair_N = r1
            r0 = r10[r12]
            int[][] r0 = r0.pair_N
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Ld5:
            if (r2 >= r1) goto Le7
            r4 = r0[r2]
            int r5 = r4.length
            r15 = 0
        Ldb:
            if (r15 >= r5) goto Le4
            r16 = r4[r15]
            int r3 = r3 + r16
            int r15 = r15 + 1
            goto Ldb
        Le4:
            int r2 = r2 + 1
            goto Ld5
        Le7:
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "_name_RU"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r6.parseCPUTF8References(r1, r7, r2, r3)
            r0.name_RU = r1
            goto L10f
        L10d:
            r3 = r25[r12]
        L10f:
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "_T"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            r4 = r26[r12]
            int r3 = r3 + r4
            int[] r1 = r6.decodeBandInt(r1, r7, r2, r3)
            r0.T = r1
            r0 = r10[r12]
            int[] r0 = r0.T
            int r1 = r0.length
            r17 = r13
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r13 = 0
            r15 = 0
        L148:
            if (r2 >= r1) goto L19e
            r18 = r1
            r1 = r0[r2]
            char r1 = (char) r1
            r19 = r0
            r0 = 64
            if (r1 == r0) goto L195
            r0 = 70
            if (r1 == r0) goto L192
            r0 = 83
            if (r1 == r0) goto L18f
            r0 = 99
            if (r1 == r0) goto L18c
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L189
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L186
            r0 = 73
            if (r1 == r0) goto L18f
            r0 = 74
            if (r1 == r0) goto L183
            r0 = 90
            if (r1 == r0) goto L18f
            r0 = 91
            if (r1 == r0) goto L180
            switch(r1) {
                case 66: goto L18f;
                case 67: goto L18f;
                case 68: goto L17d;
                default: goto L17c;
            }
        L17c:
            goto L197
        L17d:
            int r4 = r4 + 1
            goto L197
        L180:
            int r7 = r7 + 1
            goto L197
        L183:
            int r11 = r11 + 1
            goto L197
        L186:
            int r6 = r6 + 1
            goto L197
        L189:
            int r15 = r15 + 1
            goto L197
        L18c:
            int r8 = r8 + 1
            goto L197
        L18f:
            int r3 = r3 + 1
            goto L197
        L192:
            int r5 = r5 + 1
            goto L197
        L195:
            int r13 = r13 + 1
        L197:
            int r2 = r2 + 1
            r1 = r18
            r0 = r19
            goto L148
        L19e:
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            r2 = r17
            java.lang.StringBuilder r1 = r1.append(r2)
            r17 = r6
            java.lang.String r6 = "_caseI_KI"
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r21 = r7
            r20 = r17
            r7 = r22
            r17 = r13
            r13 = r23
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[] r1 = r7.parseCPIntReferences(r1, r13, r6, r3)
            r0.caseI_KI = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = "_caseD_KD"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[] r1 = r7.parseCPDoubleReferences(r1, r13, r3, r4)
            r0.caseD_KD = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = "_caseF_KF"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[] r1 = r7.parseCPFloatReferences(r1, r13, r3, r5)
            r0.caseF_KF = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = "_caseJ_KJ"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[] r1 = r7.parseCPLongReferences(r1, r13, r3, r11)
            r0.caseJ_KJ = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = "_casec_RS"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r7.parseCPSignatureReferences(r1, r13, r3, r8)
            r0.casec_RS = r1
            r6 = r10[r12]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.StringBuilder r0 = r0.append(r14)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "_caseet_RS"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r7.cpBands
            java.lang.String[] r5 = r0.getCpSignature()
            r0 = r22
            r8 = r2
            r2 = r23
            r4 = r15
            java.lang.String[] r0 = r0.parseReferences(r1, r2, r3, r4, r5)
            r6.caseet_RS = r0
            r6 = r10[r12]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.StringBuilder r0 = r0.append(r14)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r1 = "_caseec_RU"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r7.cpBands
            java.lang.String[] r5 = r0.getCpUTF8()
            r0 = r22
            java.lang.String[] r0 = r0.parseReferences(r1, r2, r3, r4, r5)
            r6.caseec_RU = r0
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = "_cases_RU"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r11 = r20
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r7.parseCPUTF8References(r1, r13, r2, r11)
            r0.cases_RU = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = "_casearray_N"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r11 = r21
            int[] r1 = r7.decodeBandInt(r1, r13, r2, r11)
            r0.casearray_N = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = "_nesttype_RS"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r11 = r17
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r7.parseCPUTF8References(r1, r13, r2, r11)
            r0.nesttype_RS = r1
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = "_nestpair_N"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r1 = r7.decodeBandInt(r1, r13, r2, r11)
            r0.nestpair_N = r1
            r0 = r10[r12]
            int[] r0 = r0.nestpair_N
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L364:
            if (r2 >= r1) goto L36c
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L364
        L36c:
            r0 = r10[r12]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = "_nestname_RU"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r7.parseCPUTF8References(r1, r13, r2, r3)
            r0.nestname_RU = r1
            int r12 = r12 + 1
            r8 = r24
            r6 = r7
            r7 = r13
            goto Lc
        L399:
            r7 = r6
            return r10
    }

    private void parseMethodAttrBands(java.io.InputStream r21) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r20 = this;
            r6 = r20
            r7 = r21
            int[] r3 = r6.classMethodCount
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r6.options
            boolean r5 = r0.hasMethodFlagsHi()
            java.lang.String r1 = "method_flags"
            r0 = r20
            r2 = r21
            long[][] r0 = r0.parseFlags(r1, r2, r3, r4, r5)
            r6.methodFlags = r0
            int r0 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countBit16(r0)
            java.lang.String r1 = "method_attr_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r0 = r6.decodeBandInt(r1, r7, r2, r0)
            java.lang.String r1 = "method_attr_indexes"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r0 = r6.decodeBandInt(r1, r7, r2, r0)
            long[][] r1 = r6.methodFlags
            r2 = 2
            int r0 = r6.getCallCount(r0, r1, r2)
            java.lang.String r1 = "method_attr_calls"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r0 = r6.decodeBandInt(r1, r7, r3, r0)
            r6.methodAttrCalls = r0
            int r0 = r6.classCount
            java.util.ArrayList[][] r0 = new java.util.ArrayList[r0][]
            r6.methodAttributes = r0
            r1 = 0
        L46:
            int r3 = r6.classCount
            if (r1 >= r3) goto L6e
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r3 = r6.methodAttributes
            long[][] r4 = r6.methodFlags
            r4 = r4[r1]
            int r4 = r4.length
            java.util.ArrayList[] r4 = new java.util.ArrayList[r4]
            r3[r1] = r4
            r3 = 0
        L56:
            long[][] r4 = r6.methodFlags
            r4 = r4[r1]
            int r4 = r4.length
            if (r3 >= r4) goto L6b
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r4 = r6.methodAttributes
            r4 = r4[r1]
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4[r3] = r5
            int r3 = r3 + 1
            goto L56
        L6b:
            int r1 = r1 + 1
            goto L46
        L6e:
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r1 = r6.attrMap
            java.lang.String r3 = "Exceptions"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = r1.getAttributeLayout(r3, r2)
            long[][] r3 = r6.methodFlags
            int r3 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r3, r1)
            java.lang.String r4 = "method_Exceptions_n"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r3 = r6.decodeBandInt(r4, r7, r5, r3)
            java.lang.String r4 = "method_Exceptions_RC"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[][] r4 = r6.decodeBandInt(r4, r7, r5, r3)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r5 = r6.attrMap
            java.lang.String r8 = "Signature"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r5 = r5.getAttributeLayout(r8, r2)
            long[][] r8 = r6.methodFlags
            int r8 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r8, r5)
            java.lang.String r9 = "method_signature_RS"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r8 = r6.decodeBandInt(r9, r7, r10, r8)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r9 = r6.attrMap
            java.lang.String r10 = "Deprecated"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r9 = r9.getAttributeLayout(r10, r2)
            r10 = 0
            r11 = 0
            r12 = 0
        Lad:
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r13 = r6.methodAttributes
            int r13 = r13.length
            if (r10 >= r13) goto L172
            r13 = 0
        Lb3:
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r14 = r6.methodAttributes
            r14 = r14[r10]
            int r14 = r14.length
            if (r13 >= r14) goto L167
            long[][] r14 = r6.methodFlags
            r14 = r14[r10]
            r16 = r3
            r2 = r14[r13]
            boolean r14 = r1.matches(r2)
            if (r14 == 0) goto Lfb
            r14 = r16[r11]
            r17 = r4[r11]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r15 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[r14]
            r0 = 0
        Lcf:
            if (r0 >= r14) goto Le6
            r18 = r1
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r6.cpBands
            r19 = r4
            r4 = r17[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r1.cpClassValue(r4)
            r15[r0] = r1
            int r0 = r0 + 1
            r1 = r18
            r4 = r19
            goto Lcf
        Le6:
            r18 = r1
            r19 = r4
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r0 = r6.methodAttributes
            r0 = r0[r10]
            r0 = r0[r13]
            org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute
            r1.<init>(r15)
            r0.add(r1)
            int r11 = r11 + 1
            goto Lff
        Lfb:
            r18 = r1
            r19 = r4
        Lff:
            boolean r0 = r5.matches(r2)
            if (r0 == 0) goto L148
            r0 = r8[r12]
            long r0 = (long) r0
            java.lang.String[][] r4 = r6.methodDescr
            r4 = r4[r10]
            r4 = r4[r13]
            r14 = 58
            int r14 = r4.indexOf(r14)
            int r14 = r14 + 1
            java.lang.String r4 = r4.substring(r14)
            java.lang.String r14 = "B"
            boolean r14 = r4.equals(r14)
            if (r14 != 0) goto L12a
            java.lang.String r14 = "H"
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L12c
        L12a:
            java.lang.String r4 = "I"
        L12c:
            org.apache.commons.compress.harmony.unpack200.CpBands r14 = r6.cpBands
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r14 = r14.getConstantPool()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r0 = r5.getValue(r0, r4, r14)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r0
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r1 = r6.methodAttributes
            r1 = r1[r10]
            r1 = r1[r13]
            org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute
            r4.<init>(r0)
            r1.add(r4)
            int r12 = r12 + 1
        L148:
            boolean r0 = r9.matches(r2)
            if (r0 == 0) goto L15c
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r0 = r6.methodAttributes
            r0 = r0[r10]
            r0 = r0[r13]
            org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute
            r1.<init>()
            r0.add(r1)
        L15c:
            int r13 = r13 + 1
            r3 = r16
            r1 = r18
            r4 = r19
            r2 = 2
            goto Lb3
        L167:
            r18 = r1
            r16 = r3
            r19 = r4
            int r10 = r10 + 1
            r2 = 2
            goto Lad
        L172:
            int[] r0 = r6.methodAttrCalls
            int r0 = r6.parseMethodMetadataBands(r7, r0)
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r1 = r6.options
            boolean r1 = r1.hasMethodFlagsHi()
            if (r1 == 0) goto L183
            r1 = 62
            goto L185
        L183:
            r1 = 31
        L185:
            int r2 = r1 + 1
            org.apache.commons.compress.harmony.unpack200.AttributeLayout[] r3 = new org.apache.commons.compress.harmony.unpack200.AttributeLayout[r2]
            int[] r4 = new int[r2]
            r5 = 0
        L18c:
            if (r5 >= r1) goto L1aa
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r8 = r6.attrMap
            r9 = 2
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r8 = r8.getAttributeLayout(r5, r9)
            if (r8 == 0) goto L1a7
            boolean r10 = r8.isDefaultLayout()
            if (r10 != 0) goto L1a7
            r3[r5] = r8
            long[][] r10 = r6.methodFlags
            int r8 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r10, r8)
            r4[r5] = r8
        L1a7:
            int r5 = r5 + 1
            goto L18c
        L1aa:
            java.util.List[] r1 = new java.util.List[r2]
            r5 = 0
        L1ad:
            if (r5 >= r2) goto L1da
            r8 = r4[r5]
            if (r8 <= 0) goto L1d7
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r8 = r6.attrMap
            r9 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands r8 = r8.getAttributeBands(r9)
            r9 = r4[r5]
            java.util.List r9 = r8.parseAttributes(r7, r9)
            r1[r5] = r9
            r9 = r3[r5]
            int r9 = r9.numBackwardsCallables()
            if (r9 <= 0) goto L1d7
            int[] r10 = new int[r9]
            int[] r11 = r6.methodAttrCalls
            r12 = 0
            java.lang.System.arraycopy(r11, r0, r10, r12, r9)
            r8.setBackwardsCalls(r10)
            int r0 = r0 + r9
        L1d7:
            int r5 = r5 + 1
            goto L1ad
        L1da:
            r12 = 0
        L1db:
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r0 = r6.methodAttributes
            int r0 = r0.length
            if (r12 >= r0) goto L240
            r0 = 0
        L1e1:
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r4 = r6.methodAttributes
            r4 = r4[r12]
            int r4 = r4.length
            if (r0 >= r4) goto L23c
            long[][] r4 = r6.methodFlags
            r4 = r4[r12]
            r7 = r4[r0]
            r4 = 0
            r5 = 0
        L1f0:
            if (r4 >= r2) goto L238
            r9 = r3[r4]
            if (r9 == 0) goto L234
            boolean r9 = r9.matches(r7)
            if (r9 == 0) goto L234
            r9 = r3[r4]
            int r9 = r9.getIndex()
            r10 = 15
            if (r9 >= r10) goto L21c
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r9 = r6.methodAttributes
            r9 = r9[r12]
            r9 = r9[r0]
            int r10 = r5 + 1
            r11 = r1[r4]
            r13 = 0
            java.lang.Object r11 = r11.get(r13)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r11 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r11
            r9.add(r5, r11)
            r5 = r10
            goto L22e
        L21c:
            r13 = 0
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r9 = r6.methodAttributes
            r9 = r9[r12]
            r9 = r9[r0]
            r10 = r1[r4]
            java.lang.Object r10 = r10.get(r13)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r10 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r10
            r9.add(r10)
        L22e:
            r9 = r1[r4]
            r9.remove(r13)
            goto L235
        L234:
            r13 = 0
        L235:
            int r4 = r4 + 1
            goto L1f0
        L238:
            r13 = 0
            int r0 = r0 + 1
            goto L1e1
        L23c:
            r13 = 0
            int r12 = r12 + 1
            goto L1db
        L240:
            return
    }

    private void parseMethodBands(java.io.InputStream r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.MDELTA5
            int[] r1 = r3.classMethodCount
            java.lang.String r2 = "method_descr"
            int[][] r0 = r3.decodeBandInt(r2, r4, r0, r1)
            r3.methodDescrInts = r0
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r3.cpBands
            java.lang.String[] r1 = r1.getCpDescriptor()
            java.lang.String[][] r0 = r3.getReferences(r0, r1)
            r3.methodDescr = r0
            r3.parseMethodAttrBands(r4)
            return
    }

    private int parseMethodMetadataBands(java.io.InputStream r16, int[] r17) throws org.apache.commons.compress.harmony.pack200.Pack200Exception, java.io.IOException {
            r15 = this;
            r6 = r15
            r7 = 5
            java.lang.String[] r2 = new java.lang.String[r7]
            java.lang.String r0 = "RVA"
            r8 = 0
            r2[r8] = r0
            java.lang.String r0 = "RIA"
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "RVPA"
            r3 = 2
            r2[r3] = r0
            java.lang.String r0 = "RIPA"
            r4 = 3
            r2[r4] = r0
            java.lang.String r0 = "AD"
            r5 = 4
            r2[r5] = r0
            int[] r9 = new int[]{r8, r8, r8, r8, r8}
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r0 = r6.attrMap
            java.lang.String r10 = "RuntimeVisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r0 = r0.getAttributeLayout(r10, r3)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r10 = r6.attrMap
            java.lang.String r11 = "RuntimeInvisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r10 = r10.getAttributeLayout(r11, r3)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r11 = r6.attrMap
            java.lang.String r12 = "RuntimeVisibleParameterAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r11 = r11.getAttributeLayout(r12, r3)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r12 = r6.attrMap
            java.lang.String r13 = "RuntimeInvisibleParameterAnnotations"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r12 = r12.getAttributeLayout(r13, r3)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r13 = r6.attrMap
            java.lang.String r14 = "AnnotationDefault"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r13 = r13.getAttributeLayout(r14, r3)
            org.apache.commons.compress.harmony.unpack200.AttributeLayout[] r14 = new org.apache.commons.compress.harmony.unpack200.AttributeLayout[r7]
            r14[r8] = r0
            r14[r1] = r10
            r14[r3] = r11
            r14[r4] = r12
            r14[r5] = r13
            org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda3 r0 = new org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda3
            r0.<init>(r15, r14)
            java.util.Arrays.setAll(r9, r0)
            int[] r4 = new int[r7]
            r0 = r8
            r1 = r0
            r10 = r1
        L62:
            if (r0 >= r7) goto L76
            r3 = r9[r0]
            if (r3 <= 0) goto L71
            int r10 = r10 + 1
            r3 = r17[r1]
            r4[r0] = r3
            int r1 = r1 + 1
            goto L73
        L71:
            r4[r0] = r8
        L73:
            int r0 = r0 + 1
            goto L62
        L76:
            java.lang.String r5 = "method"
            r0 = r15
            r1 = r16
            r3 = r9
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup[] r0 = r0.parseMetadata(r1, r2, r3, r4, r5)
            java.util.List[] r1 = new java.util.List[r7]
            int[] r2 = new int[r7]
            r3 = r8
        L85:
            int r4 = r0.length
            if (r3 >= r4) goto L95
            r4 = r0[r3]
            java.util.List r4 = r4.getAttributes()
            r1[r3] = r4
            r2[r3] = r8
            int r3 = r3 + 1
            goto L85
        L95:
            r0 = r8
        L96:
            long[][] r3 = r6.methodFlags
            int r3 = r3.length
            if (r0 >= r3) goto Ld4
            r3 = r8
        L9c:
            long[][] r4 = r6.methodFlags
            r4 = r4[r0]
            int r4 = r4.length
            if (r3 >= r4) goto Ld1
            r4 = r8
        La4:
            if (r4 >= r7) goto Lce
            r5 = r14[r4]
            long[][] r9 = r6.methodFlags
            r9 = r9[r0]
            r11 = r9[r3]
            boolean r5 = r5.matches(r11)
            if (r5 == 0) goto Lcb
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r5 = r6.methodAttributes
            r5 = r5[r0]
            r5 = r5[r3]
            r9 = r1[r4]
            r11 = r2[r4]
            int r12 = r11 + 1
            r2[r4] = r12
            java.lang.Object r9 = r9.get(r11)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r9 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r9
            r5.add(r9)
        Lcb:
            int r4 = r4 + 1
            goto La4
        Lce:
            int r3 = r3 + 1
            goto L9c
        Ld1:
            int r0 = r0 + 1
            goto L96
        Ld4:
            return r10
    }

    public java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] getClassAttributes() {
            r1 = this;
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r0 = r1.classAttributes
            return r0
    }

    public int[] getClassFieldCount() {
            r1 = this;
            int[] r0 = r1.classFieldCount
            return r0
    }

    public long[] getClassFlags() {
            r7 = this;
            long[] r0 = r7.classAccessFlags
            if (r0 != 0) goto L38
            r0 = 0
            r1 = 32767(0x7fff, double:1.6189E-319)
            r3 = r0
        L8:
            r4 = 16
            if (r3 >= r4) goto L22
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r4 = r7.attrMap
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r4 = r4.getAttributeLayout(r3, r0)
            if (r4 == 0) goto L1f
            boolean r4 = r4.isDefaultLayout()
            if (r4 != 0) goto L1f
            r4 = 1
            int r4 = r4 << r3
            int r4 = ~r4
            long r4 = (long) r4
            long r1 = r1 & r4
        L1f:
            int r3 = r3 + 1
            goto L8
        L22:
            long[] r3 = r7.classFlags
            int r3 = r3.length
            long[] r3 = new long[r3]
            r7.classAccessFlags = r3
        L29:
            long[] r3 = r7.classFlags
            int r4 = r3.length
            if (r0 >= r4) goto L38
            long[] r4 = r7.classAccessFlags
            r5 = r3[r0]
            long r5 = r5 & r1
            r4[r0] = r5
            int r0 = r0 + 1
            goto L29
        L38:
            long[] r0 = r7.classAccessFlags
            return r0
    }

    public int[][] getClassInterfacesInts() {
            r1 = this;
            int[][] r0 = r1.classInterfacesInts
            return r0
    }

    public int[] getClassMethodCount() {
            r1 = this;
            int[] r0 = r1.classMethodCount
            return r0
    }

    public int[] getClassSuperInts() {
            r1 = this;
            int[] r0 = r1.classSuperInts
            return r0
    }

    public int[] getClassThisInts() {
            r1 = this;
            int[] r0 = r1.classThisInts
            return r0
    }

    public int[] getClassVersionMajor() {
            r1 = this;
            int[] r0 = r1.classVersionMajor
            return r0
    }

    public int[] getClassVersionMinor() {
            r1 = this;
            int[] r0 = r1.classVersionMinor
            return r0
    }

    public int[][] getCodeHandlerCatchPO() {
            r1 = this;
            int[][] r0 = r1.codeHandlerCatchPO
            return r0
    }

    public int[][] getCodeHandlerClassRCN() {
            r1 = this;
            int[][] r0 = r1.codeHandlerClassRCN
            return r0
    }

    public int[] getCodeHandlerCount() {
            r1 = this;
            int[] r0 = r1.codeHandlerCount
            return r0
    }

    public int[][] getCodeHandlerEndPO() {
            r1 = this;
            int[][] r0 = r1.codeHandlerEndPO
            return r0
    }

    public int[][] getCodeHandlerStartP() {
            r1 = this;
            int[][] r0 = r1.codeHandlerStartP
            return r0
    }

    public boolean[] getCodeHasAttributes() {
            r1 = this;
            boolean[] r0 = r1.codeHasAttributes
            return r0
    }

    public int[] getCodeMaxNALocals() {
            r1 = this;
            int[] r0 = r1.codeMaxNALocals
            return r0
    }

    public int[] getCodeMaxStack() {
            r1 = this;
            int[] r0 = r1.codeMaxStack
            return r0
    }

    public java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] getFieldAttributes() {
            r1 = this;
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r0 = r1.fieldAttributes
            return r0
    }

    public int[][] getFieldDescrInts() {
            r1 = this;
            int[][] r0 = r1.fieldDescrInts
            return r0
    }

    public long[][] getFieldFlags() {
            r9 = this;
            long[][] r0 = r9.fieldAccessFlags
            if (r0 != 0) goto L50
            r0 = 0
            r1 = 32767(0x7fff, double:1.6189E-319)
            r3 = r0
        L8:
            r4 = 16
            if (r3 >= r4) goto L23
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r4 = r9.attrMap
            r5 = 1
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r4 = r4.getAttributeLayout(r3, r5)
            if (r4 == 0) goto L20
            boolean r4 = r4.isDefaultLayout()
            if (r4 != 0) goto L20
            int r4 = r5 << r3
            int r4 = ~r4
            long r4 = (long) r4
            long r1 = r1 & r4
        L20:
            int r3 = r3 + 1
            goto L8
        L23:
            long[][] r3 = r9.fieldFlags
            int r3 = r3.length
            long[][] r3 = new long[r3][]
            r9.fieldAccessFlags = r3
            r3 = r0
        L2b:
            long[][] r4 = r9.fieldFlags
            int r5 = r4.length
            if (r3 >= r5) goto L50
            long[][] r5 = r9.fieldAccessFlags
            r4 = r4[r3]
            int r4 = r4.length
            long[] r4 = new long[r4]
            r5[r3] = r4
            r4 = r0
        L3a:
            long[][] r5 = r9.fieldFlags
            r5 = r5[r3]
            int r6 = r5.length
            if (r4 >= r6) goto L4d
            long[][] r6 = r9.fieldAccessFlags
            r6 = r6[r3]
            r7 = r5[r4]
            long r7 = r7 & r1
            r6[r4] = r7
            int r4 = r4 + 1
            goto L3a
        L4d:
            int r3 = r3 + 1
            goto L2b
        L50:
            long[][] r0 = r9.fieldAccessFlags
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.IcTuple[][] getIcLocal() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.IcTuple[][] r0 = r1.icLocal
            return r0
    }

    public java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] getMethodAttributes() {
            r1 = this;
            java.util.ArrayList<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[][] r0 = r1.methodAttributes
            return r0
    }

    public java.lang.String[][] getMethodDescr() {
            r1 = this;
            java.lang.String[][] r0 = r1.methodDescr
            return r0
    }

    public int[][] getMethodDescrInts() {
            r1 = this;
            int[][] r0 = r1.methodDescrInts
            return r0
    }

    public long[][] getMethodFlags() {
            r9 = this;
            long[][] r0 = r9.methodAccessFlags
            if (r0 != 0) goto L50
            r0 = 0
            r1 = 32767(0x7fff, double:1.6189E-319)
            r3 = r0
        L8:
            r4 = 16
            if (r3 >= r4) goto L23
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r4 = r9.attrMap
            r5 = 2
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r4 = r4.getAttributeLayout(r3, r5)
            if (r4 == 0) goto L20
            boolean r4 = r4.isDefaultLayout()
            if (r4 != 0) goto L20
            r4 = 1
            int r4 = r4 << r3
            int r4 = ~r4
            long r4 = (long) r4
            long r1 = r1 & r4
        L20:
            int r3 = r3 + 1
            goto L8
        L23:
            long[][] r3 = r9.methodFlags
            int r3 = r3.length
            long[][] r3 = new long[r3][]
            r9.methodAccessFlags = r3
            r3 = r0
        L2b:
            long[][] r4 = r9.methodFlags
            int r5 = r4.length
            if (r3 >= r5) goto L50
            long[][] r5 = r9.methodAccessFlags
            r4 = r4[r3]
            int r4 = r4.length
            long[] r4 = new long[r4]
            r5[r3] = r4
            r4 = r0
        L3a:
            long[][] r5 = r9.methodFlags
            r5 = r5[r3]
            int r6 = r5.length
            if (r4 >= r6) goto L4d
            long[][] r6 = r9.methodAccessFlags
            r6 = r6[r3]
            r7 = r5[r4]
            long r7 = r7 & r1
            r6[r4] = r7
            int r4 = r4 + 1
            goto L3a
        L4d:
            int r3 = r3 + 1
            goto L2b
        L50:
            long[][] r0 = r9.methodAccessFlags
            return r0
    }

    public java.util.ArrayList<java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>> getOrderedCodeAttributes() {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute>[] r0 = r2.codeAttributes
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda1 r1 = new org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda1
            r1.<init>()
            java.util.stream.Stream r0 = r0.map(r1)
            org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda2
            r1.<init>()
            java.util.stream.Collector r1 = java.util.stream.Collectors.toCollection(r1)
            java.lang.Object r0 = r0.collect(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            return r0
    }

    public long[] getRawClassFlags() {
            r1 = this;
            long[] r0 = r1.classFlags
            return r0
    }

    /* JADX INFO: renamed from: lambda$parseMethodMetadataBands$2$org-apache-commons-compress-harmony-unpack200-ClassBands, reason: not valid java name */
    /* synthetic */ int m2563xf85b1228(org.apache.commons.compress.harmony.unpack200.AttributeLayout[] r2, int r3) {
            r1 = this;
            long[][] r0 = r1.methodFlags
            r2 = r2[r3]
            int r2 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countMatches(r0, r2)
            return r2
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(java.io.InputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r4.header
            int r0 = r0.getClassCount()
            java.lang.String r1 = "class_this"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.classThisInts = r1
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r4.cpBands
            java.lang.String[] r2 = r2.getCpClass()
            java.lang.String[] r1 = r4.getReferences(r1, r2)
            r4.classThis = r1
            java.lang.String r1 = "class_super"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.classSuperInts = r1
            java.lang.String r1 = "class_interface_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r4.decodeBandInt(r1, r5, r2, r0)
            java.lang.String r2 = "class_interface"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[][] r1 = r4.decodeBandInt(r2, r5, r3, r1)
            r4.classInterfacesInts = r1
            java.lang.String r1 = "class_field_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.classFieldCount = r1
            java.lang.String r1 = "class_method_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r0 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.classMethodCount = r0
            r4.parseFieldBands(r5)
            r4.parseMethodBands(r5)
            r4.parseClassAttrBands(r5)
            r4.parseCodeBands(r5)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() {
            r0 = this;
            return
    }
}
