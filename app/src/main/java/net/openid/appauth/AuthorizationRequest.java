package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorizationRequest implements net.openid.appauth.AuthorizationManagementRequest {
    private static final java.util.Set<java.lang.String> BUILT_IN_PARAMS = null;
    public static final java.lang.String CODE_CHALLENGE_METHOD_PLAIN = "plain";
    public static final java.lang.String CODE_CHALLENGE_METHOD_S256 = "S256";
    private static final java.lang.String KEY_ADDITIONAL_PARAMETERS = "additionalParameters";
    private static final java.lang.String KEY_CLAIMS = "claims";
    private static final java.lang.String KEY_CLAIMS_LOCALES = "claimsLocales";
    private static final java.lang.String KEY_CLIENT_ID = "clientId";
    private static final java.lang.String KEY_CODE_VERIFIER = "codeVerifier";
    private static final java.lang.String KEY_CODE_VERIFIER_CHALLENGE = "codeVerifierChallenge";
    private static final java.lang.String KEY_CODE_VERIFIER_CHALLENGE_METHOD = "codeVerifierChallengeMethod";
    private static final java.lang.String KEY_CONFIGURATION = "configuration";
    private static final java.lang.String KEY_DISPLAY = "display";
    private static final java.lang.String KEY_LOGIN_HINT = "login_hint";
    private static final java.lang.String KEY_NONCE = "nonce";
    private static final java.lang.String KEY_PROMPT = "prompt";
    private static final java.lang.String KEY_REDIRECT_URI = "redirectUri";
    private static final java.lang.String KEY_RESPONSE_MODE = "responseMode";
    private static final java.lang.String KEY_RESPONSE_TYPE = "responseType";
    private static final java.lang.String KEY_SCOPE = "scope";
    private static final java.lang.String KEY_STATE = "state";
    private static final java.lang.String KEY_UI_LOCALES = "ui_locales";
    static final java.lang.String PARAM_CLAIMS = "claims";
    static final java.lang.String PARAM_CLAIMS_LOCALES = "claims_locales";
    static final java.lang.String PARAM_CLIENT_ID = "client_id";
    static final java.lang.String PARAM_CODE_CHALLENGE = "code_challenge";
    static final java.lang.String PARAM_CODE_CHALLENGE_METHOD = "code_challenge_method";
    static final java.lang.String PARAM_DISPLAY = "display";
    static final java.lang.String PARAM_LOGIN_HINT = "login_hint";
    static final java.lang.String PARAM_NONCE = "nonce";
    static final java.lang.String PARAM_PROMPT = "prompt";
    static final java.lang.String PARAM_REDIRECT_URI = "redirect_uri";
    static final java.lang.String PARAM_RESPONSE_MODE = "response_mode";
    static final java.lang.String PARAM_RESPONSE_TYPE = "response_type";
    static final java.lang.String PARAM_SCOPE = "scope";
    static final java.lang.String PARAM_STATE = "state";
    static final java.lang.String PARAM_UI_LOCALES = "ui_locales";
    public final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    public final org.json.JSONObject claims;
    public final java.lang.String claimsLocales;
    public final java.lang.String clientId;
    public final java.lang.String codeVerifier;
    public final java.lang.String codeVerifierChallenge;
    public final java.lang.String codeVerifierChallengeMethod;
    public final net.openid.appauth.AuthorizationServiceConfiguration configuration;
    public final java.lang.String display;
    public final java.lang.String loginHint;
    public final java.lang.String nonce;
    public final java.lang.String prompt;
    public final android.net.Uri redirectUri;
    public final java.lang.String responseMode;
    public final java.lang.String responseType;
    public final java.lang.String scope;
    public final java.lang.String state;
    public final java.lang.String uiLocales;

    /* JADX INFO: renamed from: net.openid.appauth.AuthorizationRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> mAdditionalParameters;
        private org.json.JSONObject mClaims;
        private java.lang.String mClaimsLocales;
        private java.lang.String mClientId;
        private java.lang.String mCodeVerifier;
        private java.lang.String mCodeVerifierChallenge;
        private java.lang.String mCodeVerifierChallengeMethod;
        private net.openid.appauth.AuthorizationServiceConfiguration mConfiguration;
        private java.lang.String mDisplay;
        private java.lang.String mLoginHint;
        private java.lang.String mNonce;
        private java.lang.String mPrompt;
        private android.net.Uri mRedirectUri;
        private java.lang.String mResponseMode;
        private java.lang.String mResponseType;
        private java.lang.String mScope;
        private java.lang.String mState;
        private java.lang.String mUiLocales;

        public Builder(net.openid.appauth.AuthorizationServiceConfiguration r2, java.lang.String r3, java.lang.String r4, android.net.Uri r5) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mAdditionalParameters = r0
                r1.setAuthorizationServiceConfiguration(r2)
                r1.setClientId(r3)
                r1.setResponseType(r4)
                r1.setRedirectUri(r5)
                java.lang.String r2 = net.openid.appauth.AuthorizationManagementUtil.generateRandomState()
                r1.setState(r2)
                java.lang.String r2 = net.openid.appauth.AuthorizationManagementUtil.generateRandomState()
                r1.setNonce(r2)
                java.lang.String r2 = net.openid.appauth.CodeVerifierUtil.generateRandomCodeVerifier()
                r1.setCodeVerifier(r2)
                return
        }

        public net.openid.appauth.AuthorizationRequest build() {
                r24 = this;
                r0 = r24
                net.openid.appauth.AuthorizationRequest r21 = new net.openid.appauth.AuthorizationRequest
                r1 = r21
                net.openid.appauth.AuthorizationServiceConfiguration r2 = r0.mConfiguration
                java.lang.String r3 = r0.mClientId
                java.lang.String r4 = r0.mResponseType
                android.net.Uri r5 = r0.mRedirectUri
                java.lang.String r6 = r0.mDisplay
                java.lang.String r7 = r0.mLoginHint
                java.lang.String r8 = r0.mPrompt
                java.lang.String r9 = r0.mUiLocales
                java.lang.String r10 = r0.mScope
                java.lang.String r11 = r0.mState
                java.lang.String r12 = r0.mNonce
                java.lang.String r13 = r0.mCodeVerifier
                java.lang.String r14 = r0.mCodeVerifierChallenge
                java.lang.String r15 = r0.mCodeVerifierChallengeMethod
                r22 = r1
                java.lang.String r1 = r0.mResponseMode
                r16 = r1
                org.json.JSONObject r1 = r0.mClaims
                r17 = r1
                java.lang.String r1 = r0.mClaimsLocales
                r18 = r1
                java.util.HashMap r1 = new java.util.HashMap
                r23 = r2
                java.util.Map<java.lang.String, java.lang.String> r2 = r0.mAdditionalParameters
                r1.<init>(r2)
                java.util.Map r19 = java.util.Collections.unmodifiableMap(r1)
                r20 = 0
                r1 = r22
                r2 = r23
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r21
        }

        public net.openid.appauth.AuthorizationRequest.Builder setAdditionalParameters(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Set r0 = net.openid.appauth.AuthorizationRequest.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.checkAdditionalParams(r2, r0)
                r1.mAdditionalParameters = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setAuthorizationServiceConfiguration(net.openid.appauth.AuthorizationServiceConfiguration r2) {
                r1 = this;
                java.lang.String r0 = "configuration cannot be null"
                java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                net.openid.appauth.AuthorizationServiceConfiguration r2 = (net.openid.appauth.AuthorizationServiceConfiguration) r2
                r1.mConfiguration = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setClaims(org.json.JSONObject r1) {
                r0 = this;
                r0.mClaims = r1
                return r0
        }

        public net.openid.appauth.AuthorizationRequest.Builder setClaimsLocales(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "claimsLocales must be null or not empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mClaimsLocales = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setClaimsLocalesValues(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mClaimsLocales = r1
                return r0
        }

        public net.openid.appauth.AuthorizationRequest.Builder setClaimsLocalesValues(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                r0.mClaimsLocales = r1
                return r0
            L6:
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.openid.appauth.AuthorizationRequest$Builder r1 = r0.setClaimsLocalesValues(r1)
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setClientId(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "client ID cannot be null or empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
                r1.mClientId = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setCodeVerifier(java.lang.String r1) {
                r0 = this;
                if (r1 == 0) goto L14
                net.openid.appauth.CodeVerifierUtil.checkCodeVerifier(r1)
                r0.mCodeVerifier = r1
                java.lang.String r1 = net.openid.appauth.CodeVerifierUtil.deriveCodeVerifierChallenge(r1)
                r0.mCodeVerifierChallenge = r1
                java.lang.String r1 = net.openid.appauth.CodeVerifierUtil.getCodeVerifierChallengeMethod()
                r0.mCodeVerifierChallengeMethod = r1
                goto L1b
            L14:
                r1 = 0
                r0.mCodeVerifier = r1
                r0.mCodeVerifierChallenge = r1
                r0.mCodeVerifierChallengeMethod = r1
            L1b:
                return r0
        }

        public net.openid.appauth.AuthorizationRequest.Builder setCodeVerifier(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r4 = this;
                if (r5 == 0) goto L10
                net.openid.appauth.CodeVerifierUtil.checkCodeVerifier(r5)
                java.lang.String r0 = "code verifier challenge cannot be null or empty if verifier is set"
                net.openid.appauth.Preconditions.checkNotEmpty(r6, r0)
                java.lang.String r0 = "code verifier challenge method cannot be null or empty if verifier is set"
                net.openid.appauth.Preconditions.checkNotEmpty(r7, r0)
                goto L25
            L10:
                r0 = 1
                r1 = 0
                if (r6 != 0) goto L16
                r2 = r0
                goto L17
            L16:
                r2 = r1
            L17:
                java.lang.String r3 = "code verifier challenge must be null if verifier is null"
                net.openid.appauth.Preconditions.checkArgument(r2, r3)
                if (r7 != 0) goto L1f
                goto L20
            L1f:
                r0 = r1
            L20:
                java.lang.String r1 = "code verifier challenge method must be null if verifier is null"
                net.openid.appauth.Preconditions.checkArgument(r0, r1)
            L25:
                r4.mCodeVerifier = r5
                r4.mCodeVerifierChallenge = r6
                r4.mCodeVerifierChallengeMethod = r7
                return r4
        }

        public net.openid.appauth.AuthorizationRequest.Builder setDisplay(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "display must be null or not empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mDisplay = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setLoginHint(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "login hint must be null or not empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mLoginHint = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setNonce(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "nonce cannot be empty if defined"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mNonce = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setPrompt(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "prompt must be null or non-empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mPrompt = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setPromptValues(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mPrompt = r1
                return r0
        }

        public net.openid.appauth.AuthorizationRequest.Builder setPromptValues(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                r0.mPrompt = r1
                return r0
            L6:
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.openid.appauth.AuthorizationRequest$Builder r1 = r0.setPromptValues(r1)
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setRedirectUri(android.net.Uri r2) {
                r1 = this;
                java.lang.String r0 = "redirect URI cannot be null or empty"
                java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                android.net.Uri r2 = (android.net.Uri) r2
                r1.mRedirectUri = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setResponseMode(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "responseMode must not be empty"
                net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mResponseMode = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setResponseType(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "expected response type cannot be null or empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
                r1.mResponseType = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setScope(java.lang.String r2) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto La
                r2 = 0
                r1.mScope = r2
                goto L13
            La:
                java.lang.String r0 = " +"
                java.lang.String[] r2 = r2.split(r0)
                r1.setScopes(r2)
            L13:
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setScopes(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mScope = r1
                return r0
        }

        public net.openid.appauth.AuthorizationRequest.Builder setScopes(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L5
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
            L5:
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.setScopes(r1)
                return r0
        }

        public net.openid.appauth.AuthorizationRequest.Builder setState(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "state cannot be empty if defined"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mState = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setUiLocales(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "uiLocales must be null or not empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mUiLocales = r2
                return r1
        }

        public net.openid.appauth.AuthorizationRequest.Builder setUiLocalesValues(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mUiLocales = r1
                return r0
        }

        public net.openid.appauth.AuthorizationRequest.Builder setUiLocalesValues(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                r0.mUiLocales = r1
                return r0
            L6:
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.openid.appauth.AuthorizationRequest$Builder r1 = r0.setUiLocalesValues(r1)
                return r1
        }
    }

    public static final class Display {
        public static final java.lang.String PAGE = "page";
        public static final java.lang.String POPUP = "popup";
        public static final java.lang.String TOUCH = "touch";
        public static final java.lang.String WAP = "wap";

        public Display() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class Prompt {
        public static final java.lang.String CONSENT = "consent";
        public static final java.lang.String LOGIN = "login";
        public static final java.lang.String NONE = "none";
        public static final java.lang.String SELECT_ACCOUNT = "select_account";

        public Prompt() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class ResponseMode {
        public static final java.lang.String FRAGMENT = "fragment";
        public static final java.lang.String QUERY = "query";

        public ResponseMode() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class Scope {
        public static final java.lang.String ADDRESS = "address";
        public static final java.lang.String EMAIL = "email";
        public static final java.lang.String OFFLINE_ACCESS = "offline_access";
        public static final java.lang.String OPENID = "openid";
        public static final java.lang.String PHONE = "phone";
        public static final java.lang.String PROFILE = "profile";

        public Scope() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 14
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "client_id"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "code_challenge"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "code_challenge_method"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "display"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "login_hint"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "prompt"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "ui_locales"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "redirect_uri"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "response_mode"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "response_type"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "scope"
            r0[r1] = r2
            r1 = 11
            java.lang.String r2 = "state"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "claims"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "claims_locales"
            r0[r1] = r2
            java.util.Set r0 = net.openid.appauth.AdditionalParamsProcessor.builtInParams(r0)
            net.openid.appauth.AuthorizationRequest.BUILT_IN_PARAMS = r0
            return
    }

    private AuthorizationRequest(net.openid.appauth.AuthorizationServiceConfiguration r3, java.lang.String r4, java.lang.String r5, android.net.Uri r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, org.json.JSONObject r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.configuration = r1
            r1 = r4
            r0.clientId = r1
            r1 = r5
            r0.responseType = r1
            r1 = r6
            r0.redirectUri = r1
            r1 = r20
            r0.additionalParameters = r1
            r1 = r7
            r0.display = r1
            r1 = r8
            r0.loginHint = r1
            r1 = r9
            r0.prompt = r1
            r1 = r10
            r0.uiLocales = r1
            r1 = r11
            r0.scope = r1
            r1 = r12
            r0.state = r1
            r1 = r13
            r0.nonce = r1
            r1 = r14
            r0.codeVerifier = r1
            r1 = r15
            r0.codeVerifierChallenge = r1
            r1 = r16
            r0.codeVerifierChallengeMethod = r1
            r1 = r17
            r0.responseMode = r1
            r1 = r18
            r0.claims = r1
            r1 = r19
            r0.claimsLocales = r1
            return
    }

    /* synthetic */ AuthorizationRequest(net.openid.appauth.AuthorizationServiceConfiguration r1, java.lang.String r2, java.lang.String r3, android.net.Uri r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, org.json.JSONObject r16, java.lang.String r17, java.util.Map r18, net.openid.appauth.AuthorizationRequest.AnonymousClass1 r19) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<java.lang.String> r0 = net.openid.appauth.AuthorizationRequest.BUILT_IN_PARAMS
            return r0
    }

    public static net.openid.appauth.AuthorizationRequest jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "json string cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.AuthorizationRequest r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.AuthorizationRequest jsonDeserialize(org.json.JSONObject r22) throws org.json.JSONException {
            r0 = r22
            java.lang.String r1 = "json cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r0, r1)
            net.openid.appauth.AuthorizationRequest r1 = new net.openid.appauth.AuthorizationRequest
            r2 = r1
            java.lang.String r3 = "configuration"
            org.json.JSONObject r3 = r0.getJSONObject(r3)
            net.openid.appauth.AuthorizationServiceConfiguration r3 = net.openid.appauth.AuthorizationServiceConfiguration.fromJson(r3)
            java.lang.String r4 = "clientId"
            java.lang.String r4 = net.openid.appauth.JsonUtil.getString(r0, r4)
            java.lang.String r5 = "responseType"
            java.lang.String r5 = net.openid.appauth.JsonUtil.getString(r0, r5)
            java.lang.String r6 = "redirectUri"
            android.net.Uri r6 = net.openid.appauth.JsonUtil.getUri(r0, r6)
            java.lang.String r7 = "display"
            java.lang.String r7 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r7)
            java.lang.String r8 = "login_hint"
            java.lang.String r8 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r8)
            java.lang.String r9 = "prompt"
            java.lang.String r9 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r9)
            java.lang.String r10 = "ui_locales"
            java.lang.String r10 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r10)
            java.lang.String r11 = "scope"
            java.lang.String r11 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r11)
            java.lang.String r12 = "state"
            java.lang.String r12 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r12)
            java.lang.String r13 = "nonce"
            java.lang.String r13 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r13)
            java.lang.String r14 = "codeVerifier"
            java.lang.String r14 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r14)
            java.lang.String r15 = "codeVerifierChallenge"
            java.lang.String r15 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r15)
            r21 = r1
            java.lang.String r1 = "codeVerifierChallengeMethod"
            java.lang.String r16 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r1)
            java.lang.String r1 = "responseMode"
            java.lang.String r17 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r1)
            java.lang.String r1 = "claims"
            org.json.JSONObject r18 = net.openid.appauth.JsonUtil.getJsonObjectIfDefined(r0, r1)
            java.lang.String r1 = "claimsLocales"
            java.lang.String r19 = net.openid.appauth.JsonUtil.getStringIfDefined(r0, r1)
            java.lang.String r1 = "additionalParameters"
            java.util.Map r20 = net.openid.appauth.JsonUtil.getStringMap(r0, r1)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r21
    }

    public java.util.Set<java.lang.String> getClaimsLocales() {
            r1 = this;
            java.lang.String r0 = r1.claimsLocales
            java.util.Set r0 = net.openid.appauth.AsciiStringListUtil.stringToSet(r0)
            return r0
    }

    public java.util.Set<java.lang.String> getPromptValues() {
            r1 = this;
            java.lang.String r0 = r1.prompt
            java.util.Set r0 = net.openid.appauth.AsciiStringListUtil.stringToSet(r0)
            return r0
    }

    public java.util.Set<java.lang.String> getScopeSet() {
            r1 = this;
            java.lang.String r0 = r1.scope
            java.util.Set r0 = net.openid.appauth.AsciiStringListUtil.stringToSet(r0)
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public java.lang.String getState() {
            r1 = this;
            java.lang.String r0 = r1.state
            return r0
    }

    public java.util.Set<java.lang.String> getUiLocales() {
            r1 = this;
            java.lang.String r0 = r1.uiLocales
            java.util.Set r0 = net.openid.appauth.AsciiStringListUtil.stringToSet(r0)
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public org.json.JSONObject jsonSerialize() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            net.openid.appauth.AuthorizationServiceConfiguration r1 = r3.configuration
            org.json.JSONObject r1 = r1.toJson()
            java.lang.String r2 = "configuration"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            java.lang.String r1 = "clientId"
            java.lang.String r2 = r3.clientId
            net.openid.appauth.JsonUtil.put(r0, r1, r2)
            java.lang.String r1 = "responseType"
            java.lang.String r2 = r3.responseType
            net.openid.appauth.JsonUtil.put(r0, r1, r2)
            android.net.Uri r1 = r3.redirectUri
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "redirectUri"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            java.lang.String r1 = "display"
            java.lang.String r2 = r3.display
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "login_hint"
            java.lang.String r2 = r3.loginHint
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "scope"
            java.lang.String r2 = r3.scope
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "prompt"
            java.lang.String r2 = r3.prompt
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "ui_locales"
            java.lang.String r2 = r3.uiLocales
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "state"
            java.lang.String r2 = r3.state
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "nonce"
            java.lang.String r2 = r3.nonce
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "codeVerifier"
            java.lang.String r2 = r3.codeVerifier
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "codeVerifierChallenge"
            java.lang.String r2 = r3.codeVerifierChallenge
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "codeVerifierChallengeMethod"
            java.lang.String r2 = r3.codeVerifierChallengeMethod
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "responseMode"
            java.lang.String r2 = r3.responseMode
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "claims"
            org.json.JSONObject r2 = r3.claims
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "claimsLocales"
            java.lang.String r2 = r3.claimsLocales
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.additionalParameters
            org.json.JSONObject r1 = net.openid.appauth.JsonUtil.mapToJsonObject(r1)
            java.lang.String r2 = "additionalParameters"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public java.lang.String jsonSerializeString() {
            r1 = this;
            org.json.JSONObject r0 = r1.jsonSerialize()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementRequest
    public android.net.Uri toUri() {
            r4 = this;
            net.openid.appauth.AuthorizationServiceConfiguration r0 = r4.configuration
            android.net.Uri r0 = r0.authorizationEndpoint
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri r1 = r4.redirectUri
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "redirect_uri"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r1)
            java.lang.String r1 = "client_id"
            java.lang.String r2 = r4.clientId
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            java.lang.String r1 = "response_type"
            java.lang.String r2 = r4.responseType
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            java.lang.String r1 = "display"
            java.lang.String r2 = r4.display
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "login_hint"
            java.lang.String r2 = r4.loginHint
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "prompt"
            java.lang.String r2 = r4.prompt
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "ui_locales"
            java.lang.String r2 = r4.uiLocales
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "state"
            java.lang.String r2 = r4.state
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "nonce"
            java.lang.String r2 = r4.nonce
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "scope"
            java.lang.String r2 = r4.scope
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "response_mode"
            java.lang.String r2 = r4.responseMode
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = r4.codeVerifier
            if (r1 == 0) goto L6f
            java.lang.String r1 = "code_challenge"
            java.lang.String r2 = r4.codeVerifierChallenge
            android.net.Uri$Builder r1 = r0.appendQueryParameter(r1, r2)
            java.lang.String r2 = "code_challenge_method"
            java.lang.String r3 = r4.codeVerifierChallengeMethod
            r1.appendQueryParameter(r2, r3)
        L6f:
            java.lang.String r1 = "claims"
            org.json.JSONObject r2 = r4.claims
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "claims_locales"
            java.lang.String r2 = r4.claimsLocales
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.additionalParameters
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L87:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.appendQueryParameter(r3, r2)
            goto L87
        La3:
            android.net.Uri r0 = r0.build()
            return r0
    }
}
