package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class an extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ byte[] a;
    final /* synthetic */ java.lang.Long b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ com.google.android.play.core.integrity.IntegrityTokenRequest d;
    final /* synthetic */ com.google.android.play.core.integrity.ar e;

    an(com.google.android.play.core.integrity.ar r1, com.google.android.gms.tasks.TaskCompletionSource r2, byte[] r3, java.lang.Long r4, com.google.android.gms.tasks.TaskCompletionSource r5, com.google.android.play.core.integrity.IntegrityTokenRequest r6) {
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
    public final void a(java.lang.Exception r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.play.integrity.internal.af
            if (r0 == 0) goto L10
            com.google.android.play.core.integrity.IntegrityServiceException r0 = new com.google.android.play.core.integrity.IntegrityServiceException
            r1 = -9
            r2 = 0
            r0.<init>(r1, r2, r4)
            super.a(r0)
            return
        L10:
            super.a(r4)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
            r5 = this;
            com.google.android.play.core.integrity.ar r0 = r5.e     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.integrity.internal.ae r1 = r0.a     // Catch: android.os.RemoteException -> L1d
            android.os.IInterface r1 = r1.e()     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.integrity.internal.n r1 = (com.google.android.play.integrity.internal.n) r1     // Catch: android.os.RemoteException -> L1d
            byte[] r2 = r5.a     // Catch: android.os.RemoteException -> L1d
            java.lang.Long r3 = r5.b     // Catch: android.os.RemoteException -> L1d
            android.os.Bundle r2 = com.google.android.play.core.integrity.ar.a(r0, r2, r3)     // Catch: android.os.RemoteException -> L1d
            com.google.android.play.core.integrity.aq r3 = new com.google.android.play.core.integrity.aq     // Catch: android.os.RemoteException -> L1d
            com.google.android.gms.tasks.TaskCompletionSource r4 = r5.c     // Catch: android.os.RemoteException -> L1d
            r3.<init>(r0, r4)     // Catch: android.os.RemoteException -> L1d
            r1.d(r2, r3)     // Catch: android.os.RemoteException -> L1d
            return
        L1d:
            r0 = move-exception
            com.google.android.play.core.integrity.ar r1 = r5.e
            com.google.android.play.core.integrity.IntegrityTokenRequest r2 = r5.d
            com.google.android.play.integrity.internal.s r1 = com.google.android.play.core.integrity.ar.g(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "requestIntegrityToken(%s)"
            r1.c(r0, r3, r2)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r5.c
            com.google.android.play.core.integrity.IntegrityServiceException r2 = new com.google.android.play.core.integrity.IntegrityServiceException
            r3 = -100
            r4 = 0
            r2.<init>(r3, r4, r0)
            r1.trySetException(r2)
            return
    }
}
