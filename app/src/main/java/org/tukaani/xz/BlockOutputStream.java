package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class BlockOutputStream extends org.tukaani.xz.FinishableOutputStream {
    private final org.tukaani.xz.check.Check check;
    private final long compressedSizeLimit;
    private org.tukaani.xz.FinishableOutputStream filterChain;
    private final int headerSize;
    private final java.io.OutputStream out;
    private final org.tukaani.xz.CountingOutputStream outCounted;
    private final byte[] tempBuf;
    private long uncompressedSize;

    public BlockOutputStream(java.io.OutputStream r6, org.tukaani.xz.FilterEncoder[] r7, org.tukaani.xz.check.Check r8, org.tukaani.xz.ArrayCache r9) throws java.io.IOException {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.uncompressedSize = r0
            r0 = 1
            byte[] r1 = new byte[r0]
            r5.tempBuf = r1
            r5.out = r6
            r5.check = r8
            org.tukaani.xz.CountingOutputStream r1 = new org.tukaani.xz.CountingOutputStream
            r1.<init>(r6)
            r5.outCounted = r1
            r5.filterChain = r1
            int r1 = r7.length
            int r1 = r1 - r0
        L1b:
            if (r1 < 0) goto L2a
            r2 = r7[r1]
            org.tukaani.xz.FinishableOutputStream r3 = r5.filterChain
            org.tukaani.xz.FinishableOutputStream r2 = r2.getOutputStream(r3, r9)
            r5.filterChain = r2
            int r1 = r1 + (-1)
            goto L1b
        L2a:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r9.<init>()
            r1 = 0
            r9.write(r1)
            int r2 = r7.length
            int r2 = r2 - r0
            r9.write(r2)
            r0 = r1
        L39:
            int r2 = r7.length
            if (r0 >= r2) goto L56
            r2 = r7[r0]
            long r2 = r2.getFilterID()
            org.tukaani.xz.common.EncoderUtil.encodeVLI(r9, r2)
            r2 = r7[r0]
            byte[] r2 = r2.getFilterProps()
            int r3 = r2.length
            long r3 = (long) r3
            org.tukaani.xz.common.EncoderUtil.encodeVLI(r9, r3)
            r9.write(r2)
            int r0 = r0 + 1
            goto L39
        L56:
            int r7 = r9.size()
            r7 = r7 & 3
            if (r7 == 0) goto L62
            r9.write(r1)
            goto L56
        L62:
            byte[] r7 = r9.toByteArray()
            int r9 = r7.length
            int r9 = r9 + 4
            r5.headerSize = r9
            r0 = 1024(0x400, float:1.435E-42)
            if (r9 > r0) goto L8b
            int r0 = r7.length
            int r0 = r0 / 4
            byte r0 = (byte) r0
            r7[r1] = r0
            r6.write(r7)
            org.tukaani.xz.common.EncoderUtil.writeCRC32(r6, r7)
            r6 = 9223372036854775804(0x7ffffffffffffffc, double:NaN)
            long r0 = (long) r9
            long r6 = r6 - r0
            int r8 = r8.getSize()
            long r8 = (long) r8
            long r6 = r6 - r8
            r5.compressedSizeLimit = r6
            return
        L8b:
            org.tukaani.xz.UnsupportedOptionsException r6 = new org.tukaani.xz.UnsupportedOptionsException
            r6.<init>()
            throw r6
    }

    private void validate() throws java.io.IOException {
            r6 = this;
            org.tukaani.xz.CountingOutputStream r0 = r6.outCounted
            long r0 = r0.getSize()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L19
            long r4 = r6.compressedSizeLimit
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L19
            long r0 = r6.uncompressedSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L19
            return
        L19:
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "XZ Stream has grown too big"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.tukaani.xz.FinishableOutputStream
    public void finish() throws java.io.IOException {
            r6 = this;
            org.tukaani.xz.FinishableOutputStream r0 = r6.filterChain
            r0.finish()
            r6.validate()
            org.tukaani.xz.CountingOutputStream r0 = r6.outCounted
            long r0 = r0.getSize()
        Le:
            r2 = 3
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            java.io.OutputStream r2 = r6.out
            r3 = 0
            r2.write(r3)
            r2 = 1
            long r0 = r0 + r2
            goto Le
        L21:
            java.io.OutputStream r0 = r6.out
            org.tukaani.xz.check.Check r1 = r6.check
            byte[] r1 = r1.finish()
            r0.write(r1)
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.FinishableOutputStream r0 = r1.filterChain
            r0.flush()
            r1.validate()
            return
    }

    public long getUncompressedSize() {
            r2 = this;
            long r0 = r2.uncompressedSize
            return r0
    }

    public long getUnpaddedSize() {
            r4 = this;
            int r0 = r4.headerSize
            long r0 = (long) r0
            org.tukaani.xz.CountingOutputStream r2 = r4.outCounted
            long r2 = r2.getSize()
            long r0 = r0 + r2
            org.tukaani.xz.check.Check r2 = r4.check
            int r2 = r2.getSize()
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.tempBuf
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.write(r0, r1, r3)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.FinishableOutputStream r0 = r2.filterChain
            r0.write(r3, r4, r5)
            org.tukaani.xz.check.Check r0 = r2.check
            r0.update(r3, r4, r5)
            long r3 = r2.uncompressedSize
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.uncompressedSize = r3
            r2.validate()
            return
    }
}
