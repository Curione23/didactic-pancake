package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowserActionsIntent {
    public static final java.lang.String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final java.lang.String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final java.lang.String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final java.lang.String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final java.lang.String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final java.lang.String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final java.lang.String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    private static final java.lang.String KEY_ICON_URI = "androidx.browser.browseractions.ICON_URI";
    public static final java.lang.String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    public static final int MAX_CUSTOM_ITEMS = 5;
    private static final java.lang.String TAG = "BrowserActions";
    private static final java.lang.String TEST_URL = "https://www.example.com";
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;
    private static androidx.browser.browseractions.BrowserActionsIntent.BrowserActionsFallDialogListener sDialogListenter;
    private final android.content.Intent mIntent;

    interface BrowserActionsFallDialogListener {
        void onDialogShown();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BrowserActionsItemId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BrowserActionsUrlType {
    }

    public static final class Builder {
        private android.content.Context mContext;
        private java.util.List<android.net.Uri> mImageUris;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.os.Bundle> mMenuItems;
        private android.app.PendingIntent mOnItemSelectedPendingIntent;
        private int mType;
        private android.net.Uri mUri;

        public Builder(android.content.Context r3, android.net.Uri r4) {
                r2 = this;
                r2.<init>()
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "androidx.browser.browseractions.browser_action_open"
                r0.<init>(r1)
                r2.mIntent = r0
                r0 = 0
                r2.mType = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mMenuItems = r0
                r0 = 0
                r2.mOnItemSelectedPendingIntent = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mImageUris = r0
                r2.mContext = r3
                r2.mUri = r4
                return
        }

        private android.os.Bundle getBundleFromItem(androidx.browser.browseractions.BrowserActionItem r4) {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "androidx.browser.browseractions.TITLE"
                java.lang.String r2 = r4.getTitle()
                r0.putString(r1, r2)
                java.lang.String r1 = "androidx.browser.browseractions.ACTION"
                android.app.PendingIntent r2 = r4.getAction()
                r0.putParcelable(r1, r2)
                int r1 = r4.getIconId()
                if (r1 == 0) goto L26
                java.lang.String r1 = "androidx.browser.browseractions.ICON_ID"
                int r2 = r4.getIconId()
                r0.putInt(r1, r2)
            L26:
                android.net.Uri r1 = r4.getIconUri()
                if (r1 == 0) goto L35
                java.lang.String r1 = "androidx.browser.browseractions.ICON_URI"
                android.net.Uri r4 = r4.getIconUri()
                r0.putParcelable(r1, r4)
            L35:
                return r0
        }

        public androidx.browser.browseractions.BrowserActionsIntent build() {
                r4 = this;
                android.content.Intent r0 = r4.mIntent
                android.net.Uri r1 = r4.mUri
                r0.setData(r1)
                android.content.Intent r0 = r4.mIntent
                java.lang.String r1 = "androidx.browser.browseractions.extra.TYPE"
                int r2 = r4.mType
                r0.putExtra(r1, r2)
                android.content.Intent r0 = r4.mIntent
                java.lang.String r1 = "androidx.browser.browseractions.extra.MENU_ITEMS"
                java.util.ArrayList<android.os.Bundle> r2 = r4.mMenuItems
                r0.putParcelableArrayListExtra(r1, r2)
                android.content.Context r0 = r4.mContext
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                r2 = 67108864(0x4000000, float:1.5046328E-36)
                r3 = 0
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r3, r1, r2)
                android.content.Intent r1 = r4.mIntent
                java.lang.String r2 = "androidx.browser.browseractions.APP_ID"
                r1.putExtra(r2, r0)
                android.app.PendingIntent r0 = r4.mOnItemSelectedPendingIntent
                if (r0 == 0) goto L39
                android.content.Intent r1 = r4.mIntent
                java.lang.String r2 = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT"
                r1.putExtra(r2, r0)
            L39:
                android.content.Intent r0 = r4.mIntent
                java.util.List<android.net.Uri> r1 = r4.mImageUris
                android.content.Context r2 = r4.mContext
                androidx.browser.browseractions.BrowserServiceFileProvider.grantReadPermission(r0, r1, r2)
                androidx.browser.browseractions.BrowserActionsIntent r0 = new androidx.browser.browseractions.BrowserActionsIntent
                android.content.Intent r1 = r4.mIntent
                r0.<init>(r1)
                return r0
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setCustomItems(java.util.ArrayList<androidx.browser.browseractions.BrowserActionItem> r4) {
                r3 = this;
                int r0 = r4.size()
                r1 = 5
                if (r0 > r1) goto L60
                r0 = 0
            L8:
                int r1 = r4.size()
                if (r0 >= r1) goto L5f
                java.lang.Object r1 = r4.get(r0)
                androidx.browser.browseractions.BrowserActionItem r1 = (androidx.browser.browseractions.BrowserActionItem) r1
                java.lang.String r1 = r1.getTitle()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L57
                java.lang.Object r1 = r4.get(r0)
                androidx.browser.browseractions.BrowserActionItem r1 = (androidx.browser.browseractions.BrowserActionItem) r1
                android.app.PendingIntent r1 = r1.getAction()
                if (r1 == 0) goto L57
                java.util.ArrayList<android.os.Bundle> r1 = r3.mMenuItems
                java.lang.Object r2 = r4.get(r0)
                androidx.browser.browseractions.BrowserActionItem r2 = (androidx.browser.browseractions.BrowserActionItem) r2
                android.os.Bundle r2 = r3.getBundleFromItem(r2)
                r1.add(r2)
                java.lang.Object r1 = r4.get(r0)
                androidx.browser.browseractions.BrowserActionItem r1 = (androidx.browser.browseractions.BrowserActionItem) r1
                android.net.Uri r1 = r1.getIconUri()
                if (r1 == 0) goto L54
                java.util.List<android.net.Uri> r1 = r3.mImageUris
                java.lang.Object r2 = r4.get(r0)
                androidx.browser.browseractions.BrowserActionItem r2 = (androidx.browser.browseractions.BrowserActionItem) r2
                android.net.Uri r2 = r2.getIconUri()
                r1.add(r2)
            L54:
                int r0 = r0 + 1
                goto L8
            L57:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Custom item should contain a non-empty title and non-null intent."
                r4.<init>(r0)
                throw r4
            L5f:
                return r3
            L60:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Exceeded maximum toolbar item count of 5"
                r4.<init>(r0)
                throw r4
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setCustomItems(androidx.browser.browseractions.BrowserActionItem... r2) {
                r1 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.<init>(r2)
                androidx.browser.browseractions.BrowserActionsIntent$Builder r2 = r1.setCustomItems(r0)
                return r2
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setOnItemSelectedAction(android.app.PendingIntent r1) {
                r0 = this;
                r0.mOnItemSelectedPendingIntent = r1
                return r0
        }

        public androidx.browser.browseractions.BrowserActionsIntent.Builder setUrlType(int r1) {
                r0 = this;
                r0.mType = r1
                return r0
        }
    }

    BrowserActionsIntent(android.content.Intent r1) {
            r0 = this;
            r0.<init>()
            r0.mIntent = r1
            return
    }

    public static java.util.List<android.content.pm.ResolveInfo> getBrowserActionsIntentHandlers(android.content.Context r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "https://www.example.com"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "androidx.browser.browseractions.browser_action_open"
            r0.<init>(r2, r1)
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r1 = 131072(0x20000, float:1.83671E-40)
            java.util.List r3 = r3.queryIntentActivities(r0, r1)
            return r3
    }

    @java.lang.Deprecated
    public static java.lang.String getCreatorPackageName(android.content.Intent r0) {
            java.lang.String r0 = getUntrustedCreatorPackageName(r0)
            return r0
    }

    public static java.lang.String getUntrustedCreatorPackageName(android.content.Intent r1) {
            java.lang.String r0 = "androidx.browser.browseractions.APP_ID"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.getTargetPackage()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static void launchIntent(android.content.Context r1, android.content.Intent r2) {
            java.util.List r0 = getBrowserActionsIntentHandlers(r1)
            launchIntent(r1, r2, r0)
            return
    }

    static void launchIntent(android.content.Context r4, android.content.Intent r5, java.util.List<android.content.pm.ResolveInfo> r6) {
            if (r6 == 0) goto L5e
            int r0 = r6.size()
            if (r0 != 0) goto L9
            goto L5e
        L9:
            int r0 = r6.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1f
            java.lang.Object r6 = r6.get(r1)
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            java.lang.String r6 = r6.packageName
            r5.setPackage(r6)
            goto L59
        L1f:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "https://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r0.<init>(r3, r2)
            android.content.pm.PackageManager r2 = r4.getPackageManager()
            r3 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r0 = r2.resolveActivity(r0, r3)
            if (r0 == 0) goto L59
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r0 = r0.packageName
        L3c:
            int r2 = r6.size()
            if (r1 >= r2) goto L59
            java.lang.Object r2 = r6.get(r1)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r2 = r2.packageName
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L56
            r5.setPackage(r0)
            goto L59
        L56:
            int r1 = r1 + 1
            goto L3c
        L59:
            r6 = 0
            androidx.core.content.ContextCompat.startActivity(r4, r5, r6)
            return
        L5e:
            openFallbackBrowserActionsMenu(r4, r5)
            return
    }

    public static void openBrowserAction(android.content.Context r1, android.net.Uri r2) {
            androidx.browser.browseractions.BrowserActionsIntent$Builder r0 = new androidx.browser.browseractions.BrowserActionsIntent$Builder
            r0.<init>(r1, r2)
            androidx.browser.browseractions.BrowserActionsIntent r2 = r0.build()
            android.content.Intent r2 = r2.getIntent()
            launchIntent(r1, r2)
            return
    }

    public static void openBrowserAction(android.content.Context r1, android.net.Uri r2, int r3, java.util.ArrayList<androidx.browser.browseractions.BrowserActionItem> r4, android.app.PendingIntent r5) {
            androidx.browser.browseractions.BrowserActionsIntent$Builder r0 = new androidx.browser.browseractions.BrowserActionsIntent$Builder
            r0.<init>(r1, r2)
            androidx.browser.browseractions.BrowserActionsIntent$Builder r2 = r0.setUrlType(r3)
            androidx.browser.browseractions.BrowserActionsIntent$Builder r2 = r2.setCustomItems(r4)
            androidx.browser.browseractions.BrowserActionsIntent$Builder r2 = r2.setOnItemSelectedAction(r5)
            androidx.browser.browseractions.BrowserActionsIntent r2 = r2.build()
            android.content.Intent r2 = r2.getIntent()
            launchIntent(r1, r2)
            return
    }

    private static void openFallbackBrowserActionsMenu(android.content.Context r2, android.content.Intent r3) {
            android.net.Uri r0 = r3.getData()
            java.lang.String r1 = "androidx.browser.browseractions.extra.MENU_ITEMS"
            java.util.ArrayList r3 = r3.getParcelableArrayListExtra(r1)
            if (r3 == 0) goto L11
            java.util.List r3 = parseBrowserActionItems(r3)
            goto L12
        L11:
            r3 = 0
        L12:
            openFallbackBrowserActionsMenu(r2, r0, r3)
            return
    }

    private static void openFallbackBrowserActionsMenu(android.content.Context r1, android.net.Uri r2, java.util.List<androidx.browser.browseractions.BrowserActionItem> r3) {
            androidx.browser.browseractions.BrowserActionsFallbackMenuUi r0 = new androidx.browser.browseractions.BrowserActionsFallbackMenuUi
            r0.<init>(r1, r2, r3)
            r0.displayMenu()
            androidx.browser.browseractions.BrowserActionsIntent$BrowserActionsFallDialogListener r1 = androidx.browser.browseractions.BrowserActionsIntent.sDialogListenter
            if (r1 == 0) goto Lf
            r1.onDialogShown()
        Lf:
            return
    }

    public static java.util.List<androidx.browser.browseractions.BrowserActionItem> parseBrowserActionItems(java.util.ArrayList<android.os.Bundle> r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r7.size()
            if (r1 >= r2) goto L52
            java.lang.Object r2 = r7.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "androidx.browser.browseractions.TITLE"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "androidx.browser.browseractions.ACTION"
            android.os.Parcelable r4 = r2.getParcelable(r4)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            java.lang.String r5 = "androidx.browser.browseractions.ICON_ID"
            int r5 = r2.getInt(r5)
            java.lang.String r6 = "androidx.browser.browseractions.ICON_URI"
            android.os.Parcelable r2 = r2.getParcelable(r6)
            android.net.Uri r2 = (android.net.Uri) r2
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L4a
            if (r4 == 0) goto L4a
            if (r5 == 0) goto L3e
            androidx.browser.browseractions.BrowserActionItem r2 = new androidx.browser.browseractions.BrowserActionItem
            r2.<init>(r3, r4, r5)
            goto L44
        L3e:
            androidx.browser.browseractions.BrowserActionItem r5 = new androidx.browser.browseractions.BrowserActionItem
            r5.<init>(r3, r4, r2)
            r2 = r5
        L44:
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L4a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Custom item should contain a non-empty title and non-null intent."
            r7.<init>(r0)
            throw r7
        L52:
            return r0
    }

    static void setDialogShownListenter(androidx.browser.browseractions.BrowserActionsIntent.BrowserActionsFallDialogListener r0) {
            androidx.browser.browseractions.BrowserActionsIntent.sDialogListenter = r0
            return
    }

    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.mIntent
            return r0
    }
}
