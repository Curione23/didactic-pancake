package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class ARM64 implements org.tukaani.xz.simple.SimpleFilter {
    private final boolean isEncoder;
    private int pos;

    public ARM64(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.isEncoder = r1
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
            if (r0 > r9) goto L72
            int r1 = r0 + 3
            r1 = r7[r1]
            r2 = r1 & 252(0xfc, float:3.53E-43)
            r3 = 148(0x94, float:2.07E-43)
            if (r2 != r3) goto L2b
            int r1 = org.tukaani.xz.common.ByteArrayView.getIntLE(r7, r0)
            int r2 = r6.pos
            int r2 = r2 + r0
            int r2 = r2 - r8
            int r2 = r2 >>> 2
            boolean r3 = r6.isEncoder
            if (r3 != 0) goto L1f
            int r2 = -r2
        L1f:
            int r1 = r1 + r2
            r2 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = r1 & r2
            r2 = -1811939328(0xffffffff94000000, float:-6.4623485E-27)
            r1 = r1 | r2
            org.tukaani.xz.common.ByteArrayView.setIntLE(r7, r0, r1)
            goto L6f
        L2b:
            r1 = r1 & 159(0x9f, float:2.23E-43)
            r2 = 144(0x90, float:2.02E-43)
            if (r1 != r2) goto L6f
            int r1 = org.tukaani.xz.common.ByteArrayView.getIntLE(r7, r0)
            int r2 = r1 >>> 29
            r2 = r2 & 3
            int r3 = r1 >>> 3
            r4 = 2097148(0x1ffffc, float:2.93873E-39)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 131072(0x20000, float:1.83671E-40)
            int r4 = r2 + r3
            r5 = 1835008(0x1c0000, float:2.571394E-39)
            r4 = r4 & r5
            if (r4 == 0) goto L4a
            goto L6f
        L4a:
            int r4 = r6.pos
            int r4 = r4 + r0
            int r4 = r4 - r8
            int r4 = r4 >>> 12
            boolean r5 = r6.isEncoder
            if (r5 != 0) goto L55
            int r4 = -r4
        L55:
            int r2 = r2 + r4
            r4 = -1879048161(0xffffffff9000001f, float:-2.5243642E-29)
            r1 = r1 & r4
            r4 = r2 & 3
            int r4 = r4 << 29
            r1 = r1 | r4
            r4 = 262140(0x3fffc, float:3.67336E-40)
            r4 = r4 & r2
            int r4 = r4 << 3
            r1 = r1 | r4
            r2 = r2 & r3
            int r2 = -r2
            r3 = 14680064(0xe00000, float:2.0571151E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            org.tukaani.xz.common.ByteArrayView.setIntLE(r7, r0, r1)
        L6f:
            int r0 = r0 + 4
            goto L4
        L72:
            int r0 = r0 - r8
            int r7 = r6.pos
            int r7 = r7 + r0
            r6.pos = r7
            return r0
    }
}
