package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CountingOutputStream extends java.io.FilterOutputStream {
    private long bytesWritten;

    public CountingOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected void count(long r3) {
            r2 = this;
            r0 = -1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            long r0 = r2.bytesWritten
            long r0 = r0 + r3
            r2.bytesWritten = r0
        Lb:
            return
    }

    public long getBytesWritten() {
            r2 = this;
            long r0 = r2.bytesWritten
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r0.write(r3)
            r0 = 1
            r2.count(r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2, r3, r4)
            long r2 = (long) r4
            r1.count(r2)
            return
    }
}
