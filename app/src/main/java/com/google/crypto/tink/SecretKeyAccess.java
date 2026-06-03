package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.errorprone.annotations.CheckReturnValue
public final class SecretKeyAccess {
    private static final com.google.crypto.tink.SecretKeyAccess INSTANCE = null;

    static {
            com.google.crypto.tink.SecretKeyAccess r0 = new com.google.crypto.tink.SecretKeyAccess
            r0.<init>()
            com.google.crypto.tink.SecretKeyAccess.INSTANCE = r0
            return
    }

    private SecretKeyAccess() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.SecretKeyAccess instance() {
            com.google.crypto.tink.SecretKeyAccess r0 = com.google.crypto.tink.SecretKeyAccess.INSTANCE
            return r0
    }

    public static com.google.crypto.tink.SecretKeyAccess requireAccess(@javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r1) throws java.security.GeneralSecurityException {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "SecretKeyAccess is required"
            r1.<init>(r0)
            throw r1
    }
}
