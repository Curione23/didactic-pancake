package org.apache.commons.compress.compressors.xz;

/* JADX INFO: loaded from: classes2.dex */
public class XZCompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private final org.apache.commons.io.input.BoundedInputStream countingStream;
    private final java.io.InputStream in;

    public XZCompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public XZCompressorInputStream(java.io.InputStream r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r0)
            return
    }

    public XZCompressorInputStream(java.io.InputStream r2, boolean r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r2 = r0.setInputStream(r2)
            org.apache.commons.io.input.BoundedInputStream$Builder r2 = (org.apache.commons.io.input.BoundedInputStream.Builder) r2
            org.apache.commons.io.input.BoundedInputStream r2 = r2.get()
            r1.countingStream = r2
            if (r3 == 0) goto L1d
            org.tukaani.xz.XZInputStream r3 = new org.tukaani.xz.XZInputStream
            r3.<init>(r2, r4)
            r1.in = r3
            goto L24
        L1d:
            org.tukaani.xz.SingleXZInputStream r3 = new org.tukaani.xz.SingleXZInputStream
            r3.<init>(r2, r4)
            r1.in = r3
        L24:
            return
    }

    public static boolean matches(byte[] r3, int r4) {
            byte[] r0 = org.tukaani.xz.XZ.HEADER_MAGIC
            int r0 = r0.length
            r1 = 0
            if (r4 >= r0) goto L7
            return r1
        L7:
            r4 = r1
        L8:
            byte[] r0 = org.tukaani.xz.XZ.HEADER_MAGIC
            int r0 = r0.length
            if (r4 >= r0) goto L19
            r0 = r3[r4]
            byte[] r2 = org.tukaani.xz.XZ.HEADER_MAGIC
            r2 = r2[r4]
            if (r0 == r2) goto L16
            return r1
        L16:
            int r4 = r4 + 1
            goto L8
        L19:
            r3 = 1
            return r3
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
            r5 = this;
            java.io.InputStream r0 = r5.in     // Catch: org.tukaani.xz.MemoryLimitException -> Lf
            int r0 = r0.read()     // Catch: org.tukaani.xz.MemoryLimitException -> Lf
            r1 = -1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 1
        Lb:
            r5.count(r1)     // Catch: org.tukaani.xz.MemoryLimitException -> Lf
            return r0
        Lf:
            r0 = move-exception
            org.apache.commons.compress.MemoryLimitException r1 = new org.apache.commons.compress.MemoryLimitException
            int r2 = r0.getMemoryNeeded()
            long r2 = (long) r2
            int r4 = r0.getMemoryLimit()
            r1.<init>(r2, r4, r0)
            throw r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.InputStream r0 = r2.in     // Catch: org.tukaani.xz.MemoryLimitException -> Le
            int r3 = r0.read(r3, r4, r5)     // Catch: org.tukaani.xz.MemoryLimitException -> Le
            r2.count(r3)     // Catch: org.tukaani.xz.MemoryLimitException -> Le
            return r3
        Le:
            r3 = move-exception
            org.apache.commons.compress.MemoryLimitException r4 = new org.apache.commons.compress.MemoryLimitException
            int r5 = r3.getMemoryNeeded()
            long r0 = (long) r5
            int r5 = r3.getMemoryLimit()
            r4.<init>(r0, r5, r3)
            throw r4
    }

    @Override // java.io.InputStream
    public long skip(long r4) throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in     // Catch: org.tukaani.xz.MemoryLimitException -> L7
            long r4 = org.apache.commons.io.IOUtils.skip(r0, r4)     // Catch: org.tukaani.xz.MemoryLimitException -> L7
            return r4
        L7:
            r4 = move-exception
            org.apache.commons.compress.MemoryLimitException r5 = new org.apache.commons.compress.MemoryLimitException
            int r0 = r4.getMemoryNeeded()
            long r0 = (long) r0
            int r2 = r4.getMemoryLimit()
            r5.<init>(r0, r2, r4)
            throw r5
    }
}
