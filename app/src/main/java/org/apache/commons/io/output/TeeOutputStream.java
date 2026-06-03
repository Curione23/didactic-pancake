package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class TeeOutputStream extends org.apache.commons.io.output.ProxyOutputStream {
    protected java.io.OutputStream branch;

    public TeeOutputStream(java.io.OutputStream r1, java.io.OutputStream r2) {
            r0 = this;
            r0.<init>(r1)
            r0.branch = r2
            return
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            super.close()     // Catch: java.lang.Throwable -> L9
            java.io.OutputStream r0 = r2.branch
            r0.close()
            return
        L9:
            r0 = move-exception
            java.io.OutputStream r1 = r2.branch
            r1.close()
            throw r0
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            super.flush()
            java.io.OutputStream r0 = r1.branch
            r0.flush()
            return
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            super.write(r2)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r0 = r1.branch     // Catch: java.lang.Throwable -> Lb
            r0.write(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            super.write(r2)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r0 = r1.branch     // Catch: java.lang.Throwable -> Lb
            r0.write(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            super.write(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r0 = r1.branch     // Catch: java.lang.Throwable -> Lb
            r0.write(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
