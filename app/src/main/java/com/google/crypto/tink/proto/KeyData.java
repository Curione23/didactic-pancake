package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyData extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.KeyData, com.google.crypto.tink.proto.KeyData.Builder> implements com.google.crypto.tink.proto.KeyDataOrBuilder {
    private static final com.google.crypto.tink.proto.KeyData DEFAULT_INSTANCE = null;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private java.lang.String typeUrl_;
    private com.google.crypto.tink.shaded.protobuf.ByteString value_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.KeyData$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.KeyData, com.google.crypto.tink.proto.KeyData.Builder> implements com.google.crypto.tink.proto.KeyDataOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.KeyData.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
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

        public com.google.crypto.tink.proto.KeyData.Builder clearKeyMaterialType() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$800(r0)
                return r1
        }

        public com.google.crypto.tink.proto.KeyData.Builder clearTypeUrl() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.proto.KeyData.Builder clearValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$500(r0)
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

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
        public com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = r0.getKeyMaterialType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
        public int getKeyMaterialTypeValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                int r0 = r0.getKeyMaterialTypeValue()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
        public java.lang.String getTypeUrl() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                java.lang.String r0 = r0.getTypeUrl()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getTypeUrlBytes()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
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

        public com.google.crypto.tink.proto.KeyData.Builder setKeyMaterialType(com.google.crypto.tink.proto.KeyData.KeyMaterialType r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.KeyData.Builder setKeyMaterialTypeValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.KeyData.Builder setTypeUrl(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.KeyData.Builder setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.KeyData.Builder setValue(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeyData r0 = (com.google.crypto.tink.proto.KeyData) r0
                com.google.crypto.tink.proto.KeyData.access$400(r0, r2)
                return r1
        }
    }

    public enum KeyMaterialType extends java.lang.Enum<com.google.crypto.tink.proto.KeyData.KeyMaterialType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
        private static final /* synthetic */ com.google.crypto.tink.proto.KeyData.KeyMaterialType[] $VALUES = null;
        public static final com.google.crypto.tink.proto.KeyData.KeyMaterialType ASYMMETRIC_PRIVATE = null;
        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final com.google.crypto.tink.proto.KeyData.KeyMaterialType ASYMMETRIC_PUBLIC = null;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final com.google.crypto.tink.proto.KeyData.KeyMaterialType REMOTE = null;
        public static final int REMOTE_VALUE = 4;
        public static final com.google.crypto.tink.proto.KeyData.KeyMaterialType SYMMETRIC = null;
        public static final int SYMMETRIC_VALUE = 1;
        public static final com.google.crypto.tink.proto.KeyData.KeyMaterialType UNKNOWN_KEYMATERIAL = null;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        public static final com.google.crypto.tink.proto.KeyData.KeyMaterialType UNRECOGNIZED = null;
        private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.KeyData.KeyMaterialType> internalValueMap = null;
        private final int value;


        private static final class KeyMaterialTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
            static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

            static {
                    com.google.crypto.tink.proto.KeyData$KeyMaterialType$KeyMaterialTypeVerifier r0 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType$KeyMaterialTypeVerifier
                    r0.<init>()
                    com.google.crypto.tink.proto.KeyData.KeyMaterialType.KeyMaterialTypeVerifier.INSTANCE = r0
                    return
            }

            private KeyMaterialTypeVerifier() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
            public boolean isInRange(int r1) {
                    r0 = this;
                    com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.forNumber(r1)
                    if (r1 == 0) goto L8
                    r1 = 1
                    goto L9
                L8:
                    r1 = 0
                L9:
                    return r1
            }
        }

        static {
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType
                java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL = r0
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType
                java.lang.String r2 = "SYMMETRIC"
                r3 = 1
                r1.<init>(r2, r3, r3)
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC = r1
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType
                java.lang.String r3 = "ASYMMETRIC_PRIVATE"
                r4 = 2
                r2.<init>(r3, r4, r4)
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE = r2
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType
                java.lang.String r4 = "ASYMMETRIC_PUBLIC"
                r5 = 3
                r3.<init>(r4, r5, r5)
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC = r3
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r4 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType
                java.lang.String r5 = "REMOTE"
                r6 = 4
                r4.<init>(r5, r6, r6)
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE = r4
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r5 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType
                r6 = 5
                r7 = -1
                java.lang.String r8 = "UNRECOGNIZED"
                r5.<init>(r8, r6, r7)
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNRECOGNIZED = r5
                com.google.crypto.tink.proto.KeyData$KeyMaterialType[] r0 = new com.google.crypto.tink.proto.KeyData.KeyMaterialType[]{r0, r1, r2, r3, r4, r5}
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.$VALUES = r0
                com.google.crypto.tink.proto.KeyData$KeyMaterialType$1 r0 = new com.google.crypto.tink.proto.KeyData$KeyMaterialType$1
                r0.<init>()
                com.google.crypto.tink.proto.KeyData.KeyMaterialType.internalValueMap = r0
                return
        }

        KeyMaterialType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.crypto.tink.proto.KeyData.KeyMaterialType forNumber(int r1) {
                if (r1 == 0) goto L1c
                r0 = 1
                if (r1 == r0) goto L19
                r0 = 2
                if (r1 == r0) goto L16
                r0 = 3
                if (r1 == r0) goto L13
                r0 = 4
                if (r1 == r0) goto L10
                r1 = 0
                return r1
            L10:
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE
                return r1
            L13:
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
                return r1
            L16:
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
                return r1
            L19:
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
                return r1
            L1c:
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
                return r1
        }

        public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.KeyData.KeyMaterialType> internalGetValueMap() {
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.KeyData$KeyMaterialType> r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.internalValueMap
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.KeyMaterialTypeVerifier.INSTANCE
                return r0
        }

        @java.lang.Deprecated
        public static com.google.crypto.tink.proto.KeyData.KeyMaterialType valueOf(int r0) {
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = forNumber(r0)
                return r0
        }

        public static com.google.crypto.tink.proto.KeyData.KeyMaterialType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.proto.KeyData$KeyMaterialType> r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = (com.google.crypto.tink.proto.KeyData.KeyMaterialType) r1
                return r1
        }

        public static com.google.crypto.tink.proto.KeyData.KeyMaterialType[] values() {
                com.google.crypto.tink.proto.KeyData$KeyMaterialType[] r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.proto.KeyData$KeyMaterialType[] r0 = (com.google.crypto.tink.proto.KeyData.KeyMaterialType[]) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
        public final int getNumber() {
                r2 = this;
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNRECOGNIZED
                if (r2 == r0) goto L7
                int r0 = r2.value
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Can't get the number of an unknown enum value."
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            com.google.crypto.tink.proto.KeyData r0 = new com.google.crypto.tink.proto.KeyData
            r0.<init>()
            com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.KeyData> r1 = com.google.crypto.tink.proto.KeyData.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private KeyData() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.typeUrl_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.value_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.KeyData access$000() {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.KeyData r0, java.lang.String r1) {
            r0.setTypeUrl(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.KeyData r0) {
            r0.clearTypeUrl()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.KeyData r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setTypeUrlBytes(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.KeyData r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setValue(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.KeyData r0) {
            r0.clearValue()
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.KeyData r0, int r1) {
            r0.setKeyMaterialTypeValue(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.KeyData r0, com.google.crypto.tink.proto.KeyData.KeyMaterialType r1) {
            r0.setKeyMaterialType(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.proto.KeyData r0) {
            r0.clearKeyMaterialType()
            return
    }

    private void clearKeyMaterialType() {
            r1 = this;
            r0 = 0
            r1.keyMaterialType_ = r0
            return
    }

    private void clearTypeUrl() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData r0 = getDefaultInstance()
            java.lang.String r0 = r0.getTypeUrl()
            r1.typeUrl_ = r0
            return
    }

    private void clearValue() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
            r1.value_ = r0
            return
    }

    public static com.google.crypto.tink.proto.KeyData getDefaultInstance() {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.proto.KeyData.Builder newBuilder() {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.KeyData$Builder r0 = (com.google.crypto.tink.proto.KeyData.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeyData.Builder newBuilder(com.google.crypto.tink.proto.KeyData r1) {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.KeyData$Builder r1 = (com.google.crypto.tink.proto.KeyData.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyData parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeyData> parser() {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setKeyMaterialType(com.google.crypto.tink.proto.KeyData.KeyMaterialType r1) {
            r0 = this;
            int r1 = r1.getNumber()
            r0.keyMaterialType_ = r1
            return
    }

    private void setKeyMaterialTypeValue(int r1) {
            r0 = this;
            r0.keyMaterialType_ = r1
            return
    }

    private void setTypeUrl(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.typeUrl_ = r1
            return
    }

    private void setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            checkByteStringIsUtf8(r1)
            java.lang.String r1 = r1.toStringUtf8()
            r0.typeUrl_ = r1
            return
    }

    private void setValue(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.value_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int[] r2 = com.google.crypto.tink.proto.KeyData.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeyData> r1 = com.google.crypto.tink.proto.KeyData.PARSER
            if (r1 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.proto.KeyData> r2 = com.google.crypto.tink.proto.KeyData.class
            monitor-enter(r2)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeyData> r1 = com.google.crypto.tink.proto.KeyData.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r1 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.KeyData r3 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.KeyData.PARSER = r1     // Catch: java.lang.Throwable -> L2f
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
            com.google.crypto.tink.proto.KeyData r1 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            return r1
        L36:
            java.lang.String r1 = "typeUrl_"
            java.lang.String r2 = "value_"
            java.lang.String r3 = "keyMaterialType_"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f"
            com.google.crypto.tink.proto.KeyData r3 = com.google.crypto.tink.proto.KeyData.DEFAULT_INSTANCE
            java.lang.Object r1 = newMessageInfo(r3, r2, r1)
            return r1
        L49:
            com.google.crypto.tink.proto.KeyData$Builder r1 = new com.google.crypto.tink.proto.KeyData$Builder
            r1.<init>(r2)
            return r1
        L4f:
            com.google.crypto.tink.proto.KeyData r1 = new com.google.crypto.tink.proto.KeyData
            r1.<init>()
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType() {
            r1 = this;
            int r0 = r1.keyMaterialType_
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.forNumber(r0)
            if (r0 != 0) goto La
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNRECOGNIZED
        La:
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
    public int getKeyMaterialTypeValue() {
            r1 = this;
            int r0 = r1.keyMaterialType_
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
    public java.lang.String getTypeUrl() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeyDataOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getValue() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.value_
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
