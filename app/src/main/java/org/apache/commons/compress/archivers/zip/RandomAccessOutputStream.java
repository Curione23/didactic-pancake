package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
abstract class RandomAccessOutputStream extends java.io.OutputStream {
    RandomAccessOutputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract long position() throws java.io.IOException;

    @Override // java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte r3 = (byte) r3
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r3
            r2.write(r0)
            return
    }

    abstract void writeFully(byte[] r1, int r2, int r3, long r4) throws java.io.IOException;

    public void writeFully(byte[] r7, long r8) throws java.io.IOException {
            r6 = this;
            r2 = 0
            int r3 = r7.length
            r0 = r6
            r1 = r7
            r4 = r8
            r0.writeFully(r1, r2, r3, r4)
            return
    }
}
