package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModpackExportManager {
    private static final int BUFFER_SIZE = 65536;
    private static final java.lang.String JAVALAUNCHER_METADATA_DIRECTORY = ".javalauncher";
    private static final java.lang.String JAVALAUNCHER_PACK_ICON_ENTRY = "javalauncher-pack-icon.png";
    private static final java.lang.String MODPACK_FILES_MANIFEST_FILE = "modpack_files_manifest.json";
    private static final java.lang.String MODPACK_MANIFEST_FILE = "modpack_manifest.json";
    private static final java.lang.String TAG = "ModpackExport";

    public static final class ExportOptions {
        public final boolean includeConfig;
        public final boolean includeDefaultConfigs;
        public final boolean includeInstanceIcon;
        public final boolean includeKubeJs;
        public final boolean includeMods;
        public final boolean includeOptionsTxt;
        public final boolean includeResourcePacks;
        public final boolean includeSaves;
        public final boolean includeScripts;
        public final boolean includeShaderPacks;

        public ExportOptions(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
                r11 = this;
                r10 = 0
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r8 = r19
                r9 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        public ExportOptions(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
                r0 = this;
                r0.<init>()
                r0.includeInstanceIcon = r1
                r0.includeMods = r2
                r0.includeResourcePacks = r3
                r0.includeShaderPacks = r4
                r0.includeConfig = r5
                r0.includeDefaultConfigs = r6
                r0.includeKubeJs = r7
                r0.includeScripts = r8
                r0.includeOptionsTxt = r9
                r0.includeSaves = r10
                return
        }

        static ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions clean(ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r0) {
                if (r0 != 0) goto L6
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions r0 = defaultOptions()
            L6:
                return r0
        }

        public static ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions defaultOptions() {
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions r11 = new ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions
                r9 = 1
                r10 = 0
                r1 = 1
                r2 = 1
                r3 = 1
                r4 = 1
                r5 = 1
                r6 = 1
                r7 = 1
                r8 = 1
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }
    }

    private static final class FileRecord {
        final java.lang.String downloadUrl;
        final java.io.File file;
        final int fileId;
        final int projectId;
        final java.lang.String relativePath;
        final ca.dnamobile.javalauncher.modmanager.ModManagerSource source;

        FileRecord(java.io.File r2, java.lang.String r3, ca.dnamobile.javalauncher.modmanager.ModManagerSource r4, java.lang.String r5, int r6, int r7) {
                r1 = this;
                r1.<init>()
                r1.file = r2
                r2 = 92
                r0 = 47
                java.lang.String r2 = r3.replace(r2, r0)
                r1.relativePath = r2
                r1.source = r4
                r1.downloadUrl = r5
                r1.projectId = r6
                r1.fileId = r7
                return
        }

        static ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord fromEntry(java.io.File r13, java.lang.String r14, org.json.JSONObject r15) {
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
                if (r15 == 0) goto L8
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getSource(r15)     // Catch: java.lang.Throwable -> L8
            L8:
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r0 != r1) goto L47
                if (r15 == 0) goto L47
                java.lang.String[] r1 = new java.lang.String[r2]
                java.lang.String r6 = "source"
                r1[r5] = r6
                java.lang.String r6 = "platform"
                r1[r4] = r6
                java.lang.String r6 = "modpackPlatform"
                r1[r3] = r6
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.m544$$Nest$smoptStringAny(r15, r1)
                java.util.Locale r6 = java.util.Locale.US
                java.lang.String r1 = r1.toLowerCase(r6)
                java.lang.String r6 = "modrinth"
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L35
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
                goto L47
            L35:
                java.lang.String r6 = "curseforge"
                boolean r6 = r6.equals(r1)
                if (r6 != 0) goto L45
                java.lang.String r6 = "curse_forge"
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L47
            L45:
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            L47:
                r9 = r0
                r0 = 4
                java.lang.String[] r1 = new java.lang.String[r0]
                java.lang.String r6 = "downloadUrl"
                r1[r5] = r6
                java.lang.String r6 = "url"
                r1[r4] = r6
                java.lang.String r6 = "fileUrl"
                r1[r3] = r6
                java.lang.String r6 = "primaryDownloadUrl"
                r1[r2] = r6
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.m544$$Nest$smoptStringAny(r15, r1)
                boolean r6 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.m542$$Nest$smisBlank(r1)
                if (r6 == 0) goto L7f
                if (r15 == 0) goto L7f
                java.lang.String r6 = "downloads"
                org.json.JSONArray r6 = r15.optJSONArray(r6)
                if (r6 == 0) goto L7f
                int r7 = r6.length()
                if (r7 <= 0) goto L7f
                java.lang.String r1 = ""
                java.lang.String r1 = r6.optString(r5, r1)
                java.lang.String r1 = r1.trim()
            L7f:
                r10 = r1
                java.lang.String[] r0 = new java.lang.String[r0]
                java.lang.String r1 = "curseForgeProjectId"
                r0[r5] = r1
                java.lang.String r1 = "platformProjectId"
                r0[r4] = r1
                java.lang.String r1 = "projectId"
                r0[r3] = r1
                java.lang.String r1 = "modId"
                r0[r2] = r1
                int r11 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.m543$$Nest$smoptIntAny(r15, r0)
                java.lang.String[] r0 = new java.lang.String[r2]
                java.lang.String r1 = "curseForgeFileId"
                r0[r5] = r1
                java.lang.String r1 = "platformFileId"
                r0[r4] = r1
                java.lang.String r1 = "fileId"
                r0[r3] = r1
                int r12 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.m543$$Nest$smoptIntAny(r15, r0)
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$FileRecord r15 = new ca.dnamobile.javalauncher.modmanager.ModpackExportManager$FileRecord
                r6 = r15
                r7 = r13
                r8 = r14
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return r15
        }
    }

    public interface Listener {
        void onComplete(java.lang.String r1);

        void onError(java.lang.Throwable r1);

        void onProgress(int r1, int r2);

        void onStatus(java.lang.String r1);
    }

    public enum Platform extends java.lang.Enum<ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform CURSEFORGE = null;
        public static final ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform MODRINTH = null;
        public static final ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform MULTIMC = null;

        private static /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform[] $values() {
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r0 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.CURSEFORGE
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r2 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MULTIMC
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform[] r0 = new ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform[]{r0, r1, r2}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r0 = new ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform
                java.lang.String r1 = "MODRINTH"
                r2 = 0
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH = r0
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r0 = new ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform
                java.lang.String r1 = "CURSEFORGE"
                r2 = 1
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.CURSEFORGE = r0
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r0 = new ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform
                java.lang.String r1 = "MULTIMC"
                r2 = 2
                r0.<init>(r1, r2)
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MULTIMC = r0
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform[] r0 = $values()
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.$VALUES = r0
                return
        }

        Platform(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform> r0 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = (ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform[] values() {
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform[] r0 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform[] r0 = (ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform[]) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smisBlank, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m542$$Nest$smisBlank(java.lang.String r0) {
            boolean r0 = isBlank(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smoptIntAny, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m543$$Nest$smoptIntAny(org.json.JSONObject r0, java.lang.String[] r1) {
            int r0 = optIntAny(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smoptStringAny, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m544$$Nest$smoptStringAny(org.json.JSONObject r0, java.lang.String[] r1) {
            java.lang.String r0 = optStringAny(r0, r1)
            return r0
    }

    private ModpackExportManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addCommonOverrides(java.util.zip.ZipOutputStream r2, java.io.File r3, java.util.ArrayList<java.lang.String> r4, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r5) throws java.lang.Exception {
            java.lang.String r0 = "config"
            boolean r1 = r5.includeConfig
            addOverrideFolderIfSelected(r2, r3, r0, r1)
            java.lang.String r0 = "defaultconfigs"
            boolean r1 = r5.includeDefaultConfigs
            addOverrideFolderIfSelected(r2, r3, r0, r1)
            java.lang.String r0 = "kubejs"
            boolean r1 = r5.includeKubeJs
            addOverrideFolderIfSelected(r2, r3, r0, r1)
            java.lang.String r0 = "scripts"
            boolean r1 = r5.includeScripts
            addOverrideFolderIfSelected(r2, r3, r0, r1)
            boolean r0 = r5.includeSaves
            java.lang.String r1 = "saves"
            addOverrideFolderIfSelected(r2, r3, r1, r0)
            boolean r0 = r5.includeSaves
            if (r0 == 0) goto L37
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r1)
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L37
            java.lang.String r0 = "saves folder was included for private sharing. Remove it before publishing unless you intentionally want to ship worlds."
            r4.add(r0)
        L37:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "options.txt"
            r0.<init>(r3, r1)
            boolean r3 = r5.includeOptionsTxt
            if (r3 == 0) goto L52
            boolean r3 = r0.isFile()
            if (r3 == 0) goto L52
            java.lang.String r3 = "overrides/options.txt"
            addFileToZip(r2, r0, r3)
            java.lang.String r2 = "options.txt was included for private sharing. Remove it before publishing if it contains personal settings you do not want to ship."
            r4.add(r2)
        L52:
            return
    }

    private static void addExportRootIfSelected(java.util.ArrayList<java.io.File> r0, java.io.File r1, java.lang.String r2, boolean r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r2)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L11
            r0.add(r3)
        L11:
            return
    }

    private static void addFileOrDirectoryToZip(java.util.zip.ZipOutputStream r5, java.io.File r6, java.lang.String r7) throws java.lang.Exception {
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L34
            java.io.File[] r6 = r6.listFiles()
            if (r6 != 0) goto Ld
            return
        Ld:
            int r0 = r6.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L3d
            r2 = r6[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = "/"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r2.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            addFileOrDirectoryToZip(r5, r2, r3)
            int r1 = r1 + 1
            goto Lf
        L34:
            boolean r0 = r6.isFile()
            if (r0 == 0) goto L3d
            addFileToZip(r5, r6, r7)
        L3d:
            return
    }

    private static void addFileToZip(java.util.zip.ZipOutputStream r2, java.io.File r3, java.lang.String r4) throws java.lang.Exception {
            r0 = 92
            r1 = 47
            java.lang.String r4 = r4.replace(r0, r1)
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
            r0.<init>(r4)
            r2.putNextEntry(r0)
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r3)
            copyStream(r4, r2)     // Catch: java.lang.Throwable -> L1f
            r4.close()
            r2.closeEntry()
            return
        L1f:
            r2 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r3 = move-exception
            r2.addSuppressed(r3)
        L28:
            throw r2
    }

    private static void addInstanceIconToZip(java.util.zip.ZipOutputStream r4, java.io.File r5) throws java.lang.Exception {
            if (r5 == 0) goto L18
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L18
            long r0 = r5.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L13
            goto L18
        L13:
            java.lang.String r0 = "javalauncher-pack-icon.png"
            addFileToZip(r4, r5, r0)
        L18:
            return
    }

    private static void addModrinthLoaderDependency(org.json.JSONObject r0, java.io.File r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.lang.String r1 = resolveLoaderVersion(r1, r2, r3, r4)
            boolean r2 = isBlank(r1)
            if (r2 == 0) goto L2e
            java.lang.String r0 = "Vanilla"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L13
            return
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " loader version for export. Open this instance once after installing the modpack, or reinstall the pack so JavaLauncher can write .javalauncher/modpack_manifest.json."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            java.lang.String r2 = "Fabric"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L3c
            java.lang.String r2 = "fabric-loader"
            r0.put(r2, r1)
            goto L65
        L3c:
            java.lang.String r2 = "Forge"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L4a
            java.lang.String r2 = "forge"
            r0.put(r2, r1)
            goto L65
        L4a:
            java.lang.String r2 = "NeoForge"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L58
            java.lang.String r2 = "neoforge"
            r0.put(r2, r1)
            goto L65
        L58:
            java.lang.String r2 = "Quilt"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L65
            java.lang.String r2 = "quilt-loader"
            r0.put(r2, r1)
        L65:
            return
    }

    private static void addOverrideFolderIfSelected(java.util.zip.ZipOutputStream r1, java.io.File r2, java.lang.String r3, boolean r4) throws java.lang.Exception {
            if (r4 != 0) goto L3
            return
        L3:
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r3)
            boolean r2 = r4.exists()
            if (r2 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "overrides/"
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            addFileOrDirectoryToZip(r1, r4, r2)
        L20:
            return
    }

    private static void addTextEntry(java.util.zip.ZipOutputStream r1, java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
            r0.<init>(r2)
            r1.putNextEntry(r0)
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r3.getBytes(r2)
            r1.write(r2)
            r1.closeEntry()
            return
    }

    private static void addUniqueFile(java.util.ArrayList<java.io.File> r3, java.io.File r4) {
            if (r4 == 0) goto L2b
            boolean r0 = r4.isFile()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.lang.String r0 = safeCanonicalPath(r4)
            java.util.Iterator r1 = r3.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = safeCanonicalPath(r2)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L11
            return
        L28:
            r3.add(r4)
        L2b:
            return
    }

    private static void addUniqueString(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            boolean r0 = isBlank(r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Iterator r0 = r3.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r4.trim()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto Lb
            return
        L22:
            java.lang.String r4 = r4.trim()
            r3.add(r4)
            return
    }

    private static void addVersionJsonCandidate(java.util.ArrayList<java.io.File> r4, java.io.File r5, java.lang.String r6) {
            if (r5 == 0) goto L52
            boolean r0 = isBlank(r6)
            if (r0 == 0) goto L9
            goto L52
        L9:
            java.lang.String r6 = r6.trim()
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            r1.<init>(r5, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L33
            addUniqueFile(r4, r0)
        L33:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            r0.<init>(r5, r6)
            boolean r5 = r0.isFile()
            if (r5 == 0) goto L52
            addUniqueFile(r4, r0)
        L52:
            return
    }

    private static void addWarnings(java.util.zip.ZipOutputStream r2, java.util.ArrayList<java.lang.String> r3, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r4) throws java.lang.Exception {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JavaLauncher modpack export warnings\n\n"
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH
            if (r4 != r1) goto L18
            java.lang.String r4 = "Modrinth publishing note: .mrpack uploads should reference allowed remote downloads where possible. Files in overrides may be rejected if they are redistributed mods/resource packs without permission.\n\n"
            r0.append(r4)
            goto L27
        L18:
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.CURSEFORGE
            if (r4 != r1) goto L22
            java.lang.String r4 = "CurseForge publishing note: CurseForge project uploads normally expect CurseForge-hosted files in manifest.json. Files in overrides/mods may be rejected unless they are approved third-party resources.\n\n"
            r0.append(r4)
            goto L27
        L22:
            java.lang.String r4 = "MultiMC/Prism sharing note: this export bundles .minecraft files directly. Make sure every included resource is allowed to be redistributed before sharing.\n\n"
            r0.append(r4)
        L27:
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "- "
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.StringBuilder r4 = r1.append(r4)
            r1 = 10
            r4.append(r1)
            goto L2b
        L47:
            java.lang.String r3 = "EXPORT_WARNINGS.txt"
            java.lang.String r4 = r0.toString()
            addTextEntry(r2, r3, r4)
            return
    }

    private static java.lang.String buildCurseForgeLoaderId(java.lang.String r2, java.lang.String r3) {
            boolean r0 = isBlank(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "Fabric"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "fabric-"
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L21:
            java.lang.String r0 = "Forge"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "forge-"
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L39:
            java.lang.String r0 = "NeoForge"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "neoforge-"
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L51:
            java.lang.String r0 = "Quilt"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "quilt-"
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L69:
            return r1
    }

    private static org.json.JSONObject buildCurseForgeMinecraftBlock(java.io.File r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "version"
            r0.put(r1, r3)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = resolveLoaderVersion(r2, r3, r4, r5)
            java.lang.String r3 = "Vanilla"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L3d
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L22
            goto L3d
        L22:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to resolve "
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " loader version for CurseForge export. Reinstall the pack or repair its JavaLauncher metadata first."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            java.lang.String r2 = buildCurseForgeLoaderId(r4, r2)
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L5a
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "id"
            r3.put(r4, r2)
            java.lang.String r2 = "primary"
            r4 = 1
            r3.put(r2, r4)
            r1.put(r3)
        L5a:
            java.lang.String r2 = "modLoaders"
            r0.put(r2, r1)
            return r0
    }

    private static java.lang.String buildModListHtml(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<ul>\n"
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r3.next()
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$FileRecord r1 = (ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord) r1
            java.lang.String r2 = "  <li>"
            java.lang.StringBuilder r2 = r0.append(r2)
            java.io.File r1 = r1.file
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = escapeHtml(r1)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "</li>\n"
            r1.append(r2)
            goto Lb
        L31:
            java.lang.String r3 = "</ul>\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String buildMultiMcInstanceCfg(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InstanceType=OneSix\nname="
            r0.<init>(r1)
            java.lang.String r2 = sanitizeMultiMcCfgValue(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "\niconKey=default\nnotes=Exported from JavaLauncher.\n"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static java.lang.String buildMultiMcLoaderUid(java.lang.String r2) {
            boolean r0 = isBlank(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "Fabric"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L14
            java.lang.String r2 = "net.fabricmc.fabric-loader"
            return r2
        L14:
            java.lang.String r0 = "Forge"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L1f
            java.lang.String r2 = "net.minecraftforge"
            return r2
        L1f:
            java.lang.String r0 = "NeoForge"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L2a
            java.lang.String r2 = "net.neoforged"
            return r2
        L2a:
            java.lang.String r0 = "Quilt"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L35
            java.lang.String r2 = "org.quiltmc.quilt-loader"
            return r2
        L35:
            return r1
    }

    private static org.json.JSONObject buildMultiMcPackJson(java.io.File r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "formatVersion"
            r2 = 1
            r0.put(r1, r2)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "cachedName"
            java.lang.String r5 = "Minecraft"
            r3.put(r4, r5)
            java.lang.String r4 = "net.minecraft"
            java.lang.String r5 = "uid"
            r3.put(r5, r4)
            java.lang.String r4 = "version"
            r3.put(r4, r8)
            java.lang.String r6 = "important"
            r3.put(r6, r2)
            r1.put(r3)
            java.lang.String r7 = resolveLoaderVersion(r7, r8, r9, r10)
            java.lang.String r8 = buildMultiMcLoaderUid(r9)
            boolean r10 = isBlank(r8)
            if (r10 != 0) goto L60
            boolean r10 = isBlank(r7)
            if (r10 != 0) goto L45
            goto L60
        L45:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to resolve "
            r8.<init>(r10)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " loader version for MultiMC/Prism export. Reinstall the pack or repair its JavaLauncher metadata first."
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L60:
            boolean r9 = isBlank(r8)
            if (r9 != 0) goto L7d
            boolean r9 = isBlank(r7)
            if (r9 != 0) goto L7d
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r9.put(r5, r8)
            r9.put(r4, r7)
            r9.put(r6, r2)
            r1.put(r9)
        L7d:
            java.lang.String r7 = "components"
            r0.put(r7, r1)
            return r0
    }

    private static java.lang.String buildMultiMcReadme(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JavaLauncher MultiMC/Prism export\n\nInstance: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "\n\nThis ZIP contains instance.cfg, mmc-pack.json, and .minecraft content. It is intended for MultiMC/Prism-style import from zip and private sharing. Before public sharing, verify redistribution permissions for every included mod, resource pack, shader pack, and config file.\n"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord> collectContentRecords(java.io.File r3, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r4.includeMods
            if (r1 == 0) goto L10
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            java.lang.String r2 = "mods"
            collectFolderRecords(r3, r1, r2, r0)
        L10:
            boolean r1 = r4.includeResourcePacks
            if (r1 == 0) goto L1b
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            java.lang.String r2 = "resourcepacks"
            collectFolderRecords(r3, r1, r2, r0)
        L1b:
            boolean r4 = r4.includeShaderPacks
            if (r4 == 0) goto L26
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r4 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            java.lang.String r1 = "shaderpacks"
            collectFolderRecords(r3, r4, r1, r0)
        L26:
            return r0
    }

    private static void collectFolderRecords(java.io.File r6, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7, java.lang.String r8, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord> r9) {
            java.io.File r0 = new java.io.File
            r0.<init>(r6, r8)
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto Lc
            return
        Lc:
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L6b
            r3 = r0[r2]
            boolean r4 = r3.isHidden()
            if (r4 != 0) goto L68
            boolean r4 = r3.isFile()
            if (r4 != 0) goto L1f
            goto L68
        L1f:
            java.lang.String r4 = r3.getName()
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = ".jar"
            boolean r5 = r4.endsWith(r5)
            if (r5 != 0) goto L3a
            java.lang.String r5 = ".zip"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L3a
            goto L68
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r5 = "/"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            org.json.JSONObject r5 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.getInstalledEntryForFile(r6, r7, r3)     // Catch: java.lang.Throwable -> L5a
            goto L5b
        L5a:
            r5 = 0
        L5b:
            if (r5 != 0) goto L61
            org.json.JSONObject r5 = findJavaLauncherInstalledContentEntry(r6, r3, r4)
        L61:
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$FileRecord r3 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord.fromEntry(r3, r4, r5)
            r9.add(r3)
        L68:
            int r2 = r2 + 1
            goto Le
        L6b:
            return
    }

    private static void collectLoaderVersionsFromMavenDirectory(java.util.ArrayList<java.lang.String> r6, java.io.File r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.io.File[] r7 = r7.listFiles()
            if (r7 != 0) goto L7
            return
        L7:
            int r0 = r7.length
            r1 = 0
        L9:
            if (r1 >= r0) goto La9
            r2 = r7[r1]
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L15
            goto La5
        L15:
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = stripMinecraftVersionPrefix(r2, r9)
            java.lang.String r3 = normalizeResolvedLoaderVersion(r8, r3)
            boolean r4 = looksLikeLoaderVersion(r8, r3)
            if (r4 != 0) goto L2d
            goto La5
        L2d:
            boolean r4 = isBlank(r10)
            if (r4 != 0) goto L59
            java.lang.String r4 = r10.trim()
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r5 = r2.toLowerCase(r5)
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L55
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r5 = r3.toLowerCase(r5)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L59
        L55:
            addUniqueString(r6, r3)
            goto La5
        L59:
            boolean r4 = isBlank(r9)
            if (r4 != 0) goto L80
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r9.trim()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "-"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r2 = r2.startsWith(r4)
            if (r2 == 0) goto L80
            addUniqueString(r6, r3)
            goto La5
        L80:
            java.lang.String r2 = "NeoForge"
            boolean r2 = r2.equalsIgnoreCase(r8)
            if (r2 == 0) goto L92
            boolean r2 = neoforgeVersionMatchesMinecraft(r3, r9)
            if (r2 == 0) goto L92
            addUniqueString(r6, r3)
            goto La5
        L92:
            java.lang.String r2 = "Fabric"
            boolean r2 = r2.equalsIgnoreCase(r8)
            if (r2 != 0) goto La2
            java.lang.String r2 = "Quilt"
            boolean r2 = r2.equalsIgnoreCase(r8)
            if (r2 == 0) goto La5
        La2:
            addUniqueString(r6, r3)
        La5:
            int r1 = r1 + 1
            goto L9
        La9:
            return
    }

    private static java.util.ArrayList<java.io.File> collectMultiMcExportRoots(java.io.File r3, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "mods"
            boolean r2 = r4.includeMods
            addExportRootIfSelected(r0, r3, r1, r2)
            java.lang.String r1 = "resourcepacks"
            boolean r2 = r4.includeResourcePacks
            addExportRootIfSelected(r0, r3, r1, r2)
            java.lang.String r1 = "shaderpacks"
            boolean r2 = r4.includeShaderPacks
            addExportRootIfSelected(r0, r3, r1, r2)
            java.lang.String r1 = "config"
            boolean r2 = r4.includeConfig
            addExportRootIfSelected(r0, r3, r1, r2)
            java.lang.String r1 = "defaultconfigs"
            boolean r2 = r4.includeDefaultConfigs
            addExportRootIfSelected(r0, r3, r1, r2)
            java.lang.String r1 = "kubejs"
            boolean r2 = r4.includeKubeJs
            addExportRootIfSelected(r0, r3, r1, r2)
            java.lang.String r1 = "scripts"
            boolean r2 = r4.includeScripts
            addExportRootIfSelected(r0, r3, r1, r2)
            java.lang.String r1 = "saves"
            boolean r4 = r4.includeSaves
            addExportRootIfSelected(r0, r3, r1, r4)
            return r0
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

    private static java.lang.String escapeHtml(java.lang.String r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.String r0 = "&"
            java.lang.String r1 = "&amp;"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "<"
            java.lang.String r1 = "&lt;"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = ">"
            java.lang.String r1 = "&gt;"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "\""
            java.lang.String r1 = "&quot;"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private static void exportCurseForge(java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.io.File r13, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r14, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener r15) throws java.lang.Exception {
            java.util.ArrayList r0 = collectContentRecords(r8, r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "minecraft"
            org.json.JSONObject r10 = buildCurseForgeMinecraftBlock(r8, r10, r11, r12)
            r3.put(r4, r10)
            java.lang.String r10 = "manifestType"
            java.lang.String r11 = "minecraftModpack"
            r3.put(r10, r11)
            java.lang.String r10 = "manifestVersion"
            r11 = 1
            r3.put(r10, r11)
            java.lang.String r10 = "name"
            r3.put(r10, r9)
            java.lang.String r9 = "version"
            java.lang.String r10 = "1.0.0"
            r3.put(r9, r10)
            java.lang.String r9 = "author"
            java.lang.String r10 = "JavaLauncher"
            r3.put(r9, r10)
            java.lang.String r9 = "overrides"
            r3.put(r9, r9)
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.zip.ZipOutputStream r10 = new java.util.zip.ZipOutputStream
            java.io.FileOutputStream r12 = new java.io.FileOutputStream
            r12.<init>(r7)
            r10.<init>(r12)
            boolean r7 = r14.includeInstanceIcon     // Catch: java.lang.Throwable -> L13a
            if (r7 == 0) goto L57
            addInstanceIconToZip(r10, r13)     // Catch: java.lang.Throwable -> L13a
        L57:
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L13a
            r12 = 0
        L5c:
            boolean r13 = r7.hasNext()     // Catch: java.lang.Throwable -> L13a
            if (r13 == 0) goto L116
            java.lang.Object r13 = r7.next()     // Catch: java.lang.Throwable -> L13a
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$FileRecord r13 = (ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord) r13     // Catch: java.lang.Throwable -> L13a
            int r12 = r12 + r11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13a
            r4.<init>()     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = "Adding "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = r13.relativePath     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = "..."
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L13a
            r15.onStatus(r4)     // Catch: java.lang.Throwable -> L13a
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L13a
            int r4 = java.lang.Math.max(r11, r4)     // Catch: java.lang.Throwable -> L13a
            r15.onProgress(r12, r4)     // Catch: java.lang.Throwable -> L13a
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r4 = r13.source     // Catch: java.lang.Throwable -> L13a
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r5 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE     // Catch: java.lang.Throwable -> L13a
            if (r4 != r5) goto Le2
            int r4 = r13.projectId     // Catch: java.lang.Throwable -> L13a
            if (r4 <= 0) goto Le2
            int r4 = r13.fileId     // Catch: java.lang.Throwable -> L13a
            if (r4 <= 0) goto Le2
            int r4 = r13.projectId     // Catch: java.lang.Throwable -> L13a
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L13a
            boolean r4 = r2.add(r4)     // Catch: java.lang.Throwable -> L13a
            if (r4 == 0) goto Lc8
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13a
            r4.<init>()     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = "projectID"
            int r6 = r13.projectId     // Catch: java.lang.Throwable -> L13a
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = "fileID"
            int r13 = r13.fileId     // Catch: java.lang.Throwable -> L13a
            r4.put(r5, r13)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r13 = "required"
            r4.put(r13, r11)     // Catch: java.lang.Throwable -> L13a
            r9.put(r4)     // Catch: java.lang.Throwable -> L13a
            goto L5c
        Lc8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13a
            r4.<init>()     // Catch: java.lang.Throwable -> L13a
            java.lang.String r13 = r13.relativePath     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r13 = r4.append(r13)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r4 = " was skipped from CurseForge manifest because another file from the same project was already listed."
            java.lang.StringBuilder r13 = r13.append(r4)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L13a
            r1.add(r13)     // Catch: java.lang.Throwable -> L13a
            goto L5c
        Le2:
            java.io.File r4 = r13.file     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13a
            r5.<init>()     // Catch: java.lang.Throwable -> L13a
            java.lang.String r6 = "overrides/"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r6 = r13.relativePath     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L13a
            addFileToZip(r10, r4, r5)     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13a
            r4.<init>()     // Catch: java.lang.Throwable -> L13a
            java.lang.String r13 = r13.relativePath     // Catch: java.lang.Throwable -> L13a
            java.lang.StringBuilder r13 = r4.append(r13)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r4 = " was exported as an override because it is not tracked as a CurseForge project/file id."
            java.lang.StringBuilder r13 = r13.append(r4)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L13a
            r1.add(r13)     // Catch: java.lang.Throwable -> L13a
            goto L5c
        L116:
            addCommonOverrides(r10, r8, r1, r14)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r7 = "files"
            r3.put(r7, r9)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r7 = "manifest.json"
            r8 = 2
            java.lang.String r8 = r3.toString(r8)     // Catch: java.lang.Throwable -> L13a
            addTextEntry(r10, r7, r8)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r7 = "modlist.html"
            java.lang.String r8 = buildModListHtml(r0)     // Catch: java.lang.Throwable -> L13a
            addTextEntry(r10, r7, r8)     // Catch: java.lang.Throwable -> L13a
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r7 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.CURSEFORGE     // Catch: java.lang.Throwable -> L13a
            addWarnings(r10, r1, r7)     // Catch: java.lang.Throwable -> L13a
            r10.close()
            return
        L13a:
            r7 = move-exception
            r10.close()     // Catch: java.lang.Throwable -> L13f
            goto L143
        L13f:
            r8 = move-exception
            r7.addSuppressed(r8)
        L143:
            throw r7
    }

    private static void exportModrinth(java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.io.File r13, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r14, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener r15) throws java.lang.Exception {
            java.util.ArrayList r0 = collectContentRecords(r8, r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "formatVersion"
            r4 = 1
            r2.put(r3, r4)
            java.lang.String r3 = "game"
            java.lang.String r5 = "minecraft"
            r2.put(r3, r5)
            java.lang.String r3 = "versionId"
            java.lang.String r6 = "1.0.0"
            r2.put(r3, r6)
            java.lang.String r3 = "name"
            r2.put(r3, r9)
            java.lang.String r9 = "summary"
            java.lang.String r3 = "Exported from JavaLauncher"
            r2.put(r9, r3)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r9.put(r5, r10)
            addModrinthLoaderDependency(r9, r8, r10, r11, r12)
            java.lang.String r10 = "dependencies"
            r2.put(r10, r9)
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.zip.ZipOutputStream r10 = new java.util.zip.ZipOutputStream
            java.io.FileOutputStream r11 = new java.io.FileOutputStream
            r11.<init>(r7)
            r10.<init>(r11)
            boolean r7 = r14.includeInstanceIcon     // Catch: java.lang.Throwable -> L14f
            if (r7 == 0) goto L54
            addInstanceIconToZip(r10, r13)     // Catch: java.lang.Throwable -> L14f
        L54:
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L14f
            r11 = 0
        L59:
            boolean r12 = r7.hasNext()     // Catch: java.lang.Throwable -> L14f
            if (r12 == 0) goto L134
            java.lang.Object r12 = r7.next()     // Catch: java.lang.Throwable -> L14f
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$FileRecord r12 = (ca.dnamobile.javalauncher.modmanager.ModpackExportManager.FileRecord) r12     // Catch: java.lang.Throwable -> L14f
            int r11 = r11 + r4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14f
            r13.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "Adding "
            java.lang.StringBuilder r13 = r13.append(r3)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = r12.relativePath     // Catch: java.lang.Throwable -> L14f
            java.lang.StringBuilder r13 = r13.append(r3)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "..."
            java.lang.StringBuilder r13 = r13.append(r3)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L14f
            r15.onStatus(r13)     // Catch: java.lang.Throwable -> L14f
            int r13 = r0.size()     // Catch: java.lang.Throwable -> L14f
            int r13 = java.lang.Math.max(r4, r13)     // Catch: java.lang.Throwable -> L14f
            r15.onProgress(r11, r13)     // Catch: java.lang.Throwable -> L14f
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r13 = r12.source     // Catch: java.lang.Throwable -> L14f
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH     // Catch: java.lang.Throwable -> L14f
            if (r13 != r3) goto L100
            java.lang.String r13 = r12.downloadUrl     // Catch: java.lang.Throwable -> L14f
            boolean r13 = isBlank(r13)     // Catch: java.lang.Throwable -> L14f
            if (r13 != 0) goto L100
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14f
            r13.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "path"
            java.lang.String r5 = r12.relativePath     // Catch: java.lang.Throwable -> L14f
            r13.put(r3, r5)     // Catch: java.lang.Throwable -> L14f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14f
            r3.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = "sha1"
            java.io.File r6 = r12.file     // Catch: java.lang.Throwable -> L14f
            java.lang.String r6 = sha1(r6)     // Catch: java.lang.Throwable -> L14f
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = "sha512"
            java.io.File r6 = r12.file     // Catch: java.lang.Throwable -> L14f
            java.lang.String r6 = sha512(r6)     // Catch: java.lang.Throwable -> L14f
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = "hashes"
            r13.put(r5, r3)     // Catch: java.lang.Throwable -> L14f
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14f
            r3.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = r12.downloadUrl     // Catch: java.lang.Throwable -> L14f
            r3.put(r5)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = "downloads"
            r13.put(r5, r3)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "fileSize"
            java.io.File r12 = r12.file     // Catch: java.lang.Throwable -> L14f
            long r5 = r12.length()     // Catch: java.lang.Throwable -> L14f
            r13.put(r3, r5)     // Catch: java.lang.Throwable -> L14f
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14f
            r12.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "client"
            java.lang.String r5 = "required"
            r12.put(r3, r5)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "server"
            java.lang.String r5 = "optional"
            r12.put(r3, r5)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = "env"
            r13.put(r3, r12)     // Catch: java.lang.Throwable -> L14f
            r9.put(r13)     // Catch: java.lang.Throwable -> L14f
            goto L59
        L100:
            java.io.File r13 = r12.file     // Catch: java.lang.Throwable -> L14f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14f
            r3.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = "overrides/"
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r5 = r12.relativePath     // Catch: java.lang.Throwable -> L14f
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L14f
            addFileToZip(r10, r13, r3)     // Catch: java.lang.Throwable -> L14f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14f
            r13.<init>()     // Catch: java.lang.Throwable -> L14f
            java.lang.String r12 = r12.relativePath     // Catch: java.lang.Throwable -> L14f
            java.lang.StringBuilder r12 = r13.append(r12)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r13 = " was exported as an override because it is not tracked as a Modrinth file with a download URL."
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L14f
            r1.add(r12)     // Catch: java.lang.Throwable -> L14f
            goto L59
        L134:
            addCommonOverrides(r10, r8, r1, r14)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r7 = "files"
            r2.put(r7, r9)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r7 = "modrinth.index.json"
            r8 = 2
            java.lang.String r8 = r2.toString(r8)     // Catch: java.lang.Throwable -> L14f
            addTextEntry(r10, r7, r8)     // Catch: java.lang.Throwable -> L14f
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r7 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH     // Catch: java.lang.Throwable -> L14f
            addWarnings(r10, r1, r7)     // Catch: java.lang.Throwable -> L14f
            r10.close()
            return
        L14f:
            r7 = move-exception
            r10.close()     // Catch: java.lang.Throwable -> L154
            goto L158
        L154:
            r8 = move-exception
            r7.addSuppressed(r8)
        L158:
            throw r7
    }

    private static void exportMultiMc(java.io.File r4, java.io.File r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.io.File r10, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r11, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener r12) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r4)
            r1.<init>(r2)
            boolean r4 = r11.includeInstanceIcon     // Catch: java.lang.Throwable -> Ld7
            if (r4 == 0) goto L16
            addInstanceIconToZip(r1, r10)     // Catch: java.lang.Throwable -> Ld7
        L16:
            java.lang.String r4 = "Writing MultiMC metadata..."
            r12.onStatus(r4)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "instance.cfg"
            java.lang.String r10 = buildMultiMcInstanceCfg(r6)     // Catch: java.lang.Throwable -> Ld7
            addTextEntry(r1, r4, r10)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "mmc-pack.json"
            org.json.JSONObject r7 = buildMultiMcPackJson(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld7
            r8 = 2
            java.lang.String r7 = r7.toString(r8)     // Catch: java.lang.Throwable -> Ld7
            addTextEntry(r1, r4, r7)     // Catch: java.lang.Throwable -> Ld7
            java.util.ArrayList r4 = collectMultiMcExportRoots(r5, r11)     // Catch: java.lang.Throwable -> Ld7
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> Ld7
            r8 = 0
        L3b:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> Ld7
            java.io.File r9 = (java.io.File) r9     // Catch: java.lang.Throwable -> Ld7
            r10 = 1
            int r8 = r8 + r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r2.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = "Adding .minecraft/"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = r9.getName()     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r3 = "..."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld7
            r12.onStatus(r2)     // Catch: java.lang.Throwable -> Ld7
            int r2 = r4.size()     // Catch: java.lang.Throwable -> Ld7
            int r10 = java.lang.Math.max(r10, r2)     // Catch: java.lang.Throwable -> Ld7
            r12.onProgress(r8, r10)     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r10.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = ".minecraft/"
            java.lang.StringBuilder r10 = r10.append(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = r9.getName()     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r10 = r10.append(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Ld7
            addFileOrDirectoryToZip(r1, r9, r10)     // Catch: java.lang.Throwable -> Ld7
            goto L3b
        L8f:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r7 = "options.txt"
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> Ld7
            boolean r7 = r11.includeOptionsTxt     // Catch: java.lang.Throwable -> Ld7
            if (r7 == 0) goto Laa
            boolean r7 = r4.isFile()     // Catch: java.lang.Throwable -> Ld7
            if (r7 == 0) goto Laa
            java.lang.String r7 = ".minecraft/options.txt"
            addFileToZip(r1, r4, r7)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "options.txt was included for private sharing. Remove it before sharing if it contains personal settings you do not want to ship."
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld7
        Laa:
            boolean r4 = r11.includeSaves     // Catch: java.lang.Throwable -> Ld7
            if (r4 == 0) goto Lc0
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r7 = "saves"
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> Ld7
            boolean r4 = r4.isDirectory()     // Catch: java.lang.Throwable -> Ld7
            if (r4 == 0) goto Lc0
            java.lang.String r4 = "saves folder was included for private sharing. Remove it before sharing if you do not want to ship worlds."
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld7
        Lc0:
            java.lang.String r4 = "MultiMC/Prism exports bundle files directly. Before sharing, make sure every bundled mod/resourcepack/shader/config is allowed to be redistributed."
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = "README_JAVALAUNCHER_MULTIMC.txt"
            java.lang.String r5 = buildMultiMcReadme(r6)     // Catch: java.lang.Throwable -> Ld7
            addTextEntry(r1, r4, r5)     // Catch: java.lang.Throwable -> Ld7
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r4 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MULTIMC     // Catch: java.lang.Throwable -> Ld7
            addWarnings(r1, r0, r4)     // Catch: java.lang.Throwable -> Ld7
            r1.close()
            return
        Ld7:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Ldc
            goto Le0
        Ldc:
            r5 = move-exception
            r4.addSuppressed(r5)
        Le0:
            throw r4
    }

    public static void exportToUri(android.content.Context r10, java.io.File r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r16, android.net.Uri r17, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener r18) {
            r6 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            exportToUri(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void exportToUri(android.content.Context r12, java.io.File r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.io.File r18, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r19, android.net.Uri r20, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r21, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener r22) {
            r0 = r19
            r9 = r22
            java.lang.String r10 = "Exported modpack: "
            java.lang.String r1 = "Missing instance game directory: "
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions r7 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions.clean(r21)
            r2 = 0
            boolean r3 = r13.isDirectory()     // Catch: java.lang.Throwable -> Ld7
            if (r3 == 0) goto Lc0
            java.lang.String r1 = "Building modpack export..."
            r9.onStatus(r1)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = "javalauncher-modpack-export-"
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r3 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH     // Catch: java.lang.Throwable -> Ld7
            if (r0 != r3) goto L21
            java.lang.String r3 = ".mrpack"
            goto L23
        L21:
            java.lang.String r3 = ".zip"
        L23:
            java.io.File r4 = r12.getCacheDir()     // Catch: java.lang.Throwable -> Ld7
            java.io.File r11 = java.io.File.createTempFile(r1, r3, r4)     // Catch: java.lang.Throwable -> Ld7
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r1) goto L3f
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r22
            exportModrinth(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbd
            goto L62
        L3f:
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.CURSEFORGE     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r1) goto L53
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r22
            exportCurseForge(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbd
            goto L62
        L53:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r22
            exportMultiMc(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbd
        L62:
            java.lang.String r0 = "Saving export..."
            r9.onStatus(r0)     // Catch: java.lang.Throwable -> Lbd
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r11)     // Catch: java.lang.Throwable -> Lbd
            android.content.ContentResolver r0 = r12.getContentResolver()     // Catch: java.lang.Throwable -> Lb1
            r2 = r20
            java.io.OutputStream r2 = r0.openOutputStream(r2)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L9d
            copyStream(r1, r2)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L80
            r2.close()     // Catch: java.lang.Throwable -> Lb1
        L80:
            r1.close()     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Lbd
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r14)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbd
            r9.onComplete(r0)     // Catch: java.lang.Throwable -> Lbd
            if (r11 == 0) goto Le7
            r11.delete()
            goto Le7
        L9a:
            r0 = move-exception
            r3 = r0
            goto La5
        L9d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "Unable to open export destination."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9a
            throw r0     // Catch: java.lang.Throwable -> L9a
        La5:
            if (r2 == 0) goto Lb0
            r2.close()     // Catch: java.lang.Throwable -> Lab
            goto Lb0
        Lab:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> Lb1
        Lb0:
            throw r3     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbc
        Lb7:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> Lbd
        Lbc:
            throw r2     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            r2 = r11
            goto Ld8
        Lc0:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld7
            throw r0     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r0 = move-exception
        Ld8:
            java.lang.String r1 = "ModpackExport"
            java.lang.String r3 = "Unable to export modpack"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r3, r0)     // Catch: java.lang.Throwable -> Le8
            r9.onError(r0)     // Catch: java.lang.Throwable -> Le8
            if (r2 == 0) goto Le7
            r2.delete()
        Le7:
            return
        Le8:
            r0 = move-exception
            if (r2 == 0) goto Lee
            r2.delete()
        Lee:
            throw r0
    }

    public static void exportToUri(android.content.Context r11, java.io.File r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.io.File r17, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r18, android.net.Uri r19, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Listener r20) {
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions r9 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions.defaultOptions()
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r20
            exportToUri(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private static java.lang.String extractAfterMarker(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            int r1 = r1.indexOf(r2)
            if (r1 >= 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = r0.trim()
            r1 = 45
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L27
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.String r0 = r0.trim()
        L27:
            return r0
    }

    private static org.json.JSONObject findJavaLauncherInstalledContentEntry(java.io.File r18, java.io.File r19, java.lang.String r20) {
            java.lang.String r0 = ""
            java.io.File r1 = new java.io.File
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ".javalauncher"
            r4 = r18
            r2.<init>(r4, r3)
            java.lang.String r3 = "modpack_files_manifest.json"
            r1.<init>(r2, r3)
            boolean r2 = r1.isFile()
            r3 = 0
            if (r2 != 0) goto L1a
            return r3
        L1a:
            java.lang.String r2 = safeCanonicalPath(r19)
            java.lang.String r4 = r19.getAbsolutePath()
            r5 = 92
            r6 = 47
            r7 = r20
            java.lang.String r7 = r7.replace(r5, r6)
            java.lang.String r8 = r19.getName()
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = readTextFile(r1)     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "files"
            org.json.JSONArray r1 = r9.optJSONArray(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L42
            return r3
        L42:
            r9 = 0
            r11 = r3
            r10 = r9
        L45:
            int r12 = r1.length()     // Catch: java.lang.Throwable -> Lcb
            if (r10 >= r12) goto Lca
            org.json.JSONObject r12 = r1.optJSONObject(r10)     // Catch: java.lang.Throwable -> Lcb
            if (r12 != 0) goto L53
            goto Lc4
        L53:
            java.lang.String r13 = "canonicalPath"
            java.lang.String r13 = r12.optString(r13, r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = r13.trim()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r14 = "absolutePath"
            java.lang.String r14 = r12.optString(r14, r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r14 = r14.trim()     // Catch: java.lang.Throwable -> Lcb
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r16 = "relativePath"
            r15[r9] = r16     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r16 = "filePath"
            r17 = 1
            r15[r17] = r16     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r16 = "path"
            r17 = 2
            r15[r17] = r16     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r15 = optStringAny(r12, r15)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r15 = r15.replace(r5, r6)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = "fileName"
            java.lang.String r5 = r12.optString(r5, r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> Lcb
            boolean r16 = isBlank(r13)     // Catch: java.lang.Throwable -> Lcb
            if (r16 != 0) goto L99
            boolean r13 = r2.equals(r13)     // Catch: java.lang.Throwable -> Lcb
            if (r13 == 0) goto L99
            return r12
        L99:
            boolean r13 = isBlank(r14)     // Catch: java.lang.Throwable -> Lcb
            if (r13 != 0) goto La6
            boolean r13 = r4.equals(r14)     // Catch: java.lang.Throwable -> Lcb
            if (r13 == 0) goto La6
            return r12
        La6:
            boolean r13 = isBlank(r15)     // Catch: java.lang.Throwable -> Lcb
            if (r13 != 0) goto Lb3
            boolean r13 = r7.equalsIgnoreCase(r15)     // Catch: java.lang.Throwable -> Lcb
            if (r13 == 0) goto Lb3
            return r12
        Lb3:
            boolean r13 = isBlank(r5)     // Catch: java.lang.Throwable -> Lcb
            if (r13 != 0) goto Lc4
            boolean r5 = r8.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto Lc4
            if (r11 != 0) goto Lc3
            r11 = r12
            goto Lc4
        Lc3:
            r11 = r3
        Lc4:
            int r10 = r10 + 1
            r5 = 92
            goto L45
        Lca:
            return r11
        Lcb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to read JavaLauncher modpack file metadata for export: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ModpackExport"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
            return r3
    }

    private static java.io.File findMinecraftChildDirectory(java.io.File r3, java.lang.String r4) {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto L1a
            if (r3 == 0) goto L1a
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r4)
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L13
            return r1
        L13:
            java.io.File r3 = r3.getParentFile()
            int r0 = r0 + 1
            goto L1
        L1a:
            r3 = 0
            return r3
    }

    private static java.lang.String firstCandidateContainedBy(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            boolean r0 = isBlank(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r4 = r4.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r0.toLowerCase(r2)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L17
            return r0
        L30:
            return r1
    }

    private static java.lang.String firstCandidateMatchingMinecraft(java.util.ArrayList<java.lang.String> r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = isBlank(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "NeoForge"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto Ld
            boolean r2 = neoforgeVersionMatchesMinecraft(r0, r4)
            if (r2 == 0) goto Ld
            return r0
        L28:
            return r1
    }

    private static java.lang.String hashFile(java.io.File r5, java.lang.String r6) throws java.lang.Exception {
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r5)
            r5 = 65536(0x10000, float:9.1835E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L4a
        Ld:
            int r1 = r0.read(r5)     // Catch: java.lang.Throwable -> L4a
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L19
            r6.update(r5, r3, r1)     // Catch: java.lang.Throwable -> L4a
            goto Ld
        L19:
            r0.close()
            byte[] r5 = r6.digest()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r0 = r5.length
            int r0 = r0 * 2
            r6.<init>(r0)
            int r0 = r5.length
        L29:
            if (r3 >= r0) goto L45
            r1 = r5[r3]
            java.util.Locale r2 = java.util.Locale.US
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "%02x"
            java.lang.String r1 = java.lang.String.format(r2, r4, r1)
            r6.append(r1)
            int r3 = r3 + 1
            goto L29
        L45:
            java.lang.String r5 = r6.toString()
            return r5
        L4a:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r6 = move-exception
            r5.addSuppressed(r6)
        L53:
            throw r5
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

    private static boolean looksLikeLoaderVersion(java.lang.String r2, java.lang.String r3) {
            boolean r0 = isBlank(r3)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r3 = normalizeResolvedLoaderVersion(r2, r3)
            java.lang.String r0 = "recommended"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "latest"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1d
            goto L4a
        L1d:
            java.lang.String r0 = "Forge"
            boolean r0 = r0.equalsIgnoreCase(r2)
            java.lang.String r1 = "^\\d+(?:\\.\\d+)+(?:[-+._][A-Za-z0-9][A-Za-z0-9._-]*)?$"
            if (r0 != 0) goto L45
            java.lang.String r0 = "NeoForge"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L45
            java.lang.String r0 = "Fabric"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L45
            java.lang.String r0 = "Quilt"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L40
            goto L45
        L40:
            boolean r2 = r3.matches(r1)
            return r2
        L45:
            boolean r2 = r3.matches(r1)
            return r2
        L4a:
            r2 = 1
            return r2
    }

    private static java.lang.String mavenVersion(java.lang.String r2) {
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r2.split(r0)
            int r0 = r2.length
            r1 = 3
            if (r0 < r1) goto L12
            r0 = 2
            r2 = r2[r0]
            java.lang.String r2 = r2.trim()
            goto L14
        L12:
            java.lang.String r2 = ""
        L14:
            return r2
    }

    private static boolean neoforgeVersionMatchesMinecraft(java.lang.String r4, java.lang.String r5) {
            boolean r0 = isBlank(r4)
            r1 = 0
            if (r0 != 0) goto L47
            boolean r0 = isBlank(r5)
            if (r0 == 0) goto Le
            goto L47
        Le:
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "1."
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L1f
            r0 = 2
            java.lang.String r5 = r5.substring(r0)
        L1f:
            java.lang.String r0 = r4.trim()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L46
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L47
        L46:
            r1 = 1
        L47:
            return r1
    }

    private static java.lang.String normalizeResolvedLoaderVersion(java.lang.String r3, java.lang.String r4) {
            boolean r0 = isBlank(r4)
            if (r0 == 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.String r4 = r4.trim()
            r0 = 58
            int r0 = r4.lastIndexOf(r0)
            r1 = 1
            if (r0 < 0) goto L25
            int r0 = r0 + r1
            int r2 = r4.length()
            if (r0 >= r2) goto L25
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r4.trim()
        L25:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r2 = "Forge"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L48
            java.lang.String r2 = "forge-"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L48
            int r3 = r2.length()
            java.lang.String r3 = r4.substring(r3)
            java.lang.String r4 = r3.trim()
            goto L54
        L48:
            java.lang.String r0 = "NeoForge"
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L54
            java.lang.String r4 = stripNeoForgePrefix(r4)
        L54:
            java.lang.String r3 = "^1\\.\\d+(?:\\.\\d+)?-(.+)$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r4)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L6c
            java.lang.String r3 = r3.group(r1)
            java.lang.String r4 = r3.trim()
        L6c:
            java.lang.String r3 = r4.trim()
            return r3
    }

    private static int optIntAny(org.json.JSONObject r5, java.lang.String... r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r6.length
            r2 = r0
        L6:
            if (r2 >= r1) goto L2b
            r3 = r6[r2]
            int r4 = r5.optInt(r3, r0)
            if (r4 <= 0) goto L11
            return r4
        L11:
            java.lang.String r4 = ""
            java.lang.String r3 = r5.optString(r3, r4)
            java.lang.String r3 = r3.trim()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L28
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L28
            if (r3 <= 0) goto L28
            return r3
        L28:
            int r2 = r2 + 1
            goto L6
        L2b:
            return r0
    }

    private static java.lang.String optStringAny(org.json.JSONObject r5, java.lang.String... r6) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1d
            r3 = r6[r2]
            java.lang.String r3 = r5.optString(r3, r0)
            java.lang.String r3 = r3.trim()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto L7
        L1d:
            return r0
    }

    private static java.lang.String readStoredLoaderVersion(java.io.File r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".javalauncher"
            r1.<init>(r4, r2)
            java.lang.String r3 = "modpack_manifest.json"
            r0.<init>(r1, r3)
            java.lang.String r0 = readStoredLoaderVersionFromFile(r0, r5)
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L19
            return r0
        L19:
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r2)
            java.lang.String r4 = "modpack_files_manifest.json"
            r0.<init>(r1, r4)
            java.lang.String r4 = readStoredLoaderVersionFromFile(r0, r5)
            return r4
    }

    private static java.lang.String readStoredLoaderVersionFromFile(java.io.File r5, java.lang.String r6) {
            java.lang.String r0 = "-loader"
            boolean r1 = r5.isFile()
            java.lang.String r2 = ""
            if (r1 != 0) goto Lb
            return r2
        Lb:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = readTextFile(r5)     // Catch: java.lang.Throwable -> L56
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "loader"
            java.lang.String r3 = r1.optString(r3, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L56
            boolean r4 = isBlank(r3)     // Catch: java.lang.Throwable -> L56
            if (r4 != 0) goto L4b
            boolean r4 = isBlank(r6)     // Catch: java.lang.Throwable -> L56
            if (r4 != 0) goto L4b
            boolean r4 = r3.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> L56
            if (r4 != 0) goto L4b
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = r3.toLowerCase(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = r3.replace(r0, r2)     // Catch: java.lang.Throwable -> L56
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r6.toLowerCase(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r6.replace(r0, r2)     // Catch: java.lang.Throwable -> L56
            boolean r6 = r3.equals(r6)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L4b
            return r2
        L4b:
            java.lang.String r6 = "loaderVersion"
            java.lang.String r6 = r1.optString(r6, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r6.trim()     // Catch: java.lang.Throwable -> L56
            return r5
        L56:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to read stored modpack loader metadata from "
            r0.<init>(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ModpackExport"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
            return r2
    }

    private static java.lang.String readTextFile(java.io.File r2) throws java.lang.Exception {
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

    private static java.lang.String resolveLoaderVersion(java.io.File r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = isBlank(r5)
            java.lang.String r1 = ""
            if (r0 != 0) goto L4d
            java.lang.String r0 = "Vanilla"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L11
            goto L4d
        L11:
            java.lang.String r0 = readStoredLoaderVersion(r3, r5)
            java.lang.String r0 = normalizeResolvedLoaderVersion(r5, r0)
            boolean r2 = looksLikeLoaderVersion(r5, r0)
            if (r2 == 0) goto L20
            return r0
        L20:
            java.lang.String r0 = resolveLoaderVersionFromVersionId(r5, r6, r4)
            java.lang.String r0 = normalizeResolvedLoaderVersion(r5, r0)
            boolean r2 = looksLikeLoaderVersion(r5, r0)
            if (r2 == 0) goto L2f
            return r0
        L2f:
            java.lang.String r0 = resolveLoaderVersionFromInstalledVersionJson(r3, r4, r5, r6)
            java.lang.String r0 = normalizeResolvedLoaderVersion(r5, r0)
            boolean r2 = looksLikeLoaderVersion(r5, r0)
            if (r2 == 0) goto L3e
            return r0
        L3e:
            java.lang.String r3 = resolveLoaderVersionFromLibraries(r3, r4, r5, r6)
            java.lang.String r3 = normalizeResolvedLoaderVersion(r5, r3)
            boolean r4 = looksLikeLoaderVersion(r5, r3)
            if (r4 == 0) goto L4d
            return r3
        L4d:
            return r1
    }

    private static java.lang.String resolveLoaderVersionFromInstalledVersionJson(java.io.File r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "versions"
            java.io.File r8 = findMinecraftChildDirectory(r8, r0)
            java.lang.String r0 = ""
            if (r8 == 0) goto Lbe
            boolean r1 = r8.isDirectory()
            if (r1 != 0) goto L12
            goto Lbe
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            addVersionJsonCandidate(r1, r8, r11)
            java.io.File[] r2 = r8.listFiles()
            if (r2 != 0) goto L21
            return r0
        L21:
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L24:
            if (r5 >= r3) goto L50
            r6 = r2[r5]
            boolean r7 = r6.isDirectory()
            if (r7 != 0) goto L2f
            goto L4d
        L2f:
            java.lang.String r6 = r6.getName()
            boolean r7 = isBlank(r11)
            if (r7 != 0) goto L44
            java.lang.String r7 = r11.trim()
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L44
            goto L4d
        L44:
            boolean r7 = versionDirectoryNameSuggestsLoader(r6, r10)
            if (r7 == 0) goto L4d
            addVersionJsonCandidate(r1, r8, r6)
        L4d:
            int r5 = r5 + 1
            goto L24
        L50:
            java.util.Iterator r11 = r1.iterator()
        L54:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r11.next()
            java.io.File r1 = (java.io.File) r1
            r3 = 1
            java.lang.String r1 = resolveLoaderVersionFromVersionJson(r1, r9, r10, r3)
            boolean r3 = looksLikeLoaderVersion(r10, r1)
            if (r3 == 0) goto L54
            return r1
        L6c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r2.length
            r3 = r4
        L73:
            if (r3 >= r1) goto La3
            r5 = r2[r3]
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L85
            java.lang.String r5 = r5.getName()
            addVersionJsonCandidate(r11, r8, r5)
            goto La0
        L85:
            boolean r6 = r5.isFile()
            if (r6 == 0) goto La0
            java.lang.String r6 = r5.getName()
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r7 = ".json"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto La0
            addUniqueFile(r11, r5)
        La0:
            int r3 = r3 + 1
            goto L73
        La3:
            java.util.Iterator r8 = r11.iterator()
        La7:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lbe
            java.lang.Object r11 = r8.next()
            java.io.File r11 = (java.io.File) r11
            java.lang.String r11 = resolveLoaderVersionFromVersionJson(r11, r9, r10, r4)
            boolean r1 = looksLikeLoaderVersion(r10, r11)
            if (r1 == 0) goto La7
            return r11
        Lbe:
            return r0
    }

    private static java.lang.String resolveLoaderVersionFromLibraries(java.io.File r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = "libraries"
            java.io.File r4 = findMinecraftChildDirectory(r4, r0)
            java.lang.String r0 = ""
            if (r4 == 0) goto L9b
            boolean r1 = r4.isDirectory()
            if (r1 != 0) goto L12
            goto L9b
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "Fabric"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L2a
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "net/fabricmc/fabric-loader"
            r2.<init>(r4, r3)
            collectLoaderVersionsFromMavenDirectory(r1, r2, r6, r5, r7)
            goto L76
        L2a:
            java.lang.String r2 = "Quilt"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L3d
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "org/quiltmc/quilt-loader"
            r2.<init>(r4, r3)
            collectLoaderVersionsFromMavenDirectory(r1, r2, r6, r5, r7)
            goto L76
        L3d:
            java.lang.String r2 = "Forge"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L5a
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "net/minecraftforge/forge"
            r2.<init>(r4, r3)
            collectLoaderVersionsFromMavenDirectory(r1, r2, r6, r5, r7)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "net/minecraftforge/fmlloader"
            r2.<init>(r4, r3)
            collectLoaderVersionsFromMavenDirectory(r1, r2, r6, r5, r7)
            goto L76
        L5a:
            java.lang.String r2 = "NeoForge"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L76
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "net/neoforged/neoforge"
            r2.<init>(r4, r3)
            collectLoaderVersionsFromMavenDirectory(r1, r2, r6, r5, r7)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "net/neoforged/forge"
            r2.<init>(r4, r3)
            collectLoaderVersionsFromMavenDirectory(r1, r2, r6, r5, r7)
        L76:
            int r4 = r1.size()
            r2 = 1
            if (r4 != r2) goto L85
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L85:
            java.lang.String r4 = firstCandidateContainedBy(r1, r7)
            boolean r7 = looksLikeLoaderVersion(r6, r4)
            if (r7 == 0) goto L90
            return r4
        L90:
            java.lang.String r4 = firstCandidateMatchingMinecraft(r1, r5, r6)
            boolean r5 = looksLikeLoaderVersion(r6, r4)
            if (r5 == 0) goto L9b
            r0 = r4
        L9b:
            return r0
    }

    private static java.lang.String resolveLoaderVersionFromLibrariesArray(org.json.JSONArray r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            return r0
        L5:
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L2b
            org.json.JSONObject r2 = r4.optJSONObject(r1)
            if (r2 != 0) goto L13
            goto L28
        L13:
            java.lang.String r3 = "name"
            java.lang.String r2 = r2.optString(r3, r0)
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = resolveLoaderVersionFromMavenName(r5, r2, r6)
            boolean r3 = looksLikeLoaderVersion(r5, r2)
            if (r3 == 0) goto L28
            return r2
        L28:
            int r1 = r1 + 1
            goto L6
        L2b:
            return r0
    }

    private static java.lang.String resolveLoaderVersionFromMavenName(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = isBlank(r3)
            java.lang.String r1 = ""
            if (r0 != 0) goto L8d
            boolean r0 = isBlank(r4)
            if (r0 == 0) goto L10
            goto L8d
        L10:
            java.lang.String r4 = r4.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r4 = mavenVersion(r4)
            boolean r2 = isBlank(r4)
            if (r2 == 0) goto L25
            return r1
        L25:
            java.lang.String r2 = "Fabric"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L36
            java.lang.String r2 = "net.fabricmc:fabric-loader:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L36
            goto L82
        L36:
            java.lang.String r2 = "Quilt"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L47
            java.lang.String r2 = "org.quiltmc:quilt-loader:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L47
            goto L82
        L47:
            java.lang.String r2 = "Forge"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L64
            java.lang.String r2 = "net.minecraftforge:forge:"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L5f
            java.lang.String r2 = "net.minecraftforge:fmlloader:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L64
        L5f:
            java.lang.String r4 = stripMinecraftVersionPrefix(r4, r5)
            goto L82
        L64:
            java.lang.String r2 = "NeoForge"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L81
            java.lang.String r2 = "net.neoforged:neoforge:"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L7c
            java.lang.String r2 = "net.neoforged:forge:"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L81
        L7c:
            java.lang.String r4 = stripMinecraftVersionPrefix(r4, r5)
            goto L82
        L81:
            r4 = r1
        L82:
            java.lang.String r4 = normalizeResolvedLoaderVersion(r3, r4)
            boolean r3 = looksLikeLoaderVersion(r3, r4)
            if (r3 == 0) goto L8d
            r1 = r4
        L8d:
            return r1
    }

    private static java.lang.String resolveLoaderVersionFromVersionId(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = isBlank(r4)
            java.lang.String r1 = ""
            if (r0 != 0) goto L7b
            boolean r0 = isBlank(r5)
            if (r0 == 0) goto L10
            goto L7b
        L10:
            java.lang.String r5 = r5.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r5.toLowerCase(r0)
            java.lang.String r2 = "Fabric"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L29
            java.lang.String r6 = "fabric-loader-"
            java.lang.String r5 = extractAfterMarker(r5, r0, r6)
            goto L70
        L29:
            java.lang.String r2 = "Quilt"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L38
            java.lang.String r6 = "quilt-loader-"
            java.lang.String r5 = extractAfterMarker(r5, r0, r6)
            goto L70
        L38:
            java.lang.String r2 = "Forge"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L5e
            java.lang.String r2 = "forge-"
            boolean r3 = r0.startsWith(r2)
            if (r3 == 0) goto L55
            int r0 = r2.length()
            java.lang.String r5 = r5.substring(r0)
            java.lang.String r5 = r5.trim()
            goto L59
        L55:
            java.lang.String r5 = extractAfterMarker(r5, r0, r2)
        L59:
            java.lang.String r5 = stripMinecraftVersionPrefix(r5, r6)
            goto L70
        L5e:
            java.lang.String r0 = "NeoForge"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L6f
            java.lang.String r5 = resolveNeoForgeLoaderVersionFromVersionId(r5)
            java.lang.String r5 = stripMinecraftVersionPrefix(r5, r6)
            goto L70
        L6f:
            r5 = r1
        L70:
            java.lang.String r5 = normalizeResolvedLoaderVersion(r4, r5)
            boolean r4 = looksLikeLoaderVersion(r4, r5)
            if (r4 == 0) goto L7b
            r1 = r5
        L7b:
            return r1
    }

    private static java.lang.String resolveLoaderVersionFromVersionJson(java.io.File r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            java.lang.String r0 = ""
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = readTextFile(r4)     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "loaderVersion"
            java.lang.String r2 = r1.optString(r2, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = normalizeResolvedLoaderVersion(r6, r2)     // Catch: java.lang.Throwable -> L6b
            boolean r3 = looksLikeLoaderVersion(r6, r2)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L1c
            return r2
        L1c:
            java.lang.String r2 = "libraries"
            org.json.JSONArray r2 = r1.optJSONArray(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = resolveLoaderVersionFromLibrariesArray(r2, r6, r5)     // Catch: java.lang.Throwable -> L6b
            boolean r3 = looksLikeLoaderVersion(r6, r2)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L35
            if (r7 != 0) goto L34
            boolean r3 = versionJsonMatchesMinecraft(r1, r5, r2)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L35
        L34:
            return r2
        L35:
            java.lang.String r2 = "id"
            java.lang.String r3 = r4.getName()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = r1.optString(r2, r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = resolveLoaderVersionFromVersionId(r6, r2, r5)     // Catch: java.lang.Throwable -> L6b
            boolean r3 = looksLikeLoaderVersion(r6, r2)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L52
            if (r7 != 0) goto L51
            boolean r3 = versionJsonMatchesMinecraft(r1, r5, r2)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L52
        L51:
            return r2
        L52:
            java.lang.String r2 = "inheritsFrom"
            java.lang.String r2 = r1.optString(r2, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = resolveLoaderVersionFromVersionId(r6, r2, r5)     // Catch: java.lang.Throwable -> L6b
            boolean r6 = looksLikeLoaderVersion(r6, r2)     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L92
            if (r7 != 0) goto L6a
            boolean r4 = versionJsonMatchesMinecraft(r1, r5, r2)     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L92
        L6a:
            return r2
        L6b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unable to read installed version metadata for export from "
            r6.<init>(r7)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = ": "
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ModpackExport"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r4)
        L92:
            return r0
    }

    private static java.lang.String resolveNeoForgeLoaderVersionFromVersionId(java.lang.String r3) {
            java.lang.String r3 = r3.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = "neoforge-"
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L1b
            int r1 = r1.length()
            int r0 = r0 + r1
            java.lang.String r3 = r3.substring(r0)
        L1b:
            java.lang.String r3 = r3.trim()
        L1f:
            java.lang.String r0 = "-"
            boolean r0 = r3.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto L31
            java.lang.String r3 = r3.substring(r1)
            java.lang.String r3 = r3.trim()
            goto L1f
        L31:
            java.lang.String r0 = "^1\\.\\d+(?:\\.\\d+)?-(.+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r2 = r0.matches()
            if (r2 == 0) goto L49
            java.lang.String r3 = r0.group(r1)
            java.lang.String r3 = r3.trim()
        L49:
            return r3
    }

    private static java.lang.String safeCanonicalPath(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private static java.lang.String sanitizeMultiMcCfgValue(java.lang.String r2) {
            r0 = 10
            r1 = 32
            java.lang.String r2 = r2.replace(r0, r1)
            r0 = 13
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r2 = r2.trim()
            return r2
    }

    private static java.lang.String sha1(java.io.File r1) throws java.lang.Exception {
            java.lang.String r0 = "SHA-1"
            java.lang.String r1 = hashFile(r1, r0)
            return r1
    }

    private static java.lang.String sha512(java.io.File r1) throws java.lang.Exception {
            java.lang.String r0 = "SHA-512"
            java.lang.String r1 = hashFile(r1, r0)
            return r1
    }

    private static java.lang.String stripMinecraftVersionPrefix(java.lang.String r3, java.lang.String r4) {
            boolean r0 = isBlank(r3)
            if (r0 == 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.String r3 = r3.trim()
            boolean r0 = isBlank(r4)
            r1 = 1
            if (r0 != 0) goto L3f
            java.lang.String r4 = r4.trim()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L3f
            int r4 = r4.length()
            int r4 = r4 + r1
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = r3.trim()
            return r3
        L3f:
            java.lang.String r4 = "^1\\.\\d+(?:\\.\\d+)?-(.+)$"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L57
            java.lang.String r3 = r4.group(r1)
            java.lang.String r3 = r3.trim()
        L57:
            return r3
    }

    private static java.lang.String stripNeoForgePrefix(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.toLowerCase(r0)
            java.lang.String r1 = "neoforge-"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1e
            int r0 = r1.length()
            java.lang.String r2 = r2.substring(r0)
            java.lang.String r2 = r2.trim()
        L1e:
            return r2
    }

    private static boolean versionDirectoryNameSuggestsLoader(java.lang.String r5, java.lang.String r6) {
            boolean r0 = isBlank(r5)
            r1 = 0
            if (r0 != 0) goto L6e
            boolean r0 = isBlank(r6)
            if (r0 == 0) goto Le
            goto L6e
        Le:
            java.lang.String r5 = r5.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r0 = "Fabric"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L27
            java.lang.String r6 = "fabric"
            boolean r5 = r5.contains(r6)
            return r5
        L27:
            java.lang.String r0 = "Quilt"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L36
            java.lang.String r6 = "quilt"
            boolean r5 = r5.contains(r6)
            return r5
        L36:
            java.lang.String r0 = "NeoForge"
            boolean r0 = r0.equalsIgnoreCase(r6)
            java.lang.String r2 = "neo-forge"
            r3 = 1
            java.lang.String r4 = "neoforge"
            if (r0 == 0) goto L51
            boolean r6 = r5.contains(r4)
            if (r6 != 0) goto L4f
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L50
        L4f:
            r1 = r3
        L50:
            return r1
        L51:
            java.lang.String r0 = "Forge"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L6e
            java.lang.String r6 = "forge"
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L6e
            boolean r6 = r5.contains(r4)
            if (r6 != 0) goto L6e
            boolean r5 = r5.contains(r2)
            if (r5 != 0) goto L6e
            r1 = r3
        L6e:
            return r1
    }

    private static boolean versionJsonMatchesMinecraft(org.json.JSONObject r7, java.lang.String r8, java.lang.String r9) {
            boolean r0 = isBlank(r8)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r8 = r8.trim()
            java.lang.String r0 = "id"
            java.lang.String r2 = ""
            java.lang.String r0 = r7.optString(r0, r2)
            java.lang.String r3 = "inheritsFrom"
            java.lang.String r3 = r7.optString(r3, r2)
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L9e
            boolean r0 = r3.equalsIgnoreCase(r8)
            if (r0 != 0) goto L9e
            boolean r0 = r3.contains(r8)
            if (r0 == 0) goto L2e
            goto L9e
        L2e:
            boolean r0 = isBlank(r9)
            java.lang.String r3 = "-"
            if (r0 != 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r9 = r9.startsWith(r0)
            if (r9 == 0) goto L4e
            return r1
        L4e:
            java.lang.String r9 = "libraries"
            org.json.JSONArray r7 = r7.optJSONArray(r9)
            r9 = 0
            if (r7 != 0) goto L58
            return r9
        L58:
            r0 = r9
        L59:
            int r4 = r7.length()
            if (r0 >= r4) goto L9d
            org.json.JSONObject r4 = r7.optJSONObject(r0)
            if (r4 != 0) goto L66
            goto L99
        L66:
            java.lang.String r5 = "name"
            java.lang.String r4 = r4.optString(r5, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = ":"
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L9c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L99
            goto L9c
        L99:
            int r0 = r0 + 1
            goto L59
        L9c:
            return r1
        L9d:
            return r9
        L9e:
            return r1
    }
}
