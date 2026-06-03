package org.tukaani.xz.simple;

/* JADX INFO: loaded from: classes2.dex */
public final class RISCVEncoder implements org.tukaani.xz.simple.SimpleFilter {
    private int pos;

    public RISCVEncoder(int r1) {
            r0 = this;
            r0.<init>()
            r0.pos = r1
            return
    }

    @Override // org.tukaani.xz.simple.SimpleFilter
    public int code(byte[] r10, int r11, int r12) {
            r9 = this;
            int r12 = r12 + r11
            int r12 = r12 + (-8)
            r0 = r11
        L4:
            if (r0 > r12) goto Lcc
            r1 = r10[r0]
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = 239(0xef, float:3.35E-43)
            if (r2 != r3) goto L58
            int r1 = r0 + 1
            r2 = r10[r1]
            r3 = r2 & 13
            if (r3 == 0) goto L18
            goto Lc8
        L18:
            int r3 = r0 + 2
            r4 = r10[r3]
            int r5 = r0 + 3
            r6 = r10[r5]
            int r7 = r9.pos
            int r7 = r7 + r0
            int r7 = r7 - r11
            r0 = r2 & 240(0xf0, float:3.36E-43)
            int r0 = r0 << 8
            r8 = r4 & 15
            int r8 = r8 << 16
            r0 = r0 | r8
            r8 = r4 & 16
            int r8 = r8 << 7
            r0 = r0 | r8
            r4 = r4 & 224(0xe0, float:3.14E-43)
            int r4 = r4 >>> 4
            r0 = r0 | r4
            r4 = r6 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << 4
            r0 = r0 | r4
            r4 = r6 & 128(0x80, float:1.8E-43)
            int r4 = r4 << 13
            r0 = r0 | r4
            int r0 = r0 + r7
            r2 = r2 & 15
            int r4 = r0 >>> 13
            r4 = r4 & 240(0xf0, float:3.36E-43)
            r2 = r2 | r4
            byte r2 = (byte) r2
            r10[r1] = r2
            int r1 = r0 >>> 9
            byte r1 = (byte) r1
            r10[r3] = r1
            int r0 = r0 >>> 1
            byte r0 = (byte) r0
            r10[r5] = r0
            r0 = r3
            goto Lc8
        L58:
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r3 = 23
            if (r1 != r3) goto Lc8
            int r1 = r0 + 1
            r1 = r10[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            int r2 = r0 + 2
            r4 = r10[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r1 = r1 | r4
            int r4 = r0 + 3
            r4 = r10[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r1 = r1 | r4
            r4 = r1 & 3712(0xe80, float:5.202E-42)
            if (r4 == 0) goto La3
            int r2 = r0 + 4
            int r3 = org.tukaani.xz.common.ByteArrayView.getIntLE(r10, r2)
            int r4 = r1 << 8
            r4 = r4 ^ r3
            r5 = 1015811(0xf8003, float:1.423454E-39)
            r4 = r4 & r5
            r5 = 3
            if (r4 == r5) goto L8e
            goto Lad
        L8e:
            r1 = r1 & (-4096(0xfffffffffffff000, float:NaN))
            int r4 = r3 >> 20
            int r1 = r1 + r4
            int r4 = r9.pos
            int r4 = r4 + r0
            int r4 = r4 - r11
            int r1 = r1 + r4
            int r3 = r3 << 12
            r3 = r3 | 279(0x117, float:3.91E-43)
            org.tukaani.xz.common.ByteArrayView.setIntLE(r10, r0, r3)
            org.tukaani.xz.common.ByteArrayView.setIntBE(r10, r2, r1)
            goto Lc6
        La3:
            int r4 = r1 >>> 27
            int r5 = r1 + (-12544)
            r5 = r5 & 16256(0x3f80, float:2.278E-41)
            r6 = r4 & 29
            if (r5 < r6) goto Laf
        Lad:
            r0 = r2
            goto Lc8
        Laf:
            int r2 = r0 + 4
            int r5 = org.tukaani.xz.common.ByteArrayView.getIntLE(r10, r2)
            int r1 = r1 >>> 12
            int r6 = r5 << 20
            r1 = r1 | r6
            int r4 = r4 << 7
            r3 = r3 | r4
            r4 = r5 & (-4096(0xfffffffffffff000, float:NaN))
            r3 = r3 | r4
            org.tukaani.xz.common.ByteArrayView.setIntLE(r10, r0, r3)
            org.tukaani.xz.common.ByteArrayView.setIntLE(r10, r2, r1)
        Lc6:
            int r0 = r0 + 6
        Lc8:
            int r0 = r0 + 2
            goto L4
        Lcc:
            int r0 = r0 - r11
            int r10 = r9.pos
            int r10 = r10 + r0
            r9.pos = r10
            return r0
    }
}
