package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class BaseNCodecOutputStream extends java.io.FilterOutputStream {
    private final org.apache.commons.codec.binary.BaseNCodec baseNCodec;
    private final org.apache.commons.codec.binary.BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecOutputStream(java.io.OutputStream r1, org.apache.commons.codec.binary.BaseNCodec r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            byte[] r1 = new byte[r1]
            r0.singleByte = r1
            org.apache.commons.codec.binary.BaseNCodec$Context r1 = new org.apache.commons.codec.binary.BaseNCodec$Context
            r1.<init>()
            r0.context = r1
            r0.baseNCodec = r2
            r0.doEncode = r3
            return
    }

    private void flush(boolean r6) throws java.io.IOException {
            r5 = this;
            org.apache.commons.codec.binary.BaseNCodec r0 = r5.baseNCodec
            org.apache.commons.codec.binary.BaseNCodec$Context r1 = r5.context
            int r0 = r0.available(r1)
            if (r0 <= 0) goto L1c
            byte[] r1 = new byte[r0]
            org.apache.commons.codec.binary.BaseNCodec r2 = r5.baseNCodec
            org.apache.commons.codec.binary.BaseNCodec$Context r3 = r5.context
            r4 = 0
            int r0 = r2.readResults(r1, r4, r0, r3)
            if (r0 <= 0) goto L1c
            java.io.OutputStream r2 = r5.out
            r2.write(r1, r4, r0)
        L1c:
            if (r6 == 0) goto L23
            java.io.OutputStream r6 = r5.out
            r6.flush()
        L23:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r1.eof()
            r1.flush()
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    public void eof() {
            r5 = this;
            boolean r0 = r5.doEncode
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L10
            org.apache.commons.codec.binary.BaseNCodec r0 = r5.baseNCodec
            byte[] r3 = r5.singleByte
            org.apache.commons.codec.binary.BaseNCodec$Context r4 = r5.context
            r0.encode(r3, r2, r1, r4)
            goto L19
        L10:
            org.apache.commons.codec.binary.BaseNCodec r0 = r5.baseNCodec
            byte[] r3 = r5.singleByte
            org.apache.commons.codec.binary.BaseNCodec$Context r4 = r5.context
            r0.decode(r3, r2, r1, r4)
        L19:
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.flush(r0)
            return
    }

    public boolean isStrictDecoding() {
            r1 = this;
            org.apache.commons.codec.binary.BaseNCodec r0 = r1.baseNCodec
            boolean r0 = r0.isStrictDecoding()
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.singleByte
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.write(r0, r1, r3)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r3, r0)
            if (r4 < 0) goto L31
            if (r5 < 0) goto L31
            int r0 = r3.length
            if (r4 > r0) goto L2b
            int r0 = r4 + r5
            int r1 = r3.length
            if (r0 > r1) goto L2b
            if (r5 <= 0) goto L2a
            boolean r0 = r2.doEncode
            if (r0 == 0) goto L1f
            org.apache.commons.codec.binary.BaseNCodec r0 = r2.baseNCodec
            org.apache.commons.codec.binary.BaseNCodec$Context r1 = r2.context
            r0.encode(r3, r4, r5, r1)
            goto L26
        L1f:
            org.apache.commons.codec.binary.BaseNCodec r0 = r2.baseNCodec
            org.apache.commons.codec.binary.BaseNCodec$Context r1 = r2.context
            r0.decode(r3, r4, r5, r1)
        L26:
            r3 = 0
            r2.flush(r3)
        L2a:
            return
        L2b:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
        L31:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }
}
