package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class Hkdf {
    private Hkdf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] computeEciesHkdfSymmetricKey(byte[] r0, byte[] r1, java.lang.String r2, byte[] r3, byte[] r4, int r5) throws java.security.GeneralSecurityException {
            byte[][] r0 = new byte[][]{r0, r1}
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            byte[] r0 = computeHkdf(r2, r0, r3, r4, r5)
            return r0
    }

    public static byte[] computeHkdf(java.lang.String r4, byte[] r5, byte[] r6, byte[] r7, int r8) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.Object r0 = r0.getInstance(r4)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            int r1 = r0.getMacLength()
            int r1 = r1 * 255
            if (r8 > r1) goto L60
            if (r6 == 0) goto L1f
            int r1 = r6.length
            if (r1 != 0) goto L16
            goto L1f
        L16:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            r1.<init>(r6, r4)
            r0.init(r1)
            goto L2d
        L1f:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            int r1 = r0.getMacLength()
            byte[] r1 = new byte[r1]
            r6.<init>(r1, r4)
            r0.init(r6)
        L2d:
            byte[] r5 = r0.doFinal(r5)
            byte[] r6 = new byte[r8]
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            r1.<init>(r5, r4)
            r0.init(r1)
            r4 = 0
            byte[] r5 = new byte[r4]
            r1 = 1
            r2 = r4
        L40:
            r0.update(r5)
            r0.update(r7)
            byte r5 = (byte) r1
            r0.update(r5)
            byte[] r5 = r0.doFinal()
            int r3 = r5.length
            int r3 = r3 + r2
            if (r3 >= r8) goto L5b
            int r3 = r5.length
            java.lang.System.arraycopy(r5, r4, r6, r2, r3)
            int r3 = r5.length
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L40
        L5b:
            int r8 = r8 - r2
            java.lang.System.arraycopy(r5, r4, r6, r2, r8)
            return r6
        L60:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "size too large"
            r4.<init>(r5)
            throw r4
    }
}
