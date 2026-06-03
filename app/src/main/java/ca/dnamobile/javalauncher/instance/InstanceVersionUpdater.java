package ca.dnamobile.javalauncher.instance;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceVersionUpdater {
    private static final java.lang.String FABRIC_META = "https://meta.fabricmc.net/v2";
    private static final java.lang.String FORGE_MAVEN = "https://maven.minecraftforge.net";
    private static final java.lang.String MOJANG_VERSION_MANIFEST = "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json";
    private static final java.lang.String NEOFORGE_MAVEN = "https://maven.neoforged.net/releases";
    private static final java.lang.String TAG = "InstanceVersionUpdater";

    public interface Listener {
        void onProgress(int r1, int r2);

        void onStatus(java.lang.String r1);
    }

    public enum LoaderKind extends java.lang.Enum<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind> {
        private static final /* synthetic */ ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind[] $VALUES = null;
        public static final ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind FABRIC = null;
        public static final ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind FORGE = null;
        public static final ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind NEOFORGE = null;
        public static final ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind VANILLA = null;
        public final java.lang.String displayName;

        private static /* synthetic */ ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind[] $values() {
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.VANILLA
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FABRIC
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r2 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FORGE
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r3 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.NEOFORGE
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind[] r0 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind[]{r0, r1, r2, r3}
                return r0
        }

        static {
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind
                r1 = 0
                java.lang.String r2 = "Vanilla"
                java.lang.String r3 = "VANILLA"
                r0.<init>(r3, r1, r2)
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.VANILLA = r0
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind
                r1 = 1
                java.lang.String r2 = "Fabric"
                java.lang.String r3 = "FABRIC"
                r0.<init>(r3, r1, r2)
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FABRIC = r0
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind
                r1 = 2
                java.lang.String r2 = "Forge"
                java.lang.String r3 = "FORGE"
                r0.<init>(r3, r1, r2)
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FORGE = r0
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind
                r1 = 3
                java.lang.String r2 = "NeoForge"
                java.lang.String r3 = "NEOFORGE"
                r0.<init>(r3, r1, r2)
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.NEOFORGE = r0
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind[] r0 = $values()
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.$VALUES = r0
                return
        }

        LoaderKind(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.displayName = r3
                return
        }

        public static ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind valueOf(java.lang.String r1) {
                java.lang.Class<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind> r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r1 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind) r1
                return r1
        }

        public static ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind[] values() {
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind[] r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.$VALUES
                java.lang.Object r0 = r0.clone()
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind[] r0 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind[]) r0
                return r0
        }
    }

    public static final class LoaderVersion {
        public final java.lang.String displayVersion;
        public final java.lang.String installVersion;
        public final ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind kind;
        public final java.lang.String minecraftVersion;
        public final boolean stable;

        LoaderVersion(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.kind = r1
                r0.displayVersion = r2
                r0.installVersion = r3
                r0.minecraftVersion = r4
                r0.stable = r5
                return
        }

        private boolean shouldShowBetaLabel() {
                r4 = this;
                boolean r0 = r4.stable
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = r4.kind
                ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r2 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FABRIC
                r3 = 1
                if (r0 != r2) goto L1f
                java.lang.String r0 = r4.displayVersion
                boolean r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.m484$$Nest$smisPreReleaseLoaderVersion(r0)
                if (r0 != 0) goto L1d
                java.lang.String r0 = r4.installVersion
                boolean r0 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.m484$$Nest$smisPreReleaseLoaderVersion(r0)
                if (r0 == 0) goto L1e
            L1d:
                r1 = r3
            L1e:
                return r1
            L1f:
                return r3
        }

        public java.lang.String getDisplayLabel() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.displayVersion
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.shouldShowBetaLabel()
                if (r1 == 0) goto L14
                java.lang.String r1 = " (beta)"
                goto L16
            L14:
                java.lang.String r1 = ""
            L16:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String getDisplayLabel(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = r2.getDisplayLabel()
                java.lang.String r1 = r2.displayVersion
                boolean r1 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.isSameLoaderVersion(r1, r3)
                if (r1 != 0) goto L14
                java.lang.String r1 = r2.installVersion
                boolean r3 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.isSameLoaderVersion(r1, r3)
                if (r3 == 0) goto L27
            L14:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r0 = " (current)"
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r0 = r3.toString()
            L27:
                return r0
        }
    }

    public static final class MinecraftRelease {
        public final java.lang.String id;
        public final java.lang.String url;

        MinecraftRelease(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.url = r2
                return
        }
    }

    public static final class UpdateResult {
        public final java.lang.String baseVersionId;
        public final java.lang.String loader;
        public final java.lang.String loaderVersion;
        public final int metadataFilesUpdated;
        public final java.lang.String minecraftVersionId;
        public final java.lang.String versionType;

        UpdateResult(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.loader = r1
                r0.baseVersionId = r2
                r0.minecraftVersionId = r3
                r0.versionType = r4
                r0.loaderVersion = r5
                r0.metadataFilesUpdated = r6
                return
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smisPreReleaseLoaderVersion, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m484$$Nest$smisPreReleaseLoaderVersion(java.lang.String r0) {
            boolean r0 = isPreReleaseLoaderVersion(r0)
            return r0
    }

    private InstanceVersionUpdater() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void collectJsonCandidates(java.io.File r5, java.util.ArrayList<java.io.File> r6, java.util.Set<java.lang.String> r7, int r8) {
            if (r5 == 0) goto L4d
            if (r8 < 0) goto L4d
            boolean r0 = r5.isDirectory()
            if (r0 != 0) goto Lb
            goto L4d
        Lb:
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L12
            return
        L12:
            int r0 = r5.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L4d
            r2 = r5[r1]
            java.lang.String r3 = r2.getCanonicalPath()     // Catch: java.lang.Throwable -> L23
            boolean r3 = r7.add(r3)     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L23
            goto L4a
        L23:
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L2f
            int r3 = r8 + (-1)
            collectJsonCandidates(r2, r6, r7, r3)
            goto L4a
        L2f:
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L4a
            java.lang.String r3 = r2.getName()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = ".json"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L4a
            r6.add(r2)
        L4a:
            int r1 = r1 + 1
            goto L14
        L4d:
            return
    }

    private static int compareVersionStrings(java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "[\\.\\-\\+_]"
            java.lang.String[] r8 = r8.split(r0)
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r8.length
            int r1 = r9.length
            int r0 = java.lang.Math.max(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L3f
            int r3 = r8.length
            java.lang.String r4 = "0"
            if (r2 >= r3) goto L1c
            r3 = r8[r2]
            goto L1d
        L1c:
            r3 = r4
        L1d:
            int r5 = r9.length
            if (r2 >= r5) goto L22
            r4 = r9[r2]
        L22:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = parseInt(r3, r5)
            int r7 = parseInt(r4, r5)
            if (r6 == r5) goto L35
            if (r7 == r5) goto L35
            int r3 = java.lang.Integer.compare(r6, r7)
            goto L39
        L35:
            int r3 = r3.compareToIgnoreCase(r4)
        L39:
            if (r3 == 0) goto L3c
            return r3
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            return r1
    }

    private static void copy(java.io.InputStream r3, java.io.OutputStream r4) throws java.io.IOException {
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

    private static java.io.File downloadInstaller(java.lang.String r6, java.lang.String r7, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r8) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getMinecraftHomeDirectory()
            java.lang.String r2 = "launcher_cache/loaders"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L31
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L18
            goto L31
        L18:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to create loader cache: "
            r7.<init>(r8)
            java.lang.String r8 = r0.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L31:
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r7)
            boolean r7 = r1.isFile()
            if (r7 == 0) goto L47
            long r2 = r1.length()
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L47
            return r1
        L47:
            java.lang.String r7 = "Downloading loader installer..."
            notify(r8, r7)
            r7 = 1
            r0 = 4
            downloadToFile(r6, r1, r8, r7, r0)
            return r1
    }

    private static void downloadToFile(java.lang.String r11, java.io.File r12, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r13, int r14, int r15) throws java.lang.Exception {
            java.io.File r0 = r12.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unable to create folder: "
            r12.<init>(r13)
            java.lang.String r13 = r0.getAbsolutePath()
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L2c:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r12.getParentFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".download"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.net.HttpURLConnection r11 = openConnection(r11)
            int r1 = r11.getContentLength()
            java.io.InputStream r2 = r11.getInputStream()     // Catch: java.lang.Throwable -> Lee
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le2
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Le2
            r4 = 65536(0x10000, float:9.1835E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> Ld8
            r5 = 0
        L63:
            int r7 = r2.read(r4)     // Catch: java.lang.Throwable -> Ld8
            r8 = -1
            if (r7 == r8) goto L87
            r8 = 0
            r3.write(r4, r8, r7)     // Catch: java.lang.Throwable -> Ld8
            long r7 = (long) r7     // Catch: java.lang.Throwable -> Ld8
            long r5 = r5 + r7
            if (r1 <= 0) goto L63
            if (r13 == 0) goto L63
            long r7 = (long) r1     // Catch: java.lang.Throwable -> Ld8
            r9 = 1
            long r7 = java.lang.Math.max(r9, r7)     // Catch: java.lang.Throwable -> Ld8
            long r7 = r5 / r7
            long r7 = java.lang.Math.min(r9, r7)     // Catch: java.lang.Throwable -> Ld8
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Ld8
            int r7 = r7 + r14
            r13.onProgress(r7, r15)     // Catch: java.lang.Throwable -> Ld8
            goto L63
        L87:
            r3.close()     // Catch: java.lang.Throwable -> Le2
            if (r2 == 0) goto L8f
            r2.close()     // Catch: java.lang.Throwable -> Lee
        L8f:
            r11.disconnect()
            boolean r11 = r12.exists()
            if (r11 == 0) goto Lb8
            boolean r11 = r12.delete()
            if (r11 == 0) goto L9f
            goto Lb8
        L9f:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Unable to replace "
            r13.<init>(r14)
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lb8:
            boolean r11 = r0.renameTo(r12)
            if (r11 == 0) goto Lbf
            return
        Lbf:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Unable to move download into place: "
            r13.<init>(r14)
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Ld8:
            r12 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Ldd
            goto Le1
        Ldd:
            r13 = move-exception
            r12.addSuppressed(r13)     // Catch: java.lang.Throwable -> Le2
        Le1:
            throw r12     // Catch: java.lang.Throwable -> Le2
        Le2:
            r12 = move-exception
            if (r2 == 0) goto Led
            r2.close()     // Catch: java.lang.Throwable -> Le9
            goto Led
        Le9:
            r13 = move-exception
            r12.addSuppressed(r13)     // Catch: java.lang.Throwable -> Lee
        Led:
            throw r12     // Catch: java.lang.Throwable -> Lee
        Lee:
            r12 = move-exception
            r11.disconnect()
            throw r12
    }

    private static void ensureVanillaVersionInstalled(java.lang.String r5, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r6) throws java.lang.Exception {
            java.io.File r0 = getVersionDirectory(r5)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = ".jar"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r0, r3)
            boolean r3 = r1.isFile()
            if (r3 == 0) goto L41
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L41
            return
        L41:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Finding Minecraft "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = " metadata..."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            notify(r6, r3)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$MinecraftRelease r3 = findMinecraftRelease(r5)
            if (r3 == 0) goto Lf7
            org.json.JSONObject r4 = new org.json.JSONObject
            java.lang.String r3 = r3.url
            java.lang.String r3 = httpGetText(r3)
            r4.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L90
            boolean r3 = r0.mkdirs()
            if (r3 == 0) goto L77
            goto L90
        L77:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create version folder: "
            r6.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L90:
            r0 = 2
            java.lang.String r0 = r4.toString(r0)
            writeText(r1, r0)
            boolean r0 = r2.isFile()
            if (r0 != 0) goto Lf6
            java.lang.String r0 = "downloads"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            if (r0 != 0) goto La8
            r0 = 0
            goto Lae
        La8:
            java.lang.String r1 = "client"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
        Lae:
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb3
            goto Lbd
        Lb3:
            java.lang.String r3 = "url"
            java.lang.String r0 = r0.optString(r3, r1)
            java.lang.String r1 = r0.trim()
        Lbd:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Le1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Downloading Minecraft "
            r0.<init>(r3)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = " client..."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            notify(r6, r5)
            r5 = 1
            r0 = 4
            downloadToFile(r1, r2, r6, r5, r0)
            goto Lf6
        Le1:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing client jar URL for "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        Lf6:
            return
        Lf7:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Minecraft release not found: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    private static void extractInstallerLibraries(java.io.File r13, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r14) {
            java.lang.String r0 = "libraries/"
            java.lang.String r1 = "maven/"
            java.io.File r2 = getLibrariesDirectory()
            boolean r3 = r2.exists()
            if (r3 != 0) goto L15
            boolean r3 = r2.mkdirs()
            if (r3 != 0) goto L15
            return
        L15:
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L135
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L135
            java.util.Enumeration r4 = r3.entries()     // Catch: java.lang.Throwable -> L12b
            r5 = 0
        L1f:
            boolean r6 = r4.hasMoreElements()     // Catch: java.lang.Throwable -> L12b
            if (r6 == 0) goto L109
            java.lang.Object r6 = r4.nextElement()     // Catch: java.lang.Throwable -> L12b
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch: java.lang.Throwable -> L12b
            boolean r7 = r6.isDirectory()     // Catch: java.lang.Throwable -> L12b
            if (r7 == 0) goto L32
            goto L1f
        L32:
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L12b
            r8 = 92
            r9 = 47
            java.lang.String r7 = r7.replace(r8, r9)     // Catch: java.lang.Throwable -> L12b
            boolean r8 = r7.startsWith(r1)     // Catch: java.lang.Throwable -> L12b
            if (r8 == 0) goto L4d
            int r8 = r1.length()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r7 = r7.substring(r8)     // Catch: java.lang.Throwable -> L12b
            goto L5d
        L4d:
            boolean r8 = r7.startsWith(r0)     // Catch: java.lang.Throwable -> L12b
            if (r8 == 0) goto L5c
            int r8 = r0.length()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r7 = r7.substring(r8)     // Catch: java.lang.Throwable -> L12b
            goto L5d
        L5c:
            r7 = 0
        L5d:
            if (r7 == 0) goto L1f
            java.lang.String r8 = r7.trim()     // Catch: java.lang.Throwable -> L12b
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L12b
            if (r8 == 0) goto L6a
            goto L1f
        L6a:
            java.lang.String r8 = ".jar"
            boolean r8 = r7.endsWith(r8)     // Catch: java.lang.Throwable -> L12b
            if (r8 != 0) goto L83
            java.lang.String r8 = ".pom"
            boolean r8 = r7.endsWith(r8)     // Catch: java.lang.Throwable -> L12b
            if (r8 != 0) goto L83
            java.lang.String r8 = ".json"
            boolean r8 = r7.endsWith(r8)     // Catch: java.lang.Throwable -> L12b
            if (r8 != 0) goto L83
            goto L1f
        L83:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L12b
            r8.<init>(r2, r7)     // Catch: java.lang.Throwable -> L12b
            java.io.File r7 = r2.getCanonicalFile()     // Catch: java.lang.Throwable -> L12b
            java.io.File r9 = r8.getCanonicalFile()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r9 = r9.getPath()     // Catch: java.lang.Throwable -> L12b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12b
            r10.<init>()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L12b
            java.lang.StringBuilder r7 = r10.append(r7)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r10 = java.io.File.separator     // Catch: java.lang.Throwable -> L12b
            java.lang.StringBuilder r7 = r7.append(r10)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L12b
            boolean r7 = r9.startsWith(r7)     // Catch: java.lang.Throwable -> L12b
            if (r7 != 0) goto Lb3
            goto L1f
        Lb3:
            boolean r7 = r8.isFile()     // Catch: java.lang.Throwable -> L12b
            if (r7 == 0) goto Lc7
            long r9 = r8.length()     // Catch: java.lang.Throwable -> L12b
            long r11 = r6.getSize()     // Catch: java.lang.Throwable -> L12b
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto Lc7
            goto L1f
        Lc7:
            java.io.File r7 = r8.getParentFile()     // Catch: java.lang.Throwable -> L12b
            if (r7 == 0) goto Ldb
            boolean r9 = r7.exists()     // Catch: java.lang.Throwable -> L12b
            if (r9 != 0) goto Ldb
            boolean r7 = r7.mkdirs()     // Catch: java.lang.Throwable -> L12b
            if (r7 != 0) goto Ldb
            goto L1f
        Ldb:
            java.io.InputStream r6 = r3.getInputStream(r6)     // Catch: java.lang.Throwable -> L12b
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lfd
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lfd
            copy(r6, r7)     // Catch: java.lang.Throwable -> Lf3
            int r5 = r5 + 1
            r7.close()     // Catch: java.lang.Throwable -> Lfd
            if (r6 == 0) goto L1f
            r6.close()     // Catch: java.lang.Throwable -> L12b
            goto L1f
        Lf3:
            r14 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> Lf8
            goto Lfc
        Lf8:
            r0 = move-exception
            r14.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lfd
        Lfc:
            throw r14     // Catch: java.lang.Throwable -> Lfd
        Lfd:
            r14 = move-exception
            if (r6 == 0) goto L108
            r6.close()     // Catch: java.lang.Throwable -> L104
            goto L108
        L104:
            r0 = move-exception
            r14.addSuppressed(r0)     // Catch: java.lang.Throwable -> L12b
        L108:
            throw r14     // Catch: java.lang.Throwable -> L12b
        L109:
            if (r5 <= 0) goto L127
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12b
            r0.<init>()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r1 = "Copied "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L12b
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r1 = " embedded loader libraries..."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12b
            notify(r14, r0)     // Catch: java.lang.Throwable -> L12b
        L127:
            r3.close()     // Catch: java.lang.Throwable -> L135
            goto L14e
        L12b:
            r14 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L130
            goto L134
        L130:
            r0 = move-exception
            r14.addSuppressed(r0)     // Catch: java.lang.Throwable -> L135
        L134:
            throw r14     // Catch: java.lang.Throwable -> L135
        L135:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to extract embedded loader libraries from "
            r0.<init>(r1)
            java.lang.String r13 = r13.getName()
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "InstanceVersionUpdater"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r13, r14)
        L14e:
            return
    }

    private static java.lang.String extractLoaderVersionFromLibraryName(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r7, java.lang.String r8, java.lang.String r9) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ":"
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            r2 = 3
            if (r0 >= r2) goto L13
            return r1
        L13:
            r0 = 0
            r0 = r8[r0]
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            r3 = 1
            r4 = r8[r3]
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            r5 = 2
            r8 = r8[r5]
            int r7 = r7.ordinal()
            if (r7 == r3) goto La4
            java.lang.String r3 = "-"
            java.lang.String r6 = "forge"
            if (r7 == r5) goto L75
            if (r7 == r2) goto L37
            return r1
        L37:
            java.lang.String r7 = "net.neoforged"
            boolean r2 = r7.equals(r0)
            if (r2 == 0) goto L48
            java.lang.String r2 = "neoforge"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L48
            return r8
        L48:
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L74
            boolean r7 = r6.equals(r4)
            if (r7 == 0) goto L74
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            boolean r9 = r8.startsWith(r7)
            if (r9 == 0) goto L73
            int r7 = r7.length()
            java.lang.String r8 = r8.substring(r7)
        L73:
            return r8
        L74:
            return r1
        L75:
            java.lang.String r7 = "net.minecraftforge"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto La3
            boolean r7 = r6.equals(r4)
            if (r7 == 0) goto La3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            boolean r9 = r8.startsWith(r7)
            if (r9 == 0) goto La2
            int r7 = r7.length()
            java.lang.String r8 = r8.substring(r7)
        La2:
            return r8
        La3:
            return r1
        La4:
            java.lang.String r7 = "net.fabricmc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lb5
            java.lang.String r7 = "fabric-loader"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto Lb5
            return r8
        Lb5:
            return r1
    }

    private static java.lang.String extractLoaderVersionFromVersionId(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r8, java.lang.String r9, java.lang.String r10) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r9 = r9.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r9.toLowerCase(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "-"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r10)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            int r8 = r8.ordinal()
            r5 = 2
            r6 = 1
            if (r8 == r6) goto L174
            java.lang.String r2 = "[-_ ]([0-9][A-Za-z0-9._+\\-]*)"
            if (r8 == r5) goto Lf8
            r7 = 3
            if (r8 == r7) goto L42
            return r1
        L42:
            java.lang.String r8 = "neoforge-"
            boolean r0 = r0.startsWith(r8)
            if (r0 == 0) goto L53
            int r8 = r8.length()
            java.lang.String r8 = r9.substring(r8)
            goto La8
        L53:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "neoforge[-_ ]?"
            r8.<init>(r0)
            java.lang.String r0 = java.util.regex.Pattern.quote(r10)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8, r5)
            java.util.regex.Matcher r8 = r8.matcher(r9)
            boolean r0 = r8.find()
            if (r0 == 0) goto L7d
            java.lang.String r8 = r8.group(r6)
            return r8
        L7d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = java.util.regex.Pattern.quote(r10)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = "[-_ ]neoforge[-_ ]([0-9][A-Za-z0-9._+\\-]*)"
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8, r5)
            java.util.regex.Matcher r8 = r8.matcher(r9)
            boolean r9 = r8.find()
            if (r9 == 0) goto La7
            java.lang.String r8 = r8.group(r6)
            return r8
        La7:
            r8 = r1
        La8:
            boolean r9 = org.apache.commons.lang3.StringUtils.isBlank(r8)
            if (r9 != 0) goto Lf7
            boolean r9 = r8.startsWith(r4)
            if (r9 == 0) goto Lbd
            int r9 = r4.length()
            java.lang.String r8 = r8.substring(r9)
            return r8
        Lbd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto Lee
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            int r9 = r9.length()
            java.lang.String r8 = r8.substring(r9)
            return r8
        Lee:
            java.lang.String r9 = "^[0-9].*"
            boolean r9 = r8.matches(r9)
            if (r9 == 0) goto Lf7
            return r8
        Lf7:
            return r1
        Lf8:
            java.lang.String r8 = "forge-"
            boolean r0 = r0.startsWith(r8)
            if (r0 == 0) goto L109
            int r8 = r8.length()
            java.lang.String r8 = r9.substring(r8)
            goto L15e
        L109:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "forge[-_ ]?"
            r8.<init>(r0)
            java.lang.String r0 = java.util.regex.Pattern.quote(r10)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8, r5)
            java.util.regex.Matcher r8 = r8.matcher(r9)
            boolean r0 = r8.find()
            if (r0 == 0) goto L133
            java.lang.String r8 = r8.group(r6)
            return r8
        L133:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = java.util.regex.Pattern.quote(r10)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r10 = "[-_ ]forge[-_ ]([0-9][A-Za-z0-9._+\\-]*)"
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8, r5)
            java.util.regex.Matcher r8 = r8.matcher(r9)
            boolean r9 = r8.find()
            if (r9 == 0) goto L15d
            java.lang.String r8 = r8.group(r6)
            return r8
        L15d:
            r8 = r1
        L15e:
            boolean r9 = org.apache.commons.lang3.StringUtils.isBlank(r8)
            if (r9 != 0) goto L173
            boolean r9 = r8.startsWith(r4)
            if (r9 == 0) goto L173
            int r9 = r4.length()
            java.lang.String r8 = r8.substring(r9)
            return r8
        L173:
            return r1
        L174:
            java.lang.String r8 = "fabric-loader-"
            boolean r0 = r0.startsWith(r8)
            if (r0 == 0) goto L194
            boolean r0 = r9.endsWith(r2)
            if (r0 == 0) goto L194
            int r8 = r8.length()
            int r10 = r9.length()
            int r0 = r2.length()
            int r10 = r10 - r0
            java.lang.String r8 = r9.substring(r8, r10)
            return r8
        L194:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "fabric(?:[-_ ]?loader)?[-_ ]?([0-9][A-Za-z0-9._+\\-]*)[-_ ]?"
            r8.<init>(r0)
            java.lang.String r10 = java.util.regex.Pattern.quote(r10)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8, r5)
            java.util.regex.Matcher r8 = r8.matcher(r9)
            boolean r9 = r8.find()
            if (r9 == 0) goto L1ba
            java.lang.String r8 = r8.group(r6)
            return r8
        L1ba:
            return r1
    }

    private static java.lang.String extractLoaderVersionFromVersionJson(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r5, java.lang.String r6, java.lang.String r7) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r6.trim()     // Catch: java.lang.Throwable -> L6d
            java.io.File r2 = getVersionDirectory(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r6 = r3.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = ".json"
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L6d
            boolean r6 = r0.isFile()     // Catch: java.lang.Throwable -> L6d
            if (r6 != 0) goto L33
            return r1
        L33:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = readText(r0)     // Catch: java.lang.Throwable -> L6d
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "libraries"
            org.json.JSONArray r6 = r6.optJSONArray(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != 0) goto L45
            return r1
        L45:
            r0 = 0
        L46:
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L6d
            if (r0 >= r2) goto L75
            org.json.JSONObject r2 = r6.optJSONObject(r0)     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L53
            goto L6a
        L53:
            java.lang.String r3 = "name"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.optString(r3, r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = extractLoaderVersionFromLibraryName(r5, r2, r7)     // Catch: java.lang.Throwable -> L6d
            boolean r3 = org.apache.commons.lang3.StringUtils.isBlank(r2)     // Catch: java.lang.Throwable -> L6d
            if (r3 != 0) goto L6a
            return r2
        L6a:
            int r0 = r0 + 1
            goto L46
        L6d:
            r5 = move-exception
            java.lang.String r6 = "InstanceVersionUpdater"
            java.lang.String r7 = "Unable to read current loader version from version JSON"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r6, r7, r5)
        L75:
            return r1
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion> fetchFabricLoaderVersions(java.lang.String r11) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://meta.fabricmc.net/v2/versions/loader/"
            r0.<init>(r1)
            java.lang.String r1 = urlEncodePath(r11)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.json.JSONArray r1 = new org.json.JSONArray
            java.lang.String r0 = httpGetText(r0)
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
        L22:
            int r3 = r1.length()
            if (r2 >= r3) goto L5c
            org.json.JSONObject r3 = r1.getJSONObject(r2)
            java.lang.String r4 = "loader"
            org.json.JSONObject r3 = r3.getJSONObject(r4)
            java.lang.String r4 = "version"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)
            java.lang.String r8 = r4.trim()
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L45
            goto L59
        L45:
            java.lang.String r4 = "stable"
            r5 = 1
            boolean r10 = r3.optBoolean(r4, r5)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r3 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r6 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FABRIC
            r5 = r3
            r7 = r8
            r9 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.add(r3)
        L59:
            int r2 = r2 + 1
            goto L22
        L5c:
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$$ExternalSyntheticLambda1 r11 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$$ExternalSyntheticLambda1
            r11.<init>()
            java.util.Collections.sort(r0, r11)
            return r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion> fetchForgeLoaderVersions(java.lang.String r10) throws java.lang.Exception {
            java.lang.String r0 = "https://maven.minecraftforge.net/net/minecraftforge/forge/maven-metadata.xml"
            java.lang.String r0 = httpGetText(r0)
            java.util.ArrayList r0 = parseMavenVersions(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r3 = "-"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r0.next()
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            boolean r3 = r7.startsWith(r2)
            if (r3 != 0) goto L3a
            goto L26
        L3a:
            int r3 = r2.length()
            java.lang.String r6 = r7.substring(r3)
            boolean r3 = isPreReleaseLoaderVersion(r6)
            r9 = r3 ^ 1
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r3 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r5 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FORGE
            r4 = r3
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r1.add(r3)
            goto L26
        L55:
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$$ExternalSyntheticLambda2 r10 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$$ExternalSyntheticLambda2
            r10.<init>()
            java.util.Collections.sort(r1, r10)
            return r1
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion> fetchLoaderVersions(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r1, java.lang.String r2) throws java.lang.Exception {
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r0) goto L1d
            r0 = 2
            if (r1 == r0) goto L18
            r0 = 3
            if (r1 == r0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        L13:
            java.util.ArrayList r1 = fetchNeoForgeLoaderVersions(r2)
            return r1
        L18:
            java.util.ArrayList r1 = fetchForgeLoaderVersions(r2)
            return r1
        L1d:
            java.util.ArrayList r1 = fetchFabricLoaderVersions(r2)
            return r1
    }

    public static java.util.ArrayList<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.MinecraftRelease> fetchMinecraftReleases() throws java.lang.Exception {
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r1 = "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"
            java.lang.String r1 = httpGetText(r1)
            r0.<init>(r1)
            java.lang.String r1 = "versions"
            org.json.JSONArray r0 = r0.getJSONArray(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L17:
            int r3 = r0.length()
            if (r2 >= r3) goto L5d
            org.json.JSONObject r3 = r0.getJSONObject(r2)
            java.lang.String r4 = "type"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)
            java.lang.String r6 = "release"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 != 0) goto L32
            goto L5a
        L32:
            java.lang.String r4 = "id"
            java.lang.String r4 = r3.optString(r4, r5)
            java.lang.String r4 = r4.trim()
            java.lang.String r6 = "url"
            java.lang.String r3 = r3.optString(r6, r5)
            java.lang.String r3 = r3.trim()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L5a
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L5a
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$MinecraftRelease r5 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$MinecraftRelease
            r5.<init>(r4, r3)
            r1.add(r5)
        L5a:
            int r2 = r2 + 1
            goto L17
        L5d:
            return r1
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion> fetchNeoForgeLoaderVersions(java.lang.String r10) throws java.lang.Exception {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "1.20.1"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L5d
            java.lang.String r1 = "https://maven.neoforged.net/releases/net/neoforged/forge/maven-metadata.xml"
            java.lang.String r1 = httpGetText(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r3 = "-"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.ArrayList r1 = parseMavenVersions(r1)
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r1.next()
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            boolean r3 = r7.startsWith(r2)
            if (r3 != 0) goto L42
            goto L2e
        L42:
            int r3 = r2.length()
            java.lang.String r6 = r7.substring(r3)
            boolean r3 = isPreReleaseLoaderVersion(r6)
            r9 = r3 ^ 1
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r3 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r5 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.NEOFORGE
            r4 = r3
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r3)
            goto L2e
        L5d:
            java.lang.String r1 = "https://maven.neoforged.net/releases/net/neoforged/neoforge/maven-metadata.xml"
            java.lang.String r1 = httpGetText(r1)
            java.util.ArrayList r1 = parseMavenVersions(r1)
            java.util.Iterator r1 = r1.iterator()
        L6b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r2 = formatNeoForgeGameVersion(r6)
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L83
            goto L6b
        L83:
            boolean r2 = isPreReleaseLoaderVersion(r6)
            r8 = r2 ^ 1
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r2 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r4 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.NEOFORGE
            r3 = r2
            r5 = r6
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r2)
            goto L6b
        L97:
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$$ExternalSyntheticLambda0 r10 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$$ExternalSyntheticLambda0
            r10.<init>()
            java.util.Collections.sort(r0, r10)
            return r0
    }

    public static ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion findLatestLoaderVersion(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r0, java.lang.String r1) throws java.lang.Exception {
            java.util.ArrayList r0 = fetchLoaderVersions(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r0 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion) r0
            return r0
    }

    private static ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.MinecraftRelease findMinecraftRelease(java.lang.String r3) throws java.lang.Exception {
            java.util.ArrayList r0 = fetchMinecraftReleases()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$MinecraftRelease r1 = (ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.MinecraftRelease) r1
            java.lang.String r2 = r1.id
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L8
            return r1
        L1d:
            r3 = 0
            return r3
    }

    private static java.lang.String formatNeoForgeGameVersion(java.lang.String r7) {
            java.lang.String r0 = "-"
            r1 = 2
            java.lang.String[] r7 = r7.split(r0, r1)
            r0 = 0
            r7 = r7[r0]
            java.lang.String r2 = "\\."
            java.lang.String[] r7 = r7.split(r2)
            int r2 = r7.length
            java.lang.String r3 = ""
            if (r2 >= r1) goto L16
            return r3
        L16:
            r2 = r7[r0]
            r4 = -1
            int r2 = parseInt(r2, r4)
            if (r2 >= 0) goto L20
            return r3
        L20:
            r4 = 26
            r5 = 1
            java.lang.String r6 = "."
            if (r2 < r4) goto L69
            int r2 = r7.length
            r3 = 3
            if (r2 < r3) goto L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = r7[r0]
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            r2 = r7[r5]
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r6)
            r7 = r7[r1]
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            return r7
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r7[r0]
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            r7 = r7[r5]
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            return r7
        L69:
            r1 = 20
            if (r2 < r1) goto L89
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "1."
            r1.<init>(r2)
            r0 = r7[r0]
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            r7 = r7[r5]
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            return r7
        L89:
            return r3
    }

    private static java.io.File getLibrariesDirectory() {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getMinecraftHomeDirectory()
            java.lang.String r2 = "libraries"
            r0.<init>(r1, r2)
            return r0
    }

    private static java.io.File getMinecraftHomeDirectory() {
            java.io.File r0 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()
            java.io.File r1 = r0.getParentFile()
            if (r1 != 0) goto Lb
            goto Lc
        Lb:
            r0 = r1
        Lc:
            return r0
    }

    private static java.io.File getVersionDirectory(java.lang.String r2) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()
            r0.<init>(r1, r2)
            return r0
    }

    private static java.lang.String httpGetText(java.lang.String r4) throws java.lang.Exception {
            java.net.HttpURLConnection r4 = openConnection(r4)
            java.io.InputStream r0 = r4.getInputStream()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L1c
            byte[] r2 = readAllBytes(r0)     // Catch: java.lang.Throwable -> L1c
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L18
            r0.close()     // Catch: java.lang.Throwable -> L28
        L18:
            r4.disconnect()
            return r1
        L1c:
            r1 = move-exception
            if (r0 == 0) goto L27
            r0.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L28
        L27:
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r0 = move-exception
            r4.disconnect()
            throw r0
    }

    private static java.lang.String installFabricProfile(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r4, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r5) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fabric-loader-"
            r0.<init>(r1)
            java.lang.String r1 = r4.displayVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r4.minecraftVersion
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Downloading Fabric loader profile "
            r1.<init>(r2)
            java.lang.String r2 = r4.displayVersion
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "..."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            notify(r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://meta.fabricmc.net/v2/versions/loader/"
            r1.<init>(r2)
            java.lang.String r2 = r4.minecraftVersion
            java.lang.String r2 = urlEncodePath(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.installVersion
            java.lang.String r2 = urlEncodePath(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/profile/json"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONObject r2 = new org.json.JSONObject
            java.lang.String r1 = httpGetText(r1)
            r2.<init>(r1)
            java.lang.String r1 = "id"
            r2.put(r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r3 = "release"
            r2.put(r1, r3)
            java.lang.String r1 = "inheritsFrom"
            java.lang.String r4 = r4.minecraftVersion
            r2.put(r1, r4)
            writeVersionJson(r0, r2)
            r4 = 2
            r1 = 4
            notifyProgress(r5, r4, r1)
            return r0
    }

    private static java.lang.String installForgeLikeProfile(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r6, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r7) throws java.lang.Exception {
            java.lang.String r0 = r6.installVersion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "forge-"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "https://maven.minecraftforge.net/net/minecraftforge/forge/"
            r3.<init>(r4)
            java.lang.String r4 = urlEncodePath(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "/forge-"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = urlEncodePath(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "-installer.jar"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r0 = sanitizeFilePart(r0)
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.io.File r0 = downloadInstaller(r3, r0, r7)
            org.json.JSONObject r2 = readForgeLikeVersionJsonFromInstaller(r0)
            java.lang.String r6 = r6.minecraftVersion
            normalizeLoaderVersionJson(r2, r1, r6)
            writeVersionJson(r1, r2)
            extractInstallerLibraries(r0, r7)
            r6 = 2
            r0 = 4
            notifyProgress(r7, r6, r0)
            return r1
    }

    private static java.lang.String installLoaderProfile(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r2, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r3) throws java.lang.Exception {
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = r2.kind
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L1c
            r1 = 2
            if (r0 == r1) goto L17
            r1 = 3
            if (r0 == r1) goto L12
            java.lang.String r2 = r2.minecraftVersion
            return r2
        L12:
            java.lang.String r2 = installNeoForgeProfile(r2, r3)
            return r2
        L17:
            java.lang.String r2 = installForgeLikeProfile(r2, r3)
            return r2
        L1c:
            java.lang.String r2 = installFabricProfile(r2, r3)
            return r2
    }

    private static java.lang.String installNeoForgeProfile(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r5, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r6) throws java.lang.Exception {
            java.lang.String r0 = r5.installVersion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.minecraftVersion
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.startsWith(r1)
            java.lang.String r1 = "neoforge-"
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r3 = r5.installVersion
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L48
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r4 = r5.minecraftVersion
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = r5.installVersion
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
        L48:
            java.lang.String r3 = "-installer.jar"
            if (r0 == 0) goto L8f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://maven.neoforged.net/releases/net/neoforged/forge/"
            r0.<init>(r1)
            java.lang.String r1 = r5.installVersion
            java.lang.String r1 = urlEncodePath(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/forge-"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r5.installVersion
            java.lang.String r1 = urlEncodePath(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "neoforge-legacy-"
            r1.<init>(r4)
            java.lang.String r4 = r5.installVersion
            java.lang.String r4 = sanitizeFilePart(r4)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto Lcf
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "https://maven.neoforged.net/releases/net/neoforged/neoforge/"
            r0.<init>(r4)
            java.lang.String r4 = r5.installVersion
            java.lang.String r4 = urlEncodePath(r4)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r4 = "/neoforge-"
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r4 = r5.installVersion
            java.lang.String r4 = urlEncodePath(r4)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = r5.installVersion
            java.lang.String r1 = sanitizeFilePart(r1)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        Lcf:
            java.io.File r0 = downloadInstaller(r0, r1, r6)
            org.json.JSONObject r1 = readForgeLikeVersionJsonFromInstaller(r0)
            java.lang.String r5 = r5.minecraftVersion
            normalizeLoaderVersionJson(r1, r2, r5)
            writeVersionJson(r2, r1)
            extractInstallerLibraries(r0, r6)
            r5 = 2
            r0 = 4
            notifyProgress(r6, r5, r0)
            return r2
    }

    private static boolean isPreReleaseLoaderVersion(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "snapshot"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = "beta"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = "alpha"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = "pre"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = "rc"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r1 = 0
            goto L32
        L31:
            r1 = 1
        L32:
            return r1
    }

    public static boolean isSameLoaderVersion(java.lang.String r1, java.lang.String r2) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r1)
            if (r0 != 0) goto L1a
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r2)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            java.lang.String r1 = normalizeLoaderVersionForCompare(r1)
            java.lang.String r2 = normalizeLoaderVersionForCompare(r2)
            boolean r1 = r1.equals(r2)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    static /* synthetic */ int lambda$fetchFabricLoaderVersions$0(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r2, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r3) {
            boolean r0 = r2.stable
            boolean r1 = r3.stable
            if (r0 == r1) goto Le
            boolean r2 = r2.stable
            if (r2 == 0) goto Lc
            r2 = -1
            goto Ld
        Lc:
            r2 = 1
        Ld:
            return r2
        Le:
            java.lang.String r2 = r2.displayVersion
            java.lang.String r3 = r3.displayVersion
            int r2 = compareVersionStrings(r2, r3)
            int r2 = -r2
            return r2
    }

    static /* synthetic */ int lambda$fetchForgeLoaderVersions$1(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r2, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r3) {
            boolean r0 = r2.stable
            boolean r1 = r3.stable
            if (r0 == r1) goto Le
            boolean r2 = r2.stable
            if (r2 == 0) goto Lc
            r2 = -1
            goto Ld
        Lc:
            r2 = 1
        Ld:
            return r2
        Le:
            java.lang.String r2 = r2.displayVersion
            java.lang.String r3 = r3.displayVersion
            int r2 = compareVersionStrings(r2, r3)
            int r2 = -r2
            return r2
    }

    static /* synthetic */ int lambda$fetchNeoForgeLoaderVersions$2(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r2, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r3) {
            boolean r0 = r2.stable
            boolean r1 = r3.stable
            if (r0 == r1) goto Le
            boolean r2 = r2.stable
            if (r2 == 0) goto Lc
            r2 = -1
            goto Ld
        Lc:
            r2 = 1
        Ld:
            return r2
        Le:
            java.lang.String r2 = r2.displayVersion
            java.lang.String r3 = r3.displayVersion
            int r2 = compareVersionStrings(r2, r3)
            int r2 = -r2
            return r2
    }

    private static boolean looksLikeInstanceMetadata(org.json.JSONObject r3, java.lang.String r4) {
            java.lang.String r0 = "baseVersionId"
            boolean r0 = r3.has(r0)
            r1 = 0
            if (r0 != 0) goto L33
            java.lang.String r0 = "minecraftVersionId"
            boolean r0 = r3.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "rootDirectory"
            boolean r0 = r3.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "gameDirectory"
            boolean r0 = r3.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "isIsolated"
            boolean r0 = r3.has(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "isolated"
            boolean r0 = r3.has(r0)
            if (r0 == 0) goto L32
            goto L33
        L32:
            return r1
        L33:
            java.lang.String r0 = "instanceName"
            java.lang.String r2 = ""
            java.lang.String r0 = r3.optString(r0, r2)
            java.lang.String r2 = "name"
            java.lang.String r3 = r3.optString(r2, r0)
            java.lang.String r3 = r3.trim()
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L51
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L52
        L51:
            r1 = 1
        L52:
            return r1
    }

    private static java.lang.String normalizeLoaderVersionForCompare(java.lang.String r3) {
            java.lang.String r3 = r3.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "_"
            java.lang.String r1 = "-"
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = "+"
            java.lang.String r3 = r3.replace(r0, r1)
        L18:
            java.lang.String r0 = "--"
            boolean r2 = r3.contains(r0)
            if (r2 == 0) goto L25
            java.lang.String r3 = r3.replace(r0, r1)
            goto L18
        L25:
            return r3
    }

    private static void normalizeLoaderVersionJson(org.json.JSONObject r1, java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            java.lang.String r0 = "id"
            r1.put(r0, r2)
            java.lang.String r2 = "type"
            java.lang.String r0 = "release"
            r1.put(r2, r0)
            java.lang.String r2 = ""
            java.lang.String r0 = "inheritsFrom"
            java.lang.String r2 = r1.optString(r0, r2)
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L21
            r1.put(r0, r3)
        L21:
            return
    }

    private static void notify(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r0, java.lang.String r1) {
            if (r0 == 0) goto L5
            r0.onStatus(r1)
        L5:
            return
    }

    private static void notifyProgress(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r0, int r1, int r2) {
            if (r0 == 0) goto L5
            r0.onProgress(r1, r2)
        L5:
            return
    }

    private static java.net.HttpURLConnection openConnection(java.lang.String r4) throws java.lang.Exception {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r4)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.setConnectTimeout(r1)
            r1 = 45000(0xafc8, float:6.3058E-41)
            r0.setReadTimeout(r1)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "JavaLauncher Instance Updater"
            r0.setRequestProperty(r1, r2)
            int r1 = r0.getResponseCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L2a
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto L2a
            return r0
        L2a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "HTTP "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private static int parseInt(java.lang.String r1, int r2) {
            if (r1 != 0) goto L3
            return r2
        L3:
            java.lang.String r0 = "\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L1d
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r1.find()     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L14
            return r2
        L14:
            java.lang.String r1 = r1.group()     // Catch: java.lang.Throwable -> L1d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            return r2
    }

    private static java.util.ArrayList<java.lang.String> parseMavenVersions(java.lang.String r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "<version>([^<]+)</version>"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r3 = r1.matcher(r3)
        Lf:
            boolean r1 = r3.find()
            if (r1 == 0) goto L28
            r1 = 1
            java.lang.String r1 = r3.group(r1)
            java.lang.String r1 = r1.trim()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lf
            r0.add(r1)
            goto Lf
        L28:
            return r0
    }

    private static int persistInstanceMetadataBestEffort(java.io.File r16, java.io.File r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
            r0 = r16
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9 = 2
            collectJsonCandidates(r0, r2, r1, r9)
            r10 = 1
            r11 = r17
            collectJsonCandidates(r11, r2, r1, r10)
            java.util.Iterator r12 = r2.iterator()
            r1 = 0
            r13 = r1
        L1c:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r12.next()
            r14 = r1
            java.io.File r14 = (java.io.File) r14
            java.lang.String r1 = readText(r14)     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r15.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r8 = r18
            boolean r1 = looksLikeInstanceMetadata(r15, r8)     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L3b
            goto L1c
        L3b:
            r1 = r15
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r16
            r8 = r17
            updateMetadataObject(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r15.toString(r9)     // Catch: java.lang.Throwable -> L1c
            writeText(r14, r1)     // Catch: java.lang.Throwable -> L1c
            int r13 = r13 + 1
            goto L1c
        L57:
            if (r13 != 0) goto L96
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "instance.json"
            r12.<init>(r0, r1)     // Catch: java.lang.Throwable -> L8e
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8e
            r14.<init>()     // Catch: java.lang.Throwable -> L8e
            r1 = r14
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r16
            r8 = r17
            updateMetadataObject(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8e
            java.io.File r0 = r12.getParentFile()     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L86
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L86
            r0.mkdirs()     // Catch: java.lang.Throwable -> L8e
        L86:
            java.lang.String r0 = r14.toString(r9)     // Catch: java.lang.Throwable -> L8e
            writeText(r12, r0)     // Catch: java.lang.Throwable -> L8e
            goto L97
        L8e:
            r0 = move-exception
            java.lang.String r1 = "InstanceVersionUpdater"
            java.lang.String r2 = "Unable to write fallback instance metadata"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
        L96:
            r10 = r13
        L97:
            return r10
    }

    private static byte[] readAllBytes(java.io.InputStream r1) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            copy(r1, r0)
            byte[] r1 = r0.toByteArray()
            return r1
    }

    private static org.json.JSONObject readForgeLikeVersionJsonFromInstaller(java.io.File r3) throws java.lang.Exception {
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r3)
            java.lang.String r1 = "version.json"
            java.util.zip.ZipEntry r1 = r0.getEntry(r1)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L20
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L20
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = readZipEntryText(r0, r1)     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5f
            r0.close()
            return r3
        L20:
            java.lang.String r1 = "install_profile.json"
            java.util.zip.ZipEntry r1 = r0.getEntry(r1)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L43
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L43
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = readZipEntryText(r0, r1)     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "versionInfo"
            org.json.JSONObject r1 = r2.optJSONObject(r1)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L43
            r0.close()
            return r1
        L43:
            r0.close()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Installer does not contain version.json or install_profile.json versionInfo: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L5f:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r0 = move-exception
            r3.addSuppressed(r0)
        L68:
            throw r3
    }

    private static java.lang.String readText(java.io.File r3) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L14
            byte[] r1 = readAllBytes(r0)     // Catch: java.lang.Throwable -> L14
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L14
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L14
            r0.close()
            return r3
        L14:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r3.addSuppressed(r0)
        L1d:
            throw r3
    }

    private static java.lang.String readZipEntryText(java.util.zip.ZipFile r2, java.util.zip.ZipEntry r3) throws java.io.IOException {
            java.io.InputStream r2 = r2.getInputStream(r3)
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L15
            byte[] r0 = readAllBytes(r2)     // Catch: java.lang.Throwable -> L15
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L15
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L14
            r2.close()
        L14:
            return r3
        L15:
            r3 = move-exception
            if (r2 == 0) goto L20
            r2.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r3.addSuppressed(r2)
        L20:
            throw r3
    }

    public static java.lang.String resolveCurrentLoaderVersion(ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = extractLoaderVersionFromVersionId(r2, r3, r4)
            boolean r1 = org.apache.commons.lang3.StringUtils.isBlank(r0)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r2 = extractLoaderVersionFromVersionJson(r2, r3, r4)
            boolean r3 = org.apache.commons.lang3.StringUtils.isBlank(r2)
            if (r3 != 0) goto L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    public static ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind resolveLoaderKind(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r3 = r3.replace(r1, r2)
            java.lang.String r1 = "_"
            java.lang.String r3 = r3.replace(r1, r2)
            java.lang.String r1 = "-"
            java.lang.String r3 = r3.replace(r1, r2)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.String r1 = "vanilla"
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L6f
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L38
            goto L6f
        L38:
            java.lang.String r1 = "neoforge"
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L6c
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L47
            goto L6c
        L47:
            java.lang.String r1 = "fabric"
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L69
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L56
            goto L69
        L56:
            java.lang.String r1 = "forge"
            boolean r2 = r3.equals(r1)
            if (r2 != 0) goto L66
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r3 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FORGE
            return r3
        L69:
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r3 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.FABRIC
            return r3
        L6c:
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r3 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.NEOFORGE
            return r3
        L6f:
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r3 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.VANILLA
            return r3
    }

    private static java.lang.String sanitizeFilePart(java.lang.String r2) {
            java.lang.String r0 = "[^A-Za-z0-9._-]"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    public static ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult updateInstanceLoader(android.content.Context r9, java.io.File r10, java.io.File r11, java.lang.String r12, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderVersion r13, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r14) throws java.lang.Exception {
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Preparing Minecraft "
            r9.<init>(r0)
            java.lang.String r0 = r13.minecraftVersion
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r0 = "..."
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            notify(r14, r9)
            r9 = 0
            r1 = 4
            notifyProgress(r14, r9, r1)
            java.lang.String r9 = r13.minecraftVersion
            ensureVanillaVersionInstalled(r9, r14)
            r9 = 1
            notifyProgress(r14, r9, r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Installing "
            r9.<init>(r2)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r2 = r13.kind
            java.lang.String r2 = r2.displayName
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r2 = r13.displayVersion
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            notify(r14, r9)
            java.lang.String r9 = installLoaderProfile(r13, r14)
            r0 = 3
            notifyProgress(r14, r0, r1)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r0 = r13.kind
            java.lang.String r5 = r0.displayName
            java.lang.String r7 = r13.minecraftVersion
            java.lang.String r8 = "release"
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r9
            int r8 = persistInstanceMetadataBestEffort(r2, r3, r4, r5, r6, r7, r8)
            notifyProgress(r14, r1, r1)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult r10 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r11 = r13.kind
            java.lang.String r3 = r11.displayName
            java.lang.String r5 = r13.minecraftVersion
            java.lang.String r6 = "release"
            java.lang.String r7 = r13.displayVersion
            r2 = r10
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r10
    }

    public static ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.UpdateResult updateInstanceVersion(android.content.Context r9, java.io.File r10, java.io.File r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.Listener r15) throws java.lang.Exception {
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r9 = resolveLoaderKind(r13)
            if (r9 != 0) goto L8
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r9 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.VANILLA
        L8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Preparing Minecraft "
            r13.<init>(r0)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r0 = "..."
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r13 = r13.toString()
            notify(r15, r13)
            r13 = 0
            r1 = 4
            notifyProgress(r15, r13, r1)
            ensureVanillaVersionInstalled(r14, r15)
            r13 = 1
            notifyProgress(r15, r13, r1)
            java.lang.String r13 = r9.displayName
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderKind r2 = ca.dnamobile.javalauncher.instance.InstanceVersionUpdater.LoaderKind.VANILLA
            if (r9 != r2) goto L35
            r9 = 0
            r0 = r14
            goto L67
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Finding latest "
            r2.<init>(r3)
            java.lang.String r3 = r9.displayName
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " loader for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            notify(r15, r0)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$LoaderVersion r0 = findLatestLoaderVersion(r9, r14)
            if (r0 == 0) goto L87
            java.lang.String r9 = r0.displayVersion
            r2 = 2
            notifyProgress(r15, r2, r1)
            java.lang.String r0 = installLoaderProfile(r0, r15)
        L67:
            r2 = 3
            notifyProgress(r15, r2, r1)
            java.lang.String r8 = "release"
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r0
            r7 = r14
            int r8 = persistInstanceMetadataBestEffort(r2, r3, r4, r5, r6, r7, r8)
            notifyProgress(r15, r1, r1)
            ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult r10 = new ca.dnamobile.javalauncher.instance.InstanceVersionUpdater$UpdateResult
            java.lang.String r6 = "release"
            r2 = r10
            r3 = r13
            r4 = r0
            r5 = r14
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r10
        L87:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "No "
            r11.<init>(r12)
            java.lang.String r9 = r9.displayName
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.String r11 = " loader found for Minecraft "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r14)
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    private static void updateMetadataObject(org.json.JSONObject r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.io.File r8, java.io.File r9) throws java.lang.Exception {
            java.lang.String r0 = "id"
            boolean r1 = r2.has(r0)
            if (r1 != 0) goto Lb
            r2.put(r0, r3)
        Lb:
            java.lang.String r0 = "name"
            boolean r1 = r2.has(r0)
            if (r1 != 0) goto L16
            r2.put(r0, r3)
        L16:
            java.lang.String r0 = "instanceName"
            boolean r1 = r2.has(r0)
            if (r1 == 0) goto L21
            r2.put(r0, r3)
        L21:
            java.lang.String r3 = "loader"
            r2.put(r3, r4)
            java.lang.String r3 = "baseVersionId"
            r2.put(r3, r5)
            java.lang.String r3 = "minecraftVersionId"
            r2.put(r3, r6)
            java.lang.String r3 = "versionType"
            r2.put(r3, r7)
            java.lang.String r3 = "baseVersion"
            boolean r4 = r2.has(r3)
            if (r4 == 0) goto L40
            r2.put(r3, r5)
        L40:
            java.lang.String r3 = "versionId"
            boolean r4 = r2.has(r3)
            if (r4 == 0) goto L4b
            r2.put(r3, r5)
        L4b:
            java.lang.String r3 = "minecraftVersion"
            boolean r4 = r2.has(r3)
            if (r4 == 0) goto L56
            r2.put(r3, r6)
        L56:
            java.lang.String r3 = "rootDirectory"
            boolean r4 = r2.has(r3)
            if (r4 == 0) goto L65
            java.lang.String r4 = r8.getAbsolutePath()
            r2.put(r3, r4)
        L65:
            java.lang.String r3 = "gameDirectory"
            boolean r4 = r2.has(r3)
            if (r4 == 0) goto L74
            java.lang.String r4 = r9.getAbsolutePath()
            r2.put(r3, r4)
        L74:
            return
    }

    private static java.lang.String urlEncodePath(java.lang.String r2) {
            java.lang.String r0 = " "
            java.lang.String r1 = "%20"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "+"
            java.lang.String r1 = "%2B"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private static void writeText(java.io.File r2, java.lang.String r3) throws java.io.IOException {
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
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L3e
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

    private static void writeVersionJson(java.lang.String r3, org.json.JSONObject r4) throws java.lang.Exception {
            java.io.File r0 = getVersionDirectory(r3)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2a
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L11
            goto L2a
        L11:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create version folder: "
            r4.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2a:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r1.<init>(r0, r3)
            r3 = 2
            java.lang.String r3 = r4.toString(r3)
            writeText(r1, r3)
            return
    }
}
