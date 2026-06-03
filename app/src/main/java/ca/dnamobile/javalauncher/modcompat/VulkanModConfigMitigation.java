package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class VulkanModConfigMitigation {
    private static final java.lang.String TAG = "VulkanModConfigMitigation";
    private static final java.util.regex.Pattern VERSION_PATTERN = null;

    static {
            java.lang.String r0 = "VulkanMod.*?([0-9]+\\.[0-9]+\\.[0-9]+).*?\\.jar"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            ca.dnamobile.javalauncher.modcompat.VulkanModConfigMitigation.VERSION_PATTERN = r0
            return
    }

    private VulkanModConfigMitigation() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int compareVersions(java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r5.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r5.length
            int r1 = r6.length
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L26
            int r3 = parseVersionPart(r5, r2)
            int r4 = parseVersionPart(r6, r2)
            if (r3 == r4) goto L23
            int r5 = java.lang.Integer.compare(r3, r4)
            return r5
        L23:
            int r2 = r2 + 1
            goto L12
        L26:
            return r1
    }

    private static java.lang.String extractVersion(java.lang.String r1) {
            java.util.regex.Pattern r0 = ca.dnamobile.javalauncher.modcompat.VulkanModConfigMitigation.VERSION_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 != 0) goto Le
            r1 = 0
            return r1
        Le:
            r0 = 1
            java.lang.String r1 = r1.group(r0)
            return r1
    }

    private static java.io.File findVulkanModJar(java.io.File r10) {
            java.io.File r0 = r10.getParentFile()
            java.lang.String r1 = "mods"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1c
            r4 = 2
            java.io.File[] r4 = new java.io.File[r4]
            java.io.File r5 = new java.io.File
            r5.<init>(r10, r1)
            r4[r2] = r5
            java.io.File r10 = new java.io.File
            r10.<init>(r0, r1)
            r4[r3] = r10
            goto L25
        L1c:
            java.io.File[] r4 = new java.io.File[r3]
            java.io.File r0 = new java.io.File
            r0.<init>(r10, r1)
            r4[r2] = r0
        L25:
            int r10 = r4.length
            r0 = r2
        L27:
            if (r0 >= r10) goto L6a
            r1 = r4[r0]
            boolean r3 = r1.isDirectory()
            if (r3 != 0) goto L32
            goto L67
        L32:
            java.io.File[] r1 = r1.listFiles()
            if (r1 != 0) goto L39
            goto L67
        L39:
            int r3 = r1.length
            r5 = r2
        L3b:
            if (r5 >= r3) goto L67
            r6 = r1[r5]
            boolean r7 = r6.isFile()
            if (r7 != 0) goto L46
            goto L63
        L46:
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = r7.toLowerCase()
            java.lang.String r9 = ".jar"
            boolean r8 = r8.endsWith(r9)
            if (r8 != 0) goto L57
            goto L63
        L57:
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r8 = "vulkanmod"
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L66
        L63:
            int r5 = r5 + 1
            goto L3b
        L66:
            return r6
        L67:
            int r0 = r0 + 1
            goto L27
        L6a:
            r10 = 0
            return r10
    }

    private static int parseVersionPart(java.lang.String[] r2, int r3) {
            int r0 = r2.length
            r1 = 0
            if (r3 < r0) goto L5
            return r1
        L5:
            r2 = r2[r3]     // Catch: java.lang.Throwable -> Lc
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            return r1
    }

    public static void prepare(java.io.File r9) {
            java.lang.String r0 = "videoMode"
            java.lang.String r1 = "VulkanModConfigMitigation"
            java.lang.String r2 = "Forced windowMode=2 for VulkanMod "
            java.lang.String r3 = "Could not create config dir: "
            java.lang.String r4 = "Skipped for VulkanMod "
            java.lang.String r5 = "VulkanMod found but version could not be parsed: "
            if (r9 != 0) goto Lf
            return
        Lf:
            java.io.File r6 = findVulkanModJar(r9)     // Catch: java.lang.Throwable -> Le0
            if (r6 != 0) goto L1b
            java.lang.String r9 = "No VulkanMod jar found."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)     // Catch: java.lang.Throwable -> Le0
            return
        L1b:
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r7 = extractVersion(r7)     // Catch: java.lang.Throwable -> Le0
            if (r7 == 0) goto Lcb
            java.lang.String r8 = r7.trim()     // Catch: java.lang.Throwable -> Le0
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Le0
            if (r8 == 0) goto L31
            goto Lcb
        L31:
            java.lang.String r5 = "0.6.3"
            int r5 = compareVersions(r7, r5)     // Catch: java.lang.Throwable -> Le0
            if (r5 >= 0) goto L4a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r9.<init>(r4)     // Catch: java.lang.Throwable -> Le0
            java.lang.StringBuilder r9 = r9.append(r7)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le0
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)     // Catch: java.lang.Throwable -> Le0
            return
        L4a:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Le0
            java.lang.String r5 = "config"
            r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> Le0
            boolean r9 = r4.exists()     // Catch: java.lang.Throwable -> Le0
            if (r9 != 0) goto L72
            boolean r9 = r4.mkdirs()     // Catch: java.lang.Throwable -> Le0
            if (r9 != 0) goto L72
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r9.<init>(r3)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Le0
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le0
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)     // Catch: java.lang.Throwable -> Le0
            return
        L72:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> Le0
            java.lang.String r3 = "vulkanmod_settings.json"
            r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> Le0
            org.json.JSONObject r3 = readJson(r9)     // Catch: java.lang.Throwable -> Le0
            org.json.JSONObject r4 = r3.optJSONObject(r0)     // Catch: java.lang.Throwable -> Le0
            if (r4 != 0) goto L88
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le0
            r4.<init>()     // Catch: java.lang.Throwable -> Le0
        L88:
            java.lang.String r5 = "width"
            r6 = -1
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r5 = "height"
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r5 = "bitDepth"
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r5 = "refreshRate"
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> Le0
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = "windowMode"
            r4 = 2
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le0
            java.nio.file.Path r9 = r9.toPath()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r3.toString(r4)     // Catch: java.lang.Throwable -> Le0
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Le0
            byte[] r0 = r0.getBytes(r3)     // Catch: java.lang.Throwable -> Le0
            r3 = 0
            java.nio.file.OpenOption[] r3 = new java.nio.file.OpenOption[r3]     // Catch: java.lang.Throwable -> Le0
            java.nio.file.Files.write(r9, r0, r3)     // Catch: java.lang.Throwable -> Le0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r9.<init>(r2)     // Catch: java.lang.Throwable -> Le0
            java.lang.StringBuilder r9 = r9.append(r7)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le0
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)     // Catch: java.lang.Throwable -> Le0
            goto Le6
        Lcb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le0
            r9.<init>(r5)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> Le0
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le0
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)     // Catch: java.lang.Throwable -> Le0
            return
        Le0:
            r9 = move-exception
            java.lang.String r0 = "Failed to apply VulkanMod config mitigation"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r0, r9)
        Le6:
            return
    }

    private static org.json.JSONObject readJson(java.io.File r3) {
            boolean r0 = r3.isFile()
            if (r0 != 0) goto Lc
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            return r3
        Lc:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L21
            java.nio.file.Path r1 = r3.toPath()     // Catch: java.lang.Throwable -> L21
            byte[] r1 = java.nio.file.Files.readAllBytes(r1)     // Catch: java.lang.Throwable -> L21
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L21
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L21
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L21
            return r1
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid VulkanMod config JSON, recreating: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "VulkanModConfigMitigation"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            return r3
    }
}
