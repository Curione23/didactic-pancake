package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class VulkanZinkRenderer implements ca.dnamobile.javalauncher.renderer.RendererInterface {
    public VulkanZinkRenderer() {
            r0 = this;
            r0.<init>()
            return
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
            java.lang.String r0 = "Vulkan-backed OpenGL renderer. Useful for newer Minecraft versions when the device supports Vulkan."
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererEGL() {
            r1 = this;
            java.lang.String r0 = r1.getRendererLibrary()
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.util.Map<java.lang.String, java.lang.String> getRendererEnv() {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r2 = "4.6"
            r0.put(r1, r2)
            java.lang.String r1 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r2 = "460"
            r0.put(r1, r2)
            java.lang.String r1 = "GALLIUM_DRIVER"
            java.lang.String r2 = "zink"
            r0.put(r1, r2)
            java.lang.String r1 = "MESA_LOADER_DRIVER_OVERRIDE"
            r0.put(r1, r2)
            java.lang.String r1 = "MESA_NO_ERROR"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "LIB_MESA_NAME"
            java.lang.String r3 = r4.getRendererLibrary()
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_ES"
            java.lang.String r3 = "3"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_NOERROR"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_NORMALIZE"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_MIPMAP"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_NOINTOVLHACK"
            r0.put(r1, r2)
            java.lang.String r1 = "allow_higher_compat_version"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
            java.lang.String r1 = "allow_glsl_extension_directive_midshader"
            r0.put(r1, r2)
            java.lang.String r1 = "force_glsl_extensions_warn"
            r0.put(r1, r2)
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererId() {
            r1 = this;
            java.lang.String r0 = "vulkan_zink"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererLibrary() {
            r1 = this;
            java.lang.String r0 = "libOSMesa_8.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererName() {
            r1 = this;
            java.lang.String r0 = "Vulkan Zink"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getUniqueIdentifier() {
            r1 = this;
            java.lang.String r0 = "0fa435e2-46df-45c9-906c-b29606aaef00"
            return r0
    }
}
