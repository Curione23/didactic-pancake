package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidKeysetManager {
    private static final java.lang.String TAG = "AndroidKeysetManager";
    private static final java.lang.Object lock = null;
    private com.google.crypto.tink.KeysetManager keysetManager;
    private final com.google.crypto.tink.Aead masterAead;
    private final com.google.crypto.tink.KeysetWriter writer;

    /* JADX INFO: renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static final class Builder {
        private android.content.Context context;
        private com.google.crypto.tink.KeyTemplate keyTemplate;
        private com.google.crypto.tink.KeysetManager keysetManager;
        private java.lang.String keysetName;
        private com.google.crypto.tink.Aead masterAead;
        private java.lang.String masterKeyUri;
        private java.lang.String prefFileName;
        private boolean useKeystore;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.context = r0
                r2.keysetName = r0
                r2.prefFileName = r0
                r2.masterKeyUri = r0
                r2.masterAead = r0
                r1 = 1
                r2.useKeystore = r1
                r2.keyTemplate = r0
                return
        }

        static /* synthetic */ android.content.Context access$000(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r0) {
                android.content.Context r0 = r0.context
                return r0
        }

        static /* synthetic */ java.lang.String access$100(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r0) {
                java.lang.String r0 = r0.keysetName
                return r0
        }

        static /* synthetic */ java.lang.String access$200(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r0) {
                java.lang.String r0 = r0.prefFileName
                return r0
        }

        static /* synthetic */ com.google.crypto.tink.Aead access$300(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r0) {
                com.google.crypto.tink.Aead r0 = r0.masterAead
                return r0
        }

        static /* synthetic */ com.google.crypto.tink.KeysetManager access$400(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r0) {
                com.google.crypto.tink.KeysetManager r0 = r0.keysetManager
                return r0
        }

        private com.google.crypto.tink.KeysetManager generateKeysetAndWriteToPrefs() throws java.security.GeneralSecurityException, java.io.IOException {
                r5 = this;
                com.google.crypto.tink.KeyTemplate r0 = r5.keyTemplate
                if (r0 == 0) goto L44
                com.google.crypto.tink.KeysetManager r0 = com.google.crypto.tink.KeysetManager.withEmptyKeyset()
                com.google.crypto.tink.KeyTemplate r1 = r5.keyTemplate
                com.google.crypto.tink.KeysetManager r0 = r0.add(r1)
                com.google.crypto.tink.KeysetHandle r1 = r0.getKeysetHandle()
                com.google.crypto.tink.proto.KeysetInfo r1 = r1.getKeysetInfo()
                r2 = 0
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r1 = r1.getKeyInfo(r2)
                int r1 = r1.getKeyId()
                com.google.crypto.tink.KeysetManager r0 = r0.setPrimary(r1)
                com.google.crypto.tink.integration.android.SharedPrefKeysetWriter r1 = new com.google.crypto.tink.integration.android.SharedPrefKeysetWriter
                android.content.Context r2 = r5.context
                java.lang.String r3 = r5.keysetName
                java.lang.String r4 = r5.prefFileName
                r1.<init>(r2, r3, r4)
                com.google.crypto.tink.Aead r2 = r5.masterAead
                if (r2 == 0) goto L3c
                com.google.crypto.tink.KeysetHandle r2 = r0.getKeysetHandle()
                com.google.crypto.tink.Aead r3 = r5.masterAead
                r2.write(r1, r3)
                goto L43
            L3c:
                com.google.crypto.tink.KeysetHandle r2 = r0.getKeysetHandle()
                com.google.crypto.tink.CleartextKeysetHandle.write(r2, r1)
            L43:
                return r0
            L44:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "cannot read or generate keyset"
                r0.<init>(r1)
                throw r0
        }

        private static byte[] readKeysetFromPrefs(android.content.Context r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException {
                if (r2 == 0) goto L2f
                android.content.Context r1 = r1.getApplicationContext()
                if (r3 != 0) goto Ld
                android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
                goto L12
            Ld:
                r0 = 0
                android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r0)
            L12:
                r3 = 0
                java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> L1f
                if (r1 != 0) goto L1a
                return r3
            L1a:
                byte[] r1 = com.google.crypto.tink.subtle.Hex.decode(r1)     // Catch: java.lang.Throwable -> L1f
                return r1
            L1f:
                java.io.CharConversionException r1 = new java.io.CharConversionException
                java.lang.String r3 = "can't read keyset; the pref value %s is not a valid hex string"
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                java.lang.String r2 = java.lang.String.format(r3, r2)
                r1.<init>(r2)
                throw r1
            L2f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "keysetName cannot be null"
                r1.<init>(r2)
                throw r1
        }

        private com.google.crypto.tink.KeysetManager readKeysetInCleartext(byte[] r1) throws java.security.GeneralSecurityException, java.io.IOException {
                r0 = this;
                com.google.crypto.tink.KeysetReader r1 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r1)
                com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.CleartextKeysetHandle.read(r1)
                com.google.crypto.tink.KeysetManager r1 = com.google.crypto.tink.KeysetManager.withKeysetHandle(r1)
                return r1
        }

        private com.google.crypto.tink.KeysetManager readMasterkeyDecryptAndParseKeyset(byte[] r4) throws java.security.GeneralSecurityException, java.io.IOException {
                r3 = this;
                com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient     // Catch: java.security.ProviderException -> L25 java.security.GeneralSecurityException -> L27
                r0.<init>()     // Catch: java.security.ProviderException -> L25 java.security.GeneralSecurityException -> L27
                java.lang.String r1 = r3.masterKeyUri     // Catch: java.security.ProviderException -> L25 java.security.GeneralSecurityException -> L27
                com.google.crypto.tink.Aead r0 = r0.getAead(r1)     // Catch: java.security.ProviderException -> L25 java.security.GeneralSecurityException -> L27
                r3.masterAead = r0     // Catch: java.security.ProviderException -> L25 java.security.GeneralSecurityException -> L27
                com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r4)     // Catch: java.security.GeneralSecurityException -> L1c java.io.IOException -> L1e
                com.google.crypto.tink.Aead r1 = r3.masterAead     // Catch: java.security.GeneralSecurityException -> L1c java.io.IOException -> L1e
                com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.read(r0, r1)     // Catch: java.security.GeneralSecurityException -> L1c java.io.IOException -> L1e
                com.google.crypto.tink.KeysetManager r4 = com.google.crypto.tink.KeysetManager.withKeysetHandle(r0)     // Catch: java.security.GeneralSecurityException -> L1c java.io.IOException -> L1e
                return r4
            L1c:
                r0 = move-exception
                goto L1f
            L1e:
                r0 = move-exception
            L1f:
                com.google.crypto.tink.KeysetManager r4 = r3.readKeysetInCleartext(r4)     // Catch: java.io.IOException -> L24
                return r4
            L24:
                throw r0
            L25:
                r0 = move-exception
                goto L28
            L27:
                r0 = move-exception
            L28:
                com.google.crypto.tink.KeysetManager r4 = r3.readKeysetInCleartext(r4)     // Catch: java.io.IOException -> L36
                java.lang.String r1 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()     // Catch: java.io.IOException -> L36
                java.lang.String r2 = "cannot use Android Keystore, it'll be disabled"
                android.util.Log.w(r1, r2, r0)     // Catch: java.io.IOException -> L36
                return r4
            L36:
                throw r0
        }

        private com.google.crypto.tink.Aead readOrGenerateNewMasterKey() throws java.security.GeneralSecurityException {
                r5 = this;
                java.lang.String r0 = "cannot use Android Keystore, it'll be disabled"
                boolean r1 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$700()
                r2 = 0
                if (r1 != 0) goto L13
                java.lang.String r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()
                java.lang.String r1 = "Android Keystore requires at least Android M"
                android.util.Log.w(r0, r1)
                return r2
            L13:
                com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r1 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
                r1.<init>()
                java.lang.String r3 = r5.masterKeyUri     // Catch: java.security.ProviderException -> L44 java.security.GeneralSecurityException -> L46
                boolean r3 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.generateKeyIfNotExist(r3)     // Catch: java.security.ProviderException -> L44 java.security.GeneralSecurityException -> L46
                java.lang.String r4 = r5.masterKeyUri     // Catch: java.security.ProviderException -> L25 java.security.GeneralSecurityException -> L27
                com.google.crypto.tink.Aead r0 = r1.getAead(r4)     // Catch: java.security.ProviderException -> L25 java.security.GeneralSecurityException -> L27
                return r0
            L25:
                r1 = move-exception
                goto L28
            L27:
                r1 = move-exception
            L28:
                if (r3 == 0) goto L32
                java.lang.String r3 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()
                android.util.Log.w(r3, r0, r1)
                return r2
            L32:
                java.security.KeyStoreException r0 = new java.security.KeyStoreException
                java.lang.String r2 = r5.masterKeyUri
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                java.lang.String r3 = "the master key %s exists but is unusable"
                java.lang.String r2 = java.lang.String.format(r3, r2)
                r0.<init>(r2, r1)
                throw r0
            L44:
                r1 = move-exception
                goto L47
            L46:
                r1 = move-exception
            L47:
                java.lang.String r3 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()
                android.util.Log.w(r3, r0, r1)
                return r2
        }

        public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager build() throws java.security.GeneralSecurityException, java.io.IOException {
                r4 = this;
                monitor-enter(r4)
                java.lang.String r0 = r4.keysetName     // Catch: java.lang.Throwable -> L53
                if (r0 == 0) goto L4b
                java.lang.Object r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$600()     // Catch: java.lang.Throwable -> L53
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L53
                android.content.Context r1 = r4.context     // Catch: java.lang.Throwable -> L48
                java.lang.String r2 = r4.keysetName     // Catch: java.lang.Throwable -> L48
                java.lang.String r3 = r4.prefFileName     // Catch: java.lang.Throwable -> L48
                byte[] r1 = readKeysetFromPrefs(r1, r2, r3)     // Catch: java.lang.Throwable -> L48
                if (r1 != 0) goto L27
                java.lang.String r1 = r4.masterKeyUri     // Catch: java.lang.Throwable -> L48
                if (r1 == 0) goto L20
                com.google.crypto.tink.Aead r1 = r4.readOrGenerateNewMasterKey()     // Catch: java.lang.Throwable -> L48
                r4.masterAead = r1     // Catch: java.lang.Throwable -> L48
            L20:
                com.google.crypto.tink.KeysetManager r1 = r4.generateKeysetAndWriteToPrefs()     // Catch: java.lang.Throwable -> L48
                r4.keysetManager = r1     // Catch: java.lang.Throwable -> L48
                goto L3f
            L27:
                java.lang.String r2 = r4.masterKeyUri     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L39
                boolean r2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$700()     // Catch: java.lang.Throwable -> L48
                if (r2 != 0) goto L32
                goto L39
            L32:
                com.google.crypto.tink.KeysetManager r1 = r4.readMasterkeyDecryptAndParseKeyset(r1)     // Catch: java.lang.Throwable -> L48
                r4.keysetManager = r1     // Catch: java.lang.Throwable -> L48
                goto L3f
            L39:
                com.google.crypto.tink.KeysetManager r1 = r4.readKeysetInCleartext(r1)     // Catch: java.lang.Throwable -> L48
                r4.keysetManager = r1     // Catch: java.lang.Throwable -> L48
            L3f:
                com.google.crypto.tink.integration.android.AndroidKeysetManager r1 = new com.google.crypto.tink.integration.android.AndroidKeysetManager     // Catch: java.lang.Throwable -> L48
                r2 = 0
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r4)
                return r1
            L48:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                throw r1     // Catch: java.lang.Throwable -> L53
            L4b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L53
                java.lang.String r1 = "keysetName cannot be null"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
                throw r0     // Catch: java.lang.Throwable -> L53
            L53:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
                throw r0
        }

        @java.lang.Deprecated
        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder doNotUseKeystore() {
                r1 = this;
                r0 = 0
                r1.masterKeyUri = r0
                r0 = 0
                r1.useKeystore = r0
                return r1
        }

        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withKeyTemplate(com.google.crypto.tink.KeyTemplate r1) {
                r0 = this;
                r0.keyTemplate = r1
                return r0
        }

        @java.lang.Deprecated
        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate r3) {
                r2 = this;
                java.lang.String r0 = r3.getTypeUrl()
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.getValue()
                byte[] r1 = r1.toByteArray()
                com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$500(r3)
                com.google.crypto.tink.KeyTemplate r3 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r3)
                r2.keyTemplate = r3
                return r2
        }

        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withMasterKeyUri(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "android-keystore://"
                boolean r0 = r2.startsWith(r0)
                if (r0 == 0) goto L17
                boolean r0 = r1.useKeystore
                if (r0 == 0) goto Lf
                r1.masterKeyUri = r2
                return r1
            Lf:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "cannot call withMasterKeyUri() after calling doNotUseKeystore()"
                r2.<init>(r0)
                throw r2
            L17:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "key URI must start with android-keystore://"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withSharedPref(android.content.Context r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException {
                r0 = this;
                if (r1 == 0) goto L13
                if (r2 == 0) goto Lb
                r0.context = r1
                r0.keysetName = r2
                r0.prefFileName = r3
                return r0
            Lb:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "need a keyset name"
                r1.<init>(r2)
                throw r1
            L13:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "need an Android context"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.crypto.tink.integration.android.AndroidKeysetManager.lock = r0
            return
    }

    private AndroidKeysetManager(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r5) {
            r4 = this;
            r4.<init>()
            com.google.crypto.tink.integration.android.SharedPrefKeysetWriter r0 = new com.google.crypto.tink.integration.android.SharedPrefKeysetWriter
            android.content.Context r1 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$000(r5)
            java.lang.String r2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$100(r5)
            java.lang.String r3 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$200(r5)
            r0.<init>(r1, r2, r3)
            r4.writer = r0
            com.google.crypto.tink.Aead r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$300(r5)
            r4.masterAead = r0
            com.google.crypto.tink.KeysetManager r5 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$400(r5)
            r4.keysetManager = r5
            return
    }

    /* synthetic */ AndroidKeysetManager(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r1, com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ com.google.crypto.tink.KeyTemplate.OutputPrefixType access$500(com.google.crypto.tink.proto.OutputPrefixType r0) {
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = fromProto(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object access$600() {
            java.lang.Object r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.lock
            return r0
    }

    static /* synthetic */ boolean access$700() {
            boolean r0 = isAtLeastM()
            return r0
    }

    static /* synthetic */ java.lang.String access$900() {
            java.lang.String r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.TAG
            return r0
    }

    private static com.google.crypto.tink.KeyTemplate.OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType r1) {
            int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L22
            r0 = 3
            if (r1 == r0) goto L1f
            r0 = 4
            if (r1 != r0) goto L17
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY
            return r1
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown output prefix type"
            r1.<init>(r0)
            throw r1
        L1f:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            return r1
        L22:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY
            return r1
        L25:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r1 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            return r1
    }

    private static boolean isAtLeastM() {
            r0 = 1
            return r0
    }

    private boolean shouldUseKeystore() {
            r1 = this;
            com.google.crypto.tink.Aead r0 = r1.masterAead
            if (r0 == 0) goto Lc
            boolean r0 = isAtLeastM()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private void write(com.google.crypto.tink.KeysetManager r3) throws java.security.GeneralSecurityException {
            r2 = this;
            boolean r0 = r2.shouldUseKeystore()     // Catch: java.io.IOException -> L1c
            if (r0 == 0) goto L12
            com.google.crypto.tink.KeysetHandle r3 = r3.getKeysetHandle()     // Catch: java.io.IOException -> L1c
            com.google.crypto.tink.KeysetWriter r0 = r2.writer     // Catch: java.io.IOException -> L1c
            com.google.crypto.tink.Aead r1 = r2.masterAead     // Catch: java.io.IOException -> L1c
            r3.write(r0, r1)     // Catch: java.io.IOException -> L1c
            goto L1b
        L12:
            com.google.crypto.tink.KeysetHandle r3 = r3.getKeysetHandle()     // Catch: java.io.IOException -> L1c
            com.google.crypto.tink.KeysetWriter r0 = r2.writer     // Catch: java.io.IOException -> L1c
            com.google.crypto.tink.CleartextKeysetHandle.write(r3, r0)     // Catch: java.io.IOException -> L1c
        L1b:
            return
        L1c:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r3)
            throw r0
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager add(com.google.crypto.tink.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.add(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.add(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager delete(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.delete(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager destroy(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.destroy(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager disable(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.disable(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager enable(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.enable(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized com.google.crypto.tink.KeysetHandle getKeysetHandle() throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L9
            com.google.crypto.tink.KeysetHandle r0 = r0.getKeysetHandle()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized boolean isUsingKeystore() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.shouldUseKeystore()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager promote(int r1) throws java.security.GeneralSecurityException {
            r0 = this;
            monitor-enter(r0)
            com.google.crypto.tink.integration.android.AndroidKeysetManager r1 = r0.setPrimary(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.rotate(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager setPrimary(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> Le
            com.google.crypto.tink.KeysetManager r2 = r0.setPrimary(r2)     // Catch: java.lang.Throwable -> Le
            r1.keysetManager = r2     // Catch: java.lang.Throwable -> Le
            r1.write(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }
}
