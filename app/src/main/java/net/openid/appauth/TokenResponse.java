package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class TokenResponse {
    private static final java.util.Set<java.lang.String> BUILT_IN_PARAMS = null;
    static final java.lang.String KEY_ACCESS_TOKEN = "access_token";
    static final java.lang.String KEY_ADDITIONAL_PARAMETERS = "additionalParameters";
    static final java.lang.String KEY_EXPIRES_AT = "expires_at";
    static final java.lang.String KEY_EXPIRES_IN = "expires_in";
    static final java.lang.String KEY_ID_TOKEN = "id_token";
    static final java.lang.String KEY_REFRESH_TOKEN = "refresh_token";
    static final java.lang.String KEY_REQUEST = "request";
    static final java.lang.String KEY_SCOPE = "scope";
    static final java.lang.String KEY_TOKEN_TYPE = "token_type";
    public static final java.lang.String TOKEN_TYPE_BEARER = "Bearer";
    public final java.lang.String accessToken;
    public final java.lang.Long accessTokenExpirationTime;
    public final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    public final java.lang.String idToken;
    public final java.lang.String refreshToken;
    public final net.openid.appauth.TokenRequest request;
    public final java.lang.String scope;
    public final java.lang.String tokenType;

    public static final class Builder {
        private java.lang.String mAccessToken;
        private java.lang.Long mAccessTokenExpirationTime;
        private java.util.Map<java.lang.String, java.lang.String> mAdditionalParameters;
        private java.lang.String mIdToken;
        private java.lang.String mRefreshToken;
        private net.openid.appauth.TokenRequest mRequest;
        private java.lang.String mScope;
        private java.lang.String mTokenType;

        public Builder(net.openid.appauth.TokenRequest r1) {
                r0 = this;
                r0.<init>()
                r0.setRequest(r1)
                java.util.Map r1 = java.util.Collections.emptyMap()
                r0.mAdditionalParameters = r1
                return
        }

        public net.openid.appauth.TokenResponse build() {
                r10 = this;
                net.openid.appauth.TokenResponse r9 = new net.openid.appauth.TokenResponse
                net.openid.appauth.TokenRequest r1 = r10.mRequest
                java.lang.String r2 = r10.mTokenType
                java.lang.String r3 = r10.mAccessToken
                java.lang.Long r4 = r10.mAccessTokenExpirationTime
                java.lang.String r5 = r10.mIdToken
                java.lang.String r6 = r10.mRefreshToken
                java.lang.String r7 = r10.mScope
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.mAdditionalParameters
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        public net.openid.appauth.TokenResponse.Builder fromResponseJson(org.json.JSONObject r3) throws org.json.JSONException {
                r2 = this;
                java.lang.String r0 = "token_type"
                java.lang.String r0 = net.openid.appauth.JsonUtil.getString(r3, r0)
                r2.setTokenType(r0)
                java.lang.String r0 = "access_token"
                java.lang.String r0 = net.openid.appauth.JsonUtil.getStringIfDefined(r3, r0)
                r2.setAccessToken(r0)
                java.lang.String r0 = "expires_at"
                java.lang.Long r0 = net.openid.appauth.JsonUtil.getLongIfDefined(r3, r0)
                r2.setAccessTokenExpirationTime(r0)
                java.lang.String r0 = "expires_in"
                boolean r1 = r3.has(r0)
                if (r1 == 0) goto L2e
                long r0 = r3.getLong(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.setAccessTokenExpiresIn(r0)
            L2e:
                java.lang.String r0 = "refresh_token"
                java.lang.String r0 = net.openid.appauth.JsonUtil.getStringIfDefined(r3, r0)
                r2.setRefreshToken(r0)
                java.lang.String r0 = "id_token"
                java.lang.String r0 = net.openid.appauth.JsonUtil.getStringIfDefined(r3, r0)
                r2.setIdToken(r0)
                java.lang.String r0 = "scope"
                java.lang.String r0 = net.openid.appauth.JsonUtil.getStringIfDefined(r3, r0)
                r2.setScope(r0)
                java.util.Set r0 = net.openid.appauth.TokenResponse.access$000()
                java.util.Map r3 = net.openid.appauth.AdditionalParamsProcessor.extractAdditionalParams(r3, r0)
                r2.setAdditionalParameters(r3)
                return r2
        }

        public net.openid.appauth.TokenResponse.Builder fromResponseJsonString(java.lang.String r2) throws org.json.JSONException {
                r1 = this;
                java.lang.String r0 = "json cannot be null or empty"
                net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r2)
                net.openid.appauth.TokenResponse$Builder r2 = r1.fromResponseJson(r0)
                return r2
        }

        public net.openid.appauth.TokenResponse.Builder setAccessToken(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "access token cannot be empty if specified"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mAccessToken = r2
                return r1
        }

        public net.openid.appauth.TokenResponse.Builder setAccessTokenExpirationTime(java.lang.Long r1) {
                r0 = this;
                r0.mAccessTokenExpirationTime = r1
                return r0
        }

        public net.openid.appauth.TokenResponse.Builder setAccessTokenExpiresIn(java.lang.Long r2) {
                r1 = this;
                net.openid.appauth.SystemClock r0 = net.openid.appauth.SystemClock.INSTANCE
                net.openid.appauth.TokenResponse$Builder r2 = r1.setAccessTokenExpiresIn(r2, r0)
                return r2
        }

        net.openid.appauth.TokenResponse.Builder setAccessTokenExpiresIn(java.lang.Long r5, net.openid.appauth.Clock r6) {
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

        public net.openid.appauth.TokenResponse.Builder setAdditionalParameters(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Set r0 = net.openid.appauth.TokenResponse.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.checkAdditionalParams(r2, r0)
                r1.mAdditionalParameters = r2
                return r1
        }

        public net.openid.appauth.TokenResponse.Builder setIdToken(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "id token must not be empty if defined"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mIdToken = r2
                return r1
        }

        public net.openid.appauth.TokenResponse.Builder setRefreshToken(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "refresh token must not be empty if defined"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mRefreshToken = r2
                return r1
        }

        public net.openid.appauth.TokenResponse.Builder setRequest(net.openid.appauth.TokenRequest r2) {
                r1 = this;
                java.lang.String r0 = "request cannot be null"
                java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                net.openid.appauth.TokenRequest r2 = (net.openid.appauth.TokenRequest) r2
                r1.mRequest = r2
                return r1
        }

        public net.openid.appauth.TokenResponse.Builder setScope(java.lang.String r2) {
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

        public net.openid.appauth.TokenResponse.Builder setScopes(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mScope = r1
                return r0
        }

        public net.openid.appauth.TokenResponse.Builder setScopes(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L5
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
            L5:
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.setScopes(r1)
                return r0
        }

        public net.openid.appauth.TokenResponse.Builder setTokenType(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "token type must not be empty if defined"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mTokenType = r2
                return r1
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 6
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "token_type"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "access_token"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "expires_in"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "refresh_token"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "id_token"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "scope"
            r1[r2] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            net.openid.appauth.TokenResponse.BUILT_IN_PARAMS = r0
            return
    }

    TokenResponse(net.openid.appauth.TokenRequest r1, java.lang.String r2, java.lang.String r3, java.lang.Long r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r0 = this;
            r0.<init>()
            r0.request = r1
            r0.tokenType = r2
            r0.accessToken = r3
            r0.accessTokenExpirationTime = r4
            r0.idToken = r5
            r0.refreshToken = r6
            r0.scope = r7
            r0.additionalParameters = r8
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<java.lang.String> r0 = net.openid.appauth.TokenResponse.BUILT_IN_PARAMS
            return r0
    }

    public static net.openid.appauth.TokenResponse jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "jsonStr cannot be null or empty"
            net.openid.appauth.Preconditions.checkNotEmpty(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.TokenResponse r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.TokenResponse jsonDeserialize(org.json.JSONObject r11) throws org.json.JSONException {
            java.lang.String r0 = "request"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L41
            net.openid.appauth.TokenResponse r1 = new net.openid.appauth.TokenResponse
            org.json.JSONObject r0 = r11.getJSONObject(r0)
            net.openid.appauth.TokenRequest r3 = net.openid.appauth.TokenRequest.jsonDeserialize(r0)
            java.lang.String r0 = "token_type"
            java.lang.String r4 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r0)
            java.lang.String r0 = "access_token"
            java.lang.String r5 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r0)
            java.lang.String r0 = "expires_at"
            java.lang.Long r6 = net.openid.appauth.JsonUtil.getLongIfDefined(r11, r0)
            java.lang.String r0 = "id_token"
            java.lang.String r7 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r0)
            java.lang.String r0 = "refresh_token"
            java.lang.String r8 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r0)
            java.lang.String r0 = "scope"
            java.lang.String r9 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r0)
            java.lang.String r0 = "additionalParameters"
            java.util.Map r10 = net.openid.appauth.JsonUtil.getStringMap(r11, r0)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L41:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "token request not provided and not found in JSON"
            r11.<init>(r0)
            throw r11
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
            net.openid.appauth.TokenRequest r1 = r3.request
            org.json.JSONObject r1 = r1.jsonSerialize()
            java.lang.String r2 = "request"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r3.tokenType
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
            java.lang.String r1 = "refresh_token"
            java.lang.String r2 = r3.refreshToken
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "scope"
            java.lang.String r2 = r3.scope
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
