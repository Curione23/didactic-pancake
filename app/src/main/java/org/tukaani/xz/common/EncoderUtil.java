package org.tukaani.xz.common;

/* JADX INFO: loaded from: classes2.dex */
public class EncoderUtil extends org.tukaani.xz.common.Util {
    public EncoderUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void encodeVLI(java.io.OutputStream r3, long r4) throws java.io.IOException {
        L0:
            r0 = 128(0x80, double:6.3E-322)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lf
            long r0 = r0 | r4
            int r0 = (int) r0
            byte r0 = (byte) r0
            r3.write(r0)
            r0 = 7
            long r4 = r4 >>> r0
            goto L0
        Lf:
            int r4 = (int) r4
            byte r4 = (byte) r4
            r3.write(r4)
            return
    }

    public static void writeCRC32(java.io.OutputStream r4, byte[] r5) throws java.io.IOException {
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r0.update(r5)
            long r0 = r0.getValue()
            r5 = 0
        Ld:
            r2 = 4
            if (r5 >= r2) goto L1c
            int r2 = r5 * 8
            long r2 = r0 >>> r2
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4.write(r2)
            int r5 = r5 + 1
            goto Ld
        L1c:
            return
    }
}
