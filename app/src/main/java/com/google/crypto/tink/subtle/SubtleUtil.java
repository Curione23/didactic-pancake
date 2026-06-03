package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtleUtil {

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.SubtleUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    private SubtleUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static int androidApiLevel() {
            java.lang.Integer r0 = com.google.crypto.tink.internal.Util.getAndroidApiLevel()
            if (r0 == 0) goto Lb
            int r0 = r0.intValue()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public static java.math.BigInteger bytes2Integer(byte[] r0) {
            java.math.BigInteger r0 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r0)
            return r0
    }

    public static byte[] integer2Bytes(java.math.BigInteger r0, int r1) throws java.security.GeneralSecurityException {
            byte[] r0 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r0, r1)
            return r0
    }

    public static boolean isAndroid() {
            java.lang.String r0 = "java.vendor"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "The Android Project"
            boolean r0 = r1.equals(r0)
            return r0
    }

    public static byte[] mgf1(byte[] r8, int r9, com.google.crypto.tink.subtle.Enums.HashType r10) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r0 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r10 = toDigestAlgo(r10)
            java.lang.Object r10 = r0.getInstance(r10)
            java.security.MessageDigest r10 = (java.security.MessageDigest) r10
            int r0 = r10.getDigestLength()
            byte[] r1 = new byte[r9]
            r2 = 0
            r3 = r2
            r4 = r3
        L15:
            int r5 = r9 + (-1)
            int r5 = r5 / r0
            if (r3 > r5) goto L40
            r10.reset()
            r10.update(r8)
            long r5 = (long) r3
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
            r6 = 4
            byte[] r5 = integer2Bytes(r5, r6)
            r10.update(r5)
            byte[] r5 = r10.digest()
            int r6 = r5.length
            int r7 = r9 - r4
            int r6 = java.lang.Math.min(r6, r7)
            java.lang.System.arraycopy(r5, r2, r1, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L15
        L40:
            return r1
    }

    public static void putAsUnsigedInt(java.nio.ByteBuffer r2, long r3) throws java.security.GeneralSecurityException {
            r0 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L14
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L14
            int r3 = (int) r3
            r2.putInt(r3)
            return
        L14:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Index out of range"
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.String toDigestAlgo(com.google.crypto.tink.subtle.Enums.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L38
            r1 = 2
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L2f
            r1 = 5
            if (r0 != r1) goto L1a
            java.lang.String r3 = "SHA-512"
            return r3
        L1a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported hash "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            java.lang.String r3 = "SHA-384"
            return r3
        L32:
            java.lang.String r3 = "SHA-256"
            return r3
        L35:
            java.lang.String r3 = "SHA-224"
            return r3
        L38:
            java.lang.String r3 = "SHA-1"
            return r3
    }

    public static java.lang.String toEcdsaAlgo(com.google.crypto.tink.subtle.Enums.HashType r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "withECDSA"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String toRsaSsaPkcs1Algo(com.google.crypto.tink.subtle.Enums.HashType r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "withRSA"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
