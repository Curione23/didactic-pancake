package com.movtery.optifine_renamer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:com/movtery/optifine_renamer/Print.class */
public class Print {
    private static final java.lang.String NAME = "OptiFineRenamer";

    public Print() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void printLog(java.lang.String r8) {
            java.io.PrintStream r0 = java.lang.System.out
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "%s: %s%n"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "OptiFineRenamer"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = r8
            r4[r5] = r6
            java.io.PrintStream r0 = r0.printf(r1, r2, r3)
            return
    }
}
