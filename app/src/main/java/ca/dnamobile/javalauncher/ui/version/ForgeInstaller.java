package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class ForgeInstaller {
    private static final int BUFFER_SIZE = 65536;
    private static final java.lang.String FORGE_INSTALLER_URL = "https://maven.minecraftforge.net/net/minecraftforge/forge/%1$s/forge-%1$s-installer.jar";
    private static final java.lang.String FORGE_METADATA_URL = "https://maven.minecraftforge.net/net/minecraftforge/forge/maven-metadata.xml";
    private static final int MAX_PARALLEL_DOWNLOADS = 4;
    private static final java.lang.String TAG = "ForgeInstaller";

    public static final class InstallResult {
        private final java.lang.String forgeVersionId;
        private final java.lang.String fullForgeVersion;
        private final java.lang.String loaderVersion;
        private final java.lang.String minecraftVersionId;

        private InstallResult(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.minecraftVersionId = r1
                r0.loaderVersion = r2
                r0.fullForgeVersion = r3
                r0.forgeVersionId = r4
                return
        }

        /* synthetic */ InstallResult(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, ca.dnamobile.javalauncher.ui.version.ForgeInstaller.InstallResultIA r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public java.lang.String getForgeVersionId() {
                r1 = this;
                java.lang.String r0 = r1.forgeVersionId
                return r0
        }

        public java.lang.String getFullForgeVersion() {
                r1 = this;
                java.lang.String r0 = r1.fullForgeVersion
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

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class InstallResultIA {
    }

    private static final class LibraryDownload {
        final java.lang.String displayName;
        final java.lang.String libraryName;
        final java.lang.String sha1;
        final java.io.File targetFile;
        final java.util.ArrayList<java.lang.String> urls;

        private LibraryDownload(java.io.File r1, java.lang.String r2, java.util.ArrayList<java.lang.String> r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.targetFile = r1
                r0.sha1 = r2
                r0.urls = r3
                r0.displayName = r4
                r0.libraryName = r5
                return
        }

        /* synthetic */ LibraryDownload(java.io.File r1, java.lang.String r2, java.util.ArrayList r3, java.lang.String r4, java.lang.String r5, ca.dnamobile.javalauncher.ui.version.ForgeInstaller.LibraryDownloadIA r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.ForgeInstaller$LibraryDownload-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class LibraryDownloadIA {
    }

    public static /* synthetic */ void $r8$lambda$nw_GfdVw9_pZJgs6tQ5bFuVkM_E(ca.dnamobile.javalauncher.ui.version.ForgeInstaller.LibraryDownload r0) {
            downloadLibraryWithFallbacks(r0)
            return
    }

    private ForgeInstaller() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addUrlIfMissing(java.util.ArrayList<java.lang.String> r1, java.lang.String r2) {
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L9
            r1.add(r2)
        L9:
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

    private static java.lang.String canonicalPathKey(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private static void cleanupForgeGeneratedOutputs(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            java.lang.String r2 = "net/minecraft/client"
            r0.<init>(r1, r2)
            java.io.File[] r0 = r0.listFiles()
            java.lang.String r1 = "ForgeInstaller"
            if (r0 == 0) goto L52
            int r2 = r0.length
            r3 = 0
        L15:
            if (r3 >= r2) goto L52
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r7 = "-"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Deleting stale Forge generated client output: "
            r5.<init>(r6)
            java.lang.String r6 = r4.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
            deleteRecursively(r4)
        L4f:
            int r3 = r3 + 1
            goto L15
        L52:
            java.io.File r8 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r9)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L75
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Deleting stale Forge version dir: "
            r9.<init>(r0)
            java.lang.String r0 = r8.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r9)
            deleteRecursively(r8)
        L75:
            java.io.File r8 = new java.io.File
            java.io.File r9 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "net/minecraftforge/forge/"
            r0.<init>(r1)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r10 = r10.toString()
            r8.<init>(r9, r10)
            boolean r9 = r8.isDirectory()
            if (r9 == 0) goto L9f
            java.io.File[] r9 = r8.listFiles()
            if (r9 == 0) goto L9f
            int r9 = r9.length
            if (r9 != 0) goto L9f
            deleteRecursively(r8)
        L9f:
            return
    }

    private static void cloneInstalledVersionProfileIfNeeded(java.lang.String r6, java.lang.String r7) throws java.lang.Exception {
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r6)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto Ld7
            java.io.File r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r7)
            ensureDirectory(r2)
            org.json.JSONObject r4 = new org.json.JSONObject
            java.lang.String r1 = readString(r1)
            r4.<init>(r1)
            java.lang.String r1 = "id"
            r4.put(r1, r7)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r3 = 2
            java.lang.String r3 = r4.toString(r3)
            writeString(r1, r3)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = ".jar"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r0, r3)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto Lb8
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lae
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r5.<init>()     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lae
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lae
            copy(r0, r1)     // Catch: java.lang.Throwable -> La4
            r1.close()     // Catch: java.lang.Throwable -> Lae
            r0.close()
            goto Lb8
        La4:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> La9
            goto Lad
        La9:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> Lae
        Lad:
            throw r6     // Catch: java.lang.Throwable -> Lae
        Lae:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r7 = move-exception
            r6.addSuppressed(r7)
        Lb7:
            throw r6
        Lb8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cloned reusable Forge profile "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " -> "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
        Ld7:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Reusable Forge profile JSON is missing: "
            r7.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private static int compareForgeBuilds(java.lang.String r7, java.lang.String r8) {
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

    private static void copy(java.io.InputStream r3, java.io.OutputStream r4) throws java.lang.Exception {
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L10
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    private static java.lang.String createUniqueForgeVersionId(java.lang.String r3, java.lang.String r4) {
            java.lang.String r3 = sanitizeVersionId(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " Forge"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = sanitizeVersionId(r3)
        L21:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "forge-"
            r3.<init>(r4)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L3a:
            java.io.File r4 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r3)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L4a
            return r3
        L4a:
            r0 = 2
        L4b:
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = "-"
            if (r0 >= r1) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r1)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L72
            return r1
        L72:
            int r0 = r0 + 1
            goto L4b
        L75:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static void deleteRecursively(java.io.File r4) {
            boolean r0 = r4.exists()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L1f
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L1f
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            deleteRecursively(r3)
            int r2 = r2 + 1
            goto L15
        L1f:
            boolean r0 = r4.delete()
            if (r0 != 0) goto L43
            boolean r0 = r4.exists()
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to delete: "
            r0.<init>(r1)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)
        L43:
            return
    }

    private static void downloadFileIfNeeded(java.io.File r5, java.lang.String r6, java.lang.String r7) throws java.lang.Exception {
            java.lang.String r0 = "Unable to replace "
            java.lang.String r1 = "SHA-1 mismatch for "
            boolean r2 = r5.isFile()
            if (r2 == 0) goto L31
            if (r7 == 0) goto L30
            java.lang.String r2 = sha1(r5)
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L17
            goto L30
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Existing Forge file hash mismatch, redownloading: "
            r2.<init>(r3)
            java.lang.String r3 = r5.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            goto L31
        L30:
            return
        L31:
            java.io.File r2 = r5.getParentFile()
            if (r2 == 0) goto L3a
            ensureDirectory(r2)
        L3a:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ".part"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            downloadToFile(r6, r2)     // Catch: java.lang.Exception -> Ld3
            if (r7 == 0) goto L7d
            java.lang.String r6 = sha1(r2)     // Catch: java.lang.Exception -> Ld3
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch: java.lang.Exception -> Ld3
            if (r6 == 0) goto L66
            goto L7d
        L66:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Ld3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r7.<init>(r1)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> Ld3
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Ld3
            r6.<init>(r5)     // Catch: java.lang.Exception -> Ld3
            throw r6     // Catch: java.lang.Exception -> Ld3
        L7d:
            boolean r6 = r5.exists()     // Catch: java.lang.Exception -> Ld3
            if (r6 == 0) goto La1
            boolean r6 = r5.delete()     // Catch: java.lang.Exception -> Ld3
            if (r6 == 0) goto L8a
            goto La1
        L8a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Ld3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r7.<init>(r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> Ld3
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Ld3
            r6.<init>(r5)     // Catch: java.lang.Exception -> Ld3
            throw r6     // Catch: java.lang.Exception -> Ld3
        La1:
            boolean r6 = r2.renameTo(r5)     // Catch: java.lang.Exception -> Ld3
            if (r6 != 0) goto Ld2
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Ld3
            r6.<init>(r2)     // Catch: java.lang.Exception -> Ld3
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc8
            r7.<init>(r5)     // Catch: java.lang.Throwable -> Lc8
            copy(r6, r7)     // Catch: java.lang.Throwable -> Lbe
            r7.close()     // Catch: java.lang.Throwable -> Lc8
            r6.close()     // Catch: java.lang.Exception -> Ld3
            r2.delete()     // Catch: java.lang.Exception -> Ld3
            goto Ld2
        Lbe:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc3:
            r7 = move-exception
            r5.addSuppressed(r7)     // Catch: java.lang.Throwable -> Lc8
        Lc7:
            throw r5     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            r5 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> Lcd
            goto Ld1
        Lcd:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Exception -> Ld3
        Ld1:
            throw r5     // Catch: java.lang.Exception -> Ld3
        Ld2:
            return
        Ld3:
            r5 = move-exception
            r2.delete()
            throw r5
    }

    private static java.util.ArrayList<java.lang.String> downloadForgeVersions() throws java.lang.Exception {
            java.lang.String r0 = "https://maven.minecraftforge.net/net/minecraftforge/forge/maven-metadata.xml"
            java.lang.String r0 = downloadText(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "<version>([^<]+)</version>"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r0 = r2.matcher(r0)
        L15:
            boolean r2 = r0.find()
            if (r2 == 0) goto L34
            r2 = 1
            java.lang.String r2 = r0.group(r2)
            if (r2 == 0) goto L15
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L15
            java.lang.String r2 = r2.trim()
            r1.add(r2)
            goto L15
        L34:
            return r1
    }

    private static void downloadLibraryWithFallbacks(ca.dnamobile.javalauncher.ui.version.ForgeInstaller.LibraryDownload r5) throws java.lang.Exception {
            java.util.ArrayList<java.lang.String> r0 = r5.urls
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = r5.targetFile     // Catch: java.lang.Exception -> L1b
            java.lang.String r3 = r5.sha1     // Catch: java.lang.Exception -> L1b
            downloadFileIfNeeded(r2, r1, r3)     // Catch: java.lang.Exception -> L1b
            return
        L1b:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Forge library download failed from "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r1)
            r1 = r2
            goto L7
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to download Forge library "
            r2.<init>(r3)
            java.lang.String r5 = r5.libraryName
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5, r1)
            throw r0
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
            if (r1 < r2) goto L43
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L43
            java.io.InputStream r4 = r0.getInputStream()     // Catch: java.lang.Throwable -> L3e
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L32
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L32
            copy(r4, r1)     // Catch: java.lang.Throwable -> L28
            r1.close()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L24
            r4.close()     // Catch: java.lang.Throwable -> L3e
        L24:
            r0.disconnect()
            return
        L28:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Throwable -> L32
        L31:
            throw r5     // Catch: java.lang.Throwable -> L32
        L32:
            r5 = move-exception
            if (r4 == 0) goto L3d
            r4.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L3e
        L3d:
            throw r5     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            r0.disconnect()
            throw r4
        L43:
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

    private static void ensureActivePathManager(android.content.Context r1) {
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            if (r0 == 0) goto L10
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
        L10:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
        L13:
            return
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

    private static void ensureForgeVersionLibrariesDownloaded(java.lang.String r13, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r14) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r13 = r2.append(r13)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r13 = r13.append(r2)
            java.lang.String r13 = r13.toString()
            r0.<init>(r1, r13)
            boolean r13 = r0.isFile()
            if (r13 == 0) goto L11e
            org.json.JSONObject r13 = new org.json.JSONObject
            java.lang.String r0 = readString(r0)
            r13.<init>(r0)
            java.lang.String r0 = "libraries"
            org.json.JSONArray r13 = r13.optJSONArray(r0)
            if (r13 == 0) goto L11d
            int r0 = r13.length()
            if (r0 != 0) goto L3b
            goto L11d
        L3b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 0
        L46:
            int r3 = r13.length()
            if (r2 >= r3) goto Le1
            org.json.JSONObject r3 = r13.optJSONObject(r2)
            if (r3 != 0) goto L54
            goto Ldd
        L54:
            java.lang.String r4 = resolveLibraryArtifactPath(r3)
            if (r4 == 0) goto Ldd
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L62
            goto Ldd
        L62:
            java.io.File r7 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            r7.<init>(r5, r4)
            java.lang.String r8 = resolveLibrarySha1(r3)
            boolean r5 = r7.isFile()
            java.lang.String r6 = "ForgeInstaller"
            if (r5 == 0) goto L9a
            if (r8 == 0) goto Ldd
            java.lang.String r5 = sha1(r7)
            boolean r5 = r5.equalsIgnoreCase(r8)
            if (r5 == 0) goto L84
            goto Ldd
        L84:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Forge library hash mismatch, redownloading: "
            r5.<init>(r9)
            java.lang.String r9 = r7.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
        L9a:
            java.util.ArrayList r9 = resolveLibraryDownloadUrls(r3, r4)
            boolean r5 = r9.isEmpty()
            java.lang.String r10 = "name"
            if (r5 == 0) goto Lbf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "No download URL known for Forge library: "
            r4.<init>(r5)
            java.lang.String r5 = ""
            java.lang.String r3 = r3.optString(r10, r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r3)
            goto Ldd
        Lbf:
            java.lang.String r5 = canonicalPathKey(r7)
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto Ldd
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$LibraryDownload r5 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$LibraryDownload
            java.lang.String r11 = r7.getName()
            java.lang.String r3 = r3.optString(r10, r4)
            r12 = 0
            r6 = r5
            r10 = r11
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.add(r5)
        Ldd:
            int r2 = r2 + 1
            goto L46
        Le1:
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto Le8
            return
        Le8:
            int r13 = r0.size()
            r1 = 1
            int r13 = java.lang.Math.max(r1, r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Downloading "
            r1.<init>(r2)
            int r2 = r0.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " Forge libraries..."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 90
            notify(r14, r2, r1)
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda0
            r1.<init>()
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda1
            r2.<init>(r13, r14)
            r13 = 4
            ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.run(r0, r13, r1, r2)
        L11d:
            return
        L11e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing installed Forge version JSON: "
            r14.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    private static void ensureVanillaBaseIsValid(android.content.Context r7, ca.dnamobile.javalauncher.data.model.MinecraftVersion r8, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r9) throws java.lang.Exception {
            java.lang.String r0 = r8.getId()
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r0)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = ".json"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = ".jar"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r1, r5)
            boolean r5 = r2.isFile()
            if (r5 == 0) goto L4b
            boolean r5 = r3.isFile()
            if (r5 == 0) goto L4b
            boolean r2 = isVanillaClientJarValid(r2, r3)
            if (r2 == 0) goto L4b
            goto Lb1
        L4b:
            boolean r2 = r1.exists()
            if (r2 == 0) goto L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Reinstalling clean vanilla "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " for Forge..."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 10
            notify(r9, r3, r2)
            deleteRecursively(r1)
        L6e:
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.installVanillaVersion(r7, r8, r9)
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r4)
            java.lang.String r8 = r8.toString()
            r7.<init>(r1, r8)
            java.io.File r8 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r6)
            java.lang.String r9 = r9.toString()
            r8.<init>(r1, r9)
            boolean r9 = r7.isFile()
            java.lang.String r1 = "Vanilla "
            if (r9 == 0) goto Ld3
            boolean r9 = r8.isFile()
            if (r9 == 0) goto Ld3
            boolean r7 = isVanillaClientJarValid(r7, r8)
            if (r7 == 0) goto Lb2
        Lb1:
            return
        Lb2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r0 = " client jar hash is still invalid after reinstall: "
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Ld3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r9 = " did not install correctly."
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private static java.util.zip.ZipEntry findLegacyForgePayload(java.util.zip.ZipFile r3, java.lang.String r4) {
            if (r4 == 0) goto L2f
            r0 = 92
            r1 = 47
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.String r4 = r4.trim()
        Le:
            java.lang.String r0 = "/"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L1c
            r0 = 1
            java.lang.String r4 = r4.substring(r0)
            goto Le
        L1c:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L2f
            java.util.zip.ZipEntry r4 = r3.getEntry(r4)
            if (r4 == 0) goto L2f
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L2f
            return r4
        L2f:
            java.util.Enumeration r3 = r3.entries()
            r4 = 0
        L34:
            boolean r0 = r3.hasMoreElements()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r3.nextElement()
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0
            if (r0 == 0) goto L34
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L49
            goto L34
        L49:
            java.lang.String r1 = r0.getName()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = ".jar"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L34
            java.lang.String r2 = "meta-inf/"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L64
            goto L34
        L64:
            java.lang.String r2 = "universal"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L79
            java.lang.String r2 = "forge"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L75
            goto L79
        L75:
            if (r4 != 0) goto L34
            r4 = r0
            goto L34
        L79:
            return r0
        L7a:
            return r4
    }

    private static java.lang.String findReusableForgeVersionId(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = "-forge-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = "-forge"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r0.add(r5)
            r0.add(r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "forge-"
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r0.add(r5)
            java.util.Iterator r5 = r0.iterator()
        L6d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L80
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = isForgeCoordinateVersion(r6, r7)
            if (r0 == 0) goto L6d
            return r6
        L80:
            java.io.File r5 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()
            java.io.File[] r5 = r5.listFiles()
            r6 = 0
            if (r5 != 0) goto L8c
            return r6
        L8c:
            int r0 = r5.length
            r1 = 0
        L8e:
            if (r1 >= r0) goto Lb0
            r2 = r5[r1]
            if (r2 == 0) goto Lad
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L9b
            goto Lad
        L9b:
            java.lang.String r2 = r2.getName()
            boolean r3 = r4.equals(r2)
            if (r3 == 0) goto La6
            goto Lad
        La6:
            boolean r3 = isForgeCoordinateVersion(r2, r7)
            if (r3 == 0) goto Lad
            return r2
        Lad:
            int r1 = r1 + 1
            goto L8e
        Lb0:
            return r6
    }

    private static void flattenInheritedProfileIfEnabled(android.content.Context r2, java.lang.String r3, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r4) throws java.lang.Exception {
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isRemoveInheritedVanillaAfterLoaderInstall(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 96
            java.lang.String r1 = "Flattening loader profile..."
            notify(r4, r0, r1)
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult r0 = ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.flattenInstalledVersionProfile(r2, r3)
            boolean r0 = r0.flattened
            if (r0 != 0) goto L17
            return
        L17:
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r2 = ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.deleteFlattenedParentVersionIfSafe(r2, r3)
            java.lang.String r3 = "ForgeInstaller"
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
            r3 = 98
            notify(r4, r3, r2)
        L40:
            return
    }

    private static void generateLauncherProfiles() throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "launcher_profiles.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L10
            return
        L10:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "lastVersionId"
            java.lang.String r5 = "latest-release"
            r3.put(r4, r5)
            java.lang.String r4 = "default"
            r2.put(r4, r3)
            java.lang.String r3 = "profiles"
            r1.put(r3, r2)
            java.lang.String r2 = "selectedProfile"
            r1.put(r2, r4)
            java.lang.String r1 = r1.toString()
            writeString(r0, r1)
            return
    }

    private static java.lang.String getInstallerUrl(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = "https://maven.minecraftforge.net/net/minecraftforge/forge/%1$s/forge-%1$s-installer.jar"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r0, r1, r2)
            return r2
    }

    public static java.lang.String inferLoaderNameFromVersionId(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "forge"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L11
            java.lang.String r1 = "Forge"
            return r1
        L11:
            java.lang.String r1 = "Vanilla"
            return r1
    }

    public static ca.dnamobile.javalauncher.ui.version.ForgeInstaller.InstallResult installForgeVersion(android.content.Context r20, ca.dnamobile.javalauncher.data.model.MinecraftVersion r21, java.lang.String r22, java.lang.String r23, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r24) throws java.lang.Exception {
            r8 = r20
            r9 = r24
            ensureActivePathManager(r20)
            java.lang.String r10 = r21.getId()
            r0 = r21
            ensureVanillaBaseIsValid(r8, r0, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Resolving Forge for "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 68
            notify(r9, r2, r0)
            r0 = r23
            java.lang.String r11 = resolveFullForgeVersion(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            java.lang.String r12 = r11.substring(r0)
            r0 = r22
            java.lang.String r13 = createUniqueForgeVersionId(r0, r10)
            java.lang.String r0 = findReusableForgeVersionId(r13, r10, r12, r11)
            r2 = 72
            java.lang.String r14 = " installed."
            java.lang.String r15 = "Forge "
            r7 = 100
            if (r0 == 0) goto La0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Reusing existing Forge "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r3 = " profile..."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            notify(r9, r2, r1)
            cloneInstalledVersionProfileIfNeeded(r0, r13)
            ensureForgeVersionLibrariesDownloaded(r13, r9)
            flattenInheritedProfileIfEnabled(r8, r13, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r15)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.StringBuilder r0 = r0.append(r14)
            java.lang.String r0 = r0.toString()
            notify(r9, r7, r0)
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult r6 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult
            r5 = 0
            r0 = r6
            r1 = r10
            r2 = r12
            r3 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        La0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Downloading Forge installer "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            notify(r9, r2, r0)
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "forge-"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r3 = "-installer.jar"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.lang.String r1 = getInstallerUrl(r11)
            r2 = 0
            downloadFileIfNeeded(r0, r1, r2)
            r1 = 76
            java.lang.String r2 = "Preparing Forge installer profile..."
            notify(r9, r1, r2)
            patchForgeInstallerProfile(r0, r13)
            generateLauncherProfiles()
            cleanupForgeGeneratedOutputs(r10, r13, r11)
            boolean r1 = isLegacyForgeInstallProfile(r0)
            r2 = 80
            if (r1 == 0) goto L123
            java.lang.String r1 = "Installing legacy Forge profile directly..."
            notify(r9, r2, r1)
            installLegacyForgeProfile(r0, r13, r11)
            java.lang.String r4 = resolveInstalledForgeVersionId(r13, r10, r12, r11)
            ensureForgeVersionLibrariesDownloaded(r4, r9)
            flattenInheritedProfileIfEnabled(r8, r4, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r15)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.StringBuilder r0 = r0.append(r14)
            java.lang.String r0 = r0.toString()
            notify(r9, r7, r0)
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult r6 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult
            r5 = 0
            r0 = r6
            r1 = r10
            r2 = r12
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L123:
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.FORGE_INSTALLER
            if (r1 == 0) goto L257
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.LibPath.FORGE_INSTALLER
            boolean r1 = r1.isFile()
            if (r1 != 0) goto L131
            goto L257
        L131:
            java.lang.String r1 = "Running Forge installer..."
            notify(r9, r2, r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r1 = "-Djava.awt.headless=true"
            r6.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-Duser.home="
            r1.<init>(r2)
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-Djava.io.tmpdir="
            r1.<init>(r2)
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-javaagent:"
            r1.<init>(r2)
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.LibPath.FORGE_INSTALLER
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r1 = r1.toString()
            r6.add(r1)
            java.lang.String r1 = "-jar"
            r6.add(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            r6.add(r0)
            java.lang.String r0 = "--installClient"
            r6.add(r0)
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r6.add(r0)
            java.io.File r16 = resolveInstallerRuntime(r10, r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "forge-installer-"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r1 = r0.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r3.<init>(r0)
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda2 r5 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda2
            r5.<init>(r9)
            r17 = 81
            r18 = 88
            r0 = r20
            r2 = r16
            r4 = r6
            r19 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            r7 = r19
            int r0 = ca.dnamobile.javalauncher.ui.version.InstallerProcessRunner.launch(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L20f
            r0 = 86
            java.lang.String r1 = "Forge installer failed once. Cleaning generated outputs and retrying..."
            notify(r9, r0, r1)
            cleanupForgeGeneratedOutputs(r10, r13, r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "forge-installer-retry-"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r1 = r0.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r3.<init>(r0)
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda3 r7 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda3
            r7.<init>(r9)
            r5 = 86
            r6 = 89
            r0 = r20
            r2 = r16
            r4 = r17
            int r0 = ca.dnamobile.javalauncher.ui.version.InstallerProcessRunner.launch(r0, r1, r2, r3, r4, r5, r6, r7)
        L20f:
            if (r0 != 0) goto L23c
            java.lang.String r4 = resolveInstalledForgeVersionId(r13, r10, r12, r11)
            ensureForgeVersionLibrariesDownloaded(r4, r9)
            flattenInheritedProfileIfEnabled(r8, r4, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r15)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.StringBuilder r0 = r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1 = 100
            notify(r9, r1, r0)
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult r6 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult
            r5 = 0
            r0 = r6
            r1 = r10
            r2 = r12
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L23c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Forge installer exited with code "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ". Check latestlog.txt for the Forge installer command-line output."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L257:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing Forge installer support component: "
            r1.<init>(r2)
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.LibPath.FORGE_INSTALLER
            if (r2 != 0) goto L267
            java.lang.String r2 = "null"
            goto L26d
        L267:
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.LibPath.FORGE_INSTALLER
            java.lang.String r2 = r2.getAbsolutePath()
        L26d:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static void installLegacyForgeProfile(java.io.File r8, java.lang.String r9, java.lang.String r10) throws java.lang.Exception {
            java.lang.String r0 = "Unable to find legacy Forge payload jar inside "
            org.json.JSONObject r1 = readInstallProfileFromJar(r8)
            java.lang.String r2 = "install"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            java.lang.String r3 = "versionInfo"
            org.json.JSONObject r1 = r1.optJSONObject(r3)
            if (r2 == 0) goto L15b
            if (r1 == 0) goto L15b
            java.lang.String r3 = "id"
            r1.put(r3, r9)
            java.lang.String r3 = "minecraft"
            java.lang.String r4 = ""
            java.lang.String r3 = r2.optString(r3, r4)
            java.lang.String r3 = r3.trim()
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L37
            java.lang.String r3 = "version"
            java.lang.String r3 = r2.optString(r3, r4)
            java.lang.String r3 = r3.trim()
        L37:
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L50
            java.lang.String r5 = "inheritsFrom"
            java.lang.String r6 = r1.optString(r5, r4)
            java.lang.String r6 = r6.trim()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L50
            r1.put(r5, r3)
        L50:
            java.io.File r3 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r9)
            ensureDirectory(r3)
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r7 = ".json"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r3, r6)
            r3 = 2
            java.lang.String r1 = r1.toString(r3)
            writeString(r5, r1)
            java.lang.String r1 = "path"
            java.lang.String r1 = r2.optString(r1, r4)
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = artifactPathFromName(r1)
            if (r1 == 0) goto L91
            java.lang.String r3 = r1.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto La4
        L91:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "net.minecraftforge:forge:"
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = artifactPathFromName(r1)
        La4:
            if (r1 == 0) goto L146
            java.lang.String r3 = r1.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L146
            java.io.File r10 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            r10.<init>(r3, r1)
            java.io.File r1 = r10.getParentFile()
            ensureDirectory(r1)
            java.lang.String r1 = "filePath"
            java.lang.String r1 = r2.optString(r1, r4)
            java.lang.String r1 = r1.trim()
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
            r2.<init>(r8)
            java.util.zip.ZipEntry r1 = findLegacyForgePayload(r2, r1)     // Catch: java.lang.Throwable -> L13c
            if (r1 == 0) goto L125
            java.io.InputStream r8 = r2.getInputStream(r1)     // Catch: java.lang.Throwable -> L13c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L119
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L119
            copy(r8, r0)     // Catch: java.lang.Throwable -> L10f
            r0.close()     // Catch: java.lang.Throwable -> L119
            if (r8 == 0) goto Le9
            r8.close()     // Catch: java.lang.Throwable -> L13c
        Le9:
            r2.close()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Installed legacy Forge profile "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " and payload "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = r10.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r9, r8)
            return
        L10f:
            r9 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L114
            goto L118
        L114:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch: java.lang.Throwable -> L119
        L118:
            throw r9     // Catch: java.lang.Throwable -> L119
        L119:
            r9 = move-exception
            if (r8 == 0) goto L124
            r8.close()     // Catch: java.lang.Throwable -> L120
            goto L124
        L120:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch: java.lang.Throwable -> L13c
        L124:
            throw r9     // Catch: java.lang.Throwable -> L13c
        L125:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13c
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L13c
            java.lang.StringBuilder r8 = r10.append(r8)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L13c
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L13c
            throw r9     // Catch: java.lang.Throwable -> L13c
        L13c:
            r8 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L141
            goto L145
        L141:
            r9 = move-exception
            r8.addSuppressed(r9)
        L145:
            throw r8
        L146:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to resolve legacy Forge artifact path for "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L15b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Legacy Forge installer profile is missing install/versionInfo blocks."
            r8.<init>(r9)
            throw r8
    }

    private static boolean isForgeCoordinateVersion(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "net.minecraftforge:fmlloader:"
            java.lang.String r1 = "net.minecraftforge:forge:"
            r2 = 0
            if (r7 == 0) goto La6
            java.lang.String r3 = r7.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L13
            goto La6
        L13:
            java.io.File r3 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r7)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r6 = ".json"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r3, r5)
            boolean r3 = r4.isFile()
            if (r3 != 0) goto L36
            return r2
        L36:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = readString(r4)     // Catch: java.lang.Throwable -> L83
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = r5.append(r8)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L83
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r0 = r1.append(r8)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L83
            boolean r0 = r4.contains(r0)     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L7e
            boolean r8 = r4.contains(r8)     // Catch: java.lang.Throwable -> L83
            if (r8 == 0) goto L7d
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L83
            java.lang.String r8 = r4.toLowerCase(r8)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = "forge"
            boolean r8 = r8.contains(r0)     // Catch: java.lang.Throwable -> L83
            if (r8 != 0) goto L7e
        L7d:
            return r2
        L7e:
            boolean r7 = isLaunchableVersionProfile(r7, r3)     // Catch: java.lang.Throwable -> L83
            return r7
        L83:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to inspect Forge profile "
            r0.<init>(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r7)
        La6:
            return r2
    }

    private static boolean isInstalledVersion(java.lang.String r3) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.<init>(r1, r3)
            boolean r3 = r0.isFile()
            return r3
    }

    private static boolean isLaunchableVersionProfile(java.lang.String r4, org.json.JSONObject r5) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = ".jar"
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.<init>(r1, r4)
            boolean r4 = r0.isFile()
            r0 = 1
            if (r4 == 0) goto L24
            return r0
        L24:
            java.lang.String r4 = "inheritsFrom"
            java.lang.String r1 = ""
            java.lang.String r4 = r5.optString(r4, r1)
            java.lang.String r4 = r4.trim()
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L55
            java.io.File r5 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r5.<init>(r0, r4)
            boolean r4 = r5.isFile()
            return r4
        L55:
            java.lang.String r4 = "mainClass"
            java.lang.String r4 = r5.optString(r4, r1)
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L72
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "net.minecraftforge"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L72
            goto L73
        L72:
            r0 = 0
        L73:
            return r0
    }

    private static boolean isLegacyForgeInstallProfile(java.io.File r3) {
            r0 = 0
            org.json.JSONObject r3 = readInstallProfileFromJar(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "spec"
            boolean r1 = r3.has(r1)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L1e
            java.lang.String r1 = "install"
            org.json.JSONObject r1 = r3.optJSONObject(r1)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1e
            java.lang.String r1 = "versionInfo"
            org.json.JSONObject r3 = r3.optJSONObject(r1)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L1e
            r0 = 1
        L1e:
            return r0
        L1f:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to inspect Forge installer profile: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
            return r0
    }

    private static boolean isLegacyJava8ForgeVersion(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "\\."
            java.lang.String[] r4 = r4.split(r0)
            r0 = 0
            r1 = 1
            int r2 = r4.length     // Catch: java.lang.NumberFormatException -> L21
            r3 = 2
            if (r2 < r3) goto L21
            java.lang.String r2 = "1"
            r3 = r4[r0]     // Catch: java.lang.NumberFormatException -> L21
            boolean r2 = r2.equals(r3)     // Catch: java.lang.NumberFormatException -> L21
            if (r2 == 0) goto L21
            r4 = r4[r1]     // Catch: java.lang.NumberFormatException -> L21
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L21
            r2 = 16
            if (r4 > r2) goto L21
            return r1
        L21:
            java.lang.String r4 = r5.trim()
            java.lang.String r5 = "36."
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L65
            java.lang.String r5 = "35."
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L65
            java.lang.String r5 = "34."
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L65
            java.lang.String r5 = "33."
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L65
            java.lang.String r5 = "32."
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L65
            java.lang.String r5 = "31."
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L65
            java.lang.String r5 = "30."
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L65
            java.lang.String r5 = "14."
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L66
        L65:
            r0 = r1
        L66:
            return r0
    }

    private static boolean isModernJavaMinecraftVersion(java.lang.String r5) {
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r5.split(r0)
            r0 = 0
            int r1 = r5.length     // Catch: java.lang.NumberFormatException -> L39
            if (r1 != 0) goto Lb
            return r0
        Lb:
            r1 = r5[r0]     // Catch: java.lang.NumberFormatException -> L39
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L39
            r2 = 26
            r3 = 1
            if (r1 < r2) goto L17
            return r3
        L17:
            if (r1 != r3) goto L39
            int r1 = r5.length     // Catch: java.lang.NumberFormatException -> L39
            r2 = 2
            if (r1 >= r2) goto L1e
            goto L39
        L1e:
            r1 = r5[r3]     // Catch: java.lang.NumberFormatException -> L39
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L39
            int r4 = r5.length     // Catch: java.lang.NumberFormatException -> L39
            if (r4 <= r2) goto L2e
            r5 = r5[r2]     // Catch: java.lang.NumberFormatException -> L39
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L39
            goto L2f
        L2e:
            r5 = r0
        L2f:
            r2 = 20
            if (r1 > r2) goto L38
            if (r1 != r2) goto L39
            r1 = 5
            if (r5 < r1) goto L39
        L38:
            r0 = r3
        L39:
            return r0
    }

    private static boolean isVanillaClientJarValid(java.io.File r5, java.io.File r6) {
            java.lang.String r0 = "ForgeInstaller"
            java.lang.String r1 = "Invalid vanilla client jar: "
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = readString(r5)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "downloads"
            org.json.JSONObject r5 = r2.optJSONObject(r5)     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L1c
            java.lang.String r2 = "client"
            org.json.JSONObject r5 = r5.optJSONObject(r2)     // Catch: java.lang.Throwable -> L69
            goto L1d
        L1c:
            r5 = 0
        L1d:
            java.lang.String r2 = ""
            if (r5 == 0) goto L27
            java.lang.String r3 = "sha1"
            java.lang.String r2 = r5.optString(r3, r2)     // Catch: java.lang.Throwable -> L69
        L27:
            if (r2 == 0) goto L67
            java.lang.String r5 = r2.trim()     // Catch: java.lang.Throwable -> L69
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L34
            goto L67
        L34:
            java.lang.String r5 = sha1(r6)     // Catch: java.lang.Throwable -> L69
            boolean r3 = r2.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r6 = r4.append(r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = " expected="
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = " actual="
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> L69
        L66:
            return r3
        L67:
            r5 = 1
            return r5
        L69:
            r5 = move-exception
            java.lang.String r6 = "Unable to validate vanilla client jar for Forge"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r6, r5)
            r5 = 0
            return r5
    }

    private static java.lang.String joinRepoAndPath(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "http://"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://"
            r1.<init>(r2)
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L1f:
            java.lang.String r0 = "/"
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    static /* synthetic */ void lambda$ensureForgeVersionLibrariesDownloaded$2(int r4, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r5, int r6, int r7, ca.dnamobile.javalauncher.ui.version.ForgeInstaller.LibraryDownload r8) {
            long r0 = (long) r6
            r2 = 8
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 / r2
            int r7 = (int) r0
            int r7 = r7 + 90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Downloading Forge libraries ("
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

    static /* synthetic */ void lambda$installForgeVersion$0(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r0, int r1, java.lang.String r2) {
            notify(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$installForgeVersion$1(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r0, int r1, java.lang.String r2) {
            notify(r0, r1, r2)
            return
    }

    static /* synthetic */ int lambda$resolveFullForgeVersion$3(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r0 = r1.length()
            java.lang.String r3 = r3.substring(r0)
            int r1 = r1.length()
            java.lang.String r1 = r2.substring(r1)
            int r1 = compareForgeBuilds(r3, r1)
            return r1
    }

    static /* synthetic */ int lambda$resolveFullForgeVersion$4(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r0 = r1.length()
            java.lang.String r3 = r3.substring(r0)
            int r1 = r1.length()
            java.lang.String r1 = r2.substring(r1)
            int r1 = compareForgeBuilds(r3, r1)
            return r1
    }

    private static java.lang.String normalizeRequestedForgeVersion(java.lang.String r3, java.lang.String r4) {
            java.lang.String r4 = r4.trim()
            r0 = 58
            int r0 = r4.lastIndexOf(r0)
            r1 = 1
            if (r0 < 0) goto L1c
            int r0 = r0 + r1
            int r2 = r4.length()
            if (r0 >= r2) goto L1c
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r4.trim()
        L1c:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r2 = "forge-"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L36
            int r0 = r2.length()
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r4.trim()
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "-"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L50
            return r4
        L50:
            java.lang.String r3 = "^1\\.\\d+(?:\\.\\d+)?-(.+)$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r4)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L68
            java.lang.String r3 = r3.group(r1)
            java.lang.String r4 = r3.trim()
        L68:
            return r4
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

    private static int[] parseBuildParts(java.lang.String r5) {
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "[.-]"
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

    private static void patchForgeInstallerProfile(java.io.File r8, java.lang.String r9) throws java.lang.Exception {
            java.lang.String r0 = "install_profile.json not found in "
            java.io.File r1 = new java.io.File
            java.io.File r2 = r8.getParentFile()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ".tmp"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            java.io.File r2 = new java.io.File
            java.io.File r3 = r8.getParentFile()
            java.lang.String r4 = "install_profile.json"
            r2.<init>(r3, r4)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L36
            r1.delete()
        L36:
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            r3.<init>(r8)
            java.util.zip.ZipEntry r5 = r3.getEntry(r4)     // Catch: java.lang.Throwable -> L17f
            if (r5 == 0) goto L168
            java.io.InputStream r0 = r3.getInputStream(r5)     // Catch: java.lang.Throwable -> L17f
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L15c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L15c
            copy(r0, r5)     // Catch: java.lang.Throwable -> L152
            r5.close()     // Catch: java.lang.Throwable -> L15c
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.lang.Throwable -> L17f
        L55:
            r3.close()
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r3 = readString(r2)
            r0.<init>(r3)
            java.lang.String r3 = "spec"
            boolean r3 = r0.has(r3)
            if (r3 == 0) goto L7d
            java.lang.String r3 = "version"
            boolean r5 = r0.has(r3)
            if (r5 == 0) goto L75
            r0.put(r3, r9)
            goto L8d
        L75:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unable to find Forge install_profile version key."
            r8.<init>(r9)
            throw r8
        L7d:
            java.lang.String r3 = "install"
            org.json.JSONObject r5 = r0.optJSONObject(r3)
            if (r5 == 0) goto L14a
            java.lang.String r6 = "target"
            r5.put(r6, r9)
            r0.put(r3, r5)
        L8d:
            relaxGeneratedClientOutputHashes(r0)
            java.lang.String r9 = r0.toString()
            writeString(r2, r9)
            java.util.zip.ZipFile r9 = new java.util.zip.ZipFile
            r9.<init>(r8)
            java.util.zip.ZipOutputStream r0 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L140
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L140
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L140
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L140
            java.util.Enumeration r3 = r9.entries()     // Catch: java.lang.Throwable -> L136
        Laa:
            boolean r5 = r3.hasMoreElements()     // Catch: java.lang.Throwable -> L136
            if (r5 == 0) goto L110
            java.lang.Object r5 = r3.nextElement()     // Catch: java.lang.Throwable -> L136
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch: java.lang.Throwable -> L136
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L136
            boolean r6 = shouldSkipSignatureFile(r6)     // Catch: java.lang.Throwable -> L136
            if (r6 == 0) goto Lc1
            goto Laa
        Lc1:
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L136
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L136
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L136
            r0.putNextEntry(r6)     // Catch: java.lang.Throwable -> L136
            boolean r6 = r5.isDirectory()     // Catch: java.lang.Throwable -> L136
            if (r6 != 0) goto L10c
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L136
            boolean r6 = r4.equals(r6)     // Catch: java.lang.Throwable -> L136
            if (r6 == 0) goto Lf3
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L136
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L136
            copy(r5, r0)     // Catch: java.lang.Throwable -> Le9
            r5.close()     // Catch: java.lang.Throwable -> L136
            goto L10c
        Le9:
            r8 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lee
            goto Lf2
        Lee:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch: java.lang.Throwable -> L136
        Lf2:
            throw r8     // Catch: java.lang.Throwable -> L136
        Lf3:
            java.io.InputStream r5 = r9.getInputStream(r5)     // Catch: java.lang.Throwable -> L136
            copy(r5, r0)     // Catch: java.lang.Throwable -> L100
            if (r5 == 0) goto L10c
            r5.close()     // Catch: java.lang.Throwable -> L136
            goto L10c
        L100:
            r8 = move-exception
            if (r5 == 0) goto L10b
            r5.close()     // Catch: java.lang.Throwable -> L107
            goto L10b
        L107:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch: java.lang.Throwable -> L136
        L10b:
            throw r8     // Catch: java.lang.Throwable -> L136
        L10c:
            r0.closeEntry()     // Catch: java.lang.Throwable -> L136
            goto Laa
        L110:
            r0.close()     // Catch: java.lang.Throwable -> L140
            r9.close()
            boolean r9 = r8.delete()
            if (r9 == 0) goto L12e
            boolean r8 = r1.renameTo(r8)
            if (r8 == 0) goto L126
            r2.delete()
            return
        L126:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unable to move patched Forge installer jar."
            r8.<init>(r9)
            throw r8
        L12e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unable to replace Forge installer jar."
            r8.<init>(r9)
            throw r8
        L136:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L13b
            goto L13f
        L13b:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> L140
        L13f:
            throw r8     // Catch: java.lang.Throwable -> L140
        L140:
            r8 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L145
            goto L149
        L145:
            r9 = move-exception
            r8.addSuppressed(r9)
        L149:
            throw r8
        L14a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unable to find Forge install_profile install block."
            r8.<init>(r9)
            throw r8
        L152:
            r8 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L157
            goto L15b
        L157:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L15c
        L15b:
            throw r8     // Catch: java.lang.Throwable -> L15c
        L15c:
            r8 = move-exception
            if (r0 == 0) goto L167
            r0.close()     // Catch: java.lang.Throwable -> L163
            goto L167
        L163:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L17f
        L167:
            throw r8     // Catch: java.lang.Throwable -> L17f
        L168:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L17f
            java.lang.StringBuilder r8 = r1.append(r8)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L17f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L17f
            throw r9     // Catch: java.lang.Throwable -> L17f
        L17f:
            r8 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L184
            goto L188
        L184:
            r9 = move-exception
            r8.addSuppressed(r9)
        L188:
            throw r8
    }

    private static org.json.JSONObject readInstallProfileFromJar(java.io.File r4) throws java.lang.Exception {
            java.lang.String r0 = "install_profile.json not found in "
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r1.<init>(r4)
            java.lang.String r2 = "install_profile.json"
            java.util.zip.ZipEntry r2 = r1.getEntry(r2)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L31
            java.io.InputStream r4 = r1.getInputStream(r2)     // Catch: java.lang.Throwable -> L48
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = readStream(r4)     // Catch: java.lang.Throwable -> L25
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L21
            r4.close()     // Catch: java.lang.Throwable -> L48
        L21:
            r1.close()
            return r0
        L25:
            r0 = move-exception
            if (r4 == 0) goto L30
            r4.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L48
        L30:
            throw r0     // Catch: java.lang.Throwable -> L48
        L31:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r4 = r3.append(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L48
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L48
            throw r2     // Catch: java.lang.Throwable -> L48
        L48:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r0 = move-exception
            r4.addSuppressed(r0)
        L51:
            throw r4
    }

    private static java.lang.String readStream(java.io.InputStream r2) throws java.lang.Exception {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            copy(r2, r0)     // Catch: java.lang.Throwable -> L20
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r0.toString(r1)     // Catch: java.lang.Throwable -> L20
            r0.close()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L1f
            r2.close()
        L1f:
            return r1
        L20:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2a
        L29:
            throw r1     // Catch: java.lang.Throwable -> L2a
        L2a:
            r0 = move-exception
            if (r2 == 0) goto L35
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r0.addSuppressed(r2)
        L35:
            throw r0
    }

    private static java.lang.String readString(java.io.File r2) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            copy(r0, r2)     // Catch: java.lang.Throwable -> L1e
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r2.toString(r1)     // Catch: java.lang.Throwable -> L1e
            r2.close()     // Catch: java.lang.Throwable -> L28
            r0.close()
            return r1
        L1e:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L28
        L27:
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r2.addSuppressed(r0)
        L31:
            throw r2
    }

    private static void relaxGeneratedClientOutputHashes(org.json.JSONObject r9) {
            java.lang.String r0 = "processors"
            org.json.JSONArray r9 = r9.optJSONArray(r0)
            if (r9 != 0) goto L9
            return
        L9:
            r0 = 0
        La:
            int r1 = r9.length()
            if (r0 >= r1) goto L93
            org.json.JSONObject r1 = r9.optJSONObject(r0)
            if (r1 != 0) goto L18
            goto L8f
        L18:
            java.lang.String r2 = "outputs"
            org.json.JSONObject r3 = r1.optJSONObject(r2)
            if (r3 != 0) goto L21
            goto L8f
        L21:
            org.json.JSONArray r4 = r3.names()
            if (r4 != 0) goto L28
            goto L8f
        L28:
            int r5 = r4.length()
            int r5 = r5 + (-1)
        L2e:
            if (r5 < 0) goto L86
            java.lang.String r6 = ""
            java.lang.String r6 = r4.optString(r5, r6)
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r7 = r6.toLowerCase(r7)
            java.lang.String r8 = "mc_slim"
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L6c
            java.lang.String r8 = "mc_extra"
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L6c
            java.lang.String r8 = "-slim.jar"
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L6c
            java.lang.String r8 = "-extra.jar"
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L6c
            java.lang.String r8 = ":slim"
            boolean r8 = r7.contains(r8)
            if (r8 != 0) goto L6c
            java.lang.String r8 = ":extra"
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L83
        L6c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Relaxing Forge generated output hash check for "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r7)
            r3.remove(r6)
        L83:
            int r5 = r5 + (-1)
            goto L2e
        L86:
            int r3 = r3.length()
            if (r3 != 0) goto L8f
            r1.remove(r2)
        L8f:
            int r0 = r0 + 1
            goto La
        L93:
            return
    }

    private static java.lang.String resolveFullForgeVersion(java.lang.String r7, java.lang.String r8) throws java.lang.Exception {
            java.util.ArrayList r0 = downloadForgeVersions()
            r1 = 0
            java.lang.String r2 = "-"
            if (r8 == 0) goto Ld2
            java.lang.String r3 = r8.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Ld2
            java.lang.String r3 = normalizeRequestedForgeVersion(r7, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L2f
            goto L44
        L2f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
        L44:
            java.util.Iterator r4 = r0.iterator()
        L48:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r5.equals(r3)
            if (r6 == 0) goto L48
            return r5
        L5b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = "."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r5.startsWith(r3)
            if (r6 == 0) goto L77
            r4.add(r5)
            goto L77
        L8d:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lb3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda4 r8 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda4
            r8.<init>(r7)
            r4.sort(r8)
            java.lang.Object r7 = r4.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Forge "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r1 = " was not found for "
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        Ld2:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.util.Iterator r0 = r0.iterator()
        Lec:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L102
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.startsWith(r2)
            if (r4 == 0) goto Lec
            r8.add(r3)
            goto Lec
        L102:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L117
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda5 r7 = new ca.dnamobile.javalauncher.ui.version.ForgeInstaller$$ExternalSyntheticLambda5
            r7.<init>(r2)
            r8.sort(r7)
            java.lang.Object r7 = r8.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L117:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No Forge versions found for "
            r0.<init>(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    private static java.lang.String resolveInstalledForgeVersionId(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            boolean r0 = isInstalledVersion(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = "-forge-"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            r2 = 0
            r1[r2] = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = "-forge"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6 = 1
            r1[r6] = r5
            r5 = 2
            r1[r5] = r7
        L41:
            if (r2 >= r0) goto L4f
            r5 = r1[r2]
            boolean r6 = isInstalledVersion(r5)
            if (r6 == 0) goto L4c
            return r5
        L4c:
            int r2 = r2 + 1
            goto L41
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Forge installer finished, but no Forge version JSON was found for "
            r6.<init>(r7)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    private static java.io.File resolveInstallerRuntime(java.lang.String r10, java.lang.String r11) {
            boolean r0 = isLegacyJava8ForgeVersion(r10, r11)
            java.lang.String r1 = "Internal-25"
            r2 = 3
            java.lang.String r3 = "Internal-21"
            r4 = 2
            java.lang.String r5 = "Internal-17"
            java.lang.String r6 = "Internal-8"
            r7 = 4
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L1e
            java.lang.String[] r0 = new java.lang.String[r7]
            r0[r9] = r6
            r0[r8] = r5
            r0[r4] = r3
            r0[r2] = r1
            goto L39
        L1e:
            boolean r0 = isModernJavaMinecraftVersion(r10)
            if (r0 == 0) goto L2f
            java.lang.String[] r0 = new java.lang.String[r7]
            r0[r9] = r3
            r0[r8] = r1
            r0[r4] = r5
            r0[r2] = r6
            goto L39
        L2f:
            java.lang.String[] r0 = new java.lang.String[r7]
            r0[r9] = r5
            r0[r8] = r3
            r0[r4] = r1
            r0[r2] = r6
        L39:
            int r1 = r0.length
        L3a:
            if (r9 >= r1) goto L81
            r2 = r0[r9]
            java.io.File r3 = net.kdt.pojavlaunch.multirt.MultiRTUtils.getRuntimeDir(r2)
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L7e
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "bin/java"
            r4.<init>(r3, r5)
            boolean r4 = r4.isFile()
            if (r4 == 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Using "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " for Forge installer "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r0 = " / "
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "ForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r11, r10)
            return r3
        L7e:
            int r9 = r9 + 1
            goto L3a
        L81:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No internal Java runtime is installed for Forge installer."
            r10.<init>(r11)
            throw r10
    }

    private static java.lang.String resolveLibraryArtifactPath(org.json.JSONObject r3) {
            java.lang.String r0 = "downloads"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1f
            java.lang.String r2 = "artifact"
            org.json.JSONObject r0 = r0.optJSONObject(r2)
            if (r0 == 0) goto L1f
            java.lang.String r2 = "path"
            java.lang.String r0 = r0.optString(r2, r1)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r0 = "name"
            java.lang.String r3 = r3.optString(r0, r1)
            java.lang.String r3 = artifactPathFromName(r3)
            return r3
    }

    private static java.util.ArrayList<java.lang.String> resolveLibraryDownloadUrls(org.json.JSONObject r5, java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "downloads"
            org.json.JSONObject r1 = r5.optJSONObject(r1)
            if (r1 == 0) goto L14
            java.lang.String r2 = "artifact"
            org.json.JSONObject r1 = r1.optJSONObject(r2)
            goto L15
        L14:
            r1 = 0
        L15:
            java.lang.String r2 = ""
            java.lang.String r3 = "url"
            if (r1 == 0) goto L32
            java.lang.String r1 = r1.optString(r3, r2)
            if (r1 == 0) goto L32
            java.lang.String r4 = r1.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L32
            java.lang.String r1 = r1.trim()
            addUrlIfMissing(r0, r1)
        L32:
            java.lang.String r5 = r5.optString(r3, r2)
            if (r5 == 0) goto L4d
            java.lang.String r1 = r5.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4d
            java.lang.String r5 = r5.trim()
            java.lang.String r5 = joinRepoAndPath(r5, r6)
            addUrlIfMissing(r0, r5)
        L4d:
            java.lang.String r5 = "https://maven.minecraftforge.net/"
            java.lang.String r5 = joinRepoAndPath(r5, r6)
            addUrlIfMissing(r0, r5)
            java.lang.String r5 = "https://repo1.maven.org/maven2/"
            java.lang.String r5 = joinRepoAndPath(r5, r6)
            addUrlIfMissing(r0, r5)
            java.lang.String r5 = "https://libraries.minecraft.net/"
            java.lang.String r5 = joinRepoAndPath(r5, r6)
            addUrlIfMissing(r0, r5)
            return r0
    }

    private static java.lang.String resolveLibrarySha1(org.json.JSONObject r3) {
            java.lang.String r0 = "downloads"
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            r0 = 0
            if (r3 == 0) goto L10
            java.lang.String r1 = "artifact"
            org.json.JSONObject r3 = r3.optJSONObject(r1)
            goto L11
        L10:
            r3 = r0
        L11:
            java.lang.String r1 = ""
            if (r3 == 0) goto L1b
            java.lang.String r2 = "sha1"
            java.lang.String r1 = r3.optString(r2, r1)
        L1b:
            if (r1 == 0) goto L2c
            java.lang.String r3 = r1.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L28
            goto L2c
        L28:
            java.lang.String r0 = r1.trim()
        L2c:
            return r0
    }

    private static java.lang.String sanitizeVersionId(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "[^a-z0-9._ -]"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            r0 = 32
            r2 = 45
            java.lang.String r3 = r3.replace(r0, r2)
            java.lang.String r0 = "-+"
            java.lang.String r2 = "-"
            java.lang.String r3 = r3.replaceAll(r0, r2)
            java.lang.String r0 = "^-|-$"
            java.lang.String r3 = r3.replaceAll(r0, r1)
            return r3
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

    private static boolean shouldSkipSignatureFile(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "META-INF/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = ".SF"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = ".RSA"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = ".DSA"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = ".EC"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L30
        L2e:
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
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
