package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ViewConfigurationCompat {
    private static final int NO_FLING_MAX_VELOCITY = Integer.MIN_VALUE;
    private static final int NO_FLING_MIN_VELOCITY = Integer.MAX_VALUE;
    private static final int RESOURCE_ID_NOT_SUPPORTED = -1;
    private static final int RESOURCE_ID_SUPPORTED_BUT_NOT_FOUND = 0;
    private static final java.lang.String TAG = "ViewConfigCompat";
    private static java.lang.reflect.Method sGetScaledScrollFactorMethod;

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r0) {
                float r0 = r0.getScaledHorizontalScrollFactor()
                return r0
        }

        static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r0) {
                float r0 = r0.getScaledVerticalScrollFactor()
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getScaledHoverSlop(android.view.ViewConfiguration r0) {
                int r0 = r0.getScaledHoverSlop()
                return r0
        }

        static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r0) {
                boolean r0 = r0.shouldShowMenuShortcutsWhenKeyboardPresent()
                return r0
        }
    }

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getScaledMaximumFlingVelocity(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
                int r0 = r0.getScaledMaximumFlingVelocity(r1, r2, r3)
                return r0
        }

        static int getScaledMinimumFlingVelocity(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
                int r0 = r0.getScaledMinimumFlingVelocity(r1, r2, r3)
                return r0
        }
    }

    public static /* synthetic */ int $r8$lambda$DUnOdzWd_GMixRu8Q8mhfglZyiM(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledMinimumFlingVelocity()
            return r0
    }

    public static /* synthetic */ int $r8$lambda$u_xUdJpIAAO3758SdHprtx7JUP0(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledMaximumFlingVelocity()
            return r0
    }

    static {
            return
    }

    private ViewConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getCompatFlingVelocityThreshold(android.content.res.Resources r1, int r2, androidx.core.util.Supplier<java.lang.Integer> r3, int r4) {
            r0 = -1
            if (r2 == r0) goto Le
            if (r2 == 0) goto Ld
            int r1 = r1.getDimensionPixelSize(r2)
            if (r1 >= 0) goto Lc
            goto Ld
        Lc:
            r4 = r1
        Ld:
            return r4
        Le:
            java.lang.Object r1 = r3.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    private static float getLegacyScrollFactor(android.view.ViewConfiguration r3, android.content.Context r4) {
            java.lang.reflect.Method r0 = androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod
            if (r0 == 0) goto L1a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L13
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L13
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L13
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L13
            float r3 = (float) r3
            return r3
        L13:
            java.lang.String r3 = "ViewConfigCompat"
            java.lang.String r0 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r3, r0)
        L1a:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 16842829(0x101004d, float:2.3693774E-38)
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r3, r2)
            if (r0 == 0) goto L3a
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = r3.getDimension(r4)
            return r3
        L3a:
            r3 = 0
            return r3
    }

    private static int getPlatformResId(android.content.res.Resources r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "android"
            int r1 = r1.getIdentifier(r2, r3, r0)
            return r1
    }

    private static int getPreApi34MaximumFlingVelocityResId(android.content.res.Resources r1, int r2, int r3) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r2 != r0) goto L11
            r2 = 26
            if (r3 != r2) goto L11
            java.lang.String r2 = "config_viewMaxRotaryEncoderFlingVelocity"
            java.lang.String r3 = "dimen"
            int r1 = getPlatformResId(r1, r2, r3)
            return r1
        L11:
            r1 = -1
            return r1
    }

    private static int getPreApi34MinimumFlingVelocityResId(android.content.res.Resources r1, int r2, int r3) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r2 != r0) goto L11
            r2 = 26
            if (r3 != r2) goto L11
            java.lang.String r2 = "config_viewMinRotaryEncoderFlingVelocity"
            java.lang.String r3 = "dimen"
            int r1 = getPlatformResId(r1, r2, r3)
            return r1
        L11:
            r1 = -1
            return r1
    }

    public static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r0, android.content.Context r1) {
            float r0 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledHorizontalScrollFactor(r0)
            return r0
    }

    public static int getScaledHoverSlop(android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewConfigurationCompat.Api28Impl.getScaledHoverSlop(r2)
            return r2
        Lb:
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 / 2
            return r2
    }

    public static int getScaledMaximumFlingVelocity(android.content.Context r2, android.view.ViewConfiguration r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMaximumFlingVelocity(r3, r4, r5, r6)
            return r2
        Lb:
            boolean r4 = isInputDeviceInfoValid(r4, r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L14
            return r0
        L14:
            android.content.res.Resources r2 = r2.getResources()
            int r4 = getPreApi34MaximumFlingVelocityResId(r2, r6, r5)
            java.util.Objects.requireNonNull(r3)
            androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda0 r5 = new androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda0
            r5.<init>(r3)
            int r2 = getCompatFlingVelocityThreshold(r2, r4, r5, r0)
            return r2
    }

    public static int getScaledMinimumFlingVelocity(android.content.Context r2, android.view.ViewConfiguration r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMinimumFlingVelocity(r3, r4, r5, r6)
            return r2
        Lb:
            boolean r4 = isInputDeviceInfoValid(r4, r5, r6)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto L15
            return r0
        L15:
            android.content.res.Resources r2 = r2.getResources()
            int r4 = getPreApi34MinimumFlingVelocityResId(r2, r6, r5)
            java.util.Objects.requireNonNull(r3)
            androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda1 r5 = new androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda1
            r5.<init>(r3)
            int r2 = getCompatFlingVelocityThreshold(r2, r4, r5, r0)
            return r2
    }

    @java.lang.Deprecated
    public static int getScaledPagingTouchSlop(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledPagingTouchSlop()
            return r0
    }

    public static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r0, android.content.Context r1) {
            float r0 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledVerticalScrollFactor(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean hasPermanentMenuKey(android.view.ViewConfiguration r0) {
            boolean r0 = r0.hasPermanentMenuKey()
            return r0
    }

    private static boolean isInputDeviceInfoValid(int r0, int r1, int r2) {
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r0)
            if (r0 == 0) goto Le
            android.view.InputDevice$MotionRange r0 = r0.getMotionRange(r1, r2)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewConfigurationCompat.Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(r2)
            return r2
        Lb:
            android.content.res.Resources r2 = r3.getResources()
            java.lang.String r3 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r0 = "bool"
            int r3 = getPlatformResId(r2, r3, r0)
            if (r3 == 0) goto L21
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = 0
        L22:
            return r2
    }
}
