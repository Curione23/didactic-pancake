package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class h extends com.google.android.play.core.integrity.IntegrityTokenRequest {
    private final java.lang.String a;
    private final java.lang.Long b;

    /* synthetic */ h(java.lang.String r1, java.lang.Long r2, com.google.android.play.core.integrity.g r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final java.lang.Long cloudProjectNumber() {
            r1 = this;
            java.lang.Long r0 = r1.b
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L2e
            com.google.android.play.core.integrity.IntegrityTokenRequest r5 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.nonce()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            java.lang.Long r1 = r4.b
            if (r1 != 0) goto L22
            java.lang.Long r5 = r5.cloudProjectNumber()
            if (r5 != 0) goto L2e
            goto L2d
        L22:
            java.lang.Long r5 = r5.cloudProjectNumber()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L2d
            goto L2e
        L2d:
            return r0
        L2e:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.Long r2 = r3.b
            if (r2 != 0) goto L10
            r2 = 0
            goto L14
        L10:
            int r2 = r2.hashCode()
        L14:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            return r0
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final java.lang.String nonce() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IntegrityTokenRequest{nonce="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cloudProjectNumber="
            r0.append(r1)
            java.lang.Long r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
