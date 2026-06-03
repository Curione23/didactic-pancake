package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
class JwtRsaSsaPkcs1VerifyKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey> {


    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = null;

        static {
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public JwtRsaSsaPkcs1VerifyKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey> r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager$1 r2 = new com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager$1
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r3 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ java.security.interfaces.RSAPublicKey access$000(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r0) throws java.security.GeneralSecurityException {
            java.security.interfaces.RSAPublicKey r0 = createPublicKey(r0)
            return r0
    }

    private static final java.security.interfaces.RSAPublicKey createPublicKey(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "RSA"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.math.BigInteger r1 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r4.getN()
            byte[] r2 = r2.toByteArray()
            r3 = 1
            r1.<init>(r3, r2)
            java.math.BigInteger r2 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getE()
            byte[] r4 = r4.toByteArray()
            r2.<init>(r3, r4)
            java.security.spec.RSAPublicKeySpec r4 = new java.security.spec.RSAPublicKeySpec
            r4.<init>(r1, r2)
            java.security.PublicKey r4 = r0.generatePublic(r4)
            java.security.interfaces.RSAPublicKey r4 = (java.security.interfaces.RSAPublicKey) r4
            return r4
    }

    public static com.google.crypto.tink.subtle.Enums.HashType hashForPkcs1Algorithm(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            return r3
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown algorithm "
            r1.<init>(r2)
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
            return r3
        L30:
            com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            return r3
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r2 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.getVersion()
            int r1 = r3.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getN()
            byte[] r1 = r1.toByteArray()
            r2 = 1
            r0.<init>(r2, r1)
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getE()
            byte[] r4 = r4.toByteArray()
            r0.<init>(r2, r4)
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r1 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) r1
            r0.validateKey(r1)
            return
    }
}
