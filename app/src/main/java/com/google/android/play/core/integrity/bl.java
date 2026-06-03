package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bl extends com.google.android.play.core.integrity.br {
    final /* synthetic */ int a;
    final /* synthetic */ com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource e;
    final /* synthetic */ com.google.android.play.core.integrity.bs f;

    bl(com.google.android.play.core.integrity.bs r1, com.google.android.gms.tasks.TaskCompletionSource r2, int r3, com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest r4, long r5, long r7, com.google.android.gms.tasks.TaskCompletionSource r9) {
            r0 = this;
            r0.a = r3
            r0.b = r4
            r0.c = r5
            r0.d = r7
            r0.e = r9
            java.util.Objects.requireNonNull(r1)
            r0.f = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
            r12 = this;
            com.google.android.play.core.integrity.bs r7 = r12.f
            boolean r0 = com.google.android.play.core.integrity.bs.m(r7)
            r1 = 0
            r8 = 0
            if (r0 == 0) goto L14
            com.google.android.play.core.integrity.StandardIntegrityException r0 = new com.google.android.play.core.integrity.StandardIntegrityException
            r2 = -2
            r0.<init>(r2, r8, r1)
            super.a(r0)
            return
        L14:
            int r6 = r12.a
            boolean r0 = com.google.android.play.core.integrity.bs.l(r7, r6)
            if (r0 != 0) goto L69
            com.google.android.play.integrity.internal.ae r0 = r7.a     // Catch: android.os.RemoteException -> L3c
            android.os.IInterface r0 = r0.e()     // Catch: android.os.RemoteException -> L3c
            r9 = r0
            com.google.android.play.integrity.internal.i r9 = (com.google.android.play.integrity.internal.i) r9     // Catch: android.os.RemoteException -> L3c
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r1 = r12.b     // Catch: android.os.RemoteException -> L3c
            long r10 = r12.c     // Catch: android.os.RemoteException -> L3c
            long r4 = r12.d     // Catch: android.os.RemoteException -> L3c
            r0 = r7
            r2 = r10
            android.os.Bundle r0 = com.google.android.play.core.integrity.bs.a(r0, r1, r2, r4, r6)     // Catch: android.os.RemoteException -> L3c
            com.google.android.play.core.integrity.bp r1 = new com.google.android.play.core.integrity.bp     // Catch: android.os.RemoteException -> L3c
            com.google.android.gms.tasks.TaskCompletionSource r2 = r12.e     // Catch: android.os.RemoteException -> L3c
            r1.<init>(r7, r2, r10)     // Catch: android.os.RemoteException -> L3c
            r9.d(r0, r1)     // Catch: android.os.RemoteException -> L3c
            return
        L3c:
            r0 = move-exception
            com.google.android.play.core.integrity.bs r1 = r12.f
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r2 = r12.b
            com.google.android.play.integrity.internal.s r1 = com.google.android.play.core.integrity.bs.j(r1)
            java.lang.String r3 = r2.requestHash()
            java.util.Set r2 = r2.verdictOptOut()
            long r4 = r12.c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2, r4}
            java.lang.String r3 = "requestExpressIntegrityToken(%s, %s, %s)"
            r1.c(r0, r3, r2)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r12.e
            com.google.android.play.core.integrity.StandardIntegrityException r2 = new com.google.android.play.core.integrity.StandardIntegrityException
            r3 = -100
            r2.<init>(r3, r8, r0)
            r1.trySetException(r2)
            return
        L69:
            com.google.android.play.core.integrity.StandardIntegrityException r0 = new com.google.android.play.core.integrity.StandardIntegrityException
            r2 = -14
            r0.<init>(r2, r8, r1)
            super.a(r0)
            return
    }
}
