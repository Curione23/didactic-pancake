package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class FileBands extends org.apache.commons.compress.harmony.unpack200.BandSet {
    private final java.lang.String[] cpUTF8;
    private byte[][] fileBits;
    private int[] fileModtime;
    private java.lang.String[] fileName;
    private int[] fileOptions;
    private long[] fileSize;
    private java.io.InputStream in;

    public FileBands(org.apache.commons.compress.harmony.unpack200.Segment r1) {
            r0 = this;
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r1.getCpBands()
            java.lang.String[] r1 = r1.getCpUTF8()
            r0.cpUTF8 = r1
            return
    }

    public byte[][] getFileBits() {
            r1 = this;
            byte[][] r0 = r1.fileBits
            return r0
    }

    public int[] getFileModtime() {
            r1 = this;
            int[] r0 = r1.fileModtime
            return r0
    }

    public java.lang.String[] getFileName() {
            r1 = this;
            java.lang.String[] r0 = r1.fileName
            return r0
    }

    public int[] getFileOptions() {
            r1 = this;
            int[] r0 = r1.fileOptions
            return r0
    }

    public long[] getFileSize() {
            r1 = this;
            long[] r0 = r1.fileSize
            return r0
    }

    public void processFileBits() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r5.header
            int r0 = r0.getNumberOfFiles()
            byte[][] r1 = new byte[r0][]
            r5.fileBits = r1
            r1 = 0
        Lb:
            if (r1 >= r0) goto L48
            long[] r2 = r5.fileSize
            r3 = r2[r1]
            int r2 = (int) r3
            byte[][] r3 = r5.fileBits
            java.io.InputStream r4 = r5.in
            byte[] r4 = org.apache.commons.compress.utils.IOUtils.readRange(r4, r2)
            r3[r1] = r4
            byte[][] r3 = r5.fileBits
            r3 = r3[r1]
            int r3 = r3.length
            if (r2 == 0) goto L45
            if (r3 < r2) goto L26
            goto L45
        L26:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected to read "
            r1.<init>(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " bytes but read "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L45:
            int r1 = r1 + 1
            goto Lb
        L48:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(java.io.InputStream r9) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r8 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r8.header
            int r0 = r0.getNumberOfFiles()
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r1 = r8.header
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r7 = r1.getOptions()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String[] r6 = r8.cpUTF8
            java.lang.String r2 = "file_name"
            r1 = r8
            r3 = r9
            r5 = r0
            java.lang.String[] r1 = r1.parseReferences(r2, r3, r4, r5, r6)
            r8.fileName = r1
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            boolean r6 = r7.hasFileSizeHi()
            java.lang.String r2 = "file_size"
            r1 = r8
            r4 = r0
            long[] r1 = r1.parseFlags(r2, r3, r4, r5, r6)
            r8.fileSize = r1
            boolean r1 = r7.hasFileModtime()
            if (r1 == 0) goto L3c
            java.lang.String r1 = "file_modtime"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            int[] r1 = r8.decodeBandInt(r1, r9, r2, r0)
            r8.fileModtime = r1
            goto L40
        L3c:
            int[] r1 = new int[r0]
            r8.fileModtime = r1
        L40:
            boolean r1 = r7.hasFileOptions()
            if (r1 == 0) goto L51
            java.lang.String r1 = "file_options"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int[] r0 = r8.decodeBandInt(r1, r9, r2, r0)
            r8.fileOptions = r0
            goto L55
        L51:
            int[] r0 = new int[r0]
            r8.fileOptions = r0
        L55:
            r8.in = r9
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() {
            r0 = this;
            return
    }
}
