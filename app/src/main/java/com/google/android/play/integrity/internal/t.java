package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements java.lang.Runnable {
    private final com.google.android.gms.tasks.TaskCompletionSource a;

    t() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public t(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void a(java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.a
            if (r0 == 0) goto L7
            r0.trySetException(r2)
        L7:
            return
    }

    protected abstract void b();

    final com.google.android.gms.tasks.TaskCompletionSource c() {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.a
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            r1.b()     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            r1.a(r0)
            return
    }
}
