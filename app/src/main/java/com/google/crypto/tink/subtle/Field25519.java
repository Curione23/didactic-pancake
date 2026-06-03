package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
final class Field25519 {
    private static final int[] EXPAND_SHIFT = null;
    private static final int[] EXPAND_START = null;
    static final int FIELD_LEN = 32;
    static final int LIMB_CNT = 10;
    private static final int[] MASK = null;
    private static final int[] SHIFT = null;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;

    static {
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0028: FILL_ARRAY_DATA , data: [0, 3, 6, 9, 12, 16, 19, 22, 25, 28} // fill-array
            com.google.crypto.tink.subtle.Field25519.EXPAND_START = r1
            int[] r0 = new int[r0]
            r0 = {x0040: FILL_ARRAY_DATA , data: [0, 2, 3, 5, 6, 0, 1, 3, 4, 6} // fill-array
            com.google.crypto.tink.subtle.Field25519.EXPAND_SHIFT = r0
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = 33554431(0x1ffffff, float:9.403954E-38)
            int[] r0 = new int[]{r0, r1}
            com.google.crypto.tink.subtle.Field25519.MASK = r0
            r0 = 26
            r1 = 25
            int[] r0 = new int[]{r0, r1}
            com.google.crypto.tink.subtle.Field25519.SHIFT = r0
            return
    }

    private Field25519() {
            r0 = this;
            r0.<init>()
            return
    }

    static byte[] contract(long[] r14) {
            r0 = 10
            long[] r14 = java.util.Arrays.copyOf(r14, r0)
            r1 = 0
            r2 = r1
        L8:
            r3 = 25
            r4 = 31
            r5 = 2
            r6 = 9
            if (r2 >= r5) goto L4b
            r5 = r1
        L12:
            if (r5 >= r6) goto L31
            r7 = r14[r5]
            long r9 = r7 >> r4
            long r9 = r9 & r7
            int[] r11 = com.google.crypto.tink.subtle.Field25519.SHIFT
            r12 = r5 & 1
            r11 = r11[r12]
            long r9 = r9 >> r11
            int r9 = (int) r9
            int r9 = -r9
            int r10 = r9 << r11
            long r10 = (long) r10
            long r7 = r7 + r10
            r14[r5] = r7
            int r5 = r5 + 1
            r7 = r14[r5]
            long r9 = (long) r9
            long r7 = r7 - r9
            r14[r5] = r7
            goto L12
        L31:
            r7 = r14[r6]
            long r4 = r7 >> r4
            long r4 = r4 & r7
            long r3 = r4 >> r3
            int r3 = (int) r3
            int r3 = -r3
            int r4 = r3 << 25
            long r4 = (long) r4
            long r7 = r7 + r4
            r14[r6] = r7
            r4 = r14[r1]
            int r3 = r3 * 19
            long r6 = (long) r3
            long r4 = r4 - r6
            r14[r1] = r4
            int r2 = r2 + 1
            goto L8
        L4b:
            r7 = r14[r1]
            long r9 = r7 >> r4
            long r9 = r9 & r7
            r2 = 26
            long r9 = r9 >> r2
            int r2 = (int) r9
            int r2 = -r2
            int r4 = r2 << 26
            long r9 = (long) r4
            long r7 = r7 + r9
            r14[r1] = r7
            r4 = 1
            r7 = r14[r4]
            long r9 = (long) r2
            long r7 = r7 - r9
            r14[r4] = r7
            r2 = r1
        L63:
            if (r2 >= r5) goto L87
            r7 = r1
        L66:
            if (r7 >= r6) goto L84
            r8 = r14[r7]
            int[] r10 = com.google.crypto.tink.subtle.Field25519.SHIFT
            r11 = r7 & 1
            r10 = r10[r11]
            long r12 = r8 >> r10
            int r10 = (int) r12
            int[] r12 = com.google.crypto.tink.subtle.Field25519.MASK
            r11 = r12[r11]
            long r11 = (long) r11
            long r8 = r8 & r11
            r14[r7] = r8
            int r7 = r7 + 1
            r8 = r14[r7]
            long r10 = (long) r10
            long r8 = r8 + r10
            r14[r7] = r8
            goto L66
        L84:
            int r2 = r2 + 1
            goto L63
        L87:
            r7 = r14[r6]
            long r2 = r7 >> r3
            int r2 = (int) r2
            r9 = 33554431(0x1ffffff, double:1.65780916E-316)
            long r7 = r7 & r9
            r14[r6] = r7
            r6 = r14[r1]
            int r2 = r2 * 19
            long r2 = (long) r2
            long r6 = r6 + r2
            r14[r1] = r6
            int r2 = (int) r6
            r3 = 67108845(0x3ffffed, float:1.5046311E-36)
            int r2 = gte(r2, r3)
            r6 = r4
        La3:
            if (r6 >= r0) goto Lb6
            r7 = r14[r6]
            int r7 = (int) r7
            int[] r8 = com.google.crypto.tink.subtle.Field25519.MASK
            r9 = r6 & 1
            r8 = r8[r9]
            int r7 = eq(r7, r8)
            r2 = r2 & r7
            int r6 = r6 + 1
            goto La3
        Lb6:
            r6 = r14[r1]
            r3 = r3 & r2
            long r8 = (long) r3
            long r6 = r6 - r8
            r14[r1] = r6
            r6 = r14[r4]
            r3 = 33554431(0x1ffffff, float:9.403954E-38)
            r3 = r3 & r2
            long r8 = (long) r3
            long r6 = r6 - r8
            r14[r4] = r6
        Lc7:
            if (r5 >= r0) goto Ldd
            r3 = r14[r5]
            r6 = 67108863(0x3ffffff, float:1.5046327E-36)
            r6 = r6 & r2
            long r6 = (long) r6
            long r3 = r3 - r6
            r14[r5] = r3
            int r3 = r5 + 1
            r6 = r14[r3]
            long r6 = r6 - r8
            r14[r3] = r6
            int r5 = r5 + 2
            goto Lc7
        Ldd:
            r2 = r1
        Lde:
            if (r2 >= r0) goto Lec
            r3 = r14[r2]
            int[] r5 = com.google.crypto.tink.subtle.Field25519.EXPAND_SHIFT
            r5 = r5[r2]
            long r3 = r3 << r5
            r14[r2] = r3
            int r2 = r2 + 1
            goto Lde
        Lec:
            r2 = 32
            byte[] r2 = new byte[r2]
        Lf0:
            if (r1 >= r0) goto L133
            int[] r3 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r3 = r3[r1]
            r4 = r2[r3]
            long r4 = (long) r4
            r6 = r14[r1]
            r8 = 255(0xff, double:1.26E-321)
            long r10 = r6 & r8
            long r4 = r4 | r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r4 = r3 + 1
            r5 = r2[r4]
            long r10 = (long) r5
            r5 = 8
            long r12 = r6 >> r5
            long r12 = r12 & r8
            long r10 = r10 | r12
            int r5 = (int) r10
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r3 + 2
            r5 = r2[r4]
            long r10 = (long) r5
            r5 = 16
            long r12 = r6 >> r5
            long r12 = r12 & r8
            long r10 = r10 | r12
            int r5 = (int) r10
            byte r5 = (byte) r5
            r2[r4] = r5
            int r3 = r3 + 3
            r4 = r2[r3]
            long r4 = (long) r4
            r10 = 24
            long r6 = r6 >> r10
            long r6 = r6 & r8
            long r4 = r4 | r6
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r1 = r1 + 1
            goto Lf0
        L133:
            return r2
    }

    private static int eq(int r0, int r1) {
            r0 = r0 ^ r1
            int r0 = ~r0
            int r1 = r0 << 16
            r0 = r0 & r1
            int r1 = r0 << 8
            r0 = r0 & r1
            int r1 = r0 << 4
            r0 = r0 & r1
            int r1 = r0 << 2
            r0 = r0 & r1
            int r1 = r0 << 1
            r0 = r0 & r1
            int r0 = r0 >> 31
            return r0
    }

    static long[] expand(byte[] r9) {
            r0 = 10
            long[] r1 = new long[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L44
            int[] r3 = com.google.crypto.tink.subtle.Field25519.EXPAND_START
            r3 = r3[r2]
            r4 = r9[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r4 = (long) r4
            int r6 = r3 + 1
            r6 = r9[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6
            r8 = 8
            long r6 = r6 << r8
            long r4 = r4 | r6
            int r6 = r3 + 2
            r6 = r9[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            long r6 = (long) r6
            r8 = 16
            long r6 = r6 << r8
            long r4 = r4 | r6
            int r3 = r3 + 3
            r3 = r9[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r6 = (long) r3
            r3 = 24
            long r6 = r6 << r3
            long r3 = r4 | r6
            int[] r5 = com.google.crypto.tink.subtle.Field25519.EXPAND_SHIFT
            r5 = r5[r2]
            long r3 = r3 >> r5
            int[] r5 = com.google.crypto.tink.subtle.Field25519.MASK
            r6 = r2 & 1
            r5 = r5[r6]
            long r5 = (long) r5
            long r3 = r3 & r5
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L44:
            return r1
    }

    private static int gte(int r0, int r1) {
            int r0 = r0 - r1
            int r0 = r0 >> 31
            int r0 = ~r0
            return r0
    }

    static void inverse(long[] r11, long[] r12) {
            r0 = 10
            long[] r1 = new long[r0]
            long[] r2 = new long[r0]
            long[] r3 = new long[r0]
            long[] r4 = new long[r0]
            long[] r5 = new long[r0]
            long[] r6 = new long[r0]
            long[] r7 = new long[r0]
            long[] r8 = new long[r0]
            long[] r9 = new long[r0]
            long[] r10 = new long[r0]
            square(r1, r12)
            square(r10, r1)
            square(r9, r10)
            mult(r2, r9, r12)
            mult(r3, r2, r1)
            square(r9, r3)
            mult(r4, r9, r2)
            square(r9, r4)
            square(r10, r9)
            square(r9, r10)
            square(r10, r9)
            square(r9, r10)
            mult(r5, r9, r4)
            square(r9, r5)
            square(r10, r9)
            r12 = 2
            r1 = r12
        L45:
            if (r1 >= r0) goto L50
            square(r9, r10)
            square(r10, r9)
            int r1 = r1 + 2
            goto L45
        L50:
            mult(r6, r10, r5)
            square(r9, r6)
            square(r10, r9)
            r1 = r12
        L5a:
            r2 = 20
            if (r1 >= r2) goto L67
            square(r9, r10)
            square(r10, r9)
            int r1 = r1 + 2
            goto L5a
        L67:
            mult(r9, r10, r6)
            square(r10, r9)
            square(r9, r10)
            r1 = r12
        L71:
            if (r1 >= r0) goto L7c
            square(r10, r9)
            square(r9, r10)
            int r1 = r1 + 2
            goto L71
        L7c:
            mult(r7, r9, r5)
            square(r9, r7)
            square(r10, r9)
            r0 = r12
        L86:
            r1 = 50
            if (r0 >= r1) goto L93
            square(r9, r10)
            square(r10, r9)
            int r0 = r0 + 2
            goto L86
        L93:
            mult(r8, r10, r7)
            square(r10, r8)
            square(r9, r10)
            r0 = r12
        L9d:
            r2 = 100
            if (r0 >= r2) goto Laa
            square(r10, r9)
            square(r9, r10)
            int r0 = r0 + 2
            goto L9d
        Laa:
            mult(r10, r9, r8)
            square(r9, r10)
            square(r10, r9)
        Lb3:
            if (r12 >= r1) goto Lbe
            square(r9, r10)
            square(r10, r9)
            int r12 = r12 + 2
            goto Lb3
        Lbe:
            mult(r9, r10, r7)
            square(r10, r9)
            square(r9, r10)
            square(r10, r9)
            square(r9, r10)
            square(r10, r9)
            mult(r11, r10, r3)
            return
    }

    static void mult(long[] r1, long[] r2, long[] r3) {
            r0 = 19
            long[] r0 = new long[r0]
            product(r0, r2, r3)
            reduce(r0, r1)
            return
    }

    static void product(long[] r44, long[] r45, long[] r46) {
            r0 = 0
            r1 = r45[r0]
            r3 = r46[r0]
            long r1 = r1 * r3
            r44[r0] = r1
            r1 = r45[r0]
            r3 = 1
            r4 = r46[r3]
            long r4 = r4 * r1
            r6 = r45[r3]
            r8 = r46[r0]
            long r6 = r6 * r8
            long r4 = r4 + r6
            r44[r3] = r4
            r4 = r45[r3]
            r6 = 2
            long r10 = r4 * r6
            r12 = r46[r3]
            long r10 = r10 * r12
            r0 = 2
            r14 = r46[r0]
            long r14 = r14 * r1
            long r10 = r10 + r14
            r14 = r45[r0]
            long r14 = r14 * r8
            long r10 = r10 + r14
            r44[r0] = r10
            r10 = r46[r0]
            long r14 = r4 * r10
            r16 = r45[r0]
            long r18 = r16 * r12
            long r14 = r14 + r18
            r0 = 3
            r18 = r46[r0]
            long r18 = r18 * r1
            long r14 = r14 + r18
            r18 = r45[r0]
            long r18 = r18 * r8
            long r14 = r14 + r18
            r44[r0] = r14
            long r14 = r16 * r10
            r18 = r46[r0]
            long r20 = r4 * r18
            r22 = r45[r0]
            long r24 = r22 * r12
            long r20 = r20 + r24
            long r20 = r20 * r6
            long r14 = r14 + r20
            r0 = 4
            r20 = r46[r0]
            long r20 = r20 * r1
            long r14 = r14 + r20
            r20 = r45[r0]
            long r20 = r20 * r8
            long r14 = r14 + r20
            r44[r0] = r14
            long r14 = r16 * r18
            long r20 = r22 * r10
            long r14 = r14 + r20
            r20 = r46[r0]
            long r24 = r4 * r20
            long r14 = r14 + r24
            r24 = r45[r0]
            long r26 = r24 * r12
            long r14 = r14 + r26
            r0 = 5
            r26 = r46[r0]
            long r26 = r26 * r1
            long r14 = r14 + r26
            r26 = r45[r0]
            long r26 = r26 * r8
            long r14 = r14 + r26
            r44[r0] = r14
            long r14 = r22 * r18
            r26 = r46[r0]
            long r28 = r4 * r26
            long r14 = r14 + r28
            r28 = r45[r0]
            long r30 = r28 * r12
            long r14 = r14 + r30
            long r14 = r14 * r6
            long r30 = r16 * r20
            long r14 = r14 + r30
            long r30 = r24 * r10
            long r14 = r14 + r30
            r0 = 6
            r30 = r46[r0]
            long r30 = r30 * r1
            long r14 = r14 + r30
            r30 = r45[r0]
            long r30 = r30 * r8
            long r14 = r14 + r30
            r44[r0] = r14
            long r14 = r22 * r20
            long r30 = r24 * r18
            long r14 = r14 + r30
            long r30 = r16 * r26
            long r14 = r14 + r30
            long r30 = r28 * r10
            long r14 = r14 + r30
            r30 = r46[r0]
            long r32 = r4 * r30
            long r14 = r14 + r32
            r32 = r45[r0]
            long r34 = r32 * r12
            long r14 = r14 + r34
            r0 = 7
            r34 = r46[r0]
            long r34 = r34 * r1
            long r14 = r14 + r34
            r34 = r45[r0]
            long r34 = r34 * r8
            long r14 = r14 + r34
            r44[r0] = r14
            long r14 = r24 * r20
            long r34 = r22 * r26
            long r36 = r28 * r18
            long r34 = r34 + r36
            r36 = r46[r0]
            long r38 = r4 * r36
            long r34 = r34 + r38
            r38 = r45[r0]
            long r40 = r38 * r12
            long r34 = r34 + r40
            long r34 = r34 * r6
            long r14 = r14 + r34
            long r34 = r16 * r30
            long r14 = r14 + r34
            long r34 = r32 * r10
            long r14 = r14 + r34
            r0 = 8
            r34 = r46[r0]
            long r34 = r34 * r1
            long r14 = r14 + r34
            r34 = r45[r0]
            long r34 = r34 * r8
            long r14 = r14 + r34
            r44[r0] = r14
            long r14 = r24 * r26
            long r34 = r28 * r20
            long r14 = r14 + r34
            long r34 = r22 * r30
            long r14 = r14 + r34
            long r34 = r32 * r18
            long r14 = r14 + r34
            long r34 = r16 * r36
            long r14 = r14 + r34
            long r34 = r38 * r10
            long r14 = r14 + r34
            r34 = r46[r0]
            long r40 = r4 * r34
            long r14 = r14 + r40
            r40 = r45[r0]
            long r42 = r40 * r12
            long r14 = r14 + r42
            r0 = 9
            r42 = r46[r0]
            long r1 = r1 * r42
            long r14 = r14 + r1
            r1 = r45[r0]
            long r1 = r1 * r8
            long r14 = r14 + r1
            r44[r0] = r14
            long r1 = r28 * r26
            long r8 = r22 * r36
            long r1 = r1 + r8
            long r8 = r38 * r18
            long r1 = r1 + r8
            r8 = r46[r0]
            long r4 = r4 * r8
            long r1 = r1 + r4
            r3 = r45[r0]
            long r12 = r12 * r3
            long r1 = r1 + r12
            long r1 = r1 * r6
            long r12 = r24 * r30
            long r1 = r1 + r12
            long r12 = r32 * r20
            long r1 = r1 + r12
            long r12 = r16 * r34
            long r1 = r1 + r12
            long r12 = r40 * r10
            long r1 = r1 + r12
            r0 = 10
            r44[r0] = r1
            long r0 = r28 * r30
            long r12 = r32 * r26
            long r0 = r0 + r12
            long r12 = r24 * r36
            long r0 = r0 + r12
            long r12 = r38 * r20
            long r0 = r0 + r12
            long r12 = r22 * r34
            long r0 = r0 + r12
            long r12 = r40 * r18
            long r0 = r0 + r12
            long r16 = r16 * r8
            long r0 = r0 + r16
            long r10 = r10 * r3
            long r0 = r0 + r10
            r2 = 11
            r44[r2] = r0
            long r0 = r32 * r30
            long r10 = r28 * r36
            long r12 = r38 * r26
            long r10 = r10 + r12
            long r22 = r22 * r8
            long r10 = r10 + r22
            long r18 = r18 * r3
            long r10 = r10 + r18
            long r10 = r10 * r6
            long r0 = r0 + r10
            long r10 = r24 * r34
            long r0 = r0 + r10
            long r10 = r40 * r20
            long r0 = r0 + r10
            r2 = 12
            r44[r2] = r0
            long r0 = r32 * r36
            long r10 = r38 * r30
            long r0 = r0 + r10
            long r10 = r28 * r34
            long r0 = r0 + r10
            long r10 = r40 * r26
            long r0 = r0 + r10
            long r24 = r24 * r8
            long r0 = r0 + r24
            long r20 = r20 * r3
            long r0 = r0 + r20
            r2 = 13
            r44[r2] = r0
            long r0 = r38 * r36
            long r28 = r28 * r8
            long r0 = r0 + r28
            long r26 = r26 * r3
            long r0 = r0 + r26
            long r0 = r0 * r6
            long r10 = r32 * r34
            long r0 = r0 + r10
            long r10 = r40 * r30
            long r0 = r0 + r10
            r2 = 14
            r44[r2] = r0
            long r0 = r38 * r34
            long r10 = r40 * r36
            long r0 = r0 + r10
            long r32 = r32 * r8
            long r0 = r0 + r32
            long r30 = r30 * r3
            long r0 = r0 + r30
            r2 = 15
            r44[r2] = r0
            long r0 = r40 * r34
            long r38 = r38 * r8
            long r36 = r36 * r3
            long r38 = r38 + r36
            long r38 = r38 * r6
            long r0 = r0 + r38
            r2 = 16
            r44[r2] = r0
            long r40 = r40 * r8
            long r34 = r34 * r3
            long r40 = r40 + r34
            r0 = 17
            r44[r0] = r40
            long r3 = r3 * r6
            long r3 = r3 * r8
            r0 = 18
            r44[r0] = r3
            return
    }

    static void reduce(long[] r3, long[] r4) {
            int r0 = r3.length
            r1 = 0
            r2 = 19
            if (r0 != r2) goto L7
            goto Le
        L7:
            long[] r0 = new long[r2]
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
            r3 = r0
        Le:
            reduceSizeByModularReduction(r3)
            reduceCoefficients(r3)
            r0 = 10
            java.lang.System.arraycopy(r3, r1, r4, r1, r0)
            return
    }

    static void reduceCoefficients(long[] r14) {
            r0 = 10
            r1 = 0
            r14[r0] = r1
            r3 = 0
            r4 = r3
        L8:
            r5 = 26
            r6 = 67108864(0x4000000, double:3.3156184E-316)
            if (r4 >= r0) goto L33
            r8 = r14[r4]
            long r6 = r8 / r6
            long r10 = r6 << r5
            long r8 = r8 - r10
            r14[r4] = r8
            int r5 = r4 + 1
            r8 = r14[r5]
            long r8 = r8 + r6
            r14[r5] = r8
            r6 = 33554432(0x2000000, double:1.6578092E-316)
            long r6 = r8 / r6
            r10 = 25
            long r10 = r6 << r10
            long r8 = r8 - r10
            r14[r5] = r8
            int r4 = r4 + 2
            r8 = r14[r4]
            long r8 = r8 + r6
            r14[r4] = r8
            goto L8
        L33:
            r8 = r14[r3]
            r10 = r14[r0]
            r4 = 4
            long r12 = r10 << r4
            long r8 = r8 + r12
            r14[r3] = r8
            r4 = 1
            long r12 = r10 << r4
            long r8 = r8 + r12
            r14[r3] = r8
            long r8 = r8 + r10
            r14[r3] = r8
            r14[r0] = r1
            long r0 = r8 / r6
            long r5 = r0 << r5
            long r8 = r8 - r5
            r14[r3] = r8
            r2 = r14[r4]
            long r2 = r2 + r0
            r14[r4] = r2
            return
    }

    static void reduceSizeByModularReduction(long[] r9) {
            r0 = 8
            r1 = r9[r0]
            r3 = 18
            r3 = r9[r3]
            r5 = 4
            long r6 = r3 << r5
            long r1 = r1 + r6
            r9[r0] = r1
            r6 = 1
            long r7 = r3 << r6
            long r1 = r1 + r7
            r9[r0] = r1
            long r1 = r1 + r3
            r9[r0] = r1
            r0 = 7
            r1 = r9[r0]
            r3 = 17
            r3 = r9[r3]
            long r7 = r3 << r5
            long r1 = r1 + r7
            r9[r0] = r1
            long r7 = r3 << r6
            long r1 = r1 + r7
            r9[r0] = r1
            long r1 = r1 + r3
            r9[r0] = r1
            r0 = 6
            r1 = r9[r0]
            r3 = 16
            r3 = r9[r3]
            long r7 = r3 << r5
            long r1 = r1 + r7
            r9[r0] = r1
            long r7 = r3 << r6
            long r1 = r1 + r7
            r9[r0] = r1
            long r1 = r1 + r3
            r9[r0] = r1
            r0 = 5
            r1 = r9[r0]
            r3 = 15
            r3 = r9[r3]
            long r7 = r3 << r5
            long r1 = r1 + r7
            r9[r0] = r1
            long r7 = r3 << r6
            long r1 = r1 + r7
            r9[r0] = r1
            long r1 = r1 + r3
            r9[r0] = r1
            r0 = r9[r5]
            r2 = 14
            r2 = r9[r2]
            long r7 = r2 << r5
            long r0 = r0 + r7
            r9[r5] = r0
            long r7 = r2 << r6
            long r0 = r0 + r7
            r9[r5] = r0
            long r0 = r0 + r2
            r9[r5] = r0
            r0 = 3
            r1 = r9[r0]
            r3 = 13
            r3 = r9[r3]
            long r7 = r3 << r5
            long r1 = r1 + r7
            r9[r0] = r1
            long r7 = r3 << r6
            long r1 = r1 + r7
            r9[r0] = r1
            long r1 = r1 + r3
            r9[r0] = r1
            r0 = 2
            r1 = r9[r0]
            r3 = 12
            r3 = r9[r3]
            long r7 = r3 << r5
            long r1 = r1 + r7
            r9[r0] = r1
            long r7 = r3 << r6
            long r1 = r1 + r7
            r9[r0] = r1
            long r1 = r1 + r3
            r9[r0] = r1
            r0 = r9[r6]
            r2 = 11
            r2 = r9[r2]
            long r7 = r2 << r5
            long r0 = r0 + r7
            r9[r6] = r0
            long r7 = r2 << r6
            long r0 = r0 + r7
            r9[r6] = r0
            long r0 = r0 + r2
            r9[r6] = r0
            r0 = 0
            r1 = r9[r0]
            r3 = 10
            r3 = r9[r3]
            long r7 = r3 << r5
            long r1 = r1 + r7
            r9[r0] = r1
            long r5 = r3 << r6
            long r1 = r1 + r5
            r9[r0] = r1
            long r1 = r1 + r3
            r9[r0] = r1
            return
    }

    static void scalarProduct(long[] r3, long[] r4, long r5) {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto Ld
            r1 = r4[r0]
            long r1 = r1 * r5
            r3[r0] = r1
            int r0 = r0 + 1
            goto L1
        Ld:
            return
    }

    static void square(long[] r1, long[] r2) {
            r0 = 19
            long[] r0 = new long[r0]
            squareInner(r0, r2)
            reduce(r0, r1)
            return
    }

    private static void squareInner(long[] r30, long[] r31) {
            r0 = 0
            r1 = r31[r0]
            long r1 = r1 * r1
            r30[r0] = r1
            r0 = r31[r0]
            r2 = 2
            long r4 = r0 * r2
            r6 = 1
            r7 = r31[r6]
            long r4 = r4 * r7
            r30[r6] = r4
            r4 = r31[r6]
            long r6 = r4 * r4
            r8 = 2
            r9 = r31[r8]
            long r9 = r9 * r0
            long r6 = r6 + r9
            long r6 = r6 * r2
            r30[r8] = r6
            r6 = r31[r8]
            long r8 = r4 * r6
            r10 = 3
            r11 = r31[r10]
            long r11 = r11 * r0
            long r8 = r8 + r11
            long r8 = r8 * r2
            r30[r10] = r8
            long r8 = r6 * r6
            r11 = 4
            long r13 = r4 * r11
            r15 = r31[r10]
            long r13 = r13 * r15
            long r8 = r8 + r13
            long r13 = r0 * r2
            r10 = 4
            r17 = r31[r10]
            long r13 = r13 * r17
            long r8 = r8 + r13
            r30[r10] = r8
            long r8 = r6 * r15
            r13 = r31[r10]
            long r17 = r4 * r13
            long r8 = r8 + r17
            r10 = 5
            r17 = r31[r10]
            long r17 = r17 * r0
            long r8 = r8 + r17
            long r8 = r8 * r2
            r30[r10] = r8
            long r8 = r15 * r15
            long r17 = r6 * r13
            long r8 = r8 + r17
            r17 = 6
            r18 = r31[r17]
            long r18 = r18 * r0
            long r8 = r8 + r18
            long r18 = r4 * r2
            r20 = r31[r10]
            long r18 = r18 * r20
            long r8 = r8 + r18
            long r8 = r8 * r2
            r30[r17] = r8
            long r8 = r15 * r13
            long r18 = r6 * r20
            long r8 = r8 + r18
            r17 = r31[r17]
            long r22 = r4 * r17
            long r8 = r8 + r22
            r10 = 7
            r22 = r31[r10]
            long r22 = r22 * r0
            long r8 = r8 + r22
            long r8 = r8 * r2
            r30[r10] = r8
            long r8 = r13 * r13
            long r22 = r6 * r17
            r19 = 8
            r24 = r31[r19]
            long r24 = r24 * r0
            long r22 = r22 + r24
            r24 = r31[r10]
            long r26 = r4 * r24
            long r28 = r15 * r20
            long r26 = r26 + r28
            long r26 = r26 * r2
            long r22 = r22 + r26
            long r22 = r22 * r2
            long r8 = r8 + r22
            r30[r19] = r8
            long r8 = r13 * r20
            long r22 = r15 * r17
            long r8 = r8 + r22
            long r22 = r6 * r24
            long r8 = r8 + r22
            r22 = r31[r19]
            long r26 = r4 * r22
            long r8 = r8 + r26
            r10 = 9
            r26 = r31[r10]
            long r0 = r0 * r26
            long r8 = r8 + r0
            long r8 = r8 * r2
            r30[r10] = r8
            long r0 = r20 * r20
            long r8 = r13 * r17
            long r0 = r0 + r8
            long r8 = r6 * r22
            long r0 = r0 + r8
            long r8 = r15 * r24
            r26 = r31[r10]
            long r4 = r4 * r26
            long r8 = r8 + r4
            long r8 = r8 * r2
            long r0 = r0 + r8
            long r0 = r0 * r2
            r4 = 10
            r30[r4] = r0
            long r0 = r20 * r17
            long r4 = r13 * r24
            long r0 = r0 + r4
            long r4 = r15 * r22
            long r0 = r0 + r4
            long r6 = r6 * r26
            long r0 = r0 + r6
            long r0 = r0 * r2
            r4 = 11
            r30[r4] = r0
            long r0 = r17 * r17
            long r4 = r13 * r22
            long r6 = r20 * r24
            long r15 = r15 * r26
            long r6 = r6 + r15
            long r6 = r6 * r2
            long r4 = r4 + r6
            long r4 = r4 * r2
            long r0 = r0 + r4
            r4 = 12
            r30[r4] = r0
            long r0 = r17 * r24
            long r4 = r20 * r22
            long r0 = r0 + r4
            long r13 = r13 * r26
            long r0 = r0 + r13
            long r0 = r0 * r2
            r4 = 13
            r30[r4] = r0
            long r0 = r24 * r24
            long r4 = r17 * r22
            long r0 = r0 + r4
            long r20 = r20 * r2
            long r20 = r20 * r26
            long r0 = r0 + r20
            long r0 = r0 * r2
            r4 = 14
            r30[r4] = r0
            long r0 = r24 * r22
            long r17 = r17 * r26
            long r0 = r0 + r17
            long r0 = r0 * r2
            r4 = 15
            r30[r4] = r0
            long r0 = r22 * r22
            long r24 = r24 * r11
            long r24 = r24 * r26
            long r0 = r0 + r24
            r4 = 16
            r30[r4] = r0
            long r22 = r22 * r2
            long r22 = r22 * r26
            r0 = 17
            r30[r0] = r22
            long r2 = r2 * r26
            long r2 = r2 * r26
            r0 = 18
            r30[r0] = r2
            return
    }

    static void sub(long[] r0, long[] r1) {
            sub(r0, r1, r0)
            return
    }

    static void sub(long[] r5, long[] r6, long[] r7) {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto Lf
            r1 = r6[r0]
            r3 = r7[r0]
            long r1 = r1 - r3
            r5[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    static void sum(long[] r0, long[] r1) {
            sum(r0, r0, r1)
            return
    }

    static void sum(long[] r5, long[] r6, long[] r7) {
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto Lf
            r1 = r6[r0]
            r3 = r7[r0]
            long r1 = r1 + r3
            r5[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }
}
