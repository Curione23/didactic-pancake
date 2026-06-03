package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public final class Token {
    private static final java.lang.String TAG = "Token";
    private final androidx.browser.trusted.TokenContents mContents;

    private Token(androidx.browser.trusted.TokenContents r1) {
            r0 = this;
            r0.<init>()
            r0.mContents = r1
            return
    }

    public static androidx.browser.trusted.Token create(java.lang.String r2, android.content.pm.PackageManager r3) {
            java.util.List r3 = androidx.browser.trusted.PackageIdentityUtils.getFingerprintsForPackage(r2, r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            androidx.browser.trusted.Token r1 = new androidx.browser.trusted.Token     // Catch: java.io.IOException -> L12
            androidx.browser.trusted.TokenContents r2 = androidx.browser.trusted.TokenContents.create(r2, r3)     // Catch: java.io.IOException -> L12
            r1.<init>(r2)     // Catch: java.io.IOException -> L12
            return r1
        L12:
            r2 = move-exception
            java.lang.String r3 = "Token"
            java.lang.String r1 = "Exception when creating token."
            android.util.Log.e(r3, r1, r2)
            return r0
    }

    public static androidx.browser.trusted.Token deserialize(byte[] r1) {
            androidx.browser.trusted.Token r0 = new androidx.browser.trusted.Token
            androidx.browser.trusted.TokenContents r1 = androidx.browser.trusted.TokenContents.deserialize(r1)
            r0.<init>(r1)
            return r0
    }

    public boolean matches(java.lang.String r2, android.content.pm.PackageManager r3) {
            r1 = this;
            androidx.browser.trusted.TokenContents r0 = r1.mContents
            boolean r2 = androidx.browser.trusted.PackageIdentityUtils.packageMatchesToken(r2, r3, r0)
            return r2
    }

    public byte[] serialize() {
            r1 = this;
            androidx.browser.trusted.TokenContents r0 = r1.mContents
            byte[] r0 = r0.serialize()
            return r0
    }
}
