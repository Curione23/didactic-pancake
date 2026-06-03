package net.sourceforge.prograde.generator;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/generator/PrintDeniedPermissions.class */
public final class PrintDeniedPermissions implements net.sourceforge.prograde.generator.DeniedPermissionListener {
    private final java.io.PrintStream printStream;
    private final boolean includeCodeSource;

    public PrintDeniedPermissions() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    public PrintDeniedPermissions(java.io.PrintStream r4, boolean r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            if (r1 != 0) goto Lf
            java.io.PrintStream r1 = java.lang.System.err
            goto L10
        Lf:
            r1 = r4
        L10:
            r0.printStream = r1
            r0 = r3
            r1 = r5
            r0.includeCodeSource = r1
            return
    }

    @Override // net.sourceforge.prograde.generator.DeniedPermissionListener
    public void permissionDenied(java.security.ProtectionDomain r5, java.security.Permission r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = ">> Denied permission "
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.getActions()
            if (r0 == 0) goto L4d
            r0 = r6
            java.lang.String r0 = r0.getActions()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            r0 = r7
            java.lang.String r1 = ", \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r1 = r1.getActions()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
        L4d:
            r0 = r7
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            boolean r0 = r0.includeCodeSource
            if (r0 == 0) goto L76
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "\n>>> CodeSource: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.security.CodeSource r2 = r2.getCodeSource()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
        L76:
            r0 = r4
            java.io.PrintStream r0 = r0.printStream
            r1 = r7
            r0.println(r1)
            return
    }

    @Override // net.sourceforge.prograde.generator.DeniedPermissionListener
    public void policyRefreshed() {
            r3 = this;
            r0 = r3
            java.io.PrintStream r0 = r0.printStream
            java.lang.String r1 = ">> Policy was refreshed."
            r0.println(r1)
            return
    }
}
