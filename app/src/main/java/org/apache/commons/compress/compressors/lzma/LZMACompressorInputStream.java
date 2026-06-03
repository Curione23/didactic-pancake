package org.apache.commons.compress.compressors.lzma;

/* JADX INFO: loaded from: classes2.dex */
public class LZMACompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private final org.apache.commons.io.input.BoundedInputStream countingStream;
    private final java.io.InputStream in;

    public LZMACompressorInputStream(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            org.tukaani.xz.LZMAInputStream r0 = new org.tukaani.xz.LZMAInputStream
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r1.setInputStream(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3
            org.apache.commons.io.input.BoundedInputStream r3 = r3.get()
            r2.countingStream = r3
            r1 = -1
            r0.<init>(r3, r1)
            r2.in = r0
            return
    }

    public LZMACompressorInputStream(java.io.InputStream r4, int r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            org.tukaani.xz.LZMAInputStream r0 = new org.tukaani.xz.LZMAInputStream     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            org.apache.commons.io.build.AbstractOriginSupplier r4 = r1.setInputStream(r4)     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            org.apache.commons.io.input.BoundedInputStream$Builder r4 = (org.apache.commons.io.input.BoundedInputStream.Builder) r4     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            org.apache.commons.io.input.BoundedInputStream r4 = r4.get()     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            r3.countingStream = r4     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            r0.<init>(r4, r5)     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            r3.in = r0     // Catch: org.tukaani.xz.MemoryLimitException -> L1b
            return
        L1b:
            r4 = move-exception
            org.apache.commons.compress.MemoryLimitException r5 = new org.apache.commons.compress.MemoryLimitException
            int r0 = r4.getMemoryNeeded()
            long r0 = (long) r0
            int r2 = r4.getMemoryLimit()
            r5.<init>(r0, r2, r4)
            throw r5
    }

    public static boolean matches(byte[] r2, int r3) {
            r0 = 0
            if (r2 == 0) goto L17
            r1 = 3
            if (r3 < r1) goto L17
            r3 = r2[r0]
            r1 = 93
            if (r3 != r1) goto L17
            r3 = 1
            r1 = r2[r3]
            if (r1 != 0) goto L17
            r1 = 2
            r2 = r2[r1]
            if (r2 != 0) goto L17
            r0 = r3
        L17:
            return r0
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
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
    public int read() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
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
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r2 = r0.read(r2, r3, r4)
            r1.count(r2)
            return r2
    }

    @Override // java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            long r2 = org.apache.commons.io.IOUtils.skip(r0, r2)
            return r2
    }
}
