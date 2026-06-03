package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
class JwtEcdsaVerifyKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.JwtEcdsaPublicKey> {

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = null;

        static {
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm[] r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = r0
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    private static class JwtPublicKeyVerifyFactory extends com.google.crypto.tink.internal.PrimitiveFactory<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal, com.google.crypto.tink.proto.JwtEcdsaPublicKey> {


        public JwtPublicKeyVerifyFactory() {
                r1 = this;
                java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal.class
                r1.<init>(r0)
                return
        }

        public com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal getPrimitive(com.google.crypto.tink.proto.JwtEcdsaPublicKey r5) throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = r5.getAlgorithm()
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.getCurve(r0)
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r5.getX()
                byte[] r1 = r1.toByteArray()
                com.google.crypto.tink.shaded.protobuf.ByteString r2 = r5.getY()
                byte[] r2 = r2.toByteArray()
                java.security.interfaces.ECPublicKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r0, r1, r2)
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = r5.getAlgorithm()
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.hashForEcdsaAlgorithm(r1)
                com.google.crypto.tink.subtle.EcdsaVerifyJce r2 = new com.google.crypto.tink.subtle.EcdsaVerifyJce
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r3 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
                r2.<init>(r0, r1, r3)
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = r5.getAlgorithm()
                java.lang.String r0 = r0.name()
                boolean r1 = r5.hasCustomKid()
                if (r1 == 0) goto L46
                com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r5 = r5.getCustomKid()
                java.lang.String r5 = r5.getValue()
                java.util.Optional r5 = java.util.Optional.of(r5)
                goto L4a
            L46:
                java.util.Optional r5 = java.util.Optional.empty()
            L4a:
                com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory$1 r1 = new com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory$1
                r1.<init>(r4, r2, r0, r5)
                return r1
        }

        @Override // com.google.crypto.tink.internal.PrimitiveFactory
        public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
                r0 = this;
                com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
                com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal r1 = r0.getPrimitive(r1)
                return r1
        }
    }

    public JwtEcdsaVerifyKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtEcdsaPublicKey> r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory r2 = new com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$JwtPublicKeyVerifyFactory
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static final com.google.crypto.tink.subtle.EllipticCurves.CurveType getCurve(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
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
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            return r3
        L30:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            return r3
    }

    public static com.google.crypto.tink.subtle.Enums.HashType hashForEcdsaAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm
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

    static final void validateEcdsaAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0) throws java.security.GeneralSecurityException {
            hashForEcdsaAlgorithm(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey"
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
    public com.google.crypto.tink.proto.JwtEcdsaPublicKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r2 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtEcdsaPublicKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3 = r3.getAlgorithm()
            validateEcdsaAlgorithm(r3)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r1 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r1
            r0.validateKey(r1)
            return
    }
}
