package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public final class EciesHkdfKemParams extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.EciesHkdfKemParams, com.google.crypto.tink.proto.EciesHkdfKemParams.Builder> implements com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final com.google.crypto.tink.proto.EciesHkdfKemParams DEFAULT_INSTANCE = null;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesHkdfKemParams> PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private com.google.crypto.tink.shaded.protobuf.ByteString hkdfSalt_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.EciesHkdfKemParams$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.EciesHkdfKemParams, com.google.crypto.tink.proto.EciesHkdfKemParams.Builder> implements com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1 r1) {
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

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder clearCurveType() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$300(r0)
                return r1
        }

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder clearHkdfHashType() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$600(r0)
                return r1
        }

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder clearHkdfSalt() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$800(r0)
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

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public com.google.crypto.tink.proto.EllipticCurveType getCurveType() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EllipticCurveType r0 = r0.getCurveType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getCurveTypeValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                int r0 = r0.getCurveTypeValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public com.google.crypto.tink.proto.HashType getHkdfHashType() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.HashType r0 = r0.getHkdfHashType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getHkdfHashTypeValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                int r0 = r0.getHkdfHashTypeValue()
                return r0
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getHkdfSalt() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getHkdfSalt()
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

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder setCurveType(com.google.crypto.tink.proto.EllipticCurveType r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder setCurveTypeValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder setHkdfHashType(com.google.crypto.tink.proto.HashType r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder setHkdfHashTypeValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.EciesHkdfKemParams.Builder setHkdfSalt(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.EciesHkdfKemParams r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r0
                com.google.crypto.tink.proto.EciesHkdfKemParams.access$700(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = new com.google.crypto.tink.proto.EciesHkdfKemParams
            r0.<init>()
            com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.EciesHkdfKemParams> r1 = com.google.crypto.tink.proto.EciesHkdfKemParams.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private EciesHkdfKemParams() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.hkdfSalt_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.EciesHkdfKemParams access$000() {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.EciesHkdfKemParams r0, int r1) {
            r0.setCurveTypeValue(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.EciesHkdfKemParams r0, com.google.crypto.tink.proto.EllipticCurveType r1) {
            r0.setCurveType(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.EciesHkdfKemParams r0) {
            r0.clearCurveType()
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.EciesHkdfKemParams r0, int r1) {
            r0.setHkdfHashTypeValue(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.EciesHkdfKemParams r0, com.google.crypto.tink.proto.HashType r1) {
            r0.setHkdfHashType(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.EciesHkdfKemParams r0) {
            r0.clearHkdfHashType()
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.EciesHkdfKemParams r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setHkdfSalt(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.proto.EciesHkdfKemParams r0) {
            r0.clearHkdfSalt()
            return
    }

    private void clearCurveType() {
            r1 = this;
            r0 = 0
            r1.curveType_ = r0
            return
    }

    private void clearHkdfHashType() {
            r1 = this;
            r0 = 0
            r1.hkdfHashType_ = r0
            return
    }

    private void clearHkdfSalt() {
            r1 = this;
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getHkdfSalt()
            r1.hkdfSalt_ = r0
            return
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams getDefaultInstance() {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams.Builder newBuilder() {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r0 = (com.google.crypto.tink.proto.EciesHkdfKemParams.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams.Builder newBuilder(com.google.crypto.tink.proto.EciesHkdfKemParams r1) {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesHkdfKemParams parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesHkdfKemParams> parser() {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setCurveType(com.google.crypto.tink.proto.EllipticCurveType r1) {
            r0 = this;
            int r1 = r1.getNumber()
            r0.curveType_ = r1
            return
    }

    private void setCurveTypeValue(int r1) {
            r0 = this;
            r0.curveType_ = r1
            return
    }

    private void setHkdfHashType(com.google.crypto.tink.proto.HashType r1) {
            r0 = this;
            int r1 = r1.getNumber()
            r0.hkdfHashType_ = r1
            return
    }

    private void setHkdfHashTypeValue(int r1) {
            r0 = this;
            r0.hkdfHashType_ = r1
            return
    }

    private void setHkdfSalt(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.hkdfSalt_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int[] r2 = com.google.crypto.tink.proto.EciesHkdfKemParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesHkdfKemParams> r1 = com.google.crypto.tink.proto.EciesHkdfKemParams.PARSER
            if (r1 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.proto.EciesHkdfKemParams> r2 = com.google.crypto.tink.proto.EciesHkdfKemParams.class
            monitor-enter(r2)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.EciesHkdfKemParams> r1 = com.google.crypto.tink.proto.EciesHkdfKemParams.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r1 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.EciesHkdfKemParams r3 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.EciesHkdfKemParams.PARSER = r1     // Catch: java.lang.Throwable -> L2f
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
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            return r1
        L36:
            java.lang.String r1 = "curveType_"
            java.lang.String r2 = "hkdfHashType_"
            java.lang.String r3 = "hkdfSalt_"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n"
            com.google.crypto.tink.proto.EciesHkdfKemParams r3 = com.google.crypto.tink.proto.EciesHkdfKemParams.DEFAULT_INSTANCE
            java.lang.Object r1 = newMessageInfo(r3, r2, r1)
            return r1
        L49:
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = new com.google.crypto.tink.proto.EciesHkdfKemParams$Builder
            r1.<init>(r2)
            return r1
        L4f:
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = new com.google.crypto.tink.proto.EciesHkdfKemParams
            r1.<init>()
            return r1
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public com.google.crypto.tink.proto.EllipticCurveType getCurveType() {
            r1 = this;
            int r0 = r1.curveType_
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.forNumber(r0)
            if (r0 != 0) goto La
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.UNRECOGNIZED
        La:
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getCurveTypeValue() {
            r1 = this;
            int r0 = r1.curveType_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public com.google.crypto.tink.proto.HashType getHkdfHashType() {
            r1 = this;
            int r0 = r1.hkdfHashType_
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.forNumber(r0)
            if (r0 != 0) goto La
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.UNRECOGNIZED
        La:
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getHkdfHashTypeValue() {
            r1 = this;
            int r0 = r1.hkdfHashType_
            return r0
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getHkdfSalt() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.hkdfSalt_
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
