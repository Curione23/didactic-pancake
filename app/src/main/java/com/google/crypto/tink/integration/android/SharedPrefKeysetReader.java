package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPrefKeysetReader implements com.google.crypto.tink.KeysetReader {
    private final java.lang.String keysetName;
    private final android.content.SharedPreferences sharedPreferences;

    public SharedPrefKeysetReader(android.content.Context r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L1c
            r0.keysetName = r2
            android.content.Context r1 = r1.getApplicationContext()
            if (r3 != 0) goto L14
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            r0.sharedPreferences = r1
            goto L1b
        L14:
            r2 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
            r0.sharedPreferences = r1
        L1b:
            return
        L1c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "keysetName cannot be null"
            r1.<init>(r2)
            throw r1
    }

    private byte[] readPref() throws java.io.IOException {
            r3 = this;
            android.content.SharedPreferences r0 = r3.sharedPreferences     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r3.keysetName     // Catch: java.lang.Throwable -> L22
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L10
            byte[] r0 = com.google.crypto.tink.subtle.Hex.decode(r0)     // Catch: java.lang.Throwable -> L22
            return r0
        L10:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "can't read keyset; the pref value %s does not exist"
            java.lang.String r2 = r3.keysetName     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L22:
            java.io.CharConversionException r0 = new java.io.CharConversionException
            java.lang.String r1 = r3.keysetName
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "can't read keyset; the pref value %s is not a valid hex string"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.readPref()
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.Keyset r0 = com.google.crypto.tink.proto.Keyset.parseFrom(r0, r1)
            return r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.readPref()
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.EncryptedKeyset r0 = com.google.crypto.tink.proto.EncryptedKeyset.parseFrom(r0, r1)
            return r0
    }
}
