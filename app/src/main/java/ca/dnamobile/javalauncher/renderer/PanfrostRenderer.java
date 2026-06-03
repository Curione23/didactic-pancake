package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class PanfrostRenderer implements ca.dnamobile.javalauncher.renderer.RendererInterface {
    public PanfrostRenderer() {
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
            java.lang.String r0 = "Gallium renderer intended for compatible Mali/Panfrost devices."
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
            r3 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "GALLIUM_DRIVER"
            java.lang.String r2 = "panfrost"
            r0.put(r1, r2)
            java.lang.String r1 = "MESA_LOADER_DRIVER_OVERRIDE"
            r0.put(r1, r2)
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererId() {
            r1 = this;
            java.lang.String r0 = "gallium_panfrost"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererLibrary() {
            r1 = this;
            java.lang.String r0 = "libOSMesa_2300d.so"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererName() {
            r1 = this;
            java.lang.String r0 = "Panfrost (Mali)"
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getUniqueIdentifier() {
            r1 = this;
            java.lang.String r0 = "9b2808c4-11af-4c72-a9c6-94c940396475"
            return r0
    }
}
