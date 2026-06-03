package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
class JwtMacWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtMacInternal, com.google.crypto.tink.jwt.JwtMac> {
    private static final com.google.crypto.tink.jwt.JwtMacWrapper WRAPPER = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtMacWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    @com.google.errorprone.annotations.Immutable
    private static class WrappedJwtMac implements com.google.crypto.tink.jwt.JwtMac {
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> primitives;

        private WrappedJwtMac(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r1) {
                r0 = this;
                r0.<init>()
                r0.primitives = r1
                return
        }

        /* synthetic */ WrappedJwtMac(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.jwt.JwtMacWrapper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public java.lang.String computeMacAndEncode(com.google.crypto.tink.jwt.RawJwt r4) throws java.security.GeneralSecurityException {
                r3 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r0 = r3.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                int r1 = r0.getKeyId()
                com.google.crypto.tink.proto.OutputPrefixType r2 = r0.getOutputPrefixType()
                java.util.Optional r1 = com.google.crypto.tink.jwt.JwtFormat.getKid(r1, r2)
                java.lang.Object r0 = r0.getPrimitive()
                com.google.crypto.tink.jwt.JwtMacInternal r0 = (com.google.crypto.tink.jwt.JwtMacInternal) r0
                java.lang.String r4 = r0.computeMacAndEncodeWithKid(r4, r1)
                return r4
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecode(java.lang.String r7, com.google.crypto.tink.jwt.JwtValidator r8) throws java.security.GeneralSecurityException {
                r6 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r0 = r6.primitives
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
                com.google.crypto.tink.jwt.JwtMacInternal r3 = (com.google.crypto.tink.jwt.JwtMacInternal) r3     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.jwt.VerifiedJwt r7 = r3.verifyMacAndDecodeWithKid(r7, r8, r4)     // Catch: java.security.GeneralSecurityException -> L3e
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
                java.lang.String r8 = "invalid MAC"
                r7.<init>(r8)
                throw r7
        }
    }

    static {
            com.google.crypto.tink.jwt.JwtMacWrapper r0 = new com.google.crypto.tink.jwt.JwtMacWrapper
            r0.<init>()
            com.google.crypto.tink.jwt.JwtMacWrapper.WRAPPER = r0
            return
    }

    JwtMacWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtMacWrapper r0 = com.google.crypto.tink.jwt.JwtMacWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private static void validate(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r4) throws java.security.GeneralSecurityException {
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
    public java.lang.Class<com.google.crypto.tink.jwt.JwtMacInternal> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtMacInternal> r0 = com.google.crypto.tink.jwt.JwtMacInternal.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtMac> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtMac> r0 = com.google.crypto.tink.jwt.JwtMac.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtMac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            validate(r3)
            com.google.crypto.tink.jwt.JwtMacWrapper$WrappedJwtMac r0 = new com.google.crypto.tink.jwt.JwtMacWrapper$WrappedJwtMac
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtMac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.jwt.JwtMac r1 = r0.wrap(r1)
            return r1
    }
}
