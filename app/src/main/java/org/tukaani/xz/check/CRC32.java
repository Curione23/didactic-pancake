package org.tukaani.xz.check;

/* JADX INFO: loaded from: classes2.dex */
public class CRC32 extends org.tukaani.xz.check.Check {
    private final java.util.zip.CRC32 state;

    public CRC32() {
            r1 = this;
            r1.<init>()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r1.state = r0
            r0 = 4
            r1.size = r0
            java.lang.String r0 = "CRC32"
            r1.name = r0
            return
    }

    @Override // org.tukaani.xz.check.Check
    public byte[] finish() {
            r3 = this;
            r0 = 4
            byte[] r0 = new byte[r0]
            java.util.zip.CRC32 r1 = r3.state
            long r1 = r1.getValue()
            int r1 = (int) r1
            r2 = 0
            org.tukaani.xz.common.ByteArrayView.setIntLE(r0, r2, r1)
            java.util.zip.CRC32 r1 = r3.state
            r1.reset()
            return r0
    }

    @Override // org.tukaani.xz.check.Check
    public void update(byte[] r2, int r3, int r4) {
            r1 = this;
            java.util.zip.CRC32 r0 = r1.state
            r0.update(r2, r3, r4)
            return
    }
}
