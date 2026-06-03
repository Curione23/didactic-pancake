package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class RunCodec extends org.apache.commons.compress.harmony.pack200.Codec {
    private final org.apache.commons.compress.harmony.pack200.Codec aCodec;
    private final org.apache.commons.compress.harmony.pack200.Codec bCodec;
    private int k;
    private int last;

    public RunCodec(int r1, org.apache.commons.compress.harmony.pack200.Codec r2, org.apache.commons.compress.harmony.pack200.Codec r3) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto L18
            if (r2 == 0) goto L10
            if (r3 == 0) goto L10
            r0.k = r1
            r0.aCodec = r2
            r0.bCodec = r3
            return
        L10:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r1 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r2 = "Must supply both codecs for a RunCodec"
            r1.<init>(r2)
            throw r1
        L18:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r1 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r2 = "Cannot have a RunCodec for a negative number of numbers"
            r1.<init>(r2)
            throw r1
    }

    private int normalise(int r7, org.apache.commons.compress.harmony.pack200.Codec r8) {
            r6 = this;
            boolean r0 = r8 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            if (r0 == 0) goto L2a
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r8
            boolean r0 = r8.isDelta()
            if (r0 == 0) goto L2a
            long r0 = r8.cardinality()
        L10:
            long r2 = (long) r7
            long r4 = r8.largest()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1c
            long r2 = r2 - r0
            int r7 = (int) r2
            goto L10
        L1c:
            long r2 = (long) r7
            long r4 = r8.smallest()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L2a
            int r7 = org.apache.commons.compress.utils.ExactMath.add(r7, r0)
            goto L1c
        L2a:
            return r7
    }

    private void normalise(int[] r10, org.apache.commons.compress.harmony.pack200.Codec r11) {
            r9 = this;
            boolean r0 = r11 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            r1 = 0
            if (r0 == 0) goto L3e
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r11
            boolean r0 = r11.isDelta()
            if (r0 == 0) goto La0
            long r2 = r11.cardinality()
        L11:
            int r0 = r10.length
            if (r1 >= r0) goto La0
        L14:
            r0 = r10[r1]
            long r4 = (long) r0
            long r6 = r11.largest()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L27
            r0 = r10[r1]
            long r4 = (long) r0
            long r4 = r4 - r2
            int r0 = (int) r4
            r10[r1] = r0
            goto L14
        L27:
            r0 = r10[r1]
            long r4 = (long) r0
            long r6 = r11.smallest()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L3b
            r0 = r10[r1]
            int r0 = org.apache.commons.compress.utils.ExactMath.add(r0, r2)
            r10[r1] = r0
            goto L27
        L3b:
            int r1 = r1 + 1
            goto L11
        L3e:
            boolean r0 = r11 instanceof org.apache.commons.compress.harmony.pack200.PopulationCodec
            if (r0 == 0) goto La0
            org.apache.commons.compress.harmony.pack200.PopulationCodec r11 = (org.apache.commons.compress.harmony.pack200.PopulationCodec) r11
            int[] r0 = r11.getFavoured()
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            java.util.Arrays.sort(r0)
        L51:
            int r2 = r10.length
            if (r1 >= r2) goto La0
            r2 = r10[r1]
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            r3 = -1
            if (r2 <= r3) goto L62
            org.apache.commons.compress.harmony.pack200.Codec r2 = r11.getFavouredCodec()
            goto L66
        L62:
            org.apache.commons.compress.harmony.pack200.Codec r2 = r11.getUnfavouredCodec()
        L66:
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            if (r3 == 0) goto L9d
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r2
            boolean r3 = r2.isDelta()
            if (r3 == 0) goto L9d
            long r3 = r2.cardinality()
        L76:
            r5 = r10[r1]
            long r5 = (long) r5
            long r7 = r2.largest()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L89
            r5 = r10[r1]
            long r5 = (long) r5
            long r5 = r5 - r3
            int r5 = (int) r5
            r10[r1] = r5
            goto L76
        L89:
            r5 = r10[r1]
            long r5 = (long) r5
            long r7 = r2.smallest()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L9d
            r5 = r10[r1]
            int r5 = org.apache.commons.compress.utils.ExactMath.add(r5, r3)
            r10[r1] = r5
            goto L89
        L9d:
            int r1 = r1 + 1
            goto L51
        La0:
            return
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(java.io.InputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int r0 = r2.last
            long r0 = (long) r0
            int r3 = r2.decode(r3, r0)
            return r3
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(java.io.InputStream r3, long r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int r4 = r2.k
            int r4 = r4 + (-1)
            r2.k = r4
            if (r4 < 0) goto L21
            org.apache.commons.compress.harmony.pack200.Codec r4 = r2.aCodec
            int r5 = r2.last
            long r0 = (long) r5
            int r3 = r4.decode(r3, r0)
            int r4 = r2.k
            if (r4 != 0) goto L17
            r4 = 0
            goto L18
        L17:
            r4 = r3
        L18:
            r2.last = r4
            org.apache.commons.compress.harmony.pack200.Codec r4 = r2.aCodec
            int r3 = r2.normalise(r3, r4)
            return r3
        L21:
            org.apache.commons.compress.harmony.pack200.Codec r4 = r2.bCodec
            int r5 = r2.last
            long r0 = (long) r5
            int r3 = r4.decode(r3, r0)
            r2.last = r3
            org.apache.commons.compress.harmony.pack200.Codec r4 = r2.bCodec
            int r3 = r2.normalise(r3, r4)
            return r3
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int[] decodeInts(int r5, java.io.InputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.pack200.Codec r0 = r4.aCodec
            int r1 = r4.k
            int[] r0 = r0.decodeInts(r1, r6)
            org.apache.commons.compress.harmony.pack200.Codec r1 = r4.aCodec
            r4.normalise(r0, r1)
            org.apache.commons.compress.harmony.pack200.Codec r1 = r4.bCodec
            int r2 = r4.k
            int r2 = r5 - r2
            int[] r1 = r1.decodeInts(r2, r6)
            org.apache.commons.compress.harmony.pack200.Codec r2 = r4.bCodec
            r4.normalise(r1, r2)
            int r6 = r4.check(r5, r6)
            int[] r6 = new int[r6]
            int r2 = r4.k
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r6, r3, r2)
            int r0 = r4.k
            int r5 = r5 - r0
            java.lang.System.arraycopy(r1, r3, r6, r0, r5)
            org.apache.commons.compress.harmony.pack200.Codec r5 = r4.aCodec
            int r5 = r5.lastBandLength
            org.apache.commons.compress.harmony.pack200.Codec r0 = r4.bCodec
            int r0 = r0.lastBandLength
            int r5 = r5 + r0
            r4.lastBandLength = r5
            return r6
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Pack200Exception r2 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r0 = "Must encode entire band at once with a RunCodec"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int r1, int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.Pack200Exception r1 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r2 = "Must encode entire band at once with a RunCodec"
            r1.<init>(r2)
            throw r1
    }

    public org.apache.commons.compress.harmony.pack200.Codec getACodec() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Codec r0 = r1.aCodec
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.Codec getBCodec() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Codec r0 = r1.bCodec
            return r0
    }

    public int getK() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RunCodec[k="
            r0.<init>(r1)
            int r1 = r2.k
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ";aCodec="
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.pack200.Codec r1 = r2.aCodec
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "bCodec="
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.pack200.Codec r1 = r2.bCodec
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
