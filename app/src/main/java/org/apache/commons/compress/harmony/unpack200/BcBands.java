package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class BcBands extends org.apache.commons.compress.harmony.unpack200.BandSet {
    private int[] bcByte;
    private int[] bcCaseCount;
    private int[] bcCaseValue;
    private int[] bcClassRef;
    private int[] bcDoubleRef;
    private int[][] bcEscByte;
    private int[] bcEscRef;
    private int[] bcEscRefSize;
    private int[] bcEscSize;
    private int[] bcFieldRef;
    private int[] bcFloatRef;
    private int[] bcIMethodRef;
    private int[] bcInitRef;
    private int[] bcIntRef;
    private int[] bcLabel;
    private int[] bcLocal;
    private int[] bcLongRef;
    private int[] bcMethodRef;
    private int[] bcShort;
    private int[] bcStringRef;
    private int[] bcSuperField;
    private int[] bcSuperMethod;
    private int[] bcThisField;
    private int[] bcThisMethod;
    private byte[][][] methodByteCodePacked;
    private java.util.List<java.lang.Integer> wideByteCodes;

    public BcBands(org.apache.commons.compress.harmony.unpack200.Segment r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private boolean endsWithLoad(int r2) {
            r1 = this;
            r0 = 21
            if (r2 < r0) goto La
            r0 = 25
            if (r2 > r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    private boolean endsWithStore(int r2) {
            r1 = this;
            r0 = 54
            if (r2 < r0) goto La
            r0 = 58
            if (r2 > r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    private boolean startsWithIf(int r2) {
            r1 = this;
            r0 = 153(0x99, float:2.14E-43)
            if (r2 < r0) goto L8
            r0 = 166(0xa6, float:2.33E-43)
            if (r2 <= r0) goto L13
        L8:
            r0 = 198(0xc6, float:2.77E-43)
            if (r2 == r0) goto L13
            r0 = 199(0xc7, float:2.79E-43)
            if (r2 != r0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    public int[] getBcByte() {
            r1 = this;
            int[] r0 = r1.bcByte
            return r0
    }

    public int[] getBcCaseCount() {
            r1 = this;
            int[] r0 = r1.bcCaseCount
            return r0
    }

    public int[] getBcCaseValue() {
            r1 = this;
            int[] r0 = r1.bcCaseValue
            return r0
    }

    public int[] getBcClassRef() {
            r1 = this;
            int[] r0 = r1.bcClassRef
            return r0
    }

    public int[] getBcDoubleRef() {
            r1 = this;
            int[] r0 = r1.bcDoubleRef
            return r0
    }

    public int[] getBcFieldRef() {
            r1 = this;
            int[] r0 = r1.bcFieldRef
            return r0
    }

    public int[] getBcFloatRef() {
            r1 = this;
            int[] r0 = r1.bcFloatRef
            return r0
    }

    public int[] getBcIMethodRef() {
            r1 = this;
            int[] r0 = r1.bcIMethodRef
            return r0
    }

    public int[] getBcInitRef() {
            r1 = this;
            int[] r0 = r1.bcInitRef
            return r0
    }

    public int[] getBcIntRef() {
            r1 = this;
            int[] r0 = r1.bcIntRef
            return r0
    }

    public int[] getBcLabel() {
            r1 = this;
            int[] r0 = r1.bcLabel
            return r0
    }

    public int[] getBcLocal() {
            r1 = this;
            int[] r0 = r1.bcLocal
            return r0
    }

    public int[] getBcLongRef() {
            r1 = this;
            int[] r0 = r1.bcLongRef
            return r0
    }

    public int[] getBcMethodRef() {
            r1 = this;
            int[] r0 = r1.bcMethodRef
            return r0
    }

    public int[] getBcShort() {
            r1 = this;
            int[] r0 = r1.bcShort
            return r0
    }

    public int[] getBcStringRef() {
            r1 = this;
            int[] r0 = r1.bcStringRef
            return r0
    }

    public int[] getBcSuperField() {
            r1 = this;
            int[] r0 = r1.bcSuperField
            return r0
    }

    public int[] getBcSuperMethod() {
            r1 = this;
            int[] r0 = r1.bcSuperMethod
            return r0
    }

    public int[] getBcThisField() {
            r1 = this;
            int[] r0 = r1.bcThisField
            return r0
    }

    public int[] getBcThisMethod() {
            r1 = this;
            int[] r0 = r1.bcThisMethod
            return r0
    }

    public byte[][][] getMethodByteCodePacked() {
            r1 = this;
            byte[][][] r0 = r1.methodByteCodePacked
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(java.io.InputStream r39) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r38 = this;
            r0 = r38
            r1 = r39
            org.apache.commons.compress.harmony.unpack200.Segment r2 = r0.segment
            org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands r2 = r2.getAttrDefinitionBands()
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r2 = r2.getAttributeDefinitionMap()
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r3 = r0.header
            int r3 = r3.getClassCount()
            org.apache.commons.compress.harmony.unpack200.Segment r4 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r4 = r4.getClassBands()
            long[][] r4 = r4.getMethodFlags()
            java.lang.String r5 = "ACC_ABSTRACT"
            r6 = 2
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r5 = r2.getAttributeLayout(r5, r6)
            java.lang.String r7 = "ACC_NATIVE"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r2 = r2.getAttributeLayout(r7, r6)
            byte[][][] r7 = new byte[r3][][]
            r0.methodByteCodePacked = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.wideByteCodes = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
        L5f:
            if (r9 >= r3) goto L1fb
            r6 = r4[r9]
            int r6 = r6.length
            r30 = r3
            byte[][][] r3 = r0.methodByteCodePacked
            r31 = r14
            byte[][] r14 = new byte[r6][]
            r3[r9] = r14
            r14 = r31
            r3 = 0
        L71:
            if (r3 >= r6) goto L1e7
            r31 = r4[r9]
            r32 = r10
            r33 = r11
            r10 = r31[r3]
            boolean r31 = r5.matches(r10)
            if (r31 != 0) goto L1ce
            boolean r10 = r2.matches(r10)
            if (r10 != 0) goto L1ce
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
        L8c:
            int r11 = r39.read()
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r34 = r2
            r2 = -1
            if (r11 == r2) goto L9e
            r10.write(r11)
            r2 = r34
            goto L8c
        L9e:
            byte[][][] r2 = r0.methodByteCodePacked
            r2 = r2[r9]
            byte[] r10 = r10.toByteArray()
            r2[r3] = r10
            byte[][][] r2 = r0.methodByteCodePacked
            r2 = r2[r9]
            r2 = r2[r3]
            int r2 = r2.length
            int[] r10 = new int[r2]
            r11 = 0
        Lb2:
            if (r11 >= r2) goto Lc7
            r31 = r2
            byte[][][] r2 = r0.methodByteCodePacked
            r2 = r2[r9]
            r2 = r2[r3]
            r2 = r2[r11]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r10[r11] = r2
            int r11 = r11 + 1
            r2 = r31
            goto Lb2
        Lc7:
            r35 = r4
            r10 = r32
            r11 = r33
            r2 = 0
        Lce:
            byte[][][] r4 = r0.methodByteCodePacked
            r4 = r4[r9]
            r4 = r4[r3]
            r36 = r5
            int r5 = r4.length
            if (r2 >= r5) goto L1ca
            r5 = r4[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r37 = r6
            r6 = 132(0x84, float:1.85E-43)
            if (r5 == r6) goto L1bd
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 == r6) goto L168
            r6 = 193(0xc1, float:2.7E-43)
            if (r5 == r6) goto L168
            r6 = 196(0xc4, float:2.75E-43)
            if (r5 == r6) goto L16a
            r4 = 197(0xc5, float:2.76E-43)
            if (r5 == r4) goto L166
            r4 = 253(0xfd, float:3.55E-43)
            if (r5 == r4) goto L163
            r4 = 254(0xfe, float:3.56E-43)
            if (r5 == r4) goto L160
            switch(r5) {
                case 16: goto L15c;
                case 17: goto L159;
                case 18: goto L156;
                case 19: goto L156;
                case 20: goto L153;
                default: goto Lfe;
            }
        Lfe:
            switch(r5) {
                case 167: goto L150;
                case 168: goto L150;
                case 169: goto L14d;
                case 170: goto L145;
                case 171: goto L13f;
                default: goto L101;
            }
        L101:
            switch(r5) {
                case 178: goto L13c;
                case 179: goto L13c;
                case 180: goto L13c;
                case 181: goto L13c;
                case 182: goto L139;
                case 183: goto L139;
                case 184: goto L139;
                case 185: goto L136;
                default: goto L104;
            }
        L104:
            switch(r5) {
                case 187: goto L168;
                case 188: goto L15c;
                case 189: goto L168;
                default: goto L107;
            }
        L107:
            switch(r5) {
                case 200: goto L150;
                case 201: goto L150;
                case 202: goto L133;
                case 203: goto L133;
                case 204: goto L133;
                case 205: goto L133;
                case 206: goto L130;
                case 207: goto L130;
                case 208: goto L130;
                case 209: goto L133;
                case 210: goto L133;
                case 211: goto L133;
                case 212: goto L133;
                case 213: goto L130;
                case 214: goto L130;
                case 215: goto L130;
                case 216: goto L12d;
                case 217: goto L12d;
                case 218: goto L12d;
                case 219: goto L12d;
                case 220: goto L12a;
                case 221: goto L12a;
                case 222: goto L12a;
                case 223: goto L12d;
                case 224: goto L12d;
                case 225: goto L12d;
                case 226: goto L12d;
                case 227: goto L12a;
                case 228: goto L12a;
                case 229: goto L12a;
                case 230: goto L127;
                case 231: goto L127;
                case 232: goto L127;
                case 233: goto L168;
                case 234: goto L124;
                case 235: goto L121;
                case 236: goto L168;
                case 237: goto L124;
                case 238: goto L121;
                case 239: goto L11e;
                default: goto L10a;
            }
        L10a:
            boolean r4 = r0.endsWithLoad(r5)
            if (r4 != 0) goto L14d
            boolean r4 = r0.endsWithStore(r5)
            if (r4 == 0) goto L117
            goto L14d
        L117:
            boolean r4 = r0.startsWithIf(r5)
            if (r4 == 0) goto L15e
            goto L150
        L11e:
            int r17 = r17 + 1
            goto L15e
        L121:
            int r8 = r8 + 1
            goto L15e
        L124:
            int r15 = r15 + 1
            goto L15e
        L127:
            int r27 = r27 + 1
            goto L15e
        L12a:
            int r26 = r26 + 1
            goto L15e
        L12d:
            int r24 = r24 + 1
            goto L15e
        L130:
            int r25 = r25 + 1
            goto L15e
        L133:
            int r23 = r23 + 1
            goto L15e
        L136:
            int r22 = r22 + 1
            goto L15e
        L139:
            int r21 = r21 + 1
            goto L15e
        L13c:
            int r20 = r20 + 1
            goto L15e
        L13f:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r7.add(r4)
            goto L14a
        L145:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r7.add(r4)
        L14a:
            int r10 = r10 + 1
            goto L150
        L14d:
            int r13 = r13 + 1
            goto L15e
        L150:
            int r14 = r14 + 1
            goto L15e
        L153:
            int r16 = r16 + 1
            goto L15e
        L156:
            int r18 = r18 + 1
            goto L15e
        L159:
            int r12 = r12 + 1
            goto L15e
        L15c:
            int r11 = r11 + 1
        L15e:
            r4 = 2
            goto L1c2
        L160:
            int r28 = r28 + 1
            goto L15e
        L163:
            int r29 = r29 + 1
            goto L15e
        L166:
            int r11 = r11 + 1
        L168:
            r4 = 2
            goto L1ba
        L16a:
            int r2 = r2 + 1
            r4 = r4[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.util.List<java.lang.Integer> r5 = r0.wideByteCodes
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.add(r6)
            r5 = 132(0x84, float:1.85E-43)
            if (r4 != r5) goto L185
            int r13 = r13 + 1
            int r12 = r12 + 1
            r31 = r2
            r4 = 2
            goto L1b7
        L185:
            boolean r5 = r0.endsWithLoad(r4)
            if (r5 != 0) goto L1b2
            boolean r5 = r0.endsWithStore(r4)
            if (r5 != 0) goto L1b2
            r5 = 169(0xa9, float:2.37E-43)
            if (r4 != r5) goto L196
            goto L1b2
        L196:
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r0.segment
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r31 = r2
            java.lang.String r2 = "Found unhandled "
            r6.<init>(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r2 = org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode.getByteCode(r4)
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.String r2 = r2.toString()
            r4 = 2
            r5.log(r4, r2)
            goto L1b7
        L1b2:
            r31 = r2
            r4 = 2
            int r13 = r13 + 1
        L1b7:
            r2 = r31
            goto L1c2
        L1ba:
            int r19 = r19 + 1
            goto L1c2
        L1bd:
            r4 = 2
            int r13 = r13 + 1
            int r11 = r11 + 1
        L1c2:
            int r2 = r2 + 1
            r5 = r36
            r6 = r37
            goto Lce
        L1ca:
            r37 = r6
            r4 = 2
            goto L1db
        L1ce:
            r34 = r2
            r35 = r4
            r36 = r5
            r37 = r6
            r4 = 2
            r10 = r32
            r11 = r33
        L1db:
            int r3 = r3 + 1
            r2 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            goto L71
        L1e7:
            r34 = r2
            r35 = r4
            r36 = r5
            r32 = r10
            r33 = r11
            r4 = 2
            int r9 = r9 + 1
            r6 = r4
            r3 = r30
            r4 = r35
            goto L5f
        L1fb:
            r31 = r14
            java.lang.String r2 = "bc_case_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r10)
            r0.bcCaseCount = r2
            r2 = 0
            r3 = 0
        L209:
            int[] r4 = r0.bcCaseCount
            int r4 = r4.length
            if (r2 >= r4) goto L225
            java.lang.Object r4 = r7.get(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21d
            int r3 = r3 + 1
            goto L222
        L21d:
            int[] r4 = r0.bcCaseCount
            r4 = r4[r2]
            int r3 = r3 + r4
        L222:
            int r2 = r2 + 1
            goto L209
        L225:
            java.lang.String r2 = "bc_case_value"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r2 = r0.decodeBandInt(r2, r1, r4, r3)
            r0.bcCaseValue = r2
            r14 = r31
            r2 = 0
        L232:
            if (r2 >= r10) goto L23c
            int[] r3 = r0.bcCaseCount
            r3 = r3[r2]
            int r14 = r14 + r3
            int r2 = r2 + 1
            goto L232
        L23c:
            java.lang.String r2 = "bc_byte"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r11)
            r0.bcByte = r2
            java.lang.String r2 = "bc_short"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r12)
            r0.bcShort = r2
            java.lang.String r2 = "bc_local"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r13)
            r0.bcLocal = r2
            java.lang.String r2 = "bc_label"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r14)
            r0.bcLabel = r2
            java.lang.String r2 = "bc_intref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r15)
            r0.bcIntRef = r2
            java.lang.String r2 = "bc_floatref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcFloatRef = r2
            java.lang.String r2 = "bc_longref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            r8 = r16
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcLongRef = r2
            java.lang.String r2 = "bc_doubleref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            r8 = r17
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcDoubleRef = r2
            java.lang.String r2 = "bc_stringref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            r8 = r18
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcStringRef = r2
            java.lang.String r2 = "bc_classref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r19
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcClassRef = r2
            java.lang.String r2 = "bc_fieldref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            r8 = r20
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcFieldRef = r2
            java.lang.String r2 = "bc_methodref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r21
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcMethodRef = r2
            java.lang.String r2 = "bc_imethodref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            r8 = r22
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcIMethodRef = r2
            java.lang.String r2 = "bc_thisfield"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r23
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcThisField = r2
            java.lang.String r2 = "bc_superfield"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r24
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcSuperField = r2
            java.lang.String r2 = "bc_thismethod"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r25
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcThisMethod = r2
            java.lang.String r2 = "bc_supermethod"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r26
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcSuperMethod = r2
            java.lang.String r2 = "bc_initref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r27
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcInitRef = r2
            java.lang.String r2 = "bc_escref"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r29
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcEscRef = r2
            java.lang.String r2 = "bc_escrefsize"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcEscRefSize = r2
            java.lang.String r2 = "bc_escsize"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            r8 = r28
            int[] r2 = r0.decodeBandInt(r2, r1, r3, r8)
            r0.bcEscSize = r2
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            int[] r3 = r0.bcEscSize
            java.lang.String r4 = "bc_escbyte"
            int[][] r1 = r0.decodeBandInt(r4, r1, r2, r3)
            r0.bcEscByte = r1
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r39 = this;
            r0 = r39
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r1 = r0.header
            int r1 = r1.getClassCount()
            org.apache.commons.compress.harmony.unpack200.Segment r2 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r2 = r2.getClassBands()
            long[][] r2 = r2.getMethodFlags()
            org.apache.commons.compress.harmony.unpack200.Segment r3 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r3 = r3.getClassBands()
            int[] r3 = r3.getCodeMaxNALocals()
            org.apache.commons.compress.harmony.unpack200.Segment r4 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r4 = r4.getClassBands()
            int[] r4 = r4.getCodeMaxStack()
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r5 = r5.getClassBands()
            java.util.ArrayList[][] r5 = r5.getMethodAttributes()
            org.apache.commons.compress.harmony.unpack200.Segment r6 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r6 = r6.getClassBands()
            java.lang.String[][] r6 = r6.getMethodDescr()
            org.apache.commons.compress.harmony.unpack200.Segment r7 = r0.segment
            org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands r7 = r7.getAttrDefinitionBands()
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r7 = r7.getAttributeDefinitionMap()
            java.lang.String r8 = "ACC_ABSTRACT"
            r9 = 2
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r8 = r7.getAttributeLayout(r8, r9)
            java.lang.String r10 = "ACC_NATIVE"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r10 = r7.getAttributeLayout(r10, r9)
            java.lang.String r11 = "ACC_STATIC"
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r7 = r7.getAttributeLayout(r11, r9)
            java.util.List<java.lang.Integer> r9 = r0.wideByteCodes
            int r9 = r9.size()
            int[] r15 = new int[r9]
            r33 = 0
            r11 = r33
        L63:
            if (r11 >= r9) goto L76
            java.util.List<java.lang.Integer> r12 = r0.wideByteCodes
            java.lang.Object r12 = r12.get(r11)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r15[r11] = r12
            int r11 = r11 + 1
            goto L63
        L76:
            org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r9 = new org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager
            r11 = r9
            int[] r12 = r0.bcCaseCount
            int[] r13 = r0.bcCaseValue
            int[] r14 = r0.bcByte
            r16 = r15
            int[] r15 = r0.bcShort
            r32 = r16
            r34 = r5
            int[] r5 = r0.bcLocal
            r16 = r5
            int[] r5 = r0.bcLabel
            r17 = r5
            int[] r5 = r0.bcIntRef
            r18 = r5
            int[] r5 = r0.bcFloatRef
            r19 = r5
            int[] r5 = r0.bcLongRef
            r20 = r5
            int[] r5 = r0.bcDoubleRef
            r21 = r5
            int[] r5 = r0.bcStringRef
            r22 = r5
            int[] r5 = r0.bcClassRef
            r23 = r5
            int[] r5 = r0.bcFieldRef
            r24 = r5
            int[] r5 = r0.bcMethodRef
            r25 = r5
            int[] r5 = r0.bcIMethodRef
            r26 = r5
            int[] r5 = r0.bcThisField
            r27 = r5
            int[] r5 = r0.bcSuperField
            r28 = r5
            int[] r5 = r0.bcThisMethod
            r29 = r5
            int[] r5 = r0.bcSuperMethod
            r30 = r5
            int[] r5 = r0.bcInitRef
            r31 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r0.segment
            r9.setSegment(r5)
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r5 = r5.getClassBands()
            java.util.ArrayList r5 = r5.getOrderedCodeAttributes()
            org.apache.commons.compress.harmony.unpack200.Segment r11 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r11 = r11.getClassBands()
            int[] r11 = r11.getCodeHandlerCount()
            org.apache.commons.compress.harmony.unpack200.Segment r12 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r12 = r12.getClassBands()
            int[][] r12 = r12.getCodeHandlerStartP()
            org.apache.commons.compress.harmony.unpack200.Segment r13 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r13 = r13.getClassBands()
            int[][] r13 = r13.getCodeHandlerEndPO()
            org.apache.commons.compress.harmony.unpack200.Segment r14 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r14 = r14.getClassBands()
            int[][] r14 = r14.getCodeHandlerCatchPO()
            org.apache.commons.compress.harmony.unpack200.Segment r15 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r15 = r15.getClassBands()
            int[][] r15 = r15.getCodeHandlerClassRCN()
            r23 = r5
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r0.segment
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r5 = r5.getSegmentHeader()
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r5 = r5.getOptions()
            boolean r5 = r5.hasAllCodeFlags()
            r24 = r5
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r5 = r5.getClassBands()
            boolean[] r5 = r5.getCodeHasAttributes()
            r25 = r5
            r5 = r33
            r16 = r5
            r17 = r16
        L12f:
            if (r5 >= r1) goto L2b9
            r26 = r1
            r1 = r2[r5]
            int r1 = r1.length
            r28 = r13
            r27 = r14
            r14 = r16
            r35 = r17
            r13 = r33
        L140:
            if (r13 >= r1) goto L299
            r16 = r2[r5]
            r30 = r1
            r29 = r2
            r1 = r16[r13]
            boolean r16 = r8.matches(r1)
            if (r16 != 0) goto L275
            boolean r16 = r10.matches(r1)
            if (r16 != 0) goto L275
            r17 = r4[r14]
            r16 = r3[r14]
            boolean r1 = r7.matches(r1)
            if (r1 != 0) goto L162
            int r16 = r16 + 1
        L162:
            r1 = r6[r5]
            r1 = r1[r13]
            int r1 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countInvokeInterfaceArgs(r1)
            int r18 = r16 + r1
            org.apache.commons.compress.harmony.unpack200.Segment r1 = r0.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r1.getCpBands()
            java.lang.String[] r1 = r1.getCpClass()
            org.apache.commons.compress.harmony.unpack200.Segment r2 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r2 = r2.getClassBands()
            int[] r2 = r2.getClassThisInts()
            r2 = r2[r5]
            r2 = r1[r2]
            r9.setCurrentClass(r2)
            org.apache.commons.compress.harmony.unpack200.Segment r2 = r0.segment
            org.apache.commons.compress.harmony.unpack200.ClassBands r2 = r2.getClassBands()
            int[] r2 = r2.getClassSuperInts()
            r2 = r2[r5]
            r1 = r1[r2]
            r9.setSuperClass(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r31 = r3
            if (r11 == 0) goto L1e3
            r2 = r33
        L1a3:
            r3 = r11[r14]
            if (r2 >= r3) goto L1e3
            r3 = r15[r14]
            r3 = r3[r2]
            int r3 = r3 + (-1)
            r32 = r4
            r4 = -1
            if (r3 == r4) goto L1bd
            org.apache.commons.compress.harmony.unpack200.Segment r4 = r0.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r4 = r4.getCpBands()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3 = r4.cpClassValue(r3)
            goto L1be
        L1bd:
            r3 = 0
        L1be:
            org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry
            r16 = r12[r14]
            r36 = r6
            r6 = r16[r2]
            r16 = r28[r14]
            r37 = r7
            r7 = r16[r2]
            r16 = r27[r14]
            r38 = r8
            r8 = r16[r2]
            r4.<init>(r6, r7, r8, r3)
            r1.add(r4)
            int r2 = r2 + 1
            r4 = r32
            r6 = r36
            r7 = r37
            r8 = r38
            goto L1a3
        L1e3:
            r32 = r4
            r36 = r6
            r37 = r7
            r38 = r8
            org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute
            byte[][][] r3 = r0.methodByteCodePacked
            r3 = r3[r5]
            r19 = r3[r13]
            org.apache.commons.compress.harmony.unpack200.Segment r3 = r0.segment
            r16 = r2
            r20 = r3
            r21 = r9
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r1 = r34[r5]
            r1 = r1[r13]
            java.util.Iterator r3 = r1.iterator()
            r4 = r33
        L20a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L228
            java.lang.Object r6 = r3.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r6 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r6
            boolean r7 = r6 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute
            if (r7 == 0) goto L228
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r6 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute) r6
            int r6 = r6.getLayoutIndex()
            r7 = 15
            if (r6 < r7) goto L225
            goto L228
        L225:
            int r4 = r4 + 1
            goto L20a
        L228:
            r1.add(r4, r2)
            java.util.List<java.lang.Integer> r1 = r2.byteCodeOffsets
            r2.renumber(r1)
            if (r24 == 0) goto L23b
            r1 = r23
            java.lang.Object r3 = r1.get(r14)
            java.util.List r3 = (java.util.List) r3
            goto L251
        L23b:
            r1 = r23
            boolean r3 = r25[r14]
            if (r3 == 0) goto L24c
            r3 = r35
            java.lang.Object r4 = r1.get(r3)
            java.util.List r4 = (java.util.List) r4
            int r35 = r3 + 1
            goto L250
        L24c:
            r3 = r35
            java.util.List r4 = java.util.Collections.EMPTY_LIST
        L250:
            r3 = r4
        L251:
            java.util.Iterator r3 = r3.iterator()
        L255:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L272
            java.lang.Object r4 = r3.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r4
            r2.addAttribute(r4)
            boolean r6 = r4.hasBCIRenumbering()
            if (r6 == 0) goto L255
            org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute) r4
            java.util.List<java.lang.Integer> r6 = r2.byteCodeOffsets
            r4.renumber(r6)
            goto L255
        L272:
            int r14 = r14 + 1
            goto L285
        L275:
            r31 = r3
            r32 = r4
            r36 = r6
            r37 = r7
            r38 = r8
            r1 = r23
            r3 = r35
            r35 = r3
        L285:
            int r13 = r13 + 1
            r23 = r1
            r2 = r29
            r1 = r30
            r3 = r31
            r4 = r32
            r6 = r36
            r7 = r37
            r8 = r38
            goto L140
        L299:
            r29 = r2
            r31 = r3
            r32 = r4
            r36 = r6
            r37 = r7
            r38 = r8
            r1 = r23
            r3 = r35
            int r5 = r5 + 1
            r17 = r3
            r16 = r14
            r1 = r26
            r14 = r27
            r13 = r28
            r3 = r31
            goto L12f
        L2b9:
            return
    }
}
