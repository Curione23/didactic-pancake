package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public class DelimitedVersion implements java.lang.Comparable<net.openid.appauth.browser.DelimitedVersion> {
    private static final long BIT_MASK_32 = -1;
    private static final int PRIME_HASH_FACTOR = 92821;
    private final long[] mNumericParts;

    public DelimitedVersion(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.mNumericParts = r1
            return
    }

    private int compareLongs(long r1, long r3) {
            r0 = this;
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L6
            r1 = -1
            return r1
        L6:
            if (r1 <= 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static net.openid.appauth.browser.DelimitedVersion parse(java.lang.String r7) {
            r0 = 0
            if (r7 != 0) goto Lb
            net.openid.appauth.browser.DelimitedVersion r7 = new net.openid.appauth.browser.DelimitedVersion
            long[] r0 = new long[r0]
            r7.<init>(r0)
            return r7
        Lb:
            java.lang.String r1 = "[^0-9]+"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            long[] r1 = new long[r1]
            int r2 = r7.length
            r3 = r0
            r4 = r3
        L17:
            if (r3 >= r2) goto L2d
            r5 = r7[r3]
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L22
            goto L2a
        L22:
            long r5 = java.lang.Long.parseLong(r5)
            r1[r4] = r5
            int r4 = r4 + 1
        L2a:
            int r3 = r3 + 1
            goto L17
        L2d:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L39
            r2 = r1[r4]
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2d
        L39:
            int r4 = r4 + 1
            long[] r7 = new long[r4]
            java.lang.System.arraycopy(r1, r0, r7, r0, r4)
            net.openid.appauth.browser.DelimitedVersion r0 = new net.openid.appauth.browser.DelimitedVersion
            r0.<init>(r7)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(net.openid.appauth.browser.DelimitedVersion r1) {
            r0 = this;
            net.openid.appauth.browser.DelimitedVersion r1 = (net.openid.appauth.browser.DelimitedVersion) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(net.openid.appauth.browser.DelimitedVersion r6) {
            r5 = this;
            r0 = 0
        L1:
            long[] r1 = r5.mNumericParts
            int r2 = r1.length
            if (r0 >= r2) goto L19
            long[] r2 = r6.mNumericParts
            int r3 = r2.length
            if (r0 >= r3) goto L19
            r3 = r1[r0]
            r1 = r2[r0]
            int r1 = r5.compareLongs(r3, r1)
            if (r1 == 0) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            int r0 = r1.length
            long r0 = (long) r0
            long[] r6 = r6.mNumericParts
            int r6 = r6.length
            long r2 = (long) r6
            int r6 = r5.compareLongs(r0, r2)
            return r6
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 == 0) goto L17
            boolean r2 = r4 instanceof net.openid.appauth.browser.DelimitedVersion
            if (r2 != 0) goto Lc
            goto L17
        Lc:
            net.openid.appauth.browser.DelimitedVersion r4 = (net.openid.appauth.browser.DelimitedVersion) r4
            int r4 = r3.compareTo2(r4)
            if (r4 != 0) goto L15
            goto L16
        L15:
            r0 = r1
        L16:
            return r0
        L17:
            return r1
    }

    public int hashCode() {
            r7 = this;
            long[] r0 = r7.mNumericParts
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r2 >= r1) goto L12
            r4 = r0[r2]
            r6 = 92821(0x16a95, float:1.3007E-40)
            int r3 = r3 * r6
            int r4 = (int) r4
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L5
        L12:
            return r3
    }

    public java.lang.String toString() {
            r5 = this;
            long[] r0 = r5.mNumericParts
            int r0 = r0.length
            if (r0 != 0) goto L8
            java.lang.String r0 = "0"
            return r0
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long[] r1 = r5.mNumericParts
            r2 = 0
            r2 = r1[r2]
            r0.append(r2)
            r1 = 1
        L16:
            long[] r2 = r5.mNumericParts
            int r2 = r2.length
            if (r1 >= r2) goto L2a
            r2 = 46
            r0.append(r2)
            long[] r2 = r5.mNumericParts
            r3 = r2[r1]
            r0.append(r3)
            int r1 = r1 + 1
            goto L16
        L2a:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
