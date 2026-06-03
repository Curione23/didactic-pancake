package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
final class CachedRandomBits {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int bitIndex;
    private final byte[] cache;
    private final java.util.Random random;

    static {
            return
    }

    CachedRandomBits(int r2, java.util.Random r3) {
            r1 = this;
            r1.<init>()
            if (r2 <= 0) goto L1a
            byte[] r2 = new byte[r2]
            r1.cache = r2
            java.lang.String r0 = "random"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r0)
            java.util.Random r3 = (java.util.Random) r3
            r1.random = r3
            r3.nextBytes(r2)
            r2 = 0
            r1.bitIndex = r2
            return
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "cacheSize must be positive"
            r2.<init>(r3)
            throw r2
    }

    public int nextBits(int r9) {
            r8 = this;
            r0 = 32
            if (r9 > r0) goto L3f
            if (r9 <= 0) goto L3f
            r0 = 0
            r1 = r0
            r2 = r1
        L9:
            if (r1 >= r9) goto L3e
            int r3 = r8.bitIndex
            int r3 = r3 >> 3
            byte[] r4 = r8.cache
            int r5 = r4.length
            if (r3 < r5) goto L1b
            java.util.Random r3 = r8.random
            r3.nextBytes(r4)
            r8.bitIndex = r0
        L1b:
            int r3 = r8.bitIndex
            r3 = r3 & 7
            int r3 = 8 - r3
            int r4 = r9 - r1
            int r3 = java.lang.Math.min(r3, r4)
            int r2 = r2 << r3
            byte[] r4 = r8.cache
            int r5 = r8.bitIndex
            int r6 = r5 >> 3
            r4 = r4[r6]
            r6 = r5 & 7
            int r4 = r4 >> r6
            r6 = 1
            int r7 = r6 << r3
            int r7 = r7 - r6
            r4 = r4 & r7
            r2 = r2 | r4
            int r1 = r1 + r3
            int r5 = r5 + r3
            r8.bitIndex = r5
            goto L9
        L3e:
            return r2
        L3f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "number of bits must be between 1 and 32"
            r9.<init>(r0)
            throw r9
    }
}
