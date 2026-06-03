package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
public final class JwtHmacKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.JwtHmacKey> {



    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtHmacKeyManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm = null;

        static {
                com.google.crypto.tink.proto.JwtHmacAlgorithm[] r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm = r0
                com.google.crypto.tink.proto.JwtHmacAlgorithm r1 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.JwtHmacAlgorithm r1 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.JwtHmacAlgorithm r1 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS512     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    @com.google.errorprone.annotations.Immutable
    private static final class JwtHmac implements com.google.crypto.tink.jwt.JwtMacInternal {
        private final java.lang.String algorithm;
        private final java.util.Optional<java.lang.String> customKidFromHmacKey;
        private final com.google.crypto.tink.subtle.PrfMac prfMac;

        public JwtHmac(java.lang.String r1, java.util.Optional<java.lang.String> r2, com.google.crypto.tink.subtle.PrfMac r3) {
                r0 = this;
                r0.<init>()
                r0.algorithm = r1
                r0.customKidFromHmacKey = r2
                r0.prfMac = r3
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtMacInternal
        public java.lang.String computeMacAndEncodeWithKid(com.google.crypto.tink.jwt.RawJwt r2, java.util.Optional<java.lang.String> r3) throws java.security.GeneralSecurityException {
                r1 = this;
                java.util.Optional<java.lang.String> r0 = r1.customKidFromHmacKey
                boolean r0 = r0.isPresent()
                if (r0 == 0) goto L19
                boolean r3 = r3.isPresent()
                if (r3 != 0) goto L11
                java.util.Optional<java.lang.String> r3 = r1.customKidFromHmacKey
                goto L19
            L11:
                com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
                java.lang.String r3 = "custom_kid can only be set for RAW keys."
                r2.<init>(r3)
                throw r2
            L19:
                java.lang.String r0 = r1.algorithm
                java.lang.String r2 = com.google.crypto.tink.jwt.JwtFormat.createUnsignedCompact(r0, r3, r2)
                com.google.crypto.tink.subtle.PrfMac r3 = r1.prfMac
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
                byte[] r0 = r2.getBytes(r0)
                byte[] r3 = r3.computeMac(r0)
                java.lang.String r2 = com.google.crypto.tink.jwt.JwtFormat.createSignedCompact(r2, r3)
                return r2
        }

        @Override // com.google.crypto.tink.jwt.JwtMacInternal
        public com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecodeWithKid(java.lang.String r5, com.google.crypto.tink.jwt.JwtValidator r6, java.util.Optional<java.lang.String> r7) throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.jwt.JwtFormat$Parts r5 = com.google.crypto.tink.jwt.JwtFormat.splitSignedCompact(r5)
                com.google.crypto.tink.subtle.PrfMac r0 = r4.prfMac
                byte[] r1 = r5.signatureOrMac
                java.lang.String r2 = r5.unsignedCompact
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.US_ASCII
                byte[] r2 = r2.getBytes(r3)
                r0.verifyMac(r1, r2)
                java.lang.String r0 = r5.header
                com.google.gson.JsonObject r0 = com.google.crypto.tink.jwt.JsonUtil.parseJson(r0)
                java.lang.String r1 = r4.algorithm
                java.util.Optional<java.lang.String> r2 = r4.customKidFromHmacKey
                com.google.crypto.tink.jwt.JwtFormat.validateHeader(r1, r7, r2, r0)
                java.util.Optional r7 = com.google.crypto.tink.jwt.JwtFormat.getTypeHeader(r0)
                java.lang.String r5 = r5.payload
                com.google.crypto.tink.jwt.RawJwt r5 = com.google.crypto.tink.jwt.RawJwt.fromJsonPayload(r7, r5)
                com.google.crypto.tink.jwt.VerifiedJwt r5 = r6.validate(r5)
                return r5
        }
    }

    public JwtHmacKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.JwtHmacKey> r0 = com.google.crypto.tink.proto.JwtHmacKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.jwt.JwtHmacKeyManager$1 r2 = new com.google.crypto.tink.jwt.JwtHmacKeyManager$1
            java.lang.Class<com.google.crypto.tink.jwt.JwtMacInternal> r3 = com.google.crypto.tink.jwt.JwtMacInternal.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ java.lang.String access$000(com.google.crypto.tink.proto.JwtHmacAlgorithm r0) throws java.security.GeneralSecurityException {
            java.lang.String r0 = getHmacAlgorithm(r0)
            return r0
    }

    static /* synthetic */ java.lang.String access$100(com.google.crypto.tink.proto.JwtHmacAlgorithm r0) throws java.security.GeneralSecurityException {
            java.lang.String r0 = getAlgorithmName(r0)
            return r0
    }

    static /* synthetic */ int access$200(com.google.crypto.tink.proto.JwtHmacAlgorithm r0) throws java.security.GeneralSecurityException {
            int r0 = getMinimumKeySizeInBytes(r0)
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$300(com.google.crypto.tink.proto.JwtHmacAlgorithm r0, int r1, com.google.crypto.tink.KeyTemplate.OutputPrefixType r2) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r0, r1, r2)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.JwtHmacKeyFormat> createKeyFormat(com.google.crypto.tink.proto.JwtHmacAlgorithm r1, int r2, com.google.crypto.tink.KeyTemplate.OutputPrefixType r3) {
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = com.google.crypto.tink.proto.JwtHmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r1 = r0.setAlgorithm(r1)
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.JwtHmacKeyFormat r1 = (com.google.crypto.tink.proto.JwtHmacKeyFormat) r1
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r2 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            r2.<init>(r1, r3)
            return r2
    }

    private static com.google.crypto.tink.KeyTemplate createTemplate(com.google.crypto.tink.proto.JwtHmacAlgorithm r1, int r2) {
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r0 = com.google.crypto.tink.proto.JwtHmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r1 = r0.setAlgorithm(r1)
            com.google.crypto.tink.proto.JwtHmacKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.JwtHmacKeyFormat r1 = (com.google.crypto.tink.proto.JwtHmacKeyFormat) r1
            com.google.crypto.tink.jwt.JwtHmacKeyManager r2 = new com.google.crypto.tink.jwt.JwtHmacKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r2, r1, r0)
            return r1
    }

