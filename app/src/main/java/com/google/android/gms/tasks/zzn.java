package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzn implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb;

    @javax.annotation.Nullable
    private com.google.android.gms.tasks.OnSuccessListener zzc;

    public zzn(java.util.concurrent.Executor r2, com.google.android.gms.tasks.OnSuccessListener r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            r1.zzc = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.tasks.OnSuccessListener zza(com.google.android.gms.tasks.zzn r0) {
            com.google.android.gms.tasks.OnSuccessListener r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.tasks.zzn r0) {
            java.lang.Object r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            r1 = 0
            r2.zzc = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(com.google.android.gms.tasks.Task r3) {
            r2 = this;
            boolean r0 = r3.isSuccessful()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            com.google.android.gms.tasks.OnSuccessListener r1 = r2.zzc     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.Executor r0 = r2.zza
            com.google.android.gms.tasks.zzm r1 = new com.google.android.gms.tasks.zzm
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L1b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
        L1e:
            return
    }
}
