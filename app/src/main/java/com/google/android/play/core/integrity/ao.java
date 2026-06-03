package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ao extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ android.os.Bundle a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.play.core.integrity.ar e;

    ao(com.google.android.play.core.integrity.ar r1, com.google.android.gms.tasks.TaskCompletionSource r2, android.os.Bundle r3, android.app.Activity r4, com.google.android.gms.tasks.TaskCompletionSource r5, int r6) {
            r0 = this;
            r0.a = r3
            r0.b = r4
            r0.c = r5
            r0.d = r6
            java.util.Objects.requireNonNull(r1)
            r0.e = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
            r6 = this;
            com.google.android.play.core.integrity.ar r0 = r6.e     // Catch: android.os.RemoteException -> L1c
            com.google.android.play.integrity.internal.ae r1 = r0.a     // Catch: android.os.RemoteException -> L1c
            android.os.IInterface r2 = r1.e()     // Catch: android.os.RemoteException -> L1c
            com.google.android.play.integrity.internal.n r2 = (com.google.android.play.integrity.internal.n) r2     // Catch: android.os.RemoteException -> L1c
            android.os.Bundle r3 = r6.a     // Catch: android.os.RemoteException -> L1c
            com.google.android.play.core.integrity.ay r0 = com.google.android.play.core.integrity.ar.f(r0)     // Catch: android.os.RemoteException -> L1c
            android.app.Activity r4 = r6.b     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.tasks.TaskCompletionSource r5 = r6.c     // Catch: android.os.RemoteException -> L1c
            com.google.android.play.core.integrity.ax r0 = r0.a(r4, r5, r1)     // Catch: android.os.RemoteException -> L1c
            r2.c(r3, r0)     // Catch: android.os.RemoteException -> L1c
            return
        L1c:
            r0 = move-exception
            com.google.android.play.core.integrity.ar r1 = r6.e
            int r2 = r6.d
            com.google.android.play.integrity.internal.s r1 = com.google.android.play.core.integrity.ar.g(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "requestAndShowDialog(%s)"
            r1.c(r0, r3, r2)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.c
            com.google.android.play.core.integrity.IntegrityServiceException r2 = new com.google.android.play.core.integrity.IntegrityServiceException
            r3 = -100
            r4 = 0
            r2.<init>(r3, r4, r0)
            r1.trySetException(r2)
            return
    }
}
