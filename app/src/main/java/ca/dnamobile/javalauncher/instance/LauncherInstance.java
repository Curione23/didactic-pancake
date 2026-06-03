package ca.dnamobile.javalauncher.instance;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherInstance {
    private final java.lang.String baseVersionId;
    private final java.lang.String createdAt;
    private final java.io.File gameDirectory;
    private final java.io.File iconFile;
    private final java.lang.String id;
    private final boolean isolated;
    private final java.lang.String loader;
    private final java.lang.String minecraftVersionId;
    private final java.lang.String name;
    private final java.io.File rootDirectory;
    private final java.lang.String versionType;

    LauncherInstance(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.io.File r18, java.io.File r19, java.io.File r20, java.lang.String r21) {
            r12 = this;
            r11 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    LauncherInstance(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.io.File r18, java.io.File r19, java.io.File r20, java.lang.String r21, boolean r22) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    LauncherInstance(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.io.File r19, java.io.File r20, java.io.File r21, java.lang.String r22) {
            r12 = this;
            r11 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    LauncherInstance(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7, java.io.File r8, java.io.File r9, java.lang.String r10, boolean r11) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.name = r2
            r0.loader = r3
            r0.baseVersionId = r4
            java.lang.String r1 = r5.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L17
        L16:
            r4 = r5
        L17:
            r0.minecraftVersionId = r4
            r0.versionType = r6
            r0.rootDirectory = r7
            r0.gameDirectory = r8
            r0.iconFile = r9
            r0.createdAt = r10
            r0.isolated = r11
            return
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstance sharedInstalledVersion(java.lang.String r1, java.lang.String r2, java.io.File r3, java.lang.String r4) {
            java.lang.String r0 = "Vanilla"
            ca.dnamobile.javalauncher.instance.LauncherInstance r1 = sharedInstalledVersion(r1, r2, r3, r4, r0)
            return r1
    }

    public static ca.dnamobile.javalauncher.instance.LauncherInstance sharedInstalledVersion(java.lang.String r12, java.lang.String r13, java.io.File r14, java.lang.String r15, java.lang.String r16) {
            ca.dnamobile.javalauncher.instance.LauncherInstance r11 = new ca.dnamobile.javalauncher.instance.LauncherInstance
            r4 = r12
            r7 = r14
            java.lang.String r1 = sharedInstanceId(r12, r14)
            r8 = 0
            r10 = 0
            r0 = r11
            r2 = r12
            r3 = r16
            r5 = r13
            r6 = r14
            r9 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    public static java.lang.String sharedInstanceId(java.lang.String r2, java.io.File r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "shared-"
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            int r3 = r3.hashCode()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "-"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public java.lang.String getBaseVersionId() {
            r1 = this;
            java.lang.String r0 = r1.baseVersionId
            return r0
    }

    public java.lang.String getCreatedAt() {
            r1 = this;
            java.lang.String r0 = r1.createdAt
            return r0
    }

    public java.io.File getGameDirectory() {
            r1 = this;
            java.io.File r0 = r1.gameDirectory
            return r0
    }

    public java.io.File getIconFile() {
            r1 = this;
            java.io.File r0 = r1.iconFile
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getLoader() {
            r1 = this;
            java.lang.String r0 = r1.loader
            return r0
    }

    public java.lang.String getMinecraftVersionId() {
            r1 = this;
            java.lang.String r0 = r1.minecraftVersionId
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.io.File getRootDirectory() {
            r1 = this;
            java.io.File r0 = r1.rootDirectory
            return r0
    }

    public java.lang.String getVersionType() {
            r1 = this;
            java.lang.String r0 = r1.versionType
            return r0
    }

    public boolean isIsolated() {
            r1 = this;
            boolean r0 = r1.isolated
            return r0
    }
}
