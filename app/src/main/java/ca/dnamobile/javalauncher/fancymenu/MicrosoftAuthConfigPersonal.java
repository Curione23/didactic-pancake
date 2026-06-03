package ca.dnamobile.javalauncher.fancymenu;

/* JADX INFO: loaded from: classes.dex */
public final class MicrosoftAuthConfigPersonal {
    public static final java.lang.String AUTH_URL = "https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize";
    private static final java.lang.String AZURE_AUTHORITY = "https://login.microsoftonline.com/consumers";
    public static final java.lang.String CALLBACK_SCHEME = "droidbridge";
    public static final java.lang.String CLIENT_ID = null;
    public static final java.lang.String MC_LOGIN_URL = "https://api.minecraftservices.com/authentication/login_with_xbox";
    public static final java.lang.String MC_PROFILE_URL = "https://api.minecraftservices.com/minecraft/profile";
    public static final java.lang.String MC_STORE_URL = "https://api.minecraftservices.com/entitlements/mcstore";
    public static final java.lang.String REDIRECT_URI = "droidbridge://auth";
    public static final java.lang.String REDIRECT_URL = "droidbridge://auth";
    public static final java.lang.String SCOPE = "XboxLive.signin offline_access";
    private static final java.security.SecureRandom SECURE_RANDOM = null;
    public static final java.lang.String TOKEN_URL = "https://login.microsoftonline.com/consumers/oauth2/v2.0/token";
    public static final boolean USE_AZURE_APP_REGISTRATION = true;
    public static final java.lang.String XBL_AUTH_URL = "https://user.auth.xboxlive.com/user/authenticate";
    public static final java.lang.String XSTS_AUTH_URL = "https://xsts.auth.xboxlive.com/xsts/authorize";
    private static java.lang.String pendingCodeVerifier;

    static {
            java.lang.String r0 = resolveClientId()
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.CLIENT_ID = r0
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.SECURE_RANDOM = r0
            return
    }

