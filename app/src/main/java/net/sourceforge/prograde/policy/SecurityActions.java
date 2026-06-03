package net.sourceforge.prograde.policy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policy/SecurityActions.class */
class SecurityActions {



    SecurityActions() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.lang.String getSystemProperty(java.lang.String r4) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L17
            net.sourceforge.prograde.policy.SecurityActions$1 r0 = new net.sourceforge.prograde.policy.SecurityActions$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L17:
            r0 = r4
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }

    static java.lang.String getSecurityProperty(java.lang.String r4) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L17
            net.sourceforge.prograde.policy.SecurityActions$2 r0 = new net.sourceforge.prograde.policy.SecurityActions$2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L17:
            r0 = r4
            java.lang.String r0 = java.security.Security.getProperty(r0)
            return r0
    }
}
