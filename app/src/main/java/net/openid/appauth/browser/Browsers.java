package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public final class Browsers {

    public static final class Chrome {
        public static final net.openid.appauth.browser.DelimitedVersion MINIMUM_VERSION_FOR_CUSTOM_TAB = null;
        public static final java.lang.String PACKAGE_NAME = "com.android.chrome";
        public static final java.lang.String SIGNATURE = "7fmduHKTdHHrlMvldlEqAIlSfii1tl35bxj1OXN5Ve8c4lU6URVu4xtSHc3BVZxS6WWJnxMDhIfQN0N0K2NDJg==";
        public static final java.util.Set<java.lang.String> SIGNATURE_SET = null;

        static {
                java.lang.String r0 = "7fmduHKTdHHrlMvldlEqAIlSfii1tl35bxj1OXN5Ve8c4lU6URVu4xtSHc3BVZxS6WWJnxMDhIfQN0N0K2NDJg=="
                java.util.Set r0 = java.util.Collections.singleton(r0)
                net.openid.appauth.browser.Browsers.Chrome.SIGNATURE_SET = r0
                java.lang.String r0 = "45"
                net.openid.appauth.browser.DelimitedVersion r0 = net.openid.appauth.browser.DelimitedVersion.parse(r0)
                net.openid.appauth.browser.Browsers.Chrome.MINIMUM_VERSION_FOR_CUSTOM_TAB = r0
                return
        }

        private Chrome() {
                r0 = this;
                r0.<init>()
                return
        }

        public static net.openid.appauth.browser.BrowserDescriptor customTab(java.lang.String r4) {
                net.openid.appauth.browser.BrowserDescriptor r0 = new net.openid.appauth.browser.BrowserDescriptor
                java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Chrome.SIGNATURE_SET
                r2 = 1
                java.lang.String r3 = "com.android.chrome"
                r0.<init>(r3, r1, r4, r2)
                return r0
        }

        public static net.openid.appauth.browser.BrowserDescriptor standaloneBrowser(java.lang.String r4) {
                net.openid.appauth.browser.BrowserDescriptor r0 = new net.openid.appauth.browser.BrowserDescriptor
                java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Chrome.SIGNATURE_SET
                r2 = 0
                java.lang.String r3 = "com.android.chrome"
                r0.<init>(r3, r1, r4, r2)
                return r0
        }
    }

    public static final class Firefox {
        public static final net.openid.appauth.browser.DelimitedVersion MINIMUM_VERSION_FOR_CUSTOM_TAB = null;
        public static final java.lang.String PACKAGE_NAME = "org.mozilla.firefox";
        public static final java.lang.String SIGNATURE_HASH = "2gCe6pR_AO_Q2Vu8Iep-4AsiKNnUHQxu0FaDHO_qa178GByKybdT_BuE8_dYk99G5Uvx_gdONXAOO2EaXidpVQ==";
        public static final java.util.Set<java.lang.String> SIGNATURE_SET = null;

        static {
                java.lang.String r0 = "2gCe6pR_AO_Q2Vu8Iep-4AsiKNnUHQxu0FaDHO_qa178GByKybdT_BuE8_dYk99G5Uvx_gdONXAOO2EaXidpVQ=="
                java.util.Set r0 = java.util.Collections.singleton(r0)
                net.openid.appauth.browser.Browsers.Firefox.SIGNATURE_SET = r0
                java.lang.String r0 = "57"
                net.openid.appauth.browser.DelimitedVersion r0 = net.openid.appauth.browser.DelimitedVersion.parse(r0)
                net.openid.appauth.browser.Browsers.Firefox.MINIMUM_VERSION_FOR_CUSTOM_TAB = r0
                return
        }

        private Firefox() {
                r0 = this;
                r0.<init>()
                return
        }

        public static net.openid.appauth.browser.BrowserDescriptor customTab(java.lang.String r4) {
                net.openid.appauth.browser.BrowserDescriptor r0 = new net.openid.appauth.browser.BrowserDescriptor
                java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Firefox.SIGNATURE_SET
                r2 = 1
                java.lang.String r3 = "org.mozilla.firefox"
                r0.<init>(r3, r1, r4, r2)
                return r0
        }

        public static net.openid.appauth.browser.BrowserDescriptor standaloneBrowser(java.lang.String r4) {
                net.openid.appauth.browser.BrowserDescriptor r0 = new net.openid.appauth.browser.BrowserDescriptor
                java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.Firefox.SIGNATURE_SET
                r2 = 0
                java.lang.String r3 = "org.mozilla.firefox"
                r0.<init>(r3, r1, r4, r2)
                return r0
        }
    }

    public static final class SBrowser {
        public static final net.openid.appauth.browser.DelimitedVersion MINIMUM_VERSION_FOR_CUSTOM_TAB = null;
        public static final java.lang.String PACKAGE_NAME = "com.sec.android.app.sbrowser";
        public static final java.lang.String SIGNATURE_HASH = "ABi2fbt8vkzj7SJ8aD5jc4xJFTDFntdkMrYXL3itsvqY1QIw-dZozdop5rgKNxjbrQAd5nntAGpgh9w84O1Xgg==";
        public static final java.util.Set<java.lang.String> SIGNATURE_SET = null;

        static {
                java.lang.String r0 = "ABi2fbt8vkzj7SJ8aD5jc4xJFTDFntdkMrYXL3itsvqY1QIw-dZozdop5rgKNxjbrQAd5nntAGpgh9w84O1Xgg=="
                java.util.Set r0 = java.util.Collections.singleton(r0)
                net.openid.appauth.browser.Browsers.SBrowser.SIGNATURE_SET = r0
                java.lang.String r0 = "4.0"
                net.openid.appauth.browser.DelimitedVersion r0 = net.openid.appauth.browser.DelimitedVersion.parse(r0)
                net.openid.appauth.browser.Browsers.SBrowser.MINIMUM_VERSION_FOR_CUSTOM_TAB = r0
                return
        }

        private SBrowser() {
                r0 = this;
                r0.<init>()
                return
        }

        public static net.openid.appauth.browser.BrowserDescriptor customTab(java.lang.String r4) {
                net.openid.appauth.browser.BrowserDescriptor r0 = new net.openid.appauth.browser.BrowserDescriptor
                java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.SBrowser.SIGNATURE_SET
                r2 = 1
                java.lang.String r3 = "com.sec.android.app.sbrowser"
                r0.<init>(r3, r1, r4, r2)
                return r0
        }

        public static net.openid.appauth.browser.BrowserDescriptor standaloneBrowser(java.lang.String r4) {
                net.openid.appauth.browser.BrowserDescriptor r0 = new net.openid.appauth.browser.BrowserDescriptor
                java.util.Set<java.lang.String> r1 = net.openid.appauth.browser.Browsers.SBrowser.SIGNATURE_SET
                r2 = 0
                java.lang.String r3 = "com.sec.android.app.sbrowser"
                r0.<init>(r3, r1, r4, r2)
                return r0
        }
    }

    private Browsers() {
            r0 = this;
            r0.<init>()
            return
    }
}
