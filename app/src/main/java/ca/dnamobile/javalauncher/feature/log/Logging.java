package ca.dnamobile.javalauncher.feature.log;

/* JADX INFO: loaded from: classes.dex */
public final class Logging {
    private static final java.lang.String DEFAULT_TAG = "JavaLauncher";

    private Logging() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            android.util.Log.e(r0, r1)
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            android.util.Log.e(r0, r1, r2)
            return
    }

    public static void e(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "JavaLauncher"
            android.util.Log.e(r0, r1, r2)
            return
    }

    public static void i(java.lang.String r1) {
            java.lang.String r0 = "JavaLauncher"
            android.util.Log.i(r0, r1)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1) {
            android.util.Log.i(r0, r1)
            return
    }
}
