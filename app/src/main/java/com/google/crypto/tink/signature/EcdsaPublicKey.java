package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class EcdsaPublicKey extends com.google.crypto.tink.signature.SignaturePublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.signature.EcdsaParameters parameters;
    private final java.security.spec.ECPoint publicPoint;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.EcdsaPublicKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer idRequirement;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.EcdsaParameters parameters;

        @javax.annotation.Nullable
        private java.security.spec.ECPoint publicPoint;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.parameters = r0
                r1.publicPoint = r0
                r1.idRequirement = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.signature.EcdsaPublicKey.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private com.google.crypto.tink.util.Bytes getOutputPrefix() {
                r4 = this;
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.NO_PREFIX
                r2 = 0
                if (r0 != r1) goto L12
                byte[] r0 = new byte[r2]
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
                return r0
            L12:
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY
                r3 = 5
                if (r0 == r1) goto L69
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.CRUNCHY
                if (r0 != r1) goto L28
                goto L69
            L28:
                com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r0 = r0.getVariant()
                com.google.crypto.tink.signature.EcdsaParameters$Variant r1 = com.google.crypto.tink.signature.EcdsaParameters.Variant.TINK
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
                java.lang.String r2 = "Unknown EcdsaParameters.Variant: "
                r1.<init>(r2)
                com.google.crypto.tink.signature.EcdsaParameters r2 = r4.parameters
                com.google.crypto.tink.signature.EcdsaParameters$Variant r2 = r2.getVariant()
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

        public com.google.crypto.tink.signature.EcdsaPublicKey build() throws java.security.GeneralSecurityException {
                r8 = this;
                com.google.crypto.tink.signature.EcdsaParameters r0 = r8.parameters
                if (r0 == 0) goto L5b
                java.security.spec.ECPoint r1 = r8.publicPoint
                if (r1 == 0) goto L53
                com.google.crypto.tink.signature.EcdsaParameters$CurveType r0 = r0.getCurveType()
                java.security.spec.ECParameterSpec r0 = r0.toParameterSpec()
                java.security.spec.EllipticCurve r0 = r0.getCurve()
                com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r1, r0)
                com.google.crypto.tink.signature.EcdsaParameters r0 = r8.parameters
                boolean r0 = r0.hasIdRequirement()
                if (r0 == 0) goto L2c
                java.lang.Integer r0 = r8.idRequirement
                if (r0 == 0) goto L24
                goto L2c
            L24:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot create key without ID requirement with parameters with ID requirement"
                r0.<init>(r1)
                throw r0
            L2c:
                com.google.crypto.tink.signature.EcdsaParameters r0 = r8.parameters
                boolean r0 = r0.hasIdRequirement()
                if (r0 != 0) goto L41
                java.lang.Integer r0 = r8.idRequirement
                if (r0 != 0) goto L39
                goto L41
            L39:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot create key with ID requirement with parameters without ID requirement"
                r0.<init>(r1)
                throw r0
            L41:
                com.google.crypto.tink.util.Bytes r5 = r8.getOutputPrefix()
                com.google.crypto.tink.signature.EcdsaPublicKey r0 = new com.google.crypto.tink.signature.EcdsaPublicKey
                com.google.crypto.tink.signature.EcdsaParameters r3 = r8.parameters
                java.security.spec.ECPoint r4 = r8.publicPoint
                java.lang.Integer r6 = r8.idRequirement
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                return r0
            L53:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without public point"
                r0.<init>(r1)
                throw r0
            L5b:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Cannot build without parameters"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setIdRequirement(@javax.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.idRequirement = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setParameters(com.google.crypto.tink.signature.EcdsaParameters r1) {
                r0 = this;
                r0.parameters = r1
                return r0
        }

        public com.google.crypto.tink.signature.EcdsaPublicKey.Builder setPublicPoint(java.security.spec.ECPoint r1) {
                r0 = this;
                r0.publicPoint = r1
                return r0
        }
    }

    private EcdsaPublicKey(com.google.crypto.tink.signature.EcdsaParameters r1, java.security.spec.ECPoint r2, com.google.crypto.tink.util.Bytes r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.parameters = r1
            r0.publicPoint = r2
            r0.outputPrefix = r3
            r0.idRequirement = r4
            return
    }

    /* synthetic */ EcdsaPublicKey(com.google.crypto.tink.signature.EcdsaParameters r1, java.security.spec.ECPoint r2, com.google.crypto.tink.util.Bytes r3, java.lang.Integer r4, com.google.crypto.tink.signature.EcdsaPublicKey.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static com.google.crypto.tink.signature.EcdsaPublicKey.Builder builder() {
            com.google.crypto.tink.signature.EcdsaPublicKey$Builder r0 = new com.google.crypto.tink.signature.EcdsaPublicKey$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.signature.EcdsaPublicKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.signature.EcdsaPublicKey r4 = (com.google.crypto.tink.signature.EcdsaPublicKey) r4
            com.google.crypto.tink.signature.EcdsaParameters r0 = r4.parameters
            com.google.crypto.tink.signature.EcdsaParameters r2 = r3.parameters
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.security.spec.ECPoint r0 = r4.publicPoint
            java.security.spec.ECPoint r2 = r3.publicPoint
            boolean r0 = r0.equals(r2)
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

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public com.google.crypto.tink.util.Bytes getOutputPrefix() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.outputPrefix
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.signature.EcdsaParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.parameters
            return r0
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.signature.SignatureParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.EcdsaParameters r0 = r1.getParameters()
            return r0
    }

    public java.security.spec.ECPoint getPublicPoint() {
            r1 = this;
            java.security.spec.ECPoint r0 = r1.publicPoint
            return r0
    }
}
