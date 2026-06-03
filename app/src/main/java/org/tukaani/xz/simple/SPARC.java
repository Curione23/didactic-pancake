package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class SPARC implements org.tukaani.xz.simple.SimpleFilter {
    private final boolean isEncoder;
    private int pos;

    public SPARC(boolean r1, int r2) {
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
            if (r0 > r7) goto L41
            r1 = r5[r0]
            r2 = 64
            r3 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L15
            int r2 = r0 + 1
            r2 = r5[r2]
            r2 = r2 & r3
            if (r2 == 0) goto L20
        L15:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L3e
            int r1 = r0 + 1
            r1 = r5[r1]
            r1 = r1 & r3
            if (r1 != r3) goto L3e
        L20:
            int r1 = org.tukaani.xz.common.ByteArrayView.getIntBE(r5, r0)
            int r2 = r4.pos
            int r2 = r2 + r0
            int r2 = r2 - r6
            int r2 = r2 >>> 2
            boolean r3 = r4.isEncoder
            if (r3 != 0) goto L2f
            int r2 = -r2
        L2f:
            int r1 = r1 + r2
            int r1 = r1 << 9
            int r1 = r1 >> 9
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r1 = r1 & r2
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r2
            org.tukaani.xz.common.ByteArrayView.setIntBE(r5, r0, r1)
        L3e:
            int r0 = r0 + 4
            goto L4
        L41:
            int r0 = r0 - r6
            int r5 = r4.pos
            int r5 = r5 + r0
            r4.pos = r5
            return r0
    }
}
