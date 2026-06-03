package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class RegistrationRequest {
    public static final java.lang.String APPLICATION_TYPE_NATIVE = "native";
    private static final java.util.Set<java.lang.String> BUILT_IN_PARAMS = null;
    static final java.lang.String KEY_ADDITIONAL_PARAMETERS = "additionalParameters";
    static final java.lang.String KEY_CONFIGURATION = "configuration";
    static final java.lang.String PARAM_APPLICATION_TYPE = "application_type";
    static final java.lang.String PARAM_GRANT_TYPES = "grant_types";
    static final java.lang.String PARAM_JWKS = "jwks";
    static final java.lang.String PARAM_JWKS_URI = "jwks_uri";
    static final java.lang.String PARAM_REDIRECT_URIS = "redirect_uris";
    static final java.lang.String PARAM_RESPONSE_TYPES = "response_types";
    static final java.lang.String PARAM_SUBJECT_TYPE = "subject_type";
    static final java.lang.String PARAM_TOKEN_ENDPOINT_AUTHENTICATION_METHOD = "token_endpoint_auth_method";
    public static final java.lang.String SUBJECT_TYPE_PAIRWISE = "pairwise";
    public static final java.lang.String SUBJECT_TYPE_PUBLIC = "public";
    public final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    public final java.lang.String applicationType;
    public final net.openid.appauth.AuthorizationServiceConfiguration configuration;
    public final java.util.List<java.lang.String> grantTypes;
    public final org.json.JSONObject jwks;
    public final android.net.Uri jwksUri;
    public final java.util.List<android.net.Uri> redirectUris;
    public final java.util.List<java.lang.String> responseTypes;
    public final java.lang.String subjectType;
    public final java.lang.String tokenEndpointAuthenticationMethod;

    /* JADX INFO: renamed from: net.openid.appauth.RegistrationRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> mAdditionalParameters;
        private net.openid.appauth.AuthorizationServiceConfiguration mConfiguration;
        private java.util.List<java.lang.String> mGrantTypes;
        private org.json.JSONObject mJwks;
        private android.net.Uri mJwksUri;
        private java.util.List<android.net.Uri> mRedirectUris;
        private java.util.List<java.lang.String> mResponseTypes;
        private java.lang.String mSubjectType;
        private java.lang.String mTokenEndpointAuthenticationMethod;

        public Builder(net.openid.appauth.AuthorizationServiceConfiguration r2, java.util.List<android.net.Uri> r3) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mRedirectUris = r0
                java.util.Map r0 = java.util.Collections.emptyMap()
                r1.mAdditionalParameters = r0
                r1.setConfiguration(r2)
                r1.setRedirectUriValues(r3)
                return
        }

        public net.openid.appauth.RegistrationRequest build() {
                r12 = this;
                net.openid.appauth.RegistrationRequest r11 = new net.openid.appauth.RegistrationRequest
                net.openid.appauth.AuthorizationServiceConfiguration r1 = r12.mConfiguration
                java.util.List<android.net.Uri> r0 = r12.mRedirectUris
                java.util.List r2 = java.util.Collections.unmodifiableList(r0)
                java.util.List<java.lang.String> r0 = r12.mResponseTypes
                if (r0 != 0) goto Lf
                goto L13
            Lf:
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            L13:
                r3 = r0
                java.util.List<java.lang.String> r0 = r12.mGrantTypes
                if (r0 != 0) goto L19
                goto L1d
            L19:
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            L1d:
                r4 = r0
                java.lang.String r5 = r12.mSubjectType
                android.net.Uri r6 = r12.mJwksUri
                org.json.JSONObject r7 = r12.mJwks
                java.lang.String r8 = r12.mTokenEndpointAuthenticationMethod
                java.util.Map<java.lang.String, java.lang.String> r0 = r12.mAdditionalParameters
                java.util.Map r9 = java.util.Collections.unmodifiableMap(r0)
                r10 = 0
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        public net.openid.appauth.RegistrationRequest.Builder setAdditionalParameters(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Set r0 = net.openid.appauth.RegistrationRequest.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.checkAdditionalParams(r2, r0)
                r1.mAdditionalParameters = r2
                return r1
        }

        public net.openid.appauth.RegistrationRequest.Builder setConfiguration(net.openid.appauth.AuthorizationServiceConfiguration r1) {
                r0 = this;
                java.lang.Object r1 = net.openid.appauth.Preconditions.checkNotNull(r1)
                net.openid.appauth.AuthorizationServiceConfiguration r1 = (net.openid.appauth.AuthorizationServiceConfiguration) r1
                r0.mConfiguration = r1
                return r0
        }

        public net.openid.appauth.RegistrationRequest.Builder setGrantTypeValues(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.mGrantTypes = r1
                return r0
        }

        public net.openid.appauth.RegistrationRequest.Builder setGrantTypeValues(java.lang.String... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.openid.appauth.RegistrationRequest$Builder r1 = r0.setGrantTypeValues(r1)
                return r1
        }

        public net.openid.appauth.RegistrationRequest.Builder setJwks(org.json.JSONObject r1) {
                r0 = this;
                r0.mJwks = r1
                return r0
        }

        public net.openid.appauth.RegistrationRequest.Builder setJwksUri(android.net.Uri r1) {
                r0 = this;
                r0.mJwksUri = r1
                return r0
        }

        public net.openid.appauth.RegistrationRequest.Builder setRedirectUriValues(java.util.List<android.net.Uri> r2) {
                r1 = this;
                java.lang.String r0 = "redirectUriValues cannot be null"
                net.openid.appauth.Preconditions.checkCollectionNotEmpty(r2, r0)
                r1.mRedirectUris = r2
                return r1
        }

        public net.openid.appauth.RegistrationRequest.Builder setRedirectUriValues(android.net.Uri... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.openid.appauth.RegistrationRequest$Builder r1 = r0.setRedirectUriValues(r1)
                return r1
        }

        public net.openid.appauth.RegistrationRequest.Builder setResponseTypeValues(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.mResponseTypes = r1
                return r0
        }

        public net.openid.appauth.RegistrationRequest.Builder setResponseTypeValues(java.lang.String... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.openid.appauth.RegistrationRequest$Builder r1 = r0.setResponseTypeValues(r1)
                return r1
        }

        public net.openid.appauth.RegistrationRequest.Builder setSubjectType(java.lang.String r1) {
                r0 = this;
                r0.mSubjectType = r1
                return r0
        }

        public net.openid.appauth.RegistrationRequest.Builder setTokenEndpointAuthenticationMethod(java.lang.String r1) {
                r0 = this;
                r0.mTokenEndpointAuthenticationMethod = r1
                return r0
        }
    }

    static {
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "redirect_uris"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "response_types"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "grant_types"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "application_type"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "subject_type"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "jwks_uri"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "jwks"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "token_endpoint_auth_method"
            r0[r1] = r2
            java.util.Set r0 = net.openid.appauth.AdditionalParamsProcessor.builtInParams(r0)
            net.openid.appauth.RegistrationRequest.BUILT_IN_PARAMS = r0
            return
    }

    private RegistrationRequest(net.openid.appauth.AuthorizationServiceConfiguration r1, java.util.List<android.net.Uri> r2, java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4, java.lang.String r5, android.net.Uri r6, org.json.JSONObject r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r0 = this;
            r0.<init>()
            r0.configuration = r1
            r0.redirectUris = r2
            r0.responseTypes = r3
            r0.grantTypes = r4
            r0.subjectType = r5
            r0.jwksUri = r6
            r0.jwks = r7
            r0.tokenEndpointAuthenticationMethod = r8
            r0.additionalParameters = r9
            java.lang.String r1 = "native"
            r0.applicationType = r1
            return
    }

    /* synthetic */ RegistrationRequest(net.openid.appauth.AuthorizationServiceConfiguration r1, java.util.List r2, java.util.List r3, java.util.List r4, java.lang.String r5, android.net.Uri r6, org.json.JSONObject r7, java.lang.String r8, java.util.Map r9, net.openid.appauth.RegistrationRequest.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<java.lang.String> r0 = net.openid.appauth.RegistrationRequest.BUILT_IN_PARAMS
            return r0
    }

    public static net.openid.appauth.RegistrationRequest jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "jsonStr must not be empty or null"
            net.openid.appauth.Preconditions.checkNotEmpty(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.RegistrationRequest r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.RegistrationRequest jsonDeserialize(org.json.JSONObject r11) throws org.json.JSONException {
            java.lang.String r0 = "json must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r11, r0)
            net.openid.appauth.RegistrationRequest r0 = new net.openid.appauth.RegistrationRequest
            java.lang.String r1 = "configuration"
            org.json.JSONObject r1 = r11.getJSONObject(r1)
            net.openid.appauth.AuthorizationServiceConfiguration r2 = net.openid.appauth.AuthorizationServiceConfiguration.fromJson(r1)
            java.lang.String r1 = "redirect_uris"
            java.util.List r3 = net.openid.appauth.JsonUtil.getUriList(r11, r1)
            java.lang.String r1 = "response_types"
            java.util.List r4 = net.openid.appauth.JsonUtil.getStringListIfDefined(r11, r1)
            java.lang.String r1 = "grant_types"
            java.util.List r5 = net.openid.appauth.JsonUtil.getStringListIfDefined(r11, r1)
            java.lang.String r1 = "subject_type"
            java.lang.String r6 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r1)
            java.lang.String r1 = "jwks_uri"
            android.net.Uri r7 = net.openid.appauth.JsonUtil.getUriIfDefined(r11, r1)
            java.lang.String r1 = "jwks"
            org.json.JSONObject r8 = net.openid.appauth.JsonUtil.getJsonObjectIfDefined(r11, r1)
            java.lang.String r1 = "token_endpoint_auth_method"
            java.lang.String r9 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r1)
            java.lang.String r1 = "additionalParameters"
            java.util.Map r10 = net.openid.appauth.JsonUtil.getStringMap(r11, r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    private org.json.JSONObject jsonSerializeParams() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.List<android.net.Uri> r1 = r3.redirectUris
            org.json.JSONArray r1 = net.openid.appauth.JsonUtil.toJsonArray(r1)
            java.lang.String r2 = "redirect_uris"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
            java.lang.String r1 = "application_type"
            java.lang.String r2 = r3.applicationType
            net.openid.appauth.JsonUtil.put(r0, r1, r2)
            java.util.List<java.lang.String> r1 = r3.responseTypes
            if (r1 == 0) goto L24
            java.lang.String r2 = "response_types"
            org.json.JSONArray r1 = net.openid.appauth.JsonUtil.toJsonArray(r1)
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L24:
            java.util.List<java.lang.String> r1 = r3.grantTypes
            if (r1 == 0) goto L31
            java.lang.String r2 = "grant_types"
            org.json.JSONArray r1 = net.openid.appauth.JsonUtil.toJsonArray(r1)
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L31:
            java.lang.String r1 = "subject_type"
            java.lang.String r2 = r3.subjectType
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "jwks_uri"
            android.net.Uri r2 = r3.jwksUri
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "jwks"
            org.json.JSONObject r2 = r3.jwks
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "token_endpoint_auth_method"
            java.lang.String r2 = r3.tokenEndpointAuthenticationMethod
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            return r0
    }

    public org.json.JSONObject jsonSerialize() {
            r3 = this;
            org.json.JSONObject r0 = r3.jsonSerializeParams()
            net.openid.appauth.AuthorizationServiceConfiguration r1 = r3.configuration
            org.json.JSONObject r1 = r1.toJson()
            java.lang.String r2 = "configuration"
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
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

    public java.lang.String toJsonString() {
            r4 = this;
            org.json.JSONObject r0 = r4.jsonSerializeParams()
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.additionalParameters
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            net.openid.appauth.JsonUtil.put(r0, r3, r2)
            goto Le
        L2a:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
