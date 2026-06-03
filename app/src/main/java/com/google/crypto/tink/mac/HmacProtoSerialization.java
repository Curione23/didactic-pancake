package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes2.dex */
final class HmacProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.HmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.HmacKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.HmacProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                r1 = 1
                com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                com.google.crypto.tink.proto.HashType[] r4 = com.google.crypto.tink.proto.HashType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r4
                com.google.crypto.tink.proto.HashType r5 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L4e
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L58
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L62
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L6d
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                return
        }
    }

    public static /* synthetic */ com.google.crypto.tink.mac.HmacParameters $r8$lambda$D9KNC5jR9YqvL7EOqeF5Ognp3rc(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.mac.HmacParameters r0 = parseParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.mac.HmacKey $r8$lambda$IoMtUrUtLG8MzwN1oB0SwnssxTQ(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.mac.HmacKey r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$tC06darXYVAj1L6fPLrf2h7YmuE(com.google.crypto.tink.mac.HmacParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$tyWLoSUw9rNzlp_7oBscuA3ucvE(com.google.crypto.tink.mac.HmacKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HmacKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.mac.HmacProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda0 r1 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda0
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.mac.HmacParameters> r2 = com.google.crypto.tink.mac.HmacParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r1 = com.google.crypto.tink.internal.ParametersSerializer.create(r1, r2, r3)
            com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_SERIALIZER = r1
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda1 r1 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda1
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r1 = com.google.crypto.tink.internal.ParametersParser.create(r1, r0, r2)
            com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_PARSER = r1
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda2 r1 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda2
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.mac.HmacKey> r2 = com.google.crypto.tink.mac.HmacKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r3 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r1 = com.google.crypto.tink.internal.KeySerializer.create(r1, r2, r3)
            com.google.crypto.tink.mac.HmacProtoSerialization.KEY_SERIALIZER = r1
            com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda3 r1 = new com.google.crypto.tink.mac.HmacProtoSerialization$$ExternalSyntheticLambda3
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r1, r0, r2)
            com.google.crypto.tink.mac.HmacProtoSerialization.KEY_PARSER = r0
            return
    }

    private HmacProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.HmacParams getProtoParams(com.google.crypto.tink.mac.HmacParameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            int r1 = r2.getCryptographicTagSizeBytes()
            com.google.crypto.tink.proto.HmacParams$Builder r0 = r0.setTagSize(r1)
            com.google.crypto.tink.mac.HmacParameters$HashType r2 = r2.getHashType()
            com.google.crypto.tink.proto.HashType r2 = toProtoHashType(r2)
            com.google.crypto.tink.proto.HmacParams$Builder r2 = r0.setHash(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.HmacParams r2 = (com.google.crypto.tink.proto.HmacParams) r2
            return r2
    }

    private static com.google.crypto.tink.mac.HmacKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r3.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L93
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getValue()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.proto.HmacKey r0 = com.google.crypto.tink.proto.HmacKey.parseFrom(r0, r1)     // Catch: java.lang.Throwable -> L8b
            int r1 = r0.getVersion()     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L83
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = com.google.crypto.tink.mac.HmacParameters.builder()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: java.lang.Throwable -> L8b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setKeySizeBytes(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.proto.HmacParams r2 = r0.getParams()     // Catch: java.lang.Throwable -> L8b
            int r2 = r2.getTagSize()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setTagSizeBytes(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.proto.HmacParams r2 = r0.getParams()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.proto.HashType r2 = r2.getHash()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacParameters$HashType r2 = toHashType(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setHashType(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.proto.OutputPrefixType r2 = r3.getOutputPrefixType()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacParameters$Variant r2 = toVariant(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setVariant(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacParameters r1 = r1.build()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacKey$Builder r2 = com.google.crypto.tink.mac.HmacKey.builder()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacKey$Builder r1 = r2.setParameters(r1)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getKeyValue()     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.util.SecretBytes r4 = com.google.crypto.tink.util.SecretBytes.copyFrom(r0, r4)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacKey$Builder r4 = r1.setKeyBytes(r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r3 = r3.getIdRequirementOrNull()     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacKey$Builder r3 = r4.setIdRequirement(r3)     // Catch: java.lang.Throwable -> L8b
            com.google.crypto.tink.mac.HmacKey r3 = r3.build()     // Catch: java.lang.Throwable -> L8b
            return r3
        L83:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "Only version 0 keys are accepted"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            throw r3     // Catch: java.lang.Throwable -> L8b
        L8b:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Parsing HmacKey failed"
            r3.<init>(r4)
            throw r3
        L93:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong type URL in call to HmacProtoSerialization.parseKey"
            r3.<init>(r4)
            throw r3
    }

    private static com.google.crypto.tink.mac.HmacParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L85
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            com.google.crypto.tink.proto.HmacKeyFormat r0 = com.google.crypto.tink.proto.HmacKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L7c
            int r1 = r0.getVersion()
            if (r1 != 0) goto L63
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = com.google.crypto.tink.mac.HmacParameters.builder()
            int r2 = r0.getKeySize()
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setKeySizeBytes(r2)
            com.google.crypto.tink.proto.HmacParams r2 = r0.getParams()
            int r2 = r2.getTagSize()
            com.google.crypto.tink.mac.HmacParameters$Builder r1 = r1.setTagSizeBytes(r2)
            com.google.crypto.tink.proto.HmacParams r0 = r0.getParams()
            com.google.crypto.tink.proto.HashType r0 = r0.getHash()
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = toHashType(r0)
            com.google.crypto.tink.mac.HmacParameters$Builder r0 = r1.setHashType(r0)
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            com.google.crypto.tink.mac.HmacParameters$Variant r3 = toVariant(r3)
            com.google.crypto.tink.mac.HmacParameters$Builder r3 = r0.setVariant(r3)
            com.google.crypto.tink.mac.HmacParameters r3 = r3.build()
            return r3
        L63:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parsing HmacParameters failed: unknown Version "
            r1.<init>(r2)
            int r0 = r0.getVersion()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L7c:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing HmacParameters failed: "
            r0.<init>(r1, r3)
            throw r0
        L85:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong type URL in call to HmacProtoSerialization.parseParameters: "
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.HmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.HmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.HmacProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.mac.HmacKey r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HmacKey$Builder r0 = com.google.crypto.tink.proto.HmacKey.newBuilder()
            com.google.crypto.tink.mac.HmacParameters r1 = r3.getParameters()
            com.google.crypto.tink.proto.HmacParams r1 = getProtoParams(r1)
            com.google.crypto.tink.proto.HmacKey$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.util.SecretBytes r1 = r3.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)
            byte[] r4 = r1.toByteArray(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.HmacKey$Builder r4 = r0.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.HmacKey r4 = (com.google.crypto.tink.proto.HmacKey) r4
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.mac.HmacParameters r1 = r3.getParameters()
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = r1.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.HmacKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r2, r4, r0, r1, r3)
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.mac.HmacParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.HmacKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setParams(r2)
            int r2 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacKeyFormat r1 = (com.google.crypto.tink.proto.HmacKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.mac.HmacParameters$Variant r3 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r3 = toProtoOutputPrefixType(r3)
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r0.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.KeyTemplate r3 = (com.google.crypto.tink.proto.KeyTemplate) r3
            com.google.crypto.tink.internal.ProtoParametersSerialization r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r3)
            return r3
    }

    private static com.google.crypto.tink.mac.HmacParameters.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
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
            com.google.crypto.tink.mac.HmacParameters$HashType r3 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA512
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
            com.google.crypto.tink.mac.HmacParameters$HashType r3 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA384
            return r3
        L36:
            com.google.crypto.tink.mac.HmacParameters$HashType r3 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA256
            return r3
        L39:
            com.google.crypto.tink.mac.HmacParameters$HashType r3 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA224
            return r3
        L3c:
            com.google.crypto.tink.mac.HmacParameters$HashType r3 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA1
            return r3
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.mac.HmacParameters.HashType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA1
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA1
            return r3
        Lb:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA224
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA224
            return r3
        L16:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            return r3
        L21:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2c
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384
            return r3
        L2c:
            com.google.crypto.tink.mac.HmacParameters$HashType r0 = com.google.crypto.tink.mac.HmacParameters.HashType.SHA512
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

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.mac.HmacParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r3
        Lb:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r3
        L16:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r3
        L21:
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2c
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r3
        L2c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to serialize variant: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.crypto.tink.mac.HmacParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.mac.HmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L36
            r1 = 2
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 != r1) goto L17
            com.google.crypto.tink.mac.HmacParameters$Variant r3 = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX
            return r3
        L17:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to parse OutputPrefixType: "
            r1.<init>(r2)
            int r3 = r3.getNumber()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L30:
            com.google.crypto.tink.mac.HmacParameters$Variant r3 = com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY
            return r3
        L33:
            com.google.crypto.tink.mac.HmacParameters$Variant r3 = com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY
            return r3
        L36:
            com.google.crypto.tink.mac.HmacParameters$Variant r3 = com.google.crypto.tink.mac.HmacParameters.Variant.TINK
            return r3
    }
}
