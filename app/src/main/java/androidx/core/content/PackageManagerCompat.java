package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class PackageManagerCompat {
    public static final java.lang.String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final java.lang.String LOG_TAG = "PackageManagerCompat";

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean areUnusedAppRestrictionsEnabled(android.content.Context r0) {
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                boolean r0 = r0.isAutoRevokeWhitelisted()
                r0 = r0 ^ 1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areUnusedAppRestrictionsAvailable(android.content.pm.PackageManager r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 30
            if (r0 < r3) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r3) goto L11
            r3 = r1
            goto L12
        L11:
            r3 = r2
        L12:
            java.lang.String r5 = getPermissionRevocationVerifierApp(r5)
            if (r5 == 0) goto L1a
            r5 = r1
            goto L1b
        L1a:
            r5 = r2
        L1b:
            if (r0 != 0) goto L23
            if (r3 == 0) goto L22
            if (r5 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
    }

    public static java.lang.String getPermissionRevocationVerifierApp(android.content.pm.PackageManager r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r0.<init>(r1)
            java.lang.String r1 = "package"
            java.lang.String r2 = "com.example"
            r3 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r1, r2, r3)
            android.content.Intent r0 = r0.setData(r1)
            r1 = 0
            java.util.List r0 = r4.queryIntentActivities(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r2 = "android.permission.PACKAGE_VERIFICATION_AGENT"
            int r2 = r4.checkPermission(r2, r1)
            if (r2 == 0) goto L36
            goto L1d
        L36:
            if (r3 == 0) goto L39
            return r3
        L39:
            r3 = r1
            goto L1d
        L3b:
            return r3
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> getUnusedAppRestrictionsStatus(android.content.Context r7) {
            androidx.concurrent.futures.ResolvableFuture r0 = androidx.concurrent.futures.ResolvableFuture.create()
            boolean r1 = androidx.core.os.UserManagerCompat.isUserUnlocked(r7)
            java.lang.String r2 = "PackageManagerCompat"
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r1 != 0) goto L1a
            r0.set(r3)
            java.lang.String r7 = "User is in locked direct boot mode"
            android.util.Log.e(r2, r7)
            return r0
        L1a:
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            boolean r1 = areUnusedAppRestrictionsAvailable(r1)
            if (r1 != 0) goto L2d
            r7 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.set(r7)
            return r0
        L2d:
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            r4 = 30
            if (r1 >= r4) goto L40
            r0.set(r3)
            java.lang.String r7 = "Target SDK version below API 30"
            android.util.Log.e(r2, r7)
            return r0
        L40:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 4
            r5 = 2
            r6 = 31
            if (r2 < r6) goto L61
            boolean r7 = androidx.core.content.PackageManagerCompat.Api30Impl.areUnusedAppRestrictionsEnabled(r7)
            if (r7 == 0) goto L59
            if (r1 < r6) goto L51
            r3 = 5
        L51:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r0.set(r7)
            goto L60
        L59:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r0.set(r7)
        L60:
            return r0
        L61:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 != r4) goto L75
            boolean r7 = androidx.core.content.PackageManagerCompat.Api30Impl.areUnusedAppRestrictionsEnabled(r7)
            if (r7 == 0) goto L6c
            goto L6d
        L6c:
            r3 = r5
        L6d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r0.set(r7)
            return r0
        L75:
            androidx.core.content.UnusedAppRestrictionsBackportServiceConnection r1 = new androidx.core.content.UnusedAppRestrictionsBackportServiceConnection
            r1.<init>(r7)
            java.util.Objects.requireNonNull(r1)
            androidx.core.content.PackageManagerCompat$$ExternalSyntheticLambda0 r7 = new androidx.core.content.PackageManagerCompat$$ExternalSyntheticLambda0
            r7.<init>(r1)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.addListener(r7, r2)
            r1.connectAndFetchResult(r0)
            return r0
    }
}
