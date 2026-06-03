package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class FileBands extends org.apache.commons.compress.harmony.pack200.BandSet {
    private final org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.Archive.PackingFile> fileList;
    private final org.apache.commons.compress.harmony.pack200.CPUTF8[] fileName;
    private final byte[][] file_bits;
    private final int[] file_modtime;
    private int[] file_name;
    private final int[] file_options;
    private final long[] file_size;
    private final org.apache.commons.compress.harmony.pack200.PackingOptions options;

    public FileBands(org.apache.commons.compress.harmony.pack200.CpBands r17, org.apache.commons.compress.harmony.pack200.SegmentHeader r18, org.apache.commons.compress.harmony.pack200.PackingOptions r19, org.apache.commons.compress.harmony.pack200.Archive.SegmentUnit r20, int r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r18
            r4 = r21
            r0.<init>(r4, r3)
            java.util.List r4 = r20.getFileList()
            r0.fileList = r4
            r0.options = r2
            r0.cpBands = r1
            int r4 = r4.size()
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r5 = new org.apache.commons.compress.harmony.pack200.CPUTF8[r4]
            r0.fileName = r5
            int[] r5 = new int[r4]
            r0.file_modtime = r5
            long[] r5 = new long[r4]
            r0.file_size = r5
            int[] r5 = new int[r4]
            r0.file_options = r5
            byte[][] r5 = new byte[r4][]
            r0.file_bits = r5
            int r3 = r18.getArchive_modtime()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.List r6 = r20.getClassList()
            java.util.Iterator r6 = r6.iterator()
        L40:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r6.next()
            org.objectweb.asm.ClassReader r7 = (org.objectweb.asm.ClassReader) r7
            java.lang.String r7 = r7.getClassName()
            r5.add(r7)
            goto L40
        L54:
            java.lang.String r6 = ""
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = r1.getCPUtf8(r6)
            java.lang.String r7 = "keep"
            java.lang.String r8 = r19.getModificationTime()
            boolean r7 = r7.equals(r8)
            r8 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8
            r11 = r10
        L69:
            if (r10 >= r4) goto L105
            java.util.List<org.apache.commons.compress.harmony.pack200.Archive$PackingFile> r12 = r0.fileList
            java.lang.Object r12 = r12.get(r10)
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r12 = (org.apache.commons.compress.harmony.pack200.Archive.PackingFile) r12
            java.lang.String r13 = r12.getName()
            java.lang.String r14 = ".class"
            boolean r14 = r13.endsWith(r14)
            if (r14 == 0) goto Lab
            boolean r14 = r2.isPassFile(r13)
            if (r14 != 0) goto Lab
            int[] r14 = r0.file_options
            r15 = r14[r10]
            r15 = r15 | 2
            r14[r10] = r15
            int r14 = r13.length()
            int r14 = r14 + (-6)
            java.lang.String r14 = r13.substring(r8, r14)
            boolean r14 = r5.contains(r14)
            if (r14 == 0) goto La2
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r13 = r0.fileName
            r13[r10] = r6
            goto Lb3
        La2:
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r14 = r0.fileName
            org.apache.commons.compress.harmony.pack200.CPUTF8 r13 = r1.getCPUtf8(r13)
            r14[r10] = r13
            goto Lb3
        Lab:
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r14 = r0.fileName
            org.apache.commons.compress.harmony.pack200.CPUTF8 r13 = r1.getCPUtf8(r13)
            r14[r10] = r13
        Lb3:
            boolean r13 = r19.isKeepDeflateHint()
            if (r13 == 0) goto Lc7
            boolean r13 = r12.isDefalteHint()
            if (r13 == 0) goto Lc7
            int[] r13 = r0.file_options
            r14 = r13[r10]
            r14 = r14 | 1
            r13[r10] = r14
        Lc7:
            byte[] r13 = r12.getContents()
            long[] r14 = r0.file_size
            int r13 = r13.length
            r15 = r9
            long r8 = (long) r13
            r14[r10] = r8
            int r11 = org.apache.commons.compress.utils.ExactMath.add(r11, r8)
            long r8 = r12.getModtime()
            java.util.TimeZone r13 = java.util.TimeZone.getDefault()
            int r13 = r13.getRawOffset()
            long r13 = (long) r13
            long r8 = r8 + r13
            r13 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r13
            int[] r13 = r0.file_modtime
            long r1 = (long) r3
            long r8 = r8 - r1
            int r1 = (int) r8
            r13[r10] = r1
            r9 = r15
            if (r7 != 0) goto Lf4
            if (r9 >= r1) goto Lf4
            r9 = r1
        Lf4:
            byte[][] r1 = r0.file_bits
            byte[] r2 = r12.getContents()
            r1[r10] = r2
            int r10 = r10 + 1
            r1 = r17
            r2 = r19
            r8 = 0
            goto L69
        L105:
            if (r7 != 0) goto L10c
            int[] r1 = r0.file_modtime
            java.util.Arrays.fill(r1, r9)
        L10c:
            return
    }

    private int[] flatten(byte[][] r11) {
            r10 = this;
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto Ld
            r4 = r11[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            int[] r0 = new int[r3]
            int r2 = r11.length
            r3 = r1
            r4 = r3
        L12:
            if (r3 >= r2) goto L29
            r5 = r11[r3]
            int r6 = r5.length
            r7 = r1
        L18:
            if (r7 >= r6) goto L26
            r8 = r5[r7]
            int r9 = r4 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            r0[r4] = r8
            int r7 = r7 + 1
            r4 = r9
            goto L18
        L26:
            int r3 = r3 + 1
            goto L12
        L29:
            return r0
    }

    public void finaliseBands() {
            r4 = this;
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r0 = r4.fileName
            int r0 = r0.length
            int[] r0 = new int[r0]
            r4.file_name = r0
            r0 = 0
        L8:
            int[] r1 = r4.file_name
            int r1 = r1.length
            if (r0 >= r1) goto L54
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r1 = r4.fileName
            r1 = r1[r0]
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r4.cpBands
            java.lang.String r3 = ""
            org.apache.commons.compress.harmony.pack200.CPUTF8 r2 = r2.getCPUtf8(r3)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            java.util.List<org.apache.commons.compress.harmony.pack200.Archive$PackingFile> r1 = r4.fileList
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r1 = (org.apache.commons.compress.harmony.pack200.Archive.PackingFile) r1
            java.lang.String r1 = r1.getName()
            org.apache.commons.compress.harmony.pack200.PackingOptions r2 = r4.options
            boolean r2 = r2.isPassFile(r1)
            if (r2 == 0) goto L45
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r2 = r4.fileName
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r1 = r3.getCPUtf8(r1)
            r2[r0] = r1
            int[] r1 = r4.file_options
            r2 = r1[r0]
            r2 = r2 & (-3)
            r1[r0] = r2
        L45:
            int[] r1 = r4.file_name
            org.apache.commons.compress.harmony.pack200.CPUTF8[] r2 = r4.fileName
            r2 = r2[r0]
            int r2 = r2.getIndex()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L8
        L54:
            return
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r9 = this;
            java.lang.String r0 = "Writing file bands..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int[] r0 = r9.file_name
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r2 = "file_name"
            byte[] r0 = r9.encodeBandInt(r2, r0, r1)
            r10.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from file_name["
            java.lang.StringBuilder r0 = r0.append(r1)
            int[] r1 = r9.file_name
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            long[] r5 = r9.file_size
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r9.segmentHeader
            boolean r8 = r0.have_file_size_hi()
            java.lang.String r4 = "file_size"
            r3 = r9
            byte[] r0 = r3.encodeFlags(r4, r5, r6, r7, r8)
            r10.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from file_size["
            java.lang.StringBuilder r0 = r0.append(r3)
            long[] r3 = r9.file_size
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r9.segmentHeader
            boolean r0 = r0.have_file_modtime()
            if (r0 == 0) goto La7
            int[] r0 = r9.file_modtime
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "file_modtime"
            byte[] r0 = r9.encodeBandInt(r4, r0, r3)
            r10.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from file_modtime["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r9.file_modtime
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
        La7:
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r9.segmentHeader
            boolean r0 = r0.have_file_options()
            if (r0 == 0) goto Lde
            int[] r0 = r9.file_options
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "file_options"
            byte[] r0 = r9.encodeBandInt(r4, r0, r3)
            r10.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from file_options["
            java.lang.StringBuilder r0 = r0.append(r3)
            int[] r3 = r9.file_options
            int r3 = r3.length
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
        Lde:
            byte[][] r0 = r9.file_bits
            int[] r0 = r9.flatten(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            java.lang.String r4 = "file_bits"
            byte[] r0 = r9.encodeBandInt(r4, r0, r3)
            r10.write(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r0 = " bytes from file_bits["
            java.lang.StringBuilder r10 = r10.append(r0)
            byte[][] r0 = r9.file_bits
            int r0 = r0.length
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r10 = r10.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r10)
            return
    }
}
