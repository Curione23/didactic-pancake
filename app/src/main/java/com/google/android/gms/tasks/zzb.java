package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.gms.tasks.CancellationToken {
    private final com.google.android.gms.tasks.zzw zza;

    zzb() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
            r1 = this;
            com.google.android.gms.tasks.zzw r0 = r1.zza
            boolean r0 = r0.isComplete()
            return r0
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final com.google.android.gms.tasks.CancellationToken onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener r3) {
            r2 = this;
            com.google.android.gms.tasks.zza r0 = new com.google.android.gms.tasks.zza
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.zzw r3 = r2.zza
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r3.addOnSuccessListener(r1, r0)
            return r2
    }

    public final void zza() {
            r2 = this;
            com.google.android.gms.tasks.zzw r0 = r2.zza
            r1 = 0
            r0.zze(r1)
            return
    }
}
