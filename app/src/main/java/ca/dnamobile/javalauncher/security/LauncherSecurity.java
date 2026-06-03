package ca.dnamobile.javalauncher.security;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherSecurity {
    private LauncherSecurity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean allowsOfflineProfileAuth() {
            r0 = 0
            return r0
    }

    public static boolean hasValidMicrosoftSession(ca.dnamobile.javalauncher.data.AccountStore.Account r2) {
            if (r2 == 0) goto L36
            boolean r0 = r2.isMicrosoftAccount()
            if (r0 == 0) goto L36
            boolean r0 = r2.hasMinecraftSession()
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.minecraftAccessToken
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = r2.minecraftAccessToken
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = r2.minecraftName
            boolean r0 = isBlank(r0)
            if (r0 != 0) goto L36
            java.lang.String r2 = r2.minecraftUuid
            boolean r2 = isBlank(r2)
            if (r2 != 0) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            return r2
    }

    public static boolean hasValidMicrosoftSession(ca.dnamobile.javalauncher.data.AccountStore r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r1.load()     // Catch: java.lang.Throwable -> Ld
            boolean r1 = hasValidMicrosoftSession(r1)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            return r0
    }

    private static boolean isBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public static boolean isHardenedBuild() {
            r0 = 1
            return r0
    }

    public static ca.dnamobile.javalauncher.data.AccountStore.Account requireActiveMicrosoftAccount(android.content.Context r2, java.lang.String r3) {
            requireOfficialBuild(r2)
            ca.dnamobile.javalauncher.data.AccountStore r0 = new ca.dnamobile.javalauncher.data.AccountStore     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            ca.dnamobile.javalauncher.data.AccountStore$Account r2 = r0.load()     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r0 = hasValidMicrosoftSession(r2)
            if (r0 == 0) goto L15
            return r2
        L15:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A valid Microsoft/Minecraft account is required to "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static void requireOfficialBuild(android.content.Context r0) {
            ca.dnamobile.javalauncher.controls.ControlsMain.throwIfInvalidSignature(r0)
            return
    }

    public static void requireOfficialBuildAndMicrosoftSession(android.content.Context r1, ca.dnamobile.javalauncher.data.AccountStore.Account r2, java.lang.String r3) {
            requireOfficialBuild(r1)
            boolean r1 = allowsOfflineProfileAuth()
            if (r1 == 0) goto La
            return
        La:
            boolean r1 = hasValidMicrosoftSession(r2)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "A valid Microsoft/Minecraft account is required to "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
