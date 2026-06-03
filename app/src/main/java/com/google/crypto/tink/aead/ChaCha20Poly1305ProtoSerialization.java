package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
final class ChaCha20Poly1305ProtoSerialization {
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.ChaCha20Poly1305Key, com.google.crypto.tink.internal.ProtoKeySerialization> KEY_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.ChaCha20Poly1305Parameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    private static final com.google.crypto.tink.util.Bytes TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static /* synthetic */ com.google.crypto.tink.aead.ChaCha20Poly1305Key $r8$lambda$L5f4GBfBHk1kNkwsZzQMinVUKbQ(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.aead.ChaCha20Poly1305Key r0 = parseKey(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$Lg_cyxZQ-HjrQ2wNWQNH19kU_Ug, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.aead.ChaCha20Poly1305Parameters m703$r8$lambda$Lg_cyxZQHjrQ2wNWQNH19kU_Ug(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0 = parseParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$b7BAVpBEzJ7AVrTMpQg1rrT26_Y(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$o8WCoHHL4apSApiqKk4H-XgCcPI, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization m704$r8$lambda$o8WCoHHL4apSApiqKk4HXgCcPI(com.google.crypto.tink.aead.ChaCha20Poly1305Key r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializeKey(r0, r1)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.TYPE_URL_BYTES = r0
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda0 r1 = new com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda0
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.aead.ChaCha20Poly1305Parameters> r2 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r1 = com.google.crypto.tink.internal.ParametersSerializer.create(r1, r2, r3)
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.PARAMETERS_SERIALIZER = r1
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda1 r1 = new com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda1
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r1 = com.google.crypto.tink.internal.ParametersParser.create(r1, r0, r2)
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.PARAMETERS_PARSER = r1
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda2 r1 = new com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda2
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.aead.ChaCha20Poly1305Key> r2 = com.google.crypto.tink.aead.ChaCha20Poly1305Key.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r3 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r1 = com.google.crypto.tink.internal.KeySerializer.create(r1, r2, r3)
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.KEY_SERIALIZER = r1
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda3 r1 = new com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization$$ExternalSyntheticLambda3
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r1, r0, r2)
            com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.KEY_PARSER = r0
            return
    }

    private ChaCha20Poly1305ProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.aead.ChaCha20Poly1305Key parseKey(com.google.crypto.tink.internal.ProtoKeySerialization r2, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r3) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r2.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4f
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            com.google.crypto.tink.proto.ChaCha20Poly1305Key r0 = com.google.crypto.tink.proto.ChaCha20Poly1305Key.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            int r1 = r0.getVersion()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            if (r1 != 0) goto L3f
            com.google.crypto.tink.proto.OutputPrefixType r1 = r2.getOutputPrefixType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = toVariant(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getKeyValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            byte[] r0 = r0.toByteArray()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            com.google.crypto.tink.SecretKeyAccess r3 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            com.google.crypto.tink.util.SecretBytes r3 = com.google.crypto.tink.util.SecretBytes.copyFrom(r0, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            java.lang.Integer r2 = r2.getIdRequirementOrNull()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            com.google.crypto.tink.aead.ChaCha20Poly1305Key r2 = com.google.crypto.tink.aead.ChaCha20Poly1305Key.create(r1, r3, r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            return r2
        L3f:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            java.lang.String r3 = "Only version 0 keys are accepted"
            r2.<init>(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
            throw r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L47
        L47:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Parsing ChaCha20Poly1305Key failed"
            r2.<init>(r3)
            throw r2
        L4f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters"
            r2.<init>(r3)
            throw r2
    }

    private static com.google.crypto.tink.aead.ChaCha20Poly1305Parameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L30
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L30
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L30
            com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L30
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r3 = toVariant(r3)
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r3 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.create(r3)
            return r3
        L30:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing ChaCha20Poly1305Parameters failed: "
            r0.<init>(r1, r3)
            throw r0
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters: "
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
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.aead.ChaCha20Poly1305Parameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.aead.ChaCha20Poly1305Key, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializeKey(com.google.crypto.tink.aead.ChaCha20Poly1305Key r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.ChaCha20Poly1305Key$Builder r0 = com.google.crypto.tink.proto.ChaCha20Poly1305Key.newBuilder()
            com.google.crypto.tink.util.SecretBytes r1 = r3.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)
            byte[] r4 = r1.toByteArray(r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.ChaCha20Poly1305Key$Builder r4 = r0.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.ChaCha20Poly1305Key r4 = (com.google.crypto.tink.proto.ChaCha20Poly1305Key) r4
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r1 = r3.getParameters()
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = r1.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r2, r4, r0, r1, r3)
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat r1 = com.google.crypto.tink.proto.ChaCha20Poly1305KeyFormat.getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r2 = r2.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r2 = toProtoOutputPrefixType(r2)
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r0.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            com.google.crypto.tink.internal.ProtoParametersSerialization r2 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r2)
            return r2
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r3
        Lb:
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r3
        L16:
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
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

    private static com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.aead.ChaCha20Poly1305ProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r3 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
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
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r3 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.CRUNCHY
            return r3
        L33:
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r3 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.TINK
            return r3
    }
}
