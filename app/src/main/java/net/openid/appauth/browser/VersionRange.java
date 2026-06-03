package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public class VersionRange {
    public static final net.openid.appauth.browser.VersionRange ANY_VERSION = null;
    private net.openid.appauth.browser.DelimitedVersion mLowerBound;
    private net.openid.appauth.browser.DelimitedVersion mUpperBound;

    static {
            net.openid.appauth.browser.VersionRange r0 = new net.openid.appauth.browser.VersionRange
            r1 = 0
            r0.<init>(r1, r1)
            net.openid.appauth.browser.VersionRange.ANY_VERSION = r0
            return
    }

    public VersionRange(net.openid.appauth.browser.DelimitedVersion r1, net.openid.appauth.browser.DelimitedVersion r2) {
            r0 = this;
            r0.<init>()
            r0.mLowerBound = r1
            r0.mUpperBound = r2
            return
    }

    public static net.openid.appauth.browser.VersionRange atLeast(java.lang.String r0) {
            net.openid.appauth.browser.DelimitedVersion r0 = net.openid.appauth.browser.DelimitedVersion.parse(r0)
            net.openid.appauth.browser.VersionRange r0 = atLeast(r0)
            return r0
    }

    public static net.openid.appauth.browser.VersionRange atLeast(net.openid.appauth.browser.DelimitedVersion r2) {
            net.openid.appauth.browser.VersionRange r0 = new net.openid.appauth.browser.VersionRange
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static net.openid.appauth.browser.VersionRange atMost(java.lang.String r0) {
            net.openid.appauth.browser.DelimitedVersion r0 = net.openid.appauth.browser.DelimitedVersion.parse(r0)
            net.openid.appauth.browser.VersionRange r0 = atMost(r0)
            return r0
    }

    public static net.openid.appauth.browser.VersionRange atMost(net.openid.appauth.browser.DelimitedVersion r2) {
            net.openid.appauth.browser.VersionRange r0 = new net.openid.appauth.browser.VersionRange
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static net.openid.appauth.browser.VersionRange between(java.lang.String r1, java.lang.String r2) {
            net.openid.appauth.browser.VersionRange r0 = new net.openid.appauth.browser.VersionRange
            net.openid.appauth.browser.DelimitedVersion r1 = net.openid.appauth.browser.DelimitedVersion.parse(r1)
            net.openid.appauth.browser.DelimitedVersion r2 = net.openid.appauth.browser.DelimitedVersion.parse(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public boolean matches(java.lang.String r1) {
            r0 = this;
            net.openid.appauth.browser.DelimitedVersion r1 = net.openid.appauth.browser.DelimitedVersion.parse(r1)
            boolean r1 = r0.matches(r1)
            return r1
    }

    public boolean matches(net.openid.appauth.browser.DelimitedVersion r3) {
            r2 = this;
            net.openid.appauth.browser.DelimitedVersion r0 = r2.mLowerBound
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.compareTo2(r3)
            if (r0 <= 0) goto Lc
            return r1
        Lc:
            net.openid.appauth.browser.DelimitedVersion r0 = r2.mUpperBound
            if (r0 == 0) goto L17
            int r3 = r0.compareTo2(r3)
            if (r3 >= 0) goto L17
            return r1
        L17:
            r3 = 1
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            net.openid.appauth.browser.DelimitedVersion r0 = r2.mLowerBound
            if (r0 != 0) goto L25
            net.openid.appauth.browser.DelimitedVersion r0 = r2.mUpperBound
            if (r0 != 0) goto Lb
            java.lang.String r0 = "any version"
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            net.openid.appauth.browser.DelimitedVersion r1 = r2.mUpperBound
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " or lower"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L25:
            net.openid.appauth.browser.DelimitedVersion r0 = r2.mUpperBound
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "between "
            r0.<init>(r1)
            net.openid.appauth.browser.DelimitedVersion r1 = r2.mLowerBound
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " and "
            java.lang.StringBuilder r0 = r0.append(r1)
            net.openid.appauth.browser.DelimitedVersion r1 = r2.mUpperBound
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L47:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            net.openid.appauth.browser.DelimitedVersion r1 = r2.mLowerBound
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " or higher"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
