package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GmsClientSupervisor {
    static android.os.HandlerThread zza = null;
    private static final java.lang.Object zzb = null;
    private static int zzc = 9;
    private static com.google.android.gms.common.internal.zzq zzd = null;
    private static java.util.concurrent.Executor zze = null;
    private static boolean zzf = false;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.GmsClientSupervisor.zzb = r0
            return
    }

    public GmsClientSupervisor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDefaultBindFlags() {
            r0 = 4225(0x1081, float:5.92E-42)
            return r0
    }

    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzq r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L25
            com.google.android.gms.common.internal.zzq r1 = new com.google.android.gms.common.internal.zzq     // Catch: java.lang.Throwable -> L29
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L29
            boolean r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zzf     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L1a
            android.os.HandlerThread r4 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L29
            android.os.Looper r4 = r4.getLooper()     // Catch: java.lang.Throwable -> L29
            goto L1e
        L1a:
            android.os.Looper r4 = r4.getMainLooper()     // Catch: java.lang.Throwable -> L29
        L1e:
            java.util.concurrent.Executor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zze     // Catch: java.lang.Throwable -> L29
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.internal.GmsClientSupervisor.zzd = r1     // Catch: java.lang.Throwable -> L29
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.internal.zzq r4 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd
            return r4
        L29:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r4
    }

    public static android.os.HandlerThread getOrStartHandlerThread() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L9:
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "GoogleApiHandler"
            int r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = r1     // Catch: java.lang.Throwable -> L1b
            r1.start()     // Catch: java.lang.Throwable -> L1b
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    public static android.os.HandlerThread getOrStartHandlerThread(int r3) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L9:
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "GoogleApiHandler"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = r1     // Catch: java.lang.Throwable -> L19
            r1.start()     // Catch: java.lang.Throwable -> L19
            android.os.HandlerThread r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public static void setDefaultBindExecutor(java.util.concurrent.Executor r2) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzq r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto La
            r1.zze(r2)     // Catch: java.lang.Throwable -> Le
        La:
            com.google.android.gms.common.internal.GmsClientSupervisor.zze = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int r2) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto Lc
            com.google.android.gms.common.internal.GmsClientSupervisor.zzc = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r2 = 1
            return r2
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public static void setUseHandlerThreadForCallbacks() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzq r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L16
            boolean r2 = com.google.android.gms.common.internal.GmsClientSupervisor.zzf     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L16
            android.os.HandlerThread r2 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L1b
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L1b
            r1.zzd(r2)     // Catch: java.lang.Throwable -> L1b
        L16:
            r1 = 1
            com.google.android.gms.common.internal.GmsClientSupervisor.zzf = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    public boolean bindService(android.content.ComponentName r3, android.content.ServiceConnection r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            r3 = 0
            com.google.android.gms.common.ConnectionResult r3 = r2.zza(r0, r4, r5, r3)
            boolean r3 = r3.isSuccess()
            return r3
    }

    public boolean bindService(android.content.ComponentName r3, android.content.ServiceConnection r4, java.lang.String r5, java.util.concurrent.Executor r6) {
            r2 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            com.google.android.gms.common.ConnectionResult r3 = r2.zza(r0, r4, r5, r6)
            boolean r3 = r3.isSuccess()
            return r3
    }

    public boolean bindService(java.lang.String r4, android.content.ServiceConnection r5, java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            r1 = 4225(0x1081, float:5.92E-42)
            r2 = 0
            r0.<init>(r4, r1, r2)
            r4 = 0
            com.google.android.gms.common.ConnectionResult r4 = r3.zza(r0, r5, r6, r4)
            boolean r4 = r4.isSuccess()
            return r4
    }

    public void unbindService(android.content.ComponentName r3, android.content.ServiceConnection r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            r2.zzc(r0, r4, r5)
            return
    }

    public void unbindService(java.lang.String r4, android.content.ServiceConnection r5, java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzn r0 = new com.google.android.gms.common.internal.zzn
            r1 = 4225(0x1081, float:5.92E-42)
            r2 = 0
            r0.<init>(r4, r1, r2)
            r3.zzc(r0, r5, r6)
            return
    }

    protected abstract com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.zzn r1, android.content.ServiceConnection r2, java.lang.String r3, java.util.concurrent.Executor r4);

    public final void zzb(java.lang.String r2, java.lang.String r3, int r4, android.content.ServiceConnection r5, java.lang.String r6, boolean r7) {
            r1 = this;
            com.google.android.gms.common.internal.zzn r4 = new com.google.android.gms.common.internal.zzn
            r0 = 4225(0x1081, float:5.92E-42)
            r4.<init>(r2, r3, r0, r7)
            r1.zzc(r4, r5, r6)
            return
    }

    protected abstract void zzc(com.google.android.gms.common.internal.zzn r1, android.content.ServiceConnection r2, java.lang.String r3);
}
