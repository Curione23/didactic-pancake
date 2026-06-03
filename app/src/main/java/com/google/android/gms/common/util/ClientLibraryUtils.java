package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class ClientLibraryUtils {
    private ClientLibraryUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getClientVersion(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageInfo r1 = getPackageInfo(r1, r2)
            r2 = -1
            if (r1 == 0) goto L19
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo
            if (r0 != 0) goto Lc
            goto L19
        Lc:
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo
            android.os.Bundle r1 = r1.metaData
            if (r1 == 0) goto L19
            java.lang.String r0 = "com.google.android.gms.version"
            int r1 = r1.getInt(r0, r2)
            return r1
        L19:
            return r2
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context r1, java.lang.String r2) {
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean isPackageSide() {
            r0 = 0
            return r0
    }
}
