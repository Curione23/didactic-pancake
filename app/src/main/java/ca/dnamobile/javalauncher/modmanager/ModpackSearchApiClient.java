package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModpackSearchApiClient {
    private static final int CURSEFORGE_MINECRAFT_GAME_ID = 432;
    private static final int CURSEFORGE_MODPACK_CLASS_ID = 4471;
    private static final java.lang.String FEATURED_MODPACK_QUERY = "OptiMobile";

    public static final class SearchResult {
        public final java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> hits;
        public final int totalHits;

        public SearchResult(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.hits = r1
                r0.totalHits = r2
                return
        }
    }

    private ModpackSearchApiClient() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addFirstFeaturedMatch(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r2, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r3.next()
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = (ca.dnamobile.javalauncher.modmanager.ModrinthProject) r0
            boolean r1 = isFeaturedModpack(r0)
            if (r1 != 0) goto L17
            goto L4
        L17:
            r3 = 0
            r2.add(r3, r0)
        L1b:
            return
    }

    private static boolean containsFeaturedModpack(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r1) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r0 = (ca.dnamobile.javalauncher.modmanager.ModrinthProject) r0
            boolean r0 = isFeaturedModpack(r0)
            if (r0 == 0) goto L4
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    private static java.util.ArrayList<java.lang.String> curseForgeCategories(org.json.JSONArray r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r6 == 0) goto L4f
            int r2 = r6.length()
            if (r1 >= r2) goto L4f
            org.json.JSONObject r2 = r6.optJSONObject(r1)
            if (r2 != 0) goto L15
            goto L4c
        L15:
            java.lang.String r3 = "slug"
            java.lang.String r4 = ""
            java.lang.String r3 = r2.optString(r3, r4)
            java.lang.String r3 = r3.trim()
            java.lang.String r5 = "name"
            java.lang.String r2 = r2.optString(r5, r4)
            java.lang.String r2 = r2.trim()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L35
            r0.add(r3)
            goto L4c
        L35:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L4c
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            r3 = 32
            r4 = 45
            java.lang.String r2 = r2.replace(r3, r4)
            r0.add(r2)
        L4c:
            int r1 = r1 + 1
            goto L6
        L4f:
            return r0
    }

    private static int curseForgeLoaderType(java.lang.String r1) {
            java.lang.String r1 = normalizeLoader(r1)
            java.lang.String r0 = "forge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            java.lang.String r0 = "fabric"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r1 = 4
            return r1
        L18:
            java.lang.String r0 = "quilt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            r1 = 5
            return r1
        L22:
            java.lang.String r0 = "neoforge"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2c
            r1 = 6
            return r1
        L2c:
            r1 = 0
            return r1
    }

    private static void ensureFeaturedCurseForgeModpack(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r12, int r13) {
            boolean r0 = containsFeaturedModpack(r12)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r2 = "OptiMobile"
            r0 = 1
            int r13 = java.lang.Math.max(r0, r13)     // Catch: java.lang.Throwable -> L29
            r0 = 10
            int r13 = java.lang.Math.min(r0, r13)     // Catch: java.lang.Throwable -> L29
            r0 = 5
            int r5 = java.lang.Math.max(r0, r13)     // Catch: java.lang.Throwable -> L29
            java.lang.String r7 = "downloads"
            r8 = 0
            r6 = 0
            r1 = r9
            r3 = r10
            r4 = r11
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r9 = searchCurseForge(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r9 = r9.hits     // Catch: java.lang.Throwable -> L29
            addFirstFeaturedMatch(r12, r9)     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    private static void ensureFeaturedModrinthModpack(java.lang.String r8, java.lang.String r9, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r10, int r11) {
            boolean r0 = containsFeaturedModpack(r10)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r1 = "OptiMobile"
            r0 = 1
            int r11 = java.lang.Math.max(r0, r11)     // Catch: java.lang.Throwable -> L28
            r0 = 10
            int r11 = java.lang.Math.min(r0, r11)     // Catch: java.lang.Throwable -> L28
            r0 = 5
            int r4 = java.lang.Math.max(r0, r11)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "downloads"
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r8 = searchModrinth(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r8 = r8.hits     // Catch: java.lang.Throwable -> L28
            addFirstFeaturedMatch(r10, r8)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    private static java.lang.String httpGetString(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            java.net.URLConnection r3 = r0.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setConnectTimeout(r0)
            r0 = 60000(0xea60, float:8.4078E-41)
            r3.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher/ModpackSearch"
            r3.setRequestProperty(r0, r1)
            boolean r0 = isBlank(r4)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "x-api-key"
            java.lang.String r4 = r4.trim()
            r3.setRequestProperty(r0, r4)
        L2c:
            int r4 = r3.getResponseCode()
            int r0 = r4 / 100
            r1 = 2
            if (r0 != r1) goto L3a
            java.io.InputStream r2 = r3.getInputStream()
            goto L3e
        L3a:
            java.io.InputStream r2 = r3.getErrorStream()
        L3e:
            if (r2 != 0) goto L43
            java.lang.String r2 = ""
            goto L47
        L43:
            java.lang.String r2 = readToString(r2)
        L47:
            r3.disconnect()
            if (r0 != r1) goto L4d
            return r2
        L4d:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
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

    private static boolean isFeaturedModpack(ca.dnamobile.javalauncher.modmanager.ModrinthProject r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.title
            java.lang.String r2 = ""
            if (r1 != 0) goto Lc
            r1 = r2
            goto L18
        Lc:
            java.lang.String r1 = r5.title
            java.lang.String r1 = r1.trim()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r3)
        L18:
            java.lang.String r3 = r5.slug
            if (r3 != 0) goto L1e
            r3 = r2
            goto L2a
        L1e:
            java.lang.String r3 = r5.slug
            java.lang.String r3 = r3.trim()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
        L2a:
            java.lang.String r4 = r5.projectId
            if (r4 != 0) goto L2f
            goto L3b
        L2f:
            java.lang.String r5 = r5.projectId
            java.lang.String r5 = r5.trim()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r5.toLowerCase(r2)
        L3b:
            java.lang.String r5 = "optimobile"
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L4f
            boolean r1 = r3.contains(r5)
            if (r1 != 0) goto L4f
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L50
        L4f:
            r0 = 1
        L50:
            return r0
    }

    private static java.lang.String normalizeLoader(java.lang.String r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L6
            r2 = r0
            goto L10
        L6:
            java.lang.String r2 = r2.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r1)
        L10:
            java.lang.String r1 = "vanilla"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L36
            java.lang.String r1 = "minecraft"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L21
            goto L36
        L21:
            java.lang.String r0 = "fabric-loader"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "fabric"
            return r2
        L2c:
            java.lang.String r0 = "neoforge"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L35
            return r0
        L35:
            return r2
        L36:
            return r0
    }

    private static java.lang.String normalizeSortKey(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto Lf
        L5:
            java.lang.String r1 = r1.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
        Lf:
            return r1
    }

    private static void pinFeaturedModpackFirst(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthProject> r4, int r5) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r1 = 0
        L7:
            if (r0 < 0) goto L1f
            java.lang.Object r2 = r4.get(r0)
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r2 = (ca.dnamobile.javalauncher.modmanager.ModrinthProject) r2
            boolean r3 = isFeaturedModpack(r2)
            if (r3 != 0) goto L16
            goto L1c
        L16:
            if (r1 != 0) goto L19
            r1 = r2
        L19:
            r4.remove(r0)
        L1c:
            int r0 = r0 + (-1)
            goto L7
        L1f:
            if (r1 == 0) goto L25
            r0 = 0
            r4.add(r0, r1)
        L25:
            if (r5 <= 0) goto L37
        L27:
            int r0 = r4.size()
            if (r0 <= r5) goto L37
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r4.remove(r0)
            goto L27
        L37:
            return
    }

    private static java.lang.String readFirstAuthor(org.json.JSONArray r2) {
            r0 = 0
            if (r2 == 0) goto L18
            int r1 = r2.length()
            if (r1 != 0) goto La
            goto L18
        La:
            r1 = 0
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            if (r2 != 0) goto L12
            goto L18
        L12:
            java.lang.String r1 = "name"
            java.lang.String r0 = r2.optString(r1, r0)
        L18:
            return r0
    }

    private static java.lang.String readToString(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]
        La:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L16
            r3 = 0
            r0.write(r1, r3, r2)
            goto La
        L16:
            java.lang.String r4 = "UTF-8"
            java.lang.String r4 = r0.toString(r4)
            return r4
    }

    private static int resolveCurseForgeSortField(java.lang.String r7) {
            int r0 = r7.hashCode()
            r1 = 6
            r2 = 3
            r3 = 5
            r4 = 1
            r5 = 4
            r6 = 2
            switch(r0) {
                case -1985053029: goto L4a;
                case -1048839194: goto L40;
                case -234430277: goto L36;
                case 3373707: goto L2c;
                case 108474201: goto L22;
                case 765912085: goto L18;
                case 1312704747: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L54
        Le:
            java.lang.String r0 = "downloads"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r7 = r1
            goto L55
        L18:
            java.lang.String r0 = "followers"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r7 = r5
            goto L55
        L22:
            java.lang.String r0 = "relevance"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r7 = r3
            goto L55
        L2c:
            java.lang.String r0 = "name"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r7 = r6
            goto L55
        L36:
            java.lang.String r0 = "updated"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r7 = 0
            goto L55
        L40:
            java.lang.String r0 = "newest"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r7 = r4
            goto L55
        L4a:
            java.lang.String r0 = "versions"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L54
            r7 = r2
            goto L55
        L54:
            r7 = -1
        L55:
            if (r7 == 0) goto L62
            if (r7 == r4) goto L62
            if (r7 == r6) goto L61
            if (r7 == r5) goto L60
            if (r7 == r3) goto L60
            return r1
        L60:
            return r6
        L61:
            return r5
        L62:
            return r2
    }

    private static java.lang.String resolveCurseForgeSortOrder(java.lang.String r1) {
            java.lang.String r0 = "name"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lb
            java.lang.String r1 = "asc"
            goto Ld
        Lb:
            java.lang.String r1 = "desc"
        Ld:
            return r1
    }

    private static java.lang.String resolveModrinthSortIndex(java.lang.String r6, java.lang.String r7) {
            java.lang.String r7 = normalizeSortKey(r7)
            boolean r0 = r7.isEmpty()
            java.lang.String r1 = "relevance"
            java.lang.String r2 = "downloads"
            if (r0 == 0) goto L1a
            java.lang.String r6 = r6.trim()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L19
            r1 = r2
        L19:
            return r1
        L1a:
            r7.hashCode()
            int r0 = r7.hashCode()
            java.lang.String r3 = "updated"
            java.lang.String r4 = "newest"
            r5 = -1
            switch(r0) {
                case -1985053029: goto L64;
                case -1048839194: goto L5b;
                case -234430277: goto L52;
                case 3373707: goto L47;
                case 108474201: goto L3e;
                case 765912085: goto L33;
                case 1312704747: goto L2a;
                default: goto L29;
            }
        L29:
            goto L6e
        L2a:
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L31
            goto L6e
        L31:
            r5 = 6
            goto L6e
        L33:
            java.lang.String r0 = "followers"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3c
            goto L6e
        L3c:
            r5 = 5
            goto L6e
        L3e:
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L45
            goto L6e
        L45:
            r5 = 4
            goto L6e
        L47:
            java.lang.String r0 = "name"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L50
            goto L6e
        L50:
            r5 = 3
            goto L6e
        L52:
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L59
            goto L6e
        L59:
            r5 = 2
            goto L6e
        L5b:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L62
            goto L6e
        L62:
            r5 = 1
            goto L6e
        L64:
            java.lang.String r0 = "versions"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L6d
            goto L6e
        L6d:
            r5 = 0
        L6e:
            switch(r5) {
                case 0: goto L90;
                case 1: goto L8f;
                case 2: goto L8e;
                case 3: goto L82;
                case 4: goto L81;
                case 5: goto L7e;
                case 6: goto L7d;
                default: goto L71;
            }
        L71:
            java.lang.String r6 = r6.trim()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L7c
            r1 = r2
        L7c:
            return r1
        L7d:
            return r2
        L7e:
            java.lang.String r6 = "follows"
            return r6
        L81:
            return r1
        L82:
            java.lang.String r6 = r6.trim()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L8d
            r1 = r2
        L8d:
            return r1
        L8e:
            return r3
        L8f:
            return r4
        L90:
            return r2
    }

    public static ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient.SearchResult search(android.content.Context r8, ca.dnamobile.javalauncher.modmanager.ModManagerSource r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, int r14) throws java.lang.Exception {
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r8 = search(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient.SearchResult search(android.content.Context r9, ca.dnamobile.javalauncher.modmanager.ModManagerSource r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, int r15, java.lang.String r16) throws java.lang.Exception {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            r1 = r10
            if (r1 != r0) goto L13
            r8 = 1
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r0 = searchCurseForge(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L13:
            r7 = 1
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r0 = searchModrinth(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient.SearchResult searchCurseForge(android.content.Context r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, int r30, java.lang.String r31, boolean r32) throws java.lang.Exception {
            r0 = r29
            r1 = r30
            java.lang.String r2 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L16d
            java.lang.String r3 = normalizeSortKey(r31)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "https://api.curseforge.com/v1/mods/search?gameId=432&classId=4471&pageSize="
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = "&index="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = "&sortField="
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = resolveCurseForgeSortField(r3)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "&sortOrder="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r3 = resolveCurseForgeSortOrder(r3)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = r26.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L5e
            java.lang.String r4 = "&searchFilter="
            java.lang.StringBuilder r4 = r3.append(r4)
            java.lang.String r5 = r26.trim()
            java.lang.String r5 = urlEncode(r5)
            r4.append(r5)
        L5e:
            boolean r4 = isBlank(r27)
            if (r4 != 0) goto L75
            java.lang.String r4 = "&gameVersion="
            java.lang.StringBuilder r4 = r3.append(r4)
            java.lang.String r5 = r27.trim()
            java.lang.String r5 = urlEncode(r5)
            r4.append(r5)
        L75:
            int r4 = curseForgeLoaderType(r28)
            if (r4 <= 0) goto L84
            java.lang.String r5 = "&modLoaderType="
            java.lang.StringBuilder r5 = r3.append(r5)
            r5.append(r4)
        L84:
            org.json.JSONObject r4 = new org.json.JSONObject
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = httpGetString(r3, r2)
            r4.<init>(r2)
            java.lang.String r2 = "data"
            org.json.JSONArray r2 = r4.optJSONArray(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
            r6 = r5
        L9e:
            if (r2 == 0) goto L140
            int r7 = r2.length()
            if (r6 >= r7) goto L140
            org.json.JSONObject r7 = r2.optJSONObject(r6)
            if (r7 != 0) goto Lae
            goto L13b
        Lae:
            java.lang.String r8 = "logo"
            org.json.JSONObject r8 = r7.optJSONObject(r8)
            java.lang.String r9 = "links"
            org.json.JSONObject r9 = r7.optJSONObject(r9)
            java.lang.String r10 = "categories"
            org.json.JSONArray r10 = r7.optJSONArray(r10)
            java.util.ArrayList r10 = curseForgeCategories(r10)
            java.lang.String r11 = "modpack"
            r10.add(r11)
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r15 = new ca.dnamobile.javalauncher.modmanager.ModrinthProject
            java.lang.String r11 = "id"
            int r11 = r7.optInt(r11, r5)
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r11 = "slug"
            java.lang.String r13 = ""
            if (r9 != 0) goto Le0
            java.lang.String r9 = r7.optString(r11, r13)
            goto Lea
        Le0:
            java.lang.String r14 = "websiteUrl"
            java.lang.String r11 = r7.optString(r11, r13)
            java.lang.String r9 = r9.optString(r14, r11)
        Lea:
            java.lang.String r11 = "name"
            java.lang.String r14 = "Modpack"
            java.lang.String r14 = r7.optString(r11, r14)
            java.lang.String r11 = "summary"
            java.lang.String r16 = r7.optString(r11, r13)
            java.lang.String r11 = "authors"
            org.json.JSONArray r11 = r7.optJSONArray(r11)
            java.lang.String r17 = readFirstAuthor(r11)
            r11 = 0
            if (r8 != 0) goto L107
            r5 = r11
            goto L113
        L107:
            java.lang.String r13 = "url"
            java.lang.String r13 = r8.optString(r13, r11)
            java.lang.String r5 = "thumbnailUrl"
            java.lang.String r5 = r8.optString(r5, r13)
        L113:
            java.lang.String r8 = "downloadCount"
            r31 = r12
            r11 = 0
            long r19 = r7.optLong(r8, r11)
            java.lang.String r8 = "dateModified"
            r11 = 0
            java.lang.String r23 = r7.optString(r8, r11)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r24 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            r21 = 0
            r11 = r15
            r12 = r31
            r13 = r9
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r5
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24)
            r3.add(r7)
        L13b:
            int r6 = r6 + 1
            r5 = 0
            goto L9e
        L140:
            if (r32 == 0) goto L14d
            if (r1 != 0) goto L14d
            r1 = r25
            r2 = r27
            r5 = r28
            ensureFeaturedCurseForgeModpack(r1, r2, r5, r3, r0)
        L14d:
            pinFeaturedModpackFirst(r3, r0)
            java.lang.String r0 = "pagination"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            if (r0 != 0) goto L15d
            int r0 = r3.size()
            goto L167
        L15d:
            java.lang.String r1 = "totalCount"
            int r2 = r3.size()
            int r0 = r0.optInt(r1, r2)
        L167:
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r1 = new ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult
            r1.<init>(r3, r0)
            return r1
        L16d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Missing CurseForge API key."
            r0.<init>(r1)
            throw r0
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient.SearchResult searchModrinth(java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, int r27, java.lang.String r28, boolean r29) throws java.lang.Exception {
            r0 = r26
            r1 = r27
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String r4 = "project_type:modpack"
            org.json.JSONArray r3 = r3.put(r4)
            r2.put(r3)
            boolean r3 = isBlank(r24)
            if (r3 != 0) goto L3c
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "versions:"
            r4.<init>(r5)
            java.lang.String r5 = r24.trim()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            org.json.JSONArray r3 = r3.put(r4)
            r2.put(r3)
        L3c:
            java.lang.String r3 = normalizeLoader(r25)
            boolean r4 = isBlank(r3)
            if (r4 != 0) goto L61
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "categories:"
            r5.<init>(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            org.json.JSONArray r3 = r4.put(r3)
            r2.put(r3)
        L61:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "https://api.modrinth.com/v2/search?limit="
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = "&offset="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = "&index="
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r23
            r5 = r28
            java.lang.String r5 = resolveModrinthSortIndex(r4, r5)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = "&facets="
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = urlEncode(r2)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r23.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lc7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "&query="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r23.trim()
            java.lang.String r3 = urlEncode(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
        Lc7:
            org.json.JSONObject r3 = new org.json.JSONObject
            r4 = 0
            java.lang.String r2 = httpGetString(r2, r4)
            r3.<init>(r2)
            java.lang.String r2 = "hits"
            org.json.JSONArray r2 = r3.optJSONArray(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
        Ldd:
            if (r2 == 0) goto L15f
            int r7 = r2.length()
            if (r6 >= r7) goto L15f
            org.json.JSONObject r7 = r2.optJSONObject(r6)
            if (r7 != 0) goto Lee
            r4 = r5
            goto L159
        Lee:
            java.lang.String r8 = "categories"
            org.json.JSONArray r8 = r7.optJSONArray(r8)
            java.util.ArrayList r8 = stringArray(r8)
            java.lang.String r9 = "modpack"
            r8.add(r9)
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r15 = new ca.dnamobile.javalauncher.modmanager.ModrinthProject
            java.lang.String r9 = "project_id"
            java.lang.String r10 = ""
            java.lang.String r11 = r7.optString(r9, r10)
            java.lang.String r9 = "slug"
            java.lang.String r12 = r7.optString(r9, r10)
            java.lang.String r9 = "title"
            java.lang.String r13 = "Modpack"
            java.lang.String r13 = r7.optString(r9, r13)
            java.lang.String r9 = "description"
            java.lang.String r14 = r7.optString(r9, r10)
            java.lang.String r9 = "author"
            java.lang.String r16 = r7.optString(r9, r4)
            java.lang.String r9 = "icon_url"
            java.lang.String r17 = r7.optString(r9, r4)
            java.lang.String r9 = "downloads"
            r28 = r5
            r4 = 0
            long r18 = r7.optLong(r9, r4)
            java.lang.String r9 = "follows"
            long r4 = r7.optLong(r9, r4)
            java.lang.String r9 = "date_modified"
            r10 = 0
            java.lang.String r21 = r7.optString(r9, r10)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r22 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r9 = r15
            r7 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r7 = r15
            r15 = r17
            r16 = r8
            r17 = r18
            r19 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22)
            r4 = r28
            r4.add(r7)
        L159:
            int r6 = r6 + 1
            r5 = r4
            r4 = 0
            goto Ldd
        L15f:
            r4 = r5
            if (r29 == 0) goto L16b
            if (r1 != 0) goto L16b
            r1 = r24
            r2 = r25
            ensureFeaturedModrinthModpack(r1, r2, r4, r0)
        L16b:
            pinFeaturedModpackFirst(r4, r0)
            ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult r0 = new ca.dnamobile.javalauncher.modmanager.ModpackSearchApiClient$SearchResult
            java.lang.String r1 = "total_hits"
            int r2 = r4.size()
            int r1 = r3.optInt(r1, r2)
            r0.<init>(r4, r1)
            return r0
    }

    private static java.util.ArrayList<java.lang.String> stringArray(org.json.JSONArray r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r4 == 0) goto L24
            int r2 = r4.length()
            if (r1 >= r2) goto L24
            java.lang.String r2 = ""
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L21
            r0.add(r2)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    private static java.lang.String urlEncode(java.lang.String r2) throws java.lang.Exception {
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)
            java.lang.String r0 = "+"
            java.lang.String r1 = "%20"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }
}
