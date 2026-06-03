package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
public final class AeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_CTR_HMAC_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_EAX = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES128_GCM = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_CTR_HMAC_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_EAX = null;
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_GCM = null;
    public static final com.google.crypto.tink.proto.KeyTemplate CHACHA20_POLY1305 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate XCHACHA20_POLY1305 = null;

    static {
            r0 = 16
            com.google.crypto.tink.proto.KeyTemplate r1 = createAesGcmKeyTemplate(r0)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM = r1
            r1 = 32
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesGcmKeyTemplate(r1)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES256_GCM = r2
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesEaxKeyTemplate(r0, r0)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES128_EAX = r2
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesEaxKeyTemplate(r1, r0)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES256_EAX = r2
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r2 = createAesCtrHmacAeadKeyTemplate(r0, r0, r1, r0, r2)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES128_CTR_HMAC_SHA256 = r2
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesCtrHmacAeadKeyTemplate(r1, r0, r1, r1, r2)
            com.google.crypto.tink.aead.AeadKeyTemplates.AES256_CTR_HMAC_SHA256 = r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager r1 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.aead.AeadKeyTemplates.CHACHA20_POLY1305 = r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager r1 = new com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager
            r1.<init>()
            java.lang.String r1 = r1.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            com.google.crypto.tink.aead.AeadKeyTemplates.XCHACHA20_POLY1305 = r0
            return
    }

    private AeadKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesCtrHmacAeadKeyTemplate(int r2, int r3, int r4, int r5, com.google.crypto.tink.proto.HashType r6) {
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCtrKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrParams$Builder r1 = com.google.crypto.tink.proto.AesCtrParams.newBuilder()
            com.google.crypto.tink.proto.AesCtrParams$Builder r3 = r1.setIvSize(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.AesCtrParams r3 = (com.google.crypto.tink.proto.AesCtrParams) r3
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r3 = r0.setParams(r3)
            com.google.crypto.tink.proto.AesCtrKeyFormat$Builder r2 = r3.setKeySize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrKeyFormat r2 = (com.google.crypto.tink.proto.AesCtrKeyFormat) r2
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r3 = com.google.crypto.tink.proto.HmacKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r0 = com.google.crypto.tink.proto.HmacParams.newBuilder()
            com.google.crypto.tink.proto.HmacParams$Builder r6 = r0.setHash(r6)
            com.google.crypto.tink.proto.HmacParams$Builder r5 = r6.setTagSize(r5)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r5 = r5.build()
            com.google.crypto.tink.proto.HmacParams r5 = (com.google.crypto.tink.proto.HmacParams) r5
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r3 = r3.setParams(r5)
            com.google.crypto.tink.proto.HmacKeyFormat$Builder r3 = r3.setKeySize(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()
            com.google.crypto.tink.proto.HmacKeyFormat r3 = (com.google.crypto.tink.proto.HmacKeyFormat) r3
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r4 = com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = r4.setAesCtrKeyFormat(r2)
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$Builder r2 = r2.setHmacKeyFormat(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat r2 = (com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat) r2
            com.google.crypto.tink.proto.KeyTemplate$Builder r3 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r3.setValue(r2)
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager r3 = new com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager
            r3.<init>()
            java.lang.String r3 = r3.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setTypeUrl(r3)
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setOutputPrefixType(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.KeyTemplate r2 = (com.google.crypto.tink.proto.KeyTemplate) r2
            return r2
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesEaxKeyTemplate(int r1, int r2) {
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesEaxKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r1 = r0.setKeySize(r1)
            com.google.crypto.tink.proto.AesEaxParams$Builder r0 = com.google.crypto.tink.proto.AesEaxParams.newBuilder()
            com.google.crypto.tink.proto.AesEaxParams$Builder r2 = r0.setIvSize(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.AesEaxParams r2 = (com.google.crypto.tink.proto.AesEaxParams) r2
            com.google.crypto.tink.proto.AesEaxKeyFormat$Builder r1 = r1.setParams(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesEaxKeyFormat r1 = (com.google.crypto.tink.proto.AesEaxKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.aead.AesEaxKeyManager r2 = new com.google.crypto.tink.aead.AesEaxKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesGcmKeyTemplate(int r1) {
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesGcmKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesGcmKeyFormat$Builder r1 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesGcmKeyFormat r1 = (com.google.crypto.tink.proto.AesGcmKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r0.setValue(r1)
            com.google.crypto.tink.aead.AesGcmKeyManager r0 = new com.google.crypto.tink.aead.AesGcmKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r0)
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createKmsAeadKeyTemplate(java.lang.String r1) {
            com.google.crypto.tink.proto.KmsAeadKeyFormat$Builder r0 = com.google.crypto.tink.proto.KmsAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.KmsAeadKeyFormat$Builder r1 = r0.setKeyUri(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KmsAeadKeyFormat r1 = (com.google.crypto.tink.proto.KmsAeadKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r0.setValue(r1)
            com.google.crypto.tink.aead.KmsAeadKeyManager r0 = new com.google.crypto.tink.aead.KmsAeadKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r0)
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }

    public static com.google.crypto.tink.proto.KeyTemplate createKmsEnvelopeAeadKeyTemplate(java.lang.String r1, com.google.crypto.tink.proto.KeyTemplate r2) {
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r0 = com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat.newBuilder()
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r2 = r0.setDekTemplate(r2)
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$Builder r1 = r2.setKekUri(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat r1 = (com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager r2 = new com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager
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
