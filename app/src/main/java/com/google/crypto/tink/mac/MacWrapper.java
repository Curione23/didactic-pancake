package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes2.dex */
class MacWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.Mac, com.google.crypto.tink.Mac> {
    private static final byte[] FORMAT_VERSION = null;
    private static final com.google.crypto.tink.mac.MacWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.MacWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class WrappedMac implements com.google.crypto.tink.Mac {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger computeLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> primitives;
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger verifyLogger;

        private WrappedMac(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r4) {
                r3 = this;
                r3.<init>()
                r3.primitives = r4
                boolean r0 = r4.hasAnnotations()
                if (r0 == 0) goto L2a
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r4 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r4)
                java.lang.String r1 = "compute"
                java.lang.String r2 = "mac"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r0.createLogger(r4, r2, r1)
                r3.computeLogger = r1
                java.lang.String r1 = "verify"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r0.createLogger(r4, r2, r1)
                r3.verifyLogger = r4
                goto L32
            L2a:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r3.computeLogger = r4
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r3.verifyLogger = r4
            L32:
                return
        }

        /* synthetic */ WrappedMac(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.mac.MacWrapper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.Mac
        public byte[] computeMac(byte[] r6) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r0 = r5.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1e
                byte[] r0 = com.google.crypto.tink.mac.MacWrapper.access$000()
                byte[][] r6 = new byte[][]{r6, r0}
                byte[] r6 = com.google.crypto.tink.subtle.Bytes.concat(r6)
            L1e:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r0 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()     // Catch: java.security.GeneralSecurityException -> L52
                byte[] r0 = r0.getIdentifier()     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r1 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L52
                java.lang.Object r1 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.Mac r1 = (com.google.crypto.tink.Mac) r1     // Catch: java.security.GeneralSecurityException -> L52
                byte[] r1 = r1.computeMac(r6)     // Catch: java.security.GeneralSecurityException -> L52
                byte[][] r0 = new byte[][]{r0, r1}     // Catch: java.security.GeneralSecurityException -> L52
                byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.computeLogger     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r2 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.PrimitiveSet$Entry r2 = r2.getPrimary()     // Catch: java.security.GeneralSecurityException -> L52
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L52
                int r6 = r6.length     // Catch: java.security.GeneralSecurityException -> L52
                long r3 = (long) r6     // Catch: java.security.GeneralSecurityException -> L52
                r1.log(r2, r3)     // Catch: java.security.GeneralSecurityException -> L52
                return r0
            L52:
                r6 = move-exception
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r5.computeLogger
                r0.logFailure()
                throw r6
        }

