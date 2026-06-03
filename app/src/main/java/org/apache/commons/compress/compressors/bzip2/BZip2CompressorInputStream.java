package org.apache.commons.compress.compressors.bzip2;

/* JADX INFO: loaded from: classes2.dex */
public class BZip2CompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.compressors.bzip2.BZip2Constants, org.apache.commons.compress.utils.InputStreamStatistics {
    private static final int EOF = 0;
    private static final int NO_RAND_PART_A_STATE = 5;
    private static final int NO_RAND_PART_B_STATE = 6;
    private static final int NO_RAND_PART_C_STATE = 7;
    private static final int RAND_PART_A_STATE = 2;
    private static final int RAND_PART_B_STATE = 3;
    private static final int RAND_PART_C_STATE = 4;
    private static final int START_BLOCK_STATE = 1;
    private org.apache.commons.compress.utils.BitInputStream bin;
    private boolean blockRandomised;
    private int blockSize100k;
    private int computedCombinedCRC;
    private final org.apache.commons.compress.compressors.bzip2.CRC crc;
    private int currentState;
    private org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data data;
    private final boolean decompressConcatenated;
    private int last;
    private int nInUse;
    private int origPtr;
    private int storedBlockCRC;
    private int storedCombinedCRC;
    private int su_ch2;
    private int su_chPrev;
    private int su_count;
    private int su_i2;
    private int su_j2;
    private int su_rNToGo;
    private int su_rTPos;
    private int su_tPos;
    private char su_z;

    private static final class Data {
        final int[][] base;
        final int[] cftab;
        final char[] getAndMoveToFrontDecode_yy;
        final boolean[] inUse;
        final int[][] limit;
        final byte[] ll8;
        final int[] minLens;
        final int[][] perm;
        final byte[] recvDecodingTables_pos;
        final byte[] selector;
        final byte[] selectorMtf;
        final byte[] seqToUnseq;
        final char[][] temp_charArray2d;
        int[] tt;
        final int[] unzftab;

