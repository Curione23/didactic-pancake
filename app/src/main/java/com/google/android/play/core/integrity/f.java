package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class f extends com.google.android.play.core.integrity.IntegrityTokenRequest.Builder {
    private java.lang.String a;
    private java.lang.Long b;

    f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityTokenRequest build() {
            r4 = this;
            java.lang.String r0 = r4.a
            if (r0 == 0) goto Ld
            com.google.android.play.core.integrity.h r1 = new com.google.android.play.core.integrity.h
            java.lang.Long r2 = r4.b
            r3 = 0
            r1.<init>(r0, r2, r3)
            return r1
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties: nonce"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setCloudProjectNumber(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.b = r1
            return r0
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setNonce(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.a = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null nonce"
            r2.<init>(r0)
            throw r2
    }
}
