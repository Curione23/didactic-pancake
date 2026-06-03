package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzc {
    private java.lang.Object zza;
    private boolean zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient r1, java.lang.Object r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzd = r1
            r0.<init>()
            r0.zza = r2
            r1 = 0
            r0.zzb = r1
            return
    }

    protected abstract void zzc(java.lang.Object r1);

    public final void zzd() {
            r7 = this;
            java.lang.String r0 = " being reused. This is not safe."
            java.lang.String r1 = "Callback proxy "
            monitor-enter(r7)
            java.lang.Object r2 = r7.zza     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r7.zzb     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L2c
            java.lang.String r3 = "GmsClient"
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L3e
            int r5 = r5 + 47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            r6.append(r1)     // Catch: java.lang.Throwable -> L3e
            r6.append(r4)     // Catch: java.lang.Throwable -> L3e
            r6.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L3e
            android.util.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L3e
        L2c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L32
            r7.zzc(r2)
        L32:
            monitor-enter(r7)
            r0 = 1
            r7.zzb = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            r7.zze()
            return
        L3b:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            throw r0
    }

    public final void zze() {
            r2 = this;
            r2.zzf()
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zzd
            java.util.ArrayList r1 = r0.zzj()
            monitor-enter(r1)
            java.util.ArrayList r0 = r0.zzj()     // Catch: java.lang.Throwable -> L13
            r0.remove(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    public final void zzf() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zza = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }
}
