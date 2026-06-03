package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class UncompressedLZMA2OutputStream extends org.tukaani.xz.FinishableOutputStream {
    private final org.tukaani.xz.ArrayCache arrayCache;
    private boolean dictResetNeeded;
    private java.io.IOException exception;
    private boolean finished;
    private org.tukaani.xz.FinishableOutputStream out;
    private final java.io.DataOutputStream outData;
    private final byte[] tempBuf;
    private final byte[] uncompBuf;
    private int uncompPos;

    UncompressedLZMA2OutputStream(org.tukaani.xz.FinishableOutputStream r4, org.tukaani.xz.ArrayCache r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.uncompPos = r0
            r1 = 1
            r3.dictResetNeeded = r1
            r3.finished = r0
            r2 = 0
            r3.exception = r2
            byte[] r1 = new byte[r1]
            r3.tempBuf = r1
            r4.getClass()
            r3.out = r4
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r4)
            r3.outData = r1
            r3.arrayCache = r5
            r4 = 65536(0x10000, float:9.1835E-41)
            byte[] r4 = r5.getByteArray(r4, r0)
            r3.uncompBuf = r4
            return
    }

    static int getMemoryUsage() {
            r0 = 70
            return r0
    }

    private void writeChunk() throws java.io.IOException {
            r4 = this;
            java.io.DataOutputStream r0 = r4.outData
            boolean r1 = r4.dictResetNeeded
            r2 = 1
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = 2
        La:
            r0.writeByte(r1)
            java.io.DataOutputStream r0 = r4.outData
            int r1 = r4.uncompPos
            int r1 = r1 - r2
            r0.writeShort(r1)
            java.io.DataOutputStream r0 = r4.outData
            byte[] r1 = r4.uncompBuf
            int r2 = r4.uncompPos
            r3 = 0
            r0.write(r1, r3, r2)
            r4.uncompPos = r3
            r4.dictResetNeeded = r3
            return
    }

    private void writeEndMarker() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L2c
            boolean r0 = r2.finished
            if (r0 != 0) goto L24
            int r0 = r2.uncompPos     // Catch: java.io.IOException -> L20
            if (r0 <= 0) goto Lf
            r2.writeChunk()     // Catch: java.io.IOException -> L20
        Lf:
            org.tukaani.xz.FinishableOutputStream r0 = r2.out     // Catch: java.io.IOException -> L20
            r1 = 0
            r0.write(r1)     // Catch: java.io.IOException -> L20
            r0 = 1
            r2.finished = r0
            org.tukaani.xz.ArrayCache r0 = r2.arrayCache
            byte[] r1 = r2.uncompBuf
            r0.putArray(r1)
            return
        L20:
            r0 = move-exception
            r2.exception = r0
            throw r0
        L24:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream finished or closed"
            r0.<init>(r1)
            throw r0
        L2c:
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.FinishableOutputStream r0 = r2.out
            if (r0 == 0) goto L1b
            boolean r0 = r2.finished
            if (r0 != 0) goto Lb
            r2.writeEndMarker()     // Catch: java.io.IOException -> Lb
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
            r1.writeEndMarker()
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
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L21
            boolean r0 = r2.finished
            if (r0 != 0) goto L19
            int r0 = r2.uncompPos     // Catch: java.io.IOException -> L15
            if (r0 <= 0) goto Lf
            r2.writeChunk()     // Catch: java.io.IOException -> L15
        Lf:
            org.tukaani.xz.FinishableOutputStream r0 = r2.out     // Catch: java.io.IOException -> L15
            r0.flush()     // Catch: java.io.IOException -> L15
            return
        L15:
            r0 = move-exception
            r2.exception = r0
            throw r0
        L19:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream finished or closed"
            r0.<init>(r1)
            throw r0
        L21:
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
    public void write(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            if (r6 < 0) goto L40
            if (r7 < 0) goto L40
            int r0 = r6 + r7
            if (r0 < 0) goto L40
            int r1 = r5.length
            if (r0 > r1) goto L40
            java.io.IOException r0 = r4.exception
            if (r0 != 0) goto L3f
            boolean r0 = r4.finished
            if (r0 != 0) goto L37
        L13:
            if (r7 <= 0) goto L36
            int r0 = r4.uncompPos     // Catch: java.io.IOException -> L32
            r1 = 65536(0x10000, float:9.1835E-41)
            int r0 = r1 - r0
            int r0 = java.lang.Math.min(r0, r7)     // Catch: java.io.IOException -> L32
            byte[] r2 = r4.uncompBuf     // Catch: java.io.IOException -> L32
            int r3 = r4.uncompPos     // Catch: java.io.IOException -> L32
            java.lang.System.arraycopy(r5, r6, r2, r3, r0)     // Catch: java.io.IOException -> L32
            int r7 = r7 - r0
            int r2 = r4.uncompPos     // Catch: java.io.IOException -> L32
            int r2 = r2 + r0
            r4.uncompPos = r2     // Catch: java.io.IOException -> L32
            if (r2 != r1) goto L13
            r4.writeChunk()     // Catch: java.io.IOException -> L32
            goto L13
        L32:
            r5 = move-exception
            r4.exception = r5
            throw r5
        L36:
            return
        L37:
            org.tukaani.xz.XZIOException r5 = new org.tukaani.xz.XZIOException
            java.lang.String r6 = "Stream finished or closed"
            r5.<init>(r6)
            throw r5
        L3f:
            throw r0
        L40:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
    }
}
