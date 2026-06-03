package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzah {
    private static final android.net.Uri zza = null;

    static {
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzah.zza = r0
            return
    }

    static android.content.Intent zza(android.content.Context r5, com.google.android.gms.common.internal.zzn r6) throws com.google.android.gms.common.internal.zzaf {
            java.lang.String r0 = "ServiceBindIntentUtils"
            java.lang.String r1 = r6.zza()
            if (r1 != 0) goto L16
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.ComponentName r6 = r6.zzc()
            android.content.Intent r5 = r5.setComponent(r6)
            return r5
        L16:
            boolean r2 = r6.zzd()
            r3 = 0
            if (r2 == 0) goto Lac
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "serviceActionBundleKey"
            r2.putString(r4, r1)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
            android.net.Uri r4 = com.google.android.gms.common.internal.zzah.zza     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
            android.content.ContentProviderClient r5 = r5.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
            if (r5 == 0) goto L42
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r2 = r5.call(r4, r3, r2)     // Catch: java.lang.Throwable -> L3d
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
            goto L5b
        L3d:
            r2 = move-exception
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
            throw r2     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
        L42:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
            java.lang.String r2 = "Failed to acquire ContentProviderClient"
            r5.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
            throw r5     // Catch: java.lang.IllegalArgumentException -> L4a android.os.RemoteException -> L4c
        L4a:
            r5 = move-exception
            goto L4d
        L4c:
            r5 = move-exception
        L4d:
            java.lang.String r2 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r2.concat(r5)
            android.util.Log.w(r0, r5)
            r2 = r3
        L5b:
            if (r2 != 0) goto L5e
            goto L74
        L5e:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 == 0) goto L6a
            r3 = r5
            goto L74
        L6a:
            java.lang.String r5 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            if (r5 != 0) goto L80
        L74:
            if (r3 != 0) goto Lac
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r5 = r5.concat(r1)
            android.util.Log.w(r0, r5)
            goto Lac
        L80:
            int r6 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r6 = r6 + 72
            r2.<init>(r6)
            java.lang.String r6 = "Dynamic lookup for intent failed for action "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = " but has possible resolution"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r0, r6)
            com.google.android.gms.common.internal.zzaf r6 = new com.google.android.gms.common.internal.zzaf
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 25
            r0.<init>(r1, r5)
            r6.<init>(r0)
            throw r6
        Lac:
            if (r3 != 0) goto Lbc
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r1)
            java.lang.String r6 = r6.zzb()
            android.content.Intent r5 = r5.setPackage(r6)
            return r5
        Lbc:
            return r3
    }
}
