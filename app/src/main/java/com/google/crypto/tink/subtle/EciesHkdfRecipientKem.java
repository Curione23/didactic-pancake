package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class EciesHkdfRecipientKem {
    private java.security.interfaces.ECPrivateKey recipientPrivateKey;

    public EciesHkdfRecipientKem(java.security.interfaces.ECPrivateKey r1) {
            r0 = this;
            r0.<init>()
            r0.recipientPrivateKey = r1
            return
    }

    public byte[] generateKey(byte[] r8, java.lang.String r9, byte[] r10, byte[] r11, int r12, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r13) throws java.security.GeneralSecurityException {
            r7 = this;
            java.security.interfaces.ECPrivateKey r0 = r7.recipientPrivateKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.interfaces.ECPublicKey r13 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r0, r13, r8)
            java.security.interfaces.ECPrivateKey r0 = r7.recipientPrivateKey
            byte[] r2 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r0, r13)
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            byte[] r8 = com.google.crypto.tink.subtle.Hkdf.computeEciesHkdfSymmetricKey(r1, r2, r3, r4, r5, r6)
            return r8
    }
}
