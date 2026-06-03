package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes2.dex */
public class HybridDecryptWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.HybridDecrypt, com.google.crypto.tink.HybridDecrypt> {
    private static final com.google.crypto.tink.hybrid.HybridDecryptWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    private static class WrappedHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger decLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> primitives;

        public WrappedHybridDecrypt(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r4) {
                r3 = this;
                r3.<init>()
                r3.primitives = r4
                boolean r0 = r4.hasAnnotations()
                if (r0 == 0) goto L22
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r4 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r4)
                java.lang.String r1 = "hybrid_decrypt"
                java.lang.String r2 = "decrypt"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r0.createLogger(r4, r1, r2)
                r3.decLogger = r4
                goto L26
            L22:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r3.decLogger = r4
            L26:
                return
        }

        @Override // com.google.crypto.tink.HybridDecrypt
        public byte[] decrypt(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
                r7 = this;
                int r0 = r8.length
                r1 = 5
                if (r0 <= r1) goto L56
                r0 = 0
                byte[] r0 = java.util.Arrays.copyOfRange(r8, r0, r1)
                int r2 = r8.length
                byte[] r1 = java.util.Arrays.copyOfRange(r8, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r2 = r7.primitives
                java.util.List r0 = r2.getPrimitive(r0)
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L56
                java.lang.Object r2 = r0.next()
                com.google.crypto.tink.PrimitiveSet$Entry r2 = (com.google.crypto.tink.PrimitiveSet.Entry) r2
                java.lang.Object r3 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L3a
                com.google.crypto.tink.HybridDecrypt r3 = (com.google.crypto.tink.HybridDecrypt) r3     // Catch: java.security.GeneralSecurityException -> L3a
                byte[] r3 = r3.decrypt(r1, r9)     // Catch: java.security.GeneralSecurityException -> L3a
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r7.decLogger     // Catch: java.security.GeneralSecurityException -> L3a
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L3a
                int r5 = r1.length     // Catch: java.security.GeneralSecurityException -> L3a
                long r5 = (long) r5     // Catch: java.security.GeneralSecurityException -> L3a
                r4.log(r2, r5)     // Catch: java.security.GeneralSecurityException -> L3a
                return r3
            L3a:
                r2 = move-exception
                java.util.logging.Logger r3 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.access$000()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "ciphertext prefix matches a key, but cannot decrypt: "
                r4.<init>(r5)
                java.lang.String r2 = r2.toString()
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.String r2 = r2.toString()
                r3.info(r2)
                goto L18
            L56:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r0 = r7.primitives
                java.util.List r0 = r0.getRawPrimitives()
                java.util.Iterator r0 = r0.iterator()
            L60:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L82
                java.lang.Object r1 = r0.next()
                com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
                java.lang.Object r2 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L60
                com.google.crypto.tink.HybridDecrypt r2 = (com.google.crypto.tink.HybridDecrypt) r2     // Catch: java.security.GeneralSecurityException -> L60
                byte[] r2 = r2.decrypt(r8, r9)     // Catch: java.security.GeneralSecurityException -> L60
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r3 = r7.decLogger     // Catch: java.security.GeneralSecurityException -> L60
                int r1 = r1.getKeyId()     // Catch: java.security.GeneralSecurityException -> L60
                int r4 = r8.length     // Catch: java.security.GeneralSecurityException -> L60
                long r4 = (long) r4     // Catch: java.security.GeneralSecurityException -> L60
                r3.log(r1, r4)     // Catch: java.security.GeneralSecurityException -> L60
                return r2
            L82:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r8 = r7.decLogger
                r8.logFailure()
                java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
                java.lang.String r9 = "decryption failed"
                r8.<init>(r9)
                throw r8
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.hybrid.HybridDecryptWrapper> r0 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.logger = r0
            com.google.crypto.tink.hybrid.HybridDecryptWrapper r0 = new com.google.crypto.tink.hybrid.HybridDecryptWrapper
            r0.<init>()
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.WRAPPER = r0
            return
    }

    HybridDecryptWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.HybridDecryptWrapper r0 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridDecrypt> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.HybridDecrypt> r0 = com.google.crypto.tink.HybridDecrypt.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridDecrypt> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.HybridDecrypt> r0 = com.google.crypto.tink.HybridDecrypt.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.HybridDecrypt wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r2) {
            r1 = this;
            com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt r0 = new com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.HybridDecrypt wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.HybridDecrypt r1 = r0.wrap(r1)
            return r1
    }
}
