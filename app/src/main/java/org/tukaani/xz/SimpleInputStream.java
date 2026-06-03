package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class SimpleInputStream extends java.io.InputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int FILTER_BUF_SIZE = 4096;
    private boolean endReached;
    private java.io.IOException exception;
    private final byte[] filterBuf;
    private int filtered;
    private java.io.InputStream in;
    private int pos;
    private final org.tukaani.xz.simple.SimpleFilter simpleFilter;
    private final byte[] tempBuf;
    private int unfiltered;

    static {
            return
    }

    SimpleInputStream(java.io.InputStream r2, org.tukaani.xz.simple.SimpleFilter r3) {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.filterBuf = r0
            r0 = 0
            r1.pos = r0
            r1.filtered = r0
            r1.unfiltered = r0
            r1.endReached = r0
            r0 = 0
            r1.exception = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.tempBuf = r0
            r2.getClass()
            r1.in = r2
            r1.simpleFilter = r3
            return
    }

    static int getMemoryUsage() {
            r0 = 5
            return r0
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto Lc
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto Lb
            int r0 = r2.filtered
            return r0
        Lb:
            throw r0
        Lc:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto Lf
            r1 = 0
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r2.in = r1
            goto Lf
        Lb:
            r0 = move-exception
            r2.in = r1
            throw r0
        Lf:
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
    public int read(byte[] r10, int r11, int r12) throws java.io.IOException {
            r9 = this;
            if (r11 < 0) goto L94
            if (r12 < 0) goto L94
            int r0 = r11 + r12
            if (r0 < 0) goto L94
            int r1 = r10.length
            if (r0 > r1) goto L94
            r0 = 0
            if (r12 != 0) goto Lf
            return r0
        Lf:
            java.io.InputStream r1 = r9.in
            if (r1 == 0) goto L8c
            java.io.IOException r1 = r9.exception
            if (r1 != 0) goto L8b
            r1 = r0
        L18:
            int r2 = r9.filtered     // Catch: java.io.IOException -> L87
            int r2 = java.lang.Math.min(r2, r12)     // Catch: java.io.IOException -> L87
            byte[] r3 = r9.filterBuf     // Catch: java.io.IOException -> L87
            int r4 = r9.pos     // Catch: java.io.IOException -> L87
            java.lang.System.arraycopy(r3, r4, r10, r11, r2)     // Catch: java.io.IOException -> L87
            int r3 = r9.pos     // Catch: java.io.IOException -> L87
            int r3 = r3 + r2
            r9.pos = r3     // Catch: java.io.IOException -> L87
            int r4 = r9.filtered     // Catch: java.io.IOException -> L87
            int r4 = r4 - r2
            r9.filtered = r4     // Catch: java.io.IOException -> L87
            int r11 = r11 + r2
            int r12 = r12 - r2
            int r1 = r1 + r2
            int r2 = r3 + r4
            int r5 = r9.unfiltered     // Catch: java.io.IOException -> L87
            int r2 = r2 + r5
            r6 = 4096(0x1000, float:5.74E-42)
            if (r2 != r6) goto L43
            byte[] r2 = r9.filterBuf     // Catch: java.io.IOException -> L87
            int r4 = r4 + r5
            java.lang.System.arraycopy(r2, r3, r2, r0, r4)     // Catch: java.io.IOException -> L87
            r9.pos = r0     // Catch: java.io.IOException -> L87
        L43:
            r2 = -1
            if (r12 == 0) goto L82
            boolean r3 = r9.endReached     // Catch: java.io.IOException -> L87
            if (r3 == 0) goto L4b
            goto L82
        L4b:
            int r3 = r9.pos     // Catch: java.io.IOException -> L87
            int r4 = r9.filtered     // Catch: java.io.IOException -> L87
            int r5 = r3 + r4
            int r7 = r9.unfiltered     // Catch: java.io.IOException -> L87
            int r5 = r5 + r7
            int r6 = r6 - r5
            java.io.InputStream r5 = r9.in     // Catch: java.io.IOException -> L87
            byte[] r8 = r9.filterBuf     // Catch: java.io.IOException -> L87
            int r3 = r3 + r4
            int r3 = r3 + r7
            int r3 = r5.read(r8, r3, r6)     // Catch: java.io.IOException -> L87
            if (r3 != r2) goto L6b
            r2 = 1
            r9.endReached = r2     // Catch: java.io.IOException -> L87
            int r2 = r9.unfiltered     // Catch: java.io.IOException -> L87
            r9.filtered = r2     // Catch: java.io.IOException -> L87
            r9.unfiltered = r0     // Catch: java.io.IOException -> L87
            goto L18
        L6b:
            int r2 = r9.unfiltered     // Catch: java.io.IOException -> L87
            int r2 = r2 + r3
            r9.unfiltered = r2     // Catch: java.io.IOException -> L87
            org.tukaani.xz.simple.SimpleFilter r3 = r9.simpleFilter     // Catch: java.io.IOException -> L87
            byte[] r4 = r9.filterBuf     // Catch: java.io.IOException -> L87
            int r5 = r9.pos     // Catch: java.io.IOException -> L87
            int r2 = r3.code(r4, r5, r2)     // Catch: java.io.IOException -> L87
            r9.filtered = r2     // Catch: java.io.IOException -> L87
            int r3 = r9.unfiltered     // Catch: java.io.IOException -> L87
            int r3 = r3 - r2
            r9.unfiltered = r3     // Catch: java.io.IOException -> L87
            goto L18
        L82:
            if (r1 <= 0) goto L85
            goto L86
        L85:
            r1 = r2
        L86:
            return r1
        L87:
            r10 = move-exception
            r9.exception = r10
            throw r10
        L8b:
            throw r1
        L8c:
            org.tukaani.xz.XZIOException r10 = new org.tukaani.xz.XZIOException
            java.lang.String r11 = "Stream closed"
            r10.<init>(r11)
            throw r10
        L94:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }
}
