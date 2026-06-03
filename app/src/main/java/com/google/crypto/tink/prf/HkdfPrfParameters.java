package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes2.dex */
public final class HkdfPrfParameters extends com.google.crypto.tink.prf.PrfParameters {
    private static final int MIN_KEY_SIZE = 16;
    private final com.google.crypto.tink.prf.HkdfPrfParameters.HashType hashType;
    private final int keySizeBytes;

    @javax.annotation.Nullable
    private final com.google.crypto.tink.util.Bytes salt;

    /* JADX INFO: renamed from: com.google.crypto.tink.prf.HkdfPrfParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.prf.HkdfPrfParameters.HashType hashType;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.Bytes salt;

        private Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.keySizeBytes = r0
                r1.hashType = r0
                r1.salt = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.prf.HkdfPrfParameters.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.prf.HkdfPrfParameters build() throws java.security.GeneralSecurityException {
                r5 = this;
                java.lang.Integer r0 = r5.keySizeBytes
                if (r0 == 0) goto L21
                com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = r5.hashType
                if (r0 == 0) goto L19
                com.google.crypto.tink.prf.HkdfPrfParameters r0 = new com.google.crypto.tink.prf.HkdfPrfParameters
                java.lang.Integer r1 = r5.keySizeBytes
                int r1 = r1.intValue()
                com.google.crypto.tink.prf.HkdfPrfParameters$HashType r2 = r5.hashType
                com.google.crypto.tink.util.Bytes r3 = r5.salt
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
            L19:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "hash type is not set"
                r0.<init>(r1)
                throw r0
            L21:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "key size is not set"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.prf.HkdfPrfParameters.Builder setHashType(com.google.crypto.tink.prf.HkdfPrfParameters.HashType r1) {
                r0 = this;
                r0.hashType = r1
                return r0
        }

        public com.google.crypto.tink.prf.HkdfPrfParameters.Builder setKeySizeBytes(int r3) throws java.security.GeneralSecurityException {
                r2 = this;
                r0 = 16
                if (r3 < r0) goto Lb
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.keySizeBytes = r3
                return r2
            Lb:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
                int r3 = r3 * 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                java.lang.String r1 = "Invalid key size %d; only 128-bit or larger are supported"
                java.lang.String r3 = java.lang.String.format(r1, r3)
                r0.<init>(r3)
                throw r0
        }

        public com.google.crypto.tink.prf.HkdfPrfParameters.Builder setSalt(com.google.crypto.tink.util.Bytes r2) {
                r1 = this;
                int r0 = r2.size()
                if (r0 != 0) goto L7
                return r1
            L7:
                r1.salt = r2
                return r1
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA1 = null;
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA224 = null;
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA256 = null;
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA384 = null;
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA512 = null;
        private final java.lang.String name;

        static {
                com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = new com.google.crypto.tink.prf.HkdfPrfParameters$HashType
                java.lang.String r1 = "SHA1"
                r0.<init>(r1)
                com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA1 = r0
                com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = new com.google.crypto.tink.prf.HkdfPrfParameters$HashType
                java.lang.String r1 = "SHA224"
                r0.<init>(r1)
                com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA224 = r0
                com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = new com.google.crypto.tink.prf.HkdfPrfParameters$HashType
                java.lang.String r1 = "SHA256"
                r0.<init>(r1)
                com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256 = r0
                com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = new com.google.crypto.tink.prf.HkdfPrfParameters$HashType
                java.lang.String r1 = "SHA384"
                r0.<init>(r1)
                com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA384 = r0
                com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = new com.google.crypto.tink.prf.HkdfPrfParameters$HashType
                java.lang.String r1 = "SHA512"
                r0.<init>(r1)
                com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512 = r0
                return
        }

        private HashType(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    private HkdfPrfParameters(int r1, com.google.crypto.tink.prf.HkdfPrfParameters.HashType r2, com.google.crypto.tink.util.Bytes r3) {
            r0 = this;
            r0.<init>()
            r0.keySizeBytes = r1
            r0.hashType = r2
            r0.salt = r3
            return
    }

    /* synthetic */ HkdfPrfParameters(int r1, com.google.crypto.tink.prf.HkdfPrfParameters.HashType r2, com.google.crypto.tink.util.Bytes r3, com.google.crypto.tink.prf.HkdfPrfParameters.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static com.google.crypto.tink.prf.HkdfPrfParameters.Builder builder() {
            com.google.crypto.tink.prf.HkdfPrfParameters$Builder r0 = new com.google.crypto.tink.prf.HkdfPrfParameters$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.prf.HkdfPrfParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.crypto.tink.prf.HkdfPrfParameters r4 = (com.google.crypto.tink.prf.HkdfPrfParameters) r4
            int r0 = r4.getKeySizeBytes()
            int r2 = r3.getKeySizeBytes()
            if (r0 != r2) goto L2b
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = r4.getHashType()
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r2 = r3.getHashType()
            if (r0 != r2) goto L2b
            com.google.crypto.tink.util.Bytes r4 = r4.getSalt()
            com.google.crypto.tink.util.Bytes r0 = r3.getSalt()
            boolean r4 = java.util.Objects.equals(r4, r0)
            if (r4 == 0) goto L2b
            r1 = 1
        L2b:
            return r1
    }

    public com.google.crypto.tink.prf.HkdfPrfParameters.HashType getHashType() {
            r1 = this;
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r0 = r1.hashType
            return r0
    }

    public int getKeySizeBytes() {
            r1 = this;
            int r0 = r1.keySizeBytes
            return r0
    }

    @javax.annotation.Nullable
    public com.google.crypto.tink.util.Bytes getSalt() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.salt
            return r0
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.keySizeBytes
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r1 = r3.hashType
            com.google.crypto.tink.util.Bytes r2 = r3.salt
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HKDF PRF Parameters (hashType: "
            r0.<init>(r1)
            com.google.crypto.tink.prf.HkdfPrfParameters$HashType r1 = r2.hashType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", salt: "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.util.Bytes r1 = r2.salt
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", and "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.keySizeBytes
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-byte key)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
