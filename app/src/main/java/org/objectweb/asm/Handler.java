package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Handler.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/Handler.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Handler.class */
class Handler {
    org.objectweb.asm.Label a;
    org.objectweb.asm.Label b;
    org.objectweb.asm.Label c;
    java.lang.String d;
    int e;
    org.objectweb.asm.Handler f;

    Handler() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static org.objectweb.asm.Handler a(org.objectweb.asm.Handler r5, org.objectweb.asm.Label r6, org.objectweb.asm.Label r7) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            r1 = r5
            org.objectweb.asm.Handler r1 = r1.f
            r2 = r6
            r3 = r7
            org.objectweb.asm.Handler r1 = a(r1, r2, r3)
            r0.f = r1
            r0 = r5
            org.objectweb.asm.Label r0 = r0.a
            int r0 = r0.c
            r8 = r0
            r0 = r5
            org.objectweb.asm.Label r0 = r0.b
            int r0 = r0.c
            r9 = r0
            r0 = r6
            int r0 = r0.c
            r10 = r0
            r0 = r7
            if (r0 != 0) goto L33
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L37
        L33:
            r0 = r7
            int r0 = r0.c
        L37:
            r11 = r0
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto Lb9
            r0 = r11
            r1 = r8
            if (r0 <= r1) goto Lb9
            r0 = r10
            r1 = r8
            if (r0 > r1) goto L63
            r0 = r11
            r1 = r9
            if (r0 < r1) goto L5b
            r0 = r5
            org.objectweb.asm.Handler r0 = r0.f
            r5 = r0
            goto Lb9
        L5b:
            r0 = r5
            r1 = r7
            r0.a = r1
            goto Lb9
        L63:
            r0 = r11
            r1 = r9
            if (r0 < r1) goto L72
            r0 = r5
            r1 = r6
            r0.b = r1
            goto Lb9
        L72:
            org.objectweb.asm.Handler r0 = new org.objectweb.asm.Handler
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = r7
            r0.a = r1
            r0 = r12
            r1 = r5
            org.objectweb.asm.Label r1 = r1.b
            r0.b = r1
            r0 = r12
            r1 = r5
            org.objectweb.asm.Label r1 = r1.c
            r0.c = r1
            r0 = r12
            r1 = r5
            java.lang.String r1 = r1.d
            r0.d = r1
            r0 = r12
            r1 = r5
            int r1 = r1.e
            r0.e = r1
            r0 = r12
            r1 = r5
            org.objectweb.asm.Handler r1 = r1.f
            r0.f = r1
            r0 = r5
            r1 = r6
            r0.b = r1
            r0 = r5
            r1 = r12
            r0.f = r1
        Lb9:
            r0 = r5
            return r0
    }
}
