package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformVersion {
    private PlatformVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean isAtLeastHoneycomb() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastHoneycombMR1() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastIceCreamSandwich() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastIceCreamSandwichMR1() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastJellyBean() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastJellyBeanMR1() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastJellyBeanMR2() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastKitKat() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastKitKatWatch() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastLollipop() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastLollipopMR1() {
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static boolean isAtLeastM() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastN() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastO() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastSv2() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastU() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastV() {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastV()
            return r0
    }
}
