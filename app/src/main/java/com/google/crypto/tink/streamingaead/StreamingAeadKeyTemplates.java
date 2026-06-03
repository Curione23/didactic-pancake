package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamingAeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256_4KB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM_HKDF_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM_HKDF_4KB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256_4KB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM_HKDF_1MB = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM_HKDF_4KB = null;

    static {
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            r4 = 32
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = 16
            r2 = 16
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r0, r1, r2, r3, r4, r5)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_CTR_HMAC_SHA256_4KB = r0
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256
            r5 = 32
            r6 = 1048576(0x100000, float:1.469368E-39)
            r1 = 16
            r3 = 16
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_CTR_HMAC_SHA256_1MB = r0
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256
            r6 = 4096(0x1000, float:5.74E-42)
            r1 = 32
            r3 = 32
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_CTR_HMAC_SHA256_4KB = r0
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256
            r6 = 1048576(0x100000, float:1.469368E-39)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacStreamingKeyTemplate(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_CTR_HMAC_SHA256_1MB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 16
            r2 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r2)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_GCM_HKDF_4KB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r3 = 1048576(0x100000, float:1.469368E-39)
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r3)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES128_GCM_HKDF_1MB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            r1 = 32
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r2)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_GCM_HKDF_4KB = r0
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesGcmHkdfStreamingKeyTemplate(r1, r0, r1, r3)
            com.google.crypto.tink.streamingaead.StreamingAeadKeyTemplates.AES256_GCM_HKDF_1MB = r0
            return
    }

    private StreamingAeadKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesCtrHmacStreamingKeyTemplate(int r1, com.google.crypto.tink.proto.HashType r2, int r3, com.google.crypto.tink.proto.HashType r4, int r5, int r6) {
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r4 = r0.setHash(r4)
            com.google.crypto.tink.proto.HmacParams$Builder r4 = r4.setTagSize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r4 = r4.build()
            com.google.crypto.tink.proto.HmacParams r4 = (com.google.crypto.tink.proto.HmacParams) r4
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r5 = com.google.crypto.tink.proto.AesCtrHmacStreamingParams.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r5 = r5.setCiphertextSegmentSize(r6)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r3 = r5.setDerivedKeySize(r3)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r2 = r3.setHkdfHashType(r2)
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams$Builder r2 = r2.setHmacParams(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrHmacStreamingParams r2 = (com.google.crypto.tink.proto.AesCtrHmacStreamingParams) r2
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r3 = com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r2 = r3.setParams(r2)
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat$Builder r1 = r2.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat r1 = (com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager r2 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesGcmHkdfStreamingKeyTemplate(int r1, com.google.crypto.tink.proto.HashType r2, int r3, int r4) {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.newBuilder()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r4 = r0.setCiphertextSegmentSize(r4)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r3 = r4.setDerivedKeySize(r3)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r2 = r3.setHkdfHashType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r2 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r2
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r3 = com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = r3.setKeySize(r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat$Builder r1 = r1.setParams(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat r1 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager r2 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }
}
