package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public class Md5Crypt {
    static final java.lang.String APR1_PREFIX = "$apr1$";
    private static final int BLOCKSIZE = 16;
    static final java.lang.String MD5_PREFIX = "$1$";
    private static final int ROUNDS = 1000;

    @java.lang.Deprecated
    public Md5Crypt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String apr1Crypt(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r1 = apr1Crypt(r1)
            return r1
    }

    public static java.lang.String apr1Crypt(java.lang.String r1, java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r1 = apr1Crypt(r1, r2)
            return r1
    }

    public static java.lang.String apr1Crypt(byte[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$apr1$"
            r0.<init>(r1)
            r1 = 8
            java.lang.String r1 = org.apache.commons.codec.digest.B64.getRandomSalt(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = apr1Crypt(r2, r0)
            return r2
    }

    public static java.lang.String apr1Crypt(byte[] r2, java.lang.String r3) {
            java.lang.String r0 = "$apr1$"
            if (r3 == 0) goto L17
            boolean r1 = r3.startsWith(r0)
            if (r1 != 0) goto L17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
        L17:
            java.lang.String r2 = md5Crypt(r2, r3, r0)
            return r2
    }

    public static java.lang.String apr1Crypt(byte[] r2, java.util.Random r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$apr1$"
            r0.<init>(r1)
            r1 = 8
            java.lang.String r3 = org.apache.commons.codec.digest.B64.getRandomSalt(r1, r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = apr1Crypt(r2, r3)
            return r2
    }

    public static java.lang.String md5Crypt(byte[] r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$1$"
            r0.<init>(r1)
            r1 = 8
            java.lang.String r1 = org.apache.commons.codec.digest.B64.getRandomSalt(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = md5Crypt(r2, r0)
            return r2
    }

    public static java.lang.String md5Crypt(byte[] r1, java.lang.String r2) {
            java.lang.String r0 = "$1$"
            java.lang.String r1 = md5Crypt(r1, r2, r0)
            return r1
    }

    public static java.lang.String md5Crypt(byte[] r1, java.lang.String r2, java.lang.String r3) {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            java.lang.String r1 = md5Crypt(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String md5Crypt(byte[] r11, java.lang.String r12, java.lang.String r13, java.util.Random r14) {
            int r0 = r11.length
            java.lang.String r1 = "$"
            r2 = 8
            r3 = 3
            r4 = 1
            r5 = 0
            if (r12 != 0) goto Lf
            java.lang.String r12 = org.apache.commons.codec.digest.B64.getRandomSalt(r2, r14)
            goto L70
        Lf:
            java.lang.String r14 = "prefix"
            java.util.Objects.requireNonNull(r13, r14)
            int r14 = r13.length()
            java.lang.String r6 = "Invalid prefix value: "
            if (r14 < r3) goto L17e
            char r14 = r13.charAt(r5)
            r7 = 36
            if (r14 == r7) goto L43
            int r14 = r13.length()
            int r14 = r14 - r4
            char r14 = r13.charAt(r14)
            if (r14 != r7) goto L30
            goto L43
        L30:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L43:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r6 = "^"
            r14.<init>(r6)
            java.lang.String r6 = "\\$"
            java.lang.String r6 = r13.replace(r1, r6)
            java.lang.StringBuilder r14 = r14.append(r6)
            java.lang.String r6 = "([\\.\\/a-zA-Z0-9]{1,8}).*"
            java.lang.StringBuilder r14 = r14.append(r6)
            java.lang.String r14 = r14.toString()
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)
            java.util.regex.Matcher r14 = r14.matcher(r12)
            boolean r6 = r14.find()
            if (r6 == 0) goto L169
            java.lang.String r12 = r14.group(r4)
        L70:
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r14 = r12.getBytes(r14)
            java.security.MessageDigest r6 = org.apache.commons.codec.digest.DigestUtils.getMd5Digest()
            r6.update(r11)
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r7 = r13.getBytes(r7)
            r6.update(r7)
            r6.update(r14)
            java.security.MessageDigest r7 = org.apache.commons.codec.digest.DigestUtils.getMd5Digest()
            r7.update(r11)
            r7.update(r14)
            r7.update(r11)
            byte[] r8 = r7.digest()
            r9 = r0
        L9b:
            r10 = 16
            if (r9 <= 0) goto La9
            int r10 = java.lang.Math.min(r9, r10)
            r6.update(r8, r5, r10)
            int r9 = r9 + (-16)
            goto L9b
        La9:
            java.util.Arrays.fill(r8, r5)
        Lac:
            if (r0 <= 0) goto Lc0
            r9 = r0 & 1
            if (r9 != r4) goto Lb8
            r9 = r8[r5]
            r6.update(r9)
            goto Lbd
        Lb8:
            r9 = r11[r5]
            r6.update(r9)
        Lbd:
            int r0 = r0 >> 1
            goto Lac
        Lc0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r13 = r8.append(r13)
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            byte[] r12 = r6.digest()
            r13 = r5
        Ldf:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r13 >= r1) goto L110
            java.security.MessageDigest r7 = org.apache.commons.codec.digest.DigestUtils.getMd5Digest()
            r1 = r13 & 1
            if (r1 == 0) goto Lef
            r7.update(r11)
            goto Lf2
        Lef:
            r7.update(r12, r5, r10)
        Lf2:
            int r8 = r13 % 3
            if (r8 == 0) goto Lf9
            r7.update(r14)
        Lf9:
            int r8 = r13 % 7
            if (r8 == 0) goto L100
            r7.update(r11)
        L100:
            if (r1 == 0) goto L106
            r7.update(r12, r5, r10)
            goto L109
        L106:
            r7.update(r11)
        L109:
            byte[] r12 = r7.digest()
            int r13 = r13 + 1
            goto Ldf
        L110:
            r13 = r12[r5]
            r1 = 6
            r1 = r12[r1]
            r8 = 12
            r8 = r12[r8]
            r9 = 4
            org.apache.commons.codec.digest.B64.b64from24bit(r13, r1, r8, r9, r0)
            r13 = r12[r4]
            r1 = 7
            r1 = r12[r1]
            r4 = 13
            r4 = r12[r4]
            org.apache.commons.codec.digest.B64.b64from24bit(r13, r1, r4, r9, r0)
            r13 = 2
            r1 = r12[r13]
            r2 = r12[r2]
            r4 = 14
            r4 = r12[r4]
            org.apache.commons.codec.digest.B64.b64from24bit(r1, r2, r4, r9, r0)
            r1 = r12[r3]
            r2 = 9
            r2 = r12[r2]
            r3 = 15
            r3 = r12[r3]
            org.apache.commons.codec.digest.B64.b64from24bit(r1, r2, r3, r9, r0)
            r1 = r12[r9]
            r2 = 10
            r2 = r12[r2]
            r3 = 5
            r3 = r12[r3]
            org.apache.commons.codec.digest.B64.b64from24bit(r1, r2, r3, r9, r0)
            r1 = 11
            r1 = r12[r1]
            org.apache.commons.codec.digest.B64.b64from24bit(r5, r5, r1, r13, r0)
            r6.reset()
            r7.reset()
            java.util.Arrays.fill(r11, r5)
            java.util.Arrays.fill(r14, r5)
            java.util.Arrays.fill(r12, r5)
            java.lang.String r11 = r0.toString()
            return r11
        L169:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid salt value: "
            r13.<init>(r14)
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L17e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    public static java.lang.String md5Crypt(byte[] r2, java.util.Random r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$1$"
            r0.<init>(r1)
            r1 = 8
            java.lang.String r3 = org.apache.commons.codec.digest.B64.getRandomSalt(r1, r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = md5Crypt(r2, r3)
            return r2
    }
}
