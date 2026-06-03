package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class aq extends com.google.android.play.integrity.internal.o {
    final /* synthetic */ com.google.android.play.core.integrity.ar a;
    private final com.google.android.play.integrity.internal.s b;
    private final com.google.android.gms.tasks.TaskCompletionSource c;

    aq(com.google.android.play.core.integrity.ar r2, com.google.android.gms.tasks.TaskCompletionSource r3) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            r1.a = r2
            r1.<init>()
            com.google.android.play.integrity.internal.s r2 = new com.google.android.play.integrity.internal.s
            java.lang.String r0 = "OnRequestIntegrityTokenCallback"
            r2.<init>(r0)
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(android.os.Bundle r7) {
            r6 = this;
            com.google.android.play.core.integrity.ar r0 = r6.a
            com.google.android.play.integrity.internal.ae r1 = r0.a
            com.google.android.gms.tasks.TaskCompletionSource r2 = r6.c
            r1.v(r2)
            com.google.android.play.integrity.internal.s r1 = r6.b
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "onRequestIntegrityToken"
            r1.d(r5, r4)
            com.google.android.play.core.integrity.t r1 = com.google.android.play.core.integrity.ar.e(r0)
            com.google.android.gms.common.api.ApiException r1 = r1.a(r7)
            if (r1 == 0) goto L21
            r2.trySetException(r1)
            return
        L21:
            java.lang.String r1 = "token"
            java.lang.String r1 = r7.getString(r1)
            if (r1 != 0) goto L35
            com.google.android.play.core.integrity.IntegrityServiceException r7 = new com.google.android.play.core.integrity.IntegrityServiceException
            r0 = -100
            r1 = 0
            r7.<init>(r0, r3, r1)
            r2.trySetException(r7)
            return
        L35:
            java.lang.String r3 = "request.token.sid"
            long r3 = r7.getLong(r3)
            com.google.android.play.core.integrity.ap r7 = new com.google.android.play.core.integrity.ap
            java.lang.String r0 = com.google.android.play.core.integrity.ar.h(r0)
            r7.<init>(r6, r0, r3)
            com.google.android.play.core.integrity.a r0 = new com.google.android.play.core.integrity.a
            r0.<init>()
            r0.c(r1)
            r0.a(r7)
            r0.b(r3)
            com.google.android.play.core.integrity.av r7 = r0.d()
            r2.trySetResult(r7)
            return
    }
}
