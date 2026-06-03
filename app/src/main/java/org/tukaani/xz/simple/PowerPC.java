package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class PowerPC implements org.tukaani.xz.simple.SimpleFilter {
    private final boolean isEncoder;
    private int pos;

    public PowerPC(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.isEncoder = r1
            r0.pos = r2
            return
    }

    @Override // org.tukaani.xz.simple.SimpleFilter
    public int code(byte[] r5, int r6, int r7) {
            r4 = this;
            int r7 = r7 + r6
            int r7 = r7 + (-4)
            r0 = r6
        L4:
            if (r0 > r7) goto L33
            r1 = r5[r0]
            r1 = r1 & 252(0xfc, float:3.53E-43)
            r2 = 72
            if (r1 != r2) goto L30
            int r1 = r0 + 3
            r1 = r5[r1]
            r1 = r1 & 3
            r2 = 1
            if (r1 != r2) goto L30
            int r1 = org.tukaani.xz.common.ByteArrayView.getIntBE(r5, r0)
            int r2 = r4.pos
            int r2 = r2 + r0
            int r2 = r2 - r6
            boolean r3 = r4.isEncoder
            if (r3 != 0) goto L24
            int r2 = -r2
        L24:
            int r1 = r1 + r2
            r2 = 67108860(0x3fffffc, float:1.5046324E-36)
            r1 = r1 & r2
            r2 = 1207959553(0x48000001, float:131072.02)
            r1 = r1 | r2
            org.tukaani.xz.common.ByteArrayView.setIntBE(r5, r0, r1)
        L30:
            int r0 = r0 + 4
            goto L4
        L33:
            int r0 = r0 - r6
            int r5 = r4.pos
            int r5 = r5 + r0
            r4.pos = r5
            return r0
    }
}
