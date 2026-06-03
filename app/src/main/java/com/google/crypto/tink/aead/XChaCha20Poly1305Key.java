package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class XChaCha20Poly1305Key extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.XChaCha20Poly1305Parameters parameters;

    private XChaCha20Poly1305Key(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r1, com.google.crypto.tink.util.SecretBytes r2, com.google.crypto.tink.util.Bytes r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.parameters = r1
            r0.keyBytes = r2
            r0.outputPrefix = r3
            r0.idRequirement = r4
            return
    }

    public static com.google.crypto.tink.aead.XChaCha20Poly1305Key create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant r2, com.google.crypto.tink.util.SecretBytes r3, @javax.annotation.Nullable java.lang.Integer r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX
            if (r2 == r0) goto L22
            if (r4 == 0) goto L7
            goto L22
        L7:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "For given Variant "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " the value of idRequirement must be non-null"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L22:
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX
            if (r2 != r0) goto L31
            if (r4 != 0) goto L29
            goto L31
        L29:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "For given Variant NO_PREFIX the value of idRequirement must be null"
            r2.<init>(r3)
            throw r2
        L31:
            int r0 = r3.size()
            r1 = 32
            if (r0 != r1) goto L47
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r2 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(r2)
            com.google.crypto.tink.aead.XChaCha20Poly1305Key r0 = new com.google.crypto.tink.aead.XChaCha20Poly1305Key
            com.google.crypto.tink.util.Bytes r1 = getOutputPrefix(r2, r4)
            r0.<init>(r2, r3, r1, r4)
            return r0
        L47:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "
            r4.<init>(r0)
            int r3 = r3.size()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static com.google.crypto.tink.aead.XChaCha20Poly1305Key create(com.google.crypto.tink.util.SecretBytes r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX
            r1 = 0
            com.google.crypto.tink.aead.XChaCha20Poly1305Key r2 = create(r0, r2, r1)
            return r2
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r4, @javax.annotation.Nullable java.lang.Integer r5) {
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = r4.getVariant()
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX
            r2 = 0
            if (r0 != r1) goto L10
            byte[] r4 = new byte[r2]
            com.google.crypto.tink.util.Bytes r4 = com.google.crypto.tink.util.Bytes.copyFrom(r4)
            return r4
        L10:
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = r4.getVariant()
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.CRUNCHY
            r3 = 5
            if (r0 != r1) goto L32
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteBuffer r4 = r4.put(r2)
            int r5 = r5.intValue()
            java.nio.ByteBuffer r4 = r4.putInt(r5)
            byte[] r4 = r4.array()
            com.google.crypto.tink.util.Bytes r4 = com.google.crypto.tink.util.Bytes.copyFrom(r4)
            return r4
        L32:
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r0 = r4.getVariant()
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.TINK
            if (r0 != r1) goto L54
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r3)
            r0 = 1
            java.nio.ByteBuffer r4 = r4.put(r0)
            int r5 = r5.intValue()
            java.nio.ByteBuffer r4 = r4.putInt(r5)
            byte[] r4 = r4.array()
            com.google.crypto.tink.util.Bytes r4 = com.google.crypto.tink.util.Bytes.copyFrom(r4)
            return r4
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown Variant: "
            r0.<init>(r1)
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters$Variant r4 = r4.getVariant()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.aead.XChaCha20Poly1305Key
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.aead.XChaCha20Poly1305Key r4 = (com.google.crypto.tink.aead.XChaCha20Poly1305Key) r4
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r0 = r4.parameters
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r2 = r3.parameters
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            com.google.crypto.tink.util.SecretBytes r0 = r4.keyBytes
            com.google.crypto.tink.util.SecretBytes r2 = r3.keyBytes
            boolean r0 = r0.equalsSecretBytes(r2)
            if (r0 == 0) goto L27
            java.lang.Integer r4 = r4.idRequirement
            java.lang.Integer r0 = r3.idRequirement
            boolean r4 = java.util.Objects.equals(r4, r0)
            if (r4 == 0) goto L27
            r1 = 1
        L27:
            return r1
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            java.lang.Integer r0 = r1.idRequirement
            return r0
    }

    public com.google.crypto.tink.util.SecretBytes getKeyBytes() {
            r1 = this;
            com.google.crypto.tink.util.SecretBytes r0 = r1.keyBytes
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public com.google.crypto.tink.util.Bytes getOutputPrefix() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.outputPrefix
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.aead.AeadParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.aead.XChaCha20Poly1305Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.XChaCha20Poly1305Parameters r0 = r1.parameters
            return r0
    }
}
