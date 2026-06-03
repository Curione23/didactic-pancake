package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthorizationException extends java.lang.Exception {
    public static final java.lang.String EXTRA_EXCEPTION = "net.openid.appauth.AuthorizationException";
    private static final int HASH_MULTIPLIER = 31;
    static final java.lang.String KEY_CODE = "code";
    static final java.lang.String KEY_ERROR = "error";
    static final java.lang.String KEY_ERROR_DESCRIPTION = "errorDescription";
    static final java.lang.String KEY_ERROR_URI = "errorUri";
    static final java.lang.String KEY_TYPE = "type";
    public static final java.lang.String PARAM_ERROR = "error";
    public static final java.lang.String PARAM_ERROR_DESCRIPTION = "error_description";
    public static final java.lang.String PARAM_ERROR_URI = "error_uri";
    public static final int TYPE_GENERAL_ERROR = 0;
    public static final int TYPE_OAUTH_AUTHORIZATION_ERROR = 1;
    public static final int TYPE_OAUTH_REGISTRATION_ERROR = 4;
    public static final int TYPE_OAUTH_TOKEN_ERROR = 2;
    public static final int TYPE_RESOURCE_SERVER_AUTHORIZATION_ERROR = 3;
    public final int code;
    public final java.lang.String error;
    public final java.lang.String errorDescription;
    public final android.net.Uri errorUri;
    public final int type;

    public static final class AuthorizationRequestErrors {
        public static final net.openid.appauth.AuthorizationException ACCESS_DENIED = null;
        public static final net.openid.appauth.AuthorizationException CLIENT_ERROR = null;
        public static final net.openid.appauth.AuthorizationException INVALID_REQUEST = null;
        public static final net.openid.appauth.AuthorizationException INVALID_SCOPE = null;
        public static final net.openid.appauth.AuthorizationException OTHER = null;
        public static final net.openid.appauth.AuthorizationException SERVER_ERROR = null;
        public static final net.openid.appauth.AuthorizationException STATE_MISMATCH = null;
        private static final java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> STRING_TO_EXCEPTION = null;
        public static final net.openid.appauth.AuthorizationException TEMPORARILY_UNAVAILABLE = null;
        public static final net.openid.appauth.AuthorizationException UNAUTHORIZED_CLIENT = null;
        public static final net.openid.appauth.AuthorizationException UNSUPPORTED_RESPONSE_TYPE = null;

        static {
                r0 = 1000(0x3e8, float:1.401E-42)
                java.lang.String r1 = "invalid_request"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$100(r0, r1)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.INVALID_REQUEST = r0
                r1 = 1001(0x3e9, float:1.403E-42)
                java.lang.String r2 = "unauthorized_client"
                net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.access$100(r1, r2)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.UNAUTHORIZED_CLIENT = r1
                r2 = 1002(0x3ea, float:1.404E-42)
                java.lang.String r3 = "access_denied"
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.access$100(r2, r3)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.ACCESS_DENIED = r2
                r3 = 1003(0x3eb, float:1.406E-42)
                java.lang.String r4 = "unsupported_response_type"
                net.openid.appauth.AuthorizationException r3 = net.openid.appauth.AuthorizationException.access$100(r3, r4)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.UNSUPPORTED_RESPONSE_TYPE = r3
                r4 = 1004(0x3ec, float:1.407E-42)
                java.lang.String r5 = "invalid_scope"
                net.openid.appauth.AuthorizationException r4 = net.openid.appauth.AuthorizationException.access$100(r4, r5)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.INVALID_SCOPE = r4
                r5 = 1005(0x3ed, float:1.408E-42)
                java.lang.String r6 = "server_error"
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.access$100(r5, r6)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.SERVER_ERROR = r5
                r6 = 1006(0x3ee, float:1.41E-42)
                java.lang.String r7 = "temporarily_unavailable"
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.access$100(r6, r7)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.TEMPORARILY_UNAVAILABLE = r6
                r7 = 1007(0x3ef, float:1.411E-42)
                r8 = 0
                net.openid.appauth.AuthorizationException r7 = net.openid.appauth.AuthorizationException.access$100(r7, r8)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.CLIENT_ERROR = r7
                r9 = 1008(0x3f0, float:1.413E-42)
                net.openid.appauth.AuthorizationException r8 = net.openid.appauth.AuthorizationException.access$100(r9, r8)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.OTHER = r8
                java.lang.String r9 = "Response state param did not match request state"
                r10 = 9
                net.openid.appauth.AuthorizationException r9 = net.openid.appauth.AuthorizationException.access$000(r10, r9)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.STATE_MISMATCH = r9
                net.openid.appauth.AuthorizationException[] r9 = new net.openid.appauth.AuthorizationException[r10]
                r10 = 0
                r9[r10] = r0
                r0 = 1
                r9[r0] = r1
                r0 = 2
                r9[r0] = r2
                r0 = 3
                r9[r0] = r3
                r0 = 4
                r9[r0] = r4
                r0 = 5
                r9[r0] = r5
                r0 = 6
                r9[r0] = r6
                r0 = 7
                r9[r0] = r7
                r0 = 8
                r9[r0] = r8
                java.util.Map r0 = net.openid.appauth.AuthorizationException.access$200(r9)
                net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.STRING_TO_EXCEPTION = r0
                return
        }

        public AuthorizationRequestErrors() {
                r0 = this;
                r0.<init>()
                return
        }

        public static net.openid.appauth.AuthorizationException byString(java.lang.String r1) {
                java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> r0 = net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.STRING_TO_EXCEPTION
                java.lang.Object r1 = r0.get(r1)
                net.openid.appauth.AuthorizationException r1 = (net.openid.appauth.AuthorizationException) r1
                if (r1 == 0) goto Lb
                return r1
            Lb:
                net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.OTHER
                return r1
        }
    }

    public static final class GeneralErrors {
        public static final net.openid.appauth.AuthorizationException ID_TOKEN_PARSING_ERROR = null;
        public static final net.openid.appauth.AuthorizationException ID_TOKEN_VALIDATION_ERROR = null;
        public static final net.openid.appauth.AuthorizationException INVALID_DISCOVERY_DOCUMENT = null;
        public static final net.openid.appauth.AuthorizationException INVALID_REGISTRATION_RESPONSE = null;
        public static final net.openid.appauth.AuthorizationException JSON_DESERIALIZATION_ERROR = null;
        public static final net.openid.appauth.AuthorizationException NETWORK_ERROR = null;
        public static final net.openid.appauth.AuthorizationException PROGRAM_CANCELED_AUTH_FLOW = null;
        public static final net.openid.appauth.AuthorizationException SERVER_ERROR = null;
        public static final net.openid.appauth.AuthorizationException TOKEN_RESPONSE_CONSTRUCTION_ERROR = null;
        public static final net.openid.appauth.AuthorizationException USER_CANCELED_AUTH_FLOW = null;

        static {
                r0 = 0
                java.lang.String r1 = "Invalid discovery document"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.INVALID_DISCOVERY_DOCUMENT = r0
                r0 = 1
                java.lang.String r1 = "User cancelled flow"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.USER_CANCELED_AUTH_FLOW = r0
                r0 = 2
                java.lang.String r1 = "Flow cancelled programmatically"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.PROGRAM_CANCELED_AUTH_FLOW = r0
                r0 = 3
                java.lang.String r1 = "Network error"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.NETWORK_ERROR = r0
                r0 = 4
                java.lang.String r1 = "Server error"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.SERVER_ERROR = r0
                r0 = 5
                java.lang.String r1 = "JSON deserialization error"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.JSON_DESERIALIZATION_ERROR = r0
                r0 = 6
                java.lang.String r1 = "Token response construction error"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.TOKEN_RESPONSE_CONSTRUCTION_ERROR = r0
                r0 = 7
                java.lang.String r1 = "Invalid registration response"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.INVALID_REGISTRATION_RESPONSE = r0
                r0 = 8
                java.lang.String r1 = "Unable to parse ID Token"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_PARSING_ERROR = r0
                r0 = 9
                java.lang.String r1 = "Invalid ID Token"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$000(r0, r1)
                net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR = r0
                return
        }

        public GeneralErrors() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static final class RegistrationRequestErrors {
        public static final net.openid.appauth.AuthorizationException CLIENT_ERROR = null;
        public static final net.openid.appauth.AuthorizationException INVALID_CLIENT_METADATA = null;
        public static final net.openid.appauth.AuthorizationException INVALID_REDIRECT_URI = null;
        public static final net.openid.appauth.AuthorizationException INVALID_REQUEST = null;
        public static final net.openid.appauth.AuthorizationException OTHER = null;
        private static final java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> STRING_TO_EXCEPTION = null;

        static {
                r0 = 4000(0xfa0, float:5.605E-42)
                java.lang.String r1 = "invalid_request"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$400(r0, r1)
                net.openid.appauth.AuthorizationException.RegistrationRequestErrors.INVALID_REQUEST = r0
                r1 = 4001(0xfa1, float:5.607E-42)
                java.lang.String r2 = "invalid_redirect_uri"
                net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.access$400(r1, r2)
                net.openid.appauth.AuthorizationException.RegistrationRequestErrors.INVALID_REDIRECT_URI = r1
                r2 = 4002(0xfa2, float:5.608E-42)
                java.lang.String r3 = "invalid_client_metadata"
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.access$400(r2, r3)
                net.openid.appauth.AuthorizationException.RegistrationRequestErrors.INVALID_CLIENT_METADATA = r2
                r3 = 4003(0xfa3, float:5.61E-42)
                r4 = 0
                net.openid.appauth.AuthorizationException r3 = net.openid.appauth.AuthorizationException.access$400(r3, r4)
                net.openid.appauth.AuthorizationException.RegistrationRequestErrors.CLIENT_ERROR = r3
                r5 = 4004(0xfa4, float:5.611E-42)
                net.openid.appauth.AuthorizationException r4 = net.openid.appauth.AuthorizationException.access$400(r5, r4)
                net.openid.appauth.AuthorizationException.RegistrationRequestErrors.OTHER = r4
                r5 = 5
                net.openid.appauth.AuthorizationException[] r5 = new net.openid.appauth.AuthorizationException[r5]
                r6 = 0
                r5[r6] = r0
                r0 = 1
                r5[r0] = r1
                r0 = 2
                r5[r0] = r2
                r0 = 3
                r5[r0] = r3
                r0 = 4
                r5[r0] = r4
                java.util.Map r0 = net.openid.appauth.AuthorizationException.access$200(r5)
                net.openid.appauth.AuthorizationException.RegistrationRequestErrors.STRING_TO_EXCEPTION = r0
                return
        }

        public RegistrationRequestErrors() {
                r0 = this;
                r0.<init>()
                return
        }

        public static net.openid.appauth.AuthorizationException byString(java.lang.String r1) {
                java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> r0 = net.openid.appauth.AuthorizationException.RegistrationRequestErrors.STRING_TO_EXCEPTION
                java.lang.Object r1 = r0.get(r1)
                net.openid.appauth.AuthorizationException r1 = (net.openid.appauth.AuthorizationException) r1
                if (r1 == 0) goto Lb
                return r1
            Lb:
                net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.RegistrationRequestErrors.OTHER
                return r1
        }
    }

    public static final class TokenRequestErrors {
        public static final net.openid.appauth.AuthorizationException CLIENT_ERROR = null;
        public static final net.openid.appauth.AuthorizationException INVALID_CLIENT = null;
        public static final net.openid.appauth.AuthorizationException INVALID_GRANT = null;
        public static final net.openid.appauth.AuthorizationException INVALID_REQUEST = null;
        public static final net.openid.appauth.AuthorizationException INVALID_SCOPE = null;
        public static final net.openid.appauth.AuthorizationException OTHER = null;
        private static final java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> STRING_TO_EXCEPTION = null;
        public static final net.openid.appauth.AuthorizationException UNAUTHORIZED_CLIENT = null;
        public static final net.openid.appauth.AuthorizationException UNSUPPORTED_GRANT_TYPE = null;

        static {
                r0 = 2000(0x7d0, float:2.803E-42)
                java.lang.String r1 = "invalid_request"
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.access$300(r0, r1)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.INVALID_REQUEST = r0
                r1 = 2001(0x7d1, float:2.804E-42)
                java.lang.String r2 = "invalid_client"
                net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.access$300(r1, r2)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.INVALID_CLIENT = r1
                r2 = 2002(0x7d2, float:2.805E-42)
                java.lang.String r3 = "invalid_grant"
                net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.access$300(r2, r3)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.INVALID_GRANT = r2
                r3 = 2003(0x7d3, float:2.807E-42)
                java.lang.String r4 = "unauthorized_client"
                net.openid.appauth.AuthorizationException r3 = net.openid.appauth.AuthorizationException.access$300(r3, r4)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.UNAUTHORIZED_CLIENT = r3
                r4 = 2004(0x7d4, float:2.808E-42)
                java.lang.String r5 = "unsupported_grant_type"
                net.openid.appauth.AuthorizationException r4 = net.openid.appauth.AuthorizationException.access$300(r4, r5)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.UNSUPPORTED_GRANT_TYPE = r4
                r5 = 2005(0x7d5, float:2.81E-42)
                java.lang.String r6 = "invalid_scope"
                net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.access$300(r5, r6)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.INVALID_SCOPE = r5
                r6 = 2006(0x7d6, float:2.811E-42)
                r7 = 0
                net.openid.appauth.AuthorizationException r6 = net.openid.appauth.AuthorizationException.access$300(r6, r7)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.CLIENT_ERROR = r6
                r8 = 2007(0x7d7, float:2.812E-42)
                net.openid.appauth.AuthorizationException r7 = net.openid.appauth.AuthorizationException.access$300(r8, r7)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.OTHER = r7
                r8 = 8
                net.openid.appauth.AuthorizationException[] r8 = new net.openid.appauth.AuthorizationException[r8]
                r9 = 0
                r8[r9] = r0
                r0 = 1
                r8[r0] = r1
                r0 = 2
                r8[r0] = r2
                r0 = 3
                r8[r0] = r3
                r0 = 4
                r8[r0] = r4
                r0 = 5
                r8[r0] = r5
                r0 = 6
                r8[r0] = r6
                r0 = 7
                r8[r0] = r7
                java.util.Map r0 = net.openid.appauth.AuthorizationException.access$200(r8)
                net.openid.appauth.AuthorizationException.TokenRequestErrors.STRING_TO_EXCEPTION = r0
                return
        }

        public TokenRequestErrors() {
                r0 = this;
                r0.<init>()
                return
        }

        public static net.openid.appauth.AuthorizationException byString(java.lang.String r1) {
                java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> r0 = net.openid.appauth.AuthorizationException.TokenRequestErrors.STRING_TO_EXCEPTION
                java.lang.Object r1 = r0.get(r1)
                net.openid.appauth.AuthorizationException r1 = (net.openid.appauth.AuthorizationException) r1
                if (r1 == 0) goto Lb
                return r1
            Lb:
                net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.TokenRequestErrors.OTHER
                return r1
        }
    }

    public AuthorizationException(int r1, int r2, java.lang.String r3, java.lang.String r4, android.net.Uri r5, java.lang.Throwable r6) {
            r0 = this;
            r0.<init>(r4, r6)
            r0.type = r1
            r0.code = r2
            r0.error = r3
            r0.errorDescription = r4
            r0.errorUri = r5
            return
    }

    static /* synthetic */ net.openid.appauth.AuthorizationException access$000(int r0, java.lang.String r1) {
            net.openid.appauth.AuthorizationException r0 = generalEx(r0, r1)
            return r0
    }

    static /* synthetic */ net.openid.appauth.AuthorizationException access$100(int r0, java.lang.String r1) {
            net.openid.appauth.AuthorizationException r0 = authEx(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Map access$200(net.openid.appauth.AuthorizationException[] r0) {
            java.util.Map r0 = exceptionMapByString(r0)
            return r0
    }

    static /* synthetic */ net.openid.appauth.AuthorizationException access$300(int r0, java.lang.String r1) {
            net.openid.appauth.AuthorizationException r0 = tokenEx(r0, r1)
            return r0
    }

    static /* synthetic */ net.openid.appauth.AuthorizationException access$400(int r0, java.lang.String r1) {
            net.openid.appauth.AuthorizationException r0 = registrationEx(r0, r1)
            return r0
    }

    private static net.openid.appauth.AuthorizationException authEx(int r8, java.lang.String r9) {
            net.openid.appauth.AuthorizationException r7 = new net.openid.appauth.AuthorizationException
            r5 = 0
            r6 = 0
            r1 = 1
            r4 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static java.util.Map<java.lang.String, net.openid.appauth.AuthorizationException> exceptionMapByString(net.openid.appauth.AuthorizationException... r5) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r1 = 0
            if (r5 == 0) goto L7
            int r2 = r5.length
            goto L8
        L7:
            r2 = r1
        L8:
            r0.<init>(r2)
            if (r5 == 0) goto L1c
            int r2 = r5.length
        Le:
            if (r1 >= r2) goto L1c
            r3 = r5[r1]
            java.lang.String r4 = r3.error
            if (r4 == 0) goto L19
            r0.put(r4, r3)
        L19:
            int r1 = r1 + 1
            goto Le
        L1c:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
            return r5
    }

    public static net.openid.appauth.AuthorizationException fromIntent(android.content.Intent r2) {
            net.openid.appauth.Preconditions.checkNotNull(r2)
            java.lang.String r0 = "net.openid.appauth.AuthorizationException"
            boolean r1 = r2.hasExtra(r0)
            if (r1 != 0) goto Ld
            r2 = 0
            return r2
        Ld:
            java.lang.String r2 = r2.getStringExtra(r0)     // Catch: org.json.JSONException -> L16
            net.openid.appauth.AuthorizationException r2 = fromJson(r2)     // Catch: org.json.JSONException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Intent contains malformed exception data"
            r0.<init>(r1, r2)
            throw r0
    }

    public static net.openid.appauth.AuthorizationException fromJson(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "jsonStr cannot be null or empty"
            net.openid.appauth.Preconditions.checkNotEmpty(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.AuthorizationException r1 = fromJson(r0)
            return r1
    }

    public static net.openid.appauth.AuthorizationException fromJson(org.json.JSONObject r8) throws org.json.JSONException {
            java.lang.String r0 = "json cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r8, r0)
            net.openid.appauth.AuthorizationException r0 = new net.openid.appauth.AuthorizationException
            java.lang.String r1 = "type"
            int r2 = r8.getInt(r1)
            java.lang.String r1 = "code"
            int r3 = r8.getInt(r1)
            java.lang.String r1 = "error"
            java.lang.String r4 = net.openid.appauth.JsonUtil.getStringIfDefined(r8, r1)
            java.lang.String r1 = "errorDescription"
            java.lang.String r5 = net.openid.appauth.JsonUtil.getStringIfDefined(r8, r1)
            java.lang.String r1 = "errorUri"
            android.net.Uri r6 = net.openid.appauth.JsonUtil.getUriIfDefined(r8, r1)
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static net.openid.appauth.AuthorizationException fromOAuthRedirect(android.net.Uri r9) {
            java.lang.String r0 = "error"
            java.lang.String r4 = r9.getQueryParameter(r0)
            java.lang.String r0 = "error_description"
            java.lang.String r0 = r9.getQueryParameter(r0)
            java.lang.String r1 = "error_uri"
            java.lang.String r9 = r9.getQueryParameter(r1)
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.byString(r4)
            net.openid.appauth.AuthorizationException r8 = new net.openid.appauth.AuthorizationException
            int r2 = r1.type
            int r3 = r1.code
            if (r0 == 0) goto L1f
            goto L21
        L1f:
            java.lang.String r0 = r1.errorDescription
        L21:
            r5 = r0
            if (r9 == 0) goto L29
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L2b
        L29:
            android.net.Uri r9 = r1.errorUri
        L2b:
            r6 = r9
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static net.openid.appauth.AuthorizationException fromOAuthTemplate(net.openid.appauth.AuthorizationException r8, java.lang.String r9, java.lang.String r10, android.net.Uri r11) {
            net.openid.appauth.AuthorizationException r7 = new net.openid.appauth.AuthorizationException
            int r1 = r8.type
            int r2 = r8.code
            if (r9 == 0) goto L9
            goto Lb
        L9:
            java.lang.String r9 = r8.error
        Lb:
            r3 = r9
            if (r10 == 0) goto Lf
            goto L11
        Lf:
            java.lang.String r10 = r8.errorDescription
        L11:
            r4 = r10
            if (r11 == 0) goto L15
            goto L17
        L15:
            android.net.Uri r11 = r8.errorUri
        L17:
            r5 = r11
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static net.openid.appauth.AuthorizationException fromTemplate(net.openid.appauth.AuthorizationException r8, java.lang.Throwable r9) {
            net.openid.appauth.AuthorizationException r7 = new net.openid.appauth.AuthorizationException
            int r1 = r8.type
            int r2 = r8.code
            java.lang.String r3 = r8.error
            java.lang.String r4 = r8.errorDescription
            android.net.Uri r5 = r8.errorUri
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static net.openid.appauth.AuthorizationException generalEx(int r8, java.lang.String r9) {
            net.openid.appauth.AuthorizationException r7 = new net.openid.appauth.AuthorizationException
            r5 = 0
            r6 = 0
            r1 = 0
            r3 = 0
            r0 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static net.openid.appauth.AuthorizationException registrationEx(int r8, java.lang.String r9) {
            net.openid.appauth.AuthorizationException r7 = new net.openid.appauth.AuthorizationException
            r5 = 0
            r6 = 0
            r1 = 4
            r4 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static net.openid.appauth.AuthorizationException tokenEx(int r8, java.lang.String r9) {
            net.openid.appauth.AuthorizationException r7 = new net.openid.appauth.AuthorizationException
            r5 = 0
            r6 = 0
            r1 = 2
            r4 = 0
            r0 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1d
            boolean r2 = r5 instanceof net.openid.appauth.AuthorizationException
            if (r2 != 0) goto Lc
            goto L1d
        Lc:
            net.openid.appauth.AuthorizationException r5 = (net.openid.appauth.AuthorizationException) r5
            int r2 = r4.type
            int r3 = r5.type
            if (r2 != r3) goto L1b
            int r2 = r4.code
            int r5 = r5.code
            if (r2 != r5) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            return r0
        L1d:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.type
            int r0 = r0 + 31
            int r0 = r0 * 31
            int r1 = r2.code
            int r0 = r0 + r1
            return r0
    }

    public android.content.Intent toIntent() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "net.openid.appauth.AuthorizationException"
            java.lang.String r2 = r3.toJsonString()
            r0.putExtra(r1, r2)
            return r0
    }

    public org.json.JSONObject toJson() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "type"
            int r2 = r3.type
            net.openid.appauth.JsonUtil.put(r0, r1, r2)
            java.lang.String r1 = "code"
            int r2 = r3.code
            net.openid.appauth.JsonUtil.put(r0, r1, r2)
            java.lang.String r1 = "error"
            java.lang.String r2 = r3.error
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "errorDescription"
            java.lang.String r2 = r3.errorDescription
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "errorUri"
            android.net.Uri r2 = r3.errorUri
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            return r0
    }

    public java.lang.String toJsonString() {
            r1 = this;
            org.json.JSONObject r0 = r1.toJson()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AuthorizationException: "
            r0.<init>(r1)
            java.lang.String r1 = r2.toJsonString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
