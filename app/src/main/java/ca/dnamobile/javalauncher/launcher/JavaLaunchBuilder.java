package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class JavaLaunchBuilder {
    private static final java.lang.String DEFAULT_MAIN_CLASS = "net.minecraft.client.main.Main";
    private static final int DEFAULT_MEMORY_MB = 2048;
    private static final java.lang.String TAG = "JavaLaunchBuilder";
    private static ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer activeOfflineSkinServer;
    private final ca.dnamobile.javalauncher.data.AccountStore.Account account;
    private final android.content.Context context;
    private java.io.File gameDirectoryOverride;
    private final int height;
    private ca.dnamobile.javalauncher.renderer.RendererInterface rendererOverride;
    private java.io.File runtimeDirectoryOverride;
    private final java.lang.String versionId;
    private final int width;

    public JavaLaunchBuilder(android.content.Context r1, java.lang.String r2, ca.dnamobile.javalauncher.data.AccountStore.Account r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            r0.versionId = r2
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = resolveLaunchAccount(r1, r3)
            r0.account = r1
            r1 = 1
            int r2 = java.lang.Math.max(r1, r4)
            r0.width = r2
            int r1 = java.lang.Math.max(r1, r5)
            r0.height = r1
            return
    }

    private void addArgumentArray(java.util.ArrayList<java.lang.String> r6, org.json.JSONArray r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.lang.Exception {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.length()
            if (r1 >= r2) goto L5f
            java.lang.Object r2 = r7.get(r1)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1a
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r5.replaceTokens(r2, r8)
            r6.add(r2)
            goto L5c
        L1a:
            boolean r3 = r2 instanceof org.json.JSONObject
            if (r3 == 0) goto L5c
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r3 = "rules"
            org.json.JSONArray r3 = r2.optJSONArray(r3)
            boolean r3 = r5.isRulesAllowed(r3)
            if (r3 != 0) goto L2d
            goto L5c
        L2d:
            java.lang.String r3 = "value"
            java.lang.Object r2 = r2.opt(r3)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L41
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r5.replaceTokens(r2, r8)
            r6.add(r2)
            goto L5c
        L41:
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L5c
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            r3 = r0
        L48:
            int r4 = r2.length()
            if (r3 >= r4) goto L5c
            java.lang.String r4 = r2.getString(r3)
            java.lang.String r4 = r5.replaceTokens(r4, r8)
            r6.add(r4)
            int r3 = r3 + 1
            goto L48
        L5c:
            int r1 = r1 + 1
            goto L2
        L5f:
            return
    }

    private void addCriticalClasspathLibrariesIfNeeded(java.util.LinkedHashMap<java.lang.String, java.io.File> r2, java.util.LinkedHashMap<java.lang.String, java.lang.String> r3, java.lang.String r4) throws java.lang.Exception {
            r1 = this;
            boolean r4 = r1.requiresJtracyLibrary(r4)
            if (r4 != 0) goto L7
            return
        L7:
            java.lang.String r4 = "com.mojang:jtracy:1.0.29"
            org.json.JSONObject r4 = r1.createMavenLibrary(r4)
            java.lang.String r0 = "critical Minecraft library fallback"
            r1.addMavenLibraryToClasspath(r2, r3, r4, r0)
            return
    }

    private void addCustomSkinAuthlibInjectorIfNeeded(java.util.ArrayList<java.lang.String> r11) {
            r10 = this;
            java.lang.String r0 = "Using OfflineYggdrasilServer on port "
            java.lang.String r1 = "-javaagent:"
            java.lang.String r2 = r10.resolvePlayerName()
            ca.dnamobile.javalauncher.skin.OfflineSkinProfile r3 = r10.resolveOfflineSkinProfile(r2)
            if (r3 == 0) goto Lbb
            boolean r4 = r3.enabled
            if (r4 == 0) goto Lbb
            java.io.File r4 = r3.skinFile
            if (r4 == 0) goto Lbb
            java.io.File r4 = r3.skinFile
            boolean r4 = r4.isFile()
            if (r4 != 0) goto L20
            goto Lbb
        L20:
            java.io.File r4 = r10.resolveAuthlibInjectorJar()
            java.lang.String r5 = "JavaLaunchBuilder"
            if (r4 == 0) goto Lad
            boolean r6 = r4.isFile()
            if (r6 != 0) goto L30
            goto Lad
        L30:
            stopActiveOfflineSkinServer()     // Catch: java.lang.Throwable -> La3
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer r6 = new ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer     // Catch: java.lang.Throwable -> La3
            java.lang.String r7 = "JavaLauncher_Offline"
            java.lang.String r8 = "JavaLauncher"
            java.lang.String r9 = "1.0"
            r6.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> La3
            r6.start()     // Catch: java.lang.Throwable -> La3
            int r7 = r6.getPort()     // Catch: java.lang.Throwable -> La3
            if (r7 > 0) goto L50
            r6.stop()     // Catch: java.lang.Throwable -> La3
            java.lang.String r11 = "Offline skin server did not expose a valid port."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r11)     // Catch: java.lang.Throwable -> La3
            return
        L50:
            java.lang.String r8 = r3.uniqueUuid     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = stripUuidDashes(r8)     // Catch: java.lang.Throwable -> La3
            java.io.File r9 = r3.skinFile     // Catch: java.lang.Throwable -> La3
            ca.dnamobile.javalauncher.skin.SkinModelType r3 = r3.model     // Catch: java.lang.Throwable -> La3
            r6.addCharacter(r8, r2, r9, r3)     // Catch: java.lang.Throwable -> La3
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder.activeOfflineSkinServer = r6     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r3.<init>(r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r3 = "=http://127.0.0.1:"
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch: java.lang.Throwable -> La3
            java.lang.String r3 = "/"
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La3
            r11.add(r1)     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "-Dauthlibinjector.side=client"
            r11.add(r1)     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r11.<init>(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r11 = r11.append(r7)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = " for offline skin user "
            java.lang.StringBuilder r11 = r11.append(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r11 = r11.append(r2)     // Catch: java.lang.Throwable -> La3
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> La3
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r11)     // Catch: java.lang.Throwable -> La3
            goto Lac
        La3:
            r11 = move-exception
            stopActiveOfflineSkinServer()
            java.lang.String r0 = "Failed to prepare custom skin authlib injector"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r0, r11)
        Lac:
            return
        Lad:
            java.lang.String r11 = "Offline skin selected, but authlib-injector.jar was not found. Skin will only show in launcher UI."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r11)
            java.lang.String r11 = "Offline skin selected, but authlib-injector.jar was not found.\n"
            r10.safeWriteSkinLaunchNote(r11)
            stopActiveOfflineSkinServer()
            return
        Lbb:
            stopActiveOfflineSkinServer()
            return
    }

    private void addDroidBridgeWebRtcBridgeClasspathFirst(java.util.LinkedHashMap<java.lang.String, java.io.File> r9) {
            r8 = this;
            java.io.File r0 = r8.resolveDroidBridgeWebRtcBridgeDirectory()
            java.lang.String r1 = "JavaLaunchBuilder"
            if (r0 == 0) goto Lb0
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L10
            goto Lb0
        L10:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "droidbridge-devonvoid-android-webrtc-bridge.jar"
            r3.<init>(r0, r4)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "webrtc-android-classes.jar"
            r4.<init>(r0, r5)
            boolean r5 = r3.isFile()
            if (r5 == 0) goto L2c
            r2.add(r3)
        L2c:
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L35
            r2.add(r4)
        L35:
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda0 r3 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda0
            r3.<init>()
            java.io.File[] r3 = r0.listFiles(r3)
            if (r3 == 0) goto L64
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda1 r4 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda1
            r4.<init>()
            java.util.Arrays.sort(r3, r4)
            int r4 = r3.length
            r5 = 0
        L4a:
            if (r5 >= r4) goto L64
            r6 = r3[r5]
            if (r6 == 0) goto L61
            boolean r7 = r6.isFile()
            if (r7 != 0) goto L57
            goto L61
        L57:
            boolean r7 = r2.contains(r6)
            if (r7 == 0) goto L5e
            goto L61
        L5e:
            r2.add(r6)
        L61:
            int r5 = r5 + 1
            goto L4a
        L64:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L81
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridge Android WebRTC bridge directory has no jars: "
            r9.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)
            return
        L81:
            java.util.Iterator r0 = r2.iterator()
        L85:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r2.getAbsolutePath()
            r9.put(r3, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Prepended DroidBridge Android WebRTC classpath jar: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r2)
            goto L85
        Laf:
            return
        Lb0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridge Android WebRTC bridge directory not found; desktop dev.onvoid WebRTC will remain first if present. Checked: "
            r9.<init>(r2)
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.getAbsolutePath()
            goto Lc0
        Lbe:
            java.lang.String r0 = "<null>"
        Lc0:
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)
            return
    }

    private void addForgeJava17ModuleOpens(java.util.ArrayList<java.lang.String> r3, org.json.JSONObject r4) {
            r2 = this;
            boolean r0 = r2.isForgeOrBootstrapVersion(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "--add-opens=java.base/java.lang.invoke=ALL-UNNAMED"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "--add-opens=java.base/java.lang=ALL-UNNAMED"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "--add-opens=java.base/java.lang.reflect=ALL-UNNAMED"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "--add-opens=java.base/java.util=ALL-UNNAMED"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "--add-opens=java.base/java.util.jar=ALL-UNNAMED"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "--add-opens=java.base/sun.nio.fs=ALL-UNNAMED"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Applied Forge Java 17 module opens for "
            r3.<init>(r0)
            java.lang.String r0 = "id"
            java.lang.String r1 = r2.versionId
            java.lang.String r4 = r4.optString(r0, r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
    }

    private void addForgeModuleWorkaroundsIfNeeded(java.util.ArrayList<java.lang.String> r3, java.io.File r4, org.json.JSONObject r5) {
            r2 = this;
            boolean r0 = r2.isForgeOrBootstrapVersion(r5)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r2.resolveRuntimeMajor(r4)
            if (r0 <= 0) goto L3f
            r1 = 9
            if (r0 >= r1) goto L3f
            r2.purgeJava9ModuleArgs(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Skipping Forge Java 9+ module args for Java 8 runtime "
            r3.<init>(r0)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " on "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "id"
            java.lang.String r0 = r2.versionId
            java.lang.String r4 = r5.optString(r4, r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
        L3f:
            r2.addForgeJava17ModuleOpens(r3, r5)
            r2.addForgeNashornAsmModulePath(r3, r5)
            return
    }

    private void addForgeNashornAsmModulePath(java.util.ArrayList<java.lang.String> r3, org.json.JSONObject r4) {
            r2 = this;
            boolean r0 = r2.isForgeOrBootstrapVersion(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.util.ArrayList r4 = r2.collectForgeAsmModuleJars(r4)
            boolean r0 = r4.isEmpty()
            java.lang.String r1 = "JavaLaunchBuilder"
            if (r0 == 0) goto L19
            java.lang.String r3 = "Forge ASM module-path fix skipped; no ASM module jars found."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
            return
        L19:
            java.lang.String r4 = r2.joinPathList(r4)
            r2.mergeModulePath(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Applied Forge ASM module path: "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
            return
    }

    private void addJnaAndroidWorkarounds(java.util.ArrayList<java.lang.String> r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            r4 = this;
            java.lang.String r0 = "libjnidispatch.so"
            java.io.File r0 = r4.findFirstLibraryInPath(r6, r0)
            java.lang.String r1 = "libSDL2.so"
            java.io.File r1 = r4.findFirstLibraryInPath(r7, r1)
            java.lang.String r2 = r6.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "-Djna.boot.library.path="
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.add(r2)
        L28:
            java.lang.String r2 = r7.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "-Djna.library.path="
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r5.add(r2)
        L44:
            java.lang.String r2 = "-Djna.nounpack=false"
            r5.add(r2)
            java.lang.String r2 = "JavaLaunchBuilder"
            if (r8 == 0) goto L6b
            if (r1 == 0) goto L6b
            boolean r8 = r1.isFile()
            if (r8 == 0) goto L6b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Controllable SDL2 native prepared: "
            r8.<init>(r3)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r8)
        L6b:
            java.lang.String r8 = "-Djna.nosys=false"
            r5.add(r8)
            if (r0 == 0) goto L8f
            boolean r8 = r0.isFile()
            if (r8 == 0) goto L8f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "JNA Android dispatch found: "
            r8.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r8)
            goto La1
        L8f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "JNA Android dispatch missing. Checked path: "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r8)
        La1:
            java.lang.String r8 = "-Djna.debug_load=false"
            r5.add(r8)
            java.lang.String r8 = "-Dcom.sun.jna.useProtected=true"
            r5.add(r8)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Applied Android JNA boot path: "
            r5.<init>(r8)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Applied Android JNA library path: "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r5)
            return
    }

    private void addJvmArgIfMissing(java.util.ArrayList<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L9
            r2.add(r3)
        L9:
            return
    }

    private void addLegacyBetaJvmArgs(java.util.ArrayList<java.lang.String> r3, org.json.JSONObject r4) {
            r2 = this;
            java.lang.String r0 = "id"
            java.lang.String r1 = r2.versionId
            java.lang.String r4 = r4.optString(r0, r1)
            if (r4 == 0) goto L14
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L16
        L14:
            java.lang.String r4 = r2.versionId
        L16:
            java.lang.String r0 = r4.trim()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            boolean r0 = r2.isBetacraftProxyVersion(r0)
            if (r0 != 0) goto L27
            return
        L27:
            java.lang.String r0 = "-Dhttp.proxyHost=betacraft.uk"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "-Dhttp.proxyPort=11705"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "-Djava.util.Arrays.useLegacyMergeSort=true"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.String r0 = "-Djava.net.preferIPv4Stack=true"
            r2.addJvmArgIfMissing(r3, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Applied Betacraft proxy JVM args for legacy version "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
    }

    private void addLegacyForgeJvmStabilityArgs(java.util.ArrayList<java.lang.String> r1, org.json.JSONObject r2) {
            r0 = this;
            return
    }

    private void addLegacyForgeLog4jPatchArg(java.util.ArrayList<java.lang.String> r5) {
            r4 = this;
            java.io.File r0 = r4.resolveLegacyForgeLog4jPatchFile()
            java.lang.String r1 = "JavaLaunchBuilder"
            if (r0 == 0) goto L3c
            boolean r2 = r0.isFile()
            if (r2 != 0) goto Lf
            goto L3c
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "-Dlog4j.configurationFile="
            r2.<init>(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.addJvmArgIfMissing(r5, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "Applied legacy Forge log4j config: "
            r5.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
            return
        L3c:
            java.lang.String r5 = "Legacy Forge log4j patch config not found; continuing with log4j2.formatMsgNoLookups."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
            return
    }

    private void addMavenLibraryToClasspath(java.util.LinkedHashMap<java.lang.String, java.io.File> r7, java.util.LinkedHashMap<java.lang.String, java.lang.String> r8, org.json.JSONObject r9, java.lang.String r10) {
            r6 = this;
            java.lang.String r0 = r6.resolveLibraryArtifactPath(r9)
            if (r0 == 0) goto Ld2
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto Ld2
        Le:
            java.io.File r1 = new java.io.File
            java.io.File r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            r1.<init>(r2, r0)
            boolean r0 = r6.ensureLibraryJarForLaunch(r9, r0, r1)
            java.lang.String r2 = "name"
            java.lang.String r3 = "JavaLaunchBuilder"
            if (r0 != 0) goto L50
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to add "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r9.optString(r2)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " path="
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r1.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r7)
            return
        L50:
            java.lang.String r0 = r6.getLibraryMergeKey(r9)
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L9d
            java.lang.String r4 = r1.getAbsolutePath()
            java.lang.Object r8 = r8.put(r0, r4)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L9d
            java.lang.String r4 = r1.getAbsolutePath()
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L9d
            r7.remove(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Replacing duplicate Maven library on classpath: "
            r4.<init>(r5)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = " old="
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = " new="
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r8)
        L9d:
            java.lang.String r8 = r1.getAbsolutePath()
            r7.put(r8, r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Added "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r8 = " to classpath: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r9.optString(r2)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " -> "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = r1.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r7)
        Ld2:
            return
    }

    private void addMioLibPatcherIfAvailable(java.util.ArrayList<java.lang.String> r5, java.io.File r6) {
            r4 = this;
            ca.dnamobile.javalauncher.utils.path.LibPath.refresh()
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.LibPath.MIO_LIB_PATCHER
            java.lang.String r1 = "JavaLaunchBuilder"
            if (r0 == 0) goto L7b
            boolean r2 = r0.isFile()
            if (r2 != 0) goto L10
            goto L7b
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "-javaagent:"
            r2.<init>(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = r5.contains(r2)
            if (r3 != 0) goto L43
            r5.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Applied MioLibPatcher for all renderers: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
            goto L59
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MioLibPatcher already present: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
        L59:
            boolean r0 = r4.shouldEnableNativeAccessForRuntime(r6)
            if (r0 == 0) goto L7a
            java.lang.String r0 = "--enable-native-access=ALL-UNNAMED"
            r4.addJvmArgIfMissing(r5, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Enabled native access for MioLibPatcher on runtime "
            r5.<init>(r0)
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
        L7a:
            return
        L7b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "MioLibPatcher.jar was not found at "
            r5.<init>(r6)
            if (r0 == 0) goto L89
            java.lang.String r6 = r0.getAbsolutePath()
            goto L8b
        L89:
            java.lang.String r6 = "<null>"
        L8b:
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
            return
    }

    private void addMojangJvmArguments(java.util.ArrayList<java.lang.String> r2, org.json.JSONObject r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = "arguments"
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            if (r3 != 0) goto L9
            return
        L9:
            java.lang.String r0 = "jvm"
            org.json.JSONArray r3 = r3.optJSONArray(r0)
            if (r3 != 0) goto L12
            return
        L12:
            r1.addArgumentArray(r2, r3, r4)
            return
    }

    private void addNamedJarFirst(java.util.ArrayList<java.io.File> r5, java.io.File[] r6, java.lang.String r7) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1f
            r2 = r6[r1]
            if (r2 == 0) goto L1c
            java.lang.String r3 = r2.getName()
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L1c
            boolean r3 = r5.contains(r2)
            if (r3 != 0) goto L1c
            r5.add(r2)
            return
        L1c:
            int r1 = r1 + 1
            goto L2
        L1f:
            return
    }

    private void addPath(java.lang.StringBuilder r2, java.io.File r3) {
            r1 = this;
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r0 = r2.toString()
            boolean r0 = r1.containsPath(r0, r3)
            if (r0 == 0) goto L16
            return
        L16:
            int r0 = r2.length()
            if (r0 <= 0) goto L21
            r0 = 58
            r2.append(r0)
        L21:
            r2.append(r3)
            return
    }

    private void addPathIfContains(java.lang.StringBuilder r2, java.io.File r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r4)
            boolean r4 = r0.isFile()
            if (r4 != 0) goto L13
            return
        L13:
            r1.addPath(r2, r3)
            return
    }

    private void addPathIfMissing(java.util.ArrayList<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L9
            r2.add(r3)
        L9:
            return
    }

    private void addPathList(java.lang.StringBuilder r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = ":"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 0
        L13:
            if (r1 >= r0) goto L33
            r2 = r6[r1]
            if (r2 == 0) goto L30
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L24
            goto L30
        L24:
            java.io.File r3 = new java.io.File
            java.lang.String r2 = r2.trim()
            r3.<init>(r2)
            r4.addPath(r5, r3)
        L30:
            int r1 = r1 + 1
            goto L13
        L33:
            return
    }

    private void addReplayModFFmpegJvmArgs(java.util.ArrayList<java.lang.String> r4, ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result r5) {
            r3 = this;
            boolean r0 = r5.replayModPresent
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.available
            java.lang.String r1 = "JavaLaunchBuilder"
            if (r0 == 0) goto L8d
            java.lang.String r0 = r5.executablePath
            if (r0 == 0) goto L8d
            java.lang.String r0 = r5.executablePath
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            goto L8d
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "-Djavalauncher.ffmpeg.path="
            r0.<init>(r2)
            java.lang.String r2 = r5.executablePath
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.addJvmArgIfMissing(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "-Dreplaymod.ffmpeg.path="
            r0.<init>(r2)
            java.lang.String r2 = r5.executablePath
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.addJvmArgIfMissing(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "-Dffmpeg.location="
            r0.<init>(r2)
            java.lang.String r2 = r5.executablePath
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.addJvmArgIfMissing(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "-Dpojav.ffmpeg.path="
            r0.<init>(r2)
            java.lang.String r2 = r5.executablePath
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.addJvmArgIfMissing(r4, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Applied Replay Mod FFmpeg JVM path from "
            r4.<init>(r0)
            java.lang.String r0 = r5.packageName
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = r5.executablePath
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r4)
            return
        L8d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Replay Mod is installed, but JavaLauncher FFmpeg plugin was not found. "
            r4.<init>(r0)
            java.lang.String r0 = r5.errorMessage
            if (r0 == 0) goto L9b
            java.lang.String r5 = r5.errorMessage
            goto L9d
        L9b:
            java.lang.String r5 = ""
        L9d:
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r4)
            return
    }

    private void addUnique(java.util.List<java.lang.String> r5, java.lang.String r6) {
            r4 = this;
            if (r6 == 0) goto L2f
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
            java.lang.String r0 = "/"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 0
        L15:
            if (r1 >= r0) goto L2f
            r2 = r6[r1]
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2c
            boolean r3 = r5.contains(r2)
            if (r3 != 0) goto L2c
            r5.add(r2)
        L2c:
            int r1 = r1 + 1
            goto L15
        L2f:
            return
    }

    private java.lang.String appendUniquePathEntries(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r2 = ":"
            if (r8 == 0) goto L34
            java.lang.String r3 = r8.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L34
            java.lang.String[] r8 = r8.split(r2)
            int r3 = r8.length
            r4 = r1
        L1a:
            if (r4 >= r3) goto L34
            r5 = r8[r4]
            if (r5 == 0) goto L31
            java.lang.String r6 = r5.trim()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L31
            java.lang.String r5 = r5.trim()
            r7.addPathIfMissing(r0, r5)
        L31:
            int r4 = r4 + 1
            goto L1a
        L34:
            java.lang.String[] r8 = r9.split(r2)
            int r9 = r8.length
        L39:
            if (r1 >= r9) goto L53
            r2 = r8[r1]
            if (r2 == 0) goto L50
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L50
            java.lang.String r2 = r2.trim()
            r7.addPathIfMissing(r0, r2)
        L50:
            int r1 = r1 + 1
            goto L39
        L53:
            java.lang.String r8 = r7.joinPathList(r0)
            return r8
    }

    private java.lang.String artifactToPath(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r1 = 3
            if (r0 >= r1) goto Lc
            r7 = 0
            return r7
        Lc:
            r0 = 0
            r0 = r7[r0]
            r2 = 46
            r3 = 47
            java.lang.String r0 = r0.replace(r2, r3)
            r2 = 1
            r2 = r7[r2]
            r3 = 2
            r3 = r7[r3]
            int r4 = r7.length
            java.lang.String r5 = "-"
            if (r4 <= r1) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r7 = r7[r1]
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            goto L34
        L32:
            java.lang.String r7 = ""
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = ".jar"
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private java.lang.String buildBootLibraryPath(java.io.File r4) {
            r3 = this;
            java.io.File r4 = r3.resolveRuntimeLibDir(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3.addPath(r0, r4)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "server"
            r1.<init>(r4, r2)
            r3.addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "client"
            r1.<init>(r4, r2)
            r3.addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "jli"
            r1.<init>(r4, r2)
            r3.addPath(r0, r1)
            java.io.File r4 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r4.<init>(r1)
            r3.addPath(r0, r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private java.util.List<java.lang.String> buildCacioJvmArgs(java.io.File r7, int r8, int r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r7 = r7.getName()
            java.lang.String r1 = "8"
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L14
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_8
            goto L16
        L14:
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_17
        L16:
            java.lang.String r2 = r6.buildJarClassPath(r1)
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = "JavaLaunchBuilder"
            if (r3 == 0) goto L39
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cacio AWT jars are missing, skipping AWT backend: "
            r7.<init>(r8)
            java.lang.String r8 = r1.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r7)
            return r0
        L39:
            java.lang.String r3 = "-Djava.awt.headless=false"
            r0.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "-Dcacio.managed.screensize="
            r3.<init>(r5)
            r5 = 1
            int r8 = java.lang.Math.max(r5, r8)
            java.lang.StringBuilder r8 = r3.append(r8)
            java.lang.String r3 = "x"
            java.lang.StringBuilder r8 = r8.append(r3)
            int r9 = java.lang.Math.max(r5, r9)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r0.add(r8)
            java.lang.String r8 = "-Dcacio.font.fontmanager=sun.awt.X11FontManager"
            r0.add(r8)
            java.lang.String r8 = "-Dcacio.font.fontscaler=sun.font.FreetypeFontScaler"
            r0.add(r8)
            java.lang.String r8 = "-Dswing.defaultlaf=javax.swing.plaf.nimbus.NimbusLookAndFeel"
            r0.add(r8)
            if (r7 == 0) goto L92
            java.lang.String r7 = "-Dawt.toolkit=net.java.openjdk.cacio.ctc.CTCToolkit"
            r0.add(r7)
            java.lang.String r7 = "-Djava.awt.graphicsenv=net.java.openjdk.cacio.ctc.CTCGraphicsEnvironment"
            r0.add(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "-Xbootclasspath/p:"
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
            goto L122
        L92:
            java.lang.String r7 = "-Dawt.toolkit=com.github.caciocavallosilano.cacio.ctc.CTCToolkit"
            r0.add(r7)
            java.lang.String r7 = "-Djava.awt.graphicsenv=com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment"
            r0.add(r7)
            java.io.File r7 = ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_17_AGENT
            if (r7 == 0) goto Lc0
            java.io.File r7 = ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_17_AGENT
            boolean r7 = r7.isFile()
            if (r7 == 0) goto Lc0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "-javaagent:"
            r7.<init>(r8)
            java.io.File r8 = ca.dnamobile.javalauncher.utils.path.LibPath.CACIO_17_AGENT
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        Lc0:
            java.lang.String r7 = "--add-exports=java.desktop/java.awt=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/java.awt.peer=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/sun.awt.image=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/sun.java2d=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/java.awt.dnd.peer=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/sun.awt=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/sun.awt.event=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/sun.awt.datatransfer=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.desktop/sun.font=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-exports=java.base/sun.security.action=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-opens=java.base/java.util=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-opens=java.desktop/java.awt=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-opens=java.desktop/sun.font=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-opens=java.desktop/sun.java2d=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-opens=java.base/java.lang.reflect=ALL-UNNAMED"
            r0.add(r7)
            java.lang.String r7 = "--add-opens=java.base/java.net=ALL-UNNAMED"
            r0.add(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "-Xbootclasspath/a:"
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        L122:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Enabled Cacio AWT backend from "
            r7.<init>(r8)
            java.lang.String r8 = r1.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r7)
            return r0
    }

    private java.lang.String buildClassPath(org.json.JSONObject r10, java.io.File r11, java.io.File r12, boolean r13, java.lang.String r14) throws java.lang.Exception {
            r9 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9.addDroidBridgeWebRtcBridgeClasspathFirst(r0)
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda5 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda5
            r1.<init>()
            java.io.File[] r12 = r12.listFiles(r1)
            r1 = 0
            if (r12 == 0) goto L2c
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda6 r2 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda6
            r2.<init>()
            java.util.Arrays.sort(r12, r2)
            int r2 = r12.length
            r3 = r1
        L1e:
            if (r3 >= r2) goto L2c
            r4 = r12[r3]
            java.lang.String r5 = r4.getAbsolutePath()
            r0.put(r5, r4)
            int r3 = r3 + 1
            goto L1e
        L2c:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.lang.String r2 = "libraries"
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            java.lang.String r3 = "JavaLaunchBuilder"
            if (r2 == 0) goto L13d
        L3b:
            int r4 = r2.length()
            if (r1 >= r4) goto L13d
            org.json.JSONObject r4 = r2.optJSONObject(r1)
            if (r4 == 0) goto L139
            boolean r5 = r9.isLibraryAllowed(r4)
            if (r5 != 0) goto L4f
            goto L139
        L4f:
            java.lang.String r5 = "name"
            java.lang.String r6 = ""
            java.lang.String r5 = r4.optString(r5, r6)
            boolean r6 = r9.isSkippedDesktopNativeLibrary(r5)
            if (r6 == 0) goto L5f
            goto L139
        L5f:
            boolean r6 = r9.isSkippedDesktopWebRtcNativeLibrary(r5)
            if (r6 == 0) goto L79
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Skipping desktop WebRTC native library on Android classpath: "
            r4.<init>(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r4)
            goto L139
        L79:
            java.lang.String r6 = r9.resolveLibraryArtifactPath(r4)
            if (r6 == 0) goto L139
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L87
            goto L139
        L87:
            java.lang.String r7 = ".aar"
            boolean r7 = r6.endsWith(r7)
            if (r7 == 0) goto La3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Skipping native AAR on classpath: "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r4)
            goto L139
        La3:
            if (r13 == 0) goto Lbf
            boolean r5 = r9.isForgeMinecraftClientArtifact(r5, r6)
            if (r5 == 0) goto Lbf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Skipping Forge Minecraft client artifact on classpath: "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r4)
            goto L139
        Lbf:
            java.io.File r5 = new java.io.File
            java.io.File r7 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            r5.<init>(r7, r6)
            boolean r6 = r9.ensureLibraryJarForLaunch(r4, r6, r5)
            if (r6 == 0) goto L123
            java.lang.String r4 = r9.getLibraryMergeKey(r4)
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L11b
            java.lang.String r6 = r5.getAbsolutePath()
            java.lang.Object r6 = r12.put(r4, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L11b
            java.lang.String r7 = r5.getAbsolutePath()
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L11b
            r0.remove(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Replacing duplicate Maven library on classpath: "
            r7.<init>(r8)
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.String r7 = " old="
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = " new="
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = r5.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r4)
        L11b:
            java.lang.String r4 = r5.getAbsolutePath()
            r0.put(r4, r5)
            goto L139
        L123:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Skipping missing library on classpath: "
            r4.<init>(r6)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r4)
        L139:
            int r1 = r1 + 1
            goto L3b
        L13d:
            r9.addCriticalClasspathLibrariesIfNeeded(r0, r12, r14)
            if (r13 == 0) goto L15f
            boolean r10 = r9.shouldSkipInheritedMinecraftClientJarForForge(r10, r14)
            if (r10 == 0) goto L15f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Skipping vanilla/inherited Minecraft client jar on modern Forge/NeoForge classpath: "
            r10.<init>(r12)
            java.lang.String r11 = r11.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r10)
            goto L17e
        L15f:
            java.lang.String r10 = r11.getAbsolutePath()
            r0.put(r10, r11)
            if (r13 == 0) goto L17e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Keeping vanilla/inherited Minecraft client jar on legacy Forge classpath: "
            r10.<init>(r12)
            java.lang.String r11 = r11.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r10)
        L17e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.Collection r11 = r0.values()
            java.util.Iterator r11 = r11.iterator()
        L18b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1aa
            java.lang.Object r12 = r11.next()
            java.io.File r12 = (java.io.File) r12
            int r13 = r10.length()
            if (r13 <= 0) goto L1a2
            r13 = 58
            r10.append(r13)
        L1a2:
            java.lang.String r12 = r12.getAbsolutePath()
            r10.append(r12)
            goto L18b
        L1aa:
            java.lang.String r10 = r10.toString()
            return r10
    }

    private java.util.ArrayList<java.lang.String> buildGameArgs(org.json.JSONObject r4, java.util.Map<java.lang.String, java.lang.String> r5) throws java.lang.Exception {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "arguments"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            if (r1 == 0) goto L1c
            java.lang.String r2 = "game"
            org.json.JSONArray r1 = r1.optJSONArray(r2)
            if (r1 == 0) goto L1c
            r3.addArgumentArray(r0, r1, r5)
            r3.sanitizeAndRepairGameArgs(r0, r5)
            return r0
        L1c:
            java.lang.String r1 = "minecraftArguments"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.optString(r1, r2)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L54
            java.util.List r4 = r3.splitLegacyArguments(r4)
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L32
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = r3.replaceTokens(r1, r5)
            r0.add(r1)
            goto L32
        L54:
            r3.sanitizeAndRepairGameArgs(r0, r5)
            return r0
    }

    private java.lang.String buildJarClassPath(java.io.File r6) {
            r5 = this;
            java.lang.String r0 = ""
            if (r6 == 0) goto L75
            boolean r1 = r6.isDirectory()
            if (r1 != 0) goto Lb
            goto L75
        Lb:
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda3
            r1.<init>()
            java.io.File[] r6 = r6.listFiles(r1)
            if (r6 == 0) goto L75
            int r1 = r6.length
            if (r1 != 0) goto L1a
            goto L75
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "ResConfHack.jar"
            r5.addNamedJarFirst(r0, r6, r1)
            java.lang.String r1 = "cacio-androidnw-1.10-SNAPSHOT.jar"
            r5.addNamedJarFirst(r0, r6, r1)
            java.lang.String r1 = "cacio-shared-1.10-SNAPSHOT.jar"
            r5.addNamedJarFirst(r0, r6, r1)
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda4 r1 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda4
            r1.<init>()
            java.util.Arrays.sort(r6, r1)
            int r1 = r6.length
            r2 = 0
        L38:
            if (r2 >= r1) goto L48
            r3 = r6[r2]
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L45
            r0.add(r3)
        L45:
            int r2 = r2 + 1
            goto L38
        L48:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            int r2 = r6.length()
            if (r2 <= 0) goto L68
            r2 = 58
            r6.append(r2)
        L68:
            java.lang.String r1 = r1.getAbsolutePath()
            r6.append(r1)
            goto L51
        L70:
            java.lang.String r6 = r6.toString()
            return r6
        L75:
            return r0
    }

    private java.lang.String buildJnaNativePath() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r3 = "natives"
            r1.<init>(r2, r3)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r5.versionId
            r2.<init>(r1, r3)
            java.lang.String r3 = "libjnidispatch.so"
            r5.addPathIfContains(r0, r2, r3)
            java.lang.String r2 = r5.versionId
            java.lang.String r2 = r5.extractMinecraftIdFromLoaderVersion(r2)
            java.lang.String r4 = r5.versionId
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L30
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r2)
            r5.addPathIfContains(r0, r4, r3)
        L30:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.util.ArrayList<java.lang.String> buildJvmArgs(java.io.File r20, java.io.File r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, org.json.JSONObject r24, java.io.File r25, ca.dnamobile.javalauncher.renderer.RendererInterface r26) throws java.lang.Exception {
            r19 = this;
            r6 = r19
            r7 = r20
            r0 = r24
            r8 = r25
            r9 = r26
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r6.addCustomSkinAuthlibInjectorIfNeeded(r10)
            int r1 = r19.resolveLaunchWidth()
            int r2 = r19.resolveLaunchHeight()
            boolean r11 = r6.shouldEnableLegacyAwt(r0)
            if (r11 == 0) goto L24
            int r1 = r6.resolveBridgeWindowWidth(r1)
        L24:
            if (r11 == 0) goto L2a
            int r2 = r6.resolveBridgeWindowHeight(r2)
        L2a:
            if (r11 == 0) goto L31
            if (r1 >= r2) goto L31
            r13 = r1
            r12 = r2
            goto L33
        L31:
            r12 = r1
            r13 = r2
        L33:
            java.lang.String r14 = "JavaLaunchBuilder"
            if (r11 == 0) goto L90
            java.util.List r1 = r6.buildCacioJvmArgs(r7, r12, r13)
            r10.addAll(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Enabled legacy LWJGL2/AWT sizing: requested="
            r1.<init>(r2)
            int r2 = r6.width
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "x"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r3 = r6.height
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " scale="
            java.lang.StringBuilder r1 = r1.append(r3)
            int r3 = r19.getResolutionScalePercentSafe()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = "% cacio="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r3 = " glfwstub="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r14, r1)
        L90:
            r1 = r23
            r6.addMojangJvmArguments(r10, r0, r1)
            r6.addLegacyBetaJvmArgs(r10, r0)
            r6.removeClasspathArgs(r10)
            r6.purgeManagedArgs(r10)
            r6.addForgeModuleWorkaroundsIfNeeded(r10, r7, r0)
            android.content.Context r1 = r6.context
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r15 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.discoverForReplayMod(r1, r8)
            boolean r16 = r6.isLegacyForgeRuntimeProfile(r7, r0)
            java.lang.String r5 = r19.buildJnaNativePath()
            android.content.Context r0 = r6.context
            java.lang.String r4 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.buildJnaLibraryPath(r0, r8, r5)
            boolean r3 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.hasControllable(r25)
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r3
            r3 = r4
            r17 = r14
            r14 = r4
            r4 = r26
            r18 = r13
            r13 = r5
            r5 = r15
            java.lang.String r0 = r0.buildNativeLibraryPath(r1, r2, r3, r4, r5)
            java.lang.String r1 = r19.buildBootLibraryPath(r20)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r4 = "resolv.conf"
            r2.<init>(r3, r4)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Djava.home="
            r3.<init>(r4)
            java.lang.String r4 = r20.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Djava.io.tmpdir="
            r3.<init>(r4)
            java.io.File r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Duser.home="
            r3.<init>(r4)
            if (r16 == 0) goto L11b
            java.lang.String r4 = r6.resolveLegacyLauncherHome(r8)
            goto L11f
        L11b:
            java.lang.String r4 = r25.getAbsolutePath()
        L11f:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Duser.language="
            r3.<init>(r4)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getLanguage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Duser.timezone="
            r3.<init>(r4)
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r4.getID()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.String r3 = "-Dos.name=Linux"
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Dos.version=Android-"
            r3.<init>(r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Dpojav.path.minecraft="
            r3.<init>(r4)
            if (r16 == 0) goto L18c
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r4.<init>(r5)
            java.lang.String r4 = r4.getAbsolutePath()
            goto L190
        L18c:
            java.lang.String r4 = r25.getAbsolutePath()
        L190:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Dpojav.path.private.account="
            r3.<init>(r4)
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_ACCOUNT_NEW
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "-Djava.library.path="
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            if (r11 == 0) goto L1d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "-Dsun.boot.library.path="
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
        L1d5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dorg.lwjgl.librarypath="
            r0.<init>(r1)
            java.lang.String r1 = r21.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dorg.lwjgl.system.SharedLibraryExtractPath="
            r0.<init>(r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Djna.tmpdir="
            r0.<init>(r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            r6.addJnaAndroidWorkarounds(r10, r13, r14, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dio.netty.native.workdir="
            r0.<init>(r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.String r0 = r6.resolveRendererOpenGlLibrary(r9)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L252
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "-Dorg.lwjgl.opengl.libname="
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
        L252:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dorg.lwjgl.freetype.libname="
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r4 = "libfreetype.so"
            r1.<init>(r3, r4)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dglfwstub.windowWidth="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dglfwstub.windowHeight="
            r0.<init>(r1)
            r1 = r18
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dglfwstub.initEgl="
            r0.<init>(r1)
            if (r11 != 0) goto L2a8
            boolean r1 = r6.shouldGlfwStubInitEgl(r9)
            if (r1 == 0) goto L2a8
            r1 = 1
            goto L2a9
        L2a8:
            r1 = 0
        L2a9:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dext.net.resolvPath="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.String r0 = "-Dlog4j2.formatMsgNoLookups=true"
            r10.add(r0)
            if (r16 == 0) goto L2d0
            r6.addLegacyForgeLog4jPatchArg(r10)
        L2d0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dnet.minecraft.clientmodname="
            r0.<init>(r1)
            java.lang.String r1 = r6.getClientModNameForRenderer(r9)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.String r0 = "-Dfml.earlyprogresswindow=false"
            r10.add(r0)
            java.lang.String r0 = "-Dloader.disable_forked_guis=true"
            r10.add(r0)
            int r0 = r19.resolveRuntimeMajor(r20)
            r1 = 9
            if (r0 < r1) goto L305
            java.lang.String r0 = "-Djdk.lang.Process.launchMechanism=FORK"
            r6.addJvmArgIfMissing(r10, r0)
            java.lang.String r0 = "Applied jdk.lang.Process.launchMechanism=FORK for Android ProcessBuilder compatibility."
            r1 = r17
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
            goto L307
        L305:
            r1 = r17
        L307:
            java.lang.String r0 = "-Dsodium.checks.issue2561=false"
            r10.add(r0)
            r6.addReplayModFFmpegJvmArgs(r10, r15)
            r0 = r20
            r6.addMioLibPatcherIfAvailable(r10, r0)
            android.content.Context r0 = r6.context
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r0)
            if (r16 == 0) goto L320
            int r0 = r6.resolveLegacyForgeMaxHeapMb(r0)
        L320:
            if (r16 == 0) goto L324
            r2 = r0
            goto L328
        L324:
            int r2 = resolveStartHeapMb(r0)
        L328:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Using allocated memory: Xms="
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = " MB, Xmx="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " MB"
            java.lang.StringBuilder r3 = r3.append(r4)
            if (r16 == 0) goto L348
            java.lang.String r4 = " (legacy Forge Reborn parity profile)"
            goto L34a
        L348:
            java.lang.String r4 = ""
        L34a:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "-XX:ActiveProcessorCount="
            r1.<init>(r3)
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r10.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "-Xms"
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "M"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r10.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "-Xmx"
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.add(r0)
            java.lang.String r0 = "-cp"
            r10.add(r0)
            r0 = r22
            r10.add(r0)
            return r10
    }

    private java.lang.String buildNativeLibraryPath(java.io.File r5, java.io.File r6, java.lang.String r7, ca.dnamobile.javalauncher.renderer.RendererInterface r8, ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result r9) {
            r4 = this;
            java.io.File r5 = r4.resolveRuntimeLibDir(r5)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "server"
            r0.<init>(r5, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "client"
            r1.<init>(r5, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "libjvm.so"
            r2.<init>(r0, r3)
            boolean r2 = r2.isFile()
            if (r2 == 0) goto L20
            goto L21
        L20:
            r0 = r1
        L21:
            java.lang.String[] r1 = android.os.Build.SUPPORTED_64_BIT_ABIS
            if (r1 == 0) goto L2d
            java.lang.String[] r1 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r1 = r1.length
            if (r1 <= 0) goto L2d
            java.lang.String r1 = "lib64"
            goto L2f
        L2d:
            java.lang.String r1 = "lib"
        L2f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4.addPath(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "jli"
            r0.<init>(r5, r3)
            r4.addPath(r2, r0)
            r4.addPath(r2, r5)
            r4.addPath(r2, r6)
            boolean r5 = r9.available
            if (r5 == 0) goto L65
            java.lang.String r5 = r9.libraryPath
            if (r5 == 0) goto L65
            java.lang.String r5 = r9.libraryPath
            java.lang.String r5 = r5.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L65
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r9.libraryPath
            r5.<init>(r6)
            r4.addPath(r2, r5)
        L65:
            r4.addPathList(r2, r7)
            if (r8 == 0) goto L9c
            java.util.List r5 = r8.getLibrarySearchPaths()
            java.util.Iterator r5 = r5.iterator()
        L72:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r5.next()
            java.io.File r6 = (java.io.File) r6
            r4.addPath(r2, r6)
            goto L72
        L82:
            android.content.Context r5 = r4.context
            java.util.List r5 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.getSelectedDriverLibrarySearchPaths(r5, r8)
            java.util.Iterator r5 = r5.iterator()
        L8c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9c
            java.lang.Object r6 = r5.next()
            java.io.File r6 = (java.io.File) r6
            r4.addPath(r2, r6)
            goto L8c
        L9c:
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "/system/"
            java.lang.String r6 = r6.concat(r1)
            r5.<init>(r6)
            r4.addPath(r2, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "/vendor/"
            java.lang.String r7 = r6.concat(r1)
            r5.<init>(r7)
            r4.addPath(r2, r5)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.StringBuilder r6 = r7.append(r1)
            java.lang.String r7 = "/hw"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            r4.addPath(r2, r5)
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD
            if (r5 == 0) goto Ldc
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD
            r4.addPath(r2, r5)
        Ldc:
            java.io.File r5 = new java.io.File
            java.lang.String r6 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r5.<init>(r6)
            r4.addPath(r2, r5)
            java.lang.String r5 = r2.toString()
            return r5
    }

    private java.util.Map<java.lang.String, java.lang.String> buildReplacements(org.json.JSONObject r17, java.lang.String r18, java.io.File r19, java.lang.String r20, java.io.File r21, java.io.File r22) {
            r16 = this;
            r0 = r16
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            int r2 = r16.resolveLaunchWidth()
            int r3 = r16.resolveLaunchHeight()
            java.lang.String r4 = r16.resolvePlayerName()
            boolean r5 = r16.hasValidMinecraftSession()
            if (r5 != 0) goto L28
            boolean r6 = ca.dnamobile.javalauncher.security.LauncherSecurity.allowsOfflineProfileAuth()
            if (r6 == 0) goto L20
            goto L28
        L20:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "A valid Microsoft/Minecraft account is required to launch Minecraft."
            r1.<init>(r2)
            throw r1
        L28:
            r7 = 0
            if (r5 != 0) goto L33
            boolean r8 = r0.isCustomSkinEnabledForLaunch(r4)
            if (r8 == 0) goto L33
            r8 = 1
            goto L34
        L33:
            r8 = r7
        L34:
            if (r8 == 0) goto L3b
            ca.dnamobile.javalauncher.skin.OfflineSkinProfile r9 = r0.resolveOfflineSkinProfile(r4)
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r9 == 0) goto L49
            boolean r10 = r9.enabled
            if (r10 == 0) goto L49
            java.lang.String r9 = r9.uniqueUuid
            java.lang.String r9 = stripUuidDashes(r9)
            goto L58
        L49:
            if (r5 == 0) goto L54
            ca.dnamobile.javalauncher.data.AccountStore$Account r9 = r0.account
            java.lang.String r9 = r9.minecraftUuid
            java.lang.String r9 = stripUuidDashes(r9)
            goto L58
        L54:
            java.lang.String r9 = r0.createOfflineUuid(r4)
        L58:
            java.lang.String r10 = "0"
            if (r5 == 0) goto L61
            ca.dnamobile.javalauncher.data.AccountStore$Account r11 = r0.account
            java.lang.String r11 = r11.minecraftAccessToken
            goto L62
        L61:
            r11 = r10
        L62:
            java.lang.String r12 = ""
            if (r5 == 0) goto L75
            ca.dnamobile.javalauncher.data.AccountStore$Account r13 = r0.account
            java.lang.String r13 = r13.xuid
            boolean r13 = isNullOrBlank(r13)
            if (r13 != 0) goto L75
            ca.dnamobile.javalauncher.data.AccountStore$Account r13 = r0.account
            java.lang.String r13 = r13.xuid
            goto L76
        L75:
            r13 = r12
        L76:
            if (r5 == 0) goto L7b
            java.lang.String r14 = "msa"
            goto L7d
        L7b:
            java.lang.String r14 = "legacy"
        L7d:
            java.lang.String r15 = "${auth_player_name}"
            r1.put(r15, r4)
            java.lang.String r15 = "${version_name}"
            java.lang.String r6 = r0.versionId
            r1.put(r15, r6)
            java.lang.String r6 = "${game_directory}"
            java.lang.String r15 = r22.getAbsolutePath()
            r1.put(r6, r15)
            java.io.File r6 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getAssetsDirectory()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r15 = "${assets_root}"
            r1.put(r15, r6)
            java.lang.String r6 = "${game_assets}"
            java.lang.String r15 = r19.getAbsolutePath()
            r1.put(r6, r15)
            java.lang.String r6 = "${assets_index_name}"
            r15 = r18
            r1.put(r6, r15)
            java.lang.String r6 = "${auth_uuid}"
            r1.put(r6, r9)
            java.lang.String r6 = "${auth_access_token}"
            r1.put(r6, r11)
            java.lang.String r6 = "${auth_session}"
            r1.put(r6, r11)
            java.lang.String r6 = "${clientid}"
            r1.put(r6, r10)
            java.lang.String r6 = "${client_id}"
            r1.put(r6, r10)
            java.lang.String r6 = "${auth_xuid}"
            r1.put(r6, r13)
            java.lang.String r6 = "${user_type}"
            r1.put(r6, r14)
            java.lang.String r6 = "${user_properties}"
            java.lang.String r10 = "{}"
            r1.put(r6, r10)
            java.lang.String r6 = "${user_property_map}"
            r1.put(r6, r10)
            java.lang.String r6 = "${profile_properties}"
            r1.put(r6, r10)
            java.lang.String r6 = "${quickPlayPath}"
            r1.put(r6, r12)
            java.lang.String r6 = "${quickPlaySingleplayer}"
            r1.put(r6, r12)
            java.lang.String r6 = "${quickPlayMultiplayer}"
            r1.put(r6, r12)
            java.lang.String r6 = "${quickPlayRealms}"
            r1.put(r6, r12)
            java.lang.String r6 = "type"
            java.lang.String r10 = "release"
            r11 = r17
            java.lang.String r6 = r11.optString(r6, r10)
            java.lang.String r10 = "${version_type}"
            r1.put(r10, r6)
            java.lang.String r6 = "${resolution_width}"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r6, r2)
            java.lang.String r2 = "${resolution_height}"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.put(r2, r3)
            java.lang.String r2 = "${natives_directory}"
            java.lang.String r3 = r21.getAbsolutePath()
            r1.put(r2, r3)
            java.lang.String r2 = "${launcher_name}"
            java.lang.String r3 = "JavaLauncher"
            r1.put(r2, r3)
            java.lang.String r2 = "${launcher_version}"
            java.lang.String r3 = "1.0"
            r1.put(r2, r3)
            java.io.File r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r3 = "${library_directory}"
            r1.put(r3, r2)
            java.lang.String r2 = "${classpath_separator}"
            java.lang.String r3 = ":"
            r1.put(r2, r3)
            java.lang.String r2 = "${classpath}"
            r3 = r20
            r1.put(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Launch account mode="
            r2.<init>(r3)
            if (r8 == 0) goto L156
            java.lang.String r3 = "custom_skin"
            goto L15d
        L156:
            if (r5 == 0) goto L15b
            java.lang.String r3 = "microsoft"
            goto L15d
        L15b:
            java.lang.String r3 = "offline"
        L15d:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " player="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " uuid="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r3 = " userType="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.String r3 = " accountLoaded="
            java.lang.StringBuilder r2 = r2.append(r3)
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r0.account
            if (r3 == 0) goto L18b
            r6 = 1
            goto L18c
        L18b:
            r6 = r7
        L18c:
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            return r1
    }

    private java.util.ArrayList<java.lang.String> collectForgeAsmModuleJars(org.json.JSONObject r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "libraries"
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            if (r6 != 0) goto Le
            return r0
        Le:
            r1 = 0
        Lf:
            int r2 = r6.length()
            if (r1 >= r2) goto L99
            org.json.JSONObject r2 = r6.optJSONObject(r1)
            if (r2 == 0) goto L95
            boolean r3 = r5.isLibraryAllowed(r2)
            if (r3 != 0) goto L23
            goto L95
        L23:
            java.lang.String r3 = "name"
            java.lang.String r4 = ""
            java.lang.String r3 = r2.optString(r3, r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "org.ow2.asm:asm:"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "org.ow2.asm:asm-analysis:"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "org.ow2.asm:asm-commons:"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "org.ow2.asm:asm-tree:"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L59
            java.lang.String r4 = "org.ow2.asm:asm-util:"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L95
        L59:
            java.lang.String r2 = r5.resolveLibraryArtifactPath(r2)
            if (r2 == 0) goto L95
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L66
            goto L95
        L66:
            java.io.File r3 = new java.io.File
            java.io.File r4 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            r3.<init>(r4, r2)
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L7d
            java.lang.String r2 = r3.getAbsolutePath()
            r5.addPathIfMissing(r0, r2)
            goto L95
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Forge ASM module-path dependency is missing: "
            r2.<init>(r4)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
        L95:
            int r1 = r1 + 1
            goto Lf
        L99:
            return r0
    }

    private boolean containsPath(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r2 = r1
        L10:
            if (r2 >= r0) goto L1f
            r3 = r5[r2]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            int r2 = r2 + 1
            goto L10
        L1f:
            return r1
    }

    private void copyFile(java.io.File r4, java.io.File r5) throws java.lang.Exception {
            r3 = this;
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r5.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L2c:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L56
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L4c
        L3a:
            int r1 = r0.read(r5)     // Catch: java.lang.Throwable -> L4c
            if (r1 < 0) goto L45
            r2 = 0
            r4.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L4c
            goto L3a
        L45:
            r4.close()     // Catch: java.lang.Throwable -> L56
            r0.close()
            return
        L4c:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L56
        L55:
            throw r5     // Catch: java.lang.Throwable -> L56
        L56:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r5 = move-exception
            r4.addSuppressed(r5)
        L5f:
            throw r4
    }

    private org.json.JSONObject createMavenLibrary(java.lang.String r5) throws java.lang.Exception {
            r4 = this;
            java.lang.String r0 = r4.artifactToPath(r5)
            if (r0 == 0) goto L44
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L44
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "path"
            r1.put(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "https://libraries.minecraft.net/"
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "url"
            r1.put(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "artifact"
            r0.put(r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "name"
            r1.put(r2, r5)
            java.lang.String r5 = "downloads"
            r1.put(r5, r0)
            return r1
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid Maven library name: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    private java.lang.String createOfflineUuid(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflinePlayer:"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r0)
            java.util.UUID r3 = java.util.UUID.nameUUIDFromBytes(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replace(r0, r1)
            return r3
    }

    private boolean doesRuleApply(org.json.JSONObject r5) {
            r4 = this;
            java.lang.String r0 = "os"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.String r2 = "name"
            java.lang.String r3 = "linux"
            java.lang.String r0 = r0.optString(r2, r3)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L18
            return r1
        L18:
            java.lang.String r0 = "features"
            org.json.JSONObject r5 = r5.optJSONObject(r0)
            if (r5 == 0) goto L3b
            java.util.Iterator r0 = r5.keys()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r5.optBoolean(r2, r1)
            boolean r2 = r4.getFeatureFlag(r2)
            if (r2 == r3) goto L24
            return r1
        L3b:
            r5 = 1
            return r5
    }

    private void downloadLibraryJar(java.lang.String r7, java.io.File r8) throws java.lang.Exception {
            r6 = this;
            java.io.File r0 = r8.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create library directory: "
            r8.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L2c:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".download"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L6e
            boolean r1 = r0.delete()
            if (r1 == 0) goto L55
            goto L6e
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to remove stale temp download: "
            r8.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L6e:
            java.net.URL r1 = new java.net.URL
            r1.<init>(r7)
            java.net.URLConnection r1 = r1.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setConnectTimeout(r2)
            r2 = 30000(0x7530, float:4.2039E-41)
            r1.setReadTimeout(r2)
            r2 = 1
            r1.setInstanceFollowRedirects(r2)
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "JavaLauncher/1.0"
            r1.setRequestProperty(r2, r3)
            int r2 = r1.getResponseCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto Le6
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 >= r3) goto Le6
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Le1
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> Le1
            r7.<init>(r2)     // Catch: java.lang.Throwable -> Le1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Lcd
        Lac:
            int r4 = r7.read(r3)     // Catch: java.lang.Throwable -> Lcd
            if (r4 < 0) goto Lb7
            r5 = 0
            r2.write(r3, r5, r4)     // Catch: java.lang.Throwable -> Lcd
            goto Lac
        Lb7:
            r2.close()     // Catch: java.lang.Throwable -> Ld7
            r7.close()     // Catch: java.lang.Throwable -> Le1
            r1.disconnect()
            boolean r7 = r0.renameTo(r8)
            if (r7 != 0) goto Lcc
            r6.copyFile(r0, r8)
            r0.delete()
        Lcc:
            return
        Lcd:
            r8 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Ld2
            goto Ld6
        Ld2:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> Ld7
        Ld6:
            throw r8     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> Ldc
            goto Le0
        Ldc:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> Le1
        Le0:
            throw r8     // Catch: java.lang.Throwable -> Le1
        Le1:
            r7 = move-exception
            r1.disconnect()
            throw r7
        Le6:
            r1.disconnect()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " while downloading "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    private org.json.JSONObject ensureCriticalMinecraftLibraries(org.json.JSONObject r4, java.lang.String r5) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = "libraries"
            org.json.JSONArray r1 = r4.optJSONArray(r0)
            if (r1 != 0) goto L10
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r4.put(r0, r1)
        L10:
            boolean r0 = r3.requiresJtracyLibrary(r5)
            if (r0 == 0) goto L4d
            java.lang.String r0 = "com.mojang"
            java.lang.String r2 = "jtracy"
            boolean r0 = r3.hasMavenLibrary(r1, r0, r2)
            if (r0 != 0) goto L4d
            java.lang.String r0 = "com.mojang:jtracy:1.0.29"
            org.json.JSONObject r0 = r3.createMavenLibrary(r0)
            r1.put(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Added missing critical Mojang library fallback: "
            r1.<init>(r2)
            java.lang.String r2 = "name"
            java.lang.String r0 = r0.optString(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " for Minecraft "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)
        L4d:
            return r4
    }

    private static void ensureDirectory(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L26
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Path exists but is not a directory: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L26:
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L4c
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L33
            goto L4c
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create directory: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L4c:
            return
    }

    private boolean ensureLibraryJarForLaunch(org.json.JSONObject r8, java.lang.String r9, java.io.File r10) {
            r7 = this;
            java.lang.String r0 = "Downloaded library SHA-1 mismatch for "
            java.lang.String r1 = "Downloaded missing launch library: "
            boolean r2 = r10.isFile()
            if (r2 == 0) goto Lc
            r8 = 1
            return r8
        Lc:
            java.lang.String r2 = "name"
            java.lang.String r3 = ""
            java.lang.String r2 = r8.optString(r2, r3)
            java.lang.String r4 = "downloads"
            org.json.JSONObject r8 = r8.optJSONObject(r4)
            if (r8 == 0) goto L41
            java.lang.String r4 = "artifact"
            org.json.JSONObject r8 = r8.optJSONObject(r4)
            if (r8 == 0) goto L41
            java.lang.String r4 = "url"
            java.lang.String r4 = r8.optString(r4, r3)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = "sha1"
            java.lang.String r8 = r8.optString(r5, r3)
            java.lang.String r8 = r8.trim()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r8.toLowerCase(r3)
            r8 = r3
            r3 = r4
            goto L42
        L41:
            r8 = r3
        L42:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "https://libraries.minecraft.net/"
            r3.<init>(r4)
            java.lang.StringBuilder r9 = r3.append(r9)
            java.lang.String r3 = r9.toString()
        L57:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "Library missing before launch, attempting download: "
            r9.<init>(r4)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r4 = " path="
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.String r4 = r10.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r4 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r9)
            r9 = 0
            r7.downloadLibraryJar(r3, r10)     // Catch: java.lang.Throwable -> Lce
            boolean r5 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lce
            if (r5 != 0) goto Lb5
            java.lang.String r5 = r7.sha1(r10)     // Catch: java.lang.Throwable -> Lce
            boolean r6 = r8.equals(r5)     // Catch: java.lang.Throwable -> Lce
            if (r6 != 0) goto Lb5
            r10.delete()     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r10 = r10.append(r2)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = " expected="
            java.lang.StringBuilder r10 = r10.append(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r8 = r10.append(r8)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r10 = " actual="
            java.lang.StringBuilder r8 = r8.append(r10)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r8 = r8.append(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lce
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r8)     // Catch: java.lang.Throwable -> Lce
            return r9
        Lb5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r8 = r8.append(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lce
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r8)     // Catch: java.lang.Throwable -> Lce
            boolean r8 = r10.isFile()     // Catch: java.lang.Throwable -> Lce
            return r8
        Lce:
            r8 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to download missing launch library: "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r0 = " from "
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.String r10 = r10.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r10, r8)
            return r9
    }

    private void ensureOptionHasValue(java.util.ArrayList<java.lang.String> r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            if (r6 == 0) goto L58
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L58
        Ld:
            r0 = 0
        Le:
            int r1 = r4.size()
            if (r0 >= r1) goto L58
            java.lang.Object r1 = r4.get(r0)
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L21
            int r0 = r0 + 1
            goto Le
        L21:
            int r0 = r0 + 1
            int r1 = r4.size()
            if (r0 >= r1) goto L37
            java.lang.Object r1 = r4.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "--"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L58
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Repairing missing launch argument value for "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = " -> "
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
            r4.add(r0, r6)
        L58:
            return
    }

    private void ensureVirtualAssetsIfNeeded(java.lang.String r13, java.io.File r14) throws java.lang.Exception {
            r12 = this;
            boolean r0 = r14.exists()
            if (r0 != 0) goto L26
            boolean r0 = r14.mkdirs()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create virtual assets directory: "
            r0.<init>(r1)
            java.lang.String r14 = r14.getAbsolutePath()
            java.lang.StringBuilder r14 = r0.append(r14)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L26:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".java_launcher_complete"
            r0.<init>(r14, r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L34
            return
        L34:
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getAssetsDirectory()
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "indexes/"
            r3.<init>(r4)
            java.lang.StringBuilder r13 = r3.append(r13)
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r13 = r13.append(r3)
            java.lang.String r13 = r13.toString()
            r2.<init>(r1, r13)
            boolean r13 = r2.isFile()
            java.lang.String r3 = "JavaLaunchBuilder"
            if (r13 != 0) goto L71
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Legacy virtual asset index missing: "
            r13.<init>(r14)
            java.lang.String r14 = r2.getAbsolutePath()
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r13)
            return
        L71:
            org.json.JSONObject r13 = new org.json.JSONObject
            java.lang.String r2 = r12.readFile(r2)
            r13.<init>(r2)
            java.lang.String r2 = "objects"
            org.json.JSONObject r13 = r13.optJSONObject(r2)
            if (r13 != 0) goto L83
            return
        L83:
            java.util.Iterator r2 = r13.keys()
            r4 = 0
            r5 = r4
        L89:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Le6
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            org.json.JSONObject r7 = r13.optJSONObject(r6)
            if (r7 != 0) goto L9c
            goto L89
        L9c:
            java.lang.String r8 = "hash"
            java.lang.String r9 = ""
            java.lang.String r7 = r7.optString(r8, r9)
            int r8 = r7.length()
            r9 = 2
            if (r8 >= r9) goto Lac
            goto L89
        Lac:
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "objects/"
            r10.<init>(r11)
            java.lang.String r9 = r7.substring(r4, r9)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = "/"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r1, r7)
            java.io.File r7 = new java.io.File
            r7.<init>(r14, r6)
            boolean r6 = r8.isFile()
            if (r6 == 0) goto L89
            boolean r6 = r7.isFile()
            if (r6 == 0) goto Le0
            goto L89
        Le0:
            r12.copyFile(r8, r7)
            int r5 = r5 + 1
            goto L89
        Le6:
            java.io.FileOutputStream r13 = new java.io.FileOutputStream
            r13.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r0.<init>()     // Catch: java.lang.Throwable -> L131
            java.lang.String r1 = "copied="
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L131
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> L131
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L131
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L131
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L131
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L131
            r13.write(r0)     // Catch: java.lang.Throwable -> L131
            r13.close()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Prepared legacy virtual assets: "
            r13.<init>(r0)
            java.lang.String r14 = r14.getAbsolutePath()
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r14 = " copied="
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r5)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r13)
            return
        L131:
            r14 = move-exception
            r13.close()     // Catch: java.lang.Throwable -> L136
            goto L13a
        L136:
            r13 = move-exception
            r14.addSuppressed(r13)
        L13a:
            throw r14
    }

    private java.lang.String extractMinecraftIdFromLoaderVersion(java.lang.String r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = "fabric-loader-"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L16
            java.lang.String r1 = "quilt-loader-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2a
        L16:
            r0 = 45
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto L2a
            int r0 = r0 + 1
            int r1 = r3.length()
            if (r0 >= r1) goto L2a
            java.lang.String r3 = r3.substring(r0)
        L2a:
            return r3
    }

    private java.io.File findFirstLibraryInPath(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = r6.trim()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = ":"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r2 = 0
        L14:
            if (r2 >= r0) goto L38
            r3 = r6[r2]
            if (r3 == 0) goto L35
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L25
            goto L35
        L25:
            java.io.File r4 = new java.io.File
            java.lang.String r3 = r3.trim()
            r4.<init>(r3, r7)
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L35
            return r4
        L35:
            int r2 = r2 + 1
            goto L14
        L38:
            return r1
    }

    private java.lang.String getClientModNameForRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r1) {
            r0 = this;
            boolean r1 = r0.isMobileGluesRenderer(r1)
            if (r1 == 0) goto L9
            java.lang.String r1 = "ZalithLauncher"
            return r1
        L9:
            java.lang.String r1 = "JavaLauncher"
            return r1
    }

    private boolean getFeatureFlag(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "has_custom_resolution"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La
            r3 = 1
            return r3
        La:
            java.lang.String r0 = "is_demo_user"
            boolean r0 = r0.equals(r3)
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            java.lang.String r0 = "is_quick_play_singleplayer"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1d
            return r1
        L1d:
            java.lang.String r0 = "is_quick_play_multiplayer"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L26
            return r1
        L26:
            java.lang.String r0 = "is_quick_play_realms"
            r0.equals(r3)
            return r1
    }

    private java.lang.String getLibraryMergeKey(org.json.JSONObject r6) {
            r5 = this;
            java.lang.String r0 = "name"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.optString(r0, r1)
            java.lang.String r6 = r6.trim()
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.String r0 = ":"
            java.lang.String[] r1 = r6.split(r0)
            int r2 = r1.length
            r3 = 2
            if (r2 >= r3) goto L1e
            return r6
        L1e:
            r2 = 0
            r2 = r1[r2]
            java.lang.String r2 = r2.trim()
            r3 = 1
            r3 = r1[r3]
            java.lang.String r3 = r3.trim()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L83
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L39
            goto L83
        L39:
            int r6 = r1.length
            r4 = 4
            if (r6 < r4) goto L6e
            r6 = 3
            r4 = r1[r6]
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            r6 = r1[r6]
            java.lang.String r6 = r6.trim()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            return r6
        L6e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
        L83:
            return r6
    }

    private int getResolutionScalePercentSafe() {
            r3 = this;
            r0 = 100
            android.content.Context r1 = r3.context     // Catch: java.lang.Throwable -> L14
            int r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 > 0) goto Lb
            return r0
        Lb:
            int r1 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L14
            r2 = 1
            int r0 = java.lang.Math.max(r2, r1)     // Catch: java.lang.Throwable -> L14
        L14:
            return r0
    }

    private java.util.List<java.lang.String> getRuntimeArchCandidates() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r1 = net.kdt.pojavlaunch.Architecture.archAsString(r1)
            r6.addUnique(r0, r1)
            int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            r3 = 1
            java.lang.String r4 = "arm64"
            java.lang.String r5 = "aarch64"
            if (r2 == r3) goto L73
            boolean r2 = r1.contains(r4)
            if (r2 != 0) goto L73
            boolean r2 = r1.contains(r5)
            if (r2 == 0) goto L28
            goto L73
        L28:
            int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r3 = "arm"
            if (r2 == 0) goto L6a
            boolean r2 = r1.contains(r3)
            if (r2 == 0) goto L37
            goto L6a
        L37:
            int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            r3 = 2
            if (r2 != r3) goto L53
            java.lang.String r1 = "i386"
            r6.addUnique(r0, r1)
            java.lang.String r1 = "i486"
            r6.addUnique(r0, r1)
            java.lang.String r1 = "i586"
            r6.addUnique(r0, r1)
            java.lang.String r1 = "x86"
            r6.addUnique(r0, r1)
            goto L7e
        L53:
            java.lang.String r2 = "x86_64"
            boolean r3 = r1.contains(r2)
            java.lang.String r4 = "amd64"
            if (r3 != 0) goto L63
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L7e
        L63:
            r6.addUnique(r0, r4)
            r6.addUnique(r0, r2)
            goto L7e
        L6a:
            r6.addUnique(r0, r3)
            java.lang.String r1 = "armeabi-v7a"
            r6.addUnique(r0, r1)
            goto L7e
        L73:
            r6.addUnique(r0, r5)
            r6.addUnique(r0, r4)
            java.lang.String r1 = "arm64-v8a"
            r6.addUnique(r0, r1)
        L7e:
            return r0
    }

    private boolean hasMavenLibrary(org.json.JSONArray r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.length()
            if (r1 >= r2) goto L3b
            org.json.JSONObject r2 = r6.optJSONObject(r1)
            if (r2 != 0) goto Lf
            goto L38
        Lf:
            java.lang.String r3 = "name"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.optString(r3, r4)
            java.lang.String r3 = ":"
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 2
            if (r3 >= r4) goto L22
            goto L38
        L22:
            int r3 = r2.length
            r4 = 3
            if (r3 != r4) goto L38
            r3 = r2[r0]
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L38
            r3 = 1
            r2 = r2[r3]
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L38
            return r3
        L38:
            int r1 = r1 + 1
            goto L2
        L3b:
            return r0
    }

    private boolean hasValidMinecraftSession() {
            r1 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r1.account
            if (r0 == 0) goto L2a
            boolean r0 = r0.isMicrosoftAccount()
            if (r0 == 0) goto L2a
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r1.account
            java.lang.String r0 = r0.minecraftAccessToken
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L2a
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r1.account
            java.lang.String r0 = r0.minecraftName
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L2a
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r1.account
            java.lang.String r0 = r0.minecraftUuid
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    private boolean isBetacraftProxyVersion(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "rd-"
            boolean r0 = r10.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L72
            java.lang.String r0 = "classic"
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L72
            java.lang.String r0 = "infdev"
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L72
            java.lang.String r0 = "indev"
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L22
            goto L72
        L22:
            java.lang.String r0 = "^a\\d.*"
            boolean r0 = r10.matches(r0)
            if (r0 != 0) goto L72
            java.lang.String r0 = "^b\\d.*"
            boolean r0 = r10.matches(r0)
            if (r0 == 0) goto L33
            goto L72
        L33:
            java.lang.String r0 = "1."
            boolean r0 = r10.startsWith(r0)
            r2 = 0
            if (r0 == 0) goto L71
            java.lang.String r0 = "[^0-9]+"
            java.lang.String[] r10 = r10.split(r0)
            int r0 = r10.length
            r3 = -1
            r4 = r2
            r5 = r4
            r6 = r3
        L47:
            if (r4 >= r0) goto L67
            r7 = r10[r4]
            if (r7 == 0) goto L64
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L54
            goto L64
        L54:
            if (r5 != 0) goto L5b
            int r6 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L64
            goto L62
        L5b:
            if (r5 != r1) goto L62
            int r3 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L64
            goto L67
        L62:
            int r5 = r5 + 1
        L64:
            int r4 = r4 + 1
            goto L47
        L67:
            if (r6 != r1) goto L6f
            if (r3 < 0) goto L6f
            r10 = 6
            if (r3 >= r10) goto L6f
            goto L70
        L6f:
            r1 = r2
        L70:
            return r1
        L71:
            return r2
        L72:
            return r1
    }

    private boolean isCustomSkinEnabledForLaunch(java.lang.String r2) {
            r1 = this;
            ca.dnamobile.javalauncher.skin.OfflineSkinProfile r2 = r1.resolveOfflineSkinProfile(r2)
            if (r2 == 0) goto L18
            boolean r0 = r2.enabled
            if (r0 == 0) goto L18
            java.io.File r0 = r2.skinFile
            if (r0 == 0) goto L18
            java.io.File r2 = r2.skinFile
            boolean r2 = r2.isFile()
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    private boolean isForgeMinecraftClientArtifact(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r0 = 92
            r1 = 47
            java.lang.String r4 = r4.replace(r0, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "net.minecraft:client:"
            boolean r3 = r3.startsWith(r0)
            if (r3 != 0) goto L27
            java.lang.String r3 = "/net/minecraft/client/"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L25
            goto L27
        L25:
            r3 = 0
            goto L28
        L27:
            r3 = 1
        L28:
            return r3
    }

    private boolean isForgeOrBootstrapVersion(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "id"
            java.lang.String r1 = r6.versionId
            java.lang.String r0 = r7.optString(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "mainClass"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.optString(r1, r2)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.String r3 = "forge"
            boolean r0 = r0.contains(r3)
            r3 = 1
            if (r0 == 0) goto L26
            return r3
        L26:
            java.lang.String r0 = "cpw.mods.bootstraplauncher"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            return r3
        L2f:
            java.lang.String r0 = "net.minecraftforge"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L38
            return r3
        L38:
            java.lang.String r0 = "libraries"
            org.json.JSONArray r7 = r7.optJSONArray(r0)
            r0 = 0
            if (r7 != 0) goto L42
            return r0
        L42:
            r1 = r0
        L43:
            int r4 = r7.length()
            if (r1 >= r4) goto L81
            org.json.JSONObject r4 = r7.optJSONObject(r1)
            if (r4 != 0) goto L50
            goto L7d
        L50:
            java.lang.String r5 = "name"
            java.lang.String r4 = r4.optString(r5, r2)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "net.minecraftforge:forge"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L80
            java.lang.String r5 = "cpw.mods:securejarhandler"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L80
            java.lang.String r5 = "cpw.mods:bootstraplauncher"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L80
            java.lang.String r5 = "cpw.mods:modlauncher"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L7d
            goto L80
        L7d:
            int r1 = r1 + 1
            goto L43
        L80:
            return r3
        L81:
            return r0
    }

    private boolean isGl4esRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getUniqueIdentifier()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r5.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r5.getRendererId()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r5 = r5.getRendererLibrary()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r1)
            java.lang.String r1 = "gl4es"
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L51
            java.lang.String r1 = "opengles2"
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L52
        L51:
            r0 = 1
        L52:
            return r0
    }

    private boolean isJava9ModuleArg(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "--module-path="
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--upgrade-module-path="
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--add-modules="
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--limit-modules="
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--add-opens="
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--add-exports="
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--enable-native-access="
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--illegal-access=permit"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--illegal-access=warn"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--illegal-access=debug"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "--illegal-access=deny"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L59
            goto L5b
        L59:
            r2 = 0
            goto L5c
        L5b:
            r2 = 1
        L5c:
            return r2
    }

    private boolean isJava9ModuleArgWithSeparateValue(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "--module-path"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "-p"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "--upgrade-module-path"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "--add-modules"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "--limit-modules"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "--add-opens"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "--add-exports"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L43
            java.lang.String r0 = "--enable-native-access"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L41
            goto L43
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = 1
        L44:
            return r2
    }

    private boolean isLegacyForgeClasspathProfile(org.json.JSONObject r5, java.lang.String r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.versionId
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = "id"
            java.lang.String r3 = ""
            java.lang.String r2 = r5.optString(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = "mainClass"
            java.lang.String r2 = r5.optString(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = "inheritsFrom"
            java.lang.String r5 = r5.optString(r2, r3)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r0 = r5.contains(r0)
            r1 = 0
            if (r0 != 0) goto L83
            java.lang.String r0 = "net.neoforged"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L5d
            goto L83
        L5d:
            java.lang.String r0 = "launchwrapper"
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 != 0) goto L82
            java.lang.String r0 = "fmltweaker"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L6f
            goto L82
        L6f:
            int[] r5 = r4.parseReleaseVersion(r6)
            if (r5 != 0) goto L76
            return r1
        L76:
            r6 = r5[r1]
            r5 = r5[r2]
            if (r6 != r2) goto L81
            r6 = 16
            if (r5 > r6) goto L81
            r1 = r2
        L81:
            return r1
        L82:
            return r2
        L83:
            return r1
    }

    private boolean isLegacyForgeRuntimeProfile(java.io.File r6, org.json.JSONObject r7) {
            r5 = this;
            int r6 = r5.resolveRuntimeMajor(r6)
            r0 = 9
            r1 = 0
            if (r6 < r0) goto La
            return r1
        La:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r5.versionId
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r2 = "id"
            java.lang.String r3 = ""
            java.lang.String r4 = r7.optString(r2, r3)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r4 = "mainClass"
            java.lang.String r4 = r7.optString(r4, r3)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r4 = "inheritsFrom"
            java.lang.String r4 = r7.optString(r4, r3)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "minecraftArguments"
            java.lang.String r0 = r7.optString(r0, r3)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L9f
            java.lang.String r0 = "net.neoforged"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L6c
            goto L9f
        L6c:
            java.lang.String r0 = "launchwrapper"
            boolean r0 = r6.contains(r0)
            r3 = 1
            if (r0 != 0) goto L9e
            java.lang.String r0 = "fmltweaker"
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L7e
            goto L9e
        L7e:
            boolean r6 = r5.isForgeOrBootstrapVersion(r7)
            if (r6 != 0) goto L85
            return r1
        L85:
            java.lang.String r6 = r5.versionId
            java.lang.String r6 = r7.optString(r2, r6)
            int[] r6 = r5.parseReleaseVersion(r6)
            if (r6 != 0) goto L92
            return r3
        L92:
            r7 = r6[r1]
            if (r7 != r3) goto L9d
            r6 = r6[r3]
            r7 = 16
            if (r6 > r7) goto L9d
            r1 = r3
        L9d:
            return r1
        L9e:
            return r3
        L9f:
            return r1
    }

    private boolean isLibraryAllowed(org.json.JSONObject r8) {
            r7 = this;
            java.lang.String r0 = "rules"
            org.json.JSONArray r8 = r8.optJSONArray(r0)
            if (r8 == 0) goto L44
            int r0 = r8.length()
            if (r0 != 0) goto Lf
            goto L44
        Lf:
            r0 = 0
            r1 = r0
        L11:
            int r2 = r8.length()
            if (r0 >= r2) goto L43
            org.json.JSONObject r2 = r8.optJSONObject(r0)
            if (r2 != 0) goto L1e
            goto L40
        L1e:
            java.lang.String r3 = "action"
            java.lang.String r4 = "allow"
            java.lang.String r3 = r2.optString(r3, r4)
            java.lang.String r5 = "os"
            org.json.JSONObject r2 = r2.optJSONObject(r5)
            if (r2 == 0) goto L3c
            java.lang.String r5 = "name"
            java.lang.String r6 = "linux"
            java.lang.String r2 = r2.optString(r5, r6)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L40
        L3c:
            boolean r1 = r4.equals(r3)
        L40:
            int r0 = r0 + 1
            goto L11
        L43:
            return r1
        L44:
            r8 = 1
            return r8
    }

    private boolean isLtwRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r2.rendererIdentity(r3)
            java.lang.String r1 = "ltw"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L18
            java.lang.String r1 = "libltw.so"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L19
        L18:
            r0 = 1
        L19:
            return r0
    }

    private boolean isMobileGluesRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.getUniqueIdentifier()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r5.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r5.getRendererId()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r5 = r5.getRendererLibrary()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r1)
            java.lang.String r1 = "mobileglues"
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L51
            java.lang.String r1 = "mobile glues"
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L52
        L51:
            r0 = 1
        L52:
            return r0
    }

    private static boolean isNullOrBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private boolean isRulesAllowed(org.json.JSONArray r5) {
            r4 = this;
            if (r5 == 0) goto L2e
            int r0 = r5.length()
            if (r0 != 0) goto L9
            goto L2e
        L9:
            r0 = 0
            r1 = r0
        Lb:
            int r2 = r5.length()
            if (r0 >= r2) goto L2d
            org.json.JSONObject r2 = r5.optJSONObject(r0)
            if (r2 == 0) goto L2a
            boolean r3 = r4.doesRuleApply(r2)
            if (r3 != 0) goto L1e
            goto L2a
        L1e:
            java.lang.String r1 = "action"
            java.lang.String r3 = "allow"
            java.lang.String r1 = r2.optString(r1, r3)
            boolean r1 = r3.equals(r1)
        L2a:
            int r0 = r0 + 1
            goto Lb
        L2d:
            return r1
        L2e:
            r5 = 1
            return r5
    }

    private static boolean isSameLaunchAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r3, ca.dnamobile.javalauncher.data.AccountStore.Account r4) {
            java.lang.String r0 = r3.accountId
            java.lang.String r1 = r4.accountId
            boolean r0 = sameNonBlank(r0, r1)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = r3.minecraftUuid
            java.lang.String r2 = r4.minecraftUuid
            boolean r0 = sameNonBlank(r0, r2)
            if (r0 == 0) goto L17
            return r1
        L17:
            java.lang.String r0 = r3.minecraftName
            java.lang.String r2 = r4.minecraftName
            boolean r0 = sameNonBlank(r0, r2)
            if (r0 == 0) goto L22
            return r1
        L22:
            java.lang.String r3 = safeBestDisplayName(r3)
            java.lang.String r4 = safeBestDisplayName(r4)
            boolean r3 = sameNonBlank(r3, r4)
            if (r3 == 0) goto L31
            return r1
        L31:
            r3 = 0
            return r3
    }

    private boolean isSkippedDesktopNativeLibrary(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "org.lwjgl"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "jinput-platform"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "lwjgl-platform"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "twitch-platform"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L21
            goto L23
        L21:
            r2 = 0
            goto L24
        L23:
            r2 = 1
        L24:
            return r2
    }

    private boolean isSkippedDesktopWebRtcNativeLibrary(java.lang.String r4) {
            r3 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "dev.onvoid.webrtc:webrtc-java:"
            boolean r0 = r4.startsWith(r0)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r2 = 4
            if (r0 >= r2) goto L1b
            return r1
        L1b:
            r0 = 3
            r4 = r4[r0]
            java.lang.String r0 = "linux"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "windows"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "macos"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "osx"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L3f
        L3e:
            r1 = 1
        L3f:
            return r1
    }

    private boolean isVulkanZinkRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r2.rendererIdentity(r3)
            java.lang.String r1 = "vulkan_zink"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L28
            java.lang.String r1 = "vulkan zink"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L28
            java.lang.String r1 = "zink"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L28
            java.lang.String r1 = "osmesa"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L29
        L28:
            r0 = 1
        L29:
            return r0
    }

    private java.lang.String joinPathList(java.util.ArrayList<java.lang.String> r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.length()
            if (r2 <= 0) goto L20
            r2 = 58
            r0.append(r2)
        L20:
            r0.append(r1)
            goto L9
        L24:
            java.lang.String r4 = r0.toString()
            return r4
    }

    static /* synthetic */ boolean lambda$addDroidBridgeWebRtcBridgeClasspathFirst$2(java.io.File r0, java.lang.String r1) {
            if (r1 == 0) goto L12
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r1 = ".jar"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    static /* synthetic */ int lambda$addDroidBridgeWebRtcBridgeClasspathFirst$3(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    static /* synthetic */ boolean lambda$buildClassPath$0(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = ".jar"
            boolean r0 = r1.endsWith(r0)
            return r0
    }

    static /* synthetic */ int lambda$buildClassPath$1(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    static /* synthetic */ boolean lambda$buildJarClassPath$4(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = ".jar"
            boolean r0 = r1.endsWith(r0)
            return r0
    }

    static /* synthetic */ int lambda$buildJarClassPath$5(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    static /* synthetic */ boolean lambda$purgeArg$6(java.lang.String r0, java.lang.String r1) {
            boolean r0 = r1.startsWith(r0)
            return r0
    }

    private static ca.dnamobile.javalauncher.data.AccountStore.Account loadActiveAccountFallback(android.content.Context r2) {
            ca.dnamobile.javalauncher.data.AccountStore r0 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> La
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = r0.load()     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r0 = "JavaLaunchBuilder"
            java.lang.String r1 = "Unable to load active account fallback"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r2)
            r2 = 0
            return r2
    }

    private org.json.JSONObject mergeArguments(org.json.JSONObject r7, org.json.JSONObject r8) throws java.lang.Exception {
            r6 = this;
            if (r7 != 0) goto La
            if (r8 != 0) goto La
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            return r7
        La:
            if (r7 != 0) goto L16
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            return r7
        L16:
            if (r8 != 0) goto L22
            org.json.JSONObject r8 = new org.json.JSONObject
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            return r8
        L22:
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            org.json.JSONArray r1 = r8.names()
            if (r1 == 0) goto L67
            r2 = 0
        L32:
            int r3 = r1.length()
            if (r2 >= r3) goto L67
            java.lang.String r3 = r1.getString(r2)
            java.lang.String r4 = "game"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L55
            java.lang.String r4 = "jvm"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L4d
            goto L55
        L4d:
            java.lang.Object r4 = r8.get(r3)
            r0.put(r3, r4)
            goto L64
        L55:
            org.json.JSONArray r4 = r7.optJSONArray(r3)
            org.json.JSONArray r5 = r8.optJSONArray(r3)
            org.json.JSONArray r4 = r6.mergeArrays(r4, r5)
            r0.put(r3, r4)
        L64:
            int r2 = r2 + 1
            goto L32
        L67:
            return r0
    }

    private org.json.JSONArray mergeArrays(org.json.JSONArray r5, org.json.JSONArray r6) throws java.lang.Exception {
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L19
            r2 = r1
        L9:
            int r3 = r5.length()
            if (r2 >= r3) goto L19
            java.lang.Object r3 = r5.get(r2)
            r0.put(r3)
            int r2 = r2 + 1
            goto L9
        L19:
            if (r6 == 0) goto L2b
        L1b:
            int r5 = r6.length()
            if (r1 >= r5) goto L2b
            java.lang.Object r5 = r6.get(r1)
            r0.put(r5)
            int r1 = r1 + 1
            goto L1b
        L2b:
            return r0
    }

    private org.json.JSONArray mergeLibraries(org.json.JSONArray r8, org.json.JSONArray r9) throws java.lang.Exception {
            r7 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = ":"
            r2 = 0
            if (r8 == 0) goto L43
            r3 = r2
        Lb:
            int r4 = r8.length()
            if (r3 >= r4) goto L43
            org.json.JSONObject r4 = r8.optJSONObject(r3)
            if (r4 != 0) goto L18
            goto L40
        L18:
            java.lang.String r5 = r7.getLibraryMergeKey(r4)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "parent:"
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = r4.toString()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
        L3d:
            r0.put(r5, r4)
        L40:
            int r3 = r3 + 1
            goto Lb
        L43:
            if (r9 == 0) goto Lc4
        L45:
            int r8 = r9.length()
            if (r2 >= r8) goto Lc4
            org.json.JSONObject r8 = r9.optJSONObject(r2)
            if (r8 != 0) goto L52
            goto Lc1
        L52:
            java.lang.String r3 = r7.getLibraryMergeKey(r8)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L77
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "child:"
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = r8.toString()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L77:
            java.lang.Object r4 = r0.put(r3, r8)
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            if (r4 == 0) goto Lc1
            java.lang.String r5 = r4.toString()
            java.lang.String r6 = r8.toString()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lc1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Replacing inherited Maven library: "
            r5.<init>(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = " old="
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = "name"
            java.lang.String r6 = "<unknown>"
            java.lang.String r4 = r4.optString(r5, r6)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " new="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r8 = r8.optString(r5, r6)
            java.lang.StringBuilder r8 = r3.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r3 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r8)
        Lc1:
            int r2 = r2 + 1
            goto L45
        Lc4:
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Collection r9 = r0.values()
            java.util.Iterator r9 = r9.iterator()
        Ld1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Le1
            java.lang.Object r0 = r9.next()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r8.put(r0)
            goto Ld1
        Le1:
            return r8
    }

    private void mergeModulePath(java.util.ArrayList<java.lang.String> r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
        L8:
            int r1 = r5.size()
            java.lang.String r2 = "--module-path"
            if (r0 >= r1) goto L67
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L4d
            java.lang.String r2 = "-p"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L25
            goto L4d
        L25:
            java.lang.String r2 = "--module-path="
            boolean r3 = r1.startsWith(r2)
            if (r3 == 0) goto L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r6 = r4.appendUniquePathEntries(r1, r6)
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.String r6 = r6.toString()
            r5.set(r0, r6)
            return
        L4a:
            int r0 = r0 + 1
            goto L8
        L4d:
            int r0 = r0 + 1
            int r1 = r5.size()
            if (r0 >= r1) goto L63
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = r4.appendUniquePathEntries(r1, r6)
            r5.set(r0, r6)
            goto L66
        L63:
            r5.add(r6)
        L66:
            return
        L67:
            r5.add(r2)
            r5.add(r6)
            return
    }

    private int[] parseReleaseVersion(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "[^0-9]+"
            java.lang.String[] r8 = r8.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Le:
            r4 = 3
            if (r3 >= r1) goto L31
            r5 = r8[r3]
            if (r5 == 0) goto L2e
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L1c
            goto L2e
        L1c:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L27
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L27
            r0.add(r5)     // Catch: java.lang.NumberFormatException -> L27
        L27:
            int r5 = r0.size()
            if (r5 < r4) goto L2e
            goto L31
        L2e:
            int r3 = r3 + 1
            goto Le
        L31:
            int r8 = r0.size()
            r1 = 2
            if (r8 >= r1) goto L3a
            r8 = 0
            return r8
        L3a:
            java.lang.Object r8 = r0.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3 = 1
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r5 = r0.size()
            if (r5 < r4) goto L5f
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
        L5f:
            int[] r8 = new int[]{r8, r3, r2}
            return r8
    }

    private void purgeArg(java.util.ArrayList<java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda2 r0 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder$$ExternalSyntheticLambda2
            r0.<init>(r3)
            r2.removeIf(r0)
            return
    }

    private void purgeJava9ModuleArgs(java.util.ArrayList<java.lang.String> r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L31
            java.lang.Object r1 = r4.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L10
            goto L2e
        L10:
            boolean r2 = r3.isJava9ModuleArgWithSeparateValue(r1)
            if (r2 == 0) goto L23
            r4.remove(r0)
            int r1 = r4.size()
            if (r0 >= r1) goto L2c
            r4.remove(r0)
            goto L2c
        L23:
            boolean r1 = r3.isJava9ModuleArg(r1)
            if (r1 == 0) goto L2e
            r4.remove(r0)
        L2c:
            int r0 = r0 + (-1)
        L2e:
            int r0 = r0 + 1
            goto L1
        L31:
            return
    }

    private void purgeManagedArgs(java.util.ArrayList<java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "-Xms"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Xmx"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-d32"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-d64"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Xint"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-XX:+UseTransparentHugePages"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-XX:+UseLargePagesInMetaspace"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-XX:+UseLargePages"
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Djava.library.path="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Djna.boot.library.path="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Djna.library.path="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Djna.nounpack="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Djna.nosys="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Djna.debug_load="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Dcom.sun.jna.useProtected="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Djna.tmpdir="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Dorg.lwjgl.librarypath="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Dorg.lwjgl.opengl.libname="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Dorg.lwjgl.freetype.libname="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Dorg.lwjgl.system.SharedLibraryExtractPath="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-Dio.netty.native.workdir="
            r1.purgeArg(r2, r0)
            java.lang.String r0 = "-XX:ActiveProcessorCount="
            r1.purgeArg(r2, r0)
            return
    }

    private boolean putIfChanged(java.util.LinkedHashMap<java.lang.String, java.lang.String> r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.trim()
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L14
            r2 = 0
            return r2
        L14:
            r2.put(r3, r4)
            r2 = 1
            return r2
    }

    private java.lang.String readFile(java.io.File r6) throws java.lang.Exception {
            r5 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            long r1 = r6.length()     // Catch: java.lang.Throwable -> L26
            int r6 = (int) r1     // Catch: java.lang.Throwable -> L26
            byte[] r1 = new byte[r6]     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r6) goto L1b
            int r4 = r6 - r3
            int r4 = r0.read(r1, r3, r4)     // Catch: java.lang.Throwable -> L26
            if (r4 >= 0) goto L19
            goto L1b
        L19:
            int r3 = r3 + r4
            goto Le
        L1b:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L26
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L26
            r6.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            r0.close()
            return r6
        L26:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            r6.addSuppressed(r0)
        L2f:
            throw r6
    }

    private java.io.File readLibPathFileField(java.lang.String r3) {
            r2 = this;
            r0 = 0
            java.lang.Class<ca.dnamobile.javalauncher.utils.path.LibPath> r1 = ca.dnamobile.javalauncher.utils.path.LibPath.class
            java.lang.reflect.Field r3 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r3 instanceof java.io.File     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L16
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L2f
            return r3
        L16:
            boolean r1 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2f
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2f:
            return r0
    }

    private java.util.LinkedHashMap<java.lang.String, java.lang.String> readSimplePropertiesFile(java.io.File r8) throws java.lang.Exception {
            r7 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = r8.isFile()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.lang.String r8 = r7.readFile(r8)
            java.lang.String r1 = "\\r?\\n"
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L19:
            if (r3 >= r1) goto L6d
            r4 = r8[r3]
            if (r4 != 0) goto L20
            goto L6a
        L20:
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L6a
            java.lang.String r5 = "#"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L33
            goto L6a
        L33:
            r5 = 61
            int r5 = r4.indexOf(r5)
            r6 = 58
            int r6 = r4.indexOf(r6)
            if (r5 < 0) goto L48
            if (r6 < 0) goto L48
            int r5 = java.lang.Math.min(r5, r6)
            goto L4c
        L48:
            int r5 = java.lang.Math.max(r5, r6)
        L4c:
            if (r5 > 0) goto L4f
            goto L6a
        L4f:
            java.lang.String r6 = r4.substring(r2, r5)
            java.lang.String r6 = r6.trim()
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r4 = r4.trim()
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L6a
            r0.put(r6, r4)
        L6a:
            int r3 = r3 + 1
            goto L19
        L6d:
            return r0
    }

    private org.json.JSONObject readVersionJson(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r4)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r1.<init>(r0, r4)
            boolean r4 = r1.isFile()
            if (r4 == 0) goto L2c
            org.json.JSONObject r4 = new org.json.JSONObject
            java.lang.String r0 = r3.readFile(r1)
            r4.<init>(r0)
            return r4
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing inherited version JSON: "
            r0.<init>(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    private void removeClasspathArgs(java.util.ArrayList<java.lang.String> r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L36
            java.lang.Object r1 = r4.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "-cp"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L25
            java.lang.String r2 = "-classpath"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L25
            java.lang.String r2 = "--class-path"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L33
        L25:
            r4.remove(r0)
            int r1 = r4.size()
            if (r0 >= r1) goto L31
            r4.remove(r0)
        L31:
            int r0 = r0 + (-1)
        L33:
            int r0 = r0 + 1
            goto L1
        L36:
            return
    }

    private java.lang.String rendererIdentity(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.getUniqueIdentifier()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r4.getRendererName()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r4.getRendererId()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r4 = r4.getRendererLibrary()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            return r4
    }

    private java.lang.String replaceTokens(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r2 = this;
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r3 = r3.replace(r1, r0)
            goto L8
        L25:
            return r3
    }

    private boolean requiresJtracyLibrary(java.lang.String r6) {
            r5 = this;
            java.lang.String r6 = r6.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r0 = "^\\d{2}w\\d{2}[a-z].*$"
            boolean r0 = r6.matches(r0)
            r1 = 1
            if (r0 == 0) goto L14
            return r1
        L14:
            java.lang.String r0 = "^\\d{2}\\..*$"
            boolean r0 = r6.matches(r0)
            if (r0 == 0) goto L1d
            return r1
        L1d:
            int[] r6 = r5.parseReleaseVersion(r6)
            r0 = 0
            if (r6 != 0) goto L25
            return r0
        L25:
            r2 = r6[r0]
            r3 = r6[r1]
            r4 = 2
            r6 = r6[r4]
            if (r2 <= r1) goto L2f
            return r1
        L2f:
            if (r2 >= r1) goto L32
            return r0
        L32:
            r2 = 21
            if (r3 <= r2) goto L37
            return r1
        L37:
            if (r3 >= r2) goto L3a
            return r0
        L3a:
            r2 = 3
            if (r6 < r2) goto L3e
            goto L3f
        L3e:
            r1 = r0
        L3f:
            return r1
    }

    private java.lang.String resolveAssetIndexName(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "assetIndex"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            if (r0 == 0) goto L17
            java.lang.String r1 = "id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L17
            return r0
        L17:
            java.lang.String r0 = "assets"
            java.lang.String r1 = "legacy"
            java.lang.String r4 = r4.optString(r0, r1)
            return r4
    }

    private java.io.File resolveAuthlibInjectorJar() {
            r7 = this;
            java.lang.String r0 = "AUTHLIB_INJECTOR"
            java.io.File r0 = r7.readLibPathFileField(r0)
            if (r0 == 0) goto Lf
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            r0 = 6
            java.io.File[] r1 = new java.io.File[r0]
            java.io.File r2 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r4 = "authlib-injector.jar"
            r2.<init>(r3, r4)
            r3 = 0
            r1[r3] = r2
            java.io.File r2 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "authlib-injector/authlib-injector.jar"
            r2.<init>(r5, r6)
            r5 = 1
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "components/authlib-injector.jar"
            r2.<init>(r5, r6)
            r5 = 2
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "components/authlib-injector/authlib-injector.jar"
            r2.<init>(r5, r6)
            r5 = 3
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "authlib_injector.jar"
            r2.<init>(r5, r6)
            r5 = 4
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            r2.<init>(r5, r4)
            r4 = 5
            r1[r4] = r2
        L58:
            if (r3 >= r0) goto L66
            r2 = r1[r3]
            boolean r4 = r2.isFile()
            if (r4 == 0) goto L63
            return r2
        L63:
            int r3 = r3 + 1
            goto L58
        L66:
            r0 = 0
            return r0
    }

    private int resolveBridgeWindowHeight(int r2) {
            r1 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L5
            if (r0 <= 0) goto L5
            return r0
        L5:
            r0 = 1
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    private int resolveBridgeWindowWidth(int r2) {
            r1 = this;
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L5
            if (r0 <= 0) goto L5
            return r0
        L5:
            r0 = 1
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    private java.io.File resolveClientJarFile(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = ".jar"
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.<init>(r1, r4)
            boolean r4 = r0.isFile()
            if (r4 == 0) goto L23
            return r0
        L23:
            java.lang.String r4 = "inheritsFrom"
            java.lang.String r1 = ""
            java.lang.String r4 = r5.optString(r4, r1)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L6b
            java.io.File r5 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r5.<init>(r0, r4)
            boolean r4 = r5.isFile()
            if (r4 == 0) goto L52
            return r5
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing inherited client jar: "
            r0.<init>(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L6b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing client jar: "
            r5.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private java.io.File resolveDroidBridgeWebRtcBridgeDirectory() {
            r6 = this;
            r0 = 4
            java.io.File[] r1 = new java.io.File[r0]
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r4 = "webrtc_bridge"
            r2.<init>(r3, r4)
            r3 = 0
            r1[r3] = r2
            java.io.File r2 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r2.<init>(r5, r4)
            r4 = 1
            r1[r4] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r5 = "components/webrtc_bridge"
            r2.<init>(r4, r5)
            r4 = 2
            r1[r4] = r2
            java.io.File r2 = new java.io.File
            java.io.File r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r2.<init>(r4, r5)
            r4 = 3
            r1[r4] = r2
            r2 = r3
        L30:
            if (r2 >= r0) goto L40
            r4 = r1[r2]
            if (r4 == 0) goto L3d
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L3d
            return r4
        L3d:
            int r2 = r2 + 1
            goto L30
        L40:
            r0 = r1[r3]
            return r0
    }

    private java.lang.String resolveEffectiveMinecraftVersionId(org.json.JSONObject r4, org.json.JSONObject r5) {
            r3 = this;
            java.lang.String r0 = "inheritsFrom"
            java.lang.String r1 = ""
            java.lang.String r2 = r5.optString(r0, r1)
            java.lang.String r4 = r4.optString(r0, r2)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L13
            return r4
        L13:
            java.lang.String r4 = "javaLauncherFlattenedParent"
            java.lang.String r4 = r5.optString(r4, r1)
            java.lang.String r4 = r4.trim()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L31
            android.content.Context r0 = r3.context
            java.lang.String r1 = r3.versionId
            java.lang.String r0 = ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.readFlattenedParentId(r0, r1)
            if (r0 == 0) goto L31
            java.lang.String r4 = r0.trim()
        L31:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L38
            return r4
        L38:
            java.lang.String r4 = "id"
            java.lang.String r0 = r3.versionId
            java.lang.String r4 = r5.optString(r4, r0)
            java.lang.String r5 = "fabric-loader-"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L5c
            r5 = 45
            int r5 = r4.lastIndexOf(r5)
            if (r5 <= 0) goto L5c
            int r5 = r5 + 1
            int r0 = r4.length()
            if (r5 >= r0) goto L5c
            java.lang.String r4 = r4.substring(r5)
        L5c:
            return r4
    }

    private java.io.File resolveGameAssetsDirectory(org.json.JSONObject r5, java.lang.String r6) throws java.lang.Exception {
            r4 = this;
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getAssetsDirectory()
            java.lang.String r1 = "minecraftArguments"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.optString(r1, r2)
            java.lang.String r1 = "${game_assets}"
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L36
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L1d
            java.lang.String r5 = "legacy"
            goto L1e
        L1d:
            r5 = r6
        L1e:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "virtual/"
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r0, r5)
            r4.ensureVirtualAssetsIfNeeded(r6, r1)
            return r1
        L36:
            return r0
    }

    private org.json.JSONObject resolveInheritedVersionJson(org.json.JSONObject r10) throws java.lang.Exception {
            r9 = this;
            java.lang.String r0 = "inheritsFrom"
            java.lang.String r1 = ""
            java.lang.String r0 = r10.optString(r0, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lf
            return r10
        Lf:
            org.json.JSONObject r0 = r9.readVersionJson(r0)
            org.json.JSONObject r0 = r9.resolveInheritedVersionJson(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            org.json.JSONArray r3 = r10.names()
            java.lang.String r4 = "arguments"
            java.lang.String r5 = "libraries"
            if (r3 == 0) goto L4c
            r6 = 0
        L2b:
            int r7 = r3.length()
            if (r6 >= r7) goto L4c
            java.lang.String r7 = r3.getString(r6)
            boolean r8 = r5.equals(r7)
            if (r8 != 0) goto L49
            boolean r8 = r4.equals(r7)
            if (r8 == 0) goto L42
            goto L49
        L42:
            java.lang.Object r8 = r10.get(r7)
            r2.put(r7, r8)
        L49:
            int r6 = r6 + 1
            goto L2b
        L4c:
            org.json.JSONArray r3 = r0.optJSONArray(r5)
            org.json.JSONArray r6 = r10.optJSONArray(r5)
            org.json.JSONArray r3 = r9.mergeLibraries(r3, r6)
            r2.put(r5, r3)
            org.json.JSONObject r3 = r0.optJSONObject(r4)
            org.json.JSONObject r5 = r10.optJSONObject(r4)
            org.json.JSONObject r3 = r9.mergeArguments(r3, r5)
            r2.put(r4, r3)
            java.lang.String r3 = "minecraftArguments"
            boolean r10 = r10.has(r3)
            if (r10 != 0) goto L7f
            boolean r10 = r0.has(r3)
            if (r10 == 0) goto L7f
            java.lang.String r10 = r0.optString(r3, r1)
            r2.put(r3, r10)
        L7f:
            return r2
    }

    private int resolveJavaMajor(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "javaVersion"
            org.json.JSONObject r4 = r4.optJSONObject(r0)
            r0 = 8
            if (r4 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = "majorVersion"
            r2 = 0
            int r1 = r4.optInt(r1, r2)
            if (r1 > 0) goto L1a
            java.lang.String r1 = "version"
            int r1 = r4.optInt(r1, r0)
        L1a:
            int r4 = java.lang.Math.max(r0, r1)
            return r4
    }

    private static ca.dnamobile.javalauncher.data.AccountStore.Account resolveLaunchAccount(android.content.Context r1, ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = loadActiveAccountFallback(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            if (r2 != 0) goto La
            return r1
        La:
            boolean r0 = isSameLaunchAccount(r2, r1)
            if (r0 == 0) goto L30
            boolean r0 = r1.isMicrosoftAccount()
            if (r0 == 0) goto L30
            java.lang.String r0 = r1.minecraftAccessToken
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L30
            java.lang.String r2 = r2.minecraftAccessToken
            java.lang.String r0 = r1.minecraftAccessToken
            boolean r2 = safeEquals(r2, r0)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "JavaLaunchBuilder"
            java.lang.String r0 = "Using refreshed Microsoft account from AccountStore for launch arguments."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r0)
        L2f:
            return r1
        L30:
            return r2
    }

    private int resolveLaunchHeight() {
            r2 = this;
            r0 = 1
            int r1 = r2.height
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private int resolveLaunchWidth() {
            r2 = this;
            r0 = 1
            int r1 = r2.width
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private java.io.File resolveLegacyForgeLog4jPatchFile() {
            r7 = this;
            r0 = 4
            java.io.File[] r1 = new java.io.File[r0]
            java.io.File r2 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r4 = "components/log4j-rce-patch-1.12.xml"
            r2.<init>(r3, r4)
            r3 = 0
            r1[r3] = r2
            java.io.File r2 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r6 = "log4j-rce-patch-1.12.xml"
            r2.<init>(r5, r6)
            r5 = 1
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            r2.<init>(r5, r4)
            r4 = 2
            r1[r4] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            r2.<init>(r4, r6)
            r4 = 3
            r1[r4] = r2
        L2f:
            if (r3 >= r0) goto L3f
            r2 = r1[r3]
            if (r2 == 0) goto L3c
            boolean r4 = r2.isFile()
            if (r4 == 0) goto L3c
            return r2
        L3c:
            int r3 = r3 + 1
            goto L2f
        L3f:
            r0 = 0
            return r0
    }

    private int resolveLegacyForgeMaxHeapMb(int r1) {
            r0 = this;
            r1 = 2048(0x800, float:2.87E-42)
            return r1
    }

    private java.lang.String resolveLegacyLauncherHome(java.io.File r4) {
            r3 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L18
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L18
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            java.lang.String r4 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L18
            return r4
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L37
            java.lang.String r1 = ".minecraft"
            java.lang.String r2 = r0.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L32
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L32
            java.lang.String r4 = r1.getAbsolutePath()
            return r4
        L32:
            java.io.File r0 = r0.getParentFile()
            goto L19
        L37:
            java.lang.String r4 = r4.getAbsolutePath()
            return r4
    }

    private java.lang.String resolveLibraryArtifactPath(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "downloads"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1f
            java.lang.String r2 = "artifact"
            org.json.JSONObject r0 = r0.optJSONObject(r2)
            if (r0 == 0) goto L1f
            java.lang.String r2 = "path"
            java.lang.String r0 = r0.optString(r2, r1)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r0 = "name"
            java.lang.String r4 = r4.optString(r0, r1)
            java.lang.String r4 = r3.artifactToPath(r4)
            return r4
    }

    private java.io.File resolveLwjglComponent(java.lang.String r5) {
            r4 = this;
            boolean r5 = r4.shouldUseModernLwjgl(r5)
            java.lang.String r0 = "lwjgl3.4.1"
            java.lang.String r1 = "lwjgl3.3.3"
            if (r5 == 0) goto Lc
            r5 = r0
            goto Ld
        Lc:
            r5 = r1
        Ld:
            java.io.File r2 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r2.<init>(r3, r5)
            boolean r5 = r2.isDirectory()
            if (r5 == 0) goto L1b
            return r2
        L1b:
            java.io.File r5 = new java.io.File
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r5.<init>(r2, r1)
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L29
            return r5
        L29:
            java.io.File r5 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            r5.<init>(r1, r0)
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L37
            return r5
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No LWJGL component found in "
            r0.<init>(r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    private java.io.File resolveLwjglNativeDir(java.io.File r5) {
            r4 = this;
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r0 = net.kdt.pojavlaunch.Architecture.androidAbiAsString(r0)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "natives/"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r5, r2)
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L23
            return r1
        L23:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "natives/arm64-v8a"
            r1.<init>(r5, r2)
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L31
            return r1
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Missing LWJGL natives for "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " in "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    private ca.dnamobile.javalauncher.skin.OfflineSkinProfile resolveOfflineSkinProfile(java.lang.String r5) {
            r4 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r4.account
            if (r0 == 0) goto L45
            boolean r0 = r0.isOfflineAccount()
            if (r0 == 0) goto L45
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r4.account
            java.lang.String r0 = r0.offlineSkinPath
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L45
            java.io.File r0 = new java.io.File
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r4.account
            java.lang.String r1 = r1.offlineSkinPath
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L45
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r4.account
            java.lang.String r1 = r1.offlineSkinModel
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.fromId(r1)
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = r4.account
            java.lang.String r2 = r2.minecraftUuid
            boolean r2 = isNullOrBlank(r2)
            if (r2 != 0) goto L3a
            ca.dnamobile.javalauncher.data.AccountStore$Account r5 = r4.account
            java.lang.String r5 = r5.minecraftUuid
            goto L3e
        L3a:
            java.lang.String r5 = ca.dnamobile.javalauncher.skin.CustomSkinStore.getOfflineUuidWithSkinModel(r5, r1)
        L3e:
            ca.dnamobile.javalauncher.skin.OfflineSkinProfile r2 = new ca.dnamobile.javalauncher.skin.OfflineSkinProfile
            r3 = 1
            r2.<init>(r5, r0, r1, r3)
            return r2
        L45:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r4.account
            if (r0 == 0) goto L73
            boolean r0 = r0.isOfflineAccount()
            if (r0 == 0) goto L73
            ca.dnamobile.javalauncher.skin.CustomSkinStore r0 = new ca.dnamobile.javalauncher.skin.CustomSkinStore     // Catch: java.lang.Throwable -> L6b
            android.content.Context r1 = r4.context     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            ca.dnamobile.javalauncher.skin.OfflineSkinProfile r5 = r0.buildOfflineProfile(r5)     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r5.enabled     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L73
            java.io.File r0 = r5.skinFile     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L73
            java.io.File r0 = r5.skinFile     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.isFile()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L73
            return r5
        L6b:
            r5 = move-exception
            java.lang.String r0 = "JavaLaunchBuilder"
            java.lang.String r1 = "Unable to check legacy custom skin profile"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r5)
        L73:
            r5 = 0
            return r5
    }

    private java.lang.String resolvePlayerName() {
            r2 = this;
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.account
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.minecraftName
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L15
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.account
            java.lang.String r0 = r0.minecraftName
            java.lang.String r0 = r2.sanitizePlayerName(r0)
            return r0
        L15:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.account
            java.lang.String r0 = r0.displayName
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L28
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.account
            java.lang.String r0 = r0.displayName
            java.lang.String r0 = r2.sanitizePlayerName(r0)
            return r0
        L28:
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.account
            java.lang.String r0 = r0.email
            boolean r0 = isNullOrBlank(r0)
            if (r0 != 0) goto L44
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = r2.account
            java.lang.String r0 = r0.email
            java.lang.String r1 = "@"
            java.lang.String[] r0 = r0.split(r1)
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r2.sanitizePlayerName(r0)
            return r0
        L44:
            java.lang.String r0 = "Player"
            return r0
    }

    private java.lang.String resolveRendererOpenGlLibrary(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r3 = this;
            java.lang.String r0 = "libng_gl4es.so"
            if (r4 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r4.getRendererLibrary()
            if (r1 == 0) goto L6b
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L16
            goto L6b
        L16:
            boolean r0 = r3.isLtwRenderer(r4)
            if (r0 == 0) goto L5d
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r1.trim()
            r0.<init>(r1)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L36
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L36
            java.lang.String r4 = r0.getAbsolutePath()
            return r4
        L36:
            java.util.List r4 = r4.getLibrarySearchPaths()
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r0 = r4.hasNext()
            java.lang.String r1 = "libltw.so"
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r4.next()
            java.io.File r0 = (java.io.File) r0
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L3e
            java.lang.String r4 = r2.getAbsolutePath()
            return r4
        L5c:
            return r1
        L5d:
            java.io.File r4 = new java.io.File
            java.lang.String r0 = r1.trim()
            r4.<init>(r0)
            java.lang.String r4 = r4.getName()
            return r4
        L6b:
            java.lang.String r4 = "JavaLaunchBuilder"
            java.lang.String r1 = "Selected renderer returned an empty OpenGL library, falling back to libng_gl4es.so"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r1)
            return r0
    }

    private java.io.File resolveRuntime(int r1) {
            r0 = this;
            java.io.File r1 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.resolveRuntimeForJava(r1)
            return r1
    }

    private java.io.File resolveRuntimeLibDir(java.io.File r6) {
            r5 = this;
            java.util.List r0 = r5.getRuntimeArchCandidates()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "lib/"
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r6, r1)
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L8
            return r2
        L2f:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib"
            r0.<init>(r6, r1)
            return r0
    }

    private int resolveRuntimeMajor(java.io.File r6) {
            r5 = this;
            java.lang.String r6 = r6.getName()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r0 = "[^0-9]+"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L13:
            if (r1 >= r0) goto L2b
            r3 = r6[r1]
            if (r3 == 0) goto L28
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L20
            goto L28
        L20:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L28
            int r2 = java.lang.Math.max(r2, r3)     // Catch: java.lang.NumberFormatException -> L28
        L28:
            int r1 = r1 + 1
            goto L13
        L2b:
            return r2
    }

    private static int resolveStartHeapMb(int r2) {
            r0 = 512(0x200, float:7.17E-43)
            if (r2 > 0) goto L5
            return r0
        L5:
            int r2 = r2 / 4
            r1 = 768(0x300, float:1.076E-42)
            int r2 = java.lang.Math.max(r0, r2)
            int r2 = java.lang.Math.min(r1, r2)
            return r2
    }

    private static java.lang.String runtimeNameForJava(int r1) {
            r0 = 25
            if (r1 < r0) goto L7
            java.lang.String r1 = "Internal-25"
            return r1
        L7:
            r0 = 21
            if (r1 < r0) goto Le
            java.lang.String r1 = "Internal-21"
            return r1
        Le:
            r0 = 17
            if (r1 < r0) goto L15
            java.lang.String r1 = "Internal-17"
            return r1
        L15:
            java.lang.String r1 = "Internal-8"
            return r1
    }

    private static java.lang.String safeBestDisplayName(ca.dnamobile.javalauncher.data.AccountStore.Account r1) {
            java.lang.String r0 = ""
            if (r1 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r1.getBestDisplayName()     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lc
            r0 = r1
        Lc:
            return r0
    }

    private static boolean safeEquals(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    private void safeWriteSkinLaunchNote(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_LAUNCHER_LOG     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "latestlog.txt"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L35
            java.io.File r1 = r0.getParentFile()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L18
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L18
            r1.mkdirs()     // Catch: java.lang.Throwable -> L35
        L18:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L35
            r2 = 1
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L35
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2b
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L2b
            r1.write(r4)     // Catch: java.lang.Throwable -> L2b
            r1.close()     // Catch: java.lang.Throwable -> L35
            goto L35
        L2b:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L35
        L34:
            throw r4     // Catch: java.lang.Throwable -> L35
        L35:
            return
    }

    private static boolean sameNonBlank(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isNullOrBlank(r1)
            if (r0 != 0) goto L1c
            boolean r0 = isNullOrBlank(r2)
            if (r0 != 0) goto L1c
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = r2.trim()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    private void sanitizeAndRepairGameArgs(java.util.ArrayList<java.lang.String> r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.size()
            if (r0 >= r1) goto L71
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L69
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1a
            goto L69
        L1a:
            java.lang.String r2 = "${"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Removing unresolved launch argument: "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JavaLaunchBuilder"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            r6.remove(r0)
            if (r0 <= 0) goto L6c
            int r1 = r0 + (-1)
            java.lang.Object r3 = r6.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "--"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Removing option for unresolved value: "
            r3.<init>(r4)
            java.lang.Object r4 = r6.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r3)
            r6.remove(r1)
            int r0 = r0 + (-2)
            goto L6e
        L69:
            r6.remove(r0)
        L6c:
            int r0 = r0 + (-1)
        L6e:
            int r0 = r0 + 1
            goto L1
        L71:
            java.lang.String r0 = "${game_directory}"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "--gameDir"
            r5.ensureOptionHasValue(r6, r1, r0)
            java.lang.String r0 = "${game_assets}"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "--assetsDir"
            r5.ensureOptionHasValue(r6, r1, r0)
            java.lang.String r0 = "${assets_index_name}"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "--assetIndex"
            r5.ensureOptionHasValue(r6, r0, r7)
            return
    }

    private java.lang.String sanitizePlayerName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "[^A-Za-z0-9_]"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L11
            java.lang.String r3 = "Player"
            return r3
        L11:
            int r0 = r3.length()
            r1 = 16
            if (r0 <= r1) goto L1e
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
        L1e:
            return r3
    }

    private java.lang.String sha1(java.io.File r7) throws java.lang.Exception {
            r6 = this;
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r7)
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L4b
        Lf:
            int r2 = r1.read(r7)     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            if (r2 < 0) goto L1a
            r0.update(r7, r3, r2)     // Catch: java.lang.Throwable -> L4b
            goto Lf
        L1a:
            r1.close()
            byte[] r7 = r0.digest()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r7.length
        L2a:
            if (r3 >= r1) goto L46
            r2 = r7[r3]
            java.util.Locale r4 = java.util.Locale.ROOT
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "%02x"
            java.lang.String r2 = java.lang.String.format(r4, r5, r2)
            r0.append(r2)
            int r3 = r3 + 1
            goto L2a
        L46:
            java.lang.String r7 = r0.toString()
            return r7
        L4b:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r7.addSuppressed(r0)
        L54:
            throw r7
    }

    private boolean shouldEnableLegacyAwt(org.json.JSONObject r6) {
            r5 = this;
            java.lang.String r0 = r5.versionId
            java.lang.String r1 = "id"
            java.lang.String r0 = r6.optString(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r2 = r0.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L16
        L14:
            java.lang.String r0 = r5.versionId
        L16:
            java.lang.String r0 = r0.trim()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.versionId
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r4 = ""
            java.lang.String r1 = r6.optString(r1, r4)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "mainClass"
            java.lang.String r2 = r6.optString(r2, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "inheritsFrom"
            java.lang.String r2 = r6.optString(r2, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "minecraftArguments"
            java.lang.String r6 = r6.optString(r2, r4)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            java.lang.String r1 = "neoforge"
            boolean r1 = r6.contains(r1)
            r2 = 0
            if (r1 != 0) goto Le2
            java.lang.String r1 = "net.neoforged"
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L81
            goto Le2
        L81:
            java.lang.String r1 = "net.minecraft.launchwrapper.launch"
            boolean r1 = r6.contains(r1)
            r3 = 1
            if (r1 != 0) goto Le1
            java.lang.String r1 = "launchwrapper"
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto Le1
            java.lang.String r1 = "fmltweaker"
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L9b
            goto Le1
        L9b:
            java.lang.String r6 = "rd-"
            boolean r6 = r0.startsWith(r6)
            if (r6 != 0) goto Le1
            java.lang.String r6 = "classic"
            boolean r6 = r0.startsWith(r6)
            if (r6 != 0) goto Le1
            java.lang.String r6 = "infdev"
            boolean r6 = r0.startsWith(r6)
            if (r6 != 0) goto Le1
            java.lang.String r6 = "indev"
            boolean r6 = r0.startsWith(r6)
            if (r6 != 0) goto Le1
            java.lang.String r6 = "a"
            boolean r6 = r0.startsWith(r6)
            if (r6 != 0) goto Le1
            java.lang.String r6 = "b"
            boolean r6 = r0.startsWith(r6)
            if (r6 == 0) goto Lcc
            goto Le1
        Lcc:
            int[] r6 = r5.parseReleaseVersion(r0)
            if (r6 != 0) goto Ld3
            return r2
        Ld3:
            r0 = r6[r2]
            r6 = r6[r3]
            if (r0 != r3) goto Le0
            if (r6 < 0) goto Le0
            r0 = 12
            if (r6 > r0) goto Le0
            r2 = r3
        Le0:
            return r2
        Le1:
            return r3
        Le2:
            return r2
    }

    private boolean shouldEnableModernCacioForRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    private boolean shouldEnableNativeAccessForRuntime(java.io.File r2) {
            r1 = this;
            int r2 = r1.resolveRuntimeMajor(r2)
            r0 = 22
            if (r2 < r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    private boolean shouldGlfwStubInitEgl(ca.dnamobile.javalauncher.renderer.RendererInterface r1) {
            r0 = this;
            boolean r1 = r0.isGl4esRenderer(r1)
            return r1
    }

    private boolean shouldSkipInheritedMinecraftClientJarForForge(org.json.JSONObject r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r0.isLegacyForgeClasspathProfile(r1, r2)
            r1 = r1 ^ 1
            return r1
    }

    private boolean shouldUseModernLwjgl(java.lang.String r6) {
            r5 = this;
            java.lang.String r6 = r6.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r0 = "^\\d{2}w\\d{2}[a-z].*$"
            boolean r0 = r6.matches(r0)
            r1 = 1
            r2 = 26
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L24
            java.lang.String r6 = r6.substring(r4, r3)
            int r6 = java.lang.Integer.parseInt(r6)
            if (r6 < r2) goto L22
            goto L23
        L22:
            r1 = r4
        L23:
            return r1
        L24:
            java.lang.String r0 = "^\\d{2}\\..*$"
            boolean r0 = r6.matches(r0)
            if (r0 == 0) goto L39
            java.lang.String r6 = r6.substring(r4, r3)     // Catch: java.lang.NumberFormatException -> L39
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L39
            if (r6 < r2) goto L37
            goto L38
        L37:
            r1 = r4
        L38:
            return r1
        L39:
            return r4
    }

    private java.util.List<java.lang.String> splitLegacyArguments(java.lang.String r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
        Ld:
            int r5 = r8.length()
            if (r3 >= r5) goto L3d
            char r5 = r8.charAt(r3)
            r6 = 34
            if (r5 != r6) goto L1e
            r4 = r4 ^ 1
            goto L3a
        L1e:
            boolean r6 = java.lang.Character.isWhitespace(r5)
            if (r6 == 0) goto L37
            if (r4 != 0) goto L37
            int r5 = r1.length()
            if (r5 <= 0) goto L3a
            java.lang.String r5 = r1.toString()
            r0.add(r5)
            r1.setLength(r2)
            goto L3a
        L37:
            r1.append(r5)
        L3a:
            int r3 = r3 + 1
            goto Ld
        L3d:
            int r8 = r1.length()
            if (r8 <= 0) goto L4a
            java.lang.String r8 = r1.toString()
            r0.add(r8)
        L4a:
            return r0
    }

    public static void stopActiveOfflineSkinServer() {
            ca.dnamobile.javalauncher.skin.OfflineYggdrasilServer r0 = ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder.activeOfflineSkinServer
            r1 = 0
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder.activeOfflineSkinServer = r1
            if (r0 == 0) goto La
            r0.stop()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    private static java.lang.String stripUuidDashes(java.lang.String r2) {
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r2 = r2.trim()
            return r2
    }

    private void writeDebugLaunchFile(java.io.File r5, java.io.File r6, java.lang.String r7, java.lang.String r8, java.util.List<java.lang.String> r9, java.util.List<java.lang.String> r10) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r0.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "version="
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = r4.versionId     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Leb
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "accountLoaded="
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> Leb
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r4.account     // Catch: java.lang.Throwable -> Leb
            if (r3 == 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Leb
            r1.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "accountType="
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> Leb
            ca.dnamobile.javalauncher.data.AccountStore$Account r3 = r4.account     // Catch: java.lang.Throwable -> Leb
            if (r3 == 0) goto L37
            java.lang.String r3 = r3.accountType     // Catch: java.lang.Throwable -> Leb
            goto L39
        L37:
            java.lang.String r3 = "none"
        L39:
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Leb
            r1.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "hasMinecraftSession="
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> Leb
            boolean r3 = r4.hasValidMinecraftSession()     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Leb
            r1.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "customSkinEnabled="
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r3 = r4.resolvePlayerName()     // Catch: java.lang.Throwable -> Leb
            boolean r3 = r4.isCustomSkinEnabledForLaunch(r3)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Leb
            r1.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "runtime="
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r6 = r1.append(r6)     // Catch: java.lang.Throwable -> Leb
            r6.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = "mainClass="
            java.lang.StringBuilder r6 = r0.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            r6.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = "classpath="
            java.lang.StringBuilder r6 = r0.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r6 = r6.append(r8)     // Catch: java.lang.Throwable -> Leb
            r6.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = "\nJVM ARGS\n"
            r0.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r6 = r9.iterator()     // Catch: java.lang.Throwable -> Leb
        L9a:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r7 = r0.append(r7)     // Catch: java.lang.Throwable -> Leb
            r7.append(r2)     // Catch: java.lang.Throwable -> Leb
            goto L9a
        Lae:
            java.lang.String r6 = "\nGAME ARGS\n"
            r0.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r6 = r10.iterator()     // Catch: java.lang.Throwable -> Leb
        Lb7:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto Lcb
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r7 = r0.append(r7)     // Catch: java.lang.Throwable -> Leb
            r7.append(r2)     // Catch: java.lang.Throwable -> Leb
            goto Lb7
        Lcb:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Leb
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> Le1
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Le1
            byte[] r5 = r5.getBytes(r7)     // Catch: java.lang.Throwable -> Le1
            r6.write(r5)     // Catch: java.lang.Throwable -> Le1
            r6.close()     // Catch: java.lang.Throwable -> Leb
            goto Lf3
        Le1:
            r5 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> Le6
            goto Lea
        Le6:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> Leb
        Lea:
            throw r5     // Catch: java.lang.Throwable -> Leb
        Leb:
            r5 = move-exception
            java.lang.String r6 = "JavaLaunchBuilder"
            java.lang.String r7 = "Failed to write debug launch plan"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r6, r7, r5)
        Lf3:
            return
    }

    private void writeLegacyForgeSplashConfigIfNeeded(java.io.File r6, org.json.JSONObject r7, java.io.File r8) {
            r5 = this;
            java.lang.String r0 = "false"
            java.lang.String r1 = "JavaLaunchBuilder"
            java.lang.String r2 = "Legacy Forge splash already disabled from launch builder: "
            java.lang.String r3 = "Hard-disabled legacy Forge splash from launch builder: "
            java.lang.String r4 = "Unable to create legacy Forge config directory for splash disable: "
            boolean r6 = r5.isLegacyForgeRuntimeProfile(r6, r7)
            if (r6 != 0) goto L11
            return
        L11:
            java.io.File r6 = new java.io.File
            java.lang.String r7 = "config"
            r6.<init>(r8, r7)
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "splash.properties"
            r7.<init>(r6, r8)
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L40
            boolean r8 = r6.mkdirs()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L40
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8e
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r6)     // Catch: java.lang.Throwable -> L8e
            return
        L40:
            java.util.LinkedHashMap r6 = r5.readSimplePropertiesFile(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = "enabled"
            boolean r8 = r5.putIfChanged(r6, r8, r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "rotate"
            boolean r4 = r5.putIfChanged(r6, r4, r0)     // Catch: java.lang.Throwable -> L8e
            r8 = r8 | r4
            java.lang.String r4 = "showMemory"
            boolean r0 = r5.putIfChanged(r6, r4, r0)     // Catch: java.lang.Throwable -> L8e
            r8 = r8 | r0
            if (r8 != 0) goto L76
            boolean r8 = r7.isFile()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L61
            goto L76
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8e
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r6)     // Catch: java.lang.Throwable -> L8e
            goto L94
        L76:
            r5.writeSimplePropertiesFile(r7, r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8e
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r6)     // Catch: java.lang.Throwable -> L8e
            goto L94
        L8e:
            r6 = move-exception
            java.lang.String r7 = "Unable to disable legacy Forge splash from launch builder"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r7, r6)
        L94:
            return
    }

    private void writeSimplePropertiesFile(java.io.File r5, java.util.LinkedHashMap<java.lang.String, java.lang.String> r6) throws java.lang.Exception {
            r4 = this;
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r6.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L39:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
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
            goto L39
        L65:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            r1 = 0
            r6.<init>(r5, r1)
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L7c
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L7c
            r6.write(r5)     // Catch: java.lang.Throwable -> L7c
            r6.close()
            return
        L7c:
            r5 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r6 = move-exception
            r5.addSuppressed(r6)
        L85:
            throw r5
    }

    public ca.dnamobile.javalauncher.launcher.LaunchPlan build() throws java.lang.Exception {
            r20 = this;
            r8 = r20
            java.io.File r0 = r8.gameDirectoryOverride
            if (r0 == 0) goto L10
            android.content.Context r1 = r8.context
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.inferLauncherHomeFromGameDirectory(r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1, r0)
            goto L15
        L10:
            android.content.Context r0 = r8.context
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)
        L15:
            java.lang.String r0 = r8.versionId
            java.io.File r9 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r0)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.versionId
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r9, r1)
            java.io.File r1 = r8.gameDirectoryOverride
            if (r1 == 0) goto L3a
            goto L41
        L3a:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r1.<init>(r2)
        L41:
            r13 = r1
            ensureDirectory(r13)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L11c
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = r8.readFile(r0)
            r1.<init>(r0)
            org.json.JSONObject r0 = r8.resolveInheritedVersionJson(r1)
            java.lang.String r5 = r8.resolveEffectiveMinecraftVersionId(r1, r0)
            org.json.JSONObject r10 = r8.ensureCriticalMinecraftLibraries(r0, r5)
            java.lang.String r0 = r8.versionId
            java.io.File r2 = r8.resolveClientJarFile(r0, r1)
            java.lang.String r0 = "mainClass"
            java.lang.String r1 = "net.minecraft.client.main.Main"
            java.lang.String r12 = r10.optString(r0, r1)
            java.lang.String r6 = r8.resolveAssetIndexName(r10)
            java.io.File r7 = r8.resolveGameAssetsDirectory(r10, r6)
            int r0 = r8.resolveJavaMajor(r10)
            java.io.File r1 = r8.runtimeDirectoryOverride
            if (r1 == 0) goto L83
            java.lang.String r1 = r1.getName()
            goto L87
        L83:
            java.lang.String r1 = runtimeNameForJava(r0)
        L87:
            java.io.File r3 = r8.runtimeDirectoryOverride
            if (r3 == 0) goto L8c
            goto L90
        L8c:
            java.io.File r3 = r8.resolveRuntime(r0)
        L90:
            r14 = r3
            boolean r3 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.isRuntimeInstalledForJava(r1, r14, r0)
            if (r3 == 0) goto Lf9
            java.io.File r0 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.findJavaBinary(r14)
            if (r0 != 0) goto La4
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "bin/java"
            r0.<init>(r14, r1)
        La4:
            r15 = r0
            java.io.File r3 = r8.resolveLwjglComponent(r5)
            java.io.File r16 = r8.resolveLwjglNativeDir(r3)
            java.lang.String r0 = r8.versionId
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.ensureJnaNativesForLaunch(r0, r10)
            boolean r4 = r8.isForgeOrBootstrapVersion(r10)
            r0 = r20
            r1 = r10
            java.lang.String r17 = r0.buildClassPath(r1, r2, r3, r4, r5)
            r2 = r6
            r3 = r7
            r4 = r17
            r5 = r16
            r6 = r13
            java.util.Map r11 = r0.buildReplacements(r1, r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.renderer.RendererInterface r7 = r8.rendererOverride
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r11
            r5 = r10
            java.util.ArrayList r18 = r0.buildJvmArgs(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList r19 = r8.buildGameArgs(r10, r11)
            r8.writeLegacyForgeSplashConfigIfNeeded(r14, r10, r13)
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "java_launcher_last_launch_args.txt"
            r1.<init>(r9, r0)
            r0 = r20
            r2 = r14
            r3 = r12
            r4 = r17
            r5 = r18
            r6 = r19
            r0.writeDebugLaunchFile(r1, r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.launcher.LaunchPlan r0 = new ca.dnamobile.javalauncher.launcher.LaunchPlan
            java.lang.String r11 = r8.versionId
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        Lf9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Selected runtime is not usable for Java "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.describeRuntimeState(r1, r14)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L11c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Missing version JSON: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder setGameDirectory(java.io.File r1) {
            r0 = this;
            r0.gameDirectoryOverride = r1
            return r0
    }

    public ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder setRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r1) {
            r0 = this;
            r0.rendererOverride = r1
            return r0
    }

    public ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder setRuntimeDirectory(java.io.File r1) {
            r0 = this;
            r0.runtimeDirectoryOverride = r1
            return r0
    }
}
