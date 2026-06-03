package org.apache.commons.compress.compressors.lzma;

/* JADX INFO: loaded from: classes2.dex */
public class LZMACompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<org.tukaani.xz.LZMAOutputStream> {
    public LZMACompressorOutputStream(java.io.OutputStream r5) throws java.io.IOException {
            r4 = this;
            org.tukaani.xz.LZMAOutputStream r0 = new org.tukaani.xz.LZMAOutputStream
            org.tukaani.xz.LZMA2Options r1 = new org.tukaani.xz.LZMA2Options
            r1.<init>()
            r2 = -1
            r0.<init>(r5, r1, r2)
            r4.<init>(r0)
            return
    }

    public void finish() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out()
            org.tukaani.xz.LZMAOutputStream r0 = (org.tukaani.xz.LZMAOutputStream) r0
            r0.finish()
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r0 = this;
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
