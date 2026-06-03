package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final java.lang.String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final java.lang.String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";

    @java.lang.Deprecated
    static final java.util.concurrent.atomic.AtomicBoolean sCanceledAvailabilityNotification = null;
    public static boolean zza = false;
    public static boolean zzb = false;
    private static final java.util.concurrent.atomic.AtomicBoolean zzc = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzc = r0
            return
    }

    GooglePlayServicesUtilLight() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void cancelAvailabilityErrorNotifications(android.content.Context r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            goto L19
        La:
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.SecurityException -> L1a
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch: java.lang.SecurityException -> L1a
            if (r2 == 0) goto L19
            r0 = 10436(0x28c4, float:1.4624E-41)
            r2.cancel(r0)     // Catch: java.lang.SecurityException -> L1a
        L19:
            return
        L1a:
            r2 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications."
            android.util.Log.d(r0, r1, r2)
            return
    }

    public static void enableUsingApkIndependentContext() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzc
            r1 = 1
            r0.set(r1)
            return
    }

    @java.lang.Deprecated
    public static void ensurePlayServicesAvailable(android.content.Context r2, int r3) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            int r3 = r0.isGooglePlayServicesAvailable(r2, r3)
            if (r3 == 0) goto L44
            java.lang.String r0 = "e"
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.content.Intent r2 = r1.getErrorResolutionIntent(r2, r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 46
            r1.<init>(r0)
            java.lang.String r0 = "GooglePlayServices not available due to error "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "GooglePlayServicesUtil"
            android.util.Log.e(r1, r0)
            if (r2 != 0) goto L3c
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r2 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r2.<init>(r3)
            throw r2
        L3c:
            com.google.android.gms.common.GooglePlayServicesRepairableException r0 = new com.google.android.gms.common.GooglePlayServicesRepairableException
            java.lang.String r1 = "Google Play Services not available"
            r0.<init>(r3, r1, r2)
            throw r0
        L44:
            return
    }

    @java.lang.Deprecated
    public static int getApkVersion(android.content.Context r2) {
            r0 = 0
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            java.lang.String r1 = "com.google.android.gms"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            int r2 = r2.versionCode
            return r2
        Le:
            java.lang.String r2 = "GooglePlayServicesUtil"
            java.lang.String r1 = "Google Play services is missing."
            android.util.Log.w(r2, r1)
            return r0
    }

    @java.lang.Deprecated
    public static int getClientVersion(android.content.Context r1) {
            r0 = 1
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            java.lang.String r0 = r1.getPackageName()
            int r1 = com.google.android.gms.common.util.ClientLibraryUtils.getClientVersion(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static android.app.PendingIntent getErrorPendingIntent(int r1, android.content.Context r2, int r3) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.app.PendingIntent r1 = r0.getErrorResolutionPendingIntent(r2, r1, r3)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getErrorString(int r0) {
            java.lang.String r0 = com.google.android.gms.common.ConnectionResult.zza(r0)
            return r0
    }

    @java.lang.Deprecated
    public static android.content.Intent getGooglePlayServicesAvailabilityRecoveryIntent(int r2) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r1 = 0
            android.content.Intent r2 = r0.getErrorResolutionIntent(r1, r2, r1)
            return r2
    }

    public static android.content.Context getRemoteContext(android.content.Context r2) {
            java.lang.String r0 = "com.google.android.gms"
            r1 = 3
            android.content.Context r2 = r2.createPackageContext(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context r1) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean honorsDebugCertificates(android.content.Context r5) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzb
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L45
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
            r4 = 28
            if (r3 < r4) goto L14
            r3 = 134217792(0x8000040, float:3.8518893E-34)
            goto L16
        L14:
            r3 = 64
        L16:
            java.lang.String r4 = "com.google.android.gms"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r3)     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r5)     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r0 == 0) goto L30
            boolean r5 = com.google.android.gms.common.GoogleSignatureVerifier.zza(r0, r1)     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r5 != 0) goto L30
            boolean r5 = com.google.android.gms.common.GoogleSignatureVerifier.zza(r0, r2)     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r5 == 0) goto L30
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r2     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
            goto L32
        L30:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r1     // Catch: java.lang.Throwable -> L35 android.content.pm.PackageManager.NameNotFoundException -> L37
        L32:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = r2
            goto L45
        L35:
            r5 = move-exception
            goto L42
        L37:
            r5 = move-exception
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r3 = "Cannot find Google Play services package name."
            android.util.Log.w(r0, r3, r5)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = r2
            goto L45
        L42:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = r2
            throw r5
        L45:
            boolean r5 = com.google.android.gms.common.GooglePlayServicesUtilLight.zza
            if (r5 != 0) goto L51
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isUserBuild()
            if (r5 != 0) goto L50
            goto L51
        L50:
            return r1
        L51:
            return r2
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context r1) {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            int r1 = isGooglePlayServicesAvailable(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context r11, int r12) {
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r11.getResources()     // Catch: java.lang.Throwable -> Lc
            int r2 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue     // Catch: java.lang.Throwable -> Lc
            r1.getString(r2)     // Catch: java.lang.Throwable -> Lc
            goto L11
        Lc:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L11:
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            java.util.concurrent.atomic.AtomicBoolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzc
            boolean r1 = r1.get()
            if (r1 == 0) goto L26
            goto L3d
        L26:
            int r1 = com.google.android.gms.common.internal.zzae.zzb(r11)
            if (r1 == 0) goto L37
            int r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r1 != r3) goto L31
            goto L3d
        L31:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r11 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r11.<init>(r1)
            throw r11
        L37:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r11 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r11.<init>()
            throw r11
        L3d:
            boolean r1 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r11)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L4d
            boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzd(r11)
            if (r1 != 0) goto L4d
            r1 = r3
            goto L4e
        L4d:
            r1 = r4
        L4e:
            if (r12 < 0) goto L52
            r5 = r3
            goto L53
        L52:
            r5 = r4
        L53:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r5)
            java.lang.String r5 = r11.getPackageName()
            android.content.pm.PackageManager r6 = r11.getPackageManager()
            r7 = 28
            r8 = 9
            if (r1 == 0) goto L88
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            if (r9 < r7) goto L6c
            r9 = 134225984(0x8002040, float:3.855651E-34)
            goto L6e
        L6c:
            r9 = 8256(0x2040, float:1.1569E-41)
        L6e:
            java.lang.String r10 = "com.android.vending"
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r10, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            goto L89
        L75:
            java.lang.String.valueOf(r5)
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r12 = " requires the Google Play Store, but it is missing."
            java.lang.String r11 = r11.concat(r12)
            android.util.Log.w(r0, r11)
        L85:
            r3 = r8
            goto L177
        L88:
            r9 = 0
        L89:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L167
            if (r10 < r7) goto L91
            r7 = 134217792(0x8000040, float:3.8518893E-34)
            goto L93
        L91:
            r7 = 64
        L93:
            android.content.pm.PackageInfo r7 = r6.getPackageInfo(r2, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L167
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r11)
            boolean r11 = com.google.android.gms.common.GoogleSignatureVerifier.zza(r7, r3)
            if (r11 != 0) goto Lb1
            java.lang.String.valueOf(r5)
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r12 = " requires Google Play services, but their signature is invalid."
            java.lang.String r11 = r11.concat(r12)
            android.util.Log.w(r0, r11)
            goto L85
        Lb1:
            if (r1 == 0) goto Ld0
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r11 = r9
            android.content.pm.PackageInfo r11 = (android.content.pm.PackageInfo) r11
            boolean r11 = com.google.android.gms.common.GoogleSignatureVerifier.zza(r9, r3)
            if (r11 != 0) goto Ld0
            java.lang.String.valueOf(r5)
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r12 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r11 = r11.concat(r12)
            android.util.Log.w(r0, r11)
            goto L85
        Ld0:
            if (r1 == 0) goto Lf3
            if (r9 == 0) goto Lf3
            android.content.pm.Signature[] r11 = r9.signatures
            r11 = r11[r4]
            android.content.pm.Signature[] r1 = r7.signatures
            r1 = r1[r4]
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto Lf3
            java.lang.String.valueOf(r5)
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r12 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r11 = r11.concat(r12)
            android.util.Log.w(r0, r11)
            goto L85
        Lf3:
            int r11 = r7.versionCode
            int r11 = com.google.android.gms.common.util.zzb.zza(r11)
            int r1 = com.google.android.gms.common.util.zzb.zza(r12)
            if (r11 >= r1) goto L145
            int r11 = r7.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r12)
            int r1 = r1 + 49
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r1 = r1 + r2
            int r1 = r1 + 11
            int r2 = r3.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Google Play services out of date for "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = ".  Requires "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r12 = " but found "
            r3.append(r12)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            android.util.Log.w(r0, r11)
            r3 = 2
            goto L177
        L145:
            android.content.pm.ApplicationInfo r11 = r7.applicationInfo
            if (r11 != 0) goto L160
            android.content.pm.ApplicationInfo r11 = r6.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14e
            goto L160
        L14e:
            r11 = move-exception
            java.lang.String.valueOf(r5)
            java.lang.String r12 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r12 = r12.concat(r1)
            android.util.Log.wtf(r0, r12, r11)
            goto L177
        L160:
            boolean r11 = r11.enabled
            if (r11 != 0) goto L166
            r3 = 3
            goto L177
        L166:
            return r4
        L167:
            java.lang.String.valueOf(r5)
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r12 = " requires Google Play services, but they are missing."
            java.lang.String r11 = r11.concat(r12)
            android.util.Log.w(r0, r11)
        L177:
            return r3
    }

    @java.lang.Deprecated
    public static boolean isGooglePlayServicesUid(android.content.Context r0, int r1) {
            boolean r0 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isPlayServicesPossiblyUpdating(android.content.Context r2, int r3) {
            r0 = 18
            r1 = 1
            if (r3 != r0) goto L6
            return r1
        L6:
            if (r3 != r1) goto Lf
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = zza(r2, r3)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static boolean isPlayStorePossiblyUpdating(android.content.Context r1, int r2) {
            r0 = 9
            if (r2 != r0) goto Lb
            java.lang.String r2 = "com.android.vending"
            boolean r1 = zza(r1, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean isRestrictedUserProfile(android.content.Context r2) {
            java.lang.String r0 = "user"
            java.lang.Object r0 = r2.getSystemService(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            java.lang.String r2 = r2.getPackageName()
            android.os.Bundle r2 = r0.getApplicationRestrictions(r2)
            if (r2 == 0) goto L25
            java.lang.String r0 = "true"
            java.lang.String r1 = "restricted_profile"
            java.lang.String r2 = r2.getString(r1)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L25
            r2 = 1
            return r2
        L25:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static boolean isSidewinderDevice(android.content.Context r0) {
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int r2) {
            r0 = 1
            if (r2 == r0) goto Lf
            r1 = 2
            if (r2 == r1) goto Lf
            r1 = 3
            if (r2 == r1) goto Lf
            r1 = 9
            if (r2 == r1) goto Lf
            r2 = 0
            return r2
        Lf:
            return r0
    }

    @java.lang.Deprecated
    public static boolean uidHasPackageName(android.content.Context r0, int r1, java.lang.String r2) {
            boolean r0 = com.google.android.gms.common.util.UidVerifier.uidHasPackageName(r0, r1, r2)
            return r0
    }

    static boolean zza(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L49
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch: java.lang.Throwable -> L49
            java.util.List r2 = r2.getAllSessions()     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L17
            return r4
        L2f:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r6 = r2.getApplicationInfo(r6, r3)
            if (r0 == 0) goto L3e
            boolean r5 = r6.enabled
            return r5
        L3e:
            boolean r6 = r6.enabled
            if (r6 == 0) goto L49
            boolean r5 = isRestrictedUserProfile(r5)
            if (r5 != 0) goto L49
            return r4
        L49:
            return r1
    }
}
