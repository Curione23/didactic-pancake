package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class CpBands extends org.apache.commons.compress.harmony.unpack200.BandSet {
    private static final java.lang.String EMPTY_STRING = "";
    private int classOffset;
    private java.lang.String[] cpClass;
    private int[] cpClassInts;
    private java.lang.String[] cpDescriptor;
    private int[] cpDescriptorNameInts;
    private int[] cpDescriptorTypeInts;
    private double[] cpDouble;
    private java.lang.String[] cpFieldClass;
    private int[] cpFieldClassInts;
    private java.lang.String[] cpFieldDescriptor;
    private int[] cpFieldDescriptorInts;
    private float[] cpFloat;
    private java.lang.String[] cpIMethodClass;
    private int[] cpIMethodClassInts;
    private java.lang.String[] cpIMethodDescriptor;
    private int[] cpIMethodDescriptorInts;
    private int[] cpInt;
    private long[] cpLong;
    private java.lang.String[] cpMethodClass;
    private int[] cpMethodClassInts;
    private java.lang.String[] cpMethodDescriptor;
    private int[] cpMethodDescriptorInts;
    private java.lang.String[] cpSignature;
    private int[] cpSignatureInts;
    private java.lang.String[] cpString;
    private int[] cpStringInts;
    private java.lang.String[] cpUTF8;
    private int descrOffset;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType> descriptorsToCPNameAndTypes;
    private int doubleOffset;
    private final java.util.Map<java.lang.Double, org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble> doublesToCPDoubles;
    private int fieldOffset;
    private int floatOffset;
    private final java.util.Map<java.lang.Float, org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat> floatsToCPFloats;
    private int imethodOffset;
    private int intOffset;
    private final java.util.Map<java.lang.Integer, org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger> integersToCPIntegers;
    private int longOffset;
    private final java.util.Map<java.lang.Long, org.apache.commons.compress.harmony.unpack200.bytecode.CPLong> longsToCPLongs;
    private java.util.Map<java.lang.String, java.lang.Integer> mapClass;
    private java.util.Map<java.lang.String, java.lang.Integer> mapDescriptor;
    private java.util.Map<java.lang.String, java.lang.Integer> mapSignature;
    private java.util.Map<java.lang.String, java.lang.Integer> mapUTF8;
    private int methodOffset;
    private final org.apache.commons.compress.harmony.unpack200.SegmentConstantPool pool;
    private int signatureOffset;
    private int stringOffset;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPClass> stringsToCPClass;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPString> stringsToCPStrings;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> stringsToCPUTF8;

    public CpBands(org.apache.commons.compress.harmony.unpack200.Segment r1) {
            r0 = this;
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r1 = new org.apache.commons.compress.harmony.unpack200.SegmentConstantPool
            r1.<init>(r0)
            r0.pool = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.stringsToCPUTF8 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.stringsToCPStrings = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.longsToCPLongs = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.integersToCPIntegers = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.floatsToCPFloats = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.stringsToCPClass = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.doublesToCPDoubles = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.descriptorsToCPNameAndTypes = r1
            return
    }

    static /* synthetic */ double lambda$parseCpDouble$1(long[] r2, int r3) {
            r0 = r2[r3]
            double r2 = java.lang.Double.longBitsToDouble(r0)
            return r2
    }

    private void parseCpClass(java.io.InputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r4.header
            int r0 = r0.getCpClassCount()
            java.lang.String r1 = "cp_Class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r5 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.cpClassInts = r5
            java.lang.String[] r5 = new java.lang.String[r0]
            r4.cpClass = r5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r0)
            r4.mapClass = r5
            r5 = 0
        L1c:
            if (r5 >= r0) goto L36
            java.lang.String[] r1 = r4.cpClass
            java.lang.String[] r2 = r4.cpUTF8
            int[] r3 = r4.cpClassInts
            r3 = r3[r5]
            r2 = r2[r3]
            r1[r5] = r2
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r4.mapClass
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1.put(r2, r3)
            int r5 = r5 + 1
            goto L1c
        L36:
            return
    }

    private void parseCpDescriptor(java.io.InputStream r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r6.header
            int r0 = r0.getCpDescriptorCount()
            java.lang.String r1 = "cp_Descr_name"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r6.decodeBandInt(r1, r7, r2, r0)
            r6.cpDescriptorNameInts = r1
            java.lang.String r1 = "cp_Descr_type"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r7 = r6.decodeBandInt(r1, r7, r2, r0)
            r6.cpDescriptorTypeInts = r7
            int[] r7 = r6.cpDescriptorNameInts
            java.lang.String[] r1 = r6.cpUTF8
            java.lang.String[] r7 = r6.getReferences(r7, r1)
            int[] r1 = r6.cpDescriptorTypeInts
            java.lang.String[] r2 = r6.cpSignature
            java.lang.String[] r1 = r6.getReferences(r1, r2)
            java.lang.String[] r2 = new java.lang.String[r0]
            r6.cpDescriptor = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            r6.mapDescriptor = r2
            r2 = 0
        L36:
            if (r2 >= r0) goto L67
            java.lang.String[] r3 = r6.cpDescriptor
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r7[r2]
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r1[r2]
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3[r2] = r4
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r6.mapDescriptor
            java.lang.String[] r4 = r6.cpDescriptor
            r4 = r4[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3.put(r4, r5)
            int r2 = r2 + 1
            goto L36
        L67:
            return
    }

    private void parseCpDouble(java.io.InputStream r8) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r7.header
            int r4 = r0.getCpDoubleCount()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r2 = "cp_Double"
            r1 = r7
            r3 = r8
            long[] r8 = r1.parseFlags(r2, r3, r4, r5, r6)
            int r0 = r8.length
            double[] r0 = new double[r0]
            r7.cpDouble = r0
            org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda2
            r1.<init>(r8)
            java.util.Arrays.setAll(r0, r1)
            return
    }

    private void parseCpField(java.io.InputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r4.header
            int r0 = r0.getCpFieldCount()
            java.lang.String r1 = "cp_Field_class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.cpFieldClassInts = r1
            java.lang.String r1 = "cp_Field_desc"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r5 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.cpFieldDescriptorInts = r5
            java.lang.String[] r5 = new java.lang.String[r0]
            r4.cpFieldClass = r5
            java.lang.String[] r5 = new java.lang.String[r0]
            r4.cpFieldDescriptor = r5
            r5 = 0
        L23:
            if (r5 >= r0) goto L40
            java.lang.String[] r1 = r4.cpFieldClass
            java.lang.String[] r2 = r4.cpClass
            int[] r3 = r4.cpFieldClassInts
            r3 = r3[r5]
            r2 = r2[r3]
            r1[r5] = r2
            java.lang.String[] r1 = r4.cpFieldDescriptor
            java.lang.String[] r2 = r4.cpDescriptor
            int[] r3 = r4.cpFieldDescriptorInts
            r3 = r3[r5]
            r2 = r2[r3]
            r1[r5] = r2
            int r5 = r5 + 1
            goto L23
        L40:
            return
    }

    private void parseCpFloat(java.io.InputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r4.header
            int r0 = r0.getCpFloatCount()
            java.lang.String r1 = "cp_Float"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r5 = r4.decodeBandInt(r1, r5, r2, r0)
            float[] r1 = new float[r0]
            r4.cpFloat = r1
            r1 = 0
        L13:
            if (r1 >= r0) goto L22
            float[] r2 = r4.cpFloat
            r3 = r5[r1]
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L13
        L22:
            return
    }

    private void parseCpIMethod(java.io.InputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r4.header
            int r0 = r0.getCpIMethodCount()
            java.lang.String r1 = "cp_Imethod_class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.cpIMethodClassInts = r1
            java.lang.String r1 = "cp_Imethod_desc"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r5 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.cpIMethodDescriptorInts = r5
            java.lang.String[] r5 = new java.lang.String[r0]
            r4.cpIMethodClass = r5
            java.lang.String[] r5 = new java.lang.String[r0]
            r4.cpIMethodDescriptor = r5
            r5 = 0
        L23:
            if (r5 >= r0) goto L40
            java.lang.String[] r1 = r4.cpIMethodClass
            java.lang.String[] r2 = r4.cpClass
            int[] r3 = r4.cpIMethodClassInts
            r3 = r3[r5]
            r2 = r2[r3]
            r1[r5] = r2
            java.lang.String[] r1 = r4.cpIMethodDescriptor
            java.lang.String[] r2 = r4.cpDescriptor
            int[] r3 = r4.cpIMethodDescriptorInts
            r3 = r3[r5]
            r2 = r2[r3]
            r1[r5] = r2
            int r5 = r5 + 1
            goto L23
        L40:
            return
    }

    private void parseCpInt(java.io.InputStream r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r3.header
            int r0 = r0.getCpIntCount()
            java.lang.String r1 = "cpInt"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r4 = r3.decodeBandInt(r1, r4, r2, r0)
            r3.cpInt = r4
            return
    }

    private void parseCpLong(java.io.InputStream r8) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r7.header
            int r4 = r0.getCpLongCount()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r2 = "cp_Long"
            r1 = r7
            r3 = r8
            long[] r8 = r1.parseFlags(r2, r3, r4, r5, r6)
            r7.cpLong = r8
            return
    }

    private void parseCpMethod(java.io.InputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r4.header
            int r0 = r0.getCpMethodCount()
            java.lang.String r1 = "cp_Method_class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.cpMethodClassInts = r1
            java.lang.String r1 = "cp_Method_desc"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r5 = r4.decodeBandInt(r1, r5, r2, r0)
            r4.cpMethodDescriptorInts = r5
            java.lang.String[] r5 = new java.lang.String[r0]
            r4.cpMethodClass = r5
            java.lang.String[] r5 = new java.lang.String[r0]
            r4.cpMethodDescriptor = r5
            r5 = 0
        L23:
            if (r5 >= r0) goto L40
            java.lang.String[] r1 = r4.cpMethodClass
            java.lang.String[] r2 = r4.cpClass
            int[] r3 = r4.cpMethodClassInts
            r3 = r3[r5]
            r2 = r2[r3]
            r1[r5] = r2
            java.lang.String[] r1 = r4.cpMethodDescriptor
            java.lang.String[] r2 = r4.cpDescriptor
            int[] r3 = r4.cpMethodDescriptorInts
            r3 = r3[r5]
            r2 = r2[r3]
            r1[r5] = r2
            int r5 = r5 + 1
            goto L23
        L40:
            return
    }

    private void parseCpSignature(java.io.InputStream r12) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r11 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r11.header
            int r0 = r0.getCpSignatureCount()
            java.lang.String r1 = "cp_Signature_form"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r11.decodeBandInt(r1, r12, r2, r0)
            r11.cpSignatureInts = r1
            java.lang.String[] r2 = r11.cpUTF8
            java.lang.String[] r1 = r11.getReferences(r1, r2)
            java.lang.String[] r2 = new java.lang.String[r0]
            r11.cpSignature = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r11.mapSignature = r2
            r2 = 0
            r3 = r2
            r8 = r3
        L24:
            r10 = 76
            if (r3 >= r0) goto L43
            r4 = r1[r3]
            char[] r4 = r4.toCharArray()
            int r5 = r4.length
            r6 = r2
        L30:
            if (r6 >= r5) goto L40
            char r7 = r4[r6]
            if (r7 != r10) goto L3d
            int[] r7 = r11.cpSignatureInts
            r9 = -1
            r7[r3] = r9
            int r8 = r8 + 1
        L3d:
            int r6 = r6 + 1
            goto L30
        L40:
            int r3 = r3 + 1
            goto L24
        L43:
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            java.lang.String[] r9 = r11.cpClass
            java.lang.String r5 = "cp_Signature_classes"
            r4 = r11
            r6 = r12
            java.lang.String[] r12 = r4.parseReferences(r5, r6, r7, r8, r9)
            r3 = r2
            r4 = r3
        L51:
            if (r3 >= r0) goto L8e
            r5 = r1[r3]
            int r6 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 64
            r7.<init>(r8)
            r8 = r2
        L61:
            if (r8 >= r6) goto L76
            char r9 = r5.charAt(r8)
            r7.append(r9)
            if (r9 != r10) goto L73
            r9 = r12[r4]
            r7.append(r9)
            int r4 = r4 + 1
        L73:
            int r8 = r8 + 1
            goto L61
        L76:
            java.lang.String[] r5 = r11.cpSignature
            java.lang.String r6 = r7.toString()
            r5[r3] = r6
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r11.mapSignature
            java.lang.String r6 = r7.toString()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.put(r6, r7)
            int r3 = r3 + 1
            goto L51
        L8e:
            return
    }

    private void parseCpString(java.io.InputStream r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r3.header
            int r0 = r0.getCpStringCount()
            java.lang.String r1 = "cp_String"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r4 = r3.decodeBandInt(r1, r4, r2, r0)
            r3.cpStringInts = r4
            java.lang.String[] r4 = new java.lang.String[r0]
            r3.cpString = r4
            org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda1
            r0.<init>(r3)
            java.util.Arrays.setAll(r4, r0)
            return
    }

    private void parseCpUtf8(java.io.InputStream r15) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r14 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r14.header
            int r0 = r0.getCpUTF8Count()
            if (r0 <= 0) goto L124
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int r2 = r0 + (-2)
            java.lang.String r3 = "cpUTF8Prefix"
            int[] r1 = r14.decodeBandInt(r3, r15, r1, r2)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r3 = r0 + (-1)
            java.lang.String r4 = "cpUTF8Suffix"
            int[] r2 = r14.decodeBandInt(r4, r15, r2, r3)
            int r3 = r2.length
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L21:
            if (r5 >= r3) goto L2e
            r8 = r2[r5]
            if (r8 != 0) goto L2a
            int r7 = r7 + 1
            goto L2b
        L2a:
            int r6 = r6 + r8
        L2b:
            int r5 = r5 + 1
            goto L21
        L2e:
            java.lang.String r3 = "cp_Utf8_chars"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.CHAR3
            int[] r3 = r14.decodeBandInt(r3, r15, r5, r6)
            char[] r5 = new char[r6]
            r8 = r4
        L39:
            if (r8 >= r6) goto L43
            r9 = r3[r8]
            char r9 = (char) r9
            r5[r8] = r9
            int r8 = r8 + 1
            goto L39
        L43:
            java.lang.String r3 = "cp_Utf8_big_suffix"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r3 = r14.decodeBandInt(r3, r15, r6, r7)
            int[][] r6 = new int[r7][]
            r8 = r4
        L4e:
            if (r8 >= r7) goto L6c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "cp_Utf8_big_chars "
            r9.<init>(r10)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r9 = r9.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            r11 = r3[r8]
            int[] r9 = r14.decodeBandInt(r9, r15, r10, r11)
            r6[r8] = r9
            int r8 = r8 + 1
            goto L4e
        L6c:
            char[][] r15 = new char[r7][]
            r3 = r4
        L6f:
            if (r3 >= r7) goto L8b
            r8 = r6[r3]
            int r8 = r8.length
            char[] r8 = new char[r8]
            r15[r3] = r8
            r8 = r4
        L79:
            r9 = r6[r3]
            int r10 = r9.length
            if (r8 >= r10) goto L88
            r10 = r15[r3]
            r9 = r9[r8]
            char r9 = (char) r9
            r10[r8] = r9
            int r8 = r8 + 1
            goto L79
        L88:
            int r3 = r3 + 1
            goto L6f
        L8b:
            java.util.HashMap r3 = new java.util.HashMap
            int r6 = r0 + 1
            r3.<init>(r6)
            r14.mapUTF8 = r3
            java.lang.String[] r6 = new java.lang.String[r0]
            r14.cpUTF8 = r6
            java.lang.String r7 = ""
            r6[r4] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r3.put(r7, r6)
            r3 = 1
            r6 = r3
            r7 = r4
            r8 = r7
        La7:
            if (r6 >= r0) goto L123
            java.lang.String[] r9 = r14.cpUTF8
            int r10 = r6 + (-1)
            r11 = r9[r10]
            r12 = r2[r10]
            if (r12 != 0) goto Lea
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            if (r6 <= r3) goto Lbf
            int r12 = r6 + (-2)
            r12 = r1[r12]
            goto Lc0
        Lbf:
            r12 = r4
        Lc0:
            java.lang.String r11 = r11.substring(r4, r12)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = new java.lang.String
            int r12 = r8 + 1
            r8 = r15[r8]
            r11.<init>(r8)
            java.lang.StringBuilder r8 = r10.append(r11)
            java.lang.String r8 = r8.toString()
            r9[r6] = r8
            java.util.Map<java.lang.String, java.lang.Integer> r8 = r14.mapUTF8
            java.lang.String[] r9 = r14.cpUTF8
            r9 = r9[r6]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r8.put(r9, r10)
            r8 = r12
            goto L120
        Lea:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            if (r6 <= r3) goto Lf6
            int r13 = r6 + (-2)
            r13 = r1[r13]
            goto Lf7
        Lf6:
            r13 = r4
        Lf7:
            java.lang.String r11 = r11.substring(r4, r13)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r12 = new java.lang.String
            r13 = r2[r10]
            r12.<init>(r5, r7, r13)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r9[r6] = r11
            r9 = r2[r10]
            int r7 = r7 + r9
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r14.mapUTF8
            java.lang.String[] r10 = r14.cpUTF8
            r10 = r10[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r9.put(r10, r11)
        L120:
            int r6 = r6 + 1
            goto La7
        L123:
            return
        L124:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "cpUTF8Count value must be greater than 0"
            r15.<init>(r0)
            throw r15
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPClass cpClassValue(int r5) {
            r4 = this;
            java.lang.String[] r0 = r4.cpClass
            r0 = r0[r5]
            int[] r1 = r4.cpClassInts
            r1 = r1[r5]
            int r2 = r4.classOffset
            int r2 = r2 + r5
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPClass> r5 = r4.stringsToCPClass
            org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda0 r3 = new org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda0
            r3.<init>(r4, r1, r2)
            java.lang.Object r5 = r5.computeIfAbsent(r0, r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r5
            return r5
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPClass cpClassValue(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPClass> r0 = r3.stringsToCPClass
            java.lang.Object r0 = r0.get(r4)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r0
            if (r0 != 0) goto L2d
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.mapClass
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L1d
            int r4 = r0.intValue()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r4 = r3.cpClassValue(r4)
            return r4
        L1d:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass
            r1 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r3.cpUTF8Value(r4, r1)
            r2 = -1
            r0.<init>(r1, r2)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPClass> r1 = r3.stringsToCPClass
            r1.put(r4, r0)
        L2d:
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble cpDoubleValue(int r4) {
            r3 = this;
            double[] r0 = r3.cpDouble
            r1 = r0[r4]
            java.lang.Double r0 = java.lang.Double.valueOf(r1)
            java.util.Map<java.lang.Double, org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble> r1 = r3.doublesToCPDoubles
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble) r1
            if (r1 != 0) goto L1f
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble
            int r2 = r3.doubleOffset
            int r4 = r4 + r2
            r1.<init>(r0, r4)
            java.util.Map<java.lang.Double, org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble> r4 = r3.doublesToCPDoubles
            r4.put(r0, r1)
        L1f:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef cpFieldValue(int r5) {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef
            int[] r1 = r4.cpFieldClassInts
            r1 = r1[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r4.cpClassValue(r1)
            int[] r2 = r4.cpFieldDescriptorInts
            r2 = r2[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r4.cpNameAndTypeValue(r2)
            int r3 = r4.fieldOffset
            int r5 = r5 + r3
            r0.<init>(r1, r2, r5)
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat cpFloatValue(int r4) {
            r3 = this;
            float[] r0 = r3.cpFloat
            r0 = r0[r4]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.util.Map<java.lang.Float, org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat> r1 = r3.floatsToCPFloats
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat) r1
            if (r1 != 0) goto L1f
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat
            int r2 = r3.floatOffset
            int r4 = r4 + r2
            r1.<init>(r0, r4)
            java.util.Map<java.lang.Float, org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat> r4 = r3.floatsToCPFloats
            r4.put(r0, r1)
        L1f:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef cpIMethodValue(int r5) {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef
            int[] r1 = r4.cpIMethodClassInts
            r1 = r1[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r4.cpClassValue(r1)
            int[] r2 = r4.cpIMethodDescriptorInts
            r2 = r2[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r4.cpNameAndTypeValue(r2)
            int r3 = r4.imethodOffset
            int r5 = r5 + r3
            r0.<init>(r1, r2, r5)
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger cpIntegerValue(int r4) {
            r3 = this;
            int[] r0 = r3.cpInt
            r0 = r0[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map<java.lang.Integer, org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger> r1 = r3.integersToCPIntegers
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger) r1
            if (r1 != 0) goto L1f
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger
            int r2 = r3.intOffset
            int r4 = r4 + r2
            r1.<init>(r0, r4)
            java.util.Map<java.lang.Integer, org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger> r4 = r3.integersToCPIntegers
            r4.put(r0, r1)
        L1f:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPLong cpLongValue(int r4) {
            r3 = this;
            long[] r0 = r3.cpLong
            r1 = r0[r4]
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.util.Map<java.lang.Long, org.apache.commons.compress.harmony.unpack200.bytecode.CPLong> r1 = r3.longsToCPLongs
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPLong) r1
            if (r1 != 0) goto L1f
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPLong
            int r2 = r3.longOffset
            int r4 = r4 + r2
            r1.<init>(r0, r4)
            java.util.Map<java.lang.Long, org.apache.commons.compress.harmony.unpack200.bytecode.CPLong> r4 = r3.longsToCPLongs
            r4.put(r0, r1)
        L1f:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef cpMethodValue(int r5) {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef
            int[] r1 = r4.cpMethodClassInts
            r1 = r1[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r4.cpClassValue(r1)
            int[] r2 = r4.cpMethodDescriptorInts
            r2 = r2[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r4.cpNameAndTypeValue(r2)
            int r3 = r4.methodOffset
            int r5 = r5 + r3
            r0.<init>(r1, r2, r5)
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType cpNameAndTypeValue(int r6) {
            r5 = this;
            java.lang.String[] r0 = r5.cpDescriptor
            r0 = r0[r6]
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType> r1 = r5.descriptorsToCPNameAndTypes
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r1
            if (r1 != 0) goto L2c
            int[] r1 = r5.cpDescriptorNameInts
            r1 = r1[r6]
            int[] r2 = r5.cpDescriptorTypeInts
            r2 = r2[r6]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r5.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r5.cpSignatureValue(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType
            int r4 = r5.descrOffset
            int r6 = r6 + r4
            r3.<init>(r1, r2, r6)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType> r6 = r5.descriptorsToCPNameAndTypes
            r6.put(r0, r3)
            r1 = r3
        L2c:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType cpNameAndTypeValue(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType> r0 = r4.descriptorsToCPNameAndTypes
            java.lang.Object r0 = r0.get(r5)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r0
            if (r0 != 0) goto L45
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.mapDescriptor
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L1d
            int r5 = r0.intValue()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r5 = r4.cpNameAndTypeValue(r5)
            return r5
        L1d:
            r0 = 58
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r1 = r5.substring(r1, r0)
            r2 = 1
            int r0 = r0 + r2
            java.lang.String r0 = r5.substring(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r4.cpUTF8Value(r1, r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r4.cpUTF8Value(r0, r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType
            int r3 = r4.descrOffset
            int r3 = r3 + (-1)
            r2.<init>(r1, r0, r3)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType> r0 = r4.descriptorsToCPNameAndTypes
            r0.put(r5, r2)
            r0 = r2
        L45:
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 cpSignatureValue(int r3) {
            r2 = this;
            int[] r0 = r2.cpSignatureInts
            r0 = r0[r3]
            r1 = -1
            if (r0 == r1) goto L8
            goto Lb
        L8:
            int r0 = r2.signatureOffset
            int r0 = r0 + r3
        Lb:
            java.lang.String[] r1 = r2.cpSignature
            r3 = r1[r3]
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r1 = r2.stringsToCPUTF8
            java.lang.Object r1 = r1.get(r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r1
            if (r1 != 0) goto L23
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8
            r1.<init>(r3, r0)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r0 = r2.stringsToCPUTF8
            r0.put(r3, r1)
        L23:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPString cpStringValue(int r4) {
            r3 = this;
            java.lang.String[] r0 = r3.cpString
            r0 = r0[r4]
            int[] r1 = r3.cpStringInts
            r1 = r1[r4]
            int r2 = r3.stringOffset
            int r2 = r2 + r4
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPString> r4 = r3.stringsToCPStrings
            java.lang.Object r4 = r4.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPString r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPString) r4
            if (r4 != 0) goto L23
            org.apache.commons.compress.harmony.unpack200.bytecode.CPString r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPString
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r3.cpUTF8Value(r1)
            r4.<init>(r1, r2)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPString> r1 = r3.stringsToCPStrings
            r1.put(r0, r4)
        L23:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 cpUTF8Value(int r3) {
            r2 = this;
            java.lang.String[] r0 = r2.cpUTF8
            r0 = r0[r3]
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r1 = r2.stringsToCPUTF8
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r1
            if (r1 != 0) goto L19
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8
            r1.<init>(r0, r3)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r3 = r2.stringsToCPUTF8
            r3.put(r0, r1)
            goto L22
        L19:
            int r0 = r1.getGlobalIndex()
            if (r0 <= r3) goto L22
            r1.setGlobalIndex(r3)
        L22:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 cpUTF8Value(java.lang.String r2) {
            r1 = this;
            r0 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r1.cpUTF8Value(r2, r0)
            return r2
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 cpUTF8Value(java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r0 = r1.stringsToCPUTF8
            java.lang.Object r0 = r0.get(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r0
            if (r0 != 0) goto L42
            if (r3 == 0) goto L15
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.mapUTF8
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L21
            int r2 = r0.intValue()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r1.cpUTF8Value(r2)
            return r2
        L21:
            if (r3 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.mapSignature
            java.lang.Object r3 = r3.get(r2)
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
        L2c:
            if (r0 == 0) goto L37
            int r2 = r0.intValue()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r1.cpSignatureValue(r2)
            return r2
        L37:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8
            r3 = -1
            r0.<init>(r2, r3)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8> r3 = r1.stringsToCPUTF8
            r3.put(r2, r0)
        L42:
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.SegmentConstantPool getConstantPool() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r0 = r1.pool
            return r0
    }

    public java.lang.String[] getCpClass() {
            r1 = this;
            java.lang.String[] r0 = r1.cpClass
            return r0
    }

    public java.lang.String[] getCpDescriptor() {
            r1 = this;
            java.lang.String[] r0 = r1.cpDescriptor
            return r0
    }

    public int[] getCpDescriptorNameInts() {
            r1 = this;
            int[] r0 = r1.cpDescriptorNameInts
            return r0
    }

    public int[] getCpDescriptorTypeInts() {
            r1 = this;
            int[] r0 = r1.cpDescriptorTypeInts
            return r0
    }

    public java.lang.String[] getCpFieldClass() {
            r1 = this;
            java.lang.String[] r0 = r1.cpFieldClass
            return r0
    }

    public java.lang.String[] getCpIMethodClass() {
            r1 = this;
            java.lang.String[] r0 = r1.cpIMethodClass
            return r0
    }

    public int[] getCpInt() {
            r1 = this;
            int[] r0 = r1.cpInt
            return r0
    }

    public long[] getCpLong() {
            r1 = this;
            long[] r0 = r1.cpLong
            return r0
    }

    public java.lang.String[] getCpMethodClass() {
            r1 = this;
            java.lang.String[] r0 = r1.cpMethodClass
            return r0
    }

    public java.lang.String[] getCpMethodDescriptor() {
            r1 = this;
            java.lang.String[] r0 = r1.cpMethodDescriptor
            return r0
    }

    public java.lang.String[] getCpSignature() {
            r1 = this;
            java.lang.String[] r0 = r1.cpSignature
            return r0
    }

    public java.lang.String[] getCpUTF8() {
            r1 = this;
            java.lang.String[] r0 = r1.cpUTF8
            return r0
    }

    /* JADX INFO: renamed from: lambda$cpClassValue$0$org-apache-commons-compress-harmony-unpack200-CpBands, reason: not valid java name */
    /* synthetic */ org.apache.commons.compress.harmony.unpack200.bytecode.CPClass m2564xd8e60d18(int r1, int r2, java.lang.String r3) {
            r0 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r0.cpUTF8Value(r1)
            r3.<init>(r1, r2)
            return r3
    }

    /* JADX INFO: renamed from: lambda$parseCpString$2$org-apache-commons-compress-harmony-unpack200-CpBands, reason: not valid java name */
    /* synthetic */ java.lang.String m2565x8a824c4b(int r3) {
            r2 = this;
            java.lang.String[] r0 = r2.cpUTF8
            int[] r1 = r2.cpStringInts
            r3 = r1[r3]
            r3 = r0[r3]
            return r3
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(java.io.InputStream r2) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            r1.parseCpUtf8(r2)
            r1.parseCpInt(r2)
            r1.parseCpFloat(r2)
            r1.parseCpLong(r2)
            r1.parseCpDouble(r2)
            r1.parseCpString(r2)
            r1.parseCpClass(r2)
            r1.parseCpSignature(r2)
            r1.parseCpDescriptor(r2)
            r1.parseCpField(r2)
            r1.parseCpMethod(r2)
            r1.parseCpIMethod(r2)
            java.lang.String[] r2 = r1.cpUTF8
            int r2 = r2.length
            r1.intOffset = r2
            int[] r0 = r1.cpInt
            int r0 = r0.length
            int r2 = r2 + r0
            r1.floatOffset = r2
            float[] r0 = r1.cpFloat
            int r0 = r0.length
            int r2 = r2 + r0
            r1.longOffset = r2
            long[] r0 = r1.cpLong
            int r0 = r0.length
            int r2 = r2 + r0
            r1.doubleOffset = r2
            double[] r0 = r1.cpDouble
            int r0 = r0.length
            int r2 = r2 + r0
            r1.stringOffset = r2
            java.lang.String[] r0 = r1.cpString
            int r0 = r0.length
            int r2 = r2 + r0
            r1.classOffset = r2
            java.lang.String[] r0 = r1.cpClass
            int r0 = r0.length
            int r2 = r2 + r0
            r1.signatureOffset = r2
            java.lang.String[] r0 = r1.cpSignature
            int r0 = r0.length
            int r2 = r2 + r0
            r1.descrOffset = r2
            java.lang.String[] r0 = r1.cpDescriptor
            int r0 = r0.length
            int r2 = r2 + r0
            r1.fieldOffset = r2
            java.lang.String[] r0 = r1.cpFieldClass
            int r0 = r0.length
            int r2 = r2 + r0
            r1.methodOffset = r2
            java.lang.String[] r0 = r1.cpMethodClass
            int r0 = r0.length
            int r2 = r2 + r0
            r1.imethodOffset = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() {
            r0 = this;
            return
    }
}
