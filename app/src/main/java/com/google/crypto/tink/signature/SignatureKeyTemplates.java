package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P256_IEEE_P1363 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P384 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P384_IEEE_P1363 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P521 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P521_IEEE_P1363 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ED25519 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ED25519WithRawOutput = null;
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PKCS1_3072_SHA256_F4 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX = null;
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PKCS1_4096_SHA512_F4 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PSS_3072_SHA256_SHA256_32_F4 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PSS_4096_SHA512_SHA512_64_F4 = null;

    static {
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate r0 = createEcdsaKeyTemplate(r0, r1, r2, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.ECDSA_P256 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate r0 = createEcdsaKeyTemplate(r0, r1, r2, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.ECDSA_P384 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate r0 = createEcdsaKeyTemplate(r0, r1, r2, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.ECDSA_P521 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate r0 = createEcdsaKeyTemplate(r0, r1, r2, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.ECDSA_P256_IEEE_P1363 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate r0 = createEcdsaKeyTemplate(r0, r1, r2, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.ECDSA_P384_IEEE_P1363 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate r0 = createEcdsaKeyTemplate(r0, r1, r2, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate r0 = createEcdsaKeyTemplate(r0, r1, r2, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.ECDSA_P521_IEEE_P1363 = r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager r1 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.signature.SignatureKeyTemplates.ED25519 = r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager r1 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.signature.SignatureKeyTemplates.ED25519WithRawOutput = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            r3 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.proto.KeyTemplate r0 = createRsaSsaPkcs1KeyTemplate(r0, r3, r1, r2)
            com.google.crypto.tink.signature.SignatureKeyTemplates.RSA_SSA_PKCS1_3072_SHA256_F4 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate r0 = createRsaSsaPkcs1KeyTemplate(r0, r3, r1, r2)
            com.google.crypto.tink.signature.SignatureKeyTemplates.RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            r4 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.proto.KeyTemplate r0 = createRsaSsaPkcs1KeyTemplate(r0, r4, r1, r2)
            com.google.crypto.tink.signature.SignatureKeyTemplates.RSA_SSA_PKCS1_4096_SHA512_F4 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            r2 = 32
            java.math.BigInteger r5 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.proto.KeyTemplate r0 = createRsaSsaPssKeyTemplate(r0, r1, r2, r3, r5)
            com.google.crypto.tink.signature.SignatureKeyTemplates.RSA_SSA_PSS_3072_SHA256_SHA256_32_F4 = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            r2 = 64
            java.math.BigInteger r3 = java.security.spec.RSAKeyGenParameterSpec.F4
            com.google.crypto.tink.proto.KeyTemplate r0 = createRsaSsaPssKeyTemplate(r0, r1, r2, r4, r3)
            com.google.crypto.tink.signature.SignatureKeyTemplates.RSA_SSA_PSS_4096_SHA512_SHA512_64_F4 = r0
            return
    }

    private SignatureKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType r1, com.google.crypto.tink.proto.EllipticCurveType r2, com.google.crypto.tink.proto.EcdsaSignatureEncoding r3, com.google.crypto.tink.proto.OutputPrefixType r4) {
            com.google.crypto.tink.proto.EcdsaParams$Builder r0 = com.google.crypto.tink.proto.EcdsaParams.newBuilder()
            com.google.crypto.tink.proto.EcdsaParams$Builder r1 = r0.setHashType(r1)
            com.google.crypto.tink.proto.EcdsaParams$Builder r1 = r1.setCurve(r2)
            com.google.crypto.tink.proto.EcdsaParams$Builder r1 = r1.setEncoding(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaParams r1 = (com.google.crypto.tink.proto.EcdsaParams) r1
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r2 = com.google.crypto.tink.proto.EcdsaKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EcdsaKeyFormat$Builder r1 = r2.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EcdsaKeyFormat r1 = (com.google.crypto.tink.proto.EcdsaKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.signature.EcdsaSignKeyManager r2 = new com.google.crypto.tink.signature.EcdsaSignKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createRsaSsaPkcs1KeyTemplate(com.google.crypto.tink.proto.HashType r1, int r2, java.math.BigInteger r3, com.google.crypto.tink.proto.OutputPrefixType r4) {
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r0 = com.google.crypto.tink.proto.RsaSsaPkcs1Params.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPkcs1Params$Builder r1 = r0.setHashType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1Params r1 = (com.google.crypto.tink.proto.RsaSsaPkcs1Params) r1
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r0 = com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r1 = r0.setParams(r1)
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r1 = r1.setModulusSizeInBits(r2)
            byte[] r2 = r3.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$Builder r1 = r1.setPublicExponent(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat r1 = (com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager r2 = new com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createRsaSsaPssKeyTemplate(com.google.crypto.tink.proto.HashType r1, com.google.crypto.tink.proto.HashType r2, int r3, int r4, java.math.BigInteger r5) {
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r0 = com.google.crypto.tink.proto.RsaSsaPssParams.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r1 = r0.setSigHash(r1)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r1 = r1.setMgf1Hash(r2)
            com.google.crypto.tink.proto.RsaSsaPssParams$Builder r1 = r1.setSaltLength(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPssParams r1 = (com.google.crypto.tink.proto.RsaSsaPssParams) r1
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r2 = com.google.crypto.tink.proto.RsaSsaPssKeyFormat.newBuilder()
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r1 = r2.setParams(r1)
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r1 = r1.setModulusSizeInBits(r4)
            byte[] r2 = r5.toByteArray()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat$Builder r1 = r1.setPublicExponent(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.RsaSsaPssKeyFormat r1 = (com.google.crypto.tink.proto.RsaSsaPssKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.signature.RsaSsaPssSignKeyManager r2 = new com.google.crypto.tink.signature.RsaSsaPssSignKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }
}
