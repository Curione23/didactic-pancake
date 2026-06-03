package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
public class SevenZFile implements java.io.Closeable {
    private static final java.lang.String DEFAULT_FILE_NAME = "unknown archive";
    static final int SIGNATURE_HEADER_SIZE = 32;
    static final byte[] sevenZSignature = null;
    private final org.apache.commons.compress.archivers.sevenz.Archive archive;
    private java.nio.channels.SeekableByteChannel channel;
    private long compressedBytesReadFromCurrentEntry;
    private int currentEntryIndex;
    private int currentFolderIndex;
    private java.io.InputStream currentFolderInputStream;
    private final java.util.ArrayList<java.io.InputStream> deferredBlockStreams;
    private final java.lang.String fileName;
    private final int maxMemoryLimitKb;
    private byte[] password;
    private final boolean tryToRecoverBrokenArchives;
    private long uncompressedBytesReadFromCurrentEntry;
    private final boolean useDefaultNameForUnnamedEntries;



    private static final class ArchiveStatistics {
        private java.util.BitSet folderHasCrc;
        private long numberOfCoders;
        private int numberOfEntries;
        private int numberOfEntriesWithStream;
        private int numberOfFolders;
        private long numberOfInStreams;
        private long numberOfOutStreams;
        private int numberOfPackedStreams;
        private long numberOfUnpackSubStreams;

        private ArchiveStatistics() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ArchiveStatistics(org.apache.commons.compress.archivers.sevenz.SevenZFile.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int access$1000(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0) {
                int r0 = r0.numberOfFolders
                return r0
        }

        static /* synthetic */ int access$1002(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0, int r1) {
                r0.numberOfFolders = r1
                return r1
        }

        static /* synthetic */ long access$1100(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r2) {
                long r0 = r2.numberOfUnpackSubStreams
                return r0
        }

        static /* synthetic */ long access$1102(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0, long r1) {
                r0.numberOfUnpackSubStreams = r1
                return r1
        }

        static /* synthetic */ java.util.BitSet access$1200(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0) {
                java.util.BitSet r0 = r0.folderHasCrc
                return r0
        }

        static /* synthetic */ java.util.BitSet access$1202(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0, java.util.BitSet r1) {
                r0.folderHasCrc = r1
                return r1
        }

        static /* synthetic */ int access$400(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0) {
                int r0 = r0.numberOfEntries
                return r0
        }

        static /* synthetic */ int access$402(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0, int r1) {
                r0.numberOfEntries = r1
                return r1
        }

        static /* synthetic */ int access$502(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0, int r1) {
                r0.numberOfEntriesWithStream = r1
                return r1
        }

        static /* synthetic */ long access$614(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r2, long r3) {
                long r0 = r2.numberOfCoders
                long r0 = r0 + r3
                r2.numberOfCoders = r0
                return r0
        }

        static /* synthetic */ long access$700(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r2) {
                long r0 = r2.numberOfOutStreams
                return r0
        }

        static /* synthetic */ long access$714(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r2, long r3) {
                long r0 = r2.numberOfOutStreams
                long r0 = r0 + r3
                r2.numberOfOutStreams = r0
                return r0
        }

        static /* synthetic */ long access$800(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r2) {
                long r0 = r2.numberOfInStreams
                return r0
        }

        static /* synthetic */ long access$814(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r2, long r3) {
                long r0 = r2.numberOfInStreams
                long r0 = r0 + r3
                r2.numberOfInStreams = r0
                return r0
        }

        static /* synthetic */ int access$900(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0) {
                int r0 = r0.numberOfPackedStreams
                return r0
        }

        static /* synthetic */ int access$902(org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r0, int r1) {
                r0.numberOfPackedStreams = r1
                return r1
        }

        private long bindPairSize() {
                r2 = this;
                r0 = 16
                return r0
        }

        private long coderSize() {
                r2 = this;
                r0 = 22
                return r0
        }

        private long entrySize() {
                r2 = this;
                r0 = 100
                return r0
        }

        private long folderSize() {
                r2 = this;
                r0 = 30
                return r0
        }

        private long streamMapSize() {
                r2 = this;
                int r0 = r2.numberOfFolders
                int r0 = r0 * 8
                int r1 = r2.numberOfPackedStreams
                int r1 = r1 * 8
                int r0 = r0 + r1
                int r1 = r2.numberOfEntries
                int r1 = r1 * 4
                int r0 = r0 + r1
                long r0 = (long) r0
                return r0
        }

        void assertValidity(int r5) throws java.io.IOException {
                r4 = this;
                int r0 = r4.numberOfEntriesWithStream
                if (r0 <= 0) goto L11
                int r1 = r4.numberOfFolders
                if (r1 == 0) goto L9
                goto L11
            L9:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "archive with entries but no folders"
                r5.<init>(r0)
                throw r5
            L11:
                long r0 = (long) r0
                long r2 = r4.numberOfUnpackSubStreams
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L2b
                long r0 = r4.estimateSize()
                r2 = 1024(0x400, double:5.06E-321)
                long r0 = r0 / r2
                long r2 = (long) r5
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 < 0) goto L25
                return
            L25:
                org.apache.commons.compress.MemoryLimitException r2 = new org.apache.commons.compress.MemoryLimitException
                r2.<init>(r0, r5)
                throw r2
            L2b:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "archive doesn't contain enough substreams for entries"
                r5.<init>(r0)
                throw r5
        }

