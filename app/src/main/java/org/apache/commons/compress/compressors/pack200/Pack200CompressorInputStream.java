package org.apache.commons.compress.compressors.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class Pack200CompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream {
    private static final byte[] CAFE_DOOD = null;
    private static final int SIG_LENGTH = 0;
    private final org.apache.commons.compress.compressors.pack200.AbstractStreamBridge abstractStreamBridge;
    private final java.io.InputStream originalInputStream;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x000c: FILL_ARRAY_DATA , data: [-54, -2, -48, 13} // fill-array
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.CAFE_DOOD = r0
            int r0 = r0.length
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.SIG_LENGTH = r0
            return
    }

    public Pack200CompressorInputStream(java.io.File r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.pack200.Pack200Strategy r0 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.IN_MEMORY
            r1.<init>(r2, r0)
            return
    }

    public Pack200CompressorInputStream(java.io.File r2, java.util.Map<java.lang.String, java.lang.String> r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.pack200.Pack200Strategy r0 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.IN_MEMORY
            r1.<init>(r2, r0, r3)
            return
    }

    public Pack200CompressorInputStream(java.io.File r2, org.apache.commons.compress.compressors.pack200.Pack200Strategy r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3, r0)
            return
    }

    public Pack200CompressorInputStream(java.io.File r2, org.apache.commons.compress.compressors.pack200.Pack200Strategy r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public Pack200CompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.pack200.Pack200Strategy r0 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.IN_MEMORY
            r1.<init>(r2, r0)
            return
    }

    private Pack200CompressorInputStream(java.io.InputStream r3, java.io.File r4, org.apache.commons.compress.compressors.pack200.Pack200Strategy r5, java.util.Map<java.lang.String, java.lang.String> r6) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r2.originalInputStream = r3
            org.apache.commons.compress.compressors.pack200.AbstractStreamBridge r5 = r5.newStreamBridge()
            r2.abstractStreamBridge = r5
            java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream
            r0.<init>(r5)
            org.apache.commons.compress.java.util.jar.Pack200$Unpacker r5 = org.apache.commons.compress.java.util.jar.Pack200.newUnpacker()     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L1d
            java.util.SortedMap r1 = r5.properties()     // Catch: java.lang.Throwable -> L2a
            r1.putAll(r6)     // Catch: java.lang.Throwable -> L2a
        L1d:
            if (r4 != 0) goto L23
            r5.unpack(r3, r0)     // Catch: java.lang.Throwable -> L2a
            goto L26
        L23:
            r5.unpack(r4, r0)     // Catch: java.lang.Throwable -> L2a
        L26:
            r0.close()
            return
        L2a:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r4 = move-exception
            r3.addSuppressed(r4)
        L33:
            throw r3
    }

    public Pack200CompressorInputStream(java.io.InputStream r2, java.util.Map<java.lang.String, java.lang.String> r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.pack200.Pack200Strategy r0 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.IN_MEMORY
            r1.<init>(r2, r0, r3)
            return
    }

    public Pack200CompressorInputStream(java.io.InputStream r2, org.apache.commons.compress.compressors.pack200.Pack200Strategy r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r0)
            return
    }

    public Pack200CompressorInputStream(java.io.InputStream r2, org.apache.commons.compress.compressors.pack200.Pack200Strategy r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r4)
            return
    }

    private java.io.InputStream getInputStream() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.pack200.AbstractStreamBridge r0 = r1.abstractStreamBridge
            java.io.InputStream r0 = r0.getInputStream()
            return r0
    }

    public static boolean matches(byte[] r3, int r4) {
            int r0 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.SIG_LENGTH
            r1 = 0
            if (r4 >= r0) goto L6
            return r1
        L6:
            r4 = r1
        L7:
            int r0 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.SIG_LENGTH
            if (r4 >= r0) goto L17
            r0 = r3[r4]
            byte[] r2 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.CAFE_DOOD
            r2 = r2[r4]
            if (r0 == r2) goto L14
            return r1
        L14:
            int r4 = r4 + 1
            goto L7
        L17:
            r3 = 1
            return r3
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.getInputStream()
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.compressors.pack200.AbstractStreamBridge r0 = r2.abstractStreamBridge     // Catch: java.lang.Throwable -> Ld
            r0.stop()     // Catch: java.lang.Throwable -> Ld
            java.io.InputStream r0 = r2.originalInputStream
            if (r0 == 0) goto Lc
            r0.close()
        Lc:
            return
        Ld:
            r0 = move-exception
            java.io.InputStream r1 = r2.originalInputStream
            if (r1 == 0) goto L15
            r1.close()
        L15:
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized void mark(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.lang.Throwable -> La java.io.IOException -> Lc
            r0.mark(r2)     // Catch: java.lang.Throwable -> La java.io.IOException -> Lc
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            goto L13
        Lc:
            r2 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException     // Catch: java.lang.Throwable -> La
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La
            throw r0     // Catch: java.lang.Throwable -> La
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L9
            boolean r0 = r0.markSupported()     // Catch: java.io.IOException -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.getInputStream()
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.getInputStream()
            int r2 = r0.read(r2)
            return r2
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.getInputStream()
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.lang.Throwable -> La
            r0.reset()     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.getInputStream()
            long r2 = org.apache.commons.io.IOUtils.skip(r0, r2)
            return r2
    }
}
