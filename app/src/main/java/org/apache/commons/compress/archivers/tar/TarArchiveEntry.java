package org.apache.commons.compress.archivers.tar;

/* JADX INFO: loaded from: classes2.dex */
public class TarArchiveEntry implements org.apache.commons.compress.archivers.ArchiveEntry, org.apache.commons.compress.archivers.tar.TarConstants, org.apache.commons.compress.archivers.EntryStreamOffsets {
    public static final int DEFAULT_DIR_MODE = 16877;
    public static final int DEFAULT_FILE_MODE = 33188;
    private static final org.apache.commons.compress.archivers.tar.TarArchiveEntry[] EMPTY_TAR_ARCHIVE_ENTRY_ARRAY = null;
    public static final int MAX_NAMELEN = 31;

    @java.lang.Deprecated
    public static final int MILLIS_PER_SECOND = 1000;
    private static final java.util.regex.Pattern PAX_EXTENDED_HEADER_FILE_TIMES_PATTERN = null;
    public static final long UNKNOWN = -1;
    private java.nio.file.attribute.FileTime aTime;
    private java.nio.file.attribute.FileTime birthTime;
    private java.nio.file.attribute.FileTime cTime;
    private boolean checkSumOK;
    private long dataOffset;
    private int devMajor;
    private int devMinor;
    private final java.util.Map<java.lang.String, java.lang.String> extraPaxHeaders;
    private final java.nio.file.Path file;
    private long groupId;
    private java.lang.String groupName;
    private boolean isExtended;
    private byte linkFlag;
    private java.lang.String linkName;
    private final java.nio.file.LinkOption[] linkOptions;
    private java.nio.file.attribute.FileTime mTime;
    private java.lang.String magic;
    private int mode;
    private java.lang.String name;
    private boolean paxGNU1XSparse;
    private boolean paxGNUSparse;
    private final boolean preserveAbsolutePath;
    private long realSize;
    private long size;
    private java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> sparseHeaders;
    private boolean starSparse;
    private long userId;
    private java.lang.String userName;
    private java.lang.String version;

    static {
            r0 = 0
            org.apache.commons.compress.archivers.tar.TarArchiveEntry[] r0 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry[r0]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.EMPTY_TAR_ARCHIVE_ENTRY_ARRAY = r0
            java.lang.String r0 = "-?\\d{1,19}(?:\\.\\d{1,19})?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.PAX_EXTENDED_HEADER_FILE_TIMES_PATTERN = r0
            return
    }

    public TarArchiveEntry(java.io.File r2) {
            r1 = this;
            java.lang.String r0 = r2.getPath()
            r1.<init>(r2, r0)
            return
    }

