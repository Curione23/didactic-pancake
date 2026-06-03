package org.tukaani.xz.check;

/* JADX INFO: loaded from: classes2.dex */
public class SHA256 extends org.tukaani.xz.check.Check {
    private final java.security.MessageDigest sha256;

    public SHA256() throws java.security.NoSuchAlgorithmException {
            r1 = this;
            r1.<init>()
            r0 = 32
            r1.size = r0
            java.lang.String r0 = "SHA-256"
            r1.name = r0
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            r1.sha256 = r0
            return
    }

    @Override // org.tukaani.xz.check.Check
    public byte[] finish() {
            r2 = this;
            java.security.MessageDigest r0 = r2.sha256
            byte[] r0 = r0.digest()
            java.security.MessageDigest r1 = r2.sha256
            r1.reset()
            return r0
    }

    @Override // org.tukaani.xz.check.Check
    public void update(byte[] r2, int r3, int r4) {
            r1 = this;
            java.security.MessageDigest r0 = r1.sha256
            r0.update(r2, r3, r4)
            return
    }
}
