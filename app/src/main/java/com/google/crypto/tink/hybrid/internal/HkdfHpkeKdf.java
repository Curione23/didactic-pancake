package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class HkdfHpkeKdf implements com.google.crypto.tink.hybrid.internal.HpkeKdf {
    private final java.lang.String macAlgorithm;

    HkdfHpkeKdf(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.macAlgorithm = r1
            return
    }

    private byte[] expand(byte[] r7, byte[] r8, int r9) throws java.security.GeneralSecurityException {
            r6 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.String r1 = r6.macAlgorithm
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            int r1 = r0.getMacLength()
            int r1 = r1 * 255
            if (r9 > r1) goto L43
            byte[] r1 = new byte[r9]
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r3 = r6.macAlgorithm
            r2.<init>(r7, r3)
            r0.init(r2)
            r7 = 0
            byte[] r2 = new byte[r7]
            r3 = 1
            r4 = r7
        L23:
            r0.update(r2)
            r0.update(r8)
            byte r2 = (byte) r3
            r0.update(r2)
            byte[] r2 = r0.doFinal()
            int r5 = r2.length
            int r5 = r5 + r4
            if (r5 >= r9) goto L3e
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r7, r1, r4, r5)
            int r5 = r2.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L23
        L3e:
            int r9 = r9 - r4
            java.lang.System.arraycopy(r2, r7, r1, r4, r9)
            return r1
        L43:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "size too large"
            r7.<init>(r8)
            throw r7
    }

    private byte[] extract(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.String r1 = r3.macAlgorithm
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            if (r5 == 0) goto L1b
            int r1 = r5.length
            if (r1 != 0) goto L10
            goto L1b
        L10:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = r3.macAlgorithm
            r1.<init>(r5, r2)
            r0.init(r1)
            goto L2b
        L1b:
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            int r1 = r0.getMacLength()
            byte[] r1 = new byte[r1]
            java.lang.String r2 = r3.macAlgorithm
            r5.<init>(r1, r2)
            r0.init(r5)
        L2b:
            byte[] r4 = r0.doFinal(r4)
            return r4
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] extractAndExpand(byte[] r1, byte[] r2, java.lang.String r3, byte[] r4, java.lang.String r5, byte[] r6, int r7) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r2 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelIkm(r3, r2, r6)
            byte[] r1 = r0.extract(r2, r1)
            byte[] r2 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelInfo(r5, r4, r6, r7)
            byte[] r1 = r0.expand(r1, r2, r7)
            return r1
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] getKdfId() throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.String r0 = r3.macAlgorithm
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case 984523022: goto L24;
                case 984524074: goto L19;
                case 984525777: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L2e
        Le:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L2e
        L17:
            r2 = 2
            goto L2e
        L19:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L2e
        L22:
            r2 = 1
            goto L2e
        L24:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r2 = 0
        L2e:
            switch(r2) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                default: goto L31;
            }
        L31:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L39:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA512_KDF_ID
            return r0
        L3c:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA384_KDF_ID
            return r0
        L3f:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID
            return r0
    }

    int getMacLength() throws java.security.GeneralSecurityException {
            r1 = this;
            java.lang.String r0 = r1.macAlgorithm
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r0)
            int r0 = r0.getMacLength()
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExpand(byte[] r1, byte[] r2, java.lang.String r3, byte[] r4, int r5) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r2 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelInfo(r3, r2, r4, r5)
            byte[] r1 = r0.expand(r1, r2, r5)
            return r1
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExtract(byte[] r1, byte[] r2, java.lang.String r3, byte[] r4) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r2 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelIkm(r3, r2, r4)
            byte[] r1 = r0.extract(r2, r1)
            return r1
    }
}
