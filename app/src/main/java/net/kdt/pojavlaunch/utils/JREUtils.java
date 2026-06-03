package net.kdt.pojavlaunch.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class JREUtils {
    private static final java.lang.String TAG = "JREUtils";

    static {
            java.lang.String r0 = "pojavexec"
            loadOptional(r0)
            java.lang.String r0 = "pojavexec_awt"
            loadOptional(r0)
            java.lang.String r0 = "exithook"
            loadOptional(r0)
            return
    }

    private JREUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native int chdir(java.lang.String r0);

    public static native boolean dlopen(java.lang.String r0);

    public static native void initializeGameExitHook();

    private static void loadOptional(java.lang.String r4) {
            java.lang.String r0 = "JREUtils"
            java.lang.String r1 = "Loaded native library: "
            java.lang.System.loadLibrary(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r1 = r2.append(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L18
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L18
            goto L2b
        L18:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not load native library: "
            r2.<init>(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r1)
        L2b:
            return
    }

    public static native void releaseBridgeWindow();

    public static native int[] renderAWTScreenFrame();

    public static native void setLdLibraryPath(java.lang.String r0);

    public static native void setupBridgeWindow(java.lang.Object r0);

    public static native void setupExitMethod(android.content.Context r0);
}
