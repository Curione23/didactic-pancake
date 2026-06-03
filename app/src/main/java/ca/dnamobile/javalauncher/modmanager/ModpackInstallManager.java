package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModpackInstallManager {
    private static final int BUFFER_SIZE = 65536;
    private static final int CURSEFORGE_MINECRAFT_GAME_ID = 432;
    private static final java.lang.String JAVALAUNCHER_METADATA_DIRECTORY = ".javalauncher";
    private static final java.lang.String JAVALAUNCHER_PACK_ICON_ENTRY = "javalauncher-pack-icon.png";
    private static final java.lang.String MODPACK_FILES_MANIFEST_FILE = "modpack_files_manifest.json";
    private static final java.lang.String MODPACK_INSTALL_WARNINGS_FILE = "modpack_install_warnings.txt";
    private static final java.lang.String MODPACK_MANIFEST_FILE = "modpack_manifest.json";
    private static final java.lang.String TAG = "ModpackInstall";

    public interface Listener {
        void onComplete(java.lang.String r1);

        default void onComplete(java.lang.String r1, ca.dnamobile.javalauncher.instance.LauncherInstance r2) {
                r0 = this;
                r0.onComplete(r1)
                return
        }

        void onError(java.lang.Throwable r1);

        void onProgress(int r1, int r2);

        void onStatus(java.lang.String r1);
    }

    private static final class LoaderSpec {
        final java.lang.String loaderName;
        final java.lang.String loaderVersion;

        LoaderSpec(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.loaderName = r1
                r0.loaderVersion = r2
                return
        }

        static ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec fromCurseForgeManifest(org.json.JSONArray r7) {
                java.lang.String r0 = "Vanilla"
                r1 = 0
                if (r7 != 0) goto Lb
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                r7.<init>(r0, r1)
                return r7
            Lb:
                r2 = 0
                r4 = r1
                r3 = r2
            Le:
                int r5 = r7.length()
                if (r3 >= r5) goto L2b
                org.json.JSONObject r5 = r7.optJSONObject(r3)
                if (r5 != 0) goto L1b
                goto L28
            L1b:
                java.lang.String r6 = "primary"
                boolean r6 = r5.optBoolean(r6, r2)
                if (r6 == 0) goto L25
                r4 = r5
                goto L2b
            L25:
                if (r4 != 0) goto L28
                r4 = r5
            L28:
                int r3 = r3 + 1
                goto Le
            L2b:
                if (r4 != 0) goto L33
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                r7.<init>(r0, r1)
                return r7
            L33:
                java.lang.String r7 = "id"
                java.lang.String r2 = ""
                java.lang.String r7 = r4.optString(r7, r2)
                java.lang.String r7 = r7.trim()
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r2 = r7.toLowerCase(r2)
                java.lang.String r3 = "fabric-"
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L5d
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r0 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                int r1 = r3.length()
                java.lang.String r7 = r7.substring(r1)
                java.lang.String r1 = "Fabric"
                r0.<init>(r1, r7)
                return r0
            L5d:
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r2 = r7.toLowerCase(r2)
                java.lang.String r3 = "forge-"
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L7b
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r0 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                int r1 = r3.length()
                java.lang.String r7 = r7.substring(r1)
                java.lang.String r1 = "Forge"
                r0.<init>(r1, r7)
                return r0
            L7b:
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r2 = r7.toLowerCase(r2)
                java.lang.String r3 = "neoforge-"
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L95
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r0 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r1 = "NeoForge"
                java.lang.String r7 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m551$$Nest$smstripNeoForgePrefix(r7)
                r0.<init>(r1, r7)
                return r0
            L95:
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r2 = r7.toLowerCase(r2)
                java.lang.String r3 = "quilt-"
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto Lb3
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r0 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                int r1 = r3.length()
                java.lang.String r7 = r7.substring(r1)
                java.lang.String r1 = "Quilt"
                r0.<init>(r1, r7)
                return r0
            Lb3:
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                r7.<init>(r0, r1)
                return r7
        }

        static ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec fromModrinthDependencies(org.json.JSONObject r4) {
                java.lang.String r0 = "fabric-loader"
                java.lang.String r1 = ""
                java.lang.String r2 = r4.optString(r0, r1)
                boolean r2 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r2)
                if (r2 != 0) goto L1a
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r2 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r3 = "Fabric"
                java.lang.String r4 = r4.optString(r0, r1)
                r2.<init>(r3, r4)
                return r2
            L1a:
                java.lang.String r0 = "forge"
                java.lang.String r2 = r4.optString(r0, r1)
                boolean r2 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r2)
                if (r2 != 0) goto L32
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r2 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r3 = "Forge"
                java.lang.String r4 = r4.optString(r0, r1)
                r2.<init>(r3, r4)
                return r2
            L32:
                java.lang.String r0 = "neoforge"
                java.lang.String r2 = r4.optString(r0, r1)
                boolean r2 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r2)
                if (r2 != 0) goto L4e
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r2 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r4 = r4.optString(r0, r1)
                java.lang.String r4 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m551$$Nest$smstripNeoForgePrefix(r4)
                java.lang.String r0 = "NeoForge"
                r2.<init>(r0, r4)
                return r2
            L4e:
                java.lang.String r0 = "quilt-loader"
                java.lang.String r2 = r4.optString(r0, r1)
                boolean r2 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r2)
                if (r2 != 0) goto L66
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r2 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r3 = "Quilt"
                java.lang.String r4 = r4.optString(r0, r1)
                r2.<init>(r3, r4)
                return r2
            L66:
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r4 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r0 = "Vanilla"
                r1 = 0
                r4.<init>(r0, r1)
                return r4
        }

        static ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec fromMultiMcPackJson(org.json.JSONObject r7) {
                java.lang.String r0 = "components"
                org.json.JSONArray r7 = r7.optJSONArray(r0)
                r0 = 0
                java.lang.String r1 = "Vanilla"
                if (r7 != 0) goto L11
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                r7.<init>(r1, r0)
                return r7
            L11:
                r2 = 0
            L12:
                int r3 = r7.length()
                if (r2 >= r3) goto L8b
                org.json.JSONObject r3 = r7.optJSONObject(r2)
                if (r3 != 0) goto L1f
                goto L7c
            L1f:
                java.lang.String r4 = "uid"
                java.lang.String r5 = ""
                java.lang.String r4 = r3.optString(r4, r5)
                java.lang.String r4 = r4.trim()
                java.util.Locale r6 = java.util.Locale.US
                java.lang.String r4 = r4.toLowerCase(r6)
                java.lang.String r6 = "version"
                java.lang.String r3 = r3.optString(r6, r5)
                java.lang.String r3 = r3.trim()
                java.lang.String r5 = "net.fabricmc.fabric-loader"
                boolean r5 = r5.equals(r4)
                if (r5 == 0) goto L4b
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r0 = "Fabric"
                r7.<init>(r0, r3)
                return r7
            L4b:
                java.lang.String r5 = "net.minecraftforge"
                boolean r5 = r5.equals(r4)
                if (r5 == 0) goto L5b
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r0 = "Forge"
                r7.<init>(r0, r3)
                return r7
            L5b:
                java.lang.String r5 = "net.neoforged"
                boolean r5 = r5.equals(r4)
                if (r5 != 0) goto L7f
                java.lang.String r5 = "net.neoforged.neoforge"
                boolean r5 = r5.equals(r4)
                if (r5 == 0) goto L6c
                goto L7f
            L6c:
                java.lang.String r5 = "org.quiltmc.quilt-loader"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L7c
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r0 = "Quilt"
                r7.<init>(r0, r3)
                return r7
            L7c:
                int r2 = r2 + 1
                goto L12
            L7f:
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                java.lang.String r0 = "NeoForge"
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m551$$Nest$smstripNeoForgePrefix(r3)
                r7.<init>(r0, r1)
                return r7
            L8b:
                ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r7 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec
                r7.<init>(r1, r0)
                return r7
        }
    }

    public static final class ModpackVersionChoice {
        public final java.lang.String datePublished;
        public final java.lang.String downloadUrl;
        public final int fileId;
        public final java.lang.String fileName;
        public final java.util.ArrayList<java.lang.String> gameVersions;
        public final java.util.ArrayList<java.lang.String> loaders;
        public final ca.dnamobile.javalauncher.modmanager.ModManagerSource source;
        public final java.lang.String versionId;
        public final java.lang.String versionName;
        public final java.lang.String versionNumber;

        ModpackVersionChoice(ca.dnamobile.javalauncher.modmanager.ModManagerSource r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.ArrayList<java.lang.String> r8, java.util.ArrayList<java.lang.String> r9, java.lang.String r10) {
                r0 = this;
                r0.<init>()
                r0.source = r1
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m549$$Nest$smsafe(r2)
                java.lang.String r1 = r1.trim()
                r0.versionId = r1
                r0.fileId = r3
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m549$$Nest$smsafe(r4)
                java.lang.String r1 = r1.trim()
                r0.versionName = r1
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m549$$Nest$smsafe(r5)
                java.lang.String r1 = r1.trim()
                r0.versionNumber = r1
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m549$$Nest$smsafe(r6)
                java.lang.String r1 = r1.trim()
                r0.fileName = r1
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m545$$Nest$smcleanDownloadUrl(r7)
                r0.downloadUrl = r1
                r0.gameVersions = r8
                r0.loaders = r9
                java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m549$$Nest$smsafe(r10)
                java.lang.String r1 = r1.trim()
                r0.datePublished = r1
                return
        }

        private static java.lang.String joinShortList(java.util.ArrayList<java.lang.String> r3, int r4) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r3.size()
                r2 = 1
                int r4 = java.lang.Math.max(r2, r4)
                int r4 = java.lang.Math.min(r1, r4)
                r1 = 0
            L13:
                if (r1 >= r4) goto L2c
                int r2 = r0.length()
                if (r2 <= 0) goto L20
                java.lang.String r2 = ", "
                r0.append(r2)
            L20:
                java.lang.Object r2 = r3.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                r0.append(r2)
                int r1 = r1 + 1
                goto L13
            L2c:
                int r1 = r3.size()
                if (r1 <= r4) goto L40
                java.lang.String r1 = " +"
                java.lang.StringBuilder r1 = r0.append(r1)
                int r3 = r3.size()
                int r3 = r3 - r4
                r1.append(r3)
            L40:
                java.lang.String r3 = r0.toString()
                return r3
        }

        public java.lang.String getDisplaySubtitle() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.util.ArrayList<java.lang.String> r1 = r5.gameVersions
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L1d
                java.lang.String r1 = "Minecraft "
                java.lang.StringBuilder r1 = r0.append(r1)
                java.util.ArrayList<java.lang.String> r2 = r5.gameVersions
                r3 = 4
                java.lang.String r2 = joinShortList(r2, r3)
                r1.append(r2)
            L1d:
                java.util.ArrayList<java.lang.String> r1 = r5.loaders
                boolean r1 = r1.isEmpty()
                java.lang.String r2 = " · "
                if (r1 != 0) goto L40
                int r1 = r0.length()
                if (r1 <= 0) goto L30
                r0.append(r2)
            L30:
                java.lang.String r1 = "Loader "
                java.lang.StringBuilder r1 = r0.append(r1)
                java.util.ArrayList<java.lang.String> r3 = r5.loaders
                r4 = 3
                java.lang.String r3 = joinShortList(r3, r4)
                r1.append(r3)
            L40:
                java.lang.String r1 = r5.datePublished
                boolean r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r1)
                if (r1 != 0) goto L65
                int r1 = r0.length()
                if (r1 <= 0) goto L51
                r0.append(r2)
            L51:
                java.lang.String r1 = r5.datePublished
                r2 = 10
                int r3 = r1.length()
                int r2 = java.lang.Math.min(r2, r3)
                r3 = 0
                java.lang.String r1 = r1.substring(r3, r2)
                r0.append(r1)
            L65:
                java.lang.String r1 = r5.fileName
                boolean r1 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r1)
                if (r1 != 0) goto L7d
                int r1 = r0.length()
                if (r1 <= 0) goto L78
                java.lang.String r1 = "\n"
                r0.append(r1)
            L78:
                java.lang.String r1 = r5.fileName
                r0.append(r1)
            L7d:
                int r1 = r0.length()
                if (r1 != 0) goto L86
                java.lang.String r0 = "No version metadata available"
                goto L8a
            L86:
                java.lang.String r0 = r0.toString()
            L8a:
                return r0
        }

        public java.lang.String getDisplayTitle() {
                r2 = this;
                java.lang.String r0 = r2.versionName
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r0)
                if (r0 != 0) goto Lb
                java.lang.String r0 = r2.versionName
                return r0
            Lb:
                java.lang.String r0 = r2.versionNumber
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r0)
                if (r0 != 0) goto L16
                java.lang.String r0 = r2.versionNumber
                return r0
            L16:
                java.lang.String r0 = r2.fileName
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r0)
                if (r0 != 0) goto L25
                java.lang.String r0 = r2.fileName
                java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m550$$Nest$smstripArchiveExtension(r0)
                return r0
            L25:
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = r2.source
                ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
                if (r0 != r1) goto L3d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CurseForge file "
                r0.<init>(r1)
                int r1 = r2.fileId
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                goto L3f
            L3d:
                java.lang.String r0 = r2.versionId
            L3f:
                return r0
        }

        public boolean isCompatibleWith(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r4 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m549$$Nest$smsafe(r4)
                java.lang.String r4 = r4.trim()
                java.lang.String r5 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m548$$Nest$smnormalizeLoader(r5)
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r4)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L27
                java.util.ArrayList<java.lang.String> r0 = r3.gameVersions
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L27
                java.util.ArrayList<java.lang.String> r0 = r3.gameVersions
                boolean r4 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m546$$Nest$smcontainsIgnoreCase(r0, r4)
                if (r4 == 0) goto L25
                goto L27
            L25:
                r4 = r1
                goto L28
            L27:
                r4 = r2
            L28:
                boolean r0 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m547$$Nest$smisBlank(r5)
                if (r0 != 0) goto L41
                java.util.ArrayList<java.lang.String> r0 = r3.loaders
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L41
                java.util.ArrayList<java.lang.String> r0 = r3.loaders
                boolean r5 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.m546$$Nest$smcontainsIgnoreCase(r0, r5)
                if (r5 == 0) goto L3f
                goto L41
            L3f:
                r5 = r1
                goto L42
            L41:
                r5 = r2
            L42:
                if (r4 == 0) goto L47
                if (r5 == 0) goto L47
                r1 = r2
            L47:
                return r1
        }
    }

    private static final class ParsedModrinthDownloadIds {
        final java.lang.String projectId;
        final java.lang.String versionId;

        ParsedModrinthDownloadIds(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.projectId = r1
                r0.versionId = r2
                return
        }
    }

    private static final class PendingModrinthInstalledFile {
        final java.lang.String downloadUrl;
        final org.json.JSONObject fileMetadata;
        final java.lang.String relativePath;
        final java.io.File target;

        PendingModrinthInstalledFile(java.io.File r1, java.lang.String r2, org.json.JSONObject r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                r0.relativePath = r2
                r0.fileMetadata = r3
                r0.downloadUrl = r4
                return
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smcleanDownloadUrl, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m545$$Nest$smcleanDownloadUrl(java.lang.String r0) {
            java.lang.String r0 = cleanDownloadUrl(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smcontainsIgnoreCase, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m546$$Nest$smcontainsIgnoreCase(java.util.ArrayList r0, java.lang.String r1) {
            boolean r0 = containsIgnoreCase(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smisBlank, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m547$$Nest$smisBlank(java.lang.String r0) {
            boolean r0 = isBlank(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smnormalizeLoader, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m548$$Nest$smnormalizeLoader(java.lang.String r0) {
            java.lang.String r0 = normalizeLoader(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smsafe, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m549$$Nest$smsafe(java.lang.String r0) {
            java.lang.String r0 = safe(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smstripArchiveExtension, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m550$$Nest$smstripArchiveExtension(java.lang.String r0) {
            java.lang.String r0 = stripArchiveExtension(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smstripNeoForgePrefix, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m551$$Nest$smstripNeoForgePrefix(java.lang.String r0) {
            java.lang.String r0 = stripNeoForgePrefix(r0)
            return r0
    }

    private ModpackInstallManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void appendMissingModrinthMetadataForLocalContent(java.io.File r14, org.json.JSONArray r15, java.lang.String r16, java.lang.String r17, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec r18) {
            r0 = r14
            r11 = r15
            java.lang.String r1 = ""
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lb8
            r2.<init>()     // Catch: java.lang.Throwable -> Lb8
            r3 = 0
        La:
            int r4 = r15.length()     // Catch: java.lang.Throwable -> Lb8
            if (r3 >= r4) goto L47
            org.json.JSONObject r4 = r15.optJSONObject(r3)     // Catch: java.lang.Throwable -> Lb8
            if (r4 != 0) goto L17
            goto L44
        L17:
            java.lang.String r5 = "relativePath"
            java.lang.String r5 = r4.optString(r5, r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r6 = "filePath"
            java.lang.String r6 = r4.optString(r6, r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = "path"
            java.lang.String r4 = r4.optString(r7, r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = firstNonBlank(r6, r4)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = firstNonBlank(r5, r4)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = normalizeZipPath(r4)     // Catch: java.lang.Throwable -> Lb8
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: java.lang.Throwable -> Lb8
            boolean r5 = isBlank(r4)     // Catch: java.lang.Throwable -> Lb8
            if (r5 != 0) goto L44
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb8
        L44:
            int r3 = r3 + 1
            goto La
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb8
            r1.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = "mods"
            collectMissingLocalModrinthCandidates(r14, r3, r2, r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = "resourcepacks"
            collectMissingLocalModrinthCandidates(r14, r3, r2, r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = "shaderpacks"
            collectMissingLocalModrinthCandidates(r14, r3, r2, r1)     // Catch: java.lang.Throwable -> Lb8
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L62
            return
        L62:
            java.util.Map r12 = resolveModrinthVersionMetadataBySha1(r1)     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r13 = r1.iterator()     // Catch: java.lang.Throwable -> Lb8
        L6a:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto Ld1
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> Lb8
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$PendingModrinthInstalledFile r1 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.PendingModrinthInstalledFile) r1     // Catch: java.lang.Throwable -> Lb8
            org.json.JSONObject r2 = r1.fileMetadata     // Catch: java.lang.Throwable -> Lb8
            java.io.File r3 = r1.target     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r9 = resolveModrinthSha1(r2, r3)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r2 = r12.get(r9)     // Catch: java.lang.Throwable -> Lb8
            r10 = r2
            org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch: java.lang.Throwable -> Lb8
            if (r10 != 0) goto L88
            goto L6a
        L88:
            java.lang.String r5 = selectModrinthDownloadUrl(r10, r9)     // Catch: java.lang.Throwable -> Lb8
            boolean r2 = isBlank(r5)     // Catch: java.lang.Throwable -> Lb8
            if (r2 != 0) goto La1
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb8
            r2.<init>()     // Catch: java.lang.Throwable -> Lb8
            r2.put(r5)     // Catch: java.lang.Throwable -> Lb8
            org.json.JSONObject r3 = r1.fileMetadata     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "downloads"
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> Lb8
        La1:
            java.io.File r2 = r1.target     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = r1.relativePath     // Catch: java.lang.Throwable -> Lb8
            org.json.JSONObject r4 = r1.fileMetadata     // Catch: java.lang.Throwable -> Lb8
            r1 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            org.json.JSONObject r1 = buildModrinthInstalledContentEntry(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto L6a
            r15.put(r1)     // Catch: java.lang.Throwable -> Lb8
            goto L6a
        Lb8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve Modrinth metadata for override files: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
        Ld1:
            return
    }

    private static java.lang.String buildCurseForgeCdnUrl(int r4, java.lang.String r5) {
            int r0 = r4 / 1000
            int r4 = r4 % 1000
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://edge.forgecdn.net/files/"
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r3 = "%03d"
            java.lang.String r4 = java.lang.String.format(r2, r3, r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = urlEncodePathSegment(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private static org.json.JSONObject buildCurseForgeInstalledContentEntry(java.io.File r10, java.io.File r11, org.json.JSONObject r12, int r13, int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec r18) throws java.lang.Exception {
            r0 = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mods/"
            r1.<init>(r2)
            java.lang.String r2 = r11.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r1.toString()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            r2 = r10
            r3 = r11
            r7 = r16
            r8 = r17
            r9 = r18
            org.json.JSONObject r1 = buildInstalledContentBaseEntry(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "curseforge"
            r1.put(r2, r3)
            java.lang.String r2 = "modpackPlatform"
            r1.put(r2, r3)
            java.lang.String r2 = "installedFromPlatformModpack"
            r3 = 1
            r1.put(r2, r3)
            java.lang.String r2 = "updateReady"
            r1.put(r2, r3)
            java.lang.String r2 = "platformProjectId"
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r1.put(r2, r3)
            java.lang.String r2 = "projectId"
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r1.put(r2, r3)
            java.lang.String r2 = "curseForgeProjectId"
            r3 = r13
            r1.put(r2, r13)
            java.lang.String r2 = "platformFileId"
            java.lang.String r3 = java.lang.String.valueOf(r14)
            r1.put(r2, r3)
            java.lang.String r2 = "fileId"
            java.lang.String r3 = java.lang.String.valueOf(r14)
            r1.put(r2, r3)
            java.lang.String r2 = "curseForgeFileId"
            r3 = r14
            r1.put(r2, r14)
            java.lang.String r2 = "displayName"
            java.lang.String r2 = optJsonString(r12, r2)
            java.lang.String r3 = "versionNumber"
            r1.put(r3, r2)
            java.lang.String r2 = "downloadUrl"
            r3 = r15
            r1.put(r2, r15)
            java.lang.String r2 = "fileDate"
            java.lang.String r3 = optJsonString(r12, r2)
            r1.put(r2, r3)
            r2 = 0
            java.lang.String r3 = "releaseType"
            int r2 = r12.optInt(r3, r2)
            r1.put(r3, r2)
            java.lang.String r2 = "gameVersions"
            org.json.JSONArray r3 = r12.optJSONArray(r2)
            if (r3 != 0) goto L9d
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            goto La1
        L9d:
            org.json.JSONArray r3 = r12.optJSONArray(r2)
        La1:
            r1.put(r2, r3)
            java.lang.String r2 = "hashes"
            org.json.JSONArray r3 = r12.optJSONArray(r2)
            if (r3 != 0) goto Lb2
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            goto Lb6
        Lb2:
            org.json.JSONArray r3 = r12.optJSONArray(r2)
        Lb6:
            r1.put(r2, r3)
            org.json.JSONArray r2 = r12.optJSONArray(r2)
            java.lang.String r2 = resolveCurseForgeSha1(r2)
            java.lang.String r3 = "sha1"
            r1.put(r3, r2)
            java.lang.String r2 = "fileSize"
            long r3 = r11.length()
            r1.put(r2, r3)
            java.lang.String r2 = "fileLength"
            long r3 = r11.length()
            long r2 = r12.optLong(r2, r3)
            java.lang.String r4 = "declaredFileSize"
            r1.put(r4, r2)
            java.lang.String r2 = "curseForgeFile"
            r1.put(r2, r12)
            return r1
    }

    private static org.json.JSONObject buildInstalledContentBaseEntry(java.io.File r3, java.io.File r4, java.lang.String r5, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6, ca.dnamobile.javalauncher.modmanager.ModManagerSource r7, java.lang.String r8, java.lang.String r9, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec r10) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "source"
            java.lang.String r2 = r7.getId()
            r0.put(r1, r2)
            java.lang.String r1 = "platform"
            java.lang.String r7 = r7.getId()
            r0.put(r1, r7)
            java.lang.String r7 = "contentType"
            java.lang.String r1 = r6.getIntentValue()
            r0.put(r7, r1)
            java.lang.String r7 = "type"
            java.lang.String r6 = r6.getIntentValue()
            r0.put(r7, r6)
            java.lang.String r6 = "fileName"
            java.lang.String r7 = r4.getName()
            r0.put(r6, r7)
            java.lang.String r6 = r4.getName()
            java.lang.String r6 = stripExtension(r6)
            java.lang.String r7 = "name"
            r0.put(r7, r6)
            java.lang.String r6 = r4.getName()
            java.lang.String r6 = stripExtension(r6)
            java.lang.String r7 = "displayName"
            r0.put(r7, r6)
            java.lang.String r6 = "filePath"
            r0.put(r6, r5)
            java.lang.String r6 = "relativePath"
            r0.put(r6, r5)
            java.lang.String r6 = "path"
            r0.put(r6, r5)
            java.lang.String r5 = "absolutePath"
            java.lang.String r6 = r4.getAbsolutePath()
            r0.put(r5, r6)
            java.lang.String r5 = "canonicalPath"
            java.lang.String r4 = safeCanonicalPath(r4)
            r0.put(r5, r4)
            java.lang.String r4 = "enabled"
            r5 = 1
            r0.put(r4, r5)
            java.lang.String r4 = "installedAt"
            long r5 = java.lang.System.currentTimeMillis()
            r0.put(r4, r5)
            java.lang.String r4 = "installedBy"
            java.lang.String r5 = "modpack"
            r0.put(r4, r5)
            java.lang.String r4 = "modpackName"
            r0.put(r4, r8)
            java.lang.String r4 = "minecraftVersion"
            r0.put(r4, r9)
            java.lang.String r4 = "loader"
            java.lang.String r5 = r10.loaderName
            r0.put(r4, r5)
            java.lang.String r4 = r10.loaderVersion
            java.lang.String r4 = safe(r4)
            java.lang.String r5 = "loaderVersion"
            r0.put(r5, r4)
            java.lang.String r4 = "gameDirectory"
            java.lang.String r3 = r3.getAbsolutePath()
            r0.put(r4, r3)
            return r0
    }

    private static org.json.JSONObject buildLocalModrinthFileMetadata(java.io.File r3, java.lang.String r4) throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "path"
            r0.put(r1, r4)
            java.lang.String r4 = "fileSize"
            long r1 = r3.length()
            r0.put(r4, r1)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r1 = "SHA-1"
            java.lang.String r1 = hashFile(r3, r1)
            java.lang.String r2 = "sha1"
            r4.put(r2, r1)
            java.lang.String r1 = "SHA-512"
            java.lang.String r3 = hashFile(r3, r1)
            java.lang.String r1 = "sha512"
            r4.put(r1, r3)
            java.lang.String r3 = "hashes"
            r0.put(r3, r4)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String r4 = "downloads"
            r0.put(r4, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "client"
            java.lang.String r1 = "required"
            r3.put(r4, r1)
            java.lang.String r4 = "server"
            java.lang.String r1 = "optional"
            r3.put(r4, r1)
            java.lang.String r4 = "env"
            r0.put(r4, r3)
            return r0
    }

    private static org.json.JSONObject buildModrinthInstalledContentEntry(java.io.File r15, java.io.File r16, java.lang.String r17, org.json.JSONObject r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec r22, java.lang.String r23, org.json.JSONObject r24) throws java.lang.Exception {
            r0 = r18
            r1 = r19
            r2 = r24
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r6 = resolveContentTypeForRelativePath(r17)
            if (r6 != 0) goto Le
            r0 = 0
            return r0
        Le:
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ParsedModrinthDownloadIds r3 = parseModrinthDownloadIds(r19)
            java.lang.String r11 = ""
            if (r2 != 0) goto L18
            r4 = r11
            goto L1e
        L18:
            java.lang.String r4 = "project_id"
            java.lang.String r4 = r2.optString(r4, r11)
        L1e:
            java.lang.String r5 = r3.projectId
            java.lang.String r12 = firstNonBlank(r4, r5)
            if (r2 != 0) goto L28
            r4 = r11
            goto L2e
        L28:
            java.lang.String r4 = "id"
            java.lang.String r4 = r2.optString(r4, r11)
        L2e:
            java.lang.String r3 = r3.versionId
            java.lang.String r13 = firstNonBlank(r4, r3)
            if (r2 != 0) goto L38
            r3 = r11
            goto L3e
        L38:
            java.lang.String r3 = "version_number"
            java.lang.String r3 = r2.optString(r3, r11)
        L3e:
            java.lang.String r14 = firstNonBlank(r3, r13)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r7 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r3 = r15
            r4 = r16
            r5 = r17
            r8 = r20
            r9 = r21
            r10 = r22
            org.json.JSONObject r3 = buildInstalledContentBaseEntry(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r4 = "hashes"
            org.json.JSONObject r5 = r0.optJSONObject(r4)
            java.lang.String r6 = "platform"
            java.lang.String r7 = "modrinth"
            r3.put(r6, r7)
            java.lang.String r6 = "modpackPlatform"
            r3.put(r6, r7)
            java.lang.String r6 = "installedFromPlatformModpack"
            r7 = 1
            r3.put(r6, r7)
            boolean r6 = isBlank(r12)
            r6 = r6 ^ r7
            java.lang.String r7 = "updateReady"
            r3.put(r7, r6)
            java.lang.String r6 = "platformProjectId"
            r3.put(r6, r12)
            java.lang.String r6 = "projectId"
            r3.put(r6, r12)
            java.lang.String r6 = "modrinthProjectId"
            r3.put(r6, r12)
            java.lang.String r6 = "platformVersionId"
            r3.put(r6, r13)
            java.lang.String r6 = "versionId"
            r3.put(r6, r13)
            java.lang.String r6 = "modrinthVersionId"
            r3.put(r6, r13)
            java.lang.String r6 = "versionNumber"
            r3.put(r6, r14)
            java.lang.String r6 = "downloadUrl"
            r3.put(r6, r1)
            java.lang.String r6 = "downloads"
            org.json.JSONArray r7 = r0.optJSONArray(r6)
            if (r7 != 0) goto Laf
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            org.json.JSONArray r1 = r7.put(r1)
            goto Lb3
        Laf:
            org.json.JSONArray r1 = r0.optJSONArray(r6)
        Lb3:
            r3.put(r6, r1)
            long r6 = r16.length()
            java.lang.String r1 = "fileSize"
            r3.put(r1, r6)
            long r6 = r16.length()
            long r6 = r0.optLong(r1, r6)
            java.lang.String r1 = "declaredFileSize"
            r3.put(r1, r6)
            if (r5 != 0) goto Ld4
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            goto Ld5
        Ld4:
            r1 = r5
        Ld5:
            r3.put(r4, r1)
            java.lang.String r1 = "sha1"
            if (r5 != 0) goto Le0
            r6 = r23
            r4 = r11
            goto Le6
        Le0:
            java.lang.String r4 = r5.optString(r1, r11)
            r6 = r23
        Le6:
            java.lang.String r4 = firstNonBlank(r6, r4)
            r3.put(r1, r4)
            java.lang.String r1 = "sha512"
            if (r5 != 0) goto Lf2
            goto Lf6
        Lf2:
            java.lang.String r11 = r5.optString(r1, r11)
        Lf6:
            r3.put(r1, r11)
            java.lang.String r1 = "modrinthPackFile"
            r3.put(r1, r0)
            if (r2 == 0) goto L131
            java.lang.String r0 = "modrinthVersion"
            r3.put(r0, r2)
            java.lang.String r0 = "game_versions"
            org.json.JSONArray r1 = r2.optJSONArray(r0)
            if (r1 != 0) goto L113
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            goto L117
        L113:
            org.json.JSONArray r0 = r2.optJSONArray(r0)
        L117:
            java.lang.String r1 = "gameVersions"
            r3.put(r1, r0)
            java.lang.String r0 = "loaders"
            org.json.JSONArray r1 = r2.optJSONArray(r0)
            if (r1 != 0) goto L12a
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            goto L12e
        L12a:
            org.json.JSONArray r1 = r2.optJSONArray(r0)
        L12e:
            r3.put(r0, r1)
        L131:
            return r3
    }

    private static java.lang.String cleanDownloadUrl(java.lang.String r4) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            return r0
        L5:
            java.lang.String r4 = r4.trim()
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.String r1 = "null"
            boolean r2 = r1.equalsIgnoreCase(r4)
            if (r2 != 0) goto L64
            java.lang.String r2 = "<null>"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L21
            goto L64
        L21:
            java.lang.String r2 = "\"null\""
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 != 0) goto L64
            java.lang.String r2 = "'null'"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L32
            goto L64
        L32:
            java.lang.String r2 = "\""
            boolean r3 = r4.startsWith(r2)
            if (r3 == 0) goto L40
            boolean r2 = r4.endsWith(r2)
            if (r2 != 0) goto L4e
        L40:
            java.lang.String r2 = "'"
            boolean r3 = r4.startsWith(r2)
            if (r3 == 0) goto L5c
            boolean r2 = r4.endsWith(r2)
            if (r2 == 0) goto L5c
        L4e:
            int r2 = r4.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r4 = r4.substring(r3, r2)
            java.lang.String r4 = r4.trim()
        L5c:
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L63
            return r0
        L63:
            return r4
        L64:
            return r0
    }

    private static void collectMissingLocalModrinthCandidates(java.io.File r7, java.lang.String r8, java.util.HashSet<java.lang.String> r9, java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.PendingModrinthInstalledFile> r10) {
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r8)
            java.io.File[] r7 = r0.listFiles()
            if (r7 != 0) goto Lc
            return
        Lc:
            int r0 = r7.length
            r1 = 0
        Le:
            if (r1 >= r0) goto La1
            r2 = r7[r1]
            boolean r3 = r2.isHidden()
            if (r3 != 0) goto L9d
            boolean r3 = r2.isFile()
            if (r3 != 0) goto L20
            goto L9d
        L20:
            java.lang.String r3 = r2.getName()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = ".jar"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L3b
            java.lang.String r4 = ".zip"
            boolean r3 = r3.endsWith(r4)
            if (r3 != 0) goto L3b
            goto L9d
        L3b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r4 = "/"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r2.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = normalizeZipPath(r3)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            boolean r4 = r9.contains(r4)
            if (r4 == 0) goto L67
            goto L9d
        L67:
            org.json.JSONObject r4 = buildLocalModrinthFileMetadata(r2, r3)     // Catch: java.lang.Throwable -> L76
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$PendingModrinthInstalledFile r5 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$PendingModrinthInstalledFile     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = ""
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L76
            r10.add(r5)     // Catch: java.lang.Throwable -> L76
            goto L9d
        L76:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to prepare local Modrinth metadata candidate for "
            r4.<init>(r5)
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
        L9d:
            int r1 = r1 + 1
            goto Le
        La1:
            return
    }

    private static boolean containsIgnoreCase(java.util.ArrayList<java.lang.String> r1, java.lang.String r2) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L4
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    private static ca.dnamobile.javalauncher.modmanager.ModManagerContentType contentTypeFromIntentValue(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "mods"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto Lf
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r2
        Lf:
            java.lang.String r1 = "resourcepacks"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L1a
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r2
        L1a:
            java.lang.String r1 = "shaderpacks"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L2c
            java.lang.String r1 = "shaders"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            return r0
        L2c:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            return r2
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

    private static void copyZipPrefixToDirectory(java.util.zip.ZipFile r7, java.lang.String r8, java.io.File r9) throws java.lang.Exception {
            java.lang.String r0 = r9.getCanonicalPath()
            java.util.Enumeration r1 = r7.entries()
        L8:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r1.nextElement()
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L1b
            goto L8
        L1b:
            java.lang.String r3 = r2.getName()
            java.lang.String r3 = normalizeZipPath(r3)
            boolean r4 = r3.startsWith(r8)
            if (r4 != 0) goto L2a
            goto L8
        L2a:
            int r4 = r8.length()
            java.lang.String r3 = r3.substring(r4)
            boolean r4 = isBlank(r3)
            if (r4 != 0) goto L8
            boolean r4 = isSafeRelativePath(r3)
            if (r4 != 0) goto L3f
            goto L8
        L3f:
            java.io.File r4 = new java.io.File
            r5 = 47
            char r6 = java.io.File.separatorChar
            java.lang.String r3 = r3.replace(r5, r6)
            r4.<init>(r9, r3)
            java.lang.String r3 = r4.getCanonicalPath()
            boolean r5 = r3.equals(r0)
            if (r5 != 0) goto L89
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = java.io.File.separator
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L70
            goto L89
        L70:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Blocked unsafe override path: "
            r8.<init>(r9)
            java.lang.String r9 = r2.getName()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L89:
            ensureParent(r4)
            java.io.InputStream r2 = r7.getInputStream(r2)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lac
            copyStream(r2, r3)     // Catch: java.lang.Throwable -> La2
            r3.close()     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L8
            r2.close()
            goto L8
        La2:
            r7 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> La7
            goto Lab
        La7:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> Lac
        Lab:
            throw r7     // Catch: java.lang.Throwable -> Lac
        Lac:
            r7 = move-exception
            if (r2 == 0) goto Lb7
            r2.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r8 = move-exception
            r7.addSuppressed(r8)
        Lb7:
            throw r7
        Lb8:
            return
    }

    private static int countUpdateReadyFiles(org.json.JSONArray r5) {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r5.length()
            if (r1 >= r3) goto L1c
            org.json.JSONObject r3 = r5.optJSONObject(r1)
            if (r3 == 0) goto L19
            java.lang.String r4 = "updateReady"
            boolean r3 = r3.optBoolean(r4, r0)
            if (r3 == 0) goto L19
            int r2 = r2 + 1
        L19:
            int r1 = r1 + 1
            goto L3
        L1c:
            return r2
    }

    private static ca.dnamobile.javalauncher.instance.LauncherInstance createBaseInstance(android.content.Context r10, java.lang.String r11, java.lang.String r12, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec r13, java.lang.String r14, java.io.File r15, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r16) throws java.lang.Exception {
            r0 = r10
            r2 = r11
            r5 = r12
            r1 = r13
            r3 = r16
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r4 = findMinecraftVersion(r10, r12)
            if (r4 == 0) goto L144
            boolean r6 = isVanillaInstalled(r12)
            java.lang.String r7 = "..."
            if (r6 != 0) goto L32
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Installing Minecraft "
            r6.<init>(r8)
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.onStatus(r6)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda0 r6 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda0
            r6.<init>(r3)
            ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.installVanillaVersion(r10, r4, r6)
        L32:
            java.lang.String r6 = r1.loaderName
            java.lang.String r1 = r1.loaderVersion
            java.lang.String r1 = normalizeLoaderVersionForInstaller(r6, r1, r12)
            java.lang.String r8 = "Fabric"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto L67
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Installing Fabric "
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r8 = r8.toString()
            r3.onStatus(r8)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda1 r8 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda1
            r8.<init>(r3)
            ca.dnamobile.javalauncher.ui.version.FabricInstaller$InstallResult r1 = ca.dnamobile.javalauncher.ui.version.FabricInstaller.installFabricVersion(r10, r4, r1, r8)
            java.lang.String r1 = r1.getFabricVersionId()
        L65:
            r4 = r1
            goto Lc8
        L67:
            java.lang.String r8 = "Forge"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto L93
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Installing Forge "
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r8 = r8.toString()
            r3.onStatus(r8)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda2 r8 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda2
            r8.<init>(r3)
            ca.dnamobile.javalauncher.ui.version.ForgeInstaller$InstallResult r1 = ca.dnamobile.javalauncher.ui.version.ForgeInstaller.installForgeVersion(r10, r4, r11, r1, r8)
            java.lang.String r1 = r1.getForgeVersionId()
            goto L65
        L93:
            java.lang.String r8 = "NeoForge"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto Lbf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Installing NeoForge "
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r8 = r8.toString()
            r3.onStatus(r8)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda3 r8 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$$ExternalSyntheticLambda3
            r8.<init>(r3)
            ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller$InstallResult r1 = ca.dnamobile.javalauncher.ui.version.NeoForgeInstaller.installNeoForgeVersion(r10, r4, r11, r1, r8)
            java.lang.String r1 = r1.getNeoForgeVersionId()
            goto L65
        Lbf:
            java.lang.String r1 = "Quilt"
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 != 0) goto L13c
            r4 = r5
        Lc8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "Creating instance "
            r1.<init>(r8)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r3.onStatus(r1)
            r1 = 0
            if (r15 == 0) goto Le9
            boolean r3 = r15.isFile()
            if (r3 == 0) goto Le9
            r8 = r1
            goto Lef
        Le9:
            r3 = r14
            java.io.File r3 = downloadInstanceIcon(r10, r14)
            r8 = r3
        Lef:
            if (r15 == 0) goto Lfc
            boolean r3 = r15.isFile()
            if (r3 == 0) goto Lfc
            android.net.Uri r1 = android.net.Uri.fromFile(r15)
            goto L103
        Lfc:
            if (r8 != 0) goto Lff
            goto L103
        Lff:
            android.net.Uri r1 = android.net.Uri.fromFile(r8)
        L103:
            r7 = r1
            java.lang.String r9 = "release"
            r1 = r10
            r2 = r11
            r3 = r6
            r5 = r12
            r6 = r9
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.createInstance(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12f
            if (r8 == 0) goto L11a
            boolean r1 = r8.exists()
            if (r1 == 0) goto L11a
            r8.delete()
        L11a:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r0.getGameDirectory()
            java.lang.String r3 = "mods"
            r1.<init>(r2, r3)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L12e
            r1.mkdirs()
        L12e:
            return r0
        L12f:
            r0 = move-exception
            if (r8 == 0) goto L13b
            boolean r1 = r8.exists()
            if (r1 == 0) goto L13b
            r8.delete()
        L13b:
            throw r0
        L13c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Quilt modpacks are detected, but this JavaLauncher build does not have a Quilt installer wired yet."
            r0.<init>(r1)
            throw r0
        L144:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Minecraft "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " was not found in the version manifest."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static int curseForgeLoaderType(java.lang.String r1) {
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

    private static void deleteTempFile(java.io.File r1) {
            if (r1 == 0) goto Lb
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lb
            r1.delete()
        Lb:
            return
    }

    private static java.io.File downloadCurseForgeModpack(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r12) throws java.lang.Exception {
            java.lang.String r0 = "CurseForge project id"
            int r8 = parsePositiveInt(r8, r0)
            java.lang.String r0 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto Lfd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://api.curseforge.com/v1/mods/"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = "/files?pageSize=50&index=0&gameId=432"
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = isBlank(r10)
            if (r2 != 0) goto L38
            java.lang.String r2 = "&gameVersion="
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r10 = r10.trim()
            java.lang.String r10 = urlEncode(r10)
            r2.append(r10)
        L38:
            int r10 = curseForgeLoaderType(r11)
            if (r10 <= 0) goto L47
            java.lang.String r11 = "&modLoaderType="
            java.lang.StringBuilder r11 = r1.append(r11)
            r11.append(r10)
        L47:
            org.json.JSONObject r10 = new org.json.JSONObject
            java.lang.String r11 = r1.toString()
            java.lang.String r11 = httpGetString(r11, r0)
            r10.<init>(r11)
            java.lang.String r11 = "data"
            org.json.JSONArray r10 = r10.optJSONArray(r11)
            java.lang.String r11 = ".zip"
            java.lang.String r1 = "fileName"
            r2 = 0
            if (r10 == 0) goto L85
            r3 = r2
        L62:
            int r4 = r10.length()
            if (r3 >= r4) goto L85
            org.json.JSONObject r4 = r10.optJSONObject(r3)
            if (r4 != 0) goto L6f
            goto L82
        L6f:
            java.lang.String r5 = ""
            java.lang.String r5 = r4.optString(r1, r5)
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r6)
            boolean r5 = r5.endsWith(r11)
            if (r5 == 0) goto L82
            goto L86
        L82:
            int r3 = r3 + 1
            goto L62
        L85:
            r4 = 0
        L86:
            if (r4 == 0) goto Lf5
            java.lang.String r10 = "id"
            int r10 = r4.optInt(r10, r2)
            java.lang.String r1 = optJsonString(r4, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = safe(r9)
            java.lang.StringBuilder r9 = r2.append(r9)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "modpack.zip"
            java.lang.String r9 = sanitizeFileName(r9, r11)
            java.lang.String r9 = sanitizeFileName(r1, r9)
            java.lang.String r8 = resolveCurseForgeDownloadUrl(r0, r8, r10, r9, r4)
            boolean r10 = isBlank(r8)
            if (r10 != 0) goto Le0
            java.io.File r10 = new java.io.File
            java.io.File r7 = r7.getCacheDir()
            r10.<init>(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Downloading "
            r7.<init>(r11)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r9 = "..."
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            r12.onStatus(r7)
            downloadFile(r8, r10, r12)
            return r10
        Le0:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "CurseForge did not provide a downloadable URL for this modpack file: "
            r8.<init>(r10)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Lf5:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "No compatible CurseForge modpack file was found."
            r7.<init>(r8)
            throw r7
        Lfd:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Missing CurseForge API key."
            r7.<init>(r8)
            throw r7
    }

    private static java.io.File downloadCurseForgeModpackVersion(android.content.Context r5, java.lang.String r6, java.lang.String r7, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r8, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r9) throws java.lang.Exception {
            java.lang.String r0 = "CurseForge project id"
            int r6 = parsePositiveInt(r6, r0)
            int r0 = r8.fileId
            if (r0 <= 0) goto Ld
            int r0 = r8.fileId
            goto L15
        Ld:
            java.lang.String r0 = r8.versionId
            java.lang.String r1 = "CurseForge file id"
            int r0 = parsePositiveInt(r0, r1)
        L15:
            java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r2 = isBlank(r1)
            if (r2 != 0) goto Lcc
            org.json.JSONObject r2 = new org.json.JSONObject
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "https://api.curseforge.com/v1/mods/"
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = "/files/"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = httpGetString(r3, r1)
            r2.<init>(r3)
            java.lang.String r3 = "data"
            org.json.JSONObject r2 = r2.optJSONObject(r3)
            if (r2 == 0) goto Lc4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = safe(r7)
            java.lang.StringBuilder r7 = r3.append(r7)
            java.lang.String r3 = "-"
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r3 = ".zip"
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r3 = "modpack.zip"
            java.lang.String r7 = sanitizeFileName(r7, r3)
            java.lang.String r3 = "fileName"
            java.lang.String r3 = optJsonString(r2, r3)
            java.lang.String r8 = r8.fileName
            java.lang.String r7 = sanitizeFileName(r8, r7)
            java.lang.String r7 = sanitizeFileName(r3, r7)
            java.lang.String r6 = resolveCurseForgeDownloadUrl(r1, r6, r0, r7, r2)
            boolean r8 = isBlank(r6)
            if (r8 != 0) goto Laf
            java.io.File r8 = new java.io.File
            java.io.File r5 = r5.getCacheDir()
            r8.<init>(r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Downloading "
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r7 = "..."
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r9.onStatus(r5)
            downloadFile(r6, r8, r9)
            return r8
        Laf:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "CurseForge did not provide a downloadable URL for this modpack file: "
            r6.<init>(r8)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lc4:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "The selected CurseForge modpack file could not be loaded."
            r5.<init>(r6)
            throw r5
        Lcc:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Missing CurseForge API key."
            r5.<init>(r6)
            throw r5
    }

    private static void downloadFile(java.lang.String r7, java.io.File r8, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r9) throws java.lang.Exception {
            java.lang.String r7 = cleanDownloadUrl(r7)
            boolean r0 = isHttpUrl(r7)
            if (r0 == 0) goto L87
            ensureParent(r8)
            r0 = 0
            java.net.HttpURLConnection r0 = openConnection(r7, r0)
            int r1 = r0.getResponseCode()
            int r2 = r1 / 100
            r3 = 2
            if (r2 != r3) goto L68
            int r7 = r0.getContentLength()
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L63
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L57
            r8 = 65536(0x10000, float:9.1835E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            r4 = r3
        L2e:
            int r5 = r1.read(r8)     // Catch: java.lang.Throwable -> L4d
            r6 = -1
            if (r5 == r6) goto L41
            r2.write(r8, r3, r5)     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + r5
            if (r9 == 0) goto L2e
            if (r7 <= 0) goto L2e
            r9.onProgress(r4, r7)     // Catch: java.lang.Throwable -> L4d
            goto L2e
        L41:
            r2.close()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Throwable -> L63
        L49:
            r0.disconnect()
            return
        L4d:
            r7 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L57
        L56:
            throw r7     // Catch: java.lang.Throwable -> L57
        L57:
            r7 = move-exception
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L63
        L62:
            throw r7     // Catch: java.lang.Throwable -> L63
        L63:
            r7 = move-exception
            r0.disconnect()
            throw r7
        L68:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "HTTP "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r0 = " while downloading "
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L87:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Missing or invalid download URL for "
            r9.<init>(r0)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private static java.io.File downloadInstanceIcon(android.content.Context r3, java.lang.String r4) {
            java.lang.String r4 = cleanDownloadUrl(r4)
            boolean r0 = isHttpUrl(r4)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = "javalauncher-modpack-icon-"
            java.lang.String r2 = ".png"
            java.io.File r3 = r3.getCacheDir()     // Catch: java.lang.Throwable -> L1e
            java.io.File r3 = java.io.File.createTempFile(r0, r2, r3)     // Catch: java.lang.Throwable -> L1e
            downloadFile(r4, r3, r1)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r4 = move-exception
            goto L20
        L1e:
            r4 = move-exception
            r3 = r1
        L20:
            if (r3 == 0) goto L2b
            boolean r0 = r3.exists()
            if (r0 == 0) goto L2b
            r3.delete()
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to download modpack icon: "
            r3.<init>(r0)
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return r1
    }

    private static java.io.File downloadModrinthModpack(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r13) throws java.lang.Exception {
            boolean r0 = isBlank(r8)
            if (r0 != 0) goto Lb
            java.lang.String r8 = r8.trim()
            goto Lf
        Lb:
            java.lang.String r8 = safe(r9)
        Lf:
            boolean r9 = isBlank(r8)
            if (r9 != 0) goto Le9
            org.json.JSONArray r9 = new org.json.JSONArray
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://api.modrinth.com/v2/project/"
            r0.<init>(r1)
            java.lang.String r8 = urlEncode(r8)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = "/version"
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r0 = 0
            java.lang.String r8 = httpGetString(r8, r0)
            r9.<init>(r8)
            org.json.JSONObject r8 = selectModrinthVersion(r9, r11, r12)
            if (r8 == 0) goto Le1
            java.lang.String r9 = "files"
            org.json.JSONArray r8 = r8.optJSONArray(r9)
            java.lang.String r9 = ".mrpack"
            java.lang.String r11 = "filename"
            java.lang.String r12 = ""
            if (r8 == 0) goto L7f
            r1 = 0
            r2 = r1
        L4e:
            int r3 = r8.length()
            if (r2 >= r3) goto L7f
            org.json.JSONObject r3 = r8.optJSONObject(r2)
            if (r3 != 0) goto L5b
            goto L7c
        L5b:
            java.lang.String r4 = r3.optString(r11, r12)
            java.lang.String r5 = "primary"
            boolean r6 = r3.optBoolean(r5, r1)
            if (r6 != 0) goto L73
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r6)
            boolean r4 = r4.endsWith(r9)
            if (r4 == 0) goto L7c
        L73:
            boolean r0 = r3.optBoolean(r5, r1)
            if (r0 == 0) goto L7b
            r0 = r3
            goto L7f
        L7b:
            r0 = r3
        L7c:
            int r2 = r2 + 1
            goto L4e
        L7f:
            if (r0 == 0) goto Ld9
            java.lang.String r8 = "url"
            java.lang.String r8 = r0.optString(r8, r12)
            boolean r12 = isBlank(r8)
            if (r12 != 0) goto Ld1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = safe(r10)
            java.lang.StringBuilder r10 = r12.append(r10)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r0.optString(r11, r9)
            java.lang.String r10 = "modpack.mrpack"
            java.lang.String r9 = sanitizeFileName(r9, r10)
            java.io.File r10 = new java.io.File
            java.io.File r7 = r7.getCacheDir()
            r10.<init>(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Downloading "
            r7.<init>(r11)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r9 = "..."
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            r13.onStatus(r7)
            downloadFile(r8, r10, r13)
            return r10
        Ld1:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "The Modrinth .mrpack download URL is missing."
            r7.<init>(r8)
            throw r7
        Ld9:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "The selected Modrinth version does not contain an .mrpack file."
            r7.<init>(r8)
            throw r7
        Le1:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "No compatible Modrinth modpack version was found."
            r7.<init>(r8)
            throw r7
        Le9:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Missing Modrinth project id."
            r7.<init>(r8)
            throw r7
    }

    private static java.io.File downloadModrinthModpackVersion(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r7, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r8) throws java.lang.Exception {
            java.lang.String r0 = r7.downloadUrl
            java.lang.String r0 = cleanDownloadUrl(r0)
            boolean r1 = isHttpUrl(r0)
            if (r1 != 0) goto L37
            java.util.ArrayList r4 = listModrinthModpackVersions(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L37
            java.lang.Object r5 = r4.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r5 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice) r5
            java.lang.String r1 = r5.versionId
            java.lang.String r2 = r7.versionId
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L14
            java.lang.String r0 = r5.downloadUrl
            java.lang.String r0 = cleanDownloadUrl(r0)
            boolean r1 = isHttpUrl(r0)
            if (r1 == 0) goto L14
            r7 = r5
        L37:
            boolean r4 = isHttpUrl(r0)
            if (r4 == 0) goto L93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = safe(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "-"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r7.getDisplayTitle()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ".mrpack"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "modpack.mrpack"
            java.lang.String r4 = sanitizeFileName(r4, r5)
            java.lang.String r5 = r7.fileName
            java.lang.String r4 = sanitizeFileName(r5, r4)
            java.io.File r5 = new java.io.File
            java.io.File r3 = r3.getCacheDir()
            r5.<init>(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Downloading "
            r3.<init>(r6)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "..."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.onStatus(r3)
            downloadFile(r0, r5, r8)
            return r5
        L93:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "The selected Modrinth modpack version does not have a downloadable .mrpack file."
            r3.<init>(r4)
            throw r3
    }

    private static void ensureParent(java.io.File r3) throws java.io.IOException {
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L2c
            boolean r0 = r3.exists()
            if (r0 != 0) goto L2c
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L13
            goto L2c
        L13:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create folder: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2c:
            return
    }

    private static java.util.ArrayList<java.lang.String> extractCurseForgeLoaders(java.util.ArrayList<java.lang.String> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            if (r1 != 0) goto L1b
            r1 = r2
            goto L25
        L1b:
            java.lang.String r1 = r1.trim()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r3)
        L25:
            java.lang.String r3 = "forge"
            boolean r4 = r3.equals(r1)
            if (r4 != 0) goto L68
            java.lang.String r4 = "forge "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L36
            goto L68
        L36:
            java.lang.String r3 = "fabric"
            boolean r4 = r3.equals(r1)
            if (r4 != 0) goto L68
            java.lang.String r4 = "fabric "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L47
            goto L68
        L47:
            java.lang.String r3 = "neoforge"
            boolean r4 = r3.equals(r1)
            if (r4 != 0) goto L68
            java.lang.String r4 = "neoforge "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L58
            goto L68
        L58:
            java.lang.String r3 = "quilt"
            boolean r4 = r3.equals(r1)
            if (r4 != 0) goto L68
            java.lang.String r4 = "quilt "
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L69
        L68:
            r2 = r3
        L69:
            boolean r1 = isBlank(r2)
            if (r1 != 0) goto L9
            boolean r1 = containsIgnoreCase(r0, r2)
            if (r1 != 0) goto L9
            r0.add(r2)
            goto L9
        L79:
            return r0
    }

    private static java.io.File extractPackIconToTempFile(android.content.Context r8, java.io.File r9, java.lang.String r10) {
            java.lang.String r0 = "ModpackInstall"
            java.lang.String r1 = "Skipping oversized modpack icon: "
            boolean r2 = r9.isFile()
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            if (r10 != 0) goto L11
            java.lang.String r10 = ""
            goto L15
        L11:
            java.lang.String r10 = normalizeZipPath(r10)
        L15:
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L98
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L98
            java.util.zip.ZipEntry r9 = findPackIconEntry(r2, r10)     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L8a
            boolean r10 = r9.isDirectory()     // Catch: java.lang.Throwable -> L8e
            if (r10 == 0) goto L27
            goto L8a
        L27:
            long r4 = r9.getSize()     // Catch: java.lang.Throwable -> L8e
            r6 = 5242880(0x500000, double:2.590327E-317)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L4a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8e
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r8)     // Catch: java.lang.Throwable -> L8e
            r2.close()     // Catch: java.lang.Throwable -> L98
            return r3
        L4a:
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = resolveIconExtension(r10)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "javalauncher-imported-modpack-icon-"
            java.io.File r8 = r8.getCacheDir()     // Catch: java.lang.Throwable -> L8e
            java.io.File r8 = java.io.File.createTempFile(r1, r10, r8)     // Catch: java.lang.Throwable -> L8e
            java.io.InputStream r9 = r2.getInputStream(r9)     // Catch: java.lang.Throwable -> L8e
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7e
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            copyStream(r9, r10)     // Catch: java.lang.Throwable -> L74
            r10.close()     // Catch: java.lang.Throwable -> L7e
            if (r9 == 0) goto L70
            r9.close()     // Catch: java.lang.Throwable -> L8e
        L70:
            r2.close()     // Catch: java.lang.Throwable -> L98
            return r8
        L74:
            r8 = move-exception
            r10.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r10 = move-exception
            r8.addSuppressed(r10)     // Catch: java.lang.Throwable -> L7e
        L7d:
            throw r8     // Catch: java.lang.Throwable -> L7e
        L7e:
            r8 = move-exception
            if (r9 == 0) goto L89
            r9.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L8e
        L89:
            throw r8     // Catch: java.lang.Throwable -> L8e
        L8a:
            r2.close()     // Catch: java.lang.Throwable -> L98
            return r3
        L8e:
            r8 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L98
        L97:
            throw r8     // Catch: java.lang.Throwable -> L98
        L98:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to extract modpack icon: "
            r9.<init>(r10)
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r8)
            return r3
    }

    private static java.lang.String findFirstExistingPrefix(java.util.zip.ZipFile r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L28
            r2 = r6[r1]
            java.util.Enumeration r3 = r5.entries()
        La:
            boolean r4 = r3.hasMoreElements()
            if (r4 == 0) goto L25
            java.lang.Object r4 = r3.nextElement()
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = normalizeZipPath(r4)
            boolean r4 = r4.startsWith(r2)
            if (r4 == 0) goto La
            return r2
        L25:
            int r1 = r1 + 1
            goto L2
        L28:
            r5 = 0
            return r5
    }

    private static ca.dnamobile.javalauncher.data.model.MinecraftVersion findMinecraftVersion(android.content.Context r2, java.lang.String r3) throws java.lang.Exception {
            java.util.List r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionManifestClient.loadVersions(r2)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r0 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r0
            java.lang.String r1 = r0.getId()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L8
            return r0
        L1f:
            r2 = 0
            return r2
    }

    private static org.json.JSONObject findModrinthMrpackFile(org.json.JSONObject r6) {
            java.lang.String r0 = "files"
            org.json.JSONArray r6 = r6.optJSONArray(r0)
            r0 = 0
            if (r6 != 0) goto La
            return r0
        La:
            r1 = 0
            r2 = r1
        Lc:
            int r3 = r6.length()
            if (r2 >= r3) goto L3f
            org.json.JSONObject r3 = r6.optJSONObject(r2)
            if (r3 != 0) goto L19
            goto L3c
        L19:
            java.lang.String r4 = "filename"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = ".mrpack"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L30
            goto L3c
        L30:
            if (r0 != 0) goto L33
            r0 = r3
        L33:
            java.lang.String r4 = "primary"
            boolean r4 = r3.optBoolean(r4, r1)
            if (r4 == 0) goto L3c
            return r3
        L3c:
            int r2 = r2 + 1
            goto Lc
        L3f:
            return r0
    }

    private static java.lang.String findMultiMcMinecraftVersion(org.json.JSONObject r5) {
            java.lang.String r0 = "components"
            org.json.JSONArray r5 = r5.optJSONArray(r0)
            java.lang.String r0 = ""
            if (r5 != 0) goto Lb
            return r0
        Lb:
            r1 = 0
        Lc:
            int r2 = r5.length()
            if (r1 >= r2) goto L35
            org.json.JSONObject r2 = r5.optJSONObject(r1)
            if (r2 != 0) goto L19
            goto L32
        L19:
            java.lang.String r3 = "uid"
            java.lang.String r3 = r2.optString(r3, r0)
            java.lang.String r4 = "net.minecraft"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L32
            java.lang.String r5 = "version"
            java.lang.String r5 = r2.optString(r5, r0)
            java.lang.String r5 = r5.trim()
            return r5
        L32:
            int r1 = r1 + 1
            goto Lc
        L35:
            return r0
    }

    private static java.lang.String findMultiMcRootPrefix(java.util.zip.ZipFile r3) {
            java.lang.String r0 = "mmc-pack.json"
            java.util.zip.ZipEntry r1 = r3.getEntry(r0)
            if (r1 == 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.util.Enumeration r3 = r3.entries()
        Lf:
            boolean r1 = r3.hasMoreElements()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r3.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L22
            goto Lf
        L22:
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = normalizeZipPath(r1)
            java.lang.String r2 = "/mmc-pack.json"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto Lf
            int r3 = r1.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            r0 = 0
            java.lang.String r3 = r1.substring(r0, r3)
            return r3
        L41:
            r3 = 0
            return r3
    }

    private static java.util.zip.ZipEntry findPackIconEntry(java.util.zip.ZipFile r7, java.lang.String r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "javalauncher-pack-icon.png"
            r0.add(r1)
            java.lang.String r2 = "icon.png"
            r0.add(r2)
            java.lang.String r3 = "pack.png"
            r0.add(r3)
            java.lang.String r4 = "modpack-icon.png"
            r0.add(r4)
            java.lang.String r5 = "logo.png"
            r0.add(r5)
            java.lang.String r6 = "overrides/pack.png"
            r0.add(r6)
            java.lang.String r6 = "overrides/icon.png"
            r0.add(r6)
            java.lang.String r6 = "overrides/modpack-icon.png"
            r0.add(r6)
            java.lang.String r6 = "overrides/logo.png"
            r0.add(r6)
            boolean r6 = isBlank(r8)
            if (r6 != 0) goto Lc8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = ".minecraft/pack.png"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r8 = r2.append(r8)
            java.lang.String r2 = ".minecraft/icon.png"
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            r0.add(r8)
        Lc8:
            java.util.Iterator r8 = r0.iterator()
        Lcc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Le5
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.zip.ZipEntry r0 = r7.getEntry(r0)
            if (r0 == 0) goto Lcc
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto Lcc
            return r0
        Le5:
            java.util.Enumeration r7 = r7.entries()
        Le9:
            boolean r8 = r7.hasMoreElements()
            if (r8 == 0) goto L121
            java.lang.Object r8 = r7.nextElement()
            java.util.zip.ZipEntry r8 = (java.util.zip.ZipEntry) r8
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto Lfc
            goto Le9
        Lfc:
            java.lang.String r0 = r8.getName()
            java.lang.String r0 = normalizeZipPath(r0)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L120
            java.lang.String r2 = "/javalauncher-pack-icon.png"
            boolean r2 = r0.endsWith(r2)
            if (r2 != 0) goto L120
            java.lang.String r2 = "/instance-icon.png"
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto Le9
        L120:
            return r8
        L121:
            r7 = 0
            return r7
    }

    private static java.lang.String firstNonBlank(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isBlank(r1)
            if (r0 == 0) goto La
            java.lang.String r1 = safe(r2)
        La:
            java.lang.String r1 = r1.trim()
            return r1
    }

    private static java.io.File getJavaLauncherMetadataDirectory(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".javalauncher"
            r0.<init>(r2, r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L10
            r0.mkdirs()
        L10:
            return r0
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

    private static java.lang.String httpGetString(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            java.net.HttpURLConnection r3 = openConnection(r3, r4)
            int r4 = r3.getResponseCode()
            int r0 = r4 / 100
            r1 = 2
            if (r0 != r1) goto L12
            java.io.InputStream r2 = r3.getInputStream()
            goto L16
        L12:
            java.io.InputStream r2 = r3.getErrorStream()
        L16:
            if (r2 != 0) goto L1b
            java.lang.String r2 = ""
            goto L1f
        L1b:
            java.lang.String r2 = readToString(r2)
        L1f:
            r3.disconnect()
            if (r0 != r1) goto L25
            return r2
        L25:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private static java.lang.String httpPostString(java.lang.String r2, org.json.JSONObject r3, java.lang.String r4) throws java.lang.Exception {
            java.net.HttpURLConnection r2 = openConnection(r2, r4)
            java.lang.String r4 = "POST"
            r2.setRequestMethod(r4)
            r4 = 1
            r2.setDoOutput(r4)
            java.lang.String r4 = "Content-Type"
            java.lang.String r0 = "application/json; charset=UTF-8"
            r2.setRequestProperty(r4, r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "UTF-8"
            byte[] r3 = r3.getBytes(r4)
            int r4 = r3.length
            r2.setFixedLengthStreamingMode(r4)
            java.io.OutputStream r4 = r2.getOutputStream()
            r4.write(r3)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L2e
            r4.close()
        L2e:
            int r3 = r2.getResponseCode()
            int r4 = r3 / 100
            r0 = 2
            if (r4 != r0) goto L3c
            java.io.InputStream r1 = r2.getInputStream()
            goto L40
        L3c:
            java.io.InputStream r1 = r2.getErrorStream()
        L40:
            if (r1 != 0) goto L45
            java.lang.String r1 = ""
            goto L49
        L45:
            java.lang.String r1 = readToString(r1)
        L49:
            r2.disconnect()
            if (r4 != r0) goto L4f
            return r1
        L4f:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "HTTP "
            r4.<init>(r0)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L6e:
            r2 = move-exception
            if (r4 == 0) goto L79
            r4.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r3 = move-exception
            r2.addSuppressed(r3)
        L79:
            throw r2
    }

    public static void importFromUri(android.content.Context r4, android.net.Uri r5, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r6) {
            r0 = 0
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "Preparing selected modpack..."
            r6.onStatus(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "javalauncher-modpack-import-"
            java.lang.String r2 = ".zip"
            java.io.File r3 = r4.getCacheDir()     // Catch: java.lang.Throwable -> L54
            java.io.File r0 = java.io.File.createTempFile(r1, r2, r3)     // Catch: java.lang.Throwable -> L54
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L54
            java.io.InputStream r5 = r1.openInputStream(r5)     // Catch: java.lang.Throwable -> L54
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L48
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L37
            copyStream(r5, r1)     // Catch: java.lang.Throwable -> L35
            r1.close()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L2f
            r5.close()     // Catch: java.lang.Throwable -> L54
        L2f:
            installFromLocalFile(r4, r0, r6)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L64
            goto L61
        L35:
            r4 = move-exception
            goto L3f
        L37:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Unable to open selected modpack file."
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L3f:
            r1.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch: java.lang.Throwable -> L48
        L47:
            throw r4     // Catch: java.lang.Throwable -> L48
        L48:
            r4 = move-exception
            if (r5 == 0) goto L53
            r5.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Throwable -> L54
        L53:
            throw r4     // Catch: java.lang.Throwable -> L54
        L54:
            r4 = move-exception
            java.lang.String r5 = "ModpackInstall"
            java.lang.String r1 = "Unable to import modpack"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r1, r4)     // Catch: java.lang.Throwable -> L65
            r6.onError(r4)     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L64
        L61:
            r0.delete()
        L64:
            return
        L65:
            r4 = move-exception
            if (r0 == 0) goto L6b
            r0.delete()
        L6b:
            throw r4
    }

    private static void installCurseForgePack(android.content.Context r29, java.io.File r30, java.lang.String r31, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r32) throws java.lang.Exception {
            r0 = r29
            r8 = r30
            r9 = r32
            java.lang.String r1 = "Reading CurseForge modpack..."
            r9.onStatus(r1)
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r1.<init>(r8)
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L36b
            java.lang.String r2 = "manifest.json"
            java.lang.String r2 = readZipEntryText(r1, r2)     // Catch: java.lang.Throwable -> L36b
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L36b
            r1.close()
            java.lang.String r1 = "minecraft"
            org.json.JSONObject r1 = r10.optJSONObject(r1)
            if (r1 == 0) goto L363
            java.lang.String r2 = "version"
            java.lang.String r11 = ""
            java.lang.String r2 = r1.optString(r2, r11)
            java.lang.String r21 = r2.trim()
            boolean r2 = isBlank(r21)
            if (r2 != 0) goto L35b
            java.lang.String r2 = "modLoaders"
            org.json.JSONArray r1 = r1.optJSONArray(r2)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r22 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec.fromCurseForgeManifest(r1)
            java.lang.String r1 = "CurseForge Modpack"
            java.lang.String r15 = "name"
            java.lang.String r1 = r10.optString(r15, r1)
            java.lang.String r14 = uniqueInstanceName(r0, r1)
            java.io.File r12 = extractPackIconToTempFile(r0, r8, r11)
            r1 = r29
            r2 = r14
            r3 = r21
            r4 = r22
            r5 = r31
            r6 = r12
            r7 = r32
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = createBaseInstance(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L355
            deleteTempFile(r12)
            java.io.File r2 = r1.getGameDirectory()
            java.lang.String r3 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r0 = isBlank(r3)
            if (r0 != 0) goto L34d
            java.lang.String r0 = "Installing CurseForge files..."
            r9.onStatus(r0)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.lang.String r0 = "files"
            org.json.JSONArray r4 = r10.optJSONArray(r0)
            if (r4 != 0) goto L87
            r6 = 0
            goto L8c
        L87:
            int r0 = r4.length()
            r6 = r0
        L8c:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r12 = 0
            r23 = 0
        L94:
            if (r4 == 0) goto L291
            int r0 = r4.length()
            if (r12 >= r0) goto L291
            org.json.JSONObject r0 = r4.optJSONObject(r12)
            if (r0 != 0) goto Lb1
            r27 = r1
            r26 = r3
            r24 = r4
            r25 = r11
            r1 = r12
            r8 = r13
            r3 = r14
            r28 = r15
            goto L27f
        Lb1:
            java.lang.String r5 = "projectId"
            r24 = r4
            r4 = 0
            int r5 = r0.optInt(r5, r4)
            java.lang.String r4 = "projectID"
            int r4 = r0.optInt(r4, r5)
            java.lang.String r5 = "fileId"
            r25 = r11
            r11 = 0
            int r5 = r0.optInt(r5, r11)
            java.lang.String r11 = "fileID"
            int r5 = r0.optInt(r11, r5)
            if (r4 <= 0) goto L25a
            if (r5 > 0) goto Ld5
            goto L25a
        Ld5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r11 = "project-"
            r0.<init>(r11)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r11 = "-"
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r11 = ".jar"
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r11 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d6
            r16 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r12.<init>()     // Catch: java.lang.Throwable -> L1ca
            r17 = r13
            java.lang.String r13 = "https://api.curseforge.com/v1/mods/"
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> L1bd
            java.lang.StringBuilder r12 = r12.append(r4)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r13 = "/files/"
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> L1bd
            java.lang.StringBuilder r12 = r12.append(r5)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r12 = httpGetString(r12, r3)     // Catch: java.lang.Throwable -> L1bd
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r12 = "data"
            org.json.JSONObject r0 = r0.optJSONObject(r12)     // Catch: java.lang.Throwable -> L1bd
            if (r0 == 0) goto L1a8
            java.lang.String r12 = "fileName"
            java.lang.String r12 = optJsonString(r0, r12)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r12 = sanitizeFileName(r12, r11)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r13 = resolveCurseForgeDownloadUrl(r3, r4, r5, r12, r0)     // Catch: java.lang.Throwable -> L1bd
            boolean r18 = isBlank(r13)     // Catch: java.lang.Throwable -> L1bd
            if (r18 != 0) goto L195
            r26 = r3
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L191
            r27 = r1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L18f
            java.lang.String r8 = "mods"
            r1.<init>(r2, r8)     // Catch: java.lang.Throwable -> L18f
            r3.<init>(r1, r12)     // Catch: java.lang.Throwable -> L18f
            ensureParent(r3)     // Catch: java.lang.Throwable -> L18f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18f
            r1.<init>()     // Catch: java.lang.Throwable -> L18f
            java.lang.String r8 = "Downloading "
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch: java.lang.Throwable -> L18f
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch: java.lang.Throwable -> L18f
            java.lang.String r8 = "..."
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch: java.lang.Throwable -> L18f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L18f
            r9.onStatus(r1)     // Catch: java.lang.Throwable -> L18f
            r1 = 0
            downloadFile(r13, r3, r1)     // Catch: java.lang.Throwable -> L18f
            java.lang.String r18 = r10.optString(r15, r14)     // Catch: java.lang.Throwable -> L18f
            r1 = r16
            r12 = r2
            r8 = r17
            r17 = r13
            r13 = r3
            r3 = r14
            r14 = r0
            r28 = r15
            r15 = r4
            r16 = r5
            r19 = r21
            r20 = r22
            org.json.JSONObject r0 = buildCurseForgeInstalledContentEntry(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L1bb
            r7.put(r0)     // Catch: java.lang.Throwable -> L1bb
            int r23 = r23 + 1
            goto L24f
        L18f:
            r0 = move-exception
            goto L1c2
        L191:
            r0 = move-exception
            r27 = r1
            goto L1c2
        L195:
            r27 = r1
            r26 = r3
            r3 = r14
            r28 = r15
            r1 = r16
            r8 = r17
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r12 = "CurseForge did not provide a downloadable URL"
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L1bb
            throw r0     // Catch: java.lang.Throwable -> L1bb
        L1a8:
            r27 = r1
            r26 = r3
            r3 = r14
            r28 = r15
            r1 = r16
            r8 = r17
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r12 = "Missing CurseForge file metadata"
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L1bb
            throw r0     // Catch: java.lang.Throwable -> L1bb
        L1bb:
            r0 = move-exception
            goto L1e0
        L1bd:
            r0 = move-exception
            r27 = r1
            r26 = r3
        L1c2:
            r3 = r14
            r28 = r15
            r1 = r16
            r8 = r17
            goto L1e0
        L1ca:
            r0 = move-exception
            r27 = r1
            r26 = r3
            r8 = r13
            r3 = r14
            r28 = r15
            r1 = r16
            goto L1e0
        L1d6:
            r0 = move-exception
            r27 = r1
            r26 = r3
            r1 = r12
            r8 = r13
            r3 = r14
            r28 = r15
        L1e0:
            java.lang.String r12 = r0.getMessage()
            if (r12 != 0) goto L1ef
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            goto L1f3
        L1ef:
            java.lang.String r0 = r0.getMessage()
        L1f3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r12 = " skipped: "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r11 = r11.toString()
            r8.add(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "CurseForge modpack file skipped: "
            r11.<init>(r12)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r12 = ":"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r5)
            java.lang.String r13 = " - "
            java.lang.StringBuilder r11 = r11.append(r13)
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r11 = "Skipping unavailable CurseForge file "
            r0.<init>(r11)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.onStatus(r0)
        L24f:
            int r12 = r1 + 1
            r4 = 1
            int r0 = java.lang.Math.max(r4, r6)
            r9.onProgress(r12, r0)
            goto L27f
        L25a:
            r27 = r1
            r26 = r3
            r1 = r12
            r8 = r13
            r3 = r14
            r28 = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid CurseForge file entry at index "
            r0.<init>(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.add(r0)
            int r12 = r1 + 1
            r5 = 1
            int r0 = java.lang.Math.max(r5, r6)
            r9.onProgress(r12, r0)
        L27f:
            int r12 = r1 + 1
            r14 = r3
            r13 = r8
            r4 = r24
            r11 = r25
            r3 = r26
            r1 = r27
            r15 = r28
            r8 = r30
            goto L94
        L291:
            r27 = r1
            r25 = r11
            r8 = r13
            r3 = r14
            r28 = r15
            r5 = 1
            if (r6 <= 0) goto L2aa
            if (r23 == 0) goto L29f
            goto L2aa
        L29f:
            writeInstallWarnings(r2, r8)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "CurseForge did not download any mod files. Check the API key, file availability, or CDN access."
            r0.<init>(r1)
            throw r0
        L2aa:
            java.lang.String r0 = "Copying CurseForge overrides..."
            r9.onStatus(r0)
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r4 = r30
            r1.<init>(r4)
            java.lang.String r0 = "overrides/"
            copyZipPrefixToDirectory(r1, r0, r2)     // Catch: java.lang.Throwable -> L341
            r1.close()
            java.lang.String r4 = "curseforge"
            r1 = r28
            java.lang.String r0 = r10.optString(r1, r3)
            r11 = r3
            r3 = r2
            r12 = r5
            r5 = r0
            r6 = r21
            r13 = r7
            r7 = r22
            r14 = r8
            r8 = r13
            writeInstalledContentMetadata(r3, r4, r5, r6, r7, r8)
            registerInstalledContentWithModManagerManifest(r2, r13)
            java.lang.String r4 = r10.optString(r1, r11)
            r8 = 0
            java.lang.String r3 = "curseforge"
            r1 = r2
            r5 = r21
            r6 = r22
            r7 = r10
            writeInstalledPackManifest(r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r14.isEmpty()
            java.lang.String r2 = "Installed modpack: "
            if (r0 != 0) goto L32e
            writeInstallWarnings(r1, r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r14.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " unavailable file"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r14.size()
            if (r1 != r12) goto L318
            r11 = r25
            goto L31a
        L318:
            java.lang.String r11 = "s"
        L31a:
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r1 = " skipped)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r27
            r9.onComplete(r0, r1)
            goto L340
        L32e:
            r1 = r27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r0 = r0.toString()
            r9.onComplete(r0, r1)
        L340:
            return
        L341:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch: java.lang.Throwable -> L347
            goto L34c
        L347:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L34c:
            throw r2
        L34d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Missing CurseForge API key."
            r0.<init>(r1)
            throw r0
        L355:
            r0 = move-exception
            r1 = r0
            deleteTempFile(r12)
            throw r1
        L35b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "CurseForge pack is missing the Minecraft version."
            r0.<init>(r1)
            throw r0
        L363:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "manifest.json is missing minecraft metadata."
            r0.<init>(r1)
            throw r0
        L36b:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch: java.lang.Throwable -> L371
            goto L376
        L371:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L376:
            throw r2
    }

    public static void installFromLocalFile(android.content.Context r1, java.io.File r2, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r3) throws java.lang.Exception {
            r0 = 0
            installFromLocalFile(r1, r2, r0, r3)
            return
    }

    private static void installFromLocalFile(android.content.Context r2, java.io.File r3, java.lang.String r4, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r5) throws java.lang.Exception {
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L4b
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r3)
            java.lang.String r1 = "modrinth.index.json"
            java.util.zip.ZipEntry r1 = r0.getEntry(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L1a
            installMrpack(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L41
            r0.close()
            return
        L1a:
            java.lang.String r1 = "manifest.json"
            java.util.zip.ZipEntry r1 = r0.getEntry(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L29
            installCurseForgePack(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L41
            r0.close()
            return
        L29:
            java.lang.String r4 = findMultiMcRootPrefix(r0)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L36
            installMultiMcPack(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L41
            r0.close()
            return
        L36:
            r0.close()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unsupported modpack. Select a Modrinth .mrpack, CurseForge exported .zip, or MultiMC/Prism exported .zip."
            r2.<init>(r3)
            throw r2
        L41:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r3 = move-exception
            r2.addSuppressed(r3)
        L4a:
            throw r2
        L4b:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Modpack file not found: "
            r4.<init>(r5)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static void installFromProject(android.content.Context r7, ca.dnamobile.javalauncher.modmanager.ModManagerSource r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r15) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "Finding latest compatible modpack version..."
            r15.onStatus(r0)     // Catch: java.lang.Throwable -> L26
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE     // Catch: java.lang.Throwable -> L26
            if (r8 != r0) goto L17
            r0 = r7
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            java.io.File r8 = downloadCurseForgeModpack(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L26
            goto L22
        L17:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            java.io.File r8 = downloadModrinthModpack(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L26
        L22:
            installFromLocalFile(r7, r8, r12, r15)     // Catch: java.lang.Throwable -> L26
            goto L3e
        L26:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to install modpack project "
            r8.<init>(r10)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r9, r8, r7)
            r15.onError(r7)
        L3e:
            return
    }

    public static void installFromProjectVersion(android.content.Context r6, ca.dnamobile.javalauncher.modmanager.ModManagerSource r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice r12, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r13) {
            java.lang.String r0 = "Preparing "
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r12.getDisplayTitle()     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "..."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36
            r13.onStatus(r0)     // Catch: java.lang.Throwable -> L36
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE     // Catch: java.lang.Throwable -> L36
            if (r7 != r0) goto L28
            java.io.File r7 = downloadCurseForgeModpackVersion(r6, r8, r10, r12, r13)     // Catch: java.lang.Throwable -> L36
            goto L32
        L28:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            java.io.File r7 = downloadModrinthModpackVersion(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L36
        L32:
            installFromLocalFile(r6, r7, r11, r13)     // Catch: java.lang.Throwable -> L36
            goto L4e
        L36:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Unable to install selected modpack version for "
            r7.<init>(r9)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r8, r7, r6)
            r13.onError(r6)
        L4e:
            return
    }

    private static void installMrpack(android.content.Context r23, java.io.File r24, java.lang.String r25, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r26) throws java.lang.Exception {
            r0 = r23
            r8 = r24
            r9 = r26
            java.lang.String r1 = "Reading Modrinth modpack..."
            r9.onStatus(r1)
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r1.<init>(r8)
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21e
            java.lang.String r2 = "modrinth.index.json"
            java.lang.String r2 = readZipEntryText(r1, r2)     // Catch: java.lang.Throwable -> L21e
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L21e
            r1.close()
            java.lang.String r1 = "dependencies"
            org.json.JSONObject r1 = r10.optJSONObject(r1)
            if (r1 == 0) goto L216
            java.lang.String r2 = "minecraft"
            java.lang.String r11 = ""
            java.lang.String r2 = r1.optString(r2, r11)
            java.lang.String r15 = r2.trim()
            boolean r2 = isBlank(r15)
            if (r2 != 0) goto L20e
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r14 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec.fromModrinthDependencies(r1)
            java.lang.String r1 = "Modrinth Modpack"
            java.lang.String r13 = "name"
            java.lang.String r1 = r10.optString(r13, r1)
            java.lang.String r12 = uniqueInstanceName(r0, r1)
            java.io.File r16 = extractPackIconToTempFile(r0, r8, r11)
            r1 = r23
            r2 = r12
            r3 = r15
            r4 = r14
            r5 = r25
            r6 = r16
            r7 = r26
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = createBaseInstance(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L208
            deleteTempFile(r16)
            java.io.File r1 = r0.getGameDirectory()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.lang.String r3 = "Installing Modrinth files..."
            r9.onStatus(r3)
            java.lang.String r3 = "files"
            org.json.JSONArray r3 = r10.optJSONArray(r3)
            if (r3 != 0) goto L76
            r5 = 0
            goto L7a
        L76:
            int r5 = r3.length()
        L7a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L80:
            if (r3 == 0) goto L141
            int r4 = r3.length()
            if (r7 >= r4) goto L141
            org.json.JSONObject r4 = r3.optJSONObject(r7)
            if (r4 != 0) goto L99
            r22 = r0
            r25 = r3
            r19 = r11
            r17 = r14
            r18 = r15
            goto L109
        L99:
            r25 = r3
            java.lang.String r3 = "path"
            java.lang.String r3 = r4.optString(r3, r11)
            boolean r16 = isSafeRelativePath(r3)
            if (r16 == 0) goto L12c
            r17 = r14
            java.io.File r14 = new java.io.File
            r18 = r15
            r15 = 47
            r22 = r0
            char r0 = java.io.File.separatorChar
            java.lang.String r0 = r3.replace(r15, r0)
            r14.<init>(r1, r0)
            ensureParent(r14)
            java.lang.String r0 = "downloads"
            org.json.JSONArray r0 = r4.optJSONArray(r0)
            if (r0 == 0) goto L117
            int r15 = r0.length()
            if (r15 == 0) goto L117
            r15 = 0
            java.lang.String r0 = r0.optString(r15, r11)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r19 = r11
            java.lang.String r11 = "Downloading "
            r15.<init>(r11)
            java.lang.StringBuilder r11 = r15.append(r3)
            java.lang.String r15 = "..."
            java.lang.StringBuilder r11 = r11.append(r15)
            java.lang.String r11 = r11.toString()
            r9.onStatus(r11)
            r11 = 0
            downloadFile(r0, r14, r11)
            java.lang.String r11 = "hashes"
            org.json.JSONObject r11 = r4.optJSONObject(r11)
            verifyHashesIfPresent(r14, r11)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$PendingModrinthInstalledFile r11 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$PendingModrinthInstalledFile
            r11.<init>(r14, r3, r4, r0)
            r6.add(r11)
            int r0 = r7 + 1
            r3 = 1
            int r3 = java.lang.Math.max(r3, r5)
            r9.onProgress(r0, r3)
        L109:
            int r7 = r7 + 1
            r3 = r25
            r14 = r17
            r15 = r18
            r11 = r19
            r0 = r22
            goto L80
        L117:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing download URL for "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L12c:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Blocked unsafe modpack path: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L141:
            r22 = r0
            r17 = r14
            r18 = r15
            java.lang.String r0 = "Resolving Modrinth update metadata..."
            r9.onStatus(r0)
            java.util.Map r0 = resolveModrinthVersionMetadataBySha1(r6)
            java.util.Iterator r3 = r6.iterator()
        L154:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1a0
            java.lang.Object r4 = r3.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$PendingModrinthInstalledFile r4 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.PendingModrinthInstalledFile) r4
            org.json.JSONObject r5 = r4.fileMetadata
            java.io.File r6 = r4.target
            java.lang.String r5 = resolveModrinthSha1(r5, r6)
            java.io.File r6 = r4.target
            java.lang.String r14 = r4.relativePath
            org.json.JSONObject r15 = r4.fileMetadata
            java.lang.String r4 = r4.downloadUrl
            java.lang.String r7 = r10.optString(r13, r12)
            java.lang.Object r11 = r0.get(r5)
            r21 = r11
            org.json.JSONObject r21 = (org.json.JSONObject) r21
            r11 = r12
            r12 = r1
            r23 = r0
            r0 = r13
            r13 = r6
            r6 = r17
            r25 = r18
            r16 = r4
            r17 = r7
            r19 = r6
            r20 = r5
            org.json.JSONObject r4 = buildModrinthInstalledContentEntry(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r4 == 0) goto L197
            r2.put(r4)
        L197:
            r18 = r25
            r13 = r0
            r17 = r6
            r12 = r11
            r0 = r23
            goto L154
        L1a0:
            r11 = r12
            r0 = r13
            r6 = r17
            r25 = r18
            java.lang.String r3 = "Copying Modrinth overrides..."
            r9.onStatus(r3)
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            r3.<init>(r8)
            java.lang.String r4 = "overrides/"
            copyZipPrefixToDirectory(r3, r4, r1)     // Catch: java.lang.Throwable -> L1fc
            r3.close()
            java.lang.String r3 = "Resolving override metadata..."
            r9.onStatus(r3)
            java.lang.String r3 = r10.optString(r0, r11)
            r15 = r25
            appendMissingModrinthMetadataForLocalContent(r1, r2, r3, r15, r6)
            java.lang.String r4 = "modrinth"
            java.lang.String r5 = r10.optString(r0, r11)
            r3 = r1
            r16 = r6
            r6 = r15
            r7 = r16
            r8 = r2
            writeInstalledContentMetadata(r3, r4, r5, r6, r7, r8)
            registerInstalledContentWithModManagerManifest(r1, r2)
            java.lang.String r14 = r10.optString(r0, r11)
            r17 = 0
            r18 = 0
            java.lang.String r13 = "modrinth"
            r12 = r1
            writeInstalledPackManifest(r12, r13, r14, r15, r16, r17, r18)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Installed modpack: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r0 = r0.toString()
            r1 = r22
            r9.onComplete(r0, r1)
            return
        L1fc:
            r0 = move-exception
            r1 = r0
            r3.close()     // Catch: java.lang.Throwable -> L202
            goto L207
        L202:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L207:
            throw r1
        L208:
            r0 = move-exception
            r1 = r0
            deleteTempFile(r16)
            throw r1
        L20e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Modpack is missing the Minecraft dependency."
            r0.<init>(r1)
            throw r0
        L216:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "modrinth.index.json is missing dependencies."
            r0.<init>(r1)
            throw r0
        L21e:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch: java.lang.Throwable -> L224
            goto L229
        L224:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)
        L229:
            throw r2
    }

    private static void installMultiMcPack(android.content.Context r17, java.io.File r18, java.lang.String r19, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r20) throws java.lang.Exception {
            r0 = r18
            r1 = r19
            r9 = r20
            java.lang.String r2 = "Reading MultiMC/Prism modpack..."
            r9.onStatus(r2)
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
            r2.<init>(r0)
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L137
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L137
            r3.<init>()     // Catch: java.lang.Throwable -> L137
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L137
            java.lang.String r4 = "mmc-pack.json"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L137
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L137
            java.lang.String r3 = readZipEntryText(r2, r3)     // Catch: java.lang.Throwable -> L137
            r15.<init>(r3)     // Catch: java.lang.Throwable -> L137
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L137
            r3.<init>()     // Catch: java.lang.Throwable -> L137
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L137
            java.lang.String r4 = "instance.cfg"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L137
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L137
            java.util.zip.ZipEntry r3 = r2.getEntry(r3)     // Catch: java.lang.Throwable -> L137
            if (r3 == 0) goto L67
            boolean r4 = r3.isDirectory()     // Catch: java.lang.Throwable -> L137
            if (r4 != 0) goto L67
            java.io.InputStream r3 = r2.getInputStream(r3)     // Catch: java.lang.Throwable -> L137
            java.lang.String r4 = readToString(r3)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.lang.Throwable -> L137
            goto L69
        L59:
            r0 = move-exception
            r1 = r0
            if (r3 == 0) goto L66
            r3.close()     // Catch: java.lang.Throwable -> L61
            goto L66
        L61:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch: java.lang.Throwable -> L137
        L66:
            throw r1     // Catch: java.lang.Throwable -> L137
        L67:
            java.lang.String r4 = ""
        L69:
            r2.close()
            java.lang.String r13 = findMultiMcMinecraftVersion(r15)
            boolean r2 = isBlank(r13)
            if (r2 != 0) goto L12f
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$LoaderSpec r14 = ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec.fromMultiMcPackJson(r15)
            java.lang.String r2 = "name"
            java.lang.String r2 = readMultiMcCfgValue(r4, r2)
            boolean r3 = isBlank(r2)
            if (r3 == 0) goto L88
            java.lang.String r2 = "MultiMC Modpack"
        L88:
            r3 = r17
            java.lang.String r12 = uniqueInstanceName(r3, r2)
            java.io.File r10 = extractPackIconToTempFile(r17, r18, r19)
            r6 = 0
            r2 = r17
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r10
            r8 = r20
            ca.dnamobile.javalauncher.instance.LauncherInstance r2 = createBaseInstance(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L129
            deleteTempFile(r10)
            java.io.File r10 = r2.getGameDirectory()
            java.lang.String r3 = "Copying MultiMC/Prism .minecraft files..."
            r9.onStatus(r3)
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            r3.<init>(r0)
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r4.<init>()     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r5 = ".minecraft/"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11d
            r5 = 0
            r0[r5] = r4     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11d
            r4.<init>()     // Catch: java.lang.Throwable -> L11d
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r5 = "minecraft/"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L11d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11d
            r5 = 1
            r0[r5] = r4     // Catch: java.lang.Throwable -> L11d
            java.lang.String r0 = findFirstExistingPrefix(r3, r0)     // Catch: java.lang.Throwable -> L11d
            if (r0 == 0) goto L115
            copyZipPrefixToDirectory(r3, r0, r10)     // Catch: java.lang.Throwable -> L11d
            r3.close()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r3 = "rootPrefix"
            r0.put(r3, r1)
            java.lang.String r1 = "mmcPack"
            r0.put(r1, r15)
            java.lang.String r11 = "multimc"
            r1 = r12
            r16 = r0
            writeInstalledPackManifest(r10, r11, r12, r13, r14, r15, r16)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Installed modpack: "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.onComplete(r0, r2)
            return
        L115:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L11d
            java.lang.String r1 = "MultiMC/Prism pack is missing the .minecraft folder."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11d
            throw r0     // Catch: java.lang.Throwable -> L11d
        L11d:
            r0 = move-exception
            r1 = r0
            r3.close()     // Catch: java.lang.Throwable -> L123
            goto L128
        L123:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L128:
            throw r1
        L129:
            r0 = move-exception
            r1 = r0
            deleteTempFile(r10)
            throw r1
        L12f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "mmc-pack.json is missing the Minecraft component."
            r0.<init>(r1)
            throw r0
        L137:
            r0 = move-exception
            r1 = r0
            r2.close()     // Catch: java.lang.Throwable -> L13d
            goto L142
        L13d:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L142:
            throw r1
    }

    private static boolean isBlank(java.lang.String r2) {
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.trim()
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L30
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L30
            java.lang.String r1 = "<null>"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L30
            java.lang.String r1 = "\"null\""
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L30
            java.lang.String r1 = "'null'"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            return r0
    }

    private static boolean isHttpUrl(java.lang.String r1) {
            java.lang.String r1 = cleanDownloadUrl(r1)
            java.lang.String r0 = "http://"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "https://"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            return r1
    }

    private static boolean isSafeRelativePath(java.lang.String r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r5 = normalizeZipPath(r5)
            java.lang.String r5 = r5.trim()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L13
            return r0
        L13:
            java.lang.String r1 = "/"
            boolean r2 = r5.startsWith(r1)
            if (r2 != 0) goto L4e
            java.lang.String r2 = "\\"
            boolean r2 = r5.startsWith(r2)
            if (r2 == 0) goto L24
            goto L4e
        L24:
            java.lang.String r2 = "^[A-Za-z]:[/\\\\].*"
            boolean r2 = r5.matches(r2)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            r2 = r0
        L33:
            if (r2 >= r1) goto L4c
            r3 = r5[r2]
            java.lang.String r4 = ".."
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L4b
            java.lang.String r4 = "."
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L48
            goto L4b
        L48:
            int r2 = r2 + 1
            goto L33
        L4b:
            return r0
        L4c:
            r5 = 1
            return r5
        L4e:
            return r0
    }

    private static boolean isVanillaInstalled(java.lang.String r2) {
            java.util.List r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.findInstalledVersions()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.data.model.MinecraftVersion r1 = (ca.dnamobile.javalauncher.data.model.MinecraftVersion) r1
            java.lang.String r1 = r1.getId()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L8
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    private static boolean jsonArrayContains(org.json.JSONArray r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = r0
        L5:
            int r2 = r3.length()
            if (r1 >= r2) goto L1c
            java.lang.String r2 = ""
            java.lang.String r2 = r3.optString(r1, r2)
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L19
            r3 = 1
            return r3
        L19:
            int r1 = r1 + 1
            goto L5
        L1c:
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
            if (r1 >= r2) goto L25
            java.lang.String r2 = ""
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r2 = r2.trim()
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L22
            r0.add(r2)
        L22:
            int r1 = r1 + 1
            goto L9
        L25:
            return r0
    }

    static /* synthetic */ void lambda$createBaseInstance$0(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r0, int r1, java.lang.String r2) {
            r0.onStatus(r2)
            r2 = 100
            r0.onProgress(r1, r2)
            return
    }

    static /* synthetic */ void lambda$createBaseInstance$1(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r0, int r1, java.lang.String r2) {
            r0.onStatus(r2)
            return
    }

    static /* synthetic */ void lambda$createBaseInstance$2(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r0, int r1, java.lang.String r2) {
            r0.onStatus(r2)
            return
    }

    static /* synthetic */ void lambda$createBaseInstance$3(ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.Listener r0, int r1, java.lang.String r2) {
            r0.onStatus(r2)
            return
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> listCurseForgeModpackVersions(java.lang.String r23) throws java.lang.Exception {
            java.lang.String r0 = "CurseForge project id"
            r1 = r23
            int r0 = parsePositiveInt(r1, r0)
            java.lang.String r1 = ca.dnamobile.javalauncher.modmanager.CurseForgeApiKeyProvider.resolve()
            boolean r2 = isBlank(r1)
            if (r2 != 0) goto Lfa
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = r3
        L1c:
            if (r5 >= r4) goto Lf9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "https://api.curseforge.com/v1/mods/"
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = "/files?pageSize=50&index="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "&gameId=432"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r6 = httpGetString(r6, r1)
            r7.<init>(r6)
            java.lang.String r6 = "pagination"
            org.json.JSONObject r6 = r7.optJSONObject(r6)
            if (r6 == 0) goto L54
            java.lang.String r8 = "totalCount"
            int r4 = r6.optInt(r8, r4)
        L54:
            java.lang.String r8 = "data"
            org.json.JSONArray r7 = r7.optJSONArray(r8)
            if (r7 == 0) goto Lf9
            int r8 = r7.length()
            if (r8 != 0) goto L64
            goto Lf9
        L64:
            r8 = r3
        L65:
            int r9 = r7.length()
            if (r8 >= r9) goto Lea
            org.json.JSONObject r9 = r7.optJSONObject(r8)
            if (r9 != 0) goto L73
            goto Le6
        L73:
            java.lang.String r10 = "fileName"
            java.lang.String r10 = optJsonString(r9, r10)
            java.lang.String r11 = ""
            java.lang.String r10 = sanitizeFileName(r10, r11)
            boolean r11 = isBlank(r10)
            if (r11 != 0) goto Le6
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r11 = r10.toLowerCase(r11)
            java.lang.String r12 = ".zip"
            boolean r11 = r11.endsWith(r12)
            if (r11 != 0) goto L94
            goto Le6
        L94:
            java.lang.String r11 = "id"
            int r15 = r9.optInt(r11, r3)
            if (r15 > 0) goto L9d
            goto Le6
        L9d:
            java.lang.String r11 = "gameVersions"
            org.json.JSONArray r11 = r9.optJSONArray(r11)
            java.util.ArrayList r20 = jsonArrayToStringList(r11)
            java.util.ArrayList r21 = extractCurseForgeLoaders(r20)
            java.lang.String r11 = "displayName"
            java.lang.String r11 = optJsonString(r9, r11)
            java.lang.String r12 = stripArchiveExtension(r10)
            java.lang.String r17 = firstNonBlank(r11, r12)
            java.lang.String r11 = "fileDate"
            java.lang.String r11 = optJsonString(r9, r11)
            java.lang.String r12 = "dateCreated"
            java.lang.String r12 = optJsonString(r9, r12)
            java.lang.String r22 = firstNonBlank(r11, r12)
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r11 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r13 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            java.lang.String r14 = java.lang.String.valueOf(r15)
            java.lang.String r12 = "downloadUrl"
            java.lang.String r9 = optJsonString(r9, r12)
            java.lang.String r19 = cleanDownloadUrl(r9)
            r12 = r11
            r16 = r17
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2.add(r11)
        Le6:
            int r8 = r8 + 1
            goto L65
        Lea:
            int r8 = r7.length()
            int r5 = r5 + r8
            if (r6 == 0) goto Lf9
            int r6 = r7.length()
            r7 = 50
            if (r6 >= r7) goto L1c
        Lf9:
            return r2
        Lfa:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Missing CurseForge API key."
            r0.<init>(r1)
            throw r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> listModrinthModpackVersions(java.lang.String r17, java.lang.String r18) throws java.lang.Exception {
            boolean r0 = isBlank(r17)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r17.trim()
            goto Lf
        Lb:
            java.lang.String r0 = safe(r18)
        Lf:
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto Lc9
            org.json.JSONArray r1 = new org.json.JSONArray
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "https://api.modrinth.com/v2/project/"
            r2.<init>(r3)
            java.lang.String r0 = urlEncode(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "/version"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.String r0 = httpGetString(r0, r2)
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
        L3e:
            int r3 = r1.length()
            if (r2 >= r3) goto Lc8
            org.json.JSONObject r3 = r1.optJSONObject(r2)
            if (r3 != 0) goto L4c
            goto Lc4
        L4c:
            org.json.JSONObject r4 = findModrinthMrpackFile(r3)
            if (r4 != 0) goto L53
            goto Lc4
        L53:
            java.lang.String r5 = "game_versions"
            org.json.JSONArray r5 = r3.optJSONArray(r5)
            java.util.ArrayList r14 = jsonArrayToStringList(r5)
            java.lang.String r5 = "loaders"
            org.json.JSONArray r5 = r3.optJSONArray(r5)
            java.util.ArrayList r15 = jsonArrayToStringList(r5)
            java.lang.String r5 = "id"
            java.lang.String r6 = ""
            java.lang.String r5 = r3.optString(r5, r6)
            java.lang.String r8 = r5.trim()
            java.lang.String r5 = "name"
            java.lang.String r5 = r3.optString(r5, r6)
            java.lang.String r7 = "version_number"
            java.lang.String r9 = r3.optString(r7, r6)
            java.lang.String r10 = firstNonBlank(r5, r9)
            java.lang.String r5 = r3.optString(r7, r6)
            java.lang.String r11 = r5.trim()
            java.lang.String r5 = "date_published"
            java.lang.String r3 = r3.optString(r5, r6)
            java.lang.String r16 = r3.trim()
            java.lang.String r3 = "filename"
            java.lang.String r3 = r4.optString(r3, r6)
            java.lang.String r5 = "modpack.mrpack"
            java.lang.String r12 = sanitizeFileName(r3, r5)
            java.lang.String r3 = "url"
            java.lang.String r3 = r4.optString(r3, r6)
            java.lang.String r13 = cleanDownloadUrl(r3)
            boolean r3 = isBlank(r8)
            if (r3 != 0) goto Lc4
            boolean r3 = isHttpUrl(r13)
            if (r3 != 0) goto Lb8
            goto Lc4
        Lb8:
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice r3 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ModpackVersionChoice
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r7 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            r9 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.add(r3)
        Lc4:
            int r2 = r2 + 1
            goto L3e
        Lc8:
            return r0
        Lc9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Missing Modrinth project id."
            r0.<init>(r1)
            throw r0
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ModpackVersionChoice> listProjectVersions(android.content.Context r0, ca.dnamobile.javalauncher.modmanager.ModManagerSource r1, java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            if (r1 != r0) goto Lc
            java.util.ArrayList r0 = listCurseForgeModpackVersions(r2)
            return r0
        Lc:
            java.util.ArrayList r0 = listModrinthModpackVersions(r2, r3)
            return r0
    }

    private static java.lang.String normalizeForgeLoaderVersion(java.lang.String r3, java.lang.String r4) {
            java.lang.String r3 = r3.trim()
            r0 = 58
            int r0 = r3.lastIndexOf(r0)
            r1 = 1
            if (r0 < 0) goto L1c
            int r0 = r0 + r1
            int r2 = r3.length()
            if (r0 >= r2) goto L1c
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r3 = r3.trim()
        L1c:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r2 = "forge-"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L36
            int r0 = r2.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r3 = r3.trim()
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r4.trim()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r4 = isBlank(r4)
            if (r4 != 0) goto L65
            boolean r4 = r3.startsWith(r0)
            if (r4 == 0) goto L65
            int r4 = r0.length()
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = r3.trim()
        L65:
            java.lang.String r4 = "^1\\.\\d+(?:\\.\\d+)?-(.+)$"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L7d
            java.lang.String r3 = r4.group(r1)
            java.lang.String r3 = r3.trim()
        L7d:
            return r3
    }

    private static java.lang.String normalizeLoader(java.lang.String r2) {
            java.lang.String r2 = safe(r2)
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "vanilla"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "minecraft"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            goto L34
        L1f:
            java.lang.String r0 = "fabric-loader"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r2 = "fabric"
            return r2
        L2a:
            java.lang.String r0 = "neoforge"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L33
            return r0
        L33:
            return r2
        L34:
            java.lang.String r2 = ""
            return r2
    }

    private static java.lang.String normalizeLoaderVersionForInstaller(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r2 = safe(r2)
            java.lang.String r2 = r2.trim()
            boolean r0 = isBlank(r2)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.lang.String r0 = "Forge"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            java.lang.String r1 = normalizeForgeLoaderVersion(r2, r3)
            return r1
        L1c:
            java.lang.String r0 = "NeoForge"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L71
            java.lang.String r1 = stripNeoForgePrefix(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r3.trim()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = "-"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            boolean r3 = isBlank(r3)
            if (r3 != 0) goto L57
            boolean r3 = r1.startsWith(r2)
            if (r3 == 0) goto L57
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r1 = r1.trim()
        L57:
            r2 = r1
            java.lang.String r1 = "^1\\.\\d+(?:\\.\\d+)?-(.+)$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r3 = r1.matches()
            if (r3 == 0) goto L71
            r2 = 1
            java.lang.String r1 = r1.group(r2)
            java.lang.String r2 = r1.trim()
        L71:
            return r2
    }

    private static java.lang.String normalizeZipPath(java.lang.String r2) {
            r0 = 92
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private static java.net.HttpURLConnection openConnection(java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 30000(0x7530, float:4.2039E-41)
            r2.setConnectTimeout(r0)
            r0 = 60000(0xea60, float:8.4078E-41)
            r2.setReadTimeout(r0)
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "JavaLauncher/Modpacks"
            r2.setRequestProperty(r0, r1)
            boolean r0 = isBlank(r3)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "x-api-key"
            java.lang.String r3 = r3.trim()
            r2.setRequestProperty(r0, r3)
        L2c:
            return r2
    }

    private static java.lang.String optJsonString(org.json.JSONObject r2, java.lang.String r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L24
            boolean r1 = r2.has(r3)
            if (r1 == 0) goto L24
            boolean r1 = r2.isNull(r3)
            if (r1 == 0) goto L11
            goto L24
        L11:
            java.lang.Object r2 = r2.opt(r3)
            if (r2 == 0) goto L24
            java.lang.Object r3 = org.json.JSONObject.NULL
            if (r2 != r3) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r2.trim()
        L24:
            return r0
    }

    private static java.lang.String parseCurseForgeDownloadUrlResponse(java.lang.String r3) {
            java.lang.String r3 = cleanDownloadUrl(r3)
            boolean r0 = isBlank(r3)
            if (r0 == 0) goto Ld
            java.lang.String r3 = ""
            return r3
        Ld:
            java.lang.String r0 = "{"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L44
            java.lang.String r0 = "}"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L44
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L44
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "data"
            java.lang.String r1 = optJsonString(r0, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = cleanDownloadUrl(r1)     // Catch: java.lang.Throwable -> L44
            boolean r2 = isHttpUrl(r1)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L33
            return r1
        L33:
            java.lang.String r1 = "downloadUrl"
            java.lang.String r0 = optJsonString(r0, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = cleanDownloadUrl(r0)     // Catch: java.lang.Throwable -> L44
            boolean r1 = isHttpUrl(r0)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L44
            return r0
        L44:
            return r3
    }

    private static ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.ParsedModrinthDownloadIds parseModrinthDownloadIds(java.lang.String r5) {
            java.lang.String r5 = cleanDownloadUrl(r5)
            java.lang.String r0 = "/data/"
            int r1 = r5.indexOf(r0)
            java.lang.String r2 = ""
            if (r1 >= 0) goto L14
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ParsedModrinthDownloadIds r5 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ParsedModrinthDownloadIds
            r5.<init>(r2, r2)
            return r5
        L14:
            int r0 = r0.length()
            int r1 = r1 + r0
            java.lang.String r5 = r5.substring(r1)
            java.lang.String r0 = "/"
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            if (r0 <= 0) goto L2e
            r0 = 0
            r0 = r5[r0]
            java.lang.String r0 = r0.trim()
            goto L2f
        L2e:
            r0 = r2
        L2f:
            int r1 = r5.length
            r3 = 2
            if (r1 <= r3) goto L44
            r1 = 1
            r1 = r5[r1]
            java.lang.String r4 = "versions"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L44
            r5 = r5[r3]
            java.lang.String r2 = r5.trim()
        L44:
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ParsedModrinthDownloadIds r5 = new ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$ParsedModrinthDownloadIds
            r5.<init>(r0, r2)
            return r5
    }

    private static int parsePositiveInt(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = r3.trim()     // Catch: java.lang.Throwable -> Lb
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lb
            if (r0 <= 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.String readMultiMcCfgValue(java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = "="
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "\r"
            java.lang.String r5 = r5.replace(r1, r0)
            java.lang.String r1 = "\n"
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            r2 = 0
        L26:
            if (r2 >= r1) goto L40
            r3 = r5[r2]
            boolean r4 = r3.startsWith(r6)
            if (r4 == 0) goto L3d
            int r5 = r6.length()
            java.lang.String r5 = r3.substring(r5)
            java.lang.String r5 = r5.trim()
            return r5
        L3d:
            int r2 = r2 + 1
            goto L26
        L40:
            return r0
    }

    private static java.lang.String readToString(java.io.InputStream r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            copyStream(r1, r0)
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = r0.toString(r1)
            return r1
    }

    private static java.lang.String readZipEntryText(java.util.zip.ZipFile r2, java.lang.String r3) throws java.lang.Exception {
            java.util.zip.ZipEntry r0 = r2.getEntry(r3)
            if (r0 == 0) goto L26
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L26
            java.io.InputStream r2 = r2.getInputStream(r0)
            java.lang.String r3 = readToString(r2)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L19
            r2.close()
        L19:
            return r3
        L1a:
            r3 = move-exception
            if (r2 == 0) goto L25
            r2.close()     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r2 = move-exception
            r3.addSuppressed(r2)
        L25:
            throw r3
        L26:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static void registerInstalledContentWithModManagerManifest(java.io.File r4, org.json.JSONArray r5) {
            r0 = 0
        L1:
            int r1 = r5.length()
            if (r0 >= r1) goto L23
            org.json.JSONObject r1 = r5.optJSONObject(r0)
            if (r1 != 0) goto Le
            goto L20
        Le:
            java.lang.String r2 = "contentType"
            java.lang.String r3 = ""
            java.lang.String r2 = r1.optString(r2, r3)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = contentTypeFromIntentValue(r2)
            if (r2 != 0) goto L1d
            goto L20
        L1d:
            tryRegisterInstalledEntry(r4, r2, r1)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    private static ca.dnamobile.javalauncher.modmanager.ModManagerContentType resolveContentTypeForRelativePath(java.lang.String r3) {
            java.lang.String r3 = normalizeZipPath(r3)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "mods/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L25
            java.lang.String r0 = ".jar"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = ".jar.disabled"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L25
        L22:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r3
        L25:
            java.lang.String r0 = "resourcepacks/"
            boolean r0 = r3.startsWith(r0)
            java.lang.String r1 = ".zip.disabled"
            java.lang.String r2 = ".zip"
            if (r0 == 0) goto L40
            boolean r0 = r3.endsWith(r2)
            if (r0 != 0) goto L3d
            boolean r0 = r3.endsWith(r1)
            if (r0 == 0) goto L40
        L3d:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r3
        L40:
            java.lang.String r0 = "shaderpacks/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L57
            boolean r0 = r3.endsWith(r2)
            if (r0 != 0) goto L54
            boolean r3 = r3.endsWith(r1)
            if (r3 == 0) goto L57
        L54:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            return r3
        L57:
            r3 = 0
            return r3
    }

    private static java.lang.String resolveCurseForgeDownloadUrl(java.lang.String r3, int r4, int r5, java.lang.String r6, org.json.JSONObject r7) {
            java.lang.String r0 = "https://api.curseforge.com/v1/mods/"
            java.lang.String r1 = ""
            if (r7 != 0) goto L8
            r7 = r1
            goto L12
        L8:
            java.lang.String r2 = "downloadUrl"
            java.lang.String r7 = optJsonString(r7, r2)
            java.lang.String r7 = cleanDownloadUrl(r7)
        L12:
            boolean r2 = isHttpUrl(r7)
            if (r2 == 0) goto L19
            return r7
        L19:
            if (r4 <= 0) goto L76
            if (r5 <= 0) goto L76
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r7 = r7.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "/files/"
            java.lang.StringBuilder r7 = r7.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r7 = r7.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "/download-url"
            java.lang.StringBuilder r7 = r7.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = httpGetString(r7, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = parseCurseForgeDownloadUrlResponse(r3)     // Catch: java.lang.Throwable -> L49
            boolean r4 = isHttpUrl(r3)     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L76
            return r3
        L49:
            r3 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "CurseForge download-url endpoint failed for "
            r7.<init>(r0)
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.String r7 = ":"
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r7 = " - "
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
        L76:
            if (r5 <= 0) goto L83
            boolean r3 = isBlank(r6)
            if (r3 != 0) goto L83
            java.lang.String r3 = buildCurseForgeCdnUrl(r5, r6)
            return r3
        L83:
            return r1
    }

    private static java.lang.String resolveCurseForgeSha1(org.json.JSONArray r6) {
            java.lang.String r0 = ""
            if (r6 != 0) goto L5
            return r0
        L5:
            r1 = 0
            r2 = r1
        L7:
            int r3 = r6.length()
            if (r2 >= r3) goto L31
            org.json.JSONObject r3 = r6.optJSONObject(r2)
            if (r3 != 0) goto L14
            goto L2e
        L14:
            java.lang.String r4 = "value"
            java.lang.String r4 = r3.optString(r4, r0)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = "algo"
            int r3 = r3.optInt(r5, r1)
            r5 = 1
            if (r3 != r5) goto L2e
            boolean r3 = isBlank(r4)
            if (r3 != 0) goto L2e
            return r4
        L2e:
            int r2 = r2 + 1
            goto L7
        L31:
            return r0
    }

    private static java.lang.String resolveIconExtension(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = ".jpg"
            boolean r1 = r2.endsWith(r0)
            if (r1 != 0) goto L23
            java.lang.String r1 = ".jpeg"
            boolean r1 = r2.endsWith(r1)
            if (r1 == 0) goto L17
            goto L23
        L17:
            java.lang.String r0 = ".webp"
            boolean r2 = r2.endsWith(r0)
            if (r2 == 0) goto L20
            return r0
        L20:
            java.lang.String r2 = ".png"
            return r2
        L23:
            return r0
    }

    private static java.io.File resolveInstalledContentFile(java.io.File r3, org.json.JSONObject r4) {
            java.lang.String r0 = "filePath"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.optString(r0, r1)
            java.lang.String r1 = "relativePath"
            java.lang.String r4 = r4.optString(r1, r0)
            boolean r0 = isSafeRelativePath(r4)
            if (r0 != 0) goto L16
            r3 = 0
            return r3
        L16:
            java.io.File r0 = new java.io.File
            r1 = 47
            char r2 = java.io.File.separatorChar
            java.lang.String r4 = r4.replace(r1, r2)
            r0.<init>(r3, r4)
            return r0
    }

    private static java.lang.String resolveModrinthSha1(org.json.JSONObject r3, java.io.File r4) {
            java.lang.String r0 = "hashes"
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            java.lang.String r0 = ""
            if (r3 != 0) goto Lc
            r3 = r0
            goto L16
        Lc:
            java.lang.String r1 = "sha1"
            java.lang.String r3 = r3.optString(r1, r0)
            java.lang.String r3 = r3.trim()
        L16:
            boolean r1 = isBlank(r3)
            if (r1 != 0) goto L1d
            return r3
        L1d:
            java.lang.String r3 = "SHA-1"
            java.lang.String r3 = hashFile(r4, r3)     // Catch: java.lang.Throwable -> L24
            return r3
        L24:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to hash Modrinth file "
            r1.<init>(r2)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return r0
    }

    private static java.util.Map<java.lang.String, org.json.JSONObject> resolveModrinthVersionMetadataBySha1(java.util.ArrayList<ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.PendingModrinthInstalledFile> r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r5.next()
            ca.dnamobile.javalauncher.modmanager.ModpackInstallManager$PendingModrinthInstalledFile r2 = (ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.PendingModrinthInstalledFile) r2
            org.json.JSONObject r3 = r2.fileMetadata
            java.io.File r2 = r2.target
            java.lang.String r2 = resolveModrinthSha1(r3, r2)
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto Le
            r1.add(r2)
            goto Le
        L2c:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L33
            return r0
        L33:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L83
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L83
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L83
        L41:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r4 == 0) goto L51
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L83
            r2.put(r4)     // Catch: java.lang.Throwable -> L83
            goto L41
        L51:
            java.lang.String r3 = "hashes"
            r5.put(r3, r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "algorithm"
            java.lang.String r3 = "sha1"
            r5.put(r2, r3)     // Catch: java.lang.Throwable -> L83
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "https://api.modrinth.com/v2/version_files"
            r4 = 0
            java.lang.String r5 = httpPostString(r3, r5, r4)     // Catch: java.lang.Throwable -> L83
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Throwable -> L83
        L6d:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L83
            org.json.JSONObject r3 = r2.optJSONObject(r1)     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L6d
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L83
            goto L6d
        L83:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve Modrinth update metadata from hashes: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r5)
        L9c:
            return r0
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    private static java.lang.String safeCanonicalPath(java.io.File r0) {
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private static java.lang.String sanitizeFileName(java.lang.String r2, java.lang.String r3) {
            boolean r0 = isBlank(r2)
            if (r0 == 0) goto L8
            r2 = r3
            goto Lc
        L8:
            java.lang.String r2 = r2.trim()
        Lc:
            java.lang.String r0 = "[\\\\/:*?\"<>|]"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L2c
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2c
            java.lang.String r0 = ".."
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            return r2
        L2c:
            return r3
    }

    private static java.lang.String sanitizeInstanceName(java.lang.String r2) {
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
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            java.lang.String r0 = ".."
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            return r2
        L3b:
            java.lang.String r2 = ""
            return r2
    }

    private static java.lang.String selectModrinthDownloadUrl(org.json.JSONObject r8, java.lang.String r9) {
            java.lang.String r0 = ""
            if (r8 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = "files"
            org.json.JSONArray r8 = r8.optJSONArray(r1)
            if (r8 == 0) goto L6f
            int r1 = r8.length()
            if (r1 != 0) goto L14
            goto L6f
        L14:
            r1 = 0
            r3 = r0
            r4 = r3
            r2 = r1
        L18:
            int r5 = r8.length()
            if (r2 >= r5) goto L6a
            org.json.JSONObject r5 = r8.optJSONObject(r2)
            if (r5 != 0) goto L25
            goto L67
        L25:
            java.lang.String r6 = "url"
            java.lang.String r6 = r5.optString(r6, r0)
            java.lang.String r6 = r6.trim()
            boolean r7 = isBlank(r6)
            if (r7 == 0) goto L36
            goto L67
        L36:
            boolean r7 = isBlank(r4)
            if (r7 == 0) goto L3d
            r4 = r6
        L3d:
            java.lang.String r7 = "primary"
            boolean r7 = r5.optBoolean(r7, r1)
            if (r7 == 0) goto L46
            r3 = r6
        L46:
            java.lang.String r7 = "hashes"
            org.json.JSONObject r5 = r5.optJSONObject(r7)
            if (r5 != 0) goto L50
            r5 = r0
            goto L5a
        L50:
            java.lang.String r7 = "sha1"
            java.lang.String r5 = r5.optString(r7, r0)
            java.lang.String r5 = r5.trim()
        L5a:
            boolean r7 = isBlank(r9)
            if (r7 != 0) goto L67
            boolean r5 = r9.equalsIgnoreCase(r5)
            if (r5 == 0) goto L67
            return r6
        L67:
            int r2 = r2 + 1
            goto L18
        L6a:
            java.lang.String r8 = firstNonBlank(r3, r4)
            return r8
        L6f:
            return r0
    }

    private static org.json.JSONObject selectModrinthVersion(org.json.JSONArray r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r5 = safe(r5)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = normalizeLoader(r6)
            r0 = 0
            r1 = 0
        Le:
            int r2 = r4.length()
            if (r1 >= r2) goto L47
            org.json.JSONObject r2 = r4.optJSONObject(r1)
            if (r2 != 0) goto L1b
            goto L43
        L1b:
            if (r0 != 0) goto L1e
            r0 = r2
        L1e:
            boolean r3 = isBlank(r5)
            if (r3 != 0) goto L31
            java.lang.String r3 = "game_versions"
            org.json.JSONArray r3 = r2.optJSONArray(r3)
            boolean r3 = jsonArrayContains(r3, r5)
            if (r3 != 0) goto L31
            goto L43
        L31:
            boolean r3 = isBlank(r6)
            if (r3 != 0) goto L46
            java.lang.String r3 = "loaders"
            org.json.JSONArray r3 = r2.optJSONArray(r3)
            boolean r3 = jsonArrayContains(r3, r6)
            if (r3 != 0) goto L46
        L43:
            int r1 = r1 + 1
            goto Le
        L46:
            return r2
        L47:
            return r0
    }

    private static java.lang.String stripArchiveExtension(java.lang.String r4) {
            java.lang.String r4 = r4.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r4.toLowerCase(r0)
            java.lang.String r1 = ".mrpack"
            boolean r2 = r0.endsWith(r1)
            r3 = 0
            if (r2 == 0) goto L21
            int r0 = r4.length()
            int r1 = r1.length()
            int r0 = r0 - r1
            java.lang.String r4 = r4.substring(r3, r0)
            return r4
        L21:
            java.lang.String r1 = ".zip"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L36
            int r0 = r4.length()
            int r1 = r1.length()
            int r0 = r0 - r1
            java.lang.String r4 = r4.substring(r3, r0)
        L36:
            return r4
    }

    private static java.lang.String stripExtension(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = ".disabled"
            boolean r0 = r0.endsWith(r1)
            r2 = 0
            if (r0 == 0) goto L1c
            int r0 = r3.length()
            int r1 = r1.length()
            int r0 = r0 - r1
            java.lang.String r3 = r3.substring(r2, r0)
        L1c:
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto L28
            java.lang.String r3 = r3.substring(r2, r0)
        L28:
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

    private static void tryRegisterInstalledEntry(java.io.File r12, ca.dnamobile.javalauncher.modmanager.ModManagerContentType r13, org.json.JSONObject r14) {
            java.lang.Class<ca.dnamobile.javalauncher.modmanager.ModManagerManifest> r0 = ca.dnamobile.javalauncher.modmanager.ModManagerManifest.class
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> Lc8
            int r1 = r0.length     // Catch: java.lang.Throwable -> Lc8
            r2 = 0
            r3 = r2
        L9:
            if (r3 >= r1) goto Le1
            r4 = r0[r3]     // Catch: java.lang.Throwable -> Lc8
            int r5 = r4.getModifiers()     // Catch: java.lang.Throwable -> Lc8
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.Throwable -> Lc8
            if (r5 != 0) goto L19
            goto Lc4
        L19:
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> Lc8
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r7 = "add"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L57
            java.lang.String r7 = "put"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L57
            java.lang.String r7 = "save"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L57
            java.lang.String r7 = "record"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L57
            java.lang.String r7 = "register"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L57
            java.lang.String r7 = "entry"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lc4
        L57:
            int r6 = r5.length     // Catch: java.lang.Throwable -> Lc8
            r7 = 0
            r8 = 2
            r9 = 3
            r10 = 1
            if (r6 != r9) goto L87
            java.lang.Class<java.io.File> r6 = java.io.File.class
            r11 = r5[r2]     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = r6.equals(r11)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto L87
            java.lang.Class<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r6 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.class
            r11 = r5[r10]     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = r6.equals(r11)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto L87
            java.lang.Class<org.json.JSONObject> r6 = org.json.JSONObject.class
            r11 = r5[r8]     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = r6.equals(r11)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto L87
            r4.setAccessible(r10)     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}     // Catch: java.lang.Throwable -> Lc8
            r4.invoke(r7, r12)     // Catch: java.lang.Throwable -> Lc8
            return
        L87:
            int r6 = r5.length     // Catch: java.lang.Throwable -> Lc8
            r11 = 4
            if (r6 != r11) goto Lc4
            java.lang.Class<java.io.File> r6 = java.io.File.class
            r11 = r5[r2]     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = r6.equals(r11)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lc4
            java.lang.Class<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r6 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.class
            r11 = r5[r10]     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = r6.equals(r11)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lc4
            java.lang.Class<java.io.File> r6 = java.io.File.class
            r8 = r5[r8]     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lc4
            java.lang.Class<org.json.JSONObject> r6 = org.json.JSONObject.class
            r5 = r5[r9]     // Catch: java.lang.Throwable -> Lc8
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> Lc8
            if (r5 == 0) goto Lc4
            r4.setAccessible(r10)     // Catch: java.lang.Throwable -> Lc8
            java.io.File r0 = resolveInstalledContentFile(r12, r14)     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto Lc3
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r0, r14}     // Catch: java.lang.Throwable -> Lc8
            r4.invoke(r7, r12)     // Catch: java.lang.Throwable -> Lc8
        Lc3:
            return
        Lc4:
            int r3 = r3 + 1
            goto L9
        Lc8:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Unable to mirror modpack file into ModManagerManifest: "
            r13.<init>(r14)
            java.lang.String r12 = r12.getMessage()
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "ModpackInstall"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r13, r12)
        Le1:
            return
    }

    private static java.lang.String uniqueInstanceName(android.content.Context r3, java.lang.String r4) {
            boolean r0 = isBlank(r4)
            java.lang.String r1 = "Imported Modpack"
            if (r0 == 0) goto La
            r4 = r1
            goto Le
        La:
            java.lang.String r4 = r4.trim()
        Le:
            java.lang.String r4 = sanitizeInstanceName(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = r4
        L1a:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.findInstances(r3)
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.next()
            ca.dnamobile.javalauncher.instance.LauncherInstance r0 = (ca.dnamobile.javalauncher.instance.LauncherInstance) r0
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r0.trim()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            r4.add(r0)
            goto L27
        L45:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = r1.toLowerCase(r3)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L52
            return r1
        L52:
            r3 = 2
        L53:
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = " "
            if (r3 >= r0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r2 = r0.toLowerCase(r2)
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L7b
            return r0
        L7b:
            int r3 = r3 + 1
            goto L53
        L7e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r0 = 0
            r1 = 8
            java.lang.String r4 = r4.substring(r0, r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static java.lang.String urlEncode(java.lang.String r2) throws java.lang.Exception {
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)
            java.lang.String r0 = "+"
            java.lang.String r1 = "%20"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private static java.lang.String urlEncodePathSegment(java.lang.String r4) {
            java.lang.String r0 = "%20"
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r4, r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "+"
            java.lang.String r1 = r1.replace(r2, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "%2F"
            java.lang.String r3 = "/"
            java.lang.String r4 = r1.replace(r2, r3)     // Catch: java.lang.Throwable -> L17
            return r4
        L17:
            java.lang.String r1 = " "
            java.lang.String r4 = r4.replace(r1, r0)
            return r4
    }

    private static void verifyHashesIfPresent(java.io.File r2, org.json.JSONObject r3) throws java.lang.Exception {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "sha1"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.optString(r0, r1)
            java.lang.String r3 = r3.trim()
            boolean r0 = isBlank(r3)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "SHA-1"
            java.lang.String r0 = hashFile(r2, r0)
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L22
            goto L3b
        L22:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SHA-1 mismatch for "
            r0.<init>(r1)
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L3b:
            return
    }

    private static void writeInstallWarnings(java.io.File r3, java.util.ArrayList<java.lang.String> r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r3 = getJavaLauncherMetadataDirectory(r3)     // Catch: java.lang.Throwable -> L61
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "modpack_install_warnings.txt"
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "Some CurseForge files could not be downloaded.\n"
            r3.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "The pack may still launch if those files were optional or unavailable on CurseForge.\n\n"
            r3.append(r1)     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L61
        L25:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L41
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = "- "
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L61
            r2 = 10
            r1.append(r2)     // Catch: java.lang.Throwable -> L61
            goto L25
        L41:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L57
            r4.write(r3)     // Catch: java.lang.Throwable -> L57
            r4.close()     // Catch: java.lang.Throwable -> L61
            goto L69
        L57:
            r3 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L61
        L60:
            throw r3     // Catch: java.lang.Throwable -> L61
        L61:
            r3 = move-exception
            java.lang.String r4 = "ModpackInstall"
            java.lang.String r0 = "Unable to write modpack install warnings"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r0, r3)
        L69:
            return
    }

    private static void writeInstalledContentMetadata(java.io.File r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec r7, org.json.JSONArray r8) {
            java.io.File r3 = getJavaLauncherMetadataDirectory(r3)     // Catch: java.lang.Throwable -> L7f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "schemaVersion"
            r2 = 1
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "type"
            java.lang.String r2 = "modpack-installed-content"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "platform"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "packName"
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "minecraftVersion"
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "loader"
            java.lang.String r5 = r7.loaderName     // Catch: java.lang.Throwable -> L7f
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "loaderVersion"
            java.lang.String r5 = r7.loaderVersion     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = safe(r5)     // Catch: java.lang.Throwable -> L7f
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "installedAt"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7f
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "fileCount"
            int r5 = r8.length()     // Catch: java.lang.Throwable -> L7f
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "updateReadyFileCount"
            int r5 = countUpdateReadyFiles(r8)     // Catch: java.lang.Throwable -> L7f
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "files"
            r0.put(r4, r8)     // Catch: java.lang.Throwable -> L7f
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7f
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.lang.String r6 = "modpack_files_manifest.json"
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L7f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7f
            r3 = 2
            java.lang.String r3 = r0.toString(r3)     // Catch: java.lang.Throwable -> L75
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch: java.lang.Throwable -> L75
            r4.write(r3)     // Catch: java.lang.Throwable -> L75
            r4.close()     // Catch: java.lang.Throwable -> L7f
            goto L87
        L75:
            r3 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L7a
            goto L7e
        L7a:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L7f
        L7e:
            throw r3     // Catch: java.lang.Throwable -> L7f
        L7f:
            r3 = move-exception
            java.lang.String r4 = "ModpackInstall"
            java.lang.String r5 = "Unable to write modpack installed-content metadata"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r5, r3)
        L87:
            return
    }

    private static void writeInstalledPackManifest(java.io.File r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, ca.dnamobile.javalauncher.modmanager.ModpackInstallManager.LoaderSpec r7, org.json.JSONObject r8, org.json.JSONObject r9) {
            java.io.File r3 = getJavaLauncherMetadataDirectory(r3)     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "type"
            java.lang.String r2 = "modpack"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "platform"
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "name"
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "minecraftVersion"
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "loader"
            java.lang.String r5 = r7.loaderName     // Catch: java.lang.Throwable -> L73
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "loaderVersion"
            java.lang.String r5 = r7.loaderVersion     // Catch: java.lang.Throwable -> L73
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "installedAt"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "contentManifest"
            java.lang.String r5 = "modpack_files_manifest.json"
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto L44
            java.lang.String r4 = "sourceManifest"
            r0.put(r4, r8)     // Catch: java.lang.Throwable -> L73
        L44:
            if (r9 == 0) goto L4b
            java.lang.String r4 = "extra"
            r0.put(r4, r9)     // Catch: java.lang.Throwable -> L73
        L4b:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L73
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "modpack_manifest.json"
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L73
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L73
            r3 = 2
            java.lang.String r3 = r0.toString(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch: java.lang.Throwable -> L69
            r4.write(r3)     // Catch: java.lang.Throwable -> L69
            r4.close()     // Catch: java.lang.Throwable -> L73
            goto L7b
        L69:
            r3 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L6e
            goto L72
        L6e:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L73
        L72:
            throw r3     // Catch: java.lang.Throwable -> L73
        L73:
            r3 = move-exception
            java.lang.String r4 = "ModpackInstall"
            java.lang.String r5 = "Unable to write modpack manifest"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r5, r3)
        L7b:
            return
    }
}
