package ca.dnamobile.javalauncher.feature.unpack;

/* JADX INFO: loaded from: classes.dex */
public class UnpackJreTask extends ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask {
    private static final java.lang.String TAG = "UnpackJreTask";
    private android.content.res.AssetManager assetManager;
    private boolean checkFailed;
    private final android.content.Context context;
    private final ca.dnamobile.javalauncher.feature.unpack.Jre jre;
    private java.lang.String launcherRuntimeVersion;

    public UnpackJreTask(android.content.Context r4, ca.dnamobile.javalauncher.feature.unpack.Jre r5) {
            r3 = this;
            java.lang.String r0 = "UnpackJreTask"
            r3.<init>()
            android.content.Context r4 = r4.getApplicationContext()
            r3.context = r4
            r3.jre = r5
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L57
            r3.assetManager = r4     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r5.jrePath     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "/version"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L57
            java.io.InputStream r4 = r4.open(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = net.kdt.pojavlaunch.Tools.read(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L4b
            r3.launcherRuntimeVersion = r1     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L3b
            r4.close()     // Catch: java.lang.Throwable -> L57
        L3b:
            java.lang.String r4 = "Internal-8"
            java.lang.String r1 = r5.jreName     // Catch: java.lang.Throwable -> L57
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L6f
            java.lang.String r4 = "Runtime patch active: JRE8_ANDROID_14_16_V31"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)     // Catch: java.lang.Throwable -> L57
            goto L6f
        L4b:
            r1 = move-exception
            if (r4 == 0) goto L56
            r4.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L57
        L56:
            throw r1     // Catch: java.lang.Throwable -> L57
        L57:
            r4 = move-exception
            r1 = 1
            r3.checkFailed = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read bundled runtime version for "
            r1.<init>(r2)
            java.lang.String r5 = r5.jreName
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r5, r4)
        L6f:
            return
    }

    private java.io.InputStream openBinPack() throws java.io.IOException {
            r6 = this;
            int r0 = net.kdt.pojavlaunch.Tools.DEVICE_ARCHITECTURE
            java.lang.String r0 = net.kdt.pojavlaunch.Architecture.archAsString(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r1.add(r0)
            java.lang.String r2 = "arm64-v8a"
            boolean r3 = r2.equals(r0)
            java.lang.String r4 = "aarch64"
            java.lang.String r5 = "arm64"
            if (r3 == 0) goto L21
            r1.add(r5)
            r1.add(r4)
            goto L3a
        L21:
            boolean r3 = r5.equals(r0)
            if (r3 == 0) goto L2e
            r1.add(r2)
            r1.add(r4)
            goto L3a
        L2e:
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L3a
            r1.add(r5)
            r1.add(r2)
        L3a:
            java.lang.String r2 = "armeabi-v7a"
            boolean r3 = r2.equals(r0)
            java.lang.String r4 = "arm"
            if (r3 == 0) goto L48
            r1.add(r4)
            goto L51
        L48:
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L51
            r1.add(r2)
        L51:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L56:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            ca.dnamobile.javalauncher.feature.unpack.Jre r4 = r6.jre
            java.lang.String r4 = r4.jrePath
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "/bin-"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = ".tar.xz"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "UnpackJreTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r4.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r5 = "Trying runtime bin pack: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.io.IOException -> La2
            java.lang.StringBuilder r4 = r4.append(r2)     // Catch: java.io.IOException -> La2
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> La2
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r4)     // Catch: java.io.IOException -> La2
            android.content.res.AssetManager r3 = r6.assetManager     // Catch: java.io.IOException -> La2
            java.io.InputStream r0 = r3.open(r2)     // Catch: java.io.IOException -> La2
            return r0
        La2:
            r2 = move-exception
            goto L56
        La4:
            if (r2 == 0) goto La7
            goto Lbb
        La7:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to open runtime bin pack for "
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
        Lbb:
            throw r2
    }

    private java.io.File runtimeHomeFile() {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MULTIRT_HOME
            ca.dnamobile.javalauncher.feature.unpack.Jre r2 = r3.jre
            java.lang.String r2 = r2.jreName
            r0.<init>(r1, r2)
            return r0
    }

    public boolean isCheckFailed() {
            r1 = this;
            boolean r0 = r1.checkFailed
            return r0
    }

