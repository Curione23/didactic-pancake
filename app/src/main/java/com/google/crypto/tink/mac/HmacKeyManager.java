package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes2.dex */
public final class HmacKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.HmacKey> {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.mac.ChunkedMac> CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = null;
    private static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private static final int MIN_TAG_SIZE_IN_BYTES = 10;



    /* JADX INFO: renamed from: com.google.crypto.tink.mac.HmacKeyManager$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.mac.HmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.mac.HmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.mac.HmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.mac.HmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.mac.HmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    static {
            com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda0 r0 = new com.google.crypto.tink.mac.HmacKeyManager$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.mac.HmacKey> r1 = com.google.crypto.tink.mac.HmacKey.class
            java.lang.Class<com.google.crypto.tink.mac.ChunkedMac> r2 = com.google.crypto.tink.mac.ChunkedMac.class
            com.google.crypto.tink.internal.PrimitiveConstructor r0 = com.google.crypto.tink.internal.PrimitiveConstructor.create(r0, r1, r2)
            com.google.crypto.tink.mac.HmacKeyManager.CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR = r0
            return
    }

    public HmacKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.HmacKey> r0 = com.google.crypto.tink.proto.HmacKey.class
            r1 = 1
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.mac.HmacKeyManager$1 r2 = new com.google.crypto.tink.mac.HmacKeyManager$1
            java.lang.Class<com.google.crypto.tink.Mac> r3 = com.google.crypto.tink.Mac.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ void access$000(com.google.crypto.tink.proto.HmacParams r0) throws java.security.GeneralSecurityException {
            validateParams(r0)
            return
    }

    static /* synthetic */ com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat access$100(int r0, int r1, com.google.crypto.tink.proto.HashType r2, com.google.crypto.tink.KeyTemplate.OutputPrefixType r3) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = createKeyFormat(r0, r1, r2, r3)
            return r0
    }

    private static com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<com.google.crypto.tink.proto.HmacKeyFormat> createKeyFormat(int r3, int r4, com.google.crypto.tink.proto.HashType r5, com.google.crypto.tink.KeyTemplate.OutputPrefixType r6) {
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat r0 = new com.google.crypto.tink.internal.KeyTypeManager$KeyFactory$KeyFormat
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r2 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r5 = r2.setHash(r5)
            com.google.crypto.tink.proto.HmacParams$Builder r4 = r5.setTagSize(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.HmacParams r4 = (com.google.crypto.tink.proto.HmacParams) r4
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r4 = r1.setParams(r4)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r3 = r4.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.HmacKeyFormat r3 = (com.google.crypto.tink.proto.HmacKeyFormat) r3
            r0.<init>(r3, r6)
            return r0
    }

    private static com.google.crypto.tink.KeyTemplate createTemplate(int r1, int r2, com.google.crypto.tink.proto.HashType r3) {
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r3 = r0.setHash(r3)
            com.google.crypto.tink.proto.HmacParams$Builder r2 = r3.setTagSize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.HmacParams r2 = (com.google.crypto.tink.proto.HmacParams) r2
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r3 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r2 = r3.setParams(r2)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r2.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacKeyFormat r1 = (com.google.crypto.tink.proto.HmacKeyFormat) r1
            com.google.crypto.tink.mac.HmacKeyManager r2 = new com.google.crypto.tink.mac.HmacKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r2, r1, r3)
            return r1
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha256HalfDigestTemplate() {
            r0 = 16
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            r2 = 32
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r2, r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha256Template() {
            r0 = 32
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha512HalfDigestTemplate() {
            r0 = 32
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            r2 = 64
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r2, r0, r1)
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hmacSha512Template() {
            r0 = 64
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.KeyTemplate r0 = createTemplate(r0, r0, r1)
            return r0
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.HmacKeyManager r0 = new com.google.crypto.tink.mac.HmacKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            com.google.crypto.tink.mac.HmacProtoSerialization.register()
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r1 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance()
            com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.mac.ChunkedMac> r0 = com.google.crypto.tink.mac.HmacKeyManager.CHUNKED_MAC_PRIMITIVE_CONSTRUCTOR
            r1.registerPrimitiveConstructor(r0)
            return
    }

    private static void validateParams(com.google.crypto.tink.proto.HmacParams r3) throws java.security.GeneralSecurityException {
            int r0 = r3.getTagSize()
            r1 = 10
            if (r0 < r1) goto L78
            int[] r0 = com.google.crypto.tink.mac.HmacKeyManager.AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType
            com.google.crypto.tink.proto.HashType r1 = r3.getHash()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            java.lang.String r2 = "tag size too big"
            if (r0 == r1) goto L69
            r1 = 2
            if (r0 == r1) goto L5a
            r1 = 3
            if (r0 == r1) goto L4b
            r1 = 4
            if (r0 == r1) goto L3c
            r1 = 5
            if (r0 != r1) goto L34
            int r3 = r3.getTagSize()
            r0 = 64
            if (r3 > r0) goto L2e
            goto L71
        L2e:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L34:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown hash type"
            r3.<init>(r0)
            throw r3
        L3c:
            int r3 = r3.getTagSize()
            r0 = 48
            if (r3 > r0) goto L45
            goto L71
        L45:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L4b:
            int r3 = r3.getTagSize()
            r0 = 32
            if (r3 > r0) goto L54
            goto L71
        L54:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L5a:
            int r3 = r3.getTagSize()
            r0 = 28
            if (r3 > r0) goto L63
            goto L71
        L63:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L69:
            int r3 = r3.getTagSize()
            r0 = 20
            if (r3 > r0) goto L72
        L71:
            return
        L72:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L78:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "tag size too small"
            r3.<init>(r0)
            throw r3
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HmacKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.HmacKeyFormat, com.google.crypto.tink.proto.HmacKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.mac.HmacKeyManager$2 r0 = new com.google.crypto.tink.mac.HmacKeyManager$2
            java.lang.Class<com.google.crypto.tink.proto.HmacKeyFormat> r1 = com.google.crypto.tink.proto.HmacKeyFormat.class
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
    public com.google.crypto.tink.proto.HmacKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.HmacKey r2 = com.google.crypto.tink.proto.HmacKey.parseFrom(r2, r0)
            return r2
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.HmacKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.HmacKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            r1 = 16
            if (r0 < r1) goto L1f
            com.google.crypto.tink.proto.HmacParams r3 = r3.getParams()
            validateParams(r3)
            return
        L1f:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "key too short"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.HmacKey r1 = (com.google.crypto.tink.proto.HmacKey) r1
            r0.validateKey(r1)
            return
    }
}
