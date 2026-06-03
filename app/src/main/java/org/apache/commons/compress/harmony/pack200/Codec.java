package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Codec {
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec BCI5 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec BRANCH5 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec BYTE1 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec CHAR3 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec DELTA5 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec MDELTA5 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec SIGNED5 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec UDELTA5 = null;
    public static final org.apache.commons.compress.harmony.pack200.BHSDCodec UNSIGNED5 = null;
    public int lastBandLength;

    static {
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r1 = 5
            r2 = 4
            r0.<init>(r1, r2)
            org.apache.commons.compress.harmony.pack200.Codec.BCI5 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r3 = 2
            r0.<init>(r1, r2, r3)
            org.apache.commons.compress.harmony.pack200.Codec.BRANCH5 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2 = 256(0x100, float:3.59E-43)
            r4 = 1
            r0.<init>(r4, r2)
            org.apache.commons.compress.harmony.pack200.Codec.BYTE1 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2 = 3
            r5 = 128(0x80, float:1.8E-43)
            r0.<init>(r2, r5)
            org.apache.commons.compress.harmony.pack200.Codec.CHAR3 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r2 = 64
            r0.<init>(r1, r2, r4, r4)
            org.apache.commons.compress.harmony.pack200.Codec.DELTA5 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r0.<init>(r1, r2, r3, r4)
            org.apache.commons.compress.harmony.pack200.Codec.MDELTA5 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r0.<init>(r1, r2, r4)
            org.apache.commons.compress.harmony.pack200.Codec.SIGNED5 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r3 = 0
            r0.<init>(r1, r2, r3, r4)
            org.apache.commons.compress.harmony.pack200.Codec.UDELTA5 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            r0.<init>(r1, r2)
            org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5 = r0
            return
    }

    public Codec() {
            r0 = this;
            r0.<init>()
            return
    }

    int check(int r11, java.io.InputStream r12) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r10 = this;
            boolean r0 = r12 instanceof org.apache.commons.io.input.BoundedInputStream
            if (r0 == 0) goto L5e
            org.apache.commons.io.input.BoundedInputStream r12 = (org.apache.commons.io.input.BoundedInputStream) r12
            long r0 = r12.getCount()
            long r2 = r12.getMaxCount()
            r4 = -1
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 <= 0) goto L5e
            long r6 = r2 - r0
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            java.lang.String r4 = "Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)"
            if (r12 < 0) goto L40
            long r8 = (long) r11
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 > 0) goto L22
            goto L5e
        L22:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r12 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r1, r2}
            java.lang.String r11 = java.lang.String.format(r4, r11)
            r12.<init>(r11)
            throw r12
        L40:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r12 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r1, r2}
            java.lang.String r11 = java.lang.String.format(r4, r11)
            r12.<init>(r11)
            throw r12
        L5e:
            return r11
    }

    public abstract int decode(java.io.InputStream r1) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception;

    public abstract int decode(java.io.InputStream r1, long r2) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception;

    public int[] decodeInts(int r5, java.io.InputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            r0 = 0
            r4.lastBandLength = r0
            int r1 = r4.check(r5, r6)
            int[] r1 = new int[r1]
            r2 = r0
        La:
            if (r0 >= r5) goto L16
            long r2 = (long) r2
            int r2 = r4.decode(r6, r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto La
        L16:
            return r1
    }

    public int[] decodeInts(int r6, java.io.InputStream r7, int r8) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            int r0 = r5.check(r6, r7)
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r2 = 0
            r0[r2] = r8
            r2 = r1
        Lc:
            int r3 = r6 + 1
            if (r2 >= r3) goto L1a
            long r3 = (long) r8
            int r8 = r5.decode(r7, r3)
            r0[r2] = r8
            int r2 = r2 + 1
            goto Lc
        L1a:
            return r0
    }

    public abstract byte[] encode(int r1) throws org.apache.commons.compress.harmony.pack200.Pack200Exception;

    public abstract byte[] encode(int r1, int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception;

    public byte[] encode(int[] r8) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            int r0 = r8.length
            byte[][] r1 = new byte[r0][]
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            int r5 = r8.length
            if (r3 >= r5) goto L1e
            r5 = r8[r3]
            if (r3 <= 0) goto L12
            int r6 = r3 + (-1)
            r6 = r8[r6]
            goto L13
        L12:
            r6 = r2
        L13:
            byte[] r5 = r7.encode(r5, r6)
            r1[r3] = r5
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L6
        L1e:
            byte[] r8 = new byte[r4]
            r3 = r2
            r4 = r3
        L22:
            if (r3 >= r0) goto L2f
            r5 = r1[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r2, r8, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L22
        L2f:
            return r8
    }
}
