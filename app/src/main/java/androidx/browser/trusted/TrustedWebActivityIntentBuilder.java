package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebActivityIntentBuilder {
    public static final java.lang.String EXTRA_ADDITIONAL_TRUSTED_ORIGINS = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
    public static final java.lang.String EXTRA_DISPLAY_MODE = "androidx.browser.trusted.extra.DISPLAY_MODE";
    public static final java.lang.String EXTRA_SCREEN_ORIENTATION = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
    public static final java.lang.String EXTRA_SHARE_DATA = "androidx.browser.trusted.extra.SHARE_DATA";
    public static final java.lang.String EXTRA_SHARE_TARGET = "androidx.browser.trusted.extra.SHARE_TARGET";
    public static final java.lang.String EXTRA_SPLASH_SCREEN_PARAMS = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
    private java.util.List<java.lang.String> mAdditionalTrustedOrigins;
    private androidx.browser.trusted.TrustedWebActivityDisplayMode mDisplayMode;
    private final androidx.browser.customtabs.CustomTabsIntent.Builder mIntentBuilder;
    private int mScreenOrientation;
    private androidx.browser.trusted.sharing.ShareData mShareData;
    private androidx.browser.trusted.sharing.ShareTarget mShareTarget;
    private android.os.Bundle mSplashScreenParams;
    private final android.net.Uri mUri;

    public TrustedWebActivityIntentBuilder(android.net.Uri r2) {
            r1 = this;
            r1.<init>()
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = new androidx.browser.customtabs.CustomTabsIntent$Builder
            r0.<init>()
            r1.mIntentBuilder = r0
            androidx.browser.trusted.TrustedWebActivityDisplayMode$DefaultMode r0 = new androidx.browser.trusted.TrustedWebActivityDisplayMode$DefaultMode
            r0.<init>()
            r1.mDisplayMode = r0
            r0 = 0
            r1.mScreenOrientation = r0
            r1.mUri = r2
            return
    }

    public androidx.browser.trusted.TrustedWebActivityIntent build(androidx.browser.customtabs.CustomTabsSession r4) {
            r3 = this;
            if (r4 == 0) goto L75
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r3.mIntentBuilder
            r0.setSession(r4)
            androidx.browser.customtabs.CustomTabsIntent$Builder r4 = r3.mIntentBuilder
            androidx.browser.customtabs.CustomTabsIntent r4 = r4.build()
            android.content.Intent r4 = r4.intent
            android.net.Uri r0 = r3.mUri
            r4.setData(r0)
            java.lang.String r0 = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY"
            r1 = 1
            r4.putExtra(r0, r1)
            java.util.List<java.lang.String> r0 = r3.mAdditionalTrustedOrigins
            if (r0 == 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r3.mAdditionalTrustedOrigins
            r0.<init>(r1)
            java.lang.String r1 = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS"
            r4.putExtra(r1, r0)
        L2a:
            android.os.Bundle r0 = r3.mSplashScreenParams
            if (r0 == 0) goto L33
            java.lang.String r1 = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS"
            r4.putExtra(r1, r0)
        L33:
            java.util.List r0 = java.util.Collections.emptyList()
            androidx.browser.trusted.sharing.ShareTarget r1 = r3.mShareTarget
            if (r1 == 0) goto L5d
            androidx.browser.trusted.sharing.ShareData r2 = r3.mShareData
            if (r2 == 0) goto L5d
            java.lang.String r2 = "androidx.browser.trusted.extra.SHARE_TARGET"
            android.os.Bundle r1 = r1.toBundle()
            r4.putExtra(r2, r1)
            androidx.browser.trusted.sharing.ShareData r1 = r3.mShareData
            android.os.Bundle r1 = r1.toBundle()
            java.lang.String r2 = "androidx.browser.trusted.extra.SHARE_DATA"
            r4.putExtra(r2, r1)
            androidx.browser.trusted.sharing.ShareData r1 = r3.mShareData
            java.util.List<android.net.Uri> r1 = r1.uris
            if (r1 == 0) goto L5d
            androidx.browser.trusted.sharing.ShareData r0 = r3.mShareData
            java.util.List<android.net.Uri> r0 = r0.uris
        L5d:
            androidx.browser.trusted.TrustedWebActivityDisplayMode r1 = r3.mDisplayMode
            android.os.Bundle r1 = r1.toBundle()
            java.lang.String r2 = "androidx.browser.trusted.extra.DISPLAY_MODE"
            r4.putExtra(r2, r1)
            java.lang.String r1 = "androidx.browser.trusted.extra.SCREEN_ORIENTATION"
            int r2 = r3.mScreenOrientation
            r4.putExtra(r1, r2)
            androidx.browser.trusted.TrustedWebActivityIntent r1 = new androidx.browser.trusted.TrustedWebActivityIntent
            r1.<init>(r4, r0)
            return r1
        L75:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "CustomTabsSession is required for launching a TWA"
            r4.<init>(r0)
            throw r4
    }

    public androidx.browser.customtabs.CustomTabsIntent buildCustomTabsIntent() {
            r1 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.mIntentBuilder
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            return r0
    }

    public androidx.browser.trusted.TrustedWebActivityDisplayMode getDisplayMode() {
            r1 = this;
            androidx.browser.trusted.TrustedWebActivityDisplayMode r0 = r1.mDisplayMode
            return r0
    }

    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.mUri
            return r0
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setAdditionalTrustedOrigins(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.mAdditionalTrustedOrigins = r1
            return r0
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setColorScheme(int r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.mIntentBuilder
            r0.setColorScheme(r2)
            return r1
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setColorSchemeParams(int r2, androidx.browser.customtabs.CustomTabColorSchemeParams r3) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.mIntentBuilder
            r0.setColorSchemeParams(r2, r3)
            return r1
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setDefaultColorSchemeParams(androidx.browser.customtabs.CustomTabColorSchemeParams r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.mIntentBuilder
            r0.setDefaultColorSchemeParams(r2)
            return r1
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setDisplayMode(androidx.browser.trusted.TrustedWebActivityDisplayMode r1) {
            r0 = this;
            r0.mDisplayMode = r1
            return r0
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setNavigationBarColor(int r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.mIntentBuilder
            r0.setNavigationBarColor(r2)
            return r1
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setNavigationBarDividerColor(int r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.mIntentBuilder
            r0.setNavigationBarDividerColor(r2)
            return r1
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setScreenOrientation(int r1) {
            r0 = this;
            r0.mScreenOrientation = r1
            return r0
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setShareParams(androidx.browser.trusted.sharing.ShareTarget r1, androidx.browser.trusted.sharing.ShareData r2) {
            r0 = this;
            r0.mShareTarget = r1
            r0.mShareData = r2
            return r0
    }

    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setSplashScreenParams(android.os.Bundle r1) {
            r0 = this;
            r0.mSplashScreenParams = r1
            return r0
    }

    @java.lang.Deprecated
    public androidx.browser.trusted.TrustedWebActivityIntentBuilder setToolbarColor(int r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = r1.mIntentBuilder
            r0.setToolbarColor(r2)
            return r1
    }
}
