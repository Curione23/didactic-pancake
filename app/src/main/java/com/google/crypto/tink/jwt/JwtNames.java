package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes2.dex */
final class JwtNames {
    static final java.lang.String CLAIM_AUDIENCE = "aud";
    static final java.lang.String CLAIM_EXPIRATION = "exp";
    static final java.lang.String CLAIM_ISSUED_AT = "iat";
    static final java.lang.String CLAIM_ISSUER = "iss";
    static final java.lang.String CLAIM_JWT_ID = "jti";
    static final java.lang.String CLAIM_NOT_BEFORE = "nbf";
    static final java.lang.String CLAIM_SUBJECT = "sub";
    static final java.lang.String HEADER_ALGORITHM = "alg";
    static final java.lang.String HEADER_CRITICAL = "crit";
    static final java.lang.String HEADER_KEY_ID = "kid";
    static final java.lang.String HEADER_TYPE = "typ";

    private JwtNames() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isRegisteredName(java.lang.String r1) {
            java.lang.String r0 = "iss"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "sub"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "aud"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "exp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "nbf"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "iat"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "jti"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            r1 = 0
            goto L3c
        L3b:
            r1 = 1
        L3c:
            return r1
    }

    static void validate(java.lang.String r2) {
            boolean r0 = isRegisteredName(r2)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "claim '%s' is invalid because it's a registered name; use the corresponding setter method."
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }
}
