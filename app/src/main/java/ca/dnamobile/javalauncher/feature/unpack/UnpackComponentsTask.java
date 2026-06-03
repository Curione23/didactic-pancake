package ca.dnamobile.javalauncher.feature.unpack;

/* JADX INFO: loaded from: classes.dex */
public class UnpackComponentsTask extends ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask {
    private android.content.res.AssetManager assetManager;
    private boolean checkFailed;
    private final ca.dnamobile.javalauncher.feature.unpack.Components component;
    private final android.content.Context context;
    private java.lang.String rootDir;
    private java.io.File versionFile;

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components = null;

        static {
                ca.dnamobile.javalauncher.feature.unpack.Components[] r0 = ca.dnamobile.javalauncher.feature.unpack.Components.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components = r0
                ca.dnamobile.javalauncher.feature.unpack.Components r1 = ca.dnamobile.javalauncher.feature.unpack.Components.COMPONENTS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components     // Catch: java.lang.NoSuchFieldError -> L1d
                ca.dnamobile.javalauncher.feature.unpack.Components r1 = ca.dnamobile.javalauncher.feature.unpack.Components.WEBRTC_BRIDGE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components     // Catch: java.lang.NoSuchFieldError -> L28
                ca.dnamobile.javalauncher.feature.unpack.Components r1 = ca.dnamobile.javalauncher.feature.unpack.Components.LWJGL3     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components     // Catch: java.lang.NoSuchFieldError -> L33
                ca.dnamobile.javalauncher.feature.unpack.Components r1 = ca.dnamobile.javalauncher.feature.unpack.Components.LWJGL341     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components     // Catch: java.lang.NoSuchFieldError -> L3e
                ca.dnamobile.javalauncher.feature.unpack.Components r1 = ca.dnamobile.javalauncher.feature.unpack.Components.OTHER_LOGIN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components     // Catch: java.lang.NoSuchFieldError -> L49
                ca.dnamobile.javalauncher.feature.unpack.Components r1 = ca.dnamobile.javalauncher.feature.unpack.Components.CACIOCAVALLO     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components     // Catch: java.lang.NoSuchFieldError -> L54
                ca.dnamobile.javalauncher.feature.unpack.Components r1 = ca.dnamobile.javalauncher.feature.unpack.Components.CACIOCAVALLO17     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public UnpackComponentsTask(android.content.Context r6, ca.dnamobile.javalauncher.feature.unpack.Components r7) {
            r5 = this;
            java.lang.String r0 = "/version"
            java.lang.String r1 = "components/"
            r5.<init>()
            android.content.Context r6 = r6.getApplicationContext()
            r5.context = r6
            r5.component = r7
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L56
            r5.assetManager = r6     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = resolveRootDir(r7)     // Catch: java.lang.Throwable -> L56
            r5.rootDir = r6     // Catch: java.lang.Throwable -> L56
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = r5.rootDir     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r3.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = r7.component     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L56
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L56
            r5.versionFile = r6     // Catch: java.lang.Throwable -> L56
            android.content.res.AssetManager r6 = r5.assetManager     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r7.component     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L56
            java.io.InputStream r6 = r6.open(r0)     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L70
            r6.close()     // Catch: java.lang.Throwable -> L56
            goto L70
        L56:
            r6 = move-exception
            r0 = 1
            r5.checkFailed = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Component check failed for "
            r0.<init>(r1)
            java.lang.String r7 = r7.component
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "UnpackComponentsTask"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r7, r6)
        L70:
            return
    }

    private void copyAssetDirectoryRecursively(java.lang.String r8, java.lang.String r9) throws java.io.IOException {
            r7 = this;
            android.content.res.AssetManager r0 = r7.assetManager
            java.lang.String[] r0 = r0.list(r8)
            if (r0 != 0) goto L9
            return
        L9:
            int r1 = r0.length
            if (r1 != 0) goto L27
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            java.io.File r9 = r0.getParentFile()
            if (r9 != 0) goto L18
            return
        L18:
            android.content.Context r1 = r7.context
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r0 = r0.getName()
            r2 = 1
            net.kdt.pojavlaunch.Tools.copyAssetFile(r1, r8, r9, r0, r2)
            return
        L27:
            java.io.File r1 = new java.io.File
            r1.<init>(r9)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L52
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L39
            goto L52
        L39:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to create directory: "
            r9.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L52:
            int r1 = r0.length
            r2 = 0
        L54:
            if (r2 >= r1) goto L8c
            r3 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r5 = "/"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r6 = java.io.File.separator
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r7.copyAssetDirectoryRecursively(r4, r3)
            int r2 = r2 + 1
            goto L54
        L8c:
            return
    }

