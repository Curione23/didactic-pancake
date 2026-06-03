package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.EngineWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class EngineFactory<T_WRAPPER extends com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT>, JcePrimitiveT> {
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TCipher, javax.crypto.Cipher> CIPHER = null;
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TKeyAgreement, javax.crypto.KeyAgreement> KEY_AGREEMENT = null;
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TKeyFactory, java.security.KeyFactory> KEY_FACTORY = null;
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TKeyPairGenerator, java.security.KeyPairGenerator> KEY_PAIR_GENERATOR = null;
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TMac, javax.crypto.Mac> MAC = null;
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TMessageDigest, java.security.MessageDigest> MESSAGE_DIGEST = null;
    public static final com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper.TSignature, java.security.Signature> SIGNATURE = null;
    private final com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> policy;

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.EngineFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class AndroidPolicy<JcePrimitiveT> implements com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> {
        private final com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> jceFactory;

        private AndroidPolicy(com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r1) {
                r0 = this;
                r0.<init>()
                r0.jceFactory = r1
                return
        }

        /* synthetic */ AndroidPolicy(com.google.crypto.tink.subtle.EngineWrapper r1, com.google.crypto.tink.subtle.EngineFactory.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String r6) throws java.security.GeneralSecurityException {
                r5 = this;
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                java.lang.String r2 = "GmsCore_OpenSSL"
                r0[r1] = r2
                r1 = 1
                java.lang.String r2 = "AndroidOpenSSL"
                r0[r1] = r2
                java.util.List r0 = com.google.crypto.tink.subtle.EngineFactory.toProviderList(r0)
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
                r2 = r1
            L17:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L2f
                java.lang.Object r3 = r0.next()
                java.security.Provider r3 = (java.security.Provider) r3
                com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r4 = r5.jceFactory     // Catch: java.lang.Exception -> L2a
                java.lang.Object r6 = r4.getInstance(r6, r3)     // Catch: java.lang.Exception -> L2a
                return r6
            L2a:
                r3 = move-exception
                if (r2 != 0) goto L17
                r2 = r3
                goto L17
            L2f:
                com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r0 = r5.jceFactory
                java.lang.Object r6 = r0.getInstance(r6, r1)
                return r6
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String r1, java.util.List<java.security.Provider> r2) throws java.security.GeneralSecurityException {
                r0 = this;
                java.lang.Object r1 = r0.getInstance(r1)
                return r1
        }
    }

    private static class DefaultPolicy<JcePrimitiveT> implements com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> {
        private final com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> jceFactory;

        private DefaultPolicy(com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r1) {
                r0 = this;
                r0.<init>()
                r0.jceFactory = r1
                return
        }

        /* synthetic */ DefaultPolicy(com.google.crypto.tink.subtle.EngineWrapper r1, com.google.crypto.tink.subtle.EngineFactory.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String r3) throws java.security.GeneralSecurityException {
                r2 = this;
                com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r0 = r2.jceFactory
                r1 = 0
                java.lang.Object r3 = r0.getInstance(r3, r1)
                return r3
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String r3, java.util.List<java.security.Provider> r4) throws java.security.GeneralSecurityException {
                r2 = this;
                java.util.Iterator r4 = r4.iterator()
            L4:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L17
                java.lang.Object r0 = r4.next()
                java.security.Provider r0 = (java.security.Provider) r0
                com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r1 = r2.jceFactory     // Catch: java.lang.Exception -> L4
                java.lang.Object r3 = r1.getInstance(r3, r0)     // Catch: java.lang.Exception -> L4
                return r3
            L17:
                java.lang.Object r3 = r2.getInstance(r3)
                return r3
        }
    }

    private static class FipsPolicy<JcePrimitiveT> implements com.google.crypto.tink.subtle.EngineFactory.Policy<JcePrimitiveT> {
        private final com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> jceFactory;

        private FipsPolicy(com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r1) {
                r0 = this;
                r0.<init>()
                r0.jceFactory = r1
                return
        }

        /* synthetic */ FipsPolicy(com.google.crypto.tink.subtle.EngineWrapper r1, com.google.crypto.tink.subtle.EngineFactory.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String r5) throws java.security.GeneralSecurityException {
                r4 = this;
                r0 = 3
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                java.lang.String r2 = "GmsCore_OpenSSL"
                r0[r1] = r2
                r1 = 1
                java.lang.String r2 = "AndroidOpenSSL"
                r0[r1] = r2
                r1 = 2
                java.lang.String r2 = "Conscrypt"
                r0[r1] = r2
                java.util.List r0 = com.google.crypto.tink.subtle.EngineFactory.toProviderList(r0)
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L1b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L33
                java.lang.Object r2 = r0.next()
                java.security.Provider r2 = (java.security.Provider) r2
                com.google.crypto.tink.subtle.EngineWrapper<JcePrimitiveT> r3 = r4.jceFactory     // Catch: java.lang.Exception -> L2e
                java.lang.Object r5 = r3.getInstance(r5, r2)     // Catch: java.lang.Exception -> L2e
                return r5
            L2e:
                r2 = move-exception
                if (r1 != 0) goto L1b
                r1 = r2
                goto L1b
            L33:
                java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
                java.lang.String r0 = "No good Provider found."
                r5.<init>(r0, r1)
                throw r5
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
        public JcePrimitiveT getInstance(java.lang.String r1, java.util.List<java.security.Provider> r2) throws java.security.GeneralSecurityException {
                r0 = this;
                java.lang.Object r1 = r0.getInstance(r1)
                return r1
        }
    }

    private interface Policy<JcePrimitiveT> {
        JcePrimitiveT getInstance(java.lang.String r1) throws java.security.GeneralSecurityException;

        JcePrimitiveT getInstance(java.lang.String r1, java.util.List<java.security.Provider> r2) throws java.security.GeneralSecurityException;
    }

    static {
            com.google.crypto.tink.subtle.EngineFactory r0 = new com.google.crypto.tink.subtle.EngineFactory
            com.google.crypto.tink.subtle.EngineWrapper$TCipher r1 = new com.google.crypto.tink.subtle.EngineWrapper$TCipher
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EngineFactory.CIPHER = r0
            com.google.crypto.tink.subtle.EngineFactory r0 = new com.google.crypto.tink.subtle.EngineFactory
            com.google.crypto.tink.subtle.EngineWrapper$TMac r1 = new com.google.crypto.tink.subtle.EngineWrapper$TMac
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EngineFactory.MAC = r0
            com.google.crypto.tink.subtle.EngineFactory r0 = new com.google.crypto.tink.subtle.EngineFactory
            com.google.crypto.tink.subtle.EngineWrapper$TSignature r1 = new com.google.crypto.tink.subtle.EngineWrapper$TSignature
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EngineFactory.SIGNATURE = r0
            com.google.crypto.tink.subtle.EngineFactory r0 = new com.google.crypto.tink.subtle.EngineFactory
            com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest r1 = new com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST = r0
            com.google.crypto.tink.subtle.EngineFactory r0 = new com.google.crypto.tink.subtle.EngineFactory
            com.google.crypto.tink.subtle.EngineWrapper$TKeyAgreement r1 = new com.google.crypto.tink.subtle.EngineWrapper$TKeyAgreement
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EngineFactory.KEY_AGREEMENT = r0
            com.google.crypto.tink.subtle.EngineFactory r0 = new com.google.crypto.tink.subtle.EngineFactory
            com.google.crypto.tink.subtle.EngineWrapper$TKeyPairGenerator r1 = new com.google.crypto.tink.subtle.EngineWrapper$TKeyPairGenerator
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EngineFactory.KEY_PAIR_GENERATOR = r0
            com.google.crypto.tink.subtle.EngineFactory r0 = new com.google.crypto.tink.subtle.EngineFactory
            com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory r1 = new com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory
            r1.<init>()
            r0.<init>(r1)
            com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY = r0
            return
    }

    public EngineFactory(T_WRAPPER r3) {
            r2 = this;
            r2.<init>()
            boolean r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()
            r1 = 0
            if (r0 == 0) goto L12
            com.google.crypto.tink.subtle.EngineFactory$FipsPolicy r0 = new com.google.crypto.tink.subtle.EngineFactory$FipsPolicy
            r0.<init>(r3, r1)
            r2.policy = r0
            goto L27
        L12:
            boolean r0 = com.google.crypto.tink.subtle.SubtleUtil.isAndroid()
            if (r0 == 0) goto L20
            com.google.crypto.tink.subtle.EngineFactory$AndroidPolicy r0 = new com.google.crypto.tink.subtle.EngineFactory$AndroidPolicy
            r0.<init>(r3, r1)
            r2.policy = r0
            goto L27
        L20:
            com.google.crypto.tink.subtle.EngineFactory$DefaultPolicy r0 = new com.google.crypto.tink.subtle.EngineFactory$DefaultPolicy
            r0.<init>(r3, r1)
            r2.policy = r0
        L27:
            return
    }

    public static java.util.List<java.security.Provider> toProviderList(java.lang.String... r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L17
            r3 = r4[r2]
            java.security.Provider r3 = java.security.Security.getProvider(r3)
            if (r3 == 0) goto L14
            r0.add(r3)
        L14:
            int r2 = r2 + 1
            goto L7
        L17:
            return r0
    }

    public JcePrimitiveT getInstance(java.lang.String r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.EngineFactory$Policy<JcePrimitiveT> r0 = r1.policy
            java.lang.Object r2 = r0.getInstance(r2)
            return r2
    }

    JcePrimitiveT getInstance(java.lang.String r2, java.util.List<java.security.Provider> r3) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.EngineFactory$Policy<JcePrimitiveT> r0 = r1.policy
            java.lang.Object r2 = r0.getInstance(r2, r3)
            return r2
    }
}
