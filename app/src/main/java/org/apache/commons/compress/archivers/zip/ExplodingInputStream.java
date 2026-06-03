package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
final class ExplodingInputStream extends java.io.InputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private org.apache.commons.compress.archivers.zip.BitStream bits;
    private final org.apache.commons.compress.archivers.zip.CircularBuffer buffer;
    private final int dictionarySize;
    private org.apache.commons.compress.archivers.zip.BinaryTree distanceTree;
    private final java.io.InputStream in;
    private org.apache.commons.compress.archivers.zip.BinaryTree lengthTree;
    private org.apache.commons.compress.archivers.zip.BinaryTree literalTree;
    private final int minimumMatchLength;
    private final int numberOfTrees;
    private long treeSizes;
    private long uncompressedCount;

    ExplodingInputStream(int r3, int r4, java.io.InputStream r5) {
            r2 = this;
            r2.<init>()
            org.apache.commons.compress.archivers.zip.CircularBuffer r0 = new org.apache.commons.compress.archivers.zip.CircularBuffer
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.<init>(r1)
            r2.buffer = r0
            r0 = 4096(0x1000, float:5.74E-42)
            if (r3 == r0) goto L1e
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 != r0) goto L16
            goto L1e
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The dictionary size must be 4096 or 8192"
            r3.<init>(r4)
            throw r3
        L1e:
            r0 = 2
            if (r4 == r0) goto L2d
            r0 = 3
            if (r4 != r0) goto L25
            goto L2d
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The number of trees must be 2 or 3"
            r3.<init>(r4)
            throw r3
        L2d:
            r2.dictionarySize = r3
            r2.numberOfTrees = r4
            r2.minimumMatchLength = r4
            r2.in = r5
            return
    }

    private void fillBuffer() throws java.io.IOException {
            r7 = this;
            r7.init()
            org.apache.commons.compress.archivers.zip.BitStream r0 = r7.bits
            int r0 = r0.nextBit()
            r1 = -1
            if (r0 != r1) goto Ld
            return
        Ld:
            r2 = 1
            if (r0 != r2) goto L2a
            org.apache.commons.compress.archivers.zip.BinaryTree r0 = r7.literalTree
            if (r0 == 0) goto L1b
            org.apache.commons.compress.archivers.zip.BitStream r2 = r7.bits
            int r0 = r0.read(r2)
            goto L21
        L1b:
            org.apache.commons.compress.archivers.zip.BitStream r0 = r7.bits
            int r0 = r0.nextByte()
        L21:
            if (r0 != r1) goto L24
            return
        L24:
            org.apache.commons.compress.archivers.zip.CircularBuffer r1 = r7.buffer
            r1.put(r0)
            goto L72
        L2a:
            int r0 = r7.dictionarySize
            r3 = 4096(0x1000, float:5.74E-42)
            if (r0 != r3) goto L32
            r0 = 6
            goto L33
        L32:
            r0 = 7
        L33:
            org.apache.commons.compress.archivers.zip.BitStream r3 = r7.bits
            long r3 = r3.nextBits(r0)
            int r3 = (int) r3
            org.apache.commons.compress.archivers.zip.BinaryTree r4 = r7.distanceTree
            org.apache.commons.compress.archivers.zip.BitStream r5 = r7.bits
            int r4 = r4.read(r5)
            if (r4 != r1) goto L47
            if (r3 > 0) goto L47
            return
        L47:
            int r0 = r4 << r0
            r0 = r0 | r3
            org.apache.commons.compress.archivers.zip.BinaryTree r1 = r7.lengthTree
            org.apache.commons.compress.archivers.zip.BitStream r3 = r7.bits
            int r1 = r1.read(r3)
            r3 = 63
            if (r1 != r3) goto L69
            org.apache.commons.compress.archivers.zip.BitStream r3 = r7.bits
            r4 = 8
            long r3 = r3.nextBits(r4)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L65
            return
        L65:
            int r1 = org.apache.commons.compress.utils.ExactMath.add(r1, r3)
        L69:
            int r3 = r7.minimumMatchLength
            int r1 = r1 + r3
            org.apache.commons.compress.archivers.zip.CircularBuffer r3 = r7.buffer
            int r0 = r0 + r2
            r3.copy(r0, r1)
        L72:
            return
    }

    private void init() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.archivers.zip.BitStream r0 = r5.bits
            if (r0 != 0) goto L57
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            java.io.InputStream r1 = r5.in
            org.apache.commons.io.input.CloseShieldInputStream r1 = org.apache.commons.io.input.CloseShieldInputStream.wrap(r1)
            org.apache.commons.io.build.AbstractOriginSupplier r0 = r0.setInputStream(r1)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            org.apache.commons.io.input.BoundedInputStream r0 = r0.get()
            int r1 = r5.numberOfTrees     // Catch: java.lang.Throwable -> L4b
            r2 = 3
            if (r1 != r2) goto L25
            r1 = 256(0x100, float:3.59E-43)
            org.apache.commons.compress.archivers.zip.BinaryTree r1 = org.apache.commons.compress.archivers.zip.BinaryTree.decode(r0, r1)     // Catch: java.lang.Throwable -> L4b
            r5.literalTree = r1     // Catch: java.lang.Throwable -> L4b
        L25:
            r1 = 64
            org.apache.commons.compress.archivers.zip.BinaryTree r2 = org.apache.commons.compress.archivers.zip.BinaryTree.decode(r0, r1)     // Catch: java.lang.Throwable -> L4b
            r5.lengthTree = r2     // Catch: java.lang.Throwable -> L4b
            org.apache.commons.compress.archivers.zip.BinaryTree r1 = org.apache.commons.compress.archivers.zip.BinaryTree.decode(r0, r1)     // Catch: java.lang.Throwable -> L4b
            r5.distanceTree = r1     // Catch: java.lang.Throwable -> L4b
            long r1 = r5.treeSizes     // Catch: java.lang.Throwable -> L4b
            long r3 = r0.getCount()     // Catch: java.lang.Throwable -> L4b
            long r1 = r1 + r3
            r5.treeSizes = r1     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L41
            r0.close()
        L41:
            org.apache.commons.compress.archivers.zip.BitStream r0 = new org.apache.commons.compress.archivers.zip.BitStream
            java.io.InputStream r1 = r5.in
            r0.<init>(r1)
            r5.bits = r0
            goto L57
        L4b:
            r1 = move-exception
            if (r0 == 0) goto L56
            r0.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r0 = move-exception
            r1.addSuppressed(r0)
        L56:
            throw r1
        L57:
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            r0.close()
            return
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r4 = this;
            org.apache.commons.compress.archivers.zip.BitStream r0 = r4.bits
            long r0 = r0.getBytesRead()
            long r2 = r4.treeSizes
            long r0 = r0 + r2
            return r0
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getUncompressedCount() {
            r2 = this;
            long r0 = r2.uncompressedCount
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.archivers.zip.CircularBuffer r0 = r5.buffer
            boolean r0 = r0.available()
            if (r0 != 0) goto L15
            r5.fillBuffer()     // Catch: java.lang.IllegalArgumentException -> Lc
            goto L15
        Lc:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "bad IMPLODE stream"
            r1.<init>(r2, r0)
            throw r1
        L15:
            org.apache.commons.compress.archivers.zip.CircularBuffer r0 = r5.buffer
            int r0 = r0.get()
            r1 = -1
            if (r0 <= r1) goto L25
            long r1 = r5.uncompressedCount
            r3 = 1
            long r1 = r1 + r3
            r5.uncompressedCount = r1
        L25:
            return r0
    }
}
