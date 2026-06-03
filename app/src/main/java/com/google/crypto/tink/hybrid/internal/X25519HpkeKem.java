package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class X25519HpkeKem implements com.google.crypto.tink.hybrid.internal.HpkeKem {
    private final com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdf;

    X25519HpkeKem(com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1) {
            r0 = this;
            r0.<init>()
            r0.hkdf = r1
            return
    }

    private byte[] deriveKemSharedSecret(byte[] r9, byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r8 = this;
            byte[][] r10 = new byte[][]{r10, r11}
            byte[] r4 = com.google.crypto.tink.subtle.Bytes.concat(r10)
            byte[] r10 = com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID
            byte[] r6 = com.google.crypto.tink.hybrid.internal.HpkeUtil.kemSuiteId(r10)
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = r8.hkdf
            java.lang.String r5 = "shared_secret"
            int r7 = r0.getMacLength()
            r1 = 0
            java.lang.String r3 = "eae_prk"
            r2 = r9
            byte[] r9 = r0.extractAndExpand(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] decapsulate(byte[] r2, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r3) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r3.getSerializedPrivate()
            byte[] r0 = r0.toByteArray()
            byte[] r0 = com.google.crypto.tink.subtle.X25519.computeSharedSecret(r0, r2)
            com.google.crypto.tink.util.Bytes r3 = r3.getSerializedPublic()
            byte[] r3 = r3.toByteArray()
            byte[] r2 = r1.deriveKemSharedSecret(r0, r2, r3)
            return r2
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.subtle.X25519.generatePrivateKey()
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r2 = r1.encapsulate(r2, r0)
            return r2
    }

    com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.subtle.X25519.computeSharedSecret(r3, r2)
            byte[] r3 = com.google.crypto.tink.subtle.X25519.publicFromPrivate(r3)
            byte[] r2 = r1.deriveKemSharedSecret(r0, r3, r2)
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r0 = new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput
            r0.<init>(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] getKemId() throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = r2.hkdf
            byte[] r0 = r0.getKdfId()
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L11
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID
            return r0
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KEM ID"
            r0.<init>(r1)
            throw r0
    }
}
