package ca.dnamobile.javalauncher.utils.path;

/* JADX INFO: loaded from: classes.dex */
public final class PathManager {
    public static java.lang.String DIR_ACCOUNT_NEW = null;
    public static java.lang.String DIR_ADDONS_INFO_CACHE = null;
    public static java.io.File DIR_APP_CACHE = null;
    public static java.io.File DIR_BACKGROUND = null;
    public static java.io.File DIR_CACHE = null;
    public static java.lang.String DIR_CACHE_STRING = null;
    public static java.lang.String DIR_CTRLMAP_PATH = null;
    public static java.lang.String DIR_CUSTOM_MOUSE = null;
    public static java.lang.String DIR_DATA = null;
    public static java.io.File DIR_FILE = null;
    public static java.lang.String DIR_GAME_HOME = "";
    public static java.io.File DIR_INSTALLED_RENDERER_PLUGIN = null;
    public static java.lang.String DIR_LAUNCHER_LOG = null;
    public static java.lang.String DIR_MINECRAFT_HOME = "";
    public static java.lang.String DIR_MULTIRT_HOME;
    public static java.lang.String DIR_NATIVE_LIB;
    public static java.io.File DIR_RUNTIME_MOD;
    public static java.io.File DIR_USER_SKIN;
    public static java.lang.String FILE_CTRLDEF_FILE;
    public static java.io.File FILE_NEWBIE_GUIDE;
    public static java.io.File FILE_PROFILE_PATH;
    public static java.io.File FILE_SETTINGS;
    public static java.lang.String FILE_VERSION_LIST;

    static {
            return
    }

    private PathManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addRootIfUsable(java.util.List<java.io.File> r1, java.util.Set<java.lang.String> r2, java.io.File r3) {
            if (r3 == 0) goto L1c
            boolean r0 = r3.exists()
            if (r0 == 0) goto L1c
            boolean r0 = r3.canRead()
            if (r0 != 0) goto Lf
            goto L1c
        Lf:
            java.lang.String r0 = r3.getAbsolutePath()
            boolean r2 = r2.add(r0)
            if (r2 == 0) goto L1c
            r1.add(r3)
        L1c:
            return
    }

    private static void createRequiredDirectories() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            r0.<init>(r1)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r0.<init>(r1)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MULTIRT_HOME
            r0.<init>(r1)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_LAUNCHER_LOG
            r0.<init>(r1)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CTRLMAP_PATH
            r0.<init>(r1)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CUSTOM_MOUSE
            r0.<init>(r1)
            mkdirs(r0)
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_BACKGROUND
            mkdirs(r0)
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_INSTALLED_RENDERER_PLUGIN
            mkdirs(r0)
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_USER_SKIN
            mkdirs(r0)
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD
            if (r0 == 0) goto L52
            mkdirs(r0)
        L52:
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r2 = "assets"
            r0.<init>(r1, r2)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "versions"
            r0.<init>(r1, r2)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "mods"
            r0.<init>(r1, r2)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "resourcepacks"
            r0.<init>(r1, r2)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "shaderpacks"
            r0.<init>(r1, r2)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "saves"
            r0.<init>(r1, r2)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "logs"
            r0.<init>(r1, r2)
            mkdirs(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r2 = "crash-reports"
            r0.<init>(r1, r2)
            mkdirs(r0)
            return
    }

