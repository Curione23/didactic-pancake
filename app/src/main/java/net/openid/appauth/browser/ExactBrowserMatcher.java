package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public class ExactBrowserMatcher implements net.openid.appauth.browser.BrowserMatcher {
    private net.openid.appauth.browser.BrowserDescriptor mBrowser;

    public ExactBrowserMatcher(net.openid.appauth.browser.BrowserDescriptor r1) {
            r0 = this;
            r0.<init>()
            r0.mBrowser = r1
            return
    }

    @Override // net.openid.appauth.browser.BrowserMatcher
    public boolean matches(net.openid.appauth.browser.BrowserDescriptor r2) {
            r1 = this;
            net.openid.appauth.browser.BrowserDescriptor r0 = r1.mBrowser
            boolean r2 = r0.equals(r2)
            return r2
    }
}
