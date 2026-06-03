package org.apache.commons.compress.compressors.zstandard;

/* JADX INFO: loaded from: classes2.dex */
public class ZstdCompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private final org.apache.commons.io.input.BoundedInputStream countingStream;
    private final com.github.luben.zstd.ZstdInputStream decIS;

    public ZstdCompressorInputStream(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            com.github.luben.zstd.ZstdInputStream r0 = new com.github.luben.zstd.ZstdInputStream
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r1.setInputStream(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3
            org.apache.commons.io.input.BoundedInputStream r3 = r3.get()
            r2.countingStream = r3
            r0.<init>(r3)
            r2.decIS = r0
            return
    }

    public ZstdCompressorInputStream(java.io.InputStream r3, com.github.luben.zstd.BufferPool r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            com.github.luben.zstd.ZstdInputStream r0 = new com.github.luben.zstd.ZstdInputStream
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r1.setInputStream(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3
            org.apache.commons.io.input.BoundedInputStream r3 = r3.get()
            r2.countingStream = r3
            r0.<init>(r3, r4)
            r2.decIS = r0
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS
            r0.close()
            return
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r2.countingStream
            long r0 = r0.getCount()
            return r0
    }

    @Override // java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS     // Catch: java.lang.Throwable -> L8
            r0.mark(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            com.github.luben.zstd.ZstdInputStream r0 = r2.decIS
            int r0 = r0.read()
            r1 = -1
            if (r0 != r1) goto Lb
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            r2.count(r1)
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r4 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS
            int r2 = r0.read(r2, r3, r4)
            r1.count(r2)
            return r2
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS     // Catch: java.lang.Throwable -> L8
            r0.reset()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS
            long r2 = org.apache.commons.io.IOUtils.skip(r0, r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            com.github.luben.zstd.ZstdInputStream r0 = r1.decIS
            java.lang.String r0 = r0.toString()
            return r0
    }
}
