package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public class VersionedBrowserMatcher implements net.openid.appauth.browser.BrowserMatcher {
    public static final net.openid.appauth.browser.VersionedBrowserMatcher CHROME_BROWSER = null;
    public static final net.openid.appauth.browser.VersionedBrowserMatcher CHROME_CUSTOM_TAB = null;
    public static final net.openid.appauth.browser.VersionedBrowserMatcher FIREFOX_BROWSER = null;
    public static final net.openid.appauth.browser.VersionedBrowserMatcher FIREFOX_CUSTOM_TAB = null;
    public static final net.openid.appauth.browser.VersionedBrowserMatcher SAMSUNG_BROWSER = null;
    public static final net.openid.appauth.browser.VersionedBrowserMatcher SAMSUNG_CUSTOM_TAB = null;
    private java.lang.String mPackageName;
    private java.util.Set<java.lang.String> mSignatureHashes;
    private boolean mUsingCustomTab;
    private net.openid.appauth.browser.VersionRange mVersionRange;

    static {
            net.openid.appauth.browser.VersionedBrowserMatcher r0 = new net.openid.appauth.browser.VersionedBrowserMatcher
            java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Chrome.SIGNATURE_SET
            net.openid.appauth.browser.DelimitedVersion r2 = net.openid.appauth.browser.Browsers.Chrome.MINIMUM_VERSION_FOR_CUSTOM_TAB
            net.openid.appauth.browser.VersionRange r2 = net.openid.appauth.browser.VersionRange.atLeast(r2)
            java.lang.String r3 = "com.android.chrome"
            r4 = 1
            r0.<init>(r3, r1, r4, r2)
            net.openid.appauth.browser.VersionedBrowserMatcher.CHROME_CUSTOM_TAB = r0
            net.openid.appauth.browser.VersionedBrowserMatcher r0 = new net.openid.appauth.browser.VersionedBrowserMatcher
            java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Chrome.SIGNATURE_SET
            net.openid.appauth.browser.VersionRange r2 = net.openid.appauth.browser.VersionRange.ANY_VERSION
            r5 = 0
            r0.<init>(r3, r1, r5, r2)
            net.openid.appauth.browser.VersionedBrowserMatcher.CHROME_BROWSER = r0
            net.openid.appauth.browser.VersionedBrowserMatcher r0 = new net.openid.appauth.browser.VersionedBrowserMatcher
            java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Firefox.SIGNATURE_SET
            net.openid.appauth.browser.DelimitedVersion r2 = net.openid.appauth.browser.Browsers.Firefox.MINIMUM_VERSION_FOR_CUSTOM_TAB
            net.openid.appauth.browser.VersionRange r2 = net.openid.appauth.browser.VersionRange.atLeast(r2)
            java.lang.String r3 = "org.mozilla.firefox"
            r0.<init>(r3, r1, r4, r2)
            net.openid.appauth.browser.VersionedBrowserMatcher.FIREFOX_CUSTOM_TAB = r0
            net.openid.appauth.browser.VersionedBrowserMatcher r0 = new net.openid.appauth.browser.VersionedBrowserMatcher
            java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Firefox.SIGNATURE_SET
            net.openid.appauth.browser.VersionRange r2 = net.openid.appauth.browser.VersionRange.ANY_VERSION
            r0.<init>(r3, r1, r5, r2)
            net.openid.appauth.browser.VersionedBrowserMatcher.FIREFOX_BROWSER = r0
            net.openid.appauth.browser.VersionedBrowserMatcher r0 = new net.openid.appauth.browser.VersionedBrowserMatcher
            java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.SBrowser.SIGNATURE_SET
            net.openid.appauth.browser.VersionRange r2 = net.openid.appauth.browser.VersionRange.ANY_VERSION
            java.lang.String r3 = "com.sec.android.app.sbrowser"
            r0.<init>(r3, r1, r5, r2)
            net.openid.appauth.browser.VersionedBrowserMatcher.SAMSUNG_BROWSER = r0
            net.openid.appauth.browser.VersionedBrowserMatcher r0 = new net.openid.appauth.browser.VersionedBrowserMatcher
            java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.SBrowser.SIGNATURE_SET
            net.openid.appauth.browser.DelimitedVersion r2 = net.openid.appauth.browser.Browsers.SBrowser.MINIMUM_VERSION_FOR_CUSTOM_TAB
            net.openid.appauth.browser.VersionRange r2 = net.openid.appauth.browser.VersionRange.atLeast(r2)
            r0.<init>(r3, r1, r4, r2)
            net.openid.appauth.browser.VersionedBrowserMatcher.SAMSUNG_CUSTOM_TAB = r0
            return
    }

    public VersionedBrowserMatcher(java.lang.String r1, java.lang.String r2, boolean r3, net.openid.appauth.browser.VersionRange r4) {
            r0 = this;
            java.util.Set r2 = java.util.Collections.singleton(r2)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public VersionedBrowserMatcher(java.lang.String r1, java.util.Set<java.lang.String> r2, boolean r3, net.openid.appauth.browser.VersionRange r4) {
            r0 = this;
            r0.<init>()
            r0.mPackageName = r1
            r0.mSignatureHashes = r2
            r0.mUsingCustomTab = r3
            r0.mVersionRange = r4
            return
    }

    @Override // net.openid.appauth.browser.BrowserMatcher
    public boolean matches(net.openid.appauth.browser.BrowserDescriptor r3) {
            r2 = this;
            java.lang.String r0 = r2.mPackageName
            java.lang.String r1 = r3.packageName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            boolean r0 = r2.mUsingCustomTab
            java.lang.Boolean r1 = r3.useCustomTab
            boolean r1 = r1.booleanValue()
            if (r0 != r1) goto L2a
            net.openid.appauth.browser.VersionRange r0 = r2.mVersionRange
            java.lang.String r1 = r3.version
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L2a
            java.util.Set<java.lang.String> r0 = r2.mSignatureHashes
            java.util.Set<java.lang.String> r3 = r3.signatureHashes
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2a
            r3 = 1
            goto L2b
        L2a:
            r3 = 0
        L2b:
            return r3
    }
}
