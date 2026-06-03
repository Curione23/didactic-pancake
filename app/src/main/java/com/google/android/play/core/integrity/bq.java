package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bq extends com.google.android.play.core.integrity.bn {
    final /* synthetic */ com.google.android.play.core.integrity.bs c;
    private final com.google.android.play.integrity.internal.s d;

    bq(com.google.android.play.core.integrity.bs r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.c = r1
            r0.<init>(r1, r2)
            com.google.android.play.integrity.internal.s r1 = new com.google.android.play.integrity.internal.s
            java.lang.String r2 = "OnWarmUpIntegrityTokenCallback"
            r1.<init>(r2)
            r0.d = r1
            return
    }

    @Override // com.google.android.play.core.integrity.bn, com.google.android.play.integrity.internal.k
    public final void e(android.os.Bundle r4) throws android.os.RemoteException {
            r3 = this;
            super.e(r4)
            com.google.android.play.integrity.internal.s r0 = r3.d
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onWarmUpExpressIntegrityToken"
            r0.d(r2, r1)
            com.google.android.play.core.integrity.bs r0 = r3.c
            com.google.android.play.core.integrity.t r0 = com.google.android.play.core.integrity.bs.h(r0)
            com.google.android.gms.common.api.ApiException r0 = r0.a(r4)
            if (r0 == 0) goto L1f
            com.google.android.gms.tasks.TaskCompletionSource r4 = r3.a
            r4.trySetException(r0)
            return
        L1f:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r3.a
            java.lang.String r1 = "warm.up.sid"
            long r1 = r4.getLong(r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r0.trySetResult(r4)
            return
    }
}
