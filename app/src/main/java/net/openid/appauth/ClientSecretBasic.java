package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class ClientSecretBasic implements net.openid.appauth.ClientAuthentication {
    public static final java.lang.String NAME = "client_secret_basic";
    private java.lang.String mClientSecret;

    public ClientSecretBasic(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "mClientSecret cannot be null"
            java.lang.Object r2 = net.openid.appauth.Preconditions.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.mClientSecret = r2
            return
    }

    @Override // net.openid.appauth.ClientAuthentication
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHeaders(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = net.openid.appauth.internal.UriUtil.formUrlEncodeValue(r3)
            java.lang.String r0 = r2.mClientSecret
            java.lang.String r0 = net.openid.appauth.internal.UriUtil.formUrlEncodeValue(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            byte[] r3 = r3.getBytes()
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Basic "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "Authorization"
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            return r3
    }

    @Override // net.openid.appauth.ClientAuthentication
    public final java.util.Map<java.lang.String, java.lang.String> getRequestParameters(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
