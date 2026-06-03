package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class Segment {
    public static final int LOG_LEVEL_QUIET = 0;
    public static final int LOG_LEVEL_STANDARD = 1;
    public static final int LOG_LEVEL_VERBOSE = 2;
    private org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands attrDefinitionBands;
    private org.apache.commons.compress.harmony.unpack200.BcBands bcBands;
    private org.apache.commons.compress.harmony.unpack200.ClassBands classBands;
    private byte[][] classFilesContents;
    private org.apache.commons.compress.harmony.unpack200.CpBands cpBands;
    private boolean deflateHint;
    private boolean doPreRead;
    private org.apache.commons.compress.harmony.unpack200.FileBands fileBands;
    private boolean[] fileDeflate;
    private boolean[] fileIsClass;
    private org.apache.commons.compress.harmony.unpack200.SegmentHeader header;
    private org.apache.commons.compress.harmony.unpack200.IcBands icBands;
    private java.io.InputStream internalBuffer;
    private int logLevel;
    private java.io.PrintWriter logStream;
    private boolean overrideDeflateHint;

    public Segment() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile buildClassFile(int r25) {
            r24 = this;
            r0 = r24
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile
            r1.<init>()
            org.apache.commons.compress.harmony.unpack200.ClassBands r2 = r0.classBands
            int[] r2 = r2.getClassVersionMajor()
            org.apache.commons.compress.harmony.unpack200.ClassBands r3 = r0.classBands
            int[] r3 = r3.getClassVersionMinor()
            if (r2 == 0) goto L1e
            r2 = r2[r25]
            r1.major = r2
            r2 = r3[r25]
            r1.minor = r2
            goto L2e
        L1e:
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r2 = r0.header
            int r2 = r2.getDefaultClassMajorVersion()
            r1.major = r2
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r2 = r0.header
            int r2 = r2.getDefaultClassMinorVersion()
            r1.minor = r2
        L2e:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2 = r1.pool
            org.apache.commons.compress.harmony.unpack200.ClassBands r3 = r0.classBands
            int[] r3 = r3.getClassThisInts()
            r3 = r3[r25]
            org.apache.commons.compress.harmony.unpack200.CpBands r4 = r0.cpBands
            java.lang.String[] r4 = r4.getCpClass()
            r4 = r4[r3]
            java.lang.String r5 = "/"
            int r5 = r4.lastIndexOf(r5)
            r6 = 1
            int r5 = r5 + r6
            org.apache.commons.compress.harmony.unpack200.ClassBands r7 = r0.classBands
            java.util.ArrayList[] r7 = r7.getClassAttributes()
            r7 = r7[r25]
            java.util.Iterator r8 = r7.iterator()
            r10 = 0
        L55:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L6b
            java.lang.Object r11 = r8.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r11 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r11
            boolean r12 = r11.isSourceFileAttribute()
            if (r12 == 0) goto L55
            r10 = r11
            org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute r10 = (org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute) r10
            goto L55
        L6b:
            r8 = -1
            r11 = 0
            if (r10 != 0) goto Leb
            org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands r10 = r0.attrDefinitionBands
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r10 = r10.getAttributeDefinitionMap()
            java.lang.String r12 = "SourceFile"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r10 = r10.getAttributeLayout(r12, r11)
            org.apache.commons.compress.harmony.unpack200.ClassBands r12 = r0.classBands
            long[] r12 = r12.getRawClassFlags()
            r13 = r12[r25]
            boolean r10 = r10.matches(r13)
            if (r10 == 0) goto Le6
            r12 = r8
            r10 = r11
        L8b:
            int r13 = r4.length()
            if (r10 >= r13) goto L9d
            char r13 = r4.charAt(r10)
            r14 = 36
            if (r13 > r14) goto L9a
            r12 = r10
        L9a:
            int r10 = r10 + 1
            goto L8b
        L9d:
            java.lang.String r10 = ".java"
            if (r12 <= r8) goto Lb9
            if (r5 > r12) goto Lb9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r5 = r4.substring(r5, r12)
            java.lang.StringBuilder r5 = r13.append(r5)
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r5 = r5.toString()
            goto Lce
        Lb9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r5 = r4.substring(r5)
            java.lang.StringBuilder r5 = r12.append(r5)
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r5 = r5.toString()
        Lce:
            org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute r10 = new org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute
            org.apache.commons.compress.harmony.unpack200.CpBands r12 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r5 = r12.cpUTF8Value(r5, r11)
            r10.<init>(r5)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[r6]
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r10 = r2.add(r10)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r10 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r10
            r5[r11] = r10
            r1.attributes = r5
            goto Lf7
        Le6:
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[r11]
            r1.attributes = r5
            goto Lf7
        Leb:
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[r6]
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r10 = r2.add(r10)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r10 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r10
            r5[r11] = r10
            r1.attributes = r5
        Lf7:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = r7.size()
            r5.<init>(r10)
            r10 = r11
        L101:
            int r12 = r7.size()
            if (r10 >= r12) goto L119
            java.lang.Object r12 = r7.get(r10)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r12 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r12
            boolean r13 = r12.isSourceFileAttribute()
            if (r13 != 0) goto L116
            r5.add(r12)
        L116:
            int r10 = r10 + 1
            goto L101
        L119:
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r7 = r1.attributes
            int r10 = r7.length
            int r12 = r5.size()
            int r10 = r10 + r12
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r10 = new org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[r10]
            r1.attributes = r10
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r10 = r1.attributes
            int r12 = r7.length
            java.lang.System.arraycopy(r7, r11, r10, r11, r12)
            r10 = r11
        L12c:
            int r12 = r5.size()
            if (r10 >= r12) goto L144
            java.lang.Object r12 = r5.get(r10)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r12 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r12
            r2.add(r12)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r13 = r1.attributes
            int r14 = r7.length
            int r14 = r14 + r10
            r13[r14] = r12
            int r10 = r10 + 1
            goto L12c
        L144:
            org.apache.commons.compress.harmony.unpack200.CpBands r5 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3 = r5.cpClassValue(r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = r2.add(r3)
            org.apache.commons.compress.harmony.unpack200.CpBands r5 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.ClassBands r7 = r0.classBands
            int[] r7 = r7.getClassSuperInts()
            r7 = r7[r25]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r5 = r5.cpClassValue(r7)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r5 = r2.add(r5)
            org.apache.commons.compress.harmony.unpack200.ClassBands r7 = r0.classBands
            int[][] r7 = r7.getClassInterfacesInts()
            r7 = r7[r25]
            int r7 = r7.length
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r10 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r7]
            r12 = r11
        L16c:
            if (r12 >= r7) goto L187
            org.apache.commons.compress.harmony.unpack200.CpBands r13 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.ClassBands r14 = r0.classBands
            int[][] r14 = r14.getClassInterfacesInts()
            r14 = r14[r25]
            r14 = r14[r12]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r13 = r13.cpClassValue(r14)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r13 = r2.add(r13)
            r10[r12] = r13
            int r12 = r12 + 1
            goto L16c
        L187:
            org.apache.commons.compress.harmony.unpack200.ClassBands r12 = r0.classBands
            int[] r12 = r12.getClassFieldCount()
            r12 = r12[r25]
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r13 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r12]
            r14 = r11
        L192:
            if (r14 >= r12) goto L1df
            org.apache.commons.compress.harmony.unpack200.ClassBands r15 = r0.classBands
            int[][] r15 = r15.getFieldDescrInts()
            r15 = r15[r25]
            r15 = r15[r14]
            org.apache.commons.compress.harmony.unpack200.CpBands r6 = r0.cpBands
            int[] r6 = r6.getCpDescriptorNameInts()
            r6 = r6[r15]
            org.apache.commons.compress.harmony.unpack200.CpBands r9 = r0.cpBands
            int[] r9 = r9.getCpDescriptorTypeInts()
            r9 = r9[r15]
            org.apache.commons.compress.harmony.unpack200.CpBands r15 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r17 = r15.cpUTF8Value(r6)
            org.apache.commons.compress.harmony.unpack200.CpBands r6 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r18 = r6.cpSignatureValue(r9)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPField r6 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPField
            org.apache.commons.compress.harmony.unpack200.ClassBands r9 = r0.classBands
            long[][] r9 = r9.getFieldFlags()
            r9 = r9[r25]
            r19 = r9[r14]
            org.apache.commons.compress.harmony.unpack200.ClassBands r9 = r0.classBands
            java.util.ArrayList[][] r9 = r9.getFieldAttributes()
            r9 = r9[r25]
            r21 = r9[r14]
            r16 = r6
            r16.<init>(r17, r18, r19, r21)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r6 = r2.add(r6)
            r13[r14] = r6
            int r14 = r14 + 1
            r6 = 1
            goto L192
        L1df:
            org.apache.commons.compress.harmony.unpack200.ClassBands r6 = r0.classBands
            int[] r6 = r6.getClassMethodCount()
            r6 = r6[r25]
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r9 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r6]
            r12 = r11
        L1ea:
            if (r12 >= r6) goto L237
            org.apache.commons.compress.harmony.unpack200.ClassBands r14 = r0.classBands
            int[][] r14 = r14.getMethodDescrInts()
            r14 = r14[r25]
            r14 = r14[r12]
            org.apache.commons.compress.harmony.unpack200.CpBands r15 = r0.cpBands
            int[] r15 = r15.getCpDescriptorNameInts()
            r15 = r15[r14]
            org.apache.commons.compress.harmony.unpack200.CpBands r11 = r0.cpBands
            int[] r11 = r11.getCpDescriptorTypeInts()
            r11 = r11[r14]
            org.apache.commons.compress.harmony.unpack200.CpBands r14 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r18 = r14.cpUTF8Value(r15)
            org.apache.commons.compress.harmony.unpack200.CpBands r14 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r19 = r14.cpSignatureValue(r11)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod r11 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod
            org.apache.commons.compress.harmony.unpack200.ClassBands r14 = r0.classBands
            long[][] r14 = r14.getMethodFlags()
            r14 = r14[r25]
            r20 = r14[r12]
            org.apache.commons.compress.harmony.unpack200.ClassBands r14 = r0.classBands
            java.util.ArrayList[][] r14 = r14.getMethodAttributes()
            r14 = r14[r25]
            r22 = r14[r12]
            r17 = r11
            r17.<init>(r18, r19, r20, r22)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r11 = r2.add(r11)
            r9[r12] = r11
            int r12 = r12 + 1
            r11 = 0
            goto L1ea
        L237:
            r2.addNestedEntries()
            org.apache.commons.compress.harmony.unpack200.ClassBands r6 = r24.getClassBands()
            org.apache.commons.compress.harmony.unpack200.IcTuple[][] r6 = r6.getIcLocal()
            r6 = r6[r25]
            if (r6 == 0) goto L248
            r11 = 1
            goto L249
        L248:
            r11 = 0
        L249:
            org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute r12 = new org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute
            java.lang.String r14 = "InnerClasses"
            r12.<init>(r14)
            org.apache.commons.compress.harmony.unpack200.IcBands r14 = r24.getIcBands()
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r4 = r14.getRelevantIcTuples(r4, r2)
            java.util.List r14 = r0.computeIcStored(r6, r4)
            java.util.Iterator r14 = r14.iterator()
            r15 = 0
        L261:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L2e1
            java.lang.Object r15 = r14.next()
            org.apache.commons.compress.harmony.unpack200.IcTuple r15 = (org.apache.commons.compress.harmony.unpack200.IcTuple) r15
            int r8 = r15.thisClassIndex()
            r18 = r14
            int r14 = r15.outerClassIndex()
            r19 = r9
            int r9 = r15.simpleClassNameIndex()
            r20 = r13
            java.lang.String r13 = r15.thisClassString()
            r21 = r10
            java.lang.String r10 = r15.outerClassString()
            r22 = r7
            java.lang.String r7 = r15.simpleClassName()
            r23 = r5
            r5 = -1
            if (r8 == r5) goto L29b
            org.apache.commons.compress.harmony.unpack200.CpBands r13 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r8 = r13.cpClassValue(r8)
            goto L2a1
        L29b:
            org.apache.commons.compress.harmony.unpack200.CpBands r8 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r8 = r8.cpClassValue(r13)
        L2a1:
            boolean r13 = r15.isAnonymous()
            if (r13 != 0) goto L2b7
            if (r9 == r5) goto L2b0
            org.apache.commons.compress.harmony.unpack200.CpBands r7 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r7 = r7.cpUTF8Value(r9)
            goto L2b8
        L2b0:
            org.apache.commons.compress.harmony.unpack200.CpBands r9 = r0.cpBands
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r7 = r9.cpUTF8Value(r7)
            goto L2b8
        L2b7:
            r7 = 0
        L2b8:
            boolean r9 = r15.isMember()
            if (r9 == 0) goto L2cc
            org.apache.commons.compress.harmony.unpack200.CpBands r9 = r0.cpBands
            if (r14 == r5) goto L2c7
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r9 = r9.cpClassValue(r14)
            goto L2cd
        L2c7:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r9 = r9.cpClassValue(r10)
            goto L2cd
        L2cc:
            r9 = 0
        L2cd:
            int r10 = r15.F
            r12.addInnerClassesEntry(r8, r9, r7, r10)
            r8 = r5
            r14 = r18
            r9 = r19
            r13 = r20
            r10 = r21
            r7 = r22
            r5 = r23
            r15 = 1
            goto L261
        L2e1:
            r23 = r5
            r22 = r7
            r19 = r9
            r21 = r10
            r20 = r13
            if (r11 == 0) goto L2f1
            int r5 = r6.length
            if (r5 != 0) goto L2f1
            r15 = 0
        L2f1:
            if (r11 != 0) goto L2f7
            int r4 = r4.length
            if (r4 != 0) goto L2f7
            r15 = 0
        L2f7:
            if (r15 == 0) goto L30d
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r4 = r1.attributes
            int r5 = r4.length
            int r6 = r5 + 1
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[] r6 = new org.apache.commons.compress.harmony.unpack200.bytecode.Attribute[r6]
            int r7 = r4.length
            r8 = 0
            java.lang.System.arraycopy(r4, r8, r6, r8, r7)
            r6[r5] = r12
            r1.attributes = r6
            r2.addWithNestedEntries(r12)
            goto L30e
        L30d:
            r8 = 0
        L30e:
            r2.resolve(r0)
            org.apache.commons.compress.harmony.unpack200.ClassBands r4 = r0.classBands
            long[] r4 = r4.getClassFlags()
            r5 = r4[r25]
            int r4 = (int) r5
            r1.accessFlags = r4
            int r3 = r2.indexOf(r3)
            r1.thisClass = r3
            r3 = r23
            int r3 = r2.indexOf(r3)
            r1.superClass = r3
            r3 = r22
            int[] r4 = new int[r3]
            r1.interfaces = r4
            r11 = r8
        L331:
            if (r11 >= r3) goto L340
            int[] r4 = r1.interfaces
            r5 = r21[r11]
            int r5 = r2.indexOf(r5)
            r4[r11] = r5
            int r11 = r11 + 1
            goto L331
        L340:
            r4 = r20
            r1.fields = r4
            r2 = r19
            r1.methods = r2
            return r1
    }

    private java.util.List<org.apache.commons.compress.harmony.unpack200.IcTuple> computeIcStored(org.apache.commons.compress.harmony.unpack200.IcTuple[] r9, org.apache.commons.compress.harmony.unpack200.IcTuple[] r10) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.length
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r10.length
            r1.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            int r3 = r10.length
            r2.<init>(r3)
            r3 = 0
            if (r9 == 0) goto L27
            int r4 = r9.length
            r5 = r3
        L17:
            if (r5 >= r4) goto L27
            r6 = r9[r5]
            boolean r7 = r2.add(r6)
            if (r7 == 0) goto L24
            r0.add(r6)
        L24:
            int r5 = r5 + 1
            goto L17
        L27:
            int r9 = r10.length
        L28:
            if (r3 >= r9) goto L3c
            r4 = r10[r3]
            boolean r5 = r2.add(r4)
            if (r5 == 0) goto L36
            r0.add(r4)
            goto L39
        L36:
            r1.add(r4)
        L39:
            int r3 = r3 + 1
            goto L28
        L3c:
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.compress.harmony.unpack200.Segment$$ExternalSyntheticLambda0 r9 = new org.apache.commons.compress.harmony.unpack200.Segment$$ExternalSyntheticLambda0
            r9.<init>(r0)
            r1.forEach(r9)
            return r0
    }

    private void parseSegment() throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r14 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r14.header
            r0.unpack()
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r14.cpBands
            r0.unpack()
            org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands r0 = r14.attrDefinitionBands
            r0.unpack()
            org.apache.commons.compress.harmony.unpack200.IcBands r0 = r14.icBands
            r0.unpack()
            org.apache.commons.compress.harmony.unpack200.ClassBands r0 = r14.classBands
            r0.unpack()
            org.apache.commons.compress.harmony.unpack200.BcBands r0 = r14.bcBands
            r0.unpack()
            org.apache.commons.compress.harmony.unpack200.FileBands r0 = r14.fileBands
            r0.unpack()
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r14.header
            int r0 = r0.getNumberOfFiles()
            org.apache.commons.compress.harmony.unpack200.FileBands r1 = r14.fileBands
            java.lang.String[] r1 = r1.getFileName()
            org.apache.commons.compress.harmony.unpack200.FileBands r2 = r14.fileBands
            int[] r2 = r2.getFileOptions()
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r3 = r14.header
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r3 = r3.getOptions()
            byte[][] r4 = new byte[r0][]
            r14.classFilesContents = r4
            boolean[] r4 = new boolean[r0]
            r14.fileDeflate = r4
            boolean[] r4 = new boolean[r0]
            r14.fileIsClass = r4
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.io.DataOutputStream r5 = new java.io.DataOutputStream
            r5.<init>(r4)
            r6 = 0
            r7 = r6
            r8 = r7
        L54:
            if (r7 >= r0) goto Ld7
            r9 = r1[r7]
            r10 = 1
            if (r9 == 0) goto L64
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L62
            goto L64
        L62:
            r9 = r6
            goto L65
        L64:
            r9 = r10
        L65:
            r11 = r2[r7]
            r12 = 2
            r11 = r11 & r12
            if (r11 == r12) goto L70
            if (r9 == 0) goto L6e
            goto L70
        L6e:
            r11 = r6
            goto L71
        L70:
            r11 = r10
        L71:
            if (r11 == 0) goto L9a
            if (r9 == 0) goto L9a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            org.apache.commons.compress.harmony.unpack200.CpBands r12 = r14.cpBands
            java.lang.String[] r12 = r12.getCpClass()
            org.apache.commons.compress.harmony.unpack200.ClassBands r13 = r14.classBands
            int[] r13 = r13.getClassThisInts()
            r13 = r13[r8]
            r12 = r12[r13]
            java.lang.StringBuilder r9 = r9.append(r12)
            java.lang.String r12 = ".class"
            java.lang.StringBuilder r9 = r9.append(r12)
            java.lang.String r9 = r9.toString()
            r1[r7] = r9
        L9a:
            boolean r9 = r14.overrideDeflateHint
            if (r9 != 0) goto Lb0
            boolean[] r9 = r14.fileDeflate
            r12 = r2[r7]
            r12 = r12 & r10
            if (r12 == r10) goto Lad
            boolean r12 = r3.shouldDeflate()
            if (r12 == 0) goto Lac
            goto Lad
        Lac:
            r10 = r6
        Lad:
            r9[r7] = r10
            goto Lb6
        Lb0:
            boolean[] r9 = r14.fileDeflate
            boolean r10 = r14.deflateHint
            r9[r7] = r10
        Lb6:
            boolean[] r9 = r14.fileIsClass
            r9[r7] = r11
            if (r11 == 0) goto Ld3
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile r9 = r14.buildClassFile(r8)
            r9.write(r5)
            r5.flush()
            byte[][] r9 = r14.classFilesContents
            byte[] r10 = r4.toByteArray()
            r9[r8] = r10
            r4.reset()
            int r8 = r8 + 1
        Ld3:
            int r7 = r7 + 1
            goto L54
        Ld7:
            return
    }

    private void readSegment(java.io.InputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            r0 = 2
            java.lang.String r1 = "-------"
            r2.log(r0, r1)
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = new org.apache.commons.compress.harmony.unpack200.CpBands
            r0.<init>(r2)
            r2.cpBands = r0
            r0.read(r3)
            org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands r0 = new org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands
            r0.<init>(r2)
            r2.attrDefinitionBands = r0
            r0.read(r3)
            org.apache.commons.compress.harmony.unpack200.IcBands r0 = new org.apache.commons.compress.harmony.unpack200.IcBands
            r0.<init>(r2)
            r2.icBands = r0
            r0.read(r3)
            org.apache.commons.compress.harmony.unpack200.ClassBands r0 = new org.apache.commons.compress.harmony.unpack200.ClassBands
            r0.<init>(r2)
            r2.classBands = r0
            r0.read(r3)
            org.apache.commons.compress.harmony.unpack200.BcBands r0 = new org.apache.commons.compress.harmony.unpack200.BcBands
            r0.<init>(r2)
            r2.bcBands = r0
            r0.read(r3)
            org.apache.commons.compress.harmony.unpack200.FileBands r0 = new org.apache.commons.compress.harmony.unpack200.FileBands
            r0.<init>(r2)
            r2.fileBands = r0
            r0.read(r3)
            org.apache.commons.compress.harmony.unpack200.FileBands r3 = r2.fileBands
            r3.processFileBits()
            return
    }

    protected org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands getAttrDefinitionBands() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands r0 = r1.attrDefinitionBands
            return r0
    }

    protected org.apache.commons.compress.harmony.unpack200.ClassBands getClassBands() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.ClassBands r0 = r1.classBands
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.SegmentConstantPool getConstantPool() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r1.cpBands
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r0 = r0.getConstantPool()
            return r0
    }

    protected org.apache.commons.compress.harmony.unpack200.CpBands getCpBands() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r1.cpBands
            return r0
    }

    protected org.apache.commons.compress.harmony.unpack200.IcBands getIcBands() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.IcBands r0 = r1.icBands
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.SegmentHeader getSegmentHeader() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r1.header
            return r0
    }

    public void log(int r2, java.lang.String r3) {
            r1 = this;
            int r0 = r1.logLevel
            if (r0 < r2) goto L9
            java.io.PrintWriter r2 = r1.logStream
            r2.println(r3)
        L9:
            return
    }

    public void overrideDeflateHint(boolean r2) {
            r1 = this;
            r0 = 1
            r1.overrideDeflateHint = r0
            r1.deflateHint = r2
            return
    }

    public void setLogLevel(int r1) {
            r0 = this;
            r0.logLevel = r1
            return
    }

    public void setLogStream(java.io.OutputStream r4) {
            r3 = this;
            java.io.PrintWriter r0 = new java.io.PrintWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            r1.<init>(r4, r2)
            r4 = 0
            r0.<init>(r1, r4)
            r3.logStream = r0
            return
    }

    public void setPreRead(boolean r1) {
            r0 = this;
            r0.doPreRead = r1
            return
    }

    public void unpack(java.io.InputStream r1, java.util.jar.JarOutputStream r2) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            r0.unpackRead(r1)
            r0.unpackProcess()
            r0.unpackWrite(r2)
            return
    }

    void unpackProcess() throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            java.io.InputStream r0 = r1.internalBuffer
            if (r0 == 0) goto L7
            r1.readSegment(r0)
        L7:
            r1.parseSegment()
            return
    }

    void unpackRead(java.io.InputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            org.apache.commons.io.input.BoundedInputStream r6 = org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter.newBoundedInputStream(r6)
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = new org.apache.commons.compress.harmony.unpack200.SegmentHeader
            r0.<init>(r5)
            r5.header = r0
            r0.read(r6)
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r5.header
            long r0 = r0.getArchiveSize()
            int r0 = (int) r0
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r1 = r5.header
            int r1 = r1.getArchiveSizeOffset()
            int r0 = r0 - r1
            boolean r1 = r5.doPreRead
            if (r1 == 0) goto L3e
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r1 = r5.header
            long r1 = r1.getArchiveSize()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L3e
            byte[] r0 = new byte[r0]
            r6.read(r0)
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            r6.<init>(r1)
            r5.internalBuffer = r6
            goto L41
        L3e:
            r5.readSegment(r6)
        L41:
            return
    }

    void unpackWrite(java.util.jar.JarOutputStream r1) throws java.io.IOException {
            r0 = this;
            r0.writeJar(r1)
            java.io.PrintWriter r1 = r0.logStream
            if (r1 == 0) goto La
            r1.close()
        La:
            return
    }

    public void writeJar(java.util.jar.JarOutputStream r20) throws java.io.IOException {
            r19 = this;
            r0 = r19
            r1 = r20
            org.apache.commons.compress.harmony.unpack200.FileBands r2 = r0.fileBands
            java.lang.String[] r2 = r2.getFileName()
            org.apache.commons.compress.harmony.unpack200.FileBands r3 = r0.fileBands
            int[] r3 = r3.getFileModtime()
            org.apache.commons.compress.harmony.unpack200.FileBands r4 = r0.fileBands
            long[] r4 = r4.getFileSize()
            org.apache.commons.compress.harmony.unpack200.FileBands r5 = r0.fileBands
            byte[][] r5 = r5.getFileBits()
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r6 = r0.header
            int r6 = r6.getNumberOfFiles()
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r7 = r0.header
            long r7 = r7.getArchiveModtime()
            r10 = 0
            r11 = 0
        L2a:
            if (r10 >= r6) goto Lbe
            r12 = r2[r10]
            r13 = r3[r10]
            long r13 = (long) r13
            long r13 = r13 + r7
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            boolean[] r15 = r0.fileDeflate
            boolean r15 = r15[r10]
            java.util.jar.JarEntry r9 = new java.util.jar.JarEntry
            r9.<init>(r12)
            if (r15 == 0) goto L4a
            r12 = 8
            r9.setMethod(r12)
            r17 = r2
            r18 = r3
            goto L83
        L4a:
            r12 = 0
            r9.setMethod(r12)
            java.util.zip.CRC32 r15 = new java.util.zip.CRC32
            r15.<init>()
            boolean[] r12 = r0.fileIsClass
            boolean r12 = r12[r10]
            if (r12 == 0) goto L6e
            byte[][] r12 = r0.classFilesContents
            r12 = r12[r11]
            r15.update(r12)
            byte[][] r12 = r0.classFilesContents
            r12 = r12[r11]
            int r12 = r12.length
            r17 = r2
            r18 = r3
            long r2 = (long) r12
            r9.setSize(r2)
            goto L7c
        L6e:
            r17 = r2
            r18 = r3
            r2 = r5[r10]
            r15.update(r2)
            r2 = r4[r10]
            r9.setSize(r2)
        L7c:
            long r2 = r15.getValue()
            r9.setCrc(r2)
        L83:
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            int r2 = r2.getRawOffset()
            long r2 = (long) r2
            long r13 = r13 - r2
            r9.setTime(r13)
            r1.putNextEntry(r9)
            boolean[] r2 = r0.fileIsClass
            boolean r2 = r2[r10]
            if (r2 == 0) goto Lac
            byte[][] r2 = r0.classFilesContents
            r2 = r2[r11]
            int r2 = r2.length
            long r2 = (long) r2
            r9.setSize(r2)
            byte[][] r2 = r0.classFilesContents
            r2 = r2[r11]
            r1.write(r2)
            int r11 = r11 + 1
            goto Lb6
        Lac:
            r2 = r4[r10]
            r9.setSize(r2)
            r2 = r5[r10]
            r1.write(r2)
        Lb6:
            int r10 = r10 + 1
            r2 = r17
            r3 = r18
            goto L2a
        Lbe:
            return
    }
}
