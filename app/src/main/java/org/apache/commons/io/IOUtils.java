package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class IOUtils {
    public static final int CR = 13;
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final char DIR_SEPARATOR = 0;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final int EOF = -1;
    public static final int LF = 10;

    @java.lang.Deprecated
    public static final java.lang.String LINE_SEPARATOR = null;
    public static final java.lang.String LINE_SEPARATOR_UNIX = null;
    public static final java.lang.String LINE_SEPARATOR_WINDOWS = null;
    private static final java.lang.ThreadLocal<byte[]> SCRATCH_BYTE_BUFFER_RW = null;
    private static final byte[] SCRATCH_BYTE_BUFFER_WO = null;
    private static final java.lang.ThreadLocal<char[]> SCRATCH_CHAR_BUFFER_RW = null;
    private static final char[] SCRATCH_CHAR_BUFFER_WO = null;

    /* JADX INFO: renamed from: $r8$lambda$EoENAJOUl-J0cy67yUi7ndIov7Q, reason: not valid java name */
    public static /* synthetic */ int m2571$r8$lambda$EoENAJOUlJ0cy67yUi7ndIov7Q(java.io.InputStream r0, byte[] r1, int r2, int r3) {
            int r0 = r0.read(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.io.InputStream $r8$lambda$GF8JHa7vXNEFej4auUeh7g5xcuU(java.net.URL r0) {
            java.io.InputStream r0 = r0.openStream()
            return r0
    }

    public static /* synthetic */ char[] $r8$lambda$nhok4VmVA59xk_1RZV2Lyl0mABA() {
            char[] r0 = charArray()
            return r0
    }

    static {
            char r0 = java.io.File.separatorChar
            org.apache.commons.io.IOUtils.DIR_SEPARATOR = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            org.apache.commons.io.IOUtils.EMPTY_BYTE_ARRAY = r0
            java.lang.String r0 = java.lang.System.lineSeparator()
            org.apache.commons.io.IOUtils.LINE_SEPARATOR = r0
            org.apache.commons.io.StandardLineSeparator r0 = org.apache.commons.io.StandardLineSeparator.LF
            java.lang.String r0 = r0.getString()
            org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX = r0
            org.apache.commons.io.StandardLineSeparator r0 = org.apache.commons.io.StandardLineSeparator.CRLF
            java.lang.String r0 = r0.getString()
            org.apache.commons.io.IOUtils.LINE_SEPARATOR_WINDOWS = r0
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda8 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda8
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.apache.commons.io.IOUtils.SCRATCH_BYTE_BUFFER_RW = r0
            byte[] r0 = byteArray()
            org.apache.commons.io.IOUtils.SCRATCH_BYTE_BUFFER_WO = r0
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda9 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda9
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.apache.commons.io.IOUtils.SCRATCH_CHAR_BUFFER_RW = r0
            char[] r0 = charArray()
            org.apache.commons.io.IOUtils.SCRATCH_CHAR_BUFFER_WO = r0
            return
    }

    @java.lang.Deprecated
    public IOUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.BufferedInputStream buffer(java.io.InputStream r1) {
            java.lang.String r0 = "inputStream"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedInputStream
            if (r0 == 0) goto Lc
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            goto L12
        Lc:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r1)
            r1 = r0
        L12:
            return r1
    }

    public static java.io.BufferedInputStream buffer(java.io.InputStream r1, int r2) {
            java.lang.String r0 = "inputStream"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedInputStream
            if (r0 == 0) goto Lc
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            goto L12
        Lc:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    public static java.io.BufferedOutputStream buffer(java.io.OutputStream r1) {
            java.lang.String r0 = "outputStream"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedOutputStream
            if (r0 == 0) goto Lc
            java.io.BufferedOutputStream r1 = (java.io.BufferedOutputStream) r1
            goto L12
        Lc:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r1)
            r1 = r0
        L12:
            return r1
    }

    public static java.io.BufferedOutputStream buffer(java.io.OutputStream r1, int r2) {
            java.lang.String r0 = "outputStream"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedOutputStream
            if (r0 == 0) goto Lc
            java.io.BufferedOutputStream r1 = (java.io.BufferedOutputStream) r1
            goto L12
        Lc:
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r1, r2)
            r1 = r0
        L12:
            return r1
    }

    public static java.io.BufferedReader buffer(java.io.Reader r1) {
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto L7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto Ld
        L7:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    public static java.io.BufferedReader buffer(java.io.Reader r1, int r2) {
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto L7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto Ld
        L7:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1, r2)
            r1 = r0
        Ld:
            return r1
    }

    public static java.io.BufferedWriter buffer(java.io.Writer r1) {
            boolean r0 = r1 instanceof java.io.BufferedWriter
            if (r0 == 0) goto L7
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            goto Ld
        L7:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    public static java.io.BufferedWriter buffer(java.io.Writer r1, int r2) {
            boolean r0 = r1 instanceof java.io.BufferedWriter
            if (r0 == 0) goto L7
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            goto Ld
        L7:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r1, r2)
            r1 = r0
        Ld:
            return r1
    }

    public static byte[] byteArray() {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = byteArray(r0)
            return r0
    }

    public static byte[] byteArray(int r0) {
            byte[] r0 = new byte[r0]
            return r0
    }

    private static char[] charArray() {
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r0 = charArray(r0)
            return r0
    }

    private static char[] charArray(int r0) {
            char[] r0 = new char[r0]
            return r0
    }

    static void clear() {
            java.lang.ThreadLocal<byte[]> r0 = org.apache.commons.io.IOUtils.SCRATCH_BYTE_BUFFER_RW
            r0.remove()
            java.lang.ThreadLocal<char[]> r0 = org.apache.commons.io.IOUtils.SCRATCH_CHAR_BUFFER_RW
            r0.remove()
            byte[] r0 = org.apache.commons.io.IOUtils.SCRATCH_BYTE_BUFFER_WO
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            char[] r0 = org.apache.commons.io.IOUtils.SCRATCH_CHAR_BUFFER_WO
            java.util.Arrays.fill(r0, r1)
            return
    }

    public static void close(java.io.Closeable r0) throws java.io.IOException {
            if (r0 == 0) goto L5
            r0.close()
        L5:
            return
    }

    public static void close(java.io.Closeable r0, org.apache.commons.io.function.IOConsumer<java.io.IOException> r1) throws java.io.IOException {
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.io.IOException -> L6
            goto Lc
        L6:
            r0 = move-exception
            if (r1 == 0) goto Lc
            r1.accept(r0)
        Lc:
            return
    }

    public static void close(java.net.URLConnection r1) {
            boolean r0 = r1 instanceof java.net.HttpURLConnection
            if (r0 == 0) goto L9
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.disconnect()
        L9:
            return
    }

    public static void close(java.io.Closeable... r1) throws org.apache.commons.io.IOExceptionList {
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda3
            r0.<init>()
            org.apache.commons.io.function.IOConsumer.forAll(r0, r1)
            return
    }

    private static void closeQ(java.io.Closeable r1) {
            r0 = 0
            closeQuietly(r1, r0)
            return
    }

    public static void closeQuietly(java.io.Closeable r1) {
            r0 = 0
            closeQuietly(r1, r0)
            return
    }

    public static void closeQuietly(java.io.Closeable r0, java.util.function.Consumer<java.io.IOException> r1) {
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.io.IOException -> L6
            goto Lc
        L6:
            r0 = move-exception
            if (r1 == 0) goto Lc
            r1.accept(r0)
        Lc:
            return
    }

    public static void closeQuietly(java.io.InputStream r0) {
            closeQ(r0)
            return
    }

    public static void closeQuietly(java.io.OutputStream r0) {
            closeQ(r0)
            return
    }

    public static void closeQuietly(java.io.Reader r0) {
            closeQ(r0)
            return
    }

    public static void closeQuietly(java.io.Writer r0) {
            closeQ(r0)
            return
    }

    public static void closeQuietly(java.lang.Iterable<java.io.Closeable> r1) {
            if (r1 == 0) goto La
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda0
            r0.<init>()
            r1.forEach(r0)
        La:
            return
    }

    public static void closeQuietly(java.net.ServerSocket r0) {
            closeQ(r0)
            return
    }

    public static void closeQuietly(java.net.Socket r0) {
            closeQ(r0)
            return
    }

    public static void closeQuietly(java.nio.channels.Selector r0) {
            closeQ(r0)
            return
    }

    public static void closeQuietly(java.util.stream.Stream<java.io.Closeable> r1) {
            if (r1 == 0) goto La
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda0
            r0.<init>()
            r1.forEach(r0)
        La:
            return
    }

    public static void closeQuietly(java.io.Closeable... r0) {
            if (r0 == 0) goto L9
            java.util.stream.Stream r0 = java.util.Arrays.stream(r0)
            closeQuietly(r0)
        L9:
            return
    }

    public static long consume(java.io.InputStream r2) throws java.io.IOException {
            org.apache.commons.io.output.NullOutputStream r0 = org.apache.commons.io.output.NullOutputStream.INSTANCE
            long r0 = copyLarge(r2, r0)
            return r0
    }

    public static long consume(java.io.Reader r2) throws java.io.IOException {
            org.apache.commons.io.output.NullWriter r0 = org.apache.commons.io.output.NullWriter.INSTANCE
            long r0 = copyLarge(r2, r0)
            return r0
    }

    public static boolean contentEquals(java.io.InputStream r9, java.io.InputStream r10) throws java.io.IOException {
            r0 = 1
            if (r9 != r10) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L54
            if (r10 != 0) goto La
            goto L54
        La:
            byte[] r2 = getScratchByteArray()
            byte[] r3 = byteArray()
        L12:
            r4 = r1
            r5 = r4
            r6 = r5
        L15:
            r7 = 8192(0x2000, float:1.148E-41)
            if (r4 >= r7) goto L12
            r7 = -1
            if (r5 != r4) goto L32
        L1c:
            int r8 = 8192 - r5
            int r8 = r9.read(r2, r5, r8)
            if (r8 == 0) goto L1c
            if (r8 != r7) goto L31
            if (r6 != r4) goto L2f
            int r9 = r10.read()
            if (r9 != r7) goto L2f
            goto L30
        L2f:
            r0 = r1
        L30:
            return r0
        L31:
            int r5 = r5 + r8
        L32:
            if (r6 != r4) goto L4a
        L34:
            int r8 = 8192 - r6
            int r8 = r10.read(r3, r6, r8)
            if (r8 == 0) goto L34
            if (r8 != r7) goto L49
            if (r5 != r4) goto L47
            int r9 = r9.read()
            if (r9 != r7) goto L47
            goto L48
        L47:
            r0 = r1
        L48:
            return r0
        L49:
            int r6 = r6 + r8
        L4a:
            r7 = r2[r4]
            r8 = r3[r4]
            if (r7 == r8) goto L51
            return r1
        L51:
            int r4 = r4 + 1
            goto L15
        L54:
            return r1
    }

    public static boolean contentEquals(java.io.Reader r9, java.io.Reader r10) throws java.io.IOException {
            r0 = 1
            if (r9 != r10) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L54
            if (r10 != 0) goto La
            goto L54
        La:
            char[] r2 = getScratchCharArray()
            char[] r3 = charArray()
        L12:
            r4 = r1
            r5 = r4
            r6 = r5
        L15:
            r7 = 8192(0x2000, float:1.148E-41)
            if (r4 >= r7) goto L12
            r7 = -1
            if (r5 != r4) goto L32
        L1c:
            int r8 = 8192 - r5
            int r8 = r9.read(r2, r5, r8)
            if (r8 == 0) goto L1c
            if (r8 != r7) goto L31
            if (r6 != r4) goto L2f
            int r9 = r10.read()
            if (r9 != r7) goto L2f
            goto L30
        L2f:
            r0 = r1
        L30:
            return r0
        L31:
            int r5 = r5 + r8
        L32:
            if (r6 != r4) goto L4a
        L34:
            int r8 = 8192 - r6
            int r8 = r10.read(r3, r6, r8)
            if (r8 == 0) goto L34
            if (r8 != r7) goto L49
            if (r5 != r4) goto L47
            int r9 = r9.read()
            if (r9 != r7) goto L47
            goto L48
        L47:
            r0 = r1
        L48:
            return r0
        L49:
            int r6 = r6 + r8
        L4a:
            char r7 = r2[r4]
            char r8 = r3[r4]
            if (r7 == r8) goto L51
            return r1
        L51:
            int r4 = r4 + 1
            goto L15
        L54:
            return r1
    }

    private static boolean contentEquals(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
    }

    private static boolean contentEquals(java.util.stream.Stream<?> r0, java.util.stream.Stream<?> r1) {
            if (r0 != r1) goto L4
            r0 = 1
            return r0
        L4:
            if (r0 == 0) goto L16
            if (r1 != 0) goto L9
            goto L16
        L9:
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = contentEquals(r0, r1)
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean contentEqualsIgnoreEOL(java.io.BufferedReader r0, java.io.BufferedReader r1) {
            if (r0 != r1) goto L4
            r0 = 1
            return r0
        L4:
            if (r0 == 0) goto L16
            if (r1 != 0) goto L9
            goto L16
        L9:
            java.util.stream.Stream r0 = r0.lines()
            java.util.stream.Stream r1 = r1.lines()
            boolean r0 = contentEquals(r0, r1)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static boolean contentEqualsIgnoreEOL(java.io.Reader r0, java.io.Reader r1) throws java.io.UncheckedIOException {
            if (r0 != r1) goto L4
            r0 = 1
            return r0
        L4:
            if (r0 == 0) goto L16
            if (r1 != 0) goto L9
            goto L16
        L9:
            java.io.BufferedReader r0 = toBufferedReader(r0)
            java.io.BufferedReader r1 = toBufferedReader(r1)
            boolean r0 = contentEqualsIgnoreEOL(r0, r1)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static int copy(java.io.InputStream r2, java.io.OutputStream r3) throws java.io.IOException {
            long r2 = copyLarge(r2, r3)
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r2 = -1
            goto Le
        Ld:
            int r2 = (int) r2
        Le:
            return r2
    }

    public static int copy(java.io.Reader r2, java.io.Writer r3) throws java.io.IOException {
            long r2 = copyLarge(r2, r3)
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r2 = -1
            return r2
        Ld:
            int r2 = (int) r2
            return r2
    }

    public static long copy(java.io.InputStream r0, java.io.OutputStream r1, int r2) throws java.io.IOException {
            byte[] r2 = byteArray(r2)
            long r0 = copyLarge(r0, r1, r2)
            return r0
    }

    public static long copy(java.io.Reader r1, java.lang.Appendable r2) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.CharBuffer r0 = java.nio.CharBuffer.allocate(r0)
            long r1 = copy(r1, r2, r0)
            return r1
    }

    public static long copy(java.io.Reader r4, java.lang.Appendable r5, java.nio.CharBuffer r6) throws java.io.IOException {
            r0 = 0
        L2:
            int r2 = r4.read(r6)
            r3 = -1
            if (r3 == r2) goto L13
            r6.flip()
            r3 = 0
            r5.append(r6, r3, r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L2
        L13:
            return r0
    }

    public static long copy(java.net.URL r2, java.io.File r3) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r0)
            java.io.File r3 = (java.io.File) r3
            java.nio.file.Path r3 = r3.toPath()
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r0)
            long r0 = copy(r2, r3)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1c
            r3.close()
        L1c:
            return r0
        L1d:
            r2 = move-exception
            if (r3 == 0) goto L28
            r3.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r3 = move-exception
            r2.addSuppressed(r3)
        L28:
            throw r2
    }

    public static long copy(java.net.URL r2, java.io.OutputStream r3) throws java.io.IOException {
            java.lang.String r0 = "url"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.net.URL r2 = (java.net.URL) r2
            java.io.InputStream r2 = r2.openStream()
            long r0 = copyLarge(r2, r3)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L15
            r2.close()
        L15:
            return r0
        L16:
            r3 = move-exception
            if (r2 == 0) goto L21
            r2.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r2 = move-exception
            r3.addSuppressed(r2)
        L21:
            throw r3
    }

    public static org.apache.commons.io.input.QueueInputStream copy(java.io.ByteArrayOutputStream r2) throws java.io.IOException {
            java.lang.String r0 = "outputStream"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.input.QueueInputStream r0 = new org.apache.commons.io.input.QueueInputStream
            r0.<init>()
            org.apache.commons.io.output.QueueOutputStream r1 = r0.newQueueOutputStream()
            r2.writeTo(r1)
            return r0
    }

    @java.lang.Deprecated
    public static void copy(java.io.InputStream r1, java.io.Writer r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            copy(r1, r2, r0)
            return
    }

    public static void copy(java.io.InputStream r0, java.io.Writer r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            copy(r0, r1, r2)
            return
    }

    public static void copy(java.io.InputStream r1, java.io.Writer r2, java.nio.charset.Charset r3) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            r0.<init>(r1, r3)
            copy(r0, r2)
            return
    }

    @java.lang.Deprecated
    public static void copy(java.io.Reader r1, java.io.OutputStream r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            copy(r1, r2, r0)
            return
    }

    public static void copy(java.io.Reader r0, java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            copy(r0, r1, r2)
            return
    }

    public static void copy(java.io.Reader r1, java.io.OutputStream r2, java.nio.charset.Charset r3) throws java.io.IOException {
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            r0.<init>(r2, r3)
            copy(r1, r0)
            r0.flush()
            return
    }

    public static long copyLarge(java.io.InputStream r1, java.io.OutputStream r2) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            long r1 = copy(r1, r2, r0)
            return r1
    }

    public static long copyLarge(java.io.InputStream r7, java.io.OutputStream r8, long r9, long r11) throws java.io.IOException {
            byte[] r6 = getScratchByteArray()
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            long r7 = copyLarge(r0, r1, r2, r4, r6)
            return r7
    }

    public static long copyLarge(java.io.InputStream r6, java.io.OutputStream r7, long r8, long r10, byte[] r12) throws java.io.IOException {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            skipFully(r6, r8)
        L9:
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 != 0) goto Le
            return r0
        Le:
            int r9 = r12.length
            if (r8 <= 0) goto L18
            long r2 = (long) r9
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L18
            int r2 = (int) r10
            goto L19
        L18:
            r2 = r9
        L19:
            if (r2 <= 0) goto L33
            r3 = 0
            int r4 = r6.read(r12, r3, r2)
            r5 = -1
            if (r5 == r4) goto L33
            r7.write(r12, r3, r4)
            long r3 = (long) r4
            long r0 = r0 + r3
            if (r8 <= 0) goto L19
            long r2 = r10 - r0
            long r4 = (long) r9
            long r2 = java.lang.Math.min(r2, r4)
            int r2 = (int) r2
            goto L19
        L33:
            return r0
    }

    public static long copyLarge(java.io.InputStream r4, java.io.OutputStream r5, byte[] r6) throws java.io.IOException {
            java.lang.String r0 = "inputStream"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "outputStream"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
        Lc:
            int r2 = r4.read(r6)
            r3 = -1
            if (r3 == r2) goto L1a
            r3 = 0
            r5.write(r6, r3, r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            goto Lc
        L1a:
            return r0
    }

    public static long copyLarge(java.io.Reader r1, java.io.Writer r2) throws java.io.IOException {
            char[] r0 = getScratchCharArray()
            long r1 = copyLarge(r1, r2, r0)
            return r1
    }

    public static long copyLarge(java.io.Reader r7, java.io.Writer r8, long r9, long r11) throws java.io.IOException {
            char[] r6 = getScratchCharArray()
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            long r7 = copyLarge(r0, r1, r2, r4, r6)
            return r7
    }

    public static long copyLarge(java.io.Reader r6, java.io.Writer r7, long r8, long r10, char[] r12) throws java.io.IOException {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            skipFully(r6, r8)
        L9:
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 != 0) goto Le
            return r0
        Le:
            int r9 = r12.length
            if (r8 <= 0) goto L18
            int r2 = r12.length
            long r2 = (long) r2
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L18
            int r9 = (int) r10
        L18:
            if (r9 <= 0) goto L33
            r2 = 0
            int r3 = r6.read(r12, r2, r9)
            r4 = -1
            if (r4 == r3) goto L33
            r7.write(r12, r2, r3)
            long r2 = (long) r3
            long r0 = r0 + r2
            if (r8 <= 0) goto L18
            long r2 = r10 - r0
            int r9 = r12.length
            long r4 = (long) r9
            long r2 = java.lang.Math.min(r2, r4)
            int r9 = (int) r2
            goto L18
        L33:
            return r0
    }

    public static long copyLarge(java.io.Reader r4, java.io.Writer r5, char[] r6) throws java.io.IOException {
            r0 = 0
        L2:
            int r2 = r4.read(r6)
            r3 = -1
            if (r3 == r2) goto L10
            r3 = 0
            r5.write(r6, r3, r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L2
        L10:
            return r0
    }

    private static byte[] fill0(byte[] r1) {
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return r1
    }

    private static char[] fill0(char[] r1) {
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return r1
    }

    static byte[] getScratchByteArray() {
            java.lang.ThreadLocal<byte[]> r0 = org.apache.commons.io.IOUtils.SCRATCH_BYTE_BUFFER_RW
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            byte[] r0 = fill0(r0)
            return r0
    }

    static byte[] getScratchByteArrayWriteOnly() {
            byte[] r0 = org.apache.commons.io.IOUtils.SCRATCH_BYTE_BUFFER_WO
            byte[] r0 = fill0(r0)
            return r0
    }

    static char[] getScratchCharArray() {
            java.lang.ThreadLocal<char[]> r0 = org.apache.commons.io.IOUtils.SCRATCH_CHAR_BUFFER_RW
            java.lang.Object r0 = r0.get()
            char[] r0 = (char[]) r0
            char[] r0 = fill0(r0)
            return r0
    }

    static char[] getScratchCharArrayWriteOnly() {
            char[] r0 = org.apache.commons.io.IOUtils.SCRATCH_CHAR_BUFFER_WO
            char[] r0 = fill0(r0)
            return r0
    }

    static /* synthetic */ void lambda$toByteArray$0(org.apache.commons.io.output.ThresholdingOutputStream r2) throws java.io.IOException {
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Cannot read more than %,d into a byte array"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r2.<init>(r0)
            throw r2
    }

    static /* synthetic */ java.io.OutputStream lambda$toByteArray$1(org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream r0, org.apache.commons.io.output.ThresholdingOutputStream r1) throws java.io.IOException {
            return r0
    }

    static /* synthetic */ java.lang.String lambda$toString$2() throws java.io.IOException {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "input"
            r0.<init>(r1)
            throw r0
    }

    public static int length(java.lang.CharSequence r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.length()
        L8:
            return r0
    }

    public static int length(byte[] r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L5
        L4:
            int r0 = r0.length
        L5:
            return r0
    }

    public static int length(char[] r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L5
        L4:
            int r0 = r0.length
        L5:
            return r0
    }

    public static int length(java.lang.Object[] r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L5
        L4:
            int r0 = r0.length
        L5:
            return r0
    }

    public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            org.apache.commons.io.LineIterator r0 = lineIterator(r0, r1)
            return r0
    }

    public static org.apache.commons.io.LineIterator lineIterator(java.io.InputStream r2, java.nio.charset.Charset r3) {
            org.apache.commons.io.LineIterator r0 = new org.apache.commons.io.LineIterator
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static org.apache.commons.io.LineIterator lineIterator(java.io.Reader r1) {
            org.apache.commons.io.LineIterator r0 = new org.apache.commons.io.LineIterator
            r0.<init>(r1)
            return r0
    }

    public static int read(java.io.InputStream r2, byte[] r3) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            int r2 = read(r2, r3, r0, r1)
            return r2
    }

    public static int read(java.io.InputStream r1, byte[] r2, int r3, int r4) throws java.io.IOException {
            if (r4 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda1
            r0.<init>(r1)
            int r1 = read(r0, r2, r3, r4)
            return r1
    }

    public static int read(java.io.Reader r2, char[] r3) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            int r2 = read(r2, r3, r0, r1)
            return r2
    }

    public static int read(java.io.Reader r3, char[] r4, int r5, int r6) throws java.io.IOException {
            if (r6 < 0) goto L14
            r0 = r6
        L3:
            if (r0 <= 0) goto L12
            int r1 = r6 - r0
            int r1 = r1 + r5
            int r1 = r3.read(r4, r1, r0)
            r2 = -1
            if (r2 != r1) goto L10
            goto L12
        L10:
            int r0 = r0 - r1
            goto L3
        L12:
            int r6 = r6 - r0
            return r6
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Length must not be negative: "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static int read(java.nio.channels.ReadableByteChannel r3, java.nio.ByteBuffer r4) throws java.io.IOException {
            int r0 = r4.remaining()
        L4:
            int r1 = r4.remaining()
            if (r1 <= 0) goto L11
            int r1 = r3.read(r4)
            r2 = -1
            if (r2 != r1) goto L4
        L11:
            int r3 = r4.remaining()
            int r0 = r0 - r3
            return r0
    }

    static int read(org.apache.commons.io.function.IOTriFunction<byte[], java.lang.Integer, java.lang.Integer, java.lang.Integer> r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            if (r6 < 0) goto L22
            r0 = r6
        L3:
            if (r0 <= 0) goto L20
            int r1 = r6 - r0
            int r1 = r1 + r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.apply(r4, r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = -1
            if (r2 != r1) goto L1e
            goto L20
        L1e:
            int r0 = r0 - r1
            goto L3
        L20:
            int r6 = r6 - r0
            return r6
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Length must not be negative: "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static void readFully(java.io.InputStream r2, byte[] r3) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            readFully(r2, r3, r0, r1)
            return
    }

    public static void readFully(java.io.InputStream r1, byte[] r2, int r3, int r4) throws java.io.IOException {
            int r1 = read(r1, r2, r3, r4)
            if (r1 != r4) goto L7
            return
        L7:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Length to read: "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " actual: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static void readFully(java.io.Reader r2, char[] r3) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            readFully(r2, r3, r0, r1)
            return
    }

    public static void readFully(java.io.Reader r1, char[] r2, int r3, int r4) throws java.io.IOException {
            int r1 = read(r1, r2, r3, r4)
            if (r1 != r4) goto L7
            return
        L7:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Length to read: "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " actual: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static void readFully(java.nio.channels.ReadableByteChannel r3, java.nio.ByteBuffer r4) throws java.io.IOException {
            int r0 = r4.remaining()
            int r3 = read(r3, r4)
            if (r3 != r0) goto Lb
            return
        Lb:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Length to read: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " actual: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static byte[] readFully(java.io.InputStream r2, int r3) throws java.io.IOException {
            byte[] r3 = byteArray(r3)
            r0 = 0
            int r1 = r3.length
            readFully(r2, r3, r0, r1)
            return r3
    }

    @java.lang.Deprecated
    public static java.util.List<java.lang.String> readLines(java.io.InputStream r1) throws java.io.UncheckedIOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.util.List r1 = readLines(r1, r0)
            return r1
    }

    public static java.util.List<java.lang.String> readLines(java.io.InputStream r0, java.lang.String r1) throws java.io.UncheckedIOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.util.List r0 = readLines(r0, r1)
            return r0
    }

    public static java.util.List<java.lang.String> readLines(java.io.InputStream r1, java.nio.charset.Charset r2) throws java.io.UncheckedIOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            r0.<init>(r1, r2)
            java.util.List r1 = readLines(r0)
            return r1
    }

    public static java.util.List<java.lang.String> readLines(java.io.Reader r1) throws java.io.UncheckedIOException {
            java.io.BufferedReader r1 = toBufferedReader(r1)
            java.util.stream.Stream r1 = r1.lines()
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static byte[] resourceToByteArray(java.lang.String r1) throws java.io.IOException {
            r0 = 0
            byte[] r1 = resourceToByteArray(r1, r0)
            return r1
    }

    public static byte[] resourceToByteArray(java.lang.String r0, java.lang.ClassLoader r1) throws java.io.IOException {
            java.net.URL r0 = resourceToURL(r0, r1)
            byte[] r0 = toByteArray(r0)
            return r0
    }

    public static java.lang.String resourceToString(java.lang.String r1, java.nio.charset.Charset r2) throws java.io.IOException {
            r0 = 0
            java.lang.String r1 = resourceToString(r1, r2, r0)
            return r1
    }

    public static java.lang.String resourceToString(java.lang.String r0, java.nio.charset.Charset r1, java.lang.ClassLoader r2) throws java.io.IOException {
            java.net.URL r0 = resourceToURL(r0, r2)
            java.lang.String r0 = toString(r0, r1)
            return r0
    }

    public static java.net.URL resourceToURL(java.lang.String r1) throws java.io.IOException {
            r0 = 0
            java.net.URL r1 = resourceToURL(r1, r0)
            return r1
    }

    public static java.net.URL resourceToURL(java.lang.String r2, java.lang.ClassLoader r3) throws java.io.IOException {
            if (r3 != 0) goto L9
            java.lang.Class<org.apache.commons.io.IOUtils> r3 = org.apache.commons.io.IOUtils.class
            java.net.URL r3 = r3.getResource(r2)
            goto Ld
        L9:
            java.net.URL r3 = r3.getResource(r2)
        Ld:
            if (r3 == 0) goto L10
            return r3
        L10:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Resource not found: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static long skip(java.io.InputStream r1, long r2) throws java.io.IOException {
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda4
            r0.<init>()
            long r1 = skip(r1, r2, r0)
            return r1
    }

    public static long skip(java.io.InputStream r7, long r8, java.util.function.Supplier<byte[]> r10) throws java.io.IOException {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L27
            r2 = r8
        L7:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L25
            java.lang.Object r4 = r10.get()
            byte[] r4 = (byte[]) r4
            int r5 = r4.length
            long r5 = (long) r5
            long r5 = java.lang.Math.min(r2, r5)
            int r5 = (int) r5
            r6 = 0
            int r4 = r7.read(r4, r6, r5)
            long r4 = (long) r4
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L25
        L23:
            long r2 = r2 - r4
            goto L7
        L25:
            long r8 = r8 - r2
            return r8
        L27:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Skip count must be non-negative, actual: "
            r10.<init>(r0)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static long skip(java.io.Reader r7, long r8) throws java.io.IOException {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L25
            r2 = r8
        L7:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L23
            char[] r4 = getScratchCharArrayWriteOnly()
            int r5 = r4.length
            long r5 = (long) r5
            long r5 = java.lang.Math.min(r2, r5)
            int r5 = (int) r5
            r6 = 0
            int r4 = r7.read(r4, r6, r5)
            long r4 = (long) r4
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L21
            goto L23
        L21:
            long r2 = r2 - r4
            goto L7
        L23:
            long r8 = r8 - r2
            return r8
        L25:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Skip count must be non-negative, actual: "
            r0.<init>(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static long skip(java.nio.channels.ReadableByteChannel r9, long r10) throws java.io.IOException {
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L2f
            r2 = 8192(0x2000, double:4.0474E-320)
            long r4 = java.lang.Math.min(r10, r2)
            int r4 = (int) r4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r5 = r10
        L12:
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L2d
            r7 = 0
            r4.position(r7)
            long r7 = java.lang.Math.min(r5, r2)
            int r7 = (int) r7
            r4.limit(r7)
            int r7 = r9.read(r4)
            r8 = -1
            if (r7 != r8) goto L2a
            goto L2d
        L2a:
            long r7 = (long) r7
            long r5 = r5 - r7
            goto L12
        L2d:
            long r10 = r10 - r5
            return r10
        L2f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Skip count must be non-negative, actual: "
            r0.<init>(r1)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    public static void skipFully(java.io.InputStream r4, long r5) throws java.io.IOException {
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda4
            r0.<init>()
            long r0 = skip(r4, r5, r0)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto Le
            return
        Le:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Bytes to skip: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r6 = " actual: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static void skipFully(java.io.InputStream r3, long r4, java.util.function.Supplier<byte[]> r6) throws java.io.IOException {
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L2e
            long r0 = skip(r3, r4, r6)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto Lf
            return
        Lf:
            java.io.EOFException r3 = new java.io.EOFException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Bytes to skip: "
            r6.<init>(r2)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r5 = " actual: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Bytes to skip must not be negative: "
            r6.<init>(r0)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static void skipFully(java.io.Reader r4, long r5) throws java.io.IOException {
            long r0 = skip(r4, r5)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto L9
            return
        L9:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Chars to skip: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r6 = " actual: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static void skipFully(java.nio.channels.ReadableByteChannel r4, long r5) throws java.io.IOException {
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L2e
            long r0 = skip(r4, r5)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto Lf
            return
        Lf:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Bytes to skip: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r6 = " actual: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bytes to skip must not be negative: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static java.io.InputStream toBufferedInputStream(java.io.InputStream r0) throws java.io.IOException {
            java.io.InputStream r0 = org.apache.commons.io.output.ByteArrayOutputStream.toBufferedInputStream(r0)
            return r0
    }

    public static java.io.InputStream toBufferedInputStream(java.io.InputStream r0, int r1) throws java.io.IOException {
            java.io.InputStream r0 = org.apache.commons.io.output.ByteArrayOutputStream.toBufferedInputStream(r0, r1)
            return r0
    }

    public static java.io.BufferedReader toBufferedReader(java.io.Reader r1) {
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto L7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto Ld
        L7:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    public static java.io.BufferedReader toBufferedReader(java.io.Reader r1, int r2) {
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto L7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto Ld
        L7:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1, r2)
            r1 = r0
        Ld:
            return r1
    }

    public static byte[] toByteArray(java.io.InputStream r5) throws java.io.IOException {
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$Builder r0 = org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream.builder()
            org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream r0 = r0.get()
            org.apache.commons.io.output.ThresholdingOutputStream r1 = new org.apache.commons.io.output.ThresholdingOutputStream     // Catch: java.lang.Throwable -> L34
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda6 r2 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda6     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda7 r3 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda7     // Catch: java.lang.Throwable -> L34
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L34
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r4, r2, r3)     // Catch: java.lang.Throwable -> L34
            copy(r5, r1)     // Catch: java.lang.Throwable -> L2a
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Throwable -> L2a
            r1.close()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L29
            r0.close()
        L29:
            return r5
        L2a:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.lang.Throwable -> L34
        L33:
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            if (r0 == 0) goto L3f
            r0.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            r5.addSuppressed(r0)
        L3f:
            throw r5
    }

    public static byte[] toByteArray(java.io.InputStream r1, int r2) throws java.io.IOException {
            if (r2 != 0) goto L5
            byte[] r1 = org.apache.commons.io.IOUtils.EMPTY_BYTE_ARRAY
            return r1
        L5:
            java.lang.String r0 = "input"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.io.InputStream r1 = (java.io.InputStream) r1
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda1
            r0.<init>(r1)
            byte[] r1 = toByteArray(r0, r2)
            return r1
    }

    public static byte[] toByteArray(java.io.InputStream r2, long r3) throws java.io.IOException {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto Ld
            int r3 = (int) r3
            byte[] r2 = toByteArray(r2, r3)
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size cannot be greater than Integer max value: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.Reader r1) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            byte[] r1 = toByteArray(r1, r0)
            return r1
    }

    public static byte[] toByteArray(java.io.Reader r0, java.lang.String r1) throws java.io.IOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            byte[] r0 = toByteArray(r0, r1)
            return r0
    }

    public static byte[] toByteArray(java.io.Reader r1, java.nio.charset.Charset r2) throws java.io.IOException {
            org.apache.commons.io.output.ByteArrayOutputStream r0 = new org.apache.commons.io.output.ByteArrayOutputStream
            r0.<init>()
            copy(r1, r0, r2)     // Catch: java.lang.Throwable -> L10
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.addSuppressed(r2)
        L19:
            throw r1
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    public static byte[] toByteArray(java.net.URI r0) throws java.io.IOException {
            java.net.URL r0 = r0.toURL()
            byte[] r0 = toByteArray(r0)
            return r0
    }

    public static byte[] toByteArray(java.net.URL r1) throws java.io.IOException {
            org.apache.commons.io.CloseableURLConnection r1 = org.apache.commons.io.CloseableURLConnection.open(r1)
            byte[] r0 = toByteArray(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.close()
        Ld:
            return r0
        Le:
            r0 = move-exception
            if (r1 == 0) goto L19
            r1.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r1 = move-exception
            r0.addSuppressed(r1)
        L19:
            throw r0
    }

    public static byte[] toByteArray(java.net.URLConnection r1) throws java.io.IOException {
            java.io.InputStream r1 = r1.getInputStream()
            byte[] r0 = toByteArray(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.close()
        Ld:
            return r0
        Le:
            r0 = move-exception
            if (r1 == 0) goto L19
            r1.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r1 = move-exception
            r0.addSuppressed(r1)
        L19:
            throw r0
    }

    static byte[] toByteArray(org.apache.commons.io.function.IOTriFunction<byte[], java.lang.Integer, java.lang.Integer, java.lang.Integer> r4, int r5) throws java.io.IOException {
            if (r5 < 0) goto L49
            if (r5 != 0) goto L7
            byte[] r4 = org.apache.commons.io.IOUtils.EMPTY_BYTE_ARRAY
            return r4
        L7:
            byte[] r0 = byteArray(r5)
            r1 = 0
        Lc:
            if (r1 >= r5) goto L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            int r3 = r5 - r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r4.apply(r0, r2, r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = -1
            if (r2 == r3) goto L27
            int r1 = r1 + r2
            goto Lc
        L27:
            if (r1 != r5) goto L2a
            return r0
        L2a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected read size, current: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", expected: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L49:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size must be equal or greater than zero: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @java.lang.Deprecated
    public static char[] toCharArray(java.io.InputStream r1) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            char[] r1 = toCharArray(r1, r0)
            return r1
    }

    public static char[] toCharArray(java.io.InputStream r0, java.lang.String r1) throws java.io.IOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            char[] r0 = toCharArray(r0, r1)
            return r0
    }

    public static char[] toCharArray(java.io.InputStream r1, java.nio.charset.Charset r2) throws java.io.IOException {
            java.io.CharArrayWriter r0 = new java.io.CharArrayWriter
            r0.<init>()
            copy(r1, r0, r2)
            char[] r1 = r0.toCharArray()
            return r1
    }

    public static char[] toCharArray(java.io.Reader r1) throws java.io.IOException {
            java.io.CharArrayWriter r0 = new java.io.CharArrayWriter
            r0.<init>()
            copy(r1, r0)
            char[] r1 = r0.toCharArray()
            return r1
    }

    @java.lang.Deprecated
    public static java.io.InputStream toInputStream(java.lang.CharSequence r1) {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.io.InputStream r1 = toInputStream(r1, r0)
            return r1
    }

    public static java.io.InputStream toInputStream(java.lang.CharSequence r0, java.lang.String r1) {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.io.InputStream r0 = toInputStream(r0, r1)
            return r0
    }

    public static java.io.InputStream toInputStream(java.lang.CharSequence r0, java.nio.charset.Charset r1) {
            java.lang.String r0 = r0.toString()
            java.io.InputStream r0 = toInputStream(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.io.InputStream toInputStream(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.io.InputStream r1 = toInputStream(r1, r0)
            return r1
    }

    public static java.io.InputStream toInputStream(java.lang.String r1, java.lang.String r2) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            byte[] r1 = r1.getBytes(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.io.InputStream toInputStream(java.lang.String r1, java.nio.charset.Charset r2) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            byte[] r1 = r1.getBytes(r2)
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String toString(java.io.InputStream r1) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(java.io.InputStream r0, java.lang.String r1) throws java.io.IOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.lang.String r0 = toString(r0, r1)
            return r0
    }

    public static java.lang.String toString(java.io.InputStream r1, java.nio.charset.Charset r2) throws java.io.IOException {
            org.apache.commons.io.output.StringBuilderWriter r0 = new org.apache.commons.io.output.StringBuilderWriter
            r0.<init>()
            copy(r1, r0, r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.addSuppressed(r2)
        L19:
            throw r1
    }

    public static java.lang.String toString(java.io.Reader r1) throws java.io.IOException {
            org.apache.commons.io.output.StringBuilderWriter r0 = new org.apache.commons.io.output.StringBuilderWriter
            r0.<init>()
            copy(r1, r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    @java.lang.Deprecated
    public static java.lang.String toString(java.net.URI r1) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(java.net.URI r0, java.lang.String r1) throws java.io.IOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.lang.String r0 = toString(r0, r1)
            return r0
    }

    public static java.lang.String toString(java.net.URI r0, java.nio.charset.Charset r1) throws java.io.IOException {
            java.net.URL r0 = r0.toURL()
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.lang.String r0 = toString(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String toString(java.net.URL r1) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(java.net.URL r0, java.lang.String r1) throws java.io.IOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.lang.String r0 = toString(r0, r1)
            return r0
    }

    public static java.lang.String toString(java.net.URL r1, java.nio.charset.Charset r2) throws java.io.IOException {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda2
            r0.<init>(r1)
            java.lang.String r1 = toString(r0, r2)
            return r1
    }

    public static java.lang.String toString(org.apache.commons.io.function.IOSupplier<java.io.InputStream> r1, java.nio.charset.Charset r2) throws java.io.IOException {
            org.apache.commons.io.IOUtils$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.IOUtils$$ExternalSyntheticLambda5
            r0.<init>()
            java.lang.String r1 = toString(r1, r2, r0)
            return r1
    }

    public static java.lang.String toString(org.apache.commons.io.function.IOSupplier<java.io.InputStream> r0, java.nio.charset.Charset r1, org.apache.commons.io.function.IOSupplier<java.lang.String> r2) throws java.io.IOException {
            if (r0 != 0) goto L9
            java.lang.Object r0 = r2.get()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L9:
            java.lang.Object r0 = r0.get()
            java.io.InputStream r0 = (java.io.InputStream) r0
            if (r0 == 0) goto L16
            java.lang.String r1 = toString(r0, r1)     // Catch: java.lang.Throwable -> L22
            goto L1c
        L16:
            java.lang.Object r1 = r2.get()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L22
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r1 = move-exception
            if (r0 == 0) goto L2d
            r0.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r1.addSuppressed(r0)
        L2d:
            throw r1
    }

    @java.lang.Deprecated
    public static java.lang.String toString(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String toString(byte[] r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static void write(java.lang.CharSequence r1, java.io.OutputStream r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            write(r1, r2, r0)
            return
    }

    public static void write(java.lang.CharSequence r0, java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.lang.CharSequence r0, java.io.OutputStream r1, java.nio.charset.Charset r2) throws java.io.IOException {
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            write(r0, r1, r2)
        L9:
            return
    }

    public static void write(java.lang.CharSequence r0, java.io.Writer r1) throws java.io.IOException {
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            write(r0, r1)
        L9:
            return
    }

    @java.lang.Deprecated
    public static void write(java.lang.String r1, java.io.OutputStream r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            write(r1, r2, r0)
            return
    }

    public static void write(java.lang.String r0, java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(java.lang.String r0, java.io.OutputStream r1, java.nio.charset.Charset r2) throws java.io.IOException {
            if (r0 == 0) goto L11
            java.nio.channels.WritableByteChannel r1 = java.nio.channels.Channels.newChannel(r1)
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            java.nio.ByteBuffer r0 = r2.encode(r0)
            r1.write(r0)
        L11:
            return
    }

    public static void write(java.lang.String r0, java.io.Writer r1) throws java.io.IOException {
            if (r0 == 0) goto L5
            r1.write(r0)
        L5:
            return
    }

    @java.lang.Deprecated
    public static void write(java.lang.StringBuffer r2, java.io.OutputStream r3) throws java.io.IOException {
            r0 = 0
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            write(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public static void write(java.lang.StringBuffer r0, java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            write(r0, r1, r2)
        Ld:
            return
    }

    @java.lang.Deprecated
    public static void write(java.lang.StringBuffer r0, java.io.Writer r1) throws java.io.IOException {
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            r1.write(r0)
        L9:
            return
    }

    public static void write(byte[] r0, java.io.OutputStream r1) throws java.io.IOException {
            if (r0 == 0) goto L5
            r1.write(r0)
        L5:
            return
    }

    @java.lang.Deprecated
    public static void write(byte[] r1, java.io.Writer r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            write(r1, r2, r0)
            return
    }

    public static void write(byte[] r0, java.io.Writer r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(byte[] r1, java.io.Writer r2, java.nio.charset.Charset r3) throws java.io.IOException {
            if (r1 == 0) goto Le
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            r0.<init>(r1, r3)
            r2.write(r0)
        Le:
            return
    }

    @java.lang.Deprecated
    public static void write(char[] r1, java.io.OutputStream r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            write(r1, r2, r0)
            return
    }

    public static void write(char[] r0, java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            write(r0, r1, r2)
            return
    }

    public static void write(char[] r1, java.io.OutputStream r2, java.nio.charset.Charset r3) throws java.io.IOException {
            if (r1 == 0) goto La
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            write(r0, r2, r3)
        La:
            return
    }

    public static void write(char[] r0, java.io.Writer r1) throws java.io.IOException {
            if (r0 == 0) goto L5
            r1.write(r0)
        L5:
            return
    }

    public static void writeChunked(byte[] r3, java.io.OutputStream r4) throws java.io.IOException {
            if (r3 == 0) goto L12
            int r0 = r3.length
            r1 = 0
        L4:
            if (r0 <= 0) goto L12
            r2 = 8192(0x2000, float:1.148E-41)
            int r2 = java.lang.Math.min(r0, r2)
            r4.write(r3, r1, r2)
            int r0 = r0 - r2
            int r1 = r1 + r2
            goto L4
        L12:
            return
    }

    public static void writeChunked(char[] r3, java.io.Writer r4) throws java.io.IOException {
            if (r3 == 0) goto L12
            int r0 = r3.length
            r1 = 0
        L4:
            if (r0 <= 0) goto L12
            r2 = 8192(0x2000, float:1.148E-41)
            int r2 = java.lang.Math.min(r0, r2)
            r4.write(r3, r1, r2)
            int r0 = r0 - r2
            int r1 = r1 + r2
            goto L4
        L12:
            return
    }

    @java.lang.Deprecated
    public static void writeLines(java.util.Collection<?> r1, java.lang.String r2, java.io.OutputStream r3) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            writeLines(r1, r2, r3, r0)
            return
    }

    public static void writeLines(java.util.Collection<?> r0, java.lang.String r1, java.io.OutputStream r2, java.lang.String r3) throws java.io.IOException {
            java.nio.charset.Charset r3 = org.apache.commons.io.Charsets.toCharset(r3)
            writeLines(r0, r1, r2, r3)
            return
    }

    public static void writeLines(java.util.Collection<?> r1, java.lang.String r2, java.io.OutputStream r3, java.nio.charset.Charset r4) throws java.io.IOException {
            if (r1 != 0) goto L3
            return
        L3:
            if (r2 != 0) goto L9
            java.lang.String r2 = java.lang.System.lineSeparator()
        L9:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L13
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16BE
        L13:
            byte[] r2 = r2.getBytes(r4)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.toString()
            write(r0, r3, r4)
        L2e:
            r3.write(r2)
            goto L1b
        L32:
            return
    }

    public static void writeLines(java.util.Collection<?> r1, java.lang.String r2, java.io.Writer r3) throws java.io.IOException {
            if (r1 != 0) goto L3
            return
        L3:
            if (r2 != 0) goto L9
            java.lang.String r2 = java.lang.System.lineSeparator()
        L9:
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.toString()
            r3.write(r0)
        L20:
            r3.write(r2)
            goto Ld
        L24:
            return
    }

    public static java.io.Writer writer(java.lang.Appendable r1) {
            java.lang.String r0 = "appendable"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof java.io.Writer
            if (r0 == 0) goto Lc
            java.io.Writer r1 = (java.io.Writer) r1
            return r1
        Lc:
            boolean r0 = r1 instanceof java.lang.StringBuilder
            if (r0 == 0) goto L18
            org.apache.commons.io.output.StringBuilderWriter r0 = new org.apache.commons.io.output.StringBuilderWriter
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r0.<init>(r1)
            return r0
        L18:
            org.apache.commons.io.output.AppendableWriter r0 = new org.apache.commons.io.output.AppendableWriter
            r0.<init>(r1)
            return r0
    }
}
