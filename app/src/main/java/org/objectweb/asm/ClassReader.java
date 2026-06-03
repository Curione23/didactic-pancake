package org.objectweb.asm;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/ClassReader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:org/objectweb/asm/ClassReader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:org/objectweb/asm/ClassReader.class */
public class ClassReader {
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;
    public static final int EXPAND_FRAMES = 8;
    public final byte[] b;
    private final int[] a;
    private final java.lang.String[] c;
    private final int d;
    public final int header;

    public ClassReader(byte[] r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            r0.<init>(r1, r2, r3)
            return
    }

    public ClassReader(byte[] r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.b = r1
            r0 = r5
            r1 = r7
            r2 = 6
            int r1 = r1 + r2
            short r0 = r0.readShort(r1)
            r1 = 52
            if (r0 <= r1) goto L1e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1e:
            r0 = r5
            r1 = r5
            r2 = r7
            r3 = 8
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int[] r1 = new int[r1]
            r0.a = r1
            r0 = r5
            int[] r0 = r0.a
            int r0 = r0.length
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.c = r1
            r0 = 0
            r10 = r0
            r0 = r7
            r1 = 10
            int r0 = r0 + r1
            r11 = r0
            r0 = 1
            r12 = r0
        L48:
            r0 = r12
            r1 = r9
            if (r0 >= r1) goto Lf4
            r0 = r5
            int[] r0 = r0.a
            r1 = r12
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            r0[r1] = r2
            r0 = r6
            r1 = r11
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Lc4;
                case 2: goto Le4;
                case 3: goto Lb4;
                case 4: goto Lb4;
                case 5: goto Lba;
                case 6: goto Lba;
                case 7: goto Le4;
                case 8: goto Le4;
                case 9: goto Lb4;
                case 10: goto Lb4;
                case 11: goto Lb4;
                case 12: goto Lb4;
                case 13: goto Le4;
                case 14: goto Le4;
                case 15: goto Lde;
                case 16: goto Le4;
                case 17: goto Le4;
                case 18: goto Lb4;
                default: goto Le4;
            }
        Lb4:
            r0 = 5
            r13 = r0
            goto Le7
        Lba:
            r0 = 9
            r13 = r0
            int r12 = r12 + 1
            goto Le7
        Lc4:
            r0 = 3
            r1 = r5
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r1 = r10
            if (r0 <= r1) goto Le7
            r0 = r13
            r10 = r0
            goto Le7
        Lde:
            r0 = 4
            r13 = r0
            goto Le7
        Le4:
            r0 = 3
            r13 = r0
        Le7:
            r0 = r11
            r1 = r13
            int r0 = r0 + r1
            r11 = r0
            int r12 = r12 + 1
            goto L48
        Lf4:
            r0 = r5
            r1 = r10
            r0.d = r1
            r0 = r5
            r1 = r11
            r0.header = r1
            return
    }

    public int getAccess() {
            r3 = this;
            r0 = r3
            r1 = r3
            int r1 = r1.header
            int r0 = r0.readUnsignedShort(r1)
            return r0
    }

    public java.lang.String getClassName() {
            r4 = this;
            r0 = r4
            r1 = r4
            int r1 = r1.header
            r2 = 2
            int r1 = r1 + r2
            r2 = r4
            int r2 = r2.d
            char[] r2 = new char[r2]
            java.lang.String r0 = r0.readClass(r1, r2)
            return r0
    }

    public java.lang.String getSuperName() {
            r4 = this;
            r0 = r4
            r1 = r4
            int r1 = r1.header
            r2 = 4
            int r1 = r1 + r2
            r2 = r4
            int r2 = r2.d
            char[] r2 = new char[r2]
            java.lang.String r0 = r0.readClass(r1, r2)
            return r0
    }

    public java.lang.String[] getInterfaces() {
            r6 = this;
            r0 = r6
            int r0 = r0.header
            r1 = 6
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r7
            int r0 = r0.readUnsignedShort(r1)
            r8 = r0
            r0 = r8
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = r0
            r0 = r8
            if (r0 <= 0) goto L3c
            r0 = r6
            int r0 = r0.d
            char[] r0 = new char[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        L22:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto L3c
            int r7 = r7 + 2
            r0 = r9
            r1 = r11
            r2 = r6
            r3 = r7
            r4 = r10
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L22
        L3c:
            r0 = r9
            return r0
    }

    void a(org.objectweb.asm.ClassWriter r9) {
            r8 = this;
            r0 = r8
            int r0 = r0.d
            char[] r0 = new char[r0]
            r10 = r0
            r0 = r8
            int[] r0 = r0.a
            int r0 = r0.length
            r11 = r0
            r0 = r11
            org.objectweb.asm.Item[] r0 = new org.objectweb.asm.Item[r0]
            r12 = r0
            r0 = 1
            r13 = r0
        L16:
            r0 = r13
            r1 = r11
            if (r0 >= r1) goto L215
            r0 = r8
            int[] r0 = r0.a
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r8
            byte[] r0 = r0.b
            r1 = r14
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r15 = r0
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r16 = r0
            r0 = r15
            switch(r0) {
                case 1: goto L123;
                case 2: goto L1e3;
                case 3: goto Lc4;
                case 4: goto Ld2;
                case 5: goto Lfe;
                case 6: goto L10f;
                case 7: goto L1e3;
                case 8: goto L1e3;
                case 9: goto L94;
                case 10: goto L94;
                case 11: goto L94;
                case 12: goto Le3;
                case 13: goto L1e3;
                case 14: goto L1e3;
                case 15: goto L161;
                case 16: goto L1e3;
                case 17: goto L1e3;
                case 18: goto L1a7;
                default: goto L1e3;
            }
        L94:
            r0 = r8
            int[] r0 = r0.a
            r1 = r8
            r2 = r14
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r17 = r0
            r0 = r16
            r1 = r15
            r2 = r8
            r3 = r14
            r4 = r10
            java.lang.String r2 = r2.readClass(r3, r4)
            r3 = r8
            r4 = r17
            r5 = r10
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r4 = r8
            r5 = r17
            r6 = 2
            int r5 = r5 + r6
            r6 = r10
            java.lang.String r4 = r4.readUTF8(r5, r6)
            r0.a(r1, r2, r3, r4)
            goto L1f3
        Lc4:
            r0 = r16
            r1 = r8
            r2 = r14
            int r1 = r1.readInt(r2)
            r0.a(r1)
            goto L1f3
        Ld2:
            r0 = r16
            r1 = r8
            r2 = r14
            int r1 = r1.readInt(r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.a(r1)
            goto L1f3
        Le3:
            r0 = r16
            r1 = r15
            r2 = r8
            r3 = r14
            r4 = r10
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = r8
            r4 = r14
            r5 = 2
            int r4 = r4 + r5
            r5 = r10
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r4 = 0
            r0.a(r1, r2, r3, r4)
            goto L1f3
        Lfe:
            r0 = r16
            r1 = r8
            r2 = r14
            long r1 = r1.readLong(r2)
            r0.a(r1)
            int r13 = r13 + 1
            goto L1f3
        L10f:
            r0 = r16
            r1 = r8
            r2 = r14
            long r1 = r1.readLong(r2)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r0.a(r1)
            int r13 = r13 + 1
            goto L1f3
        L123:
            r0 = r8
            java.lang.String[] r0 = r0.c
            r1 = r13
            r0 = r0[r1]
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L153
            r0 = r8
            int[] r0 = r0.a
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r8
            java.lang.String[] r0 = r0.c
            r1 = r13
            r2 = r8
            r3 = r14
            r4 = 2
            int r3 = r3 + r4
            r4 = r8
            r5 = r14
            int r4 = r4.readUnsignedShort(r5)
            r5 = r10
            java.lang.String r2 = r2.a(r3, r4, r5)
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            r18 = r0
        L153:
            r0 = r16
            r1 = r15
            r2 = r18
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
            goto L1f3
        L161:
            r0 = r8
            int[] r0 = r0.a
            r1 = r8
            r2 = r14
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r18 = r0
            r0 = r8
            int[] r0 = r0.a
            r1 = r8
            r2 = r18
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r17 = r0
            r0 = r16
            r1 = 20
            r2 = r8
            r3 = r14
            int r2 = r2.readByte(r3)
            int r1 = r1 + r2
            r2 = r8
            r3 = r18
            r4 = r10
            java.lang.String r2 = r2.readClass(r3, r4)
            r3 = r8
            r4 = r17
            r5 = r10
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r4 = r8
            r5 = r17
            r6 = 2
            int r5 = r5 + r6
            r6 = r10
            java.lang.String r4 = r4.readUTF8(r5, r6)
            r0.a(r1, r2, r3, r4)
            goto L1f3
        L1a7:
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.A
            if (r0 != 0) goto L1b6
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r10
            r0.a(r1, r2, r3)
        L1b6:
            r0 = r8
            int[] r0 = r0.a
            r1 = r8
            r2 = r14
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r17 = r0
            r0 = r16
            r1 = r8
            r2 = r17
            r3 = r10
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r2 = r8
            r3 = r17
            r4 = 2
            int r3 = r3 + r4
            r4 = r10
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = r8
            r4 = r14
            int r3 = r3.readUnsignedShort(r4)
            r0.a(r1, r2, r3)
            goto L1f3
        L1e3:
            r0 = r16
            r1 = r15
            r2 = r8
            r3 = r14
            r4 = r10
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = 0
            r4 = 0
            r0.a(r1, r2, r3, r4)
        L1f3:
            r0 = r16
            int r0 = r0.j
            r1 = r12
            int r1 = r1.length
            int r0 = r0 % r1
            r18 = r0
            r0 = r16
            r1 = r12
            r2 = r18
            r1 = r1[r2]
            r0.k = r1
            r0 = r12
            r1 = r18
            r2 = r16
            r0[r1] = r2
            int r13 = r13 + 1
            goto L16
        L215:
            r0 = r8
            int[] r0 = r0.a
            r1 = 1
            r0 = r0[r1]
            r1 = 1
            int r0 = r0 - r1
            r13 = r0
            r0 = r9
            org.objectweb.asm.ByteVector r0 = r0.d
            r1 = r8
            byte[] r1 = r1.b
            r2 = r13
            r3 = r8
            int r3 = r3.header
            r4 = r13
            int r3 = r3 - r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r9
            r1 = r12
            r0.e = r1
            r0 = r9
            r1 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            r2 = r11
            double r2 = (double) r2
            double r1 = r1 * r2
            int r1 = (int) r1
            r0.f = r1
            r0 = r9
            r1 = r11
            r0.c = r1
            return
    }

    private void a(org.objectweb.asm.ClassWriter r7, org.objectweb.asm.Item[] r8, char[] r9) {
            r6 = this;
            r0 = r6
            int r0 = r0.a()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            r1 = r10
            int r0 = r0.readUnsignedShort(r1)
            r12 = r0
        L11:
            r0 = r12
            if (r0 <= 0) goto L48
            r0 = r6
            r1 = r10
            r2 = 2
            int r1 = r1 + r2
            r2 = r9
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r13 = r0
            java.lang.String r0 = "BootstrapMethods"
            r1 = r13
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            r0 = 1
            r11 = r0
            goto L48
        L32:
            r0 = r10
            r1 = 6
            r2 = r6
            r3 = r10
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r10 = r0
            int r12 = r12 + (-1)
            goto L11
        L48:
            r0 = r11
            if (r0 != 0) goto L4e
            return
        L4e:
            r0 = r6
            r1 = r10
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r10
            r1 = 10
            int r0 = r0 + r1
            r14 = r0
        L63:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto Lea
            r0 = r14
            r1 = r10
            int r0 = r0 - r1
            r1 = 10
            int r0 = r0 - r1
            r15 = r0
            r0 = r6
            r1 = r6
            r2 = r14
            int r1 = r1.readUnsignedShort(r2)
            r2 = r9
            java.lang.Object r0 = r0.readConst(r1, r2)
            int r0 = r0.hashCode()
            r16 = r0
            r0 = r6
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r17 = r0
        L8e:
            r0 = r17
            if (r0 <= 0) goto Lb1
            r0 = r16
            r1 = r6
            r2 = r6
            r3 = r14
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r3 = r9
            java.lang.Object r1 = r1.readConst(r2, r3)
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            r16 = r0
            int r14 = r14 + 2
            int r17 = r17 + (-1)
            goto L8e
        Lb1:
            int r14 = r14 + 4
            org.objectweb.asm.Item r0 = new org.objectweb.asm.Item
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r17 = r0
            r0 = r17
            r1 = r15
            r2 = r16
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            r0.a(r1, r2)
            r0 = r17
            int r0 = r0.j
            r1 = r8
            int r1 = r1.length
            int r0 = r0 % r1
            r18 = r0
            r0 = r17
            r1 = r8
            r2 = r18
            r1 = r1[r2]
            r0.k = r1
            r0 = r8
            r1 = r18
            r2 = r17
            r0[r1] = r2
            int r13 = r13 + 1
            goto L63
        Lea:
            r0 = r6
            r1 = r10
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r13 = r0
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r2 = r13
            r3 = 62
            int r2 = r2 + r3
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            r1 = r6
            byte[] r1 = r1.b
            r2 = r10
            r3 = 10
            int r2 = r2 + r3
            r3 = r13
            r4 = 2
            int r3 = r3 - r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r7
            r1 = r12
            r0.z = r1
            r0 = r7
            r1 = r14
            r0.A = r1
            return
    }

    public ClassReader(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            byte[] r1 = a(r1, r2)
            r0.<init>(r1)
            return
    }

    public ClassReader(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            r0 = r6
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = r1
            r2.<init>()
            r2 = r7
            r3 = 46
            r4 = 47
            java.lang.String r2 = r2.replace(r3, r4)
            java.lang.StringBuffer r1 = r1.append(r2)
            java.lang.String r2 = ".class"
            java.lang.StringBuffer r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.InputStream r1 = java.lang.ClassLoader.getSystemResourceAsStream(r1)
            r2 = 1
            byte[] r1 = a(r1, r2)
            r0.<init>(r1)
            return
    }

    private static byte[] a(java.io.InputStream r6, boolean r7) throws java.io.IOException {
            r0 = r6
            if (r0 != 0) goto Lf
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Class not found"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r6
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L96
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L96
            r8 = r0
            r0 = 0
            r9 = r0
        L18:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r8
            int r3 = r3.length     // Catch: java.lang.Throwable -> L96
            r4 = r9
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)     // Catch: java.lang.Throwable -> L96
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L4f
            r0 = r9
            r1 = r8
            int r1 = r1.length     // Catch: java.lang.Throwable -> L96
            if (r0 >= r1) goto L41
            r0 = r9
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L96
            r11 = r0
            r0 = r8
            r1 = 0
            r2 = r11
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L96
            r0 = r11
            r8 = r0
        L41:
            r0 = r8
            r11 = r0
            r0 = r7
            if (r0 == 0) goto L4c
            r0 = r6
            r0.close()
        L4c:
            r0 = r11
            return r0
        L4f:
            r0 = r9
            r1 = r10
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r8
            int r1 = r1.length     // Catch: java.lang.Throwable -> L96
            if (r0 != r1) goto L93
            r0 = r6
            int r0 = r0.read()     // Catch: java.lang.Throwable -> L96
            r11 = r0
            r0 = r11
            if (r0 >= 0) goto L73
            r0 = r8
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r6
            r0.close()
        L70:
            r0 = r12
            return r0
        L73:
            r0 = r8
            int r0 = r0.length     // Catch: java.lang.Throwable -> L96
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L96
            r12 = r0
            r0 = r8
            r1 = 0
            r2 = r12
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L96
            r0 = r12
            r1 = r9
            int r9 = r9 + 1
            r2 = r11
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L96
            r0[r1] = r2     // Catch: java.lang.Throwable -> L96
            r0 = r12
            r8 = r0
        L93:
            goto L18
        L96:
            r13 = move-exception
            r0 = r7
            if (r0 == 0) goto La0
            r0 = r6
            r0.close()
        La0:
            r0 = r13
            throw r0
    }

    public void accept(org.objectweb.asm.ClassVisitor r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            org.objectweb.asm.Attribute[] r2 = new org.objectweb.asm.Attribute[r2]
            r3 = r7
            r0.accept(r1, r2, r3)
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r12, org.objectweb.asm.Attribute[] r13, int r14) {
            r11 = this;
            r0 = r11
            int r0 = r0.header
            r15 = r0
            r0 = r11
            int r0 = r0.d
            char[] r0 = new char[r0]
            r16 = r0
            org.objectweb.asm.Context r0 = new org.objectweb.asm.Context
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            r1 = r13
            r0.a = r1
            r0 = r17
            r1 = r14
            r0.b = r1
            r0 = r17
            r1 = r16
            r0.c = r1
            r0 = r11
            r1 = r15
            int r0 = r0.readUnsignedShort(r1)
            r18 = r0
            r0 = r11
            r1 = r15
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readClass(r1, r2)
            r19 = r0
            r0 = r11
            r1 = r15
            r2 = 4
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readClass(r1, r2)
            r20 = r0
            r0 = r11
            r1 = r15
            r2 = 6
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            java.lang.String[] r0 = new java.lang.String[r0]
            r21 = r0
            int r15 = r15 + 8
            r0 = 0
            r22 = r0
        L5e:
            r0 = r22
            r1 = r21
            int r1 = r1.length
            if (r0 >= r1) goto L7c
            r0 = r21
            r1 = r22
            r2 = r11
            r3 = r15
            r4 = r16
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r15 = r15 + 2
            int r22 = r22 + 1
            goto L5e
        L7c:
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = 0
            r29 = r0
            r0 = 0
            r30 = r0
            r0 = 0
            r31 = r0
            r0 = 0
            r32 = r0
            r0 = 0
            r33 = r0
            r0 = r11
            int r0 = r0.a()
            r15 = r0
            r0 = r11
            r1 = r15
            int r0 = r0.readUnsignedShort(r1)
            r34 = r0
        Lae:
            r0 = r34
            if (r0 <= 0) goto L28e
            r0 = r11
            r1 = r15
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r35 = r0
            java.lang.String r0 = "SourceFile"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lda
            r0 = r11
            r1 = r15
            r2 = 8
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r23 = r0
            goto L278
        Lda:
            java.lang.String r0 = "InnerClasses"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lef
            r0 = r15
            r1 = 8
            int r0 = r0 + r1
            r32 = r0
            goto L278
        Lef:
            java.lang.String r0 = "EnclosingMethod"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13a
            r0 = r11
            r1 = r15
            r2 = 8
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readClass(r1, r2)
            r25 = r0
            r0 = r11
            r1 = r15
            r2 = 10
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r36 = r0
            r0 = r36
            if (r0 == 0) goto L137
            r0 = r11
            r1 = r11
            int[] r1 = r1.a
            r2 = r36
            r1 = r1[r2]
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r26 = r0
            r0 = r11
            r1 = r11
            int[] r1 = r1.a
            r2 = r36
            r1 = r1[r2]
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r27 = r0
        L137:
            goto L278
        L13a:
            java.lang.String r0 = "Signature"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L155
            r0 = r11
            r1 = r15
            r2 = 8
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r22 = r0
            goto L278
        L155:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16a
            r0 = r15
            r1 = 8
            int r0 = r0 + r1
            r28 = r0
            goto L278
        L16a:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17f
            r0 = r15
            r1 = 8
            int r0 = r0 + r1
            r30 = r0
            goto L278
        L17f:
            java.lang.String r0 = "Deprecated"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L194
            r0 = r18
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r18 = r0
            goto L278
        L194:
            java.lang.String r0 = "Synthetic"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a9
            r0 = r18
            r1 = 266240(0x41000, float:3.73082E-40)
            r0 = r0 | r1
            r18 = r0
            goto L278
        L1a9:
            java.lang.String r0 = "SourceDebugExtension"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d2
            r0 = r11
            r1 = r15
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r36 = r0
            r0 = r11
            r1 = r15
            r2 = 8
            int r1 = r1 + r2
            r2 = r36
            r3 = r36
            char[] r3 = new char[r3]
            java.lang.String r0 = r0.a(r1, r2, r3)
            r24 = r0
            goto L278
        L1d2:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e7
            r0 = r15
            r1 = 8
            int r0 = r0 + r1
            r29 = r0
            goto L278
        L1e7:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1fc
            r0 = r15
            r1 = 8
            int r0 = r0 + r1
            r31 = r0
            goto L278
        L1fc:
            java.lang.String r0 = "BootstrapMethods"
            r1 = r35
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24e
            r0 = r11
            r1 = r15
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            int[] r0 = new int[r0]
            r36 = r0
            r0 = 0
            r37 = r0
            r0 = r15
            r1 = 10
            int r0 = r0 + r1
            r38 = r0
        L21e:
            r0 = r37
            r1 = r36
            int r1 = r1.length
            if (r0 >= r1) goto L244
            r0 = r36
            r1 = r37
            r2 = r38
            r0[r1] = r2
            r0 = r38
            r1 = 2
            r2 = r11
            r3 = r38
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 << r2
            int r0 = r0 + r1
            r38 = r0
            int r37 = r37 + 1
            goto L21e
        L244:
            r0 = r17
            r1 = r36
            r0.d = r1
            goto L278
        L24e:
            r0 = r11
            r1 = r13
            r2 = r35
            r3 = r15
            r4 = 8
            int r3 = r3 + r4
            r4 = r11
            r5 = r15
            r6 = 4
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            r5 = r16
            r6 = -1
            r7 = 0
            org.objectweb.asm.Attribute r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            r36 = r0
            r0 = r36
            if (r0 == 0) goto L278
            r0 = r36
            r1 = r33
            r0.a = r1
            r0 = r36
            r33 = r0
        L278:
            r0 = r15
            r1 = 6
            r2 = r11
            r3 = r15
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r15 = r0
            int r34 = r34 + (-1)
            goto Lae
        L28e:
            r0 = r12
            r1 = r11
            r2 = r11
            int[] r2 = r2.a
            r3 = 1
            r2 = r2[r3]
            r3 = 7
            int r2 = r2 - r3
            int r1 = r1.readInt(r2)
            r2 = r18
            r3 = r19
            r4 = r22
            r5 = r20
            r6 = r21
            r0.visit(r1, r2, r3, r4, r5, r6)
            r0 = r14
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L2c1
            r0 = r23
            if (r0 != 0) goto L2b9
            r0 = r24
            if (r0 == 0) goto L2c1
        L2b9:
            r0 = r12
            r1 = r23
            r2 = r24
            r0.visitSource(r1, r2)
        L2c1:
            r0 = r25
            if (r0 == 0) goto L2d0
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r0.visitOuterClass(r1, r2, r3)
        L2d0:
            r0 = r28
            if (r0 == 0) goto L308
            r0 = r11
            r1 = r28
            int r0 = r0.readUnsignedShort(r1)
            r34 = r0
            r0 = r28
            r1 = 2
            int r0 = r0 + r1
            r35 = r0
        L2e3:
            r0 = r34
            if (r0 <= 0) goto L308
            r0 = r11
            r1 = r35
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            r3 = 1
            r4 = r12
            r5 = r11
            r6 = r35
            r7 = r16
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r6 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitAnnotation(r5, r6)
            int r0 = r0.a(r1, r2, r3, r4)
            r35 = r0
            int r34 = r34 + (-1)
            goto L2e3
        L308:
            r0 = r29
            if (r0 == 0) goto L340
            r0 = r11
            r1 = r29
            int r0 = r0.readUnsignedShort(r1)
            r34 = r0
            r0 = r29
            r1 = 2
            int r0 = r0 + r1
            r35 = r0
        L31b:
            r0 = r34
            if (r0 <= 0) goto L340
            r0 = r11
            r1 = r35
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            r3 = 1
            r4 = r12
            r5 = r11
            r6 = r35
            r7 = r16
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r6 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitAnnotation(r5, r6)
            int r0 = r0.a(r1, r2, r3, r4)
            r35 = r0
            int r34 = r34 + (-1)
            goto L31b
        L340:
            r0 = r30
            if (r0 == 0) goto L38c
            r0 = r11
            r1 = r30
            int r0 = r0.readUnsignedShort(r1)
            r34 = r0
            r0 = r30
            r1 = 2
            int r0 = r0 + r1
            r35 = r0
        L353:
            r0 = r34
            if (r0 <= 0) goto L38c
            r0 = r11
            r1 = r17
            r2 = r35
            int r0 = r0.a(r1, r2)
            r35 = r0
            r0 = r11
            r1 = r35
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            r3 = 1
            r4 = r12
            r5 = r17
            int r5 = r5.i
            r6 = r17
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r11
            r8 = r35
            r9 = r16
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitTypeAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
            r35 = r0
            int r34 = r34 + (-1)
            goto L353
        L38c:
            r0 = r31
            if (r0 == 0) goto L3d8
            r0 = r11
            r1 = r31
            int r0 = r0.readUnsignedShort(r1)
            r34 = r0
            r0 = r31
            r1 = 2
            int r0 = r0 + r1
            r35 = r0
        L39f:
            r0 = r34
            if (r0 <= 0) goto L3d8
            r0 = r11
            r1 = r17
            r2 = r35
            int r0 = r0.a(r1, r2)
            r35 = r0
            r0 = r11
            r1 = r35
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            r3 = 1
            r4 = r12
            r5 = r17
            int r5 = r5.i
            r6 = r17
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r11
            r8 = r35
            r9 = r16
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitTypeAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
            r35 = r0
            int r34 = r34 + (-1)
            goto L39f
        L3d8:
            r0 = r33
            if (r0 == 0) goto L3f7
            r0 = r33
            org.objectweb.asm.Attribute r0 = r0.a
            r34 = r0
            r0 = r33
            r1 = 0
            r0.a = r1
            r0 = r12
            r1 = r33
            r0.visitAttribute(r1)
            r0 = r34
            r33 = r0
            goto L3d8
        L3f7:
            r0 = r32
            if (r0 == 0) goto L441
            r0 = r32
            r1 = 2
            int r0 = r0 + r1
            r34 = r0
            r0 = r11
            r1 = r32
            int r0 = r0.readUnsignedShort(r1)
            r35 = r0
        L40a:
            r0 = r35
            if (r0 <= 0) goto L441
            r0 = r12
            r1 = r11
            r2 = r34
            r3 = r16
            java.lang.String r1 = r1.readClass(r2, r3)
            r2 = r11
            r3 = r34
            r4 = 2
            int r3 = r3 + r4
            r4 = r16
            java.lang.String r2 = r2.readClass(r3, r4)
            r3 = r11
            r4 = r34
            r5 = 4
            int r4 = r4 + r5
            r5 = r16
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r4 = r11
            r5 = r34
            r6 = 6
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r0.visitInnerClass(r1, r2, r3, r4)
            int r34 = r34 + 8
            int r35 = r35 + (-1)
            goto L40a
        L441:
            r0 = r11
            int r0 = r0.header
            r1 = 10
            int r0 = r0 + r1
            r1 = 2
            r2 = r21
            int r2 = r2.length
            int r1 = r1 * r2
            int r0 = r0 + r1
            r15 = r0
            r0 = r11
            r1 = r15
            r2 = 2
            int r1 = r1 - r2
            int r0 = r0.readUnsignedShort(r1)
            r34 = r0
        L45a:
            r0 = r34
            if (r0 <= 0) goto L470
            r0 = r11
            r1 = r12
            r2 = r17
            r3 = r15
            int r0 = r0.a(r1, r2, r3)
            r15 = r0
            int r34 = r34 + (-1)
            goto L45a
        L470:
            int r15 = r15 + 2
            r0 = r11
            r1 = r15
            r2 = 2
            int r1 = r1 - r2
            int r0 = r0.readUnsignedShort(r1)
            r34 = r0
        L47d:
            r0 = r34
            if (r0 <= 0) goto L493
            r0 = r11
            r1 = r12
            r2 = r17
            r3 = r15
            int r0 = r0.b(r1, r2, r3)
            r15 = r0
            int r34 = r34 + (-1)
            goto L47d
        L493:
            r0 = r12
            r0.visitEnd()
            return
    }

    private int a(org.objectweb.asm.ClassVisitor r12, org.objectweb.asm.Context r13, int r14) {
            r11 = this;
            r0 = r13
            char[] r0 = r0.c
            r15 = r0
            r0 = r11
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r16 = r0
            r0 = r11
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r17 = r0
            r0 = r11
            r1 = r14
            r2 = 4
            int r1 = r1 + r2
            r2 = r15
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r18 = r0
            int r14 = r14 + 6
            r0 = 0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = r11
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r26 = r0
        L42:
            r0 = r26
            if (r0 <= 0) goto L14f
            r0 = r11
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r27 = r0
            java.lang.String r0 = "ConstantValue"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
            r0 = r11
            r1 = r14
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r28 = r0
            r0 = r28
            if (r0 != 0) goto L70
            r0 = 0
            goto L78
        L70:
            r0 = r11
            r1 = r28
            r2 = r15
            java.lang.Object r0 = r0.readConst(r1, r2)
        L78:
            r24 = r0
            goto L13c
        L7d:
            java.lang.String r0 = "Signature"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L97
            r0 = r11
            r1 = r14
            r2 = 8
            int r1 = r1 + r2
            r2 = r15
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r19 = r0
            goto L13c
        L97:
            java.lang.String r0 = "Deprecated"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lac
            r0 = r16
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r16 = r0
            goto L13c
        Lac:
            java.lang.String r0 = "Synthetic"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc1
            r0 = r16
            r1 = 266240(0x41000, float:3.73082E-40)
            r0 = r0 | r1
            r16 = r0
            goto L13c
        Lc1:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld5
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r20 = r0
            goto L13c
        Ld5:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le9
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r22 = r0
            goto L13c
        Le9:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lfd
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r21 = r0
            goto L13c
        Lfd:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L111
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r23 = r0
            goto L13c
        L111:
            r0 = r11
            r1 = r13
            org.objectweb.asm.Attribute[] r1 = r1.a
            r2 = r27
            r3 = r14
            r4 = 8
            int r3 = r3 + r4
            r4 = r11
            r5 = r14
            r6 = 4
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            r5 = r15
            r6 = -1
            r7 = 0
            org.objectweb.asm.Attribute r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            r28 = r0
            r0 = r28
            if (r0 == 0) goto L13c
            r0 = r28
            r1 = r25
            r0.a = r1
            r0 = r28
            r25 = r0
        L13c:
            r0 = r14
            r1 = 6
            r2 = r11
            r3 = r14
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r14 = r0
            int r26 = r26 + (-1)
            goto L42
        L14f:
            int r14 = r14 + 2
            r0 = r12
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r24
            org.objectweb.asm.FieldVisitor r0 = r0.visitField(r1, r2, r3, r4, r5)
            r26 = r0
            r0 = r26
            if (r0 != 0) goto L169
            r0 = r14
            return r0
        L169:
            r0 = r20
            if (r0 == 0) goto L1a2
            r0 = r11
            r1 = r20
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r20
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L17c:
            r0 = r27
            if (r0 <= 0) goto L1a2
            r0 = r11
            r1 = r28
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r26
            r5 = r11
            r6 = r28
            r7 = r15
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r6 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitAnnotation(r5, r6)
            int r0 = r0.a(r1, r2, r3, r4)
            r28 = r0
            int r27 = r27 + (-1)
            goto L17c
        L1a2:
            r0 = r21
            if (r0 == 0) goto L1db
            r0 = r11
            r1 = r21
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r21
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L1b5:
            r0 = r27
            if (r0 <= 0) goto L1db
            r0 = r11
            r1 = r28
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r26
            r5 = r11
            r6 = r28
            r7 = r15
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r6 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitAnnotation(r5, r6)
            int r0 = r0.a(r1, r2, r3, r4)
            r28 = r0
            int r27 = r27 + (-1)
            goto L1b5
        L1db:
            r0 = r22
            if (r0 == 0) goto L225
            r0 = r11
            r1 = r22
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r22
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L1ee:
            r0 = r27
            if (r0 <= 0) goto L225
            r0 = r11
            r1 = r13
            r2 = r28
            int r0 = r0.a(r1, r2)
            r28 = r0
            r0 = r11
            r1 = r28
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r26
            r5 = r13
            int r5 = r5.i
            r6 = r13
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r11
            r8 = r28
            r9 = r15
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitTypeAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
            r28 = r0
            int r27 = r27 + (-1)
            goto L1ee
        L225:
            r0 = r23
            if (r0 == 0) goto L26f
            r0 = r11
            r1 = r23
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r23
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L238:
            r0 = r27
            if (r0 <= 0) goto L26f
            r0 = r11
            r1 = r13
            r2 = r28
            int r0 = r0.a(r1, r2)
            r28 = r0
            r0 = r11
            r1 = r28
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r26
            r5 = r13
            int r5 = r5.i
            r6 = r13
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r11
            r8 = r28
            r9 = r15
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitTypeAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
            r28 = r0
            int r27 = r27 + (-1)
            goto L238
        L26f:
            r0 = r25
            if (r0 == 0) goto L28f
            r0 = r25
            org.objectweb.asm.Attribute r0 = r0.a
            r27 = r0
            r0 = r25
            r1 = 0
            r0.a = r1
            r0 = r26
            r1 = r25
            r0.visitAttribute(r1)
            r0 = r27
            r25 = r0
            goto L26f
        L28f:
            r0 = r26
            r0.visitEnd()
            r0 = r14
            return r0
    }

    private int b(org.objectweb.asm.ClassVisitor r12, org.objectweb.asm.Context r13, int r14) {
            r11 = this;
            r0 = r13
            char[] r0 = r0.c
            r15 = r0
            r0 = r13
            r1 = r11
            r2 = r14
            int r1 = r1.readUnsignedShort(r2)
            r0.e = r1
            r0 = r13
            r1 = r11
            r2 = r14
            r3 = 2
            int r2 = r2 + r3
            r3 = r15
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r0.f = r1
            r0 = r13
            r1 = r11
            r2 = r14
            r3 = 4
            int r2 = r2 + r3
            r3 = r15
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r0.g = r1
            int r14 = r14 + 6
            r0 = 0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = r14
            r28 = r0
            r0 = 0
            r29 = r0
            r0 = r11
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r30 = r0
        L5d:
            r0 = r30
            if (r0 <= 0) goto L1f6
            r0 = r11
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r31 = r0
            java.lang.String r0 = "Code"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8a
            r0 = r13
            int r0 = r0.b
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L1e3
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r16 = r0
            goto L1e3
        L8a:
            java.lang.String r0 = "Exceptions"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lcc
            r0 = r11
            r1 = r14
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            java.lang.String[] r0 = new java.lang.String[r0]
            r18 = r0
            r0 = r14
            r1 = 10
            int r0 = r0 + r1
            r17 = r0
            r0 = 0
            r32 = r0
        Lab:
            r0 = r32
            r1 = r18
            int r1 = r1.length
            if (r0 >= r1) goto Lc9
            r0 = r18
            r1 = r32
            r2 = r11
            r3 = r17
            r4 = r15
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r17 = r17 + 2
            int r32 = r32 + 1
            goto Lab
        Lc9:
            goto L1e3
        Lcc:
            java.lang.String r0 = "Signature"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le6
            r0 = r11
            r1 = r14
            r2 = 8
            int r1 = r1 + r2
            r2 = r15
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r19 = r0
            goto L1e3
        Le6:
            java.lang.String r0 = "Deprecated"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lff
            r0 = r13
            r1 = r0
            int r1 = r1.e
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r2
            r0.e = r1
            goto L1e3
        Lff:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L113
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r21 = r0
            goto L1e3
        L113:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L127
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r23 = r0
            goto L1e3
        L127:
            java.lang.String r0 = "AnnotationDefault"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13b
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r25 = r0
            goto L1e3
        L13b:
            java.lang.String r0 = "Synthetic"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L154
            r0 = r13
            r1 = r0
            int r1 = r1.e
            r2 = 266240(0x41000, float:3.73082E-40)
            r1 = r1 | r2
            r0.e = r1
            goto L1e3
        L154:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L168
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r22 = r0
            goto L1e3
        L168:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17c
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r24 = r0
            goto L1e3
        L17c:
            java.lang.String r0 = "RuntimeVisibleParameterAnnotations"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L190
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r26 = r0
            goto L1e3
        L190:
            java.lang.String r0 = "RuntimeInvisibleParameterAnnotations"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a4
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r27 = r0
            goto L1e3
        L1a4:
            java.lang.String r0 = "MethodParameters"
            r1 = r31
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b8
            r0 = r14
            r1 = 8
            int r0 = r0 + r1
            r20 = r0
            goto L1e3
        L1b8:
            r0 = r11
            r1 = r13
            org.objectweb.asm.Attribute[] r1 = r1.a
            r2 = r31
            r3 = r14
            r4 = 8
            int r3 = r3 + r4
            r4 = r11
            r5 = r14
            r6 = 4
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            r5 = r15
            r6 = -1
            r7 = 0
            org.objectweb.asm.Attribute r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            r32 = r0
            r0 = r32
            if (r0 == 0) goto L1e3
            r0 = r32
            r1 = r29
            r0.a = r1
            r0 = r32
            r29 = r0
        L1e3:
            r0 = r14
            r1 = 6
            r2 = r11
            r3 = r14
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r14 = r0
            int r30 = r30 + (-1)
            goto L5d
        L1f6:
            int r14 = r14 + 2
            r0 = r12
            r1 = r13
            int r1 = r1.e
            r2 = r13
            java.lang.String r2 = r2.f
            r3 = r13
            java.lang.String r3 = r3.g
            r4 = r19
            r5 = r18
            org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            r30 = r0
            r0 = r30
            if (r0 != 0) goto L216
            r0 = r14
            return r0
        L216:
            r0 = r30
            boolean r0 = r0 instanceof org.objectweb.asm.MethodWriter
            if (r0 == 0) goto L2a6
            r0 = r30
            org.objectweb.asm.MethodWriter r0 = (org.objectweb.asm.MethodWriter) r0
            r31 = r0
            r0 = r31
            org.objectweb.asm.ClassWriter r0 = r0.b
            org.objectweb.asm.ClassReader r0 = r0.M
            r1 = r11
            if (r0 != r1) goto L2a6
            r0 = r19
            r1 = r31
            java.lang.String r1 = r1.g
            if (r0 != r1) goto L2a6
            r0 = 0
            r32 = r0
            r0 = r18
            if (r0 != 0) goto L255
            r0 = r31
            int r0 = r0.j
            if (r0 != 0) goto L24f
            r0 = 1
            goto L250
        L24f:
            r0 = 0
        L250:
            r32 = r0
            goto L28f
        L255:
            r0 = r18
            int r0 = r0.length
            r1 = r31
            int r1 = r1.j
            if (r0 != r1) goto L28f
            r0 = 1
            r32 = r0
            r0 = r18
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r33 = r0
        L26a:
            r0 = r33
            if (r0 < 0) goto L28f
            int r17 = r17 + (-2)
            r0 = r31
            int[] r0 = r0.k
            r1 = r33
            r0 = r0[r1]
            r1 = r11
            r2 = r17
            int r1 = r1.readUnsignedShort(r2)
            if (r0 == r1) goto L289
            r0 = 0
            r32 = r0
            goto L28f
        L289:
            int r33 = r33 + (-1)
            goto L26a
        L28f:
            r0 = r32
            if (r0 == 0) goto L2a6
            r0 = r31
            r1 = r28
            r0.h = r1
            r0 = r31
            r1 = r14
            r2 = r28
            int r1 = r1 - r2
            r0.i = r1
            r0 = r14
            return r0
        L2a6:
            r0 = r20
            if (r0 == 0) goto L2e4
            r0 = r11
            byte[] r0 = r0.b
            r1 = r20
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r31 = r0
            r0 = r20
            r1 = 1
            int r0 = r0 + r1
            r32 = r0
        L2be:
            r0 = r31
            if (r0 <= 0) goto L2e4
            r0 = r30
            r1 = r11
            r2 = r32
            r3 = r15
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r2 = r11
            r3 = r32
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r0.visitParameter(r1, r2)
            int r31 = r31 + (-1)
            r0 = r32
            r1 = 4
            int r0 = r0 + r1
            r32 = r0
            goto L2be
        L2e4:
            r0 = r25
            if (r0 == 0) goto L306
            r0 = r30
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotationDefault()
            r31 = r0
            r0 = r11
            r1 = r25
            r2 = r15
            r3 = 0
            r4 = r31
            int r0 = r0.a(r1, r2, r3, r4)
            r0 = r31
            if (r0 == 0) goto L306
            r0 = r31
            r0.visitEnd()
        L306:
            r0 = r21
            if (r0 == 0) goto L33f
            r0 = r11
            r1 = r21
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r21
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L319:
            r0 = r31
            if (r0 <= 0) goto L33f
            r0 = r11
            r1 = r32
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r30
            r5 = r11
            r6 = r32
            r7 = r15
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r6 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitAnnotation(r5, r6)
            int r0 = r0.a(r1, r2, r3, r4)
            r32 = r0
            int r31 = r31 + (-1)
            goto L319
        L33f:
            r0 = r22
            if (r0 == 0) goto L378
            r0 = r11
            r1 = r22
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r22
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L352:
            r0 = r31
            if (r0 <= 0) goto L378
            r0 = r11
            r1 = r32
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r30
            r5 = r11
            r6 = r32
            r7 = r15
            java.lang.String r5 = r5.readUTF8(r6, r7)
            r6 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitAnnotation(r5, r6)
            int r0 = r0.a(r1, r2, r3, r4)
            r32 = r0
            int r31 = r31 + (-1)
            goto L352
        L378:
            r0 = r23
            if (r0 == 0) goto L3c2
            r0 = r11
            r1 = r23
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r23
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L38b:
            r0 = r31
            if (r0 <= 0) goto L3c2
            r0 = r11
            r1 = r13
            r2 = r32
            int r0 = r0.a(r1, r2)
            r32 = r0
            r0 = r11
            r1 = r32
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r30
            r5 = r13
            int r5 = r5.i
            r6 = r13
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r11
            r8 = r32
            r9 = r15
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitTypeAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
            r32 = r0
            int r31 = r31 + (-1)
            goto L38b
        L3c2:
            r0 = r24
            if (r0 == 0) goto L40c
            r0 = r11
            r1 = r24
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r24
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L3d5:
            r0 = r31
            if (r0 <= 0) goto L40c
            r0 = r11
            r1 = r13
            r2 = r32
            int r0 = r0.a(r1, r2)
            r32 = r0
            r0 = r11
            r1 = r32
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r30
            r5 = r13
            int r5 = r5.i
            r6 = r13
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r11
            r8 = r32
            r9 = r15
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitTypeAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
            r32 = r0
            int r31 = r31 + (-1)
            goto L3d5
        L40c:
            r0 = r26
            if (r0 == 0) goto L41b
            r0 = r11
            r1 = r30
            r2 = r13
            r3 = r26
            r4 = 1
            r0.b(r1, r2, r3, r4)
        L41b:
            r0 = r27
            if (r0 == 0) goto L42a
            r0 = r11
            r1 = r30
            r2 = r13
            r3 = r27
            r4 = 0
            r0.b(r1, r2, r3, r4)
        L42a:
            r0 = r29
            if (r0 == 0) goto L44a
            r0 = r29
            org.objectweb.asm.Attribute r0 = r0.a
            r31 = r0
            r0 = r29
            r1 = 0
            r0.a = r1
            r0 = r30
            r1 = r29
            r0.visitAttribute(r1)
            r0 = r31
            r29 = r0
            goto L42a
        L44a:
            r0 = r16
            if (r0 == 0) goto L45d
            r0 = r30
            r0.visitCode()
            r0 = r11
            r1 = r30
            r2 = r13
            r3 = r16
            r0.a(r1, r2, r3)
        L45d:
            r0 = r30
            r0.visitEnd()
            r0 = r14
            return r0
    }

    private void a(org.objectweb.asm.MethodVisitor r15, org.objectweb.asm.Context r16, int r17) {
            r14 = this;
            r0 = r14
            byte[] r0 = r0.b
            r18 = r0
            r0 = r16
            char[] r0 = r0.c
            r19 = r0
            r0 = r14
            r1 = r17
            int r0 = r0.readUnsignedShort(r1)
            r20 = r0
            r0 = r14
            r1 = r17
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r21 = r0
            r0 = r14
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r22 = r0
            int r17 = r17 + 8
            r0 = r17
            r23 = r0
            r0 = r17
            r1 = r22
            int r0 = r0 + r1
            r24 = r0
            r0 = r16
            r1 = r22
            r2 = 2
            int r1 = r1 + r2
            org.objectweb.asm.Label[] r1 = new org.objectweb.asm.Label[r1]
            r2 = r1; r1 = r0; r0 = r2; 
            r1.h = r2
            r25 = r0
            r0 = r14
            r1 = r22
            r2 = 1
            int r1 = r1 + r2
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
        L4a:
            r0 = r17
            r1 = r24
            if (r0 >= r1) goto L1c1
            r0 = r17
            r1 = r23
            int r0 = r0 - r1
            r26 = r0
            r0 = r18
            r1 = r17
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r27 = r0
            byte[] r0 = org.objectweb.asm.ClassWriter.a
            r1 = r27
            r0 = r0[r1]
            switch(r0) {
                case 0: goto Lbc;
                case 1: goto L1a9;
                case 2: goto L1af;
                case 3: goto L1a9;
                case 4: goto Lbc;
                case 5: goto L1af;
                case 6: goto L1af;
                case 7: goto L1b5;
                case 8: goto L1b5;
                case 9: goto Lc2;
                case 10: goto Ld9;
                case 11: goto L1a9;
                case 12: goto L1af;
                case 13: goto L1af;
                case 14: goto L110;
                case 15: goto L162;
                case 16: goto L1bb;
                case 17: goto Lf0;
                default: goto L1bb;
            }
        Lbc:
            int r17 = r17 + 1
            goto L1be
        Lc2:
            r0 = r14
            r1 = r26
            r2 = r14
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            short r2 = r2.readShort(r3)
            int r1 = r1 + r2
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            int r17 = r17 + 3
            goto L1be
        Ld9:
            r0 = r14
            r1 = r26
            r2 = r14
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            int r17 = r17 + 5
            goto L1be
        Lf0:
            r0 = r18
            r1 = r17
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r27 = r0
            r0 = r27
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto L10a
            int r17 = r17 + 6
            goto L1be
        L10a:
            int r17 = r17 + 4
            goto L1be
        L110:
            r0 = r17
            r1 = 4
            int r0 = r0 + r1
            r1 = r26
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r17 = r0
            r0 = r14
            r1 = r26
            r2 = r14
            r3 = r17
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r0 = r14
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r1 = r14
            r2 = r17
            r3 = 4
            int r2 = r2 + r3
            int r1 = r1.readInt(r2)
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r28 = r0
        L13c:
            r0 = r28
            if (r0 <= 0) goto L15c
            r0 = r14
            r1 = r26
            r2 = r14
            r3 = r17
            r4 = 12
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            int r17 = r17 + 4
            int r28 = r28 + (-1)
            goto L13c
        L15c:
            int r17 = r17 + 12
            goto L1be
        L162:
            r0 = r17
            r1 = 4
            int r0 = r0 + r1
            r1 = r26
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r17 = r0
            r0 = r14
            r1 = r26
            r2 = r14
            r3 = r17
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r0 = r14
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r28 = r0
        L183:
            r0 = r28
            if (r0 <= 0) goto L1a3
            r0 = r14
            r1 = r26
            r2 = r14
            r3 = r17
            r4 = 12
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            int r17 = r17 + 8
            int r28 = r28 + (-1)
            goto L183
        L1a3:
            int r17 = r17 + 8
            goto L1be
        L1a9:
            int r17 = r17 + 2
            goto L1be
        L1af:
            int r17 = r17 + 3
            goto L1be
        L1b5:
            int r17 = r17 + 5
            goto L1be
        L1bb:
            int r17 = r17 + 4
        L1be:
            goto L4a
        L1c1:
            r0 = r14
            r1 = r17
            int r0 = r0.readUnsignedShort(r1)
            r26 = r0
        L1c8:
            r0 = r26
            if (r0 <= 0) goto L225
            r0 = r14
            r1 = r14
            r2 = r17
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r27 = r0
            r0 = r14
            r1 = r14
            r2 = r17
            r3 = 4
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r28 = r0
            r0 = r14
            r1 = r14
            r2 = r17
            r3 = 6
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r29 = r0
            r0 = r14
            r1 = r14
            int[] r1 = r1.a
            r2 = r14
            r3 = r17
            r4 = 8
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r1 = r1[r2]
            r2 = r19
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r30 = r0
            r0 = r15
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r0.visitTryCatchBlock(r1, r2, r3, r4)
            int r17 = r17 + 8
            int r26 = r26 + (-1)
            goto L1c8
        L225:
            int r17 = r17 + 2
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = 0
            r29 = r0
            r0 = -1
            r30 = r0
            r0 = -1
            r31 = r0
            r0 = 0
            r32 = r0
            r0 = 0
            r33 = r0
            r0 = 1
            r34 = r0
            r0 = r16
            int r0 = r0.b
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L251
            r0 = 1
            goto L252
        L251:
            r0 = 0
        L252:
            r35 = r0
            r0 = 0
            r36 = r0
            r0 = 0
            r37 = r0
            r0 = 0
            r38 = r0
            r0 = 0
            r39 = r0
            r0 = 0
            r40 = r0
            r0 = r14
            r1 = r17
            int r0 = r0.readUnsignedShort(r1)
            r41 = r0
        L26a:
            r0 = r41
            if (r0 <= 0) goto L4ea
            r0 = r14
            r1 = r17
            r2 = 2
            int r1 = r1 + r2
            r2 = r19
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r42 = r0
            java.lang.String r0 = "LocalVariableTable"
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2fd
            r0 = r16
            int r0 = r0.b
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L4d7
            r0 = r17
            r1 = 8
            int r0 = r0 + r1
            r32 = r0
            r0 = r14
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r43 = r0
            r0 = r17
            r44 = r0
        L2a1:
            r0 = r43
            if (r0 <= 0) goto L2fa
            r0 = r14
            r1 = r44
            r2 = 10
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r45 = r0
            r0 = r25
            r1 = r45
            r0 = r0[r1]
            if (r0 != 0) goto L2ca
            r0 = r14
            r1 = r45
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r1 = r0
            int r1 = r1.a
            r2 = 1
            r1 = r1 | r2
            r0.a = r1
        L2ca:
            r0 = r45
            r1 = r14
            r2 = r44
            r3 = 12
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int r0 = r0 + r1
            r45 = r0
            r0 = r25
            r1 = r45
            r0 = r0[r1]
            if (r0 != 0) goto L2f1
            r0 = r14
            r1 = r45
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r1 = r0
            int r1 = r1.a
            r2 = 1
            r1 = r1 | r2
            r0.a = r1
        L2f1:
            int r44 = r44 + 10
            int r43 = r43 + (-1)
            goto L2a1
        L2fa:
            goto L4d7
        L2fd:
            java.lang.String r0 = "LocalVariableTypeTable"
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L311
            r0 = r17
            r1 = 8
            int r0 = r0 + r1
            r33 = r0
            goto L4d7
        L311:
            java.lang.String r0 = "LineNumberTable"
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a2
            r0 = r16
            int r0 = r0.b
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L4d7
            r0 = r14
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r43 = r0
            r0 = r17
            r44 = r0
        L332:
            r0 = r43
            if (r0 <= 0) goto L39f
            r0 = r14
            r1 = r44
            r2 = 10
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r45 = r0
            r0 = r25
            r1 = r45
            r0 = r0[r1]
            if (r0 != 0) goto L35b
            r0 = r14
            r1 = r45
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r1 = r0
            int r1 = r1.a
            r2 = 1
            r1 = r1 | r2
            r0.a = r1
        L35b:
            r0 = r25
            r1 = r45
            r0 = r0[r1]
            r46 = r0
        L362:
            r0 = r46
            int r0 = r0.b
            if (r0 <= 0) goto L388
            r0 = r46
            org.objectweb.asm.Label r0 = r0.k
            if (r0 != 0) goto L37e
            r0 = r46
            org.objectweb.asm.Label r1 = new org.objectweb.asm.Label
            r2 = r1
            r2.<init>()
            r0.k = r1
        L37e:
            r0 = r46
            org.objectweb.asm.Label r0 = r0.k
            r46 = r0
            goto L362
        L388:
            r0 = r46
            r1 = r14
            r2 = r44
            r3 = 12
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0.b = r1
            int r44 = r44 + 4
            int r43 = r43 + (-1)
            goto L332
        L39f:
            goto L4d7
        L3a2:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = 8
            int r3 = r3 + r4
            r4 = 1
            int[] r0 = r0.a(r1, r2, r3, r4)
            r26 = r0
            r0 = r26
            int r0 = r0.length
            if (r0 == 0) goto L3cd
            r0 = r14
            r1 = r26
            r2 = 0
            r1 = r1[r2]
            int r0 = r0.readByte(r1)
            r1 = 67
            if (r0 >= r1) goto L3d1
        L3cd:
            r0 = -1
            goto L3db
        L3d1:
            r0 = r14
            r1 = r26
            r2 = 0
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
        L3db:
            r30 = r0
            goto L4d7
        L3e0:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41e
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = 8
            int r3 = r3 + r4
            r4 = 0
            int[] r0 = r0.a(r1, r2, r3, r4)
            r27 = r0
            r0 = r27
            int r0 = r0.length
            if (r0 == 0) goto L40b
            r0 = r14
            r1 = r27
            r2 = 0
            r1 = r1[r2]
            int r0 = r0.readByte(r1)
            r1 = 67
            if (r0 >= r1) goto L40f
        L40b:
            r0 = -1
            goto L419
        L40f:
            r0 = r14
            r1 = r27
            r2 = 0
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
        L419:
            r31 = r0
            goto L4d7
        L41e:
            java.lang.String r0 = "StackMapTable"
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44e
            r0 = r16
            int r0 = r0.b
            r1 = 4
            r0 = r0 & r1
            if (r0 != 0) goto L4d7
            r0 = r17
            r1 = 10
            int r0 = r0 + r1
            r36 = r0
            r0 = r14
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r37 = r0
            r0 = r14
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            goto L4d7
        L44e:
            java.lang.String r0 = "StackMap"
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L481
            r0 = r16
            int r0 = r0.b
            r1 = 4
            r0 = r0 & r1
            if (r0 != 0) goto L4d7
            r0 = 0
            r34 = r0
            r0 = r17
            r1 = 10
            int r0 = r0 + r1
            r36 = r0
            r0 = r14
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r37 = r0
            r0 = r14
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            goto L4d7
        L481:
            r0 = 0
            r43 = r0
        L484:
            r0 = r43
            r1 = r16
            org.objectweb.asm.Attribute[] r1 = r1.a
            int r1 = r1.length
            if (r0 >= r1) goto L4d7
            r0 = r16
            org.objectweb.asm.Attribute[] r0 = r0.a
            r1 = r43
            r0 = r0[r1]
            java.lang.String r0 = r0.type
            r1 = r42
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4d1
            r0 = r16
            org.objectweb.asm.Attribute[] r0 = r0.a
            r1 = r43
            r0 = r0[r1]
            r1 = r14
            r2 = r17
            r3 = 8
            int r2 = r2 + r3
            r3 = r14
            r4 = r17
            r5 = 4
            int r4 = r4 + r5
            int r3 = r3.readInt(r4)
            r4 = r19
            r5 = r23
            r6 = 8
            int r5 = r5 - r6
            r6 = r25
            org.objectweb.asm.Attribute r0 = r0.read(r1, r2, r3, r4, r5, r6)
            r44 = r0
            r0 = r44
            if (r0 == 0) goto L4d1
            r0 = r44
            r1 = r40
            r0.a = r1
            r0 = r44
            r40 = r0
        L4d1:
            int r43 = r43 + 1
            goto L484
        L4d7:
            r0 = r17
            r1 = 6
            r2 = r14
            r3 = r17
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r17 = r0
            int r41 = r41 + (-1)
            goto L26a
        L4ea:
            int r17 = r17 + 2
            r0 = r36
            if (r0 == 0) goto L582
            r0 = r16
            r39 = r0
            r0 = r39
            r1 = -1
            r0.o = r1
            r0 = r39
            r1 = 0
            r0.p = r1
            r0 = r39
            r1 = 0
            r0.q = r1
            r0 = r39
            r1 = 0
            r0.r = r1
            r0 = r39
            r1 = 0
            r0.t = r1
            r0 = r39
            r1 = r21
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.s = r1
            r0 = r39
            r1 = r20
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.u = r1
            r0 = r35
            if (r0 == 0) goto L531
            r0 = r14
            r1 = r16
            r0.a(r1)
        L531:
            r0 = r36
            r41 = r0
        L535:
            r0 = r41
            r1 = r36
            r2 = r37
            int r1 = r1 + r2
            r2 = 2
            int r1 = r1 - r2
            if (r0 >= r1) goto L582
            r0 = r18
            r1 = r41
            r0 = r0[r1]
            r1 = 8
            if (r0 != r1) goto L57c
            r0 = r14
            r1 = r41
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r42 = r0
            r0 = r42
            if (r0 < 0) goto L57c
            r0 = r42
            r1 = r22
            if (r0 >= r1) goto L57c
            r0 = r18
            r1 = r23
            r2 = r42
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L57c
            r0 = r14
            r1 = r42
            r2 = r25
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
        L57c:
            int r41 = r41 + 1
            goto L535
        L582:
            r0 = r23
            r17 = r0
        L585:
            r0 = r17
            r1 = r24
            if (r0 >= r1) goto Lb20
            r0 = r17
            r1 = r23
            int r0 = r0 - r1
            r41 = r0
            r0 = r25
            r1 = r41
            r0 = r0[r1]
            r42 = r0
            r0 = r42
            if (r0 == 0) goto L5e6
            r0 = r42
            org.objectweb.asm.Label r0 = r0.k
            r43 = r0
            r0 = r42
            r1 = 0
            r0.k = r1
            r0 = r15
            r1 = r42
            r0.visitLabel(r1)
            r0 = r16
            int r0 = r0.b
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L5e6
            r0 = r42
            int r0 = r0.b
            if (r0 <= 0) goto L5e6
            r0 = r15
            r1 = r42
            int r1 = r1.b
            r2 = r42
            r0.visitLineNumber(r1, r2)
        L5cc:
            r0 = r43
            if (r0 == 0) goto L5e6
            r0 = r15
            r1 = r43
            int r1 = r1.b
            r2 = r42
            r0.visitLineNumber(r1, r2)
            r0 = r43
            org.objectweb.asm.Label r0 = r0.k
            r43 = r0
            goto L5cc
        L5e6:
            r0 = r39
            if (r0 == 0) goto L669
            r0 = r39
            int r0 = r0.o
            r1 = r41
            if (r0 == r1) goto L5fe
            r0 = r39
            int r0 = r0.o
            r1 = -1
            if (r0 != r1) goto L669
        L5fe:
            r0 = r39
            int r0 = r0.o
            r1 = -1
            if (r0 == r1) goto L64a
            r0 = r34
            if (r0 == 0) goto L611
            r0 = r35
            if (r0 == 0) goto L62d
        L611:
            r0 = r15
            r1 = -1
            r2 = r39
            int r2 = r2.q
            r3 = r39
            java.lang.Object[] r3 = r3.s
            r4 = r39
            int r4 = r4.t
            r5 = r39
            java.lang.Object[] r5 = r5.u
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto L64a
        L62d:
            r0 = r15
            r1 = r39
            int r1 = r1.p
            r2 = r39
            int r2 = r2.r
            r3 = r39
            java.lang.Object[] r3 = r3.s
            r4 = r39
            int r4 = r4.t
            r5 = r39
            java.lang.Object[] r5 = r5.u
            r0.visitFrame(r1, r2, r3, r4, r5)
        L64a:
            r0 = r38
            if (r0 <= 0) goto L663
            r0 = r14
            r1 = r36
            r2 = r34
            r3 = r35
            r4 = r39
            int r0 = r0.a(r1, r2, r3, r4)
            r36 = r0
            int r38 = r38 + (-1)
            goto L5e6
        L663:
            r0 = 0
            r39 = r0
            goto L5e6
        L669:
            r0 = r18
            r1 = r17
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r43 = r0
            byte[] r0 = org.objectweb.asm.ClassWriter.a
            r1 = r43
            r0 = r0[r1]
            switch(r0) {
                case 0: goto L6d0;
                case 1: goto L870;
                case 2: goto L882;
                case 3: goto L85a;
                case 4: goto L6dc;
                case 5: goto L9ea;
                case 6: goto L8c6;
                case 7: goto L8c6;
                case 8: goto L94f;
                case 9: goto L710;
                case 10: goto L729;
                case 11: goto L895;
                case 12: goto L8af;
                case 13: goto L9ff;
                case 14: goto L784;
                case 15: goto L7ef;
                case 16: goto La19;
                case 17: goto L745;
                default: goto La19;
            }
        L6d0:
            r0 = r15
            r1 = r43
            r0.visitInsn(r1)
            int r17 = r17 + 1
            goto La33
        L6dc:
            r0 = r43
            r1 = 54
            if (r0 <= r1) goto L6f8
            int r43 = r43 + (-59)
            r0 = r15
            r1 = 54
            r2 = r43
            r3 = 2
            int r2 = r2 >> r3
            int r1 = r1 + r2
            r2 = r43
            r3 = 3
            r2 = r2 & r3
            r0.visitVarInsn(r1, r2)
            goto L70a
        L6f8:
            int r43 = r43 + (-26)
            r0 = r15
            r1 = 21
            r2 = r43
            r3 = 2
            int r2 = r2 >> r3
            int r1 = r1 + r2
            r2 = r43
            r3 = 3
            r2 = r2 & r3
            r0.visitVarInsn(r1, r2)
        L70a:
            int r17 = r17 + 1
            goto La33
        L710:
            r0 = r15
            r1 = r43
            r2 = r25
            r3 = r41
            r4 = r14
            r5 = r17
            r6 = 1
            int r5 = r5 + r6
            short r4 = r4.readShort(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitJumpInsn(r1, r2)
            int r17 = r17 + 3
            goto La33
        L729:
            r0 = r15
            r1 = r43
            r2 = 33
            int r1 = r1 - r2
            r2 = r25
            r3 = r41
            r4 = r14
            r5 = r17
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitJumpInsn(r1, r2)
            int r17 = r17 + 5
            goto La33
        L745:
            r0 = r18
            r1 = r17
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r43 = r0
            r0 = r43
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto L771
            r0 = r15
            r1 = r14
            r2 = r17
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = r14
            r3 = r17
            r4 = 4
            int r3 = r3 + r4
            short r2 = r2.readShort(r3)
            r0.visitIincInsn(r1, r2)
            int r17 = r17 + 6
            goto La33
        L771:
            r0 = r15
            r1 = r43
            r2 = r14
            r3 = r17
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r0.visitVarInsn(r1, r2)
            int r17 = r17 + 4
            goto La33
        L784:
            r0 = r17
            r1 = 4
            int r0 = r0 + r1
            r1 = r41
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r17 = r0
            r0 = r41
            r1 = r14
            r2 = r17
            int r1 = r1.readInt(r2)
            int r0 = r0 + r1
            r44 = r0
            r0 = r14
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r45 = r0
            r0 = r14
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r46 = r0
            r0 = r46
            r1 = r45
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r47 = r0
            int r17 = r17 + 12
            r0 = 0
            r48 = r0
        L7bc:
            r0 = r48
            r1 = r47
            int r1 = r1.length
            if (r0 >= r1) goto L7dd
            r0 = r47
            r1 = r48
            r2 = r25
            r3 = r41
            r4 = r14
            r5 = r17
            int r4 = r4.readInt(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            int r17 = r17 + 4
            int r48 = r48 + 1
            goto L7bc
        L7dd:
            r0 = r15
            r1 = r45
            r2 = r46
            r3 = r25
            r4 = r44
            r3 = r3[r4]
            r4 = r47
            r0.visitTableSwitchInsn(r1, r2, r3, r4)
            goto La33
        L7ef:
            r0 = r17
            r1 = 4
            int r0 = r0 + r1
            r1 = r41
            r2 = 3
            r1 = r1 & r2
            int r0 = r0 - r1
            r17 = r0
            r0 = r41
            r1 = r14
            r2 = r17
            int r1 = r1.readInt(r2)
            int r0 = r0 + r1
            r44 = r0
            r0 = r14
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r45 = r0
            r0 = r45
            int[] r0 = new int[r0]
            r46 = r0
            r0 = r45
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r47 = r0
            int r17 = r17 + 8
            r0 = 0
            r48 = r0
        L81e:
            r0 = r48
            r1 = r45
            if (r0 >= r1) goto L84a
            r0 = r46
            r1 = r48
            r2 = r14
            r3 = r17
            int r2 = r2.readInt(r3)
            r0[r1] = r2
            r0 = r47
            r1 = r48
            r2 = r25
            r3 = r41
            r4 = r14
            r5 = r17
            r6 = 4
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            int r17 = r17 + 8
            int r48 = r48 + 1
            goto L81e
        L84a:
            r0 = r15
            r1 = r25
            r2 = r44
            r1 = r1[r2]
            r2 = r46
            r3 = r47
            r0.visitLookupSwitchInsn(r1, r2, r3)
            goto La33
        L85a:
            r0 = r15
            r1 = r43
            r2 = r18
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r0.visitVarInsn(r1, r2)
            int r17 = r17 + 2
            goto La33
        L870:
            r0 = r15
            r1 = r43
            r2 = r18
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitIntInsn(r1, r2)
            int r17 = r17 + 2
            goto La33
        L882:
            r0 = r15
            r1 = r43
            r2 = r14
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            short r2 = r2.readShort(r3)
            r0.visitIntInsn(r1, r2)
            int r17 = r17 + 3
            goto La33
        L895:
            r0 = r15
            r1 = r14
            r2 = r18
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r3 = r19
            java.lang.Object r1 = r1.readConst(r2, r3)
            r0.visitLdcInsn(r1)
            int r17 = r17 + 2
            goto La33
        L8af:
            r0 = r15
            r1 = r14
            r2 = r14
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r3 = r19
            java.lang.Object r1 = r1.readConst(r2, r3)
            r0.visitLdcInsn(r1)
            int r17 = r17 + 3
            goto La33
        L8c6:
            r0 = r14
            int[] r0 = r0.a
            r1 = r14
            r2 = r17
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r44 = r0
            r0 = r18
            r1 = r44
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 11
            if (r0 != r1) goto L8e4
            r0 = 1
            goto L8e5
        L8e4:
            r0 = 0
        L8e5:
            r45 = r0
            r0 = r14
            r1 = r44
            r2 = r19
            java.lang.String r0 = r0.readClass(r1, r2)
            r46 = r0
            r0 = r14
            int[] r0 = r0.a
            r1 = r14
            r2 = r44
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r44 = r0
            r0 = r14
            r1 = r44
            r2 = r19
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r47 = r0
            r0 = r14
            r1 = r44
            r2 = 2
            int r1 = r1 + r2
            r2 = r19
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r48 = r0
            r0 = r43
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 >= r1) goto L92d
            r0 = r15
            r1 = r43
            r2 = r46
            r3 = r47
            r4 = r48
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto L93b
        L92d:
            r0 = r15
            r1 = r43
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r45
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
        L93b:
            r0 = r43
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L949
            int r17 = r17 + 5
            goto La33
        L949:
            int r17 = r17 + 3
            goto La33
        L94f:
            r0 = r14
            int[] r0 = r0.a
            r1 = r14
            r2 = r17
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r44 = r0
            r0 = r16
            int[] r0 = r0.d
            r1 = r14
            r2 = r44
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r45 = r0
            r0 = r14
            r1 = r14
            r2 = r45
            int r1 = r1.readUnsignedShort(r2)
            r2 = r19
            java.lang.Object r0 = r0.readConst(r1, r2)
            org.objectweb.asm.Handle r0 = (org.objectweb.asm.Handle) r0
            r46 = r0
            r0 = r14
            r1 = r45
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r47 = r0
            r0 = r47
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r48 = r0
            int r45 = r45 + 4
            r0 = 0
            r49 = r0
        L992:
            r0 = r49
            r1 = r47
            if (r0 >= r1) goto L9b3
            r0 = r48
            r1 = r49
            r2 = r14
            r3 = r14
            r4 = r45
            int r3 = r3.readUnsignedShort(r4)
            r4 = r19
            java.lang.Object r2 = r2.readConst(r3, r4)
            r0[r1] = r2
            int r45 = r45 + 2
            int r49 = r49 + 1
            goto L992
        L9b3:
            r0 = r14
            int[] r0 = r0.a
            r1 = r14
            r2 = r44
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r44 = r0
            r0 = r14
            r1 = r44
            r2 = r19
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r49 = r0
            r0 = r14
            r1 = r44
            r2 = 2
            int r1 = r1 + r2
            r2 = r19
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r50 = r0
            r0 = r15
            r1 = r49
            r2 = r50
            r3 = r46
            r4 = r48
            r0.visitInvokeDynamicInsn(r1, r2, r3, r4)
            int r17 = r17 + 5
            goto La33
        L9ea:
            r0 = r15
            r1 = r43
            r2 = r14
            r3 = r17
            r4 = 1
            int r3 = r3 + r4
            r4 = r19
            java.lang.String r2 = r2.readClass(r3, r4)
            r0.visitTypeInsn(r1, r2)
            int r17 = r17 + 3
            goto La33
        L9ff:
            r0 = r15
            r1 = r18
            r2 = r17
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = r18
            r3 = r17
            r4 = 2
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitIincInsn(r1, r2)
            int r17 = r17 + 3
            goto La33
        La19:
            r0 = r15
            r1 = r14
            r2 = r17
            r3 = 1
            int r2 = r2 + r3
            r3 = r19
            java.lang.String r1 = r1.readClass(r2, r3)
            r2 = r18
            r3 = r17
            r4 = 3
            int r3 = r3 + r4
            r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r0.visitMultiANewArrayInsn(r1, r2)
            int r17 = r17 + 4
        La33:
            r0 = r26
            if (r0 == 0) goto Laa8
            r0 = r28
            r1 = r26
            int r1 = r1.length
            if (r0 >= r1) goto Laa8
            r0 = r30
            r1 = r41
            if (r0 > r1) goto Laa8
            r0 = r30
            r1 = r41
            if (r0 != r1) goto La7b
            r0 = r14
            r1 = r16
            r2 = r26
            r3 = r28
            r2 = r2[r3]
            int r0 = r0.a(r1, r2)
            r44 = r0
            r0 = r14
            r1 = r44
            r2 = 2
            int r1 = r1 + r2
            r2 = r19
            r3 = 1
            r4 = r15
            r5 = r16
            int r5 = r5.i
            r6 = r16
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r14
            r8 = r44
            r9 = r19
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitInsnAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
        La7b:
            int r28 = r28 + 1
            r0 = r28
            r1 = r26
            int r1 = r1.length
            if (r0 >= r1) goto La94
            r0 = r14
            r1 = r26
            r2 = r28
            r1 = r1[r2]
            int r0 = r0.readByte(r1)
            r1 = 67
            if (r0 >= r1) goto La98
        La94:
            r0 = -1
            goto Laa3
        La98:
            r0 = r14
            r1 = r26
            r2 = r28
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
        Laa3:
            r30 = r0
            goto La33
        Laa8:
            r0 = r27
            if (r0 == 0) goto Lb1d
            r0 = r29
            r1 = r27
            int r1 = r1.length
            if (r0 >= r1) goto Lb1d
            r0 = r31
            r1 = r41
            if (r0 > r1) goto Lb1d
            r0 = r31
            r1 = r41
            if (r0 != r1) goto Laf0
            r0 = r14
            r1 = r16
            r2 = r27
            r3 = r29
            r2 = r2[r3]
            int r0 = r0.a(r1, r2)
            r44 = r0
            r0 = r14
            r1 = r44
            r2 = 2
            int r1 = r1 + r2
            r2 = r19
            r3 = 1
            r4 = r15
            r5 = r16
            int r5 = r5.i
            r6 = r16
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r14
            r8 = r44
            r9 = r19
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitInsnAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
        Laf0:
            int r29 = r29 + 1
            r0 = r29
            r1 = r27
            int r1 = r1.length
            if (r0 >= r1) goto Lb09
            r0 = r14
            r1 = r27
            r2 = r29
            r1 = r1[r2]
            int r0 = r0.readByte(r1)
            r1 = 67
            if (r0 >= r1) goto Lb0d
        Lb09:
            r0 = -1
            goto Lb18
        Lb0d:
            r0 = r14
            r1 = r27
            r2 = r29
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
        Lb18:
            r31 = r0
            goto Laa8
        Lb1d:
            goto L585
        Lb20:
            r0 = r25
            r1 = r22
            r0 = r0[r1]
            if (r0 == 0) goto Lb31
            r0 = r15
            r1 = r25
            r2 = r22
            r1 = r1[r2]
            r0.visitLabel(r1)
        Lb31:
            r0 = r16
            int r0 = r0.b
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto Lc2f
            r0 = r32
            if (r0 == 0) goto Lc2f
            r0 = 0
            r41 = r0
            r0 = r33
            if (r0 == 0) goto Lb91
            r0 = r33
            r1 = 2
            int r0 = r0 + r1
            r17 = r0
            r0 = r14
            r1 = r33
            int r0 = r0.readUnsignedShort(r1)
            r1 = 3
            int r0 = r0 * r1
            int[] r0 = new int[r0]
            r41 = r0
            r0 = r41
            int r0 = r0.length
            r42 = r0
        Lb5d:
            r0 = r42
            if (r0 <= 0) goto Lb91
            r0 = r41
            int r42 = r42 + (-1)
            r1 = r42
            r2 = r17
            r3 = 6
            int r2 = r2 + r3
            r0[r1] = r2
            r0 = r41
            int r42 = r42 + (-1)
            r1 = r42
            r2 = r14
            r3 = r17
            r4 = 8
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r0[r1] = r2
            r0 = r41
            int r42 = r42 + (-1)
            r1 = r42
            r2 = r14
            r3 = r17
            int r2 = r2.readUnsignedShort(r3)
            r0[r1] = r2
            int r17 = r17 + 10
            goto Lb5d
        Lb91:
            r0 = r32
            r1 = 2
            int r0 = r0 + r1
            r17 = r0
            r0 = r14
            r1 = r32
            int r0 = r0.readUnsignedShort(r1)
            r42 = r0
        Lb9e:
            r0 = r42
            if (r0 <= 0) goto Lc2f
            r0 = r14
            r1 = r17
            int r0 = r0.readUnsignedShort(r1)
            r43 = r0
            r0 = r14
            r1 = r17
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r44 = r0
            r0 = r14
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r45 = r0
            r0 = 0
            r46 = r0
            r0 = r41
            if (r0 == 0) goto Lbfe
            r0 = 0
            r47 = r0
        Lbc8:
            r0 = r47
            r1 = r41
            int r1 = r1.length
            if (r0 >= r1) goto Lbfe
            r0 = r41
            r1 = r47
            r0 = r0[r1]
            r1 = r43
            if (r0 != r1) goto Lbf8
            r0 = r41
            r1 = r47
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = r45
            if (r0 != r1) goto Lbf8
            r0 = r14
            r1 = r41
            r2 = r47
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = r19
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r46 = r0
            goto Lbfe
        Lbf8:
            int r47 = r47 + 3
            goto Lbc8
        Lbfe:
            r0 = r15
            r1 = r14
            r2 = r17
            r3 = 4
            int r2 = r2 + r3
            r3 = r19
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r2 = r14
            r3 = r17
            r4 = 6
            int r3 = r3 + r4
            r4 = r19
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = r46
            r4 = r25
            r5 = r43
            r4 = r4[r5]
            r5 = r25
            r6 = r43
            r7 = r44
            int r6 = r6 + r7
            r5 = r5[r6]
            r6 = r45
            r0.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            int r17 = r17 + 10
            int r42 = r42 + (-1)
            goto Lb9e
        Lc2f:
            r0 = r26
            if (r0 == 0) goto Lc8f
            r0 = 0
            r41 = r0
        Lc37:
            r0 = r41
            r1 = r26
            int r1 = r1.length
            if (r0 >= r1) goto Lc8f
            r0 = r14
            r1 = r26
            r2 = r41
            r1 = r1[r2]
            int r0 = r0.readByte(r1)
            r1 = 1
            int r0 = r0 >> r1
            r1 = 32
            if (r0 != r1) goto Lc89
            r0 = r14
            r1 = r16
            r2 = r26
            r3 = r41
            r2 = r2[r3]
            int r0 = r0.a(r1, r2)
            r42 = r0
            r0 = r14
            r1 = r42
            r2 = 2
            int r1 = r1 + r2
            r2 = r19
            r3 = 1
            r4 = r15
            r5 = r16
            int r5 = r5.i
            r6 = r16
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r16
            org.objectweb.asm.Label[] r7 = r7.l
            r8 = r16
            org.objectweb.asm.Label[] r8 = r8.m
            r9 = r16
            int[] r9 = r9.n
            r10 = r14
            r11 = r42
            r12 = r19
            java.lang.String r10 = r10.readUTF8(r11, r12)
            r11 = 1
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitLocalVariableAnnotation(r5, r6, r7, r8, r9, r10, r11)
            int r0 = r0.a(r1, r2, r3, r4)
            r42 = r0
        Lc89:
            int r41 = r41 + 1
            goto Lc37
        Lc8f:
            r0 = r27
            if (r0 == 0) goto Lcef
            r0 = 0
            r41 = r0
        Lc97:
            r0 = r41
            r1 = r27
            int r1 = r1.length
            if (r0 >= r1) goto Lcef
            r0 = r14
            r1 = r27
            r2 = r41
            r1 = r1[r2]
            int r0 = r0.readByte(r1)
            r1 = 1
            int r0 = r0 >> r1
            r1 = 32
            if (r0 != r1) goto Lce9
            r0 = r14
            r1 = r16
            r2 = r27
            r3 = r41
            r2 = r2[r3]
            int r0 = r0.a(r1, r2)
            r42 = r0
            r0 = r14
            r1 = r42
            r2 = 2
            int r1 = r1 + r2
            r2 = r19
            r3 = 1
            r4 = r15
            r5 = r16
            int r5 = r5.i
            r6 = r16
            org.objectweb.asm.TypePath r6 = r6.j
            r7 = r16
            org.objectweb.asm.Label[] r7 = r7.l
            r8 = r16
            org.objectweb.asm.Label[] r8 = r8.m
            r9 = r16
            int[] r9 = r9.n
            r10 = r14
            r11 = r42
            r12 = r19
            java.lang.String r10 = r10.readUTF8(r11, r12)
            r11 = 0
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitLocalVariableAnnotation(r5, r6, r7, r8, r9, r10, r11)
            int r0 = r0.a(r1, r2, r3, r4)
            r42 = r0
        Lce9:
            int r41 = r41 + 1
            goto Lc97
        Lcef:
            r0 = r40
            if (r0 == 0) goto Ld0e
            r0 = r40
            org.objectweb.asm.Attribute r0 = r0.a
            r41 = r0
            r0 = r40
            r1 = 0
            r0.a = r1
            r0 = r15
            r1 = r40
            r0.visitAttribute(r1)
            r0 = r41
            r40 = r0
            goto Lcef
        Ld0e:
            r0 = r15
            r1 = r20
            r2 = r21
            r0.visitMaxs(r1, r2)
            return
    }

    private int[] a(org.objectweb.asm.MethodVisitor r12, org.objectweb.asm.Context r13, int r14, boolean r15) {
            r11 = this;
            r0 = r13
            char[] r0 = r0.c
            r16 = r0
            r0 = r11
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            int[] r0 = new int[r0]
            r17 = r0
            int r14 = r14 + 2
            r0 = 0
            r18 = r0
        L15:
            r0 = r18
            r1 = r17
            int r1 = r1.length
            if (r0 >= r1) goto L164
            r0 = r17
            r1 = r18
            r2 = r14
            r0[r1] = r2
            r0 = r11
            r1 = r14
            int r0 = r0.readInt(r1)
            r19 = r0
            r0 = r19
            r1 = 24
            int r0 = r0 >>> r1
            switch(r0) {
                case 0: goto La0;
                case 1: goto La0;
                case 19: goto La6;
                case 20: goto La6;
                case 21: goto La6;
                case 22: goto La0;
                case 64: goto Lac;
                case 65: goto Lac;
                case 71: goto Lf4;
                case 72: goto Lf4;
                case 73: goto Lf4;
                case 74: goto Lf4;
                case 75: goto Lf4;
                default: goto Lfa;
            }
        La0:
            int r14 = r14 + 2
            goto Lfd
        La6:
            int r14 = r14 + 1
            goto Lfd
        Lac:
            r0 = r11
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r20 = r0
        Lb5:
            r0 = r20
            if (r0 <= 0) goto Lee
            r0 = r11
            r1 = r14
            r2 = 3
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r21 = r0
            r0 = r11
            r1 = r14
            r2 = 5
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r22 = r0
            r0 = r11
            r1 = r21
            r2 = r13
            org.objectweb.asm.Label[] r2 = r2.h
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r0 = r11
            r1 = r21
            r2 = r22
            int r1 = r1 + r2
            r2 = r13
            org.objectweb.asm.Label[] r2 = r2.h
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            int r14 = r14 + 6
            int r20 = r20 + (-1)
            goto Lb5
        Lee:
            int r14 = r14 + 3
            goto Lfd
        Lf4:
            int r14 = r14 + 4
            goto Lfd
        Lfa:
            int r14 = r14 + 3
        Lfd:
            r0 = r11
            r1 = r14
            int r0 = r0.readByte(r1)
            r20 = r0
            r0 = r19
            r1 = 24
            int r0 = r0 >>> r1
            r1 = 66
            if (r0 != r1) goto L14d
            r0 = r20
            if (r0 != 0) goto L117
            r0 = 0
            goto L123
        L117:
            org.objectweb.asm.TypePath r0 = new org.objectweb.asm.TypePath
            r1 = r0
            r2 = r11
            byte[] r2 = r2.b
            r3 = r14
            r1.<init>(r2, r3)
        L123:
            r21 = r0
            r0 = r14
            r1 = 1
            r2 = 2
            r3 = r20
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r14 = r0
            r0 = r11
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            r3 = 1
            r4 = r12
            r5 = r19
            r6 = r21
            r7 = r11
            r8 = r14
            r9 = r16
            java.lang.String r7 = r7.readUTF8(r8, r9)
            r8 = r15
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitTryCatchAnnotation(r5, r6, r7, r8)
            int r0 = r0.a(r1, r2, r3, r4)
            r14 = r0
            goto L15e
        L14d:
            r0 = r11
            r1 = r14
            r2 = 3
            int r1 = r1 + r2
            r2 = 2
            r3 = r20
            int r2 = r2 * r3
            int r1 = r1 + r2
            r2 = r16
            r3 = 1
            r4 = 0
            int r0 = r0.a(r1, r2, r3, r4)
            r14 = r0
        L15e:
            int r18 = r18 + 1
            goto L15
        L164:
            r0 = r17
            return r0
    }

    private int a(org.objectweb.asm.Context r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r8
            int r0 = r0.readInt(r1)
            r9 = r0
            r0 = r9
            r1 = 24
            int r0 = r0 >>> r1
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L7c;
                case 19: goto L87;
                case 20: goto L87;
                case 21: goto L87;
                case 22: goto L7c;
                case 64: goto L92;
                case 65: goto L92;
                case 71: goto L116;
                case 72: goto L116;
                case 73: goto L116;
                case 74: goto L116;
                case 75: goto L116;
                default: goto L121;
            }
        L7c:
            r0 = r9
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            r9 = r0
            int r8 = r8 + 2
            goto L138
        L87:
            r0 = r9
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r9 = r0
            int r8 = r8 + 1
            goto L138
        L92:
            r0 = r9
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r10 = r0
            r0 = r7
            r1 = r10
            org.objectweb.asm.Label[] r1 = new org.objectweb.asm.Label[r1]
            r0.l = r1
            r0 = r7
            r1 = r10
            org.objectweb.asm.Label[] r1 = new org.objectweb.asm.Label[r1]
            r0.m = r1
            r0 = r7
            r1 = r10
            int[] r1 = new int[r1]
            r0.n = r1
            int r8 = r8 + 3
            r0 = 0
            r11 = r0
        Lc0:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L113
            r0 = r6
            r1 = r8
            int r0 = r0.readUnsignedShort(r1)
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r13 = r0
            r0 = r7
            org.objectweb.asm.Label[] r0 = r0.l
            r1 = r11
            r2 = r6
            r3 = r12
            r4 = r7
            org.objectweb.asm.Label[] r4 = r4.h
            org.objectweb.asm.Label r2 = r2.readLabel(r3, r4)
            r0[r1] = r2
            r0 = r7
            org.objectweb.asm.Label[] r0 = r0.m
            r1 = r11
            r2 = r6
            r3 = r12
            r4 = r13
            int r3 = r3 + r4
            r4 = r7
            org.objectweb.asm.Label[] r4 = r4.h
            org.objectweb.asm.Label r2 = r2.readLabel(r3, r4)
            r0[r1] = r2
            r0 = r7
            int[] r0 = r0.n
            r1 = r11
            r2 = r6
            r3 = r8
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r0[r1] = r2
            int r8 = r8 + 6
            int r11 = r11 + 1
            goto Lc0
        L113:
            goto L138
        L116:
            r0 = r9
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            r9 = r0
            int r8 = r8 + 4
            goto L138
        L121:
            r0 = r9
            r1 = r9
            r2 = 24
            int r1 = r1 >>> r2
            r2 = 67
            if (r1 >= r2) goto L131
            r1 = -256(0xffffffffffffff00, float:NaN)
            goto L133
        L131:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L133:
            r0 = r0 & r1
            r9 = r0
            int r8 = r8 + 3
        L138:
            r0 = r6
            r1 = r8
            int r0 = r0.readByte(r1)
            r10 = r0
            r0 = r7
            r1 = r9
            r0.i = r1
            r0 = r7
            r1 = r10
            if (r1 != 0) goto L14e
            r1 = 0
            goto L15a
        L14e:
            org.objectweb.asm.TypePath r1 = new org.objectweb.asm.TypePath
            r2 = r1
            r3 = r6
            byte[] r3 = r3.b
            r4 = r8
            r2.<init>(r3, r4)
        L15a:
            r0.j = r1
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r10
            int r1 = r1 * r2
            int r0 = r0 + r1
            return r0
    }

    private void b(org.objectweb.asm.MethodVisitor r7, org.objectweb.asm.Context r8, int r9, boolean r10) {
            r6 = this;
            r0 = r6
            byte[] r0 = r0.b
            r1 = r9
            int r9 = r9 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r12 = r0
            r0 = r8
            java.lang.String r0 = r0.g
            org.objectweb.asm.Type[] r0 = org.objectweb.asm.Type.getArgumentTypes(r0)
            int r0 = r0.length
            r1 = r12
            int r0 = r0 - r1
            r13 = r0
            r0 = 0
            r11 = r0
        L1f:
            r0 = r11
            r1 = r13
            if (r0 >= r1) goto L42
            r0 = r7
            r1 = r11
            java.lang.String r2 = "Ljava/lang/Synthetic;"
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitParameterAnnotation(r1, r2, r3)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L3c
            r0 = r14
            r0.visitEnd()
        L3c:
            int r11 = r11 + 1
            goto L1f
        L42:
            r0 = r8
            char[] r0 = r0.c
            r15 = r0
        L48:
            r0 = r11
            r1 = r12
            r2 = r13
            int r1 = r1 + r2
            if (r0 >= r1) goto L8b
            r0 = r6
            r1 = r9
            int r0 = r0.readUnsignedShort(r1)
            r16 = r0
            int r9 = r9 + 2
        L5c:
            r0 = r16
            if (r0 <= 0) goto L85
            r0 = r7
            r1 = r11
            r2 = r6
            r3 = r9
            r4 = r15
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = r10
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitParameterAnnotation(r1, r2, r3)
            r14 = r0
            r0 = r6
            r1 = r9
            r2 = 2
            int r1 = r1 + r2
            r2 = r15
            r3 = 1
            r4 = r14
            int r0 = r0.a(r1, r2, r3, r4)
            r9 = r0
            int r16 = r16 + (-1)
            goto L5c
        L85:
            int r11 = r11 + 1
            goto L48
        L8b:
            return
    }

    private int a(int r8, char[] r9, boolean r10, org.objectweb.asm.AnnotationVisitor r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            int r0 = r0.readUnsignedShort(r1)
            r12 = r0
            int r8 = r8 + 2
            r0 = r10
            if (r0 == 0) goto L2a
        Le:
            r0 = r12
            if (r0 <= 0) goto L3f
            r0 = r7
            r1 = r8
            r2 = 2
            int r1 = r1 + r2
            r2 = r9
            r3 = r7
            r4 = r8
            r5 = r9
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r4 = r11
            int r0 = r0.a(r1, r2, r3, r4)
            r8 = r0
            int r12 = r12 + (-1)
            goto Le
        L2a:
            r0 = r12
            if (r0 <= 0) goto L3f
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 0
            r4 = r11
            int r0 = r0.a(r1, r2, r3, r4)
            r8 = r0
            int r12 = r12 + (-1)
            goto L2a
        L3f:
            r0 = r11
            if (r0 == 0) goto L49
            r0 = r11
            r0.visitEnd()
        L49:
            r0 = r8
            return r0
    }

    private int a(int r11, char[] r12, java.lang.String r13, org.objectweb.asm.AnnotationVisitor r14) {
            r10 = this;
            r0 = r14
            if (r0 != 0) goto L4e
            r0 = r10
            byte[] r0 = r0.b
            r1 = r11
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 64: goto L34;
                case 91: goto L3f;
                case 101: goto L30;
                default: goto L4a;
            }
        L30:
            r0 = r11
            r1 = 5
            int r0 = r0 + r1
            return r0
        L34:
            r0 = r10
            r1 = r11
            r2 = 3
            int r1 = r1 + r2
            r2 = r12
            r3 = 1
            r4 = 0
            int r0 = r0.a(r1, r2, r3, r4)
            return r0
        L3f:
            r0 = r10
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            r2 = r12
            r3 = 0
            r4 = 0
            int r0 = r0.a(r1, r2, r3, r4)
            return r0
        L4a:
            r0 = r11
            r1 = 3
            int r0 = r0 + r1
            return r0
        L4e:
            r0 = r10
            byte[] r0 = r0.b
            r1 = r11
            int r11 = r11 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 64: goto L221;
                case 65: goto L4c9;
                case 66: goto L14e;
                case 67: goto L1bc;
                case 68: goto L138;
                case 69: goto L4c9;
                case 70: goto L138;
                case 71: goto L4c9;
                case 72: goto L4c9;
                case 73: goto L138;
                case 74: goto L138;
                case 75: goto L4c9;
                case 76: goto L4c9;
                case 77: goto L4c9;
                case 78: goto L4c9;
                case 79: goto L4c9;
                case 80: goto L4c9;
                case 81: goto L4c9;
                case 82: goto L4c9;
                case 83: goto L198;
                case 84: goto L4c9;
                case 85: goto L4c9;
                case 86: goto L4c9;
                case 87: goto L4c9;
                case 88: goto L4c9;
                case 89: goto L4c9;
                case 90: goto L172;
                case 91: goto L23a;
                case 92: goto L4c9;
                case 93: goto L4c9;
                case 94: goto L4c9;
                case 95: goto L4c9;
                case 96: goto L4c9;
                case 97: goto L4c9;
                case 98: goto L4c9;
                case 99: goto L20c;
                case 100: goto L4c9;
                case 101: goto L1f2;
                case 102: goto L4c9;
                case 103: goto L4c9;
                case 104: goto L4c9;
                case 105: goto L4c9;
                case 106: goto L4c9;
                case 107: goto L4c9;
                case 108: goto L4c9;
                case 109: goto L4c9;
                case 110: goto L4c9;
                case 111: goto L4c9;
                case 112: goto L4c9;
                case 113: goto L4c9;
                case 114: goto L4c9;
                case 115: goto L1e0;
                default: goto L4c9;
            }
        L138:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r10
            r4 = r11
            int r3 = r3.readUnsignedShort(r4)
            r4 = r12
            java.lang.Object r2 = r2.readConst(r3, r4)
            r0.visit(r1, r2)
            int r11 = r11 + 2
            goto L4c9
        L14e:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            byte r2 = (byte) r2
            java.lang.Byte r3 = new java.lang.Byte
            r4 = r3
            r6 = r4; r5 = r3; r4 = r2; r3 = r6; r2 = r5; 
            r4.<init>(r5)
            r1.visit(r2, r3)
            int r11 = r11 + 2
            goto L4c9
        L172:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            if (r2 != 0) goto L18c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L18f
        L18c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L18f:
            r0.visit(r1, r2)
            int r11 = r11 + 2
            goto L4c9
        L198:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            short r2 = (short) r2
            java.lang.Short r3 = new java.lang.Short
            r4 = r3
            r6 = r4; r5 = r3; r4 = r2; r3 = r6; r2 = r5; 
            r4.<init>(r5)
            r1.visit(r2, r3)
            int r11 = r11 + 2
            goto L4c9
        L1bc:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            char r2 = (char) r2
            java.lang.Character r3 = new java.lang.Character
            r4 = r3
            r6 = r4; r5 = r3; r4 = r2; r3 = r6; r2 = r5; 
            r4.<init>(r5)
            r1.visit(r2, r3)
            int r11 = r11 + 2
            goto L4c9
        L1e0:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r0.visit(r1, r2)
            int r11 = r11 + 2
            goto L4c9
        L1f2:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = r10
            r4 = r11
            r5 = 2
            int r4 = r4 + r5
            r5 = r12
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r0.visitEnum(r1, r2, r3)
            int r11 = r11 + 4
            goto L4c9
        L20c:
            r0 = r14
            r1 = r13
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.String r2 = r2.readUTF8(r3, r4)
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getType(r2)
            r0.visit(r1, r2)
            int r11 = r11 + 2
            goto L4c9
        L221:
            r0 = r10
            r1 = r11
            r2 = 2
            int r1 = r1 + r2
            r2 = r12
            r3 = 1
            r4 = r14
            r5 = r13
            r6 = r10
            r7 = r11
            r8 = r12
            java.lang.String r6 = r6.readUTF8(r7, r8)
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitAnnotation(r5, r6)
            int r0 = r0.a(r1, r2, r3, r4)
            r11 = r0
            goto L4c9
        L23a:
            r0 = r10
            r1 = r11
            int r0 = r0.readUnsignedShort(r1)
            r16 = r0
            int r11 = r11 + 2
            r0 = r16
            if (r0 != 0) goto L259
            r0 = r10
            r1 = r11
            r2 = 2
            int r1 = r1 - r2
            r2 = r12
            r3 = 0
            r4 = r14
            r5 = r13
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitArray(r5)
            int r0 = r0.a(r1, r2, r3, r4)
            return r0
        L259:
            r0 = r10
            byte[] r0 = r0.b
            r1 = r11
            int r11 = r11 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 66: goto L2d8;
                case 67: goto L390;
                case 68: goto L47c;
                case 69: goto L4b9;
                case 70: goto L43f;
                case 71: goto L4b9;
                case 72: goto L4b9;
                case 73: goto L3cb;
                case 74: goto L405;
                case 75: goto L4b9;
                case 76: goto L4b9;
                case 77: goto L4b9;
                case 78: goto L4b9;
                case 79: goto L4b9;
                case 80: goto L4b9;
                case 81: goto L4b9;
                case 82: goto L4b9;
                case 83: goto L355;
                case 84: goto L4b9;
                case 85: goto L4b9;
                case 86: goto L4b9;
                case 87: goto L4b9;
                case 88: goto L4b9;
                case 89: goto L4b9;
                case 90: goto L313;
                default: goto L4b9;
            }
        L2d8:
            r0 = r16
            byte[] r0 = new byte[r0]
            r17 = r0
            r0 = 0
            r15 = r0
        L2e1:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L305
            r0 = r17
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L2e1
        L305:
            r0 = r14
            r1 = r13
            r2 = r17
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L313:
            r0 = r16
            boolean[] r0 = new boolean[r0]
            r18 = r0
            r0 = 0
            r15 = r0
        L31c:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L347
            r0 = r18
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            if (r2 == 0) goto L33c
            r2 = 1
            goto L33d
        L33c:
            r2 = 0
        L33d:
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L31c
        L347:
            r0 = r14
            r1 = r13
            r2 = r18
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L355:
            r0 = r16
            short[] r0 = new short[r0]
            r19 = r0
            r0 = 0
            r15 = r0
        L35e:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L382
            r0 = r19
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            short r2 = (short) r2
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L35e
        L382:
            r0 = r14
            r1 = r13
            r2 = r19
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L390:
            r0 = r16
            char[] r0 = new char[r0]
            r20 = r0
            r0 = 0
            r15 = r0
        L399:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L3bd
            r0 = r20
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            char r2 = (char) r2
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L399
        L3bd:
            r0 = r14
            r1 = r13
            r2 = r20
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L3cb:
            r0 = r16
            int[] r0 = new int[r0]
            r21 = r0
            r0 = 0
            r15 = r0
        L3d4:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L3f7
            r0 = r21
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L3d4
        L3f7:
            r0 = r14
            r1 = r13
            r2 = r21
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L405:
            r0 = r16
            long[] r0 = new long[r0]
            r22 = r0
            r0 = 0
            r15 = r0
        L40e:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L431
            r0 = r22
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            long r2 = r2.readLong(r3)
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L40e
        L431:
            r0 = r14
            r1 = r13
            r2 = r22
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L43f:
            r0 = r16
            float[] r0 = new float[r0]
            r23 = r0
            r0 = 0
            r15 = r0
        L448:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L46e
            r0 = r23
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L448
        L46e:
            r0 = r14
            r1 = r13
            r2 = r23
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L47c:
            r0 = r16
            double[] r0 = new double[r0]
            r24 = r0
            r0 = 0
            r15 = r0
        L485:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L4ab
            r0 = r24
            r1 = r15
            r2 = r10
            r3 = r10
            int[] r3 = r3.a
            r4 = r10
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            long r2 = r2.readLong(r3)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r0[r1] = r2
            int r11 = r11 + 3
            int r15 = r15 + 1
            goto L485
        L4ab:
            r0 = r14
            r1 = r13
            r2 = r24
            r0.visit(r1, r2)
            int r11 = r11 + (-1)
            goto L4c9
        L4b9:
            r0 = r10
            r1 = r11
            r2 = 3
            int r1 = r1 - r2
            r2 = r12
            r3 = 0
            r4 = r14
            r5 = r13
            org.objectweb.asm.AnnotationVisitor r4 = r4.visitArray(r5)
            int r0 = r0.a(r1, r2, r3, r4)
            r11 = r0
        L4c9:
            r0 = r11
            return r0
    }

    private void a(org.objectweb.asm.Context r7) {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.g
            r8 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.s
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r7
            int r0 = r0.e
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L46
            java.lang.String r0 = "<init>"
            r1 = r7
            java.lang.String r1 = r1.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS
            r0[r1] = r2
            goto L46
        L31:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r6
            r3 = r6
            int r3 = r3.header
            r4 = 2
            int r3 = r3 + r4
            r4 = r7
            char[] r4 = r4.c
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
        L46:
            r0 = 1
            r11 = r0
        L49:
            r0 = r11
            r12 = r0
            r0 = r8
            r1 = r11
            int r11 = r11 + 1
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto Lcc;
                case 67: goto Lcc;
                case 68: goto Lf3;
                case 69: goto L16d;
                case 70: goto Ld9;
                case 71: goto L16d;
                case 72: goto L16d;
                case 73: goto Lcc;
                case 74: goto Le6;
                case 75: goto L16d;
                case 76: goto L145;
                case 77: goto L16d;
                case 78: goto L16d;
                case 79: goto L16d;
                case 80: goto L16d;
                case 81: goto L16d;
                case 82: goto L16d;
                case 83: goto Lcc;
                case 84: goto L16d;
                case 85: goto L16d;
                case 86: goto L16d;
                case 87: goto L16d;
                case 88: goto L16d;
                case 89: goto L16d;
                case 90: goto Lcc;
                case 91: goto L100;
                default: goto L16d;
            }
        Lcc:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.INTEGER
            r0[r1] = r2
            goto L170
        Ld9:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.FLOAT
            r0[r1] = r2
            goto L170
        Le6:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.LONG
            r0[r1] = r2
            goto L170
        Lf3:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.DOUBLE
            r0[r1] = r2
            goto L170
        L100:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L111
            int r11 = r11 + 1
            goto L100
        L111:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L130
            int r11 = r11 + 1
        L11f:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 == r1) goto L130
            int r11 = r11 + 1
            goto L11f
        L130:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r8
            r3 = r12
            int r11 = r11 + 1
            r4 = r11
            java.lang.String r2 = r2.substring(r3, r4)
            r0[r1] = r2
            goto L170
        L145:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 == r1) goto L156
            int r11 = r11 + 1
            goto L145
        L156:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r8
            r3 = r12
            r4 = 1
            int r3 = r3 + r4
            r4 = r11
            int r11 = r11 + 1
            java.lang.String r2 = r2.substring(r3, r4)
            r0[r1] = r2
            goto L170
        L16d:
            goto L173
        L170:
            goto L49
        L173:
            r0 = r7
            r1 = r10
            r0.q = r1
            return
    }

    private int a(int r8, boolean r9, boolean r10, org.objectweb.asm.Context r11) {
            r7 = this;
            r0 = r11
            char[] r0 = r0.c
            r12 = r0
            r0 = r11
            org.objectweb.asm.Label[] r0 = r0.h
            r13 = r0
            r0 = r9
            if (r0 == 0) goto L24
            r0 = r7
            byte[] r0 = r0.b
            r1 = r8
            int r8 = r8 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r14 = r0
            goto L2f
        L24:
            r0 = 255(0xff, float:3.57E-43)
            r14 = r0
            r0 = r11
            r1 = -1
            r0.o = r1
        L2f:
            r0 = r11
            r1 = 0
            r0.r = r1
            r0 = r14
            r1 = 64
            if (r0 >= r1) goto L4f
            r0 = r14
            r15 = r0
            r0 = r11
            r1 = 3
            r0.p = r1
            r0 = r11
            r1 = 0
            r0.t = r1
            goto L1d8
        L4f:
            r0 = r14
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L7d
            r0 = r14
            r1 = 64
            int r0 = r0 - r1
            r15 = r0
            r0 = r7
            r1 = r11
            java.lang.Object[] r1 = r1.u
            r2 = 0
            r3 = r8
            r4 = r12
            r5 = r13
            int r0 = r0.a(r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r11
            r1 = 4
            r0.p = r1
            r0 = r11
            r1 = 1
            r0.t = r1
            goto L1d8
        L7d:
            r0 = r7
            r1 = r8
            int r0 = r0.readUnsignedShort(r1)
            r15 = r0
            int r8 = r8 + 2
            r0 = r14
            r1 = 247(0xf7, float:3.46E-43)
            if (r0 != r1) goto Lae
            r0 = r7
            r1 = r11
            java.lang.Object[] r1 = r1.u
            r2 = 0
            r3 = r8
            r4 = r12
            r5 = r13
            int r0 = r0.a(r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r11
            r1 = 4
            r0.p = r1
            r0 = r11
            r1 = 1
            r0.t = r1
            goto L1d8
        Lae:
            r0 = r14
            r1 = 248(0xf8, float:3.48E-43)
            if (r0 < r1) goto Le7
            r0 = r14
            r1 = 251(0xfb, float:3.52E-43)
            if (r0 >= r1) goto Le7
            r0 = r11
            r1 = 2
            r0.p = r1
            r0 = r11
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r14
            int r1 = r1 - r2
            r0.r = r1
            r0 = r11
            r1 = r0
            int r1 = r1.q
            r2 = r11
            int r2 = r2.r
            int r1 = r1 - r2
            r0.q = r1
            r0 = r11
            r1 = 0
            r0.t = r1
            goto L1d8
        Le7:
            r0 = r14
            r1 = 251(0xfb, float:3.52E-43)
            if (r0 != r1) goto Lfe
            r0 = r11
            r1 = 3
            r0.p = r1
            r0 = r11
            r1 = 0
            r0.t = r1
            goto L1d8
        Lfe:
            r0 = r14
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= r1) goto L165
            r0 = r10
            if (r0 == 0) goto L112
            r0 = r11
            int r0 = r0.q
            goto L113
        L112:
            r0 = 0
        L113:
            r16 = r0
            r0 = r14
            r1 = 251(0xfb, float:3.52E-43)
            int r0 = r0 - r1
            r17 = r0
        L11d:
            r0 = r17
            if (r0 <= 0) goto L13c
            r0 = r7
            r1 = r11
            java.lang.Object[] r1 = r1.s
            r2 = r16
            int r16 = r16 + 1
            r3 = r8
            r4 = r12
            r5 = r13
            int r0 = r0.a(r1, r2, r3, r4, r5)
            r8 = r0
            int r17 = r17 + (-1)
            goto L11d
        L13c:
            r0 = r11
            r1 = 1
            r0.p = r1
            r0 = r11
            r1 = r14
            r2 = 251(0xfb, float:3.52E-43)
            int r1 = r1 - r2
            r0.r = r1
            r0 = r11
            r1 = r0
            int r1 = r1.q
            r2 = r11
            int r2 = r2.r
            int r1 = r1 + r2
            r0.q = r1
            r0 = r11
            r1 = 0
            r0.t = r1
            goto L1d8
        L165:
            r0 = r11
            r1 = 0
            r0.p = r1
            r0 = r7
            r1 = r8
            int r0 = r0.readUnsignedShort(r1)
            r16 = r0
            int r8 = r8 + 2
            r0 = r11
            r1 = r16
            r0.r = r1
            r0 = r11
            r1 = r16
            r0.q = r1
            r0 = 0
            r17 = r0
        L186:
            r0 = r16
            if (r0 <= 0) goto L1a5
            r0 = r7
            r1 = r11
            java.lang.Object[] r1 = r1.s
            r2 = r17
            int r17 = r17 + 1
            r3 = r8
            r4 = r12
            r5 = r13
            int r0 = r0.a(r1, r2, r3, r4, r5)
            r8 = r0
            int r16 = r16 + (-1)
            goto L186
        L1a5:
            r0 = r7
            r1 = r8
            int r0 = r0.readUnsignedShort(r1)
            r16 = r0
            int r8 = r8 + 2
            r0 = r11
            r1 = r16
            r0.t = r1
            r0 = 0
            r17 = r0
        L1b9:
            r0 = r16
            if (r0 <= 0) goto L1d8
            r0 = r7
            r1 = r11
            java.lang.Object[] r1 = r1.u
            r2 = r17
            int r17 = r17 + 1
            r3 = r8
            r4 = r12
            r5 = r13
            int r0 = r0.a(r1, r2, r3, r4, r5)
            r8 = r0
            int r16 = r16 + (-1)
            goto L1b9
        L1d8:
            r0 = r11
            r1 = r0
            int r1 = r1.o
            r2 = r15
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1 + r2
            r0.o = r1
            r0 = r7
            r1 = r11
            int r1 = r1.o
            r2 = r13
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r0 = r8
            return r0
    }

    private int a(java.lang.Object[] r7, int r8, int r9, char[] r10, org.objectweb.asm.Label[] r11) {
            r6 = this;
            r0 = r6
            byte[] r0 = r0.b
            r1 = r9
            int r9 = r9 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r12 = r0
            r0 = r12
            switch(r0) {
                case 0: goto L40;
                case 1: goto L49;
                case 2: goto L52;
                case 3: goto L5b;
                case 4: goto L64;
                case 5: goto L6d;
                case 6: goto L76;
                case 7: goto L7f;
                default: goto L8f;
            }
        L40:
            r0 = r7
            r1 = r8
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.TOP
            r0[r1] = r2
            goto La0
        L49:
            r0 = r7
            r1 = r8
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.INTEGER
            r0[r1] = r2
            goto La0
        L52:
            r0 = r7
            r1 = r8
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.FLOAT
            r0[r1] = r2
            goto La0
        L5b:
            r0 = r7
            r1 = r8
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.DOUBLE
            r0[r1] = r2
            goto La0
        L64:
            r0 = r7
            r1 = r8
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.LONG
            r0[r1] = r2
            goto La0
        L6d:
            r0 = r7
            r1 = r8
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.NULL
            r0[r1] = r2
            goto La0
        L76:
            r0 = r7
            r1 = r8
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS
            r0[r1] = r2
            goto La0
        L7f:
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r9
            r4 = r10
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r9 = r9 + 2
            goto La0
        L8f:
            r0 = r7
            r1 = r8
            r2 = r6
            r3 = r6
            r4 = r9
            int r3 = r3.readUnsignedShort(r4)
            r4 = r11
            org.objectweb.asm.Label r2 = r2.readLabel(r3, r4)
            r0[r1] = r2
            int r9 = r9 + 2
        La0:
            r0 = r9
            return r0
    }

    protected org.objectweb.asm.Label readLabel(int r6, org.objectweb.asm.Label[] r7) {
            r5 = this;
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            if (r0 != 0) goto L10
            r0 = r7
            r1 = r6
            org.objectweb.asm.Label r2 = new org.objectweb.asm.Label
            r3 = r2
            r3.<init>()
            r0[r1] = r2
        L10:
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            return r0
    }

    private int a() {
            r6 = this;
            r0 = r6
            int r0 = r0.header
            r1 = 8
            int r0 = r0 + r1
            r1 = r6
            r2 = r6
            int r2 = r2.header
            r3 = 6
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = 2
            int r1 = r1 * r2
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r7
            int r0 = r0.readUnsignedShort(r1)
            r8 = r0
        L1c:
            r0 = r8
            if (r0 <= 0) goto L4a
            r0 = r6
            r1 = r7
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r9 = r0
        L29:
            r0 = r9
            if (r0 <= 0) goto L41
            r0 = r7
            r1 = 6
            r2 = r6
            r3 = r7
            r4 = 12
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7 = r0
            int r9 = r9 + (-1)
            goto L29
        L41:
            int r7 = r7 + 8
            int r8 = r8 + (-1)
            goto L1c
        L4a:
            int r7 = r7 + 2
            r0 = r6
            r1 = r7
            int r0 = r0.readUnsignedShort(r1)
            r8 = r0
        L53:
            r0 = r8
            if (r0 <= 0) goto L81
            r0 = r6
            r1 = r7
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r9 = r0
        L60:
            r0 = r9
            if (r0 <= 0) goto L78
            r0 = r7
            r1 = 6
            r2 = r6
            r3 = r7
            r4 = 12
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7 = r0
            int r9 = r9 + (-1)
            goto L60
        L78:
            int r7 = r7 + 8
            int r8 = r8 + (-1)
            goto L53
        L81:
            r0 = r7
            r1 = 2
            int r0 = r0 + r1
            return r0
    }

    private org.objectweb.asm.Attribute a(org.objectweb.asm.Attribute[] r9, java.lang.String r10, int r11, int r12, char[] r13, int r14, org.objectweb.asm.Label[] r15) {
            r8 = this;
            r0 = 0
            r16 = r0
        L3:
            r0 = r16
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L30
            r0 = r9
            r1 = r16
            r0 = r0[r1]
            java.lang.String r0 = r0.type
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            r0 = r9
            r1 = r16
            r0 = r0[r1]
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.objectweb.asm.Attribute r0 = r0.read(r1, r2, r3, r4, r5, r6)
            return r0
        L2a:
            int r16 = r16 + 1
            goto L3
        L30:
            org.objectweb.asm.Attribute r0 = new org.objectweb.asm.Attribute
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = 0
            r5 = -1
            r6 = 0
            org.objectweb.asm.Attribute r0 = r0.read(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public int getItemCount() {
            r2 = this;
            r0 = r2
            int[] r0 = r0.a
            int r0 = r0.length
            return r0
    }

    public int getItem(int r4) {
            r3 = this;
            r0 = r3
            int[] r0 = r0.a
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public int getMaxStringLength() {
            r2 = this;
            r0 = r2
            int r0 = r0.d
            return r0
    }

    public int readByte(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.b
            r1 = r4
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public int readUnsignedShort(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.b
            r7 = r0
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r7
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public short readShort(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.b
            r7 = r0
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r7
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    public int readInt(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.b
            r7 = r0
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 << r1
            r1 = r7
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r2 = r6
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r2 = r6
            r3 = 3
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public long readLong(int r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            int r0 = r0.readInt(r1)
            long r0 = (long) r0
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            long r0 = (long) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r9 = r0
            r0 = r7
            r1 = 32
            long r0 = r0 << r1
            r1 = r9
            long r0 = r0 | r1
            return r0
    }

    public java.lang.String readUTF8(int r8, char[] r9) {
            r7 = this;
            r0 = r7
            r1 = r8
            int r0 = r0.readUnsignedShort(r1)
            r10 = r0
            r0 = r8
            if (r0 == 0) goto Le
            r0 = r10
            if (r0 != 0) goto L10
        Le:
            r0 = 0
            return r0
        L10:
            r0 = r7
            java.lang.String[] r0 = r0.c
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L20
            r0 = r11
            return r0
        L20:
            r0 = r7
            int[] r0 = r0.a
            r1 = r10
            r0 = r0[r1]
            r8 = r0
            r0 = r7
            java.lang.String[] r0 = r0.c
            r1 = r10
            r2 = r7
            r3 = r8
            r4 = 2
            int r3 = r3 + r4
            r4 = r7
            r5 = r8
            int r4 = r4.readUnsignedShort(r5)
            r5 = r9
            java.lang.String r2 = r2.a(r3, r4, r5)
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            return r0
    }

    private java.lang.String a(int r7, int r8, char[] r9) {
            r6 = this;
            r0 = r7
            r1 = r8
            int r0 = r0 + r1
            r10 = r0
            r0 = r6
            byte[] r0 = r0.b
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
        L14:
            r0 = r7
            r1 = r10
            if (r0 >= r1) goto Lb6
            r0 = r11
            r1 = r7
            int r7 = r7 + 1
            r0 = r0[r1]
            r13 = r0
            r0 = r14
            switch(r0) {
                case 0: goto L40;
                case 1: goto L89;
                case 2: goto La2;
                default: goto Lb3;
            }
        L40:
            r0 = r13
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r13 = r0
            r0 = r13
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L5d
            r0 = r9
            r1 = r12
            int r12 = r12 + 1
            r2 = r13
            char r2 = (char) r2
            r0[r1] = r2
            goto Lb3
        L5d:
            r0 = r13
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 >= r1) goto L7b
            r0 = r13
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 <= r1) goto L7b
            r0 = r13
            r1 = 31
            r0 = r0 & r1
            char r0 = (char) r0
            r15 = r0
            r0 = 1
            r14 = r0
            goto Lb3
        L7b:
            r0 = r13
            r1 = 15
            r0 = r0 & r1
            char r0 = (char) r0
            r15 = r0
            r0 = 2
            r14 = r0
            goto Lb3
        L89:
            r0 = r9
            r1 = r12
            int r12 = r12 + 1
            r2 = r15
            r3 = 6
            int r2 = r2 << r3
            r3 = r13
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            char r2 = (char) r2
            r0[r1] = r2
            r0 = 0
            r14 = r0
            goto Lb3
        La2:
            r0 = r15
            r1 = 6
            int r0 = r0 << r1
            r1 = r13
            r2 = 63
            r1 = r1 & r2
            r0 = r0 | r1
            char r0 = (char) r0
            r15 = r0
            r0 = 1
            r14 = r0
        Lb3:
            goto L14
        Lb6:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r9
            r3 = 0
            r4 = r12
            r1.<init>(r2, r3, r4)
            return r0
    }

    public java.lang.String readClass(int r6, char[] r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            int[] r1 = r1.a
            r2 = r5
            r3 = r6
            int r2 = r2.readUnsignedShort(r3)
            r1 = r1[r2]
            r2 = r7
            java.lang.String r0 = r0.readUTF8(r1, r2)
            return r0
    }

    public java.lang.Object readConst(int r9, char[] r10) {
            r8 = this;
            r0 = r8
            int[] r0 = r0.a
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r8
            byte[] r0 = r0.b
            r1 = r11
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            switch(r0) {
                case 3: goto L54;
                case 4: goto L63;
                case 5: goto L75;
                case 6: goto L84;
                case 7: goto L96;
                case 8: goto La0;
                case 9: goto Lb1;
                case 10: goto Lb1;
                case 11: goto Lb1;
                case 12: goto Lb1;
                case 13: goto Lb1;
                case 14: goto Lb1;
                case 15: goto Lb1;
                case 16: goto La7;
                default: goto Lb1;
            }
        L54:
            r0 = r8
            r1 = r11
            int r0 = r0.readInt(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r2 = r1
            r4 = r2; r3 = r1; r2 = r0; r1 = r4; r0 = r3; 
            r2.<init>(r3)
            return r1
        L63:
            r0 = r8
            r1 = r11
            int r0 = r0.readInt(r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r1 = new java.lang.Float
            r2 = r1
            r4 = r2; r3 = r1; r2 = r0; r1 = r4; r0 = r3; 
            r2.<init>(r3)
            return r1
        L75:
            r0 = r8
            r1 = r11
            long r0 = r0.readLong(r1)
            java.lang.Long r1 = new java.lang.Long
            r2 = r1
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1.<init>(r2)
            return r0
        L84:
            r0 = r8
            r1 = r11
            long r0 = r0.readLong(r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r1 = new java.lang.Double
            r2 = r1
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1.<init>(r2)
            return r0
        L96:
            r0 = r8
            r1 = r11
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            return r0
        La0:
            r0 = r8
            r1 = r11
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            return r0
        La7:
            r0 = r8
            r1 = r11
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getMethodType(r0)
            return r0
        Lb1:
            r0 = r8
            r1 = r11
            int r0 = r0.readByte(r1)
            r12 = r0
            r0 = r8
            int[] r0 = r0.a
            r13 = r0
            r0 = r13
            r1 = r8
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r14 = r0
            r0 = r8
            byte[] r0 = r0.b
            r1 = r14
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 11
            if (r0 != r1) goto Ldc
            r0 = 1
            goto Ldd
        Ldc:
            r0 = 0
        Ldd:
            r15 = r0
            r0 = r8
            r1 = r14
            r2 = r10
            java.lang.String r0 = r0.readClass(r1, r2)
            r16 = r0
            r0 = r13
            r1 = r8
            r2 = r14
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r14 = r0
            r0 = r8
            r1 = r14
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r17 = r0
            r0 = r8
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r18 = r0
            org.objectweb.asm.Handle r0 = new org.objectweb.asm.Handle
            r1 = r0
            r2 = r12
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }
}
