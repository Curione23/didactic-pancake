package net.sourceforge.prograde.type;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/type/Priority.class */
public enum Priority extends java.lang.Enum<net.sourceforge.prograde.type.Priority> {
    public static final net.sourceforge.prograde.type.Priority GRANT = null;
    public static final net.sourceforge.prograde.type.Priority DENY = null;
    public static final net.sourceforge.prograde.type.Priority DEFAULT = null;
    private static final /* synthetic */ net.sourceforge.prograde.type.Priority[] $VALUES = null;

    public static net.sourceforge.prograde.type.Priority[] values() {
            net.sourceforge.prograde.type.Priority[] r0 = net.sourceforge.prograde.type.Priority.$VALUES
            java.lang.Object r0 = r0.clone()
            net.sourceforge.prograde.type.Priority[] r0 = (net.sourceforge.prograde.type.Priority[]) r0
            return r0
    }

    public static net.sourceforge.prograde.type.Priority valueOf(java.lang.String r3) {
            java.lang.Class<net.sourceforge.prograde.type.Priority> r0 = net.sourceforge.prograde.type.Priority.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            net.sourceforge.prograde.type.Priority r0 = (net.sourceforge.prograde.type.Priority) r0
            return r0
    }

    Priority(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.name()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
    }

    static {
            net.sourceforge.prograde.type.Priority r0 = new net.sourceforge.prograde.type.Priority
            r1 = r0
            java.lang.String r2 = "GRANT"
            r3 = 0
            r1.<init>(r2, r3)
            net.sourceforge.prograde.type.Priority.GRANT = r0
            net.sourceforge.prograde.type.Priority r0 = new net.sourceforge.prograde.type.Priority
            r1 = r0
            java.lang.String r2 = "DENY"
            r3 = 1
            r1.<init>(r2, r3)
            net.sourceforge.prograde.type.Priority.DENY = r0
            r0 = 2
            net.sourceforge.prograde.type.Priority[] r0 = new net.sourceforge.prograde.type.Priority[r0]
            r1 = r0
            r2 = 0
            net.sourceforge.prograde.type.Priority r3 = net.sourceforge.prograde.type.Priority.GRANT
            r1[r2] = r3
            r1 = r0
            r2 = 1
            net.sourceforge.prograde.type.Priority r3 = net.sourceforge.prograde.type.Priority.DENY
            r1[r2] = r3
            net.sourceforge.prograde.type.Priority.$VALUES = r0
            net.sourceforge.prograde.type.Priority r0 = net.sourceforge.prograde.type.Priority.DENY
            net.sourceforge.prograde.type.Priority.DEFAULT = r0
            return
    }
}
