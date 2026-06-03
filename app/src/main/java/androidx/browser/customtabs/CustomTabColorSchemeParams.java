package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabColorSchemeParams {
    public final java.lang.Integer navigationBarColor;
    public final java.lang.Integer navigationBarDividerColor;
    public final java.lang.Integer secondaryToolbarColor;
    public final java.lang.Integer toolbarColor;

    public static final class Builder {
        private java.lang.Integer mNavigationBarColor;
        private java.lang.Integer mNavigationBarDividerColor;
        private java.lang.Integer mSecondaryToolbarColor;
        private java.lang.Integer mToolbarColor;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams build() {
                r5 = this;
                androidx.browser.customtabs.CustomTabColorSchemeParams r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams
                java.lang.Integer r1 = r5.mToolbarColor
                java.lang.Integer r2 = r5.mSecondaryToolbarColor
                java.lang.Integer r3 = r5.mNavigationBarColor
                java.lang.Integer r4 = r5.mNavigationBarDividerColor
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setNavigationBarColor(int r2) {
                r1 = this;
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r2 = r2 | r0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mNavigationBarColor = r2
                return r1
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setNavigationBarDividerColor(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.mNavigationBarDividerColor = r1
                return r0
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setSecondaryToolbarColor(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.mSecondaryToolbarColor = r1
                return r0
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams.Builder setToolbarColor(int r2) {
                r1 = this;
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r2 = r2 | r0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mToolbarColor = r2
                return r1
        }
    }

    CustomTabColorSchemeParams(java.lang.Integer r1, java.lang.Integer r2, java.lang.Integer r3, java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.toolbarColor = r1
            r0.secondaryToolbarColor = r2
            r0.navigationBarColor = r3
            r0.navigationBarDividerColor = r4
            return
    }

    static androidx.browser.customtabs.CustomTabColorSchemeParams fromBundle(android.os.Bundle r5) {
            if (r5 != 0) goto L8
            android.os.Bundle r5 = new android.os.Bundle
            r0 = 0
            r5.<init>(r0)
        L8:
            androidx.browser.customtabs.CustomTabColorSchemeParams r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams
            java.lang.String r1 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            java.lang.Object r1 = r5.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r2 = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"
            java.lang.Object r2 = r5.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r3 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"
            java.lang.Object r3 = r5.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r4 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Integer r1 = r3.toolbarColor
            if (r1 == 0) goto L12
            java.lang.String r2 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L12:
            java.lang.Integer r1 = r3.secondaryToolbarColor
            if (r1 == 0) goto L1f
            java.lang.String r2 = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L1f:
            java.lang.Integer r1 = r3.navigationBarColor
            if (r1 == 0) goto L2c
            java.lang.String r2 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L2c:
            java.lang.Integer r1 = r3.navigationBarDividerColor
            if (r1 == 0) goto L39
            java.lang.String r2 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L39:
            return r0
    }

    androidx.browser.customtabs.CustomTabColorSchemeParams withDefaults(androidx.browser.customtabs.CustomTabColorSchemeParams r6) {
            r5 = this;
            androidx.browser.customtabs.CustomTabColorSchemeParams r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams
            java.lang.Integer r1 = r5.toolbarColor
            if (r1 != 0) goto L8
            java.lang.Integer r1 = r6.toolbarColor
        L8:
            java.lang.Integer r2 = r5.secondaryToolbarColor
            if (r2 != 0) goto Le
            java.lang.Integer r2 = r6.secondaryToolbarColor
        Le:
            java.lang.Integer r3 = r5.navigationBarColor
            if (r3 != 0) goto L14
            java.lang.Integer r3 = r6.navigationBarColor
        L14:
            java.lang.Integer r4 = r5.navigationBarDividerColor
            if (r4 != 0) goto L1a
            java.lang.Integer r4 = r6.navigationBarDividerColor
        L1a:
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
