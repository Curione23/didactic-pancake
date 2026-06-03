package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class StreamingAeadFactory {
    private StreamingAeadFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.StreamingAead getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.streamingaead.StreamingAeadWrapper.register()
            java.lang.Class<com.google.crypto.tink.StreamingAead> r0 = com.google.crypto.tink.StreamingAead.class
            java.lang.Object r1 = r1.getPrimitive(r0)
            com.google.crypto.tink.StreamingAead r1 = (com.google.crypto.tink.StreamingAead) r1
            return r1
    }
}
