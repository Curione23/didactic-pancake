package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class AppAuthConfiguration {
    public static final net.openid.appauth.AppAuthConfiguration DEFAULT = null;
    private final net.openid.appauth.browser.BrowserMatcher mBrowserMatcher;
    private final net.openid.appauth.connectivity.ConnectionBuilder mConnectionBuilder;
    private final boolean mSkipIssuerHttpsCheck;

    /* JADX INFO: renamed from: net.openid.appauth.AppAuthConfiguration$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private net.openid.appauth.browser.BrowserMatcher mBrowserMatcher;
        private net.openid.appauth.connectivity.ConnectionBuilder mConnectionBuilder;
        private boolean mSkipIssuerHttpsCheck;
        private boolean mSkipNonceVerification;

        public Builder() {
                r1 = this;
                r1.<init>()
                net.openid.appauth.browser.AnyBrowserMatcher r0 = net.openid.appauth.browser.AnyBrowserMatcher.INSTANCE
                r1.mBrowserMatcher = r0
                net.openid.appauth.connectivity.DefaultConnectionBuilder r0 = net.openid.appauth.connectivity.DefaultConnectionBuilder.INSTANCE
                r1.mConnectionBuilder = r0
                return
        }

        public net.openid.appauth.AppAuthConfiguration build() {
                r5 = this;
                net.openid.appauth.AppAuthConfiguration r0 = new net.openid.appauth.AppAuthConfiguration
                net.openid.appauth.browser.BrowserMatcher r1 = r5.mBrowserMatcher
                net.openid.appauth.connectivity.ConnectionBuilder r2 = r5.mConnectionBuilder
                boolean r3 = r5.mSkipIssuerHttpsCheck
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public net.openid.appauth.AppAuthConfiguration.Builder setBrowserMatcher(net.openid.appauth.browser.BrowserMatcher r2) {
                r1 = this;
                java.lang.String r0 = "browserMatcher cannot be null"
                net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                r1.mBrowserMatcher = r2
                return r1
        }

        public net.openid.appauth.AppAuthConfiguration.Builder setConnectionBuilder(net.openid.appauth.connectivity.ConnectionBuilder r2) {
                r1 = this;
                java.lang.String r0 = "connectionBuilder cannot be null"
                net.openid.appauth.Preconditions.checkNotNull(r2, r0)
                r1.mConnectionBuilder = r2
                return r1
        }

        public net.openid.appauth.AppAuthConfiguration.Builder setSkipIssuerHttpsCheck(java.lang.Boolean r1) {
                r0 = this;
                boolean r1 = r1.booleanValue()
                r0.mSkipIssuerHttpsCheck = r1
                return r0
        }
    }

    static {
            net.openid.appauth.AppAuthConfiguration$Builder r0 = new net.openid.appauth.AppAuthConfiguration$Builder
            r0.<init>()
            net.openid.appauth.AppAuthConfiguration r0 = r0.build()
            net.openid.appauth.AppAuthConfiguration.DEFAULT = r0
            return
    }

    private AppAuthConfiguration(net.openid.appauth.browser.BrowserMatcher r1, net.openid.appauth.connectivity.ConnectionBuilder r2, java.lang.Boolean r3) {
            r0 = this;
            r0.<init>()
            r0.mBrowserMatcher = r1
            r0.mConnectionBuilder = r2
            boolean r1 = r3.booleanValue()
            r0.mSkipIssuerHttpsCheck = r1
            return
    }

    /* synthetic */ AppAuthConfiguration(net.openid.appauth.browser.BrowserMatcher r1, net.openid.appauth.connectivity.ConnectionBuilder r2, java.lang.Boolean r3, net.openid.appauth.AppAuthConfiguration.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public net.openid.appauth.browser.BrowserMatcher getBrowserMatcher() {
            r1 = this;
            net.openid.appauth.browser.BrowserMatcher r0 = r1.mBrowserMatcher
            return r0
    }

    public net.openid.appauth.connectivity.ConnectionBuilder getConnectionBuilder() {
            r1 = this;
            net.openid.appauth.connectivity.ConnectionBuilder r0 = r1.mConnectionBuilder
            return r0
    }

    public boolean getSkipIssuerHttpsCheck() {
            r1 = this;
            boolean r0 = r1.mSkipIssuerHttpsCheck
            return r0
    }
}
