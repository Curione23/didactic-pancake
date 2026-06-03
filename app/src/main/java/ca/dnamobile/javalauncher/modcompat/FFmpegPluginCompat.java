package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class FFmpegPluginCompat {
    public static final java.lang.String JAVALAUNCHER_PACKAGE = "ca.dnamobile.javalauncher.ffmpeg";
    private static final java.lang.String[] KNOWN_PACKAGES = null;
    private static final java.lang.String TAG = "FFmpegPluginCompat";

    public static final class Result {
        public final boolean available;
        public final java.lang.String errorMessage;
        public final java.lang.String executablePath;
        public final java.lang.String ffprobePath;
        public final java.lang.String libraryPath;
        public final java.lang.String packageName;
        public final boolean replayModPresent;

        private Result(boolean r1, boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r0 = this;
                r0.<init>()
                r0.available = r1
                r0.replayModPresent = r2
                r0.packageName = r3
                r0.libraryPath = r4
                r0.executablePath = r5
                r0.ffprobePath = r6
                r0.errorMessage = r7
                return
        }

        /* synthetic */ Result(boolean r1, boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.ResultIA r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        static ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result missing(java.lang.String r9) {
                ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r8 = new ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result
                r5 = 0
                r6 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r0 = r8
                r7 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ResultIA {
    }

    static {
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "ca.dnamobile.javalauncher.ffmpeg"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "ca.dnamobile.javalauncher.ffmpeg.debug"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "ca.dnamobile.javalauncher.debug.ffmpeg"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "ca.dnamobile.droidbridge.ffmpeg"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "ca.dnamobile.droidbridge.ffmpeg.debug"
            r0[r1] = r2
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.KNOWN_PACKAGES = r0
            return
    }

    private FFmpegPluginCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result discoverForReplayMod(android.content.Context r9, java.io.File r10) {
            boolean r10 = hasReplayMod(r10)
            if (r10 != 0) goto L16
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r9 = new ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result
            java.lang.String r7 = "Replay Mod is not installed in this instance"
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L16:
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r9 = discoverInstalled(r9)
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r10 = new ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result
            boolean r1 = r9.available
            java.lang.String r3 = r9.packageName
            java.lang.String r4 = r9.libraryPath
            java.lang.String r5 = r9.executablePath
            java.lang.String r6 = r9.ffprobePath
            java.lang.String r7 = r9.errorMessage
            r8 = 0
            r2 = 1
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result discoverInstalled(android.content.Context r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r1 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.KNOWN_PACKAGES
            int r2 = r1.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L3f
            r4 = r1[r3]
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r5 = discoverPackage(r7, r4)
            boolean r6 = r5.available
            if (r6 == 0) goto L16
            return r5
        L16:
            java.lang.String r6 = r5.errorMessage
            if (r6 == 0) goto L3c
            java.lang.String r6 = r5.errorMessage
            int r6 = r6.length()
            if (r6 <= 0) goto L3c
            int r6 = r0.length()
            if (r6 <= 0) goto L2d
            java.lang.String r6 = " | "
            r0.append(r6)
        L2d:
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r6 = ": "
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = r5.errorMessage
            r4.append(r5)
        L3c:
            int r3 = r3 + 1
            goto L9
        L3f:
            int r7 = r0.length()
            if (r7 <= 0) goto L4a
            java.lang.String r7 = r0.toString()
            goto L4c
        L4a:
            java.lang.String r7 = "JavaLauncher FFmpeg plugin is not installed"
        L4c:
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r7 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result.missing(r7)
            return r7
    }

    private static ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result discoverPackage(android.content.Context r13, java.lang.String r14) {
            java.lang.String r0 = "FFmpegPluginCompat"
            java.lang.String r1 = "Discovered JavaLauncher FFmpeg plugin package="
            java.lang.String r2 = "FFmpeg executable missing: "
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: java.lang.Throwable -> Lc8
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc8
            r4 = 33
            if (r3 < r4) goto L1b
            r3 = 1024(0x400, double:5.06E-321)
            android.content.pm.PackageManager$PackageInfoFlags r3 = android.content.pm.PackageManager.PackageInfoFlags.of(r3)     // Catch: java.lang.Throwable -> Lc8
            android.content.pm.PackageInfo r13 = r13.getPackageInfo(r14, r3)     // Catch: java.lang.Throwable -> Lc8
            goto L21
        L1b:
            r3 = 1024(0x400, float:1.435E-42)
            android.content.pm.PackageInfo r13 = r13.getPackageInfo(r14, r3)     // Catch: java.lang.Throwable -> Lc8
        L21:
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo     // Catch: java.lang.Throwable -> Lc8
            if (r13 == 0) goto Lc1
            java.lang.String r3 = r13.nativeLibraryDir     // Catch: java.lang.Throwable -> Lc8
            if (r3 != 0) goto L2b
            goto Lc1
        L2b:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r13 = r13.nativeLibraryDir     // Catch: java.lang.Throwable -> Lc8
            r3.<init>(r13)     // Catch: java.lang.Throwable -> Lc8
            java.io.File r13 = new java.io.File     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r4 = "libffmpeg.so"
            r13.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lc8
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r5 = "libffprobe.so"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lc8
            boolean r5 = r13.isFile()     // Catch: java.lang.Throwable -> Lc8
            if (r5 != 0) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r13 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r13 = r1.append(r13)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lc8
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r13 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result.missing(r13)     // Catch: java.lang.Throwable -> Lc8
            return r13
        L5c:
            r2 = 0
            r5 = 1
            r13.setReadable(r5, r2)     // Catch: java.lang.Throwable -> Lc8
            r4.setReadable(r5, r2)     // Catch: java.lang.Throwable -> Lc8
            boolean r2 = r4.isFile()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto L6f
            java.lang.String r2 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc8
            goto L70
        L6f:
            r2 = 0
        L70:
            r10 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r1 = r2.append(r14)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = " libraryPath="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = " ffmpeg="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = " ffprobe="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lc8
            if (r10 == 0) goto La0
            r2 = r10
            goto La2
        La0:
            java.lang.String r2 = "<missing>"
        La2:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc8
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> Lc8
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r1 = new ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r8 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r9 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc8
            r11 = 0
            r12 = 0
            r5 = 1
            r6 = 0
            r4 = r1
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lc8
            return r1
        Lc1:
            java.lang.String r13 = "FFmpeg plugin has no nativeLibraryDir"
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r13 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result.missing(r13)     // Catch: java.lang.Throwable -> Lc8
            return r13
        Lc8:
            r13 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JavaLauncher FFmpeg plugin not available: "
            r1.<init>(r2)
            java.lang.StringBuilder r14 = r1.append(r14)
            java.lang.String r14 = r14.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r14, r13)
            java.lang.String r13 = r13.toString()
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r13 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result.missing(r13)
            return r13
    }

    public static boolean hasReplayMod(java.io.File r5) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "mods"
            r0.<init>(r5, r1)
            boolean r5 = r0.isDirectory()
            r1 = 0
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.io.File[] r5 = r0.listFiles()
            if (r5 != 0) goto L16
            return r1
        L16:
            int r0 = r5.length
            r2 = r1
        L18:
            if (r2 >= r0) goto L5c
            r3 = r5[r2]
            if (r3 == 0) goto L59
            boolean r4 = r3.isFile()
            if (r4 != 0) goto L25
            goto L59
        L25:
            java.lang.String r3 = r3.getName()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = ".jar"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L3f
            java.lang.String r4 = ".disabled"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L59
        L3f:
            java.lang.String r4 = "replaymod"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L57
            java.lang.String r4 = "replay-mod"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L57
            java.lang.String r4 = "replay_mod"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L59
        L57:
            r5 = 1
            return r5
        L59:
            int r2 = r2 + 1
            goto L18
        L5c:
            return r1
    }
}
