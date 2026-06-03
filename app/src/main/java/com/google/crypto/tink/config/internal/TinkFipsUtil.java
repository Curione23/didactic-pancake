package com.google.crypto.tink.config.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class TinkFipsUtil {
    private static final java.util.concurrent.atomic.AtomicBoolean isRestrictedToFips = null;
    private static final java.util.logging.Logger logger = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.config.internal.TinkFipsUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public enum AlgorithmFipsCompatibility extends java.lang.Enum<com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility> {
        private static final /* synthetic */ com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility[] $VALUES = null;
        public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility ALGORITHM_NOT_FIPS = null;
        public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility ALGORITHM_REQUIRES_BORINGCRYPTO = null;



        static {
                com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility$1 r0 = new com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility$1
                java.lang.String r1 = "ALGORITHM_NOT_FIPS"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS = r0
                com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility$2 r1 = new com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility$2
                java.lang.String r3 = "ALGORITHM_REQUIRES_BORINGCRYPTO"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO = r1
                r3 = 2
                com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility[] r3 = new com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.$VALUES = r3
                return
        }

        AlgorithmFipsCompatibility(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ AlgorithmFipsCompatibility(java.lang.String r1, int r2, com.google.crypto.tink.config.internal.TinkFipsUtil.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility> r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r1 = (com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility) r1
                return r1
        }

        public static com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility[] values() {
                com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility[] r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility[] r0 = (com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility[]) r0
                return r0
        }

        public abstract boolean isCompatible();
    }

    static {
            java.lang.Class<com.google.crypto.tink.config.internal.TinkFipsUtil> r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.config.internal.TinkFipsUtil.logger = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.config.internal.TinkFipsUtil.isRestrictedToFips = r0
            return
    }

    private TinkFipsUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.Boolean checkConscryptIsAvailableAndUsesFipsBoringSsl() {
            r0 = 0
            java.lang.String r1 = "org.conscrypt.Conscrypt"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "isBoringSslFIPSBuild"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L19
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L19
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L19
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L19
            return r1
        L19:
            java.util.logging.Logger r1 = com.google.crypto.tink.config.internal.TinkFipsUtil.logger
            java.lang.String r2 = "Conscrypt is not available or does not support checking for FIPS build."
            r1.info(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public static boolean fipsModuleAvailable() {
            java.lang.Boolean r0 = checkConscryptIsAvailableAndUsesFipsBoringSsl()
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static void setFipsRestricted() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.isRestrictedToFips
            r1 = 1
            r0.set(r1)
            return
    }

    public static void unsetFipsRestricted() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.isRestrictedToFips
            r1 = 0
            r0.set(r1)
            return
    }

    public static boolean useOnlyFips() {
            boolean r0 = com.google.crypto.tink.config.internal.TinkFipsStatus.useOnlyFips()
            if (r0 != 0) goto L11
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.isRestrictedToFips
            boolean r0 = r0.get()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }
}
