package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModManagerTools {
    private ModManagerTools() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean blockInstallIfNeeded(android.app.Activity r1, ca.dnamobile.javalauncher.data.AccountStore r2) {
            boolean r2 = canInstallGame(r2)
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = ca.dnamobile.javalauncher.R.string.microsoft_login_required_install
            r0 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
            return r0
    }

    public static boolean blockOfflineIfNeeded(android.app.Activity r1, ca.dnamobile.javalauncher.data.AccountStore r2) {
            boolean r2 = canUseOfflineMode(r2)
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = ca.dnamobile.javalauncher.R.string.microsoft_login_required_offline
            r0 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
            return r0
    }

    public static boolean canInstallGame(ca.dnamobile.javalauncher.data.AccountStore r0) {
            boolean r0 = hasActiveMicrosoftAccount(r0)
            return r0
    }

    public static boolean canUseOfflineMode(ca.dnamobile.javalauncher.data.AccountStore r2) {
            boolean r0 = hasActiveMicrosoftAccount(r2)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = ca.dnamobile.javalauncher.security.LauncherSecurity.allowsOfflineProfileAuth()
            if (r0 == 0) goto L15
            boolean r2 = hasCompletedMicrosoftLoginOnce(r2)
            if (r2 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public static boolean hasActiveMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore r0) {
            ca.dnamobile.javalauncher.data.AccountStore$Account r0 = loadActiveAccount(r0)
            boolean r0 = isMicrosoftAccount(r0)
            return r0
    }

    public static boolean hasCompletedMicrosoftLoginOnce(ca.dnamobile.javalauncher.data.AccountStore r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            boolean r1 = r1.hasMicrosoftLoginCompletedOnce()     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
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

    private static boolean isMicrosoftAccount(ca.dnamobile.javalauncher.data.AccountStore.Account r0) {
            boolean r0 = ca.dnamobile.javalauncher.security.LauncherSecurity.hasValidMicrosoftSession(r0)
            return r0
    }

    static /* synthetic */ void lambda$requireActiveMicrosoftAccountBeforeInstall$0(java.lang.Runnable r0, android.content.DialogInterface r1, int r2) {
            r0.run()
            return
    }

    static /* synthetic */ void lambda$requireMicrosoftLoginHistoryBeforeLaunch$1(java.lang.Runnable r0, android.content.DialogInterface r1, int r2) {
            r0.run()
            return
    }

    private static ca.dnamobile.javalauncher.data.AccountStore.Account loadActiveAccount(ca.dnamobile.javalauncher.data.AccountStore r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            ca.dnamobile.javalauncher.data.AccountStore$Account r1 = r1.load()     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            return r0
    }

    public static boolean requireActiveMicrosoftAccountBeforeInstall(android.app.Activity r1, ca.dnamobile.javalauncher.data.AccountStore r2, java.lang.Runnable r3) {
            boolean r2 = canInstallGame(r2)
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.account_required_title
            android.app.AlertDialog$Builder r1 = r2.setTitle(r1)
            int r2 = ca.dnamobile.javalauncher.R.string.account_required_before_install_message
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r0 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r0)
            int r2 = ca.dnamobile.javalauncher.R.string.button_sign_in
            ca.dnamobile.javalauncher.modmanager.ModManagerTools$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerTools$$ExternalSyntheticLambda0
            r0.<init>(r3)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
            r1.show()
            r1 = 1
            return r1
    }

    public static boolean requireMicrosoftLoginHistoryBeforeLaunch(android.app.Activity r1, ca.dnamobile.javalauncher.data.AccountStore r2, java.lang.Runnable r3) {
            boolean r2 = canUseOfflineMode(r2)
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r1)
            int r1 = ca.dnamobile.javalauncher.R.string.offline_locked_title
            android.app.AlertDialog$Builder r1 = r2.setTitle(r1)
            int r2 = ca.dnamobile.javalauncher.R.string.offline_locked_message
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r0 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r0)
            int r2 = ca.dnamobile.javalauncher.R.string.button_sign_in
            ca.dnamobile.javalauncher.modmanager.ModManagerTools$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.modmanager.ModManagerTools$$ExternalSyntheticLambda1
            r0.<init>(r3)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
            r1.show()
            r1 = 1
            return r1
    }
}
