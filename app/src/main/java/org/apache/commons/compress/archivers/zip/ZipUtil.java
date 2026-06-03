package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZipUtil {
    private static final long DOSTIME_BEFORE_1980 = 2162688;
    private static final long DOSTIME_BEFORE_1980_AS_JAVA_TIME = 0;
    private static final long UPPER_DOSTIME_BOUND = 4036608000000L;

    static {
            r0 = 2162688(0x210000, double:1.06851E-317)
            long r0 = dosToJavaTime(r0)
            org.apache.commons.compress.archivers.zip.ZipUtil.DOSTIME_BEFORE_1980_AS_JAVA_TIME = r0
            return
    }

    public ZipUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long adjustToLong(int r4) {
            if (r4 >= 0) goto La
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = (long) r4
            long r2 = r2 + r0
            return r2
        La:
            long r0 = (long) r4
            return r0
    }

    static long bigToLong(java.math.BigInteger r3) {
            int r0 = r3.bitLength()
            r1 = 63
            if (r0 > r1) goto Ld
            long r0 = r3.longValue()
            return r0
        Ld:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The BigInteger cannot fit inside a 64 bit java long: ["
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static boolean canHandleEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1) {
            boolean r0 = supportsEncryptionOf(r1)
            if (r0 == 0) goto Le
            boolean r1 = supportsMethodOf(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    static void checkRequestedFeatures(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) throws org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException {
            boolean r0 = supportsEncryptionOf(r2)
            if (r0 == 0) goto L25
            boolean r0 = supportsMethodOf(r2)
            if (r0 != 0) goto L24
            int r0 = r2.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r0 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(r0)
            if (r0 != 0) goto L1e
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD
            r0.<init>(r1, r2)
            throw r0
        L1e:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r1 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            r1.<init>(r0, r2)
            throw r1
        L24:
            return
        L25:
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException r0 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException$Feature r1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.ENCRYPTION
            r0.<init>(r1, r2)
            throw r0
    }

    static void copy(byte[] r2, byte[] r3, int r4) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            java.lang.System.arraycopy(r2, r0, r3, r4, r1)
        L7:
            return
    }

    static byte[] copy(byte[] r1) {
            if (r1 == 0) goto L8
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            return r1
        L8:
            r1 = 0
            return r1
    }

    private static java.util.Date dosToJavaDate(long r7) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 25
            long r1 = r7 >> r1
            r3 = 127(0x7f, double:6.27E-322)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r1 = r1 + 1980
            r2 = 1
            r0.set(r2, r1)
            r1 = 21
            long r3 = r7 >> r1
            r5 = 15
            long r3 = r3 & r5
            int r1 = (int) r3
            int r1 = r1 - r2
            r3 = 2
            r0.set(r3, r1)
            r1 = 16
            long r3 = r7 >> r1
            int r1 = (int) r3
            r1 = r1 & 31
            r3 = 5
            r0.set(r3, r1)
            r1 = 11
            long r4 = r7 >> r1
            int r4 = (int) r4
            r4 = r4 & 31
            r0.set(r1, r4)
            long r3 = r7 >> r3
            int r1 = (int) r3
            r1 = r1 & 63
            r3 = 12
            r0.set(r3, r1)
            long r7 = r7 << r2
            int r7 = (int) r7
            r7 = r7 & 62
            r8 = 13
            r0.set(r8, r7)
            r7 = 14
            r8 = 0
            r0.set(r7, r8)
            java.util.Date r7 = r0.getTime()
            return r7
    }

    public static long dosToJavaTime(long r0) {
            java.util.Date r0 = dosToJavaDate(r0)
            long r0 = r0.getTime()
            return r0
    }

    public static java.util.Date fromDosTime(org.apache.commons.compress.archivers.zip.ZipLong r2) {
            long r0 = r2.getValue()
            java.util.Date r2 = dosToJavaDate(r0)
            return r2
    }

    private static java.lang.String getUnicodeStringIfOriginalMatches(org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField r4, byte[] r5) {
            if (r4 == 0) goto L21
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r0.update(r5)
            long r0 = r0.getValue()
            long r2 = r4.getNameCRC32()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L21
            org.apache.commons.compress.archivers.zip.ZipEncoding r5 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.ZIP_ENCODING_UTF_8     // Catch: java.io.IOException -> L21
            byte[] r4 = r4.getUnicodeName()     // Catch: java.io.IOException -> L21
            java.lang.String r4 = r5.decode(r4)     // Catch: java.io.IOException -> L21
            return r4
        L21:
            r4 = 0
            return r4
    }

    public static boolean isDosTime(long r2) {
            r0 = 4036608000000(0x3abd8960000, double:1.994349338528E-311)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L1c
            long r0 = org.apache.commons.compress.archivers.zip.ZipUtil.DOSTIME_BEFORE_1980_AS_JAVA_TIME
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r2 = javaToDosTime(r2)
            r0 = 2162688(0x210000, double:1.06851E-317)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L1c
        L1a:
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    private static java.time.LocalDateTime javaEpochToLocalDateTime(long r0) {
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r1 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.ofInstant(r0, r1)
            return r0
    }

    private static long javaToDosTime(long r2) {
            java.time.LocalDateTime r2 = javaEpochToLocalDateTime(r2)
            int r3 = r2.getYear()
            r0 = 1980(0x7bc, float:2.775E-42)
            if (r3 >= r0) goto L10
            r2 = 2162688(0x210000, double:1.06851E-317)
            return r2
        L10:
            int r3 = r2.getYear()
            int r3 = r3 - r0
            int r3 = r3 << 25
            int r0 = r2.getMonthValue()
            int r0 = r0 << 21
            r3 = r3 | r0
            int r0 = r2.getDayOfMonth()
            int r0 = r0 << 16
            r3 = r3 | r0
            int r0 = r2.getHour()
            int r0 = r0 << 11
            r3 = r3 | r0
            int r0 = r2.getMinute()
            int r0 = r0 << 5
            r3 = r3 | r0
            int r2 = r2.getSecond()
            int r2 = r2 >> 1
            r2 = r2 | r3
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    static java.math.BigInteger longToBig(long r3) {
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L19
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L14
            if (r0 < 0) goto L14
            int r3 = (int) r3
            long r3 = adjustToLong(r3)
        L14:
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)
            return r3
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative longs < -2^31 not permitted: ["
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r4 = "]"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static byte[] reverse(byte[] r5) {
            int r0 = r5.length
            int r0 = r0 + (-1)
            r1 = 0
        L4:
            int r2 = r5.length
            int r2 = r2 / 2
            if (r1 >= r2) goto L16
            r2 = r5[r1]
            int r3 = r0 - r1
            r4 = r5[r3]
            r5[r1] = r4
            r5[r3] = r2
            int r1 = r1 + 1
            goto L4
        L16:
            return r5
    }

    static void setNameAndCommentFromExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3, byte[] r4, byte[] r5) {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r0 = r3.getExtraField(r0)
            boolean r1 = r0 instanceof org.apache.commons.compress.archivers.zip.UnicodePathExtraField
            r2 = 0
            if (r1 == 0) goto Le
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField r0 = (org.apache.commons.compress.archivers.zip.UnicodePathExtraField) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            java.lang.String r4 = getUnicodeStringIfOriginalMatches(r0, r4)
            if (r4 == 0) goto L1d
            r3.setName(r4)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource r4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD
            r3.setNameSource(r4)
        L1d:
            if (r5 == 0) goto L3d
            int r4 = r5.length
            if (r4 <= 0) goto L3d
            org.apache.commons.compress.archivers.zip.ZipShort r4 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID
            org.apache.commons.compress.archivers.zip.ZipExtraField r4 = r3.getExtraField(r4)
            boolean r0 = r4 instanceof org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField
            if (r0 == 0) goto L2f
            r2 = r4
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField r2 = (org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField) r2
        L2f:
            java.lang.String r4 = getUnicodeStringIfOriginalMatches(r2, r5)
            if (r4 == 0) goto L3d
            r3.setComment(r4)
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry$CommentSource r4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD
            r3.setCommentSource(r4)
        L3d:
            return
    }

    public static int signedByteToUnsignedInt(byte r0) {
            if (r0 < 0) goto L3
            return r0
        L3:
            int r0 = r0 + 256
            return r0
    }

    private static boolean supportsEncryptionOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0) {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit r0 = r0.getGeneralPurposeBit()
            boolean r0 = r0.usesEncryption()
            r0 = r0 ^ 1
            return r0
    }

    private static boolean supportsMethodOf(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2) {
            int r0 = r2.getMethod()
            if (r0 == 0) goto L41
            int r0 = r2.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING
            int r1 = r1.getCode()
            if (r0 == r1) goto L41
            int r0 = r2.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING
            int r1 = r1.getCode()
            if (r0 == r1) goto L41
            int r0 = r2.getMethod()
            r1 = 8
            if (r0 == r1) goto L41
            int r0 = r2.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r1 = org.apache.commons.compress.archivers.zip.ZipMethod.ENHANCED_DEFLATED
            int r1 = r1.getCode()
            if (r0 == r1) goto L41
            int r2 = r2.getMethod()
            org.apache.commons.compress.archivers.zip.ZipMethod r0 = org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2
            int r0 = r0.getCode()
            if (r2 != r0) goto L3f
            goto L41
        L3f:
            r2 = 0
            goto L42
        L41:
            r2 = 1
        L42:
            return r2
    }

    public static org.apache.commons.compress.archivers.zip.ZipLong toDosTime(java.util.Date r3) {
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            long r1 = r3.getTime()
            byte[] r3 = toDosTime(r1)
            r0.<init>(r3)
            return r0
    }

    public static void toDosTime(long r0, byte[] r2, int r3) {
            long r0 = javaToDosTime(r0)
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(r0, r2, r3)
            return
    }

    public static byte[] toDosTime(long r2) {
            r0 = 4
            byte[] r0 = new byte[r0]
            r1 = 0
            toDosTime(r2, r0, r1)
            return r0
    }

    public static byte unsignedIntToSignedByte(int r3) {
            r0 = 255(0xff, float:3.57E-43)
            if (r3 > r0) goto L10
            if (r3 < 0) goto L10
            r0 = 128(0x80, float:1.8E-43)
            if (r3 >= r0) goto Lc
            byte r3 = (byte) r3
            return r3
        Lc:
            int r3 = r3 + (-256)
            byte r3 = (byte) r3
            return r3
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can only convert non-negative integers between [0,255] to byte: ["
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
