package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class o extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {
    private java.lang.String a;
    private java.util.Set b;

    o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest build() {
            r4 = this;
            java.util.Set r0 = r4.b
            if (r0 == 0) goto Ld
            com.google.android.play.core.integrity.q r1 = new com.google.android.play.core.integrity.q
            java.lang.String r2 = r4.a
            r3 = 0
            r1.<init>(r2, r0, r3)
            return r1
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties: verdictOptOut"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(java.util.Set<java.lang.Integer> r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.b = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null verdictOptOut"
            r2.<init>(r0)
            throw r2
    }
}
