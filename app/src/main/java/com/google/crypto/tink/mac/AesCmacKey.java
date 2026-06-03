package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class AesCmacKey extends com.google.crypto.tink.mac.MacKey {
    private final com.google.crypto.tink.util.SecretBytes aesKeyBytes;

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.mac.AesCmacParameters parameters;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.AesCmacKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBytes aesKeyBytes;

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.mac.AesCmacParameters parameters;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.parameters = r0
                r1.aesKeyBytes = r0
                r1.idRequirement = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.mac.AesCmacKey.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
                r4 = this;
                com.google.crypto.tink.mac.AesCmacParameters r0 = r4.parameters
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX
                r2 = 0
                if (r0 != r1) goto L12
                byte[] r0 = new byte[r2]
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L12:
                com.google.crypto.tink.mac.AesCmacParameters r0 = r4.parameters
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY
                r3 = 5
                if (r0 == r1) goto L69
                com.google.crypto.tink.mac.AesCmacParameters r0 = r4.parameters
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY
                if (r0 != r1) goto L28
                goto L69
            L28:
                com.google.crypto.tink.mac.AesCmacParameters r0 = r4.parameters
                com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK
                if (r0 != r1) goto L4e
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
                r1 = 1
                java.nio.ByteBuffer r0 = r0.put(r1)
                java.lang.Integer r1 = r4.idRequirement
                int r1 = r1.intValue()
                java.nio.ByteBuffer r0 = r0.putInt(r1)
                byte[] r0 = r0.array()
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L4e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unknown AesCmacParametersParameters.Variant: "
                r1.<init>(r2)
                com.google.crypto.tink.mac.AesCmacParameters r2 = r4.parameters
                com.google.crypto.tink.mac.AesCmacParameters$Variant r2 = r2.getVariant()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L69:
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
                java.nio.ByteBuffer r0 = r0.put(r2)
                java.lang.Integer r1 = r4.idRequirement
                int r1 = r1.intValue()
                java.nio.ByteBuffer r0 = r0.putInt(r1)
                byte[] r0 = r0.array()
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
        }

        public com.google.crypto.tink.mac.AesCmacKey build() throws java.security.GeneralSecurityException {
                r8 = this;
                com.google.crypto.tink.mac.AesCmacParameters r0 = r8.parameters
                if (r0 == 0) goto L58
                com.google.crypto.tink.util.SecretBytes r1 = r8.aesKeyBytes
                if (r1 == 0) goto L58
                int r0 = r0.getKeySizeBytes()
                com.google.crypto.tink.util.SecretBytes r1 = r8.aesKeyBytes
                int r1 = r1.size()
                if (r0 != r1) goto L50
                com.google.crypto.tink.mac.AesCmacParameters r0 = r8.parameters
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
                com.google.crypto.tink.mac.AesCmacParameters r0 = r8.parameters
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
                com.google.crypto.tink.mac.AesCmacKey r0 = new com.google.crypto.tink.mac.AesCmacKey
                com.google.crypto.tink.mac.AesCmacParameters r3 = r8.parameters
                com.google.crypto.tink.util.SecretBytes r4 = r8.aesKeyBytes
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

        public com.google.crypto.tink.mac.AesCmacKey.Builder setAesKeyBytes(com.google.crypto.tink.util.SecretBytes r1) throws java.security.GeneralSecurityException {
                r0 = this;
                r0.aesKeyBytes = r1
                return r0
        }

        public com.google.crypto.tink.mac.AesCmacKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.idRequirement = r1
                return r0
        }

        public com.google.crypto.tink.mac.AesCmacKey.Builder setParameters(com.google.crypto.tink.mac.AesCmacParameters r1) {
                r0 = this;
                r0.parameters = r1
                return r0
        }
    }

    private AesCmacKey(com.google.crypto.tink.mac.AesCmacParameters r1, com.google.crypto.tink.util.SecretBytes r2, com.google.crypto.tink.util.Bytes r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.parameters = r1
            r0.aesKeyBytes = r2
            r0.outputPrefix = r3
            r0.idRequirement = r4
            return
    }

    /* synthetic */ AesCmacKey(com.google.crypto.tink.mac.AesCmacParameters r1, com.google.crypto.tink.util.SecretBytes r2, com.google.crypto.tink.util.Bytes r3, java.lang.Integer r4, com.google.crypto.tink.mac.AesCmacKey.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.crypto.tink.mac.AesCmacKey.Builder builder() {
            com.google.crypto.tink.mac.AesCmacKey$Builder r0 = new com.google.crypto.tink.mac.AesCmacKey$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.mac.AesCmacKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.mac.AesCmacKey r4 = (com.google.crypto.tink.mac.AesCmacKey) r4
            com.google.crypto.tink.mac.AesCmacParameters r0 = r4.parameters
            com.google.crypto.tink.mac.AesCmacParameters r2 = r3.parameters
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            com.google.crypto.tink.util.SecretBytes r0 = r4.aesKeyBytes
            com.google.crypto.tink.util.SecretBytes r2 = r3.aesKeyBytes
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

    public com.google.crypto.tink.util.SecretBytes getAesKey() {
            r1 = this;
            com.google.crypto.tink.util.SecretBytes r0 = r1.aesKeyBytes
            return r0
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            java.lang.Integer r0 = r1.idRequirement
            return r0
    }

    @Override // com.google.crypto.tink.mac.MacKey
    public com.google.crypto.tink.util.Bytes getOutputPrefix() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.outputPrefix
            return r0
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.mac.AesCmacParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.mac.AesCmacParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.mac.AesCmacParameters r0 = r1.parameters
            return r0
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.mac.MacParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.mac.AesCmacParameters r0 = r1.getParameters()
            return r0
    }
}
