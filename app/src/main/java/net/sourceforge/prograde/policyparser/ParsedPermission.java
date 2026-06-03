package net.sourceforge.prograde.policyparser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/policyparser/ParsedPermission.class */
public class ParsedPermission {
    private java.lang.String permissionType;
    private java.lang.String permissionName;
    private java.lang.String actions;
    private java.lang.String signedBy;

    public ParsedPermission() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.String getPermissionType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.permissionType
            return r0
    }

    public void setPermissionType(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.permissionType = r1
            return
    }

    public java.lang.String getPermissionName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.permissionName
            return r0
    }

    public void setPermissionName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.permissionName = r1
            return
    }

    public java.lang.String getActions() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.actions
            return r0
    }

    public void setActions(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.actions = r1
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

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = ""
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.permissionType
            if (r0 != 0) goto Lf
            java.lang.String r0 = "undefined"
            goto L13
        Lf:
            r0 = r3
            java.lang.String r0 = r0.permissionType
        L13:
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "( \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.permissionName
            if (r0 == 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.permissionName
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.actions
            if (r0 == 0) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.actions
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
        L7f:
            r0 = r3
            java.lang.String r0 = r0.signedBy
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.signedBy
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
        La6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " )\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r4
            return r0
    }
}
