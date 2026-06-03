package androidx.core.hardware.fingerprint;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class FingerprintManagerCompat {
    private final android.content.Context mContext;


    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void authenticate(java.lang.Object r6, java.lang.Object r7, android.os.CancellationSignal r8, int r9, java.lang.Object r10, android.os.Handler r11) {
                r0 = r6
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                r1 = r7
                android.hardware.fingerprint.FingerprintManager$CryptoObject r1 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r1
                r4 = r10
                android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r4 = (android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) r4
                r2 = r8
                r3 = r9
                r5 = r11
                r0.authenticate(r1, r2, r3, r4, r5)
                return
        }

        static android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager$AuthenticationResult r0 = (android.hardware.fingerprint.FingerprintManager.AuthenticationResult) r0
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = r0.getCryptoObject()
                return r0
        }

        public static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(android.content.Context r2) {
                android.content.pm.PackageManager r0 = r2.getPackageManager()
                java.lang.String r1 = "android.hardware.fingerprint"
                boolean r0 = r0.hasSystemFeature(r1)
                if (r0 == 0) goto L15
                java.lang.Class<android.hardware.fingerprint.FingerprintManager> r0 = android.hardware.fingerprint.FingerprintManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                android.hardware.fingerprint.FingerprintManager r2 = (android.hardware.fingerprint.FingerprintManager) r2
                return r2
            L15:
                r2 = 0
                return r2
        }

        static boolean hasEnrolledFingerprints(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.hasEnrolledFingerprints()
                return r0
        }

        static boolean isHardwareDetected(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.isHardwareDetected()
                return r0
        }

        public static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject unwrapCryptoObject(java.lang.Object r2) {
                android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r2
                r0 = 0
                if (r2 != 0) goto L6
                return r0
            L6:
                javax.crypto.Cipher r1 = r2.getCipher()
                if (r1 == 0) goto L16
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                javax.crypto.Cipher r2 = r2.getCipher()
                r0.<init>(r2)
                return r0
            L16:
                java.security.Signature r1 = r2.getSignature()
                if (r1 == 0) goto L26
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                java.security.Signature r2 = r2.getSignature()
                r0.<init>(r2)
                return r0
            L26:
                javax.crypto.Mac r1 = r2.getMac()
                if (r1 == 0) goto L35
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                javax.crypto.Mac r2 = r2.getMac()
                r0.<init>(r2)
            L35:
                return r0
        }

        public static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r2) {
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                javax.crypto.Cipher r1 = r2.getCipher()
                if (r1 == 0) goto L14
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Cipher r2 = r2.getCipher()
                r0.<init>(r2)
                return r0
            L14:
                java.security.Signature r1 = r2.getSignature()
                if (r1 == 0) goto L24
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                java.security.Signature r2 = r2.getSignature()
                r0.<init>(r2)
                return r0
            L24:
                javax.crypto.Mac r1 = r2.getMac()
                if (r1 == 0) goto L33
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Mac r2 = r2.getMac()
                r0.<init>(r2)
            L33:
                return r0
        }
    }

    public static abstract class AuthenticationCallback {
        public AuthenticationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAuthenticationError(int r1, java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        public void onAuthenticationFailed() {
                r0 = this;
                return
        }

        public void onAuthenticationHelp(int r1, java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        public void onAuthenticationSucceeded(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult r1) {
                r0 = this;
                return
        }
    }

    public static final class AuthenticationResult {
        private final androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject mCryptoObject;

        public AuthenticationResult(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r1) {
                r0 = this;
                r0.<init>()
                r0.mCryptoObject = r1
                return
        }

        public androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject getCryptoObject() {
                r1 = this;
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = r1.mCryptoObject
                return r0
        }
    }

    public static class CryptoObject {
        private final javax.crypto.Cipher mCipher;
        private final javax.crypto.Mac mMac;
        private final java.security.Signature mSignature;

        public CryptoObject(java.security.Signature r1) {
                r0 = this;
                r0.<init>()
                r0.mSignature = r1
                r1 = 0
                r0.mCipher = r1
                r0.mMac = r1
                return
        }

        public CryptoObject(javax.crypto.Cipher r1) {
                r0 = this;
                r0.<init>()
                r0.mCipher = r1
                r1 = 0
                r0.mSignature = r1
                r0.mMac = r1
                return
        }

        public CryptoObject(javax.crypto.Mac r1) {
                r0 = this;
                r0.<init>()
                r0.mMac = r1
                r1 = 0
                r0.mCipher = r1
                r0.mSignature = r1
                return
        }

        public javax.crypto.Cipher getCipher() {
                r1 = this;
                javax.crypto.Cipher r0 = r1.mCipher
                return r0
        }

        public javax.crypto.Mac getMac() {
                r1 = this;
                javax.crypto.Mac r0 = r1.mMac
                return r0
        }

        public java.security.Signature getSignature() {
                r1 = this;
                java.security.Signature r0 = r1.mSignature
                return r0
        }
    }

    private FingerprintManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    public static androidx.core.hardware.fingerprint.FingerprintManagerCompat from(android.content.Context r1) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat
            r0.<init>(r1)
            return r0
    }

    private static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(android.content.Context r0) {
            android.hardware.fingerprint.FingerprintManager r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.getFingerprintManagerOrNull(r0)
            return r0
    }

    static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager.CryptoObject r0) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.unwrapCryptoObject(r0)
            return r0
    }

    private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r1) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat$1 r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$1
            r0.<init>(r1)
            return r0
    }

    private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r0) {
            android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.wrapCryptoObject(r0)
            return r0
    }

    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r8, int r9, android.os.CancellationSignal r10, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r11, android.os.Handler r12) {
            r7 = this;
            android.content.Context r0 = r7.mContext
            android.hardware.fingerprint.FingerprintManager r1 = getFingerprintManagerOrNull(r0)
            if (r1 == 0) goto L16
            android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = wrapCryptoObject(r8)
            android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r5 = wrapCallback(r11)
            r3 = r10
            r4 = r9
            r6 = r12
            androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.authenticate(r1, r2, r3, r4, r5, r6)
        L16:
            return
    }

    @java.lang.Deprecated
    public void authenticate(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r7, int r8, androidx.core.os.CancellationSignal r9, androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r10, android.os.Handler r11) {
            r6 = this;
            if (r9 == 0) goto L9
            java.lang.Object r9 = r9.getCancellationSignalObject()
            android.os.CancellationSignal r9 = (android.os.CancellationSignal) r9
            goto La
        L9:
            r9 = 0
        La:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.authenticate(r1, r2, r3, r4, r5)
            return
    }

    public boolean hasEnrolledFingerprints() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L10
            boolean r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.hasEnrolledFingerprints(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean isHardwareDetected() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L10
            boolean r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.isHardwareDetected(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }
}