        Data(int r9) {
                r8 = this;
                r8.<init>()
                r0 = 256(0x100, float:3.59E-43)
                boolean[] r1 = new boolean[r0]
                r8.inUse = r1
                byte[] r1 = new byte[r0]
                r8.seqToUnseq = r1
                r1 = 18002(0x4652, float:2.5226E-41)
                byte[] r2 = new byte[r1]
                r8.selector = r2
                byte[] r1 = new byte[r1]
                r8.selectorMtf = r1
                int[] r1 = new int[r0]
                r8.unzftab = r1
                r1 = 2
                int[] r2 = new int[r1]
                r3 = 1
                r4 = 258(0x102, float:3.62E-43)
                r2[r3] = r4
                r5 = 0
                r6 = 6
                r2[r5] = r6
                java.lang.Class r7 = java.lang.Integer.TYPE
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r7, r2)
                int[][] r2 = (int[][]) r2
                r8.limit = r2
                int[] r2 = new int[r1]
                r2[r3] = r4
                r2[r5] = r6
                java.lang.Class r7 = java.lang.Integer.TYPE
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r7, r2)
                int[][] r2 = (int[][]) r2
                r8.base = r2
                int[] r2 = new int[r1]
                r2[r3] = r4
                r2[r5] = r6
                java.lang.Class r7 = java.lang.Integer.TYPE
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r7, r2)
                int[][] r2 = (int[][]) r2
                r8.perm = r2
                int[] r2 = new int[r6]
                r8.minLens = r2
                r2 = 257(0x101, float:3.6E-43)
                int[] r2 = new int[r2]
                r8.cftab = r2
                char[] r0 = new char[r0]
                r8.getAndMoveToFrontDecode_yy = r0
                int[] r0 = new int[r1]
                r0[r3] = r4
                r0[r5] = r6
                java.lang.Class r1 = java.lang.Character.TYPE
                java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
                char[][] r0 = (char[][]) r0
                r8.temp_charArray2d = r0
                byte[] r0 = new byte[r6]
                r8.recvDecodingTables_pos = r0
                r0 = 100000(0x186a0, float:1.4013E-40)
                int r9 = r9 * r0
                byte[] r9 = new byte[r9]
                r8.ll8 = r9
                return
        }

        int[] initTT(int r3) {
                r2 = this;
                int[] r0 = r2.tt
                if (r0 == 0) goto L7
                int r1 = r0.length
                if (r1 >= r3) goto Lb
            L7:
                int[] r0 = new int[r3]
                r2.tt = r0
            Lb:
                return r0
        }
    }

    public BZip2CompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BZip2CompressorInputStream(java.io.InputStream r4, boolean r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            org.apache.commons.compress.compressors.bzip2.CRC r0 = new org.apache.commons.compress.compressors.bzip2.CRC
            r0.<init>()
            r3.crc = r0
            r0 = 1
            r3.currentState = r0
            org.apache.commons.compress.utils.BitInputStream r1 = new org.apache.commons.compress.utils.BitInputStream
            java.io.InputStream r2 = java.lang.System.in
            if (r4 != r2) goto L17
            org.apache.commons.io.input.CloseShieldInputStream r4 = org.apache.commons.io.input.CloseShieldInputStream.wrap(r4)
        L17:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r1.<init>(r4, r2)
            r3.bin = r1
            r3.decompressConcatenated = r5
            r3.init(r0)
            r3.initBlock()
            return
    }

    private static boolean bsGetBit(org.apache.commons.compress.utils.BitInputStream r1) throws java.io.IOException {
            r0 = 1
            int r1 = bsR(r1, r0)
            if (r1 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static int bsGetInt(org.apache.commons.compress.utils.BitInputStream r1) throws java.io.IOException {
            r0 = 32
            int r1 = bsR(r1, r0)
            return r1
    }

    private static char bsGetUByte(org.apache.commons.compress.utils.BitInputStream r1) throws java.io.IOException {
            r0 = 8
            int r1 = bsR(r1, r0)
            char r1 = (char) r1
            return r1
    }

    private static int bsR(org.apache.commons.compress.utils.BitInputStream r2, int r3) throws java.io.IOException {
            long r2 = r2.readBits(r3)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            int r2 = (int) r2
            return r2
        Lc:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Unexpected end of stream"
            r2.<init>(r3)
            throw r2
    }

    private static void checkBounds(int r1, int r2, java.lang.String r3) throws java.io.IOException {
            java.lang.String r0 = "Corrupted input, "
            if (r1 < 0) goto L20
            if (r1 >= r2) goto L7
            return
        L7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " value too big"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L20:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " value negative"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private boolean complete() throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r3.bin
            int r0 = bsGetInt(r0)
            r3.storedCombinedCRC = r0
            r1 = 0
            r3.currentState = r1
            r2 = 0
            r3.data = r2
            int r2 = r3.computedCombinedCRC
            if (r0 != r2) goto L1e
            boolean r0 = r3.decompressConcatenated
            if (r0 == 0) goto L1c
            boolean r0 = r3.init(r1)
            if (r0 != 0) goto L1d
        L1c:
            r1 = 1
        L1d:
            return r1
        L1e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "BZip2 CRC error"
            r0.<init>(r1)
            throw r0
    }

    private void createHuffmanDecodingTables(int r19, int r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r0.data
            char[][] r2 = r1.temp_charArray2d
            int[] r3 = r1.minLens
            int[][] r4 = r1.limit
            int[][] r5 = r1.base
            int[][] r1 = r1.perm
            r6 = 0
            r7 = r20
            r8 = r6
        L12:
            if (r8 >= r7) goto L3e
            r9 = r2[r8]
            r10 = 32
            r11 = r19
            r15 = r6
        L1b:
            int r11 = r11 + (-1)
            if (r11 < 0) goto L28
            char r12 = r9[r11]
            if (r12 <= r15) goto L24
            r15 = r12
        L24:
            if (r12 >= r10) goto L1b
            r10 = r12
            goto L1b
        L28:
            r11 = r4[r8]
            r12 = r5[r8]
            r13 = r1[r8]
            r14 = r2[r8]
            r9 = r15
            r15 = r10
            r16 = r9
            r17 = r19
            hbCreateDecodeTables(r11, r12, r13, r14, r15, r16, r17)
            r3[r8] = r10
            int r8 = r8 + 1
            goto L12
        L3e:
            return
    }

    private void endBlock() throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.compressors.bzip2.CRC r0 = r3.crc
            int r0 = r0.getValue()
            int r1 = r3.storedBlockCRC
            if (r1 != r0) goto L15
            int r1 = r3.computedCombinedCRC
            int r2 = r1 << 1
            int r1 = r1 >>> 31
            r1 = r1 | r2
            r0 = r0 ^ r1
            r3.computedCombinedCRC = r0
            return
        L15:
            int r0 = r3.storedCombinedCRC
            int r2 = r0 << 1
            int r0 = r0 >>> 31
            r0 = r0 | r2
            r0 = r0 ^ r1
            r3.computedCombinedCRC = r0
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "BZip2 CRC error"
            r0.<init>(r1)
            throw r0
    }

    private void getAndMoveToFrontDecode() throws java.io.IOException {
            r36 = this;
            r0 = r36
            org.apache.commons.compress.utils.BitInputStream r1 = r0.bin
            r2 = 24
            int r2 = bsR(r1, r2)
            r0.origPtr = r2
            r36.recvDecodingTables()
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r2 = r0.data
            byte[] r3 = r2.ll8
            int[] r4 = r2.unzftab
            byte[] r5 = r2.selector
            byte[] r6 = r2.seqToUnseq
            char[] r7 = r2.getAndMoveToFrontDecode_yy
            int[] r8 = r2.minLens
            int[][] r9 = r2.limit
            int[][] r10 = r2.base
            int[][] r2 = r2.perm
            int r11 = r0.blockSize100k
            r12 = 100000(0x186a0, float:1.4013E-40)
            int r11 = r11 * r12
            r13 = 256(0x100, float:3.59E-43)
        L2b:
            r14 = -1
            int r13 = r13 + r14
            r15 = 0
            if (r13 < 0) goto L36
            char r14 = (char) r13
            r7[r13] = r14
            r4[r13] = r15
            goto L2b
        L36:
            int r13 = r0.nInUse
            r14 = 1
            int r13 = r13 + r14
            int r16 = r36.getAndMoveToFrontDecode0()
            r12 = r5[r15]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 6
            java.lang.String r14 = "zt"
            checkBounds(r12, r15, r14)
            r19 = r10[r12]
            r20 = r9[r12]
            r21 = r2[r12]
            r12 = r8[r12]
            r22 = 49
            r23 = r12
            r15 = r16
            r25 = r22
            r12 = -1
            r24 = 0
        L5b:
            if (r15 == r13) goto L24a
            r26 = r13
            java.lang.String r13 = "zvec"
            java.lang.String r0 = "groupNo"
            r27 = r13
            java.lang.String r13 = " exceeds "
            r28 = r13
            java.lang.String r13 = "yy"
            r29 = r1
            java.lang.String r1 = "zn"
            r30 = r1
            if (r15 == 0) goto L13c
            r1 = 1
            if (r15 != r1) goto L78
            goto L13c
        L78:
            int r12 = r12 + 1
            if (r12 >= r11) goto L119
            r1 = 257(0x101, float:3.6E-43)
            r31 = r11
            java.lang.String r11 = "nextSym"
            checkBounds(r15, r1, r11)
            int r1 = r15 + (-1)
            char r11 = r7[r1]
            r32 = r8
            r8 = 256(0x100, float:3.59E-43)
            checkBounds(r11, r8, r13)
            r8 = r6[r11]
            r13 = r8 & 255(0xff, float:3.57E-43)
            r28 = r4[r13]
            r18 = 1
            int r28 = r28 + 1
            r4[r13] = r28
            r3[r12] = r8
            r8 = 16
            if (r15 > r8) goto Lae
        La2:
            if (r1 <= 0) goto Lac
            int r8 = r1 + (-1)
            char r13 = r7[r8]
            r7[r1] = r13
            r1 = r8
            goto La2
        Lac:
            r8 = 0
            goto Lb3
        Lae:
            r8 = 0
            r13 = 1
            java.lang.System.arraycopy(r7, r8, r7, r13, r1)
        Lb3:
            r7[r8] = r11
            if (r25 != 0) goto Ld9
            int r1 = r24 + 1
            r8 = 18002(0x4652, float:2.5226E-41)
            checkBounds(r1, r8, r0)
            r0 = r5[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r8 = 6
            checkBounds(r0, r8, r14)
            r8 = r10[r0]
            r11 = r9[r0]
            r13 = r2[r0]
            r0 = r32[r0]
            r24 = r1
            r19 = r8
            r20 = r11
            r21 = r13
            r25 = r22
            goto Ldd
        Ld9:
            int r25 = r25 + (-1)
            r0 = r23
        Ldd:
            r1 = r30
            r8 = 258(0x102, float:3.62E-43)
            checkBounds(r0, r8, r1)
            r11 = r29
            int r13 = bsR(r11, r0)
            r15 = r0
        Leb:
            r8 = r20[r15]
            if (r13 <= r8) goto L100
            int r15 = r15 + 1
            r8 = 258(0x102, float:3.62E-43)
            checkBounds(r15, r8, r1)
            int r13 = r13 << 1
            r8 = 1
            int r23 = bsR(r11, r8)
            r13 = r13 | r23
            goto Leb
        L100:
            r1 = r19[r15]
            int r13 = r13 - r1
            r8 = r27
            r1 = 258(0x102, float:3.62E-43)
            checkBounds(r13, r1, r8)
            r15 = r21[r13]
            r23 = r0
            r1 = r11
            r13 = r26
            r11 = r31
            r8 = r32
            r0 = r36
            goto L5b
        L119:
            r31 = r11
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Block overrun in MTF, "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            r2 = r28
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r31
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L13c:
            r32 = r8
            r8 = r27
            r33 = r28
            r1 = r30
            r27 = r15
            r15 = r11
            r11 = r29
            r28 = r3
            r31 = r15
            r15 = r27
            r3 = -1
            r27 = r25
            r25 = r24
            r24 = r23
            r23 = r21
            r21 = r20
            r20 = r19
            r19 = 1
        L15e:
            if (r15 != 0) goto L165
            int r3 = r3 + r19
            r29 = r12
            goto L16d
        L165:
            r29 = r12
            r12 = 1
            if (r15 != r12) goto L1d5
            int r12 = r19 << 1
            int r3 = r3 + r12
        L16d:
            if (r27 != 0) goto L18d
            int r12 = r25 + 1
            r15 = 18002(0x4652, float:2.5226E-41)
            checkBounds(r12, r15, r0)
            r15 = r5[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r30 = r0
            r0 = 6
            checkBounds(r15, r0, r14)
            r20 = r10[r15]
            r21 = r9[r15]
            r23 = r2[r15]
            r24 = r32[r15]
            r25 = r12
            r27 = r22
            goto L192
        L18d:
            r30 = r0
            r0 = 6
            int r27 = r27 + (-1)
        L192:
            r12 = r24
            r15 = 258(0x102, float:3.62E-43)
            checkBounds(r12, r15, r1)
            int r16 = bsR(r11, r12)
            r0 = r16
            r16 = r12
        L1a1:
            r15 = r21[r16]
            if (r0 <= r15) goto L1bc
            int r15 = r16 + 1
            r34 = r2
            r2 = 258(0x102, float:3.62E-43)
            checkBounds(r15, r2, r1)
            int r0 = r0 << 1
            r2 = 1
            int r16 = bsR(r11, r2)
            r0 = r0 | r16
            r16 = r15
            r2 = r34
            goto L1a1
        L1bc:
            r34 = r2
            r2 = 1
            r15 = r20[r16]
            int r0 = r0 - r15
            r15 = 258(0x102, float:3.62E-43)
            checkBounds(r0, r15, r8)
            r0 = r23[r0]
            int r19 = r19 << 1
            r15 = r0
            r24 = r12
            r12 = r29
            r0 = r30
            r2 = r34
            goto L15e
        L1d5:
            r0 = r36
            r34 = r2
            r2 = r12
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r0.data
            byte[] r1 = r1.ll8
            int r1 = r1.length
            java.lang.String r8 = "s"
            checkBounds(r3, r1, r8)
            r1 = 0
            char r8 = r7[r1]
            r12 = 256(0x100, float:3.59E-43)
            checkBounds(r8, r12, r13)
            r8 = r6[r8]
            r13 = r8 & 255(0xff, float:3.57E-43)
            r16 = r4[r13]
            int r17 = r3 + 1
            int r16 = r16 + r17
            r4[r13] = r16
            int r13 = r29 + 1
            int r3 = r3 + r13
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r0.data
            byte[] r1 = r1.ll8
            int r1 = r1.length
            java.lang.String r2 = "lastShadow"
            checkBounds(r3, r1, r2)
            int r1 = r3 + 1
            r2 = r28
            java.util.Arrays.fill(r2, r13, r1, r8)
            r1 = r31
            if (r3 >= r1) goto L22b
            r12 = r3
            r19 = r20
            r20 = r21
            r21 = r23
            r23 = r24
            r24 = r25
            r13 = r26
            r25 = r27
            r8 = r32
            r3 = r2
            r2 = r34
            r35 = r11
            r11 = r1
            r1 = r35
            goto L5b
        L22b:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Block overrun while expanding RLE in MTF, "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            r4 = r33
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L24a:
            r3 = r12
            r0.last = r3
            return
    }

    private int getAndMoveToFrontDecode0() throws java.io.IOException {
            r9 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r9.data
            byte[] r1 = r0.selector
            r2 = 0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 6
            java.lang.String r3 = "zt"
            checkBounds(r1, r2, r3)
            int[][] r2 = r0.limit
            r2 = r2[r1]
            int[] r3 = r0.minLens
            r3 = r3[r1]
            r4 = 258(0x102, float:3.62E-43)
            java.lang.String r5 = "zn"
            checkBounds(r3, r4, r5)
            org.apache.commons.compress.utils.BitInputStream r6 = r9.bin
            int r6 = bsR(r6, r3)
        L24:
            r7 = r2[r3]
            if (r6 <= r7) goto L38
            int r3 = r3 + 1
            checkBounds(r3, r4, r5)
            int r6 = r6 << 1
            org.apache.commons.compress.utils.BitInputStream r7 = r9.bin
            r8 = 1
            int r7 = bsR(r7, r8)
            r6 = r6 | r7
            goto L24
        L38:
            int[][] r2 = r0.base
            r2 = r2[r1]
            r2 = r2[r3]
            int r6 = r6 - r2
            java.lang.String r2 = "zvec"
            checkBounds(r6, r4, r2)
            int[][] r0 = r0.perm
            r0 = r0[r1]
            r0 = r0[r6]
            return r0
    }

    private static void hbCreateDecodeTables(int[] r6, int[] r7, int[] r8, char[] r9, int r10, int r11, int r12) throws java.io.IOException {
            r0 = 0
            r1 = r10
            r2 = r0
        L3:
            if (r1 > r11) goto L17
            r3 = r0
        L6:
            if (r3 >= r12) goto L14
            char r4 = r9[r3]
            if (r4 != r1) goto L11
            int r4 = r2 + 1
            r8[r2] = r3
            r2 = r4
        L11:
            int r3 = r3 + 1
            goto L6
        L14:
            int r1 = r1 + 1
            goto L3
        L17:
            r8 = 23
            r1 = r8
        L1a:
            int r1 = r1 + (-1)
            if (r1 <= 0) goto L23
            r7[r1] = r0
            r6[r1] = r0
            goto L1a
        L23:
            r1 = r0
        L24:
            r2 = 1
            if (r1 >= r12) goto L39
            char r3 = r9[r1]
            r4 = 258(0x102, float:3.62E-43)
            java.lang.String r5 = "length"
            checkBounds(r3, r4, r5)
            int r3 = r3 + r2
            r4 = r7[r3]
            int r4 = r4 + r2
            r7[r3] = r4
            int r1 = r1 + 1
            goto L24
        L39:
            r9 = r7[r0]
            r12 = r2
        L3c:
            if (r12 >= r8) goto L46
            r1 = r7[r12]
            int r9 = r9 + r1
            r7[r12] = r9
            int r12 = r12 + 1
            goto L3c
        L46:
            r8 = r7[r10]
            r9 = r10
        L49:
            if (r9 > r11) goto L5a
            int r12 = r9 + 1
            r1 = r7[r12]
            int r8 = r1 - r8
            int r0 = r0 + r8
            int r8 = r0 + (-1)
            r6[r9] = r8
            int r0 = r0 << r2
            r9 = r12
            r8 = r1
            goto L49
        L5a:
            int r10 = r10 + r2
        L5b:
            if (r10 > r11) goto L6b
            int r8 = r10 + (-1)
            r8 = r6[r8]
            int r8 = r8 + r2
            int r8 = r8 << r2
            r9 = r7[r10]
            int r8 = r8 - r9
            r7[r10] = r8
            int r10 = r10 + 1
            goto L5b
        L6b:
            return
    }

    private boolean init(boolean r6) throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r5.bin
            if (r0 == 0) goto L5a
            if (r6 != 0) goto L9
            r0.clearBitCache()
        L9:
            org.apache.commons.compress.utils.BitInputStream r0 = r5.bin
            int r0 = r5.readNextByte(r0)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L16
            if (r6 != 0) goto L16
            return r2
        L16:
            org.apache.commons.compress.utils.BitInputStream r1 = r5.bin
            int r1 = r5.readNextByte(r1)
            org.apache.commons.compress.utils.BitInputStream r3 = r5.bin
            int r3 = r5.readNextByte(r3)
            r4 = 66
            if (r0 != r4) goto L4d
            r0 = 90
            if (r1 != r0) goto L4d
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L2f
            goto L4d
        L2f:
            org.apache.commons.compress.utils.BitInputStream r6 = r5.bin
            int r6 = r5.readNextByte(r6)
            r0 = 49
            if (r6 < r0) goto L45
            r0 = 57
            if (r6 > r0) goto L45
            int r6 = r6 + (-48)
            r5.blockSize100k = r6
            r5.computedCombinedCRC = r2
            r6 = 1
            return r6
        L45:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "BZip2 block size is invalid"
            r6.<init>(r0)
            throw r6
        L4d:
            java.io.IOException r0 = new java.io.IOException
            if (r6 == 0) goto L54
            java.lang.String r6 = "Stream is not in the BZip2 format"
            goto L56
        L54:
            java.lang.String r6 = "Garbage after a valid BZip2 stream"
        L56:
            r0.<init>(r6)
            throw r0
        L5a:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "No InputStream"
            r6.<init>(r0)
            throw r6
    }

    private void initBlock() throws java.io.IOException {
            r9 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r9.bin
        L2:
            char r1 = bsGetUByte(r0)
            char r2 = bsGetUByte(r0)
            char r3 = bsGetUByte(r0)
            char r4 = bsGetUByte(r0)
            char r5 = bsGetUByte(r0)
            char r6 = bsGetUByte(r0)
            r7 = 23
            if (r1 != r7) goto L3a
            r7 = 114(0x72, float:1.6E-43)
            if (r2 != r7) goto L3a
            r7 = 69
            if (r3 != r7) goto L3a
            r7 = 56
            if (r4 != r7) goto L3a
            r7 = 80
            if (r5 != r7) goto L3a
            r7 = 144(0x90, float:2.02E-43)
            if (r6 == r7) goto L33
            goto L3a
        L33:
            boolean r1 = r9.complete()
            if (r1 == 0) goto L2
            return
        L3a:
            r7 = 49
            r8 = 0
            if (r1 != r7) goto L79
            r1 = 65
            if (r2 != r1) goto L79
            r1 = 89
            if (r3 != r1) goto L79
            r2 = 38
            if (r4 != r2) goto L79
            r2 = 83
            if (r5 != r2) goto L79
            if (r6 != r1) goto L79
            int r1 = bsGetInt(r0)
            r9.storedBlockCRC = r1
            r1 = 1
            int r0 = bsR(r0, r1)
            if (r0 != r1) goto L5f
            r8 = r1
        L5f:
            r9.blockRandomised = r8
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r9.data
            if (r0 != 0) goto L6e
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data
            int r2 = r9.blockSize100k
            r0.<init>(r2)
            r9.data = r0
        L6e:
            r9.getAndMoveToFrontDecode()
            org.apache.commons.compress.compressors.bzip2.CRC r0 = r9.crc
            r0.reset()
            r9.currentState = r1
            return
        L79:
            r9.currentState = r8
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Bad block header"
            r0.<init>(r1)
            throw r0
    }

    private void makeMaps() {
            r6 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r6.data
            boolean[] r0 = r0.inUse
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r6.data
            byte[] r1 = r1.seqToUnseq
            r2 = 0
            r3 = r2
        La:
            r4 = 256(0x100, float:3.59E-43)
            if (r2 >= r4) goto L1b
            boolean r4 = r0[r2]
            if (r4 == 0) goto L18
            int r4 = r3 + 1
            byte r5 = (byte) r2
            r1[r3] = r5
            r3 = r4
        L18:
            int r2 = r2 + 1
            goto La
        L1b:
            r6.nInUse = r3
            return
    }

    public static boolean matches(byte[] r3, int r4) {
            r0 = 3
            r1 = 0
            if (r4 < r0) goto L19
            r4 = r3[r1]
            r0 = 66
            if (r4 != r0) goto L19
            r4 = 1
            r0 = r3[r4]
            r2 = 90
            if (r0 != r2) goto L19
            r0 = 2
            r3 = r3[r0]
            r0 = 104(0x68, float:1.46E-43)
            if (r3 != r0) goto L19
            r1 = r4
        L19:
            return r1
    }

    private int read0() throws java.io.IOException {
            r1 = this;
            int r0 = r1.currentState
            switch(r0) {
                case 0: goto L30;
                case 1: goto L2b;
                case 2: goto L25;
                case 3: goto L20;
                case 4: goto L1b;
                case 5: goto L15;
                case 6: goto L10;
                case 7: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Lb:
            int r0 = r1.setupNoRandPartC()
            return r0
        L10:
            int r0 = r1.setupNoRandPartB()
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L1b:
            int r0 = r1.setupRandPartC()
            return r0
        L20:
            int r0 = r1.setupRandPartB()
            return r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            int r0 = r1.setupBlock()
            return r0
        L30:
            r0 = -1
            return r0
    }

    private int readNextByte(org.apache.commons.compress.utils.BitInputStream r3) throws java.io.IOException {
            r2 = this;
            r0 = 8
            long r0 = r3.readBits(r0)
            int r3 = (int) r0
            return r3
    }

    private void recvDecodingTables() throws java.io.IOException {
            r15 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r15.bin
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r15.data
            boolean[] r2 = r1.inUse
            byte[] r3 = r1.recvDecodingTables_pos
            byte[] r4 = r1.selector
            byte[] r5 = r1.selectorMtf
            r6 = 0
            r7 = r6
            r8 = r7
        Lf:
            r9 = 16
            r10 = 1
            if (r7 >= r9) goto L20
            boolean r9 = bsGetBit(r0)
            if (r9 == 0) goto L1d
            int r9 = r10 << r7
            r8 = r8 | r9
        L1d:
            int r7 = r7 + 1
            goto Lf
        L20:
            java.util.Arrays.fill(r2, r6)
            r7 = r6
        L24:
            if (r7 >= r9) goto L40
            int r11 = r10 << r7
            r11 = r11 & r8
            if (r11 == 0) goto L3d
            int r11 = r7 << 4
            r12 = r6
        L2e:
            if (r12 >= r9) goto L3d
            boolean r13 = bsGetBit(r0)
            if (r13 == 0) goto L3a
            int r13 = r11 + r12
            r2[r13] = r10
        L3a:
            int r12 = r12 + 1
            goto L2e
        L3d:
            int r7 = r7 + 1
            goto L24
        L40:
            r15.makeMaps()
            int r2 = r15.nInUse
            int r2 = r2 + 2
            r7 = 3
            int r7 = bsR(r0, r7)
            r8 = 15
            int r8 = bsR(r0, r8)
            if (r8 < 0) goto Ld3
            r9 = 259(0x103, float:3.63E-43)
            java.lang.String r11 = "alphaSize"
            checkBounds(r2, r9, r11)
            r9 = 7
            java.lang.String r11 = "nGroups"
            checkBounds(r7, r9, r11)
            r9 = r6
        L62:
            r11 = 18002(0x4652, float:2.5226E-41)
            if (r9 >= r8) goto L78
            r12 = r6
        L67:
            boolean r13 = bsGetBit(r0)
            if (r13 == 0) goto L70
            int r12 = r12 + 1
            goto L67
        L70:
            if (r9 >= r11) goto L75
            byte r11 = (byte) r12
            r5[r9] = r11
        L75:
            int r9 = r9 + 1
            goto L62
        L78:
            int r8 = java.lang.Math.min(r8, r11)
            r9 = r7
        L7d:
            r11 = -1
            int r9 = r9 + r11
            if (r9 < 0) goto L85
            byte r11 = (byte) r9
            r3[r9] = r11
            goto L7d
        L85:
            r9 = r6
        L86:
            if (r9 >= r8) goto La6
            r12 = r5[r9]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r13 = 6
            java.lang.String r14 = "selectorMtf"
            checkBounds(r12, r13, r14)
            r13 = r3[r12]
        L94:
            if (r12 <= 0) goto L9f
            int r14 = r12 + (-1)
            r14 = r3[r14]
            r3[r12] = r14
            int r12 = r12 + (-1)
            goto L94
        L9f:
            r3[r6] = r13
            r4[r9] = r13
            int r9 = r9 + 1
            goto L86
        La6:
            char[][] r1 = r1.temp_charArray2d
            r3 = r6
        La9:
            if (r3 >= r7) goto Lcf
            r4 = 5
            int r4 = bsR(r0, r4)
            r5 = r1[r3]
            r8 = r6
        Lb3:
            if (r8 >= r2) goto Lcc
        Lb5:
            boolean r9 = bsGetBit(r0)
            if (r9 == 0) goto Lc6
            boolean r9 = bsGetBit(r0)
            if (r9 == 0) goto Lc3
            r9 = r11
            goto Lc4
        Lc3:
            r9 = r10
        Lc4:
            int r4 = r4 + r9
            goto Lb5
        Lc6:
            char r9 = (char) r4
            r5[r8] = r9
            int r8 = r8 + 1
            goto Lb3
        Lcc:
            int r3 = r3 + 1
            goto La9
        Lcf:
            r15.createHuffmanDecodingTables(r2, r7)
            return
        Ld3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted input, nSelectors value negative"
            r0.<init>(r1)
            throw r0
    }

    private int setupBlock() throws java.io.IOException {
            r11 = this;
            int r0 = r11.currentState
            if (r0 == 0) goto L75
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r11.data
            if (r0 != 0) goto L9
            goto L75
        L9:
            int[] r0 = r0.cftab
            int r1 = r11.last
            r2 = 1
            int r1 = r1 + r2
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r3 = r11.data
            int[] r3 = r3.initTT(r1)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r4 = r11.data
            byte[] r4 = r4.ll8
            r5 = 0
            r0[r5] = r5
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r6 = r11.data
            int[] r6 = r6.unzftab
            r7 = 256(0x100, float:3.59E-43)
            java.lang.System.arraycopy(r6, r5, r0, r2, r7)
            r6 = r0[r5]
        L27:
            if (r2 > r7) goto L31
            r8 = r0[r2]
            int r6 = r6 + r8
            r0[r2] = r6
            int r2 = r2 + 1
            goto L27
        L31:
            int r2 = r11.last
            r6 = r5
        L34:
            if (r6 > r2) goto L4a
            r8 = r4[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = r0[r8]
            int r10 = r9 + 1
            r0[r8] = r10
            java.lang.String r8 = "tt index"
            checkBounds(r9, r1, r8)
            r3[r9] = r6
            int r6 = r6 + 1
            goto L34
        L4a:
            int r0 = r11.origPtr
            if (r0 < 0) goto L6d
            int r1 = r3.length
            if (r0 >= r1) goto L6d
            r0 = r3[r0]
            r11.su_tPos = r0
            r11.su_count = r5
            r11.su_i2 = r5
            r11.su_ch2 = r7
            boolean r0 = r11.blockRandomised
            if (r0 == 0) goto L68
            r11.su_rNToGo = r5
            r11.su_rTPos = r5
            int r0 = r11.setupRandPartA()
            return r0
        L68:
            int r0 = r11.setupNoRandPartA()
            return r0
        L6d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream corrupted"
            r0.<init>(r1)
            throw r0
        L75:
            r0 = -1
            return r0
    }

    private int setupNoRandPartA() throws java.io.IOException {
            r4 = this;
            int r0 = r4.su_i2
            int r1 = r4.last
            if (r0 > r1) goto L39
            int r0 = r4.su_ch2
            r4.su_chPrev = r0
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r4.data
            byte[] r0 = r0.ll8
            int r1 = r4.su_tPos
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4.su_ch2 = r0
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r2 = r4.data
            int[] r2 = r2.tt
            int r2 = r2.length
            java.lang.String r3 = "su_tPos"
            checkBounds(r1, r2, r3)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r4.data
            int[] r1 = r1.tt
            int r2 = r4.su_tPos
            r1 = r1[r2]
            r4.su_tPos = r1
            int r1 = r4.su_i2
            int r1 = r1 + 1
            r4.su_i2 = r1
            r1 = 6
            r4.currentState = r1
            org.apache.commons.compress.compressors.bzip2.CRC r1 = r4.crc
            r1.update(r0)
            return r0
        L39:
            r0 = 5
            r4.currentState = r0
            r4.endBlock()
            r4.initBlock()
            int r0 = r4.setupBlock()
            return r0
    }

    private int setupNoRandPartB() throws java.io.IOException {
            r3 = this;
            int r0 = r3.su_ch2
            int r1 = r3.su_chPrev
            r2 = 1
            if (r0 == r1) goto Le
            r3.su_count = r2
            int r0 = r3.setupNoRandPartA()
            return r0
        Le:
            int r0 = r3.su_count
            int r0 = r0 + r2
            r3.su_count = r0
            r1 = 4
            if (r0 < r1) goto L41
            int r0 = r3.su_tPos
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r3.data
            byte[] r1 = r1.ll8
            int r1 = r1.length
            java.lang.String r2 = "su_tPos"
            checkBounds(r0, r1, r2)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r3.data
            byte[] r0 = r0.ll8
            int r1 = r3.su_tPos
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r3.su_z = r0
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r3.data
            int[] r0 = r0.tt
            int r1 = r3.su_tPos
            r0 = r0[r1]
            r3.su_tPos = r0
            r0 = 0
            r3.su_j2 = r0
            int r0 = r3.setupNoRandPartC()
            return r0
        L41:
            int r0 = r3.setupNoRandPartA()
            return r0
    }

    private int setupNoRandPartC() throws java.io.IOException {
            r2 = this;
            int r0 = r2.su_j2
            char r1 = r2.su_z
            if (r0 >= r1) goto L17
            int r0 = r2.su_ch2
            org.apache.commons.compress.compressors.bzip2.CRC r1 = r2.crc
            r1.update(r0)
            int r1 = r2.su_j2
            int r1 = r1 + 1
            r2.su_j2 = r1
            r1 = 7
            r2.currentState = r1
            return r0
        L17:
            int r0 = r2.su_i2
            int r0 = r0 + 1
            r2.su_i2 = r0
            r0 = 0
            r2.su_count = r0
            int r0 = r2.setupNoRandPartA()
            return r0
    }

    private int setupRandPartA() throws java.io.IOException {
            r5 = this;
            int r0 = r5.su_i2
            int r1 = r5.last
            if (r0 > r1) goto L5c
            int r0 = r5.su_ch2
            r5.su_chPrev = r0
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r5.data
            byte[] r0 = r0.ll8
            int r1 = r5.su_tPos
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r2 = r5.data
            int[] r2 = r2.tt
            int r2 = r2.length
            java.lang.String r3 = "su_tPos"
            checkBounds(r1, r2, r3)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r1 = r5.data
            int[] r1 = r1.tt
            int r2 = r5.su_tPos
            r1 = r1[r2]
            r5.su_tPos = r1
            int r1 = r5.su_rNToGo
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L43
            int r1 = r5.su_rTPos
            int r1 = org.apache.commons.compress.compressors.bzip2.Rand.rNums(r1)
            int r1 = r1 - r3
            r5.su_rNToGo = r1
            int r1 = r5.su_rTPos
            int r1 = r1 + r3
            r5.su_rTPos = r1
            r4 = 512(0x200, float:7.17E-43)
            if (r1 != r4) goto L46
            r5.su_rTPos = r2
            goto L46
        L43:
            int r1 = r1 - r3
            r5.su_rNToGo = r1
        L46:
            int r1 = r5.su_rNToGo
            if (r1 != r3) goto L4b
            r2 = r3
        L4b:
            r0 = r0 ^ r2
            r5.su_ch2 = r0
            int r1 = r5.su_i2
            int r1 = r1 + r3
            r5.su_i2 = r1
            r1 = 3
            r5.currentState = r1
            org.apache.commons.compress.compressors.bzip2.CRC r1 = r5.crc
            r1.update(r0)
            return r0
        L5c:
            r5.endBlock()
            r5.initBlock()
            int r0 = r5.setupBlock()
            return r0
    }

    private int setupRandPartB() throws java.io.IOException {
            r5 = this;
            int r0 = r5.su_ch2
            int r1 = r5.su_chPrev
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L11
            r5.currentState = r2
            r5.su_count = r3
            int r0 = r5.setupRandPartA()
            return r0
        L11:
            int r0 = r5.su_count
            int r0 = r0 + r3
            r5.su_count = r0
            r1 = 4
            if (r0 >= r1) goto L20
            r5.currentState = r2
            int r0 = r5.setupRandPartA()
            return r0
        L20:
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r5.data
            byte[] r0 = r0.ll8
            int r2 = r5.su_tPos
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r5.su_z = r0
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r5.data
            int[] r0 = r0.tt
            int r0 = r0.length
            java.lang.String r4 = "su_tPos"
            checkBounds(r2, r0, r4)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data r0 = r5.data
            int[] r0 = r0.tt
            int r2 = r5.su_tPos
            r0 = r0[r2]
            r5.su_tPos = r0
            int r0 = r5.su_rNToGo
            r2 = 0
            if (r0 != 0) goto L5b
            int r0 = r5.su_rTPos
            int r0 = org.apache.commons.compress.compressors.bzip2.Rand.rNums(r0)
            int r0 = r0 - r3
            r5.su_rNToGo = r0
            int r0 = r5.su_rTPos
            int r0 = r0 + r3
            r5.su_rTPos = r0
            r4 = 512(0x200, float:7.17E-43)
            if (r0 != r4) goto L5e
            r5.su_rTPos = r2
            goto L5e
        L5b:
            int r0 = r0 - r3
            r5.su_rNToGo = r0
        L5e:
            r5.su_j2 = r2
            r5.currentState = r1
            int r0 = r5.su_rNToGo
            if (r0 != r3) goto L6c
            char r0 = r5.su_z
            r0 = r0 ^ r3
            char r0 = (char) r0
            r5.su_z = r0
        L6c:
            int r0 = r5.setupRandPartC()
            return r0
    }

    private int setupRandPartC() throws java.io.IOException {
            r2 = this;
            int r0 = r2.su_j2
            char r1 = r2.su_z
            if (r0 >= r1) goto L16
            org.apache.commons.compress.compressors.bzip2.CRC r0 = r2.crc
            int r1 = r2.su_ch2
            r0.update(r1)
            int r0 = r2.su_j2
            int r0 = r0 + 1
            r2.su_j2 = r0
            int r0 = r2.su_ch2
            return r0
        L16:
            r0 = 2
            r2.currentState = r0
            int r0 = r2.su_i2
            int r0 = r0 + 1
            r2.su_i2 = r0
            r0 = 0
            r2.su_count = r0
            int r0 = r2.setupRandPartA()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r2.bin
            if (r0 == 0) goto L13
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Ld
            r2.data = r1
            r2.bin = r1
            goto L13
        Ld:
            r0 = move-exception
            r2.data = r1
            r2.bin = r1
            throw r0
        L13:
            return
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r2.bin
            long r0 = r0.getBytesRead()
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r2.bin
            if (r0 == 0) goto L11
            int r0 = r2.read0()
            if (r0 >= 0) goto Lc
            r1 = -1
            goto Ld
        Lc:
            r1 = 1
        Ld:
            r2.count(r1)
            return r0
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = ") < 0."
            java.lang.String r1 = "offs("
            if (r5 < 0) goto L7f
            if (r6 < 0) goto L66
            int r0 = r5 + r6
            int r2 = r4.length
            if (r0 > r2) goto L38
            org.apache.commons.compress.utils.BitInputStream r1 = r3.bin
            if (r1 == 0) goto L30
            if (r6 != 0) goto L15
            r4 = 0
            return r4
        L15:
            r6 = r5
        L16:
            if (r6 >= r0) goto L29
            int r1 = r3.read0()
            if (r1 < 0) goto L29
            int r2 = r6 + 1
            byte r1 = (byte) r1
            r4[r6] = r1
            r6 = 1
            r3.count(r6)
            r6 = r2
            goto L16
        L29:
            if (r6 != r5) goto L2d
            r4 = -1
            goto L2f
        L2d:
            int r4 = r6 - r5
        L2f:
            return r4
        L30:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Stream closed"
            r4.<init>(r5)
            throw r4
        L38:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r1 = ") + len("
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ") > dest.length("
            java.lang.StringBuilder r5 = r5.append(r6)
            int r4 = r4.length
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = ")."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L66:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "len("
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L7f:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }
}
