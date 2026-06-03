package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class EciesHkdfSenderKem {
    private final java.security.interfaces.ECPublicKey recipientPublicKey;

    public static final class KemKey {
        private final com.google.crypto.tink.util.Bytes kemBytes;
        private final com.google.crypto.tink.util.Bytes symmetricKey;

        public KemKey(byte[] r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto L1c
                if (r2 == 0) goto L14
                com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r1)
                r0.kemBytes = r1
                com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r2)
                r0.symmetricKey = r1
                return
            L14:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "symmetricKey must be non-null"
                r1.<init>(r2)
                throw r1
            L1c:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "KemBytes must be non-null"
                r1.<init>(r2)
                throw r1
        }

        public byte[] getKemBytes() {
                r1 = this;
                com.google.crypto.tink.util.Bytes r0 = r1.kemBytes
                byte[] r0 = r0.toByteArray()
                return r0
        }

        public byte[] getSymmetricKey() {
                r1 = this;
                com.google.crypto.tink.util.Bytes r0 = r1.symmetricKey
                byte[] r0 = r0.toByteArray()
                return r0
        }
    }

    public EciesHkdfSenderKem(java.security.interfaces.ECPublicKey r1) {
            r0 = this;
            r0.<init>()
            r0.recipientPublicKey = r1
            return
    }

    public com.google.crypto.tink.subtle.EciesHkdfSenderKem.KemKey generateKey(java.lang.String r10, byte[] r11, byte[] r12, int r13, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r14) throws java.security.GeneralSecurityException {
            r9 = this;
            java.security.interfaces.ECPublicKey r0 = r9.recipientPublicKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.KeyPair r0 = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(r0)
            java.security.PublicKey r1 = r0.getPublic()
            java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1
            java.security.PrivateKey r0 = r0.getPrivate()
            java.security.interfaces.ECPrivateKey r0 = (java.security.interfaces.ECPrivateKey) r0
            java.security.interfaces.ECPublicKey r2 = r9.recipientPublicKey
            byte[] r4 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r0, r2)
            java.security.spec.ECParameterSpec r0 = r1.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            java.security.spec.ECPoint r1 = r1.getW()
            byte[] r14 = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(r0, r14, r1)
            r3 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            byte[] r10 = com.google.crypto.tink.subtle.Hkdf.computeEciesHkdfSymmetricKey(r3, r4, r5, r6, r7, r8)
            com.google.crypto.tink.subtle.EciesHkdfSenderKem$KemKey r11 = new com.google.crypto.tink.subtle.EciesHkdfSenderKem$KemKey
            r11.<init>(r14, r10)
            return r11
    }
}
