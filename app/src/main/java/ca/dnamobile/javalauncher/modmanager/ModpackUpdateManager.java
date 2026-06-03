package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModpackUpdateManager {
    private static final java.lang.String METADATA_DIRECTORY = ".javalauncher";
    private static final java.lang.String MODPACK_FILES_METADATA_FILE = "modpack_files_manifest.json";
    private static final java.lang.String MODPACK_METADATA_FILE = "modpack_manifest.json";
    private static final java.lang.String TAG = "ModpackUpdateManager";

    public static final class InstalledModpackInfo {
        public final java.lang.String currentFileId;
        public final java.lang.String currentVersionId;
        public final java.lang.String currentVersionLabel;
        public final java.lang.String currentVersionNumber;
        public final java.lang.String displayTitle;
        public final java.io.File metadataFile;
        public final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform platform;
        public final java.lang.String projectId;

        private InstalledModpackInfo(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.io.File r9) {
                r2 = this;
                r2.<init>()
                r2.platform = r3
                r2.projectId = r4
                r2.currentVersionId = r5
                r2.currentFileId = r6
                r2.currentVersionNumber = r7
                r3 = 4
                java.lang.String[] r3 = new java.lang.String[r3]
                r0 = 0
                r3[r0] = r7
                r7 = 1
                r3[r7] = r5
                r5 = 2
                r3[r5] = r6
                java.lang.String r6 = "Unknown"
                r1 = 3
                r3[r1] = r6
                java.lang.String r3 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.m553$$Nest$smfirstNonBlank(r3)
                r2.currentVersionLabel = r3
                java.lang.String[] r3 = new java.lang.String[r1]
                r3[r0] = r8
                r3[r7] = r4
                java.lang.String r4 = "Modpack"
                r3[r5] = r4
                java.lang.String r3 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.m553$$Nest$smfirstNonBlank(r3)
                r2.displayTitle = r3
                r2.metadataFile = r9
                return
        }

        /* synthetic */ InstalledModpackInfo(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfoIA r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class InstalledModpackInfoIA {
    }

    public interface Listener {
        void onProgress(int r1, int r2);

        void onStatus(java.lang.String r1);
    }

    private static final class ManagedFileEntry {
        final ca.dnamobile.javalauncher.modmanager.ModManagerContentType contentType;
        final java.io.File file;
        final java.lang.String fileId;
        final java.lang.String fileName;
        final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform platform;
        final java.lang.String projectId;
        final java.lang.String relativePath;
        final java.lang.String versionId;
        final java.lang.String versionNumber;

        ManagedFileEntry(java.lang.String r1, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.io.File r9) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.m555$$Nest$smnormalizeRelativePath(r1)
                r0.relativePath = r1
                r0.contentType = r2
                r0.platform = r3
                r0.projectId = r4
                r0.versionId = r5
                r0.fileId = r6
                r0.versionNumber = r7
                r0.fileName = r8
                r0.file = r9
                return
        }
    }

    public enum Platform extends java.lang.Enum<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform CURSEFORGE = null;
        public static final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform MODRINTH = null;
        public final java.lang.String displayName;

        private static /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform[] $values() {
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform[] r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform[]{r0, r1}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform
                r1 = 0
                java.lang.String r2 = "Modrinth"
                java.lang.String r3 = "MODRINTH"
                r0.<init>(r3, r1, r2)
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH = r0
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform
                r1 = 1
                java.lang.String r2 = "CurseForge"
                java.lang.String r3 = "CURSEFORGE"
                r0.<init>(r3, r1, r2)
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE = r0
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform[] r0 = $values()
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.$VALUES = r0
                return
        }

        Platform(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.displayName = r3
                return
        }

        public static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform> r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform[] values() {
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform[] r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform[] r0 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform[]) r0
                return r0
        }
    }

    public static final class ProjectMatch {
        public final boolean exactInstalledProject;
        public final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform platform;
        public final java.lang.String projectId;
        public final java.lang.String slug;
        public final java.lang.String summary;
        public final java.lang.String title;

        private ProjectMatch(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
                r1 = this;
                r1.<init>()
                r1.platform = r2
                r1.projectId = r3
                r2 = 4
                java.lang.String[] r2 = new java.lang.String[r2]
                r0 = 0
                r2[r0] = r4
                r4 = 1
                r2[r4] = r5
                r4 = 2
                r2[r4] = r3
                r3 = 3
                java.lang.String r4 = "Modpack"
                r2[r3] = r4
                java.lang.String r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.m553$$Nest$smfirstNonBlank(r2)
                r1.title = r2
                r1.slug = r5
                r1.summary = r6
                r1.exactInstalledProject = r7
                return
        }

        /* synthetic */ ProjectMatch(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatchIA r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public java.lang.String getDisplayLabel() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r2.platform
                java.lang.String r1 = r1.displayName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " • "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.title
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class ProjectMatchIA {
    }

    public static final class UpdateCheckResult {
        public final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo installed;
        public final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo latest;
        public final boolean updateAvailable;

        private UpdateCheckResult(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.installed = r1
                r0.latest = r2
                r0.updateAvailable = r3
                return
        }

        /* synthetic */ UpdateCheckResult(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r1, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r2, boolean r3, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateCheckResultIA r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateCheckResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class UpdateCheckResultIA {
    }

    public static final class UpdateResult {
        public final int installedFiles;
        public final java.lang.String loader;
        public final java.lang.String minecraftVersion;
        public final int removedOldFiles;
        public final java.lang.String versionLabel;

        private UpdateResult(java.lang.String r7, int r8, int r9) {
                r6 = this;
                java.lang.String r4 = ""
                java.lang.String r5 = ""
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        private UpdateResult(java.lang.String r1, int r2, int r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.versionLabel = r1
                r0.installedFiles = r2
                r0.removedOldFiles = r3
                java.lang.String r1 = ""
                if (r4 != 0) goto Le
                r4 = r1
            Le:
                r0.minecraftVersion = r4
                if (r5 != 0) goto L13
                r5 = r1
            L13:
                r0.loader = r5
                return
        }

        /* synthetic */ UpdateResult(java.lang.String r1, int r2, int r3, java.lang.String r4, java.lang.String r5, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResultIA r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class UpdateResultIA {
    }

    public static final class VersionInfo {
        public final java.lang.String datePublished;
        public final java.lang.String downloadUrl;
        public final java.lang.String fileId;
        public final java.lang.String fileName;
        public final java.util.ArrayList<java.lang.String> gameVersions;
        public final java.util.ArrayList<java.lang.String> loaders;
        public final ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform platform;
        public final java.lang.String primaryLoader;
        public final java.lang.String primaryMinecraftVersion;
        public final java.lang.String projectId;
        public final java.lang.String versionId;
        public final java.lang.String versionLabel;
        public final java.lang.String versionName;
        public final java.lang.String versionNumber;

        private VersionInfo(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
                r12 = this;
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
        }

        /* synthetic */ VersionInfo(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfoIA r10) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        private VersionInfo(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.ArrayList<java.lang.String> r10, java.util.ArrayList<java.lang.String> r11) {
                r0 = this;
                r0.<init>()
                r0.platform = r1
                r0.projectId = r2
                r0.versionId = r3
                r0.fileId = r4
                r0.versionNumber = r5
                r0.versionName = r6
                r1 = 5
                java.lang.String[] r1 = new java.lang.String[r1]
                r2 = 0
                r1[r2] = r5
                r5 = 1
                r1[r5] = r6
                r5 = 2
                r1[r5] = r3
                r3 = 3
                r1[r3] = r4
                r3 = 4
                java.lang.String r4 = "Unknown"
                r1[r3] = r4
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.m553$$Nest$smfirstNonBlank(r1)
                r0.versionLabel = r1
                r0.datePublished = r7
                r0.downloadUrl = r8
                r0.fileName = r9
                if (r10 != 0) goto L36
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
            L36:
                r0.gameVersions = r10
                if (r11 != 0) goto L3f
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
            L3f:
                r0.loaders = r11
                boolean r1 = r10.isEmpty()
                java.lang.String r3 = ""
                if (r1 == 0) goto L4b
                r1 = r3
                goto L51
            L4b:
                java.lang.Object r1 = r10.get(r2)
                java.lang.String r1 = (java.lang.String) r1
            L51:
                r0.primaryMinecraftVersion = r1
                boolean r1 = r11.isEmpty()
                if (r1 == 0) goto L5a
                goto L61
            L5a:
                java.lang.Object r1 = r11.get(r2)
                r3 = r1
                java.lang.String r3 = (java.lang.String) r3
            L61:
                r0.primaryLoader = r3
                return
        }

        /* synthetic */ VersionInfo(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.ArrayList r10, java.util.ArrayList r11, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfoIA r12) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
        }

        public java.lang.String getLoadersLabel() {
                r2 = this;
                java.util.ArrayList<java.lang.String> r0 = r2.loaders
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                java.lang.String r0 = "Unknown loader"
                goto L13
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r2.loaders
                java.lang.String r1 = ", "
                java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.m554$$Nest$smjoinStrings(r0, r1)
            L13:
                return r0
        }

        public java.lang.String getMinecraftVersionsLabel() {
                r2 = this;
                java.util.ArrayList<java.lang.String> r0 = r2.gameVersions
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                java.lang.String r0 = "Unknown MC Version"
                goto L13
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r2.gameVersions
                java.lang.String r1 = ", "
                java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.m554$$Nest$smjoinStrings(r0, r1)
            L13:
                return r0
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class VersionInfoIA {
    }

    /* JADX INFO: renamed from: $r8$lambda$_sH-z_aSCQjK6FVafyUlyiC2V-c, reason: not valid java name */
    public static /* synthetic */ java.lang.String m552$r8$lambda$_sHz_aSCQjK6FVafyUlyiC2Vc(java.util.zip.ZipEntry r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smfirstNonBlank, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m553$$Nest$smfirstNonBlank(java.lang.String[] r0) {
            java.lang.String r0 = firstNonBlank(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smjoinStrings, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m554$$Nest$smjoinStrings(java.util.ArrayList r0, java.lang.String r1) {
            java.lang.String r0 = joinStrings(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smnormalizeRelativePath, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m555$$Nest$smnormalizeRelativePath(java.lang.String r0) {
            java.lang.String r0 = normalizeRelativePath(r0)
            return r0
    }

    private ModpackUpdateManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addMetadataCandidates(java.util.ArrayList<java.io.File> r4, java.io.File r5) {
            if (r5 != 0) goto L3
            return
        L3:
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".javalauncher"
            r1.<init>(r5, r2)
            java.lang.String r3 = "modpack_manifest.json"
            r0.<init>(r1, r3)
            r4.add(r0)
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            r1.<init>(r5, r2)
            java.lang.String r2 = "modpack_files_manifest.json"
            r0.<init>(r1, r2)
            r4.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "modrinth.index.json"
            r0.<init>(r5, r1)
            r4.add(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "manifest.json"
            r0.<init>(r5, r1)
            r4.add(r0)
            return
    }

    private static void addProject(java.util.Map<java.lang.String, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch> r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r3) {
            if (r3 == 0) goto L2d
            java.lang.String r0 = r3.projectId
            boolean r0 = isBlank(r0)
            if (r0 == 0) goto Lb
            goto L2d
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r3.platform
            java.lang.String r1 = r1.name()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.projectId
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.put(r0, r3)
        L2d:
            return
    }

    private static void addSearchQuery(java.util.ArrayList<java.lang.String> r2, java.lang.String r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r3 = r3.trim()
        L7:
            java.lang.String r0 = "  "
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L16
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replace(r0, r1)
            goto L7
        L16:
            int r0 = r3.length()
            r1 = 3
            if (r0 >= r1) goto L1e
            return
        L1e:
            java.lang.String r0 = "modpack"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L27
            return
        L27:
            java.util.Iterator r0 = r2.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L2b
            return
        L3e:
            r2.add(r3)
            return
    }

    private static java.util.ArrayList<java.lang.String> buildProjectSearchQueries(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r4.displayTitle
            addSearchQuery(r0, r1)
            java.lang.String r1 = r4.displayTitle
            if (r1 != 0) goto L11
            java.lang.String r4 = ""
            goto L17
        L11:
            java.lang.String r4 = r4.displayTitle
            java.lang.String r4 = r4.trim()
        L17:
            boolean r1 = isBlank(r4)
            if (r1 != 0) goto L4e
            r1 = 95
            r2 = 32
            java.lang.String r1 = r4.replace(r1, r2)
            r3 = 45
            java.lang.String r1 = r1.replace(r3, r2)
            java.lang.String r2 = "\\b(?:mc|minecraft)?\\s*1\\.\\d+(?:\\.\\d+)?\\b"
            java.lang.String r3 = " "
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.String r2 = "\\b(?:forge|fabric|neoforge|quilt)\\b"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.String r1 = r1.trim()
            addSearchQuery(r0, r1)
            int r1 = firstTitleSeparator(r4)
            if (r1 <= 0) goto L4e
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r1)
            addSearchQuery(r0, r4)
        L4e:
            return r0
    }

    public static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateCheckResult checkForUpdate(android.content.Context r2, java.io.File r3, java.io.File r4, java.lang.String r5, java.lang.String r6, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r7) throws java.lang.Exception {
            java.lang.String r0 = "Reading installed modpack metadata..."
            r7.onStatus(r0)
            r0 = 0
            r1 = 1
            r7.onProgress(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r3 = readInstalledModpackInfo(r3, r4)
            if (r3 == 0) goto L80
            java.lang.String r4 = r3.projectId
            boolean r4 = isBlank(r4)
            if (r4 == 0) goto L1d
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r2 = resolveProjectFromTitle(r2, r3, r5, r6, r7)
            goto L1e
        L1d:
            r2 = r3
        L1e:
            java.lang.String r4 = r2.projectId
            boolean r4 = isBlank(r4)
            if (r4 != 0) goto L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Checking latest "
            r3.<init>(r4)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r4 = r2.platform
            java.lang.String r4 = r4.displayName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " version..."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r7.onStatus(r3)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = r2.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r4 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            if (r3 != r4) goto L4f
            java.lang.String r3 = r2.projectId
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r3 = fetchLatestModrinthVersion(r3, r5, r6)
            goto L55
        L4f:
            java.lang.String r3 = r2.projectId
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r3 = fetchLatestCurseForgeVersion(r3, r5, r6)
        L55:
            boolean r4 = isUpdateAvailable(r2, r3)
            r7.onProgress(r1, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateCheckResult r5 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateCheckResult
            r6 = 0
            r5.<init>(r2, r3, r4, r6)
            return r5
        L63:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to determine the installed modpack project id for "
            r4.<init>(r5)
            java.lang.String r3 = r3.displayTitle
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = "."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L80:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This instance does not have modpack update metadata. Reinstall the pack from Modrinth/CurseForge or import a pack that includes DroidBridge modpack metadata."
            r2.<init>(r3)
            throw r2
    }

    private static int compareVersionStrings(java.lang.String r7, java.lang.String r8) {
            java.util.ArrayList r0 = extractComparableVersionParts(r7)
            java.util.ArrayList r1 = extractComparableVersionParts(r8)
            int r2 = r0.size()
            int r3 = r1.size()
            int r2 = java.lang.Math.max(r2, r3)
            r3 = 0
            r4 = r3
        L16:
            if (r4 >= r2) goto L46
            int r5 = r0.size()
            if (r4 >= r5) goto L29
            java.lang.Object r5 = r0.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L2a
        L29:
            r5 = r3
        L2a:
            int r6 = r1.size()
            if (r4 >= r6) goto L3b
            java.lang.Object r6 = r1.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L3c
        L3b:
            r6 = r3
        L3c:
            if (r5 == r6) goto L43
            int r7 = java.lang.Integer.compare(r5, r6)
            return r7
        L43:
            int r4 = r4 + 1
            goto L16
        L46:
            int r7 = r7.compareToIgnoreCase(r8)
            return r7
    }

    private static void copyStream(java.io.InputStream r3, java.io.OutputStream r4) throws java.io.IOException {
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

    private static int countPackWork(java.util.zip.ZipFile r2, org.json.JSONArray r3, java.lang.String r4, java.lang.String r5) {
            if (r3 != 0) goto L4
            r3 = 0
            goto L8
        L4:
            int r3 = r3.length()
        L8:
            java.lang.String r4 = normalizeZipPrefix(r4)
            java.lang.String r5 = normalizeZipPrefix(r5)
            java.util.ArrayList r2 = listZipEntries(r2)
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r2.next()
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0
            if (r0 == 0) goto L18
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L2d
            goto L18
        L2d:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = normalizeRelativePath(r0)
            boolean r1 = isBlank(r4)
            if (r1 != 0) goto L41
            boolean r1 = r0.startsWith(r4)
            if (r1 != 0) goto L4d
        L41:
            boolean r1 = isBlank(r5)
            if (r1 != 0) goto L18
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L18
        L4d:
            int r3 = r3 + 1
            goto L18
        L50:
            r2 = 1
            int r2 = java.lang.Math.max(r2, r3)
            return r2
    }

    public static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch createProjectMatch(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r8 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch
            java.lang.String r0 = ""
            if (r10 != 0) goto L8
            r2 = r0
            goto Ld
        L8:
            java.lang.String r10 = r10.trim()
            r2 = r10
        Ld:
            if (r11 != 0) goto L11
            r3 = r0
            goto L16
        L11:
            java.lang.String r10 = r11.trim()
            r3 = r10
        L16:
            if (r12 != 0) goto L1a
            r4 = r0
            goto L1f
        L1a:
            java.lang.String r10 = r12.trim()
            r4 = r10
        L1f:
            if (r13 != 0) goto L23
            r5 = r0
            goto L28
        L23:
            java.lang.String r10 = r13.trim()
            r5 = r10
        L28:
            r7 = 0
            r0 = r8
            r1 = r9
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private static int curseForgeModLoaderType(java.lang.String r1) {
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

    private static int deleteDirectoryTree(java.io.File r5) throws java.io.IOException {
            boolean r0 = r5.exists()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L24
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L25
            int r2 = r0.length
            r3 = r1
        L16:
            if (r1 >= r2) goto L22
            r4 = r0[r1]
            int r4 = deleteDirectoryTree(r4)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L16
        L22:
            r1 = r3
            goto L25
        L24:
            r1 = 1
        L25:
            boolean r0 = r5.delete()
            if (r0 != 0) goto L4b
            boolean r0 = r5.exists()
            if (r0 != 0) goto L32
            goto L4b
        L32:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L4b:
            return r1
    }

    private static boolean deleteIfFile(java.io.File r1) {
            boolean r0 = r1.isFile()
            if (r0 == 0) goto Le
            boolean r1 = r1.delete()
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static void downloadToFile(java.lang.String r5, java.io.File r6, java.lang.String r7) throws java.io.IOException {
            java.lang.String r5 = r5.trim()
            boolean r0 = isBlank(r5)
            if (r0 != 0) goto Lee
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto L36
            boolean r1 = r0.exists()
            if (r1 != 0) goto L36
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L1d
            goto L36
        L1d:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unable to create folder: "
            r6.<init>(r7)
            java.lang.String r7 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L36:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r5)
            java.net.URLConnection r5 = r0.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            r0 = 20000(0x4e20, float:2.8026E-41)
            r5.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r5.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "DroidBridgeLauncher"
            r5.setRequestProperty(r0, r1)
            boolean r0 = isBlank(r7)
            if (r0 != 0) goto L61
            java.lang.String r0 = "x-api-key"
            java.lang.String r7 = r7.trim()
            r5.setRequestProperty(r0, r7)
        L61:
            int r7 = r5.getResponseCode()
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 < r1) goto L72
            if (r7 >= r0) goto L72
            java.io.InputStream r2 = r5.getInputStream()
            goto L76
        L72:
            java.io.InputStream r2 = r5.getErrorStream()
        L76:
            java.lang.String r3 = "HTTP "
            if (r2 == 0) goto Ld8
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc7
            r4.<init>(r6)     // Catch: java.lang.Throwable -> Lc7
            if (r7 < r1) goto L92
            if (r7 >= r0) goto L92
            copyStream(r2, r4)     // Catch: java.lang.Throwable -> Lbd
            r4.close()     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto L8e
            r2.close()     // Catch: java.lang.Throwable -> Ld3
        L8e:
            r5.disconnect()
            return
        L92:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lbd
            r6.<init>()     // Catch: java.lang.Throwable -> Lbd
            copyStream(r2, r6)     // Catch: java.lang.Throwable -> Lbd
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r7 = r1.append(r7)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = ": "
            java.lang.StringBuilder r7 = r7.append(r1)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = "UTF-8"
            java.lang.String r6 = r6.toString(r1)     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Lbd
            throw r0     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r6 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lc6
        Lc2:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> Lc7
        Lc6:
            throw r6     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r6 = move-exception
            if (r2 == 0) goto Ld2
            r2.close()     // Catch: java.lang.Throwable -> Lce
            goto Ld2
        Lce:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> Ld3
        Ld2:
            throw r6     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r6 = move-exception
            r5.disconnect()
            throw r6
        Ld8:
            r5.disconnect()
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lee:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Missing download URL."
            r5.<init>(r6)
            throw r5
    }

    private static java.lang.String escapeFacetValue(java.lang.String r2) {
            java.lang.String r0 = "\\"
            java.lang.String r1 = "\\\\"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "\""
            java.lang.String r1 = "\\\""
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private static java.util.ArrayList<java.lang.Integer> extractComparableVersionParts(java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r1)
            java.lang.String r1 = "[^0-9.\\-+]"
            java.lang.String r2 = " "
            java.lang.String r5 = r5.replaceAll(r1, r2)
            java.lang.String r1 = "[.\\-+ ]+"
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L3b
            r3 = r5[r2]
            java.lang.String r4 = r3.trim()     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L38
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L38
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L38
            r0.add(r3)     // Catch: java.lang.Throwable -> L38
        L38:
            int r2 = r2 + 1
            goto L1b
        L3b:
            return r0
    }

    private static int extractOverrides(java.util.zip.ZipFile r20, java.io.File r21, java.lang.String r22, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r23, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ManagedFileEntry> r24, java.util.Set<java.lang.String> r25, java.util.Map<java.lang.String, java.lang.String> r26, int r27, int r28, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r29) throws java.lang.Exception {
            r0 = r23
            r1 = r29
            java.lang.String r2 = normalizeZipPrefix(r22)
            boolean r3 = isBlank(r2)
            if (r3 == 0) goto Lf
            return r27
        Lf:
            java.util.ArrayList r3 = listZipEntries(r20)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda1 r4 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda1
            r4.<init>()
            java.util.Comparator r5 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.util.Comparator r4 = java.util.Comparator.comparing(r4, r5)
            r3.sort(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = r27
        L27:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L140
            java.lang.Object r5 = r3.next()
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5
            if (r5 == 0) goto L12c
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L3d
            goto L12c
        L3d:
            java.lang.String r6 = r5.getName()
            java.lang.String r6 = normalizeRelativePath(r6)
            boolean r7 = r6.startsWith(r2)
            if (r7 != 0) goto L4d
            goto L12c
        L4d:
            int r7 = r2.length()
            java.lang.String r6 = r6.substring(r7)
            java.lang.String r6 = normalizeRelativePath(r6)
            boolean r7 = isBlank(r6)
            if (r7 == 0) goto L61
            goto L12c
        L61:
            r7 = r21
            r8 = r26
            java.io.File r15 = resolveOverrideTarget(r7, r6, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Extracting "
            r9.<init>(r10)
            java.lang.String r10 = r15.getName()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = "..."
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r1.onStatus(r9)
            java.io.File r9 = r15.getParentFile()
            if (r9 == 0) goto Lb1
            boolean r10 = r9.exists()
            if (r10 != 0) goto Lb1
            boolean r10 = r9.mkdirs()
            if (r10 == 0) goto L98
            goto Lb1
        L98:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create folder: "
            r1.<init>(r2)
            java.lang.String r2 = r9.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb1:
            r14 = r20
            java.io.InputStream r5 = r14.getInputStream(r5)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L11e
            r9.<init>(r15)     // Catch: java.lang.Throwable -> L11e
            copyStream(r5, r9)     // Catch: java.lang.Throwable -> L112
            r9.close()     // Catch: java.lang.Throwable -> L11e
            if (r5 == 0) goto Lc7
            r5.close()
        Lc7:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r11 = resolveContentType(r6)
            if (r11 == 0) goto Lfd
            java.lang.String r10 = normalizeRelativePath(r6)
            r6 = r25
            r6.add(r10)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ManagedFileEntry r5 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ManagedFileEntry
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r12 = r0.platform
            java.lang.String r13 = r0.projectId
            java.lang.String r9 = r0.versionId
            r22 = r2
            java.lang.String r2 = r0.fileId
            r19 = r3
            java.lang.String r3 = r0.versionNumber
            java.lang.String r17 = r15.getName()
            r16 = r9
            r9 = r5
            r14 = r16
            r18 = r15
            r15 = r2
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r24
            r2.add(r5)
            goto L105
        Lfd:
            r6 = r25
            r22 = r2
            r19 = r3
            r2 = r24
        L105:
            int r4 = r4 + 1
            r3 = 1
            r9 = r28
            int r3 = java.lang.Math.max(r3, r9)
            r1.onProgress(r4, r3)
            goto L13a
        L112:
            r0 = move-exception
            r1 = r0
            r9.close()     // Catch: java.lang.Throwable -> L118
            goto L11d
        L118:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L11e
        L11d:
            throw r1     // Catch: java.lang.Throwable -> L11e
        L11e:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L12b
            r5.close()     // Catch: java.lang.Throwable -> L126
            goto L12b
        L126:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L12b:
            throw r1
        L12c:
            r7 = r21
            r6 = r25
            r8 = r26
            r9 = r28
            r22 = r2
            r19 = r3
            r2 = r24
        L13a:
            r2 = r22
            r3 = r19
            goto L27
        L140:
            return r4
    }

    private static java.lang.String fetchCurseForgeFileDownloadUrl(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.curseforge.com/v1/mods/"
            r0.<init>(r1)
            java.lang.String r2 = android.net.Uri.encode(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "/files/"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = android.net.Uri.encode(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/download-url"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = readNetworkText(r2, r4)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "\""
            boolean r4 = r2.startsWith(r3)
            if (r4 == 0) goto L56
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L56
            int r3 = r2.length()
            r4 = 2
            if (r3 < r4) goto L56
            int r3 = r2.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r2 = r2.substring(r4, r3)
            java.lang.String r3 = "\\/"
            java.lang.String r4 = "/"
            java.lang.String r2 = r2.replace(r3, r4)
        L56:
            return r2
    }

    private static org.json.JSONObject fetchCurseForgeFileInfo(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.curseforge.com/v1/mods/"
            r0.<init>(r1)
            java.lang.String r2 = android.net.Uri.encode(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "/files/"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = android.net.Uri.encode(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = readNetworkText(r2, r4)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
            java.lang.String r2 = "data"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L33
            return r2
        L33:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "CurseForge file info did not include data."
            r2.<init>(r3)
            throw r2
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch fetchCurseForgeProject(java.lang.String r13, boolean r14) {
            java.lang.String r0 = "slug"
            java.lang.String r1 = ""
            java.lang.String r2 = "https://api.curseforge.com/v1/mods/"
            r3 = 0
            java.lang.String r4 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()     // Catch: java.lang.Throwable -> L7d
            boolean r5 = isBlank(r4)     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L12
            return r3
        L12:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = android.net.Uri.encode(r13)     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = readNetworkText(r2, r4)     // Catch: java.lang.Throwable -> L7d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "data"
            org.json.JSONObject r2 = r4.optJSONObject(r2)     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L35
            return r3
        L35:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r12 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch     // Catch: java.lang.Throwable -> L7d
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r5 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "id"
            r6 = 0
            long r6 = r2.optLong(r4, r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L7d
            r4 = 2
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = "name"
            java.lang.String r8 = r2.optString(r8, r1)     // Catch: java.lang.Throwable -> L7d
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = r2.optString(r0, r1)     // Catch: java.lang.Throwable -> L7d
            r10 = 1
            r7[r10] = r8     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = firstNonBlank(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = r2.optString(r0, r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "summary"
            java.lang.String r4 = r2.optString(r4, r1)     // Catch: java.lang.Throwable -> L7d
            r0[r9] = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "description"
            java.lang.String r1 = r2.optString(r4, r1)     // Catch: java.lang.Throwable -> L7d
            r0[r10] = r1     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = firstNonBlank(r0)     // Catch: java.lang.Throwable -> L7d
            r11 = 0
            r4 = r12
            r10 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7d
            return r12
        L7d:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to fetch CurseForge project "
            r0.<init>(r1)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r14 = readableError(r14)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "ModpackUpdateManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r14, r13)
            return r3
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo fetchLatestCurseForgeVersion(java.lang.String r17, java.lang.String r18, java.lang.String r19) throws java.lang.Exception {
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L116
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.curseforge.com/v1/mods/"
            r1.<init>(r2)
            java.lang.String r2 = android.net.Uri.encode(r17)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/files?pageSize=50&sortField=2&sortOrder=desc"
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = isBlank(r18)
            if (r2 != 0) goto L32
            java.lang.String r2 = "&gameVersion="
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r3 = android.net.Uri.encode(r18)
            r2.append(r3)
        L32:
            int r2 = curseForgeModLoaderType(r19)
            if (r2 <= 0) goto L41
            java.lang.String r3 = "&modLoaderType="
            java.lang.StringBuilder r3 = r1.append(r3)
            r3.append(r2)
        L41:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = readNetworkText(r1, r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "data"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto Lf9
            int r1 = r0.length()
            if (r1 == 0) goto Lf9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        L63:
            int r4 = r0.length()
            r5 = 1
            if (r3 >= r4) goto L80
            org.json.JSONObject r4 = r0.optJSONObject(r3)
            if (r4 != 0) goto L71
            goto L7d
        L71:
            java.lang.String r6 = "isAvailable"
            int r5 = r4.optInt(r6, r5)
            if (r5 != 0) goto L7a
            goto L7d
        L7a:
            r1.add(r4)
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf1
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.Collections.sort(r1, r0)
            java.lang.Object r0 = r1.get(r2)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "fileId"
            r3 = 0
            long r3 = r0.optLong(r1, r3)
            java.lang.String r1 = "id"
            long r3 = r0.optLong(r1, r3)
            java.lang.String r10 = java.lang.String.valueOf(r3)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r1 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r7 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r6 = "displayName"
            java.lang.String r8 = ""
            java.lang.String r9 = r0.optString(r6, r8)
            r4[r2] = r9
            java.lang.String r9 = "fileName"
            java.lang.String r11 = r0.optString(r9, r8)
            r4[r5] = r11
            java.lang.String r11 = firstNonBlank(r4)
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = r0.optString(r9, r8)
            r3[r2] = r4
            java.lang.String r2 = r0.optString(r6, r8)
            r3[r5] = r2
            java.lang.String r12 = firstNonBlank(r3)
            java.lang.String r2 = "fileDate"
            java.lang.String r13 = r0.optString(r2, r8)
            java.lang.String r2 = "downloadUrl"
            java.lang.String r14 = r0.optString(r2, r8)
            java.lang.String r2 = "modpack.zip"
            java.lang.String r15 = r0.optString(r9, r2)
            r16 = 0
            r6 = r1
            r8 = r17
            r9 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        Lf1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No available CurseForge modpack file found."
            r0.<init>(r1)
            throw r0
        Lf9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No compatible CurseForge modpack file found for Minecraft "
            r1.<init>(r2)
            r2 = r18
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L116:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CurseForge API key is not configured."
            r0.<init>(r1)
            throw r0
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo fetchLatestModrinthVersion(java.lang.String r16, java.lang.String r17, java.lang.String r18) throws java.lang.Exception {
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.modrinth.com/v2/project/"
            r1.<init>(r2)
            java.lang.String r2 = android.net.Uri.encode(r16)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/version"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r1 = readNetworkText(r1, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r3 = normalizeLoader(r18)
            r4 = 0
            r5 = r4
        L30:
            int r6 = r2.length()
            if (r5 >= r6) goto L73
            org.json.JSONObject r6 = r2.optJSONObject(r5)
            if (r6 != 0) goto L3d
            goto L70
        L3d:
            java.lang.String r7 = "game_versions"
            org.json.JSONArray r7 = r6.optJSONArray(r7)
            boolean r7 = jsonArrayContainsIgnoreCase(r7, r0)
            if (r7 != 0) goto L4a
            goto L70
        L4a:
            boolean r7 = isBlank(r3)
            if (r7 != 0) goto L6d
            java.lang.String r7 = "vanilla"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L6d
            java.lang.String r7 = "loaders"
            org.json.JSONArray r7 = r6.optJSONArray(r7)
            if (r7 == 0) goto L6d
            int r8 = r7.length()
            if (r8 <= 0) goto L6d
            boolean r7 = jsonArrayContainsIgnoreCase(r7, r3)
            if (r7 != 0) goto L6d
            goto L70
        L6d:
            r1.add(r6)
        L70:
            int r5 = r5 + 1
            goto L30
        L73:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Le5
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda4 r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda4
            r0.<init>()
            java.util.Collections.sort(r1, r0)
            java.lang.Object r0 = r1.get(r4)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "files"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            org.json.JSONObject r1 = findPrimaryModrinthFile(r1)
            if (r1 == 0) goto Ldd
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r2 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r6 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            java.lang.String r3 = "id"
            java.lang.String r5 = ""
            java.lang.String r8 = r0.optString(r3, r5)
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r7 = "hashes"
            java.lang.String r7 = r1.optString(r7, r5)
            r3[r4] = r7
            java.lang.String r4 = "filename"
            java.lang.String r7 = r1.optString(r4, r5)
            r9 = 1
            r3[r9] = r7
            java.lang.String r9 = firstNonBlank(r3)
            java.lang.String r3 = "version_number"
            java.lang.String r10 = r0.optString(r3, r5)
            java.lang.String r3 = "name"
            java.lang.String r11 = r0.optString(r3, r5)
            java.lang.String r3 = "date_published"
            java.lang.String r12 = r0.optString(r3, r5)
            java.lang.String r0 = "url"
            java.lang.String r13 = r1.optString(r0, r5)
            java.lang.String r0 = "modpack.mrpack"
            java.lang.String r14 = r1.optString(r4, r0)
            r15 = 0
            r5 = r2
            r7 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        Ldd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Latest Modrinth version has no downloadable file."
            r0.<init>(r1)
            throw r0
        Le5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No compatible Modrinth modpack version found for Minecraft "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch fetchModrinthProject(java.lang.String r13, boolean r14) {
            java.lang.String r0 = "slug"
            java.lang.String r1 = ""
            java.lang.String r2 = "https://api.modrinth.com/v2/project/"
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = android.net.Uri.encode(r13)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = readNetworkText(r2, r3)     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L70
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r2 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch     // Catch: java.lang.Throwable -> L70
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r6 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH     // Catch: java.lang.Throwable -> L70
            r5 = 2
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "id"
            java.lang.String r8 = r4.optString(r8, r1)     // Catch: java.lang.Throwable -> L70
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L70
            r8 = 1
            r7[r8] = r13     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = firstNonBlank(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String[] r10 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L70
            java.lang.String r11 = "title"
            java.lang.String r11 = r4.optString(r11, r1)     // Catch: java.lang.Throwable -> L70
            r10[r9] = r11     // Catch: java.lang.Throwable -> L70
            java.lang.String r11 = r4.optString(r0, r1)     // Catch: java.lang.Throwable -> L70
            r10[r8] = r11     // Catch: java.lang.Throwable -> L70
            java.lang.String r10 = firstNonBlank(r10)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r4.optString(r0, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L70
            java.lang.String r11 = "description"
            java.lang.String r11 = r4.optString(r11, r1)     // Catch: java.lang.Throwable -> L70
            r5[r9] = r11     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = "body"
            java.lang.String r1 = r4.optString(r9, r1)     // Catch: java.lang.Throwable -> L70
            r5[r8] = r1     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = firstNonBlank(r5)     // Catch: java.lang.Throwable -> L70
            r12 = 0
            r5 = r2
            r8 = r10
            r9 = r0
            r10 = r1
            r11 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L70
            return r2
        L70:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to fetch Modrinth project "
            r0.<init>(r1)
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r14 = readableError(r14)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "ModpackUpdateManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r14, r13)
            return r3
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch fetchModrinthProjectFromVersion(java.lang.String r4, boolean r5) {
            java.lang.String r0 = "https://api.modrinth.com/v2/version/"
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = android.net.Uri.encode(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = readNetworkText(r0, r1)     // Catch: java.lang.Throwable -> L31
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L31
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "project_id"
            java.lang.String r3 = ""
            java.lang.String r0 = r2.optString(r0, r3)     // Catch: java.lang.Throwable -> L31
            boolean r2 = isBlank(r0)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L2c
            return r1
        L2c:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r4 = fetchModrinthProject(r0, r5)     // Catch: java.lang.Throwable -> L31
            return r4
        L31:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve Modrinth project from version "
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = readableError(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ModpackUpdateManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r4)
            return r1
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch> findMatchingProjects(android.content.Context r7, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r8, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r9) throws java.lang.Exception {
            java.lang.String r7 = "Finding matching modpack projects..."
            r9.onStatus(r7)
            r7 = 2
            r0 = 0
            r9.onProgress(r0, r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r1 = r8.projectId
            boolean r1 = isBlank(r1)
            r2 = 1
            if (r1 != 0) goto L31
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r8.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            if (r1 != r3) goto L28
            java.lang.String r1 = r8.projectId
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r1 = fetchModrinthProject(r1, r2)
            addProject(r7, r1)
            goto L31
        L28:
            java.lang.String r1 = r8.projectId
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r1 = fetchCurseForgeProject(r1, r2)
            addProject(r7, r1)
        L31:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r8.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            if (r1 != r3) goto L50
            java.lang.String r1 = r8.projectId
            boolean r1 = isBlank(r1)
            if (r1 == 0) goto L50
            java.lang.String r1 = r8.currentVersionId
            boolean r1 = isBlank(r1)
            if (r1 != 0) goto L50
            java.lang.String r1 = r8.currentVersionId
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r1 = fetchModrinthProjectFromVersion(r1, r2)
            addProject(r7, r1)
        L50:
            java.util.ArrayList r8 = buildProjectSearchQueries(r8)
            int r1 = r8.size()
            int r1 = java.lang.Math.max(r2, r1)
            java.util.Iterator r8 = r8.iterator()
        L60:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lcf
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Searching Modrinth for "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r5 = "..."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r9.onStatus(r4)
            java.util.ArrayList r4 = searchModrinthProjects(r3)
            java.util.Iterator r4 = r4.iterator()
        L8c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L9c
            java.lang.Object r6 = r4.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r6 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch) r6
            addProject(r7, r6)
            goto L8c
        L9c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Searching CurseForge for "
            r4.<init>(r6)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r9.onStatus(r4)
            java.util.ArrayList r3 = searchCurseForgeProjects(r3)
            java.util.Iterator r3 = r3.iterator()
        Lba:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r4 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch) r4
            addProject(r7, r4)
            goto Lba
        Lca:
            int r0 = r0 + r2
            r9.onProgress(r0, r1)
            goto L60
        Lcf:
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.Collection r7 = r7.values()
            r8.<init>(r7)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda2 r7 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda2
            r7.<init>()
            java.util.Collections.sort(r8, r7)
            return r8
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch> findMatchingProjects(android.content.Context r0, java.io.File r1, java.io.File r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r3) throws java.lang.Exception {
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r1 = readInstalledModpackInfo(r1, r2)
            if (r1 == 0) goto Lb
            java.util.ArrayList r0 = findMatchingProjects(r0, r1, r3)
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This instance does not have modpack metadata. Install or import the pack from Modrinth/CurseForge first."
            r0.<init>(r1)
            throw r0
    }

    private static org.json.JSONObject findPrimaryModrinthFile(org.json.JSONArray r5) {
            if (r5 == 0) goto L28
            int r0 = r5.length()
            if (r0 != 0) goto L9
            goto L28
        L9:
            r0 = 0
            org.json.JSONObject r1 = r5.optJSONObject(r0)
            r2 = r0
        Lf:
            int r3 = r5.length()
            if (r2 >= r3) goto L27
            org.json.JSONObject r3 = r5.optJSONObject(r2)
            if (r3 == 0) goto L24
            java.lang.String r4 = "primary"
            boolean r4 = r3.optBoolean(r4, r0)
            if (r4 == 0) goto L24
            return r3
        L24:
            int r2 = r2 + 1
            goto Lf
        L27:
            return r1
        L28:
            r5 = 0
            return r5
    }

    private static java.lang.String firstNonBlank(java.lang.String... r5) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L24
            r3 = r5[r2]
            if (r3 != 0) goto Le
            goto L21
        Le:
            java.lang.String r3 = r3.trim()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L21
            java.lang.String r4 = "null"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L7
        L24:
            return r0
    }

    private static org.json.JSONObject firstObject(org.json.JSONObject r3, java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto Ld
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r3 = 0
            return r3
    }

    private static int firstTitleSeparator(java.lang.String r5) {
            r0 = 3
            char[] r1 = new char[r0]
            r1 = {x001c: FILL_ARRAY_DATA , data: [124, 58, 91} // fill-array
            r2 = -1
            r3 = 0
        L8:
            if (r3 >= r0) goto L1a
            char r4 = r1[r3]
            int r4 = r5.indexOf(r4)
            if (r4 <= 0) goto L17
            if (r2 < 0) goto L16
            if (r4 >= r2) goto L17
        L16:
            r2 = r4
        L17:
            int r3 = r3 + 1
            goto L8
        L1a:
            return r2
    }

    private static java.io.File getFilesManifestFile(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".javalauncher"
            r1.<init>(r3, r2)
            java.lang.String r3 = "modpack_files_manifest.json"
            r0.<init>(r1, r3)
            return r0
    }

    private static java.io.File getInstalledMetadataFile(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".javalauncher"
            r1.<init>(r3, r2)
            java.lang.String r3 = "modpack_manifest.json"
            r0.<init>(r1, r3)
            return r0
    }

    private static java.util.ArrayList<java.io.File> getMetadataCandidates(java.io.File r2, java.io.File r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            addMetadataCandidates(r0, r3)
            addMetadataCandidates(r0, r2)
            if (r2 == 0) goto L29
            if (r3 == 0) goto L29
            boolean r3 = sameFile(r2, r3)
            if (r3 != 0) goto L29
            java.io.File r3 = new java.io.File
            java.lang.String r1 = "game"
            r3.<init>(r2, r1)
            addMetadataCandidates(r0, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r1 = ".minecraft"
            r3.<init>(r2, r1)
            addMetadataCandidates(r0, r3)
        L29:
            return r0
    }

    private static java.lang.String getTargetFolderName(ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1) {
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            if (r1 != r0) goto L7
            java.lang.String r1 = "resourcepacks"
            return r1
        L7:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            if (r1 != r0) goto Le
            java.lang.String r1 = "shaderpacks"
            return r1
        Le:
            java.lang.String r1 = "mods"
            return r1
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult installCurseForgePack(java.io.File r35, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r36, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r37, java.io.File r38, java.lang.String r39, java.lang.String r40, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r41) throws java.lang.Exception {
            r0 = r35
            r11 = r37
            r12 = r39
            r13 = r40
            r10 = r41
            java.lang.String r1 = "overrides"
            java.lang.String r2 = ""
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r3 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r4 = isBlank(r3)
            if (r4 != 0) goto L1f8
            java.util.zip.ZipFile r9 = new java.util.zip.ZipFile
            r4 = r38
            r9.<init>(r4)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r5 = "manifest.json"
            java.lang.String r5 = readZipEntryText(r9, r5)     // Catch: java.lang.Throwable -> L1eb
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r5 = "files"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch: java.lang.Throwable -> L1eb
            r6 = 2
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r4 = r4.optString(r1, r2)     // Catch: java.lang.Throwable -> L1eb
            r16 = 0
            r8[r16] = r4     // Catch: java.lang.Throwable -> L1eb
            r4 = 1
            r8[r4] = r1     // Catch: java.lang.Throwable -> L1eb
            java.lang.String r8 = firstNonBlank(r8)     // Catch: java.lang.Throwable -> L1eb
            r1 = 0
            int r1 = countPackWork(r9, r5, r8, r1)     // Catch: java.lang.Throwable -> L1eb
            int r17 = resetModpackContentFolders(r0, r10)     // Catch: java.lang.Throwable -> L1eb
            if (r5 == 0) goto L19b
            r6 = r16
            r18 = r6
            r19 = r18
        L62:
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L197
            if (r6 >= r4) goto L18d
            org.json.JSONObject r4 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L197
            if (r4 != 0) goto L79
            r34 = r2
            r21 = r5
        L72:
            r22 = r7
            r38 = r8
            r4 = 1
            goto L17d
        L79:
            r21 = r5
            r5 = 3
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L197
            java.lang.String r22 = "projectID"
            r12[r16] = r22     // Catch: java.lang.Throwable -> L197
            java.lang.String r22 = "projectId"
            r20 = 1
            r12[r20] = r22     // Catch: java.lang.Throwable -> L197
            java.lang.String r22 = "project_id"
            r23 = 2
            r12[r23] = r22     // Catch: java.lang.Throwable -> L197
            java.lang.String r12 = readString(r4, r12)     // Catch: java.lang.Throwable -> L197
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L197
            java.lang.String r22 = "fileID"
            r5[r16] = r22     // Catch: java.lang.Throwable -> L197
            java.lang.String r22 = "fileId"
            r20 = 1
            r5[r20] = r22     // Catch: java.lang.Throwable -> L197
            java.lang.String r22 = "file_id"
            r23 = 2
            r5[r23] = r22     // Catch: java.lang.Throwable -> L197
            java.lang.String r4 = readString(r4, r5)     // Catch: java.lang.Throwable -> L197
            boolean r5 = isBlank(r12)     // Catch: java.lang.Throwable -> L197
            if (r5 != 0) goto L179
            boolean r5 = isBlank(r4)     // Catch: java.lang.Throwable -> L197
            if (r5 == 0) goto Lb6
            goto L179
        Lb6:
            org.json.JSONObject r5 = fetchCurseForgeFileInfo(r12, r4, r3)     // Catch: java.lang.Throwable -> L197
            java.lang.String r13 = "downloadUrl"
            java.lang.String r13 = r5.optString(r13, r2)     // Catch: java.lang.Throwable -> L197
            boolean r22 = isBlank(r13)     // Catch: java.lang.Throwable -> L197
            if (r22 == 0) goto Lca
            java.lang.String r13 = fetchCurseForgeFileDownloadUrl(r12, r4, r3)     // Catch: java.lang.Throwable -> L197
        Lca:
            r22 = r7
            r38 = r8
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L197
            java.lang.String r7 = "fileName"
            java.lang.String r5 = r5.optString(r7, r2)     // Catch: java.lang.Throwable -> L197
            r8[r16] = r5     // Catch: java.lang.Throwable -> L197
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L197
            r5.<init>()     // Catch: java.lang.Throwable -> L197
            java.lang.String r7 = "curseforge-"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L197
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch: java.lang.Throwable -> L197
            java.lang.String r7 = ".jar"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch: java.lang.Throwable -> L197
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L197
            r7 = 1
            r8[r7] = r5     // Catch: java.lang.Throwable -> L197
            java.lang.String r5 = firstNonBlank(r8)     // Catch: java.lang.Throwable -> L197
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r26 = resolveCurseForgeContentType(r12, r5, r3)     // Catch: java.lang.Throwable -> L197
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L197
            r7.<init>()     // Catch: java.lang.Throwable -> L197
            java.lang.String r8 = getTargetFolderName(r26)     // Catch: java.lang.Throwable -> L197
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L197
            java.lang.String r8 = "/"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L197
            java.lang.String r5 = sanitizeFileName(r5)     // Catch: java.lang.Throwable -> L197
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Throwable -> L197
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L197
            java.lang.String r5 = normalizeRelativePath(r5)     // Catch: java.lang.Throwable -> L197
            java.io.File r7 = resolveSafeChild(r0, r5)     // Catch: java.lang.Throwable -> L197
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L197
            r8.<init>()     // Catch: java.lang.Throwable -> L197
            r34 = r2
            java.lang.String r2 = "Downloading "
            java.lang.StringBuilder r2 = r8.append(r2)     // Catch: java.lang.Throwable -> L197
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L197
            java.lang.StringBuilder r2 = r2.append(r8)     // Catch: java.lang.Throwable -> L197
            java.lang.String r8 = "..."
            java.lang.StringBuilder r2 = r2.append(r8)     // Catch: java.lang.Throwable -> L197
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L197
            r10.onStatus(r2)     // Catch: java.lang.Throwable -> L197
            downloadToFile(r13, r7, r3)     // Catch: java.lang.Throwable -> L197
            int r18 = r18 + 1
            r15.add(r5)     // Catch: java.lang.Throwable -> L197
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ManagedFileEntry r2 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ManagedFileEntry     // Catch: java.lang.Throwable -> L197
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r27 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE     // Catch: java.lang.Throwable -> L197
            java.lang.String r8 = r11.versionNumber     // Catch: java.lang.Throwable -> L197
            java.lang.String r32 = r7.getName()     // Catch: java.lang.Throwable -> L197
            r24 = r2
            r25 = r5
            r28 = r12
            r29 = r4
            r30 = r4
            r31 = r8
            r33 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L197
            r14.add(r2)     // Catch: java.lang.Throwable -> L197
            int r2 = r19 + 1
            r4 = 1
            int r5 = java.lang.Math.max(r4, r1)     // Catch: java.lang.Throwable -> L197
            r10.onProgress(r2, r5)     // Catch: java.lang.Throwable -> L197
            r19 = r2
            goto L17d
        L179:
            r34 = r2
            goto L72
        L17d:
            int r6 = r6 + 1
            r8 = r38
            r12 = r39
            r13 = r40
            r5 = r21
            r7 = r22
            r2 = r34
            goto L62
        L18d:
            r22 = r7
            r38 = r8
            r12 = r1
            r16 = r18
            r8 = r19
            goto L1a2
        L197:
            r0 = move-exception
            r1 = r0
            r13 = r9
            goto L1ee
        L19b:
            r22 = r7
            r38 = r8
            r12 = r1
            r8 = r16
        L1a2:
            r1 = r9
            r2 = r35
            r3 = r38
            r4 = r37
            r5 = r14
            r6 = r15
            r7 = r22
            r13 = r9
            r9 = r12
            r10 = r41
            extractOverrides(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1e9
            r13.close()
            int r1 = pruneOldManagedContent(r0, r15)
            int r7 = r17 + r1
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r14
            r5 = r39
            r6 = r40
            writeFilesManifest(r1, r2, r3, r4, r5, r6)
            r1 = r36
            r2 = r39
            r3 = r40
            writeInstalledModpackManifest(r0, r1, r11, r2, r3)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r8 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult
            java.lang.String r1 = r11.versionLabel
            java.lang.String r4 = preferredMinecraftVersion(r11, r2)
            java.lang.String r5 = preferredLoader(r11, r3)
            r6 = 0
            r0 = r8
            r2 = r16
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        L1e9:
            r0 = move-exception
            goto L1ed
        L1eb:
            r0 = move-exception
            r13 = r9
        L1ed:
            r1 = r0
        L1ee:
            r13.close()     // Catch: java.lang.Throwable -> L1f2
            goto L1f7
        L1f2:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L1f7:
            throw r1
        L1f8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CurseForge API key is not configured."
            r0.<init>(r1)
            throw r0
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult installModrinthPack(java.io.File r31, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r32, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r33, java.io.File r34, java.lang.String r35, java.lang.String r36, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r37) throws java.lang.Exception {
            r0 = r31
            r11 = r33
            r12 = r35
            r13 = r36
            r14 = r37
            java.lang.String r1 = ""
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.LinkedHashMap r16 = new java.util.LinkedHashMap
            r16.<init>()
            java.util.zip.ZipFile r9 = new java.util.zip.ZipFile
            r2 = r34
            r9.<init>(r2)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L18e
            java.lang.String r3 = "modrinth.index.json"
            java.lang.String r3 = readZipEntryText(r9, r3)     // Catch: java.lang.Throwable -> L18e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L18e
            java.lang.String r3 = "files"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch: java.lang.Throwable -> L18e
            java.lang.String r3 = "overrides"
            java.lang.String r4 = "client-overrides"
            int r8 = countPackWork(r9, r2, r3, r4)     // Catch: java.lang.Throwable -> L18e
            int r17 = resetModpackContentFolders(r0, r14)     // Catch: java.lang.Throwable -> L18e
            if (r2 == 0) goto L11e
            r4 = 0
            r5 = 0
            r6 = 0
        L44:
            int r7 = r2.length()     // Catch: java.lang.Throwable -> L119
            if (r4 >= r7) goto L115
            org.json.JSONObject r7 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> L119
            if (r7 != 0) goto L58
            r29 = r1
            r28 = r2
        L54:
            r30 = 0
            goto L109
        L58:
            java.lang.String r3 = "path"
            java.lang.String r3 = r7.optString(r3, r1)     // Catch: java.lang.Throwable -> L119
            java.lang.String r3 = normalizeRelativePath(r3)     // Catch: java.lang.Throwable -> L119
            r28 = r2
            java.lang.String r2 = "downloads"
            org.json.JSONArray r2 = r7.optJSONArray(r2)     // Catch: java.lang.Throwable -> L119
            if (r2 == 0) goto L78
            int r18 = r2.length()     // Catch: java.lang.Throwable -> L119
            if (r18 <= 0) goto L78
            r12 = 0
            java.lang.String r2 = r2.optString(r12, r1)     // Catch: java.lang.Throwable -> L119
            goto L79
        L78:
            r2 = r1
        L79:
            boolean r12 = isBlank(r3)     // Catch: java.lang.Throwable -> L119
            if (r12 != 0) goto L105
            boolean r12 = isBlank(r2)     // Catch: java.lang.Throwable -> L119
            if (r12 == 0) goto L87
            goto L105
        L87:
            java.io.File r12 = resolveSafeChild(r0, r3)     // Catch: java.lang.Throwable -> L119
            r29 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L119
            r1.<init>()     // Catch: java.lang.Throwable -> L119
            java.lang.String r13 = "Downloading "
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch: java.lang.Throwable -> L119
            java.lang.String r13 = r12.getName()     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch: java.lang.Throwable -> L119
            java.lang.String r13 = "..."
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch: java.lang.Throwable -> L119
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L119
            r14.onStatus(r1)     // Catch: java.lang.Throwable -> L119
            r1 = 0
            downloadToFile(r2, r12, r1)     // Catch: java.lang.Throwable -> L119
            int r6 = r6 + 1
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r20 = resolveContentType(r3)     // Catch: java.lang.Throwable -> L119
            r1 = 1
            if (r20 == 0) goto Lf9
            java.lang.String r2 = normalizeRelativePath(r3)     // Catch: java.lang.Throwable -> L119
            r10.add(r2)     // Catch: java.lang.Throwable -> L119
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ManagedFileEntry r2 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ManagedFileEntry     // Catch: java.lang.Throwable -> L119
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r21 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH     // Catch: java.lang.Throwable -> L119
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L119
            java.lang.String r18 = "projectId"
            r30 = 0
            r13[r30] = r18     // Catch: java.lang.Throwable -> L119
            java.lang.String r18 = "project_id"
            r13[r1] = r18     // Catch: java.lang.Throwable -> L119
            java.lang.String r18 = "modrinthProjectId"
            r19 = 2
            r13[r19] = r18     // Catch: java.lang.Throwable -> L119
            java.lang.String r22 = readString(r7, r13)     // Catch: java.lang.Throwable -> L119
            java.lang.String r13 = r11.versionId     // Catch: java.lang.Throwable -> L119
            java.lang.String r24 = readHash(r7)     // Catch: java.lang.Throwable -> L119
            java.lang.String r7 = r11.versionNumber     // Catch: java.lang.Throwable -> L119
            java.lang.String r26 = r12.getName()     // Catch: java.lang.Throwable -> L119
            r18 = r2
            r19 = r3
            r23 = r13
            r25 = r7
            r27 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L119
            r15.add(r2)     // Catch: java.lang.Throwable -> L119
            goto Lfb
        Lf9:
            r30 = 0
        Lfb:
            int r5 = r5 + 1
            int r1 = java.lang.Math.max(r1, r8)     // Catch: java.lang.Throwable -> L119
            r14.onProgress(r5, r1)     // Catch: java.lang.Throwable -> L119
            goto L109
        L105:
            r29 = r1
            goto L54
        L109:
            int r4 = r4 + 1
            r12 = r35
            r13 = r36
            r2 = r28
            r1 = r29
            goto L44
        L115:
            r12 = r5
            r30 = r6
            goto L122
        L119:
            r0 = move-exception
            r1 = r0
            r12 = r9
            goto L191
        L11e:
            r30 = 0
            r12 = r30
        L122:
            java.lang.String r3 = "overrides"
            r1 = r9
            r2 = r31
            r4 = r33
            r5 = r15
            r6 = r10
            r7 = r16
            r13 = r8
            r8 = r12
            r12 = r9
            r9 = r13
            r34 = r10
            r10 = r37
            int r8 = extractOverrides(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L18c
            java.lang.String r3 = "client-overrides"
            r1 = r12
            r2 = r31
            r4 = r33
            r5 = r15
            r6 = r34
            r7 = r16
            r9 = r13
            r10 = r37
            extractOverrides(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L18c
            r12.close()
            r1 = r34
            int r1 = pruneOldManagedContent(r0, r1)
            int r7 = r17 + r1
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r15
            r5 = r35
            r6 = r36
            writeFilesManifest(r1, r2, r3, r4, r5, r6)
            r1 = r32
            r2 = r35
            r3 = r36
            writeInstalledModpackManifest(r0, r1, r11, r2, r3)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult
            java.lang.String r1 = r11.versionLabel
            java.lang.String r2 = preferredMinecraftVersion(r11, r2)
            java.lang.String r3 = preferredLoader(r11, r3)
            r4 = 0
            r31 = r0
            r32 = r1
            r33 = r30
            r34 = r7
            r35 = r2
            r36 = r3
            r37 = r4
            r31.<init>(r32, r33, r34, r35, r36, r37)
            return r0
        L18c:
            r0 = move-exception
            goto L190
        L18e:
            r0 = move-exception
            r12 = r9
        L190:
            r1 = r0
        L191:
            r12.close()     // Catch: java.lang.Throwable -> L195
            goto L19a
        L195:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L19a:
            throw r1
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

    private static boolean isLikelySameProject(java.lang.String r9, java.lang.String r10) {
            boolean r0 = r9.equals(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r9.length()
            r2 = 4
            if (r0 < r2) goto L16
            boolean r0 = r10.contains(r9)
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r10.length()
            if (r0 < r2) goto L23
            boolean r0 = r9.contains(r10)
            if (r0 == 0) goto L23
            return r1
        L23:
            java.lang.String r0 = " "
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
        L2e:
            if (r4 >= r0) goto L46
            r7 = r9[r4]
            int r8 = r7.length()
            if (r8 >= r2) goto L39
            goto L43
        L39:
            int r5 = r5 + 1
            boolean r7 = r10.contains(r7)
            if (r7 == 0) goto L43
            int r6 = r6 + 1
        L43:
            int r4 = r4 + 1
            goto L2e
        L46:
            if (r5 <= 0) goto L4b
            if (r6 != r5) goto L4b
            goto L4c
        L4b:
            r1 = r3
        L4c:
            return r1
    }

    private static boolean isSearchResultUsable(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r3 = normalizeTitle(r3)
            int r0 = r3.length()
            r1 = 3
            r2 = 0
            if (r0 >= r1) goto Ld
            return r2
        Ld:
            java.lang.String r4 = normalizeTitle(r4)
            java.lang.String r5 = normalizeTitle(r5)
            java.lang.String r6 = normalizeTitle(r6)
            boolean r4 = isLikelySameProject(r3, r4)
            r0 = 1
            if (r4 == 0) goto L21
            return r0
        L21:
            boolean r4 = isLikelySameProject(r3, r5)
            if (r4 == 0) goto L28
            return r0
        L28:
            boolean r4 = r6.contains(r3)
            if (r4 == 0) goto L2f
            return r0
        L2f:
            int r3 = r3.length()
            r4 = 5
            if (r3 < r4) goto L37
            r2 = r0
        L37:
            return r2
    }

    private static boolean isUpdateAvailable(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r5, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r6) {
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = r5.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            r2 = 1
            if (r0 != r1) goto L2c
            java.lang.String r0 = r5.currentVersionId
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L19
            java.lang.String r5 = r5.currentVersionId
            java.lang.String r6 = r6.versionId
            boolean r5 = r5.equalsIgnoreCase(r6)
            r5 = r5 ^ r2
            return r5
        L19:
            java.lang.String r0 = r5.currentVersionNumber
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L2b
            java.lang.String r5 = r5.currentVersionNumber
            java.lang.String r6 = r6.versionNumber
            boolean r5 = r5.equalsIgnoreCase(r6)
            r5 = r5 ^ r2
            return r5
        L2b:
            return r2
        L2c:
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r3 = r5.currentFileId
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = r5.currentVersionId
            r1[r2] = r3
            java.lang.String r1 = firstNonBlank(r1)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = r6.fileId
            r0[r4] = r3
            java.lang.String r3 = r6.versionId
            r0[r2] = r3
            java.lang.String r0 = firstNonBlank(r0)
            boolean r3 = isBlank(r1)
            if (r3 != 0) goto L5c
            boolean r3 = isBlank(r0)
            if (r3 != 0) goto L5c
            boolean r5 = r1.equalsIgnoreCase(r0)
            r5 = r5 ^ r2
            return r5
        L5c:
            java.lang.String r0 = r5.currentVersionNumber
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L6e
            java.lang.String r5 = r5.currentVersionNumber
            java.lang.String r6 = r6.versionNumber
            boolean r5 = r5.equalsIgnoreCase(r6)
            r5 = r5 ^ r2
            return r5
        L6e:
            return r2
    }

    private static java.lang.String joinStrings(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
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

    private static boolean jsonArrayContainsIgnoreCase(org.json.JSONArray r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L22
            boolean r1 = isBlank(r4)
            if (r1 == 0) goto La
            goto L22
        La:
            r1 = r0
        Lb:
            int r2 = r3.length()
            if (r1 >= r2) goto L22
            java.lang.String r2 = ""
            java.lang.String r2 = r3.optString(r1, r2)
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1f
            r3 = 1
            return r3
        L1f:
            int r1 = r1 + 1
            goto Lb
        L22:
            return r0
    }

    private static java.util.ArrayList<java.lang.String> jsonArrayToStringList(org.json.JSONArray r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 != 0) goto L8
            return r0
        L8:
            r1 = 0
        L9:
            int r2 = r4.length()
            if (r1 >= r2) goto L2b
            java.lang.String r2 = ""
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L28
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L28
            r0.add(r2)
        L28:
            int r1 = r1 + 1
            goto L9
        L2b:
            return r0
    }

    static /* synthetic */ int lambda$fetchLatestCurseForgeVersion$3(org.json.JSONObject r2, org.json.JSONObject r3) {
            java.lang.String r0 = "fileDate"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.optString(r0, r1)
            java.lang.String r2 = r2.optString(r0, r1)
            int r2 = r3.compareTo(r2)
            return r2
    }

    static /* synthetic */ int lambda$fetchLatestModrinthVersion$2(org.json.JSONObject r2, org.json.JSONObject r3) {
            java.lang.String r0 = "date_published"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.optString(r0, r1)
            java.lang.String r2 = r2.optString(r0, r1)
            int r2 = r3.compareTo(r2)
            return r2
    }

    static /* synthetic */ int lambda$findMatchingProjects$0(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r3) {
            boolean r0 = r2.exactInstalledProject
            boolean r1 = r3.exactInstalledProject
            if (r0 == r1) goto Le
            boolean r2 = r2.exactInstalledProject
            if (r2 == 0) goto Lc
            r2 = -1
            goto Ld
        Lc:
            r2 = 1
        Ld:
            return r2
        Le:
            java.lang.String r0 = r2.title
            java.lang.String r0 = normalizeTitle(r0)
            java.lang.String r1 = r3.title
            java.lang.String r1 = normalizeTitle(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L21
            return r0
        L21:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = r2.platform
            java.lang.String r2 = r2.displayName
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = r3.platform
            java.lang.String r3 = r3.displayName
            int r2 = r2.compareTo(r3)
            return r2
    }

    static /* synthetic */ int lambda$loadVersions$1(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r2, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r3) {
            java.lang.String r0 = r3.datePublished
            java.lang.String r1 = r2.datePublished
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r3 = r3.versionLabel
            java.lang.String r2 = r2.versionLabel
            int r2 = compareVersionStrings(r3, r2)
            return r2
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo latestWithCurseForgeDownloadUrl(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r14) throws java.lang.Exception {
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.curseforge.com/v1/mods/"
            r1.<init>(r2)
            java.lang.String r2 = r14.projectId
            java.lang.String r2 = android.net.Uri.encode(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/files/"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 0
            java.lang.String r5 = r14.fileId
            r3[r4] = r5
            java.lang.String r4 = r14.versionId
            r5 = 1
            r3[r5] = r4
            java.lang.String r3 = firstNonBlank(r3)
            java.lang.String r3 = android.net.Uri.encode(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = "/download-url"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = readNetworkText(r1, r0)
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "\""
            boolean r3 = r0.startsWith(r1)
            if (r3 == 0) goto L71
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L71
            int r1 = r0.length()
            if (r1 < r2) goto L71
            int r1 = r0.length()
            int r1 = r1 - r5
            java.lang.String r0 = r0.substring(r5, r1)
            java.lang.String r1 = "\\/"
            java.lang.String r2 = "/"
            java.lang.String r0 = r0.replace(r1, r2)
        L71:
            r9 = r0
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = r14.platform
            java.lang.String r3 = r14.projectId
            java.lang.String r4 = r14.versionId
            java.lang.String r5 = r14.fileId
            java.lang.String r6 = r14.versionNumber
            java.lang.String r7 = r14.versionName
            java.lang.String r8 = r14.datePublished
            java.lang.String r10 = r14.fileName
            java.util.ArrayList<java.lang.String> r11 = r14.gameVersions
            java.util.ArrayList<java.lang.String> r12 = r14.loaders
            r13 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L8e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "CurseForge API key is not configured."
            r14.<init>(r0)
            throw r14
    }

    private static java.util.ArrayList<java.util.zip.ZipEntry> listZipEntries(java.util.zip.ZipFile r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Enumeration r2 = r2.entries()
        L9:
            boolean r1 = r2.hasMoreElements()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            r0.add(r1)
            goto L9
        L19:
            return r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> loadCurseForgeVersions(java.lang.String r25) throws java.lang.Exception {
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto Lf5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = r2
        L14:
            if (r4 >= r3) goto Lf4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "https://api.curseforge.com/v1/mods/"
            r5.<init>(r6)
            java.lang.String r6 = android.net.Uri.encode(r25)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "/files?pageSize=200&index="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r6 = "&sortField=2&sortOrder=desc"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = readNetworkText(r5, r0)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r5)
            java.lang.String r5 = "data"
            org.json.JSONArray r5 = r6.optJSONArray(r5)
            if (r5 == 0) goto Lf4
            int r7 = r5.length()
            if (r7 != 0) goto L52
            goto Lf4
        L52:
            java.lang.String r7 = "pagination"
            org.json.JSONObject r6 = r6.optJSONObject(r7)
            if (r6 == 0) goto L64
            java.lang.String r7 = "totalCount"
            int r3 = r6.optInt(r7, r3)
            int r3 = java.lang.Math.max(r2, r3)
        L64:
            r6 = r2
        L65:
            int r7 = r5.length()
            if (r6 >= r7) goto Le7
            org.json.JSONObject r7 = r5.optJSONObject(r6)
            if (r7 == 0) goto Le3
            java.lang.String r8 = "isAvailable"
            r9 = 1
            int r8 = r7.optInt(r8, r9)
            if (r8 != 0) goto L7b
            goto Le3
        L7b:
            java.lang.String r8 = "fileId"
            r10 = 0
            long r10 = r7.optLong(r8, r10)
            java.lang.String r8 = "id"
            long r10 = r7.optLong(r8, r10)
            java.lang.String r16 = java.lang.String.valueOf(r10)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r8 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r13 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]
            java.lang.String r12 = "displayName"
            java.lang.String r14 = ""
            java.lang.String r15 = r7.optString(r12, r14)
            r11[r2] = r15
            java.lang.String r15 = "fileName"
            java.lang.String r17 = r7.optString(r15, r14)
            r11[r9] = r17
            java.lang.String r17 = firstNonBlank(r11)
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.String r11 = r7.optString(r15, r14)
            r10[r2] = r11
            java.lang.String r11 = r7.optString(r12, r14)
            r10[r9] = r11
            java.lang.String r18 = firstNonBlank(r10)
            java.lang.String r9 = "fileDate"
            java.lang.String r19 = r7.optString(r9, r14)
            java.lang.String r9 = "downloadUrl"
            java.lang.String r20 = r7.optString(r9, r14)
            java.lang.String r9 = "modpack.zip"
            java.lang.String r21 = r7.optString(r15, r9)
            java.util.ArrayList r22 = readCurseForgeGameVersions(r7)
            java.util.ArrayList r23 = readCurseForgeLoaders(r7)
            r24 = 0
            r12 = r8
            r14 = r25
            r15 = r16
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.add(r8)
        Le3:
            int r6 = r6 + 1
            goto L65
        Le7:
            int r6 = r5.length()
            int r4 = r4 + r6
            int r5 = r5.length()
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 >= r6) goto L14
        Lf4:
            return r1
        Lf5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CurseForge API key is not configured."
            r0.<init>(r1)
            throw r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> loadModrinthVersions(java.lang.String r19) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.modrinth.com/v2/project/"
            r0.<init>(r1)
            java.lang.String r1 = android.net.Uri.encode(r19)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/version"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r0 = readNetworkText(r0, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
            r3 = r2
        L2a:
            int r4 = r1.length()
            if (r3 >= r4) goto Lb6
            org.json.JSONObject r4 = r1.optJSONObject(r3)
            if (r4 != 0) goto L38
            goto Lb1
        L38:
            java.lang.String r5 = "files"
            org.json.JSONArray r5 = r4.optJSONArray(r5)
            org.json.JSONObject r5 = findPrimaryModrinthFile(r5)
            if (r5 != 0) goto L46
            goto Lb1
        L46:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r15 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r7 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            java.lang.String r6 = "id"
            java.lang.String r8 = ""
            java.lang.String r9 = r4.optString(r6, r8)
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r10 = readHashFromObject(r5)
            r6[r2] = r10
            java.lang.String r10 = "filename"
            java.lang.String r11 = r5.optString(r10, r8)
            r12 = 1
            r6[r12] = r11
            java.lang.String r11 = firstNonBlank(r6)
            java.lang.String r6 = "version_number"
            java.lang.String r12 = r4.optString(r6, r8)
            java.lang.String r6 = "name"
            java.lang.String r13 = r4.optString(r6, r8)
            java.lang.String r6 = "date_published"
            java.lang.String r14 = r4.optString(r6, r8)
            java.lang.String r6 = "url"
            java.lang.String r16 = r5.optString(r6, r8)
            java.lang.String r6 = "modpack.mrpack"
            java.lang.String r5 = r5.optString(r10, r6)
            java.lang.String r6 = "game_versions"
            org.json.JSONArray r6 = r4.optJSONArray(r6)
            java.util.ArrayList r17 = jsonArrayToStringList(r6)
            java.lang.String r6 = "loaders"
            org.json.JSONArray r4 = r4.optJSONArray(r6)
            java.util.ArrayList r4 = jsonArrayToStringList(r4)
            r18 = 0
            r6 = r15
            r8 = r19
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r2 = r15
            r15 = r5
            r16 = r17
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.add(r2)
        Lb1:
            int r3 = r3 + 1
            r2 = 0
            goto L2a
        Lb6:
            return r0
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo> loadVersions(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r3, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r4) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Loading "
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r3.platform
            java.lang.String r1 = r1.displayName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " versions..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.onStatus(r0)
            r0 = 0
            r1 = 1
            r4.onProgress(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = r3.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            if (r0 != r2) goto L2e
            java.lang.String r3 = r3.projectId
            java.util.ArrayList r3 = loadModrinthVersions(r3)
            goto L34
        L2e:
            java.lang.String r3 = r3.projectId
            java.util.ArrayList r3 = loadCurseForgeVersions(r3)
        L34:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$$ExternalSyntheticLambda3
            r0.<init>()
            r3.sort(r0)
            r4.onProgress(r1, r1)
            return r3
    }

    private static java.lang.String normalizeLoader(java.lang.String r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r1 = r2.contains(r0)
            if (r1 != 0) goto L45
            java.lang.String r1 = "neo forge"
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L20
            goto L45
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
            return r2
        L45:
            return r0
    }

    private static java.lang.String normalizeRelativePath(java.lang.String r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            r0 = 92
            r1 = 47
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r3 = r3.trim()
        L11:
            java.lang.String r0 = "/"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L1f
            r0 = 1
            java.lang.String r3 = r3.substring(r0)
            goto L11
        L1f:
            java.lang.String r1 = "//"
            boolean r2 = r3.contains(r1)
            if (r2 == 0) goto L2c
            java.lang.String r3 = r3.replace(r1, r0)
            goto L1f
        L2c:
            return r3
    }

    private static java.lang.String normalizeTitle(java.lang.String r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r1)
            java.lang.String r1 = "[^a-z0-9]+"
            java.lang.String r2 = r2.replaceAll(r1, r0)
            java.lang.String r2 = r2.trim()
            return r2
    }

    private static java.lang.String normalizeZipPrefix(java.lang.String r2) {
            java.lang.String r2 = normalizeRelativePath(r2)
            boolean r0 = isBlank(r2)
            if (r0 == 0) goto Ld
            java.lang.String r2 = ""
            return r2
        Ld:
            java.lang.String r0 = "/"
            boolean r1 = r2.endsWith(r0)
            if (r1 == 0) goto L16
            goto L27
        L16:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
        L27:
            return r2
    }

    private static java.lang.String preferredLoader(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, java.lang.String r2) {
            java.lang.String r0 = r1.primaryLoader
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto Lf
            java.lang.String r1 = r1.primaryLoader
            java.lang.String r1 = normalizeLoader(r1)
            return r1
        Lf:
            java.lang.String r1 = normalizeLoader(r2)
            return r1
    }

    private static java.lang.String preferredMinecraftVersion(ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r1, java.lang.String r2) {
            java.lang.String r0 = r1.primaryMinecraftVersion
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = r1.primaryMinecraftVersion
            return r1
        Lb:
            return r2
    }

    private static int pruneOldManagedContent(java.io.File r6, java.util.Set<java.lang.String> r7) {
            java.util.HashSet r0 = readOldManagedContentPaths(r6)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = normalizeRelativePath(r2)
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L9
            boolean r3 = r7.contains(r2)
            if (r3 == 0) goto L26
            goto L9
        L26:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = resolveContentType(r2)
            if (r3 != 0) goto L2d
            goto L9
        L2d:
            java.io.File r3 = resolveSafeChild(r6, r2)     // Catch: java.lang.Throwable -> L5e
            boolean r4 = deleteIfFile(r3)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L39
            int r1 = r1 + 1
        L39:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = ".disabled"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r2 = deleteIfFile(r4)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L9
            int r1 = r1 + 1
            goto L9
        L5e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to remove old modpack file "
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = readableError(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ModpackUpdateManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            goto L9
        L82:
            return r1
    }

    private static java.util.ArrayList<java.lang.String> readCurseForgeGameVersions(org.json.JSONObject r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "gameVersions"
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            if (r4 != 0) goto Le
            return r0
        Le:
            r1 = 0
        Lf:
            int r2 = r4.length()
            if (r1 >= r2) goto L33
            java.lang.String r2 = ""
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "\\d+\\.\\d+(\\.\\d+)?"
            boolean r3 = r2.matches(r3)
            if (r3 == 0) goto L30
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L30
            r0.add(r2)
        L30:
            int r1 = r1 + 1
            goto Lf
        L33:
            return r0
    }

    private static java.util.ArrayList<java.lang.String> readCurseForgeLoaders(org.json.JSONObject r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "gameVersions"
            org.json.JSONArray r4 = r4.optJSONArray(r1)
            if (r4 != 0) goto Le
            return r0
        Le:
            r1 = 0
        Lf:
            int r2 = r4.length()
            if (r1 >= r2) goto L39
            java.lang.String r2 = ""
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r2 = normalizeLoader(r2)
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L36
            java.lang.String r3 = "\\d+.*"
            boolean r3 = r2.matches(r3)
            if (r3 != 0) goto L36
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L36
            r0.add(r2)
        L36:
            int r1 = r1 + 1
            goto Lf
        L39:
            return r0
    }

    private static java.lang.String readHash(org.json.JSONObject r4) {
            java.lang.String r0 = "hashes"
            org.json.JSONObject r4 = r4.optJSONObject(r0)
            java.lang.String r0 = ""
            if (r4 != 0) goto Lb
            return r0
        Lb:
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "sha1"
            java.lang.String r2 = r4.optString(r2, r0)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "sha512"
            java.lang.String r4 = r4.optString(r2, r0)
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = firstNonBlank(r1)
            return r4
    }

    private static java.lang.String readHashFromObject(org.json.JSONObject r4) {
            java.lang.String r0 = "hashes"
            org.json.JSONObject r4 = r4.optJSONObject(r0)
            java.lang.String r0 = ""
            if (r4 != 0) goto Lb
            return r0
        Lb:
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "sha1"
            java.lang.String r2 = r4.optString(r2, r0)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "sha512"
            java.lang.String r4 = r4.optString(r2, r0)
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = firstNonBlank(r1)
            return r4
    }

    public static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo readInstalledModpackInfo(java.io.File r1, java.io.File r2) {
            java.util.ArrayList r1 = getMetadataCandidates(r1, r2)     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L22
        L8:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L22
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L22
            boolean r0 = r2.isFile()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L1b
            goto L8
        L1b:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r2 = readInstalledModpackInfoFromFile(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L8
            return r2
        L22:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to read installed modpack metadata: "
            r2.<init>(r0)
            java.lang.String r1 = readableError(r1)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ModpackUpdateManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
        L3b:
            r1 = 0
            return r1
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo readInstalledModpackInfoFromFile(java.io.File r24) throws java.lang.Exception {
            java.lang.String r0 = r24.getName()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r2 = readTextFile(r24)
            r1.<init>(r2)
            java.lang.String r2 = "modrinth.index.json"
            boolean r2 = r2.equals(r0)
            java.lang.String r3 = "version_number"
            java.lang.String r4 = "versionNumber"
            java.lang.String r5 = "versionId"
            java.lang.String r6 = "modrinthProjectId"
            java.lang.String r7 = "title"
            java.lang.String r8 = "name"
            java.lang.String r9 = "id"
            java.lang.String r10 = "projectId"
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            if (r2 == 0) goto L6e
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r16 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            java.lang.String[] r2 = new java.lang.String[r11]
            r2[r14] = r10
            java.lang.String r10 = "project_id"
            r2[r13] = r10
            r2[r12] = r6
            java.lang.String r17 = readString(r1, r2)
            java.lang.String[] r2 = new java.lang.String[r11]
            r2[r14] = r5
            java.lang.String r5 = "version_id"
            r2[r13] = r5
            r2[r12] = r9
            java.lang.String r18 = readString(r1, r2)
            java.lang.String[] r2 = new java.lang.String[r12]
            r2[r14] = r4
            r2[r13] = r3
            java.lang.String r20 = readString(r1, r2)
            java.lang.String[] r2 = new java.lang.String[r12]
            r2[r14] = r8
            r2[r13] = r7
            java.lang.String r21 = readString(r1, r2)
            r23 = 0
            java.lang.String r19 = ""
            r15 = r0
            r22 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L6e:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = readPlatform(r1)
            if (r2 != 0) goto L8e
            java.lang.String r15 = "manifest.json"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L8e
            java.lang.String r0 = "manifestType"
            java.lang.String r15 = ""
            java.lang.String r0 = r1.optString(r0, r15)
            java.lang.String r15 = "minecraftModpack"
            boolean r0 = r15.equalsIgnoreCase(r0)
            if (r0 == 0) goto L8e
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
        L8e:
            r16 = r2
            if (r16 != 0) goto L94
            r0 = 0
            return r0
        L94:
            r0 = 7
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = "platformProjectId"
            r0[r14] = r2
            r0[r13] = r10
            r0[r12] = r6
            java.lang.String r6 = "curseForgeProjectId"
            r0[r11] = r6
            java.lang.String r6 = "curseforgeProjectId"
            r15 = 4
            r0[r15] = r6
            java.lang.String r6 = "curseForgeProjectID"
            r15 = 5
            r0[r15] = r6
            r6 = 6
            java.lang.String r18 = "projectID"
            r0[r6] = r18
            java.lang.String r0 = readString(r1, r0)
            java.lang.String[] r6 = new java.lang.String[r15]
            r6[r14] = r5
            java.lang.String r5 = "versionID"
            r6[r13] = r5
            java.lang.String r5 = "modrinthVersionId"
            r6[r12] = r5
            java.lang.String r5 = "modrinth_version_id"
            r6[r11] = r5
            r5 = 4
            r6[r5] = r9
            java.lang.String r18 = readString(r1, r6)
            java.lang.String[] r5 = new java.lang.String[r15]
            java.lang.String r6 = "fileId"
            r5[r14] = r6
            java.lang.String r6 = "fileID"
            r5[r13] = r6
            java.lang.String r6 = "curseForgeFileId"
            r5[r12] = r6
            java.lang.String r6 = "curseforgeFileId"
            r5[r11] = r6
            java.lang.String r6 = "curseForgeFileID"
            r15 = 4
            r5[r15] = r6
            java.lang.String r5 = readString(r1, r5)
            java.lang.String[] r6 = new java.lang.String[r15]
            r6[r14] = r4
            java.lang.String r4 = "version"
            r6[r13] = r4
            r6[r12] = r3
            java.lang.String r3 = "displayName"
            r6[r11] = r3
            java.lang.String r20 = readString(r1, r6)
            r4 = 5
            java.lang.String[] r6 = new java.lang.String[r4]
            r6[r14] = r7
            r6[r13] = r8
            java.lang.String r15 = "projectTitle"
            r6[r12] = r15
            r6[r11] = r3
            java.lang.String r3 = "modpackName"
            r15 = 4
            r6[r15] = r3
            java.lang.String r3 = readString(r1, r6)
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r6 = "project"
            r4[r14] = r6
            java.lang.String r6 = "modrinthProject"
            r4[r13] = r6
            java.lang.String r6 = "curseForgeProject"
            r4[r12] = r6
            java.lang.String r6 = "curseforgeProject"
            r4[r11] = r6
            java.lang.String r6 = "data"
            r15 = 4
            r4[r15] = r6
            org.json.JSONObject r1 = firstObject(r1, r4)
            if (r1 == 0) goto L15c
            boolean r4 = isBlank(r0)
            if (r4 == 0) goto L143
            java.lang.String[] r0 = new java.lang.String[r15]
            r0[r14] = r9
            r0[r13] = r10
            java.lang.String r4 = "modId"
            r0[r12] = r4
            r0[r11] = r2
            java.lang.String r0 = readString(r1, r0)
        L143:
            boolean r2 = isBlank(r3)
            if (r2 == 0) goto L15c
            java.lang.String[] r2 = new java.lang.String[r11]
            r2[r14] = r7
            r2[r13] = r8
            java.lang.String r3 = "slug"
            r2[r12] = r3
            java.lang.String r1 = readString(r1, r2)
            r17 = r0
            r21 = r1
            goto L160
        L15c:
            r17 = r0
            r21 = r3
        L160:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r0 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo
            r23 = 0
            r15 = r0
            r19 = r5
            r22 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
    }

    private static java.lang.String readNetworkText(java.lang.String r6, java.lang.String r7) throws java.io.IOException {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r6)
            java.net.URLConnection r6 = r0.openConnection()
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6
            r0 = 15000(0x3a98, float:2.102E-41)
            r6.setConnectTimeout(r0)
            r0 = 20000(0x4e20, float:2.8026E-41)
            r6.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "DroidBridgeLauncher"
            r6.setRequestProperty(r0, r1)
            boolean r0 = isBlank(r7)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "x-api-key"
            java.lang.String r7 = r7.trim()
            r6.setRequestProperty(r0, r7)
        L2b:
            int r7 = r6.getResponseCode()
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 < r1) goto L3c
            if (r7 >= r0) goto L3c
            java.io.InputStream r2 = r6.getInputStream()
            goto L40
        L3c:
            java.io.InputStream r2 = r6.getErrorStream()
        L40:
            java.lang.String r3 = "HTTP "
            if (r2 == 0) goto L9e
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L8d
            r4.<init>()     // Catch: java.lang.Throwable -> L8d
            copyStream(r2, r4)     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "UTF-8"
            if (r7 < r1) goto L62
            if (r7 >= r0) goto L62
            java.lang.String r7 = r4.toString(r5)     // Catch: java.lang.Throwable -> L83
            r4.close()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L5e
            r2.close()     // Catch: java.lang.Throwable -> L99
        L5e:
            r6.disconnect()
            return r7
        L62:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r7 = r1.append(r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = ": "
            java.lang.StringBuilder r7 = r7.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r4.toString(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r7 = r7.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L83
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L83:
            r7 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L8d
        L8c:
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r7 = move-exception
            if (r2 == 0) goto L98
            r2.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L99
        L98:
            throw r7     // Catch: java.lang.Throwable -> L99
        L99:
            r7 = move-exception
            r6.disconnect()
            throw r7
        L9e:
            r6.disconnect()
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private static java.util.HashSet<java.lang.String> readOldManagedContentPaths(java.io.File r8) {
            java.lang.String r0 = ""
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.io.File r8 = getFilesManifestFile(r8)
            boolean r2 = r8.isFile()
            if (r2 != 0) goto L12
            return r1
        L12:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L64
            java.lang.String r8 = readTextFile(r8)     // Catch: java.lang.Throwable -> L64
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L64
            java.lang.String r8 = "files"
            org.json.JSONArray r8 = r2.optJSONArray(r8)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L24
            return r1
        L24:
            r2 = 0
            r3 = r2
        L26:
            int r4 = r8.length()     // Catch: java.lang.Throwable -> L64
            if (r3 >= r4) goto L7d
            org.json.JSONObject r4 = r8.optJSONObject(r3)     // Catch: java.lang.Throwable -> L64
            if (r4 != 0) goto L33
            goto L61
        L33:
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "relativePath"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Throwable -> L64
            r5[r2] = r6     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "filePath"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Throwable -> L64
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "path"
            java.lang.String r4 = r4.optString(r6, r0)     // Catch: java.lang.Throwable -> L64
            r6 = 2
            r5[r6] = r4     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = firstNonBlank(r5)     // Catch: java.lang.Throwable -> L64
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = resolveContentType(r4)     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L61
            java.lang.String r4 = normalizeRelativePath(r4)     // Catch: java.lang.Throwable -> L64
            r1.add(r4)     // Catch: java.lang.Throwable -> L64
        L61:
            int r3 = r3 + 1
            goto L26
        L64:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to read old modpack file list: "
            r0.<init>(r2)
            java.lang.String r8 = readableError(r8)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "ModpackUpdateManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r8)
        L7d:
            return r1
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform readPlatform(org.json.JSONObject r4) {
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "source"
            java.lang.String r2 = ""
            java.lang.String r1 = r4.optString(r1, r2)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "platform"
            java.lang.String r1 = r4.optString(r1, r2)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "modpackPlatform"
            java.lang.String r1 = r4.optString(r1, r2)
            r3 = 2
            r0[r3] = r1
            java.lang.String r1 = "provider"
            java.lang.String r4 = r4.optString(r1, r2)
            r1 = 3
            r0[r1] = r4
            java.lang.String r4 = firstNonBlank(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.lang.String r0 = "modrinth"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "mrpack"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L44
            goto L5a
        L44:
            java.lang.String r0 = "curse"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L57
            java.lang.String r0 = "curseforge"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L55
            goto L57
        L55:
            r4 = 0
            return r4
        L57:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r4 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            return r4
        L5a:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r4 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            return r4
    }

    private static java.lang.String readString(org.json.JSONObject r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            java.lang.String r2 = ""
            if (r1 >= r0) goto L2a
            r3 = r5[r1]
            java.lang.String r2 = r4.optString(r3, r2)
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L27
            java.lang.String r3 = "null"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 != 0) goto L27
            java.lang.String r3 = "0"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L27
            return r2
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            return r2
    }

    private static java.lang.String readTextFile(java.io.File r2) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            copyStream(r0, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = r2.toString(r1)     // Catch: java.lang.Throwable -> L1a
            r2.close()     // Catch: java.lang.Throwable -> L24
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L24
        L23:
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r2.addSuppressed(r0)
        L2d:
            throw r2
    }

    private static java.lang.String readZipEntryText(java.util.zip.ZipFile r2, java.lang.String r3) throws java.io.IOException {
            java.util.zip.ZipEntry r0 = r2.getEntry(r3)
            if (r0 == 0) goto L3d
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L3d
            java.io.InputStream r2 = r2.getInputStream(r0)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            copyStream(r2, r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = r3.toString(r0)     // Catch: java.lang.Throwable -> L27
            r3.close()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L26
            r2.close()
        L26:
            return r0
        L27:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L31
        L30:
            throw r0     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r2 = move-exception
            r3.addSuppressed(r2)
        L3c:
            throw r3
        L3d:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static java.lang.String readableError(java.lang.Throwable r2) {
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L18
        L10:
            java.lang.Class r2 = r2.getClass()
            java.lang.String r0 = r2.getSimpleName()
        L18:
            return r0
    }

    private static int resetModpackContentFolders(java.io.File r8, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r9) throws java.io.IOException {
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "mods"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "shaderpacks"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "resourcepacks"
            r1[r2] = r4
            r2 = r3
        L13:
            if (r3 >= r0) goto L61
            r4 = r1[r3]
            java.io.File r5 = resolveSafeChild(r8, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Clearing old "
            r6.<init>(r7)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = "..."
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r9.onStatus(r4)
            int r4 = deleteDirectoryTree(r5)
            int r2 = r2 + r4
            boolean r4 = r5.exists()
            if (r4 != 0) goto L5e
            boolean r4 = r5.mkdirs()
            if (r4 == 0) goto L45
            goto L5e
        L45:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to recreate folder: "
            r9.<init>(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L5e:
            int r3 = r3 + 1
            goto L13
        L61:
            return r2
    }

    private static ca.dnamobile.javalauncher.modmanager.ModManagerContentType resolveContentType(java.lang.String r3) {
            java.lang.String r3 = normalizeRelativePath(r3)
            java.lang.String r0 = "mods/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = ".jar"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = ".jar.disabled"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L1f
        L1c:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r3
        L1f:
            java.lang.String r0 = "resourcepacks/"
            boolean r0 = r3.startsWith(r0)
            java.lang.String r1 = ".zip.disabled"
            java.lang.String r2 = ".zip"
            if (r0 == 0) goto L3a
            boolean r0 = r3.endsWith(r2)
            if (r0 != 0) goto L37
            boolean r0 = r3.endsWith(r1)
            if (r0 == 0) goto L3a
        L37:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r3
        L3a:
            java.lang.String r0 = "shaderpacks/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L51
            boolean r0 = r3.endsWith(r2)
            if (r0 != 0) goto L4e
            boolean r3 = r3.endsWith(r1)
            if (r3 == 0) goto L51
        L4e:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            return r3
        L51:
            r3 = 0
            return r3
    }

    private static ca.dnamobile.javalauncher.modmanager.ModManagerContentType resolveCurseForgeContentType(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "https://api.curseforge.com/v1/mods/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = readNetworkText(r0, r4)     // Catch: java.lang.Throwable -> L3a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L3a
            r0 = 0
            if (r4 != 0) goto L26
            goto L2c
        L26:
            java.lang.String r1 = "classId"
            int r0 = r4.optInt(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L2c:
            r4 = 12
            if (r0 != r4) goto L33
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS     // Catch: java.lang.Throwable -> L3a
            return r2
        L33:
            r4 = 6552(0x1998, float:9.181E-42)
            if (r0 != r4) goto L5d
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS     // Catch: java.lang.Throwable -> L3a
            return r2
        L3a:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to resolve CurseForge content type for "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r4 = readableError(r4)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "ModpackUpdateManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r2)
        L5d:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r3.toLowerCase(r2)
            java.lang.String r3 = ".zip"
            boolean r2 = r2.endsWith(r3)
            if (r2 == 0) goto L6e
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r2
        L6e:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r2
    }

    private static java.io.File resolveOverrideTarget(java.io.File r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) throws java.io.IOException {
            java.lang.String r5 = normalizeRelativePath(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r5.toLowerCase(r0)
            java.lang.String r1 = "saves/"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L17
            java.io.File r4 = resolveSafeChild(r4, r5)
            return r4
        L17:
            java.lang.String r0 = "/"
            r1 = 3
            java.lang.String[] r0 = r5.split(r0, r1)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto L83
            r1 = 1
            r3 = r0[r1]
            boolean r3 = isBlank(r3)
            if (r3 == 0) goto L2c
            goto L83
        L2c:
            r5 = r0[r1]
            java.lang.String r5 = sanitizeFileName(r5)
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "saves"
            java.io.File r4 = resolveSafeChild(r4, r3)
            boolean r3 = isBlank(r1)
            if (r3 == 0) goto L73
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r5)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " Pack World"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.io.File r1 = uniqueDirectory(r4, r1)
            java.lang.String r1 = r1.getName()
            goto L70
        L6f:
            r1 = r5
        L70:
            r6.put(r5, r1)
        L73:
            java.io.File r5 = new java.io.File
            r5.<init>(r4, r1)
            int r4 = r0.length
            if (r4 != r2) goto L7c
            return r5
        L7c:
            r4 = r0[r2]
            java.io.File r4 = resolveSafeChild(r5, r4)
            return r4
        L83:
            java.io.File r4 = resolveSafeChild(r4, r5)
            return r4
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo resolveProjectFromTitle(android.content.Context r4, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r5, java.lang.String r6, java.lang.String r7, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r8) throws java.lang.Exception {
            java.lang.String r4 = r5.displayTitle
            boolean r0 = isBlank(r4)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "Modpack"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L12
            goto L8f
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r5.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            java.lang.String r3 = "..."
            if (r1 != r2) goto L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Searching Modrinth for "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r8.onStatus(r1)
            java.io.File r8 = r5.metadataFile
            java.util.ArrayList r6 = searchModrinth(r4, r6, r7, r8)
            r0.addAll(r6)
            goto L5e
        L3f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Searching CurseForge for "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            r8.onStatus(r6)
            java.io.File r6 = r5.metadataFile
            java.util.ArrayList r6 = searchCurseForge(r4, r6)
            r0.addAll(r6)
        L5e:
            int r6 = r0.size()
            r7 = 1
            if (r6 != r7) goto L6d
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r4 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo) r4
            return r4
        L6d:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L74
            return r5
        L74:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Multiple matching modpacks were found for "
            r6.<init>(r7)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = ". Reinstall the pack so DroidBridge can save exact update metadata."
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L8f:
            return r5
    }

    private static java.io.File resolveSafeChild(java.io.File r4, java.lang.String r5) throws java.io.IOException {
            java.lang.String r0 = normalizeRelativePath(r5)
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L55
            java.io.File r1 = new java.io.File
            r2 = 47
            char r3 = java.io.File.separatorChar
            java.lang.String r0 = r0.replace(r2, r3)
            r1.<init>(r4, r0)
            java.lang.String r4 = r4.getCanonicalPath()
            java.lang.String r0 = r1.getCanonicalPath()
            boolean r2 = r0.equals(r4)
            if (r2 != 0) goto L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L3f
            goto L54
        L3f:
            java.lang.SecurityException r4 = new java.lang.SecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Blocked unsafe path: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L54:
            return r1
        L55:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Blank relative path."
            r4.<init>(r5)
            throw r4
    }

    private static java.lang.String safeCanonicalPath(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private static boolean sameFile(java.io.File r2, java.io.File r3) {
            java.io.File r0 = r2.getCanonicalFile()     // Catch: java.lang.Throwable -> Ld
            java.io.File r1 = r3.getCanonicalFile()     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r3 = r3.getAbsolutePath()
            boolean r2 = r2.equals(r3)
            return r2
    }

    private static java.lang.String sanitizeFileName(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            r0 = 10
            r1 = 32
            java.lang.String r2 = r2.replace(r0, r1)
            r0 = 13
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "[\\\\/:*?\"<>|]"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
        L1a:
            java.lang.String r0 = "  "
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L29
            java.lang.String r1 = " "
            java.lang.String r2 = r2.replace(r0, r1)
            goto L1a
        L29:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L3f
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3f
            java.lang.String r0 = ".."
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L41
        L3f:
            java.lang.String r2 = "file"
        L41:
            return r2
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo> searchCurseForge(java.lang.String r18, java.io.File r19) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r2 = isBlank(r1)
            if (r2 == 0) goto L10
            return r0
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "https://api.curseforge.com/v1/mods/search?gameId=432&classId=4471&pageSize=10&searchFilter="
            r2.<init>(r3)
            java.lang.String r3 = android.net.Uri.encode(r18)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = readNetworkText(r2, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = "data"
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            if (r1 != 0) goto L35
            return r0
        L35:
            java.lang.String r2 = normalizeTitle(r18)
            r3 = 0
            r4 = r3
        L3b:
            int r5 = r1.length()
            if (r4 >= r5) goto L91
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 != 0) goto L48
            goto L8e
        L48:
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r7 = "name"
            java.lang.String r8 = ""
            java.lang.String r7 = r5.optString(r7, r8)
            r6[r3] = r7
            java.lang.String r7 = "slug"
            java.lang.String r7 = r5.optString(r7, r8)
            r8 = 1
            r6[r8] = r7
            java.lang.String r15 = firstNonBlank(r6)
            java.lang.String r6 = normalizeTitle(r15)
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L6d
            goto L8e
        L6d:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r6 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r10 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            java.lang.String r7 = "id"
            r8 = 0
            long r7 = r5.optLong(r7, r8)
            java.lang.String r11 = java.lang.String.valueOf(r7)
            java.lang.String r14 = ""
            r17 = 0
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            r9 = r6
            r16 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.add(r6)
        L8e:
            int r4 = r4 + 1
            goto L3b
        L91:
            return r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch> searchCurseForgeProjects(java.lang.String r19) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r2 = isBlank(r1)
            if (r2 == 0) goto L10
            return r0
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "https://api.curseforge.com/v1/mods/search?gameId=432&classId=4471&pageSize=50&searchFilter="
            r2.<init>(r3)
            java.lang.String r3 = android.net.Uri.encode(r19)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = readNetworkText(r2, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = "data"
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            if (r1 != 0) goto L35
            return r0
        L35:
            r2 = 0
            r3 = r2
        L37:
            int r4 = r1.length()
            if (r3 >= r4) goto La3
            org.json.JSONObject r4 = r1.optJSONObject(r3)
            if (r4 != 0) goto L46
            r6 = r19
            goto La0
        L46:
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "name"
            java.lang.String r8 = ""
            java.lang.String r7 = r4.optString(r7, r8)
            r6[r2] = r7
            java.lang.String r7 = "slug"
            java.lang.String r9 = r4.optString(r7, r8)
            r10 = 1
            r6[r10] = r9
            java.lang.String r14 = firstNonBlank(r6)
            java.lang.String r15 = r4.optString(r7, r8)
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = "summary"
            java.lang.String r6 = r4.optString(r6, r8)
            r5[r2] = r6
            java.lang.String r6 = "description"
            java.lang.String r6 = r4.optString(r6, r8)
            r5[r10] = r6
            java.lang.String r5 = firstNonBlank(r5)
            r6 = r19
            boolean r7 = isSearchResultUsable(r6, r14, r15, r5)
            if (r7 != 0) goto L83
            goto La0
        L83:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r7 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r12 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            java.lang.String r8 = "id"
            r9 = 0
            long r8 = r4.optLong(r8, r9)
            java.lang.String r13 = java.lang.String.valueOf(r8)
            r17 = 0
            r18 = 0
            r11 = r7
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r0.add(r7)
        La0:
            int r3 = r3 + 1
            goto L37
        La3:
            return r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo> searchModrinth(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.io.File r22) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[[\"project_type:modpack\"]"
            r1.<init>(r2)
            boolean r2 = isBlank(r20)
            java.lang.String r3 = "\"]"
            if (r2 != 0) goto L25
            java.lang.String r2 = ",[\"versions:"
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r4 = escapeFacetValue(r20)
            java.lang.StringBuilder r2 = r2.append(r4)
            r2.append(r3)
        L25:
            java.lang.String r2 = normalizeLoader(r21)
            boolean r4 = isBlank(r2)
            if (r4 != 0) goto L48
            java.lang.String r4 = "vanilla"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L48
            java.lang.String r4 = ",[\"categories:"
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r2 = escapeFacetValue(r2)
            java.lang.StringBuilder r2 = r4.append(r2)
            r2.append(r3)
        L48:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "https://api.modrinth.com/v2/search?query="
            r2.<init>(r3)
            java.lang.String r3 = android.net.Uri.encode(r19)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "&limit=10&facets="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = android.net.Uri.encode(r1)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r1 = readNetworkText(r1, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = "hits"
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            if (r1 != 0) goto L85
            return r0
        L85:
            java.lang.String r2 = normalizeTitle(r19)
            r3 = 0
            r4 = r3
        L8b:
            int r5 = r1.length()
            if (r4 >= r5) goto Le1
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            if (r5 != 0) goto L98
            goto Lde
        L98:
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r7 = "title"
            java.lang.String r8 = ""
            java.lang.String r7 = r5.optString(r7, r8)
            r6[r3] = r7
            java.lang.String r7 = "slug"
            java.lang.String r7 = r5.optString(r7, r8)
            r9 = 1
            r6[r9] = r7
            java.lang.String r16 = firstNonBlank(r6)
            java.lang.String r6 = normalizeTitle(r16)
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lbd
            goto Lde
        Lbd:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r6 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r11 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            java.lang.String r7 = "id"
            java.lang.String r7 = r5.optString(r7, r8)
            java.lang.String r8 = "project_id"
            java.lang.String r12 = r5.optString(r8, r7)
            java.lang.String r15 = ""
            r18 = 0
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            r10 = r6
            r17 = r22
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.add(r6)
        Lde:
            int r4 = r4 + 1
            goto L8b
        Le1:
            return r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch> searchModrinthProjects(java.lang.String r18) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.modrinth.com/v2/search?query="
            r1.<init>(r2)
            java.lang.String r2 = android.net.Uri.encode(r18)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "&limit=50&facets="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "[[\"project_type:modpack\"]]"
            java.lang.String r2 = android.net.Uri.encode(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r1 = readNetworkText(r1, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = "hits"
            org.json.JSONArray r1 = r2.optJSONArray(r1)
            if (r1 != 0) goto L3b
            return r0
        L3b:
            r2 = 0
            r3 = r2
        L3d:
            int r4 = r1.length()
            if (r3 >= r4) goto L97
            org.json.JSONObject r4 = r1.optJSONObject(r3)
            if (r4 != 0) goto L4c
            r5 = r18
            goto L94
        L4c:
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = "title"
            java.lang.String r7 = ""
            java.lang.String r6 = r4.optString(r6, r7)
            r5[r2] = r6
            java.lang.String r6 = "slug"
            java.lang.String r8 = r4.optString(r6, r7)
            r9 = 1
            r5[r9] = r8
            java.lang.String r13 = firstNonBlank(r5)
            java.lang.String r14 = r4.optString(r6, r7)
            java.lang.String r5 = "description"
            java.lang.String r15 = r4.optString(r5, r7)
            r5 = r18
            boolean r6 = isSearchResultUsable(r5, r13, r14, r15)
            if (r6 != 0) goto L79
            goto L94
        L79:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch r6 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ProjectMatch
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r11 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            java.lang.String r8 = "id"
            java.lang.String r7 = r4.optString(r8, r7)
            java.lang.String r8 = "project_id"
            java.lang.String r12 = r4.optString(r8, r7)
            r16 = 0
            r17 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r0.add(r6)
        L94:
            int r3 = r3 + 1
            goto L3d
        L97:
            return r0
    }

    private static java.io.File uniqueDirectory(java.io.File r4, java.lang.String r5) {
            java.lang.String r5 = sanitizeFileName(r5)
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r5)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L10
            return r0
        L10:
            r0 = 2
        L11:
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = " "
            if (r0 >= r1) goto L3b
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r4, r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L38
            return r1
        L38:
            int r0 = r0 + 1
            goto L11
        L3b:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.StringBuilder r5 = r5.append(r2)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r0.<init>(r4, r5)
            return r0
    }

    public static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult updateInstalledModpack(android.content.Context r16, java.io.File r17, java.io.File r18, java.lang.String r19, java.lang.String r20, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r21, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ProjectMatch r22, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r23, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r24) throws java.lang.Exception {
            r0 = r21
            r1 = r22
            r2 = r23
            r6 = r24
            java.lang.String r3 = "Downloading "
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r4 = new ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r8 = r1.platform
            java.lang.String r9 = r1.projectId
            java.lang.String r10 = r0.currentVersionId
            java.lang.String r11 = r0.currentFileId
            java.lang.String r12 = r0.currentVersionNumber
            java.lang.String r13 = r1.title
            java.io.File r14 = r0.metadataFile
            r15 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = r2.downloadUrl
            boolean r0 = isBlank(r0)
            if (r0 == 0) goto L32
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = r2.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            if (r0 != r1) goto L32
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r0 = latestWithCurseForgeDownloadUrl(r23)
            r2 = r0
        L32:
            java.lang.String r0 = r2.downloadUrl
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto Lda
            java.io.File r0 = new java.io.File
            java.io.File r1 = r16.getCacheDir()
            java.lang.String r5 = "modpack-update"
            r0.<init>(r1, r5)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L6b
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L52
            goto L6b
        L52:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create cache folder: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L6b:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r2.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r5 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            if (r1 != r5) goto L74
            java.lang.String r1 = ".mrpack"
            goto L76
        L74:
            java.lang.String r1 = ".zip"
        L76:
            java.lang.String r5 = "modpack-update-"
            java.io.File r7 = java.io.File.createTempFile(r5, r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r2.versionLabel     // Catch: java.lang.Throwable -> Ld5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld5
            r6.onStatus(r0)     // Catch: java.lang.Throwable -> Ld5
            r0 = 0
            r1 = 100
            r6.onProgress(r0, r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = r2.downloadUrl     // Catch: java.lang.Throwable -> Ld5
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r2.platform     // Catch: java.lang.Throwable -> Ld5
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE     // Catch: java.lang.Throwable -> Ld5
            if (r1 != r3) goto La7
            java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()     // Catch: java.lang.Throwable -> Ld5
            goto La8
        La7:
            r1 = 0
        La8:
            downloadToFile(r0, r7, r1)     // Catch: java.lang.Throwable -> Ld5
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = r2.platform     // Catch: java.lang.Throwable -> Ld5
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH     // Catch: java.lang.Throwable -> Ld5
            if (r0 != r1) goto Lc3
            r0 = r18
            r1 = r4
            r3 = r7
            r4 = r19
            r5 = r20
            r6 = r24
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r0 = installModrinthPack(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld5
            r7.delete()
            return r0
        Lc3:
            r0 = r18
            r1 = r4
            r3 = r7
            r4 = r19
            r5 = r20
            r6 = r24
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r0 = installCurseForgePack(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld5
            r7.delete()
            return r0
        Ld5:
            r0 = move-exception
            r7.delete()
            throw r0
        Lda:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The selected modpack version does not provide a download URL."
            r0.<init>(r1)
            throw r0
    }

    public static ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateResult updateInstalledModpack(android.content.Context r8, java.io.File r9, java.io.File r10, java.lang.String r11, java.lang.String r12, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.UpdateCheckResult r13, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Listener r14) throws java.lang.Exception {
            java.lang.String r9 = "Downloading "
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r0 = r13.latest
            java.lang.String r1 = r0.downloadUrl
            boolean r1 = isBlank(r1)
            if (r1 == 0) goto L16
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r0.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r2 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE
            if (r1 != r2) goto L16
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$VersionInfo r0 = latestWithCurseForgeDownloadUrl(r0)
        L16:
            r3 = r0
            java.lang.String r0 = r3.downloadUrl
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto Lb9
            java.io.File r0 = new java.io.File
            java.io.File r8 = r8.getCacheDir()
            java.lang.String r1 = "modpack-update"
            r0.<init>(r8, r1)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L50
            boolean r8 = r0.mkdirs()
            if (r8 == 0) goto L37
            goto L50
        L37:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to create cache folder: "
            r9.<init>(r10)
            java.lang.String r10 = r0.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L50:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r8 = r3.platform
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH
            if (r8 != r1) goto L59
            java.lang.String r8 = ".mrpack"
            goto L5b
        L59:
            java.lang.String r8 = ".zip"
        L5b:
            java.lang.String r1 = "modpack-update-"
            java.io.File r8 = java.io.File.createTempFile(r1, r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = r3.versionLabel     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r9 = r0.append(r9)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "..."
            java.lang.StringBuilder r9 = r9.append(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb4
            r14.onStatus(r9)     // Catch: java.lang.Throwable -> Lb4
            r9 = 0
            r0 = 100
            r14.onProgress(r9, r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r9 = r3.downloadUrl     // Catch: java.lang.Throwable -> Lb4
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = r3.platform     // Catch: java.lang.Throwable -> Lb4
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.CURSEFORGE     // Catch: java.lang.Throwable -> Lb4
            if (r0 != r1) goto L8c
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()     // Catch: java.lang.Throwable -> Lb4
            goto L8d
        L8c:
            r0 = 0
        L8d:
            downloadToFile(r9, r8, r0)     // Catch: java.lang.Throwable -> Lb4
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r9 = r3.platform     // Catch: java.lang.Throwable -> Lb4
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r0 = ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.Platform.MODRINTH     // Catch: java.lang.Throwable -> Lb4
            if (r9 != r0) goto La5
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r2 = r13.installed     // Catch: java.lang.Throwable -> Lb4
            r1 = r10
            r4 = r8
            r5 = r11
            r6 = r12
            r7 = r14
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r9 = installModrinthPack(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb4
            r8.delete()
            return r9
        La5:
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$InstalledModpackInfo r2 = r13.installed     // Catch: java.lang.Throwable -> Lb4
            r1 = r10
            r4 = r8
            r5 = r11
            r6 = r12
            r7 = r14
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$UpdateResult r9 = installCurseForgePack(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb4
            r8.delete()
            return r9
        Lb4:
            r9 = move-exception
            r8.delete()
            throw r9
        Lb9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "The selected modpack version does not provide a download URL."
            r8.<init>(r9)
            throw r8
    }

    private static void writeFilesManifest(java.io.File r16, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r17, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r18, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ManagedFileEntry> r19, java.lang.String r20, java.lang.String r21) throws java.lang.Exception {
            r0 = r17
            r1 = r18
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = r1.platform
            java.lang.String r3 = r3.displayName
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "source"
            r2.put(r4, r3)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = r1.platform
            java.lang.String r3 = r3.displayName
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r5)
            java.lang.String r5 = "platform"
            r2.put(r5, r3)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r3 = r1.platform
            java.lang.String r3 = r3.displayName
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r6)
            java.lang.String r6 = "modpackPlatform"
            r2.put(r6, r3)
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r8 = r1.projectId
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = r0.projectId
            r10 = 1
            r7[r10] = r8
            java.lang.String r7 = firstNonBlank(r7)
            java.lang.String r8 = "platformProjectId"
            r2.put(r8, r7)
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r11 = r1.projectId
            r7[r9] = r11
            java.lang.String r9 = r0.projectId
            r7[r10] = r9
            java.lang.String r7 = firstNonBlank(r7)
            java.lang.String r9 = "projectId"
            r2.put(r9, r7)
            java.lang.String r7 = "title"
            java.lang.String r0 = r0.displayTitle
            r2.put(r7, r0)
            java.lang.String r0 = r1.versionId
            java.lang.String r7 = "versionId"
            r2.put(r7, r0)
            java.lang.String r0 = r1.fileId
            java.lang.String r10 = "fileId"
            r2.put(r10, r0)
            java.lang.String r0 = r1.versionNumber
            java.lang.String r1 = "versionNumber"
            r2.put(r1, r0)
            java.lang.String r0 = "minecraftVersion"
            r11 = r20
            r2.put(r0, r11)
            java.lang.String r0 = "loader"
            java.lang.String r11 = normalizeLoader(r21)
            r2.put(r0, r11)
            java.lang.String r0 = "updatedAt"
            long r11 = java.lang.System.currentTimeMillis()
            r2.put(r0, r11)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r11 = r19.iterator()
        L9d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L144
            java.lang.Object r12 = r11.next()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$ManagedFileEntry r12 = (ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.ManagedFileEntry) r12
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r14 = r12.platform
            java.lang.String r14 = r14.displayName
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r14 = r14.toLowerCase(r15)
            r13.put(r4, r14)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r14 = r12.platform
            java.lang.String r14 = r14.displayName
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r14 = r14.toLowerCase(r15)
            r13.put(r5, r14)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r14 = r12.platform
            java.lang.String r14 = r14.displayName
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r14 = r14.toLowerCase(r15)
            r13.put(r6, r14)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r14 = r12.contentType
            java.lang.String r14 = r14.getIntentValue()
            java.lang.String r15 = "contentType"
            r13.put(r15, r14)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r14 = r12.contentType
            java.lang.String r14 = r14.getIntentValue()
            java.lang.String r15 = "type"
            r13.put(r15, r14)
            java.lang.String r14 = r12.projectId
            r13.put(r8, r14)
            java.lang.String r14 = r12.projectId
            r13.put(r9, r14)
            java.lang.String r14 = r12.versionId
            r13.put(r7, r14)
            java.lang.String r14 = r12.fileId
            r13.put(r10, r14)
            java.lang.String r14 = r12.versionNumber
            r13.put(r1, r14)
            java.lang.String r14 = "fileName"
            java.lang.String r15 = r12.fileName
            r13.put(r14, r15)
            java.lang.String r14 = "relativePath"
            java.lang.String r15 = r12.relativePath
            r13.put(r14, r15)
            java.lang.String r14 = "filePath"
            java.lang.String r15 = r12.relativePath
            r13.put(r14, r15)
            java.io.File r14 = r12.file
            java.lang.String r14 = r14.getAbsolutePath()
            java.lang.String r15 = "absolutePath"
            r13.put(r15, r14)
            java.io.File r12 = r12.file
            java.lang.String r12 = safeCanonicalPath(r12)
            java.lang.String r14 = "canonicalPath"
            r13.put(r14, r12)
            java.lang.String r12 = "installedAt"
            long r14 = java.lang.System.currentTimeMillis()
            r13.put(r12, r14)
            java.lang.String r12 = "updatedBy"
            java.lang.String r14 = "DroidBridge"
            r13.put(r12, r14)
            r0.put(r13)
            goto L9d
        L144:
            java.lang.String r1 = "files"
            r2.put(r1, r0)
            java.io.File r0 = getFilesManifestFile(r16)
            java.lang.String r1 = r2.toString(r3)
            writeTextFile(r0, r1)
            return
    }

    private static void writeInstalledModpackManifest(java.io.File r6, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.InstalledModpackInfo r7, ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager.VersionInfo r8, java.lang.String r9, java.lang.String r10) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r8.platform
            java.lang.String r1 = r1.displayName
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "source"
            r0.put(r2, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r8.platform
            java.lang.String r1 = r1.displayName
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "platform"
            r0.put(r2, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackUpdateManager$Platform r1 = r8.platform
            java.lang.String r1 = r1.displayName
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "modpackPlatform"
            r0.put(r2, r1)
            r1 = 2
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = r8.projectId
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r7.projectId
            r5 = 1
            r2[r5] = r3
            java.lang.String r2 = firstNonBlank(r2)
            java.lang.String r3 = "platformProjectId"
            r0.put(r3, r2)
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = r8.projectId
            r2[r4] = r3
            java.lang.String r3 = r7.projectId
            r2[r5] = r3
            java.lang.String r2 = firstNonBlank(r2)
            java.lang.String r3 = "projectId"
            r0.put(r3, r2)
            java.lang.String r2 = "title"
            java.lang.String r3 = r7.displayTitle
            r0.put(r2, r3)
            java.lang.String r2 = "name"
            java.lang.String r7 = r7.displayTitle
            r0.put(r2, r7)
            java.lang.String r7 = "versionId"
            java.lang.String r2 = r8.versionId
            r0.put(r7, r2)
            java.lang.String r7 = "fileId"
            java.lang.String r2 = r8.fileId
            r0.put(r7, r2)
            java.lang.String r7 = "versionNumber"
            java.lang.String r2 = r8.versionNumber
            r0.put(r7, r2)
            java.lang.String r7 = "versionName"
            java.lang.String r8 = r8.versionName
            r0.put(r7, r8)
            java.lang.String r7 = "minecraftVersion"
            r0.put(r7, r9)
            java.lang.String r7 = "loader"
            java.lang.String r8 = normalizeLoader(r10)
            r0.put(r7, r8)
            java.lang.String r7 = "updatedAt"
            long r8 = java.lang.System.currentTimeMillis()
            r0.put(r7, r8)
            java.io.File r6 = getInstalledMetadataFile(r6)
            java.lang.String r7 = r0.toString(r1)
            writeTextFile(r6, r7)
            return
    }

    private static void writeTextFile(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create folder: "
            r3.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2c:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r3.getBytes(r2)     // Catch: java.lang.Throwable -> L3e
            r0.write(r2)     // Catch: java.lang.Throwable -> L3e
            r0.close()
            return
        L3e:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r3 = move-exception
            r2.addSuppressed(r3)
        L47:
            throw r2
    }
}
