package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bw extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken {
    private final java.lang.String a;
    private final long b;
    private final com.google.android.play.core.integrity.ag c;
    private boolean d;
    private final java.lang.Object e;

    bw(java.lang.String r2, long r3, com.google.android.play.core.integrity.ag r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.e = r0
            r1.a = r2
            r1.c = r5
            r1.b = r3
            return
    }

    final long a() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    final void b(boolean r2) {
            r1 = this;
            java.lang.Object r2 = r1.e
            monitor-enter(r2)
            r0 = 1
            r1.d = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    final boolean c() {
            r2 = this;
            java.lang.Object r0 = r2.e
            monitor-enter(r0)
            boolean r1 = r2.d     // Catch: java.lang.Throwable -> L9
            r1 = r1 ^ 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity r2, int r3) {
            r1 = this;
            com.google.android.play.core.integrity.ag r0 = r1.c
            com.google.android.gms.tasks.Task r2 = r0.a(r2, r3)
            return r2
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final java.lang.String token() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