    private MicrosoftAuthConfigPersonal() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String base64UrlNoPadding(byte[] r1) {
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    public static synchronized android.net.Uri buildAuthorizationUriWithPkce(java.lang.String r4) {
            java.lang.Class<ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal> r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.class
            monitor-enter(r0)
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.pendingCodeVerifier = r4     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L57
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "client_id"
            java.lang.String r3 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.CLIENT_ID     // Catch: java.lang.Throwable -> L57
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "response_type"
            java.lang.String r3 = "code"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "scope"
            java.lang.String r3 = "XboxLive.signin offline_access"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "redirect_uri"
            java.lang.String r3 = "droidbridge://auth"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "response_mode"
            java.lang.String r3 = "query"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "prompt"
            java.lang.String r3 = "select_account"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "code_challenge"
            java.lang.String r4 = createCodeChallenge(r4)     // Catch: java.lang.Throwable -> L57
            android.net.Uri$Builder r4 = r1.appendQueryParameter(r2, r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "code_challenge_method"
            java.lang.String r2 = "S256"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r1, r2)     // Catch: java.lang.Throwable -> L57
            android.net.Uri r4 = r4.build()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            return r4
        L57:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r4
    }

    public static synchronized void clearCodeVerifier() {
            java.lang.Class<ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal> r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.class
            monitor-enter(r0)
            r1 = 0
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.pendingCodeVerifier = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public static java.lang.String createCodeChallenge(java.lang.String r2) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L15
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII     // Catch: java.lang.Exception -> L15
            byte[] r2 = r2.getBytes(r1)     // Catch: java.lang.Exception -> L15
            byte[] r2 = r0.digest(r2)     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = base64UrlNoPadding(r2)     // Catch: java.lang.Exception -> L15
            return r2
        L15:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unable to create PKCE code challenge"
            r0.<init>(r1, r2)
            throw r0
    }

    public static java.lang.String createCodeVerifier() {
            r0 = 64
            byte[] r0 = new byte[r0]
            java.security.SecureRandom r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.SECURE_RANDOM
            r1.nextBytes(r0)
            java.lang.String r0 = base64UrlNoPadding(r0)
            return r0
    }

    public static java.lang.String extractCode(android.net.Uri r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "code"
            java.lang.String r2 = r4.getQueryParameter(r1)
            if (r2 == 0) goto L13
            int r3 = r2.length()
            if (r3 <= 0) goto L13
            return r2
        L13:
            android.net.Uri r4 = parseFragment(r4)
            if (r4 == 0) goto L26
            java.lang.String r4 = r4.getQueryParameter(r1)
            if (r4 == 0) goto L26
            int r1 = r4.length()
            if (r1 <= 0) goto L26
            return r4
        L26:
            return r0
    }

    public static java.lang.String extractError(android.net.Uri r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "error_description"
            java.lang.String r2 = r5.getQueryParameter(r1)
            java.lang.String r3 = "error"
            if (r2 == 0) goto L14
            int r4 = r2.length()
            if (r4 != 0) goto L18
        L14:
            java.lang.String r2 = r5.getQueryParameter(r3)
        L18:
            if (r2 == 0) goto L21
            int r4 = r2.length()
            if (r4 <= 0) goto L21
            return r2
        L21:
            android.net.Uri r5 = parseFragment(r5)
            if (r5 == 0) goto L40
            java.lang.String r1 = r5.getQueryParameter(r1)
            if (r1 == 0) goto L33
            int r2 = r1.length()
            if (r2 != 0) goto L37
        L33:
            java.lang.String r1 = r5.getQueryParameter(r3)
        L37:
            if (r1 == 0) goto L40
            int r5 = r1.length()
            if (r5 <= 0) goto L40
            return r1
        L40:
            return r0
    }

    public static java.lang.String formatRpsTicket(java.lang.String r2) {
            java.lang.String r0 = "d="
            boolean r1 = r2.startsWith(r0)
            if (r1 == 0) goto L9
            goto L16
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r2 = r2.toString()
        L16:
            return r2
    }

    public static synchronized android.net.Uri getAuthorizationUri() {
            java.lang.Class<ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal> r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.class
            monitor-enter(r0)
            java.lang.String r1 = createCodeVerifier()     // Catch: java.lang.Throwable -> Lf
            ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.pendingCodeVerifier = r1     // Catch: java.lang.Throwable -> Lf
            android.net.Uri r1 = buildAuthorizationUriWithPkce(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static synchronized java.lang.String getPendingCodeVerifier() {
            java.lang.Class<ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal> r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.class
            monitor-enter(r0)
            java.lang.String r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.pendingCodeVerifier     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static java.lang.String getRedirectParameterName() {
            java.lang.String r0 = "redirect_uri"
            return r0
    }

    private static boolean isBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public static boolean isConfigured() {
            java.lang.String r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.CLIENT_ID
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L12
            java.lang.String r1 = "CHANGE_ME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static boolean isRedirect(java.lang.String r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r1)
            java.lang.String r1 = "droidbridge://auth"
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "droidbridge"
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r1 = r5.startsWith(r1)
            if (r1 != 0) goto L39
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L3a
        L39:
            r0 = 1
        L3a:
            return r0
    }

    private static android.net.Uri parseFragment(android.net.Uri r2) {
            java.lang.String r2 = r2.getFragment()
            if (r2 == 0) goto L21
            int r0 = r2.length()
            if (r0 != 0) goto Ld
            goto L21
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://localhost/?"
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L21:
            r2 = 0
            return r2
    }

    private static java.lang.String readBuildConfigString(java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = "ca.dnamobile.javalauncher.BuildConfig"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L12
            return r0
        L12:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L2a
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L29
            goto L2a
        L29:
            return r2
        L2a:
            return r0
    }

    public static synchronized java.lang.String requireCodeVerifier() {
            java.lang.Class<ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal> r0 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.class
            monitor-enter(r0)
            java.lang.String r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.pendingCodeVerifier     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L11
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L11
            java.lang.String r1 = ca.dnamobile.javalauncher.fancymenu.MicrosoftAuthConfigPersonal.pendingCodeVerifier     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return r1
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "Missing PKCE code verifier. Start Microsoft sign-in again."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            throw r1     // Catch: java.lang.Throwable -> L19
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    private static java.lang.String resolveClientId() {
            java.lang.String r0 = "MICROSOFT_CLIENT_ID"
            java.lang.String r0 = readBuildConfigString(r0)
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L11
            java.lang.String r0 = r0.trim()
            return r0
        L11:
            java.lang.String r0 = "AZURE_CLIENT_ID"
            java.lang.String r0 = readBuildConfigString(r0)
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L22
            java.lang.String r0 = r0.trim()
            return r0
        L22:
            java.lang.String r0 = "MICROSOFT_AUTH_CLIENT_ID"
            java.lang.String r0 = readBuildConfigString(r0)
            boolean r1 = isBlank(r0)
            if (r1 != 0) goto L33
            java.lang.String r0 = r0.trim()
            return r0
        L33:
            java.lang.String r0 = ""
            return r0
    }
}
