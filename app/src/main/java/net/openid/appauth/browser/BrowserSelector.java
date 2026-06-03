package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public final class BrowserSelector {
    static final java.lang.String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    static final android.content.Intent BROWSER_INTENT = null;
    private static final java.lang.String SCHEME_HTTP = "http";
    private static final java.lang.String SCHEME_HTTPS = "https";

    static {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = "android.intent.category.BROWSABLE"
            android.content.Intent r0 = r0.addCategory(r1)
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = "http"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r2)
            android.content.Intent r0 = r0.setData(r1)
            net.openid.appauth.browser.BrowserSelector.BROWSER_INTENT = r0
            return
    }

    public BrowserSelector() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<net.openid.appauth.browser.BrowserDescriptor> getAllBrowsers(android.content.Context r9) {
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Intent r1 = net.openid.appauth.browser.BrowserSelector.BROWSER_INTENT
            r2 = 0
            android.content.pm.ResolveInfo r3 = r9.resolveActivity(r1, r2)
            if (r3 == 0) goto L17
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L18
        L17:
            r3 = 0
        L18:
            r4 = 131136(0x20040, float:1.8376E-40)
            java.util.List r1 = r9.queryIntentActivities(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            boolean r5 = isFullBrowser(r4)
            if (r5 != 0) goto L36
            goto L23
        L36:
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r5 = r5.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r6 = 64
            android.content.pm.PackageInfo r5 = r9.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r6 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r6 = r6.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            boolean r6 = hasWarmupService(r9, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r6 == 0) goto L61
            net.openid.appauth.browser.BrowserDescriptor r6 = new net.openid.appauth.browser.BrowserDescriptor     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r7 = 1
            r6.<init>(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r8 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r8 = r8.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            boolean r8 = r8.equals(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r8 == 0) goto L5e
            r0.add(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L62
        L5e:
            r0.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
        L61:
            r7 = r2
        L62:
            net.openid.appauth.browser.BrowserDescriptor r6 = new net.openid.appauth.browser.BrowserDescriptor     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r6.<init>(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            boolean r4 = r4.equals(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r4 == 0) goto L75
            r0.add(r7, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L23
        L75:
            r0.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L23
        L79:
            return r0
    }

    private static boolean hasWarmupService(android.content.pm.PackageManager r2, java.lang.String r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.support.customtabs.action.CustomTabsService"
            r0.setAction(r1)
            r0.setPackage(r3)
            r3 = 0
            android.content.pm.ResolveInfo r2 = r2.resolveService(r0, r3)
            if (r2 == 0) goto L15
            r3 = 1
        L15:
            return r3
    }

    private static boolean isFullBrowser(android.content.pm.ResolveInfo r5) {
            android.content.IntentFilter r0 = r5.filter
            r1 = 0
            if (r0 == 0) goto L53
            android.content.IntentFilter r0 = r5.filter
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r0 = r0.hasAction(r2)
            if (r0 == 0) goto L53
            android.content.IntentFilter r0 = r5.filter
            java.lang.String r2 = "android.intent.category.BROWSABLE"
            boolean r0 = r0.hasCategory(r2)
            if (r0 == 0) goto L53
            android.content.IntentFilter r0 = r5.filter
            java.util.Iterator r0 = r0.schemesIterator()
            if (r0 != 0) goto L22
            goto L53
        L22:
            android.content.IntentFilter r0 = r5.filter
            java.util.Iterator r0 = r0.authoritiesIterator()
            if (r0 == 0) goto L2b
            return r1
        L2b:
            android.content.IntentFilter r5 = r5.filter
            java.util.Iterator r5 = r5.schemesIterator()
            r0 = r1
            r2 = r0
        L33:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r3)
            r0 = r0 | r4
            java.lang.String r4 = "https"
            boolean r3 = r4.equals(r3)
            r2 = r2 | r3
            if (r0 == 0) goto L33
            if (r2 == 0) goto L33
            r5 = 1
            return r5
        L53:
            return r1
    }

    public static net.openid.appauth.browser.BrowserDescriptor select(android.content.Context r3, net.openid.appauth.browser.BrowserMatcher r4) {
            java.util.List r3 = getAllBrowsers(r3)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            net.openid.appauth.browser.BrowserDescriptor r1 = (net.openid.appauth.browser.BrowserDescriptor) r1
            boolean r2 = r4.matches(r1)
            if (r2 != 0) goto L1c
            goto L9
        L1c:
            java.lang.Boolean r2 = r1.useCustomTab
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L25
            return r1
        L25:
            if (r0 != 0) goto L9
            r0 = r1
            goto L9
        L29:
            return r0
    }
}
