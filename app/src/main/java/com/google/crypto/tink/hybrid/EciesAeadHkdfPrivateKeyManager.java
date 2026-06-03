package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes2.dex */
public final class EciesAeadHkdfPrivateKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey, com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> {
    private static final byte[] EMPTY_SALT = null;



    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = null;

        static {
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = r0
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.EMPTY_SALT = r0
            return
    }

    EciesAeadHkdfPrivateKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey> r0 = com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.EciesAeadHkdfPublicKey> r1 = com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$1 r3 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$1
            java.lang.Class<com.google.crypto.tink.HybridDecrypt> r4 = com.google.crypto.tink.HybridDecrypt.class
            r3.<init>(r4)
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.EMPTY_SALT
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$100(com.google.crypto.tink.proto.EllipticCurveType r0, com.google.crypto.tink.proto.HashType r1, com.google.crypto.tink.proto.EcPointFormat r2, com.google.crypto.tink.KeyTemplate r3, byte[] r4, com.google.crypto.tink.KeyTemplate.OutputPrefixType r5) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r0, r1, r2, r3, r4, r5)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat> createKeyFormat(com.google.crypto.tink.proto.EllipticCurveType r2, com.google.crypto.tink.proto.HashType r3, com.google.crypto.tink.proto.EcPointFormat r4, com.google.crypto.tink.KeyTemplate r5, byte[] r6, com.google.crypto.tink.KeyTemplate.OutputPrefixType r7) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r1 = com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r2 = createParams(r2, r3, r4, r5, r6)
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r2 = r1.setParams(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat r2 = (com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat) r2
            r0.<init>(r2, r7)
            return r0
    }

    private static com.google.crypto.tink.KeyTemplate createKeyTemplate(com.google.crypto.tink.proto.EllipticCurveType r1, com.google.crypto.tink.proto.HashType r2, com.google.crypto.tink.proto.EcPointFormat r3, com.google.crypto.tink.KeyTemplate r4, com.google.crypto.tink.KeyTemplate.OutputPrefixType r5, byte[] r6) {
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r0 = com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r1 = createParams(r1, r2, r3, r4, r6)
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r1 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat r1 = (com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat) r1
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager r2 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r2, r1, r5)
            return r1
    }

    static com.google.crypto.tink.proto.EciesAeadHkdfParams createParams(com.google.crypto.tink.proto.EllipticCurveType r1, com.google.crypto.tink.proto.HashType r2, com.google.crypto.tink.proto.EcPointFormat r3, com.google.crypto.tink.KeyTemplate r4, byte[] r5) {
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.newBuilder()
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = r0.setCurveType(r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = r1.setHkdfHashType(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r5)
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = r1.setHkdfSalt(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r5 = r4.getTypeUrl()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setTypeUrl(r5)
            byte[] r5 = r4.getValue()
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r5)
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setValue(r5)
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = r4.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r4 = toProto(r4)
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setOutputPrefixType(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            com.google.crypto.tink.proto.EciesAeadDemParams$Builder r4 = com.google.crypto.tink.proto.EciesAeadDemParams.newBuilder()
            com.google.crypto.tink.proto.EciesAeadDemParams$Builder r2 = r4.setAeadDem(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EciesAeadDemParams r2 = (com.google.crypto.tink.proto.EciesAeadDemParams) r2
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r4 = com.google.crypto.tink.proto.EciesAeadHkdfParams.newBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r1 = r4.setKemParams(r1)
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r1 = r1.setDemParams(r2)
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r1 = r1.setEcPointFormat(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r1 = (com.google.crypto.tink.proto.EciesAeadHkdfParams) r1
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate eciesP256HkdfHmacSha256Aes128CtrHmacSha256Template() {
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            com.google.crypto.tink.KeyTemplate r3 = com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.aes128CtrHmacSha256Template()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            byte[] r5 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.EMPTY_SALT
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate eciesP256HkdfHmacSha256Aes128GcmTemplate() {
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            com.google.crypto.tink.KeyTemplate r3 = com.google.crypto.tink.aead.AesGcmKeyManager.aes128GcmTemplate()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            byte[] r5 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.EMPTY_SALT
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawEciesP256HkdfHmacSha256Aes128CtrHmacSha256CompressedTemplate() {
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED
            com.google.crypto.tink.KeyTemplate r3 = com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.aes128CtrHmacSha256Template()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            byte[] r5 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.EMPTY_SALT
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate rawEciesP256HkdfHmacSha256Aes128GcmCompressedTemplate() {
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED
            com.google.crypto.tink.KeyTemplate r3 = com.google.crypto.tink.aead.AesGcmKeyManager.aes128GcmTemplate()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            byte[] r5 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.EMPTY_SALT
            com.google.crypto.tink.KeyTemplate r0 = createKeyTemplate(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager r0 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager
            r0.<init>()
            com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager r1 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            return
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProto(com.google.crypto.tink.KeyTemplate.OutputPrefixType r1) {
            int[] r0 = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L22
            r0 = 3
            if (r1 == r0) goto L1f
            r0 = 4
            if (r1 != r0) goto L17
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r1
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown output prefix type"
            r1.<init>(r0)
            throw r1
        L1f:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r1
        L22:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r1
        L25:
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.EciesAeadHkdfPublicKey getPublicKey(com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = r1.getPublicKey()
            return r1
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey) r1
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat, com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$2 r0 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat> r1 = com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey r2 = com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.EciesAeadHkdfPublicKey r3 = r3.getPublicKey()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r3 = r3.getParams()
            com.google.crypto.tink.hybrid.HybridUtil.validate(r3)
            return
        L21:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid ECIES private key"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey r1 = (com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
