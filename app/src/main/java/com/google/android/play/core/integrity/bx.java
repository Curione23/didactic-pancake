package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bx implements com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ com.google.android.play.core.integrity.by d;

    bx(com.google.android.play.core.integrity.by r1, long r2, long r4, int r6) {
            r0 = this;
            r0.a = r2
            r0.b = r4
            r0.c = r6
            java.util.Objects.requireNonNull(r1)
            r0.d = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken> request(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest r8) {
            r7 = this;
            long r2 = r7.a
            long r4 = r7.b
            int r6 = r7.c
            com.google.android.play.core.integrity.by r0 = r7.d
            com.google.android.play.core.integrity.bs r0 = com.google.android.play.core.integrity.by.a(r0)
            r1 = r8
            com.google.android.gms.tasks.Task r8 = r0.d(r1, r2, r4, r6)
            return r8
    }
}
