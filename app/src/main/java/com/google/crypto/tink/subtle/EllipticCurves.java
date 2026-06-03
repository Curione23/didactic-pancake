package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class EllipticCurves {

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.EllipticCurves$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = r0
                r1 = 1
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r4 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = r3
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r4 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType     // Catch: java.lang.NoSuchFieldError -> L4d
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                return
        }
    }

    public enum CurveType extends java.lang.Enum<com.google.crypto.tink.subtle.EllipticCurves.CurveType> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.EllipticCurves.CurveType[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.CurveType NIST_P256 = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.CurveType NIST_P384 = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.CurveType NIST_P521 = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = new com.google.crypto.tink.subtle.EllipticCurves$CurveType
                java.lang.String r1 = "NIST_P256"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256 = r0
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = new com.google.crypto.tink.subtle.EllipticCurves$CurveType
                java.lang.String r2 = "NIST_P384"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384 = r1
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = new com.google.crypto.tink.subtle.EllipticCurves$CurveType
                java.lang.String r3 = "NIST_P521"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521 = r2
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = new com.google.crypto.tink.subtle.EllipticCurves.CurveType[]{r0, r1, r2}
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.$VALUES = r0
                return
        }

        CurveType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.CurveType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.EllipticCurves$CurveType> r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = (com.google.crypto.tink.subtle.EllipticCurves.CurveType) r1
                return r1
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.CurveType[] values() {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = (com.google.crypto.tink.subtle.EllipticCurves.CurveType[]) r0
                return r0
        }
    }

    public enum EcdsaEncoding extends java.lang.Enum<com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding DER = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding IEEE_P1363 = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = new com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding
                java.lang.String r1 = "IEEE_P1363"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363 = r0
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r1 = new com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding
                java.lang.String r2 = "DER"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.DER = r1
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding[] r0 = new com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[]{r0, r1}
                com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.$VALUES = r0
                return
        }

        EcdsaEncoding(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding> r0 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r1 = (com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding) r1
                return r1
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[] values() {
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding[] r0 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding[] r0 = (com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[]) r0
                return r0
        }
    }

    public enum PointFormatType extends java.lang.Enum<com.google.crypto.tink.subtle.EllipticCurves.PointFormatType> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType COMPRESSED = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType DO_NOT_USE_CRUNCHY_UNCOMPRESSED = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType UNCOMPRESSED = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = new com.google.crypto.tink.subtle.EllipticCurves$PointFormatType
                java.lang.String r1 = "UNCOMPRESSED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED = r0
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = new com.google.crypto.tink.subtle.EllipticCurves$PointFormatType
                java.lang.String r2 = "COMPRESSED"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED = r1
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r2 = new com.google.crypto.tink.subtle.EllipticCurves$PointFormatType
                java.lang.String r3 = "DO_NOT_USE_CRUNCHY_UNCOMPRESSED"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED = r2
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r0 = new com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[]{r0, r1, r2}
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.$VALUES = r0
                return
        }

        PointFormatType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.PointFormatType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.EllipticCurves$PointFormatType> r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = (com.google.crypto.tink.subtle.EllipticCurves.PointFormatType) r1
                return r1
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[] values() {
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r0 = (com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[]) r0
                return r0
        }
    }

    private EllipticCurves() {
            r0 = this;
            r0.<init>()
            return
    }

    static void checkPublicKey(java.security.interfaces.ECPublicKey r1) throws java.security.GeneralSecurityException {
            java.security.spec.ECPoint r0 = r1.getW()
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r0, r1)
            return
    }

    public static byte[] computeSharedSecret(java.security.interfaces.ECPrivateKey r0, java.security.interfaces.ECPublicKey r1) throws java.security.GeneralSecurityException {
            validatePublicKeySpec(r1, r0)
            java.security.spec.ECPoint r1 = r1.getW()
            byte[] r0 = computeSharedSecret(r0, r1)
            return r0
    }

    public static byte[] computeSharedSecret(java.security.interfaces.ECPrivateKey r2, java.security.spec.ECPoint r3) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = r2.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r3, r0)
            java.security.spec.ECParameterSpec r0 = r2.getParams()
            java.security.spec.ECPublicKeySpec r1 = new java.security.spec.ECPublicKeySpec
            r1.<init>(r3, r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r3 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r0 = "EC"
            java.lang.Object r3 = r3.getInstance(r0)
            java.security.KeyFactory r3 = (java.security.KeyFactory) r3
            java.security.PublicKey r3 = r3.generatePublic(r1)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyAgreement, javax.crypto.KeyAgreement> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_AGREEMENT
            java.lang.String r1 = "ECDH"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.KeyAgreement r0 = (javax.crypto.KeyAgreement) r0
            r0.init(r2)
            r1 = 1
            r0.doPhase(r3, r1)     // Catch: java.lang.IllegalStateException -> L3b
            byte[] r3 = r0.generateSecret()     // Catch: java.lang.IllegalStateException -> L3b
            validateSharedSecret(r3, r2)     // Catch: java.lang.IllegalStateException -> L3b
            return r3
        L3b:
            r2 = move-exception
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
    }

    public static java.security.spec.ECPoint ecPointDecode(java.security.spec.EllipticCurve r0, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r1, byte[] r2) throws java.security.GeneralSecurityException {
            java.security.spec.ECPoint r0 = pointDecode(r0, r1, r2)
            return r0
    }

    public static byte[] ecdsaDer2Ieee(byte[] r8, int r9) throws java.security.GeneralSecurityException {
            boolean r0 = isValidDerEncoding(r8)
            if (r0 == 0) goto L41
            byte[] r0 = new byte[r9]
            r1 = 1
            r2 = r8[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 2
            if (r2 < r3) goto L14
            r2 = 3
            goto L15
        L14:
            r2 = r4
        L15:
            int r3 = r2 + 1
            int r2 = r2 + r4
            r3 = r8[r3]
            r4 = r8[r2]
            r5 = 0
            if (r4 != 0) goto L21
            r4 = r1
            goto L22
        L21:
            r4 = r5
        L22:
            int r6 = r2 + r4
            int r7 = r9 / 2
            int r7 = r7 - r3
            int r7 = r7 + r4
            int r4 = r3 - r4
            java.lang.System.arraycopy(r8, r6, r0, r7, r4)
            int r3 = r3 + r1
            int r2 = r2 + r3
            int r3 = r2 + 1
            r2 = r8[r2]
            r4 = r8[r3]
            if (r4 != 0) goto L38
            goto L39
        L38:
            r1 = r5
        L39:
            int r3 = r3 + r1
            int r9 = r9 - r2
            int r9 = r9 + r1
            int r2 = r2 - r1
            java.lang.System.arraycopy(r8, r3, r0, r9, r2)
            return r0
        L41:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "Invalid DER encoding"
            r8.<init>(r9)
            throw r8
    }

    public static byte[] ecdsaIeee2Der(byte[] r7) throws java.security.GeneralSecurityException {
            int r0 = r7.length
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L65
            int r0 = r7.length
            if (r0 == 0) goto L65
            int r0 = r7.length
            r2 = 132(0x84, float:1.85E-43)
            if (r0 > r2) goto L65
            int r0 = r7.length
            int r0 = r0 / r1
            byte[] r0 = java.util.Arrays.copyOf(r7, r0)
            byte[] r0 = toMinimalSignedNumber(r0)
            int r2 = r7.length
            int r2 = r2 / r1
            int r3 = r7.length
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r2, r3)
            byte[] r7 = toMinimalSignedNumber(r7)
            int r2 = r0.length
            int r2 = r2 + 4
            int r3 = r7.length
            int r2 = r2 + r3
            r3 = 128(0x80, float:1.8E-43)
            r4 = 48
            r5 = 0
            r6 = 1
            if (r2 < r3) goto L3e
            int r3 = r2 + 3
            byte[] r3 = new byte[r3]
            r3[r5] = r4
            r4 = -127(0xffffffffffffff81, float:NaN)
            r3[r6] = r4
            byte r2 = (byte) r2
            r3[r1] = r2
            r2 = 3
            goto L48
        L3e:
            int r3 = r2 + 2
            byte[] r3 = new byte[r3]
            r3[r5] = r4
            byte r2 = (byte) r2
            r3[r6] = r2
            r2 = r1
        L48:
            int r4 = r2 + 1
            r3[r2] = r1
            int r2 = r2 + r1
            int r6 = r0.length
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r5, r3, r2, r4)
            int r0 = r0.length
            int r2 = r2 + r0
            int r0 = r2 + 1
            r3[r2] = r1
            int r2 = r2 + r1
            int r1 = r7.length
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r7.length
            java.lang.System.arraycopy(r7, r5, r3, r2, r0)
            return r3
        L65:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Invalid IEEE_P1363 encoding"
            r7.<init>(r0)
            throw r7
    }

    public static int encodingSizeInBytes(java.security.spec.EllipticCurve r2, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r3) throws java.security.GeneralSecurityException {
            int r2 = fieldSizeInBytes(r2)
            int[] r0 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 2
            r1 = 1
            if (r3 == r1) goto L21
            if (r3 == r0) goto L1f
            r0 = 3
            if (r3 != r0) goto L17
            int r2 = r2 + r1
            return r2
        L17:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "unknown EC point format"
            r2.<init>(r3)
            throw r2
        L1f:
            int r2 = r2 * r0
            return r2
        L21:
            int r2 = r2 * r0
            int r2 = r2 + r1
            return r2
    }

    public static int fieldSizeInBits(java.security.spec.EllipticCurve r1) throws java.security.GeneralSecurityException {
            java.math.BigInteger r1 = getModulus(r1)
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.subtract(r0)
            int r1 = r1.bitLength()
            return r1
    }

    public static int fieldSizeInBytes(java.security.spec.EllipticCurve r0) throws java.security.GeneralSecurityException {
            int r0 = fieldSizeInBits(r0)
            int r0 = r0 + 7
            int r0 = r0 / 8
            return r0
    }

    public static java.security.KeyPair generateKeyPair(com.google.crypto.tink.subtle.EllipticCurves.CurveType r0) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r0)
            java.security.KeyPair r0 = generateKeyPair(r0)
            return r0
    }

    public static java.security.KeyPair generateKeyPair(java.security.spec.ECParameterSpec r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyPairGenerator, java.security.KeyPairGenerator> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_PAIR_GENERATOR
            java.lang.String r1 = "EC"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyPairGenerator r0 = (java.security.KeyPairGenerator) r0
            r0.initialize(r2)
            java.security.KeyPair r2 = r0.generateKeyPair()
            return r2
    }

    public static java.security.spec.ECParameterSpec getCurveSpec(com.google.crypto.tink.subtle.EllipticCurves.CurveType r3) throws java.security.NoSuchAlgorithmException {
            int[] r0 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 != r1) goto L16
            java.security.spec.ECParameterSpec r3 = getNistP521Params()
            return r3
        L16:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "curve not implemented:"
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            java.security.spec.ECParameterSpec r3 = getNistP384Params()
            return r3
        L30:
            java.security.spec.ECParameterSpec r3 = getNistP256Params()
            return r3
    }

    public static java.security.interfaces.ECPrivateKey getEcPrivateKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType r1, byte[] r2) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r1 = getCurveSpec(r1)
            java.math.BigInteger r2 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r2)
            java.security.spec.ECPrivateKeySpec r0 = new java.security.spec.ECPrivateKeySpec
            r0.<init>(r2, r1)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r1 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r2 = "EC"
            java.lang.Object r1 = r1.getInstance(r2)
            java.security.KeyFactory r1 = (java.security.KeyFactory) r1
            java.security.PrivateKey r1 = r1.generatePrivate(r0)
            java.security.interfaces.ECPrivateKey r1 = (java.security.interfaces.ECPrivateKey) r1
            return r1
    }

    public static java.security.interfaces.ECPrivateKey getEcPrivateKey(byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "EC"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.PKCS8EncodedKeySpec r1 = new java.security.spec.PKCS8EncodedKeySpec
            r1.<init>(r2)
            java.security.PrivateKey r2 = r0.generatePrivate(r1)
            java.security.interfaces.ECPrivateKey r2 = (java.security.interfaces.ECPrivateKey) r2
            return r2
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType r0, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r1, byte[] r2) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r0)
            java.security.interfaces.ECPublicKey r0 = getEcPublicKey(r0, r1, r2)
            return r0
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType r2, byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r2 = getCurveSpec(r2)
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            r0.<init>(r1, r3)
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r1, r4)
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint
            r4.<init>(r0, r3)
            java.security.spec.EllipticCurve r3 = r2.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r4, r3)
            java.security.spec.ECPublicKeySpec r3 = new java.security.spec.ECPublicKeySpec
            r3.<init>(r4, r2)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r2 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r4 = "EC"
            java.lang.Object r2 = r2.getInstance(r4)
            java.security.KeyFactory r2 = (java.security.KeyFactory) r2
            java.security.PublicKey r2 = r2.generatePublic(r3)
            java.security.interfaces.ECPublicKey r2 = (java.security.interfaces.ECPublicKey) r2
            return r2
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(java.security.spec.ECParameterSpec r1, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r2, byte[] r3) throws java.security.GeneralSecurityException {
            java.security.spec.EllipticCurve r0 = r1.getCurve()
            java.security.spec.ECPoint r2 = pointDecode(r0, r2, r3)
            java.security.spec.ECPublicKeySpec r3 = new java.security.spec.ECPublicKeySpec
            r3.<init>(r2, r1)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r1 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r2 = "EC"
            java.lang.Object r1 = r1.getInstance(r2)
            java.security.KeyFactory r1 = (java.security.KeyFactory) r1
            java.security.PublicKey r1 = r1.generatePublic(r3)
            java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1
            return r1
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "EC"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r2)
            java.security.PublicKey r2 = r0.generatePublic(r1)
            java.security.interfaces.ECPublicKey r2 = (java.security.interfaces.ECPublicKey) r2
            return r2
    }

    public static java.math.BigInteger getModulus(java.security.spec.EllipticCurve r0) throws java.security.GeneralSecurityException {
            java.math.BigInteger r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.getModulus(r0)
            return r0
    }

    public static java.security.spec.ECParameterSpec getNistP256Params() {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS
            return r0
    }

    public static java.security.spec.ECParameterSpec getNistP384Params() {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS
            return r0
    }

    public static java.security.spec.ECParameterSpec getNistP521Params() {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS
            return r0
    }

    public static java.math.BigInteger getY(java.math.BigInteger r3, boolean r4, java.security.spec.EllipticCurve r5) throws java.security.GeneralSecurityException {
            java.math.BigInteger r0 = getModulus(r5)
            java.math.BigInteger r1 = r5.getA()
            java.math.BigInteger r5 = r5.getB()
            java.math.BigInteger r2 = r3.multiply(r3)
            java.math.BigInteger r1 = r2.add(r1)
            java.math.BigInteger r3 = r1.multiply(r3)
            java.math.BigInteger r3 = r3.add(r5)
            java.math.BigInteger r3 = r3.mod(r0)
            java.math.BigInteger r3 = modSqrt(r3, r0)
            r5 = 0
            boolean r5 = r3.testBit(r5)
            if (r4 == r5) goto L33
            java.math.BigInteger r3 = r0.subtract(r3)
            java.math.BigInteger r3 = r3.mod(r0)
        L33:
            return r3
    }

    public static boolean isNistEcParameterSpec(java.security.spec.ECParameterSpec r0) {
            boolean r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.isNistEcParameterSpec(r0)
            return r0
    }

    public static boolean isSameEcParameterSpec(java.security.spec.ECParameterSpec r0, java.security.spec.ECParameterSpec r1) {
            boolean r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(r0, r1)
            return r0
    }

    public static boolean isValidDerEncoding(byte[] r11) {
            int r0 = r11.length
            r1 = 8
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r11[r2]
            r1 = 48
            if (r0 == r1) goto Le
            return r2
        Le:
            r0 = 1
            r1 = r11[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 129(0x81, float:1.81E-43)
            r4 = 2
            r5 = 128(0x80, float:1.8E-43)
            if (r1 != r3) goto L23
            r1 = r11[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 >= r5) goto L21
            return r2
        L21:
            r3 = r4
            goto L29
        L23:
            if (r1 == r5) goto L8a
            if (r1 <= r3) goto L28
            goto L8a
        L28:
            r3 = r0
        L29:
            int r6 = r11.length
            int r6 = r6 - r0
            int r6 = r6 - r3
            if (r1 == r6) goto L2f
            return r2
        L2f:
            int r1 = r3 + 1
            r1 = r11[r1]
            if (r1 == r4) goto L36
            return r2
        L36:
            int r1 = r3 + 2
            r1 = r11[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r6 = r3 + 3
            int r6 = r6 + r1
            int r7 = r6 + 1
            int r8 = r11.length
            if (r7 < r8) goto L45
            return r2
        L45:
            if (r1 != 0) goto L48
            return r2
        L48:
            int r8 = r3 + 3
            r9 = r11[r8]
            r10 = r9 & 255(0xff, float:3.57E-43)
            if (r10 < r5) goto L51
            return r2
        L51:
            if (r1 <= r0) goto L5e
            if (r9 != 0) goto L5e
            int r9 = r3 + 4
            r9 = r11[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 >= r5) goto L5e
            return r2
        L5e:
            int r8 = r8 + r1
            r8 = r11[r8]
            if (r8 == r4) goto L64
            return r2
        L64:
            r7 = r11[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r4
            int r6 = r6 + r7
            int r4 = r11.length
            if (r6 == r4) goto L6e
            return r2
        L6e:
            if (r7 != 0) goto L71
            return r2
        L71:
            int r4 = r3 + 5
            int r4 = r4 + r1
            r4 = r11[r4]
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 < r5) goto L7b
            return r2
        L7b:
            if (r7 <= r0) goto L89
            if (r4 != 0) goto L89
            int r3 = r3 + 6
            int r3 = r3 + r1
            r11 = r11[r3]
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 >= r5) goto L89
            return r2
        L89:
            return r0
        L8a:
            return r2
    }

    protected static java.math.BigInteger modSqrt(java.math.BigInteger r8, java.math.BigInteger r9) throws java.security.GeneralSecurityException {
            int r0 = r9.signum()
            r1 = 1
            if (r0 != r1) goto L119
            java.math.BigInteger r8 = r8.mod(r9)
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L16
            java.math.BigInteger r8 = java.math.BigInteger.ZERO
            return r8
        L16:
            r0 = 0
            boolean r2 = r9.testBit(r0)
            r3 = 2
            if (r2 == 0) goto L34
            boolean r2 = r9.testBit(r1)
            if (r2 == 0) goto L34
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r9.add(r0)
            java.math.BigInteger r0 = r0.shiftRight(r3)
            java.math.BigInteger r0 = r8.modPow(r0, r9)
            goto Lff
        L34:
            boolean r2 = r9.testBit(r0)
            if (r2 == 0) goto Lfe
            boolean r2 = r9.testBit(r1)
            if (r2 != 0) goto Lfe
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            java.math.BigInteger r4 = r9.subtract(r4)
            java.math.BigInteger r4 = r4.shiftRight(r1)
        L4c:
            java.math.BigInteger r5 = r2.multiply(r2)
            java.math.BigInteger r5 = r5.subtract(r8)
            java.math.BigInteger r5 = r5.mod(r9)
            java.math.BigInteger r6 = java.math.BigInteger.ZERO
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L61
            return r2
        L61:
            java.math.BigInteger r6 = r5.modPow(r4, r9)
            java.math.BigInteger r7 = java.math.BigInteger.ONE
            java.math.BigInteger r7 = r6.add(r7)
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto Ld3
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r9.add(r0)
            java.math.BigInteger r0 = r0.shiftRight(r1)
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            int r4 = r0.bitLength()
            int r4 = r4 - r3
            r3 = r1
            r1 = r2
        L84:
            if (r4 < 0) goto Ld1
            java.math.BigInteger r6 = r1.multiply(r3)
            java.math.BigInteger r1 = r1.multiply(r1)
            java.math.BigInteger r3 = r3.multiply(r3)
            java.math.BigInteger r3 = r3.mod(r9)
            java.math.BigInteger r3 = r3.multiply(r5)
            java.math.BigInteger r1 = r1.add(r3)
            java.math.BigInteger r1 = r1.mod(r9)
            java.math.BigInteger r3 = r6.add(r6)
            java.math.BigInteger r3 = r3.mod(r9)
            boolean r6 = r0.testBit(r4)
            if (r6 == 0) goto Lce
            java.math.BigInteger r6 = r1.multiply(r2)
            java.math.BigInteger r7 = r3.multiply(r5)
            java.math.BigInteger r6 = r6.add(r7)
            java.math.BigInteger r6 = r6.mod(r9)
            java.math.BigInteger r3 = r2.multiply(r3)
            java.math.BigInteger r1 = r3.add(r1)
            java.math.BigInteger r1 = r1.mod(r9)
            r3 = r1
            r1 = r6
        Lce:
            int r4 = r4 + (-1)
            goto L84
        Ld1:
            r0 = r1
            goto Lff
        Ld3:
            java.math.BigInteger r5 = java.math.BigInteger.ONE
            boolean r5 = r6.equals(r5)
            java.lang.String r6 = "p is not prime"
            if (r5 == 0) goto Lf8
            java.math.BigInteger r5 = java.math.BigInteger.ONE
            java.math.BigInteger r2 = r2.add(r5)
            int r0 = r0 + r1
            r5 = 128(0x80, float:1.8E-43)
            if (r0 != r5) goto L4c
            r5 = 80
            boolean r5 = r9.isProbablePrime(r5)
            if (r5 == 0) goto Lf2
            goto L4c
        Lf2:
            java.security.InvalidAlgorithmParameterException r8 = new java.security.InvalidAlgorithmParameterException
            r8.<init>(r6)
            throw r8
        Lf8:
            java.security.InvalidAlgorithmParameterException r8 = new java.security.InvalidAlgorithmParameterException
            r8.<init>(r6)
            throw r8
        Lfe:
            r0 = 0
        Lff:
            if (r0 == 0) goto L118
            java.math.BigInteger r1 = r0.multiply(r0)
            java.math.BigInteger r9 = r1.mod(r9)
            int r8 = r9.compareTo(r8)
            if (r8 != 0) goto L110
            goto L118
        L110:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "Could not find a modular square root"
            r8.<init>(r9)
            throw r8
        L118:
            return r0
        L119:
            java.security.InvalidAlgorithmParameterException r8 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r9 = "p must be positive"
            r8.<init>(r9)
            throw r8
    }

    public static java.security.spec.ECPoint pointDecode(com.google.crypto.tink.subtle.EllipticCurves.CurveType r0, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r1, byte[] r2) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r0)
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            java.security.spec.ECPoint r0 = pointDecode(r0, r1, r2)
            return r0
    }

    public static java.security.spec.ECPoint pointDecode(java.security.spec.EllipticCurve r6, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r7, byte[] r8) throws java.security.GeneralSecurityException {
            int r0 = fieldSizeInBytes(r6)
            int[] r1 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType
            int r2 = r7.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "invalid point size"
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L9d
            r5 = 2
            if (r1 == r5) goto L76
            r2 = 3
            if (r1 != r2) goto L61
            java.math.BigInteger r7 = getModulus(r6)
            int r1 = r8.length
            int r0 = r0 + r4
            if (r1 != r0) goto L59
            r0 = r8[r3]
            if (r0 != r5) goto L25
            goto L28
        L25:
            if (r0 != r2) goto L51
            r3 = r4
        L28:
            java.math.BigInteger r0 = new java.math.BigInteger
            int r1 = r8.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r4, r1)
            r0.<init>(r4, r8)
            int r8 = r0.signum()
            r1 = -1
            if (r8 == r1) goto L49
            int r7 = r0.compareTo(r7)
            if (r7 >= 0) goto L49
            java.math.BigInteger r6 = getY(r0, r3, r6)
            java.security.spec.ECPoint r7 = new java.security.spec.ECPoint
            r7.<init>(r0, r6)
            return r7
        L49:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "x is out of range"
            r6.<init>(r7)
            throw r6
        L51:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "invalid format"
            r6.<init>(r7)
            throw r6
        L59:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "compressed point has wrong length"
            r6.<init>(r7)
            throw r6
        L61:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "invalid format:"
            r8.<init>(r0)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L76:
            int r7 = r8.length
            int r1 = r0 * 2
            if (r7 != r1) goto L97
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r1 = java.util.Arrays.copyOfRange(r8, r3, r0)
            r7.<init>(r4, r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            int r2 = r8.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r0, r2)
            r1.<init>(r4, r8)
            java.security.spec.ECPoint r8 = new java.security.spec.ECPoint
            r8.<init>(r7, r1)
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r8, r6)
            return r8
        L97:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            r6.<init>(r2)
            throw r6
        L9d:
            int r7 = r8.length
            int r1 = r0 * 2
            int r1 = r1 + r4
            if (r7 != r1) goto Lcd
            r7 = r8[r3]
            r1 = 4
            if (r7 != r1) goto Lc5
            java.math.BigInteger r7 = new java.math.BigInteger
            int r0 = r0 + r4
            byte[] r1 = java.util.Arrays.copyOfRange(r8, r4, r0)
            r7.<init>(r4, r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            int r2 = r8.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r0, r2)
            r1.<init>(r4, r8)
            java.security.spec.ECPoint r8 = new java.security.spec.ECPoint
            r8.<init>(r7, r1)
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r8, r6)
            return r8
        Lc5:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "invalid point format"
            r6.<init>(r7)
            throw r6
        Lcd:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            r6.<init>(r2)
            throw r6
    }

    public static byte[] pointEncode(com.google.crypto.tink.subtle.EllipticCurves.CurveType r0, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r1, java.security.spec.ECPoint r2) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r0)
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            byte[] r0 = pointEncode(r0, r1, r2)
            return r0
    }

    public static byte[] pointEncode(java.security.spec.EllipticCurve r5, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r6, java.security.spec.ECPoint r7) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r7, r5)
            int r5 = fieldSizeInBytes(r5)
            int[] r0 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L83
            r3 = 2
            if (r0 == r3) goto L4e
            r4 = 3
            if (r0 != r4) goto L39
            int r5 = r5 + r1
            byte[] r6 = new byte[r5]
            java.math.BigInteger r0 = r7.getAffineX()
            byte[] r0 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r0)
            int r1 = r0.length
            int r5 = r5 - r1
            int r1 = r0.length
            java.lang.System.arraycopy(r0, r2, r6, r5, r1)
            java.math.BigInteger r5 = r7.getAffineY()
            boolean r5 = r5.testBit(r2)
            if (r5 == 0) goto L35
            r3 = r4
        L35:
            byte r5 = (byte) r3
            r6[r2] = r5
            return r6
        L39:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "invalid format:"
            r7.<init>(r0)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L4e:
            int r6 = r5 * 2
            byte[] r0 = new byte[r6]
            java.math.BigInteger r1 = r7.getAffineX()
            byte[] r1 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r1)
            int r3 = r1.length
            if (r3 <= r5) goto L64
            int r3 = r1.length
            int r3 = r3 - r5
            int r4 = r1.length
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r3, r4)
        L64:
            java.math.BigInteger r7 = r7.getAffineY()
            byte[] r7 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r7)
            int r3 = r7.length
            if (r3 <= r5) goto L76
            int r3 = r7.length
            int r3 = r3 - r5
            int r4 = r7.length
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r3, r4)
        L76:
            int r3 = r7.length
            int r6 = r6 - r3
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r6, r3)
            int r6 = r1.length
            int r5 = r5 - r6
            int r6 = r1.length
            java.lang.System.arraycopy(r1, r2, r0, r5, r6)
            return r0
        L83:
            int r6 = r5 * 2
            int r6 = r6 + r1
            byte[] r0 = new byte[r6]
            java.math.BigInteger r3 = r7.getAffineX()
            byte[] r3 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r3)
            java.math.BigInteger r7 = r7.getAffineY()
            byte[] r7 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r7)
            int r4 = r7.length
            int r6 = r6 - r4
            int r4 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r6, r4)
            int r5 = r5 + r1
            int r6 = r3.length
            int r5 = r5 - r6
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r2, r0, r5, r6)
            r5 = 4
            r0[r2] = r5
            return r0
    }

    private static byte[] toMinimalSignedNumber(byte[] r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.length
            if (r1 >= r2) goto Lc
            r2 = r5[r1]
            if (r2 != 0) goto Lc
            int r1 = r1 + 1
            goto L2
        Lc:
            int r2 = r5.length
            r3 = 1
            if (r1 != r2) goto L12
            int r1 = r5.length
            int r1 = r1 - r3
        L12:
            r2 = r5[r1]
            r4 = 128(0x80, float:1.8E-43)
            r2 = r2 & r4
            if (r2 != r4) goto L1a
            r0 = r3
        L1a:
            int r2 = r5.length
            int r2 = r2 - r1
            int r2 = r2 + r0
            byte[] r2 = new byte[r2]
            int r3 = r5.length
            int r3 = r3 - r1
            java.lang.System.arraycopy(r5, r1, r2, r0, r3)
            return r2
    }

    public static void validatePublicKey(java.security.interfaces.ECPublicKey r0, java.security.interfaces.ECPrivateKey r1) throws java.security.GeneralSecurityException {
            validatePublicKeySpec(r0, r1)
            java.security.spec.ECPoint r0 = r0.getW()
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r0, r1)
            return
    }

    static void validatePublicKeySpec(java.security.interfaces.ECPublicKey r0, java.security.interfaces.ECPrivateKey r1) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = r0.getParams()     // Catch: java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19
            java.security.spec.ECParameterSpec r1 = r1.getParams()     // Catch: java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19
            boolean r0 = isSameEcParameterSpec(r0, r1)     // Catch: java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19
            if (r0 == 0) goto Lf
            return
        Lf:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19
            java.lang.String r1 = "invalid public key spec"
            r0.<init>(r1)     // Catch: java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19
            throw r0     // Catch: java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19
        L17:
            r0 = move-exception
            goto L1a
        L19:
            r0 = move-exception
        L1a:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r0)
            throw r1
    }

    private static void validateSharedSecret(byte[] r3, java.security.interfaces.ECPrivateKey r4) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r4 = r4.getParams()
            java.security.spec.EllipticCurve r4 = r4.getCurve()
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            r0.<init>(r1, r3)
            int r3 = r0.signum()
            r2 = -1
            if (r3 == r2) goto L23
            java.math.BigInteger r3 = getModulus(r4)
            int r3 = r0.compareTo(r3)
            if (r3 >= 0) goto L23
            getY(r0, r1, r4)
            return
        L23:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "shared secret is out of range"
            r3.<init>(r4)
            throw r3
    }
}
