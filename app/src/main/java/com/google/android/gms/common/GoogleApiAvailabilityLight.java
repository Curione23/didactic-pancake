package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final java.lang.String TRACKING_SOURCE_DIALOG = "d";
    static final java.lang.String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = null;

    static {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = new com.google.android.gms.common.GoogleApiAvailabilityLight
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailabilityLight.zza = r0
            return
    }

    GoogleApiAvailabilityLight() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance() {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.zza
            return r0
    }

    public void cancelAvailabilityErrorNotifications(android.content.Context r1) {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(r1)
            return
    }

    public int getApkVersion(android.content.Context r1) {
            r0 = this;
            int r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(r1)
            return r1
    }

    public int getClientVersion(android.content.Context r1) {
            r0 = this;
            int r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(r1)
            return r1
    }

    @java.lang.Deprecated
    public android.content.Intent getErrorResolutionIntent(int r2) {
            r1 = this;
            r0 = 0
            android.content.Intent r2 = r1.getErrorResolutionIntent(r0, r2, r0)
            return r2
    }

    public android.content.Intent getErrorResolutionIntent(android.content.Context r4, int r5, java.lang.String r6) {
            r3 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms"
            if (r5 == r0) goto L1e
            r0 = 2
            if (r5 == r0) goto L1e
            r4 = 3
            r6 = 0
            if (r5 == r4) goto Ld
            return r6
        Ld:
            java.lang.String r4 = "package"
            android.net.Uri r4 = android.net.Uri.fromParts(r4, r1, r6)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r5.<init>(r6)
            r5.setData(r4)
            return r5
        L1e:
            if (r4 == 0) goto L34
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r4)
            if (r5 != 0) goto L27
            goto L34
        L27:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"
            r4.<init>(r5)
            java.lang.String r5 = "com.google.android.wearable.app"
            r4.setPackage(r5)
            return r4
        L34:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "gcore_"
            r5.<init>(r0)
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r5.append(r0)
            java.lang.String r0 = "-"
            r5.append(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L4e
            r5.append(r6)
        L4e:
            r5.append(r0)
            if (r4 == 0) goto L5a
            java.lang.String r6 = r4.getPackageName()
            r5.append(r6)
        L5a:
            r5.append(r0)
            if (r4 == 0) goto L71
            com.google.android.gms.common.wrappers.PackageManagerWrapper r6 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            r0 = 0
            android.content.pm.PackageInfo r4 = r6.getPackageInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
            r5.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L71
        L71:
            java.lang.String r4 = r5.toString()
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)
            java.lang.String r6 = "market://details"
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.String r0 = "id"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L97
            java.lang.String r0 = "pcampaignid"
            r6.appendQueryParameter(r0, r4)
        L97:
            android.net.Uri r4 = r6.build()
            r5.setData(r4)
            java.lang.String r4 = "com.android.vending"
            r5.setPackage(r4)
            r4 = 524288(0x80000, float:7.34684E-40)
            r5.addFlags(r4)
            return r5
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.PendingIntent r2 = r1.getErrorResolutionPendingIntent(r2, r3, r4, r0)
            return r2
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context r2, int r3, int r4, java.lang.String r5) {
            r1 = this;
            android.content.Intent r3 = r1.getErrorResolutionIntent(r2, r3, r5)
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 0
            android.app.PendingIntent r2 = androidx.core.app.PendingIntentCompat.getActivity(r2, r4, r3, r5, r0)
            return r2
    }

    public java.lang.String getErrorString(int r1) {
            r0 = this;
            java.lang.String r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(r1)
            return r1
    }

    public int isGooglePlayServicesAvailable(android.content.Context r2) {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            int r2 = r1.isGooglePlayServicesAvailable(r2, r0)
            return r2
    }

    public int isGooglePlayServicesAvailable(android.content.Context r1, int r2) {
            r0 = this;
            int r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r1, r2)
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2)
            if (r1 == 0) goto Ld
            r1 = 18
            return r1
        Ld:
            return r2
    }

    public boolean isPlayServicesPossiblyUpdating(android.content.Context r1, int r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2)
            return r1
    }

    public boolean isPlayStorePossiblyUpdating(android.content.Context r1, int r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(r1, r2)
            return r1
    }

    public boolean isUninstalledAppPossiblyUpdating(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.zza(r1, r2)
            return r1
    }

    public boolean isUserResolvableError(int r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(r1)
            return r1
    }

    public void verifyGooglePlayServicesIsAvailable(android.content.Context r1, int r2) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(r1, r2)
            return
    }
}
