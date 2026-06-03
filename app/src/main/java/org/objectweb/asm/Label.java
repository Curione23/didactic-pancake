package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Label.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/Label.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Label.class */
public class Label {
    public java.lang.Object info;
    int a;
    int b;
    int c;
    private int d;
    private int[] e;
    int f;
    int g;
    org.objectweb.asm.Frame h;
    org.objectweb.asm.Label i;
    org.objectweb.asm.Edge j;
    org.objectweb.asm.Label k;

    public Label() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public int getOffset() {
            r4 = this;
            r0 = r4
            int r0 = r0.a
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Label offset position has not been resolved yet"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r4
            int r0 = r0.c
            return r0
    }

    void a(org.objectweb.asm.MethodWriter r5, org.objectweb.asm.ByteVector r6, int r7, boolean r8) {
            r4 = this;
            r0 = r4
            int r0 = r0.a
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L34
            r0 = r8
            if (r0 == 0) goto L22
            r0 = r4
            r1 = -1
            r2 = r7
            int r1 = r1 - r2
            r2 = r6
            int r2 = r2.b
            r0.a(r1, r2)
            r0 = r6
            r1 = -1
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            goto L52
        L22:
            r0 = r4
            r1 = r7
            r2 = r6
            int r2 = r2.b
            r0.a(r1, r2)
            r0 = r6
            r1 = -1
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L52
        L34:
            r0 = r8
            if (r0 == 0) goto L47
            r0 = r6
            r1 = r4
            int r1 = r1.c
            r2 = r7
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            goto L52
        L47:
            r0 = r6
            r1 = r4
            int r1 = r1.c
            r2 = r7
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L52:
            return
    }

