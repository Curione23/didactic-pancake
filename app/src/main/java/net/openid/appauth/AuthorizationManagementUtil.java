package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
class AuthorizationManagementUtil {
    public static final java.lang.String REQUEST_TYPE_AUTHORIZATION = "authorization";
    public static final java.lang.String REQUEST_TYPE_END_SESSION = "end_session";
    private static final int STATE_LENGTH = 16;

    AuthorizationManagementUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String generateRandomState() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 16
            byte[] r1 = new byte[r1]
            r0.nextBytes(r1)
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            return r0
    }

    static net.openid.appauth.AuthorizationManagementRequest requestFrom(java.lang.String r1, java.lang.String r2) throws org.json.JSONException {
            java.lang.String r0 = "jsonStr can not be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = "authorization"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L17
            net.openid.appauth.AuthorizationRequest r1 = net.openid.appauth.AuthorizationRequest.jsonDeserialize(r0)
            return r1
        L17:
            java.lang.String r1 = "end_session"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L24
            net.openid.appauth.EndSessionRequest r1 = net.openid.appauth.EndSessionRequest.jsonDeserialize(r0)
            return r1
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No AuthorizationManagementRequest found matching to this json schema"
            r1.<init>(r2)
            throw r1
    }

    static java.lang.String requestTypeFor(net.openid.appauth.AuthorizationManagementRequest r1) {
            boolean r0 = r1 instanceof net.openid.appauth.AuthorizationRequest
            if (r0 == 0) goto L7
            java.lang.String r1 = "authorization"
            return r1
        L7:
            boolean r1 = r1 instanceof net.openid.appauth.EndSessionRequest
            if (r1 == 0) goto Le
            java.lang.String r1 = "end_session"
            return r1
        Le:
            r1 = 0
            return r1
    }

    static net.openid.appauth.AuthorizationManagementResponse responseFrom(android.content.Intent r1) {
            boolean r0 = net.openid.appauth.EndSessionResponse.containsEndSessionResponse(r1)
            if (r0 == 0) goto Lb
            net.openid.appauth.EndSessionResponse r1 = net.openid.appauth.EndSessionResponse.fromIntent(r1)
            return r1
        Lb:
            boolean r0 = net.openid.appauth.AuthorizationResponse.containsAuthorizationResponse(r1)
            if (r0 == 0) goto L16
            net.openid.appauth.AuthorizationResponse r1 = net.openid.appauth.AuthorizationResponse.fromIntent(r1)
            return r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Malformed intent"
            r1.<init>(r0)
            throw r1
    }

    static net.openid.appauth.AuthorizationManagementResponse responseWith(net.openid.appauth.AuthorizationManagementRequest r1, android.net.Uri r2) {
            boolean r0 = r1 instanceof net.openid.appauth.AuthorizationRequest
            if (r0 == 0) goto L14
            net.openid.appauth.AuthorizationResponse$Builder r0 = new net.openid.appauth.AuthorizationResponse$Builder
            net.openid.appauth.AuthorizationRequest r1 = (net.openid.appauth.AuthorizationRequest) r1
            r0.<init>(r1)
            net.openid.appauth.AuthorizationResponse$Builder r1 = r0.fromUri(r2)
            net.openid.appauth.AuthorizationResponse r1 = r1.build()
            return r1
        L14:
            boolean r0 = r1 instanceof net.openid.appauth.EndSessionRequest
            if (r0 == 0) goto L28
            net.openid.appauth.EndSessionResponse$Builder r0 = new net.openid.appauth.EndSessionResponse$Builder
            net.openid.appauth.EndSessionRequest r1 = (net.openid.appauth.EndSessionRequest) r1
            r0.<init>(r1)
            net.openid.appauth.EndSessionResponse$Builder r1 = r0.fromUri(r2)
            net.openid.appauth.EndSessionResponse r1 = r1.build()
            return r1
        L28:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Malformed request or uri"
            r1.<init>(r2)
            throw r1
    }
}
