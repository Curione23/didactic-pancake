package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient {
    private static final java.lang.String TAG = "CustomTabsClient";
    private final android.content.Context mApplicationContext;
    private final android.support.customtabs.ICustomTabsService mService;
    private final android.content.ComponentName mServiceComponentName;



    CustomTabsClient(android.support.customtabs.ICustomTabsService r1, android.content.ComponentName r2, android.content.Context r3) {
            r0 = this;
            r0.<init>()
            r0.mService = r1
            r0.mServiceComponentName = r2
            r0.mApplicationContext = r3
            return
    }

    public static boolean bindCustomTabsService(android.content.Context r2, java.lang.String r3, androidx.browser.customtabs.CustomTabsServiceConnection r4) {
            android.content.Context r0 = r2.getApplicationContext()
            r4.setApplicationContext(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.support.customtabs.action.CustomTabsService"
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L17
            r0.setPackage(r3)
        L17:
            r3 = 33
            boolean r2 = r2.bindService(r0, r4, r3)
            return r2
    }

    public static boolean bindCustomTabsServicePreservePriority(android.content.Context r2, java.lang.String r3, androidx.browser.customtabs.CustomTabsServiceConnection r4) {
            android.content.Context r0 = r2.getApplicationContext()
            r4.setApplicationContext(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.support.customtabs.action.CustomTabsService"
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L17
            r0.setPackage(r3)
        L17:
            r3 = 1
            boolean r2 = r2.bindService(r0, r4, r3)
            return r2
    }

    public static boolean connectAndInitialize(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.Context r2 = r2.getApplicationContext()
            androidx.browser.customtabs.CustomTabsClient$1 r1 = new androidx.browser.customtabs.CustomTabsClient$1
            r1.<init>(r2)
            boolean r2 = bindCustomTabsService(r2, r3, r1)     // Catch: java.lang.SecurityException -> L12
            return r2
        L12:
            return r0
    }

    private android.support.customtabs.ICustomTabsCallback.Stub createCallbackWrapper(androidx.browser.customtabs.CustomTabsCallback r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsClient$2 r0 = new androidx.browser.customtabs.CustomTabsClient$2
            r0.<init>(r1, r2)
            return r0
    }

    private static android.app.PendingIntent createSessionId(android.content.Context r2, int r3) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String getPackageName(android.content.Context r1, java.util.List<java.lang.String> r2) {
            r0 = 0
            java.lang.String r1 = getPackageName(r1, r2, r0)
            return r1
    }

    public static java.lang.String getPackageName(android.content.Context r4, java.util.List<java.lang.String> r5, boolean r6) {
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            if (r5 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto Ld
        Lc:
            r0 = r5
        Ld:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 0
            if (r6 != 0) goto L3b
            android.content.pm.ResolveInfo r6 = r4.resolveActivity(r1, r2)
            if (r6 == 0) goto L3b
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            java.lang.String r6 = r6.packageName
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0.size()
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r6)
            if (r5 == 0) goto L3a
            r1.addAll(r5)
        L3a:
            r0 = r1
        L3b:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.support.customtabs.action.CustomTabsService"
            r5.<init>(r6)
            java.util.Iterator r6 = r0.iterator()
        L46:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            r5.setPackage(r0)
            android.content.pm.ResolveInfo r1 = r4.resolveService(r5, r2)
            if (r1 == 0) goto L46
            return r0
        L5c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L69
            java.lang.String r4 = "CustomTabsClient"
            java.lang.String r5 = "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName."
            android.util.Log.w(r4, r5)
        L69:
            r4 = 0
            return r4
    }

    public static androidx.browser.customtabs.CustomTabsSession.PendingSession newPendingSession(android.content.Context r0, androidx.browser.customtabs.CustomTabsCallback r1, int r2) {
            android.app.PendingIntent r0 = createSessionId(r0, r2)
            androidx.browser.customtabs.CustomTabsSession$PendingSession r2 = new androidx.browser.customtabs.CustomTabsSession$PendingSession
            r2.<init>(r1, r0)
            return r2
    }

    private androidx.browser.customtabs.CustomTabsSession newSessionInternal(androidx.browser.customtabs.CustomTabsCallback r4, android.app.PendingIntent r5) {
            r3 = this;
            android.support.customtabs.ICustomTabsCallback$Stub r4 = r3.createCallbackWrapper(r4)
            r0 = 0
            if (r5 == 0) goto L18
            android.os.Bundle r1 = new android.os.Bundle     // Catch: android.os.RemoteException -> L2a
            r1.<init>()     // Catch: android.os.RemoteException -> L2a
            java.lang.String r2 = "android.support.customtabs.extra.SESSION_ID"
            r1.putParcelable(r2, r5)     // Catch: android.os.RemoteException -> L2a
            android.support.customtabs.ICustomTabsService r2 = r3.mService     // Catch: android.os.RemoteException -> L2a
            boolean r1 = r2.newSessionWithExtras(r4, r1)     // Catch: android.os.RemoteException -> L2a
            goto L1e
        L18:
            android.support.customtabs.ICustomTabsService r1 = r3.mService     // Catch: android.os.RemoteException -> L2a
            boolean r1 = r1.newSession(r4)     // Catch: android.os.RemoteException -> L2a
        L1e:
            if (r1 != 0) goto L21
            return r0
        L21:
            androidx.browser.customtabs.CustomTabsSession r0 = new androidx.browser.customtabs.CustomTabsSession
            android.support.customtabs.ICustomTabsService r1 = r3.mService
            android.content.ComponentName r2 = r3.mServiceComponentName
            r0.<init>(r1, r4, r2, r5)
        L2a:
            return r0
    }

    public androidx.browser.customtabs.CustomTabsSession attachSession(androidx.browser.customtabs.CustomTabsSession.PendingSession r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsCallback r0 = r2.getCallback()
            android.app.PendingIntent r2 = r2.getId()
            androidx.browser.customtabs.CustomTabsSession r2 = r1.newSessionInternal(r0, r2)
            return r2
    }

    public android.os.Bundle extraCommand(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            android.support.customtabs.ICustomTabsService r0 = r1.mService     // Catch: android.os.RemoteException -> L7
            android.os.Bundle r2 = r0.extraCommand(r2, r3)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public androidx.browser.customtabs.CustomTabsSession newSession(androidx.browser.customtabs.CustomTabsCallback r2) {
            r1 = this;
            r0 = 0
            androidx.browser.customtabs.CustomTabsSession r2 = r1.newSessionInternal(r2, r0)
            return r2
    }

    public androidx.browser.customtabs.CustomTabsSession newSession(androidx.browser.customtabs.CustomTabsCallback r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.mApplicationContext
            android.app.PendingIntent r3 = createSessionId(r0, r3)
            androidx.browser.customtabs.CustomTabsSession r2 = r1.newSessionInternal(r2, r3)
            return r2
    }

    public boolean warmup(long r2) {
            r1 = this;
            android.support.customtabs.ICustomTabsService r0 = r1.mService     // Catch: android.os.RemoteException -> L7
            boolean r2 = r0.warmup(r2)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }
}
