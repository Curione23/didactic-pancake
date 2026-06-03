package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class MesaZinkTurnipDriver {
    public static final java.lang.String DRIVER_NAME = "Built-in Mesa Turnip / Freedreno";
    public static final java.lang.String LIB_VULKAN_ADRENO = "libvulkan_adreno.so";
    public static final java.lang.String LIB_VULKAN_FREEDRENO = "libvulkan_freedreno.so";
    public static final java.lang.String LIB_VULKAN_TURNIP = "libvulkan_turnip.so";
    private static final java.lang.String TAG = "MesaZinkTurnipDriver";
    private static final java.lang.String[] VULKAN_DRIVER_LIBRARIES = null;

    static {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "libvulkan_freedreno.so"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "libvulkan_turnip.so"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "libvulkan_adreno.so"
            r0[r1] = r2
            ca.dnamobile.javalauncher.renderer.MesaZinkTurnipDriver.VULKAN_DRIVER_LIBRARIES = r0
            return
    }

    private MesaZinkTurnipDriver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyEnvironment(android.content.Context r7, java.util.LinkedHashMap<java.lang.String, java.lang.String> r8) {
            java.io.File r0 = findVulkanLibrary(r7)
            if (r0 == 0) goto Lb
            java.io.File r7 = r0.getParentFile()
            goto Lf
        Lb:
            java.io.File r7 = findNativeLibraryDir(r7)
        Lf:
            java.lang.String r1 = "JAVA_LAUNCHER_VULKAN_DRIVER"
            java.lang.String r2 = "Built-in Mesa Turnip / Freedreno"
            r8.put(r1, r2)
            java.lang.String r1 = "POJAV_USE_SYSTEM_VULKAN"
            java.lang.String r2 = "0"
            r8.put(r1, r2)
            java.lang.String r1 = "POJAV_LOAD_TURNIP"
            java.lang.String r2 = "1"
            r8.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_LOAD_TURNIP"
            r8.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r8.put(r1, r2)
            if (r7 == 0) goto L48
            boolean r1 = r7.isDirectory()
            if (r1 == 0) goto L48
            java.lang.String r1 = "DRIVER_PATH"
            java.lang.String r2 = r7.getAbsolutePath()
            r8.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_TURNIP_DRIVER_DIR"
            java.lang.String r2 = r7.getAbsolutePath()
            r8.put(r1, r2)
        L48:
            java.lang.String r1 = "MesaZinkTurnipDriver"
            java.lang.String r2 = "DROIDBRIDGE_TURNIP_DRIVER_LIBRARY"
            java.lang.String r3 = "POJAV_CUSTOM_VULKAN_DRIVER"
            java.lang.String r4 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            java.lang.String r5 = ""
            if (r0 == 0) goto L86
            boolean r6 = r0.isFile()
            if (r6 == 0) goto L86
            java.lang.String r7 = r0.getAbsolutePath()
            r8.put(r4, r7)
            java.lang.String r7 = r0.getAbsolutePath()
            r8.put(r3, r7)
            java.lang.String r7 = r0.getAbsolutePath()
            r8.put(r2, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Using bundled Turnip/Freedreno Vulkan driver: "
            r7.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            goto Laa
        L86:
            r8.put(r4, r5)
            r8.put(r3, r5)
            r8.put(r2, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Bundled Turnip/Freedreno Vulkan driver was not found; DRIVER_PATH="
            r0.<init>(r2)
            if (r7 == 0) goto L9d
            java.lang.String r7 = r7.getAbsolutePath()
            goto L9f
        L9d:
            java.lang.String r7 = "<missing>"
        L9f:
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
        Laa:
            java.lang.String r7 = "VK_ICD_FILENAMES"
            r8.put(r7, r5)
            java.lang.String r7 = "VK_DRIVER_FILES"
            r8.put(r7, r5)
            java.lang.String r7 = "VK_INSTANCE_LAYERS"
            r8.put(r7, r5)
            return
    }

    public static ca.dnamobile.javalauncher.renderer.Driver createDriverIfAvailable(android.content.Context r7) {
            java.io.File r5 = findVulkanLibrary(r7)
            r0 = 0
            if (r5 == 0) goto L2a
            boolean r1 = r5.isFile()
            if (r1 != 0) goto Le
            goto L2a
        Le:
            java.io.File r4 = r5.getParentFile()
            if (r4 == 0) goto L2a
            boolean r1 = r4.isDirectory()
            if (r1 != 0) goto L1b
            goto L2a
        L1b:
            ca.dnamobile.javalauncher.renderer.Driver r6 = new ca.dnamobile.javalauncher.renderer.Driver
            ca.dnamobile.javalauncher.renderer.Driver$Type r2 = ca.dnamobile.javalauncher.renderer.Driver.Type.TURNIP
            java.lang.String r3 = r7.getPackageName()
            java.lang.String r1 = "Built-in Mesa Turnip / Freedreno"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L2a:
            return r0
    }

    public static java.io.File findNativeLibraryDir(android.content.Context r2) {
            java.io.File r0 = findVulkanLibrary(r2)
            if (r0 == 0) goto L11
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L11
            java.io.File r2 = r0.getParentFile()
            return r2
        L11:
            r0 = 0
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L1f
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.nativeLibraryDir     // Catch: java.lang.Throwable -> L38
            goto L20
        L1f:
            r2 = r0
        L20:
            if (r2 == 0) goto L38
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L38
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L38
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L38
            return r1
        L38:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r2 == 0) goto L56
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L56
            java.io.File r2 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r2.<init>(r1)
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L56
            return r2
        L56:
            return r0
    }

    public static java.io.File findVulkanLibrary(android.content.Context r1) {
            java.io.File r1 = findVulkanLibraryInApplicationNativeDir(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r1 == 0) goto L25
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L25
            java.io.File r1 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r1.<init>(r0)
            java.io.File r1 = findVulkanLibraryInDir(r1)
            if (r1 == 0) goto L25
            return r1
        L25:
            r1 = 0
            return r1
    }

    private static java.io.File findVulkanLibraryInApplicationNativeDir(android.content.Context r2) {
            r0 = 0
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto Le
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r2.nativeLibraryDir     // Catch: java.lang.Throwable -> L26
            goto Lf
        Le:
            r2 = r0
        Lf:
            if (r2 == 0) goto L26
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1c
            goto L26
        L1c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.io.File r2 = findVulkanLibraryInDir(r1)     // Catch: java.lang.Throwable -> L26
            return r2
        L26:
            return r0
    }

    private static java.io.File findVulkanLibraryInDir(java.io.File r6) {
            r0 = 0
            if (r6 == 0) goto L21
            boolean r1 = r6.isDirectory()
            if (r1 != 0) goto La
            goto L21
        La:
            java.lang.String[] r1 = ca.dnamobile.javalauncher.renderer.MesaZinkTurnipDriver.VULKAN_DRIVER_LIBRARIES
            int r2 = r1.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L21
            r4 = r1[r3]
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r4)
            boolean r4 = r5.isFile()
            if (r4 == 0) goto L1e
            return r5
        L1e:
            int r3 = r3 + 1
            goto Le
        L21:
            return r0
    }

    public static boolean isAvailable(android.content.Context r0) {
            java.io.File r0 = findVulkanLibrary(r0)
            if (r0 == 0) goto Le
            boolean r0 = r0.isFile()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
