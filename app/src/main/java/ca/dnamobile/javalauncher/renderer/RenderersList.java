package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class RenderersList {
    private final java.util.List<java.lang.String> rendererIdentifier;
    private final java.util.List<java.lang.String> rendererNames;

    public RenderersList(java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            r1.rendererIdentifier = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.rendererNames = r2
            return
    }

    public java.util.List<java.lang.String> getRendererIdentifier() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.rendererIdentifier
            return r0
    }

    public java.util.List<java.lang.String> getRendererNames() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.rendererNames
            return r0
    }
}
