package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class MinecraftVersionInstaller {
    private static final int DOWNLOAD_BUFFER_SIZE = 65536;
    private static final int MAX_PARALLEL_DOWNLOADS = 0;
    private static final java.lang.String RESOURCE_BASE_URL = "https://resources.download.minecraft.net/";
    private static final java.lang.String TAG = "VanillaInstaller";

    private static final class DownloadEntry {
        final java.lang.String displayName;
        final boolean optional;
        final java.lang.String sha1;
        final long size;
        final java.io.File targetFile;
        final java.lang.String url;

        private DownloadEntry(java.io.File r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.targetFile = r1
                r0.url = r2
                r0.sha1 = r3
                r1 = 0
                long r1 = java.lang.Math.max(r1, r4)
                r0.size = r1
                r0.displayName = r6
                r0.optional = r7
                return
        }

        /* synthetic */ DownloadEntry(java.io.File r1, java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6, boolean r7, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntryIA r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r6, r7)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class DownloadEntryIA {
    }

    public interface InstallProgressListener {
        void onProgress(int r1, java.lang.String r2);
    }

    public static /* synthetic */ void $r8$lambda$ewISERrVkdKJFhJeDGYUdCV2jh0(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry r0) {
            downloadFileIfNeededWithRetry(r0)
            return
    }

    static {
            int r0 = ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.defaultNetworkThreads()
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.MAX_PARALLEL_DOWNLOADS = r0
            return
    }

    private MinecraftVersionInstaller() {
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

    private static java.lang.String artifactPathFromNameWithExtension(java.lang.String r7, java.lang.String r8) {
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
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private static java.lang.String buildLibraryUrl(java.lang.String r3, java.lang.String r4) {
            if (r3 == 0) goto L8
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto La
        L8:
            java.lang.String r3 = "https://libraries.minecraft.net/"
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

    private static void collectAssets(java.util.List<ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry> r21, java.io.File r22) throws java.lang.Exception {
            boolean r0 = r22.isFile()
            if (r0 != 0) goto L7
            return
        L7:
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = readString(r22)
            r0.<init>(r1)
            java.lang.String r1 = "objects"
            org.json.JSONObject r2 = r0.optJSONObject(r1)
            if (r2 != 0) goto L19
            return
        L19:
            java.lang.String r3 = "virtual"
            r4 = 0
            boolean r5 = r0.optBoolean(r3, r4)
            java.lang.String r6 = "map_to_resources"
            boolean r0 = r0.optBoolean(r6, r4)
            java.lang.String r6 = r22.getName()
            java.lang.String r6 = stripJsonExtension(r6)
            org.json.JSONArray r7 = r2.names()
            if (r7 != 0) goto L35
            return
        L35:
            r8 = r4
        L36:
            int r9 = r7.length()
            if (r8 >= r9) goto L122
            java.lang.String r9 = ""
            java.lang.String r14 = r7.optString(r8, r9)
            org.json.JSONObject r10 = r2.optJSONObject(r14)
            if (r10 != 0) goto L51
        L48:
            r19 = r0
            r9 = r1
            r20 = r2
            r0 = r21
            goto L118
        L51:
            java.lang.String r11 = "hash"
            java.lang.String r13 = r10.optString(r11, r9)
            int r9 = r13.length()
            r11 = 2
            if (r9 >= r11) goto L5f
            goto L48
        L5f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r13.substring(r4, r11)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = java.io.File.separator
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r13)
            java.lang.String r9 = r9.toString()
            if (r5 == 0) goto La3
            java.io.File r11 = new java.io.File
            java.io.File r12 = getAssetsDirectory()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r3)
            java.lang.String r4 = java.io.File.separator
            java.lang.StringBuilder r4 = r15.append(r4)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r15 = java.io.File.separator
            java.lang.StringBuilder r4 = r4.append(r15)
            java.lang.StringBuilder r4 = r4.append(r14)
            java.lang.String r4 = r4.toString()
            r11.<init>(r12, r4)
            goto Le1
        La3:
            if (r0 == 0) goto Lc4
            java.io.File r4 = new java.io.File
            java.io.File r11 = getAssetsDirectory()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r15 = "resources"
            r12.<init>(r15)
            java.lang.String r15 = java.io.File.separator
            java.lang.StringBuilder r12 = r12.append(r15)
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r12 = r12.toString()
            r4.<init>(r11, r12)
            goto Le0
        Lc4:
            java.io.File r4 = new java.io.File
            java.io.File r11 = getAssetsDirectory()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r1)
            java.lang.String r15 = java.io.File.separator
            java.lang.StringBuilder r12 = r12.append(r15)
            java.lang.StringBuilder r12 = r12.append(r9)
            java.lang.String r12 = r12.toString()
            r4.<init>(r11, r12)
        Le0:
            r11 = r4
        Le1:
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry r4 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r15 = "https://resources.download.minecraft.net/"
            r12.<init>(r15)
            char r15 = java.io.File.separatorChar
            r19 = r0
            r0 = 47
            java.lang.String r0 = r9.replace(r15, r0)
            java.lang.StringBuilder r0 = r12.append(r0)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "size"
            r9 = r1
            r20 = r2
            r1 = 0
            long r0 = r10.optLong(r0, r1)
            r17 = 0
            r18 = 0
            r10 = r4
            r2 = r14
            r14 = r0
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r16, r17, r18)
            r0 = r21
            r0.add(r4)
        L118:
            int r8 = r8 + 1
            r1 = r9
            r0 = r19
            r2 = r20
            r4 = 0
            goto L36
        L122:
            return
    }

    private static void collectClientJar(java.util.List<ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry> r11, org.json.JSONObject r12, java.io.File r13) throws java.lang.Exception {
            java.lang.String r0 = "downloads"
            org.json.JSONObject r12 = r12.optJSONObject(r0)
            if (r12 == 0) goto L52
            java.lang.String r0 = "client"
            org.json.JSONObject r12 = r12.optJSONObject(r0)
            if (r12 == 0) goto L4a
            java.lang.String r0 = "url"
            java.lang.String r1 = ""
            java.lang.String r4 = r12.optString(r0, r1)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L42
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry r0 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry
            java.lang.String r1 = "sha1"
            r2 = 0
            java.lang.String r1 = r12.optString(r1, r2)
            java.lang.String r5 = emptyToNull(r1)
            java.lang.String r1 = "size"
            r2 = 0
            long r6 = r12.optLong(r1, r2)
            java.lang.String r8 = r13.getName()
            r9 = 0
            r10 = 0
            r2 = r0
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            r11.add(r0)
            return
        L42:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Version JSON has no client jar URL."
            r11.<init>(r12)
            throw r11
        L4a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Version JSON has no client download block."
            r11.<init>(r12)
            throw r11
        L52:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Version JSON has no downloads block."
            r11.<init>(r12)
            throw r11
    }

    private static void collectLibraries(java.util.List<ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry> r20, java.util.List<java.io.File> r21, org.json.JSONObject r22) throws java.lang.Exception {
            r0 = r20
            java.lang.String r1 = "libraries"
            r2 = r22
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            if (r1 != 0) goto Ld
            return
        Ld:
            java.io.File r2 = getLibrariesDirectory()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
        L17:
            int r5 = r1.length()
            if (r4 >= r5) goto Led
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 != 0) goto L27
        L23:
            r8 = r21
            goto Le9
        L27:
            java.lang.String r6 = "name"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.optString(r6, r7)
            java.lang.String r8 = "org.lwjgl:"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L38
            goto L23
        L38:
            java.lang.String r8 = "rules"
            org.json.JSONArray r8 = r5.optJSONArray(r8)
            boolean r8 = isAllowedByRules(r8)
            if (r8 != 0) goto L45
            goto L23
        L45:
            java.lang.String r8 = "net.java.dev.jna:jna:"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L53
            r8 = r21
            scheduleNativeAarDownload(r0, r8, r6)
            goto L55
        L53:
            r8 = r21
        L55:
            java.lang.String r9 = "downloads"
            org.json.JSONObject r9 = r5.optJSONObject(r9)
            r10 = 0
            if (r9 == 0) goto L65
            java.lang.String r11 = "artifact"
            org.json.JSONObject r9 = r9.optJSONObject(r11)
            goto L66
        L65:
            r9 = r10
        L66:
            r11 = 0
            java.lang.String r13 = "url"
            if (r9 == 0) goto La5
            java.lang.String r6 = "path"
            java.lang.String r6 = r9.optString(r6, r7)
            java.lang.String r14 = r9.optString(r13, r7)
            java.lang.String r15 = "sha1"
            java.lang.String r10 = r9.optString(r15, r10)
            java.lang.String r10 = emptyToNull(r10)
            java.lang.String r15 = "size"
            long r11 = r9.optLong(r15, r11)
            if (r14 == 0) goto L8e
            boolean r9 = r14.isEmpty()
            if (r9 == 0) goto L9e
        L8e:
            if (r6 == 0) goto L9e
            boolean r9 = r6.isEmpty()
            if (r9 != 0) goto L9e
            java.lang.String r5 = r5.optString(r13, r7)
            java.lang.String r14 = buildLibraryUrl(r5, r6)
        L9e:
            r18 = r11
            r12 = r10
            r11 = r14
            r13 = r18
            goto Lb7
        La5:
            java.lang.String r6 = artifactPathFromName(r6)
            if (r6 != 0) goto Lad
            r14 = r10
            goto L9e
        Lad:
            java.lang.String r5 = r5.optString(r13, r7)
            java.lang.String r5 = buildLibraryUrl(r5, r6)
            r14 = r5
            goto L9e
        Lb7:
            if (r6 == 0) goto Le9
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto Le9
            if (r11 == 0) goto Le9
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto Lc8
            goto Le9
        Lc8:
            java.io.File r10 = new java.io.File
            r10.<init>(r2, r6)
            java.lang.String r5 = r10.getCanonicalPath()
            boolean r5 = r3.add(r5)
            if (r5 != 0) goto Ld8
            goto Le9
        Ld8:
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry r5 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry
            java.lang.String r15 = r10.getName()
            r16 = 1
            r17 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r15, r16, r17)
            r0.add(r5)
        Le9:
            int r4 = r4 + 1
            goto L17
        Led:
            return
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

    private static java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry> deduplicateDownloadEntries(java.util.ArrayList<ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r4.next()
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry r2 = (ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry) r2
            java.io.File r3 = r2.targetFile     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L25
            goto L2b
        L25:
            java.io.File r3 = r2.targetFile
            java.lang.String r3 = r3.getAbsolutePath()
        L2b:
            boolean r3 = r1.add(r3)
            if (r3 == 0) goto L12
            r0.add(r2)
            goto L12
        L35:
            return r0
    }

    private static void downloadFileIfNeeded(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry r6) throws java.lang.Exception {
            java.lang.String r0 = "Unable to replace "
            java.lang.String r1 = "SHA-1 mismatch for "
            java.io.File r2 = r6.targetFile
            boolean r2 = r2.isFile()
            java.lang.String r3 = "VanillaInstaller"
            if (r2 == 0) goto L3b
            java.lang.String r2 = r6.sha1
            if (r2 == 0) goto L3a
            java.io.File r2 = r6.targetFile
            java.lang.String r2 = sha1(r2)
            java.lang.String r4 = r6.sha1
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L21
            goto L3a
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Existing file hash mismatch, redownloading: "
            r2.<init>(r4)
            java.io.File r4 = r6.targetFile
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            goto L3b
        L3a:
            return
        L3b:
            java.io.File r2 = r6.targetFile
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L46
            ensureDirectory(r2)
        L46:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r5 = r6.targetFile
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ".part"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            java.lang.String r4 = r6.url     // Catch: java.lang.Exception -> Lca
            downloadToFile(r4, r2)     // Catch: java.lang.Exception -> Lca
            java.lang.String r4 = r6.sha1     // Catch: java.lang.Exception -> Lca
            if (r4 == 0) goto L8f
            java.lang.String r4 = sha1(r2)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = r6.sha1     // Catch: java.lang.Exception -> Lca
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch: java.lang.Exception -> Lca
            if (r4 == 0) goto L7a
            goto L8f
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lca
            r4.<init>(r1)     // Catch: java.lang.Exception -> Lca
            java.lang.String r1 = r6.displayName     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.lang.Exception -> Lca
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lca
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lca
            throw r0     // Catch: java.lang.Exception -> Lca
        L8f:
            java.io.File r1 = r6.targetFile     // Catch: java.lang.Exception -> Lca
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> Lca
            if (r1 == 0) goto Lb9
            java.io.File r1 = r6.targetFile     // Catch: java.lang.Exception -> Lca
            boolean r1 = r1.delete()     // Catch: java.lang.Exception -> Lca
            if (r1 == 0) goto La0
            goto Lb9
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lca
            r4.<init>(r0)     // Catch: java.lang.Exception -> Lca
            java.io.File r0 = r6.targetFile     // Catch: java.lang.Exception -> Lca
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Exception -> Lca
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lca
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lca
            throw r1     // Catch: java.lang.Exception -> Lca
        Lb9:
            java.io.File r0 = r6.targetFile     // Catch: java.lang.Exception -> Lca
            boolean r0 = r2.renameTo(r0)     // Catch: java.lang.Exception -> Lca
            if (r0 != 0) goto Lc9
            java.io.File r0 = r6.targetFile     // Catch: java.lang.Exception -> Lca
            copyFile(r2, r0)     // Catch: java.lang.Exception -> Lca
            r2.delete()     // Catch: java.lang.Exception -> Lca
        Lc9:
            return
        Lca:
            r0 = move-exception
            r2.delete()
            boolean r1 = r6.optional
            if (r1 == 0) goto Lf5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping optional download: "
            r1.<init>(r2)
            java.lang.String r6 = r6.url
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = " because "
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r6)
            return
        Lf5:
            throw r0
    }

    private static void downloadFileIfNeededWithRetry(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry r7) throws java.lang.Exception {
            boolean r0 = r7.optional
            if (r0 == 0) goto L6
            r0 = 2
            goto L7
        L6:
            r0 = 4
        L7:
            r1 = 1
            r2 = 0
        L9:
            if (r1 > r0) goto L6e
            downloadFileIfNeeded(r7)     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r2 = move-exception
            if (r1 < r0) goto L13
            goto L6e
        L13:
            r3 = 500(0x1f4, double:2.47E-321)
            long r5 = (long) r1
            long r5 = r5 * r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Download failed for "
            r3.<init>(r4)
            java.lang.String r4 = r7.displayName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " attempt "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = "/"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r2.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ". Retrying in "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = "ms"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "VanillaInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            java.lang.Thread.sleep(r5)     // Catch: java.lang.InterruptedException -> L65
            int r1 = r1 + 1
            goto L9
        L65:
            r7 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            throw r7
        L6e:
            if (r2 != 0) goto L71
            return
        L71:
            throw r2
    }

    public static java.lang.String downloadText(java.lang.String r5) throws java.lang.Exception {
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

    public static void ensureJnaNativesForLaunch(java.lang.String r6, org.json.JSONObject r7) throws java.lang.Exception {
            java.io.File r0 = getNativeExtractionDirectory(r6)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libjnidispatch.so"
            r1.<init>(r0, r2)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "JNA dispatch already extracted: "
            r6.<init>(r7)
            java.lang.String r7 = r1.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "VanillaInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
        L2a:
            java.lang.String r0 = "libraries"
            org.json.JSONArray r7 = r7.optJSONArray(r0)
            if (r7 != 0) goto L33
            return
        L33:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L3e:
            int r3 = r7.length()
            if (r2 >= r3) goto L6f
            org.json.JSONObject r3 = r7.optJSONObject(r2)
            if (r3 != 0) goto L4b
            goto L6c
        L4b:
            java.lang.String r4 = "name"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)
            java.lang.String r5 = "net.java.dev.jna:jna:"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L5c
            goto L6c
        L5c:
            java.lang.String r5 = "rules"
            org.json.JSONArray r3 = r3.optJSONArray(r5)
            boolean r3 = isAllowedByRules(r3)
            if (r3 != 0) goto L69
            goto L6c
        L69:
            scheduleNativeAarDownload(r0, r1, r4)
        L6c:
            int r2 = r2 + 1
            goto L3e
        L6f:
            java.util.Iterator r7 = r0.iterator()
        L73:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r7.next()
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry r0 = (ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry) r0
            downloadFileIfNeeded(r0)
            goto L73
        L83:
            r7 = 0
            extractNativeAars(r1, r6, r7)
            return
    }

    private static void extractNativeAars(java.util.List<java.io.File> r7, java.lang.String r8, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r9) throws java.lang.Exception {
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r8 = getNativeExtractionDirectory(r8)
            ensureDirectory(r8)
            ca.dnamobile.javalauncher.ui.version.NativesExtractor r0 = new ca.dnamobile.javalauncher.ui.version.NativesExtractor
            r0.<init>(r8)
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
        L18:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r1.next()
            java.io.File r3 = (java.io.File) r3
            int r2 = r2 + 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Extracting native libraries ("
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = "/"
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r7.size()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "): "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 95
            notifyProgress(r9, r5, r4)
            boolean r4 = r3.isFile()
            java.lang.String r5 = "VanillaInstaller"
            if (r4 != 0) goto L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Skipping missing native AAR: "
            r4.<init>(r6)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r3)
            goto L18
        L75:
            r0.extractFromAar(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Extracted native AAR: "
            r4.<init>(r6)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = " -> "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r8.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r3)
            goto L18
        L9e:
            return
    }

    public static java.util.Set<java.lang.String> findInstalledVersionIds() {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r1 = findInstalledVersions()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r2 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r2
            java.lang.String r2 = r2.getId()
            r0.add(r2)
            goto Ld
        L21:
            return r0
    }

    public static java.util.List<ca.dnamobile.javalauncher.data.model.MinecraftVersion> findInstalledVersions() {
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            if (r0 == 0) goto L19
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            boolean r0 = ca.dnamobile.javalauncher.MainActivity$$ExternalSyntheticBackport0.m(r0)
            if (r0 == 0) goto Ld
            goto L19
        Ld:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.<init>(r1)
            java.util.List r0 = findInstalledVersions(r0)
            return r0
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public static java.util.List<ca.dnamobile.javalauncher.data.model.MinecraftVersion> findInstalledVersions(java.io.File r9) {
            java.lang.String r0 = ""
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.File r9 = getVersionsDirectory(r9)
            java.io.File[] r9 = r9.listFiles()
            if (r9 != 0) goto L12
            return r1
        L12:
            int r2 = r9.length
            r3 = 0
        L14:
            if (r3 >= r2) goto L9c
            r4 = r9[r3]
            boolean r5 = r4.isDirectory()
            if (r5 != 0) goto L20
            goto L98
        L20:
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r4.getName()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = ".json"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r4, r6)
            boolean r6 = r5.isFile()
            if (r6 != 0) goto L43
            goto L98
        L43:
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "installed"
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = readString(r5)     // Catch: java.lang.Throwable -> L6c
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L6c
            boolean r5 = hasLaunchableClientJar(r4, r7)     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L59
            goto L98
        L59:
            java.lang.String r5 = "type"
            java.lang.String r6 = r7.optString(r5, r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "releaseTime"
            java.lang.String r8 = "time"
            java.lang.String r8 = r7.optString(r8, r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = r7.optString(r5, r8)     // Catch: java.lang.Throwable -> L6c
            goto L90
        L6c:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to read installed version metadata for "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "VanillaInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r5)
            r5 = r0
        L90:
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r7 = new ca.dnamobile.javalauncher.data.model.MinecraftVersion
            r7.<init>(r4, r6, r5, r0)
            r1.add(r7)
        L98:
            int r3 = r3 + 1
            goto L14
        L9c:
            return r1
    }

    private static java.io.File getAssetIndexFile(java.lang.String r4) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getAssetsDirectory()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "indexes"
            r2.<init>(r3)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.<init>(r1, r4)
            return r0
    }

    public static java.io.File getAssetsDirectory() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "assets"
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getLibrariesDirectory() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "libraries"
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getLibrariesDirectory(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libraries"
            r0.<init>(r2, r1)
            return r0
    }

    public static java.io.File getNativeExtractionDirectory(java.lang.String r4) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "natives"
            r2.<init>(r3)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r1, r4)
            return r0
    }

    public static java.io.File getVersionDirectory(java.io.File r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getVersionsDirectory(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getVersionDirectory(java.lang.String r2) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getVersionsDirectory()
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getVersionsDirectory() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.<init>(r1)
            java.io.File r0 = getVersionsDirectory(r0)
            return r0
    }

    public static java.io.File getVersionsDirectory(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "versions"
            r0.<init>(r2, r1)
            return r0
    }

    private static boolean hasLaunchableClientJar(java.lang.String r3, org.json.JSONObject r4) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getVersionDirectory(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = ".jar"
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.<init>(r1, r3)
            boolean r3 = r0.isFile()
            if (r3 == 0) goto L24
            r3 = 1
            return r3
        L24:
            java.lang.String r3 = "inheritsFrom"
            java.lang.String r0 = ""
            java.lang.String r3 = r4.optString(r3, r0)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L51
            java.io.File r4 = new java.io.File
            java.io.File r0 = getVersionDirectory(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4.<init>(r0, r3)
            boolean r3 = r4.isFile()
            return r3
        L51:
            r3 = 0
            return r3
    }

    private static java.lang.String installAssetIndexAndBuildAssetDownloads(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r12, org.json.JSONObject r13, int r14, int r15) throws java.lang.Exception {
            java.lang.String r0 = "assetIndex"
            org.json.JSONObject r0 = r13.optJSONObject(r0)
            java.lang.String r1 = "assets"
            java.lang.String r2 = "legacy"
            java.lang.String r13 = r13.optString(r1, r2)
            if (r0 != 0) goto L16
            java.lang.String r14 = "No asset index listed for this version."
            notifyProgress(r12, r15, r14)
            return r13
        L16:
            java.lang.String r1 = "id"
            java.lang.String r13 = r0.optString(r1, r13)
            java.lang.String r1 = "url"
            java.lang.String r2 = ""
            java.lang.String r5 = r0.optString(r1, r2)
            java.lang.String r1 = "sha1"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L37
            java.lang.String r14 = "No asset index URL listed for this version."
            notifyProgress(r12, r15, r14)
            return r13
        L37:
            java.io.File r4 = getAssetIndexFile(r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Downloading asset index "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r13)
            java.lang.String r3 = "..."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            notifyProgress(r12, r14, r2)
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry r14 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry
            java.lang.String r6 = emptyToNull(r1)
            java.lang.String r1 = "size"
            r2 = 0
            long r7 = r0.optLong(r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "asset index "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r9 = r0.toString()
            r10 = 0
            r11 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r9, r10, r11)
            downloadFileIfNeeded(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Asset index "
            r14.<init>(r0)
            java.lang.StringBuilder r14 = r14.append(r13)
            java.lang.String r0 = " is ready."
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r14 = r14.toString()
            notifyProgress(r12, r15, r14)
            return r13
    }

    public static void installVanillaVersion(android.content.Context r9, ca.dnamobile.javalauncher.data.model.MinecraftVersion r10, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r11) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Preparing "
            r9.<init>(r0)
            java.lang.String r0 = r10.getId()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r0 = "..."
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r0 = 0
            notifyProgress(r11, r0, r9)
            java.lang.String r9 = r10.getId()
            java.io.File r9 = getVersionDirectory(r9)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.getId()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r9, r1)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.getId()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".jar"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r9, r2)
            ensureDirectory(r9)
            java.lang.String r9 = r10.getMetadataUrl()
            java.lang.String r9 = downloadText(r9)
            writeString(r0, r9)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r9)
            r9 = 5
            r2 = 12
            java.lang.String r9 = installAssetIndexAndBuildAssetDownloads(r11, r0, r9, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            collectClientJar(r3, r0, r1)
            collectLibraries(r3, r4, r0)
            int r5 = r3.size()
            java.io.File r6 = getAssetIndexFile(r9)
            collectAssets(r3, r6)
            java.util.ArrayList r3 = deduplicateDownloadEntries(r3)
            r6 = 1
            int r7 = r3.size()
            int r6 = java.lang.Math.max(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Downloading "
            r7.<init>(r8)
            int r8 = r3.size()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " Minecraft files..."
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            notifyProgress(r11, r2, r7)
            int r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.MAX_PARALLEL_DOWNLOADS
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$$ExternalSyntheticLambda0 r7 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$$ExternalSyntheticLambda0
            r7.<init>()
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$$ExternalSyntheticLambda1 r8 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$$ExternalSyntheticLambda1
            r8.<init>(r6, r5, r11)
            ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.run(r3, r2, r7, r8)
            java.lang.String r2 = r10.getId()
            extractNativeAars(r4, r2, r11)
            int r2 = r3.size()
            writeInstallMarker(r10, r0, r9, r2, r1)
            writeLaunchPlan(r10, r0, r9, r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Vanilla "
            r9.<init>(r0)
            java.lang.String r10 = r10.getId()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " installed."
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r10 = 100
            notifyProgress(r11, r10, r9)
            return
    }

    public static void installVersionMetadata(android.content.Context r1, ca.dnamobile.javalauncher.data.model.MinecraftVersion r2) throws java.lang.Exception {
            r0 = 0
            installVanillaVersion(r1, r2, r0)
            return
    }

    private static boolean isAllowedByRules(org.json.JSONArray r6) {
            if (r6 == 0) goto L47
            int r0 = r6.length()
            if (r0 != 0) goto L9
            goto L47
        L9:
            r0 = 0
            r1 = r0
        Lb:
            int r2 = r6.length()
            if (r0 >= r2) goto L46
            org.json.JSONObject r2 = r6.optJSONObject(r0)
            if (r2 != 0) goto L18
            goto L43
        L18:
            java.lang.String r3 = "os"
            org.json.JSONObject r3 = r2.optJSONObject(r3)
            if (r3 == 0) goto L37
            java.lang.String r4 = "name"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.optString(r4, r5)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L37
            java.lang.String r4 = "linux"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L37
            goto L43
        L37:
            java.lang.String r1 = "action"
            java.lang.String r3 = "allow"
            java.lang.String r1 = r2.optString(r1, r3)
            boolean r1 = r3.equals(r1)
        L43:
            int r0 = r0 + 1
            goto Lb
        L46:
            return r1
        L47:
            r6 = 1
            return r6
    }

    static /* synthetic */ void lambda$installVanillaVersion$0(int r4, int r5, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r6, int r7, int r8, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry r9) {
            long r0 = (long) r7
            r2 = 83
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 / r2
            int r8 = (int) r0
            int r8 = r8 + 12
            if (r7 > r5) goto Le
            java.lang.String r5 = "Downloading game files"
            goto L10
        Le:
            java.lang.String r5 = "Downloading assets"
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = " ("
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r7 = "/"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "): "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r9.displayName
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            notifyProgress(r6, r8, r4)
            return
    }

    private static void notifyProgress(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r1, int r2, java.lang.String r3) {
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

    private static void scheduleNativeAarDownload(java.util.List<ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.DownloadEntry> r10, java.util.List<java.io.File> r11, java.lang.String r12) throws java.lang.Exception {
            java.lang.String r0 = ".aar"
            java.lang.String r12 = artifactPathFromNameWithExtension(r12, r0)
            if (r12 == 0) goto L42
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto Lf
            goto L42
        Lf:
            java.io.File r2 = new java.io.File
            java.io.File r0 = getLibrariesDirectory()
            r2.<init>(r0, r12)
            boolean r0 = r11.contains(r2)
            if (r0 != 0) goto L21
            r11.add(r2)
        L21:
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry r11 = new ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller$DownloadEntry
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://repo1.maven.org/maven2/"
            r0.<init>(r1)
            java.lang.StringBuilder r12 = r0.append(r12)
            java.lang.String r3 = r12.toString()
            java.lang.String r7 = r2.getName()
            r8 = 1
            r9 = 0
            r4 = 0
            r5 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            r10.add(r11)
        L42:
            return
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

    private static java.lang.String stripJsonExtension(java.lang.String r2) {
            java.lang.String r0 = ".json"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L13
            int r0 = r2.length()
            int r0 = r0 + (-5)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L13:
            return r2
    }

    private static void writeInstallMarker(ca.dnamobile.javalauncher.data.model.MinecraftVersion r3, org.json.JSONObject r4, java.lang.String r5, int r6, java.io.File r7) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r3.getId()
            r0.put(r1, r2)
            java.lang.String r1 = "type"
            java.lang.String r2 = r3.getType()
            r0.put(r1, r2)
            java.lang.String r1 = "releaseTime"
            java.lang.String r2 = r3.getReleaseTime()
            r0.put(r1, r2)
            java.lang.String r1 = "metadataUrl"
            java.lang.String r2 = r3.getMetadataUrl()
            r0.put(r1, r2)
            java.lang.String r1 = "installStage"
            java.lang.String r2 = "vanilla_full"
            r0.put(r1, r2)
            java.lang.String r1 = "downloadCount"
            r0.put(r1, r6)
            java.lang.String r6 = r3.getId()
            java.io.File r6 = getVersionDirectory(r6)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r1 = "versionDir"
            r0.put(r1, r6)
            java.lang.String r6 = "clientJar"
            java.lang.String r7 = r7.getAbsolutePath()
            r0.put(r6, r7)
            java.io.File r6 = getLibrariesDirectory()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r7 = "librariesDir"
            r0.put(r7, r6)
            java.io.File r6 = getAssetsDirectory()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r7 = "assetsDir"
            r0.put(r7, r6)
            java.lang.String r6 = "assetIndex"
            r0.put(r6, r5)
            java.lang.String r5 = ""
            java.lang.String r6 = "mainClass"
            java.lang.String r4 = r4.optString(r6, r5)
            r0.put(r6, r4)
            java.lang.String r4 = "note"
            java.lang.String r5 = "Vanilla files are installed. Next step is wiring launch arguments/JVM startup."
            r0.put(r4, r5)
            java.io.File r4 = new java.io.File
            java.lang.String r3 = r3.getId()
            java.io.File r3 = getVersionDirectory(r3)
            java.lang.String r5 = "java_launcher_install_marker.json"
            r4.<init>(r3, r5)
            r3 = 2
            java.lang.String r3 = r0.toString(r3)
            writeString(r4, r3)
            return
    }

    private static void writeLaunchPlan(ca.dnamobile.javalauncher.data.model.MinecraftVersion r4, org.json.JSONObject r5, java.lang.String r6, java.io.File r7) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r4.getId()
            r0.put(r1, r2)
            java.lang.String r1 = "type"
            java.lang.String r2 = r4.getType()
            r0.put(r1, r2)
            java.lang.String r1 = ""
            java.lang.String r2 = "mainClass"
            java.lang.String r5 = r5.optString(r2, r1)
            r0.put(r2, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r1 = r4.getId()
            java.io.File r1 = getVersionDirectory(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.getId()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.<init>(r1, r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r1 = "versionJson"
            r0.put(r1, r5)
            java.lang.String r5 = "clientJar"
            java.lang.String r7 = r7.getAbsolutePath()
            r0.put(r5, r7)
            java.lang.String r5 = r4.getId()
            java.io.File r5 = getVersionDirectory(r5)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r7 = "versionDir"
            r0.put(r7, r5)
            java.io.File r5 = getLibrariesDirectory()
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r7 = "librariesDir"
            r0.put(r7, r5)
            java.io.File r5 = getAssetsDirectory()
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r7 = "assetsDir"
            r0.put(r7, r5)
            java.lang.String r5 = "assetIndex"
            r0.put(r5, r6)
            java.lang.String r5 = "gameDirectory"
            java.lang.String r6 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.put(r5, r6)
            java.lang.String r5 = "javaLauncherStage"
            java.lang.String r6 = "vanilla_files_ready"
            r0.put(r5, r6)
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r4.getId()
            java.io.File r4 = getVersionDirectory(r4)
            java.lang.String r6 = "java_launcher_launch_plan.json"
            r5.<init>(r4, r6)
            r4 = 2
            java.lang.String r4 = r0.toString(r4)
            writeString(r5, r4)
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
