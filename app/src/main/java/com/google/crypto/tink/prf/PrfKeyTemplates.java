package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes2.dex */
public final class PrfKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES_CMAC_PRF = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HKDF_SHA256 = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA256_PRF = null;
    public static final com.google.crypto.tink.proto.KeyTemplate HMAC_SHA512_PRF = null;

    static {
            com.google.crypto.tink.proto.KeyTemplate r0 = createHkdfKeyTemplate()
            com.google.crypto.tink.prf.PrfKeyTemplates.HKDF_SHA256 = r0
            r0 = 32
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacTemplate(r0, r1)
            com.google.crypto.tink.prf.PrfKeyTemplates.HMAC_SHA256_PRF = r0
            r0 = 64
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.KeyTemplate r0 = createHmacTemplate(r0, r1)
            com.google.crypto.tink.prf.PrfKeyTemplates.HMAC_SHA512_PRF = r0
            com.google.crypto.tink.proto.KeyTemplate r0 = createAes256CmacTemplate()
            com.google.crypto.tink.prf.PrfKeyTemplates.AES_CMAC_PRF = r0
            return
    }

    private PrfKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.crypto.tink.proto.KeyTemplate createAes256CmacTemplate() {
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesCmacPrfKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.AesCmacPrfKeyFormat r0 = (com.google.crypto.tink.proto.AesCmacPrfKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.prf.AesCmacPrfKeyManager r2 = new com.google.crypto.tink.prf.AesCmacPrfKeyManager
            r2.<init>()
            java.lang.String r2 = r2.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r1.setValue(r0)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            return r0
    }

    private static com.google.crypto.tink.proto.KeyTemplate createHkdfKeyTemplate() {
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r1 = com.google.crypto.tink.proto.HkdfPrfParams.newBuilder()
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r1 = r1.setHash(r2)
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HkdfPrfKeyFormat r0 = (com.google.crypto.tink.proto.HkdfPrfKeyFormat) r0
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r1.setValue(r0)
            java.lang.String r1 = com.google.crypto.tink.prf.HkdfPrfKeyManager.staticKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = r0.setOutputPrefixType(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTemplate r0 = (com.google.crypto.tink.proto.KeyTemplate) r0
            return r0
    }

    private static com.google.crypto.tink.proto.KeyTemplate createHmacTemplate(int r1, com.google.crypto.tink.proto.HashType r2) {
            com.google.crypto.tink.proto.HmacPrfParams$Builder r0 = com.google.crypto.tink.proto.HmacPrfParams.newBuilder()
            com.google.crypto.tink.proto.HmacPrfParams$Builder r2 = r0.setHash(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.HmacPrfParams r2 = (com.google.crypto.tink.proto.HmacPrfParams) r2
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r0 = com.google.crypto.tink.proto.HmacPrfKeyFormat.newBuilder()
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r2 = r0.setParams(r2)
            com.google.crypto.tink.proto.HmacPrfKeyFormat$Builder r1 = r2.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.HmacPrfKeyFormat r1 = (com.google.crypto.tink.proto.HmacPrfKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.prf.HmacPrfKeyManager r0 = new com.google.crypto.tink.prf.HmacPrfKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r2 = r2.setTypeUrl(r0)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r2.setValue(r1)
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }
}
