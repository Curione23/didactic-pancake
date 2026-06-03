package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public class CustomTabManager {
    private static final long CLIENT_WAIT_TIME = 1;
    private final java.util.concurrent.atomic.AtomicReference<androidx.browser.customtabs.CustomTabsClient> mClient;
    private final java.util.concurrent.CountDownLatch mClientLatch;
    private androidx.browser.customtabs.CustomTabsServiceConnection mConnection;
    private final java.lang.ref.WeakReference<android.content.Context> mContextRef;


    public CustomTabManager(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mContextRef = r0
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.mClient = r2
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r2.<init>(r0)
            r1.mClientLatch = r2
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicReference access$000(net.openid.appauth.browser.CustomTabManager r0) {
            java.util.concurrent.atomic.AtomicReference<androidx.browser.customtabs.CustomTabsClient> r0 = r0.mClient
            return r0
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch access$100(net.openid.appauth.browser.CustomTabManager r0) {
            java.util.concurrent.CountDownLatch r0 = r0.mClientLatch
            return r0
    }

    public synchronized void bind(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            androidx.browser.customtabs.CustomTabsServiceConnection r0 = r2.mConnection     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            net.openid.appauth.browser.CustomTabManager$1 r0 = new net.openid.appauth.browser.CustomTabManager$1     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            r2.mConnection = r0     // Catch: java.lang.Throwable -> L2f
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.mContextRef     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2f
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L20
            androidx.browser.customtabs.CustomTabsServiceConnection r1 = r2.mConnection     // Catch: java.lang.Throwable -> L2f
            boolean r3 = androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(r0, r3, r1)     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L2d
        L20:
            java.lang.String r3 = "Unable to bind custom tabs service"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2f
            net.openid.appauth.internal.Logger.info(r3, r0)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.CountDownLatch r3 = r2.mClientLatch     // Catch: java.lang.Throwable -> L2f
            r3.countDown()     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r2)
            return
        L2f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r3
    }

    public androidx.browser.customtabs.CustomTabsSession createSession(androidx.browser.customtabs.CustomTabsCallback r4, android.net.Uri... r5) {
            r3 = this;
            androidx.browser.customtabs.CustomTabsClient r0 = r3.getClient()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.browser.customtabs.CustomTabsSession r4 = r0.newSession(r4)
            r0 = 0
            if (r4 != 0) goto L17
            java.lang.String r4 = "Failed to create custom tabs session through custom tabs client"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            net.openid.appauth.internal.Logger.warn(r4, r5)
            return r1
        L17:
            if (r5 == 0) goto L26
            int r2 = r5.length
            if (r2 <= 0) goto L26
            r2 = 1
            java.util.List r2 = net.openid.appauth.internal.UriUtil.toCustomTabUriBundle(r5, r2)
            r5 = r5[r0]
            r4.mayLaunchUrl(r5, r1, r2)
        L26:
            return r4
    }

    public androidx.browser.customtabs.CustomTabsIntent.Builder createTabBuilder(android.net.Uri... r3) {
            r2 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = new androidx.browser.customtabs.CustomTabsIntent$Builder
            r1 = 0
            androidx.browser.customtabs.CustomTabsSession r3 = r2.createSession(r1, r3)
            r0.<init>(r3)
            return r0
    }

    public synchronized void dispose() {
            r2 = this;
            monitor-enter(r2)
            androidx.browser.customtabs.CustomTabsServiceConnection r0 = r2.mConnection     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.mContextRef     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L16
            androidx.browser.customtabs.CustomTabsServiceConnection r1 = r2.mConnection     // Catch: java.lang.Throwable -> L26
            r0.unbindService(r1)     // Catch: java.lang.Throwable -> L26
        L16:
            java.util.concurrent.atomic.AtomicReference<androidx.browser.customtabs.CustomTabsClient> r0 = r2.mClient     // Catch: java.lang.Throwable -> L26
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "CustomTabsService is disconnected"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L26
            net.openid.appauth.internal.Logger.debug(r0, r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)
            return
        L26:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    public androidx.browser.customtabs.CustomTabsClient getClient() {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = r4.mClientLatch     // Catch: java.lang.InterruptedException -> La
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> La
            r2 = 1
            r0.await(r2, r1)     // Catch: java.lang.InterruptedException -> La
            goto L17
        La:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Interrupted while waiting for browser connection"
            net.openid.appauth.internal.Logger.info(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r4.mClientLatch
            r0.countDown()
        L17:
            java.util.concurrent.atomic.AtomicReference<androidx.browser.customtabs.CustomTabsClient> r0 = r4.mClient
            java.lang.Object r0 = r0.get()
            androidx.browser.customtabs.CustomTabsClient r0 = (androidx.browser.customtabs.CustomTabsClient) r0
            return r0
    }
}
