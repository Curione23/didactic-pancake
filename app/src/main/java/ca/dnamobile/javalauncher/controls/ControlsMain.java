package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class ControlsMain {
    private static final java.lang.String BLOCK_MESSAGE = "This copy of DroidBridge Launcher was not signed by DNA Mobile Applications. For your safety, this build is blocked.";
    private static final java.lang.String BLOCK_TITLE = "App integrity check failed";
    private static final java.lang.String CLOSE_BUTTON = "Close";
    private static final boolean ENFORCE_IN_DEBUG_BUILDS = false;

    private ControlsMain() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean blockIfInvalidSignature(android.app.Activity r1) {
            boolean r0 = isExpectedSignature(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            showBlockingDialog(r1)
            r1 = 1
            return r1
    }

    private static void closeApp(android.app.Activity r0) {
            r0.finishAffinity()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0.finish()     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    private static java.util.List<java.lang.String> getExpectedHashes() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "63231CE778C3676A32922F9EE7038929DB8E029C4630BFBEB0DD009FB963AA71"
            java.lang.String r1 = safeString(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L46
            java.lang.String r2 = "PUT_YOUR"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L46
            java.lang.String r2 = "CHANGE_ME"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L22
            goto L46
        L22:
            java.lang.String r2 = "[,;\\n\\r]+"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 0
        L2a:
            if (r3 >= r2) goto L46
            r4 = r1[r3]
            java.lang.String r4 = normalizeSha256(r4)
            int r5 = r4.length()
            r6 = 64
            if (r5 != r6) goto L43
            boolean r5 = r0.contains(r4)
            if (r5 != 0) goto L43
            r0.add(r4)
        L43:
            int r3 = r3 + 1
            goto L2a
        L46:
            return r0
    }

    private static android.content.pm.Signature[] getInstalledSignatures(android.content.Context r3) throws java.lang.Exception {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r3 = r3.getPackageName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L30
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            android.content.pm.SigningInfo r0 = r3.signingInfo
            if (r0 != 0) goto L1a
            r3 = 0
            return r3
        L1a:
            android.content.pm.SigningInfo r0 = r3.signingInfo
            boolean r0 = r0.hasMultipleSigners()
            if (r0 == 0) goto L29
            android.content.pm.SigningInfo r3 = r3.signingInfo
            android.content.pm.Signature[] r3 = r3.getApkContentsSigners()
            return r3
        L29:
            android.content.pm.SigningInfo r3 = r3.signingInfo
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()
            return r3
        L30:
            r1 = 64
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            android.content.pm.Signature[] r3 = r3.signatures
            return r3
    }

    public static boolean isExpectedSignature(android.content.Context r6) {
            boolean r0 = shouldEnforceSignatureCheck()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.List r0 = getExpectedHashes()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            return r1
        L13:
            r2 = 0
            android.content.pm.Signature[] r6 = getInstalledSignatures(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L36
            int r3 = r6.length     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L1e
            goto L36
        L1e:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L36
            r4 = r2
        L20:
            if (r4 >= r3) goto L36
            r5 = r6[r4]     // Catch: java.lang.Throwable -> L36
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = sha256(r5)     // Catch: java.lang.Throwable -> L36
            boolean r5 = r0.contains(r5)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L33
            return r1
        L33:
            int r4 = r4 + 1
            goto L20
        L36:
            return r2
    }

    static /* synthetic */ void lambda$showBlockingDialog$0(android.app.Activity r0, android.content.DialogInterface r1, int r2) {
            r1.dismiss()
            closeApp(r0)
            return
    }

    static /* synthetic */ void lambda$showBlockingDialog$1(android.app.Activity r3) {
            boolean r0 = r3.isFinishing()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r3.isDestroyed()
            if (r0 == 0) goto Le
            return
        Le:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L33
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "App integrity check failed"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "This copy of DroidBridge Launcher was not signed by DNA Mobile Applications. For your safety, this build is blocked."
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)     // Catch: java.lang.Throwable -> L33
            r1 = 0
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Close"
            ca.dnamobile.javalauncher.controls.ControlsMain$$ExternalSyntheticLambda0 r2 = new ca.dnamobile.javalauncher.controls.ControlsMain$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0.show()     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            closeApp(r3)
        L36:
            return
    }

    private static java.lang.String normalizeSha256(java.lang.String r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = ":"
            java.lang.String r2 = r2.replace(r1, r0)
            java.lang.String r1 = " "
            java.lang.String r2 = r2.replace(r1, r0)
            java.lang.String r1 = "-"
            java.lang.String r2 = r2.replace(r1, r0)
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            return r2
    }

    private static java.lang.String safeString(java.lang.String r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            goto L9
        L5:
            java.lang.String r0 = r0.trim()
        L9:
            return r0
    }

    private static java.lang.String sha256(byte[] r6) throws java.lang.Exception {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r6 = r0.digest(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L30
            r3 = r6[r2]
            java.util.Locale r4 = java.util.Locale.ROOT
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "%02x"
            java.lang.String r3 = java.lang.String.format(r4, r5, r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto L14
        L30:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static boolean shouldBlockSensitiveAction(android.content.Context r0) {
            boolean r0 = isExpectedSignature(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean shouldEnforceSignatureCheck() {
            r0 = 1
            return r0
    }

    private static void showBlockingDialog(android.app.Activity r2) {
            boolean r0 = r2.isFinishing()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.isDestroyed()
            if (r0 == 0) goto Le
            return
        Le:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ca.dnamobile.javalauncher.controls.ControlsMain$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.controls.ControlsMain$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public static void throwIfInvalidSignature(android.content.Context r1) {
            boolean r1 = shouldBlockSensitiveAction(r1)
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r0 = "Blocked modified or re-signed DroidBridge Launcher build."
            r1.<init>(r0)
            throw r1
    }

    public static boolean toastAndBlockIfInvalidSignature(android.content.Context r2) {
            boolean r0 = shouldBlockSensitiveAction(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r0 = "App integrity check failed"
            r1 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r0, r1)
            r2.show()
            return r1
    }
}
