package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsBackendHelper {
    private static final java.lang.String LEGACY_BACKEND_KEY = "graphicsBackend";
    private static final java.lang.String PREFERRED_BACKEND_KEY = "preferredGraphicsBackend";
    private static final java.lang.String TAG = "GraphicsBackendHelper";

    private GraphicsBackendHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyBeforeLaunch(android.content.Context r3, java.lang.String r4, org.json.JSONObject r5, java.io.File r6) {
            java.lang.String r0 = "options.txt"
            java.lang.String r1 = "Forced preferredGraphicsBackend=opengl for "
            boolean r3 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseOpenGlForMinecraft26Plus(r3)
            java.lang.String r2 = "GraphicsBackendHelper"
            if (r3 != 0) goto L12
            java.lang.String r3 = "Minecraft 26+ OpenGL override disabled."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r3)
            return
        L12:
            java.lang.String r3 = resolveEffectiveMinecraftVersion(r4, r5)
            boolean r4 = isMinecraft26OrNewer(r3)
            if (r4 != 0) goto L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Skipping OpenGL backend override for non-26+ version: "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r3)
            return
        L2f:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r6, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "opengl"
            writeBackendValue(r4, r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = r4.append(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = " options="
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L5d
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r6, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5d
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r4)     // Catch: java.lang.Throwable -> L5d
            goto L70
        L5d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to force OpenGL backend for Minecraft "
            r5.<init>(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r3, r4)
        L70:
            return
    }

    private static boolean isMinecraft26OrNewer(java.lang.String r5) {
            java.lang.String r5 = r5.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r0 = "^\\d{2}w\\d{2}[a-z].*"
            boolean r0 = r5.matches(r0)
            r1 = 1
            r2 = 26
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L20
            int r5 = parseLeadingInt(r5, r3)
            if (r5 < r2) goto L1e
            goto L1f
        L1e:
            r1 = r4
        L1f:
            return r1
        L20:
            java.lang.String r0 = "^\\d{2}(?:\\.|-).*"
            boolean r0 = r5.matches(r0)
            if (r0 != 0) goto L32
            java.lang.String r0 = "^\\d{2}$"
            boolean r0 = r5.matches(r0)
            if (r0 == 0) goto L31
            goto L32
        L31:
            return r4
        L32:
            int r5 = parseLeadingInt(r5, r3)
            if (r5 < r2) goto L39
            goto L3a
        L39:
            r1 = r4
        L3a:
            return r1
    }

    private static int parseLeadingInt(java.lang.String r1, int r2) {
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L12
            int r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L12
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)     // Catch: java.lang.Throwable -> L12
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = -1
            return r1
    }

    private static java.lang.String readFile(java.io.File r5) throws java.lang.Exception {
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

    private static java.lang.String resolveEffectiveMinecraftVersion(java.lang.String r3, org.json.JSONObject r4) {
            java.lang.String r0 = "inheritsFrom"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L13
            return r0
        L13:
            java.lang.String r0 = "javaLauncherFlattenedParent"
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L24
            return r0
        L24:
            java.lang.String r0 = "id"
            java.lang.String r4 = r4.optString(r0, r3)
            java.lang.String r4 = r4.trim()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L35
            goto L36
        L35:
            r3 = r4
        L36:
            return r3
    }

    private static void writeBackendValue(java.io.File r8, java.lang.String r9) throws java.lang.Exception {
            java.io.File r0 = r8.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create options directory: "
            r9.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L2c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r8.isFile()
            r2 = 0
            if (r1 == 0) goto L55
            java.lang.String r1 = readFile(r8)
            java.lang.String r3 = "\\r?\\n"
            r4 = -1
            java.lang.String[] r1 = r1.split(r3, r4)
            int r3 = r1.length
            r4 = r2
        L45:
            if (r4 >= r3) goto L55
            r5 = r1[r4]
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L52
            r0.add(r5)
        L52:
            int r4 = r4 + 1
            goto L45
        L55:
            r1 = r2
            r3 = r1
        L57:
            int r4 = r0.size()
            java.lang.String r5 = "preferredGraphicsBackend:"
            if (r2 >= r4) goto L9a
            java.lang.Object r4 = r0.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r6 = r4.startsWith(r5)
            r7 = 1
            if (r6 == 0) goto L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.set(r2, r1)
            r1 = r7
            goto L97
        L7e:
            java.lang.String r5 = "graphicsBackend:"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            r0.set(r2, r3)
            r3 = r7
        L97:
            int r2 = r2 + 1
            goto L57
        L9a:
            if (r1 != 0) goto Lae
            if (r3 != 0) goto Lae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.StringBuilder r9 = r1.append(r9)
            java.lang.String r9 = r9.toString()
            r0.add(r9)
        Lae:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lda
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lb7
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Ld0
            goto Lb7
        Ld0:
            java.lang.StringBuilder r1 = r9.append(r1)
            r2 = 10
            r1.append(r2)
            goto Lb7
        Lda:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r8)
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> Lf0
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lf0
            byte[] r8 = r8.getBytes(r9)     // Catch: java.lang.Throwable -> Lf0
            r0.write(r8)     // Catch: java.lang.Throwable -> Lf0
            r0.close()
            return
        Lf0:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lf5
            goto Lf9
        Lf5:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lf9:
            throw r8
    }
}
