package com.google.crypto.tink.daead;

/* JADX INFO: loaded from: classes2.dex */
public final class DeterministicAeadKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate AES256_SIV = null;

    static {
            r0 = 64
            com.google.crypto.tink.proto.KeyTemplate r0 = createAesSivKeyTemplate(r0)
            com.google.crypto.tink.daead.DeterministicAeadKeyTemplates.AES256_SIV = r0
            return
    }

    private DeterministicAeadKeyTemplates() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTemplate createAesSivKeyTemplate(int r1) {
            com.google.crypto.tink.proto.AesSivKeyFormat$Builder r0 = com.google.crypto.tink.proto.AesSivKeyFormat.newBuilder()
            com.google.crypto.tink.proto.AesSivKeyFormat$Builder r1 = r0.setKeySize(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.AesSivKeyFormat r1 = (com.google.crypto.tink.proto.AesSivKeyFormat) r1
            com.google.crypto.tink.proto.KeyTemplate$Builder r0 = com.google.crypto.tink.proto.KeyTemplate.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.toByteString()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r0.setValue(r1)
            com.google.crypto.tink.daead.AesSivKeyManager r0 = new com.google.crypto.tink.daead.AesSivKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setTypeUrl(r0)
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.KeyTemplate$Builder r1 = r1.setOutputPrefixType(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyTemplate r1 = (com.google.crypto.tink.proto.KeyTemplate) r1
            return r1
    }
}
