package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class FloatArrayList extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<java.lang.Float> implements com.google.crypto.tink.shaded.protobuf.Internal.FloatList, java.util.RandomAccess, com.google.crypto.tink.shaded.protobuf.PrimitiveNonBoxingCollection {
    private static final com.google.crypto.tink.shaded.protobuf.FloatArrayList EMPTY_LIST = null;
    private float[] array;
    private int size;

    static {
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = new com.google.crypto.tink.shaded.protobuf.FloatArrayList
            r1 = 0
            float[] r2 = new float[r1]
            r0.<init>(r2, r1)
            com.google.crypto.tink.shaded.protobuf.FloatArrayList.EMPTY_LIST = r0
            r0.makeImmutable()
            return
    }

    FloatArrayList() {
            r2 = this;
            r0 = 10
            float[] r0 = new float[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private FloatArrayList(float[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.size = r2
            return
    }

    private void addFloat(int r5, float r6) {
            r4 = this;
            r4.ensureIsMutable()
            if (r5 < 0) goto L3e
            int r0 = r4.size
            if (r5 > r0) goto L3e
            float[] r1 = r4.array
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r2, r0)
            goto L2d
        L15:
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            float[] r0 = new float[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            float[] r1 = r4.array
            int r2 = r5 + 1
            int r3 = r4.size
            int r3 = r3 - r5
            java.lang.System.arraycopy(r1, r5, r0, r2, r3)
            r4.array = r0
        L2d:
            float[] r0 = r4.array
            r0[r5] = r6
            int r5 = r4.size
            int r5 = r5 + 1
            r4.size = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L3e:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.makeOutOfBoundsExceptionMessage(r5)
            r6.<init>(r5)
            throw r6
    }

    public static com.google.crypto.tink.shaded.protobuf.FloatArrayList emptyList() {
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = com.google.crypto.tink.shaded.protobuf.FloatArrayList.EMPTY_LIST
            return r0
    }

    private void ensureIndexInRange(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.size
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.makeOutOfBoundsExceptionMessage(r2)
            r0.<init>(r2)
            throw r0
    }

    private java.lang.String makeOutOfBoundsExceptionMessage(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Size:"
            java.lang.StringBuilder r3 = r3.append(r0)
            int r0 = r2.size
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public void add(int r1, java.lang.Float r2) {
            r0 = this;
            float r2 = r2.floatValue()
            r0.addFloat(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            r0.add(r1, r2)
            return
    }

    public boolean add(java.lang.Float r1) {
            r0 = this;
            float r1 = r1.floatValue()
            r0.addFloat(r1)
            r1 = 1
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Float r1 = (java.lang.Float) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.Float> r6) {
            r5 = this;
            r5.ensureIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r6)
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList
            if (r0 != 0) goto Lf
            boolean r6 = super.addAll(r6)
            return r6
        Lf:
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r6 = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) r6
            int r0 = r6.size
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            int r2 = r5.size
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L3f
            int r2 = r2 + r0
            float[] r0 = r5.array
            int r3 = r0.length
            if (r2 <= r3) goto L2b
            float[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.array = r0
        L2b:
            float[] r0 = r6.array
            float[] r3 = r5.array
            int r4 = r5.size
            int r6 = r6.size
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.size = r2
            int r6 = r5.modCount
            r0 = 1
            int r6 = r6 + r0
            r5.modCount = r6
            return r0
        L3f:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public void addFloat(float r5) {
            r4 = this;
            r4.ensureIsMutable()
            int r0 = r4.size
            float[] r1 = r4.array
            int r2 = r1.length
            if (r0 != r2) goto L18
            int r2 = r0 * 3
            int r2 = r2 / 2
            int r2 = r2 + 1
            float[] r2 = new float[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.array = r2
        L18:
            float[] r0 = r4.array
            int r1 = r4.size
            int r2 = r1 + 1
            r4.size = r2
            r0[r1] = r5
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r6 = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) r6
            int r1 = r5.size
            int r2 = r6.size
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            float[] r6 = r6.array
            r1 = r3
        L1a:
            int r2 = r5.size
            if (r1 >= r2) goto L32
            float[] r2 = r5.array
            r2 = r2[r1]
            int r2 = java.lang.Float.floatToIntBits(r2)
            r4 = r6[r1]
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r2 == r4) goto L2f
            return r3
        L2f:
            int r1 = r1 + 1
            goto L1a
        L32:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Float get(int r1) {
            r0 = this;
            float r1 = r0.getFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Float r1 = r0.get(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public float getFloat(int r2) {
            r1 = this;
            r1.ensureIndexInRange(r2)
            float[] r0 = r1.array
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.size
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            float[] r2 = r3.array
            r2 = r2[r1]
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Float
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r0 = r4.size()
            r2 = 0
        L11:
            if (r2 >= r0) goto L1f
            float[] r3 = r4.array
            r3 = r3[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1c
            return r2
        L1c:
            int r2 = r2 + 1
            goto L11
        L1f:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity(int r3) {
            r2 = this;
            int r0 = r2.size
            if (r3 < r0) goto L12
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = new com.google.crypto.tink.shaded.protobuf.FloatArrayList
            float[] r1 = r2.array
            float[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.size
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<java.lang.Float> mutableCopyWithCapacity2(int r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$FloatList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public java.lang.Float remove(int r5) {
            r4 = this;
            r4.ensureIsMutable()
            r4.ensureIndexInRange(r5)
            float[] r0 = r4.array
            r1 = r0[r5]
            int r2 = r4.size
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.size
            int r5 = r5 + (-1)
            r4.size = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            return r5
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Float r1 = r0.remove(r1)
            return r1
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r3, int r4) {
            r2 = this;
            r2.ensureIsMutable()
            if (r4 < r3) goto L1a
            float[] r0 = r2.array
            int r1 = r2.size
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.size
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.size = r0
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return
        L1a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "toIndex < fromIndex"
            r3.<init>(r4)
            throw r3
    }

    public java.lang.Float set(int r1, java.lang.Float r2) {
            r0 = this;
            float r2 = r2.floatValue()
            float r1 = r0.setFloat(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            java.lang.Float r1 = r0.set(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.FloatList
    public float setFloat(int r3, float r4) {
            r2 = this;
            r2.ensureIsMutable()
            r2.ensureIndexInRange(r3)
            float[] r0 = r2.array
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
