package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class be implements com.google.android.play.core.integrity.StandardIntegrityManager {
    private final com.google.android.play.core.integrity.bs a;
    private final com.google.android.play.core.integrity.by b;

    be(com.google.android.play.core.integrity.bs r1, com.google.android.play.core.integrity.by r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static /* synthetic */ com.google.android.gms.tasks.Task a(com.google.android.play.core.integrity.be r7, com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest r8, java.lang.Long r9) {
            long r2 = r8.b()
            long r4 = r9.longValue()
            int r6 = r8.a()
            com.google.android.play.core.integrity.bx r8 = new com.google.android.play.core.integrity.bx
            com.google.android.play.core.integrity.by r1 = r7.b
            r0 = r8
            r0.<init>(r1, r2, r4, r6)
            com.google.android.gms.tasks.Task r7 = com.google.android.gms.tasks.Tasks.forResult(r8)
            return r7
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest r10) {
            r9 = this;
            r10.c()
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2c
            com.google.android.play.core.integrity.by r3 = r9.b     // Catch: java.lang.NumberFormatException -> L26
            long r4 = r10.b()     // Catch: java.lang.NumberFormatException -> L26
            r10.c()     // Catch: java.lang.NumberFormatException -> L26
            long r6 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L26
            int r8 = r10.a()     // Catch: java.lang.NumberFormatException -> L26
            com.google.android.play.core.integrity.bx r10 = new com.google.android.play.core.integrity.bx     // Catch: java.lang.NumberFormatException -> L26
            r2 = r10
            r2.<init>(r3, r4, r6, r8)     // Catch: java.lang.NumberFormatException -> L26
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.forResult(r10)     // Catch: java.lang.NumberFormatException -> L26
            return r10
        L26:
            r10 = move-exception
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.forException(r10)
            return r10
        L2c:
            com.google.android.play.core.integrity.bs r0 = r9.a
            long r1 = r10.b()
            int r3 = r10.a()
            com.google.android.gms.tasks.Task r0 = r0.f(r1, r3)
            com.google.android.play.core.integrity.bd r1 = new com.google.android.play.core.integrity.bd
            r1.<init>(r9, r10)
            com.google.android.gms.tasks.Task r10 = r0.onSuccessTask(r1)
            return r10
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest r2) {
            r1 = this;
            com.google.android.play.core.integrity.bs r0 = r1.a
            com.google.android.gms.tasks.Task r2 = r0.e(r2)
            return r2
    }
}
