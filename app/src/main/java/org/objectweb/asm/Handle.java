package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Handle.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/Handle.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Handle.class */
public final class Handle {
    final int a;
    final java.lang.String b;
    final java.lang.String c;
    final java.lang.String d;
    final boolean e;

    public Handle(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = 9
            if (r5 != r6) goto L10
            r5 = 1
            goto L11
        L10:
            r5 = 0
        L11:
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Handle(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.a = r1
            r0 = r3
            r1 = r5
            r0.b = r1
            r0 = r3
            r1 = r6
            r0.c = r1
            r0 = r3
            r1 = r7
            r0.d = r1
            r0 = r3
            r1 = r8
            r0.e = r1
            return
    }

    public int getTag() {
            r2 = this;
            r0 = r2
            int r0 = r0.a
            return r0
    }

    public java.lang.String getOwner() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.b
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.c
            return r0
    }

    public java.lang.String getDesc() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.d
            return r0
    }

    public boolean isInterface() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.e
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            boolean r0 = r0 instanceof org.objectweb.asm.Handle
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r4
            org.objectweb.asm.Handle r0 = (org.objectweb.asm.Handle) r0
            r5 = r0
            r0 = r3
            int r0 = r0.a
            r1 = r5
            int r1 = r1.a
            if (r0 != r1) goto L59
            r0 = r3
            boolean r0 = r0.e
            r1 = r5
            boolean r1 = r1.e
            if (r0 != r1) goto L59
            r0 = r3
            java.lang.String r0 = r0.b
            r1 = r5
            java.lang.String r1 = r1.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = r3
            java.lang.String r0 = r0.c
            r1 = r5
            java.lang.String r1 = r1.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = r3
            java.lang.String r0 = r0.d
            r1 = r5
            java.lang.String r1 = r1.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = r4
            int r0 = r0.a
            r1 = r4
            boolean r1 = r1.e
            if (r1 == 0) goto L10
            r1 = 64
            goto L11
        L10:
            r1 = 0
        L11:
            int r0 = r0 + r1
            r1 = r4
            java.lang.String r1 = r1.b
            int r1 = r1.hashCode()
            r2 = r4
            java.lang.String r2 = r2.c
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            r2 = r4
            java.lang.String r2 = r2.d
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.b
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 46
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.c
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.d
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = " ("
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.a
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            boolean r1 = r1.e
            if (r1 == 0) goto L39
            java.lang.String r1 = " itf"
            goto L3b
        L39:
            java.lang.String r1 = ""
        L3b:
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
