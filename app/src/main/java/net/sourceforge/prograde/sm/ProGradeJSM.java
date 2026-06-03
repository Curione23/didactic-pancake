package net.sourceforge.prograde.sm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/sm/ProGradeJSM.class */
public class ProGradeJSM extends java.lang.SecurityManager {
    public ProGradeJSM() {
            r3 = this;
            r0 = r3
            r0.<init>()
            net.sourceforge.prograde.policy.ProGradePolicy r0 = new net.sourceforge.prograde.policy.ProGradePolicy
            r1 = r0
            r1.<init>()
            java.security.Policy.setPolicy(r0)
            return
    }
}
