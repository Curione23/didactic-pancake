package org.tukaani.xz.lz;

/* JADX INFO: loaded from: classes2.dex */
class CRC32Hash {
    private static final int CRC32_POLY = -306674912;
    static final int[] crcTable = null;

    static {
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            org.tukaani.xz.lz.CRC32Hash.crcTable = r1
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L27
            r3 = r1
            r4 = r2
        Lc:
            r5 = 8
            if (r3 >= r5) goto L20
            r5 = r4 & 1
            if (r5 == 0) goto L1b
            int r4 = r4 >>> 1
            r5 = -306674912(0xffffffffedb88320, float:-7.13797E27)
            r4 = r4 ^ r5
            goto L1d
        L1b:
            int r4 = r4 >>> 1
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            int[] r3 = org.tukaani.xz.lz.CRC32Hash.crcTable
            r3[r2] = r4
            int r2 = r2 + 1
            goto L8
        L27:
            return
    }

    CRC32Hash() {
            r0 = this;
            r0.<init>()
            return
    }
}
