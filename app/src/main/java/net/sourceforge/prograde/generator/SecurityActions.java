package net.sourceforge.prograde.generator;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/generator/SecurityActions.class */
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
            net.sourceforge.prograde.generator.SecurityActions$1 r0 = new net.sourceforge.prograde.generator.SecurityActions$1
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

    static java.security.Policy getPolicy() {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            net.sourceforge.prograde.generator.SecurityActions$2 r0 = new net.sourceforge.prograde.generator.SecurityActions$2
            r1 = r0
            r1.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.security.Policy r0 = (java.security.Policy) r0
            return r0
        L16:
            java.security.Policy r0 = java.security.Policy.getPolicy()
            return r0
    }
}
