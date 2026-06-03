package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class HpkeEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private static final byte[] EMPTY_ASSOCIATED_DATA = null;
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final com.google.crypto.tink.proto.HpkePublicKey recipientPublicKey;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.internal.HpkeEncrypt.EMPTY_ASSOCIATED_DATA = r0
            return
    }

    private HpkeEncrypt(com.google.crypto.tink.proto.HpkePublicKey r1, com.google.crypto.tink.hybrid.internal.HpkeKem r2, com.google.crypto.tink.hybrid.internal.HpkeKdf r3, com.google.crypto.tink.hybrid.internal.HpkeAead r4) {
            r0 = this;
            r0.<init>()
            r0.recipientPublicKey = r1
            r0.kem = r2
            r0.kdf = r3
            r0.aead = r4
            return
    }

    static com.google.crypto.tink.hybrid.internal.HpkeEncrypt createHpkeEncrypt(com.google.crypto.tink.proto.HpkePublicKey r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.getPublicKey()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            com.google.crypto.tink.proto.HpkeParams r0 = r4.getParams()
            com.google.crypto.tink.hybrid.internal.HpkeKem r1 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(r0)
            com.google.crypto.tink.hybrid.internal.HpkeKdf r2 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(r0)
            com.google.crypto.tink.hybrid.internal.HpkeAead r0 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(r0)
            com.google.crypto.tink.hybrid.internal.HpkeEncrypt r3 = new com.google.crypto.tink.hybrid.internal.HpkeEncrypt
            r3.<init>(r4, r1, r2, r0)
            return r3
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "HpkePublicKey.public_key is empty."
            r4.<init>(r0)
            throw r4
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r4 = this;
            if (r6 != 0) goto L5
            r6 = 0
            byte[] r6 = new byte[r6]
        L5:
            com.google.crypto.tink.proto.HpkePublicKey r0 = r4.recipientPublicKey
            com.google.crypto.tink.hybrid.internal.HpkeKem r1 = r4.kem
            com.google.crypto.tink.hybrid.internal.HpkeKdf r2 = r4.kdf
            com.google.crypto.tink.hybrid.internal.HpkeAead r3 = r4.aead
            com.google.crypto.tink.hybrid.internal.HpkeContext r6 = com.google.crypto.tink.hybrid.internal.HpkeContext.createSenderContext(r0, r1, r2, r3, r6)
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeEncrypt.EMPTY_ASSOCIATED_DATA
            byte[] r5 = r6.seal(r5, r0)
            byte[] r6 = r6.getEncapsulatedKey()
            byte[][] r5 = new byte[][]{r6, r5}
            byte[] r5 = com.google.crypto.tink.subtle.Bytes.concat(r5)
            return r5
    }
}
