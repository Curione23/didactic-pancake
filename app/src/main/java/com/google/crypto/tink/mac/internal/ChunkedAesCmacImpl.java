package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class ChunkedAesCmacImpl implements com.google.crypto.tink.mac.ChunkedMac {
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.mac.AesCmacKey key;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl.FIPS = r0
            return
    }

    public ChunkedAesCmacImpl(com.google.crypto.tink.mac.AesCmacKey r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto Le
            r1.key = r2
            return
        Le:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use AES-CMAC in FIPS-mode."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation r0 = new com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation
            com.google.crypto.tink.mac.AesCmacKey r1 = r2.key
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.mac.ChunkedMac
    public com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            com.google.crypto.tink.mac.AesCmacKey r1 = r3.key
            com.google.crypto.tink.util.Bytes r1 = r1.getOutputPrefix()
            int r1 = r1.size()
            if (r0 < r1) goto L38
            com.google.crypto.tink.mac.AesCmacKey r0 = r3.key
            com.google.crypto.tink.util.Bytes r0 = r0.getOutputPrefix()
            com.google.crypto.tink.mac.AesCmacKey r1 = r3.key
            com.google.crypto.tink.util.Bytes r1 = r1.getOutputPrefix()
            int r1 = r1.size()
            r2 = 0
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r4, r2, r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            com.google.crypto.tink.mac.internal.ChunkedAesCmacVerification r0 = new com.google.crypto.tink.mac.internal.ChunkedAesCmacVerification
            com.google.crypto.tink.mac.AesCmacKey r1 = r3.key
            r0.<init>(r1, r4)
            return r0
        L30:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Wrong tag prefix"
            r4.<init>(r0)
            throw r4
        L38:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Tag too short"
            r4.<init>(r0)
            throw r4
    }
}