        @Override // com.google.crypto.tink.Mac
        public void verifyMac(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
                r7 = this;
                int r0 = r8.length
                r1 = 5
                if (r0 <= r1) goto La2
                byte[] r0 = java.util.Arrays.copyOf(r8, r1)
                int r2 = r8.length
                byte[] r1 = java.util.Arrays.copyOfRange(r8, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r2 = r7.primitives
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
                byte[] r3 = com.google.crypto.tink.mac.MacWrapper.access$000()
                byte[][] r3 = new byte[][]{r9, r3}
                byte[] r3 = com.google.crypto.tink.subtle.Bytes.concat(r3)
                goto L3d
            L3c:
                r3 = r9
            L3d:
                java.lang.Object r4 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.Mac r4 = (com.google.crypto.tink.Mac) r4     // Catch: java.security.GeneralSecurityException -> L52
                r4.verifyMac(r1, r3)     // Catch: java.security.GeneralSecurityException -> L52
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r7.verifyLogger     // Catch: java.security.GeneralSecurityException -> L52
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L52
                int r3 = r3.length     // Catch: java.security.GeneralSecurityException -> L52
                long r5 = (long) r3     // Catch: java.security.GeneralSecurityException -> L52
                r4.log(r2, r5)     // Catch: java.security.GeneralSecurityException -> L52
                return
            L52:
                r2 = move-exception
                java.util.logging.Logger r3 = com.google.crypto.tink.mac.MacWrapper.access$100()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "tag prefix matches a key, but cannot verify: "
                r4.<init>(r5)
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.String r2 = r2.toString()
                r3.info(r2)
                goto L17
            L6a:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r0 = r7.primitives
                java.util.List r0 = r0.getRawPrimitives()
                java.util.Iterator r0 = r0.iterator()
            L74:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L95
                java.lang.Object r1 = r0.next()
                com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
                java.lang.Object r2 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L74
                com.google.crypto.tink.Mac r2 = (com.google.crypto.tink.Mac) r2     // Catch: java.security.GeneralSecurityException -> L74
                r2.verifyMac(r8, r9)     // Catch: java.security.GeneralSecurityException -> L74
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r7.verifyLogger     // Catch: java.security.GeneralSecurityException -> L74
                int r1 = r1.getKeyId()     // Catch: java.security.GeneralSecurityException -> L74
                int r3 = r9.length     // Catch: java.security.GeneralSecurityException -> L74
                long r3 = (long) r3     // Catch: java.security.GeneralSecurityException -> L74
                r2.log(r1, r3)     // Catch: java.security.GeneralSecurityException -> L74
                return
            L95:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r8 = r7.verifyLogger
                r8.logFailure()
                java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
                java.lang.String r9 = "invalid MAC"
                r8.<init>(r9)
                throw r8
            La2:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r8 = r7.verifyLogger
                r8.logFailure()
                java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
                java.lang.String r9 = "tag too short"
                r8.<init>(r9)
                throw r8
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.mac.MacWrapper> r0 = com.google.crypto.tink.mac.MacWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.mac.MacWrapper.logger = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.mac.MacWrapper.FORMAT_VERSION = r0
            com.google.crypto.tink.mac.MacWrapper r0 = new com.google.crypto.tink.mac.MacWrapper
            r0.<init>()
            com.google.crypto.tink.mac.MacWrapper.WRAPPER = r0
            return
    }

    MacWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = com.google.crypto.tink.mac.MacWrapper.FORMAT_VERSION
            return r0
    }

    static /* synthetic */ java.util.logging.Logger access$100() {
            java.util.logging.Logger r0 = com.google.crypto.tink.mac.MacWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.MacWrapper r0 = com.google.crypto.tink.mac.MacWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private void validateMacKeyPrefixes(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r5) throws java.security.GeneralSecurityException {
            r4 = this;
            java.util.Collection r5 = r5.getAll()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r5.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.PrimitiveSet$Entry r1 = (com.google.crypto.tink.PrimitiveSet.Entry) r1
            com.google.crypto.tink.Key r2 = r1.getKey()
            boolean r2 = r2 instanceof com.google.crypto.tink.mac.MacKey
            if (r2 == 0) goto L18
            com.google.crypto.tink.Key r2 = r1.getKey()
            com.google.crypto.tink.mac.MacKey r2 = (com.google.crypto.tink.mac.MacKey) r2
            byte[] r1 = r1.getIdentifier()
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r1)
            com.google.crypto.tink.util.Bytes r3 = r2.getOutputPrefix()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L45
            goto L18
        L45:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Mac Key with parameters "
            r0.<init>(r3)
            com.google.crypto.tink.mac.MacParameters r3 = r2.getParameters()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = " has wrong output prefix ("
            java.lang.StringBuilder r0 = r0.append(r3)
            com.google.crypto.tink.util.Bytes r2 = r2.getOutputPrefix()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = ") instead of ("
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L7c:
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Mac> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.Mac> r0 = com.google.crypto.tink.Mac.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Mac> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.Mac> r0 = com.google.crypto.tink.Mac.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.Mac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.validateMacKeyPrefixes(r3)
            com.google.crypto.tink.mac.MacWrapper$WrappedMac r0 = new com.google.crypto.tink.mac.MacWrapper$WrappedMac
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Mac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.Mac r1 = r0.wrap(r1)
            return r1
    }
}
