package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class x extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ com.google.android.play.integrity.internal.ae a;

    x(com.google.android.play.integrity.internal.ae r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
            r6 = this;
            com.google.android.play.integrity.internal.ae r0 = r6.a
            java.lang.Object r1 = com.google.android.play.integrity.internal.ae.h(r0)
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.play.integrity.internal.ae.j(r0)     // Catch: java.lang.Throwable -> L54
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L54
            r3 = 0
            if (r2 <= 0) goto L29
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.play.integrity.internal.ae.j(r0)     // Catch: java.lang.Throwable -> L54
            int r2 = r2.decrementAndGet()     // Catch: java.lang.Throwable -> L54
            if (r2 <= 0) goto L29
            com.google.android.play.integrity.internal.s r0 = com.google.android.play.integrity.internal.ae.f(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "Leaving the connection open for other ongoing calls."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L54
            r0.d(r2, r3)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            return
        L29:
            android.os.IInterface r2 = com.google.android.play.integrity.internal.ae.d(r0)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L4f
            com.google.android.play.integrity.internal.s r2 = com.google.android.play.integrity.internal.ae.f(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "Unbind from service."
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L54
            r2.d(r4, r5)     // Catch: java.lang.Throwable -> L54
            android.content.Context r2 = com.google.android.play.integrity.internal.ae.a(r0)     // Catch: java.lang.Throwable -> L54
            android.content.ServiceConnection r4 = com.google.android.play.integrity.internal.ae.b(r0)     // Catch: java.lang.Throwable -> L54
            r2.unbindService(r4)     // Catch: java.lang.Throwable -> L54
            com.google.android.play.integrity.internal.ae.n(r0, r3)     // Catch: java.lang.Throwable -> L54
            r2 = 0
            com.google.android.play.integrity.internal.ae.o(r0, r2)     // Catch: java.lang.Throwable -> L54
            com.google.android.play.integrity.internal.ae.m(r0, r2)     // Catch: java.lang.Throwable -> L54
        L4f:
            com.google.android.play.integrity.internal.ae.q(r0)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r0
    }
}
