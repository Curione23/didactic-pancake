package ca.dnamobile.javalauncher.fancymenu;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherAccountGate {
    private LauncherAccountGate() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean blockOfflineModeIfNeeded(android.app.Activity r1, ca.dnamobile.javalauncher.data.AccountStore r2, java.lang.Runnable r3) {
            boolean r2 = ca.dnamobile.javalauncher.modmanager.ModManagerTools.canUseOfflineMode(r2)
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
            ca.dnamobile.javalauncher.fancymenu.LauncherAccountGate$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.fancymenu.LauncherAccountGate$$ExternalSyntheticLambda1
            r0.<init>(r3)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
            r1.show()
            r1 = 1
            return r1
    }

    static /* synthetic */ void lambda$blockOfflineModeIfNeeded$1(java.lang.Runnable r0, android.content.DialogInterface r1, int r2) {
            r0.run()
            return
    }

    static /* synthetic */ void lambda$requireMicrosoftLoginBeforeInstall$0(java.lang.Runnable r0, android.content.DialogInterface r1, int r2) {
            r0.run()
            return
    }

    public static boolean requireMicrosoftLoginBeforeInstall(android.app.Activity r1, ca.dnamobile.javalauncher.data.AccountStore r2, java.lang.Runnable r3) {
            boolean r2 = ca.dnamobile.javalauncher.modmanager.ModManagerTools.canInstallGame(r2)
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
            ca.dnamobile.javalauncher.fancymenu.LauncherAccountGate$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.fancymenu.LauncherAccountGate$$ExternalSyntheticLambda0
            r0.<init>(r3)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r0)
            r1.show()
            r1 = 1
            return r1
    }
}
