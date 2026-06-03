package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class CountingInputStream extends org.tukaani.xz.CloseIgnoringInputStream {
    private long size;

    public CountingInputStream(java.io.InputStream r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.size = r0
            return
    }

    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r5 = this;
            java.io.InputStream r0 = r5.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L16
            long r1 = r5.size
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L16
            r3 = 1
            long r1 = r1 + r3
            r5.size = r1
        L16:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            int r3 = r0.read(r3, r4, r5)
            if (r3 <= 0) goto L14
            long r4 = r2.size
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L14
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.size = r4
        L14:
            return r3
    }
}
