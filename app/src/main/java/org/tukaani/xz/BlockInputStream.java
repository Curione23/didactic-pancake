package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class BlockInputStream extends java.io.InputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final org.tukaani.xz.check.Check check;
    private long compressedSizeInHeader;
    private long compressedSizeLimit;
    private boolean endReached;
    private java.io.InputStream filterChain;
    private final int headerSize;
    private final org.tukaani.xz.CountingInputStream inCounted;
    private final java.io.DataInputStream inData;
    private final byte[] tempBuf;
    private long uncompressedSize;
    private long uncompressedSizeInHeader;
    private final boolean verifyCheck;

    static {
            return
    }

    public BlockInputStream(java.io.InputStream r24, org.tukaani.xz.check.Check r25, boolean r26, int r27, long r28, long r30, org.tukaani.xz.ArrayCache r32) throws java.io.IOException, org.tukaani.xz.IndexIndicatorException {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = r30
            r23.<init>()
            r5 = -1
            r0.uncompressedSizeInHeader = r5
            r0.compressedSizeInHeader = r5
            r7 = 0
            r0.uncompressedSize = r7
            r9 = 0
            r0.endReached = r9
            r10 = 1
            byte[] r11 = new byte[r10]
            r0.tempBuf = r11
            r11 = r25
            r0.check = r11
            r12 = r26
            r0.verifyCheck = r12
            java.io.DataInputStream r12 = new java.io.DataInputStream
            r12.<init>(r1)
            r0.inData = r12
            int r13 = r12.readUnsignedByte()
            if (r13 == 0) goto L1da
            int r14 = r13 + 1
            int r14 = r14 * 4
            r0.headerSize = r14
            byte[] r15 = new byte[r14]
            byte r13 = (byte) r13
            r15[r9] = r13
            int r13 = r14 + (-1)
            r12.readFully(r15, r10, r13)
            int r12 = r14 + (-4)
            int r13 = r14 + (-4)
            boolean r12 = org.tukaani.xz.common.DecoderUtil.isCRC32Valid(r15, r9, r12, r13)
            java.lang.String r13 = "XZ Block Header is corrupt"
            if (r12 == 0) goto L1d3
            r12 = r15[r10]
            r16 = r12 & 60
            java.lang.String r9 = "Unsupported options in XZ Block Header"
            if (r16 != 0) goto L1cd
            r12 = r12 & 3
            int r5 = r12 + 1
            long[] r6 = new long[r5]
            byte[][] r7 = new byte[r5][]
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream
            int r10 = r14 + (-6)
            r11 = 2
            r8.<init>(r15, r11, r10)
            long r10 = (long) r14
            r21 = 9223372036854775804(0x7ffffffffffffffc, double:NaN)
            long r21 = r21 - r10
            int r10 = r25.getSize()     // Catch: java.io.IOException -> L1c3
            long r10 = (long) r10     // Catch: java.io.IOException -> L1c3
            long r10 = r21 - r10
            r0.compressedSizeLimit = r10     // Catch: java.io.IOException -> L1c3
            r10 = 1
            r11 = r15[r10]     // Catch: java.io.IOException -> L1c3
            r10 = r11 & 64
            if (r10 == 0) goto L9e
            long r10 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r8)     // Catch: java.io.IOException -> L1c3
            r0.compressedSizeInHeader = r10     // Catch: java.io.IOException -> L1c3
            r19 = 0
            int r14 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r14 == 0) goto L96
            r14 = r12
            r26 = r13
            long r12 = r0.compressedSizeLimit     // Catch: java.io.IOException -> L1c5
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 > 0) goto L98
            r0.compressedSizeLimit = r10     // Catch: java.io.IOException -> L1c5
            goto La1
        L96:
            r26 = r13
        L98:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.IOException -> L1c5
            r1.<init>()     // Catch: java.io.IOException -> L1c5
            throw r1     // Catch: java.io.IOException -> L1c5
        L9e:
            r14 = r12
            r26 = r13
        La1:
            r10 = 1
            r10 = r15[r10]     // Catch: java.io.IOException -> L1c5
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto Lae
            long r10 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r8)     // Catch: java.io.IOException -> L1c5
            r0.uncompressedSizeInHeader = r10     // Catch: java.io.IOException -> L1c5
        Lae:
            r10 = 0
        Laf:
            if (r10 >= r5) goto Ld7
            long r11 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r8)     // Catch: java.io.IOException -> L1c5
            r6[r10] = r11     // Catch: java.io.IOException -> L1c5
            long r11 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r8)     // Catch: java.io.IOException -> L1c5
            int r13 = r8.available()     // Catch: java.io.IOException -> L1c5
            r15 = r14
            long r13 = (long) r13     // Catch: java.io.IOException -> L1c5
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 > 0) goto Ld1
            int r11 = (int) r11     // Catch: java.io.IOException -> L1c5
            byte[] r11 = new byte[r11]     // Catch: java.io.IOException -> L1c5
            r7[r10] = r11     // Catch: java.io.IOException -> L1c5
            r8.read(r11)     // Catch: java.io.IOException -> L1c5
            int r10 = r10 + 1
            r14 = r15
            goto Laf
        Ld1:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.IOException -> L1c5
            r1.<init>()     // Catch: java.io.IOException -> L1c5
            throw r1     // Catch: java.io.IOException -> L1c5
        Ld7:
            r15 = r14
            int r10 = r8.available()
        Ldc:
            if (r10 <= 0) goto Led
            int r11 = r8.read()
            if (r11 != 0) goto Le7
            int r10 = r10 + (-1)
            goto Ldc
        Le7:
            org.tukaani.xz.UnsupportedOptionsException r1 = new org.tukaani.xz.UnsupportedOptionsException
            r1.<init>(r9)
            throw r1
        Led:
            r8 = -1
            int r10 = (r28 > r8 ? 1 : (r28 == r8 ? 0 : -1))
            if (r10 == 0) goto L139
            int r8 = r0.headerSize
            int r9 = r25.getSize()
            int r8 = r8 + r9
            long r8 = (long) r8
            int r10 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            java.lang.String r11 = "XZ Index does not match a Block Header"
            if (r10 >= 0) goto L133
            long r8 = r28 - r8
            long r12 = r0.compressedSizeLimit
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 > 0) goto L12d
            long r12 = r0.compressedSizeInHeader
            r17 = -1
            int r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r10 == 0) goto L115
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 != 0) goto L12d
        L115:
            long r12 = r0.uncompressedSizeInHeader
            int r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r10 == 0) goto L126
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 != 0) goto L120
            goto L126
        L120:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r11)
            throw r1
        L126:
            r0.compressedSizeLimit = r8
            r0.compressedSizeInHeader = r8
            r0.uncompressedSizeInHeader = r3
            goto L139
        L12d:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r11)
            throw r1
        L133:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r11)
            throw r1
        L139:
            org.tukaani.xz.FilterDecoder[] r3 = new org.tukaani.xz.FilterDecoder[r5]
            r4 = 0
        L13c:
            if (r4 >= r5) goto L18b
            r8 = r6[r4]
            r10 = 33
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L150
            org.tukaani.xz.LZMA2Decoder r8 = new org.tukaani.xz.LZMA2Decoder
            r9 = r7[r4]
            r8.<init>(r9)
            r3[r4] = r8
            goto L171
        L150:
            r10 = 3
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L160
            org.tukaani.xz.DeltaDecoder r8 = new org.tukaani.xz.DeltaDecoder
            r9 = r7[r4]
            r8.<init>(r9)
            r3[r4] = r8
            goto L171
        L160:
            boolean r8 = org.tukaani.xz.BCJDecoder.isBCJFilterID(r8)
            if (r8 == 0) goto L174
            org.tukaani.xz.BCJDecoder r8 = new org.tukaani.xz.BCJDecoder
            r9 = r6[r4]
            r11 = r7[r4]
            r8.<init>(r9, r11)
            r3[r4] = r8
        L171:
            int r4 = r4 + 1
            goto L13c
        L174:
            org.tukaani.xz.UnsupportedOptionsException r1 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown Filter ID "
            r2.<init>(r3)
            r3 = r6[r4]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L18b:
            org.tukaani.xz.RawCoder.validate(r3)
            if (r2 < 0) goto L1a7
            r4 = 0
            r9 = 0
        L192:
            if (r9 >= r5) goto L19e
            r6 = r3[r9]
            int r6 = r6.getMemoryUsage()
            int r4 = r4 + r6
            int r9 = r9 + 1
            goto L192
        L19e:
            if (r4 > r2) goto L1a1
            goto L1a7
        L1a1:
            org.tukaani.xz.MemoryLimitException r1 = new org.tukaani.xz.MemoryLimitException
            r1.<init>(r4, r2)
            throw r1
        L1a7:
            org.tukaani.xz.CountingInputStream r2 = new org.tukaani.xz.CountingInputStream
            r2.<init>(r1)
            r0.inCounted = r2
            r0.filterChain = r2
            r12 = r15
        L1b1:
            if (r12 < 0) goto L1c2
            r1 = r3[r12]
            java.io.InputStream r2 = r0.filterChain
            r4 = r32
            java.io.InputStream r1 = r1.getInputStream(r2, r4)
            r0.filterChain = r1
            int r12 = r12 + (-1)
            goto L1b1
        L1c2:
            return
        L1c3:
            r26 = r13
        L1c5:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r2 = r26
            r1.<init>(r2)
            throw r1
        L1cd:
            org.tukaani.xz.UnsupportedOptionsException r1 = new org.tukaani.xz.UnsupportedOptionsException
            r1.<init>(r9)
            throw r1
        L1d3:
            r2 = r13
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r2)
            throw r1
        L1da:
            org.tukaani.xz.IndexIndicatorException r1 = new org.tukaani.xz.IndexIndicatorException
            r1.<init>()
            throw r1
    }

    private void validate() throws java.io.IOException {
            r7 = this;
            org.tukaani.xz.CountingInputStream r0 = r7.inCounted
            long r0 = r0.getSize()
            long r2 = r7.compressedSizeInHeader
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L1f
        L12:
            long r2 = r7.uncompressedSizeInHeader
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L25
            long r4 = r7.uncompressedSize
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1f
            goto L25
        L1f:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L25:
            r2 = 1
            long r2 = r2 + r0
            r4 = 3
            long r0 = r0 & r4
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L41
            java.io.DataInputStream r0 = r7.inData
            int r0 = r0.readUnsignedByte()
            if (r0 != 0) goto L3b
            r0 = r2
            goto L25
        L3b:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L41:
            org.tukaani.xz.check.Check r0 = r7.check
            int r0 = r0.getSize()
            byte[] r0 = new byte[r0]
            java.io.DataInputStream r1 = r7.inData
            r1.readFully(r0)
            boolean r1 = r7.verifyCheck
            if (r1 == 0) goto L80
            org.tukaani.xz.check.Check r1 = r7.check
            byte[] r1 = r1.finish()
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L5f
            goto L80
        L5f:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Integrity check ("
            r1.<init>(r2)
            org.tukaani.xz.check.Check r2 = r7.check
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") does not match"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L80:
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.filterChain
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.InputStream r0 = r1.filterChain     // Catch: java.io.IOException -> L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            r0 = 0
            r1.filterChain = r0
            return
    }

    public long getUncompressedSize() {
            r2 = this;
            long r0 = r2.uncompressedSize
            return r0
    }

    public long getUnpaddedSize() {
            r4 = this;
            int r0 = r4.headerSize
            long r0 = (long) r0
            org.tukaani.xz.CountingInputStream r2 = r4.inCounted
            long r2 = r2.getSize()
            long r0 = r0 + r2
            org.tukaani.xz.check.Check r2 = r4.check
            int r2 = r2.getSize()
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.tempBuf
            r1 = 1
            r2 = 0
            int r0 = r3.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            byte[] r0 = r3.tempBuf
            r0 = r0[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
        L12:
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.endReached
            r1 = -1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.io.InputStream r0 = r7.filterChain
            int r0 = r0.read(r8, r9, r10)
            r2 = 1
            if (r0 <= 0) goto L62
            boolean r3 = r7.verifyCheck
            if (r3 == 0) goto L18
            org.tukaani.xz.check.Check r3 = r7.check
            r3.update(r8, r9, r0)
        L18:
            long r8 = r7.uncompressedSize
            long r3 = (long) r0
            long r8 = r8 + r3
            r7.uncompressedSize = r8
            org.tukaani.xz.CountingInputStream r8 = r7.inCounted
            long r8 = r8.getSize()
            r3 = 0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 < 0) goto L5c
            long r5 = r7.compressedSizeLimit
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L5c
            long r8 = r7.uncompressedSize
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L5c
            long r3 = r7.uncompressedSizeInHeader
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L42
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 > 0) goto L5c
        L42:
            if (r0 < r10) goto L48
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L69
        L48:
            java.io.InputStream r8 = r7.filterChain
            int r8 = r8.read()
            if (r8 != r1) goto L56
            r7.validate()
            r7.endReached = r2
            goto L69
        L56:
            org.tukaani.xz.CorruptedInputException r8 = new org.tukaani.xz.CorruptedInputException
            r8.<init>()
            throw r8
        L5c:
            org.tukaani.xz.CorruptedInputException r8 = new org.tukaani.xz.CorruptedInputException
            r8.<init>()
            throw r8
        L62:
            if (r0 != r1) goto L69
            r7.validate()
            r7.endReached = r2
        L69:
            return r0
    }
}
