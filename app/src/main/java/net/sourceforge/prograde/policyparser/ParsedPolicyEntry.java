package net.sourceforge.prograde.policyparser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policyparser/ParsedPolicyEntry.class */
public class ParsedPolicyEntry {
    private java.lang.String codebase;
    private java.lang.String signedBy;
    private java.util.List<net.sourceforge.prograde.policyparser.ParsedPrincipal> principals;
    private java.util.List<net.sourceforge.prograde.policyparser.ParsedPermission> permissions;

    public ParsedPolicyEntry() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.principals = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.permissions = r1
            return
    }

    public java.lang.String getCodebase() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.codebase
            return r0
    }

    public void setCodebase(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.codebase = r1
            return
    }

    public java.lang.String getSignedBy() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.signedBy
            return r0
    }

    public void setSignedBy(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.signedBy = r1
            return
    }

    public java.util.List<net.sourceforge.prograde.policyparser.ParsedPrincipal> getPrincipals() {
            r2 = this;
            r0 = r2
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPrincipal> r0 = r0.principals
            return r0
    }

    public void addPrincipal(net.sourceforge.prograde.policyparser.ParsedPrincipal r4) {
            r3 = this;
            r0 = r3
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPrincipal> r0 = r0.principals
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public java.util.List<net.sourceforge.prograde.policyparser.ParsedPermission> getPermissions() {
            r2 = this;
            r0 = r2
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPermission> r0 = r0.permissions
            return r0
    }

    public void addPermission(net.sourceforge.prograde.policyparser.ParsedPermission r4) {
            r3 = this;
            r0 = r3
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPermission> r0 = r0.permissions
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = ""
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.codebase
            if (r0 != 0) goto Lf
            java.lang.String r0 = "undefined"
            goto L13
        Lf:
            r0 = r3
            java.lang.String r0 = r0.codebase
        L13:
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.signedBy
            if (r0 != 0) goto L20
            java.lang.String r0 = "undefined"
            goto L24
        L20:
            r0 = r3
            java.lang.String r0 = r0.signedBy
        L24:
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "Codebase: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Signed By: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Principals: { "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = 0
            r7 = r0
            r0 = r3
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPrincipal> r0 = r0.principals
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L59:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La5
            r0 = r8
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPrincipal r0 = (net.sourceforge.prograde.policyparser.ParsedPrincipal) r0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L88
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
        L88:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            int r7 = r7 + 1
            goto L59
        La5:
            r0 = r3
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPrincipal> r0 = r0.principals
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "undefined"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
        Lc5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " }\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "permissions: \n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r3
            java.util.List<net.sourceforge.prograde.policyparser.ParsedPermission> r0 = r0.permissions
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        Lf8:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L12d
            r0 = r8
            java.lang.Object r0 = r0.next()
            net.sourceforge.prograde.policyparser.ParsedPermission r0 = (net.sourceforge.prograde.policyparser.ParsedPermission) r0
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "  "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            goto Lf8
        L12d:
            r0 = r4
            return r0
    }
}
