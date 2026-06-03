package ca.dnamobile.javalauncher.settings;

/* JADX INFO: loaded from: classes.dex */
public final class GameOverlayPreferences {
    private static final boolean DEFAULT_SHOW_GAME_FPS_COUNTER = true;
    private static final java.lang.String KEY_GAME_SETTINGS_BUTTON_CUSTOM_LEFT_DP = "game_settings_button_custom_left_dp";
    private static final java.lang.String KEY_GAME_SETTINGS_BUTTON_CUSTOM_POSITION = "game_settings_button_custom_position";
    private static final java.lang.String KEY_GAME_SETTINGS_BUTTON_CUSTOM_TOP_DP = "game_settings_button_custom_top_dp";
    private static final java.lang.String KEY_GAME_SETTINGS_BUTTON_PLACEMENT = "game_settings_button_placement";
    private static final java.lang.String KEY_SHOW_GAME_FPS_COUNTER = "show_game_fps_counter";
    public static final java.lang.String PLACEMENT_BOTTOM_LEFT = "bottom_left";
    public static final java.lang.String PLACEMENT_BOTTOM_RIGHT = "bottom_right";
    private static final java.lang.String[] PLACEMENT_LABELS = null;
    public static final java.lang.String PLACEMENT_TOP_LEFT = "top_left";
    public static final java.lang.String PLACEMENT_TOP_RIGHT = "top_right";
    private static final java.lang.String[] PLACEMENT_VALUES = null;
    private static final java.lang.String PREFS_NAME = "game_overlay_preferences";

    static {
            r0 = 4
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "Top left"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Top right"
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "Bottom left"
            r5 = 2
            r1[r5] = r2
            java.lang.String r2 = "Bottom right"
            r6 = 3
            r1[r6] = r2
            ca.dnamobile.javalauncher.settings.GameOverlayPreferences.PLACEMENT_LABELS = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "top_left"
            r0[r3] = r1
            java.lang.String r1 = "top_right"
            r0[r4] = r1
            java.lang.String r1 = "bottom_left"
            r0[r5] = r1
            java.lang.String r1 = "bottom_right"
            r0[r6] = r1
            ca.dnamobile.javalauncher.settings.GameOverlayPreferences.PLACEMENT_VALUES = r0
            return
    }

    private GameOverlayPreferences() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getGameSettingsButtonCustomLeftDp(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "game_settings_button_custom_left_dp"
            r1 = 16
            int r2 = r2.getInt(r0, r1)
            return r2
    }

    public static int getGameSettingsButtonCustomTopDp(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "game_settings_button_custom_top_dp"
            r1 = 16
            int r2 = r2.getInt(r0, r1)
            return r2
    }

    public static java.lang.String getGameSettingsButtonPlacement(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "game_settings_button_placement"
            java.lang.String r1 = "bottom_right"
            java.lang.String r2 = r2.getString(r0, r1)
            java.lang.String r2 = sanitizePlacement(r2)
            return r2
    }

    public static java.lang.String[] getPlacementLabels() {
            java.lang.String[] r0 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.PLACEMENT_LABELS
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static java.lang.String[] getPlacementValues() {
            java.lang.String[] r0 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.PLACEMENT_VALUES
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static boolean hasCustomGameSettingsButtonPosition(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "game_settings_button_custom_position"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static int indexOfPlacement(java.lang.String r3) {
            java.lang.String r3 = sanitizePlacement(r3)
            r0 = 0
        L5:
            java.lang.String[] r1 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.PLACEMENT_VALUES
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r1 = r1[r0]
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            int r3 = r1.length
            int r3 = r3 + (-1)
            return r3
    }

    public static boolean isShowGameFpsCounter(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "show_game_fps_counter"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static java.lang.String placementValueForIndex(int r2) {
            if (r2 < 0) goto Lb
            java.lang.String[] r0 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.PLACEMENT_VALUES
            int r1 = r0.length
            if (r2 < r1) goto L8
            goto Lb
        L8:
            r2 = r0[r2]
            return r2
        Lb:
            java.lang.String r2 = "bottom_right"
            return r2
    }

    private static android.content.SharedPreferences prefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "game_overlay_preferences"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static void resetGameSettingsButtonCustomPosition(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "game_settings_button_custom_position"
            r1 = 0
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r1)
            java.lang.String r0 = "game_settings_button_custom_left_dp"
            android.content.SharedPreferences$Editor r2 = r2.remove(r0)
            java.lang.String r0 = "game_settings_button_custom_top_dp"
            android.content.SharedPreferences$Editor r2 = r2.remove(r0)
            r2.apply()
            return
    }

    private static java.lang.String sanitizePlacement(java.lang.String r2) {
            java.lang.String r0 = "top_left"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L22
            java.lang.String r0 = "top_right"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L22
            java.lang.String r0 = "bottom_left"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L22
            java.lang.String r0 = "bottom_right"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L21
            goto L22
        L21:
            return r0
        L22:
            return r2
    }

    public static void setGameSettingsButtonCustomPosition(android.content.Context r2, int r3, int r4) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "game_settings_button_custom_position"
            r1 = 1
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r0, r1)
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
            java.lang.String r1 = "game_settings_button_custom_left_dp"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r1, r3)
            java.lang.String r3 = "game_settings_button_custom_top_dp"
            int r4 = java.lang.Math.max(r0, r4)
            android.content.SharedPreferences$Editor r2 = r2.putInt(r3, r4)
            r2.apply()
            return
    }

    public static void setGameSettingsButtonPlacement(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "game_settings_button_placement"
            java.lang.String r2 = sanitizePlacement(r2)
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            java.lang.String r2 = "game_settings_button_custom_position"
            r0 = 0
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r0)
            r1.apply()
            return
    }

    public static void setShowGameFpsCounter(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "show_game_fps_counter"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }
}
