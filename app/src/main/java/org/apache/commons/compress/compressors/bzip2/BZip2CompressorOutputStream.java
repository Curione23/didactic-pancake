package org.apache.commons.compress.compressors.bzip2;

/* JADX INFO: loaded from: classes2.dex */
public class BZip2CompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<java.io.OutputStream> implements org.apache.commons.compress.compressors.bzip2.BZip2Constants {
    private static final int GREATER_ICOST = 15;
    private static final int LESSER_ICOST = 0;
    public static final int MAX_BLOCKSIZE = 9;
    public static final int MIN_BLOCKSIZE = 1;
    private final int allowableBlockSize;
    private final int blockSize100k;
    private org.apache.commons.compress.compressors.bzip2.BlockSort blockSorter;
    private int bsBuff;
    private int bsLive;
    private volatile boolean closed;
    private int combinedCRC;
    private final org.apache.commons.compress.compressors.bzip2.CRC crc;
    private int currentChar;
    private org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data data;
    private int last;
    private int nInUse;
    private int nMTF;
    private int runLength;

    static final class Data {
        final byte[] block;
        final int[] fmap;
        final byte[] generateMTFValues_yy;
        final int[] heap;
        final boolean[] inUse;
        final int[] mtfFreq;
        int origPtr;
        final int[] parent;
        final byte[] selector;
        final byte[] selectorMtf;
        final byte[] sendMTFValues2_pos;
        final int[][] sendMTFValues_code;
        final short[] sendMTFValues_cost;
        final int[] sendMTFValues_fave;
        final byte[][] sendMTFValues_len;
        final int[][] sendMTFValues_rfreq;
        final boolean[] sentMTFValues4_inUse16;
        final char[] sfmap;
        final byte[] unseqToSeq;
        final int[] weight;