        long estimateSize() {
                r9 = this;
                int r0 = r9.numberOfPackedStreams
                long r1 = (long) r0
                r3 = 16
                long r1 = r1 * r3
                int r0 = r0 / 8
                long r3 = (long) r0
                long r1 = r1 + r3
                int r0 = r9.numberOfFolders
                long r3 = (long) r0
                long r5 = r9.folderSize()
                long r3 = r3 * r5
                long r1 = r1 + r3
                long r3 = r9.numberOfCoders
                long r5 = r9.coderSize()
                long r3 = r3 * r5
                long r1 = r1 + r3
                long r3 = r9.numberOfOutStreams
                int r0 = r9.numberOfFolders
                long r5 = (long) r0
                long r3 = r3 - r5
                long r5 = r9.bindPairSize()
                long r3 = r3 * r5
                long r1 = r1 + r3
                long r3 = r9.numberOfInStreams
                long r5 = r9.numberOfOutStreams
                long r3 = r3 - r5
                int r0 = r9.numberOfFolders
                long r7 = (long) r0
                long r3 = r3 + r7
                r7 = 8
                long r3 = r3 * r7
                long r1 = r1 + r3
                long r5 = r5 * r7
                long r1 = r1 + r5
                int r0 = r9.numberOfEntries
                long r3 = (long) r0
                long r5 = r9.entrySize()
                long r3 = r3 * r5
                long r1 = r1 + r3
                long r3 = r9.streamMapSize()
                long r1 = r1 + r3
                r3 = 2
                long r1 = r1 * r3
                return r1
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Archive with "
                r0.<init>(r1)
                int r1 = r5.numberOfEntries
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " entries in "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r5.numberOfFolders
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " folders. Estimated size "
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r5.estimateSize()
                r3 = 1024(0x400, double:5.06E-321)
                long r1 = r1 / r3
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " kB."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.compress.archivers.sevenz.SevenZFile, org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder> {
        static final int MEMORY_LIMIT_IN_KB = Integer.MAX_VALUE;
        static final boolean TRY_TO_RECOVER_BROKEN_ARCHIVES = false;
        static final boolean USE_DEFAULTNAME_FOR_UNNAMED_ENTRIES = false;
        private java.lang.String defaultName;
        private int maxMemoryLimitKb;
        private byte[] password;
        private java.nio.channels.SeekableByteChannel seekableByteChannel;
        private boolean tryToRecoverBrokenArchives;
        private boolean useDefaultNameForUnnamedEntries;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "unknown archive"
                r1.defaultName = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.maxMemoryLimitKb = r0
                r0 = 0
                r1.useDefaultNameForUnnamedEntries = r0
                r1.tryToRecoverBrokenArchives = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.compress.archivers.sevenz.SevenZFile r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.compress.archivers.sevenz.SevenZFile get() throws java.io.IOException {
                r13 = this;
                java.nio.channels.SeekableByteChannel r0 = r13.seekableByteChannel
                r1 = 0
                r2 = 1
                if (r0 == 0) goto Lb
                java.lang.String r3 = r13.defaultName
            L8:
                r5 = r0
                r6 = r3
                goto L41
            Lb:
                org.apache.commons.io.build.AbstractOrigin r0 = r13.checkOrigin()
                boolean r0 = r0 instanceof org.apache.commons.io.build.AbstractOrigin.ByteArrayOrigin
                if (r0 == 0) goto L23
                org.apache.commons.compress.utils.SeekableInMemoryByteChannel r0 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel
                org.apache.commons.io.build.AbstractOrigin r3 = r13.checkOrigin()
                byte[] r3 = r3.getByteArray()
                r0.<init>(r3)
                java.lang.String r3 = r13.defaultName
                goto L8
            L23:
                java.nio.file.OpenOption[] r0 = r13.getOpenOptions()
                int r3 = r0.length
                if (r3 != 0) goto L30
                java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r2]
                java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.READ
                r0[r1] = r3
            L30:
                java.nio.file.Path r3 = r13.getPath()
                java.nio.channels.SeekableByteChannel r0 = java.nio.file.Files.newByteChannel(r3, r0)
                java.nio.file.Path r3 = r3.toAbsolutePath()
                java.lang.String r3 = r3.toString()
                goto L8
            L41:
                java.nio.channels.SeekableByteChannel r0 = r13.seekableByteChannel
                if (r0 == 0) goto L47
                r8 = r2
                goto L48
            L47:
                r8 = r1
            L48:
                org.apache.commons.compress.archivers.sevenz.SevenZFile r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFile
                byte[] r7 = r13.password
                int r9 = r13.maxMemoryLimitKb
                boolean r10 = r13.useDefaultNameForUnnamedEntries
                boolean r11 = r13.tryToRecoverBrokenArchives
                r12 = 0
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setDefaultName(java.lang.String r1) {
                r0 = this;
                r0.defaultName = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setMaxMemoryLimitKb(int r1) {
                r0 = this;
                r0.maxMemoryLimitKb = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setPassword(java.lang.String r1) {
                r0 = this;
                if (r1 == 0) goto Lb
                char[] r1 = r1.toCharArray()
                byte[] r1 = org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.utf16Decode(r1)
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.password = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setPassword(byte[] r1) {
                r0 = this;
                if (r1 == 0) goto L9
                java.lang.Object r1 = r1.clone()
                byte[] r1 = (byte[]) r1
                goto La
            L9:
                r1 = 0
            La:
                r0.password = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setPassword(char[] r1) {
                r0 = this;
                if (r1 == 0) goto Ld
                java.lang.Object r1 = r1.clone()
                char[] r1 = (char[]) r1
                byte[] r1 = org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.utf16Decode(r1)
                goto Le
            Ld:
                r1 = 0
            Le:
                r0.password = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setSeekableByteChannel(java.nio.channels.SeekableByteChannel r1) {
                r0 = this;
                r0.seekableByteChannel = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setTryToRecoverBrokenArchives(boolean r1) {
                r0 = this;
                r0.tryToRecoverBrokenArchives = r1
                return r0
        }

        public org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder setUseDefaultNameForUnnamedEntries(boolean r1) {
                r0 = this;
                r0.useDefaultNameForUnnamedEntries = r1
                return r0
        }
    }

    public static /* synthetic */ byte[] $r8$lambda$4BQ5ArfWXirWkxf9s4XfDylm8lY() {
            byte[] r0 = org.apache.commons.io.IOUtils.byteArray()
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$VOm64xXfZ2rfTCb1WE1acSh87S4(java.lang.Object r0) {
            boolean r0 = java.util.Objects.nonNull(r0)
            return r0
    }

    public static /* synthetic */ long $r8$lambda$cOGEan9qYZ2WnG4ze1FuzNShUbE(java.lang.Integer r2) {
            long r0 = r2.longValue()
            return r0
    }

    static {
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [55, 122, -68, -81, 39, 28} // fill-array
            org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature = r0
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.io.File r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.io.File r2, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.io.File r7, byte[] r8) throws java.io.IOException {
            r6 = this;
            java.nio.channels.SeekableByteChannel r1 = newByteChannel(r7)
            java.lang.String r2 = r7.getAbsolutePath()
            r4 = 1
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r5 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r0 = r6
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.io.File r2, char[] r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.io.File r7, char[] r8, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r9) throws java.io.IOException {
            r6 = this;
            java.nio.channels.SeekableByteChannel r1 = newByteChannel(r7)
            java.lang.String r2 = r7.getAbsolutePath()
            byte[] r3 = org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.utf16Decode(r8)
            r4 = 1
            r0 = r6
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r7, java.lang.String r8, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r9) throws java.io.IOException {
            r6 = this;
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r7, java.lang.String r8, byte[] r9) throws java.io.IOException {
            r6 = this;
            r4 = 0
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r5 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private SevenZFile(java.nio.channels.SeekableByteChannel r2, java.lang.String r3, byte[] r4, boolean r5, int r6, boolean r7, boolean r8) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.currentEntryIndex = r0
            r1.currentFolderIndex = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.deferredBlockStreams = r0
            r1.channel = r2
            r1.fileName = r3
            r1.maxMemoryLimitKb = r6
            r1.useDefaultNameForUnnamedEntries = r7
            r1.tryToRecoverBrokenArchives = r8
            org.apache.commons.compress.archivers.sevenz.Archive r2 = r1.readHeaders(r4)     // Catch: java.lang.Throwable -> L2d
            r1.archive = r2     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L29
            int r2 = r4.length     // Catch: java.lang.Throwable -> L2d
            byte[] r2 = java.util.Arrays.copyOf(r4, r2)     // Catch: java.lang.Throwable -> L2d
            r1.password = r2     // Catch: java.lang.Throwable -> L2d
            goto L2c
        L29:
            r2 = 0
            r1.password = r2     // Catch: java.lang.Throwable -> L2d
        L2c:
            return
        L2d:
            r2 = move-exception
            if (r5 == 0) goto L35
            java.nio.channels.SeekableByteChannel r3 = r1.channel
            r3.close()
        L35:
            throw r2
    }

    /* synthetic */ SevenZFile(java.nio.channels.SeekableByteChannel r1, java.lang.String r2, byte[] r3, boolean r4, int r5, boolean r6, boolean r7, org.apache.commons.compress.archivers.sevenz.SevenZFile.AnonymousClass1 r8) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @java.lang.Deprecated
    private SevenZFile(java.nio.channels.SeekableByteChannel r9, java.lang.String r10, byte[] r11, boolean r12, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r13) throws java.io.IOException {
            r8 = this;
            int r5 = r13.getMaxMemoryLimitInKb()
            boolean r6 = r13.getUseDefaultNameForUnnamedEntries()
            boolean r7 = r13.getTryToRecoverBrokenArchives()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r2, java.lang.String r3, char[] r4) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r7, java.lang.String r8, char[] r9, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r10) throws java.io.IOException {
            r6 = this;
            byte[] r3 = org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder.utf16Decode(r9)
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r3, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "unknown archive"
            r1 = 0
            r2.<init>(r3, r0, r1, r4)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r2, byte[] r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "unknown archive"
            r1.<init>(r2, r0, r3)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r2, char[] r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public SevenZFile(java.nio.channels.SeekableByteChannel r2, char[] r3, org.apache.commons.compress.archivers.sevenz.SevenZFileOptions r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "unknown archive"
            r1.<init>(r2, r0, r3, r4)
            return
    }

    static /* synthetic */ long access$100(org.apache.commons.compress.archivers.sevenz.SevenZFile r2) {
            long r0 = r2.compressedBytesReadFromCurrentEntry
            return r0
    }

    static /* synthetic */ long access$114(org.apache.commons.compress.archivers.sevenz.SevenZFile r2, long r3) {
            long r0 = r2.compressedBytesReadFromCurrentEntry
            long r0 = r0 + r3
            r2.compressedBytesReadFromCurrentEntry = r0
            return r0
    }

    static /* synthetic */ long access$200(org.apache.commons.compress.archivers.sevenz.SevenZFile r2) {
            long r0 = r2.uncompressedBytesReadFromCurrentEntry
            return r0
    }

    private static int assertFitsIntoNonNegativeInt(java.lang.String r2, long r3) throws java.io.IOException {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto Lf
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lf
            int r2 = (int) r3
            return r2
        Lf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Cannot handle % %,d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
    }

    private java.io.InputStream buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder r9, long r10, int r12, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r13) throws java.io.IOException {
            r8 = this;
            java.nio.channels.SeekableByteChannel r0 = r8.channel
            r0.position(r10)
            org.apache.commons.compress.archivers.sevenz.SevenZFile$1 r10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$1
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream
            org.apache.commons.compress.archivers.sevenz.BoundedSeekableByteChannelInputStream r0 = new org.apache.commons.compress.archivers.sevenz.BoundedSeekableByteChannelInputStream
            java.nio.channels.SeekableByteChannel r1 = r8.channel
            org.apache.commons.compress.archivers.sevenz.Archive r2 = r8.archive
            long[] r2 = r2.packSizes
            r3 = r2[r12]
            r0.<init>(r1, r3)
            r11.<init>(r0)
            r10.<init>(r8, r11)
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            java.lang.Iterable r12 = r9.getOrderedCoders()
            java.util.Iterator r12 = r12.iterator()
            r1 = r10
        L2a:
            boolean r10 = r12.hasNext()
            if (r10 == 0) goto L72
            java.lang.Object r10 = r12.next()
            org.apache.commons.compress.archivers.sevenz.Coder r10 = (org.apache.commons.compress.archivers.sevenz.Coder) r10
            long r2 = r10.numInStreams
            r4 = 1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L6a
            long r2 = r10.numOutStreams
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L6a
            byte[] r0 = r10.decompressionMethodId
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r7 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.byId(r0)
            java.lang.String r0 = r8.fileName
            long r2 = r9.getUnpackSizeForCoder(r10)
            byte[] r5 = r8.password
            int r6 = r8.maxMemoryLimitKb
            r4 = r10
            java.io.InputStream r1 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(r0, r1, r2, r4, r5, r6)
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration
            org.apache.commons.compress.archivers.sevenz.AbstractCoder r2 = org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(r7)
            java.lang.Object r10 = r2.getOptionsFromCoder(r10, r1)
            r0.<init>(r7, r10)
            r11.addFirst(r0)
            goto L2a
        L6a:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Multi input/output stream coders are not yet supported"
            r9.<init>(r10)
            throw r9
        L72:
            r13.setContentMethods(r11)
            boolean r10 = r9.hasCrc
            if (r10 == 0) goto L9f
            org.apache.commons.io.input.ChecksumInputStream$Builder r10 = org.apache.commons.io.input.ChecksumInputStream.builder()
            java.util.zip.CRC32 r11 = new java.util.zip.CRC32
            r11.<init>()
            org.apache.commons.io.input.ChecksumInputStream$Builder r10 = r10.setChecksum(r11)
            org.apache.commons.io.build.AbstractOriginSupplier r10 = r10.setInputStream(r1)
            org.apache.commons.io.input.ChecksumInputStream$Builder r10 = (org.apache.commons.io.input.ChecksumInputStream.Builder) r10
            long r11 = r9.getUnpackSize()
            org.apache.commons.io.input.ChecksumInputStream$Builder r10 = r10.setCountThreshold(r11)
            long r11 = r9.crc
            org.apache.commons.io.input.ChecksumInputStream$Builder r9 = r10.setExpectedChecksumValue(r11)
            org.apache.commons.io.input.ChecksumInputStream r9 = r9.get()
            return r9
        L9f:
            return r1
    }

    private void buildDecodingStream(int r7, boolean r8) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r6.archive
            org.apache.commons.compress.archivers.sevenz.StreamMap r0 = r0.streamMap
            if (r0 == 0) goto Lb3
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r6.archive
            org.apache.commons.compress.archivers.sevenz.StreamMap r0 = r0.streamMap
            int[] r0 = r0.fileFolderIndex
            r0 = r0[r7]
            if (r0 >= 0) goto L16
            java.util.ArrayList<java.io.InputStream> r7 = r6.deferredBlockStreams
            r7.clear()
            return
        L16:
            org.apache.commons.compress.archivers.sevenz.Archive r1 = r6.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r1 = r1.files
            r1 = r1[r7]
            int r2 = r6.currentFolderIndex
            r3 = 0
            if (r2 != r0) goto L51
            if (r7 <= 0) goto L32
            org.apache.commons.compress.archivers.sevenz.Archive r2 = r6.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r2 = r2.files
            int r4 = r7 + (-1)
            r2 = r2[r4]
            java.lang.Iterable r2 = r2.getContentMethods()
            r1.setContentMethods(r2)
        L32:
            if (r8 == 0) goto L4f
            java.lang.Iterable r2 = r1.getContentMethods()
            if (r2 != 0) goto L4f
            org.apache.commons.compress.archivers.sevenz.Archive r2 = r6.archive
            org.apache.commons.compress.archivers.sevenz.StreamMap r2 = r2.streamMap
            int[] r2 = r2.folderFirstFileIndex
            r2 = r2[r0]
            org.apache.commons.compress.archivers.sevenz.Archive r4 = r6.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r4 = r4.files
            r2 = r4[r2]
            java.lang.Iterable r2 = r2.getContentMethods()
            r1.setContentMethods(r2)
        L4f:
            r2 = 1
            goto L57
        L51:
            r6.currentFolderIndex = r0
            r6.reopenFolderInputStream(r0, r1)
            r2 = r3
        L57:
            if (r8 == 0) goto L5e
            boolean r0 = r6.skipEntriesWhenNeeded(r7, r2, r0)
            goto L5f
        L5e:
            r0 = r3
        L5f:
            if (r8 == 0) goto L68
            int r8 = r6.currentEntryIndex
            if (r8 != r7) goto L68
            if (r0 != 0) goto L68
            return
        L68:
            org.apache.commons.io.input.BoundedInputStream$Builder r7 = org.apache.commons.io.input.BoundedInputStream.builder()
            java.io.InputStream r8 = r6.currentFolderInputStream
            org.apache.commons.io.build.AbstractOriginSupplier r7 = r7.setInputStream(r8)
            org.apache.commons.io.input.BoundedInputStream$Builder r7 = (org.apache.commons.io.input.BoundedInputStream.Builder) r7
            long r4 = r1.getSize()
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r7 = r7.setMaxCount(r4)
            org.apache.commons.io.input.BoundedInputStream$Builder r7 = (org.apache.commons.io.input.BoundedInputStream.Builder) r7
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r7 = r7.setPropagateClose(r3)
            org.apache.commons.io.input.BoundedInputStream$Builder r7 = (org.apache.commons.io.input.BoundedInputStream.Builder) r7
            org.apache.commons.io.input.BoundedInputStream r7 = r7.get()
            boolean r8 = r1.getHasCrc()
            if (r8 == 0) goto Lad
            org.apache.commons.io.input.ChecksumInputStream$Builder r8 = org.apache.commons.io.input.ChecksumInputStream.builder()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            org.apache.commons.io.input.ChecksumInputStream$Builder r8 = r8.setChecksum(r0)
            org.apache.commons.io.build.AbstractOriginSupplier r7 = r8.setInputStream(r7)
            org.apache.commons.io.input.ChecksumInputStream$Builder r7 = (org.apache.commons.io.input.ChecksumInputStream.Builder) r7
            long r0 = r1.getCrcValue()
            org.apache.commons.io.input.ChecksumInputStream$Builder r7 = r7.setExpectedChecksumValue(r0)
            org.apache.commons.io.input.ChecksumInputStream r7 = r7.get()
        Lad:
            java.util.ArrayList<java.io.InputStream> r8 = r6.deferredBlockStreams
            r8.add(r7)
            return
        Lb3:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Archive doesn't contain stream information to read entries"
            r7.<init>(r8)
            throw r7
    }

    public static org.apache.commons.compress.archivers.sevenz.SevenZFile.Builder builder() {
            org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$Builder
            r0.<init>()
            return r0
    }

    private void calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive r12) throws java.io.IOException {
            r11 = this;
            org.apache.commons.compress.archivers.sevenz.Folder[] r0 = r12.folders
            r1 = 0
            if (r0 == 0) goto L9
            org.apache.commons.compress.archivers.sevenz.Folder[] r0 = r12.folders
            int r0 = r0.length
            goto La
        L9:
            r0 = r1
        La:
            int[] r2 = new int[r0]
            r3 = r1
            r4 = r3
        Le:
            if (r3 >= r0) goto L1d
            r2[r3] = r4
            org.apache.commons.compress.archivers.sevenz.Folder[] r5 = r12.folders
            r5 = r5[r3]
            long[] r5 = r5.packedStreams
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto Le
        L1d:
            long[] r3 = r12.packSizes
            int r3 = r3.length
            long[] r4 = new long[r3]
            r5 = 0
            r7 = r1
        L25:
            if (r7 >= r3) goto L31
            r4[r7] = r5
            long[] r8 = r12.packSizes
            r9 = r8[r7]
            long r5 = r5 + r9
            int r7 = r7 + 1
            goto L25
        L31:
            int[] r0 = new int[r0]
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r3 = r12.files
            int r3 = r3.length
            int[] r3 = new int[r3]
            r5 = r1
            r6 = r5
            r7 = r6
        L3b:
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r8 = r12.files
            int r8 = r8.length
            if (r5 >= r8) goto L90
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r8 = r12.files
            r8 = r8[r5]
            boolean r8 = r8.hasStream()
            if (r8 != 0) goto L50
            if (r6 != 0) goto L50
            r8 = -1
            r3[r5] = r8
            goto L8d
        L50:
            if (r6 != 0) goto L73
        L52:
            org.apache.commons.compress.archivers.sevenz.Folder[] r8 = r12.folders
            int r8 = r8.length
            if (r7 >= r8) goto L65
            r0[r7] = r5
            org.apache.commons.compress.archivers.sevenz.Folder[] r8 = r12.folders
            r8 = r8[r7]
            int r8 = r8.numUnpackSubStreams
            if (r8 <= 0) goto L62
            goto L65
        L62:
            int r7 = r7 + 1
            goto L52
        L65:
            org.apache.commons.compress.archivers.sevenz.Folder[] r8 = r12.folders
            int r8 = r8.length
            if (r7 >= r8) goto L6b
            goto L73
        L6b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Too few folders in archive"
            r12.<init>(r0)
            throw r12
        L73:
            r3[r5] = r7
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r8 = r12.files
            r8 = r8[r5]
            boolean r8 = r8.hasStream()
            if (r8 != 0) goto L80
            goto L8d
        L80:
            int r6 = r6 + 1
            org.apache.commons.compress.archivers.sevenz.Folder[] r8 = r12.folders
            r8 = r8[r7]
            int r8 = r8.numUnpackSubStreams
            if (r6 < r8) goto L8d
            int r7 = r7 + 1
            r6 = r1
        L8d:
            int r5 = r5 + 1
            goto L3b
        L90:
            org.apache.commons.compress.archivers.sevenz.StreamMap r1 = new org.apache.commons.compress.archivers.sevenz.StreamMap
            r1.<init>(r2, r4, r0, r3)
            r12.streamMap = r1
            return
    }

    private static java.nio.ByteBuffer checkEndOfFile(java.nio.ByteBuffer r1, int r2) throws java.io.EOFException {
            int r0 = r1.remaining()
            if (r0 < r2) goto L7
            return r1
        L7:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = "remaining %,d < expectRemaining %,d"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r1.<init>(r2)
            throw r1
    }

    private void checkEntryIsInitialized(java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r2, int r3) {
            r1 = this;
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda3 r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda3
            r0.<init>()
            r2.computeIfAbsent(r3, r0)
            return
    }

    private static void get(java.nio.ByteBuffer r1, byte[] r2) throws java.io.EOFException {
            int r0 = r2.length
            java.nio.ByteBuffer r1 = checkEndOfFile(r1, r0)
            r1.get(r2)
            return
    }

    private static char getChar(java.nio.ByteBuffer r1) throws java.io.EOFException {
            r0 = 2
            java.nio.ByteBuffer r1 = checkEndOfFile(r1, r0)
            char r1 = r1.getChar()
            return r1
    }

    private java.io.InputStream getCurrentStream() throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r6.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = r0.files
            int r1 = r6.currentEntryIndex
            r0 = r0[r1]
            long r0 = r0.getSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1a
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
            r0.<init>(r1)
            return r0
        L1a:
            java.util.ArrayList<java.io.InputStream> r0 = r6.deferredBlockStreams
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5e
        L22:
            java.util.ArrayList<java.io.InputStream> r0 = r6.deferredBlockStreams
            int r0 = r0.size()
            r1 = 1
            r4 = 0
            if (r0 <= r1) goto L55
            java.util.ArrayList<java.io.InputStream> r0 = r6.deferredBlockStreams
            java.lang.Object r0 = r0.remove(r4)
            java.io.InputStream r0 = (java.io.InputStream) r0
            org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            org.apache.commons.io.IOUtils.skip(r0, r4, r1)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L46
            r0.close()
        L46:
            r6.compressedBytesReadFromCurrentEntry = r2
            goto L22
        L49:
            r1 = move-exception
            if (r0 == 0) goto L54
            r0.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r1.addSuppressed(r0)
        L54:
            throw r1
        L55:
            java.util.ArrayList<java.io.InputStream> r0 = r6.deferredBlockStreams
            java.lang.Object r0 = r0.get(r4)
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No current 7z entry (call getNextEntry() first)."
            r0.<init>(r1)
            throw r0
    }

    private static int getInt(java.nio.ByteBuffer r1) throws java.io.EOFException {
            r0 = 4
            java.nio.ByteBuffer r1 = checkEndOfFile(r1, r0)
            int r1 = r1.getInt()
            return r1
    }

    private static long getLong(java.nio.ByteBuffer r2) throws java.io.EOFException {
            r0 = 8
            java.nio.ByteBuffer r2 = checkEndOfFile(r2, r0)
            long r0 = r2.getLong()
            return r0
    }

    private static int getUnsignedByte(java.nio.ByteBuffer r1) throws java.io.EOFException {
            boolean r0 = r1.hasRemaining()
            if (r0 == 0) goto Ld
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
        Ld:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    private boolean hasCurrentEntryBeenRead() {
            r8 = this;
            java.util.ArrayList<java.io.InputStream> r0 = r8.deferredBlockStreams
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L4e
            java.util.ArrayList<java.io.InputStream> r0 = r8.deferredBlockStreams
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r0 = r0.get(r2)
            java.io.InputStream r0 = (java.io.InputStream) r0
            boolean r2 = r0 instanceof org.apache.commons.io.input.ChecksumInputStream
            if (r2 == 0) goto L33
            org.apache.commons.io.input.ChecksumInputStream r0 = (org.apache.commons.io.input.ChecksumInputStream) r0
            long r4 = r0.getRemaining()
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r8.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = r0.files
            int r2 = r8.currentEntryIndex
            r0 = r0[r2]
            long r6 = r0.getSize()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L4e
        L31:
            r1 = r3
            goto L4e
        L33:
            boolean r2 = r0 instanceof org.apache.commons.io.input.BoundedInputStream
            if (r2 == 0) goto L4e
            org.apache.commons.io.input.BoundedInputStream r0 = (org.apache.commons.io.input.BoundedInputStream) r0
            long r4 = r0.getRemaining()
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r8.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = r0.files
            int r2 = r8.currentEntryIndex
            r0 = r0[r2]
            long r6 = r0.getSize()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L4e
            goto L31
        L4e:
            return r1
    }

    private org.apache.commons.compress.archivers.sevenz.Archive initializeArchive(org.apache.commons.compress.archivers.sevenz.StartHeader r8, byte[] r9, boolean r10) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "nextHeaderSize"
            long r1 = r8.nextHeaderSize
            assertFitsIntoNonNegativeInt(r0, r1)
            long r0 = r8.nextHeaderSize
            int r0 = (int) r0
            java.nio.channels.SeekableByteChannel r1 = r7.channel
            r2 = 32
            long r4 = r8.nextHeaderOffset
            long r4 = r4 + r2
            r1.position(r4)
            if (r10 == 0) goto L59
            java.nio.channels.SeekableByteChannel r10 = r7.channel
            long r1 = r10.position()
            java.util.zip.CheckedInputStream r10 = new java.util.zip.CheckedInputStream
            java.nio.channels.SeekableByteChannel r3 = r7.channel
            java.io.InputStream r3 = java.nio.channels.Channels.newInputStream(r3)
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32
            r4.<init>()
            r10.<init>(r3, r4)
            long r3 = (long) r0
            long r5 = r10.skip(r3)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L51
            long r3 = r8.nextHeaderCrc
            java.util.zip.Checksum r8 = r10.getChecksum()
            long r5 = r8.getValue()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L49
            java.nio.channels.SeekableByteChannel r8 = r7.channel
            r8.position(r1)
            goto L59
        L49:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "NextHeader CRC-32 mismatch"
            r8.<init>(r9)
            throw r8
        L51:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Problem computing NextHeader CRC-32"
            r8.<init>(r9)
            throw r8
        L59:
            org.apache.commons.compress.archivers.sevenz.Archive r8 = new org.apache.commons.compress.archivers.sevenz.Archive
            r8.<init>()
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r10 = r10.order(r0)
            r7.readFully(r10)
            int r0 = getUnsignedByte(r10)
            r1 = 23
            if (r0 != r1) goto L80
            java.nio.ByteBuffer r10 = r7.readEncodedHeader(r10, r8, r9)
            org.apache.commons.compress.archivers.sevenz.Archive r8 = new org.apache.commons.compress.archivers.sevenz.Archive
            r8.<init>()
            int r0 = getUnsignedByte(r10)
        L80:
            r9 = 1
            if (r0 != r9) goto L8a
            r7.readHeader(r10, r8)
            r9 = 0
            r8.subStreamsInfo = r9
            return r8
        L8a:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Broken or unsupported archive: no Header"
            r8.<init>(r9)
            throw r8
    }

    static /* synthetic */ org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry lambda$checkEntryIsInitialized$0(java.lang.Integer r0) {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry
            r0.<init>()
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] lambda$readFilesInfo$1(int r0) {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[r0]
            return r0
    }

    public static boolean matches(byte[] r3, int r4) {
            byte[] r0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature
            int r0 = r0.length
            r1 = 0
            if (r4 >= r0) goto L7
            return r1
        L7:
            r4 = r1
        L8:
            byte[] r0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature
            int r2 = r0.length
            if (r4 >= r2) goto L17
            r2 = r3[r4]
            r0 = r0[r4]
            if (r2 == r0) goto L14
            return r1
        L14:
            int r4 = r4 + 1
            goto L8
        L17:
            r3 = 1
            return r3
    }

    private static java.nio.channels.SeekableByteChannel newByteChannel(java.io.File r2) throws java.io.IOException {
            java.nio.file.Path r2 = r2.toPath()
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.READ
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]
            java.nio.channels.SeekableByteChannel r2 = java.nio.file.Files.newByteChannel(r2, r0, r1)
            return r2
    }

    private java.util.BitSet readAllOrBits(java.nio.ByteBuffer r3, int r4) throws java.io.IOException {
            r2 = this;
            int r0 = getUnsignedByte(r3)
            if (r0 == 0) goto L15
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r4)
            r0 = 0
        Lc:
            if (r0 >= r4) goto L19
            r1 = 1
            r3.set(r0, r1)
            int r0 = r0 + 1
            goto Lc
        L15:
            java.util.BitSet r3 = r2.readBits(r3, r4)
        L19:
            return r3
    }

    private void readArchiveProperties(java.nio.ByteBuffer r5) throws java.io.IOException {
            r4 = this;
            long r0 = readUint64(r5)
        L4:
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            long r0 = readUint64(r5)
            int r0 = (int) r0
            byte[] r0 = new byte[r0]
            get(r5, r0)
            long r0 = readUint64(r5)
            goto L4
        L19:
            return
    }

    private java.util.BitSet readBits(java.nio.ByteBuffer r7, int r8) throws java.io.IOException {
            r6 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r8)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L9:
            if (r2 >= r8) goto L22
            if (r3 != 0) goto L13
            int r4 = getUnsignedByte(r7)
            r3 = 128(0x80, float:1.8E-43)
        L13:
            r5 = r4 & r3
            if (r5 == 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r1
        L1a:
            r0.set(r2, r5)
            int r3 = r3 >>> 1
            int r2 = r2 + 1
            goto L9
        L22:
            return r0
    }

    private java.nio.ByteBuffer readEncodedHeader(java.nio.ByteBuffer r10, org.apache.commons.compress.archivers.sevenz.Archive r11, byte[] r12) throws java.io.IOException {
            r9 = this;
            int r0 = r10.position()
            org.apache.commons.compress.archivers.sevenz.SevenZFile$ArchiveStatistics r1 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$ArchiveStatistics
            r2 = 0
            r1.<init>(r2)
            r9.sanityCheckStreamsInfo(r10, r1)
            int r2 = r9.maxMemoryLimitKb
            r1.assertValidity(r2)
            r10.position(r0)
            r9.readStreamsInfo(r10, r11)
            org.apache.commons.compress.archivers.sevenz.Folder[] r10 = r11.folders
            if (r10 == 0) goto Ld6
            org.apache.commons.compress.archivers.sevenz.Folder[] r10 = r11.folders
            int r10 = r10.length
            if (r10 == 0) goto Ld6
            long[] r10 = r11.packSizes
            if (r10 == 0) goto Lce
            long[] r10 = r11.packSizes
            int r10 = r10.length
            if (r10 == 0) goto Lce
            org.apache.commons.compress.archivers.sevenz.Folder[] r10 = r11.folders
            r0 = 0
            r10 = r10[r0]
            r1 = 32
            long r3 = r11.packPos
            long r3 = r3 + r1
            java.nio.channels.SeekableByteChannel r1 = r9.channel
            r1.position(r3)
            org.apache.commons.compress.archivers.sevenz.BoundedSeekableByteChannelInputStream r1 = new org.apache.commons.compress.archivers.sevenz.BoundedSeekableByteChannelInputStream
            java.nio.channels.SeekableByteChannel r2 = r9.channel
            long[] r11 = r11.packSizes
            r3 = r11[r0]
            r1.<init>(r2, r3)
            java.lang.Iterable r11 = r10.getOrderedCoders()
            java.util.Iterator r11 = r11.iterator()
            r3 = r1
        L4d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r11.next()
            r6 = r0
            org.apache.commons.compress.archivers.sevenz.Coder r6 = (org.apache.commons.compress.archivers.sevenz.Coder) r6
            long r0 = r6.numInStreams
            r4 = 1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L76
            long r0 = r6.numOutStreams
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L76
            java.lang.String r2 = r9.fileName
            long r4 = r10.getUnpackSizeForCoder(r6)
            int r8 = r9.maxMemoryLimitKb
            r7 = r12
            java.io.InputStream r3 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(r2, r3, r4, r6, r7, r8)
            goto L4d
        L76:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Multi input/output stream coders are not yet supported"
            r10.<init>(r11)
            throw r10
        L7e:
            boolean r11 = r10.hasCrc
            if (r11 == 0) goto La7
            org.apache.commons.io.input.ChecksumInputStream$Builder r11 = org.apache.commons.io.input.ChecksumInputStream.builder()
            java.util.zip.CRC32 r12 = new java.util.zip.CRC32
            r12.<init>()
            org.apache.commons.io.input.ChecksumInputStream$Builder r11 = r11.setChecksum(r12)
            org.apache.commons.io.build.AbstractOriginSupplier r11 = r11.setInputStream(r3)
            org.apache.commons.io.input.ChecksumInputStream$Builder r11 = (org.apache.commons.io.input.ChecksumInputStream.Builder) r11
            long r0 = r10.getUnpackSize()
            org.apache.commons.io.input.ChecksumInputStream$Builder r11 = r11.setCountThreshold(r0)
            long r0 = r10.crc
            org.apache.commons.io.input.ChecksumInputStream$Builder r11 = r11.setExpectedChecksumValue(r0)
            org.apache.commons.io.input.ChecksumInputStream r3 = r11.get()
        La7:
            java.lang.String r11 = "unpackSize"
            long r0 = r10.getUnpackSize()
            int r10 = assertFitsIntoNonNegativeInt(r11, r0)
            byte[] r11 = org.apache.commons.compress.utils.IOUtils.readRange(r3, r10)
            int r12 = r11.length
            if (r12 < r10) goto Lc6
            r3.close()
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r11)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r10 = r10.order(r11)
            return r10
        Lc6:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "premature end of stream"
            r10.<init>(r11)
            throw r10
        Lce:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "no packed streams, can't read encoded header"
            r10.<init>(r11)
            throw r10
        Ld6:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "no folders, can't read encoded header"
            r10.<init>(r11)
            throw r10
    }

    private void readFilesInfo(java.nio.ByteBuffer r17, org.apache.commons.compress.archivers.sevenz.Archive r18) throws java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            long r3 = readUint64(r17)
            int r3 = (int) r3
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r5 = 0
            r6 = r5
            r7 = r6
        L13:
            int r8 = getUnsignedByte(r17)
            r9 = 0
            if (r8 != 0) goto Ld3
            r1 = r9
            r8 = r1
            r10 = r8
        L1d:
            if (r1 >= r3) goto Lb1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Object r11 = r4.get(r11)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r11 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r11
            if (r11 != 0) goto L2d
            goto Lad
        L2d:
            r12 = 1
            if (r5 == 0) goto L39
            boolean r13 = r5.get(r1)
            if (r13 != 0) goto L37
            goto L39
        L37:
            r13 = r9
            goto L3a
        L39:
            r13 = r12
        L3a:
            r11.setHasStream(r13)
            boolean r13 = r11.hasStream()
            if (r13 == 0) goto L87
            org.apache.commons.compress.archivers.sevenz.SubStreamsInfo r12 = r2.subStreamsInfo
            if (r12 == 0) goto L7f
            r11.setDirectory(r9)
            r11.setAntiItem(r9)
            org.apache.commons.compress.archivers.sevenz.SubStreamsInfo r12 = r2.subStreamsInfo
            java.util.BitSet r12 = r12.hasCrc
            boolean r12 = r12.get(r10)
            r11.setHasCrc(r12)
            org.apache.commons.compress.archivers.sevenz.SubStreamsInfo r12 = r2.subStreamsInfo
            long[] r12 = r12.crcs
            r14 = r12[r10]
            r11.setCrcValue(r14)
            org.apache.commons.compress.archivers.sevenz.SubStreamsInfo r12 = r2.subStreamsInfo
            long[] r12 = r12.unpackSizes
            r13 = r12[r10]
            r11.setSize(r13)
            long r11 = r11.getSize()
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L77
            int r10 = r10 + 1
            goto Lad
        L77:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "broken archive, entry with negative size"
            r1.<init>(r2)
            throw r1
        L7f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Archive contains file with streams but no subStreamsInfo"
            r1.<init>(r2)
            throw r1
        L87:
            if (r6 == 0) goto L92
            boolean r13 = r6.get(r8)
            if (r13 != 0) goto L90
            goto L92
        L90:
            r13 = r9
            goto L93
        L92:
            r13 = r12
        L93:
            r11.setDirectory(r13)
            if (r7 == 0) goto L9f
            boolean r13 = r7.get(r8)
            if (r13 == 0) goto L9f
            goto La0
        L9f:
            r12 = r9
        La0:
            r11.setAntiItem(r12)
            r11.setHasCrc(r9)
            r12 = 0
            r11.setSize(r12)
            int r8 = r8 + 1
        Lad:
            int r1 = r1 + 1
            goto L1d
        Lb1:
            java.util.Collection r1 = r4.values()
            java.util.stream.Stream r1 = r1.stream()
            org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda0 r3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda0
            r3.<init>()
            java.util.stream.Stream r1 = r1.filter(r3)
            org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda1 r3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda1
            r3.<init>()
            java.lang.Object[] r1 = r1.toArray(r3)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r1 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[]) r1
            r2.files = r1
            r0.calculateStreamMap(r2)
            return
        Ld3:
            long r10 = readUint64(r17)
            r12 = 25
            if (r8 == r12) goto L1fb
            switch(r8) {
                case 14: goto L1f5;
                case 15: goto L1eb;
                case 16: goto L1e1;
                case 17: goto L197;
                case 18: goto L16a;
                case 19: goto L13d;
                case 20: goto L110;
                case 21: goto Le3;
                default: goto Lde;
            }
        Lde:
            skipBytesFully(r1, r10)
            goto L1fe
        Le3:
            java.util.BitSet r8 = r0.readAllOrBits(r1, r3)
            getUnsignedByte(r17)
        Lea:
            if (r9 >= r3) goto L1fe
            r0.checkEntryIsInitialized(r4, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r4.get(r10)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r10 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r10
            boolean r11 = r8.get(r9)
            r10.setHasWindowsAttributes(r11)
            boolean r11 = r10.getHasWindowsAttributes()
            if (r11 == 0) goto L10d
            int r11 = getInt(r17)
            r10.setWindowsAttributes(r11)
        L10d:
            int r9 = r9 + 1
            goto Lea
        L110:
            java.util.BitSet r8 = r0.readAllOrBits(r1, r3)
            getUnsignedByte(r17)
        L117:
            if (r9 >= r3) goto L1fe
            r0.checkEntryIsInitialized(r4, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r4.get(r10)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r10 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r10
            boolean r11 = r8.get(r9)
            r10.setHasLastModifiedDate(r11)
            boolean r11 = r10.getHasLastModifiedDate()
            if (r11 == 0) goto L13a
            long r11 = getLong(r17)
            r10.setLastModifiedDate(r11)
        L13a:
            int r9 = r9 + 1
            goto L117
        L13d:
            java.util.BitSet r8 = r0.readAllOrBits(r1, r3)
            getUnsignedByte(r17)
        L144:
            if (r9 >= r3) goto L1fe
            r0.checkEntryIsInitialized(r4, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r4.get(r10)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r10 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r10
            boolean r11 = r8.get(r9)
            r10.setHasAccessDate(r11)
            boolean r11 = r10.getHasAccessDate()
            if (r11 == 0) goto L167
            long r11 = getLong(r17)
            r10.setAccessDate(r11)
        L167:
            int r9 = r9 + 1
            goto L144
        L16a:
            java.util.BitSet r8 = r0.readAllOrBits(r1, r3)
            getUnsignedByte(r17)
        L171:
            if (r9 >= r3) goto L1fe
            r0.checkEntryIsInitialized(r4, r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r4.get(r10)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r10 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r10
            boolean r11 = r8.get(r9)
            r10.setHasCreationDate(r11)
            boolean r11 = r10.getHasCreationDate()
            if (r11 == 0) goto L194
            long r11 = getLong(r17)
            r10.setCreationDate(r11)
        L194:
            int r9 = r9 + 1
            goto L171
        L197:
            getUnsignedByte(r17)
            r12 = 1
            long r10 = r10 - r12
            int r8 = (int) r10
            byte[] r10 = new byte[r8]
            get(r1, r10)
            r11 = r9
            r12 = r11
        L1a5:
            if (r9 >= r8) goto L1d4
            r13 = r10[r9]
            if (r13 != 0) goto L1cf
            int r13 = r9 + 1
            r13 = r10[r13]
            if (r13 != 0) goto L1cf
            r0.checkEntryIsInitialized(r4, r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r4.get(r13)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r13 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r13
            java.lang.String r14 = new java.lang.String
            int r15 = r9 - r11
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            r14.<init>(r10, r11, r15, r2)
            r13.setName(r14)
            int r2 = r9 + 2
            int r12 = r12 + 1
            r11 = r2
        L1cf:
            int r9 = r9 + 2
            r2 = r18
            goto L1a5
        L1d4:
            if (r11 != r8) goto L1d9
            if (r12 != r3) goto L1d9
            goto L1fe
        L1d9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Error parsing file names"
            r1.<init>(r2)
            throw r1
        L1e1:
            int r2 = r5.cardinality()
            java.util.BitSet r2 = r0.readBits(r1, r2)
            r7 = r2
            goto L1fe
        L1eb:
            int r2 = r5.cardinality()
            java.util.BitSet r2 = r0.readBits(r1, r2)
            r6 = r2
            goto L1fe
        L1f5:
            java.util.BitSet r2 = r0.readBits(r1, r3)
            r5 = r2
            goto L1fe
        L1fb:
            skipBytesFully(r1, r10)
        L1fe:
            r2 = r18
            goto L13
    }

    private org.apache.commons.compress.archivers.sevenz.Folder readFolder(java.nio.ByteBuffer r25) throws java.io.IOException {
            r24 = this;
            r0 = r25
            org.apache.commons.compress.archivers.sevenz.Folder r1 = new org.apache.commons.compress.archivers.sevenz.Folder
            r1.<init>()
            long r2 = readUint64(r25)
            int r2 = (int) r2
            org.apache.commons.compress.archivers.sevenz.Coder[] r3 = new org.apache.commons.compress.archivers.sevenz.Coder[r2]
            r4 = 0
            r6 = 0
            r7 = r4
            r9 = r6
        L13:
            r10 = 1
            if (r9 >= r2) goto L78
            int r12 = getUnsignedByte(r25)
            r13 = r12 & 15
            r14 = r12 & 16
            r15 = 1
            if (r14 != 0) goto L24
            r14 = r15
            goto L25
        L24:
            r14 = r6
        L25:
            r16 = r12 & 32
            if (r16 == 0) goto L2c
            r16 = r15
            goto L2e
        L2c:
            r16 = r6
        L2e:
            r12 = r12 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L33
            goto L34
        L33:
            r15 = r6
        L34:
            byte[] r12 = new byte[r13]
            get(r0, r12)
            if (r14 == 0) goto L40
            r19 = r10
            r21 = r19
            goto L4c
        L40:
            long r10 = readUint64(r25)
            long r13 = readUint64(r25)
            r19 = r10
            r21 = r13
        L4c:
            long r4 = r4 + r19
            long r7 = r7 + r21
            if (r16 == 0) goto L5d
            long r10 = readUint64(r25)
            int r10 = (int) r10
            byte[] r10 = new byte[r10]
            get(r0, r10)
            goto L5e
        L5d:
            r10 = 0
        L5e:
            r23 = r10
            if (r15 != 0) goto L70
            org.apache.commons.compress.archivers.sevenz.Coder r10 = new org.apache.commons.compress.archivers.sevenz.Coder
            r17 = r10
            r18 = r12
            r17.<init>(r18, r19, r21, r23)
            r3[r9] = r10
            int r9 = r9 + 1
            goto L13
        L70:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Alternative methods are unsupported, please report. The reference implementation doesn't support them either."
            r0.<init>(r1)
            throw r0
        L78:
            r1.coders = r3
            r1.totalInputStreams = r4
            r1.totalOutputStreams = r7
            long r7 = r7 - r10
            int r2 = (int) r7
            org.apache.commons.compress.archivers.sevenz.BindPair[] r3 = new org.apache.commons.compress.archivers.sevenz.BindPair[r2]
            r9 = r6
        L83:
            if (r9 >= r2) goto L99
            org.apache.commons.compress.archivers.sevenz.BindPair r12 = new org.apache.commons.compress.archivers.sevenz.BindPair
            long r13 = readUint64(r25)
            long r10 = readUint64(r25)
            r12.<init>(r13, r10)
            r3[r9] = r12
            int r9 = r9 + 1
            r10 = 1
            goto L83
        L99:
            r1.bindPairs = r3
            long r2 = r4 - r7
            int r7 = (int) r2
            long[] r8 = new long[r7]
            r9 = 1
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto Lb8
            r0 = r6
        La7:
            int r2 = (int) r4
            if (r0 >= r2) goto Lb4
            int r2 = r1.findBindPairForInStream(r0)
            if (r2 >= 0) goto Lb1
            goto Lb4
        Lb1:
            int r0 = r0 + 1
            goto La7
        Lb4:
            long r2 = (long) r0
            r8[r6] = r2
            goto Lc3
        Lb8:
            if (r6 >= r7) goto Lc3
            long r2 = readUint64(r25)
            r8[r6] = r2
            int r6 = r6 + 1
            goto Lb8
        Lc3:
            r1.packedStreams = r8
            return r1
    }

    private void readFully(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            r2.rewind()
            java.nio.channels.SeekableByteChannel r0 = r1.channel
            org.apache.commons.compress.utils.IOUtils.readFully(r0, r2)
            r2.flip()
            return
    }

    private void readHeader(java.nio.ByteBuffer r4, org.apache.commons.compress.archivers.sevenz.Archive r5) throws java.io.IOException {
            r3 = this;
            int r0 = r4.position()
            org.apache.commons.compress.archivers.sevenz.SevenZFile$ArchiveStatistics r1 = r3.sanityCheckAndCollectStatistics(r4)
            int r2 = r3.maxMemoryLimitKb
            r1.assertValidity(r2)
            r4.position(r0)
            int r0 = getUnsignedByte(r4)
            r1 = 2
            if (r0 != r1) goto L1e
            r3.readArchiveProperties(r4)
            int r0 = getUnsignedByte(r4)
        L1e:
            r1 = 3
            if (r0 == r1) goto L35
            r1 = 4
            if (r0 != r1) goto L2b
            r3.readStreamsInfo(r4, r5)
            int r0 = getUnsignedByte(r4)
        L2b:
            r1 = 5
            if (r0 != r1) goto L34
            r3.readFilesInfo(r4, r5)
            getUnsignedByte(r4)
        L34:
            return
        L35:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Additional streams unsupported"
            r4.<init>(r5)
            throw r4
    }

    private org.apache.commons.compress.archivers.sevenz.Archive readHeaders(byte[] r7) throws java.io.IOException {
            r6 = this;
            r0 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            r6.readFully(r0)
            r1 = 6
            byte[] r1 = new byte[r1]
            r0.get(r1)
            byte[] r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L8c
            byte r1 = r0.get()
            byte r2 = r0.get()
            if (r1 != 0) goto L74
            int r0 = r0.getInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L6a
            java.nio.channels.SeekableByteChannel r2 = r6.channel
            long r2 = r2.position()
            r4 = 20
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r6.readFully(r4)
            java.nio.channels.SeekableByteChannel r5 = r6.channel
            r5.position(r2)
        L4c:
            boolean r2 = r4.hasRemaining()
            if (r2 == 0) goto L59
            byte r2 = r4.get()
            if (r2 == 0) goto L4c
            goto L6a
        L59:
            boolean r0 = r6.tryToRecoverBrokenArchives
            if (r0 == 0) goto L62
            org.apache.commons.compress.archivers.sevenz.Archive r7 = r6.tryToLocateEndHeader(r7)
            return r7
        L62:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "archive seems to be invalid.\nYou may want to retry and enable the tryToRecoverBrokenArchives if the archive could be a multi volume archive that has been closed prematurely."
            r7.<init>(r0)
            throw r7
        L6a:
            org.apache.commons.compress.archivers.sevenz.StartHeader r0 = r6.readStartHeader(r0)
            r1 = 1
            org.apache.commons.compress.archivers.sevenz.Archive r7 = r6.initializeArchive(r0, r7, r1)
            return r7
        L74:
            java.io.IOException r7 = new java.io.IOException
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Unsupported 7z version (%d,%d)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        L8c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Bad 7z signature"
            r7.<init>(r0)
            throw r7
    }

    private void readPackInfo(java.nio.ByteBuffer r9, org.apache.commons.compress.archivers.sevenz.Archive r10) throws java.io.IOException {
            r8 = this;
            long r0 = readUint64(r9)
            r10.packPos = r0
            long r0 = readUint64(r9)
            int r0 = (int) r0
            int r1 = getUnsignedByte(r9)
            r2 = 9
            r3 = 0
            if (r1 != r2) goto L2d
            long[] r1 = new long[r0]
            r10.packSizes = r1
            r1 = r3
        L19:
            long[] r2 = r10.packSizes
            int r2 = r2.length
            if (r1 >= r2) goto L29
            long[] r2 = r10.packSizes
            long r4 = readUint64(r9)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L19
        L29:
            int r1 = getUnsignedByte(r9)
        L2d:
            r2 = 10
            if (r1 != r2) goto L5a
            java.util.BitSet r1 = r8.readAllOrBits(r9, r0)
            r10.packCrcsDefined = r1
            long[] r1 = new long[r0]
            r10.packCrcs = r1
        L3b:
            if (r3 >= r0) goto L57
            java.util.BitSet r1 = r10.packCrcsDefined
            boolean r1 = r1.get(r3)
            if (r1 == 0) goto L54
            long[] r1 = r10.packCrcs
            int r2 = getInt(r9)
            long r4 = (long) r2
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r1[r3] = r4
        L54:
            int r3 = r3 + 1
            goto L3b
        L57:
            getUnsignedByte(r9)
        L5a:
            return
    }

    private org.apache.commons.compress.archivers.sevenz.StartHeader readStartHeader(long r9) throws java.io.IOException {
            r8 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            org.apache.commons.io.input.ChecksumInputStream$Builder r1 = org.apache.commons.io.input.ChecksumInputStream.builder()
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32
            r2.<init>()
            org.apache.commons.io.input.ChecksumInputStream$Builder r1 = r1.setChecksum(r2)
            org.apache.commons.compress.archivers.sevenz.BoundedSeekableByteChannelInputStream r2 = new org.apache.commons.compress.archivers.sevenz.BoundedSeekableByteChannelInputStream
            java.nio.channels.SeekableByteChannel r3 = r8.channel
            r4 = 20
            r2.<init>(r3, r4)
            org.apache.commons.io.build.AbstractOriginSupplier r1 = r1.setInputStream(r2)
            org.apache.commons.io.input.ChecksumInputStream$Builder r1 = (org.apache.commons.io.input.ChecksumInputStream.Builder) r1
            org.apache.commons.io.input.ChecksumInputStream$Builder r1 = r1.setCountThreshold(r4)
            org.apache.commons.io.input.ChecksumInputStream$Builder r9 = r1.setExpectedChecksumValue(r9)
            org.apache.commons.io.input.ChecksumInputStream r9 = r9.get()
            r0.<init>(r9)
            long r9 = r0.readLong()     // Catch: java.lang.Throwable -> L8b
            long r2 = java.lang.Long.reverseBytes(r9)     // Catch: java.lang.Throwable -> L8b
            r9 = 0
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 < 0) goto L83
            r9 = 32
            long r4 = r2 + r9
            java.nio.channels.SeekableByteChannel r1 = r8.channel     // Catch: java.lang.Throwable -> L8b
            long r6 = r1.size()     // Catch: java.lang.Throwable -> L8b
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L83
            long r4 = r0.readLong()     // Catch: java.lang.Throwable -> L8b
            long r4 = java.lang.Long.reverseBytes(r4)     // Catch: java.lang.Throwable -> L8b
            long r6 = r2 + r4
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L7b
            long r6 = r6 + r9
            java.nio.channels.SeekableByteChannel r9 = r8.channel     // Catch: java.lang.Throwable -> L8b
            long r9 = r9.size()     // Catch: java.lang.Throwable -> L8b
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 > 0) goto L7b
            int r9 = r0.readInt()     // Catch: java.lang.Throwable -> L8b
            int r9 = java.lang.Integer.reverseBytes(r9)     // Catch: java.lang.Throwable -> L8b
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L8b
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            org.apache.commons.compress.archivers.sevenz.StartHeader r9 = new org.apache.commons.compress.archivers.sevenz.StartHeader     // Catch: java.lang.Throwable -> L8b
            r1 = r9
            r1.<init>(r2, r4, r6)     // Catch: java.lang.Throwable -> L8b
            r0.close()
            return r9
        L7b:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r10 = "nextHeaderSize is out of bounds"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L8b
            throw r9     // Catch: java.lang.Throwable -> L8b
        L83:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r10 = "nextHeaderOffset is out of bounds"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L8b
            throw r9     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L90
            goto L94
        L90:
            r10 = move-exception
            r9.addSuppressed(r10)
        L94:
            throw r9
    }

    private void readStreamsInfo(java.nio.ByteBuffer r3, org.apache.commons.compress.archivers.sevenz.Archive r4) throws java.io.IOException {
            r2 = this;
            int r0 = getUnsignedByte(r3)
            r1 = 6
            if (r0 != r1) goto Le
            r2.readPackInfo(r3, r4)
            int r0 = getUnsignedByte(r3)
        Le:
            r1 = 7
            if (r0 != r1) goto L19
            r2.readUnpackInfo(r3, r4)
            int r0 = getUnsignedByte(r3)
            goto L1d
        L19:
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = org.apache.commons.compress.archivers.sevenz.Folder.EMPTY_FOLDER_ARRAY
            r4.folders = r1
        L1d:
            r1 = 8
            if (r0 != r1) goto L27
            r2.readSubStreamsInfo(r3, r4)
            getUnsignedByte(r3)
        L27:
            return
    }

    private void readSubStreamsInfo(java.nio.ByteBuffer r19, org.apache.commons.compress.archivers.sevenz.Archive r20) throws java.io.IOException {
            r18 = this;
            r0 = r20
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = r0.folders
            int r2 = r1.length
            r4 = 0
        L6:
            r5 = 1
            if (r4 >= r2) goto L10
            r6 = r1[r4]
            r6.numUnpackSubStreams = r5
            int r4 = r4 + 1
            goto L6
        L10:
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = r0.folders
            int r1 = r1.length
            long r1 = (long) r1
            int r4 = getUnsignedByte(r19)
            r6 = 13
            r7 = 0
            if (r4 != r6) goto L37
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = r0.folders
            int r2 = r1.length
            r9 = r7
            r4 = 0
        L23:
            if (r4 >= r2) goto L32
            r6 = r1[r4]
            long r11 = readUint64(r19)
            int r13 = (int) r11
            r6.numUnpackSubStreams = r13
            long r9 = r9 + r11
            int r4 = r4 + 1
            goto L23
        L32:
            int r4 = getUnsignedByte(r19)
            r1 = r9
        L37:
            int r1 = (int) r1
            org.apache.commons.compress.archivers.sevenz.SubStreamsInfo r2 = new org.apache.commons.compress.archivers.sevenz.SubStreamsInfo
            r2.<init>(r1)
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = r0.folders
            int r6 = r1.length
            r9 = 0
            r10 = 0
        L42:
            r11 = 9
            if (r9 >= r6) goto L85
            r12 = r1[r9]
            int r13 = r12.numUnpackSubStreams
            if (r13 != 0) goto L4d
            goto L7a
        L4d:
            r13 = r7
            if (r4 != r11) goto L66
            r11 = 0
        L51:
            int r15 = r12.numUnpackSubStreams
            int r15 = r15 - r5
            if (r11 >= r15) goto L66
            long r15 = readUint64(r19)
            long[] r3 = r2.unpackSizes
            int r17 = r10 + 1
            r3[r10] = r15
            long r13 = r13 + r15
            int r11 = r11 + 1
            r10 = r17
            goto L51
        L66:
            long r15 = r12.getUnpackSize()
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 > 0) goto L7d
            long[] r3 = r2.unpackSizes
            int r11 = r10 + 1
            long r15 = r12.getUnpackSize()
            long r15 = r15 - r13
            r3[r10] = r15
            r10 = r11
        L7a:
            int r9 = r9 + 1
            goto L42
        L7d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "sum of unpack sizes of folder exceeds total unpack size"
            r0.<init>(r1)
            throw r0
        L85:
            if (r4 != r11) goto L8b
            int r4 = getUnsignedByte(r19)
        L8b:
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = r0.folders
            int r3 = r1.length
            r6 = 0
            r7 = 0
        L90:
            if (r6 >= r3) goto La2
            r8 = r1[r6]
            int r9 = r8.numUnpackSubStreams
            if (r9 != r5) goto L9c
            boolean r9 = r8.hasCrc
            if (r9 != 0) goto L9f
        L9c:
            int r8 = r8.numUnpackSubStreams
            int r7 = r7 + r8
        L9f:
            int r6 = r6 + 1
            goto L90
        La2:
            r1 = 10
            if (r4 != r1) goto L10b
            r1 = r18
            r3 = r19
            java.util.BitSet r4 = r1.readAllOrBits(r3, r7)
            long[] r6 = new long[r7]
            r8 = 0
        Lb1:
            if (r8 >= r7) goto Lc9
            boolean r9 = r4.get(r8)
            if (r9 == 0) goto Lc6
            int r9 = getInt(r19)
            long r9 = (long) r9
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            r6[r8] = r9
        Lc6:
            int r8 = r8 + 1
            goto Lb1
        Lc9:
            org.apache.commons.compress.archivers.sevenz.Folder[] r7 = r0.folders
            int r8 = r7.length
            r9 = 0
            r10 = 0
            r11 = 0
        Lcf:
            if (r9 >= r8) goto L107
            r12 = r7[r9]
            int r13 = r12.numUnpackSubStreams
            if (r13 != r5) goto Le9
            boolean r13 = r12.hasCrc
            if (r13 == 0) goto Le9
            java.util.BitSet r13 = r2.hasCrc
            r13.set(r10, r5)
            long[] r13 = r2.crcs
            long r14 = r12.crc
            r13[r10] = r14
            int r10 = r10 + 1
            goto L104
        Le9:
            r13 = 0
        Lea:
            int r14 = r12.numUnpackSubStreams
            if (r13 >= r14) goto L104
            java.util.BitSet r14 = r2.hasCrc
            boolean r15 = r4.get(r11)
            r14.set(r10, r15)
            long[] r14 = r2.crcs
            r15 = r6[r11]
            r14[r10] = r15
            int r10 = r10 + 1
            int r11 = r11 + 1
            int r13 = r13 + 1
            goto Lea
        L104:
            int r9 = r9 + 1
            goto Lcf
        L107:
            getUnsignedByte(r19)
            goto L10d
        L10b:
            r1 = r18
        L10d:
            r0.subStreamsInfo = r2
            return
    }

    private static long readUint64(java.nio.ByteBuffer r11) throws java.io.IOException {
            int r0 = getUnsignedByte(r11)
            long r0 = (long) r0
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            r5 = 0
            r6 = r3
        Lb:
            r8 = 8
            if (r5 >= r8) goto L2b
            long r9 = (long) r2
            long r9 = r9 & r0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L1d
            int r2 = r2 + (-1)
            long r2 = (long) r2
            long r0 = r0 & r2
            int r5 = r5 * r8
            long r0 = r0 << r5
            long r0 = r0 | r6
            return r0
        L1d:
            int r8 = getUnsignedByte(r11)
            long r8 = (long) r8
            int r10 = r5 * 8
            long r8 = r8 << r10
            long r6 = r6 | r8
            int r2 = r2 >>> 1
            int r5 = r5 + 1
            goto Lb
        L2b:
            return r6
    }

    private void readUnpackInfo(java.nio.ByteBuffer r10, org.apache.commons.compress.archivers.sevenz.Archive r11) throws java.io.IOException {
            r9 = this;
            getUnsignedByte(r10)
            long r0 = readUint64(r10)
            int r0 = (int) r0
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = new org.apache.commons.compress.archivers.sevenz.Folder[r0]
            r11.folders = r1
            getUnsignedByte(r10)
            r11 = 0
            r2 = r11
        L11:
            if (r2 >= r0) goto L1c
            org.apache.commons.compress.archivers.sevenz.Folder r3 = r9.readFolder(r10)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L1c:
            getUnsignedByte(r10)
            r2 = r11
        L20:
            if (r2 >= r0) goto L48
            r3 = r1[r2]
            java.lang.String r4 = "totalOutputStreams"
            long r5 = r3.totalOutputStreams
            assertFitsIntoNonNegativeInt(r4, r5)
            long r4 = r3.totalOutputStreams
            int r4 = (int) r4
            long[] r4 = new long[r4]
            r3.unpackSizes = r4
            r4 = r11
        L33:
            long r5 = (long) r4
            long r7 = r3.totalOutputStreams
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L45
            long[] r5 = r3.unpackSizes
            long r6 = readUint64(r10)
            r5[r4] = r6
            int r4 = r4 + 1
            goto L33
        L45:
            int r2 = r2 + 1
            goto L20
        L48:
            int r2 = getUnsignedByte(r10)
            r3 = 10
            if (r2 != r3) goto L7c
            java.util.BitSet r2 = r9.readAllOrBits(r10, r0)
            r3 = r11
        L55:
            if (r3 >= r0) goto L79
            boolean r4 = r2.get(r3)
            if (r4 == 0) goto L72
            r4 = r1[r3]
            r5 = 1
            r4.hasCrc = r5
            r4 = r1[r3]
            int r5 = getInt(r10)
            long r5 = (long) r5
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            r4.crc = r5
            goto L76
        L72:
            r4 = r1[r3]
            r4.hasCrc = r11
        L76:
            int r3 = r3 + 1
            goto L55
        L79:
            getUnsignedByte(r10)
        L7c:
            return
    }

    private void reopenFolderInputStream(int r8, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r9) throws java.io.IOException {
            r7 = this;
            java.util.ArrayList<java.io.InputStream> r0 = r7.deferredBlockStreams
            r0.clear()
            java.io.InputStream r0 = r7.currentFolderInputStream
            if (r0 == 0) goto Lf
            r0.close()
            r0 = 0
            r7.currentFolderInputStream = r0
        Lf:
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r7.archive
            org.apache.commons.compress.archivers.sevenz.Folder[] r0 = r0.folders
            r2 = r0[r8]
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r7.archive
            org.apache.commons.compress.archivers.sevenz.StreamMap r0 = r0.streamMap
            int[] r0 = r0.folderFirstPackStreamIndex
            r5 = r0[r8]
            org.apache.commons.compress.archivers.sevenz.Archive r8 = r7.archive
            long r0 = r8.packPos
            r3 = 32
            long r0 = r0 + r3
            org.apache.commons.compress.archivers.sevenz.Archive r8 = r7.archive
            org.apache.commons.compress.archivers.sevenz.StreamMap r8 = r8.streamMap
            long[] r8 = r8.packStreamOffsets
            r3 = r8[r5]
            long r3 = r3 + r0
            r1 = r7
            r6 = r9
            java.io.InputStream r8 = r1.buildDecoderStack(r2, r3, r5, r6)
            r7.currentFolderInputStream = r8
            return
    }

    private org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics sanityCheckAndCollectStatistics(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFile$ArchiveStatistics r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$ArchiveStatistics
            r1 = 0
            r0.<init>(r1)
            int r1 = getUnsignedByte(r4)
            r2 = 2
            if (r1 != r2) goto L14
            r3.sanityCheckArchiveProperties(r4)
            int r1 = getUnsignedByte(r4)
        L14:
            r2 = 3
            if (r1 == r2) goto L43
            r2 = 4
            if (r1 != r2) goto L21
            r3.sanityCheckStreamsInfo(r4, r0)
            int r1 = getUnsignedByte(r4)
        L21:
            r2 = 5
            if (r1 != r2) goto L2b
            r3.sanityCheckFilesInfo(r4, r0)
            int r1 = getUnsignedByte(r4)
        L2b:
            if (r1 != 0) goto L2e
            return r0
        L2e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Badly terminated header, found "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L43:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Additional streams unsupported"
            r4.<init>(r0)
            throw r4
    }

    private void sanityCheckArchiveProperties(java.nio.ByteBuffer r5) throws java.io.IOException {
            r4 = this;
            long r0 = readUint64(r5)
        L4:
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2a
            java.lang.String r0 = "propertySize"
            long r1 = readUint64(r5)
            int r0 = assertFitsIntoNonNegativeInt(r0, r1)
            long r0 = (long) r0
            long r2 = skipBytesFully(r5, r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            long r0 = readUint64(r5)
            goto L4
        L22:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "invalid property size"
            r5.<init>(r0)
            throw r5
        L2a:
            return
    }

    private void sanityCheckFilesInfo(java.nio.ByteBuffer r9, org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r10) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "numFiles"
            long r1 = readUint64(r9)
            int r0 = assertFitsIntoNonNegativeInt(r0, r1)
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$402(r10, r0)
            r0 = -1
            r1 = r0
        Lf:
            int r2 = getUnsignedByte(r9)
            r3 = 0
            if (r2 != 0) goto L23
            int r9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            int r0 = java.lang.Math.max(r1, r3)
            int r9 = r9 - r0
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$502(r10, r9)
            return
        L23:
            long r4 = readUint64(r9)
            java.lang.String r6 = "Not implemented"
            switch(r2) {
                case 14: goto L17f;
                case 15: goto L170;
                case 16: goto L161;
                case 17: goto L101;
                case 18: goto Ld4;
                case 19: goto La7;
                case 20: goto L7a;
                case 21: goto L4e;
                case 22: goto L2c;
                case 23: goto L2c;
                case 24: goto L46;
                case 25: goto L35;
                default: goto L2c;
            }
        L2c:
            long r6 = skipBytesFully(r9, r4)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 < 0) goto L18d
            goto Lf
        L35:
            long r2 = skipBytesFully(r9, r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L3e
            goto Lf
        L3e:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Incomplete kDummy property"
            r9.<init>(r10)
            throw r9
        L46:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "kStartPos is unsupported, please report"
            r9.<init>(r10)
            throw r9
        L4e:
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            java.util.BitSet r2 = r8.readAllOrBits(r9, r2)
            int r2 = r2.cardinality()
            int r3 = getUnsignedByte(r9)
            if (r3 != 0) goto L74
            int r2 = r2 * 4
            long r2 = (long) r2
            long r4 = skipBytesFully(r9, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L6c
            goto Lf
        L6c:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "invalid windows attributes size"
            r9.<init>(r10)
            throw r9
        L74:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L7a:
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            java.util.BitSet r2 = r8.readAllOrBits(r9, r2)
            int r2 = r2.cardinality()
            int r3 = getUnsignedByte(r9)
            if (r3 != 0) goto La1
            int r2 = r2 * 8
            long r2 = (long) r2
            long r4 = skipBytesFully(r9, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L99
            goto Lf
        L99:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "invalid modification dates size"
            r9.<init>(r10)
            throw r9
        La1:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        La7:
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            java.util.BitSet r2 = r8.readAllOrBits(r9, r2)
            int r2 = r2.cardinality()
            int r3 = getUnsignedByte(r9)
            if (r3 != 0) goto Lce
            int r2 = r2 * 8
            long r2 = (long) r2
            long r4 = skipBytesFully(r9, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto Lc6
            goto Lf
        Lc6:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "invalid access dates size"
            r9.<init>(r10)
            throw r9
        Lce:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        Ld4:
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            java.util.BitSet r2 = r8.readAllOrBits(r9, r2)
            int r2 = r2.cardinality()
            int r3 = getUnsignedByte(r9)
            if (r3 != 0) goto Lfb
            int r2 = r2 * 8
            long r2 = (long) r2
            long r4 = skipBytesFully(r9, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto Lf3
            goto Lf
        Lf3:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "invalid creation dates size"
            r9.<init>(r10)
            throw r9
        Lfb:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L101:
            int r2 = getUnsignedByte(r9)
            if (r2 != 0) goto L15b
            r6 = 1
            long r4 = r4 - r6
            java.lang.String r2 = "file names length"
            int r2 = assertFitsIntoNonNegativeInt(r2, r4)
            r4 = r2 & 1
            if (r4 != 0) goto L153
            r4 = r3
        L115:
            if (r3 >= r2) goto L122
            char r5 = getChar(r9)
            if (r5 != 0) goto L11f
            int r4 = r4 + 1
        L11f:
            int r3 = r3 + 2
            goto L115
        L122:
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            if (r4 != r2) goto L12a
            goto Lf
        L12a:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid number of file names ("
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " instead of "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L153:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "File names length invalid"
            r9.<init>(r10)
            throw r9
        L15b:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L161:
            if (r1 == r0) goto L168
            r8.readBits(r9, r1)
            goto Lf
        L168:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Header format error: kEmptyStream must appear before kAnti"
            r9.<init>(r10)
            throw r9
        L170:
            if (r1 == r0) goto L177
            r8.readBits(r9, r1)
            goto Lf
        L177:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Header format error: kEmptyStream must appear before kEmptyFile"
            r9.<init>(r10)
            throw r9
        L17f:
            int r1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$400(r10)
            java.util.BitSet r1 = r8.readBits(r9, r1)
            int r1 = r1.cardinality()
            goto Lf
        L18d:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Incomplete property of type "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private int sanityCheckFolder(java.nio.ByteBuffer r18, org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r19) throws java.io.IOException {
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "numCoders"
            long r3 = readUint64(r18)
            int r2 = assertFitsIntoNonNegativeInt(r2, r3)
            if (r2 == 0) goto L126
            long r3 = (long) r2
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$614(r1, r3)
            r3 = 0
            r5 = 0
            r7 = r3
            r9 = r7
            r6 = r5
        L1a:
            r11 = 1
            r13 = 1
            if (r6 >= r2) goto L80
            int r14 = getUnsignedByte(r18)
            r15 = r14 & 15
            byte[] r15 = new byte[r15]
            get(r0, r15)
            r15 = r14 & 16
            if (r15 != 0) goto L30
            r15 = r13
            goto L31
        L30:
            r15 = r5
        L31:
            r16 = r14 & 32
            if (r16 == 0) goto L36
            goto L37
        L36:
            r13 = r5
        L37:
            r14 = r14 & 128(0x80, float:1.8E-43)
            if (r14 != 0) goto L78
            if (r15 == 0) goto L3f
            long r7 = r7 + r11
            goto L56
        L3f:
            java.lang.String r11 = "numInStreams"
            long r14 = readUint64(r18)
            int r11 = assertFitsIntoNonNegativeInt(r11, r14)
            long r11 = (long) r11
            long r7 = r7 + r11
            java.lang.String r11 = "numOutStreams"
            long r14 = readUint64(r18)
            int r11 = assertFitsIntoNonNegativeInt(r11, r14)
            long r11 = (long) r11
        L56:
            long r9 = r9 + r11
            if (r13 == 0) goto L75
            java.lang.String r11 = "propertiesSize"
            long r12 = readUint64(r18)
            int r11 = assertFitsIntoNonNegativeInt(r11, r12)
            long r11 = (long) r11
            long r13 = skipBytesFully(r0, r11)
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 < 0) goto L6d
            goto L75
        L6d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "invalid propertiesSize in folder"
            r0.<init>(r1)
            throw r0
        L75:
            int r6 = r6 + 1
            goto L1a
        L78:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Alternative methods are unsupported, please report. The reference implementation doesn't support them either."
            r0.<init>(r1)
            throw r0
        L80:
            java.lang.String r2 = "totalInStreams"
            assertFitsIntoNonNegativeInt(r2, r7)
            java.lang.String r2 = "totalOutStreams"
            assertFitsIntoNonNegativeInt(r2, r9)
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$714(r1, r9)
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$814(r1, r7)
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L11e
            java.lang.String r1 = "numBindPairs"
            long r2 = r9 - r11
            int r1 = assertFitsIntoNonNegativeInt(r1, r2)
            long r2 = (long) r1
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L116
            java.util.BitSet r4 = new java.util.BitSet
            int r6 = (int) r7
            r4.<init>(r6)
            r6 = r5
        La8:
            if (r6 >= r1) goto Lde
            java.lang.String r11 = "inIndex"
            long r14 = readUint64(r18)
            int r11 = assertFitsIntoNonNegativeInt(r11, r14)
            long r14 = (long) r11
            int r12 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r12 <= 0) goto Ld6
            r4.set(r11)
            java.lang.String r11 = "outIndex"
            long r14 = readUint64(r18)
            int r11 = assertFitsIntoNonNegativeInt(r11, r14)
            long r11 = (long) r11
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 <= 0) goto Lce
            int r6 = r6 + 1
            goto La8
        Lce:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "outIndex is bigger than number of outStreams"
            r0.<init>(r1)
            throw r0
        Ld6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "inIndex is bigger than number of inStreams"
            r0.<init>(r1)
            throw r0
        Lde:
            java.lang.String r1 = "numPackedStreams"
            long r2 = r7 - r2
            int r1 = assertFitsIntoNonNegativeInt(r1, r2)
            if (r1 != r13) goto Lf8
            int r0 = r4.nextClearBit(r5)
            r1 = -1
            if (r0 == r1) goto Lf0
            goto L114
        Lf0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Couldn't find stream's bind pair index"
            r0.<init>(r1)
            throw r0
        Lf8:
            if (r5 >= r1) goto L114
            java.lang.String r2 = "packedStreamIndex"
            long r3 = readUint64(r18)
            int r2 = assertFitsIntoNonNegativeInt(r2, r3)
            long r2 = (long) r2
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L10c
            int r5 = r5 + 1
            goto Lf8
        L10c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "packedStreamIndex is bigger than number of totalInStreams"
            r0.<init>(r1)
            throw r0
        L114:
            int r0 = (int) r9
            return r0
        L116:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Total input streams can't be less than the number of bind pairs"
            r0.<init>(r1)
            throw r0
        L11e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Total output streams can't be 0"
            r0.<init>(r1)
            throw r0
        L126:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Folder without coders"
            r0.<init>(r1)
            throw r0
    }

    private void sanityCheckPackInfo(java.nio.ByteBuffer r19, org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r20) throws java.io.IOException {
            r18 = this;
            r0 = r18
            r1 = r19
            long r2 = readUint64(r19)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.lang.String r7 = ") is out of range"
            if (r6 < 0) goto Lc1
            r8 = 32
            long r8 = r8 + r2
            java.nio.channels.SeekableByteChannel r6 = r0.channel
            long r10 = r6.size()
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 > 0) goto Lc1
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 < 0) goto Lc1
            long r10 = readUint64(r19)
            java.lang.String r6 = "numPackStreams"
            int r6 = assertFitsIntoNonNegativeInt(r6, r10)
            r10 = r20
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$902(r10, r6)
            int r6 = getUnsignedByte(r19)
            r11 = 9
            if (r6 != r11) goto L7b
            r6 = 0
            r11 = r4
        L3a:
            int r13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$900(r20)
            if (r6 >= r13) goto L77
            long r13 = readUint64(r19)
            long r11 = r11 + r13
            long r15 = r8 + r11
            int r17 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r17 < 0) goto L5e
            java.nio.channels.SeekableByteChannel r4 = r0.channel
            long r4 = r4.size()
            int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r4 > 0) goto L5e
            int r4 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r4 < 0) goto L5e
            int r6 = r6 + 1
            r4 = 0
            goto L3a
        L5e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "packSize ("
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r13)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L77:
            int r6 = getUnsignedByte(r19)
        L7b:
            r2 = 10
            if (r6 != r2) goto La3
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$900(r20)
            java.util.BitSet r2 = r0.readAllOrBits(r1, r2)
            int r2 = r2.cardinality()
            int r2 = r2 * 4
            long r2 = (long) r2
            long r4 = skipBytesFully(r1, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L9b
            int r6 = getUnsignedByte(r19)
            goto La3
        L9b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "invalid number of CRCs in PackInfo"
            r1.<init>(r2)
            throw r1
        La3:
            if (r6 != 0) goto La6
            return
        La6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Badly terminated PackInfo ("
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lc1:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "packPos ("
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private void sanityCheckStreamsInfo(java.nio.ByteBuffer r3, org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r4) throws java.io.IOException {
            r2 = this;
            int r0 = getUnsignedByte(r3)
            r1 = 6
            if (r0 != r1) goto Le
            r2.sanityCheckPackInfo(r3, r4)
            int r0 = getUnsignedByte(r3)
        Le:
            r1 = 7
            if (r0 != r1) goto L18
            r2.sanityCheckUnpackInfo(r3, r4)
            int r0 = getUnsignedByte(r3)
        L18:
            r1 = 8
            if (r0 != r1) goto L23
            r2.sanityCheckSubStreamsInfo(r3, r4)
            int r0 = getUnsignedByte(r3)
        L23:
            if (r0 != 0) goto L26
            return
        L26:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Badly terminated StreamsInfo"
            r3.<init>(r4)
            throw r3
    }

    private void sanityCheckSubStreamsInfo(java.nio.ByteBuffer r10, org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r11) throws java.io.IOException {
            r9 = this;
            int r0 = getUnsignedByte(r10)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = 13
            r3 = 0
            if (r0 != r2) goto L42
            r0 = r3
        Lf:
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1000(r11)
            if (r0 >= r2) goto L29
            java.lang.String r2 = "numStreams"
            long r4 = readUint64(r10)
            int r2 = assertFitsIntoNonNegativeInt(r2, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            int r0 = r0 + 1
            goto Lf
        L29:
            java.util.stream.Stream r0 = r1.stream()
            org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda4 r2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$$ExternalSyntheticLambda4
            r2.<init>()
            java.util.stream.LongStream r0 = r0.mapToLong(r2)
            long r4 = r0.sum()
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1102(r11, r4)
            int r0 = getUnsignedByte(r10)
            goto L4a
        L42:
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1000(r11)
            long r4 = (long) r2
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1102(r11, r4)
        L4a:
            java.lang.String r2 = "totalUnpackStreams"
            long r4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1100(r11)
            assertFitsIntoNonNegativeInt(r2, r4)
            r2 = 9
            if (r0 != r2) goto L8c
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L6e
            goto L5b
        L6e:
            r4 = r3
        L6f:
            int r5 = r2 + (-1)
            if (r4 >= r5) goto L5b
            long r5 = readUint64(r10)
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L80
            int r4 = r4 + 1
            goto L6f
        L80:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "negative unpackSize"
            r10.<init>(r11)
            throw r10
        L88:
            int r0 = getUnsignedByte(r10)
        L8c:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lac
            java.util.BitSet r1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1200(r11)
            if (r1 != 0) goto L9d
            int r11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1000(r11)
            goto Ldd
        L9d:
            int r1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1000(r11)
            java.util.BitSet r11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1200(r11)
            int r11 = r11.cardinality()
            int r11 = r1 - r11
            goto Ldd
        Lac:
            java.util.Iterator r1 = r1.iterator()
            r2 = r3
        Lb1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ldc
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 1
            if (r4 != r5) goto Lda
            java.util.BitSet r5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1200(r11)
            if (r5 == 0) goto Lda
            java.util.BitSet r5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1200(r11)
            int r6 = r2 + 1
            boolean r2 = r5.get(r2)
            if (r2 != 0) goto Ld8
            r2 = r6
            goto Lda
        Ld8:
            r2 = r6
            goto Lb1
        Lda:
            int r3 = r3 + r4
            goto Lb1
        Ldc:
            r11 = r3
        Ldd:
            r1 = 10
            if (r0 != r1) goto L107
            java.lang.String r0 = "numDigests"
            long r1 = (long) r11
            assertFitsIntoNonNegativeInt(r0, r1)
            java.util.BitSet r11 = r9.readAllOrBits(r10, r11)
            int r11 = r11.cardinality()
            int r11 = r11 * 4
            long r0 = (long) r11
            long r2 = skipBytesFully(r10, r0)
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 < 0) goto Lff
            int r0 = getUnsignedByte(r10)
            goto L107
        Lff:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "invalid number of missing CRCs in SubStreamInfo"
            r10.<init>(r11)
            throw r10
        L107:
            if (r0 != 0) goto L10a
            return
        L10a:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Badly terminated SubStreamsInfo"
            r10.<init>(r11)
            throw r10
    }

    private void sanityCheckUnpackInfo(java.nio.ByteBuffer r9, org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics r10) throws java.io.IOException {
            r8 = this;
            int r0 = getUnsignedByte(r9)
            r1 = 11
            if (r0 != r1) goto Le5
            long r0 = readUint64(r9)
            java.lang.String r2 = "numFolders"
            int r0 = assertFitsIntoNonNegativeInt(r2, r0)
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1002(r10, r0)
            int r0 = getUnsignedByte(r9)
            if (r0 != 0) goto Ldd
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            r2 = r1
        L22:
            int r3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1000(r10)
            if (r2 >= r3) goto L36
            int r3 = r8.sanityCheckFolder(r9, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L22
        L36:
            long r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$700(r10)
            int r4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1000(r10)
            long r4 = (long) r4
            long r2 = r2 - r4
            long r4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$800(r10)
            long r4 = r4 - r2
            int r2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$900(r10)
            long r2 = (long) r2
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto Ld5
            int r2 = getUnsignedByte(r9)
            r3 = 12
            if (r2 != r3) goto Lc0
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r1
        L6b:
            if (r3 >= r2) goto L5a
            long r4 = readUint64(r9)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7a
            int r3 = r3 + 1
            goto L6b
        L7a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "negative unpackSize"
            r9.<init>(r10)
            throw r9
        L82:
            int r0 = getUnsignedByte(r9)
            r1 = 10
            if (r0 != r1) goto Lb5
            int r0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1000(r10)
            java.util.BitSet r0 = r8.readAllOrBits(r9, r0)
            org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1202(r10, r0)
            java.util.BitSet r10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.ArchiveStatistics.access$1200(r10)
            int r10 = r10.cardinality()
            int r10 = r10 * 4
            long r0 = (long) r10
            long r2 = skipBytesFully(r9, r0)
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 < 0) goto Lad
            int r0 = getUnsignedByte(r9)
            goto Lb5
        Lad:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "invalid number of CRCs in UnpackInfo"
            r9.<init>(r10)
            throw r9
        Lb5:
            if (r0 != 0) goto Lb8
            return
        Lb8:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Badly terminated UnpackInfo"
            r9.<init>(r10)
            throw r9
        Lc0:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected kCodersUnpackSize, got "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Ld5:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "archive doesn't contain enough packed streams"
            r9.<init>(r10)
            throw r9
        Ldd:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "External unsupported"
            r9.<init>(r10)
            throw r9
        Le5:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected kFolder, got "
            r10.<init>(r1)
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private static long skipBytesFully(java.nio.ByteBuffer r4, long r5) {
            r0 = 1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r4 = 0
            return r4
        L9:
            int r0 = r4.position()
            int r1 = r4.remaining()
            long r1 = (long) r1
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L17
            r5 = r1
        L17:
            int r1 = (int) r5
            int r0 = r0 + r1
            r4.position(r0)
            return r5
    }

    private boolean skipEntriesWhenNeeded(int r7, boolean r8, int r9) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r6.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = r0.files
            r0 = r0[r7]
            int r1 = r6.currentEntryIndex
            r2 = 0
            if (r1 != r7) goto L12
            boolean r1 = r6.hasCurrentEntryBeenRead()
            if (r1 != 0) goto L12
            return r2
        L12:
            org.apache.commons.compress.archivers.sevenz.Archive r1 = r6.archive
            org.apache.commons.compress.archivers.sevenz.StreamMap r1 = r1.streamMap
            int[] r1 = r1.folderFirstFileIndex
            int r3 = r6.currentFolderIndex
            r1 = r1[r3]
            r3 = 1
            if (r8 == 0) goto L29
            int r8 = r6.currentEntryIndex
            if (r8 >= r7) goto L26
            int r1 = r8 + 1
            goto L29
        L26:
            r6.reopenFolderInputStream(r9, r0)
        L29:
            if (r1 >= r7) goto L8d
            org.apache.commons.compress.archivers.sevenz.Archive r8 = r6.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r8 = r8.files
            r8 = r8[r1]
            org.apache.commons.io.input.BoundedInputStream$Builder r9 = org.apache.commons.io.input.BoundedInputStream.builder()
            java.io.InputStream r4 = r6.currentFolderInputStream
            org.apache.commons.io.build.AbstractOriginSupplier r9 = r9.setInputStream(r4)
            org.apache.commons.io.input.BoundedInputStream$Builder r9 = (org.apache.commons.io.input.BoundedInputStream.Builder) r9
            long r4 = r8.getSize()
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r9 = r9.setMaxCount(r4)
            org.apache.commons.io.input.BoundedInputStream$Builder r9 = (org.apache.commons.io.input.BoundedInputStream.Builder) r9
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r9 = r9.setPropagateClose(r2)
            org.apache.commons.io.input.BoundedInputStream$Builder r9 = (org.apache.commons.io.input.BoundedInputStream.Builder) r9
            org.apache.commons.io.input.BoundedInputStream r9 = r9.get()
            boolean r4 = r8.getHasCrc()
            if (r4 == 0) goto L7e
            org.apache.commons.io.input.ChecksumInputStream$Builder r4 = org.apache.commons.io.input.ChecksumInputStream.builder()
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32
            r5.<init>()
            org.apache.commons.io.input.ChecksumInputStream$Builder r4 = r4.setChecksum(r5)
            org.apache.commons.io.build.AbstractOriginSupplier r9 = r4.setInputStream(r9)
            org.apache.commons.io.input.ChecksumInputStream$Builder r9 = (org.apache.commons.io.input.ChecksumInputStream.Builder) r9
            long r4 = r8.getSize()
            org.apache.commons.io.input.ChecksumInputStream$Builder r9 = r9.setCountThreshold(r4)
            long r4 = r8.getCrcValue()
            org.apache.commons.io.input.ChecksumInputStream$Builder r9 = r9.setExpectedChecksumValue(r4)
            org.apache.commons.io.input.ChecksumInputStream r9 = r9.get()
        L7e:
            java.util.ArrayList<java.io.InputStream> r4 = r6.deferredBlockStreams
            r4.add(r9)
            java.lang.Iterable r9 = r0.getContentMethods()
            r8.setContentMethods(r9)
            int r1 = r1 + 1
            goto L29
        L8d:
            return r3
    }

    private org.apache.commons.compress.archivers.sevenz.Archive tryToLocateEndHeader(byte[] r22) throws java.io.IOException {
            r21 = this;
            r0 = r21
            r1 = 1
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            java.nio.channels.SeekableByteChannel r3 = r0.channel
            long r3 = r3.position()
            r5 = 20
            long r3 = r3 + r5
            java.nio.channels.SeekableByteChannel r5 = r0.channel
            long r5 = r5.position()
            r7 = 1048576(0x100000, double:5.180654E-318)
            long r5 = r5 + r7
            java.nio.channels.SeekableByteChannel r9 = r0.channel
            long r9 = r9.size()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L2b
            java.nio.channels.SeekableByteChannel r5 = r0.channel
            long r5 = r5.position()
            goto L32
        L2b:
            java.nio.channels.SeekableByteChannel r5 = r0.channel
            long r5 = r5.size()
            long r5 = r5 - r7
        L32:
            java.nio.channels.SeekableByteChannel r7 = r0.channel
            long r7 = r7.size()
            r9 = 1
            long r7 = r7 - r9
        L3b:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 <= 0) goto L89
            long r7 = r7 - r9
            java.nio.channels.SeekableByteChannel r11 = r0.channel
            r11.position(r7)
            r2.rewind()
            java.nio.channels.SeekableByteChannel r11 = r0.channel
            int r11 = r11.read(r2)
            if (r11 < r1) goto L83
            byte[] r11 = r2.array()
            r12 = 0
            r11 = r11[r12]
            r13 = 23
            if (r11 == r13) goto L5d
            if (r11 != r1) goto L80
        L5d:
            long r15 = r7 - r3
            java.nio.channels.SeekableByteChannel r11 = r0.channel     // Catch: java.lang.Exception -> L80
            long r13 = r11.size()     // Catch: java.lang.Exception -> L80
            long r17 = r13 - r7
            org.apache.commons.compress.archivers.sevenz.StartHeader r11 = new org.apache.commons.compress.archivers.sevenz.StartHeader     // Catch: java.lang.Exception -> L80
            r19 = 0
            r14 = r11
            r14.<init>(r15, r17, r19)     // Catch: java.lang.Exception -> L80
            r13 = r22
            org.apache.commons.compress.archivers.sevenz.Archive r11 = r0.initializeArchive(r11, r13, r12)     // Catch: java.lang.Exception -> L3b
            long[] r12 = r11.packSizes     // Catch: java.lang.Exception -> L3b
            int r12 = r12.length     // Catch: java.lang.Exception -> L3b
            if (r12 <= 0) goto L3b
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r12 = r11.files     // Catch: java.lang.Exception -> L3b
            int r12 = r12.length     // Catch: java.lang.Exception -> L3b
            if (r12 <= 0) goto L3b
            return r11
        L80:
            r13 = r22
            goto L3b
        L83:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L89:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Start header corrupt and unable to guess end header"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            java.nio.channels.SeekableByteChannel r0 = r4.channel
            if (r0 == 0) goto L22
            r1 = 0
            r2 = 0
            r0.close()     // Catch: java.lang.Throwable -> L15
            r4.channel = r2
            byte[] r0 = r4.password
            if (r0 == 0) goto L12
            java.util.Arrays.fill(r0, r1)
        L12:
            r4.password = r2
            goto L22
        L15:
            r0 = move-exception
            r4.channel = r2
            byte[] r3 = r4.password
            if (r3 == 0) goto L1f
            java.util.Arrays.fill(r3, r1)
        L1f:
            r4.password = r2
            throw r0
        L22:
            return
    }

    public java.lang.String getDefaultName() {
            r3 = this;
            java.lang.String r0 = "unknown archive"
            java.lang.String r1 = r3.fileName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = r3.fileName
            if (r0 != 0) goto Lf
            goto L3c
        Lf:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.fileName
            r0.<init>(r1)
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "."
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L28
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "~"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L3c:
            r0 = 0
            return r0
    }

    public java.lang.Iterable<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> getEntries() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            org.apache.commons.compress.archivers.sevenz.Archive r1 = r2.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r1 = r1.files
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return r0
    }

    public java.io.InputStream getInputStream(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            org.apache.commons.compress.archivers.sevenz.Archive r1 = r3.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r1 = r1.files
            int r1 = r1.length
            if (r0 >= r1) goto L14
            org.apache.commons.compress.archivers.sevenz.Archive r1 = r3.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r1 = r1.files
            r1 = r1[r0]
            if (r4 != r1) goto L11
            goto L15
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            r0 = -1
        L15:
            if (r0 < 0) goto L2c
            r4 = 1
            r3.buildDecodingStream(r0, r4)
            r3.currentEntryIndex = r0
            org.apache.commons.compress.archivers.sevenz.Archive r4 = r3.archive
            org.apache.commons.compress.archivers.sevenz.StreamMap r4 = r4.streamMap
            int[] r4 = r4.fileFolderIndex
            r4 = r4[r0]
            r3.currentFolderIndex = r4
            java.io.InputStream r4 = r3.getCurrentStream()
            return r4
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can not find "
            r1.<init>(r2)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " in "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r1 = r3.fileName
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry getNextEntry() throws java.io.IOException {
            r3 = this;
            int r0 = r3.currentEntryIndex
            org.apache.commons.compress.archivers.sevenz.Archive r1 = r3.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r1 = r1.files
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r0 < r1) goto Ld
            r0 = 0
            return r0
        Ld:
            int r0 = r3.currentEntryIndex
            int r0 = r0 + 1
            r3.currentEntryIndex = r0
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r3.archive
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = r0.files
            int r1 = r3.currentEntryIndex
            r0 = r0[r1]
            java.lang.String r1 = r0.getName()
            if (r1 != 0) goto L2c
            boolean r1 = r3.useDefaultNameForUnnamedEntries
            if (r1 == 0) goto L2c
            java.lang.String r1 = r3.getDefaultName()
            r0.setName(r1)
        L2c:
            int r1 = r3.currentEntryIndex
            r2 = 0
            r3.buildDecodingStream(r1, r2)
            r1 = 0
            r3.compressedBytesReadFromCurrentEntry = r1
            r3.uncompressedBytesReadFromCurrentEntry = r1
            return r0
    }

    public org.apache.commons.compress.utils.InputStreamStatistics getStatisticsForCurrentEntry() {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZFile$2 r0 = new org.apache.commons.compress.archivers.sevenz.SevenZFile$2
            r0.<init>(r1)
            return r0
    }

    public int read() throws java.io.IOException {
            r5 = this;
            java.io.InputStream r0 = r5.getCurrentStream()
            int r0 = r0.read()
            if (r0 < 0) goto L11
            long r1 = r5.uncompressedBytesReadFromCurrentEntry
            r3 = 1
            long r1 = r1 + r3
            r5.uncompressedBytesReadFromCurrentEntry = r1
        L11:
            return r0
    }

    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.InputStream r0 = r2.getCurrentStream()
            int r3 = r0.read(r3, r4, r5)
            if (r3 <= 0) goto L14
            long r4 = r2.uncompressedBytesReadFromCurrentEntry
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.uncompressedBytesReadFromCurrentEntry = r4
        L14:
            return r3
    }

    public java.lang.String toString() {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.Archive r0 = r1.archive
            java.lang.String r0 = r0.toString()
            return r0
    }
}
