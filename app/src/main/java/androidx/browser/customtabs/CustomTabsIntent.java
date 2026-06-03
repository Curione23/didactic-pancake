package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsIntent {
    public static final int ACTIVITY_HEIGHT_ADJUSTABLE = 1;
    public static final int ACTIVITY_HEIGHT_DEFAULT = 0;
    public static final int ACTIVITY_HEIGHT_FIXED = 2;
    private static final int ACTIVITY_HEIGHT_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DIVIDER = 3;
    private static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_MAX = 3;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_SHADOW = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_END = 2;
    private static final int ACTIVITY_SIDE_SHEET_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_START = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_DEFAULT = 0;
    private static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_TOP = 2;
    public static final int CLOSE_BUTTON_POSITION_DEFAULT = 0;
    public static final int CLOSE_BUTTON_POSITION_END = 2;
    private static final int CLOSE_BUTTON_POSITION_MAX = 2;
    public static final int CLOSE_BUTTON_POSITION_START = 1;
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    private static final int COLOR_SCHEME_MAX = 2;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final java.lang.String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final java.lang.String EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final java.lang.String EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final java.lang.String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final java.lang.String EXTRA_CLOSE_BUTTON_POSITION = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final java.lang.String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final java.lang.String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    @java.lang.Deprecated
    public static final java.lang.String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final java.lang.String EXTRA_DISABLE_BACKGROUND_INTERACTION = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final java.lang.String EXTRA_DISABLE_BOOKMARKS_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final java.lang.String EXTRA_DISABLE_DOWNLOAD_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final java.lang.String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final java.lang.String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final java.lang.String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final java.lang.String EXTRA_INITIAL_ACTIVITY_HEIGHT_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final java.lang.String EXTRA_INITIAL_ACTIVITY_WIDTH_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final java.lang.String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final java.lang.String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final java.lang.String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final java.lang.String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final java.lang.String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final java.lang.String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final java.lang.String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final java.lang.String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final java.lang.String EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final java.lang.String EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final java.lang.String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
    public static final java.lang.String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final java.lang.String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final java.lang.String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final java.lang.String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final java.lang.String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final java.lang.String EXTRA_TOOLBAR_CORNER_RADIUS_DP = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final java.lang.String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final java.lang.String EXTRA_TRANSLATE_LANGUAGE_TAG = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    private static final java.lang.String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
    private static final java.lang.String HTTP_ACCEPT_LANGUAGE = "Accept-Language";
    public static final java.lang.String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final java.lang.String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final java.lang.String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final java.lang.String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final java.lang.String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    private static final int MAX_TOOLBAR_CORNER_RADIUS_DP = 16;
    private static final int MAX_TOOLBAR_ITEMS = 5;
    public static final int NO_TITLE = 0;
    public static final int SHARE_STATE_DEFAULT = 0;
    private static final int SHARE_STATE_MAX = 2;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
    public final android.content.Intent intent;
    public final android.os.Bundle startAnimationBundle;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivityHeightResizeBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetDecorationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Locale getLocaleForLanguageTag(android.content.Intent r1) {
                java.lang.String r0 = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG"
                java.lang.String r1 = r1.getStringExtra(r0)
                if (r1 == 0) goto Ld
                java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
                goto Le
            Ld:
                r1 = 0
            Le:
                return r1
        }

        static void setLanguageTag(android.content.Intent r1, java.util.Locale r2) {
                java.lang.String r0 = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG"
                java.lang.String r2 = r2.toLanguageTag()
                r1.putExtra(r0, r2)
                return
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.ActivityOptions makeBasicActivityOptions() {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()
                return r0
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getDefaultLocale() {
                android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
                int r1 = r0.size()
                if (r1 <= 0) goto L14
                r1 = 0
                java.util.Locale r0 = r0.get(r1)
                java.lang.String r0 = r0.toLanguageTag()
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setShareIdentityEnabled(android.app.ActivityOptions r0, boolean r1) {
                r0.setShareIdentityEnabled(r1)
                return
        }
    }

    public static final class Builder {
        private java.util.ArrayList<android.os.Bundle> mActionButtons;
        private android.app.ActivityOptions mActivityOptions;
        private android.util.SparseArray<android.os.Bundle> mColorSchemeParamBundles;
        private final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder;
        private android.os.Bundle mDefaultColorSchemeBundle;
        private boolean mInstantAppsEnabled;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.os.Bundle> mMenuItems;
        private boolean mShareIdentity;
        private int mShareState;

        public Builder() {
                r2 = this;
                r2.<init>()
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r2.mIntent = r0
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams$Builder
                r0.<init>()
                r2.mDefaultColorSchemeBuilder = r0
                r0 = 0
                r2.mShareState = r0
                r0 = 1
                r2.mInstantAppsEnabled = r0
                return
        }

        public Builder(androidx.browser.customtabs.CustomTabsSession r3) {
                r2 = this;
                r2.<init>()
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r2.mIntent = r0
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams$Builder
                r0.<init>()
                r2.mDefaultColorSchemeBuilder = r0
                r0 = 0
                r2.mShareState = r0
                r0 = 1
                r2.mInstantAppsEnabled = r0
                if (r3 == 0) goto L1e
                r2.setSession(r3)
            L1e:
                return
        }

        private void setCurrentLocaleAsDefaultAcceptLanguage() {
                r5 = this;
                java.lang.String r0 = androidx.browser.customtabs.CustomTabsIntent.Api24Impl.getDefaultLocale()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L30
                android.content.Intent r1 = r5.mIntent
                java.lang.String r2 = "com.android.browser.headers"
                boolean r1 = r1.hasExtra(r2)
                if (r1 == 0) goto L1b
                android.content.Intent r1 = r5.mIntent
                android.os.Bundle r1 = r1.getBundleExtra(r2)
                goto L20
            L1b:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
            L20:
                java.lang.String r3 = "Accept-Language"
                boolean r4 = r1.containsKey(r3)
                if (r4 != 0) goto L30
                r1.putString(r3, r0)
                android.content.Intent r0 = r5.mIntent
                r0.putExtra(r2, r1)
            L30:
                return
        }

        private void setLanguageTag(java.util.Locale r2) {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                androidx.browser.customtabs.CustomTabsIntent.Api21Impl.setLanguageTag(r0, r2)
                return
        }

        private void setSessionParameters(android.os.IBinder r3, android.app.PendingIntent r4) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.extra.SESSION"
                r0.putBinder(r1, r3)
                if (r4 == 0) goto L11
                java.lang.String r3 = "android.support.customtabs.extra.SESSION_ID"
                r0.putParcelable(r3, r4)
            L11:
                android.content.Intent r3 = r2.mIntent
                r3.putExtras(r0)
                return
        }

        private void setShareIdentityEnabled() {
                r2 = this;
                android.app.ActivityOptions r0 = r2.mActivityOptions
                if (r0 != 0) goto La
                android.app.ActivityOptions r0 = androidx.browser.customtabs.CustomTabsIntent.Api23Impl.makeBasicActivityOptions()
                r2.mActivityOptions = r0
            La:
                android.app.ActivityOptions r0 = r2.mActivityOptions
                boolean r1 = r2.mShareIdentity
                androidx.browser.customtabs.CustomTabsIntent.Api34Impl.setShareIdentityEnabled(r0, r1)
                return
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder addDefaultShareMenuItem() {
                r1 = this;
                r0 = 1
                r1.setShareState(r0)
                return r1
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder addMenuItem(java.lang.String r3, android.app.PendingIntent r4) {
                r2 = this;
                java.util.ArrayList<android.os.Bundle> r0 = r2.mMenuItems
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mMenuItems = r0
            Lb:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.customaction.MENU_ITEM_TITLE"
                r0.putString(r1, r3)
                java.lang.String r3 = "android.support.customtabs.customaction.PENDING_INTENT"
                r0.putParcelable(r3, r4)
                java.util.ArrayList<android.os.Bundle> r3 = r2.mMenuItems
                r3.add(r0)
                return r2
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder addToolbarItem(int r3, android.graphics.Bitmap r4, java.lang.String r5, android.app.PendingIntent r6) throws java.lang.IllegalStateException {
                r2 = this;
                java.util.ArrayList<android.os.Bundle> r0 = r2.mActionButtons
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mActionButtons = r0
            Lb:
                java.util.ArrayList<android.os.Bundle> r0 = r2.mActionButtons
                int r0 = r0.size()
                r1 = 5
                if (r0 >= r1) goto L33
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.customaction.ID"
                r0.putInt(r1, r3)
                java.lang.String r3 = "android.support.customtabs.customaction.ICON"
                r0.putParcelable(r3, r4)
                java.lang.String r3 = "android.support.customtabs.customaction.DESCRIPTION"
                r0.putString(r3, r5)
                java.lang.String r3 = "android.support.customtabs.customaction.PENDING_INTENT"
                r0.putParcelable(r3, r6)
                java.util.ArrayList<android.os.Bundle> r3 = r2.mActionButtons
                r3.add(r0)
                return r2
            L33:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "Exceeded maximum toolbar item count of 5"
                r3.<init>(r4)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent build() {
                r4 = this;
                android.content.Intent r0 = r4.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.SESSION"
                boolean r0 = r0.hasExtra(r1)
                r1 = 0
                if (r0 != 0) goto Le
                r4.setSessionParameters(r1, r1)
            Le:
                java.util.ArrayList<android.os.Bundle> r0 = r4.mMenuItems
                if (r0 == 0) goto L19
                android.content.Intent r2 = r4.mIntent
                java.lang.String r3 = "android.support.customtabs.extra.MENU_ITEMS"
                r2.putParcelableArrayListExtra(r3, r0)
            L19:
                java.util.ArrayList<android.os.Bundle> r0 = r4.mActionButtons
                if (r0 == 0) goto L24
                android.content.Intent r2 = r4.mIntent
                java.lang.String r3 = "android.support.customtabs.extra.TOOLBAR_ITEMS"
                r2.putParcelableArrayListExtra(r3, r0)
            L24:
                android.content.Intent r0 = r4.mIntent
                java.lang.String r2 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
                boolean r3 = r4.mInstantAppsEnabled
                r0.putExtra(r2, r3)
                android.content.Intent r0 = r4.mIntent
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r2 = r4.mDefaultColorSchemeBuilder
                androidx.browser.customtabs.CustomTabColorSchemeParams r2 = r2.build()
                android.os.Bundle r2 = r2.toBundle()
                r0.putExtras(r2)
                android.os.Bundle r0 = r4.mDefaultColorSchemeBundle
                if (r0 == 0) goto L45
                android.content.Intent r2 = r4.mIntent
                r2.putExtras(r0)
            L45:
                android.util.SparseArray<android.os.Bundle> r0 = r4.mColorSchemeParamBundles
                if (r0 == 0) goto L5a
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r2 = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS"
                android.util.SparseArray<android.os.Bundle> r3 = r4.mColorSchemeParamBundles
                r0.putSparseParcelableArray(r2, r3)
                android.content.Intent r2 = r4.mIntent
                r2.putExtras(r0)
            L5a:
                android.content.Intent r0 = r4.mIntent
                java.lang.String r2 = "androidx.browser.customtabs.extra.SHARE_STATE"
                int r3 = r4.mShareState
                r0.putExtra(r2, r3)
                r4.setCurrentLocaleAsDefaultAcceptLanguage()
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 34
                if (r0 < r2) goto L6f
                r4.setShareIdentityEnabled()
            L6f:
                android.app.ActivityOptions r0 = r4.mActivityOptions
                if (r0 == 0) goto L77
                android.os.Bundle r1 = r0.toBundle()
            L77:
                androidx.browser.customtabs.CustomTabsIntent r0 = new androidx.browser.customtabs.CustomTabsIntent
                android.content.Intent r2 = r4.mIntent
                r0.<init>(r2, r1)
                return r0
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder enableUrlBarHiding() {
                r3 = this;
                android.content.Intent r0 = r3.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"
                r2 = 1
                r0.putExtra(r1, r2)
                return r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActionButton(android.graphics.Bitmap r2, java.lang.String r3, android.app.PendingIntent r4) {
                r1 = this;
                r0 = 0
                androidx.browser.customtabs.CustomTabsIntent$Builder r2 = r1.setActionButton(r2, r3, r4, r0)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActionButton(android.graphics.Bitmap r4, java.lang.String r5, android.app.PendingIntent r6, boolean r7) {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.customaction.ID"
                r2 = 0
                r0.putInt(r1, r2)
                java.lang.String r1 = "android.support.customtabs.customaction.ICON"
                r0.putParcelable(r1, r4)
                java.lang.String r4 = "android.support.customtabs.customaction.DESCRIPTION"
                r0.putString(r4, r5)
                java.lang.String r4 = "android.support.customtabs.customaction.PENDING_INTENT"
                r0.putParcelable(r4, r6)
                android.content.Intent r4 = r3.mIntent
                java.lang.String r5 = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE"
                r4.putExtra(r5, r0)
                android.content.Intent r4 = r3.mIntent
                java.lang.String r5 = "android.support.customtabs.extra.TINT_ACTION_BUTTON"
                r4.putExtra(r5, r7)
                return r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetBreakpointDp(int r3) {
                r2 = this;
                if (r3 <= 0) goto La
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP"
                r0.putExtra(r1, r3)
                return r2
            La:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the initialWidthPx argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetDecorationType(int r3) {
                r2 = this;
                if (r3 < 0) goto Ld
                r0 = 3
                if (r3 > r0) goto Ld
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE"
                r0.putExtra(r1, r3)
                return r2
            Ld:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the decorationType argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetMaximizationEnabled(boolean r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetPosition(int r3) {
                r2 = this;
                if (r3 < 0) goto Ld
                r0 = 2
                if (r3 > r0) goto Ld
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION"
                r0.putExtra(r1, r3)
                return r2
            Ld:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the sideSheetPosition argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setActivitySideSheetRoundedCornersPosition(int r3) {
                r2 = this;
                if (r3 < 0) goto Ld
                r0 = 2
                if (r3 > r0) goto Ld
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION"
                r0.putExtra(r1, r3)
                return r2
            Ld:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the roundedCornersPosition./ argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setBackgroundInteractionEnabled(boolean r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                r3 = r3 ^ 1
                java.lang.String r1 = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setBookmarksButtonEnabled(boolean r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                r3 = r3 ^ 1
                java.lang.String r1 = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setCloseButtonIcon(android.graphics.Bitmap r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.CLOSE_BUTTON_ICON"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setCloseButtonPosition(int r3) {
                r2 = this;
                if (r3 < 0) goto Ld
                r0 = 2
                if (r3 > r0) goto Ld
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION"
                r0.putExtra(r1, r3)
                return r2
            Ld:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the position argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setColorScheme(int r3) {
                r2 = this;
                if (r3 < 0) goto Ld
                r0 = 2
                if (r3 > r0) goto Ld
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.COLOR_SCHEME"
                r0.putExtra(r1, r3)
                return r2
            Ld:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the colorScheme argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setColorSchemeParams(int r3, androidx.browser.customtabs.CustomTabColorSchemeParams r4) {
                r2 = this;
                if (r3 < 0) goto L1c
                r0 = 2
                if (r3 > r0) goto L1c
                if (r3 == 0) goto L1c
                android.util.SparseArray<android.os.Bundle> r0 = r2.mColorSchemeParamBundles
                if (r0 != 0) goto L12
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r2.mColorSchemeParamBundles = r0
            L12:
                android.util.SparseArray<android.os.Bundle> r0 = r2.mColorSchemeParamBundles
                android.os.Bundle r4 = r4.toBundle()
                r0.put(r3, r4)
                return r2
            L1c:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Invalid colorScheme: "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setDefaultColorSchemeParams(androidx.browser.customtabs.CustomTabColorSchemeParams r1) {
                r0 = this;
                android.os.Bundle r1 = r1.toBundle()
                r0.mDefaultColorSchemeBundle = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setDefaultShareMenuItemEnabled(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                r1 = 1
                r0.setShareState(r1)
                goto Lb
            L7:
                r1 = 2
                r0.setShareState(r1)
            Lb:
                return r0
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setDownloadButtonEnabled(boolean r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                r3 = r3 ^ 1
                java.lang.String r1 = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setExitAnimations(android.content.Context r1, int r2, int r3) {
                r0 = this;
                androidx.core.app.ActivityOptionsCompat r1 = androidx.core.app.ActivityOptionsCompat.makeCustomAnimation(r1, r2, r3)
                android.os.Bundle r1 = r1.toBundle()
                android.content.Intent r2 = r0.mIntent
                java.lang.String r3 = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE"
                r2.putExtra(r3, r1)
                return r0
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityHeightPx(int r2) {
                r1 = this;
                r0 = 0
                androidx.browser.customtabs.CustomTabsIntent$Builder r2 = r1.setInitialActivityHeightPx(r2, r0)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityHeightPx(int r3, int r4) {
                r2 = this;
                if (r3 <= 0) goto L1e
                if (r4 < 0) goto L16
                r0 = 2
                if (r4 > r0) goto L16
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX"
                r0.putExtra(r1, r3)
                android.content.Intent r3 = r2.mIntent
                java.lang.String r0 = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR"
                r3.putExtra(r0, r4)
                return r2
            L16:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Invalid value for the activityHeightResizeBehavior argument"
                r3.<init>(r4)
                throw r3
            L1e:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Invalid value for the initialHeightPx argument"
                r3.<init>(r4)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInitialActivityWidthPx(int r3) {
                r2 = this;
                if (r3 <= 0) goto La
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX"
                r0.putExtra(r1, r3)
                return r2
            La:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the initialWidthPx argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setInstantAppsEnabled(boolean r1) {
                r0 = this;
                r0.mInstantAppsEnabled = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setNavigationBarColor(int r2) {
                r1 = this;
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = r1.mDefaultColorSchemeBuilder
                r0.setNavigationBarColor(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setNavigationBarDividerColor(int r2) {
                r1 = this;
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = r1.mDefaultColorSchemeBuilder
                r0.setNavigationBarDividerColor(r2)
                return r1
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setPendingSession(androidx.browser.customtabs.CustomTabsSession.PendingSession r2) {
                r1 = this;
                r0 = 0
                android.app.PendingIntent r2 = r2.getId()
                r1.setSessionParameters(r0, r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarColor(int r2) {
                r1 = this;
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = r1.mDefaultColorSchemeBuilder
                r0.setSecondaryToolbarColor(r2)
                return r1
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarSwipeUpGesture(android.app.PendingIntent r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSecondaryToolbarViews(android.widget.RemoteViews r3, int[] r4, android.app.PendingIntent r5) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS"
                r0.putExtra(r1, r3)
                android.content.Intent r3 = r2.mIntent
                java.lang.String r0 = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS"
                r3.putExtra(r0, r4)
                android.content.Intent r3 = r2.mIntent
                java.lang.String r4 = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT"
                r3.putExtra(r4, r5)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSendToExternalDefaultHandlerEnabled(boolean r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSession(androidx.browser.customtabs.CustomTabsSession r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                android.content.ComponentName r1 = r3.getComponentName()
                java.lang.String r1 = r1.getPackageName()
                r0.setPackage(r1)
                android.os.IBinder r0 = r3.getBinder()
                android.app.PendingIntent r3 = r3.getId()
                r2.setSessionParameters(r0, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setShareIdentityEnabled(boolean r1) {
                r0 = this;
                r0.mShareIdentity = r1
                return r0
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setShareState(int r4) {
                r3 = this;
                if (r4 < 0) goto L21
                r0 = 2
                if (r4 > r0) goto L21
                r3.mShareState = r4
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.extra.SHARE_MENU_ITEM"
                if (r4 != r1) goto L12
                android.content.Intent r4 = r3.mIntent
                r4.putExtra(r2, r1)
                goto L20
            L12:
                if (r4 != r0) goto L1b
                android.content.Intent r4 = r3.mIntent
                r0 = 0
                r4.putExtra(r2, r0)
                goto L20
            L1b:
                android.content.Intent r4 = r3.mIntent
                r4.removeExtra(r2)
            L20:
                return r3
            L21:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the shareState argument"
                r4.<init>(r0)
                throw r4
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setShowTitle(boolean r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.TITLE_VISIBILITY"
                r0.putExtra(r1, r3)
                return r2
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setStartAnimations(android.content.Context r1, int r2, int r3) {
                r0 = this;
                android.app.ActivityOptions r1 = android.app.ActivityOptions.makeCustomAnimation(r1, r2, r3)
                r0.mActivityOptions = r1
                return r0
        }

        @java.lang.Deprecated
        public androidx.browser.customtabs.CustomTabsIntent.Builder setToolbarColor(int r2) {
                r1 = this;
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = r1.mDefaultColorSchemeBuilder
                r0.setToolbarColor(r2)
                return r1
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setToolbarCornerRadiusDp(int r3) {
                r2 = this;
                if (r3 < 0) goto Le
                r0 = 16
                if (r3 > r0) goto Le
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP"
                r0.putExtra(r1, r3)
                return r2
            Le:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid value for the cornerRadiusDp argument"
                r3.<init>(r0)
                throw r3
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setTranslateLocale(java.util.Locale r1) {
                r0 = this;
                r0.setLanguageTag(r1)
                return r0
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setUrlBarHidingEnabled(boolean r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"
                r0.putExtra(r1, r3)
                return r2
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CloseButtonPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShareState {
    }

    CustomTabsIntent(android.content.Intent r1, android.os.Bundle r2) {
            r0 = this;
            r0.<init>()
            r0.intent = r1
            r0.startAnimationBundle = r2
            return
    }

    public static int getActivityResizeBehavior(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static int getActivitySideSheetBreakpointDp(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static int getActivitySideSheetDecorationType(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static int getActivitySideSheetPosition(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static int getActivitySideSheetRoundedCornersPosition(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static int getCloseButtonPosition(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static androidx.browser.customtabs.CustomTabColorSchemeParams getColorSchemeParams(android.content.Intent r2, int r3) {
            if (r3 < 0) goto L31
            r0 = 2
            if (r3 > r0) goto L31
            if (r3 == 0) goto L31
            android.os.Bundle r2 = r2.getExtras()
            if (r2 != 0) goto L13
            r2 = 0
            androidx.browser.customtabs.CustomTabColorSchemeParams r2 = androidx.browser.customtabs.CustomTabColorSchemeParams.fromBundle(r2)
            return r2
        L13:
            androidx.browser.customtabs.CustomTabColorSchemeParams r0 = androidx.browser.customtabs.CustomTabColorSchemeParams.fromBundle(r2)
            java.lang.String r1 = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS"
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r1)
            if (r2 == 0) goto L30
            java.lang.Object r2 = r2.get(r3)
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto L30
            androidx.browser.customtabs.CustomTabColorSchemeParams r2 = androidx.browser.customtabs.CustomTabColorSchemeParams.fromBundle(r2)
            androidx.browser.customtabs.CustomTabColorSchemeParams r2 = r2.withDefaults(r0)
            return r2
        L30:
            return r0
        L31:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid colorScheme: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static int getInitialActivityHeightPx(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static int getInitialActivityWidthPx(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX"
            r1 = 0
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    private static java.util.Locale getLocaleForLanguageTag(android.content.Intent r0) {
            java.util.Locale r0 = androidx.browser.customtabs.CustomTabsIntent.Api21Impl.getLocaleForLanguageTag(r0)
            return r0
    }

    public static int getMaxToolbarItems() {
            r0 = 5
            return r0
    }

    public static android.app.PendingIntent getSecondaryToolbarSwipeUpGesture(android.content.Intent r1) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            return r1
    }

    public static int getToolbarCornerRadiusDp(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP"
            r1 = 16
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static java.util.Locale getTranslateLocale(android.content.Intent r0) {
            java.util.Locale r0 = getLocaleForLanguageTag(r0)
            return r0
    }

    public static boolean isActivitySideSheetMaximizationEnabled(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION"
            r1 = 0
            boolean r2 = r2.getBooleanExtra(r0, r1)
            return r2
    }

    public static boolean isBackgroundInteractionEnabled(android.content.Intent r2) {
            java.lang.String r0 = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION"
            r1 = 0
            boolean r2 = r2.getBooleanExtra(r0, r1)
            r2 = r2 ^ 1
            return r2
    }

    public static boolean isBookmarksButtonEnabled(android.content.Intent r2) {
            java.lang.String r0 = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON"
            r1 = 0
            boolean r2 = r2.getBooleanExtra(r0, r1)
            r2 = r2 ^ 1
            return r2
    }

    public static boolean isDownloadButtonEnabled(android.content.Intent r2) {
            java.lang.String r0 = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON"
            r1 = 0
            boolean r2 = r2.getBooleanExtra(r0, r1)
            r2 = r2 ^ 1
            return r2
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(android.content.Intent r2) {
            java.lang.String r0 = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER"
            r1 = 0
            boolean r2 = r2.getBooleanExtra(r0, r1)
            return r2
    }

    public static android.content.Intent setAlwaysUseBrowserUI(android.content.Intent r2) {
            if (r2 != 0) goto L9
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r2.<init>(r0)
        L9:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r0)
            java.lang.String r0 = "android.support.customtabs.extra.user_opt_out"
            r1 = 1
            r2.putExtra(r0, r1)
            return r2
    }

    public static boolean shouldAlwaysUseBrowserUI(android.content.Intent r2) {
            java.lang.String r0 = "android.support.customtabs.extra.user_opt_out"
            r1 = 0
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L13
            int r2 = r2.getFlags()
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2 = r2 & r0
            if (r2 == 0) goto L13
            r1 = 1
        L13:
            return r1
    }

    public void launchUrl(android.content.Context r2, android.net.Uri r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.setData(r3)
            android.content.Intent r3 = r1.intent
            android.os.Bundle r0 = r1.startAnimationBundle
            androidx.core.content.ContextCompat.startActivity(r2, r3, r0)
            return
    }
}