    private void a(int r7, int r8) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.e
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = 6
            int[] r1 = new int[r1]
            r0.e = r1
        Lf:
            r0 = r6
            int r0 = r0.d
            r1 = r6
            int[] r1 = r1.e
            int r1 = r1.length
            if (r0 < r1) goto L3a
            r0 = r6
            int[] r0 = r0.e
            int r0 = r0.length
            r1 = 6
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r9 = r0
            r0 = r6
            int[] r0 = r0.e
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r6
            int[] r4 = r4.e
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.e = r1
        L3a:
            r0 = r6
            int[] r0 = r0.e
            r1 = r6
            r2 = r1
            int r2 = r2.d
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.d = r3
            r2 = r7
            r0[r1] = r2
            r0 = r6
            int[] r0 = r0.e
            r1 = r6
            r2 = r1
            int r2 = r2.d
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.d = r3
            r2 = r8
            r0[r1] = r2
            return
    }

    boolean a(org.objectweb.asm.MethodWriter r6, int r7, byte[] r8) {
            r5 = this;
            r0 = 0
            r9 = r0
            r0 = r5
            r1 = r0
            int r1 = r1.a
            r2 = 2
            r1 = r1 | r2
            r0.a = r1
            r0 = r5
            r1 = r7
            r0.c = r1
            r0 = 0
            r10 = r0
        L15:
            r0 = r10
            r1 = r5
            int r1 = r1.d
            if (r0 >= r1) goto Ld3
            r0 = r5
            int[] r0 = r0.e
            r1 = r10
            int r10 = r10 + 1
            r0 = r0[r1]
            r11 = r0
            r0 = r5
            int[] r0 = r0.e
            r1 = r10
            int r10 = r10 + 1
            r0 = r0[r1]
            r12 = r0
            r0 = r11
            if (r0 < 0) goto L9a
            r0 = r7
            r1 = r11
            int r0 = r0 - r1
            r13 = r0
            r0 = r13
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto L51
            r0 = r13
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r1) goto L83
        L51:
            r0 = r8
            r1 = r12
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r14 = r0
            r0 = r14
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 > r1) goto L74
            r0 = r8
            r1 = r12
            r2 = 1
            int r1 = r1 - r2
            r2 = r14
            r3 = 49
            int r2 = r2 + r3
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L80
        L74:
            r0 = r8
            r1 = r12
            r2 = 1
            int r1 = r1 - r2
            r2 = r14
            r3 = 20
            int r2 = r2 + r3
            byte r2 = (byte) r2
            r0[r1] = r2
        L80:
            r0 = 1
            r9 = r0
        L83:
            r0 = r8
            r1 = r12
            int r12 = r12 + 1
            r2 = r13
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r12
            r2 = r13
            byte r2 = (byte) r2
            r0[r1] = r2
            goto Ld0
        L9a:
            r0 = r7
            r1 = r11
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 + r1
            r13 = r0
            r0 = r8
            r1 = r12
            int r12 = r12 + 1
            r2 = r13
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r12
            int r12 = r12 + 1
            r2 = r13
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r12
            int r12 = r12 + 1
            r2 = r13
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r12
            r2 = r13
            byte r2 = (byte) r2
            r0[r1] = r2
        Ld0:
            goto L15
        Ld3:
            r0 = r9
            return r0
    }

    org.objectweb.asm.Label a() {
            r2 = this;
            r0 = r2
            org.objectweb.asm.Frame r0 = r0.h
            if (r0 != 0) goto Lb
            r0 = r2
            goto L12
        Lb:
            r0 = r2
            org.objectweb.asm.Frame r0 = r0.h
            org.objectweb.asm.Label r0 = r0.b
        L12:
            return r0
    }

    boolean a(long r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.a
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L21
            r0 = r5
            int[] r0 = r0.e
            r1 = r6
            r2 = 32
            long r1 = r1 >>> r2
            int r1 = (int) r1
            r0 = r0[r1]
            r1 = r6
            int r1 = (int) r1
            r0 = r0 & r1
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
        L21:
            r0 = 0
            return r0
    }

    boolean a(org.objectweb.asm.Label r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.a
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L16
            r0 = r5
            int r0 = r0.a
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L18
        L16:
            r0 = 0
            return r0
        L18:
            r0 = 0
            r6 = r0
        L1a:
            r0 = r6
            r1 = r4
            int[] r1 = r1.e
            int r1 = r1.length
            if (r0 >= r1) goto L3b
            r0 = r4
            int[] r0 = r0.e
            r1 = r6
            r0 = r0[r1]
            r1 = r5
            int[] r1 = r1.e
            r2 = r6
            r1 = r1[r2]
            r0 = r0 & r1
            if (r0 == 0) goto L35
            r0 = 1
            return r0
        L35:
            int r6 = r6 + 1
            goto L1a
        L3b:
            r0 = 0
            return r0
    }

    void a(long r7, int r9) {
            r6 = this;
            r0 = r6
            int r0 = r0.a
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 != 0) goto L23
            r0 = r6
            r1 = r0
            int r1 = r1.a
            r2 = 1024(0x400, float:1.435E-42)
            r1 = r1 | r2
            r0.a = r1
            r0 = r6
            r1 = r9
            r2 = 32
            int r1 = r1 / r2
            r2 = 1
            int r1 = r1 + r2
            int[] r1 = new int[r1]
            r0.e = r1
        L23:
            r0 = r6
            int[] r0 = r0.e
            r1 = r7
            r2 = 32
            long r1 = r1 >>> r2
            int r1 = (int) r1
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r7
            int r3 = (int) r3
            r2 = r2 | r3
            r0[r1] = r2
            return
    }

    void b(org.objectweb.asm.Label r6, long r7, int r9) {
            r5 = this;
            r0 = r5
            r10 = r0
        L3:
            r0 = r10
            if (r0 == 0) goto Le3
            r0 = r10
            r11 = r0
            r0 = r11
            org.objectweb.asm.Label r0 = r0.k
            r10 = r0
            r0 = r11
            r1 = 0
            r0.k = r1
            r0 = r6
            if (r0 == 0) goto L81
            r0 = r11
            int r0 = r0.a
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            goto L3
        L2c:
            r0 = r11
            r1 = r0
            int r1 = r1.a
            r2 = 2048(0x800, float:2.87E-42)
            r1 = r1 | r2
            r0.a = r1
            r0 = r11
            int r0 = r0.a
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L95
            r0 = r11
            r1 = r6
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L95
            org.objectweb.asm.Edge r0 = new org.objectweb.asm.Edge
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = r11
            int r1 = r1.f
            r0.a = r1
            r0 = r12
            r1 = r6
            org.objectweb.asm.Edge r1 = r1.j
            org.objectweb.asm.Label r1 = r1.b
            r0.b = r1
            r0 = r12
            r1 = r11
            org.objectweb.asm.Edge r1 = r1.j
            r0.c = r1
            r0 = r11
            r1 = r12
            r0.j = r1
            goto L95
        L81:
            r0 = r11
            r1 = r7
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L8d
            goto L3
        L8d:
            r0 = r11
            r1 = r7
            r2 = r9
            r0.a(r1, r2)
        L95:
            r0 = r11
            org.objectweb.asm.Edge r0 = r0.j
            r12 = r0
        L9c:
            r0 = r12
            if (r0 == 0) goto Le0
            r0 = r11
            int r0 = r0.a
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lba
            r0 = r12
            r1 = r11
            org.objectweb.asm.Edge r1 = r1.j
            org.objectweb.asm.Edge r1 = r1.c
            if (r0 == r1) goto Ld6
        Lba:
            r0 = r12
            org.objectweb.asm.Label r0 = r0.b
            org.objectweb.asm.Label r0 = r0.k
            if (r0 != 0) goto Ld6
            r0 = r12
            org.objectweb.asm.Label r0 = r0.b
            r1 = r10
            r0.k = r1
            r0 = r12
            org.objectweb.asm.Label r0 = r0.b
            r10 = r0
        Ld6:
            r0 = r12
            org.objectweb.asm.Edge r0 = r0.c
            r12 = r0
            goto L9c
        Le0:
            goto L3
        Le3:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "L"
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = r3
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
