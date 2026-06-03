package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class RegistrationResponse {
    private static final java.util.Set<java.lang.String> BUILT_IN_PARAMS = null;
    static final java.lang.String KEY_ADDITIONAL_PARAMETERS = "additionalParameters";
    static final java.lang.String KEY_REQUEST = "request";
    static final java.lang.String PARAM_CLIENT_ID = "client_id";
    static final java.lang.String PARAM_CLIENT_ID_ISSUED_AT = "client_id_issued_at";
    static final java.lang.String PARAM_CLIENT_SECRET = "client_secret";
    static final java.lang.String PARAM_CLIENT_SECRET_EXPIRES_AT = "client_secret_expires_at";
    static final java.lang.String PARAM_REGISTRATION_ACCESS_TOKEN = "registration_access_token";
    static final java.lang.String PARAM_REGISTRATION_CLIENT_URI = "registration_client_uri";
    static final java.lang.String PARAM_TOKEN_ENDPOINT_AUTH_METHOD = "token_endpoint_auth_method";
    public final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    public final java.lang.String clientId;
    public final java.lang.Long clientIdIssuedAt;
    public final java.lang.String clientSecret;
    public final java.lang.Long clientSecretExpiresAt;
    public final java.lang.String registrationAccessToken;
    public final android.net.Uri registrationClientUri;
    public final net.openid.appauth.RegistrationRequest request;
    public final java.lang.String tokenEndpointAuthMethod;

    /* JADX INFO: renamed from: net.openid.appauth.RegistrationResponse$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> mAdditionalParameters;
        private java.lang.String mClientId;
        private java.lang.Long mClientIdIssuedAt;
        private java.lang.String mClientSecret;
        private java.lang.Long mClientSecretExpiresAt;
        private java.lang.String mRegistrationAccessToken;
        private android.net.Uri mRegistrationClientUri;
        private net.openid.appauth.RegistrationRequest mRequest;
        private java.lang.String mTokenEndpointAuthMethod;

        public Builder(net.openid.appauth.RegistrationRequest r2) {
                r1 = this;
                r1.<init>()
                java.util.Map r0 = java.util.Collections.emptyMap()
                r1.mAdditionalParameters = r0
                r1.setRequest(r2)
                return
        }

        public net.openid.appauth.RegistrationResponse build() {
                r12 = this;
                net.openid.appauth.RegistrationResponse r11 = new net.openid.appauth.RegistrationResponse
                net.openid.appauth.RegistrationRequest r1 = r12.mRequest
                java.lang.String r2 = r12.mClientId
                java.lang.Long r3 = r12.mClientIdIssuedAt
                java.lang.String r4 = r12.mClientSecret
                java.lang.Long r5 = r12.mClientSecretExpiresAt
                java.lang.String r6 = r12.mRegistrationAccessToken
                android.net.Uri r7 = r12.mRegistrationClientUri
                java.lang.String r8 = r12.mTokenEndpointAuthMethod
                java.util.Map<java.lang.String, java.lang.String> r9 = r12.mAdditionalParameters
                r10 = 0
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        public net.openid.appauth.RegistrationResponse.Builder fromResponseJson(org.json.JSONObject r5) throws org.json.JSONException, net.openid.appauth.RegistrationResponse.MissingArgumentException {
                r4 = this;
                java.lang.String r0 = "client_id"
                java.lang.String r0 = net.openid.appauth.JsonUtil.getString(r5, r0)
                r4.setClientId(r0)
                java.lang.String r0 = "client_id_issued_at"
                java.lang.Long r0 = net.openid.appauth.JsonUtil.getLongIfDefined(r5, r0)
                r4.setClientIdIssuedAt(r0)
                java.lang.String r0 = "client_secret"
                boolean r1 = r5.has(r0)
                if (r1 == 0) goto L3b
                java.lang.String r1 = "client_secret_expires_at"
                boolean r2 = r5.has(r1)
                if (r2 == 0) goto L35
                java.lang.String r0 = r5.getString(r0)
                r4.setClientSecret(r0)
                long r0 = r5.getLong(r1)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r4.setClientSecretExpiresAt(r0)
                goto L3b
            L35:
                net.openid.appauth.RegistrationResponse$MissingArgumentException r5 = new net.openid.appauth.RegistrationResponse$MissingArgumentException
                r5.<init>(r1)
                throw r5
            L3b:
                java.lang.String r0 = "registration_access_token"
                boolean r1 = r5.has(r0)
                java.lang.String r2 = "registration_client_uri"
                boolean r3 = r5.has(r2)
                if (r1 == r3) goto L56
                boolean r5 = r5.has(r0)
                if (r5 == 0) goto L50
                r0 = r2
            L50:
                net.openid.appauth.RegistrationResponse$MissingArgumentException r5 = new net.openid.appauth.RegistrationResponse$MissingArgumentException
                r5.<init>(r0)
                throw r5
            L56:
                java.lang.String r0 = net.openid.appauth.JsonUtil.getStringIfDefined(r5, r0)
                r4.setRegistrationAccessToken(r0)
                android.net.Uri r0 = net.openid.appauth.JsonUtil.getUriIfDefined(r5, r2)
                r4.setRegistrationClientUri(r0)
                java.lang.String r0 = "token_endpoint_auth_method"
                java.lang.String r0 = net.openid.appauth.JsonUtil.getStringIfDefined(r5, r0)
                r4.setTokenEndpointAuthMethod(r0)
                java.util.Set r0 = net.openid.appauth.RegistrationResponse.access$000()
                java.util.Map r5 = net.openid.appauth.AdditionalParamsProcessor.extractAdditionalParams(r5, r0)
                r4.setAdditionalParameters(r5)
                return r4
        }

        public net.openid.appauth.RegistrationResponse.Builder fromResponseJsonString(java.lang.String r2) throws org.json.JSONException, net.openid.appauth.RegistrationResponse.MissingArgumentException {
                r1 = this;
                java.lang.String r0 = "json cannot be null or empty"
                net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r2)
                net.openid.appauth.RegistrationResponse$Builder r2 = r1.fromResponseJson(r0)
                return r2
        }

        public net.openid.appauth.RegistrationResponse.Builder setAdditionalParameters(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Set r0 = net.openid.appauth.RegistrationResponse.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.checkAdditionalParams(r2, r0)
                r1.mAdditionalParameters = r2
                return r1
        }

        public net.openid.appauth.RegistrationResponse.Builder setClientId(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "client ID cannot be null or empty"
                net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
                r1.mClientId = r2
                return r1
        }

        public net.openid.appauth.RegistrationResponse.Builder setClientIdIssuedAt(java.lang.Long r1) {
                r0 = this;
                r0.mClientIdIssuedAt = r1
                return r0
        }

        public net.openid.appauth.RegistrationResponse.Builder setClientSecret(java.lang.String r1) {
                r0 = this;
                r0.mClientSecret = r1
                return r0
        }

        public net.openid.appauth.RegistrationResponse.Builder setClientSecretExpiresAt(java.lang.Long r1) {
                r0 = this;
                r0.mClientSecretExpiresAt = r1
                return r0
        }

        public net.openid.appauth.RegistrationResponse.Builder setRegistrationAccessToken(java.lang.String r1) {
                r0 = this;
                r0.mRegistrationAccessToken = r1
                return r0
        }

        public net.openid.appauth.RegistrationResponse.Builder setRegistrationClientUri(android.net.Uri r1) {
                r0 = this;
                r0.mRegistrationClientUri = r1
                return r0
        }

        public net.openid.appauth.RegistrationResponse.Builder setRequest(net.openid.appauth.RegistrationRequest r2) {
                r1 = this;
                java.lang.String r0 = "request cannot be null"
                java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                net.openid.appauth.RegistrationRequest r2 = (net.openid.appauth.RegistrationRequest) r2
                r1.mRequest = r2
                return r1
        }

        public net.openid.appauth.RegistrationResponse.Builder setTokenEndpointAuthMethod(java.lang.String r1) {
                r0 = this;
                r0.mTokenEndpointAuthMethod = r1
                return r0
        }
    }

    public static class MissingArgumentException extends java.lang.Exception {
        private java.lang.String mMissingField;

        public MissingArgumentException(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Missing mandatory registration field: "
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.mMissingField = r3
                return
        }

        public java.lang.String getMissingField() {
                r1 = this;
                java.lang.String r0 = r1.mMissingField
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
            java.lang.String r3 = "client_secret"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "client_secret_expires_at"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "registration_access_token"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "registration_client_uri"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "client_id_issued_at"
            r1[r2] = r3
            r2 = 6
            java.lang.String r3 = "token_endpoint_auth_method"
            r1[r2] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            net.openid.appauth.RegistrationResponse.BUILT_IN_PARAMS = r0
            return
    }

    private RegistrationResponse(net.openid.appauth.RegistrationRequest r1, java.lang.String r2, java.lang.Long r3, java.lang.String r4, java.lang.Long r5, java.lang.String r6, android.net.Uri r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r0 = this;
            r0.<init>()
            r0.request = r1
            r0.clientId = r2
            r0.clientIdIssuedAt = r3
            r0.clientSecret = r4
            r0.clientSecretExpiresAt = r5
            r0.registrationAccessToken = r6
            r0.registrationClientUri = r7
            r0.tokenEndpointAuthMethod = r8
            r0.additionalParameters = r9
            return
    }

    /* synthetic */ RegistrationResponse(net.openid.appauth.RegistrationRequest r1, java.lang.String r2, java.lang.Long r3, java.lang.String r4, java.lang.Long r5, java.lang.String r6, android.net.Uri r7, java.lang.String r8, java.util.Map r9, net.openid.appauth.RegistrationResponse.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<java.lang.String> r0 = net.openid.appauth.RegistrationResponse.BUILT_IN_PARAMS
            return r0
    }

    public static net.openid.appauth.RegistrationResponse fromJson(net.openid.appauth.RegistrationRequest r1, java.lang.String r2) throws org.json.JSONException, net.openid.appauth.RegistrationResponse.MissingArgumentException {
            java.lang.String r0 = "jsonStr cannot be null or empty"
            net.openid.appauth.Preconditions.checkNotEmpty(r2, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            net.openid.appauth.RegistrationResponse r1 = fromJson(r1, r0)
            return r1
    }

    public static net.openid.appauth.RegistrationResponse fromJson(net.openid.appauth.RegistrationRequest r1, org.json.JSONObject r2) throws org.json.JSONException, net.openid.appauth.RegistrationResponse.MissingArgumentException {
            java.lang.String r0 = "registration request cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            net.openid.appauth.RegistrationResponse$Builder r0 = new net.openid.appauth.RegistrationResponse$Builder
            r0.<init>(r1)
            net.openid.appauth.RegistrationResponse$Builder r1 = r0.fromResponseJson(r2)
            net.openid.appauth.RegistrationResponse r1 = r1.build()
            return r1
    }

    public static net.openid.appauth.RegistrationResponse jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "jsonStr cannot be null or empty"
            net.openid.appauth.Preconditions.checkNotEmpty(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.RegistrationResponse r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.RegistrationResponse jsonDeserialize(org.json.JSONObject r12) throws org.json.JSONException {
            java.lang.String r0 = "json cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r12, r0)
            java.lang.String r0 = "request"
            boolean r1 = r12.has(r0)
            if (r1 == 0) goto L4c
            net.openid.appauth.RegistrationResponse r1 = new net.openid.appauth.RegistrationResponse
            org.json.JSONObject r0 = r12.getJSONObject(r0)
            net.openid.appauth.RegistrationRequest r3 = net.openid.appauth.RegistrationRequest.jsonDeserialize(r0)
            java.lang.String r0 = "client_id"
            java.lang.String r4 = net.openid.appauth.JsonUtil.getString(r12, r0)
            java.lang.String r0 = "client_id_issued_at"
            java.lang.Long r5 = net.openid.appauth.JsonUtil.getLongIfDefined(r12, r0)
            java.lang.String r0 = "client_secret"
            java.lang.String r6 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "client_secret_expires_at"
            java.lang.Long r7 = net.openid.appauth.JsonUtil.getLongIfDefined(r12, r0)
            java.lang.String r0 = "registration_access_token"
            java.lang.String r8 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "registration_client_uri"
            android.net.Uri r9 = net.openid.appauth.JsonUtil.getUriIfDefined(r12, r0)
            java.lang.String r0 = "token_endpoint_auth_method"
            java.lang.String r10 = net.openid.appauth.JsonUtil.getStringIfDefined(r12, r0)
            java.lang.String r0 = "additionalParameters"
            java.util.Map r11 = net.openid.appauth.JsonUtil.getStringMap(r12, r0)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L4c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "registration request not found in JSON"
            r12.<init>(r0)
            throw r12
    }

    public boolean hasClientSecretExpired() {
            r1 = this;
            net.openid.appauth.SystemClock r0 = net.openid.appauth.SystemClock.INSTANCE
            boolean r0 = r1.hasClientSecretExpired(r0)
            return r0
    }

    boolean hasClientSecretExpired(net.openid.appauth.Clock r5) {
            r4 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r5 = net.openid.appauth.Preconditions.checkNotNull(r5)
            net.openid.appauth.Clock r5 = (net.openid.appauth.Clock) r5
            long r1 = r5.getCurrentTimeMillis()
            long r0 = r0.toSeconds(r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = r4.clientSecretExpiresAt
            if (r0 == 0) goto L28
            long r0 = r5.longValue()
            java.lang.Long r5 = r4.clientSecretExpiresAt
            long r2 = r5.longValue()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
    }

    public org.json.JSONObject jsonSerialize() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            net.openid.appauth.RegistrationRequest r1 = r3.request
            org.json.JSONObject r1 = r1.jsonSerialize()
            java.lang.String r2 = "request"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            java.lang.String r1 = "client_id"
            java.lang.String r2 = r3.clientId
            net.openid.appauth.JsonUtil.put(r0, r1, r2)
            java.lang.String r1 = "client_id_issued_at"
            java.lang.Long r2 = r3.clientIdIssuedAt
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "client_secret"
            java.lang.String r2 = r3.clientSecret
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "client_secret_expires_at"
            java.lang.Long r2 = r3.clientSecretExpiresAt
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "registration_access_token"
            java.lang.String r2 = r3.registrationAccessToken
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "registration_client_uri"
            android.net.Uri r2 = r3.registrationClientUri
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "token_endpoint_auth_method"
            java.lang.String r2 = r3.tokenEndpointAuthMethod
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
