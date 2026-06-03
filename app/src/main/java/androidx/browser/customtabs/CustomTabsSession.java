package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsSession {
    private static final java.lang.String TAG = "CustomTabsSession";
    static final java.lang.String TARGET_ORIGIN_KEY = "target_origin";
    private final android.support.customtabs.ICustomTabsCallback mCallback;
    private final android.content.ComponentName mComponentName;
    private final android.app.PendingIntent mId;
    private final java.lang.Object mLock;
    private final android.support.customtabs.ICustomTabsService mService;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends android.support.customtabs.IEngagementSignalsCallback.Stub {
        private final android.os.Handler mHandler;
        final /* synthetic */ androidx.browser.customtabs.CustomTabsSession this$0;
        final /* synthetic */ androidx.browser.customtabs.EngagementSignalsCallback val$callback;

        AnonymousClass1(androidx.browser.customtabs.CustomTabsSession r1, androidx.browser.customtabs.EngagementSignalsCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$callback = r2
                r0.<init>()
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.mHandler = r1
                return
        }

        static /* synthetic */ void lambda$onGreatestScrollPercentageIncreased$1(androidx.browser.customtabs.EngagementSignalsCallback r0, int r1, android.os.Bundle r2) {
                r0.onGreatestScrollPercentageIncreased(r1, r2)
                return
        }

        static /* synthetic */ void lambda$onSessionEnded$2(androidx.browser.customtabs.EngagementSignalsCallback r0, boolean r1, android.os.Bundle r2) {
                r0.onSessionEnded(r1, r2)
                return
        }

        static /* synthetic */ void lambda$onVerticalScrollEvent$0(androidx.browser.customtabs.EngagementSignalsCallback r0, boolean r1, android.os.Bundle r2) {
                r0.onVerticalScrollEvent(r1, r2)
                return
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int r4, android.os.Bundle r5) {
                r3 = this;
                android.os.Handler r0 = r3.mHandler
                androidx.browser.customtabs.EngagementSignalsCallback r1 = r3.val$callback
                androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda1 r2 = new androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda1
                r2.<init>(r1, r4, r5)
                r0.post(r2)
                return
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(boolean r4, android.os.Bundle r5) {
                r3 = this;
                android.os.Handler r0 = r3.mHandler
                androidx.browser.customtabs.EngagementSignalsCallback r1 = r3.val$callback
                androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda0 r2 = new androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda0
                r2.<init>(r1, r4, r5)
                r0.post(r2)
                return
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(boolean r4, android.os.Bundle r5) {
                r3 = this;
                android.os.Handler r0 = r3.mHandler
                androidx.browser.customtabs.EngagementSignalsCallback r1 = r3.val$callback
                androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda2 r2 = new androidx.browser.customtabs.CustomTabsSession$1$$ExternalSyntheticLambda2
                r2.<init>(r1, r4, r5)
                r0.post(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends android.support.customtabs.IEngagementSignalsCallback.Stub {
        private final java.util.concurrent.Executor mExecutor;
        final /* synthetic */ androidx.browser.customtabs.CustomTabsSession this$0;
        final /* synthetic */ androidx.browser.customtabs.EngagementSignalsCallback val$callback;
        final /* synthetic */ java.util.concurrent.Executor val$executor;

        AnonymousClass2(androidx.browser.customtabs.CustomTabsSession r1, java.util.concurrent.Executor r2, androidx.browser.customtabs.EngagementSignalsCallback r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$executor = r2
                r0.val$callback = r3
                r0.<init>()
                r0.mExecutor = r2
                return
        }

        static /* synthetic */ void lambda$onGreatestScrollPercentageIncreased$1(androidx.browser.customtabs.EngagementSignalsCallback r0, int r1, android.os.Bundle r2) {
                r0.onGreatestScrollPercentageIncreased(r1, r2)
                return
        }

        static /* synthetic */ void lambda$onSessionEnded$2(androidx.browser.customtabs.EngagementSignalsCallback r0, boolean r1, android.os.Bundle r2) {
                r0.onSessionEnded(r1, r2)
                return
        }

        static /* synthetic */ void lambda$onVerticalScrollEvent$0(androidx.browser.customtabs.EngagementSignalsCallback r0, boolean r1, android.os.Bundle r2) {
                r0.onVerticalScrollEvent(r1, r2)
                return
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int r6, android.os.Bundle r7) {
                r5 = this;
                long r0 = android.os.Binder.clearCallingIdentity()
                java.util.concurrent.Executor r2 = r5.mExecutor     // Catch: java.lang.Throwable -> L14
                androidx.browser.customtabs.EngagementSignalsCallback r3 = r5.val$callback     // Catch: java.lang.Throwable -> L14
                androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda1 r4 = new androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L14
                r4.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L14
                r2.execute(r4)     // Catch: java.lang.Throwable -> L14
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L14:
                r6 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r6
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(boolean r6, android.os.Bundle r7) {
                r5 = this;
                long r0 = android.os.Binder.clearCallingIdentity()
                java.util.concurrent.Executor r2 = r5.mExecutor     // Catch: java.lang.Throwable -> L14
                androidx.browser.customtabs.EngagementSignalsCallback r3 = r5.val$callback     // Catch: java.lang.Throwable -> L14
                androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda2 r4 = new androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L14
                r4.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L14
                r2.execute(r4)     // Catch: java.lang.Throwable -> L14
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L14:
                r6 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r6
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(boolean r6, android.os.Bundle r7) {
                r5 = this;
                long r0 = android.os.Binder.clearCallingIdentity()
                java.util.concurrent.Executor r2 = r5.mExecutor     // Catch: java.lang.Throwable -> L14
                androidx.browser.customtabs.EngagementSignalsCallback r3 = r5.val$callback     // Catch: java.lang.Throwable -> L14
                androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda0 r4 = new androidx.browser.customtabs.CustomTabsSession$2$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L14
                r4.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L14
                r2.execute(r4)     // Catch: java.lang.Throwable -> L14
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L14:
                r6 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r6
        }
    }

    static class MockSession extends android.support.customtabs.ICustomTabsService.Stub {
        MockSession() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, android.os.Bundle r3, java.util.List<android.os.Bundle> r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, int r3, android.os.Bundle r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback r1, android.os.IBinder r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback r1, int r2, android.net.Uri r3, android.os.Bundle r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static class PendingSession {
        private final androidx.browser.customtabs.CustomTabsCallback mCallback;
        private final android.app.PendingIntent mId;

        PendingSession(androidx.browser.customtabs.CustomTabsCallback r1, android.app.PendingIntent r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mId = r2
                return
        }

        androidx.browser.customtabs.CustomTabsCallback getCallback() {
                r1 = this;
                androidx.browser.customtabs.CustomTabsCallback r0 = r1.mCallback
                return r0
        }

        android.app.PendingIntent getId() {
                r1 = this;
                android.app.PendingIntent r0 = r1.mId
                return r0
        }
    }

    CustomTabsSession(android.support.customtabs.ICustomTabsService r2, android.support.customtabs.ICustomTabsCallback r3, android.content.ComponentName r4, android.app.PendingIntent r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r1.mService = r2
            r1.mCallback = r3
            r1.mComponentName = r4
            r1.mId = r5
            return
    }

    private void addIdToBundle(android.os.Bundle r3) {
            r2 = this;
            android.app.PendingIntent r0 = r2.mId
            if (r0 == 0) goto L9
            java.lang.String r1 = "android.support.customtabs.extra.SESSION_ID"
            r3.putParcelable(r1, r0)
        L9:
            return
    }

    private android.os.Bundle createBundleWithId(android.os.Bundle r2) {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r2 == 0) goto La
            r0.putAll(r2)
        La:
            r1.addIdToBundle(r0)
            return r0
    }

    private android.support.customtabs.IEngagementSignalsCallback.Stub createEngagementSignalsCallbackWrapper(androidx.browser.customtabs.EngagementSignalsCallback r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsSession$1 r0 = new androidx.browser.customtabs.CustomTabsSession$1
            r0.<init>(r1, r2)
            return r0
    }

    private android.support.customtabs.IEngagementSignalsCallback.Stub createEngagementSignalsCallbackWrapper(androidx.browser.customtabs.EngagementSignalsCallback r2, java.util.concurrent.Executor r3) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsSession$2 r0 = new androidx.browser.customtabs.CustomTabsSession$2
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static androidx.browser.customtabs.CustomTabsSession createMockSessionForTesting(android.content.ComponentName r4) {
            androidx.browser.customtabs.CustomTabsSession r0 = new androidx.browser.customtabs.CustomTabsSession
            androidx.browser.customtabs.CustomTabsSession$MockSession r1 = new androidx.browser.customtabs.CustomTabsSession$MockSession
            r1.<init>()
            androidx.browser.customtabs.CustomTabsSessionToken$MockCallback r2 = new androidx.browser.customtabs.CustomTabsSessionToken$MockCallback
            r2.<init>()
            r3 = 0
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    private android.os.Bundle createPostMessageExtraBundle(android.net.Uri r3) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r3 == 0) goto Lc
            java.lang.String r1 = "target_origin"
            r0.putParcelable(r1, r3)
        Lc:
            android.app.PendingIntent r3 = r2.mId
            if (r3 == 0) goto L13
            r2.addIdToBundle(r0)
        L13:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L1a
            r0 = 0
        L1a:
            return r0
    }

    android.os.IBinder getBinder() {
            r1 = this;
            android.support.customtabs.ICustomTabsCallback r0 = r1.mCallback
            android.os.IBinder r0 = r0.asBinder()
            return r0
    }

    android.content.ComponentName getComponentName() {
            r1 = this;
            android.content.ComponentName r0 = r1.mComponentName
            return r0
    }

    android.app.PendingIntent getId() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mId
            return r0
    }

    public boolean isEngagementSignalsApiAvailable(android.os.Bundle r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Bundle r3 = r2.createBundleWithId(r3)
            android.support.customtabs.ICustomTabsService r0 = r2.mService     // Catch: java.lang.SecurityException -> Ld
            android.support.customtabs.ICustomTabsCallback r1 = r2.mCallback     // Catch: java.lang.SecurityException -> Ld
            boolean r3 = r0.isEngagementSignalsApiAvailable(r1, r3)     // Catch: java.lang.SecurityException -> Ld
            return r3
        Ld:
            r3 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method isn't supported by the Custom Tabs implementation."
            r0.<init>(r1, r3)
            throw r0
    }

    public boolean mayLaunchUrl(android.net.Uri r3, android.os.Bundle r4, java.util.List<android.os.Bundle> r5) {
            r2 = this;
            android.os.Bundle r4 = r2.createBundleWithId(r4)
            android.support.customtabs.ICustomTabsService r0 = r2.mService     // Catch: android.os.RemoteException -> Ld
            android.support.customtabs.ICustomTabsCallback r1 = r2.mCallback     // Catch: android.os.RemoteException -> Ld
            boolean r3 = r0.mayLaunchUrl(r1, r3, r4, r5)     // Catch: android.os.RemoteException -> Ld
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public int postMessage(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            android.os.Bundle r5 = r3.createBundleWithId(r5)
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.support.customtabs.ICustomTabsService r1 = r3.mService     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13
            android.support.customtabs.ICustomTabsCallback r2 = r3.mCallback     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13
            int r4 = r1.postMessage(r2, r4, r5)     // Catch: java.lang.Throwable -> L11 android.os.RemoteException -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r4
        L11:
            r4 = move-exception
            goto L16
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r4 = -2
            return r4
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public boolean receiveFile(android.net.Uri r3, int r4, android.os.Bundle r5) {
            r2 = this;
            android.os.Bundle r5 = r2.createBundleWithId(r5)
            android.support.customtabs.ICustomTabsService r0 = r2.mService     // Catch: android.os.RemoteException -> Ld
            android.support.customtabs.ICustomTabsCallback r1 = r2.mCallback     // Catch: android.os.RemoteException -> Ld
            boolean r3 = r0.receiveFile(r1, r3, r4, r5)     // Catch: android.os.RemoteException -> Ld
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public boolean requestPostMessageChannel(android.net.Uri r3) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 0
            boolean r3 = r2.requestPostMessageChannel(r3, r1, r0)
            return r3
    }

    public boolean requestPostMessageChannel(android.net.Uri r2, android.net.Uri r3, android.os.Bundle r4) {
            r1 = this;
            android.os.Bundle r3 = r1.createPostMessageExtraBundle(r3)     // Catch: android.os.RemoteException -> L1b
            if (r3 == 0) goto L12
            r4.putAll(r3)     // Catch: android.os.RemoteException -> L1b
            android.support.customtabs.ICustomTabsService r3 = r1.mService     // Catch: android.os.RemoteException -> L1b
            android.support.customtabs.ICustomTabsCallback r0 = r1.mCallback     // Catch: android.os.RemoteException -> L1b
            boolean r2 = r3.requestPostMessageChannelWithExtras(r0, r2, r4)     // Catch: android.os.RemoteException -> L1b
            return r2
        L12:
            android.support.customtabs.ICustomTabsService r3 = r1.mService     // Catch: android.os.RemoteException -> L1b
            android.support.customtabs.ICustomTabsCallback r4 = r1.mCallback     // Catch: android.os.RemoteException -> L1b
            boolean r2 = r3.requestPostMessageChannel(r4, r2)     // Catch: android.os.RemoteException -> L1b
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public boolean setActionButton(android.graphics.Bitmap r3, java.lang.String r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "android.support.customtabs.customaction.ICON"
            r0.putParcelable(r1, r3)
            java.lang.String r3 = "android.support.customtabs.customaction.DESCRIPTION"
            r0.putString(r3, r4)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE"
            r3.putBundle(r4, r0)
            r2.addIdToBundle(r0)
            android.support.customtabs.ICustomTabsService r4 = r2.mService     // Catch: android.os.RemoteException -> L25
            android.support.customtabs.ICustomTabsCallback r0 = r2.mCallback     // Catch: android.os.RemoteException -> L25
            boolean r3 = r4.updateVisuals(r0, r3)     // Catch: android.os.RemoteException -> L25
            return r3
        L25:
            r3 = 0
            return r3
    }

    public boolean setEngagementSignalsCallback(androidx.browser.customtabs.EngagementSignalsCallback r3, android.os.Bundle r4) throws android.os.RemoteException {
            r2 = this;
            android.os.Bundle r4 = r2.createBundleWithId(r4)
            android.support.customtabs.IEngagementSignalsCallback$Stub r3 = r2.createEngagementSignalsCallbackWrapper(r3)
            android.support.customtabs.ICustomTabsService r0 = r2.mService     // Catch: java.lang.SecurityException -> L15
            android.support.customtabs.ICustomTabsCallback r1 = r2.mCallback     // Catch: java.lang.SecurityException -> L15
            android.os.IBinder r3 = r3.asBinder()     // Catch: java.lang.SecurityException -> L15
            boolean r3 = r0.setEngagementSignalsCallback(r1, r3, r4)     // Catch: java.lang.SecurityException -> L15
            return r3
        L15:
            r3 = move-exception
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This method isn't supported by the Custom Tabs implementation."
            r4.<init>(r0, r3)
            throw r4
    }

    public boolean setEngagementSignalsCallback(java.util.concurrent.Executor r2, androidx.browser.customtabs.EngagementSignalsCallback r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Bundle r4 = r1.createBundleWithId(r4)
            android.support.customtabs.IEngagementSignalsCallback$Stub r2 = r1.createEngagementSignalsCallbackWrapper(r3, r2)
            android.support.customtabs.ICustomTabsService r3 = r1.mService     // Catch: java.lang.SecurityException -> L15
            android.support.customtabs.ICustomTabsCallback r0 = r1.mCallback     // Catch: java.lang.SecurityException -> L15
            android.os.IBinder r2 = r2.asBinder()     // Catch: java.lang.SecurityException -> L15
            boolean r2 = r3.setEngagementSignalsCallback(r0, r2, r4)     // Catch: java.lang.SecurityException -> L15
            return r2
        L15:
            r2 = move-exception
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "This method isn't supported by the Custom Tabs implementation."
            r3.<init>(r4, r2)
            throw r3
    }

    public boolean setSecondaryToolbarSwipeUpGesture(android.app.PendingIntent r3) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE"
            r0.putParcelable(r1, r3)
            r2.addIdToBundle(r0)
            android.support.customtabs.ICustomTabsService r3 = r2.mService     // Catch: android.os.RemoteException -> L16
            android.support.customtabs.ICustomTabsCallback r1 = r2.mCallback     // Catch: android.os.RemoteException -> L16
            boolean r3 = r3.updateVisuals(r1, r0)     // Catch: android.os.RemoteException -> L16
            return r3
        L16:
            r3 = 0
            return r3
    }

    public boolean setSecondaryToolbarViews(android.widget.RemoteViews r3, int[] r4, android.app.PendingIntent r5) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS"
            r0.putParcelable(r1, r3)
            java.lang.String r3 = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS"
            r0.putIntArray(r3, r4)
            java.lang.String r3 = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT"
            r0.putParcelable(r3, r5)
            r2.addIdToBundle(r0)
            android.support.customtabs.ICustomTabsService r3 = r2.mService     // Catch: android.os.RemoteException -> L20
            android.support.customtabs.ICustomTabsCallback r4 = r2.mCallback     // Catch: android.os.RemoteException -> L20
            boolean r3 = r3.updateVisuals(r4, r0)     // Catch: android.os.RemoteException -> L20
            return r3
        L20:
            r3 = 0
            return r3
    }

    @java.lang.Deprecated
    public boolean setToolbarItem(int r3, android.graphics.Bitmap r4, java.lang.String r5) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "android.support.customtabs.customaction.ID"
            r0.putInt(r1, r3)
            java.lang.String r3 = "android.support.customtabs.customaction.ICON"
            r0.putParcelable(r3, r4)
            java.lang.String r3 = "android.support.customtabs.customaction.DESCRIPTION"
            r0.putString(r3, r5)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE"
            r3.putBundle(r4, r0)
            r2.addIdToBundle(r3)
            android.support.customtabs.ICustomTabsService r4 = r2.mService     // Catch: android.os.RemoteException -> L2a
            android.support.customtabs.ICustomTabsCallback r5 = r2.mCallback     // Catch: android.os.RemoteException -> L2a
            boolean r3 = r4.updateVisuals(r5, r3)     // Catch: android.os.RemoteException -> L2a
            return r3
        L2a:
            r3 = 0
            return r3
    }

    public boolean validateRelationship(int r4, android.net.Uri r5, android.os.Bundle r6) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 < r0) goto L15
            r0 = 2
            if (r4 <= r0) goto L8
            goto L15
        L8:
            android.os.Bundle r6 = r3.createBundleWithId(r6)
            android.support.customtabs.ICustomTabsService r0 = r3.mService     // Catch: android.os.RemoteException -> L15
            android.support.customtabs.ICustomTabsCallback r2 = r3.mCallback     // Catch: android.os.RemoteException -> L15
            boolean r4 = r0.validateRelationship(r2, r4, r5, r6)     // Catch: android.os.RemoteException -> L15
            return r4
        L15:
            return r1
    }
}
