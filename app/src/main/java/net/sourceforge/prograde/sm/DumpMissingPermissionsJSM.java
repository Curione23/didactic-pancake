package net.sourceforge.prograde.sm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/sm/DumpMissingPermissionsJSM.class */
public class DumpMissingPermissionsJSM extends java.lang.SecurityManager {
    public DumpMissingPermissionsJSM() {
            r6 = this;
            r0 = r6
            r0.<init>()
            net.sourceforge.prograde.generator.NotifyAndAllowPolicy r0 = new net.sourceforge.prograde.generator.NotifyAndAllowPolicy
            r1 = r0
            r2 = 0
            net.sourceforge.prograde.generator.PrintDeniedPermissions r3 = new net.sourceforge.prograde.generator.PrintDeniedPermissions
            r4 = r3
            r4.<init>()
            r1.<init>(r2, r3)
            java.security.Policy.setPolicy(r0)
            return
    }
}
