package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class FixedLengthBlockOutputStream extends java.io.OutputStream implements java.nio.channels.WritableByteChannel {
    private final int blockSize;
    private final java.nio.ByteBuffer buffer;
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final java.nio.channels.WritableByteChannel out;

    /* JADX INFO: renamed from: org.apache.commons.compress.utils.FixedLengthBlockOutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class BufferAtATimeOutputChannel implements java.nio.channels.WritableByteChannel {
        private final java.util.concurrent.atomic.AtomicBoolean closed;
        private final java.io.OutputStream out;

        private BufferAtATimeOutputChannel(java.io.OutputStream r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.closed = r0
                r1.out = r2
                return
        }

        /* synthetic */ BufferAtATimeOutputChannel(java.io.OutputStream r1, org.apache.commons.compress.utils.FixedLengthBlockOutputStream.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.closed
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto Lf
                java.io.OutputStream r0 = r3.out
                r0.close()
            Lf:
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

        @Override // java.nio.channels.WritableByteChannel
        public int write(java.nio.ByteBuffer r6) throws java.io.IOException {
                r5 = this;
                boolean r0 = r5.isOpen()
                if (r0 == 0) goto L38
                boolean r0 = r6.hasArray()
                if (r0 == 0) goto L30
                int r0 = r6.position()     // Catch: java.io.IOException -> L2b
                int r1 = r6.limit()     // Catch: java.io.IOException -> L2b
                int r1 = r1 - r0
                java.io.OutputStream r2 = r5.out     // Catch: java.io.IOException -> L2b
                byte[] r3 = r6.array()     // Catch: java.io.IOException -> L2b
                int r4 = r6.arrayOffset()     // Catch: java.io.IOException -> L2b
                int r4 = r4 + r0
                r2.write(r3, r4, r1)     // Catch: java.io.IOException -> L2b
                int r0 = r6.limit()     // Catch: java.io.IOException -> L2b
                r6.position(r0)     // Catch: java.io.IOException -> L2b
                return r1
            L2b:
                r6 = move-exception
                r5.close()     // Catch: java.io.IOException -> L2f
            L2f:
                throw r6
            L30:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "Direct buffer somehow written to BufferAtATimeOutputChannel"
                r6.<init>(r0)
                throw r6
            L38:
                java.nio.channels.ClosedChannelException r6 = new java.nio.channels.ClosedChannelException
                r6.<init>()
                throw r6
        }
    }

    public FixedLengthBlockOutputStream(java.io.OutputStream r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.closed = r0
            boolean r0 = r3 instanceof java.io.FileOutputStream
            if (r0 == 0) goto L1d
            java.io.FileOutputStream r3 = (java.io.FileOutputStream) r3
            java.nio.channels.FileChannel r3 = r3.getChannel()
            r2.out = r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r4)
            r2.buffer = r3
            goto L2b
        L1d:
            org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel r0 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel
            r1 = 0
            r0.<init>(r3, r1)
            r2.out = r0
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r4)
            r2.buffer = r3
        L2b:
            r2.blockSize = r4
            return
    }

    public FixedLengthBlockOutputStream(java.nio.channels.WritableByteChannel r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.closed = r0
            r1.out = r2
            r1.blockSize = r3
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r3)
            r1.buffer = r2
            return
    }

    private void maybeFlush() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto Lb
            r1.writeBlock()
        Lb:
            return
    }

    private void padBlock() {
            r6 = this;
            java.nio.ByteBuffer r0 = r6.buffer
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            r0.order(r1)
            java.nio.ByteBuffer r0 = r6.buffer
            int r0 = r0.remaining()
            r1 = 0
            r2 = 8
            if (r0 <= r2) goto L38
            java.nio.ByteBuffer r3 = r6.buffer
            int r3 = r3.position()
            r3 = r3 & 7
            if (r3 == 0) goto L2c
            int r3 = 8 - r3
            r4 = r1
        L21:
            if (r4 >= r3) goto L2b
            java.nio.ByteBuffer r5 = r6.buffer
            r5.put(r1)
            int r4 = r4 + 1
            goto L21
        L2b:
            int r0 = r0 - r3
        L2c:
            if (r0 < r2) goto L38
            java.nio.ByteBuffer r3 = r6.buffer
            r4 = 0
            r3.putLong(r4)
            int r0 = r0 + (-8)
            goto L2c
        L38:
            java.nio.ByteBuffer r0 = r6.buffer
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L46
            java.nio.ByteBuffer r0 = r6.buffer
            r0.put(r1)
            goto L38
        L46:
            return
    }

    private void writeBlock() throws java.io.IOException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.buffer
            r0.flip()
            java.nio.channels.WritableByteChannel r0 = r3.out
            java.nio.ByteBuffer r1 = r3.buffer
            int r0 = r0.write(r1)
            java.nio.ByteBuffer r1 = r3.buffer
            boolean r1 = r1.hasRemaining()
            int r2 = r3.blockSize
            if (r0 != r2) goto L1f
            if (r1 != 0) goto L1f
            java.nio.ByteBuffer r0 = r3.buffer
            r0.clear()
            return
        L1f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "Failed to write %,d bytes atomically. Only wrote  %,d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws java.io.IOException {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.closed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L1a
            r3.flushBlock()     // Catch: java.lang.Throwable -> L13
            java.nio.channels.WritableByteChannel r0 = r3.out
            r0.close()
            goto L1a
        L13:
            r0 = move-exception
            java.nio.channels.WritableByteChannel r1 = r3.out
            r1.close()
            throw r0
        L1a:
            return
    }

    public void flushBlock() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.buffer
            int r0 = r0.position()
            if (r0 == 0) goto Le
            r1.padBlock()
            r1.writeBlock()
        Le:
            return
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r2 = this;
            java.nio.channels.WritableByteChannel r0 = r2.out
            boolean r0 = r0.isOpen()
            r1 = 1
            if (r0 != 0) goto Le
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.closed
            r0.set(r1)
        Le:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.closed
            boolean r0 = r0.get()
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.isOpen()
            if (r0 == 0) goto L5e
            int r0 = r6.remaining()
            java.nio.ByteBuffer r1 = r5.buffer
            int r1 = r1.remaining()
            if (r0 >= r1) goto L18
            java.nio.ByteBuffer r1 = r5.buffer
            r1.put(r6)
            goto L5d
        L18:
            int r1 = r6.limit()
            java.nio.ByteBuffer r2 = r5.buffer
            int r2 = r2.position()
            if (r2 == 0) goto L3d
            java.nio.ByteBuffer r2 = r5.buffer
            int r2 = r2.remaining()
            int r3 = r6.position()
            int r3 = r3 + r2
            r6.limit(r3)
            java.nio.ByteBuffer r3 = r5.buffer
            r3.put(r6)
            r5.writeBlock()
            int r2 = r0 - r2
            goto L3e
        L3d:
            r2 = r0
        L3e:
            int r3 = r5.blockSize
            if (r2 < r3) goto L55
            int r3 = r6.position()
            int r4 = r5.blockSize
            int r3 = r3 + r4
            r6.limit(r3)
            java.nio.channels.WritableByteChannel r3 = r5.out
            r3.write(r6)
            int r3 = r5.blockSize
            int r2 = r2 - r3
            goto L3e
        L55:
            r6.limit(r1)
            java.nio.ByteBuffer r1 = r5.buffer
            r1.put(r6)
        L5d:
            return r0
        L5e:
            java.nio.channels.ClosedChannelException r6 = new java.nio.channels.ClosedChannelException
            r6.<init>()
            throw r6
    }

    @Override // java.io.OutputStream
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L10
            java.nio.ByteBuffer r0 = r1.buffer
            byte r2 = (byte) r2
            r0.put(r2)
            r1.maybeFlush()
            return
        L10:
            java.nio.channels.ClosedChannelException r2 = new java.nio.channels.ClosedChannelException
            r2.<init>()
            throw r2
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L1e
        L6:
            if (r5 <= 0) goto L1d
            java.nio.ByteBuffer r0 = r2.buffer
            int r0 = r0.remaining()
            int r0 = java.lang.Math.min(r5, r0)
            java.nio.ByteBuffer r1 = r2.buffer
            r1.put(r3, r4, r0)
            r2.maybeFlush()
            int r5 = r5 - r0
            int r4 = r4 + r0
            goto L6
        L1d:
            return
        L1e:
            java.nio.channels.ClosedChannelException r3 = new java.nio.channels.ClosedChannelException
            r3.<init>()
            throw r3
    }
}
