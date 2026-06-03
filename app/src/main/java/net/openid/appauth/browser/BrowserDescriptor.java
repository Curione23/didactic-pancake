package net.openid.appauth.browser;

/* JADX INFO: loaded from: classes2.dex */
public class BrowserDescriptor {
    private static final java.lang.String DIGEST_SHA_512 = "SHA-512";
    private static final int PRIME_HASH_FACTOR = 92821;
    public final java.lang.String packageName;
    public final java.util.Set<java.lang.String> signatureHashes;
    public final java.lang.Boolean useCustomTab;
    public final java.lang.String version;

    public BrowserDescriptor(android.content.pm.PackageInfo r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = r3.packageName
            android.content.pm.Signature[] r1 = r3.signatures
            java.util.Set r1 = generateSignatureHashes(r1)
            java.lang.String r3 = r3.versionName
            r2.<init>(r0, r1, r3, r4)
            return
    }

    public BrowserDescriptor(java.lang.String r1, java.util.Set<java.lang.String> r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.packageName = r1
            r0.signatureHashes = r2
            r0.version = r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.useCustomTab = r1
            return
    }

    public static java.lang.String generateSignatureHash(android.content.pm.Signature r1) {
            java.lang.String r0 = "SHA-512"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L15
            byte[] r1 = r1.toByteArray()     // Catch: java.security.NoSuchAlgorithmException -> L15
            byte[] r1 = r0.digest(r1)     // Catch: java.security.NoSuchAlgorithmException -> L15
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.security.NoSuchAlgorithmException -> L15
            return r1
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Platform does not supportSHA-512 hashing"
            r1.<init>(r0)
            throw r1
    }

    public static java.util.Set<java.lang.String> generateSignatureHashes(android.content.pm.Signature[] r4) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r4[r2]
            java.lang.String r3 = generateSignatureHash(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    public net.openid.appauth.browser.BrowserDescriptor changeUseCustomTab(boolean r5) {
            r4 = this;
            net.openid.appauth.browser.BrowserDescriptor r0 = new net.openid.appauth.browser.BrowserDescriptor
            java.lang.String r1 = r4.packageName
            java.util.Set<java.lang.String> r2 = r4.signatureHashes
            java.lang.String r3 = r4.version
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L35
            boolean r2 = r5 instanceof net.openid.appauth.browser.BrowserDescriptor
            if (r2 != 0) goto Lc
            goto L35
        Lc:
            net.openid.appauth.browser.BrowserDescriptor r5 = (net.openid.appauth.browser.BrowserDescriptor) r5
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = r5.packageName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            java.lang.String r2 = r4.version
            java.lang.String r3 = r5.version
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            java.lang.Boolean r2 = r4.useCustomTab
            java.lang.Boolean r3 = r5.useCustomTab
            if (r2 != r3) goto L33
            java.util.Set<java.lang.String> r2 = r4.signatureHashes
            java.util.Set<java.lang.String> r5 = r5.signatureHashes
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L33
            goto L34
        L33:
            r0 = r1
        L34:
            return r0
        L35:
            return r1
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.packageName
            int r0 = r0.hashCode()
            r1 = 92821(0x16a95, float:1.3007E-40)
            int r0 = r0 * r1
            java.lang.String r2 = r4.version
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.Boolean r2 = r4.useCustomTab
            boolean r2 = r2.booleanValue()
            int r0 = r0 + r2
            java.util.Set<java.lang.String> r2 = r4.signatureHashes
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r0 = r0 * r1
            int r3 = r3.hashCode()
            int r0 = r0 + r3
            goto L1f
        L32:
            return r0
    }
}
