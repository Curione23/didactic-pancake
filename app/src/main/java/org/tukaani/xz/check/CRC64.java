package org.tukaani.xz.check;

/* JADX INFO: loaded from: classes2.dex */
public class CRC64 extends org.tukaani.xz.check.Check {
    private static final long[][] TABLE = null;
    private long crc;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 1
            r2 = 256(0x100, float:3.59E-43)
            r0[r1] = r2
            r3 = 0
            r4 = 4
            r0[r3] = r4
            java.lang.Class r5 = java.lang.Long.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r5, r0)
            long[][] r0 = (long[][]) r0
            org.tukaani.xz.check.CRC64.TABLE = r0
            r0 = r3
        L17:
            if (r0 >= r4) goto L4e
            r5 = r3
        L1a:
            if (r5 >= r2) goto L4b
            if (r0 != 0) goto L20
            long r6 = (long) r5
            goto L29
        L20:
            long[][] r6 = org.tukaani.xz.check.CRC64.TABLE
            int r7 = r0 + (-1)
            r6 = r6[r7]
            r7 = r6[r5]
            r6 = r7
        L29:
            r8 = r3
        L2a:
            r9 = 8
            if (r8 >= r9) goto L42
            r9 = 1
            long r11 = r6 & r9
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 != 0) goto L3e
            long r6 = r6 >>> r1
            r9 = -3932672073523589310(0xc96c5795d7870f42, double:-5.0564049839430436E45)
            long r6 = r6 ^ r9
            goto L3f
        L3e:
            long r6 = r6 >>> r1
        L3f:
            int r8 = r8 + 1
            goto L2a
        L42:
            long[][] r8 = org.tukaani.xz.check.CRC64.TABLE
            r8 = r8[r0]
            r8[r5] = r6
            int r5 = r5 + 1
            goto L1a
        L4b:
            int r0 = r0 + 1
            goto L17
        L4e:
            return
    }

    public CRC64() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.crc = r0
            r0 = 8
            r2.size = r0
            java.lang.String r0 = "CRC64"
            r2.name = r0
            return
    }

    @Override // org.tukaani.xz.check.Check
    public byte[] finish() {
            r4 = this;
            r0 = 8
            byte[] r0 = new byte[r0]
            long r1 = r4.crc
            long r1 = ~r1
            r3 = 0
            org.tukaani.xz.common.ByteArrayView.setLongLE(r0, r3, r1)
            r1 = -1
            r4.crc = r1
            return r0
    }

    @Override // org.tukaani.xz.check.Check
    public void update(byte[] r12, int r13, int r14) {
            r11 = this;
            int r14 = r14 + r13
            int r0 = r14 + (-3)
        L3:
            r1 = 0
            if (r13 >= r0) goto L54
            long r2 = r11.crc
            int r4 = (int) r2
            long[][] r5 = org.tukaani.xz.check.CRC64.TABLE
            r6 = 3
            r6 = r5[r6]
            r7 = r4 & 255(0xff, float:3.57E-43)
            r8 = r12[r13]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 ^ r8
            r7 = r6[r7]
            r6 = 2
            r6 = r5[r6]
            int r9 = r4 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r13 + 1
            r10 = r12[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 ^ r10
            r9 = r6[r9]
            long r6 = r7 ^ r9
            r8 = 32
            long r2 = r2 >>> r8
            long r2 = r2 ^ r6
            r6 = 1
            r6 = r5[r6]
            int r7 = r4 >>> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r13 + 2
            r8 = r12[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 ^ r8
            r7 = r6[r7]
            long r2 = r2 ^ r7
            r1 = r5[r1]
            int r4 = r4 >>> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r13 + 3
            r5 = r12[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r5
            r4 = r1[r4]
            long r1 = r2 ^ r4
            r11.crc = r1
            int r13 = r13 + 4
            goto L3
        L54:
            if (r13 >= r14) goto L70
            long[][] r0 = org.tukaani.xz.check.CRC64.TABLE
            r0 = r0[r1]
            int r2 = r13 + 1
            r13 = r12[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            long r3 = r11.crc
            int r5 = (int) r3
            r5 = r5 & 255(0xff, float:3.57E-43)
            r13 = r13 ^ r5
            r5 = r0[r13]
            r13 = 8
            long r3 = r3 >>> r13
            long r3 = r3 ^ r5
            r11.crc = r3
            r13 = r2
            goto L54
        L70:
            return
    }
}
