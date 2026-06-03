package ca.dnamobile.javalauncher.notifications;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherNotificationPermissionHelper {
    private static final java.lang.String KEY_BACKGROUND_INSTALL_NOTIFICATIONS = "background_install_notifications";
    private static final java.lang.String KEY_LAUNCH_PROMPT_SHOWN = "notification_launch_prompt_shown";
    private static final java.lang.String PREFS = "java_launcher_notification_permissions";

    private LauncherNotificationPermissionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canShowBackgroundInstallNotification(android.content.Context r1) {
            boolean r0 = isBackgroundInstallNotificationsEnabled(r1)
            if (r0 == 0) goto Le
            boolean r1 = hasPostNotificationsPermission(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private static android.content.SharedPreferences getPrefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "java_launcher_notification_permissions"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static boolean hasPostNotificationsPermission(android.content.Context r2) {
            boolean r0 = requiresRuntimePermission()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            int r2 = r2.checkSelfPermission(r0)
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public static boolean isBackgroundInstallNotificationsEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = getPrefs(r2)
            java.lang.String r0 = "background_install_notifications"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static void markLaunchPromptShown(android.content.Context r2) {
            android.content.SharedPreferences r2 = getPrefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "notification_launch_prompt_shown"
            r1 = 1
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r1)
            r2.apply()
            return
    }

    public static void openAppNotificationSettings(android.app.Activity r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = "android.provider.extra.APP_PACKAGE"
            java.lang.String r2 = r3.getPackageName()
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r3.startActivity(r0)     // Catch: java.lang.Throwable -> L15
            goto L3a
        L15:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "package:"
            r1.<init>(r2)
            java.lang.String r2 = r3.getPackageName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.content.Intent r0 = r0.setData(r1)
            r3.startActivity(r0)
        L3a:
            return
    }

    public static void requestPostNotificationsPermission(androidx.activity.result.ActivityResultLauncher<java.lang.String> r1) {
            boolean r0 = requiresRuntimePermission()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            r1.launch(r0)
            return
    }

    public static boolean requiresRuntimePermission() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static void setBackgroundInstallNotificationsEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = getPrefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "background_install_notifications"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean shouldShowLaunchPrompt(android.content.Context r2) {
            boolean r0 = requiresRuntimePermission()
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = hasPostNotificationsPermission(r2)
            if (r0 != 0) goto L1a
            android.content.SharedPreferences r2 = getPrefs(r2)
            java.lang.String r0 = "notification_launch_prompt_shown"
            boolean r2 = r2.getBoolean(r0, r1)
            if (r2 != 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }
}
