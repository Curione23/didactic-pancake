package ca.dnamobile.javalauncher.feature.unpack;

/* JADX INFO: loaded from: classes.dex */
public enum Jre extends java.lang.Enum<ca.dnamobile.javalauncher.feature.unpack.Jre> {
    private static final /* synthetic */ ca.dnamobile.javalauncher.feature.unpack.Jre[] $VALUES = null;
    public static final ca.dnamobile.javalauncher.feature.unpack.Jre JRE_17 = null;
    public static final ca.dnamobile.javalauncher.feature.unpack.Jre JRE_21 = null;
    public static final ca.dnamobile.javalauncher.feature.unpack.Jre JRE_25 = null;
    public static final ca.dnamobile.javalauncher.feature.unpack.Jre JRE_8 = null;
    public final java.lang.String jreName;
    public final java.lang.String jrePath;
    public final int summary;

    private static /* synthetic */ ca.dnamobile.javalauncher.feature.unpack.Jre[] $values() {
            ca.dnamobile.javalauncher.feature.unpack.Jre r0 = ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_8
            ca.dnamobile.javalauncher.feature.unpack.Jre r1 = ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_17
            ca.dnamobile.javalauncher.feature.unpack.Jre r2 = ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_21
            ca.dnamobile.javalauncher.feature.unpack.Jre r3 = ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_25
            ca.dnamobile.javalauncher.feature.unpack.Jre[] r0 = new ca.dnamobile.javalauncher.feature.unpack.Jre[]{r0, r1, r2, r3}
            return r0
    }

    static {
            ca.dnamobile.javalauncher.feature.unpack.Jre r6 = new ca.dnamobile.javalauncher.feature.unpack.Jre
            java.lang.String r4 = "Internal-8"
            int r5 = ca.dnamobile.javalauncher.R.string.splash_screen_jre_8
            java.lang.String r1 = "JRE_8"
            r2 = 0
            java.lang.String r3 = "components/jre-8"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_8 = r6
            ca.dnamobile.javalauncher.feature.unpack.Jre r0 = new ca.dnamobile.javalauncher.feature.unpack.Jre
            java.lang.String r11 = "Internal-17"
            int r12 = ca.dnamobile.javalauncher.R.string.splash_screen_jre_17
            java.lang.String r8 = "JRE_17"
            r9 = 1
            java.lang.String r10 = "components/jre-17"
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_17 = r0
            ca.dnamobile.javalauncher.feature.unpack.Jre r0 = new ca.dnamobile.javalauncher.feature.unpack.Jre
            java.lang.String r5 = "Internal-21"
            int r6 = ca.dnamobile.javalauncher.R.string.splash_screen_jre_21
            java.lang.String r2 = "JRE_21"
            r3 = 2
            java.lang.String r4 = "components/jre-21"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_21 = r0
            ca.dnamobile.javalauncher.feature.unpack.Jre r0 = new ca.dnamobile.javalauncher.feature.unpack.Jre
            java.lang.String r11 = "Internal-25"
            int r12 = ca.dnamobile.javalauncher.R.string.splash_screen_jre_25
            java.lang.String r8 = "JRE_25"
            r9 = 3
            java.lang.String r10 = "components/jre-25"
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            ca.dnamobile.javalauncher.feature.unpack.Jre.JRE_25 = r0
            ca.dnamobile.javalauncher.feature.unpack.Jre[] r0 = $values()
            ca.dnamobile.javalauncher.feature.unpack.Jre.$VALUES = r0
            return
    }

    Jre(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.jrePath = r3
            r0.jreName = r4
            r0.summary = r5
            return
    }

    public static ca.dnamobile.javalauncher.feature.unpack.Jre valueOf(java.lang.String r1) {
            java.lang.Class<ca.dnamobile.javalauncher.feature.unpack.Jre> r0 = ca.dnamobile.javalauncher.feature.unpack.Jre.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ca.dnamobile.javalauncher.feature.unpack.Jre r1 = (ca.dnamobile.javalauncher.feature.unpack.Jre) r1
            return r1
    }

    public static ca.dnamobile.javalauncher.feature.unpack.Jre[] values() {
            ca.dnamobile.javalauncher.feature.unpack.Jre[] r0 = ca.dnamobile.javalauncher.feature.unpack.Jre.$VALUES
            java.lang.Object r0 = r0.clone()
            ca.dnamobile.javalauncher.feature.unpack.Jre[] r0 = (ca.dnamobile.javalauncher.feature.unpack.Jre[]) r0
            return r0
    }
}
