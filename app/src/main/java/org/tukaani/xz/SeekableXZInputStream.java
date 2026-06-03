package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class SeekableXZInputStream extends org.tukaani.xz.SeekableInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final org.tukaani.xz.ArrayCache arrayCache;
    private int blockCount;
    private org.tukaani.xz.BlockInputStream blockDecoder;
    private org.tukaani.xz.check.Check check;
    private int checkTypes;
    private final org.tukaani.xz.index.BlockInfo curBlockInfo;
    private long curPos;
    private boolean endReached;
    private java.io.IOException exception;
    private org.tukaani.xz.SeekableInputStream in;
    private int indexMemoryUsage;
    private long largestBlockSize;
    private final int memoryLimit;
    private final org.tukaani.xz.index.BlockInfo queriedBlockInfo;
    private boolean seekNeeded;
    private long seekPos;
    private final java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> streams;
    private final byte[] tempBuf;
    private long uncompressedSize;
    private final boolean verifyCheck;

    static {
            return
    }

    public SeekableXZInputStream(org.tukaani.xz.SeekableInputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public SeekableXZInputStream(org.tukaani.xz.SeekableInputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public SeekableXZInputStream(org.tukaani.xz.SeekableInputStream r2, int r3, org.tukaani.xz.ArrayCache r4) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public SeekableXZInputStream(org.tukaani.xz.SeekableInputStream r2, int r3, boolean r4) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public SeekableXZInputStream(org.tukaani.xz.SeekableInputStream r17, int r18, boolean r19, org.tukaani.xz.ArrayCache r20) throws java.io.IOException {
            r16 = this;
            r1 = r16
            r0 = r17
            r16.<init>()
            r2 = 0
            r1.indexMemoryUsage = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.streams = r3
            r1.checkTypes = r2
            r8 = 0
            r1.uncompressedSize = r8
            r1.largestBlockSize = r8
            r1.blockCount = r2
            r3 = 0
            r1.blockDecoder = r3
            r1.curPos = r8
            r1.seekNeeded = r2
            r1.endReached = r2
            r1.exception = r3
            r10 = 1
            byte[] r2 = new byte[r10]
            r1.tempBuf = r2
            r2 = r20
            r1.arrayCache = r2
            r2 = r19
            r1.verifyCheck = r2
            r1.in = r0
            java.io.DataInputStream r11 = new java.io.DataInputStream
            r11.<init>(r0)
            r0.seek(r8)
            byte[] r2 = org.tukaani.xz.XZ.HEADER_MAGIC
            int r2 = r2.length
            byte[] r2 = new byte[r2]
            r11.readFully(r2)
            byte[] r3 = org.tukaani.xz.XZ.HEADER_MAGIC
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L1aa
            long r2 = r17.length()
            r4 = 3
            long r4 = r4 & r2
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L1a2
            r4 = 12
            byte[] r12 = new byte[r4]
            r13 = r18
        L5e:
            r5 = r8
        L5f:
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L15c
            r14 = 12
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 < 0) goto L156
            long r8 = r2 - r14
            r0.seek(r8)
            r11.readFully(r12)
            r4 = 8
            r4 = r12[r4]
            if (r4 != 0) goto L90
            r4 = 9
            r4 = r12[r4]
            if (r4 != 0) goto L90
            r4 = 10
            r4 = r12[r4]
            if (r4 != 0) goto L90
            r4 = 11
            r4 = r12[r4]
            if (r4 != 0) goto L90
            r7 = 4
            long r5 = r5 + r7
            long r2 = r2 - r7
            r8 = 0
            goto L5f
        L90:
            org.tukaani.xz.common.StreamFlags r7 = org.tukaani.xz.common.DecoderUtil.decodeStreamFooter(r12)
            long r2 = r7.backwardSize
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L14e
            int r2 = r7.checkType
            org.tukaani.xz.check.Check r2 = org.tukaani.xz.check.Check.getInstance(r2)
            r1.check = r2
            int r2 = r1.checkTypes
            int r3 = r7.checkType
            int r3 = r10 << r3
            r2 = r2 | r3
            r1.checkTypes = r2
            long r2 = r7.backwardSize
            long r2 = r8 - r2
            r0.seek(r2)
            org.tukaani.xz.index.IndexDecoder r4 = new org.tukaani.xz.index.IndexDecoder     // Catch: org.tukaani.xz.MemoryLimitException -> L13f
            r2 = r4
            r3 = r17
            r18 = r4
            r4 = r7
            r10 = r7
            r7 = r13
            r2.<init>(r3, r4, r5, r7)     // Catch: org.tukaani.xz.MemoryLimitException -> L13f
            int r2 = r1.indexMemoryUsage
            int r3 = r18.getMemoryUsage()
            int r2 = r2 + r3
            r1.indexMemoryUsage = r2
            if (r13 < 0) goto Lcf
            int r2 = r18.getMemoryUsage()
            int r13 = r13 - r2
        Lcf:
            long r2 = r1.largestBlockSize
            long r4 = r18.getLargestBlockSize()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto Ldf
            long r2 = r18.getLargestBlockSize()
            r1.largestBlockSize = r2
        Ldf:
            long r2 = r18.getStreamSize()
            long r2 = r2 - r14
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L137
            long r2 = r8 - r2
            r0.seek(r2)
            r11.readFully(r12)
            org.tukaani.xz.common.StreamFlags r4 = org.tukaani.xz.common.DecoderUtil.decodeStreamHeader(r12)
            boolean r4 = org.tukaani.xz.common.DecoderUtil.areStreamFlagsEqual(r4, r10)
            if (r4 == 0) goto L12f
            long r4 = r1.uncompressedSize
            long r6 = r18.getUncompressedSize()
            long r4 = r4 + r6
            r1.uncompressedSize = r4
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L127
            int r4 = r1.blockCount
            int r5 = r18.getRecordCount()
            int r4 = r4 + r5
            r1.blockCount = r4
            if (r4 < 0) goto L11f
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r4 = r1.streams
            r5 = r18
            r4.add(r5)
            r8 = r6
            r10 = 1
            goto L5e
        L11f:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r2 = "XZ file has over 2147483647 Blocks"
            r0.<init>(r2)
            throw r0
        L127:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r2 = "XZ file is too big"
            r0.<init>(r2)
            throw r0
        L12f:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r2 = "XZ Stream Footer does not match Stream Header"
            r0.<init>(r2)
            throw r0
        L137:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r2 = "XZ Index indicates too big compressed size for the XZ Stream"
            r0.<init>(r2)
            throw r0
        L13f:
            r0 = move-exception
            org.tukaani.xz.MemoryLimitException r2 = new org.tukaani.xz.MemoryLimitException
            int r0 = r0.getMemoryNeeded()
            int r3 = r1.indexMemoryUsage
            int r0 = r0 + r3
            int r13 = r13 + r3
            r2.<init>(r0, r13)
            throw r2
        L14e:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r2 = "Backward Size in XZ Stream Footer is too big"
            r0.<init>(r2)
            throw r0
        L156:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L15c:
            r1.memoryLimit = r13
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r0 = r1.streams
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r0 = r0.get(r2)
            org.tukaani.xz.index.IndexDecoder r0 = (org.tukaani.xz.index.IndexDecoder) r0
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r2 = r1.streams
            int r2 = r2.size()
            int r2 = r2 + (-2)
        L174:
            if (r2 < 0) goto L185
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r3 = r1.streams
            java.lang.Object r3 = r3.get(r2)
            org.tukaani.xz.index.IndexDecoder r3 = (org.tukaani.xz.index.IndexDecoder) r3
            r3.setOffsets(r0)
            int r2 = r2 + (-1)
            r0 = r3
            goto L174
        L185:
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r0 = r1.streams
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r0 = r0.get(r2)
            org.tukaani.xz.index.IndexDecoder r0 = (org.tukaani.xz.index.IndexDecoder) r0
            org.tukaani.xz.index.BlockInfo r2 = new org.tukaani.xz.index.BlockInfo
            r2.<init>(r0)
            r1.curBlockInfo = r2
            org.tukaani.xz.index.BlockInfo r2 = new org.tukaani.xz.index.BlockInfo
            r2.<init>(r0)
            r1.queriedBlockInfo = r2
            return
        L1a2:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r2 = "XZ file size is not a multiple of 4 bytes"
            r0.<init>(r2)
            throw r0
        L1aa:
            org.tukaani.xz.XZFormatException r0 = new org.tukaani.xz.XZFormatException
            r0.<init>()
            throw r0
    }

    public SeekableXZInputStream(org.tukaani.xz.SeekableInputStream r2, org.tukaani.xz.ArrayCache r3) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r3)
            return
    }

    private void initBlockDecoder() throws java.io.IOException {
            r11 = this;
            org.tukaani.xz.BlockInputStream r0 = r11.blockDecoder     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            if (r0 == 0) goto La
            r0.close()     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            r0 = 0
            r11.blockDecoder = r0     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
        La:
            org.tukaani.xz.BlockInputStream r0 = new org.tukaani.xz.BlockInputStream     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            org.tukaani.xz.SeekableInputStream r2 = r11.in     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            org.tukaani.xz.check.Check r3 = r11.check     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            boolean r4 = r11.verifyCheck     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            int r5 = r11.memoryLimit     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            org.tukaani.xz.index.BlockInfo r1 = r11.curBlockInfo     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            long r6 = r1.unpaddedSize     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            org.tukaani.xz.index.BlockInfo r1 = r11.curBlockInfo     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            long r8 = r1.uncompressedSize     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            org.tukaani.xz.ArrayCache r10 = r11.arrayCache     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r8, r10)     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            r11.blockDecoder = r0     // Catch: org.tukaani.xz.IndexIndicatorException -> L25 org.tukaani.xz.MemoryLimitException -> L2b
            return
        L25:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L2b:
            r0 = move-exception
            org.tukaani.xz.MemoryLimitException r1 = new org.tukaani.xz.MemoryLimitException
            int r0 = r0.getMemoryNeeded()
            int r2 = r11.indexMemoryUsage
            int r0 = r0 + r2
            int r3 = r11.memoryLimit
            int r3 = r3 + r2
            r1.<init>(r0, r3)
            throw r1
    }

    private void locateBlockByNumber(org.tukaani.xz.index.BlockInfo r4, int r5) {
            r3 = this;
            if (r5 < 0) goto L21
            int r0 = r3.blockCount
            if (r5 >= r0) goto L21
            int r0 = r4.blockNumber
            if (r0 != r5) goto Lb
            return
        Lb:
            r0 = 0
        Lc:
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r1 = r3.streams
            java.lang.Object r1 = r1.get(r0)
            org.tukaani.xz.index.IndexDecoder r1 = (org.tukaani.xz.index.IndexDecoder) r1
            boolean r2 = r1.hasRecord(r5)
            if (r2 == 0) goto L1e
            r1.setBlockInfo(r4, r5)
            return
        L1e:
            int r0 = r0 + 1
            goto Lc
        L21:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid XZ Block number: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private void locateBlockByPos(org.tukaani.xz.index.BlockInfo r4, long r5) {
            r3 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            long r0 = r3.uncompressedSize
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L22
            r0 = 0
        Ld:
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r1 = r3.streams
            java.lang.Object r1 = r1.get(r0)
            org.tukaani.xz.index.IndexDecoder r1 = (org.tukaani.xz.index.IndexDecoder) r1
            boolean r2 = r1.hasUncompressedOffset(r5)
            if (r2 == 0) goto L1f
            r1.locateBlock(r4, r5)
            return
        L1f:
            int r0 = r0 + 1
            goto Ld
        L22:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid uncompressed position: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private void seek() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.seekNeeded
            if (r0 != 0) goto L19
            org.tukaani.xz.index.BlockInfo r0 = r5.curBlockInfo
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L15
            org.tukaani.xz.index.BlockInfo r0 = r5.curBlockInfo
            r0.setNext()
            r5.initBlockDecoder()
            return
        L15:
            long r0 = r5.curPos
            r5.seekPos = r0
        L19:
            r0 = 0
            r5.seekNeeded = r0
            long r1 = r5.seekPos
            long r3 = r5.uncompressedSize
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L34
            r5.curPos = r1
            org.tukaani.xz.BlockInputStream r0 = r5.blockDecoder
            if (r0 == 0) goto L30
            r0.close()
            r0 = 0
            r5.blockDecoder = r0
        L30:
            r0 = 1
            r5.endReached = r0
            return
        L34:
            r5.endReached = r0
            org.tukaani.xz.index.BlockInfo r0 = r5.curBlockInfo
            r5.locateBlockByPos(r0, r1)
            long r0 = r5.curPos
            org.tukaani.xz.index.BlockInfo r2 = r5.curBlockInfo
            long r2 = r2.uncompressedOffset
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L4d
            long r0 = r5.curPos
            long r2 = r5.seekPos
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6b
        L4d:
            org.tukaani.xz.SeekableInputStream r0 = r5.in
            org.tukaani.xz.index.BlockInfo r1 = r5.curBlockInfo
            long r1 = r1.compressedOffset
            r0.seek(r1)
            org.tukaani.xz.index.BlockInfo r0 = r5.curBlockInfo
            int r0 = r0.getCheckType()
            org.tukaani.xz.check.Check r0 = org.tukaani.xz.check.Check.getInstance(r0)
            r5.check = r0
            r5.initBlockDecoder()
            org.tukaani.xz.index.BlockInfo r0 = r5.curBlockInfo
            long r0 = r0.uncompressedOffset
            r5.curPos = r0
        L6b:
            long r0 = r5.seekPos
            long r2 = r5.curPos
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L89
            long r0 = r0 - r2
            org.tukaani.xz.BlockInputStream r2 = r5.blockDecoder
            long r2 = r2.skip(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L83
            long r0 = r5.seekPos
            r5.curPos = r0
            goto L89
        L83:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L89:
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.SeekableInputStream r0 = r2.in
            if (r0 == 0) goto L1d
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L1c
            boolean r0 = r2.endReached
            if (r0 != 0) goto L1a
            boolean r0 = r2.seekNeeded
            if (r0 != 0) goto L1a
            org.tukaani.xz.BlockInputStream r0 = r2.blockDecoder
            if (r0 != 0) goto L15
            goto L1a
        L15:
            int r0 = r0.available()
            return r0
        L1a:
            r0 = 0
            return r0
        L1c:
            throw r0
        L1d:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.close(r0)
            return
    }

    public void close(boolean r3) throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.SeekableInputStream r0 = r2.in
            if (r0 == 0) goto L1c
            org.tukaani.xz.BlockInputStream r0 = r2.blockDecoder
            r1 = 0
            if (r0 == 0) goto Le
            r0.close()
            r2.blockDecoder = r1
        Le:
            if (r3 == 0) goto L1a
            org.tukaani.xz.SeekableInputStream r3 = r2.in     // Catch: java.lang.Throwable -> L16
            r3.close()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r3 = move-exception
            r2.in = r1
            throw r3
        L1a:
            r2.in = r1
        L1c:
            return
    }

    public int getBlockCheckType(int r2) {
            r1 = this;
            org.tukaani.xz.index.BlockInfo r0 = r1.queriedBlockInfo
            r1.locateBlockByNumber(r0, r2)
            org.tukaani.xz.index.BlockInfo r2 = r1.queriedBlockInfo
            int r2 = r2.getCheckType()
            return r2
    }

    public long getBlockCompPos(int r3) {
            r2 = this;
            org.tukaani.xz.index.BlockInfo r0 = r2.queriedBlockInfo
            r2.locateBlockByNumber(r0, r3)
            org.tukaani.xz.index.BlockInfo r3 = r2.queriedBlockInfo
            long r0 = r3.compressedOffset
            return r0
    }

    public long getBlockCompSize(int r5) {
            r4 = this;
            org.tukaani.xz.index.BlockInfo r0 = r4.queriedBlockInfo
            r4.locateBlockByNumber(r0, r5)
            org.tukaani.xz.index.BlockInfo r5 = r4.queriedBlockInfo
            long r0 = r5.unpaddedSize
            r2 = 3
            long r0 = r0 + r2
            r2 = -4
            long r0 = r0 & r2
            return r0
    }

    public int getBlockCount() {
            r1 = this;
            int r0 = r1.blockCount
            return r0
    }

    public int getBlockNumber(long r2) {
            r1 = this;
            org.tukaani.xz.index.BlockInfo r0 = r1.queriedBlockInfo
            r1.locateBlockByPos(r0, r2)
            org.tukaani.xz.index.BlockInfo r2 = r1.queriedBlockInfo
            int r2 = r2.blockNumber
            return r2
    }

    public long getBlockPos(int r3) {
            r2 = this;
            org.tukaani.xz.index.BlockInfo r0 = r2.queriedBlockInfo
            r2.locateBlockByNumber(r0, r3)
            org.tukaani.xz.index.BlockInfo r3 = r2.queriedBlockInfo
            long r0 = r3.uncompressedOffset
            return r0
    }

    public long getBlockSize(int r3) {
            r2 = this;
            org.tukaani.xz.index.BlockInfo r0 = r2.queriedBlockInfo
            r2.locateBlockByNumber(r0, r3)
            org.tukaani.xz.index.BlockInfo r3 = r2.queriedBlockInfo
            long r0 = r3.uncompressedSize
            return r0
    }

    public int getCheckTypes() {
            r1 = this;
            int r0 = r1.checkTypes
            return r0
    }

    public int getIndexMemoryUsage() {
            r1 = this;
            int r0 = r1.indexMemoryUsage
            return r0
    }

    public long getLargestBlockSize() {
            r2 = this;
            long r0 = r2.largestBlockSize
            return r0
    }

    public int getStreamCount() {
            r1 = this;
            java.util.ArrayList<org.tukaani.xz.index.IndexDecoder> r0 = r1.streams
            int r0 = r0.size()
            return r0
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public long length() {
            r2 = this;
            long r0 = r2.uncompressedSize
            return r0
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public long position() throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.SeekableInputStream r0 = r2.in
            if (r0 == 0) goto Le
            boolean r0 = r2.seekNeeded
            if (r0 == 0) goto Lb
            long r0 = r2.seekPos
            goto Ld
        Lb:
            long r0 = r2.curPos
        Ld:
            return r0
        Le:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
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
            if (r9 < 0) goto L63
            if (r10 < 0) goto L63
            int r0 = r9 + r10
            if (r0 < 0) goto L63
            int r1 = r8.length
            if (r0 > r1) goto L63
            r0 = 0
            if (r10 != 0) goto Lf
            return r0
        Lf:
            org.tukaani.xz.SeekableInputStream r1 = r7.in
            if (r1 == 0) goto L5b
            java.io.IOException r1 = r7.exception
            if (r1 != 0) goto L5a
            boolean r1 = r7.seekNeeded     // Catch: java.io.IOException -> L4a
            if (r1 == 0) goto L1e
            r7.seek()     // Catch: java.io.IOException -> L4a
        L1e:
            boolean r1 = r7.endReached     // Catch: java.io.IOException -> L4a
            r2 = -1
            if (r1 == 0) goto L24
            return r2
        L24:
            if (r10 <= 0) goto L58
            org.tukaani.xz.BlockInputStream r1 = r7.blockDecoder     // Catch: java.io.IOException -> L4a
            if (r1 != 0) goto L32
            r7.seek()     // Catch: java.io.IOException -> L4a
            boolean r1 = r7.endReached     // Catch: java.io.IOException -> L4a
            if (r1 == 0) goto L32
            goto L58
        L32:
            org.tukaani.xz.BlockInputStream r1 = r7.blockDecoder     // Catch: java.io.IOException -> L4a
            int r1 = r1.read(r8, r9, r10)     // Catch: java.io.IOException -> L4a
            if (r1 <= 0) goto L44
            long r3 = r7.curPos     // Catch: java.io.IOException -> L4a
            long r5 = (long) r1     // Catch: java.io.IOException -> L4a
            long r3 = r3 + r5
            r7.curPos = r3     // Catch: java.io.IOException -> L4a
            int r0 = r0 + r1
            int r9 = r9 + r1
            int r10 = r10 - r1
            goto L24
        L44:
            if (r1 != r2) goto L24
            r1 = 0
            r7.blockDecoder = r1     // Catch: java.io.IOException -> L4a
            goto L24
        L4a:
            r8 = move-exception
            boolean r9 = r8 instanceof java.io.EOFException
            if (r9 == 0) goto L54
            org.tukaani.xz.CorruptedInputException r8 = new org.tukaani.xz.CorruptedInputException
            r8.<init>()
        L54:
            r7.exception = r8
            if (r0 == 0) goto L59
        L58:
            return r0
        L59:
            throw r8
        L5a:
            throw r1
        L5b:
            org.tukaani.xz.XZIOException r8 = new org.tukaani.xz.XZIOException
            java.lang.String r9 = "Stream closed"
            r8.<init>(r9)
            throw r8
        L63:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            r8.<init>()
            throw r8
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public void seek(long r4) throws java.io.IOException {
            r3 = this;
            org.tukaani.xz.SeekableInputStream r0 = r3.in
            if (r0 == 0) goto L25
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            r3.seekPos = r4
            r4 = 1
            r3.seekNeeded = r4
            return
        L10:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative seek position: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L25:
            org.tukaani.xz.XZIOException r4 = new org.tukaani.xz.XZIOException
            java.lang.String r5 = "Stream closed"
            r4.<init>(r5)
            throw r4
    }

    public void seekToBlock(int r4) throws java.io.IOException {
            r3 = this;
            org.tukaani.xz.SeekableInputStream r0 = r3.in
            if (r0 == 0) goto L2e
            if (r4 < 0) goto L19
            int r0 = r3.blockCount
            if (r4 >= r0) goto L19
            org.tukaani.xz.index.BlockInfo r0 = r3.queriedBlockInfo
            r3.locateBlockByNumber(r0, r4)
            org.tukaani.xz.index.BlockInfo r4 = r3.queriedBlockInfo
            long r0 = r4.uncompressedOffset
            r3.seekPos = r0
            r4 = 1
            r3.seekNeeded = r4
            return
        L19:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid XZ Block number: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2e:
            org.tukaani.xz.XZIOException r4 = new org.tukaani.xz.XZIOException
            java.lang.String r0 = "Stream closed"
            r4.<init>(r0)
            throw r4
    }
}
