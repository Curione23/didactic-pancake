package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class XZInputStream extends java.io.InputStream {
    private final org.tukaani.xz.ArrayCache arrayCache;
    private boolean endReached;
    private java.io.IOException exception;
    private java.io.InputStream in;
    private final int memoryLimit;
    private final byte[] tempBuf;
    private final boolean verifyCheck;
    private org.tukaani.xz.SingleXZInputStream xzIn;

    public XZInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public XZInputStream(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public XZInputStream(java.io.InputStream r2, int r3, org.tukaani.xz.ArrayCache r4) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public XZInputStream(java.io.InputStream r2, int r3, boolean r4) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public XZInputStream(java.io.InputStream r2, int r3, boolean r4, org.tukaani.xz.ArrayCache r5) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.endReached = r0
            r0 = 0
            r1.exception = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.tempBuf = r0
            r1.arrayCache = r5
            r1.in = r2
            r1.memoryLimit = r3
            r1.verifyCheck = r4
            org.tukaani.xz.SingleXZInputStream r0 = new org.tukaani.xz.SingleXZInputStream
            r0.<init>(r2, r3, r4, r5)
            r1.xzIn = r0
            return
    }

    public XZInputStream(java.io.InputStream r2, org.tukaani.xz.ArrayCache r3) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r3)
            return
    }

    private void prepareNextStream() throws java.io.IOException {
            r8 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.InputStream r1 = r8.in
            r0.<init>(r1)
            r1 = 12
            byte[] r6 = new byte[r1]
        Lb:
            r1 = 0
            r2 = 1
            int r3 = r0.read(r6, r1, r2)
            r4 = -1
            if (r3 != r4) goto L17
            r8.endReached = r2
            return
        L17:
            r3 = 3
            r0.readFully(r6, r2, r3)
            r1 = r6[r1]
            if (r1 != 0) goto L2c
            r1 = r6[r2]
            if (r1 != 0) goto L2c
            r1 = 2
            r1 = r6[r1]
            if (r1 != 0) goto L2c
            r1 = r6[r3]
            if (r1 == 0) goto Lb
        L2c:
            r1 = 4
            r2 = 8
            r0.readFully(r6, r1, r2)
            org.tukaani.xz.SingleXZInputStream r0 = new org.tukaani.xz.SingleXZInputStream     // Catch: org.tukaani.xz.XZFormatException -> L43
            java.io.InputStream r3 = r8.in     // Catch: org.tukaani.xz.XZFormatException -> L43
            int r4 = r8.memoryLimit     // Catch: org.tukaani.xz.XZFormatException -> L43
            boolean r5 = r8.verifyCheck     // Catch: org.tukaani.xz.XZFormatException -> L43
            org.tukaani.xz.ArrayCache r7 = r8.arrayCache     // Catch: org.tukaani.xz.XZFormatException -> L43
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: org.tukaani.xz.XZFormatException -> L43
            r8.xzIn = r0     // Catch: org.tukaani.xz.XZFormatException -> L43
            return
        L43:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r1 = "Garbage after a valid XZ Stream"
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
            org.tukaani.xz.SingleXZInputStream r0 = r2.xzIn
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

    public void close(boolean r4) throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.in
            if (r0 == 0) goto L1d
            org.tukaani.xz.SingleXZInputStream r0 = r3.xzIn
            r1 = 0
            if (r0 == 0) goto Lf
            r2 = 0
            r0.close(r2)
            r3.xzIn = r1
        Lf:
            if (r4 == 0) goto L1b
            java.io.InputStream r4 = r3.in     // Catch: java.lang.Throwable -> L17
            r4.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r4 = move-exception
            r3.in = r1
            throw r4
        L1b:
            r3.in = r1
        L1d:
            return
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
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            if (r5 < 0) goto L52
            if (r6 < 0) goto L52
            int r0 = r5 + r6
            if (r0 < 0) goto L52
            int r1 = r4.length
            if (r0 > r1) goto L52
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            java.io.InputStream r1 = r3.in
            if (r1 == 0) goto L4a
            java.io.IOException r1 = r3.exception
            if (r1 != 0) goto L49
            boolean r1 = r3.endReached
            r2 = -1
            if (r1 == 0) goto L1d
            return r2
        L1d:
            if (r6 <= 0) goto L48
            org.tukaani.xz.SingleXZInputStream r1 = r3.xzIn     // Catch: java.io.IOException -> L41
            if (r1 != 0) goto L2f
            r3.prepareNextStream()     // Catch: java.io.IOException -> L41
            boolean r1 = r3.endReached     // Catch: java.io.IOException -> L41
            if (r1 == 0) goto L2f
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r2 = r0
        L2e:
            return r2
        L2f:
            org.tukaani.xz.SingleXZInputStream r1 = r3.xzIn     // Catch: java.io.IOException -> L41
            int r1 = r1.read(r4, r5, r6)     // Catch: java.io.IOException -> L41
            if (r1 <= 0) goto L3b
            int r0 = r0 + r1
            int r5 = r5 + r1
            int r6 = r6 - r1
            goto L1d
        L3b:
            if (r1 != r2) goto L1d
            r1 = 0
            r3.xzIn = r1     // Catch: java.io.IOException -> L41
            goto L1d
        L41:
            r4 = move-exception
            r3.exception = r4
            if (r0 == 0) goto L47
            goto L48
        L47:
            throw r4
        L48:
            return r0
        L49:
            throw r1
        L4a:
            org.tukaani.xz.XZIOException r4 = new org.tukaani.xz.XZIOException
            java.lang.String r5 = "Stream closed"
            r4.<init>(r5)
            throw r4
        L52:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            throw r4
    }
}
