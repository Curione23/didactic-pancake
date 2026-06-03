package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class DriverPluginManager {
    public static final java.lang.String DEFAULT_MESA_DRIVER = "Default Mesa driver";
    private static final java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> DRIVERS = null;
    private static final java.lang.String[] KNOWN_DRIVER_PLUGIN_PACKAGES = null;
    public static final java.lang.String SYSTEM_VULKAN_DRIVER = "System Vulkan driver";
    private static final java.lang.String TAG = "DriverPluginManager";
    private static final java.lang.String[] VULKAN_LIBRARY_NAMES = null;
    private static boolean initialized;

    static {
            r0 = 13
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "com.fcl.plugin.driver.freedreno"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "com.fcl.plugin.driver.turnip"
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "com.fcl.plugin.turnip"
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "com.fcl.plugin.adreno"
            r5 = 3
            r0[r5] = r1
            r1 = 4
            java.lang.String r6 = "com.mio.plugin.driver.freedreno"
            r0[r1] = r6
            r1 = 5
            java.lang.String r6 = "com.mio.plugin.driver.turnip"
            r0[r1] = r6
            r1 = 6
            java.lang.String r6 = "com.mio.plugin.driver.adreno"
            r0[r1] = r6
            r1 = 7
            java.lang.String r6 = "com.bzlzhh.plugin.driver.freedreno"
            r0[r1] = r6
            r1 = 8
            java.lang.String r6 = "com.bzlzhh.plugin.driver.turnip"
            r0[r1] = r6
            r1 = 9
            java.lang.String r6 = "com.bzlzhh.plugin.turnip"
            r0[r1] = r6
            r1 = 10
            java.lang.String r6 = "com.bzlzhh.plugin.adreno"
            r0[r1] = r6
            r1 = 11
            java.lang.String r6 = "com.tungsten.fcl.plugin.driver.freedreno"
            r0[r1] = r6
            r1 = 12
            java.lang.String r6 = "com.tungsten.fcl.plugin.driver.turnip"
            r0[r1] = r6
            ca.dnamobile.javalauncher.renderer.DriverPluginManager.KNOWN_DRIVER_PLUGIN_PACKAGES = r0
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r1 = "libvulkan_freedreno.so"
            r0[r2] = r1
            java.lang.String r1 = "libvulkan_turnip.so"
            r0[r3] = r1
            java.lang.String r1 = "libvulkan_adreno.so"
            r0[r4] = r1
            ca.dnamobile.javalauncher.renderer.DriverPluginManager.VULKAN_LIBRARY_NAMES = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS = r0
            return
    }

    private DriverPluginManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addBuiltInTurnipIfAvailable(android.content.Context r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()
            java.lang.String r1 = r1.nativeLibraryDir
            if (r1 == 0) goto L1b
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            java.lang.String r7 = r7.nativeLibraryDir
            r1.<init>(r7)
            addDirIfValid(r0, r1)
        L1b:
            java.lang.String r7 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r7 == 0) goto L29
            java.io.File r7 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r7.<init>(r1)
            addDirIfValid(r0, r7)
        L29:
            java.util.Iterator r7 = r0.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r7.next()
            r5 = r0
            java.io.File r5 = (java.io.File) r5
            java.io.File r6 = findVulkanLibrary(r5)
            if (r6 == 0) goto L2d
            ca.dnamobile.javalauncher.renderer.Driver r7 = new ca.dnamobile.javalauncher.renderer.Driver
            ca.dnamobile.javalauncher.renderer.Driver$Type r3 = ca.dnamobile.javalauncher.renderer.Driver.Type.TURNIP
            r4 = 0
            java.lang.String r2 = "Bundled Turnip/Freedreno"
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            addDriver(r7)
        L4e:
            return
    }

    private static void addDirIfValid(java.util.ArrayList<java.io.File> r1, java.io.File r2) {
            if (r2 == 0) goto L11
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L11
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L11
            r1.add(r2)
        L11:
            return
    }

    private static void addDriver(ca.dnamobile.javalauncher.renderer.Driver r3) {
            r0 = 0
        L1:
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS
            int r2 = r1.size()
            if (r0 >= r2) goto L19
            java.lang.Object r1 = r1.get(r0)
            ca.dnamobile.javalauncher.renderer.Driver r1 = (ca.dnamobile.javalauncher.renderer.Driver) r1
            boolean r1 = sameDriver(r1, r3)
            if (r1 == 0) goto L16
            return
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r1.add(r3)
            return
    }

    private static void applyDirectFreedrenoKgslEnvironment(java.util.LinkedHashMap<java.lang.String, java.lang.String> r5) {
            java.lang.String r0 = "DROIDBRIDGE_MESA"
            java.lang.String r1 = "1"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_MODE"
            java.lang.String r2 = "freedreno_kgsl"
            r5.put(r0, r2)
            java.lang.String r0 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DRIVER"
            java.lang.String r3 = "kgsl"
            r5.put(r0, r3)
            java.lang.String r0 = "DROIDBRIDGE_MOJO_MESA_V61"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_AAR_SINGLE_SOURCE"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MOJO_MESA_AAR_V72"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAV_RENDERER"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAV_RENDERER_MESA_MODE"
            r5.put(r0, r2)
            java.lang.String r0 = "MESA_LOADER_DRIVER_OVERRIDE"
            r5.put(r0, r3)
            java.lang.String r0 = "GALLIUM_DRIVER"
            java.lang.String r2 = ""
            r5.put(r0, r2)
            java.lang.String r0 = "EGL_PLATFORM"
            java.lang.String r3 = "android"
            r5.put(r0, r3)
            java.lang.String r0 = "FORCE_VSYNC"
            java.lang.String r3 = "false"
            r5.put(r0, r3)
            java.lang.String r0 = "LIBGL_ES"
            java.lang.String r4 = "2"
            r5.put(r0, r4)
            java.lang.String r0 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r4 = "3.3COMPAT"
            r5.put(r0, r4)
            java.lang.String r0 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r4 = "330"
            r5.put(r0, r4)
            java.lang.String r0 = "MESA_GLSL_CACHE_DISABLE"
            r5.put(r0, r3)
            java.lang.String r0 = "MESA_SHADER_CACHE_DISABLE"
            r5.put(r0, r3)
            java.lang.String r0 = "LIBGL_MIPMAP"
            java.lang.String r3 = "3"
            r5.put(r0, r3)
            java.lang.String r0 = "LIBGL_NOINTOVLHACK"
            r5.put(r0, r1)
            java.lang.String r0 = "LIBGL_NORMALIZE"
            r5.put(r0, r1)
            java.lang.String r0 = "LIBGL_NOERROR"
            java.lang.String r3 = "0"
            r5.put(r0, r3)
            java.lang.String r0 = "allow_higher_compat_version"
            java.lang.String r3 = "true"
            r5.put(r0, r3)
            java.lang.String r0 = "force_glsl_extensions_warn"
            r5.put(r0, r3)
            java.lang.String r0 = "allow_glsl_extension_directive_midshader"
            r5.put(r0, r3)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAVEXEC_EGL"
            java.lang.String r1 = "libEGL_mesa.so"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAV_EGL_LIBRARY"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAVEXEC_EGL_LIBRARY"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAV_RENDERER_LIBRARY"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAVEXEC_RENDERER"
            r5.put(r0, r1)
            java.lang.String r0 = "LIB_MESA_NAME"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAV_USE_SYSTEM_VULKAN"
            r5.put(r0, r2)
            java.lang.String r0 = "DRIVER_PATH"
            r5.put(r0, r2)
            java.lang.String r0 = "VK_ICD_FILENAMES"
            r5.put(r0, r2)
            java.lang.String r0 = "VK_DRIVER_FILES"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAV_LOAD_TURNIP"
            r5.put(r0, r2)
            java.lang.String r0 = "DROIDBRIDGE_LOAD_TURNIP"
            r5.put(r0, r2)
            java.lang.String r0 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r5.put(r0, r2)
            java.lang.String r0 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAV_CUSTOM_VULKAN_DRIVER"
            r5.put(r0, r2)
            java.lang.String r0 = "ZINK_DEBUG"
            r5.put(r0, r2)
            java.lang.String r0 = "ZINK_DESCRIPTORS"
            r5.put(r0, r2)
            java.lang.String r0 = "OSMESA_LIB"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAV_OSMESA_LIBRARY"
            r5.put(r0, r2)
            java.lang.String r0 = "OSMESA_LIBRARY"
            r5.put(r0, r2)
            java.lang.String r0 = "LIBGL_OSMESA"
            r5.put(r0, r2)
            return
    }

    private static void applyGlobalVulkanDriverEnvironment(android.content.Context r7, java.util.LinkedHashMap<java.lang.String, java.lang.String> r8, ca.dnamobile.javalauncher.renderer.Driver r9, boolean r10, boolean r11) {
            java.lang.String r0 = "VK_DRIVER_FILES"
            java.lang.String r1 = "VK_ICD_FILENAMES"
            java.lang.String r2 = "1"
            java.lang.String r3 = "POJAV_USE_SYSTEM_VULKAN"
            java.lang.String r4 = "DRIVER_PATH"
            java.lang.String r5 = ""
            if (r11 == 0) goto L1b
            r8.put(r3, r2)
            r8.put(r4, r5)
            r8.put(r1, r5)
            r8.put(r0, r5)
            return
        L1b:
            java.lang.String r11 = "0"
            r8.put(r3, r11)
            ca.dnamobile.javalauncher.renderer.Driver$Type r11 = r9.getType()
            ca.dnamobile.javalauncher.renderer.Driver$Type r6 = ca.dnamobile.javalauncher.renderer.Driver.Type.TURNIP
            if (r11 != r6) goto L2c
            applyTurnipDriverEnvironment(r7, r8, r9)
            return
        L2c:
            if (r10 == 0) goto L49
            java.io.File r7 = findBundledDriverDir(r7)
            if (r7 == 0) goto L42
            boolean r9 = r7.isDirectory()
            if (r9 == 0) goto L42
            java.lang.String r7 = r7.getAbsolutePath()
            r8.put(r4, r7)
            goto L52
        L42:
            r8.put(r3, r2)
            r8.put(r4, r5)
            goto L52
        L49:
            r8.put(r4, r5)
            r8.put(r1, r5)
            r8.put(r0, r5)
        L52:
            return
    }

    private static void applyTurnipDriverEnvironment(android.content.Context r2, java.util.LinkedHashMap<java.lang.String, java.lang.String> r3, ca.dnamobile.javalauncher.renderer.Driver r4) {
            java.io.File r0 = r4.getNativeLibraryDir()
            if (r0 == 0) goto L15
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L15
            java.lang.String r1 = "DRIVER_PATH"
            java.lang.String r0 = r0.getAbsolutePath()
            r3.put(r1, r0)
        L15:
            java.io.File r2 = buildIcdFile(r2, r4)
            java.lang.String r4 = "VK_DRIVER_FILES"
            java.lang.String r0 = "VK_ICD_FILENAMES"
            if (r2 == 0) goto L34
            boolean r1 = r2.isFile()
            if (r1 == 0) goto L34
            java.lang.String r1 = r2.getAbsolutePath()
            r3.put(r0, r1)
            java.lang.String r2 = r2.getAbsolutePath()
            r3.put(r4, r2)
            goto L3c
        L34:
            java.lang.String r2 = ""
            r3.put(r0, r2)
            r3.put(r4, r2)
        L3c:
            return
    }

    private static void applyZinkMesaEnvironment(java.util.LinkedHashMap<java.lang.String, java.lang.String> r3) {
            java.lang.String r0 = "POJAV_RENDERER"
            java.lang.String r1 = "vulkan_zink"
            r3.put(r0, r1)
            java.lang.String r0 = "POJAVEXEC_EGL"
            java.lang.String r1 = "libOSMesa_8.so"
            r3.put(r0, r1)
            java.lang.String r0 = "POJAV_EGL_LIBRARY"
            r3.put(r0, r1)
            java.lang.String r0 = "POJAVEXEC_EGL_LIBRARY"
            r3.put(r0, r1)
            java.lang.String r0 = "POJAV_RENDERER_LIBRARY"
            r3.put(r0, r1)
            java.lang.String r0 = "POJAVEXEC_RENDERER"
            r3.put(r0, r1)
            java.lang.String r0 = "LIB_MESA_NAME"
            r3.put(r0, r1)
            java.lang.String r0 = "OSMESA_LIB"
            r3.put(r0, r1)
            java.lang.String r0 = "POJAV_OSMESA_LIBRARY"
            r3.put(r0, r1)
            java.lang.String r0 = "OSMESA_LIBRARY"
            r3.put(r0, r1)
            java.lang.String r0 = "LIBGL_OSMESA"
            r3.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_ZINK_V57_FORCE_OSMESA_EGL"
            java.lang.String r1 = "1"
            r3.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_ZINK_V61_CLEAN_ZINK"
            r3.put(r0, r1)
            java.lang.String r0 = "MESA_LOADER_DRIVER_OVERRIDE"
            java.lang.String r2 = "zink"
            r3.put(r0, r2)
            java.lang.String r0 = "GALLIUM_DRIVER"
            r3.put(r0, r2)
            java.lang.String r0 = "LIBGL_ES"
            java.lang.String r2 = "3"
            r3.put(r0, r2)
            java.lang.String r0 = "LIBGL_NOERROR"
            r3.put(r0, r1)
            java.lang.String r0 = "LIBGL_NORMALIZE"
            r3.put(r0, r1)
            java.lang.String r0 = "LIBGL_MIPMAP"
            r3.put(r0, r2)
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "MESA_GLSL_CACHE_DIR"
            r3.put(r1, r0)
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "MESA_SHADER_CACHE_DIR"
            r3.put(r1, r0)
            java.lang.String r0 = "MESA_VK_WSI_PRESENT_MODE"
            java.lang.String r1 = "mailbox"
            r3.put(r0, r1)
            return
    }

    public static java.util.Map<java.lang.String, java.lang.String> buildEnvironment(android.content.Context r7, ca.dnamobile.javalauncher.renderer.RendererInterface r8) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = isVulkanZinkRenderer(r8)
            boolean r2 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseSystemVulkanDriver(r7)
            ca.dnamobile.javalauncher.renderer.Driver r3 = getSelectedDriver(r7)
            java.lang.String r4 = "1"
            if (r2 == 0) goto L17
            r5 = r4
            goto L19
        L17:
            java.lang.String r5 = "0"
        L19:
            java.lang.String r6 = "JAVA_LAUNCHER_USE_SYSTEM_VULKAN_DRIVER"
            r0.put(r6, r5)
            if (r2 == 0) goto L23
            java.lang.String r5 = "System Vulkan driver"
            goto L27
        L23:
            java.lang.String r5 = r3.getName()
        L27:
            java.lang.String r6 = "JAVA_LAUNCHER_VULKAN_DRIVER"
            r0.put(r6, r5)
            if (r1 != 0) goto L59
            java.lang.String r7 = "POJAV_USE_SYSTEM_VULKAN"
            r0.put(r7, r4)
            java.lang.String r7 = "DRIVER_PATH"
            java.lang.String r8 = ""
            r0.put(r7, r8)
            java.lang.String r7 = "VK_ICD_FILENAMES"
            r0.put(r7, r8)
            java.lang.String r7 = "VK_DRIVER_FILES"
            r0.put(r7, r8)
            java.lang.String r7 = "LIBGL_DRIVERS_PATH"
            r0.put(r7, r8)
            java.lang.String r7 = "EGL_DRIVERS_PATH"
            r0.put(r7, r8)
            java.lang.String r7 = "MESA_LOADER_DRIVER_OVERRIDE"
            r0.put(r7, r8)
            java.lang.String r7 = "GALLIUM_DRIVER"
            r0.put(r7, r8)
            return r0
        L59:
            r1 = 1
            applyGlobalVulkanDriverEnvironment(r7, r0, r3, r1, r2)
            applyZinkMesaEnvironment(r0)
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.applyZinkSurfaceWorkaround(r8)
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.applyZinkTurnipEnvironment(r7, r8, r0)
            return r0
    }

    private static java.io.File buildIcdFile(android.content.Context r5, ca.dnamobile.javalauncher.renderer.Driver r6) {
            java.io.File r5 = r6.getVulkanLibrary()
            r0 = 0
            if (r5 == 0) goto Lb4
            boolean r1 = r5.isFile()
            if (r1 != 0) goto Lf
            goto Lb4
        Lf:
            java.io.File r1 = new java.io.File
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r3 = "vulkan_icd"
            r1.<init>(r2, r3)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L25
            boolean r2 = r1.mkdirs()
            if (r2 != 0) goto L25
            return r0
        L25:
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r2 = r6.getPackageName()
            if (r2 == 0) goto L34
            java.lang.String r2 = r6.getPackageName()
            goto L38
        L34:
            java.lang.String r2 = r6.getName()
        L38:
            java.lang.String r3 = "[^A-Za-z0-9_.-]"
            java.lang.String r4 = "_"
            java.lang.String r2 = r2.replaceAll(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ".json"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = "library_path"
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = "api_version"
            java.lang.String r4 = "1.3.0"
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = "file_format_version"
            java.lang.String r4 = "1.0.0"
            r1.put(r5, r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = "ICD"
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L9b
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9b
            r2 = 0
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L91
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L91
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L91
            r5.write(r1)     // Catch: java.lang.Throwable -> L91
            r5.close()     // Catch: java.lang.Throwable -> L9b
            return r3
        L91:
            r1 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L96
            goto L9a
        L96:
            r5 = move-exception
            r1.addSuppressed(r5)     // Catch: java.lang.Throwable -> L9b
        L9a:
            throw r1     // Catch: java.lang.Throwable -> L9b
        L9b:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to write Vulkan ICD for "
            r1.<init>(r2)
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "DriverPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r6, r5)
        Lb4:
            return r0
    }

    private static void discoverInstalledDriverPlugins(android.content.Context r5) {
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String[] r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.KNOWN_DRIVER_PLUGIN_PACKAGES
            int r2 = r1.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L18
            r4 = r1[r3]
            android.content.pm.PackageInfo r4 = getPackageInfo(r0, r4)     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L15
            parsePluginPackage(r5, r4)     // Catch: java.lang.Throwable -> L15
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L51
            r2 = 33
            r3 = 128(0x80, float:1.8E-43)
            if (r1 < r2) goto L2a
            long r1 = (long) r3     // Catch: java.lang.Throwable -> L51
            android.content.pm.PackageManager$ApplicationInfoFlags r1 = android.content.pm.PackageManager.ApplicationInfoFlags.of(r1)     // Catch: java.lang.Throwable -> L51
            java.util.List r1 = r0.getInstalledApplications(r1)     // Catch: java.lang.Throwable -> L51
            goto L2e
        L2a:
            java.util.List r1 = r0.getInstalledApplications(r3)     // Catch: java.lang.Throwable -> L51
        L2e:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
        L32:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L66
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L51
            android.content.pm.ApplicationInfo r2 = (android.content.pm.ApplicationInfo) r2     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L32
            java.lang.String r3 = r2.packageName     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L45
            goto L32
        L45:
            java.lang.String r2 = r2.packageName     // Catch: java.lang.Throwable -> L51
            android.content.pm.PackageInfo r2 = getPackageInfo(r0, r2)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L32
            parsePluginPackage(r5, r2)     // Catch: java.lang.Throwable -> L51
            goto L32
        L51:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Installed driver plugin scan was limited by Android package visibility: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "DriverPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)
        L66:
            return
    }

    private static java.io.File findBundledDriverDir(android.content.Context r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()
            java.lang.String r1 = r1.nativeLibraryDir
            if (r1 == 0) goto L1b
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.nativeLibraryDir
            r1.<init>(r2)
            addDirIfValid(r0, r1)
        L1b:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r2 == 0) goto L29
            java.io.File r2 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r2.<init>(r1)
            addDirIfValid(r0, r2)
        L29:
            java.util.Iterator r2 = r0.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            java.io.File r1 = findVulkanLibrary(r0)
            if (r1 == 0) goto L2d
            return r0
        L40:
            r2 = 0
            return r2
    }

    private static java.io.File findVulkanLibrary(java.io.File r5) {
            java.lang.String[] r0 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.VULKAN_LIBRARY_NAMES
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            java.io.File r4 = new java.io.File
            r4.<init>(r5, r3)
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L14
            return r4
        L14:
            int r2 = r2 + 1
            goto L4
        L17:
            r5 = 0
            return r5
    }

    public static synchronized java.util.List<ca.dnamobile.javalauncher.renderer.Driver> getDrivers(android.content.Context r2) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.DriverPluginManager> r0 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.class
            monitor-enter(r0)
            init(r2)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private static android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager r4, java.lang.String r5) {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L17
            r1 = 33
            r2 = 128(0x80, double:6.3E-322)
            if (r0 < r1) goto L11
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r2)     // Catch: java.lang.Throwable -> L17
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r0)     // Catch: java.lang.Throwable -> L17
            return r4
        L11:
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L17
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r0)     // Catch: java.lang.Throwable -> L17
            return r4
        L17:
            r4 = 0
            return r4
    }

    public static synchronized ca.dnamobile.javalauncher.renderer.Driver getSelectedDriver(android.content.Context r4) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.DriverPluginManager> r0 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.class
            monitor-enter(r0)
            init(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getSelectedVulkanDriverName(r4)     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS     // Catch: java.lang.Throwable -> L36
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L36
            int r1 = r1 + (-1)
        L12:
            if (r1 < 0) goto L2b
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r2 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L36
            ca.dnamobile.javalauncher.renderer.Driver r2 = (ca.dnamobile.javalauncher.renderer.Driver) r2     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L36
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L28
            monitor-exit(r0)
            return r2
        L28:
            int r1 = r1 + (-1)
            goto L12
        L2b:
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r4 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS     // Catch: java.lang.Throwable -> L36
            r1 = 0
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L36
            ca.dnamobile.javalauncher.renderer.Driver r4 = (ca.dnamobile.javalauncher.renderer.Driver) r4     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            return r4
        L36:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r4
    }

    public static java.util.List<java.io.File> getSelectedDriverLibrarySearchPaths(android.content.Context r3, ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r4 = isVulkanZinkRenderer(r4)
            if (r4 != 0) goto Lc
            return r0
        Lc:
            boolean r4 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseSystemVulkanDriver(r3)
            if (r4 == 0) goto L13
            return r0
        L13:
            ca.dnamobile.javalauncher.renderer.Driver r4 = getSelectedDriver(r3)
            ca.dnamobile.javalauncher.renderer.Driver$Type r1 = r4.getType()
            ca.dnamobile.javalauncher.renderer.Driver$Type r2 = ca.dnamobile.javalauncher.renderer.Driver.Type.TURNIP
            if (r1 != r2) goto L24
            java.io.File r3 = r4.getNativeLibraryDir()
            goto L28
        L24:
            java.io.File r3 = findBundledDriverDir(r3)
        L28:
            if (r3 == 0) goto L33
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L33
            r0.add(r3)
        L33:
            return r0
    }

    public static synchronized int indexOfDriver(android.content.Context r5, java.lang.String r6) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.DriverPluginManager> r0 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.class
            monitor-enter(r0)
            init(r5)     // Catch: java.lang.Throwable -> L54
            ca.dnamobile.javalauncher.renderer.Driver r5 = getSelectedDriver(r5)     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto Ld
            goto L11
        Ld:
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L54
        L11:
            r1 = 0
            r2 = r1
        L13:
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r3 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS     // Catch: java.lang.Throwable -> L54
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L54
            if (r2 >= r4) goto L30
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L54
            ca.dnamobile.javalauncher.renderer.Driver r3 = (ca.dnamobile.javalauncher.renderer.Driver) r3     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L54
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L2d
            monitor-exit(r0)
            return r2
        L2d:
            int r2 = r2 + 1
            goto L13
        L30:
            r6 = r1
        L31:
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r2 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS     // Catch: java.lang.Throwable -> L54
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L54
            if (r6 >= r3) goto L52
            java.lang.String r3 = r5.getName()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L54
            ca.dnamobile.javalauncher.renderer.Driver r2 = (ca.dnamobile.javalauncher.renderer.Driver) r2     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L54
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L4f
            monitor-exit(r0)
            return r6
        L4f:
            int r6 = r6 + 1
            goto L31
        L52:
            monitor-exit(r0)
            return r1
        L54:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r5
    }

    public static synchronized void init(android.content.Context r8) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.DriverPluginManager> r0 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.class
            monitor-enter(r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r8)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.initialized     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = 1
            ca.dnamobile.javalauncher.renderer.DriverPluginManager.initialized = r1     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.Driver> r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.DRIVERS     // Catch: java.lang.Throwable -> L2c
            r1.clear()     // Catch: java.lang.Throwable -> L2c
            ca.dnamobile.javalauncher.renderer.Driver r1 = new ca.dnamobile.javalauncher.renderer.Driver     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Default Mesa driver"
            ca.dnamobile.javalauncher.renderer.Driver$Type r4 = ca.dnamobile.javalauncher.renderer.Driver.Type.DEFAULT_MESA     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2c
            addDriver(r1)     // Catch: java.lang.Throwable -> L2c
            addBuiltInTurnipIfAvailable(r8)     // Catch: java.lang.Throwable -> L2c
            discoverInstalledDriverPlugins(r8)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)
            return
        L2c:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r8
    }

    public static boolean isVulkanZinkRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getRendererId()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.getRendererLibrary()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "vulkan_zink"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L53
            java.lang.String r2 = "zink"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L53
            java.lang.String r2 = "osmesa"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L53
            boolean r4 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isMesaZinkTurnipRenderer(r4)
            if (r4 == 0) goto L54
        L53:
            r0 = 1
        L54:
            return r0
    }

    private static void parsePluginPackage(android.content.Context r13, android.content.pm.PackageInfo r14) {
            android.content.pm.ApplicationInfo r14 = r14.applicationInfo
            if (r14 == 0) goto Lac
            java.lang.String r0 = r14.packageName
            if (r0 != 0) goto La
            goto Lac
        La:
            int r0 = r14.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L11
            return
        L11:
            java.lang.String r0 = r14.packageName
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
            android.os.Bundle r2 = r14.metaData
            r3 = 0
            if (r2 == 0) goto L28
            java.lang.String r4 = "fclPlugin"
            boolean r4 = r2.getBoolean(r4, r3)
            if (r4 == 0) goto L28
            r4 = r1
            goto L29
        L28:
            r4 = r3
        L29:
            java.lang.String r5 = "driver"
            r6 = 0
            if (r2 == 0) goto L33
            java.lang.String r2 = r2.getString(r5)
            goto L34
        L33:
            r2 = r6
        L34:
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L54
            java.lang.String r5 = "turnip"
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L54
            java.lang.String r5 = "freedreno"
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L54
            java.lang.String r5 = "adreno"
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r3
        L54:
            java.lang.String r0 = r14.nativeLibraryDir
            if (r0 == 0) goto L61
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r14.nativeLibraryDir
            r0.<init>(r3)
            r11 = r0
            goto L62
        L61:
            r11 = r6
        L62:
            if (r11 == 0) goto L68
            java.io.File r6 = findVulkanLibrary(r11)
        L68:
            r12 = r6
            if (r12 != 0) goto L6c
            return
        L6c:
            if (r4 != 0) goto L71
            if (r1 != 0) goto L71
            return
        L71:
            if (r11 == 0) goto Lac
            boolean r0 = r11.isDirectory()
            if (r0 != 0) goto L7a
            goto Lac
        L7a:
            if (r2 == 0) goto L89
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L87
            goto L89
        L87:
            r8 = r2
            goto L9f
        L89:
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: java.lang.Throwable -> L9c
            java.lang.CharSequence r13 = r13.getApplicationLabel(r14)     // Catch: java.lang.Throwable -> L9c
            if (r13 == 0) goto L98
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L9c
            goto L9a
        L98:
            java.lang.String r13 = r14.packageName     // Catch: java.lang.Throwable -> L9c
        L9a:
            r2 = r13
            goto L87
        L9c:
            java.lang.String r2 = r14.packageName
            goto L87
        L9f:
            ca.dnamobile.javalauncher.renderer.Driver r13 = new ca.dnamobile.javalauncher.renderer.Driver
            ca.dnamobile.javalauncher.renderer.Driver$Type r9 = ca.dnamobile.javalauncher.renderer.Driver.Type.TURNIP
            java.lang.String r10 = r14.packageName
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            addDriver(r13)
        Lac:
            return
    }

    public static synchronized void reload(android.content.Context r2) {
            java.lang.Class<ca.dnamobile.javalauncher.renderer.DriverPluginManager> r0 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.class
            monitor-enter(r0)
            r1 = 0
            ca.dnamobile.javalauncher.renderer.DriverPluginManager.initialized = r1     // Catch: java.lang.Throwable -> Lb
            init(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    private static boolean sameDriver(ca.dnamobile.javalauncher.renderer.Driver r3, ca.dnamobile.javalauncher.renderer.Driver r4) {
            java.lang.String r0 = r3.getPackageName()
            r1 = 1
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r2 = r4.getPackageName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            return r1
        L16:
            java.io.File r3 = r3.getVulkanLibrary()
            java.io.File r4 = r4.getVulkanLibrary()
            if (r3 == 0) goto L31
            if (r4 == 0) goto L31
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r4 = r4.getAbsolutePath()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            return r1
    }
}