    public static void deleteQuietly(java.io.File r4) {
            if (r4 == 0) goto L24
            boolean r0 = r4.exists()
            if (r0 != 0) goto L9
            goto L24
        L9:
            boolean r0 = r4.isDirectory()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L21
            java.io.File[] r0 = r4.listFiles()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L21
            int r1 = r0.length     // Catch: java.lang.Throwable -> L24
            r2 = 0
        L17:
            if (r2 >= r1) goto L21
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L24
            deleteQuietly(r3)     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + 1
            goto L17
        L21:
            r4.delete()     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    public static java.io.File findContainingStorageRoot(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L32
            java.lang.String r1 = r4.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le
            goto L32
        Le:
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L32
            r1.<init>(r4)     // Catch: java.io.IOException -> L32
            java.io.File r4 = r1.getCanonicalFile()     // Catch: java.io.IOException -> L32
            java.util.List r3 = getStorageRoots(r3)     // Catch: java.io.IOException -> L32
            java.util.Iterator r3 = r3.iterator()     // Catch: java.io.IOException -> L32
        L1f:
            boolean r1 = r3.hasNext()     // Catch: java.io.IOException -> L32
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()     // Catch: java.io.IOException -> L32
            java.io.File r1 = (java.io.File) r1     // Catch: java.io.IOException -> L32
            boolean r2 = isPathInsideRoot(r4, r1)     // Catch: java.io.IOException -> L32
            if (r2 == 0) goto L1f
            return r1
        L32:
            return r0
    }

    public static java.io.File getAccessibleLauncherRoot(android.content.Context r0) {
            java.io.File r0 = getLauncherHome(r0)
            return r0
    }

    public static java.io.File getDefaultLauncherHome(android.content.Context r2) {
            r0 = 0
            java.io.File r0 = r2.getExternalFilesDir(r0)
            if (r0 == 0) goto L8
            goto L13
        L8:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "JavaLauncher"
            r0.<init>(r2, r1)
        L13:
            return r0
    }

    private static java.io.File getDefaultLauncherHomeFromAnyPath(java.io.File r1) {
            java.io.File r0 = r1.getParentFile()
            if (r0 == 0) goto L7
            r1 = r0
        L7:
            return r1
    }

    private static java.util.List<java.io.File> getDirectMountedStorageRoots() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "/storage"
            r1.<init>(r2)
            java.io.File[] r1 = r1.listFiles()
            if (r1 != 0) goto L13
            return r0
        L13:
            int r2 = r1.length
            r3 = 0
        L15:
            if (r3 >= r2) goto L78
            r4 = r1[r3]
            boolean r5 = r4.isDirectory()
            if (r5 != 0) goto L20
            goto L75
        L20:
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "emulated"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L75
            java.lang.String r6 = "self"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L35
            goto L75
        L35:
            boolean r6 = r4.canRead()
            if (r6 != 0) goto L3c
            goto L75
        L3c:
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r5.toLowerCase(r6)
            java.lang.String r7 = "-"
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L72
            java.lang.String r5 = "usb"
            boolean r5 = r6.startsWith(r5)
            if (r5 != 0) goto L72
            java.lang.String r5 = "usbotg"
            boolean r5 = r6.startsWith(r5)
            if (r5 != 0) goto L72
            java.lang.String r5 = "sd"
            boolean r5 = r6.startsWith(r5)
            if (r5 != 0) goto L72
            java.lang.String r5 = "ext"
            boolean r5 = r6.startsWith(r5)
            if (r5 != 0) goto L72
            java.lang.String r5 = "disk"
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L75
        L72:
            r0.add(r4)
        L75:
            int r3 = r3 + 1
            goto L15
        L78:
            return r0
    }

    public static java.io.File getLauncherHome(android.content.Context r0) {
            android.content.Context r0 = r0.getApplicationContext()
            java.io.File r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getSelectedLauncherHome(r0)
            return r0
    }

    public static java.io.File getMinecraftHome(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = getLauncherHome(r2)
            java.lang.String r1 = ".minecraft"
            r0.<init>(r2, r1)
            return r0
    }

    public static java.io.File getPrimaryStorageRoot(android.content.Context r4) {
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            java.util.List r1 = getStorageRoots(r4)
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r2.getAbsolutePath()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L10
            return r2
        L27:
            java.util.List r4 = getStorageRoots(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L36
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()
            goto L3d
        L36:
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            java.io.File r4 = (java.io.File) r4
        L3d:
            return r4
    }

    public static java.io.File getRemovableStorageRoot(android.content.Context r6) {
            r0 = 0
            java.io.File[] r6 = r6.getExternalFilesDirs(r0)
            r1 = 0
            if (r6 == 0) goto L2e
            int r2 = r6.length
            r3 = r1
        La:
            if (r3 >= r2) goto L2e
            r4 = r6[r3]
            if (r4 != 0) goto L11
            goto L2b
        L11:
            boolean r5 = android.os.Environment.isExternalStorageRemovable(r4)
            if (r5 != 0) goto L18
            goto L2b
        L18:
            java.io.File r4 = getStorageRootFromAppExternalDir(r4)
            if (r4 == 0) goto L2b
            boolean r5 = r4.exists()
            if (r5 == 0) goto L2b
            boolean r5 = r4.canRead()
            if (r5 == 0) goto L2b
            return r4
        L2b:
            int r3 = r3 + 1
            goto La
        L2e:
            java.util.List r6 = getDirectMountedStorageRoots()
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L39
            goto L40
        L39:
            java.lang.Object r6 = r6.get(r1)
            r0 = r6
            java.io.File r0 = (java.io.File) r0
        L40:
            return r0
    }

    private static java.io.File getStorageRootFromAppExternalDir(java.io.File r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r1 = "/Android/data/"
            int r1 = r3.indexOf(r1)
            if (r1 > 0) goto L11
            return r0
        L11:
            java.io.File r0 = new java.io.File
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r1)
            r0.<init>(r3)
            return r0
    }

