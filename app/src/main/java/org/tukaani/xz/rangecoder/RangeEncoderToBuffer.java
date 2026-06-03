package org.tukaani.xz.rangecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class RangeEncoderToBuffer extends org.tukaani.xz.rangecoder.RangeEncoder {
    private final byte[] buf;
    private int bufPos;

    public RangeEncoderToBuffer(int r2, org.tukaani.xz.ArrayCache r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            byte[] r2 = r3.getByteArray(r2, r0)
            r1.buf = r2
            r1.reset()
            return
    }

    @Override // org.tukaani.xz.rangecoder.RangeEncoder
    public int finish() {
            r1 = this;
            super.finish()     // Catch: java.io.IOException -> L6
            int r0 = r1.bufPos
            return r0
        L6:
            java.lang.Error r0 = new java.lang.Error
            r0.<init>()
            throw r0
    }

    @Override // org.tukaani.xz.rangecoder.RangeEncoder
    public int getPendingSize() {
            r3 = this;
            int r0 = r3.bufPos
            long r1 = r3.cacheSize
            int r1 = (int) r1
            int r0 = r0 + r1
            int r0 = r0 + 4
            return r0
    }

    public void putArraysToCache(org.tukaani.xz.ArrayCache r2) {
            r1 = this;
            byte[] r0 = r1.buf
            r2.putArray(r0)
            return
    }

    @Override // org.tukaani.xz.rangecoder.RangeEncoder
    public void reset() {
            r1 = this;
            super.reset()
            r0 = 0
            r1.bufPos = r0
            return
    }

    public void write(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.buf
            r1 = 0
            int r2 = r3.bufPos
            r4.write(r0, r1, r2)
            return
    }

    @Override // org.tukaani.xz.rangecoder.RangeEncoder
    void writeByte(int r4) {
            r3 = this;
            byte[] r0 = r3.buf
            int r1 = r3.bufPos
            int r2 = r1 + 1
            r3.bufPos = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }
}
