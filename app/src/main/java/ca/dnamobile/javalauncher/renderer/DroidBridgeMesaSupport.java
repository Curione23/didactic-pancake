package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeMesaSupport {
    public static final java.lang.String LEGACY_FREEDRENO_RENDERER_UUID = "1ad7249f-5784-4f00-bc72-174b3578ee46";
    public static final java.lang.String LIB_CUTILS = "libcutils.so";
    public static final java.lang.String LIB_DRM = "libdrm.so";
    public static final java.lang.String LIB_EGL_MESA = "libEGL_mesa.so";
    public static final java.lang.String LIB_GALLIUM_DRI = "libgallium_dri.so";
    public static final java.lang.String LIB_GBM = "libgbm.so";
    public static final java.lang.String LIB_GL = "libGL.so";
    public static final java.lang.String LIB_GLAPI = "libglapi.so";
    public static final java.lang.String LIB_HARDWARE = "libhardware.so";
    private static final java.lang.String[] OPTIONAL_MESA_DEPS = null;
    public static final java.lang.String RENDERER_ID_FREEDRENO = "freedreno_kgsl";
    public static final java.lang.String RENDERER_ID_FREEDRENO_KGSL = "freedreno_kgsl";
    public static final java.lang.String RENDERER_ID_ZINK_TURNIP = "vulkan_zink";
    private static final java.lang.String TAG = "DroidBridgeMesa";
    private static volatile boolean sForceNativeSurfaceRgba8888;

    static {
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "liblog.so"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "libcutils.so"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "libsync.so"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "libutils.so"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "libhardware.so"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "libnativewindow.so"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "libglapi.so"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "libgbm.so"
            r0[r1] = r2
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.OPTIONAL_MESA_DEPS = r0
            return
    }

    private DroidBridgeMesaSupport() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addSearchPath(java.util.ArrayList<java.lang.String> r2, java.io.File r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L49
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L18
            goto L49
        L18:
            boolean r3 = r3.exists()
            if (r3 != 0) goto L46
            java.lang.String r3 = "/vendor/"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L46
            java.lang.String r3 = "/system"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L46
            java.lang.String r3 = "/odm/"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L46
            java.lang.String r3 = "/product/"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L46
            java.lang.String r3 = "/apex/"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L49
        L46:
            r2.add(r0)
        L49:
            return
    }

    public static void applyEnvironment(android.content.Context r12, ca.dnamobile.javalauncher.renderer.RendererInterface r13, java.util.LinkedHashMap<java.lang.String, java.lang.String> r14) {
            boolean r0 = isNativeGlfwKgslRenderer(r13)
            if (r0 == 0) goto La
            applyNativeGlfwKgslEnvironment(r12, r13, r14)
            return
        La:
            r0 = 1
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.sForceNativeSurfaceRgba8888 = r0
            java.io.File r0 = resolveMesaNativeDir(r12)
            java.io.File r12 = prepareMesaLibraryAliases(r12, r13)
            java.io.File r13 = new java.io.File
            java.lang.String r1 = "libEGL_mesa.so"
            r13.<init>(r0, r1)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "libvulkan_freedreno.so"
            r2.<init>(r0, r3)
            java.io.File r2 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r4 = "mesa"
            r2.<init>(r3, r4)
            r2.mkdirs()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = java.io.File.pathSeparator
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r12.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "DROIDBRIDGE_MESA"
            java.lang.String r5 = "1"
            r14.put(r4, r5)
            java.lang.String r4 = "MESA_PROCESS_NAME"
            java.lang.String r6 = "MojoLauncher"
            r14.put(r4, r6)
            java.lang.String r4 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r14.put(r4, r6)
            java.lang.String r4 = "DROIDBRIDGE_MESA_MODE"
            java.lang.String r6 = "freedreno_kgsl"
            r14.put(r4, r6)
            java.lang.String r4 = "DROIDBRIDGE_MESA_DRIVER"
            java.lang.String r7 = "kgsl"
            r14.put(r4, r7)
            java.lang.String r4 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            java.lang.String r8 = r0.getAbsolutePath()
            r14.put(r4, r8)
            java.lang.String r4 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            java.lang.String r8 = r12.getAbsolutePath()
            r14.put(r4, r8)
            java.lang.String r4 = "DROIDBRIDGE_MESA_NAMESPACE"
            r14.put(r4, r5)
            java.lang.String r4 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r14.put(r4, r3)
            java.lang.String r4 = "DROIDBRIDGE_MESA_EGL"
            java.lang.String r8 = r13.getAbsolutePath()
            r14.put(r4, r8)
            java.io.File r4 = new java.io.File
            java.lang.String r8 = "libGL.so"
            r4.<init>(r0, r8)
            boolean r8 = r4.isFile()
            if (r8 == 0) goto Laa
            java.lang.String r8 = "DROIDBRIDGE_MESA_GL"
            java.lang.String r4 = r4.getAbsolutePath()
            r14.put(r8, r4)
        Laa:
            java.lang.String r4 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r14.put(r4, r5)
            java.lang.String r4 = "POJAV_NATIVEDIR"
            java.lang.String r8 = r0.getAbsolutePath()
            r14.put(r4, r8)
            java.lang.String r4 = "POJAV_RENDERER"
            r14.put(r4, r6)
            java.lang.String r4 = "POJAV_RENDERER_MESA_MODE"
            r14.put(r4, r6)
            java.lang.String r4 = "POJAVEXEC_EGL"
            r14.put(r4, r1)
            java.lang.String r4 = "POJAV_EGL_LIBRARY"
            r14.put(r4, r1)
            java.lang.String r4 = "POJAVEXEC_EGL_LIBRARY"
            r14.put(r4, r1)
            java.lang.String r4 = "POJAV_RENDERER_LIBRARY"
            r14.put(r4, r1)
            java.lang.String r4 = "POJAVEXEC_RENDERER"
            r14.put(r4, r1)
            java.lang.String r4 = "LIB_MESA_NAME"
            r14.put(r4, r1)
            java.lang.String r1 = "LIBGL_ES"
            java.lang.String r4 = "2"
            r14.put(r1, r4)
            java.lang.String r1 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r4 = "4.6COMPAT"
            r14.put(r1, r4)
            java.lang.String r1 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r4 = "460"
            r14.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_MESA_EGL_SHIM"
            java.lang.String r4 = ""
            r14.put(r1, r4)
            java.lang.String r1 = "GALLIUM_DRIVER"
            r14.put(r1, r4)
            java.lang.String r1 = "MESA_LOADER_DRIVER_OVERRIDE"
            r14.put(r1, r7)
            java.lang.String r1 = "EGL_PLATFORM"
            java.lang.String r6 = "android"
            r14.put(r1, r6)
            java.lang.String r1 = "DROIDBRIDGE_MESA_EGL_PLATFORM_DISPLAY"
            r14.put(r1, r5)
            java.lang.String r1 = "DROIDBRIDGE_EGL_FORCE_RGBA8888"
            r14.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_EGL_FORCE_RGBX8888"
            r14.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_DIRECT_FREEDRENO_OPAQUE_RGBX8888"
            r14.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_DIRECT_FREEDRENO_NATIVE_SURFACE_V69"
            r14.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_DIRECT_FREEDRENO_TEXTUREVIEW_V70"
            r14.put(r1, r5)
            java.lang.String r1 = "DROIDBRIDGE_DIRECT_FREEDRENO_TURNIP_ZINK_V68"
            r14.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_DIRECT_FREEDRENO_LOAD_TURNIP"
            r14.put(r1, r4)
            java.lang.String r6 = "POJAV_LOAD_TURNIP"
            r14.put(r6, r4)
            java.lang.String r7 = "DROIDBRIDGE_LOAD_TURNIP"
            r14.put(r7, r4)
            java.lang.String r8 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r14.put(r8, r4)
            java.lang.String r9 = "POJAV_USE_SYSTEM_VULKAN"
            r14.put(r9, r5)
            java.lang.String r10 = "DROIDBRIDGE_EGL_NO_FORCED_DESTROYED_SWAP"
            r14.put(r10, r5)
            java.lang.String r10 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            r14.put(r10, r4)
            java.lang.String r10 = "MESA_ANDROID_NO_KMS_SWRAST"
            r14.put(r10, r5)
            java.lang.String r10 = "FORCE_VSYNC"
            java.lang.String r11 = "false"
            r14.put(r10, r11)
            java.lang.String r10 = "LIBGL_MIPMAP"
            java.lang.String r11 = "3"
            r14.put(r10, r11)
            java.lang.String r10 = "LIBGL_NOINTOVLHACK"
            r14.put(r10, r5)
            java.lang.String r10 = "LIBGL_NORMALIZE"
            r14.put(r10, r5)
            java.lang.String r10 = "LIBGL_NOERROR"
            r14.put(r10, r5)
            java.lang.String r10 = "allow_higher_compat_version"
            java.lang.String r11 = "true"
            r14.put(r10, r11)
            java.lang.String r10 = "force_glsl_extensions_warn"
            r14.put(r10, r11)
            java.lang.String r10 = "allow_glsl_extension_directive_midshader"
            r14.put(r10, r11)
            java.lang.String r10 = "DROIDBRIDGE_ADRENO740_SAFE_GL_EXTENSIONS"
            r14.put(r10, r4)
            java.lang.String r10 = "MESA_EXTENSION_OVERRIDE"
            r14.put(r10, r4)
            java.lang.String r10 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r14.put(r10, r5)
            java.lang.String r10 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r14.put(r10, r5)
            java.lang.String r10 = "DROIDBRIDGE_EGL_RECOVER_CURRENT"
            r14.put(r10, r4)
            java.lang.String r10 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r14.put(r10, r5)
            java.lang.String r10 = "MESA_GLSL_CACHE_DIR"
            java.lang.String r11 = r2.getAbsolutePath()
            r14.put(r10, r11)
            java.lang.String r10 = "MESA_SHADER_CACHE_DIR"
            java.lang.String r2 = r2.getAbsolutePath()
            r14.put(r10, r2)
            java.lang.String r2 = "LIBGL_DRIVERS_PATH"
            r14.put(r2, r3)
            java.lang.String r2 = "EGL_DRIVERS_PATH"
            r14.put(r2, r3)
            java.lang.String r2 = "DRIVER_PATH"
            java.lang.String r3 = r0.getAbsolutePath()
            r14.put(r2, r3)
            r14.put(r6, r4)
            r14.put(r7, r4)
            r14.put(r8, r4)
            r14.put(r1, r4)
            r14.put(r9, r5)
            java.lang.String r1 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            r14.put(r1, r4)
            java.lang.String r1 = "POJAV_CUSTOM_VULKAN_DRIVER"
            r14.put(r1, r4)
            java.lang.String r1 = "VK_ICD_FILENAMES"
            r14.put(r1, r4)
            java.lang.String r1 = "VK_DRIVER_FILES"
            r14.put(r1, r4)
            java.lang.String r1 = "VK_INSTANCE_LAYERS"
            r14.put(r1, r4)
            java.lang.String r1 = "TU_DEBUG"
            r14.put(r1, r4)
            java.lang.String r1 = "ZINK_DEBUG"
            r14.put(r1, r4)
            java.lang.String r1 = "ZINK_DESCRIPTORS"
            r14.put(r1, r4)
            java.lang.String r1 = "OSMESA_LIB"
            r14.put(r1, r4)
            java.lang.String r1 = "POJAV_OSMESA_LIBRARY"
            r14.put(r1, r4)
            java.lang.String r1 = "OSMESA_LIBRARY"
            r14.put(r1, r4)
            java.lang.String r1 = "LIBGL_OSMESA"
            r14.put(r1, r4)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "Mesa Freedreno KGSL direct experimental env nativeDir="
            r14.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r0 = " aliasDir="
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.StringBuilder r12 = r14.append(r12)
            java.lang.String r14 = " egl="
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r14 = r13.getAbsolutePath()
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r14 = " eglExists="
            java.lang.StringBuilder r12 = r12.append(r14)
            boolean r13 = r13.isFile()
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "DroidBridgeMesa"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r13, r12)
            return
    }

    public static void applyLegacyFreedrenoAsVulkanZinkAlias(android.content.Context r3, ca.dnamobile.javalauncher.renderer.RendererInterface r4, java.util.LinkedHashMap<java.lang.String, java.lang.String> r5) {
            boolean r0 = isLegacyFreedrenoRenderer(r4)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 1
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.sForceNativeSurfaceRgba8888 = r0
            java.lang.String r0 = "DROIDBRIDGE_FREEDRENO_V57_PURE_ZINK_ALIAS"
            java.lang.String r1 = "1"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_ADRENO740_SURFACE_RGBA8888"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAV_RENDERER"
            java.lang.String r1 = "vulkan_zink"
            r5.put(r0, r1)
            java.lang.String r0 = "POJAV_RENDERER_MESA_MODE"
            java.lang.String r1 = ""
            r5.put(r0, r1)
            java.lang.String r0 = "POJAVEXEC_EGL"
            java.lang.String r2 = "libOSMesa_8.so"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAV_EGL_LIBRARY"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAVEXEC_EGL_LIBRARY"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAV_RENDERER_LIBRARY"
            r5.put(r0, r2)
            java.lang.String r0 = "POJAVEXEC_RENDERER"
            r5.put(r0, r2)
            java.lang.String r0 = "LIB_MESA_NAME"
            r5.put(r0, r2)
            java.lang.String r0 = "DROIDBRIDGE_MESA"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_MODE"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DRIVER"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_GL"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_FORCE_RGBA8888"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_NO_FORCED_DESTROYED_SWAP"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_OSMESA_ENABLE_ATTRIBS"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_OSMESA_ZINK_NO_EXTENSION_BLACKLIST"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_ADRENO740_ROUTE"
            r5.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_FREEDRENO_V55_ROLLBACK"
            r5.put(r0, r1)
            java.lang.String r0 = "MESA_GL_VERSION_OVERRIDE"
            r5.put(r0, r1)
            java.lang.String r0 = "MESA_GLSL_VERSION_OVERRIDE"
            r5.put(r0, r1)
            java.lang.String r0 = "MESA_EXTENSION_OVERRIDE"
            r5.put(r0, r1)
            java.lang.String r0 = "ZINK_DEBUG"
            r5.put(r0, r1)
            java.lang.String r0 = "TU_DEBUG"
            r5.put(r0, r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "v57 legacy Freedreno KGSL treated as pure Vulkan Zink alias renderer="
            r5.<init>(r0)
            java.lang.String r4 = rendererIdentity(r4)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " nativeDir="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.io.File r3 = resolveMesaNativeDir(r3)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "DroidBridgeMesa"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
    }

    public static void applyNativeGlfwKgslEnvironment(android.content.Context r10, ca.dnamobile.javalauncher.renderer.RendererInterface r11, java.util.LinkedHashMap<java.lang.String, java.lang.String> r12) {
            boolean r0 = isNativeGlfwKgslRenderer(r11)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 1
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.sForceNativeSurfaceRgba8888 = r0
            java.io.File r0 = resolveMesaNativeDir(r10)
            java.io.File r10 = prepareMesaLibraryAliases(r10, r11)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libEGL_mesa.so"
            r1.<init>(r0, r2)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "libdroidbridge_native_glfw_v82.so"
            r3.<init>(r0, r4)
            java.io.File r4 = new java.io.File
            java.io.File r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r6 = "mesa"
            r4.<init>(r5, r6)
            r4.mkdirs()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = java.io.File.pathSeparator
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r10.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.util.Map r11 = r11.getRendererEnv()
            r12.putAll(r11)
            java.lang.String r11 = "DROIDBRIDGE_NATIVE_GLFW"
            java.lang.String r6 = "1"
            r12.put(r11, r6)
            java.lang.String r11 = "DROIDBRIDGE_NATIVE_GLFW_KGSL"
            r12.put(r11, r6)
            java.lang.String r11 = "DROIDBRIDGE_NATIVE_GLFW_DESKTOP_GL"
            r12.put(r11, r6)
            java.lang.String r11 = "DROIDBRIDGE_NATIVE_GLFW_LIB"
            java.lang.String r7 = r3.getAbsolutePath()
            r12.put(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_NATIVE_GLFW_EGL"
            java.lang.String r7 = r1.getAbsolutePath()
            r12.put(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_NATIVE_GLFW_DRIVER"
            java.lang.String r7 = "kgsl"
            r12.put(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_MESA"
            r12.put(r11, r6)
            java.lang.String r11 = "DROIDBRIDGE_MESA_MODE"
            java.lang.String r8 = "freedreno_kgsl"
            r12.put(r11, r8)
            java.lang.String r11 = "DROIDBRIDGE_MESA_DRIVER"
            r12.put(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            java.lang.String r9 = r0.getAbsolutePath()
            r12.put(r11, r9)
            java.lang.String r11 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            java.lang.String r9 = r10.getAbsolutePath()
            r12.put(r11, r9)
            java.lang.String r11 = "DROIDBRIDGE_MESA_NAMESPACE"
            r12.put(r11, r6)
            java.lang.String r11 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r12.put(r11, r5)
            java.lang.String r11 = "DROIDBRIDGE_MESA_EGL"
            java.lang.String r9 = r1.getAbsolutePath()
            r12.put(r11, r9)
            java.lang.String r11 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r12.put(r11, r6)
            java.lang.String r11 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r12.put(r11, r6)
            java.lang.String r11 = "POJAV_NATIVEDIR"
            java.lang.String r9 = r0.getAbsolutePath()
            r12.put(r11, r9)
            java.lang.String r11 = "POJAV_RENDERER"
            r12.put(r11, r8)
            java.lang.String r11 = "POJAV_RENDERER_MESA_MODE"
            r12.put(r11, r8)
            java.lang.String r11 = "POJAVEXEC_EGL"
            r12.put(r11, r2)
            java.lang.String r11 = "POJAV_EGL_LIBRARY"
            r12.put(r11, r2)
            java.lang.String r11 = "POJAVEXEC_EGL_LIBRARY"
            r12.put(r11, r2)
            java.lang.String r11 = "POJAV_RENDERER_LIBRARY"
            r12.put(r11, r2)
            java.lang.String r11 = "POJAVEXEC_RENDERER"
            r12.put(r11, r2)
            java.lang.String r11 = "LIB_MESA_NAME"
            r12.put(r11, r2)
            java.lang.String r11 = "GALLIUM_DRIVER"
            java.lang.String r2 = ""
            r12.put(r11, r2)
            java.lang.String r11 = "MESA_LOADER_DRIVER_OVERRIDE"
            r12.put(r11, r7)
            java.lang.String r11 = "EGL_PLATFORM"
            java.lang.String r7 = "android"
            r12.put(r11, r7)
            java.lang.String r11 = "LIBGL_ES"
            java.lang.String r7 = "2"
            r12.put(r11, r7)
            java.lang.String r11 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r7 = "4.6COMPAT"
            r12.put(r11, r7)
            java.lang.String r11 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r7 = "460"
            r12.put(r11, r7)
            java.lang.String r11 = "LIBGL_MIPMAP"
            java.lang.String r7 = "3"
            r12.put(r11, r7)
            java.lang.String r11 = "LIBGL_NOINTOVLHACK"
            r12.put(r11, r6)
            java.lang.String r11 = "LIBGL_NORMALIZE"
            r12.put(r11, r6)
            java.lang.String r11 = "LIBGL_NOERROR"
            r12.put(r11, r6)
            java.lang.String r11 = "allow_higher_compat_version"
            java.lang.String r7 = "true"
            r12.put(r11, r7)
            java.lang.String r11 = "force_glsl_extensions_warn"
            r12.put(r11, r7)
            java.lang.String r11 = "allow_glsl_extension_directive_midshader"
            r12.put(r11, r7)
            java.lang.String r11 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r12.put(r11, r6)
            java.lang.String r11 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r12.put(r11, r6)
            java.lang.String r11 = "MESA_EXTENSION_OVERRIDE"
            r12.put(r11, r2)
            java.lang.String r11 = "mesa_glthread"
            r12.put(r11, r2)
            java.lang.String r11 = "FORCE_VSYNC"
            java.lang.String r7 = "false"
            r12.put(r11, r7)
            java.lang.String r11 = "MESA_GLSL_CACHE_DIR"
            java.lang.String r7 = r4.getAbsolutePath()
            r12.put(r11, r7)
            java.lang.String r11 = "MESA_SHADER_CACHE_DIR"
            java.lang.String r4 = r4.getAbsolutePath()
            r12.put(r11, r4)
            java.lang.String r11 = "LIBGL_DRIVERS_PATH"
            r12.put(r11, r5)
            java.lang.String r11 = "EGL_DRIVERS_PATH"
            r12.put(r11, r5)
            java.lang.String r11 = "DRIVER_PATH"
            java.lang.String r4 = r0.getAbsolutePath()
            r12.put(r11, r4)
            java.lang.String r11 = "POJAV_LOAD_TURNIP"
            r12.put(r11, r2)
            java.lang.String r11 = "DROIDBRIDGE_LOAD_TURNIP"
            r12.put(r11, r2)
            java.lang.String r11 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r12.put(r11, r2)
            java.lang.String r11 = "DROIDBRIDGE_DIRECT_FREEDRENO_LOAD_TURNIP"
            r12.put(r11, r2)
            java.lang.String r11 = "POJAV_USE_SYSTEM_VULKAN"
            r12.put(r11, r6)
            java.lang.String r11 = "VK_ICD_FILENAMES"
            r12.put(r11, r2)
            java.lang.String r11 = "VK_DRIVER_FILES"
            r12.put(r11, r2)
            java.lang.String r11 = "VK_INSTANCE_LAYERS"
            r12.put(r11, r2)
            java.lang.String r11 = "TU_DEBUG"
            r12.put(r11, r2)
            java.lang.String r11 = "ZINK_DEBUG"
            r12.put(r11, r2)
            java.lang.String r11 = "ZINK_DESCRIPTORS"
            r12.put(r11, r2)
            java.lang.String r11 = "OSMESA_LIB"
            r12.put(r11, r2)
            java.lang.String r11 = "POJAV_OSMESA_LIBRARY"
            r12.put(r11, r2)
            java.lang.String r11 = "OSMESA_LIBRARY"
            r12.put(r11, r2)
            java.lang.String r11 = "LIBGL_OSMESA"
            r12.put(r11, r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Native GLFW KGSL env nativeDir="
            r11.<init>(r12)
            java.lang.String r12 = r0.getAbsolutePath()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = " aliasDir="
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r11 = " egl="
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = r1.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " nativeGlfw="
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = r3.getAbsolutePath()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " nativeGlfwExists="
            java.lang.StringBuilder r10 = r10.append(r11)
            boolean r11 = r3.isFile()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "DroidBridgeMesa"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r11, r10)
            return
    }

    public static void applyZinkSurfaceWorkaround(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            boolean r0 = isVulkanZinkOrLegacyAlias(r2)
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.sForceNativeSurfaceRgba8888 = r0
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "v61 forcing native SurfaceView RGBA_8888 for Vulkan Zink presentation path renderer="
            r0.<init>(r1)
            java.lang.String r2 = rendererIdentity(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "DroidBridgeMesa"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)
        L20:
            return
    }

    public static void applyZinkTurnipEnvironment(android.content.Context r6, ca.dnamobile.javalauncher.renderer.RendererInterface r7, java.util.LinkedHashMap<java.lang.String, java.lang.String> r8) {
            boolean r7 = isMesaZinkTurnipRenderer(r7)
            if (r7 != 0) goto L7
            return
        L7:
            r7 = 1
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.sForceNativeSurfaceRgba8888 = r7
            java.io.File r7 = resolveMesaNativeDir(r6)
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r2 = "mesa"
            r0.<init>(r1, r2)
            r0.mkdirs()
            java.lang.String r1 = "DROIDBRIDGE_ADRENO740_ROUTE"
            java.lang.String r2 = "legacy_vulkan_zink_osmesa_turnip_v55_match_vulkan_zink_env"
            r8.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_FREEDRENO_V55_ROLLBACK"
            java.lang.String r2 = "1"
            r8.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_MESA"
            java.lang.String r3 = ""
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_MESA_MODE"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_MESA_DRIVER"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_MESA_EGL"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_MESA_GL"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_MESA_NAMESPACE"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_EGL_FORCE_RGBA8888"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_EGL_NO_FORCED_DESTROYED_SWAP"
            r8.put(r1, r3)
            java.lang.String r1 = "POJAVEXEC_EGL"
            java.lang.String r4 = "libOSMesa_8.so"
            r8.put(r1, r4)
            java.lang.String r1 = "POJAV_EGL_LIBRARY"
            r8.put(r1, r4)
            java.lang.String r1 = "POJAVEXEC_EGL_LIBRARY"
            r8.put(r1, r4)
            java.lang.String r1 = "POJAV_RENDERER_LIBRARY"
            r8.put(r1, r4)
            java.lang.String r1 = "POJAVEXEC_RENDERER"
            r8.put(r1, r4)
            java.lang.String r1 = "POJAV_RENDERER"
            java.lang.String r5 = "vulkan_zink"
            r8.put(r1, r5)
            java.lang.String r1 = "POJAV_RENDERER_MESA_MODE"
            r8.put(r1, r3)
            java.lang.String r1 = "POJAV_NATIVEDIR"
            java.lang.String r5 = r7.getAbsolutePath()
            r8.put(r1, r5)
            java.lang.String r1 = "LIB_MESA_NAME"
            r8.put(r1, r4)
            java.lang.String r1 = "OSMESA_LIB"
            r8.put(r1, r4)
            java.lang.String r1 = "POJAV_OSMESA_LIBRARY"
            r8.put(r1, r4)
            java.lang.String r1 = "OSMESA_LIBRARY"
            r8.put(r1, r4)
            java.lang.String r1 = "LIBGL_OSMESA"
            r8.put(r1, r4)
            java.lang.String r1 = "GALLIUM_DRIVER"
            java.lang.String r5 = "zink"
            r8.put(r1, r5)
            java.lang.String r1 = "MESA_LOADER_DRIVER_OVERRIDE"
            r8.put(r1, r5)
            java.lang.String r1 = "LIBGL_ES"
            java.lang.String r5 = "3"
            r8.put(r1, r5)
            java.lang.String r1 = "LIBGL_NOERROR"
            r8.put(r1, r2)
            java.lang.String r1 = "MESA_NO_ERROR"
            r8.put(r1, r2)
            java.lang.String r1 = "LIBGL_NORMALIZE"
            r8.put(r1, r2)
            java.lang.String r1 = "LIBGL_MIPMAP"
            r8.put(r1, r5)
            java.lang.String r1 = "LIBGL_NOINTOVLHACK"
            r8.put(r1, r2)
            java.lang.String r1 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r5 = "4.3"
            r8.put(r1, r5)
            java.lang.String r1 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r5 = "430"
            r8.put(r1, r5)
            java.lang.String r1 = "DROIDBRIDGE_OSMESA_ENABLE_ATTRIBS"
            java.lang.String r5 = "0"
            r8.put(r1, r5)
            java.lang.String r1 = "MESA_EXTENSION_OVERRIDE"
            r8.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_OSMESA_ZINK_NO_EXTENSION_BLACKLIST"
            r8.put(r1, r2)
            java.lang.String r1 = "mesa_glthread"
            java.lang.String r2 = "false"
            r8.put(r1, r2)
            java.lang.String r1 = "MESA_DEBUG"
            r8.put(r1, r3)
            java.lang.String r1 = "MESA_VK_WSI_PRESENT_MODE"
            java.lang.String r2 = "mailbox"
            r8.put(r1, r2)
            java.lang.String r1 = "ZINK_DESCRIPTORS"
            java.lang.String r2 = "db"
            r8.put(r1, r2)
            java.lang.String r1 = "ZINK_DEBUG"
            r8.put(r1, r3)
            java.lang.String r1 = "TU_DEBUG"
            r8.put(r1, r3)
            java.lang.String r1 = "MESA_GLSL_CACHE_DIR"
            java.lang.String r2 = r0.getAbsolutePath()
            r8.put(r1, r2)
            java.lang.String r1 = "MESA_SHADER_CACHE_DIR"
            java.lang.String r0 = r0.getAbsolutePath()
            r8.put(r1, r0)
            ca.dnamobile.javalauncher.renderer.MesaZinkTurnipDriver.applyEnvironment(r6, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Mesa/Freedreno legacy renderer rerouted to Vulkan Zink OSMesa v55 nativeDir="
            r8.<init>(r0)
            java.lang.String r0 = r7.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = " osmesa="
            java.lang.StringBuilder r8 = r8.append(r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r4)
            boolean r7 = r0.isFile()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = " turnipAvailable="
            java.lang.StringBuilder r7 = r7.append(r8)
            boolean r6 = ca.dnamobile.javalauncher.renderer.MesaZinkTurnipDriver.isAvailable(r6)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "DroidBridgeMesa"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
    }

    public static java.lang.String buildMesaNamespacePath(android.content.Context r2, ca.dnamobile.javalauncher.renderer.RendererInterface r3) {
            java.io.File r2 = resolveMesaNativeDir(r2)
            java.io.File r0 = resolveMesaAliasDir()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            addSearchPath(r1, r0)
            boolean r3 = isMesaZinkTurnipRenderer(r3)
            if (r3 == 0) goto L5c
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/vendor/lib64"
            r3.<init>(r0)
            addSearchPath(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/system_ext/lib64"
            r3.<init>(r0)
            addSearchPath(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/odm/lib64"
            r3.<init>(r0)
            addSearchPath(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/product/lib64"
            r3.<init>(r0)
            addSearchPath(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/apex/com.android.runtime/lib64"
            r3.<init>(r0)
            addSearchPath(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/apex/com.android.art/lib64"
            r3.<init>(r0)
            addSearchPath(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/system/lib64"
            r3.<init>(r0)
            addSearchPath(r1, r3)
        L5c:
            addSearchPath(r1, r2)
            java.lang.String r2 = joinSearchPath(r1)
            return r2
    }

    private static void copyAlias(java.io.File r7, java.io.File r8) {
            java.lang.String r0 = "DroidBridgeMesa"
            boolean r1 = r7.isFile()
            if (r1 != 0) goto L10
            java.nio.file.Path r7 = r8.toPath()     // Catch: java.lang.Throwable -> Lf
            java.nio.file.Files.deleteIfExists(r7)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
        L10:
            java.nio.file.Path r1 = r8.toPath()     // Catch: java.lang.Throwable -> L17
            java.nio.file.Files.deleteIfExists(r1)     // Catch: java.lang.Throwable -> L17
        L17:
            java.io.File r1 = r8.getParentFile()
            if (r1 == 0) goto L26
            boolean r2 = r1.exists()
            if (r2 != 0) goto L26
            r1.mkdirs()
        L26:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L8a
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L80
            r3 = 0
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L80
            r4 = 65536(0x10000, float:9.1835E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L76
        L35:
            int r5 = r1.read(r4)     // Catch: java.lang.Throwable -> L76
            r6 = -1
            if (r5 == r6) goto L40
            r2.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L76
            goto L35
        L40:
            r4 = 1
            r8.setReadable(r4, r3)     // Catch: java.lang.Throwable -> L76
            r8.setExecutable(r4, r3)     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r3.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "Prepared Mesa alias "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = " from "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r7 = r3.append(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L76
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)     // Catch: java.lang.Throwable -> L76
            r2.close()     // Catch: java.lang.Throwable -> L80
            r1.close()     // Catch: java.lang.Throwable -> L8a
            goto La1
        L76:
            r7 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r2 = move-exception
            r7.addSuppressed(r2)     // Catch: java.lang.Throwable -> L80
        L7f:
            throw r7     // Catch: java.lang.Throwable -> L80
        L80:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r1 = move-exception
            r7.addSuppressed(r1)     // Catch: java.lang.Throwable -> L8a
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to prepare Mesa alias "
            r1.<init>(r2)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r8, r7)
        La1:
            return
    }

    private static boolean dlopen(java.io.File r4, boolean r5) {
            java.lang.String r0 = "DroidBridgeMesa"
            java.lang.String r1 = "Mesa dlopen "
            java.lang.String r2 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = net.kdt.pojavlaunch.utils.JREUtils.dlopen(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = " = "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L2b
            return r2
        L2b:
            r1 = move-exception
            if (r5 == 0) goto L45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "Mesa required dlopen failed: "
            r5.<init>(r2)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r1)
            goto L5b
        L45:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "Mesa optional dlopen failed: "
            r5.<init>(r2)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r1)
        L5b:
            r4 = 0
            return r4
    }

    public static boolean isBundledMesaAvailable(android.content.Context r2) {
            java.io.File r2 = resolveMesaNativeDir(r2)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libEGL_mesa.so"
            r0.<init>(r2, r1)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L2d
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libgallium_dri.so"
            r0.<init>(r2, r1)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L2d
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libdrm.so"
            r0.<init>(r2, r1)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            return r2
    }

    public static boolean isDroidBridgeMesaRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r0) {
            boolean r0 = isNativeGlfwKgslRenderer(r0)
            return r0
    }

    public static boolean isLegacyFreedrenoRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r6.getUniqueIdentifier()
            java.lang.String r1 = safeLower(r1)
            java.lang.String r2 = r6.getRendererId()
            java.lang.String r2 = safeLower(r2)
            java.lang.String r6 = rendererIdentity(r6)
            java.lang.String r3 = "direct"
            boolean r3 = r6.contains(r3)
            r4 = 1
            if (r3 != 0) goto L3c
            java.lang.String r3 = "kgsl direct"
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "experimental kgsl"
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "freedreno_kgsl_direct"
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L3a
            goto L3c
        L3a:
            r3 = r0
            goto L3d
        L3c:
            r3 = r4
        L3d:
            java.lang.String r5 = "1ad7249f-5784-4f00-bc72-174b3578ee46"
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L46
            return r4
        L46:
            if (r3 == 0) goto L49
            return r0
        L49:
            java.lang.String r0 = "freedreno_kgsl"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5a
            java.lang.String r0 = "mesa freedreno"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L5a
            return r4
        L5a:
            java.lang.String r0 = "mesa freedreno kgsl"
            boolean r6 = r6.contains(r0)
            return r6
    }

    public static boolean isMesaFreedrenoAvailable(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = isBundledMesaAvailable(r2)
            return r2
    }

    public static boolean isMesaZinkTurnipAvailable(android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            boolean r0 = isBundledMesaAvailable(r3)
            if (r0 == 0) goto L15
            boolean r3 = ca.dnamobile.javalauncher.renderer.MesaZinkTurnipDriver.isAvailable(r3)
            if (r3 == 0) goto L15
            r2 = 1
        L15:
            return r2
    }

    public static boolean isMesaZinkTurnipRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.getRendererId()
            java.lang.String r1 = safeLower(r1)
            java.lang.String r2 = r5.getUniqueIdentifier()
            java.lang.String r2 = safeLower(r2)
            java.lang.String r3 = rendererIdentity(r5)
            java.lang.String r4 = "vulkan_zink"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L63
            boolean r1 = r4.equals(r2)
            if (r1 == 0) goto L27
            goto L63
        L27:
            boolean r5 = isLegacyFreedrenoRenderer(r5)
            if (r5 == 0) goto L2e
            return r0
        L2e:
            java.lang.String r5 = "zink_turnip"
            boolean r5 = r3.contains(r5)
            r1 = 1
            if (r5 == 0) goto L38
            return r1
        L38:
            java.lang.String r5 = "mesa unified zink"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L41
            return r1
        L41:
            java.lang.String r5 = "droidbridge mesa zink"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L4a
            return r1
        L4a:
            java.lang.String r5 = "mesa freedreno"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L63
            java.lang.String r5 = "direct"
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L63
            java.lang.String r5 = "kgsl direct"
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L63
            return r1
        L63:
            return r0
    }

    public static boolean isNativeGlfwKgslRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r0) {
            boolean r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeNativeGlfwKgslRenderer.isRenderer(r0)
            return r0
    }

    public static boolean isPureVulkanZinkRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.getRendererId()
            java.lang.String r1 = safeLower(r1)
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.String r2 = safeLower(r2)
            java.lang.String r4 = rendererIdentity(r4)
            java.lang.String r3 = "vulkan_zink"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L36
            boolean r1 = r3.equals(r2)
            if (r1 != 0) goto L36
            java.lang.String r1 = "vulkan zink"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L36
            java.lang.String r1 = "libosmesa_8.so"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L37
        L36:
            r0 = 1
        L37:
            return r0
    }

    public static boolean isVulkanZinkOrLegacyAlias(ca.dnamobile.javalauncher.renderer.RendererInterface r0) {
            boolean r0 = isPureVulkanZinkRenderer(r0)
            return r0
    }

    private static java.lang.String joinSearchPath(java.util.ArrayList<java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L9
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
            goto L9
        L22:
            int r2 = r0.length()
            if (r2 <= 0) goto L2d
            java.lang.String r2 = java.io.File.pathSeparator
            r0.append(r2)
        L2d:
            r0.append(r1)
            goto L9
        L31:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static void linkOrCopyAlias(java.io.File r6, java.io.File r7) {
            java.lang.String r0 = "DroidBridgeMesa"
            java.lang.String r1 = "Prepared Mesa symlink alias "
            boolean r2 = r6.isFile()
            if (r2 != 0) goto L12
            java.nio.file.Path r6 = r7.toPath()     // Catch: java.lang.Throwable -> L11
            java.nio.file.Files.deleteIfExists(r6)     // Catch: java.lang.Throwable -> L11
        L11:
            return
        L12:
            java.io.File r2 = r7.getParentFile()
            if (r2 == 0) goto L21
            boolean r3 = r2.exists()
            if (r3 != 0) goto L21
            r2.mkdirs()
        L21:
            java.nio.file.Path r2 = r7.toPath()     // Catch: java.lang.Throwable -> L28
            java.nio.file.Files.deleteIfExists(r2)     // Catch: java.lang.Throwable -> L28
        L28:
            java.nio.file.Path r2 = r7.toPath()     // Catch: java.lang.Throwable -> L60
            java.nio.file.Path r3 = r6.toPath()     // Catch: java.lang.Throwable -> L60
            r4 = 0
            java.nio.file.attribute.FileAttribute[] r5 = new java.nio.file.attribute.FileAttribute[r4]     // Catch: java.lang.Throwable -> L60
            java.nio.file.Files.createSymbolicLink(r2, r3, r5)     // Catch: java.lang.Throwable -> L60
            r2 = 1
            r7.setReadable(r2, r4)     // Catch: java.lang.Throwable -> L60
            r7.setExecutable(r2, r4)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = " -> "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L60
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L60
            return
        L60:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Mesa symlink alias unavailable, falling back to copy for "
            r2.<init>(r3)
            java.lang.String r3 = r7.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)
            copyAlias(r6, r7)
            return
    }

    public static void preload(android.content.Context r7, ca.dnamobile.javalauncher.renderer.RendererInterface r8) {
            boolean r0 = isLegacyFreedrenoRenderer(r8)
            java.lang.String r1 = "DroidBridgeMesa"
            if (r0 == 0) goto Le
            java.lang.String r7 = "v65 direct Freedreno uses native Mojo Mesa/Turnip path; skipping Java Mesa preload"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
        Le:
            boolean r0 = isMesaZinkTurnipRenderer(r8)
            if (r0 == 0) goto L1a
            java.lang.String r7 = "v51 Zink/Turnip rollback uses libOSMesa_8.so; skipping DroidBridge Mesa EGL preload"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
        L1a:
            boolean r0 = isDroidBridgeMesaRenderer(r8)
            if (r0 != 0) goto L21
            return
        L21:
            java.io.File r0 = resolveMesaNativeDir(r7)
            java.io.File r2 = prepareMesaLibraryAliases(r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Mesa preload nativeDir="
            r3.<init>(r4)
            java.lang.String r4 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " aliasDir="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r2.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " renderer="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r8.getRendererName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
            boolean r7 = ca.dnamobile.javalauncher.renderer.DroidBridgeRenderSpec.configureForMesa(r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DroidBridge RenderSpec configured="
            r3.<init>(r4)
            java.lang.StringBuilder r7 = r3.append(r7)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            java.lang.String[] r7 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.OPTIONAL_MESA_DEPS
            int r3 = r7.length
            r4 = 0
        L75:
            if (r4 >= r3) goto L8c
            r5 = r7[r4]
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r5)
            preloadOptional(r6)
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r5)
            preloadOptional(r6)
            int r4 = r4 + 1
            goto L75
        L8c:
            boolean r7 = isMesaZinkTurnipRenderer(r8)
            if (r7 != 0) goto L9c
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "libdrm.so"
            r7.<init>(r0, r8)
            preloadRequired(r7)
        L9c:
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "libglapi.so"
            r7.<init>(r0, r8)
            preloadOptional(r7)
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "libgallium_dri.so"
            r7.<init>(r0, r8)
            preloadRequired(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Mesa EGL reserved for native bridge: "
            r7.<init>(r8)
            java.io.File r8 = new java.io.File
            java.lang.String r2 = "libEGL_mesa.so"
            r8.<init>(r0, r2)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " exists="
            java.lang.StringBuilder r7 = r7.append(r8)
            java.io.File r8 = new java.io.File
            r8.<init>(r0, r2)
            boolean r8 = r8.isFile()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
    }

    private static boolean preloadOptional(java.io.File r2) {
            boolean r0 = r2.isFile()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = dlopen(r2, r1)
            return r2
    }

    private static boolean preloadRequired(java.io.File r2) {
            boolean r0 = r2.isFile()
            if (r0 != 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required Mesa library missing: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "DroidBridgeMesa"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r2)
            r2 = 0
            return r2
        L20:
            r0 = 1
            boolean r2 = dlopen(r2, r0)
            return r2
    }

    public static java.io.File prepareMesaLibraryAliases(android.content.Context r5, ca.dnamobile.javalauncher.renderer.RendererInterface r6) {
            java.io.File r0 = resolveMesaAliasDir()
            boolean r1 = isDroidBridgeMesaRenderer(r6)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.io.File r5 = resolveMesaNativeDir(r5)
            r0.mkdirs()
            purgeMesaAliasDirectory(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libEGL_mesa.so"
            r1.<init>(r5, r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r2)
            linkOrCopyAlias(r1, r3)
            java.io.File r1 = new java.io.File
            r1.<init>(r5, r2)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "libEGL.so.1"
            r3.<init>(r0, r4)
            linkOrCopyAlias(r1, r3)
            java.io.File r1 = new java.io.File
            r1.<init>(r5, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "libEGL.so"
            r2.<init>(r0, r3)
            linkOrCopyAlias(r1, r2)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libgallium_dri.so"
            r1.<init>(r5, r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r2)
            copyAlias(r1, r3)
            boolean r6 = isMesaZinkTurnipRenderer(r6)
            if (r6 != 0) goto L75
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libdrm.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            copyAlias(r6, r2)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libgbm.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            copyAlias(r6, r2)
        L75:
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libcutils.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            copyAlias(r6, r2)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libhardware.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            copyAlias(r6, r2)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libglapi.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            copyAlias(r6, r2)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libGL.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            linkOrCopyAlias(r6, r2)
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libGL.so.1"
            r1.<init>(r0, r2)
            linkOrCopyAlias(r6, r1)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libvulkan_freedreno.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            copyAlias(r6, r2)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libvulkan_turnip.so"
            r6.<init>(r5, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            copyAlias(r6, r2)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "libvulkan_adreno.so"
            r6.<init>(r5, r1)
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r1)
            copyAlias(r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Mesa alias dir="
            r5.<init>(r6)
            java.lang.String r6 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " libEGL.so.1="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.io.File r6 = new java.io.File
            r6.<init>(r0, r4)
            boolean r6 = r6.isFile()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "DroidBridgeMesa"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
            return r0
    }

    private static void purgeMesaAliasDirectory(java.io.File r7) {
            java.lang.String r0 = "DroidBridgeMesa"
            java.io.File[] r7 = r7.listFiles()
            if (r7 != 0) goto L9
            return
        L9:
            int r1 = r7.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L4e
            r3 = r7[r2]
            if (r3 != 0) goto L12
            goto L4b
        L12:
            java.nio.file.Path r4 = r3.toPath()     // Catch: java.lang.Throwable -> L34
            java.nio.file.Files.deleteIfExists(r4)     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r4.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "Removed stale Mesa alias "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L34
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)     // Catch: java.lang.Throwable -> L34
            goto L4b
        L34:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to remove stale Mesa alias "
            r5.<init>(r6)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r3, r4)
        L4b:
            int r2 = r2 + 1
            goto Lb
        L4e:
            return
    }

    private static java.lang.String rendererIdentity(ca.dnamobile.javalauncher.renderer.RendererInterface r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getRendererId()
            java.lang.String r1 = safeLower(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.getRendererName()
            java.lang.String r2 = safeLower(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.getRendererLibrary()
            java.lang.String r2 = safeLower(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.getRendererEGL()
            java.lang.String r2 = safeLower(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.getUniqueIdentifier()
            java.lang.String r3 = safeLower(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.io.File resolveMesaAliasDir() {
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            if (r0 == 0) goto L7
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "mesa-lwjgl-aliases"
            if (r0 != 0) goto L12
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            return r0
        L12:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            return r2
    }

    public static java.io.File resolveMesaNativeDir(android.content.Context r4) {
            java.lang.String r0 = "libEGL_mesa.so"
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L10
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.nativeLibraryDir     // Catch: java.lang.Throwable -> L2e
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L2e
            java.lang.String r3 = r2.trim()     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2e
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.isFile()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L2e
            return r3
        L2e:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r2 == 0) goto L51
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L51
            java.io.File r2 = new java.io.File
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r2.<init>(r3)
            java.io.File r3 = new java.io.File
            r3.<init>(r2, r0)
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L51
            return r2
        L51:
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L5d
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r4.nativeLibraryDir     // Catch: java.lang.Throwable -> L6f
        L5d:
            if (r1 == 0) goto L6f
            java.lang.String r4 = r1.trim()     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L6f
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            return r4
        L6f:
            java.io.File r4 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r0 == 0) goto L78
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            goto L7a
        L78:
            java.lang.String r0 = "."
        L7a:
            r4.<init>(r0)
            return r4
    }

    private static java.lang.String safeLower(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto Lf
        L5:
            java.lang.String r1 = r1.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
        Lf:
            return r1
    }

    public static boolean shouldForceNativeSurfaceRgba8888() {
            boolean r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.sForceNativeSurfaceRgba8888
            return r0
    }
}
