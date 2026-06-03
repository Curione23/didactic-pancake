package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public final class JwtRsaSsaPssPrivateKey extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey DEFAULT_INSTANCE = null;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.ByteString crt_;
    private com.google.crypto.tink.shaded.protobuf.ByteString d_;
    private com.google.crypto.tink.shaded.protobuf.ByteString dp_;
    private com.google.crypto.tink.shaded.protobuf.ByteString dq_;
    private com.google.crypto.tink.shaded.protobuf.ByteString p_;
    private com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey publicKey_;
    private com.google.crypto.tink.shaded.protobuf.ByteString q_;
    private int version_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey, com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1 r1) {
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

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearCrt() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1700(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearD() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$700(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearDp() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1300(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearDq() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1500(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearP() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$900(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearPublicKey() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$500(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearQ() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1100(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder clearVersion() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$200(r0)
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

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getCrt() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getCrt()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getD() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getD()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getDp() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getDp()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getDq() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getDq()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getP() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getP()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey getPublicKey() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = r0.getPublicKey()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getQ() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getQ()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public int getVersion() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                int r0 = r0.getVersion()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
        public boolean hasPublicKey() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                boolean r0 = r0.hasPublicKey()
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

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder mergePublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setCrt(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setD(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setDp(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setDq(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setP(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$800(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r2 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey) r2
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setQ(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$1000(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder setVersion(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r0
                com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.access$100(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = new com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey
            r0.<init>()
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> r1 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private JwtRsaSsaPssPrivateKey() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.d_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.p_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.q_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.dp_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.dq_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.crt_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey access$000() {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, int r1) {
            r0.setVersion(r1)
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setQ(r1)
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearQ()
            return
    }

    static /* synthetic */ void access$1200(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setDp(r1)
            return
    }

    static /* synthetic */ void access$1300(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearDp()
            return
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setDq(r1)
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearDq()
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setCrt(r1)
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearCrt()
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearVersion()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1) {
            r0.setPublicKey(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1) {
            r0.mergePublicKey(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearPublicKey()
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setD(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearD()
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setP(r1)
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0) {
            r0.clearP()
            return
    }

    private void clearCrt() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getCrt()
            r1.crt_ = r0
            return
    }

    private void clearD() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getD()
            r1.d_ = r0
            return
    }

    private void clearDp() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getDp()
            r1.dp_ = r0
            return
    }

    private void clearDq() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getDq()
            r1.dq_ = r0
            return
    }

    private void clearP() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getP()
            r1.p_ = r0
            return
    }

    private void clearPublicKey() {
            r1 = this;
            r0 = 0
            r1.publicKey_ = r0
            return
    }

    private void clearQ() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getQ()
            r1.q_ = r0
            return
    }

    private void clearVersion() {
            r1 = this;
            r0 = 0
            r1.version_ = r0
            return
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey getDefaultInstance() {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            return r0
    }

    private void mergePublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r3) {
            r2 = this;
            r3.getClass()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = r2.publicKey_
            if (r0 == 0) goto L22
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.getDefaultInstance()
            if (r0 == r1) goto L22
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = r2.publicKey_
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r0.mergeFrom(r3)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r3 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.Builder) r3
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.buildPartial()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r3 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey) r3
            r2.publicKey_ = r3
            goto L24
        L22:
            r2.publicKey_ = r3
        L24:
            return
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder newBuilder() {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey$Builder r0 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder newBuilder(com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1) {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey$Builder r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> parser() {
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setCrt(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.crt_ = r1
            return
    }

    private void setD(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.d_ = r1
            return
    }

    private void setDp(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.dp_ = r1
            return
    }

    private void setDq(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.dq_ = r1
            return
    }

    private void setP(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.p_ = r1
            return
    }

    private void setPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r1) {
            r0 = this;
            r1.getClass()
            r0.publicKey_ = r1
            return
    }

    private void setQ(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.q_ = r1
            return
    }

    private void setVersion(int r1) {
            r0 = this;
            r0.version_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int[] r10 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r9 = r9.ordinal()
            r9 = r10[r9]
            r10 = 0
            switch(r9) {
                case 1: goto L59;
                case 2: goto L53;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            r9.<init>()
            throw r9
        L12:
            return r10
        L13:
            r9 = 1
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            return r9
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> r9 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.PARSER
            if (r9 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> r10 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.class
            monitor-enter(r10)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey> r9 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r9 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r9 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r11 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.PARSER = r9     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L2f
            throw r9
        L32:
            return r9
        L33:
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r9 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            return r9
        L36:
            java.lang.String r0 = "version_"
            java.lang.String r1 = "publicKey_"
            java.lang.String r2 = "d_"
            java.lang.String r3 = "p_"
            java.lang.String r4 = "q_"
            java.lang.String r5 = "dp_"
            java.lang.String r6 = "dq_"
            java.lang.String r7 = "crt_"
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r10 = "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n"
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r11 = com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey.DEFAULT_INSTANCE
            java.lang.Object r9 = newMessageInfo(r11, r10, r9)
            return r9
        L53:
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey$Builder r9 = new com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey$Builder
            r9.<init>(r10)
            return r9
        L59:
            com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey r9 = new com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKey
            r9.<init>()
            return r9
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getCrt() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.crt_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getD() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.d_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getDp() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.dp_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getDq() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.dq_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getP() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.p_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey getPublicKey() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = r1.publicKey_
            if (r0 != 0) goto L8
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.getDefaultInstance()
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getQ() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.q_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public int getVersion() {
            r1 = this;
            int r0 = r1.version_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPssPrivateKeyOrBuilder
    public boolean hasPublicKey() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = r1.publicKey_
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
