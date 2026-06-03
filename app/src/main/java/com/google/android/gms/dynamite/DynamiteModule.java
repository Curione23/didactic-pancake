package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;
    public static final int REMOTE = 1;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zzb = null;
    private static java.lang.Boolean zzc = null;
    private static java.lang.String zzd = null;
    private static boolean zze = false;
    private static int zzf = -1;
    private static java.lang.Boolean zzg;
    private static final java.lang.ThreadLocal zzh = null;
    private static final java.lang.ThreadLocal zzi = null;
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzj = null;
    private static com.google.android.gms.dynamite.zzp zzl;
    private static com.google.android.gms.dynamite.zzq zzm;
    private final android.content.Context zzk;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class LoadingException extends java.lang.Exception {
        /* synthetic */ LoadingException(java.lang.String r1, java.lang.Throwable r2, byte[] r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ LoadingException(java.lang.String r1, byte[] r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public interface IVersions {
            int zza(android.content.Context r1, java.lang.String r2, boolean r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;

            int zzb(android.content.Context r1, java.lang.String r2);
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public static class SelectionResult {
            public int localVersion;
            public int remoteVersion;
            public int selection;

            public SelectionResult() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.localVersion = r0
                    r1.remoteVersion = r0
                    r1.selection = r0
                    return
            }
        }

        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r1, java.lang.String r2, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzh = r0
            com.google.android.gms.dynamite.zze r0 = new com.google.android.gms.dynamite.zze
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzi = r0
            com.google.android.gms.dynamite.zzf r0 = new com.google.android.gms.dynamite.zzf
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzj = r0
            com.google.android.gms.dynamite.zzg r0 = new com.google.android.gms.dynamite.zzg
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE = r0
            com.google.android.gms.dynamite.zzh r0 = new com.google.android.gms.dynamite.zzh
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL = r0
            com.google.android.gms.dynamite.zzi r0 = new com.google.android.gms.dynamite.zzi
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzj r0 = new com.google.android.gms.dynamite.zzj
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = r0
            com.google.android.gms.dynamite.zzk r0 = new com.google.android.gms.dynamite.zzk
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzl r0 = new com.google.android.gms.dynamite.zzl
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = r0
            com.google.android.gms.dynamite.zzm r0 = new com.google.android.gms.dynamite.zzm
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zza = r0
            com.google.android.gms.dynamite.zzc r0 = new com.google.android.gms.dynamite.zzc
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzb = r0
            return
    }

    private DynamiteModule(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0 = r2
            android.content.Context r0 = (android.content.Context) r0
            r1.zzk = r2
            return
    }

    public static int getLocalVersion(android.content.Context r9, java.lang.String r10) {
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "'"
            java.lang.String r2 = "' didn't match expected id '"
            java.lang.String r3 = "Module descriptor id '"
            java.lang.String r4 = ".ModuleDescriptor"
            java.lang.String r5 = "com.google.android.gms.dynamite.descriptors."
            r6 = 0
            android.content.Context r9 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            int r7 = r7.length()     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            int r7 = r7 + 61
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r8.<init>(r7)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r8.append(r5)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r8.append(r10)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r8.append(r4)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.Class r9 = r9.loadClass(r4)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.String r4 = "MODULE_ID"
            java.lang.reflect.Field r4 = r9.getDeclaredField(r4)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.String r5 = "MODULE_VERSION"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r5)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r5 = 0
            java.lang.Object r7 = r4.get(r5)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            boolean r7 = com.google.android.gms.common.internal.Objects.equal(r7, r10)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            if (r7 != 0) goto L85
            java.lang.Object r9 = r4.get(r5)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            int r4 = r4.length()     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            int r4 = r4 + 50
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            int r5 = r5.length()     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            int r4 = r4 + r5
            int r4 = r4 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r5.<init>(r4)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r5.append(r3)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r5.append(r9)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r5.append(r2)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r5.append(r10)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            r5.append(r1)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            android.util.Log.e(r0, r9)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            return r6
        L85:
            int r9 = r9.getInt(r5)     // Catch: java.lang.Exception -> L8a java.lang.ClassNotFoundException -> La0
            return r9
        L8a:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String.valueOf(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Failed to load module descriptor class: "
            java.lang.String r9 = r10.concat(r9)
            android.util.Log.e(r0, r9)
            goto Lc3
        La0:
            java.lang.String r9 = java.lang.String.valueOf(r10)
            int r9 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r9 = r9 + 45
            r1.<init>(r9)
            java.lang.String r9 = "Local module descriptor class for "
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = " not found."
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.w(r0, r9)
        Lc3:
            return r6
    }

    public static int getRemoteVersion(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            int r1 = zza(r1, r2, r0)
            return r1
    }

    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r28, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r29, java.lang.String r30) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r0 = " and remote module "
            java.lang.String r4 = ":"
            java.lang.String r5 = "Considering local module "
            java.lang.String r6 = "VersionPolicy returned invalid code:"
            java.lang.String r7 = "."
            java.lang.String r8 = " and remote version is "
            java.lang.String r9 = " found. Local version is "
            java.lang.String r10 = "No acceptable module "
            java.lang.String r11 = "Failed to load remote module: "
            android.content.Context r12 = r28.getApplicationContext()
            r13 = 0
            if (r12 == 0) goto L384
            java.lang.ThreadLocal r14 = com.google.android.gms.dynamite.DynamiteModule.zzh
            java.lang.Object r15 = r14.get()
            com.google.android.gms.dynamite.zzn r15 = (com.google.android.gms.dynamite.zzn) r15
            r16 = r7
            com.google.android.gms.dynamite.zzn r7 = new com.google.android.gms.dynamite.zzn
            r7.<init>(r13)
            r14.set(r7)
            java.lang.ThreadLocal r13 = com.google.android.gms.dynamite.DynamiteModule.zzi
            java.lang.Object r17 = r13.get()
            java.lang.Long r17 = (java.lang.Long) r17
            long r17 = r17.longValue()
            r19 = 0
            long r21 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L363
            r23 = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Throwable -> L363
            r13.set(r8)     // Catch: java.lang.Throwable -> L363
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r8 = com.google.android.gms.dynamite.DynamiteModule.zzj     // Catch: java.lang.Throwable -> L363
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r8 = r2.selectModule(r1, r3, r8)     // Catch: java.lang.Throwable -> L363
            r21 = r9
            java.lang.String r9 = "DynamiteModule"
            r22 = r10
            int r10 = r8.localVersion     // Catch: java.lang.Throwable -> L363
            r24 = r6
            int r6 = r8.remoteVersion     // Catch: java.lang.Throwable -> L363
            java.lang.String r25 = java.lang.String.valueOf(r30)     // Catch: java.lang.Throwable -> L363
            int r25 = r25.length()     // Catch: java.lang.Throwable -> L363
            int r25 = r25 + 26
            java.lang.String r26 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L363
            int r26 = r26.length()     // Catch: java.lang.Throwable -> L363
            int r25 = r25 + r26
            int r25 = r25 + 19
            java.lang.String r26 = java.lang.String.valueOf(r30)     // Catch: java.lang.Throwable -> L363
            int r26 = r26.length()     // Catch: java.lang.Throwable -> L363
            int r25 = r25 + r26
            r2 = 1
            int r25 = r25 + 1
            java.lang.String r26 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L363
            int r26 = r26.length()     // Catch: java.lang.Throwable -> L363
            int r2 = r25 + r26
            r25 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L363
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L363
            r11.append(r5)     // Catch: java.lang.Throwable -> L363
            r11.append(r3)     // Catch: java.lang.Throwable -> L363
            r11.append(r4)     // Catch: java.lang.Throwable -> L363
            r11.append(r10)     // Catch: java.lang.Throwable -> L363
            r11.append(r0)     // Catch: java.lang.Throwable -> L363
            r11.append(r3)     // Catch: java.lang.Throwable -> L363
            r11.append(r4)     // Catch: java.lang.Throwable -> L363
            r11.append(r6)     // Catch: java.lang.Throwable -> L363
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L363
            android.util.Log.i(r9, r0)     // Catch: java.lang.Throwable -> L363
            int r0 = r8.selection     // Catch: java.lang.Throwable -> L363
            if (r0 == 0) goto L312
            r2 = -1
            if (r0 != r2) goto Lbd
            int r0 = r8.localVersion     // Catch: java.lang.Throwable -> L363
            if (r0 == 0) goto L312
            r0 = r2
        Lbd:
            r4 = 1
            if (r0 != r4) goto Lc4
            int r4 = r8.remoteVersion     // Catch: java.lang.Throwable -> L363
            if (r4 == 0) goto L312
        Lc4:
            if (r0 != r2) goto Le4
            com.google.android.gms.dynamite.DynamiteModule r0 = zze(r12, r3)     // Catch: java.lang.Throwable -> L363
            int r1 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r1 != 0) goto Ld2
            r13.remove()
            goto Ld9
        Ld2:
            java.lang.Long r1 = java.lang.Long.valueOf(r17)
            r13.set(r1)
        Ld9:
            android.database.Cursor r1 = r7.zza
            if (r1 == 0) goto Le0
            r1.close()
        Le0:
            r14.set(r15)
            return r0
        Le4:
            r4 = 1
            if (r0 != r4) goto L2f0
            r5 = 0
            int r0 = r8.remoteVersion     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r6 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            boolean r9 = zzb(r28)     // Catch: java.lang.Throwable -> L26f
            if (r9 == 0) goto L266
            java.lang.Boolean r9 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L26f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L26f
            if (r9 == 0) goto L25d
            boolean r6 = r9.booleanValue()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r9 = 2
            if (r6 == 0) goto L1bd
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r10 = "Selected remote version of "
            java.lang.String r11 = ", version >= "
            java.lang.String r13 = java.lang.String.valueOf(r30)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r13 = r13.length()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r13 = r13 + 40
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r16 = r16.length()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r13 = r13 + r16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r4.append(r10)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r4.append(r3)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r4.append(r11)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r4.append(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            android.util.Log.i(r6, r4)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamite.zzq r6 = com.google.android.gms.dynamite.DynamiteModule.zzm     // Catch: java.lang.Throwable -> L1ba
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1ba
            if (r6 == 0) goto L1b1
            java.lang.Object r4 = r14.get()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamite.zzn r4 = (com.google.android.gms.dynamite.zzn) r4     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            if (r4 == 0) goto L1a8
            android.database.Cursor r10 = r4.zza     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            if (r10 == 0) goto L1a8
            android.content.Context r10 = r28.getApplicationContext()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            android.database.Cursor r4 = r4.zza     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r11 = 0
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r13 = com.google.android.gms.dynamite.DynamiteModule.zzf     // Catch: java.lang.Throwable -> L1a5
            if (r13 < r9) goto L159
            r27 = 1
            goto L15b
        L159:
            r27 = r5
        L15b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r27)     // Catch: java.lang.Throwable -> L1a5
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L1a5
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            if (r9 == 0) goto L17a
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r9, r11)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r0 = r6.zzf(r9, r3, r0, r4)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            goto L18d
        L17a:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r9, r11)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r0 = r6.zze(r9, r3, r0, r4)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L18d:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            if (r0 == 0) goto L19c
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            goto L2c7
        L19c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = "Failed to get module context"
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L1a5:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L1a5
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L1a8:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = "No result cursor"
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L1b1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L1ba:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1ba
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L1bd:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r6 = "Selected remote version of "
            java.lang.String r10 = ", version >= "
            java.lang.String r11 = java.lang.String.valueOf(r30)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r11 = r11.length()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r11 = r11 + 40
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r13 = r13.length()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            int r11 = r11 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r13.<init>(r11)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r13.append(r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r13.append(r3)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r13.append(r10)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r13.append(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r6 = r13.toString()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            android.util.Log.i(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamite.zzp r4 = zzg(r28)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            if (r4 == 0) goto L254
            int r6 = r4.zzi()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r10 = 3
            if (r6 < r10) goto L21b
            java.lang.Object r6 = r14.get()     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamite.zzn r6 = (com.google.android.gms.dynamite.zzn) r6     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            if (r6 == 0) goto L212
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r28)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            android.database.Cursor r6 = r6.zza     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzk(r9, r3, r0, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            goto L23c
        L212:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = "No cached result cursor holder"
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L21b:
            if (r6 != r9) goto L22d
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r9 = "IDynamite loader version = 2"
            android.util.Log.w(r6, r9)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r28)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzg(r6, r3, r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            goto L23c
        L22d:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r9 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r6, r9)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r28)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zze(r6, r3, r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L23c:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            if (r0 == 0) goto L24b
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            goto L2c7
        L24b:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = "Failed to load remote module."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L254:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L25d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            java.lang.String r4 = "Failed to determine which loading route to use."
            r6 = 0
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L266:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L26f
            java.lang.String r4 = "Remote loading disabled"
            r9 = 0
            r0.<init>(r4, r9)     // Catch: java.lang.Throwable -> L26f
            throw r0     // Catch: java.lang.Throwable -> L26f
        L26f:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L26f
            throw r0     // Catch: java.lang.Throwable -> L272 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L27f android.os.RemoteException -> L281
        L272:
            r0 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
            java.lang.String r6 = "Failed to load remote module."
            r9 = 0
            r4.<init>(r6, r0, r9)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
            throw r4     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
        L27f:
            r0 = move-exception
            throw r0     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
        L281:
            r0 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
            java.lang.String r6 = "Failed to load remote module."
            r9 = 0
            r4.<init>(r6, r0, r9)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
            throw r4     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L28b java.lang.Throwable -> L363
        L28b:
            r0 = move-exception
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r6 = r0.getMessage()     // Catch: java.lang.Throwable -> L363
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L363
            int r9 = r9.length()     // Catch: java.lang.Throwable -> L363
            int r9 = r9 + 30
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L363
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L363
            r9 = r25
            r10.append(r9)     // Catch: java.lang.Throwable -> L363
            r10.append(r6)     // Catch: java.lang.Throwable -> L363
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L363
            android.util.Log.w(r4, r6)     // Catch: java.lang.Throwable -> L363
            int r4 = r8.localVersion     // Catch: java.lang.Throwable -> L363
            if (r4 == 0) goto L2e7
            com.google.android.gms.dynamite.zzo r6 = new com.google.android.gms.dynamite.zzo     // Catch: java.lang.Throwable -> L363
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L363
            r4 = r29
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r1 = r4.selectModule(r1, r3, r6)     // Catch: java.lang.Throwable -> L363
            int r1 = r1.selection     // Catch: java.lang.Throwable -> L363
            if (r1 != r2) goto L2e7
            com.google.android.gms.dynamite.DynamiteModule r4 = zze(r12, r3)     // Catch: java.lang.Throwable -> L363
        L2c7:
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 != 0) goto L2d1
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzi
            r0.remove()
            goto L2da
        L2d1:
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzi
            java.lang.Long r1 = java.lang.Long.valueOf(r17)
            r0.set(r1)
        L2da:
            android.database.Cursor r0 = r7.zza
            if (r0 == 0) goto L2e1
            r0.close()
        L2e1:
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r0.set(r15)
            return r4
        L2e7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L363
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L363
            throw r1     // Catch: java.lang.Throwable -> L363
        L2f0:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L363
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L363
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L363
            int r2 = r2 + 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L363
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L363
            r2 = r24
            r3.append(r2)     // Catch: java.lang.Throwable -> L363
            r3.append(r0)     // Catch: java.lang.Throwable -> L363
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L363
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L363
            throw r1     // Catch: java.lang.Throwable -> L363
        L312:
            r0 = 1
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L363
            int r2 = r8.localVersion     // Catch: java.lang.Throwable -> L363
            int r4 = r8.remoteVersion     // Catch: java.lang.Throwable -> L363
            java.lang.String r5 = java.lang.String.valueOf(r30)     // Catch: java.lang.Throwable -> L363
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L363
            int r5 = r5 + 46
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L363
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L363
            int r5 = r5 + r6
            int r5 = r5 + 23
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L363
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L363
            int r5 = r5 + r6
            int r5 = r5 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L363
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L363
            r5 = r22
            r0.append(r5)     // Catch: java.lang.Throwable -> L363
            r0.append(r3)     // Catch: java.lang.Throwable -> L363
            r3 = r21
            r0.append(r3)     // Catch: java.lang.Throwable -> L363
            r0.append(r2)     // Catch: java.lang.Throwable -> L363
            r2 = r23
            r0.append(r2)     // Catch: java.lang.Throwable -> L363
            r0.append(r4)     // Catch: java.lang.Throwable -> L363
            r2 = r16
            r0.append(r2)     // Catch: java.lang.Throwable -> L363
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L363
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L363
            throw r1     // Catch: java.lang.Throwable -> L363
        L363:
            r0 = move-exception
            int r1 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r1 != 0) goto L36e
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzi
            r1.remove()
            goto L377
        L36e:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzi
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            r1.set(r2)
        L377:
            android.database.Cursor r1 = r7.zza
            if (r1 == 0) goto L37e
            r1.close()
        L37e:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.set(r15)
            throw r0
        L384:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
    }

    public static int zza(android.content.Context r12, java.lang.String r13, boolean r14) {
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r1 = "Failed to load module via V2: "
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r2 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1e5
            java.lang.Boolean r3 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L1e2
            r4 = 0
            r5 = 0
            if (r3 != 0) goto Le9
            android.content.Context r3 = r12.getApplicationContext()     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r6 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r6 = r6.getName()     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
            java.lang.Class r3 = r3.loadClass(r6)     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
            java.lang.String r6 = "sClassLoader"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
            java.lang.Class r6 = r3.getDeclaringClass()     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
            monitor-enter(r6)     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
            java.lang.Object r7 = r3.get(r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.ClassLoader r7 = (java.lang.ClassLoader) r7     // Catch: java.lang.Throwable -> Lbe
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> Lbe
            if (r7 != r8) goto L3a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lbe
            goto Lbc
        L3a:
            if (r7 == 0) goto L43
            zzf(r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3f java.lang.Throwable -> Lbe
        L3f:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lbe
            goto Lbc
        L43:
            boolean r7 = zzb(r12)     // Catch: java.lang.Throwable -> Lbe
            if (r7 != 0) goto L4c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e2
            return r5
        L4c:
            boolean r7 = com.google.android.gms.dynamite.DynamiteModule.zze     // Catch: java.lang.Throwable -> Lbe
            if (r7 != 0) goto Lb3
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lbe
            boolean r7 = r7.equals(r4)     // Catch: java.lang.Throwable -> Lbe
            if (r7 == 0) goto L59
            goto Lb3
        L59:
            r7 = 1
            int r7 = zzc(r12, r13, r14, r7)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            java.lang.String r8 = com.google.android.gms.dynamite.DynamiteModule.zzd     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            if (r8 == 0) goto La6
            boolean r8 = r8.isEmpty()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            if (r8 == 0) goto L69
            goto La6
        L69:
            java.lang.ClassLoader r8 = com.google.android.gms.dynamite.zzb.zza()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            if (r8 == 0) goto L70
            goto L99
        L70:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            r9 = 29
            if (r8 < r9) goto L88
            dalvik.system.DelegateLastClassLoader r8 = new dalvik.system.DelegateLastClassLoader     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            java.lang.String r9 = com.google.android.gms.dynamite.DynamiteModule.zzd     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            r8.<init>(r9, r10)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            goto L99
        L88:
            com.google.android.gms.dynamite.zzd r8 = new com.google.android.gms.dynamite.zzd     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            java.lang.String r9 = com.google.android.gms.dynamite.DynamiteModule.zzd     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            r8.<init>(r9, r10)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
        L99:
            zzf(r8)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            r3.set(r4, r8)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            com.google.android.gms.dynamite.DynamiteModule.zzc = r8     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La9 java.lang.Throwable -> Lbe
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e2
            return r7
        La6:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e2
            return r7
        La9:
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> Lbe
            r3.set(r4, r7)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lbe
            goto Lbc
        Lb3:
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> Lbe
            r3.set(r4, r7)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lbe
        Lbc:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbe
            goto Le7
        Lbe:
            r3 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbe
            throw r3     // Catch: java.lang.NoSuchFieldException -> Lc1 java.lang.IllegalAccessException -> Lc3 java.lang.ClassNotFoundException -> Lc5 java.lang.Throwable -> L1e2
        Lc1:
            r3 = move-exception
            goto Lc6
        Lc3:
            r3 = move-exception
            goto Lc6
        Lc5:
            r3 = move-exception
        Lc6:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1e2
            int r7 = r3.length()     // Catch: java.lang.Throwable -> L1e2
            int r7 = r7 + 30
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e2
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L1e2
            r8.append(r1)     // Catch: java.lang.Throwable -> L1e2
            r8.append(r3)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L1e2
            android.util.Log.w(r6, r1)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1e2
            r3 = r1
        Le7:
            com.google.android.gms.dynamite.DynamiteModule.zzc = r3     // Catch: java.lang.Throwable -> L1e2
        Le9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e2
            boolean r1 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1e5
            if (r1 == 0) goto L119
            int r12 = zzc(r12, r13, r14, r5)     // Catch: com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lf5 java.lang.Throwable -> L1e5
            return r12
        Lf5:
            r13 = move-exception
            java.lang.String r14 = "DynamiteModule"
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L1e5
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L1e5
            int r1 = r1 + 42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e5
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1e5
            r2.append(r0)     // Catch: java.lang.Throwable -> L1e5
            r2.append(r13)     // Catch: java.lang.Throwable -> L1e5
            java.lang.String r13 = r2.toString()     // Catch: java.lang.Throwable -> L1e5
            android.util.Log.w(r14, r13)     // Catch: java.lang.Throwable -> L1e5
            return r5
        L119:
            java.lang.String r0 = "Failed to retrieve remote module version: "
            com.google.android.gms.dynamite.zzp r6 = zzg(r12)     // Catch: java.lang.Throwable -> L1e5
            if (r6 != 0) goto L123
            goto L1d9
        L123:
            int r1 = r6.zzi()     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            r2 = 3
            if (r1 < r2) goto L18b
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            com.google.android.gms.dynamite.zzn r1 = (com.google.android.gms.dynamite.zzn) r1     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            if (r1 == 0) goto L13e
            android.database.Cursor r1 = r1.zza     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            if (r1 == 0) goto L13e
            int r5 = r1.getInt(r5)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            goto L1d9
        L13e:
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzi     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            long r10 = r1.longValue()     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            r8 = r13
            r9 = r14
            com.google.android.gms.dynamic.IObjectWrapper r13 = r6.zzj(r7, r8, r9, r10)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            java.lang.Object r13 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            android.database.Cursor r13 = (android.database.Cursor) r13     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            if (r13 == 0) goto L178
            boolean r14 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L185 android.os.RemoteException -> L188
            if (r14 != 0) goto L163
            goto L178
        L163:
            int r14 = r13.getInt(r5)     // Catch: java.lang.Throwable -> L185 android.os.RemoteException -> L188
            if (r14 <= 0) goto L170
            boolean r0 = zzd(r13)     // Catch: java.lang.Throwable -> L185 android.os.RemoteException -> L188
            if (r0 == 0) goto L170
            goto L171
        L170:
            r4 = r13
        L171:
            if (r4 == 0) goto L176
            r4.close()     // Catch: java.lang.Throwable -> L1e5
        L176:
            r5 = r14
            goto L1d9
        L178:
            java.lang.String r14 = "DynamiteModule"
            java.lang.String r1 = "Failed to retrieve remote module version."
            android.util.Log.w(r14, r1)     // Catch: java.lang.Throwable -> L185 android.os.RemoteException -> L188
            if (r13 == 0) goto L1d9
            r13.close()     // Catch: java.lang.Throwable -> L1e5
            goto L1d9
        L185:
            r14 = move-exception
            r4 = r13
            goto L1dc
        L188:
            r14 = move-exception
            r4 = r13
            goto L1b2
        L18b:
            r2 = 2
            if (r1 != r2) goto L19e
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r1, r2)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            int r5 = r6.zzh(r1, r13, r14)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            goto L1d9
        L19e:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r2)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            int r5 = r6.zzf(r1, r13, r14)     // Catch: android.os.RemoteException -> L1b0 java.lang.Throwable -> L1da
            goto L1d9
        L1ae:
            r14 = r13
            goto L1dc
        L1b0:
            r13 = move-exception
            r14 = r13
        L1b2:
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L1da
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L1da
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L1da
            int r1 = r1 + 42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1da
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1da
            r2.append(r0)     // Catch: java.lang.Throwable -> L1da
            r2.append(r14)     // Catch: java.lang.Throwable -> L1da
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> L1da
            android.util.Log.w(r13, r14)     // Catch: java.lang.Throwable -> L1da
            if (r4 == 0) goto L1d9
            r4.close()     // Catch: java.lang.Throwable -> L1e5
        L1d9:
            return r5
        L1da:
            r13 = move-exception
            goto L1ae
        L1dc:
            if (r4 == 0) goto L1e1
            r4.close()     // Catch: java.lang.Throwable -> L1e5
        L1e1:
            throw r14     // Catch: java.lang.Throwable -> L1e5
        L1e2:
            r13 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e2
            throw r13     // Catch: java.lang.Throwable -> L1e5
        L1e5:
            r13 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r12, r13)
            throw r13
    }

    private static boolean zzb(android.content.Context r6) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 0
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = com.google.android.gms.dynamite.DynamiteModule.zzg
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            return r1
        L16:
            java.lang.Boolean r0 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.String r2 = "DynamiteModule"
            r3 = 0
            if (r0 != 0) goto L6a
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r1 == r4) goto L29
            r4 = r3
            goto L2b
        L29:
            r4 = 268435456(0x10000000, float:2.524355E-29)
        L2b:
            java.lang.String r5 = "com.google.android.gms.chimera"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r5, r4)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r5 = 10000000(0x989680, float:1.4012985E-38)
            int r6 = r4.isGooglePlayServicesAvailable(r6, r5)
            if (r6 != 0) goto L4b
            if (r0 == 0) goto L4b
            java.lang.String r6 = "com.google.android.gms"
            java.lang.String r4 = r0.packageName
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L4b
            r3 = r1
        L4b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.dynamite.DynamiteModule.zzg = r6
            boolean r3 = r6.booleanValue()
            if (r3 == 0) goto L6a
            android.content.pm.ApplicationInfo r6 = r0.applicationInfo
            if (r6 == 0) goto L6a
            android.content.pm.ApplicationInfo r6 = r0.applicationInfo
            int r6 = r6.flags
            r6 = r6 & 129(0x81, float:1.81E-43)
            if (r6 != 0) goto L6a
            java.lang.String r6 = "Non-system-image GmsCore APK, forcing V1"
            android.util.Log.i(r2, r6)
            com.google.android.gms.dynamite.DynamiteModule.zze = r1
        L6a:
            if (r3 != 0) goto L71
            java.lang.String r6 = "Invalid GmsCore APK, remote loading disabled."
            android.util.Log.e(r2, r6)
        L71:
            return r3
    }

    private static int zzc(android.content.Context r15, java.lang.String r16, boolean r17, boolean r18) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            java.lang.String r1 = "V2 version check failed: "
            r2 = 0
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzi     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            java.lang.String r0 = "api_force_staging"
            java.lang.String r5 = "api"
            r6 = 1
            r7 = r17
            if (r6 == r7) goto L19
            r0 = r5
        L19:
            android.net.Uri$Builder r5 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            r5.<init>()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            java.lang.String r7 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r7)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            java.lang.String r7 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r5 = r5.authority(r7)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            android.net.Uri$Builder r0 = r5.path(r0)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            r5 = r16
            android.net.Uri$Builder r0 = r0.appendPath(r5)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            java.lang.String r5 = "requestStartUptime"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r5, r3)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            android.net.Uri r8 = r0.build()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            android.content.ContentResolver r0 = r15.getContentResolver()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            android.content.ContentProviderClient r3 = r0.acquireUnstableContentProviderClient(r8)     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            r4 = 2
            r5 = 0
            if (r3 != 0) goto L51
        L4e:
            r9 = r2
            goto Le6
        L51:
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r3
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le1
            if (r7 != 0) goto L60
        L5c:
            r3.release()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            goto L4e
        L60:
            int r0 = r7.getCount()     // Catch: java.lang.Throwable -> Ld5
            int r8 = r7.getColumnCount()     // Catch: java.lang.Throwable -> Ld5
            android.database.MatrixCursor r9 = new android.database.MatrixCursor     // Catch: java.lang.Throwable -> Ld5
            java.lang.String[] r10 = r7.getColumnNames()     // Catch: java.lang.Throwable -> Ld5
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> Ld5
            r10 = r5
        L72:
            if (r10 >= r0) goto Lce
            boolean r11 = r7.moveToPosition(r10)     // Catch: java.lang.Throwable -> Ld5
            if (r11 == 0) goto Lc6
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Ld5
            r12 = r5
        L7d:
            if (r12 >= r8) goto Lc0
            int r13 = r7.getType(r12)     // Catch: java.lang.Throwable -> Ld5
            if (r13 == 0) goto Lbb
            if (r13 == r6) goto Lb0
            if (r13 == r4) goto La5
            r14 = 3
            if (r13 == r14) goto L9e
            r14 = 4
            if (r13 != r14) goto L96
            byte[] r13 = r7.getBlob(r12)     // Catch: java.lang.Throwable -> Ld5
            r11[r12] = r13     // Catch: java.lang.Throwable -> Ld5
            goto Lbd
        L96:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r8 = "Unknown column type"
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Ld5
            throw r0     // Catch: java.lang.Throwable -> Ld5
        L9e:
            java.lang.String r13 = r7.getString(r12)     // Catch: java.lang.Throwable -> Ld5
            r11[r12] = r13     // Catch: java.lang.Throwable -> Ld5
            goto Lbd
        La5:
            double r13 = r7.getDouble(r12)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Double r13 = java.lang.Double.valueOf(r13)     // Catch: java.lang.Throwable -> Ld5
            r11[r12] = r13     // Catch: java.lang.Throwable -> Ld5
            goto Lbd
        Lb0:
            long r13 = r7.getLong(r12)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> Ld5
            r11[r12] = r13     // Catch: java.lang.Throwable -> Ld5
            goto Lbd
        Lbb:
            r11[r12] = r2     // Catch: java.lang.Throwable -> Ld5
        Lbd:
            int r12 = r12 + 1
            goto L7d
        Lc0:
            r9.addRow(r11)     // Catch: java.lang.Throwable -> Ld5
            int r10 = r10 + 1
            goto L72
        Lc6:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r8 = "Cursor read incomplete (ContentProvider dead?)"
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Ld5
            throw r0     // Catch: java.lang.Throwable -> Ld5
        Lce:
            r7.close()     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le1
            r3.release()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            goto Le6
        Ld5:
            r0 = move-exception
            r8 = r0
            r7.close()     // Catch: java.lang.Throwable -> Ldb
            goto Le0
        Ldb:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le1
        Le0:
            throw r8     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> Le1
        Le1:
            r0 = move-exception
            r3.release()     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
            throw r0     // Catch: java.lang.Throwable -> L14e java.lang.Exception -> L150
        Le6:
            if (r9 == 0) goto L13f
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            if (r0 == 0) goto L13f
            int r0 = r9.getInt(r5)     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            if (r0 <= 0) goto L12a
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r3 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r3)     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            java.lang.String r4 = r9.getString(r4)     // Catch: java.lang.Throwable -> L127
            com.google.android.gms.dynamite.DynamiteModule.zzd = r4     // Catch: java.lang.Throwable -> L127
            java.lang.String r4 = "loaderVersion"
            int r4 = r9.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L127
            if (r4 < 0) goto L10b
            int r4 = r9.getInt(r4)     // Catch: java.lang.Throwable -> L127
            com.google.android.gms.dynamite.DynamiteModule.zzf = r4     // Catch: java.lang.Throwable -> L127
        L10b:
            java.lang.String r4 = "disableStandaloneDynamiteLoader2"
            int r4 = r9.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L127
            if (r4 < 0) goto L11e
            int r4 = r9.getInt(r4)     // Catch: java.lang.Throwable -> L127
            if (r4 == 0) goto L11a
            goto L11b
        L11a:
            r6 = r5
        L11b:
            com.google.android.gms.dynamite.DynamiteModule.zze = r6     // Catch: java.lang.Throwable -> L127
            r5 = r6
        L11e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L127
            boolean r3 = zzd(r9)     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            if (r3 == 0) goto L12a
            r9 = r2
            goto L12a
        L127:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L127
            throw r0     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
        L12a:
            if (r18 == 0) goto L139
            if (r5 != 0) goto L12f
            goto L139
        L12f:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            java.lang.String r3 = "forcing fallback to container DynamiteLoader impl"
            r0.<init>(r3, r2)     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            throw r0     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
        L137:
            r0 = move-exception
            goto L152
        L139:
            if (r9 == 0) goto L13e
            r9.close()
        L13e:
            return r0
        L13f:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r3 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r3)     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            java.lang.String r3 = "Failed to connect to dynamite module ContentResolver."
            r0.<init>(r3, r2)     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
            throw r0     // Catch: java.lang.Exception -> L137 java.lang.Throwable -> L17a
        L14e:
            r0 = move-exception
            goto L17c
        L150:
            r0 = move-exception
            r9 = r2
        L152:
            boolean r3 = r0 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> L17a
            if (r3 != 0) goto L179
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r3 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L17a
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L17a
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L17a
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L17a
            int r5 = r5 + 25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L17a
            r6.append(r1)     // Catch: java.lang.Throwable -> L17a
            r6.append(r4)     // Catch: java.lang.Throwable -> L17a
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L17a
            r3.<init>(r1, r0, r2)     // Catch: java.lang.Throwable -> L17a
            throw r3     // Catch: java.lang.Throwable -> L17a
        L179:
            throw r0     // Catch: java.lang.Throwable -> L17a
        L17a:
            r0 = move-exception
            r2 = r9
        L17c:
            if (r2 == 0) goto L181
            r2.close()
        L181:
            throw r0
    }

    private static boolean zzd(android.database.Cursor r2) {
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzh
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0
            if (r0 == 0) goto L12
            android.database.Cursor r1 = r0.zza
            if (r1 != 0) goto L12
            r0.zza = r2
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private static com.google.android.gms.dynamite.DynamiteModule zze(android.content.Context r2, java.lang.String r3) {
            java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "Selected local version of "
            java.lang.String r3 = r1.concat(r3)
            android.util.Log.i(r0, r3)
            com.google.android.gms.dynamite.DynamiteModule r3 = new com.google.android.gms.dynamite.DynamiteModule
            r3.<init>(r2)
            return r3
    }

    private static void zzf(java.lang.ClassLoader r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            java.lang.Object r3 = r3.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            if (r3 != 0) goto L1a
            r1 = r0
            goto L2c
        L1a:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.zzq     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            if (r2 == 0) goto L27
            com.google.android.gms.dynamite.zzq r1 = (com.google.android.gms.dynamite.zzq) r1     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            goto L2c
        L27:
            com.google.android.gms.dynamite.zzq r1 = new com.google.android.gms.dynamite.zzq     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            r1.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
        L2c:
            com.google.android.gms.dynamite.DynamiteModule.zzm = r1     // Catch: java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35 java.lang.ClassNotFoundException -> L37
            return
        L2f:
            r3 = move-exception
            goto L38
        L31:
            r3 = move-exception
            goto L38
        L33:
            r3 = move-exception
            goto L38
        L35:
            r3 = move-exception
            goto L38
        L37:
            r3 = move-exception
        L38:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
    }

    private static com.google.android.gms.dynamite.zzp zzg(android.content.Context r6) {
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)
            com.google.android.gms.dynamite.zzp r2 = com.google.android.gms.dynamite.DynamiteModule.zzl     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            return r2
        Lb:
            r2 = 0
            java.lang.String r3 = "com.google.android.gms"
            r4 = 3
            android.content.Context r6 = r6.createPackageContext(r3, r4)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            java.lang.String r3 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r6 = r6.loadClass(r3)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            java.lang.Object r6 = r6.newInstance()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            android.os.IBinder r6 = (android.os.IBinder) r6     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            if (r6 != 0) goto L27
            r3 = r2
            goto L39
        L27:
            java.lang.String r3 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r3 = r6.queryLocalInterface(r3)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            boolean r4 = r3 instanceof com.google.android.gms.dynamite.zzp     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            if (r4 == 0) goto L34
            com.google.android.gms.dynamite.zzp r3 = (com.google.android.gms.dynamite.zzp) r3     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            goto L39
        L34:
            com.google.android.gms.dynamite.zzp r3 = new com.google.android.gms.dynamite.zzp     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            r3.<init>(r6)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
        L39:
            if (r3 == 0) goto L62
            com.google.android.gms.dynamite.DynamiteModule.zzl = r3     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L64
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            return r3
        L3f:
            r6 = move-exception
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L64
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L64
            int r4 = r4 + 45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L64
            r5.append(r0)     // Catch: java.lang.Throwable -> L64
            r5.append(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L64
            android.util.Log.e(r3, r6)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            return r2
        L64:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r6
    }

    public android.content.Context getModuleContext() {
            r1 = this;
            android.content.Context r0 = r1.zzk
            return r0
    }

    public android.os.IBinder instantiate(java.lang.String r4) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r3 = this;
            android.content.Context r0 = r3.zzk     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Class r0 = r0.loadClass(r4)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r0
        L11:
            r0 = move-exception
            goto L16
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String.valueOf(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Failed to instantiate module class: "
            java.lang.String r4 = r2.concat(r4)
            r2 = 0
            r1.<init>(r4, r0, r2)
            throw r1
    }
}
