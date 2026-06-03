package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
final class CircularBuffer {
    private final byte[] buffer;
    private int readIndex;
    private final int size;
    private int writeIndex;

    CircularBuffer(int r1) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            byte[] r1 = new byte[r1]
            r0.buffer = r1
            return
    }

    public boolean available() {
            r2 = this;
            int r0 = r2.readIndex
            int r1 = r2.writeIndex
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void copy(int r5, int r6) {
            r4 = this;
            int r0 = r4.writeIndex
            int r0 = r0 - r5
            int r6 = r6 + r0
        L4:
            if (r0 >= r6) goto L1b
            byte[] r5 = r4.buffer
            int r1 = r4.writeIndex
            int r2 = r4.size
            int r3 = r0 + r2
            int r3 = r3 % r2
            r3 = r5[r3]
            r5[r1] = r3
            int r1 = r1 + 1
            int r1 = r1 % r2
            r4.writeIndex = r1
            int r0 = r0 + 1
            goto L4
        L1b:
            return
    }

    public int get() {
            r3 = this;
            boolean r0 = r3.available()
            if (r0 == 0) goto L16
            byte[] r0 = r3.buffer
            int r1 = r3.readIndex
            r0 = r0[r1]
            int r1 = r1 + 1
            int r2 = r3.size
            int r1 = r1 % r2
            r3.readIndex = r1
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L16:
            r0 = -1
            return r0
    }

    public void put(int r3) {
            r2 = this;
            byte[] r0 = r2.buffer
            int r1 = r2.writeIndex
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r2.size
            int r1 = r1 % r3
            r2.writeIndex = r1
            return
    }
}
