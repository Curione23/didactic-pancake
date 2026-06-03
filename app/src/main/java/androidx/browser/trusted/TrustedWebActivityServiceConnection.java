package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedWebActivityServiceConnection {
    private static final java.lang.String KEY_ACTIVE_NOTIFICATIONS = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
    private static final java.lang.String KEY_CHANNEL_NAME = "android.support.customtabs.trusted.CHANNEL_NAME";
    private static final java.lang.String KEY_NOTIFICATION = "android.support.customtabs.trusted.NOTIFICATION";
    private static final java.lang.String KEY_NOTIFICATION_SUCCESS = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";
    private static final java.lang.String KEY_PLATFORM_ID = "android.support.customtabs.trusted.PLATFORM_ID";
    private static final java.lang.String KEY_PLATFORM_TAG = "android.support.customtabs.trusted.PLATFORM_TAG";
    private final android.content.ComponentName mComponentName;
    private final android.support.customtabs.trusted.ITrustedWebActivityService mService;


    static class ActiveNotificationsArgs {
        public final android.os.Parcelable[] notifications;

        ActiveNotificationsArgs(android.os.Parcelable[] r1) {
                r0 = this;
                r0.<init>()
                r0.notifications = r1
                return
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs fromBundle(android.os.Bundle r2) {
                java.lang.String r0 = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r2, r0)
                androidx.browser.trusted.TrustedWebActivityServiceConnection$ActiveNotificationsArgs r1 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$ActiveNotificationsArgs
                android.os.Parcelable[] r2 = r2.getParcelableArray(r0)
                r1.<init>(r2)
                return r1
        }

        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"
                android.os.Parcelable[] r2 = r3.notifications
                r0.putParcelableArray(r1, r2)
                return r0
        }
    }

    static class CancelNotificationArgs {
        public final int platformId;
        public final java.lang.String platformTag;

        CancelNotificationArgs(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.platformTag = r1
                r0.platformId = r2
                return
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs fromBundle(android.os.Bundle r3) {
                java.lang.String r0 = "android.support.customtabs.trusted.PLATFORM_TAG"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r3, r0)
                java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_ID"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r3, r1)
                androidx.browser.trusted.TrustedWebActivityServiceConnection$CancelNotificationArgs r2 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$CancelNotificationArgs
                java.lang.String r0 = r3.getString(r0)
                int r3 = r3.getInt(r1)
                r2.<init>(r0, r3)
                return r2
        }

        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_TAG"
                java.lang.String r2 = r3.platformTag
                r0.putString(r1, r2)
                java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_ID"
                int r2 = r3.platformId
                r0.putInt(r1, r2)
                return r0
        }
    }

    static class NotificationsEnabledArgs {
        public final java.lang.String channelName;

        NotificationsEnabledArgs(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.channelName = r1
                return
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs fromBundle(android.os.Bundle r2) {
                java.lang.String r0 = "android.support.customtabs.trusted.CHANNEL_NAME"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r2, r0)
                androidx.browser.trusted.TrustedWebActivityServiceConnection$NotificationsEnabledArgs r1 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$NotificationsEnabledArgs
                java.lang.String r2 = r2.getString(r0)
                r1.<init>(r2)
                return r1
        }

        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.trusted.CHANNEL_NAME"
                java.lang.String r2 = r3.channelName
                r0.putString(r1, r2)
                return r0
        }
    }

    static class NotifyNotificationArgs {
        public final java.lang.String channelName;
        public final android.app.Notification notification;
        public final int platformId;
        public final java.lang.String platformTag;

        NotifyNotificationArgs(java.lang.String r1, int r2, android.app.Notification r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.platformTag = r1
                r0.platformId = r2
                r0.notification = r3
                r0.channelName = r4
                return
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs fromBundle(android.os.Bundle r5) {
                java.lang.String r0 = "android.support.customtabs.trusted.PLATFORM_TAG"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r5, r0)
                java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_ID"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r5, r1)
                java.lang.String r2 = "android.support.customtabs.trusted.NOTIFICATION"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r5, r2)
                java.lang.String r3 = "android.support.customtabs.trusted.CHANNEL_NAME"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r5, r3)
                androidx.browser.trusted.TrustedWebActivityServiceConnection$NotifyNotificationArgs r4 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$NotifyNotificationArgs
                java.lang.String r0 = r5.getString(r0)
                int r1 = r5.getInt(r1)
                android.os.Parcelable r2 = r5.getParcelable(r2)
                android.app.Notification r2 = (android.app.Notification) r2
                java.lang.String r5 = r5.getString(r3)
                r4.<init>(r0, r1, r2, r5)
                return r4
        }

        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_TAG"
                java.lang.String r2 = r3.platformTag
                r0.putString(r1, r2)
                java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_ID"
                int r2 = r3.platformId
                r0.putInt(r1, r2)
                java.lang.String r1 = "android.support.customtabs.trusted.NOTIFICATION"
                android.app.Notification r2 = r3.notification
                r0.putParcelable(r1, r2)
                java.lang.String r1 = "android.support.customtabs.trusted.CHANNEL_NAME"
                java.lang.String r2 = r3.channelName
                r0.putString(r1, r2)
                return r0
        }
    }

    static class ResultArgs {
        public final boolean success;

        ResultArgs(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.success = r1
                return
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs fromBundle(android.os.Bundle r2) {
                java.lang.String r0 = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.ensureBundleContains(r2, r0)
                androidx.browser.trusted.TrustedWebActivityServiceConnection$ResultArgs r1 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$ResultArgs
                boolean r2 = r2.getBoolean(r0)
                r1.<init>(r2)
                return r1
        }

        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS"
                boolean r2 = r3.success
                r0.putBoolean(r1, r2)
                return r0
        }
    }

    TrustedWebActivityServiceConnection(android.support.customtabs.trusted.ITrustedWebActivityService r1, android.content.ComponentName r2) {
            r0 = this;
            r0.<init>()
            r0.mService = r1
            r0.mComponentName = r2
            return
    }

    static void ensureBundleContains(android.os.Bundle r2, java.lang.String r3) {
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bundle must contain "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static android.support.customtabs.trusted.ITrustedWebActivityCallback wrapCallback(androidx.browser.trusted.TrustedWebActivityCallback r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            androidx.browser.trusted.TrustedWebActivityServiceConnection$1 r0 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$1
            r0.<init>(r1)
            return r0
    }

    public boolean areNotificationsEnabled(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            androidx.browser.trusted.TrustedWebActivityServiceConnection$NotificationsEnabledArgs r0 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$NotificationsEnabledArgs
            r0.<init>(r2)
            android.os.Bundle r2 = r0.toBundle()
            android.support.customtabs.trusted.ITrustedWebActivityService r0 = r1.mService
            android.os.Bundle r2 = r0.areNotificationsEnabled(r2)
            androidx.browser.trusted.TrustedWebActivityServiceConnection$ResultArgs r2 = androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs.fromBundle(r2)
            boolean r2 = r2.success
            return r2
    }

    public void cancel(java.lang.String r2, int r3) throws android.os.RemoteException {
            r1 = this;
            androidx.browser.trusted.TrustedWebActivityServiceConnection$CancelNotificationArgs r0 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$CancelNotificationArgs
            r0.<init>(r2, r3)
            android.os.Bundle r2 = r0.toBundle()
            android.support.customtabs.trusted.ITrustedWebActivityService r3 = r1.mService
            r3.cancelNotification(r2)
            return
    }

    public android.os.Parcelable[] getActiveNotifications() throws android.os.RemoteException {
            r1 = this;
            android.support.customtabs.trusted.ITrustedWebActivityService r0 = r1.mService
            android.os.Bundle r0 = r0.getActiveNotifications()
            androidx.browser.trusted.TrustedWebActivityServiceConnection$ActiveNotificationsArgs r0 = androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs.fromBundle(r0)
            android.os.Parcelable[] r0 = r0.notifications
            return r0
    }

    public android.content.ComponentName getComponentName() {
            r1 = this;
            android.content.ComponentName r0 = r1.mComponentName
            return r0
    }

    public android.graphics.Bitmap getSmallIconBitmap() throws android.os.RemoteException {
            r2 = this;
            android.support.customtabs.trusted.ITrustedWebActivityService r0 = r2.mService
            android.os.Bundle r0 = r0.getSmallIconBitmap()
            java.lang.String r1 = "android.support.customtabs.trusted.SMALL_ICON_BITMAP"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
    }

    public int getSmallIconId() throws android.os.RemoteException {
            r1 = this;
            android.support.customtabs.trusted.ITrustedWebActivityService r0 = r1.mService
            int r0 = r0.getSmallIconId()
            return r0
    }

    public boolean notify(java.lang.String r2, int r3, android.app.Notification r4, java.lang.String r5) throws android.os.RemoteException {
            r1 = this;
            androidx.browser.trusted.TrustedWebActivityServiceConnection$NotifyNotificationArgs r0 = new androidx.browser.trusted.TrustedWebActivityServiceConnection$NotifyNotificationArgs
            r0.<init>(r2, r3, r4, r5)
            android.os.Bundle r2 = r0.toBundle()
            android.support.customtabs.trusted.ITrustedWebActivityService r3 = r1.mService
            android.os.Bundle r2 = r3.notifyNotificationWithChannel(r2)
            androidx.browser.trusted.TrustedWebActivityServiceConnection$ResultArgs r2 = androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs.fromBundle(r2)
            boolean r2 = r2.success
            return r2
    }

    public android.os.Bundle sendExtraCommand(java.lang.String r2, android.os.Bundle r3, androidx.browser.trusted.TrustedWebActivityCallback r4) throws android.os.RemoteException {
            r1 = this;
            android.support.customtabs.trusted.ITrustedWebActivityCallback r4 = wrapCallback(r4)
            if (r4 != 0) goto L8
            r4 = 0
            goto Lc
        L8:
            android.os.IBinder r4 = r4.asBinder()
        Lc:
            android.support.customtabs.trusted.ITrustedWebActivityService r0 = r1.mService
            android.os.Bundle r2 = r0.extraCommand(r2, r3, r4)
            return r2
    }
}
