package com.google.crypto.tink.daead;

/* JADX INFO: loaded from: classes2.dex */
public final class AesSivKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.AesSivKey> {
    private static final int KEY_SIZE_IN_BYTES = 64;



    AesSivKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.AesSivKey> r0 = com.google.crypto.tink.proto.AesSivKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.daead.AesSivKeyManager$1 r2 = new com.google.crypto.tink.daead.AesSivKeyManager$1
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r3 = com.google.crypto.tink.DeterministicAead.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    public static final com.google.crypto.tink.KeyTemplate aes256SivTemplate() {
            r0 = 64
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(int r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
            com.google.crypto.tink.proto.AesSivKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesSivKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesSivKeyFormat$Builder r1 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesSivKeyFormat r1 = (com.google.crypto.tink.proto.AesSivKeyFormat) r1
            com.google.crypto.tink.daead.AesSivKeyManager r0 = new com.google.crypto.tink.daead.AesSivKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate rawAes256SivTemplate() {
            r0 = 64
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.daead.AesSivKeyManager r0 = new com.google.crypto.tink.daead.AesSivKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesSivKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.AesSivKeyFormat, com.google.crypto.tink.proto.AesSivKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.daead.AesSivKeyManager$2 r0 = new com.google.crypto.tink.daead.AesSivKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.AesSivKeyFormat> r1 = com.google.crypto.tink.proto.AesSivKeyFormat.class
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
    public com.google.crypto.tink.proto.AesSivKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.AesSivKey r2 = com.google.crypto.tink.proto.AesSivKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.AesSivKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.AesSivKey r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.getVersion()
            int r1 = r3.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.getKeyValue()
            int r0 = r0.size()
            r1 = 64
            if (r0 != r1) goto L18
            return
        L18:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid key size: "
            r1.<init>(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getKeyValue()
            int r4 = r4.size()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ". Valid keys must have 64 bytes."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.AesSivKey r1 = (com.google.crypto.tink.proto.AesSivKey) r1
            r0.validateKey(r1)
            return
    }
}
