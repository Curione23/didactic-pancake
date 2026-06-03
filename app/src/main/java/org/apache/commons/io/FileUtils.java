package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtils {
    public static final java.io.File[] EMPTY_FILE_ARRAY = null;
    public static final long ONE_EB = 1152921504606846976L;
    public static final java.math.BigInteger ONE_EB_BI = null;
    public static final long ONE_GB = 1073741824;
    public static final java.math.BigInteger ONE_GB_BI = null;
    public static final long ONE_KB = 1024;
    public static final java.math.BigInteger ONE_KB_BI = null;
    public static final long ONE_MB = 1048576;
    public static final java.math.BigInteger ONE_MB_BI = null;
    public static final long ONE_PB = 1125899906842624L;
    public static final java.math.BigInteger ONE_PB_BI = null;
    public static final long ONE_TB = 1099511627776L;
    public static final java.math.BigInteger ONE_TB_BI = null;
    public static final java.math.BigInteger ONE_YB = null;
    public static final java.math.BigInteger ONE_ZB = null;

    public static /* synthetic */ java.io.InputStream $r8$lambda$GF8JHa7vXNEFej4auUeh7g5xcuU(java.net.URL r0) {
            java.io.InputStream r0 = r0.openStream()
            return r0
    }

    public static /* synthetic */ void $r8$lambda$mL8rmEOg9ly0y4hYEgTYRdwII88(java.lang.Exception r0, java.lang.Throwable r1) {
            r0.addSuppressed(r1)
            return
    }

    static {
            r0 = 1024(0x400, double:5.06E-321)
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            org.apache.commons.io.FileUtils.ONE_KB_BI = r2
            java.math.BigInteger r3 = r2.multiply(r2)
            org.apache.commons.io.FileUtils.ONE_MB_BI = r3
            java.math.BigInteger r3 = r2.multiply(r3)
            org.apache.commons.io.FileUtils.ONE_GB_BI = r3
            java.math.BigInteger r3 = r2.multiply(r3)
            org.apache.commons.io.FileUtils.ONE_TB_BI = r3
            java.math.BigInteger r3 = r2.multiply(r3)
            org.apache.commons.io.FileUtils.ONE_PB_BI = r3
            java.math.BigInteger r3 = r2.multiply(r3)
            org.apache.commons.io.FileUtils.ONE_EB_BI = r3
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r0 = r0.multiply(r1)
            org.apache.commons.io.FileUtils.ONE_ZB = r0
            java.math.BigInteger r0 = r2.multiply(r0)
            org.apache.commons.io.FileUtils.ONE_YB = r0
            r0 = 0
            java.io.File[] r0 = new java.io.File[r0]
            org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY = r0
            return
    }

    @java.lang.Deprecated
    public FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String byteCountToDisplaySize(long r0) {
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r0 = byteCountToDisplaySize(r0)
            return r0
    }

    public static java.lang.String byteCountToDisplaySize(java.lang.Number r2) {
            long r0 = r2.longValue()
            java.lang.String r2 = byteCountToDisplaySize(r0)
            return r2
    }

    public static java.lang.String byteCountToDisplaySize(java.math.BigInteger r3) {
            java.lang.String r0 = "size"
            java.util.Objects.requireNonNull(r3, r0)
            java.math.BigInteger r0 = org.apache.commons.io.FileUtils.ONE_EB_BI
            java.math.BigInteger r1 = r3.divide(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.math.BigInteger r3 = r3.divide(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r0 = " EB"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto Lff
        L2c:
            java.math.BigInteger r0 = org.apache.commons.io.FileUtils.ONE_PB_BI
            java.math.BigInteger r1 = r3.divide(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.math.BigInteger r3 = r3.divide(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r0 = " PB"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto Lff
        L53:
            java.math.BigInteger r0 = org.apache.commons.io.FileUtils.ONE_TB_BI
            java.math.BigInteger r1 = r3.divide(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.math.BigInteger r3 = r3.divide(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r0 = " TB"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto Lff
        L7a:
            java.math.BigInteger r0 = org.apache.commons.io.FileUtils.ONE_GB_BI
            java.math.BigInteger r1 = r3.divide(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto La0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.math.BigInteger r3 = r3.divide(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r0 = " GB"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto Lff
        La0:
            java.math.BigInteger r0 = org.apache.commons.io.FileUtils.ONE_MB_BI
            java.math.BigInteger r1 = r3.divide(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto Lc6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.math.BigInteger r3 = r3.divide(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r0 = " MB"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto Lff
        Lc6:
            java.math.BigInteger r0 = org.apache.commons.io.FileUtils.ONE_KB_BI
            java.math.BigInteger r1 = r3.divide(r0)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto Lec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.math.BigInteger r3 = r3.divide(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r0 = " KB"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto Lff
        Lec:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " bytes"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
        Lff:
            return r3
    }

    private static void checkFileExists(java.io.File r3, java.lang.String r4) throws java.io.FileNotFoundException {
            java.util.Objects.requireNonNull(r3, r4)
            boolean r0 = r3.isFile()
            if (r0 != 0) goto L54
            boolean r0 = r3.exists()
            if (r0 != 0) goto L35
            java.nio.file.Path r4 = r3.toPath()
            boolean r4 = java.nio.file.Files.isSymbolicLink(r4)
            if (r4 == 0) goto L1a
            goto L54
        L1a:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Source '"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "' does not exist"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parameter '"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "' is not a file: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L54:
            return
    }

    private static java.io.File checkIsFile(java.io.File r2, java.lang.String r3) {
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Parameter '%s' is not a file: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    public static java.util.zip.Checksum checksum(java.io.File r2, java.util.zip.Checksum r3) throws java.io.IOException {
            java.lang.String r0 = "file"
            checkFileExists(r2, r0)
            java.lang.String r0 = "checksum"
            java.util.Objects.requireNonNull(r3, r0)
            java.util.zip.CheckedInputStream r0 = new java.util.zip.CheckedInputStream
            java.nio.file.Path r2 = r2.toPath()
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r2, r1)
            r0.<init>(r2, r3)
            org.apache.commons.io.IOUtils.consume(r0)     // Catch: java.lang.Throwable -> L21
            r0.close()
            return r3
        L21:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r3 = move-exception
            r2.addSuppressed(r3)
        L2a:
            throw r2
    }

    public static long checksumCRC32(java.io.File r2) throws java.io.IOException {
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            java.util.zip.Checksum r2 = checksum(r2, r0)
            long r0 = r2.getValue()
            return r0
    }

    public static void cleanDirectory(java.io.File r2) throws java.io.IOException {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda15 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda15
            r0.<init>()
            r1 = 0
            java.io.File[] r2 = listFiles(r2, r1)
            org.apache.commons.io.function.IOConsumer.forAll(r0, r2)
            return
    }

    private static void cleanDirectoryOnExit(java.io.File r2) throws java.io.IOException {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda8 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda8
            r0.<init>()
            r1 = 0
            java.io.File[] r2 = listFiles(r2, r1)
            org.apache.commons.io.function.IOConsumer.forAll(r0, r2)
            return
    }

    public static boolean contentEquals(java.io.File r6, java.io.File r7) throws java.io.IOException {
            r0 = 1
            if (r6 != 0) goto L6
            if (r7 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r6 == 0) goto L4d
            if (r7 != 0) goto Lc
            goto L4d
        Lc:
            boolean r2 = r6.exists()
            boolean r3 = r7.exists()
            if (r2 == r3) goto L17
            return r1
        L17:
            if (r2 != 0) goto L1a
            return r0
        L1a:
            java.lang.String r2 = "file1"
            checkIsFile(r6, r2)
            java.lang.String r2 = "file2"
            checkIsFile(r7, r2)
            long r2 = r6.length()
            long r4 = r7.length()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L31
            return r1
        L31:
            java.io.File r1 = r6.getCanonicalFile()
            java.io.File r2 = r7.getCanonicalFile()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L40
            return r0
        L40:
            java.nio.file.Path r6 = r6.toPath()
            java.nio.file.Path r7 = r7.toPath()
            boolean r6 = org.apache.commons.io.file.PathUtils.fileContentEquals(r6, r7)
            return r6
        L4d:
            return r1
    }

    public static boolean contentEqualsIgnoreEOL(java.io.File r4, java.io.File r5, java.lang.String r6) throws java.io.IOException {
            r0 = 1
            if (r4 != 0) goto L6
            if (r5 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r4 == 0) goto L74
            if (r5 != 0) goto Lc
            goto L74
        Lc:
            boolean r2 = r4.exists()
            boolean r3 = r5.exists()
            if (r2 == r3) goto L17
            return r1
        L17:
            if (r2 != 0) goto L1a
            return r0
        L1a:
            java.lang.String r2 = "file1"
            checkFileExists(r4, r2)
            java.lang.String r2 = "file2"
            checkFileExists(r5, r2)
            java.io.File r2 = r4.getCanonicalFile()
            java.io.File r3 = r5.getCanonicalFile()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            return r0
        L33:
            java.nio.charset.Charset r6 = org.apache.commons.io.Charsets.toCharset(r6)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.file.Path r4 = r4.toPath()
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r4 = java.nio.file.Files.newInputStream(r4, r2)
            r0.<init>(r4, r6)
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6a
            java.nio.file.Path r5 = r5.toPath()     // Catch: java.lang.Throwable -> L6a
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.lang.Throwable -> L6a
            java.io.InputStream r5 = java.nio.file.Files.newInputStream(r5, r1)     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L6a
            boolean r5 = org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL(r0, r4)     // Catch: java.lang.Throwable -> L60
            r4.close()     // Catch: java.lang.Throwable -> L6a
            r0.close()
            return r5
        L60:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L6a
        L69:
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r5 = move-exception
            r4.addSuppressed(r5)
        L73:
            throw r4
        L74:
            return r1
    }

    public static java.io.File[] convertFileCollectionToFileArray(java.util.Collection<java.io.File> r1) {
            java.io.File[] r0 = org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY
            java.lang.Object[] r1 = r1.toArray(r0)
            java.io.File[] r1 = (java.io.File[]) r1
            return r1
    }

    public static void copyDirectory(java.io.File r1, java.io.File r2) throws java.io.IOException {
            r0 = 1
            copyDirectory(r1, r2, r0)
            return
    }

    public static void copyDirectory(java.io.File r1, java.io.File r2, java.io.FileFilter r3) throws java.io.IOException {
            r0 = 1
            copyDirectory(r1, r2, r3, r0)
            return
    }

    public static void copyDirectory(java.io.File r3, java.io.File r4, java.io.FileFilter r5, boolean r6) throws java.io.IOException {
            r0 = 2
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]
            r1 = 0
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r0[r1] = r2
            r1 = 1
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r0[r1] = r2
            copyDirectory(r3, r4, r5, r6, r0)
            return
    }

    public static void copyDirectory(java.io.File r8, java.io.File r9, java.io.FileFilter r10, boolean r11, java.nio.file.CopyOption... r12) throws java.io.IOException {
            java.lang.String r0 = "destination"
            java.util.Objects.requireNonNull(r9, r0)
            java.lang.String r0 = "srcDir"
            requireDirectoryExists(r8, r0)
            requireCanonicalPathsNotEquals(r8, r9)
            java.lang.String r0 = r8.getCanonicalPath()
            java.lang.String r1 = r9.getCanonicalPath()
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L41
            java.io.File[] r0 = listFiles(r8, r10)
            int r1 = r0.length
            if (r1 <= 0) goto L41
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L2a:
            if (r3 >= r2) goto L42
            r4 = r0[r3]
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r4.getName()
            r5.<init>(r9, r4)
            java.lang.String r4 = r5.getCanonicalPath()
            r1.add(r4)
            int r3 = r3 + 1
            goto L2a
        L41:
            r1 = 0
        L42:
            r5 = r1
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r7 = r12
            doCopyDirectory(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void copyDirectory(java.io.File r1, java.io.File r2, boolean r3) throws java.io.IOException {
            r0 = 0
            copyDirectory(r1, r2, r0, r3)
            return
    }

    public static void copyDirectoryToDirectory(java.io.File r2, java.io.File r3) throws java.io.IOException {
            java.lang.String r0 = "sourceDir"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "destinationDir"
            requireDirectoryIfExists(r3, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.getName()
            r0.<init>(r3, r1)
            r3 = 1
            copyDirectory(r2, r0, r3)
            return
    }

    public static long copyFile(java.io.File r2, java.io.OutputStream r3) throws java.io.IOException {
            java.nio.file.Path r2 = r2.toPath()
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r2, r0)
            long r0 = org.apache.commons.io.IOUtils.copyLarge(r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L14
            r2.close()
        L14:
            return r0
        L15:
            r3 = move-exception
            if (r2 == 0) goto L20
            r2.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r2 = move-exception
            r3.addSuppressed(r2)
        L20:
            throw r3
    }

    public static void copyFile(java.io.File r3, java.io.File r4) throws java.io.IOException {
            r0 = 1
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]
            r1 = 0
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r0[r1] = r2
            copyFile(r3, r4, r0)
            return
    }

    public static void copyFile(java.io.File r3, java.io.File r4, boolean r5) throws java.io.IOException {
            r0 = 1
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]
            r1 = 0
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r0[r1] = r2
            copyFile(r3, r4, r5, r0)
            return
    }

    public static void copyFile(java.io.File r2, java.io.File r3, boolean r4, java.nio.file.CopyOption... r5) throws java.io.IOException {
            java.lang.String r0 = "destination"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "srcFile"
            checkFileExists(r2, r0)
            requireCanonicalPathsNotEquals(r2, r3)
            createParentDirectories(r3)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L1b
            java.lang.String r0 = "destFile"
            checkFileExists(r3, r0)
        L1b:
            java.nio.file.Path r0 = r2.toPath()
            java.nio.file.Path r1 = r3.toPath()
            java.nio.file.Files.copy(r0, r1, r5)
            if (r4 == 0) goto L3d
            boolean r4 = java.nio.file.Files.isSymbolicLink(r0)
            if (r4 != 0) goto L3d
            boolean r2 = setTimes(r2, r3)
            if (r2 == 0) goto L35
            goto L3d
        L35:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot set the file time."
            r2.<init>(r3)
            throw r2
        L3d:
            return
    }

    public static void copyFile(java.io.File r1, java.io.File r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            r0 = 1
            copyFile(r1, r2, r0, r3)
            return
    }

    public static void copyFileToDirectory(java.io.File r1, java.io.File r2) throws java.io.IOException {
            r0 = 1
            copyFileToDirectory(r1, r2, r0)
            return
    }

    public static void copyFileToDirectory(java.io.File r2, java.io.File r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "sourceFile"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "destinationDir"
            requireDirectoryIfExists(r3, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.getName()
            r0.<init>(r3, r1)
            copyFile(r2, r0, r4)
            return
    }

    public static void copyInputStreamToFile(java.io.InputStream r0, java.io.File r1) throws java.io.IOException {
            copyToFile(r0, r1)     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L8
            r0.close()
        L8:
            return
        L9:
            r1 = move-exception
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.lang.Throwable -> L10
            goto L14
        L10:
            r0 = move-exception
            r1.addSuppressed(r0)
        L14:
            throw r1
    }

    public static void copyToDirectory(java.io.File r2, java.io.File r3) throws java.io.IOException {
            java.lang.String r0 = "sourceFile"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2.isFile()
            if (r0 == 0) goto Lf
            copyFileToDirectory(r2, r3)
            goto L18
        Lf:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L19
            copyDirectoryToDirectory(r2, r3)
        L18:
            return
        L19:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The source "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " does not exist"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static void copyToDirectory(java.lang.Iterable<java.io.File> r1, java.io.File r2) throws java.io.IOException {
            java.lang.String r0 = "sourceIterable"
            java.util.Objects.requireNonNull(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            copyFileToDirectory(r0, r2)
            goto L9
        L19:
            return
    }

    public static void copyToFile(java.io.InputStream r1, java.io.File r2) throws java.io.IOException {
            r0 = 0
            java.io.OutputStream r2 = newOutputStream(r2, r0)
            org.apache.commons.io.IOUtils.copy(r1, r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto Ld
            r2.close()
        Ld:
            return
        Le:
            r1 = move-exception
            if (r2 == 0) goto L19
            r2.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.addSuppressed(r2)
        L19:
            throw r1
    }

    public static void copyURLToFile(java.net.URL r3, java.io.File r4) throws java.io.IOException {
            java.nio.file.Path r4 = r4.toPath()
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r0]
            org.apache.commons.io.file.PathUtils.createParentDirectories(r4, r1)
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda7 r1 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda7
            r1.<init>(r3)
            r3 = 1
            java.nio.file.CopyOption[] r3 = new java.nio.file.CopyOption[r3]
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r3[r0] = r2
            org.apache.commons.io.file.PathUtils.copy(r1, r4, r3)
            return
    }

    public static void copyURLToFile(java.net.URL r0, java.io.File r1, int r2, int r3) throws java.io.IOException {
            org.apache.commons.io.CloseableURLConnection r0 = org.apache.commons.io.CloseableURLConnection.open(r0)
            r0.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L28
            r0.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L28
            java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L28
            copyInputStreamToFile(r2, r1)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L16
            r2.close()     // Catch: java.lang.Throwable -> L28
        L16:
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return
        L1c:
            r1 = move-exception
            if (r2 == 0) goto L27
            r2.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L28
        L27:
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r1 = move-exception
            if (r0 == 0) goto L33
            r0.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r0 = move-exception
            r1.addSuppressed(r0)
        L33:
            throw r1
    }

    public static java.io.File createParentDirectories(java.io.File r0) throws java.io.IOException {
            java.io.File r0 = getParentFile(r0)
            java.io.File r0 = mkdirs(r0)
            return r0
    }

    public static java.io.File current() {
            java.nio.file.Path r0 = org.apache.commons.io.file.PathUtils.current()
            java.io.File r0 = r0.toFile()
            return r0
    }

    static java.lang.String decodeUrl(java.lang.String r8) {
            if (r8 == 0) goto L9e
            r0 = 37
            int r1 = r8.indexOf(r0)
            if (r1 < 0) goto L9e
            int r1 = r8.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r1)
            r4 = 0
        L18:
            if (r4 >= r1) goto L9a
            char r5 = r8.charAt(r4)
            if (r5 != r0) goto L8e
        L20:
            int r5 = r4 + 1
            int r6 = r4 + 3
            java.lang.String r5 = r8.substring(r5, r6)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L75
            r7 = 16
            int r5 = java.lang.Integer.parseInt(r5, r7)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L75
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L75
            r3.put(r5)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L75
            if (r6 >= r1) goto L3f
            char r4 = r8.charAt(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Throwable -> L5a
            if (r4 == r0) goto L3b
            goto L3f
        L3b:
            r4 = r6
            goto L20
        L3d:
            r4 = r6
            goto L75
        L3f:
            int r4 = r3.position()
            if (r4 <= 0) goto L58
            r3.flip()
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r4 = r4.decode(r3)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            r3.clear()
        L58:
            r4 = r6
            goto L18
        L5a:
            r8 = move-exception
            int r0 = r3.position()
            if (r0 <= 0) goto L74
            r3.flip()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r0 = r0.decode(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            r3.clear()
        L74:
            throw r8
        L75:
            int r5 = r3.position()
            if (r5 <= 0) goto L8e
            r3.flip()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r5 = r5.decode(r3)
            java.lang.String r5 = r5.toString()
            r2.append(r5)
            r3.clear()
        L8e:
            int r5 = r4 + 1
            char r4 = r8.charAt(r4)
            r2.append(r4)
            r4 = r5
            goto L18
        L9a:
            java.lang.String r8 = r2.toString()
        L9e:
            return r8
    }

    public static java.io.File delete(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r0 = r1.toPath()
            java.nio.file.Files.delete(r0)
            return r1
    }

    public static void deleteDirectory(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "directory"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r0 = isSymlink(r1)
            if (r0 != 0) goto L15
            cleanDirectory(r1)
        L15:
            delete(r1)
            return
    }

    private static void deleteDirectoryOnExit(java.io.File r1) throws java.io.IOException {
            boolean r0 = r1.exists()
            if (r0 != 0) goto L7
            return
        L7:
            r1.deleteOnExit()
            boolean r0 = isSymlink(r1)
            if (r0 != 0) goto L13
            cleanDirectoryOnExit(r1)
        L13:
            return
    }

    public static boolean deleteQuietly(java.io.File r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.isDirectory()     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto Ld
            cleanDirectory(r2)     // Catch: java.lang.Exception -> Ld
        Ld:
            boolean r2 = r2.delete()     // Catch: java.lang.Exception -> L12
            return r2
        L12:
            return r0
    }

    public static boolean directoryContains(java.io.File r1, java.io.File r2) throws java.io.IOException {
            java.lang.String r0 = "directory"
            requireDirectoryExists(r1, r0)
            if (r2 == 0) goto L1b
            boolean r0 = r2.exists()
            if (r0 != 0) goto Le
            goto L1b
        Le:
            java.lang.String r1 = r1.getCanonicalPath()
            java.lang.String r2 = r2.getCanonicalPath()
            boolean r1 = org.apache.commons.io.FilenameUtils.directoryContains(r1, r2)
            return r1
        L1b:
            r1 = 0
            return r1
    }

    private static void doCopyDirectory(java.io.File r9, java.io.File r10, java.io.FileFilter r11, java.util.List<java.lang.String> r12, boolean r13, java.nio.file.CopyOption... r14) throws java.io.IOException {
            java.io.File[] r0 = listFiles(r9, r11)
            java.lang.String r1 = "destDir"
            requireDirectoryIfExists(r10, r1)
            mkdirs(r10)
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L3b
            r3 = r0[r2]
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getName()
            r4.<init>(r10, r5)
            if (r12 == 0) goto L27
            java.lang.String r5 = r3.getCanonicalPath()
            boolean r5 = r12.contains(r5)
            if (r5 != 0) goto L38
        L27:
            boolean r5 = r3.isDirectory()
            if (r5 == 0) goto L35
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            doCopyDirectory(r3, r4, r5, r6, r7, r8)
            goto L38
        L35:
            copyFile(r3, r4, r13, r14)
        L38:
            int r2 = r2 + 1
            goto Le
        L3b:
            if (r13 == 0) goto L40
            setTimes(r9, r10)
        L40:
            return
    }

    public static void forceDelete(java.io.File r5) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r5, r0)
            java.nio.file.Path r0 = r5.toPath()     // Catch: java.io.IOException -> L48
            java.nio.file.LinkOption[] r1 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY     // Catch: java.io.IOException -> L48
            r2 = 1
            org.apache.commons.io.file.DeleteOption[] r2 = new org.apache.commons.io.file.DeleteOption[r2]     // Catch: java.io.IOException -> L48
            org.apache.commons.io.file.StandardDeleteOption r3 = org.apache.commons.io.file.StandardDeleteOption.OVERRIDE_READ_ONLY     // Catch: java.io.IOException -> L48
            r4 = 0
            r2[r4] = r3     // Catch: java.io.IOException -> L48
            org.apache.commons.io.file.Counters$PathCounters r0 = org.apache.commons.io.file.PathUtils.delete(r0, r1, r2)     // Catch: java.io.IOException -> L48
            org.apache.commons.io.file.Counters$Counter r1 = r0.getFileCounter()
            long r1 = r1.get()
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L47
            org.apache.commons.io.file.Counters$Counter r0 = r0.getDirectoryCounter()
            long r0 = r0.get()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L32
            goto L47
        L32:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File does not exist: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L47:
            return
        L48:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot delete file: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    public static void forceDeleteOnExit(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto Lf
            deleteDirectoryOnExit(r1)
            goto L12
        Lf:
            r1.deleteOnExit()
        L12:
            return
    }

    public static void forceMkdir(java.io.File r0) throws java.io.IOException {
            mkdirs(r0)
            return
    }

    public static void forceMkdirParent(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.io.File r1 = (java.io.File) r1
            java.io.File r1 = getParentFile(r1)
            forceMkdir(r1)
            return
    }

    public static java.io.File getFile(java.io.File r4, java.lang.String... r5) {
            java.lang.String r0 = "directory"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "names"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L19
            r2 = r5[r1]
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r2)
            int r1 = r1 + 1
            r4 = r3
            goto Lc
        L19:
            return r4
    }

    public static java.io.File getFile(java.lang.String... r5) {
            java.lang.String r0 = "names"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1d
            r3 = r5[r2]
            if (r1 != 0) goto L14
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            goto L1a
        L14:
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r3)
            r1 = r4
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            return r1
    }

    private static java.io.File getParentFile(java.io.File r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.io.File r0 = r0.getParentFile()
        L8:
            return r0
    }

    public static java.io.File getTempDirectory() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getTempDirectoryPath()
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String getTempDirectoryPath() {
            java.lang.String r0 = "java.io.tmpdir"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }

    public static java.io.File getUserDirectory() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getUserDirectoryPath()
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String getUserDirectoryPath() {
            java.lang.String r0 = "user.home"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }

    public static boolean isDirectory(java.io.File r0, java.nio.file.LinkOption... r1) {
            if (r0 == 0) goto Le
            java.nio.file.Path r0 = r0.toPath()
            boolean r0 = java.nio.file.Files.isDirectory(r0, r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isEmptyDirectory(java.io.File r0) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            boolean r0 = org.apache.commons.io.file.PathUtils.isEmptyDirectory(r0)
            return r0
    }

    public static boolean isFileNewer(java.io.File r1, long r2) {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda21 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda21
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.io.File r2) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda24 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda24
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.nio.file.attribute.FileTime r2) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = org.apache.commons.io.file.PathUtils.isNewer(r1, r2, r0)
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.Instant r2) {
            java.lang.String r0 = "instant"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda13 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda13
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.OffsetDateTime r2) {
            java.lang.String r0 = "offsetDateTime"
            java.util.Objects.requireNonNull(r2, r0)
            java.time.Instant r2 = r2.toInstant()
            boolean r1 = isFileNewer(r1, r2)
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.chrono.ChronoLocalDate r2) {
            java.time.LocalTime r0 = java.time.LocalTime.MAX
            boolean r1 = isFileNewer(r1, r2, r0)
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.chrono.ChronoLocalDate r2, java.time.LocalTime r3) {
            java.lang.String r0 = "chronoLocalDate"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "localTime"
            java.util.Objects.requireNonNull(r3, r0)
            java.time.chrono.ChronoLocalDateTime r2 = r2.atTime(r3)
            boolean r1 = isFileNewer(r1, r2)
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.chrono.ChronoLocalDate r2, java.time.OffsetTime r3) {
            java.lang.String r0 = "chronoLocalDate"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "offsetTime"
            java.util.Objects.requireNonNull(r3, r0)
            java.time.LocalTime r3 = r3.toLocalTime()
            java.time.chrono.ChronoLocalDateTime r2 = r2.atTime(r3)
            boolean r1 = isFileNewer(r1, r2)
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.chrono.ChronoLocalDateTime<?> r2) {
            java.time.ZoneId r0 = java.time.ZoneId.systemDefault()
            boolean r1 = isFileNewer(r1, r2, r0)
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.chrono.ChronoLocalDateTime<?> r2, java.time.ZoneId r3) {
            java.lang.String r0 = "chronoLocalDateTime"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "zoneId"
            java.util.Objects.requireNonNull(r3, r0)
            java.time.chrono.ChronoZonedDateTime r2 = r2.atZone(r3)
            boolean r1 = isFileNewer(r1, r2)
            return r1
    }

    public static boolean isFileNewer(java.io.File r1, java.time.chrono.ChronoZonedDateTime<?> r2) {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "chronoZonedDateTime"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda10 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda10
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isFileNewer(java.io.File r2, java.util.Date r3) {
            java.lang.String r0 = "date"
            java.util.Objects.requireNonNull(r3, r0)
            long r0 = r3.getTime()
            boolean r2 = isFileNewer(r2, r0)
            return r2
    }

    public static boolean isFileOlder(java.io.File r1, long r2) {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda14 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda14
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.io.File r2) throws java.io.FileNotFoundException {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda9 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda9
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.nio.file.attribute.FileTime r2) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = org.apache.commons.io.file.PathUtils.isOlder(r1, r2, r0)
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.Instant r2) {
            java.lang.String r0 = "instant"
            java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda6
            r0.<init>(r1, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.OffsetDateTime r2) {
            java.lang.String r0 = "offsetDateTime"
            java.util.Objects.requireNonNull(r2, r0)
            java.time.Instant r2 = r2.toInstant()
            boolean r1 = isFileOlder(r1, r2)
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.chrono.ChronoLocalDate r2) {
            java.time.LocalTime r0 = java.time.LocalTime.MAX
            boolean r1 = isFileOlder(r1, r2, r0)
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.chrono.ChronoLocalDate r2, java.time.LocalTime r3) {
            java.lang.String r0 = "chronoLocalDate"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "localTime"
            java.util.Objects.requireNonNull(r3, r0)
            java.time.chrono.ChronoLocalDateTime r2 = r2.atTime(r3)
            boolean r1 = isFileOlder(r1, r2)
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.chrono.ChronoLocalDate r2, java.time.OffsetTime r3) {
            java.lang.String r0 = "chronoLocalDate"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "offsetTime"
            java.util.Objects.requireNonNull(r3, r0)
            java.time.LocalTime r3 = r3.toLocalTime()
            java.time.chrono.ChronoLocalDateTime r2 = r2.atTime(r3)
            boolean r1 = isFileOlder(r1, r2)
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.chrono.ChronoLocalDateTime<?> r2) {
            java.time.ZoneId r0 = java.time.ZoneId.systemDefault()
            boolean r1 = isFileOlder(r1, r2, r0)
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.chrono.ChronoLocalDateTime<?> r2, java.time.ZoneId r3) {
            java.lang.String r0 = "chronoLocalDateTime"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "zoneId"
            java.util.Objects.requireNonNull(r3, r0)
            java.time.chrono.ChronoZonedDateTime r2 = r2.atZone(r3)
            boolean r1 = isFileOlder(r1, r2)
            return r1
    }

    public static boolean isFileOlder(java.io.File r1, java.time.chrono.ChronoZonedDateTime<?> r2) {
            java.lang.String r0 = "chronoZonedDateTime"
            java.util.Objects.requireNonNull(r2, r0)
            java.time.Instant r2 = r2.toInstant()
            boolean r1 = isFileOlder(r1, r2)
            return r1
    }

    public static boolean isFileOlder(java.io.File r2, java.util.Date r3) {
            java.lang.String r0 = "date"
            java.util.Objects.requireNonNull(r3, r0)
            long r0 = r3.getTime()
            boolean r2 = isFileOlder(r2, r0)
            return r2
    }

    public static boolean isRegularFile(java.io.File r0, java.nio.file.LinkOption... r1) {
            if (r0 == 0) goto Le
            java.nio.file.Path r0 = r0.toPath()
            boolean r0 = java.nio.file.Files.isRegularFile(r0, r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isSymlink(java.io.File r0) {
            if (r0 == 0) goto Le
            java.nio.file.Path r0 = r0.toPath()
            boolean r0 = java.nio.file.Files.isSymbolicLink(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static java.util.Iterator<java.io.File> iterateFiles(java.io.File r0, org.apache.commons.io.filefilter.IOFileFilter r1, org.apache.commons.io.filefilter.IOFileFilter r2) {
            java.util.Collection r0 = listFiles(r0, r1, r2)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public static java.util.Iterator<java.io.File> iterateFiles(java.io.File r1, java.lang.String[] r2, boolean r3) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda20 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda20
            r0.<init>(r1, r3, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            org.apache.commons.io.StreamIterator r1 = org.apache.commons.io.StreamIterator.iterator(r1)
            return r1
    }

    public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File r0, org.apache.commons.io.filefilter.IOFileFilter r1, org.apache.commons.io.filefilter.IOFileFilter r2) {
            java.util.Collection r0 = listFilesAndDirs(r0, r1, r2)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    static /* synthetic */ java.lang.Boolean lambda$isFileNewer$0(java.io.File r1, java.time.chrono.ChronoZonedDateTime r2) throws java.io.IOException {
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = org.apache.commons.io.file.PathUtils.isNewer(r1, r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    static /* synthetic */ java.lang.Boolean lambda$isFileNewer$1(java.io.File r0, java.io.File r1) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            java.nio.file.Path r1 = r1.toPath()
            boolean r0 = org.apache.commons.io.file.PathUtils.isNewer(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Boolean lambda$isFileNewer$2(java.io.File r1, java.time.Instant r2) throws java.io.IOException {
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = org.apache.commons.io.file.PathUtils.isNewer(r1, r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    static /* synthetic */ java.lang.Boolean lambda$isFileNewer$3(java.io.File r1, long r2) throws java.io.IOException {
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = org.apache.commons.io.file.PathUtils.isNewer(r1, r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    static /* synthetic */ java.lang.Boolean lambda$isFileOlder$4(java.io.File r0, java.io.File r1) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            java.nio.file.Path r1 = r1.toPath()
            boolean r0 = org.apache.commons.io.file.PathUtils.isOlder(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Boolean lambda$isFileOlder$5(java.io.File r1, java.time.Instant r2) throws java.io.IOException {
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = org.apache.commons.io.file.PathUtils.isOlder(r1, r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    static /* synthetic */ java.lang.Boolean lambda$isFileOlder$6(java.io.File r1, long r2) throws java.io.IOException {
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r1 = org.apache.commons.io.file.PathUtils.isOlder(r1, r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    static /* synthetic */ java.util.stream.Stream lambda$iterateFiles$7(java.io.File r0, boolean r1, java.lang.String[] r2) throws java.io.IOException {
            java.util.stream.Stream r0 = streamFiles(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.nio.file.FileVisitResult lambda$listAccumulate$8(java.nio.file.Path r0, java.io.IOException r1) throws java.io.IOException {
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.CONTINUE
            return r0
    }

    static /* synthetic */ java.util.stream.Stream lambda$listFiles$10(java.io.File r0, boolean r1, java.lang.String[] r2) throws java.io.IOException {
            java.util.stream.Stream r0 = streamFiles(r0, r1, r2)
            return r0
    }

    static /* synthetic */ org.apache.commons.io.file.AccumulatorPathVisitor lambda$listFiles$9(org.apache.commons.io.filefilter.IOFileFilter r3, org.apache.commons.io.filefilter.IOFileFilter r4, java.io.File r5) throws java.io.IOException {
            org.apache.commons.io.filefilter.IOFileFilter r0 = org.apache.commons.io.filefilter.FileFileFilter.INSTANCE
            org.apache.commons.io.filefilter.IOFileFilter r3 = r0.and(r3)
            r0 = 1
            java.nio.file.FileVisitOption[] r0 = new java.nio.file.FileVisitOption[r0]
            r1 = 0
            java.nio.file.FileVisitOption r2 = java.nio.file.FileVisitOption.FOLLOW_LINKS
            r0[r1] = r2
            org.apache.commons.io.file.AccumulatorPathVisitor r3 = listAccumulate(r5, r3, r4, r0)
            return r3
    }

    static /* synthetic */ org.apache.commons.io.file.AccumulatorPathVisitor lambda$listFilesAndDirs$11(org.apache.commons.io.filefilter.IOFileFilter r3, org.apache.commons.io.filefilter.IOFileFilter r4, java.io.File r5) throws java.io.IOException {
            r0 = 1
            java.nio.file.FileVisitOption[] r0 = new java.nio.file.FileVisitOption[r0]
            r1 = 0
            java.nio.file.FileVisitOption r2 = java.nio.file.FileVisitOption.FOLLOW_LINKS
            r0[r1] = r2
            org.apache.commons.io.file.AccumulatorPathVisitor r3 = listAccumulate(r5, r3, r4, r0)
            return r3
    }

    static /* synthetic */ java.io.InputStream lambda$readFileToString$12(java.io.File r1) throws java.io.IOException {
            java.nio.file.Path r1 = r1.toPath()
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r1, r0)
            return r1
    }

    static /* synthetic */ java.lang.Long lambda$sizeOf$13(java.io.File r2) throws java.io.IOException {
            java.nio.file.Path r2 = r2.toPath()
            long r0 = org.apache.commons.io.file.PathUtils.sizeOf(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    static /* synthetic */ java.math.BigInteger lambda$sizeOfAsBigInteger$14(java.io.File r0) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            java.math.BigInteger r0 = org.apache.commons.io.file.PathUtils.sizeOfAsBigInteger(r0)
            return r0
    }

    static /* synthetic */ java.lang.Long lambda$sizeOfDirectory$15(java.io.File r2) throws java.io.IOException {
            java.nio.file.Path r2 = r2.toPath()
            long r0 = org.apache.commons.io.file.PathUtils.sizeOfDirectory(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    static /* synthetic */ java.math.BigInteger lambda$sizeOfDirectoryAsBigInteger$16(java.io.File r0) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            java.math.BigInteger r0 = org.apache.commons.io.file.PathUtils.sizeOfDirectoryAsBigInteger(r0)
            return r0
    }

    static /* synthetic */ java.lang.String lambda$toSuffixes$17(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "."
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    static /* synthetic */ java.lang.String[] lambda$toSuffixes$18(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    public static long lastModified(java.io.File r2) throws java.io.IOException {
            java.nio.file.attribute.FileTime r2 = lastModifiedFileTime(r2)
            long r0 = r2.toMillis()
            return r0
    }

    public static java.nio.file.attribute.FileTime lastModifiedFileTime(java.io.File r1) throws java.io.IOException {
            java.nio.file.Path r1 = r1.toPath()
            java.lang.String r0 = "file"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.attribute.FileTime r1 = java.nio.file.Files.getLastModifiedTime(r1, r0)
            return r1
    }

    public static long lastModifiedUnchecked(java.io.File r2) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda3
            r0.<init>()
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
    }

    public static org.apache.commons.io.LineIterator lineIterator(java.io.File r1) throws java.io.IOException {
            r0 = 0
            org.apache.commons.io.LineIterator r1 = lineIterator(r1, r0)
            return r1
    }

    public static org.apache.commons.io.LineIterator lineIterator(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            r0 = 0
            java.nio.file.Path r2 = r2.toPath()     // Catch: java.lang.RuntimeException -> L11 java.io.IOException -> L13
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.lang.RuntimeException -> L11 java.io.IOException -> L13
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r2, r1)     // Catch: java.lang.RuntimeException -> L11 java.io.IOException -> L13
            org.apache.commons.io.LineIterator r2 = org.apache.commons.io.IOUtils.lineIterator(r0, r3)     // Catch: java.lang.RuntimeException -> L11 java.io.IOException -> L13
            return r2
        L11:
            r2 = move-exception
            goto L14
        L13:
            r2 = move-exception
        L14:
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda16 r3 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda16
            r3.<init>(r2)
            org.apache.commons.io.IOUtils.closeQuietly(r0, r3)
            throw r2
    }

    private static org.apache.commons.io.file.AccumulatorPathVisitor listAccumulate(java.io.File r4, org.apache.commons.io.filefilter.IOFileFilter r5, org.apache.commons.io.filefilter.IOFileFilter r6, java.nio.file.FileVisitOption... r7) throws java.io.IOException {
            if (r6 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            org.apache.commons.io.filefilter.FileEqualsFileFilter r1 = new org.apache.commons.io.filefilter.FileEqualsFileFilter
            r1.<init>(r4)
            if (r0 == 0) goto L10
            org.apache.commons.io.filefilter.IOFileFilter r1 = r1.or(r6)
        L10:
            org.apache.commons.io.file.AccumulatorPathVisitor r6 = new org.apache.commons.io.file.AccumulatorPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r2 = org.apache.commons.io.file.Counters.noopPathCounters()
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda2 r3 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda2
            r3.<init>()
            r6.<init>(r2, r5, r1, r3)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            if (r7 == 0) goto L28
            java.util.Collections.addAll(r5, r7)
        L28:
            java.nio.file.Path r4 = r4.toPath()
            int r7 = toMaxDepth(r0)
            java.nio.file.Files.walkFileTree(r4, r5, r7, r6)
            return r6
    }

    public static java.util.Collection<java.io.File> listFiles(java.io.File r1, org.apache.commons.io.filefilter.IOFileFilter r2, org.apache.commons.io.filefilter.IOFileFilter r3) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda18 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda18
            r0.<init>(r2, r3)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            org.apache.commons.io.file.AccumulatorPathVisitor r1 = (org.apache.commons.io.file.AccumulatorPathVisitor) r1
            java.util.List r1 = r1.getFileList()
            java.util.stream.Stream r1 = r1.stream()
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19 r2 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19
            r2.<init>()
            java.util.stream.Stream r1 = r1.map(r2)
            java.util.List r1 = toList(r1)
            return r1
    }

    public static java.util.Collection<java.io.File> listFiles(java.io.File r1, java.lang.String[] r2, boolean r3) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda0
            r0.<init>(r1, r3, r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            java.util.List r2 = toList(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L14
            r1.close()
        L14:
            return r2
        L15:
            r2 = move-exception
            if (r1 == 0) goto L20
            r1.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r1 = move-exception
            r2.addSuppressed(r1)
        L20:
            throw r2
    }

    private static java.io.File[] listFiles(java.io.File r2, java.io.FileFilter r3) throws java.io.IOException {
            java.lang.String r0 = "directory"
            requireDirectoryExists(r2, r0)
            if (r3 != 0) goto Lc
            java.io.File[] r3 = r2.listFiles()
            goto L10
        Lc:
            java.io.File[] r3 = r2.listFiles(r3)
        L10:
            if (r3 == 0) goto L13
            return r3
        L13:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown I/O error listing contents of directory: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File r1, org.apache.commons.io.filefilter.IOFileFilter r2, org.apache.commons.io.filefilter.IOFileFilter r3) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda23 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda23
            r0.<init>(r2, r3)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            org.apache.commons.io.file.AccumulatorPathVisitor r1 = (org.apache.commons.io.file.AccumulatorPathVisitor) r1
            java.util.List r2 = r1.getFileList()
            java.util.List r1 = r1.getDirList()
            r2.addAll(r1)
            java.util.stream.Stream r1 = r2.stream()
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19 r2 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19
            r2.<init>()
            java.util.stream.Stream r1 = r1.map(r2)
            java.util.List r1 = toList(r1)
            return r1
    }

    private static java.io.File mkdirs(java.io.File r3) throws java.io.IOException {
            if (r3 == 0) goto L2a
            boolean r0 = r3.mkdirs()
            if (r0 != 0) goto L2a
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto Lf
            goto L2a
        Lf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create directory '"
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "'."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2a:
            return r3
    }

    public static void moveDirectory(java.io.File r3, java.io.File r4) throws java.io.IOException {
            java.lang.String r0 = "destination"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "srcDir"
            requireDirectoryExists(r3, r0)
            java.lang.String r0 = "destDir"
            requireAbsent(r4, r0)
            boolean r0 = r3.renameTo(r4)
            if (r0 != 0) goto L87
            java.lang.String r0 = r4.getCanonicalPath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getCanonicalPath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L68
            copyDirectory(r3, r4)
            deleteDirectory(r3)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L43
            goto L87
        L43:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to delete original directory '"
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "' after copy to '"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "'"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L68:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot move directory: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " to a subdirectory of itself: "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L87:
            return
    }

    public static void moveDirectoryToDirectory(java.io.File r1, java.io.File r2, boolean r3) throws java.io.IOException {
            validateMoveParameters(r1, r2)
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L4b
            boolean r0 = r2.exists()
            if (r0 != 0) goto L30
            if (r3 == 0) goto L15
            mkdirs(r2)
            goto L4b
        L15:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Destination directory '"
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "' does not exist [createDestDir=false]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L30:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Destination '"
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "' is not a directory"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L4b:
            java.io.File r3 = new java.io.File
            java.lang.String r0 = r1.getName()
            r3.<init>(r2, r0)
            moveDirectory(r1, r3)
            return
    }

    public static void moveFile(java.io.File r3, java.io.File r4) throws java.io.IOException {
            r0 = 1
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]
            r1 = 0
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.COPY_ATTRIBUTES
            r0[r1] = r2
            moveFile(r3, r4, r0)
            return
    }

    public static void moveFile(java.io.File r2, java.io.File r3, java.nio.file.CopyOption... r4) throws java.io.IOException {
            java.lang.String r0 = "destination"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "srcFile"
            checkFileExists(r2, r0)
            java.lang.String r0 = "destFile"
            requireAbsent(r3, r0)
            boolean r0 = r2.renameTo(r3)
            if (r0 != 0) goto L48
            r0 = 0
            copyFile(r2, r3, r0, r4)
            boolean r4 = r2.delete()
            if (r4 == 0) goto L20
            goto L48
        L20:
            deleteQuietly(r3)
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to delete original file '"
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "' after copy to '"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2)
            throw r4
        L48:
            return
    }

    public static void moveFileToDirectory(java.io.File r1, java.io.File r2, boolean r3) throws java.io.IOException {
            validateMoveParameters(r1, r2)
            boolean r0 = r2.exists()
            if (r0 != 0) goto Le
            if (r3 == 0) goto Le
            mkdirs(r2)
        Le:
            java.lang.String r3 = "destDir"
            requireDirectoryExists(r2, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = r1.getName()
            r3.<init>(r2, r0)
            moveFile(r1, r3)
            return
    }

    public static void moveToDirectory(java.io.File r1, java.io.File r2, boolean r3) throws java.io.IOException {
            validateMoveParameters(r1, r2)
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto Ld
            moveDirectoryToDirectory(r1, r2, r3)
            goto L10
        Ld:
            moveFileToDirectory(r1, r2, r3)
        L10:
            return
    }

    public static java.io.OutputStream newOutputStream(java.io.File r1, boolean r2) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.io.File r1 = (java.io.File) r1
            java.nio.file.Path r1 = r1.toPath()
            java.io.OutputStream r1 = org.apache.commons.io.file.PathUtils.newOutputStream(r1, r2)
            return r1
    }

    public static java.io.FileInputStream openInputStream(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            return r0
    }

    public static java.io.FileOutputStream openOutputStream(java.io.File r1) throws java.io.IOException {
            r0 = 0
            java.io.FileOutputStream r1 = openOutputStream(r1, r0)
            return r1
    }

    public static java.io.FileOutputStream openOutputStream(java.io.File r2, boolean r3) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r1 = r2.exists()
            if (r1 == 0) goto Lf
            checkIsFile(r2, r0)
            goto L12
        Lf:
            createParentDirectories(r2)
        L12:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2, r3)
            return r0
    }

    public static byte[] readFileToByteArray(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r1, r0)
            java.nio.file.Path r1 = r1.toPath()
            byte[] r1 = java.nio.file.Files.readAllBytes(r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String readFileToString(java.io.File r1) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = readFileToString(r1, r0)
            return r1
    }

    public static java.lang.String readFileToString(java.io.File r0, java.lang.String r1) throws java.io.IOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.lang.String r0 = readFileToString(r0, r1)
            return r0
    }

    public static java.lang.String readFileToString(java.io.File r1, java.nio.charset.Charset r2) throws java.io.IOException {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda11 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda11
            r0.<init>(r1)
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r2)
            java.lang.String r1 = org.apache.commons.io.IOUtils.toString(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static java.util.List<java.lang.String> readLines(java.io.File r1) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.util.List r1 = readLines(r1, r0)
            return r1
    }

    public static java.util.List<java.lang.String> readLines(java.io.File r0, java.lang.String r1) throws java.io.IOException {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.util.List r0 = readLines(r0, r1)
            return r0
    }

    public static java.util.List<java.lang.String> readLines(java.io.File r0, java.nio.charset.Charset r1) throws java.io.IOException {
            java.nio.file.Path r0 = r0.toPath()
            java.util.List r0 = java.nio.file.Files.readAllLines(r0, r1)
            return r0
    }

    private static void requireAbsent(java.io.File r2, java.lang.String r3) throws org.apache.commons.io.FileExistsException {
            boolean r0 = r2.exists()
            if (r0 != 0) goto L7
            return
        L7:
            org.apache.commons.io.FileExistsException r0 = new org.apache.commons.io.FileExistsException
            java.lang.String r1 = "File element in parameter '%s' already exists: '%s'"
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    private static void requireCanonicalPathsNotEquals(java.io.File r3, java.io.File r4) throws java.io.IOException {
            java.lang.String r0 = r3.getCanonicalPath()
            java.lang.String r1 = r4.getCanonicalPath()
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lf
            return
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "File canonical paths are equal: '%s' (file1='%s', file2='%s')"
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r4}
            java.lang.String r3 = java.lang.String.format(r2, r3)
            r1.<init>(r3)
            throw r1
    }

    private static void requireDirectoryExists(java.io.File r3, java.lang.String r4) throws java.io.FileNotFoundException {
            java.util.Objects.requireNonNull(r3, r4)
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L4f
            boolean r0 = r3.exists()
            if (r0 == 0) goto L34
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parameter '"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "' is not a directory: '"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = "'"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L34:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Directory '"
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "' does not exist."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L4f:
            return
    }

    private static void requireDirectoryIfExists(java.io.File r3, java.lang.String r4) throws java.io.FileNotFoundException {
            java.util.Objects.requireNonNull(r3, r4)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L35
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L10
            goto L35
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parameter '"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "' is not a directory: '"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = "'"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L35:
            return
    }

    private static boolean setTimes(java.io.File r4, java.io.File r5) {
            java.lang.String r0 = "sourceFile"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "targetFile"
            java.util.Objects.requireNonNull(r5, r0)
            java.nio.file.Path r0 = r4.toPath()     // Catch: java.io.IOException -> L36
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r1 = java.nio.file.attribute.BasicFileAttributes.class
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.io.IOException -> L36
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r0, r1, r3)     // Catch: java.io.IOException -> L36
            java.nio.file.Path r1 = r5.toPath()     // Catch: java.io.IOException -> L36
            java.lang.Class<java.nio.file.attribute.BasicFileAttributeView> r3 = java.nio.file.attribute.BasicFileAttributeView.class
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]     // Catch: java.io.IOException -> L36
            java.nio.file.attribute.FileAttributeView r1 = java.nio.file.Files.getFileAttributeView(r1, r3, r2)     // Catch: java.io.IOException -> L36
            java.nio.file.attribute.BasicFileAttributeView r1 = (java.nio.file.attribute.BasicFileAttributeView) r1     // Catch: java.io.IOException -> L36
            java.nio.file.attribute.FileTime r2 = r0.lastModifiedTime()     // Catch: java.io.IOException -> L36
            java.nio.file.attribute.FileTime r3 = r0.lastAccessTime()     // Catch: java.io.IOException -> L36
            java.nio.file.attribute.FileTime r0 = r0.creationTime()     // Catch: java.io.IOException -> L36
            r1.setTimes(r2, r3, r0)     // Catch: java.io.IOException -> L36
            r4 = 1
            return r4
        L36:
            long r0 = r4.lastModified()
            boolean r4 = r5.setLastModified(r0)
            return r4
    }

    public static long sizeOf(java.io.File r2) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda17 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda17
            r0.<init>(r2)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
    }

    public static java.math.BigInteger sizeOfAsBigInteger(java.io.File r1) {
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda12 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda12
            r0.<init>(r1)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            return r1
    }

    public static long sizeOfDirectory(java.io.File r2) {
            java.lang.String r0 = "directory"
            requireDirectoryExists(r2, r0)     // Catch: java.io.FileNotFoundException -> L15
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda1
            r0.<init>(r2)
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.get(r0)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
        L15:
            r2 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r2)
            throw r0
    }

    public static java.math.BigInteger sizeOfDirectoryAsBigInteger(java.io.File r1) {
            java.lang.String r0 = "directory"
            requireDirectoryExists(r1, r0)     // Catch: java.io.FileNotFoundException -> L11
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda22 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda22
            r0.<init>(r1)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.get(r0)
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            return r1
        L11:
            r1 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r1)
            throw r0
    }

    public static java.util.stream.Stream<java.io.File> streamFiles(java.io.File r3, boolean r4, java.lang.String... r5) throws java.io.IOException {
            if (r5 != 0) goto L5
            org.apache.commons.io.filefilter.IOFileFilter r5 = org.apache.commons.io.filefilter.FileFileFilter.INSTANCE
            goto L14
        L5:
            org.apache.commons.io.filefilter.IOFileFilter r0 = org.apache.commons.io.filefilter.FileFileFilter.INSTANCE
            org.apache.commons.io.filefilter.SuffixFileFilter r1 = new org.apache.commons.io.filefilter.SuffixFileFilter
            java.lang.String[] r5 = toSuffixes(r5)
            r1.<init>(r5)
            org.apache.commons.io.filefilter.IOFileFilter r5 = r0.and(r1)
        L14:
            java.nio.file.Path r3 = r3.toPath()
            int r4 = toMaxDepth(r4)
            r0 = 1
            java.nio.file.FileVisitOption[] r0 = new java.nio.file.FileVisitOption[r0]
            java.nio.file.FileVisitOption r1 = java.nio.file.FileVisitOption.FOLLOW_LINKS
            r2 = 0
            r0[r2] = r1
            java.util.stream.Stream r3 = org.apache.commons.io.file.PathUtils.walk(r3, r5, r4, r2, r0)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19 r4 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19
            r4.<init>()
            java.util.stream.Stream r3 = r3.map(r4)
            return r3
    }

    public static java.io.File toFile(java.net.URL r2) {
            if (r2 == 0) goto L25
            java.lang.String r0 = "file"
            java.lang.String r1 = r2.getProtocol()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lf
            goto L25
        Lf:
            java.lang.String r2 = r2.getFile()
            r0 = 47
            char r1 = java.io.File.separatorChar
            java.lang.String r2 = r2.replace(r0, r1)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = decodeUrl(r2)
            r0.<init>(r2)
            return r0
        L25:
            r2 = 0
            return r2
    }

    public static java.io.File[] toFiles(java.net.URL... r5) {
            int r0 = org.apache.commons.io.IOUtils.length(r5)
            if (r0 != 0) goto L9
            java.io.File[] r5 = org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY
            return r5
        L9:
            int r0 = r5.length
            java.io.File[] r0 = new java.io.File[r0]
            r1 = 0
        Ld:
            int r2 = r5.length
            if (r1 >= r2) goto L3f
            r2 = r5[r1]
            if (r2 == 0) goto L3c
            java.lang.String r3 = "file"
            java.lang.String r4 = r2.getProtocol()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L27
            java.io.File r2 = toFile(r2)
            r0[r1] = r2
            goto L3c
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can only convert file URL to a File: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3c:
            int r1 = r1 + 1
            goto Ld
        L3f:
            return r0
    }

    private static java.util.List<java.io.File> toList(java.util.stream.Stream<java.io.File> r1) {
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    private static int toMaxDepth(boolean r0) {
            if (r0 == 0) goto L6
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L7
        L6:
            r0 = 1
        L7:
            return r0
    }

    private static java.lang.String[] toSuffixes(java.lang.String... r1) {
            java.lang.String r0 = "extensions"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda4
            r0.<init>()
            java.util.stream.Stream r1 = r1.map(r0)
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda5
            r0.<init>()
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    public static java.net.URL[] toURLs(java.io.File... r4) throws java.io.IOException {
            java.lang.String r0 = "files"
            java.util.Objects.requireNonNull(r4, r0)
            int r0 = r4.length
            java.net.URL[] r1 = new java.net.URL[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L1a
            r3 = r4[r2]
            java.net.URI r3 = r3.toURI()
            java.net.URL r3 = r3.toURL()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L1a:
            return r1
    }

    public static void touch(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "file"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.io.File r1 = (java.io.File) r1
            java.nio.file.Path r1 = r1.toPath()
            org.apache.commons.io.file.PathUtils.touch(r1)
            return
    }

    private static void validateMoveParameters(java.io.File r2, java.io.File r3) throws java.io.FileNotFoundException {
            java.lang.String r0 = "source"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "destination"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L11
            return
        L11:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Source '"
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "' does not exist"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static boolean waitFor(java.io.File r2, int r3) {
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.Path r2 = r2.toPath()
            long r0 = (long) r3
            java.time.Duration r3 = java.time.Duration.ofSeconds(r0)
            java.nio.file.LinkOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_LINK_OPTION_ARRAY
            boolean r2 = org.apache.commons.io.file.PathUtils.waitFor(r2, r3, r0)
            return r2
    }

    @java.lang.Deprecated
    public static void write(java.io.File r2, java.lang.CharSequence r3) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1 = 0
            write(r2, r3, r0, r1)
            return
    }

    public static void write(java.io.File r1, java.lang.CharSequence r2, java.lang.String r3) throws java.io.IOException {
            r0 = 0
            write(r1, r2, r3, r0)
            return
    }

    public static void write(java.io.File r0, java.lang.CharSequence r1, java.lang.String r2, boolean r3) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            write(r0, r1, r2, r3)
            return
    }

    public static void write(java.io.File r1, java.lang.CharSequence r2, java.nio.charset.Charset r3) throws java.io.IOException {
            r0 = 0
            write(r1, r2, r3, r0)
            return
    }

    public static void write(java.io.File r1, java.lang.CharSequence r2, java.nio.charset.Charset r3, boolean r4) throws java.io.IOException {
            r0 = 0
            java.lang.String r2 = java.util.Objects.toString(r2, r0)
            writeStringToFile(r1, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public static void write(java.io.File r1, java.lang.CharSequence r2, boolean r3) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            write(r1, r2, r0, r3)
            return
    }

    public static void writeByteArrayToFile(java.io.File r1, byte[] r2) throws java.io.IOException {
            r0 = 0
            writeByteArrayToFile(r1, r2, r0)
            return
    }

    public static void writeByteArrayToFile(java.io.File r1, byte[] r2, int r3, int r4) throws java.io.IOException {
            r0 = 0
            writeByteArrayToFile(r1, r2, r3, r4, r0)
            return
    }

    public static void writeByteArrayToFile(java.io.File r0, byte[] r1, int r2, int r3, boolean r4) throws java.io.IOException {
            java.io.OutputStream r0 = newOutputStream(r0, r4)
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.close()
        Lc:
            return
        Ld:
            r1 = move-exception
            if (r0 == 0) goto L18
            r0.close()     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            r1.addSuppressed(r0)
        L18:
            throw r1
    }

    public static void writeByteArrayToFile(java.io.File r2, byte[] r3, boolean r4) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            writeByteArrayToFile(r2, r3, r0, r1, r4)
            return
    }

    public static void writeLines(java.io.File r2, java.lang.String r3, java.util.Collection<?> r4) throws java.io.IOException {
            r0 = 0
            r1 = 0
            writeLines(r2, r3, r4, r0, r1)
            return
    }

    public static void writeLines(java.io.File r1, java.lang.String r2, java.util.Collection<?> r3, java.lang.String r4) throws java.io.IOException {
            r0 = 0
            writeLines(r1, r2, r3, r4, r0)
            return
    }

    public static void writeLines(java.io.File r1, java.lang.String r2, java.util.Collection<?> r3, java.lang.String r4, boolean r5) throws java.io.IOException {
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.OutputStream r1 = newOutputStream(r1, r5)
            r0.<init>(r1)
            org.apache.commons.io.IOUtils.writeLines(r3, r4, r0, r2)     // Catch: java.lang.Throwable -> L10
            r0.close()
            return
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

    public static void writeLines(java.io.File r1, java.lang.String r2, java.util.Collection<?> r3, boolean r4) throws java.io.IOException {
            r0 = 0
            writeLines(r1, r2, r3, r0, r4)
            return
    }

    public static void writeLines(java.io.File r2, java.util.Collection<?> r3) throws java.io.IOException {
            r0 = 0
            r1 = 0
            writeLines(r2, r0, r3, r0, r1)
            return
    }

    public static void writeLines(java.io.File r2, java.util.Collection<?> r3, java.lang.String r4) throws java.io.IOException {
            r0 = 0
            r1 = 0
            writeLines(r2, r0, r3, r4, r1)
            return
    }

    public static void writeLines(java.io.File r1, java.util.Collection<?> r2, java.lang.String r3, boolean r4) throws java.io.IOException {
            r0 = 0
            writeLines(r1, r0, r2, r3, r4)
            return
    }

    public static void writeLines(java.io.File r1, java.util.Collection<?> r2, boolean r3) throws java.io.IOException {
            r0 = 0
            writeLines(r1, r0, r2, r0, r3)
            return
    }

    @java.lang.Deprecated
    public static void writeStringToFile(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r1 = 0
            writeStringToFile(r2, r3, r0, r1)
            return
    }

    public static void writeStringToFile(java.io.File r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r0 = 0
            writeStringToFile(r1, r2, r3, r0)
            return
    }

    public static void writeStringToFile(java.io.File r0, java.lang.String r1, java.lang.String r2, boolean r3) throws java.io.IOException {
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            writeStringToFile(r0, r1, r2, r3)
            return
    }

    public static void writeStringToFile(java.io.File r1, java.lang.String r2, java.nio.charset.Charset r3) throws java.io.IOException {
            r0 = 0
            writeStringToFile(r1, r2, r3, r0)
            return
    }

    public static void writeStringToFile(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, boolean r3) throws java.io.IOException {
            java.io.OutputStream r0 = newOutputStream(r0, r3)
            org.apache.commons.io.IOUtils.write(r1, r0, r2)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lc
            r0.close()
        Lc:
            return
        Ld:
            r1 = move-exception
            if (r0 == 0) goto L18
            r0.close()     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            r1.addSuppressed(r0)
        L18:
            throw r1
    }

    @java.lang.Deprecated
    public static void writeStringToFile(java.io.File r1, java.lang.String r2, boolean r3) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            writeStringToFile(r1, r2, r0, r3)
            return
    }
}
