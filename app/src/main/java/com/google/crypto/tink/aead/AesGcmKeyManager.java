package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
public final class AesGcmKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesGcmKey> {



    AesGcmKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesGcmKey> r0 = com.google.crypto.tink.proto.AesGcmKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.aead.AesGcmKeyManager$1 r2 = new com.google.crypto.tink.aead.AesGcmKeyManager$1
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$000(int r0, com.google.crypto.tink.KeyTemplate.OutputPrefixType r1) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes128GcmTemplate() {
            r0 = 16
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate aes256GcmTemplate() {
            r0 = 32
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.AesGcmKeyFormat> createKeyFormat(int r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesGcmKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r1 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesGcmKeyFormat r1 = (com.google.crypto.tink.proto.AesGcmKeyFormat) r1
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            r0.<init>(r1, r2)
            return r0
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(int r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesGcmKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r1 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesGcmKeyFormat r1 = (com.google.crypto.tink.proto.AesGcmKeyFormat) r1
            com.google.crypto.tink.aead.AesGcmKeyManager r0 = new com.google.crypto.tink.aead.AesGcmKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes128GcmTemplate() {
            r0 = 16
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256GcmTemplate() {
            r0 = 32
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesGcmKeyManager r0 = new com.google.crypto.tink.aead.AesGcmKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            com.google.crypto.tink.aead.AesGcmProtoSerialization.register()
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility fipsStatus() {
            r1 = this;
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesGcmKeyFormat, com.google.crypto.tink.proto.AesGcmKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.aead.AesGcmKeyManager$2 r0 = new com.google.crypto.tink.aead.AesGcmKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesGcmKeyFormat> r1 = com.google.crypto.tink.proto.AesGcmKeyFormat.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.AesGcmKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesGcmKey r2 = com.google.crypto.tink.proto.AesGcmKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesGcmKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesGcmKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.getKeyValue()
            int r3 = r3.size()
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r3)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesGcmKey r1 = (com.google.crypto.tink.proto.AesGcmKey) r1
            r0.validateKey(r1)
            return
    }
}
