package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public class Sha2Crypt {
    private static final int ROUNDS_DEFAULT = 5000;
    private static final int ROUNDS_MAX = 999999999;
    private static final int ROUNDS_MIN = 1000;
    private static final java.lang.String ROUNDS_PREFIX = "rounds=";
    private static final java.util.regex.Pattern SALT_PATTERN = null;
    private static final int SHA256_BLOCKSIZE = 32;
    static final java.lang.String SHA256_PREFIX = "$5$";
    private static final int SHA512_BLOCKSIZE = 64;
    static final java.lang.String SHA512_PREFIX = "$6$";

    static {
            java.lang.String r0 = "^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.codec.digest.Sha2Crypt.SALT_PATTERN = r0
            return
    }

    public Sha2Crypt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String sha256Crypt(byte[] r1) {
            r0 = 0
            java.lang.String r1 = sha256Crypt(r1, r0)
            return r1
    }

    public static java.lang.String sha256Crypt(byte[] r3, java.lang.String r4) {
            java.lang.String r0 = "$5$"
            if (r4 != 0) goto L17
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r1 = 8
            java.lang.String r1 = org.apache.commons.codec.digest.B64.getRandomSalt(r1)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
        L17:
            r1 = 32
            java.lang.String r2 = "SHA-256"
            java.lang.String r3 = sha2Crypt(r3, r4, r0, r1, r2)
            return r3
    }

    public static java.lang.String sha256Crypt(byte[] r2, java.lang.String r3, java.util.Random r4) {
            java.lang.String r0 = "$5$"
            if (r3 != 0) goto L17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r1 = 8
            java.lang.String r4 = org.apache.commons.codec.digest.B64.getRandomSalt(r1, r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L17:
            r4 = 32
            java.lang.String r1 = "SHA-256"
            java.lang.String r2 = sha2Crypt(r2, r3, r0, r4, r1)
            return r2
    }

    private static java.lang.String sha2Crypt(byte[] r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32) {
            r0 = r28
            r1 = r29
            r2 = r31
            int r3 = r0.length
            if (r1 == 0) goto L321
            java.util.regex.Pattern r4 = org.apache.commons.codec.digest.Sha2Crypt.SALT_PATTERN
            java.util.regex.Matcher r4 = r4.matcher(r1)
            boolean r5 = r4.find()
            if (r5 == 0) goto L30c
            r1 = 3
            java.lang.String r5 = r4.group(r1)
            r7 = 0
            if (r5 == 0) goto L34
            java.lang.String r5 = r4.group(r1)
            int r5 = java.lang.Integer.parseInt(r5)
            r8 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r5 = java.lang.Math.min(r8, r5)
            r8 = 1000(0x3e8, float:1.401E-42)
            int r5 = java.lang.Math.max(r8, r5)
            r8 = 1
            goto L37
        L34:
            r5 = 5000(0x1388, float:7.006E-42)
            r8 = r7
        L37:
            r9 = 4
            java.lang.String r4 = r4.group(r9)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r4.getBytes(r10)
            int r11 = r10.length
            java.security.MessageDigest r12 = org.apache.commons.codec.digest.DigestUtils.getDigest(r32)
            r12.update(r0)
            r12.update(r10)
            java.security.MessageDigest r13 = org.apache.commons.codec.digest.DigestUtils.getDigest(r32)
            r13.update(r0)
            r13.update(r10)
            r13.update(r0)
            byte[] r13 = r13.digest()
            int r14 = r0.length
        L5f:
            if (r14 <= r2) goto L66
            r12.update(r13, r7, r2)
            int r14 = r14 - r2
            goto L5f
        L66:
            r12.update(r13, r7, r14)
            int r14 = r0.length
        L6a:
            if (r14 <= 0) goto L7a
            r15 = r14 & 1
            if (r15 == 0) goto L74
            r12.update(r13, r7, r2)
            goto L77
        L74:
            r12.update(r0)
        L77:
            int r14 = r14 >> 1
            goto L6a
        L7a:
            byte[] r13 = r12.digest()
            java.security.MessageDigest r14 = org.apache.commons.codec.digest.DigestUtils.getDigest(r32)
            r15 = 1
        L83:
            if (r15 > r3) goto L8b
            r14.update(r0)
            int r15 = r15 + 1
            goto L83
        L8b:
            byte[] r14 = r14.digest()
            byte[] r15 = new byte[r3]
            r1 = r7
        L92:
            int r6 = r3 - r2
            if (r1 >= r6) goto L9b
            java.lang.System.arraycopy(r14, r7, r15, r1, r2)
            int r1 = r1 + r2
            goto L92
        L9b:
            int r6 = r3 - r1
            java.lang.System.arraycopy(r14, r7, r15, r1, r6)
            java.security.MessageDigest r1 = org.apache.commons.codec.digest.DigestUtils.getDigest(r32)
            r6 = 1
        La5:
            r14 = r13[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r16 = 16
            int r14 = r14 + 16
            if (r6 > r14) goto Lb5
            r1.update(r10)
            int r6 = r6 + 1
            goto La5
        Lb5:
            byte[] r6 = r1.digest()
            byte[] r14 = new byte[r11]
            r9 = r7
            r18 = r12
        Lbe:
            int r12 = r11 - r2
            if (r9 >= r12) goto Lc7
            java.lang.System.arraycopy(r6, r7, r14, r9, r2)
            int r9 = r9 + r2
            goto Lbe
        Lc7:
            int r12 = r11 - r9
            java.lang.System.arraycopy(r6, r7, r14, r9, r12)
            r9 = r7
            r12 = r18
        Lcf:
            int r7 = r5 + (-1)
            if (r9 > r7) goto L109
            java.security.MessageDigest r12 = org.apache.commons.codec.digest.DigestUtils.getDigest(r32)
            r7 = r9 & 1
            if (r7 == 0) goto Le2
            r19 = r10
            r10 = 0
            r12.update(r15, r10, r3)
            goto Le8
        Le2:
            r19 = r10
            r10 = 0
            r12.update(r13, r10, r2)
        Le8:
            int r18 = r9 % 3
            if (r18 == 0) goto Lef
            r12.update(r14, r10, r11)
        Lef:
            int r18 = r9 % 7
            if (r18 == 0) goto Lf6
            r12.update(r15, r10, r3)
        Lf6:
            if (r7 == 0) goto Lfc
            r12.update(r13, r10, r2)
            goto Lff
        Lfc:
            r12.update(r15, r10, r3)
        Lff:
            byte[] r13 = r12.digest()
            int r9 = r9 + 1
            r10 = r19
            r7 = 0
            goto Lcf
        L109:
            r19 = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r7 = r30
            r3.<init>(r7)
            java.lang.String r7 = "$"
            if (r8 == 0) goto L121
            java.lang.String r8 = "rounds="
            r3.append(r8)
            r3.append(r5)
            r3.append(r7)
        L121:
            r3.append(r4)
            r3.append(r7)
            r9 = 27
            r10 = 6
            r11 = 26
            r20 = 5
            r21 = 25
            r22 = 24
            r23 = 23
            r24 = 22
            r25 = 21
            r5 = 32
            r26 = 7
            r4 = 2
            if (r2 != r5) goto L1c9
            r2 = 0
            r5 = r13[r2]
            r2 = 10
            r2 = r13[r2]
            r27 = 20
            r7 = r13[r27]
            r8 = 4
            org.apache.commons.codec.digest.B64.b64from24bit(r5, r2, r7, r8, r3)
            r2 = r13[r25]
            r5 = 1
            r5 = r13[r5]
            r7 = 11
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 12
            r2 = r13[r2]
            r5 = r13[r24]
            r4 = r13[r4]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r4, r8, r3)
            r2 = 3
            r4 = r13[r2]
            r2 = 13
            r2 = r13[r2]
            r5 = r13[r23]
            org.apache.commons.codec.digest.B64.b64from24bit(r4, r2, r5, r8, r3)
            r2 = r13[r22]
            r4 = r13[r8]
            r5 = 14
            r5 = r13[r5]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r4, r5, r8, r3)
            r2 = 15
            r2 = r13[r2]
            r4 = r13[r21]
            r5 = r13[r20]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r4, r5, r8, r3)
            r2 = r13[r10]
            r4 = r13[r16]
            r5 = r13[r11]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r4, r5, r8, r3)
            r2 = r13[r9]
            r4 = r13[r26]
            r5 = 17
            r5 = r13[r5]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r4, r5, r8, r3)
            r2 = 18
            r2 = r13[r2]
            r4 = 28
            r4 = r13[r4]
            r5 = 8
            r5 = r13[r5]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r4, r5, r8, r3)
            r2 = 9
            r2 = r13[r2]
            r4 = 19
            r4 = r13[r4]
            r5 = 29
            r5 = r13[r5]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r4, r5, r8, r3)
            r2 = 31
            r2 = r13[r2]
            r4 = 30
            r4 = r13[r4]
            r5 = 3
            r7 = 0
            org.apache.commons.codec.digest.B64.b64from24bit(r7, r2, r4, r5, r3)
            r5 = r7
            goto L2f0
        L1c9:
            r7 = 0
            r8 = 4
            r2 = r13[r7]
            r7 = r13[r25]
            r17 = 42
            r5 = r13[r17]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r7, r5, r8, r3)
            r2 = r13[r24]
            r5 = 43
            r5 = r13[r5]
            r7 = 1
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 44
            r2 = r13[r2]
            r5 = r13[r4]
            r7 = r13[r23]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 3
            r2 = r13[r2]
            r5 = r13[r22]
            r7 = 45
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = r13[r21]
            r5 = 46
            r5 = r13[r5]
            r7 = r13[r8]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 47
            r2 = r13[r2]
            r5 = r13[r20]
            r7 = r13[r11]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = r13[r10]
            r5 = r13[r9]
            r7 = 48
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 28
            r2 = r13[r2]
            r5 = 49
            r5 = r13[r5]
            r7 = r13[r26]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 50
            r2 = r13[r2]
            r5 = 8
            r5 = r13[r5]
            r7 = 29
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 9
            r2 = r13[r2]
            r5 = 30
            r5 = r13[r5]
            r7 = 51
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 31
            r2 = r13[r2]
            r5 = 52
            r5 = r13[r5]
            r7 = 10
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 53
            r2 = r13[r2]
            r5 = 11
            r5 = r13[r5]
            r7 = 32
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 12
            r2 = r13[r2]
            r5 = 33
            r5 = r13[r5]
            r7 = 54
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 34
            r2 = r13[r2]
            r5 = 55
            r5 = r13[r5]
            r7 = 13
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 56
            r2 = r13[r2]
            r5 = 14
            r5 = r13[r5]
            r7 = 35
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 15
            r2 = r13[r2]
            r5 = 36
            r5 = r13[r5]
            r7 = 57
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 37
            r2 = r13[r2]
            r5 = 58
            r5 = r13[r5]
            r7 = r13[r16]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 59
            r2 = r13[r2]
            r5 = 17
            r5 = r13[r5]
            r7 = 38
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 18
            r2 = r13[r2]
            r5 = 39
            r5 = r13[r5]
            r7 = 60
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 40
            r2 = r13[r2]
            r5 = 61
            r5 = r13[r5]
            r7 = 19
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 62
            r2 = r13[r2]
            r5 = 20
            r5 = r13[r5]
            r7 = 41
            r7 = r13[r7]
            org.apache.commons.codec.digest.B64.b64from24bit(r2, r5, r7, r8, r3)
            r2 = 63
            r2 = r13[r2]
            r5 = 0
            org.apache.commons.codec.digest.B64.b64from24bit(r5, r5, r2, r4, r3)
        L2f0:
            java.util.Arrays.fill(r6, r5)
            java.util.Arrays.fill(r15, r5)
            java.util.Arrays.fill(r14, r5)
            r12.reset()
            r1.reset()
            java.util.Arrays.fill(r0, r5)
            r0 = r19
            java.util.Arrays.fill(r0, r5)
            java.lang.String r0 = r3.toString()
            return r0
        L30c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid salt value: "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L321:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Salt must not be null"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String sha512Crypt(byte[] r1) {
            r0 = 0
            java.lang.String r1 = sha512Crypt(r1, r0)
            return r1
    }

    public static java.lang.String sha512Crypt(byte[] r3, java.lang.String r4) {
            java.lang.String r0 = "$6$"
            if (r4 != 0) goto L17
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r1 = 8
            java.lang.String r1 = org.apache.commons.codec.digest.B64.getRandomSalt(r1)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
        L17:
            r1 = 64
            java.lang.String r2 = "SHA-512"
            java.lang.String r3 = sha2Crypt(r3, r4, r0, r1, r2)
            return r3
    }

    public static java.lang.String sha512Crypt(byte[] r2, java.lang.String r3, java.util.Random r4) {
            java.lang.String r0 = "$6$"
            if (r3 != 0) goto L17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r1 = 8
            java.lang.String r4 = org.apache.commons.codec.digest.B64.getRandomSalt(r1, r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L17:
            r4 = 64
            java.lang.String r1 = "SHA-512"
            java.lang.String r2 = sha2Crypt(r2, r3, r0, r4, r1)
            return r2
    }
}
