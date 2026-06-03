package org.tukaani.xz.delta;

/* JADX INFO: loaded from: classes2.dex */
abstract class DeltaCoder {
    static final int DISTANCE_MAX = 256;
    static final int DISTANCE_MIN = 1;
    final int distance;
    final byte[] history;

    DeltaCoder(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            if (r4 < r0) goto L11
            r0 = 256(0x100, float:3.59E-43)
            if (r4 > r0) goto L11
            r3.distance = r4
            byte[] r4 = new byte[r4]
            r3.history = r4
            return
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid distance: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
