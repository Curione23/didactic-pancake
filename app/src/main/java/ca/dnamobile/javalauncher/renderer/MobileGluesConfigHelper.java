package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class MobileGluesConfigHelper {
    private static final java.lang.String CONFIG_DIR_NAME = "MG";
    private static final java.lang.String CONFIG_FILE_NAME = "config.json";
    private static final java.lang.String LOCAL_LAUNCH_DIR_NAME = "MobileGlues";
    private static final java.lang.String[] MOBILE_GLUES_PACKAGES = null;
    private static final java.lang.String PREFS_NAME = "mobile_glues_config";
    private static final java.lang.String PREF_TREE_URI = "mg_tree_uri";
    private static final java.lang.String TAG = "MobileGluesConfig";

    public static final class SelectionResult {
        public final java.io.File launchConfigDirectory;
        public final java.lang.String message;
        public final boolean success;
        public final android.net.Uri treeUri;

        private SelectionResult(boolean r1, java.lang.String r2, android.net.Uri r3, java.io.File r4) {
                r0 = this;
                r0.<init>()
                r0.success = r1
                r0.message = r2
                r0.treeUri = r3
                r0.launchConfigDirectory = r4
                return
        }

        /* synthetic */ SelectionResult(boolean r1, java.lang.String r2, android.net.Uri r3, java.io.File r4, ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.SelectionResultIA r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class SelectionResultIA {
    }

    static {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "com.fcl.plugin.mobileglues"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "com.fcl.plugin.renderer.mobileglues"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "com.mio.plugin.renderer.mobileglues"
            r0[r1] = r2
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.MOBILE_GLUES_PACKAGES = r0
            return
    }

    private MobileGluesConfigHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addMgPickerHints(android.content.Intent r2) {
            java.lang.String r0 = "android.content.extra.SHOW_ADVANCED"
            r1 = 1
            r2.putExtra(r0, r1)
            java.lang.String r0 = "com.android.externalstorage.documents"
            java.lang.String r1 = "primary:MG"
            android.net.Uri r0 = android.provider.DocumentsContract.buildTreeDocumentUri(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "android.provider.extra.INITIAL_URI"
            r2.putExtra(r1, r0)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    private static void appendKnown(java.lang.StringBuilder r1, org.json.JSONObject r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = r2.has(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "• "
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r4 = " = "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.Object r2 = r2.opt(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 10
            r1.append(r2)
            return
    }

    public static java.io.File applyLaunchEnvironment(android.content.Context r1) throws java.lang.Exception {
            java.io.File r0 = prepareLaunchConfig(r1)
            applyLaunchEnvironment(r1, r0)
            return r0
    }

    public static void applyLaunchEnvironment(android.content.Context r2, java.io.File r3) throws java.lang.Exception {
            boolean r2 = r3.exists()
            if (r2 != 0) goto L2c
            boolean r2 = r3.mkdirs()
            if (r2 != 0) goto L2c
            boolean r2 = r3.isDirectory()
            if (r2 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create MobileGlues launch config folder: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.String r2 = r3.getAbsolutePath()
            r0 = 1
            java.lang.String r1 = "MG_DIR_PATH"
            android.system.Os.setenv(r1, r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Applied MobileGlues MG_DIR_PATH="
            r2.<init>(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = " configExists="
            java.lang.StringBuilder r2 = r2.append(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "config.json"
            r0.<init>(r3, r1)
            boolean r3 = r0.isFile()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MobileGluesConfig"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            return
    }

    public static android.content.Intent buildOpenPluginIntent(android.content.Context r5) {
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String[] r0 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.MOBILE_GLUES_PACKAGES
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            android.content.Intent r3 = r5.getLaunchIntentForPackage(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L18
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r4)     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
            int r2 = r2 + 1
            goto L8
        L1b:
            r5 = 0
            return r5
    }

    public static java.lang.String buildSettingsSummary(android.content.Context r9, ca.dnamobile.javalauncher.renderer.RendererInterface r10) {
            java.lang.String r0 = "Ignore GL errors"
            java.lang.String r1 = "ANGLE"
            java.lang.String r2 = "\nLaunch MG_DIR_PATH: "
            java.lang.String r3 = "Mirrored launch config: "
            java.lang.String r4 = "Direct config: "
            java.lang.String r5 = "Selected MG folder config: "
            boolean r10 = isMobileGluesRenderer(r10)
            if (r10 != 0) goto L15
            java.lang.String r9 = "No external MobileGlues configuration is used by this renderer."
            return r9
        L15:
            android.content.Context r9 = r9.getApplicationContext()
            androidx.documentfile.provider.DocumentFile r10 = findSafConfigFile(r9)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r6 = ""
            if (r10 == 0) goto L45
            java.lang.String r3 = readDocumentFile(r9, r10)     // Catch: java.lang.Throwable -> L1d7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d7
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1d7
            android.net.Uri r5 = r10.getUri()     // Catch: java.lang.Throwable -> L1d7
            if (r5 == 0) goto L38
            android.net.Uri r10 = r10.getUri()     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L1d7
        L38:
            java.lang.String r10 = safe(r6)     // Catch: java.lang.Throwable -> L1d7
            java.lang.StringBuilder r10 = r4.append(r10)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L1d7
            goto L93
        L45:
            boolean r10 = canReadConfigFile()     // Catch: java.lang.Throwable -> L1d7
            if (r10 == 0) goto L69
            java.io.File r10 = getConfigFile()     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r3 = readFile(r10)     // Catch: java.lang.Throwable -> L1d7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d7
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L1d7
            java.io.File r4 = getConfigFile()     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L1d7
            java.lang.StringBuilder r10 = r10.append(r4)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L1d7
            goto L93
        L69:
            java.io.File r10 = getLaunchConfigFile(r9)     // Catch: java.lang.Throwable -> L1d7
            boolean r10 = r10.isFile()     // Catch: java.lang.Throwable -> L1d7
            if (r10 == 0) goto L92
            java.io.File r10 = getLaunchConfigFile(r9)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r10 = readFile(r10)     // Catch: java.lang.Throwable -> L1d7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d7
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1d7
            java.io.File r3 = getLaunchConfigFile(r9)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L1d7
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L1d7
            r3 = r10
            goto L93
        L92:
            r3 = 0
        L93:
            if (r3 != 0) goto Ldc
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "MobileGlues config not found.\nChoose the MG folder at: "
            r10.<init>(r0)
            java.io.File r0 = getConfigDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = "\nSelected SAF folder: "
            java.lang.StringBuilder r10 = r10.append(r0)
            android.net.Uri r0 = getSelectedConfigTreeUri(r9)
            if (r0 == 0) goto Lbd
            android.net.Uri r0 = getSelectedConfigTreeUri(r9)
            java.lang.String r0 = r0.toString()
            goto Lbf
        Lbd:
            java.lang.String r0 = "None"
        Lbf:
            java.lang.String r0 = safe(r0)
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.io.File r9 = getLaunchConfigDirectory(r9)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            return r9
        Ldc:
            java.io.File r10 = getLaunchConfigDirectory(r9)     // Catch: java.lang.Throwable -> L1aa
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1aa
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1aa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1aa
            r3.<init>()     // Catch: java.lang.Throwable -> L1aa
            java.lang.StringBuilder r5 = r3.append(r6)     // Catch: java.lang.Throwable -> L1aa
            r7 = 10
            r5.append(r7)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r5 = "Launch MG_DIR_PATH: "
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L1aa
            java.lang.StringBuilder r10 = r5.append(r10)     // Catch: java.lang.Throwable -> L1aa
            r10.append(r7)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "enableANGLE"
            appendKnown(r3, r4, r10, r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "enableAngle"
            appendKnown(r3, r4, r10, r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "enableNoError"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "ignoreError"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "enableExtGL43"
            java.lang.String r0 = "OpenGL 4.3 extension set"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "enableExtComputeShader"
            java.lang.String r0 = "ARB_compute_shader"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "enableExtTimerQuery"
            java.lang.String r0 = "timer_query"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "enableExtDirectStateAccess"
            java.lang.String r0 = "direct_state_access"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "maxGlslCacheSize"
            java.lang.String r0 = "GLSL cache MB"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "multidrawMode"
            java.lang.String r0 = "MultiDraw mode"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "angleDepthClearFixMode"
            java.lang.String r0 = "ANGLE depth clear fix"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "bufferCoherentAsFlush"
            java.lang.String r0 = "Coherent buffer as flush"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "customGLVersion"
            java.lang.String r0 = "Custom GL version"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "fsr1Setting"
            java.lang.String r0 = "FSR1"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r10 = "hideMGEnvLevel"
            java.lang.String r0 = "Hide environment level"
            appendKnown(r3, r4, r10, r0)     // Catch: java.lang.Throwable -> L1aa
            java.util.Iterator r10 = r4.keys()     // Catch: java.lang.Throwable -> L1aa
            r0 = 0
        L16a:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L1aa
            if (r1 == 0) goto L1a1
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1aa
            boolean r5 = isKnownKey(r1)     // Catch: java.lang.Throwable -> L1aa
            if (r5 == 0) goto L17d
            goto L16a
        L17d:
            if (r0 != 0) goto L185
            java.lang.String r0 = "Other values:\n"
            r3.append(r0)     // Catch: java.lang.Throwable -> L1aa
            r0 = 1
        L185:
            java.lang.String r5 = "• "
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Throwable -> L1aa
            java.lang.StringBuilder r5 = r5.append(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r8 = " = "
            java.lang.StringBuilder r5 = r5.append(r8)     // Catch: java.lang.Throwable -> L1aa
            java.lang.Object r1 = r4.opt(r1)     // Catch: java.lang.Throwable -> L1aa
            java.lang.StringBuilder r1 = r5.append(r1)     // Catch: java.lang.Throwable -> L1aa
            r1.append(r7)     // Catch: java.lang.Throwable -> L1aa
            goto L16a
        L1a1:
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r9 = r10.trim()     // Catch: java.lang.Throwable -> L1aa
            return r9
        L1aa:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = "\nThe config exists, but DroidBridge could not parse it: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r10 = safeMessage(r10)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.io.File r9 = getLaunchConfigDirectory(r9)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            return r9
        L1d7:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MobileGlues config could not be read: "
            r0.<init>(r1)
            java.lang.String r10 = safeMessage(r10)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r0 = "\nExpected MG folder: "
            java.lang.StringBuilder r10 = r10.append(r0)
            java.io.File r0 = getConfigDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.io.File r9 = getLaunchConfigDirectory(r9)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            return r9
    }

    public static android.content.Intent buildStorageAccessIntent(android.content.Context r2) {
            android.content.Intent r2 = buildOpenPluginIntent(r2)
            if (r2 == 0) goto L7
            return r2
        L7:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MAIN"
            r2.<init>(r0)
            java.lang.String r0 = "android.intent.category.LAUNCHER"
            r2.addCategory(r0)
            java.lang.String[] r0 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.MOBILE_GLUES_PACKAGES
            r1 = 0
            r0 = r0[r1]
            r2.setPackage(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r0)
            return r2
    }

    public static boolean canReadConfigFile() {
            java.io.File r0 = getConfigFile()
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L12
            boolean r0 = r0.canRead()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private static androidx.documentfile.provider.DocumentFile documentFromTreeUri(android.content.Context r0, android.net.Uri r1) {
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L9
            androidx.documentfile.provider.DocumentFile r0 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r0, r1)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    private static androidx.documentfile.provider.DocumentFile findConfigFileInTree(android.content.Context r3, android.net.Uri r4) {
            androidx.documentfile.provider.DocumentFile r3 = documentFromTreeUri(r3, r4)
            r4 = 0
            if (r3 == 0) goto L3e
            boolean r0 = r3.exists()
            if (r0 == 0) goto L3e
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L14
            goto L3e
        L14:
            java.lang.String r0 = "config.json"
            androidx.documentfile.provider.DocumentFile r1 = r3.findFile(r0)
            if (r1 == 0) goto L23
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L23
            return r1
        L23:
            java.lang.String r1 = "MG"
            androidx.documentfile.provider.DocumentFile r3 = r3.findFile(r1)
            if (r3 == 0) goto L3e
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L3e
            androidx.documentfile.provider.DocumentFile r3 = r3.findFile(r0)
            if (r3 == 0) goto L3e
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L3e
            return r3
        L3e:
            return r4
    }

    private static androidx.documentfile.provider.DocumentFile findSafConfigFile(android.content.Context r1) {
            android.net.Uri r0 = getSelectedConfigTreeUri(r1)
            if (r0 == 0) goto Lb
            androidx.documentfile.provider.DocumentFile r1 = findConfigFileInTree(r1, r0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public static java.io.File getConfigDirectory() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = "MG"
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getConfigFile() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getConfigDirectory()
            java.lang.String r2 = "config.json"
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getLaunchConfigDirectory(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r2.getApplicationContext()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "MobileGlues"
            r0.<init>(r2, r1)
            return r0
    }

    public static java.io.File getLaunchConfigFile(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = getLaunchConfigDirectory(r2)
            java.lang.String r1 = "config.json"
            r0.<init>(r2, r1)
            return r0
    }

    private static android.content.SharedPreferences getPrefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "mobile_glues_config"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static androidx.documentfile.provider.DocumentFile getSelectedConfigTree(android.content.Context r1) {
            android.net.Uri r0 = getSelectedConfigTreeUri(r1)
            if (r0 == 0) goto Lb
            androidx.documentfile.provider.DocumentFile r1 = documentFromTreeUri(r1, r0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public static android.net.Uri getSelectedConfigTreeUri(android.content.Context r2) {
            android.content.SharedPreferences r2 = getPrefs(r2)
            java.lang.String r0 = "mg_tree_uri"
            r1 = 0
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L1d
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L1d
        L18:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1d
            return r2
        L1d:
            return r1
    }

    public static boolean hasSelectedConfigTree(android.content.Context r0) {
            android.net.Uri r0 = getSelectedConfigTreeUri(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean hasStorageAccess(android.content.Context r1) {
            boolean r0 = canReadConfigFile()
            if (r0 != 0) goto L19
            androidx.documentfile.provider.DocumentFile r0 = findSafConfigFile(r1)
            if (r0 != 0) goto L19
            java.io.File r1 = getLaunchConfigFile(r1)
            boolean r1 = r1.isFile()
            if (r1 == 0) goto L17
            goto L19
        L17:
            r1 = 0
            goto L1a
        L19:
            r1 = 1
        L1a:
            return r1
    }

    private static boolean isKnownKey(java.lang.String r1) {
            java.lang.String r0 = "enableANGLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "enableAngle"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "enableNoError"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "ignoreError"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "enableExtGL43"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "enableExtComputeShader"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "enableExtTimerQuery"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "enableExtDirectStateAccess"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "maxGlslCacheSize"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "multidrawMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "angleDepthClearFixMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "bufferCoherentAsFlush"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "customGLVersion"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "fsr1Setting"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            java.lang.String r0 = "hideMGEnvLevel"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L79
            goto L7b
        L79:
            r1 = 0
            goto L7c
        L7b:
            r1 = 1
        L7c:
            return r1
    }

    public static boolean isMobileGluesRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.String r2 = safe(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.String r3 = safe(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererId()
            java.lang.String r3 = safe(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererLibrary()
            java.lang.String r3 = safe(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererEGL()
            java.lang.String r4 = safe(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "mobileglues"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = "mobile glues"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = "libmobileglues"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L7a
        L79:
            r0 = 1
        L7a:
            return r0
    }

    public static java.io.File prepareLaunchConfig(android.content.Context r3) throws java.lang.Exception {
            android.content.Context r3 = r3.getApplicationContext()
            java.io.File r0 = getLaunchConfigDirectory(r3)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L34
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L34
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L1b
            goto L34
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create MobileGlues launch config folder: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L34:
            java.lang.String r1 = readBestConfigJson(r3)
            if (r1 == 0) goto L41
            java.io.File r3 = getLaunchConfigFile(r3)
            writeFile(r3, r1)
        L41:
            return r0
    }

    private static java.lang.String readBestConfigJson(android.content.Context r1) throws java.lang.Exception {
            androidx.documentfile.provider.DocumentFile r0 = findSafConfigFile(r1)
            if (r0 == 0) goto Lb
            java.lang.String r1 = readDocumentFile(r1, r0)
            return r1
        Lb:
            boolean r0 = canReadConfigFile()
            if (r0 == 0) goto L1a
            java.io.File r1 = getConfigFile()
            java.lang.String r1 = readFile(r1)
            return r1
        L1a:
            java.io.File r1 = getLaunchConfigFile(r1)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L29
            java.lang.String r1 = readFile(r1)
            goto L2a
        L29:
            r1 = 0
        L2a:
            return r1
    }

    private static java.lang.String readDocumentFile(android.content.Context r3, androidx.documentfile.provider.DocumentFile r4) throws java.lang.Exception {
            android.content.ContentResolver r3 = r3.getContentResolver()
            android.net.Uri r4 = r4.getUri()
            java.io.InputStream r3 = r3.openInputStream(r4)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L38
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L36
        L17:
            int r1 = r3.read(r0)     // Catch: java.lang.Throwable -> L36
            r2 = -1
            if (r1 == r2) goto L23
            r2 = 0
            r4.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L36
            goto L17
        L23:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r4.toString(r0)     // Catch: java.lang.Throwable -> L36
            r4.close()     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L35
            r3.close()
        L35:
            return r0
        L36:
            r0 = move-exception
            goto L40
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "Could not open selected MobileGlues config."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L40:
            r4.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L49
        L48:
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            if (r3 == 0) goto L54
            r3.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r3 = move-exception
            r4.addSuppressed(r3)
        L54:
            throw r4
    }

    private static java.lang.String readFile(java.io.File r4) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2b
        Le:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L2b
            r3 = -1
            if (r2 == r3) goto L1a
            r3 = 0
            r4.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L2b
            goto Le
        L1a:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r4.toString(r1)     // Catch: java.lang.Throwable -> L2b
            r4.close()     // Catch: java.lang.Throwable -> L35
            r0.close()
            return r1
        L2b:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L35
        L34:
            throw r1     // Catch: java.lang.Throwable -> L35
        L35:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            r4.addSuppressed(r0)
        L3e:
            throw r4
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    private static java.lang.String safeMessage(java.lang.Throwable r2) {
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
        L10:
            java.lang.String r0 = r2.toString()
        L14:
            return r0
    }

    public static ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.SelectionResult setSelectedConfigTreeUri(android.content.Context r14, android.net.Uri r15) {
            java.lang.String r0 = "MobileGlues MG folder saved. Launches will use: "
            android.content.Context r14 = r14.getApplicationContext()
            java.lang.String r1 = "mg_tree_uri"
            if (r15 != 0) goto L26
            android.content.SharedPreferences r14 = getPrefs(r14)
            android.content.SharedPreferences$Editor r14 = r14.edit()
            android.content.SharedPreferences$Editor r14 = r14.remove(r1)
            r14.apply()
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult r14 = new ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult
            r4 = 0
            r5 = 0
            r1 = 0
            java.lang.String r2 = "MobileGlues folder selection cleared."
            r3 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            return r14
        L26:
            androidx.documentfile.provider.DocumentFile r2 = documentFromTreeUri(r14, r15)
            if (r2 == 0) goto La4
            boolean r3 = r2.exists()
            if (r3 == 0) goto La4
            boolean r2 = r2.isDirectory()
            if (r2 != 0) goto L39
            goto La4
        L39:
            androidx.documentfile.provider.DocumentFile r2 = findConfigFileInTree(r14, r15)
            if (r2 != 0) goto L4c
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult r14 = new ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult
            r7 = 0
            r8 = 0
            r4 = 0
            java.lang.String r5 = "No config.json was found. Choose the MG folder at the root of internal storage: /storage/emulated/0/MG."
            r3 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            return r14
        L4c:
            android.content.SharedPreferences r2 = getPrefs(r14)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = r15.toString()
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)
            r1.apply()
            java.io.File r6 = prepareLaunchConfig(r14)     // Catch: java.lang.Throwable -> L7e
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult r14 = new ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            r3 = 1
            r2 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7e
            return r14
        L7e:
            r14 = move-exception
            java.lang.String r0 = "MobileGluesConfig"
            java.lang.String r1 = "Unable to mirror selected MobileGlues config"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r14)
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult r0 = new ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MG folder was saved, but config.json could not be mirrored: "
            r1.<init>(r2)
            java.lang.String r14 = safeMessage(r14)
            java.lang.StringBuilder r14 = r1.append(r14)
            java.lang.String r4 = r14.toString()
            r6 = 0
            r7 = 0
            r3 = 0
            r2 = r0
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        La4:
            ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult r14 = new ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper$SelectionResult
            r12 = 0
            r13 = 0
            r9 = 0
            java.lang.String r10 = "That folder could not be opened. Choose the MG folder again."
            r8 = r14
            r11 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            return r14
    }

    public static boolean shouldShowStorageAccessPrompt(android.content.Context r0, ca.dnamobile.javalauncher.renderer.RendererInterface r1) {
            boolean r1 = isMobileGluesRenderer(r1)
            if (r1 == 0) goto Le
            boolean r0 = hasStorageAccess(r0)
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static void writeFile(java.io.File r2, java.lang.String r3) throws java.lang.Exception {
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L32
            boolean r1 = r0.exists()
            if (r1 != 0) goto L32
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L32
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L19
            goto L32
        L19:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r3.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L32:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 0
            r0.<init>(r2, r1)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L45
            byte[] r2 = r3.getBytes(r2)     // Catch: java.lang.Throwable -> L45
            r0.write(r2)     // Catch: java.lang.Throwable -> L45
            r0.close()
            return
        L45:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r3 = move-exception
            r2.addSuppressed(r3)
        L4e:
            throw r2
    }
}
