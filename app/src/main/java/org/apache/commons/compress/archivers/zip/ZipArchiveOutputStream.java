package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveOutputStream extends org.apache.commons.compress.archivers.ArchiveOutputStream<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> {
    static final int BUFFER_SIZE = 512;
    private static final int CFH_COMMENT_LENGTH_OFFSET = 32;
    private static final int CFH_COMPRESSED_SIZE_OFFSET = 20;
    private static final int CFH_CRC_OFFSET = 16;
    private static final int CFH_DISK_NUMBER_OFFSET = 34;
    private static final int CFH_EXTERNAL_ATTRIBUTES_OFFSET = 38;
    private static final int CFH_EXTRA_LENGTH_OFFSET = 30;
    private static final int CFH_FILENAME_LENGTH_OFFSET = 28;
    private static final int CFH_FILENAME_OFFSET = 46;
    private static final int CFH_GPB_OFFSET = 8;
    private static final int CFH_INTERNAL_ATTRIBUTES_OFFSET = 36;
    private static final int CFH_LFH_OFFSET = 42;
    private static final int CFH_METHOD_OFFSET = 10;
    private static final int CFH_ORIGINAL_SIZE_OFFSET = 24;
    static final byte[] CFH_SIG = null;
    private static final int CFH_SIG_OFFSET = 0;
    private static final int CFH_TIME_OFFSET = 12;
    private static final int CFH_VERSION_MADE_BY_OFFSET = 4;
    private static final int CFH_VERSION_NEEDED_OFFSET = 6;
    static final byte[] DD_SIG = null;
    static final java.nio.charset.Charset DEFAULT_CHARSET = null;
    public static final int DEFAULT_COMPRESSION = -1;
    public static final int DEFLATED = 8;

    @java.lang.Deprecated
    public static final int EFS_FLAG = 2048;
    static final byte[] EOCD_SIG = null;
    private static final int LFH_COMPRESSED_SIZE_OFFSET = 18;
    private static final int LFH_CRC_OFFSET = 14;
    private static final int LFH_EXTRA_LENGTH_OFFSET = 28;
    private static final int LFH_FILENAME_LENGTH_OFFSET = 26;
    private static final int LFH_FILENAME_OFFSET = 30;
    private static final int LFH_GPB_OFFSET = 6;
    private static final int LFH_METHOD_OFFSET = 8;
    private static final int LFH_ORIGINAL_SIZE_OFFSET = 22;
    static final byte[] LFH_SIG = null;
    private static final int LFH_SIG_OFFSET = 0;
    private static final int LFH_TIME_OFFSET = 10;
    private static final int LFH_VERSION_NEEDED_OFFSET = 4;
    private static final byte[] LZERO = null;
    private static final byte[] ONE = null;
    public static final int STORED = 0;
    private static final byte[] ZERO = null;
    static final byte[] ZIP64_EOCD_LOC_SIG = null;
    static final byte[] ZIP64_EOCD_SIG = null;
    private long cdDiskNumberStart;
    private long cdLength;
    private long cdOffset;
    private java.nio.charset.Charset charset;
    private java.lang.String comment;
    private final byte[] copyBuffer;
    private org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy createUnicodeExtraFields;
    protected final java.util.zip.Deflater def;
    private final java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> entries;
    private org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry entry;
    private long eocdLength;
    private boolean fallbackToUTF8;

    @java.lang.Deprecated
    protected boolean finished;
    private boolean hasCompressionLevelChanged;
    private boolean hasUsedZip64;
    private final boolean isSplitZip;
    private int level;
    private final java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData> metaData;
    private int method;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> numberOfCDInDiskData;
    private final org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor;
    private boolean useUTF8Flag;
    private org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode;
    private org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class CurrentEntry {
        private long bytesRead;
        private boolean causedUseOfZip64;
        private long dataStart;
        private final org.apache.commons.compress.archivers.zip.ZipArchiveEntry entry;
        private boolean hasWritten;
        private long localDataStart;

        private CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1) {
                r0 = this;
                r0.<init>()
                r0.entry = r1
                return
        }

        /* synthetic */ CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry access$000(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0) {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r0.entry
                return r0
        }

        static /* synthetic */ long access$100(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r2) {
                long r0 = r2.dataStart
                return r0
        }

        static /* synthetic */ long access$102(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0, long r1) {
                r0.dataStart = r1
                return r1
        }

        static /* synthetic */ long access$200(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r2) {
                long r0 = r2.bytesRead
                return r0
        }

        static /* synthetic */ long access$202(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0, long r1) {
                r0.bytesRead = r1
                return r1
        }

        static /* synthetic */ boolean access$300(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0) {
                boolean r0 = r0.hasWritten
                return r0
        }

        static /* synthetic */ boolean access$302(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0, boolean r1) {
                r0.hasWritten = r1
                return r1
        }

        static /* synthetic */ boolean access$600(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0) {
                boolean r0 = r0.causedUseOfZip64
                return r0
        }

        static /* synthetic */ boolean access$602(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0, boolean r1) {
                r0.causedUseOfZip64 = r1
                return r1
        }

        static /* synthetic */ long access$800(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r2) {
                long r0 = r2.localDataStart
                return r0
        }

        static /* synthetic */ long access$802(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry r0, long r1) {
                r0.localDataStart = r1
                return r1
        }
    }

    private static final class EntryMetaData {
        private final long offset;
        private final boolean usesDataDescriptor;

        private EntryMetaData(long r1, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.usesDataDescriptor = r3
                return
        }

        /* synthetic */ EntryMetaData(long r1, boolean r3, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r3)
                return
        }

        static /* synthetic */ long access$400(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData r2) {
                long r0 = r2.offset
                return r0
        }

        static /* synthetic */ boolean access$500(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData r0) {
                boolean r0 = r0.usesDataDescriptor
                return r0
        }
    }

    public static final class UnicodeExtraFieldPolicy {
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy ALWAYS = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy NEVER = null;
        public static final org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy NOT_ENCODEABLE = null;
        private final java.lang.String name;

        static {
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy
                java.lang.String r1 = "always"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy
                java.lang.String r1 = "never"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER = r0
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy
                java.lang.String r1 = "not encodeable"
                r0.<init>(r1)
                org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE = r0
                return
        }

        private UnicodeExtraFieldPolicy(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_CHARSET = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0050: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZERO = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0056: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LZERO = r0
            r0 = 1
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ONE = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG
            byte[] r0 = r0.getBytes()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG
            byte[] r0 = r0.getBytes()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG
            byte[] r0 = r0.getBytes()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG = r0
            r0 = 101010256(0x6054b50, double:4.99056974E-316)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG = r0
            r0 = 101075792(0x6064b50, double:4.99380765E-316)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG = r0
            r0 = 117853008(0x7064b50, double:5.82271225E-316)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG = r0
            return
    }

    public ZipArchiveOutputStream(java.io.File r2) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r2 = r2.toPath()
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1.<init>(r2, r0)
            return
    }

    public ZipArchiveOutputStream(java.io.File r1, long r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2)
            return
    }

    public ZipArchiveOutputStream(java.io.OutputStream r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.comment = r0
            r0 = -1
            r3.level = r0
            r0 = 8
            r3.method = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.entries = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.metaData = r0
            java.nio.charset.Charset r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_CHARSET
            r3.charset = r0
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r0)
            r3.zipEncoding = r0
            r0 = 1
            r3.useUTF8Flag = r0
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER
            r3.createUnicodeExtraFields = r1
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded
            r3.zip64Mode = r1
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]
            r3.copyBuffer = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.numberOfCDInDiskData = r1
            r3.out = r4
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            int r2 = r3.level
            r1.<init>(r2, r0)
            r3.def = r1
            org.apache.commons.compress.archivers.zip.StreamCompressor r4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(r4, r1)
            r3.streamCompressor = r4
            r4 = 0
            r3.isSplitZip = r4
            return
    }

    public ZipArchiveOutputStream(java.nio.channels.SeekableByteChannel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.comment = r0
            r0 = -1
            r2.level = r0
            r0 = 8
            r2.method = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.entries = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.metaData = r0
            java.nio.charset.Charset r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_CHARSET
            r2.charset = r0
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r0)
            r2.zipEncoding = r0
            r0 = 1
            r2.useUTF8Flag = r0
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER
            r2.createUnicodeExtraFields = r1
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded
            r2.zip64Mode = r1
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]
            r2.copyBuffer = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.numberOfCDInDiskData = r1
            org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream r1 = new org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream
            r1.<init>(r3)
            r2.out = r1
            java.util.zip.Deflater r3 = new java.util.zip.Deflater
            int r1 = r2.level
            r3.<init>(r1, r0)
            r2.def = r3
            java.io.OutputStream r0 = r2.out
            org.apache.commons.compress.archivers.zip.StreamCompressor r3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(r0, r3)
            r2.streamCompressor = r3
            r3 = 0
            r2.isSplitZip = r3
            return
    }

    public ZipArchiveOutputStream(java.nio.file.Path r4, long r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.comment = r0
            r0 = -1
            r3.level = r0
            r0 = 8
            r3.method = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.entries = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.metaData = r0
            java.nio.charset.Charset r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_CHARSET
            r3.charset = r0
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r0)
            r3.zipEncoding = r0
            r0 = 1
            r3.useUTF8Flag = r0
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER
            r3.createUnicodeExtraFields = r1
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded
            r3.zip64Mode = r1
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]
            r3.copyBuffer = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.numberOfCDInDiskData = r1
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            int r2 = r3.level
            r1.<init>(r2, r0)
            r3.def = r1
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r2 = new org.apache.commons.compress.archivers.zip.ZipSplitOutputStream
            r2.<init>(r4, r5)
            r3.out = r2
            java.io.OutputStream r4 = r3.out
            org.apache.commons.compress.archivers.zip.StreamCompressor r4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(r4, r1)
            r3.streamCompressor = r4
            r3.isSplitZip = r0
            return
    }

    public ZipArchiveOutputStream(java.nio.file.Path r4, java.nio.file.OpenOption... r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.comment = r0
            r0 = -1
            r3.level = r0
            r0 = 8
            r3.method = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.entries = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.metaData = r0
            java.nio.charset.Charset r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_CHARSET
            r3.charset = r0
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r0)
            r3.zipEncoding = r0
            r0 = 1
            r3.useUTF8Flag = r0
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER
            r3.createUnicodeExtraFields = r1
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded
            r3.zip64Mode = r1
            r1 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r1]
            r3.copyBuffer = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.numberOfCDInDiskData = r1
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            int r2 = r3.level
            r1.<init>(r2, r0)
            r3.def = r1
            int r0 = r5.length
            if (r0 != 0) goto L51
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r5 = new org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream
            r5.<init>(r4)
            goto L57
        L51:
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r0 = new org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream
            r0.<init>(r4, r5)
            r5 = r0
        L57:
            r3.out = r5
            java.io.OutputStream r4 = r3.out
            org.apache.commons.compress.archivers.zip.StreamCompressor r4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(r4, r1)
            r3.streamCompressor = r4
            r4 = 0
            r3.isSplitZip = r4
            return
    }

    private void addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5, boolean r6, java.nio.ByteBuffer r7) throws java.io.IOException {
            r4 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r0 = r4.createUnicodeExtraFields
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS
            if (r0 == r1) goto L8
            if (r6 != 0) goto L25
        L8:
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField r6 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField
            java.lang.String r0 = r5.getName()
            byte[] r1 = r7.array()
            int r2 = r7.arrayOffset()
            int r3 = r7.limit()
            int r7 = r7.position()
            int r3 = r3 - r7
            r6.<init>(r0, r1, r2, r3)
            r5.addExtraField(r6)
        L25:
            java.lang.String r6 = r5.getComment()
            if (r6 == 0) goto L60
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L60
            org.apache.commons.compress.archivers.zip.ZipEncoding r7 = r4.zipEncoding
            boolean r7 = r7.canEncode(r6)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r0 = r4.createUnicodeExtraFields
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS
            if (r0 == r1) goto L3f
            if (r7 != 0) goto L60
        L3f:
            org.apache.commons.compress.archivers.zip.ZipEncoding r7 = r4.getEntryEncoding(r5)
            java.nio.ByteBuffer r7 = r7.encode(r6)
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField r0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField
            byte[] r1 = r7.array()
            int r2 = r7.arrayOffset()
            int r3 = r7.limit()
            int r7 = r7.position()
            int r3 = r3 - r7
            r0.<init>(r6, r1, r2, r3)
            r5.addExtraField(r0)
        L60:
            return
    }

    private boolean checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode r3) throws java.util.zip.ZipException {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r2.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            boolean r0 = r2.isZip64Required(r0, r3)
            if (r0 == 0) goto L21
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r3 == r1) goto L11
            goto L21
        L11:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r3 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r2.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            java.lang.String r0 = org.apache.commons.compress.archivers.zip.Zip64RequiredException.getEntryTooBigMessage(r0)
            r3.<init>(r0)
            throw r3
        L21:
            return r0
    }

    private void closeCopiedEntry(boolean r4) throws java.io.IOException {
            r3 = this;
            r3.preClose()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r3.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            long r1 = r1.getSize()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$202(r0, r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r3.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r3.getEffectiveZip64Mode(r0)
            boolean r0 = r3.checkIfNeedsZip64(r0)
            r3.closeEntry(r0, r4)
            return
    }

    private void closeEntry(boolean r2, boolean r3) throws java.io.IOException {
            r1 = this;
            if (r3 != 0) goto Lb
            java.io.OutputStream r0 = r1.out
            boolean r0 = r0 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r0 == 0) goto Lb
            r1.rewriteSizesAndCrc(r2)
        Lb:
            if (r3 != 0) goto L16
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r2 = r1.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r2)
            r1.writeDataDescriptor(r2)
        L16:
            r2 = 0
            r1.entry = r2
            return
    }

    private void copyFromZipInputStream(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            if (r0 == 0) goto L26
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            r1 = 1
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$302(r0, r1)
        L11:
            byte[] r0 = r4.copyBuffer
            int r0 = r5.read(r0)
            if (r0 < 0) goto L25
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = r4.streamCompressor
            byte[] r2 = r4.copyBuffer
            r3 = 0
            r1.writeCounted(r2, r3, r0)
            r4.count(r0)
            goto L11
        L25:
            return
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "No current entry"
            r5.<init>(r0)
            throw r5
    }

    private byte[] createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r6) throws java.io.IOException {
            r5 = this;
            java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData> r0 = r5.metaData
            java.lang.Object r0 = r0.get(r6)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData) r0
            boolean r1 = r5.hasZip64Extra(r6)
            if (r1 != 0) goto L45
            long r1 = r6.getCompressedSize()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L45
            long r1 = r6.getSize()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L45
            long r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData.access$400(r0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L45
            long r1 = r6.getDiskNumberStart()
            r3 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L45
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = r5.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r2 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r1 == r2) goto L45
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = r5.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r2 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility
            if (r1 != r2) goto L43
            goto L45
        L43:
            r1 = 0
            goto L46
        L45:
            r1 = 1
        L46:
            if (r1 == 0) goto L57
            org.apache.commons.compress.archivers.zip.Zip64Mode r2 = r5.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r3 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r2 == r3) goto L4f
            goto L57
        L4f:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r6 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r0 = "Archive's size exceeds the limit of 4GByte."
            r6.<init>(r0)
            throw r6
        L57:
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData.access$400(r0)
            r5.handleZip64Extra(r6, r2, r1)
            java.nio.ByteBuffer r2 = r5.getName(r6)
            byte[] r6 = r5.createCentralFileHeader(r6, r2, r0, r1)
            return r6
    }

    private byte[] createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r19, java.nio.ByteBuffer r20, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData r21, boolean r22) throws java.io.IOException {
            r18 = this;
            r0 = r18
            boolean r1 = r0.isSplitZip
            r2 = 1
            if (r1 == 0) goto L47
            java.io.OutputStream r1 = r0.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r1 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r1
            int r1 = r1.getCurrentSplitSegmentIndex()
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.numberOfCDInDiskData
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L29
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.numberOfCDInDiskData
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.put(r1, r4)
            goto L47
        L29:
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.numberOfCDInDiskData
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r0.numberOfCDInDiskData
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r3 + r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.put(r1, r3)
        L47:
            byte[] r1 = r19.getCentralDirectoryExtra()
            int r3 = r1.length
            java.lang.String r4 = r19.getComment()
            if (r4 != 0) goto L54
            java.lang.String r4 = ""
        L54:
            org.apache.commons.compress.archivers.zip.ZipEncoding r5 = r18.getEntryEncoding(r19)
            java.nio.ByteBuffer r4 = r5.encode(r4)
            int r5 = r20.limit()
            int r6 = r20.position()
            int r5 = r5 - r6
            int r6 = r4.limit()
            int r7 = r4.position()
            int r6 = r6 - r7
            int r7 = r5 + 46
            int r8 = r7 + r3
            int r9 = r8 + r6
            byte[] r9 = new byte[r9]
            byte[] r10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG
            r11 = 0
            r12 = 4
            java.lang.System.arraycopy(r10, r11, r9, r11, r12)
            int r10 = r19.getPlatform()
            r13 = 8
            int r10 = r10 << r13
            boolean r14 = r0.hasUsedZip64
            r15 = 20
            if (r14 != 0) goto L8c
            r14 = r15
            goto L8e
        L8c:
            r14 = 45
        L8e:
            r10 = r10 | r14
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r10, r9, r12)
            int r10 = r19.getMethod()
            org.apache.commons.compress.archivers.zip.ZipEncoding r12 = r0.zipEncoding
            java.lang.String r14 = r19.getName()
            boolean r12 = r12.canEncode(r14)
            boolean r14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData.access$500(r21)
            r2 = r22
            int r2 = r0.versionNeededToExtract(r10, r2, r14)
            r14 = 6
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r2, r9, r14)
            if (r12 != 0) goto Lb6
            boolean r2 = r0.fallbackToUTF8
            if (r2 == 0) goto Lb6
            r2 = 1
            goto Lb7
        Lb6:
            r2 = r11
        Lb7:
            boolean r12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData.access$500(r21)
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r2 = r0.getGeneralPurposeBits(r2, r12)
            r2.encode(r9, r13)
            r2 = 10
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r10, r9, r2)
            long r12 = r19.getTime()
            r2 = 12
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(r12, r9, r2)
            long r12 = r19.getCrc()
            r2 = 16
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r12, r9, r2)
            long r12 = r19.getCompressedSize()
            r10 = r1
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r13 = 24
            if (r12 >= 0) goto L10d
            long r16 = r19.getSize()
            int r12 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r12 >= 0) goto L10d
            org.apache.commons.compress.archivers.zip.Zip64Mode r12 = r0.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r14 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r12 == r14) goto L10d
            org.apache.commons.compress.archivers.zip.Zip64Mode r12 = r0.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r14 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility
            if (r12 != r14) goto Lfe
            goto L10d
        Lfe:
            long r1 = r19.getCompressedSize()
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r1, r9, r15)
            long r1 = r19.getSize()
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r1, r9, r13)
            goto L117
        L10d:
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            r1.putLong(r9, r15)
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            r1.putLong(r9, r13)
        L117:
            r1 = 28
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r5, r9, r1)
            r1 = 30
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r3, r9, r1)
            r1 = 32
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r6, r9, r1)
            boolean r1 = r0.isSplitZip
            r2 = 34
            if (r1 == 0) goto L14e
            long r12 = r19.getDiskNumberStart()
            r14 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 >= 0) goto L147
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = r0.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r12 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r1 != r12) goto L13e
            goto L147
        L13e:
            long r12 = r19.getDiskNumberStart()
            int r1 = (int) r12
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r1, r9, r2)
            goto L154
        L147:
            r1 = 65535(0xffff, float:9.1834E-41)
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r1, r9, r2)
            goto L154
        L14e:
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZERO
            r12 = 2
            java.lang.System.arraycopy(r1, r11, r9, r2, r12)
        L154:
            int r1 = r19.getInternalAttributes()
            r2 = 36
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r1, r9, r2)
            long r1 = r19.getExternalAttributes()
            r12 = 38
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r1, r9, r12)
            long r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData.access$400(r21)
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            r2 = 42
            if (r1 >= 0) goto L188
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = r0.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r14 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r1 != r14) goto L17c
            goto L188
        L17c:
            long r14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EntryMetaData.access$400(r21)
            long r12 = java.lang.Math.min(r14, r12)
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r12, r9, r2)
            goto L18b
        L188:
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r12, r9, r2)
        L18b:
            byte[] r1 = r20.array()
            int r2 = r20.arrayOffset()
            r12 = 46
            java.lang.System.arraycopy(r1, r2, r9, r12, r5)
            java.lang.System.arraycopy(r10, r11, r9, r7, r3)
            byte[] r1 = r4.array()
            int r2 = r4.arrayOffset()
            java.lang.System.arraycopy(r1, r2, r9, r8, r6)
            return r9
    }

    private byte[] createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r10, java.nio.ByteBuffer r11, boolean r12, boolean r13, long r14) {
            r9 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r10.getExtraField(r0)
            if (r0 == 0) goto Ld
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID
            r10.removeExtraField(r1)
        Ld:
            boolean r1 = r0 instanceof org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField
            if (r1 == 0) goto L14
            org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField r0 = (org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField) r0
            goto L15
        L14:
            r0 = 0
        L15:
            int r1 = r10.getAlignment()
            if (r1 > 0) goto L21
            if (r0 == 0) goto L21
            short r1 = r0.getAlignment()
        L21:
            r2 = 30
            r3 = 1
            r4 = 0
            if (r1 > r3) goto L2f
            if (r0 == 0) goto L5d
            boolean r5 = r0.allowMethodChange()
            if (r5 != 0) goto L5d
        L2f:
            int r5 = r11.limit()
            int r5 = r5 + r2
            int r6 = r11.position()
            int r5 = r5 - r6
            byte[] r6 = r10.getLocalFileDataExtra()
            int r6 = r6.length
            int r5 = r5 + r6
            long r14 = -r14
            long r5 = (long) r5
            long r14 = r14 - r5
            r5 = 6
            long r14 = r14 - r5
            int r5 = r1 + (-1)
            long r5 = (long) r5
            long r14 = r14 & r5
            int r14 = (int) r14
            org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField r15 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField
            if (r0 == 0) goto L56
            boolean r0 = r0.allowMethodChange()
            if (r0 == 0) goto L56
            r0 = r3
            goto L57
        L56:
            r0 = r4
        L57:
            r15.<init>(r1, r0, r14)
            r10.addExtraField(r15)
        L5d:
            byte[] r14 = r10.getLocalFileDataExtra()
            int r15 = r11.limit()
            int r0 = r11.position()
            int r15 = r15 - r0
            int r0 = r15 + 30
            int r1 = r14.length
            int r1 = r1 + r0
            byte[] r1 = new byte[r1]
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG
            r6 = 4
            java.lang.System.arraycopy(r5, r4, r1, r4, r6)
            int r5 = r10.getMethod()
            boolean r7 = r9.usesDataDescriptor(r5, r13)
            boolean r8 = r9.hasZip64Extra(r10)
            int r8 = r9.versionNeededToExtract(r5, r8, r7)
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r8, r1, r6)
            if (r12 != 0) goto L90
            boolean r12 = r9.fallbackToUTF8
            if (r12 == 0) goto L90
            goto L91
        L90:
            r3 = r4
        L91:
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r12 = r9.getGeneralPurposeBits(r3, r7)
            r3 = 6
            r12.encode(r1, r3)
            r12 = 8
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r5, r1, r12)
            long r7 = r10.getTime()
            r3 = 10
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(r7, r1, r3)
            r3 = 14
            if (r13 != 0) goto Lba
            if (r5 == r12) goto Lb4
            java.io.OutputStream r7 = r9.out
            boolean r7 = r7 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r7 != 0) goto Lb4
            goto Lba
        Lb4:
            byte[] r7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LZERO
            java.lang.System.arraycopy(r7, r4, r1, r3, r6)
            goto Lc1
        Lba:
            long r7 = r10.getCrc()
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r7, r1, r3)
        Lc1:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r3 = r9.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r3)
            boolean r3 = r9.hasZip64Extra(r3)
            r7 = 22
            r8 = 18
            if (r3 == 0) goto Ldc
            org.apache.commons.compress.archivers.zip.ZipLong r10 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            r10.putLong(r1, r8)
            org.apache.commons.compress.archivers.zip.ZipLong r10 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            r10.putLong(r1, r7)
            goto L10d
        Ldc:
            if (r13 == 0) goto Led
            long r12 = r10.getCompressedSize()
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r12, r1, r8)
            long r12 = r10.getSize()
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r12, r1, r7)
            goto L10d
        Led:
            if (r5 == r12) goto L105
            java.io.OutputStream r12 = r9.out
            boolean r12 = r12 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r12 == 0) goto Lf6
            goto L105
        Lf6:
            long r12 = r10.getSize()
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r12, r1, r8)
            long r12 = r10.getSize()
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r12, r1, r7)
            goto L10d
        L105:
            byte[] r10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LZERO
            java.lang.System.arraycopy(r10, r4, r1, r8, r6)
            java.lang.System.arraycopy(r10, r4, r1, r7, r6)
        L10d:
            r10 = 26
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r15, r1, r10)
            int r10 = r14.length
            r12 = 28
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r10, r1, r12)
            byte[] r10 = r11.array()
            int r11 = r11.arrayOffset()
            java.lang.System.arraycopy(r10, r11, r1, r2, r15)
            int r10 = r14.length
            java.lang.System.arraycopy(r14, r4, r1, r0, r10)
            return r1
    }

    private void flushDeflater() throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r2.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            int r0 = r0.getMethod()
            r1 = 8
            if (r0 != r1) goto L13
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r2.streamCompressor
            r0.flushDeflater()
        L13:
            return
    }

    private org.apache.commons.compress.archivers.zip.Zip64Mode getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5) {
            r4 = this;
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r4.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded
            if (r0 != r1) goto L22
            java.io.OutputStream r0 = r4.out
            boolean r0 = r0 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r0 != 0) goto L22
            int r0 = r5.getMethod()
            r1 = 8
            if (r0 != r1) goto L22
            long r0 = r5.getSize()
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1f
            goto L22
        L1f:
            org.apache.commons.compress.archivers.zip.Zip64Mode r5 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            return r5
        L22:
            org.apache.commons.compress.archivers.zip.Zip64Mode r5 = r4.zip64Mode
            return r5
    }

    private org.apache.commons.compress.archivers.zip.ZipEncoding getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r1.zipEncoding
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.canEncode(r2)
            if (r2 != 0) goto L13
            boolean r2 = r1.fallbackToUTF8
            if (r2 == 0) goto L13
            org.apache.commons.compress.archivers.zip.ZipEncoding r2 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.ZIP_ENCODING_UTF_8
            goto L15
        L13:
            org.apache.commons.compress.archivers.zip.ZipEncoding r2 = r1.zipEncoding
        L15:
            return r2
    }

    private org.apache.commons.compress.archivers.zip.GeneralPurposeBit getGeneralPurposeBits(boolean r4, boolean r5) {
            r3 = this;
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit
            r0.<init>()
            boolean r1 = r3.useUTF8Flag
            r2 = 1
            if (r1 != 0) goto Lf
            if (r4 == 0) goto Ld
            goto Lf
        Ld:
            r4 = 0
            goto L10
        Lf:
            r4 = r2
        L10:
            r0.useUTF8ForNames(r4)
            if (r5 == 0) goto L18
            r0.useDataDescriptor(r2)
        L18:
            return r0
    }

    private java.nio.ByteBuffer getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r1.getEntryEncoding(r2)
            java.lang.String r2 = r2.getName()
            java.nio.ByteBuffer r2 = r0.encode(r2)
            return r2
    }

    private org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4) {
            r3 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r3.entry
            r1 = 1
            if (r0 == 0) goto Lb
            boolean r2 = r3.hasUsedZip64
            r2 = r2 ^ r1
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$602(r0, r2)
        Lb:
            r3.hasUsedZip64 = r1
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r4.getExtraField(r0)
            boolean r1 = r0 instanceof org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField
            if (r1 == 0) goto L1a
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField r0 = (org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L22
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField r0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField
            r0.<init>()
        L22:
            r4.addAsFirstExtraField(r0)
            return r0
    }

    private boolean handleSizesAndCrc(long r5, long r7, org.apache.commons.compress.archivers.zip.Zip64Mode r9) throws java.util.zip.ZipException {
            r4 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            int r0 = r0.getMethod()
            r1 = 8
            if (r0 != r1) goto L31
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r1 = r4.entry
            long r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$200(r1)
            r0.setSize(r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            r0.setCompressedSize(r5)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r5 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r5)
            r5.setCrc(r7)
            goto Lee
        L31:
            java.io.OutputStream r0 = r4.out
            boolean r0 = r0 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r0 != 0) goto Ld3
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            long r0 = r0.getCrc()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            java.lang.String r1 = " instead of "
            java.lang.String r2 = ": "
            if (r0 != 0) goto L92
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r7 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r7)
            long r7 = r7.getSize()
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L59
            goto Lee
        L59:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Bad size for entry "
            r8.<init>(r9)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r9 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r9)
            java.lang.String r9 = r9.getName()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r9 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r9)
            long r2 = r9.getSize()
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r5 = r8.append(r5)
            java.lang.String r5 = r5.toString()
            r7.<init>(r5)
            throw r7
        L92:
            java.util.zip.ZipException r5 = new java.util.zip.ZipException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Bad CRC checksum for entry "
            r6.<init>(r9)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r9 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r9)
            java.lang.String r9 = r9.getName()
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.StringBuilder r6 = r6.append(r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r9 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r9)
            long r2 = r9.getCrc()
            java.lang.String r9 = java.lang.Long.toHexString(r2)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = java.lang.Long.toHexString(r7)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Ld3:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            r0.setSize(r5)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            r0.setCompressedSize(r5)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r5 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r5)
            r5.setCrc(r7)
        Lee:
            boolean r5 = r4.checkIfNeedsZip64(r9)
            return r5
    }

    private void handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r8, long r9, boolean r11) {
            r7 = this;
            if (r11 == 0) goto L87
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField r11 = r7.getZip64Extra(r8)
            long r0 = r8.getCompressedSize()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L30
            long r0 = r8.getSize()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L30
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r7.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r0 == r1) goto L30
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r7.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility
            if (r0 != r1) goto L28
            goto L30
        L28:
            r0 = 0
            r11.setCompressedSize(r0)
            r11.setSize(r0)
            goto L48
        L30:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r4 = r8.getCompressedSize()
            r0.<init>(r4)
            r11.setCompressedSize(r0)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r4 = r8.getSize()
            r0.<init>(r4)
            r11.setSize(r0)
        L48:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L57
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r7.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r3 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r0 != r3) goto L55
            goto L57
        L55:
            r0 = r1
            goto L58
        L57:
            r0 = r2
        L58:
            long r3 = r8.getDiskNumberStart()
            r5 = 65535(0xffff, double:3.23786E-319)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L69
            org.apache.commons.compress.archivers.zip.Zip64Mode r3 = r7.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r4 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r3 != r4) goto L6a
        L69:
            r1 = r2
        L6a:
            if (r0 != 0) goto L6e
            if (r1 == 0) goto L76
        L6e:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r0.<init>(r9)
            r11.setRelativeHeaderOffset(r0)
        L76:
            if (r1 == 0) goto L84
            org.apache.commons.compress.archivers.zip.ZipLong r9 = new org.apache.commons.compress.archivers.zip.ZipLong
            long r0 = r8.getDiskNumberStart()
            r9.<init>(r0)
            r11.setDiskStartNumber(r9)
        L84:
            r8.setExtra()
        L87:
            return
    }

    private boolean hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r2 = r2.getExtraField(r0)
            boolean r2 = r2 instanceof org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField
            return r2
    }

    private boolean isTooLargeForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5) {
            r4 = this;
            long r0 = r5.getSize()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L18
            long r0 = r5.getCompressedSize()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L16
            goto L18
        L16:
            r5 = 0
            goto L19
        L18:
            r5 = 1
        L19:
            return r5
    }

    private boolean isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2, org.apache.commons.compress.archivers.zip.Zip64Mode r3) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r3 == r0) goto L11
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility
            if (r3 == r0) goto L11
            boolean r2 = r1.isTooLargeForZip32(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    private void preClose() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.finished
            if (r0 != 0) goto L1d
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r2.entry
            if (r0 == 0) goto L15
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$300(r0)
            if (r0 != 0) goto L14
            byte[] r0 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
            r1 = 0
            r2.write(r0, r1, r1)
        L14:
            return
        L15:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No current entry to close"
            r0.<init>(r1)
            throw r0
        L1d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream has already been finished"
            r0.<init>(r1)
            throw r0
    }

    private void putArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r6, boolean r7) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.finished
            if (r0 != 0) goto Lc7
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r5.entry
            if (r0 == 0) goto Lb
            r5.closeArchiveEntry()
        Lb:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry
            r1 = 0
            r0.<init>(r6, r1)
            r5.entry = r0
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r1 = r5.entries
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            r1.add(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            r5.setDefaults(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r5.getEffectiveZip64Mode(r0)
            r5.validateSizeInformation(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r1 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r1)
            boolean r0 = r5.shouldAddZip64Extra(r1, r0)
            if (r0 == 0) goto La7
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField r0 = r5.getZip64Extra(r0)
            if (r7 == 0) goto L69
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r2 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r2)
            long r2 = r2.getSize()
            r1.<init>(r2)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r3 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r3)
            long r3 = r3.getCompressedSize()
            r2.<init>(r3)
            goto L98
        L69:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r1 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r1)
            int r1 = r1.getMethod()
            if (r1 != 0) goto L95
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r1 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r1)
            long r1 = r1.getSize()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L95
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r2 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r2)
            long r2 = r2.getSize()
            r1.<init>(r2)
            goto L97
        L95:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
        L97:
            r2 = r1
        L98:
            r0.setSize(r1)
            r0.setCompressedSize(r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            r0.setExtra()
        La7:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r5.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            int r0 = r0.getMethod()
            r1 = 8
            if (r0 != r1) goto Lc3
            boolean r0 = r5.hasCompressionLevelChanged
            if (r0 == 0) goto Lc3
            java.util.zip.Deflater r0 = r5.def
            int r1 = r5.level
            r0.setLevel(r1)
            r0 = 0
            r5.hasCompressionLevelChanged = r0
        Lc3:
            r5.writeLocalFileHeader(r6, r7)
            return
        Lc7:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Stream has already been finished"
            r6.<init>(r7)
            throw r6
    }

    private void rewriteSizesAndCrc(boolean r13) throws java.io.IOException {
            r12 = this;
            java.io.OutputStream r0 = r12.out
            org.apache.commons.compress.archivers.zip.RandomAccessOutputStream r0 = (org.apache.commons.compress.archivers.zip.RandomAccessOutputStream) r0
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r1 = r12.entry
            long r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$800(r1)
            boolean r3 = r0 instanceof org.apache.commons.compress.archivers.zip.ZipSplitOutputStream
            if (r3 == 0) goto L1f
            r3 = r0
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r3 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r3
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r4 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r4)
            long r4 = r4.getDiskNumberStart()
            long r1 = r3.calculateDiskPosition(r4, r1)
        L1f:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r3 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r3)
            long r3 = r3.getCrc()
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r3)
            r0.writeFully(r3, r1)
            r3 = 4
            long r5 = r1 + r3
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r7 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r7)
            boolean r7 = r12.hasZip64Extra(r7)
            r8 = 8
            if (r7 == 0) goto L59
            if (r13 != 0) goto L45
            goto L59
        L45:
            org.apache.commons.compress.archivers.zip.ZipLong r7 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            byte[] r7 = r7.getBytes()
            r0.writeFully(r7, r5)
            long r8 = r8 + r1
            org.apache.commons.compress.archivers.zip.ZipLong r5 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            byte[] r5 = r5.getBytes()
            r0.writeFully(r5, r8)
            goto L7c
        L59:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r7 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r7)
            long r10 = r7.getCompressedSize()
            byte[] r7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r10)
            r0.writeFully(r7, r5)
            long r8 = r8 + r1
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r5 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r5)
            long r5 = r5.getSize()
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r5)
            r0.writeFully(r5, r8)
        L7c:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r5 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r5)
            boolean r5 = r12.hasZip64Extra(r5)
            if (r5 == 0) goto Lff
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r5 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r5)
            java.nio.ByteBuffer r5 = r12.getName(r5)
            int r6 = r5.limit()
            int r5 = r5.position()
            int r6 = r6 - r5
            r7 = 16
            long r7 = r7 + r1
            long r5 = (long) r6
            long r7 = r7 + r5
            long r3 = r3 + r7
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r5 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r5)
            long r5 = r5.getSize()
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r5)
            r0.writeFully(r5, r3)
            r3 = 12
            long r7 = r7 + r3
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r3 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r3)
            long r3 = r3.getCompressedSize()
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r3)
            r0.writeFully(r3, r7)
            if (r13 != 0) goto Lff
            r3 = 10
            long r1 = r1 - r3
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r13 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r13)
            int r13 = r13.getMethod()
            r3 = 0
            int r13 = r12.versionNeededToExtract(r13, r3, r3)
            byte[] r13 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r13)
            r0.writeFully(r13, r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r13 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r13)
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            r13.removeExtraField(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r13 = r12.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r13)
            r13.setExtra()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r13 = r12.entry
            boolean r13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$600(r13)
            if (r13 == 0) goto Lff
            r12.hasUsedZip64 = r3
        Lff:
            return
    }

    private void setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5) {
            r4 = this;
            int r0 = r5.getMethod()
            r1 = -1
            if (r0 != r1) goto Lc
            int r0 = r4.method
            r5.setMethod(r0)
        Lc:
            long r0 = r5.getTime()
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            long r0 = java.lang.System.currentTimeMillis()
            r5.setTime(r0)
        L1d:
            return
    }

    private void setEncoding(java.nio.charset.Charset r2) {
            r1 = this;
            r1.charset = r2
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r2)
            r1.zipEncoding = r0
            boolean r0 = r1.useUTF8Flag
            if (r0 == 0) goto L15
            boolean r2 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(r2)
            if (r2 != 0) goto L15
            r2 = 0
            r1.useUTF8Flag = r2
        L15:
            return
    }

    private boolean shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5, org.apache.commons.compress.archivers.zip.Zip64Mode r6) {
            r4 = this;
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r6 == r0) goto L34
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility
            if (r6 == r0) goto L34
            long r0 = r5.getSize()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L34
            long r0 = r5.getCompressedSize()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L34
            long r0 = r5.getSize()
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L32
            java.io.OutputStream r5 = r4.out
            boolean r5 = r5 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r5 == 0) goto L32
            org.apache.commons.compress.archivers.zip.Zip64Mode r5 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r6 == r5) goto L32
            goto L34
        L32:
            r5 = 0
            goto L35
        L34:
            r5 = 1
        L35:
            return r5
    }

    private boolean shouldUseZip64EOCD() {
            r8 = this;
            boolean r0 = r8.isSplitZip
            r1 = 0
            if (r0 == 0) goto Le
            java.io.OutputStream r0 = r8.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            int r0 = r0.getCurrentSplitSegmentIndex()
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r8.numberOfCDInDiskData
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.getOrDefault(r3, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 >= r3) goto L4c
            long r4 = r8.cdDiskNumberStart
            r6 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4c
            if (r2 >= r3) goto L4c
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r8.entries
            int r0 = r0.size()
            if (r0 >= r3) goto L4c
            long r2 = r8.cdLength
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4c
            long r2 = r8.cdOffset
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L4d
        L4c:
            r1 = 1
        L4d:
            return r1
    }

    private boolean usesDataDescriptor(int r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto Le
            r2 = 8
            if (r1 != r2) goto Le
            java.io.OutputStream r1 = r0.out
            boolean r1 = r1 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private void validateIfZip64IsNeededInEOCD() throws org.apache.commons.compress.archivers.zip.Zip64RequiredException {
            r7 = this;
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r7.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r0 == r1) goto L7
            return
        L7:
            boolean r0 = r7.isSplitZip
            r1 = 0
            if (r0 == 0) goto L15
            java.io.OutputStream r0 = r7.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            int r0 = r0.getCurrentSplitSegmentIndex()
            goto L16
        L15:
            r0 = r1
        L16:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 >= r2) goto L7c
            long r3 = r7.cdDiskNumberStart
            r5 = 65535(0xffff, double:3.23786E-319)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L74
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r7.numberOfCDInDiskData
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 >= r2) goto L6c
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r7.entries
            int r0 = r0.size()
            if (r0 >= r2) goto L64
            long r0 = r7.cdLength
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5c
            long r0 = r7.cdOffset
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L54
            return
        L54:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r0 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r1 = "Archive's size exceeds the limit of 4GByte."
            r0.<init>(r1)
            throw r0
        L5c:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r0 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r1 = "The size of the entire central directory exceeds the limit of 4GByte."
            r0.<init>(r1)
            throw r0
        L64:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r0 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r1 = "Archive contains more than 65535 entries."
            r0.<init>(r1)
            throw r0
        L6c:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r0 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r1 = "Number of entries on this disk exceeds the limit of 65535."
            r0.<init>(r1)
            throw r0
        L74:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r0 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r1 = "Number of the disk with the start of Central Directory exceeds the limit of 65535."
            r0.<init>(r1)
            throw r0
        L7c:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r0 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r1 = "Number of the disk of End Of Central Directory exceeds the limit of 65535."
            r0.<init>(r1)
            throw r0
    }

    private void validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode r5) throws java.util.zip.ZipException {
            r4 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            int r0 = r0.getMethod()
            if (r0 != 0) goto L54
            java.io.OutputStream r0 = r4.out
            boolean r0 = r0 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            if (r0 != 0) goto L54
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            long r0 = r0.getSize()
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4c
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            long r0 = r0.getCrc()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L44
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r1 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r1)
            long r1 = r1.getSize()
            r0.setCompressedSize(r1)
            goto L54
        L44:
            java.util.zip.ZipException r5 = new java.util.zip.ZipException
            java.lang.String r0 = "CRC checksum is required for STORED method when not writing to a file"
            r5.<init>(r0)
            throw r5
        L4c:
            java.util.zip.ZipException r5 = new java.util.zip.ZipException
            java.lang.String r0 = "Uncompressed size is required for STORED method when not writing to a file"
            r5.<init>(r0)
            throw r5
        L54:
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            long r0 = r0.getSize()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L75
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            long r0 = r0.getCompressedSize()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L79
        L75:
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r5 == r0) goto L7a
        L79:
            return
        L7a:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r5 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r4.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            java.lang.String r0 = org.apache.commons.compress.archivers.zip.Zip64RequiredException.getEntryTooBigMessage(r0)
            r5.<init>(r0)
            throw r5
    }

    private int versionNeededToExtract(int r1, boolean r2, boolean r3) {
            r0 = this;
            if (r2 == 0) goto L5
            r1 = 45
            return r1
        L5:
            if (r3 == 0) goto La
            r1 = 20
            return r1
        La:
            int r1 = r0.versionNeededToExtractMethod(r1)
            return r1
    }

    private int versionNeededToExtractMethod(int r2) {
            r1 = this;
            r0 = 8
            if (r2 != r0) goto L7
            r2 = 20
            goto L9
        L7:
            r2 = 10
        L9:
            return r2
    }

    private void writeCentralDirectoryInChunks() throws java.io.IOException {
            r5 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 70000(0x11170, float:9.8091E-41)
            r0.<init>(r1)
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r1 = r5.entries
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Lf:
            r3 = r2
        L10:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r1.next()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r4
            byte[] r4 = r5.createCentralFileHeader(r4)
            r0.write(r4)
            int r3 = r3 + 1
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 <= r4) goto L10
            byte[] r3 = r0.toByteArray()
            r5.writeCounted(r3)
            r0.reset()
            goto Lf
        L34:
            byte[] r0 = r0.toByteArray()
            r5.writeCounted(r0)
            return
    }

    private void writeCounted(byte[] r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r1.streamCompressor
            r0.writeCounted(r2)
            return
    }

    private void writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r10, boolean r11) throws java.io.IOException {
            r9 = this;
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r9.zipEncoding
            java.lang.String r1 = r10.getName()
            boolean r5 = r0.canEncode(r1)
            java.nio.ByteBuffer r4 = r9.getName(r10)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r0 = r9.createUnicodeExtraFields
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$UnicodeExtraFieldPolicy r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER
            if (r0 == r1) goto L17
            r9.addUnicodeExtraFields(r10, r5, r4)
        L17:
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r9.streamCompressor
            long r0 = r0.getTotalBytesWritten()
            boolean r2 = r9.isSplitZip
            if (r2 == 0) goto L31
            java.io.OutputStream r0 = r9.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            int r1 = r0.getCurrentSplitSegmentIndex()
            long r1 = (long) r1
            r10.setDiskNumberStart(r1)
            long r0 = r0.getCurrentSplitSegmentBytesWritten()
        L31:
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r0
            byte[] r2 = r2.createLocalFileHeader(r3, r4, r5, r6, r7)
            java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData> r3 = r9.metaData
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData r4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData
            int r5 = r10.getMethod()
            boolean r11 = r9.usesDataDescriptor(r5, r11)
            r5 = 0
            r4.<init>(r0, r11, r5)
            r3.put(r10, r4)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r10 = r9.entry
            r3 = 14
            long r0 = r0 + r3
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$802(r10, r0)
            r9.writeCounted(r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r10 = r9.entry
            org.apache.commons.compress.archivers.zip.StreamCompressor r11 = r9.streamCompressor
            long r0 = r11.getTotalBytesWritten()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$102(r10, r0)
            return
    }

    public void addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r6, java.io.InputStream r7) throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry
            r0.<init>(r6)
            boolean r6 = r5.hasZip64Extra(r0)
            if (r6 == 0) goto L10
            org.apache.commons.compress.archivers.zip.ZipShort r6 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            r0.removeExtraField(r6)
        L10:
            long r1 = r0.getCrc()
            r3 = -1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L2c
            long r1 = r0.getSize()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L2c
            long r1 = r0.getCompressedSize()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L2c
            r6 = 1
            goto L2d
        L2c:
            r6 = 0
        L2d:
            r5.putArchiveEntry(r0, r6)
            r5.copyFromZipInputStream(r7)
            r5.closeCopiedEntry(r6)
            return
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public boolean canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.compress.archivers.zip.ZipArchiveEntry
            r1 = 0
            if (r0 == 0) goto L26
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r4
            int r0 = r4.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r2 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING
            int r2 = r2.getCode()
            if (r0 == r2) goto L26
            int r0 = r4.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r2 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING
            int r2 = r2.getCode()
            if (r0 == r2) goto L26
            boolean r4 = org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(r4)
            if (r4 == 0) goto L26
            r1 = 1
        L26:
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.finished     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L7
            r1.finish()     // Catch: java.lang.Throwable -> Lb
        L7:
            r1.destroy()
            return
        Lb:
            r0 = move-exception
            r1.destroy()
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws java.io.IOException {
            r10 = this;
            r10.preClose()
            r10.flushDeflater()
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r10.streamCompressor
            long r0 = r0.getTotalBytesWritten()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r2 = r10.entry
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$100(r2)
            long r5 = r0 - r2
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r10.streamCompressor
            long r7 = r0.getCrc32()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r10.entry
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = r10.streamCompressor
            long r1 = r1.getBytesRead()
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$202(r0, r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r10.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.Zip64Mode r9 = r10.getEffectiveZip64Mode(r0)
            r4 = r10
            boolean r0 = r4.handleSizesAndCrc(r5, r7, r9)
            r1 = 0
            r10.closeEntry(r0, r1)
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r10.streamCompressor
            r0.reset()
            return
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.io.File r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = r0.createArchiveEntry(r1, r2)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption[] r3) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = r0.createArchiveEntry(r1, r2, r3)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry createArchiveEntry(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto La
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry
            r0.<init>(r2, r3)
            return r0
        La:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Stream has already been finished"
            r2.<init>(r3)
            throw r2
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry createArchiveEntry(java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r1 = this;
            boolean r4 = r1.finished
            if (r4 != 0) goto Ld
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            r4.<init>(r2, r3, r0)
            return r4
        Ld:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Stream has already been finished"
            r2.<init>(r3)
            throw r2
    }

    protected final void deflate() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r1.streamCompressor
            r0.deflate()
            return
    }

    void destroy() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            if (r0 == 0) goto L9
            java.io.OutputStream r0 = r1.out
            r0.close()
        L9:
            return
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.finished
            if (r0 != 0) goto L73
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r5.entry
            if (r0 != 0) goto L6b
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r5.streamCompressor
            long r0 = r0.getTotalBytesWritten()
            r5.cdOffset = r0
            boolean r2 = r5.isSplitZip
            if (r2 == 0) goto L25
            java.io.OutputStream r2 = r5.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r2 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r2
            long r3 = r2.getCurrentSplitSegmentBytesWritten()
            r5.cdOffset = r3
            int r2 = r2.getCurrentSplitSegmentIndex()
            long r2 = (long) r2
            r5.cdDiskNumberStart = r2
        L25:
            r5.writeCentralDirectoryInChunks()
            org.apache.commons.compress.archivers.zip.StreamCompressor r2 = r5.streamCompressor
            long r2 = r2.getTotalBytesWritten()
            long r2 = r2 - r0
            r5.cdLength = r2
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r5.zipEncoding
            java.lang.String r1 = r5.comment
            java.nio.ByteBuffer r0 = r0.encode(r1)
            int r1 = r0.limit()
            long r1 = (long) r1
            int r0 = r0.position()
            long r3 = (long) r0
            long r1 = r1 - r3
            r3 = 22
            long r1 = r1 + r3
            r5.eocdLength = r1
            r5.writeZip64CentralDirectory()
            r5.writeCentralDirectoryEnd()
            java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData> r0 = r5.metaData
            r0.clear()
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r5.entries
            r0.clear()
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r5.streamCompressor
            r0.close()
            boolean r0 = r5.isSplitZip
            if (r0 == 0) goto L67
            java.io.OutputStream r0 = r5.out
            r0.close()
        L67:
            r0 = 1
            r5.finished = r0
            return
        L6b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "This archive contains unclosed entries."
            r0.<init>(r1)
            throw r0
        L73:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "This archive has already been finished"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            if (r0 == 0) goto L9
            java.io.OutputStream r0 = r1.out
            r0.flush()
        L9:
            return
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public long getBytesWritten() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r2.streamCompressor
            long r0 = r0.getTotalBytesWritten()
            return r0
    }

    public java.lang.String getEncoding() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.name()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean isSeekable() {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            boolean r0 = r0 instanceof org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ void putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r1
            r0.putArchiveEntry(r1)
            return
    }

    public void putArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.putArchiveEntry(r2, r0)
            return
    }

    public void setComment(java.lang.String r1) {
            r0 = this;
            r0.comment = r1
            return
    }

    public void setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy r1) {
            r0 = this;
            r0.createUnicodeExtraFields = r1
            return
    }

    public void setEncoding(java.lang.String r1) {
            r0 = this;
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            r0.setEncoding(r1)
            return
    }

    public void setFallbackToUTF8(boolean r1) {
            r0 = this;
            r0.fallbackToUTF8 = r1
            return
    }

    public void setLevel(int r4) {
            r3 = this;
            r0 = -1
            if (r4 < r0) goto L12
            r0 = 9
            if (r4 > r0) goto L12
            int r0 = r3.level
            if (r0 != r4) goto Lc
            return
        Lc:
            r0 = 1
            r3.hasCompressionLevelChanged = r0
            r3.level = r4
            return
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid compression level: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setMethod(int r1) {
            r0 = this;
            r0.method = r1
            return
    }

    public void setUseLanguageEncodingFlag(boolean r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            java.nio.charset.Charset r1 = r0.charset
            boolean r1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.useUTF8Flag = r1
            return
    }

    public void setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode r1) {
            r0 = this;
            r0.zip64Mode = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r2.entry
            if (r0 == 0) goto L1f
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r0)
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(r0)
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r2.streamCompressor
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r1 = r2.entry
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.access$000(r1)
            int r1 = r1.getMethod()
            long r3 = r0.write(r3, r4, r5, r1)
            r2.count(r3)
            return
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "No current entry"
            r3.<init>(r4)
            throw r3
    }

    protected void writeCentralDirectoryEnd() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.hasUsedZip64
            if (r0 != 0) goto L11
            boolean r0 = r4.isSplitZip
            if (r0 == 0) goto L11
            java.io.OutputStream r0 = r4.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            long r1 = r4.eocdLength
            r0.prepareToWriteUnsplittableContent(r1)
        L11:
            r4.validateIfZip64IsNeededInEOCD()
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG
            r4.writeCounted(r0)
            boolean r0 = r4.isSplitZip
            r1 = 0
            if (r0 == 0) goto L27
            java.io.OutputStream r0 = r4.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            int r0 = r0.getCurrentSplitSegmentIndex()
            goto L28
        L27:
            r0 = r1
        L28:
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r0)
            r4.writeCounted(r2)
            long r2 = r4.cdDiskNumberStart
            int r2 = (int) r2
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r2)
            r4.writeCounted(r2)
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r2 = r4.entries
            int r2 = r2.size()
            boolean r3 = r4.isSplitZip
            if (r3 == 0) goto L58
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r4.numberOfCDInDiskData
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L59
        L58:
            r0 = r2
        L59:
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = java.lang.Math.min(r0, r1)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r0)
            r4.writeCounted(r0)
            int r0 = java.lang.Math.min(r2, r1)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r0)
            r4.writeCounted(r0)
            long r0 = r4.cdLength
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = java.lang.Math.min(r0, r2)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            r4.writeCounted(r0)
            long r0 = r4.cdOffset
            long r0 = java.lang.Math.min(r0, r2)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            r4.writeCounted(r0)
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r4.zipEncoding
            java.lang.String r1 = r4.comment
            java.nio.ByteBuffer r0 = r0.encode(r1)
            int r1 = r0.limit()
            int r2 = r0.position()
            int r1 = r1 - r2
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r1)
            r4.writeCounted(r2)
            org.apache.commons.compress.archivers.zip.StreamCompressor r2 = r4.streamCompressor
            byte[] r3 = r0.array()
            int r0 = r0.arrayOffset()
            r2.writeCounted(r3, r0, r1)
            return
    }

    protected void writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1) throws java.io.IOException {
            r0 = this;
            byte[] r1 = r0.createCentralFileHeader(r1)
            r0.writeCounted(r1)
            return
    }

    protected void writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.getMethod()
            r1 = 0
            boolean r0 = r2.usesDataDescriptor(r0, r1)
            if (r0 != 0) goto Lc
            return
        Lc:
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG
            r2.writeCounted(r0)
            long r0 = r3.getCrc()
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            r2.writeCounted(r0)
            boolean r0 = r2.hasZip64Extra(r3)
            if (r0 != 0) goto L39
            long r0 = r3.getCompressedSize()
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            r2.writeCounted(r0)
            long r0 = r3.getSize()
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            r2.writeCounted(r3)
            goto L4f
        L39:
            long r0 = r3.getCompressedSize()
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r0)
            r2.writeCounted(r0)
            long r0 = r3.getSize()
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r0)
            r2.writeCounted(r3)
        L4f:
            return
    }

    protected void writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.writeLocalFileHeader(r2, r0)
            return
    }

    protected final void writeOut(byte[] r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r3.streamCompressor
            r1 = 0
            int r2 = r4.length
            r0.writeOut(r4, r1, r2)
            return
    }

    protected final void writeOut(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r1.streamCompressor
            r0.writeOut(r2, r3, r4)
            return
    }

    public void writePreamble(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.writePreamble(r3, r0, r1)
            return
    }

    public void writePreamble(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$CurrentEntry r0 = r1.entry
            if (r0 != 0) goto La
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r1.streamCompressor
            r0.writeCounted(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Preamble must be written before creating an entry"
            r2.<init>(r3)
            throw r2
    }

    protected void writeZip64CentralDirectory() throws java.io.IOException {
            r10 = this;
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r10.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r0 != r1) goto L7
            return
        L7:
            boolean r0 = r10.hasUsedZip64
            r1 = 1
            if (r0 != 0) goto L14
            boolean r0 = r10.shouldUseZip64EOCD()
            if (r0 == 0) goto L14
            r10.hasUsedZip64 = r1
        L14:
            boolean r0 = r10.hasUsedZip64
            if (r0 != 0) goto L19
            return
        L19:
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r10.streamCompressor
            long r2 = r0.getTotalBytesWritten()
            boolean r0 = r10.isSplitZip
            if (r0 == 0) goto L31
            java.io.OutputStream r0 = r10.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            long r2 = r0.getCurrentSplitSegmentBytesWritten()
            int r0 = r0.getCurrentSplitSegmentIndex()
            long r4 = (long) r0
            goto L33
        L31:
            r4 = 0
        L33:
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG
            r10.writeOut(r0)
            r6 = 44
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r6)
            r10.writeOut(r0)
            r0 = 45
            byte[] r6 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r0)
            r10.writeOut(r6)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r0)
            r10.writeOut(r0)
            boolean r0 = r10.isSplitZip
            r6 = 0
            if (r0 == 0) goto L5f
            java.io.OutputStream r0 = r10.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            int r0 = r0.getCurrentSplitSegmentIndex()
            goto L60
        L5f:
            r0 = r6
        L60:
            long r7 = (long) r0
            byte[] r7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r7)
            r10.writeOut(r7)
            long r7 = r10.cdDiskNumberStart
            byte[] r7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r7)
            r10.writeOut(r7)
            boolean r7 = r10.isSplitZip
            if (r7 == 0) goto L8a
            java.util.Map<java.lang.Integer, java.lang.Integer> r7 = r10.numberOfCDInDiskData
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r7.getOrDefault(r0, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L90
        L8a:
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r10.entries
            int r0 = r0.size()
        L90:
            long r6 = (long) r0
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r6)
            r10.writeOut(r0)
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r10.entries
            int r0 = r0.size()
            long r6 = (long) r0
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r6)
            r10.writeOut(r0)
            long r6 = r10.cdLength
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r6)
            r10.writeOut(r0)
            long r6 = r10.cdOffset
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r6)
            r10.writeOut(r0)
            boolean r0 = r10.isSplitZip
            if (r0 == 0) goto Lc8
            r6 = 20
            long r8 = r10.eocdLength
            long r8 = r8 + r6
            java.io.OutputStream r0 = r10.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            r0.prepareToWriteUnsplittableContent(r8)
        Lc8:
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG
            r10.writeOut(r0)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r4)
            r10.writeOut(r0)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r2)
            r10.writeOut(r0)
            boolean r0 = r10.isSplitZip
            if (r0 == 0) goto Lf1
            java.io.OutputStream r0 = r10.out
            org.apache.commons.compress.archivers.zip.ZipSplitOutputStream r0 = (org.apache.commons.compress.archivers.zip.ZipSplitOutputStream) r0
            int r0 = r0.getCurrentSplitSegmentIndex()
            int r0 = r0 + r1
            long r0 = (long) r0
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r0)
            r10.writeOut(r0)
            goto Lf6
        Lf1:
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ONE
            r10.writeOut(r0)
        Lf6:
            return
    }
}
