package androidx.security.crypto;

/* JADX INFO: loaded from: classes.dex */
public final class EncryptedSharedPreferences implements android.content.SharedPreferences {
    private static final java.lang.String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final java.lang.String NULL_VALUE = "__NULL__";
    private static final java.lang.String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final java.lang.String mFileName;
    final com.google.crypto.tink.DeterministicAead mKeyDeterministicAead;
    final java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences.OnSharedPreferenceChangeListener> mListeners;
    final java.lang.String mMasterKeyAlias;
    final android.content.SharedPreferences mSharedPreferences;
    final com.google.crypto.tink.Aead mValueAead;

    /* JADX INFO: renamed from: androidx.security.crypto.EncryptedSharedPreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = null;

        static {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    private static final class Editor implements android.content.SharedPreferences.Editor {
        private final java.util.concurrent.atomic.AtomicBoolean mClearRequested;
        private final android.content.SharedPreferences.Editor mEditor;
        private final androidx.security.crypto.EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final java.util.List<java.lang.String> mKeysChanged;

        Editor(androidx.security.crypto.EncryptedSharedPreferences r3, android.content.SharedPreferences.Editor r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.mClearRequested = r0
                r2.mEncryptedSharedPreferences = r3
                r2.mEditor = r4
                java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
                r3.<init>()
                r2.mKeysChanged = r3
                return
        }

        private void clearKeysIfNeeded() {
                r4 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.mClearRequested
                r1 = 0
                boolean r0 = r0.getAndSet(r1)
                if (r0 == 0) goto L3f
                androidx.security.crypto.EncryptedSharedPreferences r0 = r4.mEncryptedSharedPreferences
                java.util.Map r0 = r0.getAll()
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3f
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.List<java.lang.String> r2 = r4.mKeysChanged
                boolean r2 = r2.contains(r1)
                if (r2 != 0) goto L17
                androidx.security.crypto.EncryptedSharedPreferences r2 = r4.mEncryptedSharedPreferences
                boolean r2 = r2.isReservedKey(r1)
                if (r2 != 0) goto L17
                android.content.SharedPreferences$Editor r2 = r4.mEditor
                androidx.security.crypto.EncryptedSharedPreferences r3 = r4.mEncryptedSharedPreferences
                java.lang.String r1 = r3.encryptKey(r1)
                r2.remove(r1)
                goto L17
            L3f:
                return
        }

        private void notifyListeners() {
                r5 = this;
                androidx.security.crypto.EncryptedSharedPreferences r0 = r5.mEncryptedSharedPreferences
                java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r0.mListeners
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r0.next()
                android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r1
                java.util.List<java.lang.String> r2 = r5.mKeysChanged
                java.util.Iterator r2 = r2.iterator()
            L1a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L8
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.security.crypto.EncryptedSharedPreferences r4 = r5.mEncryptedSharedPreferences
                r1.onSharedPreferenceChanged(r4, r3)
                goto L1a
            L2c:
                return
        }

        private void putEncryptedObject(java.lang.String r3, byte[] r4) {
                r2 = this;
                androidx.security.crypto.EncryptedSharedPreferences r0 = r2.mEncryptedSharedPreferences
                boolean r0 = r0.isReservedKey(r3)
                if (r0 != 0) goto L3f
                java.util.List<java.lang.String> r0 = r2.mKeysChanged
                r0.add(r3)
                if (r3 != 0) goto L11
                java.lang.String r3 = "__NULL__"
            L11:
                androidx.security.crypto.EncryptedSharedPreferences r0 = r2.mEncryptedSharedPreferences     // Catch: java.security.GeneralSecurityException -> L25
                android.util.Pair r3 = r0.encryptKeyValuePair(r3, r4)     // Catch: java.security.GeneralSecurityException -> L25
                android.content.SharedPreferences$Editor r4 = r2.mEditor     // Catch: java.security.GeneralSecurityException -> L25
                java.lang.Object r0 = r3.first     // Catch: java.security.GeneralSecurityException -> L25
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.security.GeneralSecurityException -> L25
                java.lang.Object r3 = r3.second     // Catch: java.security.GeneralSecurityException -> L25
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.security.GeneralSecurityException -> L25
                r4.putString(r0, r3)     // Catch: java.security.GeneralSecurityException -> L25
                return
            L25:
                r3 = move-exception
                java.lang.SecurityException r4 = new java.lang.SecurityException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Could not encrypt data: "
                r0.<init>(r1)
                java.lang.String r1 = r3.getMessage()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0, r3)
                throw r4
            L3f:
                java.lang.SecurityException r4 = new java.lang.SecurityException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r0 = " is a reserved key for the encryption keyset."
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
                r1 = this;
                r1.clearKeysIfNeeded()
                android.content.SharedPreferences$Editor r0 = r1.mEditor
                r0.apply()
                r1.notifyListeners()
                java.util.List<java.lang.String> r0 = r1.mKeysChanged
                r0.clear()
                return
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor clear() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.mClearRequested
                r1 = 1
                r0.set(r1)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
                r2 = this;
                r2.clearKeysIfNeeded()
                android.content.SharedPreferences$Editor r0 = r2.mEditor     // Catch: java.lang.Throwable -> L12
                boolean r0 = r0.commit()     // Catch: java.lang.Throwable -> L12
                r2.notifyListeners()
                java.util.List<java.lang.String> r1 = r2.mKeysChanged
                r1.clear()
                return r0
            L12:
                r0 = move-exception
                r2.notifyListeners()
                java.util.List<java.lang.String> r1 = r2.mKeysChanged
                r1.clear()
                throw r0
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String r3, boolean r4) {
                r2 = this;
                r0 = 5
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.put(r4)
                byte[] r4 = r0.array()
                r2.putEncryptedObject(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putFloat(java.lang.String r3, float r4) {
                r2 = this;
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.putFloat(r4)
                byte[] r4 = r0.array()
                r2.putEncryptedObject(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putInt(java.lang.String r3, int r4) {
                r2 = this;
                r0 = 8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.putInt(r4)
                byte[] r4 = r0.array()
                r2.putEncryptedObject(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putLong(java.lang.String r3, long r4) {
                r2 = this;
                r0 = 12
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG
                int r1 = r1.getId()
                r0.putInt(r1)
                r0.putLong(r4)
                byte[] r4 = r0.array()
                r2.putEncryptedObject(r3, r4)
                return r2
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putString(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                if (r5 != 0) goto L4
                java.lang.String r5 = "__NULL__"
            L4:
                java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r5 = r5.getBytes(r0)
                int r0 = r5.length
                int r1 = r0 + 8
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r2 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING
                int r2 = r2.getId()
                r1.putInt(r2)
                r1.putInt(r0)
                r1.put(r5)
                byte[] r5 = r1.array()
                r3.putEncryptedObject(r4, r5)
                return r3
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
                r4 = this;
                if (r6 != 0) goto Lc
                androidx.collection.ArraySet r6 = new androidx.collection.ArraySet
                r6.<init>()
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            Lc:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L1f:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L37
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L1f
            L37:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET
                int r1 = r1.getId()
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L4a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L4a
            L5e:
                byte[] r6 = r6.array()
                r4.putEncryptedObject(r5, r6)
                return r4
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor remove(java.lang.String r3) {
                r2 = this;
                androidx.security.crypto.EncryptedSharedPreferences r0 = r2.mEncryptedSharedPreferences
                boolean r0 = r0.isReservedKey(r3)
                if (r0 != 0) goto L19
                android.content.SharedPreferences$Editor r0 = r2.mEditor
                androidx.security.crypto.EncryptedSharedPreferences r1 = r2.mEncryptedSharedPreferences
                java.lang.String r1 = r1.encryptKey(r3)
                r0.remove(r1)
                java.util.List<java.lang.String> r0 = r2.mKeysChanged
                r0.add(r3)
                return r2
            L19:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r3 = r1.append(r3)
                java.lang.String r1 = " is a reserved key for the encryption keyset."
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }
    }

    private enum EncryptedType extends java.lang.Enum<androidx.security.crypto.EncryptedSharedPreferences.EncryptedType> {
        private static final /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[] $VALUES = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType BOOLEAN = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType FLOAT = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType INT = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType LONG = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType STRING = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.EncryptedType STRING_SET = null;
        private final int mId;

        private static /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[] $values() {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r2 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r3 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r4 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r5 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = new androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "STRING"
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "STRING_SET"
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "INT"
                r2 = 2
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "LONG"
                r2 = 3
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "FLOAT"
                r2 = 4
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r0 = new androidx.security.crypto.EncryptedSharedPreferences$EncryptedType
                java.lang.String r1 = "BOOLEAN"
                r2 = 5
                r0.<init>(r1, r2, r2)
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN = r0
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = $values()
                androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.$VALUES = r0
                return
        }

        EncryptedType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mId = r3
                return
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.EncryptedType fromId(int r1) {
                if (r1 == 0) goto L22
                r0 = 1
                if (r1 == r0) goto L1f
                r0 = 2
                if (r1 == r0) goto L1c
                r0 = 3
                if (r1 == r0) goto L19
                r0 = 4
                if (r1 == r0) goto L16
                r0 = 5
                if (r1 == r0) goto L13
                r1 = 0
                return r1
            L13:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.BOOLEAN
                return r1
            L16:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.FLOAT
                return r1
            L19:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.LONG
                return r1
            L1c:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.INT
                return r1
            L1f:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING_SET
                return r1
            L22:
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.STRING
                return r1
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.EncryptedType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.EncryptedSharedPreferences$EncryptedType> r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r1 = (androidx.security.crypto.EncryptedSharedPreferences.EncryptedType) r1
                return r1
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[] values() {
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.EncryptedSharedPreferences$EncryptedType[] r0 = (androidx.security.crypto.EncryptedSharedPreferences.EncryptedType[]) r0
                return r0
        }

        public int getId() {
                r1 = this;
                int r0 = r1.mId
                return r0
        }
    }

    public enum PrefKeyEncryptionScheme extends java.lang.Enum<androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme> {
        private static final /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[] $VALUES = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme AES256_SIV = null;
        private final java.lang.String mDeterministicAeadKeyTemplateName;

        private static /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[] $values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = new androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[]{r0}
                return r0
        }

        static {
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme r0 = new androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme
                java.lang.String r1 = "AES256_SIV"
                r2 = 0
                r0.<init>(r1, r2, r1)
                androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV = r0
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = $values()
                androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.$VALUES = r0
                return
        }

        PrefKeyEncryptionScheme(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mDeterministicAeadKeyTemplateName = r3
                return
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme> r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme r1 = (androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme) r1
                return r1
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[] values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme[] r0 = (androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme[]) r0
                return r0
        }

        com.google.crypto.tink.KeyTemplate getKeyTemplate() throws java.security.GeneralSecurityException {
                r1 = this;
                java.lang.String r0 = r1.mDeterministicAeadKeyTemplateName
                com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplates.get(r0)
                return r0
        }
    }

    public enum PrefValueEncryptionScheme extends java.lang.Enum<androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme> {
        private static final /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[] $VALUES = null;
        public static final androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme AES256_GCM = null;
        private final java.lang.String mAeadKeyTemplateName;

        private static /* synthetic */ androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[] $values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = new androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[]{r0}
                return r0
        }

        static {
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme r0 = new androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme
                java.lang.String r1 = "AES256_GCM"
                r2 = 0
                r0.<init>(r1, r2, r1)
                androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM = r0
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = $values()
                androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.$VALUES = r0
                return
        }

        PrefValueEncryptionScheme(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mAeadKeyTemplateName = r3
                return
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme> r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme r1 = (androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme) r1
                return r1
        }

        public static androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[] values() {
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme[] r0 = (androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme[]) r0
                return r0
        }

        com.google.crypto.tink.KeyTemplate getKeyTemplate() throws java.security.GeneralSecurityException {
                r1 = this;
                java.lang.String r0 = r1.mAeadKeyTemplateName
                com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplates.get(r0)
                return r0
        }
    }

    EncryptedSharedPreferences(java.lang.String r1, java.lang.String r2, android.content.SharedPreferences r3, com.google.crypto.tink.Aead r4, com.google.crypto.tink.DeterministicAead r5) {
            r0 = this;
            r0.<init>()
            r0.mFileName = r1
            r0.mSharedPreferences = r3
            r0.mMasterKeyAlias = r2
            r0.mValueAead = r4
            r0.mKeyDeterministicAead = r5
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.mListeners = r1
            return
    }

    public static android.content.SharedPreferences create(android.content.Context r0, java.lang.String r1, androidx.security.crypto.MasterKey r2, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme r3, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme r4) throws java.security.GeneralSecurityException, java.io.IOException {
            java.lang.String r2 = r2.getKeyAlias()
            android.content.SharedPreferences r0 = create(r1, r2, r0, r3, r4)
            return r0
    }

    @java.lang.Deprecated
    public static android.content.SharedPreferences create(java.lang.String r6, java.lang.String r7, android.content.Context r8, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme r9, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme r10) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.daead.DeterministicAeadConfig.register()
            com.google.crypto.tink.aead.AeadConfig.register()
            android.content.Context r8 = r8.getApplicationContext()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r0 = new com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder
            r0.<init>()
            com.google.crypto.tink.KeyTemplate r9 = r9.getKeyTemplate()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r9 = r0.withKeyTemplate(r9)
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r9 = r9.withSharedPref(r8, r0, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "android-keystore://"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r9 = r9.withMasterKeyUri(r0)
            com.google.crypto.tink.integration.android.AndroidKeysetManager r9 = r9.build()
            com.google.crypto.tink.KeysetHandle r9 = r9.getKeysetHandle()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r0 = new com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder
            r0.<init>()
            com.google.crypto.tink.KeyTemplate r10 = r10.getKeyTemplate()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r10 = r0.withKeyTemplate(r10)
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r10 = r10.withSharedPref(r8, r0, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r10 = r10.withMasterKeyUri(r0)
            com.google.crypto.tink.integration.android.AndroidKeysetManager r10 = r10.build()
            com.google.crypto.tink.KeysetHandle r10 = r10.getKeysetHandle()
            java.lang.Class<com.google.crypto.tink.DeterministicAead> r0 = com.google.crypto.tink.DeterministicAead.class
            java.lang.Object r9 = r9.getPrimitive(r0)
            r5 = r9
            com.google.crypto.tink.DeterministicAead r5 = (com.google.crypto.tink.DeterministicAead) r5
            java.lang.Class<com.google.crypto.tink.Aead> r9 = com.google.crypto.tink.Aead.class
            java.lang.Object r9 = r10.getPrimitive(r9)
            r4 = r9
            com.google.crypto.tink.Aead r4 = (com.google.crypto.tink.Aead) r4
            androidx.security.crypto.EncryptedSharedPreferences r9 = new androidx.security.crypto.EncryptedSharedPreferences
            r10 = 0
            android.content.SharedPreferences r3 = r8.getSharedPreferences(r6, r10)
            r0 = r9
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r9
    }

    private java.lang.Object getDecryptedObject(java.lang.String r9) throws java.lang.SecurityException {
            r8 = this;
            java.lang.String r0 = "Unhandled type for encrypted pref value: "
            java.lang.String r1 = "Unknown type ID for encrypted pref value: "
            boolean r2 = r8.isReservedKey(r9)
            if (r2 != 0) goto L10f
            java.lang.String r2 = "__NULL__"
            if (r9 != 0) goto Lf
            r9 = r2
        Lf:
            java.lang.String r9 = r8.encryptKey(r9)     // Catch: java.security.GeneralSecurityException -> Lf5
            android.content.SharedPreferences r3 = r8.mSharedPreferences     // Catch: java.security.GeneralSecurityException -> Lf5
            r4 = 0
            java.lang.String r3 = r3.getString(r9, r4)     // Catch: java.security.GeneralSecurityException -> Lf5
            if (r3 != 0) goto L1d
            return r4
        L1d:
            r5 = 0
            byte[] r3 = com.google.crypto.tink.subtle.Base64.decode(r3, r5)     // Catch: java.security.GeneralSecurityException -> Lf5
            com.google.crypto.tink.Aead r6 = r8.mValueAead     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> Lf5
            byte[] r9 = r9.getBytes(r7)     // Catch: java.security.GeneralSecurityException -> Lf5
            byte[] r9 = r6.decrypt(r3, r9)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)     // Catch: java.security.GeneralSecurityException -> Lf5
            r9.position(r5)     // Catch: java.security.GeneralSecurityException -> Lf5
            int r3 = r9.getInt()     // Catch: java.security.GeneralSecurityException -> Lf5
            androidx.security.crypto.EncryptedSharedPreferences$EncryptedType r6 = androidx.security.crypto.EncryptedSharedPreferences.EncryptedType.fromId(r3)     // Catch: java.security.GeneralSecurityException -> Lf5
            if (r6 == 0) goto Le2
            int[] r1 = androidx.security.crypto.EncryptedSharedPreferences.AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType     // Catch: java.security.GeneralSecurityException -> Lf5
            int r3 = r6.ordinal()     // Catch: java.security.GeneralSecurityException -> Lf5
            r1 = r1[r3]     // Catch: java.security.GeneralSecurityException -> Lf5
            r3 = 1
            switch(r1) {
                case 1: goto Lb4;
                case 2: goto Lab;
                case 3: goto La2;
                case 4: goto L99;
                case 5: goto L8d;
                case 6: goto L4f;
                default: goto L4b;
            }     // Catch: java.security.GeneralSecurityException -> Lf5
        L4b:
            java.lang.SecurityException r9 = new java.lang.SecurityException     // Catch: java.security.GeneralSecurityException -> Lf5
            goto Ld1
        L4f:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet     // Catch: java.security.GeneralSecurityException -> Lf5
            r0.<init>()     // Catch: java.security.GeneralSecurityException -> Lf5
        L54:
            boolean r1 = r9.hasRemaining()     // Catch: java.security.GeneralSecurityException -> Lf5
            if (r1 == 0) goto L7b
            int r1 = r9.getInt()     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.ByteBuffer r6 = r9.slice()     // Catch: java.security.GeneralSecurityException -> Lf5
            r6.limit(r1)     // Catch: java.security.GeneralSecurityException -> Lf5
            int r7 = r9.position()     // Catch: java.security.GeneralSecurityException -> Lf5
            int r7 = r7 + r1
            r9.position(r7)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.CharBuffer r1 = r1.decode(r6)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.String r1 = r1.toString()     // Catch: java.security.GeneralSecurityException -> Lf5
            r0.add(r1)     // Catch: java.security.GeneralSecurityException -> Lf5
            goto L54
        L7b:
            int r9 = r0.size()     // Catch: java.security.GeneralSecurityException -> Lf5
            if (r9 != r3) goto L8c
            java.lang.Object r9 = r0.valueAt(r5)     // Catch: java.security.GeneralSecurityException -> Lf5
            boolean r9 = r2.equals(r9)     // Catch: java.security.GeneralSecurityException -> Lf5
            if (r9 == 0) goto L8c
            return r4
        L8c:
            return r0
        L8d:
            byte r9 = r9.get()     // Catch: java.security.GeneralSecurityException -> Lf5
            if (r9 == 0) goto L94
            r5 = r3
        L94:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch: java.security.GeneralSecurityException -> Lf5
            return r9
        L99:
            float r9 = r9.getFloat()     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch: java.security.GeneralSecurityException -> Lf5
            return r9
        La2:
            long r0 = r9.getLong()     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch: java.security.GeneralSecurityException -> Lf5
            return r9
        Lab:
            int r9 = r9.getInt()     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.security.GeneralSecurityException -> Lf5
            return r9
        Lb4:
            int r0 = r9.getInt()     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.ByteBuffer r1 = r9.slice()     // Catch: java.security.GeneralSecurityException -> Lf5
            r9.limit(r0)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> Lf5
            java.nio.CharBuffer r9 = r9.decode(r1)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.String r9 = r9.toString()     // Catch: java.security.GeneralSecurityException -> Lf5
            boolean r0 = r9.equals(r2)     // Catch: java.security.GeneralSecurityException -> Lf5
            if (r0 == 0) goto Ld0
            return r4
        Ld0:
            return r9
        Ld1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> Lf5
            r1.<init>(r0)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.StringBuilder r0 = r1.append(r6)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.String r0 = r0.toString()     // Catch: java.security.GeneralSecurityException -> Lf5
            r9.<init>(r0)     // Catch: java.security.GeneralSecurityException -> Lf5
            throw r9     // Catch: java.security.GeneralSecurityException -> Lf5
        Le2:
            java.lang.SecurityException r9 = new java.lang.SecurityException     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> Lf5
            r0.<init>(r1)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.security.GeneralSecurityException -> Lf5
            java.lang.String r0 = r0.toString()     // Catch: java.security.GeneralSecurityException -> Lf5
            r9.<init>(r0)     // Catch: java.security.GeneralSecurityException -> Lf5
            throw r9     // Catch: java.security.GeneralSecurityException -> Lf5
        Lf5:
            r9 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not decrypt value. "
            r1.<init>(r2)
            java.lang.String r2 = r9.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r9)
            throw r0
        L10f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r9 = r1.append(r9)
            java.lang.String r1 = " is a reserved key for the encryption keyset."
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isReservedKey(r3)
            if (r0 != 0) goto L11
            java.lang.String r3 = r2.encryptKey(r3)
            android.content.SharedPreferences r0 = r2.mSharedPreferences
            boolean r3 = r0.contains(r3)
            return r3
        L11:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is a reserved key for the encryption keyset."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    java.lang.String decryptKey(java.lang.String r4) {
            r3 = this;
            com.google.crypto.tink.DeterministicAead r0 = r3.mKeyDeterministicAead     // Catch: java.security.GeneralSecurityException -> L22
            r1 = 0
            byte[] r4 = com.google.crypto.tink.subtle.Base64.decode(r4, r1)     // Catch: java.security.GeneralSecurityException -> L22
            java.lang.String r1 = r3.mFileName     // Catch: java.security.GeneralSecurityException -> L22
            byte[] r1 = r1.getBytes()     // Catch: java.security.GeneralSecurityException -> L22
            byte[] r4 = r0.decryptDeterministically(r4, r1)     // Catch: java.security.GeneralSecurityException -> L22
            java.lang.String r0 = new java.lang.String     // Catch: java.security.GeneralSecurityException -> L22
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L22
            r0.<init>(r4, r1)     // Catch: java.security.GeneralSecurityException -> L22
            java.lang.String r4 = "__NULL__"
            boolean r4 = r0.equals(r4)     // Catch: java.security.GeneralSecurityException -> L22
            if (r4 == 0) goto L21
            r0 = 0
        L21:
            return r0
        L22:
            r4 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not decrypt key. "
            r1.<init>(r2)
            java.lang.String r2 = r4.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
            r2 = this;
            androidx.security.crypto.EncryptedSharedPreferences$Editor r0 = new androidx.security.crypto.EncryptedSharedPreferences$Editor
            android.content.SharedPreferences r1 = r2.mSharedPreferences
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.<init>(r2, r1)
            return r0
    }

    java.lang.String encryptKey(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            java.lang.String r4 = "__NULL__"
        L4:
            com.google.crypto.tink.DeterministicAead r0 = r3.mKeyDeterministicAead     // Catch: java.security.GeneralSecurityException -> L1b
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r4 = r4.getBytes(r1)     // Catch: java.security.GeneralSecurityException -> L1b
            java.lang.String r1 = r3.mFileName     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r1 = r1.getBytes()     // Catch: java.security.GeneralSecurityException -> L1b
            byte[] r4 = r0.encryptDeterministically(r4, r1)     // Catch: java.security.GeneralSecurityException -> L1b
            java.lang.String r4 = com.google.crypto.tink.subtle.Base64.encode(r4)     // Catch: java.security.GeneralSecurityException -> L1b
            return r4
        L1b:
            r4 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not encrypt key. "
            r1.<init>(r2)
            java.lang.String r2 = r4.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    android.util.Pair<java.lang.String, java.lang.String> encryptKeyValuePair(java.lang.String r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            java.lang.String r3 = r2.encryptKey(r3)
            com.google.crypto.tink.Aead r0 = r2.mValueAead
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r3.getBytes(r1)
            byte[] r4 = r0.encrypt(r4, r1)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r4 = com.google.crypto.tink.subtle.Base64.encode(r4)
            r0.<init>(r3, r4)
            return r0
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r4.mSharedPreferences
            java.util.Map r1 = r1.getAll()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r4.isReservedKey(r3)
            if (r3 != 0) goto L13
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r4.decryptKey(r2)
            java.lang.Object r3 = r4.getDecryptedObject(r2)
            r0.put(r2, r3)
            goto L13
        L3d:
            return r0
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.Object r2 = r1.getDecryptedObject(r2)
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto Le
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r3 = r2.booleanValue()
        Le:
            return r3
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            java.lang.Object r2 = r1.getDecryptedObject(r2)
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto Le
            java.lang.Float r2 = (java.lang.Float) r2
            float r3 = r2.floatValue()
        Le:
            return r3
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.Object r2 = r1.getDecryptedObject(r2)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Le
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
        Le:
            return r3
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String r2, long r3) {
            r1 = this;
            java.lang.Object r2 = r1.getDecryptedObject(r2)
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto Le
            java.lang.Long r2 = (java.lang.Long) r2
            long r3 = r2.longValue()
        Le:
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r2 = r1.getDecryptedObject(r2)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        Lb:
            return r3
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r2, java.util.Set<java.lang.String> r3) {
            r1 = this;
            java.lang.Object r2 = r1.getDecryptedObject(r2)
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto Lb
            java.util.Set r2 = (java.util.Set) r2
            goto L10
        Lb:
            androidx.collection.ArraySet r2 = new androidx.collection.ArraySet
            r2.<init>()
        L10:
            int r0 = r2.size()
            if (r0 <= 0) goto L17
            r3 = r2
        L17:
            return r3
    }

    boolean isReservedKey(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L13
            java.lang.String r0 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<android.content.SharedPreferences$OnSharedPreferenceChangeListener> r0 = r1.mListeners
            r0.remove(r2)
            return
    }
}
