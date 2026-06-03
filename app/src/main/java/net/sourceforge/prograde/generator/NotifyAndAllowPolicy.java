package net.sourceforge.prograde.generator;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/generator/NotifyAndAllowPolicy.class */
public final class NotifyAndAllowPolicy extends java.security.Policy {
    public static final java.lang.String PROGRADE_USE_OWN_POLICY = "prograde.use.own.policy";
    private final java.security.Policy wrappedPolicy;
    private final net.sourceforge.prograde.generator.DeniedPermissionListener listener;

    public NotifyAndAllowPolicy() {
            r4 = this;
            r0 = r4
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public NotifyAndAllowPolicy(java.security.Policy r5, net.sourceforge.prograde.generator.DeniedPermissionListener r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 == 0) goto L10
            r0 = r4
            r1 = r5
            r0.wrappedPolicy = r1
            goto L30
        L10:
            java.lang.String r0 = "prograde.use.own.policy"
            java.lang.String r0 = net.sourceforge.prograde.generator.SecurityActions.getSystemProperty(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L29
            r0 = r4
            net.sourceforge.prograde.policy.ProGradePolicy r1 = new net.sourceforge.prograde.policy.ProGradePolicy
            r2 = r1
            r2.<init>()
            r0.wrappedPolicy = r1
            goto L30
        L29:
            r0 = r4
            java.security.Policy r1 = net.sourceforge.prograde.generator.SecurityActions.getPolicy()
            r0.wrappedPolicy = r1
        L30:
            r0 = r4
            r1 = r6
            if (r1 == 0) goto L39
            r1 = r6
            goto L40
        L39:
            net.sourceforge.prograde.generator.PrintDeniedPermissions r1 = new net.sourceforge.prograde.generator.PrintDeniedPermissions
            r2 = r1
            r2.<init>()
        L40:
            r0.listener = r1
            return
    }

    @Override // java.security.Policy
    public final boolean implies(java.security.ProtectionDomain r5, java.security.Permission r6) {
            r4 = this;
            r0 = r6
            boolean r0 = r0 instanceof java.security.AllPermission
            if (r0 == 0) goto L1c
            r0 = r4
            java.security.Policy r0 = r0.wrappedPolicy
            if (r0 == 0) goto L1a
            r0 = r4
            java.security.Policy r0 = r0.wrappedPolicy
            r1 = r5
            r2 = r6
            boolean r0 = r0.implies(r1, r2)
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
        L1c:
            r0 = r4
            java.security.Policy r0 = r0.wrappedPolicy
            if (r0 == 0) goto L2f
            r0 = r4
            java.security.Policy r0 = r0.wrappedPolicy
            r1 = r5
            r2 = r6
            boolean r0 = r0.implies(r1, r2)
            if (r0 != 0) goto L42
        L2f:
            r0 = r4
            net.sourceforge.prograde.generator.DeniedPermissionListener r0 = r0.listener     // Catch: java.lang.Throwable -> L3d
            r1 = r5
            r2 = r6
            r0.permissionDenied(r1, r2)     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r7 = move-exception
            r0 = r7
            r0.printStackTrace()
        L42:
            r0 = 1
            return r0
    }

    @Override // java.security.Policy
    public final void refresh() {
            r2 = this;
            r0 = r2
            java.security.Policy r0 = r0.wrappedPolicy
            if (r0 == 0) goto Le
            r0 = r2
            java.security.Policy r0 = r0.wrappedPolicy
            r0.refresh()
        Le:
            r0 = r2
            net.sourceforge.prograde.generator.DeniedPermissionListener r0 = r0.listener     // Catch: java.lang.Throwable -> L1a
            r0.policyRefreshed()     // Catch: java.lang.Throwable -> L1a
            goto L1f
        L1a:
            r3 = move-exception
            r0 = r3
            r0.printStackTrace()
        L1f:
            return
    }
}
