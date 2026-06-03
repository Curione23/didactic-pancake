package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class VirGLRenderer implements ca.dnamobile.javalauncher.renderer.RendererInterface {
    public VirGLRenderer() {
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
            java.lang.String r0 = "Legacy VirGL renderer for older device setups."
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
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            if (r1 == 0) goto L1b
            java.io.File r1 = new java.io.File
            java.io.File r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r3 = ".virgl_test"
            r1.<init>(r2, r3)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "VTEST_SOCKET_NAME"
            r0.put(r2, r1)
        L1b:
            java.lang.String r1 = "GALLIUM_DRIVER"
            java.lang.String r2 = "virpipe"
            r0.put(r1, r2)
            java.lang.String r1 = "MESA_LOADER_DRIVER_OVERRIDE"
            r0.put(r1, r2)
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererId() {
            r1 = this;
            java.lang.String r0 = "gallium_virgl"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererLibrary() {
            r1 = this;
            java.lang.String r0 = "libOSMesa_2121.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererName() {
            r1 = this;
            java.lang.String r0 = "VirGLRenderer"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getUniqueIdentifier() {
            r1 = this;
            java.lang.String r0 = "a3ccc1fe-de3f-4a81-8c45-2485181b63b3"
            return r0
    }
}
