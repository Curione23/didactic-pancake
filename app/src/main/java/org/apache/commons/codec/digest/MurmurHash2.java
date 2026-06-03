package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public final class MurmurHash2 {
    private static final int M32 = 1540483477;
    private static final long M64 = -4132994306676758123L;
    private static final int R32 = 24;
    private static final int R64 = 47;

    private MurmurHash2() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getLittleEndianInt(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    private static long getLittleEndianLong(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    public static int hash32(java.lang.String r1) {
            byte[] r1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r1)
            int r0 = r1.length
            int r1 = hash32(r1, r0)
            return r1
    }

    public static int hash32(java.lang.String r0, int r1, int r2) {
            int r2 = r2 + r1
            java.lang.String r0 = r0.substring(r1, r2)
            int r0 = hash32(r0)
            return r0
    }

    public static int hash32(byte[] r1, int r2) {
            r0 = -1756908916(0xffffffff9747b28c, float:-6.4525726E-25)
            int r1 = hash32(r1, r2, r0)
            return r1
    }

    public static int hash32(byte[] r5, int r6, int r7) {
            r7 = r7 ^ r6
            int r0 = r6 >> 2
            r1 = 0
        L4:
            r2 = 1540483477(0x5bd1e995, float:1.1817019E17)
            if (r1 >= r0) goto L19
            int r3 = r1 << 2
            int r3 = getLittleEndianInt(r5, r3)
            int r3 = r3 * r2
            int r4 = r3 >>> 24
            r3 = r3 ^ r4
            int r3 = r3 * r2
            int r7 = r7 * r2
            r7 = r7 ^ r3
            int r1 = r1 + 1
            goto L4
        L19:
            r1 = 2
            int r0 = r0 << r1
            int r6 = r6 - r0
            r3 = 1
            if (r6 == r3) goto L37
            if (r6 == r1) goto L2e
            r1 = 3
            if (r6 == r1) goto L25
            goto L3e
        L25:
            int r6 = r0 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r7 = r7 ^ r6
        L2e:
            int r6 = r0 + 1
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r7 = r7 ^ r6
        L37:
            r5 = r5[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r7
            int r7 = r5 * r2
        L3e:
            int r5 = r7 >>> 13
            r5 = r5 ^ r7
            int r5 = r5 * r2
            int r6 = r5 >>> 15
            r5 = r5 ^ r6
            return r5
    }

    public static long hash64(java.lang.String r2) {
            byte[] r2 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r2)
            int r0 = r2.length
            long r0 = hash64(r2, r0)
            return r0
    }

    public static long hash64(java.lang.String r0, int r1, int r2) {
            int r2 = r2 + r1
            java.lang.String r0 = r0.substring(r1, r2)
            long r0 = hash64(r0)
            return r0
    }

    public static long hash64(byte[] r1, int r2) {
            r0 = -512093083(0xffffffffe17a1465, float:-2.8832222E20)
            long r1 = hash64(r1, r2, r0)
            return r1
    }

    public static long hash64(byte[] r10, int r11, int r12) {
            long r0 = (long) r12
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r2 = (long) r11
            r4 = -4132994306676758123(0xc6a4a7935bd1e995, double:-2.0946245025644615E32)
            long r2 = r2 * r4
            long r0 = r0 ^ r2
            int r12 = r11 >> 3
            r2 = 0
        L12:
            r3 = 47
            if (r2 >= r12) goto L26
            int r6 = r2 << 3
            long r6 = getLittleEndianLong(r10, r6)
            long r6 = r6 * r4
            long r8 = r6 >>> r3
            long r6 = r6 ^ r8
            long r6 = r6 * r4
            long r0 = r0 ^ r6
            long r0 = r0 * r4
            int r2 = r2 + 1
            goto L12
        L26:
            int r12 = r12 << 3
            int r11 = r11 - r12
            r6 = 255(0xff, double:1.26E-321)
            switch(r11) {
                case 1: goto L6b;
                case 2: goto L61;
                case 3: goto L57;
                case 4: goto L4d;
                case 5: goto L43;
                case 6: goto L39;
                case 7: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L72
        L2f:
            int r11 = r12 + 6
            r11 = r10[r11]
            long r8 = (long) r11
            long r8 = r8 & r6
            r11 = 48
            long r8 = r8 << r11
            long r0 = r0 ^ r8
        L39:
            int r11 = r12 + 5
            r11 = r10[r11]
            long r8 = (long) r11
            long r8 = r8 & r6
            r11 = 40
            long r8 = r8 << r11
            long r0 = r0 ^ r8
        L43:
            int r11 = r12 + 4
            r11 = r10[r11]
            long r8 = (long) r11
            long r8 = r8 & r6
            r11 = 32
            long r8 = r8 << r11
            long r0 = r0 ^ r8
        L4d:
            int r11 = r12 + 3
            r11 = r10[r11]
            long r8 = (long) r11
            long r8 = r8 & r6
            r11 = 24
            long r8 = r8 << r11
            long r0 = r0 ^ r8
        L57:
            int r11 = r12 + 2
            r11 = r10[r11]
            long r8 = (long) r11
            long r8 = r8 & r6
            r11 = 16
            long r8 = r8 << r11
            long r0 = r0 ^ r8
        L61:
            int r11 = r12 + 1
            r11 = r10[r11]
            long r8 = (long) r11
            long r8 = r8 & r6
            r11 = 8
            long r8 = r8 << r11
            long r0 = r0 ^ r8
        L6b:
            r10 = r10[r12]
            long r10 = (long) r10
            long r10 = r10 & r6
            long r10 = r10 ^ r0
            long r0 = r10 * r4
        L72:
            long r10 = r0 >>> r3
            long r10 = r10 ^ r0
            long r10 = r10 * r4
            long r0 = r10 >>> r3
            long r10 = r10 ^ r0
            return r10
    }
}
