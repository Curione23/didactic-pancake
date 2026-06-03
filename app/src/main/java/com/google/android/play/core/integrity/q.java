package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class q extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest {
    private final java.lang.String a;
    private final java.util.Set b;

    /* synthetic */ q(java.lang.String r1, java.util.Set r2, com.google.android.play.core.integrity.p r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L2d
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r5 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest) r5
            java.lang.String r1 = r4.a
            if (r1 != 0) goto L16
            java.lang.String r1 = r5.requestHash()
            if (r1 != 0) goto L2d
            goto L20
        L16:
            java.lang.String r3 = r5.requestHash()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
        L20:
            java.util.Set r1 = r4.b
            java.util.Set r5 = r5.verdictOptOut()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2d
            return r0
        L2d:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            java.util.Set r1 = r3.b
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final java.lang.String requestHash() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.util.Set r0 = r3.b
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "StandardIntegrityTokenRequest{requestHash="
            r1.<init>(r2)
            java.lang.String r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = ", verdictOptOut="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final java.util.Set<java.lang.Integer> verdictOptOut() {
            r1 = this;
            java.util.Set r0 = r1.b
            return r0
    }
}
