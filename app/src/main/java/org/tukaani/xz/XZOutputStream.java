package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class XZOutputStream extends org.tukaani.xz.FinishableOutputStream {
    private final org.tukaani.xz.ArrayCache arrayCache;
    private org.tukaani.xz.BlockOutputStream blockEncoder;
    private final org.tukaani.xz.check.Check check;
    private java.io.IOException exception;
    private org.tukaani.xz.FilterEncoder[] filters;
    private boolean filtersSupportFlushing;
    private boolean finished;
    private final org.tukaani.xz.index.IndexEncoder index;
    private java.io.OutputStream out;
    private final org.tukaani.xz.common.StreamFlags streamFlags;
    private final byte[] tempBuf;

    public XZOutputStream(java.io.OutputStream r2, org.tukaani.xz.FilterOptions r3) throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r3, r0)
            return
    }

    public XZOutputStream(java.io.OutputStream r3, org.tukaani.xz.FilterOptions r4, int r5) throws java.io.IOException {
            r2 = this;
            r0 = 1
            org.tukaani.xz.FilterOptions[] r0 = new org.tukaani.xz.FilterOptions[r0]
            r1 = 0
            r0[r1] = r4
            r2.<init>(r3, r0, r5)
            return
    }

    public XZOutputStream(java.io.OutputStream r3, org.tukaani.xz.FilterOptions r4, int r5, org.tukaani.xz.ArrayCache r6) throws java.io.IOException {
            r2 = this;
            r0 = 1
            org.tukaani.xz.FilterOptions[] r0 = new org.tukaani.xz.FilterOptions[r0]
            r1 = 0
            r0[r1] = r4
            r2.<init>(r3, r0, r5, r6)
            return
    }

    public XZOutputStream(java.io.OutputStream r2, org.tukaani.xz.FilterOptions r3, org.tukaani.xz.ArrayCache r4) throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public XZOutputStream(java.io.OutputStream r2, org.tukaani.xz.FilterOptions[] r3) throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r3, r0)
            return
    }

    public XZOutputStream(java.io.OutputStream r2, org.tukaani.xz.FilterOptions[] r3, int r4) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public XZOutputStream(java.io.OutputStream r3, org.tukaani.xz.FilterOptions[] r4, int r5, org.tukaani.xz.ArrayCache r6) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            org.tukaani.xz.common.StreamFlags r0 = new org.tukaani.xz.common.StreamFlags
            r0.<init>()
            r2.streamFlags = r0
            org.tukaani.xz.index.IndexEncoder r1 = new org.tukaani.xz.index.IndexEncoder
            r1.<init>()
            r2.index = r1
            r1 = 0
            r2.blockEncoder = r1
            r2.exception = r1
            r1 = 0
            r2.finished = r1
            r1 = 1
            byte[] r1 = new byte[r1]
            r2.tempBuf = r1
            r2.arrayCache = r6
            r2.out = r3
            r2.setFiltersForNextBlock(r4)
            r0.checkType = r5
            org.tukaani.xz.check.Check r3 = org.tukaani.xz.check.Check.getInstance(r5)
            r2.check = r3
            r2.encodeStreamHeader()
            return
    }

    public XZOutputStream(java.io.OutputStream r2, org.tukaani.xz.FilterOptions[] r3, org.tukaani.xz.ArrayCache r4) throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r3, r0, r4)
            return
    }

    private void encodeStreamFlags(byte[] r2, int r3) {
            r1 = this;
            r0 = 0
            r2[r3] = r0
            int r3 = r3 + 1
            org.tukaani.xz.common.StreamFlags r0 = r1.streamFlags
            int r0 = r0.checkType
            byte r0 = (byte) r0
            r2[r3] = r0
            return
    }

    private void encodeStreamFooter() throws java.io.IOException {
            r6 = this;
            r0 = 6
            byte[] r0 = new byte[r0]
            org.tukaani.xz.index.IndexEncoder r1 = r6.index
            long r1 = r1.getIndexSize()
            r3 = 4
            long r1 = r1 / r3
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
        L10:
            r4 = 4
            if (r3 >= r4) goto L1e
            int r4 = r3 * 8
            long r4 = r1 >>> r4
            int r4 = (int) r4
            byte r4 = (byte) r4
            r0[r3] = r4
            int r3 = r3 + 1
            goto L10
        L1e:
            r6.encodeStreamFlags(r0, r4)
            java.io.OutputStream r1 = r6.out
            org.tukaani.xz.common.EncoderUtil.writeCRC32(r1, r0)
            java.io.OutputStream r1 = r6.out
            r1.write(r0)
            java.io.OutputStream r0 = r6.out
            byte[] r1 = org.tukaani.xz.XZ.FOOTER_MAGIC
            r0.write(r1)
            return
    }

    private void encodeStreamHeader() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            byte[] r1 = org.tukaani.xz.XZ.HEADER_MAGIC
            r0.write(r1)
            r0 = 2
            byte[] r0 = new byte[r0]
            r1 = 0
            r2.encodeStreamFlags(r0, r1)
            java.io.OutputStream r1 = r2.out
            r1.write(r0)
            java.io.OutputStream r1 = r2.out
            org.tukaani.xz.common.EncoderUtil.writeCRC32(r1, r0)
            return
    }

    private void setFiltersForNextBlock(org.tukaani.xz.FilterOptions[] r5) throws org.tukaani.xz.XZIOException {
            r4 = this;
            int r0 = r5.length
            r1 = 1
            if (r0 < r1) goto L2b
            int r0 = r5.length
            r2 = 4
            if (r0 > r2) goto L2b
            r4.filtersSupportFlushing = r1
            int r0 = r5.length
            org.tukaani.xz.FilterEncoder[] r0 = new org.tukaani.xz.FilterEncoder[r0]
            r1 = 0
        Le:
            int r2 = r5.length
            if (r1 >= r2) goto L25
            r2 = r5[r1]
            org.tukaani.xz.FilterEncoder r2 = r2.getFilterEncoder()
            r0[r1] = r2
            boolean r3 = r4.filtersSupportFlushing
            boolean r2 = r2.supportsFlushing()
            r2 = r2 & r3
            r4.filtersSupportFlushing = r2
            int r1 = r1 + 1
            goto Le
        L25:
            org.tukaani.xz.RawCoder.validate(r0)
            r4.filters = r0
            return
        L2b:
            org.tukaani.xz.UnsupportedOptionsException r5 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r0 = "XZ filter chain must be 1-4 filters"
            r5.<init>(r0)
            throw r5
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            if (r0 == 0) goto L17
            r2.finish()     // Catch: java.io.IOException -> L7
        L7:
            java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> Ld
            r0.close()     // Catch: java.io.IOException -> Ld
            goto L14
        Ld:
            r0 = move-exception
            java.io.IOException r1 = r2.exception
            if (r1 != 0) goto L14
            r2.exception = r0
        L14:
            r0 = 0
            r2.out = r0
        L17:
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L1c
            return
        L1c:
            throw r0
    }

    public void endBlock() throws java.io.IOException {
            r5 = this;
            java.io.IOException r0 = r5.exception
            if (r0 != 0) goto L31
            boolean r0 = r5.finished
            if (r0 != 0) goto L29
            org.tukaani.xz.BlockOutputStream r0 = r5.blockEncoder
            if (r0 == 0) goto L28
            r0.finish()     // Catch: java.io.IOException -> L24
            org.tukaani.xz.index.IndexEncoder r0 = r5.index     // Catch: java.io.IOException -> L24
            org.tukaani.xz.BlockOutputStream r1 = r5.blockEncoder     // Catch: java.io.IOException -> L24
            long r1 = r1.getUnpaddedSize()     // Catch: java.io.IOException -> L24
            org.tukaani.xz.BlockOutputStream r3 = r5.blockEncoder     // Catch: java.io.IOException -> L24
            long r3 = r3.getUncompressedSize()     // Catch: java.io.IOException -> L24
            r0.add(r1, r3)     // Catch: java.io.IOException -> L24
            r0 = 0
            r5.blockEncoder = r0     // Catch: java.io.IOException -> L24
            goto L28
        L24:
            r0 = move-exception
            r5.exception = r0
            throw r0
        L28:
            return
        L29:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream finished or closed"
            r0.<init>(r1)
            throw r0
        L31:
            throw r0
    }

    @Override // org.tukaani.xz.FinishableOutputStream
    public void finish() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.finished
            if (r0 != 0) goto L19
            r2.endBlock()
            org.tukaani.xz.index.IndexEncoder r0 = r2.index     // Catch: java.io.IOException -> L15
            java.io.OutputStream r1 = r2.out     // Catch: java.io.IOException -> L15
            r0.encode(r1)     // Catch: java.io.IOException -> L15
            r2.encodeStreamFooter()     // Catch: java.io.IOException -> L15
            r0 = 1
            r2.finished = r0
            goto L19
        L15:
            r0 = move-exception
            r2.exception = r0
            throw r0
        L19:
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L2f
            boolean r0 = r2.finished
            if (r0 != 0) goto L27
            org.tukaani.xz.BlockOutputStream r0 = r2.blockEncoder     // Catch: java.io.IOException -> L23
            if (r0 == 0) goto L1d
            boolean r1 = r2.filtersSupportFlushing     // Catch: java.io.IOException -> L23
            if (r1 == 0) goto L14
            r0.flush()     // Catch: java.io.IOException -> L23
            goto L22
        L14:
            r2.endBlock()     // Catch: java.io.IOException -> L23
            java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> L23
            r0.flush()     // Catch: java.io.IOException -> L23
            goto L22
        L1d:
            java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> L23
            r0.flush()     // Catch: java.io.IOException -> L23
        L22:
            return
        L23:
            r0 = move-exception
            r2.exception = r0
            throw r0
        L27:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream finished or closed"
            r0.<init>(r1)
            throw r0
        L2f:
            throw r0
    }

    public void updateFilters(org.tukaani.xz.FilterOptions r3) throws org.tukaani.xz.XZIOException {
            r2 = this;
            r0 = 1
            org.tukaani.xz.FilterOptions[] r0 = new org.tukaani.xz.FilterOptions[r0]
            r1 = 0
            r0[r1] = r3
            r2.updateFilters(r0)
            return
    }

    public void updateFilters(org.tukaani.xz.FilterOptions[] r2) throws org.tukaani.xz.XZIOException {
            r1 = this;
            org.tukaani.xz.BlockOutputStream r0 = r1.blockEncoder
            if (r0 != 0) goto L8
            r1.setFiltersForNextBlock(r2)
            return
        L8:
            org.tukaani.xz.UnsupportedOptionsException r2 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r0 = "Changing filter options in the middle of a XZ Block not implemented"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.tempBuf
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.write(r0, r1, r3)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            if (r7 < 0) goto L39
            if (r8 < 0) goto L39
            int r0 = r7 + r8
            if (r0 < 0) goto L39
            int r1 = r6.length
            if (r0 > r1) goto L39
            java.io.IOException r0 = r5.exception
            if (r0 != 0) goto L38
            boolean r0 = r5.finished
            if (r0 != 0) goto L30
            org.tukaani.xz.BlockOutputStream r0 = r5.blockEncoder     // Catch: java.io.IOException -> L2c
            if (r0 != 0) goto L26
            org.tukaani.xz.BlockOutputStream r0 = new org.tukaani.xz.BlockOutputStream     // Catch: java.io.IOException -> L2c
            java.io.OutputStream r1 = r5.out     // Catch: java.io.IOException -> L2c
            org.tukaani.xz.FilterEncoder[] r2 = r5.filters     // Catch: java.io.IOException -> L2c
            org.tukaani.xz.check.Check r3 = r5.check     // Catch: java.io.IOException -> L2c
            org.tukaani.xz.ArrayCache r4 = r5.arrayCache     // Catch: java.io.IOException -> L2c
            r0.<init>(r1, r2, r3, r4)     // Catch: java.io.IOException -> L2c
            r5.blockEncoder = r0     // Catch: java.io.IOException -> L2c
        L26:
            org.tukaani.xz.BlockOutputStream r0 = r5.blockEncoder     // Catch: java.io.IOException -> L2c
            r0.write(r6, r7, r8)     // Catch: java.io.IOException -> L2c
            return
        L2c:
            r6 = move-exception
            r5.exception = r6
            throw r6
        L30:
            org.tukaani.xz.XZIOException r6 = new org.tukaani.xz.XZIOException
            java.lang.String r7 = "Stream finished or closed"
            r6.<init>(r7)
            throw r6
        L38:
            throw r0
        L39:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            r6.<init>()
            throw r6
    }
}
