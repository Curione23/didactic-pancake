package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bm extends com.google.android.play.core.integrity.br {
    final /* synthetic */ android.os.Bundle a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.play.core.integrity.bs e;

    bm(com.google.android.play.core.integrity.bs r1, com.google.android.gms.tasks.TaskCompletionSource r2, android.os.Bundle r3, android.app.Activity r4, com.google.android.gms.tasks.TaskCompletionSource r5, int r6) {
            r0 = this;
            r0.a = r3
            r0.b = r4
            r0.c = r5
            r0.d = r6
            java.util.Objects.requireNonNull(r1)
            r0.e = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
            r7 = this;
            com.google.android.play.core.integrity.bs r0 = r7.e
            boolean r1 = com.google.android.play.core.integrity.bs.m(r0)
            r2 = 0
            if (r1 != 0) goto L46
            com.google.android.play.integrity.internal.ae r1 = r0.a     // Catch: android.os.RemoteException -> L23
            android.os.IInterface r3 = r1.e()     // Catch: android.os.RemoteException -> L23
            com.google.android.play.integrity.internal.i r3 = (com.google.android.play.integrity.internal.i) r3     // Catch: android.os.RemoteException -> L23
            android.os.Bundle r4 = r7.a     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.integrity.ay r0 = com.google.android.play.core.integrity.bs.i(r0)     // Catch: android.os.RemoteException -> L23
            android.app.Activity r5 = r7.b     // Catch: android.os.RemoteException -> L23
            com.google.android.gms.tasks.TaskCompletionSource r6 = r7.c     // Catch: android.os.RemoteException -> L23
            com.google.android.play.core.integrity.ax r0 = r0.a(r5, r6, r1)     // Catch: android.os.RemoteException -> L23
            r3.c(r4, r0)     // Catch: android.os.RemoteException -> L23
            return
        L23:
            r0 = move-exception
            com.google.android.play.core.integrity.bs r1 = r7.e
            int r3 = r7.d
            com.google.android.play.integrity.internal.s r1 = com.google.android.play.core.integrity.bs.j(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "requestAndShowDialog(%s)"
            r1.c(r0, r4, r3)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r7.c
            com.google.android.play.core.integrity.StandardIntegrityException r3 = new com.google.android.play.core.integrity.StandardIntegrityException
            r4 = -100
            r3.<init>(r4, r2, r0)
            r1.trySetException(r3)
            return
        L46:
            com.google.android.play.core.integrity.StandardIntegrityException r0 = new com.google.android.play.core.integrity.StandardIntegrityException
            r1 = -2
            r3 = 0
            r0.<init>(r1, r2, r3)
            super.a(r0)
            return
    }
}
