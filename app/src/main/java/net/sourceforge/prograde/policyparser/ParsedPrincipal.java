package net.sourceforge.prograde.policyparser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policyparser/ParsedPrincipal.class */
public class ParsedPrincipal {
    private java.lang.String principalClass;
    private java.lang.String principalName;
    private java.lang.String alias;
    private boolean classWildcard;
    private boolean nameWildcard;
    private boolean isAlias;

    public ParsedPrincipal(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            java.lang.String r1 = ""
            r0.principalClass = r1
            r0 = r3
            java.lang.String r1 = ""
            r0.principalName = r1
            r0 = r3
            java.lang.String r1 = ""
            r0.alias = r1
            r0 = r3
            r1 = 0
            r0.classWildcard = r1
            r0 = r3
            r1 = 0
            r0.nameWildcard = r1
            r0 = r3
            r1 = 0
            r0.isAlias = r1
            r0 = r3
            r1 = r4
            r0.alias = r1
            r0 = r3
            r1 = 1
            r0.isAlias = r1
            return
    }

    public ParsedPrincipal(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            java.lang.String r1 = ""
            r0.principalClass = r1
            r0 = r3
            java.lang.String r1 = ""
            r0.principalName = r1
            r0 = r3
            java.lang.String r1 = ""
            r0.alias = r1
            r0 = r3
            r1 = 0
            r0.classWildcard = r1
            r0 = r3
            r1 = 0
            r0.nameWildcard = r1
            r0 = r3
            r1 = 0
            r0.isAlias = r1
            r0 = r4
            if (r0 == 0) goto L31
            r0 = r3
            r1 = r4
            r0.principalClass = r1
            goto L36
        L31:
            r0 = r3
            r1 = 1
            r0.classWildcard = r1
        L36:
            r0 = r5
            if (r0 == 0) goto L42
            r0 = r3
            r1 = r5
            r0.principalName = r1
            goto L47
        L42:
            r0 = r3
            r1 = 1
            r0.nameWildcard = r1
        L47:
            return
    }

    public java.lang.String getPrincipalClass() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.principalClass
            return r0
    }

    public java.lang.String getPrincipalName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.principalName
            return r0
    }

    public java.lang.String getAlias() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.alias
            return r0
    }

    public boolean hasAlias() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isAlias
            return r0
    }

    public boolean hasClassWildcard() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.classWildcard
            return r0
    }

    public boolean hasNameWildcard() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.nameWildcard
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = ""
            r4 = r0
            r0 = r3
            boolean r0 = r0.classWildcard
            if (r0 == 0) goto Lf
            java.lang.String r0 = "*"
            goto L13
        Lf:
            r0 = r3
            java.lang.String r0 = r0.principalClass
        L13:
            r5 = r0
            r0 = r3
            boolean r0 = r0.nameWildcard
            if (r0 == 0) goto L20
            java.lang.String r0 = "*"
            goto L24
        L20:
            r0 = r3
            java.lang.String r0 = r0.principalName
        L24:
            r6 = r0
            r0 = r3
            boolean r0 = r0.isAlias
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.alias
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            goto L6b
        L4f:
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
        L6b:
            r0 = r4
            return r0
    }
}
