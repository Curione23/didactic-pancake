package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class NativeLauncherBridge {
    static {
            java.lang.String r0 = "javalauncher_native"
            java.lang.System.loadLibrary(r0)
            return
    }

    private NativeLauncherBridge() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int launchJvm(ca.dnamobile.javalauncher.launcher.LaunchPlan r6) {
            java.io.File r0 = r6.getJavaBinary()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = r6.getMainClass()
            java.io.File r2 = r6.getGameDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            java.util.List r3 = r6.getJvmArgs()
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.List r6 = r6.getGameArgs()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r6 = r6.toArray(r4)
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r6 = nativeLaunchJvm(r0, r1, r2, r3, r6)
            return r6
    }

    private static native int nativeLaunchJvm(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String[] r3, java.lang.String[] r4);
}
