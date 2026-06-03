package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public final class AnyBrowserMatcher implements net.openid.appauth.browser.BrowserMatcher {
    public static final net.openid.appauth.browser.AnyBrowserMatcher INSTANCE = null;

    static {
            net.openid.appauth.browser.AnyBrowserMatcher r0 = new net.openid.appauth.browser.AnyBrowserMatcher
            r0.<init>()
            net.openid.appauth.browser.AnyBrowserMatcher.INSTANCE = r0
            return
    }

    private AnyBrowserMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // net.openid.appauth.browser.BrowserMatcher
    public boolean matches(net.openid.appauth.browser.BrowserDescriptor r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
