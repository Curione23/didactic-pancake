package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class ProtobufArrayList<E> extends com.google.crypto.tink.shaded.protobuf.AbstractProtobufList<E> implements java.util.RandomAccess {
    private static final com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<java.lang.Object> EMPTY_LIST = null;
    private E[] array;
    private int size;

    static {
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r0 = new com.google.crypto.tink.shaded.protobuf.ProtobufArrayList
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.EMPTY_LIST = r0
            r0.makeImmutable()
            return
    }

    ProtobufArrayList() {
            r2 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private ProtobufArrayList(E[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.array = r1
            r0.size = r2
            return
    }

    private static <E> E[] createArray(int r0) {
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }

    public static <E> com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<E> emptyList() {
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<java.lang.Object> r0 = com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.EMPTY_LIST
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int r5, E r6) {
            r4 = this;
            r4.ensureIsMutable()
            if (r5 < 0) goto L42
            int r0 = r4.size
            if (r5 > r0) goto L42
            E[] r1 = r4.array
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r2, r0)
            goto L31
        L15:
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            java.lang.Object[] r0 = createArray(r0)
            E[] r1 = r4.array
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            E[] r1 = r4.array
            int r2 = r5 + 1
            int r3 = r4.size
            int r3 = r3 - r5
            java.lang.System.arraycopy(r1, r5, r0, r2, r3)
            r4.array = r0
        L31:
            E[] r0 = r4.array
            r0[r5] = r6
            int r5 = r4.size
            int r5 = r5 + 1
            r4.size = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L42:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.makeOutOfBoundsExceptionMessage(r5)
            r6.<init>(r5)
            throw r6
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r5) {
            r4 = this;
            r4.ensureIsMutable()
            int r0 = r4.size
            E[] r1 = r4.array
            int r2 = r1.length
            r3 = 1
            if (r0 != r2) goto L16
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.array = r0
        L16:
            E[] r0 = r4.array
            int r1 = r4.size
            int r2 = r1 + 1
            r4.size = r2
            r0[r1] = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r2) {
            r1 = this;
            r1.ensureIndexInRange(r2)
            E[] r0 = r1.array
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList mutableCopyWithCapacity(int r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r1 = r0.mutableCopyWithCapacity(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public com.google.crypto.tink.shaded.protobuf.ProtobufArrayList<E> mutableCopyWithCapacity(int r3) {
            r2 = this;
            int r0 = r2.size
            if (r3 < r0) goto L12
            E[] r0 = r2.array
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r0 = new com.google.crypto.tink.shaded.protobuf.ProtobufArrayList
            int r1 = r2.size
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int r5) {
            r4 = this;
            r4.ensureIsMutable()
            r4.ensureIndexInRange(r5)
            E[] r0 = r4.array
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
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            r2.ensureIsMutable()
            r2.ensureIndexInRange(r3)
            E[] r0 = r2.array
            r1 = r0[r3]
            r0[r3] = r4
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
