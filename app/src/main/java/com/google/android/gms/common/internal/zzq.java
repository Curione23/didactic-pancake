package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzq extends com.google.android.gms.common.internal.GmsClientSupervisor {
    private final java.util.HashMap zzb;
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzp zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile java.util.concurrent.Executor zzi;

    zzq(android.content.Context r3, android.os.Looper r4, java.util.concurrent.Executor r5) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzb = r0
            com.google.android.gms.common.internal.zzp r0 = new com.google.android.gms.common.internal.zzp
            r1 = 0
            r0.<init>(r2, r1)
            r2.zze = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.zzc = r3
            com.google.android.gms.internal.common.zzg r3 = new com.google.android.gms.internal.common.zzg
            r3.<init>(r4, r0)
            r2.zzd = r3
            com.google.android.gms.common.stats.ConnectionTracker r3 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()
            r2.zzf = r3
            r3 = 5000(0x1388, double:2.4703E-320)
            r2.zzg = r3
            r3 = 300000(0x493e0, double:1.482197E-318)
            r2.zzh = r3
            r2.zzi = r5
            return
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.zzn r6, android.content.ServiceConnection r7, java.lang.String r8, java.util.concurrent.Executor r9) {
            r5 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            java.util.HashMap r0 = r5.zzb
            java.lang.String r1 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            monitor-enter(r0)
            java.lang.Object r2 = r0.get(r6)     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.common.internal.zzo r2 = (com.google.android.gms.common.internal.zzo) r2     // Catch: java.lang.Throwable -> L86
            if (r9 != 0) goto L14
            java.util.concurrent.Executor r9 = r5.zzi     // Catch: java.lang.Throwable -> L86
        L14:
            if (r2 != 0) goto L26
            com.google.android.gms.common.internal.zzo r2 = new com.google.android.gms.common.internal.zzo     // Catch: java.lang.Throwable -> L86
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L86
            r2.zzb(r7, r7, r8)     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.common.ConnectionResult r7 = r2.zzj(r8, r9)     // Catch: java.lang.Throwable -> L86
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L86
            goto L53
        L26:
            android.os.Handler r3 = r5.zzd     // Catch: java.lang.Throwable -> L86
            r4 = 0
            r3.removeMessages(r4, r6)     // Catch: java.lang.Throwable -> L86
            boolean r3 = r2.zzf(r7)     // Catch: java.lang.Throwable -> L86
            if (r3 != 0) goto L67
            r2.zzb(r7, r7, r8)     // Catch: java.lang.Throwable -> L86
            int r6 = r2.zze()     // Catch: java.lang.Throwable -> L86
            r1 = 1
            r3 = 0
            if (r6 == r1) goto L47
            r7 = 2
            if (r6 == r7) goto L42
        L40:
            r7 = r3
            goto L53
        L42:
            com.google.android.gms.common.ConnectionResult r7 = r2.zzj(r8, r9)     // Catch: java.lang.Throwable -> L86
            goto L53
        L47:
            android.content.ComponentName r6 = r2.zzi()     // Catch: java.lang.Throwable -> L86
            android.os.IBinder r8 = r2.zzh()     // Catch: java.lang.Throwable -> L86
            r7.onServiceConnected(r6, r8)     // Catch: java.lang.Throwable -> L86
            goto L40
        L53:
            boolean r6 = r2.zzd()     // Catch: java.lang.Throwable -> L86
            if (r6 == 0) goto L5d
            com.google.android.gms.common.ConnectionResult r6 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return r6
        L5d:
            if (r7 != 0) goto L65
            com.google.android.gms.common.ConnectionResult r7 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L86
            r6 = -1
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L86
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return r7
        L67:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L86
            int r8 = r6.length()     // Catch: java.lang.Throwable -> L86
            int r8 = r8 + 81
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L86
            r9.append(r1)     // Catch: java.lang.Throwable -> L86
            r9.append(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L86
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L86
            throw r7     // Catch: java.lang.Throwable -> L86
        L86:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            throw r6
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzc(com.google.android.gms.common.internal.zzn r5, android.content.ServiceConnection r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.util.HashMap r0 = r4.zzb
            java.lang.String r1 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config="
            java.lang.String r2 = "Nonexistent connection status for service config: "
            monitor-enter(r0)
            java.lang.Object r3 = r0.get(r5)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.common.internal.zzo r3 = (com.google.android.gms.common.internal.zzo) r3     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L52
            boolean r2 = r3.zzf(r6)     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L33
            r3.zzc(r6, r7)     // Catch: java.lang.Throwable -> L71
            boolean r6 = r3.zzg()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L31
            android.os.Handler r6 = r4.zzd     // Catch: java.lang.Throwable -> L71
            r7 = 0
            android.os.Message r5 = r6.obtainMessage(r7, r5)     // Catch: java.lang.Throwable -> L71
            android.os.Handler r6 = r4.zzd     // Catch: java.lang.Throwable -> L71
            long r1 = r4.zzg     // Catch: java.lang.Throwable -> L71
            r6.sendMessageDelayed(r5, r1)     // Catch: java.lang.Throwable -> L71
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L71
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L71
            int r7 = r7 + 76
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L71
            r2.append(r1)     // Catch: java.lang.Throwable -> L71
            r2.append(r5)     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L71
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L71
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L71
            int r7 = r7 + 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L71
            r1.append(r2)     // Catch: java.lang.Throwable -> L71
            r1.append(r5)     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L71
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r5
    }

    final void zzd(android.os.Looper r4) {
            r3 = this;
            java.util.HashMap r0 = r3.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.common.zzg r1 = new com.google.android.gms.internal.common.zzg     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.internal.zzp r2 = r3.zze     // Catch: java.lang.Throwable -> Le
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> Le
            r3.zzd = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r4
    }

    final void zze(java.util.concurrent.Executor r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzb
            monitor-enter(r0)
            r1.zzi = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    final /* synthetic */ java.util.HashMap zzf() {
            r1 = this;
            java.util.HashMap r0 = r1.zzb
            return r0
    }

    final /* synthetic */ android.content.Context zzg() {
            r1 = this;
            android.content.Context r0 = r1.zzc
            return r0
    }

    final /* synthetic */ android.os.Handler zzh() {
            r1 = this;
            android.os.Handler r0 = r1.zzd
            return r0
    }

    final /* synthetic */ com.google.android.gms.common.stats.ConnectionTracker zzi() {
            r1 = this;
            com.google.android.gms.common.stats.ConnectionTracker r0 = r1.zzf
            return r0
    }

    final /* synthetic */ long zzj() {
            r2 = this;
            long r0 = r2.zzh
            return r0
    }
}
