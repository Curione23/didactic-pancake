package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class c extends com.google.android.play.core.integrity.IntegrityDialogRequest.Builder {
    private int a;
    private android.app.Activity b;
    private com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse c;
    private byte d;

    c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityDialogRequest build() {
            r5 = this;
            byte r0 = r5.d
            r1 = 1
            if (r0 != r1) goto L17
            android.app.Activity r0 = r5.b
            if (r0 == 0) goto L17
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r1 = r5.c
            if (r1 != 0) goto Le
            goto L17
        Le:
            com.google.android.play.core.integrity.e r2 = new com.google.android.play.core.integrity.e
            int r3 = r5.a
            r4 = 0
            r2.<init>(r3, r0, r1, r4)
            return r2
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte r1 = r5.d
            if (r1 != 0) goto L25
            java.lang.String r1 = " typeCode"
            r0.append(r1)
        L25:
            android.app.Activity r1 = r5.b
            if (r1 != 0) goto L2e
            java.lang.String r1 = " activity"
            r0.append(r1)
        L2e:
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r1 = r5.c
            if (r1 != 0) goto L37
            java.lang.String r1 = " integrityResponse"
            r0.append(r1)
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityDialogRequest.Builder setActivity(android.app.Activity r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.b = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null activity"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityDialogRequest.Builder setIntegrityResponse(com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.c = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null integrityResponse"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityDialogRequest.Builder setTypeCode(int r1) {
            r0 = this;
            r0.a = r1
            r1 = 1
            r0.d = r1
            return r0
    }
}
