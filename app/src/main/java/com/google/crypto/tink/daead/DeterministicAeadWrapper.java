package com.google.crypto.tink.daead;

/* JADX INFO: loaded from: classes2.dex */
public class DeterministicAeadWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.DeterministicAead, com.google.crypto.tink.DeterministicAead> {
    private static final com.google.crypto.tink.daead.DeterministicAeadWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    private static class WrappedDeterministicAead implements com.google.crypto.tink.DeterministicAead {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger decLogger;
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger encLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> primitives;

        public WrappedDeterministicAead(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r4) {
                r3 = this;
                r3.<init>()
                r3.primitives = r4
                boolean r0 = r4.hasAnnotations()
                if (r0 == 0) goto L2a
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r4 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r4)
                java.lang.String r1 = "encrypt"
                java.lang.String r2 = "daead"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r0.createLogger(r4, r2, r1)
                r3.encLogger = r1
                java.lang.String r1 = "decrypt"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r0.createLogger(r4, r2, r1)
                r3.decLogger = r4
                goto L32
            L2a:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r3.encLogger = r4
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r3.decLogger = r4
            L32:
                return
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] decryptDeterministically(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
                r7 = this;
                int r0 = r8.length
                r1 = 5
                if (r0 <= r1) goto L51
                byte[] r0 = java.util.Arrays.copyOf(r8, r1)
                int r2 = r8.length
                byte[] r1 = java.util.Arrays.copyOfRange(r8, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r2 = r7.primitives
                java.util.List r0 = r2.getPrimitive(r0)
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L51
                java.lang.Object r2 = r0.next()
                com.google.crypto.tink.PrimitiveSet$Entry r2 = (com.google.crypto.tink.PrimitiveSet.Entry) r2
                java.lang.Object r3 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L39
                com.google.crypto.tink.DeterministicAead r3 = (com.google.crypto.tink.DeterministicAead) r3     // Catch: java.security.GeneralSecurityException -> L39
                byte[] r3 = r3.decryptDeterministically(r1, r9)     // Catch: java.security.GeneralSecurityException -> L39
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r7.decLogger     // Catch: java.security.GeneralSecurityException -> L39
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L39
                int r5 = r1.length     // Catch: java.security.GeneralSecurityException -> L39
                long r5 = (long) r5     // Catch: java.security.GeneralSecurityException -> L39
                r4.log(r2, r5)     // Catch: java.security.GeneralSecurityException -> L39
                return r3
            L39:
                r2 = move-exception
                java.util.logging.Logger r3 = com.google.crypto.tink.daead.DeterministicAeadWrapper.access$000()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "ciphertext prefix matches a key, but cannot decrypt: "
                r4.<init>(r5)
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.String r2 = r2.toString()
                r3.info(r2)
                goto L17
            L51:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r0 = r7.primitives
                java.util.List r0 = r0.getRawPrimitives()
                java.util.Iterator r0 = r0.iterator()
            L5b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L7d
                java.lang.Object r1 = r0.next()
                com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
                java.lang.Object r2 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L5b
                com.google.crypto.tink.DeterministicAead r2 = (com.google.crypto.tink.DeterministicAead) r2     // Catch: java.security.GeneralSecurityException -> L5b
                byte[] r2 = r2.decryptDeterministically(r8, r9)     // Catch: java.security.GeneralSecurityException -> L5b
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r3 = r7.decLogger     // Catch: java.security.GeneralSecurityException -> L5b
                int r1 = r1.getKeyId()     // Catch: java.security.GeneralSecurityException -> L5b
                int r4 = r8.length     // Catch: java.security.GeneralSecurityException -> L5b
                long r4 = (long) r4     // Catch: java.security.GeneralSecurityException -> L5b
                r3.log(r1, r4)     // Catch: java.security.GeneralSecurityException -> L5b
                return r2
            L7d:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r8 = r7.decLogger
                r8.logFailure()
                java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
                java.lang.String r9 = "decryption failed"
                r8.<init>(r9)
                throw r8
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] encryptDeterministically(byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
                r4 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r0 = r4.primitives     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()     // Catch: java.security.GeneralSecurityException -> L34
                byte[] r0 = r0.getIdentifier()     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r1 = r4.primitives     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L34
                java.lang.Object r1 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.DeterministicAead r1 = (com.google.crypto.tink.DeterministicAead) r1     // Catch: java.security.GeneralSecurityException -> L34
                byte[] r6 = r1.encryptDeterministically(r5, r6)     // Catch: java.security.GeneralSecurityException -> L34
                byte[][] r6 = new byte[][]{r0, r6}     // Catch: java.security.GeneralSecurityException -> L34
                byte[] r6 = com.google.crypto.tink.subtle.Bytes.concat(r6)     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r4.encLogger     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r1 = r4.primitives     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L34
                int r1 = r1.getKeyId()     // Catch: java.security.GeneralSecurityException -> L34
                int r5 = r5.length     // Catch: java.security.GeneralSecurityException -> L34
                long r2 = (long) r5     // Catch: java.security.GeneralSecurityException -> L34
                r0.log(r1, r2)     // Catch: java.security.GeneralSecurityException -> L34
                return r6
            L34:
                r5 = move-exception
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r6 = r4.encLogger
                r6.logFailure()
                throw r5
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.daead.DeterministicAeadWrapper> r0 = com.google.crypto.tink.daead.DeterministicAeadWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.daead.DeterministicAeadWrapper.logger = r0
            com.google.crypto.tink.daead.DeterministicAeadWrapper r0 = new com.google.crypto.tink.daead.DeterministicAeadWrapper
            r0.<init>()
            com.google.crypto.tink.daead.DeterministicAeadWrapper.WRAPPER = r0
            return
    }

    DeterministicAeadWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.crypto.tink.daead.DeterministicAeadWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.daead.DeterministicAeadWrapper r0 = com.google.crypto.tink.daead.DeterministicAeadWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.DeterministicAead> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r0 = com.google.crypto.tink.DeterministicAead.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.DeterministicAead> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r0 = com.google.crypto.tink.DeterministicAead.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.DeterministicAead wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r2) {
            r1 = this;
            com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead r0 = new com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.DeterministicAead wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.DeterministicAead> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.DeterministicAead r1 = r0.wrap(r1)
            return r1
    }
}
