package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class PackageIdentityUtils {
    private static final java.lang.String TAG = "PackageIdentity";

    static class Api28Implementation implements androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat {
        Api28Implementation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public java.util.List<byte[]> getFingerprintsForPackage(java.lang.String r4, android.content.pm.PackageManager r5) throws android.content.pm.PackageManager.NameNotFoundException {
                r3 = this;
                r0 = 134217728(0x8000000, float:3.85186E-34)
                android.content.pm.PackageInfo r4 = r5.getPackageInfo(r4, r0)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                android.content.pm.SigningInfo r4 = r4.signingInfo
                boolean r0 = r4.hasMultipleSigners()
                r1 = 0
                if (r0 == 0) goto L27
                android.content.pm.Signature[] r4 = r4.getApkContentsSigners()
                int r0 = r4.length
            L19:
                if (r1 >= r0) goto L34
                r2 = r4[r1]
                byte[] r2 = androidx.browser.trusted.PackageIdentityUtils.getCertificateSHA256Fingerprint(r2)
                r5.add(r2)
                int r1 = r1 + 1
                goto L19
            L27:
                android.content.pm.Signature[] r4 = r4.getSigningCertificateHistory()
                r4 = r4[r1]
                byte[] r4 = androidx.browser.trusted.PackageIdentityUtils.getCertificateSHA256Fingerprint(r4)
                r5.add(r4)
            L34:
                return r5
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean packageMatchesToken(java.lang.String r5, android.content.pm.PackageManager r6, androidx.browser.trusted.TokenContents r7) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
                r4 = this;
                java.lang.String r0 = r7.getPackageName()
                boolean r0 = r0.equals(r5)
                r1 = 0
                if (r0 != 0) goto Lc
                return r1
            Lc:
                java.util.List r0 = r4.getFingerprintsForPackage(r5, r6)
                if (r0 != 0) goto L13
                return r1
            L13:
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto L23
                byte[] r7 = r7.getFingerprint(r1)
                boolean r5 = r6.hasSigningCertificate(r5, r7, r3)
                return r5
            L23:
                androidx.browser.trusted.TokenContents r5 = androidx.browser.trusted.TokenContents.create(r5, r0)
                boolean r5 = r7.equals(r5)
                return r5
        }
    }

    static class Pre28Implementation implements androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat {
        Pre28Implementation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public java.util.List<byte[]> getFingerprintsForPackage(java.lang.String r4, android.content.pm.PackageManager r5) throws android.content.pm.PackageManager.NameNotFoundException {
                r3 = this;
                r0 = 64
                android.content.pm.PackageInfo r4 = r5.getPackageInfo(r4, r0)
                java.util.ArrayList r5 = new java.util.ArrayList
                android.content.pm.Signature[] r0 = r4.signatures
                int r0 = r0.length
                r5.<init>(r0)
                android.content.pm.Signature[] r4 = r4.signatures
                int r0 = r4.length
                r1 = 0
            L12:
                if (r1 >= r0) goto L24
                r2 = r4[r1]
                byte[] r2 = androidx.browser.trusted.PackageIdentityUtils.getCertificateSHA256Fingerprint(r2)
                if (r2 != 0) goto L1e
                r4 = 0
                return r4
            L1e:
                r5.add(r2)
                int r1 = r1 + 1
                goto L12
            L24:
                return r5
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean packageMatchesToken(java.lang.String r3, android.content.pm.PackageManager r4, androidx.browser.trusted.TokenContents r5) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {
                r2 = this;
                java.lang.String r0 = r5.getPackageName()
                boolean r0 = r3.equals(r0)
                r1 = 0
                if (r0 != 0) goto Lc
                return r1
            Lc:
                java.util.List r4 = r2.getFingerprintsForPackage(r3, r4)
                if (r4 != 0) goto L13
                return r1
            L13:
                androidx.browser.trusted.TokenContents r3 = androidx.browser.trusted.TokenContents.create(r3, r4)
                boolean r3 = r5.equals(r3)
                return r3
        }
    }

    interface SignaturesCompat {
        java.util.List<byte[]> getFingerprintsForPackage(java.lang.String r1, android.content.pm.PackageManager r2) throws android.content.pm.PackageManager.NameNotFoundException;

        boolean packageMatchesToken(java.lang.String r1, android.content.pm.PackageManager r2, androidx.browser.trusted.TokenContents r3) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException;
    }

    private PackageIdentityUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static byte[] getCertificateSHA256Fingerprint(android.content.pm.Signature r1) {
            java.lang.String r0 = "SHA256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            byte[] r1 = r1.toByteArray()     // Catch: java.security.NoSuchAlgorithmException -> Lf
            byte[] r1 = r0.digest(r1)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            return r1
        Lf:
            r1 = 0
            return r1
    }

    static java.util.List<byte[]> getFingerprintsForPackage(java.lang.String r1, android.content.pm.PackageManager r2) {
            androidx.browser.trusted.PackageIdentityUtils$SignaturesCompat r0 = getImpl()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            java.util.List r1 = r0.getFingerprintsForPackage(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.String r2 = "PackageIdentity"
            java.lang.String r0 = "Could not get fingerprint for package."
            android.util.Log.e(r2, r0, r1)
            r1 = 0
            return r1
    }

    private static androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat getImpl() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            androidx.browser.trusted.PackageIdentityUtils$Api28Implementation r0 = new androidx.browser.trusted.PackageIdentityUtils$Api28Implementation
            r0.<init>()
            return r0
        Lc:
            androidx.browser.trusted.PackageIdentityUtils$Pre28Implementation r0 = new androidx.browser.trusted.PackageIdentityUtils$Pre28Implementation
            r0.<init>()
            return r0
    }

    static boolean packageMatchesToken(java.lang.String r1, android.content.pm.PackageManager r2, androidx.browser.trusted.TokenContents r3) {
            androidx.browser.trusted.PackageIdentityUtils$SignaturesCompat r0 = getImpl()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9 java.io.IOException -> Lb
            boolean r1 = r0.packageMatchesToken(r1, r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9 java.io.IOException -> Lb
            return r1
        L9:
            r1 = move-exception
            goto Lc
        Lb:
            r1 = move-exception
        Lc:
            java.lang.String r2 = "PackageIdentity"
            java.lang.String r3 = "Could not check if package matches token."
            android.util.Log.e(r2, r3, r1)
            r1 = 0
            return r1
    }
}
