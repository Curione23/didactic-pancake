package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final android.support.customtabs.trusted.ITrustedWebActivityCallback mCallbackBinder;

    private TrustedWebActivityCallbackRemote(android.support.customtabs.trusted.ITrustedWebActivityCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallbackBinder = r1
            return
    }

    static androidx.browser.trusted.TrustedWebActivityCallbackRemote fromBinder(android.os.IBinder r1) {
            r0 = 0
            if (r1 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            android.support.customtabs.trusted.ITrustedWebActivityCallback r1 = android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub.asInterface(r1)
        L9:
            if (r1 != 0) goto Lc
            return r0
        Lc:
            androidx.browser.trusted.TrustedWebActivityCallbackRemote r0 = new androidx.browser.trusted.TrustedWebActivityCallbackRemote
            r0.<init>(r1)
            return r0
    }

    public void runExtraCallback(java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
            r1 = this;
            android.support.customtabs.trusted.ITrustedWebActivityCallback r0 = r1.mCallbackBinder
            r0.onExtraCallback(r2, r3)
            return
    }
}
