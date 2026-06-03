package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class LoaderVersionResolver {
    private static final int BUFFER_SIZE = 65536;
    private static final java.lang.String FABRIC_META = "https://meta.fabricmc.net/v2";
    private static final java.lang.String FORGE_METADATA_URL = "https://maven.minecraftforge.net/net/minecraftforge/forge/maven-metadata.xml";
    private static final java.lang.String NEOFORGE_LEGACY_METADATA_URL = "https://maven.neoforged.net/releases/net/neoforged/forge/maven-metadata.xml";
    private static final java.lang.String NEOFORGE_METADATA_URL = "https://maven.neoforged.net/releases/net/neoforged/neoforge/maven-metadata.xml";

    public static final class LoaderVersionOption {
        public final java.lang.String displayName;
        public final java.lang.String loaderVersion;

        public LoaderVersionOption(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.displayName = r1
                r0.loaderVersion = r2
                return
        }
    }

    private LoaderVersionResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int compareBuildVersions(java.lang.String r7, java.lang.String r8) {
            int[] r0 = parseBuildParts(r7)
            int[] r1 = parseBuildParts(r8)
            int r2 = r0.length
            int r3 = r1.length
            int r2 = java.lang.Math.max(r2, r3)
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L2a
            int r5 = r0.length
            if (r4 >= r5) goto L18
            r5 = r0[r4]
            goto L19
        L18:
            r5 = r3
        L19:
            int r6 = r1.length
            if (r4 >= r6) goto L1f
            r6 = r1[r4]
            goto L20
        L1f:
            r6 = r3
        L20:
            if (r5 == r6) goto L27
            int r7 = java.lang.Integer.compare(r5, r6)
            return r7
        L27:
            int r4 = r4 + 1
            goto L10
        L2a:
            int r7 = r7.compareToIgnoreCase(r8)
            return r7
    }

    private static java.lang.String downloadText(java.lang.String r4) throws java.lang.Exception {
            java.net.HttpURLConnection r4 = openConnection(r4)
            int r0 = r4.getResponseCode()
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L15
            if (r0 >= r1) goto L15
            java.io.InputStream r3 = r4.getInputStream()
            goto L19
        L15:
            java.io.InputStream r3 = r4.getErrorStream()
        L19:
            java.lang.String r3 = readStream(r3)
            r4.disconnect()
            if (r0 < r2) goto L25
            if (r0 >= r1) goto L25
            return r3
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    private static java.lang.String encode(java.lang.String r1) throws java.lang.Exception {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r0)
            return r1
    }

    private static java.lang.String formatNeoForgeGameVersion(java.lang.String r8) {
            java.lang.String r0 = "1.20.1"
            boolean r1 = r8.contains(r0)
            if (r1 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "0."
            boolean r1 = r8.startsWith(r0)
            java.lang.String r2 = "-"
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L30
            int r0 = r0.length()
            java.lang.String r8 = r8.substring(r0)
            java.lang.String[] r8 = r8.split(r2, r3)
            r8 = r8[r4]
            r0 = 46
            int r0 = r8.lastIndexOf(r0)
            if (r0 <= 0) goto L2f
            java.lang.String r8 = r8.substring(r4, r0)
        L2f:
            return r8
        L30:
            java.lang.String[] r0 = r8.split(r2, r3)
            r0 = r0[r4]
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r5 = r4
        L43:
            if (r5 >= r2) goto L68
            r6 = r0[r5]
            if (r6 == 0) goto L65
            java.lang.String r7 = r6.trim()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L54
            goto L65
        L54:
            java.lang.String r6 = r6.trim()     // Catch: java.lang.NumberFormatException -> L64
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L64
            r1.add(r6)     // Catch: java.lang.NumberFormatException -> L64
            goto L65
        L64:
            return r8
        L65:
            int r5 = r5 + 1
            goto L43
        L68:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L6f
            return r8
        L6f:
            java.lang.Object r8 = r1.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r0 = r1.size()
            r2 = 1
            if (r0 <= r2) goto L8b
            java.lang.Object r0 = r1.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L8c
        L8b:
            r0 = r4
        L8c:
            int r2 = r1.size()
            if (r2 <= r3) goto L9c
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
        L9c:
            r1 = 25
            java.lang.String r2 = "."
            if (r8 < r1) goto Ld2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r4 != 0) goto Lb6
            r1.<init>()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.StringBuilder r8 = r8.append(r0)
            goto Lcd
        Lb6:
            r1.<init>()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.StringBuilder r8 = r8.append(r4)
        Lcd:
            java.lang.String r8 = r8.toString()
            return r8
        Ld2:
            java.lang.String r1 = "1."
            if (r0 != 0) goto Le0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            goto Lf1
        Le0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.StringBuilder r8 = r3.append(r8)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.StringBuilder r8 = r8.append(r0)
        Lf1:
            java.lang.String r8 = r8.toString()
            return r8
    }

    static /* synthetic */ int lambda$resolveForgeVersions$0(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r0 = r1.length()
            java.lang.String r3 = r3.substring(r0)
            int r1 = r1.length()
            java.lang.String r1 = r2.substring(r1)
            int r1 = compareBuildVersions(r3, r1)
            return r1
    }

    static /* synthetic */ int lambda$resolveNeoForgeVersions$1(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r0 = r1.length()
            java.lang.String r3 = r3.substring(r0)
            int r1 = r1.length()
            java.lang.String r1 = r2.substring(r1)
            int r1 = compareBuildVersions(r3, r1)
            return r1
    }

    static /* synthetic */ int lambda$resolveNeoForgeVersions$2(java.lang.String r0, java.lang.String r1) {
            int r0 = compareBuildVersions(r1, r0)
            return r0
    }

    private static java.net.HttpURLConnection openConnection(java.lang.String r2) throws java.lang.Exception {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r0)
            r0 = 45000(0xafc8, float:6.3058E-41)
            r2.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher/1.0"
            r2.setRequestProperty(r0, r1)
            java.lang.String r0 = "GET"
            r2.setRequestMethod(r0)
            return r2
    }

    private static int[] parseBuildParts(java.lang.String r5) {
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "[.+\\-]"
            java.lang.String[] r5 = r5.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r1) goto L24
            r4 = r5[r3]
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L21
            r0.add(r4)     // Catch: java.lang.NumberFormatException -> L21
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            int r5 = r0.size()
            int[] r5 = new int[r5]
        L2a:
            int r1 = r0.size()
            if (r2 >= r1) goto L3f
            java.lang.Object r1 = r0.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5[r2] = r1
            int r2 = r2 + 1
            goto L2a
        L3f:
            return r5
    }

    private static java.util.ArrayList<java.lang.String> parseMavenVersions(java.lang.String r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "<version>([^<]+)</version>"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r3 = r1.matcher(r3)
        Lf:
            boolean r1 = r3.find()
            if (r1 == 0) goto L2e
            r1 = 1
            java.lang.String r1 = r3.group(r1)
            if (r1 == 0) goto Lf
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lf
            java.lang.String r1 = r1.trim()
            r0.add(r1)
            goto Lf
        L2e:
            return r0
    }

    private static java.lang.String readStream(java.io.InputStream r4) throws java.lang.Exception {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            r1 = 65536(0x10000, float:9.1835E-41)
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

    private static java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption> resolveFabricVersions(java.lang.String r9) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://meta.fabricmc.net/v2/versions/loader/"
            r0.<init>(r1)
            java.lang.String r9 = encode(r9)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            org.json.JSONArray r0 = new org.json.JSONArray
            java.lang.String r9 = downloadText(r9)
            r0.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        L28:
            int r4 = r0.length()
            if (r3 >= r4) goto L80
            org.json.JSONObject r4 = r0.optJSONObject(r3)
            if (r4 != 0) goto L35
            goto L7d
        L35:
            java.lang.String r5 = "loader"
            org.json.JSONObject r5 = r4.optJSONObject(r5)
            if (r5 != 0) goto L3e
            goto L3f
        L3e:
            r4 = r5
        L3f:
            java.lang.String r5 = "version"
            java.lang.String r6 = ""
            java.lang.String r5 = r4.optString(r5, r6)
            java.lang.String r6 = r5.trim()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L52
            goto L7d
        L52:
            java.lang.String r6 = "stable"
            boolean r4 = r4.optBoolean(r6, r2)
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r6 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption
            if (r4 == 0) goto L70
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r8 = "  • stable"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L71
        L70:
            r7 = r5
        L71:
            r6.<init>(r7, r5)
            if (r4 == 0) goto L7a
            r9.add(r6)
            goto L7d
        L7a:
            r1.add(r6)
        L7d:
            int r3 = r3 + 1
            goto L28
        L80:
            r9.addAll(r1)
            return r9
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption> resolveForgeVersions(java.lang.String r4) throws java.lang.Exception {
            java.lang.String r0 = "https://maven.minecraftforge.net/net/minecraftforge/forge/maven-metadata.xml"
            java.lang.String r0 = downloadText(r0)
            java.util.ArrayList r0 = parseMavenVersions(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r2.startsWith(r4)
            if (r3 == 0) goto L26
            r1.add(r2)
            goto L26
        L3c:
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$$ExternalSyntheticLambda0
            r0.<init>(r4)
            r1.sort(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r4.length()
            java.lang.String r2 = r2.substring(r3)
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r3 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption
            r3.<init>(r2, r2)
            r0.add(r3)
            goto L4d
        L6a:
            return r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption> resolveNeoForgeVersions(java.lang.String r7) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "https://maven.neoforged.net/releases/net/neoforged/forge/maven-metadata.xml"
            java.lang.String r1 = downloadText(r1)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r1 = parseMavenVersions(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "-"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7d
        L2b:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L41
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7d
            boolean r5 = r4.startsWith(r2)     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L2b
            r3.add(r4)     // Catch: java.lang.Throwable -> L7d
            goto L2b
        L41:
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L7d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            r3.sort(r1)     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
        L4d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L7d
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L7d
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r4 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r5.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r5 = r5.append(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = "  • NeoForged Forge"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7d
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L7d
            r0.add(r4)     // Catch: java.lang.Throwable -> L7d
            goto L4d
        L7d:
            java.lang.String r1 = "https://maven.neoforged.net/releases/net/neoforged/neoforge/maven-metadata.xml"
            java.lang.String r1 = downloadText(r1)     // Catch: java.lang.Throwable -> Lcb
            java.util.ArrayList r1 = parseMavenVersions(r1)     // Catch: java.lang.Throwable -> Lcb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lcb
        L90:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto Laa
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = formatNeoForgeGameVersion(r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L90
            r2.add(r3)     // Catch: java.lang.Throwable -> Lcb
            goto L90
        Laa:
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$$ExternalSyntheticLambda2 r7 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> Lcb
            r7.<init>()     // Catch: java.lang.Throwable -> Lcb
            r2.sort(r7)     // Catch: java.lang.Throwable -> Lcb
            java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> Lcb
        Lb6:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Ldf
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lcb
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r2 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption     // Catch: java.lang.Throwable -> Lcb
            r2.<init>(r1, r1)     // Catch: java.lang.Throwable -> Lcb
            r0.add(r2)     // Catch: java.lang.Throwable -> Lcb
            goto Lb6
        Lcb:
            r7 = move-exception
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ldf
            boolean r0 = r7 instanceof java.lang.Exception
            if (r0 == 0) goto Ld9
            java.lang.Exception r7 = (java.lang.Exception) r7
            throw r7
        Ld9:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r7)
            throw r0
        Ldf:
            return r0
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver.LoaderVersionOption> resolveVersions(java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "fabric"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L17
            java.util.ArrayList r2 = resolveFabricVersions(r3)
            return r2
        L17:
            java.lang.String r0 = "forge"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L24
            java.util.ArrayList r2 = resolveForgeVersions(r3)
            return r2
        L24:
            java.lang.String r0 = "neoforge"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L31
            java.util.ArrayList r2 = resolveNeoForgeVersions(r3)
            return r2
        L31:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption r3 = new ca.dnamobile.javalauncher.ui.version.LoaderVersionResolver$LoaderVersionOption
            java.lang.String r0 = "Vanilla"
            java.lang.String r1 = ""
            r3.<init>(r0, r1)
            r2.add(r3)
            return r2
    }
}