    public static java.util.List<java.io.File> getStorageRoots(android.content.Context r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 0
            java.io.File[] r5 = r5.getExternalFilesDirs(r2)
            if (r5 == 0) goto L21
            int r2 = r5.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L21
            r4 = r5[r3]
            java.io.File r4 = getStorageRootFromAppExternalDir(r4)
            addRootIfUsable(r0, r1, r4)
            int r3 = r3 + 1
            goto L13
        L21:
            java.util.List r5 = getDirectMountedStorageRoots()
            java.util.Iterator r5 = r5.iterator()
        L29:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r5.next()
            java.io.File r2 = (java.io.File) r2
            addRootIfUsable(r0, r1, r2)
            goto L29
        L39:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L46
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()
            addRootIfUsable(r0, r1, r5)
        L46:
            return r0
    }

    public static java.util.List<java.io.File> getUsbOrExternalRoots(android.content.Context r6) {
            java.io.File r0 = getPrimaryStorageRoot(r6)
            java.lang.String r0 = r0.getAbsolutePath()
            java.io.File r1 = getRemovableStorageRoot(r6)
            if (r1 == 0) goto L13
            java.lang.String r1 = r1.getAbsolutePath()
            goto L14
        L13:
            r1 = 0
        L14:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r6 = getStorageRoots(r6)
            java.util.Iterator r6 = r6.iterator()
        L21:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r6.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r4 = r3.getAbsolutePath()
            boolean r5 = r4.equals(r0)
            if (r5 != 0) goto L21
            if (r1 == 0) goto L3f
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L21
        L3f:
            r2.add(r3)
            goto L21
        L43:
            return r2
    }

    public static java.io.File inferLauncherHomeFromGameDirectory(java.io.File r4) {
            java.io.File r0 = r4.getParentFile()
            r1 = 0
            if (r0 == 0) goto Lc
            java.io.File r0 = r0.getParentFile()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.String r2 = "game"
            java.lang.String r3 = r4.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L35
            if (r0 == 0) goto L35
            java.lang.String r2 = "instances"
            java.lang.String r3 = r0.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L35
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L31
            java.io.File r1 = r0.getParentFile()
        L31:
            if (r1 == 0) goto L34
            r4 = r1
        L34:
            return r4
        L35:
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = ".minecraft"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L49
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L48
            r4 = r0
        L48:
            return r4
        L49:
            r0 = r4
        L4a:
            if (r0 == 0) goto L63
            java.lang.String r2 = r0.getName()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L5e
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L5d
            r4 = r0
        L5d:
            return r4
        L5e:
            java.io.File r0 = r0.getParentFile()
            goto L4a
        L63:
            java.io.File r4 = getDefaultLauncherHomeFromAnyPath(r4)
            return r4
    }

    public static void initContextConstants(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            java.io.File r0 = ca.dnamobile.javalauncher.storage.StorageLocationStore.getSelectedLauncherHome(r1)
            initContextConstants(r1, r0)
            return
    }

