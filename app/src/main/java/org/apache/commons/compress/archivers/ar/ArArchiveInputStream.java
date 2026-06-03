package org.apache.commons.compress.archivers.ar;

/* JADX INFO: loaded from: classes2.dex */
public class ArArchiveInputStream extends org.apache.commons.compress.archivers.ArchiveInputStream<org.apache.commons.compress.archivers.ar.ArArchiveEntry> {
    private static final java.util.regex.Pattern BSD_LONGNAME_PATTERN = null;
    static final java.lang.String BSD_LONGNAME_PREFIX = "#1/";
    private static final int BSD_LONGNAME_PREFIX_LEN = 0;
    private static final int FILE_MODE_LEN = 8;
    private static final int FILE_MODE_OFFSET = 40;
    private static final java.util.regex.Pattern GNU_LONGNAME_PATTERN = null;
    private static final java.lang.String GNU_STRING_TABLE_NAME = "//";
    private static final int GROUP_ID_LEN = 6;
    private static final int GROUP_ID_OFFSET = 34;
    private static final int LAST_MODIFIED_LEN = 12;
    private static final int LAST_MODIFIED_OFFSET = 16;
    private static final int LENGTH_LEN = 10;
    private static final int LENGTH_OFFSET = 48;
    private static final int NAME_LEN = 16;
    private static final int NAME_OFFSET = 0;
    private static final int USER_ID_LEN = 6;
    private static final int USER_ID_OFFSET = 28;
    private boolean closed;
    private org.apache.commons.compress.archivers.ar.ArArchiveEntry currentEntry;
    private long entryOffset;
    private final byte[] metaData;
    private byte[] namebuffer;
    private long offset;

    static {
            java.lang.String r0 = "#1/"
            int r0 = r0.length()
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.BSD_LONGNAME_PREFIX_LEN = r0
            java.lang.String r0 = "^#1/\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.BSD_LONGNAME_PATTERN = r0
            java.lang.String r0 = "^/\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.compress.archivers.ar.ArArchiveInputStream.GNU_LONGNAME_PATTERN = r0
            return
    }

    public ArArchiveInputStream(java.io.InputStream r3) {
            r2 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r0 = r0.name()
            r2.<init>(r3, r0)
            r0 = -1
            r2.entryOffset = r0
            r3 = 58
            byte[] r3 = new byte[r3]
            r2.metaData = r3
            return
    }

    private int asInt(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            r4 = 10
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r0.asInt(r1, r2, r3, r4, r5)
            return r7
    }

    private int asInt(byte[] r7, int r8, int r9, int r10) throws java.io.IOException {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r7 = r0.asInt(r1, r2, r3, r4, r5)
            return r7
    }

