package net.openid.appauth.connectivity;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultConnectionBuilder implements net.openid.appauth.connectivity.ConnectionBuilder {
    private static final int CONNECTION_TIMEOUT_MS = 0;
    private static final java.lang.String HTTPS_SCHEME = "https";
    public static final net.openid.appauth.connectivity.DefaultConnectionBuilder INSTANCE = null;
    private static final int READ_TIMEOUT_MS = 0;

    static {
            net.openid.appauth.connectivity.DefaultConnectionBuilder r0 = new net.openid.appauth.connectivity.DefaultConnectionBuilder
            r0.<init>()
            net.openid.appauth.connectivity.DefaultConnectionBuilder.INSTANCE = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 15
            long r0 = r0.toMillis(r1)
            int r0 = (int) r0
            net.openid.appauth.connectivity.DefaultConnectionBuilder.CONNECTION_TIMEOUT_MS = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 10
            long r0 = r0.toMillis(r1)
            int r0 = (int) r0
            net.openid.appauth.connectivity.DefaultConnectionBuilder.READ_TIMEOUT_MS = r0
            return
    }

    private DefaultConnectionBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // net.openid.appauth.connectivity.ConnectionBuilder
    public java.net.HttpURLConnection openConnection(android.net.Uri r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "url must not be null"
            net.openid.appauth.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "https"
            java.lang.String r1 = r3.getScheme()
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "only https connections are permitted"
            net.openid.appauth.Preconditions.checkArgument(r0, r1)
            java.net.URL r0 = new java.net.URL
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            java.net.URLConnection r3 = r0.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r0 = net.openid.appauth.connectivity.DefaultConnectionBuilder.CONNECTION_TIMEOUT_MS
            r3.setConnectTimeout(r0)
            int r0 = net.openid.appauth.connectivity.DefaultConnectionBuilder.READ_TIMEOUT_MS
            r3.setReadTimeout(r0)
            r0 = 0
            r3.setInstanceFollowRedirects(r0)
            return r3
    }
}
