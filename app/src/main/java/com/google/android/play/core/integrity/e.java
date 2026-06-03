package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class e extends com.google.android.play.core.integrity.IntegrityDialogRequest {
    private final int a;
    private final android.app.Activity b;
    private final com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse c;

    /* synthetic */ e(int r1, android.app.Activity r2, com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse r3, com.google.android.play.core.integrity.d r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest
    public final android.app.Activity activity() {
            r1 = this;
            android.app.Activity r0 = r1.b
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.core.integrity.IntegrityDialogRequest
            r2 = 0
            if (r1 == 0) goto L2c
            com.google.android.play.core.integrity.IntegrityDialogRequest r5 = (com.google.android.play.core.integrity.IntegrityDialogRequest) r5
            int r1 = r4.a
            int r3 = r5.typeCode()
            if (r1 != r3) goto L2c
            android.app.Activity r1 = r4.b
            android.app.Activity r3 = r5.activity()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r1 = r4.c
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r5 = r5.integrityResponse()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2c
            return r0
        L2c:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            android.app.Activity r1 = r3.b
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r1 = r3.c
            int r0 = r0 * r2
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest
    public final com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse integrityResponse() {
            r1 = this;
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r0 = r1.c
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r0 = r4.c
            android.app.Activity r1 = r4.b
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "IntegrityDialogRequest{typeCode="
            r2.<init>(r3)
            int r3 = r4.a
            r2.append(r3)
            java.lang.String r3 = ", activity="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", integrityResponse="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest
    public final int typeCode() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
