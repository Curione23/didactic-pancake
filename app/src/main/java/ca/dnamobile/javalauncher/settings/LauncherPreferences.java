package ca.dnamobile.javalauncher.settings;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherPreferences {
    public static final int DEFAULT_GAME_RESOLUTION_SCALE_PERCENT = 100;
    private static final java.lang.String DEFAULT_RENDERER_IDENTIFIER = "e7b90ed6-e518-4d4e-93dc-5c7133cd5b31";
    private static final java.lang.String DEFAULT_VULKAN_DRIVER_NAME = "Default Mesa driver";
    private static final java.lang.String KEY_ALLOCATED_MEMORY_MB = "allocated_memory_mb";
    private static final java.lang.String KEY_AVOID_ROUNDED_DISPLAY_CORNERS = "avoid_rounded_display_corners";
    private static final java.lang.String KEY_ENABLE_SDL_CONTROLLER_MOD_COMPAT = "enable_sdl_controller_mod_compat";
    private static final java.lang.String KEY_FORCE_FULLSCREEN_MODE = "force_fullscreen_mode";
    private static final java.lang.String KEY_FORCE_SDL_CONTROLLER_BRIDGE = "force_sdl_controller_bridge";
    private static final java.lang.String KEY_GAME_RESOLUTION_SCALE_PERCENT = "game_resolution_scale_percent";
    private static final java.lang.String KEY_IGNORE_DISPLAY_CUTOUT = "ignore_display_cutout";
    private static final java.lang.String KEY_RECENT_INSTANCE_PREFIX = "recent_instance_last_played_";
    private static final java.lang.String KEY_REMOVE_INHERITED_VANILLA_AFTER_LOADER_INSTALL = "remove_inherited_vanilla_after_loader_install";
    private static final java.lang.String KEY_SELECTED_INSTANCE_FILTER = "selected_instance_filter";
    private static final java.lang.String KEY_SELECTED_RENDERER_IDENTIFIER = "selected_renderer_identifier";
    private static final java.lang.String KEY_SELECTED_VULKAN_DRIVER_NAME = "selected_vulkan_driver_name";
    private static final java.lang.String KEY_SHOW_CONTROLLER_MOD_COMPAT_WARNINGS = "show_controller_mod_compat_warnings";
    private static final java.lang.String KEY_SHOW_GAME_LOG_OVERLAY = "show_game_log_overlay";
    private static final java.lang.String KEY_SHOW_IN_GAME_SETTINGS_BUTTON = "show_in_game_settings_button";
    private static final java.lang.String KEY_SHOW_SHARED_INSTALLS = "show_shared_installs";
    private static final java.lang.String KEY_USE_NATIVE_SURFACE_VIEW = "use_native_surface_view";
    private static final java.lang.String KEY_USE_OPENGL_FOR_MC_26_PLUS = "use_opengl_for_mc_26_plus";
    private static final java.lang.String KEY_USE_SYSTEM_VULKAN_DRIVER = "use_system_vulkan_driver";
    public static final int MAX_GAME_RESOLUTION_SCALE_PERCENT = 200;
    public static final int MIN_GAME_RESOLUTION_SCALE_PERCENT = 25;
    private static final java.lang.String PREFS_NAME = "launcher_preferences";
    private static final java.lang.String RESOLUTION_PREFS_NAME = "launcher_resolution_preferences";

    private LauncherPreferences() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int clampGameResolutionScalePercent(int r1) {
            r0 = 25
            if (r1 >= r0) goto L5
            return r0
        L5:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 <= r0) goto La
            return r0
        La:
            return r1
    }

    public static void clearInstancePlayed(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            return
        Lb:
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recent_instance_last_played_"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)
            r2.apply()
            return
    }

    public static int getAllocatedMemoryMb(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            java.lang.String r0 = "allocated_memory_mb"
            int r1 = r1.getInt(r0, r2)
            return r1
    }

    public static int getGameResolutionScalePercent(android.content.Context r4) {
            android.content.SharedPreferences r0 = resolutionPrefs(r4)
            java.lang.String r1 = "game_resolution_scale_percent"
            boolean r2 = r0.contains(r1)
            r3 = 100
            if (r2 == 0) goto L17
            int r4 = r0.getInt(r1, r3)
            int r4 = clampGameResolutionScalePercent(r4)
            return r4
        L17:
            android.content.SharedPreferences r0 = prefs(r4)
            int r0 = r0.getInt(r1, r3)
            int r0 = clampGameResolutionScalePercent(r0)
            setGameResolutionScalePercent(r4, r0)
            return r0
    }

    public static long getInstanceLastPlayed(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            android.content.SharedPreferences r4 = prefs(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "recent_instance_last_played_"
            r0.<init>(r3)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            long r4 = r4.getLong(r5, r1)
            return r4
    }

    public static java.lang.String getSelectedInstanceFilter(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            java.lang.String r0 = "selected_instance_filter"
            java.lang.String r1 = r1.getString(r0, r2)
            if (r1 == 0) goto L18
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            goto L18
        L17:
            r2 = r1
        L18:
            return r2
    }

    public static java.lang.String getSelectedRendererIdentifier(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "selected_renderer_identifier"
            java.lang.String r1 = "e7b90ed6-e518-4d4e-93dc-5c7133cd5b31"
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L1a
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            return r1
    }

    public static java.lang.String getSelectedVulkanDriverName(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "selected_vulkan_driver_name"
            java.lang.String r1 = "Default Mesa driver"
            java.lang.String r2 = r2.getString(r0, r1)
            if (r2 == 0) goto L1a
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            return r1
    }

    public static boolean isAvoidRoundedDisplayCorners(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "avoid_rounded_display_corners"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isForceFullscreenMode(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "force_fullscreen_mode"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isForceSdlControllerBridge(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "force_sdl_controller_bridge"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isIgnoreDisplayCutout(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "ignore_display_cutout"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isRemoveInheritedVanillaAfterLoaderInstall(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "remove_inherited_vanilla_after_loader_install"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isSdlControllerModCompatEnabled(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "enable_sdl_controller_mod_compat"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isShowControllerModCompatWarnings(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "show_controller_mod_compat_warnings"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isShowGameLogOverlay(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "show_game_log_overlay"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isShowInGameSettingsButton(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "show_in_game_settings_button"
            r1 = 1
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isShowSharedInstalls(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "show_shared_installs"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isUseNativeSurfaceView(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "use_native_surface_view"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isUseOpenGlForMinecraft26Plus(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "use_opengl_for_mc_26_plus"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean isUseSystemVulkanDriver(android.content.Context r2) {
            android.content.SharedPreferences r2 = prefs(r2)
            java.lang.String r0 = "use_system_vulkan_driver"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    private static android.content.SharedPreferences prefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "launcher_preferences"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static void recordInstancePlayed(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            return
        Lb:
            android.content.SharedPreferences r2 = prefs(r2)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "recent_instance_last_played_"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r0)
            r2.apply()
            return
    }

    private static android.content.SharedPreferences resolutionPrefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "launcher_resolution_preferences"
            r1 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static void setAllocatedMemoryMb(android.content.Context r1, int r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "allocated_memory_mb"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r0, r2)
            r1.apply()
            return
    }

    public static void setAvoidRoundedDisplayCorners(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "avoid_rounded_display_corners"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setForceFullscreenMode(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "force_fullscreen_mode"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setForceSdlControllerBridge(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "force_sdl_controller_bridge"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setGameResolutionScalePercent(android.content.Context r3, int r4) {
            int r4 = clampGameResolutionScalePercent(r4)
            android.content.SharedPreferences r0 = resolutionPrefs(r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "game_resolution_scale_percent"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r4)
            boolean r0 = r0.commit()
            android.content.SharedPreferences r2 = prefs(r3)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putInt(r1, r4)
            boolean r2 = r2.commit()
            if (r0 != 0) goto L37
            android.content.SharedPreferences r0 = resolutionPrefs(r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r4)
            r0.apply()
        L37:
            if (r2 != 0) goto L48
            android.content.SharedPreferences r3 = prefs(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putInt(r1, r4)
            r3.apply()
        L48:
            return
    }

    public static void setIgnoreDisplayCutout(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "ignore_display_cutout"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setRemoveInheritedVanillaAfterLoaderInstall(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "remove_inherited_vanilla_after_loader_install"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setSdlControllerModCompatEnabled(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "enable_sdl_controller_mod_compat"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setSelectedInstanceFilter(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "selected_instance_filter"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void setSelectedRendererIdentifier(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "selected_renderer_identifier"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void setSelectedVulkanDriverName(android.content.Context r1, java.lang.String r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "selected_vulkan_driver_name"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.apply()
            return
    }

    public static void setShowControllerModCompatWarnings(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "show_controller_mod_compat_warnings"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setShowGameLogOverlay(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "show_game_log_overlay"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setShowInGameSettingsButton(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "show_in_game_settings_button"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setShowSharedInstalls(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "show_shared_installs"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setUseNativeSurfaceView(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "use_native_surface_view"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setUseOpenGlForMinecraft26Plus(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "use_opengl_for_mc_26_plus"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }

    public static void setUseSystemVulkanDriver(android.content.Context r1, boolean r2) {
            android.content.SharedPreferences r1 = prefs(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "use_system_vulkan_driver"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r0, r2)
            r1.apply()
            return
    }
}
