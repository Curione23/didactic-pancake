package androidx.security.crypto;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class MasterKeys {
    public static final android.security.keystore.KeyGenParameterSpec AES256_GCM_SPEC = null;
    private static final java.lang.String ANDROID_KEYSTORE = "AndroidKeyStore";
    static final int KEY_SIZE = 256;
    static final java.lang.String MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    private static final java.lang.Object sLock = null;

    static {
            java.lang.String r0 = "_androidx_security_master_key_"
            android.security.keystore.KeyGenParameterSpec r0 = createAES256GCMKeyGenParameterSpec(r0)
            androidx.security.crypto.MasterKeys.AES256_GCM_SPEC = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.security.crypto.MasterKeys.sLock = r0
            return
    }

    private MasterKeys() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.security.keystore.KeyGenParameterSpec createAES256GCMKeyGenParameterSpec(java.lang.String r4) {
            android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
            r1 = 3
            r0.<init>(r4, r1)
            r4 = 1
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r2 = "GCM"
            r3 = 0
            r1[r3] = r2
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setBlockModes(r1)
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r1 = "NoPadding"
            r4[r3] = r1
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r0.setEncryptionPaddings(r4)
            r0 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r4.setKeySize(r0)
            android.security.keystore.KeyGenParameterSpec r4 = r4.build()
            return r4
    }

    private static void generateKey(android.security.keystore.KeyGenParameterSpec r2) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)     // Catch: java.security.ProviderException -> Lf
            r0.init(r2)     // Catch: java.security.ProviderException -> Lf
            r0.generateKey()     // Catch: java.security.ProviderException -> Lf
            return
        Lf:
            r2 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1, r2)
            throw r0
    }

    public static java.lang.String getOrCreate(android.security.keystore.KeyGenParameterSpec r2) throws java.security.GeneralSecurityException, java.io.IOException {
            validate(r2)
            java.lang.Object r0 = androidx.security.crypto.MasterKeys.sLock
            monitor-enter(r0)
            java.lang.String r1 = r2.getKeystoreAlias()     // Catch: java.lang.Throwable -> L19
            boolean r1 = keyExists(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L13
            generateKey(r2)     // Catch: java.lang.Throwable -> L19
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.getKeystoreAlias()
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    private static boolean keyExists(java.lang.String r2) throws java.security.GeneralSecurityException, java.io.IOException {
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            r1 = 0
            r0.load(r1)
            boolean r2 = r0.containsAlias(r2)
            return r2
    }

    static void validate(android.security.keystore.KeyGenParameterSpec r5) {
            int r0 = r5.getKeySize()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L9a
            java.lang.String[] r0 = r5.getBlockModes()
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "GCM"
            r4 = 0
            r2[r4] = r3
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L7d
            int r0 = r5.getPurposes()
            r2 = 3
            if (r0 != r2) goto L64
            java.lang.String[] r0 = r5.getEncryptionPaddings()
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "NoPadding"
            r2[r4] = r3
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L47
            boolean r0 = r5.isUserAuthenticationRequired()
            if (r0 == 0) goto L46
            int r5 = r5.getUserAuthenticationValidityDurationSeconds()
            if (r5 < r1) goto L3e
            goto L46
        L3e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)"
            r5.<init>(r0)
            throw r5
        L46:
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid padding mode, want NoPadding got "
            r1.<init>(r2)
            java.lang.String[] r5 = r5.getEncryptionPaddings()
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L64:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got "
            r1.<init>(r2)
            int r5 = r5.getPurposes()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L7d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid block mode, want GCM got "
            r1.<init>(r2)
            java.lang.String[] r5 = r5.getBlockModes()
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L9a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid key size, want 256 bits got "
            r1.<init>(r2)
            int r5 = r5.getKeySize()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = " bits"
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }
}
