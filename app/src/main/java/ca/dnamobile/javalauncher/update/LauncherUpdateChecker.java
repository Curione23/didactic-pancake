package ca.dnamobile.javalauncher.update;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherUpdateChecker {
    private static final java.util.concurrent.ExecutorService EXECUTOR = null;
    private static final boolean INCLUDE_PRERELEASES = false;
    private static final java.lang.String LATEST_RELEASE_URL = "https://api.github.com/repos/DNAMobileApplications/DroidBridgeLauncher/releases/latest";
    private static final android.os.Handler MAIN = null;
    private static final java.util.regex.Pattern NUMBER_PATTERN = null;
    private static final java.lang.String OWNER = "DNAMobileApplications";
    private static final java.lang.String RELEASES_URL = "https://api.github.com/repos/DNAMobileApplications/DroidBridgeLauncher/releases?per_page=10";
    private static final java.lang.String REPO = "DroidBridgeLauncher";

    private static final class Asset {
        final java.lang.String name;
        final long sizeBytes;
        final java.lang.String url;

        private Asset(java.lang.String r1, java.lang.String r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.url = r2
                r0.sizeBytes = r3
                return
        }

        /* synthetic */ Asset(java.lang.String r1, java.lang.String r2, long r3, ca.dnamobile.javalauncher.update.LauncherUpdateChecker.AssetIA r5) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.update.LauncherUpdateChecker$Asset-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class AssetIA {
    }

    public interface Callback {
        void onError(java.lang.String r1, java.lang.Throwable r2);

        void onNoUpdate(ca.dnamobile.javalauncher.update.LauncherUpdateInfo r1);

        void onResult(ca.dnamobile.javalauncher.update.LauncherUpdateInfo r1);
    }

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker.EXECUTOR = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker.MAIN = r0
            java.lang.String r0 = "(\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker.NUMBER_PATTERN = r0
            return
    }

    private LauncherUpdateChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkAsync(android.content.Context r2, ca.dnamobile.javalauncher.update.LauncherUpdateChecker.Callback r3) {
            android.content.Context r2 = r2.getApplicationContext()
            java.util.concurrent.ExecutorService r0 = ca.dnamobile.javalauncher.update.LauncherUpdateChecker.EXECUTOR
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.update.LauncherUpdateChecker$$ExternalSyntheticLambda2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    private static ca.dnamobile.javalauncher.update.LauncherUpdateChecker.Asset chooseBestApkAsset(org.json.JSONArray r11) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r11.length()
            if (r1 >= r2) goto L60
            org.json.JSONObject r2 = r11.optJSONObject(r1)
            if (r2 != 0) goto Lf
            goto L5d
        Lf:
            java.lang.String r3 = "name"
            java.lang.String r4 = ""
            java.lang.String r3 = r2.optString(r3, r4)
            java.lang.String r6 = r3.trim()
            java.lang.String r3 = "browser_download_url"
            java.lang.String r3 = r2.optString(r3, r4)
            java.lang.String r7 = r3.trim()
            java.lang.String r3 = "size"
            r4 = 0
            long r8 = r2.optLong(r3, r4)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r6.toLowerCase(r2)
            java.lang.String r3 = ".apk"
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L5d
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L42
            goto L5d
        L42:
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker$Asset r3 = new ca.dnamobile.javalauncher.update.LauncherUpdateChecker$Asset
            r10 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r10)
            if (r0 != 0) goto L4c
            r0 = r3
        L4c:
            java.lang.String r4 = "universal"
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L5c
            java.lang.String r4 = "release"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L5d
        L5c:
            return r3
        L5d:
            int r1 = r1 + 1
            goto L2
        L60:
            return r0
    }

    private static java.util.List<java.lang.Integer> extractVersionNumbers(java.lang.String r3) {
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "v"
            boolean r0 = r3.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L15
            java.lang.String r0 = "V"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L19
        L15:
            java.lang.String r3 = r3.substring(r1)
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.regex.Pattern r2 = ca.dnamobile.javalauncher.update.LauncherUpdateChecker.NUMBER_PATTERN
            java.util.regex.Matcher r3 = r2.matcher(r3)
        L24:
            boolean r2 = r3.find()
            if (r2 == 0) goto L3a
            java.lang.String r2 = r3.group(r1)     // Catch: java.lang.Throwable -> L24
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L24
            r0.add(r2)     // Catch: java.lang.Throwable -> L24
            goto L24
        L3a:
            return r0
    }

    private static ca.dnamobile.javalauncher.update.LauncherUpdateInfo fetchLatest(android.content.Context r2) throws java.lang.Exception {
            java.lang.String r0 = "https://api.github.com/repos/DNAMobileApplications/DroidBridgeLauncher/releases/latest"
            java.lang.String r0 = getJson(r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            ca.dnamobile.javalauncher.update.LauncherUpdateInfo r2 = parseRelease(r2, r1)
            return r2
    }

    private static java.lang.String getJson(java.lang.String r5) throws java.lang.Exception {
            java.lang.String r0 = "GitHub update check failed. HTTP "
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L9a
            java.net.URLConnection r5 = r2.openConnection()     // Catch: java.lang.Throwable -> L9a
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = "GET"
            r5.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L97
            r1 = 12000(0x2ee0, float:1.6816E-41)
            r5.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L97
            r5.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "Accept"
            java.lang.String r2 = "application/vnd.github+json"
            r5.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "X-GitHub-Api-Version"
            java.lang.String r2 = "2022-11-28"
            r5.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "DroidBridgeLauncher/0.3.9"
            r5.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L97
            int r1 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L97
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L84
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L84
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L97
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.lang.Throwable -> L97
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L97
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L70
        L4e:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L70
            r4 = -1
            if (r3 == r4) goto L5a
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L70
            goto L4e
        L5a:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.name()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r1.toString(r2)     // Catch: java.lang.Throwable -> L70
            r1.close()     // Catch: java.lang.Throwable -> L7a
            r0.close()     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L6f
            r5.disconnect()
        L6f:
            return r2
        L70:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L7a
        L79:
            throw r2     // Catch: java.lang.Throwable -> L7a
        L7a:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L97
        L83:
            throw r1     // Catch: java.lang.Throwable -> L97
        L84:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r0 = r3.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L97
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L97
            throw r2     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            r1 = r5
            goto L9b
        L9a:
            r0 = move-exception
        L9b:
            if (r1 == 0) goto La0
            r1.disconnect()
        La0:
            throw r0
    }

    private static boolean isRemoteVersionNewer(java.lang.String r6, java.lang.String r7) {
            java.util.List r6 = extractVersionNumbers(r6)
            java.util.List r7 = extractVersionNumbers(r7)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            boolean r0 = r6.isEmpty()
            r2 = 1
            if (r0 == 0) goto L18
            return r2
        L18:
            int r0 = r6.size()
            int r3 = r7.size()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = r1
        L25:
            if (r3 >= r0) goto L54
            int r4 = r6.size()
            if (r3 >= r4) goto L38
            java.lang.Object r4 = r6.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L39
        L38:
            r4 = r1
        L39:
            int r5 = r7.size()
            if (r3 >= r5) goto L4a
            java.lang.Object r5 = r7.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L4b
        L4a:
            r5 = r1
        L4b:
            if (r5 <= r4) goto L4e
            return r2
        L4e:
            if (r5 >= r4) goto L51
            return r1
        L51:
            int r3 = r3 + 1
            goto L25
        L54:
            return r1
    }

    static /* synthetic */ void lambda$checkAsync$0(ca.dnamobile.javalauncher.update.LauncherUpdateInfo r1, ca.dnamobile.javalauncher.update.LauncherUpdateChecker.Callback r2) {
            boolean r0 = r1.updateAvailable
            if (r0 == 0) goto L8
            r2.onResult(r1)
            goto Lb
        L8:
            r2.onNoUpdate(r1)
        Lb:
            return
    }

    static /* synthetic */ void lambda$checkAsync$1(ca.dnamobile.javalauncher.update.LauncherUpdateChecker.Callback r0, java.lang.String r1, java.lang.Throwable r2) {
            r0.onError(r1, r2)
            return
    }

    static /* synthetic */ void lambda$checkAsync$2(android.content.Context r3, ca.dnamobile.javalauncher.update.LauncherUpdateChecker.Callback r4) {
            ca.dnamobile.javalauncher.update.LauncherUpdateInfo r3 = fetchLatest(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r0 = ca.dnamobile.javalauncher.update.LauncherUpdateChecker.MAIN     // Catch: java.lang.Throwable -> Lf
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.update.LauncherUpdateChecker$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf
            r0.post(r1)     // Catch: java.lang.Throwable -> Lf
            goto L2c
        Lf:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L20
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L22
        L20:
            java.lang.String r0 = "Unable to check for launcher updates."
        L22:
            android.os.Handler r1 = ca.dnamobile.javalauncher.update.LauncherUpdateChecker.MAIN
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.update.LauncherUpdateChecker$$ExternalSyntheticLambda1
            r2.<init>(r4, r0, r3)
            r1.post(r2)
        L2c:
            return
    }

    private static ca.dnamobile.javalauncher.update.LauncherUpdateInfo parseRelease(android.content.Context r13, org.json.JSONObject r14) {
            java.lang.String r0 = "tag_name"
            java.lang.String r1 = ""
            java.lang.String r0 = r14.optString(r0, r1)
            java.lang.String r3 = r0.trim()
            java.lang.String r0 = "name"
            java.lang.String r0 = r14.optString(r0, r1)
            java.lang.String r4 = r0.trim()
            java.lang.String r0 = "html_url"
            java.lang.String r0 = r14.optString(r0, r1)
            java.lang.String r5 = r0.trim()
            java.lang.String r0 = "body"
            java.lang.String r0 = r14.optString(r0, r1)
            java.lang.String r6 = r0.trim()
            java.lang.String r0 = "prerelease"
            r1 = 0
            boolean r11 = r14.optBoolean(r0, r1)
            java.lang.String r0 = "assets"
            org.json.JSONArray r14 = r14.optJSONArray(r0)
            if (r14 == 0) goto L49
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker$Asset r14 = chooseBestApkAsset(r14)
            if (r14 == 0) goto L49
            java.lang.String r0 = r14.url
            java.lang.String r2 = r14.name
            long r7 = r14.sizeBytes
            r9 = r7
            r7 = r0
            r8 = r2
            goto L4f
        L49:
            r14 = 0
            r7 = 0
            r9 = r7
            r7 = r14
            r8 = r7
        L4f:
            java.lang.String r14 = "0.3.9"
            boolean r14 = isRemoteVersionNewer(r14, r3)
            if (r14 == 0) goto L60
            boolean r13 = ca.dnamobile.javalauncher.update.LauncherUpdatePreferences.isTagIgnored(r13, r3)
            if (r13 != 0) goto L60
            r13 = 1
            r12 = r13
            goto L61
        L60:
            r12 = r1
        L61:
            ca.dnamobile.javalauncher.update.LauncherUpdateInfo r13 = new ca.dnamobile.javalauncher.update.LauncherUpdateInfo
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12)
            return r13
    }

    private static org.json.JSONObject pickFirstPublishedRelease(org.json.JSONArray r4) throws java.lang.Exception {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.length()
            if (r1 >= r2) goto L18
            org.json.JSONObject r2 = r4.getJSONObject(r1)
            java.lang.String r3 = "draft"
            boolean r3 = r2.optBoolean(r3, r0)
            if (r3 != 0) goto L15
            return r2
        L15:
            int r1 = r1 + 1
            goto L2
        L18:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "No published GitHub release was found."
            r4.<init>(r0)
            throw r4
    }
}
