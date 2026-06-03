package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class DeltaOutputStream extends org.tukaani.xz.FinishableOutputStream {
    private static final int FILTER_BUF_SIZE = 4096;
    private final org.tukaani.xz.delta.DeltaEncoder delta;
    private java.io.IOException exception;
    private final byte[] filterBuf;
    private boolean finished;
    private org.tukaani.xz.FinishableOutputStream out;
    private final byte[] tempBuf;

    DeltaOutputStream(org.tukaani.xz.FinishableOutputStream r2, org.tukaani.xz.DeltaOptions r3) {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.filterBuf = r0
            r0 = 0
            r1.finished = r0
            r0 = 0
            r1.exception = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.tempBuf = r0
            r1.out = r2
            org.tukaani.xz.delta.DeltaEncoder r2 = new org.tukaani.xz.delta.DeltaEncoder
            int r3 = r3.getDistance()
            r2.<init>(r3)
            r1.delta = r2
            return
    }

    static int getMemoryUsage() {
            r0 = 5
            return r0
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.FinishableOutputStream r0 = r2.out
            if (r0 == 0) goto L12
            r0.close()     // Catch: java.io.IOException -> L8
            goto Lf
        L8:
            r0 = move-exception
            java.io.IOException r1 = r2.exception
            if (r1 != 0) goto Lf
            r2.exception = r0
        Lf:
            r0 = 0
            r2.out = r0
        L12:
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L17
            return
        L17:
            throw r0
    }

    @Override // org.tukaani.xz.FinishableOutputStream
    public void finish() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto L16
            java.io.IOException r0 = r1.exception
            if (r0 != 0) goto L15
            org.tukaani.xz.FinishableOutputStream r0 = r1.out     // Catch: java.io.IOException -> L11
            r0.finish()     // Catch: java.io.IOException -> L11
            r0 = 1
            r1.finished = r0
            goto L16
        L11:
            r0 = move-exception
            r1.exception = r0
            throw r0
        L15:
            throw r0
        L16:
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L1a
            boolean r0 = r2.finished
            if (r0 != 0) goto L12
            org.tukaani.xz.FinishableOutputStream r0 = r2.out     // Catch: java.io.IOException -> Le
            r0.flush()     // Catch: java.io.IOException -> Le
            return
        Le:
            r0 = move-exception
            r2.exception = r0
            throw r0
        L12:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "Stream finished or closed"
            r0.<init>(r1)
            throw r0
        L1a:
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
    public void write(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            if (r5 < 0) goto L47
            if (r6 < 0) goto L47
            int r0 = r5 + r6
            if (r0 < 0) goto L47
            int r1 = r4.length
            if (r0 > r1) goto L47
            java.io.IOException r0 = r3.exception
            if (r0 != 0) goto L46
            boolean r0 = r3.finished
            if (r0 != 0) goto L3e
        L13:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r6 <= r0) goto L2a
            org.tukaani.xz.delta.DeltaEncoder r1 = r3.delta     // Catch: java.io.IOException -> L3a
            byte[] r2 = r3.filterBuf     // Catch: java.io.IOException -> L3a
            r1.encode(r4, r5, r0, r2)     // Catch: java.io.IOException -> L3a
            org.tukaani.xz.FinishableOutputStream r0 = r3.out     // Catch: java.io.IOException -> L3a
            byte[] r1 = r3.filterBuf     // Catch: java.io.IOException -> L3a
            r0.write(r1)     // Catch: java.io.IOException -> L3a
            int r5 = r5 + 4096
            int r6 = r6 + (-4096)
            goto L13
        L2a:
            org.tukaani.xz.delta.DeltaEncoder r0 = r3.delta     // Catch: java.io.IOException -> L3a
            byte[] r1 = r3.filterBuf     // Catch: java.io.IOException -> L3a
            r0.encode(r4, r5, r6, r1)     // Catch: java.io.IOException -> L3a
            org.tukaani.xz.FinishableOutputStream r4 = r3.out     // Catch: java.io.IOException -> L3a
            byte[] r5 = r3.filterBuf     // Catch: java.io.IOException -> L3a
            r0 = 0
            r4.write(r5, r0, r6)     // Catch: java.io.IOException -> L3a
            return
        L3a:
            r4 = move-exception
            r3.exception = r4
            throw r4
        L3e:
            org.tukaani.xz.XZIOException r4 = new org.tukaani.xz.XZIOException
            java.lang.String r5 = "Stream finished"
            r4.<init>(r5)
            throw r4
        L46:
            throw r0
        L47:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r4.<init>()
            throw r4
    }
}
