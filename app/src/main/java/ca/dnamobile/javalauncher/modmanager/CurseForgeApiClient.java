package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class CurseForgeApiClient {
    private static final java.lang.String BASE_URL = "https://api.curseforge.com/v1";
    private static final int MINECRAFT_GAME_ID = 432;
    private static final java.lang.String USER_AGENT = "JavaLauncher/1.0 (Android Minecraft Launcher)";
    private final java.lang.String apiKey;

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType = null;

        static {
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType = r0
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L1d
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType     // Catch: java.lang.NoSuchFieldError -> L28
                ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

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

    public CurseForgeApiClient(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            r0.apiKey = r1
            return
    }

    private static void appendQuery(java.lang.StringBuilder r2, java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            int r0 = r2.length()
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 63
            if (r0 == r1) goto L1f
            int r0 = r2.length()
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 38
            if (r0 == r1) goto L1f
            r2.append(r1)
        L1f:
            java.lang.String r0 = "UTF-8"
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)
            r2.append(r3)
            r3 = 61
            r2.append(r3)
            java.lang.String r3 = java.net.URLEncoder.encode(r4, r0)
            r2.append(r3)
            return
    }

    private static java.lang.String encodePath(java.lang.String r2) throws java.lang.Exception {
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)
            java.lang.String r0 = "+"
            java.lang.String r1 = "%20"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private void ensureApiKey() {
            r2 = this;
            java.lang.String r0 = r2.apiKey
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing CurseForge API key. Add res/values/curseforge_api_key.xml or BuildConfig.CURSEFORGE_API_KEY."
            r0.<init>(r1)
            throw r0
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
            java.lang.String r2 = "CurseForge API HTTP "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    private static int getClassId(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1) {
            int[] r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient.AnonymousClass1.$SwitchMap$ca$dnamobile$javalauncher$modmanager$ModManagerContentType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L13
            r0 = 2
            if (r1 == r0) goto L10
            r1 = 6
            return r1
        L10:
            r1 = 6552(0x1998, float:9.181E-42)
            return r1
        L13:
            r1 = 12
            return r1
    }

    public static int getModLoaderType(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r1)
            java.lang.String r1 = "neoforge"
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L3a
            java.lang.String r1 = "neo forge"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L1b
            goto L3a
        L1b:
            java.lang.String r1 = "quilt"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L25
            r2 = 5
            return r2
        L25:
            java.lang.String r1 = "fabric"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L2f
            r2 = 4
            return r2
        L2f:
            java.lang.String r1 = "forge"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L39
            r2 = 1
            return r2
        L39:
            return r0
        L3a:
            r2 = 6
            return r2
    }

    private static java.lang.String getProjectType(int r1) {
            r0 = 12
            if (r1 != r0) goto L7
            java.lang.String r1 = "resourcepack"
            return r1
        L7:
            r0 = 6552(0x1998, float:9.181E-42)
            if (r1 != r0) goto Le
            java.lang.String r1 = "shader"
            return r1
        Le:
            java.lang.String r1 = "mod"
            return r1
    }

    private static int getSortField(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "updated"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = "date"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L17
            goto L2d
        L17:
            java.lang.String r0 = "name"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L21
            r1 = 4
            return r1
        L21:
            java.lang.String r0 = "download"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L2b
            r1 = 6
            return r1
        L2b:
            r1 = 2
            return r1
        L2d:
            r1 = 3
            return r1
    }

    private static boolean isBlank(java.lang.String r1) {
            if (r1 == 0) goto L1b
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            java.lang.String r0 = "null"
            java.lang.String r1 = r1.trim()
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            return r1
    }

    private static java.lang.String join(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = isBlank(r1)
            if (r2 == 0) goto L1c
            goto L9
        L1c:
            int r2 = r0.length()
            if (r2 <= 0) goto L25
            r0.append(r4)
        L25:
            r0.append(r1)
            goto L9
        L29:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String modLoaderToString(int r1) {
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 == r0) goto L15
            r0 = 5
            if (r1 == r0) goto L12
            r0 = 6
            if (r1 == r0) goto Lf
            java.lang.String r1 = ""
            return r1
        Lf:
            java.lang.String r1 = "neoforge"
            return r1
        L12:
            java.lang.String r1 = "quilt"
            return r1
        L15:
            java.lang.String r1 = "fabric"
            return r1
        L18:
            java.lang.String r1 = "forge"
            return r1
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
            java.lang.String r0 = "x-api-key"
            java.lang.String r1 = r2.apiKey
            r3.setRequestProperty(r0, r1)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher/1.0 (Android Minecraft Launcher)"
            r3.setRequestProperty(r0, r1)
            return r3
    }

    private ca.dnamobile.javalauncher.modmanager.ModrinthProject parseProject(org.json.JSONObject r25) {
            r24 = this;
            r0 = r25
            java.lang.String r1 = "id"
            r2 = 0
            long r4 = r0.optLong(r1, r2)
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "slug"
            java.lang.String r8 = r0.optString(r1, r7)
            java.lang.String r4 = "name"
            java.lang.String r9 = r0.optString(r4, r8)
            java.lang.String r5 = "summary"
            java.lang.String r6 = ""
            java.lang.String r12 = r0.optString(r5, r6)
            java.lang.String r5 = "downloadCount"
            long r15 = r0.optLong(r5, r2)
            java.lang.String r2 = "dateModified"
            r3 = 0
            java.lang.String r19 = r0.optString(r2, r3)
            java.lang.String r2 = "links"
            org.json.JSONObject r2 = r0.optJSONObject(r2)
            if (r2 == 0) goto L40
            java.lang.String r5 = "websiteUrl"
            java.lang.String r2 = r2.optString(r5, r3)
            r23 = r2
            goto L42
        L40:
            r23 = r3
        L42:
            java.lang.String r2 = "logo"
            org.json.JSONObject r2 = r0.optJSONObject(r2)
            java.lang.String r5 = "url"
            java.lang.String r10 = "thumbnailUrl"
            if (r2 == 0) goto L58
            java.lang.String r3 = r2.optString(r5, r3)
            java.lang.String r2 = r2.optString(r10, r3)
            r13 = r2
            goto L59
        L58:
            r13 = r3
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "authors"
            org.json.JSONArray r3 = r0.optJSONArray(r3)
            if (r3 == 0) goto L84
            r14 = 0
        L67:
            int r11 = r3.length()
            if (r14 >= r11) goto L84
            org.json.JSONObject r11 = r3.optJSONObject(r14)
            if (r11 != 0) goto L74
            goto L81
        L74:
            java.lang.String r11 = r11.optString(r4, r6)
            boolean r18 = isBlank(r11)
            if (r18 != 0) goto L81
            r2.add(r11)
        L81:
            int r14 = r14 + 1
            goto L67
        L84:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r11 = "categories"
            org.json.JSONArray r11 = r0.optJSONArray(r11)
            r20 = r15
            if (r11 == 0) goto Lbb
            r14 = 0
        L94:
            int r15 = r11.length()
            if (r14 >= r15) goto Lbb
            org.json.JSONObject r15 = r11.optJSONObject(r14)
            if (r15 != 0) goto La3
            r16 = r11
            goto Lb6
        La3:
            r16 = r11
            java.lang.String r11 = r15.optString(r1, r6)
            java.lang.String r11 = r15.optString(r4, r11)
            boolean r15 = isBlank(r11)
            if (r15 != 0) goto Lb6
            r3.add(r11)
        Lb6:
            int r14 = r14 + 1
            r11 = r16
            goto L94
        Lbb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r4 = "screenshots"
            org.json.JSONArray r4 = r0.optJSONArray(r4)
            if (r4 == 0) goto Lea
            r11 = 0
        Lc9:
            int r14 = r4.length()
            if (r11 >= r14) goto Lea
            org.json.JSONObject r14 = r4.optJSONObject(r11)
            if (r14 != 0) goto Ld6
            goto Le7
        Ld6:
            java.lang.String r15 = r14.optString(r10, r6)
            java.lang.String r14 = r14.optString(r5, r15)
            boolean r15 = isBlank(r14)
            if (r15 != 0) goto Le7
            r1.add(r14)
        Le7:
            int r11 = r11 + 1
            goto Lc9
        Lea:
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r4 = new ca.dnamobile.javalauncher.modmanager.ModrinthProject
            r6 = r4
            java.lang.String r5 = ", "
            java.lang.String r10 = join(r2, r5)
            java.lang.String r2 = "classId"
            r5 = 0
            int r0 = r0.optInt(r2, r5)
            java.lang.String r14 = getProjectType(r0)
            r17 = 0
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r22 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            r11 = r12
            r15 = r20
            r20 = r3
            r21 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23)
            return r4
    }

    private ca.dnamobile.javalauncher.modmanager.ModrinthVersion parseVersion(java.lang.String r25, org.json.JSONObject r26) throws java.lang.Exception {
            r24 = this;
            r0 = r26
            java.lang.String r1 = "id"
            r2 = 0
            long r4 = r0.optLong(r1, r2)
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "fileName"
            java.lang.String r4 = r0.optString(r1, r7)
            java.lang.String r5 = "displayName"
            java.lang.String r10 = r0.optString(r5, r4)
            java.lang.String r13 = r0.optString(r1, r10)
            java.lang.String r1 = "downloadUrl"
            java.lang.String r4 = ""
            java.lang.String r1 = r0.optString(r1, r4)
            boolean r5 = isBlank(r1)
            if (r5 == 0) goto L37
            r5 = r24
            r8 = r25
            java.lang.String r1 = r5.getDownloadUrl(r8, r7)     // Catch: java.lang.Throwable -> L35
            goto L3b
        L35:
            r12 = r4
            goto L3c
        L37:
            r5 = r24
            r8 = r25
        L3b:
            r12 = r1
        L3c:
            java.lang.String r1 = "gameVersions"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            java.util.ArrayList r1 = readStringArray(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r6 = "sortableGameVersions"
            org.json.JSONArray r6 = r0.optJSONArray(r6)
            r9 = 0
            if (r6 == 0) goto L7e
            r11 = r9
        L55:
            int r14 = r6.length()
            if (r11 >= r14) goto L7e
            org.json.JSONObject r14 = r6.optJSONObject(r11)
            if (r14 != 0) goto L62
            goto L7b
        L62:
            java.lang.String r15 = "modLoader"
            int r14 = r14.optInt(r15, r9)
            java.lang.String r14 = modLoaderToString(r14)
            boolean r15 = isBlank(r14)
            if (r15 != 0) goto L7b
            boolean r15 = r4.contains(r14)
            if (r15 != 0) goto L7b
            r4.add(r14)
        L7b:
            int r11 = r11 + 1
            goto L55
        L7e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r11 = "dependencies"
            org.json.JSONArray r11 = r0.optJSONArray(r11)
            if (r11 == 0) goto Lca
            r14 = r9
        L8c:
            int r15 = r11.length()
            if (r14 >= r15) goto Lca
            org.json.JSONObject r15 = r11.optJSONObject(r14)
            if (r15 != 0) goto L9b
            r20 = r4
            goto Lc0
        L9b:
            java.lang.String r2 = "relationType"
            int r2 = r15.optInt(r2, r9)
            r3 = 3
            if (r2 != r3) goto La7
            java.lang.String r2 = "required"
            goto La9
        La7:
            java.lang.String r2 = "optional"
        La9:
            ca.dnamobile.javalauncher.modmanager.ModrinthDependency r3 = new ca.dnamobile.javalauncher.modmanager.ModrinthDependency
            java.lang.String r9 = "modId"
            r20 = r4
            r4 = 0
            long r21 = r15.optLong(r9, r4)
            java.lang.String r4 = java.lang.String.valueOf(r21)
            r5 = 0
            r3.<init>(r5, r4, r5, r2)
            r6.add(r3)
        Lc0:
            int r14 = r14 + 1
            r5 = r24
            r4 = r20
            r2 = 0
            r9 = 0
            goto L8c
        Lca:
            r20 = r4
            java.lang.String r2 = "hashes"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            r3 = 1
            if (r2 == 0) goto Lfb
            r4 = 0
        Ld6:
            int r5 = r2.length()
            if (r4 >= r5) goto Lfb
            org.json.JSONObject r5 = r2.optJSONObject(r4)
            if (r5 != 0) goto Le5
            r9 = 0
            r11 = 0
            goto Lf8
        Le5:
            java.lang.String r9 = "algo"
            r11 = 0
            int r9 = r5.optInt(r9, r11)
            if (r9 != r3) goto Lf7
            java.lang.String r2 = "value"
            r9 = 0
            java.lang.String r2 = r5.optString(r2, r9)
            r14 = r2
            goto Lfd
        Lf7:
            r9 = 0
        Lf8:
            int r4 = r4 + 1
            goto Ld6
        Lfb:
            r9 = 0
            r14 = r9
        Lfd:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ca.dnamobile.javalauncher.modmanager.ModrinthFile r4 = new ca.dnamobile.javalauncher.modmanager.ModrinthFile
            java.lang.String r5 = "fileSizeOnDisk"
            r23 = r4
            r21 = r10
            r9 = 0
            long r3 = r0.optLong(r5, r9)
            java.lang.String r5 = "fileLength"
            long r3 = r0.optLong(r5, r3)
            r15 = 1
            r11 = r23
            r5 = 0
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r3 = r23
            r2.add(r3)
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r3 = new ca.dnamobile.javalauncher.modmanager.ModrinthVersion
            java.lang.String r4 = "releaseType"
            r9 = 1
            int r4 = r0.optInt(r4, r9)
            java.lang.String r11 = releaseTypeToString(r4)
            java.lang.String r4 = "fileDate"
            java.lang.String r12 = r0.optString(r4, r5)
            java.lang.String r4 = "downloadCount"
            r9 = 0
            long r14 = r0.optLong(r4, r9)
            r13 = 0
            r0 = r6
            r6 = r3
            r8 = r25
            r9 = r21
            r10 = r21
            r16 = r1
            r17 = r20
            r18 = r0
            r19 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r3
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
            if (r1 >= r2) goto L21
            java.lang.String r2 = ""
            java.lang.String r2 = r4.optString(r1, r2)
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L1e
            r0.add(r2)
        L1e:
            int r1 = r1 + 1
            goto L9
        L21:
            return r0
    }

    private static java.lang.String readText(java.io.InputStream r4) throws java.lang.Exception {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2d
        Le:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L2d
            r3 = -1
            if (r2 == r3) goto L1a
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            goto Le
        L1a:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r0.toString(r1)     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L2c
            r4.close()
        L2c:
            return r1
        L2d:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L37
        L36:
            throw r1     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            if (r4 == 0) goto L42
            r4.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r4 = move-exception
            r0.addSuppressed(r4)
        L42:
            throw r0
    }

    private static java.lang.String releaseTypeToString(int r1) {
            r0 = 2
            if (r1 == r0) goto Lc
            r0 = 3
            if (r1 == r0) goto L9
            java.lang.String r1 = "release"
            return r1
        L9:
            java.lang.String r1 = "alpha"
            return r1
        Lc:
            java.lang.String r1 = "beta"
            return r1
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
            java.net.URL r0 = new java.net.URL
            r0.<init>(r5)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r1 = 15000(0x3a98, float:2.102E-41)
            r0.setConnectTimeout(r1)
            r1 = 30000(0x7530, float:4.2039E-41)
            r0.setReadTimeout(r1)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "JavaLauncher/1.0 (Android Minecraft Launcher)"
            r0.setRequestProperty(r1, r2)
            int r1 = r0.getResponseCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L94
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L94
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L8f
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L83
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L83
            r6 = 65536(0x10000, float:9.1835E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L79
        L61:
            int r2 = r5.read(r6)     // Catch: java.lang.Throwable -> L79
            r3 = -1
            if (r2 == r3) goto L6d
            r3 = 0
            r1.write(r6, r3, r2)     // Catch: java.lang.Throwable -> L79
            goto L61
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto L75
            r5.close()     // Catch: java.lang.Throwable -> L8f
        L75:
            r0.disconnect()
            return
        L79:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch: java.lang.Throwable -> L83
        L82:
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r6 = move-exception
            if (r5 == 0) goto L8e
            r5.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L8f
        L8e:
            throw r6     // Catch: java.lang.Throwable -> L8f
        L8f:
            r5 = move-exception
            r0.disconnect()
            throw r5
        L94:
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

    public java.lang.String getDownloadUrl(java.lang.String r4, java.lang.String r5) throws java.lang.Exception {
            r3 = this;
            r3.ensureApiKey()
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.curseforge.com/v1/mods/"
            r1.<init>(r2)
            java.lang.String r4 = encodePath(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "/files/"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = encodePath(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "/download-url"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r3.get(r4)
            r0.<init>(r4)
            java.lang.String r4 = "data"
            java.lang.String r5 = ""
            java.lang.String r4 = r0.optString(r4, r5)
            boolean r5 = isBlank(r4)
            if (r5 != 0) goto L46
            java.lang.String r4 = r4.trim()
            return r4
        L46:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "CurseForge did not provide a download URL."
            r4.<init>(r5)
            throw r4
    }

    public ca.dnamobile.javalauncher.modmanager.ModrinthProject getProject(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            r3.ensureApiKey()
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.curseforge.com/v1/mods/"
            r1.<init>(r2)
            java.lang.String r4 = encodePath(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r3.get(r4)
            r0.<init>(r4)
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r0.optJSONObject(r4)
            if (r4 == 0) goto L2c
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r4 = r3.parseProject(r4)
            return r4
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "CurseForge project response is empty."
            r4.<init>(r0)
            throw r4
    }

    public java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModrinthVersion> getProjectVersions(java.lang.String r4, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5, java.lang.String r6, java.lang.String r7) throws java.lang.Exception {
            r3 = this;
            r3.ensureApiKey()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.curseforge.com/v1"
            r0.<init>(r1)
            java.lang.String r1 = "/mods/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = encodePath(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/files?"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "pageSize"
            java.lang.String r2 = "50"
            appendQuery(r0, r1, r2)
            java.lang.String r1 = "index"
            java.lang.String r2 = "0"
            appendQuery(r0, r1, r2)
            boolean r1 = isBlank(r6)
            if (r1 != 0) goto L3b
            java.lang.String r1 = "gameVersion"
            java.lang.String r6 = r6.trim()
            appendQuery(r0, r1, r6)
        L3b:
            int r6 = getModLoaderType(r7)
            boolean r5 = r5.isLoaderSpecific()
            if (r5 == 0) goto L50
            if (r6 <= 0) goto L50
            java.lang.String r5 = "modLoaderType"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            appendQuery(r0, r5, r6)
        L50:
            org.json.JSONObject r5 = new org.json.JSONObject
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r3.get(r6)
            r5.<init>(r6)
            java.lang.String r6 = "data"
            org.json.JSONArray r5 = r5.optJSONArray(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r5 == 0) goto L81
            r7 = 0
        L6b:
            int r0 = r5.length()
            if (r7 >= r0) goto L81
            org.json.JSONObject r0 = r5.optJSONObject(r7)
            if (r0 == 0) goto L7e
            ca.dnamobile.javalauncher.modmanager.ModrinthVersion r0 = r3.parseVersion(r4, r0)
            r6.add(r0)
        L7e:
            int r7 = r7 + 1
            goto L6b
        L81:
            return r6
    }

    public ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient.SearchResult searchProjects(java.lang.String r6, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7, java.lang.String r8, java.lang.String r9, int r10, int r11, java.lang.String r12) throws java.lang.Exception {
            r5 = this;
            r5.ensureApiKey()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.curseforge.com/v1"
            r0.<init>(r1)
            java.lang.String r1 = "/mods/search?"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 432(0x1b0, float:6.05E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gameId"
            appendQuery(r0, r2, r1)
            int r1 = getClassId(r7)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "classId"
            appendQuery(r0, r2, r1)
            r1 = 0
            int r2 = java.lang.Math.max(r1, r11)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "index"
            appendQuery(r0, r3, r2)
            r2 = 50
            int r2 = java.lang.Math.min(r2, r10)
            r4 = 1
            int r2 = java.lang.Math.max(r4, r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "pageSize"
            appendQuery(r0, r4, r2)
            int r12 = getSortField(r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r2 = "sortField"
            appendQuery(r0, r2, r12)
            java.lang.String r12 = "sortOrder"
            java.lang.String r2 = "desc"
            appendQuery(r0, r12, r2)
            boolean r12 = isBlank(r6)
            if (r12 != 0) goto L6d
            java.lang.String r12 = "searchFilter"
            java.lang.String r6 = r6.trim()
            appendQuery(r0, r12, r6)
        L6d:
            boolean r6 = isBlank(r8)
            if (r6 != 0) goto L7c
            java.lang.String r6 = "gameVersion"
            java.lang.String r8 = r8.trim()
            appendQuery(r0, r6, r8)
        L7c:
            int r6 = getModLoaderType(r9)
            boolean r7 = r7.isLoaderSpecific()
            if (r7 == 0) goto L91
            if (r6 <= 0) goto L91
            java.lang.String r7 = "modLoaderType"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            appendQuery(r0, r7, r6)
        L91:
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = r5.get(r7)
            r6.<init>(r7)
            java.lang.String r7 = "data"
            org.json.JSONArray r7 = r6.optJSONArray(r7)
            java.lang.String r8 = "pagination"
            org.json.JSONObject r6 = r6.optJSONObject(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r7 == 0) goto Lc7
        Lb1:
            int r9 = r7.length()
            if (r1 >= r9) goto Lc7
            org.json.JSONObject r9 = r7.optJSONObject(r1)
            if (r9 == 0) goto Lc4
            ca.dnamobile.javalauncher.modmanager.ModrinthProject r9 = r5.parseProject(r9)
            r8.add(r9)
        Lc4:
            int r1 = r1 + 1
            goto Lb1
        Lc7:
            if (r6 == 0) goto Ld4
            java.lang.String r7 = "totalCount"
            int r9 = r8.size()
            int r7 = r6.optInt(r7, r9)
            goto Ld8
        Ld4:
            int r7 = r8.size()
        Ld8:
            if (r6 == 0) goto Lde
            int r11 = r6.optInt(r3, r11)
        Lde:
            if (r6 == 0) goto Le4
            int r10 = r6.optInt(r4, r10)
        Le4:
            ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient$SearchResult r6 = new ca.dnamobile.javalauncher.modmanager.CurseForgeApiClient$SearchResult
            r6.<init>(r8, r11, r10, r7)
            return r6
    }
}
