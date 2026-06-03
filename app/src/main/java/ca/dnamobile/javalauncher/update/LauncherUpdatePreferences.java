package ca.dnamobile.javalauncher.update;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherUpdatePreferences {
    public static final long AUTO_CHECK_INTERVAL_MS = 43200000;
    private static final java.lang.String KEY_AUTO_CHECK_ENABLED = "auto_check_enabled";
    private static final java.lang.String KEY_IGNORED_TAG = "ignored_tag";
    private static final java.lang.String KEY_LAST_AUTO_CHECK_MS = "last_auto_check_ms";
    private static final java.lang.String PREFS = "launcher_update_checker";

    private LauncherUpdatePreferences() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearIgnoredTag(android.content.Context r1) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "ignored_tag"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            r1.apply()
            return
    }

    public static void ignoreTag(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "ignored_tag"
            java.lang.String r2 = r2.trim()
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static boolean isAutoCheckEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "auto_check_enabled"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isTagIgnored(android.content.Context r2, java.lang.String r3) {
            if (r3 == 0) goto L29
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L29
        Ld:
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "ignored_tag"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            java.lang.String r3 = r3.trim()
            if (r2 != 0) goto L20
            goto L24
        L20:
            java.lang.String r1 = r2.trim()
        L24:
            boolean r2 = r3.equalsIgnoreCase(r1)
            return r2
        L29:
            r2 = 0
            return r2
    }

    public static void markAutoCheckedNow(android.content.Context r3) {
            android.content.SharedPreferences r3 = prefs(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = "last_auto_check_ms"
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r3 = r3.putLong(r0, r1)
            r3.apply()
            return
    }

    private static android.content.SharedPreferences prefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "launcher_update_checker"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static void setAutoCheckEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "auto_check_enabled"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static boolean shouldAutoCheckNow(android.content.Context r8) {
            boolean r0 = isAutoCheckEnabled(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.content.SharedPreferences r8 = prefs(r8)
            java.lang.String r0 = "last_auto_check_ms"
            r2 = 0
            long r4 = r8.getLong(r0, r2)
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L24
            long r6 = r6 - r4
            r2 = 43200000(0x2932e00, double:2.1343636E-316)
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 < 0) goto L25
        L24:
            r1 = 1
        L25:
            return r1
    }
}
