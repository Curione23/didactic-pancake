package com.google.android.gms.common.wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class InstantApps {
    private static android.content.Context zza;
    private static java.lang.Boolean zzb;

    public InstantApps() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized boolean isInstantApp(android.content.Context r4) {
            java.lang.Class<com.google.android.gms.common.wrappers.InstantApps> r0 = com.google.android.gms.common.wrappers.InstantApps.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L52
            android.content.Context r2 = com.google.android.gms.common.wrappers.InstantApps.zza     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L18
            java.lang.Boolean r3 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L18
            if (r2 == r1) goto L12
            goto L18
        L12:
            boolean r4 = r3.booleanValue()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)
            return r4
        L18:
            r2 = 0
            com.google.android.gms.common.wrappers.InstantApps.zzb = r2     // Catch: java.lang.Throwable -> L52
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L30
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L52
            boolean r4 = r4.isInstantApp()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L52
            goto L48
        L30:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L41 java.lang.Throwable -> L52
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L41 java.lang.Throwable -> L52
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.ClassNotFoundException -> L41 java.lang.Throwable -> L52
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.ClassNotFoundException -> L41 java.lang.Throwable -> L52
            goto L48
        L41:
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L52
        L48:
            com.google.android.gms.common.wrappers.InstantApps.zza = r1     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r4 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L52
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)
            return r4
        L52:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r4
    }
}
