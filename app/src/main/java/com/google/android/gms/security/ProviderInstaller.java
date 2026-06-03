package com.google.android.gms.security;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class ProviderInstaller {
    public static final java.lang.String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = null;
    private static final java.lang.Object zzb = null;
    private static java.lang.reflect.Method zzc;
    private static boolean zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int r1, android.content.Intent r2);

        void onProviderInstalled();
    }

    static {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.security.ProviderInstaller.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.security.ProviderInstaller.zzb = r0
            r0 = 0
            com.google.android.gms.security.ProviderInstaller.zzc = r0
            r0 = 0
            com.google.android.gms.security.ProviderInstaller.zzd = r0
            return
    }

    public ProviderInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void installIfNeeded(android.content.Context r14) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14, r0)
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            r1 = 11925000(0xb5f608, float:1.6710484E-38)
            r0.verifyGooglePlayServicesIsAvailable(r14, r1)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = com.google.android.gms.security.ProviderInstaller.zzb
            monitor-enter(r2)
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> La7
            r4 = 0
            if (r3 != 0) goto L47
            java.lang.String r3 = "Failed to load providerinstaller module: "
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28 java.lang.Throwable -> La7
            java.lang.String r6 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.load(r14, r5, r6)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28 java.lang.Throwable -> La7
            android.content.Context r3 = r5.getModuleContext()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28 java.lang.Throwable -> La7
            goto L3e
        L28:
            r5 = move-exception
            java.lang.String r6 = "ProviderInstaller"
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> La7
            java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = r3.concat(r5)     // Catch: java.lang.Throwable -> La7
            android.util.Log.w(r6, r3)     // Catch: java.lang.Throwable -> La7
            r3 = r4
        L3e:
            if (r3 == 0) goto L47
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzb(r3, r14, r0)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            return
        L47:
            boolean r3 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "Failed to report request stats: "
            android.content.Context r6 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r14)     // Catch: java.lang.Throwable -> La7
            if (r6 != 0) goto L52
            goto L8f
        L52:
            r4 = 1
            com.google.android.gms.security.ProviderInstaller.zzd = r4     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L8e
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            java.lang.String r3 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r9 = "reportRequestStats2"
            java.lang.ClassLoader r10 = r6.getClassLoader()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            r11 = 3
            com.google.android.gms.internal.common.zzi[] r11 = new com.google.android.gms.internal.common.zzi[r11]     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            com.google.android.gms.internal.common.zzi r12 = com.google.android.gms.internal.common.zzi.zzb(r12, r14)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            r13 = 0
            r11[r13] = r12     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            com.google.android.gms.internal.common.zzh r0 = com.google.android.gms.internal.common.zzh.zza(r0)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            r11[r4] = r0     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            com.google.android.gms.internal.common.zzh r0 = com.google.android.gms.internal.common.zzh.zza(r7)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            r1 = 2
            r11[r1] = r0     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            com.google.android.gms.internal.common.zzj.zzb(r3, r9, r10, r11)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            goto L8e
        L80:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = r5.concat(r0)     // Catch: java.lang.Throwable -> La7
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> La7
        L8e:
            r4 = r6
        L8f:
            if (r4 == 0) goto L98
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzb(r4, r14, r0)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            return
        L98:
            java.lang.String r14 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r14, r0)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r14 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> La7
            r0 = 8
            r14.<init>(r0)     // Catch: java.lang.Throwable -> La7
            throw r14     // Catch: java.lang.Throwable -> La7
        La7:
            r14 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            throw r14
    }

    public static void installIfNeededAsync(android.content.Context r1, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener r2) {
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Must be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.security.zza r0 = new com.google.android.gms.security.zza
            r0.<init>(r1, r2)
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.execute(r1)
            return
    }

    static /* synthetic */ com.google.android.gms.common.GoogleApiAvailabilityLight zza() {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.security.ProviderInstaller.zza
            return r0
    }

    private static void zzb(android.content.Context r2, android.content.Context r3, java.lang.String r4) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            java.lang.reflect.Method r3 = com.google.android.gms.security.ProviderInstaller.zzc     // Catch: java.lang.Exception -> L27
            if (r3 != 0) goto L1c
            r3 = 1
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L27
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r1 = 0
            r3[r1] = r0     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "insertProvider"
            java.lang.ClassLoader r1 = r2.getClassLoader()     // Catch: java.lang.Exception -> L27
            java.lang.Class r4 = r1.loadClass(r4)     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Method r3 = r4.getMethod(r0, r3)     // Catch: java.lang.Exception -> L27
            com.google.android.gms.security.ProviderInstaller.zzc = r3     // Catch: java.lang.Exception -> L27
        L1c:
            java.lang.reflect.Method r3 = com.google.android.gms.security.ProviderInstaller.zzc     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L27
            r4 = 0
            r3.invoke(r4, r2)     // Catch: java.lang.Exception -> L27
            return
        L27:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            r4 = 6
            java.lang.String r0 = "ProviderInstaller"
            boolean r4 = android.util.Log.isLoggable(r0, r4)
            if (r4 == 0) goto L50
            if (r3 != 0) goto L3c
            java.lang.String r2 = r2.toString()
            goto L40
        L3c:
            java.lang.String r2 = r3.toString()
        L40:
            java.lang.String.valueOf(r2)
            java.lang.String r3 = "Failed to install provider: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.e(r0, r2)
        L50:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r2 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3 = 8
            r2.<init>(r3)
            throw r2
    }
}
