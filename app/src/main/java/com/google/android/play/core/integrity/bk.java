package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bk extends com.google.android.play.core.integrity.br {
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ com.google.android.play.core.integrity.bs d;

    bk(com.google.android.play.core.integrity.bs r1, com.google.android.gms.tasks.TaskCompletionSource r2, int r3, long r4, com.google.android.gms.tasks.TaskCompletionSource r6) {
            r0 = this;
            r0.a = r3
            r0.b = r4
            r0.c = r6
            java.util.Objects.requireNonNull(r1)
            r0.d = r1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
            r6 = this;
            com.google.android.play.core.integrity.bs r0 = r6.d
            boolean r1 = com.google.android.play.core.integrity.bs.m(r0)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L14
            com.google.android.play.core.integrity.StandardIntegrityException r0 = new com.google.android.play.core.integrity.StandardIntegrityException
            r1 = -2
            r0.<init>(r1, r3, r2)
            super.a(r0)
            return
        L14:
            int r1 = r6.a
            boolean r4 = com.google.android.play.core.integrity.bs.l(r0, r1)
            if (r4 != 0) goto L58
            com.google.android.play.integrity.internal.ae r2 = r0.a     // Catch: android.os.RemoteException -> L35
            android.os.IInterface r2 = r2.e()     // Catch: android.os.RemoteException -> L35
            com.google.android.play.integrity.internal.i r2 = (com.google.android.play.integrity.internal.i) r2     // Catch: android.os.RemoteException -> L35
            long r4 = r6.b     // Catch: android.os.RemoteException -> L35
            android.os.Bundle r1 = com.google.android.play.core.integrity.bs.b(r0, r4, r1)     // Catch: android.os.RemoteException -> L35
            com.google.android.play.core.integrity.bq r4 = new com.google.android.play.core.integrity.bq     // Catch: android.os.RemoteException -> L35
            com.google.android.gms.tasks.TaskCompletionSource r5 = r6.c     // Catch: android.os.RemoteException -> L35
            r4.<init>(r0, r5)     // Catch: android.os.RemoteException -> L35
            r2.e(r1, r4)     // Catch: android.os.RemoteException -> L35
            return
        L35:
            r0 = move-exception
            com.google.android.play.core.integrity.bs r1 = r6.d
            long r4 = r6.b
            com.google.android.play.integrity.internal.s r1 = com.google.android.play.core.integrity.bs.j(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = "warmUpIntegrityToken(%s)"
            r1.c(r0, r4, r2)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.c
            com.google.android.play.core.integrity.StandardIntegrityException r2 = new com.google.android.play.core.integrity.StandardIntegrityException
            r4 = -100
            r2.<init>(r4, r3, r0)
            r1.trySetException(r2)
            return
        L58:
            com.google.android.play.core.integrity.StandardIntegrityException r0 = new com.google.android.play.core.integrity.StandardIntegrityException
            r1 = -14
            r0.<init>(r1, r3, r2)
            super.a(r0)
            return
    }
}
