package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzo implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzr {
    final /* synthetic */ com.google.android.gms.common.internal.zzq zza;
    private final java.util.Map zzb;
    private int zzc;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzn zzf;
    private android.content.ComponentName zzg;

    public zzo(com.google.android.gms.common.internal.zzq r1, com.google.android.gms.common.internal.zzn r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.<init>()
            r0.zzf = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb = r1
            r1 = 2
            r0.zzc = r1
            return
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName r1) {
            r0 = this;
            r0.onServiceDisconnected(r1)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            r4 = this;
            com.google.android.gms.common.internal.zzq r0 = r4.zza
            java.util.HashMap r1 = r0.zzf()
            monitor-enter(r1)
            android.os.Handler r0 = r0.zzh()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.common.internal.zzn r2 = r4.zzf     // Catch: java.lang.Throwable -> L33
            r3 = 1
            r0.removeMessages(r3, r2)     // Catch: java.lang.Throwable -> L33
            r4.zze = r6     // Catch: java.lang.Throwable -> L33
            r4.zzg = r5     // Catch: java.lang.Throwable -> L33
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L33
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L33
        L1f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L33
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L33
            r2.onServiceConnected(r5, r6)     // Catch: java.lang.Throwable -> L33
            goto L1f
        L2f:
            r4.zzc = r3     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            throw r5
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r5) {
            r4 = this;
            com.google.android.gms.common.internal.zzq r0 = r4.zza
            java.util.HashMap r1 = r0.zzf()
            monitor-enter(r1)
            android.os.Handler r0 = r0.zzh()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.common.internal.zzn r2 = r4.zzf     // Catch: java.lang.Throwable -> L35
            r3 = 1
            r0.removeMessages(r3, r2)     // Catch: java.lang.Throwable -> L35
            r0 = 0
            r4.zze = r0     // Catch: java.lang.Throwable -> L35
            r4.zzg = r5     // Catch: java.lang.Throwable -> L35
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L35
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L35
        L20:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L35
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L35
            r2.onServiceDisconnected(r5)     // Catch: java.lang.Throwable -> L35
            goto L20
        L30:
            r5 = 2
            r4.zzc = r5     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r5
    }

    public final void zza(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.internal.zzn r4 = r3.zzf
            com.google.android.gms.common.internal.zzq r0 = r3.zza
            android.os.Handler r1 = r0.zzh()
            r2 = 1
            r1.removeMessages(r2, r4)
            com.google.android.gms.common.stats.ConnectionTracker r4 = r0.zzi()
            android.content.Context r0 = r0.zzg()
            r4.unbindService(r0, r3)
            r4 = 0
            r3.zzd = r4
            r4 = 2
            r3.zzc = r4
            return
    }

    public final void zzb(android.content.ServiceConnection r1, android.content.ServiceConnection r2, java.lang.String r3) {
            r0 = this;
            java.util.Map r3 = r0.zzb
            r3.put(r1, r2)
            return
    }

    public final void zzc(android.content.ServiceConnection r1, java.lang.String r2) {
            r0 = this;
            java.util.Map r2 = r0.zzb
            r2.remove(r1)
            return
    }

    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    public final int zze() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final boolean zzf(android.content.ServiceConnection r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public final boolean zzg() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final android.os.IBinder zzh() {
            r1 = this;
            android.os.IBinder r0 = r1.zze
            return r0
    }

    public final android.content.ComponentName zzi() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzg
            return r0
    }

    final /* synthetic */ com.google.android.gms.common.ConnectionResult zzj(java.lang.String r11, java.util.concurrent.Executor r12) {
            r10 = this;
            com.google.android.gms.common.internal.zzq r0 = r10.zza     // Catch: com.google.android.gms.common.internal.zzaf -> L61
            android.content.Context r0 = r0.zzg()     // Catch: com.google.android.gms.common.internal.zzaf -> L61
            com.google.android.gms.common.internal.zzn r1 = r10.zzf     // Catch: com.google.android.gms.common.internal.zzaf -> L61
            android.content.Intent r5 = com.google.android.gms.common.internal.zzah.zza(r0, r1)     // Catch: com.google.android.gms.common.internal.zzaf -> L61
            r0 = 3
            r10.zzc = r0
            android.os.StrictMode$VmPolicy r0 = com.google.android.gms.common.util.zzd.zza()
            com.google.android.gms.common.internal.zzq r1 = r10.zza     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.common.stats.ConnectionTracker r2 = r1.zzi()     // Catch: java.lang.Throwable -> L5c
            android.content.Context r3 = r1.zzg()     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.common.internal.zzn r9 = r10.zzf     // Catch: java.lang.Throwable -> L5c
            r7 = 4225(0x1081, float:5.92E-42)
            r4 = r11
            r6 = r10
            r8 = r12
            boolean r11 = r2.zza(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            r10.zzd = r11     // Catch: java.lang.Throwable -> L5c
            if (r11 == 0) goto L43
            android.os.Handler r11 = r1.zzh()     // Catch: java.lang.Throwable -> L5c
            r12 = 1
            android.os.Message r11 = r11.obtainMessage(r12, r9)     // Catch: java.lang.Throwable -> L5c
            android.os.Handler r12 = r1.zzh()     // Catch: java.lang.Throwable -> L5c
            long r1 = r1.zzj()     // Catch: java.lang.Throwable -> L5c
            r12.sendMessageDelayed(r11, r1)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.common.ConnectionResult r11 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L5c
            goto L58
        L43:
            r11 = 2
            r10.zzc = r11     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.common.stats.ConnectionTracker r11 = r1.zzi()     // Catch: java.lang.IllegalArgumentException -> L51 java.lang.Throwable -> L5c
            android.content.Context r12 = r1.zzg()     // Catch: java.lang.IllegalArgumentException -> L51 java.lang.Throwable -> L5c
            r11.unbindService(r12, r10)     // Catch: java.lang.IllegalArgumentException -> L51 java.lang.Throwable -> L5c
        L51:
            com.google.android.gms.common.ConnectionResult r11 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L5c
            r12 = 16
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L5c
        L58:
            android.os.StrictMode.setVmPolicy(r0)
            goto L64
        L5c:
            r11 = move-exception
            android.os.StrictMode.setVmPolicy(r0)
            throw r11
        L61:
            r11 = move-exception
            com.google.android.gms.common.ConnectionResult r11 = r11.zza
        L64:
            return r11
    }
}
