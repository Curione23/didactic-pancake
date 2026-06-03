package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzab implements com.google.android.gms.tasks.Continuation {
    final /* synthetic */ java.util.Collection zza;

    zzab(java.util.Collection r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task r2) throws java.lang.Exception {
            r1 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r0 = r1.zza
            r2.addAll(r0)
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forResult(r2)
            return r2
    }
}
