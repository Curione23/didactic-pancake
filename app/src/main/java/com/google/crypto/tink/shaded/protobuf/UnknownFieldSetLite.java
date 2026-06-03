package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class UnknownFieldSetLite {
    private static final com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite DEFAULT_INSTANCE = null;
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private java.lang.Object[] objects;
    private int[] tags;

    static {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.DEFAULT_INSTANCE = r0
            return
    }

    private UnknownFieldSetLite() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 1
            r3 = 0
            r4.<init>(r3, r1, r0, r2)
            return
    }

    private UnknownFieldSetLite(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.memoizedSerializedSize = r0
            r1.count = r2
            r1.tags = r3
            r1.objects = r4
            r1.isMutable = r5
            return
    }

    private void ensureCapacity(int r4) {
            r3 = this;
            int[] r0 = r3.tags
            int r1 = r0.length
            if (r4 <= r1) goto L21
            int r1 = r3.count
            int r2 = r1 / 2
            int r1 = r1 + r2
            if (r1 >= r4) goto Ld
            goto Le
        Ld:
            r4 = r1
        Le:
            r1 = 8
            if (r4 >= r1) goto L13
            r4 = r1
        L13:
            int[] r0 = java.util.Arrays.copyOf(r0, r4)
            r3.tags = r0
            java.lang.Object[] r0 = r3.objects
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.objects = r4
        L21:
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.DEFAULT_INSTANCE
            return r0
    }

    private static int hashCode(int[] r3, int r4) {
            r0 = 17
            r1 = 0
        L3:
            if (r1 >= r4) goto Ld
            int r0 = r0 * 31
            r2 = r3[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L3
        Ld:
            return r0
    }

    private static int hashCode(java.lang.Object[] r3, int r4) {
            r0 = 17
            r1 = 0
        L3:
            if (r1 >= r4) goto L11
            int r0 = r0 * 31
            r2 = r3[r1]
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L3
        L11:
            return r0
    }

    private com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws java.io.IOException {
            r1 = this;
        L0:
            int r0 = r2.readTag()
            if (r0 == 0) goto Lc
            boolean r0 = r1.mergeFieldFrom(r0, r2)
            if (r0 != 0) goto L0
        Lc:
            return r1
    }

    static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mutableCopyOf(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r6, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r7) {
            int r0 = r6.count
            int r1 = r7.count
            int r0 = r0 + r1
            int[] r1 = r6.tags
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r7.tags
            int r3 = r6.count
            int r4 = r7.count
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r6.objects
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r7.objects
            int r6 = r6.count
            int r7 = r7.count
            java.lang.System.arraycopy(r3, r5, r2, r6, r7)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r6 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r7 = 1
            r6.<init>(r0, r1, r2, r7)
            return r6
    }

    static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite newInstance() {
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r0.<init>()
            return r0
    }

    private static boolean objectsEquals(java.lang.Object[] r4, java.lang.Object[] r5, int r6) {
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r6) goto L12
            r2 = r4[r1]
            r3 = r5[r1]
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lf
            return r0
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            r4 = 1
            return r4
    }

    private static boolean tagsEquals(int[] r4, int[] r5, int r6) {
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r6) goto Le
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto Lb
            return r0
        Lb:
            int r1 = r1 + 1
            goto L2
        Le:
            r4 = 1
            return r4
    }

    private static void writeField(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r2)
            int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r2)
            if (r2 == 0) goto L5a
            r1 = 1
            if (r2 == r1) goto L50
            r1 = 2
            if (r2 == r1) goto L4a
            r1 = 3
            if (r2 == r1) goto L2a
            r1 = 5
            if (r2 != r1) goto L20
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r4.writeFixed32(r0, r2)
            goto L63
        L20:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            r2.<init>(r3)
            throw r2
        L2a:
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r2 = r4.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.ASCENDING
            if (r2 != r1) goto L3e
            r4.writeStartGroup(r0)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r3
            r3.writeTo(r4)
            r4.writeEndGroup(r0)
            goto L63
        L3e:
            r4.writeEndGroup(r0)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r3
            r3.writeTo(r4)
            r4.writeStartGroup(r0)
            goto L63
        L4a:
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r4.writeBytes(r0, r3)
            goto L63
        L50:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r4.writeFixed64(r0, r2)
            goto L63
        L5a:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r4.writeInt64(r0, r2)
        L63:
            return
    }

    void checkMutable() {
            r1 = this;
            boolean r0 = r1.isMutable
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 != 0) goto L8
            return r1
        L8:
            boolean r2 = r6 instanceof com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            if (r2 != 0) goto Ld
            return r1
        Ld:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r6 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r6
            int r2 = r5.count
            int r3 = r6.count
            if (r2 != r3) goto L2d
            int[] r3 = r5.tags
            int[] r4 = r6.tags
            boolean r2 = tagsEquals(r3, r4, r2)
            if (r2 == 0) goto L2d
            java.lang.Object[] r2 = r5.objects
            java.lang.Object[] r6 = r6.objects
            int r3 = r5.count
            boolean r6 = objectsEquals(r2, r6, r3)
            if (r6 != 0) goto L2c
            goto L2d
        L2c:
            return r0
        L2d:
            return r1
    }

    public int getSerializedSize() {
            r6 = this;
            int r0 = r6.memoizedSerializedSize
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = r0
        L8:
            int r2 = r6.count
            if (r0 >= r2) goto L7c
            int[] r2 = r6.tags
            r2 = r2[r0]
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r2)
            int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r2)
            if (r2 == 0) goto L6a
            r4 = 1
            if (r2 == r4) goto L5b
            r4 = 2
            if (r2 == r4) goto L50
            r5 = 3
            if (r2 == r5) goto L3f
            r4 = 5
            if (r2 != r4) goto L35
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r3, r2)
            goto L78
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            r0.<init>(r1)
            throw r0
        L3f:
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r3)
            int r2 = r2 * r4
            java.lang.Object[] r3 = r6.objects
            r3 = r3[r0]
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r3
            int r3 = r3.getSerializedSize()
            int r2 = r2 + r3
            goto L78
        L50:
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r3, r2)
            goto L78
        L5b:
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r3, r4)
            goto L78
        L6a:
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r3, r4)
        L78:
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L8
        L7c:
            r6.memoizedSerializedSize = r1
            return r1
    }

    public int getSerializedSizeAsMessageSet() {
            r4 = this;
            int r0 = r4.memoizedSerializedSize
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = r0
        L8:
            int r2 = r4.count
            if (r0 >= r2) goto L22
            int[] r2 = r4.tags
            r2 = r2[r0]
            int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r2)
            java.lang.Object[] r3 = r4.objects
            r3 = r3[r0]
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeRawMessageSetExtensionSize(r2, r3)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L8
        L22:
            r4.memoizedSerializedSize = r1
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.count
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r2 = r3.tags
            int r0 = hashCode(r2, r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object[] r0 = r3.objects
            int r2 = r3.count
            int r0 = hashCode(r0, r2)
            int r1 = r1 + r0
            return r1
    }

    public void makeImmutable() {
            r1 = this;
            r0 = 0
            r1.isMutable = r0
            return
    }

    boolean mergeFieldFrom(int r6, com.google.crypto.tink.shaded.protobuf.CodedInputStream r7) throws java.io.IOException {
            r5 = this;
            r5.checkMutable()
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r6)
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r6)
            r2 = 1
            if (r1 == 0) goto L56
            if (r1 == r2) goto L4a
            r3 = 2
            if (r1 == r3) goto L42
            r3 = 3
            r4 = 4
            if (r1 == r3) goto L2f
            if (r1 == r4) goto L2d
            r0 = 5
            if (r1 != r0) goto L28
            int r7 = r7.readFixed32()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.storeField(r6, r7)
            return r2
        L28:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r6
        L2d:
            r6 = 0
            return r6
        L2f:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r1.<init>()
            r1.mergeFrom(r7)
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r0, r4)
            r7.checkLastTagWas(r0)
            r5.storeField(r6, r1)
            return r2
        L42:
            com.google.crypto.tink.shaded.protobuf.ByteString r7 = r7.readBytes()
            r5.storeField(r6, r7)
            return r2
        L4a:
            long r0 = r7.readFixed64()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r5.storeField(r6, r7)
            return r2
        L56:
            long r0 = r7.readInt64()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r5.storeField(r6, r7)
            return r2
    }

    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeFrom(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r7) {
            r6 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = getDefaultInstance()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lb
            return r6
        Lb:
            r6.checkMutable()
            int r0 = r6.count
            int r1 = r7.count
            int r0 = r0 + r1
            r6.ensureCapacity(r0)
            int[] r1 = r7.tags
            int[] r2 = r6.tags
            int r3 = r6.count
            int r4 = r7.count
            r5 = 0
            java.lang.System.arraycopy(r1, r5, r2, r3, r4)
            java.lang.Object[] r1 = r7.objects
            java.lang.Object[] r2 = r6.objects
            int r3 = r6.count
            int r7 = r7.count
            java.lang.System.arraycopy(r1, r5, r2, r3, r7)
            r6.count = r0
            return r6
    }

    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeLengthDelimitedField(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            r1.checkMutable()
            if (r2 == 0) goto Le
            r0 = 2
            int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r2, r0)
            r1.storeField(r2, r3)
            return r1
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Zero is not a valid field number."
            r2.<init>(r3)
            throw r2
    }

    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite mergeVarintField(int r3, int r4) {
            r2 = this;
            r2.checkMutable()
            if (r3 == 0) goto L13
            r0 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r0)
            long r0 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2.storeField(r3, r4)
            return r2
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Zero is not a valid field number."
            r3.<init>(r4)
            throw r3
    }

    final void printWithIndent(java.lang.StringBuilder r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.count
            if (r0 >= r1) goto L1b
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            com.google.crypto.tink.shaded.protobuf.MessageLiteToString.printField(r4, r5, r1, r2)
            int r0 = r0 + 1
            goto L1
        L1b:
            return
    }

    void storeField(int r3, java.lang.Object r4) {
            r2 = this;
            r2.checkMutable()
            int r0 = r2.count
            int r0 = r0 + 1
            r2.ensureCapacity(r0)
            int[] r0 = r2.tags
            int r1 = r2.count
            r0[r1] = r3
            java.lang.Object[] r3 = r2.objects
            r3[r1] = r4
            int r1 = r1 + 1
            r2.count = r1
            return
    }

    public void writeAsMessageSetTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.count
            if (r0 >= r1) goto L19
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            r4.writeRawMessageSetExtension(r1, r2)
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    void writeAsMessageSetTo(com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.DESCENDING
            if (r0 != r1) goto L20
            int r0 = r3.count
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L37
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            r4.writeMessageSetItem(r1, r2)
            int r0 = r0 + (-1)
            goto Lc
        L20:
            r0 = 0
        L21:
            int r1 = r3.count
            if (r0 >= r1) goto L37
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            r4.writeMessageSetItem(r1, r2)
            int r0 = r0 + 1
            goto L21
        L37:
            return
    }

    public void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r5.count
            if (r0 >= r1) goto L6b
            int[] r1 = r5.tags
            r1 = r1[r0]
            int r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r1)
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r1)
            if (r1 == 0) goto L5b
            r3 = 1
            if (r1 == r3) goto L4d
            r3 = 2
            if (r1 == r3) goto L43
            r3 = 3
            if (r1 == r3) goto L32
            r3 = 5
            if (r1 != r3) goto L2d
            java.lang.Object[] r1 = r5.objects
            r1 = r1[r0]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6.writeFixed32(r2, r1)
            goto L68
        L2d:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r6
        L32:
            r6.writeTag(r2, r3)
            java.lang.Object[] r1 = r5.objects
            r1 = r1[r0]
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r1.writeTo(r6)
            r1 = 4
            r6.writeTag(r2, r1)
            goto L68
        L43:
            java.lang.Object[] r1 = r5.objects
            r1 = r1[r0]
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = (com.google.crypto.tink.shaded.protobuf.ByteString) r1
            r6.writeBytes(r2, r1)
            goto L68
        L4d:
            java.lang.Object[] r1 = r5.objects
            r1 = r1[r0]
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r6.writeFixed64(r2, r3)
            goto L68
        L5b:
            java.lang.Object[] r1 = r5.objects
            r1 = r1[r0]
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r6.writeUInt64(r2, r3)
        L68:
            int r0 = r0 + 1
            goto L1
        L6b:
            return
    }

    public void writeTo(com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.count
            if (r0 != 0) goto L5
            return
        L5:
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.ASCENDING
            if (r0 != r1) goto L20
            r0 = 0
        Le:
            int r1 = r3.count
            if (r0 >= r1) goto L34
            int[] r1 = r3.tags
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            writeField(r1, r2, r4)
            int r0 = r0 + 1
            goto Le
        L20:
            int r0 = r3.count
            int r0 = r0 + (-1)
        L24:
            if (r0 < 0) goto L34
            int[] r1 = r3.tags
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            writeField(r1, r2, r4)
            int r0 = r0 + (-1)
            goto L24
        L34:
            return
    }
}
