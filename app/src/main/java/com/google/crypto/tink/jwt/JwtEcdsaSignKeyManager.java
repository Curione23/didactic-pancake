package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
public final class JwtEcdsaSignKeyManager extends com.google.crypto.tink.internal.PrivateKeyTypeManager<com.google.crypto.tink.proto.JwtEcdsaPrivateKey, com.google.crypto.tink.proto.JwtEcdsaPublicKey> {


    private static class JwtPublicKeySignFactory extends com.google.crypto.tink.internal.PrimitiveFactory<com.google.crypto.tink.jwt.JwtPublicKeySignInternal, com.google.crypto.tink.proto.JwtEcdsaPrivateKey> {


        public JwtPublicKeySignFactory() {
                r1 = this;
                java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeySignInternal.class
                r1.<init>(r0)
                return
        }

        private static final void selfTestKey(java.security.interfaces.ECPrivateKey r3, com.google.crypto.tink.proto.JwtEcdsaPrivateKey r4) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = r4.getPublicKey()
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = r0.getAlgorithm()
                com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.hashForEcdsaAlgorithm(r0)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = r4.getPublicKey()
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = r1.getAlgorithm()
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.getCurve(r1)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r2 = r4.getPublicKey()
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getX()
                byte[] r2 = r2.toByteArray()
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r4 = r4.getPublicKey()
                com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getY()
                byte[] r4 = r4.toByteArray()
                java.security.interfaces.ECPublicKey r4 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r1, r2, r4)
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r1 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
                com.google.crypto.tink.subtle.SelfKeyTestValidators.validateEcdsa(r3, r4, r0, r1)
                return
        }

        public com.google.crypto.tink.jwt.JwtPublicKeySignInternal getPrimitive(com.google.crypto.tink.proto.JwtEcdsaPrivateKey r6) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = r6.getPublicKey()
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = r0.getAlgorithm()
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.getCurve(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r6.getKeyValue()
                byte[] r1 = r1.toByteArray()
                java.security.interfaces.ECPrivateKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(r0, r1)
                selfTestKey(r0, r6)
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = r6.getPublicKey()
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = r1.getAlgorithm()
                com.google.crypto.tink.subtle.Enums$HashType r2 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.hashForEcdsaAlgorithm(r1)
                com.google.crypto.tink.subtle.EcdsaSignJce r3 = new com.google.crypto.tink.subtle.EcdsaSignJce
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r4 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
                r3.<init>(r0, r2, r4)
                java.lang.String r0 = r1.name()
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = r6.getPublicKey()
                boolean r1 = r1.hasCustomKid()
                if (r1 == 0) goto L4d
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r6 = r6.getPublicKey()
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r6 = r6.getCustomKid()
                java.lang.String r6 = r6.getValue()
                java.util.Optional r6 = java.util.Optional.of(r6)
                goto L51
            L4d:
                java.util.Optional r6 = java.util.Optional.empty()
            L51:
                com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$JwtPublicKeySignFactory$1 r1 = new com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$JwtPublicKeySignFactory$1
                r1.<init>(r5, r6, r0, r3)
                return r1
        }

        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeySignInternal getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
                r0 = this;
                com.google.crypto.tink.proto.JwtEcdsaPrivateKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPrivateKey) r1
                com.google.crypto.tink.jwt.JwtPublicKeySignInternal r1 = r0.getPrimitive(r1)
                return r1
        }
    }

    JwtEcdsaSignKeyManager() {
            r5 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPrivateKey> r0 = com.google.crypto.tink.proto.JwtEcdsaPrivateKey.class
            java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPublicKey> r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.class
            r2 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r2 = new com.google.crypto.tink.internal.PrimitiveFactory[r2]
            com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$JwtPublicKeySignFactory r3 = new com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$JwtPublicKeySignFactory
            r3.<init>()
            r4 = 0
            r2[r4] = r3
            r5.<init>(r0, r1, r2)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$000(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0, com.google.crypto.tink.KeyTemplate.OutputPrefixType r1) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r0, r1)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.JwtEcdsaKeyFormat> createKeyFormat(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
            com.google.crypto.tink.proto.JwtEcdsaKeyFormat$Builder r0 = com.google.crypto.tink.proto.JwtEcdsaKeyFormat.newBuilder()
            com.google.crypto.tink.proto.JwtEcdsaKeyFormat$Builder r1 = r0.setAlgorithm(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.JwtEcdsaKeyFormat r1 = (com.google.crypto.tink.proto.JwtEcdsaKeyFormat) r1
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            r0.<init>(r1, r2)
            return r0
    }

    public static void registerPair(boolean r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager r0 = new com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager
            r0.<init>()
            com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager r1 = new com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager
            r1.<init>()
            com.google.crypto.tink.Registry.registerAsymmetricKeyManagers(r0, r1, r2)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtEcdsaPrivateKey"
            return r0
    }

    public com.google.crypto.tink.proto.JwtEcdsaPublicKey getPublicKey(com.google.crypto.tink.proto.JwtEcdsaPrivateKey r1) {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = r1.getPublicKey()
            return r1
    }

    @Override // com.google.crypto.tink.internal.PrivateKeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getPublicKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPrivateKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPrivateKey) r1
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = r0.getPublicKey(r1)
            return r1
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.JwtEcdsaKeyFormat, com.google.crypto.tink.proto.JwtEcdsaPrivateKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$1 r0 = new com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager$1
            java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaKeyFormat> r1 = com.google.crypto.tink.proto.JwtEcdsaKeyFormat.class
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
    public com.google.crypto.tink.proto.JwtEcdsaPrivateKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtEcdsaPrivateKey r2 = com.google.crypto.tink.proto.JwtEcdsaPrivateKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPrivateKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtEcdsaPrivateKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r3 = r3.getPublicKey()
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3 = r3.getAlgorithm()
            com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.validateEcdsaAlgorithm(r3)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPrivateKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPrivateKey) r1
            r0.validateKey(r1)
            return
    }
}
