package net.sourceforge.prograde.policy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policy/ProGradePrincipal.class */
public class ProGradePrincipal {
    private java.lang.String className;
    private java.lang.String principalName;
    private boolean wildcardClassName;
    private boolean wildcardPrincipal;

    public ProGradePrincipal() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public ProGradePrincipal(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.className = r1
            r0 = r3
            r1 = r5
            r0.principalName = r1
            r0 = r3
            r1 = r6
            r0.wildcardClassName = r1
            r0 = r3
            r1 = r7
            r0.wildcardPrincipal = r1
            return
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.className
            return r0
    }

    public java.lang.String getPrincipalName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.principalName
            return r0
    }

    public boolean hasWildcardClassName() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.wildcardClassName
            return r0
    }

    public boolean hasWildcardPrincipal() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.wildcardPrincipal
            return r0
    }

    public void setClassName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.className = r1
            return
    }

    public void setPrincipalName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.principalName = r1
            return
    }

    public void setWildcardClassName(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.wildcardClassName = r1
            return
    }

    public void setWildcardPrincipal(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.wildcardPrincipal = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = ""
            r4 = r0
            r0 = r3
            boolean r0 = r0.wildcardClassName
            if (r0 == 0) goto Lf
            java.lang.String r0 = "*"
            goto L13
        Lf:
            r0 = r3
            java.lang.String r0 = r0.className
        L13:
            r5 = r0
            r0 = r3
            boolean r0 = r0.wildcardPrincipal
            if (r0 == 0) goto L20
            java.lang.String r0 = "*"
            goto L24
        L20:
            r0 = r3
            java.lang.String r0 = r0.principalName
        L24:
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r4
            return r0
    }
}
