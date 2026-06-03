package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ax extends com.google.android.play.integrity.internal.q {
    final com.google.android.gms.tasks.TaskCompletionSource a;
    final com.google.android.play.integrity.internal.ae b;
    private final com.google.android.play.integrity.internal.s c;
    private final java.lang.String d;
    private final com.google.android.play.core.integrity.t e;
    private final android.app.Activity f;

    ax(android.content.Context r3, com.google.android.play.core.integrity.t r4, android.app.Activity r5, com.google.android.gms.tasks.TaskCompletionSource r6, com.google.android.play.integrity.internal.ae r7) {
            r2 = this;
            r2.<init>()
            com.google.android.play.integrity.internal.s r0 = new com.google.android.play.integrity.internal.s
            java.lang.String r1 = "RequestDialogCallbackImpl"
            r0.<init>(r1)
            r2.c = r0
            java.lang.String r3 = r3.getPackageName()
            r2.d = r3
            r2.e = r4
            r2.a = r6
            r2.f = r5
            r2.b = r7
            return
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(android.os.Bundle r7) {
            r6 = this;
            com.google.android.play.integrity.internal.ae r0 = r6.b
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.a
            r0.v(r1)
            java.lang.String r2 = r6.d
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            com.google.android.play.integrity.internal.s r4 = r6.c
            java.lang.String r5 = "onRequestDialog(%s)"
            r4.d(r5, r3)
            com.google.android.play.core.integrity.t r3 = r6.e
            com.google.android.gms.common.api.ApiException r3 = r3.a(r7)
            if (r3 == 0) goto L20
            r1.trySetException(r3)
            return
        L20:
            java.lang.String r3 = "dialog.intent"
            android.os.Parcelable r7 = r7.getParcelable(r3)
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            r3 = 0
            if (r7 != 0) goto L3c
            java.lang.Object[] r7 = new java.lang.Object[]{r2}
            java.lang.String r0 = "onRequestDialog(%s): got null dialog intent"
            r4.b(r0, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r1.trySetResult(r7)
            return
        L3c:
            android.app.Activity r1 = r6.f
            java.lang.Class<com.google.android.play.core.common.PlayCoreDialogWrapperActivity> r2 = com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r1, r2)
            java.lang.String r2 = "confirmation_intent"
            r5.putExtra(r2, r7)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r5.setFlags(r7)
            com.google.android.play.core.integrity.aw r7 = new com.google.android.play.core.integrity.aw
            android.os.Handler r0 = r0.c()
            r7.<init>(r6, r0)
            java.lang.String r0 = "result_receiver"
            r5.putExtra(r0, r7)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r0 = "Starting dialog intent..."
            r4.a(r0, r7)
            r1.startActivityForResult(r5, r3)
            return
    }
}
