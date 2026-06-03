package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzv extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private final java.util.List zza;

    private zzv(com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.zza = r2
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = r1.mLifecycleFragment
            java.lang.String r0 = "TaskOnStopCallback"
            r2.addCallback(r0, r1)
            return
    }

    public static com.google.android.gms.tasks.zzv zza(android.app.Activity r2) {
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = getFragment(r2)
            monitor-enter(r2)
            java.lang.String r0 = "TaskOnStopCallback"
            java.lang.Class<com.google.android.gms.tasks.zzv> r1 = com.google.android.gms.tasks.zzv.class
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r2.getCallbackOrNull(r0, r1)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.tasks.zzv r0 = (com.google.android.gms.tasks.zzv) r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L16
            com.google.android.gms.tasks.zzv r0 = new com.google.android.gms.tasks.zzv     // Catch: java.lang.Throwable -> L18
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
            r3 = this;
            java.util.List r0 = r3.zza
            monitor-enter(r0)
            java.util.List r1 = r3.zza     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L28
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L28
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.tasks.zzq r2 = (com.google.android.gms.tasks.zzq) r2     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L9
            r2.zzc()     // Catch: java.lang.Throwable -> L28
            goto L9
        L21:
            java.util.List r1 = r3.zza     // Catch: java.lang.Throwable -> L28
            r1.clear()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    public final void zzb(com.google.android.gms.tasks.zzq r4) {
            r3 = this;
            java.util.List r0 = r3.zza
            monitor-enter(r0)
            java.util.List r1 = r3.zza     // Catch: java.lang.Throwable -> Lf
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lf
            r1.add(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }
}
