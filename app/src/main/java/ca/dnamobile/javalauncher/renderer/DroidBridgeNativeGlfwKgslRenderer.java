package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeNativeGlfwKgslRenderer implements ca.dnamobile.javalauncher.renderer.RendererInterface {
    public static final java.lang.String RENDERER_ID = "droidbridge_native_glfw_kgsl";
    public static final java.lang.String RENDERER_UUID = "9cda3f9b-7d58-4c55-a763-64c5c8c1f001";

    public DroidBridgeNativeGlfwKgslRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            if (r2 == 0) goto L1c
            java.lang.String r0 = "droidbridge_native_glfw_kgsl"
            java.lang.String r1 = r2.getRendererId()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "9cda3f9b-7d58-4c55-a763-64c5c8c1f001"
            java.lang.String r2 = r2.getUniqueIdentifier()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1c
        L1a:
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.util.List<java.lang.String> getDlopenLibrary() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererDescription() {
            r1 = this;
            java.lang.String r0 = "Experimental DroidBridge-owned native Android Surface/EGL path for Mesa Freedreno."
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererEGL() {
            r1 = this;
            java.lang.String r0 = "libEGL_mesa.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.util.Map<java.lang.String, java.lang.String> getRendererEnv() {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "DROIDBRIDGE_NATIVE_GLFW"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_NATIVE_GLFW_KGSL"
            r0.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_NATIVE_GLFW_DESKTOP_GL"
            r0.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_MESA"
            r0.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_MESA_AAR_SINGLE_SOURCE"
            r0.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_MESA_MODE"
            java.lang.String r3 = "freedreno_kgsl"
            r0.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_MESA_DRIVER"
            java.lang.String r4 = "kgsl"
            r0.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r0.put(r1, r2)
            java.lang.String r1 = "POJAV_RENDERER"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAV_RENDERER_MESA_MODE"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAVEXEC_EGL"
            java.lang.String r3 = "libEGL_mesa.so"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAV_EGL_LIBRARY"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAVEXEC_EGL_LIBRARY"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAV_RENDERER_LIBRARY"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAVEXEC_RENDERER"
            r0.put(r1, r3)
            java.lang.String r1 = "LIB_MESA_NAME"
            r0.put(r1, r3)
            java.lang.String r1 = "MESA_PROCESS_NAME"
            java.lang.String r3 = "DroidBridge"
            r0.put(r1, r3)
            java.lang.String r1 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r0.put(r1, r3)
            java.lang.String r1 = "MESA_LOADER_DRIVER_OVERRIDE"
            r0.put(r1, r4)
            java.lang.String r1 = "GALLIUM_DRIVER"
            java.lang.String r3 = ""
            r0.put(r1, r3)
            java.lang.String r1 = "EGL_PLATFORM"
            java.lang.String r4 = "android"
            r0.put(r1, r4)
            java.lang.String r1 = "LIBGL_ES"
            java.lang.String r4 = "2"
            r0.put(r1, r4)
            java.lang.String r1 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r4 = "4.6COMPAT"
            r0.put(r1, r4)
            java.lang.String r1 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r4 = "460"
            r0.put(r1, r4)
            java.lang.String r1 = "LIBGL_MIPMAP"
            java.lang.String r4 = "3"
            r0.put(r1, r4)
            java.lang.String r1 = "LIBGL_NOINTOVLHACK"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_NORMALIZE"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_NOERROR"
            r0.put(r1, r2)
            java.lang.String r1 = "allow_higher_compat_version"
            java.lang.String r4 = "true"
            r0.put(r1, r4)
            java.lang.String r1 = "force_glsl_extensions_warn"
            r0.put(r1, r4)
            java.lang.String r1 = "allow_glsl_extension_directive_midshader"
            r0.put(r1, r4)
            java.lang.String r1 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r0.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r0.put(r1, r2)
            java.lang.String r1 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r0.put(r1, r2)
            java.lang.String r1 = "MESA_EXTENSION_OVERRIDE"
            r0.put(r1, r3)
            java.lang.String r1 = "mesa_glthread"
            r0.put(r1, r3)
            java.lang.String r1 = "FORCE_VSYNC"
            java.lang.String r4 = "false"
            r0.put(r1, r4)
            java.lang.String r1 = "POJAV_LOAD_TURNIP"
            r0.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_LOAD_TURNIP"
            r0.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r0.put(r1, r3)
            java.lang.String r1 = "DROIDBRIDGE_DIRECT_FREEDRENO_LOAD_TURNIP"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAV_USE_SYSTEM_VULKAN"
            r0.put(r1, r2)
            java.lang.String r1 = "VK_ICD_FILENAMES"
            r0.put(r1, r3)
            java.lang.String r1 = "VK_DRIVER_FILES"
            r0.put(r1, r3)
            java.lang.String r1 = "VK_INSTANCE_LAYERS"
            r0.put(r1, r3)
            java.lang.String r1 = "TU_DEBUG"
            r0.put(r1, r3)
            java.lang.String r1 = "ZINK_DEBUG"
            r0.put(r1, r3)
            java.lang.String r1 = "ZINK_DESCRIPTORS"
            r0.put(r1, r3)
            java.lang.String r1 = "OSMESA_LIB"
            r0.put(r1, r3)
            java.lang.String r1 = "POJAV_OSMESA_LIBRARY"
            r0.put(r1, r3)
            java.lang.String r1 = "OSMESA_LIBRARY"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_OSMESA"
            r0.put(r1, r3)
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererId() {
            r1 = this;
            java.lang.String r0 = "droidbridge_native_glfw_kgsl"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererLibrary() {
            r1 = this;
            java.lang.String r0 = "libEGL_mesa.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererName() {
            r1 = this;
            java.lang.String r0 = "DroidBridge Native Mesa"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getUniqueIdentifier() {
            r1 = this;
            java.lang.String r0 = "9cda3f9b-7d58-4c55-a763-64c5c8c1f001"
            return r0
    }
}
