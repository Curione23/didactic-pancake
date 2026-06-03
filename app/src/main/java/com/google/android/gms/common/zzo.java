package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzo {
    static final com.google.android.gms.common.zzm zza = null;
    static final com.google.android.gms.common.zzm zzb = null;
    static final com.google.android.gms.common.zzm zzc = null;
    static final com.google.android.gms.common.zzm zzd = null;
    static final com.google.android.gms.common.zzm zze = null;
    static final com.google.android.gms.common.zzm zzf = null;
    static volatile com.google.android.gms.common.internal.zzad zzg;
    public static final /* synthetic */ int zzh = 0;
    private static final java.lang.Object zzi = null;
    private static android.content.Context zzj;

    static {
            com.google.android.gms.common.zzd r0 = new com.google.android.gms.common.zzd
            java.lang.String r1 = "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"
            byte[] r1 = com.google.android.gms.common.zzj.zzf(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzo.zza = r0
            com.google.android.gms.common.zze r0 = new com.google.android.gms.common.zze
            java.lang.String r1 = "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"
            byte[] r1 = com.google.android.gms.common.zzj.zzf(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzo.zzb = r0
            com.google.android.gms.common.zzf r0 = new com.google.android.gms.common.zzf
            java.lang.String r1 = "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"
            byte[] r1 = com.google.android.gms.common.zzj.zzf(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzo.zzc = r0
            com.google.android.gms.common.zzg r0 = new com.google.android.gms.common.zzg
            java.lang.String r1 = "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"
            byte[] r1 = com.google.android.gms.common.zzj.zzf(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzo.zzd = r0
            com.google.android.gms.common.zzh r0 = new com.google.android.gms.common.zzh
            java.lang.String r1 = "0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"
            byte[] r1 = com.google.android.gms.common.zzj.zzf(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzo.zze = r0
            com.google.android.gms.common.zzi r0 = new com.google.android.gms.common.zzi
            java.lang.String r1 = "0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"
            byte[] r1 = com.google.android.gms.common.zzj.zzf(r1)
            r0.<init>(r1)
            com.google.android.gms.common.zzo.zzf = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.zzo.zzi = r0
            return
    }

    static synchronized void zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.zzo> r0 = com.google.android.gms.common.zzo.class
            monitor-enter(r0)
            android.content.Context r1 = com.google.android.gms.common.zzo.zzj     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L13
            if (r2 == 0) goto L11
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.zzo.zzj = r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L11:
            monitor-exit(r0)
            return
        L13:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r2
    }

    static void zzb() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            com.google.android.gms.common.internal.zzad r0 = com.google.android.gms.common.zzo.zzg
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = com.google.android.gms.common.zzo.zzj
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Object r0 = com.google.android.gms.common.zzo.zzi
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzad r1 = com.google.android.gms.common.zzo.zzg     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L27
            android.content.Context r1 = com.google.android.gms.common.zzo.zzj     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r2 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.load(r1, r2, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.instantiate(r2)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.internal.zzad r1 = com.google.android.gms.common.internal.zzac.zzb(r1)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.zzo.zzg = r1     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
    }

    static com.google.android.gms.common.zzy zzc(com.google.android.gms.common.zzw r5) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r3 = "module init: "
            android.content.Context r4 = com.google.android.gms.common.zzo.zzj     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L8d
            zzb()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L72 java.lang.Throwable -> L8d
            android.content.Context r3 = com.google.android.gms.common.zzo.zzj     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L8d
            android.content.Context r3 = com.google.android.gms.common.zzo.zzj     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.common.zzp r3 = r5.zzb(r3)     // Catch: java.lang.Throwable -> L8d
            boolean r5 = r5.zza()     // Catch: android.os.RemoteException -> L67 java.lang.Throwable -> L8d
            if (r5 == 0) goto L2a
            com.google.android.gms.common.internal.zzad r5 = com.google.android.gms.common.zzo.zzg     // Catch: android.os.RemoteException -> L67 java.lang.Throwable -> L8d
            com.google.android.gms.common.zzr r5 = r5.zzf(r3)     // Catch: android.os.RemoteException -> L67 java.lang.Throwable -> L8d
            goto L30
        L2a:
            com.google.android.gms.common.internal.zzad r5 = com.google.android.gms.common.zzo.zzg     // Catch: android.os.RemoteException -> L67 java.lang.Throwable -> L8d
            com.google.android.gms.common.zzr r5 = r5.zzh(r3)     // Catch: android.os.RemoteException -> L67 java.lang.Throwable -> L8d
        L30:
            boolean r0 = r5.zza()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L43
            int r0 = r5.zze()     // Catch: java.lang.Throwable -> L8d
            long r3 = r5.zzc()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.common.zzy r5 = com.google.android.gms.common.zzy.zzf(r0, r3)     // Catch: java.lang.Throwable -> L8d
            goto L89
        L43:
            java.lang.String r0 = r5.zzb()     // Catch: java.lang.Throwable -> L8d
            int r1 = r5.zzd()     // Catch: java.lang.Throwable -> L8d
            r3 = 4
            if (r1 != r3) goto L54
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> L8d
            r1.<init>()     // Catch: java.lang.Throwable -> L8d
            goto L55
        L54:
            r1 = 0
        L55:
            java.lang.String r3 = "error checking package certificate"
            if (r0 != 0) goto L5a
            r0 = r3
        L5a:
            int r3 = r5.zze()     // Catch: java.lang.Throwable -> L8d
            int r5 = r5.zzd()     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.common.zzy r5 = com.google.android.gms.common.zzy.zzg(r3, r5, r0, r1)     // Catch: java.lang.Throwable -> L8d
            goto L89
        L67:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = "module call"
            com.google.android.gms.common.zzy r5 = com.google.android.gms.common.zzy.zzd(r0, r5)     // Catch: java.lang.Throwable -> L8d
            goto L89
        L72:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r5.getMessage()     // Catch: java.lang.Throwable -> L8d
            java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.common.zzy r5 = com.google.android.gms.common.zzy.zzd(r0, r5)     // Catch: java.lang.Throwable -> L8d
        L89:
            android.os.StrictMode.setThreadPolicy(r2)
            return r5
        L8d:
            r5 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r5
    }

    @java.lang.Deprecated
    static com.google.android.gms.common.zzy zzd(java.lang.String r1, com.google.android.gms.common.zzj r2, boolean r3, boolean r4) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.zzy r1 = zzf(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        Lc:
            r1 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
    }

    static /* synthetic */ java.lang.String zze(boolean r3, java.lang.String r4, com.google.android.gms.common.zzj r5) {
            if (r3 != 0) goto Lf
            r0 = 1
            r1 = 0
            com.google.android.gms.common.zzy r0 = zzf(r4, r5, r0, r1)
            boolean r0 = r0.zza
            if (r0 == 0) goto Lf
            java.lang.String r0 = "debug cert rejected"
            goto L11
        Lf:
            java.lang.String r0 = "not allowed"
        L11:
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = com.google.android.gms.common.util.AndroidUtilsLight.zza(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r2 = r1
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2
            byte[] r5 = r5.zzc()
            byte[] r5 = r1.digest(r5)
            java.lang.String r5 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "12451000.false"
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r4, r5, r3, r1}
            java.lang.String r4 = "%s: pkg=%s, sha256=%s, atk=%s, ver=%s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            return r3
    }

    @java.lang.Deprecated
    private static com.google.android.gms.common.zzy zzf(java.lang.String r4, com.google.android.gms.common.zzj r5, boolean r6, boolean r7) {
            java.lang.String r0 = "Failed to get Google certificates from remote"
            java.lang.String r1 = "GoogleCertificates"
            zzb()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3f
            android.content.Context r2 = com.google.android.gms.common.zzo.zzj
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.zzt r2 = new com.google.android.gms.common.zzt
            r2.<init>(r4, r5, r6, r7)
            com.google.android.gms.common.internal.zzad r7 = com.google.android.gms.common.zzo.zzg     // Catch: android.os.RemoteException -> L34
            android.content.Context r3 = com.google.android.gms.common.zzo.zzj     // Catch: android.os.RemoteException -> L34
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.os.RemoteException -> L34
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L34
            boolean r7 = r7.zze(r2, r3)     // Catch: android.os.RemoteException -> L34
            if (r7 == 0) goto L28
            com.google.android.gms.common.zzy r4 = com.google.android.gms.common.zzy.zzb()
            return r4
        L28:
            com.google.android.gms.common.zzl r7 = new com.google.android.gms.common.zzl
            r7.<init>(r6, r4, r5)
            com.google.android.gms.common.zzx r4 = new com.google.android.gms.common.zzx
            r5 = 0
            r4.<init>(r7, r5)
            return r4
        L34:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            java.lang.String r5 = "module call"
            com.google.android.gms.common.zzy r4 = com.google.android.gms.common.zzy.zzd(r5, r4)
            return r4
        L3f:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            java.lang.String r5 = r4.getMessage()
            java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "module init: "
            java.lang.String r5 = r6.concat(r5)
            com.google.android.gms.common.zzy r4 = com.google.android.gms.common.zzy.zzd(r5, r4)
            return r4
    }
}
