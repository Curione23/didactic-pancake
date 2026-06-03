package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceProperties {
    private static java.lang.Boolean zza;
    private static java.lang.Boolean zzb;
    private static java.lang.Boolean zzc;
    private static java.lang.Boolean zzd;
    private static java.lang.Boolean zze;
    private static java.lang.Boolean zzf;
    private static java.lang.Boolean zzg;
    private static java.lang.Boolean zzh;
    private static java.lang.Boolean zzi;
    private static java.lang.Boolean zzj;
    private static java.lang.Boolean zzk;
    private static java.lang.Boolean zzl;
    private static java.lang.Boolean zzm;
    private static java.lang.Boolean zzn;
    private static java.lang.Boolean zzo;
    private static java.lang.Boolean zzp;
    private static java.lang.Boolean zzq;

    private DeviceProperties() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAuto(android.content.Context r0) {
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = zze(r0)
            return r0
    }

    public static boolean isBstar(android.content.Context r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzo
            if (r0 != 0) goto L1e
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r1 = 0
            if (r0 == 0) goto L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.google.android.play.feature.HPE_EXPERIENCE"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L18
            r1 = 1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzo = r2
        L1e:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzo
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean isFoldable(android.content.Context r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzd
            if (r0 != 0) goto L1e
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r1 = 0
            if (r0 == 0) goto L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.sensor.hinge_angle"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L18
            r1 = 1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzd = r2
        L1e:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzd
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean isLatchsky(android.content.Context r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzh
            if (r0 != 0) goto L20
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.google.android.feature.services_updater"
            boolean r0 = r2.hasSystemFeature(r0)
            r1 = 0
            if (r0 == 0) goto L1a
            java.lang.String r0 = "cn.google.services"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L1a
            r1 = 1
        L1a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzh = r2
        L20:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzh
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean isPhone(android.content.Context r4) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zza
            if (r0 != 0) goto L92
            boolean r0 = isFoldable(r4)
            r1 = 1
            if (r0 != 0) goto L8c
            boolean r0 = isTablet(r4)
            r2 = 0
            if (r0 != 0) goto L8b
            boolean r0 = isWearable(r4)
            if (r0 != 0) goto L8b
            boolean r0 = zzd(r4)
            if (r0 != 0) goto L8b
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzk
            if (r0 != 0) goto L32
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "org.chromium.arc"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzk = r0
        L32:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzk
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8b
            boolean r0 = isAuto(r4)
            if (r0 != 0) goto L8b
            boolean r0 = isTv(r4)
            if (r0 != 0) goto L8b
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzn
            if (r0 != 0) goto L5a
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "com.google.android.feature.AMATI_EXPERIENCE"
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzn = r0
        L5a:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzn
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8b
            boolean r0 = isBstar(r4)
            if (r0 != 0) goto L8b
            boolean r0 = isXr(r4)
            if (r0 != 0) goto L8b
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzq
            if (r0 != 0) goto L82
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "com.google.desktop.gms"
            boolean r4 = r4.hasSystemFeature(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.common.util.DeviceProperties.zzq = r4
        L82:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zzq
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L8b
            goto L8c
        L8b:
            r1 = r2
        L8c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zza = r4
        L92:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zza
            boolean r4 = r4.booleanValue()
            return r4
    }

    public static boolean isPhoneGo(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzb
            if (r1 != 0) goto L40
            boolean r1 = isPhone(r3)
            if (r1 == 0) goto L3a
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzi
            if (r1 != 0) goto L26
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            if (r3 == 0) goto L26
            boolean r3 = r3.isLowRamDevice()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.common.util.DeviceProperties.zzi = r3
        L26:
            java.lang.Boolean r3 = com.google.android.gms.common.util.DeviceProperties.zzi
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r2)
            if (r3 == 0) goto L3a
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 27
            if (r3 < r2) goto L3a
            r0 = r1
        L3a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzb = r3
        L40:
            java.lang.Boolean r3 = com.google.android.gms.common.util.DeviceProperties.zzb
            boolean r3 = r3.booleanValue()
            return r3
    }

    public static boolean isSevenInchTablet(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            boolean r0 = zza(r0)
            return r0
    }

    public static boolean isSidewinder(android.content.Context r0) {
            boolean r0 = zzc(r0)
            return r0
    }

    public static boolean isTablet(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            boolean r0 = isTablet(r0)
            return r0
    }

    public static boolean isTablet(android.content.res.Resources r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzc
            if (r1 != 0) goto L23
            android.content.res.Configuration r1 = r4.getConfiguration()
            int r1 = r1.screenLayout
            r1 = r1 & 15
            r2 = 3
            r3 = 1
            if (r1 <= r2) goto L16
        L14:
            r0 = r3
            goto L1d
        L16:
            boolean r4 = zza(r4)
            if (r4 == 0) goto L1d
            goto L14
        L1d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzc = r4
        L23:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zzc
            boolean r4 = r4.booleanValue()
            return r4
    }

    public static boolean isTv(android.content.Context r0) {
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = zzf(r0)
            return r0
    }

    public static boolean isUserBuild() {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            java.lang.String r0 = "user"
            java.lang.String r1 = android.os.Build.TYPE
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isWearable(android.content.Context r0) {
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = zzb(r0)
            return r0
    }

    public static boolean isWearableWithoutPlayStore(android.content.Context r1) {
            boolean r0 = isWearable(r1)
            if (r0 == 0) goto Lc
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastN()
            if (r0 == 0) goto L1e
        Lc:
            boolean r1 = zzc(r1)
            if (r1 == 0) goto L20
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r1 == 0) goto L1e
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            if (r1 == 0) goto L20
        L1e:
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static boolean isXr(android.content.Context r0) {
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            boolean r0 = zzg(r0)
            return r0
    }

    public static boolean zza(android.content.res.Resources r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zze
            if (r1 != 0) goto L20
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r1 = r3.screenLayout
            r1 = r1 & 15
            r2 = 3
            if (r1 > r2) goto L1a
            int r3 = r3.smallestScreenWidthDp
            r1 = 600(0x258, float:8.41E-43)
            if (r3 < r1) goto L1a
            r0 = 1
        L1a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zze = r3
        L20:
            java.lang.Boolean r3 = com.google.android.gms.common.util.DeviceProperties.zze
            boolean r3 = r3.booleanValue()
            return r3
    }

    public static boolean zzb(android.content.pm.PackageManager r1) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzf
            if (r0 != 0) goto L10
            java.lang.String r0 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzf = r1
        L10:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzf
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean zzc(android.content.Context r1) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzg
            if (r0 != 0) goto L14
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r1 = r1.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzg = r1
        L14:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzg
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean zzd(android.content.Context r1) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzj
            if (r0 != 0) goto L25
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r0 == 0) goto L15
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r1 = r1.hasSystemFeature(r0)
            goto L1f
        L15:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "android.hardware.type.iot"
            boolean r1 = r1.hasSystemFeature(r0)
        L1f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzj = r1
        L25:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzj
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean zze(android.content.pm.PackageManager r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzl
            if (r0 != 0) goto L1a
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L14
            r1 = 1
        L14:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzl = r2
        L1a:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzl
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean zzf(android.content.pm.PackageManager r2) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzm
            if (r0 != 0) goto L2d
            java.lang.String r0 = "com.google.android.tv"
            boolean r0 = r2.hasSystemFeature(r0)
            r1 = 1
            if (r0 != 0) goto L27
            java.lang.String r0 = "android.hardware.type.television"
            boolean r0 = r2.hasSystemFeature(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "android.software.leanback"
            boolean r0 = r2.hasSystemFeature(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "com.google.android.feature.AMATI_EXPERIENCE"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzm = r2
        L2d:
            java.lang.Boolean r2 = com.google.android.gms.common.util.DeviceProperties.zzm
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static boolean zzg(android.content.pm.PackageManager r1) {
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzp
            if (r0 != 0) goto L10
            java.lang.String r0 = "android.software.xr.api.spatial"
            boolean r1 = r1.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zzp = r1
        L10:
            java.lang.Boolean r1 = com.google.android.gms.common.util.DeviceProperties.zzp
            boolean r1 = r1.booleanValue()
            return r1
    }
}
