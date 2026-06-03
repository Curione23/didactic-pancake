package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class BitInputStream implements java.io.Closeable {
    private static final long[] MASKS = null;
    private static final int MAXIMUM_CACHE_SIZE = 63;
    private long bitsCached;
    private int bitsCachedSize;
    private final java.nio.ByteOrder byteOrder;
    private final org.apache.commons.io.input.BoundedInputStream in;

    static {
            r0 = 64
            long[] r0 = new long[r0]
            org.apache.commons.compress.utils.BitInputStream.MASKS = r0
            r0 = 1
            r1 = r0
        L8:
            r2 = 63
            if (r1 > r2) goto L1b
            long[] r2 = org.apache.commons.compress.utils.BitInputStream.MASKS
            int r3 = r1 + (-1)
            r3 = r2[r3]
            long r3 = r3 << r0
            r5 = 1
            long r3 = r3 + r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto L8
        L1b:
            return
    }

    public BitInputStream(java.io.InputStream r2, java.nio.ByteOrder r3) {
            r1 = this;
            r1.<init>()
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            org.apache.commons.io.build.AbstractOriginSupplier r2 = r0.setInputStream(r2)
            org.apache.commons.io.input.BoundedInputStream$Builder r2 = (org.apache.commons.io.input.BoundedInputStream.Builder) r2
            java.util.function.Supplier r2 = r2.asSupplier()
            java.lang.Object r2 = r2.get()
            org.apache.commons.io.input.BoundedInputStream r2 = (org.apache.commons.io.input.BoundedInputStream) r2
            r1.in = r2
            r1.byteOrder = r3
            return
    }

    private boolean ensureCache(int r7) throws java.io.IOException {
            r6 = this;
        L0:
            int r0 = r6.bitsCachedSize
            if (r0 >= r7) goto L34
            r1 = 57
            if (r0 >= r1) goto L34
            org.apache.commons.io.input.BoundedInputStream r0 = r6.in
            int r0 = r0.read()
            long r0 = (long) r0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L17
            r7 = 1
            return r7
        L17:
            java.nio.ByteOrder r2 = r6.byteOrder
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4 = 8
            if (r2 != r3) goto L28
            long r2 = r6.bitsCached
            int r5 = r6.bitsCachedSize
            long r0 = r0 << r5
            long r0 = r0 | r2
            r6.bitsCached = r0
            goto L2e
        L28:
            long r2 = r6.bitsCached
            long r2 = r2 << r4
            long r0 = r0 | r2
            r6.bitsCached = r0
        L2e:
            int r0 = r6.bitsCachedSize
            int r0 = r0 + r4
            r6.bitsCachedSize = r0
            goto L0
        L34:
            r7 = 0
            return r7
    }

    private long processBitsGreater57(int r12) throws java.io.IOException {
            r11 = this;
            int r0 = r11.bitsCachedSize
            int r0 = r12 - r0
            int r1 = 8 - r0
            org.apache.commons.io.input.BoundedInputStream r2 = r11.in
            int r2 = r2.read()
            long r2 = (long) r2
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L14
            return r2
        L14:
            java.nio.ByteOrder r4 = r11.byteOrder
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r4 != r5) goto L2c
            long[] r4 = org.apache.commons.compress.utils.BitInputStream.MASKS
            r5 = r4[r0]
            long r5 = r5 & r2
            long r7 = r11.bitsCached
            int r9 = r11.bitsCachedSize
            long r5 = r5 << r9
            long r5 = r5 | r7
            r11.bitsCached = r5
            long r2 = r2 >>> r0
            r5 = r4[r1]
            long r2 = r2 & r5
            goto L3e
        L2c:
            long r4 = r11.bitsCached
            long r4 = r4 << r0
            r11.bitsCached = r4
            long r6 = r2 >>> r1
            long[] r8 = org.apache.commons.compress.utils.BitInputStream.MASKS
            r9 = r8[r0]
            long r6 = r6 & r9
            long r4 = r4 | r6
            r11.bitsCached = r4
            r4 = r8[r1]
            long r2 = r2 & r4
        L3e:
            long r4 = r11.bitsCached
            long[] r0 = org.apache.commons.compress.utils.BitInputStream.MASKS
            r6 = r0[r12]
            long r4 = r4 & r6
            r11.bitsCached = r2
            r11.bitsCachedSize = r1
            return r4
    }

    private long readCachedBits(int r6) {
            r5 = this;
            java.nio.ByteOrder r0 = r5.byteOrder
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r1) goto L12
            long r0 = r5.bitsCached
            long[] r2 = org.apache.commons.compress.utils.BitInputStream.MASKS
            r3 = r2[r6]
            long r2 = r0 & r3
            long r0 = r0 >>> r6
            r5.bitsCached = r0
            goto L1e
        L12:
            long r0 = r5.bitsCached
            int r2 = r5.bitsCachedSize
            int r2 = r2 - r6
            long r0 = r0 >> r2
            long[] r2 = org.apache.commons.compress.utils.BitInputStream.MASKS
            r3 = r2[r6]
            long r2 = r0 & r3
        L1e:
            int r0 = r5.bitsCachedSize
            int r0 = r0 - r6
            r5.bitsCachedSize = r0
            return r2
    }

    public void alignWithByteBoundary() {
            r1 = this;
            int r0 = r1.bitsCachedSize
            int r0 = r0 % 8
            if (r0 <= 0) goto L9
            r1.readCachedBits(r0)
        L9:
            return
    }

    public long bitsAvailable() throws java.io.IOException {
            r6 = this;
            int r0 = r6.bitsCachedSize
            long r0 = (long) r0
            org.apache.commons.io.input.BoundedInputStream r2 = r6.in
            int r2 = r2.available()
            long r2 = (long) r2
            r4 = 8
            long r2 = r2 * r4
            long r0 = r0 + r2
            return r0
    }

    public int bitsCached() {
            r1 = this;
            int r0 = r1.bitsCachedSize
            return r0
    }

    public void clearBitCache() {
            r2 = this;
            r0 = 0
            r2.bitsCached = r0
            r0 = 0
            r2.bitsCachedSize = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r1.in
            r0.close()
            return
    }

    public long getBytesRead() {
            r2 = this;
            org.apache.commons.io.input.BoundedInputStream r0 = r2.in
            long r0 = r0.getCount()
            return r0
    }

    public long readBits(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 < 0) goto L1d
            r0 = 63
            if (r3 > r0) goto L1d
            boolean r0 = r2.ensureCache(r3)
            if (r0 == 0) goto Lf
            r0 = -1
            return r0
        Lf:
            int r0 = r2.bitsCachedSize
            if (r0 >= r3) goto L18
            long r0 = r2.processBitsGreater57(r3)
            return r0
        L18:
            long r0 = r2.readCachedBits(r3)
            return r0
        L1d:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "count must not be negative or greater than 63"
            r3.<init>(r0)
            throw r3
    }
}
