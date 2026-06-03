package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignatureVerifier {

    @javax.annotation.Nullable
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;

    @javax.annotation.Nullable
    private static volatile java.util.Set zzd;

    @javax.annotation.Nullable
    private static volatile java.util.Set zze;
    private final android.content.Context zzb;
    private volatile java.lang.String zzc;

    public GoogleSignatureVerifier(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.Class<com.google.android.gms.common.GoogleSignatureVerifier> r0 = com.google.android.gms.common.GoogleSignatureVerifier.class
            monitor-enter(r0)
            com.google.android.gms.common.GoogleSignatureVerifier r1 = com.google.android.gms.common.GoogleSignatureVerifier.zza     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L14
            com.google.android.gms.common.zzo.zza(r2)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.GoogleSignatureVerifier r1 = new com.google.android.gms.common.GoogleSignatureVerifier     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.GoogleSignatureVerifier.zza = r1     // Catch: java.lang.Throwable -> L18
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.GoogleSignatureVerifier r2 = com.google.android.gms.common.GoogleSignatureVerifier.zza
            return r2
        L18:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r2
    }

    @java.lang.Deprecated
    static final boolean zza(android.content.pm.PackageInfo r10, boolean r11) {
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r0
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r1
        L28:
            if (r11 == 0) goto L2d
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.zzc     // Catch: java.lang.IllegalArgumentException -> Ld0
            goto L2f
        L2d:
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.zzb     // Catch: java.lang.IllegalArgumentException -> Ld0
        L2f:
            int r3 = com.google.android.gms.common.util.AndroidUtilsLight.zza     // Catch: java.lang.IllegalArgumentException -> Ld0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalArgumentException -> Ld0
            r4 = 28
            if (r3 >= r4) goto L55
            android.content.pm.Signature[] r3 = r10.signatures     // Catch: java.lang.IllegalArgumentException -> Ld0
            r4 = 0
            if (r3 == 0) goto L49
            android.content.pm.Signature[] r3 = r10.signatures     // Catch: java.lang.IllegalArgumentException -> Ld0
            int r3 = r3.length     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r3 != r1) goto L49
            android.content.pm.Signature[] r3 = r10.signatures     // Catch: java.lang.IllegalArgumentException -> Ld0
            r3 = r3[r0]     // Catch: java.lang.IllegalArgumentException -> Ld0
            byte[] r4 = r3.toByteArray()     // Catch: java.lang.IllegalArgumentException -> Ld0
        L49:
            if (r4 == 0) goto L50
            com.google.android.gms.internal.common.zzah r3 = com.google.android.gms.internal.common.zzah.zzk(r4)     // Catch: java.lang.IllegalArgumentException -> Ld0
            goto L94
        L50:
            com.google.android.gms.internal.common.zzah r3 = com.google.android.gms.internal.common.zzah.zzj()     // Catch: java.lang.IllegalArgumentException -> Ld0
            goto L94
        L55:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r3 < r4) goto L5b
            r3 = r1
            goto L5c
        L5b:
            r3 = r0
        L5c:
            com.google.android.gms.internal.common.zzr.zza(r3)     // Catch: java.lang.IllegalArgumentException -> Ld0
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r3 == 0) goto L90
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r4 != 0) goto L90
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r4 != 0) goto L70
            goto L90
        L70:
            int r4 = com.google.android.gms.internal.common.zzah.zzd     // Catch: java.lang.IllegalArgumentException -> Ld0
            com.google.android.gms.internal.common.zzad r4 = new com.google.android.gms.internal.common.zzad     // Catch: java.lang.IllegalArgumentException -> Ld0
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> Ld0
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> Ld0
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> Ld0
            r6 = r0
        L7d:
            if (r6 >= r5) goto L8b
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> Ld0
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> Ld0
            r4.zzb(r7)     // Catch: java.lang.IllegalArgumentException -> Ld0
            int r6 = r6 + 1
            goto L7d
        L8b:
            com.google.android.gms.internal.common.zzah r3 = r4.zzd()     // Catch: java.lang.IllegalArgumentException -> Ld0
            goto L94
        L90:
            com.google.android.gms.internal.common.zzah r3 = com.google.android.gms.internal.common.zzah.zzj()     // Catch: java.lang.IllegalArgumentException -> Ld0
        L94:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r4 != 0) goto Lc8
            com.google.android.gms.internal.common.zzah r3 = r3.zzh()     // Catch: java.lang.IllegalArgumentException -> Ld0
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> Ld0
            r5 = r0
        La3:
            if (r5 >= r4) goto Lc7
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> Ld0
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> Ld0
            com.google.android.gms.internal.common.zzal r7 = r2.zzr(r0)     // Catch: java.lang.IllegalArgumentException -> Ld0
        Laf:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> Ld0
            int r9 = r5 + 1
            if (r8 == 0) goto Lc5
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> Ld0
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> Ld0
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r8 == 0) goto Laf
            r0 = r1
            goto Lc7
        Lc5:
            r5 = r9
            goto La3
        Lc7:
            return r0
        Lc8:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> Ld0
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> Ld0
            throw r3     // Catch: java.lang.IllegalArgumentException -> Ld0
        Ld0:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Le0
            com.google.android.gms.common.zzj[] r11 = com.google.android.gms.common.zzn.zza
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
            goto Lec
        Le0:
            com.google.android.gms.common.zzj[] r11 = new com.google.android.gms.common.zzj[r1]
            com.google.android.gms.common.zzj[] r2 = com.google.android.gms.common.zzn.zza
            r2 = r2[r0]
            r11[r0] = r2
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
        Lec:
            if (r10 == 0) goto Lef
            return r1
        Lef:
            return r0
    }

    private final com.google.android.gms.common.zzy zzb(@javax.annotation.Nullable java.lang.String r6, boolean r7, boolean r8) {
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L9
            com.google.android.gms.common.zzy r6 = com.google.android.gms.common.zzy.zzc(r7)
            return r6
        L9:
            java.lang.String r8 = r5.zzc
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto Ld4
            int r8 = com.google.android.gms.common.zzo.zzh
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            r0 = 1
            com.google.android.gms.common.zzo.zzb()     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L4a
            com.google.android.gms.common.internal.zzad r1 = com.google.android.gms.common.zzo.zzg     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L4a
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L45 android.os.RemoteException -> L48 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L4a
            android.os.StrictMode.setThreadPolicy(r8)
            if (r1 == 0) goto L55
            com.google.android.gms.common.zzv r7 = new com.google.android.gms.common.zzv
            r8 = 0
            r7.<init>(r8)
            r7.zza(r6)
            android.content.Context r8 = r5.zzb
            boolean r8 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r8)
            r7.zzb(r8)
            r7.zzc(r0)
            com.google.android.gms.common.zzw r7 = r7.zzd()
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzo.zzc(r7)
            goto Lbd
        L45:
            r6 = move-exception
            goto Ld0
        L48:
            r1 = move-exception
            goto L4b
        L4a:
            r1 = move-exception
        L4b:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r3 = "Failed to get Google certificates from remote"
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L45
            android.os.StrictMode.setThreadPolicy(r8)
        L55:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r8 < r1) goto L5f
            r8 = 134217792(0x8000040, float:3.8518893E-34)
            goto L61
        L5f:
            r8 = 64
        L61:
            android.content.Context r1 = r5.zzb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r6, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc4
            android.content.Context r1 = r5.zzb
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r1)
            if (r8 != 0) goto L78
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
            goto Lbd
        L78:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto Lb7
            android.content.pm.Signature[] r7 = r8.signatures
            int r7 = r7.length
            if (r7 == r0) goto L82
            goto Lb7
        L82:
            com.google.android.gms.common.zzk r7 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r2 = r8.signatures
            r3 = 0
            r2 = r2[r3]
            byte[] r2 = r2.toByteArray()
            r7.<init>(r2)
            java.lang.String r2 = r8.packageName
            com.google.android.gms.common.zzy r1 = com.google.android.gms.common.zzo.zzd(r2, r7, r1, r3)
            boolean r4 = r1.zza
            if (r4 == 0) goto Lb5
            android.content.pm.ApplicationInfo r4 = r8.applicationInfo
            if (r4 == 0) goto Lb5
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto Lb5
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzo.zzd(r2, r7, r3, r0)
            boolean r7 = r7.zza
            if (r7 == 0) goto Lb5
            java.lang.String r7 = "debuggable release cert app rejected"
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
            goto Lbd
        Lb5:
            r7 = r1
            goto Lbd
        Lb7:
            java.lang.String r7 = "single cert required"
            com.google.android.gms.common.zzy r7 = com.google.android.gms.common.zzy.zzc(r7)
        Lbd:
            boolean r8 = r7.zza
            if (r8 == 0) goto Lc3
            r5.zzc = r6
        Lc3:
            return r7
        Lc4:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            com.google.android.gms.common.zzy r6 = com.google.android.gms.common.zzy.zzd(r6, r7)
            return r6
        Ld0:
            android.os.StrictMode.setThreadPolicy(r8)
            throw r6
        Ld4:
            com.google.android.gms.common.zzy r6 = com.google.android.gms.common.zzy.zzb()
            return r6
    }

    @javax.annotation.Nullable
    private static com.google.android.gms.common.zzj zzc(android.content.pm.PackageInfo r3, com.google.android.gms.common.zzj... r4) {
            android.content.pm.Signature[] r0 = r3.signatures
            r1 = 0
            if (r0 != 0) goto L6
            goto L33
        L6:
            android.content.pm.Signature[] r0 = r3.signatures
            int r0 = r0.length
            r2 = 1
            if (r0 == r2) goto L14
            java.lang.String r3 = "GoogleSignatureVerifier"
            java.lang.String r4 = "Package has more than one signature."
            android.util.Log.w(r3, r4)
            return r1
        L14:
            com.google.android.gms.common.zzk r0 = new com.google.android.gms.common.zzk
            android.content.pm.Signature[] r3 = r3.signatures
            r2 = 0
            r3 = r3[r2]
            byte[] r3 = r3.toByteArray()
            r0.<init>(r3)
        L22:
            int r3 = r4.length
            if (r2 >= r3) goto L33
            r3 = r4[r2]
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L30
            r3 = r4[r2]
            return r3
        L30:
            int r2 = r2 + 1
            goto L22
        L33:
            return r1
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = zza(r4, r0)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r4 = zza(r4, r2)
            if (r4 == 0) goto L22
            android.content.Context r4 = r3.zzb
            boolean r4 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r4)
            if (r4 == 0) goto L1b
            return r2
        L1b:
            java.lang.String r4 = "GoogleSignatureVerifier"
            java.lang.String r1 = "Test-keys aren't accepted on this build."
            android.util.Log.w(r4, r1)
        L22:
            return r0
    }

    public boolean isPackageGoogleSigned(@javax.annotation.Nullable java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.zzy r2 = r1.zzb(r2, r0, r0)
            r2.zze()
            boolean r2 = r2.zza
            return r2
    }

    public boolean isUidGoogleSigned(int r6) {
            r5 = this;
            android.content.Context r0 = r5.zzb
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r6 = r0.getPackagesForUid(r6)
            if (r6 == 0) goto L2a
            int r0 = r6.length
            if (r0 != 0) goto L10
            goto L2a
        L10:
            r1 = 0
            r2 = 0
            r3 = r1
        L13:
            if (r3 >= r0) goto L23
            r2 = r6[r3]
            com.google.android.gms.common.zzy r2 = r5.zzb(r2, r1, r1)
            boolean r4 = r2.zza
            if (r4 == 0) goto L20
            goto L30
        L20:
            int r3 = r3 + 1
            goto L13
        L23:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r6 = r2
            com.google.android.gms.common.zzy r6 = (com.google.android.gms.common.zzy) r6
            goto L30
        L2a:
            java.lang.String r6 = "no pkgs"
            com.google.android.gms.common.zzy r2 = com.google.android.gms.common.zzy.zzc(r6)
        L30:
            r2.zze()
            boolean r6 = r2.zza
            return r6
    }
}
