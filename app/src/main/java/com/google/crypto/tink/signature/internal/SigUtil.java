package com.google.crypto.tink.signature.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class SigUtil {
    static final java.lang.String INVALID_PARAMS = "Invalid ECDSA parameters";

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.internal.SigUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                r1 = 1
                com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.google.crypto.tink.proto.EllipticCurveType[] r3 = com.google.crypto.tink.proto.EllipticCurveType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = r3
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L4d
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L4d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                com.google.crypto.tink.proto.EcdsaSignatureEncoding[] r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = r2
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER     // Catch: java.lang.NoSuchFieldError -> L5e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L5e
            L5e:
                int[] r1 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding     // Catch: java.lang.NoSuchFieldError -> L68
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363     // Catch: java.lang.NoSuchFieldError -> L68
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L68
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L68
            L68:
                return
        }
    }

    private SigUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            return r3
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown curve type: "
            r1.<init>(r2)
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            return r3
        L30:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            return r3
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding toEcdsaEncoding(com.google.crypto.tink.proto.EcdsaSignatureEncoding r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 != r1) goto L11
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r3 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
            return r3
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown ECDSA encoding: "
            r1.<init>(r2)
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2a:
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r3 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.DER
            return r3
    }

    public static com.google.crypto.tink.subtle.Enums.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            return r3
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unsupported hash type: "
            r1.<init>(r2)
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2d:
            com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
            return r3
        L30:
            com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            return r3
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString toUnsignedIntByteString(java.math.BigInteger r2) {
            byte[] r2 = r2.toByteArray()
            r0 = 0
            r0 = r2[r0]
            if (r0 != 0) goto L11
            int r0 = r2.length
            r1 = 1
            int r0 = r0 - r1
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2, r1, r0)
            return r2
        L11:
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            return r2
    }

    public static void validateEcdsaParams(com.google.crypto.tink.proto.EcdsaParams r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = r4.getEncoding()
            com.google.crypto.tink.proto.HashType r1 = r4.getHashType()
            com.google.crypto.tink.proto.EllipticCurveType r4 = r4.getCurve()
            int[] r2 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L23
            if (r0 != r2) goto L1b
            goto L23
        L1b:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unsupported signature encoding"
            r4.<init>(r0)
            throw r4
        L23:
            int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r4 = r4.ordinal()
            r4 = r0[r4]
            java.lang.String r0 = "Invalid ECDSA parameters"
            if (r4 == r3) goto L54
            if (r4 == r2) goto L45
            r2 = 3
            if (r4 != r2) goto L3f
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA512
            if (r1 != r4) goto L39
            goto L58
        L39:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            r4.<init>(r0)
            throw r4
        L3f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            r4.<init>(r0)
            throw r4
        L45:
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA384
            if (r1 == r4) goto L58
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA512
            if (r1 != r4) goto L4e
            goto L58
        L4e:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            r4.<init>(r0)
            throw r4
        L54:
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA256
            if (r1 != r4) goto L59
        L58:
            return
        L59:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            r4.<init>(r0)
            throw r4
    }

    public static void validateRsaSsaPkcs1Params(com.google.crypto.tink.proto.RsaSsaPkcs1Params r0) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HashType r0 = r0.getHashType()
            toHashType(r0)
            return
    }

    public static void validateRsaSsaPssParams(com.google.crypto.tink.proto.RsaSsaPssParams r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HashType r0 = r2.getSigHash()
            toHashType(r0)
            com.google.crypto.tink.proto.HashType r0 = r2.getSigHash()
            com.google.crypto.tink.proto.HashType r1 = r2.getMgf1Hash()
            if (r0 != r1) goto L20
            int r2 = r2.getSaltLength()
            if (r2 < 0) goto L18
            return
        L18:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "salt length is negative"
            r2.<init>(r0)
            throw r2
        L20:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "MGF1 hash is different from signature hash"
            r2.<init>(r0)
            throw r2
    }
}
