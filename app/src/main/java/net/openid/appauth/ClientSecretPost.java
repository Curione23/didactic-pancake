package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class ClientSecretPost implements net.openid.appauth.ClientAuthentication {
    public static final java.lang.String NAME = "client_secret_post";
    static final java.lang.String PARAM_CLIENT_ID = "client_id";
    static final java.lang.String PARAM_CLIENT_SECRET = "client_secret";
    private java.lang.String mClientSecret;

    public ClientSecretPost(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "clientSecret cannot be null"
            java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.mClientSecret = r2
            return
    }

    @Override // net.openid.appauth.ClientAuthentication
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHeaders(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // net.openid.appauth.ClientAuthentication
    public final java.util.Map<java.lang.String, java.lang.String> getRequestParameters(java.lang.String r3) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "client_id"
            r0.put(r1, r3)
            java.lang.String r3 = "client_secret"
            java.lang.String r1 = r2.mClientSecret
            r0.put(r3, r1)
            return r0
    }
}
