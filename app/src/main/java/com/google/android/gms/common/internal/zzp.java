package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzp implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzq zza;

    /* synthetic */ zzp(com.google.android.gms.common.internal.zzq r1, byte[] r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r9) {
            r8 = this;
            int r0 = r9.what
            java.lang.String r1 = "Timeout waiting for ServiceConnection callback "
            r2 = 1
            if (r0 == 0) goto L75
            if (r0 == r2) goto Lb
            r9 = 0
            return r9
        Lb:
            com.google.android.gms.common.internal.zzq r0 = r8.zza
            java.util.HashMap r3 = r0.zzf()
            monitor-enter(r3)
            java.lang.Object r9 = r9.obj     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.common.internal.zzn r9 = (com.google.android.gms.common.internal.zzn) r9     // Catch: java.lang.Throwable -> L72
            java.util.HashMap r0 = r0.zzf()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.common.internal.zzo r0 = (com.google.android.gms.common.internal.zzo) r0     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L70
            int r4 = r0.zze()     // Catch: java.lang.Throwable -> L72
            r5 = 3
            if (r4 != r5) goto L70
            java.lang.String r4 = "GmsClientSupervisor"
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L72
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L72
            int r6 = r6 + 47
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L72
            r7.append(r1)     // Catch: java.lang.Throwable -> L72
            r7.append(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L72
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            android.util.Log.e(r4, r1, r5)     // Catch: java.lang.Throwable -> L72
            android.content.ComponentName r1 = r0.zzi()     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L5a
            android.content.ComponentName r1 = r9.zzc()     // Catch: java.lang.Throwable -> L72
        L5a:
            if (r1 != 0) goto L6d
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L72
            java.lang.String r9 = r9.zzb()     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch: java.lang.Throwable -> L72
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "unknown"
            r1.<init>(r9, r4)     // Catch: java.lang.Throwable -> L72
        L6d:
            r0.onServiceDisconnected(r1)     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            return r2
        L72:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L72
            throw r9
        L75:
            com.google.android.gms.common.internal.zzq r0 = r8.zza
            java.util.HashMap r1 = r0.zzf()
            monitor-enter(r1)
            java.lang.Object r9 = r9.obj     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.common.internal.zzn r9 = (com.google.android.gms.common.internal.zzn) r9     // Catch: java.lang.Throwable -> La6
            java.util.HashMap r3 = r0.zzf()     // Catch: java.lang.Throwable -> La6
            java.lang.Object r3 = r3.get(r9)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.common.internal.zzo r3 = (com.google.android.gms.common.internal.zzo) r3     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto La4
            boolean r4 = r3.zzg()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto La4
            boolean r4 = r3.zzd()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto L9d
            java.lang.String r4 = "GmsClientSupervisor"
            r3.zza(r4)     // Catch: java.lang.Throwable -> La6
        L9d:
            java.util.HashMap r0 = r0.zzf()     // Catch: java.lang.Throwable -> La6
            r0.remove(r9)     // Catch: java.lang.Throwable -> La6
        La4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La6
            return r2
        La6:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La6
            throw r9
    }
}
