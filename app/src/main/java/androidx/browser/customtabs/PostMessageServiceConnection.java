package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class PostMessageServiceConnection implements androidx.browser.customtabs.PostMessageBackend, android.content.ServiceConnection {
    private static final java.lang.String TAG = "PostMessageServConn";
    private final java.lang.Object mLock;
    private boolean mMessageChannelCreated;
    private java.lang.String mPackageName;
    private android.support.customtabs.IPostMessageService mService;
    private final android.support.customtabs.ICustomTabsCallback mSessionBinder;

    public PostMessageServiceConnection(androidx.browser.customtabs.CustomTabsSessionToken r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            android.os.IBinder r2 = r2.getCallbackBinder()
            if (r2 == 0) goto L17
            android.support.customtabs.ICustomTabsCallback r2 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r2)
            r1.mSessionBinder = r2
            return
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Provided session must have binder."
            r2.<init>(r0)
            throw r2
    }

    private boolean isBoundToService() {
            r1 = this;
            android.support.customtabs.IPostMessageService r0 = r1.mService
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private boolean notifyMessageChannelReadyInternal(android.os.Bundle r5) {
            r4 = this;
            android.support.customtabs.IPostMessageService r0 = r4.mService
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            android.support.customtabs.IPostMessageService r2 = r4.mService     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L15
            android.support.customtabs.ICustomTabsCallback r3 = r4.mSessionBinder     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L15
            r2.onMessageChannelReady(r3, r5)     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r5 = 1
            return r5
        L13:
            r5 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    public boolean bindSessionToPostMessageService(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = r1.mPackageName
            if (r0 == 0) goto L9
            boolean r2 = r1.bindSessionToPostMessageService(r2, r0)
            return r2
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "setPackageName must be called before bindSessionToPostMessageService."
            r2.<init>(r0)
            throw r2
    }

    public boolean bindSessionToPostMessageService(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.Class<androidx.browser.customtabs.PostMessageService> r1 = androidx.browser.customtabs.PostMessageService.class
            java.lang.String r1 = r1.getName()
            r0.setClassName(r4, r1)
            r4 = 1
            boolean r3 = r3.bindService(r0, r2, r4)
            if (r3 != 0) goto L1c
            java.lang.String r4 = "PostMessageServConn"
            java.lang.String r0 = "Could not bind to PostMessageService in client."
            android.util.Log.w(r4, r0)
        L1c:
            return r3
    }

    public void cleanup(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.isBoundToService()
            if (r0 == 0) goto L9
            r1.unbindFromContext(r2)
        L9:
            return
    }

    public final boolean notifyMessageChannelReady(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.mMessageChannelCreated = r0
            boolean r2 = r1.notifyMessageChannelReadyInternal(r2)
            return r2
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public void onDisconnectChannel(android.content.Context r1) {
            r0 = this;
            r0.unbindFromContext(r1)
            return
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public final boolean onNotifyMessageChannelReady(android.os.Bundle r1) {
            r0 = this;
            boolean r1 = r0.notifyMessageChannelReady(r1)
            return r1
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public final boolean onPostMessage(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            boolean r1 = r0.postMessage(r1, r2)
            return r1
    }

    public void onPostMessageServiceConnected() {
            r1 = this;
            boolean r0 = r1.mMessageChannelCreated
            if (r0 == 0) goto L8
            r0 = 0
            r1.notifyMessageChannelReadyInternal(r0)
        L8:
            return
    }

    public void onPostMessageServiceDisconnected() {
            r0 = this;
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            r0 = this;
            android.support.customtabs.IPostMessageService r1 = android.support.customtabs.IPostMessageService.Stub.asInterface(r2)
            r0.mService = r1
            r0.onPostMessageServiceConnected()
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            r1 = 0
            r0.mService = r1
            r0.onPostMessageServiceDisconnected()
            return
    }

    public final boolean postMessage(java.lang.String r5, android.os.Bundle r6) {
            r4 = this;
            android.support.customtabs.IPostMessageService r0 = r4.mService
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            android.support.customtabs.IPostMessageService r2 = r4.mService     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L15
            android.support.customtabs.ICustomTabsCallback r3 = r4.mSessionBinder     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L15
            r2.onPostMessage(r3, r5, r6)     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r5 = 1
            return r5
        L13:
            r5 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    public void setPackageName(java.lang.String r1) {
            r0 = this;
            r0.mPackageName = r1
            return
    }

    public void unbindFromContext(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.isBoundToService()
            if (r0 == 0) goto Lc
            r2.unbindService(r1)
            r2 = 0
            r1.mService = r2
        Lc:
            return
    }
}
