package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModManagerManifest {
    private static final java.lang.String MANIFEST_DIR = ".javalauncher";
    private static final java.lang.String MANIFEST_FILE = "modmanager_installed.json";
    private static final int SCHEMA_VERSION = 2;

    private ModManagerManifest() {
            r0 = this;
            r0.<init>()
            return
    }

    private static ca.dnamobile.javalauncher.modmanager.ModManagerContentType contentTypeFromEntry(org.json.JSONObject r3) {
            java.lang.String r0 = "contentType"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.optString(r0, r1)
            java.lang.String r2 = r0.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L18
            java.lang.String r0 = "projectType"
            java.lang.String r0 = r3.optString(r0, r1)
        L18:
            java.lang.String r3 = r0.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L24
            r3 = 0
            return r3
        L24:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.fromValue(r0)
            return r3
    }

    private static void deleteIfFile(java.io.File r1) {
            if (r1 == 0) goto Lb
            boolean r0 = r1.isFile()
            if (r0 == 0) goto Lb
            r1.delete()
        Lb:
            return
    }

    private static boolean entryFileExists(java.io.File r2, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3, org.json.JSONObject r4) {
            java.io.File r0 = resolveEntryFile(r2, r3, r4)
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.exists()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.io.File r0 = resolveDisabledEntryFile(r2, r3, r4)
            if (r0 == 0) goto L1b
            boolean r0 = r0.exists()
            if (r0 == 0) goto L1b
            return r1
        L1b:
            java.io.File r2 = resolveEnabledEntryFile(r2, r3, r4)
            if (r2 == 0) goto L28
            boolean r2 = r2.exists()
            if (r2 == 0) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            return r1
    }

    private static boolean entryMatchesFile(java.io.File r5, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6, org.json.JSONObject r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.io.File r0 = resolveEntryFile(r5, r6, r7)
            r1 = 1
            if (r0 == 0) goto L4a
            java.lang.String r2 = safeCanonicalPath(r0)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = stripDisabledSuffix(r0)
            java.io.File r4 = resolveDisabledEntryFile(r5, r6, r7)
            java.io.File r5 = resolveEnabledEntryFile(r5, r6, r7)
            boolean r6 = r8.equals(r2)
            if (r6 == 0) goto L22
            return r1
        L22:
            if (r4 == 0) goto L2f
            java.lang.String r6 = safeCanonicalPath(r4)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L2f
            return r1
        L2f:
            if (r5 == 0) goto L3c
            java.lang.String r5 = safeCanonicalPath(r5)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L3c
            return r1
        L3c:
            boolean r5 = r9.equals(r0)
            if (r5 == 0) goto L43
            return r1
        L43:
            boolean r5 = r10.equals(r3)
            if (r5 == 0) goto L4a
            return r1
        L4a:
            java.lang.String r5 = "fileName"
            java.lang.String r6 = ""
            java.lang.String r5 = r7.optString(r5, r6)
            java.lang.String r6 = r5.trim()
            boolean r6 = r6.isEmpty()
            r7 = 0
            if (r6 != 0) goto L8f
            java.lang.String r6 = stripDisabledSuffix(r5)
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L8e
            boolean r5 = r9.equals(r6)
            if (r5 != 0) goto L8e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r8 = ".disabled"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L8e
            boolean r5 = r10.equals(r6)
            if (r5 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r7
        L8e:
            return r1
        L8f:
            return r7
    }

    public static java.util.ArrayList<org.json.JSONObject> getInstalledEntries(java.io.File r6, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7) {
            pruneMissingFiles(r6, r7)
            java.io.File r6 = getManifestFile(r6)
            org.json.JSONArray r6 = readArray(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L11:
            int r2 = r6.length()
            if (r1 >= r2) goto L38
            org.json.JSONObject r2 = r6.optJSONObject(r1)
            if (r2 != 0) goto L1e
            goto L35
        L1e:
            if (r7 == 0) goto L32
            java.lang.String r3 = r7.name()
            java.lang.String r4 = "contentType"
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L35
        L32:
            r0.add(r2)
        L35:
            int r1 = r1 + 1
            goto L11
        L38:
            return r0
    }

    public static org.json.JSONObject getInstalledEntryForFile(java.io.File r13, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r14, java.io.File r15) {
            pruneMissingFiles(r13, r14)
            java.io.File r0 = getManifestFile(r13)
            org.json.JSONArray r0 = readArray(r0)
            java.lang.String r1 = safeCanonicalPath(r15)
            java.lang.String r15 = r15.getName()
            java.lang.String r2 = stripDisabledSuffix(r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = ".disabled"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5 = 0
        L2b:
            int r6 = r0.length()
            if (r5 >= r6) goto L101
            org.json.JSONObject r6 = r0.optJSONObject(r5)
            if (r6 != 0) goto L39
            goto Lfd
        L39:
            java.lang.String r7 = r14.name()
            java.lang.String r8 = "contentType"
            java.lang.String r9 = ""
            java.lang.String r8 = r6.optString(r8, r9)
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L4d
            goto Lfd
        L4d:
            java.io.File r7 = resolveEntryFile(r13, r14, r6)
            if (r7 == 0) goto La8
            java.lang.String r8 = safeCanonicalPath(r7)
            java.io.File r10 = new java.io.File
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r7.getAbsolutePath()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            java.lang.String r10 = safeCanonicalPath(r10)
            java.io.File r11 = new java.io.File
            java.io.File r12 = r7.getParentFile()
            if (r12 != 0) goto L82
            java.io.File r12 = r14.getTargetDirectory(r13)
            goto L86
        L82:
            java.io.File r12 = r7.getParentFile()
        L86:
            java.lang.String r7 = r7.getName()
            java.lang.String r7 = stripDisabledSuffix(r7)
            r11.<init>(r12, r7)
            java.lang.String r7 = safeCanonicalPath(r11)
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto La7
            boolean r8 = r1.equals(r10)
            if (r8 != 0) goto La7
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto La8
        La7:
            return r6
        La8:
            java.io.File r7 = resolveDisabledEntryFile(r13, r14, r6)
            if (r7 == 0) goto Lb9
            java.lang.String r7 = safeCanonicalPath(r7)
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto Lb9
            return r6
        Lb9:
            java.lang.String r7 = "fileName"
            java.lang.String r7 = r6.optString(r7, r9)
            java.lang.String r8 = r7.trim()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto Lfd
            java.lang.String r8 = stripDisabledSuffix(r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.String r9 = r9.toString()
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto Lfc
            boolean r7 = r15.equals(r8)
            if (r7 != 0) goto Lfc
            boolean r7 = r15.equals(r9)
            if (r7 != 0) goto Lfc
            boolean r7 = r2.equals(r8)
            if (r7 != 0) goto Lfc
            boolean r7 = r3.equals(r9)
            if (r7 == 0) goto Lfd
        Lfc:
            return r6
        Lfd:
            int r5 = r5 + 1
            goto L2b
        L101:
            r13 = 0
            return r13
    }

    public static org.json.JSONObject getInstalledEntryForProject(java.io.File r7, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r8, ca.dnamobile.javalauncher.modmanager.ModManagerSource r9, java.lang.String r10) {
            java.lang.String r0 = r10.trim()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            pruneMissingFiles(r7, r8)
            java.io.File r0 = getManifestFile(r7)
            org.json.JSONArray r0 = readArray(r0)
            r2 = 0
        L18:
            int r3 = r0.length()
            if (r2 >= r3) goto L53
            org.json.JSONObject r3 = r0.optJSONObject(r2)
            if (r3 != 0) goto L25
            goto L50
        L25:
            java.lang.String r4 = "projectId"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L50
            boolean r4 = sourceMatches(r3, r9)
            if (r4 == 0) goto L50
            java.lang.String r4 = r8.name()
            java.lang.String r6 = "contentType"
            java.lang.String r5 = r3.optString(r6, r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L50
            boolean r4 = entryFileExists(r7, r8, r3)
            if (r4 == 0) goto L50
            return r3
        L50:
            int r2 = r2 + 1
            goto L18
        L53:
            return r1
    }

    public static org.json.JSONObject getInstalledEntryForProject(java.io.File r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1, java.lang.String r2, java.lang.String r3) {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.fromId(r2)
            org.json.JSONObject r0 = getInstalledEntryForProject(r0, r1, r2, r3)
            return r0
    }

    public static java.io.File getInstalledIconFileForFile(java.io.File r1, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2, java.io.File r3) {
            org.json.JSONObject r1 = getInstalledEntryForFile(r1, r2, r3)
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            java.lang.String r3 = "cachedIconPath"
            java.lang.String r0 = ""
            java.lang.String r1 = r1.optString(r3, r0)
            java.lang.String r3 = r1.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2a
            java.io.File r3 = new java.io.File
            java.lang.String r1 = r1.trim()
            r3.<init>(r1)
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L2a
            return r3
        L2a:
            return r2
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerSource getInstalledSourceForFile(java.io.File r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1, java.io.File r2) {
            org.json.JSONObject r0 = getInstalledEntryForFile(r0, r1, r2)
            if (r0 != 0) goto L9
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            goto Ld
        L9:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = getSource(r0)
        Ld:
            return r0
    }

    private static java.io.File getManifestFile(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".javalauncher"
            r1.<init>(r3, r2)
            java.lang.String r3 = "modmanager_installed.json"
            r0.<init>(r1, r3)
            return r0
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerSource getSource(org.json.JSONObject r3) {
            java.lang.String r0 = "platform"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.optString(r0, r1)
            java.lang.String r2 = r0.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L17
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.fromId(r0)
            return r3
        L17:
            java.lang.String r0 = "source"
            java.lang.String r3 = r3.optString(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.fromId(r3)
            return r3
    }

    public static boolean isProjectInstalled(java.io.File r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1, java.lang.String r2, java.lang.String r3) {
            org.json.JSONObject r0 = getInstalledEntryForProject(r0, r1, r2, r3)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static java.lang.String now() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public static int pruneMissingFiles(java.io.File r1) {
            r0 = 0
            int r1 = pruneMissingFiles(r1, r0)
            return r1
    }

    public static int pruneMissingFiles(java.io.File r7, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r8) {
            java.io.File r0 = getManifestFile(r7)
            org.json.JSONArray r1 = readArray(r0)
            int r2 = r1.length()
            r3 = 0
            if (r2 != 0) goto L10
            return r3
        L10:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r4 = r3
        L16:
            int r5 = r1.length()
            if (r3 >= r5) goto L3f
            org.json.JSONObject r5 = r1.optJSONObject(r3)
            if (r5 != 0) goto L25
        L22:
            int r4 = r4 + 1
            goto L3c
        L25:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6 = contentTypeFromEntry(r5)
            if (r8 == 0) goto L31
            if (r6 == r8) goto L31
            r2.put(r5)
            goto L3c
        L31:
            if (r6 == 0) goto L39
            boolean r6 = entryFileExists(r7, r6, r5)
            if (r6 == 0) goto L22
        L39:
            r2.put(r5)
        L3c:
            int r3 = r3 + 1
            goto L16
        L3f:
            if (r4 <= 0) goto L44
            writeArray(r0, r2)
        L44:
            return r4
    }

    private static org.json.JSONArray readArray(java.io.File r2) {
            boolean r0 = r2.isFile()
            if (r0 != 0) goto Lc
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            return r2
        Lc:
            java.lang.String r2 = readString(r2)     // Catch: java.lang.Throwable -> L24
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L1e
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L20
        L1e:
            java.lang.String r2 = "[]"
        L20:
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            return r2
    }

    private static java.lang.String readString(java.io.File r4) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r1 = 16384(0x4000, float:2.2959E-41)
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

    public static void recordInstalled(java.io.File r12, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r13, ca.dnamobile.javalauncher.modmanager.ModManagerSource r14, ca.dnamobile.javalauncher.modmanager.ModrinthProject r15, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r16, ca.dnamobile.javalauncher.modmanager.ModrinthFile r17, java.io.File r18, boolean r19, java.lang.String r20, java.lang.String r21) {
            r3 = r15
            java.lang.String r10 = r3.iconUrl
            r11 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            recordInstalled(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void recordInstalled(java.io.File r13, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r14, ca.dnamobile.javalauncher.modmanager.ModManagerSource r15, ca.dnamobile.javalauncher.modmanager.ModrinthProject r16, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r17, ca.dnamobile.javalauncher.modmanager.ModrinthFile r18, java.io.File r19, boolean r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.io.File r24) {
            r0 = r16
            r1 = r17
            r2 = r18
            java.io.File r3 = getManifestFile(r13)
            org.json.JSONArray r4 = readArray(r3)
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r6 = 0
        L14:
            int r7 = r4.length()
            java.lang.String r8 = "contentType"
            java.lang.String r9 = "projectId"
            java.lang.String r10 = ""
            if (r6 >= r7) goto L50
            org.json.JSONObject r7 = r4.optJSONObject(r6)
            if (r7 != 0) goto L28
            r11 = r15
            goto L4d
        L28:
            java.lang.String r11 = r0.projectId
            java.lang.String r9 = r7.optString(r9, r10)
            boolean r9 = r11.equals(r9)
            r11 = r15
            if (r9 == 0) goto L4a
            boolean r9 = sourceMatches(r7, r15)
            if (r9 == 0) goto L4a
            java.lang.String r9 = r14.name()
            java.lang.String r8 = r7.optString(r8, r10)
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L4a
            goto L4d
        L4a:
            r5.put(r7)
        L4d:
            int r6 = r6 + 1
            goto L14
        L50:
            r11 = r15
            java.lang.String r4 = now()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "schema"
            r12 = 2
            r6.put(r7, r12)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "source"
            java.lang.String r12 = r15.getId()     // Catch: java.lang.Throwable -> L124
            r6.put(r7, r12)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "platform"
            java.lang.String r12 = r15.getId()     // Catch: java.lang.Throwable -> L124
            r6.put(r7, r12)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "platformName"
            java.lang.String r11 = r15.getDisplayName()     // Catch: java.lang.Throwable -> L124
            r6.put(r7, r11)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = r14.name()     // Catch: java.lang.Throwable -> L124
            r6.put(r8, r7)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "projectType"
            java.lang.String r8 = r14.getModrinthProjectType()     // Catch: java.lang.Throwable -> L124
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "minecraftVersion"
            if (r21 != 0) goto L91
            r8 = r10
            goto L93
        L91:
            r8 = r21
        L93:
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "loader"
            if (r22 != 0) goto L9c
            r8 = r10
            goto L9e
        L9c:
            r8 = r22
        L9e:
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = r0.projectId     // Catch: java.lang.Throwable -> L124
            r6.put(r9, r7)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "platformProjectId"
            java.lang.String r8 = r0.projectId     // Catch: java.lang.Throwable -> L124
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "slug"
            java.lang.String r8 = r0.slug     // Catch: java.lang.Throwable -> L124
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L124
            java.lang.String r7 = "title"
            java.lang.String r0 = r0.title     // Catch: java.lang.Throwable -> L124
            r6.put(r7, r0)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "versionId"
            java.lang.String r7 = r1.id     // Catch: java.lang.Throwable -> L124
            r6.put(r0, r7)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "platformVersionId"
            java.lang.String r7 = r1.id     // Catch: java.lang.Throwable -> L124
            r6.put(r0, r7)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "versionNumber"
            java.lang.String r1 = r1.versionNumber     // Catch: java.lang.Throwable -> L124
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "fileName"
            java.lang.String r1 = r19.getName()     // Catch: java.lang.Throwable -> L124
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "targetPath"
            java.lang.String r1 = r19.getAbsolutePath()     // Catch: java.lang.Throwable -> L124
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "downloadUrl"
            java.lang.String r1 = r2.url     // Catch: java.lang.Throwable -> L124
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "iconUrl"
            if (r23 != 0) goto Lef
            r1 = r10
            goto Lf1
        Lef:
            r1 = r23
        Lf1:
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "cachedIconPath"
            if (r24 == 0) goto L103
            boolean r1 = r24.isFile()     // Catch: java.lang.Throwable -> L124
            if (r1 == 0) goto L103
            java.lang.String r1 = r24.getAbsolutePath()     // Catch: java.lang.Throwable -> L124
            goto L104
        L103:
            r1 = r10
        L104:
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "sha1"
            java.lang.String r1 = r2.sha1     // Catch: java.lang.Throwable -> L124
            if (r1 != 0) goto L10e
            goto L110
        L10e:
            java.lang.String r10 = r2.sha1     // Catch: java.lang.Throwable -> L124
        L110:
            r6.put(r0, r10)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "dependency"
            r1 = r20
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "installedAt"
            r6.put(r0, r4)     // Catch: java.lang.Throwable -> L124
            java.lang.String r0 = "updatedAt"
            r6.put(r0, r4)     // Catch: java.lang.Throwable -> L124
        L124:
            r5.put(r6)
            writeArray(r3, r5)
            return
    }

    public static void recordInstalled(java.io.File r10, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r11, java.lang.String r12, ca.dnamobile.javalauncher.modmanager.ModrinthProject r13, ca.dnamobile.javalauncher.modmanager.ModrinthVersion r14, ca.dnamobile.javalauncher.modmanager.ModrinthFile r15, java.io.File r16, boolean r17) {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.fromId(r12)
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r0 = r10
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            recordInstalled(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void removeEntryForFile(java.io.File r16, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r17, java.io.File r18) {
            java.io.File r0 = getManifestFile(r16)
            org.json.JSONArray r1 = readArray(r0)
            int r2 = r1.length()
            if (r2 != 0) goto Lf
            return
        Lf:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.lang.String r9 = safeCanonicalPath(r18)
            java.lang.String r10 = r18.getName()
            java.lang.String r11 = stripDisabledSuffix(r10)
            r3 = 0
            r12 = r3
            r13 = r12
        L23:
            int r3 = r1.length()
            if (r12 >= r3) goto L5d
            org.json.JSONObject r14 = r1.optJSONObject(r12)
            r15 = 1
            if (r14 != 0) goto L32
        L30:
            r13 = r15
            goto L5a
        L32:
            java.lang.String r3 = r17.name()
            java.lang.String r4 = "contentType"
            java.lang.String r5 = ""
            java.lang.String r4 = r14.optString(r4, r5)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L48
            r2.put(r14)
            goto L5a
        L48:
            r3 = r16
            r4 = r17
            r5 = r14
            r6 = r9
            r7 = r10
            r8 = r11
            boolean r3 = entryMatchesFile(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L57
            goto L30
        L57:
            r2.put(r14)
        L5a:
            int r12 = r12 + 1
            goto L23
        L5d:
            if (r13 == 0) goto L62
            writeArray(r0, r2)
        L62:
            return
    }

    public static void removeKnownFilesForProject(java.io.File r8, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r9, ca.dnamobile.javalauncher.modmanager.ModManagerSource r10, java.lang.String r11) {
            java.io.File r0 = getManifestFile(r8)
            org.json.JSONArray r1 = readArray(r0)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r3 = 0
        Le:
            int r4 = r1.length()
            if (r3 >= r4) goto L5b
            org.json.JSONObject r4 = r1.optJSONObject(r3)
            if (r4 != 0) goto L1b
            goto L58
        L1b:
            java.lang.String r5 = "projectId"
            java.lang.String r6 = ""
            java.lang.String r5 = r4.optString(r5, r6)
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L55
            boolean r5 = sourceMatches(r4, r10)
            if (r5 == 0) goto L55
            java.lang.String r5 = r9.name()
            java.lang.String r7 = "contentType"
            java.lang.String r6 = r4.optString(r7, r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L55
            java.io.File r5 = resolveEntryFile(r8, r9, r4)
            deleteIfFile(r5)
            java.io.File r5 = resolveDisabledEntryFile(r8, r9, r4)
            deleteIfFile(r5)
            java.io.File r4 = resolveEnabledEntryFile(r8, r9, r4)
            deleteIfFile(r4)
            goto L58
        L55:
            r2.put(r4)
        L58:
            int r3 = r3 + 1
            goto Le
        L5b:
            writeArray(r0, r2)
            return
    }

    public static void removeKnownFilesForProject(java.io.File r0, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1, java.lang.String r2, java.lang.String r3) {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.fromId(r2)
            removeKnownFilesForProject(r0, r1, r2, r3)
            return
    }

    private static java.io.File resolveDisabledEntryFile(java.io.File r4, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, org.json.JSONObject r6) {
            java.io.File r6 = resolveEntryFile(r4, r5, r6)
            if (r6 != 0) goto L8
            r4 = 0
            return r4
        L8:
            java.lang.String r0 = r6.getName()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r2 = ".disabled"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L1b
            return r6
        L1b:
            java.io.File r1 = new java.io.File
            java.io.File r3 = r6.getParentFile()
            if (r3 != 0) goto L28
            java.io.File r4 = r5.getTargetDirectory(r4)
            goto L2c
        L28:
            java.io.File r4 = r6.getParentFile()
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r4, r5)
            return r1
    }

    private static java.io.File resolveEnabledEntryFile(java.io.File r3, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4, org.json.JSONObject r5) {
            java.io.File r5 = resolveEntryFile(r3, r4, r5)
            if (r5 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = r5.getName()
            java.lang.String r0 = stripDisabledSuffix(r0)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r5.getParentFile()
            if (r2 != 0) goto L1d
            java.io.File r3 = r4.getTargetDirectory(r3)
            goto L21
        L1d:
            java.io.File r3 = r5.getParentFile()
        L21:
            r1.<init>(r3, r0)
            return r1
    }

    private static java.io.File resolveEntryFile(java.io.File r3, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4, org.json.JSONObject r5) {
            java.lang.String r0 = "targetPath"
            java.lang.String r1 = ""
            java.lang.String r0 = r5.optString(r0, r1)
            java.lang.String r2 = r0.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L18
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            return r3
        L18:
            java.lang.String r0 = "fileName"
            java.lang.String r5 = r5.optString(r0, r1)
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            r3 = 0
            return r3
        L2a:
            java.io.File r0 = new java.io.File
            java.io.File r3 = r4.getTargetDirectory(r3)
            r0.<init>(r3, r5)
            return r0
    }

    private static java.lang.String safeCanonicalPath(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private static boolean sourceMatches(org.json.JSONObject r2, ca.dnamobile.javalauncher.modmanager.ModManagerSource r3) {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = getSource(r2)
            if (r0 == r3) goto L1b
            java.lang.String r3 = r3.getId()
            java.lang.String r0 = "source"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.optString(r0, r1)
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            goto L1c
        L1b:
            r2 = 1
        L1c:
            return r2
    }

    private static java.lang.String stripDisabledSuffix(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.toLowerCase(r0)
            java.lang.String r1 = ".disabled"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L1c
            int r0 = r2.length()
            int r1 = r1.length()
            int r0 = r0 - r1
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L1c:
            return r2
    }

    public static void updateEntryFileTarget(java.io.File r16, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r17, java.io.File r18, java.io.File r19) {
            java.io.File r0 = getManifestFile(r16)
            org.json.JSONArray r1 = readArray(r0)
            int r2 = r1.length()
            if (r2 != 0) goto Lf
            return
        Lf:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.lang.String r9 = safeCanonicalPath(r18)
            java.lang.String r10 = r18.getName()
            java.lang.String r11 = stripDisabledSuffix(r10)
            java.lang.String r12 = now()
            r3 = 0
            r13 = r3
            r14 = r13
        L27:
            int r3 = r1.length()
            if (r13 >= r3) goto L72
            org.json.JSONObject r15 = r1.optJSONObject(r13)
            if (r15 != 0) goto L34
            goto L6f
        L34:
            java.lang.String r3 = r17.name()
            java.lang.String r4 = "contentType"
            java.lang.String r5 = ""
            java.lang.String r4 = r15.optString(r4, r5)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L6c
            r3 = r16
            r4 = r17
            r5 = r15
            r6 = r9
            r7 = r10
            r8 = r11
            boolean r3 = entryMatchesFile(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L6c
            java.lang.String r3 = "fileName"
            java.lang.String r4 = r19.getName()     // Catch: java.lang.Throwable -> L6b
            r15.put(r3, r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "targetPath"
            java.lang.String r4 = r19.getAbsolutePath()     // Catch: java.lang.Throwable -> L6b
            r15.put(r3, r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "updatedAt"
            r15.put(r3, r12)     // Catch: java.lang.Throwable -> L6b
        L6b:
            r14 = 1
        L6c:
            r2.put(r15)
        L6f:
            int r13 = r13 + 1
            goto L27
        L72:
            if (r14 == 0) goto L77
            writeArray(r0, r2)
        L77:
            return
    }

    private static void writeArray(java.io.File r2, org.json.JSONArray r3) {
            java.io.File r0 = r2.getParentFile()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Lf
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto Lf
            r0.mkdirs()     // Catch: java.lang.Throwable -> L31
        Lf:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L31
            r1 = 0
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L31
            r2 = 2
            java.lang.String r2 = r3.toString(r2)     // Catch: java.lang.Throwable -> L27
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L27
            byte[] r2 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> L27
            r0.write(r2)     // Catch: java.lang.Throwable -> L27
            r0.close()     // Catch: java.lang.Throwable -> L31
            goto L31
        L27:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.lang.Throwable -> L31
        L30:
            throw r2     // Catch: java.lang.Throwable -> L31
        L31:
            return
    }
}
