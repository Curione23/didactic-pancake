package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class MinecraftGuiScaleResolver {
    private static final int MAX_SCALE = 8;
    private static final int MIN_SCALE = 1;
    private static final long READ_THROTTLE_MS = 750;
    private static int cachedRequestedScale;
    private static java.io.File lastFile;
    private static long lastModified;
    private static long lastReadAtMs;

    static {
            return
    }

    private MinecraftGuiScaleResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int calculateMinecraftMaxScale(float r7, float r8) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = java.lang.Math.max(r0, r7)
            float r8 = java.lang.Math.max(r0, r8)
            r0 = 1
            r1 = r0
        Lc:
            r2 = 8
            if (r1 >= r2) goto L25
            int r3 = r1 + 1
            float r4 = (float) r3
            float r5 = r7 / r4
            r6 = 1134559232(0x43a00000, float:320.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L25
            float r4 = r8 / r4
            r5 = 1131413504(0x43700000, float:240.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L25
            r1 = r3
            goto Lc
        L25:
            int r7 = clamp(r1, r0, r2)
            return r7
    }

    private static int clamp(int r0, int r1, int r2) {
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static void clearCache() {
            r0 = 0
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastFile = r0
            r0 = 0
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastReadAtMs = r0
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastModified = r0
            r0 = 0
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.cachedRequestedScale = r0
            return
    }

    private static int parseIntSafe(java.lang.String r0, int r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> Lc
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            return r1
    }

    public static java.io.File peekCachedFile() {
            java.io.File r0 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastFile
            return r0
    }

    public static int peekCachedRequestedScale() {
            int r0 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.cachedRequestedScale
            return r0
    }

    private static int readGuiScale(java.io.File r5) {
            java.lang.String r0 = "guiScale="
            java.lang.String r1 = "guiScale:"
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5b
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b
        Lf:
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L4d
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L51
            boolean r4 = r5.startsWith(r1)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L33
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.substring(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L51
            int r5 = parseIntSafe(r5, r2)     // Catch: java.lang.Throwable -> L51
            r3.close()     // Catch: java.lang.Throwable -> L5b
            return r5
        L33:
            boolean r4 = r5.startsWith(r0)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto Lf
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.substring(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L51
            int r5 = parseIntSafe(r5, r2)     // Catch: java.lang.Throwable -> L51
            r3.close()     // Catch: java.lang.Throwable -> L5b
            return r5
        L4d:
            r3.close()     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L51:
            r5 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L5b
        L5a:
            throw r5     // Catch: java.lang.Throwable -> L5b
        L5b:
            return r2
    }

    public static int readGuiScaleCached(java.io.File r0) {
            int r0 = readGuiScaleThrottled(r0)
            return r0
    }

    private static int readGuiScaleThrottled(java.io.File r8) {
            if (r8 == 0) goto L39
            boolean r0 = r8.isFile()
            if (r0 != 0) goto L9
            goto L39
        L9:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = safeLastModified(r8)
            java.io.File r4 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastFile
            boolean r4 = sameFile(r8, r4)
            if (r4 == 0) goto L2c
            long r4 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastModified
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L2c
            long r4 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastReadAtMs
            long r4 = r0 - r4
            r6 = 750(0x2ee, double:3.705E-321)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L2c
            int r8 = ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.cachedRequestedScale
            return r8
        L2c:
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastFile = r8
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastModified = r2
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.lastReadAtMs = r0
            int r8 = readGuiScale(r8)
            ca.dnamobile.javalauncher.controls.MinecraftGuiScaleResolver.cachedRequestedScale = r8
            return r8
        L39:
            r8 = 0
            return r8
    }

    public static int resolve(java.io.File r0, float r1, float r2) {
            int r0 = readGuiScaleCached(r0)
            int r0 = resolveRequestedScale(r0, r1, r2)
            return r0
    }

    public static int resolveRequestedScale(int r0, float r1, float r2) {
            if (r0 > 0) goto L7
            int r0 = calculateMinecraftMaxScale(r1, r2)
            return r0
        L7:
            r1 = 1
            r2 = 8
            int r0 = clamp(r0, r1, r2)
            return r0
    }

    public static int resolveRequestedScaleForFramebuffer(int r0, float r1, float r2) {
            int r1 = calculateMinecraftMaxScale(r1, r2)
            if (r0 > 0) goto L7
            return r1
        L7:
            r2 = 1
            int r0 = clamp(r0, r2, r1)
            return r0
    }

    private static long safeLastModified(java.io.File r2) {
            long r0 = r2.lastModified()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static boolean sameFile(java.io.File r0, java.io.File r1) {
            if (r0 != r1) goto L4
            r0 = 1
            return r0
        L4:
            if (r0 == 0) goto L16
            if (r1 != 0) goto L9
            goto L16
        L9:
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r0 = r0.equals(r1)
            return r0
        L16:
            r0 = 0
            return r0
    }
}
