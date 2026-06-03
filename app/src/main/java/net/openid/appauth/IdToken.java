package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class IdToken {
    private static final java.util.Set<java.lang.String> BUILT_IN_CLAIMS = null;
    private static final java.lang.String KEY_AUDIENCE = "aud";
    private static final java.lang.String KEY_AUTHORIZED_PARTY = "azp";
    private static final java.lang.String KEY_EXPIRATION = "exp";
    private static final java.lang.String KEY_ISSUED_AT = "iat";
    private static final java.lang.String KEY_ISSUER = "iss";
    private static final java.lang.String KEY_NONCE = "nonce";
    private static final java.lang.String KEY_SUBJECT = "sub";
    private static final java.lang.Long MILLIS_PER_SECOND = null;
    private static final java.lang.Long TEN_MINUTES_IN_SECONDS = null;
    public final java.util.Map<java.lang.String, java.lang.Object> additionalClaims;
    public final java.util.List<java.lang.String> audience;
    public final java.lang.String authorizedParty;
    public final java.lang.Long expiration;
    public final java.lang.Long issuedAt;
    public final java.lang.String issuer;
    public final java.lang.String nonce;
    public final java.lang.String subject;

    static class IdTokenException extends java.lang.Exception {
        IdTokenException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            net.openid.appauth.IdToken.MILLIS_PER_SECOND = r0
            r0 = 600(0x258, double:2.964E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            net.openid.appauth.IdToken.TEN_MINUTES_IN_SECONDS = r0
            r0 = 7
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "iss"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "sub"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "aud"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "exp"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "iat"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "nonce"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "azp"
            r0[r1] = r2
            java.util.Set r0 = net.openid.appauth.AdditionalParamsProcessor.builtInParams(r0)
            net.openid.appauth.IdToken.BUILT_IN_CLAIMS = r0
            return
    }

    IdToken(java.lang.String r10, java.lang.String r11, java.util.List<java.lang.String> r12, java.lang.Long r13, java.lang.Long r14) {
            r9 = this;
            r7 = 0
            java.util.Map r8 = java.util.Collections.emptyMap()
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    IdToken(java.lang.String r10, java.lang.String r11, java.util.List<java.lang.String> r12, java.lang.Long r13, java.lang.Long r14, java.lang.String r15, java.lang.String r16) {
            r9 = this;
            java.util.Map r8 = java.util.Collections.emptyMap()
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    IdToken(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3, java.lang.Long r4, java.lang.Long r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            r0 = this;
            r0.<init>()
            r0.issuer = r1
            r0.subject = r2
            r0.audience = r3
            r0.expiration = r4
            r0.issuedAt = r5
            r0.nonce = r6
            r0.authorizedParty = r7
            r0.additionalClaims = r8
            return
    }

    static net.openid.appauth.IdToken from(java.lang.String r11) throws org.json.JSONException, net.openid.appauth.IdToken.IdTokenException {
            java.lang.String r0 = "aud"
            java.lang.String r1 = "\\."
            java.lang.String[] r11 = r11.split(r1)
            int r1 = r11.length
            r2 = 1
            if (r1 <= r2) goto L78
            r1 = 0
            r1 = r11[r1]
            parseJwtSection(r1)
            r11 = r11[r2]
            org.json.JSONObject r11 = parseJwtSection(r11)
            java.lang.String r1 = "iss"
            java.lang.String r3 = net.openid.appauth.JsonUtil.getString(r11, r1)
            java.lang.String r1 = "sub"
            java.lang.String r4 = net.openid.appauth.JsonUtil.getString(r11, r1)
            java.util.List r0 = net.openid.appauth.JsonUtil.getStringList(r11, r0)     // Catch: org.json.JSONException -> L2a
            r5 = r0
            goto L37
        L2a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = net.openid.appauth.JsonUtil.getString(r11, r0)
            r1.add(r0)
            r5 = r1
        L37:
            java.lang.String r0 = "exp"
            long r0 = r11.getLong(r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "iat"
            long r0 = r11.getLong(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "nonce"
            java.lang.String r8 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r0)
            java.lang.String r0 = "azp"
            java.lang.String r9 = net.openid.appauth.JsonUtil.getStringIfDefined(r11, r0)
            java.util.Set<java.lang.String> r0 = net.openid.appauth.IdToken.BUILT_IN_CLAIMS
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r11.remove(r1)
            goto L5d
        L6d:
            java.util.Map r10 = net.openid.appauth.JsonUtil.toMap(r11)
            net.openid.appauth.IdToken r11 = new net.openid.appauth.IdToken
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L78:
            net.openid.appauth.IdToken$IdTokenException r11 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r0 = "ID token must have both header and claims section"
            r11.<init>(r0)
            throw r11
    }

    private static org.json.JSONObject parseJwtSection(java.lang.String r1) throws org.json.JSONException {
            r0 = 8
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            return r1
    }

    void validate(net.openid.appauth.TokenRequest r2, net.openid.appauth.Clock r3) throws net.openid.appauth.AuthorizationException {
            r1 = this;
            r0 = 0
            r1.validate(r2, r3, r0)
            return
    }

    void validate(net.openid.appauth.TokenRequest r5, net.openid.appauth.Clock r6, boolean r7) throws net.openid.appauth.AuthorizationException {
            r4 = this;
            net.openid.appauth.AuthorizationServiceConfiguration r0 = r5.configuration
            net.openid.appauth.AuthorizationServiceDiscovery r0 = r0.discoveryDoc
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.getIssuer()
            java.lang.String r1 = r4.issuer
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r0 = r4.issuer
            android.net.Uri r0 = android.net.Uri.parse(r0)
            if (r7 != 0) goto L35
            java.lang.String r7 = r0.getScheme()
            java.lang.String r1 = "https"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L27
            goto L35
        L27:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "Issuer must be an https URL"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
        L35:
            java.lang.String r7 = r0.getHost()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L5e
            java.lang.String r7 = r0.getFragment()
            if (r7 != 0) goto L50
            java.util.Set r7 = r0.getQueryParameterNames()
            int r7 = r7.size()
            if (r7 > 0) goto L50
            goto L7a
        L50:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "Issuer URL should not containt query parameters or fragment components"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
        L5e:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "Issuer host can not be empty"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
        L6c:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "Issuer mismatch"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
        L7a:
            java.lang.String r7 = r5.clientId
            java.util.List<java.lang.String> r0 = r4.audience
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L9b
            java.lang.String r0 = r4.authorizedParty
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8d
            goto L9b
        L8d:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "Audience mismatch"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
        L9b:
            long r6 = r6.getCurrentTimeMillis()
            java.lang.Long r0 = net.openid.appauth.IdToken.MILLIS_PER_SECOND
            long r0 = r0.longValue()
            long r6 = r6 / r0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            long r0 = r6.longValue()
            java.lang.Long r7 = r4.expiration
            long r2 = r7.longValue()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 > 0) goto L103
            long r6 = r6.longValue()
            java.lang.Long r0 = r4.issuedAt
            long r0 = r0.longValue()
            long r6 = r6 - r0
            long r6 = java.lang.Math.abs(r6)
            java.lang.Long r0 = net.openid.appauth.IdToken.TEN_MINUTES_IN_SECONDS
            long r0 = r0.longValue()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto Lf5
            java.lang.String r6 = "authorization_code"
            java.lang.String r7 = r5.grantType
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lf4
            java.lang.String r5 = r5.nonce
            java.lang.String r6 = r4.nonce
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto Le6
            goto Lf4
        Le6:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "Nonce mismatch"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
        Lf4:
            return
        Lf5:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "Issued at time is more than 10 minutes before or after the current time"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
        L103:
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.GeneralErrors.ID_TOKEN_VALIDATION_ERROR
            net.openid.appauth.IdToken$IdTokenException r6 = new net.openid.appauth.IdToken$IdTokenException
            java.lang.String r7 = "ID Token expired"
            r6.<init>(r7)
            net.openid.appauth.AuthorizationException r5 = net.openid.appauth.AuthorizationException.fromTemplate(r5, r6)
            throw r5
    }
}
