package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
class IterableByteBufferInputStream extends java.io.InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private java.nio.ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize;
    private boolean hasArray;
    private java.util.Iterator<java.nio.ByteBuffer> iterator;

    IterableByteBufferInputStream(java.lang.Iterable<java.nio.ByteBuffer> r3) {
            r2 = this;
            r2.<init>()
            java.util.Iterator r0 = r3.iterator()
            r2.iterator = r0
            r0 = 0
            r2.dataSize = r0
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r3.next()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r2.dataSize
            int r1 = r1 + 1
            r2.dataSize = r1
            goto L10
        L23:
            r3 = -1
            r2.currentIndex = r3
            boolean r3 = r2.getNextByteBuffer()
            if (r3 != 0) goto L38
            java.nio.ByteBuffer r3 = com.google.crypto.tink.shaded.protobuf.Internal.EMPTY_BYTE_BUFFER
            r2.currentByteBuffer = r3
            r2.currentIndex = r0
            r2.currentByteBufferPos = r0
            r0 = 0
            r2.currentAddress = r0
        L38:
            return
    }

    private boolean getNextByteBuffer() {
            r4 = this;
            int r0 = r4.currentIndex
            r1 = 1
            int r0 = r0 + r1
            r4.currentIndex = r0
            java.util.Iterator<java.nio.ByteBuffer> r0 = r4.iterator
            boolean r0 = r0.hasNext()
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            java.util.Iterator<java.nio.ByteBuffer> r0 = r4.iterator
            java.lang.Object r0 = r0.next()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.currentByteBuffer = r0
            int r0 = r0.position()
            r4.currentByteBufferPos = r0
            java.nio.ByteBuffer r0 = r4.currentByteBuffer
            boolean r0 = r0.hasArray()
            if (r0 == 0) goto L3b
            r4.hasArray = r1
            java.nio.ByteBuffer r0 = r4.currentByteBuffer
            byte[] r0 = r0.array()
            r4.currentArray = r0
            java.nio.ByteBuffer r0 = r4.currentByteBuffer
            int r0 = r0.arrayOffset()
            r4.currentArrayOffset = r0
            goto L48
        L3b:
            r4.hasArray = r2
            java.nio.ByteBuffer r0 = r4.currentByteBuffer
            long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r0)
            r4.currentAddress = r2
            r0 = 0
            r4.currentArray = r0
        L48:
            return r1
    }

    private void updateCurrentByteBufferPos(int r2) {
            r1 = this;
            int r0 = r1.currentByteBufferPos
            int r0 = r0 + r2
            r1.currentByteBufferPos = r0
            java.nio.ByteBuffer r2 = r1.currentByteBuffer
            int r2 = r2.limit()
            if (r0 != r2) goto L10
            r1.getNextByteBuffer()
        L10:
            return
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r6 = this;
            int r0 = r6.currentIndex
            int r1 = r6.dataSize
            if (r0 != r1) goto L8
            r0 = -1
            return r0
        L8:
            boolean r0 = r6.hasArray
            r1 = 1
            if (r0 == 0) goto L1c
            byte[] r0 = r6.currentArray
            int r2 = r6.currentByteBufferPos
            int r3 = r6.currentArrayOffset
            int r2 = r2 + r3
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.updateCurrentByteBufferPos(r1)
            return r0
        L1c:
            int r0 = r6.currentByteBufferPos
            long r2 = (long) r0
            long r4 = r6.currentAddress
            long r2 = r2 + r4
            byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.updateCurrentByteBufferPos(r1)
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.currentIndex
            int r1 = r3.dataSize
            if (r0 != r1) goto L8
            r4 = -1
            return r4
        L8:
            java.nio.ByteBuffer r0 = r3.currentByteBuffer
            int r0 = r0.limit()
            int r1 = r3.currentByteBufferPos
            int r0 = r0 - r1
            if (r6 <= r0) goto L14
            r6 = r0
        L14:
            boolean r0 = r3.hasArray
            if (r0 == 0) goto L24
            byte[] r0 = r3.currentArray
            int r2 = r3.currentArrayOffset
            int r1 = r1 + r2
            java.lang.System.arraycopy(r0, r1, r4, r5, r6)
            r3.updateCurrentByteBufferPos(r6)
            goto L3e
        L24:
            java.nio.ByteBuffer r0 = r3.currentByteBuffer
            int r0 = r0.position()
            java.nio.ByteBuffer r1 = r3.currentByteBuffer
            int r2 = r3.currentByteBufferPos
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.currentByteBuffer
            r1.get(r4, r5, r6)
            java.nio.ByteBuffer r4 = r3.currentByteBuffer
            r4.position(r0)
            r3.updateCurrentByteBufferPos(r6)
        L3e:
            return r6
    }
}
