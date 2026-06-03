package org.tukaani.xz.index;

/* JADX INFO: loaded from: classes2.dex */
public class BlockInfo {
    public int blockNumber;
    public long compressedOffset;
    org.tukaani.xz.index.IndexDecoder index;
    public long uncompressedOffset;
    public long uncompressedSize;
    public long unpaddedSize;

    public BlockInfo(org.tukaani.xz.index.IndexDecoder r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.blockNumber = r0
            r0 = -1
            r2.compressedOffset = r0
            r2.uncompressedOffset = r0
            r2.unpaddedSize = r0
            r2.uncompressedSize = r0
            r2.index = r3
            return
    }

    public int getCheckType() {
            r1 = this;
            org.tukaani.xz.index.IndexDecoder r0 = r1.index
            org.tukaani.xz.common.StreamFlags r0 = r0.getStreamFlags()
            int r0 = r0.checkType
            return r0
    }

    public boolean hasNext() {
            r2 = this;
            org.tukaani.xz.index.IndexDecoder r0 = r2.index
            int r1 = r2.blockNumber
            int r1 = r1 + 1
            boolean r0 = r0.hasRecord(r1)
            return r0
    }

    public void setNext() {
            r2 = this;
            org.tukaani.xz.index.IndexDecoder r0 = r2.index
            int r1 = r2.blockNumber
            int r1 = r1 + 1
            r0.setBlockInfo(r2, r1)
            return
    }
}
