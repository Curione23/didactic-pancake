package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class MinecraftVersionManifestClient {
    private static final java.lang.String VERSION_MANIFEST_URL = "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json";

    private MinecraftVersionManifestClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String downloadText(java.lang.String r4) throws java.lang.Exception {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r4)
            java.net.URLConnection r4 = r0.openConnection()
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
            r0 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r4.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher/1.0"
            r4.setRequestProperty(r0, r1)
            java.lang.String r0 = "GET"
            r4.setRequestMethod(r0)
            int r0 = r4.getResponseCode()
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L32
            if (r0 >= r1) goto L32
            java.io.InputStream r3 = r4.getInputStream()
            goto L36
        L32:
            java.io.InputStream r3 = r4.getErrorStream()
        L36:
            java.lang.String r3 = readStream(r3)
            r4.disconnect()
            if (r0 < r2) goto L42
            if (r0 >= r1) goto L42
            return r3
        L42:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " while downloading version manifest"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public static java.util.List<ca.dnamobile.javalauncher.data.model.MinecraftVersion> loadVersions(android.content.Context r2) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r2)
            java.io.File r2 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.FILE_VERSION_LIST
            r2.<init>(r0)
            java.lang.String r0 = "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"
            java.lang.String r0 = downloadText(r0)     // Catch: java.lang.Throwable -> L14
            writeString(r2, r0)     // Catch: java.lang.Throwable -> L14
            goto L1f
        L14:
            r0 = move-exception
            boolean r1 = r2.exists()
            if (r1 == 0) goto L24
            java.lang.String r0 = readString(r2)
        L1f:
            java.util.List r2 = parseVersions(r0)
            return r2
        L24:
            throw r0
    }

    private static java.util.List<ca.dnamobile.javalauncher.data.model.MinecraftVersion> parseVersions(java.lang.String r8) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            java.lang.String r8 = "versions"
            org.json.JSONArray r8 = r0.getJSONArray(r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r8.length()
            r0.<init>(r1)
            r1 = 0
        L15:
            int r2 = r8.length()
            if (r1 >= r2) goto L42
            org.json.JSONObject r2 = r8.getJSONObject(r1)
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r3 = new ca.dnamobile.javalauncher.data.model.MinecraftVersion
            java.lang.String r4 = "id"
            java.lang.String r4 = r2.optString(r4)
            java.lang.String r5 = "type"
            java.lang.String r5 = r2.optString(r5)
            java.lang.String r6 = "releaseTime"
            java.lang.String r6 = r2.optString(r6)
            java.lang.String r7 = "url"
            java.lang.String r2 = r2.optString(r7)
            r3.<init>(r4, r5, r6, r2)
            r0.add(r3)
            int r1 = r1 + 1
            goto L15
        L42:
            return r0
    }

    private static java.lang.String readStream(java.io.InputStream r3) throws java.lang.Exception {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r3, r2)
            r0.<init>(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
        L11:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L29
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            goto L11
        L21:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L29
            r0.close()
            return r3
        L29:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r0 = move-exception
            r3.addSuppressed(r0)
        L32:
            throw r3
    }

    private static java.lang.String readString(java.io.File r4) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r1 = 65536(0x10000, float:9.1835E-41)
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

    private static void writeString(java.io.File r2, java.lang.String r3) throws java.lang.Exception {
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto Lf
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L21
            byte[] r2 = r3.getBytes(r2)     // Catch: java.lang.Throwable -> L21
            r0.write(r2)     // Catch: java.lang.Throwable -> L21
            r0.close()
            return
        L21:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r3 = move-exception
            r2.addSuppressed(r3)
        L2a:
            throw r2
    }
}
