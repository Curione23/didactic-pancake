package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes2.dex */
public final class AesCtrHmacAeadKeyFormat extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat, com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder> implements com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat DEFAULT_INSTANCE = null;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> PARSER;
    private com.google.crypto.tink.proto.AesCtrKeyFormat aesCtrKeyFormat_;
    private com.google.crypto.tink.proto.HmacKeyFormat hmacKeyFormat_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L54
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat, com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder> implements com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1 r1) {
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

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder clearAesCtrKeyFormat() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$300(r0)
                return r1
        }

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder clearHmacKeyFormat() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$600(r0)
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

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public com.google.crypto.tink.proto.AesCtrKeyFormat getAesCtrKeyFormat() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.AesCtrKeyFormat r0 = r0.getAesCtrKeyFormat()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public com.google.crypto.tink.proto.HmacKeyFormat getHmacKeyFormat() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.HmacKeyFormat r0 = r0.getHmacKeyFormat()
                return r0
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public boolean hasAesCtrKeyFormat() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                boolean r0 = r0.hasAesCtrKeyFormat()
                return r0
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public boolean hasHmacKeyFormat() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                boolean r0 = r0.hasHmacKeyFormat()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.internalMergeFrom(r1)
                return r1
        }

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder mergeAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$200(r0, r2)
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

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder mergeHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.proto.AesCtrKeyFormat r2 = (com.google.crypto.tink.proto.AesCtrKeyFormat) r2
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
                com.google.crypto.tink.proto.HmacKeyFormat r2 = (com.google.crypto.tink.proto.HmacKeyFormat) r2
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r0
                com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.access$400(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = new com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat
            r0.<init>()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> r1 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private AesCtrHmacAeadKeyFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat access$000() {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0, com.google.crypto.tink.proto.AesCtrKeyFormat r1) {
            r0.setAesCtrKeyFormat(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0, com.google.crypto.tink.proto.AesCtrKeyFormat r1) {
            r0.mergeAesCtrKeyFormat(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0) {
            r0.clearAesCtrKeyFormat()
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0, com.google.crypto.tink.proto.HmacKeyFormat r1) {
            r0.setHmacKeyFormat(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0, com.google.crypto.tink.proto.HmacKeyFormat r1) {
            r0.mergeHmacKeyFormat(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0) {
            r0.clearHmacKeyFormat()
            return
    }

    private void clearAesCtrKeyFormat() {
            r1 = this;
            r0 = 0
            r1.aesCtrKeyFormat_ = r0
            return
    }

    private void clearHmacKeyFormat() {
            r1 = this;
            r0 = 0
            r1.hmacKeyFormat_ = r0
            return
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat getDefaultInstance() {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            return r0
    }

    private void mergeAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat r3) {
            r2 = this;
            r3.getClass()
            com.google.crypto.tink.proto.AesCtrKeyFormat r0 = r2.aesCtrKeyFormat_
            if (r0 == 0) goto L22
            com.google.crypto.tink.proto.AesCtrKeyFormat r1 = com.google.crypto.tink.proto.AesCtrKeyFormat.getDefaultInstance()
            if (r0 == r1) goto L22
            com.google.crypto.tink.proto.AesCtrKeyFormat r0 = r2.aesCtrKeyFormat_
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCtrKeyFormat.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r0.mergeFrom(r3)
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r3 = (com.google.crypto.tink.proto.AesCtrKeyFormat.Builder) r3
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.buildPartial()
            com.google.crypto.tink.proto.AesCtrKeyFormat r3 = (com.google.crypto.tink.proto.AesCtrKeyFormat) r3
            r2.aesCtrKeyFormat_ = r3
            goto L24
        L22:
            r2.aesCtrKeyFormat_ = r3
        L24:
            return
    }

    private void mergeHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat r3) {
            r2 = this;
            r3.getClass()
            com.google.crypto.tink.proto.HmacKeyFormat r0 = r2.hmacKeyFormat_
            if (r0 == 0) goto L22
            com.google.crypto.tink.proto.HmacKeyFormat r1 = com.google.crypto.tink.proto.HmacKeyFormat.getDefaultInstance()
            if (r0 == r1) goto L22
            com.google.crypto.tink.proto.HmacKeyFormat r0 = r2.hmacKeyFormat_
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r0 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r0.mergeFrom(r3)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r3 = (com.google.crypto.tink.proto.HmacKeyFormat.Builder) r3
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.buildPartial()
            com.google.crypto.tink.proto.HmacKeyFormat r3 = (com.google.crypto.tink.proto.HmacKeyFormat) r3
            r2.hmacKeyFormat_ = r3
            goto L24
        L22:
            r2.hmacKeyFormat_ = r3
        L24:
            return
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder newBuilder() {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r0 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder newBuilder(com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1) {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.Builder) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> parser() {
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r0 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setAesCtrKeyFormat(com.google.crypto.tink.proto.AesCtrKeyFormat r1) {
            r0 = this;
            r1.getClass()
            r0.aesCtrKeyFormat_ = r1
            return
    }

    private void setHmacKeyFormat(com.google.crypto.tink.proto.HmacKeyFormat r1) {
            r0 = this;
            r1.getClass()
            r0.hmacKeyFormat_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int[] r2 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 0
            switch(r1) {
                case 1: goto L4d;
                case 2: goto L47;
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> r1 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.PARSER
            if (r1 != 0) goto L32
            java.lang.Class<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> r2 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.class
            monitor-enter(r2)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat> r1 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r1 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r3 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.PARSER = r1     // Catch: java.lang.Throwable -> L2f
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
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            return r1
        L36:
            java.lang.String r1 = "aesCtrKeyFormat_"
            java.lang.String r2 = "hmacKeyFormat_"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t"
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r3 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE
            java.lang.Object r1 = newMessageInfo(r3, r2, r1)
            return r1
        L47:
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r1 = new com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder
            r1.<init>(r2)
            return r1
        L4d:
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r1 = new com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat
            r1.<init>()
            return r1
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public com.google.crypto.tink.proto.AesCtrKeyFormat getAesCtrKeyFormat() {
            r1 = this;
            com.google.crypto.tink.proto.AesCtrKeyFormat r0 = r1.aesCtrKeyFormat_
            if (r0 != 0) goto L8
            com.google.crypto.tink.proto.AesCtrKeyFormat r0 = com.google.crypto.tink.proto.AesCtrKeyFormat.getDefaultInstance()
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public com.google.crypto.tink.proto.HmacKeyFormat getHmacKeyFormat() {
            r1 = this;
            com.google.crypto.tink.proto.HmacKeyFormat r0 = r1.hmacKeyFormat_
            if (r0 != 0) goto L8
            com.google.crypto.tink.proto.HmacKeyFormat r0 = com.google.crypto.tink.proto.HmacKeyFormat.getDefaultInstance()
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public boolean hasAesCtrKeyFormat() {
            r1 = this;
            com.google.crypto.tink.proto.AesCtrKeyFormat r0 = r1.aesCtrKeyFormat_
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public boolean hasHmacKeyFormat() {
            r1 = this;
            com.google.crypto.tink.proto.HmacKeyFormat r0 = r1.hmacKeyFormat_
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
