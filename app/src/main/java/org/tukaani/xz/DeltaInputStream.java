package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class DeltaInputStream extends java.io.InputStream {
    public static final int DISTANCE_MAX = 256;
    public static final int DISTANCE_MIN = 1;
    private final org.tukaani.xz.delta.DeltaDecoder delta;
    private java.io.IOException exception;
    private java.io.InputStream in;
    private final byte[] tempBuf;

    public DeltaInputStream(java.io.InputStream r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.exception = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.tempBuf = r0
            r2.getClass()
            r1.in = r2
            org.tukaani.xz.delta.DeltaDecoder r2 = new org.tukaani.xz.delta.DeltaDecoder
            r2.<init>(r3)
            r1.delta = r2
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto Le
            java.io.IOException r1 = r2.exception
            if (r1 != 0) goto Ld
            int r0 = r0.available()
            return r0
        Ld:
            throw r1
        Le:
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
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto L1f
            java.io.IOException r1 = r2.exception
            if (r1 != 0) goto L1e
            int r5 = r0.read(r3, r4, r5)     // Catch: java.io.IOException -> L1a
            r0 = -1
            if (r5 != r0) goto L14
            return r0
        L14:
            org.tukaani.xz.delta.DeltaDecoder r0 = r2.delta
            r0.decode(r3, r4, r5)
            return r5
        L1a:
            r3 = move-exception
            r2.exception = r3
            throw r3
        L1e:
            throw r1
        L1f:
            org.tukaani.xz.XZIOException r3 = new org.tukaani.xz.XZIOException
            java.lang.String r4 = "Stream closed"
            r3.<init>(r4)
            throw r3
    }
}