    private void requestEmptyParentDir(java.io.File r2) {
            r1 = this;
            java.io.File r2 = r2.getParentFile()
            if (r2 != 0) goto L7
            return
        L7:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L16
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L16
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r2)
        L16:
            r2.mkdirs()
            return
    }

    private static java.lang.String resolveRootDir(ca.dnamobile.javalauncher.feature.unpack.Components r2) {
            int[] r0 = ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$feature$unpack$Components
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1d;
                case 2: goto L1d;
                case 3: goto L16;
                case 4: goto L16;
                case 5: goto L16;
                case 6: goto L16;
                case 7: goto L16;
                default: goto Lb;
            }
        Lb:
            boolean r2 = r2.privateDirectory
            if (r2 == 0) goto L20
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r2 = r2.getAbsolutePath()
            goto L22
        L16:
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r2 = r2.getAbsolutePath()
            return r2
        L1d:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            return r2
        L20:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
        L22:
            return r2
    }

    public boolean isCheckFailed() {
            r1 = this;
            boolean r0 = r1.checkFailed
            return r0
    }

    @Override // ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask
    public boolean isNeedUnpack() {
            r7 = this;
            java.lang.String r0 = "components/"
            boolean r1 = r7.checkFailed
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            java.io.File r1 = r7.versionFile
            boolean r1 = r1.exists()
            r3 = 1
            java.lang.String r4 = "UnpackComponents"
            if (r1 != 0) goto L33
            java.io.File r0 = r7.versionFile
            r7.requestEmptyParentDir(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.feature.unpack.Components r1 = r7.component
            java.lang.String r1 = r1.component
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": pack missing, installing..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r0)
            return r3
        L33:
            android.content.res.AssetManager r1 = r7.assetManager     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lc6
            ca.dnamobile.javalauncher.feature.unpack.Components r0 = r7.component     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.component     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r0 = r5.append(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = "/version"
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc6
            java.io.InputStream r0 = r1.open(r0)     // Catch: java.lang.Throwable -> Lc6
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lba
            java.io.File r5 = r7.versionFile     // Catch: java.lang.Throwable -> Lba
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r5 = net.kdt.pojavlaunch.Tools.read(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = net.kdt.pojavlaunch.Tools.read(r1)     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> Lb0
            if (r5 != 0) goto L8d
            java.io.File r2 = r7.versionFile     // Catch: java.lang.Throwable -> Lb0
            r7.requestEmptyParentDir(r2)     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r2.<init>()     // Catch: java.lang.Throwable -> Lb0
            ca.dnamobile.javalauncher.feature.unpack.Components r5 = r7.component     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = r5.component     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = ": version changed, reinstalling..."
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb0
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r2)     // Catch: java.lang.Throwable -> Lb0
            r1.close()     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L8c
            r0.close()     // Catch: java.lang.Throwable -> Lc6
        L8c:
            return r3
        L8d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0
            r5.<init>()     // Catch: java.lang.Throwable -> Lb0
            ca.dnamobile.javalauncher.feature.unpack.Components r6 = r7.component     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = r6.component     // Catch: java.lang.Throwable -> Lb0
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = ": pack is up to date."
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb0
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r5)     // Catch: java.lang.Throwable -> Lb0
            r1.close()     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto Laf
            r0.close()     // Catch: java.lang.Throwable -> Lc6
        Laf:
            return r2
        Lb0:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lb5
            goto Lb9
        Lb5:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> Lba
        Lb9:
            throw r2     // Catch: java.lang.Throwable -> Lba
        Lba:
            r1 = move-exception
            if (r0 == 0) goto Lc5
            r0.close()     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lc6
        Lc5:
            throw r1     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to compare component version for "
            r1.<init>(r2)
            ca.dnamobile.javalauncher.feature.unpack.Components r2 = r7.component
            java.lang.String r2 = r2.component
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r1, r0)
            java.io.File r0 = r7.versionFile
            r7.requestEmptyParentDir(r0)
            return r3
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.lang.String r0 = "Failed to unpack "
            java.lang.String r1 = "components/"
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r2 = r5.listener
            if (r2 == 0) goto Ld
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r2 = r5.listener
            r2.onTaskStart()
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            ca.dnamobile.javalauncher.feature.unpack.Components r1 = r5.component     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r1.component     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r5.rootDir     // Catch: java.lang.Throwable -> L3a
            ca.dnamobile.javalauncher.feature.unpack.Components r4 = r5.component     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = r4.component     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L3a
            r5.copyAssetDirectoryRecursively(r1, r2)     // Catch: java.lang.Throwable -> L3a
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r0 = r5.listener
            if (r0 == 0) goto L39
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r0 = r5.listener
            r0.onTaskEnd()
        L39:
            return
        L3a:
            r1 = move-exception
            java.lang.String r2 = "UnpackComponents"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.feature.unpack.Components r4 = r5.component     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.component     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L68
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L68
            ca.dnamobile.javalauncher.feature.unpack.Components r0 = r5.component     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.displayName     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L68
            throw r2     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r1 = r5.listener
            if (r1 == 0) goto L72
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r1 = r5.listener
            r1.onTaskEnd()
        L72:
            throw r0
    }
}
