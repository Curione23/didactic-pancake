package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class PluginRenderer implements ca.dnamobile.javalauncher.renderer.RendererInterface {
    private final java.util.List<java.lang.String> dlopenLibrary;
    private final java.util.List<java.io.File> librarySearchPaths;
    private final java.lang.String rendererDescription;
    private final java.lang.String rendererEgl;
    private final java.util.Map<java.lang.String, java.lang.String> rendererEnv;
    private final java.lang.String rendererId;
    private final java.lang.String rendererLibrary;
    private final java.lang.String rendererName;
    private final java.lang.String uniqueIdentifier;

    public PluginRenderer(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5, java.util.List<java.lang.String> r6, java.lang.String r7, java.lang.String r8, java.util.List<java.io.File> r9) {
            r0 = this;
            r0.<init>()
            r0.rendererId = r1
            r0.uniqueIdentifier = r2
            r0.rendererName = r3
            r0.rendererDescription = r4
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r5)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.rendererEnv = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.dlopenLibrary = r1
            r0.rendererLibrary = r7
            r0.rendererEgl = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.librarySearchPaths = r1
            return
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.util.List<java.lang.String> getDlopenLibrary() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.dlopenLibrary
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.util.List<java.io.File> getLibrarySearchPaths() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.librarySearchPaths
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererDescription() {
            r1 = this;
            java.lang.String r0 = r1.rendererDescription
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererEGL() {
            r1 = this;
            java.lang.String r0 = r1.rendererEgl
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.util.Map<java.lang.String, java.lang.String> getRendererEnv() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.rendererEnv
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererId() {
            r1 = this;
            java.lang.String r0 = r1.rendererId
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererLibrary() {
            r1 = this;
            java.lang.String r0 = r1.rendererLibrary
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getRendererName() {
            r1 = this;
            java.lang.String r0 = r1.rendererName
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public java.lang.String getUniqueIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.uniqueIdentifier
            return r0
    }

    @Override // ca.dnamobile.javalauncher.renderer.RendererInterface
    public boolean isExternalPlugin() {
            r1 = this;
            r0 = 1
            return r0
    }
}
