package ca.dnamobile.javalauncher.storage;

/* JADX INFO: loaded from: classes.dex */
public final class StorageLocation {
    private final boolean defaultLocation;
    private final java.lang.String displayName;
    private final java.lang.String id;
    private final java.lang.String launcherHomePath;
    private final java.lang.String minecraftHomePath;
    private final java.lang.String summary;
    private final java.lang.String uriString;
    private final boolean usableForFileLaunch;

    public StorageLocation(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.displayName = r2
            r0.summary = r3
            r0.uriString = r4
            r0.launcherHomePath = r5
            r0.minecraftHomePath = r6
            r0.defaultLocation = r7
            r0.usableForFileLaunch = r8
            return
    }

    public StorageLocation(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            r9 = this;
            r5 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r7 = r14
            r8 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getLauncherHomePath() {
            r1 = this;
            java.lang.String r0 = r1.launcherHomePath
            return r0
    }

    public java.lang.String getMinecraftHomePath() {
            r1 = this;
            java.lang.String r0 = r1.minecraftHomePath
            return r0
    }

    public java.lang.String getSummary() {
            r1 = this;
            java.lang.String r0 = r1.summary
            return r0
    }

    public java.lang.String getUriString() {
            r1 = this;
            java.lang.String r0 = r1.uriString
            return r0
    }

    public boolean isDefaultLocation() {
            r1 = this;
            boolean r0 = r1.defaultLocation
            return r0
    }

    public boolean isUsableForFileLaunch() {
            r1 = this;
            boolean r0 = r1.usableForFileLaunch
            return r0
    }
}
