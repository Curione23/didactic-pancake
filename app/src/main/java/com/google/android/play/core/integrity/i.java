package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class i extends com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {
    private long a;
    private int b;
    private byte c;

    i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
            r8 = this;
            byte r0 = r8.c
            r1 = 3
            if (r0 == r1) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte r1 = r8.c
            r1 = r1 & 1
            if (r1 != 0) goto L15
            java.lang.String r1 = " cloudProjectNumber"
            r0.append(r1)
        L15:
            byte r1 = r8.c
            r1 = r1 & 2
            if (r1 != 0) goto L20
            java.lang.String r1 = " webViewRequestMode"
            r0.append(r1)
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L30:
            com.google.android.play.core.integrity.k r0 = new com.google.android.play.core.integrity.k
            long r3 = r8.a
            int r5 = r8.b
            r6 = 0
            r7 = 0
            r2 = r0
            r2.<init>(r3, r5, r6, r7)
            return r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long r1) {
            r0 = this;
            r0.a = r1
            byte r1 = r0.c
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.c = r1
            return r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setWebViewRequestMode(int r1) {
            r0 = this;
            r0.b = r1
            byte r1 = r0.c
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.c = r1
            return r0
    }
}
