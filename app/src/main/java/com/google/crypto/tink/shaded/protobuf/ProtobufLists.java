package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class ProtobufLists {
    private ProtobufLists() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList emptyBooleanList() {
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList r0 = com.google.crypto.tink.shaded.protobuf.BooleanArrayList.emptyList()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList emptyDoubleList() {
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList r0 = com.google.crypto.tink.shaded.protobuf.DoubleArrayList.emptyList()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.FloatList emptyFloatList() {
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = com.google.crypto.tink.shaded.protobuf.FloatArrayList.emptyList()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.IntList emptyIntList() {
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = com.google.crypto.tink.shaded.protobuf.IntArrayList.emptyList()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.LongList emptyLongList() {
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = com.google.crypto.tink.shaded.protobuf.LongArrayList.emptyList()
            return r0
    }

    public static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r0 = com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.emptyList()
            return r0
    }

    public static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto Lb
        L9:
            int r0 = r0 * 2
        Lb:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = r1.mutableCopyWithCapacity(r0)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList newBooleanList() {
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList r0 = new com.google.crypto.tink.shaded.protobuf.BooleanArrayList
            r0.<init>()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList newDoubleList() {
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList r0 = new com.google.crypto.tink.shaded.protobuf.DoubleArrayList
            r0.<init>()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.FloatList newFloatList() {
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = new com.google.crypto.tink.shaded.protobuf.FloatArrayList
            r0.<init>()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.IntList newIntList() {
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = new com.google.crypto.tink.shaded.protobuf.IntArrayList
            r0.<init>()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.LongList newLongList() {
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = new com.google.crypto.tink.shaded.protobuf.LongArrayList
            r0.<init>()
            return r0
    }
}
