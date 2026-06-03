package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class ARMThumb implements org.tukaani.xz.simple.SimpleFilter {
    private final boolean isEncoder;
    private int pos;

    public ARMThumb(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.isEncoder = r1
            int r2 = r2 + 4
            r0.pos = r2
            return
    }

    @Override // org.tukaani.xz.simple.SimpleFilter
    public int code(byte[] r10, int r11, int r12) {
            r9 = this;
            int r12 = r12 + r11
            int r12 = r12 + (-4)
            r0 = r11
        L4:
            if (r0 > r12) goto L60
            int r1 = r0 + 1
            r2 = r10[r1]
            r3 = r2 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 != r4) goto L5d
            int r3 = r0 + 3
            r5 = r10[r3]
            r6 = r5 & 248(0xf8, float:3.48E-43)
            r7 = 248(0xf8, float:3.48E-43)
            if (r6 != r7) goto L5d
            r2 = r2 & 7
            int r2 = r2 << 19
            r6 = r10[r0]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 11
            r2 = r2 | r6
            r5 = r5 & 7
            int r5 = r5 << 8
            r2 = r2 | r5
            int r5 = r0 + 2
            r6 = r10[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r2 = r2 | r6
            int r2 = r2 << 1
            boolean r6 = r9.isEncoder
            if (r6 == 0) goto L3d
            int r6 = r9.pos
            int r6 = r6 + r0
            int r6 = r6 - r11
            int r2 = r2 + r6
            goto L42
        L3d:
            int r6 = r9.pos
            int r6 = r6 + r0
            int r6 = r6 - r11
            int r2 = r2 - r6
        L42:
            int r6 = r2 >>> 1
            int r8 = r2 >>> 20
            r8 = r8 & 7
            r4 = r4 | r8
            byte r4 = (byte) r4
            r10[r1] = r4
            int r1 = r2 >>> 12
            byte r1 = (byte) r1
            r10[r0] = r1
            int r0 = r2 >>> 9
            r0 = r0 & 7
            r0 = r0 | r7
            byte r0 = (byte) r0
            r10[r3] = r0
            byte r0 = (byte) r6
            r10[r5] = r0
            r0 = r5
        L5d:
            int r0 = r0 + 2
            goto L4
        L60:
            int r0 = r0 - r11
            int r10 = r9.pos
            int r10 = r10 + r0
            r9.pos = r10
            return r0
    }
}
