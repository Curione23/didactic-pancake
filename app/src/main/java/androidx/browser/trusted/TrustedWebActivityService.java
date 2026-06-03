package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedWebActivityService extends android.app.Service {
    public static final java.lang.String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final java.lang.String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final java.lang.String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final java.lang.String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private final android.support.customtabs.trusted.ITrustedWebActivityService.Stub mBinder;
    private android.app.NotificationManager mNotificationManager;
    int mVerifiedUid;


    public TrustedWebActivityService() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mVerifiedUid = r0
            androidx.browser.trusted.TrustedWebActivityService$1 r0 = new androidx.browser.trusted.TrustedWebActivityService$1
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    private static java.lang.String channelNameToId(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r1 = 32
            r2 = 95
            java.lang.String r3 = r3.replace(r1, r2)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "_channel_id"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private void ensureOnCreateCalled() {
            r2 = this;
            android.app.NotificationManager r0 = r2.mNotificationManager
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?"
            r0.<init>(r1)
            throw r0
    }

    public abstract androidx.browser.trusted.TokenStore getTokenStore();

    public boolean onAreNotificationsEnabled(java.lang.String r2) {
            r1 = this;
            r1.ensureOnCreateCalled()
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r1)
            boolean r0 = r0.areNotificationsEnabled()
            if (r0 != 0) goto Lf
            r2 = 0
            return r2
        Lf:
            android.app.NotificationManager r0 = r1.mNotificationManager
            java.lang.String r2 = channelNameToId(r2)
            boolean r2 = androidx.browser.trusted.NotificationApiHelperForO.isChannelEnabled(r0, r2)
            return r2
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            android.support.customtabs.trusted.ITrustedWebActivityService$Stub r1 = r0.mBinder
            return r1
    }

    public void onCancelNotification(java.lang.String r2, int r3) {
            r1 = this;
            r1.ensureOnCreateCalled()
            android.app.NotificationManager r0 = r1.mNotificationManager
            r0.cancel(r2, r3)
            return
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r1.mNotificationManager = r0
            return
    }

    public android.os.Bundle onExtraCommand(java.lang.String r1, android.os.Bundle r2, androidx.browser.trusted.TrustedWebActivityCallbackRemote r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.os.Parcelable[] onGetActiveNotifications() {
            r1 = this;
            r1.ensureOnCreateCalled()
            android.app.NotificationManager r0 = r1.mNotificationManager
            android.os.Parcelable[] r0 = androidx.browser.trusted.NotificationApiHelperForM.getActiveNotifications(r0)
            return r0
    }

    public android.os.Bundle onGetSmallIconBitmap() {
            r3 = this;
            int r0 = r3.onGetSmallIconId()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = -1
            if (r0 != r2) goto Ld
            return r1
        Ld:
            android.content.res.Resources r2 = r3.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r2, r0)
            java.lang.String r2 = "android.support.customtabs.trusted.SMALL_ICON_BITMAP"
            r1.putParcelable(r2, r0)
            return r1
    }

    public int onGetSmallIconId() {
            r4 = this;
            r0 = -1
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            java.lang.Class r3 = r4.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r1 = r1.getServiceInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            if (r2 != 0) goto L19
            return r0
        L19:
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            java.lang.String r2 = "android.support.customtabs.trusted.SMALL_ICON"
            int r0 = r1.getInt(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
        L21:
            return r0
    }

    public boolean onNotifyNotificationWithChannel(java.lang.String r4, int r5, android.app.Notification r6, java.lang.String r7) {
            r3 = this;
            r3.ensureOnCreateCalled()
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r3)
            boolean r0 = r0.areNotificationsEnabled()
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = channelNameToId(r7)
            android.app.NotificationManager r2 = r3.mNotificationManager
            android.app.Notification r6 = androidx.browser.trusted.NotificationApiHelperForO.copyNotificationOntoChannel(r3, r2, r6, r0, r7)
            android.app.NotificationManager r7 = r3.mNotificationManager
            boolean r7 = androidx.browser.trusted.NotificationApiHelperForO.isChannelEnabled(r7, r0)
            if (r7 != 0) goto L22
            return r1
        L22:
            android.app.NotificationManager r7 = r3.mNotificationManager
            r7.notify(r4, r5, r6)
            r4 = 1
            return r4
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent r2) {
            r1 = this;
            r0 = -1
            r1.mVerifiedUid = r0
            boolean r2 = super.onUnbind(r2)
            return r2
    }
}
