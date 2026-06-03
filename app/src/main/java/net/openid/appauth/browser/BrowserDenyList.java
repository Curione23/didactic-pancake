package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public class BrowserDenyList implements net.openid.appauth.browser.BrowserMatcher {
    private java.util.List<net.openid.appauth.browser.BrowserMatcher> mBrowserMatchers;

    public BrowserDenyList(net.openid.appauth.browser.BrowserMatcher... r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.mBrowserMatchers = r1
            return
    }

    @Override // net.openid.appauth.browser.BrowserMatcher
    public boolean matches(net.openid.appauth.browser.BrowserDescriptor r3) {
            r2 = this;
            java.util.List<net.openid.appauth.browser.BrowserMatcher> r0 = r2.mBrowserMatchers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            net.openid.appauth.browser.BrowserMatcher r1 = (net.openid.appauth.browser.BrowserMatcher) r1
            boolean r1 = r1.matches(r3)
            if (r1 == 0) goto L6
            r3 = 0
            return r3
        L1a:
            r3 = 1
            return r3
    }
}
