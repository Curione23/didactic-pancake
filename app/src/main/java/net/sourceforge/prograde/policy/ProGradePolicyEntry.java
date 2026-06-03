package net.sourceforge.prograde.policy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policy/ProGradePolicyEntry.class */
public class ProGradePolicyEntry {
    private java.security.CodeSource codeSource;
    private java.util.List<net.sourceforge.prograde.policy.ProGradePrincipal> principals;
    private java.security.Permissions permissions;
    private boolean neverImplies;
    private boolean debug;
    private boolean grant;

    public ProGradePolicyEntry(boolean r5, boolean r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.neverImplies = r1
            r0 = r4
            r1 = 0
            r0.debug = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.principals = r1
            r0 = r4
            java.security.Permissions r1 = new java.security.Permissions
            r2 = r1
            r2.<init>()
            r0.permissions = r1
            r0 = r4
            r1 = r5
            r0.grant = r1
            r0 = r4
            r1 = r6
            r0.debug = r1
            return
    }

    public void setCodeSource(java.security.CodeSource r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.codeSource = r1
            return
    }

    public void addPrincipal(net.sourceforge.prograde.policy.ProGradePrincipal r4) {
            r3 = this;
            r0 = r3
            java.util.List<net.sourceforge.prograde.policy.ProGradePrincipal> r0 = r0.principals
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public void addPermission(java.security.Permission r4) {
            r3 = this;
            r0 = r3
            java.security.Permissions r0 = r0.permissions
            r1 = r4
            r0.add(r1)
            return
    }

    public void setNeverImplies(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.neverImplies = r1
            return
    }

    public boolean implies(java.security.ProtectionDomain r4, java.security.Permission r5) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.neverImplies
            if (r0 == 0) goto L15
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L13
            java.lang.String r0 = "This entry never imply anything."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L13:
            r0 = 0
            return r0
        L15:
            r0 = r3
            java.security.CodeSource r0 = r0.codeSource
            if (r0 == 0) goto L83
            r0 = r4
            java.security.CodeSource r0 = r0.getCodeSource()
            if (r0 == 0) goto L83
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L67
            java.lang.String r0 = "Evaluate codesource..."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "      Policy codesource: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.security.CodeSource r1 = r1.codeSource
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "      Active codesource: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.security.CodeSource r1 = r1.getCodeSource()
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L67:
            r0 = r3
            java.security.CodeSource r0 = r0.codeSource
            r1 = r4
            java.security.CodeSource r1 = r1.getCodeSource()
            boolean r0 = r0.implies(r1)
            if (r0 != 0) goto L83
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L81
            java.lang.String r0 = "Evaluation (codesource) failed."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L81:
            r0 = 0
            return r0
        L83:
            r0 = r3
            java.util.List<net.sourceforge.prograde.policy.ProGradePrincipal> r0 = r0.principals
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d7
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L9b
            java.lang.String r0 = "Evaluate principals..."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L9b:
            r0 = r4
            java.security.Principal[] r0 = r0.getPrincipals()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto La9
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto Lb7
        La9:
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "Evaluation (principals) failed. There is no active principals."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        Lb5:
            r0 = 0
            return r0
        Lb7:
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L140
            java.lang.String r0 = "Policy principals:"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            r0 = r3
            java.util.List<net.sourceforge.prograde.policy.ProGradePrincipal> r0 = r0.principals
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Lce:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L101
            r0 = r7
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policy.ProGradePrincipal r0 = (net.sourceforge.prograde.policy.ProGradePrincipal) r0
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "      "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto Lce
        L101:
            java.lang.String r0 = "Active principals:"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto L110
            java.lang.String r0 = "      none"
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L110:
            r0 = 0
            r7 = r0
        L113:
            r0 = r7
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L140
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "      "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            int r7 = r7 + 1
            goto L113
        L140:
            r0 = r3
            java.util.List<net.sourceforge.prograde.policy.ProGradePrincipal> r0 = r0.principals
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L14b:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1d7
            r0 = r7
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policy.ProGradePrincipal r0 = (net.sourceforge.prograde.policy.ProGradePrincipal) r0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        L167:
            r0 = r10
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L1c1
            r0 = r8
            boolean r0 = r0.hasWildcardClassName()
            if (r0 == 0) goto L17c
            r0 = 1
            r9 = r0
            goto L1c1
        L17c:
            r0 = r6
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1 = r8
            java.lang.String r1 = r1.getClassName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1bb
            r0 = r8
            boolean r0 = r0.hasWildcardPrincipal()
            if (r0 == 0) goto L1a3
            r0 = 1
            r9 = r0
            goto L1c1
        L1a3:
            r0 = r11
            java.lang.String r0 = r0.getName()
            r1 = r8
            java.lang.String r1 = r1.getPrincipalName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1bb
            r0 = 1
            r9 = r0
            goto L1c1
        L1bb:
            int r10 = r10 + 1
            goto L167
        L1c1:
            r0 = r9
            if (r0 != 0) goto L1d4
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L1d2
            java.lang.String r0 = "Evaluation (principals) failed."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L1d2:
            r0 = 0
            return r0
        L1d4:
            goto L14b
        L1d7:
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L237
            java.lang.String r0 = "Evaluation codesource/principals passed."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            r0 = r3
            boolean r0 = r0.grant
            if (r0 == 0) goto L1ef
            java.lang.String r0 = "granting"
            goto L1f1
        L1ef:
            java.lang.String r0 = "denying"
        L1f1:
            r6 = r0
            r0 = r3
            java.security.Permissions r0 = r0.permissions
            java.util.Enumeration r0 = r0.elements()
            r7 = r0
        L1fb:
            r0 = r7
            boolean r0 = r0.hasMoreElements()
            if (r0 == 0) goto L237
            r0 = r7
            java.lang.Object r0 = r0.nextElement()
            java.security.Permission r0 = (java.security.Permission) r0
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "      "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L1fb
        L237:
            r0 = r3
            java.security.Permissions r0 = r0.permissions
            r1 = r5
            boolean r0 = r0.implies(r1)
            r6 = r0
            r0 = r3
            boolean r0 = r0.debug
            if (r0 == 0) goto L258
            r0 = r6
            if (r0 == 0) goto L253
            java.lang.String r0 = "Needed permission found in this entry."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
            goto L258
        L253:
            java.lang.String r0 = "Needed permission wasn't found in this entry."
            net.sourceforge.prograde.debug.ProGradePolicyDebugger.log(r0)
        L258:
            r0 = r6
            return r0
    }
}
