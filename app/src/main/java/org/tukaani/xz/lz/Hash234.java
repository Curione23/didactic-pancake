package org.tukaani.xz.lz;

/* JADX INFO: loaded from: classes2.dex */
final class Hash234 extends org.tukaani.xz.lz.CRC32Hash {
    private static final int HASH_2_MASK = 1023;
    private static final int HASH_2_SIZE = 1024;
    private static final int HASH_3_MASK = 65535;
    private static final int HASH_3_SIZE = 65536;
    private final int[] hash2Table;
    private int hash2Value;
    private final int[] hash3Table;
    private int hash3Value;
    private final int hash4Mask;
    private final int hash4Size;
    private final int[] hash4Table;
    private int hash4Value;

    Hash234(int r3, org.tukaani.xz.ArrayCache r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.hash2Value = r0
            r2.hash3Value = r0
            r2.hash4Value = r0
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 1
            int[] r0 = r4.getIntArray(r0, r1)
            r2.hash2Table = r0
            r0 = 65536(0x10000, float:9.1835E-41)
            int[] r0 = r4.getIntArray(r0, r1)
            r2.hash3Table = r0
            int r3 = getHash4Size(r3)
            r2.hash4Size = r3
            int[] r4 = r4.getIntArray(r3, r1)
            r2.hash4Table = r4
            int r3 = r3 - r1
            r2.hash4Mask = r3
            return
    }

    static int getHash4Size(int r1) {
            int r1 = r1 + (-1)
            int r0 = r1 >>> 1
            r1 = r1 | r0
            int r0 = r1 >>> 2
            r1 = r1 | r0
            int r0 = r1 >>> 4
            r1 = r1 | r0
            int r0 = r1 >>> 8
            r1 = r1 | r0
            int r1 = r1 >>> 1
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 | r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 <= r0) goto L1a
            int r1 = r1 >>> 1
        L1a:
            int r1 = r1 + 1
            return r1
    }

    static int getMemoryUsage(int r1) {
            r0 = 66560(0x10400, float:9.327E-41)
            int r1 = getHash4Size(r1)
            int r1 = r1 + r0
            int r1 = r1 / 256
            int r1 = r1 + 4
            return r1
    }

    void calcHashes(byte[] r3, int r4) {
            r2 = this;
            int[] r0 = org.tukaani.xz.lz.Hash234.crcTable
            r1 = r3[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0[r1]
            int r1 = r4 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 ^ r1
            r1 = r0 & 1023(0x3ff, float:1.434E-42)
            r2.hash2Value = r1
            int r1 = r4 + 2
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 ^ r1
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r2.hash3Value = r1
            int[] r1 = org.tukaani.xz.lz.Hash234.crcTable
            int r4 = r4 + 3
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r1[r3]
            int r3 = r3 << 5
            r3 = r3 ^ r0
            int r4 = r2.hash4Mask
            r3 = r3 & r4
            r2.hash4Value = r3
            return
    }

    int getHash2Pos() {
            r2 = this;
            int[] r0 = r2.hash2Table
            int r1 = r2.hash2Value
            r0 = r0[r1]
            return r0
    }

    int getHash3Pos() {
            r2 = this;
            int[] r0 = r2.hash3Table
            int r1 = r2.hash3Value
            r0 = r0[r1]
            return r0
    }

    int getHash4Pos() {
            r2 = this;
            int[] r0 = r2.hash4Table
            int r1 = r2.hash4Value
            r0 = r0[r1]
            return r0
    }

    void normalize(int r3) {
            r2 = this;
            int[] r0 = r2.hash2Table
            r1 = 1024(0x400, float:1.435E-42)
            org.tukaani.xz.lz.LZEncoder.normalize(r0, r1, r3)
            int[] r0 = r2.hash3Table
            r1 = 65536(0x10000, float:9.1835E-41)
            org.tukaani.xz.lz.LZEncoder.normalize(r0, r1, r3)
            int[] r0 = r2.hash4Table
            int r1 = r2.hash4Size
            org.tukaani.xz.lz.LZEncoder.normalize(r0, r1, r3)
            return
    }

    void putArraysToCache(org.tukaani.xz.ArrayCache r2) {
            r1 = this;
            int[] r0 = r1.hash4Table
            r2.putArray(r0)
            int[] r0 = r1.hash3Table
            r2.putArray(r0)
            int[] r0 = r1.hash2Table
            r2.putArray(r0)
            return
    }

    void updateTables(int r3) {
            r2 = this;
            int[] r0 = r2.hash2Table
            int r1 = r2.hash2Value
            r0[r1] = r3
            int[] r0 = r2.hash3Table
            int r1 = r2.hash3Value
            r0[r1] = r3
            int[] r0 = r2.hash4Table
            int r1 = r2.hash4Value
            r0[r1] = r3
            return
    }
}
