package com.google.crypto.tink.util;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class SecretBigInteger {
    private final java.math.BigInteger value;

    private SecretBigInteger(java.math.BigInteger r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public static com.google.crypto.tink.util.SecretBigInteger fromBigInteger(java.math.BigInteger r0, com.google.crypto.tink.SecretKeyAccess r1) {
            if (r1 == 0) goto L8
            com.google.crypto.tink.util.SecretBigInteger r1 = new com.google.crypto.tink.util.SecretBigInteger
            r1.<init>(r0)
            return r1
        L8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess required"
            r0.<init>(r1)
            throw r0
    }

    public boolean equalsSecretBigInteger(com.google.crypto.tink.util.SecretBigInteger r2) {
            r1 = this;
            java.math.BigInteger r0 = r1.value
            byte[] r0 = r0.toByteArray()
            java.math.BigInteger r2 = r2.value
            byte[] r2 = r2.toByteArray()
            boolean r2 = java.security.MessageDigest.isEqual(r0, r2)
            return r2
    }

    public java.math.BigInteger getBigInteger(com.google.crypto.tink.SecretKeyAccess r2) {
            r1 = this;
            if (r2 == 0) goto L5
            java.math.BigInteger r2 = r1.value
            return r2
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "SecretKeyAccess required"
            r2.<init>(r0)
            throw r2
    }
}
