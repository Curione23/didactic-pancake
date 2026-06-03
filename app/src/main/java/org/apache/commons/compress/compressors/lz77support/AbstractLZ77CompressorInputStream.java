package org.apache.commons.compress.compressors.lz77support;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractLZ77CompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private int backReferenceOffset;
    private final byte[] buf;
    private long bytesRemaining;
    private final org.apache.commons.io.input.BoundedInputStream in;
    private final byte[] oneByte;
    private int readIndex;
    private int size;
    protected final org.apache.commons.compress.utils.ByteUtils.ByteSupplier supplier;
    private final int windowSize;
    private int writeIndex;

    public AbstractLZ77CompressorInputStream(java.io.InputStream r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.oneByte = r0
            org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.supplier = r0
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r2 = r0.setInputStream(r2)
            org.apache.commons.io.input.BoundedInputStream$Builder r2 = (org.apache.commons.io.input.BoundedInputStream.Builder) r2
            java.util.function.Supplier r2 = r2.asSupplier()
            java.lang.Object r2 = r2.get()
            org.apache.commons.io.input.BoundedInputStream r2 = (org.apache.commons.io.input.BoundedInputStream) r2
            r1.in = r2
            if (r3 <= 0) goto L39
            r1.windowSize = r3
            int r3 = r3 * 3
            byte[] r2 = new byte[r3]
            r1.buf = r2
            r2 = 0
            r1.readIndex = r2
            r1.writeIndex = r2
            r2 = 0
            r1.bytesRemaining = r2
            return
        L39:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "windowSize must be bigger than 0"
            r2.<init>(r3)
            throw r2
    }

    private int readFromBuffer(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.available()
            int r5 = java.lang.Math.min(r5, r0)
            if (r5 <= 0) goto L1f
            byte[] r0 = r2.buf
            int r1 = r2.readIndex
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.readIndex
            int r3 = r3 + r5
            r2.readIndex = r3
            int r4 = r2.windowSize
            int r4 = r4 * 2
            if (r3 <= r4) goto L1f
            r2.slideBuffer()
        L1f:
            int r3 = r2.size
            int r3 = r3 + r5
            r2.size = r3
            return r5
    }

    private void slideBuffer() {
            r4 = this;
            byte[] r0 = r4.buf
            int r1 = r4.windowSize
            int r2 = r1 * 2
            r3 = 0
            java.lang.System.arraycopy(r0, r1, r0, r3, r2)
            int r0 = r4.writeIndex
            int r1 = r4.windowSize
            int r0 = r0 - r1
            r4.writeIndex = r0
            int r0 = r4.readIndex
            int r0 = r0 - r1
            r4.readIndex = r0
            return
    }

    private void tryToCopy(int r7) {
            r6 = this;
            long r0 = (long) r7
            long r2 = r6.bytesRemaining
            long r0 = java.lang.Math.min(r0, r2)
            int r7 = (int) r0
            byte[] r0 = r6.buf
            int r0 = r0.length
            int r1 = r6.writeIndex
            int r0 = r0 - r1
            int r7 = java.lang.Math.min(r7, r0)
            if (r7 != 0) goto L15
            goto L6d
        L15:
            int r0 = r6.backReferenceOffset
            r1 = 1
            if (r0 != r1) goto L2d
            byte[] r0 = r6.buf
            int r1 = r6.writeIndex
            int r2 = r1 + (-1)
            r2 = r0[r2]
            int r3 = r1 + r7
            java.util.Arrays.fill(r0, r1, r3, r2)
            int r0 = r6.writeIndex
            int r0 = r0 + r7
            r6.writeIndex = r0
            goto L6d
        L2d:
            if (r7 >= r0) goto L3e
            byte[] r1 = r6.buf
            int r2 = r6.writeIndex
            int r0 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r2, r7)
            int r0 = r6.writeIndex
            int r0 = r0 + r7
            r6.writeIndex = r0
            goto L6d
        L3e:
            int r0 = r7 / r0
            r1 = 0
        L41:
            if (r1 >= r0) goto L58
            byte[] r2 = r6.buf
            int r3 = r6.writeIndex
            int r4 = r6.backReferenceOffset
            int r5 = r3 - r4
            java.lang.System.arraycopy(r2, r5, r2, r3, r4)
            int r2 = r6.writeIndex
            int r3 = r6.backReferenceOffset
            int r2 = r2 + r3
            r6.writeIndex = r2
            int r1 = r1 + 1
            goto L41
        L58:
            int r1 = r6.backReferenceOffset
            int r0 = r0 * r1
            int r0 = r7 - r0
            if (r0 <= 0) goto L6d
            byte[] r2 = r6.buf
            int r3 = r6.writeIndex
            int r1 = r3 - r1
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
            int r1 = r6.writeIndex
            int r1 = r1 + r0
            r6.writeIndex = r1
        L6d:
            long r0 = r6.bytesRemaining
            long r2 = (long) r7
            long r0 = r0 - r2
            r6.bytesRemaining = r0
            return
    }

    private void tryToReadLiteral(int r5) throws java.io.IOException {
            r4 = this;
            long r0 = (long) r5
            long r2 = r4.bytesRemaining
            long r0 = java.lang.Math.min(r0, r2)
            int r5 = (int) r0
            byte[] r0 = r4.buf
            int r0 = r0.length
            int r1 = r4.writeIndex
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
            if (r5 <= 0) goto L1f
            org.apache.commons.io.input.BoundedInputStream r0 = r4.in
            byte[] r1 = r4.buf
            int r2 = r4.writeIndex
            int r0 = org.apache.commons.compress.utils.IOUtils.readFully(r0, r1, r2, r5)
            goto L20
        L1f:
            r0 = 0
        L20:
            r4.count(r0)
            if (r5 != r0) goto L31
            int r0 = r4.writeIndex
            int r0 = r0 + r5
            r4.writeIndex = r0
            long r0 = r4.bytesRemaining
            long r2 = (long) r5
            long r0 = r0 - r2
            r4.bytesRemaining = r0
            return
        L31:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Premature end of stream reading literal"
            r5.<init>(r0)
            throw r5
    }

    @Override // java.io.InputStream
    public int available() {
            r2 = this;
            int r0 = r2.writeIndex
            int r1 = r2.readIndex
            int r0 = r0 - r1
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r1.in
            r0.close()
            return
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r2.in
            long r0 = r0.getCount()
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    protected final boolean hasMoreDataInBlock() {
            r4 = this;
            long r0 = r4.bytesRemaining
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public void prefill(byte[] r5) {
            r4 = this;
            int r0 = r4.writeIndex
            if (r0 != 0) goto L1e
            int r0 = r4.windowSize
            int r1 = r5.length
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r5.length
            int r1 = r1 - r0
            byte[] r2 = r4.buf
            r3 = 0
            java.lang.System.arraycopy(r5, r1, r2, r3, r0)
            int r5 = r4.writeIndex
            int r5 = r5 + r0
            r4.writeIndex = r5
            int r5 = r4.readIndex
            int r5 = r5 + r0
            r4.readIndex = r5
            return
        L1e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "The stream has already been read from, can't prefill anymore"
            r5.<init>(r0)
            throw r5
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.oneByte
            r1 = 1
            r2 = 0
            int r0 = r3.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            byte[] r0 = r3.oneByte
            r0 = r0[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
        L12:
            return r1
    }

    protected final int readBackReference(byte[] r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.available()
            if (r4 <= r0) goto Lb
            int r0 = r4 - r0
            r1.tryToCopy(r0)
        Lb:
            int r2 = r1.readFromBuffer(r2, r3, r4)
            return r2
    }

    protected final int readLiteral(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.available()
            if (r4 <= r0) goto Lb
            int r0 = r4 - r0
            r1.tryToReadLiteral(r0)
        Lb:
            int r2 = r1.readFromBuffer(r2, r3, r4)
            return r2
    }

    protected final int readOneByte() throws java.io.IOException {
            r2 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r2.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L10
            r1 = 1
            r2.count(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L10:
            return r1
    }

    protected final void startBackReference(int r3, long r4) {
            r2 = this;
            if (r3 <= 0) goto L19
            int r0 = r2.writeIndex
            if (r3 > r0) goto L19
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            r2.backReferenceOffset = r3
            r2.bytesRemaining = r4
            return
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "length must not be negative"
            r3.<init>(r4)
            throw r3
        L19:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "offset must be bigger than 0 but not bigger than the number of bytes available for back-references"
            r3.<init>(r4)
            throw r3
    }

    protected final void startLiteral(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            r2.bytesRemaining = r3
            return
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "length must not be negative"
            r3.<init>(r4)
            throw r3
    }
}
