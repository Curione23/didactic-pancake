package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public final class CodeVerifierUtil {
    public static final int DEFAULT_CODE_VERIFIER_ENTROPY = 64;
    public static final int MAX_CODE_VERIFIER_ENTROPY = 96;
    public static final int MAX_CODE_VERIFIER_LENGTH = 128;
    public static final int MIN_CODE_VERIFIER_ENTROPY = 32;
    public static final int MIN_CODE_VERIFIER_LENGTH = 43;
    private static final int PKCE_BASE64_ENCODE_SETTINGS = 11;
    private static final java.util.regex.Pattern REGEX_CODE_VERIFIER = null;

    static {
            java.lang.String r0 = "^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            net.openid.appauth.CodeVerifierUtil.REGEX_CODE_VERIFIER = r0
            return
    }

    private CodeVerifierUtil() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This type is not intended to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static void checkCodeVerifier(java.lang.String r4) {
            r0 = 43
            int r1 = r4.length()
            r2 = 1
            r3 = 0
            if (r0 > r1) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r3
        Ld:
            java.lang.String r1 = "codeVerifier length is shorter than allowed by the PKCE specification"
            net.openid.appauth.Preconditions.checkArgument(r0, r1)
            int r0 = r4.length()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 > r1) goto L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            java.lang.String r0 = "codeVerifier length is longer than allowed by the PKCE specification"
            net.openid.appauth.Preconditions.checkArgument(r2, r0)
            java.util.regex.Pattern r0 = net.openid.appauth.CodeVerifierUtil.REGEX_CODE_VERIFIER
            java.util.regex.Matcher r4 = r0.matcher(r4)
            boolean r4 = r4.matches()
            java.lang.String r0 = "codeVerifier string contains illegal characters"
            net.openid.appauth.Preconditions.checkArgument(r4, r0)
            return
    }

    public static java.lang.String deriveCodeVerifierChallenge(java.lang.String r2) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.io.UnsupportedEncodingException -> L1a java.security.NoSuchAlgorithmException -> L2c
            java.lang.String r1 = "ISO_8859_1"
            byte[] r1 = r2.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L1a java.security.NoSuchAlgorithmException -> L2c
            r0.update(r1)     // Catch: java.io.UnsupportedEncodingException -> L1a java.security.NoSuchAlgorithmException -> L2c
            byte[] r0 = r0.digest()     // Catch: java.io.UnsupportedEncodingException -> L1a java.security.NoSuchAlgorithmException -> L2c
            r1 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L1a java.security.NoSuchAlgorithmException -> L2c
            return r2
        L1a:
            r2 = move-exception
            java.lang.String r0 = "ISO-8859-1 encoding not supported on this device!"
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            net.openid.appauth.internal.Logger.error(r0, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ISO-8859-1 encoding not supported"
            r0.<init>(r1, r2)
            throw r0
        L2c:
            r0 = move-exception
            java.lang.String r1 = "SHA-256 is not supported on this device! Using plain challenge"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            net.openid.appauth.internal.Logger.warn(r1, r0)
            return r2
    }

    public static java.lang.String generateRandomCodeVerifier() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 64
            java.lang.String r0 = generateRandomCodeVerifier(r0, r1)
            return r0
    }

    public static java.lang.String generateRandomCodeVerifier(java.security.SecureRandom r4, int r5) {
            java.lang.String r0 = "entropySource cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r4, r0)
            r0 = 32
            r1 = 1
            r2 = 0
            if (r0 > r5) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            java.lang.String r3 = "entropyBytes is less than the minimum permitted"
            net.openid.appauth.Preconditions.checkArgument(r0, r3)
            r0 = 96
            if (r5 > r0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            java.lang.String r0 = "entropyBytes is greater than the maximum permitted"
            net.openid.appauth.Preconditions.checkArgument(r1, r0)
            byte[] r5 = new byte[r5]
            r4.nextBytes(r5)
            r4 = 11
            java.lang.String r4 = android.util.Base64.encodeToString(r5, r4)
            return r4
    }

    public static java.lang.String getCodeVerifierChallengeMethod() {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L8
            java.lang.String r0 = "S256"
            return r0
        L8:
            java.lang.String r0 = "plain"
            return r0
    }
}
