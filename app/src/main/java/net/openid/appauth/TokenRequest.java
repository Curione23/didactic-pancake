package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class TokenRequest {
    private static final java.util.Set<java.lang.String> BUILT_IN_PARAMS = null;
    public static final java.lang.String GRANT_TYPE_CLIENT_CREDENTIALS = "client_credentials";
    public static final java.lang.String GRANT_TYPE_PASSWORD = "password";
    static final java.lang.String KEY_ADDITIONAL_PARAMETERS = "additionalParameters";
    static final java.lang.String KEY_AUTHORIZATION_CODE = "authorizationCode";
    static final java.lang.String KEY_CLIENT_ID = "clientId";
    static final java.lang.String KEY_CODE_VERIFIER = "codeVerifier";
    static final java.lang.String KEY_CONFIGURATION = "configuration";
    static final java.lang.String KEY_GRANT_TYPE = "grantType";
    static final java.lang.String KEY_NONCE = "nonce";
    static final java.lang.String KEY_REDIRECT_URI = "redirectUri";
    static final java.lang.String KEY_REFRESH_TOKEN = "refreshToken";
    static final java.lang.String KEY_SCOPE = "scope";
    public static final java.lang.String PARAM_CLIENT_ID = "client_id";
    static final java.lang.String PARAM_CODE = "code";
    static final java.lang.String PARAM_CODE_VERIFIER = "code_verifier";
    static final java.lang.String PARAM_GRANT_TYPE = "grant_type";
    static final java.lang.String PARAM_REDIRECT_URI = "redirect_uri";
    static final java.lang.String PARAM_REFRESH_TOKEN = "refresh_token";
    static final java.lang.String PARAM_SCOPE = "scope";
    public final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    public final java.lang.String authorizationCode;
    public final java.lang.String clientId;
    public final java.lang.String codeVerifier;
    public final net.openid.appauth.AuthorizationServiceConfiguration configuration;
    public final java.lang.String grantType;
    public final java.lang.String nonce;
    public final android.net.Uri redirectUri;
    public final java.lang.String refreshToken;
    public final java.lang.String scope;

    /* JADX INFO: renamed from: net.openid.appauth.TokenRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> mAdditionalParameters;
        private java.lang.String mAuthorizationCode;
        private java.lang.String mClientId;
        private java.lang.String mCodeVerifier;
        private net.openid.appauth.AuthorizationServiceConfiguration mConfiguration;
        private java.lang.String mGrantType;
        private java.lang.String mNonce;
        private android.net.Uri mRedirectUri;
        private java.lang.String mRefreshToken;
        private java.lang.String mScope;

        public Builder(net.openid.appauth.AuthorizationServiceConfiguration r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.setConfiguration(r1)
                r0.setClientId(r2)
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                r0.mAdditionalParameters = r1
                return
        }

        private java.lang.String inferGrantType() {
                r2 = this;
                java.lang.String r0 = r2.mGrantType
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = r2.mAuthorizationCode
                if (r0 == 0) goto Lc
                java.lang.String r0 = "authorization_code"
                return r0
            Lc:
                java.lang.String r0 = r2.mRefreshToken
                if (r0 == 0) goto L13
                java.lang.String r0 = "refresh_token"
                return r0
            L13:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "grant type not specified and cannot be inferred"
                r0.<init>(r1)
                throw r0
        }

        public net.openid.appauth.TokenRequest build() {
                r13 = this;
                java.lang.String r4 = r13.inferGrantType()
                java.lang.String r0 = "authorization_code"
                boolean r1 = r0.equals(r4)
                if (r1 == 0) goto L13
                java.lang.String r1 = r13.mAuthorizationCode
                java.lang.String r2 = "authorization code must be specified for grant_type = authorization_code"
                net.openid.appauth.Preconditions.checkNotNull(r1, r2)
            L13:
                java.lang.String r1 = "refresh_token"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L22
                java.lang.String r1 = r13.mRefreshToken
                java.lang.String r2 = "refresh token must be specified for grant_type = refresh_token"
                net.openid.appauth.Preconditions.checkNotNull(r1, r2)
            L22:
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L35
                android.net.Uri r0 = r13.mRedirectUri
                if (r0 == 0) goto L2d
                goto L35
            L2d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "no redirect URI specified on token request for code exchange"
                r0.<init>(r1)
                throw r0
            L35:
                net.openid.appauth.TokenRequest r12 = new net.openid.appauth.TokenRequest
                net.openid.appauth.AuthorizationServiceConfiguration r1 = r13.mConfiguration
                java.lang.String r2 = r13.mClientId
                java.lang.String r3 = r13.mNonce
                android.net.Uri r5 = r13.mRedirectUri
                java.lang.String r6 = r13.mScope
                java.lang.String r7 = r13.mAuthorizationCode
                java.lang.String r8 = r13.mRefreshToken
                java.lang.String r9 = r13.mCodeVerifier
                java.util.Map<java.lang.String, java.lang.String> r0 = r13.mAdditionalParameters
                java.util.Map r10 = java.util.Collections.unmodifiableMap(r0)
                r11 = 0
                r0 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r12
        }

        public net.openid.appauth.TokenRequest.Builder setAdditionalParameters(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Set r0 = net.openid.appauth.TokenRequest.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.checkAdditionalParams(r2, r0)
                r1.mAdditionalParameters = r2
                return r1
        }

        public net.openid.appauth.TokenRequest.Builder setAuthorizationCode(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "authorization code must not be empty"
                net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mAuthorizationCode = r2
                return r1
        }

        public net.openid.appauth.TokenRequest.Builder setClientId(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "clientId cannot be null or empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
                r1.mClientId = r2
                return r1
        }

        public net.openid.appauth.TokenRequest.Builder setCodeVerifier(java.lang.String r1) {
                r0 = this;
                if (r1 == 0) goto L5
                net.openid.appauth.CodeVerifierUtil.checkCodeVerifier(r1)
            L5:
                r0.mCodeVerifier = r1
                return r0
        }

        public net.openid.appauth.TokenRequest.Builder setConfiguration(net.openid.appauth.AuthorizationServiceConfiguration r1) {
                r0 = this;
                java.lang.Object r1 = net.openid.appauth.Preconditions.checkNotNull(r1)
                net.openid.appauth.AuthorizationServiceConfiguration r1 = (net.openid.appauth.AuthorizationServiceConfiguration) r1
                r0.mConfiguration = r1
                return r0
        }

        public net.openid.appauth.TokenRequest.Builder setGrantType(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "grantType cannot be null or empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
                r1.mGrantType = r2
                return r1
        }

        public net.openid.appauth.TokenRequest.Builder setNonce(java.lang.String r2) {
                r1 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto La
                r2 = 0
                r1.mNonce = r2
                goto Lc
            La:
                r1.mNonce = r2
            Lc:
                return r1
        }

        public net.openid.appauth.TokenRequest.Builder setRedirectUri(android.net.Uri r3) {
                r2 = this;
                if (r3 == 0) goto Lb
                java.lang.String r0 = r3.getScheme()
                java.lang.String r1 = "redirectUri must have a scheme"
                net.openid.appauth.Preconditions.checkNotNull(r0, r1)
            Lb:
                r2.mRedirectUri = r3
                return r2
        }

        public net.openid.appauth.TokenRequest.Builder setRefreshToken(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.lang.String r0 = "refresh token cannot be empty if defined"
                net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
            L7:
                r1.mRefreshToken = r2
                return r1
        }

        public net.openid.appauth.TokenRequest.Builder setScope(java.lang.String r2) {
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

        public net.openid.appauth.TokenRequest.Builder setScopes(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mScope = r1
                return r0
        }

        public net.openid.appauth.TokenRequest.Builder setScopes(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L5
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
            L5:
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.setScopes(r1)
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 7
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "client_id"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "code"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "code_verifier"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "grant_type"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "redirect_uri"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "refresh_token"
            r1[r2] = r3
            r2 = 6
            java.lang.String r3 = "scope"
            r1[r2] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            net.openid.appauth.TokenRequest.BUILT_IN_PARAMS = r0
            return
    }

    private TokenRequest(net.openid.appauth.AuthorizationServiceConfiguration r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, android.net.Uri r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10) {
            r0 = this;
            r0.<init>()
            r0.configuration = r1
            r0.clientId = r2
            r0.nonce = r3
            r0.grantType = r4
            r0.redirectUri = r5
            r0.scope = r6
            r0.authorizationCode = r7
            r0.refreshToken = r8
            r0.codeVerifier = r9
            r0.additionalParameters = r10
            return
    }

    /* synthetic */ TokenRequest(net.openid.appauth.AuthorizationServiceConfiguration r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, android.net.Uri r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, net.openid.appauth.TokenRequest.AnonymousClass1 r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<java.lang.String> r0 = net.openid.appauth.TokenRequest.BUILT_IN_PARAMS
            return r0
    }

    public static net.openid.appauth.TokenRequest jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "json string cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.TokenRequest r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.TokenRequest jsonDeserialize(org.json.JSONObject r12) throws org.json.JSONException {
            java.lang.String r0 = "json object cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r12, r0)
            net.openid.appauth.TokenRequest r0 = new net.openid.appauth.TokenRequest
            java.lang.String r1 = "configuration"
            org.json.JSONObject r1 = r12.getJSONObject(r1)
            net.openid.appauth.AuthorizationServiceConfiguration r2 = net.openid.appauth.AuthorizationServiceConfiguration.fromJson(r1)
            java.lang.String r1 = "clientId"
            java.lang.String r3 = net.openid.appauth.JsonUtil.getString(r12, r1)
            java.lang.String r1 = "nonce"
            java.lang.String r4 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r1)
            java.lang.String r1 = "grantType"
            java.lang.String r5 = net.openid.appauth.JsonUtil.getString(r12, r1)
            java.lang.String r1 = "redirectUri"
            android.net.Uri r6 = net.openid.appauth.JsonUtil.getUriIfDefined(r12, r1)
            java.lang.String r1 = "scope"
            java.lang.String r7 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r1)
            java.lang.String r1 = "authorizationCode"
            java.lang.String r8 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r1)
            java.lang.String r1 = "refreshToken"
            java.lang.String r9 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r1)
            java.lang.String r1 = "codeVerifier"
            java.lang.String r10 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r1)
            java.lang.String r1 = "additionalParameters"
            java.util.Map r11 = net.openid.appauth.JsonUtil.getStringMap(r12, r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    private void putIfNotNull(java.util.Map<java.lang.String, java.lang.String> r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            if (r3 == 0) goto L9
            java.lang.String r3 = r3.toString()
            r1.put(r2, r3)
        L9:
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> getRequestParameters() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "grant_type"
            java.lang.String r2 = r4.grantType
            r0.put(r1, r2)
            java.lang.String r1 = "redirect_uri"
            android.net.Uri r2 = r4.redirectUri
            r4.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "code"
            java.lang.String r2 = r4.authorizationCode
            r4.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "refresh_token"
            java.lang.String r2 = r4.refreshToken
            r4.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "code_verifier"
            java.lang.String r2 = r4.codeVerifier
            r4.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "scope"
            java.lang.String r2 = r4.scope
            r4.putIfNotNull(r0, r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.additionalParameters
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r3, r2)
            goto L39
        L55:
            return r0
    }

    public java.util.Set<java.lang.String> getScopeSet() {
            r1 = this;
            java.lang.String r0 = r1.scope
            java.util.Set r0 = net.openid.appauth.AsciiStringListUtil.stringToSet(r0)
            return r0
    }

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
            java.lang.String r1 = "nonce"
            java.lang.String r2 = r3.nonce
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "grantType"
            java.lang.String r2 = r3.grantType
            net.openid.appauth.JsonUtil.put(r0, r1, r2)
            java.lang.String r1 = "redirectUri"
            android.net.Uri r2 = r3.redirectUri
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "scope"
            java.lang.String r2 = r3.scope
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "authorizationCode"
            java.lang.String r2 = r3.authorizationCode
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "refreshToken"
            java.lang.String r2 = r3.refreshToken
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "codeVerifier"
            java.lang.String r2 = r3.codeVerifier
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.additionalParameters
            org.json.JSONObject r1 = net.openid.appauth.JsonUtil.mapToJsonObject(r1)
            java.lang.String r2 = "additionalParameters"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            return r0
    }

    public java.lang.String jsonSerializeString() {
            r1 = this;
            org.json.JSONObject r0 = r1.jsonSerialize()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
