package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements android.content.ServiceConnection {
    private android.content.Context mApplicationContext;


    public CustomTabsServiceConnection() {
            r0 = this;
            r0.<init>()
            return
    }

    android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.mApplicationContext
            return r0
    }

    public abstract void onCustomTabsServiceConnected(android.content.ComponentName r1, androidx.browser.customtabs.CustomTabsClient r2);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            r2 = this;
            android.content.Context r0 = r2.mApplicationContext
            if (r0 == 0) goto L13
            androidx.browser.customtabs.CustomTabsServiceConnection$1 r0 = new androidx.browser.customtabs.CustomTabsServiceConnection$1
            android.support.customtabs.ICustomTabsService r4 = android.support.customtabs.ICustomTabsService.Stub.asInterface(r4)
            android.content.Context r1 = r2.mApplicationContext
            r0.<init>(r2, r4, r3, r1)
            r2.onCustomTabsServiceConnected(r3, r0)
            return
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Custom Tabs Service connected before an applicationcontext has been provided."
            r3.<init>(r4)
            throw r3
    }

    void setApplicationContext(android.content.Context r1) {
            r0 = this;
            r0.mApplicationContext = r1
            return
    }
}
