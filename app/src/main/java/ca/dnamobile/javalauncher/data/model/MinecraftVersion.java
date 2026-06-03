package ca.dnamobile.javalauncher.data.model;

/* JADX INFO: loaded from: classes.dex */
public class MinecraftVersion {
    private final java.lang.String id;
    private final java.lang.String metadataUrl;
    private final java.lang.String releaseTime;
    private final java.lang.String type;

    public MinecraftVersion(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.type = r2
            r0.releaseTime = r3
            r0.metadataUrl = r4
            return
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getMetadataUrl() {
            r1 = this;
            java.lang.String r0 = r1.metadataUrl
            return r0
    }

    public java.lang.String getReleaseTime() {
            r1 = this;
            java.lang.String r0 = r1.releaseTime
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }
}
