package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class IcBands extends org.apache.commons.compress.harmony.unpack200.BandSet {
    private final java.lang.String[] cpClass;
    private final java.lang.String[] cpUTF8;
    private org.apache.commons.compress.harmony.unpack200.IcTuple[] icAll;
    private java.util.Map<java.lang.String, java.util.List<org.apache.commons.compress.harmony.unpack200.IcTuple>> outerClassToTuples;
    private java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.IcTuple> thisClassToTuple;

    public IcBands(org.apache.commons.compress.harmony.unpack200.Segment r2) {
            r1 = this;
            r1.<init>(r2)
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r2.getCpBands()
            java.lang.String[] r0 = r0.getCpClass()
            r1.cpClass = r0
            org.apache.commons.compress.harmony.unpack200.CpBands r2 = r2.getCpBands()
            java.lang.String[] r2 = r2.getCpUTF8()
            r1.cpUTF8 = r2
            return
    }

    static /* synthetic */ int lambda$getRelevantIcTuples$0(org.apache.commons.compress.harmony.unpack200.IcTuple r0, org.apache.commons.compress.harmony.unpack200.IcTuple r1) {
            int r0 = r0.getTupleIndex()
            int r1 = r1.getTupleIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            int r0 = java.lang.Integer.compare(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.List lambda$unpack$1(java.lang.String r0) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.IcTuple[] getIcTuples() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r0 = r1.icAll
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.IcTuple[] getRelevantIcTuples(java.lang.String r8, org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r9) {
            r7 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.String, java.util.List<org.apache.commons.compress.harmony.unpack200.IcTuple>> r2 = r7.outerClassToTuples
            java.lang.Object r8 = r2.get(r8)
            java.util.List r8 = (java.util.List) r8
            r2 = 0
            if (r8 == 0) goto L2b
            r3 = r2
        L16:
            int r4 = r8.size()
            if (r3 >= r4) goto L2b
            java.lang.Object r4 = r8.get(r3)
            org.apache.commons.compress.harmony.unpack200.IcTuple r4 = (org.apache.commons.compress.harmony.unpack200.IcTuple) r4
            r0.add(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L16
        L2b:
            java.util.List r8 = r9.entries()
            r9 = r2
        L30:
            int r3 = r8.size()
            if (r9 >= r3) goto L5a
            java.lang.Object r3 = r8.get(r9)
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry) r3
            boolean r4 = r3 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPClass
            if (r4 == 0) goto L57
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r3
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.IcTuple> r4 = r7.thisClassToTuple
            java.lang.String r3 = r3.name
            java.lang.Object r3 = r4.get(r3)
            org.apache.commons.compress.harmony.unpack200.IcTuple r3 = (org.apache.commons.compress.harmony.unpack200.IcTuple) r3
            if (r3 == 0) goto L57
            boolean r4 = r0.add(r3)
            if (r4 == 0) goto L57
            r1.add(r3)
        L57:
            int r9 = r9 + 1
            goto L30
        L5a:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L64:
            int r3 = r8.size()
            if (r3 <= 0) goto Lb3
            r9.clear()
            r3 = r2
        L6e:
            int r4 = r8.size()
            if (r3 >= r4) goto L94
            java.lang.Object r4 = r8.get(r3)
            org.apache.commons.compress.harmony.unpack200.IcTuple r4 = (org.apache.commons.compress.harmony.unpack200.IcTuple) r4
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.IcTuple> r5 = r7.thisClassToTuple
            java.lang.String r6 = r4.outerClassString()
            java.lang.Object r5 = r5.get(r6)
            org.apache.commons.compress.harmony.unpack200.IcTuple r5 = (org.apache.commons.compress.harmony.unpack200.IcTuple) r5
            if (r5 == 0) goto L91
            boolean r4 = r4.outerIsAnonymous()
            if (r4 != 0) goto L91
            r9.add(r5)
        L91:
            int r3 = r3 + 1
            goto L6e
        L94:
            r8.clear()
            r3 = r2
        L98:
            int r4 = r9.size()
            if (r3 >= r4) goto L64
            java.lang.Object r4 = r9.get(r3)
            org.apache.commons.compress.harmony.unpack200.IcTuple r4 = (org.apache.commons.compress.harmony.unpack200.IcTuple) r4
            boolean r5 = r0.add(r4)
            if (r5 == 0) goto Lb0
            r1.add(r4)
            r8.add(r4)
        Lb0:
            int r3 = r3 + 1
            goto L98
        Lb3:
            org.apache.commons.compress.harmony.unpack200.IcBands$$ExternalSyntheticLambda1 r8 = new org.apache.commons.compress.harmony.unpack200.IcBands$$ExternalSyntheticLambda1
            r8.<init>()
            r1.sort(r8)
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r8 = org.apache.commons.compress.harmony.unpack200.IcTuple.EMPTY_ARRAY
            java.lang.Object[] r8 = r1.toArray(r8)
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r8 = (org.apache.commons.compress.harmony.unpack200.IcTuple[]) r8
            return r8
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(java.io.InputStream r23) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r22 = this;
            r0 = r22
            r1 = r23
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r2 = r0.header
            int r2 = r2.getInnerClassCount()
            java.lang.String r3 = "ic_this_class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            int[] r3 = r0.decodeBandInt(r3, r1, r4, r2)
            java.lang.String[] r4 = r0.cpClass
            java.lang.String[] r4 = r0.getReferences(r3, r4)
            java.lang.String r5 = "ic_flags"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r2 = r0.decodeBandInt(r5, r1, r6, r2)
            int r5 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countBit16(r2)
            java.lang.String r6 = "ic_outer_class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r6 = r0.decodeBandInt(r6, r1, r7, r5)
            java.lang.String[] r7 = new java.lang.String[r5]
            r8 = 0
            r9 = r8
        L30:
            r10 = 0
            if (r9 >= r5) goto L45
            r11 = r6[r9]
            if (r11 != 0) goto L3a
            r7[r9] = r10
            goto L42
        L3a:
            java.lang.String[] r10 = r0.cpClass
            int r11 = r11 + (-1)
            r10 = r10[r11]
            r7[r9] = r10
        L42:
            int r9 = r9 + 1
            goto L30
        L45:
            java.lang.String r9 = "ic_name"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r0.decodeBandInt(r9, r1, r11, r5)
            java.lang.String[] r9 = new java.lang.String[r5]
            r11 = r8
        L50:
            if (r11 >= r5) goto L64
            r12 = r1[r11]
            if (r12 != 0) goto L59
            r9[r11] = r10
            goto L61
        L59:
            java.lang.String[] r13 = r0.cpUTF8
            int r12 = r12 + (-1)
            r12 = r13[r12]
            r9[r11] = r12
        L61:
            int r11 = r11 + 1
            goto L50
        L64:
            int r5 = r4.length
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r5 = new org.apache.commons.compress.harmony.unpack200.IcTuple[r5]
            r0.icAll = r5
            r5 = r8
        L6a:
            int r11 = r4.length
            if (r8 >= r11) goto La6
            r12 = r4[r8]
            r13 = r2[r8]
            r16 = r3[r8]
            r11 = 65536(0x10000, float:9.1835E-41)
            r11 = r11 & r13
            if (r11 == 0) goto L8d
            r11 = r7[r5]
            r14 = r9[r5]
            r15 = r6[r5]
            int r15 = r15 + (-1)
            r17 = r1[r5]
            int r17 = r17 + (-1)
            int r5 = r5 + 1
            r18 = r17
            r17 = r15
            r15 = r14
            r14 = r11
            goto L94
        L8d:
            r11 = -1
            r14 = r10
            r15 = r14
            r17 = r11
            r18 = r17
        L94:
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r11 = r0.icAll
            org.apache.commons.compress.harmony.unpack200.IcTuple r20 = new org.apache.commons.compress.harmony.unpack200.IcTuple
            r21 = r11
            r11 = r20
            r19 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r21[r8] = r20
            int r8 = r8 + 1
            goto L6a
        La6:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r0 = r7.getIcTuples()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.length
            r1.<init>(r2)
            r7.thisClassToTuple = r1
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.length
            r1.<init>(r2)
            r7.outerClassToTuples = r1
            int r1 = r0.length
            r2 = 0
        L16:
            if (r2 >= r1) goto L57
            r3 = r0[r2]
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.unpack200.IcTuple> r4 = r7.thisClassToTuple
            java.lang.String r5 = r3.thisClassString()
            java.lang.Object r4 = r4.put(r5, r3)
            if (r4 != 0) goto L4f
            boolean r4 = r3.isAnonymous()
            if (r4 != 0) goto L32
            boolean r4 = r3.outerIsAnonymous()
            if (r4 == 0) goto L38
        L32:
            boolean r4 = r3.nestedExplicitFlagSet()
            if (r4 == 0) goto L4c
        L38:
            java.lang.String r4 = r3.outerClassString()
            java.util.Map<java.lang.String, java.util.List<org.apache.commons.compress.harmony.unpack200.IcTuple>> r5 = r7.outerClassToTuples
            org.apache.commons.compress.harmony.unpack200.IcBands$$ExternalSyntheticLambda0 r6 = new org.apache.commons.compress.harmony.unpack200.IcBands$$ExternalSyntheticLambda0
            r6.<init>()
            java.lang.Object r4 = r5.computeIfAbsent(r4, r6)
            java.util.List r4 = (java.util.List) r4
            r4.add(r3)
        L4c:
            int r2 = r2 + 1
            goto L16
        L4f:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Collision detected in <thisClassString, IcTuple> mapping. There are at least two inner clases with the same name."
            r0.<init>(r1)
            throw r0
        L57:
            return
    }
}
