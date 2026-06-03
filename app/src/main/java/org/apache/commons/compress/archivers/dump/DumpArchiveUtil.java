package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes2.dex */
final class DumpArchiveUtil {
    private DumpArchiveUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int calculateChecksum(byte[] r3) {
            r0 = 0
            r1 = r0
        L2:
            r2 = 256(0x100, float:3.59E-43)
            if (r0 >= r2) goto L10
            int r2 = r0 * 4
            int r2 = convert32(r3, r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L10:
            r0 = 28
            int r3 = convert32(r3, r0)
            int r1 = r1 - r3
            r3 = 84446(0x149de, float:1.18334E-40)
            int r3 = r3 - r1
            return r3
    }

    public static int convert16(byte[] r1, int r2) {
            r0 = 2
            long r1 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1, r2, r0)
            int r1 = (int) r1
            return r1
    }

    public static int convert32(byte[] r1, int r2) {
            r0 = 4
            long r1 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1, r2, r0)
            int r1 = (int) r1
            return r1
    }

    public static long convert64(byte[] r1, int r2) {
            r0 = 8
            long r1 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r1, r2, r0)
            return r1
    }

    static java.lang.String decode(org.apache.commons.compress.archivers.zip.ZipEncoding r0, byte[] r1, int r2, int r3) throws java.io.IOException {
            int r3 = r3 + r2
            if (r2 > r3) goto Lc
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.String r0 = r0.decode(r1)
            return r0
        Lc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid offset/length combination"
            r0.<init>(r1)
            throw r0
    }

    public static int getIno(byte[] r1) {
            r0 = 20
            int r1 = convert32(r1, r0)
            return r1
    }

    public static boolean verify(byte[] r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 24
            int r1 = convert32(r3, r1)
            r2 = 60012(0xea6c, float:8.4095E-41)
            if (r1 == r2) goto L10
            return r0
        L10:
            r1 = 28
            int r1 = convert32(r3, r1)
            int r3 = calculateChecksum(r3)
            if (r1 != r3) goto L1d
            r0 = 1
        L1d:
            return r0
    }
}
