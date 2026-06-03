package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class KryptonRenderer implements ca.dnamobile.javalauncher.renderer.RendererInterface {
    public KryptonRenderer() {
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
            java.lang.String r0 = "Works with all versions but can have some graphics issues."
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
            java.lang.String r1 = "LIBGL_USE_MC_COLOR"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_GL"
            java.lang.String r3 = "31"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_ES"
            java.lang.String r3 = "3"
            r0.put(r1, r3)
            java.lang.String r1 = "LIBGL_NORMALIZE"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_NOERROR"
            r0.put(r1, r2)
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererId() {
            r1 = this;
            java.lang.String r0 = "opengles3"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererLibrary() {
            r1 = this;
            java.lang.String r0 = "libng_gl4es.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererName() {
            r1 = this;
            java.lang.String r0 = "Krypton Wrapper"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getUniqueIdentifier() {
            r1 = this;
            java.lang.String r0 = "e7b90ed6-e518-4d4e-93dc-5c7133cd5b31"
            return r0
    }
}
