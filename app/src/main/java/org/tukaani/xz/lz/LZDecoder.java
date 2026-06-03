package org.tukaani.xz.lz;

/* JADX INFO: loaded from: classes2.dex */
public final class LZDecoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final byte[] buf;
    private final int bufSize;
    private int full;
    private int limit;
    private int pendingDist;
    private int pendingLen;
    private int pos;
    private int start;

    static {
            return
    }

    public LZDecoder(int r3, byte[] r4, org.tukaani.xz.ArrayCache r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.start = r0
            r2.pos = r0
            r2.full = r0
            r2.limit = r0
            r2.pendingLen = r0
            r2.pendingDist = r0
            r2.bufSize = r3
            byte[] r5 = r5.getByteArray(r3, r0)
            r2.buf = r5
            if (r4 == 0) goto L2a
            int r1 = r4.length
            int r3 = java.lang.Math.min(r1, r3)
            r2.pos = r3
            r2.full = r3
            r2.start = r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r1, r5, r0, r3)
        L2a:
            return
    }

    public void copyUncompressed(java.io.DataInputStream r3, int r4) throws java.io.IOException {
            r2 = this;
            int r0 = r2.bufSize
            int r1 = r2.pos
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r0, r4)
            byte[] r0 = r2.buf
            int r1 = r2.pos
            r3.readFully(r0, r1, r4)
            int r3 = r2.pos
            int r3 = r3 + r4
            r2.pos = r3
            int r4 = r2.full
            if (r4 >= r3) goto L1b
            r2.full = r3
        L1b:
            return
    }

    public int flush(byte[] r5, int r6) {
            r4 = this;
            int r0 = r4.pos
            int r1 = r4.start
            int r2 = r0 - r1
            int r3 = r4.bufSize
            if (r0 != r3) goto Ld
            r0 = 0
            r4.pos = r0
        Ld:
            byte[] r0 = r4.buf
            java.lang.System.arraycopy(r0, r1, r5, r6, r2)
            int r5 = r4.pos
            r4.start = r5
            return r2
    }

    public int getByte(int r3) {
            r2 = this;
            int r0 = r2.pos
            int r1 = r0 - r3
            int r1 = r1 + (-1)
            if (r3 < r0) goto Lb
            int r3 = r2.bufSize
            int r1 = r1 + r3
        Lb:
            byte[] r3 = r2.buf
            r3 = r3[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
    }

    public int getPos() {
            r1 = this;
            int r0 = r1.pos
            return r0
    }

    public boolean hasPending() {
            r1 = this;
            int r0 = r1.pendingLen
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasSpace() {
            r2 = this;
            int r0 = r2.pos
            int r1 = r2.limit
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void putArraysToCache(org.tukaani.xz.ArrayCache r2) {
            r1 = this;
            byte[] r0 = r1.buf
            r2.putArray(r0)
            return
    }

    public void putByte(byte r4) {
            r3 = this;
            byte[] r0 = r3.buf
            int r1 = r3.pos
            int r2 = r1 + 1
            r3.pos = r2
            r0[r1] = r4
            int r4 = r3.full
            if (r4 >= r2) goto L10
            r3.full = r2
        L10:
            return
    }

    public void repeat(int r4, int r5) throws java.io.IOException {
            r3 = this;
            if (r4 < 0) goto L51
            int r0 = r3.full
            if (r4 >= r0) goto L51
            int r0 = r3.limit
            int r1 = r3.pos
            int r0 = r0 - r1
            int r0 = java.lang.Math.min(r0, r5)
            int r5 = r5 - r0
            r3.pendingLen = r5
            r3.pendingDist = r4
            int r5 = r3.pos
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L34
            int r4 = r3.bufSize
            int r5 = r5 + r4
            int r4 = r4 - r5
            int r4 = java.lang.Math.min(r4, r0)
            byte[] r1 = r3.buf
            int r2 = r3.pos
            java.lang.System.arraycopy(r1, r5, r1, r2, r4)
            int r5 = r3.pos
            int r5 = r5 + r4
            r3.pos = r5
            int r0 = r0 - r4
            if (r0 != 0) goto L33
            return
        L33:
            r5 = 0
        L34:
            int r4 = r3.pos
            int r4 = r4 - r5
            int r4 = java.lang.Math.min(r0, r4)
            byte[] r1 = r3.buf
            int r2 = r3.pos
            java.lang.System.arraycopy(r1, r5, r1, r2, r4)
            int r1 = r3.pos
            int r1 = r1 + r4
            r3.pos = r1
            int r0 = r0 - r4
            if (r0 > 0) goto L34
            int r4 = r3.full
            if (r4 >= r1) goto L50
            r3.full = r1
        L50:
            return
        L51:
            org.tukaani.xz.CorruptedInputException r4 = new org.tukaani.xz.CorruptedInputException
            r4.<init>()
            throw r4
    }

    public void repeatPending() throws java.io.IOException {
            r2 = this;
            int r0 = r2.pendingLen
            if (r0 <= 0) goto L9
            int r1 = r2.pendingDist
            r2.repeat(r1, r0)
        L9:
            return
    }

    public void reset() {
            r3 = this;
            r0 = 0
            r3.start = r0
            r3.pos = r0
            r3.full = r0
            r3.limit = r0
            byte[] r1 = r3.buf
            int r2 = r3.bufSize
            int r2 = r2 + (-1)
            r1[r2] = r0
            return
    }

    public void setLimit(int r4) {
            r3 = this;
            int r0 = r3.bufSize
            int r1 = r3.pos
            int r2 = r0 - r1
            if (r2 > r4) goto Lb
            r3.limit = r0
            goto Le
        Lb:
            int r1 = r1 + r4
            r3.limit = r1
        Le:
            return
    }
}
