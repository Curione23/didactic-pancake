package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
class JwtPublicKeyVerifyWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal, com.google.crypto.tink.jwt.JwtPublicKeyVerify> {
    private static final com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper WRAPPER = null;

    @com.google.errorprone.annotations.Immutable
    private static class WrappedJwtPublicKeyVerify implements com.google.crypto.tink.jwt.JwtPublicKeyVerify {
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> primitives;

        public WrappedJwtPublicKeyVerify(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r1) {
                r0 = this;
                r0.<init>()
                r0.primitives = r1
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerify
        public com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String r7, com.google.crypto.tink.jwt.JwtValidator r8) throws java.security.GeneralSecurityException {
                r6 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r0 = r6.primitives
                java.util.Collection r0 = r0.getAll()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lb:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L45
                java.lang.Object r2 = r0.next()
                java.util.List r2 = (java.util.List) r2
                java.util.Iterator r2 = r2.iterator()
            L1b:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Lb
                java.lang.Object r3 = r2.next()
                com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
                int r4 = r3.getKeyId()     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.proto.OutputPrefixType r5 = r3.getOutputPrefixType()     // Catch: java.security.GeneralSecurityException -> L3e
                java.util.Optional r4 = com.google.crypto.tink.jwt.JwtFormat.getKid(r4, r5)     // Catch: java.security.GeneralSecurityException -> L3e
                java.lang.Object r3 = r3.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal r3 = (com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal) r3     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.jwt.VerifiedJwt r7 = r3.verifyAndDecodeWithKid(r7, r8, r4)     // Catch: java.security.GeneralSecurityException -> L3e
                return r7
            L3e:
                r3 = move-exception
                boolean r4 = r3 instanceof com.google.crypto.tink.jwt.JwtInvalidException
                if (r4 == 0) goto L1b
                r1 = r3
                goto L1b
            L45:
                if (r1 == 0) goto L48
                throw r1
            L48:
                java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
                java.lang.String r8 = "invalid JWT"
                r7.<init>(r8)
                throw r7
        }
    }

    static {
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper r0 = new com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper
            r0.<init>()
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.WRAPPER = r0
            return
    }

    JwtPublicKeyVerifyWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private static void validate(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r4) throws java.security.GeneralSecurityException {
            java.util.Collection r4 = r4.getAll()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r4.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
            com.google.crypto.tink.proto.OutputPrefixType r2 = r1.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r2 == r3) goto L18
            com.google.crypto.tink.proto.OutputPrefixType r1 = r1.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r1 != r2) goto L35
            goto L18
        L35:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unsupported OutputPrefixType"
            r4.<init>(r0)
            throw r4
        L3d:
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerify> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerify> r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerify.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtPublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r2) throws java.security.GeneralSecurityException {
            r1 = this;
            validate(r2)
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper$WrappedJwtPublicKeyVerify r0 = new com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper$WrappedJwtPublicKeyVerify
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.jwt.JwtPublicKeyVerify r1 = r0.wrap(r1)
            return r1
    }
}
