package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class JavaGameLauncher {
    private static final boolean ENABLE_NATIVE_EXIT_HOOK = true;
    private static final long INSTALLER_HEARTBEAT_SECONDS = 5;
    private static final long INSTALLER_MAIN_TIMEOUT_MINUTES = 15;
    private static final java.lang.String TAG = "JavaGameLauncher";

    public interface RawJavaProgressListener {
        void onProgress(int r1, java.lang.String r2);
    }

    public interface StatusListener {
        void onStatus(java.lang.String r1);
    }

    private JavaGameLauncher() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addArchCandidate(java.util.ArrayList<java.lang.String> r4, java.lang.String r5) {
            if (r5 == 0) goto L2f
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
            java.lang.String r0 = "/"
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r1 = 0
        L15:
            if (r1 >= r0) goto L2f
            r2 = r5[r1]
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L2c
            boolean r3 = r4.contains(r2)
            if (r3 != 0) goto L2c
            r4.add(r2)
        L2c:
            int r1 = r1 + 1
            goto L15
        L2f:
            return
    }

    private static void addInstallerJvmArgIfMissing(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            r0 = 61
            int r0 = r4.indexOf(r0)
            if (r0 <= 0) goto L28
            int r0 = r0 + 1
            r1 = 0
            java.lang.String r0 = r4.substring(r1, r0)
            java.util.Iterator r1 = r3.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L13
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L13
            return
        L28:
            boolean r0 = r3.contains(r4)
            if (r0 == 0) goto L2f
            return
        L2f:
            r3.add(r4)
            return
    }

    private static void appendIdentity(java.lang.StringBuilder r1, java.lang.String r2) {
            if (r2 == 0) goto L1b
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L1b
        Ld:
            int r0 = r1.length()
            if (r0 <= 0) goto L18
            r0 = 32
            r1.append(r0)
        L18:
            r1.append(r2)
        L1b:
            return
    }

    private static void appendPath(java.lang.StringBuilder r1, java.io.File r2) {
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r0 = r1.toString()
            boolean r0 = containsPath(r0, r2)
            if (r0 == 0) goto L16
            return
        L16:
            int r0 = r1.length()
            if (r0 <= 0) goto L21
            r0 = 58
            r1.append(r0)
        L21:
            r1.append(r2)
            return
    }

    private static void applyRendererSpecificGameOptions(ca.dnamobile.javalauncher.launcher.LaunchPlan r5, ca.dnamobile.javalauncher.renderer.RendererInterface r6) {
            boolean r0 = isLtwRenderer(r6)
            java.lang.String r1 = "JavaGameLauncher"
            java.lang.String r2 = "mipmapLevels"
            java.lang.String r3 = "options.txt"
            if (r0 == 0) goto L7a
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getGameDirectory()
            r6.<init>(r5, r3)
            java.util.LinkedHashMap r5 = readOptionsFile(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "renderDistance"
            r3 = 4
            boolean r0 = capIntegerOption(r5, r0, r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "simulationDistance"
            r4 = 5
            boolean r3 = capIntegerOption(r5, r3, r4)     // Catch: java.lang.Throwable -> L61
            r0 = r0 | r3
            r3 = 0
            boolean r2 = capIntegerOption(r5, r2, r3)     // Catch: java.lang.Throwable -> L61
            r0 = r0 | r2
            java.lang.String r2 = "graphicsMode"
            java.lang.String r4 = "fast"
            boolean r2 = setOption(r5, r2, r4)     // Catch: java.lang.Throwable -> L61
            r0 = r0 | r2
            java.lang.String r2 = "clouds"
            java.lang.String r4 = "false"
            boolean r2 = setOption(r5, r2, r4)     // Catch: java.lang.Throwable -> L61
            r0 = r0 | r2
            java.lang.String r2 = "entityDistanceScaling"
            r4 = 1061158912(0x3f400000, float:0.75)
            boolean r2 = capFloatOption(r5, r2, r4)     // Catch: java.lang.Throwable -> L61
            r0 = r0 | r2
            java.lang.String r2 = "biomeBlendRadius"
            boolean r2 = capIntegerOption(r5, r2, r3)     // Catch: java.lang.Throwable -> L61
            r0 = r0 | r2
            if (r0 == 0) goto L5b
            writeOptionsFile(r6, r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = "LTW safe options applied: renderDistance<=4, simulationDistance<=5, mipmapLevels=0, graphicsMode=fast"
            safeAppendLog(r5)     // Catch: java.lang.Throwable -> L61
            goto L79
        L5b:
            java.lang.String r5 = "LTW safe options already present."
            safeAppendLog(r5)     // Catch: java.lang.Throwable -> L61
            goto L79
        L61:
            r5 = move-exception
            java.lang.String r6 = "Failed to apply LTW safe options"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r6, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to apply LTW safe options: "
            r6.<init>(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
        L79:
            return
        L7a:
            boolean r6 = isFreedrenoKgslRenderer(r6)
            if (r6 == 0) goto Lbc
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.getGameDirectory()
            r6.<init>(r5, r3)
            java.util.LinkedHashMap r5 = readOptionsFile(r6)     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "0"
            boolean r0 = setOption(r5, r2, r0)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L9e
            writeOptionsFile(r6, r5)     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = "Freedreno KGSL v70 visual profile applied: mipmapLevels=0"
            safeAppendLog(r5)     // Catch: java.lang.Throwable -> La4
            goto Lbc
        L9e:
            java.lang.String r5 = "Freedreno KGSL v70 visual profile already present: mipmapLevels=0"
            safeAppendLog(r5)     // Catch: java.lang.Throwable -> La4
            goto Lbc
        La4:
            r5 = move-exception
            java.lang.String r6 = "Failed to apply Freedreno KGSL visual profile"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r6, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to apply Freedreno KGSL visual profile: "
            r6.<init>(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
        Lbc:
            return
    }

    private static java.lang.String buildInstallerLdLibraryPath(java.io.File r3) {
            java.io.File r3 = resolveRuntimeLibDir(r3)
            java.io.File r0 = resolveJvmLibraryDir(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            appendPath(r1, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "jli"
            r0.<init>(r3, r2)
            appendPath(r1, r0)
            appendPath(r1, r3)
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r3 == 0) goto L2f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2f
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            appendPath(r1, r0)
        L2f:
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static java.lang.String buildInstallerNativeLinkerPath(java.io.File r3) {
            java.io.File r0 = resolveRuntimeLibDir(r3)
            java.io.File r0 = resolveJvmLibraryDir(r0)
            java.lang.String r3 = buildInstallerLdLibraryPath(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L22
            java.lang.String r3 = ""
            goto L31
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":"
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L31:
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static boolean capFloatOption(java.util.LinkedHashMap<java.lang.String, java.lang.String> r2, java.lang.String r3, float r4) {
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L13
            float r1 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Throwable -> L13
        L13:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L19
            r2 = 0
            return r2
        L19:
            java.lang.String r4 = trimFloat(r4)
            r2.put(r3, r4)
            r2 = 1
            return r2
    }

    private static boolean capIntegerOption(java.util.LinkedHashMap<java.lang.String, java.lang.String> r2, java.lang.String r3, int r4) {
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L13
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L13
        L13:
            if (r1 > r4) goto L17
            r2 = 0
            return r2
        L17:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.put(r3, r4)
            r2 = 1
            return r2
    }

    private static boolean classpathAlreadyPresent(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            r0 = 1
            r1 = r0
        L2:
            int r2 = r3.size()
            if (r1 >= r2) goto L24
            int r2 = r1 + (-1)
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = isClasspathFlag(r2)
            if (r2 == 0) goto L21
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L21
            return r0
        L21:
            int r1 = r1 + 1
            goto L2
        L24:
            r3 = 0
            return r3
    }

    private static boolean containsPath(java.lang.String r4, java.lang.String r5) {
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r2 = r1
        L10:
            if (r2 >= r0) goto L1f
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            int r2 = r2 + 1
            goto L10
        L1f:
            return r1
    }

    private static boolean dlopenOptional(java.io.File r1) {
            boolean r0 = r1.isFile()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r1 = dlopenOptional(r1)
            return r1
    }

    private static boolean dlopenOptional(java.lang.String r6) {
            java.lang.String r0 = " = "
            java.lang.String r1 = "JavaGameLauncher"
            java.lang.String r2 = "installer dlopen "
            r3 = 0
            if (r6 == 0) goto L76
            java.lang.String r4 = r6.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L14
            goto L76
        L14:
            boolean r4 = net.kdt.pojavlaunch.utils.JREUtils.dlopen(r6)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L49
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r2 = r5.append(r6)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L49
            safeAppendLog(r0)     // Catch: java.lang.Throwable -> L49
            return r4
        L49:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "installer dlopen failed for "
            r2.<init>(r4)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            safeAppendLog(r6)
        L76:
            return r3
    }

    private static void ensureActivePathManager(android.content.Context r1) {
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            if (r0 == 0) goto L10
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
        L10:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
        L13:
            return
    }

    private static java.lang.String friendlyInstallerName(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L11
            java.lang.String r1 = "NeoForge"
            return r1
        L11:
            java.lang.String r0 = "forge"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1c
            java.lang.String r1 = "Forge"
            return r1
        L1c:
            java.lang.String r1 = "loader"
            return r1
    }

    private static java.io.File getLauncherLatestLogFile() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_LAUNCHER_LOG
            java.lang.String r2 = "latestlog.txt"
            r0.<init>(r1, r2)
            return r0
    }

    private static java.io.File getMinecraftLatestDotLogFile() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r3 = "logs"
            r1.<init>(r2, r3)
            java.lang.String r2 = "latest.log"
            r0.<init>(r1, r2)
            return r0
    }

    private static java.io.File getMinecraftLatestLogTxtFile() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r3 = "logs"
            r1.<init>(r2, r3)
            java.lang.String r2 = "latestlog.txt"
            r0.<init>(r1, r2)
            return r0
    }

    private static java.util.List<java.lang.String> getRuntimeArchCandidates() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r1 = net.kdt.pojavlaunch.Architecture.archAsString(r1)
            addArchCandidate(r0, r1)
            int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            r3 = 1
            java.lang.String r4 = "arm64"
            java.lang.String r5 = "aarch64"
            if (r2 == r3) goto L7a
            boolean r2 = r1.contains(r4)
            if (r2 != 0) goto L7a
            boolean r2 = r1.contains(r5)
            if (r2 == 0) goto L28
            goto L7a
        L28:
            int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r3 = "arm"
            if (r2 == 0) goto L71
            boolean r2 = r1.contains(r3)
            if (r2 == 0) goto L37
            goto L71
        L37:
            int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            r3 = 2
            if (r2 != r3) goto L53
            java.lang.String r1 = "i386"
            addArchCandidate(r0, r1)
            java.lang.String r1 = "i486"
            addArchCandidate(r0, r1)
            java.lang.String r1 = "i586"
            addArchCandidate(r0, r1)
            java.lang.String r1 = "x86"
            addArchCandidate(r0, r1)
            goto L85
        L53:
            int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            r3 = 3
            java.lang.String r4 = "x86_64"
            java.lang.String r5 = "amd64"
            if (r2 == r3) goto L6a
            boolean r2 = r1.contains(r4)
            if (r2 != 0) goto L6a
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L85
        L6a:
            addArchCandidate(r0, r5)
            addArchCandidate(r0, r4)
            goto L85
        L71:
            addArchCandidate(r0, r3)
            java.lang.String r1 = "armeabi-v7a"
            addArchCandidate(r0, r1)
            goto L85
        L7a:
            addArchCandidate(r0, r5)
            addArchCandidate(r0, r4)
            java.lang.String r1 = "arm64-v8a"
            addArchCandidate(r0, r1)
        L85:
            return r0
    }

    private static void hardDisableLegacyForgeSplashIfNeeded(ca.dnamobile.javalauncher.launcher.LaunchPlan r6, java.lang.String r7) {
            java.lang.String r0 = "false"
            java.lang.String r1 = "DroidBridge RLCraft clean source v5: legacy Forge splash already disabled ("
            java.lang.String r2 = "DroidBridge RLCraft clean source v5: disabled legacy Forge splash ("
            java.lang.String r3 = "Unable to create Forge config directory for splash disable: "
            boolean r4 = isLegacyForgeLikePlan(r6)
            if (r4 != 0) goto Lf
            return
        Lf:
            java.io.File r4 = new java.io.File
            java.io.File r6 = r6.getGameDirectory()
            java.lang.String r5 = "config"
            r4.<init>(r6, r5)
            java.io.File r6 = new java.io.File
            java.lang.String r5 = "splash.properties"
            r6.<init>(r4, r5)
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> La2
            if (r5 != 0) goto L42
            boolean r5 = r4.mkdirs()     // Catch: java.lang.Throwable -> La2
            if (r5 != 0) goto L42
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r6.<init>(r3)     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La2
            safeAppendLog(r6)     // Catch: java.lang.Throwable -> La2
            return
        L42:
            java.util.LinkedHashMap r3 = readColonOrEqualsOptionsFile(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = "enabled"
            boolean r4 = setOption(r3, r4, r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = "rotate"
            boolean r5 = setOption(r3, r5, r0)     // Catch: java.lang.Throwable -> La2
            r4 = r4 | r5
            java.lang.String r5 = "showMemory"
            boolean r0 = setOption(r3, r5, r0)     // Catch: java.lang.Throwable -> La2
            r0 = r0 | r4
            java.lang.String r4 = "): "
            if (r0 != 0) goto L82
            boolean r0 = r6.isFile()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L65
            goto L82
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r7 = r0.append(r7)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r7 = r7.append(r4)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La2
            safeAppendLog(r6)     // Catch: java.lang.Throwable -> La2
            goto Lbc
        L82:
            writeEqualsOptionsFile(r6, r3)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r7 = r0.append(r7)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r7 = r7.append(r4)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La2
            safeAppendLog(r6)     // Catch: java.lang.Throwable -> La2
            goto Lbc
        La2:
            r6 = move-exception
            java.lang.String r7 = "JavaGameLauncher"
            java.lang.String r0 = "Failed to disable legacy Forge splash"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r7, r0, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to disable legacy Forge splash: "
            r7.<init>(r0)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            safeAppendLog(r6)
        Lbc:
            return
    }

    private static boolean hasClasspathFlagImmediatelyBefore(java.util.ArrayList<java.lang.String> r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = isClasspathFlag(r1)
            return r1
    }

    private static boolean hasJvmPathValueFlagImmediatelyBefore(java.util.ArrayList<java.lang.String> r3) {
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r3.size()
            r2 = 1
            int r0 = r0 - r2
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = isClasspathFlag(r3)
            if (r0 != 0) goto L20
            boolean r3 = isModulePathFlag(r3)
            if (r3 == 0) goto L21
        L20:
            r1 = r2
        L21:
            return r1
    }

    private static boolean hasLegacyAwtStub(java.util.List<java.lang.String> r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L13
            goto L4
        L13:
            java.lang.String r1 = "-Dcacio.managed.screensize="
            boolean r1 = r0.startsWith(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            return r2
        L1d:
            java.lang.String r1 = "-Dawt.toolkit=net.java.openjdk.cacio.ctc."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L26
            return r2
        L26:
            java.lang.String r1 = "-Djava.awt.graphicsenv=net.java.openjdk.cacio.ctc."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4
            return r2
        L2f:
            r3 = 0
            return r3
    }

    private static boolean isClasspathFlag(java.lang.String r1) {
            java.lang.String r0 = "-cp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "-classpath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "--class-path"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            return r1
    }

    private static boolean isFreedrenoKgslRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererLibrary()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererEGL()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "freedreno_kgsl"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = "freedreno kgsl"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = "1ad7249f-5784-4f00-bc72-174b3578ee46"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L7a
        L79:
            r0 = 1
        L7a:
            return r0
    }

    private static boolean isLegacyForgeLikePlan(ca.dnamobile.javalauncher.launcher.LaunchPlan r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getVersionId()
            appendIdentity(r0, r1)
            java.lang.String r1 = r3.getMainClass()
            appendIdentity(r0, r1)
            java.util.List r1 = r3.getJvmArgs()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            appendIdentity(r0, r2)
            goto L1b
        L2b:
            java.util.List r1 = r3.getGameArgs()
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            appendIdentity(r0, r2)
            goto L33
        L43:
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "neoforge"
            boolean r1 = r0.contains(r1)
            r2 = 0
            if (r1 != 0) goto L9d
            java.lang.String r1 = "net.neoforged"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L5f
            goto L9d
        L5f:
            java.lang.String r1 = "net.minecraftforge"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L81
            java.lang.String r1 = "fmltweaker"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L81
            java.lang.String r1 = "launchwrapper"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L81
            java.lang.String r1 = "forge"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L80
            goto L81
        L80:
            return r2
        L81:
            int[] r0 = parseFirstMinecraftReleaseVersion(r0)
            if (r0 == 0) goto L94
            r3 = r0[r2]
            r1 = 1
            if (r3 != r1) goto L93
            r3 = r0[r1]
            r0 = 12
            if (r3 > r0) goto L93
            r2 = r1
        L93:
            return r2
        L94:
            java.util.List r3 = r3.getJvmArgs()
            boolean r3 = hasLegacyAwtStub(r3)
            return r3
        L9d:
            return r2
    }

    private static boolean isLtwRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererLibrary()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererEGL()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "ltw"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = "libltw.so"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L72
        L71:
            r0 = 1
        L72:
            return r0
    }

    private static boolean isModulePathFlag(java.lang.String r1) {
            java.lang.String r0 = "-p"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "--module-path"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "--upgrade-module-path"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            return r1
    }

    static /* synthetic */ void lambda$launchInstallerProcess$1(java.lang.Process r5, java.lang.String r6) {
            java.lang.String r0 = "] "
            java.lang.String r1 = "[installer:"
            java.lang.String r2 = "JavaGameLauncher"
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L61
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L61
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L61
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L61
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L61
        L14:
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L57
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r4)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r5 = r4.append(r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L57
            safeAppendLog(r5)     // Catch: java.lang.Throwable -> L57
            goto L14
        L53:
            r3.close()     // Catch: java.lang.Throwable -> L61
            goto L83
        L57:
            r5 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L61
        L60:
            throw r5     // Catch: java.lang.Throwable -> L61
        L61:
            r5 = move-exception
            java.lang.String r0 = "Installer output reader failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Installer output reader failed ("
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = "): "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
        L83:
            return
    }

    static /* synthetic */ void lambda$launchRawJavaArgs$0(ca.dnamobile.javalauncher.launcher.JavaGameLauncher.StatusListener r0, int r1, java.lang.String r2) {
            r0.onStatus(r2)
            return
    }

    static /* synthetic */ void lambda$startInstallerHeartbeat$2(java.lang.String r14, int r15, int r16, java.util.concurrent.atomic.AtomicBoolean r17, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.RawJavaProgressListener r18) {
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = friendlyInstallerName(r14)
            r3 = 5
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Finalizing "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r7 = " install..."
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r7 = 0
            r4[r7] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r8 = " install... still working"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            r8 = 1
            r4[r8] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r8 = " install... running processors"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            r8 = 2
            r4[r8] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r8 = " install... writing version profile"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            r8 = 3
            r4[r8] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r5 = " install... checking generated files"
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r5 = 4
            r4[r5] = r2
            r2 = 100
            r5 = r15
            int r5 = java.lang.Math.min(r2, r15)
            int r5 = java.lang.Math.max(r7, r5)
            r6 = r16
            int r2 = java.lang.Math.min(r2, r6)
            int r2 = java.lang.Math.max(r5, r2)
        L90:
            boolean r6 = r17.get()
            if (r6 == 0) goto L10e
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L10e
            r8 = 5
            long r10 = r6.toMillis(r8)     // Catch: java.lang.InterruptedException -> L10e
            java.lang.Thread.sleep(r10)     // Catch: java.lang.InterruptedException -> L10e
            boolean r6 = r17.get()
            if (r6 != 0) goto La8
            goto L10e
        La8:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r0
            long r10 = r6.toSeconds(r10)
            long r8 = r10 / r8
            long r12 = (long) r3
            long r12 = r8 % r12
            int r6 = (int) r12
            int r12 = r2 - r5
            int r12 = java.lang.Math.max(r7, r12)
            long r12 = (long) r12
            long r8 = java.lang.Math.min(r12, r8)
            int r8 = (int) r8
            int r8 = r8 + r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r6 = r4[r6]
            java.lang.StringBuilder r6 = r9.append(r6)
            java.lang.String r9 = " ("
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r9 = "s)"
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
            r9 = r18
            notifyRaw(r9, r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Installer VMLauncher still running: "
            r6.<init>(r8)
            r8 = r14
            java.lang.StringBuilder r6 = r6.append(r14)
            java.lang.String r12 = " elapsed="
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r10 = "s"
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r6 = r6.toString()
            safeAppendLog(r6)
            goto L90
        L10e:
            return
    }

    public static int launch(android.content.Context r7, java.lang.String r8, ca.dnamobile.javalauncher.data.AccountStore.Account r9, int r10, int r11, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.StatusListener r12) throws java.lang.Exception {
            if (r12 != 0) goto L5
            r12 = 0
            r6 = r12
            goto Le
        L5:
            java.util.Objects.requireNonNull(r12)
            ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda1
            r0.<init>(r12)
            r6 = r0
        Le:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r7 = ca.dnamobile.javalauncher.launcher.LaunchGame.runGame(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static int launchInstallerProcess(android.content.Context r22, java.lang.String r23, java.io.File r24, java.io.File r25, java.io.File r26, java.util.List<java.lang.String> r27, boolean r28, int r29, int r30, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.RawJavaProgressListener r31) throws java.lang.Exception {
            r0 = r23
            r1 = r31
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r28 == 0) goto L2e
            java.io.File r3 = resolveSystemLinker()
            if (r3 == 0) goto L26
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L26
            java.lang.String r3 = r3.getAbsolutePath()
            r2.add(r3)
            java.lang.String r3 = r24.getAbsolutePath()
            r2.add(r3)
            goto L35
        L26:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No Android system linker found for installer fallback."
            r0.<init>(r1)
            throw r0
        L2e:
            java.lang.String r3 = r24.getAbsolutePath()
            r2.add(r3)
        L35:
            r3 = 1
            r4 = r3
        L37:
            int r5 = r27.size()
            if (r4 >= r5) goto L4b
            r5 = r27
            java.lang.Object r6 = r5.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r2.add(r6)
            int r4 = r4 + 1
            goto L37
        L4b:
            java.lang.ProcessBuilder r4 = new java.lang.ProcessBuilder
            r4.<init>(r2)
            r5 = r25
            r4.directory(r5)
            r4.redirectErrorStream(r3)
            java.util.Map r6 = r4.environment()
            sanitizeInstallerChildEnvironment(r6)
            java.lang.String r7 = "JAVA_HOME"
            java.lang.String r8 = r26.getAbsolutePath()
            r6.put(r7, r8)
            java.lang.String r7 = "HOME"
            java.lang.String r8 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r6.put(r7, r8)
            java.io.File r7 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.String r8 = "TMPDIR"
            r6.put(r8, r7)
            java.lang.String r7 = buildInstallerLdLibraryPath(r26)
            java.lang.String r8 = "LD_LIBRARY_PATH"
            r6.put(r8, r7)
            java.io.File r7 = resolveHeapTaggingPreloadLibrary(r22)
            boolean r9 = r7.isFile()
            java.lang.String r10 = "LD_PRELOAD"
            if (r9 == 0) goto Lad
            java.lang.String r9 = r7.getAbsolutePath()
            r6.put(r10, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Installer child LD_PRELOAD="
            r9.<init>(r10)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            safeAppendLog(r7)
            goto Lc6
        Lad:
            r6.remove(r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Installer child LD_PRELOAD disabled; missing "
            r9.<init>(r10)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            safeAppendLog(r7)
        Lc6:
            java.lang.String r7 = "PATH"
            java.lang.Object r9 = r6.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            java.io.File r10 = new java.io.File
            java.lang.String r11 = "bin"
            r12 = r26
            r10.<init>(r12, r11)
            java.lang.String r10 = r10.getAbsolutePath()
            if (r9 == 0) goto Lfa
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto Lfa
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r11 = ":"
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = r9.toString()
        Lfa:
            r6.put(r7, r10)
            if (r28 == 0) goto L102
            java.lang.String r7 = "system-linker"
            goto L104
        L102:
            java.lang.String r7 = "direct-exec"
        L104:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Installer process launchMode="
            r9.<init>(r10)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r11 = " command="
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r11, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "Installer process cwd="
            r9.<init>(r12)
            java.lang.String r13 = r25.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r13)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r11, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r13 = "Installer process LD_LIBRARY_PATH="
            r9.<init>(r13)
            java.lang.Object r14 = r6.get(r8)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.StringBuilder r9 = r9.append(r14)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r11, r9)
            java.lang.String r9 = r10.concat(r7)
            safeAppendLog(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Installer process command="
            r9.<init>(r10)
            java.lang.StringBuilder r2 = r9.append(r2)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r5 = r25.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
            java.lang.Object r5 = r6.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            java.lang.Process r2 = r4.start()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Installer process started: "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = " mode="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            safeAppendLog(r4)
            java.lang.Thread r4 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda0 r6 = new ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda0
            r6.<init>(r2, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "InstallerOutput-"
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r4.<init>(r6, r8)
            r4.setDaemon(r3)
            r4.start()
            long r8 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            r10 = 15
            long r10 = r6.toMillis(r10)
            java.lang.String r6 = friendlyInstallerName(r23)
            r12 = 5
            java.lang.String[] r13 = new java.lang.String[r12]
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Finalizing "
            r14.<init>(r15)
            java.lang.StringBuilder r14 = r14.append(r6)
            java.lang.String r12 = " install..."
            java.lang.StringBuilder r12 = r14.append(r12)
            java.lang.String r12 = r12.toString()
            r14 = 0
            r13[r14] = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r15)
            java.lang.StringBuilder r12 = r12.append(r6)
            java.lang.String r14 = " install... still working"
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r12 = r12.toString()
            r13[r3] = r12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r12 = " install... running processors"
            java.lang.StringBuilder r3 = r3.append(r12)
            java.lang.String r3 = r3.toString()
            r12 = 2
            r13[r12] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r12 = " install... writing version profile"
            java.lang.StringBuilder r3 = r3.append(r12)
            java.lang.String r3 = r3.toString()
            r12 = 3
            r13[r12] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r6 = " install... checking generated files"
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r6 = 4
            r13[r6] = r3
            r3 = 100
            r6 = r29
            int r6 = java.lang.Math.min(r3, r6)
            r12 = 0
            int r6 = java.lang.Math.max(r12, r6)
            r14 = r30
            int r3 = java.lang.Math.min(r3, r14)
            int r3 = java.lang.Math.max(r6, r3)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = r13[r12]
            java.lang.StringBuilder r12 = r14.append(r15)
            java.lang.String r14 = " (0s)"
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r12 = r12.toString()
            notifyRaw(r1, r6, r12)
        L283:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            r14 = 5
            boolean r12 = r2.waitFor(r14, r12)
            r14 = 5000(0x1388, double:2.4703E-320)
            if (r12 == 0) goto L2bb
            r4.join(r14)
            int r1 = r2.exitValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Installer process finished: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r2 = " exitCode="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            safeAppendLog(r0)
            return r1
        L2bb:
            long r16 = java.lang.System.currentTimeMillis()
            long r14 = r16 - r8
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            r16 = r8
            long r8 = r12.toSeconds(r14)
            r20 = r10
            r18 = 5
            long r10 = r8 / r18
            r29 = r14
            r12 = 5
            long r14 = (long) r12
            long r14 = r10 % r14
            int r14 = (int) r14
            int r15 = r3 - r6
            r12 = 0
            int r15 = java.lang.Math.max(r12, r15)
            r18 = r13
            long r12 = (long) r15
            long r10 = java.lang.Math.min(r12, r10)
            int r10 = (int) r10
            int r10 = r10 + r6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = r18[r14]
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = " ("
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r8)
            java.lang.String r12 = "s)"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            notifyRaw(r1, r10, r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Installer process still running: "
            r10.<init>(r11)
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.StringBuilder r10 = r10.append(r7)
            java.lang.String r11 = " elapsed="
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r9 = "s"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            safeAppendLog(r8)
            r8 = r29
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 < 0) goto L36d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Installer process timed out: "
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ". Killing child process."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            safeAppendLog(r0)
            r2.destroy()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 5
            boolean r0 = r2.waitFor(r5, r0)
            if (r0 != 0) goto L360
            r2.destroyForcibly()
        L360:
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.join(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Installer process timed out after 15 minutes. Check latestlog.txt for command/env details."
            r0.<init>(r1)
            throw r0
        L36d:
            r8 = r16
            r13 = r18
            r10 = r20
            goto L283
    }

    private static int launchInstallerProcessWithFallback(android.content.Context r12, java.lang.String r13, java.io.File r14, java.io.File r15, java.io.File r16, java.util.List<java.lang.String> r17, int r18, int r19, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.RawJavaProgressListener r20) throws java.lang.Exception {
            java.lang.String r0 = "Installer direct Java process exited with "
            r7 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            int r1 = launchInstallerProcess(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L35
            r2 = 126(0x7e, float:1.77E-43)
            if (r1 == r2) goto L1e
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 == r2) goto L1e
            return r1
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r2.<init>(r0)     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r0 = r2.append(r1)     // Catch: java.io.IOException -> L35
            java.lang.String r1 = "; retrying through Android system linker."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35
            safeAppendLog(r0)     // Catch: java.io.IOException -> L35
            goto L48
        L35:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Installer direct Java exec failed: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            safeAppendLog(r0)
        L48:
            java.io.File r0 = resolveSystemLinker()
            if (r0 == 0) goto L83
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L83
            java.lang.String r1 = "Direct Java start was blocked. Retrying through Android system linker..."
            r9 = r18
            r11 = r20
            notifyRaw(r11, r9, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Retrying installer through system linker: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            safeAppendLog(r0)
            r8 = 1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r19
            int r0 = launchInstallerProcess(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L83:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Direct Java start was blocked and no Android system linker was found."
            r0.<init>(r1)
            throw r0
    }

    public static int launchPreparedPlan(android.content.Context r2, ca.dnamobile.javalauncher.launcher.LaunchPlan r3, ca.dnamobile.javalauncher.renderer.RendererInterface r4, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.StatusListener r5) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Preparing "
            r0.<init>(r1)
            java.lang.String r1 = r4.getRendererName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " runtime and native bridge..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            notify(r5, r0)
            java.lang.String r0 = "before runtime bootstrap"
            hardDisableLegacyForgeSplashIfNeeded(r3, r0)
            ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.prepare(r2, r3, r4)
            applyRendererSpecificGameOptions(r3, r4)
            writeOptions(r3)
            setupExitHookIfAvailable(r2)
            java.lang.String r4 = "Starting Minecraft JVM..."
            notify(r5, r4)
            int r4 = launchWithVmLauncher(r2, r3)
            java.lang.String r3 = r3.getVersionId()
            ca.dnamobile.javalauncher.launcher.LaunchGame.onJvmExited(r2, r3, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Minecraft JVM exited with code "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            notify(r5, r2)
            return r4
    }

    public static int launchRawJavaArgs(android.content.Context r9, java.lang.String r10, java.io.File r11, java.io.File r12, java.util.List<java.lang.String> r13, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.StatusListener r14) throws java.lang.Exception {
            if (r14 != 0) goto L5
            r14 = 0
            r8 = r14
            goto Lb
        L5:
            ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda3
            r0.<init>(r14)
            r8 = r0
        Lb:
            r6 = 81
            r7 = 88
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            int r9 = launchRawJavaArgsWithProgress(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static int launchRawJavaArgsWithProgress(android.content.Context r12, java.lang.String r13, java.io.File r14, java.io.File r15, java.util.List<java.lang.String> r16, int r17, int r18, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.RawJavaProgressListener r19) throws java.lang.Exception {
            r5 = r14
            r1 = r17
            r10 = r18
            r11 = r19
            ensureActivePathManager(r12)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "bin/java"
            r3.<init>(r14, r0)
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L152
            boolean r0 = r3.canExecute()
            if (r0 != 0) goto L22
            r0 = 0
            r2 = 1
            r3.setExecutable(r2, r0)
        L22:
            boolean r0 = r15.exists()
            if (r0 != 0) goto L48
            boolean r0 = r15.mkdirs()
            if (r0 == 0) goto L2f
            goto L48
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create working directory: "
            r1.<init>(r2)
            java.lang.String r2 = r15.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L48:
            resetInstallerLatestLogs(r13, r14, r15, r16)
            java.lang.String r0 = "Preparing installer runtime..."
            notifyRaw(r11, r1, r0)
            r2 = r12
            prepareRawInstallerEnvironment(r12, r14)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = "java"
            r6.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "-Djava.home="
            r0.<init>(r4)
            java.lang.String r4 = r14.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            addInstallerJvmArgIfMissing(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "-Djava.library.path="
            r0.<init>(r4)
            java.lang.String r4 = buildInstallerLdLibraryPath(r14)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            addInstallerJvmArgIfMissing(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "-Dsun.boot.library.path="
            r0.<init>(r4)
            java.lang.String r4 = buildInstallerLdLibraryPath(r14)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            addInstallerJvmArgIfMissing(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "-Duser.dir="
            r0.<init>(r4)
            java.lang.String r4 = r15.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            addInstallerJvmArgIfMissing(r6, r0)
            r0 = r16
            r6.addAll(r0)
            java.util.Iterator r0 = r6.iterator()
        Lbf:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lcf
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            logJvmArg(r4)
            goto Lbf
        Lcf:
            java.lang.String r0 = "user.dir"
            java.lang.String r4 = r15.getAbsolutePath()     // Catch: java.lang.Throwable -> Lf8
            java.lang.System.setProperty(r0, r4)     // Catch: java.lang.Throwable -> Lf8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf8
            r0.<init>()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r4 = "Installer user.dir="
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r4 = r15.getAbsolutePath()     // Catch: java.lang.Throwable -> Lf8
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf8
            safeAppendLog(r0)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r0 = "Installer native chdir skipped; external Java process owns its cwd."
            safeAppendLog(r0)     // Catch: java.lang.Throwable -> Lf8
            goto L112
        Lf8:
            r0 = move-exception
            java.lang.String r4 = "JavaGameLauncher"
            java.lang.String r7 = "installer working directory setup failed; launch will continue"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r7, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "installer working directory setup failed: "
            r4.<init>(r7)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r0 = r0.toString()
            safeAppendLog(r0)
        L112:
            int r0 = r1 + 1
            r4 = 100
            int r0 = java.lang.Math.min(r4, r0)
            java.lang.String r7 = "Starting installer JVM..."
            notifyRaw(r11, r0, r7)
            int r0 = r1 + 2
            int r7 = java.lang.Math.min(r4, r0)
            int r1 = r10 + (-1)
            int r1 = java.lang.Math.min(r4, r1)
            int r8 = java.lang.Math.max(r0, r1)
            r1 = r12
            r2 = r13
            r4 = r15
            r5 = r14
            r9 = r19
            int r0 = launchInstallerProcessWithFallback(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Installer JVM exited with code "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            notifyRaw(r11, r10, r1)
            return r0
        L152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing Java binary: "
            r1.<init>(r2)
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static int launchWithVmLauncher(android.content.Context r5, ca.dnamobile.javalauncher.launcher.LaunchPlan r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "java"
            r0.add(r1)
            ca.dnamobile.javalauncher.modcompat.SableRapierSupport.addJvmArgsIfNeeded(r5, r6, r0)
            java.util.List r5 = r6.getJvmArgs()
            java.util.ArrayList r5 = normalizeJvmArgsForVmLauncher(r5)
            java.lang.String r1 = resolveMainClassForVmLauncher(r6, r5)
            r0.addAll(r5)
            r0.add(r1)
            java.util.List r5 = r6.getGameArgs()
            r0.addAll(r5)
            r5 = 0
            r1 = r5
        L28:
            int r2 = r0.size()
            if (r1 >= r2) goto L54
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "--accessToken"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L4e
            int r3 = r1 + 1
            int r4 = r0.size()
            if (r3 >= r4) goto L4e
            logJvmArg(r2)
            java.lang.String r1 = "<hidden>"
            logJvmArg(r1)
            r1 = r3
            goto L51
        L4e:
            logJvmArg(r2)
        L51:
            int r1 = r1 + 1
            goto L28
        L54:
            java.io.File r6 = r6.getGameDirectory()     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L60
            net.kdt.pojavlaunch.utils.JREUtils.chdir(r6)     // Catch: java.lang.Throwable -> L60
            goto L7a
        L60:
            r6 = move-exception
            java.lang.String r1 = "JavaGameLauncher"
            java.lang.String r2 = "chdir failed; launch will continue"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "chdir failed: "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            safeAppendLog(r6)
        L7a:
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r5 = r0.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r5 = com.oracle.dalvik.VMLauncher.launchJVM(r5)
            return r5
    }

    private static void logJvmArg(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JVMArg: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            safeAppendLog(r3)
            return
    }

    private static boolean looksLikeStandaloneClasspath(java.lang.String r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r6 = r6.trim()
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L55
            java.lang.String r1 = "-"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L17
            goto L55
        L17:
            java.lang.String r1 = ".jar"
            boolean r1 = r6.contains(r1)
            java.lang.String r2 = "/"
            boolean r2 = r6.contains(r2)
            r3 = 1
            if (r2 != 0) goto L31
            java.lang.String r2 = "\\"
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L2f
            goto L31
        L2f:
            r2 = r0
            goto L32
        L31:
            r2 = r3
        L32:
            java.lang.String r4 = java.io.File.pathSeparator
            boolean r4 = r6.contains(r4)
            java.lang.String r5 = "/libraries/"
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L4b
            java.lang.String r5 = "\\libraries\\"
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L49
            goto L4b
        L49:
            r6 = r0
            goto L4c
        L4b:
            r6 = r3
        L4c:
            if (r1 == 0) goto L55
            if (r2 == 0) goto L55
            if (r4 != 0) goto L54
            if (r6 == 0) goto L55
        L54:
            r0 = r3
        L55:
            return r0
    }

    private static java.util.ArrayList<java.lang.String> normalizeJvmArgsForVmLauncher(java.util.List<java.lang.String> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r1 = r1 + 2
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lf
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            goto Lf
        L28:
            boolean r2 = looksLikeStandaloneClasspath(r1)
            if (r2 == 0) goto L3e
            boolean r2 = hasJvmPathValueFlagImmediatelyBefore(r0)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "-cp"
            r0.add(r2)
            java.lang.String r2 = "Recovered missing -cp before launch classpath JVM argument."
            safeAppendLog(r2)
        L3e:
            r0.add(r1)
            goto Lf
        L42:
            return r0
    }

    private static void notify(ca.dnamobile.javalauncher.launcher.JavaGameLauncher.StatusListener r0, java.lang.String r1) {
            if (r0 == 0) goto L5
            r0.onStatus(r1)
        L5:
            java.lang.String r0 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)
            safeAppendLog(r1)
            return
    }

    private static void notifyRaw(ca.dnamobile.javalauncher.launcher.JavaGameLauncher.RawJavaProgressListener r1, int r2, java.lang.String r3) {
            if (r1 == 0) goto L10
            r0 = 100
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r1.onProgress(r2, r3)
        L10:
            java.lang.String r1 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
            safeAppendLog(r3)
            return
    }

    private static int[] parseFirstMinecraftReleaseVersion(java.lang.String r5) {
            java.lang.String r0 = "(^|[^0-9])(1)\\.(\\d+)(?:\\.(\\d+))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r5 = r0.matcher(r5)
            boolean r0 = r5.find()
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            r0 = 2
            java.lang.String r0 = r5.group(r0)     // Catch: java.lang.Throwable -> L3a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L3a
            r2 = 3
            java.lang.String r2 = r5.group(r2)     // Catch: java.lang.Throwable -> L3a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L3a
            r3 = 4
            java.lang.String r4 = r5.group(r3)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L34
            java.lang.String r5 = r5.group(r3)     // Catch: java.lang.Throwable -> L3a
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L3a
            goto L35
        L34:
            r5 = 0
        L35:
            int[] r5 = new int[]{r0, r2, r5}     // Catch: java.lang.Throwable -> L3a
            return r5
        L3a:
            return r1
    }

    private static void preloadRawInstallerRuntime(java.io.File r3) {
            java.io.File r3 = resolveRuntimeLibDir(r3)
            java.io.File r0 = resolveJvmLibraryDir(r3)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "jli/libjli.so"
            r1.<init>(r3, r2)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libjli.so"
            r1.<init>(r3, r2)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libjvm.so"
            r1.<init>(r0, r2)
            dlopenOptional(r1)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libverify.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libjava.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libzip.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libnet.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libnio.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libawt.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libawt_headless.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libfreetype.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libfontmanager.so"
            r0.<init>(r3, r1)
            dlopenOptional(r0)
            return
    }

    private static void prepareRawInstallerEnvironment(android.content.Context r5, java.io.File r6) {
            sanitizeInstallerProcessEnvironment()
            java.lang.String r0 = buildInstallerLdLibraryPath(r6)
            java.lang.String r1 = "JAVA_HOME"
            java.lang.String r2 = r6.getAbsolutePath()
            setInstallerEnv(r1, r2)
            java.lang.String r1 = "HOME"
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            setInstallerEnv(r1, r2)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "TMPDIR"
            setInstallerEnv(r2, r1)
            java.lang.String r1 = "LD_LIBRARY_PATH"
            setInstallerEnv(r1, r0)
            java.io.File r5 = resolveHeapTaggingPreloadLibrary(r5)
            java.lang.String r1 = "LD_PRELOAD"
            unsetInstallerEnv(r1)
            boolean r1 = r5.isFile()
            java.lang.String r2 = "JavaGameLauncher"
            if (r1 == 0) goto L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Installer global LD_PRELOAD disabled; child will use: "
            r1.<init>(r3)
            java.lang.String r4 = r5.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
            goto L8d
        L63:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Installer LD_PRELOAD unavailable: "
            r1.<init>(r3)
            java.lang.String r4 = r5.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
        L8d:
            java.lang.String r5 = "PATH"
            java.lang.String r1 = java.lang.System.getenv(r5)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "bin"
            r3.<init>(r6, r4)
            java.lang.String r3 = r3.getAbsolutePath()
            if (r1 == 0) goto Lbd
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto Lbd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = ":"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = r1.toString()
        Lbd:
            setInstallerEnv(r5, r3)
            java.lang.String r5 = "Installer native linker bridge skipped for Android 16 compatibility."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r5)
            safeAppendLog(r5)
            java.lang.String r5 = "Installer runtime preloading skipped; child Java process will load runtime libs."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r5)
            safeAppendLog(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Installer runtimeHome="
            r5.<init>(r1)
            java.lang.String r3 = r6.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r3 = "Installer LD_LIBRARY_PATH="
            r5.<init>(r3)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
            return
    }

    private static java.util.LinkedHashMap<java.lang.String, java.lang.String> readColonOrEqualsOptionsFile(java.io.File r7) throws java.lang.Exception {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = r7.isFile()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r7)
            long r2 = r7.length()     // Catch: java.lang.Throwable -> L8e
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L8e
            byte[] r2 = new byte[r7]     // Catch: java.lang.Throwable -> L8e
            r3 = 0
            r4 = r3
        L1a:
            if (r4 >= r7) goto L27
            int r5 = r7 - r4
            int r5 = r1.read(r2, r4, r5)     // Catch: java.lang.Throwable -> L8e
            if (r5 >= 0) goto L25
            goto L27
        L25:
            int r4 = r4 + r5
            goto L1a
        L27:
            r1.close()
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r7.<init>(r2, r1)
            java.lang.String r1 = "\\r?\\n"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = r3
        L39:
            if (r2 >= r1) goto L8d
            r4 = r7[r2]
            if (r4 != 0) goto L40
            goto L8a
        L40:
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L8a
            java.lang.String r5 = "#"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L53
            goto L8a
        L53:
            r5 = 61
            int r5 = r4.indexOf(r5)
            r6 = 58
            int r6 = r4.indexOf(r6)
            if (r5 < 0) goto L68
            if (r6 < 0) goto L68
            int r5 = java.lang.Math.min(r5, r6)
            goto L6c
        L68:
            int r5 = java.lang.Math.max(r5, r6)
        L6c:
            if (r5 > 0) goto L6f
            goto L8a
        L6f:
            java.lang.String r6 = r4.substring(r3, r5)
            java.lang.String r6 = r6.trim()
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r4 = r4.trim()
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L8a
            r0.put(r6, r4)
        L8a:
            int r2 = r2 + 1
            goto L39
        L8d:
            return r0
        L8e:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r0 = move-exception
            r7.addSuppressed(r0)
        L97:
            throw r7
    }

    private static java.lang.String readFileString(java.io.File r5) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r5)
            long r1 = r5.length()     // Catch: java.lang.Throwable -> L26
            int r5 = (int) r1     // Catch: java.lang.Throwable -> L26
            byte[] r1 = new byte[r5]     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r5) goto L1b
            int r4 = r5 - r3
            int r4 = r0.read(r1, r3, r4)     // Catch: java.lang.Throwable -> L26
            if (r4 >= 0) goto L19
            goto L1b
        L19:
            int r3 = r3 + r4
            goto Le
        L1b:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L26
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L26
            r5.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            r0.close()
            return r5
        L26:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            r5.addSuppressed(r0)
        L2f:
            throw r5
    }

    private static java.lang.String readInstalledVersionMainClass(java.lang.String r5) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "versions"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L2c
            r5 = 0
            java.lang.String r5 = readMainClassFromVersionJson(r0, r5)     // Catch: java.lang.Throwable -> L2c
            return r5
        L2c:
            r5 = move-exception
            java.lang.String r0 = "JavaGameLauncher"
            java.lang.String r1 = "Unable to recover mainClass from installed version JSON"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to recover mainClass from installed version JSON: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            safeAppendLog(r5)
            java.lang.String r5 = ""
            return r5
    }

    private static java.lang.String readMainClassFromVersionJson(java.io.File r5, int r6) throws java.lang.Exception {
            r0 = 8
            java.lang.String r1 = ""
            if (r6 > r0) goto L65
            boolean r0 = r5.isFile()
            if (r0 != 0) goto Ld
            goto L65
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r5 = readFileString(r5)
            r0.<init>(r5)
            java.lang.String r5 = "mainClass"
            java.lang.String r5 = r0.optString(r5, r1)
            java.lang.String r5 = r5.trim()
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L27
            return r5
        L27:
            java.lang.String r5 = "inheritsFrom"
            java.lang.String r5 = r0.optString(r5, r1)
            java.lang.String r5 = r5.trim()
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L38
            return r1
        L38:
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r4 = "versions"
            r2.<init>(r3, r4)
            r1.<init>(r2, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r0.<init>(r1, r5)
            int r6 = r6 + 1
            java.lang.String r5 = readMainClassFromVersionJson(r0, r6)
            return r5
        L65:
            return r1
    }

    private static java.util.LinkedHashMap<java.lang.String, java.lang.String> readOptionsFile(java.io.File r7) throws java.lang.Exception {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = r7.isFile()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r7)
            long r2 = r7.length()     // Catch: java.lang.Throwable -> L73
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L73
            byte[] r2 = new byte[r7]     // Catch: java.lang.Throwable -> L73
            r3 = 0
            r4 = r3
        L1a:
            if (r4 >= r7) goto L27
            int r5 = r7 - r4
            int r5 = r1.read(r2, r4, r5)     // Catch: java.lang.Throwable -> L73
            if (r5 >= 0) goto L25
            goto L27
        L25:
            int r4 = r4 + r5
            goto L1a
        L27:
            r1.close()
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r7.<init>(r2, r1)
            java.lang.String r1 = "\\r?\\n"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = r3
        L39:
            if (r2 >= r1) goto L72
            r4 = r7[r2]
            if (r4 != 0) goto L40
            goto L6f
        L40:
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L4b
            goto L6f
        L4b:
            r5 = 58
            int r5 = r4.indexOf(r5)
            if (r5 > 0) goto L54
            goto L6f
        L54:
            java.lang.String r6 = r4.substring(r3, r5)
            java.lang.String r6 = r6.trim()
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r4 = r4.trim()
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L6f
            r0.put(r6, r4)
        L6f:
            int r2 = r2 + 1
            goto L39
        L72:
            return r0
        L73:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r0 = move-exception
            r7.addSuppressed(r0)
        L7c:
            throw r7
    }

    private static void resetInstallerLatestLogs(java.lang.String r2, java.io.File r3, java.io.File r4, java.util.List<java.lang.String> r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "==== JavaLauncher installer log ====\ntask="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "\nruntime="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\nworkingDirectory="
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\nargs="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = "\n"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.io.File r4 = getLauncherLatestLogFile()
            r5 = 0
            writeLogFile(r4, r3, r5)
            java.io.File r4 = getMinecraftLatestLogTxtFile()
            writeLogFile(r4, r3, r5)
            java.io.File r4 = getMinecraftLatestDotLogFile()
            writeLogFile(r4, r3, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Installer latest logs reset for "
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            return
    }

    private static java.io.File resolveAnyLwjglNativeDir() {
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r0 = net.kdt.pojavlaunch.Architecture.androidAbiAsString(r0)
            r1 = 4
            java.io.File[] r2 = new java.io.File[r1]
            java.io.File r3 = new java.io.File
            java.io.File r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "lwjgl3.4.1/natives/"
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r3.<init>(r4, r5)
            r4 = 0
            r2[r4] = r3
            java.io.File r3 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "lwjgl3.3.3/natives/"
            r6.<init>(r7)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r5, r0)
            r0 = 1
            r2[r0] = r3
            java.io.File r0 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r5 = "lwjgl3.4.1/natives/arm64-v8a"
            r0.<init>(r3, r5)
            r3 = 2
            r2[r3] = r0
            java.io.File r0 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r5 = "lwjgl3.3.3/natives/arm64-v8a"
            r0.<init>(r3, r5)
            r3 = 3
            r2[r3] = r0
        L55:
            if (r4 >= r1) goto L63
            r0 = r2[r4]
            boolean r3 = r0.isDirectory()
            if (r3 == 0) goto L60
            return r0
        L60:
            int r4 = r4 + 1
            goto L55
        L63:
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r2 = "installer-empty-natives"
            r0.<init>(r1, r2)
            r0.mkdirs()
            return r0
    }

    private static java.io.File resolveHeapTaggingPreloadLibrary(android.content.Context r2) {
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            if (r0 == 0) goto Ld
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.nativeLibraryDir
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.String r0 = "libdisable_heap_tagging.so"
            if (r2 == 0) goto L1e
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L1e
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            return r1
        L1e:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r2 == 0) goto L2e
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L2e
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            return r1
        L2e:
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            return r2
    }

    private static java.io.File resolveJvmLibraryDir(java.io.File r4) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "server"
            r0.<init>(r4, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libjvm.so"
            r1.<init>(r0, r2)
            boolean r1 = r1.isFile()
            if (r1 == 0) goto L15
            return r0
        L15:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "client"
            r1.<init>(r4, r3)
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r2)
            boolean r4 = r4.isFile()
            if (r4 == 0) goto L28
            return r1
        L28:
            return r0
    }

    private static java.lang.String resolveMainClassForVmLauncher(ca.dnamobile.javalauncher.launcher.LaunchPlan r2, java.util.ArrayList<java.lang.String> r3) {
            java.lang.String r0 = r2.getMainClass()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            java.lang.String r0 = r0.trim()
            boolean r1 = looksLikeStandaloneClasspath(r0)
            if (r1 != 0) goto L13
            return r0
        L13:
            boolean r1 = classpathAlreadyPresent(r3, r0)
            if (r1 != 0) goto L26
            java.lang.String r1 = "-cp"
            r3.add(r1)
            r3.add(r0)
            java.lang.String r3 = "Moved classpath-looking LaunchPlan mainClass back into JVM classpath args."
            safeAppendLog(r3)
        L26:
            java.lang.String r3 = r2.getVersionId()
            java.lang.String r3 = readInstalledVersionMainClass(r3)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L4d
            boolean r0 = looksLikeStandaloneClasspath(r3)
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Recovered LaunchPlan mainClass from installed version JSON: "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            return r3
        L4d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Launch plan mainClass is a classpath, not a Java class. The version argument builder is dropping or misplacing -cp for "
            r0.<init>(r1)
            java.lang.String r2 = r2.getVersionId()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ". Send LaunchGame/LaunchPlan builder classes if this still happens."
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private static java.io.File resolveRuntimeLibDir(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib"
            r0.<init>(r3, r1)
            java.util.List r3 = getRuntimeArchCandidates()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto Lf
            return r2
        L27:
            return r0
    }

    private static java.io.File resolveSystemLinker() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/bin/linker64"
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Le
            return r0
        Le:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/bin/linker"
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L1c
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private static void safeAppendLog(java.lang.String r4) {
            java.lang.String r0 = "\n"
            boolean r1 = r4.endsWith(r0)
            if (r1 == 0) goto La
            r0 = r4
            goto L1b
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
        L1b:
            java.io.File r1 = getLauncherLatestLogFile()
            r2 = 1
            boolean r1 = writeLogFile(r1, r0, r2)
            java.io.File r3 = getMinecraftLatestLogTxtFile()
            boolean r3 = writeLogFile(r3, r0, r2)
            r1 = r1 | r3
            java.io.File r3 = getMinecraftLatestDotLogFile()
            boolean r0 = writeLogFile(r3, r0, r2)
            r0 = r0 | r1
            if (r0 != 0) goto L3d
            java.lang.String r0 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)
        L3d:
            return
    }

    private static void sanitizeInstallerChildEnvironment(java.util.Map<java.lang.String, java.lang.String> r5) {
            r0 = 21
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "CLASSPATH"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "JAVA_TOOL_OPTIONS"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "JDK_JAVA_OPTIONS"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "_JAVA_OPTIONS"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "POJAV_RENDERER"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "POJAVEXEC_EGL"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "POJAV_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 7
            java.lang.String r4 = "POJAVEXEC_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 8
            java.lang.String r4 = "POJAV_RENDERER_LIBRARY"
            r1[r2] = r4
            r2 = 9
            java.lang.String r4 = "POJAVEXEC_RENDERER"
            r1[r2] = r4
            r2 = 10
            java.lang.String r4 = "OSMESA_LIB"
            r1[r2] = r4
            r2 = 11
            java.lang.String r4 = "LIB_MESA_NAME"
            r1[r2] = r4
            r2 = 12
            java.lang.String r4 = "MESA_LOADER_DRIVER_OVERRIDE"
            r1[r2] = r4
            r2 = 13
            java.lang.String r4 = "GALLIUM_DRIVER"
            r1[r2] = r4
            r2 = 14
            java.lang.String r4 = "VK_ICD_FILENAMES"
            r1[r2] = r4
            r2 = 15
            java.lang.String r4 = "VK_DRIVER_FILES"
            r1[r2] = r4
            r2 = 16
            java.lang.String r4 = "DRIVER_PATH"
            r1[r2] = r4
            r2 = 17
            java.lang.String r4 = "LIBGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 18
            java.lang.String r4 = "EGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 19
            java.lang.String r4 = "LTW_NEVER_FLUSH_BUFFERS"
            r1[r2] = r4
            r2 = 20
            java.lang.String r4 = "LTW_COHERENT_DYNAMIC_STORAGE"
            r1[r2] = r4
        L7a:
            if (r3 >= r0) goto L84
            r2 = r1[r3]
            r5.remove(r2)
            int r3 = r3 + 1
            goto L7a
        L84:
            return
    }

    private static void sanitizeInstallerProcessEnvironment() {
            r0 = 21
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "CLASSPATH"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "JAVA_TOOL_OPTIONS"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "JDK_JAVA_OPTIONS"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "_JAVA_OPTIONS"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "POJAV_RENDERER"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "POJAVEXEC_EGL"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "POJAV_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 7
            java.lang.String r4 = "POJAVEXEC_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 8
            java.lang.String r4 = "POJAV_RENDERER_LIBRARY"
            r1[r2] = r4
            r2 = 9
            java.lang.String r4 = "POJAVEXEC_RENDERER"
            r1[r2] = r4
            r2 = 10
            java.lang.String r4 = "OSMESA_LIB"
            r1[r2] = r4
            r2 = 11
            java.lang.String r4 = "LIB_MESA_NAME"
            r1[r2] = r4
            r2 = 12
            java.lang.String r4 = "MESA_LOADER_DRIVER_OVERRIDE"
            r1[r2] = r4
            r2 = 13
            java.lang.String r4 = "GALLIUM_DRIVER"
            r1[r2] = r4
            r2 = 14
            java.lang.String r4 = "VK_ICD_FILENAMES"
            r1[r2] = r4
            r2 = 15
            java.lang.String r4 = "VK_DRIVER_FILES"
            r1[r2] = r4
            r2 = 16
            java.lang.String r4 = "DRIVER_PATH"
            r1[r2] = r4
            r2 = 17
            java.lang.String r4 = "LIBGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 18
            java.lang.String r4 = "EGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 19
            java.lang.String r4 = "LTW_NEVER_FLUSH_BUFFERS"
            r1[r2] = r4
            r2 = 20
            java.lang.String r4 = "LTW_COHERENT_DYNAMIC_STORAGE"
            r1[r2] = r4
        L7a:
            if (r3 >= r0) goto L84
            r2 = r1[r3]
            unsetInstallerEnv(r2)
            int r3 = r3 + 1
            goto L7a
        L84:
            return
    }

    private static void setInstallerEnv(java.lang.String r3, java.lang.String r4) {
            r0 = 1
            android.system.Os.setenv(r3, r4, r0)     // Catch: java.lang.Throwable -> L5
            goto L34
        L5:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to set installer env "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r0, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            safeAppendLog(r3)
        L34:
            return
    }

    private static boolean setOption(java.util.LinkedHashMap<java.lang.String, java.lang.String> r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.trim()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L14
            r1 = 0
            return r1
        L14:
            r1.put(r2, r3)
            r1 = 1
            return r1
    }

    private static void setupExitHookIfAvailable(android.content.Context r2) {
            java.lang.String r0 = "JavaGameLauncher"
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L30
            net.kdt.pojavlaunch.utils.JREUtils.setupExitMethod(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Native exit method registered."
            safeAppendLog(r2)     // Catch: java.lang.Throwable -> L30
            net.kdt.pojavlaunch.utils.JREUtils.initializeGameExitHook()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "Native exit hook initialized."
            safeAppendLog(r2)     // Catch: java.lang.Throwable -> L17
            goto L2f
        L17:
            r2 = move-exception
            java.lang.String r1 = "initializeGameExitHook failed; launch will continue"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "initializeGameExitHook failed: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
        L2f:
            return
        L30:
            r2 = move-exception
            java.lang.String r1 = "setupExitMethod failed; launch will continue"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setupExitMethod failed: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            return
    }

    private static java.lang.Thread startInstallerHeartbeat(java.lang.String r8, java.util.concurrent.atomic.AtomicBoolean r9, int r10, int r11, ca.dnamobile.javalauncher.launcher.JavaGameLauncher.RawJavaProgressListener r12) {
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda2 r7 = new ca.dnamobile.javalauncher.launcher.JavaGameLauncher$$ExternalSyntheticLambda2
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r9
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "InstallerHeartbeat-"
            r9.<init>(r10)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r7, r8)
            r8 = 1
            r0.setDaemon(r8)
            r0.start()
            return r0
    }

    private static java.lang.String trimFloat(float r3) {
            long r0 = (long) r3
            float r2 = (float) r0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto Lb
            java.lang.String r3 = java.lang.String.valueOf(r0)
            return r3
        Lb:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
    }

    private static void unsetInstallerEnv(java.lang.String r4) {
            android.system.Os.unsetenv(r4)     // Catch: java.lang.Throwable -> L4
            goto L33
        L4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to unset installer env "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "JavaGameLauncher"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            safeAppendLog(r4)
        L33:
            return
    }

    private static void writeEqualsOptionsFile(java.io.File r4, java.util.LinkedHashMap<java.lang.String, java.lang.String> r5) throws java.lang.Exception {
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto Lf
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r2 = r0.append(r2)
            r3 = 61
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r1 = r2.append(r1)
            r2 = 10
            r1.append(r2)
            goto L1c
        L48:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r1 = 0
            r5.<init>(r4, r1)
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5f
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L5f
            r5.write(r4)     // Catch: java.lang.Throwable -> L5f
            r5.close()
            return
        L5f:
            r4 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r5 = move-exception
            r4.addSuppressed(r5)
        L68:
            throw r4
    }

    private static boolean writeLogFile(java.io.File r3, java.lang.String r4, boolean r5) {
            r0 = 0
            java.io.File r1 = r3.getParentFile()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L14
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L14
            boolean r1 = r1.mkdirs()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L14
            return r0
        L14:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L31
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L31
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L27
            byte[] r3 = r4.getBytes(r3)     // Catch: java.lang.Throwable -> L27
            r1.write(r3)     // Catch: java.lang.Throwable -> L27
            r1.close()     // Catch: java.lang.Throwable -> L31
            r3 = 1
            return r3
        L27:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L31
        L30:
            throw r3     // Catch: java.lang.Throwable -> L31
        L31:
            return r0
    }

    private static void writeOptions(ca.dnamobile.javalauncher.launcher.LaunchPlan r3) {
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getGameDirectory()
            java.lang.String r1 = "options.txt"
            r0.<init>(r3, r1)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L12
            return
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "fullscreen:false\noverrideWidth:"
            r3.<init>(r1)
            int r1 = org.lwjgl.glfw.CallbackBridge.windowWidth
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r1 = "\noverrideHeight:"
            java.lang.StringBuilder r3 = r3.append(r1)
            int r1 = org.lwjgl.glfw.CallbackBridge.windowHeight
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r1 = "\nfboEnable:true\n"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.io.File r1 = r0.getParentFile()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L4d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L69
            if (r2 != 0) goto L4d
            r1.mkdirs()     // Catch: java.lang.Throwable -> L69
        L4d:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L69
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L69
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5f
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L5f
            r1.write(r3)     // Catch: java.lang.Throwable -> L5f
            r1.close()     // Catch: java.lang.Throwable -> L69
            goto L83
        L5f:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L69
        L68:
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            java.lang.String r0 = "JavaGameLauncher"
            java.lang.String r1 = "Failed to write default options.txt"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to write options.txt: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            safeAppendLog(r3)
        L83:
            return
    }

    private static void writeOptionsFile(java.io.File r4, java.util.LinkedHashMap<java.lang.String, java.lang.String> r5) throws java.lang.Exception {
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto Lf
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r2 = r0.append(r2)
            r3 = 58
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r1 = r2.append(r1)
            r2 = 10
            r1.append(r2)
            goto L1c
        L48:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r1 = 0
            r5.<init>(r4, r1)
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5f
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L5f
            r5.write(r4)     // Catch: java.lang.Throwable -> L5f
            r5.close()
            return
        L5f:
            r4 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r5 = move-exception
            r4.addSuppressed(r5)
        L68:
            throw r4
    }
}
