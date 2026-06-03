package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza = 0;
    private static final java.lang.reflect.Method zzb = null;
    private static final java.lang.reflect.Method zzc = null;
    private static final java.lang.reflect.Method zzd = null;
    private static final java.lang.reflect.Method zze = null;
    private static final java.lang.reflect.Method zzf = null;
    private static final java.lang.reflect.Method zzg = null;
    private static final java.lang.reflect.Method zzh = null;
    private static final java.lang.reflect.Method zzi = null;
    private static java.lang.Boolean zzj;

    static {
            java.lang.String r0 = "add"
            int r1 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r1
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r2] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r4 = r4.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r4 = r3
        L19:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r4
            r4 = 2
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L2d
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2d
            r6[r2] = r7     // Catch: java.lang.Exception -> L2d
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r0 = r5.getMethod(r0, r6)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3b
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.Exception -> L3b
            goto L3c
        L3b:
            r0 = r3
        L3c:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r6[r2] = r7     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r0 = r3
        L4e:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L5f
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5f
            r6[r2] = r7     // Catch: java.lang.Exception -> L5f
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.Exception -> L5f
            goto L60
        L5f:
            r0 = r3
        L60:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L7b
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r6 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L75
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Exception -> L75
            goto L7c
        L75:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r6, r0)
        L7b:
            r0 = r3
        L7c:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto La1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "addNode"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L9b
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9b
            r4[r2] = r7     // Catch: java.lang.Exception -> L9b
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4[r1] = r7     // Catch: java.lang.Exception -> L9b
            java.lang.reflect.Method r0 = r0.getMethod(r6, r4)     // Catch: java.lang.Exception -> L9b
            goto La2
        L9b:
            r0 = move-exception
            java.lang.String r4 = "Missing WorkChain class"
            android.util.Log.w(r5, r4, r0)
        La1:
            r0 = r3
        La2:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lb8
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r4 = "isEmpty"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lb8
            java.lang.reflect.Method r0 = r0.getMethod(r4, r2)     // Catch: java.lang.Exception -> Lb8
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lb9
            goto Lb9
        Lb8:
            r0 = r3
        Lb9:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3
            return
    }

    private WorkSourceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void add(android.os.WorkSource r3, int r4, java.lang.String r5) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzc
            java.lang.String r1 = "Unable to assign blame through WorkSource"
            java.lang.String r2 = "WorkSourceUtil"
            if (r0 == 0) goto L1d
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
        Lc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L18
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Exception -> L18
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r3 = move-exception
            android.util.Log.wtf(r2, r1, r3)
            return
        L1d:
            java.lang.reflect.Method r5 = com.google.android.gms.common.util.WorkSourceUtil.zzb
            if (r5 == 0) goto L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L2d
            r5.invoke(r3, r4)     // Catch: java.lang.Exception -> L2d
            return
        L2d:
            r3 = move-exception
            android.util.Log.wtf(r2, r1, r3)
        L31:
            return
    }

    public static android.os.WorkSource fromPackage(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "WorkSourceUtil"
            r1 = 0
            if (r3 == 0) goto L36
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            if (r2 == 0) goto L36
            if (r4 == 0) goto L36
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r3 != 0) goto L22
            java.lang.String r3 = "Could not get applicationInfo from package: "
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.e(r0, r3)
            return r1
        L22:
            int r3 = r3.uid
            android.os.WorkSource r0 = new android.os.WorkSource
            r0.<init>()
            add(r0, r3, r4)
            return r0
        L2d:
            java.lang.String r3 = "Could not find package: "
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.e(r0, r3)
        L36:
            return r1
    }

    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            r0 = 0
            java.lang.String r1 = "WorkSourceUtil"
            if (r5 == 0) goto L6f
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            if (r2 == 0) goto L6f
            if (r7 == 0) goto L6f
            if (r6 != 0) goto L10
            goto L6f
        L10:
            r2 = -1
            r3 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r5 != 0) goto L26
            java.lang.String r5 = "Could not get applicationInfo from package: "
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r1, r5)
            goto L32
        L26:
            int r2 = r5.uid
            goto L32
        L29:
            java.lang.String r5 = "Could not find package: "
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r1, r5)
        L32:
            if (r2 >= 0) goto L35
            return r0
        L35:
            android.os.WorkSource r5 = new android.os.WorkSource
            r5.<init>()
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r0 == 0) goto L6b
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r4 != 0) goto L43
            goto L6b
        L43:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L64
            java.lang.Object r0 = r0.invoke(r5, r3)     // Catch: java.lang.Exception -> L64
            int r3 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L64
            if (r2 == r3) goto L58
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L64
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r6}     // Catch: java.lang.Exception -> L64
            r4.invoke(r0, r6)     // Catch: java.lang.Exception -> L64
        L58:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L64
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Exception -> L64
            r4.invoke(r0, r6)     // Catch: java.lang.Exception -> L64
            goto L6e
        L64:
            r6 = move-exception
            java.lang.String r7 = "Unable to assign chained blame through WorkSource"
            android.util.Log.w(r1, r7, r6)
            goto L6e
        L6b:
            add(r5, r2, r6)
        L6e:
            return r5
        L6f:
            java.lang.String r5 = "Unexpected null arguments"
            android.util.Log.w(r1, r5)
            return r0
    }

    public static int get(android.os.WorkSource r1, int r2) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zze
            if (r0 == 0) goto L22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Exception -> L1a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L1a
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L1a
            return r1
        L1a:
            r1 = move-exception
            java.lang.String r2 = "WorkSourceUtil"
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r2, r0, r1)
        L22:
            r1 = 0
            return r1
    }

    public static java.lang.String getName(android.os.WorkSource r1, int r2) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzf
            if (r0 == 0) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L13
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L13
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.String r2 = "WorkSourceUtil"
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r2, r0, r1)
        L1b:
            r1 = 0
            return r1
    }

    public static java.util.List<java.lang.String> getNames(android.os.WorkSource r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r5 != 0) goto La
            r2 = r1
            goto Le
        La:
            int r2 = size(r5)
        Le:
            if (r2 == 0) goto L28
        L10:
            if (r1 >= r2) goto L28
            java.lang.String r3 = getName(r5, r1)
            boolean r4 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r3)
            if (r4 != 0) goto L25
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r3)
        L25:
            int r1 = r1 + 1
            goto L10
        L28:
            return r0
    }

    public static synchronized boolean hasWorkSourcePermission(android.content.Context r3) {
            java.lang.Class<com.google.android.gms.common.util.WorkSourceUtil> r0 = com.google.android.gms.common.util.WorkSourceUtil.class
            monitor-enter(r0)
            java.lang.Boolean r1 = com.google.android.gms.common.util.WorkSourceUtil.zzj     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Ld
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r3
        Ld:
            r1 = 0
            if (r3 != 0) goto L12
            monitor-exit(r0)
            return r1
        L12:
            java.lang.String r2 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L1b
            r1 = 1
        L1b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3     // Catch: java.lang.Throwable -> L27
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r3
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    public static boolean isEmpty(android.os.WorkSource r4) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzi
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Object r0 = r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L15
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Exception -> L15
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L15
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Exception -> L15
            return r4
        L15:
            r0 = move-exception
            java.lang.String r2 = "WorkSourceUtil"
            java.lang.String r3 = "Unable to check WorkSource emptiness"
            android.util.Log.e(r2, r3, r0)
        L1d:
            int r4 = size(r4)
            if (r4 != 0) goto L25
            r4 = 1
            return r4
        L25:
            return r1
    }

    public static int size(android.os.WorkSource r3) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzd
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L15
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Exception -> L15
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L15
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = move-exception
            java.lang.String r0 = "WorkSourceUtil"
            java.lang.String r2 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r0, r2, r3)
        L1d:
            return r1
    }
}
