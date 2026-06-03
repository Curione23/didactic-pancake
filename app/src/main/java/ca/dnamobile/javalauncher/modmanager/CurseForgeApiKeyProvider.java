package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class CurseForgeApiKeyProvider {
    private CurseForgeApiKeyProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isRealKey(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.trim()
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L27
            java.lang.String r1 = "YOUR_CURSEFORGE_API_KEY"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L27
            java.lang.String r1 = "PUT_YOUR_CURSEFORGE_API_KEY_HERE"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L27
            java.lang.String r1 = "REPLACE_"
            boolean r2 = r2.startsWith(r1)
            if (r2 != 0) goto L27
            r0 = 1
        L27:
            return r0
    }

    public static java.lang.String resolve() {
            java.lang.String r0 = "$2a$10$RrIlPprgFCiN5Xncl4jTAuIDUy0Gpp2tBDzKoxZunRNuxlgkouSGO"
            boolean r1 = isRealKey(r0)
            if (r1 == 0) goto Ld
            java.lang.String r0 = r0.trim()
            goto Lf
        Ld:
            java.lang.String r0 = ""
        Lf:
            return r0
    }
}
