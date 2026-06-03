package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorizationServiceDiscovery {
    static final net.openid.appauth.JsonUtil.StringListField ACR_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.UriField AUTHORIZATION_ENDPOINT = null;
    static final net.openid.appauth.JsonUtil.StringListField CLAIMS_LOCALES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.BooleanField CLAIMS_PARAMETER_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField CLAIMS_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField CLAIM_TYPES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField DISPLAY_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.UriField END_SESSION_ENDPOINT = null;
    static final net.openid.appauth.JsonUtil.StringListField GRANT_TYPES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField ID_TOKEN_ENCRYPTION_ALG_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField ID_TOKEN_ENCRYPTION_ENC_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringField ISSUER = null;
    static final net.openid.appauth.JsonUtil.UriField JWKS_URI = null;
    private static final java.util.List<java.lang.String> MANDATORY_METADATA = null;
    static final net.openid.appauth.JsonUtil.UriField OP_POLICY_URI = null;
    static final net.openid.appauth.JsonUtil.UriField OP_TOS_URI = null;
    static final net.openid.appauth.JsonUtil.UriField REGISTRATION_ENDPOINT = null;
    static final net.openid.appauth.JsonUtil.StringListField REQUEST_OBJECT_ENCRYPTION_ALG_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField REQUEST_OBJECT_ENCRYPTION_ENC_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField REQUEST_OBJECT_SIGNING_ALG_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.BooleanField REQUEST_PARAMETER_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.BooleanField REQUEST_URI_PARAMETER_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.BooleanField REQUIRE_REQUEST_URI_REGISTRATION = null;
    static final net.openid.appauth.JsonUtil.StringListField RESPONSE_MODES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField RESPONSE_TYPES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField SCOPES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.UriField SERVICE_DOCUMENTATION = null;
    static final net.openid.appauth.JsonUtil.StringListField SUBJECT_TYPES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.UriField TOKEN_ENDPOINT = null;
    static final net.openid.appauth.JsonUtil.StringListField TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField TOKEN_ENDPOINT_AUTH_SIGNING_ALG_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField UI_LOCALES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField USERINFO_ENCRYPTION_ALG_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.StringListField USERINFO_ENCRYPTION_ENC_VALUES_SUPPORTED = null;
    static final net.openid.appauth.JsonUtil.UriField USERINFO_ENDPOINT = null;
    static final net.openid.appauth.JsonUtil.StringListField USERINFO_SIGNING_ALG_VALUES_SUPPORTED = null;
    public final org.json.JSONObject docJson;

    public static class MissingArgumentException extends java.lang.Exception {
        private java.lang.String mMissingField;

        public MissingArgumentException(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Missing mandatory configuration field: "
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
            java.lang.String r0 = "issuer"
            net.openid.appauth.JsonUtil$StringField r0 = str(r0)
            net.openid.appauth.AuthorizationServiceDiscovery.ISSUER = r0
            java.lang.String r1 = "authorization_endpoint"
            net.openid.appauth.JsonUtil$UriField r1 = uri(r1)
            net.openid.appauth.AuthorizationServiceDiscovery.AUTHORIZATION_ENDPOINT = r1
            java.lang.String r2 = "token_endpoint"
            net.openid.appauth.JsonUtil$UriField r2 = uri(r2)
            net.openid.appauth.AuthorizationServiceDiscovery.TOKEN_ENDPOINT = r2
            java.lang.String r2 = "end_session_endpoint"
            net.openid.appauth.JsonUtil$UriField r2 = uri(r2)
            net.openid.appauth.AuthorizationServiceDiscovery.END_SESSION_ENDPOINT = r2
            java.lang.String r2 = "userinfo_endpoint"
            net.openid.appauth.JsonUtil$UriField r2 = uri(r2)
            net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_ENDPOINT = r2
            java.lang.String r2 = "jwks_uri"
            net.openid.appauth.JsonUtil$UriField r2 = uri(r2)
            net.openid.appauth.AuthorizationServiceDiscovery.JWKS_URI = r2
            java.lang.String r3 = "registration_endpoint"
            net.openid.appauth.JsonUtil$UriField r3 = uri(r3)
            net.openid.appauth.AuthorizationServiceDiscovery.REGISTRATION_ENDPOINT = r3
            java.lang.String r3 = "scopes_supported"
            net.openid.appauth.JsonUtil$StringListField r3 = strList(r3)
            net.openid.appauth.AuthorizationServiceDiscovery.SCOPES_SUPPORTED = r3
            java.lang.String r3 = "response_types_supported"
            net.openid.appauth.JsonUtil$StringListField r3 = strList(r3)
            net.openid.appauth.AuthorizationServiceDiscovery.RESPONSE_TYPES_SUPPORTED = r3
            java.lang.String r4 = "response_modes_supported"
            net.openid.appauth.JsonUtil$StringListField r4 = strList(r4)
            net.openid.appauth.AuthorizationServiceDiscovery.RESPONSE_MODES_SUPPORTED = r4
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r6 = "authorization_code"
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "implicit"
            r8 = 1
            r5[r8] = r6
            java.util.List r5 = java.util.Arrays.asList(r5)
            java.lang.String r6 = "grant_types_supported"
            net.openid.appauth.JsonUtil$StringListField r5 = strList(r6, r5)
            net.openid.appauth.AuthorizationServiceDiscovery.GRANT_TYPES_SUPPORTED = r5
            java.lang.String r5 = "acr_values_supported"
            net.openid.appauth.JsonUtil$StringListField r5 = strList(r5)
            net.openid.appauth.AuthorizationServiceDiscovery.ACR_VALUES_SUPPORTED = r5
            java.lang.String r5 = "subject_types_supported"
            net.openid.appauth.JsonUtil$StringListField r5 = strList(r5)
            net.openid.appauth.AuthorizationServiceDiscovery.SUBJECT_TYPES_SUPPORTED = r5
            java.lang.String r6 = "id_token_signing_alg_values_supported"
            net.openid.appauth.JsonUtil$StringListField r6 = strList(r6)
            net.openid.appauth.AuthorizationServiceDiscovery.ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED = r6
            java.lang.String r9 = "id_token_encryption_enc_values_supported"
            net.openid.appauth.JsonUtil$StringListField r10 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.ID_TOKEN_ENCRYPTION_ALG_VALUES_SUPPORTED = r10
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.ID_TOKEN_ENCRYPTION_ENC_VALUES_SUPPORTED = r9
            java.lang.String r9 = "userinfo_signing_alg_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_SIGNING_ALG_VALUES_SUPPORTED = r9
            java.lang.String r9 = "userinfo_encryption_alg_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_ENCRYPTION_ALG_VALUES_SUPPORTED = r9
            java.lang.String r9 = "userinfo_encryption_enc_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_ENCRYPTION_ENC_VALUES_SUPPORTED = r9
            java.lang.String r9 = "request_object_signing_alg_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_OBJECT_SIGNING_ALG_VALUES_SUPPORTED = r9
            java.lang.String r9 = "request_object_encryption_alg_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_OBJECT_ENCRYPTION_ALG_VALUES_SUPPORTED = r9
            java.lang.String r9 = "request_object_encryption_enc_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_OBJECT_ENCRYPTION_ENC_VALUES_SUPPORTED = r9
            java.lang.String r9 = "client_secret_basic"
            java.util.List r9 = java.util.Collections.singletonList(r9)
            java.lang.String r10 = "token_endpoint_auth_methods_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r10, r9)
            net.openid.appauth.AuthorizationServiceDiscovery.TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED = r9
            java.lang.String r9 = "token_endpoint_auth_signing_alg_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.TOKEN_ENDPOINT_AUTH_SIGNING_ALG_VALUES_SUPPORTED = r9
            java.lang.String r9 = "display_values_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.DISPLAY_VALUES_SUPPORTED = r9
            java.lang.String r9 = "normal"
            java.util.List r9 = java.util.Collections.singletonList(r9)
            java.lang.String r10 = "claim_types_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r10, r9)
            net.openid.appauth.AuthorizationServiceDiscovery.CLAIM_TYPES_SUPPORTED = r9
            java.lang.String r9 = "claims_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.CLAIMS_SUPPORTED = r9
            java.lang.String r9 = "service_documentation"
            net.openid.appauth.JsonUtil$UriField r9 = uri(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.SERVICE_DOCUMENTATION = r9
            java.lang.String r9 = "claims_locales_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.CLAIMS_LOCALES_SUPPORTED = r9
            java.lang.String r9 = "ui_locales_supported"
            net.openid.appauth.JsonUtil$StringListField r9 = strList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.UI_LOCALES_SUPPORTED = r9
            java.lang.String r9 = "claims_parameter_supported"
            net.openid.appauth.JsonUtil$BooleanField r9 = bool(r9, r7)
            net.openid.appauth.AuthorizationServiceDiscovery.CLAIMS_PARAMETER_SUPPORTED = r9
            java.lang.String r9 = "request_parameter_supported"
            net.openid.appauth.JsonUtil$BooleanField r9 = bool(r9, r7)
            net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_PARAMETER_SUPPORTED = r9
            java.lang.String r9 = "request_uri_parameter_supported"
            net.openid.appauth.JsonUtil$BooleanField r9 = bool(r9, r8)
            net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_URI_PARAMETER_SUPPORTED = r9
            java.lang.String r9 = "require_request_uri_registration"
            net.openid.appauth.JsonUtil$BooleanField r9 = bool(r9, r7)
            net.openid.appauth.AuthorizationServiceDiscovery.REQUIRE_REQUEST_URI_REGISTRATION = r9
            java.lang.String r9 = "op_policy_uri"
            net.openid.appauth.JsonUtil$UriField r9 = uri(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.OP_POLICY_URI = r9
            java.lang.String r9 = "op_tos_uri"
            net.openid.appauth.JsonUtil$UriField r9 = uri(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.OP_TOS_URI = r9
            r9 = 6
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.String r0 = r0.key
            r9[r7] = r0
            java.lang.String r0 = r1.key
            r9[r8] = r0
            java.lang.String r0 = r2.key
            r9[r4] = r0
            r0 = 3
            java.lang.String r1 = r3.key
            r9[r0] = r1
            r0 = 4
            java.lang.String r1 = r5.key
            r9[r0] = r1
            r0 = 5
            java.lang.String r1 = r6.key
            r9[r0] = r1
            java.util.List r0 = java.util.Arrays.asList(r9)
            net.openid.appauth.AuthorizationServiceDiscovery.MANDATORY_METADATA = r0
            return
    }

    public AuthorizationServiceDiscovery(org.json.JSONObject r3) throws org.json.JSONException, net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = net.openid.appauth.Preconditions.checkNotNull(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r2.docJson = r3
            java.util.List<java.lang.String> r3 = net.openid.appauth.AuthorizationServiceDiscovery.MANDATORY_METADATA
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r1 = r2.docJson
            boolean r1 = r1.has(r0)
            if (r1 == 0) goto L2e
            org.json.JSONObject r1 = r2.docJson
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L2e
            goto L11
        L2e:
            net.openid.appauth.AuthorizationServiceDiscovery$MissingArgumentException r3 = new net.openid.appauth.AuthorizationServiceDiscovery$MissingArgumentException
            r3.<init>(r0)
            throw r3
        L34:
            return
    }

    private static net.openid.appauth.JsonUtil.BooleanField bool(java.lang.String r1, boolean r2) {
            net.openid.appauth.JsonUtil$BooleanField r0 = new net.openid.appauth.JsonUtil$BooleanField
            r0.<init>(r1, r2)
            return r0
    }

    private <T> T get(net.openid.appauth.JsonUtil.Field<T> r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.docJson
            java.lang.Object r2 = net.openid.appauth.JsonUtil.get(r0, r2)
            return r2
    }

    private <T> java.util.List<T> get(net.openid.appauth.JsonUtil.ListField<T> r2) {
            r1 = this;
            org.json.JSONObject r0 = r1.docJson
            java.util.List r2 = net.openid.appauth.JsonUtil.get(r0, r2)
            return r2
    }

    private static net.openid.appauth.JsonUtil.StringField str(java.lang.String r1) {
            net.openid.appauth.JsonUtil$StringField r0 = new net.openid.appauth.JsonUtil$StringField
            r0.<init>(r1)
            return r0
    }

    private static net.openid.appauth.JsonUtil.StringListField strList(java.lang.String r1) {
            net.openid.appauth.JsonUtil$StringListField r0 = new net.openid.appauth.JsonUtil$StringListField
            r0.<init>(r1)
            return r0
    }

    private static net.openid.appauth.JsonUtil.StringListField strList(java.lang.String r1, java.util.List<java.lang.String> r2) {
            net.openid.appauth.JsonUtil$StringListField r0 = new net.openid.appauth.JsonUtil$StringListField
            r0.<init>(r1, r2)
            return r0
    }

    private static net.openid.appauth.JsonUtil.UriField uri(java.lang.String r1) {
            net.openid.appauth.JsonUtil$UriField r0 = new net.openid.appauth.JsonUtil$UriField
            r0.<init>(r1)
            return r0
    }

    public java.util.List<java.lang.String> getAcrValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.ACR_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public android.net.Uri getAuthorizationEndpoint() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.AUTHORIZATION_ENDPOINT
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public java.util.List<java.lang.String> getClaimTypesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.CLAIM_TYPES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getClaimsLocalesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.CLAIMS_LOCALES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getClaimsSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.CLAIMS_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getDisplayValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.DISPLAY_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public android.net.Uri getEndSessionEndpoint() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.END_SESSION_ENDPOINT
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public java.util.List<java.lang.String> getGrantTypesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.GRANT_TYPES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getIdTokenEncryptionAlgorithmValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.ID_TOKEN_ENCRYPTION_ALG_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getIdTokenEncryptionEncodingValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.ID_TOKEN_ENCRYPTION_ENC_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getIdTokenSigningAlgorithmValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.lang.String getIssuer() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringField r0 = net.openid.appauth.AuthorizationServiceDiscovery.ISSUER
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public android.net.Uri getJwksUri() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.JWKS_URI
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public android.net.Uri getOpPolicyUri() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.OP_POLICY_URI
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public android.net.Uri getOpTosUri() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.OP_TOS_URI
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public android.net.Uri getRegistrationEndpoint() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.REGISTRATION_ENDPOINT
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public java.util.List<java.lang.String> getRequestObjectEncryptionAlgorithmValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_OBJECT_ENCRYPTION_ALG_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getRequestObjectEncryptionEncodingValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_OBJECT_ENCRYPTION_ENC_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getRequestObjectSigningAlgorithmValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_OBJECT_SIGNING_ALG_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getResponseModesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.RESPONSE_MODES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getResponseTypesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.RESPONSE_TYPES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getScopesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.SCOPES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public android.net.Uri getServiceDocumentation() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.SERVICE_DOCUMENTATION
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public java.util.List<java.lang.String> getSubjectTypesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.SUBJECT_TYPES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public android.net.Uri getTokenEndpoint() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.TOKEN_ENDPOINT
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public java.util.List<java.lang.String> getTokenEndpointAuthMethodsSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getTokenEndpointAuthSigningAlgorithmValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.TOKEN_ENDPOINT_AUTH_SIGNING_ALG_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getUiLocalesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.UI_LOCALES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getUserinfoEncryptionAlgorithmValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_ENCRYPTION_ALG_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public java.util.List<java.lang.String> getUserinfoEncryptionEncodingValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_ENCRYPTION_ENC_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public android.net.Uri getUserinfoEndpoint() {
            r1 = this;
            net.openid.appauth.JsonUtil$UriField r0 = net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_ENDPOINT
            java.lang.Object r0 = r1.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    public java.util.List<java.lang.String> getUserinfoSigningAlgorithmValuesSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$StringListField r0 = net.openid.appauth.AuthorizationServiceDiscovery.USERINFO_SIGNING_ALG_VALUES_SUPPORTED
            java.util.List r0 = r1.get(r0)
            return r0
    }

    public boolean isClaimsParameterSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$BooleanField r0 = net.openid.appauth.AuthorizationServiceDiscovery.CLAIMS_PARAMETER_SUPPORTED
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isRequestParameterSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$BooleanField r0 = net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_PARAMETER_SUPPORTED
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isRequestUriParameterSupported() {
            r1 = this;
            net.openid.appauth.JsonUtil$BooleanField r0 = net.openid.appauth.AuthorizationServiceDiscovery.REQUEST_URI_PARAMETER_SUPPORTED
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean requireRequestUriRegistration() {
            r1 = this;
            net.openid.appauth.JsonUtil$BooleanField r0 = net.openid.appauth.AuthorizationServiceDiscovery.REQUIRE_REQUEST_URI_REGISTRATION
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
