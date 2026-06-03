package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public enum PemKeyType extends java.lang.Enum<com.google.crypto.tink.PemKeyType> {
    private static final /* synthetic */ com.google.crypto.tink.PemKeyType[] $VALUES = null;
    private static final java.lang.String BEGIN = "-----BEGIN ";
    public static final com.google.crypto.tink.PemKeyType ECDSA_P256_SHA256 = null;
    public static final com.google.crypto.tink.PemKeyType ECDSA_P384_SHA384 = null;
    public static final com.google.crypto.tink.PemKeyType ECDSA_P521_SHA512 = null;
    private static final java.lang.String END = "-----END ";
    private static final java.lang.String MARKER = "-----";
    private static final java.lang.String PRIVATE_KEY = "PRIVATE KEY";
    private static final java.lang.String PUBLIC_KEY = "PUBLIC KEY";
    public static final com.google.crypto.tink.PemKeyType RSA_PSS_2048_SHA256 = null;
    public static final com.google.crypto.tink.PemKeyType RSA_PSS_3072_SHA256 = null;
    public static final com.google.crypto.tink.PemKeyType RSA_PSS_4096_SHA256 = null;
    public static final com.google.crypto.tink.PemKeyType RSA_PSS_4096_SHA512 = null;
    public static final com.google.crypto.tink.PemKeyType RSA_SIGN_PKCS1_2048_SHA256 = null;
    public static final com.google.crypto.tink.PemKeyType RSA_SIGN_PKCS1_3072_SHA256 = null;
    public static final com.google.crypto.tink.PemKeyType RSA_SIGN_PKCS1_4096_SHA256 = null;
    public static final com.google.crypto.tink.PemKeyType RSA_SIGN_PKCS1_4096_SHA512 = null;
    public final java.lang.String algorithm;
    public final com.google.crypto.tink.subtle.Enums.HashType hash;
    public final int keySizeInBits;
    public final java.lang.String keyType;

    static {
            com.google.crypto.tink.PemKeyType r7 = new com.google.crypto.tink.PemKeyType
            r5 = 2048(0x800, float:2.87E-42)
            com.google.crypto.tink.subtle.Enums$HashType r6 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r1 = "RSA_PSS_2048_SHA256"
            r2 = 0
            java.lang.String r3 = "RSA"
            java.lang.String r4 = "RSASSA-PSS"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.PemKeyType.RSA_PSS_2048_SHA256 = r7
            com.google.crypto.tink.PemKeyType r1 = new com.google.crypto.tink.PemKeyType
            r13 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.subtle.Enums$HashType r14 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r9 = "RSA_PSS_3072_SHA256"
            r10 = 1
            java.lang.String r11 = "RSA"
            java.lang.String r12 = "RSASSA-PSS"
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.google.crypto.tink.PemKeyType.RSA_PSS_3072_SHA256 = r1
            com.google.crypto.tink.PemKeyType r2 = new com.google.crypto.tink.PemKeyType
            r20 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r21 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r16 = "RSA_PSS_4096_SHA256"
            r17 = 2
            java.lang.String r18 = "RSA"
            java.lang.String r19 = "RSASSA-PSS"
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            com.google.crypto.tink.PemKeyType.RSA_PSS_4096_SHA256 = r2
            com.google.crypto.tink.PemKeyType r3 = new com.google.crypto.tink.PemKeyType
            r13 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r14 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            java.lang.String r9 = "RSA_PSS_4096_SHA512"
            r10 = 3
            java.lang.String r11 = "RSA"
            java.lang.String r12 = "RSASSA-PSS"
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.google.crypto.tink.PemKeyType.RSA_PSS_4096_SHA512 = r3
            com.google.crypto.tink.PemKeyType r4 = new com.google.crypto.tink.PemKeyType
            r20 = 2048(0x800, float:2.87E-42)
            com.google.crypto.tink.subtle.Enums$HashType r21 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r16 = "RSA_SIGN_PKCS1_2048_SHA256"
            r17 = 4
            java.lang.String r18 = "RSA"
            java.lang.String r19 = "RSASSA-PKCS1-v1_5"
            r15 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            com.google.crypto.tink.PemKeyType.RSA_SIGN_PKCS1_2048_SHA256 = r4
            com.google.crypto.tink.PemKeyType r5 = new com.google.crypto.tink.PemKeyType
            r13 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.subtle.Enums$HashType r14 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r9 = "RSA_SIGN_PKCS1_3072_SHA256"
            r10 = 5
            java.lang.String r11 = "RSA"
            java.lang.String r12 = "RSASSA-PKCS1-v1_5"
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.google.crypto.tink.PemKeyType.RSA_SIGN_PKCS1_3072_SHA256 = r5
            com.google.crypto.tink.PemKeyType r6 = new com.google.crypto.tink.PemKeyType
            r20 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r21 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r16 = "RSA_SIGN_PKCS1_4096_SHA256"
            r17 = 6
            java.lang.String r18 = "RSA"
            java.lang.String r19 = "RSASSA-PKCS1-v1_5"
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21)
            com.google.crypto.tink.PemKeyType.RSA_SIGN_PKCS1_4096_SHA256 = r6
            com.google.crypto.tink.PemKeyType r15 = new com.google.crypto.tink.PemKeyType
            r13 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r14 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            java.lang.String r9 = "RSA_SIGN_PKCS1_4096_SHA512"
            r10 = 7
            java.lang.String r11 = "RSA"
            java.lang.String r12 = "RSASSA-PKCS1-v1_5"
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.google.crypto.tink.PemKeyType.RSA_SIGN_PKCS1_4096_SHA512 = r15
            com.google.crypto.tink.PemKeyType r8 = new com.google.crypto.tink.PemKeyType
            r21 = 256(0x100, float:3.59E-43)
            com.google.crypto.tink.subtle.Enums$HashType r22 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r17 = "ECDSA_P256_SHA256"
            r18 = 8
            java.lang.String r19 = "EC"
            java.lang.String r20 = "ECDSA"
            r16 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22)
            com.google.crypto.tink.PemKeyType.ECDSA_P256_SHA256 = r8
            com.google.crypto.tink.PemKeyType r9 = new com.google.crypto.tink.PemKeyType
            r28 = 384(0x180, float:5.38E-43)
            com.google.crypto.tink.subtle.Enums$HashType r29 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
            java.lang.String r24 = "ECDSA_P384_SHA384"
            r25 = 9
            java.lang.String r26 = "EC"
            java.lang.String r27 = "ECDSA"
            r23 = r9
            r23.<init>(r24, r25, r26, r27, r28, r29)
            com.google.crypto.tink.PemKeyType.ECDSA_P384_SHA384 = r9
            com.google.crypto.tink.PemKeyType r10 = new com.google.crypto.tink.PemKeyType
            r21 = 521(0x209, float:7.3E-43)
            com.google.crypto.tink.subtle.Enums$HashType r22 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            java.lang.String r17 = "ECDSA_P521_SHA512"
            r18 = 10
            java.lang.String r19 = "EC"
            java.lang.String r20 = "ECDSA"
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22)
            com.google.crypto.tink.PemKeyType.ECDSA_P521_SHA512 = r10
            r7 = r15
            com.google.crypto.tink.PemKeyType[] r0 = new com.google.crypto.tink.PemKeyType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            com.google.crypto.tink.PemKeyType.$VALUES = r0
            return
    }

    PemKeyType(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, int r5, com.google.crypto.tink.subtle.Enums.HashType r6) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.keyType = r3
            r0.algorithm = r4
            r0.keySizeInBits = r5
            r0.hash = r6
            return
    }

    private java.security.Key getPrivateKey(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = r2.keyType
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.PKCS8EncodedKeySpec r1 = new java.security.spec.PKCS8EncodedKeySpec
            r1.<init>(r3)
            java.security.PrivateKey r3 = r0.generatePrivate(r1)
            java.security.Key r3 = r2.validate(r3)
            return r3
    }

    private java.security.Key getPublicKey(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = r2.keyType
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r3)
            java.security.PublicKey r3 = r0.generatePublic(r1)
            java.security.Key r3 = r2.validate(r3)
            return r3
    }

    private java.security.Key validate(java.security.Key r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.String r0 = r3.keyType
            java.lang.String r1 = "RSA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = r4
            java.security.interfaces.RSAKey r0 = (java.security.interfaces.RSAKey) r0
            java.math.BigInteger r0 = r0.getModulus()
            int r0 = r0.bitLength()
            int r1 = r3.keySizeInBits
            if (r0 != r1) goto L1a
            goto L4d
        L1a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            int r1 = r3.keySizeInBits
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "invalid RSA key size, want %d got %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r4.<init>(r0)
            throw r4
        L34:
            r0 = r4
            java.security.interfaces.ECKey r0 = (java.security.interfaces.ECKey) r0
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            boolean r1 = com.google.crypto.tink.subtle.EllipticCurves.isNistEcParameterSpec(r0)
            if (r1 == 0) goto L68
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            int r0 = com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBits(r0)
            int r1 = r3.keySizeInBits
            if (r0 != r1) goto L4e
        L4d:
            return r4
        L4e:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            int r1 = r3.keySizeInBits
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "invalid EC key size, want %d got %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r4.<init>(r0)
            throw r4
        L68:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupport EC spec: "
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public static com.google.crypto.tink.PemKeyType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.PemKeyType> r0 = com.google.crypto.tink.PemKeyType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.PemKeyType r1 = (com.google.crypto.tink.PemKeyType) r1
            return r1
    }

    public static com.google.crypto.tink.PemKeyType[] values() {
            com.google.crypto.tink.PemKeyType[] r0 = com.google.crypto.tink.PemKeyType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.PemKeyType[] r0 = (com.google.crypto.tink.PemKeyType[]) r0
            return r0
    }

    @javax.annotation.Nullable
    public java.security.Key readKey(java.io.BufferedReader r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = r8.readLine()
        L4:
            java.lang.String r1 = "-----BEGIN "
            if (r0 == 0) goto L13
            boolean r2 = r0.startsWith(r1)
            if (r2 != 0) goto L13
            java.lang.String r0 = r8.readLine()
            goto L4
        L13:
            r2 = 0
            if (r0 != 0) goto L17
            return r2
        L17:
            java.lang.String r0 = r0.trim()
            int r1 = r1.length()
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = "-----"
            int r3 = r0.indexOf(r1)
            if (r3 >= 0) goto L2c
            return r2
        L2c:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "-----END "
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L49:
            java.lang.String r5 = r8.readLine()
            if (r5 == 0) goto L63
            java.lang.String r6 = ":"
            int r6 = r5.indexOf(r6)
            if (r6 <= 0) goto L58
            goto L49
        L58:
            boolean r6 = r5.contains(r1)
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            r3.append(r5)
            goto L49
        L63:
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L85
            byte[] r8 = com.google.crypto.tink.subtle.Base64.decode(r8, r4)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "PUBLIC KEY"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L78
            java.security.Key r8 = r7.getPublicKey(r8)     // Catch: java.lang.Throwable -> L85
            return r8
        L78:
            java.lang.String r1 = "PRIVATE KEY"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L85
            java.security.Key r8 = r7.getPrivateKey(r8)     // Catch: java.lang.Throwable -> L85
            return r8
        L85:
            return r2
    }
}
