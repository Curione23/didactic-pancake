package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes2.dex */
class PublicKeyVerifyWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.PublicKeyVerify, com.google.crypto.tink.PublicKeyVerify> {
    private static final byte[] FORMAT_VERSION = null;
    private static final com.google.crypto.tink.signature.PublicKeyVerifyWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    private static class WrappedPublicKeyVerify implements com.google.crypto.tink.PublicKeyVerify {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger monitoringLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> primitives;

        public WrappedPublicKeyVerify(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r4) {
                r3 = this;
                r3.<init>()
                r3.primitives = r4
                boolean r0 = r4.hasAnnotations()
                if (r0 == 0) goto L22
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r4 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r4)
                java.lang.String r1 = "public_key_verify"
                java.lang.String r2 = "verify"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r0.createLogger(r4, r1, r2)
                r3.monitoringLogger = r4
                goto L26
            L22:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r3.monitoringLogger = r4
            L26:
                return
        }

        @Override // com.google.crypto.tink.PublicKeyVerify
        public void verify(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
                r7 = this;
                int r0 = r8.length
                r1 = 5
                if (r0 <= r1) goto La2
                byte[] r0 = java.util.Arrays.copyOf(r8, r1)
                int r2 = r8.length
                byte[] r1 = java.util.Arrays.copyOfRange(r8, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r2 = r7.primitives
                java.util.List r0 = r2.getPrimitive(r0)
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L6a
                java.lang.Object r2 = r0.next()
                com.google.crypto.tink.PrimitiveSet$Entry r2 = (com.google.crypto.tink.PrimitiveSet.Entry) r2
                com.google.crypto.tink.proto.OutputPrefixType r3 = r2.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L3c
                byte[] r3 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.access$000()
                byte[][] r3 = new byte[][]{r9, r3}
                byte[] r3 = com.google.crypto.tink.subtle.Bytes.concat(r3)
                goto L3d
            L3c:
                r3 = r9
            L3d:
                java.lang.Object r4 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PublicKeyVerify r4 = (com.google.crypto.tink.PublicKeyVerify) r4     // Catch: java.security.GeneralSecurityException -> L52
                r4.verify(r1, r3)     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r7.monitoringLogger     // Catch: java.security.GeneralSecurityException -> L52
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L52
                int r3 = r3.length     // Catch: java.security.GeneralSecurityException -> L52
                long r5 = (long) r3     // Catch: java.security.GeneralSecurityException -> L52
                r4.log(r2, r5)     // Catch: java.security.GeneralSecurityException -> L52
                return
            L52:
                r2 = move-exception
                java.util.logging.Logger r3 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.access$100()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "signature prefix matches a key, but cannot verify: "
                r4.<init>(r5)
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.String r2 = r2.toString()
                r3.info(r2)
                goto L17
            L6a:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r0 = r7.primitives
                java.util.List r0 = r0.getRawPrimitives()
                java.util.Iterator r0 = r0.iterator()
            L74:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L95
                java.lang.Object r1 = r0.next()
                com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
                java.lang.Object r2 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L74
                com.google.crypto.tink.PublicKeyVerify r2 = (com.google.crypto.tink.PublicKeyVerify) r2     // Catch: java.security.GeneralSecurityException -> L74
                r2.verify(r8, r9)     // Catch: java.security.GeneralSecurityException -> L74
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r7.monitoringLogger     // Catch: java.security.GeneralSecurityException -> L74
                int r1 = r1.getKeyId()     // Catch: java.security.GeneralSecurityException -> L74
                int r3 = r9.length     // Catch: java.security.GeneralSecurityException -> L74
                long r3 = (long) r3     // Catch: java.security.GeneralSecurityException -> L74
                r2.log(r1, r3)     // Catch: java.security.GeneralSecurityException -> L74
                return
            L95:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r8 = r7.monitoringLogger
                r8.logFailure()
                java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
                java.lang.String r9 = "invalid signature"
                r8.<init>(r9)
                throw r8
            La2:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r8 = r7.monitoringLogger
                r8.logFailure()
                java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
                java.lang.String r9 = "signature too short"
                r8.<init>(r9)
                throw r8
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.signature.PublicKeyVerifyWrapper> r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.logger = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.FORMAT_VERSION = r0
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper r0 = new com.google.crypto.tink.signature.PublicKeyVerifyWrapper
            r0.<init>()
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.WRAPPER = r0
            return
    }

    PublicKeyVerifyWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.FORMAT_VERSION
            return r0
    }

    static /* synthetic */ java.util.logging.Logger access$100() {
            java.util.logging.Logger r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeyVerify> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeyVerify> r0 = com.google.crypto.tink.PublicKeyVerify.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeyVerify> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeyVerify> r0 = com.google.crypto.tink.PublicKeyVerify.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.PublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r2) {
            r1 = this;
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify r0 = new com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.PublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.PublicKeyVerify r1 = r0.wrap(r1)
            return r1
    }
}
