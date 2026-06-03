package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public final class HmacUtils {
    private static final int STREAM_BUFFER_LENGTH = 1024;
    private final javax.crypto.Mac mac;

    @java.lang.Deprecated
    public HmacUtils() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public HmacUtils(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            byte[] r2 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r2)
            r0.<init>(r1, r2)
            return
    }

    public HmacUtils(java.lang.String r1, byte[] r2) {
            r0 = this;
            javax.crypto.Mac r1 = getInitializedMac(r1, r2)
            r0.<init>(r1)
            return
    }

    private HmacUtils(javax.crypto.Mac r1) {
            r0 = this;
            r0.<init>()
            r0.mac = r1
            return
    }

    public HmacUtils(org.apache.commons.codec.digest.HmacAlgorithms r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            byte[] r2 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r2)
            r0.<init>(r1, r2)
            return
    }

    public HmacUtils(org.apache.commons.codec.digest.HmacAlgorithms r1, byte[] r2) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacMd5(byte[] r1) {
            org.apache.commons.codec.digest.HmacAlgorithms r0 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5
            javax.crypto.Mac r1 = getInitializedMac(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha1(byte[] r1) {
            org.apache.commons.codec.digest.HmacAlgorithms r0 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1
            javax.crypto.Mac r1 = getInitializedMac(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha256(byte[] r1) {
            org.apache.commons.codec.digest.HmacAlgorithms r0 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256
            javax.crypto.Mac r1 = getInitializedMac(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha384(byte[] r1) {
            org.apache.commons.codec.digest.HmacAlgorithms r0 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384
            javax.crypto.Mac r1 = getInitializedMac(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha512(byte[] r1) {
            org.apache.commons.codec.digest.HmacAlgorithms r0 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512
            javax.crypto.Mac r1 = getInitializedMac(r0, r1)
            return r1
    }

    public static javax.crypto.Mac getInitializedMac(java.lang.String r1, byte[] r2) {
            if (r2 == 0) goto L18
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> Lf java.security.NoSuchAlgorithmException -> L11
            r0.<init>(r2, r1)     // Catch: java.security.InvalidKeyException -> Lf java.security.NoSuchAlgorithmException -> L11
            javax.crypto.Mac r1 = javax.crypto.Mac.getInstance(r1)     // Catch: java.security.InvalidKeyException -> Lf java.security.NoSuchAlgorithmException -> L11
            r1.init(r0)     // Catch: java.security.InvalidKeyException -> Lf java.security.NoSuchAlgorithmException -> L11
            return r1
        Lf:
            r1 = move-exception
            goto L12
        L11:
            r1 = move-exception
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Null key"
            r1.<init>(r2)
            throw r1
    }

    public static javax.crypto.Mac getInitializedMac(org.apache.commons.codec.digest.HmacAlgorithms r0, byte[] r1) {
            java.lang.String r0 = r0.getName()
            javax.crypto.Mac r0 = getInitializedMac(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static byte[] hmacMd5(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacMd5(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacMd5(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacMd5Hex(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacMd5Hex(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacMd5Hex(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_MD5
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha1(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha1(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha1(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha1Hex(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha1Hex(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha1Hex(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_1
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha256(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha256(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha256(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha256Hex(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha256Hex(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha256Hex(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_256
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha384(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha384(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha384(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha384Hex(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha384Hex(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha384Hex(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_384
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha512(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha512(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static byte[] hmacSha512(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512
            r0.<init>(r1, r2)
            byte[] r2 = r0.hmac(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha512Hex(java.lang.String r2, java.lang.String r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha512Hex(byte[] r2, java.io.InputStream r3) throws java.io.IOException {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha512Hex(byte[] r2, byte[] r3) {
            org.apache.commons.codec.digest.HmacUtils r0 = new org.apache.commons.codec.digest.HmacUtils
            org.apache.commons.codec.digest.HmacAlgorithms r1 = org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_512
            r0.<init>(r1, r2)
            java.lang.String r2 = r0.hmacHex(r3)
            return r2
    }

    public static boolean isAvailable(java.lang.String r0) {
            javax.crypto.Mac.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean isAvailable(org.apache.commons.codec.digest.HmacAlgorithms r0) {
            java.lang.String r0 = r0.getName()     // Catch: java.security.NoSuchAlgorithmException -> L9
            javax.crypto.Mac.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static javax.crypto.Mac updateHmac(javax.crypto.Mac r5, java.io.InputStream r6) throws java.io.IOException {
            r5.reset()
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            r2 = 0
            int r3 = r6.read(r1, r2, r0)
        Lc:
            r4 = -1
            if (r3 <= r4) goto L17
            r5.update(r1, r2, r3)
            int r3 = r6.read(r1, r2, r0)
            goto Lc
        L17:
            return r5
    }

    public static javax.crypto.Mac updateHmac(javax.crypto.Mac r0, java.lang.String r1) {
            r0.reset()
            byte[] r1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r1)
            r0.update(r1)
            return r0
    }

    public static javax.crypto.Mac updateHmac(javax.crypto.Mac r0, byte[] r1) {
            r0.reset()
            r0.update(r1)
            return r0
    }

    public byte[] hmac(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r3)
            r0.<init>(r1)
            byte[] r3 = r2.hmac(r0)     // Catch: java.lang.Throwable -> L12
            r0.close()
            return r3
        L12:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            r3.addSuppressed(r0)
        L1b:
            throw r3
    }

    public byte[] hmac(java.io.InputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
        L4:
            r2 = 0
            int r3 = r6.read(r1, r2, r0)
            r4 = -1
            if (r3 <= r4) goto L12
            javax.crypto.Mac r4 = r5.mac
            r4.update(r1, r2, r3)
            goto L4
        L12:
            javax.crypto.Mac r6 = r5.mac
            byte[] r6 = r6.doFinal()
            return r6
    }

    public byte[] hmac(java.lang.String r2) {
            r1 = this;
            javax.crypto.Mac r0 = r1.mac
            byte[] r2 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r2)
            byte[] r2 = r0.doFinal(r2)
            return r2
    }

    public byte[] hmac(java.nio.ByteBuffer r2) {
            r1 = this;
            javax.crypto.Mac r0 = r1.mac
            r0.update(r2)
            javax.crypto.Mac r2 = r1.mac
            byte[] r2 = r2.doFinal()
            return r2
    }

    public byte[] hmac(byte[] r2) {
            r1 = this;
            javax.crypto.Mac r0 = r1.mac
            byte[] r2 = r0.doFinal(r2)
            return r2
    }

    public java.lang.String hmacHex(java.io.File r1) throws java.io.IOException {
            r0 = this;
            byte[] r1 = r0.hmac(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.Hex.encodeHexString(r1)
            return r1
    }

    public java.lang.String hmacHex(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            byte[] r1 = r0.hmac(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.Hex.encodeHexString(r1)
            return r1
    }

    public java.lang.String hmacHex(java.lang.String r1) {
            r0 = this;
            byte[] r1 = r0.hmac(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.Hex.encodeHexString(r1)
            return r1
    }

    public java.lang.String hmacHex(java.nio.ByteBuffer r1) {
            r0 = this;
            byte[] r1 = r0.hmac(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.Hex.encodeHexString(r1)
            return r1
    }

    public java.lang.String hmacHex(byte[] r1) {
            r0 = this;
            byte[] r1 = r0.hmac(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.Hex.encodeHexString(r1)
            return r1
    }
}
