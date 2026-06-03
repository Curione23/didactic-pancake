package org.apache.commons.compress.compressors.xz;

/* JADX INFO: loaded from: classes2.dex */
public class XZCompressorOutputStream extends org.apache.commons.compress.compressors.CompressorOutputStream<org.tukaani.xz.XZOutputStream> {
    public XZCompressorOutputStream(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.XZOutputStream r0 = new org.tukaani.xz.XZOutputStream
            org.tukaani.xz.LZMA2Options r1 = new org.tukaani.xz.LZMA2Options
            r1.<init>()
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
    }

    public XZCompressorOutputStream(java.io.OutputStream r3, int r4) throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.XZOutputStream r0 = new org.tukaani.xz.XZOutputStream
            org.tukaani.xz.LZMA2Options r1 = new org.tukaani.xz.LZMA2Options
            r1.<init>(r4)
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
    }

    public void finish() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out()
            org.tukaani.xz.XZOutputStream r0 = (org.tukaani.xz.XZOutputStream) r0
            r0.finish()
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
