package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class X86 implements org.tukaani.xz.simple.SimpleFilter {
    private static final boolean[] MASK_TO_ALLOWED_STATUS = null;
    private static final int[] MASK_TO_BIT_NUMBER = null;
    private final boolean isEncoder;
    private int pos;
    private int prevMask;

    static {
            r0 = 8
            boolean[] r1 = new boolean[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [1, 1, 1, 0, 1, 0, 0, 0} // fill-array
            org.tukaani.xz.simple.X86.MASK_TO_ALLOWED_STATUS = r1
            int[] r0 = new int[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [0, 1, 2, 2, 3, 3, 3, 3} // fill-array
            org.tukaani.xz.simple.X86.MASK_TO_BIT_NUMBER = r0
            return
    }

    public X86(boolean r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.prevMask = r0
            r1.isEncoder = r2
            int r3 = r3 + 5
            r1.pos = r3
            return
    }

    private static boolean test86MSByte(byte r1) {
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 == 0) goto La
            if (r1 != r0) goto L8
            goto La
        L8:
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    @Override // org.tukaani.xz.simple.SimpleFilter
    public int code(byte[] r9, int r10, int r11) {
            r8 = this;
            int r0 = r10 + (-1)
            int r11 = r11 + r10
            int r11 = r11 + (-5)
            r1 = r10
        L6:
            r2 = 0
            r3 = 1
            if (r1 > r11) goto L96
            r4 = r9[r1]
            r4 = r4 & 254(0xfe, float:3.56E-43)
            r5 = 232(0xe8, float:3.25E-43)
            if (r4 == r5) goto L14
            goto L93
        L14:
            int r0 = r1 - r0
            r4 = r0 & (-4)
            if (r4 == 0) goto L1d
            r8.prevMask = r2
            goto L45
        L1d:
            int r2 = r8.prevMask
            int r0 = r0 + (-1)
            int r0 = r2 << r0
            r0 = r0 & 7
            r8.prevMask = r0
            if (r0 == 0) goto L45
            boolean[] r2 = org.tukaani.xz.simple.X86.MASK_TO_ALLOWED_STATUS
            boolean r2 = r2[r0]
            if (r2 == 0) goto L3e
            int r2 = r1 + 4
            int[] r4 = org.tukaani.xz.simple.X86.MASK_TO_BIT_NUMBER
            r0 = r4[r0]
            int r2 = r2 - r0
            r0 = r9[r2]
            boolean r0 = test86MSByte(r0)
            if (r0 == 0) goto L45
        L3e:
            int r0 = r8.prevMask
            int r0 = r0 << r3
            r0 = r0 | r3
            r8.prevMask = r0
            goto L92
        L45:
            int r0 = r1 + 4
            r2 = r9[r0]
            boolean r2 = test86MSByte(r2)
            if (r2 == 0) goto L8c
            int r2 = r1 + 1
            int r4 = org.tukaani.xz.common.ByteArrayView.getIntLE(r9, r2)
        L55:
            boolean r5 = r8.isEncoder
            if (r5 == 0) goto L5f
            int r5 = r8.pos
            int r5 = r5 + r1
            int r5 = r5 - r10
            int r4 = r4 + r5
            goto L64
        L5f:
            int r5 = r8.pos
            int r5 = r5 + r1
            int r5 = r5 - r10
            int r4 = r4 - r5
        L64:
            int r5 = r8.prevMask
            if (r5 != 0) goto L69
            goto L7a
        L69:
            int[] r6 = org.tukaani.xz.simple.X86.MASK_TO_BIT_NUMBER
            r5 = r6[r5]
            int r5 = r5 * 8
            int r6 = 24 - r5
            int r6 = r4 >>> r6
            byte r6 = (byte) r6
            boolean r6 = test86MSByte(r6)
            if (r6 != 0) goto L85
        L7a:
            int r4 = r4 << 7
            int r4 = r4 >> 7
            org.tukaani.xz.common.ByteArrayView.setIntLE(r9, r2, r4)
            r7 = r1
            r1 = r0
            r0 = r7
            goto L93
        L85:
            int r5 = 32 - r5
            int r5 = r3 << r5
            int r5 = r5 - r3
            r4 = r4 ^ r5
            goto L55
        L8c:
            int r0 = r8.prevMask
            int r0 = r0 << r3
            r0 = r0 | r3
            r8.prevMask = r0
        L92:
            r0 = r1
        L93:
            int r1 = r1 + r3
            goto L6
        L96:
            int r9 = r1 - r0
            r11 = r9 & (-4)
            if (r11 == 0) goto L9d
            goto La2
        L9d:
            int r11 = r8.prevMask
            int r9 = r9 - r3
            int r2 = r11 << r9
        La2:
            r8.prevMask = r2
            int r1 = r1 - r10
            int r9 = r8.pos
            int r9 = r9 + r1
            r8.pos = r9
            return r1
    }
}
