package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ZipArchiveInputStream extends org.apache.commons.compress.archivers.ArchiveInputStream<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> implements org.apache.commons.compress.utils.InputStreamStatistics {
    private static final byte[] APK_SIGNING_BLOCK_MAGIC = null;
    private static final byte[] CFH = null;
    private static final int CFH_LEN = 46;
    private static final byte[] DD = null;
    private static final byte[] LFH = null;
    private static final int LFH_LEN = 30;
    private static final java.math.BigInteger LONG_MAX = null;
    public static final int PREAMBLE_GARBAGE_MAX_SIZE = 4096;
    private static final long TWO_EXP_32 = 4294967296L;
    private static final java.lang.String USE_ZIPFILE_INSTEAD_OF_STREAM_DISCLAIMER = " while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See https://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile";
    private final boolean allowStoredEntriesWithDataDescriptor;
    private final java.nio.ByteBuffer buf;
    private boolean closed;
    private org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry current;
    private int entriesRead;
    private boolean hitCentralDirectory;
    private final java.util.zip.Inflater inf;
    private java.io.ByteArrayInputStream lastStoredEntry;
    private final byte[] lfhBuf;
    private final byte[] shortBuf;
    private final byte[] skipBuf;
    private final boolean skipSplitSig;
    private final byte[] twoDwordBuf;
    private long uncompressedCount;
    private final boolean useUnicodeExtraFields;
    private final byte[] wordBuf;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod = null;

        static {
                org.apache.commons.compress.archivers.zip.ZipMethod[] r0 = org.apache.commons.compress.archivers.zip.ZipMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod = r0
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod     // Catch: java.lang.NoSuchFieldError -> L33
                org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private final class BoundCountInputStream extends org.apache.commons.io.input.BoundedInputStream {
        final /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveInputStream this$0;

        BoundCountInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream r1, java.io.InputStream r2, long r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3)
                return
        }

        private boolean atMaxLength() {
                r4 = this;
                long r0 = r4.getMaxCount()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L18
                long r0 = r4.getCount()
                long r2 = r4.getMaxCount()
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                return r0
        }

        private int readCount(int r4) {
                r3 = this;
                r0 = -1
                if (r4 == r0) goto L12
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream r0 = r3.this$0
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.access$000(r0, r4)
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream r0 = r3.this$0
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.access$100(r0)
                long r1 = (long) r4
                org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$214(r0, r1)
            L12:
                return r4
        }

        @Override // org.apache.commons.io.input.BoundedInputStream, org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.atMaxLength()
                r1 = -1
                if (r0 == 0) goto L8
                return r1
            L8:
                int r0 = super.read()
                if (r0 == r1) goto L12
                r1 = 1
                r2.readCount(r1)
            L12:
                return r0
        }

        @Override // org.apache.commons.io.input.BoundedInputStream, org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
                r6 = this;
                if (r9 != 0) goto L4
                r7 = 0
                return r7
            L4:
                boolean r0 = r6.atMaxLength()
                if (r0 == 0) goto Lc
                r7 = -1
                return r7
            Lc:
                long r0 = r6.getMaxCount()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L25
                long r0 = (long) r9
                long r2 = r6.getMaxCount()
                long r4 = r6.getCount()
                long r2 = r2 - r4
                long r0 = java.lang.Math.min(r0, r2)
                goto L26
            L25:
                long r0 = (long) r9
            L26:
                int r9 = (int) r0
                int r7 = super.read(r7, r8, r9)
                int r7 = r6.readCount(r7)
                return r7
        }
    }

    private static final class CurrentEntry {
        private long bytesRead;
        private long bytesReadFromStream;
        private final java.util.zip.CRC32 crc;
        private final org.apache.commons.compress.archivers.zip.ZipArchiveEntry entry;
        private boolean hasDataDescriptor;
        private java.io.InputStream inputStream;
        private boolean usesZip64;

        private CurrentEntry() {
                r1 = this;
                r1.<init>()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry
                r0.<init>()
                r1.entry = r0
                java.util.zip.CRC32 r0 = new java.util.zip.CRC32
                r0.<init>()
                r1.crc = r0
                return
        }

        /* synthetic */ CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.zip.CRC32 access$1000(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0) {
                java.util.zip.CRC32 r0 = r0.crc
                return r0
        }

        static /* synthetic */ long access$200(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r2) {
                long r0 = r2.bytesReadFromStream
                return r0
        }

        static /* synthetic */ long access$214(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r2, long r3) {
                long r0 = r2.bytesReadFromStream
                long r0 = r0 + r3
                r2.bytesReadFromStream = r0
                return r0
        }

        static /* synthetic */ long access$222(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r2, long r3) {
                long r0 = r2.bytesReadFromStream
                long r0 = r0 - r3
                r2.bytesReadFromStream = r0
                return r0
        }

        static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveEntry access$300(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0) {
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r0.entry
                return r0
        }

        static /* synthetic */ long access$400(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r2) {
                long r0 = r2.bytesRead
                return r0
        }

        static /* synthetic */ long access$414(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r2, long r3) {
                long r0 = r2.bytesRead
                long r0 = r0 + r3
                r2.bytesRead = r0
                return r0
        }

        static /* synthetic */ boolean access$500(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0) {
                boolean r0 = r0.hasDataDescriptor
                return r0
        }

        static /* synthetic */ boolean access$502(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0, boolean r1) {
                r0.hasDataDescriptor = r1
                return r1
        }

        static /* synthetic */ java.io.InputStream access$600(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0) {
                java.io.InputStream r0 = r0.checkInputStream()
                return r0
        }

        static /* synthetic */ java.io.InputStream access$800(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0) {
                java.io.InputStream r0 = r0.inputStream
                return r0
        }

        static /* synthetic */ java.io.InputStream access$802(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0, java.io.InputStream r1) {
                r0.inputStream = r1
                return r1
        }

        static /* synthetic */ boolean access$900(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0) {
                boolean r0 = r0.usesZip64
                return r0
        }

        static /* synthetic */ boolean access$902(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry r0, boolean r1) {
                r0.usesZip64 = r1
                return r1
        }

        private <T extends java.io.InputStream> T checkInputStream() {
                r2 = this;
                java.io.InputStream r0 = r2.inputStream
                java.lang.String r1 = "inputStream"
                java.lang.Object r0 = java.util.Objects.requireNonNull(r0, r1)
                java.io.InputStream r0 = (java.io.InputStream) r0
                return r0
        }
    }

    static {
            org.apache.commons.compress.archivers.zip.ZipLong r0 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG
            byte[] r0 = r0.getBytes()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.LFH = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG
            byte[] r0 = r0.getBytes()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CFH = r0
            org.apache.commons.compress.archivers.zip.ZipLong r0 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG
            byte[] r0 = r0.getBytes()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.DD = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50} // fill-array
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.APK_SIGNING_BLOCK_MAGIC = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.LONG_MAX = r0
            return
    }

    public ZipArchiveInputStream(java.io.InputStream r2) {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.name()
            r1.<init>(r2, r0)
            return
    }

    public ZipArchiveInputStream(java.io.InputStream r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public ZipArchiveInputStream(java.io.InputStream r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ZipArchiveInputStream(java.io.InputStream r7, java.lang.String r8, boolean r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ZipArchiveInputStream(java.io.InputStream r4, java.lang.String r5, boolean r6, boolean r7, boolean r8) {
            r3 = this;
            r3.<init>(r4, r5)
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = 1
            r0.<init>(r1)
            r3.inf = r0
            r0 = 512(0x200, float:7.17E-43)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.buf = r0
            r1 = 30
            byte[] r1 = new byte[r1]
            r3.lfhBuf = r1
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
            r3.skipBuf = r1
            r1 = 2
            byte[] r1 = new byte[r1]
            r3.shortBuf = r1
            r1 = 4
            byte[] r1 = new byte[r1]
            r3.wordBuf = r1
            r1 = 16
            byte[] r1 = new byte[r1]
            r3.twoDwordBuf = r1
            java.io.PushbackInputStream r1 = new java.io.PushbackInputStream
            int r2 = r0.capacity()
            r1.<init>(r4, r2)
            r3.in = r1
            org.apache.commons.compress.archivers.zip.ZipEncoding r4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r5)
            r3.zipEncoding = r4
            r3.useUnicodeExtraFields = r6
            r3.allowStoredEntriesWithDataDescriptor = r7
            r3.skipSplitSig = r8
            r4 = 0
            r0.limit(r4)
            return
    }

    static /* synthetic */ void access$000(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream r0, int r1) {
            r0.count(r1)
            return
    }

    static /* synthetic */ org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry access$100(org.apache.commons.compress.archivers.zip.ZipArchiveInputStream r0) {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r0.current
            return r0
    }

    private boolean bufferContainsSignature(java.io.ByteArrayOutputStream r12, int r13, int r14, int r15) throws java.io.IOException {
            r11 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            if (r1 != 0) goto La6
            int r3 = r13 + r14
            int r4 = r3 + (-4)
            if (r2 >= r4) goto La6
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            r4 = r4[r2]
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.LFH
            r6 = r5[r0]
            if (r4 != r6) goto La2
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r6 = r2 + 1
            r4 = r4[r6]
            r6 = 1
            r7 = r5[r6]
            if (r4 != r7) goto La2
            r4 = 2
            r7 = 3
            if (r2 < r15) goto L48
            java.nio.ByteBuffer r8 = r11.buf
            byte[] r8 = r8.array()
            int r9 = r2 + 2
            r8 = r8[r9]
            r9 = r5[r4]
            if (r8 != r9) goto L48
            java.nio.ByteBuffer r8 = r11.buf
            byte[] r8 = r8.array()
            int r9 = r2 + 3
            r8 = r8[r9]
            r5 = r5[r7]
            if (r8 == r5) goto L66
        L48:
            java.nio.ByteBuffer r5 = r11.buf
            byte[] r5 = r5.array()
            int r8 = r2 + 2
            r5 = r5[r8]
            byte[] r9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CFH
            r10 = r9[r4]
            if (r5 != r10) goto L6b
            java.nio.ByteBuffer r5 = r11.buf
            byte[] r5 = r5.array()
            int r10 = r2 + 3
            r5 = r5[r10]
            r9 = r9[r7]
            if (r5 != r9) goto L6b
        L66:
            int r1 = r2 - r15
            r4 = r1
        L69:
            r1 = r6
            goto L8a
        L6b:
            java.nio.ByteBuffer r5 = r11.buf
            byte[] r5 = r5.array()
            r5 = r5[r8]
            byte[] r8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.DD
            r4 = r8[r4]
            if (r5 != r4) goto L89
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r5 = r2 + 3
            r4 = r4[r5]
            r5 = r8[r7]
            if (r4 != r5) goto L89
            r4 = r2
            goto L69
        L89:
            r4 = r2
        L8a:
            if (r1 == 0) goto La2
            java.nio.ByteBuffer r5 = r11.buf
            byte[] r5 = r5.array()
            int r3 = r3 - r4
            r11.pushback(r5, r4, r3)
            java.nio.ByteBuffer r3 = r11.buf
            byte[] r3 = r3.array()
            r12.write(r3, r0, r4)
            r11.readDataDescriptor()
        La2:
            int r2 = r2 + 1
            goto L3
        La6:
            return r1
    }

    private int cacheBytesRead(java.io.ByteArrayOutputStream r2, int r3, int r4, int r5) {
            r1 = this;
            int r3 = r3 + r4
            int r4 = r3 - r5
            int r4 = r4 + (-3)
            if (r4 <= 0) goto L23
            java.nio.ByteBuffer r3 = r1.buf
            byte[] r3 = r3.array()
            r0 = 0
            r2.write(r3, r0, r4)
            java.nio.ByteBuffer r2 = r1.buf
            byte[] r2 = r2.array()
            java.nio.ByteBuffer r3 = r1.buf
            byte[] r3 = r3.array()
            int r5 = r5 + 3
            java.lang.System.arraycopy(r2, r4, r3, r0, r5)
            r3 = r5
        L23:
            return r3
    }

    private static boolean checksig(byte[] r4, byte[] r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.length
            if (r1 >= r2) goto Lf
            r2 = r5[r1]
            r3 = r4[r1]
            if (r2 == r3) goto Lc
            return r0
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            r4 = 1
            return r4
    }

    private void closeEntry() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L8f
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r4.current
            if (r0 != 0) goto L9
            return
        L9:
            boolean r0 = r4.currentEntryHasOutstandingBytes()
            if (r0 == 0) goto L13
            r4.drainCurrentEntryData()
            goto L64
        L13:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r4.skip(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L87
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r4.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            r1 = 8
            if (r0 != r1) goto L35
            long r0 = r4.getBytesInflated()
            goto L3b
        L35:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r4.current
            long r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$400(r0)
        L3b:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r4.current
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$200(r2)
            long r2 = r2 - r0
            int r0 = (int) r2
            if (r0 <= 0) goto L5b
            java.nio.ByteBuffer r1 = r4.buf
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r2 = r4.buf
            int r2 = r2.limit()
            int r2 = r2 - r0
            r4.pushback(r1, r2, r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r4.current
            long r2 = (long) r0
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$222(r1, r2)
        L5b:
            boolean r0 = r4.currentEntryHasOutstandingBytes()
            if (r0 == 0) goto L64
            r4.drainCurrentEntryData()
        L64:
            java.io.ByteArrayInputStream r0 = r4.lastStoredEntry
            if (r0 != 0) goto L73
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r4.current
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$500(r0)
            if (r0 == 0) goto L73
            r4.readDataDescriptor()
        L73:
            java.util.zip.Inflater r0 = r4.inf
            r0.reset()
            java.nio.ByteBuffer r0 = r4.buf
            java.nio.Buffer r0 = r0.clear()
            r0.flip()
            r0 = 0
            r4.current = r0
            r4.lastStoredEntry = r0
            return
        L87:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't read the remainder of the stream"
            r0.<init>(r1)
            throw r0
        L8f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "The stream is closed"
            r0.<init>(r1)
            throw r0
    }

    private boolean currentEntryHasOutstandingBytes() {
            r4 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r4.current
            long r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$200(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r4.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r2)
            long r2 = r2.getCompressedSize()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1e
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r4.current
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$500(r0)
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    private void drainCurrentEntryData() throws java.io.IOException {
            r8 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r8.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            long r0 = r0.getCompressedSize()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r8.current
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$200(r2)
            long r0 = r0 - r2
        L11:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5d
            java.io.InputStream r4 = r8.in
            java.nio.ByteBuffer r5 = r8.buf
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.buf
            int r6 = r6.capacity()
            long r6 = (long) r6
            long r6 = java.lang.Math.min(r6, r0)
            int r6 = (int) r6
            r7 = 0
            int r4 = r4.read(r5, r7, r6)
            long r4 = (long) r4
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L3a
            r8.count(r4)
            long r0 = r0 - r4
            goto L11
        L3a:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Truncated ZIP entry: "
            r1.<init>(r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r8.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r2)
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5d:
            return
    }

    private int fill() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.closed
            if (r0 != 0) goto L33
            java.io.InputStream r0 = r5.in
            java.nio.ByteBuffer r1 = r5.buf
            byte[] r1 = r1.array()
            int r0 = r0.read(r1)
            if (r0 <= 0) goto L32
            java.nio.ByteBuffer r1 = r5.buf
            r1.limit(r0)
            java.nio.ByteBuffer r1 = r5.buf
            int r1 = r1.limit()
            r5.count(r1)
            java.util.zip.Inflater r1 = r5.inf
            java.nio.ByteBuffer r2 = r5.buf
            byte[] r2 = r2.array()
            java.nio.ByteBuffer r3 = r5.buf
            int r3 = r3.limit()
            r4 = 0
            r1.setInput(r2, r4, r3)
        L32:
            return r0
        L33:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "The stream is closed"
            r0.<init>(r1)
            throw r0
    }

    private boolean findEocdRecord() throws java.io.IOException {
            r6 = this;
            r0 = -1
            r1 = 0
            r3 = r0
        L3:
            r2 = r1
        L4:
            if (r2 != 0) goto Lc
            int r3 = r6.readOneByte()
            if (r3 <= r0) goto L3f
        Lc:
            boolean r2 = r6.isFirstByteOfEocdSig(r3)
            if (r2 != 0) goto L13
            goto L3
        L13:
            int r3 = r6.readOneByte()
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG
            r4 = 1
            r2 = r2[r4]
            if (r3 == r2) goto L26
            if (r3 != r0) goto L21
            goto L3f
        L21:
            boolean r2 = r6.isFirstByteOfEocdSig(r3)
            goto L4
        L26:
            int r3 = r6.readOneByte()
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG
            r5 = 2
            r2 = r2[r5]
            if (r3 == r2) goto L39
            if (r3 != r0) goto L34
            goto L3f
        L34:
            boolean r2 = r6.isFirstByteOfEocdSig(r3)
            goto L4
        L39:
            int r3 = r6.readOneByte()
            if (r3 != r0) goto L40
        L3f:
            return r1
        L40:
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG
            r5 = 3
            r2 = r2[r5]
            if (r3 != r2) goto L48
            return r4
        L48:
            boolean r2 = r6.isFirstByteOfEocdSig(r3)
            goto L4
    }

    private long getBytesInflated() {
            r8 = this;
            java.util.zip.Inflater r0 = r8.inf
            long r0 = r0.getBytesRead()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r8.current
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$200(r2)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L23
        L15:
            long r2 = r0 + r4
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r6 = r8.current
            long r6 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$200(r6)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L23
            r0 = r2
            goto L15
        L23:
            return r0
    }

    private boolean isApkSigningBlock(byte[] r8) throws java.io.IOException {
            r7 = this;
            java.math.BigInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(r8)
            int r1 = r8.length
            r2 = 8
            int r1 = 8 - r1
            long r3 = (long) r1
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.APK_SIGNING_BLOCK_MAGIC
            int r5 = r1.length
            long r5 = (long) r5
            long r3 = r3 - r5
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r0 = r0.add(r3)
            int r1 = r1.length
            byte[] r3 = new byte[r1]
            r4 = 0
            int r5 = r0.signum()     // Catch: java.io.EOFException -> L69
            if (r5 >= 0) goto L3f
            int r5 = r8.length     // Catch: java.io.EOFException -> L69
            int r6 = r0.intValue()     // Catch: java.io.EOFException -> L69
            int r5 = r5 + r6
            if (r5 >= r2) goto L2a
            return r4
        L2a:
            int r0 = r0.intValue()     // Catch: java.io.EOFException -> L69
            int r0 = java.lang.Math.abs(r0)     // Catch: java.io.EOFException -> L69
            int r2 = java.lang.Math.min(r0, r1)     // Catch: java.io.EOFException -> L69
            java.lang.System.arraycopy(r8, r5, r3, r4, r2)     // Catch: java.io.EOFException -> L69
            if (r0 >= r1) goto L62
            r7.readFully(r3, r0)     // Catch: java.io.EOFException -> L69
            goto L62
        L3f:
            java.math.BigInteger r8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.LONG_MAX     // Catch: java.io.EOFException -> L69
            int r1 = r0.compareTo(r8)     // Catch: java.io.EOFException -> L69
            if (r1 <= 0) goto L58
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7.realSkip(r1)     // Catch: java.io.EOFException -> L69
            java.math.BigInteger r8 = r8.negate()     // Catch: java.io.EOFException -> L69
            java.math.BigInteger r0 = r0.add(r8)     // Catch: java.io.EOFException -> L69
            goto L3f
        L58:
            long r0 = r0.longValue()     // Catch: java.io.EOFException -> L69
            r7.realSkip(r0)     // Catch: java.io.EOFException -> L69
            r7.readFully(r3)     // Catch: java.io.EOFException -> L69
        L62:
            byte[] r8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.APK_SIGNING_BLOCK_MAGIC
            boolean r8 = java.util.Arrays.equals(r3, r8)
            return r8
        L69:
            return r4
    }

    private boolean isFirstByteOfEocdSig(int r3) {
            r2 = this;
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG
            r1 = 0
            r0 = r0[r1]
            if (r3 != r0) goto L8
            r1 = 1
        L8:
            return r1
    }

    public static boolean matches(byte[] r2, int r3) {
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG
            int r0 = r0.length
            r1 = 0
            if (r3 >= r0) goto L7
            return r1
        L7:
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LFH_SIG
            boolean r3 = checksig(r3, r2)
            if (r3 != 0) goto L2b
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG
            boolean r3 = checksig(r3, r2)
            if (r3 != 0) goto L2b
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG
            boolean r3 = checksig(r3, r2)
            if (r3 != 0) goto L2b
            org.apache.commons.compress.archivers.zip.ZipLong r3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER
            byte[] r3 = r3.getBytes()
            boolean r2 = checksig(r3, r2)
            if (r2 == 0) goto L2c
        L2b:
            r1 = 1
        L2c:
            return r1
    }

    private void processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong r8, org.apache.commons.compress.archivers.zip.ZipLong r9) throws java.util.zip.ZipException {
            r7 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r0.getExtraField(r1)
            if (r0 == 0) goto L1b
            boolean r1 = r0 instanceof org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField
            if (r1 == 0) goto L13
            goto L1b
        L13:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException
            java.lang.String r9 = "archive contains unparseable zip64 extra field"
            r8.<init>(r9)
            throw r8
        L1b:
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField r0 = (org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField) r0
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r7.current
            if (r0 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$902(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r7.current
            boolean r1 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$500(r1)
            if (r1 != 0) goto Lcd
            java.lang.String r1 = "broken archive, entry with negative size"
            java.lang.String r2 = "broken archive, entry with negative compressed size"
            r3 = 0
            if (r0 == 0) goto L92
            org.apache.commons.compress.archivers.zip.ZipLong r5 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L47
            org.apache.commons.compress.archivers.zip.ZipLong r5 = org.apache.commons.compress.archivers.zip.ZipLong.ZIP64_MAGIC
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L92
        L47:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r8 = r0.getCompressedSize()
            if (r8 == 0) goto L8a
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r8 = r0.getSize()
            if (r8 == 0) goto L8a
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r8 = r0.getCompressedSize()
            long r8 = r8.getLongValue()
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 < 0) goto L84
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r2)
            r2.setCompressedSize(r8)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r8 = r0.getSize()
            long r8 = r8.getLongValue()
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L7e
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            r0.setSize(r8)
            goto Lcd
        L7e:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException
            r8.<init>(r1)
            throw r8
        L84:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException
            r8.<init>(r2)
            throw r8
        L8a:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException
            java.lang.String r9 = "archive contains corrupted zip64 extra field"
            r8.<init>(r9)
            throw r8
        L92:
            if (r9 == 0) goto Lcd
            if (r8 == 0) goto Lcd
            long r5 = r9.getValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto Lc7
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            long r5 = r9.getValue()
            r0.setCompressedSize(r5)
            long r5 = r8.getValue()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 < 0) goto Lc1
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r9 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r9)
            long r0 = r8.getValue()
            r9.setSize(r0)
            goto Lcd
        Lc1:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException
            r8.<init>(r1)
            throw r8
        Lc7:
            java.util.zip.ZipException r8 = new java.util.zip.ZipException
            r8.<init>(r2)
            throw r8
        Lcd:
            return
    }

    private void pushback(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r3 < 0) goto Le
            java.io.InputStream r0 = r1.in
            java.io.PushbackInputStream r0 = (java.io.PushbackInputStream) r0
            r0.unread(r2, r3, r4)
            long r2 = (long) r4
            r1.pushedBackBytes(r2)
            return
        Le:
            java.io.IOException r2 = new java.io.IOException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "Negative offset %,d into buffer"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
    }

    private void readDataDescriptor() throws java.io.IOException {
            r8 = this;
            byte[] r0 = r8.wordBuf
            r8.readFully(r0)
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r1 = r8.wordBuf
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L20
            byte[] r0 = r8.wordBuf
            r8.readFully(r0)
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r1 = r8.wordBuf
            r0.<init>(r1)
        L20:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r8.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r1)
            long r2 = r0.getValue()
            r1.setCrc(r2)
            byte[] r0 = r8.twoDwordBuf
            r8.readFully(r0)
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r1 = r8.twoDwordBuf
            r2 = 8
            r0.<init>(r1, r2)
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG
            boolean r1 = r0.equals(r1)
            java.lang.String r3 = "broken archive, entry with negative size"
            java.lang.String r4 = "broken archive, entry with negative compressed size"
            r5 = 0
            if (r1 != 0) goto L85
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            goto L85
        L52:
            byte[] r0 = r8.twoDwordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(r0)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L7f
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r4 = r8.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r4)
            r4.setCompressedSize(r0)
            byte[] r0 = r8.twoDwordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(r0, r2)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L79
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r8.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r2)
            r2.setSize(r0)
            goto Lb1
        L79:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            r0.<init>(r3)
            throw r0
        L7f:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            r0.<init>(r4)
            throw r0
        L85:
            byte[] r0 = r8.twoDwordBuf
            r8.pushback(r0, r2, r2)
            byte[] r0 = r8.twoDwordBuf
            long r0 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto Lb8
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r8.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r2)
            r2.setCompressedSize(r0)
            byte[] r0 = r8.twoDwordBuf
            r1 = 4
            long r0 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r0, r1)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto Lb2
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r8.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r2)
            r2.setSize(r0)
        Lb1:
            return
        Lb2:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            r0.<init>(r3)
            throw r0
        Lb8:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            r0.<init>(r4)
            throw r0
    }

    private int readDeflated(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            int r1 = r0.readFromInflater(r1, r2, r3)
            if (r1 > 0) goto L2b
            java.util.zip.Inflater r2 = r0.inf
            boolean r2 = r2.finished()
            r3 = -1
            if (r2 == 0) goto L10
            return r3
        L10:
            java.util.zip.Inflater r2 = r0.inf
            boolean r2 = r2.needsDictionary()
            if (r2 != 0) goto L23
            if (r1 == r3) goto L1b
            goto L2b
        L1b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Truncated ZIP file"
            r1.<init>(r2)
            throw r1
        L23:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.String r2 = "This archive needs a preset dictionary which is not supported by Commons Compress."
            r1.<init>(r2)
            throw r1
        L2b:
            return r1
    }

    private boolean readFirstLocalFileHeader() throws java.io.IOException {
            r8 = this;
            r0 = 30
            r1 = 22
            int r0 = java.lang.Math.min(r0, r1)
            byte[] r1 = new byte[r0]
            r8.readFully(r1)
            r2 = 0
            r3 = r2
        Lf:
            r4 = r2
        L10:
            r5 = 4092(0xffc, float:5.734E-42)
            if (r3 > r5) goto L9c
            int r6 = r0 + (-4)
            if (r4 > r6) goto L9c
            org.apache.commons.compress.archivers.zip.ZipLong r5 = new org.apache.commons.compress.archivers.zip.ZipLong     // Catch: java.io.EOFException -> Lb1
            r5.<init>(r1, r4)     // Catch: java.io.EOFException -> Lb1
            org.apache.commons.compress.archivers.zip.ZipLong r6 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG     // Catch: java.io.EOFException -> Lb1
            boolean r6 = r5.equals(r6)     // Catch: java.io.EOFException -> Lb1
            if (r6 != 0) goto L4d
            org.apache.commons.compress.archivers.zip.ZipLong r6 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER     // Catch: java.io.EOFException -> Lb1
            boolean r6 = r5.equals(r6)     // Catch: java.io.EOFException -> Lb1
            if (r6 != 0) goto L4d
            org.apache.commons.compress.archivers.zip.ZipLong r6 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG     // Catch: java.io.EOFException -> Lb1
            boolean r6 = r5.equals(r6)     // Catch: java.io.EOFException -> Lb1
            if (r6 == 0) goto L36
            goto L4d
        L36:
            org.apache.commons.compress.archivers.zip.ZipLong r6 = new org.apache.commons.compress.archivers.zip.ZipLong     // Catch: java.io.EOFException -> Lb1
            byte[] r7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EOCD_SIG     // Catch: java.io.EOFException -> Lb1
            r6.<init>(r7)     // Catch: java.io.EOFException -> Lb1
            boolean r5 = r5.equals(r6)     // Catch: java.io.EOFException -> Lb1
            if (r5 == 0) goto L48
            int r0 = r0 - r4
            r8.pushback(r1, r4, r0)     // Catch: java.io.EOFException -> Lb1
            return r2
        L48:
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L10
        L4d:
            int r3 = r0 - r4
            java.lang.System.arraycopy(r1, r4, r1, r2, r3)     // Catch: java.io.EOFException -> Lb1
            r8.readFully(r1, r3)     // Catch: java.io.EOFException -> Lb1
            byte[] r3 = r8.lfhBuf     // Catch: java.io.EOFException -> Lb1
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)     // Catch: java.io.EOFException -> Lb1
            byte[] r1 = r8.lfhBuf     // Catch: java.io.EOFException -> Lb1
            r8.readFully(r1, r0)     // Catch: java.io.EOFException -> Lb1
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r1 = r8.lfhBuf
            r0.<init>(r1)
            boolean r1 = r8.skipSplitSig
            if (r1 != 0) goto L7b
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L73
            goto L7b
        L73:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.SPLITTING
            r0.<init>(r1)
            throw r0
        L7b:
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L8b
            org.apache.commons.compress.archivers.zip.ZipLong r1 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9a
        L8b:
            byte[] r0 = r8.lfhBuf
            int r1 = r0.length
            r3 = 4
            int r1 = r1 - r3
            java.lang.System.arraycopy(r0, r3, r0, r2, r1)
            byte[] r0 = r8.lfhBuf
            int r1 = r0.length
            int r1 = r1 - r3
            r8.readFully(r0, r1)
        L9a:
            r0 = 1
            return r0
        L9c:
            if (r3 >= r5) goto La9
            int r4 = r0 + (-3)
            r5 = 3
            java.lang.System.arraycopy(r1, r4, r1, r2, r5)     // Catch: java.io.EOFException -> Lb1
            r8.readFully(r1, r5)     // Catch: java.io.EOFException -> Lb1
            goto Lf
        La9:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException     // Catch: java.io.EOFException -> Lb1
            java.lang.String r1 = "Cannot find zip signature within the first 4096 bytes"
            r0.<init>(r1)     // Catch: java.io.EOFException -> Lb1
            throw r0     // Catch: java.io.EOFException -> Lb1
        Lb1:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "Cannot find zip signature within the file"
            r0.<init>(r1)
            throw r0
    }

    private int readFromInflater(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            java.util.zip.Inflater r1 = r3.inf
            boolean r1 = r1.needsInput()
            if (r1 == 0) goto L20
            int r1 = r3.fill()
            if (r1 <= 0) goto L1c
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r3.current
            java.nio.ByteBuffer r1 = r3.buf
            int r1 = r1.limit()
            long r1 = (long) r1
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$214(r0, r1)
            goto L20
        L1c:
            r4 = -1
            if (r1 != r4) goto L30
            return r4
        L20:
            java.util.zip.Inflater r0 = r3.inf     // Catch: java.util.zip.DataFormatException -> L31
            int r0 = r0.inflate(r4, r5, r6)     // Catch: java.util.zip.DataFormatException -> L31
            if (r0 != 0) goto L30
            java.util.zip.Inflater r1 = r3.inf
            boolean r1 = r1.needsInput()
            if (r1 != 0) goto L1
        L30:
            return r0
        L31:
            r4 = move-exception
            java.util.zip.ZipException r5 = new java.util.zip.ZipException
            java.lang.String r6 = r4.getMessage()
            r5.<init>(r6)
            java.lang.Throwable r4 = r5.initCause(r4)
            java.io.IOException r4 = (java.io.IOException) r4
            throw r4
    }

    private void readFully(byte[] r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.readFully(r2, r0)
            return
    }

    private void readFully(byte[] r3, int r4) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            int r0 = r0 - r4
            java.io.InputStream r1 = r2.in
            int r3 = org.apache.commons.compress.utils.IOUtils.readFully(r1, r3, r4, r0)
            r2.count(r3)
            if (r3 < r0) goto Le
            return
        Le:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    private int readOneByte() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto Ld
            r1 = 1
            r2.count(r1)
        Ld:
            return r0
    }

    private byte[] readRange(int r3) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            byte[] r0 = org.apache.commons.compress.utils.IOUtils.readRange(r0, r3)
            int r1 = r0.length
            r2.count(r1)
            int r1 = r0.length
            if (r1 < r3) goto Le
            return r0
        Le:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    private int readStored(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r6.current
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$500(r0)
            if (r0 == 0) goto L16
            java.io.ByteArrayInputStream r0 = r6.lastStoredEntry
            if (r0 != 0) goto Lf
            r6.readStoredEntry()
        Lf:
            java.io.ByteArrayInputStream r0 = r6.lastStoredEntry
            int r7 = r0.read(r7, r8, r9)
            return r7
        L16:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r6.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            long r0 = r0.getSize()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r6.current
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$400(r2)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = -1
            if (r2 < 0) goto L2c
            return r3
        L2c:
            java.nio.ByteBuffer r2 = r6.buf
            int r2 = r2.position()
            java.nio.ByteBuffer r4 = r6.buf
            int r4 = r4.limit()
            if (r2 < r4) goto L6a
            java.nio.ByteBuffer r2 = r6.buf
            r4 = 0
            r2.position(r4)
            java.io.InputStream r2 = r6.in
            java.nio.ByteBuffer r5 = r6.buf
            byte[] r5 = r5.array()
            int r2 = r2.read(r5)
            if (r2 == r3) goto L5d
            java.nio.ByteBuffer r3 = r6.buf
            r3.limit(r2)
            r6.count(r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r3 = r6.current
            long r4 = (long) r2
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$214(r3, r4)
            goto L6a
        L5d:
            java.nio.ByteBuffer r7 = r6.buf
            r7.limit(r4)
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Truncated ZIP file"
            r7.<init>(r8)
            throw r7
        L6a:
            java.nio.ByteBuffer r2 = r6.buf
            int r2 = r2.remaining()
            int r9 = java.lang.Math.min(r2, r9)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r2 = r6.current
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$400(r2)
            long r2 = r0 - r2
            long r4 = (long) r9
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L89
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r9 = r6.current
            long r2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$400(r9)
            long r0 = r0 - r2
            int r9 = (int) r0
        L89:
            java.nio.ByteBuffer r0 = r6.buf
            r0.get(r7, r8, r9)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r7 = r6.current
            long r0 = (long) r9
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$414(r7, r0)
            return r9
    }

    private void readStoredEntry() throws java.io.IOException {
            r7 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r7.current
            boolean r1 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$900(r1)
            if (r1 == 0) goto L10
            r1 = 20
            goto L12
        L10:
            r1 = 12
        L12:
            r2 = 0
            r3 = r2
        L14:
            if (r2 != 0) goto L40
            java.io.InputStream r4 = r7.in
            java.nio.ByteBuffer r5 = r7.buf
            byte[] r5 = r5.array()
            int r6 = 512 - r3
            int r4 = r4.read(r5, r3, r6)
            if (r4 <= 0) goto L38
            int r5 = r4 + r3
            r6 = 4
            if (r5 >= r6) goto L2d
            r3 = r5
            goto L14
        L2d:
            boolean r2 = r7.bufferContainsSignature(r0, r3, r4, r1)
            if (r2 != 0) goto L14
            int r3 = r7.cacheBytesRead(r0, r3, r4, r1)
            goto L14
        L38:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Truncated ZIP file"
            r0.<init>(r1)
            throw r0
        L40:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r1)
            long r1 = r1.getCompressedSize()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r3 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r3)
            long r3 = r3.getSize()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L7c
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r3 = r7.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r3)
            long r3 = r3.getSize()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L74
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r0)
            r7.lastStoredEntry = r1
            return
        L74:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "actual and claimed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See https://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile"
            r0.<init>(r1)
            throw r0
        L7c:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "compressed and uncompressed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See https://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile"
            r0.<init>(r1)
            throw r0
    }

    private void realSkip(long r9) throws java.io.IOException {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L2a
        L6:
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L29
            long r2 = r9 - r0
            java.io.InputStream r4 = r8.in
            byte[] r5 = r8.skipBuf
            int r6 = r5.length
            long r6 = (long) r6
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L17
            goto L19
        L17:
            int r2 = r5.length
            long r2 = (long) r2
        L19:
            int r2 = (int) r2
            r3 = 0
            int r2 = r4.read(r5, r3, r2)
            r3 = -1
            if (r2 != r3) goto L23
            return
        L23:
            r8.count(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L6
        L29:
            return
        L2a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
    }

    private void skipRemainderOfArchive() throws java.io.IOException {
            r4 = this;
            int r0 = r4.entriesRead
            if (r0 <= 0) goto Le
            long r0 = (long) r0
            r2 = 46
            long r0 = r0 * r2
            r2 = 30
            long r0 = r0 - r2
            r4.realSkip(r0)
        Le:
            boolean r0 = r4.findEocdRecord()
            if (r0 == 0) goto L2b
            r0 = 16
            r4.realSkip(r0)
            byte[] r0 = r4.shortBuf
            r4.readFully(r0)
            byte[] r0 = r4.shortBuf
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r0)
            if (r0 < 0) goto L2b
            long r0 = (long) r0
            r4.realSkip(r0)
            return
        L2b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Truncated ZIP file"
            r0.<init>(r1)
            throw r0
    }

    private boolean supportsCompressedSizeFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5) {
            r4 = this;
            long r0 = r5.getCompressedSize()
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L35
            int r0 = r5.getMethod()
            r1 = 8
            if (r0 == r1) goto L35
            int r0 = r5.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED
            int r1 = r1.getCode()
            if (r0 == r1) goto L35
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r0 = r5.getGeneralPurposeBit()
            boolean r0 = r0.usesDataDescriptor()
            if (r0 == 0) goto L33
            boolean r0 = r4.allowStoredEntriesWithDataDescriptor
            if (r0 == 0) goto L33
            int r5 = r5.getMethod()
            if (r5 != 0) goto L33
            goto L35
        L33:
            r5 = 0
            goto L36
        L35:
            r5 = 1
        L36:
            return r5
    }

    private boolean supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3) {
            r2 = this;
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r0 = r3.getGeneralPurposeBit()
            boolean r0 = r0.usesDataDescriptor()
            if (r0 == 0) goto L2b
            boolean r0 = r2.allowStoredEntriesWithDataDescriptor
            if (r0 == 0) goto L14
            int r0 = r3.getMethod()
            if (r0 == 0) goto L2b
        L14:
            int r0 = r3.getMethod()
            r1 = 8
            if (r0 == r1) goto L2b
            int r3 = r3.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r0 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED
            int r0 = r0.getCode()
            if (r3 != r0) goto L29
            goto L2b
        L29:
            r3 = 0
            goto L2c
        L2b:
            r3 = 1
        L2c:
            return r3
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.apache.commons.compress.archivers.zip.ZipArchiveEntry
            r1 = 0
            if (r0 == 0) goto L1a
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) r3
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(r3)
            if (r0 == 0) goto L1a
            boolean r0 = r2.supportsDataDescriptorFor(r3)
            if (r0 == 0) goto L1a
            boolean r3 = r2.supportsCompressedSizeFor(r3)
            if (r3 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L19
            r0 = 1
            r2.closed = r0
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> L12
            r0.close()     // Catch: java.lang.Throwable -> L12
            java.util.zip.Inflater r0 = r2.inf
            r0.end()
            goto L19
        L12:
            r0 = move-exception
            java.util.zip.Inflater r1 = r2.inf
            r1.end()
            throw r0
        L19:
            return
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            if (r0 != 0) goto L13
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            long r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$400(r0)
            return r0
        L13:
            r1 = 8
            if (r0 != r1) goto L1c
            long r0 = r2.getBytesInflated()
            return r0
        L1c:
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING
            int r1 = r1.getCode()
            if (r0 == r1) goto L40
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING
            int r1 = r1.getCode()
            if (r0 == r1) goto L40
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED
            int r1 = r1.getCode()
            if (r0 == r1) goto L40
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2
            int r1 = r1.getCode()
            if (r0 != r1) goto L3d
            goto L40
        L3d:
            r0 = -1
            return r0
        L40:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            java.io.InputStream r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$600(r0)
            org.apache.commons.compress.utils.InputStreamStatistics r0 = (org.apache.commons.compress.utils.InputStreamStatistics) r0
            long r0 = r0.getCompressedCount()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r1.getNextZipEntry()
            return r0
    }

    @java.lang.Deprecated
    public org.apache.commons.compress.archivers.zip.ZipArchiveEntry getNextZipEntry() throws java.io.IOException {
            r12 = this;
            r0 = 0
            r12.uncompressedCount = r0
            boolean r0 = r12.closed
            r1 = 0
            if (r0 != 0) goto L25b
            boolean r0 = r12.hitCentralDirectory
            if (r0 == 0) goto Lf
            goto L25b
        Lf:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            r2 = 1
            if (r0 == 0) goto L19
            r12.closeEntry()
            r0 = 0
            goto L1a
        L19:
            r0 = r2
        L1a:
            long r3 = r12.getBytesRead()
            if (r0 == 0) goto L2c
            boolean r0 = r12.readFirstLocalFileHeader()     // Catch: java.io.EOFException -> L25b
            if (r0 != 0) goto L31
            r12.hitCentralDirectory = r2     // Catch: java.io.EOFException -> L25b
            r12.skipRemainderOfArchive()     // Catch: java.io.EOFException -> L25b
            return r1
        L2c:
            byte[] r0 = r12.lfhBuf     // Catch: java.io.EOFException -> L25b
            r12.readFully(r0)     // Catch: java.io.EOFException -> L25b
        L31:
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r5 = r12.lfhBuf
            r0.<init>(r5)
            org.apache.commons.compress.archivers.zip.ZipLong r5 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L77
            org.apache.commons.compress.archivers.zip.ZipLong r3 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L71
            org.apache.commons.compress.archivers.zip.ZipLong r3 = org.apache.commons.compress.archivers.zip.ZipLong.AED_SIG
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L71
            byte[] r3 = r12.lfhBuf
            boolean r3 = r12.isApkSigningBlock(r3)
            if (r3 == 0) goto L59
            goto L71
        L59:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            long r2 = r0.getValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Unexpected record signature: 0x%x"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L71:
            r12.hitCentralDirectory = r2
            r12.skipRemainderOfArchive()
            return r1
        L77:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry
            r0.<init>(r1)
            r12.current = r0
            byte[] r0 = r12.lfhBuf
            r5 = 4
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r0, r5)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r6 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r6 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r6)
            r7 = 8
            int r0 = r0 >> r7
            r0 = r0 & 15
            r6.setPlatform(r0)
            byte[] r0 = r12.lfhBuf
            r6 = 6
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r0 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(r0, r6)
            boolean r6 = r0.usesUTF8ForNames()
            if (r6 == 0) goto La3
            org.apache.commons.compress.archivers.zip.ZipEncoding r8 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.ZIP_ENCODING_UTF_8
            goto La5
        La3:
            org.apache.commons.compress.archivers.zip.ZipEncoding r8 = r12.zipEncoding
        La5:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r9 = r12.current
            boolean r10 = r0.usesDataDescriptor()
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$502(r9, r10)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r9 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r9 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r9)
            r9.setGeneralPurposeBit(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            byte[] r9 = r12.lfhBuf
            int r7 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r9, r7)
            r0.setMethod(r7)
            r0 = 10
            byte[] r7 = r12.lfhBuf
            long r9 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r7, r0)
            long r9 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(r9)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            r0.setTime(r9)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            boolean r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$500(r0)
            if (r0 != 0) goto L107
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            byte[] r7 = r12.lfhBuf
            r9 = 14
            long r9 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r7, r9)
            r0.setCrc(r9)
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r7 = r12.lfhBuf
            r9 = 18
            r0.<init>(r7, r9)
            org.apache.commons.compress.archivers.zip.ZipLong r7 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r9 = r12.lfhBuf
            r10 = 22
            r7.<init>(r9, r10)
            goto L109
        L107:
            r0 = r1
            r7 = r0
        L109:
            r9 = 26
            byte[] r10 = r12.lfhBuf
            int r9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r10, r9)
            r10 = 28
            byte[] r11 = r12.lfhBuf
            int r10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r11, r10)
            byte[] r9 = r12.readRange(r9)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r11 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r11)
            java.lang.String r8 = r8.decode(r9)
            r11.setName(r8, r9)
            if (r6 == 0) goto L137
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r8 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r8)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r11 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG
            r8.setNameSource(r11)
        L137:
            byte[] r8 = r12.readRange(r10)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r10 = r12.current     // Catch: java.lang.RuntimeException -> L238
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r10 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r10)     // Catch: java.lang.RuntimeException -> L238
            r10.setExtra(r8)     // Catch: java.lang.RuntimeException -> L238
            if (r6 != 0) goto L153
            boolean r6 = r12.useUnicodeExtraFields
            if (r6 == 0) goto L153
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r6 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r6 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r6)
            org.apache.commons.compress.archivers.zip.ZipUtil.setNameAndCommentFromExtraFields(r6, r9, r1)
        L153:
            r12.processZip64Extra(r7, r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            r0.setLocalHeaderOffset(r3)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            long r3 = r12.getBytesRead()
            r0.setDataOffset(r3)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            r0.setStreamContiguous(r2)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r0 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r1)
            long r3 = r1.getCompressedSize()
            r6 = -1
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 == 0) goto L21c
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r1 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r1)
            boolean r1 = org.apache.commons.compress.archivers.zip.ZipUtil.canHandleEntryData(r1)
            if (r1 == 0) goto L22c
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.STORED
            if (r0 == r1) goto L22c
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.DEFLATED
            if (r0 == r1) goto L22c
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundCountInputStream r1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundCountInputStream
            java.io.InputStream r3 = r12.in
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r4 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r4)
            long r6 = r4.getCompressedSize()
            r1.<init>(r12, r3, r6)
            int[] r3 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod
            int r0 = r0.ordinal()
            r0 = r3[r0]
            if (r0 == r2) goto L211
            r3 = 2
            if (r0 == r3) goto L1e1
            r3 = 3
            if (r0 == r3) goto L1d6
            if (r0 == r5) goto L1cb
            goto L22c
        L1cb:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream r3 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream
            r3.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$802(r0, r3)
            goto L22c
        L1d6:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream r3 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream
            r3.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$802(r0, r3)
            goto L22c
        L1e1:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.ExplodingInputStream r3 = new org.apache.commons.compress.archivers.zip.ExplodingInputStream     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r4 = r12.current     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r4)     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r4 = r4.getGeneralPurposeBit()     // Catch: java.lang.IllegalArgumentException -> L208
            int r4 = r4.getSlidingDictionarySize()     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r5 = r12.current     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r5)     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r5 = r5.getGeneralPurposeBit()     // Catch: java.lang.IllegalArgumentException -> L208
            int r5 = r5.getNumberOfShannonFanoTrees()     // Catch: java.lang.IllegalArgumentException -> L208
            r3.<init>(r4, r5, r1)     // Catch: java.lang.IllegalArgumentException -> L208
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$802(r0, r3)     // Catch: java.lang.IllegalArgumentException -> L208
            goto L22c
        L208:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "bad IMPLODE data"
            r1.<init>(r2, r0)
            throw r1
        L211:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.UnshrinkingInputStream r3 = new org.apache.commons.compress.archivers.zip.UnshrinkingInputStream
            r3.<init>(r1)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$802(r0, r3)
            goto L22c
        L21c:
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED
            if (r0 != r1) goto L22c
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream r1 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream
            java.io.InputStream r3 = r12.in
            r1.<init>(r3)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$802(r0, r1)
        L22c:
            int r0 = r12.entriesRead
            int r0 = r0 + r2
            r12.entriesRead = r0
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            return r0
        L238:
            r0 = move-exception
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid extra data in entry "
            r2.<init>(r3)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r3 = r12.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r3)
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r1.initCause(r0)
            throw r1
        L25b:
            return r1
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getUncompressedCount() {
            r2 = this;
            long r0 = r2.uncompressedCount
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = r2.closed
            if (r0 != 0) goto Lfe
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            if (r0 != 0) goto Le
            r3 = -1
            return r3
        Le:
            int r1 = r3.length
            if (r4 > r1) goto Lf8
            if (r5 < 0) goto Lf8
            if (r4 < 0) goto Lf8
            int r1 = r3.length
            int r1 = r1 - r4
            if (r1 < r5) goto Lf8
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            org.apache.commons.compress.archivers.zip.ZipUtil.checkRequestedFeatures(r0)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            boolean r0 = r2.supportsDataDescriptorFor(r0)
            if (r0 == 0) goto Lea
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            boolean r0 = r2.supportsCompressedSizeFor(r0)
            if (r0 == 0) goto Ldc
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            if (r0 != 0) goto L4a
            int r5 = r2.readStored(r3, r4, r5)
            goto Lca
        L4a:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            r1 = 8
            if (r0 != r1) goto L5d
            int r5 = r2.readDeflated(r3, r4, r5)
            goto Lca
        L5d:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING
            int r1 = r1.getCode()
            if (r0 == r1) goto Lc0
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING
            int r1 = r1.getCode()
            if (r0 == r1) goto Lc0
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED
            int r1 = r1.getCode()
            if (r0 == r1) goto Lc0
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r0)
            int r0 = r0.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2
            int r1 = r1.getCode()
            if (r0 != r1) goto La6
            goto Lc0
        La6:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r4 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r4 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r4)
            int r4 = r4.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r4 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(r4)
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r5 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r5)
            r3.<init>(r4, r5)
            throw r3
        Lc0:
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            java.io.InputStream r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$800(r0)
            int r5 = r0.read(r3, r4, r5)
        Lca:
            if (r5 < 0) goto Ldb
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r0 = r2.current
            java.util.zip.CRC32 r0 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$1000(r0)
            r0.update(r3, r4, r5)
            long r3 = r2.uncompressedCount
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.uncompressedCount = r3
        Ldb:
            return r5
        Ldc:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r4 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r5 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r5)
            r3.<init>(r4, r5)
            throw r3
        Lea:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r4 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$CurrentEntry r5 = r2.current
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CurrentEntry.access$300(r5)
            r3.<init>(r4, r5)
            throw r3
        Lf8:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
        Lfe:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "The stream is closed"
            r3.<init>(r4)
            throw r3
    }

    public org.apache.commons.compress.archivers.zip.ZipArchiveInputStream setExtraFieldSupport(java.util.function.Function<org.apache.commons.compress.archivers.zip.ZipShort, org.apache.commons.compress.archivers.zip.ZipExtraField> r1) {
            r0 = this;
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L25
        L6:
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L24
            long r2 = r8 - r0
            byte[] r4 = r7.skipBuf
            int r5 = r4.length
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L15
            goto L17
        L15:
            int r2 = r4.length
            long r2 = (long) r2
        L17:
            int r2 = (int) r2
            r3 = 0
            int r2 = r7.read(r4, r3, r2)
            r3 = -1
            if (r2 != r3) goto L21
            return r0
        L21:
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L6
        L24:
            return r0
        L25:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Negative skip value"
            r8.<init>(r9)
            throw r8
    }
}
