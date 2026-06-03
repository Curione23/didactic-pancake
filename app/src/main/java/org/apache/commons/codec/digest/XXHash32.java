package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public class XXHash32 implements java.util.zip.Checksum {
    private static final int BUF_SIZE = 16;
    private static final int PRIME1 = -1640531535;
    private static final int PRIME2 = -2048144777;
    private static final int PRIME3 = -1028477379;
    private static final int PRIME4 = 668265263;
    private static final int PRIME5 = 374761393;
    private static final int ROTATE_BITS = 13;
    private final byte[] buffer;
    private final byte[] oneByte;
    private int pos;
    private final int seed;
    private final int[] state;
    private boolean stateUpdated;
    private int totalLen;

    public XXHash32() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public XXHash32(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.oneByte = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1.state = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r1.buffer = r0
            r1.seed = r2
            r1.initializeState()
            return
    }

    private static int getInt(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    private void initializeState() {
            r4 = this;
            int[] r0 = r4.state
            int r1 = r4.seed
            r2 = 606290984(0x24234428, float:3.540272E-17)
            int r2 = r2 + r1
            r3 = 0
            r0[r3] = r2
            r2 = -2048144777(0xffffffff85ebca77, float:-2.2173668E-35)
            int r2 = r2 + r1
            r3 = 1
            r0[r3] = r2
            r2 = 2
            r0[r2] = r1
            r2 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r1 = r1 - r2
            r2 = 3
            r0[r2] = r1
            return
    }

    private void process(byte[] r13, int r14) {
            r12 = this;
            int[] r0 = r12.state
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r5 = 2
            r6 = r0[r5]
            r7 = 3
            r0 = r0[r7]
            int r8 = getInt(r13, r14)
            r9 = -2048144777(0xffffffff85ebca77, float:-2.2173668E-35)
            int r8 = r8 * r9
            int r2 = r2 + r8
            r8 = 13
            int r2 = java.lang.Integer.rotateLeft(r2, r8)
            r10 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r2 = r2 * r10
            int r11 = r14 + 4
            int r11 = getInt(r13, r11)
            int r11 = r11 * r9
            int r4 = r4 + r11
            int r4 = java.lang.Integer.rotateLeft(r4, r8)
            int r4 = r4 * r10
            int r11 = r14 + 8
            int r11 = getInt(r13, r11)
            int r11 = r11 * r9
            int r6 = r6 + r11
            int r6 = java.lang.Integer.rotateLeft(r6, r8)
            int r6 = r6 * r10
            int r14 = r14 + 12
            int r13 = getInt(r13, r14)
            int r13 = r13 * r9
            int r0 = r0 + r13
            int r13 = java.lang.Integer.rotateLeft(r0, r8)
            int r13 = r13 * r10
            int[] r14 = r12.state
            r14[r1] = r2
            r14[r3] = r4
            r14[r5] = r6
            r14[r7] = r13
            r12.stateUpdated = r3
            return
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
            r6 = this;
            boolean r0 = r6.stateUpdated
            r1 = 0
            r2 = 374761393(0x165667b1, float:1.7319502E-25)
            r3 = 2
            if (r0 == 0) goto L34
            int[] r0 = r6.state
            r0 = r0[r1]
            r4 = 1
            int r0 = java.lang.Integer.rotateLeft(r0, r4)
            int[] r5 = r6.state
            r4 = r5[r4]
            r5 = 7
            int r4 = java.lang.Integer.rotateLeft(r4, r5)
            int r0 = r0 + r4
            int[] r4 = r6.state
            r3 = r4[r3]
            r4 = 12
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            int r0 = r0 + r3
            int[] r3 = r6.state
            r4 = 3
            r3 = r3[r4]
            r4 = 18
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            int r0 = r0 + r3
            goto L39
        L34:
            int[] r0 = r6.state
            r0 = r0[r3]
            int r0 = r0 + r2
        L39:
            int r3 = r6.totalLen
            int r0 = r0 + r3
            int r3 = r6.pos
            int r3 = r3 + (-4)
        L40:
            r4 = -1028477379(0xffffffffc2b2ae3d, float:-89.34031)
            if (r1 > r3) goto L5a
            byte[] r5 = r6.buffer
            int r5 = getInt(r5, r1)
            int r5 = r5 * r4
            int r0 = r0 + r5
            r4 = 17
            int r0 = java.lang.Integer.rotateLeft(r0, r4)
            r4 = 668265263(0x27d4eb2f, float:5.9096807E-15)
            int r0 = r0 * r4
            int r1 = r1 + 4
            goto L40
        L5a:
            int r3 = r6.pos
            if (r1 >= r3) goto L74
            byte[] r3 = r6.buffer
            int r5 = r1 + 1
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = 11
            int r0 = java.lang.Integer.rotateLeft(r0, r1)
            r1 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r0 = r0 * r1
            r1 = r5
            goto L5a
        L74:
            int r1 = r0 >>> 15
            r0 = r0 ^ r1
            r1 = -2048144777(0xffffffff85ebca77, float:-2.2173668E-35)
            int r0 = r0 * r1
            int r1 = r0 >>> 13
            r0 = r0 ^ r1
            int r0 = r0 * r4
            int r1 = r0 >>> 16
            r0 = r0 ^ r1
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @Override // java.util.zip.Checksum
    public void reset() {
            r1 = this;
            r1.initializeState()
            r0 = 0
            r1.totalLen = r0
            r1.pos = r0
            r1.stateUpdated = r0
            return
    }

    @Override // java.util.zip.Checksum
    public void update(int r3) {
            r2 = this;
            byte[] r0 = r2.oneByte
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.update(r0, r1, r3)
            return
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] r5, int r6, int r7) {
            r4 = this;
            if (r7 > 0) goto L3
            return
        L3:
            int r0 = r4.totalLen
            int r0 = r0 + r7
            r4.totalLen = r0
            int r0 = r6 + r7
            int r1 = r4.pos
            int r2 = r1 + r7
            int r2 = r2 + (-16)
            if (r2 >= 0) goto L1d
            byte[] r0 = r4.buffer
            java.lang.System.arraycopy(r5, r6, r0, r1, r7)
            int r5 = r4.pos
            int r5 = r5 + r7
            r4.pos = r5
            return
        L1d:
            r7 = 0
            if (r1 <= 0) goto L2d
            int r2 = 16 - r1
            byte[] r3 = r4.buffer
            java.lang.System.arraycopy(r5, r6, r3, r1, r2)
            byte[] r1 = r4.buffer
            r4.process(r1, r7)
            int r6 = r6 + r2
        L2d:
            int r1 = r0 + (-16)
        L2f:
            if (r6 > r1) goto L37
            r4.process(r5, r6)
            int r6 = r6 + 16
            goto L2f
        L37:
            if (r6 >= r0) goto L42
            int r0 = r0 - r6
            r4.pos = r0
            byte[] r1 = r4.buffer
            java.lang.System.arraycopy(r5, r6, r1, r7, r0)
            goto L44
        L42:
            r4.pos = r7
        L44:
            return
    }
}
