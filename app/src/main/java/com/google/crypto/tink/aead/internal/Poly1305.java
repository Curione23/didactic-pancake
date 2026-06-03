package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes2.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] computeMac(byte[] r53, byte[] r54) {
            r0 = r53
            r1 = r54
            int r2 = r0.length
            r3 = 32
            if (r2 != r3) goto L1e8
            r2 = 0
            long r4 = load26(r0, r2, r2)
            r6 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r4 = r4 & r6
            r8 = 3
            r9 = 2
            long r10 = load26(r0, r8, r9)
            r12 = 67108611(0x3ffff03, double:3.3156059E-316)
            long r10 = r10 & r12
            r12 = 6
            r13 = 4
            long r14 = load26(r0, r12, r13)
            r16 = 67092735(0x3ffc0ff, double:3.31482154E-316)
            long r14 = r14 & r16
            r3 = 9
            long r17 = load26(r0, r3, r12)
            r19 = 66076671(0x3f03fff, double:3.2646213E-316)
            long r17 = r17 & r19
            r6 = 12
            r7 = 8
            long r21 = load26(r0, r6, r7)
            r23 = 1048575(0xfffff, double:5.18065E-318)
            long r21 = r21 & r23
            r23 = 5
            long r25 = r10 * r23
            long r27 = r14 * r23
            long r29 = r17 * r23
            long r31 = r21 * r23
            r6 = 17
            byte[] r6 = new byte[r6]
            r33 = 0
            r7 = r2
            r35 = r33
            r37 = r35
            r39 = r37
            r41 = r39
        L58:
            int r3 = r1.length
            r12 = 16
            r43 = 26
            if (r7 >= r3) goto L121
            copyBlockSize(r6, r1, r7)
            long r44 = load26(r6, r2, r2)
            long r41 = r41 + r44
            long r44 = load26(r6, r8, r9)
            long r33 = r33 + r44
            r3 = 6
            long r44 = load26(r6, r3, r13)
            long r35 = r35 + r44
            r8 = 9
            long r45 = load26(r6, r8, r3)
            long r37 = r37 + r45
            r3 = 8
            r8 = 12
            long r45 = load26(r6, r8, r3)
            r3 = r6[r12]
            r8 = 24
            int r3 = r3 << r8
            long r2 = (long) r3
            long r2 = r45 | r2
            long r39 = r39 + r2
            long r2 = r41 * r4
            long r45 = r33 * r31
            long r2 = r2 + r45
            long r45 = r35 * r29
            long r2 = r2 + r45
            long r45 = r37 * r27
            long r2 = r2 + r45
            long r45 = r39 * r25
            long r2 = r2 + r45
            long r45 = r41 * r10
            long r47 = r33 * r4
            long r45 = r45 + r47
            long r47 = r35 * r31
            long r45 = r45 + r47
            long r47 = r37 * r29
            long r45 = r45 + r47
            long r47 = r39 * r27
            long r45 = r45 + r47
            long r47 = r41 * r14
            long r49 = r33 * r10
            long r47 = r47 + r49
            long r49 = r35 * r4
            long r47 = r47 + r49
            long r49 = r37 * r31
            long r47 = r47 + r49
            long r49 = r39 * r29
            long r47 = r47 + r49
            long r49 = r41 * r17
            long r51 = r33 * r14
            long r49 = r49 + r51
            long r51 = r35 * r10
            long r49 = r49 + r51
            long r51 = r37 * r4
            long r49 = r49 + r51
            long r51 = r39 * r31
            long r49 = r49 + r51
            long r41 = r41 * r21
            long r33 = r33 * r17
            long r41 = r41 + r33
            long r35 = r35 * r14
            long r41 = r41 + r35
            long r37 = r37 * r10
            long r41 = r41 + r37
            long r39 = r39 * r4
            long r41 = r41 + r39
            long r33 = r2 >> r43
            r19 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r2 = r2 & r19
            long r45 = r45 + r33
            long r33 = r45 >> r43
            long r35 = r45 & r19
            long r47 = r47 + r33
            long r33 = r47 >> r43
            long r37 = r47 & r19
            long r49 = r49 + r33
            long r33 = r49 >> r43
            long r39 = r49 & r19
            long r41 = r41 + r33
            long r33 = r41 >> r43
            long r41 = r41 & r19
            long r33 = r33 * r23
            long r2 = r2 + r33
            long r33 = r2 >> r43
            long r2 = r2 & r19
            long r33 = r35 + r33
            int r7 = r7 + 16
            r35 = r37
            r37 = r39
            r39 = r41
            r8 = 3
            r12 = 6
            r41 = r2
            r2 = 0
            goto L58
        L121:
            r19 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r1 = r33 >> r43
            long r3 = r33 & r19
            long r35 = r35 + r1
            long r1 = r35 >> r43
            long r5 = r35 & r19
            long r37 = r37 + r1
            long r1 = r37 >> r43
            long r9 = r37 & r19
            long r39 = r39 + r1
            long r1 = r39 >> r43
            long r14 = r39 & r19
            long r1 = r1 * r23
            long r41 = r41 + r1
            long r1 = r41 >> r43
            long r17 = r41 & r19
            long r3 = r3 + r1
            long r23 = r17 + r23
            long r1 = r23 >> r43
            long r21 = r23 & r19
            long r1 = r1 + r3
            long r23 = r1 >> r43
            long r1 = r1 & r19
            long r23 = r5 + r23
            long r25 = r23 >> r43
            long r23 = r23 & r19
            long r25 = r9 + r25
            long r27 = r25 >> r43
            long r19 = r25 & r19
            long r27 = r14 + r27
            r25 = 67108864(0x4000000, double:3.3156184E-316)
            long r27 = r27 - r25
            r7 = 63
            long r12 = r27 >> r7
            long r17 = r17 & r12
            long r3 = r3 & r12
            long r5 = r5 & r12
            long r9 = r9 & r12
            long r14 = r14 & r12
            long r12 = ~r12
            long r21 = r21 & r12
            long r17 = r17 | r21
            long r1 = r1 & r12
            long r1 = r1 | r3
            long r3 = r23 & r12
            long r3 = r3 | r5
            long r5 = r19 & r12
            long r5 = r5 | r9
            long r9 = r27 & r12
            long r9 = r9 | r14
            long r12 = r1 << r43
            long r12 = r17 | r12
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            r7 = 6
            long r1 = r1 >> r7
            r7 = 20
            long r17 = r3 << r7
            long r1 = r1 | r17
            long r1 = r1 & r14
            r17 = 12
            long r3 = r3 >> r17
            r17 = 14
            long r17 = r5 << r17
            long r3 = r3 | r17
            long r3 = r3 & r14
            r17 = 18
            long r5 = r5 >> r17
            r17 = 8
            long r9 = r9 << r17
            long r5 = r5 | r9
            long r5 = r5 & r14
            r9 = 16
            long r17 = load32(r0, r9)
            long r12 = r12 + r17
            long r9 = r12 & r14
            long r17 = load32(r0, r7)
            long r1 = r1 + r17
            r7 = 32
            long r12 = r12 >> r7
            long r1 = r1 + r12
            long r12 = r1 & r14
            r8 = 24
            long r17 = load32(r0, r8)
            long r3 = r3 + r17
            long r1 = r1 >> r7
            long r3 = r3 + r1
            long r1 = r3 & r14
            r8 = 28
            long r17 = load32(r0, r8)
            long r5 = r5 + r17
            long r3 = r3 >> r7
            long r5 = r5 + r3
            long r3 = r5 & r14
            r0 = 16
            byte[] r0 = new byte[r0]
            r5 = 0
            toByteArray(r0, r9, r5)
            r5 = 4
            toByteArray(r0, r12, r5)
            r5 = 8
            toByteArray(r0, r1, r5)
            r1 = 12
            toByteArray(r0, r3, r1)
            return r0
        L1e8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The key length in bytes must be 32."
            r0.<init>(r1)
            throw r0
    }

    private static void copyBlockSize(byte[] r3, byte[] r4, int r5) {
            int r0 = r4.length
            int r0 = r0 - r5
            r1 = 16
            int r0 = java.lang.Math.min(r1, r0)
            r2 = 0
            java.lang.System.arraycopy(r4, r5, r3, r2, r0)
            r4 = 1
            r3[r0] = r4
            if (r0 == r1) goto L16
            int r0 = r0 + r4
            int r4 = r3.length
            java.util.Arrays.fill(r3, r0, r4, r2)
        L16:
            return
    }

    private static long load26(byte[] r2, int r3, int r4) {
            long r2 = load32(r2, r3)
            long r2 = r2 >> r4
            r0 = 67108863(0x3ffffff, double:3.31561837E-316)
            long r2 = r2 & r0
            return r2
    }

    private static long load32(byte[] r2, int r3) {
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
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    private static void toByteArray(byte[] r4, long r5, int r7) {
            r0 = 0
        L1:
            r1 = 4
            if (r0 >= r1) goto L13
            int r1 = r7 + r0
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r5
            int r2 = (int) r2
            byte r2 = (byte) r2
            r4[r1] = r2
            int r0 = r0 + 1
            r1 = 8
            long r5 = r5 >> r1
            goto L1
        L13:
            return
    }

    public static void verifyMac(byte[] r0, byte[] r1, byte[] r2) throws java.security.GeneralSecurityException {
            byte[] r0 = computeMac(r0, r1)
            boolean r0 = com.google.crypto.tink.subtle.Bytes.equal(r0, r2)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid MAC"
            r0.<init>(r1)
            throw r0
    }
}
