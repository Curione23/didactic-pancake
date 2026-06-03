package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes2.dex */
final class AesCmacProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.AesCmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesCmacKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.AesCmacProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$7L351wgjnjO4ZKV0ZQV15gTo0vg(com.google.crypto.tink.mac.AesCmacKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$XoAYR2uAeH9mIXNgu5uUJ0qQD-8, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization m706$r8$lambda$XoAYR2uAeH9mIXNgu5uUJ0qQD8(com.google.crypto.tink.mac.AesCmacParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$aVUkw1tXpDU9iD7R6w_Z-dgG0sY, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.mac.AesCmacKey m707$r8$lambda$aVUkw1tXpDU9iD7R6w_ZdgG0sY(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.mac.AesCmacKey r0 = parseKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.mac.AesCmacParameters $r8$lambda$kP_363MC8_7156Kgw7KikH01Utk(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.mac.AesCmacParameters r0 = parseParameters(r0)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda0 r1 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda0
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.mac.AesCmacParameters> r2 = com.google.crypto.tink.mac.AesCmacParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r1 = com.google.crypto.tink.internal.ParametersSerializer.create(r1, r2, r3)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_SERIALIZER = r1
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda1 r1 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda1
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r1 = com.google.crypto.tink.internal.ParametersParser.create(r1, r0, r2)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_PARSER = r1
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda2 r1 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda2
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.mac.AesCmacKey> r2 = com.google.crypto.tink.mac.AesCmacKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r3 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r1 = com.google.crypto.tink.internal.KeySerializer.create(r1, r2, r3)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_SERIALIZER = r1
            com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda3 r1 = new com.google.crypto.tink.mac.AesCmacProtoSerialization$$ExternalSyntheticLambda3
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r1, r0, r2)
            com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_PARSER = r0
            return
    }

    private AesCmacProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.AesCmacParams getProtoParams(com.google.crypto.tink.mac.AesCmacParameters r1) {
            com.google.crypto.tink.proto.AesCmacParams$Builder r0 = com.google.crypto.tink.proto.AesCmacParams.newBuilder()
            int r1 = r1.getCryptographicTagSizeBytes()
            com.google.crypto.tink.proto.AesCmacParams$Builder r1 = r0.setTagSize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCmacParams r1 = (com.google.crypto.tink.proto.AesCmacParams) r1
            return r1
    }

    private static com.google.crypto.tink.mac.AesCmacKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r3.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L83
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getValue()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.proto.AesCmacKey r0 = com.google.crypto.tink.proto.AesCmacKey.parseFrom(r0, r1)     // Catch: java.lang.Throwable -> L7b
            int r1 = r0.getVersion()     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L73
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = com.google.crypto.tink.mac.AesCmacParameters.builder()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: java.lang.Throwable -> L7b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setKeySizeBytes(r2)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.proto.AesCmacParams r2 = r0.getParams()     // Catch: java.lang.Throwable -> L7b
            int r2 = r2.getTagSize()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setTagSizeBytes(r2)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.proto.OutputPrefixType r2 = r3.getOutputPrefixType()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacParameters$Variant r2 = toVariant(r2)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setVariant(r2)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacParameters r1 = r1.build()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacKey$Builder r2 = com.google.crypto.tink.mac.AesCmacKey.builder()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacKey$Builder r1 = r2.setParameters(r1)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getKeyValue()     // Catch: java.lang.Throwable -> L7b
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.util.SecretBytes r4 = com.google.crypto.tink.util.SecretBytes.copyFrom(r0, r4)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacKey$Builder r4 = r1.setAesKeyBytes(r4)     // Catch: java.lang.Throwable -> L7b
            java.lang.Integer r3 = r3.getIdRequirementOrNull()     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacKey$Builder r3 = r4.setIdRequirement(r3)     // Catch: java.lang.Throwable -> L7b
            com.google.crypto.tink.mac.AesCmacKey r3 = r3.build()     // Catch: java.lang.Throwable -> L7b
            return r3
        L73:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = "Only version 0 keys are accepted"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r3     // Catch: java.lang.Throwable -> L7b
        L7b:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Parsing AesCmacKey failed"
            r3.<init>(r4)
            throw r3
        L83:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong type URL in call to AesCmacParameters.parseParameters"
            r3.<init>(r4)
            throw r3
    }

    private static com.google.crypto.tink.mac.AesCmacParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L56
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            com.google.crypto.tink.proto.AesCmacKeyFormat r0 = com.google.crypto.tink.proto.AesCmacKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = com.google.crypto.tink.mac.AesCmacParameters.builder()
            int r2 = r0.getKeySize()
            com.google.crypto.tink.mac.AesCmacParameters$Builder r1 = r1.setKeySizeBytes(r2)
            com.google.crypto.tink.proto.AesCmacParams r0 = r0.getParams()
            int r0 = r0.getTagSize()
            com.google.crypto.tink.mac.AesCmacParameters$Builder r0 = r1.setTagSizeBytes(r0)
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = toVariant(r3)
            com.google.crypto.tink.mac.AesCmacParameters$Builder r3 = r0.setVariant(r3)
            com.google.crypto.tink.mac.AesCmacParameters r3 = r3.build()
            return r3
        L4d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing AesCmacParameters failed: "
            r0.<init>(r1, r3)
            throw r0
        L56:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong type URL in call to AesCmacParameters.parseParameters: "
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.mac.AesCmacParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.mac.AesCmacKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.mac.AesCmacKey r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.AesCmacKey$Builder r0 = com.google.crypto.tink.proto.AesCmacKey.newBuilder()
            com.google.crypto.tink.mac.AesCmacParameters r1 = r3.getParameters()
            com.google.crypto.tink.proto.AesCmacParams r1 = getProtoParams(r1)
            com.google.crypto.tink.proto.AesCmacKey$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.util.SecretBytes r1 = r3.getAesKey()
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)
            byte[] r4 = r1.toByteArray(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.AesCmacKey$Builder r4 = r0.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.AesCmacKey r4 = (com.google.crypto.tink.proto.AesCmacKey) r4
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.mac.AesCmacParameters r1 = r3.getParameters()
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = r1.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toOutputPrefixType(r1)
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r2, r4, r0, r1, r3)
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.mac.AesCmacParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = com.google.crypto.tink.proto.AesCmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCmacParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = r1.setParams(r2)
            int r2 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.AesCmacKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCmacKeyFormat r1 = (com.google.crypto.tink.proto.AesCmacKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r3 = toOutputPrefixType(r3)
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r0.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.KeyTemplate r3 = (com.google.crypto.tink.proto.KeyTemplate) r3
            com.google.crypto.tink.internal.ProtoParametersSerialization r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r3)
            return r3
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toOutputPrefixType(com.google.crypto.tink.mac.AesCmacParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r3
        Lb:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r3
        L16:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r3
        L21:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY
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

    private static com.google.crypto.tink.mac.AesCmacParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.mac.AesCmacProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
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
            com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY
            return r3
        L33:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY
            return r3
        L36:
            com.google.crypto.tink.mac.AesCmacParameters$Variant r3 = com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK
            return r3
    }
}