    private int asInt(byte[] r1, int r2, int r3, int r4, boolean r5) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r1, r2, r3)
            java.lang.String r1 = r1.trim()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L12
            if (r5 == 0) goto L12
            r1 = 0
            return r1
        L12:
            int r1 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r1, r4)
            return r1
    }

    private int asInt(byte[] r7, int r8, int r9, boolean r10) throws java.io.IOException {
            r6 = this;
            r4 = 10
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            int r7 = r0.asInt(r1, r2, r3, r4, r5)
            return r7
    }

    private long asLong(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r1, r2, r3)
            java.lang.String r1 = r1.trim()
            long r1 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r1)
            return r1
    }

    private java.lang.String getBSDLongName(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            int r0 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.BSD_LONGNAME_PREFIX_LEN
            java.lang.String r5 = r5.substring(r0)
            int r5 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r5)
            java.io.InputStream r0 = r4.in
            byte[] r0 = org.apache.commons.compress.utils.IOUtils.readRange(r0, r5)
            int r1 = r0.length
            long r2 = (long) r1
            r4.trackReadBytes(r2)
            if (r1 != r5) goto L1c
            java.lang.String r5 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r0)
            return r5
        L1c:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
    }

    private java.lang.String getExtendedName(int r5) throws java.io.IOException {
            r4 = this;
            byte[] r0 = r4.namebuffer
            if (r0 == 0) goto L3f
            r0 = r5
        L5:
            byte[] r1 = r4.namebuffer
            int r2 = r1.length
            if (r0 >= r2) goto L2a
            r2 = r1[r0]
            r3 = 10
            if (r2 == r3) goto L16
            if (r2 != 0) goto L13
            goto L16
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            if (r0 == 0) goto L2a
            int r2 = r0 + (-1)
            r2 = r1[r2]
            r3 = 47
            if (r2 != r3) goto L22
            int r0 = r0 + (-1)
        L22:
            int r0 = r0 - r5
            if (r0 <= 0) goto L2a
            java.lang.String r5 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r1, r5, r0)
            return r5
        L2a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read entry: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L3f:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Cannot process GNU long file name as no // record was found"
            r5.<init>(r0)
            throw r5
    }

    private static boolean isBSDLongName(java.lang.String r1) {
            if (r1 == 0) goto L10
            java.util.regex.Pattern r0 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.BSD_LONGNAME_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    private boolean isGNULongName(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L10
            java.util.regex.Pattern r0 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.GNU_LONGNAME_PATTERN
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private static boolean isGNUStringTable(java.lang.String r1) {
            java.lang.String r0 = "//"
            boolean r1 = r0.equals(r1)
            return r1
    }

    public static boolean matches(byte[] r3, int r4) {
            r0 = 8
            r1 = 0
            if (r4 < r0) goto L3d
            r4 = r3[r1]
            r0 = 33
            if (r4 != r0) goto L3d
            r4 = 1
            r0 = r3[r4]
            r2 = 60
            if (r0 != r2) goto L3d
            r0 = 2
            r0 = r3[r0]
            r2 = 97
            if (r0 != r2) goto L3d
            r0 = 3
            r0 = r3[r0]
            r2 = 114(0x72, float:1.6E-43)
            if (r0 != r2) goto L3d
            r0 = 4
            r0 = r3[r0]
            r2 = 99
            if (r0 != r2) goto L3d
            r0 = 5
            r0 = r3[r0]
            r2 = 104(0x68, float:1.46E-43)
            if (r0 != r2) goto L3d
            r0 = 6
            r0 = r3[r0]
            r2 = 62
            if (r0 != r2) goto L3d
            r0 = 7
            r3 = r3[r0]
            r0 = 10
            if (r3 != r0) goto L3d
            r1 = r4
        L3d:
            return r1
    }

    private org.apache.commons.compress.archivers.ar.ArArchiveEntry readGNUStringTable(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r3 = r2.asInt(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> L3b
            java.io.InputStream r4 = r2.in
            byte[] r4 = org.apache.commons.compress.utils.IOUtils.readRange(r4, r3)
            r2.namebuffer = r4
            int r4 = r4.length
            long r0 = (long) r4
            r2.trackReadBytes(r0)
            if (r4 != r3) goto L1c
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r4 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry
            java.lang.String r5 = "//"
            long r0 = (long) r3
            r4.<init>(r5, r0)
            return r4
        L1c:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to read complete // record: expected="
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " read="
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
        L3b:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Broken archive, unable to parse GNU string table length field as a number"
            r4.<init>(r5, r3)
            throw r4
    }

    private void trackReadBytes(long r3) {
            r2 = this;
            r2.count(r3)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto Le
            long r0 = r2.offset
            long r0 = r0 + r3
            r2.offset = r0
        Le:
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Lc
            r0 = 1
            r1.closed = r0
            java.io.InputStream r0 = r1.in
            r0.close()
        Lc:
            r0 = 0
            r1.currentEntry = r0
            return
    }

    @java.lang.Deprecated
    public org.apache.commons.compress.archivers.ar.ArArchiveEntry getNextArEntry() throws java.io.IOException {
            r23 = this;
            r1 = r23
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r1.currentEntry
            r2 = 0
            if (r0 == 0) goto L1c
            long r3 = r1.entryOffset
            long r5 = r0.getLength()
            long r3 = r3 + r5
            java.io.InputStream r0 = r1.in
            long r5 = r1.offset
            long r3 = r3 - r5
            long r3 = org.apache.commons.io.IOUtils.skip(r0, r3)
            r1.trackReadBytes(r3)
            r1.currentEntry = r2
        L1c:
            long r3 = r1.offset
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L72
            java.lang.String r0 = "!<arch>\n"
            byte[] r0 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(r0)
            java.io.InputStream r3 = r1.in
            int r4 = r0.length
            byte[] r3 = org.apache.commons.compress.utils.IOUtils.readRange(r3, r4)
            int r4 = r3.length
            long r7 = (long) r4
            r1.trackReadBytes(r7)
            int r7 = r0.length
            if (r4 != r7) goto L59
            boolean r0 = java.util.Arrays.equals(r0, r3)
            if (r0 == 0) goto L40
            goto L72
        L40:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid header "
            r2.<init>(r4)
            java.lang.String r3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L59:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to read header. Occurred at byte: "
            r2.<init>(r3)
            long r3 = r23.getBytesRead()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L72:
            long r3 = r1.offset
            r7 = 2
            long r3 = r3 % r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            java.io.InputStream r0 = r1.in
            int r0 = r0.read()
            if (r0 >= 0) goto L84
            return r2
        L84:
            r3 = 1
            r1.trackReadBytes(r3)
        L89:
            java.io.InputStream r0 = r1.in
            byte[] r3 = r1.metaData
            int r0 = org.apache.commons.compress.utils.IOUtils.readFully(r0, r3)
            long r3 = (long) r0
            r1.trackReadBytes(r3)
            if (r0 != 0) goto L98
            return r2
        L98:
            byte[] r2 = r1.metaData
            int r2 = r2.length
            if (r0 < r2) goto L1a1
            java.lang.String r0 = "`\n"
            byte[] r0 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(r0)
            java.io.InputStream r2 = r1.in
            int r3 = r0.length
            byte[] r2 = org.apache.commons.compress.utils.IOUtils.readRange(r2, r3)
            int r3 = r2.length
            long r7 = (long) r3
            r1.trackReadBytes(r7)
            int r4 = r0.length
            if (r3 != r4) goto L188
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L16f
            long r2 = r1.offset
            r1.entryOffset = r2
            byte[] r0 = r1.metaData
            r2 = 0
            r3 = 16
            java.lang.String r0 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r0, r2, r3)
            java.lang.String r0 = r0.trim()
            boolean r4 = isGNUStringTable(r0)
            r7 = 10
            r8 = 48
            if (r4 == 0) goto Le0
            byte[] r0 = r1.metaData
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r1.readGNUStringTable(r0, r8, r7)
            r1.currentEntry = r0
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r23.getNextArEntry()
            return r0
        Le0:
            byte[] r4 = r1.metaData     // Catch: java.lang.NumberFormatException -> L166
            long r7 = r1.asLong(r4, r8, r7)     // Catch: java.lang.NumberFormatException -> L166
            java.lang.String r4 = "/"
            boolean r4 = r0.endsWith(r4)
            r9 = 1
            if (r4 == 0) goto Lfc
            int r4 = r0.length()
            int r4 = r4 - r9
            java.lang.String r0 = r0.substring(r2, r4)
        Lf8:
            r15 = r0
            r16 = r7
            goto L125
        Lfc:
            boolean r2 = r1.isGNULongName(r0)
            if (r2 == 0) goto L10f
            java.lang.String r0 = r0.substring(r9)
            int r0 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r0)
            java.lang.String r0 = r1.getExtendedName(r0)
            goto Lf8
        L10f:
            boolean r2 = isBSDLongName(r0)
            if (r2 == 0) goto Lf8
            java.lang.String r0 = r1.getBSDLongName(r0)
            int r2 = r0.length()
            long r10 = (long) r2
            long r7 = r7 - r10
            long r12 = r1.entryOffset
            long r12 = r12 + r10
            r1.entryOffset = r12
            goto Lf8
        L125:
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 < 0) goto L15e
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry     // Catch: java.lang.NumberFormatException -> L155
            byte[] r2 = r1.metaData     // Catch: java.lang.NumberFormatException -> L155
            r4 = 28
            r5 = 6
            int r18 = r1.asInt(r2, r4, r5, r9)     // Catch: java.lang.NumberFormatException -> L155
            byte[] r2 = r1.metaData     // Catch: java.lang.NumberFormatException -> L155
            r4 = 34
            int r19 = r1.asInt(r2, r4, r5, r9)     // Catch: java.lang.NumberFormatException -> L155
            byte[] r2 = r1.metaData     // Catch: java.lang.NumberFormatException -> L155
            r4 = 40
            r5 = 8
            int r20 = r1.asInt(r2, r4, r5, r5)     // Catch: java.lang.NumberFormatException -> L155
            byte[] r2 = r1.metaData     // Catch: java.lang.NumberFormatException -> L155
            r4 = 12
            long r21 = r1.asLong(r2, r3, r4)     // Catch: java.lang.NumberFormatException -> L155
            r14 = r0
            r14.<init>(r15, r16, r18, r19, r20, r21)     // Catch: java.lang.NumberFormatException -> L155
            r1.currentEntry = r0     // Catch: java.lang.NumberFormatException -> L155
            return r0
        L155:
            r0 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Broken archive, unable to parse entry metadata fields as numbers"
            r2.<init>(r3, r0)
            throw r2
        L15e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "broken archive, entry with negative size"
            r0.<init>(r2)
            throw r0
        L166:
            r0 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Broken archive, unable to parse ar_size field as a number"
            r2.<init>(r3, r0)
            throw r2
        L16f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid entry trailer. not read the content? Occurred at byte: "
            r2.<init>(r3)
            long r3 = r23.getBytesRead()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L188:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to read entry trailer. Occurred at byte: "
            r2.<init>(r3)
            long r3 = r23.getBytesRead()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L1a1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Truncated ar archive"
            r0.<init>(r2)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public org.apache.commons.compress.archivers.ar.ArArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r1.getNextArEntry()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            if (r10 != 0) goto L4
            r8 = 0
            return r8
        L4:
            org.apache.commons.compress.archivers.ar.ArArchiveEntry r0 = r7.currentEntry
            if (r0 == 0) goto L2c
            long r1 = r7.entryOffset
            long r3 = r0.getLength()
            long r1 = r1 + r3
            if (r10 < 0) goto L2a
            long r3 = r7.offset
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L18
            goto L2a
        L18:
            long r5 = (long) r10
            long r1 = r1 - r3
            long r0 = java.lang.Math.min(r5, r1)
            int r10 = (int) r0
            java.io.InputStream r0 = r7.in
            int r8 = r0.read(r8, r9, r10)
            long r9 = (long) r8
            r7.trackReadBytes(r9)
            return r8
        L2a:
            r8 = -1
            return r8
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "No current ar entry"
            r8.<init>(r9)
            throw r8
    }
}
