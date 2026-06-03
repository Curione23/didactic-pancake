package com.nide8.login2.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/util/KeyUtils.class */
public final class KeyUtils {
    public static byte[] decodePEMPublicKey(java.lang.String r6) throws java.lang.IllegalArgumentException {
            r0 = r6
            java.lang.String r0 = com.nide8.login2.util.IOUtils.removeNewLines(r0)
            r6 = r0
            java.lang.String r0 = "-----BEGIN PUBLIC KEY-----"
            r7 = r0
            java.lang.String r0 = "-----END PUBLIC KEY-----"
            r8 = r0
            r0 = r6
            java.lang.String r1 = "-----BEGIN PUBLIC KEY-----"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L37
            r0 = r6
            java.lang.String r1 = "-----END PUBLIC KEY-----"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L37
            java.util.Base64$Decoder r0 = java.util.Base64.getDecoder()
            r1 = r6
            java.lang.String r2 = "-----BEGIN PUBLIC KEY-----"
            int r2 = r2.length()
            r3 = r6
            int r3 = r3.length()
            java.lang.String r4 = "-----END PUBLIC KEY-----"
            int r4 = r4.length()
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            byte[] r0 = r0.decode(r1)
            return r0
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Bad key format"
            r1.<init>(r2)
            throw r0
    }

    public static java.security.PublicKey parseX509PublicKey(byte[] r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            return r0
    }

    public static java.security.PublicKey parseSignaturePublicKey(java.lang.String r3) throws java.io.UncheckedIOException {
            r0 = r3
            byte[] r0 = decodePEMPublicKey(r0)     // Catch: java.lang.Throwable -> L8
            java.security.PublicKey r0 = parseX509PublicKey(r0)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r4 = move-exception
            java.lang.String r0 = "Bad signature public key"
            r1 = r4
            java.io.UncheckedIOException r0 = com.nide8.login2.util.IOUtils.newUncheckedIOException(r0, r1)
            throw r0
    }

    private KeyUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
