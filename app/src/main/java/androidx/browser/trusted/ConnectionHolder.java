package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class ConnectionHolder implements android.content.ServiceConnection {
    private static final int STATE_AWAITING_CONNECTION = 0;
    private static final int STATE_CANCELLED = 3;
    private static final int STATE_CONNECTED = 1;
    private static final int STATE_DISCONNECTED = 2;
    private java.lang.Exception mCancellationException;
    private final java.lang.Runnable mCloseRunnable;
    private java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> mCompleters;
    private androidx.browser.trusted.TrustedWebActivityServiceConnection mService;
    private int mState;
    private final androidx.browser.trusted.ConnectionHolder.WrapperFactory mWrapperFactory;

    static class WrapperFactory {
        WrapperFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        androidx.browser.trusted.TrustedWebActivityServiceConnection create(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                androidx.browser.trusted.TrustedWebActivityServiceConnection r0 = new androidx.browser.trusted.TrustedWebActivityServiceConnection
                android.support.customtabs.trusted.ITrustedWebActivityService r3 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.asInterface(r3)
                r0.<init>(r3, r2)
                return r0
        }
    }

    ConnectionHolder(java.lang.Runnable r2) {
            r1 = this;
            androidx.browser.trusted.ConnectionHolder$WrapperFactory r0 = new androidx.browser.trusted.ConnectionHolder$WrapperFactory
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    ConnectionHolder(java.lang.Runnable r2, androidx.browser.trusted.ConnectionHolder.WrapperFactory r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mState = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCompleters = r0
            r1.mCloseRunnable = r2
            r1.mWrapperFactory = r3
            return
    }

    public void cancel(java.lang.Exception r3) {
            r2 = this;
            java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> r0 = r2.mCompleters
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r1
            r1.setException(r3)
            goto L6
        L16:
            java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> r0 = r2.mCompleters
            r0.clear()
            java.lang.Runnable r0 = r2.mCloseRunnable
            r0.run()
            r0 = 3
            r2.mState = r0
            r2.mCancellationException = r3
            return
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.browser.trusted.TrustedWebActivityServiceConnection> getServiceWrapper() {
            r1 = this;
            androidx.browser.trusted.ConnectionHolder$$ExternalSyntheticLambda0 r0 = new androidx.browser.trusted.ConnectionHolder$$ExternalSyntheticLambda0
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r0
    }

    /* JADX INFO: renamed from: lambda$getServiceWrapper$0$androidx-browser-trusted-ConnectionHolder, reason: not valid java name */
    /* synthetic */ java.lang.Object m12xa48efda8(androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.mState
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 == r1) goto L20
            r3 = 2
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L15
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Connection state is invalid"
            r3.<init>(r0)
            throw r3
        L15:
            java.lang.Exception r3 = r2.mCancellationException
            throw r3
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Service has been disconnected."
            r3.<init>(r0)
            throw r3
        L20:
            androidx.browser.trusted.TrustedWebActivityServiceConnection r0 = r2.mService
            if (r0 == 0) goto L28
            r3.set(r0)
            goto L35
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "ConnectionHolder state is incorrect."
            r3.<init>(r0)
            throw r3
        L30:
            java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> r0 = r2.mCompleters
            r0.add(r3)
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "ConnectionHolder, state = "
            r3.<init>(r0)
            int r0 = r2.mState
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
            r1 = this;
            androidx.browser.trusted.ConnectionHolder$WrapperFactory r0 = r1.mWrapperFactory
            androidx.browser.trusted.TrustedWebActivityServiceConnection r2 = r0.create(r2, r3)
            r1.mService = r2
            java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> r2 = r1.mCompleters
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r3 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r3
            androidx.browser.trusted.TrustedWebActivityServiceConnection r0 = r1.mService
            r3.set(r0)
            goto Le
        L20:
            java.util.List<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<androidx.browser.trusted.TrustedWebActivityServiceConnection>> r2 = r1.mCompleters
            r2.clear()
            r2 = 1
            r1.mState = r2
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            r1 = 0
            r0.mService = r1
            java.lang.Runnable r1 = r0.mCloseRunnable
            r1.run()
            r1 = 2
            r0.mState = r1
            return
    }
}
