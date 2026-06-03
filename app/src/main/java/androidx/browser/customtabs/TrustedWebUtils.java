package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebUtils {
    public static final java.lang.String ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";
    public static final java.lang.String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    private TrustedWebUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areSplashScreensSupported(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.support.customtabs.action.CustomTabsService"
            android.content.Intent r0 = r0.setAction(r1)
            android.content.Intent r3 = r0.setPackage(r3)
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r0 = 64
            android.content.pm.ResolveInfo r2 = r2.resolveService(r3, r0)
            if (r2 == 0) goto L27
            android.content.IntentFilter r3 = r2.filter
            if (r3 != 0) goto L20
            goto L27
        L20:
            android.content.IntentFilter r2 = r2.filter
            boolean r2 = r2.hasCategory(r4)
            return r2
        L27:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static void launchAsTrustedWebActivity(android.content.Context r3, androidx.browser.customtabs.CustomTabsIntent r4, android.net.Uri r5) {
            android.content.Intent r0 = r4.intent
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "android.support.customtabs.extra.SESSION"
            android.os.IBinder r0 = r0.getBinder(r1)
            if (r0 == 0) goto L1a
            android.content.Intent r0 = r4.intent
            java.lang.String r1 = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY"
            r2 = 1
            r0.putExtra(r1, r2)
            r4.launchUrl(r3, r5)
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Given CustomTabsIntent should be associated with a valid CustomTabsSession"
            r3.<init>(r4)
            throw r3
    }

    public static void launchBrowserSiteSettings(android.content.Context r3, androidx.browser.customtabs.CustomTabsSession r4, android.net.Uri r5) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA"
            r0.<init>(r1)
            android.content.ComponentName r1 = r4.getComponentName()
            java.lang.String r1 = r1.getPackageName()
            r0.setPackage(r1)
            r0.setData(r5)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r1 = "android.support.customtabs.extra.SESSION"
            android.os.IBinder r2 = r4.getBinder()
            r5.putBinder(r1, r2)
            r0.putExtras(r5)
            android.app.PendingIntent r4 = r4.getId()
            if (r4 == 0) goto L31
            java.lang.String r5 = "android.support.customtabs.extra.SESSION_ID"
            r0.putExtra(r5, r4)
        L31:
            r3.startActivity(r0)
            return
    }

    public static boolean transferSplashImage(android.content.Context r0, java.io.File r1, java.lang.String r2, java.lang.String r3, androidx.browser.customtabs.CustomTabsSession r4) {
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r0, r2, r1)
            r2 = 1
            r0.grantUriPermission(r3, r1, r2)
            r0 = 0
            boolean r0 = r4.receiveFile(r1, r2, r0)
            return r0
    }
}
