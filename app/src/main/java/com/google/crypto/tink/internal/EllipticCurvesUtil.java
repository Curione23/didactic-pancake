package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class EllipticCurvesUtil {
    private static final java.math.BigInteger EIGHT = null;
    private static final java.math.BigInteger FOUR = null;
    public static final java.security.spec.ECParameterSpec NIST_P256_PARAMS = null;
    public static final java.security.spec.ECParameterSpec NIST_P384_PARAMS = null;
    public static final java.security.spec.ECParameterSpec NIST_P521_PARAMS = null;
    private static final java.math.BigInteger THREE = null;
    private static final java.math.BigInteger TWO = null;

    static class JacobianEcPoint {
        static final com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint INFINITY = null;
        java.math.BigInteger x;
        java.math.BigInteger y;
        java.math.BigInteger z;

        static {
                com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r0 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
                java.math.BigInteger r1 = java.math.BigInteger.ONE
                java.math.BigInteger r2 = java.math.BigInteger.ONE
                java.math.BigInteger r3 = java.math.BigInteger.ZERO
                r0.<init>(r1, r2, r3)
                com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY = r0
                return
        }

        JacobianEcPoint(java.math.BigInteger r1, java.math.BigInteger r2, java.math.BigInteger r3) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.z = r3
                return
        }

        boolean isInfinity() {
                r2 = this;
                java.math.BigInteger r0 = r2.z
                java.math.BigInteger r1 = java.math.BigInteger.ZERO
                boolean r0 = r0.equals(r1)
                return r0
        }

        java.security.spec.ECPoint toECPoint(java.math.BigInteger r6) {
                r5 = this;
                boolean r0 = r5.isInfinity()
                if (r0 == 0) goto L9
                java.security.spec.ECPoint r6 = java.security.spec.ECPoint.POINT_INFINITY
                return r6
            L9:
                java.math.BigInteger r0 = r5.z
                java.math.BigInteger r0 = r0.modInverse(r6)
                java.math.BigInteger r1 = r0.multiply(r0)
                java.math.BigInteger r1 = r1.mod(r6)
                java.security.spec.ECPoint r2 = new java.security.spec.ECPoint
                java.math.BigInteger r3 = r5.x
                java.math.BigInteger r3 = r3.multiply(r1)
                java.math.BigInteger r3 = r3.mod(r6)
                java.math.BigInteger r4 = r5.y
                java.math.BigInteger r1 = r4.multiply(r1)
                java.math.BigInteger r1 = r1.mod(r6)
                java.math.BigInteger r0 = r1.multiply(r0)
                java.math.BigInteger r6 = r0.mod(r6)
                r2.<init>(r3, r6)
                return r2
        }
    }

    static {
            java.security.spec.ECParameterSpec r0 = getNistP256Params()
            com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS = r0
            java.security.spec.ECParameterSpec r0 = getNistP384Params()
            com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS = r0
            java.security.spec.ECParameterSpec r0 = getNistP521Params()
            com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS = r0
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.TWO = r0
            r0 = 3
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.THREE = r0
            r0 = 4
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.FOUR = r0
            r0 = 8
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.google.crypto.tink.internal.EllipticCurvesUtil.EIGHT = r0
            return
    }

    private EllipticCurvesUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint addJacobianPoints(com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint r9, com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint r10, java.math.BigInteger r11, java.math.BigInteger r12) {
            boolean r0 = r9.isInfinity()
            if (r0 == 0) goto L7
            return r10
        L7:
            boolean r0 = r10.isInfinity()
            if (r0 == 0) goto Le
            return r9
        Le:
            java.math.BigInteger r0 = r9.z
            java.math.BigInteger r1 = r9.z
            java.math.BigInteger r0 = r0.multiply(r1)
            java.math.BigInteger r0 = r0.mod(r12)
            java.math.BigInteger r1 = r10.z
            java.math.BigInteger r2 = r10.z
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r1 = r1.mod(r12)
            java.math.BigInteger r2 = r9.x
            java.math.BigInteger r2 = r2.multiply(r1)
            java.math.BigInteger r2 = r2.mod(r12)
            java.math.BigInteger r3 = r10.x
            java.math.BigInteger r3 = r3.multiply(r0)
            java.math.BigInteger r3 = r3.mod(r12)
            java.math.BigInteger r4 = r9.y
            java.math.BigInteger r5 = r10.z
            java.math.BigInteger r4 = r4.multiply(r5)
            java.math.BigInteger r4 = r4.mod(r12)
            java.math.BigInteger r4 = r4.multiply(r1)
            java.math.BigInteger r4 = r4.mod(r12)
            java.math.BigInteger r5 = r10.y
            java.math.BigInteger r6 = r9.z
            java.math.BigInteger r5 = r5.multiply(r6)
            java.math.BigInteger r5 = r5.mod(r12)
            java.math.BigInteger r5 = r5.multiply(r0)
            java.math.BigInteger r5 = r5.mod(r12)
            boolean r6 = r2.equals(r3)
            if (r6 == 0) goto L76
            boolean r10 = r4.equals(r5)
            if (r10 != 0) goto L71
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r9 = com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY
            return r9
        L71:
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r9 = doubleJacobianPoint(r9, r11, r12)
            return r9
        L76:
            java.math.BigInteger r11 = r3.subtract(r2)
            java.math.BigInteger r11 = r11.mod(r12)
            java.math.BigInteger r3 = com.google.crypto.tink.internal.EllipticCurvesUtil.FOUR
            java.math.BigInteger r3 = r11.multiply(r3)
            java.math.BigInteger r3 = r3.multiply(r11)
            java.math.BigInteger r3 = r3.mod(r12)
            java.math.BigInteger r6 = r11.multiply(r3)
            java.math.BigInteger r6 = r6.mod(r12)
            java.math.BigInteger r5 = r5.subtract(r4)
            java.math.BigInteger r7 = com.google.crypto.tink.internal.EllipticCurvesUtil.TWO
            java.math.BigInteger r5 = r5.multiply(r7)
            java.math.BigInteger r5 = r5.mod(r12)
            java.math.BigInteger r2 = r2.multiply(r3)
            java.math.BigInteger r2 = r2.mod(r12)
            java.math.BigInteger r3 = r5.multiply(r5)
            java.math.BigInteger r3 = r3.mod(r12)
            java.math.BigInteger r3 = r3.subtract(r6)
            java.math.BigInteger r8 = r2.multiply(r7)
            java.math.BigInteger r3 = r3.subtract(r8)
            java.math.BigInteger r3 = r3.mod(r12)
            java.math.BigInteger r2 = r2.subtract(r3)
            java.math.BigInteger r2 = r5.multiply(r2)
            java.math.BigInteger r4 = r4.multiply(r7)
            java.math.BigInteger r4 = r4.multiply(r6)
            java.math.BigInteger r2 = r2.subtract(r4)
            java.math.BigInteger r2 = r2.mod(r12)
            java.math.BigInteger r9 = r9.z
            java.math.BigInteger r10 = r10.z
            java.math.BigInteger r9 = r9.add(r10)
            java.math.BigInteger r9 = r9.multiply(r9)
            java.math.BigInteger r9 = r9.mod(r12)
            java.math.BigInteger r9 = r9.subtract(r0)
            java.math.BigInteger r9 = r9.subtract(r1)
            java.math.BigInteger r9 = r9.multiply(r11)
            java.math.BigInteger r9 = r9.mod(r12)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r10 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
            r10.<init>(r3, r2, r9)
            return r10
    }

    public static void checkPointOnCurve(java.security.spec.ECPoint r4, java.security.spec.EllipticCurve r5) throws java.security.GeneralSecurityException {
            java.math.BigInteger r0 = getModulus(r5)
            java.math.BigInteger r1 = r4.getAffineX()
            java.math.BigInteger r4 = r4.getAffineY()
            if (r1 == 0) goto L6c
            if (r4 == 0) goto L6c
            int r2 = r1.signum()
            r3 = -1
            if (r2 == r3) goto L64
            int r2 = r1.compareTo(r0)
            if (r2 >= 0) goto L64
            int r2 = r4.signum()
            if (r2 == r3) goto L5c
            int r2 = r4.compareTo(r0)
            if (r2 >= 0) goto L5c
            java.math.BigInteger r4 = r4.multiply(r4)
            java.math.BigInteger r4 = r4.mod(r0)
            java.math.BigInteger r2 = r1.multiply(r1)
            java.math.BigInteger r3 = r5.getA()
            java.math.BigInteger r2 = r2.add(r3)
            java.math.BigInteger r1 = r2.multiply(r1)
            java.math.BigInteger r5 = r5.getB()
            java.math.BigInteger r5 = r1.add(r5)
            java.math.BigInteger r5 = r5.mod(r0)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L54
            return
        L54:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Point is not on curve"
            r4.<init>(r5)
            throw r4
        L5c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "y is out of range"
            r4.<init>(r5)
            throw r4
        L64:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "x is out of range"
            r4.<init>(r5)
            throw r4
        L6c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "point is at infinity"
            r4.<init>(r5)
            throw r4
    }

    static com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint doubleJacobianPoint(com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint r7, java.math.BigInteger r8, java.math.BigInteger r9) {
            java.math.BigInteger r0 = r7.y
            java.math.BigInteger r1 = java.math.BigInteger.ZERO
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r7 = com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY
            return r7
        Ld:
            java.math.BigInteger r0 = r7.x
            java.math.BigInteger r1 = r7.x
            java.math.BigInteger r0 = r0.multiply(r1)
            java.math.BigInteger r0 = r0.mod(r9)
            java.math.BigInteger r1 = r7.y
            java.math.BigInteger r2 = r7.y
            java.math.BigInteger r1 = r1.multiply(r2)
            java.math.BigInteger r1 = r1.mod(r9)
            java.math.BigInteger r2 = r1.multiply(r1)
            java.math.BigInteger r2 = r2.mod(r9)
            java.math.BigInteger r3 = r7.z
            java.math.BigInteger r4 = r7.z
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r3 = r3.mod(r9)
            java.math.BigInteger r4 = r7.x
            java.math.BigInteger r4 = r4.add(r1)
            java.math.BigInteger r4 = r4.multiply(r4)
            java.math.BigInteger r4 = r4.mod(r9)
            java.math.BigInteger r4 = r4.subtract(r0)
            java.math.BigInteger r4 = r4.subtract(r2)
            java.math.BigInteger r5 = com.google.crypto.tink.internal.EllipticCurvesUtil.TWO
            java.math.BigInteger r4 = r4.multiply(r5)
            java.math.BigInteger r6 = com.google.crypto.tink.internal.EllipticCurvesUtil.THREE
            java.math.BigInteger r0 = r0.multiply(r6)
            java.math.BigInteger r8 = r8.multiply(r3)
            java.math.BigInteger r8 = r8.multiply(r3)
            java.math.BigInteger r8 = r8.mod(r9)
            java.math.BigInteger r8 = r0.add(r8)
            java.math.BigInteger r0 = r8.multiply(r8)
            java.math.BigInteger r0 = r0.mod(r9)
            java.math.BigInteger r5 = r4.multiply(r5)
            java.math.BigInteger r0 = r0.subtract(r5)
            java.math.BigInteger r0 = r0.mod(r9)
            java.math.BigInteger r4 = r4.subtract(r0)
            java.math.BigInteger r8 = r8.multiply(r4)
            java.math.BigInteger r8 = r8.mod(r9)
            java.math.BigInteger r4 = com.google.crypto.tink.internal.EllipticCurvesUtil.EIGHT
            java.math.BigInteger r2 = r2.multiply(r4)
            java.math.BigInteger r8 = r8.subtract(r2)
            java.math.BigInteger r8 = r8.mod(r9)
            java.math.BigInteger r2 = r7.y
            java.math.BigInteger r7 = r7.z
            java.math.BigInteger r7 = r2.add(r7)
            java.math.BigInteger r7 = r7.multiply(r7)
            java.math.BigInteger r7 = r7.mod(r9)
            java.math.BigInteger r7 = r7.subtract(r1)
            java.math.BigInteger r7 = r7.subtract(r3)
            java.math.BigInteger r7 = r7.mod(r9)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r9 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
            r9.<init>(r0, r8, r7)
            return r9
    }

    public static java.math.BigInteger getModulus(java.security.spec.EllipticCurve r1) throws java.security.GeneralSecurityException {
            java.security.spec.ECField r1 = r1.getField()
            boolean r0 = r1 instanceof java.security.spec.ECFieldFp
            if (r0 == 0) goto Lf
            java.security.spec.ECFieldFp r1 = (java.security.spec.ECFieldFp) r1
            java.math.BigInteger r1 = r1.getP()
            return r1
        Lf:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Only curves over prime order fields are supported"
            r1.<init>(r0)
            throw r1
    }

    private static java.security.spec.ECParameterSpec getNistCurveSpec(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r3)
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r4)
            java.math.BigInteger r4 = new java.math.BigInteger
            java.lang.String r1 = "3"
            r4.<init>(r1)
            java.math.BigInteger r4 = r0.subtract(r4)
            java.math.BigInteger r1 = new java.math.BigInteger
            r2 = 16
            r1.<init>(r5, r2)
            java.math.BigInteger r5 = new java.math.BigInteger
            r5.<init>(r6, r2)
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r7, r2)
            java.security.spec.ECFieldFp r7 = new java.security.spec.ECFieldFp
            r7.<init>(r0)
            java.security.spec.EllipticCurve r0 = new java.security.spec.EllipticCurve
            r0.<init>(r7, r4, r1)
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint
            r4.<init>(r5, r6)
            java.security.spec.ECParameterSpec r5 = new java.security.spec.ECParameterSpec
            r6 = 1
            r5.<init>(r0, r4, r3, r6)
            return r5
    }

    private static java.security.spec.ECParameterSpec getNistP256Params() {
            java.lang.String r0 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296"
            java.lang.String r1 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5"
            java.lang.String r2 = "115792089210356248762697446949407573530086143415290314195533631308867097853951"
            java.lang.String r3 = "115792089210356248762697446949407573529996955224135760342422259061068512044369"
            java.lang.String r4 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b"
            java.security.spec.ECParameterSpec r0 = getNistCurveSpec(r2, r3, r4, r0, r1)
            return r0
    }

    private static java.security.spec.ECParameterSpec getNistP384Params() {
            java.lang.String r0 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7"
            java.lang.String r1 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f"
            java.lang.String r2 = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319"
            java.lang.String r3 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643"
            java.lang.String r4 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef"
            java.security.spec.ECParameterSpec r0 = getNistCurveSpec(r2, r3, r4, r0, r1)
            return r0
    }

    private static java.security.spec.ECParameterSpec getNistP521Params() {
            java.lang.String r0 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66"
            java.lang.String r1 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650"
            java.lang.String r2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151"
            java.lang.String r3 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449"
            java.lang.String r4 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00"
            java.security.spec.ECParameterSpec r0 = getNistCurveSpec(r2, r3, r4, r0, r1)
            return r0
    }

    public static boolean isNistEcParameterSpec(java.security.spec.ECParameterSpec r1) {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS
            boolean r0 = isSameEcParameterSpec(r1, r0)
            if (r0 != 0) goto L1b
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS
            boolean r0 = isSameEcParameterSpec(r1, r0)
            if (r0 != 0) goto L1b
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS
            boolean r1 = isSameEcParameterSpec(r1, r0)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            return r1
    }

    public static boolean isSameEcParameterSpec(java.security.spec.ECParameterSpec r2, java.security.spec.ECParameterSpec r3) {
            java.security.spec.EllipticCurve r0 = r2.getCurve()
            java.security.spec.EllipticCurve r1 = r3.getCurve()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.security.spec.ECPoint r0 = r2.getGenerator()
            java.security.spec.ECPoint r1 = r3.getGenerator()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.math.BigInteger r0 = r2.getOrder()
            java.math.BigInteger r1 = r3.getOrder()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            int r2 = r2.getCofactor()
            int r3 = r3.getCofactor()
            if (r2 != r3) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            return r2
    }

    public static java.security.spec.ECPoint multiplyByGenerator(java.math.BigInteger r6, java.security.spec.ECParameterSpec r7) throws java.security.GeneralSecurityException {
            boolean r0 = isNistEcParameterSpec(r7)
            if (r0 == 0) goto L70
            int r0 = r6.signum()
            r1 = 1
            if (r0 != r1) goto L68
            java.math.BigInteger r0 = r7.getOrder()
            int r0 = r6.compareTo(r0)
            if (r0 >= 0) goto L60
            java.security.spec.EllipticCurve r0 = r7.getCurve()
            java.security.spec.ECPoint r1 = r7.getGenerator()
            checkPointOnCurve(r1, r0)
            java.security.spec.EllipticCurve r7 = r7.getCurve()
            java.math.BigInteger r7 = r7.getA()
            java.math.BigInteger r2 = getModulus(r0)
            java.security.spec.ECPoint r3 = java.security.spec.ECPoint.POINT_INFINITY
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r3 = toJacobianEcPoint(r3, r2)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r1 = toJacobianEcPoint(r1, r2)
            int r4 = r6.bitLength()
        L3c:
            if (r4 < 0) goto L58
            boolean r5 = r6.testBit(r4)
            if (r5 == 0) goto L4d
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r3 = addJacobianPoints(r3, r1, r7, r2)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r1 = doubleJacobianPoint(r1, r7, r2)
            goto L55
        L4d:
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r1 = addJacobianPoints(r3, r1, r7, r2)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r3 = doubleJacobianPoint(r3, r7, r2)
        L55:
            int r4 = r4 + (-1)
            goto L3c
        L58:
            java.security.spec.ECPoint r6 = r3.toECPoint(r2)
            checkPointOnCurve(r6, r0)
            return r6
        L60:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "k must be smaller than the order of the generator"
            r6.<init>(r7)
            throw r6
        L68:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "k must be positive"
            r6.<init>(r7)
            throw r6
        L70:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "spec must be NIST P256, P384 or P521"
            r6.<init>(r7)
            throw r6
    }

    static com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint toJacobianEcPoint(java.security.spec.ECPoint r5, java.math.BigInteger r6) {
            java.security.spec.ECPoint r0 = java.security.spec.ECPoint.POINT_INFINITY
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r5 = com.google.crypto.tink.internal.EllipticCurvesUtil.JacobianEcPoint.INFINITY
            return r5
        Lb:
            java.math.BigInteger r0 = new java.math.BigInteger
            int r1 = r6.bitLength()
            int r1 = r1 + 8
            int r1 = r1 / 8
            byte[] r1 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            r2 = 1
            r0.<init>(r2, r1)
            java.math.BigInteger r0 = r0.mod(r6)
            java.math.BigInteger r1 = r0.multiply(r0)
            java.math.BigInteger r1 = r1.mod(r6)
            java.math.BigInteger r2 = r1.multiply(r0)
            java.math.BigInteger r2 = r2.mod(r6)
            com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint r3 = new com.google.crypto.tink.internal.EllipticCurvesUtil$JacobianEcPoint
            java.math.BigInteger r4 = r5.getAffineX()
            java.math.BigInteger r1 = r4.multiply(r1)
            java.math.BigInteger r1 = r1.mod(r6)
            java.math.BigInteger r5 = r5.getAffineY()
            java.math.BigInteger r5 = r5.multiply(r2)
            java.math.BigInteger r5 = r5.mod(r6)
            r3.<init>(r1, r5, r0)
            return r3
    }
}
