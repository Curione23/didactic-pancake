package org.tukaani.xz.rangecoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RangeDecoder extends org.tukaani.xz.rangecoder.RangeCoder {
    int code;
    int range;

    public RangeDecoder() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.range = r0
            r1.code = r0
            return
    }

    public int decodeBit(short[] r4, int r5) throws java.io.IOException {
            r3 = this;
            r3.normalize()
            short r0 = r4[r5]
            int r1 = r3.range
            int r1 = r1 >>> 11
            int r1 = r1 * r0
            int r2 = r3.code
            int r2 = java.lang.Integer.compareUnsigned(r2, r1)
            if (r2 >= 0) goto L1e
            r3.range = r1
            int r1 = 2048 - r0
            int r1 = r1 >>> 5
            int r0 = r0 + r1
            short r0 = (short) r0
            r4[r5] = r0
            r4 = 0
            goto L2f
        L1e:
            int r2 = r3.range
            int r2 = r2 - r1
            r3.range = r2
            int r2 = r3.code
            int r2 = r2 - r1
            r3.code = r2
            int r1 = r0 >>> 5
            int r0 = r0 - r1
            short r0 = (short) r0
            r4[r5] = r0
            r4 = 1
        L2f:
            return r4
    }

    public int decodeBitTree(short[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
        L1:
            int r1 = r0 << 1
            int r0 = r2.decodeBit(r3, r0)
            r0 = r0 | r1
            int r1 = r3.length
            if (r0 < r1) goto L1
            int r3 = r3.length
            int r0 = r0 - r3
            return r0
    }

    public int decodeDirectBits(int r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            r5.normalize()
            int r1 = r5.range
            int r1 = r1 >>> 1
            r5.range = r1
            int r2 = r5.code
            int r3 = r2 - r1
            int r3 = r3 >>> 31
            int r4 = r3 + (-1)
            r1 = r1 & r4
            int r2 = r2 - r1
            r5.code = r2
            int r0 = r0 << 1
            int r1 = 1 - r3
            r0 = r0 | r1
            int r6 = r6 + (-1)
            if (r6 != 0) goto L1
            return r0
    }

    public int decodeReverseBitTree(short[] r7) throws java.io.IOException {
            r6 = this;
            r0 = 1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r6.decodeBit(r7, r3)
            int r3 = r3 << r0
            r3 = r3 | r4
            int r5 = r2 + 1
            int r2 = r4 << r2
            r1 = r1 | r2
            int r2 = r7.length
            if (r3 < r2) goto L13
            return r1
        L13:
            r2 = r5
            goto L4
    }

    public abstract void normalize() throws java.io.IOException;
}
