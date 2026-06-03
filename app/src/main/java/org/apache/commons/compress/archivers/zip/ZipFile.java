package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ZipFile implements java.io.Closeable {
    static final int BYTE_SHIFT = 8;
    private static final int CFD_DISK_OFFSET = 6;
    private static final int CFD_LENGTH_OFFSET = 12;
    private static final int CFD_LOCATOR_RELATIVE_OFFSET = 8;
    private static final int CFH_LEN = 42;
    private static final long CFH_SIG = 0;
    private static final java.lang.String DEFAULT_CHARSET_NAME = null;
    private static final int HASH_SIZE = 509;
    private static final long LFH_OFFSET_FOR_FILENAME_LENGTH = 26;
    private static final int MAX_EOCD_SIZE = 65557;
    static final int MIN_EOCD_SIZE = 22;
    static final int NIBLET_MASK = 15;
    private static final byte[] ONE_ZERO_BYTE = null;
    private static final int POS_0 = 0;
    private static final int POS_1 = 1;
    private static final int POS_2 = 2;
    private static final int POS_3 = 3;
    private static final java.util.EnumSet<java.nio.file.StandardOpenOption> READ = null;
    private static final int ZIP64_EOCDL_LENGTH = 20;
    private static final int ZIP64_EOCDL_LOCATOR_OFFSET = 8;
    private static final int ZIP64_EOCD_CFD_DISK_OFFSET = 20;
    private static final int ZIP64_EOCD_CFD_LOCATOR_OFFSET = 48;
    private static final int ZIP64_EOCD_CFD_LOCATOR_RELATIVE_OFFSET = 24;
    private static final java.util.Comparator<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> offsetComparator = null;
    private final java.nio.channels.SeekableByteChannel archive;
    private long centralDirectoryStartDiskNumber;
    private long centralDirectoryStartOffset;
    private long centralDirectoryStartRelativeOffset;
    private final java.nio.ByteBuffer cfhBbuf;
    private final byte[] cfhBuf;
    private volatile boolean closed;
    private final java.nio.ByteBuffer dwordBbuf;
    private final byte[] dwordBuf;
    private final java.nio.charset.Charset encoding;
    private final java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> entries;
    private long firstLocalFileHeaderOffset;
    private final boolean isSplitZipArchive;
    private final java.util.Map<java.lang.String, java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry>> nameMap;
    private final java.nio.ByteBuffer shortBbuf;
    private final byte[] shortBuf;
    private final boolean useUnicodeExtraFields;
    private final java.nio.ByteBuffer wordBbuf;
    private final byte[] wordBuf;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;


    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.ZipFile$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod = null;

        static {
                org.apache.commons.compress.archivers.zip.ZipMethod[] r0 = org.apache.commons.compress.archivers.zip.ZipMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod = r0
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.STORED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L33
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.DEFLATED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L3e
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L49
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L54
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.AES_ENCRYPTED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L60
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L6c
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_2     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L78
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_3     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L84
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_4     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L90
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.JPEG     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L9c
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.LZMA     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> La8
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> Lb4
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.PPMD     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> Lc0
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.TOKENIZATION     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> Lcc
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> Ld8
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> Le4
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.XZ     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                return
        }
    }

    private static class BoundedFileChannelInputStream extends org.apache.commons.compress.utils.BoundedArchiveInputStream {
        private final java.nio.channels.FileChannel archive;

        BoundedFileChannelInputStream(long r1, long r3, java.nio.channels.FileChannel r5) {
                r0 = this;
                r0.<init>(r1, r3)
                r0.archive = r5
                return
        }

        @Override // org.apache.commons.compress.utils.BoundedArchiveInputStream
        protected int read(long r2, java.nio.ByteBuffer r4) throws java.io.IOException {
                r1 = this;
                java.nio.channels.FileChannel r0 = r1.archive
                int r2 = r0.read(r4, r2)
                r4.flip()
                return r2
        }
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.compress.archivers.zip.ZipFile, org.apache.commons.compress.archivers.zip.ZipFile.Builder> {
        static final java.nio.charset.Charset DEFAULT_CHARSET = null;
        private boolean ignoreLocalFileHeader;
        private long maxNumberOfDisks;
        private java.nio.channels.SeekableByteChannel seekableByteChannel;
        private boolean useUnicodeExtraFields;

        static {
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                org.apache.commons.compress.archivers.zip.ZipFile.Builder.DEFAULT_CHARSET = r0
                return
        }

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.useUnicodeExtraFields = r0
                r0 = 1
                r2.maxNumberOfDisks = r0
                java.nio.charset.Charset r0 = org.apache.commons.compress.archivers.zip.ZipFile.Builder.DEFAULT_CHARSET
                r2.setCharset(r0)
                r2.setCharsetDefault(r0)
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.compress.archivers.zip.ZipFile r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.compress.archivers.zip.ZipFile get() throws java.io.IOException {
                r12 = this;
                java.nio.channels.SeekableByteChannel r0 = r12.seekableByteChannel
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L11
                java.lang.Class r3 = r0.getClass()
                java.lang.String r3 = r3.getSimpleName()
            Le:
                r5 = r0
                r6 = r3
                goto L4b
            L11:
                org.apache.commons.io.build.AbstractOrigin r0 = r12.checkOrigin()
                boolean r0 = r0 instanceof org.apache.commons.io.build.AbstractOrigin.ByteArrayOrigin
                if (r0 == 0) goto L2f
                org.apache.commons.compress.utils.SeekableInMemoryByteChannel r0 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel
                org.apache.commons.io.build.AbstractOrigin r3 = r12.checkOrigin()
                byte[] r3 = r3.getByteArray()
                r0.<init>(r3)
                java.lang.Class r3 = r0.getClass()
                java.lang.String r3 = r3.getSimpleName()
                goto Le
            L2f:
                java.nio.file.OpenOption[] r0 = r12.getOpenOptions()
                int r3 = r0.length
                if (r3 != 0) goto L3c
                java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r2]
                java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.READ
                r0[r1] = r3
            L3c:
                java.nio.file.Path r3 = r12.getPath()
                long r4 = r12.maxNumberOfDisks
                java.nio.channels.SeekableByteChannel r0 = org.apache.commons.compress.archivers.zip.ZipFile.access$000(r3, r4, r0)
                java.lang.String r3 = r3.toString()
                goto Le
            L4b:
                java.nio.channels.SeekableByteChannel r0 = r12.seekableByteChannel
                if (r0 == 0) goto L51
                r9 = r2
                goto L52
            L51:
                r9 = r1
            L52:
                org.apache.commons.compress.archivers.zip.ZipFile r0 = new org.apache.commons.compress.archivers.zip.ZipFile
                java.nio.charset.Charset r7 = r12.getCharset()
                boolean r8 = r12.useUnicodeExtraFields
                boolean r10 = r12.ignoreLocalFileHeader
                r11 = 0
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return r0
        }

        public org.apache.commons.compress.archivers.zip.ZipFile.Builder setIgnoreLocalFileHeader(boolean r1) {
                r0 = this;
                r0.ignoreLocalFileHeader = r1
                return r0
        }

        public org.apache.commons.compress.archivers.zip.ZipFile.Builder setMaxNumberOfDisks(long r1) {
                r0 = this;
                r0.maxNumberOfDisks = r1
                return r0
        }

        public org.apache.commons.compress.archivers.zip.ZipFile.Builder setSeekableByteChannel(java.nio.channels.SeekableByteChannel r1) {
                r0 = this;
                r0.seekableByteChannel = r1
                return r0
        }

        public org.apache.commons.compress.archivers.zip.ZipFile.Builder setUseUnicodeExtraFields(boolean r1) {
                r0 = this;
                r0.useUnicodeExtraFields = r1
                return r0
        }
    }

    private static final class Entry extends org.apache.commons.compress.archivers.zip.ZipArchiveEntry {
        private Entry() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Entry(org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry
        public boolean equals(java.lang.Object r7) {
                r6 = this;
                boolean r0 = super.equals(r7)
                r1 = 0
                if (r0 == 0) goto L2e
                org.apache.commons.compress.archivers.zip.ZipFile$Entry r7 = (org.apache.commons.compress.archivers.zip.ZipFile.Entry) r7
                long r2 = r6.getLocalHeaderOffset()
                long r4 = r7.getLocalHeaderOffset()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L2e
                long r2 = super.getDataOffset()
                long r4 = r7.getDataOffset()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L2e
                long r2 = super.getDiskNumberStart()
                long r4 = r7.getDiskNumberStart()
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L2e
                r1 = 1
            L2e:
                return r1
        }

        @Override // org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.util.zip.ZipEntry
        public int hashCode() {
                r4 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 3
                long r1 = r4.getLocalHeaderOffset()
                int r1 = (int) r1
                int r0 = r0 + r1
                long r1 = r4.getLocalHeaderOffset()
                r3 = 32
                long r1 = r1 >> r3
                int r1 = (int) r1
                int r0 = r0 + r1
                return r0
        }
    }

    private static final class NameAndComment {
        private final byte[] comment;
        private final byte[] name;

        private NameAndComment(byte[] r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.comment = r2
                return
        }

        /* synthetic */ NameAndComment(byte[] r1, byte[] r2, org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ byte[] access$400(org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment r0) {
                byte[] r0 = r0.name
                return r0
        }

        static /* synthetic */ byte[] access$500(org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment r0) {
                byte[] r0 = r0.comment
                return r0
        }
    }

    private static final class StoredStatisticsStream extends org.apache.commons.io.input.BoundedInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
        StoredStatisticsStream(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.commons.compress.utils.InputStreamStatistics
        public long getCompressedCount() {
                r2 = this;
                long r0 = super.getCount()
                return r0
        }

        @Override // org.apache.commons.compress.utils.InputStreamStatistics
        public long getUncompressedCount() {
                r2 = this;
                long r0 = r2.getCompressedCount()
                return r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$QPYilrdLVwitq3C8vNVra-Jw6mQ, reason: not valid java name */
    public static /* synthetic */ void m2545$r8$lambda$QPYilrdLVwitq3C8vNVraJw6mQ(java.io.Closeable r0) {
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            return
    }

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.name()
            org.apache.commons.compress.archivers.zip.ZipFile.DEFAULT_CHARSET_NAME = r0
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.READ
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            org.apache.commons.compress.archivers.zip.ZipFile.READ = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.archivers.zip.ZipFile.ONE_ZERO_BYTE = r0
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CFH_SIG
            long r0 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r0)
            org.apache.commons.compress.archivers.zip.ZipFile.CFH_SIG = r0
            org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda4 r0 = new org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda4
            r0.<init>()
            java.util.Comparator r0 = java.util.Comparator.comparingLong(r0)
            org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda5 r1 = new org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda5
            r1.<init>()
            java.util.Comparator r0 = r0.thenComparingLong(r1)
            org.apache.commons.compress.archivers.zip.ZipFile.offsetComparator = r0
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.io.File r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = org.apache.commons.compress.archivers.zip.ZipFile.DEFAULT_CHARSET_NAME
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r2 = r2.toPath()
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.io.File r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r2 = r2.toPath()
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.io.File r9, java.lang.String r10, boolean r11, boolean r12) throws java.io.IOException {
            r8 = this;
            java.nio.file.Path r0 = r9.toPath()
            java.nio.channels.SeekableByteChannel r2 = newReadByteChannel(r0)
            java.lang.String r3 = r9.getAbsolutePath()
            r6 = 1
            r1 = r8
            r4 = r10
            r5 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.nio.file.Path r2 = r0.toPath()
            java.lang.String r0 = org.apache.commons.compress.archivers.zip.ZipFile.DEFAULT_CHARSET_NAME
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.nio.file.Path r2 = r0.toPath()
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.channels.SeekableByteChannel r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = org.apache.commons.compress.archivers.zip.ZipFile.DEFAULT_CHARSET_NAME
            r1 = 1
            java.lang.String r2 = "a SeekableByteChannel"
            r3.<init>(r4, r2, r0, r1)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.channels.SeekableByteChannel r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "a SeekableByteChannel"
            r1 = 1
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.channels.SeekableByteChannel r8, java.lang.String r9, java.lang.String r10, boolean r11) throws java.io.IOException {
            r7 = this;
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.channels.SeekableByteChannel r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) throws java.io.IOException {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private ZipFile(java.nio.channels.SeekableByteChannel r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, boolean r13) throws java.io.IOException {
            r7 = this;
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r10)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private ZipFile(java.nio.channels.SeekableByteChannel r7, java.lang.String r8, java.nio.charset.Charset r9, boolean r10, boolean r11, boolean r12) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "Error reading Zip content from "
            r6.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r6.entries = r1
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 509(0x1fd, float:7.13E-43)
            r1.<init>(r2)
            r6.nameMap = r1
            r1 = 1
            r6.closed = r1
            r2 = 8
            byte[] r2 = new byte[r2]
            r6.dwordBuf = r2
            r3 = 4
            byte[] r3 = new byte[r3]
            r6.wordBuf = r3
            r4 = 42
            byte[] r4 = new byte[r4]
            r6.cfhBuf = r4
            r5 = 2
            byte[] r5 = new byte[r5]
            r6.shortBuf = r5
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r6.dwordBbuf = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r3)
            r6.wordBbuf = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4)
            r6.cfhBbuf = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r5)
            r6.shortBbuf = r2
            boolean r2 = r7 instanceof org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel
            r6.isSplitZipArchive = r2
            java.nio.charset.Charset r2 = org.apache.commons.compress.archivers.zip.ZipFile.Builder.DEFAULT_CHARSET
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r9, r2)
            r6.encoding = r2
            org.apache.commons.compress.archivers.zip.ZipEncoding r9 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r9)
            r6.zipEncoding = r9
            r6.useUnicodeExtraFields = r10
            r6.archive = r7
            java.util.Map r7 = r6.populateFromCentralDirectory()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            if (r12 != 0) goto L65
            r6.resolveLocalFileHeaderData(r7)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L65:
            r6.fillNameMap()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r7 = 0
            r6.closed = r7
            return
        L6c:
            r7 = move-exception
            goto L82
        L6e:
            r7 = move-exception
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r8 = r10.append(r8)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r8, r7)     // Catch: java.lang.Throwable -> L6c
            throw r9     // Catch: java.lang.Throwable -> L6c
        L82:
            r6.closed = r1
            if (r11 == 0) goto L8b
            java.nio.channels.SeekableByteChannel r8 = r6.archive
            org.apache.commons.io.IOUtils.closeQuietly(r8)
        L8b:
            throw r7
    }

    /* synthetic */ ZipFile(java.nio.channels.SeekableByteChannel r1, java.lang.String r2, java.nio.charset.Charset r3, boolean r4, boolean r5, boolean r6, org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass1 r7) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.file.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = org.apache.commons.compress.archivers.zip.ZipFile.DEFAULT_CHARSET_NAME
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.file.Path r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.file.Path r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public ZipFile(java.nio.file.Path r8, java.lang.String r9, boolean r10, boolean r11) throws java.io.IOException {
            r7 = this;
            java.nio.channels.SeekableByteChannel r1 = newReadByteChannel(r8)
            java.nio.file.Path r8 = r8.toAbsolutePath()
            java.lang.String r2 = r8.toString()
            r5 = 1
            r0 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ java.nio.channels.SeekableByteChannel access$000(java.nio.file.Path r0, long r1, java.nio.file.OpenOption[] r3) throws java.io.IOException {
            java.nio.channels.SeekableByteChannel r0 = openZipChannel(r0, r1, r3)
            return r0
    }

    public static org.apache.commons.compress.archivers.zip.ZipFile.Builder builder() {
            org.apache.commons.compress.archivers.zip.ZipFile$Builder r0 = new org.apache.commons.compress.archivers.zip.ZipFile$Builder
            r0.<init>()
            return r0
    }

    public static void closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile r0) {
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            return
    }

    private org.apache.commons.compress.utils.BoundedArchiveInputStream createBoundedInputStream(long r8, long r10) {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L2f
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L2f
            long r0 = r8 + r10
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L2f
            java.nio.channels.SeekableByteChannel r0 = r7.archive
            boolean r0 = r0 instanceof java.nio.channels.FileChannel
            if (r0 == 0) goto L24
            org.apache.commons.compress.archivers.zip.ZipFile$BoundedFileChannelInputStream r6 = new org.apache.commons.compress.archivers.zip.ZipFile$BoundedFileChannelInputStream
            java.nio.channels.SeekableByteChannel r0 = r7.archive
            r5 = r0
            java.nio.channels.FileChannel r5 = (java.nio.channels.FileChannel) r5
            r0 = r6
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r5)
            goto L2e
        L24:
            org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream r6 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream
            java.nio.channels.SeekableByteChannel r5 = r7.archive
            r0 = r6
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r5)
        L2e:
            return r6
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Corrupted archive, stream boundaries are out of range"
            r0.<init>(r1)
            throw r0
    }

    private void fillNameMap() {
            r2 = this;
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r2.entries
            org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda1 r1 = new org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.forEach(r1)
            return
    }

    private long getDataOffset(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5) throws java.io.IOException {
            r4 = this;
            long r0 = r5.getDataOffset()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L11
            r4.setDataOffset(r5)
            long r0 = r5.getDataOffset()
        L11:
            return r0
    }

    static /* synthetic */ java.util.LinkedList lambda$fillNameMap$1(java.lang.String r0) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
    }

    static /* synthetic */ java.nio.file.Path lambda$openZipChannel$0(long r4, java.nio.file.Path r6, java.nio.file.Path r7, java.lang.String r8, int r9) {
            long r0 = (long) r9
            r2 = 1
            long r4 = r4 - r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L9
            return r6
        L9:
            int r9 = r9 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r4 = new java.lang.Object[]{r8, r4}
            java.lang.String r5 = "%s.z%02d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.nio.file.Path r4 = r7.resolve(r4)
            r5 = 0
            java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[r5]
            boolean r6 = java.nio.file.Files.exists(r4, r6)
            if (r6 == 0) goto L27
            return r4
        L27:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}
            java.lang.String r8 = "%s.Z%02d"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            java.nio.file.Path r6 = r7.resolve(r6)
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r5]
            boolean r5 = java.nio.file.Files.exists(r6, r5)
            if (r5 == 0) goto L42
            return r6
        L42:
            return r4
    }

    private static java.nio.channels.SeekableByteChannel newReadByteChannel(java.nio.file.Path r2) throws java.io.IOException {
            java.util.EnumSet<java.nio.file.StandardOpenOption> r0 = org.apache.commons.compress.archivers.zip.ZipFile.READ
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]
            java.nio.channels.SeekableByteChannel r2 = java.nio.file.Files.newByteChannel(r2, r0, r1)
            return r2
    }

    private static java.nio.channels.SeekableByteChannel openZipChannel(java.nio.file.Path r16, long r17, java.nio.file.OpenOption[] r19) throws java.io.IOException {
            r0 = r17
            java.lang.String r2 = "Too many disks for zip archive, max="
            r3 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r3]
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.READ
            r6 = 0
            r4[r6] = r5
            r5 = r16
            java.nio.channels.FileChannel r4 = java.nio.channels.FileChannel.open(r5, r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r7 = positionAtEndOfCentralDirectoryRecord(r4)     // Catch: java.lang.Throwable -> Ld1
            if (r7 == 0) goto L43
            long r7 = r4.position()     // Catch: java.lang.Throwable -> Ld1
            r9 = 16
            long r7 = r7 + r9
            r4.position(r7)     // Catch: java.lang.Throwable -> Ld1
            r3 = 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> Ld1
            r3.order(r7)     // Catch: java.lang.Throwable -> Ld1
            org.apache.commons.compress.utils.IOUtils.readFully(r4, r3)     // Catch: java.lang.Throwable -> Ld1
            r3.flip()     // Catch: java.lang.Throwable -> Ld1
            int r3 = r3.getInt()     // Catch: java.lang.Throwable -> Ld1
            long r7 = (long) r3     // Catch: java.lang.Throwable -> Ld1
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            goto L67
        L43:
            long r7 = r4.position()     // Catch: java.lang.Throwable -> Ld1
            r9 = 4
            long r7 = r7 + r9
            r4.position(r7)     // Catch: java.lang.Throwable -> Ld1
            r7 = 2
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)     // Catch: java.lang.Throwable -> Ld1
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> Ld1
            r7.order(r8)     // Catch: java.lang.Throwable -> Ld1
            org.apache.commons.compress.utils.IOUtils.readFully(r4, r7)     // Catch: java.lang.Throwable -> Ld1
            r7.flip()     // Catch: java.lang.Throwable -> Ld1
            short r7 = r7.getShort()     // Catch: java.lang.Throwable -> Ld1
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            int r7 = r7 + r3
            long r7 = (long) r7     // Catch: java.lang.Throwable -> Ld1
        L67:
            r8 = r7
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r14 = java.lang.Math.min(r0, r10)     // Catch: java.lang.Throwable -> Ld1
            int r3 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r3 > 0) goto Lb0
            r0 = 1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L7a
            return r4
        L7a:
            r4.close()     // Catch: java.lang.Throwable -> Ld1
            java.nio.file.Path r11 = r16.getParent()     // Catch: java.lang.Throwable -> Ld1
            java.nio.file.Path r0 = r16.getFileName()     // Catch: java.lang.Throwable -> Ld1
            r1 = 0
            java.lang.String r0 = java.util.Objects.toString(r0, r1)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r12 = org.apache.commons.io.FilenameUtils.removeExtension(r0)     // Catch: java.lang.Throwable -> Ld1
            int r0 = (int) r8     // Catch: java.lang.Throwable -> Ld1
            java.util.stream.IntStream r0 = java.util.stream.IntStream.range(r6, r0)     // Catch: java.lang.Throwable -> Ld1
            org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> Ld1
            r7 = r1
            r10 = r16
            r7.<init>(r8, r10, r11, r12)     // Catch: java.lang.Throwable -> Ld1
            java.util.stream.Stream r0 = r0.mapToObj(r1)     // Catch: java.lang.Throwable -> Ld1
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r0 = r0.collect(r1)     // Catch: java.lang.Throwable -> Ld1
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Ld1
            r1 = r19
            java.nio.channels.SeekableByteChannel r0 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forPaths(r0, r1)     // Catch: java.lang.Throwable -> Ld1
            return r0
        Lb0:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Ld1
            long r0 = java.lang.Math.min(r0, r10)     // Catch: java.lang.Throwable -> Ld1
            java.lang.StringBuilder r0 = r5.append(r0)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = " actual="
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Ld1
            java.lang.StringBuilder r0 = r0.append(r8)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld1
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r3     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r0 = move-exception
            org.apache.commons.io.IOUtils.closeQuietly(r4)
            org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda3 r1 = new org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda3
            r1.<init>()
            r13.forEach(r1)
            throw r0
    }

    private java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment> populateFromCentralDirectory() throws java.io.IOException {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.positionAtCentralDirectory()
            java.nio.channels.SeekableByteChannel r1 = r5.archive
            long r1 = r1.position()
            r5.centralDirectoryStartOffset = r1
            java.nio.ByteBuffer r1 = r5.wordBbuf
            r1.rewind()
            java.nio.channels.SeekableByteChannel r1 = r5.archive
            java.nio.ByteBuffer r2 = r5.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r1, r2)
            byte[] r1 = r5.wordBuf
            long r1 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r1)
            long r3 = org.apache.commons.compress.archivers.zip.ZipFile.CFH_SIG
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L37
            boolean r3 = r5.startsWithLocalFileHeader()
            if (r3 != 0) goto L2f
            goto L37
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Central directory is empty, can't expand corrupt archive."
            r0.<init>(r1)
            throw r0
        L37:
            long r3 = org.apache.commons.compress.archivers.zip.ZipFile.CFH_SIG
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L53
            r5.readCentralDirectoryEntry(r0)
            java.nio.ByteBuffer r1 = r5.wordBbuf
            r1.rewind()
            java.nio.channels.SeekableByteChannel r1 = r5.archive
            java.nio.ByteBuffer r2 = r5.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r1, r2)
            byte[] r1 = r5.wordBuf
            long r1 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r1)
            goto L37
        L53:
            return r0
    }

    private void positionAtCentralDirectory() throws java.io.IOException {
            r1 = this;
            java.nio.channels.SeekableByteChannel r0 = r1.archive
            boolean r0 = positionAtEndOfCentralDirectoryRecord(r0)
            if (r0 != 0) goto Lc
            r1.positionAtCentralDirectory32()
            goto Lf
        Lc:
            r1.positionAtCentralDirectory64()
        Lf:
            return
    }

    private void positionAtCentralDirectory32() throws java.io.IOException {
            r8 = this;
            java.nio.channels.SeekableByteChannel r0 = r8.archive
            long r0 = r0.position()
            boolean r2 = r8.isSplitZipArchive
            if (r2 == 0) goto L46
            r0 = 6
            r8.skipBytes(r0)
            java.nio.ByteBuffer r0 = r8.shortBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r8.archive
            java.nio.ByteBuffer r1 = r8.shortBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            byte[] r0 = r8.shortBuf
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r0)
            long r0 = (long) r0
            r8.centralDirectoryStartDiskNumber = r0
            r0 = 8
            r8.skipBytes(r0)
            java.nio.ByteBuffer r0 = r8.wordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r8.archive
            java.nio.ByteBuffer r1 = r8.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            byte[] r0 = r8.wordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r0)
            r8.centralDirectoryStartRelativeOffset = r0
            java.nio.channels.SeekableByteChannel r2 = r8.archive
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel r2 = (org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel) r2
            long r3 = r8.centralDirectoryStartDiskNumber
            r2.position(r3, r0)
            goto L85
        L46:
            r2 = 12
            r8.skipBytes(r2)
            java.nio.ByteBuffer r2 = r8.wordBbuf
            r2.rewind()
            java.nio.channels.SeekableByteChannel r2 = r8.archive
            java.nio.ByteBuffer r3 = r8.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r2, r3)
            byte[] r2 = r8.wordBuf
            long r2 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r2)
            java.nio.ByteBuffer r4 = r8.wordBbuf
            r4.rewind()
            java.nio.channels.SeekableByteChannel r4 = r8.archive
            java.nio.ByteBuffer r5 = r8.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r4, r5)
            r4 = 0
            r8.centralDirectoryStartDiskNumber = r4
            byte[] r6 = r8.wordBuf
            long r6 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r6)
            r8.centralDirectoryStartRelativeOffset = r6
            long r0 = r0 - r2
            long r0 = r0 - r6
            long r0 = java.lang.Long.max(r0, r4)
            r8.firstLocalFileHeaderOffset = r0
            java.nio.channels.SeekableByteChannel r2 = r8.archive
            long r3 = r8.centralDirectoryStartRelativeOffset
            long r3 = r3 + r0
            r2.position(r3)
        L85:
            return
    }

    private void positionAtCentralDirectory64() throws java.io.IOException {
            r5 = this;
            r0 = 4
            r5.skipBytes(r0)
            boolean r1 = r5.isSplitZipArchive
            if (r1 == 0) goto L34
            java.nio.ByteBuffer r0 = r5.wordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            java.nio.ByteBuffer r1 = r5.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            byte[] r0 = r5.wordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r0)
            java.nio.ByteBuffer r2 = r5.dwordBbuf
            r2.rewind()
            java.nio.channels.SeekableByteChannel r2 = r5.archive
            java.nio.ByteBuffer r3 = r5.dwordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r2, r3)
            byte[] r2 = r5.dwordBuf
            long r2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(r2)
            java.nio.channels.SeekableByteChannel r4 = r5.archive
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel r4 = (org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel) r4
            r4.position(r0, r2)
            goto L4e
        L34:
            r5.skipBytes(r0)
            java.nio.ByteBuffer r0 = r5.dwordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            java.nio.ByteBuffer r1 = r5.dwordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            byte[] r1 = r5.dwordBuf
            long r1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(r1)
            r0.position(r1)
        L4e:
            java.nio.ByteBuffer r0 = r5.wordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            java.nio.ByteBuffer r1 = r5.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            byte[] r0 = r5.wordBuf
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto Lc7
            boolean r0 = r5.isSplitZipArchive
            if (r0 == 0) goto La4
            r0 = 16
            r5.skipBytes(r0)
            java.nio.ByteBuffer r0 = r5.wordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            java.nio.ByteBuffer r1 = r5.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            byte[] r0 = r5.wordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r0)
            r5.centralDirectoryStartDiskNumber = r0
            r0 = 24
            r5.skipBytes(r0)
            java.nio.ByteBuffer r0 = r5.dwordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            java.nio.ByteBuffer r1 = r5.dwordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            byte[] r0 = r5.dwordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(r0)
            r5.centralDirectoryStartRelativeOffset = r0
            java.nio.channels.SeekableByteChannel r2 = r5.archive
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel r2 = (org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel) r2
            long r3 = r5.centralDirectoryStartDiskNumber
            r2.position(r3, r0)
            goto Lc6
        La4:
            r0 = 44
            r5.skipBytes(r0)
            java.nio.ByteBuffer r0 = r5.dwordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            java.nio.ByteBuffer r1 = r5.dwordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            r0 = 0
            r5.centralDirectoryStartDiskNumber = r0
            byte[] r0 = r5.dwordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(r0)
            r5.centralDirectoryStartRelativeOffset = r0
            java.nio.channels.SeekableByteChannel r2 = r5.archive
            r2.position(r0)
        Lc6:
            return
        Lc7:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "Archive's ZIP64 end of central directory locator is corrupt."
            r0.<init>(r1)
            throw r0
    }

    private static boolean positionAtEndOfCentralDirectoryRecord(java.nio.channels.SeekableByteChannel r7) throws java.io.IOException {
            r3 = 65557(0x10015, double:3.23895E-319)
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG
            r1 = 22
            r0 = r7
            boolean r0 = tryToLocateSignature(r0, r1, r3, r5)
            if (r0 == 0) goto L4b
            long r0 = r7.position()
            r2 = 20
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L49
            r4 = 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            long r5 = r7.position()
            long r5 = r5 - r2
            r7.position(r5)
            r4.rewind()
            org.apache.commons.compress.utils.IOUtils.readFully(r7, r4)
            r4.flip()
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L3e
            r7.position(r0)
            goto L4a
        L3e:
            long r0 = r7.position()
            r3 = 4
            long r0 = r0 - r3
            r7.position(r0)
            goto L4a
        L49:
            r2 = 0
        L4a:
            return r2
        L4b:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.String r0 = "Archive is not a ZIP archive"
            r7.<init>(r0)
            throw r7
    }

    private void readCentralDirectoryEntry(java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment> r13) throws java.io.IOException {
            r12 = this;
            java.nio.ByteBuffer r0 = r12.cfhBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r12.archive
            java.nio.ByteBuffer r1 = r12.cfhBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            org.apache.commons.compress.archivers.zip.ZipFile$Entry r0 = new org.apache.commons.compress.archivers.zip.ZipFile$Entry
            r1 = 0
            r0.<init>(r1)
            byte[] r2 = r12.cfhBuf
            r3 = 0
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r2, r3)
            r0.setVersionMadeBy(r2)
            r3 = 8
            int r2 = r2 >> r3
            r2 = r2 & 15
            r0.setPlatform(r2)
            byte[] r2 = r12.cfhBuf
            r4 = 2
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r2, r4)
            r0.setVersionRequired(r2)
            byte[] r2 = r12.cfhBuf
            r4 = 4
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r2 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(r2, r4)
            boolean r5 = r2.usesUTF8ForNames()
            if (r5 == 0) goto L3e
            org.apache.commons.compress.archivers.zip.ZipEncoding r6 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.ZIP_ENCODING_UTF_8
            goto L40
        L3e:
            org.apache.commons.compress.archivers.zip.ZipEncoding r6 = r12.zipEncoding
        L40:
            if (r5 == 0) goto L47
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG
            r0.setNameSource(r7)
        L47:
            r0.setGeneralPurposeBit(r2)
            byte[] r2 = r12.cfhBuf
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r2, r4)
            r0.setRawFlag(r2)
            r2 = 6
            byte[] r4 = r12.cfhBuf
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r4, r2)
            r0.setMethod(r2)
            byte[] r2 = r12.cfhBuf
            long r2 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r2, r3)
            long r2 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(r2)
            r0.setTime(r2)
            r2 = 12
            byte[] r3 = r12.cfhBuf
            long r2 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r3, r2)
            r0.setCrc(r2)
            r2 = 16
            byte[] r3 = r12.cfhBuf
            long r2 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r3, r2)
            r7 = 0
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L17c
            r0.setCompressedSize(r2)
            r2 = 20
            byte[] r3 = r12.cfhBuf
            long r2 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r3, r2)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L174
            r0.setSize(r2)
            r2 = 24
            byte[] r3 = r12.cfhBuf
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r3, r2)
            if (r2 < 0) goto L16c
            byte[] r3 = r12.cfhBuf
            r4 = 26
            int r3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r3, r4)
            if (r3 < 0) goto L164
            byte[] r4 = r12.cfhBuf
            r7 = 28
            int r4 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r4, r7)
            if (r4 < 0) goto L15c
            byte[] r7 = r12.cfhBuf
            r8 = 30
            int r7 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r7, r8)
            long r7 = (long) r7
            r0.setDiskNumberStart(r7)
            r7 = 32
            byte[] r8 = r12.cfhBuf
            int r7 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r8, r7)
            r0.setInternalAttributes(r7)
            r7 = 34
            byte[] r8 = r12.cfhBuf
            long r7 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r8, r7)
            r0.setExternalAttributes(r7)
            java.nio.channels.SeekableByteChannel r7 = r12.archive
            byte[] r7 = org.apache.commons.compress.utils.IOUtils.readRange(r7, r2)
            int r8 = r7.length
            if (r8 < r2) goto L156
            java.lang.String r2 = r6.decode(r7)
            r0.setName(r2, r7)
            byte[] r2 = r12.cfhBuf
            r8 = 38
            long r8 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r2, r8)
            long r10 = r12.firstLocalFileHeaderOffset
            long r8 = r8 + r10
            r0.setLocalHeaderOffset(r8)
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r2 = r12.entries
            r2.add(r0)
            java.nio.channels.SeekableByteChannel r2 = r12.archive
            byte[] r2 = org.apache.commons.compress.utils.IOUtils.readRange(r2, r3)
            int r8 = r2.length
            if (r8 < r3) goto L150
            r0.setCentralDirectoryExtra(r2)     // Catch: java.lang.RuntimeException -> L133
            r12.setSizesAndOffsetFromZip64Extra(r0)
            r12.sanityCheckLFHOffset(r0)
            java.nio.channels.SeekableByteChannel r2 = r12.archive
            byte[] r2 = org.apache.commons.compress.utils.IOUtils.readRange(r2, r4)
            int r3 = r2.length
            if (r3 < r4) goto L12d
            java.lang.String r3 = r6.decode(r2)
            r0.setComment(r3)
            if (r5 != 0) goto L128
            boolean r3 = r12.useUnicodeExtraFields
            if (r3 == 0) goto L128
            org.apache.commons.compress.archivers.zip.ZipFile$NameAndComment r3 = new org.apache.commons.compress.archivers.zip.ZipFile$NameAndComment
            r3.<init>(r7, r2, r1)
            r13.put(r0, r3)
        L128:
            r13 = 1
            r0.setStreamContiguous(r13)
            return
        L12d:
            java.io.EOFException r13 = new java.io.EOFException
            r13.<init>()
            throw r13
        L133:
            r13 = move-exception
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid extra data in entry "
            r2.<init>(r3)
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            r1.initCause(r13)
            throw r1
        L150:
            java.io.EOFException r13 = new java.io.EOFException
            r13.<init>()
            throw r13
        L156:
            java.io.EOFException r13 = new java.io.EOFException
            r13.<init>()
            throw r13
        L15c:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative commentLen"
            r13.<init>(r0)
            throw r13
        L164:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative extraLen"
            r13.<init>(r0)
            throw r13
        L16c:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative fileNameLen"
            r13.<init>(r0)
            throw r13
        L174:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative size"
            r13.<init>(r0)
            throw r13
        L17c:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative compressed size"
            r13.<init>(r0)
            throw r13
    }

    private void resolveLocalFileHeaderData(java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment> r6) throws java.io.IOException {
            r5 = this;
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r5.entries
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r1
            org.apache.commons.compress.archivers.zip.ZipFile$Entry r1 = (org.apache.commons.compress.archivers.zip.ZipFile.Entry) r1
            int[] r2 = r5.setDataOffset(r1)
            r3 = 0
            r3 = r2[r3]
            r4 = 1
            r2 = r2[r4]
            r5.skipBytes(r3)
            java.nio.channels.SeekableByteChannel r3 = r5.archive
            byte[] r3 = org.apache.commons.compress.utils.IOUtils.readRange(r3, r2)
            int r4 = r3.length
            if (r4 < r2) goto L62
            r1.setExtra(r3)     // Catch: java.lang.RuntimeException -> L45
            boolean r2 = r6.containsKey(r1)
            if (r2 == 0) goto L6
            java.lang.Object r2 = r6.get(r1)
            org.apache.commons.compress.archivers.zip.ZipFile$NameAndComment r2 = (org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment) r2
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.access$400(r2)
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.access$500(r2)
            org.apache.commons.compress.archivers.zip.ZipUtil.setNameAndCommentFromExtraFields(r1, r3, r2)
            goto L6
        L45:
            r6 = move-exception
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid extra data in entry "
            r2.<init>(r3)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0.initCause(r6)
            throw r0
        L62:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L68:
            return
    }

    private void sanityCheckLFHOffset(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r8) throws java.io.IOException {
            r7 = this;
            long r0 = r8.getDiskNumberStart()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L9f
            long r0 = r8.getLocalHeaderOffset()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L97
            boolean r0 = r7.isSplitZipArchive
            java.lang.String r1 = " starts after central directory"
            java.lang.String r2 = "local file header for "
            if (r0 == 0) goto L71
            long r3 = r8.getDiskNumberStart()
            long r5 = r7.centralDirectoryStartDiskNumber
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L54
            long r3 = r8.getDiskNumberStart()
            long r5 = r7.centralDirectoryStartDiskNumber
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L7b
            long r3 = r8.getLocalHeaderOffset()
            long r5 = r7.centralDirectoryStartRelativeOffset
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L7b
        L39:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r3.append(r8)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L54:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r1 = " starts on a later disk than central directory"
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L71:
            long r3 = r8.getLocalHeaderOffset()
            long r5 = r7.centralDirectoryStartOffset
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L7c
        L7b:
            return
        L7c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r3.append(r8)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L97:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative local file header offset"
            r8.<init>(r0)
            throw r8
        L9f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative disk number"
            r8.<init>(r0)
            throw r8
    }

    private int[] setDataOffset(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r8) throws java.io.IOException {
            r7 = this;
            long r0 = r8.getLocalHeaderOffset()
            boolean r2 = r7.isSplitZipArchive
            r3 = 26
            if (r2 == 0) goto L1e
            java.nio.channels.SeekableByteChannel r2 = r7.archive
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel r2 = (org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel) r2
            long r5 = r8.getDiskNumberStart()
            long r0 = r0 + r3
            r2.position(r5, r0)
            java.nio.channels.SeekableByteChannel r0 = r7.archive
            long r0 = r0.position()
            long r0 = r0 - r3
            goto L24
        L1e:
            java.nio.channels.SeekableByteChannel r2 = r7.archive
            long r3 = r3 + r0
            r2.position(r3)
        L24:
            java.nio.ByteBuffer r2 = r7.wordBbuf
            r2.rewind()
            java.nio.channels.SeekableByteChannel r2 = r7.archive
            java.nio.ByteBuffer r3 = r7.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r2, r3)
            java.nio.ByteBuffer r2 = r7.wordBbuf
            r2.flip()
            java.nio.ByteBuffer r2 = r7.wordBbuf
            byte[] r3 = r7.shortBuf
            r2.get(r3)
            byte[] r2 = r7.shortBuf
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r2)
            java.nio.ByteBuffer r3 = r7.wordBbuf
            byte[] r4 = r7.shortBuf
            r3.get(r4)
            byte[] r3 = r7.shortBuf
            int r3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r3)
            r4 = 30
            long r0 = r0 + r4
            long r4 = (long) r2
            long r0 = r0 + r4
            long r4 = (long) r3
            long r0 = r0 + r4
            r8.setDataOffset(r0)
            long r0 = r8.getDataOffset()
            long r4 = r8.getCompressedSize()
            long r0 = r0 + r4
            long r4 = r7.centralDirectoryStartOffset
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L6d
            int[] r8 = new int[]{r2, r3}
            return r8
        L6d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "data for "
            r1.<init>(r2)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r1 = " overlaps with central directory."
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    private void setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r12) throws java.io.IOException {
            r11 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r12.getExtraField(r0)
            if (r0 == 0) goto L15
            boolean r1 = r0 instanceof org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField
            if (r1 == 0) goto Ld
            goto L15
        Ld:
            java.util.zip.ZipException r12 = new java.util.zip.ZipException
            java.lang.String r0 = "archive contains unparseable zip64 extra field"
            r12.<init>(r0)
            throw r12
        L15:
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField r0 = (org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField) r0
            if (r0 == 0) goto Lbd
            long r1 = r12.getSize()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r5 = 0
            if (r1 != 0) goto L2a
            r1 = r2
            goto L2b
        L2a:
            r1 = r5
        L2b:
            long r6 = r12.getCompressedSize()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto L35
            r6 = r2
            goto L36
        L35:
            r6 = r5
        L36:
            long r7 = r12.getLocalHeaderOffset()
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L40
            r3 = r2
            goto L41
        L40:
            r3 = r5
        L41:
            long r7 = r12.getDiskNumberStart()
            r9 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L4d
            goto L4e
        L4d:
            r2 = r5
        L4e:
            r0.reparseCentralDirectoryData(r1, r6, r3, r2)
            r4 = 0
            if (r1 == 0) goto L6d
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r7 = r0.getSize()
            long r7 = r7.getLongValue()
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 < 0) goto L65
            r12.setSize(r7)
            goto L7b
        L65:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative size"
            r12.<init>(r0)
            throw r12
        L6d:
            if (r6 == 0) goto L7b
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r8 = r12.getSize()
            r7.<init>(r8)
            r0.setSize(r7)
        L7b:
            if (r6 == 0) goto L95
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r0.getCompressedSize()
            long r6 = r1.getLongValue()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L8d
            r12.setCompressedSize(r6)
            goto La3
        L8d:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "broken archive, entry with negative compressed size"
            r12.<init>(r0)
            throw r12
        L95:
            if (r1 == 0) goto La3
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r4 = r12.getCompressedSize()
            r1.<init>(r4)
            r0.setCompressedSize(r1)
        La3:
            if (r3 == 0) goto Lb0
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r0.getRelativeHeaderOffset()
            long r3 = r1.getLongValue()
            r12.setLocalHeaderOffset(r3)
        Lb0:
            if (r2 == 0) goto Lbd
            org.apache.commons.compress.archivers.zip.ZipLong r0 = r0.getDiskStartNumber()
            long r0 = r0.getValue()
            r12.setDiskNumberStart(r0)
        Lbd:
            return
    }

    private void skipBytes(int r5) throws java.io.IOException {
            r4 = this;
            java.nio.channels.SeekableByteChannel r0 = r4.archive
            long r0 = r0.position()
            long r2 = (long) r5
            long r0 = r0 + r2
            java.nio.channels.SeekableByteChannel r5 = r4.archive
            long r2 = r5.size()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L18
            java.nio.channels.SeekableByteChannel r5 = r4.archive
            r5.position(r0)
            return
        L18:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
    }

    private org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] sortByOffset(org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r2) {
            r1 = this;
            java.util.Comparator<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = org.apache.commons.compress.archivers.zip.ZipFile.offsetComparator
            java.util.Arrays.sort(r2, r0)
            return r2
    }

    private boolean startsWithLocalFileHeader() throws java.io.IOException {
            r3 = this;
            java.nio.channels.SeekableByteChannel r0 = r3.archive
            long r1 = r3.firstLocalFileHeaderOffset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r3.wordBbuf
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r3.archive
            java.nio.ByteBuffer r1 = r3.wordBbuf
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            byte[] r0 = r3.wordBuf
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    private static boolean tryToLocateSignature(java.nio.channels.SeekableByteChannel r5, long r6, long r8, byte[] r10) throws java.io.IOException {
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long r1 = r5.size()
            long r1 = r1 - r6
            long r6 = r5.size()
            long r6 = r6 - r8
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r9 = 0
            if (r8 < 0) goto L53
        L1a:
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L53
            r5.position(r1)
            r0.rewind()     // Catch: java.io.EOFException -> L53
            org.apache.commons.compress.utils.IOUtils.readFully(r5, r0)     // Catch: java.io.EOFException -> L53
            r0.flip()     // Catch: java.io.EOFException -> L53
            byte r8 = r0.get()
            r3 = r10[r9]
            if (r8 != r3) goto L4f
            byte r8 = r0.get()
            r3 = 1
            r4 = r10[r3]
            if (r8 != r4) goto L4f
            byte r8 = r0.get()
            r4 = 2
            r4 = r10[r4]
            if (r8 != r4) goto L4f
            byte r8 = r0.get()
            r4 = 3
            r4 = r10[r4]
            if (r8 != r4) goto L4f
            r9 = r3
            goto L53
        L4f:
            r3 = 1
            long r1 = r1 - r3
            goto L1a
        L53:
            if (r9 == 0) goto L58
            r5.position(r1)
        L58:
            return r9
    }

    public boolean canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1) {
            r0 = this;
            boolean r1 = org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(r1)
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.closed = r0
            java.nio.channels.SeekableByteChannel r0 = r1.archive
            r0.close()
            return
    }

    public void copyRawEntries(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream r4, org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate r5) throws java.io.IOException {
            r3 = this;
            java.util.Enumeration r0 = r3.getEntriesInPhysicalOrder()
        L4:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.nextElement()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r1
            boolean r2 = r5.test(r1)
            if (r2 == 0) goto L4
            java.io.InputStream r2 = r3.getRawInputStream(r1)
            r4.addRawArchiveEntry(r1, r2)
            goto L4
        L1e:
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r1 = this;
            boolean r0 = r1.closed     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L7
            r1.close()     // Catch: java.lang.Throwable -> Lb
        L7:
            super.finalize()
            return
        Lb:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    public java.io.InputStream getContentBeforeFirstLocalFileHeader() {
            r5 = this;
            long r0 = r5.firstLocalFileHeaderOffset
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 0
            goto Le
        La:
            org.apache.commons.compress.utils.BoundedArchiveInputStream r0 = r5.createBoundedInputStream(r2, r0)
        Le:
            return r0
    }

    public java.lang.String getEncoding() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.encoding
            java.lang.String r0 = r0.name()
            return r0
    }

    public java.lang.Iterable<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> getEntries(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry>> r0 = r2.nameMap
            java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.EMPTY_LINKED_LIST
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            return r3
    }

    public java.util.Enumeration<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> getEntries() {
            r1 = this;
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r1.entries
            java.util.Enumeration r0 = java.util.Collections.enumeration(r0)
            return r0
    }

    public java.lang.Iterable<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> getEntriesInPhysicalOrder(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry>> r0 = r2.nameMap
            java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.EMPTY_LINKED_LIST
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.EMPTY_ARRAY
            java.lang.Object[] r3 = r3.toArray(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r3 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry[]) r3
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r3 = r2.sortByOffset(r3)
            java.util.List r3 = java.util.Arrays.asList(r3)
            return r3
    }

    public java.util.Enumeration<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> getEntriesInPhysicalOrder() {
            r2 = this;
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r2.entries
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.EMPTY_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r0 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry[]) r0
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry[] r0 = r2.sortByOffset(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Enumeration r0 = java.util.Collections.enumeration(r0)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry getEntry(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry>> r0 = r1.nameMap
            java.lang.Object r2 = r0.get(r2)
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            if (r2 == 0) goto L11
            java.lang.Object r2 = r2.getFirst()
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r2
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    public long getFirstLocalFileHeaderOffset() {
            r2 = this;
            long r0 = r2.firstLocalFileHeaderOffset
            return r0
    }

    public java.io.InputStream getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof org.apache.commons.compress.archivers.zip.ZipFile.Entry
            if (r0 != 0) goto L6
            r6 = 0
            return r6
        L6:
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(r6)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.InputStream r1 = r5.getRawInputStream(r6)
            r0.<init>(r1)
            int[] r1 = org.apache.commons.compress.archivers.zip.ZipFile.AnonymousClass2.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod
            int r2 = r6.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r2 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(r2)
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L7c;
                case 2: goto L76;
                case 3: goto L57;
                case 4: goto L3f;
                case 5: goto L39;
                case 6: goto L33;
                default: goto L25;
            }
        L25:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            int r1 = r6.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(r1)
            r0.<init>(r1, r6)
            throw r0
        L33:
            org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream r6 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream
            r6.<init>(r0)
            return r6
        L39:
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream r6 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream
            r6.<init>(r0)
            return r6
        L3f:
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r1 = 1
            r6.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipFile$1 r1 = new org.apache.commons.compress.archivers.zip.ZipFile$1
            java.io.SequenceInputStream r2 = new java.io.SequenceInputStream
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            byte[] r4 = org.apache.commons.compress.archivers.zip.ZipFile.ONE_ZERO_BYTE
            r3.<init>(r4)
            r2.<init>(r0, r3)
            r1.<init>(r5, r2, r6, r6)
            return r1
        L57:
            org.apache.commons.compress.archivers.zip.ExplodingInputStream r1 = new org.apache.commons.compress.archivers.zip.ExplodingInputStream     // Catch: java.lang.IllegalArgumentException -> L6d
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r2 = r6.getGeneralPurposeBit()     // Catch: java.lang.IllegalArgumentException -> L6d
            int r2 = r2.getSlidingDictionarySize()     // Catch: java.lang.IllegalArgumentException -> L6d
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r6 = r6.getGeneralPurposeBit()     // Catch: java.lang.IllegalArgumentException -> L6d
            int r6 = r6.getNumberOfShannonFanoTrees()     // Catch: java.lang.IllegalArgumentException -> L6d
            r1.<init>(r2, r6, r0)     // Catch: java.lang.IllegalArgumentException -> L6d
            return r1
        L6d:
            r6 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad IMPLODE data"
            r0.<init>(r1, r6)
            throw r0
        L76:
            org.apache.commons.compress.archivers.zip.UnshrinkingInputStream r6 = new org.apache.commons.compress.archivers.zip.UnshrinkingInputStream
            r6.<init>(r0)
            return r6
        L7c:
            org.apache.commons.compress.archivers.zip.ZipFile$StoredStatisticsStream r6 = new org.apache.commons.compress.archivers.zip.ZipFile$StoredStatisticsStream
            r6.<init>(r0)
            return r6
    }

    public java.io.InputStream getRawInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r7 instanceof org.apache.commons.compress.archivers.zip.ZipFile.Entry
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long r2 = r6.getDataOffset(r7)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L11
            return r1
        L11:
            long r0 = r7.getCompressedSize()
            org.apache.commons.compress.utils.BoundedArchiveInputStream r7 = r6.createBoundedInputStream(r2, r0)
            return r7
    }

    public java.lang.String getUnixSymlink(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L28
            boolean r0 = r3.isUnixSymlink()
            if (r0 == 0) goto L28
            java.io.InputStream r3 = r2.getInputStream(r3)
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r2.zipEncoding     // Catch: java.lang.Throwable -> L1c
            byte[] r1 = org.apache.commons.io.IOUtils.toByteArray(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = r0.decode(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1b
            r3.close()
        L1b:
            return r0
        L1c:
            r0 = move-exception
            if (r3 == 0) goto L27
            r3.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r3 = move-exception
            r0.addSuppressed(r3)
        L27:
            throw r0
        L28:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: lambda$fillNameMap$2$org-apache-commons-compress-archivers-zip-ZipFile, reason: not valid java name */
    /* synthetic */ void m2546xc4ffbf12(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            java.util.Map<java.lang.String, java.util.LinkedList<org.apache.commons.compress.archivers.zip.ZipArchiveEntry>> r1 = r3.nameMap
            org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda0 r2 = new org.apache.commons.compress.archivers.zip.ZipFile$$ExternalSyntheticLambda0
            r2.<init>()
            java.lang.Object r0 = r1.computeIfAbsent(r0, r2)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.addLast(r4)
            return
    }
}
