package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class SegmentHeader {
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final int[] magic = null;
    private int archiveMajor;
    private int archiveMinor;
    private long archiveModtime;
    private long archiveSize;
    private int archiveSizeOffset;
    private int attributeDefinitionCount;
    private java.io.InputStream bandHeadersInputStream;
    private int bandHeadersSize;
    private int classCount;
    private int cpClassCount;
    private int cpDescriptorCount;
    private int cpDoubleCount;
    private int cpFieldCount;
    private int cpFloatCount;
    private int cpIMethodCount;
    private int cpIntCount;
    private int cpLongCount;
    private int cpMethodCount;
    private int cpSignatureCount;
    private int cpStringCount;
    private int cpUTF8Count;
    private int defaultClassMajorVersion;
    private int defaultClassMinorVersion;
    private int innerClassCount;
    private int numberOfFiles;
    private org.apache.commons.compress.harmony.unpack200.SegmentOptions options;
    private final org.apache.commons.compress.harmony.unpack200.Segment segment;
    private int segmentsRemaining;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.harmony.unpack200.SegmentHeader.EMPTY_BYTE_ARRAY = r0
            r0 = 208(0xd0, float:2.91E-43)
            r1 = 13
            r2 = 202(0xca, float:2.83E-43)
            r3 = 254(0xfe, float:3.56E-43)
            int[] r0 = new int[]{r2, r3, r0, r1}
            org.apache.commons.compress.harmony.unpack200.SegmentHeader.magic = r0
            return
    }

    public SegmentHeader(org.apache.commons.compress.harmony.unpack200.Segment r1) {
            r0 = this;
            r0.<init>()
            r0.segment = r1
            return
    }

    private int decodeScalar(java.lang.String r3, java.io.InputStream r4, org.apache.commons.compress.harmony.pack200.BHSDCodec r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int r4 = r5.decode(r4)
            org.apache.commons.compress.harmony.unpack200.Segment r5 = r2.segment
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Parsed #"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " as "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0 = 2
            r5.log(r0, r3)
            return r4
    }

    private int[] decodeScalar(java.lang.String r4, java.io.InputStream r5, org.apache.commons.compress.harmony.pack200.BHSDCodec r6, int r7) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r3.segment
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parsed #"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r1 = 2
            r0.log(r1, r4)
            int[] r4 = r6.decodeInts(r7, r5)
            return r4
    }

    private void parseArchiveFileCounts(java.io.InputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r4.options
            boolean r0 = r0.hasArchiveFileCounts()
            if (r0 == 0) goto L49
            java.lang.String r0 = "archive_size_hi"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r4.decodeScalar(r0, r5, r1)
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            java.lang.String r2 = "archive_size_lo"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r2 = r4.decodeScalar(r2, r5, r3)
            long r2 = (long) r2
            long r0 = r0 | r2
            r4.setArchiveSize(r0)
            int r0 = r5.available()
            r4.archiveSizeOffset = r0
            java.lang.String r0 = "archive_next_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r4.decodeScalar(r0, r5, r1)
            long r0 = (long) r0
            r4.setSegmentsRemaining(r0)
            java.lang.String r0 = "archive_modtime"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r4.decodeScalar(r0, r5, r1)
            long r0 = (long) r0
            r4.setArchiveModtime(r0)
            java.lang.String r0 = "file_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r5 = r4.decodeScalar(r0, r5, r1)
            r4.numberOfFiles = r5
        L49:
            return
    }

    private void parseArchiveSpecialCounts(java.io.InputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r2.getOptions()
            boolean r0 = r0.hasSpecialFormats()
            if (r0 == 0) goto L20
            java.lang.String r0 = "band_headers_size"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.bandHeadersSize = r0
            java.lang.String r0 = "attr_definition_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r3 = r2.decodeScalar(r0, r3, r1)
            long r0 = (long) r3
            r2.setAttributeDefinitionCount(r0)
        L20:
            return
    }

    private void parseClassCounts(java.io.InputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            java.lang.String r0 = "ic_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.innerClassCount = r0
            java.lang.String r0 = "default_class_minver"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.defaultClassMinorVersion = r0
            java.lang.String r0 = "default_class_majver"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.defaultClassMajorVersion = r0
            java.lang.String r0 = "class_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r3 = r2.decodeScalar(r0, r3, r1)
            r2.classCount = r3
            return
    }

    private void parseCpCounts(java.io.InputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            java.lang.String r0 = "cp_Utf8_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpUTF8Count = r0
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r2.getOptions()
            boolean r0 = r0.hasCPNumberCounts()
            if (r0 == 0) goto L3c
            java.lang.String r0 = "cp_Int_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpIntCount = r0
            java.lang.String r0 = "cp_Float_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpFloatCount = r0
            java.lang.String r0 = "cp_Long_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpLongCount = r0
            java.lang.String r0 = "cp_Double_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpDoubleCount = r0
        L3c:
            java.lang.String r0 = "cp_String_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpStringCount = r0
            java.lang.String r0 = "cp_Class_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpClassCount = r0
            java.lang.String r0 = "cp_Signature_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpSignatureCount = r0
            java.lang.String r0 = "cp_Descr_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpDescriptorCount = r0
            java.lang.String r0 = "cp_Field_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpFieldCount = r0
            java.lang.String r0 = "cp_Method_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r2.decodeScalar(r0, r3, r1)
            r2.cpMethodCount = r0
            java.lang.String r0 = "cp_Imethod_count"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r3 = r2.decodeScalar(r0, r3, r1)
            r2.cpIMethodCount = r3
            return
    }

    private void setArchiveMajorVersion(int r4) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            r0 = 150(0x96, float:2.1E-43)
            if (r4 != r0) goto L7
            r3.archiveMajor = r4
            return
        L7:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r0 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid segment major version: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private void setArchiveMinorVersion(int r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            r0 = 7
            if (r2 != r0) goto L6
            r1.archiveMinor = r2
            return
        L6:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r2 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r0 = "Invalid segment minor version"
            r2.<init>(r0)
            throw r2
    }

    private void setAttributeDefinitionCount(long r1) {
            r0 = this;
            int r1 = (int) r1
            r0.attributeDefinitionCount = r1
            return
    }

    private void setBandHeadersData(byte[] r2) {
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            r1.bandHeadersInputStream = r0
            return
    }

    public long getArchiveModtime() {
            r2 = this;
            long r0 = r2.archiveModtime
            return r0
    }

    public long getArchiveSize() {
            r2 = this;
            long r0 = r2.archiveSize
            return r0
    }

    public int getArchiveSizeOffset() {
            r1 = this;
            int r0 = r1.archiveSizeOffset
            return r0
    }

    public int getAttributeDefinitionCount() {
            r1 = this;
            int r0 = r1.attributeDefinitionCount
            return r0
    }

    public java.io.InputStream getBandHeadersInputStream() {
            r2 = this;
            java.io.InputStream r0 = r2.bandHeadersInputStream
            if (r0 != 0) goto Ld
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = org.apache.commons.compress.harmony.unpack200.SegmentHeader.EMPTY_BYTE_ARRAY
            r0.<init>(r1)
            r2.bandHeadersInputStream = r0
        Ld:
            java.io.InputStream r0 = r2.bandHeadersInputStream
            return r0
    }

    public int getBandHeadersSize() {
            r1 = this;
            int r0 = r1.bandHeadersSize
            return r0
    }

    public int getClassCount() {
            r1 = this;
            int r0 = r1.classCount
            return r0
    }

    public int getCpClassCount() {
            r1 = this;
            int r0 = r1.cpClassCount
            return r0
    }

    public int getCpDescriptorCount() {
            r1 = this;
            int r0 = r1.cpDescriptorCount
            return r0
    }

    public int getCpDoubleCount() {
            r1 = this;
            int r0 = r1.cpDoubleCount
            return r0
    }

    public int getCpFieldCount() {
            r1 = this;
            int r0 = r1.cpFieldCount
            return r0
    }

    public int getCpFloatCount() {
            r1 = this;
            int r0 = r1.cpFloatCount
            return r0
    }

    public int getCpIMethodCount() {
            r1 = this;
            int r0 = r1.cpIMethodCount
            return r0
    }

    public int getCpIntCount() {
            r1 = this;
            int r0 = r1.cpIntCount
            return r0
    }

    public int getCpLongCount() {
            r1 = this;
            int r0 = r1.cpLongCount
            return r0
    }

    public int getCpMethodCount() {
            r1 = this;
            int r0 = r1.cpMethodCount
            return r0
    }

    public int getCpSignatureCount() {
            r1 = this;
            int r0 = r1.cpSignatureCount
            return r0
    }

    public int getCpStringCount() {
            r1 = this;
            int r0 = r1.cpStringCount
            return r0
    }

    public int getCpUTF8Count() {
            r1 = this;
            int r0 = r1.cpUTF8Count
            return r0
    }

    public int getDefaultClassMajorVersion() {
            r1 = this;
            int r0 = r1.defaultClassMajorVersion
            return r0
    }

    public int getDefaultClassMinorVersion() {
            r1 = this;
            int r0 = r1.defaultClassMinorVersion
            return r0
    }

    public int getInnerClassCount() {
            r1 = this;
            int r0 = r1.innerClassCount
            return r0
    }

    public int getNumberOfFiles() {
            r1 = this;
            int r0 = r1.numberOfFiles
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.SegmentOptions getOptions() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = r1.options
            return r0
    }

    public int getSegmentsRemaining() {
            r1 = this;
            int r0 = r1.segmentsRemaining
            return r0
    }

    public void read(java.io.InputStream r5) throws java.io.IOException, java.lang.Error, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            int[] r1 = org.apache.commons.compress.harmony.unpack200.SegmentHeader.magic
            int r1 = r1.length
            java.lang.String r2 = "archive_magic_word"
            int[] r0 = r4.decodeScalar(r2, r5, r0, r1)
            r1 = 0
        Lc:
            int[] r2 = org.apache.commons.compress.harmony.unpack200.SegmentHeader.magic
            int r3 = r2.length
            if (r1 >= r3) goto L22
            r3 = r0[r1]
            r2 = r2[r1]
            if (r3 != r2) goto L1a
            int r1 = r1 + 1
            goto Lc
        L1a:
            java.lang.Error r5 = new java.lang.Error
            java.lang.String r0 = "Bad header"
            r5.<init>(r0)
            throw r5
        L22:
            java.lang.String r0 = "archive_minver"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r4.decodeScalar(r0, r5, r1)
            r4.setArchiveMinorVersion(r0)
            java.lang.String r0 = "archive_majver"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r0 = r4.decodeScalar(r0, r5, r1)
            r4.setArchiveMajorVersion(r0)
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r0 = new org.apache.commons.compress.harmony.unpack200.SegmentOptions
            java.lang.String r1 = "archive_options"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            int r1 = r4.decodeScalar(r1, r5, r2)
            r0.<init>(r1)
            r4.options = r0
            r4.parseArchiveFileCounts(r5)
            r4.parseArchiveSpecialCounts(r5)
            r4.parseCpCounts(r5)
            r4.parseClassCounts(r5)
            int r0 = r4.getBandHeadersSize()
            if (r0 <= 0) goto L64
            int r0 = r4.getBandHeadersSize()
            byte[] r0 = org.apache.commons.compress.utils.IOUtils.readRange(r5, r0)
            r4.setBandHeadersData(r0)
        L64:
            int r0 = r4.archiveSizeOffset
            int r5 = r5.available()
            int r0 = r0 - r5
            r4.archiveSizeOffset = r0
            return
    }

    public void setArchiveModtime(long r1) {
            r0 = this;
            r0.archiveModtime = r1
            return
    }

    public void setArchiveSize(long r1) {
            r0 = this;
            r0.archiveSize = r1
            return
    }

    public void setSegmentsRemaining(long r1) {
            r0 = this;
            int r1 = (int) r1
            r0.segmentsRemaining = r1
            return
    }

    public void unpack() {
            r0 = this;
            return
    }
}
