package ca.dnamobile.javalauncher.skin;

/* JADX INFO: loaded from: classes.dex */
public enum SkinModelType extends java.lang.Enum<ca.dnamobile.javalauncher.skin.SkinModelType> {
    private static final /* synthetic */ ca.dnamobile.javalauncher.skin.SkinModelType[] $VALUES = null;
    public static final ca.dnamobile.javalauncher.skin.SkinModelType CLASSIC = null;
    public static final ca.dnamobile.javalauncher.skin.SkinModelType NONE = null;
    public static final ca.dnamobile.javalauncher.skin.SkinModelType SLIM = null;
    public final java.lang.String id;

    private static /* synthetic */ ca.dnamobile.javalauncher.skin.SkinModelType[] $values() {
            ca.dnamobile.javalauncher.skin.SkinModelType r0 = ca.dnamobile.javalauncher.skin.SkinModelType.NONE
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
            ca.dnamobile.javalauncher.skin.SkinModelType r2 = ca.dnamobile.javalauncher.skin.SkinModelType.SLIM
            ca.dnamobile.javalauncher.skin.SkinModelType[] r0 = new ca.dnamobile.javalauncher.skin.SkinModelType[]{r0, r1, r2}
            return r0
    }

    static {
            ca.dnamobile.javalauncher.skin.SkinModelType r0 = new ca.dnamobile.javalauncher.skin.SkinModelType
            r1 = 0
            java.lang.String r2 = "none"
            java.lang.String r3 = "NONE"
            r0.<init>(r3, r1, r2)
            ca.dnamobile.javalauncher.skin.SkinModelType.NONE = r0
            ca.dnamobile.javalauncher.skin.SkinModelType r0 = new ca.dnamobile.javalauncher.skin.SkinModelType
            r1 = 1
            java.lang.String r2 = "classic"
            java.lang.String r3 = "CLASSIC"
            r0.<init>(r3, r1, r2)
            ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC = r0
            ca.dnamobile.javalauncher.skin.SkinModelType r0 = new ca.dnamobile.javalauncher.skin.SkinModelType
            r1 = 2
            java.lang.String r2 = "slim"
            java.lang.String r3 = "SLIM"
            r0.<init>(r3, r1, r2)
            ca.dnamobile.javalauncher.skin.SkinModelType.SLIM = r0
            ca.dnamobile.javalauncher.skin.SkinModelType[] r0 = $values()
            ca.dnamobile.javalauncher.skin.SkinModelType.$VALUES = r0
            return
    }

    SkinModelType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.id = r3
            return
    }

    public static ca.dnamobile.javalauncher.skin.SkinModelType fromId(java.lang.String r5) {
            if (r5 != 0) goto L5
            ca.dnamobile.javalauncher.skin.SkinModelType r5 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
            return r5
        L5:
            ca.dnamobile.javalauncher.skin.SkinModelType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            java.lang.String r4 = r3.id
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L18
            return r3
        L18:
            int r2 = r2 + 1
            goto Lb
        L1b:
            ca.dnamobile.javalauncher.skin.SkinModelType r5 = ca.dnamobile.javalauncher.skin.SkinModelType.CLASSIC
            return r5
    }

    public static ca.dnamobile.javalauncher.skin.SkinModelType valueOf(java.lang.String r1) {
            java.lang.Class<ca.dnamobile.javalauncher.skin.SkinModelType> r0 = ca.dnamobile.javalauncher.skin.SkinModelType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ca.dnamobile.javalauncher.skin.SkinModelType r1 = (ca.dnamobile.javalauncher.skin.SkinModelType) r1
            return r1
    }

    public static ca.dnamobile.javalauncher.skin.SkinModelType[] values() {
            ca.dnamobile.javalauncher.skin.SkinModelType[] r0 = ca.dnamobile.javalauncher.skin.SkinModelType.$VALUES
            java.lang.Object r0 = r0.clone()
            ca.dnamobile.javalauncher.skin.SkinModelType[] r0 = (ca.dnamobile.javalauncher.skin.SkinModelType[]) r0
            return r0
    }
}
