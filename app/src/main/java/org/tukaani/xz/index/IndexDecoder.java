package org.tukaani.xz.index;

/* JADX INFO: loaded from: classes2.dex */
public final class IndexDecoder extends org.tukaani.xz.index.IndexBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long compressedOffset;
    private long largestBlockSize;
    private final int memoryUsage;
    private int recordOffset;
    private final org.tukaani.xz.common.StreamFlags streamFlags;
    private final long streamPadding;
    private final long[] uncompressed;
    private long uncompressedOffset;
    private final long[] unpadded;

    static {
            return
    }

    public IndexDecoder(org.tukaani.xz.SeekableInputStream r17, org.tukaani.xz.common.StreamFlags r18, long r19, int r21) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r21
            org.tukaani.xz.CorruptedInputException r3 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r4 = "XZ Index is corrupt"
            r3.<init>(r4)
            r0.<init>(r3)
            r5 = 0
            r0.largestBlockSize = r5
            r3 = 0
            r0.recordOffset = r3
            r0.compressedOffset = r5
            r0.uncompressedOffset = r5
            r0.streamFlags = r1
            r5 = r19
            r0.streamPadding = r5
            long r5 = r17.position()
            long r7 = r1.backwardSize
            long r5 = r5 + r7
            r7 = 4
            long r5 = r5 - r7
            java.util.zip.CRC32 r7 = new java.util.zip.CRC32
            r7.<init>()
            java.util.zip.CheckedInputStream r8 = new java.util.zip.CheckedInputStream
            r9 = r17
            r8.<init>(r9, r7)
            int r10 = r8.read()
            if (r10 != 0) goto L11a
            long r10 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r8)     // Catch: java.io.EOFException -> L113
            long r12 = r1.backwardSize     // Catch: java.io.EOFException -> L113
            r14 = 2
            long r12 = r12 / r14
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 >= 0) goto L10c
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L103
            r12 = 16
            long r12 = r12 * r10
            r14 = 1023(0x3ff, double:5.054E-321)
            long r12 = r12 + r14
            r14 = 1024(0x400, double:5.06E-321)
            long r12 = r12 / r14
            int r1 = (int) r12     // Catch: java.io.EOFException -> L113
            int r1 = r1 + 1
            r0.memoryUsage = r1     // Catch: java.io.EOFException -> L113
            if (r2 < 0) goto L6a
            if (r1 > r2) goto L64
            goto L6a
        L64:
            org.tukaani.xz.MemoryLimitException r3 = new org.tukaani.xz.MemoryLimitException     // Catch: java.io.EOFException -> L113
            r3.<init>(r1, r2)     // Catch: java.io.EOFException -> L113
            throw r3     // Catch: java.io.EOFException -> L113
        L6a:
            int r1 = (int) r10     // Catch: java.io.EOFException -> L113
            long[] r2 = new long[r1]     // Catch: java.io.EOFException -> L113
            r0.unpadded = r2     // Catch: java.io.EOFException -> L113
            long[] r2 = new long[r1]     // Catch: java.io.EOFException -> L113
            r0.uncompressed = r2     // Catch: java.io.EOFException -> L113
            r2 = r3
        L74:
            if (r1 <= 0) goto Lba
            long r10 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r8)     // Catch: java.io.EOFException -> L113
            long r12 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r8)     // Catch: java.io.EOFException -> L113
            long r14 = r17.position()     // Catch: java.io.EOFException -> L113
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 > 0) goto Lad
            long[] r14 = r0.unpadded     // Catch: java.io.EOFException -> L113
            r15 = r4
            long r3 = r0.blocksSum     // Catch: java.io.EOFException -> Laa
            long r3 = r3 + r10
            r14[r2] = r3     // Catch: java.io.EOFException -> Laa
            long[] r3 = r0.uncompressed     // Catch: java.io.EOFException -> Laa
            r18 = r15
            long r14 = r0.uncompressedSum     // Catch: java.io.EOFException -> Lb7
            long r14 = r14 + r12
            r3[r2] = r14     // Catch: java.io.EOFException -> Lb7
            int r2 = r2 + 1
            super.add(r10, r12)     // Catch: java.io.EOFException -> Lb7
            long r3 = r0.largestBlockSize     // Catch: java.io.EOFException -> Lb7
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto La4
            r0.largestBlockSize = r12     // Catch: java.io.EOFException -> Lb7
        La4:
            int r1 = r1 + (-1)
            r4 = r18
            r3 = 0
            goto L74
        Laa:
            r2 = r15
            goto L114
        Lad:
            r18 = r4
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.EOFException -> Lb7
            r2 = r18
            r1.<init>(r2)     // Catch: java.io.EOFException -> L114
            throw r1     // Catch: java.io.EOFException -> L114
        Lb7:
            r2 = r18
            goto L114
        Lba:
            r2 = r4
            int r1 = r16.getIndexPaddingSize()
            long r3 = r17.position()
            long r10 = (long) r1
            long r3 = r3 + r10
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Lfd
        Lc9:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto Ldb
            int r1 = r8.read()
            if (r1 != 0) goto Ld5
            r1 = r3
            goto Lc9
        Ld5:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r2)
            throw r1
        Ldb:
            long r3 = r7.getValue()
            r1 = 0
        Le0:
            r5 = 4
            if (r1 >= r5) goto Lfc
            int r5 = r1 * 8
            long r5 = r3 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r7 = r17.read()
            long r7 = (long) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto Lf6
            int r1 = r1 + 1
            goto Le0
        Lf6:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r2)
            throw r1
        Lfc:
            return
        Lfd:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r2)
            throw r1
        L103:
            r2 = r4
            org.tukaani.xz.UnsupportedOptionsException r1 = new org.tukaani.xz.UnsupportedOptionsException     // Catch: java.io.EOFException -> L114
            java.lang.String r3 = "XZ Index has over 2147483647 Records"
            r1.<init>(r3)     // Catch: java.io.EOFException -> L114
            throw r1     // Catch: java.io.EOFException -> L114
        L10c:
            r2 = r4
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException     // Catch: java.io.EOFException -> L114
            r1.<init>(r2)     // Catch: java.io.EOFException -> L114
            throw r1     // Catch: java.io.EOFException -> L114
        L113:
            r2 = r4
        L114:
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r2)
            throw r1
        L11a:
            r2 = r4
            org.tukaani.xz.CorruptedInputException r1 = new org.tukaani.xz.CorruptedInputException
            r1.<init>(r2)
            throw r1
    }

    @Override // org.tukaani.xz.index.IndexBase
    public /* bridge */ /* synthetic */ long getIndexSize() {
            r2 = this;
            long r0 = super.getIndexSize()
            return r0
    }

    public long getLargestBlockSize() {
            r2 = this;
            long r0 = r2.largestBlockSize
            return r0
    }

    public int getMemoryUsage() {
            r1 = this;
            int r0 = r1.memoryUsage
            return r0
    }

    public int getRecordCount() {
            r2 = this;
            long r0 = r2.recordCount
            int r0 = (int) r0
            return r0
    }

    public org.tukaani.xz.common.StreamFlags getStreamFlags() {
            r1 = this;
            org.tukaani.xz.common.StreamFlags r0 = r1.streamFlags
            return r0
    }

    @Override // org.tukaani.xz.index.IndexBase
    public /* bridge */ /* synthetic */ long getStreamSize() {
            r2 = this;
            long r0 = super.getStreamSize()
            return r0
    }

    public long getUncompressedSize() {
            r2 = this;
            long r0 = r2.uncompressedSum
            return r0
    }

    public boolean hasRecord(int r8) {
            r7 = this;
            int r0 = r7.recordOffset
            if (r8 < r0) goto Lf
            long r1 = (long) r8
            long r3 = (long) r0
            long r5 = r7.recordCount
            long r3 = r3 + r5
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto Lf
            r8 = 1
            goto L10
        Lf:
            r8 = 0
        L10:
            return r8
    }

    public boolean hasUncompressedOffset(long r5) {
            r4 = this;
            long r0 = r4.uncompressedOffset
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto Lf
            long r2 = r4.uncompressedSum
            long r0 = r0 + r2
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            return r5
    }

    public void locateBlock(org.tukaani.xz.index.BlockInfo r7, long r8) {
            r6 = this;
            long r0 = r6.uncompressedOffset
            long r8 = r8 - r0
            long[] r0 = r6.unpadded
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 0
        L9:
            if (r1 >= r0) goto L1e
            int r2 = r0 - r1
            int r2 = r2 / 2
            int r2 = r2 + r1
            long[] r3 = r6.uncompressed
            r4 = r3[r2]
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 > 0) goto L1c
            int r2 = r2 + 1
            r1 = r2
            goto L9
        L1c:
            r0 = r2
            goto L9
        L1e:
            int r8 = r6.recordOffset
            int r8 = r8 + r1
            r6.setBlockInfo(r7, r8)
            return
    }

    public void setBlockInfo(org.tukaani.xz.index.BlockInfo r7, int r8) {
            r6 = this;
            r7.index = r6
            r7.blockNumber = r8
            int r0 = r6.recordOffset
            int r8 = r8 - r0
            if (r8 != 0) goto L10
            r0 = 0
            r7.compressedOffset = r0
            r7.uncompressedOffset = r0
            goto L24
        L10:
            long[] r0 = r6.unpadded
            int r1 = r8 + (-1)
            r2 = r0[r1]
            r4 = 3
            long r2 = r2 + r4
            r4 = -4
            long r2 = r2 & r4
            r7.compressedOffset = r2
            long[] r0 = r6.uncompressed
            r1 = r0[r1]
            r7.uncompressedOffset = r1
        L24:
            long[] r0 = r6.unpadded
            r1 = r0[r8]
            long r3 = r7.compressedOffset
            long r1 = r1 - r3
            r7.unpaddedSize = r1
            long[] r0 = r6.uncompressed
            r1 = r0[r8]
            long r3 = r7.uncompressedOffset
            long r1 = r1 - r3
            r7.uncompressedSize = r1
            long r0 = r7.compressedOffset
            long r2 = r6.compressedOffset
            r4 = 12
            long r2 = r2 + r4
            long r0 = r0 + r2
            r7.compressedOffset = r0
            long r0 = r7.uncompressedOffset
            long r2 = r6.uncompressedOffset
            long r0 = r0 + r2
            r7.uncompressedOffset = r0
            return
    }

    public void setOffsets(org.tukaani.xz.index.IndexDecoder r5) {
            r4 = this;
            int r0 = r5.recordOffset
            long r1 = r5.recordCount
            int r1 = (int) r1
            int r0 = r0 + r1
            r4.recordOffset = r0
            long r0 = r5.compressedOffset
            long r2 = r5.getStreamSize()
            long r0 = r0 + r2
            long r2 = r5.streamPadding
            long r0 = r0 + r2
            r4.compressedOffset = r0
            long r0 = r5.uncompressedOffset
            long r2 = r5.uncompressedSum
            long r0 = r0 + r2
            r4.uncompressedOffset = r0
            return
    }
}
