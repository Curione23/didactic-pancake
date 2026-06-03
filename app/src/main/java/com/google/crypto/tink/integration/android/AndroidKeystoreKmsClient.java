package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidKeystoreKmsClient implements com.google.crypto.tink.KmsClient {
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 40;
    public static final java.lang.String PREFIX = "android-keystore://";
    private static final java.lang.String TAG = "AndroidKeystoreKmsClient";
    private static final java.lang.Object keyCreationLock = null;
    private java.security.KeyStore keyStore;
    private final java.lang.String keyUri;

    /* JADX INFO: renamed from: com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        java.security.KeyStore keyStore;
        java.lang.String keyUri;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.keyUri = r0
                r2.keyStore = r0
                boolean r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.access$000()
                if (r1 == 0) goto L23
                java.lang.String r1 = "AndroidKeyStore"
                java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.io.IOException -> L1a java.security.GeneralSecurityException -> L1c
                r2.keyStore = r1     // Catch: java.io.IOException -> L1a java.security.GeneralSecurityException -> L1c
                r1.load(r0)     // Catch: java.io.IOException -> L1a java.security.GeneralSecurityException -> L1c
                return
            L1a:
                r0 = move-exception
                goto L1d
            L1c:
                r0 = move-exception
            L1d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
            L23:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "need Android Keystore on Android M or newer"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient build() {
                r2 = this;
                com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder setKeyStore(java.security.KeyStore r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.keyStore = r2
                return r1
            L5:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "val cannot be null"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder setKeyUri(java.lang.String r3) {
                r2 = this;
                if (r3 == 0) goto L13
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r0 = r3.toLowerCase(r0)
                java.lang.String r1 = "android-keystore://"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L13
                r2.keyUri = r3
                return r2
            L13:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "val must start with android-keystore://"
                r3.<init>(r0)
                throw r3
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock = r0
            return
    }

    public AndroidKeystoreKmsClient() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    private AndroidKeystoreKmsClient(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.keyUri
            r1.keyUri = r0
            java.security.KeyStore r2 = r2.keyStore
            r1.keyStore = r2
            return
    }

    /* synthetic */ AndroidKeystoreKmsClient(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder r1, com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public AndroidKeystoreKmsClient(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder
            r0.<init>()
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder r2 = r0.setKeyUri(r2)
            r1.<init>(r2)
            return
    }

    static /* synthetic */ boolean access$000() {
            boolean r0 = isAtLeastM()
            return r0
    }

    static boolean generateKeyIfNotExist(java.lang.String r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            java.lang.Object r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock
            monitor-enter(r1)
            boolean r0 = r0.hasKey(r2)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L14
            generateNewAesGcmKeyWithoutExistenceCheck(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            r2 = 1
            return r2
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            r2 = 0
            return r2
        L17:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public static void generateNewAeadKey(java.lang.String r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            java.lang.Object r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock
            monitor-enter(r1)
            boolean r0 = r0.hasKey(r3)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L13
            generateNewAesGcmKeyWithoutExistenceCheck(r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L23
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L23:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    static void generateNewAesGcmKeyWithoutExistenceCheck(java.lang.String r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "android-keystore://"
            java.lang.String r5 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r0, r5)
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder
            r2 = 3
            r1.<init>(r5, r2)
            r5 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r5 = r1.setKeySize(r5)
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "GCM"
            r4 = 0
            r2[r4] = r3
            android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setBlockModes(r2)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "NoPadding"
            r1[r4] = r2
            android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setEncryptionPaddings(r1)
            android.security.keystore.KeyGenParameterSpec r5 = r5.build()
            r0.init(r5)
            r0.generateKey()
            return
    }

    public static com.google.crypto.tink.Aead getOrGenerateNewAeadKey(java.lang.String r3) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            java.lang.Object r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock
            monitor-enter(r1)
            boolean r2 = r0.hasKey(r3)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L11
            generateNewAesGcmKeyWithoutExistenceCheck(r3)     // Catch: java.lang.Throwable -> L17
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            com.google.crypto.tink.Aead r3 = r0.getAead(r3)
            return r3
        L17:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    private static boolean isAtLeastM() {
            r0 = 1
            return r0
    }

    private static void sleepRandomAmount() {
            double r0 = java.lang.Math.random()
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc
        Lc:
            return
    }

    private static com.google.crypto.tink.Aead validateAead(com.google.crypto.tink.Aead r3) throws java.security.GeneralSecurityException {
            r0 = 10
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            r1 = 0
            byte[] r1 = new byte[r1]
            byte[] r2 = r3.encrypt(r0, r1)
            byte[] r1 = r3.decrypt(r2, r1)
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L18
            return r3
        L18:
            java.security.KeyStoreException r3 = new java.security.KeyStoreException
            java.lang.String r0 = "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result"
            r3.<init>(r0)
            throw r3
    }

    public synchronized void deleteKey(java.lang.String r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r2 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r0, r2)     // Catch: java.lang.Throwable -> Le
            java.security.KeyStore r0 = r1.keyStore     // Catch: java.lang.Throwable -> Le
            r0.deleteEntry(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized boolean doesSupport(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.keyUri     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            monitor-exit(r2)
            return r1
        Le:
            java.lang.String r0 = r2.keyUri     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L21
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            monitor-exit(r2)
            return r1
        L24:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized com.google.crypto.tink.Aead getAead(java.lang.String r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L1e
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Lc
            goto L1e
        Lc:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "this client is bound to %s, cannot load keys bound to %s"
            java.lang.String r2 = r3.keyUri     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r4}     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = java.lang.String.format(r1, r4)     // Catch: java.lang.Throwable -> L31
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L1e:
            com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "android-keystore://"
            java.lang.String r4 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r1, r4)     // Catch: java.lang.Throwable -> L31
            java.security.KeyStore r1 = r3.keyStore     // Catch: java.lang.Throwable -> L31
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.Aead r4 = validateAead(r0)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            return r4
        L31:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r4
    }

    synchronized boolean hasKey(java.lang.String r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r0, r3)     // Catch: java.lang.Throwable -> L34
            java.security.KeyStore r0 = r2.keyStore     // Catch: java.lang.NullPointerException -> Lf java.lang.Throwable -> L34
            boolean r3 = r0.containsAlias(r3)     // Catch: java.lang.NullPointerException -> Lf java.lang.Throwable -> L34
            monitor-exit(r2)
            return r3
        Lf:
            java.lang.String r0 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.TAG     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L34
            sleepRandomAmount()     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L34
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L34
            r2.keyStore = r0     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L34
            r1 = 0
            r0.load(r1)     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L34
            java.security.KeyStore r0 = r2.keyStore     // Catch: java.lang.Throwable -> L34
            boolean r3 = r0.containsAlias(r3)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return r3
        L2d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L34
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r3
    }

    @Override // com.google.crypto.tink.KmsClient
    public com.google.crypto.tink.KmsClient withCredentials(java.lang.String r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r1 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r1.<init>()
            return r1
    }

    @Override // com.google.crypto.tink.KmsClient
    public com.google.crypto.tink.KmsClient withDefaultCredentials() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            return r0
    }
}
