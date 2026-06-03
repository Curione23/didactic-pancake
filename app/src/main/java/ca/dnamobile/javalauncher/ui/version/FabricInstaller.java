package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class FabricInstaller {
    private static final int BUFFER_SIZE = 65536;
    private static final java.lang.String FABRIC_META = "https://meta.fabricmc.net/v2";
    private static final int MAX_PARALLEL_DOWNLOADS = 4;
    private static final java.lang.String TAG = "FabricInstaller";

    private static final class DownloadEntry {
        final java.lang.String displayName;
        final java.lang.String sha1;
        final long size;
        final java.io.File targetFile;
        final java.lang.String url;

        private DownloadEntry(java.io.File r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6) {
                r0 = this;
                r0.<init>()
                r0.targetFile = r1
                r0.url = r2
                r0.sha1 = r3
                r1 = 0
                long r1 = java.lang.Math.max(r1, r4)
                r0.size = r1
                r0.displayName = r6
                return
        }

        /* synthetic */ DownloadEntry(java.io.File r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, ca.dnamobile.javalauncher.ui.version.FabricInstaller.DownloadEntryIA r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r6)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.FabricInstaller$DownloadEntry-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class DownloadEntryIA {
    }

    public static final class InstallResult {
        private final java.lang.String fabricVersionId;
        private final java.lang.String loaderVersion;
        private final java.lang.String minecraftVersionId;

        private InstallResult(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.minecraftVersionId = r1
                r0.loaderVersion = r2
                r0.fabricVersionId = r3
                return
        }

        /* synthetic */ InstallResult(java.lang.String r1, java.lang.String r2, java.lang.String r3, ca.dnamobile.javalauncher.ui.version.FabricInstaller.InstallResultIA r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public java.lang.String getFabricVersionId() {
                r1 = this;
                java.lang.String r0 = r1.fabricVersionId
                return r0
        }

        public java.lang.String getLoaderVersion() {
                r1 = this;
                java.lang.String r0 = r1.loaderVersion
                return r0
        }

        public java.lang.String getMinecraftVersionId() {
                r1 = this;
                java.lang.String r0 = r1.minecraftVersionId
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.FabricInstaller$InstallResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class InstallResultIA {
    }

    public static /* synthetic */ void $r8$lambda$VruE1iMd4WebSzISpuZmp6Bm4fw(ca.dnamobile.javalauncher.ui.version.FabricInstaller.DownloadEntry r0) {
            downloadFileIfNeeded(r0)
            return
    }

    private FabricInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String artifactPathFromName(java.lang.String r7) {
            java.lang.String r0 = ":"
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r1 = 3
            if (r0 >= r1) goto Lc
            r7 = 0
            return r7
        Lc:
            r0 = 0
            r0 = r7[r0]
            r2 = 46
            r3 = 47
            java.lang.String r0 = r0.replace(r2, r3)
            r2 = 1
            r2 = r7[r2]
            r3 = 2
            r3 = r7[r3]
            int r4 = r7.length
            r5 = 4
            java.lang.String r6 = "-"
            if (r4 < r5) goto L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r7 = r7[r1]
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            goto L35
        L33:
            java.lang.String r7 = ""
        L35:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = ".jar"
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private static java.lang.String buildLibraryUrl(java.lang.String r3, java.lang.String r4) {
            if (r3 == 0) goto L8
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto La
        L8:
            java.lang.String r3 = "https://maven.fabricmc.net/"
        La:
            java.lang.String r0 = "http://"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://"
            r1.<init>(r2)
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L29:
            java.lang.String r0 = "/"
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static void copyFile(java.io.File r3, java.io.File r4) throws java.lang.Exception {
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L9
            ensureDirectory(r0)
        L9:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L34
            r4 = 65536(0x10000, float:9.1835E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2a
        L17:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L2a
            r2 = -1
            if (r1 == r2) goto L23
            r2 = 0
            r3.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L2a
            goto L17
        L23:
            r3.close()     // Catch: java.lang.Throwable -> L34
            r0.close()
            return
        L2a:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L34
        L33:
            throw r4     // Catch: java.lang.Throwable -> L34
        L34:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r4 = move-exception
            r3.addSuppressed(r4)
        L3d:
            throw r3
    }

    private static ca.dnamobile.javalauncher.ui.version.FabricInstaller.DownloadEntry createLibraryDownloadEntry(org.json.JSONObject r12) {
            java.lang.String r0 = "name"
            java.lang.String r1 = ""
            java.lang.String r0 = r12.optString(r0, r1)
            java.lang.String r2 = "org.lwjgl:"
            boolean r2 = r0.startsWith(r2)
            r3 = 0
            if (r2 == 0) goto L12
            return r3
        L12:
            java.lang.String r2 = "downloads"
            org.json.JSONObject r2 = r12.optJSONObject(r2)
            if (r2 == 0) goto L21
            java.lang.String r4 = "artifact"
            org.json.JSONObject r2 = r2.optJSONObject(r4)
            goto L22
        L21:
            r2 = r3
        L22:
            r4 = 0
            java.lang.String r6 = "url"
            if (r2 == 0) goto L5e
            java.lang.String r0 = "path"
            java.lang.String r0 = r2.optString(r0, r1)
            java.lang.String r7 = r2.optString(r6, r1)
            java.lang.String r8 = "sha1"
            java.lang.String r8 = r2.optString(r8, r3)
            java.lang.String r8 = emptyToNull(r8)
            java.lang.String r9 = "size"
            long r4 = r2.optLong(r9, r4)
            if (r7 == 0) goto L4a
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L5a
        L4a:
            if (r0 == 0) goto L5a
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L5a
            java.lang.String r12 = r12.optString(r6, r1)
            java.lang.String r7 = buildLibraryUrl(r12, r0)
        L5a:
            r6 = r7
            r7 = r8
            r8 = r4
            goto L72
        L5e:
            java.lang.String r0 = artifactPathFromName(r0)
            if (r0 != 0) goto L66
            r7 = r3
            goto L6f
        L66:
            java.lang.String r12 = r12.optString(r6, r1)
            java.lang.String r12 = buildLibraryUrl(r12, r0)
            r7 = r12
        L6f:
            r8 = r4
            r6 = r7
            r7 = r3
        L72:
            if (r0 == 0) goto L98
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L98
            if (r6 == 0) goto L98
            boolean r12 = r6.isEmpty()
            if (r12 == 0) goto L83
            goto L98
        L83:
            java.io.File r5 = new java.io.File
            java.io.File r12 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            r5.<init>(r12, r0)
            ca.dnamobile.javalauncher.ui.version.FabricInstaller$DownloadEntry r12 = new ca.dnamobile.javalauncher.ui.version.FabricInstaller$DownloadEntry
            java.lang.String r10 = r5.getName()
            r11 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r10, r11)
            return r12
        L98:
            return r3
    }

    private static void downloadFileIfNeeded(ca.dnamobile.javalauncher.ui.version.FabricInstaller.DownloadEntry r5) throws java.lang.Exception {
            java.lang.String r0 = "Unable to replace "
            java.lang.String r1 = "SHA-1 mismatch for "
            java.io.File r2 = r5.targetFile
            boolean r2 = r2.isFile()
            if (r2 == 0) goto L3b
            java.lang.String r2 = r5.sha1
            if (r2 == 0) goto L3a
            java.io.File r2 = r5.targetFile
            java.lang.String r2 = sha1(r2)
            java.lang.String r3 = r5.sha1
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L1f
            goto L3a
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Existing file hash mismatch, redownloading: "
            r2.<init>(r3)
            java.io.File r3 = r5.targetFile
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FabricInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            goto L3b
        L3a:
            return
        L3b:
            java.io.File r2 = r5.targetFile
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L46
            ensureDirectory(r2)
        L46:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.File r4 = r5.targetFile
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ".part"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            java.lang.String r3 = r5.url     // Catch: java.lang.Exception -> Lca
            downloadToFile(r3, r2)     // Catch: java.lang.Exception -> Lca
            java.lang.String r3 = r5.sha1     // Catch: java.lang.Exception -> Lca
            if (r3 == 0) goto L8f
            java.lang.String r3 = sha1(r2)     // Catch: java.lang.Exception -> Lca
            java.lang.String r4 = r5.sha1     // Catch: java.lang.Exception -> Lca
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Exception -> Lca
            if (r3 == 0) goto L7a
            goto L8f
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lca
            r3.<init>(r1)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = r5.displayName     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lca
            r0.<init>(r5)     // Catch: java.lang.Exception -> Lca
            throw r0     // Catch: java.lang.Exception -> Lca
        L8f:
            java.io.File r1 = r5.targetFile     // Catch: java.lang.Exception -> Lca
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> Lca
            if (r1 == 0) goto Lb9
            java.io.File r1 = r5.targetFile     // Catch: java.lang.Exception -> Lca
            boolean r1 = r1.delete()     // Catch: java.lang.Exception -> Lca
            if (r1 == 0) goto La0
            goto Lb9
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lca
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lca
            java.io.File r5 = r5.targetFile     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lca
            r1.<init>(r5)     // Catch: java.lang.Exception -> Lca
            throw r1     // Catch: java.lang.Exception -> Lca
        Lb9:
            java.io.File r0 = r5.targetFile     // Catch: java.lang.Exception -> Lca
            boolean r0 = r2.renameTo(r0)     // Catch: java.lang.Exception -> Lca
            if (r0 != 0) goto Lc9
            java.io.File r5 = r5.targetFile     // Catch: java.lang.Exception -> Lca
            copyFile(r2, r5)     // Catch: java.lang.Exception -> Lca
            r2.delete()     // Catch: java.lang.Exception -> Lca
        Lc9:
            return
        Lca:
            r5 = move-exception
            r2.delete()
            throw r5
    }

    private static void downloadLibraries(org.json.JSONObject r3, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r4) throws java.lang.Exception {
            java.lang.String r0 = "libraries"
            org.json.JSONArray r3 = r3.optJSONArray(r0)
            if (r3 == 0) goto L4c
            int r0 = r3.length()
            if (r0 != 0) goto Lf
            goto L4c
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L15:
            int r2 = r3.length()
            if (r1 >= r2) goto L2e
            org.json.JSONObject r2 = r3.optJSONObject(r1)
            if (r2 != 0) goto L22
            goto L2b
        L22:
            ca.dnamobile.javalauncher.ui.version.FabricInstaller$DownloadEntry r2 = createLibraryDownloadEntry(r2)
            if (r2 == 0) goto L2b
            r0.add(r2)
        L2b:
            int r1 = r1 + 1
            goto L15
        L2e:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L35
            return
        L35:
            int r3 = r0.size()
            r1 = 1
            int r3 = java.lang.Math.max(r1, r3)
            ca.dnamobile.javalauncher.ui.version.FabricInstaller$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ui.version.FabricInstaller$$ExternalSyntheticLambda0
            r1.<init>()
            ca.dnamobile.javalauncher.ui.version.FabricInstaller$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.ui.version.FabricInstaller$$ExternalSyntheticLambda1
            r2.<init>(r3, r4)
            r3 = 4
            ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.run(r0, r3, r1, r2)
        L4c:
            return
    }

    private static java.lang.String downloadText(java.lang.String r5) throws java.lang.Exception {
            java.net.HttpURLConnection r0 = openConnection(r5)
            int r1 = r0.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 < r3) goto L15
            if (r1 >= r2) goto L15
            java.io.InputStream r4 = r0.getInputStream()
            goto L19
        L15:
            java.io.InputStream r4 = r0.getErrorStream()
        L19:
            java.lang.String r4 = readStream(r4)
            r0.disconnect()
            if (r1 < r3) goto L25
            if (r1 >= r2) goto L25
            return r4
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "HTTP "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " while downloading "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = " "
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    private static void downloadToFile(java.lang.String r4, java.io.File r5) throws java.lang.Exception {
            java.net.HttpURLConnection r0 = openConnection(r4)
            int r1 = r0.getResponseCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L50
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L50
            java.io.InputStream r4 = r0.getInputStream()     // Catch: java.lang.Throwable -> L4b
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L3f
            r5 = 65536(0x10000, float:9.1835E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L35
        L1d:
            int r2 = r4.read(r5)     // Catch: java.lang.Throwable -> L35
            r3 = -1
            if (r2 == r3) goto L29
            r3 = 0
            r1.write(r5, r3, r2)     // Catch: java.lang.Throwable -> L35
            goto L1d
        L29:
            r1.close()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L31
            r4.close()     // Catch: java.lang.Throwable -> L4b
        L31:
            r0.disconnect()
            return
        L35:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r5     // Catch: java.lang.Throwable -> L3f
        L3f:
            r5 = move-exception
            if (r4 == 0) goto L4a
            r4.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L4b
        L4a:
            throw r5     // Catch: java.lang.Throwable -> L4b
        L4b:
            r4 = move-exception
            r0.disconnect()
            throw r4
        L50:
            java.io.InputStream r5 = r0.getErrorStream()
            java.lang.String r5 = readStream(r5)
            r0.disconnect()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "HTTP "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " while downloading "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private static java.lang.String emptyToNull(java.lang.String r1) {
            if (r1 == 0) goto L12
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            java.lang.String r1 = r1.trim()
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private static java.lang.String encode(java.lang.String r1) throws java.lang.Exception {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r0)
            return r1
    }

    private static void ensureDirectory(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 != 0) goto L26
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create directory: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L26:
            return
    }

    private static java.lang.String fetchLatestStableLoaderVersion(java.lang.String r8) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://meta.fabricmc.net/v2/versions/loader/"
            r0.<init>(r1)
            java.lang.String r1 = encode(r8)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.json.JSONArray r1 = new org.json.JSONArray
            java.lang.String r0 = downloadText(r0)
            r1.<init>(r0)
            java.lang.String r0 = ""
            r2 = 0
            r4 = r0
            r3 = r2
        L21:
            int r5 = r1.length()
            if (r3 >= r5) goto L55
            org.json.JSONObject r5 = r1.getJSONObject(r3)
            java.lang.String r6 = "loader"
            org.json.JSONObject r6 = r5.optJSONObject(r6)
            if (r6 != 0) goto L34
            goto L35
        L34:
            r5 = r6
        L35:
            java.lang.String r6 = "version"
            java.lang.String r6 = r5.optString(r6, r0)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            goto L52
        L42:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L49
            r4 = r6
        L49:
            java.lang.String r7 = "stable"
            boolean r5 = r5.optBoolean(r7, r2)
            if (r5 == 0) goto L52
            return r6
        L52:
            int r3 = r3 + 1
            goto L21
        L55:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5c
            return r4
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No Fabric Loader versions are available for "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    private static void flattenInheritedProfileIfEnabled(android.content.Context r2, java.lang.String r3, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r4) throws java.lang.Exception {
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isRemoveInheritedVanillaAfterLoaderInstall(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 94
            java.lang.String r1 = "Flattening loader profile..."
            notify(r4, r0, r1)
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult r0 = ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.flattenInstalledVersionProfile(r2, r3)
            boolean r0 = r0.flattened
            if (r0 != 0) goto L17
            return
        L17:
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r2 = ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.deleteFlattenedParentVersionIfSafe(r2, r3)
            java.lang.String r3 = "FabricInstaller"
            java.lang.String r0 = r2.message
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r0)
            boolean r3 = r2.deleted
            if (r3 == 0) goto L40
            java.lang.String r3 = r2.parentVersionId
            if (r3 == 0) goto L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Removed inherited vanilla files: "
            r3.<init>(r0)
            java.lang.String r2 = r2.parentVersionId
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r3 = 95
            notify(r4, r3, r2)
        L40:
            return
    }

    public static java.lang.String inferLoaderNameFromVersionId(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "fabric-loader"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "fabric-"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            java.lang.String r1 = "Vanilla"
            return r1
        L1a:
            java.lang.String r1 = "Fabric"
            return r1
    }

    public static ca.dnamobile.javalauncher.ui.version.FabricInstaller.InstallResult installFabricVersion(android.content.Context r6, ca.dnamobile.javalauncher.data.model.MinecraftVersion r7, java.lang.String r8, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r9) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r6)
            java.lang.String r0 = r7.getId()
            java.util.Set r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.findInstalledVersionIds()
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L14
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.installVanillaVersion(r6, r7, r9)
        L14:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Resolving Fabric Loader for "
            r7.<init>(r1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r2 = 72
            notify(r9, r2, r7)
            if (r8 == 0) goto L3a
            java.lang.String r7 = r8.trim()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3e
        L3a:
            java.lang.String r8 = fetchLatestStableLoaderVersion(r0)
        L3e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Downloading Fabric profile "
            r7.<init>(r2)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r1 = 76
            notify(r9, r1, r7)
            java.lang.String r7 = profileJsonUrl(r0, r8)
            java.lang.String r7 = downloadText(r7)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "fabric-loader-"
            r7.<init>(r2)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "id"
            java.lang.String r7 = r1.optString(r2, r7)
            java.io.File r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r7)
            ensureDirectory(r2)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r5 = ".json"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r2, r4)
            r2 = 2
            java.lang.String r2 = r1.toString(r2)
            writeString(r3, r2)
            r2 = 80
            java.lang.String r3 = "Downloading Fabric libraries..."
            notify(r9, r2, r3)
            downloadLibraries(r1, r9)
            writeInstallMarker(r7, r0, r8, r1)
            flattenInheritedProfileIfEnabled(r6, r7, r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Fabric "
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r1 = " is ready."
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r1 = 96
            notify(r9, r1, r6)
            ca.dnamobile.javalauncher.ui.version.FabricInstaller$InstallResult r6 = new ca.dnamobile.javalauncher.ui.version.FabricInstaller$InstallResult
            r9 = 0
            r6.<init>(r0, r8, r7, r9)
            return r6
    }

    static /* synthetic */ void lambda$downloadLibraries$0(int r4, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r5, int r6, int r7, ca.dnamobile.javalauncher.ui.version.FabricInstaller.DownloadEntry r8) {
            long r0 = (long) r6
            r2 = 12
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 / r2
            int r7 = (int) r0
            int r7 = r7 + 80
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Downloading Fabric libraries ("
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = "/"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = "): "
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = r8.displayName
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            notify(r5, r7, r4)
            return
    }

    private static void notify(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r1, int r2, java.lang.String r3) {
            if (r1 == 0) goto L10
            r0 = 100
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r1.onProgress(r2, r3)
        L10:
            return
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

    private static java.lang.String profileJsonUrl(java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://meta.fabricmc.net/v2/versions/loader/"
            r0.<init>(r1)
            java.lang.String r2 = encode(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "/"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = encode(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/profile/json"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
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

    private static java.lang.String sha1(java.io.File r6) throws java.lang.Exception {
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r6)
            r6 = 65536(0x10000, float:9.1835E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L4a
        Lf:
            int r2 = r1.read(r6)     // Catch: java.lang.Throwable -> L4a
            r3 = -1
            r4 = 0
            if (r2 == r3) goto L1b
            r0.update(r6, r4, r2)     // Catch: java.lang.Throwable -> L4a
            goto Lf
        L1b:
            r1.close()
            byte[] r6 = r0.digest()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
        L2b:
            if (r4 >= r1) goto L45
            r2 = r6[r4]
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "%02x"
            java.lang.String r2 = java.lang.String.format(r3, r5, r2)
            r0.append(r2)
            int r4 = r4 + 1
            goto L2b
        L45:
            java.lang.String r6 = r0.toString()
            return r6
        L4a:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r6.addSuppressed(r0)
        L53:
            throw r6
    }

    private static void writeInstallMarker(java.lang.String r3, java.lang.String r4, java.lang.String r5, org.json.JSONObject r6) throws java.lang.Exception {
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r3)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "id"
            r1.put(r2, r3)
            java.lang.String r3 = "loader"
            java.lang.String r2 = "Fabric"
            r1.put(r3, r2)
            java.lang.String r3 = "minecraftVersion"
            r1.put(r3, r4)
            java.lang.String r3 = "loaderVersion"
            r1.put(r3, r5)
            java.lang.String r3 = "inheritsFrom"
            java.lang.String r4 = r6.optString(r3, r4)
            r1.put(r3, r4)
            java.lang.String r3 = "versionDir"
            java.lang.String r4 = r0.getAbsolutePath()
            r1.put(r3, r4)
            java.io.File r3 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r4 = "librariesDir"
            r1.put(r4, r3)
            java.lang.String r3 = "installStage"
            java.lang.String r4 = "fabric_profile_ready"
            r1.put(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "java_launcher_fabric_install_marker.json"
            r3.<init>(r0, r4)
            r4 = 2
            java.lang.String r4 = r1.toString(r4)
            writeString(r3, r4)
            return
    }

    private static void writeString(java.io.File r1, java.lang.String r2) throws java.lang.Exception {
            java.io.File r0 = r1.getParentFile()
            if (r0 == 0) goto L9
            ensureDirectory(r0)
        L9:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1b
            byte[] r1 = r2.getBytes(r1)     // Catch: java.lang.Throwable -> L1b
            r0.write(r1)     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r2 = move-exception
            r1.addSuppressed(r2)
        L24:
            throw r1
    }
}
