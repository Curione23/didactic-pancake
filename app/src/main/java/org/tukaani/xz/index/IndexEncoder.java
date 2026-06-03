package org.tukaani.xz.index;

/* JADX INFO: loaded from: classes2.dex */
public class IndexEncoder extends org.tukaani.xz.index.IndexBase {
    private final java.util.ArrayList<org.tukaani.xz.index.IndexRecord> records;

    public IndexEncoder() {
            r2 = this;
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "XZ Stream or its Index has grown too big"
            r0.<init>(r1)
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.records = r0
            return
    }

    @Override // org.tukaani.xz.index.IndexBase
    public void add(long r3, long r5) throws org.tukaani.xz.XZIOException {
            r2 = this;
            super.add(r3, r5)
            java.util.ArrayList<org.tukaani.xz.index.IndexRecord> r0 = r2.records
            org.tukaani.xz.index.IndexRecord r1 = new org.tukaani.xz.index.IndexRecord
            r1.<init>(r3, r5)
            r0.add(r1)
            return
    }

    public void encode(java.io.OutputStream r8) throws java.io.IOException {
            r7 = this;
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            java.util.zip.CheckedOutputStream r1 = new java.util.zip.CheckedOutputStream
            r1.<init>(r8, r0)
            r2 = 0
            r1.write(r2)
            long r3 = r7.recordCount
            org.tukaani.xz.common.EncoderUtil.encodeVLI(r1, r3)
            java.util.ArrayList<org.tukaani.xz.index.IndexRecord> r3 = r7.records
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            org.tukaani.xz.index.IndexRecord r4 = (org.tukaani.xz.index.IndexRecord) r4
            long r5 = r4.unpadded
            org.tukaani.xz.common.EncoderUtil.encodeVLI(r1, r5)
            long r4 = r4.uncompressed
            org.tukaani.xz.common.EncoderUtil.encodeVLI(r1, r4)
            goto L19
        L30:
            int r3 = r7.getIndexPaddingSize()
        L34:
            if (r3 <= 0) goto L3c
            r1.write(r2)
            int r3 = r3 + (-1)
            goto L34
        L3c:
            long r0 = r0.getValue()
        L40:
            r3 = 4
            if (r2 >= r3) goto L4f
            int r3 = r2 * 8
            long r3 = r0 >>> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r8.write(r3)
            int r2 = r2 + 1
            goto L40
        L4f:
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
}
