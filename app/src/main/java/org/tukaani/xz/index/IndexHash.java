package org.tukaani.xz.index;

/* JADX INFO: loaded from: classes2.dex */
public class IndexHash extends org.tukaani.xz.index.IndexBase {
    private org.tukaani.xz.check.Check hash;

    public IndexHash() {
            r1 = this;
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            r0.<init>()
            r1.<init>(r0)
            org.tukaani.xz.check.SHA256 r0 = new org.tukaani.xz.check.SHA256     // Catch: java.security.NoSuchAlgorithmException -> L10
            r0.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L10
            r1.hash = r0     // Catch: java.security.NoSuchAlgorithmException -> L10
            goto L17
        L10:
            org.tukaani.xz.check.CRC32 r0 = new org.tukaani.xz.check.CRC32
            r0.<init>()
            r1.hash = r0
        L17:
            return
    }

    @Override // org.tukaani.xz.index.IndexBase
    public void add(long r2, long r4) throws org.tukaani.xz.XZIOException {
            r1 = this;
            super.add(r2, r4)
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.putLong(r2)
            r0.putLong(r4)
            org.tukaani.xz.check.Check r2 = r1.hash
            byte[] r3 = r0.array()
            r2.update(r3)
            return
    }

    @Override // org.tukaani.xz.index.IndexBase
    public /* bridge */ /* synthetic */ long getIndexSize() {
            r2 = this;
            long r0 = super.getIndexSize()
            return r0
    }

    @Override // org.tukaani.xz.index.IndexBase
    public /* bridge */ /* synthetic */ long getStreamSize() {
            r2 = this;
            long r0 = super.getStreamSize()
            return r0
    }

    public void validate(java.io.InputStream r12) throws java.io.IOException {
            r11 = this;
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r1 = 0
            r0.update(r1)
            java.util.zip.CheckedInputStream r2 = new java.util.zip.CheckedInputStream
            r2.<init>(r12, r0)
            long r3 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r2)
            long r5 = r11.recordCount
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 != 0) goto Lc5
            org.tukaani.xz.index.IndexHash r12 = new org.tukaani.xz.index.IndexHash
            r12.<init>()
            r3 = 0
        L1f:
            long r5 = r11.recordCount
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r6 = "XZ Index is corrupt"
            if (r5 >= 0) goto L5a
            long r7 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r2)
            long r9 = org.tukaani.xz.common.DecoderUtil.decodeVLI(r2)
            r12.add(r7, r9)     // Catch: org.tukaani.xz.XZIOException -> L54
            long r7 = r12.blocksSum
            long r9 = r11.blocksSum
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L4e
            long r7 = r12.uncompressedSum
            long r9 = r11.uncompressedSum
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L4e
            long r7 = r12.indexListSize
            long r9 = r11.indexListSize
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L4e
            r5 = 1
            long r3 = r3 + r5
            goto L1f
        L4e:
            org.tukaani.xz.CorruptedInputException r12 = new org.tukaani.xz.CorruptedInputException
            r12.<init>(r6)
            throw r12
        L54:
            org.tukaani.xz.CorruptedInputException r12 = new org.tukaani.xz.CorruptedInputException
            r12.<init>(r6)
            throw r12
        L5a:
            long r3 = r12.blocksSum
            long r7 = r11.blocksSum
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto Lbf
            long r3 = r12.uncompressedSum
            long r7 = r11.uncompressedSum
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto Lbf
            long r3 = r12.indexListSize
            long r7 = r11.indexListSize
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto Lbf
            org.tukaani.xz.check.Check r12 = r12.hash
            byte[] r12 = r12.finish()
            org.tukaani.xz.check.Check r3 = r11.hash
            byte[] r3 = r3.finish()
            boolean r12 = java.util.Arrays.equals(r12, r3)
            if (r12 == 0) goto Lbf
            java.io.DataInputStream r12 = new java.io.DataInputStream
            r12.<init>(r2)
            int r2 = r11.getIndexPaddingSize()
        L8d:
            if (r2 <= 0) goto L9e
            int r3 = r12.readUnsignedByte()
            if (r3 != 0) goto L98
            int r2 = r2 + (-1)
            goto L8d
        L98:
            org.tukaani.xz.CorruptedInputException r12 = new org.tukaani.xz.CorruptedInputException
            r12.<init>(r6)
            throw r12
        L9e:
            long r2 = r0.getValue()
        La2:
            r0 = 4
            if (r1 >= r0) goto Lbe
            int r0 = r1 * 8
            long r4 = r2 >>> r0
            r7 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r7
            int r0 = r12.readUnsignedByte()
            long r7 = (long) r0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto Lb8
            int r1 = r1 + 1
            goto La2
        Lb8:
            org.tukaani.xz.CorruptedInputException r12 = new org.tukaani.xz.CorruptedInputException
            r12.<init>(r6)
            throw r12
        Lbe:
            return
        Lbf:
            org.tukaani.xz.CorruptedInputException r12 = new org.tukaani.xz.CorruptedInputException
            r12.<init>(r6)
            throw r12
        Lc5:
            org.tukaani.xz.CorruptedInputException r12 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r0 = "XZ Block Header or the start of XZ Index is corrupt"
            r12.<init>(r0)
            throw r12
    }
}
