package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
class InflaterInputStreamWithStatistics extends java.util.zip.InflaterInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private long compressedCount;
    private long uncompressedCount;

    InflaterInputStreamWithStatistics(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    InflaterInputStreamWithStatistics(java.io.InputStream r1, java.util.zip.Inflater r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    InflaterInputStreamWithStatistics(java.io.InputStream r1, java.util.zip.Inflater r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // java.util.zip.InflaterInputStream
    protected void fill() throws java.io.IOException {
            r4 = this;
            super.fill()
            long r0 = r4.compressedCount
            java.util.zip.Inflater r2 = r4.inf
            int r2 = r2.getRemaining()
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.compressedCount = r0
            return
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            long r0 = r2.compressedCount
            return r0
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getUncompressedCount() {
            r2 = this;
            long r0 = r2.uncompressedCount
            return r0
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r5 = this;
            int r0 = super.read()
            r1 = -1
            if (r0 <= r1) goto Le
            long r1 = r5.uncompressedCount
            r3 = 1
            long r1 = r1 + r3
            r5.uncompressedCount = r1
        Le:
            return r0
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r3 = super.read(r3, r4, r5)
            r4 = -1
            if (r3 <= r4) goto Ld
            long r4 = r2.uncompressedCount
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.uncompressedCount = r4
        Ld:
            return r3
    }
}
