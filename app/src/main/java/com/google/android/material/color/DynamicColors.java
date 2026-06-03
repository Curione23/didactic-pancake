package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class DynamicColors {
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION = null;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS = null;
    private static final java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors.DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = null;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = null;
    private static final com.google.android.material.color.DynamicColors.DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION = null;
    private static final java.lang.String TAG = null;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;



    private interface DeviceSupportCondition {
        boolean isSupported();
    }

    private static class DynamicColorsActivityLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        private final com.google.android.material.color.DynamicColorsOptions dynamicColorsOptions;

        DynamicColorsActivityLifecycleCallbacks(com.google.android.material.color.DynamicColorsOptions r1) {
                r0 = this;
                r0.<init>()
                r0.dynamicColorsOptions = r1
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                com.google.android.material.color.DynamicColorsOptions r2 = r0.dynamicColorsOptions
                com.google.android.material.color.DynamicColors.applyToActivityIfAvailable(r1, r2)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    public interface OnAppliedCallback {
        void onApplied(android.app.Activity r1);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(android.app.Activity r1, int r2);
    }

    static {
            int r0 = com.google.android.material.R.attr.dynamicColorThemeOverlay
            int[] r0 = new int[]{r0}
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = r0
            com.google.android.material.color.DynamicColors$1 r0 = new com.google.android.material.color.DynamicColors$1
            r0.<init>()
            com.google.android.material.color.DynamicColors.DEFAULT_DEVICE_SUPPORT_CONDITION = r0
            com.google.android.material.color.DynamicColors$2 r1 = new com.google.android.material.color.DynamicColors$2
            r1.<init>()
            com.google.android.material.color.DynamicColors.SAMSUNG_DEVICE_SUPPORT_CONDITION = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "fcnt"
            r2.put(r3, r0)
            java.lang.String r3 = "google"
            r2.put(r3, r0)
            java.lang.String r3 = "hmd global"
            r2.put(r3, r0)
            java.lang.String r3 = "infinix"
            r2.put(r3, r0)
            java.lang.String r3 = "infinix mobility limited"
            r2.put(r3, r0)
            java.lang.String r3 = "itel"
            r2.put(r3, r0)
            java.lang.String r3 = "kyocera"
            r2.put(r3, r0)
            java.lang.String r3 = "lenovo"
            r2.put(r3, r0)
            java.lang.String r3 = "lge"
            r2.put(r3, r0)
            java.lang.String r3 = "meizu"
            r2.put(r3, r0)
            java.lang.String r3 = "motorola"
            r2.put(r3, r0)
            java.lang.String r3 = "nothing"
            r2.put(r3, r0)
            java.lang.String r3 = "oneplus"
            r2.put(r3, r0)
            java.lang.String r3 = "oppo"
            r2.put(r3, r0)
            java.lang.String r3 = "realme"
            r2.put(r3, r0)
            java.lang.String r3 = "robolectric"
            r2.put(r3, r0)
            java.lang.String r3 = "samsung"
            r2.put(r3, r1)
            java.lang.String r1 = "sharp"
            r2.put(r1, r0)
            java.lang.String r1 = "shift"
            r2.put(r1, r0)
            java.lang.String r1 = "sony"
            r2.put(r1, r0)
            java.lang.String r1 = "tcl"
            r2.put(r1, r0)
            java.lang.String r1 = "tecno"
            r2.put(r1, r0)
            java.lang.String r1 = "tecno mobile limited"
            r2.put(r1, r0)
            java.lang.String r1 = "vivo"
            r2.put(r1, r0)
            java.lang.String r1 = "wingtech"
            r2.put(r1, r0)
            java.lang.String r1 = "xiaomi"
            r2.put(r1, r0)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "asus"
            r1.put(r2, r0)
            java.lang.String r2 = "jio"
            r1.put(r2, r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_BRANDS = r0
            java.lang.String r0 = "DynamicColors"
            com.google.android.material.color.DynamicColors.TAG = r0
            return
    }

    private DynamicColors() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity r0) {
            applyToActivityIfAvailable(r0)
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity r1, int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivityIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyIfAvailable(android.app.Activity r1, com.google.android.material.color.DynamicColors.Precondition r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setPrecondition(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivityIfAvailable(r1, r2)
            return
    }

    public static void applyToActivitiesIfAvailable(android.app.Application r1) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions r0 = r0.build()
            applyToActivitiesIfAvailable(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application r1, int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application r1, int r2, com.google.android.material.color.DynamicColors.Precondition r3) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r2.setPrecondition(r3)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void applyToActivitiesIfAvailable(android.app.Application r1, com.google.android.material.color.DynamicColors.Precondition r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setPrecondition(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            applyToActivitiesIfAvailable(r1, r2)
            return
    }

    public static void applyToActivitiesIfAvailable(android.app.Application r1, com.google.android.material.color.DynamicColorsOptions r2) {
            com.google.android.material.color.DynamicColors$DynamicColorsActivityLifecycleCallbacks r0 = new com.google.android.material.color.DynamicColors$DynamicColorsActivityLifecycleCallbacks
            r0.<init>(r2)
            r1.registerActivityLifecycleCallbacks(r0)
            return
    }

    public static void applyToActivityIfAvailable(android.app.Activity r1) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions r0 = r0.build()
            applyToActivityIfAvailable(r1, r0)
            return
    }

    public static void applyToActivityIfAvailable(android.app.Activity r5, com.google.android.material.color.DynamicColorsOptions r6) {
            boolean r0 = isDynamicColorAvailable()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.Integer r0 = r6.getContentBasedSeedColor()
            if (r0 != 0) goto L1f
            int r0 = r6.getThemeOverlay()
            if (r0 != 0) goto L1a
            int[] r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE
            int r0 = getDefaultThemeOverlay(r5, r0)
            goto L20
        L1a:
            int r0 = r6.getThemeOverlay()
            goto L20
        L1f:
            r0 = 0
        L20:
            com.google.android.material.color.DynamicColors$Precondition r1 = r6.getPrecondition()
            boolean r1 = r1.shouldApplyDynamicColors(r5, r0)
            if (r1 == 0) goto L68
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            if (r1 == 0) goto L5e
            com.google.android.material.color.utilities.SchemeContent r0 = new com.google.android.material.color.utilities.SchemeContent
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            int r1 = r1.intValue()
            com.google.android.material.color.utilities.Hct r1 = com.google.android.material.color.utilities.Hct.fromInt(r1)
            boolean r2 = com.google.android.material.color.MaterialColors.isLightTheme(r5)
            r2 = r2 ^ 1
            float r3 = getSystemContrast(r5)
            double r3 = (double) r3
            r0.<init>(r1, r2, r3)
            com.google.android.material.color.ColorResourcesOverride r1 = com.google.android.material.color.ColorResourcesOverride.getInstance()
            if (r1 != 0) goto L53
            return
        L53:
            java.util.Map r0 = com.google.android.material.color.MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(r0)
            boolean r0 = r1.applyIfPossible(r5, r0)
            if (r0 != 0) goto L61
            return
        L5e:
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(r5, r0)
        L61:
            com.google.android.material.color.DynamicColors$OnAppliedCallback r6 = r6.getOnAppliedCallback()
            r6.onApplied(r5)
        L68:
            return
    }

    private static int getDefaultThemeOverlay(android.content.Context r0, int[] r1) {
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r1 = r0.getResourceId(r1, r1)
            r0.recycle()
            return r1
    }

    private static float getSystemContrast(android.content.Context r2) {
            java.lang.String r0 = "uimode"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2
            if (r2 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L11
            goto L16
        L11:
            float r2 = r2.getContrast()
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static boolean isDynamicColorAvailable() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors$DeviceSupportCondition> r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
            if (r0 != 0) goto L32
            java.util.Map<java.lang.String, com.google.android.material.color.DynamicColors$DeviceSupportCondition> r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_BRANDS
            java.lang.String r3 = android.os.Build.BRAND
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
        L32:
            if (r0 == 0) goto L3b
            boolean r0 = r0.isSupported()
            if (r0 == 0) goto L3b
            r2 = r1
        L3b:
            return r2
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context r1) {
            r0 = 0
            android.content.Context r1 = wrapContextIfAvailable(r1, r0)
            return r1
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context r1, int r2) {
            com.google.android.material.color.DynamicColorsOptions$Builder r0 = new com.google.android.material.color.DynamicColorsOptions$Builder
            r0.<init>()
            com.google.android.material.color.DynamicColorsOptions$Builder r2 = r0.setThemeOverlay(r2)
            com.google.android.material.color.DynamicColorsOptions r2 = r2.build()
            android.content.Context r1 = wrapContextIfAvailable(r1, r2)
            return r1
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context r5, com.google.android.material.color.DynamicColorsOptions r6) {
            boolean r0 = isDynamicColorAvailable()
            if (r0 != 0) goto L7
            return r5
        L7:
            int r0 = r6.getThemeOverlay()
            if (r0 != 0) goto L13
            int[] r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE
            int r0 = getDefaultThemeOverlay(r5, r0)
        L13:
            if (r0 != 0) goto L16
            return r5
        L16:
            java.lang.Integer r1 = r6.getContentBasedSeedColor()
            if (r1 == 0) goto L47
            com.google.android.material.color.utilities.SchemeContent r1 = new com.google.android.material.color.utilities.SchemeContent
            java.lang.Integer r6 = r6.getContentBasedSeedColor()
            int r6 = r6.intValue()
            com.google.android.material.color.utilities.Hct r6 = com.google.android.material.color.utilities.Hct.fromInt(r6)
            boolean r2 = com.google.android.material.color.MaterialColors.isLightTheme(r5)
            r2 = r2 ^ 1
            float r3 = getSystemContrast(r5)
            double r3 = (double) r3
            r1.<init>(r6, r2, r3)
            com.google.android.material.color.ColorResourcesOverride r6 = com.google.android.material.color.ColorResourcesOverride.getInstance()
            if (r6 == 0) goto L47
            java.util.Map r0 = com.google.android.material.color.MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(r1)
            android.content.Context r5 = r6.wrapContextIfPossible(r5, r0)
            return r5
        L47:
            android.view.ContextThemeWrapper r6 = new android.view.ContextThemeWrapper
            r6.<init>(r5, r0)
            return r6
    }
}