        Data(int r8) {
                r7 = this;
                r7.<init>()
                r0 = 256(0x100, float:3.59E-43)
                boolean[] r1 = new boolean[r0]
                r7.inUse = r1
                byte[] r1 = new byte[r0]
                r7.unseqToSeq = r1
                r1 = 258(0x102, float:3.62E-43)
                int[] r2 = new int[r1]
                r7.mtfFreq = r2
                r2 = 18002(0x4652, float:2.5226E-41)
                byte[] r3 = new byte[r2]
                r7.selector = r3
                byte[] r2 = new byte[r2]
                r7.selectorMtf = r2
                byte[] r0 = new byte[r0]
                r7.generateMTFValues_yy = r0
                r0 = 2
                int[] r2 = new int[r0]
                r3 = 1
                r2[r3] = r1
                r4 = 0
                r5 = 6
                r2[r4] = r5
                java.lang.Class r6 = java.lang.Byte.TYPE
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r6, r2)
                byte[][] r2 = (byte[][]) r2
                r7.sendMTFValues_len = r2
                int[] r2 = new int[r0]
                r2[r3] = r1
                r2[r4] = r5
                java.lang.Class r6 = java.lang.Integer.TYPE
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r6, r2)
                int[][] r2 = (int[][]) r2
                r7.sendMTFValues_rfreq = r2
                int[] r2 = new int[r5]
                r7.sendMTFValues_fave = r2
                short[] r2 = new short[r5]
                r7.sendMTFValues_cost = r2
                int[] r0 = new int[r0]
                r0[r3] = r1
                r0[r4] = r5
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
                int[][] r0 = (int[][]) r0
                r7.sendMTFValues_code = r0
                byte[] r0 = new byte[r5]
                r7.sendMTFValues2_pos = r0
                r0 = 16
                boolean[] r0 = new boolean[r0]
                r7.sentMTFValues4_inUse16 = r0
                r0 = 260(0x104, float:3.64E-43)
                int[] r0 = new int[r0]
                r7.heap = r0
                r0 = 516(0x204, float:7.23E-43)
                int[] r1 = new int[r0]
                r7.weight = r1
                int[] r0 = new int[r0]
                r7.parent = r0
                r0 = 100000(0x186a0, float:1.4013E-40)
                int r0 = r0 * r8
                int r1 = r0 + 21
                byte[] r1 = new byte[r1]
                r7.block = r1
                int[] r0 = new int[r0]
                r7.fmap = r0
                r0 = 200000(0x30d40, float:2.8026E-40)
                int r8 = r8 * r0
                char[] r8 = new char[r8]
                r7.sfmap = r8
                return
        }
    }

    public BZip2CompressorOutputStream(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 9
            r1.<init>(r2, r0)
            return
    }

    public BZip2CompressorOutputStream(java.io.OutputStream r3, int r4) throws java.io.IOException {
            r2 = this;
            r2.<init>(r3)
            org.apache.commons.compress.compressors.bzip2.CRC r3 = new org.apache.commons.compress.compressors.bzip2.CRC
            r3.<init>()
            r2.crc = r3
            r3 = -1
            r2.currentChar = r3
            r3 = 1
            java.lang.String r0 = "blockSize("
            if (r4 < r3) goto L3d
            r3 = 9
            if (r4 > r3) goto L24
            r2.blockSize100k = r4
            r3 = 100000(0x186a0, float:1.4013E-40)
            int r4 = r4 * r3
            int r4 = r4 + (-20)
            r2.allowableBlockSize = r4
            r2.init()
            return
        L24:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r0 = ") > 9"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r0 = ") < 1"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private void blockSort() {
            r3 = this;
            org.apache.commons.compress.compressors.bzip2.BlockSort r0 = r3.blockSorter
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r3.data
            int r2 = r3.last
            r0.blockSort(r1, r2)
            return
    }

    private void bsFinishedWithStream() throws java.io.IOException {
            r2 = this;
        L0:
            int r0 = r2.bsLive
            if (r0 <= 0) goto L1a
            int r0 = r2.bsBuff
            int r0 = r0 >> 24
            java.io.OutputStream r1 = r2.out
            r1.write(r0)
            int r0 = r2.bsBuff
            int r0 = r0 << 8
            r2.bsBuff = r0
            int r0 = r2.bsLive
            int r0 = r0 + (-8)
            r2.bsLive = r0
            goto L0
        L1a:
            return
    }

    private void bsPutInt(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 8
            r2.bsW(r1, r0)
            int r0 = r3 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.bsW(r1, r0)
            int r0 = r3 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.bsW(r1, r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.bsW(r1, r3)
            return
    }

    private void bsPutUByte(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 8
            r1.bsW(r0, r2)
            return
    }

    private void bsW(int r5, int r6) throws java.io.IOException {
            r4 = this;
            java.io.OutputStream r0 = r4.out
            int r1 = r4.bsLive
            int r2 = r4.bsBuff
        L6:
            r3 = 8
            if (r1 < r3) goto L14
            int r3 = r2 >> 24
            r0.write(r3)
            int r2 = r2 << 8
            int r1 = r1 + (-8)
            goto L6
        L14:
            int r0 = 32 - r1
            int r0 = r0 - r5
            int r6 = r6 << r0
            r6 = r6 | r2
            r4.bsBuff = r6
            int r1 = r1 + r5
            r4.bsLive = r1
            return
    }

    private void checkClosed() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    public static int chooseBlockSize(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L15
            r0 = 132000(0x203a0, double:6.52167E-319)
            long r2 = r2 / r0
            r0 = 1
            long r2 = r2 + r0
            r0 = 9
            long r2 = java.lang.Math.min(r2, r0)
            int r2 = (int) r2
            goto L17
        L15:
            r2 = 9
        L17:
            return r2
    }

    private void endBlock() throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.compressors.bzip2.CRC r0 = r3.crc
            int r0 = r0.getValue()
            int r1 = r3.combinedCRC
            int r2 = r1 << 1
            int r1 = r1 >>> 31
            r1 = r1 | r2
            r1 = r1 ^ r0
            r3.combinedCRC = r1
            int r1 = r3.last
            r2 = -1
            if (r1 != r2) goto L16
            return
        L16:
            r3.blockSort()
            r1 = 49
            r3.bsPutUByte(r1)
            r1 = 65
            r3.bsPutUByte(r1)
            r1 = 89
            r3.bsPutUByte(r1)
            r2 = 38
            r3.bsPutUByte(r2)
            r2 = 83
            r3.bsPutUByte(r2)
            r3.bsPutUByte(r1)
            r3.bsPutInt(r0)
            r0 = 0
            r1 = 1
            r3.bsW(r1, r0)
            r3.moveToFrontCodeAndSend()
            return
    }

    private void endCompression() throws java.io.IOException {
            r1 = this;
            r0 = 23
            r1.bsPutUByte(r0)
            r0 = 114(0x72, float:1.6E-43)
            r1.bsPutUByte(r0)
            r0 = 69
            r1.bsPutUByte(r0)
            r0 = 56
            r1.bsPutUByte(r0)
            r0 = 80
            r1.bsPutUByte(r0)
            r0 = 144(0x90, float:2.02E-43)
            r1.bsPutUByte(r0)
            int r0 = r1.combinedCRC
            r1.bsPutInt(r0)
            r1.bsFinishedWithStream()
            return
    }

    private void generateMTFValues() {
            r18 = this;
            r0 = r18
            int r1 = r0.last
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r2 = r0.data
            boolean[] r3 = r2.inUse
            byte[] r4 = r2.block
            int[] r5 = r2.fmap
            char[] r6 = r2.sfmap
            int[] r7 = r2.mtfFreq
            byte[] r8 = r2.unseqToSeq
            byte[] r2 = r2.generateMTFValues_yy
            r9 = 0
            r10 = r9
            r11 = r10
        L17:
            r12 = 256(0x100, float:3.59E-43)
            if (r10 >= r12) goto L27
            boolean r12 = r3[r10]
            if (r12 == 0) goto L24
            byte r12 = (byte) r11
            r8[r10] = r12
            int r11 = r11 + 1
        L24:
            int r10 = r10 + 1
            goto L17
        L27:
            r0.nInUse = r11
            int r3 = r11 + 1
            int r10 = r11 + 2
            java.util.Arrays.fill(r7, r9, r10, r9)
        L30:
            int r11 = r11 + (-1)
            if (r11 < 0) goto L38
            byte r10 = (byte) r11
            r2[r11] = r10
            goto L30
        L38:
            r10 = r9
            r11 = r10
            r12 = r11
        L3b:
            r14 = 1
            if (r10 > r1) goto L90
            r15 = r5[r10]
            r15 = r4[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r15 = r8[r15]
            r16 = r2[r9]
            r13 = r16
            r16 = r9
        L4c:
            if (r15 == r13) goto L57
            int r16 = r16 + 1
            r17 = r2[r16]
            r2[r16] = r13
            r13 = r17
            goto L4c
        L57:
            r2[r9] = r13
            if (r16 != 0) goto L5e
            int r11 = r11 + 1
            goto L8d
        L5e:
            if (r11 <= 0) goto L82
            int r11 = r11 + (-1)
        L62:
            r13 = r11 & 1
            if (r13 != 0) goto L70
            r6[r12] = r9
            int r12 = r12 + 1
            r13 = r7[r9]
            int r13 = r13 + r14
            r7[r9] = r13
            goto L79
        L70:
            r6[r12] = r14
            int r12 = r12 + 1
            r13 = r7[r14]
            int r13 = r13 + r14
            r7[r14] = r13
        L79:
            r13 = 2
            if (r11 >= r13) goto L7e
            r11 = r9
            goto L82
        L7e:
            int r11 = r11 + (-2)
            int r11 = r11 >> r14
            goto L62
        L82:
            int r13 = r16 + 1
            char r15 = (char) r13
            r6[r12] = r15
            int r12 = r12 + r14
            r15 = r7[r13]
            int r15 = r15 + r14
            r7[r13] = r15
        L8d:
            int r10 = r10 + 1
            goto L3b
        L90:
            if (r11 <= 0) goto Lb3
            int r11 = r11 + (-1)
        L94:
            r1 = r11 & 1
            if (r1 != 0) goto La2
            r6[r12] = r9
            int r12 = r12 + 1
            r1 = r7[r9]
            int r1 = r1 + r14
            r7[r9] = r1
            goto Lab
        La2:
            r6[r12] = r14
            int r12 = r12 + 1
            r1 = r7[r14]
            int r1 = r1 + r14
            r7[r14] = r1
        Lab:
            r1 = 2
            if (r11 >= r1) goto Laf
            goto Lb3
        Laf:
            int r11 = r11 + (-2)
            int r11 = r11 >> r14
            goto L94
        Lb3:
            char r1 = (char) r3
            r6[r12] = r1
            r1 = r7[r3]
            int r1 = r1 + r14
            r7[r3] = r1
            int r12 = r12 + r14
            r0.nMTF = r12
            return
    }

    private static void hbAssignCodes(int[] r4, byte[] r5, int r6, int r7, int r8) {
            r0 = 0
            r1 = r0
        L2:
            if (r6 > r7) goto L19
            r2 = r0
        L5:
            if (r2 >= r8) goto L14
            r3 = r5[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 != r6) goto L11
            r4[r2] = r1
            int r1 = r1 + 1
        L11:
            int r2 = r2 + 1
            goto L5
        L14:
            int r1 = r1 << 1
            int r6 = r6 + 1
            goto L2
        L19:
            return
    }

    private static void hbMakeCodeLengths(byte[] r17, int[] r18, org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r19, int r20, int r21) {
            r0 = r19
            r1 = r20
            int[] r2 = r0.heap
            int[] r3 = r0.weight
            int[] r0 = r0.parent
            r4 = r1
        Lb:
            int r5 = r4 + (-1)
            r6 = 1
            if (r5 < 0) goto L1c
            r7 = r18[r5]
            if (r7 != 0) goto L15
            goto L16
        L15:
            r6 = r7
        L16:
            int r6 = r6 << 8
            r3[r4] = r6
            r4 = r5
            goto Lb
        L1c:
            r4 = r6
        L1d:
            if (r4 == 0) goto L104
            r4 = 0
            r2[r4] = r4
            r3[r4] = r4
            r5 = -2
            r0[r4] = r5
            r7 = r4
            r5 = r6
        L29:
            r8 = -1
            if (r5 > r1) goto L46
            r0[r5] = r8
            int r7 = r7 + 1
            r2[r7] = r5
            r8 = r7
        L33:
            r9 = r3[r5]
            int r10 = r8 >> 1
            r11 = r2[r10]
            r12 = r3[r11]
            if (r9 >= r12) goto L41
            r2[r8] = r11
            r8 = r10
            goto L33
        L41:
            r2[r8] = r5
            int r5 = r5 + 1
            goto L29
        L46:
            r5 = r1
        L47:
            if (r7 <= r6) goto Ld7
            r9 = r2[r6]
            r10 = r2[r7]
            r2[r6] = r10
            int r11 = r7 + (-1)
            r12 = r6
        L52:
            int r13 = r12 << 1
            if (r13 <= r11) goto L57
            goto L6e
        L57:
            if (r13 >= r11) goto L66
            int r14 = r13 + 1
            r15 = r2[r14]
            r15 = r3[r15]
            r16 = r2[r13]
            r4 = r3[r16]
            if (r15 >= r4) goto L66
            r13 = r14
        L66:
            r4 = r3[r10]
            r14 = r2[r13]
            r15 = r3[r14]
            if (r4 >= r15) goto Ld1
        L6e:
            r2[r12] = r10
            r4 = r2[r6]
            r15 = r2[r11]
            r2[r6] = r15
            int r10 = r7 + (-2)
            r11 = r6
        L79:
            int r12 = r11 << 1
            if (r12 <= r10) goto L7e
            goto L95
        L7e:
            if (r12 >= r10) goto L8d
            int r13 = r12 + 1
            r14 = r2[r13]
            r14 = r3[r14]
            r16 = r2[r12]
            r8 = r3[r16]
            if (r14 >= r8) goto L8d
            r12 = r13
        L8d:
            r8 = r3[r15]
            r13 = r2[r12]
            r14 = r3[r13]
            if (r8 >= r14) goto Lcc
        L95:
            r2[r11] = r15
            int r5 = r5 + r6
            r0[r4] = r5
            r0[r9] = r5
            r8 = r3[r9]
            r4 = r3[r4]
            r9 = r8 & (-256(0xffffffffffffff00, float:NaN))
            r10 = r4 & (-256(0xffffffffffffff00, float:NaN))
            int r9 = r9 + r10
            r8 = r8 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = java.lang.Math.max(r8, r4)
            int r4 = r4 + r6
            r4 = r4 | r9
            r3[r5] = r4
            r8 = -1
            r0[r5] = r8
            int r7 = r7 + (-1)
            r2[r7] = r5
            r4 = r3[r5]
            r9 = r7
        Lbb:
            int r10 = r9 >> 1
            r11 = r2[r10]
            r12 = r3[r11]
            if (r4 >= r12) goto Lc7
            r2[r9] = r11
            r9 = r10
            goto Lbb
        Lc7:
            r2[r9] = r5
            r4 = 0
            goto L47
        Lcc:
            r8 = -1
            r2[r11] = r13
            r11 = r12
            goto L79
        Ld1:
            r2[r12] = r14
            r12 = r13
            r4 = 0
            goto L52
        Ld7:
            r5 = r6
            r4 = 0
        Ld9:
            if (r5 > r1) goto Lf1
            r7 = r5
            r8 = 0
        Ldd:
            r7 = r0[r7]
            if (r7 < 0) goto Le4
            int r8 = r8 + 1
            goto Ldd
        Le4:
            int r7 = r5 + (-1)
            byte r9 = (byte) r8
            r17[r7] = r9
            r7 = r21
            if (r8 <= r7) goto Lee
            r4 = r6
        Lee:
            int r5 = r5 + 1
            goto Ld9
        Lf1:
            r7 = r21
            if (r4 == 0) goto L1d
            r5 = r6
        Lf6:
            if (r5 >= r1) goto L1d
            r8 = r3[r5]
            int r8 = r8 >> 9
            int r8 = r8 + r6
            int r8 = r8 << 8
            r3[r5] = r8
            int r5 = r5 + 1
            goto Lf6
        L104:
            return
    }

    private void init() throws java.io.IOException {
            r2 = this;
            r0 = 66
            r2.bsPutUByte(r0)
            r0 = 90
            r2.bsPutUByte(r0)
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data
            int r1 = r2.blockSize100k
            r0.<init>(r1)
            r2.data = r0
            org.apache.commons.compress.compressors.bzip2.BlockSort r0 = new org.apache.commons.compress.compressors.bzip2.BlockSort
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r2.data
            r0.<init>(r1)
            r2.blockSorter = r0
            r0 = 104(0x68, float:1.46E-43)
            r2.bsPutUByte(r0)
            int r0 = r2.blockSize100k
            int r0 = r0 + 48
            r2.bsPutUByte(r0)
            r0 = 0
            r2.combinedCRC = r0
            r2.initBlock()
            return
    }

    private void initBlock() {
            r4 = this;
            org.apache.commons.compress.compressors.bzip2.CRC r0 = r4.crc
            r0.reset()
            r0 = -1
            r4.last = r0
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r4.data
            boolean[] r1 = r1.inUse
            r2 = 256(0x100, float:3.59E-43)
        Le:
            int r2 = r2 + r0
            if (r2 < 0) goto L15
            r3 = 0
            r1[r2] = r3
            goto Le
        L15:
            return
    }

    private void moveToFrontCodeAndSend() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r2.data
            int r0 = r0.origPtr
            r1 = 24
            r2.bsW(r1, r0)
            r2.generateMTFValues()
            r2.sendMTFValues()
            return
    }

    private void sendMTFValues() throws java.io.IOException {
            r8 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r8.data
            byte[][] r0 = r0.sendMTFValues_len
            int r1 = r8.nInUse
            r2 = 2
            int r1 = r1 + r2
            r3 = 6
            r4 = r3
        La:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L1a
            r5 = r0[r4]
            r6 = r1
        L11:
            int r6 = r6 + (-1)
            if (r6 < 0) goto La
            r7 = 15
            r5[r6] = r7
            goto L11
        L1a:
            int r0 = r8.nMTF
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 >= r4) goto L21
            goto L34
        L21:
            r2 = 600(0x258, float:8.41E-43)
            if (r0 >= r2) goto L27
            r2 = 3
            goto L34
        L27:
            r2 = 1200(0x4b0, float:1.682E-42)
            if (r0 >= r2) goto L2d
            r2 = 4
            goto L34
        L2d:
            r2 = 2400(0x960, float:3.363E-42)
            if (r0 >= r2) goto L33
            r2 = 5
            goto L34
        L33:
            r2 = r3
        L34:
            r8.sendMTFValues0(r2, r1)
            int r0 = r8.sendMTFValues1(r2, r1)
            r8.sendMTFValues2(r2, r0)
            r8.sendMTFValues3(r2, r1)
            r8.sendMTFValues4()
            r8.sendMTFValues5(r2, r0)
            r8.sendMTFValues6(r2, r1)
            r8.sendMTFValues7()
            return
    }

    private void sendMTFValues0(int r12, int r13) {
            r11 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r11.data
            byte[][] r0 = r0.sendMTFValues_len
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r11.data
            int[] r1 = r1.mtfFreq
            int r2 = r11.nMTF
            r3 = 0
            r4 = r12
            r5 = r3
        Ld:
            if (r4 <= 0) goto L4d
            int r6 = r2 / r4
            int r7 = r5 + (-1)
            int r8 = r13 + (-1)
            r9 = r3
        L16:
            if (r9 >= r6) goto L20
            if (r7 >= r8) goto L20
            int r7 = r7 + 1
            r10 = r1[r7]
            int r9 = r9 + r10
            goto L16
        L20:
            if (r7 <= r5) goto L32
            if (r4 == r12) goto L32
            r6 = 1
            if (r4 == r6) goto L32
            int r8 = r12 - r4
            r6 = r6 & r8
            if (r6 == 0) goto L32
            int r6 = r7 + (-1)
            r7 = r1[r7]
            int r9 = r9 - r7
            r7 = r6
        L32:
            int r6 = r4 + (-1)
            r6 = r0[r6]
            r8 = r13
        L37:
            int r8 = r8 + (-1)
            if (r8 < 0) goto L47
            if (r8 < r5) goto L42
            if (r8 > r7) goto L42
            r6[r8] = r3
            goto L37
        L42:
            r10 = 15
            r6[r8] = r10
            goto L37
        L47:
            int r5 = r7 + 1
            int r2 = r2 - r9
            int r4 = r4 + (-1)
            goto Ld
        L4d:
            return
    }

    private int sendMTFValues1(int r37, int r38) {
            r36 = this;
            r0 = r36
            r1 = r37
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r2 = r0.data
            int[][] r3 = r2.sendMTFValues_rfreq
            int[] r4 = r2.sendMTFValues_fave
            short[] r5 = r2.sendMTFValues_cost
            char[] r6 = r2.sfmap
            byte[] r7 = r2.selector
            byte[][] r2 = r2.sendMTFValues_len
            r8 = 0
            r9 = r2[r8]
            r10 = 1
            r11 = r2[r10]
            r12 = 2
            r13 = r2[r12]
            r14 = 3
            r15 = r2[r14]
            r14 = 4
            r17 = r2[r14]
            r18 = 5
            r19 = r2[r18]
            int r12 = r0.nMTF
            r10 = r8
            r22 = r10
        L2a:
            if (r10 >= r14) goto L160
            r22 = r1
        L2e:
            r23 = -1
            int r22 = r22 + (-1)
            if (r22 < 0) goto L41
            r4[r22] = r8
            r24 = r3[r22]
            r25 = r38
        L3a:
            int r25 = r25 + (-1)
            if (r25 < 0) goto L2e
            r24[r25] = r8
            goto L3a
        L41:
            r14 = r8
            r22 = r14
        L44:
            int r8 = r0.nMTF
            if (r14 >= r8) goto L130
            int r8 = r14 + 49
            r26 = r14
            r21 = 1
            int r14 = r12 + (-1)
            int r8 = java.lang.Math.min(r8, r14)
            r14 = 6
            if (r1 != r14) goto Lc3
            r14 = r26
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
        L65:
            if (r14 > r8) goto Lac
            char r33 = r6[r14]
            r34 = r12
            r12 = r9[r33]
            short r12 = (short) r12
            int r12 = r27 + r12
            short r12 = (short) r12
            r35 = r9
            r9 = r11[r33]
            short r9 = (short) r9
            int r9 = r28 + r9
            short r9 = (short) r9
            r27 = r9
            r9 = r13[r33]
            short r9 = (short) r9
            int r9 = r29 + r9
            short r9 = (short) r9
            r28 = r9
            r9 = r15[r33]
            short r9 = (short) r9
            int r9 = r30 + r9
            short r9 = (short) r9
            r29 = r9
            r9 = r17[r33]
            short r9 = (short) r9
            int r9 = r31 + r9
            short r9 = (short) r9
            r30 = r9
            r9 = r19[r33]
            short r9 = (short) r9
            int r9 = r32 + r9
            short r9 = (short) r9
            int r14 = r14 + 1
            r32 = r9
            r31 = r30
            r9 = r35
            r30 = r29
            r29 = r28
            r28 = r27
            r27 = r12
            r12 = r34
            goto L65
        Lac:
            r35 = r9
            r34 = r12
            r9 = 0
            r5[r9] = r27
            r12 = 1
            r5[r12] = r28
            r12 = 2
            r5[r12] = r29
            r14 = 3
            r5[r14] = r30
            r16 = 4
            r5[r16] = r31
            r5[r18] = r32
            goto Lf3
        Lc3:
            r35 = r9
            r34 = r12
            r9 = 0
            r12 = 2
            r14 = 3
            r16 = 4
            r20 = r1
        Lce:
            int r20 = r20 + (-1)
            if (r20 < 0) goto Ld5
            r5[r20] = r9
            goto Lce
        Ld5:
            r9 = r26
        Ld7:
            if (r9 > r8) goto Lf3
            char r20 = r6[r9]
            r24 = r1
        Ldd:
            int r24 = r24 + (-1)
            if (r24 < 0) goto Lef
            short r27 = r5[r24]
            r28 = r2[r24]
            r12 = r28[r20]
            short r12 = (short) r12
            int r12 = r27 + r12
            short r12 = (short) r12
            r5[r24] = r12
            r12 = 2
            goto Ldd
        Lef:
            int r9 = r9 + 1
            r12 = 2
            goto Ld7
        Lf3:
            r9 = 999999999(0x3b9ac9ff, float:0.004723787)
            r12 = r1
            r14 = r23
        Lf9:
            int r12 = r12 + (-1)
            if (r12 < 0) goto L108
            r24 = r11
            short r11 = r5[r12]
            if (r11 >= r9) goto L105
            r9 = r11
            r14 = r12
        L105:
            r11 = r24
            goto Lf9
        L108:
            r24 = r11
            r9 = r4[r14]
            r11 = 1
            int r9 = r9 + r11
            r4[r14] = r9
            byte r9 = (byte) r14
            r7[r22] = r9
            int r22 = r22 + 1
            r9 = r3[r14]
            r14 = r26
        L119:
            if (r14 > r8) goto L126
            char r12 = r6[r14]
            r21 = r9[r12]
            int r21 = r21 + 1
            r9[r12] = r21
            int r14 = r14 + 1
            goto L119
        L126:
            int r14 = r8 + 1
            r11 = r24
            r12 = r34
            r9 = r35
            goto L44
        L130:
            r35 = r9
            r24 = r11
            r34 = r12
            r11 = 1
            r16 = 4
            r8 = 0
        L13a:
            if (r8 >= r1) goto L14f
            r9 = r2[r8]
            r12 = r3[r8]
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r14 = r0.data
            r11 = 20
            r0 = r38
            hbMakeCodeLengths(r9, r12, r14, r0, r11)
            int r8 = r8 + 1
            r11 = 1
            r0 = r36
            goto L13a
        L14f:
            r0 = r38
            int r10 = r10 + 1
            r8 = 0
            r0 = r36
            r14 = r16
            r11 = r24
            r12 = r34
            r9 = r35
            goto L2a
        L160:
            return r22
    }

    private void sendMTFValues2(int r8, int r9) {
            r7 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r7.data
            byte[] r1 = r0.sendMTFValues2_pos
        L4:
            int r8 = r8 + (-1)
            if (r8 < 0) goto Lc
            byte r2 = (byte) r8
            r1[r8] = r2
            goto L4
        Lc:
            r8 = 0
            r2 = r8
        Le:
            if (r2 >= r9) goto L2b
            byte[] r3 = r0.selector
            r3 = r3[r2]
            r4 = r1[r8]
            r5 = r8
        L17:
            if (r3 == r4) goto L21
            int r5 = r5 + 1
            r6 = r1[r5]
            r1[r5] = r4
            r4 = r6
            goto L17
        L21:
            r1[r8] = r4
            byte[] r3 = r0.selectorMtf
            byte r4 = (byte) r5
            r3[r2] = r4
            int r2 = r2 + 1
            goto Le
        L2b:
            return
    }

    private void sendMTFValues3(int r10, int r11) {
            r9 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r9.data
            int[][] r0 = r0.sendMTFValues_code
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r9.data
            byte[][] r1 = r1.sendMTFValues_len
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r10) goto L2b
            r4 = r1[r3]
            r5 = 32
            r6 = r11
            r7 = r2
        L12:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L21
            r8 = r4[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 <= r7) goto L1d
            r7 = r8
        L1d:
            if (r8 >= r5) goto L12
            r5 = r8
            goto L12
        L21:
            r4 = r0[r3]
            r6 = r1[r3]
            hbAssignCodes(r4, r6, r5, r7, r11)
            int r3 = r3 + 1
            goto La
        L2b:
            return
    }

    private void sendMTFValues4() throws java.io.IOException {
            r12 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r12.data
            boolean[] r0 = r0.inUse
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r12.data
            boolean[] r1 = r1.sentMTFValues4_inUse16
            r2 = 16
            r3 = r2
        Lb:
            int r3 = r3 + (-1)
            r4 = 0
            r5 = 1
            if (r3 < 0) goto L23
            r1[r3] = r4
            int r4 = r3 * 16
            r6 = r2
        L16:
            int r6 = r6 + (-1)
            if (r6 < 0) goto Lb
            int r7 = r4 + r6
            boolean r7 = r0[r7]
            if (r7 == 0) goto L16
            r1[r3] = r5
            goto Lb
        L23:
            r3 = r4
        L24:
            if (r3 >= r2) goto L2e
            boolean r6 = r1[r3]
            r12.bsW(r5, r6)
            int r3 = r3 + 1
            goto L24
        L2e:
            java.io.OutputStream r3 = r12.out
            int r6 = r12.bsLive
            int r7 = r12.bsBuff
            r8 = r4
        L35:
            if (r8 >= r2) goto L61
            boolean r9 = r1[r8]
            if (r9 == 0) goto L5e
            int r9 = r8 * 16
            r10 = r4
        L3e:
            if (r10 >= r2) goto L5e
        L40:
            r11 = 8
            if (r6 < r11) goto L4e
            int r11 = r7 >> 24
            r3.write(r11)
            int r7 = r7 << 8
            int r6 = r6 + (-8)
            goto L40
        L4e:
            int r11 = r9 + r10
            boolean r11 = r0[r11]
            if (r11 == 0) goto L59
            int r11 = 31 - r6
            int r11 = r5 << r11
            r7 = r7 | r11
        L59:
            int r6 = r6 + 1
            int r10 = r10 + 1
            goto L3e
        L5e:
            int r8 = r8 + 1
            goto L35
        L61:
            r12.bsBuff = r7
            r12.bsLive = r6
            return
    }

    private void sendMTFValues5(int r10, int r11) throws java.io.IOException {
            r9 = this;
            r0 = 3
            r9.bsW(r0, r10)
            r10 = 15
            r9.bsW(r10, r11)
            java.io.OutputStream r10 = r9.out
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r9.data
            byte[] r0 = r0.selectorMtf
            int r1 = r9.bsLive
            int r2 = r9.bsBuff
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r11) goto L48
            r5 = r0[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r3
        L1c:
            r7 = 8
            if (r6 >= r5) goto L37
        L20:
            if (r1 < r7) goto L2c
            int r8 = r2 >> 24
            r10.write(r8)
            int r2 = r2 << 8
            int r1 = r1 + (-8)
            goto L20
        L2c:
            int r7 = 31 - r1
            r8 = 1
            int r7 = r8 << r7
            r2 = r2 | r7
            int r1 = r1 + 1
            int r6 = r6 + 1
            goto L1c
        L37:
            if (r1 < r7) goto L43
            int r5 = r2 >> 24
            r10.write(r5)
            int r2 = r2 << 8
            int r1 = r1 + (-8)
            goto L37
        L43:
            int r1 = r1 + 1
            int r4 = r4 + 1
            goto L15
        L48:
            r9.bsBuff = r2
            r9.bsLive = r1
            return
    }

    private void sendMTFValues6(int r14, int r15) throws java.io.IOException {
            r13 = this;
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r0 = r13.data
            byte[][] r0 = r0.sendMTFValues_len
            java.io.OutputStream r1 = r13.out
            int r2 = r13.bsLive
            int r3 = r13.bsBuff
            r4 = 0
            r5 = r4
        Lc:
            if (r5 >= r14) goto L75
            r6 = r0[r5]
            r7 = r6[r4]
            r7 = r7 & 255(0xff, float:3.57E-43)
        L14:
            r8 = 8
            if (r2 < r8) goto L22
            int r8 = r3 >> 24
            r1.write(r8)
            int r3 = r3 << 8
            int r2 = r2 + (-8)
            goto L14
        L22:
            int r9 = 27 - r2
            int r9 = r7 << r9
            r3 = r3 | r9
            int r2 = r2 + 5
            r9 = r4
        L2a:
            if (r9 >= r15) goto L72
            r10 = r6[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L30:
            if (r7 >= r10) goto L49
        L32:
            if (r2 < r8) goto L3e
            int r11 = r3 >> 24
            r1.write(r11)
            int r3 = r3 << 8
            int r2 = r2 + (-8)
            goto L32
        L3e:
            int r11 = 30 - r2
            r12 = 2
            int r11 = r12 << r11
            r3 = r3 | r11
            int r2 = r2 + 2
            int r7 = r7 + 1
            goto L30
        L49:
            if (r7 <= r10) goto L61
        L4b:
            if (r2 < r8) goto L57
            int r11 = r3 >> 24
            r1.write(r11)
            int r3 = r3 << 8
            int r2 = r2 + (-8)
            goto L4b
        L57:
            r11 = 3
            int r12 = 30 - r2
            int r11 = r11 << r12
            r3 = r3 | r11
            int r2 = r2 + 2
            int r7 = r7 + (-1)
            goto L49
        L61:
            if (r2 < r8) goto L6d
            int r10 = r3 >> 24
            r1.write(r10)
            int r3 = r3 << 8
            int r2 = r2 + (-8)
            goto L61
        L6d:
            int r2 = r2 + 1
            int r9 = r9 + 1
            goto L2a
        L72:
            int r5 = r5 + 1
            goto Lc
        L75:
            r13.bsBuff = r3
            r13.bsLive = r2
            return
    }

    private void sendMTFValues7() throws java.io.IOException {
            r17 = this;
            r0 = r17
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r0.data
            byte[][] r2 = r1.sendMTFValues_len
            int[][] r3 = r1.sendMTFValues_code
            java.io.OutputStream r4 = r0.out
            byte[] r5 = r1.selector
            char[] r1 = r1.sfmap
            int r6 = r0.nMTF
            int r7 = r0.bsLive
            int r8 = r0.bsBuff
            r9 = 0
            r10 = r9
        L16:
            if (r9 >= r6) goto L50
            int r11 = r9 + 49
            int r12 = r6 + (-1)
            int r11 = java.lang.Math.min(r11, r12)
            r12 = r5[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r13 = r3[r12]
            r12 = r2[r12]
        L28:
            if (r9 > r11) goto L4b
            char r14 = r1[r9]
        L2c:
            r15 = 8
            if (r7 < r15) goto L3a
            int r15 = r8 >> 24
            r4.write(r15)
            int r8 = r8 << 8
            int r7 = r7 + (-8)
            goto L2c
        L3a:
            r15 = r12[r14]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r13[r14]
            int r16 = 32 - r7
            int r16 = r16 - r15
            int r14 = r14 << r16
            r8 = r8 | r14
            int r7 = r7 + r15
            int r9 = r9 + 1
            goto L28
        L4b:
            int r9 = r11 + 1
            int r10 = r10 + 1
            goto L16
        L50:
            r0.bsBuff = r8
            r0.bsLive = r7
            return
    }

    private void write0(int r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.currentChar
            r1 = 1
            r2 = -1
            if (r0 == r2) goto L24
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r0 != r4) goto L1c
            int r4 = r3.runLength
            int r4 = r4 + r1
            r3.runLength = r4
            r0 = 254(0xfe, float:3.56E-43)
            if (r4 <= r0) goto L2d
            r3.writeRun()
            r3.currentChar = r2
            r4 = 0
            r3.runLength = r4
            goto L2d
        L1c:
            r3.writeRun()
            r3.runLength = r1
            r3.currentChar = r4
            goto L2d
        L24:
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3.currentChar = r4
            int r4 = r3.runLength
            int r4 = r4 + r1
            r3.runLength = r4
        L2d:
            return
    }

    private void writeRun() throws java.io.IOException {
            r7 = this;
            int r0 = r7.last
            int r1 = r7.allowableBlockSize
            if (r0 >= r1) goto L68
            int r1 = r7.currentChar
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r2 = r7.data
            boolean[] r3 = r2.inUse
            r4 = 1
            r3[r1] = r4
            byte r3 = (byte) r1
            int r5 = r7.runLength
            org.apache.commons.compress.compressors.bzip2.CRC r6 = r7.crc
            r6.update(r1, r5)
            if (r5 == r4) goto L5e
            r1 = 3
            r6 = 2
            if (r5 == r6) goto L50
            if (r5 == r1) goto L3f
            int r5 = r5 + (-4)
            boolean[] r1 = r2.inUse
            r1[r5] = r4
            byte[] r1 = r2.block
            int r2 = r0 + 2
            r1[r2] = r3
            int r2 = r0 + 3
            r1[r2] = r3
            int r2 = r0 + 4
            r1[r2] = r3
            int r2 = r0 + 5
            r1[r2] = r3
            int r0 = r0 + 6
            byte r3 = (byte) r5
            r1[r0] = r3
            r7.last = r2
            goto L71
        L3f:
            byte[] r1 = r2.block
            int r2 = r0 + 2
            r1[r2] = r3
            int r2 = r0 + 3
            r1[r2] = r3
            int r0 = r0 + 4
            r1[r0] = r3
            r7.last = r2
            goto L71
        L50:
            byte[] r4 = r2.block
            int r5 = r0 + 2
            r4[r5] = r3
            byte[] r2 = r2.block
            int r0 = r0 + r1
            r2[r0] = r3
            r7.last = r5
            goto L71
        L5e:
            byte[] r1 = r2.block
            int r2 = r0 + 2
            r1[r2] = r3
            int r0 = r0 + r4
            r7.last = r0
            goto L71
        L68:
            r7.endBlock()
            r7.initBlock()
            r7.writeRun()
        L71:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L14
            r2.finish()     // Catch: java.lang.Throwable -> Ld
            java.io.OutputStream r0 = r2.out
            org.apache.commons.io.IOUtils.close(r0)
            goto L14
        Ld:
            r0 = move-exception
            java.io.OutputStream r1 = r2.out
            org.apache.commons.io.IOUtils.close(r1)
            throw r0
        L14:
            return
    }

    public void finish() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L23
            r0 = 1
            r2.closed = r0
            r0 = 0
            int r1 = r2.runLength     // Catch: java.lang.Throwable -> L1d
            if (r1 <= 0) goto Lf
            r2.writeRun()     // Catch: java.lang.Throwable -> L1d
        Lf:
            r1 = -1
            r2.currentChar = r1     // Catch: java.lang.Throwable -> L1d
            r2.endBlock()     // Catch: java.lang.Throwable -> L1d
            r2.endCompression()     // Catch: java.lang.Throwable -> L1d
            r2.blockSorter = r0
            r2.data = r0
            goto L23
        L1d:
            r1 = move-exception
            r2.blockSorter = r0
            r2.data = r0
            throw r1
        L23:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            if (r0 == 0) goto L7
            super.flush()
        L7:
            return
    }

    public final int getBlockSize() {
            r1 = this;
            int r0 = r1.blockSize100k
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r1) throws java.io.IOException {
            r0 = this;
            r0.checkClosed()
            r0.write0(r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = ") < 0."
            java.lang.String r1 = "offs("
            if (r5 < 0) goto L63
            if (r6 < 0) goto L4a
            int r0 = r5 + r6
            int r2 = r4.length
            if (r0 > r2) goto L1c
            r3.checkClosed()
        L10:
            if (r5 >= r0) goto L1b
            int r6 = r5 + 1
            r5 = r4[r5]
            r3.write0(r5)
            r5 = r6
            goto L10
        L1b:
            return
        L1c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r1 = ") + len("
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ") > buf.length("
            java.lang.StringBuilder r5 = r5.append(r6)
            int r4 = r4.length
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = ")."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L4a:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "len("
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L63:
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
