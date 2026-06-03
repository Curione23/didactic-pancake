package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bp extends com.google.android.play.core.integrity.bn {
    final /* synthetic */ com.google.android.play.core.integrity.bs c;
    private final com.google.android.play.integrity.internal.s d;
    private final long e;

    bp(com.google.android.play.core.integrity.bs r1, com.google.android.gms.tasks.TaskCompletionSource r2, long r3) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.c = r1
            r0.<init>(r1, r2)
            com.google.android.play.integrity.internal.s r1 = new com.google.android.play.integrity.internal.s
            java.lang.String r2 = "OnRequestIntegrityTokenCallback"
            r1.<init>(r2)
            r0.d = r1
            r0.e = r3
            return
    }

    static /* bridge */ /* synthetic */ long f(com.google.android.play.core.integrity.bp r2) {
            long r0 = r2.e
            return r0
    }

    @Override // com.google.android.play.core.integrity.bn, com.google.android.play.integrity.internal.k
    public final void c(android.os.Bundle r7) throws android.os.RemoteException {
            r6 = this;
            super.c(r7)
            com.google.android.play.integrity.internal.s r0 = r6.d
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onRequestExpressIntegrityToken"
            r0.d(r2, r1)
            com.google.android.play.core.integrity.bs r0 = r6.c
            com.google.android.play.core.integrity.t r1 = com.google.android.play.core.integrity.bs.h(r0)
            com.google.android.gms.common.api.ApiException r1 = r1.a(r7)
            if (r1 == 0) goto L1f
            com.google.android.gms.tasks.TaskCompletionSource r7 = r6.a
            r7.trySetException(r1)
            return
        L1f:
            java.lang.String r1 = "request.token.sid"
            long r1 = r7.getLong(r1)
            com.google.android.play.core.integrity.bo r3 = new com.google.android.play.core.integrity.bo
            java.lang.String r0 = com.google.android.play.core.integrity.bs.k(r0)
            r3.<init>(r6, r0, r1)
            com.google.android.gms.tasks.TaskCompletionSource r0 = r6.a
            com.google.android.play.core.integrity.b r4 = new com.google.android.play.core.integrity.b
            r4.<init>()
            java.lang.String r5 = "token"
            java.lang.String r7 = r7.getString(r5)
            r4.c(r7)
            r4.a(r3)
            r4.b(r1)
            com.google.android.play.core.integrity.bw r7 = r4.d()
            r0.trySetResult(r7)
            return
    }
}
