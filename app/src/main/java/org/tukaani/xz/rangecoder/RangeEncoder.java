package org.tukaani.xz.rangecoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RangeEncoder extends org.tukaani.xz.rangecoder.RangeCoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BIT_PRICE_SHIFT_BITS = 4;
    private static final int MOVE_REDUCING_BITS = 4;
    private static final int[] prices = null;
    private byte cache;
    long cacheSize;
    private long low;
    private int range;

    static {
            r0 = 128(0x80, float:1.8E-43)
            int[] r0 = new int[r0]
            org.tukaani.xz.rangecoder.RangeEncoder.prices = r0
            r0 = 8
        L8:
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L2d
            r1 = 0
            r3 = r0
            r2 = r1
        Lf:
            r4 = 4
            if (r1 >= r4) goto L22
            int r3 = r3 * r3
            int r2 = r2 << 1
        L15:
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r3
            if (r4 == 0) goto L1f
            int r3 = r3 >>> 1
            int r2 = r2 + 1
            goto L15
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            int[] r1 = org.tukaani.xz.rangecoder.RangeEncoder.prices
            int r3 = r0 >> 4
            int r2 = 161 - r2
            r1[r3] = r2
            int r0 = r0 + 16
            goto L8
        L2d:
            return
    }

    public RangeEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getBitPrice(int r1, int r2) {
            int[] r0 = org.tukaani.xz.rangecoder.RangeEncoder.prices
            int r2 = -r2
            r2 = r2 & 2047(0x7ff, float:2.868E-42)
            r1 = r1 ^ r2
            int r1 = r1 >>> 4
            r1 = r0[r1]
            return r1
    }

    public static int getBitTreePrice(short[] r4, int r5) {
            int r0 = r4.length
            r5 = r5 | r0
            r0 = 0
        L3:
            r1 = r5 & 1
            r2 = 1
            int r5 = r5 >>> r2
            short r3 = r4[r5]
            int r1 = getBitPrice(r3, r1)
            int r0 = r0 + r1
            if (r5 != r2) goto L3
            return r0
    }

    public static int getDirectBitsPrice(int r0) {
            int r0 = r0 << 4
            return r0
    }

    public static int getReverseBitTreePrice(short[] r5, int r6) {
            int r0 = r5.length
            r6 = r6 | r0
            r0 = 0
            r1 = 1
            r2 = r1
        L5:
            r3 = r6 & 1
            int r6 = r6 >>> r1
            short r4 = r5[r2]
            int r4 = getBitPrice(r4, r3)
            int r0 = r0 + r4
            int r2 = r2 << r1
            r2 = r2 | r3
            if (r6 != r1) goto L5
            return r0
    }

    private void shiftLow() throws java.io.IOException {
            r7 = this;
            long r0 = r7.low
            r2 = 32
            long r2 = r0 >>> r2
            int r2 = (int) r2
            r3 = 1
            if (r2 != 0) goto L14
            r5 = 4278190080(0xff000000, double:2.113706745E-314)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2e
        L14:
            byte r0 = r7.cache
        L16:
            int r0 = r0 + r2
            r7.writeByte(r0)
            long r0 = r7.cacheSize
            long r0 = r0 - r3
            r7.cacheSize = r0
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L3f
            long r0 = r7.low
            r2 = 24
            long r0 = r0 >>> r2
            int r0 = (int) r0
            byte r0 = (byte) r0
            r7.cache = r0
        L2e:
            long r0 = r7.cacheSize
            long r0 = r0 + r3
            r7.cacheSize = r0
            long r0 = r7.low
            r2 = 16777215(0xffffff, double:8.2890456E-317)
            long r0 = r0 & r2
            r2 = 8
            long r0 = r0 << r2
            r7.low = r0
            return
        L3f:
            r0 = 255(0xff, float:3.57E-43)
            goto L16
    }

    public void encodeBit(short[] r10, int r11, int r12) throws java.io.IOException {
            r9 = this;
            short r0 = r10[r11]
            int r1 = r9.range
            int r2 = r1 >>> 11
            int r2 = r2 * r0
            if (r12 != 0) goto L14
            r9.range = r2
            int r12 = 2048 - r0
            int r12 = r12 >>> 5
            int r0 = r0 + r12
            short r12 = (short) r0
            r10[r11] = r12
            goto L29
        L14:
            long r3 = r9.low
            long r5 = (long) r2
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r3 = r3 + r5
            r9.low = r3
            int r1 = r1 - r2
            r9.range = r1
            int r12 = r0 >>> 5
            int r0 = r0 - r12
            short r12 = (short) r0
            r10[r11] = r12
        L29:
            int r10 = r9.range
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = r11 & r10
            if (r11 != 0) goto L37
            int r10 = r10 << 8
            r9.range = r10
            r9.shiftLow()
        L37:
            return
    }

    public void encodeBitTree(short[] r5, int r6) throws java.io.IOException {
            r4 = this;
            int r0 = r5.length
            r1 = 1
            r2 = r1
        L3:
            int r0 = r0 >>> r1
            r3 = r6 & r0
            r4.encodeBit(r5, r2, r3)
            int r2 = r2 << r1
            if (r3 == 0) goto Le
            r2 = r2 | 1
        Le:
            if (r0 != r1) goto L3
            return
    }

    public void encodeDirectBits(int r6, int r7) throws java.io.IOException {
            r5 = this;
        L0:
            int r0 = r5.range
            int r0 = r0 >>> 1
            r5.range = r0
            long r1 = r5.low
            int r7 = r7 + (-1)
            int r3 = r6 >>> r7
            r3 = r3 & 1
            int r3 = 0 - r3
            r3 = r3 & r0
            long r3 = (long) r3
            long r1 = r1 + r3
            r5.low = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            if (r1 != 0) goto L21
            int r0 = r0 << 8
            r5.range = r0
            r5.shiftLow()
        L21:
            if (r7 != 0) goto L0
            return
    }

    public void encodeReverseBitTree(short[] r4, int r5) throws java.io.IOException {
            r3 = this;
            int r0 = r4.length
            r5 = r5 | r0
            r0 = 1
            r1 = r0
        L4:
            r2 = r5 & 1
            int r5 = r5 >>> r0
            r3.encodeBit(r4, r1, r2)
            int r1 = r1 << r0
            r1 = r1 | r2
            if (r5 != r0) goto L4
            return
    }

    public int finish() throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            r1 = 5
            if (r0 >= r1) goto La
            r2.shiftLow()
            int r0 = r0 + 1
            goto L1
        La:
            r0 = -1
            return r0
    }

    public int getPendingSize() {
            r1 = this;
            java.lang.Error r0 = new java.lang.Error
            r0.<init>()
            throw r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.low = r0
            r0 = -1
            r2.range = r0
            r0 = 0
            r2.cache = r0
            r0 = 1
            r2.cacheSize = r0
            return
    }

    abstract void writeByte(int r1) throws java.io.IOException;
}
