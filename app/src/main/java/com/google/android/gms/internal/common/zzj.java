package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    public static java.lang.Object zza(java.lang.Class r2, java.lang.String r3, com.google.android.gms.internal.common.zzi... r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r3 = 0
            r0 = 0
            java.lang.String r1 = "isIsolated"
            java.lang.Object r2 = zzc(r2, r1, r3, r0, r4)
            return r2
    }

    public static java.lang.Object zzb(java.lang.String r1, java.lang.String r2, java.lang.ClassLoader r3, com.google.android.gms.internal.common.zzi... r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.ClassNotFoundException {
            java.lang.String r1 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.Class r1 = r3.loadClass(r1)
            r2 = 0
            r3 = 0
            java.lang.String r0 = "reportRequestStats2"
            java.lang.Object r1 = zzc(r1, r0, r2, r3, r4)
            return r1
    }

    private static java.lang.Object zzc(java.lang.Class r2, java.lang.String r3, java.lang.Object r4, boolean r5, com.google.android.gms.internal.common.zzi... r6) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            int r4 = r6.length
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
        L6:
            int r1 = r6.length
            if (r0 >= r1) goto L1f
            r1 = r6[r0]
            r1.getClass()
            java.lang.Class r1 = r1.zzc()
            r5[r0] = r1
            r1 = r6[r0]
            java.lang.Object r1 = r1.zzd()
            r4[r0] = r1
            int r0 = r0 + 1
            goto L6
        L1f:
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r4)
            return r2
    }
}