    private static final java.lang.String getAlgorithmName(com.google.crypto.tink.proto.JwtHmacAlgorithm r1) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            java.lang.String r1 = "HS512"
            return r1
        L14:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown algorithm"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.String r1 = "HS384"
            return r1
        L1f:
            java.lang.String r1 = "HS256"
            return r1
    }

    private static final java.lang.String getHmacAlgorithm(com.google.crypto.tink.proto.JwtHmacAlgorithm r1) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            java.lang.String r1 = "HMACSHA512"
            return r1
        L14:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown algorithm"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.String r1 = "HMACSHA384"
            return r1
        L1f:
            java.lang.String r1 = "HMACSHA256"
            return r1
    }

    private static final int getMinimumKeySizeInBytes(com.google.crypto.tink.proto.JwtHmacAlgorithm r1) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.jwt.JwtHmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$JwtHmacAlgorithm
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            r1 = 64
            return r1
        L14:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown algorithm"
            r1.<init>(r0)
            throw r1
        L1c:
            r1 = 48
            return r1
        L1f:
            r1 = 32
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate hs256Template() {
            com.google.crypto.tink.proto.JwtHmacAlgorithm r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS256
            r1 = 32
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hs384Template() {
            com.google.crypto.tink.proto.JwtHmacAlgorithm r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS384
            r1 = 48
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hs512Template() {
            com.google.crypto.tink.proto.JwtHmacAlgorithm r0 = com.google.crypto.tink.proto.JwtHmacAlgorithm.HS512
            r1 = 64
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r1)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtHmacKeyManager r0 = new com.google.crypto.tink.jwt.JwtHmacKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.JwtHmacKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.JwtHmacKeyFormat, com.google.crypto.tink.proto.JwtHmacKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.jwt.JwtHmacKeyManager$2 r0 = new com.google.crypto.tink.jwt.JwtHmacKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.JwtHmacKeyFormat> r1 = com.google.crypto.tink.proto.JwtHmacKeyFormat.class
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
    public com.google.crypto.tink.proto.JwtHmacKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.JwtHmacKey r2 = com.google.crypto.tink.proto.JwtHmacKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.JwtHmacKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.JwtHmacKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            com.google.crypto.tink.proto.JwtHmacAlgorithm r3 = r3.getAlgorithm()
            int r3 = getMinimumKeySizeInBytes(r3)
            if (r0 < r3) goto L1e
            return
        L1e:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "key too short"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.JwtHmacKey r1 = (com.google.crypto.tink.proto.JwtHmacKey) r1
            r0.validateKey(r1)
            return
    }
}
