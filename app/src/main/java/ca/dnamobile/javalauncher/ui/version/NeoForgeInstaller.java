package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class NeoForgeInstaller {
    private static final int BUFFER_SIZE = 65536;
    private static final int MAX_PARALLEL_DOWNLOADS = 4;
    private static final java.lang.String NEOFORGED_FORGE_INSTALLER_URL = "https://maven.neoforged.net/releases/net/neoforged/forge/%1$s/forge-%1$s-installer.jar";
    private static final java.lang.String NEOFORGED_FORGE_METADATA_URL = "https://maven.neoforged.net/releases/net/neoforged/forge/maven-metadata.xml";
    private static final java.lang.String NEOFORGE_INSTALLER_URL = "https://maven.neoforged.net/releases/net/neoforged/neoforge/%1$s/neoforge-%1$s-installer.jar";
    private static final java.lang.String NEOFORGE_METADATA_URL = "https://maven.neoforged.net/releases/net/neoforged/neoforge/maven-metadata.xml";
    private static final java.lang.String TAG = "NeoForgeInstaller";

    public static final class InstallResult {
        private final java.lang.String fullNeoForgeVersion;
        private final boolean legacyNeoForgedForge;
        private final java.lang.String loaderVersion;
        private final java.lang.String minecraftVersionId;
        private final java.lang.String neoForgeVersionId;

        private InstallResult(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.minecraftVersionId = r1
                r0.loaderVersion = r2
                r0.fullNeoForgeVersion = r3
                r0.neoForgeVersionId = r4
                r0.legacyNeoForgedForge = r5
                return
        }

        /* synthetic */ InstallResult(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.InstallResultIA r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public java.lang.String getFullNeoForgeVersion() {
                r1 = this;
                java.lang.String r0 = r1.fullNeoForgeVersion
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

        public java.lang.String getNeoForgeVersionId() {
                r1 = this;
                java.lang.String r0 = r1.neoForgeVersionId
                return r0
        }

        public boolean isLegacyNeoForgedForge() {
                r1 = this;
                boolean r0 = r1.legacyNeoForgedForge
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$InstallResult-IA, reason: invalid class name */
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

        /* synthetic */ LibraryDownload(java.io.File r1, java.lang.String r2, java.util.ArrayList r3, java.lang.String r4, java.lang.String r5, ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.LibraryDownloadIA r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$LibraryDownload-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class LibraryDownloadIA {
    }

    private static final class VersionCoordinate {
        final java.lang.String fullVersion;
        final java.lang.String installerUrl;
        final boolean legacyNeoForgedForge;
        final java.lang.String loaderVersion;

        VersionCoordinate(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.fullVersion = r1
                r0.loaderVersion = r2
                r0.installerUrl = r3
                r0.legacyNeoForgedForge = r4
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$rBGl4EX_lnnUiwCFvNtn2qUYYaM(ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.LibraryDownload r0) {
            downloadLibraryWithFallbacks(r0)
            return
    }

    private NeoForgeInstaller() {
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

    private static java.util.ArrayList<java.lang.String> buildInstallerArgs(ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.VersionCoordinate r2, java.io.File r3) {
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = "-Djava.awt.headless=true"
            r2.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Duser.home="
            r0.<init>(r1)
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Djava.io.tmpdir="
            r0.<init>(r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            java.lang.String r0 = "-jar"
            r2.add(r0)
            java.lang.String r3 = r3.getAbsolutePath()
            r2.add(r3)
            java.lang.String r3 = "--installClient"
            r2.add(r3)
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r2.add(r3)
            return r2
    }

    private static java.lang.String canonicalPathKey(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private static void cleanupNeoForgeGeneratedOutputs(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            java.lang.String r2 = "net/minecraft/client"
            r0.<init>(r1, r2)
            java.io.File[] r0 = r0.listFiles()
            java.lang.String r1 = "NeoForgeInstaller"
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
            java.lang.String r6 = "Deleting stale NeoForge generated client output: "
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
            java.lang.String r0 = "Deleting stale NeoForge version dir: "
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
            java.lang.String r1 = "net/neoforged/neoforge/"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r0 = r0.toString()
            r8.<init>(r9, r0)
            deleteEmptyDirectory(r8)
            java.io.File r8 = new java.io.File
            java.io.File r9 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getLibrariesDirectory()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "net/neoforged/forge/"
            r0.<init>(r1)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r10 = r10.toString()
            r8.<init>(r9, r10)
            deleteEmptyDirectory(r8)
            return
    }

    private static void cleanupNeoForgeTargetVersionOnly(java.lang.String r2) {
            java.io.File r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionDirectory(r2)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Deleting stale NeoForge version dir: "
            r0.<init>(r1)
            java.lang.String r1 = r2.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NeoForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
            deleteRecursively(r2)
        L25:
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
            java.lang.String r1 = "Cloned reusable NeoForge profile "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " -> "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "NeoForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
        Ld7:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Reusable NeoForge profile JSON is missing: "
            r7.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private static int compareNeoForgeBuilds(java.lang.String r7, java.lang.String r8) {
            int r0 = r7.length()
            r1 = 0
            java.lang.String r0 = r7.substring(r1, r0)
            java.lang.String r2 = "-"
            r3 = 2
            java.lang.String[] r0 = r0.split(r2, r3)
            r0 = r0[r1]
            int[] r0 = parseBuildParts(r0)
            int r4 = r8.length()
            java.lang.String r4 = r8.substring(r1, r4)
            java.lang.String[] r2 = r4.split(r2, r3)
            r2 = r2[r1]
            int[] r2 = parseBuildParts(r2)
            int r3 = r0.length
            int r4 = r2.length
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r1
        L2f:
            if (r4 >= r3) goto L49
            int r5 = r0.length
            if (r4 >= r5) goto L37
            r5 = r0[r4]
            goto L38
        L37:
            r5 = r1
        L38:
            int r6 = r2.length
            if (r4 >= r6) goto L3e
            r6 = r2[r4]
            goto L3f
        L3e:
            r6 = r1
        L3f:
            if (r5 == r6) goto L46
            int r7 = java.lang.Integer.compare(r5, r6)
            return r7
        L46:
            int r4 = r4 + 1
            goto L2f
        L49:
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

    private static java.lang.String createUniqueNeoForgeVersionId(java.lang.String r3, java.lang.String r4) {
            java.lang.String r3 = sanitizeVersionId(r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " NeoForge"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = sanitizeVersionId(r3)
        L21:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "neoforge-"
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

    private static void deleteEmptyDirectory(java.io.File r1) {
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L13
            int r0 = r0.length
            if (r0 != 0) goto L13
            deleteRecursively(r1)
        L13:
            return
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
            java.lang.String r0 = "NeoForgeInstaller"
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
            java.lang.String r3 = "Existing NeoForge file hash mismatch, redownloading: "
            r2.<init>(r3)
            java.lang.String r3 = r5.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NeoForgeInstaller"
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

    private static void downloadLibraryWithFallbacks(ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.LibraryDownload r5) throws java.lang.Exception {
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
            java.lang.String r4 = "NeoForge library download failed from "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = r2.getMessage()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "NeoForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r1)
            r1 = r2
            goto L7
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to download NeoForge library "
            r2.<init>(r3)
            java.lang.String r5 = r5.libraryName
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5, r1)
            throw r0
    }

    private static java.util.ArrayList<java.lang.String> downloadNeoForgeVersions() throws java.lang.Exception {
            java.lang.String r0 = "https://maven.neoforged.net/releases/net/neoforged/neoforge/maven-metadata.xml"
            java.lang.String r0 = downloadText(r0)
            java.util.ArrayList r0 = parseMavenVersions(r0)
            return r0
    }

    private static java.util.ArrayList<java.lang.String> downloadNeoForgedForgeVersions() throws java.lang.Exception {
            java.lang.String r0 = "https://maven.neoforged.net/releases/net/neoforged/forge/maven-metadata.xml"
            java.lang.String r0 = downloadText(r0)
            java.util.ArrayList r0 = parseMavenVersions(r0)
            return r0
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

    private static void ensureNeoForgeVersionLibrariesDownloaded(java.lang.String r13, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r14) throws java.lang.Exception {
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
            java.lang.String r6 = "NeoForgeInstaller"
            if (r5 == 0) goto L9a
            if (r8 == 0) goto Ldd
            java.lang.String r5 = sha1(r7)
            boolean r5 = r5.equalsIgnoreCase(r8)
            if (r5 == 0) goto L84
            goto Ldd
        L84:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "NeoForge library hash mismatch, redownloading: "
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
            java.lang.String r5 = "No download URL known for NeoForge library: "
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
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$LibraryDownload r5 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$LibraryDownload
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
            java.lang.String r2 = " NeoForge libraries..."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 90
            notify(r14, r2, r1)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda0
            r1.<init>()
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda1
            r2.<init>(r13, r14)
            r13 = 4
            ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.run(r0, r13, r1, r2)
        L11d:
            return
        L11e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing installed NeoForge version JSON: "
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
            java.lang.String r3 = " for NeoForge..."
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

    private static ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.VersionCoordinate findLatestLegacyNeoForgedForgeCoordinate(java.lang.String r4) throws java.lang.Exception {
            java.util.ArrayList r0 = downloadNeoForgedForgeVersions()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r2.startsWith(r4)
            if (r3 == 0) goto L20
            r1.add(r2)
            goto L20
        L36:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3e
            r4 = 0
            return r4
        L3e:
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda4 r0 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda4
            r0.<init>(r4)
            r1.sort(r0)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r4 = r4.length()
            java.lang.String r4 = r0.substring(r4)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r1 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate
            java.lang.String r2 = getNeoForgedForgeInstallerUrl(r0)
            r3 = 1
            r1.<init>(r0, r4, r2, r3)
            return r1
    }

    private static ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.VersionCoordinate findLatestModernNeoForgeCoordinate(java.lang.String r4) throws java.lang.Exception {
            java.util.ArrayList r0 = downloadNeoForgeVersions()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = formatGameVersion(r2)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Ld
            r1.add(r2)
            goto Ld
        L27:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L2f
            r4 = 0
            return r4
        L2f:
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda5 r4 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda5
            r4.<init>()
            r1.sort(r4)
            r4 = 0
            java.lang.Object r0 = r1.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r1 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate
            java.lang.String r2 = getNeoForgeInstallerUrl(r0)
            r1.<init>(r0, r0, r2, r4)
            return r1
    }

    private static ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.VersionCoordinate findLegacyNeoForgedForgeCoordinate(java.lang.String r4, java.lang.String r5) throws java.lang.Exception {
            java.util.ArrayList r0 = downloadNeoForgedForgeVersions()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L1e
            goto L33
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
        L33:
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = r1.equals(r5)
            if (r3 == 0) goto L37
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            java.lang.String r4 = r1.substring(r4)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r5 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate
            java.lang.String r0 = getNeoForgedForgeInstallerUrl(r1)
            r2 = 1
            r5.<init>(r1, r4, r0, r2)
            return r5
        L6d:
            r4 = 0
            return r4
    }

    private static ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.VersionCoordinate findModernNeoForgeCoordinate(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.util.ArrayList r0 = downloadNeoForgeVersions()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L8
            java.lang.String r2 = formatGameVersion(r1)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r3 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate
            java.lang.String r4 = getNeoForgeInstallerUrl(r1)
            r0 = 0
            r3.<init>(r1, r1, r4, r0)
            return r3
        L2f:
            r3 = 0
            return r3
    }

    private static java.lang.String findReusableNeoForgeVersionId(java.lang.String r6, java.lang.String r7, boolean r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r6)
            r0.add(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "neoforge-"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "neoforged-forge-"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "forge-"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = isNeoForgeCoordinateVersion(r1, r7, r8)
            if (r2 == 0) goto L45
            return r1
        L58:
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()
            java.io.File[] r0 = r0.listFiles()
            r1 = 0
            if (r0 != 0) goto L64
            return r1
        L64:
            int r2 = r0.length
            r3 = 0
        L66:
            if (r3 >= r2) goto L88
            r4 = r0[r3]
            if (r4 == 0) goto L85
            boolean r5 = r4.isDirectory()
            if (r5 != 0) goto L73
            goto L85
        L73:
            java.lang.String r4 = r4.getName()
            boolean r5 = r6.equals(r4)
            if (r5 == 0) goto L7e
            goto L85
        L7e:
            boolean r5 = isNeoForgeCoordinateVersion(r4, r7, r8)
            if (r5 == 0) goto L85
            return r4
        L85:
            int r3 = r3 + 1
            goto L66
        L88:
            return r1
    }

    private static void flattenInheritedProfileIfEnabled(android.content.Context r2, java.lang.String r3, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r4) throws java.lang.Exception {
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isRemoveInheritedVanillaAfterLoaderInstall(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 96
            java.lang.String r1 = "Flattening NeoForge profile..."
            notify(r4, r0, r1)
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$FlattenResult r0 = ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.flattenInstalledVersionProfile(r2, r3)
            boolean r0 = r0.flattened
            if (r0 != 0) goto L17
            return
        L17:
            ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener$ParentDeleteResult r2 = ca.dnamobile.javalauncher.ui.version.InheritedVersionFlattener.deleteFlattenedParentVersionIfSafe(r2, r3)
            java.lang.String r3 = "NeoForgeInstaller"
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

    private static java.lang.String formatGameVersion(java.lang.String r8) {
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

    private static java.lang.String getNeoForgeInstallerUrl(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = "https://maven.neoforged.net/releases/net/neoforged/neoforge/%1$s/neoforge-%1$s-installer.jar"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r0, r1, r2)
            return r2
    }

    private static java.lang.String getNeoForgedForgeInstallerUrl(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = "https://maven.neoforged.net/releases/net/neoforged/forge/%1$s/forge-%1$s-installer.jar"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r0, r1, r2)
            return r2
    }

    public static java.lang.String inferLoaderNameFromVersionId(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "neoforged"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            java.lang.String r1 = "Vanilla"
            return r1
        L1a:
            java.lang.String r1 = "NeoForge"
            return r1
    }

    public static ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.InstallResult installNeoForgeVersion(android.content.Context r18, ca.dnamobile.javalauncher.data.model.MinecraftVersion r19, java.lang.String r20, java.lang.String r21, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r22) throws java.lang.Exception {
            r8 = r18
            r9 = r22
            ensureActivePathManager(r18)
            java.lang.String r10 = r19.getId()
            r0 = r19
            ensureVanillaBaseIsValid(r8, r0, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Resolving NeoForge for "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 68
            notify(r9, r2, r0)
            r0 = r21
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r11 = resolveNeoForgeCoordinate(r10, r0)
            r0 = r20
            java.lang.String r12 = createUniqueNeoForgeVersionId(r0, r10)
            java.lang.String r0 = r11.fullVersion
            boolean r2 = r11.legacyNeoForgedForge
            java.lang.String r0 = findReusableNeoForgeVersionId(r12, r0, r2)
            java.lang.String r13 = " installed."
            java.lang.String r14 = "NeoForge "
            r15 = 100
            r2 = 72
            if (r0 == 0) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Reusing existing NeoForge "
            r1.<init>(r3)
            java.lang.String r3 = r11.loaderVersion
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " profile..."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            notify(r9, r2, r1)
            cloneInstalledVersionProfileIfNeeded(r0, r12)
            ensureNeoForgeVersionLibrariesDownloaded(r12, r9)
            flattenInheritedProfileIfEnabled(r8, r12, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = r11.loaderVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            notify(r9, r15, r0)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$InstallResult r7 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$InstallResult
            java.lang.String r2 = r11.loaderVersion
            java.lang.String r3 = r11.fullVersion
            boolean r5 = r11.legacyNeoForgedForge
            r6 = 0
            r0 = r7
            r1 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Downloading NeoForge installer "
            r0.<init>(r3)
            java.lang.String r3 = r11.loaderVersion
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            notify(r9, r2, r0)
            boolean r0 = r11.legacyNeoForgedForge
            if (r0 == 0) goto Lb0
            java.lang.String r0 = "neoforged-forge-"
            goto Lb2
        Lb0:
            java.lang.String r0 = "neoforge-"
        Lb2:
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r4 = "neoforge/original"
            r2.<init>(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = r11.fullVersion
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "-installer.jar"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            java.lang.String r2 = r11.installerUrl
            r3 = 0
            downloadFileIfNeeded(r1, r2, r3)
            r2 = 76
            java.lang.String r3 = "Preparing NeoForge installer profile..."
            notify(r9, r2, r3)
            java.io.File r2 = new java.io.File
            java.io.File r3 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r6 = "neoforge/patched"
            r3.<init>(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.String r5 = r11.fullVersion
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r5 = "-"
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r5 = safeCacheFileName(r12)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            patchInstallerProfile(r1, r2, r12)
            generateLauncherProfiles()
            cleanupNeoForgeTargetVersionOnly(r12)
            r0 = 80
            java.lang.String r1 = "Running NeoForge installer..."
            notify(r9, r0, r1)
            java.util.ArrayList r16 = buildInstallerArgs(r11, r2)
            java.io.File r17 = resolveInstallerRuntime(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "neoforge-installer-"
            r0.<init>(r1)
            java.lang.String r1 = r11.loaderVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r3.<init>(r0)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda2 r7 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda2
            r7.<init>(r9)
            r5 = 81
            r6 = 88
            r0 = r18
            r2 = r17
            r4 = r16
            int r0 = ca.dnamobile.javalauncher.ui.version.InstallerProcessRunner.launch(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L195
            r0 = 86
            java.lang.String r1 = "NeoForge installer failed once. Cleaning generated outputs and retrying..."
            notify(r9, r0, r1)
            java.lang.String r0 = r11.fullVersion
            cleanupNeoForgeGeneratedOutputs(r10, r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "neoforge-installer-retry-"
            r0.<init>(r1)
            java.lang.String r1 = r11.loaderVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r3 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r3.<init>(r0)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda3 r7 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$$ExternalSyntheticLambda3
            r7.<init>(r9)
            r5 = 86
            r6 = 89
            r0 = r18
            r2 = r17
            r4 = r16
            int r0 = ca.dnamobile.javalauncher.ui.version.InstallerProcessRunner.launch(r0, r1, r2, r3, r4, r5, r6, r7)
        L195:
            if (r0 != 0) goto L1cc
            java.lang.String r0 = r11.loaderVersion
            java.lang.String r1 = r11.fullVersion
            boolean r2 = r11.legacyNeoForgedForge
            java.lang.String r4 = resolveInstalledNeoForgeVersionId(r12, r10, r0, r1, r2)
            ensureNeoForgeVersionLibrariesDownloaded(r4, r9)
            flattenInheritedProfileIfEnabled(r8, r4, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r1 = r11.loaderVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            notify(r9, r15, r0)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$InstallResult r7 = new ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$InstallResult
            java.lang.String r2 = r11.loaderVersion
            java.lang.String r3 = r11.fullVersion
            boolean r5 = r11.legacyNeoForgedForge
            r6 = 0
            r0 = r7
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L1cc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "NeoForge installer exited with code "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ". Check latestlog.txt for the NeoForge installer command-line output."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
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
            java.lang.String r5 = "net.neoforged"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L72
            goto L73
        L72:
            r0 = 0
        L73:
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

    private static boolean isNeoForgeCoordinateVersion(java.lang.String r7, java.lang.String r8, boolean r9) {
            java.lang.String r0 = "net.neoforged:forge:"
            java.lang.String r1 = "net.neoforged:neoforge:"
            r2 = 0
            if (r7 == 0) goto Lab
            java.lang.String r3 = r7.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L13
            goto Lab
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
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = readString(r4)     // Catch: java.lang.Throwable -> L88
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L88
            if (r9 == 0) goto L4f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r9 = r9.append(r8)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L88
            goto L5c
        L4f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r9 = r9.append(r8)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L88
        L5c:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L88
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L88
            boolean r9 = r0.contains(r9)     // Catch: java.lang.Throwable -> L88
            if (r9 != 0) goto L83
            boolean r8 = r0.contains(r8)     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L82
            java.lang.String r8 = "neoforge"
            boolean r8 = r1.contains(r8)     // Catch: java.lang.Throwable -> L88
            if (r8 != 0) goto L83
            java.lang.String r8 = "neoforged"
            boolean r8 = r1.contains(r8)     // Catch: java.lang.Throwable -> L88
            if (r8 != 0) goto L83
        L82:
            return r2
        L83:
            boolean r7 = isLaunchableVersionProfile(r7, r3)     // Catch: java.lang.Throwable -> L88
            return r7
        L88:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to inspect NeoForge profile "
            r9.<init>(r0)
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r9 = ": "
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "NeoForgeInstaller"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r7)
        Lab:
            return r2
    }

    private static boolean isVanillaClientJarValid(java.io.File r5, java.io.File r6) {
            java.lang.String r0 = "NeoForgeInstaller"
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
            java.lang.String r6 = "Unable to validate vanilla client jar for NeoForge"
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

    static /* synthetic */ void lambda$ensureNeoForgeVersionLibrariesDownloaded$4(int r4, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r5, int r6, int r7, ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.LibraryDownload r8) {
            long r0 = (long) r6
            r2 = 8
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 / r2
            int r7 = (int) r0
            int r7 = r7 + 90
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Downloading NeoForge libraries ("
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

    static /* synthetic */ int lambda$findLatestLegacyNeoForgedForgeCoordinate$2(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            int r0 = r1.length()
            java.lang.String r3 = r3.substring(r0)
            int r1 = r1.length()
            java.lang.String r1 = r2.substring(r1)
            int r1 = compareNeoForgeBuilds(r3, r1)
            return r1
    }

    static /* synthetic */ int lambda$findLatestModernNeoForgeCoordinate$3(java.lang.String r0, java.lang.String r1) {
            int r0 = compareNeoForgeBuilds(r1, r0)
            return r0
    }

    static /* synthetic */ void lambda$installNeoForgeVersion$0(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r0, int r1, java.lang.String r2) {
            notify(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$installNeoForgeVersion$1(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r0, int r1, java.lang.String r2) {
            notify(r0, r1, r2)
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

    private static void patchInstallerProfile(java.io.File r7, java.io.File r8, java.lang.String r9) throws java.lang.Exception {
            java.lang.String r0 = "install_profile.json"
            java.lang.String r1 = "install_profile.json not found in "
            java.io.File r2 = r8.getParentFile()
            if (r2 == 0) goto Ld
            ensureDirectory(r2)
        Ld:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ".tmp"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.io.File r4 = new java.io.File
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
        L30:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "install_profile-"
            r5.<init>(r6)
            java.lang.String r6 = safeCacheFileName(r9)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ".json"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r2, r5)
            boolean r2 = r3.exists()
            if (r2 == 0) goto L72
            boolean r2 = r3.delete()
            if (r2 == 0) goto L59
            goto L72
        L59:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unable to delete old temp installer: "
            r8.<init>(r9)
            java.lang.String r9 = r3.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L72:
            boolean r2 = r8.exists()
            if (r2 == 0) goto L98
            boolean r2 = r8.delete()
            if (r2 == 0) goto L7f
            goto L98
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to delete old patched installer: "
            r9.<init>(r0)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L98:
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
            r2.<init>(r7)
            java.util.zip.ZipEntry r5 = r2.getEntry(r0)     // Catch: java.lang.Throwable -> L1f6
            if (r5 == 0) goto L1df
            java.io.InputStream r1 = r2.getInputStream(r5)     // Catch: java.lang.Throwable -> L1f6
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1d3
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1d3
            copy(r1, r5)     // Catch: java.lang.Throwable -> L1c9
            r5.close()     // Catch: java.lang.Throwable -> L1d3
            if (r1 == 0) goto Lb7
            r1.close()     // Catch: java.lang.Throwable -> L1f6
        Lb7:
            r2.close()
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r2 = readString(r4)
            r1.<init>(r2)
            java.lang.String r2 = "spec"
            boolean r2 = r1.has(r2)
            if (r2 == 0) goto Ldf
            java.lang.String r2 = "version"
            boolean r5 = r1.has(r2)
            if (r5 == 0) goto Ld7
            r1.put(r2, r9)
            goto Lef
        Ld7:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unable to find NeoForge install_profile version key."
            r7.<init>(r8)
            throw r7
        Ldf:
            java.lang.String r2 = "install"
            org.json.JSONObject r5 = r1.optJSONObject(r2)
            if (r5 == 0) goto L1c1
            java.lang.String r6 = "target"
            r5.put(r6, r9)
            r1.put(r2, r5)
        Lef:
            relaxGeneratedClientOutputHashes(r1)
            java.lang.String r9 = r1.toString()
            writeString(r4, r9)
            java.util.zip.ZipFile r9 = new java.util.zip.ZipFile
            r9.<init>(r7)
            java.util.zip.ZipOutputStream r7 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L1b7
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1b7
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1b7
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L1b7
            java.util.Enumeration r1 = r9.entries()     // Catch: java.lang.Throwable -> L1ad
        L10c:
            boolean r2 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L1ad
            if (r2 == 0) goto L172
            java.lang.Object r2 = r1.nextElement()     // Catch: java.lang.Throwable -> L1ad
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L1ad
            boolean r5 = shouldSkipSignatureFile(r5)     // Catch: java.lang.Throwable -> L1ad
            if (r5 == 0) goto L123
            goto L10c
        L123:
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L1ad
            java.lang.String r6 = r2.getName()     // Catch: java.lang.Throwable -> L1ad
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L1ad
            r7.putNextEntry(r5)     // Catch: java.lang.Throwable -> L1ad
            boolean r5 = r2.isDirectory()     // Catch: java.lang.Throwable -> L1ad
            if (r5 != 0) goto L16e
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L1ad
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L1ad
            if (r5 == 0) goto L155
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1ad
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1ad
            copy(r2, r7)     // Catch: java.lang.Throwable -> L14b
            r2.close()     // Catch: java.lang.Throwable -> L1ad
            goto L16e
        L14b:
            r8 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L150
            goto L154
        L150:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> L1ad
        L154:
            throw r8     // Catch: java.lang.Throwable -> L1ad
        L155:
            java.io.InputStream r2 = r9.getInputStream(r2)     // Catch: java.lang.Throwable -> L1ad
            copy(r2, r7)     // Catch: java.lang.Throwable -> L162
            if (r2 == 0) goto L16e
            r2.close()     // Catch: java.lang.Throwable -> L1ad
            goto L16e
        L162:
            r8 = move-exception
            if (r2 == 0) goto L16d
            r2.close()     // Catch: java.lang.Throwable -> L169
            goto L16d
        L169:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> L1ad
        L16d:
            throw r8     // Catch: java.lang.Throwable -> L1ad
        L16e:
            r7.closeEntry()     // Catch: java.lang.Throwable -> L1ad
            goto L10c
        L172:
            r7.close()     // Catch: java.lang.Throwable -> L1b7
            r9.close()
            boolean r7 = r3.renameTo(r8)
            if (r7 != 0) goto L1a9
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r7.<init>(r3)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L19f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L19f
            copy(r7, r9)     // Catch: java.lang.Throwable -> L195
            r9.close()     // Catch: java.lang.Throwable -> L19f
            r7.close()
            r3.delete()
            goto L1a9
        L195:
            r8 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L19a
            goto L19e
        L19a:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L19f
        L19e:
            throw r8     // Catch: java.lang.Throwable -> L19f
        L19f:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L1a4
            goto L1a8
        L1a4:
            r7 = move-exception
            r8.addSuppressed(r7)
        L1a8:
            throw r8
        L1a9:
            r4.delete()
            return
        L1ad:
            r8 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L1b2
            goto L1b6
        L1b2:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> L1b7
        L1b6:
            throw r8     // Catch: java.lang.Throwable -> L1b7
        L1b7:
            r7 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L1bc
            goto L1c0
        L1bc:
            r8 = move-exception
            r7.addSuppressed(r8)
        L1c0:
            throw r7
        L1c1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unable to find NeoForge install_profile install block."
            r7.<init>(r8)
            throw r7
        L1c9:
            r7 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L1ce
            goto L1d2
        L1ce:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L1d3
        L1d2:
            throw r7     // Catch: java.lang.Throwable -> L1d3
        L1d3:
            r7 = move-exception
            if (r1 == 0) goto L1de
            r1.close()     // Catch: java.lang.Throwable -> L1da
            goto L1de
        L1da:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L1f6
        L1de:
            throw r7     // Catch: java.lang.Throwable -> L1f6
        L1df:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f6
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L1f6
            java.lang.StringBuilder r7 = r9.append(r7)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1f6
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L1f6
            throw r8     // Catch: java.lang.Throwable -> L1f6
        L1f6:
            r7 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L1fb
            goto L1ff
        L1fb:
            r8 = move-exception
            r7.addSuppressed(r8)
        L1ff:
            throw r7
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
            java.lang.String r8 = "Relaxing NeoForge generated output hash check for "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "NeoForgeInstaller"
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

    private static java.lang.String resolveInstalledNeoForgeVersionId(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            boolean r0 = isInstalledVersion(r3)
            if (r0 == 0) goto L7
            return r3
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "neoforge-"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = "-neoforge-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            r0.add(r6)
            if (r7 == 0) goto L89
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r1 = "-forge-"
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r5 = r5.toString()
            r0.add(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = "-forge"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
        L89:
            java.util.Iterator r4 = r0.iterator()
        L8d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = isInstalledVersion(r5)
            if (r6 == 0) goto L8d
            return r5
        La0:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "NeoForge installer finished, but no NeoForge version JSON was found for "
            r5.<init>(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private static java.io.File resolveInstallerRuntime(java.lang.String r9) {
            boolean r9 = isModernJavaMinecraftVersion(r9)
            java.lang.String r0 = "Internal-8"
            r1 = 3
            java.lang.String r2 = "Internal-25"
            r3 = 2
            java.lang.String r4 = "Internal-21"
            java.lang.String r5 = "Internal-17"
            r6 = 4
            r7 = 1
            r8 = 0
            if (r9 == 0) goto L1e
            java.lang.String[] r9 = new java.lang.String[r6]
            r9[r8] = r4
            r9[r7] = r2
            r9[r3] = r5
            r9[r1] = r0
            goto L28
        L1e:
            java.lang.String[] r9 = new java.lang.String[r6]
            r9[r8] = r5
            r9[r7] = r4
            r9[r3] = r2
            r9[r1] = r0
        L28:
            int r0 = r9.length
        L29:
            if (r8 >= r0) goto L48
            r1 = r9[r8]
            java.io.File r1 = net.kdt.pojavlaunch.multirt.MultiRTUtils.getRuntimeDir(r1)
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L45
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "bin/java"
            r2.<init>(r1, r3)
            boolean r2 = r2.isFile()
            if (r2 == 0) goto L45
            return r1
        L45:
            int r8 = r8 + 1
            goto L29
        L48:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "No internal Java runtime is installed for NeoForge installer."
            r9.<init>(r0)
            throw r9
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
            java.lang.String r5 = "https://maven.neoforged.net/releases/"
            java.lang.String r5 = joinRepoAndPath(r5, r6)
            addUrlIfMissing(r0, r5)
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

    private static ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.VersionCoordinate resolveNeoForgeCoordinate(java.lang.String r4, java.lang.String r5) throws java.lang.Exception {
            r0 = 0
            if (r5 == 0) goto L40
            java.lang.String r1 = r5.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L40
            java.lang.String r5 = r5.trim()
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r1 = findLegacyNeoForgedForgeCoordinate(r4, r5)     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L19
            return r1
        L18:
            r0 = move-exception
        L19:
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r1 = findModernNeoForgeCoordinate(r4, r5)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L21
            return r1
        L20:
            r0 = move-exception
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "NeoForge "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " was not found for "
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r0)
            throw r1
        L40:
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r5 = findLatestModernNeoForgeCoordinate(r4)     // Catch: java.lang.Exception -> L47
            if (r5 == 0) goto L48
            return r5
        L47:
            r0 = move-exception
        L48:
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$VersionCoordinate r5 = findLatestLegacyNeoForgedForgeCoordinate(r4)     // Catch: java.lang.Exception -> L4f
            if (r5 == 0) goto L50
            return r5
        L4f:
            r0 = move-exception
        L50:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No NeoForge versions found for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4, r0)
            throw r5
    }

    private static java.lang.String safeCacheFileName(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "[^a-z0-9._-]"
            java.lang.String r1 = "-"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.lang.String r0 = "-+"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.lang.String r0 = "^-|-$"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replaceAll(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L24
            java.lang.String r2 = "neoforge"
        L24:
            return r2
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
