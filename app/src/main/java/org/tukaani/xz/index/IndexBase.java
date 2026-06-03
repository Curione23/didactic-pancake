package org.tukaani.xz.index;

/* JADX INFO: loaded from: classes2.dex */
abstract class IndexBase {
    long blocksSum;
    long indexListSize;
    private final org.tukaani.xz.XZIOException invalidIndexException;
    long recordCount;
    long uncompressedSum;

    IndexBase(org.tukaani.xz.XZIOException r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.blocksSum = r0
            r2.uncompressedSum = r0
            r2.indexListSize = r0
            r2.recordCount = r0
            r2.invalidIndexException = r3
            return
    }

    private long getUnpaddedIndexSize() {
            r4 = this;
            long r0 = r4.recordCount
            int r0 = org.tukaani.xz.common.Util.getVLISize(r0)
            int r0 = r0 + 1
            long r0 = (long) r0
            long r2 = r4.indexListSize
            long r0 = r0 + r2
            r2 = 4
            long r0 = r0 + r2
            return r0
    }

    void add(long r7, long r9) throws org.tukaani.xz.XZIOException {
            r6 = this;
            long r0 = r6.blocksSum
            r2 = 3
            long r2 = r2 + r7
            r4 = -4
            long r2 = r2 & r4
            long r0 = r0 + r2
            r6.blocksSum = r0
            long r0 = r6.uncompressedSum
            long r0 = r0 + r9
            r6.uncompressedSum = r0
            long r0 = r6.indexListSize
            int r7 = org.tukaani.xz.common.Util.getVLISize(r7)
            int r8 = org.tukaani.xz.common.Util.getVLISize(r9)
            int r7 = r7 + r8
            long r7 = (long) r7
            long r0 = r0 + r7
            r6.indexListSize = r0
            long r7 = r6.recordCount
            r9 = 1
            long r7 = r7 + r9
            r6.recordCount = r7
            long r7 = r6.blocksSum
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L4a
            long r7 = r6.uncompressedSum
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L4a
            long r7 = r6.getIndexSize()
            r0 = 17179869184(0x400000000, double:8.487983164E-314)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L4a
            long r7 = r6.getStreamSize()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L4a
            return
        L4a:
            org.tukaani.xz.XZIOException r7 = r6.invalidIndexException
            throw r7
    }

    int getIndexPaddingSize() {
            r4 = this;
            r0 = 4
            long r2 = r4.getUnpaddedIndexSize()
            long r0 = r0 - r2
            r2 = 3
            long r0 = r0 & r2
            int r0 = (int) r0
            return r0
    }

    public long getIndexSize() {
            r4 = this;
            long r0 = r4.getUnpaddedIndexSize()
            r2 = 3
            long r0 = r0 + r2
            r2 = -4
            long r0 = r0 & r2
            return r0
    }

    public long getStreamSize() {
            r6 = this;
            long r0 = r6.blocksSum
            r2 = 12
            long r0 = r0 + r2
            long r4 = r6.getIndexSize()
            long r0 = r0 + r4
            long r0 = r0 + r2
            return r0
    }
}
