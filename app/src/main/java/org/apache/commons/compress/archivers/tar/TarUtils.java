package org.apache.commons.compress.archivers.tar;

/* JADX INFO: loaded from: classes2.dex */
public class TarUtils {
    private static final int BYTE_MASK = 255;
    static final org.apache.commons.compress.archivers.zip.ZipEncoding DEFAULT_ENCODING = null;
    static final org.apache.commons.compress.archivers.zip.ZipEncoding FALLBACK_ENCODING = null;


    static {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r0)
            org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING = r0
            org.apache.commons.compress.archivers.tar.TarUtils$1 r0 = new org.apache.commons.compress.archivers.tar.TarUtils$1
            r0.<init>()
            org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING = r0
            return
    }

    private TarUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long computeCheckSum(byte[] r6) {
            int r0 = r6.length
            r1 = 0
            r3 = 0
        L4:
            if (r3 >= r0) goto Lf
            r4 = r6[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L4
        Lf:
            return r1
    }

    private static java.lang.String exceptionMessage(byte[] r2, int r3, int r4, int r5, byte r6) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r2 = "\u0000"
            java.lang.String r1 = "{NUL}"
            java.lang.String r2 = r0.replace(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid byte "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " at offset "
            java.lang.StringBuilder r6 = r6.append(r0)
            int r5 = r5 - r3
            java.lang.StringBuilder r3 = r6.append(r5)
            java.lang.String r5 = " in '"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "' len="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static void formatBigIntegerBinary(long r3, byte[] r5, int r6, int r7, boolean r8) {
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r3)
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            int r2 = r7 + (-1)
            if (r1 > r2) goto L20
            int r7 = r7 + r6
            int r7 = r7 - r1
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r5, r7, r1)
            if (r8 == 0) goto L17
            r3 = 255(0xff, float:3.57E-43)
        L17:
            byte r3 = (byte) r3
        L18:
            int r6 = r6 + 1
            if (r6 >= r7) goto L1f
            r5[r6] = r3
            goto L18
        L1f:
            return
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Value "
            r6.<init>(r8)
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r4 = " is too large for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = " byte field."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static int formatCheckSumOctalBytes(long r1, byte[] r3, int r4, int r5) {
            int r0 = r5 + (-2)
            formatUnsignedOctalString(r1, r3, r4, r0)
            int r1 = r5 + (-1)
            int r0 = r0 + r4
            r2 = 0
            r3[r0] = r2
            int r1 = r1 + r4
            r2 = 32
            r3[r1] = r2
            int r4 = r4 + r5
            return r4
    }

    private static void formatLongBinary(long r10, byte[] r12, int r13, int r14, boolean r15) {
            int r0 = r14 + (-1)
            r1 = 8
            int r0 = r0 * r1
            r2 = 1
            long r4 = r2 << r0
            long r6 = java.lang.Math.abs(r10)
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L30
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L30
            if (r15 == 0) goto L22
            long r4 = r4 - r2
            long r10 = r6 ^ r4
            long r10 = r10 + r2
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 << r0
            long r6 = r10 | r2
        L22:
            int r14 = r14 + r13
            int r14 = r14 + (-1)
        L25:
            if (r14 < r13) goto L2f
            int r10 = (int) r6
            byte r10 = (byte) r10
            r12[r14] = r10
            long r6 = r6 >> r1
            int r14 = r14 + (-1)
            goto L25
        L2f:
            return
        L30:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "Value "
            r13.<init>(r15)
            java.lang.StringBuilder r10 = r13.append(r10)
            java.lang.String r11 = " is too large for "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r14)
            java.lang.String r11 = " byte field."
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            r12.<init>(r10)
            throw r12
    }

    public static int formatLongOctalBytes(long r1, byte[] r3, int r4, int r5) {
            int r0 = r5 + (-1)
            formatUnsignedOctalString(r1, r3, r4, r0)
            int r0 = r0 + r4
            r1 = 32
            r3[r0] = r1
            int r4 = r4 + r5
            return r4
    }

    public static int formatLongOctalOrBinaryBytes(long r9, byte[] r11, int r12, int r13) {
            r0 = 8
            if (r13 != r0) goto L8
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            goto Ld
        L8:
            r0 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
        Ld:
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 != 0) goto L21
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L21
            int r9 = formatLongOctalBytes(r9, r11, r12, r13)
            return r9
        L21:
            r0 = 9
            if (r13 >= r0) goto L2e
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r2
            formatLongBinary(r3, r5, r6, r7, r8)
            goto L36
        L2e:
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r2
            formatBigIntegerBinary(r3, r5, r6, r7, r8)
        L36:
            if (r2 == 0) goto L3b
            r9 = 255(0xff, float:3.57E-43)
            goto L3d
        L3b:
            r9 = 128(0x80, float:1.8E-43)
        L3d:
            byte r9 = (byte) r9
            r11[r12] = r9
            int r12 = r12 + r13
            return r12
    }

    public static int formatNameBytes(java.lang.String r1, byte[] r2, int r3, int r4) {
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch: java.io.IOException -> L7
            int r1 = formatNameBytes(r1, r2, r3, r4, r0)     // Catch: java.io.IOException -> L7
            return r1
        L7:
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING     // Catch: java.io.IOException -> Le
            int r1 = formatNameBytes(r1, r2, r3, r4, r0)     // Catch: java.io.IOException -> Le
            return r1
        Le:
            r1 = move-exception
            java.io.UncheckedIOException r2 = new java.io.UncheckedIOException
            r2.<init>(r1)
            throw r2
    }

    public static int formatNameBytes(java.lang.String r4, byte[] r5, int r6, int r7, org.apache.commons.compress.archivers.zip.ZipEncoding r8) throws java.io.IOException {
            int r0 = r4.length()
            java.nio.ByteBuffer r1 = r8.encode(r4)
        L8:
            int r2 = r1.limit()
            r3 = 0
            if (r2 <= r7) goto L1c
            if (r0 <= 0) goto L1c
            int r0 = r0 + (-1)
            java.lang.String r1 = r4.substring(r3, r0)
            java.nio.ByteBuffer r1 = r8.encode(r1)
            goto L8
        L1c:
            int r4 = r1.limit()
            int r8 = r1.position()
            int r4 = r4 - r8
            byte[] r8 = r1.array()
            int r0 = r1.arrayOffset()
            java.lang.System.arraycopy(r8, r0, r5, r6, r4)
        L30:
            if (r4 >= r7) goto L39
            int r8 = r6 + r4
            r5[r8] = r3
            int r4 = r4 + 1
            goto L30
        L39:
            int r6 = r6 + r7
            return r6
    }

    public static int formatOctalBytes(long r1, byte[] r3, int r4, int r5) {
            int r0 = r5 + (-2)
            formatUnsignedOctalString(r1, r3, r4, r0)
            int r1 = r5 + (-1)
            int r0 = r0 + r4
            r2 = 32
            r3[r0] = r2
            int r1 = r1 + r4
            r2 = 0
            r3[r1] = r2
            int r4 = r4 + r5
            return r4
    }

    public static void formatUnsignedOctalString(long r9, byte[] r11, int r12, int r13) {
            int r0 = r13 + (-1)
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r4 = 48
            if (r3 != 0) goto L10
            int r13 = r13 + (-2)
            int r0 = r0 + r12
            r11[r0] = r4
            goto L2c
        L10:
            r5 = r9
        L11:
            if (r0 < 0) goto L27
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L27
            int r3 = r12 + r0
            r7 = 7
            long r7 = r7 & r5
            int r7 = (int) r7
            byte r7 = (byte) r7
            int r7 = r7 + r4
            byte r7 = (byte) r7
            r11[r3] = r7
            r3 = 3
            long r5 = r5 >>> r3
            int r0 = r0 + (-1)
            goto L11
        L27:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L36
            r13 = r0
        L2c:
            if (r13 < 0) goto L35
            int r9 = r12 + r13
            r11[r9] = r4
            int r13 = r13 + (-1)
            goto L2c
        L35:
            return
        L36:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r9)
            java.lang.String r0 = "="
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r9 = java.lang.Long.toOctalString(r9)
            java.lang.StringBuilder r9 = r12.append(r9)
            java.lang.String r10 = " will not fit in octal number buffer of length "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r13)
            java.lang.String r9 = r9.toString()
            r11.<init>(r9)
            throw r11
    }

    private static long parseBinaryBigInteger(byte[] r4, int r5, int r6, boolean r7) {
            int r0 = r6 + (-1)
            byte[] r1 = new byte[r0]
            int r2 = r5 + 1
            r3 = 0
            java.lang.System.arraycopy(r4, r2, r1, r3, r0)
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r1)
            if (r7 == 0) goto L1f
            r0 = -1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r4 = r4.add(r0)
            java.math.BigInteger r4 = r4.not()
        L1f:
            int r0 = r4.bitLength()
            r1 = 63
            if (r0 > r1) goto L2f
            long r4 = r4.longValue()
            if (r7 == 0) goto L2e
            long r4 = -r4
        L2e:
            return r4
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "At offset "
            r7.<init>(r0)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = ", "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " byte binary number exceeds maximum signed long value"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private static long parseBinaryLong(byte[] r7, int r8, int r9, boolean r10) {
            r0 = 9
            if (r9 >= r0) goto L2f
            r0 = 1
            r1 = 0
            r3 = r0
        L8:
            if (r3 >= r9) goto L18
            r4 = 8
            long r1 = r1 << r4
            int r4 = r8 + r3
            r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L8
        L18:
            if (r10 == 0) goto L2b
            r7 = 1
            long r1 = r1 - r7
            int r9 = r9 - r0
            double r3 = (double) r9
            r5 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r3 = r3 * r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r5, r3)
            long r3 = (long) r3
            long r3 = r3 - r7
            long r1 = r1 ^ r3
        L2b:
            if (r10 == 0) goto L2e
            long r1 = -r1
        L2e:
            return r1
        L2f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "At offset "
            r10.<init>(r0)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r10 = ", "
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " byte binary number exceeds maximum signed long value"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static boolean parseBoolean(byte[] r0, int r1) {
            r0 = r0[r1]
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    protected static java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> parseFromPAX01SparseHeaders(java.lang.String r8) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ","
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            int r1 = r1 % 2
            r2 = 1
            if (r1 == r2) goto L4d
            r1 = 0
        L12:
            int r2 = r8.length
            if (r1 >= r2) goto L48
            r2 = r8[r1]
            long r2 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r2)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L40
            int r6 = r1 + 1
            r6 = r8[r6]
            long r6 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r6)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L38
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r4 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse
            r4.<init>(r2, r6)
            r0.add(r4)
            int r1 = r1 + 2
            goto L12
        L38:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Corrupted TAR archive. Sparse struct numbytes contains negative value"
            r8.<init>(r0)
            throw r8
        L40:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Corrupted TAR archive. Sparse struct offset contains negative value"
            r8.<init>(r0)
            throw r8
        L48:
            java.util.List r8 = java.util.Collections.unmodifiableList(r0)
            return r8
        L4d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header"
            r8.<init>(r0)
            throw r8
    }

    public static java.lang.String parseName(byte[] r1, int r2, int r3) {
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING     // Catch: java.io.IOException -> L7
            java.lang.String r1 = parseName(r1, r2, r3, r0)     // Catch: java.io.IOException -> L7
            return r1
        L7:
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING     // Catch: java.io.IOException -> Le
            java.lang.String r1 = parseName(r1, r2, r3, r0)     // Catch: java.io.IOException -> Le
            return r1
        Le:
            r1 = move-exception
            java.io.UncheckedIOException r2 = new java.io.UncheckedIOException
            r2.<init>(r1)
            throw r2
    }

    public static java.lang.String parseName(byte[] r4, int r5, int r6, org.apache.commons.compress.archivers.zip.ZipEncoding r7) throws java.io.IOException {
            r0 = 0
            r2 = r5
            r1 = r0
        L3:
            if (r1 >= r6) goto Le
            r3 = r4[r2]
            if (r3 == 0) goto Le
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L3
        Le:
            if (r1 <= 0) goto L1a
            byte[] r6 = new byte[r1]
            java.lang.System.arraycopy(r4, r5, r6, r0, r1)
            java.lang.String r4 = r7.decode(r6)
            return r4
        L1a:
            java.lang.String r4 = ""
            return r4
    }

    public static long parseOctal(byte[] r7, int r8, int r9) {
            int r0 = r8 + r9
            r1 = 2
            if (r9 < r1) goto L4d
            r1 = r7[r8]
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            r1 = r8
        Ld:
            r4 = 32
            if (r1 >= r0) goto L19
            r5 = r7[r1]
            if (r5 == r4) goto L16
            goto L19
        L16:
            int r1 = r1 + 1
            goto Ld
        L19:
            int r5 = r0 + (-1)
            r5 = r7[r5]
        L1d:
            if (r1 >= r0) goto L2d
            if (r5 == 0) goto L23
            if (r5 != r4) goto L2d
        L23:
            int r5 = r0 + (-1)
            int r0 = r0 + (-2)
            r0 = r7[r0]
            r6 = r5
            r5 = r0
            r0 = r6
            goto L1d
        L2d:
            if (r1 >= r0) goto L4c
            r4 = r7[r1]
            r5 = 48
            if (r4 < r5) goto L42
            r5 = 55
            if (r4 > r5) goto L42
            r5 = 3
            long r2 = r2 << r5
            int r4 = r4 + (-48)
            long r4 = (long) r4
            long r2 = r2 + r4
            int r1 = r1 + 1
            goto L2d
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r7 = exceptionMessage(r7, r8, r9, r1, r4)
            r0.<init>(r7)
            throw r0
        L4c:
            return r2
        L4d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Length "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " must be at least 2"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static long parseOctalOrBinary(byte[] r2, int r3, int r4) {
            r0 = r2[r3]
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 != 0) goto Lb
            long r2 = parseOctal(r2, r3, r4)
            return r2
        Lb:
            r1 = -1
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r1 = 9
            if (r4 >= r1) goto L1a
            long r2 = parseBinaryLong(r2, r3, r4, r0)
            return r2
        L1a:
            long r2 = parseBinaryBigInteger(r2, r3, r4, r0)
            return r2
    }

    @java.lang.Deprecated
    protected static java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> parsePAX01SparseHeaders(java.lang.String r2) {
            java.util.List r2 = parseFromPAX01SparseHeaders(r2)     // Catch: java.io.IOException -> L5
            return r2
        L5:
            r2 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1, r2)
            throw r0
    }

    protected static java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> parsePAX1XSparseHeaders(java.io.InputStream r16, int r17) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            long[] r1 = readLineOfNumberForPax1X(r16)
            r2 = 0
            r3 = r1[r2]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L5c
            r7 = 1
            r8 = r1[r7]
        L15:
            r10 = 1
            long r10 = r3 - r10
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L51
            long[] r1 = readLineOfNumberForPax1X(r16)
            r3 = r1[r2]
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 < 0) goto L49
            r12 = r1[r7]
            long r8 = r8 + r12
            long[] r1 = readLineOfNumberForPax1X(r16)
            r12 = r1[r2]
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 < 0) goto L41
            r14 = r1[r7]
            long r8 = r8 + r14
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r1 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse
            r1.<init>(r3, r12)
            r0.add(r1)
            r3 = r10
            goto L15
        L41:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted TAR archive. Sparse header block numbytes contains negative value"
            r0.<init>(r1)
            throw r0
        L49:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted TAR archive. Sparse header block offset contains negative value"
            r0.<init>(r1)
            throw r0
        L51:
            r1 = r17
            long r1 = (long) r1
            long r8 = r8 % r1
            long r1 = r1 - r8
            r3 = r16
            org.apache.commons.io.IOUtils.skip(r3, r1)
            return r0
        L5c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted TAR archive. Negative value in sparse headers block"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    protected static java.util.Map<java.lang.String, java.lang.String> parsePaxHeaders(java.io.InputStream r2, java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r3, java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.IOException {
            r0 = -1
            java.util.Map r2 = parsePaxHeaders(r2, r3, r4, r0)
            return r2
    }

    protected static java.util.Map<java.lang.String, java.lang.String> parsePaxHeaders(java.io.InputStream r16, java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r17, java.util.Map<java.lang.String, java.lang.String> r18, long r19) throws java.io.IOException {
            r0 = r17
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r18
            r1.<init>(r2)
            r3 = 0
            r4 = r3
            r5 = 0
        Lc:
            r6 = r3
            r7 = r6
        Le:
            int r8 = r16.read()
            r9 = -1
            r10 = 0
            if (r8 == r9) goto L150
            r12 = 1
            int r6 = r6 + r12
            int r4 = r4 + 1
            r13 = 10
            if (r8 != r13) goto L24
            r2 = r9
            r9 = r16
            goto L153
        L24:
            r14 = 32
            if (r8 != r14) goto L136
            org.apache.commons.io.output.ByteArrayOutputStream r8 = new org.apache.commons.io.output.ByteArrayOutputStream
            r8.<init>()
        L2d:
            int r14 = r16.read()
            if (r14 == r9) goto L132
            int r6 = r6 + r12
            int r4 = r4 + 1
            if (r4 < 0) goto L132
            int r15 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r15 < 0) goto L43
            long r9 = (long) r4
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 < 0) goto L43
            goto L132
        L43:
            r9 = 61
            if (r14 != r9) goto L126
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = r8.toString(r9)
            int r7 = r7 - r6
            if (r7 > r12) goto L55
            r1.remove(r8)
            goto L132
        L55:
            if (r15 < 0) goto L7b
            long r9 = (long) r7
            long r11 = (long) r4
            long r11 = r19 - r11
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L60
            goto L7b
        L60:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Paxheader value size "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " exceeds size of header record"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L7b:
            r9 = r16
            byte[] r6 = org.apache.commons.compress.utils.IOUtils.readRange(r9, r7)
            int r10 = r6.length
            if (r10 != r7) goto L107
            int r4 = r4 + r7
            int r7 = r7 + (-1)
            r10 = r6[r7]
            if (r10 != r13) goto Lff
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8
            r10.<init>(r6, r3, r7, r11)
            r1.put(r8, r10)
            java.lang.String r6 = "GNU.sparse.offset"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto Lcd
            if (r5 == 0) goto Lae
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r6 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse
            long r11 = r5.longValue()
            r2 = 0
            r6.<init>(r11, r2)
            r0.add(r6)
            goto Lb0
        Lae:
            r2 = 0
        Lb0:
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch: java.lang.NumberFormatException -> Lc5
            long r6 = r5.longValue()
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 < 0) goto Lbd
            goto Lcd
        Lbd:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to read Paxheader.GNU.sparse.offset contains negative value"
            r0.<init>(r1)
            throw r0
        Lc5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value"
            r0.<init>(r1)
            throw r0
        Lcd:
            java.lang.String r2 = "GNU.sparse.numbytes"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L134
            if (r5 == 0) goto Lf7
            long r2 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r10)
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto Lef
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r6 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse
            long r7 = r5.longValue()
            r6.<init>(r7, r2)
            r0.add(r6)
            r5 = 0
            goto L134
        Lef:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to read Paxheader.GNU.sparse.numbytes contains negative value"
            r0.<init>(r1)
            throw r0
        Lf7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up."
            r0.<init>(r1)
            throw r0
        Lff:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to read Paxheader.Value should end with a newline"
            r0.<init>(r1)
            throw r0
        L107:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read Paxheader. Expected "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " bytes, read "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L126:
            r9 = r16
            byte r2 = (byte) r14
            r8.write(r2)
            r3 = 0
            r9 = -1
            r10 = 0
            goto L2d
        L132:
            r9 = r16
        L134:
            r8 = r14
            goto L152
        L136:
            r9 = r16
            r2 = 48
            if (r8 < r2) goto L148
            r2 = 57
            if (r8 > r2) goto L148
            int r7 = r7 * 10
            int r8 = r8 + (-48)
            int r7 = r7 + r8
            r3 = 0
            goto Le
        L148:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to read Paxheader. Encountered a non-number while reading length"
            r0.<init>(r1)
            throw r0
        L150:
            r9 = r16
        L152:
            r2 = -1
        L153:
            if (r8 != r2) goto L166
            if (r5 == 0) goto L165
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse
            long r3 = r5.longValue()
            r5 = 0
            r2.<init>(r3, r5)
            r0.add(r2)
        L165:
            return r1
        L166:
            r3 = 0
            goto Lc
    }

    public static org.apache.commons.compress.archivers.tar.TarArchiveStructSparse parseSparse(byte[] r3, int r4) {
            r0 = 12
            long r1 = parseOctalOrBinary(r3, r4, r0)
            int r4 = r4 + r0
            long r3 = parseOctalOrBinary(r3, r4, r0)
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r0 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse
            r0.<init>(r1, r3)
            return r0
    }

    private static long[] readLineOfNumberForPax1X(java.io.InputStream r8) throws java.io.IOException {
            r0 = 0
            r2 = r0
        L3:
            int r4 = r8.read()
            r5 = 10
            r6 = 1
            if (r4 == r5) goto L31
            long r0 = r0 + r6
            r5 = -1
            if (r4 == r5) goto L29
            r5 = 48
            if (r4 < r5) goto L21
            r5 = 57
            if (r4 > r5) goto L21
            r5 = 10
            long r2 = r2 * r5
            int r4 = r4 + (-48)
            long r4 = (long) r4
            long r2 = r2 + r4
            goto L3
        L21:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Corrupted TAR archive. Non-numeric value in sparse headers block"
            r8.<init>(r0)
            throw r8
        L29:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unexpected EOF when reading parse information of 1.X PAX format"
            r8.<init>(r0)
            throw r8
        L31:
            long r0 = r0 + r6
            r8 = 2
            long[] r8 = new long[r8]
            r4 = 0
            r8[r4] = r2
            r2 = 1
            r8[r2] = r0
            return r8
    }

    static java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> readSparseStructs(byte[] r7, int r8, int r9) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r9) goto L40
            int r2 = r1 * 24
            int r2 = r2 + r8
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r2 = parseSparse(r7, r2)     // Catch: java.lang.IllegalArgumentException -> L37
            long r3 = r2.getOffset()     // Catch: java.lang.IllegalArgumentException -> L37
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L2f
            long r3 = r2.getNumbytes()     // Catch: java.lang.IllegalArgumentException -> L37
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L27
            r0.add(r2)     // Catch: java.lang.IllegalArgumentException -> L37
            int r1 = r1 + 1
            goto L6
        L27:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.IllegalArgumentException -> L37
            java.lang.String r8 = "Corrupted TAR archive, sparse entry with negative numbytes"
            r7.<init>(r8)     // Catch: java.lang.IllegalArgumentException -> L37
            throw r7     // Catch: java.lang.IllegalArgumentException -> L37
        L2f:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.IllegalArgumentException -> L37
            java.lang.String r8 = "Corrupted TAR archive, sparse entry with negative offset"
            r7.<init>(r8)     // Catch: java.lang.IllegalArgumentException -> L37
            throw r7     // Catch: java.lang.IllegalArgumentException -> L37
        L37:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Corrupted TAR archive, sparse entry is invalid"
            r8.<init>(r9, r7)
            throw r8
        L40:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            return r7
    }

    public static boolean verifyCheckSum(byte[] r12) {
            r0 = 8
            r1 = 148(0x94, float:2.07E-43)
            long r2 = parseOctal(r12, r1, r0)
            r4 = 0
            r0 = 0
            r8 = r0
            r6 = r4
        Ld:
            int r9 = r12.length
            if (r8 >= r9) goto L23
            r9 = r12[r8]
            if (r1 > r8) goto L1a
            r10 = 156(0x9c, float:2.19E-43)
            if (r8 >= r10) goto L1a
            r9 = 32
        L1a:
            r10 = r9 & 255(0xff, float:3.57E-43)
            long r10 = (long) r10
            long r4 = r4 + r10
            long r9 = (long) r9
            long r6 = r6 + r9
            int r8 = r8 + 1
            goto Ld
        L23:
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L2b
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 != 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }
}
