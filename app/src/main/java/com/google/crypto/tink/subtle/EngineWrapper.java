package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public interface EngineWrapper<T> {

    public static class TCipher implements com.google.crypto.tink.subtle.EngineWrapper<javax.crypto.Cipher> {
        public TCipher() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ javax.crypto.Cipher getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                javax.crypto.Cipher r1 = r0.getInstance2(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* JADX INFO: renamed from: getInstance, reason: avoid collision after fix types in other method */
        public javax.crypto.Cipher getInstance2(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                if (r2 != 0) goto L7
                javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
                return r1
            L7:
                javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1, r2)
                return r1
        }
    }

    public static class TKeyAgreement implements com.google.crypto.tink.subtle.EngineWrapper<javax.crypto.KeyAgreement> {
        public TKeyAgreement() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ javax.crypto.KeyAgreement getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                javax.crypto.KeyAgreement r1 = r0.getInstance2(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* JADX INFO: renamed from: getInstance, reason: avoid collision after fix types in other method */
        public javax.crypto.KeyAgreement getInstance2(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                if (r2 != 0) goto L7
                javax.crypto.KeyAgreement r1 = javax.crypto.KeyAgreement.getInstance(r1)
                return r1
            L7:
                javax.crypto.KeyAgreement r1 = javax.crypto.KeyAgreement.getInstance(r1, r2)
                return r1
        }
    }

    public static class TKeyFactory implements com.google.crypto.tink.subtle.EngineWrapper<java.security.KeyFactory> {
        public TKeyFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ java.security.KeyFactory getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                java.security.KeyFactory r1 = r0.getInstance2(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* JADX INFO: renamed from: getInstance, reason: avoid collision after fix types in other method */
        public java.security.KeyFactory getInstance2(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                if (r2 != 0) goto L7
                java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)
                return r1
            L7:
                java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1, r2)
                return r1
        }
    }

    public static class TKeyPairGenerator implements com.google.crypto.tink.subtle.EngineWrapper<java.security.KeyPairGenerator> {
        public TKeyPairGenerator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ java.security.KeyPairGenerator getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                java.security.KeyPairGenerator r1 = r0.getInstance2(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* JADX INFO: renamed from: getInstance, reason: avoid collision after fix types in other method */
        public java.security.KeyPairGenerator getInstance2(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                if (r2 != 0) goto L7
                java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1)
                return r1
            L7:
                java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1, r2)
                return r1
        }
    }

    public static class TMac implements com.google.crypto.tink.subtle.EngineWrapper<javax.crypto.Mac> {
        public TMac() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ javax.crypto.Mac getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                javax.crypto.Mac r1 = r0.getInstance2(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* JADX INFO: renamed from: getInstance, reason: avoid collision after fix types in other method */
        public javax.crypto.Mac getInstance2(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                if (r2 != 0) goto L7
                javax.crypto.Mac r1 = javax.crypto.Mac.getInstance(r1)
                return r1
            L7:
                javax.crypto.Mac r1 = javax.crypto.Mac.getInstance(r1, r2)
                return r1
        }
    }

    public static class TMessageDigest implements com.google.crypto.tink.subtle.EngineWrapper<java.security.MessageDigest> {
        public TMessageDigest() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ java.security.MessageDigest getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                java.security.MessageDigest r1 = r0.getInstance2(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* JADX INFO: renamed from: getInstance, reason: avoid collision after fix types in other method */
        public java.security.MessageDigest getInstance2(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                if (r2 != 0) goto L7
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
                return r1
            L7:
                java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1, r2)
                return r1
        }
    }

    public static class TSignature implements com.google.crypto.tink.subtle.EngineWrapper<java.security.Signature> {
        public TSignature() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ java.security.Signature getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                java.security.Signature r1 = r0.getInstance2(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* JADX INFO: renamed from: getInstance, reason: avoid collision after fix types in other method */
        public java.security.Signature getInstance2(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
                r0 = this;
                if (r2 != 0) goto L7
                java.security.Signature r1 = java.security.Signature.getInstance(r1)
                return r1
            L7:
                java.security.Signature r1 = java.security.Signature.getInstance(r1, r2)
                return r1
        }
    }

    T getInstance(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException;
}
