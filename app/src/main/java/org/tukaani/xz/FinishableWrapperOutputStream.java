package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class FinishableWrapperOutputStream extends org.tukaani.xz.FinishableOutputStream {
    protected java.io.OutputStream out;

    public FinishableWrapperOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            r0.out = r1
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2, r3, r4)
            return
    }
}
