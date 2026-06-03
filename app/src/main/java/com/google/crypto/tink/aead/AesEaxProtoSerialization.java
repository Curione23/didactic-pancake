package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
final class AesEaxProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.AesEaxKey, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.AesEaxParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesEaxKey";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.AesEaxProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.aead.AesEaxProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$V0XyUfwBtjzg7ct2AwYDLu4L-cg, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization m700$r8$lambda$V0XyUfwBtjzg7ct2AwYDLu4Lcg(com.google.crypto.tink.aead.AesEaxParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$hCX1FKbCEXveJ2WRy7RTy10wxag(com.google.crypto.tink.aead.AesEaxKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.aead.AesEaxKey $r8$lambda$hHwfqfxxleoKWfpTwJrxjQsq6qk(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.aead.AesEaxKey r0 = parseKey(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$yIrOkSX0ibOU_I28OY2-wcZVsJQ, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.aead.AesEaxParameters m701$r8$lambda$yIrOkSX0ibOU_I28OY2wcZVsJQ(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.aead.AesEaxParameters r0 = parseParameters(r0)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.aead.AesEaxProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda0 r1 = new com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda0
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.aead.AesEaxParameters> r2 = com.google.crypto.tink.aead.AesEaxParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r1 = com.google.crypto.tink.internal.ParametersSerializer.create(r1, r2, r3)
            com.google.crypto.tink.aead.AesEaxProtoSerialization.PARAMETERS_SERIALIZER = r1
            com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda1 r1 = new com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda1
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r1 = com.google.crypto.tink.internal.ParametersParser.create(r1, r0, r2)
            com.google.crypto.tink.aead.AesEaxProtoSerialization.PARAMETERS_PARSER = r1
            com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda2 r1 = new com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda2
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.aead.AesEaxKey> r2 = com.google.crypto.tink.aead.AesEaxKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r3 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r1 = com.google.crypto.tink.internal.KeySerializer.create(r1, r2, r3)
            com.google.crypto.tink.aead.AesEaxProtoSerialization.KEY_SERIALIZER = r1
            com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda3 r1 = new com.google.crypto.tink.aead.AesEaxProtoSerialization$$ExternalSyntheticLambda3
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r1, r0, r2)
            com.google.crypto.tink.aead.AesEaxProtoSerialization.KEY_PARSER = r0
            return
    }

    private AesEaxProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.AesEaxParams getProtoParams(com.google.crypto.tink.aead.AesEaxParameters r2) throws java.security.GeneralSecurityException {
            int r0 = r2.getTagSizeBytes()
            r1 = 16
            if (r0 != r1) goto L1b
            com.google.crypto.tink.proto.AesEaxParams$Builder r0 = com.google.crypto.tink.proto.AesEaxParams.newBuilder()
            int r2 = r2.getIvSizeBytes()
            com.google.crypto.tink.proto.AesEaxParams$Builder r2 = r0.setIvSize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesEaxParams r2 = (com.google.crypto.tink.proto.AesEaxParams) r2
            return r2
        L1b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r2 = r2.getTagSizeBytes()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes."
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    private static com.google.crypto.tink.aead.AesEaxKey parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r3.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L89
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.proto.AesEaxKey r0 = com.google.crypto.tink.proto.AesEaxKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            int r1 = r0.getVersion()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            if (r1 != 0) goto L79
            com.google.crypto.tink.aead.AesEaxParameters$Builder r1 = com.google.crypto.tink.aead.AesEaxParameters.builder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.getKeyValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            int r2 = r2.size()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxParameters$Builder r1 = r1.setKeySizeBytes(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.proto.AesEaxParams r2 = r0.getParams()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            int r2 = r2.getIvSize()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxParameters$Builder r1 = r1.setIvSizeBytes(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            r2 = 16
            com.google.crypto.tink.aead.AesEaxParameters$Builder r1 = r1.setTagSizeBytes(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.proto.OutputPrefixType r2 = r3.getOutputPrefixType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxParameters$Variant r2 = toVariant(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxParameters$Builder r1 = r1.setVariant(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxParameters r1 = r1.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxKey$Builder r2 = com.google.crypto.tink.aead.AesEaxKey.builder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxKey$Builder r1 = r2.setParameters(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getKeyValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            byte[] r0 = r0.toByteArray()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.util.SecretBytes r4 = com.google.crypto.tink.util.SecretBytes.copyFrom(r0, r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxKey$Builder r4 = r1.setKeyBytes(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            java.lang.Integer r3 = r3.getIdRequirementOrNull()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxKey$Builder r3 = r4.setIdRequirement(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            com.google.crypto.tink.aead.AesEaxKey r3 = r3.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            return r3
        L79:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            java.lang.String r4 = "Only version 0 keys are accepted"
            r3.<init>(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
            throw r3     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L81
        L81:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Parsing AesEaxcKey failed"
            r3.<init>(r4)
            throw r3
        L89:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong type URL in call to AesEaxParameters.parseParameters"
            r3.<init>(r4)
            throw r3
    }

    private static com.google.crypto.tink.aead.AesEaxParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L53
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L53
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L53
            com.google.crypto.tink.proto.AesEaxKeyFormat r0 = com.google.crypto.tink.proto.AesEaxKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L53
            com.google.crypto.tink.aead.AesEaxParameters$Builder r1 = com.google.crypto.tink.aead.AesEaxParameters.builder()
            int r2 = r0.getKeySize()
            com.google.crypto.tink.aead.AesEaxParameters$Builder r1 = r1.setKeySizeBytes(r2)
            com.google.crypto.tink.proto.AesEaxParams r0 = r0.getParams()
            int r0 = r0.getIvSize()
            com.google.crypto.tink.aead.AesEaxParameters$Builder r0 = r1.setIvSizeBytes(r0)
            r1 = 16
            com.google.crypto.tink.aead.AesEaxParameters$Builder r0 = r0.setTagSizeBytes(r1)
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            com.google.crypto.tink.aead.AesEaxParameters$Variant r3 = toVariant(r3)
            com.google.crypto.tink.aead.AesEaxParameters$Builder r3 = r0.setVariant(r3)
            com.google.crypto.tink.aead.AesEaxParameters r3 = r3.build()
            return r3
        L53:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing AesEaxParameters failed: "
            r0.<init>(r1, r3)
            throw r0
        L5c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong type URL in call to AesEaxParameters.parseParameters: "
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.AesEaxParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.AesEaxKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.aead.AesEaxKey r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.AesEaxKey$Builder r0 = com.google.crypto.tink.proto.AesEaxKey.newBuilder()
            com.google.crypto.tink.aead.AesEaxParameters r1 = r3.getParameters()
            com.google.crypto.tink.proto.AesEaxParams r1 = getProtoParams(r1)
            com.google.crypto.tink.proto.AesEaxKey$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.util.SecretBytes r1 = r3.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)
            byte[] r4 = r1.toByteArray(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.AesEaxKey$Builder r4 = r0.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.AesEaxKey r4 = (com.google.crypto.tink.proto.AesEaxKey) r4
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.aead.AesEaxParameters r1 = r3.getParameters()
            com.google.crypto.tink.aead.AesEaxParameters$Variant r1 = r1.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r2, r4, r0, r1, r3)
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.aead.AesEaxParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r1 = com.google.crypto.tink.proto.AesEaxKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesEaxParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r1 = r1.setParams(r2)
            int r2 = r3.getKeySizeBytes()
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r1 = r1.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesEaxKeyFormat r1 = (com.google.crypto.tink.proto.AesEaxKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.aead.AesEaxParameters$Variant r3 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r3 = toProtoOutputPrefixType(r3)
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r0.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.KeyTemplate r3 = (com.google.crypto.tink.proto.KeyTemplate) r3
            com.google.crypto.tink.internal.ProtoParametersSerialization r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r3)
            return r3
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.aead.AesEaxParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AesEaxParameters$Variant r0 = com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r3
        Lb:
            com.google.crypto.tink.aead.AesEaxParameters$Variant r0 = com.google.crypto.tink.aead.AesEaxParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r3
        L16:
            com.google.crypto.tink.aead.AesEaxParameters$Variant r0 = com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r3
        L21:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to serialize variant: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.crypto.tink.aead.AesEaxParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.aead.AesEaxProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L33
            r1 = 2
            if (r0 == r1) goto L30
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 != r1) goto L17
            com.google.crypto.tink.aead.AesEaxParameters$Variant r3 = com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX
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
            com.google.crypto.tink.aead.AesEaxParameters$Variant r3 = com.google.crypto.tink.aead.AesEaxParameters.Variant.CRUNCHY
            return r3
        L33:
            com.google.crypto.tink.aead.AesEaxParameters$Variant r3 = com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK
            return r3
    }
}
