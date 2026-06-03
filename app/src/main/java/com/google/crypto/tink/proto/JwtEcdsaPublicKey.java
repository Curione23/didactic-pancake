package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public final class JwtEcdsaPublicKey extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtEcdsaPublicKey, com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder> implements com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 2;
    public static final int CUSTOM_KID_FIELD_NUMBER = 5;
    private static final com.google.crypto.tink.proto.JwtEcdsaPublicKey DEFAULT_INSTANCE = null;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int algorithm_;
    private com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid customKid_;
    private int version_;
    private com.google.crypto.tink.shaded.protobuf.ByteString x_;
    private com.google.crypto.tink.shaded.protobuf.ByteString y_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.JwtEcdsaPublicKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtEcdsaPublicKey, com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder> implements com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$500()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1 r1) {
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

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder clearAlgorithm() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1000(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder clearCustomKid() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1700(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder clearVersion() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$700(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder clearX() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1200(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder clearY() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1400(r0)
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

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
        public com.google.crypto.tink.proto.JwtEcdsaAlgorithm getAlgorithm() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = r0.getAlgorithm()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
        public int getAlgorithmValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                int r0 = r0.getAlgorithmValue()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid getCustomKid() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = r0.getCustomKid()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
        public int getVersion() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                int r0 = r0.getVersion()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getX() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getX()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getY() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getY()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
        public boolean hasCustomKid() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                boolean r0 = r0.hasCustomKid()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.internalMergeFrom(r1)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder mergeCustomKid(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1600(r0, r2)
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

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder setAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder setAlgorithmValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$800(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder setCustomKid(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r2 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r2
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder setCustomKid(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder setVersion(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder setX(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder setY(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r0
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.access$1300(r0, r2)
                return r1
        }
    }

    public static final class CustomKid extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid, com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder> implements com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKidOrBuilder {
        private static final com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid DEFAULT_INSTANCE = null;
        private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private java.lang.String value_;

        public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid, com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder> implements com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKidOrBuilder {
            private Builder() {
                    r1 = this;
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.access$000()
                    r1.<init>(r0)
                    return
            }

            /* synthetic */ Builder(com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1 r1) {
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

            public com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder clearValue() {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r0
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.access$200(r0)
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

            @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKidOrBuilder
            public java.lang.String getValue() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r0
                    java.lang.String r0 = r0.getValue()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKidOrBuilder
            public com.google.crypto.tink.shaded.protobuf.ByteString getValueBytes() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r0
                    com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValueBytes()
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

            public com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder setValue(java.lang.String r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r0
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.access$100(r0, r2)
                    return r1
            }

            public com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder setValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r0
                    com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.access$300(r0, r2)
                    return r1
            }
        }

        static {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = new com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid
                r0.<init>()
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE = r0
                java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid> r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.class
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
                return
        }

        private CustomKid() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.value_ = r0
                return
        }

        static /* synthetic */ com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid access$000() {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                return r0
        }

        static /* synthetic */ void access$100(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r0, java.lang.String r1) {
                r0.setValue(r1)
                return
        }

        static /* synthetic */ void access$200(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r0) {
                r0.clearValue()
                return
        }

        static /* synthetic */ void access$300(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
                r0.setValueBytes(r1)
                return
        }

        private void clearValue() {
                r1 = this;
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = getDefaultInstance()
                java.lang.String r0 = r0.getValue()
                r1.value_ = r0
                return
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid getDefaultInstance() {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                return r0
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder newBuilder() {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder) r0
                return r0
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder newBuilder(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r1) {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(java.io.InputStream r1) throws java.io.IOException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r1
                return r1
        }

        public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid> parser() {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
                return r0
        }

        private void setValue(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                r0.value_ = r1
                return
        }

        private void setValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
                r0 = this;
                checkByteStringIsUtf8(r1)
                java.lang.String r1 = r1.toStringUtf8()
                r0.value_ = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                int[] r2 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 0
                switch(r1) {
                    case 1: goto L4b;
                    case 2: goto L45;
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
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid> r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.PARSER
                if (r1 != 0) goto L32
                java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid> r2 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.class
                monitor-enter(r2)
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid> r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.PARSER     // Catch: java.lang.Throwable -> L2f
                if (r1 != 0) goto L2d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r1 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r3 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
                com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.PARSER = r1     // Catch: java.lang.Throwable -> L2f
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
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                return r1
            L36:
                java.lang.String r1 = "value_"
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ"
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r3 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.DEFAULT_INSTANCE
                java.lang.Object r1 = newMessageInfo(r3, r2, r1)
                return r1
            L45:
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r1 = new com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder
                r1.<init>(r2)
                return r1
            L4b:
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = new com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid
                r1.<init>()
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKidOrBuilder
        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value_
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKidOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getValueBytes() {
                r1 = this;
                java.lang.String r0 = r1.value_
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
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

    public interface CustomKidOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        java.lang.String getValue();

        com.google.crypto.tink.shaded.protobuf.ByteString getValueBytes();
    }

    static {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = new com.google.crypto.tink.proto.JwtEcdsaPublicKey
            r0.<init>()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPublicKey> r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private JwtEcdsaPublicKey() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.x_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.y_ = r0
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0) {
            r0.clearAlgorithm()
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setX(r1)
            return
    }

    static /* synthetic */ void access$1200(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0) {
            r0.clearX()
            return
    }

    static /* synthetic */ void access$1300(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setY(r1)
            return
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0) {
            r0.clearY()
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0, com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r1) {
            r0.setCustomKid(r1)
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0, com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r1) {
            r0.mergeCustomKid(r1)
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0) {
            r0.clearCustomKid()
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.JwtEcdsaPublicKey access$500() {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0, int r1) {
            r0.setVersion(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0) {
            r0.clearVersion()
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0, int r1) {
            r0.setAlgorithmValue(r1)
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.proto.JwtEcdsaPublicKey r0, com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1) {
            r0.setAlgorithm(r1)
            return
    }

    private void clearAlgorithm() {
            r1 = this;
            r0 = 0
            r1.algorithm_ = r0
            return
    }

    private void clearCustomKid() {
            r1 = this;
            r0 = 0
            r1.customKid_ = r0
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
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getX()
            r1.x_ = r0
            return
    }

    private void clearY() {
            r1 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getY()
            r1.y_ = r0
            return
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey getDefaultInstance() {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            return r0
    }

    private void mergeCustomKid(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r3) {
            r2 = this;
            r3.getClass()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = r2.customKid_
            if (r0 == 0) goto L22
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.getDefaultInstance()
            if (r0 == r1) goto L22
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = r2.customKid_
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r0.mergeFrom(r3)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r3 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.Builder) r3
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.buildPartial()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r3 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r3
            r2.customKid_ = r3
            goto L24
        L22:
            r2.customKid_ = r3
        L24:
            return
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder newBuilder() {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r0 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder newBuilder(com.google.crypto.tink.proto.JwtEcdsaPublicKey r1) {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtEcdsaPublicKey parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey> parser() {
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1) {
            r0 = this;
            int r1 = r1.getNumber()
            r0.algorithm_ = r1
            return
    }

    private void setAlgorithmValue(int r1) {
            r0 = this;
            r0.algorithm_ = r1
            return
    }

    private void setCustomKid(com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid r1) {
            r0 = this;
            r1.getClass()
            r0.customKid_ = r1
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
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int[] r4 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 0
            switch(r3) {
                case 1: goto L53;
                case 2: goto L4d;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L12:
            return r4
        L13:
            r3 = 1
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey> r3 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.PARSER
            if (r3 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPublicKey> r4 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.class
            monitor-enter(r4)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtEcdsaPublicKey> r3 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r3 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r5 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.JwtEcdsaPublicKey.PARSER = r3     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            throw r3
        L32:
            return r3
        L33:
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r3 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            return r3
        L36:
            java.lang.String r3 = "version_"
            java.lang.String r4 = "algorithm_"
            java.lang.String r5 = "x_"
            java.lang.String r0 = "y_"
            java.lang.String r1 = "customKid_"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r0, r1}
            java.lang.String r4 = "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n\u0005\t"
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r5 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.DEFAULT_INSTANCE
            java.lang.Object r3 = newMessageInfo(r5, r4, r3)
            return r3
        L4d:
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r3 = new com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder
            r3.<init>(r4)
            return r3
        L53:
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r3 = new com.google.crypto.tink.proto.JwtEcdsaPublicKey
            r3.<init>()
            return r3
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
    public com.google.crypto.tink.proto.JwtEcdsaAlgorithm getAlgorithm() {
            r1 = this;
            int r0 = r1.algorithm_
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.forNumber(r0)
            if (r0 != 0) goto La
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.UNRECOGNIZED
        La:
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
    public int getAlgorithmValue() {
            r1 = this;
            int r0 = r1.algorithm_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
    public com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid getCustomKid() {
            r1 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = r1.customKid_
            if (r0 != 0) goto L8
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.getDefaultInstance()
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
    public int getVersion() {
            r1 = this;
            int r0 = r1.version_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getX() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.x_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getY() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.y_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtEcdsaPublicKeyOrBuilder
    public boolean hasCustomKid() {
            r1 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r0 = r1.customKid_
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
