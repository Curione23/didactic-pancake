package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes2.dex */
final class HkdfPrfProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.prf.HkdfPrfKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.prf.HkdfPrfParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.prf.HkdfPrfProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$Cd7BK-0UX4it_C-F5LEzj5wO9ak, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization m708$r8$lambda$Cd7BK0UX4it_CF5LEzj5wO9ak(com.google.crypto.tink.prf.HkdfPrfKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.prf.HkdfPrfKey $r8$lambda$IpFaC26ZHcYc5OZmbpVL0zf3U9I(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.prf.HkdfPrfKey r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$WLzwSoWAQkBnmSJqjqrLA0gJJjM(com.google.crypto.tink.prf.HkdfPrfParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.prf.HkdfPrfParameters $r8$lambda$yumWNCDl_IPEwJGNKCgAQCdZimM(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.prf.HkdfPrfParameters r0 = parseParameters(r0)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda0 r1 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda0
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.prf.HkdfPrfParameters> r2 = com.google.crypto.tink.prf.HkdfPrfParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r1 = com.google.crypto.tink.internal.ParametersSerializer.create(r1, r2, r3)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_SERIALIZER = r1
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda1 r1 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda1
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r1 = com.google.crypto.tink.internal.ParametersParser.create(r1, r0, r2)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_PARSER = r1
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda2 r1 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda2
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.prf.HkdfPrfKey> r2 = com.google.crypto.tink.prf.HkdfPrfKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r3 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r1 = com.google.crypto.tink.internal.KeySerializer.create(r1, r2, r3)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_SERIALIZER = r1
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda3 r1 = new com.google.crypto.tink.prf.HkdfPrfProtoSerialization$$ExternalSyntheticLambda3
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r1, r0, r2)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_PARSER = r0
            return
    }

    private HkdfPrfProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.HkdfPrfParams getProtoParams(com.google.crypto.tink.prf.HkdfPrfParameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r0 = com.google.crypto.tink.proto.HkdfPrfParams.newBuilder()
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r1 = r2.getHashType()
            com.google.crypto.tink.proto.HashType r1 = toProtoHashType(r1)
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r0 = r0.setHash(r1)
            com.google.crypto.tink.util.Bytes r1 = r2.getSalt()
            if (r1 == 0) goto L2f
            com.google.crypto.tink.util.Bytes r1 = r2.getSalt()
            int r1 = r1.size()
            if (r1 <= 0) goto L2f
            com.google.crypto.tink.util.Bytes r2 = r2.getSalt()
            byte[] r2 = r2.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            r0.setSalt(r2)
        L2f:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r0.build()
            com.google.crypto.tink.proto.HkdfPrfParams r2 = (com.google.crypto.tink.proto.HkdfPrfParams) r2
            return r2
    }

    private static com.google.crypto.tink.prf.HkdfPrfKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r2, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r3) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r2.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.getValue()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.proto.HkdfPrfKey r0 = com.google.crypto.tink.proto.HkdfPrfKey.parseFrom(r0, r1)     // Catch: java.lang.Throwable -> L8d
            int r1 = r0.getVersion()     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L85
            java.lang.Integer r2 = r2.getIdRequirementOrNull()     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L7d
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r2 = com.google.crypto.tink.prf.HkdfPrfParameters.builder()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r0.getKeyValue()     // Catch: java.lang.Throwable -> L8d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r2 = r2.setKeySizeBytes(r1)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.proto.HkdfPrfParams r1 = r0.getParams()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.proto.HashType r1 = r1.getHash()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r1 = toHashType(r1)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r2 = r2.setHashType(r1)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.proto.HkdfPrfParams r1 = r0.getParams()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getSalt()     // Catch: java.lang.Throwable -> L8d
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r1)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r2 = r2.setSalt(r1)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfParameters r2 = r2.build()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfKey$Builder r1 = com.google.crypto.tink.prf.HkdfPrfKey.builder()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfKey$Builder r2 = r1.setParameters(r2)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getKeyValue()     // Catch: java.lang.Throwable -> L8d
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.SecretKeyAccess r3 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r3)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.util.SecretBytes r3 = com.google.crypto.tink.util.SecretBytes.copyFrom(r0, r3)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfKey$Builder r2 = r2.setKeyBytes(r3)     // Catch: java.lang.Throwable -> L8d
            com.google.crypto.tink.prf.HkdfPrfKey r2 = r2.build()     // Catch: java.lang.Throwable -> L8d
            return r2
        L7d:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "ID requirement must be null."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8d
            throw r2     // Catch: java.lang.Throwable -> L8d
        L85:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "Only version 0 keys are accepted"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8d
            throw r2     // Catch: java.lang.Throwable -> L8d
        L8d:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Parsing HkdfPrfKey failed"
            r2.<init>(r3)
            throw r2
        L95:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong type URL in call to HkdfPrfProtoSerialization.parseKey"
            r2.<init>(r3)
            throw r2
    }

    private static com.google.crypto.tink.prf.HkdfPrfParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L91
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L88
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L88
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L88
            com.google.crypto.tink.proto.HkdfPrfKeyFormat r0 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L88
            int r1 = r0.getVersion()
            if (r1 != 0) goto L6f
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r3 != r1) goto L67
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r3 = com.google.crypto.tink.prf.HkdfPrfParameters.builder()
            int r1 = r0.getKeySize()
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r3 = r3.setKeySizeBytes(r1)
            com.google.crypto.tink.proto.HkdfPrfParams r1 = r0.getParams()
            com.google.crypto.tink.proto.HashType r1 = r1.getHash()
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r1 = toHashType(r1)
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r3 = r3.setHashType(r1)
            com.google.crypto.tink.proto.HkdfPrfParams r0 = r0.getParams()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getSalt()
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r3 = r3.setSalt(r0)
            com.google.crypto.tink.prf.HkdfPrfParameters r3 = r3.build()
            return r3
        L67:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Parsing HkdfPrfParameters failed: only RAW output prefix type is accepted"
            r3.<init>(r0)
            throw r3
        L6f:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parsing HkdfPrfParameters failed: unknown Version "
            r1.<init>(r2)
            int r0 = r0.getVersion()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L88:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing HkdfPrfParameters failed: "
            r0.<init>(r1, r3)
            throw r0
        L91:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: "
            r1.<init>(r2)
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            java.lang.String r3 = r3.getTypeUrl()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.MutableSerializationRegistry r0 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()
            register(r0)
            return
    }

    public static void register(com.google.crypto.tink.internal.MutableSerializationRegistry r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.prf.HkdfPrfParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.prf.HkdfPrfKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.prf.HkdfPrfKey r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HkdfPrfKey$Builder r0 = com.google.crypto.tink.proto.HkdfPrfKey.newBuilder()
            com.google.crypto.tink.prf.HkdfPrfParameters r1 = r3.getParameters()
            com.google.crypto.tink.proto.HkdfPrfParams r1 = getProtoParams(r1)
            com.google.crypto.tink.proto.HkdfPrfKey$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.util.SecretBytes r1 = r3.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)
            byte[] r4 = r1.toByteArray(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.HkdfPrfKey$Builder r4 = r0.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.HkdfPrfKey r4 = (com.google.crypto.tink.proto.HkdfPrfKey) r4
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r2, r4, r0, r1, r3)
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.prf.HkdfPrfParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r1 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HkdfPrfParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r1 = r1.setParams(r2)
            int r3 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r3 = r1.setKeySize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.HkdfPrfKeyFormat r3 = (com.google.crypto.tink.proto.HkdfPrfKeyFormat) r3
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r3.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r0.setValue(r3)
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r3.setOutputPrefixType(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.KeyTemplate r3 = (com.google.crypto.tink.proto.KeyTemplate) r3
            com.google.crypto.tink.internal.ProtoParametersSerialization r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r3)
            return r3
    }

    private static com.google.crypto.tink.prf.HkdfPrfParameters.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.prf.HkdfPrfProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3c
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 3
            if (r0 == r1) goto L36
            r1 = 4
            if (r0 == r1) goto L33
            r1 = 5
            if (r0 != r1) goto L1a
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r3 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512
            return r3
        L1a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to parse HashType: "
            r1.<init>(r2)
            int r3 = r3.getNumber()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L33:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r3 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384
            return r3
        L36:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r3 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256
            return r3
        L39:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r3 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224
            return r3
        L3c:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r3 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1
            return r3
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.prf.HkdfPrfParameters.HashType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA1
            return r3
        Lb:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA224
            return r3
        L16:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            return r3
        L21:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2c
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384
            return r3
        L2c:
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L37
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA512
            return r3
        L37:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to serialize HashType "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
