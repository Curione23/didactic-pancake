package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzp zzb;

    zzo(com.google.android.gms.tasks.zzp r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzp r0 = r3.zzb     // Catch: java.lang.Exception -> L35 java.util.concurrent.CancellationException -> L3c com.google.android.gms.tasks.RuntimeExecutionException -> L42
            com.google.android.gms.tasks.SuccessContinuation r0 = com.google.android.gms.tasks.zzp.zza(r0)     // Catch: java.lang.Exception -> L35 java.util.concurrent.CancellationException -> L3c com.google.android.gms.tasks.RuntimeExecutionException -> L42
            com.google.android.gms.tasks.Task r1 = r3.zza     // Catch: java.lang.Exception -> L35 java.util.concurrent.CancellationException -> L3c com.google.android.gms.tasks.RuntimeExecutionException -> L42
            java.lang.Object r1 = r1.getResult()     // Catch: java.lang.Exception -> L35 java.util.concurrent.CancellationException -> L3c com.google.android.gms.tasks.RuntimeExecutionException -> L42
            com.google.android.gms.tasks.Task r0 = r0.then(r1)     // Catch: java.lang.Exception -> L35 java.util.concurrent.CancellationException -> L3c com.google.android.gms.tasks.RuntimeExecutionException -> L42
            if (r0 != 0) goto L1f
            com.google.android.gms.tasks.zzp r0 = r3.zzb
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Continuation returned null"
            r1.<init>(r2)
            r0.onFailure(r1)
            return
        L1f:
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.zza
            r0.addOnSuccessListener(r2, r1)
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.zza
            r0.addOnFailureListener(r2, r1)
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.zza
            r0.addOnCanceledListener(r2, r1)
            return
        L35:
            r0 = move-exception
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            r1.onFailure(r0)
            return
        L3c:
            com.google.android.gms.tasks.zzp r0 = r3.zzb
            r0.onCanceled()
            return
        L42:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 == 0) goto L57
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.onFailure(r0)
            return
        L57:
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            r1.onFailure(r0)
            return
    }
}
