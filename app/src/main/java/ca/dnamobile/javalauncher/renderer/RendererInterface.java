package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public interface RendererInterface {
    java.util.List<java.lang.String> getDlopenLibrary();

    default java.util.List<java.io.File> getLibrarySearchPaths() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    java.lang.String getRendererDescription();

    default java.lang.String getRendererEGL() {
            r1 = this;
            r0 = 0
            return r0
    }

    java.util.Map<java.lang.String, java.lang.String> getRendererEnv();

    java.lang.String getRendererId();

    java.lang.String getRendererLibrary();

    java.lang.String getRendererName();

    java.lang.String getUniqueIdentifier();

    default boolean isExternalPlugin() {
            r1 = this;
            r0 = 0
            return r0
    }
}
