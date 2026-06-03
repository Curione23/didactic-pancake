package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class ControlsPreferences {
    public static final float DEFAULT_HOTBAR_HEIGHT_GUI = 20.0f;
    public static final float DEFAULT_HOTBAR_VERTICAL_PADDING_DP = 18.0f;
    public static final float DEFAULT_HOTBAR_WIDTH_GUI = 180.0f;
    public static final float DEFAULT_HOTBAR_X_OFFSET_DP = 0.0f;
    public static final float DEFAULT_HOTBAR_Y_OFFSET_DP = 0.0f;
    public static final int DEFAULT_MOUSE_CURSOR_SIZE_PERCENT = 100;
    private static final java.lang.String KEY_CUSTOM_MOUSE_CURSOR_PATH = "custom_mouse_cursor_path";
    private static final java.lang.String KEY_DOUBLE_TAP_TO_DROP = "double_tap_to_drop";
    private static final java.lang.String KEY_EDIT_GRID = "edit_grid";
    private static final java.lang.String KEY_ENABLED = "enabled";
    private static final java.lang.String KEY_HOTBAR_GUI_SCALE_OVERRIDE = "hotbar_gui_scale_override";
    private static final java.lang.String KEY_HOTBAR_HEIGHT_GUI = "hotbar_height_gui";
    private static final java.lang.String KEY_HOTBAR_HITBOX_DEBUG = "hotbar_hitbox_debug";
    private static final java.lang.String KEY_HOTBAR_VERTICAL_PADDING_DP = "hotbar_vertical_padding_dp";
    private static final java.lang.String KEY_HOTBAR_WIDTH_GUI = "hotbar_width_gui";
    private static final java.lang.String KEY_HOTBAR_X_OFFSET_DP = "hotbar_x_offset_dp";
    private static final java.lang.String KEY_HOTBAR_Y_OFFSET_DP = "hotbar_y_offset_dp";
    private static final java.lang.String KEY_MINECRAFT_TOUCH_GESTURES = "minecraft_touch_gestures";
    private static final java.lang.String KEY_MOUSE_CURSOR_SIZE_PERCENT = "mouse_cursor_size_percent";
    private static final java.lang.String KEY_MOUSE_CURSOR_STYLE = "mouse_cursor_style";
    private static final java.lang.String KEY_OPACITY = "opacity";
    private static final java.lang.String KEY_SELECTED_LAYOUT = "selected_layout";
    private static final java.lang.String KEY_SIZE_PREVIEW_PERCENT = "size_preview_percent";
    private static final java.lang.String KEY_SNAP_CONTROLS = "snap_controls";
    private static final java.lang.String KEY_VIRTUAL_MOUSE_ENABLED = "virtual_mouse_enabled";
    public static final int MAX_MOUSE_CURSOR_SIZE_PERCENT = 200;
    public static final int MIN_MOUSE_CURSOR_SIZE_PERCENT = 50;
    public static final java.lang.String MOUSE_CURSOR_STYLE_ARROW = "arrow";
    public static final java.lang.String MOUSE_CURSOR_STYLE_CROSSHAIR = "crosshair";
    public static final java.lang.String MOUSE_CURSOR_STYLE_CUSTOM = "custom";
    public static final java.lang.String MOUSE_CURSOR_STYLE_DOT = "dot";
    private static final java.lang.String PREFS = "java_launcher_touch_controls";

    private ControlsPreferences() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static int clampInt(int r0, int r1, int r2) {
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static java.io.File getCustomMouseCursorFile(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r2.getApplicationContext()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "mouse_cursor"
            r0.<init>(r2, r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L18
            r0.mkdirs()
        L18:
            java.io.File r2 = new java.io.File
            java.lang.String r1 = "custom_mouse_cursor.png"
            r2.<init>(r0, r1)
            return r2
    }

    public static java.lang.String getCustomMouseCursorPath(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "custom_mouse_cursor_path"
            r1 = 0
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L1c
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L1c
        L18:
            java.lang.String r1 = r2.trim()
        L1c:
            return r1
    }

    public static float getGlobalOpacity(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "opacity"
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2.getFloat(r0, r1)
            r0 = 0
            float r2 = clamp(r2, r0, r1)
            return r2
    }

    public static int getHotbarGuiScaleOverride(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "hotbar_gui_scale_override"
            r1 = 0
            int r2 = r2.getInt(r0, r1)
            r0 = 8
            int r2 = java.lang.Math.min(r0, r2)
            int r2 = java.lang.Math.max(r1, r2)
            return r2
    }

    public static float getHotbarHeightGui(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "hotbar_height_gui"
            r1 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2.getFloat(r0, r1)
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 1114636288(0x42700000, float:60.0)
            float r2 = clamp(r2, r0, r1)
            return r2
    }

    public static float getHotbarVerticalPaddingDp(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "hotbar_vertical_padding_dp"
            r1 = 1099956224(0x41900000, float:18.0)
            float r2 = r2.getFloat(r0, r1)
            r0 = 0
            r1 = 1117782016(0x42a00000, float:80.0)
            float r2 = clamp(r2, r0, r1)
            return r2
    }

    public static float getHotbarWidthGui(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "hotbar_width_gui"
            r1 = 1127481344(0x43340000, float:180.0)
            float r2 = r2.getFloat(r0, r1)
            r0 = 1119092736(0x42b40000, float:90.0)
            r1 = 1132593152(0x43820000, float:260.0)
            float r2 = clamp(r2, r0, r1)
            return r2
    }

    public static float getHotbarXOffsetDp(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "hotbar_x_offset_dp"
            r1 = 0
            float r2 = r2.getFloat(r0, r1)
            r0 = -1021313024(0xffffffffc3200000, float:-160.0)
            r1 = 1126170624(0x43200000, float:160.0)
            float r2 = clamp(r2, r0, r1)
            return r2
    }

    public static float getHotbarYOffsetDp(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "hotbar_y_offset_dp"
            r1 = 0
            float r2 = r2.getFloat(r0, r1)
            r0 = -1029701632(0xffffffffc2a00000, float:-80.0)
            r1 = 1126170624(0x43200000, float:160.0)
            float r2 = clamp(r2, r0, r1)
            return r2
    }

    public static java.lang.String getMouseCursorResourceName(java.lang.String r1) {
            java.lang.String r1 = normalizeMouseCursorStyle(r1)
            java.lang.String r0 = "dot"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "ic_cursor_dot"
            return r1
        Lf:
            java.lang.String r0 = "arrow"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1a
            java.lang.String r1 = "ic_cursor_arrow"
            return r1
        L1a:
            java.lang.String r1 = "ic_gamepad_pointer"
            return r1
    }

    public static int getMouseCursorSizePercent(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "mouse_cursor_size_percent"
            r1 = 100
            int r2 = r2.getInt(r0, r1)
            r0 = 50
            r1 = 200(0xc8, float:2.8E-43)
            int r2 = clampInt(r2, r0, r1)
            return r2
    }

    public static java.lang.String getMouseCursorStyle(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "mouse_cursor_style"
            java.lang.String r1 = "crosshair"
            java.lang.String r2 = r2.getString(r0, r1)
            java.lang.String r2 = normalizeMouseCursorStyle(r2)
            return r2
    }

    public static java.lang.String getMouseCursorStyleLabel(java.lang.String r1) {
            java.lang.String r1 = normalizeMouseCursorStyle(r1)
            java.lang.String r0 = "dot"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "Dot crosshair"
            return r1
        Lf:
            java.lang.String r0 = "arrow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            java.lang.String r1 = "Arrow pointer"
            return r1
        L1a:
            java.lang.String r0 = "custom"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L25
            java.lang.String r1 = "Custom image"
            return r1
        L25:
            java.lang.String r1 = "Crosshair"
            return r1
    }

    public static java.lang.String getSelectedLayoutPath(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "selected_layout"
            r1 = 0
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L19
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            return r1
    }

    public static boolean hasCustomMouseCursorIcon(android.content.Context r5) {
            java.lang.String r5 = getCustomMouseCursorPath(r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            boolean r5 = r1.isFile()
            if (r5 == 0) goto L1e
            long r1 = r1.length()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1e
            r0 = 1
        L1e:
            return r0
    }

    public static boolean isDoubleTapToDropEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "double_tap_to_drop"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isEditGridEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "edit_grid"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isHotbarHitboxDebugEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "hotbar_hitbox_debug"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isMinecraftTouchGesturesEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "minecraft_touch_gestures"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isSizePreviewPercentEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "size_preview_percent"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isSnapControlsEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "snap_controls"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isTouchControlsEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "enabled"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isVirtualMouseEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "virtual_mouse_enabled"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static java.lang.String normalizeMouseCursorStyle(java.lang.String r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            goto Lf
        L5:
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r0)
        Lf:
            java.lang.String r0 = "dot"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            java.lang.String r0 = "arrow"
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L21
            return r0
        L21:
            java.lang.String r0 = "custom"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L2a
            return r0
        L2a:
            java.lang.String r2 = "crosshair"
            return r2
    }

    private static android.content.SharedPreferences prefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "java_launcher_touch_controls"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static void resetHotbarHitboxSettings(android.content.Context r1) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "hotbar_hitbox_debug"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "hotbar_gui_scale_override"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "hotbar_width_gui"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "hotbar_height_gui"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "hotbar_x_offset_dp"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "hotbar_y_offset_dp"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "hotbar_vertical_padding_dp"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            r1.apply()
            return
    }

    public static void setCustomMouseCursorPath(android.content.Context r2, java.lang.String r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "custom_mouse_cursor_path"
            if (r3 == 0) goto L1f
            java.lang.String r1 = r3.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L17
            goto L1f
        L17:
            java.lang.String r3 = r3.trim()
            r2.putString(r0, r3)
            goto L22
        L1f:
            r2.remove(r0)
        L22:
            r2.apply()
            return
    }

    public static void setDoubleTapToDropEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "double_tap_to_drop"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setEditGridEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "edit_grid"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setGlobalOpacity(android.content.Context r2, float r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = clamp(r3, r0, r1)
            java.lang.String r0 = "opacity"
            android.content.SharedPreferences$Editor r2 = r2.putFloat(r0, r3)
            r2.apply()
            return
    }

    public static void setHotbarGuiScaleOverride(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0 = 8
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            java.lang.String r0 = "hotbar_gui_scale_override"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r2)
            r1.apply()
            return
    }

    public static void setHotbarHeightGui(android.content.Context r2, float r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 1114636288(0x42700000, float:60.0)
            float r3 = clamp(r3, r0, r1)
            java.lang.String r0 = "hotbar_height_gui"
            android.content.SharedPreferences$Editor r2 = r2.putFloat(r0, r3)
            r2.apply()
            return
    }

    public static void setHotbarHitboxDebugEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "hotbar_hitbox_debug"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setHotbarVerticalPaddingDp(android.content.Context r2, float r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 0
            r1 = 1117782016(0x42a00000, float:80.0)
            float r3 = clamp(r3, r0, r1)
            java.lang.String r0 = "hotbar_vertical_padding_dp"
            android.content.SharedPreferences$Editor r2 = r2.putFloat(r0, r3)
            r2.apply()
            return
    }

    public static void setHotbarWidthGui(android.content.Context r2, float r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 1119092736(0x42b40000, float:90.0)
            r1 = 1132593152(0x43820000, float:260.0)
            float r3 = clamp(r3, r0, r1)
            java.lang.String r0 = "hotbar_width_gui"
            android.content.SharedPreferences$Editor r2 = r2.putFloat(r0, r3)
            r2.apply()
            return
    }

    public static void setHotbarXOffsetDp(android.content.Context r2, float r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = -1021313024(0xffffffffc3200000, float:-160.0)
            r1 = 1126170624(0x43200000, float:160.0)
            float r3 = clamp(r3, r0, r1)
            java.lang.String r0 = "hotbar_x_offset_dp"
            android.content.SharedPreferences$Editor r2 = r2.putFloat(r0, r3)
            r2.apply()
            return
    }

    public static void setHotbarYOffsetDp(android.content.Context r2, float r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = -1029701632(0xffffffffc2a00000, float:-80.0)
            r1 = 1126170624(0x43200000, float:160.0)
            float r3 = clamp(r3, r0, r1)
            java.lang.String r0 = "hotbar_y_offset_dp"
            android.content.SharedPreferences$Editor r2 = r2.putFloat(r0, r3)
            r2.apply()
            return
    }

    public static void setMinecraftTouchGesturesEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "minecraft_touch_gestures"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setMouseCursorSizePercent(android.content.Context r2, int r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 50
            r1 = 200(0xc8, float:2.8E-43)
            int r3 = clampInt(r3, r0, r1)
            java.lang.String r0 = "mouse_cursor_size_percent"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r0, r3)
            r2.apply()
            return
    }

    public static void setMouseCursorStyle(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "mouse_cursor_style"
            java.lang.String r2 = normalizeMouseCursorStyle(r2)
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void setSelectedLayoutPath(android.content.Context r2, java.lang.String r3) {
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "selected_layout"
            if (r3 == 0) goto L1b
            java.lang.String r1 = r3.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L17
            goto L1b
        L17:
            r2.putString(r0, r3)
            goto L1e
        L1b:
            r2.remove(r0)
        L1e:
            r2.apply()
            return
    }

    public static void setSizePreviewPercentEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "size_preview_percent"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setSnapControlsEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "snap_controls"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setTouchControlsEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "enabled"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setVirtualMouseEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "virtual_mouse_enabled"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }
}
