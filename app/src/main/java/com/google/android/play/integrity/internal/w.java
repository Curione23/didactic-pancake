package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class w extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource a;
    final /* synthetic */ com.google.android.play.integrity.internal.t b;
    final /* synthetic */ com.google.android.play.integrity.internal.ae c;

    w(com.google.android.play.integrity.internal.ae r1, com.google.android.gms.tasks.TaskCompletionSource r2, com.google.android.gms.tasks.TaskCompletionSource r3, com.google.android.play.integrity.internal.t r4) {
            r0 = this;
            r0.a = r3
            r0.b = r4
            java.util.Objects.requireNonNull(r1)
            r0.c = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
            r5 = this;
            com.google.android.play.integrity.internal.ae r0 = r5.c
            java.lang.Object r1 = com.google.android.play.integrity.internal.ae.h(r0)
            monitor-enter(r1)
            com.google.android.gms.tasks.TaskCompletionSource r2 = r5.a     // Catch: java.lang.Throwable -> L29
            com.google.android.play.integrity.internal.ae.p(r0, r2)     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.play.integrity.internal.ae.j(r0)     // Catch: java.lang.Throwable -> L29
            int r2 = r2.getAndIncrement()     // Catch: java.lang.Throwable -> L29
            if (r2 <= 0) goto L22
            com.google.android.play.integrity.internal.s r2 = com.google.android.play.integrity.internal.ae.f(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "Already connected to the service."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L29
            r2.d(r3, r4)     // Catch: java.lang.Throwable -> L29
        L22:
            com.google.android.play.integrity.internal.t r2 = r5.b     // Catch: java.lang.Throwable -> L29
            com.google.android.play.integrity.internal.ae.r(r0, r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r0
    }
}
