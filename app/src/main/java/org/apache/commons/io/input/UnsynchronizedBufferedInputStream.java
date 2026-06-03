package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsynchronizedBufferedInputStream extends org.apache.commons.io.input.UnsynchronizedFilterInputStream {
    protected volatile byte[] buffer;
    protected int count;
    protected int markLimit;
    protected int markPos;
    protected int pos;

    /* JADX INFO: renamed from: org.apache.commons.io.input.UnsynchronizedBufferedInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.UnsynchronizedBufferedInputStream, org.apache.commons.io.input.UnsynchronizedBufferedInputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.UnsynchronizedBufferedInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.UnsynchronizedBufferedInputStream get() throws java.io.IOException {
                r4 = this;
                org.apache.commons.io.input.UnsynchronizedBufferedInputStream r0 = new org.apache.commons.io.input.UnsynchronizedBufferedInputStream
                java.io.InputStream r1 = r4.getInputStream()
                int r2 = r4.getBufferSize()
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    private UnsynchronizedBufferedInputStream(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.markPos = r1
            if (r2 <= 0) goto Ld
            byte[] r1 = new byte[r2]
            r0.buffer = r1
            return
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Size must be > 0"
            r1.<init>(r2)
            throw r1
    }

    /* synthetic */ UnsynchronizedBufferedInputStream(java.io.InputStream r1, int r2, org.apache.commons.io.input.UnsynchronizedBufferedInputStream.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private int fillBuffer(java.io.InputStream r6, byte[] r7) throws java.io.IOException {
            r5 = this;
            int r0 = r5.markPos
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L45
            int r3 = r5.pos
            int r3 = r3 - r0
            int r4 = r5.markLimit
            if (r3 < r4) goto Le
            goto L45
        Le:
            if (r0 != 0) goto L24
            int r2 = r7.length
            if (r4 <= r2) goto L24
            int r0 = r7.length
            int r0 = r0 * 2
            if (r0 <= r4) goto L19
            goto L1a
        L19:
            r4 = r0
        L1a:
            byte[] r0 = new byte[r4]
            int r2 = r7.length
            java.lang.System.arraycopy(r7, r1, r0, r1, r2)
            r5.buffer = r0
            r7 = r0
            goto L2b
        L24:
            if (r0 <= 0) goto L2b
            int r2 = r7.length
            int r2 = r2 - r0
            java.lang.System.arraycopy(r7, r0, r7, r1, r2)
        L2b:
            int r0 = r5.pos
            int r2 = r5.markPos
            int r0 = r0 - r2
            r5.pos = r0
            r5.markPos = r1
            r5.count = r1
            int r1 = r7.length
            int r1 = r1 - r0
            int r6 = r6.read(r7, r0, r1)
            int r7 = r5.pos
            if (r6 > 0) goto L41
            goto L42
        L41:
            int r7 = r7 + r6
        L42:
            r5.count = r7
            return r6
        L45:
            int r6 = r6.read(r7)
            if (r6 <= 0) goto L51
            r5.markPos = r2
            r5.pos = r1
            r5.count = r6
        L51:
            return r6
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r3 = this;
            java.io.InputStream r0 = r3.inputStream
            byte[] r1 = r3.buffer
            if (r1 == 0) goto L13
            if (r0 == 0) goto L13
            int r1 = r3.count
            int r2 = r3.pos
            int r1 = r1 - r2
            int r0 = r0.available()
            int r1 = r1 + r0
            return r1
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.buffer = r0
            java.io.InputStream r1 = r2.inputStream
            r2.inputStream = r0
            if (r1 == 0) goto Lc
            r1.close()
        Lc:
            return
    }

    byte[] getBuffer() {
            r1 = this;
            byte[] r0 = r1.buffer
            return r0
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream
    public void mark(int r1) {
            r0 = this;
            r0.markLimit = r1
            int r1 = r0.pos
            r0.markPos = r1
            return
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r6 = this;
            byte[] r0 = r6.buffer
            java.io.InputStream r1 = r6.inputStream
            java.lang.String r2 = "Stream is closed"
            if (r0 == 0) goto L38
            if (r1 == 0) goto L38
            int r3 = r6.pos
            int r4 = r6.count
            r5 = -1
            if (r3 < r4) goto L18
            int r1 = r6.fillBuffer(r1, r0)
            if (r1 != r5) goto L18
            return r5
        L18:
            byte[] r1 = r6.buffer
            if (r0 == r1) goto L27
            byte[] r0 = r6.buffer
            if (r0 == 0) goto L21
            goto L27
        L21:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L27:
            int r1 = r6.count
            int r2 = r6.pos
            int r1 = r1 - r2
            if (r1 <= 0) goto L37
            int r1 = r2 + 1
            r6.pos = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L37:
            return r5
        L38:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            byte[] r0 = r7.buffer
            java.lang.String r1 = "Stream is closed"
            if (r0 == 0) goto L96
            int r2 = r8.length
            int r2 = r2 - r10
            if (r9 > r2) goto L90
            if (r9 < 0) goto L90
            if (r10 < 0) goto L90
            if (r10 != 0) goto L12
            r8 = 0
            return r8
        L12:
            java.io.InputStream r2 = r7.inputStream
            if (r2 == 0) goto L8a
            int r3 = r7.pos
            int r4 = r7.count
            if (r3 >= r4) goto L39
            int r5 = r4 - r3
            if (r5 < r10) goto L22
            r4 = r10
            goto L23
        L22:
            int r4 = r4 - r3
        L23:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)
            int r3 = r7.pos
            int r3 = r3 + r4
            r7.pos = r3
            if (r4 == r10) goto L38
            int r3 = r2.available()
            if (r3 != 0) goto L34
            goto L38
        L34:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L3a
        L38:
            return r4
        L39:
            r3 = r10
        L3a:
            int r4 = r7.markPos
            r5 = -1
            if (r4 != r5) goto L4e
            int r4 = r0.length
            if (r3 < r4) goto L4e
            int r4 = r2.read(r8, r9, r3)
            if (r4 != r5) goto L7c
            if (r3 != r10) goto L4b
            goto L4d
        L4b:
            int r5 = r10 - r3
        L4d:
            return r5
        L4e:
            int r4 = r7.fillBuffer(r2, r0)
            if (r4 != r5) goto L5a
            if (r3 != r10) goto L57
            goto L59
        L57:
            int r5 = r10 - r3
        L59:
            return r5
        L5a:
            byte[] r4 = r7.buffer
            if (r0 == r4) goto L69
            byte[] r0 = r7.buffer
            if (r0 == 0) goto L63
            goto L69
        L63:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r1)
            throw r8
        L69:
            int r4 = r7.count
            int r5 = r7.pos
            int r6 = r4 - r5
            if (r6 < r3) goto L73
            r4 = r3
            goto L74
        L73:
            int r4 = r4 - r5
        L74:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)
            int r5 = r7.pos
            int r5 = r5 + r4
            r7.pos = r5
        L7c:
            int r3 = r3 - r4
            if (r3 != 0) goto L80
            return r10
        L80:
            int r5 = r2.available()
            if (r5 != 0) goto L88
            int r10 = r10 - r3
            return r10
        L88:
            int r9 = r9 + r4
            goto L3a
        L8a:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r1)
            throw r8
        L90:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            r8.<init>()
            throw r8
        L96:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r1)
            throw r8
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.buffer
            if (r0 == 0) goto L14
            int r0 = r2.markPos
            r1 = -1
            if (r1 == r0) goto Lc
            r2.pos = r0
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Mark has been invalidated"
            r0.<init>(r1)
            throw r0
        L14:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.io.input.UnsynchronizedFilterInputStream, java.io.InputStream
    public long skip(long r9) throws java.io.IOException {
            r8 = this;
            byte[] r0 = r8.buffer
            java.io.InputStream r1 = r8.inputStream
            java.lang.String r2 = "Stream is closed"
            if (r0 == 0) goto L64
            r3 = 1
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L11
            r9 = 0
            return r9
        L11:
            if (r1 == 0) goto L5e
            int r2 = r8.count
            int r3 = r8.pos
            int r4 = r2 - r3
            long r4 = (long) r4
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 < 0) goto L23
            int r0 = (int) r9
            int r3 = r3 + r0
            r8.pos = r3
            return r9
        L23:
            int r3 = r2 - r3
            r8.pos = r2
            int r2 = r8.markPos
            r4 = -1
            if (r2 == r4) goto L56
            int r2 = r8.markLimit
            long r5 = (long) r2
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 > 0) goto L56
            int r0 = r8.fillBuffer(r1, r0)
            if (r0 != r4) goto L3b
            long r9 = (long) r3
            return r9
        L3b:
            int r0 = r8.count
            int r1 = r8.pos
            int r2 = r0 - r1
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r9 - r6
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L4f
            int r0 = (int) r9
            int r0 = r0 - r3
            int r1 = r1 + r0
            r8.pos = r1
            return r9
        L4f:
            int r9 = r0 - r1
            int r3 = r3 + r9
            r8.pos = r0
            long r9 = (long) r3
            return r9
        L56:
            long r2 = (long) r3
            long r9 = r9 - r2
            long r9 = r1.skip(r9)
            long r2 = r2 + r9
            return r2
        L5e:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r2)
            throw r9
        L64:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r2)
            throw r9
    }
}
