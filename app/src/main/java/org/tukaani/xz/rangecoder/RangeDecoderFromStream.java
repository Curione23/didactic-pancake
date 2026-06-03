package org.tukaani.xz.rangecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class RangeDecoderFromStream extends org.tukaani.xz.rangecoder.RangeDecoder {
    private final java.io.DataInputStream inData;

    public RangeDecoderFromStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r2)
            r1.inData = r0
            int r2 = r0.readUnsignedByte()
            if (r2 != 0) goto L1a
            int r2 = r0.readInt()
            r1.code = r2
            r2 = -1
            r1.range = r2
            return
        L1a:
            org.tukaani.xz.CorruptedInputException r2 = new org.tukaani.xz.CorruptedInputException
            r2.<init>()
            throw r2
    }

    public boolean isFinished() {
            r1 = this;
            int r0 = r1.code
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // org.tukaani.xz.rangecoder.RangeDecoder
    public void normalize() throws java.io.IOException {
            r2 = this;
            int r0 = r2.range
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            if (r0 != 0) goto L1a
            int r0 = r2.code
            int r0 = r0 << 8
            java.io.DataInputStream r1 = r2.inData
            int r1 = r1.readUnsignedByte()
            r0 = r0 | r1
            r2.code = r0
            int r0 = r2.range
            int r0 = r0 << 8
            r2.range = r0
        L1a:
            return
    }
}
