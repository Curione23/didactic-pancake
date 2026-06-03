package ca.dnamobile.javalauncher.utils;

/* JADX INFO: loaded from: classes.dex */
public final class FullscreenUtils {
    private static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS_COMPAT = 3;

    private FullscreenUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyDisplayCutoutMode(android.app.Activity r2, boolean r3, boolean r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L7
            return
        L7:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto Le
            return
        Le:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()     // Catch: java.lang.Throwable -> L1b
            int r3 = resolveDisplayCutoutMode(r3, r4)     // Catch: java.lang.Throwable -> L1b
            r0.layoutInDisplayCutoutMode = r3     // Catch: java.lang.Throwable -> L1b
            r2.setAttributes(r0)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    private static void applyWindowFullscreenFlags(android.view.Window r2, boolean r3) {
            r0 = 2048(0x800, float:2.87E-42)
            r2.clearFlags(r0)     // Catch: java.lang.Throwable -> L24
            r0 = 512(0x200, float:7.17E-43)
            r1 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L1e
            r2.addFlags(r1)     // Catch: java.lang.Throwable -> L24
            r2.addFlags(r0)     // Catch: java.lang.Throwable -> L24
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r3)     // Catch: java.lang.Throwable -> L24
            r3 = 0
            r2.setStatusBarColor(r3)     // Catch: java.lang.Throwable -> L24
            r2.setNavigationBarColor(r3)     // Catch: java.lang.Throwable -> L24
            goto L24
        L1e:
            r2.clearFlags(r1)     // Catch: java.lang.Throwable -> L24
            r2.clearFlags(r0)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    private static int buildSystemUiFlags(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7
        L5:
            r0 = 256(0x100, float:3.59E-43)
        L7:
            return r0
    }

    public static void enableImmersive(android.app.Activity r7) {
            android.view.Window r0 = r7.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isForceFullscreenMode(r7)
            boolean r2 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isIgnoreDisplayCutout(r7)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L18
            if (r2 == 0) goto L16
            goto L18
        L16:
            r5 = r4
            goto L19
        L18:
            r5 = r3
        L19:
            applyDisplayCutoutMode(r7, r2, r1)
            applyWindowFullscreenFlags(r0, r5)
            r7 = 0
            android.view.View r1 = r0.getDecorView()     // Catch: java.lang.Throwable -> L25
            goto L26
        L25:
            r1 = r7
        L26:
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r2 < r6) goto L58
            r2 = r5 ^ 1
            r0.setDecorFitsSystemWindows(r2)     // Catch: java.lang.Throwable -> L31
        L31:
            if (r1 == 0) goto L37
            android.view.WindowInsetsController r7 = r1.getWindowInsetsController()     // Catch: java.lang.Throwable -> L37
        L37:
            if (r7 == 0) goto L58
            if (r5 == 0) goto L4c
            int r0 = android.view.WindowInsets.Type.statusBars()     // Catch: java.lang.Throwable -> L58
            int r2 = android.view.WindowInsets.Type.navigationBars()     // Catch: java.lang.Throwable -> L58
            r0 = r0 | r2
            r7.hide(r0)     // Catch: java.lang.Throwable -> L58
            r0 = 2
            r7.setSystemBarsBehavior(r0)     // Catch: java.lang.Throwable -> L58
            goto L58
        L4c:
            int r0 = android.view.WindowInsets.Type.statusBars()     // Catch: java.lang.Throwable -> L58
            int r2 = android.view.WindowInsets.Type.navigationBars()     // Catch: java.lang.Throwable -> L58
            r0 = r0 | r2
            r7.show(r0)     // Catch: java.lang.Throwable -> L58
        L58:
            if (r1 == 0) goto L64
            r1.setFitsSystemWindows(r4)     // Catch: java.lang.Throwable -> L64
            int r7 = buildSystemUiFlags(r5)     // Catch: java.lang.Throwable -> L64
            r1.setSystemUiVisibility(r7)     // Catch: java.lang.Throwable -> L64
        L64:
            return
    }

    private static int resolveDisplayCutoutMode(boolean r1, boolean r2) {
            r0 = 1
            if (r1 == 0) goto Lc
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto Lb
            r1 = 3
            return r1
        Lb:
            return r0
        Lc:
            if (r2 == 0) goto Lf
            return r0
        Lf:
            r1 = 0
            return r1
    }
}
