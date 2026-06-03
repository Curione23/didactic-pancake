package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorizationResponse extends net.openid.appauth.AuthorizationManagementResponse {
    private static final java.util.Set<java.lang.String> BUILT_IN_PARAMS = null;
    public static final java.lang.String EXTRA_RESPONSE = "net.openid.appauth.AuthorizationResponse";
    static final java.lang.String KEY_ACCESS_TOKEN = "access_token";
    static final java.lang.String KEY_ADDITIONAL_PARAMETERS = "additional_parameters";
    static final java.lang.String KEY_AUTHORIZATION_CODE = "code";
    static final java.lang.String KEY_EXPIRES_AT = "expires_at";
    static final java.lang.String KEY_EXPIRES_IN = "expires_in";
    static final java.lang.String KEY_ID_TOKEN = "id_token";
    static final java.lang.String KEY_REQUEST = "request";
    static final java.lang.String KEY_SCOPE = "scope";
    static final java.lang.String KEY_STATE = "state";
    static final java.lang.String KEY_TOKEN_TYPE = "token_type";
    public static final java.lang.String TOKEN_TYPE_BEARER = "bearer";
    public final java.lang.String accessToken;
    public final java.lang.Long accessTokenExpirationTime;
    public final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    public final java.lang.String authorizationCode;
    public final java.lang.String idToken;
    public final net.openid.appauth.AuthorizationRequest request;
    public final java.lang.String scope;
    public final java.lang.String state;
    public final java.lang.String tokenType;

    /* JADX INFO: renamed from: net.openid.appauth.AuthorizationResponse$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private java.lang.String mAccessToken;
        private java.lang.Long mAccessTokenExpirationTime;
        private java.util.Map<java.lang.String, java.lang.String> mAdditionalParameters;
        private java.lang.String mAuthorizationCode;
        private java.lang.String mIdToken;
        private net.openid.appauth.AuthorizationRequest mRequest;
        private java.lang.String mScope;
        private java.lang.String mState;
        private java.lang.String mTokenType;

        public Builder(net.openid.appauth.AuthorizationRequest r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "authorization request cannot be null"
                java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                net.openid.appauth.AuthorizationRequest r2 = (net.openid.appauth.AuthorizationRequest) r2
                r1.mRequest = r2
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                r1.mAdditionalParameters = r2
                return
        }

        public net.openid.appauth.AuthorizationResponse build() {
                r12 = this;
                net.openid.appauth.AuthorizationResponse r11 = new net.openid.appauth.AuthorizationResponse
                net.openid.appauth.AuthorizationRequest r1 = r12.mRequest
                java.lang.String r2 = r12.mState
                java.lang.String r3 = r12.mTokenType
                java.lang.String r4 = r12.mAuthorizationCode
                java.lang.String r5 = r12.mAccessToken
                java.lang.Long r6 = r12.mAccessTokenExpirationTime
                java.lang.String r7 = r12.mIdToken
                java.lang.String r8 = r12.mScope
                java.util.Map<java.lang.String, java.lang.String> r0 = r12.mAdditionalParameters
                java.util.Map r9 = java.util.Collections.unmodifiableMap(r0)
                r10 = 0
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        public net.openid.appauth.AuthorizationResponse.Builder fromUri(android.net.Uri r2) {
                r1 = this;
                net.openid.appauth.SystemClock r0 = net.openid.appauth.SystemClock.INSTANCE
                net.openid.appauth.AuthorizationResponse$Builder r2 = r1.fromUri(r2, r0)
                return r2
        }

        net.openid.appauth.AuthorizationResponse.Builder fromUri(android.net.Uri r2, net.openid.appauth.Clock r3) {
                r1 = this;
                java.lang.String r0 = "state"
                java.lang.String r0 = r2.getQueryParameter(r0)
                r1.setState(r0)
                java.lang.String r0 = "token_type"
                java.lang.String r0 = r2.getQueryParameter(r0)
                r1.setTokenType(r0)
                java.lang.String r0 = "code"
                java.lang.String r0 = r2.getQueryParameter(r0)
                r1.setAuthorizationCode(r0)
                java.lang.String r0 = "access_token"
                java.lang.String r0 = r2.getQueryParameter(r0)
                r1.setAccessToken(r0)
                java.lang.String r0 = "expires_in"
                java.lang.Long r0 = net.openid.appauth.internal.UriUtil.getLongQueryParameter(r2, r0)
                r1.setAccessTokenExpiresIn(r0, r3)
                java.lang.String r3 = "id_token"
                java.lang.String r3 = r2.getQueryParameter(r3)
                r1.setIdToken(r3)
                java.lang.String r3 = "scope"
                java.lang.String r3 = r2.getQueryParameter(r3)
                r1.setScope(r3)
                java.util.Set r3 = net.openid.appauth.AuthorizationResponse.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.extractAdditionalParams(r2, r3)
                r1.setAdditionalParameters(r2)
                return r1
        }

        public net.openid.appauth.AuthorizationResponse.Builder setAccessToken(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "accessToken must not be empty"
                net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mAccessToken = r2
                return r1
        }

        public net.openid.appauth.AuthorizationResponse.Builder setAccessTokenExpirationTime(java.lang.Long r1) {
                r0 = this;
                r0.mAccessTokenExpirationTime = r1
                return r0
        }

        public net.openid.appauth.AuthorizationResponse.Builder setAccessTokenExpiresIn(java.lang.Long r2) {
                r1 = this;
                net.openid.appauth.SystemClock r0 = net.openid.appauth.SystemClock.INSTANCE
                net.openid.appauth.AuthorizationResponse$Builder r2 = r1.setAccessTokenExpiresIn(r2, r0)
                return r2
        }

        public net.openid.appauth.AuthorizationResponse.Builder setAccessTokenExpiresIn(java.lang.Long r5, net.openid.appauth.Clock r6) {
                r4 = this;
                if (r5 != 0) goto L6
                r5 = 0
                r4.mAccessTokenExpirationTime = r5
                goto L1b
            L6:
                long r0 = r6.getCurrentTimeMillis()
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                long r2 = r5.longValue()
                long r5 = r6.toMillis(r2)
                long r0 = r0 + r5
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                r4.mAccessTokenExpirationTime = r5
            L1b:
                return r4
        }

        public net.openid.appauth.AuthorizationResponse.Builder setAdditionalParameters(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Set r0 = net.openid.appauth.AuthorizationResponse.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.checkAdditionalParams(r2, r0)
                r1.mAdditionalParameters = r2
                return r1
        }

        public net.openid.appauth.AuthorizationResponse.Builder setAuthorizationCode(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "authorizationCode must not be empty"
                net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mAuthorizationCode = r2
                return r1
        }

        public net.openid.appauth.AuthorizationResponse.Builder setIdToken(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "idToken cannot be empty"
                net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mIdToken = r2
                return r1
        }

        public net.openid.appauth.AuthorizationResponse.Builder setScope(java.lang.String r2) {
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

        public net.openid.appauth.AuthorizationResponse.Builder setScopes(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mScope = r1
                return r0
        }

        public net.openid.appauth.AuthorizationResponse.Builder setScopes(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                r0.mScope = r1
                goto Ld
            L6:
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.setScopes(r1)
            Ld:
                return r0
        }

        public net.openid.appauth.AuthorizationResponse.Builder setState(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "state must not be empty"
                net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mState = r2
                return r1
        }

        public net.openid.appauth.AuthorizationResponse.Builder setTokenType(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "tokenType must not be empty"
                net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mTokenType = r2
                return r1
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 7
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "token_type"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "state"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "code"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "access_token"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "expires_in"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "id_token"
            r1[r2] = r3
            r2 = 6
            java.lang.String r3 = "scope"
            r1[r2] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            net.openid.appauth.AuthorizationResponse.BUILT_IN_PARAMS = r0
            return
    }

    private AuthorizationResponse(net.openid.appauth.AuthorizationRequest r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Long r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r0 = this;
            r0.<init>()
            r0.request = r1
            r0.state = r2
            r0.tokenType = r3
            r0.authorizationCode = r4
            r0.accessToken = r5
            r0.accessTokenExpirationTime = r6
            r0.idToken = r7
            r0.scope = r8
            r0.additionalParameters = r9
            return
    }

    /* synthetic */ AuthorizationResponse(net.openid.appauth.AuthorizationRequest r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Long r6, java.lang.String r7, java.lang.String r8, java.util.Map r9, net.openid.appauth.AuthorizationResponse.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<java.lang.String> r0 = net.openid.appauth.AuthorizationResponse.BUILT_IN_PARAMS
            return r0
    }

    static boolean containsAuthorizationResponse(android.content.Intent r1) {
            java.lang.String r0 = "net.openid.appauth.AuthorizationResponse"
            boolean r1 = r1.hasExtra(r0)
            return r1
    }

    public static net.openid.appauth.AuthorizationResponse fromIntent(android.content.Intent r2) {
            java.lang.String r0 = "dataIntent must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "net.openid.appauth.AuthorizationResponse"
            boolean r1 = r2.hasExtra(r0)
            if (r1 != 0) goto Lf
            r2 = 0
            return r2
        Lf:
            java.lang.String r2 = r2.getStringExtra(r0)     // Catch: org.json.JSONException -> L18
            net.openid.appauth.AuthorizationResponse r2 = jsonDeserialize(r2)     // Catch: org.json.JSONException -> L18
            return r2
        L18:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Intent contains malformed auth response"
            r0.<init>(r1, r2)
            throw r0
    }

    public static net.openid.appauth.AuthorizationResponse jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.AuthorizationResponse r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.AuthorizationResponse jsonDeserialize(org.json.JSONObject r12) throws org.json.JSONException {
            java.lang.String r0 = "request"
            boolean r1 = r12.has(r0)
            if (r1 == 0) goto L47
            net.openid.appauth.AuthorizationResponse r1 = new net.openid.appauth.AuthorizationResponse
            org.json.JSONObject r0 = r12.getJSONObject(r0)
            net.openid.appauth.AuthorizationRequest r3 = net.openid.appauth.AuthorizationRequest.jsonDeserialize(r0)
            java.lang.String r0 = "state"
            java.lang.String r4 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "token_type"
            java.lang.String r5 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "code"
            java.lang.String r6 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "access_token"
            java.lang.String r7 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "expires_at"
            java.lang.Long r8 = net.openid.appauth.JsonUtil.getLongIfDefined(r12, r0)
            java.lang.String r0 = "id_token"
            java.lang.String r9 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "scope"
            java.lang.String r10 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "additional_parameters"
            java.util.Map r11 = net.openid.appauth.JsonUtil.getStringMap(r12, r0)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L47:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "authorization request not provided and not found in JSON"
            r12.<init>(r0)
            throw r12
    }

    public net.openid.appauth.TokenRequest createTokenExchangeRequest() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            net.openid.appauth.TokenRequest r0 = r1.createTokenExchangeRequest(r0)
            return r0
    }

    public net.openid.appauth.TokenRequest createTokenExchangeRequest(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "additionalExchangeParameters cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = r3.authorizationCode
            if (r0 == 0) goto L43
            net.openid.appauth.TokenRequest$Builder r0 = new net.openid.appauth.TokenRequest$Builder
            net.openid.appauth.AuthorizationRequest r1 = r3.request
            net.openid.appauth.AuthorizationServiceConfiguration r1 = r1.configuration
            net.openid.appauth.AuthorizationRequest r2 = r3.request
            java.lang.String r2 = r2.clientId
            r0.<init>(r1, r2)
            java.lang.String r1 = "authorization_code"
            net.openid.appauth.TokenRequest$Builder r0 = r0.setGrantType(r1)
            net.openid.appauth.AuthorizationRequest r1 = r3.request
            android.net.Uri r1 = r1.redirectUri
            net.openid.appauth.TokenRequest$Builder r0 = r0.setRedirectUri(r1)
            net.openid.appauth.AuthorizationRequest r1 = r3.request
            java.lang.String r1 = r1.codeVerifier
            net.openid.appauth.TokenRequest$Builder r0 = r0.setCodeVerifier(r1)
            java.lang.String r1 = r3.authorizationCode
            net.openid.appauth.TokenRequest$Builder r0 = r0.setAuthorizationCode(r1)
            net.openid.appauth.TokenRequest$Builder r4 = r0.setAdditionalParameters(r4)
            net.openid.appauth.AuthorizationRequest r0 = r3.request
            java.lang.String r0 = r0.nonce
            net.openid.appauth.TokenRequest$Builder r4 = r4.setNonce(r0)
            net.openid.appauth.TokenRequest r4 = r4.build()
            return r4
        L43:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "authorizationCode not available for exchange request"
            r4.<init>(r0)
            throw r4
    }

    public java.util.Set<java.lang.String> getScopeSet() {
            r1 = this;
            java.lang.String r0 = r1.scope
            java.util.Set r0 = net.openid.appauth.AsciiStringListUtil.stringToSet(r0)
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public java.lang.String getState() {
            r1 = this;
            java.lang.String r0 = r1.state
            return r0
    }

    public boolean hasAccessTokenExpired() {
            r1 = this;
            net.openid.appauth.SystemClock r0 = net.openid.appauth.SystemClock.INSTANCE
            boolean r0 = r1.hasAccessTokenExpired(r0)
            return r0
    }

    boolean hasAccessTokenExpired(net.openid.appauth.Clock r5) {
            r4 = this;
            java.lang.Long r0 = r4.accessTokenExpirationTime
            if (r0 == 0) goto L1a
            java.lang.Object r5 = net.openid.appauth.Preconditions.checkNotNull(r5)
            net.openid.appauth.Clock r5 = (net.openid.appauth.Clock) r5
            long r0 = r5.getCurrentTimeMillis()
            java.lang.Long r5 = r4.accessTokenExpirationTime
            long r2 = r5.longValue()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            return r5
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public org.json.JSONObject jsonSerialize() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            net.openid.appauth.AuthorizationRequest r1 = r3.request
            org.json.JSONObject r1 = r1.jsonSerialize()
            java.lang.String r2 = "request"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            java.lang.String r1 = "state"
            java.lang.String r2 = r3.state
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r3.tokenType
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "code"
            java.lang.String r2 = r3.authorizationCode
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "access_token"
            java.lang.String r2 = r3.accessToken
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "expires_at"
            java.lang.Long r2 = r3.accessTokenExpirationTime
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "id_token"
            java.lang.String r2 = r3.idToken
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "scope"
            java.lang.String r2 = r3.scope
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.additionalParameters
            org.json.JSONObject r1 = net.openid.appauth.JsonUtil.mapToJsonObject(r1)
            java.lang.String r2 = "additional_parameters"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            return r0
    }

    @Override // net.openid.appauth.AuthorizationManagementResponse
    public android.content.Intent toIntent() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "net.openid.appauth.AuthorizationResponse"
            java.lang.String r2 = r3.jsonSerializeString()
            r0.putExtra(r1, r2)
            return r0
    }
}
