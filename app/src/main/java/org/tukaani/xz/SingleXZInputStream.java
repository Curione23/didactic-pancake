package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class SingleXZInputStream extends java.io.InputStream {
    private final org.tukaani.xz.ArrayCache arrayCache;
    private org.tukaani.xz.BlockInputStream blockDecoder;
    private final org.tukaani.xz.check.Check check;
    private boolean endReached;
    private java.io.IOException exception;
    private java.io.InputStream in;
    private final org.tukaani.xz.index.IndexHash indexHash;
    private final int memoryLimit;
    private final org.tukaani.xz.common.StreamFlags streamHeaderFlags;
    private final byte[] tempBuf;
    private final boolean verifyCheck;

    public SingleXZInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public SingleXZInputStream(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public SingleXZInputStream(java.io.InputStream r2, int r3, org.tukaani.xz.ArrayCache r4) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public SingleXZInputStream(java.io.InputStream r2, int r3, boolean r4) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public SingleXZInputStream(java.io.InputStream r7, int r8, boolean r9, org.tukaani.xz.ArrayCache r10) throws java.io.IOException {
            r6 = this;
            byte[] r4 = readStreamHeader(r7)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    SingleXZInputStream(java.io.InputStream r3, int r4, boolean r5, byte[] r6, org.tukaani.xz.ArrayCache r7) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.blockDecoder = r0
            org.tukaani.xz.index.IndexHash r1 = new org.tukaani.xz.index.IndexHash
            r1.<init>()
            r2.indexHash = r1
            r1 = 0
            r2.endReached = r1
            r2.exception = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r2.tempBuf = r0
            r2.arrayCache = r7
            r2.in = r3
            r2.memoryLimit = r4
            r2.verifyCheck = r5
            org.tukaani.xz.common.StreamFlags r3 = org.tukaani.xz.common.DecoderUtil.decodeStreamHeader(r6)
            r2.streamHeaderFlags = r3
            int r3 = r3.checkType
            org.tukaani.xz.check.Check r3 = org.tukaani.xz.check.Check.getInstance(r3)
            r2.check = r3
            return
    }

    public SingleXZInputStream(java.io.InputStream r2, org.tukaani.xz.ArrayCache r3) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r3)
            return
    }

    private static byte[] readStreamHeader(java.io.InputStream r2) throws java.io.IOException {
            r0 = 12
            byte[] r0 = new byte[r0]
            java.io.DataInputStream r1 = new java.io.DataInputStream
            r1.<init>(r2)
            r1.readFully(r0)
            return r0
    }

    private void validateStreamFooter() throws java.io.IOException {
            r5 = this;
            r0 = 12
            byte[] r0 = new byte[r0]
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.InputStream r2 = r5.in
            r1.<init>(r2)
            r1.readFully(r0)
            org.tukaani.xz.common.StreamFlags r0 = org.tukaani.xz.common.DecoderUtil.decodeStreamFooter(r0)
            org.tukaani.xz.common.StreamFlags r1 = r5.streamHeaderFlags
            boolean r1 = org.tukaani.xz.common.DecoderUtil.areStreamFlagsEqual(r1, r0)
            if (r1 == 0) goto L27
            org.tukaani.xz.index.IndexHash r1 = r5.indexHash
            long r1 = r1.getIndexSize()
            long r3 = r0.backwardSize
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L27
            return
        L27:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r1 = "XZ Stream Footer does not match Stream Header"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto L14
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L13
            org.tukaani.xz.BlockInputStream r0 = r2.blockDecoder
            if (r0 != 0) goto Le
            r0 = 0
            goto L12
        Le:
            int r0 = r0.available()
        L12:
            return r0
        L13:
            throw r0
        L14:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.close(r0)
            return
    }

    public void close(boolean r3) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto L1c
            org.tukaani.xz.BlockInputStream r0 = r2.blockDecoder
            r1 = 0
            if (r0 == 0) goto Le
            r0.close()
            r2.blockDecoder = r1
        Le:
            if (r3 == 0) goto L1a
            java.io.InputStream r3 = r2.in     // Catch: java.lang.Throwable -> L16
            r3.close()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r3 = move-exception
            r2.in = r1
            throw r3
        L1a:
            r2.in = r1
        L1c:
            return
    }

    public java.lang.String getCheckName() {
            r1 = this;
            org.tukaani.xz.check.Check r0 = r1.check
            java.lang.String r0 = r0.getName()
            return r0
    }

    public int getCheckType() {
            r1 = this;
            org.tukaani.xz.common.StreamFlags r0 = r1.streamHeaderFlags
            int r0 = r0.checkType
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.tempBuf
            r1 = 1
            r2 = 0
            int r0 = r3.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            byte[] r0 = r3.tempBuf
            r0 = r0[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
        L12:
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r19, int r20, int r21) throws java.io.IOException {
            r18 = this;
            r1 = r18
            r0 = r19
            if (r20 < 0) goto L8d
            if (r21 < 0) goto L8d
            int r2 = r20 + r21
            if (r2 < 0) goto L8d
            int r3 = r0.length
            if (r2 > r3) goto L8d
            r2 = 0
            if (r21 != 0) goto L13
            return r2
        L13:
            java.io.InputStream r3 = r1.in
            if (r3 == 0) goto L85
            java.io.IOException r3 = r1.exception
            if (r3 != 0) goto L84
            boolean r3 = r1.endReached
            r4 = -1
            if (r3 == 0) goto L21
            return r4
        L21:
            r3 = r21
            r5 = r2
            r2 = r20
        L26:
            if (r3 <= 0) goto L83
            org.tukaani.xz.BlockInputStream r6 = r1.blockDecoder     // Catch: java.io.IOException -> L7c
            if (r6 != 0) goto L59
            org.tukaani.xz.BlockInputStream r6 = new org.tukaani.xz.BlockInputStream     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            java.io.InputStream r8 = r1.in     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            org.tukaani.xz.check.Check r9 = r1.check     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            boolean r10 = r1.verifyCheck     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            int r11 = r1.memoryLimit     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            org.tukaani.xz.ArrayCache r14 = r1.arrayCache     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            r12 = -1
            r15 = -1
            r7 = r6
            r17 = r14
            r14 = r15
            r16 = r17
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            r1.blockDecoder = r6     // Catch: org.tukaani.xz.IndexIndicatorException -> L48 java.io.IOException -> L7c
            goto L59
        L48:
            org.tukaani.xz.index.IndexHash r0 = r1.indexHash     // Catch: java.io.IOException -> L7c
            java.io.InputStream r2 = r1.in     // Catch: java.io.IOException -> L7c
            r0.validate(r2)     // Catch: java.io.IOException -> L7c
            r18.validateStreamFooter()     // Catch: java.io.IOException -> L7c
            r0 = 1
            r1.endReached = r0     // Catch: java.io.IOException -> L7c
            if (r5 <= 0) goto L58
            r4 = r5
        L58:
            return r4
        L59:
            org.tukaani.xz.BlockInputStream r6 = r1.blockDecoder     // Catch: java.io.IOException -> L7c
            int r6 = r6.read(r0, r2, r3)     // Catch: java.io.IOException -> L7c
            if (r6 <= 0) goto L65
            int r5 = r5 + r6
            int r2 = r2 + r6
            int r3 = r3 - r6
            goto L26
        L65:
            if (r6 != r4) goto L26
            org.tukaani.xz.index.IndexHash r6 = r1.indexHash     // Catch: java.io.IOException -> L7c
            org.tukaani.xz.BlockInputStream r7 = r1.blockDecoder     // Catch: java.io.IOException -> L7c
            long r7 = r7.getUnpaddedSize()     // Catch: java.io.IOException -> L7c
            org.tukaani.xz.BlockInputStream r9 = r1.blockDecoder     // Catch: java.io.IOException -> L7c
            long r9 = r9.getUncompressedSize()     // Catch: java.io.IOException -> L7c
            r6.add(r7, r9)     // Catch: java.io.IOException -> L7c
            r6 = 0
            r1.blockDecoder = r6     // Catch: java.io.IOException -> L7c
            goto L26
        L7c:
            r0 = move-exception
            r1.exception = r0
            if (r5 == 0) goto L82
            goto L83
        L82:
            throw r0
        L83:
            return r5
        L84:
            throw r3
        L85:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r2 = "Stream closed"
            r0.<init>(r2)
            throw r0
        L8d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
