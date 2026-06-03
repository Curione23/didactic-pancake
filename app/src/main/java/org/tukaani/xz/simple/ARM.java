package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class ARM implements org.tukaani.xz.simple.SimpleFilter {
    private final boolean isEncoder;
    private int pos;

    public ARM(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.isEncoder = r1
            int r2 = r2 + 8
            r0.pos = r2
            return
    }

    @Override // org.tukaani.xz.simple.SimpleFilter
    public int code(byte[] r7, int r8, int r9) {
            r6 = this;
            int r9 = r9 + r8
            int r9 = r9 + (-4)
            r0 = r8
        L4:
            if (r0 > r9) goto L49
            int r1 = r0 + 3
            r1 = r7[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 235(0xeb, float:3.3E-43)
            if (r1 != r2) goto L46
            int r1 = r0 + 2
            r2 = r7[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            int r3 = r0 + 1
            r4 = r7[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r2 = r2 | r4
            r4 = r7[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2 = r2 | r4
            int r2 = r2 << 2
            boolean r4 = r6.isEncoder
            if (r4 == 0) goto L32
            int r4 = r6.pos
            int r4 = r4 + r0
            int r4 = r4 - r8
            int r2 = r2 + r4
            goto L37
        L32:
            int r4 = r6.pos
            int r4 = r4 + r0
            int r4 = r4 - r8
            int r2 = r2 - r4
        L37:
            int r4 = r2 >>> 2
            int r5 = r2 >>> 18
            byte r5 = (byte) r5
            r7[r1] = r5
            int r1 = r2 >>> 10
            byte r1 = (byte) r1
            r7[r3] = r1
            byte r1 = (byte) r4
            r7[r0] = r1
        L46:
            int r0 = r0 + 4
            goto L4
        L49:
            int r0 = r0 - r8
            int r7 = r6.pos
            int r7 = r7 + r0
            r6.pos = r7
            return r0
    }
}
