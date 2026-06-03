package com.google.crypto.tink.daead;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class DeterministicAeadFactory {
    private DeterministicAeadFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.DeterministicAead getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.daead.DeterministicAeadWrapper.register()
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r0 = com.google.crypto.tink.DeterministicAead.class
            java.lang.Object r1 = r1.getPrimitive(r0)
            com.google.crypto.tink.DeterministicAead r1 = (com.google.crypto.tink.DeterministicAead) r1
            return r1
    }
}
