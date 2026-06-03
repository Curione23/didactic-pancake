package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public final class EciesAeadHkdfPublicKey extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey, com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder> implements com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder {
    private static final com.google.crypto.tink.proto.EciesAeadHkdfPublicKey DEFAULT_INSTANCE = null;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private com.google.crypto.tink.proto.EciesAeadHkdfParams params_;
    private int version_;
    private com.google.crypto.tink.shaded.protobuf.ByteString x_;
    private com.google.crypto.tink.shaded.protobuf.ByteString y_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey, com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder> implements com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1 r1) {
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

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder clearParams() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$500(r0)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder clearVersion() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder clearX() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$700(r0)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder clearY() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$900(r0)
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

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public com.google.crypto.tink.proto.EciesAeadHkdfParams getParams() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfParams r0 = r0.getParams()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public int getVersion() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                int r0 = r0.getVersion()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getX() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getX()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getY() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getY()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
        public boolean hasParams() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                boolean r0 = r0.hasParams()
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

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder mergeParams(com.google.crypto.tink.proto.EciesAeadHkdfParams r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder setParams(com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.proto.EciesAeadHkdfParams r2 = (com.google.crypto.tink.proto.EciesAeadHkdfParams) r2
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder setParams(com.google.crypto.tink.proto.EciesAeadHkdfParams r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder setVersion(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder setX(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder setY(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r0
                com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.access$800(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = new com.google.crypto.tink.proto.EciesAeadHkdfPublicKey
            r0.<init>()
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> r1 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private EciesAeadHkdfPublicKey() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.x_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.y_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.EciesAeadHkdfPublicKey access$000() {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0, int r1) {
            r0.setVersion(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0) {
            r0.clearVersion()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0, com.google.crypto.tink.proto.EciesAeadHkdfParams r1) {
            r0.setParams(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0, com.google.crypto.tink.proto.EciesAeadHkdfParams r1) {
            r0.mergeParams(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0) {
            r0.clearParams()
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setX(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0) {
            r0.clearX()
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setY(r1)
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0) {
            r0.clearY()
            return
    }

    private void clearParams() {
            r1 = this;
            r0 = 0
            r1.params_ = r0
            return
    }

    private void clearVersion() {
            r1 = this;
            r0 = 0
            r1.version_ = r0
            return
    }

    private void clearX() {
            r1 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getX()
            r1.x_ = r0
            return
    }

    private void clearY() {
            r1 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getY()
            r1.y_ = r0
            return
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey getDefaultInstance() {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            return r0
    }

    private void mergeParams(com.google.crypto.tink.proto.EciesAeadHkdfParams r3) {
            r2 = this;
            r3.getClass()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r0 = r2.params_
            if (r0 == 0) goto L22
            com.google.crypto.tink.proto.EciesAeadHkdfParams r1 = com.google.crypto.tink.proto.EciesAeadHkdfParams.getDefaultInstance()
            if (r0 == r1) goto L22
            com.google.crypto.tink.proto.EciesAeadHkdfParams r0 = r2.params_
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r0 = com.google.crypto.tink.proto.EciesAeadHkdfParams.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r0.mergeFrom(r3)
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r3 = (com.google.crypto.tink.proto.EciesAeadHkdfParams.Builder) r3
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.buildPartial()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r3 = (com.google.crypto.tink.proto.EciesAeadHkdfParams) r3
            r2.params_ = r3
            goto L24
        L22:
            r2.params_ = r3
        L24:
            return
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder newBuilder() {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$Builder r0 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder newBuilder(com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1) {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$Builder r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfPublicKey parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> parser() {
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r0 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setParams(com.google.crypto.tink.proto.EciesAeadHkdfParams r1) {
            r0 = this;
            r1.getClass()
            r0.params_ = r1
            return
    }

    private void setVersion(int r1) {
            r0 = this;
            r0.version_ = r1
            return
    }

    private void setX(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.x_ = r1
            return
    }

    private void setY(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.y_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int[] r3 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L51;
                case 2: goto L4b;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L12:
            return r3
        L13:
            r2 = 1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> r2 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.PARSER
            if (r2 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> r3 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.class
            monitor-enter(r3)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> r2 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r4 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.PARSER = r2     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r2
        L32:
            return r2
        L33:
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r2 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            return r2
        L36:
            java.lang.String r2 = "version_"
            java.lang.String r3 = "params_"
            java.lang.String r4 = "x_"
            java.lang.String r0 = "y_"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r0}
            java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n"
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r4 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r4, r3, r2)
            return r2
        L4b:
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$Builder r2 = new com.google.crypto.tink.proto.EciesAeadHkdfPublicKey$Builder
            r2.<init>(r3)
            return r2
        L51:
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r2 = new com.google.crypto.tink.proto.EciesAeadHkdfPublicKey
            r2.<init>()
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public com.google.crypto.tink.proto.EciesAeadHkdfParams getParams() {
            r1 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfParams r0 = r1.params_
            if (r0 != 0) goto L8
            com.google.crypto.tink.proto.EciesAeadHkdfParams r0 = com.google.crypto.tink.proto.EciesAeadHkdfParams.getDefaultInstance()
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public int getVersion() {
            r1 = this;
            int r0 = r1.version_
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getX() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.x_
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getY() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.y_
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPublicKeyOrBuilder
    public boolean hasParams() {
            r1 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfParams r0 = r1.params_
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
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
