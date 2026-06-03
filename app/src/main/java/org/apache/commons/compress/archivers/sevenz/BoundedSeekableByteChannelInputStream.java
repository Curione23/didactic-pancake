package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class BoundedSeekableByteChannelInputStream extends java.io.InputStream {
    private static final int MAX_BUF_LEN = 8192;
    private final java.nio.ByteBuffer buffer;
    private long bytesRemaining;
    private final java.nio.channels.SeekableByteChannel channel;

    BoundedSeekableByteChannelInputStream(java.nio.channels.SeekableByteChannel r3, long r4) {
            r2 = this;
            r2.<init>()
            r2.channel = r3
            r2.bytesRemaining = r4
            r0 = 8192(0x2000, double:4.0474E-320)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L15
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L15
            int r3 = (int) r4
            goto L17
        L15:
            r3 = 8192(0x2000, float:1.148E-41)
        L17:
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r2.buffer = r3
            return
    }

    private int read(int r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            java.nio.Buffer r0 = r0.rewind()
            r0.limit(r2)
            java.nio.channels.SeekableByteChannel r2 = r1.channel
            java.nio.ByteBuffer r0 = r1.buffer
            int r2 = r2.read(r0)
            java.nio.ByteBuffer r0 = r1.buffer
            r0.flip()
            return r2
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
            long r0 = r4.bytesRemaining
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1
            long r0 = r0 - r2
            r4.bytesRemaining = r0
            r0 = 1
            int r0 = r4.read(r0)
            if (r0 >= 0) goto L15
            return r0
        L15:
            java.nio.ByteBuffer r0 = r4.buffer
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L1e:
            r0 = -1
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            if (r7 != 0) goto L4
            r5 = 0
            return r5
        L4:
            long r0 = r4.bytesRemaining
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Le
            r5 = -1
            return r5
        Le:
            long r2 = (long) r7
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L14
            int r7 = (int) r0
        L14:
            java.nio.ByteBuffer r0 = r4.buffer
            int r0 = r0.capacity()
            if (r7 > r0) goto L23
            java.nio.ByteBuffer r0 = r4.buffer
            int r7 = r4.read(r7)
            goto L30
        L23:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r7)
            java.nio.channels.SeekableByteChannel r7 = r4.channel
            int r7 = r7.read(r0)
            r0.flip()
        L30:
            if (r7 < 0) goto L3b
            r0.get(r5, r6, r7)
            long r5 = r4.bytesRemaining
            long r0 = (long) r7
            long r5 = r5 - r0
            r4.bytesRemaining = r5
        L3b:
            return r7
    }
}
