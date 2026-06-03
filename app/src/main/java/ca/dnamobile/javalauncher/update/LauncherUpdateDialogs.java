package ca.dnamobile.javalauncher.update;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherUpdateDialogs {


    /* JADX INFO: renamed from: -$$Nest$smisActivityAlive, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m585$$Nest$smisActivityAlive(android.app.Activity r0) {
            boolean r0 = isActivityAlive(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smshowUpdateAvailableDialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m586$$Nest$smshowUpdateAvailableDialog(android.app.Activity r0, ca.dnamobile.javalauncher.update.LauncherUpdateInfo r1) {
            showUpdateAvailableDialog(r0, r1)
            return
    }

    private LauncherUpdateDialogs() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void checkInternal(android.app.Activity r1, boolean r2) {
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$1 r0 = new ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$1
            r0.<init>(r1, r2)
            ca.dnamobile.javalauncher.update.LauncherUpdateChecker.checkAsync(r1, r0)
            return
    }

    public static void checkManually(android.app.Activity r2) {
            java.lang.String r0 = "Checking for launcher updates..."
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            ca.dnamobile.javalauncher.update.LauncherUpdatePreferences.clearIgnoredTag(r2)
            r0 = 1
            checkInternal(r2, r0)
            return
    }

    public static void checkOnStartup(android.app.Activity r4) {
            boolean r0 = ca.dnamobile.javalauncher.update.LauncherUpdatePreferences.shouldAutoCheckNow(r4)
            if (r0 != 0) goto L7
            return
        L7:
            ca.dnamobile.javalauncher.update.LauncherUpdatePreferences.markAutoCheckedNow(r4)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda3
            r1.<init>(r4)
            r2 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r1, r2)
            return
    }

    private static boolean isActivityAlive(android.app.Activity r1) {
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r1.isDestroyed()
            r1 = r1 ^ 1
            return r1
    }

    static /* synthetic */ void lambda$checkOnStartup$0(android.app.Activity r1) {
            boolean r0 = isActivityAlive(r1)
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            checkInternal(r1, r0)
            return
    }

    static /* synthetic */ void lambda$showUpdateAvailableDialog$1(android.app.Activity r0, ca.dnamobile.javalauncher.update.LauncherUpdateInfo r1, android.content.DialogInterface r2, int r3) {
            java.lang.String r1 = r1.tagName
            ca.dnamobile.javalauncher.update.LauncherUpdatePreferences.ignoreTag(r0, r1)
            return
    }

    static /* synthetic */ void lambda$showUpdateAvailableDialog$2(android.app.Activity r0, ca.dnamobile.javalauncher.update.LauncherUpdateInfo r1, android.content.DialogInterface r2, int r3) {
            java.lang.String r1 = r1.apkDownloadUrl
            java.lang.String r2 = "Unable to open APK download link."
            openUrl(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$showUpdateAvailableDialog$3(android.app.Activity r0, ca.dnamobile.javalauncher.update.LauncherUpdateInfo r1, android.content.DialogInterface r2, int r3) {
            java.lang.String r1 = r1.releaseUrl
            java.lang.String r2 = "Unable to open GitHub release page."
            openUrl(r0, r1, r2)
            return
    }

    private static void openUrl(android.app.Activity r3, java.lang.String r4, java.lang.String r5) {
            r0 = 1
            if (r4 == 0) goto L25
            java.lang.String r1 = r4.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le
            goto L25
        Le:
            android.content.Intent r1 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L1d
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: android.content.ActivityNotFoundException -> L1d
            r1.<init>(r2, r4)     // Catch: android.content.ActivityNotFoundException -> L1d
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L1d
            goto L24
        L1d:
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r5, r0)
            r3.show()
        L24:
            return
        L25:
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r5, r0)
            r3.show()
            return
    }

    private static void showUpdateAvailableDialog(android.app.Activity r4, ca.dnamobile.javalauncher.update.LauncherUpdateInfo r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Current version: 0.3.9\nLatest version: "
            r0.<init>(r1)
            java.lang.String r1 = r5.getDisplayVersion()
            java.lang.StringBuilder r1 = r0.append(r1)
            r2 = 10
            r1.append(r2)
            boolean r1 = r5.hasApkAsset()
            if (r1 == 0) goto L40
            java.lang.String r1 = "Download: "
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r3 = r5.apkAssetName
            if (r3 != 0) goto L27
            java.lang.String r3 = "APK"
            goto L29
        L27:
            java.lang.String r3 = r5.apkAssetName
        L29:
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " ("
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = r5.getDisplaySize()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = ")\n"
            r1.append(r3)
        L40:
            boolean r1 = r5.prerelease
            if (r1 == 0) goto L49
            java.lang.String r1 = "\nThis release is marked as a pre-release.\n"
            r0.append(r1)
        L49:
            java.lang.String r1 = r5.releaseNotes
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L5e
            java.lang.StringBuilder r1 = r0.append(r2)
            java.lang.String r2 = r5.releaseNotes
            java.lang.String r2 = trimReleaseNotes(r2)
            r1.append(r2)
        L5e:
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r4)
            java.lang.String r2 = "Launcher update available"
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r0 = r0.toString()
            androidx.appcompat.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            java.lang.String r1 = "Later"
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda0
            r1.<init>(r4, r5)
            java.lang.String r2 = "Ignore this version"
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNeutralButton(r2, r1)
            boolean r1 = r5.hasApkAsset()
            if (r1 == 0) goto L94
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda1
            r1.<init>(r4, r5)
            java.lang.String r4 = "Download APK"
            r0.setPositiveButton(r4, r1)
            goto L9e
        L94:
            ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.update.LauncherUpdateDialogs$$ExternalSyntheticLambda2
            r1.<init>(r4, r5)
            java.lang.String r4 = "Open release"
            r0.setPositiveButton(r4, r1)
        L9e:
            r0.show()
            return
    }

    private static java.lang.String trimReleaseNotes(java.lang.String r3) {
            java.lang.String r3 = r3.trim()
            int r0 = r3.length()
            r1 = 1200(0x4b0, float:1.682E-42)
            if (r0 > r1) goto Ld
            return r3
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            java.lang.String r3 = r3.substring(r2, r1)
            java.lang.String r3 = r3.trim()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "\n\n..."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }
}
