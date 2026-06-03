package com.google.android.gms.common.wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class PackageManagerWrapper {
    protected final android.content.Context zza;

    public PackageManagerWrapper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public int checkCallingOrSelfPermission(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.zza
            int r2 = r0.checkCallingOrSelfPermission(r2)
            return r2
    }

    public int checkPermission(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r2 = r0.checkPermission(r2, r3)
            return r2
    }

    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String r2, int r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r3)
            return r2
    }

    public java.lang.CharSequence getApplicationLabel(java.lang.String r4) throws android.content.pm.PackageManager.NameNotFoundException {
            r3 = this;
            android.content.Context r0 = r3.zza
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 0
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r4, r2)
            java.lang.CharSequence r4 = r1.getApplicationLabel(r4)
            return r4
    }

    public androidx.core.util.Pair<java.lang.CharSequence, android.graphics.drawable.Drawable> getApplicationLabelAndIcon(java.lang.String r4) throws android.content.pm.PackageManager.NameNotFoundException {
            r3 = this;
            android.content.Context r0 = r3.zza
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r2 = 0
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r4, r2)
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            java.lang.CharSequence r1 = r1.getApplicationLabel(r4)
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r4 = r0.getApplicationIcon(r4)
            androidx.core.util.Pair r4 = androidx.core.util.Pair.create(r1, r4)
            return r4
    }

    public android.content.pm.PackageInfo getPackageInfo(java.lang.String r2, int r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r3)
            return r2
    }

    public java.lang.String[] getPackagesForUid(int r2) {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r2 = r0.getPackagesForUid(r2)
            return r2
    }

    public boolean isCallerInstantApp() {
            r3 = this;
            int r0 = android.os.Binder.getCallingUid()
            int r1 = android.os.Process.myUid()
            if (r0 != r1) goto L11
            android.content.Context r0 = r3.zza
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0)
            return r0
        L11:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r0 == 0) goto L30
            android.content.Context r0 = r3.zza
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            int r2 = android.os.Binder.getCallingUid()
            java.lang.String r1 = r1.getNameForUid(r2)
            if (r1 == 0) goto L30
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = r0.isInstantApp(r1)
            return r0
        L30:
            r0 = 0
            return r0
    }

    public final boolean zza(int r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.zza     // Catch: java.lang.SecurityException -> L19
            java.lang.String r1 = "appops"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.SecurityException -> L19
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0     // Catch: java.lang.SecurityException -> L19
            if (r0 == 0) goto L11
            r0.checkPackage(r3, r4)     // Catch: java.lang.SecurityException -> L19
            r3 = 1
            return r3
        L11:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.SecurityException -> L19
            java.lang.String r4 = "context.getSystemService(Context.APP_OPS_SERVICE) is null"
            r3.<init>(r4)     // Catch: java.lang.SecurityException -> L19
            throw r3     // Catch: java.lang.SecurityException -> L19
        L19:
            r3 = 0
            return r3
    }
}
