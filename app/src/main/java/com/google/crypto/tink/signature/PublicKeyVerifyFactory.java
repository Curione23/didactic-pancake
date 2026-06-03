package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class PublicKeyVerifyFactory {
    private PublicKeyVerifyFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.PublicKeyVerify getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.register()
            java.lang.Class<com.google.crypto.tink.PublicKeyVerify> r0 = com.google.crypto.tink.PublicKeyVerify.class
            java.lang.Object r1 = r1.getPrimitive(r0)
            com.google.crypto.tink.PublicKeyVerify r1 = (com.google.crypto.tink.PublicKeyVerify) r1
            return r1
    }
}
