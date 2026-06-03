package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap;
    private int memoizedSerializedSize;
    protected com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite unknownFields;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static abstract class Builder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        protected Builder(MessageType r2) {
                r1 = this;
                r1.<init>()
                r1.defaultInstance = r2
                boolean r2 = r2.isMutable()
                if (r2 != 0) goto L12
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r1.newMutableInstance()
                r1.instance = r2
                return
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Default instance must be immutable."
                r2.<init>(r0)
                throw r2
        }

        private static <MessageType> void mergeFromInstance(MessageType r1, MessageType r2) {
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
                r0.mergeFrom(r1, r2)
                return
        }

        private MessageType newMutableInstance() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.defaultInstance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.newMutableInstance()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType build() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.buildPartial()
                boolean r1 = r0.isInitialized()
                if (r1 == 0) goto Lb
                return r0
            Lb:
                com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = newUninitializedMessageException(r0)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite build() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.build()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lb
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                return r0
            Lb:
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                r0.makeImmutable()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.buildPartial()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final BuilderType clear() {
                r2 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.defaultInstance
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lf
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.newMutableInstance()
                r2.instance = r0
                return r2
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Default instance must be immutable."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clear()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType clone() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.getDefaultInstanceForType()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.newBuilderForType()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r2.buildPartial()
                r0.instance = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ java.lang.Object mo709clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clone()
                return r0
        }

        protected final void copyOnWrite() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lb
                r1.copyOnWriteInternal()
            Lb:
                return
        }

        protected void copyOnWriteInternal() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.newMutableInstance()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                mergeFromInstance(r0, r1)
                r2.instance = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.defaultInstance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.internalMergeFrom(r1)
                return r1
        }

        protected BuilderType internalMergeFrom(MessageType r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
                r2 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                r1 = 0
                boolean r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.isInitialized(r0, r1)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r2 = this;
                r2.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.lang.RuntimeException -> L17
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance     // Catch: java.lang.RuntimeException -> L17
                com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)     // Catch: java.lang.RuntimeException -> L17
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance     // Catch: java.lang.RuntimeException -> L17
                com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.forCodedInput(r3)     // Catch: java.lang.RuntimeException -> L17
                r0.mergeFrom(r1, r3, r4)     // Catch: java.lang.RuntimeException -> L17
                return r2
            L17:
                r3 = move-exception
                java.lang.Throwable r4 = r3.getCause()
                boolean r4 = r4 instanceof java.io.IOException
                if (r4 == 0) goto L27
                java.lang.Throwable r3 = r3.getCause()
                java.io.IOException r3 = (java.io.IOException) r3
                throw r3
            L27:
                throw r3
        }

        public BuilderType mergeFrom(MessageType r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lb
                return r1
            Lb:
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                mergeFromInstance(r0, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r2 = r1.mergeFrom(r2, r3, r4, r0)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r9, int r10, int r11, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r12) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r8 = this;
                r8.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.io.IOException -> L1c java.lang.IndexOutOfBoundsException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2a
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r8.instance     // Catch: java.io.IOException -> L1c java.lang.IndexOutOfBoundsException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2a
                com.google.crypto.tink.shaded.protobuf.Schema r2 = r0.schemaFor(r1)     // Catch: java.io.IOException -> L1c java.lang.IndexOutOfBoundsException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2a
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r3 = r8.instance     // Catch: java.io.IOException -> L1c java.lang.IndexOutOfBoundsException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2a
                int r6 = r10 + r11
                com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers r7 = new com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers     // Catch: java.io.IOException -> L1c java.lang.IndexOutOfBoundsException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2a
                r7.<init>(r12)     // Catch: java.io.IOException -> L1c java.lang.IndexOutOfBoundsException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2a
                r4 = r9
                r5 = r10
                r2.mergeFrom(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L1c java.lang.IndexOutOfBoundsException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2a
                return r8
            L1c:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                java.lang.String r11 = "Reading from byte array should not throw IOException."
                r10.<init>(r11, r9)
                throw r10
            L25:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r9 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r9
            L2a:
                r9 = move-exception
                throw r9
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3, r4)
                return r1
        }
    }

    protected static class DefaultInstanceBasedParser<T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> extends com.google.crypto.tink.shaded.protobuf.AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T r1) {
                r0 = this;
                r0.<init>()
                r0.defaultInstance = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?> r0 = r1.defaultInstance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parsePartialFrom(r0, r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(byte[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?> r0 = r1.defaultInstance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$200(r0, r2, r3, r4, r5)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parsePartialFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.parsePartialFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Parser
        public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.parsePartialFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.parsePartialFrom(r1, r2, r3, r4)
                return r1
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
                r2 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
                boolean r1 = r0.isImmutable()
                if (r1 == 0) goto L16
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.clone()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r1
                r1.extensions = r0
            L16:
                return r0
        }

        private void verifyExtensionContainingType(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r2.getContainingTypeDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
                if (r2 != r0) goto Lb
                return
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
                r2.<init>(r0)
                throw r2
        }

        public final <Type> BuilderType addExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r3, Type r4) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r3)
                r2.verifyExtensionContainingType(r3)
                r2.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r2.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r3.descriptor
                java.lang.Object r3 = r3.singularToFieldSetType(r4)
                r0.addRepeatedField(r1, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lf
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                return r0
            Lf:
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
                r0.makeImmutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.buildPartial()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = r1.buildPartial()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = r1.buildPartial()
                return r0
        }

        public final BuilderType clearExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, ?> r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r2)
                r1.verifyExtensionContainingType(r2)
                r1.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r1.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r2.descriptor
                r0.clearField(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
                r2 = this;
                super.copyOnWriteInternal()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet()
                if (r0 == r1) goto L1f
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r1
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r1.clone()
                r0.extensions = r1
            L1f:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                java.lang.Object r2 = r0.getExtension(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r2, int r3) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                java.lang.Object r2 = r0.getExtension(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                int r2 = r0.getExtensionCount(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                boolean r2 = r0.hasExtension(r2)
                return r2
        }

        void internalSetExtensionSet(com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                r0.extensions = r2
                return
        }

        public final <Type> BuilderType setExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r3, int r4, Type r5) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r3)
                r2.verifyExtensionContainingType(r3)
                r2.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r2.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r3.descriptor
                java.lang.Object r3 = r3.singularToFieldSetType(r5)
                r0.setRepeatedField(r1, r4, r3)
                return r2
        }

        public final <Type> BuilderType setExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r3, Type r4) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r3)
                r2.verifyExtensionContainingType(r3)
                r2.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r2.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r3.descriptor
                java.lang.Object r3 = r3.toFieldSetType(r4)
                r0.setField(r1, r3)
                return r2
        }
    }

    public static abstract class ExtendableMessage<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions;

        protected class ExtensionWriter {
            private final java.util.Iterator<java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> iter;
            private final boolean messageSetWireFormat;
            private java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next;
            final /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage this$0;

            private ExtensionWriter(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage r2, boolean r3) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r2 = r2.extensions
                    java.util.Iterator r2 = r2.iterator()
                    r1.iter = r2
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L1b
                    java.lang.Object r2 = r2.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    r1.next = r2
                L1b:
                    r1.messageSetWireFormat = r3
                    return
            }

            /* synthetic */ ExtensionWriter(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage r1, boolean r2, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public void writeUntil(int r4, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5) throws java.io.IOException {
                    r3 = this;
                L0:
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r0 = r3.next
                    if (r0 == 0) goto L5a
                    java.lang.Object r0 = r0.getKey()
                    com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r0
                    int r0 = r0.getNumber()
                    if (r0 >= r4) goto L5a
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r0 = r3.next
                    java.lang.Object r0 = r0.getKey()
                    com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r0
                    boolean r1 = r3.messageSetWireFormat
                    if (r1 == 0) goto L3a
                    com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
                    com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                    if (r1 != r2) goto L3a
                    boolean r1 = r0.isRepeated()
                    if (r1 != 0) goto L3a
                    int r0 = r0.getNumber()
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r1 = r3.next
                    java.lang.Object r1 = r1.getValue()
                    com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
                    r5.writeMessageSetExtension(r0, r1)
                    goto L43
                L3a:
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r1 = r3.next
                    java.lang.Object r1 = r1.getValue()
                    com.google.crypto.tink.shaded.protobuf.FieldSet.writeField(r0, r1, r5)
                L43:
                    java.util.Iterator<java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object>> r0 = r3.iter
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L56
                    java.util.Iterator<java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object>> r0 = r3.iter
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    r3.next = r0
                    goto L0
                L56:
                    r0 = 0
                    r3.next = r0
                    goto L0
                L5a:
                    return
            }
        }

        public ExtendableMessage() {
                r1 = this;
                r1.<init>()
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet()
                r1.extensions = r0
                return
        }

        private void eagerlyMergeMessageSetExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream r8, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r9, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r10, int r11) throws java.io.IOException {
                r7 = this;
                r0 = 2
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r11, r0)
                r1 = r7
                r2 = r8
                r3 = r10
                r4 = r9
                r6 = r11
                r1.parseExtension(r2, r3, r4, r5, r6)
                return
        }

        private void mergeMessageSetExtensionFromBytes(com.google.crypto.tink.shaded.protobuf.ByteString r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r5) throws java.io.IOException {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r2.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r5.descriptor
                java.lang.Object r0 = r0.getField(r1)
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
                if (r0 == 0) goto L11
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.toBuilder()
                goto L12
            L11:
                r0 = 0
            L12:
                if (r0 != 0) goto L1c
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r5.getMessageDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.newBuilderForType()
            L1c:
                r0.mergeFrom(r3, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r0.build()
                com.google.crypto.tink.shaded.protobuf.FieldSet r4 = r2.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r5.descriptor
                java.lang.Object r3 = r5.singularToFieldSetType(r3)
                r4.setField(r0, r3)
                return
        }

        private <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType r7, com.google.crypto.tink.shaded.protobuf.CodedInputStream r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = r1
                r3 = r2
            L4:
                int r4 = r8.readTag()
                if (r4 != 0) goto Lb
                goto L32
            Lb:
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG
                if (r4 != r5) goto L1a
                int r0 = r8.readUInt32()
                if (r0 == 0) goto L4
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = r9.findLiteExtensionByNumber(r7, r0)
                goto L4
            L1a:
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG
                if (r4 != r5) goto L2c
                if (r0 == 0) goto L27
                if (r3 == 0) goto L27
                r6.eagerlyMergeMessageSetExtension(r8, r3, r9, r0)
                r2 = r1
                goto L4
            L27:
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = r8.readBytes()
                goto L4
            L2c:
                boolean r4 = r8.skipField(r4)
                if (r4 != 0) goto L4
            L32:
                int r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
                r8.checkLastTagWas(r7)
                if (r2 == 0) goto L46
                if (r0 == 0) goto L46
                if (r3 == 0) goto L41
                r6.mergeMessageSetExtensionFromBytes(r2, r9, r3)
                goto L46
            L41:
                if (r2 == 0) goto L46
                r6.mergeLengthDelimitedField(r0, r2)
            L46:
                return
        }

        private boolean parseExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r7, int r8, int r9) throws java.io.IOException {
                r4 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r8)
                r1 = 1
                r2 = 0
                if (r7 != 0) goto Lb
            L8:
                r0 = r1
                r3 = r2
                goto L38
            Lb:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
                int r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.getWireFormatForFieldType(r3, r2)
                if (r0 != r3) goto L1a
                r0 = r2
                r3 = r0
                goto L38
            L1a:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r7.descriptor
                boolean r3 = r3.isRepeated
                if (r3 == 0) goto L8
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.type
                boolean r3 = r3.isPackable()
                if (r3 == 0) goto L8
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
                int r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.getWireFormatForFieldType(r3, r1)
                if (r0 != r3) goto L8
                r3 = r1
                r0 = r2
            L38:
                if (r0 == 0) goto L3f
                boolean r5 = r4.parseUnknownField(r8, r5)
                return r5
            L3f:
                r4.ensureExtensionsAreMutable()
                if (r3 == 0) goto L96
                int r6 = r5.readRawVarint32()
                int r6 = r5.pushLimit(r6)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = r8.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM
                if (r8 != r9) goto L79
            L56:
                int r8 = r5.getBytesUntilLimit()
                if (r8 <= 0) goto L91
                int r8 = r5.readEnum()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap r9 = r9.getEnumType()
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r8 = r9.findValueByNumber(r8)
                if (r8 != 0) goto L6d
                return r1
            L6d:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r9 = r4.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r7.descriptor
                java.lang.Object r8 = r7.singularToFieldSetType(r8)
                r9.addRepeatedField(r0, r8)
                goto L56
            L79:
                int r8 = r5.getBytesUntilLimit()
                if (r8 <= 0) goto L91
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = r8.getLiteType()
                java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(r5, r8, r2)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r9 = r4.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r7.descriptor
                r9.addRepeatedField(r0, r8)
                goto L79
            L91:
                r5.popLimit(r6)
                goto L126
            L96:
                int[] r8 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                int r0 = r0.ordinal()
                r8 = r8[r0]
                if (r8 == r1) goto Lca
                r6 = 2
                if (r8 == r6) goto Lb4
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r6 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = r6.getLiteType()
                java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(r5, r6, r2)
                goto L107
            Lb4:
                int r5 = r5.readEnum()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r6 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap r6 = r6.getEnumType()
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r6 = r6.findValueByNumber(r5)
                if (r6 != 0) goto Lc8
                r4.mergeVarintField(r9, r5)
                return r1
            Lc8:
                r5 = r6
                goto L107
            Lca:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r7.descriptor
                boolean r8 = r8.isRepeated()
                if (r8 != 0) goto Le3
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r8 = r4.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r7.descriptor
                java.lang.Object r8 = r8.getField(r9)
                com.google.crypto.tink.shaded.protobuf.MessageLite r8 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r8
                if (r8 == 0) goto Le3
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r8 = r8.toBuilder()
                goto Le4
            Le3:
                r8 = 0
            Le4:
                if (r8 != 0) goto Lee
                com.google.crypto.tink.shaded.protobuf.MessageLite r8 = r7.getMessageDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r8 = r8.newBuilderForType()
            Lee:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r7.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = r9.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP
                if (r9 != r0) goto L100
                int r9 = r7.getNumber()
                r5.readGroup(r9, r8, r6)
                goto L103
            L100:
                r5.readMessage(r8, r6)
            L103:
                com.google.crypto.tink.shaded.protobuf.MessageLite r5 = r8.build()
            L107:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r6 = r7.descriptor
                boolean r6 = r6.isRepeated()
                if (r6 == 0) goto L11b
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r6 = r4.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r7.descriptor
                java.lang.Object r5 = r7.singularToFieldSetType(r5)
                r6.addRepeatedField(r8, r5)
                goto L126
            L11b:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r6 = r4.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r7.descriptor
                java.lang.Object r5 = r7.singularToFieldSetType(r5)
                r6.setField(r8, r5)
            L126:
                return r1
        }

        private void verifyExtensionContainingType(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r2.getContainingTypeDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
                if (r2 != r0) goto Lb
                return
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
                r2.<init>(r0)
                throw r2
        }

        com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L10
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.clone()
                r1.extensions = r0
            L10:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                return r0
        }

        protected boolean extensionsAreInitialized() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                boolean r0 = r0.isInitialized()
                return r0
        }

        protected int extensionsSerializedSize() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                int r0 = r0.getSerializedSize()
                return r0
        }

        protected int extensionsSerializedSizeAsMessageSet() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                int r0 = r0.getMessageSetSerializedSize()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r3)
                r2.verifyExtensionContainingType(r3)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r2.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r3.descriptor
                java.lang.Object r0 = r0.getField(r1)
                if (r0 != 0) goto L14
                Type r3 = r3.defaultValue
                return r3
            L14:
                java.lang.Object r3 = r3.fromFieldSetType(r0)
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r3, int r4) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r3)
                r2.verifyExtensionContainingType(r3)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r2.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = r3.descriptor
                java.lang.Object r4 = r0.getRepeatedField(r1, r4)
                java.lang.Object r3 = r3.singularFromFieldSetType(r4)
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r2)
                r1.verifyExtensionContainingType(r2)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r2.descriptor
                int r2 = r0.getRepeatedFieldCount(r2)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r2)
                r1.verifyExtensionContainingType(r2)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r2.descriptor
                boolean r2 = r0.hasField(r2)
                return r2
        }

        protected final void mergeExtensionFields(MessageType r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L10
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.clone()
                r1.extensions = r0
            L10:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r2 = r2.extensions
                r0.mergeFrom(r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.newBuilderForType()
                return r0
        }

        protected com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter
                r1 = 0
                r2 = 0
                r0.<init>(r3, r1, r2)
                return r0
        }

        protected com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter
                r1 = 1
                r2 = 0
                r0.<init>(r3, r1, r2)
                return r0
        }

        protected <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> boolean parseUnknownField(MessageType r7, com.google.crypto.tink.shaded.protobuf.CodedInputStream r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9, int r10) throws java.io.IOException {
                r6 = this;
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r10)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = r9.findLiteExtensionByNumber(r7, r5)
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r10
                boolean r7 = r0.parseExtension(r1, r2, r3, r4, r5)
                return r7
        }

        protected <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType r3, com.google.crypto.tink.shaded.protobuf.CodedInputStream r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5, int r6) throws java.io.IOException {
                r2 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
                if (r6 != r0) goto L9
                r2.mergeMessageSetExtensionFromCodedStream(r3, r4, r5)
                r3 = 1
                return r3
            L9:
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r6)
                r1 = 2
                if (r0 != r1) goto L15
                boolean r3 = r2.parseUnknownField(r3, r4, r5, r6)
                return r3
            L15:
                boolean r3 = r4.skipField(r6)
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.toBuilder()
                return r0
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r1);

        <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r1, int r2);

        <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r1);

        <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r1);
    }

    static final class ExtensionDescriptor implements com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType type;

        ExtensionDescriptor(com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, boolean r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.enumTypeMap = r1
                r0.number = r2
                r0.type = r3
                r0.isRepeated = r4
                r0.isPacked = r5
                return
        }

        public int compareTo(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor r2) {
                r1 = this;
                int r0 = r1.number
                int r2 = r2.number
                int r0 = r0 - r2
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> getEnumType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<?> r0 = r1.enumTypeMap
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getLiteJavaType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r1.type
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r1.type
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
                r1 = this;
                int r0 = r1.number
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.MessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r2
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.mergeFrom(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
                r1 = this;
                boolean r0 = r1.isPacked
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
                r1 = this;
                boolean r0 = r1.isRepeated
                return r0
        }
    }

    public static class GeneratedExtension<ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> extends com.google.crypto.tink.shaded.protobuf.ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final com.google.crypto.tink.shaded.protobuf.MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType r2, Type r3, com.google.crypto.tink.shaded.protobuf.MessageLite r4, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor r5, java.lang.Class r6) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L21
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = r5.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE
                if (r6 != r0) goto L18
                if (r4 == 0) goto L10
                goto L18
            L10:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Null messageDefaultInstance"
                r2.<init>(r3)
                throw r2
            L18:
                r1.containingTypeDefaultInstance = r2
                r1.defaultValue = r3
                r1.messageDefaultInstance = r4
                r1.descriptor = r5
                return
            L21:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Null containingTypeDefaultInstance"
                r2.<init>(r3)
                throw r2
        }

        java.lang.Object fromFieldSetType(java.lang.Object r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                boolean r0 = r0.isRepeated()
                if (r0 == 0) goto L31
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L30
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r3 = r3.iterator()
            L1d:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r3.next()
                java.lang.Object r1 = r2.singularFromFieldSetType(r1)
                r0.add(r1)
                goto L1d
            L2f:
                return r0
            L30:
                return r3
            L31:
                java.lang.Object r3 = r2.singularFromFieldSetType(r3)
                return r3
        }

        public ContainingType getContainingTypeDefaultInstance() {
                r1 = this;
                ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.containingTypeDefaultInstance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public Type getDefaultValue() {
                r1 = this;
                Type r0 = r1.defaultValue
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r0.getLiteType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public com.google.crypto.tink.shaded.protobuf.MessageLite getMessageDefaultInstance() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.messageDefaultInstance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public int getNumber() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                int r0 = r0.getNumber()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public boolean isRepeated() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                boolean r0 = r0.isRepeated
                return r0
        }

        java.lang.Object singularFromFieldSetType(java.lang.Object r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L18
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<?> r0 = r0.enumTypeMap
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r3 = r0.findValueByNumber(r3)
            L18:
                return r3
        }

        java.lang.Object singularToFieldSetType(java.lang.Object r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L14
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r3 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r3
                int r3 = r3.getNumber()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            L14:
                return r3
        }

        java.lang.Object toFieldSetType(java.lang.Object r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                boolean r0 = r0.isRepeated()
                if (r0 == 0) goto L31
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L30
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r3 = r3.iterator()
            L1d:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r3.next()
                java.lang.Object r1 = r2.singularToFieldSetType(r1)
                r0.add(r1)
                goto L1d
            L2f:
                return r0
            L30:
                return r3
            L31:
                java.lang.Object r3 = r2.singularToFieldSetType(r3)
                return r3
        }
    }

    public enum MethodToInvoke extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke BUILD_MESSAGE_INFO = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke GET_DEFAULT_INSTANCE = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke GET_MEMOIZED_IS_INITIALIZED = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke GET_PARSER = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke NEW_BUILDER = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke NEW_MUTABLE_INSTANCE = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke SET_MEMOIZED_IS_INITIALIZED = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "GET_MEMOIZED_IS_INITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r2 = "SET_MEMOIZED_IS_INITIALIZED"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED = r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r3 = "BUILD_MESSAGE_INFO"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO = r2
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r3 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r4 = "NEW_MUTABLE_INSTANCE"
                r5 = 3
                r3.<init>(r4, r5)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE = r3
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r4 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r5 = "NEW_BUILDER"
                r6 = 4
                r4.<init>(r5, r6)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER = r4
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r5 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r6 = "GET_DEFAULT_INSTANCE"
                r7 = 5
                r5.<init>(r6, r7)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE = r5
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r6 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r7 = "GET_PARSER"
                r8 = 6
                r6.<init>(r7, r8)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER = r6
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[]{r0, r1, r2, r3, r4, r5, r6}
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.$VALUES = r0
                return
        }

        MethodToInvoke(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke) r1
                return r1
        }

        public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[] values() {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[]) r0
                return r0
        }
    }

    protected static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final java.lang.Class<?> messageClass;
        private final java.lang.String messageClassName;

        SerializedForm(com.google.crypto.tink.shaded.protobuf.MessageLite r2) {
                r1 = this;
                r1.<init>()
                java.lang.Class r0 = r2.getClass()
                r1.messageClass = r0
                java.lang.String r0 = r0.getName()
                r1.messageClassName = r0
                byte[] r2 = r2.toByteArray()
                r1.asBytes = r2
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.SerializedForm of(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$SerializedForm r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$SerializedForm
                r0.<init>(r1)
                return r0
        }

        @java.lang.Deprecated
        private java.lang.Object readResolveFallback() throws java.io.ObjectStreamException {
                r4 = this;
                java.lang.Class r0 = r4.resolveMessageClass()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                java.lang.String r1 = "defaultInstance"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                r1 = 1
                r0.setAccessible(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.newBuilderForType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                byte[] r1 = r4.asBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.mergeFrom(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.buildPartial()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L66
                return r0
            L24:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to understand proto buffer"
                r1.<init>(r2, r0)
                throw r1
            L2d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to call parsePartialFrom"
                r1.<init>(r2, r0)
                throw r1
            L36:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to call defaultInstance in "
                r2.<init>(r3)
                java.lang.String r3 = r4.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L4e:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to find defaultInstance in "
                r2.<init>(r3)
                java.lang.String r3 = r4.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L66:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to find proto buffer class: "
                r2.<init>(r3)
                java.lang.String r3 = r4.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
        }

        private java.lang.Class<?> resolveMessageClass() throws java.lang.ClassNotFoundException {
                r1 = this;
                java.lang.Class<?> r0 = r1.messageClass
                if (r0 == 0) goto L5
                goto Lb
            L5:
                java.lang.String r0 = r1.messageClassName
                java.lang.Class r0 = java.lang.Class.forName(r0)
            Lb:
                return r0
        }

        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
                r4 = this;
                java.lang.Class r0 = r4.resolveMessageClass()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                java.lang.String r1 = "DEFAULT_INSTANCE"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                r1 = 1
                r0.setAccessible(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.newBuilderForType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                byte[] r1 = r4.asBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.mergeFrom(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.buildPartial()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L4e java.lang.ClassNotFoundException -> L53
                return r0
            L24:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to understand proto buffer"
                r1.<init>(r2, r0)
                throw r1
            L2d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to call parsePartialFrom"
                r1.<init>(r2, r0)
                throw r1
            L36:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to call DEFAULT_INSTANCE in "
                r2.<init>(r3)
                java.lang.String r3 = r4.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L4e:
                java.lang.Object r0 = r4.readResolveFallback()
                return r0
            L53:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to find proto buffer class: "
                r2.<init>(r3)
                java.lang.String r3 = r4.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap = r0
            return
    }

    public GeneratedMessageLite() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.memoizedSerializedSize = r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            r1.unknownFields = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension access$000(com.google.crypto.tink.shaded.protobuf.ExtensionLite r0) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = checkIsLite(r0)
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite access$200(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0, byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r0, r1, r2, r3, r4)
            return r0
    }

    private static <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, T> checkIsLite(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, T> r1) {
            boolean r0 = r1.isLite()
            if (r0 == 0) goto L9
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r1
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected a lite extension."
            r1.<init>(r0)
            throw r1
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T checkMessageInitialized(T r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            if (r1 == 0) goto L16
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto L9
            goto L16
        L9:
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = r1.newUninitializedMessageException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = r0.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = r0.setUnfinishedMessage(r1)
            throw r1
        L16:
            return r1
    }

    private int computeSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema<?> r1) {
            r0 = this;
            if (r1 != 0) goto Lf
            com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r1.schemaFor(r0)
            int r1 = r1.getSerializedSize(r0)
            return r1
        Lf:
            int r1 = r1.getSerializedSize(r0)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList emptyBooleanList() {
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList r0 = com.google.crypto.tink.shaded.protobuf.BooleanArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList emptyDoubleList() {
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList r0 = com.google.crypto.tink.shaded.protobuf.DoubleArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.FloatList emptyFloatList() {
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = com.google.crypto.tink.shaded.protobuf.FloatArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.IntList emptyIntList() {
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = com.google.crypto.tink.shaded.protobuf.IntArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.LongList emptyLongList() {
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = com.google.crypto.tink.shaded.protobuf.LongArrayList.emptyList()
            return r0
    }

    protected static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r0 = com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.emptyList()
            return r0
    }

    private final void ensureUnknownFieldsInitialized() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r2.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r0 != r1) goto Le
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            r2.unknownFields = r0
        Le:
            return
    }

    static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> T getDefaultInstance(java.lang.Class<T> r3) {
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            if (r0 != 0) goto L28
            java.lang.String r0 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.ClassLoader r1 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1f
            r2 = 1
            java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            goto L28
        L1f:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r3)
            throw r0
        L28:
            if (r0 != 0) goto L42
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.allocateInstance(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.getDefaultInstanceForType()
            if (r0 == 0) goto L3c
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            r1.put(r3, r0)
            goto L42
        L3c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L42:
            return r0
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class r3, java.lang.String r4, java.lang.Class... r5) {
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L5
            return r3
        L5:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Generated message class \""
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "\" missing method \""
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\"."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3, r5)
            throw r0
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    protected static final <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T r2, boolean r3) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED
            java.lang.Object r0 = r2.dynamicMethod(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            if (r0 != 0) goto L14
            r2 = 0
            return r2
        L14:
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r2)
            boolean r0 = r0.isInitialized(r2)
            if (r3 == 0) goto L2c
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED
            if (r0 == 0) goto L28
            r1 = r2
            goto L29
        L28:
            r1 = 0
        L29:
            r2.dynamicMethod(r3, r1)
        L2c:
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.BooleanList r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto Lb
        L9:
            int r0 = r0 * 2
        Lb:
            com.google.crypto.tink.shaded.protobuf.Internal$BooleanList r1 = r1.mutableCopyWithCapacity(r0)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.DoubleList r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto Lb
        L9:
            int r0 = r0 * 2
        Lb:
            com.google.crypto.tink.shaded.protobuf.Internal$DoubleList r1 = r1.mutableCopyWithCapacity(r0)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.FloatList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.FloatList r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto Lb
        L9:
            int r0 = r0 * 2
        Lb:
            com.google.crypto.tink.shaded.protobuf.Internal$FloatList r1 = r1.mutableCopyWithCapacity(r0)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.IntList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.IntList r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto Lb
        L9:
            int r0 = r0 * 2
        Lb:
            com.google.crypto.tink.shaded.protobuf.Internal$IntList r1 = r1.mutableCopyWithCapacity(r0)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.LongList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.LongList r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto Lb
        L9:
            int r0 = r0 * 2
        Lb:
            com.google.crypto.tink.shaded.protobuf.Internal$LongList r1 = r1.mutableCopyWithCapacity(r0)
            return r1
    }

    protected static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> r1) {
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

    protected static java.lang.Object newMessageInfo(com.google.crypto.tink.shaded.protobuf.MessageLite r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.crypto.tink.shaded.protobuf.RawMessageInfo r0 = new com.google.crypto.tink.shaded.protobuf.RawMessageInfo
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType r13, com.google.crypto.tink.shaded.protobuf.MessageLite r14, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r15, int r16, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r17, boolean r18, java.lang.Class r19) {
            java.util.List r2 = java.util.Collections.emptyList()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r6 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r4 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor
            r11 = 1
            r7 = r4
            r8 = r15
            r9 = r16
            r10 = r17
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = r6
            r1 = r13
            r3 = r14
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public static <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType r8, Type r9, com.google.crypto.tink.shaded.protobuf.MessageLite r10, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r11, int r12, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r13, java.lang.Class r14) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r6 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r7 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r11
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T r1, java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parsePartialDelimitedFrom(r1, r2, r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = checkMessageInitialized(r1)
            return r1
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T r0, java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseFrom(r1, r2, r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = checkMessageInitialized(r1)
            return r1
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r0, com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseFrom(r1, r2, r0)
            return r1
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r0, com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r2)
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parsePartialFrom(r1, r2, r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = checkMessageInitialized(r1)
            return r1
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r0, java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, java.nio.ByteBuffer r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseFrom(r1, r2, r0)
            return r1
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r0, java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r3, byte[] r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            int r0 = r4.length
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            r2 = 0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = parsePartialFrom(r3, r4, r2, r0, r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = checkMessageInitialized(r3)
            return r3
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r2, byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = 0
            int r1 = r3.length
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = parsePartialFrom(r2, r3, r0, r1, r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = checkMessageInitialized(r2)
            return r2
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T r2, java.io.InputStream r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            int r0 = r3.read()     // Catch: java.io.IOException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            r1 = -1
            if (r0 != r1) goto L9
            r2 = 0
            return r2
        L9:
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(r0, r3)     // Catch: java.io.IOException -> L25 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2c
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream r1 = new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream
            r1.<init>(r3, r0)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r3 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = parsePartialFrom(r2, r3, r4)
            r4 = 0
            r3.checkLastTagWas(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L1f
            return r2
        L1f:
            r3 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r3.setUnfinishedMessage(r2)
            throw r2
        L25:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r3.<init>(r2)
            throw r3
        L2c:
            r2 = move-exception
            boolean r3 = r2.getThrownFromInputStream()
            if (r3 == 0) goto L39
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r3.<init>(r2)
            r2 = r3
        L39:
            throw r2
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r0, com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r1 = r1.newCodedInput()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r0, r1, r2)
            r2 = 0
            r1.checkLastTagWas(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            return r0
        Ld:
            r1 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = r1.setUnfinishedMessage(r0)
            throw r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r1, com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parsePartialFrom(r1, r2, r0)
            return r1
    }

    static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r1, com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.newMutableInstance()
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.lang.RuntimeException -> L17 java.io.IOException -> L28 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L42 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4c
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)     // Catch: java.lang.RuntimeException -> L17 java.io.IOException -> L28 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L42 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4c
            com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.forCodedInput(r2)     // Catch: java.lang.RuntimeException -> L17 java.io.IOException -> L28 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L42 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4c
            r0.mergeFrom(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L17 java.io.IOException -> L28 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L42 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4c
            r0.makeImmutable(r1)     // Catch: java.lang.RuntimeException -> L17 java.io.IOException -> L28 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L42 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4c
            return r1
        L17:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = r2 instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            if (r2 == 0) goto L27
            java.lang.Throwable r1 = r1.getCause()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) r1
            throw r1
        L27:
            throw r1
        L28:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            if (r3 == 0) goto L38
            java.lang.Throwable r1 = r2.getCause()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) r1
            throw r1
        L38:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r3.<init>(r2)
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = r3.setUnfinishedMessage(r1)
            throw r1
        L42:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r2.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = r2.setUnfinishedMessage(r1)
            throw r1
        L4c:
            r2 = move-exception
            boolean r3 = r2.getThrownFromInputStream()
            if (r3 == 0) goto L59
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r3.<init>(r2)
            r2 = r3
        L59:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = r2.setUnfinishedMessage(r1)
            throw r1
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r11) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r7 = r7.newMutableInstance()
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L41 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4b
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r0.schemaFor(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L41 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4b
            int r4 = r9 + r10
            com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers r5 = new com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L41 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4b
            r5.<init>(r11)     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L41 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4b
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.mergeFrom(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L41 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4b
            r6.makeImmutable(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L1e java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L41 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4b
            return r7
        L1e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = r8.setUnfinishedMessage(r7)
            throw r7
        L27:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()
            boolean r9 = r9 instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            if (r9 == 0) goto L37
            java.lang.Throwable r7 = r8.getCause()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) r7
            throw r7
        L37:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r9 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r9.<init>(r8)
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = r9.setUnfinishedMessage(r7)
            throw r7
        L41:
            r8 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = r8.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = r8.setUnfinishedMessage(r7)
            throw r7
        L4b:
            r8 = move-exception
            boolean r9 = r8.getThrownFromInputStream()
            if (r9 == 0) goto L58
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r9 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r9.<init>(r8)
            r8 = r9
        L58:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r7 = r8.setUnfinishedMessage(r7)
            throw r7
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> r1, T r2) {
            r2.markImmutable()
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            r0.put(r1, r2)
            return
    }

    java.lang.Object buildMessageInfo() throws java.lang.Exception {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO
            java.lang.Object r0 = r1.dynamicMethod(r0)
            return r0
    }

    void clearMemoizedHashCode() {
            r1 = this;
            r0 = 0
            r1.memoizedHashCode = r0
            return
    }

    void clearMemoizedSerializedSize() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setMemoizedSerializedSize(r0)
            return
    }

    int computeHashCode() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
            int r0 = r0.hashCode(r1)
            return r0
    }

    protected final <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r0
            return r0
    }

    protected final <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.createBuilder()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r2 = r0.mergeFrom(r2)
            return r2
    }

    protected java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.dynamicMethod(r2, r0, r0)
            return r2
    }

    protected java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.dynamicMethod(r2, r3, r0)
            return r2
    }

    protected abstract java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3);

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r4
            boolean r4 = r0.equals(r3, r4)
            return r4
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
            return r0
    }

    int getMemoizedHashCode() {
            r1 = this;
            int r0 = r1.memoizedHashCode
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final com.google.crypto.tink.shaded.protobuf.Parser<MessageType> getParserForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.Parser r0 = (com.google.crypto.tink.shaded.protobuf.Parser) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public int getSerializedSize() {
            r1 = this;
            r0 = 0
            int r0 = r1.getSerializedSize(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    int getSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema r4) {
            r3 = this;
            boolean r0 = r3.isMutable()
            if (r0 == 0) goto L22
            int r4 = r3.computeSerializedSize(r4)
            if (r4 < 0) goto Ld
            return r4
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "serialized size must be non-negative, was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L22:
            int r0 = r3.getMemoizedSerializedSize()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L30
            int r4 = r3.getMemoizedSerializedSize()
            return r4
        L30:
            int r4 = r3.computeSerializedSize(r4)
            r3.setMemoizedSerializedSize(r4)
            return r4
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.isMutable()
            if (r0 == 0) goto Lb
            int r0 = r1.computeHashCode()
            return r0
        Lb:
            boolean r0 = r1.hashCodeIsNotMemoized()
            if (r0 == 0) goto L18
            int r0 = r1.computeHashCode()
            r1.setMemoizedHashCode(r0)
        L18:
            int r0 = r1.getMemoizedHashCode()
            return r0
    }

    boolean hashCodeIsNotMemoized() {
            r1 = this;
            int r0 = r1.getMemoizedHashCode()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.booleanValue()
            boolean r0 = isInitialized(r1, r0)
            return r0
    }

    boolean isMutable() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    protected void makeImmutable() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
            r0.makeImmutable(r1)
            r1.markImmutable()
            return
    }

    void markImmutable() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.memoizedSerializedSize = r0
            return
    }

    protected void mergeLengthDelimitedField(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            r1.ensureUnknownFieldsInitialized()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.unknownFields
            r0.mergeLengthDelimitedField(r2, r3)
            return
    }

    protected final void mergeUnknownFields(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.mutableCopyOf(r0, r2)
            r1.unknownFields = r2
            return
    }

    protected void mergeVarintField(int r2, int r3) {
            r1 = this;
            r1.ensureUnknownFieldsInitialized()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.unknownFields
            r0.mergeVarintField(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.newBuilderForType()
            return r0
    }

    MessageType newMutableInstance() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            return r0
    }

    protected boolean parseUnknownField(int r3, com.google.crypto.tink.shaded.protobuf.CodedInputStream r4) throws java.io.IOException {
            r2 = this;
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r3)
            r1 = 4
            if (r0 != r1) goto L9
            r3 = 0
            return r3
        L9:
            r2.ensureUnknownFieldsInitialized()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r2.unknownFields
            boolean r3 = r0.mergeFieldFrom(r3, r4)
            return r3
    }

    void setMemoizedHashCode(int r1) {
            r0 = this;
            r0.memoizedHashCode = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int r4) {
            r3 = this;
            if (r4 < 0) goto Lf
            int r0 = r3.memoizedSerializedSize
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r1
            r4 = r4 | r0
            r3.memoizedSerializedSize = r4
            return
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "serialized size must be non-negative, was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType toBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.toBuilder()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.crypto.tink.shaded.protobuf.MessageLiteToString.toString(r1, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.forCodedOutput(r2)
            r0.writeTo(r1, r2)
            return
    }
}
