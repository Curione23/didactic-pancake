package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SeekableInputStream extends java.io.InputStream {
    public SeekableInputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract long length() throws java.io.IOException;

    public abstract long position() throws java.io.IOException;

    public abstract void seek(long r1) throws java.io.IOException;

    @Override // java.io.InputStream
    public long skip(long r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            long r2 = r7.length()
            long r4 = r7.position()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L14
            return r0
        L14:
            long r2 = r2 - r4
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L1a
            r8 = r2
        L1a:
            long r4 = r4 + r8
            r7.seek(r4)
            return r8
    }
}
