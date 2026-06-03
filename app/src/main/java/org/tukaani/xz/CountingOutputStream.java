package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class CountingOutputStream extends org.tukaani.xz.FinishableOutputStream {
    private final java.io.OutputStream out;
    private long size;

    public CountingOutputStream(java.io.OutputStream r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.size = r0
            r2.out = r3
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

    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r5) throws java.io.IOException {
            r4 = this;
            java.io.OutputStream r0 = r4.out
            r0.write(r5)
            long r0 = r4.size
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L12
            r2 = 1
            long r0 = r0 + r2
            r4.size = r0
        L12:
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r0.write(r3, r4, r5)
            long r3 = r2.size
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.size = r3
        L11:
            return
    }
}
