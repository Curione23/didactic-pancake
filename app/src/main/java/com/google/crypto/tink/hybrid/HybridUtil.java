package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes2.dex */
final class HybridUtil {

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.HybridUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcPointFormat = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.EcPointFormat[] r0 = com.google.crypto.tink.proto.EcPointFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat = r0
                r1 = 1
                com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.EcPointFormat r4 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.google.crypto.tink.proto.EllipticCurveType[] r3 = com.google.crypto.tink.proto.EllipticCurveType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = r3
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L43
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L4d
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L4d
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                com.google.crypto.tink.proto.HashType[] r3 = com.google.crypto.tink.proto.HashType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r3
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L5e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5e
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L5e
            L5e:
                int[] r1 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L68
                com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L68
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L68
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L68
            L68:
                int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L72
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L72
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L72
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L72
            L72:
                int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L7d
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L7d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7d
            L7d:
                int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L88
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L88
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L88
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L88
            L88:
                return
        }
    }

    private HybridUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L29
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            return r3
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown curve type: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L29:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            return r3
        L2c:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            return r3
    }

    public static java.lang.String toHmacAlgo(com.google.crypto.tink.proto.HashType r3) throws java.security.NoSuchAlgorithmException {
            int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
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
            java.lang.String r3 = "HmacSha512"
            return r3
        L1a:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "hash unsupported for HMAC: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            java.lang.String r3 = "HmacSha384"
            return r3
        L32:
            java.lang.String r3 = "HmacSha256"
            return r3
        L35:
            java.lang.String r3 = "HmacSha224"
            return r3
        L38:
            java.lang.String r3 = "HmacSha1"
            return r3
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.PointFormatType toPointFormatType(com.google.crypto.tink.proto.EcPointFormat r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L29
            r1 = 3
            if (r0 != r1) goto L14
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED
            return r3
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown point format: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L29:
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED
            return r3
        L2c:
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            return r3
    }

    public static void validate(com.google.crypto.tink.proto.EciesAeadHkdfParams r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = r2.getKemParams()
            com.google.crypto.tink.proto.EllipticCurveType r0 = r0.getCurveType()
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = toCurveType(r0)
            com.google.crypto.tink.subtle.EllipticCurves.getCurveSpec(r0)
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = r2.getKemParams()
            com.google.crypto.tink.proto.HashType r0 = r0.getHkdfHashType()
            toHmacAlgo(r0)
            com.google.crypto.tink.proto.EcPointFormat r0 = r2.getEcPointFormat()
            com.google.crypto.tink.proto.EcPointFormat r1 = com.google.crypto.tink.proto.EcPointFormat.UNKNOWN_FORMAT
            if (r0 == r1) goto L2e
            com.google.crypto.tink.proto.EciesAeadDemParams r2 = r2.getDemParams()
            com.google.crypto.tink.proto.KeyTemplate r2 = r2.getAeadDem()
            com.google.crypto.tink.Registry.newKeyData(r2)
            return
        L2e:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown EC point format"
            r2.<init>(r0)
            throw r2
    }
}
