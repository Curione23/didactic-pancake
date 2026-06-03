package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class SimpleOutputStream extends org.tukaani.xz.FinishableOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int FILTER_BUF_SIZE = 4096;
    private java.io.IOException exception;
    private final byte[] filterBuf;
    private boolean finished;
    private org.tukaani.xz.FinishableOutputStream out;
    private int pos;
    private final org.tukaani.xz.simple.SimpleFilter simpleFilter;
    private final byte[] tempBuf;
    private int unfiltered;

    static {
            return
    }

    SimpleOutputStream(org.tukaani.xz.FinishableOutputStream r3, org.tukaani.xz.simple.SimpleFilter r4) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r2.filterBuf = r0
            r0 = 0
            r2.pos = r0
            r2.unfiltered = r0
            r1 = 0
            r2.exception = r1
            r2.finished = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r2.tempBuf = r0
            r3.getClass()
            r2.out = r3
            r2.simpleFilter = r4
            return
    }

    static int getMemoryUsage() {
            r0 = 5
            return r0
    }

    private void writePending() throws java.io.IOException {
            r4 = this;
            java.io.IOException r0 = r4.exception
            if (r0 != 0) goto L17
            org.tukaani.xz.FinishableOutputStream r0 = r4.out     // Catch: java.io.IOException -> L13
            byte[] r1 = r4.filterBuf     // Catch: java.io.IOException -> L13
            int r2 = r4.pos     // Catch: java.io.IOException -> L13
            int r3 = r4.unfiltered     // Catch: java.io.IOException -> L13
            r0.write(r1, r2, r3)     // Catch: java.io.IOException -> L13
            r0 = 1
            r4.finished = r0
            return
        L13:
            r0 = move-exception
            r4.exception = r0
            throw r0
        L17:
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.FinishableOutputStream r0 = r2.out
            if (r0 == 0) goto L1b
            boolean r0 = r2.finished
            if (r0 != 0) goto Lb
            r2.writePending()     // Catch: java.io.IOException -> Lb
        Lb:
            org.tukaani.xz.FinishableOutputStream r0 = r2.out     // Catch: java.io.IOException -> L11
            r0.close()     // Catch: java.io.IOException -> L11
            goto L18
        L11:
            r0 = move-exception
            java.io.IOException r1 = r2.exception
            if (r1 != 0) goto L18
            r2.exception = r0
        L18:
            r0 = 0
            r2.out = r0
        L1b:
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L20
            return
        L20:
            throw r0
    }

    @Override // org.tukaani.xz.FinishableOutputStream
    public void finish() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto L11
            r1.writePending()
            org.tukaani.xz.FinishableOutputStream r0 = r1.out     // Catch: java.io.IOException -> Ld
            r0.finish()     // Catch: java.io.IOException -> Ld
            goto L11
        Ld:
            r0 = move-exception
            r1.exception = r0
            throw r0
        L11:
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r1 = "Flushing is not supported"
            r0.<init>(r1)
            throw r0
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
            if (r7 < 0) goto L6d
            if (r8 < 0) goto L6d
            int r0 = r7 + r8
            if (r0 < 0) goto L6d
            int r1 = r6.length
            if (r0 > r1) goto L6d
            java.io.IOException r0 = r5.exception
            if (r0 != 0) goto L6c
            boolean r0 = r5.finished
            if (r0 != 0) goto L64
        L13:
            if (r8 <= 0) goto L63
            int r0 = r5.pos
            int r1 = r5.unfiltered
            int r0 = r0 + r1
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = 4096 - r0
            int r0 = java.lang.Math.min(r8, r0)
            byte[] r2 = r5.filterBuf
            int r3 = r5.pos
            int r4 = r5.unfiltered
            int r3 = r3 + r4
            java.lang.System.arraycopy(r6, r7, r2, r3, r0)
            int r7 = r7 + r0
            int r8 = r8 - r0
            int r2 = r5.unfiltered
            int r2 = r2 + r0
            r5.unfiltered = r2
            org.tukaani.xz.simple.SimpleFilter r0 = r5.simpleFilter
            byte[] r3 = r5.filterBuf
            int r4 = r5.pos
            int r0 = r0.code(r3, r4, r2)
            int r2 = r5.unfiltered
            int r2 = r2 - r0
            r5.unfiltered = r2
            org.tukaani.xz.FinishableOutputStream r2 = r5.out     // Catch: java.io.IOException -> L5f
            byte[] r3 = r5.filterBuf     // Catch: java.io.IOException -> L5f
            int r4 = r5.pos     // Catch: java.io.IOException -> L5f
            r2.write(r3, r4, r0)     // Catch: java.io.IOException -> L5f
            int r2 = r5.pos
            int r2 = r2 + r0
            r5.pos = r2
            int r0 = r5.unfiltered
            int r3 = r2 + r0
            if (r3 != r1) goto L13
            byte[] r1 = r5.filterBuf
            r3 = 0
            java.lang.System.arraycopy(r1, r2, r1, r3, r0)
            r5.pos = r3
            goto L13
        L5f:
            r6 = move-exception
            r5.exception = r6
            throw r6
        L63:
            return
        L64:
            org.tukaani.xz.XZIOException r6 = new org.tukaani.xz.XZIOException
            java.lang.String r7 = "Stream finished or closed"
            r6.<init>(r7)
            throw r6
        L6c:
            throw r0
        L6d:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            r6.<init>()
            throw r6
    }
}
