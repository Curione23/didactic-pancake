package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyOutputStream extends java.io.FilterOutputStream {
    public ProxyOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected void afterWrite(int r1) throws java.io.IOException {
            r0 = this;
            return
    }

    protected void beforeWrite(int r1) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            org.apache.commons.io.output.ProxyOutputStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.output.ProxyOutputStream$$ExternalSyntheticLambda0
            r1.<init>(r2)
            org.apache.commons.io.IOUtils.close(r0, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
            r0.flush()     // Catch: java.io.IOException -> L6
            goto La
        L6:
            r0 = move-exception
            r1.handleIOException(r0)
        La:
            return
    }

    protected void handleIOException(java.io.IOException r1) throws java.io.IOException {
            r0 = this;
            throw r1
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> Ld
            java.io.OutputStream r1 = r2.out     // Catch: java.io.IOException -> Ld
            r1.write(r3)     // Catch: java.io.IOException -> Ld
            r2.afterWrite(r0)     // Catch: java.io.IOException -> Ld
            goto L11
        Ld:
            r3 = move-exception
            r2.handleIOException(r3)
        L11:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = org.apache.commons.io.IOUtils.length(r3)     // Catch: java.io.IOException -> L10
            r2.beforeWrite(r0)     // Catch: java.io.IOException -> L10
            java.io.OutputStream r1 = r2.out     // Catch: java.io.IOException -> L10
            r1.write(r3)     // Catch: java.io.IOException -> L10
            r2.afterWrite(r0)     // Catch: java.io.IOException -> L10
            goto L14
        L10:
            r3 = move-exception
            r2.handleIOException(r3)
        L14:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            r1.beforeWrite(r4)     // Catch: java.io.IOException -> Lc
            java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> Lc
            r0.write(r2, r3, r4)     // Catch: java.io.IOException -> Lc
            r1.afterWrite(r4)     // Catch: java.io.IOException -> Lc
            goto L10
        Lc:
            r2 = move-exception
            r1.handleIOException(r2)
        L10:
            return
    }
}
