package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class EciesAeadHkdfHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private static final byte[] EMPTY_AAD = null;
    private final com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper demHelper;
    private final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType ecPointFormat;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final com.google.crypto.tink.subtle.EciesHkdfRecipientKem recipientKem;
    private final java.security.interfaces.ECPrivateKey recipientPrivateKey;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt.EMPTY_AAD = r0
            return
    }

    public EciesAeadHkdfHybridDecrypt(java.security.interfaces.ECPrivateKey r2, byte[] r3, java.lang.String r4, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r5, com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r6) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            r1.recipientPrivateKey = r2
            com.google.crypto.tink.subtle.EciesHkdfRecipientKem r0 = new com.google.crypto.tink.subtle.EciesHkdfRecipientKem
            r0.<init>(r2)
            r1.recipientKem = r0
            r1.hkdfSalt = r3
            r1.hkdfHmacAlgo = r4
            r1.ecPointFormat = r5
            r1.demHelper = r6
            return
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r9 = this;
            java.security.interfaces.ECPrivateKey r0 = r9.recipientPrivateKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = r9.ecPointFormat
            int r0 = com.google.crypto.tink.subtle.EllipticCurves.encodingSizeInBytes(r0, r1)
            int r1 = r10.length
            if (r1 < r0) goto L3d
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r0)
            com.google.crypto.tink.subtle.EciesHkdfRecipientKem r2 = r9.recipientKem
            java.lang.String r4 = r9.hkdfHmacAlgo
            byte[] r5 = r9.hkdfSalt
            com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r1 = r9.demHelper
            int r7 = r1.getSymmetricKeySizeInBytes()
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r8 = r9.ecPointFormat
            r6 = r11
            byte[] r11 = r2.generateKey(r3, r4, r5, r6, r7, r8)
            com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r1 = r9.demHelper
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r11 = r1.getAeadOrDaead(r11)
            int r1 = r10.length
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r0, r1)
            byte[] r0 = com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt.EMPTY_AAD
            byte[] r10 = r11.decrypt(r10, r0)
            return r10
        L3d:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
    }
}
