package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class SeekableInMemoryByteChannel implements java.nio.channels.SeekableByteChannel {
    private static final int NAIVE_RESIZE_LIMIT = 1073741823;
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private byte[] data;
    private int position;
    private int size;

    public SeekableInMemoryByteChannel() {
            r1 = this;
            byte[] r0 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
            r1.<init>(r0)
            return
    }

    public SeekableInMemoryByteChannel(int r1) {
            r0 = this;
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            return
    }

    public SeekableInMemoryByteChannel(byte[] r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.closed = r0
            r1.data = r2
            int r2 = r2.length
            r1.size = r2
            return
    }

    private void ensureOpen() throws java.nio.channels.ClosedChannelException {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L7
            return
        L7:
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
            r0.<init>()
            throw r0
    }

    private void resize(int r3) {
            r2 = this;
            byte[] r0 = r2.data
            int r0 = r0.length
            if (r0 > 0) goto L6
            r0 = 1
        L6:
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r3 >= r1) goto L11
        Lb:
            if (r0 >= r3) goto L10
            int r0 = r0 << 1
            goto Lb
        L10:
            r3 = r0
        L11:
            byte[] r0 = r2.data
            byte[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.data = r3
            return
    }

    public byte[] array() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.closed
            r1 = 1
            r0.set(r1)
            return
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.closed
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            return r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() {
            r2 = this;
            int r0 = r2.position
            long r0 = (long) r0
            return r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel position(long r3) throws java.io.IOException {
            r2 = this;
            r2.ensureOpen()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L14
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L14
            int r3 = (int) r3
            r2.position = r3
            return r2
        L14:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Position has to be in range 0.. 2147483647"
            r3.<init>(r4)
            throw r3
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            r3.ensureOpen()
            int r0 = r4.remaining()
            int r1 = r3.size
            int r2 = r3.position
            int r1 = r1 - r2
            if (r1 > 0) goto L10
            r4 = -1
            return r4
        L10:
            if (r0 <= r1) goto L13
            r0 = r1
        L13:
            byte[] r1 = r3.data
            r4.put(r1, r2, r0)
            int r4 = r3.position
            int r4 = r4 + r0
            r3.position = r4
            return r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() {
            r2 = this;
            int r0 = r2.size
            long r0 = (long) r0
            return r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel truncate(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L22
            int r0 = r2.size
            long r0 = (long) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L17
            int r0 = (int) r3
            r2.size = r0
        L17:
            int r0 = r2.position
            long r0 = (long) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L21
            int r3 = (int) r3
            r2.position = r3
        L21:
            return r2
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Size has to be in range 0.. 2147483647"
            r3.<init>(r4)
            throw r3
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            r3.ensureOpen()
            int r0 = r4.remaining()
            int r1 = r3.size
            int r2 = r3.position
            int r1 = r1 - r2
            if (r0 <= r1) goto L1e
            int r2 = r2 + r0
            if (r2 >= 0) goto L1b
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.resize(r0)
            int r1 = r3.position
            int r0 = r0 - r1
            goto L1e
        L1b:
            r3.resize(r2)
        L1e:
            byte[] r1 = r3.data
            int r2 = r3.position
            r4.get(r1, r2, r0)
            int r4 = r3.position
            int r4 = r4 + r0
            r3.position = r4
            int r1 = r3.size
            if (r1 >= r4) goto L30
            r3.size = r4
        L30:
            return r0
    }
}
