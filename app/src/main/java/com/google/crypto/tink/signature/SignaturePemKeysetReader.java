package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes2.dex */
public final class SignaturePemKeysetReader implements com.google.crypto.tink.KeysetReader {
    private java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> pemKeys;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.SignaturePemKeysetReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static final class Builder {
        private java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> pemKeys;

        Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pemKeys = r0
                return
        }

        public com.google.crypto.tink.signature.SignaturePemKeysetReader.Builder addPem(java.lang.String r4, com.google.crypto.tink.PemKeyType r5) {
                r3 = this;
                com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey r0 = new com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey
                r1 = 0
                r0.<init>(r1)
                java.io.BufferedReader r1 = new java.io.BufferedReader
                java.io.StringReader r2 = new java.io.StringReader
                r2.<init>(r4)
                r1.<init>(r2)
                r0.reader = r1
                r0.type = r5
                java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey> r4 = r3.pemKeys
                r4.add(r0)
                return r3
        }

        public com.google.crypto.tink.KeysetReader build() {
                r2 = this;
                com.google.crypto.tink.signature.SignaturePemKeysetReader r0 = new com.google.crypto.tink.signature.SignaturePemKeysetReader
                java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey> r1 = r2.pemKeys
                r0.<init>(r1)
                return r0
        }
    }

    private static final class PemKey {
        java.io.BufferedReader reader;
        com.google.crypto.tink.PemKeyType type;

        private PemKey() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ PemKey(com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    SignaturePemKeysetReader(java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey> r1) {
            r0 = this;
            r0.<init>()
            r0.pemKeys = r1
            return
    }

    private static com.google.crypto.tink.proto.KeyData convertEcPublicKey(com.google.crypto.tink.PemKeyType r2, java.security.interfaces.ECPublicKey r3) throws java.io.IOException {
            java.lang.String r0 = r2.algorithm
            java.lang.String r1 = "ECDSA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8b
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = com.google.crypto.tink.proto.EcdsaParams.newBuilder()
            com.google.crypto.tink.proto.HashType r1 = getHashType(r2)
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = r0.setHashType(r1)
            com.google.crypto.tink.proto.EllipticCurveType r2 = getCurveType(r2)
            com.google.crypto.tink.proto.EcdsaParams$Builder r2 = r0.setCurve(r2)
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            com.google.crypto.tink.proto.EcdsaParams$Builder r2 = r2.setEncoding(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EcdsaParams r2 = (com.google.crypto.tink.proto.EcdsaParams) r2
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r0 = com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder()
            com.google.crypto.tink.signature.EcdsaVerifyKeyManager r1 = new com.google.crypto.tink.signature.EcdsaVerifyKeyManager
            r1.<init>()
            int r1 = r1.getVersion()
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r0 = r0.setVersion(r1)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = r0.setParams(r2)
            java.security.spec.ECPoint r0 = r3.getW()
            java.math.BigInteger r0 = r0.getAffineX()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r0)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = r2.setX(r0)
            java.security.spec.ECPoint r3 = r3.getW()
            java.math.BigInteger r3 = r3.getAffineY()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r3)
            com.google.crypto.tink.proto.EcdsaPublicKey$Builder r2 = r2.setY(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EcdsaPublicKey r2 = (com.google.crypto.tink.proto.EcdsaPublicKey) r2
            com.google.crypto.tink.proto.KeyData$Builder r3 = com.google.crypto.tink.proto.KeyData.newBuilder()
            com.google.crypto.tink.signature.EcdsaVerifyKeyManager r0 = new com.google.crypto.tink.signature.EcdsaVerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.KeyData$Builder r3 = r3.setTypeUrl(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.toByteString()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r3.setValue(r2)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setKeyMaterialType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyData r2 = (com.google.crypto.tink.proto.KeyData) r2
            return r2
        L8b:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unsupported EC signature algorithm: "
            r0.<init>(r1)
            java.lang.String r2 = r2.algorithm
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private static com.google.crypto.tink.proto.KeyData convertRsaPublicKey(com.google.crypto.tink.PemKeyType r2, java.security.interfaces.RSAPublicKey r3) throws java.io.IOException {
            java.lang.String r0 = r2.algorithm
            java.lang.String r1 = "RSASSA-PKCS1-v1_5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r0 = com.google.crypto.tink.proto.RsaSsaPkcs1Params.newBuilder()
            com.google.crypto.tink.proto.HashType r2 = getHashType(r2)
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r2 = r0.setHashType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1Params r2 = (com.google.crypto.tink.proto.RsaSsaPkcs1Params) r2
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r0 = com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager r1 = new com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager
            r1.<init>()
            int r1 = r1.getVersion()
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r0 = r0.setVersion(r1)
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r2 = r0.setParams(r2)
            java.math.BigInteger r0 = r3.getPublicExponent()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r0)
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r2 = r2.setE(r0)
            java.math.BigInteger r3 = r3.getModulus()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r3)
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$Builder r2 = r2.setN(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey r2 = (com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey) r2
            com.google.crypto.tink.proto.KeyData$Builder r3 = com.google.crypto.tink.proto.KeyData.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.KeyData$Builder r3 = r3.setTypeUrl(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.toByteString()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r3.setValue(r2)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setKeyMaterialType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyData r2 = (com.google.crypto.tink.proto.KeyData) r2
            return r2
        L75:
            java.lang.String r0 = r2.algorithm
            java.lang.String r1 = "RSASSA-PSS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lfa
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = com.google.crypto.tink.proto.RsaSsaPssParams.newBuilder()
            com.google.crypto.tink.proto.HashType r1 = getHashType(r2)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setSigHash(r1)
            com.google.crypto.tink.proto.HashType r1 = getHashType(r2)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = r0.setMgf1Hash(r1)
            int r2 = getDigestSizeInBytes(r2)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r2 = r0.setSaltLength(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.RsaSsaPssParams r2 = (com.google.crypto.tink.proto.RsaSsaPssParams) r2
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r0 = com.google.crypto.tink.proto.RsaSsaPssPublicKey.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager r1 = new com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager
            r1.<init>()
            int r1 = r1.getVersion()
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r0 = r0.setVersion(r1)
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r2 = r0.setParams(r2)
            java.math.BigInteger r0 = r3.getPublicExponent()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r0)
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r2 = r2.setE(r0)
            java.math.BigInteger r3 = r3.getModulus()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.signature.internal.SigUtil.toUnsignedIntByteString(r3)
            com.google.crypto.tink.proto.RsaSsaPssPublicKey$Builder r2 = r2.setN(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.RsaSsaPssPublicKey r2 = (com.google.crypto.tink.proto.RsaSsaPssPublicKey) r2
            com.google.crypto.tink.proto.KeyData$Builder r3 = com.google.crypto.tink.proto.KeyData.newBuilder()
            com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.KeyData$Builder r3 = r3.setTypeUrl(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.toByteString()
            com.google.crypto.tink.proto.KeyData$Builder r2 = r3.setValue(r2)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setKeyMaterialType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyData r2 = (com.google.crypto.tink.proto.KeyData) r2
            return r2
        Lfa:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unsupported RSA signature algorithm: "
            r0.<init>(r1)
            java.lang.String r2 = r2.algorithm
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private static com.google.crypto.tink.proto.EllipticCurveType getCurveType(com.google.crypto.tink.PemKeyType r3) {
            int r0 = r3.keySizeInBits
            r1 = 256(0x100, float:3.59E-43)
            if (r0 == r1) goto L2b
            r1 = 384(0x180, float:5.38E-43)
            if (r0 == r1) goto L28
            r1 = 521(0x209, float:7.3E-43)
            if (r0 != r1) goto L11
            com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            return r3
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported curve for key size: "
            r1.<init>(r2)
            int r3 = r3.keySizeInBits
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L28:
            com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            return r3
        L2b:
            com.google.crypto.tink.proto.EllipticCurveType r3 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            return r3
    }

    private static int getDigestSizeInBytes(com.google.crypto.tink.PemKeyType r3) {
            int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            com.google.crypto.tink.subtle.Enums$HashType r1 = r3.hash
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L31
            r1 = 3
            if (r0 != r1) goto L16
            r3 = 64
            return r3
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported hash type: "
            r1.<init>(r2)
            com.google.crypto.tink.subtle.Enums$HashType r3 = r3.hash
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L31:
            r3 = 48
            return r3
        L34:
            r3 = 32
            return r3
    }

    private static com.google.crypto.tink.proto.HashType getHashType(com.google.crypto.tink.PemKeyType r3) {
            int[] r0 = com.google.crypto.tink.signature.SignaturePemKeysetReader.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            com.google.crypto.tink.subtle.Enums$HashType r1 = r3.hash
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r1 = 2
            if (r0 == r1) goto L31
            r1 = 3
            if (r0 != r1) goto L16
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA512
            return r3
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported hash type: "
            r1.<init>(r2)
            com.google.crypto.tink.subtle.Enums$HashType r3 = r3.hash
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L31:
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384
            return r3
        L34:
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            return r3
    }

    public static com.google.crypto.tink.signature.SignaturePemKeysetReader.Builder newBuilder() {
            com.google.crypto.tink.signature.SignaturePemKeysetReader$Builder r0 = new com.google.crypto.tink.signature.SignaturePemKeysetReader$Builder
            r0.<init>()
            return r0
    }

    private static com.google.crypto.tink.proto.Keyset.Key readKey(java.io.BufferedReader r2, com.google.crypto.tink.PemKeyType r3) throws java.io.IOException {
            java.security.Key r2 = r3.readKey(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r1 = r2 instanceof java.security.interfaces.RSAPublicKey
            if (r1 == 0) goto L13
            java.security.interfaces.RSAPublicKey r2 = (java.security.interfaces.RSAPublicKey) r2
            com.google.crypto.tink.proto.KeyData r2 = convertRsaPublicKey(r3, r2)
            goto L1d
        L13:
            boolean r1 = r2 instanceof java.security.interfaces.ECPublicKey
            if (r1 == 0) goto L40
            java.security.interfaces.ECPublicKey r2 = (java.security.interfaces.ECPublicKey) r2
            com.google.crypto.tink.proto.KeyData r2 = convertEcPublicKey(r3, r2)
        L1d:
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r3.setKeyData(r2)
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setStatus(r3)
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setOutputPrefixType(r3)
            int r3 = com.google.crypto.tink.subtle.Random.randInt()
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyId(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            return r2
        L40:
            return r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
            r5 = this;
            com.google.crypto.tink.proto.Keyset$Builder r0 = com.google.crypto.tink.proto.Keyset.newBuilder()
            java.util.List<com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey> r1 = r5.pemKeys
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.signature.SignaturePemKeysetReader$PemKey r2 = (com.google.crypto.tink.signature.SignaturePemKeysetReader.PemKey) r2
            java.io.BufferedReader r3 = r2.reader
            com.google.crypto.tink.PemKeyType r4 = r2.type
            com.google.crypto.tink.proto.Keyset$Key r3 = readKey(r3, r4)
        L1e:
            if (r3 == 0) goto La
            r0.addKey(r3)
            java.io.BufferedReader r3 = r2.reader
            com.google.crypto.tink.PemKeyType r4 = r2.type
            com.google.crypto.tink.proto.Keyset$Key r3 = readKey(r3, r4)
            goto L1e
        L2c:
            int r1 = r0.getKeyCount()
            if (r1 == 0) goto L45
            r1 = 0
            com.google.crypto.tink.proto.Keyset$Key r1 = r0.getKey(r1)
            int r1 = r1.getKeyId()
            r0.setPrimaryKeyId(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.Keyset r0 = (com.google.crypto.tink.proto.Keyset) r0
            return r0
        L45:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cannot find any key"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
