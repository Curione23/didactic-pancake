package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public class PrfMac implements com.google.crypto.tink.Mac {
    static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private final int tagSize;
    private final com.google.crypto.tink.prf.Prf wrappedPrf;

    public PrfMac(com.google.crypto.tink.prf.Prf r2, int r3) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            r1.wrappedPrf = r2
            r1.tagSize = r3
            r0 = 10
            if (r3 < r0) goto L12
            r0 = 0
            byte[] r0 = new byte[r0]
            r2.compute(r0, r3)
            return
        L12:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too small, need at least 10 bytes"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.google.crypto.tink.Mac
    public byte[] computeMac(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.prf.Prf r0 = r2.wrappedPrf
            int r1 = r2.tagSize
            byte[] r3 = r0.compute(r3, r1)
            return r3
    }

    @Override // com.google.crypto.tink.Mac
    public void verifyMac(byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r2 = r0.computeMac(r2)
            boolean r1 = com.google.crypto.tink.subtle.Bytes.equal(r2, r1)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid MAC"
            r1.<init>(r2)
            throw r1
    }
}
