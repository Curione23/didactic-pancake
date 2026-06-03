package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class TinkProtoKeysetFormat {
    private TinkProtoKeysetFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeysetHandle parseEncryptedKeyset(byte[] r0, com.google.crypto.tink.Aead r1, byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r0)     // Catch: java.io.IOException -> L9
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.readWithAssociatedData(r0, r1, r2)     // Catch: java.io.IOException -> L9
            return r0
        L9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parse keyset failed"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.KeysetHandle parseKeyset(byte[] r0, com.google.crypto.tink.SecretKeyAccess r1) throws java.security.GeneralSecurityException {
            if (r1 == 0) goto L13
            com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r0)     // Catch: java.io.IOException -> Lb
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.CleartextKeysetHandle.read(r0)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parse keyset failed"
            r0.<init>(r1)
            throw r0
        L13:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.KeysetHandle parseKeysetWithoutSecret(byte[] r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetReader r1 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r1)     // Catch: java.io.IOException -> L9
            com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.KeysetHandle.readNoSecret(r1)     // Catch: java.io.IOException -> L9
            return r1
        L9:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Parse keyset failed"
            r1.<init>(r0)
            throw r1
    }

    public static byte[] serializeEncryptedKeyset(com.google.crypto.tink.KeysetHandle r2, com.google.crypto.tink.Aead r3, byte[] r4) throws java.security.GeneralSecurityException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L11
            r0.<init>()     // Catch: java.io.IOException -> L11
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L11
            r2.writeWithAssociatedData(r1, r3, r4)     // Catch: java.io.IOException -> L11
            byte[] r2 = r0.toByteArray()     // Catch: java.io.IOException -> L11
            return r2
        L11:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Serialize keyset failed"
            r2.<init>(r3)
            throw r2
    }

    public static byte[] serializeKeyset(com.google.crypto.tink.KeysetHandle r1, com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException {
            if (r2 == 0) goto L1b
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L13
            r2.<init>()     // Catch: java.io.IOException -> L13
            com.google.crypto.tink.KeysetWriter r0 = com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(r2)     // Catch: java.io.IOException -> L13
            com.google.crypto.tink.CleartextKeysetHandle.write(r1, r0)     // Catch: java.io.IOException -> L13
            byte[] r1 = r2.toByteArray()     // Catch: java.io.IOException -> L13
            return r1
        L13:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Serialize keyset failed"
            r1.<init>(r2)
            throw r1
        L1b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "SecretKeyAccess cannot be null"
            r1.<init>(r2)
            throw r1
    }

    public static byte[] serializeKeysetWithoutSecret(com.google.crypto.tink.KeysetHandle r2) throws java.security.GeneralSecurityException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L11
            r0.<init>()     // Catch: java.io.IOException -> L11
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L11
            r2.writeNoSecret(r1)     // Catch: java.io.IOException -> L11
            byte[] r2 = r0.toByteArray()     // Catch: java.io.IOException -> L11
            return r2
        L11:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Serialize keyset failed"
            r2.<init>(r0)
            throw r2
    }
}
