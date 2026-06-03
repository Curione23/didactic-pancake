package org.objectweb.asm;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/Item.class */
final class Item {
    int a;
    int b;
    int c;
    long d;
    java.lang.String g;
    java.lang.String h;
    java.lang.String i;
    int j;
    org.objectweb.asm.Item k;

    Item() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    Item(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.a = r1
            return
    }

    Item(int r5, org.objectweb.asm.Item r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.a = r1
            r0 = r4
            r1 = r6
            int r1 = r1.b
            r0.b = r1
            r0 = r4
            r1 = r6
            int r1 = r1.c
            r0.c = r1
            r0 = r4
            r1 = r6
            long r1 = r1.d
            r0.d = r1
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.g
            r0.g = r1
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.h
            r0.h = r1
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.i
            r0.i = r1
            r0 = r4
            r1 = r6
            int r1 = r1.j
            r0.j = r1
            return
    }

    void a(int r6) {
            r5 = this;
            r0 = r5
            r1 = 3
            r0.b = r1
            r0 = r5
            r1 = r6
            r0.c = r1
            r0 = r5
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r5
            int r2 = r2.b
            r3 = r6
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
    }

    void a(long r7) {
            r6 = this;
            r0 = r6
            r1 = 5
            r0.b = r1
            r0 = r6
            r1 = r7
            r0.d = r1
            r0 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r6
            int r2 = r2.b
            r3 = r7
            int r3 = (int) r3
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
    }

    void a(float r6) {
            r5 = this;
            r0 = r5
            r1 = 4
            r0.b = r1
            r0 = r5
            r1 = r6
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.c = r1
            r0 = r5
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r5
            int r2 = r2.b
            r3 = r6
            int r3 = (int) r3
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
    }

    void a(double r7) {
            r6 = this;
            r0 = r6
            r1 = 6
            r0.b = r1
            r0 = r6
            r1 = r7
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.d = r1
            r0 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r6
            int r2 = r2.b
            r3 = r7
            int r3 = (int) r3
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
    }

    void a(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r0.b = r1
            r0 = r6
            r1 = r8
            r0.g = r1
            r0 = r6
            r1 = r9
            r0.h = r1
            r0 = r6
            r1 = r10
            r0.i = r1
            r0 = r7
            switch(r0) {
                case 1: goto L55;
                case 7: goto L50;
                case 8: goto L55;
                case 12: goto L63;
                case 16: goto L55;
                case 30: goto L55;
                default: goto L76;
            }
        L50:
            r0 = r6
            r1 = 0
            r0.c = r1
        L55:
            r0 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r7
            r3 = r8
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
        L63:
            r0 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r7
            r3 = r8
            int r3 = r3.hashCode()
            r4 = r9
            int r4 = r4.hashCode()
            int r3 = r3 * r4
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
        L76:
            r0 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = r7
            r3 = r8
            int r3 = r3.hashCode()
            r4 = r9
            int r4 = r4.hashCode()
            int r3 = r3 * r4
            r4 = r10
            int r4 = r4.hashCode()
            int r3 = r3 * r4
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
    }

    void a(java.lang.String r7, java.lang.String r8, int r9) {
            r6 = this;
            r0 = r6
            r1 = 18
            r0.b = r1
            r0 = r6
            r1 = r9
            long r1 = (long) r1
            r0.d = r1
            r0 = r6
            r1 = r7
            r0.g = r1
            r0 = r6
            r1 = r8
            r0.h = r1
            r0 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 18
            r3 = r9
            r4 = r6
            java.lang.String r4 = r4.g
            int r4 = r4.hashCode()
            int r3 = r3 * r4
            r4 = r6
            java.lang.String r4 = r4.h
            int r4 = r4.hashCode()
            int r3 = r3 * r4
            int r2 = r2 + r3
            r1 = r1 & r2
            r0.j = r1
            return
    }

    void a(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = 33
            r0.b = r1
            r0 = r3
            r1 = r4
            r0.c = r1
            r0 = r3
            r1 = r5
            r0.j = r1
            return
    }

    boolean a(org.objectweb.asm.Item r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.b
            switch(r0) {
                case 1: goto L94;
                case 2: goto L132;
                case 3: goto Lb2;
                case 4: goto Lb2;
                case 5: goto La0;
                case 6: goto La0;
                case 7: goto L94;
                case 8: goto L94;
                case 9: goto L132;
                case 10: goto L132;
                case 11: goto L132;
                case 12: goto Le2;
                case 13: goto L132;
                case 14: goto L132;
                case 15: goto L132;
                case 16: goto L94;
                case 17: goto L132;
                case 18: goto L104;
                case 19: goto L132;
                case 20: goto L132;
                case 21: goto L132;
                case 22: goto L132;
                case 23: goto L132;
                case 24: goto L132;
                case 25: goto L132;
                case 26: goto L132;
                case 27: goto L132;
                case 28: goto L132;
                case 29: goto L132;
                case 30: goto L94;
                case 31: goto Lc3;
                case 32: goto La0;
                default: goto L132;
            }
        L94:
            r0 = r6
            java.lang.String r0 = r0.g
            r1 = r5
            java.lang.String r1 = r1.g
            boolean r0 = r0.equals(r1)
            return r0
        La0:
            r0 = r6
            long r0 = r0.d
            r1 = r5
            long r1 = r1.d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb0
            r0 = 1
            goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            return r0
        Lb2:
            r0 = r6
            int r0 = r0.c
            r1 = r5
            int r1 = r1.c
            if (r0 != r1) goto Lc1
            r0 = 1
            goto Lc2
        Lc1:
            r0 = 0
        Lc2:
            return r0
        Lc3:
            r0 = r6
            int r0 = r0.c
            r1 = r5
            int r1 = r1.c
            if (r0 != r1) goto Le0
            r0 = r6
            java.lang.String r0 = r0.g
            r1 = r5
            java.lang.String r1 = r1.g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            r0 = 1
            goto Le1
        Le0:
            r0 = 0
        Le1:
            return r0
        Le2:
            r0 = r6
            java.lang.String r0 = r0.g
            r1 = r5
            java.lang.String r1 = r1.g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L102
            r0 = r6
            java.lang.String r0 = r0.h
            r1 = r5
            java.lang.String r1 = r1.h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L102
            r0 = 1
            goto L103
        L102:
            r0 = 0
        L103:
            return r0
        L104:
            r0 = r6
            long r0 = r0.d
            r1 = r5
            long r1 = r1.d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L130
            r0 = r6
            java.lang.String r0 = r0.g
            r1 = r5
            java.lang.String r1 = r1.g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L130
            r0 = r6
            java.lang.String r0 = r0.h
            r1 = r5
            java.lang.String r1 = r1.h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L130
            r0 = 1
            goto L131
        L130:
            r0 = 0
        L131:
            return r0
        L132:
            r0 = r6
            java.lang.String r0 = r0.g
            r1 = r5
            java.lang.String r1 = r1.g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L160
            r0 = r6
            java.lang.String r0 = r0.h
            r1 = r5
            java.lang.String r1 = r1.h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L160
            r0 = r6
            java.lang.String r0 = r0.i
            r1 = r5
            java.lang.String r1 = r1.i
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L160
            r0 = 1
            goto L161
        L160:
            r0 = 0
        L161:
            return r0
    }
}
