package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPrefKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private final android.content.SharedPreferences.Editor editor;
    private final java.lang.String keysetName;

    public SharedPrefKeysetWriter(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L24
            r0.keysetName = r2
            android.content.Context r1 = r1.getApplicationContext()
            if (r3 != 0) goto L18
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.editor = r1
            goto L23
        L18:
            r2 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.editor = r1
        L23:
            return
        L24:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "keysetName cannot be null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.EncryptedKeyset r3) throws java.io.IOException {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.editor
            java.lang.String r1 = r2.keysetName
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Hex.encode(r3)
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            boolean r3 = r3.commit()
            if (r3 == 0) goto L17
            return
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Failed to write to SharedPreferences"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.Keyset r3) throws java.io.IOException {
            r2 = this;
            android.content.SharedPreferences$Editor r0 = r2.editor
            java.lang.String r1 = r2.keysetName
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Hex.encode(r3)
            android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)
            boolean r3 = r3.commit()
            if (r3 == 0) goto L17
            return
        L17:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Failed to write to SharedPreferences"
            r3.<init>(r0)
            throw r3
    }
}
