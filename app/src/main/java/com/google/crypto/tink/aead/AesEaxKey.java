package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class AesEaxKey extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.AesEaxParameters parameters;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.AesEaxKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes keyBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.aead.AesEaxParameters parameters;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.parameters = r0
                r1.keyBytes = r0
                r1.idRequirement = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.aead.AesEaxKey.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
                r4 = this;
                com.google.crypto.tink.aead.AesEaxParameters r0 = r4.parameters
                com.google.crypto.tink.aead.AesEaxParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.aead.AesEaxParameters$Variant r1 = com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX
                r2 = 0
                if (r0 != r1) goto L12
                byte[] r0 = new byte[r2]
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L12:
                com.google.crypto.tink.aead.AesEaxParameters r0 = r4.parameters
                com.google.crypto.tink.aead.AesEaxParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.aead.AesEaxParameters$Variant r1 = com.google.crypto.tink.aead.AesEaxParameters.Variant.CRUNCHY
                r3 = 5
                if (r0 != r1) goto L38
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
                java.nio.ByteBuffer r0 = r0.put(r2)
                java.lang.Integer r1 = r4.idRequirement
                int r1 = r1.intValue()
                java.nio.ByteBuffer r0 = r0.putInt(r1)
                byte[] r0 = r0.array()
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L38:
                com.google.crypto.tink.aead.AesEaxParameters r0 = r4.parameters
                com.google.crypto.tink.aead.AesEaxParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.aead.AesEaxParameters$Variant r1 = com.google.crypto.tink.aead.AesEaxParameters.Variant.TINK
                if (r0 != r1) goto L5e
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
                r1 = 1
                java.nio.ByteBuffer r0 = r0.put(r1)
                java.lang.Integer r1 = r4.idRequirement
                int r1 = r1.intValue()
                java.nio.ByteBuffer r0 = r0.putInt(r1)
                byte[] r0 = r0.array()
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L5e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unknown AesEaxParameters.Variant: "
                r1.<init>(r2)
                com.google.crypto.tink.aead.AesEaxParameters r2 = r4.parameters
                com.google.crypto.tink.aead.AesEaxParameters$Variant r2 = r2.getVariant()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.aead.AesEaxKey build() throws java.security.GeneralSecurityException {
                r8 = this;
                com.google.crypto.tink.aead.AesEaxParameters r0 = r8.parameters
                if (r0 == 0) goto L58
                com.google.crypto.tink.util.SecretBytes r1 = r8.keyBytes
                if (r1 == 0) goto L58
                int r0 = r0.getKeySizeBytes()
                com.google.crypto.tink.util.SecretBytes r1 = r8.keyBytes
                int r1 = r1.size()
                if (r0 != r1) goto L50
                com.google.crypto.tink.aead.AesEaxParameters r0 = r8.parameters
                boolean r0 = r0.hasIdRequirement()
                if (r0 == 0) goto L29
                java.lang.Integer r0 = r8.idRequirement
                if (r0 == 0) goto L21
                goto L29
            L21:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot create key without ID requirement with parameters with ID requirement"
                r0.<init>(r1)
                throw r0
            L29:
                com.google.crypto.tink.aead.AesEaxParameters r0 = r8.parameters
                boolean r0 = r0.hasIdRequirement()
                if (r0 != 0) goto L3e
                java.lang.Integer r0 = r8.idRequirement
                if (r0 != 0) goto L36
                goto L3e
            L36:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot create key with ID requirement with parameters without ID requirement"
                r0.<init>(r1)
                throw r0
            L3e:
                com.google.crypto.tink.util.Bytes r5 = r8.getOutputPrefix()
                com.google.crypto.tink.aead.AesEaxKey r0 = new com.google.crypto.tink.aead.AesEaxKey
                com.google.crypto.tink.aead.AesEaxParameters r3 = r8.parameters
                com.google.crypto.tink.util.SecretBytes r4 = r8.keyBytes
                java.lang.Integer r6 = r8.idRequirement
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                return r0
            L50:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Key size mismatch"
                r0.<init>(r1)
                throw r0
            L58:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without parameters and/or key material"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.aead.AesEaxKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.idRequirement = r1
                return r0
        }

        public com.google.crypto.tink.aead.AesEaxKey.Builder setKeyBytes(com.google.crypto.tink.util.SecretBytes r1) {
                r0 = this;
                r0.keyBytes = r1
                return r0
        }

        public com.google.crypto.tink.aead.AesEaxKey.Builder setParameters(com.google.crypto.tink.aead.AesEaxParameters r1) {
                r0 = this;
                r0.parameters = r1
                return r0
        }
    }

    private AesEaxKey(com.google.crypto.tink.aead.AesEaxParameters r1, com.google.crypto.tink.util.SecretBytes r2, com.google.crypto.tink.util.Bytes r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.parameters = r1
            r0.keyBytes = r2
            r0.outputPrefix = r3
            r0.idRequirement = r4
            return
    }

    /* synthetic */ AesEaxKey(com.google.crypto.tink.aead.AesEaxParameters r1, com.google.crypto.tink.util.SecretBytes r2, com.google.crypto.tink.util.Bytes r3, java.lang.Integer r4, com.google.crypto.tink.aead.AesEaxKey.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.crypto.tink.aead.AesEaxKey.Builder builder() {
            com.google.crypto.tink.aead.AesEaxKey$Builder r0 = new com.google.crypto.tink.aead.AesEaxKey$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.aead.AesEaxKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.aead.AesEaxKey r4 = (com.google.crypto.tink.aead.AesEaxKey) r4
            com.google.crypto.tink.aead.AesEaxParameters r0 = r4.parameters
            com.google.crypto.tink.aead.AesEaxParameters r2 = r3.parameters
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
            com.google.crypto.tink.aead.AesEaxParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.aead.AeadParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.AesEaxParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.aead.AesEaxParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.AesEaxParameters r0 = r1.parameters
            return r0
    }
}
