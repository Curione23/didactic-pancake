package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedWebActivityServiceConnectionPool {
    private static final java.lang.String TAG = "TWAConnectionPool";
    private final java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> mConnections;
    private final android.content.Context mContext;

    static class BindToServiceAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Exception> {
        private final android.content.Context mAppContext;
        private final androidx.browser.trusted.ConnectionHolder mConnection;
        private final android.content.Intent mIntent;

        BindToServiceAsyncTask(android.content.Context r1, android.content.Intent r2, androidx.browser.trusted.ConnectionHolder r3) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.mAppContext = r1
                r0.mIntent = r2
                r0.mConnection = r3
                return
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected java.lang.Exception doInBackground2(java.lang.Void... r4) {
                r3 = this;
                android.content.Context r4 = r3.mAppContext     // Catch: java.lang.SecurityException -> L1f
                android.content.Intent r0 = r3.mIntent     // Catch: java.lang.SecurityException -> L1f
                androidx.browser.trusted.ConnectionHolder r1 = r3.mConnection     // Catch: java.lang.SecurityException -> L1f
                r2 = 4097(0x1001, float:5.741E-42)
                boolean r4 = r4.bindService(r0, r1, r2)     // Catch: java.lang.SecurityException -> L1f
                if (r4 == 0) goto L10
                r4 = 0
                return r4
            L10:
                android.content.Context r4 = r3.mAppContext     // Catch: java.lang.SecurityException -> L1f
                androidx.browser.trusted.ConnectionHolder r0 = r3.mConnection     // Catch: java.lang.SecurityException -> L1f
                r4.unbindService(r0)     // Catch: java.lang.SecurityException -> L1f
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L1f
                java.lang.String r0 = "Could not bind to the service"
                r4.<init>(r0)     // Catch: java.lang.SecurityException -> L1f
                return r4
            L1f:
                r4 = move-exception
                java.lang.String r0 = "TWAConnectionPool"
                java.lang.String r1 = "SecurityException while binding."
                android.util.Log.w(r0, r1, r4)
                return r4
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ java.lang.Exception doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                java.lang.Exception r1 = r0.doInBackground2(r1)
                return r1
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(java.lang.Exception r2) {
                r1 = this;
                if (r2 == 0) goto L7
                androidx.browser.trusted.ConnectionHolder r0 = r1.mConnection
                r0.cancel(r2)
            L7:
                return
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.Exception r1) {
                r0 = this;
                java.lang.Exception r1 = (java.lang.Exception) r1
                r0.onPostExecute2(r1)
                return
        }
    }

    private TrustedWebActivityServiceConnectionPool(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mConnections = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.mContext = r2
            return
    }

    public static androidx.browser.trusted.TrustedWebActivityServiceConnectionPool create(android.content.Context r1) {
            androidx.browser.trusted.TrustedWebActivityServiceConnectionPool r0 = new androidx.browser.trusted.TrustedWebActivityServiceConnectionPool
            r0.<init>(r1)
            return r0
    }

    private android.content.Intent createServiceIntent(android.content.Context r8, android.net.Uri r9, java.util.Set<androidx.browser.trusted.Token> r10, boolean r11) {
            r7 = this;
            r0 = 0
            if (r10 == 0) goto Ld4
            int r1 = r10.size()
            if (r1 != 0) goto Lb
            goto Ld4
        Lb:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.setData(r9)
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.setAction(r2)
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            r3 = 65536(0x10000, float:9.1835E-41)
            java.util.List r1 = r2.queryIntentActivities(r1, r3)
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
        L27:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            java.util.Iterator r4 = r10.iterator()
        L3b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L27
            java.lang.Object r5 = r4.next()
            androidx.browser.trusted.Token r5 = (androidx.browser.trusted.Token) r5
            android.content.pm.PackageManager r6 = r8.getPackageManager()
            boolean r5 = r5.matches(r3, r6)
            if (r5 == 0) goto L3b
            r2 = r3
            goto L27
        L53:
            java.lang.String r10 = "TWAConnectionPool"
            if (r2 != 0) goto L72
            if (r11 == 0) goto L71
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "No TWA candidates for "
            r8.<init>(r11)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " have been registered."
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r10, r8)
        L71:
            return r0
        L72:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.setPackage(r2)
            java.lang.String r3 = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE"
            r1.setAction(r3)
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            r3 = 131072(0x20000, float:1.83671E-40)
            android.content.pm.ResolveInfo r8 = r8.resolveService(r1, r3)
            if (r8 != 0) goto La0
            if (r11 == 0) goto L9f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Could not find TWAService for "
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r10, r8)
        L9f:
            return r0
        La0:
            if (r11 == 0) goto Lc2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Found "
            r11.<init>(r0)
            android.content.pm.ServiceInfo r0 = r8.serviceInfo
            java.lang.String r0 = r0.name
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r0 = " to handle request for "
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.String r9 = r9.toString()
            android.util.Log.i(r10, r9)
        Lc2:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            android.content.ComponentName r10 = new android.content.ComponentName
            android.content.pm.ServiceInfo r8 = r8.serviceInfo
            java.lang.String r8 = r8.name
            r10.<init>(r2, r8)
            r9.setComponent(r10)
            return r9
        Ld4:
            return r0
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.browser.trusted.TrustedWebActivityServiceConnection> connect(android.net.Uri r3, java.util.Set<androidx.browser.trusted.Token> r4, java.util.concurrent.Executor r5) {
            r2 = this;
            java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> r0 = r2.mConnections
            java.lang.Object r0 = r0.get(r3)
            androidx.browser.trusted.ConnectionHolder r0 = (androidx.browser.trusted.ConnectionHolder) r0
            if (r0 == 0) goto Lf
            com.google.common.util.concurrent.ListenableFuture r3 = r0.getServiceWrapper()
            return r3
        Lf:
            android.content.Context r0 = r2.mContext
            r1 = 1
            android.content.Intent r4 = r2.createServiceIntent(r0, r3, r4, r1)
            if (r4 != 0) goto L24
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "No service exists for scope"
            r3.<init>(r4)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.browser.trusted.FutureUtils.immediateFailedFuture(r3)
            return r3
        L24:
            androidx.browser.trusted.ConnectionHolder r0 = new androidx.browser.trusted.ConnectionHolder
            androidx.browser.trusted.TrustedWebActivityServiceConnectionPool$$ExternalSyntheticLambda0 r1 = new androidx.browser.trusted.TrustedWebActivityServiceConnectionPool$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            r0.<init>(r1)
            java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> r1 = r2.mConnections
            r1.put(r3, r0)
            androidx.browser.trusted.TrustedWebActivityServiceConnectionPool$BindToServiceAsyncTask r3 = new androidx.browser.trusted.TrustedWebActivityServiceConnectionPool$BindToServiceAsyncTask
            android.content.Context r1 = r2.mContext
            r3.<init>(r1, r4, r0)
            r4 = 0
            java.lang.Void[] r4 = new java.lang.Void[r4]
            r3.executeOnExecutor(r5, r4)
            com.google.common.util.concurrent.ListenableFuture r3 = r0.getServiceWrapper()
            return r3
    }

    /* JADX INFO: renamed from: lambda$connect$0$androidx-browser-trusted-TrustedWebActivityServiceConnectionPool, reason: not valid java name */
    /* synthetic */ void m13x9cdfbfef(android.net.Uri r2) {
            r1 = this;
            java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> r0 = r1.mConnections
            r0.remove(r2)
            return
    }

    public boolean serviceExistsForScope(android.net.Uri r4, java.util.Set<androidx.browser.trusted.Token> r5) {
            r3 = this;
            java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> r0 = r3.mConnections
            java.lang.Object r0 = r0.get(r4)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            android.content.Context r0 = r3.mContext
            r2 = 0
            android.content.Intent r4 = r3.createServiceIntent(r0, r4, r5, r2)
            if (r4 == 0) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            return r1
    }

    void unbindAllConnections() {
            r3 = this;
            java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> r0 = r3.mConnections
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.browser.trusted.ConnectionHolder r1 = (androidx.browser.trusted.ConnectionHolder) r1
            android.content.Context r2 = r3.mContext
            r2.unbindService(r1)
            goto La
        L1c:
            java.util.Map<android.net.Uri, androidx.browser.trusted.ConnectionHolder> r0 = r3.mConnections
            r0.clear()
            return
    }
}
