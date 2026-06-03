package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class RISCVDecoder implements org.tukaani.xz.simple.SimpleFilter {
    private int pos;

    public RISCVDecoder(int r1) {
            r0 = this;
            r0.<init>()
            r0.pos = r1
            return
    }

    @Override // org.tukaani.xz.simple.SimpleFilter
    public int code(byte[] r9, int r10, int r11) {
            r8 = this;
            int r11 = r11 + r10
            int r11 = r11 + (-8)
            r0 = r10
        L4:
            if (r0 > r11) goto Lce
            r1 = r9[r0]
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = 239(0xef, float:3.35E-43)
            if (r2 != r3) goto L5c
            int r1 = r0 + 1
            r2 = r9[r1]
            r3 = r2 & 13
            if (r3 == 0) goto L18
            goto Lca
        L18:
            int r3 = r0 + 2
            r4 = r9[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r0 + 3
            r6 = r9[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r8.pos
            int r7 = r7 + r0
            int r7 = r7 - r10
            r0 = r2 & 240(0xf0, float:3.36E-43)
            int r0 = r0 << 13
            int r4 = r4 << 9
            r0 = r0 | r4
            int r4 = r6 << 1
            r0 = r0 | r4
            int r0 = r0 - r7
            r2 = r2 & 15
            int r4 = r0 >>> 8
            r4 = r4 & 240(0xf0, float:3.36E-43)
            r2 = r2 | r4
            byte r2 = (byte) r2
            r9[r1] = r2
            int r1 = r0 >>> 16
            r1 = r1 & 15
            int r2 = r0 >>> 7
            r2 = r2 & 16
            r1 = r1 | r2
            int r2 = r0 << 4
            r2 = r2 & 224(0xe0, float:3.14E-43)
            r1 = r1 | r2
            byte r1 = (byte) r1
            r9[r3] = r1
            int r1 = r0 >>> 4
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r0 >>> 13
            r0 = r0 & 128(0x80, float:1.8E-43)
            r0 = r0 | r1
            byte r0 = (byte) r0
            r9[r5] = r0
            r0 = r3
            goto Lca
        L5c:
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r3 = 23
            if (r1 != r3) goto Lca
            int r1 = r0 + 1
            r1 = r9[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            int r2 = r0 + 2
            r4 = r9[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r1 = r1 | r4
            int r4 = r0 + 3
            r4 = r9[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r1 = r1 | r4
            r4 = r1 & 3712(0xe80, float:5.202E-42)
            if (r4 == 0) goto L9c
            int r2 = r0 + 4
            int r3 = org.tukaani.xz.common.ByteArrayView.getIntLE(r9, r2)
            int r4 = r1 << 8
            r4 = r4 ^ r3
            r5 = 1015811(0xf8003, float:1.423454E-39)
            r4 = r4 & r5
            r5 = 3
            if (r4 == r5) goto L92
            goto La6
        L92:
            r1 = r1 & (-4096(0xfffffffffffff000, float:NaN))
            int r2 = r3 >>> 20
            int r1 = r1 + r2
            int r2 = r3 << 12
            r2 = r2 | 279(0x117, float:3.91E-43)
            goto Lc0
        L9c:
            int r4 = r1 >>> 27
            int r5 = r1 + (-12544)
            r5 = r5 & 16256(0x3f80, float:2.278E-41)
            r6 = r4 & 29
            if (r5 < r6) goto La8
        La6:
            r0 = r2
            goto Lca
        La8:
            int r2 = r0 + 4
            int r2 = org.tukaani.xz.common.ByteArrayView.getIntBE(r9, r2)
            int r5 = r8.pos
            int r5 = r5 + r0
            int r5 = r5 - r10
            int r2 = r2 - r5
            int r1 = r1 >>> 12
            int r5 = r2 << 20
            r1 = r1 | r5
            int r4 = r4 << 7
            r3 = r3 | r4
            int r2 = r2 + 2048
            r2 = r2 & (-4096(0xfffffffffffff000, float:NaN))
            r2 = r2 | r3
        Lc0:
            org.tukaani.xz.common.ByteArrayView.setIntLE(r9, r0, r2)
            int r2 = r0 + 4
            org.tukaani.xz.common.ByteArrayView.setIntLE(r9, r2, r1)
            int r0 = r0 + 6
        Lca:
            int r0 = r0 + 2
            goto L4
        Lce:
            int r0 = r0 - r10
            int r9 = r8.pos
            int r9 = r9 + r0
            r8.pos = r9
            return r0
    }
}
