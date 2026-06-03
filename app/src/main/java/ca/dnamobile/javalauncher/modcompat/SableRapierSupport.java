package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class SableRapierSupport {
    private static final java.lang.String CXX_SHARED = "libc++_shared.so";
    private static final java.lang.String JAVA_AGENT_PREFIX = "-javaagent:";
    private static final java.lang.String MIO_PATCHER_JAR = "MioLibPatcher.jar";
    private static final java.lang.String SABLE_NATIVE = "libsable_rapier.so";
    private static final java.lang.String SABLE_PROPERTY_PREFIX = "-Dsable_rapier_path=";
    private static final java.lang.String TAG = "SableRapier";

    private SableRapierSupport() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addJvmArgsIfNeeded(android.content.Context r4, ca.dnamobile.javalauncher.launcher.LaunchPlan r5, java.util.List<java.lang.String> r6) {
            java.io.File r5 = r5.getGameDirectory()
            boolean r5 = hasSableMod(r5)
            if (r5 != 0) goto Lb
            return
        Lb:
            java.io.File r5 = prepareMioLibPatcher(r4)
            if (r5 == 0) goto L7c
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L7c
            long r0 = r5.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L22
            goto L7c
        L22:
            java.io.File r4 = prepareSableRapierNative(r4)
            if (r4 == 0) goto L76
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L76
            long r0 = r4.length()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L37
            goto L76
        L37:
            java.io.File r0 = r4.getParentFile()
            preloadCxxIfPresent(r0)
            preloadSableNative(r4)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r0 = "sable_rapier_path"
            java.lang.System.setProperty(r0, r4)     // Catch: java.lang.Throwable -> L4e
        L4e:
            upsertOrderedSableJvmArgs(r6, r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Sable Rapier javaagent enabled: "
            r6.<init>(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            log(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Sable Rapier native override enabled: "
            r5.<init>(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            log(r4)
            return
        L76:
            java.lang.String r4 = "Sable detected, but libsable_rapier.so was not found. Rapier override cannot be applied."
            log(r4)
            return
        L7c:
            java.lang.String r4 = "Sable detected, but MioLibPatcher.jar was not found. Rapier override cannot be applied."
            log(r4)
            return
    }

    private static boolean containsSableJar(java.io.File r5) {
            java.io.File[] r5 = r5.listFiles()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r1 = r5.length
            r2 = r0
        La:
            if (r2 >= r1) goto L3e
            r3 = r5[r2]
            boolean r4 = r3.isFile()
            if (r4 != 0) goto L15
            goto L3b
        L15:
            java.lang.String r3 = r3.getName()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = ".disabled"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L28
            goto L3b
        L28:
            java.lang.String r4 = ".jar"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L31
            goto L3b
        L31:
            java.lang.String r4 = "sable"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L3b
            r5 = 1
            return r5
        L3b:
            int r2 = r2 + 1
            goto La
        L3e:
            return r0
    }

    private static boolean copyAsset(android.content.Context r5, java.lang.String r6, java.io.File r7) {
            r0 = 0
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L86
            java.io.InputStream r5 = r5.open(r6)     // Catch: java.lang.Throwable -> L86
            java.io.File r1 = r7.getParentFile()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L18
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L18
            r1.mkdirs()     // Catch: java.lang.Throwable -> L7a
        L18:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L7a
            r2 = 32768(0x8000, float:4.5918E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L70
        L22:
            int r3 = r5.read(r2)     // Catch: java.lang.Throwable -> L70
            r4 = -1
            if (r3 == r4) goto L2d
            r1.write(r2, r0, r3)     // Catch: java.lang.Throwable -> L70
            goto L22
        L2d:
            r1.close()     // Catch: java.lang.Throwable -> L7a
            makeLoadable(r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "Copied asset "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r6 = r1.append(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = " to "
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L7a
            log(r6)     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r7.isFile()     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L69
            long r6 = r7.length()     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L69
            r6 = 1
            goto L6a
        L69:
            r6 = r0
        L6a:
            if (r5 == 0) goto L6f
            r5.close()     // Catch: java.lang.Throwable -> L86
        L6f:
            return r6
        L70:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> L7a
        L79:
            throw r6     // Catch: java.lang.Throwable -> L7a
        L7a:
            r6 = move-exception
            if (r5 == 0) goto L85
            r5.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L86
        L85:
            throw r6     // Catch: java.lang.Throwable -> L86
        L86:
            return r0
    }

    private static boolean copyFirstExistingAsset(android.content.Context r6, java.io.File r7, java.lang.String... r8) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L3:
            r3 = 1
            if (r2 >= r0) goto L12
            r4 = r8[r2]
            boolean r4 = copyAsset(r6, r4, r7)
            if (r4 == 0) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            boolean r6 = r7.isFile()
            if (r6 == 0) goto L23
            long r6 = r7.length()
            r4 = 0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L23
            r1 = r3
        L23:
            return r1
    }

    private static java.io.File findInRuntimeModDirectory() {
            r0 = 0
            java.lang.Class<ca.dnamobile.javalauncher.utils.path.PathManager> r1 = ca.dnamobile.javalauncher.utils.path.PathManager.class
            java.lang.String r2 = "DIR_RUNTIME_MOD"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r1 instanceof java.io.File     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L1b
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "libsable_rapier.so"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            return r0
    }

    private static boolean hasSableMod(java.io.File r4) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "mods"
            r0.<init>(r4, r1)
            boolean r0 = containsSableJar(r0)
            r2 = 1
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            if (r0 == 0) goto L34
            java.lang.String r3 = r0.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L34
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r1)
            boolean r4 = sameFile(r3, r0)
            if (r4 != 0) goto L34
            boolean r4 = containsSableJar(r3)
            if (r4 == 0) goto L34
            return r2
        L34:
            r4 = 0
            return r4
    }

    private static void log(java.lang.String r2) {
            java.lang.String r0 = "SableRapier: "
            java.lang.String r1 = "SableRapier"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r2 = r1.append(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L17
            net.kdt.pojavlaunch.Logger.appendToLog(r2)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    private static void makeLoadable(java.io.File r2) {
            r0 = 0
            r1 = 1
            r2.setReadable(r1, r0)     // Catch: java.lang.Throwable -> L8
            r2.setExecutable(r1, r0)     // Catch: java.lang.Throwable -> L8
        L8:
            return
    }

    private static void preloadCxxIfPresent(java.io.File r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libc++_shared.so"
            r0.<init>(r2, r1)
            boolean r2 = r0.isFile()
            if (r2 != 0) goto L11
            return
        L11:
            java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L21
            boolean r2 = net.kdt.pojavlaunch.utils.JREUtils.dlopen(r2)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L38
            java.lang.String r2 = "Preloaded libc++_shared.so for Sable Rapier."
            log(r2)     // Catch: java.lang.Throwable -> L21
            goto L38
        L21:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to preload libc++_shared.so: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            log(r2)
        L38:
            return
    }

    private static void preloadSableNative(java.io.File r2) {
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L10
            boolean r2 = net.kdt.pojavlaunch.utils.JREUtils.dlopen(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L27
            java.lang.String r2 = "Preloaded libsable_rapier.so."
            log(r2)     // Catch: java.lang.Throwable -> L10
            goto L27
        L10:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to preload libsable_rapier.so: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            log(r2)
        L27:
            return
    }

    private static java.io.File prepareMioLibPatcher(android.content.Context r8) {
            java.io.File r0 = resolveComponentsDirectory(r8)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "MioLibPatcher.jar"
            r1.<init>(r0, r2)
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            r4 = 0
            r3[r4] = r2
            java.lang.String r5 = "components/MioLibPatcher.jar"
            r6 = 1
            r3[r6] = r5
            boolean r3 = copyFirstExistingAsset(r8, r1, r3)
            if (r3 == 0) goto L1d
            return r1
        L1d:
            r3 = 8
            java.io.File[] r5 = new java.io.File[r3]
            r5[r4] = r1
            java.io.File r1 = new java.io.File
            java.io.File r7 = r8.getFilesDir()
            r1.<init>(r7, r2)
            r5[r6] = r1
            java.io.File r1 = new java.io.File
            java.io.File r6 = new java.io.File
            java.io.File r8 = r8.getFilesDir()
            java.lang.String r7 = "components"
            r6.<init>(r8, r7)
            r1.<init>(r6, r2)
            r5[r0] = r1
            java.io.File r8 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r8.<init>(r0, r2)
            r0 = 3
            r5[r0] = r8
            java.io.File r8 = new java.io.File
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r0.<init>(r1, r7)
            r8.<init>(r0, r2)
            r0 = 4
            r5[r0] = r8
            java.io.File r8 = new java.io.File
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "mio"
            r0.<init>(r1, r6)
            r8.<init>(r0, r2)
            r0 = 5
            r5[r0] = r8
            java.io.File r8 = new java.io.File
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "patcher"
            r0.<init>(r1, r6)
            r8.<init>(r0, r2)
            r0 = 6
            r5[r0] = r8
            java.io.File r8 = new java.io.File
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "runtime_mod"
            r0.<init>(r1, r6)
            r8.<init>(r0, r2)
            r0 = 7
            r5[r0] = r8
        L8c:
            if (r4 >= r3) goto La4
            r8 = r5[r4]
            boolean r0 = r8.isFile()
            if (r0 == 0) goto La1
            long r0 = r8.length()
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto La1
            return r8
        La1:
            int r4 = r4 + 1
            goto L8c
        La4:
            r8 = 0
            return r8
    }

    private static java.io.File prepareSableRapierNative(android.content.Context r12) {
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo()
            r1 = 0
            if (r0 == 0) goto Le
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo()
            java.lang.String r0 = r0.nativeLibraryDir
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 0
            java.lang.String r4 = "libsable_rapier.so"
            if (r0 == 0) goto L33
            java.lang.String r5 = r0.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L33
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r4)
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L33
            long r6 = r5.length()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L33
            return r5
        L33:
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r0 == 0) goto L55
            java.lang.String r5 = r0.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L55
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r4)
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L55
            long r6 = r5.length()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L55
            return r5
        L55:
            java.io.File r0 = findInRuntimeModDirectory()
            if (r0 == 0) goto L6a
            boolean r5 = r0.isFile()
            if (r5 == 0) goto L6a
            long r5 = r0.length()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L6a
            return r0
        L6a:
            java.lang.String r0 = "sable_rapier"
            r5 = 0
            java.io.File r0 = r12.getDir(r0, r5)
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r4)
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]
            r7[r5] = r4
            java.lang.String r8 = "native/libsable_rapier.so"
            r9 = 1
            r7[r9] = r8
            boolean r12 = copyFirstExistingAsset(r12, r6, r7)
            if (r12 == 0) goto L8f
            makeLoadable(r6)
            java.lang.String r12 = "Using fallback app-private Sable native path. If Android blocks this, package libsable_rapier.so under app/src/main/jniLibs/arm64-v8a/."
            log(r12)
            return r6
        L8f:
            boolean r12 = r6.isFile()
            if (r12 == 0) goto La6
            long r7 = r6.length()
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 <= 0) goto La6
            makeLoadable(r6)
            java.lang.String r12 = "Using existing fallback app-private Sable native path. If Android blocks this, package libsable_rapier.so under app/src/main/jniLibs/arm64-v8a/."
            log(r12)
            return r6
        La6:
            r12 = 3
            java.io.File[] r6 = new java.io.File[r12]
            java.io.File r7 = new java.io.File
            java.io.File r8 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r7.<init>(r8, r4)
            r6[r5] = r7
            java.io.File r7 = new java.io.File
            java.io.File r8 = new java.io.File
            java.io.File r10 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r11 = "runtime_mod"
            r8.<init>(r10, r11)
            r7.<init>(r8, r4)
            r6[r9] = r7
            java.io.File r7 = new java.io.File
            java.io.File r8 = new java.io.File
            java.io.File r9 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r10 = "sable"
            r8.<init>(r9, r10)
            r7.<init>(r8, r4)
            r6[r0] = r7
        Ld2:
            if (r5 >= r12) goto Le8
            r0 = r6[r5]
            boolean r4 = r0.isFile()
            if (r4 == 0) goto Le5
            long r7 = r0.length()
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le5
            return r0
        Le5:
            int r5 = r5 + 1
            goto Ld2
        Le8:
            return r1
    }

    private static void removeArgsStartingWith(java.util.List<java.lang.String> r2, java.lang.String r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1c
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L19
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L19
            r2.remove(r0)
        L19:
            int r0 = r0 + (-1)
            goto L6
        L1c:
            return
    }

    private static java.io.File resolveComponentsDirectory(android.content.Context r2) {
            java.io.File r0 = r2.getFilesDir()
            if (r0 == 0) goto Lb
            java.io.File r0 = r0.getParentFile()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = "components"
            if (r0 == 0) goto L16
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            goto L20
        L16:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            r0.<init>(r2, r1)
            r2 = r0
        L20:
            boolean r0 = r2.exists()
            if (r0 != 0) goto L29
            r2.mkdirs()
        L29:
            return r2
    }

    private static boolean sameFile(java.io.File r2, java.io.File r3) {
            java.io.File r0 = r2.getCanonicalFile()     // Catch: java.lang.Throwable -> Ld
            java.io.File r1 = r3.getCanonicalFile()     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r3 = r3.getAbsolutePath()
            boolean r2 = r2.equals(r3)
            return r2
    }

    private static void upsertOrderedSableJvmArgs(java.util.List<java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "-Dsable_rapier_path="
            removeArgsStartingWith(r6, r0)
            java.lang.String r1 = "-javaagent:"
            removeArgsStartingWith(r6, r1)
            boolean r2 = r6.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1f
            java.lang.String r2 = "java"
            java.lang.Object r5 = r6.get(r4)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L1f
            r4 = r3
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.String r7 = r7.toString()
            r6.add(r4, r7)
            int r4 = r4 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.add(r4, r7)
            return
    }
}
