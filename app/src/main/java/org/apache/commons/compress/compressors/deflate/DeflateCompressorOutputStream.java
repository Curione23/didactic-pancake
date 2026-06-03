package org.apache.commons.compress.compressors.deflate;

/* JADX INFO: loaded from: classes2.dex */
public class DeflateCompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<java.util.zip.DeflaterOutputStream> {
    private final java.util.zip.Deflater deflater;

    public DeflateCompressorOutputStream(java.io.OutputStream r2) {
            r1 = this;
            org.apache.commons.compress.compressors.deflate.DeflateParameters r0 = new org.apache.commons.compress.compressors.deflate.DeflateParameters
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public DeflateCompressorOutputStream(java.io.OutputStream r3, org.apache.commons.compress.compressors.deflate.DeflateParameters r4) {
            r2 = this;
            r2.<init>()
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            int r1 = r4.getCompressionLevel()
            boolean r4 = r4.withZlibHeader()
            r4 = r4 ^ 1
            r0.<init>(r1, r4)
            r2.deflater = r0
            java.util.zip.DeflaterOutputStream r4 = new java.util.zip.DeflaterOutputStream
            r4.<init>(r3, r0)
            r2.out = r4
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            java.util.zip.Deflater r0 = r2.deflater
            r0.end()
            return
        Lb:
            r0 = move-exception
            java.util.zip.Deflater r1 = r2.deflater
            r1.end()
            throw r0
    }

    public void finish() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out()
            java.util.zip.DeflaterOutputStream r0 = (java.util.zip.DeflaterOutputStream) r0
            r0.finish()
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.flush()
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2, r3, r4)
            return
    }
}
