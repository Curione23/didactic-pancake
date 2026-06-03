package org.apache.commons.io.input.buffer;

/* JADX INFO: loaded from: classes2.dex */
public class CircularBufferInputStream extends java.io.FilterInputStream {
    protected final org.apache.commons.io.input.buffer.CircularByteBuffer buffer;
    protected final int bufferSize;
    private boolean eof;

    public CircularBufferInputStream(java.io.InputStream r2) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    public CircularBufferInputStream(java.io.InputStream r3, int r4) {
            r2 = this;
            java.lang.String r0 = "inputStream"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r0)
            java.io.InputStream r3 = (java.io.InputStream) r3
            r2.<init>(r3)
            if (r4 <= 0) goto L1a
            org.apache.commons.io.input.buffer.CircularByteBuffer r3 = new org.apache.commons.io.input.buffer.CircularByteBuffer
            r3.<init>(r4)
            r2.buffer = r3
            r2.bufferSize = r4
            r3 = 0
            r2.eof = r3
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal bufferSize: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            super.close()
            r0 = 1
            r1.eof = r0
            org.apache.commons.io.input.buffer.CircularByteBuffer r0 = r1.buffer
            r0.clear()
            return
    }

    protected void fillBuffer() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.eof
            if (r0 == 0) goto L5
            return
        L5:
            org.apache.commons.io.input.buffer.CircularByteBuffer r0 = r5.buffer
            int r0 = r0.getSpace()
            byte[] r1 = org.apache.commons.io.IOUtils.byteArray(r0)
        Lf:
            if (r0 <= 0) goto L28
            java.io.InputStream r2 = r5.in
            r3 = 0
            int r2 = r2.read(r1, r3, r0)
            r4 = -1
            if (r2 != r4) goto L1f
            r0 = 1
            r5.eof = r0
            return
        L1f:
            if (r2 <= 0) goto Lf
            org.apache.commons.io.input.buffer.CircularByteBuffer r4 = r5.buffer
            r4.add(r1, r3, r2)
            int r0 = r0 - r2
            goto Lf
        L28:
            return
    }

    protected boolean haveBytes(int r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.input.buffer.CircularByteBuffer r0 = r1.buffer
            int r0 = r0.getCurrentNumberOfBytes()
            if (r0 >= r2) goto Lb
            r1.fillBuffer()
        Lb:
            org.apache.commons.io.input.buffer.CircularByteBuffer r2 = r1.buffer
            boolean r2 = r2.hasBytes()
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            r0 = 1
            boolean r0 = r1.haveBytes(r0)
            if (r0 != 0) goto L9
            r0 = -1
            return r0
        L9:
            org.apache.commons.io.input.buffer.CircularByteBuffer r0 = r1.buffer
            byte r0 = r0.read()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "targetBuffer"
            java.util.Objects.requireNonNull(r4, r0)
            if (r5 < 0) goto L34
            if (r6 < 0) goto L2c
            boolean r0 = r3.haveBytes(r6)
            if (r0 != 0) goto L11
            r4 = -1
            return r4
        L11:
            org.apache.commons.io.input.buffer.CircularByteBuffer r0 = r3.buffer
            int r0 = r0.getCurrentNumberOfBytes()
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L1c:
            if (r0 >= r6) goto L2b
            int r1 = r5 + r0
            org.apache.commons.io.input.buffer.CircularByteBuffer r2 = r3.buffer
            byte r2 = r2.read()
            r4[r1] = r2
            int r0 = r0 + 1
            goto L1c
        L2b:
            return r6
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Length must not be negative"
            r4.<init>(r5)
            throw r4
        L34:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Offset must not be negative"
            r4.<init>(r5)
            throw r4
    }
}
