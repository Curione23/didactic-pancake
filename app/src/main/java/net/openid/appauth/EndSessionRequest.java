package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class EndSessionRequest implements net.openid.appauth.AuthorizationManagementRequest {
    private static final java.util.Set<java.lang.String> BUILT_IN_PARAMS = null;
    private static final java.lang.String KEY_ADDITIONAL_PARAMETERS = "additionalParameters";
    private static final java.lang.String KEY_CONFIGURATION = "configuration";
    private static final java.lang.String KEY_ID_TOKEN_HINT = "id_token_hint";
    private static final java.lang.String KEY_POST_LOGOUT_REDIRECT_URI = "post_logout_redirect_uri";
    private static final java.lang.String KEY_STATE = "state";
    private static final java.lang.String KEY_UI_LOCALES = "ui_locales";
    static final java.lang.String PARAM_ID_TOKEN_HINT = "id_token_hint";
    static final java.lang.String PARAM_POST_LOGOUT_REDIRECT_URI = "post_logout_redirect_uri";
    static final java.lang.String PARAM_STATE = "state";
    static final java.lang.String PARAM_UI_LOCALES = "ui_locales";
    public final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    public final net.openid.appauth.AuthorizationServiceConfiguration configuration;
    public final java.lang.String idTokenHint;
    public final android.net.Uri postLogoutRedirectUri;
    public final java.lang.String state;
    public final java.lang.String uiLocales;

    /* JADX INFO: renamed from: net.openid.appauth.EndSessionRequest$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> mAdditionalParameters;
        private net.openid.appauth.AuthorizationServiceConfiguration mConfiguration;
        private java.lang.String mIdTokenHint;
        private android.net.Uri mPostLogoutRedirectUri;
        private java.lang.String mState;
        private java.lang.String mUiLocales;

        public Builder(net.openid.appauth.AuthorizationServiceConfiguration r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mAdditionalParameters = r0
                r1.setAuthorizationServiceConfiguration(r2)
                java.lang.String r2 = net.openid.appauth.AuthorizationManagementUtil.generateRandomState()
                r1.setState(r2)
                return
        }

        public net.openid.appauth.EndSessionRequest build() {
                r9 = this;
                net.openid.appauth.EndSessionRequest r8 = new net.openid.appauth.EndSessionRequest
                net.openid.appauth.AuthorizationServiceConfiguration r1 = r9.mConfiguration
                java.lang.String r2 = r9.mIdTokenHint
                android.net.Uri r3 = r9.mPostLogoutRedirectUri
                java.lang.String r4 = r9.mState
                java.lang.String r5 = r9.mUiLocales
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map<java.lang.String, java.lang.String> r6 = r9.mAdditionalParameters
                r0.<init>(r6)
                java.util.Map r6 = java.util.Collections.unmodifiableMap(r0)
                r7 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public net.openid.appauth.EndSessionRequest.Builder setAdditionalParameters(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Set r0 = net.openid.appauth.EndSessionRequest.access$000()
                java.util.Map r2 = net.openid.appauth.AdditionalParamsProcessor.checkAdditionalParams(r2, r0)
                r1.mAdditionalParameters = r2
                return r1
        }

        public net.openid.appauth.EndSessionRequest.Builder setAuthorizationServiceConfiguration(net.openid.appauth.AuthorizationServiceConfiguration r2) {
                r1 = this;
                java.lang.String r0 = "configuration cannot be null"
                java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                net.openid.appauth.AuthorizationServiceConfiguration r2 = (net.openid.appauth.AuthorizationServiceConfiguration) r2
                r1.mConfiguration = r2
                return r1
        }

        public net.openid.appauth.EndSessionRequest.Builder setIdTokenHint(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "idTokenHint must not be empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mIdTokenHint = r2
                return r1
        }

        public net.openid.appauth.EndSessionRequest.Builder setPostLogoutRedirectUri(android.net.Uri r1) {
                r0 = this;
                r0.mPostLogoutRedirectUri = r1
                return r0
        }

        public net.openid.appauth.EndSessionRequest.Builder setState(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "state must not be empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mState = r2
                return r1
        }

        public net.openid.appauth.EndSessionRequest.Builder setUiLocales(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "uiLocales must be null or not empty"
                java.lang.String r2 = net.openid.appauth.Preconditions.checkNullOrNotEmpty(r2, r0)
                r1.mUiLocales = r2
                return r1
        }

        public net.openid.appauth.EndSessionRequest.Builder setUiLocalesValues(java.lang.Iterable<java.lang.String> r1) {
                r0 = this;
                java.lang.String r1 = net.openid.appauth.AsciiStringListUtil.iterableToString(r1)
                r0.mUiLocales = r1
                return r0
        }

        public net.openid.appauth.EndSessionRequest.Builder setUiLocalesValues(java.lang.String... r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                r0.mUiLocales = r1
                return r0
            L6:
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.openid.appauth.EndSessionRequest$Builder r1 = r0.setUiLocalesValues(r1)
                return r1
        }
    }

    static {
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "id_token_hint"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "post_logout_redirect_uri"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "state"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "ui_locales"
            r0[r1] = r2
            java.util.Set r0 = net.openid.appauth.AdditionalParamsProcessor.builtInParams(r0)
            net.openid.appauth.EndSessionRequest.BUILT_IN_PARAMS = r0
            return
    }

    private EndSessionRequest(net.openid.appauth.AuthorizationServiceConfiguration r1, java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r0 = this;
            r0.<init>()
            r0.configuration = r1
            r0.idTokenHint = r2
            r0.postLogoutRedirectUri = r3
            r0.state = r4
            r0.uiLocales = r5
            r0.additionalParameters = r6
            return
    }

    /* synthetic */ EndSessionRequest(net.openid.appauth.AuthorizationServiceConfiguration r1, java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5, java.util.Map r6, net.openid.appauth.EndSessionRequest.AnonymousClass1 r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ java.util.Set access$000() {
            java.util.Set<java.lang.String> r0 = net.openid.appauth.EndSessionRequest.BUILT_IN_PARAMS
            return r0
    }

    public static net.openid.appauth.EndSessionRequest jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "json string cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.EndSessionRequest r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.EndSessionRequest jsonDeserialize(org.json.JSONObject r8) throws org.json.JSONException {
            java.lang.String r0 = "json cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r8, r0)
            net.openid.appauth.EndSessionRequest r0 = new net.openid.appauth.EndSessionRequest
            java.lang.String r1 = "configuration"
            org.json.JSONObject r1 = r8.getJSONObject(r1)
            net.openid.appauth.AuthorizationServiceConfiguration r2 = net.openid.appauth.AuthorizationServiceConfiguration.fromJson(r1)
            java.lang.String r1 = "id_token_hint"
            java.lang.String r3 = net.openid.appauth.JsonUtil.getStringIfDefined(r8, r1)
            java.lang.String r1 = "post_logout_redirect_uri"
            android.net.Uri r4 = net.openid.appauth.JsonUtil.getUriIfDefined(r8, r1)
            java.lang.String r1 = "state"
            java.lang.String r5 = net.openid.appauth.JsonUtil.getStringIfDefined(r8, r1)
            java.lang.String r1 = "ui_locales"
            java.lang.String r6 = net.openid.appauth.JsonUtil.getStringIfDefined(r8, r1)
            java.lang.String r1 = "additionalParameters"
            java.util.Map r7 = net.openid.appauth.JsonUtil.getStringMap(r8, r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
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
            java.lang.String r1 = "id_token_hint"
            java.lang.String r2 = r3.idTokenHint
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "post_logout_redirect_uri"
            android.net.Uri r2 = r3.postLogoutRedirectUri
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "state"
            java.lang.String r2 = r3.state
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "ui_locales"
            java.lang.String r2 = r3.uiLocales
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
            android.net.Uri r0 = r0.endSessionEndpoint
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "id_token_hint"
            java.lang.String r2 = r4.idTokenHint
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "state"
            java.lang.String r2 = r4.state
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            java.lang.String r1 = "ui_locales"
            java.lang.String r2 = r4.uiLocales
            net.openid.appauth.internal.UriUtil.appendQueryParameterIfNotNull(r0, r1, r2)
            android.net.Uri r1 = r4.postLogoutRedirectUri
            if (r1 == 0) goto L2a
            java.lang.String r2 = "post_logout_redirect_uri"
            java.lang.String r1 = r1.toString()
            r0.appendQueryParameter(r2, r1)
        L2a:
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.additionalParameters
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.appendQueryParameter(r3, r2)
            goto L34
        L50:
            android.net.Uri r0 = r0.build()
            return r0
    }
}
