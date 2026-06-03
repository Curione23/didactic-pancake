package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModrinthApiClient {
    private static final java.lang.String BASE_URL = "https://api.modrinth.com/v2";
    private static final java.lang.String USER_AGENT = "JavaLauncher/1.0 (Android Minecraft Launcher)";

    public static final class SearchResult {
        public final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> hits;
        public final int limit;
        public final int offset;
        public final int totalHits;

        SearchResult(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.hits = r1
                r0.offset = r2
                r0.limit = r3
                r0.totalHits = r4
                return
        }
    }

    public ModrinthApiClient() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void appendQuery(java.lang.StringBuilder r3, java.lang.String r4, java.lang.String r5) throws java.lang.Exception {
            int r0 = r3.length()
            int r0 = r0 + (-1)
            char r0 = r3.charAt(r0)
            r1 = 63
            r2 = 38
            if (r0 == r1) goto L1f
            int r0 = r3.length()
            int r0 = r0 + (-1)
            char r0 = r3.charAt(r0)
            if (r0 == r2) goto L1f
            r3.append(r2)
        L1f:
            java.lang.String r0 = "UTF-8"
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r0)
            java.lang.StringBuilder r4 = r3.append(r4)
            r1 = 61
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r0)
            r4.append(r5)
            r3.append(r2)
            return
    }

    private org.json.JSONArray buildSearchFacets(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "project_type:"
            r2.<init>(r3)
            java.lang.String r3 = r5.getModrinthProjectType()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            org.json.JSONArray r1 = r1.put(r2)
            r0.put(r1)
            boolean r1 = isBlank(r6)
            if (r1 != 0) goto L49
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "versions:"
            r2.<init>(r3)
            java.lang.String r6 = r6.trim()
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            org.json.JSONArray r6 = r1.put(r6)
            r0.put(r6)
        L49:
            java.lang.String r6 = normalizeLoader(r7)
            boolean r5 = r5.isLoaderSpecific()
            if (r5 == 0) goto L7c
            boolean r5 = isBlank(r6)
            if (r5 != 0) goto L7c
            java.lang.String r5 = "vanilla"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7c
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "categories:"
            r7.<init>(r1)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            org.json.JSONArray r5 = r5.put(r6)
            r0.put(r5)
        L7c:
            return r0
    }

    private org.json.JSONArray buildVersionLoaders(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2, java.lang.String r3) {
            r1 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r3 = normalizeLoader(r3)
            boolean r2 = r2.isLoaderSpecific()
            if (r2 == 0) goto L20
            boolean r2 = isBlank(r3)
            if (r2 != 0) goto L20
            java.lang.String r2 = "vanilla"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            r0.put(r3)
        L20:
            return r0
    }

    private static java.lang.String encodePath(java.lang.String r2) throws java.lang.Exception {
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)
            java.lang.String r0 = "+"
            java.lang.String r1 = "%20"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private java.lang.String get(java.lang.String r5) throws java.lang.Exception {
            r4 = this;
            java.net.HttpURLConnection r5 = r4.openConnection(r5)
            int r0 = r5.getResponseCode()
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L15
            if (r0 >= r1) goto L15
            java.io.InputStream r3 = r5.getInputStream()
            goto L19
        L15:
            java.io.InputStream r3 = r5.getErrorStream()
        L19:
            java.lang.String r3 = readText(r3)
            r5.disconnect()
            if (r0 < r2) goto L25
            if (r0 >= r1) goto L25
            return r3
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Modrinth API HTTP "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    private static boolean isBlank(java.lang.String r0) {
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

    public static java.lang.String normalizeLoader(java.lang.String r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r1 = r2.contains(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "neo forge"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L20
            goto L4d
        L20:
            java.lang.String r0 = "forge"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.String r0 = "fabric"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L32
            return r0
        L32:
            java.lang.String r0 = "quilt"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L3b
            return r0
        L3b:
            java.lang.String r0 = "vanilla"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L44
            return r0
        L44:
            r0 = 32
            r1 = 45
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
        L4d:
            return r0
    }

    private java.net.HttpURLConnection openConnection(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            java.net.URLConnection r3 = r0.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)
            java.lang.String r0 = "Accept"
            java.lang.String r1 = "application/json"
            r3.setRequestProperty(r0, r1)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher/1.0 (Android Minecraft Launcher)"
            r3.setRequestProperty(r0, r1)
            return r3
    }

    private static ca.dnamobile.javalauncher.modmanager.ModrinthProject parseProject(org.json.JSONObject r20, boolean r21) {
            r0 = r20
            java.lang.String r1 = "id"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.String r3 = "project_id"
            java.lang.String r5 = r0.optString(r3, r1)
            java.lang.String r1 = "slug"
            java.lang.String r6 = r0.optString(r1, r5)
            java.lang.String r1 = "title"
            java.lang.String r7 = r0.optString(r1, r6)
            java.lang.String r1 = "team"
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.String r3 = "author"
            java.lang.String r8 = r0.optString(r3, r1)
            java.lang.String r1 = "summary"
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.String r3 = "description"
            java.lang.String r9 = r0.optString(r3, r1)
            java.lang.String r1 = "body"
            r3 = 0
            java.lang.String r10 = r0.optString(r1, r3)
            java.lang.String r1 = "icon_url"
            java.lang.String r11 = r0.optString(r1, r3)
            java.lang.String r1 = "project_type"
            java.lang.String r4 = "mod"
            java.lang.String r12 = r0.optString(r1, r4)
            java.lang.String r1 = "downloads"
            r13 = 0
            long r15 = r0.optLong(r1, r13)
            java.lang.String r1 = "followers"
            long r13 = r0.optLong(r1, r13)
            java.lang.String r1 = "follows"
            long r17 = r0.optLong(r1, r13)
            java.lang.String r1 = "updated"
            java.lang.String r1 = r0.optString(r1, r3)
            java.lang.String r3 = "date_modified"
            java.lang.String r1 = r0.optString(r3, r1)
            java.lang.String r3 = "categories"
            org.json.JSONArray r3 = r0.optJSONArray(r3)
            java.util.ArrayList r3 = readStringArray(r3)
            java.lang.String r4 = "additional_categories"
            org.json.JSONArray r4 = r0.optJSONArray(r4)
            if (r4 == 0) goto L82
            java.util.ArrayList r4 = readStringArray(r4)
            r3.addAll(r4)
        L82:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r4 = "gallery"
            org.json.JSONArray r0 = r0.optJSONArray(r4)
            if (r0 == 0) goto Lb9
            r4 = 0
        L90:
            int r14 = r0.length()
            if (r4 >= r14) goto Lb9
            org.json.JSONObject r14 = r0.optJSONObject(r4)
            if (r14 != 0) goto L9f
            r20 = r0
            goto Lb4
        L9f:
            r20 = r0
            java.lang.String r0 = "url"
            java.lang.String r0 = r14.optString(r0, r2)
            java.lang.String r14 = r0.trim()
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto Lb4
            r13.add(r0)
        Lb4:
            int r4 = r4 + 1
            r0 = r20
            goto L90
        Lb9:
            if (r21 != 0) goto Lc4
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc4
            r3.add(r12)
        Lc4:
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = new ca.dnamobile.javalauncher.modmanager.ModrinthProject
            r4 = r0
            r2 = r13
            r13 = r15
            r15 = r17
            r17 = r1
            r18 = r3
            r19 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19)
            return r0
    }

    private static ca.dnamobile.javalauncher.modmanager.ModrinthVersion parseVersion(org.json.JSONObject r21) {
            r0 = r21
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r1 = "dependencies"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            java.lang.String r2 = "project_id"
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L44
            r5 = r3
        L14:
            int r6 = r1.length()
            if (r5 >= r6) goto L44
            org.json.JSONObject r6 = r1.optJSONObject(r5)
            if (r6 != 0) goto L21
            goto L41
        L21:
            ca.dnamobile.javalauncher.modmanager.ModrinthDependency r7 = new ca.dnamobile.javalauncher.modmanager.ModrinthDependency
            java.lang.String r8 = "version_id"
            java.lang.String r8 = r6.optString(r8, r4)
            java.lang.String r9 = r6.optString(r2, r4)
            java.lang.String r10 = "file_name"
            java.lang.String r10 = r6.optString(r10, r4)
            java.lang.String r11 = "dependency_type"
            java.lang.String r13 = "required"
            java.lang.String r6 = r6.optString(r11, r13)
            r7.<init>(r8, r9, r10, r6)
            r12.add(r7)
        L41:
            int r5 = r5 + 1
            goto L14
        L44:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r1 = "files"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            java.lang.String r7 = ""
            if (r1 == 0) goto L9e
            r8 = r3
        L54:
            int r9 = r1.length()
            if (r8 >= r9) goto L9e
            org.json.JSONObject r9 = r1.optJSONObject(r8)
            if (r9 != 0) goto L61
            goto L99
        L61:
            java.lang.String r10 = "hashes"
            org.json.JSONObject r10 = r9.optJSONObject(r10)
            ca.dnamobile.javalauncher.modmanager.ModrinthFile r11 = new ca.dnamobile.javalauncher.modmanager.ModrinthFile
            java.lang.String r14 = "url"
            java.lang.String r15 = r9.optString(r14, r7)
            java.lang.String r14 = "filename"
            java.lang.String r5 = "download.jar"
            java.lang.String r16 = r9.optString(r14, r5)
            if (r10 == 0) goto L82
            java.lang.String r5 = "sha1"
            java.lang.String r5 = r10.optString(r5, r4)
            r17 = r5
            goto L84
        L82:
            r17 = r4
        L84:
            java.lang.String r5 = "primary"
            boolean r18 = r9.optBoolean(r5, r3)
            java.lang.String r5 = "size"
            r3 = 0
            long r19 = r9.optLong(r5, r3)
            r14 = r11
            r14.<init>(r15, r16, r17, r18, r19)
            r13.add(r11)
        L99:
            int r8 = r8 + 1
            r3 = 0
            r4 = 0
            goto L54
        L9e:
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r14 = new ca.dnamobile.javalauncher.modmanager.ModrinthVersion
            java.lang.String r1 = "id"
            java.lang.String r1 = r0.optString(r1, r7)
            java.lang.String r2 = r0.optString(r2, r7)
            java.lang.String r3 = "name"
            java.lang.String r4 = "version_number"
            java.lang.String r5 = r0.optString(r4, r7)
            java.lang.String r3 = r0.optString(r3, r5)
            java.lang.String r4 = r0.optString(r4, r7)
            java.lang.String r5 = "version_type"
            java.lang.String r6 = "release"
            java.lang.String r5 = r0.optString(r5, r6)
            java.lang.String r6 = "date_published"
            r7 = 0
            java.lang.String r6 = r0.optString(r6, r7)
            java.lang.String r8 = "changelog"
            java.lang.String r7 = r0.optString(r8, r7)
            java.lang.String r8 = "downloads"
            r9 = 0
            long r8 = r0.optLong(r8, r9)
            java.lang.String r10 = "game_versions"
            org.json.JSONArray r10 = r0.optJSONArray(r10)
            java.util.ArrayList r10 = readStringArray(r10)
            java.lang.String r11 = "loaders"
            org.json.JSONArray r0 = r0.optJSONArray(r11)
            java.util.ArrayList r11 = readStringArray(r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            return r14
    }

    private static java.util.ArrayList<java.lang.String> readStringArray(org.json.JSONArray r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 != 0) goto L8
            return r0
        L8:
            r1 = 0
        L9:
            int r2 = r4.length()
            if (r1 >= r2) goto L25
            java.lang.String r2 = ""
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L22
            r0.add(r2)
        L22:
            int r1 = r1 + 1
            goto L9
        L25:
            return r0
    }

    private static java.lang.String readText(java.io.InputStream r4) throws java.lang.Exception {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2e
        Lf:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L2e
            r3 = -1
            if (r2 == r3) goto L1b
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L2e
            goto Lf
        L1b:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r0.toString(r1)     // Catch: java.lang.Throwable -> L2e
            r0.close()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L2d
            r4.close()
        L2d:
            return r1
        L2e:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L38
        L37:
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            if (r4 == 0) goto L43
            r4.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r4 = move-exception
            r0.addSuppressed(r4)
        L43:
            throw r0
    }

    public void downloadToFile(java.lang.String r5, java.io.File r6) throws java.lang.Exception {
            r4 = this;
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create folder: "
            r6.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L2c:
            java.net.HttpURLConnection r0 = r4.openConnection(r5)
            int r1 = r0.getResponseCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L7c
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L7c
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L77
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6b
            r6 = 65536(0x10000, float:9.1835E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L61
        L49:
            int r2 = r5.read(r6)     // Catch: java.lang.Throwable -> L61
            r3 = -1
            if (r2 == r3) goto L55
            r3 = 0
            r1.write(r6, r3, r2)     // Catch: java.lang.Throwable -> L61
            goto L49
        L55:
            r1.close()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L5d
            r5.close()     // Catch: java.lang.Throwable -> L77
        L5d:
            r0.disconnect()
            return
        L61:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch: java.lang.Throwable -> L6b
        L6a:
            throw r6     // Catch: java.lang.Throwable -> L6b
        L6b:
            r6 = move-exception
            if (r5 == 0) goto L76
            r5.close()     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L77
        L76:
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r5 = move-exception
            r0.disconnect()
            throw r5
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Download failed with HTTP "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public ca.dnamobile.javalauncher.modmanager.ModrinthProject getProject(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.modrinth.com/v2/project/"
            r1.<init>(r2)
            java.lang.String r4 = encodePath(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r3.get(r4)
            r0.<init>(r4)
            r4 = 1
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r4 = parseProject(r0, r4)
            return r4
    }

    public java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthVersion> getProjectVersions(java.lang.String r3, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4, java.lang.String r5, java.lang.String r6, boolean r7) throws java.lang.Exception {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.modrinth.com/v2"
            r0.<init>(r1)
            java.lang.String r1 = "/project/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = encodePath(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "/version?"
            java.lang.StringBuilder r3 = r3.append(r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = "true"
            goto L22
        L20:
            java.lang.String r7 = "false"
        L22:
            java.lang.String r0 = "include_changelog"
            appendQuery(r3, r0, r7)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            boolean r0 = isBlank(r5)
            if (r0 != 0) goto L39
            java.lang.String r5 = r5.trim()
            r7.put(r5)
        L39:
            int r5 = r7.length()
            if (r5 <= 0) goto L48
            java.lang.String r5 = "game_versions"
            java.lang.String r7 = r7.toString()
            appendQuery(r3, r5, r7)
        L48:
            org.json.JSONArray r4 = r2.buildVersionLoaders(r4, r6)
            int r5 = r4.length()
            if (r5 <= 0) goto L5b
            java.lang.String r5 = "loaders"
            java.lang.String r4 = r4.toString()
            appendQuery(r3, r5, r4)
        L5b:
            org.json.JSONArray r4 = new org.json.JSONArray
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r2.get(r3)
            r4.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
        L6e:
            int r6 = r4.length()
            if (r5 >= r6) goto L82
            org.json.JSONObject r6 = r4.getJSONObject(r5)
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r6 = parseVersion(r6)
            r3.add(r6)
            int r5 = r5 + 1
            goto L6e
        L82:
            return r3
    }

    public java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthVersion> getProjectVersionsWithFallback(ca.dnamobile.javalauncher.modmanager.ModrinthProject r7, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r8, java.lang.String r9, java.lang.String r10, boolean r11) throws java.lang.Exception {
            r6 = this;
            java.lang.String r1 = r7.projectId     // Catch: java.lang.Throwable -> Lc
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.util.ArrayList r7 = r0.getProjectVersions(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lc
            return r7
        Lc:
            r0 = move-exception
            java.lang.String r1 = r7.slug
            boolean r1 = isBlank(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = r7.projectId
            java.lang.String r2 = r7.slug
            java.lang.String r2 = r2.trim()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L33
            java.lang.String r7 = r7.slug
            java.lang.String r1 = r7.trim()
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.util.ArrayList r7 = r0.getProjectVersions(r1, r2, r3, r4, r5)
            return r7
        L33:
            throw r0
    }

    public ca.dnamobile.javalauncher.modmanager.ModrinthProject getProjectWithFallback(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            r2 = this;
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r3 = r2.getProject(r3)     // Catch: java.lang.Throwable -> L5
            return r3
        L5:
            r0 = move-exception
            boolean r1 = isBlank(r4)
            if (r1 != 0) goto L1f
            java.lang.String r1 = r4.trim()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1f
            java.lang.String r3 = r4.trim()
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r3 = r2.getProject(r3)
            return r3
        L1f:
            throw r0
    }

    public ca.dnamobile.javalauncher.modmanager.ModrinthVersion getVersion(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.modrinth.com/v2/version/"
            r1.<init>(r2)
            java.lang.String r4 = encodePath(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r3.get(r4)
            r0.<init>(r4)
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r4 = parseVersion(r0)
            return r4
    }

    public ca.dnamobile.javalauncher.modmanager.ModrinthApiClient.SearchResult searchProjects(java.lang.String r5, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6, java.lang.String r7, java.lang.String r8, int r9, int r10, java.lang.String r11) throws java.lang.Exception {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.modrinth.com/v2"
            r0.<init>(r1)
            java.lang.String r1 = "/search?"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "query"
            appendQuery(r0, r1, r5)
            r5 = 100
            int r5 = java.lang.Math.min(r5, r9)
            r1 = 1
            int r5 = java.lang.Math.max(r1, r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "limit"
            appendQuery(r0, r1, r5)
            r5 = 0
            int r2 = java.lang.Math.max(r5, r10)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "offset"
            appendQuery(r0, r3, r2)
            java.lang.String r2 = "index"
            appendQuery(r0, r2, r11)
            org.json.JSONArray r6 = r4.buildSearchFacets(r6, r7, r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "facets"
            appendQuery(r0, r7, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = r4.get(r7)
            r6.<init>(r7)
            java.lang.String r7 = "hits"
            org.json.JSONArray r7 = r6.optJSONArray(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r7 == 0) goto L75
            r11 = r5
        L61:
            int r0 = r7.length()
            if (r11 >= r0) goto L75
            org.json.JSONObject r0 = r7.getJSONObject(r11)
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = parseProject(r0, r5)
            r8.add(r0)
            int r11 = r11 + 1
            goto L61
        L75:
            ca.dnamobile.javalauncher.modmanager.ModrinthApiClient$SearchResult r5 = new ca.dnamobile.javalauncher.modmanager.ModrinthApiClient$SearchResult
            int r7 = r6.optInt(r3, r10)
            int r9 = r6.optInt(r1, r9)
            java.lang.String r10 = "total_hits"
            int r11 = r8.size()
            int r6 = r6.optInt(r10, r11)
            r5.<init>(r8, r7, r9, r6)
            return r5
    }
}
