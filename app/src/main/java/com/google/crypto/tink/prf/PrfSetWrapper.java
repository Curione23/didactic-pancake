package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public class PrfSetWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.prf.Prf, com.google.crypto.tink.prf.PrfSet> {
    private static final com.google.crypto.tink.prf.PrfSetWrapper WRAPPER = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.prf.PrfSetWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class WrappedPrfSet extends com.google.crypto.tink.prf.PrfSet {
        private final java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> keyIdToPrfMap;
        private final int primaryKeyId;

        @com.google.errorprone.annotations.Immutable
        private static class PrfWithMonitoring implements com.google.crypto.tink.prf.Prf {
            private final int keyId;
            private final com.google.crypto.tink.monitoring.MonitoringClient.Logger logger;
            private final com.google.crypto.tink.prf.Prf prf;

            public PrfWithMonitoring(com.google.crypto.tink.prf.Prf r1, int r2, com.google.crypto.tink.monitoring.MonitoringClient.Logger r3) {
                    r0 = this;
                    r0.<init>()
                    r0.prf = r1
                    r0.keyId = r2
                    r0.logger = r3
                    return
            }

            @Override // com.google.crypto.tink.prf.Prf
            public byte[] compute(byte[] r5, int r6) throws java.security.GeneralSecurityException {
                    r4 = this;
                    com.google.crypto.tink.prf.Prf r0 = r4.prf     // Catch: java.security.GeneralSecurityException -> L10
                    byte[] r6 = r0.compute(r5, r6)     // Catch: java.security.GeneralSecurityException -> L10
                    com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r4.logger     // Catch: java.security.GeneralSecurityException -> L10
                    int r1 = r4.keyId     // Catch: java.security.GeneralSecurityException -> L10
                    int r5 = r5.length     // Catch: java.security.GeneralSecurityException -> L10
                    long r2 = (long) r5     // Catch: java.security.GeneralSecurityException -> L10
                    r0.log(r1, r2)     // Catch: java.security.GeneralSecurityException -> L10
                    return r6
                L10:
                    r5 = move-exception
                    com.google.crypto.tink.monitoring.MonitoringClient$Logger r6 = r4.logger
                    r6.logFailure()
                    throw r5
            }
        }

        private WrappedPrfSet(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.prf.Prf> r7) throws java.security.GeneralSecurityException {
                r6 = this;
                r6.<init>()
                java.util.List r0 = r7.getRawPrimitives()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto La8
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r7.getPrimary()
                if (r0 == 0) goto La0
                boolean r0 = r7.hasAnnotations()
                if (r0 == 0) goto L2e
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r7)
                java.lang.String r2 = "prf"
                java.lang.String r3 = "compute"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r0.createLogger(r1, r2, r3)
                goto L30
            L2e:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
            L30:
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r7.getPrimary()
                int r1 = r1.getKeyId()
                r6.primaryKeyId = r1
                java.util.List r7 = r7.getRawPrimitives()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Iterator r7 = r7.iterator()
            L47:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L99
                java.lang.Object r2 = r7.next()
                com.google.crypto.tink.PrimitiveSet$Entry r2 = (com.google.crypto.tink.PrimitiveSet.Entry) r2
                com.google.crypto.tink.proto.OutputPrefixType r3 = r2.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.RAW
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L7a
                int r3 = r2.getKeyId()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet$PrfWithMonitoring r4 = new com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet$PrfWithMonitoring
                java.lang.Object r5 = r2.getPrimitive()
                com.google.crypto.tink.prf.Prf r5 = (com.google.crypto.tink.prf.Prf) r5
                int r2 = r2.getKeyId()
                r4.<init>(r5, r2, r0)
                r1.put(r3, r4)
                goto L47
            L7a:
                java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Key "
                r0.<init>(r1)
                int r1 = r2.getKeyId()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " has non raw prefix type"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L99:
                java.util.Map r7 = java.util.Collections.unmodifiableMap(r1)
                r6.keyIdToPrfMap = r7
                return
            La0:
                java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
                java.lang.String r0 = "Primary key not set."
                r7.<init>(r0)
                throw r7
            La8:
                java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
                java.lang.String r0 = "No primitives provided."
                r7.<init>(r0)
                throw r7
        }

        /* synthetic */ WrappedPrfSet(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.prf.PrfSetWrapper.AnonymousClass1 r2) throws java.security.GeneralSecurityException {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> getPrfs() throws java.security.GeneralSecurityException {
                r1 = this;
                java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> r0 = r1.keyIdToPrfMap
                return r0
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public int getPrimaryId() {
                r1 = this;
                int r0 = r1.primaryKeyId
                return r0
        }
    }

    static {
            com.google.crypto.tink.prf.PrfSetWrapper r0 = new com.google.crypto.tink.prf.PrfSetWrapper
            r0.<init>()
            com.google.crypto.tink.prf.PrfSetWrapper.WRAPPER = r0
            return
    }

    public PrfSetWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.PrfSetWrapper r0 = com.google.crypto.tink.prf.PrfSetWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.prf.Prf> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.prf.Prf> r0 = com.google.crypto.tink.prf.Prf.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.prf.PrfSet> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.prf.PrfSet> r0 = com.google.crypto.tink.prf.PrfSet.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.prf.PrfSet wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.prf.Prf> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet r0 = new com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.prf.PrfSet wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.prf.Prf> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.prf.PrfSet r1 = r0.wrap(r1)
            return r1
    }
}
