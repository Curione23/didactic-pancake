package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class NistCurvesHpkeKemPrivateKey implements com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey {
    private final com.google.crypto.tink.util.Bytes privateKey;
    private final com.google.crypto.tink.util.Bytes publicKey;

    private NistCurvesHpkeKemPrivateKey(byte[] r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r1)
            r0.privateKey = r1
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r2)
            r0.publicKey = r1
            return
    }

    static com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey fromBytes(byte[] r1, byte[] r2, com.google.crypto.tink.subtle.EllipticCurves.CurveType r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.interfaces.ECPublicKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r3, r0, r2)
            java.security.interfaces.ECPrivateKey r3 = com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(r3, r1)
            com.google.crypto.tink.subtle.EllipticCurves.validatePublicKey(r0, r3)
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey r3 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey
            r3.<init>(r1, r2)
            return r3
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey
    public com.google.crypto.tink.util.Bytes getSerializedPrivate() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.privateKey
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey
    public com.google.crypto.tink.util.Bytes getSerializedPublic() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.publicKey
            return r0
    }
}
