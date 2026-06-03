package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsSessionToken {
    private static final java.lang.String TAG = "CustomTabsSessionToken";
    private final androidx.browser.customtabs.CustomTabsCallback mCallback;
    final android.support.customtabs.ICustomTabsCallback mCallbackBinder;
    private final android.app.PendingIntent mSessionId;


    static class MockCallback extends android.support.customtabs.ICustomTabsCallback.Stub {
        MockCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public android.os.Bundle extraCallbackWithResult(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int r1, int r2, int r3, int r4, int r5, android.os.Bundle r6) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(android.os.Bundle r1) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(android.os.Bundle r1) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int r1, android.net.Uri r2, boolean r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(android.os.Bundle r1) {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(android.os.Bundle r1) {
                r0 = this;
                return
        }
    }

    CustomTabsSessionToken(android.support.customtabs.ICustomTabsCallback r1, android.app.PendingIntent r2) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L10
            if (r2 == 0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "CustomTabsSessionToken must have either a session id or a callback (or both)."
            r1.<init>(r2)
            throw r1
        L10:
            r0.mCallbackBinder = r1
            r0.mSessionId = r2
            if (r1 != 0) goto L18
            r1 = 0
            goto L1d
        L18:
            androidx.browser.customtabs.CustomTabsSessionToken$1 r1 = new androidx.browser.customtabs.CustomTabsSessionToken$1
            r1.<init>(r0)
        L1d:
            r0.mCallback = r1
            return
    }

    public static androidx.browser.customtabs.CustomTabsSessionToken createMockSessionTokenForTesting() {
            androidx.browser.customtabs.CustomTabsSessionToken r0 = new androidx.browser.customtabs.CustomTabsSessionToken
            androidx.browser.customtabs.CustomTabsSessionToken$MockCallback r1 = new androidx.browser.customtabs.CustomTabsSessionToken$MockCallback
            r1.<init>()
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    private android.os.IBinder getCallbackBinderAssertNotNull() {
            r2 = this;
            android.support.customtabs.ICustomTabsCallback r0 = r2.mCallbackBinder
            if (r0 == 0) goto L9
            android.os.IBinder r0 = r0.asBinder()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CustomTabSessionToken must have valid binder or pending session"
            r0.<init>(r1)
            throw r0
    }

    public static androidx.browser.customtabs.CustomTabsSessionToken getSessionTokenFromIntent(android.content.Intent r3) {
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "android.support.customtabs.extra.SESSION"
            android.os.IBinder r0 = r0.getBinder(r2)
            java.lang.String r2 = "android.support.customtabs.extra.SESSION_ID"
            android.os.Parcelable r3 = r3.getParcelableExtra(r2)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            if (r0 != 0) goto L1b
            if (r3 != 0) goto L1b
            return r1
        L1b:
            if (r0 != 0) goto L1e
            goto L22
        L1e:
            android.support.customtabs.ICustomTabsCallback r1 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r0)
        L22:
            androidx.browser.customtabs.CustomTabsSessionToken r0 = new androidx.browser.customtabs.CustomTabsSessionToken
            r0.<init>(r1, r3)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof androidx.browser.customtabs.CustomTabsSessionToken
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.browser.customtabs.CustomTabsSessionToken r6 = (androidx.browser.customtabs.CustomTabsSessionToken) r6
            android.app.PendingIntent r0 = r6.getId()
            android.app.PendingIntent r2 = r5.mSessionId
            r3 = 1
            if (r2 != 0) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r1
        L14:
            if (r0 != 0) goto L17
            goto L18
        L17:
            r3 = r1
        L18:
            if (r4 == r3) goto L1b
            return r1
        L1b:
            if (r2 == 0) goto L22
            boolean r6 = r2.equals(r0)
            return r6
        L22:
            android.os.IBinder r0 = r5.getCallbackBinderAssertNotNull()
            android.os.IBinder r6 = r6.getCallbackBinderAssertNotNull()
            boolean r6 = r0.equals(r6)
            return r6
    }

    public androidx.browser.customtabs.CustomTabsCallback getCallback() {
            r1 = this;
            androidx.browser.customtabs.CustomTabsCallback r0 = r1.mCallback
            return r0
    }

    android.os.IBinder getCallbackBinder() {
            r1 = this;
            android.support.customtabs.ICustomTabsCallback r0 = r1.mCallbackBinder
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.IBinder r0 = r0.asBinder()
            return r0
    }

    android.app.PendingIntent getId() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mSessionId
            return r0
    }

    public boolean hasCallback() {
            r1 = this;
            android.support.customtabs.ICustomTabsCallback r0 = r1.mCallbackBinder
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasId() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mSessionId
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mSessionId
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            android.os.IBinder r0 = r1.getCallbackBinderAssertNotNull()
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isAssociatedWith(androidx.browser.customtabs.CustomTabsSession r2) {
            r1 = this;
            android.os.IBinder r2 = r2.getBinder()
            android.support.customtabs.ICustomTabsCallback r0 = r1.mCallbackBinder
            boolean r2 = r2.equals(r0)
            return r2
    }
}