    public static void initContextConstants(android.content.Context r4, java.io.File r5) {
            android.content.Context r4 = r4.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            java.lang.String r0 = r0.nativeLibraryDir
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB = r0
            java.io.File r0 = r4.getFilesDir()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE = r0
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L19
            goto L1b
        L19:
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
        L1b:
            java.lang.String r0 = r0.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA = r0
            java.io.File r0 = r4.getCacheDir()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r2 = "runtimes"
            r0.<init>(r1, r2)
            java.lang.String r0 = r0.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MULTIRT_HOME = r0
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME = r5
            java.io.File r5 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            java.lang.String r1 = ".minecraft"
            r5.<init>(r0, r1)
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME = r5
            java.io.File r5 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            java.lang.String r1 = "launcher_log"
            r5.<init>(r0, r1)
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_LAUNCHER_LOG = r5
            java.io.File r5 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            java.lang.String r1 = "controlmap"
            r5.<init>(r0, r1)
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CTRLMAP_PATH = r5
            java.io.File r5 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r1 = "accounts"
            r5.<init>(r0, r1)
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_ACCOUNT_NEW = r5
            java.io.File r5 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r2 = "string_cache"
            r5.<init>(r0, r2)
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE_STRING = r5
            java.io.File r5 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r2 = "addons_info_cache"
            r5.<init>(r0, r2)
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_ADDONS_INFO_CACHE = r5
            java.io.File r5 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            java.lang.String r2 = "mouse"
            r5.<init>(r0, r2)
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CUSTOM_MOUSE = r5
            java.io.File r5 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            java.lang.String r2 = "background"
            r5.<init>(r0, r2)
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_BACKGROUND = r5
            java.io.File r5 = r4.getExternalCacheDir()
            if (r5 == 0) goto Lbb
            java.io.File r5 = r4.getExternalCacheDir()
            goto Lbd
        Lbb:
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
        Lbd:
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_APP_CACHE = r5
            java.io.File r5 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r2 = "user_skin"
            r5.<init>(r0, r2)
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_USER_SKIN = r5
            java.io.File r5 = new java.io.File
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r3 = "renderer_plugins"
            r5.<init>(r0, r3)
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_INSTALLED_RENDERER_PLUGIN = r5
            java.lang.String r5 = "runtime_mod"
            r0 = 0
            java.io.File r4 = r4.getDir(r5, r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD = r4
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r0 = "profile_path.json"
            r4.<init>(r5, r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.FILE_PROFILE_PATH = r4
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CTRLMAP_PATH
            java.lang.String r0 = "default.json"
            r4.<init>(r5, r0)
            java.lang.String r4 = r4.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.FILE_CTRLDEF_FILE = r4
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r0 = "version_list.json"
            r4.<init>(r5, r0)
            java.lang.String r4 = r4.getAbsolutePath()
            ca.dnamobile.javalauncher.utils.path.PathManager.FILE_VERSION_LIST = r4
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            java.lang.String r0 = "newbie_guide.json"
            r4.<init>(r5, r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.FILE_NEWBIE_GUIDE = r4
            java.io.File r4 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r0 = "launcher_settings.json"
            r4.<init>(r5, r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.FILE_SETTINGS = r4
            createRequiredDirectories()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            r4.<init>(r5, r1)
            deleteQuietly(r4)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_DATA
            r4.<init>(r5, r2)
            deleteQuietly(r4)
            ca.dnamobile.javalauncher.utils.path.LibPath.refresh()
            return
    }

    public static boolean isPathInsideRoot(java.io.File r2, java.io.File r3) {
            r0 = 0
            java.io.File r2 = r2.getCanonicalFile()     // Catch: java.io.IOException -> L31
            java.lang.String r2 = r2.getPath()     // Catch: java.io.IOException -> L31
            java.io.File r3 = r3.getCanonicalFile()     // Catch: java.io.IOException -> L31
            java.lang.String r3 = r3.getPath()     // Catch: java.io.IOException -> L31
            boolean r1 = r2.equals(r3)     // Catch: java.io.IOException -> L31
            if (r1 != 0) goto L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L31
            r1.<init>()     // Catch: java.io.IOException -> L31
            java.lang.StringBuilder r3 = r1.append(r3)     // Catch: java.io.IOException -> L31
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> L31
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.io.IOException -> L31
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L31
            boolean r2 = r2.startsWith(r3)     // Catch: java.io.IOException -> L31
            if (r2 == 0) goto L31
        L30:
            r0 = 1
        L31:
            return r0
    }

    private static void mkdirs(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 != 0) goto L9
            r1.mkdirs()
        L9:
            return
    }
}
