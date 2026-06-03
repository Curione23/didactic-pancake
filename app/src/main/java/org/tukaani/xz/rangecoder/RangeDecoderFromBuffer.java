package org.tukaani.xz.rangecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class RangeDecoderFromBuffer extends org.tukaani.xz.rangecoder.RangeDecoder {
    private static final int INIT_SIZE = 5;
    private final byte[] buf;
    private int pos;

    public RangeDecoderFromBuffer(int r2, org.tukaani.xz.ArrayCache r3) {
            r1 = this;
            r1.<init>()
            int r2 = r2 + (-5)
            r0 = 0
            byte[] r2 = r3.getByteArray(r2, r0)
            r1.buf = r2
            int r2 = r2.length
            r1.pos = r2
            return
    }

    public boolean isFinished() {
            r2 = this;
            int r0 = r2.pos
            byte[] r1 = r2.buf
            int r1 = r1.length
            if (r0 != r1) goto Ld
            int r0 = r2.code
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // org.tukaani.xz.rangecoder.RangeDecoder
    public void normalize() throws java.io.IOException {
            r4 = this;
            int r0 = r4.range
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            if (r0 != 0) goto L27
            int r0 = r4.code     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            int r0 = r0 << 8
            byte[] r1 = r4.buf     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            int r2 = r4.pos     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            int r3 = r2 + 1
            r4.pos = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            r1 = r1[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            r4.code = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            int r0 = r4.range     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            int r0 = r0 << 8
            r4.range = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L21
            goto L27
        L21:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            throw r0
        L27:
            return
    }

    public void prepareInputBuffer(java.io.DataInputStream r3, int r4) throws java.io.IOException {
            r2 = this;
            r0 = 5
            if (r4 < r0) goto L24
            int r0 = r3.readUnsignedByte()
            if (r0 != 0) goto L1e
            int r0 = r3.readInt()
            r2.code = r0
            r0 = -1
            r2.range = r0
            int r4 = r4 + (-5)
            byte[] r0 = r2.buf
            int r1 = r0.length
            int r1 = r1 - r4
            r2.pos = r1
            r3.readFully(r0, r1, r4)
            return
        L1e:
            org.tukaani.xz.CorruptedInputException r3 = new org.tukaani.xz.CorruptedInputException
            r3.<init>()
            throw r3
        L24:
            org.tukaani.xz.CorruptedInputException r3 = new org.tukaani.xz.CorruptedInputException
            r3.<init>()
            throw r3
    }

    public void putArraysToCache(org.tukaani.xz.ArrayCache r2) {
            r1 = this;
            byte[] r0 = r1.buf
            r2.putArray(r0)
            return
    }
}
