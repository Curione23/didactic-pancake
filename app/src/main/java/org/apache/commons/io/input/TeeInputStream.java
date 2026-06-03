package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class TeeInputStream extends org.apache.commons.io.input.ProxyInputStream {
    private final java.io.OutputStream branch;
    private final boolean closeBranch;

    public TeeInputStream(java.io.InputStream r2, java.io.OutputStream r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TeeInputStream(java.io.InputStream r1, java.io.OutputStream r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.branch = r2
            r0.closeBranch = r3
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            super.close()     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r2.closeBranch
            if (r0 == 0) goto Lc
            java.io.OutputStream r0 = r2.branch
            r0.close()
        Lc:
            return
        Ld:
            r0 = move-exception
            boolean r1 = r2.closeBranch
            if (r1 == 0) goto L17
            java.io.OutputStream r1 = r2.branch
            r1.close()
        L17:
            throw r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            int r0 = super.read()
            r1 = -1
            if (r0 == r1) goto Lc
            java.io.OutputStream r1 = r2.branch
            r1.write(r0)
        Lc:
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r4) throws java.io.IOException {
            r3 = this;
            int r0 = super.read(r4)
            r1 = -1
            if (r0 == r1) goto Ld
            java.io.OutputStream r1 = r3.branch
            r2 = 0
            r1.write(r4, r2, r0)
        Ld:
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r4 = super.read(r2, r3, r4)
            r0 = -1
            if (r4 == r0) goto Lc
            java.io.OutputStream r0 = r1.branch
            r0.write(r2, r3, r4)
        Lc:
            return r4
    }
}
