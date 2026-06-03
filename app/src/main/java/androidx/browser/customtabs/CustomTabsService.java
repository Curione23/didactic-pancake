package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends android.app.Service {
    public static final java.lang.String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final java.lang.String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final java.lang.String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final java.lang.String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final java.lang.String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final java.lang.String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final java.lang.String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    private static final java.lang.String TAG = "CustomTabsService";
    public static final java.lang.String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    private android.support.customtabs.ICustomTabsService.Stub mBinder;
    final androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder.DeathRecipient> mDeathRecipientMap;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    class AnonymousClass1 extends android.support.customtabs.ICustomTabsService.Stub {
        final /* synthetic */ androidx.browser.customtabs.CustomTabsService this$0;

        AnonymousClass1(androidx.browser.customtabs.CustomTabsService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private android.app.PendingIntent getSessionIdFromBundle(android.os.Bundle r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 0
                return r3
            L4:
                java.lang.String r0 = "android.support.customtabs.extra.SESSION_ID"
                android.os.Parcelable r1 = r3.getParcelable(r0)
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
                r3.remove(r0)
                return r1
        }

        private android.net.Uri getTargetOriginFromBundle(android.os.Bundle r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                java.lang.String r2 = "target_origin"
                if (r0 < r1) goto L15
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.Object r4 = androidx.browser.customtabs.Api33Impl.getParcelable(r4, r2, r0)
                android.net.Uri r4 = (android.net.Uri) r4
                return r4
            L15:
                android.os.Parcelable r4 = r4.getParcelable(r2)
                android.net.Uri r4 = (android.net.Uri) r4
                return r4
        }

        private boolean newSessionInternal(android.support.customtabs.ICustomTabsCallback r5, android.app.PendingIntent r6) {
                r4 = this;
                androidx.browser.customtabs.CustomTabsSessionToken r0 = new androidx.browser.customtabs.CustomTabsSessionToken
                r0.<init>(r5, r6)
                r6 = 0
                androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda0 r1 = new androidx.browser.customtabs.CustomTabsService$1$$ExternalSyntheticLambda0     // Catch: android.os.RemoteException -> L2d
                r1.<init>(r4, r0)     // Catch: android.os.RemoteException -> L2d
                androidx.browser.customtabs.CustomTabsService r2 = r4.this$0     // Catch: android.os.RemoteException -> L2d
                androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder$DeathRecipient> r2 = r2.mDeathRecipientMap     // Catch: android.os.RemoteException -> L2d
                monitor-enter(r2)     // Catch: android.os.RemoteException -> L2d
                android.os.IBinder r3 = r5.asBinder()     // Catch: java.lang.Throwable -> L2a
                r3.linkToDeath(r1, r6)     // Catch: java.lang.Throwable -> L2a
                androidx.browser.customtabs.CustomTabsService r3 = r4.this$0     // Catch: java.lang.Throwable -> L2a
                androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder$DeathRecipient> r3 = r3.mDeathRecipientMap     // Catch: java.lang.Throwable -> L2a
                android.os.IBinder r5 = r5.asBinder()     // Catch: java.lang.Throwable -> L2a
                r3.put(r5, r1)     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                androidx.browser.customtabs.CustomTabsService r5 = r4.this$0     // Catch: android.os.RemoteException -> L2d
                boolean r5 = r5.newSession(r0)     // Catch: android.os.RemoteException -> L2d
                return r5
            L2a:
                r5 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                throw r5     // Catch: android.os.RemoteException -> L2d
            L2d:
                return r6
        }

        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r1.this$0
                android.os.Bundle r2 = r0.extraCommand(r2, r3)
                return r2
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback r4, android.os.Bundle r5) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r5)
                r1.<init>(r4, r2)
                boolean r4 = r0.isEngagementSignalsApiAvailable(r1, r5)
                return r4
        }

        /* JADX INFO: renamed from: lambda$newSessionInternal$0$androidx-browser-customtabs-CustomTabsService$1, reason: not valid java name */
        /* synthetic */ void m11x67c68af6(androidx.browser.customtabs.CustomTabsSessionToken r2) {
                r1 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r1.this$0
                r0.cleanUpSession(r2)
                return
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5, android.os.Bundle r6, java.util.List<android.os.Bundle> r7) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r6)
                r1.<init>(r4, r2)
                boolean r4 = r0.mayLaunchUrl(r1, r5, r6, r7)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback r2) {
                r1 = this;
                r0 = 0
                boolean r2 = r1.newSessionInternal(r2, r0)
                return r2
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) {
                r0 = this;
                android.app.PendingIntent r2 = r0.getSessionIdFromBundle(r2)
                boolean r1 = r0.newSessionInternal(r1, r2)
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback r4, java.lang.String r5, android.os.Bundle r6) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r6)
                r1.<init>(r4, r2)
                int r4 = r0.postMessage(r1, r5, r6)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5, int r6, android.os.Bundle r7) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r7)
                r1.<init>(r4, r2)
                boolean r4 = r0.receiveFile(r1, r5, r6, r7)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                r2 = 0
                r1.<init>(r4, r2)
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                boolean r4 = r0.requestPostMessageChannel(r1, r5, r2, r4)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5, android.os.Bundle r6) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r6)
                r1.<init>(r4, r2)
                android.net.Uri r4 = r3.getTargetOriginFromBundle(r6)
                boolean r4 = r0.requestPostMessageChannel(r1, r5, r4, r6)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback r4, android.os.IBinder r5, android.os.Bundle r6) {
                r3 = this;
                androidx.browser.customtabs.EngagementSignalsCallbackRemote r5 = androidx.browser.customtabs.EngagementSignalsCallbackRemote.fromBinder(r5)
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r6)
                r1.<init>(r4, r2)
                boolean r4 = r0.setEngagementSignalsCallback(r1, r5, r6)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback r4, android.os.Bundle r5) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r5)
                r1.<init>(r4, r2)
                boolean r4 = r0.updateVisuals(r1, r5)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback r4, int r5, android.net.Uri r6, android.os.Bundle r7) {
                r3 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r3.this$0
                androidx.browser.customtabs.CustomTabsSessionToken r1 = new androidx.browser.customtabs.CustomTabsSessionToken
                android.app.PendingIntent r2 = r3.getSessionIdFromBundle(r7)
                r1.<init>(r4, r2)
                boolean r4 = r0.validateRelationship(r1, r5, r6, r7)
                return r4
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long r2) {
                r1 = this;
                androidx.browser.customtabs.CustomTabsService r0 = r1.this$0
                boolean r2 = r0.warmup(r2)
                return r2
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public CustomTabsService() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mDeathRecipientMap = r0
            androidx.browser.customtabs.CustomTabsService$1 r0 = new androidx.browser.customtabs.CustomTabsService$1
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    protected boolean cleanUpSession(androidx.browser.customtabs.CustomTabsSessionToken r4) {
            r3 = this;
            r0 = 0
            androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder$DeathRecipient> r1 = r3.mDeathRecipientMap     // Catch: java.util.NoSuchElementException -> L22
            monitor-enter(r1)     // Catch: java.util.NoSuchElementException -> L22
            android.os.IBinder r4 = r4.getCallbackBinder()     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto Lc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            return r0
        Lc:
            androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder$DeathRecipient> r2 = r3.mDeathRecipientMap     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L1f
            android.os.IBinder$DeathRecipient r2 = (android.os.IBinder.DeathRecipient) r2     // Catch: java.lang.Throwable -> L1f
            r4.unlinkToDeath(r2, r0)     // Catch: java.lang.Throwable -> L1f
            androidx.collection.SimpleArrayMap<android.os.IBinder, android.os.IBinder$DeathRecipient> r2 = r3.mDeathRecipientMap     // Catch: java.lang.Throwable -> L1f
            r2.remove(r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            r4 = 1
            return r4
        L1f:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.util.NoSuchElementException -> L22
        L22:
            return r0
    }

    protected abstract android.os.Bundle extraCommand(java.lang.String r1, android.os.Bundle r2);

    protected boolean isEngagementSignalsApiAvailable(androidx.browser.customtabs.CustomTabsSessionToken r1, android.os.Bundle r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected abstract boolean mayLaunchUrl(androidx.browser.customtabs.CustomTabsSessionToken r1, android.net.Uri r2, android.os.Bundle r3, java.util.List<android.os.Bundle> r4);

    protected abstract boolean newSession(androidx.browser.customtabs.CustomTabsSessionToken r1);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            android.support.customtabs.ICustomTabsService$Stub r1 = r0.mBinder
            return r1
    }

    protected abstract int postMessage(androidx.browser.customtabs.CustomTabsSessionToken r1, java.lang.String r2, android.os.Bundle r3);

    protected abstract boolean receiveFile(androidx.browser.customtabs.CustomTabsSessionToken r1, android.net.Uri r2, int r3, android.os.Bundle r4);

    protected abstract boolean requestPostMessageChannel(androidx.browser.customtabs.CustomTabsSessionToken r1, android.net.Uri r2);

    protected boolean requestPostMessageChannel(androidx.browser.customtabs.CustomTabsSessionToken r1, android.net.Uri r2, android.net.Uri r3, android.os.Bundle r4) {
            r0 = this;
            boolean r1 = r0.requestPostMessageChannel(r1, r2)
            return r1
    }

    protected boolean setEngagementSignalsCallback(androidx.browser.customtabs.CustomTabsSessionToken r1, androidx.browser.customtabs.EngagementSignalsCallback r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected abstract boolean updateVisuals(androidx.browser.customtabs.CustomTabsSessionToken r1, android.os.Bundle r2);

    protected abstract boolean validateRelationship(androidx.browser.customtabs.CustomTabsSessionToken r1, int r2, android.net.Uri r3, android.os.Bundle r4);

    protected abstract boolean warmup(long r1);
}
