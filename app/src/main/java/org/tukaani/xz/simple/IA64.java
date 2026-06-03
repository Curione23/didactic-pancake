package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class IA64 implements org.tukaani.xz.simple.SimpleFilter {
    private static final int[] BRANCH_TABLE = null;
    private final boolean isEncoder;
    private int pos;

    static {
            r0 = 32
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0} // fill-array
            org.tukaani.xz.simple.IA64.BRANCH_TABLE = r0
            return
    }

    public IA64(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.isEncoder = r1
            r0.pos = r2
            return
    }

    @Override // org.tukaani.xz.simple.SimpleFilter
    public int code(byte[] r22, int r23, int r24) {
            r21 = this;
            r0 = r21
            int r1 = r23 + r24
            r2 = 16
            int r1 = r1 - r2
            r3 = r23
        L9:
            if (r3 > r1) goto Ld3
            r4 = r22[r3]
            r4 = r4 & 31
            int[] r5 = org.tukaani.xz.simple.IA64.BRANCH_TABLE
            r4 = r5[r4]
            r6 = 5
            r7 = 0
        L15:
            r8 = 3
            if (r7 >= r8) goto Lcc
            int r8 = r4 >>> r7
            r9 = 1
            r8 = r8 & r9
            if (r8 != 0) goto L25
            r11 = r2
            r16 = r3
            r19 = r6
            goto Lc3
        L25:
            int r8 = r6 >>> 3
            r10 = r6 & 7
            r11 = 0
            r14 = r11
            r13 = 0
        L2d:
            r5 = 6
            if (r13 >= r5) goto L47
            int r5 = r3 + r8
            int r5 = r5 + r13
            r5 = r22[r5]
            r16 = r3
            long r2 = (long) r5
            r17 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r17
            int r5 = r13 * 8
            long r2 = r2 << r5
            long r14 = r14 | r2
            int r13 = r13 + 1
            r3 = r16
            r2 = 16
            goto L2d
        L47:
            r16 = r3
            long r2 = r14 >>> r10
            r13 = 37
            long r17 = r2 >>> r13
            r19 = 15
            long r17 = r17 & r19
            r19 = 5
            int r13 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r13 != 0) goto Lbf
            r13 = 9
            long r17 = r2 >>> r13
            r19 = 7
            long r17 = r17 & r19
            int r11 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r11 == 0) goto L66
            goto Lbf
        L66:
            r11 = 13
            long r12 = r2 >>> r11
            r17 = 1048575(0xfffff, double:5.18065E-318)
            long r12 = r12 & r17
            int r12 = (int) r12
            r13 = 36
            r19 = r6
            long r5 = r2 >>> r13
            int r5 = (int) r5
            r5 = r5 & r9
            int r5 = r5 << 20
            r5 = r5 | r12
            int r5 = r5 << 4
            boolean r6 = r0.isEncoder
            if (r6 == 0) goto L89
            int r6 = r0.pos
            int r6 = r6 + r16
            int r6 = r6 - r23
            int r5 = r5 + r6
            goto L90
        L89:
            int r6 = r0.pos
            int r6 = r6 + r16
            int r6 = r6 - r23
            int r5 = r5 - r6
        L90:
            int r5 = r5 >>> 4
            r12 = -77309403137(0xffffffee00001fff, double:NaN)
            long r2 = r2 & r12
            long r5 = (long) r5
            long r12 = r5 & r17
            long r11 = r12 << r11
            long r2 = r2 | r11
            r11 = 1048576(0x100000, double:5.180654E-318)
            long r5 = r5 & r11
            r11 = 16
            long r5 = r5 << r11
            long r2 = r2 | r5
            int r5 = r9 << r10
            int r5 = r5 - r9
            long r5 = (long) r5
            long r5 = r5 & r14
            long r2 = r2 << r10
            long r2 = r2 | r5
            r5 = 0
            r6 = 6
        Laf:
            if (r5 >= r6) goto Lc3
            int r9 = r16 + r8
            int r9 = r9 + r5
            int r10 = r5 * 8
            long r12 = r2 >>> r10
            int r10 = (int) r12
            byte r10 = (byte) r10
            r22[r9] = r10
            int r5 = r5 + 1
            goto Laf
        Lbf:
            r19 = r6
            r11 = 16
        Lc3:
            int r7 = r7 + 1
            int r6 = r19 + 41
            r2 = r11
            r3 = r16
            goto L15
        Lcc:
            r11 = r2
            r16 = r3
            int r3 = r16 + 16
            goto L9
        Ld3:
            r16 = r3
            int r3 = r16 - r23
            int r1 = r0.pos
            int r1 = r1 + r3
            r0.pos = r1
            return r3
    }
}
