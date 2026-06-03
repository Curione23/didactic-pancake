package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class MessageSetSchema<T> implements com.google.crypto.tink.shaded.protobuf.Schema<T> {
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
            r0 = this;
            r0.<init>()
            r0.unknownFieldSchema = r1
            boolean r1 = r2.hasExtensions(r3)
            r0.hasExtensions = r1
            r0.extensionSchema = r2
            r0.defaultInstance = r3
            return
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            int r1 = r1.getSerializedSizeAsMessageSet(r2)
            return r1
    }

    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r10, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r11, T r12, com.google.crypto.tink.shaded.protobuf.Reader r13, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r14) throws java.io.IOException {
            r9 = this;
            java.lang.Object r7 = r10.getBuilderFromMessage(r12)
            com.google.crypto.tink.shaded.protobuf.FieldSet r8 = r11.getMutableExtensions(r12)
        L8:
            int r0 = r13.getFieldNumber()     // Catch: java.lang.Throwable -> L27
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L15
            r10.setBuilderToMessage(r12, r7)
            return
        L15:
            r0 = r9
            r1 = r13
            r2 = r14
            r3 = r11
            r4 = r8
            r5 = r10
            r6 = r7
            boolean r0 = r0.parseMessageSetItemOrUnknownField(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L23
            goto L8
        L23:
            r10.setBuilderToMessage(r12, r7)
            return
        L27:
            r11 = move-exception
            r10.setBuilderToMessage(r12, r7)
            throw r11
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSetSchema<T> newSchema(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2, com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
            com.google.crypto.tink.shaded.protobuf.MessageSetSchema r0 = new com.google.crypto.tink.shaded.protobuf.MessageSetSchema
            r0.<init>(r1, r2, r3)
            return r0
    }

    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(com.google.crypto.tink.shaded.protobuf.Reader r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r9, com.google.crypto.tink.shaded.protobuf.FieldSet<ET> r10, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r11, UB r12) throws java.io.IOException {
            r6 = this;
            int r0 = r7.getTag()
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
            r2 = 1
            if (r0 == r1) goto L2a
            int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r0)
            r3 = 2
            if (r1 != r3) goto L25
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r6.defaultInstance
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r0)
            java.lang.Object r0 = r9.findExtensionByNumber(r8, r1, r0)
            if (r0 == 0) goto L20
            r9.parseLengthPrefixedMessageSetItem(r7, r0, r8, r10)
            return r2
        L20:
            boolean r7 = r11.mergeOneFieldFrom(r12, r7)
            return r7
        L25:
            boolean r7 = r7.skipField()
            return r7
        L2a:
            r0 = 0
            r1 = 0
            r3 = r1
            r1 = r0
        L2e:
            int r4 = r7.getFieldNumber()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L38
            goto L60
        L38:
            int r4 = r7.getTag()
            int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG
            if (r4 != r5) goto L4b
            int r3 = r7.readUInt32()
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r6.defaultInstance
            java.lang.Object r0 = r9.findExtensionByNumber(r8, r0, r3)
            goto L2e
        L4b:
            int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG
            if (r4 != r5) goto L5a
            if (r0 == 0) goto L55
            r9.parseLengthPrefixedMessageSetItem(r7, r0, r8, r10)
            goto L2e
        L55:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r7.readBytes()
            goto L2e
        L5a:
            boolean r4 = r7.skipField()
            if (r4 != 0) goto L2e
        L60:
            int r7 = r7.getTag()
            int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
            if (r7 != r4) goto L74
            if (r1 == 0) goto L73
            if (r0 == 0) goto L70
            r9.parseMessageSetItem(r1, r0, r8, r10)
            goto L73
        L70:
            r11.addLengthDelimited(r12, r3, r1)
        L73:
            return r2
        L74:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r7
    }

    private <UT, UB> void writeUnknownFieldsHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r1, T r2, com.google.crypto.tink.shaded.protobuf.Writer r3) throws java.io.IOException {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            r1.writeAsMessageSetTo(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public boolean equals(T r3, T r4) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r3)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r2.unknownFieldSchema
            java.lang.Object r1 = r1.getFromMessage(r4)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            boolean r0 = r2.hasExtensions
            if (r0 == 0) goto L29
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r0.getExtensions(r3)
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r4 = r0.getExtensions(r4)
            boolean r3 = r3.equals(r4)
            return r3
        L29:
            r3 = 1
            return r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int getSerializedSize(T r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            int r0 = r2.getUnknownFieldsSerializedSize(r0, r3)
            boolean r1 = r2.hasExtensions
            if (r1 == 0) goto L15
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r1 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r1.getExtensions(r3)
            int r3 = r3.getMessageSetSerializedSize()
            int r0 = r0 + r3
        L15:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int hashCode(T r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.hasExtensions
            if (r1 == 0) goto L1b
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r1 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r1.getExtensions(r3)
            int r0 = r0 * 53
            int r3 = r3.hashCode()
            int r0 = r0 + r3
        L1b:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean isInitialized(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r2 = r0.getExtensions(r2)
            boolean r2 = r2.isInitialized()
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void makeImmutable(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r1.unknownFieldSchema
            r0.makeImmutable(r2)
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            r0.makeImmutable(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r7, com.google.crypto.tink.shaded.protobuf.Reader r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r6.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r6.extensionSchema
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.mergeFromHelper(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r2, T r3) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r1.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeUnknownFields(r0, r2, r3)
            boolean r0 = r1.hasExtensions
            if (r0 == 0) goto Le
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeExtensions(r0, r2, r3)
        Le:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r15) throws java.io.IOException {
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.google.crypto.tink.shaded.protobuf.FieldSet r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r12, r13, r15)
            int r13 = r15.int1
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r10.extensionSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3 = r15.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = r10.defaultInstance
            int r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r13)
            java.lang.Object r2 = r2.findExtensionByNumber(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L5b
            com.google.crypto.tink.shaded.protobuf.Protobuf r13 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r8.getMessageDefaultInstance()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r13 = r13.schemaFor(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageField(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r8.descriptor
            java.lang.Object r3 = r15.object1
            r11.setField(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeUnknownField(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.skipField(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r12, r4, r15)
            int r6 = r15.int1
            int r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.Protobuf r6 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.MessageLite r7 = r2.getMessageDefaultInstance()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r6.schemaFor(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageField(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r6 = r2.descriptor
            java.lang.Object r7 = r15.object1
            r11.setField(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r12, r4, r15)
            java.lang.Object r3 = r15.object1
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r12, r4, r15)
            int r13 = r15.int1
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r10.extensionSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6 = r15.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.MessageLite r7 = r10.defaultInstance
            java.lang.Object r2 = r2.findExtensionByNumber(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.skipField(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r13, r5)
            r1.storeField(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r11 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public T newInstance() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.defaultInstance
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r1 == 0) goto Ld
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.newMutableInstance()
            return r0
        Ld:
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.newBuilderForType()
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.buildPartial()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void writeTo(T r6, com.google.crypto.tink.shaded.protobuf.Writer r7) throws java.io.IOException {
            r5 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r5.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.getExtensions(r6)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = r2.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r3 != r4) goto L52
            boolean r3 = r2.isRepeated()
            if (r3 != 0) goto L52
            boolean r3 = r2.isPacked()
            if (r3 != 0) goto L52
            boolean r3 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField.LazyEntry
            if (r3 == 0) goto L46
            int r2 = r2.getNumber()
            com.google.crypto.tink.shaded.protobuf.LazyField$LazyEntry r1 = (com.google.crypto.tink.shaded.protobuf.LazyField.LazyEntry) r1
            com.google.crypto.tink.shaded.protobuf.LazyField r1 = r1.getField()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            r7.writeMessageSetItem(r2, r1)
            goto La
        L46:
            int r2 = r2.getNumber()
            java.lang.Object r1 = r1.getValue()
            r7.writeMessageSetItem(r2, r1)
            goto La
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Found invalid MessageSet item."
            r6.<init>(r7)
            throw r6
        L5a:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r5.unknownFieldSchema
            r5.writeUnknownFieldsHelper(r0, r6, r7)
            return
    }
}
