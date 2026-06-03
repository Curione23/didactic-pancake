package org.apache.commons.compress.parallel;

/* JADX INFO: loaded from: classes2.dex */
public class FileBasedScatterGatherBackingStore implements org.apache.commons.compress.parallel.ScatterGatherBackingStore {
    private boolean closed;
    private final java.io.OutputStream outputStream;
    private final java.nio.file.Path target;

    public FileBasedScatterGatherBackingStore(java.io.File r1) throws java.io.FileNotFoundException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1)
            return
    }

    public FileBasedScatterGatherBackingStore(java.nio.file.Path r2) throws java.io.FileNotFoundException {
            r1 = this;
            r1.<init>()
            r1.target = r2
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]     // Catch: java.io.IOException -> Lf java.io.FileNotFoundException -> L16
            java.io.OutputStream r2 = java.nio.file.Files.newOutputStream(r2, r0)     // Catch: java.io.IOException -> Lf java.io.FileNotFoundException -> L16
            r1.outputStream = r2     // Catch: java.io.IOException -> Lf java.io.FileNotFoundException -> L16
            return
        Lf:
            r2 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r2)
            throw r0
        L16:
            r2 = move-exception
            throw r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r2.closeForWriting()     // Catch: java.lang.Throwable -> L9
            java.nio.file.Path r0 = r2.target
            java.nio.file.Files.deleteIfExists(r0)
            return
        L9:
            r0 = move-exception
            java.nio.file.Path r1 = r2.target
            java.nio.file.Files.deleteIfExists(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStore
    public void closeForWriting() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Lc
            java.io.OutputStream r0 = r1.outputStream
            r0.close()
            r0 = 1
            r1.closed = r0
        Lc:
            return
    }

    @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStore
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r2 = this;
            java.nio.file.Path r0 = r2.target
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)
            return r0
    }

    @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStore
    public void writeOut(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.outputStream
            r0.write(r2, r3, r4)
            return
    }
}
