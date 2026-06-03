package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class RegistryConfig extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.RegistryConfig, com.google.crypto.tink.proto.RegistryConfig.Builder> implements com.google.crypto.tink.proto.RegistryConfigOrBuilder {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final com.google.crypto.tink.proto.RegistryConfig DEFAULT_INSTANCE = null;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.RegistryConfig> PARSER;
    private java.lang.String configName_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> entry_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.RegistryConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.RegistryConfig, com.google.crypto.tink.proto.RegistryConfig.Builder> implements com.google.crypto.tink.proto.RegistryConfigOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder addAllEntry(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeyTypeEntry> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(int r2, com.google.crypto.tink.proto.KeyTypeEntry.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.proto.KeyTypeEntry r3 = (com.google.crypto.tink.proto.KeyTypeEntry) r3
                com.google.crypto.tink.proto.RegistryConfig.access$600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(int r2, com.google.crypto.tink.proto.KeyTypeEntry r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(com.google.crypto.tink.proto.KeyTypeEntry.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.proto.KeyTypeEntry r2 = (com.google.crypto.tink.proto.KeyTypeEntry) r2
                com.google.crypto.tink.proto.RegistryConfig.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder addEntry(com.google.crypto.tink.proto.KeyTypeEntry r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$500(r0, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite build() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.build()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.buildPartial()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clear()
                return r0
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder clearConfigName() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder clearEntry() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$800(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ java.lang.Object mo709clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clone()
                return r0
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public java.lang.String getConfigName() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                java.lang.String r0 = r0.getConfigName()
                return r0
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getConfigNameBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getConfigNameBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public com.google.crypto.tink.proto.KeyTypeEntry getEntry(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.KeyTypeEntry r2 = r0.getEntry(r2)
                return r2
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public int getEntryCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                int r0 = r0.getEntryCount()
                return r0
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public java.util.List<com.google.crypto.tink.proto.KeyTypeEntry> getEntryList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                java.util.List r0 = r0.getEntryList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.internalMergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder removeEntry(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder setConfigName(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder setConfigNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder setEntry(int r2, com.google.crypto.tink.proto.KeyTypeEntry.Builder r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
                com.google.crypto.tink.proto.KeyTypeEntry r3 = (com.google.crypto.tink.proto.KeyTypeEntry) r3
                com.google.crypto.tink.proto.RegistryConfig.access$400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.proto.RegistryConfig.Builder setEntry(int r2, com.google.crypto.tink.proto.KeyTypeEntry r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.RegistryConfig r0 = (com.google.crypto.tink.proto.RegistryConfig) r0
                com.google.crypto.tink.proto.RegistryConfig.access$400(r0, r2, r3)
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.RegistryConfig r0 = new com.google.crypto.tink.proto.RegistryConfig
            r0.<init>()
            com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.RegistryConfig> r1 = com.google.crypto.tink.proto.RegistryConfig.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private RegistryConfig() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.configName_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.entry_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.RegistryConfig access$000() {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.RegistryConfig r0, java.lang.String r1) {
            r0.setConfigName(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.RegistryConfig r0) {
            r0.clearConfigName()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.RegistryConfig r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setConfigNameBytes(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.RegistryConfig r0, int r1, com.google.crypto.tink.proto.KeyTypeEntry r2) {
            r0.setEntry(r1, r2)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.RegistryConfig r0, com.google.crypto.tink.proto.KeyTypeEntry r1) {
            r0.addEntry(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.RegistryConfig r0, int r1, com.google.crypto.tink.proto.KeyTypeEntry r2) {
            r0.addEntry(r1, r2)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.RegistryConfig r0, java.lang.Iterable r1) {
            r0.addAllEntry(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.proto.RegistryConfig r0) {
            r0.clearEntry()
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.proto.RegistryConfig r0, int r1) {
            r0.removeEntry(r1)
            return
    }

    private void addAllEntry(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeyTypeEntry> r2) {
            r1 = this;
            r1.ensureEntryIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addEntry(int r2, com.google.crypto.tink.proto.KeyTypeEntry r3) {
            r1 = this;
            r3.getClass()
            r1.ensureEntryIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            r0.add(r2, r3)
            return
    }

    private void addEntry(com.google.crypto.tink.proto.KeyTypeEntry r2) {
            r1 = this;
            r2.getClass()
            r1.ensureEntryIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            r0.add(r2)
            return
    }

    private void clearConfigName() {
            r1 = this;
            com.google.crypto.tink.proto.RegistryConfig r0 = getDefaultInstance()
            java.lang.String r0 = r0.getConfigName()
            r1.configName_ = r0
            return
    }

    private void clearEntry() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.entry_ = r0
            return
    }

    private void ensureEntryIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r2.entry_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Le
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.entry_ = r0
        Le:
            return
    }

    public static com.google.crypto.tink.proto.RegistryConfig getDefaultInstance() {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.proto.RegistryConfig.Builder newBuilder() {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.RegistryConfig$Builder r0 = (com.google.crypto.tink.proto.RegistryConfig.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.RegistryConfig.Builder newBuilder(com.google.crypto.tink.proto.RegistryConfig r1) {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.RegistryConfig$Builder r1 = (com.google.crypto.tink.proto.RegistryConfig.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.proto.RegistryConfig parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.RegistryConfig r1 = (com.google.crypto.tink.proto.RegistryConfig) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.RegistryConfig> parser() {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void removeEntry(int r2) {
            r1 = this;
            r1.ensureEntryIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            r0.remove(r2)
            return
    }

    private void setConfigName(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.configName_ = r1
            return
    }

    private void setConfigNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            checkByteStringIsUtf8(r1)
            java.lang.String r1 = r1.toStringUtf8()
            r0.configName_ = r1
            return
    }

    private void setEntry(int r2, com.google.crypto.tink.proto.KeyTypeEntry r3) {
            r1 = this;
            r3.getClass()
            r1.ensureEntryIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            r0.set(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int[] r2 = com.google.crypto.tink.proto.RegistryConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 0
            switch(r1) {
                case 1: goto L4f;
                case 2: goto L49;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        L12:
            return r2
        L13:
            r1 = 1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.RegistryConfig> r1 = com.google.crypto.tink.proto.RegistryConfig.PARSER
            if (r1 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.proto.RegistryConfig> r2 = com.google.crypto.tink.proto.RegistryConfig.class
            monitor-enter(r2)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.RegistryConfig> r1 = com.google.crypto.tink.proto.RegistryConfig.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r1 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.RegistryConfig r3 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.RegistryConfig.PARSER = r1     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r1
        L32:
            return r1
        L33:
            com.google.crypto.tink.proto.RegistryConfig r1 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            return r1
        L36:
            java.lang.String r1 = "configName_"
            java.lang.String r2 = "entry_"
            java.lang.Class<com.google.crypto.tink.proto.KeyTypeEntry> r3 = com.google.crypto.tink.proto.KeyTypeEntry.class
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b"
            com.google.crypto.tink.proto.RegistryConfig r3 = com.google.crypto.tink.proto.RegistryConfig.DEFAULT_INSTANCE
            java.lang.Object r1 = newMessageInfo(r3, r2, r1)
            return r1
        L49:
            com.google.crypto.tink.proto.RegistryConfig$Builder r1 = new com.google.crypto.tink.proto.RegistryConfig$Builder
            r1.<init>(r2)
            return r1
        L4f:
            com.google.crypto.tink.proto.RegistryConfig r1 = new com.google.crypto.tink.proto.RegistryConfig
            r1.<init>()
            return r1
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public java.lang.String getConfigName() {
            r1 = this;
            java.lang.String r0 = r1.configName_
            return r0
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getConfigNameBytes() {
            r1 = this;
            java.lang.String r0 = r1.configName_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public com.google.crypto.tink.proto.KeyTypeEntry getEntry(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.proto.KeyTypeEntry r2 = (com.google.crypto.tink.proto.KeyTypeEntry) r2
            return r2
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public int getEntryCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public java.util.List<com.google.crypto.tink.proto.KeyTypeEntry> getEntryList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            return r0
    }

    public com.google.crypto.tink.proto.KeyTypeEntryOrBuilder getEntryOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            java.lang.Object r2 = r0.get(r2)
            com.google.crypto.tink.proto.KeyTypeEntryOrBuilder r2 = (com.google.crypto.tink.proto.KeyTypeEntryOrBuilder) r2
            return r2
    }

    public java.util.List<? extends com.google.crypto.tink.proto.KeyTypeEntryOrBuilder> getEntryOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeyTypeEntry> r0 = r1.entry_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.newBuilderForType()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.toBuilder()
            return r0
    }
}
