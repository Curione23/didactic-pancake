package net.sourceforge.prograde.debug;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/debug/ProGradePolicyDebugger.class */
public class ProGradePolicyDebugger {
    public ProGradePolicyDebugger() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void log(java.lang.String r4) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Policy: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
    }
}
