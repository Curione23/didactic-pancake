package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes2.dex */
public final class HybridKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM = null;
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX = null;
    private static final byte[] EMPTY_SALT = null;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.HybridKeyTemplates.EMPTY_SALT = r0
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            com.google.crypto.tink.proto.KeyTemplate r4 = com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            r6 = r0
            com.google.crypto.tink.proto.KeyTemplate r1 = createEciesAeadHkdfKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.hybrid.HybridKeyTemplates.ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM = r1
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED
            com.google.crypto.tink.proto.KeyTemplate r4 = com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate r1 = createEciesAeadHkdfKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.hybrid.HybridKeyTemplates.ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX = r1
            com.google.crypto.tink.proto.EllipticCurveType r1 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            com.google.crypto.tink.proto.KeyTemplate r4 = com.google.crypto.tink.aead.AeadKeyTemplates.AES128_CTR_HMAC_SHA256
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate r0 = createEciesAeadHkdfKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.hybrid.HybridKeyTemplates.ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256 = r0
            return
    }

    private HybridKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createEciesAeadHkdfKeyTemplate(com.google.crypto.tink.proto.EllipticCurveType r1, com.google.crypto.tink.proto.HashType r2, com.google.crypto.tink.proto.EcPointFormat r3, com.google.crypto.tink.proto.KeyTemplate r4, com.google.crypto.tink.proto.OutputPrefixType r5, byte[] r6) {
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r0 = com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r1 = createEciesAeadHkdfParams(r1, r2, r3, r4, r6)
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$Builder r1 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat r1 = (com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager r3 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setOutputPrefixType(r5)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.EciesAeadHkdfParams createEciesAeadHkdfParams(com.google.crypto.tink.proto.EllipticCurveType r1, com.google.crypto.tink.proto.HashType r2, com.google.crypto.tink.proto.EcPointFormat r3, com.google.crypto.tink.proto.KeyTemplate r4, byte[] r5) {
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r0 = com.google.crypto.tink.proto.EciesHkdfKemParams.newBuilder()
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = r0.setCurveType(r1)
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = r1.setHkdfHashType(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r5)
            com.google.crypto.tink.proto.EciesHkdfKemParams$Builder r1 = r1.setHkdfSalt(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = (com.google.crypto.tink.proto.EciesHkdfKemParams) r1
            com.google.crypto.tink.proto.EciesAeadDemParams$Builder r2 = com.google.crypto.tink.proto.EciesAeadDemParams.newBuilder()
            com.google.crypto.tink.proto.EciesAeadDemParams$Builder r2 = r2.setAeadDem(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.EciesAeadDemParams r2 = (com.google.crypto.tink.proto.EciesAeadDemParams) r2
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r4 = com.google.crypto.tink.proto.EciesAeadHkdfParams.newBuilder()
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r1 = r4.setKemParams(r1)
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r1 = r1.setDemParams(r2)
            com.google.crypto.tink.proto.EciesAeadHkdfParams$Builder r1 = r1.setEcPointFormat(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EciesAeadHkdfParams r1 = (com.google.crypto.tink.proto.EciesAeadHkdfParams) r1
            return r1
    }
}
