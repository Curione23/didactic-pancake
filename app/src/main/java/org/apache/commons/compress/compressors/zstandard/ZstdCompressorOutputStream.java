package org.apache.commons.compress.compressors.zstandard;

/* JADX INFO: loaded from: classes2.dex */
public class ZstdCompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<com.github.luben.zstd.ZstdOutputStream> {
    public ZstdCompressorOutputStream(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            com.github.luben.zstd.ZstdOutputStream r0 = new com.github.luben.zstd.ZstdOutputStream
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public ZstdCompressorOutputStream(java.io.OutputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            com.github.luben.zstd.ZstdOutputStream r0 = new com.github.luben.zstd.ZstdOutputStream
            r0.<init>(r2, r3)
            r1.<init>(r0)
            return
    }

    public ZstdCompressorOutputStream(java.io.OutputStream r2, int r3, boolean r4) throws java.io.IOException {
            r1 = this;
            com.github.luben.zstd.ZstdOutputStream r0 = new com.github.luben.zstd.ZstdOutputStream
            r0.<init>(r2, r3)
            r1.<init>(r0)
            java.io.OutputStream r2 = r1.out()
            com.github.luben.zstd.ZstdOutputStream r2 = (com.github.luben.zstd.ZstdOutputStream) r2
            r2.setCloseFrameOnFlush(r4)
            return
    }

    public ZstdCompressorOutputStream(java.io.OutputStream r2, int r3, boolean r4, boolean r5) throws java.io.IOException {
            r1 = this;
            com.github.luben.zstd.ZstdOutputStream r0 = new com.github.luben.zstd.ZstdOutputStream
            r0.<init>(r2, r3)
            r1.<init>(r0)
            java.io.OutputStream r2 = r1.out()
            com.github.luben.zstd.ZstdOutputStream r2 = (com.github.luben.zstd.ZstdOutputStream) r2
            com.github.luben.zstd.ZstdOutputStream r2 = r2.setCloseFrameOnFlush(r4)
            r2.setChecksum(r5)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2, r3, r4)
            return
    }
}
