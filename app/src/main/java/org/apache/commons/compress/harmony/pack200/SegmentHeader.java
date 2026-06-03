package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class SegmentHeader extends org.apache.commons.compress.harmony.pack200.BandSet {
    private static final int archive_majver = 150;
    private static final int archive_minver = 7;
    private static final int[] magic = null;
    private int archive_modtime;
    private int archive_next_count;
    private int archive_options;
    private int archive_size_hi;
    private int archive_size_lo;
    private int attribute_definition_count;
    private final org.apache.commons.compress.harmony.pack200.IntList band_headers;
    private int class_count;
    private int cp_Class_count;
    private int cp_Descr_count;
    private int cp_Double_count;
    private int cp_Field_count;
    private int cp_Float_count;
    private int cp_Imethod_count;
    private int cp_Int_count;
    private int cp_Long_count;
    private int cp_Method_count;
    private int cp_Signature_count;
    private int cp_String_count;
    private int cp_Utf8_count;
    private boolean deflate_hint;
    private int file_count;
    private boolean have_all_code_flags;
    private boolean have_class_flags_hi;
    private boolean have_code_flags_hi;
    private boolean have_field_flags_hi;
    private final boolean have_file_modtime;
    private final boolean have_file_options;
    private boolean have_file_size_hi;
    private boolean have_method_flags_hi;
    private int ic_count;
    private final org.apache.commons.compress.harmony.pack200.SegmentHeader.Counter majverCounter;

    /* JADX INFO: renamed from: org.apache.commons.compress.harmony.pack200.SegmentHeader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class Counter {
        private final int[] counts;
        private int length;
        private final int[] objs;

        private Counter() {
                r2 = this;
                r2.<init>()
                r0 = 8
                int[] r1 = new int[r0]
                r2.objs = r1
                int[] r0 = new int[r0]
                r2.counts = r0
                return
        }

        /* synthetic */ Counter(org.apache.commons.compress.harmony.pack200.SegmentHeader.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void add(int r6) {
                r5 = this;
                r0 = 0
                r1 = r0
                r2 = r1
            L3:
                int r3 = r5.length
                r4 = 1
                if (r1 >= r3) goto L19
                int[] r3 = r5.objs
                r3 = r3[r1]
                if (r3 != r6) goto L16
                int[] r2 = r5.counts
                r3 = r2[r1]
                int r3 = r3 + r4
                r2[r1] = r3
                r2 = r4
            L16:
                int r1 = r1 + 1
                goto L3
            L19:
                if (r2 != 0) goto L32
                int[] r1 = r5.objs
                r1[r3] = r6
                int[] r6 = r5.counts
                r6[r3] = r4
                int r3 = r3 + r4
                r5.length = r3
                int r6 = r1.length
                int r6 = r6 - r4
                if (r3 <= r6) goto L32
                int r6 = r1.length
                int r6 = r6 + 8
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.System.arraycopy(r1, r0, r6, r0, r3)
            L32:
                return
        }

        public int getMostCommon() {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r4.length
                if (r0 >= r2) goto L12
                int[] r2 = r4.counts
                r3 = r2[r0]
                r2 = r2[r1]
                if (r3 <= r2) goto Lf
                r1 = r0
            Lf:
                int r0 = r0 + 1
                goto L2
            L12:
                int[] r0 = r4.objs
                r0 = r0[r1]
                return r0
        }
    }

    static {
            r0 = 208(0xd0, float:2.91E-43)
            r1 = 13
            r2 = 202(0xca, float:2.83E-43)
            r3 = 254(0xfe, float:3.56E-43)
            int[] r0 = new int[]{r2, r3, r0, r1}
            org.apache.commons.compress.harmony.pack200.SegmentHeader.magic = r0
            return
    }

    public SegmentHeader() {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.<init>(r0, r1)
            org.apache.commons.compress.harmony.pack200.IntList r2 = new org.apache.commons.compress.harmony.pack200.IntList
            r2.<init>()
            r3.band_headers = r2
            r3.have_all_code_flags = r0
            r3.have_file_modtime = r0
            r3.have_file_options = r0
            org.apache.commons.compress.harmony.pack200.SegmentHeader$Counter r0 = new org.apache.commons.compress.harmony.pack200.SegmentHeader$Counter
            r0.<init>(r1)
            r3.majverCounter = r0
            return
    }

    private void calculateArchiveOptions() {
            r2 = this;
            int r0 = r2.attribute_definition_count
            if (r0 > 0) goto Lc
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.band_headers
            int r0 = r0.size()
            if (r0 <= 0) goto L12
        Lc:
            int r0 = r2.archive_options
            r0 = r0 | 1
            r2.archive_options = r0
        L12:
            int r0 = r2.cp_Int_count
            if (r0 > 0) goto L22
            int r0 = r2.cp_Float_count
            if (r0 > 0) goto L22
            int r0 = r2.cp_Long_count
            if (r0 > 0) goto L22
            int r0 = r2.cp_Double_count
            if (r0 <= 0) goto L28
        L22:
            int r0 = r2.archive_options
            r0 = r0 | 2
            r2.archive_options = r0
        L28:
            boolean r0 = r2.have_all_code_flags
            if (r0 == 0) goto L32
            int r0 = r2.archive_options
            r0 = r0 | 4
            r2.archive_options = r0
        L32:
            int r0 = r2.file_count
            if (r0 <= 0) goto L3c
            int r0 = r2.archive_options
            r0 = r0 | 16
            r2.archive_options = r0
        L3c:
            boolean r0 = r2.deflate_hint
            if (r0 == 0) goto L46
            int r0 = r2.archive_options
            r0 = r0 | 32
            r2.archive_options = r0
        L46:
            int r0 = r2.archive_options
            r1 = r0 | 192(0xc0, float:2.69E-43)
            r2.archive_options = r1
            boolean r1 = r2.have_file_size_hi
            if (r1 == 0) goto L54
            r0 = r0 | 448(0x1c0, float:6.28E-43)
            r2.archive_options = r0
        L54:
            boolean r0 = r2.have_class_flags_hi
            if (r0 == 0) goto L5e
            int r0 = r2.archive_options
            r0 = r0 | 512(0x200, float:7.17E-43)
            r2.archive_options = r0
        L5e:
            boolean r0 = r2.have_field_flags_hi
            if (r0 == 0) goto L68
            int r0 = r2.archive_options
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r2.archive_options = r0
        L68:
            boolean r0 = r2.have_method_flags_hi
            if (r0 == 0) goto L72
            int r0 = r2.archive_options
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.archive_options = r0
        L72:
            boolean r0 = r2.have_code_flags_hi
            if (r0 == 0) goto L7c
            int r0 = r2.archive_options
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r2.archive_options = r0
        L7c:
            return
    }

    private void writeArchiveFileCounts(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int r0 = r2.archive_options
            r0 = r0 & 16
            if (r0 <= 0) goto L3d
            int r0 = r2.archive_size_hi
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.archive_size_lo
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.archive_next_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.archive_modtime
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.file_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
        L3d:
            return
    }

    private void writeArchiveSpecialCounts(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int r0 = r2.archive_options
            r0 = r0 & 1
            if (r0 <= 0) goto L20
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.band_headers
            int r0 = r0.size()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.attribute_definition_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
        L20:
            return
    }

    private void writeClassCounts(java.io.OutputStream r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r3 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader$Counter r0 = r3.majverCounter
            int r0 = r0.getMostCommon()
            int r1 = r3.ic_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r3.encodeScalar(r1, r2)
            r4.write(r1)
            r1 = 0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r1 = r3.encodeScalar(r1, r2)
            r4.write(r1)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r3.encodeScalar(r0, r1)
            r4.write(r0)
            int r0 = r3.class_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r3.encodeScalar(r0, r1)
            r4.write(r0)
            return
    }

    private void writeCpCounts(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int r0 = r2.cp_Utf8_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.archive_options
            r0 = r0 & 2
            if (r0 == 0) goto L3d
            int r0 = r2.cp_Int_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Float_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Long_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Double_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
        L3d:
            int r0 = r2.cp_String_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Class_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Signature_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Descr_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Field_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Method_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            int r0 = r2.cp_Imethod_count
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            return
    }

    public void addMajorVersion(int r2) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader$Counter r0 = r1.majverCounter
            r0.add(r2)
            return
    }

    public void appendBandCodingSpecifier(int r2) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r1.band_headers
            r0.add(r2)
            return
    }

    public int getArchive_modtime() {
            r1 = this;
            int r0 = r1.archive_modtime
            return r0
    }

    public int getDefaultMajorVersion() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader$Counter r0 = r1.majverCounter
            int r0 = r0.getMostCommon()
            return r0
    }

    public boolean have_all_code_flags() {
            r1 = this;
            boolean r0 = r1.have_all_code_flags
            return r0
    }

    public boolean have_class_flags_hi() {
            r1 = this;
            boolean r0 = r1.have_class_flags_hi
            return r0
    }

    public boolean have_code_flags_hi() {
            r1 = this;
            boolean r0 = r1.have_code_flags_hi
            return r0
    }

    public boolean have_field_flags_hi() {
            r1 = this;
            boolean r0 = r1.have_field_flags_hi
            return r0
    }

    public boolean have_file_modtime() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean have_file_options() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean have_file_size_hi() {
            r1 = this;
            boolean r0 = r1.have_file_size_hi
            return r0
    }

    public boolean have_method_flags_hi() {
            r1 = this;
            boolean r0 = r1.have_method_flags_hi
            return r0
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            int[] r0 = org.apache.commons.compress.harmony.pack200.SegmentHeader.magic
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            r0 = 7
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            r0 = 150(0x96, float:2.1E-43)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            r2.calculateArchiveOptions()
            int r0 = r2.archive_options
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
            r2.writeArchiveFileCounts(r3)
            r2.writeArchiveSpecialCounts(r3)
            r2.writeCpCounts(r3)
            r2.writeClassCounts(r3)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.band_headers
            int r0 = r0.size()
            if (r0 <= 0) goto L51
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.band_headers
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            byte[] r0 = r2.encodeScalar(r0, r1)
            r3.write(r0)
        L51:
            return
    }

    public void setAttribute_definition_count(int r1) {
            r0 = this;
            r0.attribute_definition_count = r1
            return
    }

    public void setClass_count(int r1) {
            r0 = this;
            r0.class_count = r1
            return
    }

    public void setCp_Class_count(int r1) {
            r0 = this;
            r0.cp_Class_count = r1
            return
    }

    public void setCp_Descr_count(int r1) {
            r0 = this;
            r0.cp_Descr_count = r1
            return
    }

    public void setCp_Double_count(int r1) {
            r0 = this;
            r0.cp_Double_count = r1
            return
    }

    public void setCp_Field_count(int r1) {
            r0 = this;
            r0.cp_Field_count = r1
            return
    }

    public void setCp_Float_count(int r1) {
            r0 = this;
            r0.cp_Float_count = r1
            return
    }

    public void setCp_Imethod_count(int r1) {
            r0 = this;
            r0.cp_Imethod_count = r1
            return
    }

    public void setCp_Int_count(int r1) {
            r0 = this;
            r0.cp_Int_count = r1
            return
    }

    public void setCp_Long_count(int r1) {
            r0 = this;
            r0.cp_Long_count = r1
            return
    }

    public void setCp_Method_count(int r1) {
            r0 = this;
            r0.cp_Method_count = r1
            return
    }

    public void setCp_Signature_count(int r1) {
            r0 = this;
            r0.cp_Signature_count = r1
            return
    }

    public void setCp_String_count(int r1) {
            r0 = this;
            r0.cp_String_count = r1
            return
    }

    public void setCp_Utf8_count(int r1) {
            r0 = this;
            r0.cp_Utf8_count = r1
            return
    }

    public void setDeflate_hint(boolean r1) {
            r0 = this;
            r0.deflate_hint = r1
            return
    }

    public void setFile_count(int r1) {
            r0 = this;
            r0.file_count = r1
            return
    }

    public void setHave_all_code_flags(boolean r1) {
            r0 = this;
            r0.have_all_code_flags = r1
            return
    }

    public void setHave_class_flags_hi(boolean r1) {
            r0 = this;
            r0.have_class_flags_hi = r1
            return
    }

    public void setHave_code_flags_hi(boolean r1) {
            r0 = this;
            r0.have_code_flags_hi = r1
            return
    }

    public void setHave_field_flags_hi(boolean r1) {
            r0 = this;
            r0.have_field_flags_hi = r1
            return
    }

    public void setHave_method_flags_hi(boolean r1) {
            r0 = this;
            r0.have_method_flags_hi = r1
            return
    }

    public void setIc_count(int r1) {
            r0 = this;
            r0.ic_count = r1
            return
    }
}
