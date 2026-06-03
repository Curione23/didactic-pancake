package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BandSet {
    protected org.apache.commons.compress.harmony.unpack200.SegmentHeader header;
    protected org.apache.commons.compress.harmony.unpack200.Segment segment;

    public BandSet(org.apache.commons.compress.harmony.unpack200.Segment r1) {
            r0 = this;
            r0.<init>()
            r0.segment = r1
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r1 = r1.getSegmentHeader()
            r0.header = r1
            return
    }

    static /* synthetic */ java.lang.String lambda$getReferences$0(java.lang.String[] r0, int[] r1, int r2) {
            r1 = r1[r2]
            r0 = r0[r1]
            return r0
    }

    public int[] decodeBandInt(java.lang.String r11, java.io.InputStream r12, org.apache.commons.compress.harmony.pack200.BHSDCodec r13, int r14) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r10 = this;
            if (r14 < 0) goto Lca
            int r11 = r13.getB()
            r0 = 1
            if (r11 == r0) goto Lc5
            if (r14 != 0) goto Ld
            goto Lc5
        Ld:
            int[] r11 = r13.decodeInts(r0, r12)
            int r1 = r11.length
            if (r1 != 0) goto L15
            return r11
        L15:
            r1 = 0
            r11 = r11[r1]
            boolean r2 = r13.isSigned()
            r3 = -1
            if (r2 == 0) goto L36
            r2 = -256(0xffffffffffffff00, float:NaN)
            if (r11 < r2) goto L36
            if (r11 > r3) goto L36
            int r11 = (-1) - r11
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r10.header
            java.io.InputStream r0 = r0.getBandHeadersInputStream()
            org.apache.commons.compress.harmony.pack200.Codec r13 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getCodec(r11, r0, r13)
            int[] r11 = r13.decodeInts(r14, r12)
            goto L63
        L36:
            boolean r2 = r13.isSigned()
            if (r2 != 0) goto L5e
            int r2 = r13.getL()
            if (r11 < r2) goto L5e
            int r2 = r13.getL()
            int r2 = r2 + 255
            if (r11 > r2) goto L5e
            int r0 = r13.getL()
            int r11 = r11 - r0
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r10.header
            java.io.InputStream r0 = r0.getBandHeadersInputStream()
            org.apache.commons.compress.harmony.pack200.Codec r13 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getCodec(r11, r0, r13)
            int[] r11 = r13.decodeInts(r14, r12)
            goto L63
        L5e:
            int r14 = r14 - r0
            int[] r11 = r13.decodeInts(r14, r12, r11)
        L63:
            boolean r12 = r13 instanceof org.apache.commons.compress.harmony.pack200.PopulationCodec
            if (r12 == 0) goto Lc4
            org.apache.commons.compress.harmony.pack200.PopulationCodec r13 = (org.apache.commons.compress.harmony.pack200.PopulationCodec) r13
            int[] r12 = r13.getFavoured()
            java.lang.Object r12 = r12.clone()
            int[] r12 = (int[]) r12
            java.util.Arrays.sort(r12)
        L76:
            int r14 = r11.length
            if (r1 >= r14) goto Lc4
            r14 = r11[r1]
            int r14 = java.util.Arrays.binarySearch(r12, r14)
            if (r14 <= r3) goto L86
            org.apache.commons.compress.harmony.pack200.Codec r14 = r13.getFavouredCodec()
            goto L8a
        L86:
            org.apache.commons.compress.harmony.pack200.Codec r14 = r13.getUnfavouredCodec()
        L8a:
            boolean r0 = r14 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            if (r0 == 0) goto Lc1
            org.apache.commons.compress.harmony.pack200.BHSDCodec r14 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r14
            boolean r0 = r14.isDelta()
            if (r0 == 0) goto Lc1
            long r4 = r14.cardinality()
        L9a:
            r0 = r11[r1]
            long r6 = (long) r0
            long r8 = r14.largest()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lad
            r0 = r11[r1]
            long r6 = (long) r0
            long r6 = r6 - r4
            int r0 = (int) r6
            r11[r1] = r0
            goto L9a
        Lad:
            r0 = r11[r1]
            long r6 = (long) r0
            long r8 = r14.smallest()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto Lc1
            r0 = r11[r1]
            int r0 = org.apache.commons.compress.utils.ExactMath.add(r0, r4)
            r11[r1] = r0
            goto Lad
        Lc1:
            int r1 = r1 + 1
            goto L76
        Lc4:
            return r11
        Lc5:
            int[] r11 = r13.decodeInts(r14, r12)
            return r11
        Lca:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r11 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r12 = "count < 0"
            r11.<init>(r12)
            throw r11
    }

    public int[][] decodeBandInt(java.lang.String r8, java.io.InputStream r9, org.apache.commons.compress.harmony.pack200.BHSDCodec r10, int[] r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            int r0 = r11.length
            int[][] r1 = new int[r0][]
            int r2 = r11.length
            r3 = 0
            r4 = r3
            r5 = r4
        L7:
            if (r4 >= r2) goto Lf
            r6 = r11[r4]
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L7
        Lf:
            int[] r8 = r7.decodeBandInt(r8, r9, r10, r5)
            r9 = r3
            r10 = r9
        L15:
            if (r9 >= r0) goto L3a
            r2 = r11[r9]
            int r4 = r8.length
            if (r2 > r4) goto L32
            int[] r2 = new int[r2]
            r1[r9] = r2
            r2 = r3
        L21:
            r4 = r1[r9]
            int r5 = r4.length
            if (r2 >= r5) goto L2f
            r5 = r8[r10]
            r4[r2] = r5
            int r10 = r10 + 1
            int r2 = r2 + 1
            goto L21
        L2f:
            int r9 = r9 + 1
            goto L15
        L32:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Counts value exceeds length of twoDResult"
            r8.<init>(r9)
            throw r8
        L3a:
            return r1
    }

    protected java.lang.String[] getReferences(int[] r3, java.lang.String[] r4) {
            r2 = this;
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            org.apache.commons.compress.harmony.unpack200.BandSet$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.harmony.unpack200.BandSet$$ExternalSyntheticLambda0
            r1.<init>(r4, r3)
            java.util.Arrays.setAll(r0, r1)
            return r0
    }

    protected java.lang.String[][] getReferences(int[][] r8, java.lang.String[] r9) {
            r7 = this;
            int r0 = r8.length
            java.lang.String[][] r1 = new java.lang.String[r0][]
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L22
            r4 = r8[r3]
            int r4 = r4.length
            java.lang.String[] r4 = new java.lang.String[r4]
            r1[r3] = r4
            r4 = r2
        Lf:
            r5 = r1[r3]
            int r6 = r5.length
            if (r4 >= r6) goto L1f
            r6 = r8[r3]
            r6 = r6[r4]
            r6 = r9[r6]
            r5[r4] = r6
            int r4 = r4 + 1
            goto Lf
        L1f:
            int r3 = r3 + 1
            goto L5
        L22:
            return r1
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] parseCPClassReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[r4]
            r5 = 0
        L8:
            if (r5 >= r6) goto L1b
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r0.cpClassValue(r1)
            r4[r5] = r0
            int r5 = r5 + 1
            goto L8
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType[] parseCPDescriptorReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType[r4]
            r5 = 0
        Le:
            if (r5 >= r6) goto L1b
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = r0.cpNameAndTypeValue(r1)
            r4[r5] = r1
            int r5 = r5 + 1
            goto Le
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[] parseCPDoubleReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[r4]
            r5 = 0
        L8:
            if (r5 >= r6) goto L1b
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble r0 = r0.cpDoubleValue(r1)
            r4[r5] = r0
            int r5 = r5 + 1
            goto L8
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef[] parseCPFieldRefReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef[r4]
            r5 = 0
        Le:
            if (r5 >= r6) goto L1b
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef r1 = r0.cpFieldValue(r1)
            r4[r5] = r1
            int r5 = r5 + 1
            goto Le
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[] parseCPFloatReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[r4]
            r5 = 0
        L8:
            if (r5 >= r6) goto L1b
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat r0 = r0.cpFloatValue(r1)
            r4[r5] = r0
            int r5 = r5 + 1
            goto L8
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[] parseCPIntReferences(java.lang.String r4, java.io.InputStream r5, org.apache.commons.compress.harmony.pack200.BHSDCodec r6, int r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r3.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            int[] r0 = r0.getCpInt()
            int[] r4 = r3.decodeBandInt(r4, r5, r6, r7)
            int r5 = r4.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[] r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[r5]
            r6 = 0
        L12:
            if (r6 >= r7) goto L4a
            r1 = r4[r6]
            if (r1 < 0) goto L2a
            int r2 = r0.length
            if (r1 >= r2) goto L2a
            org.apache.commons.compress.harmony.unpack200.Segment r2 = r3.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r2.getCpBands()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger r1 = r2.cpIntegerValue(r1)
            r5[r6] = r1
            int r6 = r6 + 1
            goto L12
        L2a:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r4 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Something has gone wrong during parsing references, index = "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = ", array size = "
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r0.length
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4a:
            return r5
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef[] parseCPInterfaceMethodRefReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef[r4]
            r5 = 0
        Le:
            if (r5 >= r6) goto L1b
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef r1 = r0.cpIMethodValue(r1)
            r4[r5] = r1
            int r5 = r5 + 1
            goto Le
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[] parseCPLongReferences(java.lang.String r4, java.io.InputStream r5, org.apache.commons.compress.harmony.pack200.BHSDCodec r6, int r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r3.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            long[] r0 = r0.getCpLong()
            int[] r4 = r3.decodeBandInt(r4, r5, r6, r7)
            int r5 = r4.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[] r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[r5]
            r6 = 0
        L12:
            if (r6 >= r7) goto L4a
            r1 = r4[r6]
            if (r1 < 0) goto L2a
            int r2 = r0.length
            if (r1 >= r2) goto L2a
            org.apache.commons.compress.harmony.unpack200.Segment r2 = r3.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r2.getCpBands()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPLong r1 = r2.cpLongValue(r1)
            r5[r6] = r1
            int r6 = r6 + 1
            goto L12
        L2a:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r4 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Something has gone wrong during parsing references, index = "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = ", array size = "
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r0.length
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4a:
            return r5
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef[] parseCPMethodRefReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef[r4]
            r5 = 0
        Le:
            if (r5 >= r6) goto L1b
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef r1 = r0.cpMethodValue(r1)
            r4[r5] = r1
            int r5 = r5 + 1
            goto Le
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] parseCPSignatureReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r4]
            r5 = 0
        L8:
            if (r5 >= r6) goto L1b
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpSignatureValue(r1)
            r4[r5] = r0
            int r5 = r5 + 1
            goto L8
        L1b:
            return r4
    }

    protected org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] parseCPSignatureReferences(java.lang.String r5, java.io.InputStream r6, org.apache.commons.compress.harmony.pack200.BHSDCodec r7, int[] r8) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r8.length
            if (r1 >= r3) goto Lc
            r3 = r8[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lc:
            int[] r5 = r4.decodeBandInt(r5, r6, r7, r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r6 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r2]
            r7 = r0
        L13:
            if (r7 >= r2) goto L26
            org.apache.commons.compress.harmony.unpack200.Segment r1 = r4.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r1.getCpBands()
            r3 = r5[r7]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r1.cpSignatureValue(r3)
            r6[r7] = r1
            int r7 = r7 + 1
            goto L13
        L26:
            int r5 = r8.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r5][]
            r7 = r0
            r1 = r7
        L2b:
            int r2 = r8.length
            if (r7 >= r2) goto L3b
            r2 = r8[r7]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r2]
            r5[r7] = r3
            java.lang.System.arraycopy(r6, r1, r3, r0, r2)
            int r1 = r1 + r2
            int r7 = r7 + 1
            goto L2b
        L3b:
            return r5
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPString[] parseCPStringReferences(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPString[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPString[r4]
            r5 = 0
        L8:
            if (r5 >= r6) goto L1b
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            r1 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPString r0 = r0.cpStringValue(r1)
            r4[r5] = r0
            int r5 = r5 + 1
            goto L8
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] parseCPUTF8References(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int[] r3 = r2.decodeBandInt(r3, r4, r5, r6)
            int r4 = r3.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r4]
            r5 = 0
        L8:
            if (r5 >= r6) goto L1b
            r0 = r3[r5]
            org.apache.commons.compress.harmony.unpack200.Segment r1 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r1.getCpBands()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.cpUTF8Value(r0)
            r4[r5] = r0
            int r5 = r5 + 1
            goto L8
        L1b:
            return r4
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] parseCPUTF8References(java.lang.String r7, java.io.InputStream r8, org.apache.commons.compress.harmony.pack200.BHSDCodec r9, int[] r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            int r0 = r10.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[][] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r0][]
            r1 = 0
            r2 = r1
            r3 = r2
        L6:
            int r4 = r10.length
            if (r2 >= r4) goto L13
            r4 = r10[r2]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r5 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r4]
            r0[r2] = r5
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        L13:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r3]
            int[] r7 = r6.decodeBandInt(r7, r8, r9, r3)
            r8 = r1
        L1a:
            if (r8 >= r3) goto L2d
            r9 = r7[r8]
            org.apache.commons.compress.harmony.unpack200.Segment r4 = r6.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r4 = r4.getCpBands()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r9 = r4.cpUTF8Value(r9)
            r2[r8] = r9
            int r8 = r8 + 1
            goto L1a
        L2d:
            r7 = r1
            r8 = r7
        L2f:
            int r9 = r10.length
            if (r7 >= r9) goto L3f
            r9 = r10[r7]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[r9]
            r0[r7] = r3
            java.lang.System.arraycopy(r2, r8, r3, r1, r9)
            int r8 = r8 + r9
            int r7 = r7 + 1
            goto L2f
        L3f:
            return r0
    }

    public long[] parseFlags(java.lang.String r7, java.io.InputStream r8, int r9, org.apache.commons.compress.harmony.pack200.BHSDCodec r10, org.apache.commons.compress.harmony.pack200.BHSDCodec r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            int[] r3 = new int[]{r9}
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            long[][] r7 = r0.parseFlags(r1, r2, r3, r4, r5)
            r8 = 0
            r7 = r7[r8]
            return r7
    }

    public long[] parseFlags(java.lang.String r7, java.io.InputStream r8, int r9, org.apache.commons.compress.harmony.pack200.BHSDCodec r10, boolean r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            int[] r3 = new int[]{r9}
            if (r11 == 0) goto L8
            r4 = r10
            goto La
        L8:
            r9 = 0
            r4 = r9
        La:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r10
            long[][] r7 = r0.parseFlags(r1, r2, r3, r4, r5)
            r8 = 0
            r7 = r7[r8]
            return r7
    }

    public long[][] parseFlags(java.lang.String r18, java.io.InputStream r19, int[] r20, org.apache.commons.compress.harmony.pack200.BHSDCodec r21, org.apache.commons.compress.harmony.pack200.BHSDCodec r22) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            int r5 = r3.length
            r6 = 0
            if (r5 != 0) goto L15
            long[] r1 = new long[r6]
            long[][] r1 = new long[][]{r1}
            return r1
        L15:
            long[][] r7 = new long[r5][]
            r8 = r6
            r9 = r8
        L19:
            if (r8 >= r5) goto L21
            r10 = r3[r8]
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L19
        L21:
            if (r4 == 0) goto L28
            int[] r4 = r0.decodeBandInt(r1, r2, r4, r9)
            goto L29
        L28:
            r4 = 0
        L29:
            r8 = r22
            int[] r1 = r0.decodeBandInt(r1, r2, r8, r9)
            r2 = r6
            r8 = r2
        L31:
            if (r2 >= r5) goto L61
            r9 = r3[r2]
            long[] r9 = new long[r9]
            r7[r2] = r9
            r9 = r6
        L3a:
            r10 = r7[r2]
            int r11 = r10.length
            if (r9 >= r11) goto L5e
            if (r4 == 0) goto L54
            r11 = r4[r8]
            long r11 = (long) r11
            r13 = 32
            long r11 = r11 << r13
            r13 = r1[r8]
            long r13 = (long) r13
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r15
            long r11 = r11 | r13
            r10[r9] = r11
            goto L59
        L54:
            r11 = r1[r8]
            long r11 = (long) r11
            r10[r9] = r11
        L59:
            int r8 = r8 + 1
            int r9 = r9 + 1
            goto L3a
        L5e:
            int r2 = r2 + 1
            goto L31
        L61:
            return r7
    }

    public long[][] parseFlags(java.lang.String r7, java.io.InputStream r8, int[] r9, org.apache.commons.compress.harmony.pack200.BHSDCodec r10, boolean r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            if (r11 == 0) goto L4
            r4 = r10
            goto L6
        L4:
            r11 = 0
            r4 = r11
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            long[][] r7 = r0.parseFlags(r1, r2, r3, r4, r5)
            return r7
    }

    public java.lang.String[] parseReferences(java.lang.String r7, java.io.InputStream r8, org.apache.commons.compress.harmony.pack200.BHSDCodec r9, int r10, java.lang.String[] r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            int[] r4 = new int[]{r10}
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            java.lang.String[][] r7 = r0.parseReferences(r1, r2, r3, r4, r5)
            r8 = 0
            r7 = r7[r8]
            return r7
    }

    public java.lang.String[][] parseReferences(java.lang.String r6, java.io.InputStream r7, org.apache.commons.compress.harmony.pack200.BHSDCodec r8, int[] r9, java.lang.String[] r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            int r0 = r9.length
            r1 = 0
            if (r0 != 0) goto Lc
            r6 = 1
            java.lang.String[][] r6 = new java.lang.String[r6][]
            java.lang.String[] r7 = new java.lang.String[r1]
            r6[r1] = r7
            return r6
        Lc:
            r2 = r1
            r3 = r2
        Le:
            if (r2 >= r0) goto L16
            r4 = r9[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Le
        L16:
            int[] r6 = r5.decodeBandInt(r6, r7, r8, r3)
            java.lang.String[] r7 = new java.lang.String[r3]
            r8 = r1
        L1d:
            if (r8 >= r3) goto L4d
            r2 = r6[r8]
            if (r2 < 0) goto L2d
            int r4 = r10.length
            if (r2 >= r4) goto L2d
            r2 = r10[r2]
            r7[r8] = r2
            int r8 = r8 + 1
            goto L1d
        L2d:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r6 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Something has gone wrong during parsing references, index = "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r8 = ", array size = "
            java.lang.StringBuilder r7 = r7.append(r8)
            int r8 = r10.length
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L4d:
            java.lang.String[][] r6 = new java.lang.String[r0][]
            r8 = r1
            r10 = r8
        L51:
            if (r8 >= r0) goto L60
            r2 = r9[r8]
            java.lang.String[] r3 = new java.lang.String[r2]
            r6[r8] = r3
            java.lang.System.arraycopy(r7, r10, r3, r1, r2)
            int r10 = r10 + r2
            int r8 = r8 + 1
            goto L51
        L60:
            return r6
    }

    public abstract void read(java.io.InputStream r1) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception;

    public abstract void unpack() throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception;

    public void unpack(java.io.InputStream r1) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            r0.read(r1)
            r0.unpack()
            return
    }
}
