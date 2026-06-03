package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class aa extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ android.os.IBinder a;
    final /* synthetic */ com.google.android.play.integrity.internal.ac b;

    aa(com.google.android.play.integrity.internal.ac r1, android.os.IBinder r2) {
            r0 = this;
            r0.a = r2
            java.util.Objects.requireNonNull(r1)
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
            r3 = this;
            com.google.android.play.integrity.internal.ac r0 = r3.b
            com.google.android.play.integrity.internal.ae r0 = r0.a
            com.google.android.play.integrity.internal.z r1 = com.google.android.play.integrity.internal.ae.g(r0)
            android.os.IBinder r2 = r3.a
            java.lang.Object r1 = r1.a(r2)
            android.os.IInterface r1 = (android.os.IInterface) r1
            com.google.android.play.integrity.internal.ae.o(r0, r1)
            com.google.android.play.integrity.internal.ae.s(r0)
            r1 = 0
            com.google.android.play.integrity.internal.ae.n(r0, r1)
            java.util.List r1 = com.google.android.play.integrity.internal.ae.i(r0)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L22
        L32:
            java.util.List r0 = com.google.android.play.integrity.internal.ae.i(r0)
            r0.clear()
            return
    }
}
