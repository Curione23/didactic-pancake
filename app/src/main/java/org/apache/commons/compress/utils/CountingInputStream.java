package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CountingInputStream extends java.io.FilterInputStream {
    private long bytesRead;

    public CountingInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected final void count(long r3) {
            r2 = this;
            r0 = -1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            long r0 = r2.bytesRead
            long r0 = r0 + r3
            r2.bytesRead = r0
        Lb:
            return
    }

    public long getBytesRead() {
            r2 = this;
            long r0 = r2.bytesRead
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            int r0 = r0.read()
            if (r0 < 0) goto Ld
            r1 = 1
            r3.count(r1)
        Ld:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r4 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.io.InputStream r0 = r1.in
            int r2 = r0.read(r2, r3, r4)
            if (r2 < 0) goto L10
            long r3 = (long) r2
            r1.count(r3)
        L10:
            return r2
    }
}
