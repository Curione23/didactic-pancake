package org.apache.commons.compress.compressors.bzip2;

/* JADX INFO: loaded from: classes2.dex */
final class BlockSort {
    private static final int CLEARMASK = -2097153;
    private static final int DEPTH_THRESH = 10;
    private static final int FALLBACK_QSORT_SMALL_THRESH = 10;
    private static final int FALLBACK_QSORT_STACK_SIZE = 100;
    private static final int FTAB_LENGTH = 65537;
    private static final int[] INCS = null;
    private static final int QSORT_STACK_SIZE = 1000;
    private static final int SETMASK = 2097152;
    private static final int SMALL_THRESH = 20;
    private static final int STACK_SIZE = 0;
    private static final int WORK_FACTOR = 30;
    private int[] eclass;
    private boolean firstAttempt;
    private final int[] ftab;
    private final boolean[] mainSort_bigDone;
    private final int[] mainSort_copy;
    private final int[] mainSort_runningOrder;
    private final char[] quadrant;
    private final int[] stack_dd;
    private final int[] stack_hh;
    private final int[] stack_ll;
    private int workDone;
    private int workLimit;

    static {
            r0 = 1000(0x3e8, float:1.401E-42)
            r1 = 100
            int r0 = java.lang.Math.max(r0, r1)
            org.apache.commons.compress.compressors.bzip2.BlockSort.STACK_SIZE = r0
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484} // fill-array
            org.apache.commons.compress.compressors.bzip2.BlockSort.INCS = r0
            return
    }

    BlockSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r3) {
            r2 = this;
            r2.<init>()
            int r0 = org.apache.commons.compress.compressors.bzip2.BlockSort.STACK_SIZE
            int[] r1 = new int[r0]
            r2.stack_ll = r1
            int[] r0 = new int[r0]
            r2.stack_hh = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            int[] r0 = new int[r0]
            r2.stack_dd = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2.mainSort_runningOrder = r1
            int[] r1 = new int[r0]
            r2.mainSort_copy = r1
            boolean[] r0 = new boolean[r0]
            r2.mainSort_bigDone = r0
            r0 = 65537(0x10001, float:9.1837E-41)
            int[] r0 = new int[r0]
            r2.ftab = r0
            char[] r3 = r3.sfmap
            r2.quadrant = r3
            return
    }

    private void fallbackQSort3(int[] r19, int[] r20, int r21, int r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r4 = r21
            r5 = r22
            r0.fpush(r3, r4, r5)
            r4 = 0
            r6 = 1
            r8 = r4
            r7 = r6
        L13:
            if (r7 <= 0) goto Lf1
            int r10 = r7 + (-1)
            int[] r11 = r0.fpop(r10)
            r12 = r11[r3]
            r11 = r11[r6]
            int r13 = r11 - r12
            r14 = 10
            if (r13 >= r14) goto L2a
            r0.fallbackSimpleSort(r1, r2, r12, r11)
            r7 = r10
            goto L13
        L2a:
            r13 = 7621(0x1dc5, double:3.7653E-320)
            long r8 = r8 * r13
            r13 = 1
            long r8 = r8 + r13
            r15 = 32768(0x8000, double:1.61895E-319)
            long r8 = r8 % r15
            r15 = 3
            long r15 = r8 % r15
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 != 0) goto L42
            r13 = r1[r12]
            r13 = r2[r13]
        L40:
            long r13 = (long) r13
            goto L53
        L42:
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r13 != 0) goto L4e
            int r13 = r12 + r11
            int r13 = r13 >>> r6
            r13 = r1[r13]
            r13 = r2[r13]
            goto L40
        L4e:
            r13 = r1[r11]
            r13 = r2[r13]
            goto L40
        L53:
            r3 = r11
            r5 = r3
            r4 = r12
            r15 = r4
        L57:
            if (r15 <= r3) goto L5a
            goto L6e
        L5a:
            r17 = r1[r15]
            r17 = r2[r17]
            int r6 = (int) r13
            int r17 = r17 - r6
            if (r17 != 0) goto L6c
            r0.fswap(r1, r15, r4)
            int r4 = r4 + 1
            int r15 = r15 + 1
            r6 = 1
            goto L57
        L6c:
            if (r17 <= 0) goto Le7
        L6e:
            if (r15 <= r3) goto L71
            goto L85
        L71:
            r6 = r1[r3]
            r6 = r2[r6]
            int r2 = (int) r13
            int r6 = r6 - r2
            if (r6 != 0) goto L83
            r0.fswap(r1, r3, r5)
            int r5 = r5 + (-1)
        L7e:
            int r3 = r3 + (-1)
            r2 = r20
            goto L6e
        L83:
            if (r6 >= 0) goto Le4
        L85:
            if (r15 <= r3) goto Lda
            if (r5 >= r4) goto L91
            r2 = r20
            r7 = r10
            r3 = 0
            r4 = 0
            r6 = 1
            goto L13
        L91:
            int r2 = r4 - r12
            int r6 = r15 - r4
            int r2 = java.lang.Math.min(r2, r6)
            int r6 = r15 - r2
            r0.fvswap(r1, r12, r6, r2)
            int r2 = r11 - r5
            int r5 = r5 - r3
            int r2 = java.lang.Math.min(r2, r5)
            int r3 = r3 + 1
            int r6 = r11 - r2
            r17 = 1
            int r6 = r6 + 1
            r0.fvswap(r1, r3, r6, r2)
            int r15 = r15 + r12
            int r15 = r15 - r4
            int r15 = r15 + (-1)
            int r2 = r11 - r5
            int r2 = r2 + 1
            int r3 = r15 - r12
            int r4 = r11 - r2
            if (r3 <= r4) goto Lc8
            r0.fpush(r10, r12, r15)
            int r3 = r7 + 1
            r0.fpush(r7, r2, r11)
            r7 = r3
            goto Ld1
        Lc8:
            r0.fpush(r10, r2, r11)
            int r2 = r7 + 1
            r0.fpush(r7, r12, r15)
            r7 = r2
        Ld1:
            r2 = r20
            r6 = r17
            r3 = 0
            r4 = 0
            goto L13
        Lda:
            r17 = 1
            r0.fswap(r1, r15, r3)
            int r15 = r15 + 1
            int r3 = r3 + (-1)
            goto Leb
        Le4:
            r17 = 1
            goto L7e
        Le7:
            r17 = 1
            int r15 = r15 + 1
        Leb:
            r2 = r20
            r6 = r17
            goto L57
        Lf1:
            return
    }

    private void fallbackSimpleSort(int[] r7, int[] r8, int r9, int r10) {
            r6 = this;
            if (r9 != r10) goto L3
            return
        L3:
            int r0 = r10 - r9
            r1 = 3
            if (r0 <= r1) goto L28
            int r0 = r10 + (-4)
        La:
            if (r0 < r9) goto L28
            r1 = r7[r0]
            r2 = r8[r1]
            int r3 = r0 + 4
        L12:
            if (r3 > r10) goto L21
            r4 = r7[r3]
            r5 = r8[r4]
            if (r2 <= r5) goto L21
            int r5 = r3 + (-4)
            r7[r5] = r4
            int r3 = r3 + 4
            goto L12
        L21:
            int r3 = r3 + (-4)
            r7[r3] = r1
            int r0 = r0 + (-1)
            goto La
        L28:
            int r0 = r10 + (-1)
        L2a:
            if (r0 < r9) goto L48
            r1 = r7[r0]
            r2 = r8[r1]
            int r3 = r0 + 1
        L32:
            if (r3 > r10) goto L41
            r4 = r7[r3]
            r5 = r8[r4]
            if (r2 <= r5) goto L41
            int r5 = r3 + (-1)
            r7[r5] = r4
            int r3 = r3 + 1
            goto L32
        L41:
            int r3 = r3 + (-1)
            r7[r3] = r1
            int r0 = r0 + (-1)
            goto L2a
        L48:
            return
    }

    private int[] fpop(int r3) {
            r2 = this;
            int[] r0 = r2.stack_ll
            r0 = r0[r3]
            int[] r1 = r2.stack_hh
            r3 = r1[r3]
            int[] r3 = new int[]{r0, r3}
            return r3
    }

    private void fpush(int r2, int r3, int r4) {
            r1 = this;
            int[] r0 = r1.stack_ll
            r0[r2] = r3
            int[] r3 = r1.stack_hh
            r3[r2] = r4
            return
    }

    private void fswap(int[] r3, int r4, int r5) {
            r2 = this;
            r0 = r3[r4]
            r1 = r3[r5]
            r3[r4] = r1
            r3[r5] = r0
            return
    }

    private void fvswap(int[] r1, int r2, int r3, int r4) {
            r0 = this;
        L0:
            if (r4 <= 0) goto Lc
            r0.fswap(r1, r2, r3)
            int r2 = r2 + 1
            int r3 = r3 + 1
            int r4 = r4 + (-1)
            goto L0
        Lc:
            return
    }

    private int[] getEclass() {
            r1 = this;
            int[] r0 = r1.eclass
            if (r0 != 0) goto Ld
            char[] r0 = r1.quadrant
            int r0 = r0.length
            int r0 = r0 / 2
            int[] r0 = new int[r0]
            r1.eclass = r0
        Ld:
            int[] r0 = r1.eclass
            return r0
    }

    private void mainQSort3(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r6 = r19
            r7 = r20
            int[] r8 = r6.stack_ll
            int[] r9 = r6.stack_hh
            int[] r10 = r6.stack_dd
            int[] r11 = r7.fmap
            byte[] r12 = r7.block
            r0 = 0
            r8[r0] = r21
            r9[r0] = r22
            r10[r0] = r23
            r13 = 1
            r0 = r13
        L17:
            int r14 = r0 + (-1)
            if (r14 < 0) goto L112
            r2 = r8[r14]
            r3 = r9[r14]
            r4 = r10[r14]
            int r1 = r3 - r2
            r5 = 20
            if (r1 < r5) goto Lfa
            r1 = 10
            if (r4 <= r1) goto L2d
            goto Lfa
        L2d:
            int r1 = r4 + 1
            r5 = r11[r2]
            int r5 = r5 + r1
            r5 = r12[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r15 = r11[r3]
            int r15 = r15 + r1
            r15 = r12[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r16 = r2 + r3
            int r16 = r16 >>> 1
            r16 = r11[r16]
            int r16 = r16 + r1
            r13 = r12[r16]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r5 = med3(r5, r15, r13)
            r6 = r2
            r13 = r6
            r15 = r3
            r16 = r15
        L52:
            if (r13 > r15) goto L73
            r17 = r11[r13]
            int r18 = r17 + r1
            r7 = r12[r18]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 - r5
            if (r7 != 0) goto L6d
            int r7 = r13 + 1
            r18 = r11[r6]
            r11[r13] = r18
            int r13 = r6 + 1
            r11[r6] = r17
            r6 = r13
            r13 = r7
            goto Lf6
        L6d:
            if (r7 >= 0) goto L73
            int r13 = r13 + 1
            goto Lf6
        L73:
            r7 = r16
        L75:
            if (r13 > r15) goto L98
            r16 = r11[r15]
            int r17 = r16 + r1
            r22 = r0
            r0 = r12[r17]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r5
            if (r0 != 0) goto L91
            int r0 = r15 + (-1)
            r17 = r11[r7]
            r11[r15] = r17
            int r15 = r7 + (-1)
            r11[r7] = r16
            r7 = r15
            r15 = r0
            goto L95
        L91:
            if (r0 <= 0) goto L9a
            int r15 = r15 + (-1)
        L95:
            r0 = r22
            goto L75
        L98:
            r22 = r0
        L9a:
            if (r13 <= r15) goto Le1
            if (r7 >= r6) goto La5
            r8[r14] = r2
            r9[r14] = r3
            r10[r14] = r1
            goto Ldc
        La5:
            int r0 = r6 - r2
            int r5 = r13 - r6
            int r0 = java.lang.Math.min(r0, r5)
            int r5 = r13 - r0
            vswap(r11, r2, r5, r0)
            int r0 = r3 - r7
            int r7 = r7 - r15
            int r0 = java.lang.Math.min(r0, r7)
            int r5 = r3 - r0
            r15 = 1
            int r5 = r5 + r15
            vswap(r11, r13, r5, r0)
            int r13 = r13 + r2
            int r13 = r13 - r6
            int r0 = r13 + (-1)
            int r5 = r3 - r7
            int r6 = r5 + 1
            r8[r14] = r2
            r9[r14] = r0
            r10[r14] = r4
            r8[r22] = r13
            r9[r22] = r5
            r10[r22] = r1
            int r14 = r22 + 1
            r8[r14] = r6
            r9[r14] = r3
            r10[r14] = r4
        Ldc:
            r16 = 1
            int r14 = r14 + 1
            goto L109
        Le1:
            r16 = 1
            r0 = r11[r13]
            int r17 = r13 + 1
            r18 = r11[r15]
            r11[r13] = r18
            int r13 = r15 + (-1)
            r11[r15] = r0
            r0 = r22
            r16 = r7
            r15 = r13
            r13 = r17
        Lf6:
            r7 = r20
            goto L52
        Lfa:
            r16 = r13
            r0 = r19
            r1 = r20
            r5 = r24
            boolean r0 = r0.mainSimpleSort(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L109
            return
        L109:
            r0 = r14
            r6 = r19
            r7 = r20
            r13 = r16
            goto L17
        L112:
            return
    }

    private boolean mainSimpleSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r29, int r30, int r31, int r32, int r33) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r31
            int r3 = r2 - r30
            r4 = 1
            int r3 = r3 + r4
            r5 = 2
            if (r3 >= r5) goto L1a
            boolean r1 = r0.firstAttempt
            if (r1 == 0) goto L18
            int r1 = r0.workDone
            int r2 = r0.workLimit
            if (r1 <= r2) goto L18
            goto L19
        L18:
            r4 = 0
        L19:
            return r4
        L1a:
            r5 = 0
        L1b:
            int[] r7 = org.apache.commons.compress.compressors.bzip2.BlockSort.INCS
            r7 = r7[r5]
            if (r7 >= r3) goto L24
            int r5 = r5 + 1
            goto L1b
        L24:
            int[] r3 = r1.fmap
            char[] r7 = r0.quadrant
            byte[] r1 = r1.block
            int r8 = r33 + 1
            boolean r9 = r0.firstAttempt
            int r10 = r0.workLimit
            int r11 = r0.workDone
        L32:
            int r5 = r5 + (-1)
            if (r5 < 0) goto L1db
            int[] r12 = org.apache.commons.compress.compressors.bzip2.BlockSort.INCS
            r12 = r12[r5]
            int r13 = r30 + r12
            int r14 = r13 + (-1)
        L3e:
            if (r13 > r2) goto L1d7
            r15 = 3
        L41:
            if (r13 > r2) goto L1c1
            int r15 = r15 + (-1)
            if (r15 < 0) goto L1c1
            r16 = r3[r13]
            int r17 = r16 + r32
            r19 = r13
            r18 = 0
            r20 = 0
        L51:
            if (r18 == 0) goto L66
            r3[r19] = r20
            int r4 = r19 - r12
            if (r4 > r14) goto L63
            r22 = r5
            r25 = r12
            r27 = r14
            r24 = r15
            goto L1b2
        L63:
            r19 = r4
            goto L68
        L66:
            r18 = 1
        L68:
            int r4 = r19 - r12
            r4 = r3[r4]
            int r21 = r4 + r32
            int r22 = r21 + 1
            r6 = r1[r22]
            int r22 = r17 + 1
            r29 = r4
            r4 = r1[r22]
            if (r6 != r4) goto L195
            int r4 = r21 + 2
            r4 = r1[r4]
            int r6 = r17 + 2
            r6 = r1[r6]
            if (r4 != r6) goto L186
            int r4 = r21 + 3
            r4 = r1[r4]
            int r6 = r17 + 3
            r6 = r1[r6]
            if (r4 != r6) goto L177
            int r4 = r21 + 4
            r4 = r1[r4]
            int r6 = r17 + 4
            r6 = r1[r6]
            if (r4 != r6) goto L168
            int r4 = r21 + 5
            r4 = r1[r4]
            int r6 = r17 + 5
            r6 = r1[r6]
            if (r4 != r6) goto L159
            int r21 = r21 + 6
            r4 = r1[r21]
            int r6 = r17 + 6
            r22 = r5
            r5 = r1[r6]
            if (r4 != r5) goto L14c
            r4 = r33
        Lb0:
            if (r4 <= 0) goto L144
            int r4 = r4 + (-4)
            int r5 = r21 + 1
            r23 = r4
            r4 = r1[r5]
            int r24 = r6 + 1
            r25 = r12
            r12 = r1[r24]
            if (r4 != r12) goto L138
            char r4 = r7[r21]
            char r12 = r7[r6]
            if (r4 != r12) goto L131
            int r4 = r21 + 2
            r12 = r1[r4]
            int r26 = r6 + 2
            r27 = r14
            r14 = r1[r26]
            if (r12 != r14) goto L128
            char r5 = r7[r5]
            char r12 = r7[r24]
            if (r5 != r12) goto L123
            int r5 = r21 + 3
            r12 = r1[r5]
            int r14 = r6 + 3
            r24 = r15
            r15 = r1[r14]
            if (r12 != r15) goto L11c
            char r4 = r7[r4]
            char r12 = r7[r26]
            if (r4 != r12) goto L119
            int r4 = r21 + 4
            r12 = r1[r4]
            int r6 = r6 + 4
            r15 = r1[r6]
            if (r12 != r15) goto L112
            char r5 = r7[r5]
            char r12 = r7[r14]
            if (r5 != r12) goto L10f
            if (r4 < r8) goto Lff
            int r4 = r4 - r8
        Lff:
            r21 = r4
            if (r6 < r8) goto L104
            int r6 = r6 - r8
        L104:
            int r11 = r11 + 1
            r4 = r23
            r15 = r24
            r12 = r25
            r14 = r27
            goto Lb0
        L10f:
            if (r5 <= r12) goto L1b0
            goto L142
        L112:
            r4 = r12 & 255(0xff, float:3.57E-43)
            r5 = r15 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L142
        L119:
            if (r4 <= r12) goto L1b0
            goto L142
        L11c:
            r4 = r12 & 255(0xff, float:3.57E-43)
            r5 = r15 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L142
        L123:
            r24 = r15
            if (r5 <= r12) goto L1b0
            goto L142
        L128:
            r24 = r15
            r4 = r12 & 255(0xff, float:3.57E-43)
            r5 = r14 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L142
        L131:
            r27 = r14
            r24 = r15
            if (r4 <= r12) goto L1b0
            goto L142
        L138:
            r27 = r14
            r24 = r15
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r12 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
        L142:
            goto L1a3
        L144:
            r25 = r12
            r27 = r14
            r24 = r15
            goto L1b0
        L14c:
            r25 = r12
            r27 = r14
            r24 = r15
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L1a3
        L159:
            r22 = r5
            r25 = r12
            r27 = r14
            r24 = r15
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r6 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L1a3
        L168:
            r22 = r5
            r25 = r12
            r27 = r14
            r24 = r15
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r6 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L1a3
        L177:
            r22 = r5
            r25 = r12
            r27 = r14
            r24 = r15
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r6 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L1a3
        L186:
            r22 = r5
            r25 = r12
            r27 = r14
            r24 = r15
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r6 & 255(0xff, float:3.57E-43)
            if (r4 <= r5) goto L1b0
            goto L1a3
        L195:
            r22 = r5
            r25 = r12
            r27 = r14
            r24 = r15
            r5 = r6 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r5 <= r4) goto L1b0
        L1a3:
            r20 = r29
            r5 = r22
            r15 = r24
            r12 = r25
            r14 = r27
            r4 = 1
            goto L51
        L1b0:
            r4 = r19
        L1b2:
            r3[r4] = r16
            int r13 = r13 + 1
            r5 = r22
            r15 = r24
            r12 = r25
            r14 = r27
            r4 = 1
            goto L41
        L1c1:
            r22 = r5
            r25 = r12
            r27 = r14
            if (r9 == 0) goto L1ce
            if (r13 > r2) goto L1ce
            if (r11 <= r10) goto L1ce
            goto L1db
        L1ce:
            r5 = r22
            r12 = r25
            r14 = r27
            r4 = 1
            goto L3e
        L1d7:
            r22 = r5
            goto L32
        L1db:
            r0.workDone = r11
            if (r9 == 0) goto L1e3
            if (r11 <= r10) goto L1e3
            r4 = 1
            goto L1e4
        L1e3:
            r4 = 0
        L1e4:
            return r4
    }

    private static int med3(int r0, int r1, int r2) {
            if (r0 >= r1) goto L8
            if (r1 >= r2) goto L5
            goto La
        L5:
            if (r0 >= r2) goto Lf
            goto Le
        L8:
            if (r1 <= r2) goto Lc
        La:
            r0 = r1
            goto Lf
        Lc:
            if (r0 <= r2) goto Lf
        Le:
            r0 = r2
        Lf:
            return r0
    }

    private static void vswap(int[] r3, int r4, int r5, int r6) {
            int r6 = r6 + r4
        L1:
            if (r4 >= r6) goto L12
            r0 = r3[r4]
            int r1 = r4 + 1
            r2 = r3[r5]
            r3[r4] = r2
            int r4 = r5 + 1
            r3[r5] = r0
            r5 = r4
            r4 = r1
            goto L1
        L12:
            return
    }

    void blockSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r4, int r5) {
            r3 = this;
            int r0 = r5 * 30
            r3.workLimit = r0
            r0 = 0
            r3.workDone = r0
            r1 = 1
            r3.firstAttempt = r1
            int r1 = r5 + 1
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 >= r2) goto L14
            r3.fallbackSort(r4, r5)
            goto L24
        L14:
            r3.mainSort(r4, r5)
            boolean r1 = r3.firstAttempt
            if (r1 == 0) goto L24
            int r1 = r3.workDone
            int r2 = r3.workLimit
            if (r1 <= r2) goto L24
            r3.fallbackSort(r4, r5)
        L24:
            int[] r1 = r4.fmap
            r2 = -1
            r4.origPtr = r2
        L29:
            if (r0 > r5) goto L35
            r2 = r1[r0]
            if (r2 != 0) goto L32
            r4.origPtr = r0
            goto L35
        L32:
            int r0 = r0 + 1
            goto L29
        L35:
            return
    }

    void fallbackSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r6, int r7) {
            r5 = this;
            byte[] r0 = r6.block
            byte[] r1 = r6.block
            int r2 = r7 + 1
            r1 = r1[r2]
            r3 = 0
            r0[r3] = r1
            int[] r0 = r6.fmap
            byte[] r1 = r6.block
            r5.fallbackSort(r0, r1, r2)
            r0 = r3
        L13:
            if (r0 >= r2) goto L20
            int[] r1 = r6.fmap
            r4 = r1[r0]
            int r4 = r4 + (-1)
            r1[r0] = r4
            int r0 = r0 + 1
            goto L13
        L20:
            if (r3 >= r2) goto L31
            int[] r0 = r6.fmap
            r0 = r0[r3]
            r1 = -1
            if (r0 != r1) goto L2e
            int[] r6 = r6.fmap
            r6[r3] = r7
            goto L31
        L2e:
            int r3 = r3 + 1
            goto L20
        L31:
            return
    }

    void fallbackSort(int[] r11, byte[] r12, int r13) {
            r10 = this;
            r0 = 257(0x101, float:3.6E-43)
            int[] r1 = new int[r0]
            int[] r2 = r10.getEclass()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r13) goto L11
            r2[r4] = r3
            int r4 = r4 + 1
            goto La
        L11:
            r4 = r3
        L12:
            r5 = 1
            if (r4 >= r13) goto L21
            r6 = r12[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = r1[r6]
            int r7 = r7 + r5
            r1[r6] = r7
            int r4 = r4 + 1
            goto L12
        L21:
            r4 = r5
        L22:
            if (r4 >= r0) goto L30
            r6 = r1[r4]
            int r7 = r4 + (-1)
            r7 = r1[r7]
            int r6 = r6 + r7
            r1[r4] = r6
            int r4 = r4 + 1
            goto L22
        L30:
            r0 = r3
        L31:
            if (r0 >= r13) goto L41
            r4 = r12[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r6 = r1[r4]
            int r6 = r6 - r5
            r1[r4] = r6
            r11[r6] = r0
            int r0 = r0 + 1
            goto L31
        L41:
            int r12 = r13 + 64
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r12)
            r12 = r3
        L49:
            r4 = 256(0x100, float:3.59E-43)
            if (r12 >= r4) goto L55
            r4 = r1[r12]
            r0.set(r4)
            int r12 = r12 + 1
            goto L49
        L55:
            r12 = r3
        L56:
            r1 = 32
            if (r12 >= r1) goto L67
            int r1 = r12 * 2
            int r1 = r1 + r13
            r0.set(r1)
            int r1 = r1 + r5
            r0.clear(r1)
            int r12 = r12 + 1
            goto L56
        L67:
            r12 = r5
        L68:
            r1 = r3
            r4 = r1
        L6a:
            if (r1 >= r13) goto L7e
            boolean r6 = r0.get(r1)
            if (r6 == 0) goto L73
            r4 = r1
        L73:
            r6 = r11[r1]
            int r6 = r6 - r12
            if (r6 >= 0) goto L79
            int r6 = r6 + r13
        L79:
            r2[r6] = r4
            int r1 = r1 + 1
            goto L6a
        L7e:
            r1 = -1
            r4 = r1
            r6 = r3
        L81:
            int r4 = r4 + r5
            int r4 = r0.nextClearBit(r4)
            int r7 = r4 + (-1)
            if (r7 < r13) goto L8b
            goto L94
        L8b:
            int r4 = r4 + 1
            int r4 = r0.nextSetBit(r4)
            int r4 = r4 - r5
            if (r4 < r13) goto L9b
        L94:
            int r12 = r12 * 2
            if (r12 > r13) goto L9a
            if (r6 != 0) goto L68
        L9a:
            return
        L9b:
            if (r4 <= r7) goto L81
            int r8 = r4 - r7
            int r8 = r8 + r5
            int r6 = r6 + r8
            r10.fallbackQSort3(r11, r2, r7, r4)
            r8 = r1
        La5:
            if (r7 > r4) goto L81
            r9 = r11[r7]
            r9 = r2[r9]
            if (r8 == r9) goto Lb1
            r0.set(r7)
            r8 = r9
        Lb1:
            int r7 = r7 + 1
            goto La5
    }

    void mainSort(org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.Data r29, int r30) {
            r28 = this;
            r6 = r28
            r7 = r29
            r8 = r30
            int[] r9 = r6.mainSort_runningOrder
            int[] r10 = r6.mainSort_copy
            boolean[] r11 = r6.mainSort_bigDone
            int[] r12 = r6.ftab
            byte[] r13 = r7.block
            int[] r14 = r7.fmap
            char[] r15 = r6.quadrant
            int r5 = r6.workLimit
            boolean r4 = r6.firstAttempt
            r3 = 0
            java.util.Arrays.fill(r12, r3)
            r0 = r3
        L1d:
            r2 = 20
            r1 = 1
            if (r0 >= r2) goto L33
            int r2 = r8 + r0
            int r2 = r2 + 2
            int r16 = r8 + 1
            int r16 = r0 % r16
            int r16 = r16 + 1
            r1 = r13[r16]
            r13[r2] = r1
            int r0 = r0 + 1
            goto L1d
        L33:
            int r0 = r8 + 21
        L35:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L3c
            r15[r0] = r3
            goto L35
        L3c:
            int r0 = r8 + 1
            r2 = r13[r0]
            r13[r3] = r2
            r17 = r4
            r4 = 255(0xff, float:3.57E-43)
            r2 = r2 & r4
        L47:
            if (r3 > r8) goto L5c
            int r3 = r3 + 1
            r1 = r13[r3]
            r1 = r1 & r4
            int r2 = r2 << 8
            int r2 = r2 + r1
            r20 = r12[r2]
            r19 = 1
            int r20 = r20 + 1
            r12[r2] = r20
            r2 = r1
            r1 = 1
            goto L47
        L5c:
            r1 = 1
        L5d:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 > r2) goto L6d
            r2 = r12[r1]
            int r3 = r1 + (-1)
            r3 = r12[r3]
            int r2 = r2 + r3
            r12[r1] = r2
            int r1 = r1 + 1
            goto L5d
        L6d:
            r1 = 1
            r2 = r13[r1]
            r2 = r2 & r4
            r3 = 0
        L72:
            if (r3 >= r8) goto L8c
            int r19 = r3 + 2
            r1 = r13[r19]
            r1 = r1 & r4
            int r2 = r2 << 8
            int r2 = r2 + r1
            r19 = r12[r2]
            r20 = 1
            int r19 = r19 + (-1)
            r12[r2] = r19
            r14[r19] = r3
            int r3 = r3 + 1
            r2 = r1
            r1 = r20
            goto L72
        L8c:
            r20 = r1
            r0 = r13[r0]
            r0 = r0 & r4
            int r0 = r0 << 8
            r1 = r13[r20]
            r1 = r1 & r4
            int r0 = r0 + r1
            r1 = r12[r0]
            int r1 = r1 + (-1)
            r12[r0] = r1
            r14[r1] = r8
            r20 = 256(0x100, float:3.59E-43)
            r0 = r20
        La3:
            int r0 = r0 + (-1)
            if (r0 < 0) goto Lad
            r3 = 0
            r11[r0] = r3
            r9[r0] = r0
            goto La3
        Lad:
            r3 = 0
            r0 = 364(0x16c, float:5.1E-43)
        Lb0:
            r1 = 1
            if (r0 == r1) goto Lfa
            int r0 = r0 / 3
            r1 = r0
        Lb6:
            if (r1 > r4) goto Lb0
            r2 = r9[r1]
            int r18 = r2 + 1
            int r18 = r18 << 8
            r18 = r12[r18]
            int r21 = r2 << 8
            r21 = r12[r21]
            int r3 = r18 - r21
            int r4 = r0 + (-1)
            int r21 = r1 - r0
            r21 = r9[r21]
            r23 = r1
        Lce:
            int r24 = r21 + 1
            int r24 = r24 << 8
            r24 = r12[r24]
            int r25 = r21 << 8
            r25 = r12[r25]
            r26 = r5
            int r5 = r24 - r25
            if (r5 <= r3) goto Lf0
            r9[r23] = r21
            int r5 = r23 - r0
            if (r5 > r4) goto Le7
            r23 = r5
            goto Lf0
        Le7:
            int r21 = r5 - r0
            r21 = r9[r21]
            r23 = r5
            r5 = r26
            goto Lce
        Lf0:
            r9[r23] = r2
            int r1 = r1 + 1
            r5 = r26
            r3 = 0
            r4 = 255(0xff, float:3.57E-43)
            goto Lb6
        Lfa:
            r26 = r5
            r5 = 0
        Lfd:
            if (r5 > r4) goto L21f
            r18 = r9[r5]
            r3 = 0
        L102:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r0 = -2097153(0xffffffffffdfffff, float:NaN)
            if (r3 > r4) goto L174
            int r1 = r18 << 8
            int r21 = r1 + r3
            r23 = r12[r21]
            r1 = r23 & r2
            if (r1 == r2) goto L15d
            r1 = r23 & r0
            int r24 = r21 + 1
            r24 = r12[r24]
            r0 = r24 & r0
            r19 = 1
            int r0 = r0 + (-1)
            if (r0 <= r1) goto L14b
            r24 = 2
            r25 = r0
            r0 = r28
            r27 = r19
            r19 = r1
            r1 = r29
            r16 = r2
            r2 = r19
            r22 = r3
            r19 = 0
            r3 = r25
            r7 = r4
            r4 = r24
            r25 = r9
            r7 = r26
            r9 = r5
            r5 = r30
            r0.mainQSort3(r1, r2, r3, r4, r5)
            if (r17 == 0) goto L158
            int r0 = r6.workDone
            if (r0 <= r7) goto L158
            return
        L14b:
            r16 = r2
            r22 = r3
            r25 = r9
            r27 = r19
            r7 = r26
            r19 = 0
            r9 = r5
        L158:
            r0 = r23 | r16
            r12[r21] = r0
            goto L168
        L15d:
            r22 = r3
            r25 = r9
            r7 = r26
            r19 = 0
            r27 = 1
            r9 = r5
        L168:
            int r3 = r22 + 1
            r26 = r7
            r5 = r9
            r9 = r25
            r4 = 255(0xff, float:3.57E-43)
            r7 = r29
            goto L102
        L174:
            r16 = r2
            r25 = r9
            r7 = r26
            r19 = 0
            r27 = 1
            r9 = r5
            r1 = r4
            r3 = r19
        L182:
            if (r3 > r1) goto L192
            int r1 = r3 << 8
            int r1 = r1 + r18
            r1 = r12[r1]
            r1 = r1 & r0
            r10[r3] = r1
            int r3 = r3 + 1
            r1 = 255(0xff, float:3.57E-43)
            goto L182
        L192:
            int r1 = r18 << 8
            r2 = r12[r1]
            r2 = r2 & r0
            int r3 = r18 + 1
            int r3 = r3 << 8
            r4 = r12[r3]
            r4 = r4 & r0
        L19e:
            if (r2 >= r4) goto L1c5
            r5 = r14[r2]
            r0 = r13[r5]
            r22 = r4
            r4 = 255(0xff, float:3.57E-43)
            r0 = r0 & r4
            boolean r4 = r11[r0]
            if (r4 != 0) goto L1bd
            r4 = r10[r0]
            if (r5 != 0) goto L1b3
            r5 = r8
            goto L1b5
        L1b3:
            int r5 = r5 + (-1)
        L1b5:
            r14[r4] = r5
            r4 = r10[r0]
            int r4 = r4 + 1
            r10[r0] = r4
        L1bd:
            int r2 = r2 + 1
            r4 = r22
            r0 = -2097153(0xffffffffffdfffff, float:NaN)
            goto L19e
        L1c5:
            r0 = r20
        L1c7:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1d6
            int r2 = r0 << 8
            int r2 = r2 + r18
            r4 = r12[r2]
            r4 = r4 | r16
            r12[r2] = r4
            goto L1c7
        L1d6:
            r11[r18] = r27
            r0 = 255(0xff, float:3.57E-43)
            if (r9 >= r0) goto L211
            r1 = r12[r1]
            r2 = -2097153(0xffffffffffdfffff, float:NaN)
            r1 = r1 & r2
            r3 = r12[r3]
            r2 = r2 & r3
            int r2 = r2 - r1
            r3 = r19
        L1e8:
            int r4 = r2 >> r3
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r4 <= r5) goto L1f2
            int r3 = r3 + 1
            goto L1e8
        L1f2:
            r4 = r19
        L1f4:
            if (r4 >= r2) goto L211
            int r5 = r1 + r4
            r5 = r14[r5]
            int r0 = r4 >> r3
            char r0 = (char) r0
            r15[r5] = r0
            r16 = r1
            r1 = 20
            if (r5 >= r1) goto L20a
            int r5 = r5 + r8
            int r5 = r5 + 1
            r15[r5] = r0
        L20a:
            int r4 = r4 + 1
            r1 = r16
            r0 = 255(0xff, float:3.57E-43)
            goto L1f4
        L211:
            r1 = 20
            int r5 = r9 + 1
            r26 = r7
            r9 = r25
            r4 = 255(0xff, float:3.57E-43)
            r7 = r29
            goto Lfd
        L21f:
            return
    }
}
