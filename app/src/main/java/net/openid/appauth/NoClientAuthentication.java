package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class NoClientAuthentication implements net.openid.appauth.ClientAuthentication {
    public static final net.openid.appauth.NoClientAuthentication INSTANCE = null;
    public static final java.lang.String NAME = "none";

    static {
            net.openid.appauth.NoClientAuthentication r0 = new net.openid.appauth.NoClientAuthentication
            r0.<init>()
            net.openid.appauth.NoClientAuthentication.INSTANCE = r0
            return
    }

    private NoClientAuthentication() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // net.openid.appauth.ClientAuthentication
    public java.util.Map<java.lang.String, java.lang.String> getRequestHeaders(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // net.openid.appauth.ClientAuthentication
    public java.util.Map<java.lang.String, java.lang.String> getRequestParameters(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "client_id"
            java.util.Map r2 = java.util.Collections.singletonMap(r0, r2)
            return r2
    }
}
