package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    UnknownFieldSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract void addFixed32(B r1, int r2, int r3);

    abstract void addFixed64(B r1, int r2, long r3);

    abstract void addGroup(B r1, int r2, T r3);

    abstract void addLengthDelimited(B r1, int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3);

    abstract void addVarint(B r1, int r2, long r3);

    abstract B getBuilderFromMessage(java.lang.Object r1);

    abstract T getFromMessage(java.lang.Object r1);

    abstract int getSerializedSize(T r1);

    abstract int getSerializedSizeAsMessageSet(T r1);

    abstract void makeImmutable(java.lang.Object r1);

    abstract T merge(T r1, T r2);

    final void mergeFrom(B r3, com.google.crypto.tink.shaded.protobuf.Reader r4) throws java.io.IOException {
            r2 = this;
        L0:
            int r0 = r4.getFieldNumber()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto Lf
            boolean r0 = r2.mergeOneFieldFrom(r3, r4)
            if (r0 != 0) goto L0
        Lf:
            return
    }

    final boolean mergeOneFieldFrom(B r6, com.google.crypto.tink.shaded.protobuf.Reader r7) throws java.io.IOException {
            r5 = this;
            int r0 = r7.getTag()
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r2 = 1
            if (r0 == 0) goto L5a
            if (r0 == r2) goto L52
            r3 = 2
            if (r0 == r3) goto L4a
            r3 = 3
            r4 = 4
            if (r0 == r3) goto L2c
            if (r0 == r4) goto L2a
            r3 = 5
            if (r0 != r3) goto L25
            int r7 = r7.readFixed32()
            r5.addFixed32(r6, r1, r7)
            return r2
        L25:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r6
        L2a:
            r6 = 0
            return r6
        L2c:
            java.lang.Object r0 = r5.newBuilder()
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r1, r4)
            r5.mergeFrom(r0, r7)
            int r7 = r7.getTag()
            if (r3 != r7) goto L45
            java.lang.Object r7 = r5.toImmutable(r0)
            r5.addGroup(r6, r1, r7)
            return r2
        L45:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r6
        L4a:
            com.google.crypto.tink.shaded.protobuf.ByteString r7 = r7.readBytes()
            r5.addLengthDelimited(r6, r1, r7)
            return r2
        L52:
            long r3 = r7.readFixed64()
            r5.addFixed64(r6, r1, r3)
            return r2
        L5a:
            long r3 = r7.readInt64()
            r5.addVarint(r6, r1, r3)
            return r2
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(java.lang.Object r1, B r2);

    abstract void setToMessage(java.lang.Object r1, T r2);

    abstract boolean shouldDiscardUnknownFields(com.google.crypto.tink.shaded.protobuf.Reader r1);

    abstract T toImmutable(B r1);

    abstract void writeAsMessageSetTo(T r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException;

    abstract void writeTo(T r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException;
}
