package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
final class EngagementSignalsCallbackRemote implements androidx.browser.customtabs.EngagementSignalsCallback {
    private static final java.lang.String TAG = "EngagementSigsCallbkRmt";
    private final android.support.customtabs.IEngagementSignalsCallback mCallbackBinder;

    private EngagementSignalsCallbackRemote(android.support.customtabs.IEngagementSignalsCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallbackBinder = r1
            return
    }

    static androidx.browser.customtabs.EngagementSignalsCallbackRemote fromBinder(android.os.IBinder r1) {
            android.support.customtabs.IEngagementSignalsCallback r1 = android.support.customtabs.IEngagementSignalsCallback.Stub.asInterface(r1)
            androidx.browser.customtabs.EngagementSignalsCallbackRemote r0 = new androidx.browser.customtabs.EngagementSignalsCallbackRemote
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(int r2, android.os.Bundle r3) {
            r1 = this;
            android.support.customtabs.IEngagementSignalsCallback r0 = r1.mCallbackBinder     // Catch: android.os.RemoteException -> L6
            r0.onGreatestScrollPercentageIncreased(r2, r3)     // Catch: android.os.RemoteException -> L6
            goto Ld
        L6:
            java.lang.String r2 = "EngagementSigsCallbkRmt"
            java.lang.String r3 = "RemoteException during IEngagementSignalsCallback transaction"
            android.util.Log.e(r2, r3)
        Ld:
            return
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean r2, android.os.Bundle r3) {
            r1 = this;
            android.support.customtabs.IEngagementSignalsCallback r0 = r1.mCallbackBinder     // Catch: android.os.RemoteException -> L6
            r0.onSessionEnded(r2, r3)     // Catch: android.os.RemoteException -> L6
            goto Ld
        L6:
            java.lang.String r2 = "EngagementSigsCallbkRmt"
            java.lang.String r3 = "RemoteException during IEngagementSignalsCallback transaction"
            android.util.Log.e(r2, r3)
        Ld:
            return
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean r2, android.os.Bundle r3) {
            r1 = this;
            android.support.customtabs.IEngagementSignalsCallback r0 = r1.mCallbackBinder     // Catch: android.os.RemoteException -> L6
            r0.onVerticalScrollEvent(r2, r3)     // Catch: android.os.RemoteException -> L6
            goto Ld
        L6:
            java.lang.String r2 = "EngagementSigsCallbkRmt"
            java.lang.String r3 = "RemoteException during IEngagementSignalsCallback transaction"
            android.util.Log.e(r2, r3)
        Ld:
            return
    }
}
