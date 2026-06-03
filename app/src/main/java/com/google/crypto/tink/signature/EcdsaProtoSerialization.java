package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes2.dex */
final class EcdsaProtoSerialization {
    private static final com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_PARSER = null;
    private static final com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.signature.EcdsaParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> PARAMETERS_SERIALIZER = null;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> PRIVATE_KEY_SERIALIZER = null;
    private static final java.lang.String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    private static final com.google.crypto.tink.util.Bytes PRIVATE_TYPE_URL_BYTES = null;
    private static final com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_PARSER = null;
    private static final com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> PUBLIC_KEY_SERIALIZER = null;
    private static final java.lang.String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    private static final com.google.crypto.tink.util.Bytes PUBLIC_TYPE_URL_BYTES = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.EcdsaProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.EcdsaSignatureEncoding[] r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = r0
                r1 = 1
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                com.google.crypto.tink.proto.EllipticCurveType[] r2 = com.google.crypto.tink.proto.EllipticCurveType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = r2
                com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r2 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L38
                com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L38
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                r2 = 3
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                com.google.crypto.tink.proto.OutputPrefixType[] r3 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r3
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L54
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L5e
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L5e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L5e
            L5e:
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L68
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L68
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L68
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L68
            L68:
                int[] r3 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L73
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L73
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L73
                r5 = 4
                r3[r4] = r5     // Catch: java.lang.NoSuchFieldError -> L73
            L73:
                com.google.crypto.tink.proto.HashType[] r3 = com.google.crypto.tink.proto.HashType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r3
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L84
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r1 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L8e
                com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L8e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8e
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L8e
            L8e:
                int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L98
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L98
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L98
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L98
            L98:
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-1QaVTEpxVoK9ADilVdLTv7koG4, reason: not valid java name */
    public static /* synthetic */ com.google.crypto.tink.signature.EcdsaParameters m711$r8$lambda$1QaVTEpxVoK9ADilVdLTv7koG4(com.google.crypto.tink.internal.ProtoParametersSerialization r0) {
            com.google.crypto.tink.signature.EcdsaParameters r0 = parseParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$QL64PlliBOEO_yvpgc5iADKWtsE(com.google.crypto.tink.signature.EcdsaPrivateKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializePrivateKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoParametersSerialization $r8$lambda$XUL5p5QSPtLET6REQv92nwwzNDw(com.google.crypto.tink.signature.EcdsaParameters r0) {
            com.google.crypto.tink.internal.ProtoParametersSerialization r0 = serializeParameters(r0)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.signature.EcdsaPrivateKey $r8$lambda$fyP_R8_FXP7yUskYeHgYdWzzYCM(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.signature.EcdsaPrivateKey r0 = parsePrivateKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.internal.ProtoKeySerialization $r8$lambda$yE7K0ejbZkHm9FdR1y2N5HSU7y8(com.google.crypto.tink.signature.EcdsaPublicKey r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.internal.ProtoKeySerialization r0 = serializePublicKey(r0, r1)
            return r0
    }

    public static /* synthetic */ com.google.crypto.tink.signature.EcdsaPublicKey $r8$lambda$yS9Hwh6FSrUpXOxo6QSA4zOibRQ(com.google.crypto.tink.internal.ProtoKeySerialization r0, com.google.crypto.tink.SecretKeyAccess r1) {
            com.google.crypto.tink.signature.EcdsaPublicKey r0 = parsePublicKey(r0, r1)
            return r0
    }

    static {
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r0)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_TYPE_URL_BYTES = r0
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.internal.Util.toBytesFromPrintableAscii(r1)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_TYPE_URL_BYTES = r1
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda0 r2 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda0
            r2.<init>()
            java.lang.Class<com.google.crypto.tink.signature.EcdsaParameters> r3 = com.google.crypto.tink.signature.EcdsaParameters.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r4 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersSerializer r2 = com.google.crypto.tink.internal.ParametersSerializer.create(r2, r3, r4)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_SERIALIZER = r2
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda1 r2 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda1
            r2.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoParametersSerialization> r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.class
            com.google.crypto.tink.internal.ParametersParser r2 = com.google.crypto.tink.internal.ParametersParser.create(r2, r0, r3)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_PARSER = r2
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda2 r2 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda2
            r2.<init>()
            java.lang.Class<com.google.crypto.tink.signature.EcdsaPublicKey> r3 = com.google.crypto.tink.signature.EcdsaPublicKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r4 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r2 = com.google.crypto.tink.internal.KeySerializer.create(r2, r3, r4)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_SERIALIZER = r2
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda3 r2 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda3
            r2.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r3 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r1 = com.google.crypto.tink.internal.KeyParser.create(r2, r1, r3)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_PARSER = r1
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda4 r1 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda4
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.signature.EcdsaPrivateKey> r2 = com.google.crypto.tink.signature.EcdsaPrivateKey.class
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r3 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeySerializer r1 = com.google.crypto.tink.internal.KeySerializer.create(r1, r2, r3)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_SERIALIZER = r1
            com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda5 r1 = new com.google.crypto.tink.signature.EcdsaProtoSerialization$$ExternalSyntheticLambda5
            r1.<init>()
            java.lang.Class<com.google.crypto.tink.internal.ProtoKeySerialization> r2 = com.google.crypto.tink.internal.ProtoKeySerialization.class
            com.google.crypto.tink.internal.KeyParser r0 = com.google.crypto.tink.internal.KeyParser.create(r1, r0, r2)
            com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_PARSER = r0
            return
    }

    private EcdsaProtoSerialization() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getEncodingLength(com.google.crypto.tink.signature.EcdsaParameters.CurveType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            r3 = 33
            return r3
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            r3 = 49
            return r3
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            r3 = 67
            return r3
        L21:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to serialize CurveType "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.crypto.tink.proto.EcdsaParams getProtoParams(com.google.crypto.tink.signature.EcdsaParameters r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = com.google.crypto.tink.proto.EcdsaParams.newBuilder()
            com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = r2.getHashType()
            com.google.crypto.tink.proto.HashType r1 = toProtoHashType(r1)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setHashType(r1)
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = r2.getCurveType()
            com.google.crypto.tink.proto.EllipticCurveType r1 = toProtoCurveType(r1)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setCurve(r1)
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r2 = r2.getSignatureEncoding()
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = toProtoSignatureEncoding(r2)
            com.google.crypto.tink.proto.EcdsaParams$Builder r2 = r0.setEncoding(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EcdsaParams r2 = (com.google.crypto.tink.proto.EcdsaParams) r2
            return r2
    }

    private static com.google.crypto.tink.proto.EcdsaPublicKey getProtoPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters r0 = r3.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r0.getCurveType()
            int r0 = getEncodingLength(r0)
            java.security.spec.ECPoint r1 = r3.getPublicPoint()
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder()
            com.google.crypto.tink.signature.EcdsaParameters r3 = r3.getParameters()
            com.google.crypto.tink.proto.EcdsaParams r3 = getProtoParams(r3)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r3 = r2.setParams(r3)
            java.math.BigInteger r2 = r1.getAffineX()
            byte[] r2 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r2, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r3 = r3.setX(r2)
            java.math.BigInteger r1 = r1.getAffineY()
            byte[] r0 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r1, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r3 = r3.setY(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.EcdsaPublicKey r3 = (com.google.crypto.tink.proto.EcdsaPublicKey) r3
            return r3
    }

    private static com.google.crypto.tink.signature.EcdsaParameters parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()
            java.lang.String r0 = r0.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L72
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getKeyTemplate()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L69
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L69
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L69
            com.google.crypto.tink.proto.EcdsaKeyFormat r0 = com.google.crypto.tink.proto.EcdsaKeyFormat.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L69
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = com.google.crypto.tink.signature.EcdsaParameters.builder()
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()
            com.google.crypto.tink.proto.HashType r2 = r2.getHashType()
            com.google.crypto.tink.signature.EcdsaParameters$HashType r2 = toHashType(r2)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setHashType(r2)
            com.google.crypto.tink.proto.EcdsaParams r2 = r0.getParams()
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = r2.getEncoding()
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r2 = toSignatureEncoding(r2)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r1 = r1.setSignatureEncoding(r2)
            com.google.crypto.tink.proto.EcdsaParams r0 = r0.getParams()
            com.google.crypto.tink.proto.EllipticCurveType r0 = r0.getCurve()
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = toCurveType(r0)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r0 = r1.setCurveType(r0)
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = toVariant(r3)
            com.google.crypto.tink.signature.EcdsaParameters$Builder r3 = r0.setVariant(r3)
            com.google.crypto.tink.signature.EcdsaParameters r3 = r3.build()
            return r3
        L69:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing EcdsaParameters failed: "
            r0.<init>(r1, r3)
            throw r0
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong type URL in call to EcdsaProtoSerialization.parseParameters: "
            r1.<init>(r2)
            com.google.crypto.tink.proto.KeyTemplate r3 = r3.getKeyTemplate()
            java.lang.String r3 = r3.getTypeUrl()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.crypto.tink.signature.EcdsaPrivateKey parsePrivateKey(com.google.crypto.tink.internal.ProtoKeySerialization r5, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r5.getTypeUrl()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getValue()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.EcdsaPrivateKey r0 = com.google.crypto.tink.proto.EcdsaPrivateKey.parseFrom(r0, r1)     // Catch: java.lang.Throwable -> Lc8
            int r1 = r0.getVersion()     // Catch: java.lang.Throwable -> Lc8
            if (r1 != 0) goto Lc0
            com.google.crypto.tink.proto.EcdsaPublicKey r1 = r0.getPublicKey()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = com.google.crypto.tink.signature.EcdsaParameters.builder()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.EcdsaParams r3 = r1.getParams()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.HashType r3 = r3.getHashType()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$HashType r3 = toHashType(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setHashType(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.EcdsaParams r3 = r1.getParams()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = r3.getEncoding()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r3 = toSignatureEncoding(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setSignatureEncoding(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.EcdsaParams r3 = r1.getParams()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.EllipticCurveType r3 = r3.getCurve()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r3 = toCurveType(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setCurveType(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.proto.OutputPrefixType r3 = r5.getOutputPrefixType()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = toVariant(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters$Builder r2 = r2.setVariant(r3)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaParameters r2 = r2.build()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r3 = com.google.crypto.tink.signature.EcdsaPublicKey.builder()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r2 = r3.setParameters(r2)     // Catch: java.lang.Throwable -> Lc8
            java.security.spec.ECPoint r3 = new java.security.spec.ECPoint     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r1.getX()     // Catch: java.lang.Throwable -> Lc8
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> Lc8
            java.math.BigInteger r4 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r4)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getY()     // Catch: java.lang.Throwable -> Lc8
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> Lc8
            java.math.BigInteger r1 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r1)     // Catch: java.lang.Throwable -> Lc8
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r1 = r2.setPublicPoint(r3)     // Catch: java.lang.Throwable -> Lc8
            java.lang.Integer r5 = r5.getIdRequirementOrNull()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r5 = r1.setIdRequirement(r5)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPublicKey r5 = r5.build()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPrivateKey$Builder r1 = com.google.crypto.tink.signature.EcdsaPrivateKey.builder()     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPrivateKey$Builder r5 = r1.setPublicKey(r5)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getKeyValue()     // Catch: java.lang.Throwable -> Lc8
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> Lc8
            java.math.BigInteger r0 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r0)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.SecretKeyAccess r6 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r6)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.util.SecretBigInteger r6 = com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(r0, r6)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPrivateKey$Builder r5 = r5.setPrivateValue(r6)     // Catch: java.lang.Throwable -> Lc8
            com.google.crypto.tink.signature.EcdsaPrivateKey r5 = r5.build()     // Catch: java.lang.Throwable -> Lc8
            return r5
        Lc0:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r6 = "Only version 0 keys are accepted"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lc8
            throw r5     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "Parsing EcdsaPrivateKey failed"
            r5.<init>(r6)
            throw r5
        Ld0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: "
            r0.<init>(r1)
            java.lang.String r5 = r5.getTypeUrl()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    private static com.google.crypto.tink.signature.EcdsaPublicKey parsePublicKey(com.google.crypto.tink.internal.ProtoKeySerialization r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            java.lang.String r4 = r3.getTypeUrl()
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto La8
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r3.getValue()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.EcdsaPublicKey r4 = com.google.crypto.tink.proto.EcdsaPublicKey.parseFrom(r4, r0)     // Catch: java.lang.Throwable -> La0
            int r0 = r4.getVersion()     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L98
            com.google.crypto.tink.signature.EcdsaParameters$Builder r0 = com.google.crypto.tink.signature.EcdsaParameters.builder()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.EcdsaParams r1 = r4.getParams()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.HashType r1 = r1.getHashType()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$HashType r1 = toHashType(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$Builder r0 = r0.setHashType(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.EcdsaParams r1 = r4.getParams()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r1 = r1.getEncoding()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r1 = toSignatureEncoding(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$Builder r0 = r0.setSignatureEncoding(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.EcdsaParams r1 = r4.getParams()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.EllipticCurveType r1 = r1.getCurve()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r1 = toCurveType(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$Builder r0 = r0.setCurveType(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.proto.OutputPrefixType r1 = r3.getOutputPrefixType()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = toVariant(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters$Builder r0 = r0.setVariant(r1)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaParameters r0 = r0.build()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r1 = com.google.crypto.tink.signature.EcdsaPublicKey.builder()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r0 = r1.setParameters(r0)     // Catch: java.lang.Throwable -> La0
            java.security.spec.ECPoint r1 = new java.security.spec.ECPoint     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r4.getX()     // Catch: java.lang.Throwable -> La0
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> La0
            java.math.BigInteger r2 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r2)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.getY()     // Catch: java.lang.Throwable -> La0
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> La0
            java.math.BigInteger r4 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r4)     // Catch: java.lang.Throwable -> La0
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r4 = r0.setPublicPoint(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r3 = r3.getIdRequirementOrNull()     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r3 = r4.setIdRequirement(r3)     // Catch: java.lang.Throwable -> La0
            com.google.crypto.tink.signature.EcdsaPublicKey r3 = r3.build()     // Catch: java.lang.Throwable -> La0
            return r3
        L98:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Only version 0 keys are accepted"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La0
            throw r3     // Catch: java.lang.Throwable -> La0
        La0:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Parsing EcdsaPublicKey failed"
            r3.<init>(r4)
            throw r3
        La8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getTypeUrl()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.MutableSerializationRegistry r0 = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance()
            register(r0)
            return
    }

    public static void register(com.google.crypto.tink.internal.MutableSerializationRegistry r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.ParametersSerializer<com.google.crypto.tink.signature.EcdsaParameters, com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_SERIALIZER
            r1.registerParametersSerializer(r0)
            com.google.crypto.tink.internal.ParametersParser<com.google.crypto.tink.internal.ProtoParametersSerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PARAMETERS_PARSER
            r1.registerParametersParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPublicKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PUBLIC_KEY_PARSER
            r1.registerKeyParser(r0)
            com.google.crypto.tink.internal.KeySerializer<com.google.crypto.tink.signature.EcdsaPrivateKey, com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_SERIALIZER
            r1.registerKeySerializer(r0)
            com.google.crypto.tink.internal.KeyParser<com.google.crypto.tink.internal.ProtoKeySerialization> r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.PRIVATE_KEY_PARSER
            r1.registerKeyParser(r0)
            return
    }

    private static com.google.crypto.tink.internal.ProtoParametersSerialization serializeParameters(com.google.crypto.tink.signature.EcdsaParameters r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = com.google.crypto.tink.proto.EcdsaKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EcdsaParams r2 = getProtoParams(r3)
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = r1.setParams(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaKeyFormat r1 = (com.google.crypto.tink.proto.EcdsaKeyFormat) r1
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setValue(r1)
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = r3.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r3 = toProtoOutputPrefixType(r3)
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = r0.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.KeyTemplate r3 = (com.google.crypto.tink.proto.KeyTemplate) r3
            com.google.crypto.tink.internal.ProtoParametersSerialization r3 = com.google.crypto.tink.internal.ProtoParametersSerialization.create(r3)
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializePrivateKey(com.google.crypto.tink.signature.EcdsaPrivateKey r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters r0 = r3.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r0.getCurveType()
            int r0 = getEncodingLength(r0)
            com.google.crypto.tink.proto.EcdsaPrivateKey$Builder r1 = com.google.crypto.tink.proto.EcdsaPrivateKey.newBuilder()
            com.google.crypto.tink.signature.EcdsaPublicKey r2 = r3.getPublicKey()
            com.google.crypto.tink.proto.EcdsaPublicKey r2 = getProtoPublicKey(r2)
            com.google.crypto.tink.proto.EcdsaPrivateKey$Builder r1 = r1.setPublicKey(r2)
            com.google.crypto.tink.util.SecretBigInteger r2 = r3.getPrivateValue()
            com.google.crypto.tink.SecretKeyAccess r4 = com.google.crypto.tink.SecretKeyAccess.requireAccess(r4)
            java.math.BigInteger r4 = r2.getBigInteger(r4)
            byte[] r4 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r4, r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r4)
            com.google.crypto.tink.proto.EcdsaPrivateKey$Builder r4 = r1.setKeyValue(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.EcdsaPrivateKey r4 = (com.google.crypto.tink.proto.EcdsaPrivateKey) r4
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            com.google.crypto.tink.signature.EcdsaParameters r1 = r3.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = r1.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r2, r4, r0, r1, r3)
            return r3
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization serializePublicKey(com.google.crypto.tink.signature.EcdsaPublicKey r3, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EcdsaPublicKey r4 = getProtoPublicKey(r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r4.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.signature.EcdsaParameters r1 = r3.getParameters()
            com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = r1.getVariant()
            com.google.crypto.tink.proto.OutputPrefixType r1 = toProtoOutputPrefixType(r1)
            java.lang.Integer r3 = r3.getIdRequirementOrNull()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r2, r4, r0, r1, r3)
            return r3
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r3 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
            return r3
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to parse EllipticCurveType: "
            r1.<init>(r2)
            int r3 = r3.getNumber()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r3 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
            return r3
        L30:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r3 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
            return r3
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.signature.EcdsaParameters$HashType r3 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512
            return r3
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to parse HashType: "
            r1.<init>(r2)
            int r3 = r3.getNumber()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r3 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384
            return r3
        L30:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r3 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256
            return r3
    }

    private static com.google.crypto.tink.proto.EllipticCurveType toProtoCurveType(com.google.crypto.tink.signature.EcdsaParameters.CurveType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            return r3
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            return r3
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            return r3
        L21:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to serialize CurveType "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.crypto.tink.proto.HashType toProtoHashType(com.google.crypto.tink.signature.EcdsaParameters.HashType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            return r3
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384
            return r3
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$HashType r0 = com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA512
            return r3
        L21:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to serialize HashType "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProtoOutputPrefixType(com.google.crypto.tink.signature.EcdsaParameters.Variant r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r3
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r3
        L16:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L21
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r3
        L21:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY
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

    private static com.google.crypto.tink.proto.EcdsaSignatureEncoding toProtoSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            return r3
        Lb:
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r0 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            return r3
        L16:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to serialize SignatureEncoding "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding toSignatureEncoding(com.google.crypto.tink.proto.EcdsaSignatureEncoding r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 != r1) goto L11
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r3 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER
            return r3
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to parse EcdsaSignatureEncoding: "
            r1.<init>(r2)
            int r3 = r3.getNumber()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2a:
            com.google.crypto.tink.signature.EcdsaParameters$SignatureEncoding r3 = com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363
            return r3
    }

    private static com.google.crypto.tink.signature.EcdsaParameters.Variant toVariant(com.google.crypto.tink.proto.OutputPrefixType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.EcdsaProtoSerialization.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
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
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
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
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY
            return r3
        L33:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY
            return r3
        L36:
            com.google.crypto.tink.signature.EcdsaParameters$Variant r3 = com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK
            return r3
    }
}
