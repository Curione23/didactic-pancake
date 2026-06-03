package org.apache.commons.compress.compressors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CompressorInputStream extends java.io.InputStream {
    private long bytesRead;

    public CompressorInputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    protected void count(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.count(r0)
            return
    }

    protected void count(long r3) {
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

    @java.lang.Deprecated
    public int getCount() {
            r2 = this;
            long r0 = r2.bytesRead
            int r0 = (int) r0
            return r0
    }

    public long getUncompressedCount() {
            r2 = this;
            long r0 = r2.getBytesRead()
            return r0
    }

    protected void pushedBackBytes(long r3) {
            r2 = this;
            long r0 = r2.bytesRead
            long r0 = r0 - r3
            r2.bytesRead = r0
            return
    }
}
