package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class NistCurvesHpkeKem implements com.google.crypto.tink.hybrid.internal.HpkeKem {
    private final com.google.crypto.tink.subtle.EllipticCurves.CurveType curve;
    private final com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdf;

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = r0
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    private NistCurvesHpkeKem(com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1, com.google.crypto.tink.subtle.EllipticCurves.CurveType r2) {
            r0 = this;
            r0.<init>()
            r0.hkdf = r1
            r0.curve = r2
            return
    }

    private byte[] deriveKemSharedSecret(byte[] r9, byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r8 = this;
            byte[][] r10 = new byte[][]{r10, r11}
            byte[] r4 = com.google.crypto.tink.subtle.Bytes.concat(r10)
            byte[] r10 = r8.getKemId()
            byte[] r6 = com.google.crypto.tink.hybrid.internal.HpkeUtil.kemSuiteId(r10)
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = r8.hkdf
            java.lang.String r5 = "shared_secret"
            int r7 = r0.getMacLength()
            r1 = 0
            java.lang.String r3 = "eae_prk"
            r2 = r9
            byte[] r9 = r0.extractAndExpand(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    static com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L44
            r1 = 2
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 != r1) goto L20
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r3 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r1 = "HmacSha512"
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            r3.<init>(r0, r1)
            return r3
        L20:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid curve type: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L35:
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r3 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r1 = "HmacSha384"
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            r3.<init>(r0, r1)
            return r3
        L44:
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r3 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r1 = "HmacSha256"
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            r3.<init>(r0, r1)
            return r3
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] decapsulate(byte[] r4, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = r3.curve
            com.google.crypto.tink.util.Bytes r1 = r5.getSerializedPrivate()
            byte[] r1 = r1.toByteArray()
            java.security.interfaces.ECPrivateKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(r0, r1)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = r3.curve
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r2 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.interfaces.ECPublicKey r1 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r1, r2, r4)
            byte[] r0 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r0, r1)
            com.google.crypto.tink.util.Bytes r5 = r5.getSerializedPublic()
            byte[] r5 = r5.toByteArray()
            byte[] r4 = r3.deriveKemSharedSecret(r0, r4, r5)
            return r4
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = r1.curve
            java.security.KeyPair r0 = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(r0)
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r2 = r1.encapsulate(r2, r0)
            return r2
    }

    com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r4, java.security.KeyPair r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = r3.curve
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.interfaces.ECPublicKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r0, r1, r4)
            java.security.PrivateKey r1 = r5.getPrivate()
            java.security.interfaces.ECPrivateKey r1 = (java.security.interfaces.ECPrivateKey) r1
            byte[] r0 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r1, r0)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = r3.curve
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r2 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.PublicKey r5 = r5.getPublic()
            java.security.interfaces.ECPublicKey r5 = (java.security.interfaces.ECPublicKey) r5
            java.security.spec.ECPoint r5 = r5.getW()
            byte[] r5 = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(r1, r2, r5)
            byte[] r4 = r3.deriveKemSharedSecret(r0, r5, r4)
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r0 = new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput
            r0.<init>(r4, r5)
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] getKemId() throws java.security.GeneralSecurityException {
            r2 = this;
            int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = r2.curve
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L21
            r1 = 2
            if (r0 == r1) goto L1e
            r1 = 3
            if (r0 != r1) goto L16
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P521_HKDF_SHA512_KEM_ID
            return r0
        L16:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KEM ID"
            r0.<init>(r1)
            throw r0
        L1e:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P384_HKDF_SHA384_KEM_ID
            return r0
        L21:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P256_HKDF_SHA256_KEM_ID
            return r0
    }
}
