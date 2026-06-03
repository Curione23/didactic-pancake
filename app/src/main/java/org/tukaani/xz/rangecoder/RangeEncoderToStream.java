package org.tukaani.xz.rangecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class RangeEncoderToStream extends org.tukaani.xz.rangecoder.RangeEncoder {
    private final java.io.OutputStream out;

    public RangeEncoderToStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            r0.out = r1
            r0.reset()
            return
    }

    @Override // org.tukaani.xz.rangecoder.RangeEncoder
    void writeByte(int r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.write(r2)
            return
    }
}
