package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public enum ModManagerContentType extends java.lang.Enum<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> {
    private static final /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] $VALUES = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerContentType MODPACKS = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerContentType MODS = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerContentType RESOURCEPACKS = null;
    public static final ca.dnamobile.javalauncher.modmanager.ModManagerContentType SHADERPACKS = null;
    private final int curseForgeClassId;
    private final java.lang.String intentValue;
    private final java.lang.String modrinthProjectType;
    private final java.lang.String targetFolderName;

    private static /* synthetic */ ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] $values() {
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r2 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r3 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerContentType[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r7 = new ca.dnamobile.javalauncher.modmanager.ModManagerContentType
            java.lang.String r5 = "mods"
            r6 = 6
            java.lang.String r1 = "MODS"
            r2 = 0
            java.lang.String r3 = "mods"
            java.lang.String r4 = "mod"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS = r7
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerContentType
            java.lang.String r13 = "modpacks"
            r14 = 4471(0x1177, float:6.265E-42)
            java.lang.String r9 = "MODPACKS"
            r10 = 1
            java.lang.String r11 = "modpacks"
            java.lang.String r12 = "modpack"
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerContentType
            java.lang.String r6 = "resourcepacks"
            r7 = 12
            java.lang.String r2 = "RESOURCEPACKS"
            r3 = 2
            java.lang.String r4 = "resourcepacks"
            java.lang.String r5 = "resourcepack"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerContentType
            java.lang.String r13 = "shaderpacks"
            r14 = 6552(0x1998, float:9.181E-42)
            java.lang.String r9 = "SHADERPACKS"
            r10 = 3
            java.lang.String r11 = "shaderpacks"
            java.lang.String r12 = "shader"
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS = r0
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = $values()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType.$VALUES = r0
            return
    }

    ModManagerContentType(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.intentValue = r3
            r0.modrinthProjectType = r4
            r0.targetFolderName = r5
            r0.curseForgeClassId = r6
            return
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerContentType fromValue(java.lang.String r5) {
            if (r5 != 0) goto L5
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r5
        L5:
            java.lang.String r5 = r5.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            r0 = 45
            r1 = 95
            java.lang.String r5 = r5.replace(r0, r1)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L20
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r5
        L20:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L26:
            if (r2 >= r1) goto L51
            r3 = r0[r2]
            java.lang.String r4 = r3.intentValue
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L50
            java.lang.String r4 = r3.name()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L50
            java.lang.String r4 = r3.modrinthProjectType
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L50
            java.lang.String r4 = r3.targetFolderName
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L4d
            goto L50
        L4d:
            int r2 = r2 + 1
            goto L26
        L50:
            return r3
        L51:
            java.lang.String r0 = "resource_packs"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L95
            java.lang.String r0 = "resource-pack"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L62
            goto L95
        L62:
            java.lang.String r0 = "shader"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L92
            java.lang.String r0 = "shaders"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L73
            goto L92
        L73:
            java.lang.String r0 = "pack"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "packs"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "modpack"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L8c
            goto L8f
        L8c:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            return r5
        L8f:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            return r5
        L92:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.SHADERPACKS
            return r5
        L95:
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r5 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.RESOURCEPACKS
            return r5
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerContentType valueOf(java.lang.String r1) {
            java.lang.Class<ca.dnamobile.javalauncher.modmanager.ModManagerContentType> r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r1 = (ca.dnamobile.javalauncher.modmanager.ModManagerContentType) r1
            return r1
    }

    public static ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] values() {
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.$VALUES
            java.lang.Object r0 = r0.clone()
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType[] r0 = (ca.dnamobile.javalauncher.modmanager.ModManagerContentType[]) r0
            return r0
    }

    public int getCurseForgeClassId() {
            r1 = this;
            int r0 = r1.curseForgeClassId
            return r0
    }

    public java.lang.String getIntentValue() {
            r1 = this;
            java.lang.String r0 = r1.intentValue
            return r0
    }

    public java.lang.String getModrinthProjectType() {
            r1 = this;
            java.lang.String r0 = r1.modrinthProjectType
            return r0
    }

    public java.io.File getTargetDirectory(java.io.File r3) {
            r2 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r2 != r0) goto L5
            return r3
        L5:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.targetFolderName
            r0.<init>(r3, r1)
            return r0
    }

    public java.lang.String getTargetFolderName() {
            r1 = this;
            java.lang.String r0 = r1.targetFolderName
            return r0
    }

    public boolean isInstallableIntoExistingInstance() {
            r1 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r1 == r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isLoaderSpecific() {
            r1 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            if (r1 == r0) goto Lb
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODPACKS
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public boolean supportsDependencies() {
            r1 = this;
            ca.dnamobile.javalauncher.modmanager.ModManagerContentType r0 = ca.dnamobile.javalauncher.modmanager.ModManagerContentType.MODS
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