    @Override // ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask
    public boolean isNeedUnpack() {
            r8 = this;
            java.lang.String r0 = "UnpackJreTask"
            boolean r1 = r8.checkFailed
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            ca.dnamobile.javalauncher.feature.unpack.Jre r1 = r8.jre     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = r1.jreName     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = net.kdt.pojavlaunch.multirt.MultiRTUtils.readInternalRuntimeVersion(r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r8.launcherRuntimeVersion     // Catch: java.lang.Throwable -> Lac
            r4 = 1
            if (r3 == 0) goto L25
            if (r1 == 0) goto L1c
            java.lang.String r5 = r1.trim()     // Catch: java.lang.Throwable -> Lac
            goto L1d
        L1c:
            r5 = 0
        L1d:
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto L25
            r3 = r4
            goto L26
        L25:
            r3 = r2
        L26:
            java.io.File r5 = r8.runtimeHomeFile()     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.unpack.Jre r6 = r8.jre     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = r6.jreName     // Catch: java.lang.Throwable -> Lac
            int r6 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.javaMajorForRuntimeName(r6)     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.unpack.Jre r7 = r8.jre     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = r7.jreName     // Catch: java.lang.Throwable -> Lac
            boolean r6 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.isRuntimeInstalledForJava(r7, r5, r6)     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto L65
            if (r6 == 0) goto L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r1.<init>()     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.unpack.Jre r3 = r8.jre     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r3.jreName     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = " is up to date. "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.unpack.Jre r3 = r8.jre     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r3.jreName     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.describeRuntimeState(r3, r5)     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> Lac
            return r2
        L65:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r3.<init>()     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.unpack.Jre r7 = r8.jre     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = r7.jreName     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = " needs unpack. installedVersion="
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = " bundledVersion="
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r8.launcherRuntimeVersion     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = " usable="
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = " state="
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.unpack.Jre r3 = r8.jre     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r3.jreName     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.describeRuntimeState(r3, r5)     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lac
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> Lac
            return r4
        Lac:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Check failed for internal runtime "
            r3.<init>(r4)
            ca.dnamobile.javalauncher.feature.unpack.Jre r4 = r8.jre
            java.lang.String r4 = r4.jreName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r3, r1)
            return r2
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            java.lang.String r0 = "UnpackJreTask"
            java.lang.String r1 = "After unpack "
            java.lang.String r2 = "postPrepare failed for "
            java.lang.String r3 = "Internal JRE unpack failed for "
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r4 = r8.listener
            if (r4 == 0) goto L11
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r4 = r8.listener
            r4.onTaskStart()
        L11:
            java.io.File r4 = r8.runtimeHomeFile()     // Catch: java.lang.Throwable -> L10f
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L10f
            java.io.File r6 = r4.getParentFile()     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r7.<init>()     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r4 = r7.append(r4)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r7 = " installing"
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L10f
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r5)     // Catch: java.lang.Throwable -> L10f
            android.content.res.AssetManager r4 = r8.assetManager     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r5.<init>()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r6 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r6 = r6.jrePath     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r6 = "/universal.tar.xz"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L10f
            java.io.InputStream r4 = r4.open(r5)     // Catch: java.lang.Throwable -> L10f
            java.io.InputStream r5 = r8.openBinPack()     // Catch: java.lang.Throwable -> L103
            ca.dnamobile.javalauncher.feature.unpack.Jre r6 = r8.jre     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r6 = r6.jreName     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r7 = r8.launcherRuntimeVersion     // Catch: java.lang.Throwable -> Lf7
            net.kdt.pojavlaunch.multirt.MultiRTUtils.installRuntimeNamedBinpack(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lf7
            if (r5 == 0) goto L67
            r5.close()     // Catch: java.lang.Throwable -> L103
        L67:
            if (r4 == 0) goto L6c
            r4.close()     // Catch: java.lang.Throwable -> L10f
        L6c:
            ca.dnamobile.javalauncher.feature.unpack.Jre r4 = r8.jre     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r4.jreName     // Catch: java.lang.Throwable -> L74
            net.kdt.pojavlaunch.multirt.MultiRTUtils.postPrepare(r4)     // Catch: java.lang.Throwable -> L74
            goto L8f
        L74:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r2 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r2 = r2.jreName     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r5 = "; launcher will validate installed runtime"
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r4)     // Catch: java.lang.Throwable -> L10f
        L8f:
            java.io.File r2 = r8.runtimeHomeFile()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r4 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r4.jreName     // Catch: java.lang.Throwable -> L10f
            int r4 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.javaMajorForRuntimeName(r4)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r1 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r1.jreName     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r5.append(r1)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r5 = ": "
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r5 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r5 = r5.jreName     // Catch: java.lang.Throwable -> L10f
            java.lang.String r5 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.describeRuntimeState(r5, r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r1 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r1.jreName     // Catch: java.lang.Throwable -> L10f
            boolean r1 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.isRuntimeInstalledForJava(r1, r2, r4)     // Catch: java.lang.Throwable -> L10f
            if (r1 != 0) goto Lf2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r1.<init>()     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r4 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r4.jreName     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = " unpack finished but runtime is still not usable. "
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L10f
            ca.dnamobile.javalauncher.feature.unpack.Jre r4 = r8.jre     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r4.jreName     // Catch: java.lang.Throwable -> L10f
            java.lang.String r2 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.describeRuntimeState(r4, r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10f
            r2 = 0
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L10f
        Lf2:
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r0 = r8.listener
            if (r0 == 0) goto L12d
            goto L128
        Lf7:
            r1 = move-exception
            if (r5 == 0) goto L102
            r5.close()     // Catch: java.lang.Throwable -> Lfe
            goto L102
        Lfe:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L103
        L102:
            throw r1     // Catch: java.lang.Throwable -> L103
        L103:
            r1 = move-exception
            if (r4 == 0) goto L10e
            r4.close()     // Catch: java.lang.Throwable -> L10a
            goto L10e
        L10a:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L10f
        L10e:
            throw r1     // Catch: java.lang.Throwable -> L10f
        L10f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12e
            ca.dnamobile.javalauncher.feature.unpack.Jre r3 = r8.jre     // Catch: java.lang.Throwable -> L12e
            java.lang.String r3 = r3.jreName     // Catch: java.lang.Throwable -> L12e
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L12e
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2, r1)     // Catch: java.lang.Throwable -> L12e
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r0 = r8.listener
            if (r0 == 0) goto L12d
        L128:
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r0 = r8.listener
            r0.onTaskEnd()
        L12d:
            return
        L12e:
            r0 = move-exception
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r1 = r8.listener
            if (r1 == 0) goto L138
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask$Listener r1 = r8.listener
            r1.onTaskEnd()
        L138:
            throw r0
    }
}
