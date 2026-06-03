package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
public class KmsAeadKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.KmsAeadKey> {



    KmsAeadKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.KmsAeadKey> r0 = com.google.crypto.tink.proto.KmsAeadKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.aead.KmsAeadKeyManager$1 r2 = new com.google.crypto.tink.aead.KmsAeadKeyManager$1
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static com.google.crypto.tink.proto.KmsAeadKeyFormat createKeyFormat(java.lang.String r1) {
            com.google.crypto.tink.proto.KmsAeadKeyFormat$Builder r0 = com.google.crypto.tink.proto.KmsAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.KmsAeadKeyFormat$Builder r1 = r0.setKeyUri(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KmsAeadKeyFormat r1 = (com.google.crypto.tink.proto.KmsAeadKeyFormat) r1
            return r1
    }

    public static com.google.crypto.tink.KeyTemplate createKeyTemplate(java.lang.String r2) {
            com.google.crypto.tink.proto.KmsAeadKeyFormat r2 = createKeyFormat(r2)
            com.google.crypto.tink.aead.KmsAeadKeyManager r0 = new com.google.crypto.tink.aead.KmsAeadKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            byte[] r2 = r2.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r2 = com.google.crypto.tink.KeyTemplate.create(r0, r2, r1)
            return r2
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.KmsAeadKeyManager r0 = new com.google.crypto.tink.aead.KmsAeadKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.KmsAeadKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.KmsAeadKeyFormat, com.google.crypto.tink.proto.KmsAeadKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.aead.KmsAeadKeyManager$2 r0 = new com.google.crypto.tink.aead.KmsAeadKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.KmsAeadKeyFormat> r1 = com.google.crypto.tink.proto.KmsAeadKeyFormat.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KmsAeadKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.KmsAeadKey r2 = com.google.crypto.tink.proto.KmsAeadKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.KmsAeadKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.KmsAeadKey r2) throws java.security.GeneralSecurityException {
            r1 = this;
            int r2 = r2.getVersion()
            int r0 = r1.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r2, r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.KmsAeadKey r1 = (com.google.crypto.tink.proto.KmsAeadKey) r1
            r0.validateKey(r1)
            return
    }
}
