package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeySignWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.PublicKeySign, com.google.crypto.tink.PublicKeySign> {
    private static final byte[] FORMAT_VERSION = null;
    private static final com.google.crypto.tink.signature.PublicKeySignWrapper WRAPPER = null;

    private static class WrappedPublicKeySign implements com.google.crypto.tink.PublicKeySign {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger logger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> primitives;

        public WrappedPublicKeySign(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r4) {
                r3 = this;
                r3.<init>()
                r3.primitives = r4
                boolean r0 = r4.hasAnnotations()
                if (r0 == 0) goto L22
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r4 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r4)
                java.lang.String r1 = "public_key_sign"
                java.lang.String r2 = "sign"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r0.createLogger(r4, r1, r2)
                r3.logger = r4
                goto L26
            L22:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r3.logger = r4
            L26:
                return
        }

        @Override // com.google.crypto.tink.PublicKeySign
        public byte[] sign(byte[] r6) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r0 = r5.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1e
                byte[] r0 = com.google.crypto.tink.signature.PublicKeySignWrapper.access$000()
                byte[][] r6 = new byte[][]{r6, r0}
                byte[] r6 = com.google.crypto.tink.subtle.Bytes.concat(r6)
            L1e:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r0 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()     // Catch: java.security.GeneralSecurityException -> L52
                byte[] r0 = r0.getIdentifier()     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r1 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L52
                java.lang.Object r1 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PublicKeySign r1 = (com.google.crypto.tink.PublicKeySign) r1     // Catch: java.security.GeneralSecurityException -> L52
                byte[] r1 = r1.sign(r6)     // Catch: java.security.GeneralSecurityException -> L52
                byte[][] r0 = new byte[][]{r0, r1}     // Catch: java.security.GeneralSecurityException -> L52
                byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.logger     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r2 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet$Entry r2 = r2.getPrimary()     // Catch: java.security.GeneralSecurityException -> L52
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L52
                int r6 = r6.length     // Catch: java.security.GeneralSecurityException -> L52
                long r3 = (long) r6     // Catch: java.security.GeneralSecurityException -> L52
                r1.log(r2, r3)     // Catch: java.security.GeneralSecurityException -> L52
                return r0
            L52:
                r6 = move-exception
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r5.logger
                r0.logFailure()
                throw r6
        }
    }

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.signature.PublicKeySignWrapper.FORMAT_VERSION = r0
            com.google.crypto.tink.signature.PublicKeySignWrapper r0 = new com.google.crypto.tink.signature.PublicKeySignWrapper
            r0.<init>()
            com.google.crypto.tink.signature.PublicKeySignWrapper.WRAPPER = r0
            return
    }

    PublicKeySignWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = com.google.crypto.tink.signature.PublicKeySignWrapper.FORMAT_VERSION
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.PublicKeySignWrapper r0 = com.google.crypto.tink.signature.PublicKeySignWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeySign> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r0 = com.google.crypto.tink.PublicKeySign.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeySign> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r0 = com.google.crypto.tink.PublicKeySign.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.PublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r2) {
            r1 = this;
            com.google.crypto.tink.signature.PublicKeySignWrapper$WrappedPublicKeySign r0 = new com.google.crypto.tink.signature.PublicKeySignWrapper$WrappedPublicKeySign
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.PublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.PublicKeySign r1 = r0.wrap(r1)
            return r1
    }
}
