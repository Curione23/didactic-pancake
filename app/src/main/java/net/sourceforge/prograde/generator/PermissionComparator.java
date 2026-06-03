package net.sourceforge.prograde.generator;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/generator/PermissionComparator.class */
public class PermissionComparator implements java.util.Comparator<java.security.Permission> {
    public PermissionComparator() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(java.security.Permission r4, java.security.Permission r5) {
            r3 = this;
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1 = r5
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareTo(r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L18
            r0 = r6
            return r0
        L18:
            r0 = r4
            java.lang.String r0 = r0.getName()
            r1 = r5
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareTo(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2d
            r0 = r7
            return r0
        L2d:
            r0 = r4
            java.lang.String r0 = r0.getActions()
            r1 = r5
            java.lang.String r1 = r1.getActions()
            int r0 = r0.compareTo(r1)
            return r0
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(java.security.Permission r5, java.security.Permission r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.security.Permission r1 = (java.security.Permission) r1
            r2 = r6
            java.security.Permission r2 = (java.security.Permission) r2
            int r0 = r0.compare2(r1, r2)
            return r0
    }
}
