package com.nide8.login2.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/util/Logging.class */
public final class Logging {
    public static void info(java.lang.String r5, java.lang.Object... r6) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[统一通行证] "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            r3 = r6
            java.lang.String r2 = java.text.MessageFormat.format(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
    }

    public static void error(java.lang.String r5, java.lang.Object... r6) {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[统一通行证] "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            r3 = r6
            java.lang.String r2 = java.text.MessageFormat.format(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
    }

    public static void debug(java.lang.String r3, java.lang.Object... r4) {
            boolean r0 = com.nide8.login2.Nide8Auth.isDebug
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = r4
            info(r0, r1)
        Lb:
            return
    }

    private Logging() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
