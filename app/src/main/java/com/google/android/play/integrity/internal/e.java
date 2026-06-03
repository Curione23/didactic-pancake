package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class e extends com.google.android.play.integrity.internal.f {
    private final int a;
    private final long b;

    e(int r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.integrity.internal.f
            r2 = 0
            if (r1 == 0) goto L1e
            com.google.android.play.integrity.internal.f r8 = (com.google.android.play.integrity.internal.f) r8
            int r1 = r7.a
            int r3 = r8.a()
            if (r1 != r3) goto L1e
            long r3 = r7.b
            long r5 = r8.b()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L1e
            return r0
        L1e:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.b
            int r2 = r5.a
            r3 = 32
            long r3 = r0 >>> r3
            long r0 = r0 ^ r3
            r3 = 1000003(0xf4243, float:1.401303E-39)
            r2 = r2 ^ r3
            int r2 = r2 * r3
            int r0 = (int) r0
            r0 = r0 ^ r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EventRecord{eventType="
            r0.<init>(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", eventTimestamp="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
