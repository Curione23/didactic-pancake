package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ChecksumVerifyingInputStream extends java.util.zip.CheckedInputStream {
    private final long expected;
    private long remaining;

    public ChecksumVerifyingInputStream(java.util.zip.Checksum r1, java.io.InputStream r2, long r3, long r5) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.expected = r5
            r0.remaining = r3
            return
    }

    private void verify() throws java.io.IOException {
            r4 = this;
            long r0 = r4.remaining
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1f
            long r0 = r4.expected
            java.util.zip.Checksum r2 = r4.getChecksum()
            long r2 = r2.getValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            goto L1f
        L17:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Checksum verification failed"
            r0.<init>(r1)
            throw r0
        L1f:
            return
    }

    public long getBytesRemaining() {
            r2 = this;
            long r0 = r2.remaining
            return r0
    }

    @Override // java.util.zip.CheckedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r5 = this;
            long r0 = r5.remaining
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto La
            r0 = -1
            return r0
        La:
            int r0 = super.read()
            if (r0 < 0) goto L17
            long r1 = r5.remaining
            r3 = 1
            long r1 = r1 - r3
            r5.remaining = r1
        L17:
            r5.verify()
            return r0
    }

    @Override // java.util.zip.CheckedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r3 = super.read(r3, r4, r5)
            if (r3 < 0) goto L10
            long r4 = r2.remaining
            long r0 = (long) r3
            long r4 = r4 - r0
            r2.remaining = r4
        L10:
            r2.verify()
            return r3
    }
}
