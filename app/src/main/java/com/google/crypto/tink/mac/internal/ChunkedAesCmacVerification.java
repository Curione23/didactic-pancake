package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes2.dex */
final class ChunkedAesCmacVerification implements com.google.crypto.tink.mac.ChunkedMacVerification {
    private final com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation aesCmacComputation;
    private final com.google.crypto.tink.util.Bytes tag;

    ChunkedAesCmacVerification(com.google.crypto.tink.mac.AesCmacKey r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation r0 = new com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation
            r0.<init>(r2)
            r1.aesCmacComputation = r0
            com.google.crypto.tink.util.Bytes r2 = com.google.crypto.tink.util.Bytes.copyFrom(r3)
            r1.tag = r2
            return
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public void update(java.nio.ByteBuffer r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation r0 = r1.aesCmacComputation
            r0.update(r2)
            return
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public void verifyMac() throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation r0 = r2.aesCmacComputation
            byte[] r0 = r0.computeMac()
            com.google.crypto.tink.util.Bytes r1 = r2.tag
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            return
        L13:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid MAC"
            r0.<init>(r1)
            throw r0
    }
}
