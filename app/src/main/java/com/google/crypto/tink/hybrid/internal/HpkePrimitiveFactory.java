package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
final class HpkePrimitiveFactory {
    private HpkePrimitiveFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.hybrid.internal.HpkeAead createAead(com.google.crypto.tink.proto.HpkeParams r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HpkeAead r0 = r2.getAead()
            com.google.crypto.tink.proto.HpkeAead r1 = com.google.crypto.tink.proto.HpkeAead.AES_128_GCM
            if (r0 != r1) goto L10
            com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead r2 = new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead
            r0 = 16
            r2.<init>(r0)
            return r2
        L10:
            com.google.crypto.tink.proto.HpkeAead r0 = r2.getAead()
            com.google.crypto.tink.proto.HpkeAead r1 = com.google.crypto.tink.proto.HpkeAead.AES_256_GCM
            if (r0 != r1) goto L20
            com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead r2 = new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead
            r0 = 32
            r2.<init>(r0)
            return r2
        L20:
            com.google.crypto.tink.proto.HpkeAead r2 = r2.getAead()
            com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.CHACHA20_POLY1305
            if (r2 != r0) goto L2e
            com.google.crypto.tink.hybrid.internal.ChaCha20Poly1305HpkeAead r2 = new com.google.crypto.tink.hybrid.internal.ChaCha20Poly1305HpkeAead
            r2.<init>()
            return r2
        L2e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized HPKE AEAD identifier"
            r2.<init>(r0)
            throw r2
    }

    static com.google.crypto.tink.hybrid.internal.HpkeAead createAead(byte[] r1) throws java.security.GeneralSecurityException {
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_128_GCM_AEAD_ID
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L10
            com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead r1 = new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead
            r0 = 16
            r1.<init>(r0)
            return r1
        L10:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_256_GCM_AEAD_ID
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L20
            com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead r1 = new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead
            r0 = 32
            r1.<init>(r0)
            return r1
        L20:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.CHACHA20_POLY1305_AEAD_ID
            boolean r1 = java.util.Arrays.equals(r1, r0)
            if (r1 == 0) goto L2e
            com.google.crypto.tink.hybrid.internal.ChaCha20Poly1305HpkeAead r1 = new com.google.crypto.tink.hybrid.internal.ChaCha20Poly1305HpkeAead
            r1.<init>()
            return r1
        L2e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized HPKE AEAD identifier"
            r1.<init>(r0)
            throw r1
    }

    static com.google.crypto.tink.hybrid.internal.HpkeKdf createKdf(com.google.crypto.tink.proto.HpkeParams r2) {
            com.google.crypto.tink.proto.HpkeKdf r0 = r2.getKdf()
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA256
            if (r0 != r1) goto L10
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r2 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r0 = "HmacSha256"
            r2.<init>(r0)
            return r2
        L10:
            com.google.crypto.tink.proto.HpkeKdf r0 = r2.getKdf()
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA384
            if (r0 != r1) goto L20
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r2 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r0 = "HmacSha384"
            r2.<init>(r0)
            return r2
        L20:
            com.google.crypto.tink.proto.HpkeKdf r2 = r2.getKdf()
            com.google.crypto.tink.proto.HpkeKdf r0 = com.google.crypto.tink.proto.HpkeKdf.HKDF_SHA512
            if (r2 != r0) goto L30
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r2 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r0 = "HmacSha512"
            r2.<init>(r0)
            return r2
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized HPKE KDF identifier"
            r2.<init>(r0)
            throw r2
    }

    static com.google.crypto.tink.hybrid.internal.HpkeKdf createKdf(byte[] r1) {
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L10
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r0 = "HmacSha256"
            r1.<init>(r0)
            return r1
        L10:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA384_KDF_ID
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L20
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r0 = "HmacSha384"
            r1.<init>(r0)
            return r1
        L20:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA512_KDF_ID
            boolean r1 = java.util.Arrays.equals(r1, r0)
            if (r1 == 0) goto L30
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r0 = "HmacSha512"
            r1.<init>(r0)
            return r1
        L30:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized HPKE KDF identifier"
            r1.<init>(r0)
            throw r1
    }

    static com.google.crypto.tink.hybrid.internal.HpkeKem createKem(com.google.crypto.tink.proto.HpkeParams r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HpkeKem r0 = r2.getKem()
            com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256
            if (r0 != r1) goto L15
            com.google.crypto.tink.hybrid.internal.X25519HpkeKem r2 = new com.google.crypto.tink.hybrid.internal.X25519HpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r1 = "HmacSha256"
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
        L15:
            com.google.crypto.tink.proto.HpkeKem r0 = r2.getKem()
            com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256
            if (r0 != r1) goto L24
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r2 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(r2)
            return r2
        L24:
            com.google.crypto.tink.proto.HpkeKem r0 = r2.getKem()
            com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384
            if (r0 != r1) goto L33
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r2 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(r2)
            return r2
        L33:
            com.google.crypto.tink.proto.HpkeKem r2 = r2.getKem()
            com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512
            if (r2 != r0) goto L42
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r2 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(r2)
            return r2
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized HPKE KEM identifier"
            r2.<init>(r0)
            throw r2
    }

    static com.google.crypto.tink.hybrid.internal.HpkeKem createKem(byte[] r2) throws java.security.GeneralSecurityException {
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L15
            com.google.crypto.tink.hybrid.internal.X25519HpkeKem r2 = new com.google.crypto.tink.hybrid.internal.X25519HpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r1 = "HmacSha256"
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
        L15:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P256_HKDF_SHA256_KEM_ID
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L24
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r2 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(r2)
            return r2
        L24:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P384_HKDF_SHA384_KEM_ID
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L33
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r2 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(r2)
            return r2
        L33:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P521_HKDF_SHA512_KEM_ID
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L42
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r2 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(r2)
            return r2
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unrecognized HPKE KEM identifier"
            r2.<init>(r0)
            throw r2
    }
}
