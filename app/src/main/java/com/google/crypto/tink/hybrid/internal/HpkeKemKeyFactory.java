package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
final class HpkeKemKeyFactory {

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem = null;

        static {
                com.google.crypto.tink.proto.HpkeKem[] r0 = com.google.crypto.tink.proto.HpkeKem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem = r0
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private HpkeKemKeyFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey createPrivate(com.google.crypto.tink.proto.HpkePrivateKey r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem
            com.google.crypto.tink.proto.HpkePublicKey r1 = r2.getPublicKey()
            com.google.crypto.tink.proto.HpkeParams r1 = r1.getParams()
            com.google.crypto.tink.proto.HpkeKem r1 = r1.getKem()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L52
            r1 = 2
            if (r0 == r1) goto L29
            r1 = 3
            if (r0 == r1) goto L29
            r1 = 4
            if (r0 != r1) goto L21
            goto L29
        L21:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Unrecognized HPKE KEM identifier"
            r2.<init>(r0)
            throw r2
        L29:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.getPrivateKey()
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.proto.HpkePublicKey r1 = r2.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getPublicKey()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.proto.HpkePublicKey r2 = r2.getPublicKey()
            com.google.crypto.tink.proto.HpkeParams r2 = r2.getParams()
            com.google.crypto.tink.proto.HpkeKem r2 = r2.getKem()
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.hybrid.internal.HpkeUtil.nistHpkeKemToCurve(r2)
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey r2 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey.fromBytes(r0, r1, r2)
            return r2
        L52:
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.getPrivateKey()
            byte[] r2 = r2.toByteArray()
            com.google.crypto.tink.hybrid.internal.X25519HpkeKemPrivateKey r2 = com.google.crypto.tink.hybrid.internal.X25519HpkeKemPrivateKey.fromBytes(r2)
            return r2
    }
}
