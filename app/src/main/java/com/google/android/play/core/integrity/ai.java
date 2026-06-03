package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ai implements com.google.android.play.core.integrity.IntegrityManager {
    private final com.google.android.play.core.integrity.ar a;

    ai(com.google.android.play.core.integrity.ar r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.IntegrityTokenResponse> requestIntegrityToken(com.google.android.play.core.integrity.IntegrityTokenRequest r2) {
            r1 = this;
            com.google.android.play.core.integrity.ar r0 = r1.a
            com.google.android.gms.tasks.Task r2 = r0.c(r2)
            return r2
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(com.google.android.play.core.integrity.IntegrityDialogRequest r2) {
            r1 = this;
            com.google.android.play.core.integrity.ar r0 = r1.a
            com.google.android.gms.tasks.Task r2 = r0.d(r2)
            return r2
    }
}
