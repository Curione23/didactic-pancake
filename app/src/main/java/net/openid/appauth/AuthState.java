package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AuthState {
    public static final int EXPIRY_TIME_TOLERANCE_MS = 60000;
    private static final java.lang.String KEY_AUTHORIZATION_EXCEPTION = "mAuthorizationException";
    private static final java.lang.String KEY_CONFIG = "config";
    private static final java.lang.String KEY_LAST_AUTHORIZATION_RESPONSE = "lastAuthorizationResponse";
    private static final java.lang.String KEY_LAST_REGISTRATION_RESPONSE = "lastRegistrationResponse";
    private static final java.lang.String KEY_LAST_TOKEN_RESPONSE = "mLastTokenResponse";
    private static final java.lang.String KEY_REFRESH_TOKEN = "refreshToken";
    private static final java.lang.String KEY_SCOPE = "scope";
    private net.openid.appauth.AuthorizationException mAuthorizationException;
    private net.openid.appauth.AuthorizationServiceConfiguration mConfig;
    private net.openid.appauth.AuthorizationResponse mLastAuthorizationResponse;
    private net.openid.appauth.RegistrationResponse mLastRegistrationResponse;
    private net.openid.appauth.TokenResponse mLastTokenResponse;
    private boolean mNeedsTokenRefreshOverride;
    private java.util.List<net.openid.appauth.AuthState.AuthStateAction> mPendingActions;
    private final java.lang.Object mPendingActionsSyncObject;
    private java.lang.String mRefreshToken;
    private java.lang.String mScope;


    public interface AuthStateAction {
        void execute(java.lang.String r1, java.lang.String r2, net.openid.appauth.AuthorizationException r3);
    }

    public AuthState() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mPendingActionsSyncObject = r0
            return
    }

    public AuthState(net.openid.appauth.AuthorizationResponse r4, net.openid.appauth.AuthorizationException r5) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.mPendingActionsSyncObject = r0
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L10
            r2 = r0
            goto L11
        L10:
            r2 = r1
        L11:
            if (r5 == 0) goto L14
            goto L15
        L14:
            r0 = r1
        L15:
            r0 = r0 ^ r2
            java.lang.String r1 = "exactly one of authResponse or authError should be non-null"
            net.openid.appauth.Preconditions.checkArgument(r0, r1)
            r0 = 0
            r3.mPendingActions = r0
            r3.update(r4, r5)
            return
    }

    public AuthState(net.openid.appauth.AuthorizationResponse r2, net.openid.appauth.TokenResponse r3, net.openid.appauth.AuthorizationException r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.update(r3, r4)
            return
    }

    public AuthState(net.openid.appauth.AuthorizationServiceConfiguration r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mPendingActionsSyncObject = r0
            r1.mConfig = r2
            return
    }

    public AuthState(net.openid.appauth.RegistrationResponse r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mPendingActionsSyncObject = r0
            r1.update(r2)
            return
    }

    static /* synthetic */ boolean access$002(net.openid.appauth.AuthState r0, boolean r1) {
            r0.mNeedsTokenRefreshOverride = r1
            return r1
    }

    static /* synthetic */ java.lang.Object access$100(net.openid.appauth.AuthState r0) {
            java.lang.Object r0 = r0.mPendingActionsSyncObject
            return r0
    }

    static /* synthetic */ java.util.List access$200(net.openid.appauth.AuthState r0) {
            java.util.List<net.openid.appauth.AuthState$AuthStateAction> r0 = r0.mPendingActions
            return r0
    }

    static /* synthetic */ java.util.List access$202(net.openid.appauth.AuthState r0, java.util.List r1) {
            r0.mPendingActions = r1
            return r1
    }

    public static net.openid.appauth.AuthState jsonDeserialize(java.lang.String r1) throws org.json.JSONException {
            java.lang.String r0 = "jsonStr cannot be null or empty"
            net.openid.appauth.Preconditions.checkNotEmpty(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            net.openid.appauth.AuthState r1 = jsonDeserialize(r0)
            return r1
    }

    public static net.openid.appauth.AuthState jsonDeserialize(org.json.JSONObject r3) throws org.json.JSONException {
            java.lang.String r0 = "json cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            net.openid.appauth.AuthState r0 = new net.openid.appauth.AuthState
            r0.<init>()
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = net.openid.appauth.JsonUtil.getStringIfDefined(r3, r1)
            r0.mRefreshToken = r1
            java.lang.String r1 = "scope"
            java.lang.String r1 = net.openid.appauth.JsonUtil.getStringIfDefined(r3, r1)
            r0.mScope = r1
            java.lang.String r1 = "config"
            boolean r2 = r3.has(r1)
            if (r2 == 0) goto L2c
            org.json.JSONObject r1 = r3.getJSONObject(r1)
            net.openid.appauth.AuthorizationServiceConfiguration r1 = net.openid.appauth.AuthorizationServiceConfiguration.fromJson(r1)
            r0.mConfig = r1
        L2c:
            java.lang.String r1 = "mAuthorizationException"
            boolean r2 = r3.has(r1)
            if (r2 == 0) goto L3e
            org.json.JSONObject r1 = r3.getJSONObject(r1)
            net.openid.appauth.AuthorizationException r1 = net.openid.appauth.AuthorizationException.fromJson(r1)
            r0.mAuthorizationException = r1
        L3e:
            java.lang.String r1 = "lastAuthorizationResponse"
            boolean r2 = r3.has(r1)
            if (r2 == 0) goto L50
            org.json.JSONObject r1 = r3.getJSONObject(r1)
            net.openid.appauth.AuthorizationResponse r1 = net.openid.appauth.AuthorizationResponse.jsonDeserialize(r1)
            r0.mLastAuthorizationResponse = r1
        L50:
            java.lang.String r1 = "mLastTokenResponse"
            boolean r2 = r3.has(r1)
            if (r2 == 0) goto L62
            org.json.JSONObject r1 = r3.getJSONObject(r1)
            net.openid.appauth.TokenResponse r1 = net.openid.appauth.TokenResponse.jsonDeserialize(r1)
            r0.mLastTokenResponse = r1
        L62:
            java.lang.String r1 = "lastRegistrationResponse"
            boolean r2 = r3.has(r1)
            if (r2 == 0) goto L74
            org.json.JSONObject r3 = r3.getJSONObject(r1)
            net.openid.appauth.RegistrationResponse r3 = net.openid.appauth.RegistrationResponse.jsonDeserialize(r3)
            r0.mLastRegistrationResponse = r3
        L74:
            return r0
    }

    public net.openid.appauth.TokenRequest createTokenRefreshRequest() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            net.openid.appauth.TokenRequest r0 = r1.createTokenRefreshRequest(r0)
            return r0
    }

    public net.openid.appauth.TokenRequest createTokenRefreshRequest(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = r3.mRefreshToken
            if (r0 == 0) goto L3b
            net.openid.appauth.AuthorizationResponse r0 = r3.mLastAuthorizationResponse
            if (r0 == 0) goto L33
            net.openid.appauth.TokenRequest$Builder r0 = new net.openid.appauth.TokenRequest$Builder
            net.openid.appauth.AuthorizationResponse r1 = r3.mLastAuthorizationResponse
            net.openid.appauth.AuthorizationRequest r1 = r1.request
            net.openid.appauth.AuthorizationServiceConfiguration r1 = r1.configuration
            net.openid.appauth.AuthorizationResponse r2 = r3.mLastAuthorizationResponse
            net.openid.appauth.AuthorizationRequest r2 = r2.request
            java.lang.String r2 = r2.clientId
            r0.<init>(r1, r2)
            java.lang.String r1 = "refresh_token"
            net.openid.appauth.TokenRequest$Builder r0 = r0.setGrantType(r1)
            r1 = 0
            net.openid.appauth.TokenRequest$Builder r0 = r0.setScope(r1)
            java.lang.String r1 = r3.mRefreshToken
            net.openid.appauth.TokenRequest$Builder r0 = r0.setRefreshToken(r1)
            net.openid.appauth.TokenRequest$Builder r4 = r0.setAdditionalParameters(r4)
            net.openid.appauth.TokenRequest r4 = r4.build()
            return r4
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "No authorization configuration available for refresh request"
            r4.<init>(r0)
            throw r4
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "No refresh token available for refresh request"
            r4.<init>(r0)
            throw r4
    }

    public java.lang.String getAccessToken() {
            r2 = this;
            net.openid.appauth.AuthorizationException r0 = r2.mAuthorizationException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            net.openid.appauth.TokenResponse r0 = r2.mLastTokenResponse
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.accessToken
            if (r0 == 0) goto L13
            net.openid.appauth.TokenResponse r0 = r2.mLastTokenResponse
            java.lang.String r0 = r0.accessToken
            return r0
        L13:
            net.openid.appauth.AuthorizationResponse r0 = r2.mLastAuthorizationResponse
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.accessToken
            return r0
        L1a:
            return r1
    }

    public java.lang.Long getAccessTokenExpirationTime() {
            r2 = this;
            net.openid.appauth.AuthorizationException r0 = r2.mAuthorizationException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            net.openid.appauth.TokenResponse r0 = r2.mLastTokenResponse
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.accessToken
            if (r0 == 0) goto L13
            net.openid.appauth.TokenResponse r0 = r2.mLastTokenResponse
            java.lang.Long r0 = r0.accessTokenExpirationTime
            return r0
        L13:
            net.openid.appauth.AuthorizationResponse r0 = r2.mLastAuthorizationResponse
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.accessToken
            if (r0 == 0) goto L20
            net.openid.appauth.AuthorizationResponse r0 = r2.mLastAuthorizationResponse
            java.lang.Long r0 = r0.accessTokenExpirationTime
            return r0
        L20:
            return r1
    }

    public net.openid.appauth.AuthorizationException getAuthorizationException() {
            r1 = this;
            net.openid.appauth.AuthorizationException r0 = r1.mAuthorizationException
            return r0
    }

    public net.openid.appauth.AuthorizationServiceConfiguration getAuthorizationServiceConfiguration() {
            r1 = this;
            net.openid.appauth.AuthorizationResponse r0 = r1.mLastAuthorizationResponse
            if (r0 == 0) goto L9
            net.openid.appauth.AuthorizationRequest r0 = r0.request
            net.openid.appauth.AuthorizationServiceConfiguration r0 = r0.configuration
            return r0
        L9:
            net.openid.appauth.AuthorizationServiceConfiguration r0 = r1.mConfig
            return r0
    }

    public net.openid.appauth.ClientAuthentication getClientAuthentication() throws net.openid.appauth.ClientAuthentication.UnsupportedAuthenticationMethod {
            r3 = this;
            java.lang.String r0 = r3.getClientSecret()
            if (r0 != 0) goto L9
            net.openid.appauth.NoClientAuthentication r0 = net.openid.appauth.NoClientAuthentication.INSTANCE
            return r0
        L9:
            net.openid.appauth.RegistrationResponse r0 = r3.mLastRegistrationResponse
            java.lang.String r0 = r0.tokenEndpointAuthMethod
            if (r0 != 0) goto L19
            net.openid.appauth.ClientSecretBasic r0 = new net.openid.appauth.ClientSecretBasic
            java.lang.String r1 = r3.getClientSecret()
            r0.<init>(r1)
            return r0
        L19:
            net.openid.appauth.RegistrationResponse r0 = r3.mLastRegistrationResponse
            java.lang.String r0 = r0.tokenEndpointAuthMethod
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2034587045: goto L3f;
                case 3387192: goto L34;
                case 1338964435: goto L29;
                default: goto L28;
            }
        L28:
            goto L49
        L29:
            java.lang.String r1 = "client_secret_basic"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L49
        L32:
            r2 = 2
            goto L49
        L34:
            java.lang.String r1 = "none"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L49
        L3d:
            r2 = 1
            goto L49
        L3f:
            java.lang.String r1 = "client_secret_post"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L49
        L48:
            r2 = 0
        L49:
            switch(r2) {
                case 0: goto L63;
                case 1: goto L60;
                case 2: goto L56;
                default: goto L4c;
            }
        L4c:
            net.openid.appauth.ClientAuthentication$UnsupportedAuthenticationMethod r0 = new net.openid.appauth.ClientAuthentication$UnsupportedAuthenticationMethod
            net.openid.appauth.RegistrationResponse r1 = r3.mLastRegistrationResponse
            java.lang.String r1 = r1.tokenEndpointAuthMethod
            r0.<init>(r1)
            throw r0
        L56:
            net.openid.appauth.ClientSecretBasic r0 = new net.openid.appauth.ClientSecretBasic
            java.lang.String r1 = r3.getClientSecret()
            r0.<init>(r1)
            return r0
        L60:
            net.openid.appauth.NoClientAuthentication r0 = net.openid.appauth.NoClientAuthentication.INSTANCE
            return r0
        L63:
            net.openid.appauth.ClientSecretPost r0 = new net.openid.appauth.ClientSecretPost
            java.lang.String r1 = r3.getClientSecret()
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getClientSecret() {
            r1 = this;
            net.openid.appauth.RegistrationResponse r0 = r1.mLastRegistrationResponse
            if (r0 == 0) goto L7
            java.lang.String r0 = r0.clientSecret
            return r0
        L7:
            r0 = 0
            return r0
    }

    public java.lang.Long getClientSecretExpirationTime() {
            r1 = this;
            net.openid.appauth.RegistrationResponse r0 = r1.mLastRegistrationResponse
            if (r0 == 0) goto L7
            java.lang.Long r0 = r0.clientSecretExpiresAt
            return r0
        L7:
            r0 = 0
            return r0
    }

    public java.lang.String getIdToken() {
            r2 = this;
            net.openid.appauth.AuthorizationException r0 = r2.mAuthorizationException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            net.openid.appauth.TokenResponse r0 = r2.mLastTokenResponse
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.idToken
            if (r0 == 0) goto L13
            net.openid.appauth.TokenResponse r0 = r2.mLastTokenResponse
            java.lang.String r0 = r0.idToken
            return r0
        L13:
            net.openid.appauth.AuthorizationResponse r0 = r2.mLastAuthorizationResponse
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.idToken
            return r0
        L1a:
            return r1
    }

    public net.openid.appauth.AuthorizationResponse getLastAuthorizationResponse() {
            r1 = this;
            net.openid.appauth.AuthorizationResponse r0 = r1.mLastAuthorizationResponse
            return r0
    }

    public net.openid.appauth.RegistrationResponse getLastRegistrationResponse() {
            r1 = this;
            net.openid.appauth.RegistrationResponse r0 = r1.mLastRegistrationResponse
            return r0
    }

    public net.openid.appauth.TokenResponse getLastTokenResponse() {
            r1 = this;
            net.openid.appauth.TokenResponse r0 = r1.mLastTokenResponse
            return r0
    }

    public boolean getNeedsTokenRefresh() {
            r1 = this;
            net.openid.appauth.SystemClock r0 = net.openid.appauth.SystemClock.INSTANCE
            boolean r0 = r1.getNeedsTokenRefresh(r0)
            return r0
    }

    boolean getNeedsTokenRefresh(net.openid.appauth.Clock r10) {
            r9 = this;
            boolean r0 = r9.mNeedsTokenRefreshOverride
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Long r0 = r9.getAccessTokenExpirationTime()
            r2 = 0
            if (r0 != 0) goto L16
            java.lang.String r10 = r9.getAccessToken()
            if (r10 != 0) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            return r1
        L16:
            java.lang.Long r0 = r9.getAccessTokenExpirationTime()
            long r3 = r0.longValue()
            long r5 = r10.getCurrentTimeMillis()
            r7 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 + r7
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 > 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            return r1
    }

    public net.openid.appauth.IdToken getParsedIdToken() {
            r2 = this;
            java.lang.String r0 = r2.getIdToken()
            r1 = 0
            if (r0 == 0) goto Lb
            net.openid.appauth.IdToken r1 = net.openid.appauth.IdToken.from(r0)     // Catch: java.lang.Throwable -> Lb
        Lb:
            return r1
    }

    public java.lang.String getRefreshToken() {
            r1 = this;
            java.lang.String r0 = r1.mRefreshToken
            return r0
    }

    public java.lang.String getScope() {
            r1 = this;
            java.lang.String r0 = r1.mScope
            return r0
    }

    public java.util.Set<java.lang.String> getScopeSet() {
            r1 = this;
            java.lang.String r0 = r1.mScope
            java.util.Set r0 = net.openid.appauth.AsciiStringListUtil.stringToSet(r0)
            return r0
    }

    public boolean hasClientSecretExpired() {
            r1 = this;
            net.openid.appauth.SystemClock r0 = net.openid.appauth.SystemClock.INSTANCE
            boolean r0 = r1.hasClientSecretExpired(r0)
            return r0
    }

    boolean hasClientSecretExpired(net.openid.appauth.Clock r7) {
            r6 = this;
            java.lang.Long r0 = r6.getClientSecretExpirationTime()
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Long r0 = r6.getClientSecretExpirationTime()
            long r2 = r0.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L16
            goto L27
        L16:
            java.lang.Long r0 = r6.getClientSecretExpirationTime()
            long r2 = r0.longValue()
            long r4 = r7.getCurrentTimeMillis()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L27
            r1 = 1
        L27:
            return r1
    }

    public boolean isAuthorized() {
            r1 = this;
            net.openid.appauth.AuthorizationException r0 = r1.mAuthorizationException
            if (r0 != 0) goto L12
            java.lang.String r0 = r1.getAccessToken()
            if (r0 != 0) goto L10
            java.lang.String r0 = r1.getIdToken()
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public org.json.JSONObject jsonSerialize() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "refreshToken"
            java.lang.String r2 = r3.mRefreshToken
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            java.lang.String r1 = "scope"
            java.lang.String r2 = r3.mScope
            net.openid.appauth.JsonUtil.putIfNotNull(r0, r1, r2)
            net.openid.appauth.AuthorizationServiceConfiguration r1 = r3.mConfig
            if (r1 == 0) goto L20
            java.lang.String r2 = "config"
            org.json.JSONObject r1 = r1.toJson()
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L20:
            net.openid.appauth.AuthorizationException r1 = r3.mAuthorizationException
            if (r1 == 0) goto L2d
            java.lang.String r2 = "mAuthorizationException"
            org.json.JSONObject r1 = r1.toJson()
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L2d:
            net.openid.appauth.AuthorizationResponse r1 = r3.mLastAuthorizationResponse
            if (r1 == 0) goto L3a
            java.lang.String r2 = "lastAuthorizationResponse"
            org.json.JSONObject r1 = r1.jsonSerialize()
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L3a:
            net.openid.appauth.TokenResponse r1 = r3.mLastTokenResponse
            if (r1 == 0) goto L47
            java.lang.String r2 = "mLastTokenResponse"
            org.json.JSONObject r1 = r1.jsonSerialize()
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L47:
            net.openid.appauth.RegistrationResponse r1 = r3.mLastRegistrationResponse
            if (r1 == 0) goto L54
            java.lang.String r2 = "lastRegistrationResponse"
            org.json.JSONObject r1 = r1.jsonSerialize()
            net.openid.appauth.JsonUtil.put(r0, r2, r1)
        L54:
            return r0
    }

    public java.lang.String jsonSerializeString() {
            r1 = this;
            org.json.JSONObject r0 = r1.jsonSerialize()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void performActionWithFreshTokens(net.openid.appauth.AuthorizationService r7, java.util.Map<java.lang.String, java.lang.String> r8, net.openid.appauth.AuthState.AuthStateAction r9) {
            r6 = this;
            net.openid.appauth.ClientAuthentication r2 = r6.getClientAuthentication()     // Catch: net.openid.appauth.ClientAuthentication.UnsupportedAuthenticationMethod -> Le
            net.openid.appauth.SystemClock r4 = net.openid.appauth.SystemClock.INSTANCE     // Catch: net.openid.appauth.ClientAuthentication.UnsupportedAuthenticationMethod -> Le
            r0 = r6
            r1 = r7
            r3 = r8
            r5 = r9
            r0.performActionWithFreshTokens(r1, r2, r3, r4, r5)     // Catch: net.openid.appauth.ClientAuthentication.UnsupportedAuthenticationMethod -> Le
            goto L19
        Le:
            r7 = move-exception
            net.openid.appauth.AuthorizationException r8 = net.openid.appauth.AuthorizationException.TokenRequestErrors.CLIENT_ERROR
            net.openid.appauth.AuthorizationException r7 = net.openid.appauth.AuthorizationException.fromTemplate(r8, r7)
            r8 = 0
            r9.execute(r8, r8, r7)
        L19:
            return
    }

    public void performActionWithFreshTokens(net.openid.appauth.AuthorizationService r7, net.openid.appauth.AuthState.AuthStateAction r8) {
            r6 = this;
            net.openid.appauth.NoClientAuthentication r2 = net.openid.appauth.NoClientAuthentication.INSTANCE
            java.util.Map r3 = java.util.Collections.emptyMap()
            net.openid.appauth.SystemClock r4 = net.openid.appauth.SystemClock.INSTANCE
            r0 = r6
            r1 = r7
            r5 = r8
            r0.performActionWithFreshTokens(r1, r2, r3, r4, r5)
            return
    }

    public void performActionWithFreshTokens(net.openid.appauth.AuthorizationService r7, net.openid.appauth.ClientAuthentication r8, java.util.Map<java.lang.String, java.lang.String> r9, net.openid.appauth.AuthState.AuthStateAction r10) {
            r6 = this;
            net.openid.appauth.SystemClock r4 = net.openid.appauth.SystemClock.INSTANCE
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.performActionWithFreshTokens(r1, r2, r3, r4, r5)
            return
    }

    void performActionWithFreshTokens(net.openid.appauth.AuthorizationService r2, net.openid.appauth.ClientAuthentication r3, java.util.Map<java.lang.String, java.lang.String> r4, net.openid.appauth.Clock r5, net.openid.appauth.AuthState.AuthStateAction r6) {
            r1 = this;
            java.lang.String r0 = "service cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "client authentication cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "additional params cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "clock cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "action cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r6, r0)
            boolean r5 = r1.getNeedsTokenRefresh(r5)
            r0 = 0
            if (r5 != 0) goto L2c
            java.lang.String r2 = r1.getAccessToken()
            java.lang.String r3 = r1.getIdToken()
            r6.execute(r2, r3, r0)
            return
        L2c:
            java.lang.String r5 = r1.mRefreshToken
            if (r5 != 0) goto L41
            net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.AuthorizationRequestErrors.CLIENT_ERROR
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "No refresh token available and token have expired"
            r3.<init>(r4)
            net.openid.appauth.AuthorizationException r2 = net.openid.appauth.AuthorizationException.fromTemplate(r2, r3)
            r6.execute(r0, r0, r2)
            return
        L41:
            java.lang.Object r5 = r1.mPendingActionsSyncObject
            java.lang.String r0 = "pending actions sync object cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r5, r0)
            java.lang.Object r5 = r1.mPendingActionsSyncObject
            monitor-enter(r5)
            java.util.List<net.openid.appauth.AuthState$AuthStateAction> r0 = r1.mPendingActions     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L54
            r0.add(r6)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            return
        L54:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            r1.mPendingActions = r0     // Catch: java.lang.Throwable -> L6c
            r0.add(r6)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            net.openid.appauth.TokenRequest r4 = r1.createTokenRefreshRequest(r4)
            net.openid.appauth.AuthState$1 r5 = new net.openid.appauth.AuthState$1
            r5.<init>(r1)
            r2.performTokenRequest(r4, r3, r5)
            return
        L6c:
            r2 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
            throw r2
    }

    public void performActionWithFreshTokens(net.openid.appauth.AuthorizationService r7, net.openid.appauth.ClientAuthentication r8, net.openid.appauth.AuthState.AuthStateAction r9) {
            r6 = this;
            java.util.Map r3 = java.util.Collections.emptyMap()
            net.openid.appauth.SystemClock r4 = net.openid.appauth.SystemClock.INSTANCE
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.performActionWithFreshTokens(r1, r2, r3, r4, r5)
            return
    }

    public void setNeedsTokenRefresh(boolean r1) {
            r0 = this;
            r0.mNeedsTokenRefreshOverride = r1
            return
    }

    public void update(net.openid.appauth.AuthorizationResponse r4, net.openid.appauth.AuthorizationException r5) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            if (r5 == 0) goto La
            r0 = r1
        La:
            r0 = r0 ^ r2
            java.lang.String r2 = "exactly one of authResponse or authException should be non-null"
            net.openid.appauth.Preconditions.checkArgument(r0, r2)
            if (r5 == 0) goto L19
            int r4 = r5.type
            if (r4 != r1) goto L18
            r3.mAuthorizationException = r5
        L18:
            return
        L19:
            r3.mLastAuthorizationResponse = r4
            r5 = 0
            r3.mConfig = r5
            r3.mLastTokenResponse = r5
            r3.mRefreshToken = r5
            r3.mAuthorizationException = r5
            java.lang.String r5 = r4.scope
            if (r5 == 0) goto L2b
            java.lang.String r4 = r4.scope
            goto L2f
        L2b:
            net.openid.appauth.AuthorizationRequest r4 = r4.request
            java.lang.String r4 = r4.scope
        L2f:
            r3.mScope = r4
            return
    }

    public void update(net.openid.appauth.RegistrationResponse r1) {
            r0 = this;
            r0.mLastRegistrationResponse = r1
            net.openid.appauth.AuthorizationServiceConfiguration r1 = r0.getAuthorizationServiceConfiguration()
            r0.mConfig = r1
            r1 = 0
            r0.mRefreshToken = r1
            r0.mScope = r1
            r0.mLastAuthorizationResponse = r1
            r0.mLastTokenResponse = r1
            r0.mAuthorizationException = r1
            return
    }

    public void update(net.openid.appauth.TokenResponse r4, net.openid.appauth.AuthorizationException r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            if (r5 == 0) goto La
            goto Lb
        La:
            r0 = r1
        Lb:
            r0 = r0 ^ r2
            java.lang.String r1 = "exactly one of tokenResponse or authException should be non-null"
            net.openid.appauth.Preconditions.checkArgument(r0, r1)
            net.openid.appauth.AuthorizationException r0 = r3.mAuthorizationException
            if (r0 == 0) goto L21
            java.lang.String r1 = "AuthState.update should not be called in an error state (%s), call updatewith the result of the fresh authorization response first"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            net.openid.appauth.internal.Logger.warn(r1, r0)
            r0 = 0
            r3.mAuthorizationException = r0
        L21:
            if (r5 == 0) goto L2b
            int r4 = r5.type
            r0 = 2
            if (r4 != r0) goto L2a
            r3.mAuthorizationException = r5
        L2a:
            return
        L2b:
            r3.mLastTokenResponse = r4
            java.lang.String r5 = r4.scope
            if (r5 == 0) goto L35
            java.lang.String r5 = r4.scope
            r3.mScope = r5
        L35:
            java.lang.String r5 = r4.refreshToken
            if (r5 == 0) goto L3d
            java.lang.String r4 = r4.refreshToken
            r3.mRefreshToken = r4
        L3d:
            return
    }
}
