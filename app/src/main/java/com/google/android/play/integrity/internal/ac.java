package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ac implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.play.integrity.internal.ae a;

    /* synthetic */ ac(com.google.android.play.integrity.internal.ae r1, com.google.android.play.integrity.internal.ad r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            com.google.android.play.integrity.internal.ae r0 = r3.a
            com.google.android.play.integrity.internal.s r1 = com.google.android.play.integrity.internal.ae.f(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = "ServiceConnectionImpl.onServiceConnected(%s)"
            r1.d(r2, r4)
            com.google.android.play.integrity.internal.aa r4 = new com.google.android.play.integrity.internal.aa
            r4.<init>(r3, r5)
            android.os.Handler r5 = r0.c()
            r5.post(r4)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            com.google.android.play.integrity.internal.ae r0 = r3.a
            com.google.android.play.integrity.internal.s r1 = com.google.android.play.integrity.internal.ae.f(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = "ServiceConnectionImpl.onServiceDisconnected(%s)"
            r1.d(r2, r4)
            com.google.android.play.integrity.internal.ab r4 = new com.google.android.play.integrity.internal.ab
            r4.<init>(r3)
            android.os.Handler r0 = r0.c()
            r0.post(r4)
            return
    }
}
