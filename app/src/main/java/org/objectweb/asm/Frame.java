package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Frame.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/Frame.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Frame.class */
final class Frame {
    static final int[] a = null;
    org.objectweb.asm.Label b;
    int[] c;
    int[] d;
    private int[] e;
    private int[] f;
    private int g;
    private int h;
    private int[] i;

    Frame() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private int a(int r6) {
            r5 = this;
            r0 = r5
            int[] r0 = r0.e
            if (r0 == 0) goto L10
            r0 = r6
            r1 = r5
            int[] r1 = r1.e
            int r1 = r1.length
            if (r0 < r1) goto L15
        L10:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r6
            r0 = r0 | r1
            return r0
        L15:
            r0 = r5
            int[] r0 = r0.e
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2c
            r0 = r5
            int[] r0 = r0.e
            r1 = r6
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r6
            r2 = r2 | r3
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            r7 = r0
        L2c:
            r0 = r7
            return r0
    }

    private void a(int r7, int r8) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.e
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = 10
            int[] r1 = new int[r1]
            r0.e = r1
        Lf:
            r0 = r6
            int[] r0 = r0.e
            int r0 = r0.length
            r9 = r0
            r0 = r7
            r1 = r9
            if (r0 < r1) goto L39
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r9
            int r1 = r1 * r2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r10 = r0
            r0 = r6
            int[] r0 = r0.e
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r10
            r0.e = r1
        L39:
            r0 = r6
            int[] r0 = r0.e
            r1 = r7
            r2 = r8
            r0[r1] = r2
            return
    }

    private void b(int r7) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.f
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = 10
            int[] r1 = new int[r1]
            r0.f = r1
        Lf:
            r0 = r6
            int[] r0 = r0.f
            int r0 = r0.length
            r8 = r0
            r0 = r6
            int r0 = r0.g
            r1 = r8
            if (r0 < r1) goto L3c
            r0 = r6
            int r0 = r0.g
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r8
            int r1 = r1 * r2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r9 = r0
            r0 = r6
            int[] r0 = r0.f
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.f = r1
        L3c:
            r0 = r6
            int[] r0 = r0.f
            r1 = r6
            r2 = r1
            int r2 = r2.g
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.g = r3
            r2 = r7
            r0[r1] = r2
            r0 = r6
            org.objectweb.asm.Label r0 = r0.b
            int r0 = r0.f
            r1 = r6
            int r1 = r1.g
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r6
            org.objectweb.asm.Label r1 = r1.b
            int r1 = r1.g
            if (r0 <= r1) goto L6d
            r0 = r6
            org.objectweb.asm.Label r0 = r0.b
            r1 = r9
            r0.g = r1
        L6d:
            return
    }

    private void a(org.objectweb.asm.ClassWriter r4, java.lang.String r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            int r0 = b(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L21
            r0 = r3
            r1 = r6
            r0.b(r1)
            r0 = r6
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto L1b
            r0 = r6
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto L21
        L1b:
            r0 = r3
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
        L21:
            return
    }

    private static int b(org.objectweb.asm.ClassWriter r5, java.lang.String r6) {
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 != r1) goto L15
            r0 = r6
            r1 = 41
            int r0 = r0.indexOf(r1)
            r1 = 1
            int r0 = r0 + r1
            goto L16
        L15:
            r0 = 0
        L16:
            r8 = r0
            r0 = r6
            r1 = r8
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto L92;
                case 67: goto L92;
                case 68: goto L9b;
                case 69: goto Lb5;
                case 70: goto L95;
                case 71: goto Lb5;
                case 72: goto Lb5;
                case 73: goto L92;
                case 74: goto L98;
                case 75: goto Lb5;
                case 76: goto L9e;
                case 77: goto Lb5;
                case 78: goto Lb5;
                case 79: goto Lb5;
                case 80: goto Lb5;
                case 81: goto Lb5;
                case 82: goto Lb5;
                case 83: goto L92;
                case 84: goto Lb5;
                case 85: goto Lb5;
                case 86: goto L90;
                case 87: goto Lb5;
                case 88: goto Lb5;
                case 89: goto Lb5;
                case 90: goto L92;
                default: goto Lb5;
            }
        L90:
            r0 = 0
            return r0
        L92:
            r0 = 16777217(0x1000001, float:2.350989E-38)
            return r0
        L95:
            r0 = 16777218(0x1000002, float:2.3509893E-38)
            return r0
        L98:
            r0 = 16777220(0x1000004, float:2.3509898E-38)
            return r0
        L9b:
            r0 = 16777219(0x1000003, float:2.3509895E-38)
            return r0
        L9e:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r7 = r0
            r0 = 24117248(0x1700000, float:4.4081038E-38)
            r1 = r5
            r2 = r7
            int r1 = r1.m7563c(r2)
            r0 = r0 | r1
            return r0
        Lb5:
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
        Lba:
            r0 = r6
            r1 = r10
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto Lcb
            int r10 = r10 + 1
            goto Lba
        Lcb:
            r0 = r6
            r1 = r10
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto L152;
                case 67: goto L14b;
                case 68: goto L175;
                case 69: goto L17c;
                case 70: goto L167;
                case 71: goto L17c;
                case 72: goto L17c;
                case 73: goto L160;
                case 74: goto L16e;
                case 75: goto L17c;
                case 76: goto L17c;
                case 77: goto L17c;
                case 78: goto L17c;
                case 79: goto L17c;
                case 80: goto L17c;
                case 81: goto L17c;
                case 82: goto L17c;
                case 83: goto L159;
                case 84: goto L17c;
                case 85: goto L17c;
                case 86: goto L17c;
                case 87: goto L17c;
                case 88: goto L17c;
                case 89: goto L17c;
                case 90: goto L144;
                default: goto L17c;
            }
        L144:
            r0 = 16777225(0x1000009, float:2.3509912E-38)
            r9 = r0
            goto L195
        L14b:
            r0 = 16777227(0x100000b, float:2.3509918E-38)
            r9 = r0
            goto L195
        L152:
            r0 = 16777226(0x100000a, float:2.3509915E-38)
            r9 = r0
            goto L195
        L159:
            r0 = 16777228(0x100000c, float:2.350992E-38)
            r9 = r0
            goto L195
        L160:
            r0 = 16777217(0x1000001, float:2.350989E-38)
            r9 = r0
            goto L195
        L167:
            r0 = 16777218(0x1000002, float:2.3509893E-38)
            r9 = r0
            goto L195
        L16e:
            r0 = 16777220(0x1000004, float:2.3509898E-38)
            r9 = r0
            goto L195
        L175:
            r0 = 16777219(0x1000003, float:2.3509895E-38)
            r9 = r0
            goto L195
        L17c:
            r0 = r6
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r7 = r0
            r0 = 24117248(0x1700000, float:4.4081038E-38)
            r1 = r5
            r2 = r7
            int r1 = r1.m7563c(r2)
            r0 = r0 | r1
            r9 = r0
        L195:
            r0 = r10
            r1 = r8
            int r0 = r0 - r1
            r1 = 28
            int r0 = r0 << r1
            r1 = r9
            r0 = r0 | r1
            return r0
    }

    private int a() {
            r5 = this;
            r0 = r5
            int r0 = r0.g
            if (r0 <= 0) goto L18
            r0 = r5
            int[] r0 = r0.f
            r1 = r5
            r2 = r1
            int r2 = r2.g
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.g = r3
            r0 = r0[r1]
            return r0
        L18:
            r0 = 50331648(0x3000000, float:3.761582E-37)
            r1 = r5
            org.objectweb.asm.Label r1 = r1.b
            r2 = r1
            int r2 = r2.f
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.f = r3
            int r1 = -r1
            r0 = r0 | r1
            return r0
    }

    private void c(int r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.g
            r1 = r6
            if (r0 < r1) goto L15
            r0 = r5
            r1 = r0
            int r1 = r1.g
            r2 = r6
            int r1 = r1 - r2
            r0.g = r1
            goto L2c
        L15:
            r0 = r5
            org.objectweb.asm.Label r0 = r0.b
            r1 = r0
            int r1 = r1.f
            r2 = r6
            r3 = r5
            int r3 = r3.g
            int r2 = r2 - r3
            int r1 = r1 - r2
            r0.f = r1
            r0 = r5
            r1 = 0
            r0.g = r1
        L2c:
            return
    }

    private void a(java.lang.String r5) {
            r4 = this;
            r0 = r5
            r1 = 0
            char r0 = r0.charAt(r1)
            r6 = r0
            r0 = r6
            r1 = 40
            if (r0 != r1) goto L1b
            r0 = r4
            r1 = r5
            int r1 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r1)
            r2 = 2
            int r1 = r1 >> r2
            r2 = 1
            int r1 = r1 - r2
            r0.c(r1)
            goto L34
        L1b:
            r0 = r6
            r1 = 74
            if (r0 == r1) goto L27
            r0 = r6
            r1 = 68
            if (r0 != r1) goto L2f
        L27:
            r0 = r4
            r1 = 2
            r0.c(r1)
            goto L34
        L2f:
            r0 = r4
            r1 = 1
            r0.c(r1)
        L34:
            return
    }

    private void d(int r7) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.i
            if (r0 != 0) goto Le
            r0 = r6
            r1 = 2
            int[] r1 = new int[r1]
            r0.i = r1
        Le:
            r0 = r6
            int[] r0 = r0.i
            int r0 = r0.length
            r8 = r0
            r0 = r6
            int r0 = r0.h
            r1 = r8
            if (r0 < r1) goto L3b
            r0 = r6
            int r0 = r0.h
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r8
            int r1 = r1 * r2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r9 = r0
            r0 = r6
            int[] r0 = r0.i
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.i = r1
        L3b:
            r0 = r6
            int[] r0 = r0.i
            r1 = r6
            r2 = r1
            int r2 = r2.h
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.h = r3
            r2 = r7
            r0[r1] = r2
            return
    }

    private int a(org.objectweb.asm.ClassWriter r7, int r8) {
            r6 = this;
            r0 = r8
            r1 = 16777222(0x1000006, float:2.3509904E-38)
            if (r0 != r1) goto L15
            r0 = 24117248(0x1700000, float:4.4081038E-38)
            r1 = r7
            r2 = r7
            java.lang.String r2 = r2.I
            int r1 = r1.m7563c(r2)
            r0 = r0 | r1
            r9 = r0
            goto L3b
        L15:
            r0 = r8
            r1 = -1048576(0xfffffffffff00000, float:NaN)
            r0 = r0 & r1
            r1 = 25165824(0x1800000, float:4.7019774E-38)
            if (r0 != r1) goto L39
            r0 = r7
            org.objectweb.asm.Item[] r0 = r0.H
            r1 = r8
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            r0 = r0[r1]
            java.lang.String r0 = r0.g
            r10 = r0
            r0 = 24117248(0x1700000, float:4.4081038E-38)
            r1 = r7
            r2 = r10
            int r1 = r1.m7563c(r2)
            r0 = r0 | r1
            r9 = r0
            goto L3b
        L39:
            r0 = r8
            return r0
        L3b:
            r0 = 0
            r10 = r0
        L3e:
            r0 = r10
            r1 = r6
            int r1 = r1.h
            if (r0 >= r1) goto La1
            r0 = r6
            int[] r0 = r0.i
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            r12 = r0
            r0 = r11
            r1 = 251658240(0xf000000, float:6.3108872E-30)
            r0 = r0 & r1
            r13 = r0
            r0 = r13
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 != r1) goto L77
            r0 = r12
            r1 = r6
            int[] r1 = r1.c
            r2 = r11
            r3 = 8388607(0x7fffff, float:1.1754942E-38)
            r2 = r2 & r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r11 = r0
            goto L93
        L77:
            r0 = r13
            r1 = 50331648(0x3000000, float:3.761582E-37)
            if (r0 != r1) goto L93
            r0 = r12
            r1 = r6
            int[] r1 = r1.d
            r2 = r6
            int[] r2 = r2.d
            int r2 = r2.length
            r3 = r11
            r4 = 8388607(0x7fffff, float:1.1754942E-38)
            r3 = r3 & r4
            int r2 = r2 - r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r11 = r0
        L93:
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L9b
            r0 = r9
            return r0
        L9b:
            int r10 = r10 + 1
            goto L3e
        La1:
            r0 = r8
            return r0
    }

    void a(org.objectweb.asm.ClassWriter r7, int r8, org.objectweb.asm.Type[] r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r10
            int[] r1 = new int[r1]
            r0.c = r1
            r0 = r6
            r1 = 0
            int[] r1 = new int[r1]
            r0.d = r1
            r0 = 0
            r11 = r0
            r0 = r8
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L44
            r0 = r8
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L38
            r0 = r6
            int[] r0 = r0.c
            r1 = r11
            int r11 = r11 + 1
            r2 = 24117248(0x1700000, float:4.4081038E-38)
            r3 = r7
            r4 = r7
            java.lang.String r4 = r4.I
            int r3 = r3.m7563c(r4)
            r2 = r2 | r3
            r0[r1] = r2
            goto L44
        L38:
            r0 = r6
            int[] r0 = r0.c
            r1 = r11
            int r11 = r11 + 1
            r2 = 16777222(0x1000006, float:2.3509904E-38)
            r0[r1] = r2
        L44:
            r0 = 0
            r12 = r0
        L47:
            r0 = r12
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L87
            r0 = r7
            r1 = r9
            r2 = r12
            r1 = r1[r2]
            java.lang.String r1 = r1.getDescriptor()
            int r0 = b(r0, r1)
            r13 = r0
            r0 = r6
            int[] r0 = r0.c
            r1 = r11
            int r11 = r11 + 1
            r2 = r13
            r0[r1] = r2
            r0 = r13
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto L75
            r0 = r13
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto L81
        L75:
            r0 = r6
            int[] r0 = r0.c
            r1 = r11
            int r11 = r11 + 1
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0[r1] = r2
        L81:
            int r12 = r12 + 1
            goto L47
        L87:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L9d
            r0 = r6
            int[] r0 = r0.c
            r1 = r11
            int r11 = r11 + 1
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0[r1] = r2
            goto L87
        L9d:
            return
    }

    void a(int r7, int r8, org.objectweb.asm.ClassWriter r9, org.objectweb.asm.Item r10) {
            r6 = this;
            r0 = r7
            switch(r0) {
                case 0: goto L330;
                case 1: goto L333;
                case 2: goto L33c;
                case 3: goto L33c;
                case 4: goto L33c;
                case 5: goto L33c;
                case 6: goto L33c;
                case 7: goto L33c;
                case 8: goto L33c;
                case 9: goto L345;
                case 10: goto L345;
                case 11: goto L354;
                case 12: goto L354;
                case 13: goto L354;
                case 14: goto L35d;
                case 15: goto L35d;
                case 16: goto L33c;
                case 17: goto L33c;
                case 18: goto L36c;
                case 19: goto L8bc;
                case 20: goto L8bc;
                case 21: goto L33c;
                case 22: goto L345;
                case 23: goto L354;
                case 24: goto L35d;
                case 25: goto L428;
                case 26: goto L8bc;
                case 27: goto L8bc;
                case 28: goto L8bc;
                case 29: goto L8bc;
                case 30: goto L8bc;
                case 31: goto L8bc;
                case 32: goto L8bc;
                case 33: goto L8bc;
                case 34: goto L8bc;
                case 35: goto L8bc;
                case 36: goto L8bc;
                case 37: goto L8bc;
                case 38: goto L8bc;
                case 39: goto L8bc;
                case 40: goto L8bc;
                case 41: goto L8bc;
                case 42: goto L8bc;
                case 43: goto L8bc;
                case 44: goto L8bc;
                case 45: goto L8bc;
                case 46: goto L434;
                case 47: goto L442;
                case 48: goto L456;
                case 49: goto L464;
                case 50: goto L478;
                case 51: goto L434;
                case 52: goto L434;
                case 53: goto L434;
                case 54: goto L48f;
                case 55: goto L4dc;
                case 56: goto L48f;
                case 57: goto L4dc;
                case 58: goto L48f;
                case 59: goto L8bc;
                case 60: goto L8bc;
                case 61: goto L8bc;
                case 62: goto L8bc;
                case 63: goto L8bc;
                case 64: goto L8bc;
                case 65: goto L8bc;
                case 66: goto L8bc;
                case 67: goto L8bc;
                case 68: goto L8bc;
                case 69: goto L8bc;
                case 70: goto L8bc;
                case 71: goto L8bc;
                case 72: goto L8bc;
                case 73: goto L8bc;
                case 74: goto L8bc;
                case 75: goto L8bc;
                case 76: goto L8bc;
                case 77: goto L8bc;
                case 78: goto L8bc;
                case 79: goto L537;
                case 80: goto L53f;
                case 81: goto L537;
                case 82: goto L53f;
                case 83: goto L537;
                case 84: goto L537;
                case 85: goto L537;
                case 86: goto L537;
                case 87: goto L547;
                case 88: goto L54f;
                case 89: goto L557;
                case 90: goto L56c;
                case 91: goto L58d;
                case 92: goto L5ba;
                case 93: goto L5e1;
                case 94: goto L614;
                case 95: goto L653;
                case 96: goto L66e;
                case 97: goto L67c;
                case 98: goto L690;
                case 99: goto L69e;
                case 100: goto L66e;
                case 101: goto L67c;
                case 102: goto L690;
                case 103: goto L69e;
                case 104: goto L66e;
                case 105: goto L67c;
                case 106: goto L690;
                case 107: goto L69e;
                case 108: goto L66e;
                case 109: goto L67c;
                case 110: goto L690;
                case 111: goto L69e;
                case 112: goto L66e;
                case 113: goto L67c;
                case 114: goto L690;
                case 115: goto L69e;
                case 116: goto L330;
                case 117: goto L330;
                case 118: goto L330;
                case 119: goto L330;
                case 120: goto L66e;
                case 121: goto L6b2;
                case 122: goto L66e;
                case 123: goto L6b2;
                case 124: goto L66e;
                case 125: goto L6b2;
                case 126: goto L66e;
                case 127: goto L67c;
                case 128: goto L66e;
                case 129: goto L67c;
                case 130: goto L66e;
                case 131: goto L67c;
                case 132: goto L6c6;
                case 133: goto L6d0;
                case 134: goto L6e4;
                case 135: goto L6f2;
                case 136: goto L66e;
                case 137: goto L690;
                case 138: goto L464;
                case 139: goto L706;
                case 140: goto L6d0;
                case 141: goto L6f2;
                case 142: goto L66e;
                case 143: goto L442;
                case 144: goto L690;
                case 145: goto L330;
                case 146: goto L330;
                case 147: goto L330;
                case 148: goto L714;
                case 149: goto L66e;
                case 150: goto L66e;
                case 151: goto L714;
                case 152: goto L714;
                case 153: goto L547;
                case 154: goto L547;
                case 155: goto L547;
                case 156: goto L547;
                case 157: goto L547;
                case 158: goto L547;
                case 159: goto L54f;
                case 160: goto L54f;
                case 161: goto L54f;
                case 162: goto L54f;
                case 163: goto L54f;
                case 164: goto L54f;
                case 165: goto L54f;
                case 166: goto L54f;
                case 167: goto L330;
                case 168: goto L722;
                case 169: goto L722;
                case 170: goto L547;
                case 171: goto L547;
                case 172: goto L547;
                case 173: goto L54f;
                case 174: goto L547;
                case 175: goto L54f;
                case 176: goto L547;
                case 177: goto L330;
                case 178: goto L72c;
                case 179: goto L739;
                case 180: goto L745;
                case 181: goto L757;
                case 182: goto L768;
                case 183: goto L768;
                case 184: goto L768;
                case 185: goto L768;
                case 186: goto L7a6;
                case 187: goto L7bc;
                case 188: goto L7d0;
                case 189: goto L848;
                case 190: goto L706;
                case 191: goto L547;
                case 192: goto L88b;
                case 193: goto L706;
                case 194: goto L547;
                case 195: goto L547;
                case 196: goto L8bc;
                case 197: goto L8bc;
                case 198: goto L547;
                case 199: goto L547;
                default: goto L8bc;
            }
        L330:
            goto L8cb
        L333:
            r0 = r6
            r1 = 16777221(0x1000005, float:2.35099E-38)
            r0.b(r1)
            goto L8cb
        L33c:
            r0 = r6
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r0.b(r1)
            goto L8cb
        L345:
            r0 = r6
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L354:
            r0 = r6
            r1 = 16777218(0x1000002, float:2.3509893E-38)
            r0.b(r1)
            goto L8cb
        L35d:
            r0 = r6
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L36c:
            r0 = r10
            int r0 = r0.b
            switch(r0) {
                case 3: goto L3b8;
                case 4: goto L3d0;
                case 5: goto L3c1;
                case 6: goto L3d9;
                case 7: goto L3e8;
                case 8: goto L3f8;
                case 9: goto L418;
                case 10: goto L418;
                case 11: goto L418;
                case 12: goto L418;
                case 13: goto L418;
                case 14: goto L418;
                case 15: goto L418;
                case 16: goto L408;
                default: goto L418;
            }
        L3b8:
            r0 = r6
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r0.b(r1)
            goto L8cb
        L3c1:
            r0 = r6
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L3d0:
            r0 = r6
            r1 = 16777218(0x1000002, float:2.3509893E-38)
            r0.b(r1)
            goto L8cb
        L3d9:
            r0 = r6
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L3e8:
            r0 = r6
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r2 = r9
            java.lang.String r3 = "java/lang/Class"
            int r2 = r2.m7563c(r3)
            r1 = r1 | r2
            r0.b(r1)
            goto L8cb
        L3f8:
            r0 = r6
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r2 = r9
            java.lang.String r3 = "java/lang/String"
            int r2 = r2.m7563c(r3)
            r1 = r1 | r2
            r0.b(r1)
            goto L8cb
        L408:
            r0 = r6
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r2 = r9
            java.lang.String r3 = "java/lang/invoke/MethodType"
            int r2 = r2.m7563c(r3)
            r1 = r1 | r2
            r0.b(r1)
            goto L8cb
        L418:
            r0 = r6
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r2 = r9
            java.lang.String r3 = "java/lang/invoke/MethodHandle"
            int r2 = r2.m7563c(r3)
            r1 = r1 | r2
            r0.b(r1)
            goto L8cb
        L428:
            r0 = r6
            r1 = r6
            r2 = r8
            int r1 = r1.a(r2)
            r0.b(r1)
            goto L8cb
        L434:
            r0 = r6
            r1 = 2
            r0.c(r1)
            r0 = r6
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r0.b(r1)
            goto L8cb
        L442:
            r0 = r6
            r1 = 2
            r0.c(r1)
            r0 = r6
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L456:
            r0 = r6
            r1 = 2
            r0.c(r1)
            r0 = r6
            r1 = 16777218(0x1000002, float:2.3509893E-38)
            r0.b(r1)
            goto L8cb
        L464:
            r0 = r6
            r1 = 2
            r0.c(r1)
            r0 = r6
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L478:
            r0 = r6
            r1 = 1
            r0.c(r1)
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r2 = r11
            int r1 = r1 + r2
            r0.b(r1)
            goto L8cb
        L48f:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            r1 = r8
            r2 = r11
            r0.a(r1, r2)
            r0 = r8
            if (r0 <= 0) goto L8cb
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.a(r1)
            r12 = r0
            r0 = r12
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto L4b7
            r0 = r12
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto L4c3
        L4b7:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0.a(r1, r2)
            goto L8cb
        L4c3:
            r0 = r12
            r1 = 251658240(0xf000000, float:6.3108872E-30)
            r0 = r0 & r1
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 == r1) goto L8cb
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = r12
            r3 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 | r3
            r0.a(r1, r2)
            goto L8cb
        L4dc:
            r0 = r6
            r1 = 1
            r0.c(r1)
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            r1 = r8
            r2 = r11
            r0.a(r1, r2)
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0.a(r1, r2)
            r0 = r8
            if (r0 <= 0) goto L8cb
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0.a(r1)
            r12 = r0
            r0 = r12
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto L512
            r0 = r12
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto L51e
        L512:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0.a(r1, r2)
            goto L8cb
        L51e:
            r0 = r12
            r1 = 251658240(0xf000000, float:6.3108872E-30)
            r0 = r0 & r1
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 == r1) goto L8cb
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = r12
            r3 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 | r3
            r0.a(r1, r2)
            goto L8cb
        L537:
            r0 = r6
            r1 = 3
            r0.c(r1)
            goto L8cb
        L53f:
            r0 = r6
            r1 = 4
            r0.c(r1)
            goto L8cb
        L547:
            r0 = r6
            r1 = 1
            r0.c(r1)
            goto L8cb
        L54f:
            r0 = r6
            r1 = 2
            r0.c(r1)
            goto L8cb
        L557:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            r1 = r11
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            goto L8cb
        L56c:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            int r0 = r0.a()
            r12 = r0
            r0 = r6
            r1 = r11
            r0.b(r1)
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            goto L8cb
        L58d:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            int r0 = r0.a()
            r12 = r0
            r0 = r6
            int r0 = r0.a()
            r13 = r0
            r0 = r6
            r1 = r11
            r0.b(r1)
            r0 = r6
            r1 = r13
            r0.b(r1)
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            goto L8cb
        L5ba:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            int r0 = r0.a()
            r12 = r0
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            goto L8cb
        L5e1:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            int r0 = r0.a()
            r12 = r0
            r0 = r6
            int r0 = r0.a()
            r13 = r0
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            r0 = r6
            r1 = r13
            r0.b(r1)
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            goto L8cb
        L614:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            int r0 = r0.a()
            r12 = r0
            r0 = r6
            int r0 = r0.a()
            r13 = r0
            r0 = r6
            int r0 = r0.a()
            r14 = r0
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            r0 = r6
            r1 = r14
            r0.b(r1)
            r0 = r6
            r1 = r13
            r0.b(r1)
            r0 = r6
            r1 = r12
            r0.b(r1)
            r0 = r6
            r1 = r11
            r0.b(r1)
            goto L8cb
        L653:
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r6
            int r0 = r0.a()
            r12 = r0
            r0 = r6
            r1 = r11
            r0.b(r1)
            r0 = r6
            r1 = r12
            r0.b(r1)
            goto L8cb
        L66e:
            r0 = r6
            r1 = 2
            r0.c(r1)
            r0 = r6
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r0.b(r1)
            goto L8cb
        L67c:
            r0 = r6
            r1 = 4
            r0.c(r1)
            r0 = r6
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L690:
            r0 = r6
            r1 = 2
            r0.c(r1)
            r0 = r6
            r1 = 16777218(0x1000002, float:2.3509893E-38)
            r0.b(r1)
            goto L8cb
        L69e:
            r0 = r6
            r1 = 4
            r0.c(r1)
            r0 = r6
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L6b2:
            r0 = r6
            r1 = 3
            r0.c(r1)
            r0 = r6
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L6c6:
            r0 = r6
            r1 = r8
            r2 = 16777217(0x1000001, float:2.350989E-38)
            r0.a(r1, r2)
            goto L8cb
        L6d0:
            r0 = r6
            r1 = 1
            r0.c(r1)
            r0 = r6
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L6e4:
            r0 = r6
            r1 = 1
            r0.c(r1)
            r0 = r6
            r1 = 16777218(0x1000002, float:2.3509893E-38)
            r0.b(r1)
            goto L8cb
        L6f2:
            r0 = r6
            r1 = 1
            r0.c(r1)
            r0 = r6
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            r0.b(r1)
            r0 = r6
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.b(r1)
            goto L8cb
        L706:
            r0 = r6
            r1 = 1
            r0.c(r1)
            r0 = r6
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r0.b(r1)
            goto L8cb
        L714:
            r0 = r6
            r1 = 4
            r0.c(r1)
            r0 = r6
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r0.b(r1)
            goto L8cb
        L722:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "JSR/RET are not supported with computeFrames option"
            r1.<init>(r2)
            throw r0
        L72c:
            r0 = r6
            r1 = r9
            r2 = r10
            java.lang.String r2 = r2.i
            r0.a(r1, r2)
            goto L8cb
        L739:
            r0 = r6
            r1 = r10
            java.lang.String r1 = r1.i
            r0.a(r1)
            goto L8cb
        L745:
            r0 = r6
            r1 = 1
            r0.c(r1)
            r0 = r6
            r1 = r9
            r2 = r10
            java.lang.String r2 = r2.i
            r0.a(r1, r2)
            goto L8cb
        L757:
            r0 = r6
            r1 = r10
            java.lang.String r1 = r1.i
            r0.a(r1)
            r0 = r6
            int r0 = r0.a()
            goto L8cb
        L768:
            r0 = r6
            r1 = r10
            java.lang.String r1 = r1.i
            r0.a(r1)
            r0 = r7
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto L799
            r0 = r6
            int r0 = r0.a()
            r11 = r0
            r0 = r7
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto L799
            r0 = r10
            java.lang.String r0 = r0.h
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 60
            if (r0 != r1) goto L799
            r0 = r6
            r1 = r11
            r0.d(r1)
        L799:
            r0 = r6
            r1 = r9
            r2 = r10
            java.lang.String r2 = r2.i
            r0.a(r1, r2)
            goto L8cb
        L7a6:
            r0 = r6
            r1 = r10
            java.lang.String r1 = r1.h
            r0.a(r1)
            r0 = r6
            r1 = r9
            r2 = r10
            java.lang.String r2 = r2.h
            r0.a(r1, r2)
            goto L8cb
        L7bc:
            r0 = r6
            r1 = 25165824(0x1800000, float:4.7019774E-38)
            r2 = r9
            r3 = r10
            java.lang.String r3 = r3.g
            r4 = r8
            int r2 = r2.a(r3, r4)
            r1 = r1 | r2
            r0.b(r1)
            goto L8cb
        L7d0:
            r0 = r6
            int r0 = r0.a()
            r0 = r8
            switch(r0) {
                case 4: goto L800;
                case 5: goto L809;
                case 6: goto L82d;
                case 7: goto L836;
                case 8: goto L812;
                case 9: goto L81b;
                case 10: goto L824;
                default: goto L83f;
            }
        L800:
            r0 = r6
            r1 = 285212681(0x11000009, float:1.009743E-28)
            r0.b(r1)
            goto L8cb
        L809:
            r0 = r6
            r1 = 285212683(0x1100000b, float:1.0097433E-28)
            r0.b(r1)
            goto L8cb
        L812:
            r0 = r6
            r1 = 285212682(0x1100000a, float:1.0097432E-28)
            r0.b(r1)
            goto L8cb
        L81b:
            r0 = r6
            r1 = 285212684(0x1100000c, float:1.0097434E-28)
            r0.b(r1)
            goto L8cb
        L824:
            r0 = r6
            r1 = 285212673(0x11000001, float:1.0097421E-28)
            r0.b(r1)
            goto L8cb
        L82d:
            r0 = r6
            r1 = 285212674(0x11000002, float:1.0097422E-28)
            r0.b(r1)
            goto L8cb
        L836:
            r0 = r6
            r1 = 285212675(0x11000003, float:1.0097423E-28)
            r0.b(r1)
            goto L8cb
        L83f:
            r0 = r6
            r1 = 285212676(0x11000004, float:1.0097424E-28)
            r0.b(r1)
            goto L8cb
        L848:
            r0 = r10
            java.lang.String r0 = r0.g
            r15 = r0
            r0 = r6
            int r0 = r0.a()
            r0 = r15
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L87b
            r0 = r6
            r1 = r9
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r3 = r2
            r3.<init>()
            r3 = 91
            java.lang.StringBuffer r2 = r2.append(r3)
            r3 = r15
            java.lang.StringBuffer r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.a(r1, r2)
            goto L8cb
        L87b:
            r0 = r6
            r1 = 292552704(0x11700000, float:1.8932662E-28)
            r2 = r9
            r3 = r15
            int r2 = r2.m7563c(r3)
            r1 = r1 | r2
            r0.b(r1)
            goto L8cb
        L88b:
            r0 = r10
            java.lang.String r0 = r0.g
            r15 = r0
            r0 = r6
            int r0 = r0.a()
            r0 = r15
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L8ac
            r0 = r6
            r1 = r9
            r2 = r15
            r0.a(r1, r2)
            goto L8cb
        L8ac:
            r0 = r6
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r2 = r9
            r3 = r15
            int r2 = r2.m7563c(r3)
            r1 = r1 | r2
            r0.b(r1)
            goto L8cb
        L8bc:
            r0 = r6
            r1 = r8
            r0.c(r1)
            r0 = r6
            r1 = r9
            r2 = r10
            java.lang.String r2 = r2.g
            r0.a(r1, r2)
        L8cb:
            return
    }

    boolean a(org.objectweb.asm.ClassWriter r8, org.objectweb.asm.Frame r9, int r10) {
            r7 = this;
            r0 = 0
            r11 = r0
            r0 = r7
            int[] r0 = r0.c
            int r0 = r0.length
            r17 = r0
            r0 = r7
            int[] r0 = r0.d
            int r0 = r0.length
            r18 = r0
            r0 = r9
            int[] r0 = r0.c
            if (r0 != 0) goto L23
            r0 = r9
            r1 = r17
            int[] r1 = new int[r1]
            r0.c = r1
            r0 = 1
            r11 = r0
        L23:
            r0 = 0
            r12 = r0
        L26:
            r0 = r12
            r1 = r17
            if (r0 >= r1) goto Lec
            r0 = r7
            int[] r0 = r0.e
            if (r0 == 0) goto Lbc
            r0 = r12
            r1 = r7
            int[] r1 = r1.e
            int r1 = r1.length
            if (r0 >= r1) goto Lbc
            r0 = r7
            int[] r0 = r0.e
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L58
            r0 = r7
            int[] r0 = r0.c
            r1 = r12
            r0 = r0[r1]
            r16 = r0
            goto Lc5
        L58:
            r0 = r13
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            r14 = r0
            r0 = r13
            r1 = 251658240(0xf000000, float:6.3108872E-30)
            r0 = r0 & r1
            r15 = r0
            r0 = r15
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L74
            r0 = r13
            r16 = r0
            goto Lc5
        L74:
            r0 = r15
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 != r1) goto L8d
            r0 = r14
            r1 = r7
            int[] r1 = r1.c
            r2 = r13
            r3 = 8388607(0x7fffff, float:1.1754942E-38)
            r2 = r2 & r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r16 = r0
            goto L9f
        L8d:
            r0 = r14
            r1 = r7
            int[] r1 = r1.d
            r2 = r18
            r3 = r13
            r4 = 8388607(0x7fffff, float:1.1754942E-38)
            r3 = r3 & r4
            int r2 = r2 - r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r16 = r0
        L9f:
            r0 = r13
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r1
            if (r0 == 0) goto Lc5
            r0 = r16
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto Lb5
            r0 = r16
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto Lc5
        Lb5:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r16 = r0
            goto Lc5
        Lbc:
            r0 = r7
            int[] r0 = r0.c
            r1 = r12
            r0 = r0[r1]
            r16 = r0
        Lc5:
            r0 = r7
            int[] r0 = r0.i
            if (r0 == 0) goto Ld5
            r0 = r7
            r1 = r8
            r2 = r16
            int r0 = r0.a(r1, r2)
            r16 = r0
        Ld5:
            r0 = r11
            r1 = r8
            r2 = r16
            r3 = r9
            int[] r3 = r3.c
            r4 = r12
            boolean r1 = a(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r12 = r12 + 1
            goto L26
        Lec:
            r0 = r10
            if (r0 <= 0) goto L13d
            r0 = 0
            r12 = r0
        Lf3:
            r0 = r12
            r1 = r17
            if (r0 >= r1) goto L11a
            r0 = r7
            int[] r0 = r0.c
            r1 = r12
            r0 = r0[r1]
            r16 = r0
            r0 = r11
            r1 = r8
            r2 = r16
            r3 = r9
            int[] r3 = r3.c
            r4 = r12
            boolean r1 = a(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r12 = r12 + 1
            goto Lf3
        L11a:
            r0 = r9
            int[] r0 = r0.d
            if (r0 != 0) goto L12b
            r0 = r9
            r1 = 1
            int[] r1 = new int[r1]
            r0.d = r1
            r0 = 1
            r11 = r0
        L12b:
            r0 = r11
            r1 = r8
            r2 = r10
            r3 = r9
            int[] r3 = r3.d
            r4 = 0
            boolean r1 = a(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            r0 = r11
            return r0
        L13d:
            r0 = r7
            int[] r0 = r0.d
            int r0 = r0.length
            r1 = r7
            org.objectweb.asm.Label r1 = r1.b
            int r1 = r1.f
            int r0 = r0 + r1
            r19 = r0
            r0 = r9
            int[] r0 = r0.d
            if (r0 != 0) goto L163
            r0 = r9
            r1 = r19
            r2 = r7
            int r2 = r2.g
            int r1 = r1 + r2
            int[] r1 = new int[r1]
            r0.d = r1
            r0 = 1
            r11 = r0
        L163:
            r0 = 0
            r12 = r0
        L166:
            r0 = r12
            r1 = r19
            if (r0 >= r1) goto L19d
            r0 = r7
            int[] r0 = r0.d
            r1 = r12
            r0 = r0[r1]
            r16 = r0
            r0 = r7
            int[] r0 = r0.i
            if (r0 == 0) goto L186
            r0 = r7
            r1 = r8
            r2 = r16
            int r0 = r0.a(r1, r2)
            r16 = r0
        L186:
            r0 = r11
            r1 = r8
            r2 = r16
            r3 = r9
            int[] r3 = r3.d
            r4 = r12
            boolean r1 = a(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r12 = r12 + 1
            goto L166
        L19d:
            r0 = 0
            r12 = r0
        L1a0:
            r0 = r12
            r1 = r7
            int r1 = r1.g
            if (r0 >= r1) goto L23d
            r0 = r7
            int[] r0 = r0.f
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            r14 = r0
            r0 = r13
            r1 = 251658240(0xf000000, float:6.3108872E-30)
            r0 = r0 & r1
            r15 = r0
            r0 = r15
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L1ce
            r0 = r13
            r16 = r0
            goto L213
        L1ce:
            r0 = r15
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 != r1) goto L1e7
            r0 = r14
            r1 = r7
            int[] r1 = r1.c
            r2 = r13
            r3 = 8388607(0x7fffff, float:1.1754942E-38)
            r2 = r2 & r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r16 = r0
            goto L1f9
        L1e7:
            r0 = r14
            r1 = r7
            int[] r1 = r1.d
            r2 = r18
            r3 = r13
            r4 = 8388607(0x7fffff, float:1.1754942E-38)
            r3 = r3 & r4
            int r2 = r2 - r3
            r1 = r1[r2]
            int r0 = r0 + r1
            r16 = r0
        L1f9:
            r0 = r13
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L213
            r0 = r16
            r1 = 16777220(0x1000004, float:2.3509898E-38)
            if (r0 == r1) goto L20f
            r0 = r16
            r1 = 16777219(0x1000003, float:2.3509895E-38)
            if (r0 != r1) goto L213
        L20f:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r16 = r0
        L213:
            r0 = r7
            int[] r0 = r0.i
            if (r0 == 0) goto L223
            r0 = r7
            r1 = r8
            r2 = r16
            int r0 = r0.a(r1, r2)
            r16 = r0
        L223:
            r0 = r11
            r1 = r8
            r2 = r16
            r3 = r9
            int[] r3 = r3.d
            r4 = r19
            r5 = r12
            int r4 = r4 + r5
            boolean r1 = a(r1, r2, r3, r4)
            r0 = r0 | r1
            r11 = r0
            int r12 = r12 + 1
            goto L1a0
        L23d:
            r0 = r11
            return r0
    }

    private static boolean a(org.objectweb.asm.ClassWriter r6, int r7, int[] r8, int r9) {
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r7
            if (r0 != r1) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r7
            r1 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r0 & r1
            r1 = 16777221(0x1000005, float:2.35099E-38)
            if (r0 != r1) goto L22
            r0 = r10
            r1 = 16777221(0x1000005, float:2.35099E-38)
            if (r0 != r1) goto L1f
            r0 = 0
            return r0
        L1f:
            r0 = 16777221(0x1000005, float:2.35099E-38)
            r7 = r0
        L22:
            r0 = r10
            if (r0 != 0) goto L2d
            r0 = r8
            r1 = r9
            r2 = r7
            r0[r1] = r2
            r0 = 1
            return r0
        L2d:
            r0 = r10
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r0 == r1) goto L3f
            r0 = r10
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            if (r0 == 0) goto Lfc
        L3f:
            r0 = r7
            r1 = 16777221(0x1000005, float:2.35099E-38)
            if (r0 != r1) goto L47
            r0 = 0
            return r0
        L47:
            r0 = r7
            r1 = -1048576(0xfffffffffff00000, float:NaN)
            r0 = r0 & r1
            r1 = r10
            r2 = -1048576(0xfffffffffff00000, float:NaN)
            r1 = r1 & r2
            if (r0 != r1) goto L92
            r0 = r10
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r0 != r1) goto L77
            r0 = r7
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r0 = r0 | r1
            r1 = r6
            r2 = r7
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r3
            r3 = r10
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r4
            int r1 = r1.a(r2, r3)
            r0 = r0 | r1
            r11 = r0
            goto L122
        L77:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r10
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r2
            int r0 = r0 + r1
            r12 = r0
            r0 = r12
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r0 = r0 | r1
            r1 = r6
            java.lang.String r2 = "java/lang/Object"
            int r1 = r1.m7563c(r2)
            r0 = r0 | r1
            r11 = r0
            goto L122
        L92:
            r0 = r7
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r0 == r1) goto La2
            r0 = r7
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            if (r0 == 0) goto Lf5
        La2:
            r0 = r7
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            if (r0 == 0) goto Lb2
            r0 = r7
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r0 != r1) goto Lb6
        Lb2:
            r0 = 0
            goto Lb8
        Lb6:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
        Lb8:
            r1 = r7
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r2
            int r0 = r0 + r1
            r12 = r0
            r0 = r10
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            if (r0 == 0) goto Ld1
            r0 = r10
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r0 != r1) goto Ld5
        Ld1:
            r0 = 0
            goto Ld7
        Ld5:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
        Ld7:
            r1 = r10
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r2
            int r0 = r0 + r1
            r13 = r0
            r0 = r12
            r1 = r13
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            r0 = r0 | r1
            r1 = r6
            java.lang.String r2 = "java/lang/Object"
            int r1 = r1.m7563c(r2)
            r0 = r0 | r1
            r11 = r0
            goto L122
        Lf5:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r11 = r0
            goto L122
        Lfc:
            r0 = r10
            r1 = 16777221(0x1000005, float:2.35099E-38)
            if (r0 != r1) goto L11e
            r0 = r7
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r0 == r1) goto L113
            r0 = r7
            r1 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r1
            if (r0 == 0) goto L117
        L113:
            r0 = r7
            goto L119
        L117:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
        L119:
            r11 = r0
            goto L122
        L11e:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r11 = r0
        L122:
            r0 = r10
            r1 = r11
            if (r0 == r1) goto L130
            r0 = r8
            r1 = r9
            r2 = r11
            r0[r1] = r2
            r0 = 1
            return r0
        L130:
            r0 = 0
            return r0
    }

    static {
            _clinit_()
            r0 = 202(0xca, float:2.83E-43)
            int[] r0 = new int[r0]
            r6 = r0
            java.lang.String r0 = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE"
            r7 = r0
            r0 = 0
            r5 = r0
        Le:
            r0 = r5
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L25
            r0 = r6
            r1 = r5
            r2 = r7
            r3 = r5
            char r2 = r2.charAt(r3)
            r3 = 69
            int r2 = r2 - r3
            r0[r1] = r2
            int r5 = r5 + 1
            goto Le
        L25:
            r0 = r6
            org.objectweb.asm.Frame.a = r0
            return
    }

    static void _clinit_() {
            return
    }
}
