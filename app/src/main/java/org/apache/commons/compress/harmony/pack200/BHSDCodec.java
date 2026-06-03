package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public final class BHSDCodec extends org.apache.commons.compress.harmony.pack200.Codec {
    private final int b;
    private long cardinality;
    private final int d;
    private final int h;
    private final int l;
    private final long largest;
    private final long[] powers;
    private final int s;
    private final long smallest;

    public BHSDCodec(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public BHSDCodec(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public BHSDCodec(int r9, int r10, int r11, int r12) {
            r8 = this;
            r8.<init>()
            r0 = 1
            if (r9 < r0) goto L91
            r1 = 5
            if (r9 > r1) goto L91
            if (r10 < r0) goto L89
            r2 = 256(0x100, float:3.59E-43)
            if (r10 > r2) goto L89
            if (r11 < 0) goto L81
            r3 = 2
            if (r11 > r3) goto L81
            if (r12 < 0) goto L79
            if (r12 > r0) goto L79
            if (r9 != r0) goto L25
            if (r10 != r2) goto L1d
            goto L25
        L1d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "b=1 -> h=256"
            r9.<init>(r10)
            throw r9
        L25:
            if (r10 != r2) goto L32
            if (r9 == r1) goto L2a
            goto L32
        L2a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "h=256 -> b!=5"
            r9.<init>(r10)
            throw r9
        L32:
            r8.b = r9
            r8.h = r10
            r8.s = r11
            r8.d = r12
            int r11 = 256 - r10
            r8.l = r11
            if (r10 != r0) goto L47
            int r11 = r9 * 255
            int r11 = r11 + r0
            long r11 = (long) r11
            r8.cardinality = r11
            goto L60
        L47:
            double r11 = (double) r11
            double r0 = (double) r10
            double r2 = (double) r9
            double r4 = java.lang.Math.pow(r0, r2)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r4
            double r11 = r11 * r6
            int r4 = 1 - r10
            double r4 = (double) r4
            double r11 = r11 / r4
            long r11 = (long) r11
            double r11 = (double) r11
            double r0 = java.lang.Math.pow(r0, r2)
            double r11 = r11 + r0
            long r11 = (long) r11
            r8.cardinality = r11
        L60:
            long r11 = r8.calculateSmallest()
            r8.smallest = r11
            long r11 = r8.calculateLargest()
            r8.largest = r11
            long[] r9 = new long[r9]
            r8.powers = r9
            org.apache.commons.compress.harmony.pack200.BHSDCodec$$ExternalSyntheticLambda0 r11 = new org.apache.commons.compress.harmony.pack200.BHSDCodec$$ExternalSyntheticLambda0
            r11.<init>(r10)
            java.util.Arrays.setAll(r9, r11)
            return
        L79:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "0<=d<=1"
            r9.<init>(r10)
            throw r9
        L81:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "0<=s<=2"
            r9.<init>(r10)
            throw r9
        L89:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "1<=h<=256"
            r9.<init>(r10)
            throw r9
        L91:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "1<=b<=5"
            r9.<init>(r10)
            throw r9
    }

    private long calculateLargest() {
            r6 = this;
            int r0 = r6.d
            r1 = 1
            if (r0 != r1) goto L13
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            int r1 = r6.b
            int r2 = r6.h
            r0.<init>(r1, r2)
            long r0 = r0.largest()
            return r0
        L13:
            int r0 = r6.s
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 != r1) goto L2a
            r0 = 3
            long r4 = r6.cardinality()
            long r4 = r4 * r0
            r0 = 4
            long r4 = r4 / r0
            long r4 = r4 - r2
            goto L40
        L2a:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Unknown s value"
            r0.<init>(r1)
            throw r0
        L32:
            long r0 = r6.cardinality()
            r4 = 2
            long r0 = r0 / r4
            goto L3e
        L3a:
            long r0 = r6.cardinality()
        L3e:
            long r4 = r0 - r2
        L40:
            int r0 = r6.s
            if (r0 != 0) goto L4a
            r0 = 4294967294(0xfffffffe, double:2.12199579E-314)
            goto L4d
        L4a:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L4d:
            long r0 = r0 - r2
            long r0 = java.lang.Math.min(r0, r4)
            return r0
    }

    private long calculateSmallest() {
            r8 = this;
            int r0 = r8.d
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            r3 = 1
            if (r0 == r3) goto L1f
            boolean r0 = r8.isSigned()
            if (r0 != 0) goto Lf
            goto L1f
        Lf:
            long r4 = r8.cardinality()
            long r4 = -r4
            int r0 = r8.s
            int r0 = r3 << r0
            long r6 = (long) r0
            long r4 = r4 / r6
            long r1 = java.lang.Math.max(r1, r4)
            goto L2d
        L1f:
            long r3 = r8.cardinality
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L2b
            goto L2d
        L2b:
            r1 = 0
        L2d:
            return r1
    }

    static /* synthetic */ long lambda$new$0(int r2, int r3) {
            double r0 = (double) r2
            double r2 = (double) r3
            double r2 = java.lang.Math.pow(r0, r2)
            long r2 = (long) r2
            return r2
    }

    public long cardinality() {
            r2 = this;
            long r0 = r2.cardinality
            return r0
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(java.io.InputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int r0 = r2.d
            if (r0 != 0) goto Lb
            r0 = 0
            int r3 = r2.decode(r3, r0)
            return r3
        Lb:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r3 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r0 = "Delta encoding used without passing in last value; this is a coding error"
            r3.<init>(r0)
            throw r3
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(java.io.InputStream r10, long r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r9 = this;
            r0 = 0
            r1 = 0
        L3:
            int r3 = r10.read()
            long r3 = (long) r3
            int r5 = r9.lastBandLength
            r6 = 1
            int r5 = r5 + r6
            r9.lastBandLength = r5
            long[] r5 = r9.powers
            r7 = r5[r0]
            long r7 = r7 * r3
            long r1 = r1 + r7
            int r0 = r0 + r6
            int r5 = r9.l
            long r7 = (long) r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 < 0) goto L20
            int r5 = r9.b
            if (r0 < r5) goto L3
        L20:
            r7 = -1
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L48
            boolean r10 = r9.isSigned()
            if (r10 == 0) goto L3f
            int r10 = r9.s
            int r0 = r6 << r10
            int r0 = r0 - r6
            long r3 = (long) r0
            long r5 = r1 & r3
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L3c
            long r0 = r1 >>> r10
            long r1 = ~r0
            goto L3f
        L3c:
            long r3 = r1 >>> r10
            long r1 = r1 - r3
        L3f:
            boolean r10 = r9.isDelta()
            if (r10 == 0) goto L46
            long r1 = r1 + r11
        L46:
            int r10 = (int) r1
            return r10
        L48:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "End of stream reached whilst decoding"
            r10.<init>(r11)
            throw r10
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int[] decodeInts(int r6, java.io.InputStream r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            int[] r6 = super.decodeInts(r6, r7)
            boolean r7 = r5.isDelta()
            if (r7 == 0) goto L34
            r7 = 0
        Lb:
            int r0 = r6.length
            if (r7 >= r0) goto L34
        Le:
            r0 = r6[r7]
            long r1 = (long) r0
            long r3 = r5.largest
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1f
            long r0 = (long) r0
            long r2 = r5.cardinality
            long r0 = r0 - r2
            int r0 = (int) r0
            r6[r7] = r0
            goto Le
        L1f:
            r0 = r6[r7]
            long r1 = (long) r0
            long r3 = r5.smallest
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L31
            long r1 = r5.cardinality
            int r0 = org.apache.commons.compress.utils.ExactMath.add(r0, r1)
            r6[r7] = r0
            goto L1f
        L31:
            int r7 = r7 + 1
            goto Lb
        L34:
            return r6
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int[] decodeInts(int r5, java.io.InputStream r6, int r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            int[] r5 = super.decodeInts(r5, r6, r7)
            boolean r6 = r4.isDelta()
            if (r6 == 0) goto L34
            r6 = 0
        Lb:
            int r7 = r5.length
            if (r6 >= r7) goto L34
        Le:
            r7 = r5[r6]
            long r0 = (long) r7
            long r2 = r4.largest
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1f
            long r0 = (long) r7
            long r2 = r4.cardinality
            long r0 = r0 - r2
            int r7 = (int) r0
            r5[r6] = r7
            goto Le
        L1f:
            r7 = r5[r6]
            long r0 = (long) r7
            long r2 = r4.smallest
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L31
            long r0 = r4.cardinality
            int r7 = org.apache.commons.compress.utils.ExactMath.add(r7, r0)
            r5[r6] = r7
            goto L1f
        L31:
            int r6 = r6 + 1
            goto Lb
        L34:
            return r5
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            r0 = 0
            byte[] r2 = r1.encode(r2, r0)
            return r2
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int r8, int r9) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            long r0 = (long) r8
            boolean r2 = r7.encodes(r0)
            if (r2 == 0) goto Lb7
            boolean r8 = r7.isDelta()
            if (r8 == 0) goto Lf
            long r8 = (long) r9
            long r0 = r0 - r8
        Lf:
            boolean r8 = r7.isSigned()
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            r4 = 0
            if (r8 == 0) goto L4a
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L25
            long r0 = r0 + r2
            goto L2d
        L25:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L2d
            long r0 = r0 - r2
        L2d:
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L3a
            long r8 = -r0
            int r0 = r7.s
            long r8 = r8 << r0
            r0 = 1
            long r0 = r8 - r0
            goto L55
        L3a:
            int r8 = r7.s
            r9 = 1
            if (r8 != r9) goto L41
            long r0 = r0 << r8
            goto L55
        L41:
            r8 = 3
            long r2 = r0 % r8
            long r2 = r0 - r2
            long r2 = r2 / r8
            long r0 = r0 + r2
            goto L55
        L4a:
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L55
            long r8 = r7.cardinality
            long r8 = java.lang.Math.min(r8, r2)
            long r0 = r0 + r8
        L55:
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 < 0) goto Laf
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r2 = r9
        L60:
            int r3 = r7.b
            if (r2 >= r3) goto L97
            int r3 = r7.l
            long r3 = (long) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L6d
            r3 = r0
            goto L7e
        L6d:
            int r3 = r7.h
            long r3 = (long) r3
            long r3 = r0 % r3
        L72:
            int r5 = r7.l
            long r5 = (long) r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L7e
            int r5 = r7.h
            long r5 = (long) r5
            long r3 = r3 + r5
            goto L72
        L7e:
            int r5 = (int) r3
            byte r5 = (byte) r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r8.add(r5)
            int r5 = r7.l
            long r5 = (long) r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8f
            goto L97
        L8f:
            long r0 = r0 - r3
            int r3 = r7.h
            long r3 = (long) r3
            long r0 = r0 / r3
            int r2 = r2 + 1
            goto L60
        L97:
            int r0 = r8.size()
            byte[] r1 = new byte[r0]
        L9d:
            if (r9 >= r0) goto Lae
            java.lang.Object r2 = r8.get(r9)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            r1[r9] = r2
            int r9 = r9 + 1
            goto L9d
        Lae:
            return r1
        Laf:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r8 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r9 = "unable to encode"
            r8.<init>(r9)
            throw r8
        Lb7:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r9 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The codec "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = " does not encode the value "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    public boolean encodes(long r3) {
            r2 = this;
            long r0 = r2.smallest
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            long r0 = r2.largest
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            r1 = 0
            if (r0 == 0) goto L20
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r4
            int r0 = r4.b
            int r2 = r3.b
            if (r0 != r2) goto L20
            int r0 = r4.h
            int r2 = r3.h
            if (r0 != r2) goto L20
            int r0 = r4.s
            int r2 = r3.s
            if (r0 != r2) goto L20
            int r4 = r4.d
            int r0 = r3.d
            if (r4 != r0) goto L20
            r1 = 1
        L20:
            return r1
    }

    public int getB() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int getH() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public int getL() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public int getS() {
            r1 = this;
            int r0 = r1.s
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.b
            int r0 = r0 * 37
            int r1 = r2.h
            int r0 = r0 + r1
            int r0 = r0 * 37
            int r1 = r2.s
            int r0 = r0 + r1
            int r0 = r0 * 37
            int r1 = r2.d
            int r0 = r0 + r1
            return r0
    }

    public boolean isDelta() {
            r1 = this;
            int r0 = r1.d
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isSigned() {
            r1 = this;
            int r0 = r1.s
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public long largest() {
            r2 = this;
            long r0 = r2.largest
            return r0
    }

    public long smallest() {
            r2 = this;
            long r0 = r2.smallest
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 11
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r2 = r3.h
            r0.append(r2)
            int r2 = r3.s
            if (r2 != 0) goto L23
            int r2 = r3.d
            if (r2 == 0) goto L2b
        L23:
            r0.append(r1)
            int r2 = r3.s
            r0.append(r2)
        L2b:
            int r2 = r3.d
            if (r2 == 0) goto L37
            r0.append(r1)
            int r1 = r3.d
            r0.append(r1)
        L37:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
