package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public enum ModManagerSource extends java.lang.Enum<ca.dnamobile.javalauncher.modmanager.ModManagerSource> {
    private static final /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerSource[] $VALUES = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerSource CURSEFORGE = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerSource MANUAL = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerSource MODRINTH = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerSource UNKNOWN = null;
    private final java.lang.String displayName;
    private final int iconRes;
    private final java.lang.String id;

    private static /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerSource[] $values() {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r2 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MANUAL
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r3 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            ca.dnamobile.javalauncher.modmanager.ModManagerSource[] r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerSource[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = new ca.dnamobile.javalauncher.modmanager.ModManagerSource
            java.lang.String r4 = "Modrinth"
            int r5 = ca.dnamobile.javalauncher.R.drawable.ic_source_modrinth_24
            java.lang.String r1 = "MODRINTH"
            r2 = 0
            java.lang.String r3 = "modrinth"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH = r6
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerSource
            java.lang.String r11 = "CurseForge"
            int r12 = ca.dnamobile.javalauncher.R.drawable.ic_source_curseforge_24
            java.lang.String r8 = "CURSEFORGE"
            r9 = 1
            java.lang.String r10 = "curseforge"
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerSource
            java.lang.String r5 = "Manual"
            r6 = 0
            java.lang.String r2 = "MANUAL"
            r3 = 2
            java.lang.String r4 = "manual"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource.MANUAL = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerSource
            java.lang.String r11 = "Unknown"
            r12 = 0
            java.lang.String r8 = "UNKNOWN"
            r9 = 3
            java.lang.String r10 = "unknown"
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerSource[] r0 = $values()
            ca.dnamobile.javalauncher.modmanager.ModManagerSource.$VALUES = r0
            return
    }

    ModManagerSource(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.id = r3
            r0.displayName = r4
            r0.iconRes = r5
            return
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerSource fromId(java.lang.String r6) {
            if (r6 != 0) goto L5
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            return r6
        L5:
            java.lang.String r6 = r6.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L18
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            return r6
        L18:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L1e:
            if (r2 >= r1) goto L3f
            r3 = r0[r2]
            java.lang.String r4 = r3.id
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L3e
            java.lang.String r4 = r3.name()
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L3b
            goto L3e
        L3b:
            int r2 = r2 + 1
            goto L1e
        L3e:
            return r3
        L3f:
            java.lang.String r0 = "modrinth"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L4a
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MODRINTH
            return r6
        L4a:
            java.lang.String r0 = "curseforge"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L69
            java.lang.String r0 = "curse_forge"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L5b
            goto L69
        L5b:
            java.lang.String r0 = "manual"
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L66
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.MANUAL
            return r6
        L66:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.UNKNOWN
            return r6
        L69:
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r6 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.CURSEFORGE
            return r6
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerSource valueOf(java.lang.String r1) {
            java.lang.Class<ca.dnamobile.javalauncher.modmanager.ModManagerSource> r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerSource r1 = (ca.dnamobile.javalauncher.modmanager.ModManagerSource) r1
            return r1
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerSource[] values() {
            ca.dnamobile.javalauncher.modmanager.ModManagerSource[] r0 = ca.dnamobile.javalauncher.modmanager.ModManagerSource.$VALUES
            java.lang.Object r0 = r0.clone()
            ca.dnamobile.javalauncher.modmanager.ModManagerSource[] r0 = (ca.dnamobile.javalauncher.modmanager.ModManagerSource[]) r0
            return r0
    }

    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public int getIconRes() {
            r1 = this;
            int r0 = r1.iconRes
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public boolean hasIcon() {
            r1 = this;
            int r0 = r1.iconRes
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
