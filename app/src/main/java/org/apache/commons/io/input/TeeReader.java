package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class TeeReader extends org.apache.commons.io.input.ProxyReader {
    private final java.io.Writer branch;
    private final boolean closeBranch;

    public TeeReader(java.io.Reader r2, java.io.Writer r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TeeReader(java.io.Reader r1, java.io.Writer r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.branch = r2
            r0.closeBranch = r3
            return
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            super.close()     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r2.closeBranch
            if (r0 == 0) goto Lc
            java.io.Writer r0 = r2.branch
            r0.close()
        Lc:
            return
        Ld:
            r0 = move-exception
            boolean r1 = r2.closeBranch
            if (r1 == 0) goto L17
            java.io.Writer r1 = r2.branch
            r1.close()
        L17:
            throw r0
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read() throws java.io.IOException {
            r2 = this;
            int r0 = super.read()
            r1 = -1
            if (r0 == r1) goto Lc
            java.io.Writer r1 = r2.branch
            r1.write(r0)
        Lc:
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader, java.lang.Readable
    public int read(java.nio.CharBuffer r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.position()
            int r1 = super.read(r5)
            r2 = -1
            if (r1 == r2) goto L30
            int r2 = r5.position()
            int r3 = r5.limit()
            java.nio.Buffer r0 = r5.position(r0)     // Catch: java.lang.Throwable -> L27
            r0.limit(r2)     // Catch: java.lang.Throwable -> L27
            java.io.Writer r0 = r4.branch     // Catch: java.lang.Throwable -> L27
            r0.append(r5)     // Catch: java.lang.Throwable -> L27
            java.nio.Buffer r5 = r5.position(r2)
            r5.limit(r3)
            goto L30
        L27:
            r0 = move-exception
            java.nio.Buffer r5 = r5.position(r2)
            r5.limit(r3)
            throw r0
        L30:
            return r1
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader
    public int read(char[] r4) throws java.io.IOException {
            r3 = this;
            int r0 = super.read(r4)
            r1 = -1
            if (r0 == r1) goto Ld
            java.io.Writer r1 = r3.branch
            r2 = 0
            r1.write(r4, r2, r0)
        Ld:
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read(char[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r4 = super.read(r2, r3, r4)
            r0 = -1
            if (r4 == r0) goto Lc
            java.io.Writer r0 = r1.branch
            r0.write(r2, r3, r4)
        Lc:
            return r4
    }
}
