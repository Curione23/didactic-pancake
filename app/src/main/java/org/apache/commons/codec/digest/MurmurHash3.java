package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public final class MurmurHash3 {
    private static final long C1 = -8663945395140668459L;
    private static final int C1_32 = -862048943;
    private static final long C2 = 5545529020109919103L;
    private static final int C2_32 = 461845907;
    public static final int DEFAULT_SEED = 104729;
    private static final int M = 5;
    private static final int M_32 = 5;
    private static final int N1 = 1390208809;
    private static final int N2 = 944331445;

    @java.lang.Deprecated
    public static final long NULL_HASHCODE = 2862933555777941757L;
    private static final int N_32 = -430675100;
    private static final int R1 = 31;
    private static final int R1_32 = 15;
    private static final int R2 = 27;
    private static final int R2_32 = 13;
    private static final int R3 = 33;

    @java.lang.Deprecated
    public static class IncrementalHash32 extends org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86 {
        public IncrementalHash32() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86
        @java.lang.Deprecated
        int finalise(int r5, int r6, byte[] r7, int r8) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r6 == r0) goto L17
                r2 = 2
                if (r6 == r2) goto L10
                r3 = 3
                if (r6 == r3) goto Lb
                goto L2a
            Lb:
                r6 = r7[r2]
                int r6 = r6 << 16
                goto L11
            L10:
                r6 = r1
            L11:
                r0 = r7[r0]
                int r0 = r0 << 8
                r6 = r6 ^ r0
                goto L18
            L17:
                r6 = r1
            L18:
                r7 = r7[r1]
                r6 = r6 ^ r7
                r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
                int r6 = r6 * r7
                r7 = 15
                int r6 = java.lang.Integer.rotateLeft(r6, r7)
                r7 = 461845907(0x1b873593, float:2.2368498E-22)
                int r6 = r6 * r7
                r5 = r5 ^ r6
            L2a:
                r5 = r5 ^ r8
                int r5 = org.apache.commons.codec.digest.MurmurHash3.access$000(r5)
                return r5
        }
    }

    public static class IncrementalHash32x86 {
        private static final int BLOCK_SIZE = 4;
        private int hash;
        private int totalLen;
        private final byte[] unprocessed;
        private int unprocessedLength;

        public IncrementalHash32x86() {
                r1 = this;
                r1.<init>()
                r0 = 3
                byte[] r0 = new byte[r0]
                r1.unprocessed = r0
                return
        }

        private static int orBytes(byte r0, byte r1, byte r2, byte r3) {
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 8
                r0 = r0 | r1
                r1 = r2 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 16
                r0 = r0 | r1
                r1 = r3 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 24
                r0 = r0 | r1
                return r0
        }

        public final void add(byte[] r7, int r8, int r9) {
                r6 = this;
                if (r9 > 0) goto L3
                return
            L3:
                int r0 = r6.totalLen
                int r0 = r0 + r9
                r6.totalLen = r0
                int r0 = r6.unprocessedLength
                int r1 = r0 + r9
                int r1 = r1 + (-4)
                if (r1 >= 0) goto L1b
                byte[] r1 = r6.unprocessed
                java.lang.System.arraycopy(r7, r8, r1, r0, r9)
                int r7 = r6.unprocessedLength
                int r7 = r7 + r9
                r6.unprocessedLength = r7
                return
            L1b:
                r1 = 0
                r2 = 2
                if (r0 <= 0) goto L7e
                r3 = 1
                if (r0 == r3) goto L5e
                if (r0 == r2) goto L4d
                r4 = 3
                if (r0 != r4) goto L36
                byte[] r0 = r6.unprocessed
                r4 = r0[r1]
                r3 = r0[r3]
                r0 = r0[r2]
                r5 = r7[r8]
                int r0 = orBytes(r4, r3, r0, r5)
                goto L70
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r9 = "Unprocessed length should be 1, 2, or 3: "
                r8.<init>(r9)
                int r9 = r6.unprocessedLength
                java.lang.StringBuilder r8 = r8.append(r9)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            L4d:
                byte[] r0 = r6.unprocessed
                r4 = r0[r1]
                r0 = r0[r3]
                r3 = r7[r8]
                int r5 = r8 + 1
                r5 = r7[r5]
                int r0 = orBytes(r4, r0, r3, r5)
                goto L70
            L5e:
                byte[] r0 = r6.unprocessed
                r0 = r0[r1]
                r3 = r7[r8]
                int r4 = r8 + 1
                r4 = r7[r4]
                int r5 = r8 + 2
                r5 = r7[r5]
                int r0 = orBytes(r0, r3, r4, r5)
            L70:
                int r3 = r6.hash
                int r0 = org.apache.commons.codec.digest.MurmurHash3.access$100(r0, r3)
                r6.hash = r0
                int r0 = r6.unprocessedLength
                int r0 = 4 - r0
                int r8 = r8 + r0
                int r9 = r9 - r0
            L7e:
                int r0 = r9 >> 2
                r3 = r1
            L81:
                if (r3 >= r0) goto L95
                int r4 = r3 << 2
                int r4 = r4 + r8
                int r4 = org.apache.commons.codec.digest.MurmurHash3.access$200(r7, r4)
                int r5 = r6.hash
                int r4 = org.apache.commons.codec.digest.MurmurHash3.access$100(r4, r5)
                r6.hash = r4
                int r3 = r3 + 1
                goto L81
            L95:
                int r0 = r0 << r2
                int r9 = r9 - r0
                r6.unprocessedLength = r9
                if (r9 == 0) goto La1
                int r8 = r8 + r0
                byte[] r0 = r6.unprocessed
                java.lang.System.arraycopy(r7, r8, r0, r1, r9)
            La1:
                return
        }

        public final int end() {
                r4 = this;
                int r0 = r4.hash
                int r1 = r4.unprocessedLength
                byte[] r2 = r4.unprocessed
                int r3 = r4.totalLen
                int r0 = r4.finalise(r0, r1, r2, r3)
                return r0
        }

        int finalise(int r5, int r6, byte[] r7, int r8) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r6 == r0) goto L1b
                r2 = 2
                if (r6 == r2) goto L12
                r3 = 3
                if (r6 == r3) goto Lb
                goto L30
            Lb:
                r6 = r7[r2]
                r6 = r6 & 255(0xff, float:3.57E-43)
                int r6 = r6 << 16
                goto L13
            L12:
                r6 = r1
            L13:
                r0 = r7[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 8
                r6 = r6 ^ r0
                goto L1c
            L1b:
                r6 = r1
            L1c:
                r7 = r7[r1]
                r7 = r7 & 255(0xff, float:3.57E-43)
                r6 = r6 ^ r7
                r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
                int r6 = r6 * r7
                r7 = 15
                int r6 = java.lang.Integer.rotateLeft(r6, r7)
                r7 = 461845907(0x1b873593, float:2.2368498E-22)
                int r6 = r6 * r7
                r5 = r5 ^ r6
            L30:
                r5 = r5 ^ r8
                int r5 = org.apache.commons.codec.digest.MurmurHash3.access$000(r5)
                return r5
        }

        public final void start(int r2) {
                r1 = this;
                r0 = 0
                r1.totalLen = r0
                r1.unprocessedLength = r0
                r1.hash = r2
                return
        }
    }

    private MurmurHash3() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int access$000(int r0) {
            int r0 = fmix32(r0)
            return r0
    }

    static /* synthetic */ int access$100(int r0, int r1) {
            int r0 = mix32(r0, r1)
            return r0
    }

    static /* synthetic */ int access$200(byte[] r0, int r1) {
            int r0 = getLittleEndianInt(r0, r1)
            return r0
    }

    private static int fmix32(int r1) {
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
            r0 = -2048144789(0xffffffff85ebca6b, float:-2.217365E-35)
            int r1 = r1 * r0
            int r0 = r1 >>> 13
            r1 = r1 ^ r0
            r0 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
            int r1 = r1 * r0
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
            return r1
    }

    private static long fmix64(long r3) {
            r0 = 33
            long r1 = r3 >>> r0
            long r3 = r3 ^ r1
            r1 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
            long r3 = r3 * r1
            long r1 = r3 >>> r0
            long r3 = r3 ^ r1
            r1 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
            long r3 = r3 * r1
            long r0 = r3 >>> r0
            long r3 = r3 ^ r0
            return r3
    }

    private static int getLittleEndianInt(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    private static long getLittleEndianLong(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    @java.lang.Deprecated
    public static long[] hash128(java.lang.String r3) {
            byte[] r3 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r3)
            int r0 = r3.length
            r1 = 104729(0x19919, float:1.46757E-40)
            r2 = 0
            long[] r3 = hash128(r3, r2, r0, r1)
            return r3
    }

    public static long[] hash128(byte[] r3) {
            int r0 = r3.length
            r1 = 104729(0x19919, float:1.46757E-40)
            r2 = 0
            long[] r3 = hash128(r3, r2, r0, r1)
            return r3
    }

    @java.lang.Deprecated
    public static long[] hash128(byte[] r2, int r3, int r4, int r5) {
            long r0 = (long) r5
            long[] r2 = hash128x64Internal(r2, r3, r4, r0)
            return r2
    }

    public static long[] hash128x64(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            long[] r2 = hash128x64(r2, r0, r1, r0)
            return r2
    }

    public static long[] hash128x64(byte[] r4, int r5, int r6, int r7) {
            long r0 = (long) r7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long[] r4 = hash128x64Internal(r4, r5, r6, r0)
            return r4
    }

    private static long[] hash128x64Internal(byte[] r23, int r24, int r25, long r26) {
            r0 = r23
            r1 = r25
            int r2 = r1 >> 4
            r4 = r26
            r6 = r4
            r8 = 0
        La:
            r9 = 33
            r10 = 31
            r11 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            r13 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            r15 = 8
            if (r8 >= r2) goto L5b
            int r16 = r8 << 4
            int r3 = r24 + r16
            long r17 = getLittleEndianLong(r0, r3)
            int r3 = r3 + r15
            long r15 = getLittleEndianLong(r0, r3)
            long r0 = r17 * r13
            long r0 = java.lang.Long.rotateLeft(r0, r10)
            long r0 = r0 * r11
            long r0 = r0 ^ r4
            r3 = 27
            long r0 = java.lang.Long.rotateLeft(r0, r3)
            long r0 = r0 + r6
            r3 = 5
            long r0 = r0 * r3
            r17 = 1390208809(0x52dce729, double:6.86854413E-315)
            long r0 = r0 + r17
            long r11 = r11 * r15
            long r11 = java.lang.Long.rotateLeft(r11, r9)
            long r11 = r11 * r13
            long r5 = r6 ^ r11
            long r5 = java.lang.Long.rotateLeft(r5, r10)
            long r5 = r5 + r0
            long r5 = r5 * r3
            r3 = 944331445(0x38495ab5, double:4.665617253E-315)
            long r6 = r5 + r3
            int r8 = r8 + 1
            r4 = r0
            r0 = r23
            r1 = r25
            goto La
        L5b:
            int r0 = r2 << 4
            int r0 = r24 + r0
            r1 = r25
            int r2 = r24 + r1
            int r2 = r2 - r0
            r3 = 48
            r8 = 40
            r16 = 32
            r17 = 24
            r18 = 16
            r19 = 0
            r21 = 255(0xff, double:1.26E-321)
            switch(r2) {
                case 1: goto L116;
                case 2: goto L10c;
                case 3: goto L101;
                case 4: goto Lf6;
                case 5: goto Leb;
                case 6: goto Le1;
                case 7: goto Ld6;
                case 8: goto Lcb;
                case 9: goto Lb5;
                case 10: goto Lab;
                case 11: goto La0;
                case 12: goto L95;
                case 13: goto L8a;
                case 14: goto L80;
                case 15: goto L77;
                default: goto L75;
            }
        L75:
            goto L129
        L77:
            int r2 = r0 + 14
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            long r19 = r13 << r3
        L80:
            int r2 = r0 + 13
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            long r13 = r13 << r8
            long r19 = r19 ^ r13
        L8a:
            int r2 = r0 + 12
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            long r13 = r13 << r16
            long r19 = r19 ^ r13
        L95:
            int r2 = r0 + 11
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            long r13 = r13 << r17
            long r19 = r19 ^ r13
        La0:
            int r2 = r0 + 10
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            long r13 = r13 << r18
            long r19 = r19 ^ r13
        Lab:
            int r2 = r0 + 9
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            long r13 = r13 << r15
            long r19 = r19 ^ r13
        Lb5:
            int r2 = r0 + 8
            r2 = r23[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r13 = (long) r2
            long r13 = r19 ^ r13
            long r13 = r13 * r11
            long r13 = java.lang.Long.rotateLeft(r13, r9)
            r19 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            long r13 = r13 * r19
            long r6 = r6 ^ r13
        Lcb:
            int r2 = r0 + 7
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            r2 = 56
            long r19 = r13 << r2
        Ld6:
            int r2 = r0 + 6
            r2 = r23[r2]
            long r13 = (long) r2
            long r13 = r13 & r21
            long r2 = r13 << r3
            long r19 = r19 ^ r2
        Le1:
            int r2 = r0 + 5
            r2 = r23[r2]
            long r2 = (long) r2
            long r2 = r2 & r21
            long r2 = r2 << r8
            long r19 = r19 ^ r2
        Leb:
            int r2 = r0 + 4
            r2 = r23[r2]
            long r2 = (long) r2
            long r2 = r2 & r21
            long r2 = r2 << r16
            long r19 = r19 ^ r2
        Lf6:
            int r2 = r0 + 3
            r2 = r23[r2]
            long r2 = (long) r2
            long r2 = r2 & r21
            long r2 = r2 << r17
            long r19 = r19 ^ r2
        L101:
            int r2 = r0 + 2
            r2 = r23[r2]
            long r2 = (long) r2
            long r2 = r2 & r21
            long r2 = r2 << r18
            long r19 = r19 ^ r2
        L10c:
            int r2 = r0 + 1
            r2 = r23[r2]
            long r2 = (long) r2
            long r2 = r2 & r21
            long r2 = r2 << r15
            long r19 = r19 ^ r2
        L116:
            r0 = r23[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r0
            long r2 = r19 ^ r2
            r8 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            long r2 = r2 * r8
            long r2 = java.lang.Long.rotateLeft(r2, r10)
            long r2 = r2 * r11
            long r4 = r4 ^ r2
        L129:
            long r0 = (long) r1
            long r2 = r4 ^ r0
            long r0 = r0 ^ r6
            long r2 = r2 + r0
            long r0 = r0 + r2
            long r2 = fmix64(r2)
            long r0 = fmix64(r0)
            long r2 = r2 + r0
            long r0 = r0 + r2
            r4 = 2
            long[] r4 = new long[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r0
            return r4
    }

    public static int hash32(long r1) {
            r0 = 104729(0x19919, float:1.46757E-40)
            int r1 = hash32(r1, r0)
            return r1
    }

    public static int hash32(long r1, int r3) {
            long r1 = java.lang.Long.reverseBytes(r1)
            int r0 = (int) r1
            int r3 = mix32(r0, r3)
            r0 = 32
            long r1 = r1 >>> r0
            int r1 = (int) r1
            int r1 = mix32(r1, r3)
            r1 = r1 ^ 8
            int r1 = fmix32(r1)
            return r1
    }

    public static int hash32(long r1, long r3) {
            r0 = 104729(0x19919, float:1.46757E-40)
            int r1 = hash32(r1, r3, r0)
            return r1
    }

    public static int hash32(long r1, long r3, int r5) {
            long r1 = java.lang.Long.reverseBytes(r1)
            long r3 = java.lang.Long.reverseBytes(r3)
            int r0 = (int) r1
            int r5 = mix32(r0, r5)
            r0 = 32
            long r1 = r1 >>> r0
            int r1 = (int) r1
            int r1 = mix32(r1, r5)
            int r2 = (int) r3
            int r1 = mix32(r2, r1)
            long r2 = r3 >>> r0
            int r2 = (int) r2
            int r1 = mix32(r2, r1)
            r1 = r1 ^ 16
            int r1 = fmix32(r1)
            return r1
    }

    @java.lang.Deprecated
    public static int hash32(java.lang.String r3) {
            byte[] r3 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r3)
            int r0 = r3.length
            r1 = 104729(0x19919, float:1.46757E-40)
            r2 = 0
            int r3 = hash32(r3, r2, r0, r1)
            return r3
    }

    @java.lang.Deprecated
    public static int hash32(byte[] r3) {
            int r0 = r3.length
            r1 = 104729(0x19919, float:1.46757E-40)
            r2 = 0
            int r3 = hash32(r3, r2, r0, r1)
            return r3
    }

    @java.lang.Deprecated
    public static int hash32(byte[] r1, int r2) {
            r0 = 104729(0x19919, float:1.46757E-40)
            int r1 = hash32(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static int hash32(byte[] r1, int r2, int r3) {
            r0 = 0
            int r1 = hash32(r1, r0, r2, r3)
            return r1
    }

    @java.lang.Deprecated
    public static int hash32(byte[] r4, int r5, int r6, int r7) {
            int r0 = r6 >> 2
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L14
            int r3 = r2 << 2
            int r3 = r3 + r5
            int r3 = getLittleEndianInt(r4, r3)
            int r7 = mix32(r3, r7)
            int r2 = r2 + 1
            goto L4
        L14:
            r2 = 2
            int r0 = r0 << r2
            int r0 = r0 + r5
            int r5 = r5 + r6
            int r5 = r5 - r0
            r3 = 1
            if (r5 == r3) goto L2f
            if (r5 == r2) goto L28
            r1 = 3
            if (r5 == r1) goto L22
            goto L41
        L22:
            int r5 = r0 + 2
            r5 = r4[r5]
            int r1 = r5 << 16
        L28:
            int r5 = r0 + 1
            r5 = r4[r5]
            int r5 = r5 << 8
            r1 = r1 ^ r5
        L2f:
            r4 = r4[r0]
            r4 = r4 ^ r1
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r5
            r5 = 15
            int r4 = java.lang.Integer.rotateLeft(r4, r5)
            r5 = 461845907(0x1b873593, float:2.2368498E-22)
            int r4 = r4 * r5
            r7 = r7 ^ r4
        L41:
            r4 = r7 ^ r6
            int r4 = fmix32(r4)
            return r4
    }

    public static int hash32x86(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            int r2 = hash32x86(r2, r0, r1, r0)
            return r2
    }

    public static int hash32x86(byte[] r4, int r5, int r6, int r7) {
            int r0 = r6 >> 2
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L14
            int r3 = r2 << 2
            int r3 = r3 + r5
            int r3 = getLittleEndianInt(r4, r3)
            int r7 = mix32(r3, r7)
            int r2 = r2 + 1
            goto L4
        L14:
            r2 = 2
            int r0 = r0 << r2
            int r0 = r0 + r5
            int r5 = r5 + r6
            int r5 = r5 - r0
            r3 = 1
            if (r5 == r3) goto L33
            if (r5 == r2) goto L2a
            r1 = 3
            if (r5 == r1) goto L22
            goto L47
        L22:
            int r5 = r0 + 2
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r1 = r5 << 16
        L2a:
            int r5 = r0 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r1 = r1 ^ r5
        L33:
            r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r1
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r5
            r5 = 15
            int r4 = java.lang.Integer.rotateLeft(r4, r5)
            r5 = 461845907(0x1b873593, float:2.2368498E-22)
            int r4 = r4 * r5
            r7 = r7 ^ r4
        L47:
            r4 = r7 ^ r6
            int r4 = fmix32(r4)
            return r4
    }

    @java.lang.Deprecated
    public static long hash64(int r4) {
            int r4 = java.lang.Integer.reverseBytes(r4)
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            long r0 = r0 * r2
            r4 = 31
            long r0 = java.lang.Long.rotateLeft(r0, r4)
            r2 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            long r0 = r0 * r2
            r2 = 104733(0x1991d, double:5.1745E-319)
            long r0 = r0 ^ r2
            long r0 = fmix64(r0)
            return r0
    }

    @java.lang.Deprecated
    public static long hash64(long r2) {
            long r2 = java.lang.Long.reverseBytes(r2)
            r0 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            long r2 = r2 * r0
            r0 = 31
            long r2 = java.lang.Long.rotateLeft(r2, r0)
            r0 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            long r2 = r2 * r0
            r0 = 104729(0x19919, double:5.1743E-319)
            long r2 = r2 ^ r0
            r0 = 27
            long r2 = java.lang.Long.rotateLeft(r2, r0)
            r0 = 5
            long r2 = r2 * r0
            r0 = 1390208809(0x52dce729, double:6.86854413E-315)
            long r2 = r2 + r0
            r0 = 8
            long r2 = r2 ^ r0
            long r2 = fmix64(r2)
            return r2
    }

    @java.lang.Deprecated
    public static long hash64(short r6) {
            long r0 = (long) r6
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 8
            long r0 = r0 << r4
            r5 = 65280(0xff00, float:9.1477E-41)
            r6 = r6 & r5
            int r6 = r6 >> r4
            long r4 = (long) r6
            long r2 = r2 & r4
            long r0 = r0 ^ r2
            r2 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            long r0 = r0 * r2
            r6 = 31
            long r0 = java.lang.Long.rotateLeft(r0, r6)
            r2 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            long r0 = r0 * r2
            r2 = 104731(0x1991b, double:5.1744E-319)
            long r0 = r0 ^ r2
            long r0 = fmix64(r0)
            return r0
    }

    @java.lang.Deprecated
    public static long hash64(byte[] r3) {
            int r0 = r3.length
            r1 = 104729(0x19919, float:1.46757E-40)
            r2 = 0
            long r0 = hash64(r3, r2, r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static long hash64(byte[] r1, int r2, int r3) {
            r0 = 104729(0x19919, float:1.46757E-40)
            long r1 = hash64(r1, r2, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static long hash64(byte[] r15, int r16, int r17, int r18) {
            r0 = r15
            r1 = r17
            r2 = r18
            long r2 = (long) r2
            int r4 = r1 >> 3
            r5 = 0
        L9:
            r6 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            r8 = 31
            r9 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            if (r5 >= r4) goto L36
            int r11 = r5 << 3
            int r11 = r16 + r11
            long r11 = getLittleEndianLong(r15, r11)
            long r11 = r11 * r9
            long r8 = java.lang.Long.rotateLeft(r11, r8)
            long r8 = r8 * r6
            long r2 = r2 ^ r8
            r6 = 27
            long r2 = java.lang.Long.rotateLeft(r2, r6)
            r6 = 5
            long r2 = r2 * r6
            r6 = 1390208809(0x52dce729, double:6.86854413E-315)
            long r2 = r2 + r6
            int r5 = r5 + 1
            goto L9
        L36:
            int r4 = r4 << 3
            int r4 = r16 + r4
            int r5 = r16 + r1
            int r5 = r5 - r4
            r11 = 255(0xff, double:1.26E-321)
            r13 = 0
            switch(r5) {
                case 1: goto L81;
                case 2: goto L77;
                case 3: goto L6d;
                case 4: goto L63;
                case 5: goto L59;
                case 6: goto L4e;
                case 7: goto L45;
                default: goto L44;
            }
        L44:
            goto L92
        L45:
            int r5 = r4 + 6
            r5 = r0[r5]
            long r13 = (long) r5
            long r13 = r13 & r11
            r5 = 48
            long r13 = r13 << r5
        L4e:
            int r5 = r4 + 5
            r5 = r0[r5]
            long r6 = (long) r5
            long r5 = r6 & r11
            r7 = 40
            long r5 = r5 << r7
            long r13 = r13 ^ r5
        L59:
            int r5 = r4 + 4
            r5 = r0[r5]
            long r5 = (long) r5
            long r5 = r5 & r11
            r7 = 32
            long r5 = r5 << r7
            long r13 = r13 ^ r5
        L63:
            int r5 = r4 + 3
            r5 = r0[r5]
            long r5 = (long) r5
            long r5 = r5 & r11
            r7 = 24
            long r5 = r5 << r7
            long r13 = r13 ^ r5
        L6d:
            int r5 = r4 + 2
            r5 = r0[r5]
            long r5 = (long) r5
            long r5 = r5 & r11
            r7 = 16
            long r5 = r5 << r7
            long r13 = r13 ^ r5
        L77:
            int r5 = r4 + 1
            r5 = r0[r5]
            long r5 = (long) r5
            long r5 = r5 & r11
            r7 = 8
            long r5 = r5 << r7
            long r13 = r13 ^ r5
        L81:
            r0 = r0[r4]
            long r4 = (long) r0
            long r4 = r4 & r11
            long r4 = r4 ^ r13
            long r4 = r4 * r9
            long r4 = java.lang.Long.rotateLeft(r4, r8)
            r6 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            long r4 = r4 * r6
            long r2 = r2 ^ r4
        L92:
            long r0 = (long) r1
            long r0 = r0 ^ r2
            long r0 = fmix64(r0)
            return r0
    }

    private static int mix32(int r1, int r2) {
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            r0 = 15
            int r1 = java.lang.Integer.rotateLeft(r1, r0)
            r0 = 461845907(0x1b873593, float:2.2368498E-22)
            int r1 = r1 * r0
            r1 = r1 ^ r2
            r2 = 13
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            int r1 = r1 * 5
            r2 = -430675100(0xffffffffe6546b64, float:-2.5078068E23)
            int r1 = r1 + r2
            return r1
    }
}
