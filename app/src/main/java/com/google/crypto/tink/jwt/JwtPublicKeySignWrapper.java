package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
class JwtPublicKeySignWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtPublicKeySignInternal, com.google.crypto.tink.jwt.JwtPublicKeySign> {
    private static final com.google.crypto.tink.jwt.JwtPublicKeySignWrapper WRAPPER = null;

    @com.google.errorprone.annotations.Immutable
    private static class WrappedJwtPublicKeySign implements com.google.crypto.tink.jwt.JwtPublicKeySign {
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> primitives;

        public WrappedJwtPublicKeySign(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r1) {
                r0 = this;
                r0.<init>()
                r0.primitives = r1
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeySign
        public java.lang.String signAndEncode(com.google.crypto.tink.jwt.RawJwt r3) throws java.security.GeneralSecurityException {
                r2 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r0 = r2.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                int r1 = r0.getKeyId()
                com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
                java.util.Optional r0 = com.google.crypto.tink.jwt.JwtFormat.getKid(r1, r0)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r1 = r2.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()
                java.lang.Object r1 = r1.getPrimitive()
                com.google.crypto.tink.jwt.JwtPublicKeySignInternal r1 = (com.google.crypto.tink.jwt.JwtPublicKeySignInternal) r1
                java.lang.String r3 = r1.signAndEncodeWithKid(r3, r0)
                return r3
        }
    }

    static {
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper r0 = new com.google.crypto.tink.jwt.JwtPublicKeySignWrapper
            r0.<init>()
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper.WRAPPER = r0
            return
    }

    JwtPublicKeySignWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper r0 = com.google.crypto.tink.jwt.JwtPublicKeySignWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private static void validate(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.PrimitiveSet$Entry r0 = r4.getPrimary()
            if (r0 == 0) goto L44
            java.util.Collection r4 = r4.getAll()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r4.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
            com.google.crypto.tink.proto.OutputPrefixType r2 = r1.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r2 == r3) goto L1e
            com.google.crypto.tink.proto.OutputPrefixType r1 = r1.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r1 != r2) goto L3b
            goto L1e
        L3b:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unsupported OutputPrefixType"
            r4.<init>(r0)
            throw r4
        L43:
            return
        L44:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Primitive set has no primary."
            r4.<init>(r0)
            throw r4
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeySignInternal.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySign> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySign> r0 = com.google.crypto.tink.jwt.JwtPublicKeySign.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtPublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r2) throws java.security.GeneralSecurityException {
            r1 = this;
            validate(r2)
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper$WrappedJwtPublicKeySign r0 = new com.google.crypto.tink.jwt.JwtPublicKeySignWrapper$WrappedJwtPublicKeySign
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.jwt.JwtPublicKeySign r1 = r0.wrap(r1)
            return r1
    }
}
