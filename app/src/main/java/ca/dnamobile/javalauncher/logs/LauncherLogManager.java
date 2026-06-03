package ca.dnamobile.javalauncher.logs;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherLogManager {
    private static final java.lang.String KEY_KEEP_LOG_HISTORY = "keep_log_history";
    private static final java.lang.String KEY_LAST_LATEST_LOG_PATH = "last_latest_log_path";
    private static final java.lang.String PREFS = "launcher_logs";
    private static final java.lang.String TAG = "LauncherLogManager";
    private static java.io.File activeLatestLogFile = null;
    private static boolean nativeLogStarted = false;

    static {
            return
    }

    private LauncherLogManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addCandidate(java.util.ArrayList<java.io.File> r3, java.io.File r4) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r4.getAbsolutePath()
            java.util.Iterator r1 = r3.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getAbsolutePath()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lb
            return
        L22:
            r3.add(r4)
            return
    }

    public static void append(java.lang.String r3) {
            java.lang.String r3 = ca.dnamobile.javalauncher.logs.LatestLogTextFilter.cleanLauncherLine(r3)
            if (r3 != 0) goto L7
            return
        L7:
            net.kdt.pojavlaunch.Logger.appendToLog(r3)     // Catch: java.lang.Throwable -> Lb
            goto L16
        Lb:
            r0 = move-exception
            java.lang.String r1 = "LauncherLogManager"
            java.lang.String r2 = "appendToLog failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            appendFallback(r3)
        L16:
            return
    }

    private static void appendFallback(java.lang.String r3) {
            java.io.File r0 = ca.dnamobile.javalauncher.logs.LauncherLogManager.activeLatestLogFile
            if (r0 != 0) goto L5
            return
        L5:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L39
            r2 = 1
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = ca.dnamobile.javalauncher.logs.LatestLogTextFilter.normalizeLauncherLine(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = r0.append(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2f
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L2f
            r1.write(r3)     // Catch: java.lang.Throwable -> L2f
            r1.close()     // Catch: java.lang.Throwable -> L39
            goto L39
        L2f:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L39
        L38:
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            return
    }

    public static synchronized void beginLatestLog(android.content.Context r11, java.lang.String r12) {
            java.lang.String r0 = "New launch started for "
            java.lang.Class<ca.dnamobile.javalauncher.logs.LauncherLogManager> r1 = ca.dnamobile.javalauncher.logs.LauncherLogManager.class
            monitor-enter(r1)
            java.io.File r2 = getLatestLogFileForActivePath(r11)     // Catch: java.lang.Throwable -> L98
            rememberLatestLogPath(r11, r2)     // Catch: java.lang.Throwable -> L98
            java.io.File r3 = r2.getParentFile()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L1b
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L98
            if (r4 != 0) goto L1b
            r3.mkdirs()     // Catch: java.lang.Throwable -> L98
        L1b:
            boolean r3 = ca.dnamobile.javalauncher.logs.LauncherLogManager.nativeLogStarted     // Catch: java.lang.Throwable -> L98
            r4 = 1
            r5 = 0
            java.io.File r6 = ca.dnamobile.javalauncher.logs.LauncherLogManager.activeLatestLogFile     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L2c
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L98
            if (r6 != 0) goto L2a
            goto L2c
        L2a:
            r6 = r5
            goto L2d
        L2c:
            r6 = r4
        L2d:
            if (r3 == 0) goto L3b
            if (r6 != 0) goto L3b
            long r7 = r2.length()     // Catch: java.lang.Throwable -> L98
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L63
        L3b:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r2, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = buildFileHeader(r11, r12)     // Catch: java.lang.Throwable -> L51
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L51
            byte[] r11 = r11.getBytes(r5)     // Catch: java.lang.Throwable -> L51
            r3.write(r11)     // Catch: java.lang.Throwable -> L51
            r3.close()     // Catch: java.lang.Throwable -> L5b
            goto L63
        L51:
            r11 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r3 = move-exception
            r11.addSuppressed(r3)     // Catch: java.lang.Throwable -> L5b
        L5a:
            throw r11     // Catch: java.lang.Throwable -> L5b
        L5b:
            r11 = move-exception
            java.lang.String r3 = "LauncherLogManager"
            java.lang.String r5 = "Failed to initialize latestlog.txt"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r3, r5, r11)     // Catch: java.lang.Throwable -> L98
        L63:
            boolean r11 = ca.dnamobile.javalauncher.logs.LauncherLogManager.nativeLogStarted     // Catch: java.lang.Throwable -> L98
            if (r11 == 0) goto L8f
            if (r6 == 0) goto L6a
            goto L8f
        L6a:
            java.lang.String r11 = "----------------------------------------"
            append(r11)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> L98
            java.lang.String r12 = " at "
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> L98
            java.util.Date r12 = new java.util.Date     // Catch: java.lang.Throwable -> L98
            r12.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Throwable -> L98
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L98
            append(r11)     // Catch: java.lang.Throwable -> L98
            goto L96
        L8f:
            net.kdt.pojavlaunch.Logger.beginLog(r2)     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.logs.LauncherLogManager.nativeLogStarted = r4     // Catch: java.lang.Throwable -> L98
            ca.dnamobile.javalauncher.logs.LauncherLogManager.activeLatestLogFile = r2     // Catch: java.lang.Throwable -> L98
        L96:
            monitor-exit(r1)
            return
        L98:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
            throw r11
    }

    private static java.lang.String buildFileHeader(android.content.Context r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DroidBridge Launcher latestlog.txt\nLauncher: "
            r0.<init>(r1)
            java.lang.String r1 = getInstalledLauncherVersion(r3)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r2 = "\nBuild package: "
            r1.append(r2)
            java.lang.String r3 = r3.getPackageName()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r1 = "\nMinecraft: "
            r3.append(r1)
            java.lang.StringBuilder r3 = r0.append(r4)
            java.lang.String r4 = "\nStarted: "
            r3.append(r4)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r4 = "\n----------------------------------------\n"
            r3.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.util.ArrayList<java.io.File> buildLatestLogCandidates(android.content.Context r5) {
            java.lang.String r0 = "latestlog.txt"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.File r2 = ca.dnamobile.javalauncher.logs.LauncherLogManager.activeLatestLogFile
            addCandidate(r1, r2)
            android.content.SharedPreferences r2 = prefs(r5)
            java.lang.String r3 = "last_latest_log_path"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            if (r2 == 0) goto L30
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L30
            java.io.File r3 = new java.io.File
            java.lang.String r2 = r2.trim()
            r3.<init>(r2)
            addCandidate(r1, r3)
        L30:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r5)     // Catch: java.lang.Throwable -> L3d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3d
            addCandidate(r1, r2)     // Catch: java.lang.Throwable -> L3d
        L3d:
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.getDefaultLauncherHome(r5)     // Catch: java.lang.Throwable -> L50
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L50
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = ".minecraft"
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L50
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L50
            addCandidate(r1, r2)     // Catch: java.lang.Throwable -> L50
        L50:
            return r1
    }

    private static android.content.Intent buildSendIntent(android.app.Activity r3, android.net.Uri r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.SEND"
            r0.<init>(r1)
            java.lang.String r1 = "text/plain"
            r0.setType(r1)
            java.lang.String r1 = "android.intent.extra.STREAM"
            r0.putExtra(r1, r4)
            java.lang.String r1 = "android.intent.extra.SUBJECT"
            java.lang.String r2 = "DroidBridge latestlog.txt"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "android.intent.extra.TEXT"
            r0.putExtra(r1, r2)
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r1 = "latestlog.txt"
            android.content.ClipData r3 = android.content.ClipData.newUri(r3, r1, r4)
            r0.setClipData(r3)
            r3 = 1
            r0.addFlags(r3)
            return r0
    }

    private static android.content.Intent buildViewIntent(android.app.Activity r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            r0.setDataAndType(r3, r4)
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.content.ClipData r2 = android.content.ClipData.newUri(r2, r5, r3)
            r0.setClipData(r2)
            r2 = 1
            r0.addFlags(r2)
            return r0
    }

    public static synchronized void cleanLatestLogInPlace(android.content.Context r5) {
            java.lang.Class<ca.dnamobile.javalauncher.logs.LauncherLogManager> r0 = ca.dnamobile.javalauncher.logs.LauncherLogManager.class
            monitor-enter(r0)
            java.io.File r5 = resolveLatestLogFile(r5)     // Catch: java.lang.Throwable -> L51
            boolean r1 = r5.isFile()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L4f
            long r1 = r5.length()     // Catch: java.lang.Throwable -> L51
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L18
            goto L4f
        L18:
            java.lang.String r1 = readTextFile(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = ca.dnamobile.javalauncher.logs.LatestLogTextFilter.cleanWholeLog(r1)     // Catch: java.lang.Throwable -> L45
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L28
            monitor-exit(r0)
            return
        L28:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L45
            r3 = 0
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> L45
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L3b
            byte[] r5 = r2.getBytes(r5)     // Catch: java.lang.Throwable -> L3b
            r1.write(r5)     // Catch: java.lang.Throwable -> L3b
            r1.close()     // Catch: java.lang.Throwable -> L45
            goto L4d
        L3b:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L40
            goto L44
        L40:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Throwable -> L45
        L44:
            throw r5     // Catch: java.lang.Throwable -> L45
        L45:
            r5 = move-exception
            java.lang.String r1 = "LauncherLogManager"
            java.lang.String r2 = "Failed to clean latestlog.txt"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r5)     // Catch: java.lang.Throwable -> L51
        L4d:
            monitor-exit(r0)
            return
        L4f:
            monitor-exit(r0)
            return
        L51:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r5
    }

    private static void copyFile(java.io.File r4, java.io.File r5) throws java.lang.Exception {
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto Lf
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L3a
            r5 = 65536(0x10000, float:9.1835E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L30
        L1e:
            int r2 = r0.read(r5)     // Catch: java.lang.Throwable -> L30
            r3 = -1
            if (r2 == r3) goto L29
            r4.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L30
            goto L1e
        L29:
            r4.close()     // Catch: java.lang.Throwable -> L3a
            r0.close()
            return
        L30:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L3a
        L39:
            throw r5     // Catch: java.lang.Throwable -> L3a
        L3a:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r5 = move-exception
            r4.addSuppressed(r5)
        L43:
            throw r4
    }

    private static java.lang.String escapeHtml(java.lang.String r4) {
            if (r4 == 0) goto L5a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L5a
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            r0.<init>(r1)
            r1 = 0
        L13:
            int r2 = r4.length()
            if (r1 >= r2) goto L55
            char r2 = r4.charAt(r1)
            r3 = 34
            if (r2 == r3) goto L4d
            r3 = 60
            if (r2 == r3) goto L47
            r3 = 62
            if (r2 == r3) goto L41
            r3 = 38
            if (r2 == r3) goto L3b
            r3 = 39
            if (r2 == r3) goto L35
            r0.append(r2)
            goto L52
        L35:
            java.lang.String r2 = "&#39;"
            r0.append(r2)
            goto L52
        L3b:
            java.lang.String r2 = "&amp;"
            r0.append(r2)
            goto L52
        L41:
            java.lang.String r2 = "&gt;"
            r0.append(r2)
            goto L52
        L47:
            java.lang.String r2 = "&lt;"
            r0.append(r2)
            goto L52
        L4d:
            java.lang.String r2 = "&quot;"
            r0.append(r2)
        L52:
            int r1 = r1 + 1
            goto L13
        L55:
            java.lang.String r4 = r0.toString()
            return r4
        L5a:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String getInstalledLauncherVersion(android.content.Context r4) {
            java.lang.String r0 = "DroidBridge Launcher "
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L55
            r2 = 0
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r4.versionName     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L27
            java.lang.String r1 = r4.versionName     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L55
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L20
            goto L27
        L20:
            java.lang.String r1 = r4.versionName     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L55
            goto L29
        L27:
            java.lang.String r1 = "unknown"
        L29:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L55
            r3 = 28
            if (r2 < r3) goto L34
            long r2 = r4.getLongVersionCode()     // Catch: java.lang.Throwable -> L55
            goto L37
        L34:
            int r4 = r4.versionCode     // Catch: java.lang.Throwable -> L55
            long r2 = (long) r4     // Catch: java.lang.Throwable -> L55
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = " ("
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r4 = r4.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = ")"
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L55
            return r4
        L55:
            java.lang.String r4 = "DroidBridge Launcher unknown"
            return r4
    }

    public static java.io.File getLatestLogFile(android.content.Context r2) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r1 = "latestlog.txt"
            r2.<init>(r0, r1)
            return r2
    }

    private static java.io.File getLatestLogFileForActivePath(android.content.Context r2) {
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            if (r0 == 0) goto L10
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
        L10:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r2)
        L13:
            java.io.File r2 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r1 = "latestlog.txt"
            r2.<init>(r0, r1)
            return r2
    }

    public static java.io.File getLogHistoryDirectory(android.content.Context r2) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r1 = "launcher_log"
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L15
            r2.mkdirs()
        L15:
            return r2
    }

    private static java.io.File getLogHistoryDirectoryForLatest(android.content.Context r1, java.io.File r2) {
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto Le
            java.io.File r1 = new java.io.File
            java.lang.String r0 = "launcher_log"
            r1.<init>(r2, r0)
            goto L12
        Le:
            java.io.File r1 = getLogHistoryDirectory(r1)
        L12:
            boolean r2 = r1.exists()
            if (r2 != 0) goto L1b
            r1.mkdirs()
        L1b:
            return r1
    }

    public static boolean isKeepLogHistoryEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "keep_log_history"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    private static boolean isUsableLog(java.io.File r4) {
            if (r4 == 0) goto L14
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L14
            long r0 = r4.length()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            return r4
    }

    private static void openOrShareTextFile(android.app.Activity r3, java.io.File r4, java.io.File r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".fileprovider"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r4 = androidx.core.content.FileProvider.getUriForFile(r3, r0, r4)
            android.content.Intent r0 = buildSendIntent(r3, r4)
            if (r5 == 0) goto L49
            boolean r2 = r5.isFile()
            if (r2 == 0) goto L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r3.getPackageName()
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.net.Uri r4 = androidx.core.content.FileProvider.getUriForFile(r3, r4, r5)
            java.lang.String r5 = "text/html"
            java.lang.String r1 = "latestlog.html"
            android.content.Intent r4 = buildViewIntent(r3, r4, r5, r1)
            goto L51
        L49:
            java.lang.String r5 = "text/plain"
            java.lang.String r1 = "latestlog.txt"
            android.content.Intent r4 = buildViewIntent(r3, r4, r5, r1)
        L51:
            int r5 = ca.dnamobile.javalauncher.R.string.button_share_latest_log
            java.lang.String r5 = r3.getString(r5)
            android.content.Intent r4 = android.content.Intent.createChooser(r4, r5)
            r5 = 1
            android.content.Intent[] r1 = new android.content.Intent[r5]
            r2 = 0
            r1[r2] = r0
            java.lang.String r2 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r2, r1)
            r4.addFlags(r5)
            r3.startActivity(r4)     // Catch: android.content.ActivityNotFoundException -> L6d
            goto L7a
        L6d:
            int r4 = ca.dnamobile.javalauncher.R.string.button_share_latest_log
            java.lang.String r4 = r3.getString(r4)
            android.content.Intent r4 = android.content.Intent.createChooser(r0, r4)
            r3.startActivity(r4)
        L7a:
            return
    }

    private static android.content.SharedPreferences prefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "launcher_logs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static void preserveLatestLogIfEnabled(android.content.Context r7, java.lang.String r8) {
            java.lang.String r0 = "LauncherLogManager"
            java.lang.String r1 = "Saved launch log history: "
            boolean r2 = isKeepLogHistoryEnabled(r7)
            if (r2 != 0) goto Lb
            return
        Lb:
            cleanLatestLogInPlace(r7)
            java.io.File r2 = resolveLatestLogFile(r7)
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L83
            long r3 = r2.length()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L23
            goto L83
        L23:
            java.lang.String r3 = "[^A-Za-z0-9._-]"
            java.lang.String r4 = "_"
            java.lang.String r8 = r8.replaceAll(r3, r4)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyyMMdd-HHmmss"
            java.util.Locale r5 = java.util.Locale.US
            r3.<init>(r4, r5)
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r3 = r3.format(r4)
            java.io.File r4 = new java.io.File
            java.io.File r7 = getLogHistoryDirectoryForLatest(r7, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "latestlog-"
            r5.<init>(r6)
            java.lang.StringBuilder r8 = r5.append(r8)
            java.lang.String r5 = "-"
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.String r3 = ".txt"
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.String r8 = r8.toString()
            r4.<init>(r7, r8)
            copyFile(r2, r4)     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L7d
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)     // Catch: java.lang.Throwable -> L7d
            goto L83
        L7d:
            r7 = move-exception
            java.lang.String r8 = "Failed to save launch log history"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r8, r7)
        L83:
            return
    }

    private static java.lang.String readTextFile(java.io.File r6) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            long r1 = r6.length()     // Catch: java.lang.Throwable -> L2e
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r1 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L2e
            int r6 = (int) r1     // Catch: java.lang.Throwable -> L2e
            byte[] r1 = new byte[r6]     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r6) goto L23
            int r4 = r6 - r3
            int r4 = r0.read(r1, r3, r4)     // Catch: java.lang.Throwable -> L2e
            r5 = -1
            if (r4 != r5) goto L21
            goto L23
        L21:
            int r3 = r3 + r4
            goto L15
        L23:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2e
            r0.close()
            return r6
        L2e:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            r6.addSuppressed(r0)
        L37:
            throw r6
    }

    private static void rememberLatestLogPath(android.content.Context r1, java.io.File r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "last_latest_log_path"
            java.lang.String r2 = r2.getAbsolutePath()
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static java.io.File resolveLatestLogFile(android.content.Context r7) {
            java.io.File r0 = net.kdt.pojavlaunch.Logger.getCurrentLogFile()
            boolean r1 = isUsableLog(r0)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            java.io.File r0 = ca.dnamobile.javalauncher.logs.LauncherLogManager.activeLatestLogFile
            boolean r0 = isUsableLog(r0)
            if (r0 == 0) goto L16
            java.io.File r7 = ca.dnamobile.javalauncher.logs.LauncherLogManager.activeLatestLogFile
            return r7
        L16:
            android.content.SharedPreferences r0 = prefs(r7)
            java.lang.String r1 = "last_latest_log_path"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L3e
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3e
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.trim()
            r1.<init>(r0)
            boolean r0 = isUsableLog(r1)
            if (r0 == 0) goto L3e
            return r1
        L3e:
            java.util.ArrayList r0 = buildLatestLogCandidates(r7)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L47:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = isUsableLog(r2)
            if (r3 != 0) goto L5a
            goto L47
        L5a:
            if (r1 == 0) goto L68
            long r3 = r2.lastModified()
            long r5 = r1.lastModified()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L47
        L68:
            r1 = r2
            goto L47
        L6a:
            if (r1 == 0) goto L6d
            return r1
        L6d:
            java.io.File r7 = getLatestLogFile(r7)
            return r7
    }

    public static void setKeepLogHistoryEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "keep_log_history"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void shareLatestLog(android.app.Activity r7) {
            cleanLatestLogInPlace(r7)
            java.io.File r0 = resolveLatestLogFile(r7)
            boolean r1 = r0.isFile()
            r2 = 1
            if (r1 == 0) goto L65
            long r3 = r0.length()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L19
            goto L65
        L19:
            rememberLatestLogPath(r7, r0)
            java.io.File r1 = new java.io.File
            java.io.File r3 = r7.getCacheDir()
            java.lang.String r4 = "shared_logs"
            r1.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "latestlog.txt"
            r3.<init>(r1, r4)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "latestlog.html"
            r4.<init>(r1, r5)
            copyFile(r0, r3)     // Catch: java.lang.Throwable -> L46
            writeChromeHtmlPreview(r3, r4)     // Catch: java.lang.Throwable -> L46
            r1 = 0
            r3.setReadable(r2, r1)     // Catch: java.lang.Throwable -> L46
            r4.setReadable(r2, r1)     // Catch: java.lang.Throwable -> L46
            openOrShareTextFile(r7, r3, r4)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r1 = move-exception
            java.lang.String r3 = "Failed to share cached latestlog.txt"
            java.lang.String r4 = "LauncherLogManager"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r3, r1)
            r1 = 0
            openOrShareTextFile(r7, r0, r1)     // Catch: java.lang.Throwable -> L53
            goto L64
        L53:
            r0 = move-exception
            java.lang.String r1 = "Failed to share latestlog.txt"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r1, r0)
            java.lang.String r0 = r0.getMessage()
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r2)
            r7.show()
        L64:
            return
        L65:
            int r0 = ca.dnamobile.javalauncher.R.string.log_latest_missing
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r2)
            r7.show()
            return
    }

    private static void writeChromeHtmlPreview(java.io.File r2, java.io.File r3) throws java.lang.Exception {
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto Lf
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.lang.String r2 = readTextFile(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<!doctype html>\n<html><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>DroidBridge latestlog.txt</title><style>body{margin:0;padding:16px;background:#111;color:#eee;font-family:monospace;font-size:13px;line-height:1.35;}pre{white-space:pre-wrap;word-wrap:break-word;margin:0;}</style></head><body><pre>"
            r0.<init>(r1)
            java.lang.String r2 = escapeHtml(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "</pre></body></html>\n"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 0
            r0.<init>(r3, r1)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L3f
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L3f
            r0.write(r2)     // Catch: java.lang.Throwable -> L3f
            r0.close()
            return
        L3f:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r3 = move-exception
            r2.addSuppressed(r3)
        L48:
            throw r2
    }
}
