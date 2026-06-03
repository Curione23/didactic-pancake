package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class GL4ESRenderer implements ca.dnamobile.javalauncher.renderer.RendererInterface {
    public GL4ESRenderer() {
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
            java.lang.String r0 = "Legacy OpenGL wrapper. Works best for Minecraft 1.21.4 and below."
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererEGL() {
            r1 = this;
            java.lang.String r0 = "libEGL.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.util.Map<java.lang.String, java.lang.String> getRendererEnv() {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "LIBGL_USE_MC_COLOR"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_GL"
            java.lang.String r3 = "21"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_ES"
            java.lang.String r3 = "3"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_NORMALIZE"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_NOERROR"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_MIPMAP"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_USEVBO"
            r0.put(r1, r2)
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererId() {
            r1 = this;
            java.lang.String r0 = "opengles2"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererLibrary() {
            r1 = this;
            java.lang.String r0 = "libgl4es_114.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererName() {
            r1 = this;
            java.lang.String r0 = "GL4ES"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getUniqueIdentifier() {
            r1 = this;
            java.lang.String r0 = "8b52d82d-8f6d-4d3a-a767-dc93f8b72fc7"
            return r0
    }
}