    public TarArchiveEntry(java.io.File r5, java.lang.String r6) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = ""
            r4.name = r0
            r4.linkName = r0
            java.lang.String r1 = "ustar\u0000"
            r4.magic = r1
            java.lang.String r1 = "00"
            r4.version = r1
            r4.groupName = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.extraPaxHeaders = r1
            r1 = -1
            r4.dataOffset = r1
            r1 = 0
            java.lang.String r6 = normalizeFileName(r6, r1)
            java.nio.file.Path r2 = r5.toPath()
            r4.file = r2
            java.nio.file.LinkOption[] r3 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS
            r4.linkOptions = r3
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]     // Catch: java.io.IOException -> L33
            r4.readFileMode(r2, r6, r3)     // Catch: java.io.IOException -> L33
            goto L3f
        L33:
            boolean r6 = r5.isDirectory()
            if (r6 != 0) goto L3f
            long r2 = r5.length()
            r4.size = r2
        L3f:
            r4.userName = r0
            java.nio.file.Path r6 = r4.file     // Catch: java.io.IOException -> L49
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r1]     // Catch: java.io.IOException -> L49
            r4.readOsSpecificProperties(r6, r0)     // Catch: java.io.IOException -> L49
            goto L53
        L49:
            long r5 = r5.lastModified()
            java.nio.file.attribute.FileTime r5 = java.nio.file.attribute.FileTime.fromMillis(r5)
            r4.mTime = r5
        L53:
            r4.preserveAbsolutePath = r1
            return
    }

    public TarArchiveEntry(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TarArchiveEntry(java.lang.String r2, byte r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TarArchiveEntry(java.lang.String r1, byte r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.linkFlag = r2
            r1 = 76
            if (r2 != r1) goto L11
            java.lang.String r1 = "ustar "
            r0.magic = r1
            java.lang.String r1 = " \u0000"
            r0.version = r1
        L11:
            return
    }

    public TarArchiveEntry(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.String r1 = normalizeFileName(r1, r2)
            java.lang.String r2 = "/"
            boolean r2 = r1.endsWith(r2)
            r0.name = r1
            if (r2 == 0) goto L14
            r1 = 16877(0x41ed, float:2.365E-41)
            goto L17
        L14:
            r1 = 33188(0x81a4, float:4.6506E-41)
        L17:
            r0.mode = r1
            if (r2 == 0) goto L1e
            r1 = 53
            goto L20
        L1e:
            r1 = 48
        L20:
            r0.linkFlag = r1
            java.time.Instant r1 = java.time.Instant.now()
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.from(r1)
            r0.mTime = r1
            java.lang.String r1 = ""
            r0.userName = r1
            return
    }

    public TarArchiveEntry(java.nio.file.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r3.toString()
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            r2.<init>(r3, r0, r1)
            return
    }

    public TarArchiveEntry(java.nio.file.Path r4, java.lang.String r5, java.nio.file.LinkOption... r6) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.name = r0
            r3.linkName = r0
            java.lang.String r1 = "ustar\u0000"
            r3.magic = r1
            java.lang.String r1 = "00"
            r3.version = r1
            r3.groupName = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.extraPaxHeaders = r1
            r1 = -1
            r3.dataOffset = r1
            r1 = 0
            java.lang.String r5 = normalizeFileName(r5, r1)
            r3.file = r4
            if (r6 != 0) goto L2a
            java.nio.file.LinkOption[] r2 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS
            goto L2b
        L2a:
            r2 = r6
        L2b:
            r3.linkOptions = r2
            r3.readFileMode(r4, r5, r6)
            r3.userName = r0
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r1]
            r3.readOsSpecificProperties(r4, r5)
            r3.preserveAbsolutePath = r1
            return
    }

    public TarArchiveEntry(java.util.Map<java.lang.String, java.lang.String> r8, byte[] r9, org.apache.commons.compress.archivers.zip.ZipEncoding r10, boolean r11) throws java.io.IOException {
            r7 = this;
            r0 = 0
            r7.<init>(r0)
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r1.parseTarHeader(r2, r3, r4, r5, r6)
            return
    }

    public TarArchiveEntry(java.util.Map<java.lang.String, java.lang.String> r1, byte[] r2, org.apache.commons.compress.archivers.zip.ZipEncoding r3, boolean r4, long r5) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.setDataOffset(r5)
            return
    }

    private TarArchiveEntry(boolean r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.name = r0
            r3.linkName = r0
            java.lang.String r1 = "ustar\u0000"
            r3.magic = r1
            java.lang.String r1 = "00"
            r3.version = r1
            r3.groupName = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.extraPaxHeaders = r1
            r1 = -1
            r3.dataOffset = r1
            java.lang.String r1 = "user.name"
            java.lang.String r0 = java.lang.System.getProperty(r1, r0)
            int r1 = r0.length()
            r2 = 31
            if (r1 <= r2) goto L31
            r1 = 0
            java.lang.String r0 = r0.substring(r1, r2)
        L31:
            r3.userName = r0
            r0 = 0
            r3.file = r0
            java.nio.file.LinkOption[] r0 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS
            r3.linkOptions = r0
            r3.preserveAbsolutePath = r4
            return
    }

    public TarArchiveEntry(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.parseTarHeader(r2)
            return
    }

    public TarArchiveEntry(byte[] r2, org.apache.commons.compress.archivers.zip.ZipEncoding r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TarArchiveEntry(byte[] r2, org.apache.commons.compress.archivers.zip.ZipEncoding r3, boolean r4) throws java.io.IOException {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public TarArchiveEntry(byte[] r1, org.apache.commons.compress.archivers.zip.ZipEncoding r2, boolean r3, long r4) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.setDataOffset(r4)
            return
    }

    private int evaluateType(java.util.Map<java.lang.String, java.lang.String> r4, byte[] r5) {
            r3 = this;
            java.lang.String r0 = "ustar "
            r1 = 257(0x101, float:3.6E-43)
            r2 = 6
            boolean r0 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r0, r5, r1, r2)
            if (r0 == 0) goto Ld
            r4 = 2
            return r4
        Ld:
            java.lang.String r0 = "ustar\u0000"
            boolean r0 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r0, r5, r1, r2)
            if (r0 == 0) goto L1f
            boolean r4 = r3.isXstar(r4, r5)
            if (r4 == 0) goto L1d
            r4 = 4
            return r4
        L1d:
            r4 = 3
            return r4
        L1f:
            r4 = 0
            return r4
    }

    private static java.nio.file.attribute.FileTime fileTimeFromOptionalSeconds(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L8
            r2 = 0
            goto Lc
        L8:
            java.nio.file.attribute.FileTime r2 = org.apache.commons.io.file.attribute.FileTimes.fromUnixTime(r2)
        Lc:
            return r2
    }

    private int fill(byte r3, int r4, byte[] r5, int r6) {
            r2 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto La
            int r1 = r4 + r0
            r5[r1] = r3
            int r0 = r0 + 1
            goto L1
        La:
            int r4 = r4 + r6
            return r4
    }

    private int fill(int r1, int r2, byte[] r3, int r4) {
            r0 = this;
            byte r1 = (byte) r1
            int r1 = r0.fill(r1, r2, r3, r4)
            return r1
    }

    private boolean isInvalidPrefix(byte[] r5) {
            r4 = this;
            r0 = 475(0x1db, float:6.66E-43)
            r0 = r5[r0]
            if (r0 == 0) goto L1d
            r1 = 156(0x9c, float:2.19E-43)
            r1 = r5[r1]
            r2 = 77
            r3 = 1
            if (r1 == r2) goto L10
            return r3
        L10:
            r1 = 464(0x1d0, float:6.5E-43)
            r5 = r5[r1]
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 != 0) goto L1d
            r5 = 32
            if (r0 == r5) goto L1d
            return r3
        L1d:
            r5 = 0
            return r5
    }

    private boolean isInvalidXtarTime(byte[] r6, int r7, int r8) {
            r5 = this;
            r0 = r6[r7]
            r0 = r0 & 128(0x80, float:1.8E-43)
            r1 = 0
            if (r0 != 0) goto L27
            r0 = 1
            int r8 = r8 - r0
            r2 = r1
        La:
            if (r2 >= r8) goto L1d
            int r3 = r7 + r2
            r3 = r6[r3]
            r4 = 48
            if (r3 < r4) goto L1c
            r4 = 55
            if (r3 <= r4) goto L19
            goto L1c
        L19:
            int r2 = r2 + 1
            goto La
        L1c:
            return r0
        L1d:
            int r7 = r7 + r8
            r6 = r6[r7]
            r7 = 32
            if (r6 == r7) goto L27
            if (r6 == 0) goto L27
            return r0
        L27:
            return r1
    }

    private boolean isXstar(java.util.Map<java.lang.String, java.lang.String> r4, byte[] r5) {
            r3 = this;
            r0 = 508(0x1fc, float:7.12E-43)
            r1 = 4
            java.lang.String r2 = "tar\u0000"
            boolean r0 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r2, r5, r0, r1)
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.lang.String r0 = "SCHILY.archtype"
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            r0 = 0
            if (r4 == 0) goto L2b
            java.lang.String r5 = "xustar"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L2a
            java.lang.String r5 = "exustar"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r1 = r0
        L2a:
            return r1
        L2b:
            boolean r4 = r3.isInvalidPrefix(r5)
            if (r4 == 0) goto L32
            return r0
        L32:
            r4 = 476(0x1dc, float:6.67E-43)
            r2 = 12
            boolean r4 = r3.isInvalidXtarTime(r5, r4, r2)
            if (r4 == 0) goto L3d
            return r0
        L3d:
            r4 = 488(0x1e8, float:6.84E-43)
            boolean r4 = r3.isInvalidXtarTime(r5, r4, r2)
            if (r4 == 0) goto L46
            return r0
        L46:
            return r1
    }

    static /* synthetic */ boolean lambda$getOrderedSparseHeaders$0(org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r4) {
            long r0 = r4.getOffset()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L15
            long r0 = r4.getNumbytes()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L13
            goto L15
        L13:
            r4 = 0
            goto L16
        L15:
            r4 = 1
        L16:
            return r4
    }

    private static java.lang.String normalizeFileName(java.lang.String r5, boolean r6) {
            r0 = 1
            if (r6 != 0) goto L54
            java.lang.String r1 = org.apache.commons.lang3.SystemProperties.getOsName()
            if (r1 == 0) goto L54
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "windows"
            boolean r2 = r1.startsWith(r2)
            r3 = 58
            if (r2 == 0) goto L40
            int r1 = r5.length()
            r2 = 2
            if (r1 <= r2) goto L54
            r1 = 0
            char r1 = r5.charAt(r1)
            char r4 = r5.charAt(r0)
            if (r4 != r3) goto L54
            r3 = 97
            if (r1 < r3) goto L33
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 <= r3) goto L3b
        L33:
            r3 = 65
            if (r1 < r3) goto L54
            r3 = 90
            if (r1 > r3) goto L54
        L3b:
            java.lang.String r5 = r5.substring(r2)
            goto L54
        L40:
            java.lang.String r2 = "netware"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L54
            int r1 = r5.indexOf(r3)
            r2 = -1
            if (r1 == r2) goto L54
            int r1 = r1 + r0
            java.lang.String r5 = r5.substring(r1)
        L54:
            char r1 = java.io.File.separatorChar
            r2 = 47
            java.lang.String r5 = r5.replace(r1, r2)
        L5c:
            if (r6 != 0) goto L6b
            java.lang.String r1 = "/"
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L6b
            java.lang.String r5 = r5.substring(r0)
            goto L5c
        L6b:
            return r5
    }

    private static java.time.Instant parseInstantFromDecimalSeconds(java.lang.String r7) throws java.io.IOException {
            java.util.regex.Pattern r0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.PAX_EXTENDED_HEADER_FILE_TIMES_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r0 = r0.matches()
            java.lang.String r1 = "'"
            java.lang.String r2 = "Corrupted PAX header. Time field value is invalid '"
            if (r0 == 0) goto L48
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            long r3 = r0.longValue()
            java.math.BigDecimal r5 = java.math.BigDecimal.ONE
            java.math.BigDecimal r0 = r0.remainder(r5)
            r5 = 9
            java.math.BigDecimal r0 = r0.movePointRight(r5)
            long r5 = r0.longValue()
            java.time.Instant r7 = java.time.Instant.ofEpochSecond(r3, r5)     // Catch: java.lang.ArithmeticException -> L2e java.time.DateTimeException -> L30
            return r7
        L2e:
            r0 = move-exception
            goto L31
        L30:
            r0 = move-exception
        L31:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r3.<init>(r7, r0)
            throw r3
        L48:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.StringBuilder r7 = r3.append(r7)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
    }

    private long parseOctalOrBinary(byte[] r1, int r2, int r3, boolean r4) {
            r0 = this;
            if (r4 == 0) goto La
            long r1 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(r1, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L7
            return r1
        L7:
            r1 = -1
            return r1
        La:
            long r1 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(r1, r2, r3)
            return r1
    }

    private void parseTarHeader(java.util.Map<java.lang.String, java.lang.String> r1, byte[] r2, org.apache.commons.compress.archivers.zip.ZipEncoding r3, boolean r4, boolean r5) throws java.io.IOException {
            r0 = this;
            r0.parseTarHeaderUnwrapped(r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L4
            return
        L4:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Corrupted TAR archive."
            r2.<init>(r3, r1)
            throw r2
    }

    private void parseTarHeader(byte[] r7, org.apache.commons.compress.archivers.zip.ZipEncoding r8, boolean r9, boolean r10) throws java.io.IOException {
            r6 = this;
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.parseTarHeader(r1, r2, r3, r4, r5)
            return
    }

    private void parseTarHeaderUnwrapped(java.util.Map<java.lang.String, java.lang.String> r9, byte[] r10, org.apache.commons.compress.archivers.zip.ZipEncoding r11, boolean r12, boolean r13) throws java.io.IOException {
            r8 = this;
            r0 = 100
            r1 = 0
            if (r12 == 0) goto La
            java.lang.String r1 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r1, r0)
            goto Le
        La:
            java.lang.String r1 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r1, r0, r11)
        Le:
            r8.name = r1
            r1 = 8
            long r2 = r8.parseOctalOrBinary(r10, r0, r1, r13)
            int r2 = (int) r2
            r8.mode = r2
            r2 = 108(0x6c, float:1.51E-43)
            long r2 = r8.parseOctalOrBinary(r10, r2, r1, r13)
            int r2 = (int) r2
            long r2 = (long) r2
            r8.userId = r2
            r2 = 116(0x74, float:1.63E-43)
            long r2 = r8.parseOctalOrBinary(r10, r2, r1, r13)
            int r2 = (int) r2
            long r2 = (long) r2
            r8.groupId = r2
            r2 = 124(0x7c, float:1.74E-43)
            r3 = 12
            long r4 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(r10, r2, r3)
            r8.size = r4
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L189
            r2 = 136(0x88, float:1.9E-43)
            long r4 = r8.parseOctalOrBinary(r10, r2, r3, r13)
            java.nio.file.attribute.FileTime r2 = org.apache.commons.io.file.attribute.FileTimes.fromUnixTime(r4)
            r8.mTime = r2
            boolean r2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(r10)
            r8.checkSumOK = r2
            r2 = 156(0x9c, float:2.19E-43)
            r2 = r10[r2]
            r8.linkFlag = r2
            r2 = 157(0x9d, float:2.2E-43)
            if (r12 == 0) goto L5e
            java.lang.String r0 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r2, r0)
            goto L62
        L5e:
            java.lang.String r0 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r2, r0, r11)
        L62:
            r8.linkName = r0
            r0 = 257(0x101, float:3.6E-43)
            r2 = 6
            java.lang.String r0 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r0, r2)
            r8.magic = r0
            r0 = 263(0x107, float:3.69E-43)
            r2 = 2
            java.lang.String r0 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r0, r2)
            r8.version = r0
            r0 = 32
            r4 = 265(0x109, float:3.71E-43)
            if (r12 == 0) goto L81
            java.lang.String r4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r4, r0)
            goto L85
        L81:
            java.lang.String r4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r4, r0, r11)
        L85:
            r8.userName = r4
            r4 = 297(0x129, float:4.16E-43)
            if (r12 == 0) goto L90
            java.lang.String r0 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r4, r0)
            goto L94
        L90:
            java.lang.String r0 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r4, r0, r11)
        L94:
            r8.groupName = r0
            byte r0 = r8.linkFlag
            r4 = 51
            if (r0 == r4) goto La0
            r4 = 52
            if (r0 != r4) goto Lb2
        La0:
            r0 = 329(0x149, float:4.61E-43)
            long r4 = r8.parseOctalOrBinary(r10, r0, r1, r13)
            int r0 = (int) r4
            r8.devMajor = r0
            r0 = 337(0x151, float:4.72E-43)
            long r0 = r8.parseOctalOrBinary(r10, r0, r1, r13)
            int r0 = (int) r0
            r8.devMinor = r0
        Lb2:
            int r9 = r8.evaluateType(r9, r10)
            r0 = 4
            r1 = 345(0x159, float:4.83E-43)
            if (r9 == r2) goto L155
            java.lang.String r2 = "/"
            if (r9 == r0) goto L110
            r9 = 155(0x9b, float:2.17E-43)
            if (r12 == 0) goto Lc8
            java.lang.String r9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r1, r9)
            goto Lcc
        Lc8:
            java.lang.String r9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r1, r9, r11)
        Lcc:
            boolean r10 = r8.isDirectory()
            if (r10 == 0) goto Lef
            java.lang.String r10 = r8.name
            boolean r10 = r10.endsWith(r2)
            if (r10 != 0) goto Lef
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r8.name
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r10 = r10.toString()
            r8.name = r10
        Lef:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L188
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r10 = r8.name
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.name = r9
            goto L188
        L110:
            r9 = 131(0x83, float:1.84E-43)
            if (r12 == 0) goto L119
            java.lang.String r9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r1, r9)
            goto L11d
        L119:
            java.lang.String r9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(r10, r1, r9, r11)
        L11d:
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L13c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r11 = r8.name
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.name = r9
        L13c:
            r9 = 476(0x1dc, float:6.67E-43)
            long r11 = r8.parseOctalOrBinary(r10, r9, r3, r13)
            java.nio.file.attribute.FileTime r9 = fileTimeFromOptionalSeconds(r11)
            r8.aTime = r9
            r9 = 488(0x1e8, float:6.84E-43)
            long r9 = r8.parseOctalOrBinary(r10, r9, r3, r13)
            java.nio.file.attribute.FileTime r9 = fileTimeFromOptionalSeconds(r9)
            r8.cTime = r9
            goto L188
        L155:
            long r11 = r8.parseOctalOrBinary(r10, r1, r3, r13)
            java.nio.file.attribute.FileTime r9 = fileTimeFromOptionalSeconds(r11)
            r8.aTime = r9
            r9 = 357(0x165, float:5.0E-43)
            long r11 = r8.parseOctalOrBinary(r10, r9, r3, r13)
            java.nio.file.attribute.FileTime r9 = fileTimeFromOptionalSeconds(r11)
            r8.cTime = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 386(0x182, float:5.41E-43)
            java.util.List r11 = org.apache.commons.compress.archivers.tar.TarUtils.readSparseStructs(r10, r11, r0)
            r9.<init>(r11)
            r8.sparseHeaders = r9
            r9 = 482(0x1e2, float:6.75E-43)
            boolean r9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(r10, r9)
            r8.isExtended = r9
            r9 = 483(0x1e3, float:6.77E-43)
            long r9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(r10, r9, r3)
            r8.realSize = r9
        L188:
            return
        L189:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "broken archive, entry with negative size"
            r9.<init>(r10)
            throw r9
    }

    private void processPaxHeader(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.extraPaxHeaders
            r1.processPaxHeader(r2, r3, r0)
            return
    }

    private void processPaxHeader(java.lang.String r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) throws java.io.IOException {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1916861932: goto Lca;
                case -1916619760: goto Lbf;
                case -277496563: goto Lb4;
                case -160380561: goto La9;
                case 102338: goto L9e;
                case 115792: goto L93;
                case 3433509: goto L88;
                case 3530753: goto L7d;
                case 93141678: goto L6f;
                case 94988720: goto L61;
                case 98496370: goto L53;
                case 104223930: goto L45;
                case 111425664: goto L37;
                case 304222685: goto L29;
                case 530706950: goto L1b;
                case 1195018015: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Ld4
        Ld:
            java.lang.String r0 = "linkpath"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L17
            goto Ld4
        L17:
            r1 = 15
            goto Ld4
        L1b:
            java.lang.String r0 = "SCHILY.filetype"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L25
            goto Ld4
        L25:
            r1 = 14
            goto Ld4
        L29:
            java.lang.String r0 = "LIBARCHIVE.creationtime"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L33
            goto Ld4
        L33:
            r1 = 13
            goto Ld4
        L37:
            java.lang.String r0 = "uname"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L41
            goto Ld4
        L41:
            r1 = 12
            goto Ld4
        L45:
            java.lang.String r0 = "mtime"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto Ld4
        L4f:
            r1 = 11
            goto Ld4
        L53:
            java.lang.String r0 = "gname"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5d
            goto Ld4
        L5d:
            r1 = 10
            goto Ld4
        L61:
            java.lang.String r0 = "ctime"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6b
            goto Ld4
        L6b:
            r1 = 9
            goto Ld4
        L6f:
            java.lang.String r0 = "atime"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L79
            goto Ld4
        L79:
            r1 = 8
            goto Ld4
        L7d:
            java.lang.String r0 = "size"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L86
            goto Ld4
        L86:
            r1 = 7
            goto Ld4
        L88:
            java.lang.String r0 = "path"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L91
            goto Ld4
        L91:
            r1 = 6
            goto Ld4
        L93:
            java.lang.String r0 = "uid"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L9c
            goto Ld4
        L9c:
            r1 = 5
            goto Ld4
        L9e:
            java.lang.String r0 = "gid"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto La7
            goto Ld4
        La7:
            r1 = 4
            goto Ld4
        La9:
            java.lang.String r0 = "GNU.sparse.size"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lb2
            goto Ld4
        Lb2:
            r1 = 3
            goto Ld4
        Lb4:
            java.lang.String r0 = "GNU.sparse.realsize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lbd
            goto Ld4
        Lbd:
            r1 = 2
            goto Ld4
        Lbf:
            java.lang.String r0 = "SCHILY.devminor"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lc8
            goto Ld4
        Lc8:
            r1 = 1
            goto Ld4
        Lca:
            java.lang.String r0 = "SCHILY.devmajor"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Ld3
            goto Ld4
        Ld3:
            r1 = 0
        Ld4:
            switch(r1) {
                case 0: goto L16f;
                case 1: goto L15d;
                case 2: goto L159;
                case 3: goto L155;
                case 4: goto L14d;
                case 5: goto L145;
                case 6: goto L141;
                case 7: goto L12b;
                case 8: goto L11f;
                case 9: goto L113;
                case 10: goto L10f;
                case 11: goto L102;
                case 12: goto Lfd;
                case 13: goto Lf0;
                case 14: goto Le3;
                case 15: goto Lde;
                default: goto Ld7;
            }
        Ld7:
            java.util.Map<java.lang.String, java.lang.String> r5 = r2.extraPaxHeaders
            r5.put(r3, r4)
            goto L178
        Lde:
            r2.setLinkName(r4)
            goto L178
        Le3:
            java.lang.String r3 = "sparse"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L178
            r2.fillStarSparseData(r5)
            goto L178
        Lf0:
            java.time.Instant r3 = parseInstantFromDecimalSeconds(r4)
            java.nio.file.attribute.FileTime r3 = java.nio.file.attribute.FileTime.from(r3)
            r2.setCreationTime(r3)
            goto L178
        Lfd:
            r2.setUserName(r4)
            goto L178
        L102:
            java.time.Instant r3 = parseInstantFromDecimalSeconds(r4)
            java.nio.file.attribute.FileTime r3 = java.nio.file.attribute.FileTime.from(r3)
            r2.setLastModifiedTime(r3)
            goto L178
        L10f:
            r2.setGroupName(r4)
            goto L178
        L113:
            java.time.Instant r3 = parseInstantFromDecimalSeconds(r4)
            java.nio.file.attribute.FileTime r3 = java.nio.file.attribute.FileTime.from(r3)
            r2.setStatusChangeTime(r3)
            goto L178
        L11f:
            java.time.Instant r3 = parseInstantFromDecimalSeconds(r4)
            java.nio.file.attribute.FileTime r3 = java.nio.file.attribute.FileTime.from(r3)
            r2.setLastAccessTime(r3)
            goto L178
        L12b:
            long r3 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r4)
            r0 = 0
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L139
            r2.setSize(r3)
            goto L178
        L139:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Corrupted TAR archive. Entry size is negative"
            r3.<init>(r4)
            throw r3
        L141:
            r2.setName(r4)
            goto L178
        L145:
            long r3 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r4)
            r2.setUserId(r3)
            goto L178
        L14d:
            long r3 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r4)
            r2.setGroupId(r3)
            goto L178
        L155:
            r2.fillGNUSparse0xData(r5)
            goto L178
        L159:
            r2.fillGNUSparse1xData(r5)
            goto L178
        L15d:
            int r3 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r4)
            if (r3 < 0) goto L167
            r2.setDevMinor(r3)
            goto L178
        L167:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Corrupted TAR archive. Dev-Minor is negative"
            r3.<init>(r4)
            throw r3
        L16f:
            int r3 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r4)
            if (r3 < 0) goto L179
            r2.setDevMajor(r3)
        L178:
            return
        L179:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Corrupted TAR archive. Dev-Major is negative"
            r3.<init>(r4)
            throw r3
    }

    private void readFileMode(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            r0 = this;
            boolean r3 = java.nio.file.Files.isDirectory(r1, r3)
            if (r3 == 0) goto L38
            r1 = 16877(0x41ed, float:2.365E-41)
            r0.mode = r1
            r1 = 53
            r0.linkFlag = r1
            int r1 = r2.length()
            if (r1 == 0) goto L22
            int r1 = r1 + (-1)
            char r1 = r2.charAt(r1)
            r3 = 47
            if (r1 == r3) goto L1f
            goto L22
        L1f:
            r0.name = r2
            goto L49
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.name = r1
            goto L49
        L38:
            r3 = 33188(0x81a4, float:4.6506E-41)
            r0.mode = r3
            r3 = 48
            r0.linkFlag = r3
            r0.name = r2
            long r1 = java.nio.file.Files.size(r1)
            r0.size = r1
        L49:
            return
    }

    private void readOsSpecificProperties(java.nio.file.Path r4, java.nio.file.LinkOption... r5) throws java.io.IOException {
            r3 = this;
            java.nio.file.FileSystem r0 = r4.getFileSystem()
            java.util.Set r0 = r0.supportedFileAttributeViews()
            java.lang.String r1 = "posix"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L71
            java.lang.Class<java.nio.file.attribute.PosixFileAttributes> r1 = java.nio.file.attribute.PosixFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r1 = java.nio.file.Files.readAttributes(r4, r1, r5)
            java.nio.file.attribute.PosixFileAttributes r1 = (java.nio.file.attribute.PosixFileAttributes) r1
            java.nio.file.attribute.FileTime r2 = r1.lastModifiedTime()
            r3.setLastModifiedTime(r2)
            java.nio.file.attribute.FileTime r2 = r1.creationTime()
            r3.setCreationTime(r2)
            java.nio.file.attribute.FileTime r2 = r1.lastAccessTime()
            r3.setLastAccessTime(r2)
            java.nio.file.attribute.UserPrincipal r2 = r1.owner()
            java.lang.String r2 = r2.getName()
            r3.userName = r2
            java.nio.file.attribute.GroupPrincipal r1 = r1.group()
            java.lang.String r1 = r1.getName()
            r3.groupName = r1
            java.lang.String r1 = "unix"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "unix:uid"
            java.lang.Object r0 = java.nio.file.Files.getAttribute(r4, r0, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r3.userId = r0
            java.lang.String r0 = "unix:gid"
            java.lang.Object r0 = java.nio.file.Files.getAttribute(r4, r0, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r3.groupId = r0
            java.lang.String r0 = "unix:ctime"
            java.lang.Object r4 = java.nio.file.Files.getAttribute(r4, r0, r5)     // Catch: java.lang.IllegalArgumentException -> Lbc
            java.nio.file.attribute.FileTime r4 = (java.nio.file.attribute.FileTime) r4     // Catch: java.lang.IllegalArgumentException -> Lbc
            r3.setStatusChangeTime(r4)     // Catch: java.lang.IllegalArgumentException -> Lbc
            goto Lbc
        L71:
            java.lang.String r1 = "dos"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L97
            java.lang.Class<java.nio.file.attribute.DosFileAttributes> r0 = java.nio.file.attribute.DosFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r4, r0, r5)
            java.nio.file.attribute.DosFileAttributes r0 = (java.nio.file.attribute.DosFileAttributes) r0
            java.nio.file.attribute.FileTime r1 = r0.lastModifiedTime()
            r3.setLastModifiedTime(r1)
            java.nio.file.attribute.FileTime r1 = r0.creationTime()
            r3.setCreationTime(r1)
            java.nio.file.attribute.FileTime r0 = r0.lastAccessTime()
            r3.setLastAccessTime(r0)
            goto Lb2
        L97:
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r4, r0, r5)
            java.nio.file.attribute.FileTime r1 = r0.lastModifiedTime()
            r3.setLastModifiedTime(r1)
            java.nio.file.attribute.FileTime r1 = r0.creationTime()
            r3.setCreationTime(r1)
            java.nio.file.attribute.FileTime r0 = r0.lastAccessTime()
            r3.setLastAccessTime(r0)
        Lb2:
            java.nio.file.attribute.UserPrincipal r4 = java.nio.file.Files.getOwner(r4, r5)
            java.lang.String r4 = r4.getName()
            r3.userName = r4
        Lbc:
            return
    }

    private int writeEntryHeaderField(long r5, byte[] r7, int r8, int r9, boolean r10) {
            r4 = this;
            if (r10 != 0) goto L18
            r0 = 0
            int r10 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r10 < 0) goto L13
            int r10 = r9 + (-1)
            int r10 = r10 * 3
            r2 = 1
            long r2 = r2 << r10
            int r10 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r10 < 0) goto L18
        L13:
            int r5 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(r0, r7, r8, r9)
            return r5
        L18:
            int r5 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(r5, r7, r8, r9)
            return r5
    }

    private int writeEntryHeaderOptionalTimeField(java.nio.file.attribute.FileTime r8, int r9, byte[] r10, int r11) {
            r7 = this;
            if (r8 == 0) goto L10
            long r1 = org.apache.commons.compress.utils.TimeUtils.toUnixTime(r8)
            r6 = 1
            r0 = r7
            r3 = r10
            r4 = r9
            r5 = r11
            int r8 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            goto L15
        L10:
            r8 = 0
            int r8 = r7.fill(r8, r9, r10, r11)
        L15:
            return r8
    }

    public void addPaxHeader(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.processPaxHeader(r2, r3)     // Catch: java.io.IOException -> L4
            return
        L4:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid input"
            r3.<init>(r0, r2)
            throw r3
    }

    public void clearExtraPaxHeaders() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.extraPaxHeaders
            r0.clear()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L14
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Ld
            goto L14
        Ld:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r3 = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) r3
            boolean r3 = r2.equals(r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public boolean equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry r2) {
            r1 = this;
            if (r2 == 0) goto L12
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    void fillGNUSparse0xData(java.util.Map<java.lang.String, java.lang.String> r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.paxGNUSparse = r0
            java.lang.String r0 = "GNU.sparse.size"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r0)
            long r0 = (long) r0
            r2.realSize = r0
            java.lang.String r0 = "GNU.sparse.name"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L22
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            r2.name = r3
        L22:
            return
    }

    void fillGNUSparse1xData(java.util.Map<java.lang.String, java.lang.String> r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.paxGNUSparse = r0
            r2.paxGNU1XSparse = r0
            java.lang.String r0 = "GNU.sparse.name"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L15
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.name = r0
        L15:
            java.lang.String r0 = "GNU.sparse.realsize"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L2a
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r3)
            long r0 = (long) r3
            r2.realSize = r0
        L2a:
            return
    }

    void fillStarSparseData(java.util.Map<java.lang.String, java.lang.String> r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.starSparse = r0
            java.lang.String r0 = "SCHILY.realsize"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L17
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            long r0 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r3)
            r2.realSize = r0
        L17:
            return
    }

    public java.nio.file.attribute.FileTime getCreationTime() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.birthTime
            return r0
    }

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public long getDataOffset() {
            r2 = this;
            long r0 = r2.dataOffset
            return r0
    }

    public int getDevMajor() {
            r1 = this;
            int r0 = r1.devMajor
            return r0
    }

    public int getDevMinor() {
            r1 = this;
            int r0 = r1.devMinor
            return r0
    }

    public org.apache.commons.compress.archivers.tar.TarArchiveEntry[] getDirectoryEntries() {
            r5 = this;
            java.nio.file.Path r0 = r5.file
            if (r0 == 0) goto L4c
            boolean r0 = r5.isDirectory()
            if (r0 != 0) goto Lb
            goto L4c
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.nio.file.Path r1 = r5.file     // Catch: java.io.IOException -> L49
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1)     // Catch: java.io.IOException -> L49
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L3d
        L1a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3d
            java.nio.file.Path r3 = (java.nio.file.Path) r3     // Catch: java.lang.Throwable -> L3d
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            r0.add(r4)     // Catch: java.lang.Throwable -> L3d
            goto L1a
        L2f:
            if (r1 == 0) goto L34
            r1.close()     // Catch: java.io.IOException -> L49
        L34:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry[] r1 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.EMPTY_TAR_ARCHIVE_ENTRY_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry[] r0 = (org.apache.commons.compress.archivers.tar.TarArchiveEntry[]) r0
            return r0
        L3d:
            r0 = move-exception
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L49
        L48:
            throw r0     // Catch: java.io.IOException -> L49
        L49:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry[] r0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.EMPTY_TAR_ARCHIVE_ENTRY_ARRAY
            return r0
        L4c:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry[] r0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.EMPTY_TAR_ARCHIVE_ENTRY_ARRAY
            return r0
    }

    public java.lang.String getExtraPaxHeader(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.extraPaxHeaders
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public java.util.Map<java.lang.String, java.lang.String> getExtraPaxHeaders() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.extraPaxHeaders
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    public java.io.File getFile() {
            r1 = this;
            java.nio.file.Path r0 = r1.file
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.io.File r0 = r0.toFile()
            return r0
    }

    @java.lang.Deprecated
    public int getGroupId() {
            r2 = this;
            long r0 = r2.groupId
            int r0 = (int) r0
            return r0
    }

    public java.lang.String getGroupName() {
            r1 = this;
            java.lang.String r0 = r1.groupName
            return r0
    }

    public java.nio.file.attribute.FileTime getLastAccessTime() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.aTime
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.util.Date getLastModifiedDate() {
            r1 = this;
            java.util.Date r0 = r1.getModTime()
            return r0
    }

    public java.nio.file.attribute.FileTime getLastModifiedTime() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.mTime
            return r0
    }

    public byte getLinkFlag() {
            r1 = this;
            byte r0 = r1.linkFlag
            return r0
    }

    public java.lang.String getLinkName() {
            r1 = this;
            java.lang.String r0 = r1.linkName
            return r0
    }

    public long getLongGroupId() {
            r2 = this;
            long r0 = r2.groupId
            return r0
    }

    public long getLongUserId() {
            r2 = this;
            long r0 = r2.userId
            return r0
    }

    public java.util.Date getModTime() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.mTime
            java.util.Date r0 = org.apache.commons.io.file.attribute.FileTimes.toDate(r0)
            return r0
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> getOrderedSparseHeaders() throws java.io.IOException {
            r8 = this;
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r0 = r8.sparseHeaders
            if (r0 == 0) goto Ld2
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            goto Ld2
        Lc:
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r0 = r8.sparseHeaders
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda0
            r1.<init>()
            java.util.stream.Stream r0 = r0.filter(r1)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda1 r1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry$$ExternalSyntheticLambda1
            r1.<init>()
            java.util.Comparator r1 = java.util.Comparator.comparingLong(r1)
            java.util.stream.Stream r0 = r0.sorted(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            r2 = 0
        L37:
            if (r2 >= r1) goto La9
            java.lang.Object r3 = r0.get(r2)
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r3 = (org.apache.commons.compress.archivers.tar.TarArchiveStructSparse) r3
            int r2 = r2 + 1
            if (r2 >= r1) goto L7a
            long r4 = r3.getOffset()
            long r6 = r3.getNumbytes()
            long r4 = r4 + r6
            java.lang.Object r6 = r0.get(r2)
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r6 = (org.apache.commons.compress.archivers.tar.TarArchiveStructSparse) r6
            long r6 = r6.getOffset()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L5b
            goto L7a
        L5b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Corrupted TAR archive. Sparse blocks for "
            r1.<init>(r2)
            java.lang.String r2 = r8.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " overlap each other."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L7a:
            long r4 = r3.getOffset()
            long r6 = r3.getNumbytes()
            long r4 = r4 + r6
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 < 0) goto L8a
            goto L37
        L8a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unreadable TAR archive. Offset and numbytes for sparse block in "
            r1.<init>(r2)
            java.lang.String r2 = r8.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " too large."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La9:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Ld1
            int r1 = r1 + (-1)
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r1 = (org.apache.commons.compress.archivers.tar.TarArchiveStructSparse) r1
            long r2 = r1.getOffset()
            long r4 = r1.getNumbytes()
            long r2 = r2 + r4
            long r4 = r8.getRealSize()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto Lc9
            goto Ld1
        Lc9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted TAR archive. Sparse block extends beyond real size of the entry"
            r0.<init>(r1)
            throw r0
        Ld1:
            return r0
        Ld2:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public java.nio.file.Path getPath() {
            r1 = this;
            java.nio.file.Path r0 = r1.file
            return r0
    }

    public long getRealSize() {
            r2 = this;
            boolean r0 = r2.isSparse()
            if (r0 != 0) goto Lb
            long r0 = r2.getSize()
            return r0
        Lb:
            long r0 = r2.realSize
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> getSparseHeaders() {
            r1 = this;
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r0 = r1.sparseHeaders
            return r0
    }

    public java.nio.file.attribute.FileTime getStatusChangeTime() {
            r1 = this;
            java.nio.file.attribute.FileTime r0 = r1.cTime
            return r0
    }

    @java.lang.Deprecated
    public int getUserId() {
            r2 = this;
            long r0 = r2.userId
            int r0 = (int) r0
            return r0
    }

    public java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.userName
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isBlockDevice() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 52
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isCharacterDevice() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 51
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isCheckSumOK() {
            r1 = this;
            boolean r0 = r1.checkSumOK
            return r0
    }

    public boolean isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry r2) {
            r1 = this;
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r1.getName()
            boolean r2 = r2.startsWith(r0)
            return r2
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
            r3 = this;
            java.nio.file.Path r0 = r3.file
            if (r0 == 0) goto Lb
            java.nio.file.LinkOption[] r1 = r3.linkOptions
            boolean r0 = java.nio.file.Files.isDirectory(r0, r1)
            return r0
        Lb:
            byte r0 = r3.linkFlag
            r1 = 53
            r2 = 1
            if (r0 != r1) goto L13
            return r2
        L13:
            boolean r0 = r3.isPaxHeader()
            if (r0 != 0) goto L2c
            boolean r0 = r3.isGlobalPaxHeader()
            if (r0 != 0) goto L2c
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "/"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            return r2
    }

    public boolean isExtended() {
            r1 = this;
            boolean r0 = r1.isExtended
            return r0
    }

    public boolean isFIFO() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 54
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isFile() {
            r3 = this;
            java.nio.file.Path r0 = r3.file
            if (r0 == 0) goto Lb
            java.nio.file.LinkOption[] r1 = r3.linkOptions
            boolean r0 = java.nio.file.Files.isRegularFile(r0, r1)
            return r0
        Lb:
            byte r0 = r3.linkFlag
            r1 = 1
            if (r0 == 0) goto L27
            r2 = 48
            if (r0 != r2) goto L15
            goto L27
        L15:
            r2 = 53
            if (r0 == r2) goto L26
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "/"
            boolean r0 = r0.endsWith(r2)
            if (r0 != 0) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            return r1
    }

    public boolean isGNULongLinkEntry() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 75
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isGNULongNameEntry() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 76
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isGNUSparse() {
            r1 = this;
            boolean r0 = r1.isOldGNUSparse()
            if (r0 != 0) goto Lf
            boolean r0 = r1.isPaxGNUSparse()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public boolean isGlobalPaxHeader() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 103(0x67, float:1.44E-43)
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isLink() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 49
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isOldGNUSparse() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 83
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isPaxGNU1XSparse() {
            r1 = this;
            boolean r0 = r1.paxGNU1XSparse
            return r0
    }

    public boolean isPaxGNUSparse() {
            r1 = this;
            boolean r0 = r1.paxGNUSparse
            return r0
    }

    public boolean isPaxHeader() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 120(0x78, float:1.68E-43)
            if (r0 == r1) goto Ld
            r1 = 88
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public boolean isSparse() {
            r1 = this;
            boolean r0 = r1.isGNUSparse()
            if (r0 != 0) goto Lf
            boolean r0 = r1.isStarSparse()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public boolean isStarSparse() {
            r1 = this;
            boolean r0 = r1.starSparse
            return r0
    }

    @Override // org.apache.commons.compress.archivers.EntryStreamOffsets
    public boolean isStreamContiguous() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isSymbolicLink() {
            r2 = this;
            byte r0 = r2.linkFlag
            r1 = 50
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void parseTarHeader(byte[] r4) {
            r3 = this;
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch: java.io.IOException -> L6
            r3.parseTarHeader(r4, r0)     // Catch: java.io.IOException -> L6
            goto Ld
        L6:
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch: java.io.IOException -> Le
            r1 = 1
            r2 = 0
            r3.parseTarHeader(r4, r0, r1, r2)     // Catch: java.io.IOException -> Le
        Ld:
            return
        Le:
            r4 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r4)
            throw r0
    }

    public void parseTarHeader(byte[] r2, org.apache.commons.compress.archivers.zip.ZipEncoding r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.parseTarHeader(r2, r3, r0, r0)
            return
    }

    public void setCreationTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.birthTime = r1
            return
    }

    public void setDataOffset(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            r2.dataOffset = r3
            return
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The offset can not be smaller than 0"
            r3.<init>(r4)
            throw r3
    }

    public void setDevMajor(int r4) {
            r3 = this;
            if (r4 < 0) goto L5
            r3.devMajor = r4
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Major device number is out of range: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setDevMinor(int r4) {
            r3 = this;
            if (r4 < 0) goto L5
            r3.devMinor = r4
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Minor device number is out of range: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setGroupId(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.setGroupId(r0)
            return
    }

    public void setGroupId(long r1) {
            r0 = this;
            r0.groupId = r1
            return
    }

    public void setGroupName(java.lang.String r1) {
            r0 = this;
            r0.groupName = r1
            return
    }

    public void setIds(int r1, int r2) {
            r0 = this;
            r0.setUserId(r1)
            r0.setGroupId(r2)
            return
    }

    public void setLastAccessTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.aTime = r1
            return
    }

    public void setLastModifiedTime(java.nio.file.attribute.FileTime r2) {
            r1 = this;
            java.lang.String r0 = "time"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.attribute.FileTime r2 = (java.nio.file.attribute.FileTime) r2
            r1.mTime = r2
            return
    }

    public void setLinkName(java.lang.String r1) {
            r0 = this;
            r0.linkName = r1
            return
    }

    public void setModTime(long r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = java.nio.file.attribute.FileTime.fromMillis(r1)
            r0.setLastModifiedTime(r1)
            return
    }

    public void setModTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.setLastModifiedTime(r1)
            return
    }

    public void setModTime(java.util.Date r1) {
            r0 = this;
            java.nio.file.attribute.FileTime r1 = org.apache.commons.io.file.attribute.FileTimes.toFileTime(r1)
            r0.setLastModifiedTime(r1)
            return
    }

    public void setMode(int r1) {
            r0 = this;
            r0.mode = r1
            return
    }

    public void setName(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.preserveAbsolutePath
            java.lang.String r2 = normalizeFileName(r2, r0)
            r1.name = r2
            return
    }

    public void setNames(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.setUserName(r1)
            r0.setGroupName(r2)
            return
    }

    public void setSize(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            r3.size = r4
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Size is out of range: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setSparseHeaders(java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r1) {
            r0 = this;
            r0.sparseHeaders = r1
            return
    }

    public void setStatusChangeTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            r0.cTime = r1
            return
    }

    public void setUserId(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.setUserId(r0)
            return
    }

    public void setUserId(long r1) {
            r0 = this;
            r0.userId = r1
            return
    }

    public void setUserName(java.lang.String r1) {
            r0 = this;
            r0.userName = r1
            return
    }

    void updateEntryFromPaxHeaders(java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.IOException {
            r3 = this;
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r3.processPaxHeader(r2, r1, r4)
            goto L8
        L24:
            return
    }

    public void writeEntryHeader(byte[] r3) {
            r2 = this;
            r0 = 0
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch: java.io.IOException -> L7
            r2.writeEntryHeader(r3, r1, r0)     // Catch: java.io.IOException -> L7
            goto Lc
        L7:
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING     // Catch: java.io.IOException -> Ld
            r2.writeEntryHeader(r3, r1, r0)     // Catch: java.io.IOException -> Ld
        Lc:
            return
        Ld:
            r3 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r3)
            throw r0
    }

    public void writeEntryHeader(byte[] r15, org.apache.commons.compress.archivers.zip.ZipEncoding r16, boolean r17) throws java.io.IOException {
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            java.lang.String r0 = r7.name
            r10 = 0
            r11 = 100
            int r4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(r0, r15, r10, r11, r9)
            int r0 = r7.mode
            long r1 = (long) r0
            r5 = 8
            r0 = r14
            r3 = r15
            r6 = r17
            int r4 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            long r1 = r7.userId
            int r4 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            long r1 = r7.groupId
            int r4 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            long r1 = r7.size
            r5 = 12
            int r4 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            java.nio.file.attribute.FileTime r0 = r7.mTime
            long r1 = org.apache.commons.compress.utils.TimeUtils.toUnixTime(r0)
            r0 = r14
            int r12 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            r0 = 32
            r13 = 8
            int r1 = r14.fill(r0, r12, r15, r13)
            int r2 = r1 + 1
            byte r3 = r7.linkFlag
            r8[r1] = r3
            java.lang.String r1 = r7.linkName
            int r1 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(r1, r15, r2, r11, r9)
            java.lang.String r2 = r7.magic
            r3 = 6
            int r1 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(r2, r15, r1, r3)
            java.lang.String r2 = r7.version
            r3 = 2
            int r1 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(r2, r15, r1, r3)
            java.lang.String r2 = r7.userName
            int r1 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(r2, r15, r1, r0, r9)
            java.lang.String r2 = r7.groupName
            int r4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(r2, r15, r1, r0, r9)
            int r0 = r7.devMajor
            long r1 = (long) r0
            r5 = 8
            r0 = r14
            r3 = r15
            int r4 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            int r0 = r7.devMinor
            long r1 = (long) r0
            r0 = r14
            int r0 = r0.writeEntryHeaderField(r1, r3, r4, r5, r6)
            if (r17 == 0) goto L99
            r1 = 131(0x83, float:1.84E-43)
            int r0 = r14.fill(r10, r0, r15, r1)
            java.nio.file.attribute.FileTime r1 = r7.aTime
            r2 = 12
            int r0 = r14.writeEntryHeaderOptionalTimeField(r1, r0, r15, r2)
            java.nio.file.attribute.FileTime r1 = r7.cTime
            int r0 = r14.writeEntryHeaderOptionalTimeField(r1, r0, r15, r2)
            int r0 = r14.fill(r10, r0, r15, r13)
            r1 = 4
            int r0 = r14.fill(r10, r0, r15, r1)
        L99:
            int r1 = r8.length
            int r1 = r1 - r0
            r14.fill(r10, r0, r15, r1)
            long r0 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(r15)
            org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(r0, r15, r12, r13)
            return
    }
}
