package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class PopulationCodec extends org.apache.commons.compress.harmony.pack200.Codec {
    private int[] favoured;
    private final org.apache.commons.compress.harmony.pack200.Codec favouredCodec;
    private int l;
    private org.apache.commons.compress.harmony.pack200.Codec tokenCodec;
    private final org.apache.commons.compress.harmony.pack200.Codec unfavouredCodec;

    public PopulationCodec(org.apache.commons.compress.harmony.pack200.Codec r2, int r3, org.apache.commons.compress.harmony.pack200.Codec r4) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            if (r3 >= r0) goto L10
            if (r3 <= 0) goto L10
            r1.favouredCodec = r2
            r1.l = r3
            r1.unfavouredCodec = r4
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "L must be between 1..255"
            r2.<init>(r3)
            throw r2
    }

    public PopulationCodec(org.apache.commons.compress.harmony.pack200.Codec r1, org.apache.commons.compress.harmony.pack200.Codec r2, org.apache.commons.compress.harmony.pack200.Codec r3) {
            r0 = this;
            r0.<init>()
            r0.favouredCodec = r1
            r0.tokenCodec = r2
            r0.unfavouredCodec = r3
            return
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(java.io.InputStream r2) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Pack200Exception r2 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r0 = "Population encoding does not work unless the number of elements are known"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(java.io.InputStream r1, long r2) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.Pack200Exception r1 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r2 = "Population encoding does not work unless the number of elements are known"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int[] decodeInts(int r9, java.io.InputStream r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r8 = this;
            r0 = 0
            r8.lastBandLength = r0
            int r1 = r8.check(r9, r10)
            int[] r1 = new int[r1]
            r8.favoured = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -1
            r3 = r0
            r4 = r2
        L11:
            org.apache.commons.compress.harmony.pack200.Codec r5 = r8.favouredCodec
            long r6 = (long) r3
            int r5 = r5.decode(r10, r6)
            if (r4 <= r2) goto L9b
            if (r5 == r1) goto L1e
            if (r5 != r3) goto L9b
        L1e:
            int r1 = r8.lastBandLength
            int r1 = r1 + r4
            r8.lastBandLength = r1
            org.apache.commons.compress.harmony.pack200.Codec r1 = r8.tokenCodec
            r2 = 1
            if (r1 != 0) goto L6e
            r1 = 256(0x100, float:3.59E-43)
            if (r4 >= r1) goto L31
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.PopulationCodec.BYTE1
            r8.tokenCodec = r1
            goto L6e
        L31:
            r3 = r2
        L32:
            int r3 = r3 + r2
            r5 = 5
            if (r3 >= r5) goto L48
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            int r6 = r8.l
            int r6 = 256 - r6
            r5.<init>(r3, r6, r0)
            long r6 = (long) r4
            boolean r6 = r5.encodes(r6)
            if (r6 == 0) goto L32
            r8.tokenCodec = r5
        L48:
            org.apache.commons.compress.harmony.pack200.Codec r1 = r8.tokenCodec
            if (r1 == 0) goto L4d
            goto L6e
        L4d:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r9 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot calculate token codec from "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r0 = " and "
            java.lang.StringBuilder r10 = r10.append(r0)
            int r0 = r8.l
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L6e:
            int r1 = r8.lastBandLength
            int r1 = r1 + r9
            r8.lastBandLength = r1
            org.apache.commons.compress.harmony.pack200.Codec r1 = r8.tokenCodec
            int[] r1 = r1.decodeInts(r9, r10)
            r3 = r0
        L7a:
            if (r0 >= r9) goto L9a
            r4 = r1[r0]
            if (r4 != 0) goto L8f
            int r4 = r8.lastBandLength
            int r4 = r4 + r2
            r8.lastBandLength = r4
            org.apache.commons.compress.harmony.pack200.Codec r4 = r8.unfavouredCodec
            long r5 = (long) r3
            int r3 = r4.decode(r10, r5)
            r1[r0] = r3
            goto L97
        L8f:
            int[] r5 = r8.favoured
            int r4 = r4 + (-1)
            r4 = r5[r4]
            r1[r0] = r4
        L97:
            int r0 = r0 + 1
            goto L7a
        L9a:
            return r1
        L9b:
            int[] r3 = r8.favoured
            int r4 = r4 + 1
            r3[r4] = r5
            int r3 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r5)
            if (r3 <= r6) goto Lad
            r1 = r5
            goto Lb0
        Lad:
            if (r3 != r6) goto Lb0
            r1 = r3
        Lb0:
            r3 = r5
            goto L11
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Pack200Exception r2 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r0 = "Population encoding does not work unless the number of elements are known"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int r1, int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.Pack200Exception r1 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r2 = "Population encoding does not work unless the number of elements are known"
            r1.<init>(r2)
            throw r1
    }

    public byte[] encode(int[] r5, int[] r6, int[] r7) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            int r0 = r5.length
            int r0 = r0 + 1
            int[] r0 = java.util.Arrays.copyOf(r5, r0)
            int r1 = r0.length
            int r1 = r1 + (-1)
            int r2 = r5.length
            int r2 = r2 + (-1)
            r5 = r5[r2]
            r0[r1] = r5
            org.apache.commons.compress.harmony.pack200.Codec r5 = r4.favouredCodec
            byte[] r5 = r5.encode(r0)
            org.apache.commons.compress.harmony.pack200.Codec r0 = r4.tokenCodec
            byte[] r6 = r0.encode(r6)
            org.apache.commons.compress.harmony.pack200.Codec r0 = r4.unfavouredCodec
            byte[] r7 = r0.encode(r7)
            int r0 = r5.length
            int r1 = r6.length
            int r0 = r0 + r1
            int r1 = r7.length
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r1)
            int r1 = r5.length
            int r3 = r6.length
            java.lang.System.arraycopy(r6, r2, r0, r1, r3)
            int r5 = r5.length
            int r6 = r6.length
            int r5 = r5 + r6
            int r6 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r5, r6)
            return r0
    }

    public int[] getFavoured() {
            r1 = this;
            int[] r0 = r1.favoured
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.Codec getFavouredCodec() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Codec r0 = r1.favouredCodec
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.Codec getTokenCodec() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Codec r0 = r1.tokenCodec
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.Codec getUnfavouredCodec() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Codec r0 = r1.unfavouredCodec
            return r0
    }
}
