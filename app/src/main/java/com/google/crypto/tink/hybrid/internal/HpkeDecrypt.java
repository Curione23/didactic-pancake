package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
final class HpkeDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private static final byte[] EMPTY_ASSOCIATED_DATA = null;
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final int encapsulatedKeyLength;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey recipientPrivateKey;

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.HpkeDecrypt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem = null;

        static {
                com.google.crypto.tink.proto.HpkeKem[] r0 = com.google.crypto.tink.proto.HpkeKem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem = r0
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.internal.HpkeDecrypt.EMPTY_ASSOCIATED_DATA = r0
            return
    }

    private HpkeDecrypt(com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r1, com.google.crypto.tink.hybrid.internal.HpkeKem r2, com.google.crypto.tink.hybrid.internal.HpkeKdf r3, com.google.crypto.tink.hybrid.internal.HpkeAead r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.recipientPrivateKey = r1
            r0.kem = r2
            r0.kdf = r3
            r0.aead = r4
            r0.encapsulatedKeyLength = r5
            return
    }

    static com.google.crypto.tink.hybrid.internal.HpkeDecrypt createHpkeDecrypt(com.google.crypto.tink.proto.HpkePrivateKey r7) throws java.security.GeneralSecurityException {
            boolean r0 = r7.hasPublicKey()
            if (r0 == 0) goto L51
            com.google.crypto.tink.proto.HpkePublicKey r0 = r7.getPublicKey()
            boolean r0 = r0.hasParams()
            if (r0 == 0) goto L49
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r7.getPrivateKey()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L41
            com.google.crypto.tink.proto.HpkePublicKey r0 = r7.getPublicKey()
            com.google.crypto.tink.proto.HpkeParams r0 = r0.getParams()
            com.google.crypto.tink.hybrid.internal.HpkeKem r3 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(r0)
            com.google.crypto.tink.hybrid.internal.HpkeKdf r4 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(r0)
            com.google.crypto.tink.hybrid.internal.HpkeAead r5 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(r0)
            com.google.crypto.tink.proto.HpkeKem r0 = r0.getKem()
            int r6 = encodingSizeInBytes(r0)
            com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r2 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.createPrivate(r7)
            com.google.crypto.tink.hybrid.internal.HpkeDecrypt r7 = new com.google.crypto.tink.hybrid.internal.HpkeDecrypt
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L41:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "HpkePrivateKey.private_key is empty."
            r7.<init>(r0)
            throw r7
        L49:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "HpkePrivateKey.public_key is missing params field."
            r7.<init>(r0)
            throw r7
        L51:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "HpkePrivateKey is missing public_key field."
            r7.<init>(r0)
            throw r7
    }

    private static int encodingSizeInBytes(com.google.crypto.tink.proto.HpkeKem r3) {
            int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L36
            r1 = 2
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 != r1) goto L17
            r3 = 133(0x85, float:1.86E-43)
            return r3
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to determine KEM-encoding length for "
            r1.<init>(r2)
            java.lang.String r3 = r3.name()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L30:
            r3 = 97
            return r3
        L33:
            r3 = 65
            return r3
        L36:
            r3 = 32
            return r3
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            int r0 = r9.length
            int r1 = r8.encapsulatedKeyLength
            if (r0 < r1) goto L29
            if (r10 != 0) goto La
            r10 = 0
            byte[] r10 = new byte[r10]
        La:
            r7 = r10
            byte[] r2 = java.util.Arrays.copyOf(r9, r1)
            int r10 = r8.encapsulatedKeyLength
            int r0 = r9.length
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r10, r0)
            com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r3 = r8.recipientPrivateKey
            com.google.crypto.tink.hybrid.internal.HpkeKem r4 = r8.kem
            com.google.crypto.tink.hybrid.internal.HpkeKdf r5 = r8.kdf
            com.google.crypto.tink.hybrid.internal.HpkeAead r6 = r8.aead
            com.google.crypto.tink.hybrid.internal.HpkeContext r10 = com.google.crypto.tink.hybrid.internal.HpkeContext.createRecipientContext(r2, r3, r4, r5, r6, r7)
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.EMPTY_ASSOCIATED_DATA
            byte[] r9 = r10.open(r9, r0)
            return r9
        L29:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "Ciphertext is too short."
            r9.<init>(r10)
            throw r9
    }
}
