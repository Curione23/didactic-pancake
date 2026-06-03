package com.google.crypto.tink.util;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class SecretBytes {
    private final com.google.crypto.tink.util.Bytes bytes;

    private SecretBytes(com.google.crypto.tink.util.Bytes r1) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            return
    }

    public static com.google.crypto.tink.util.SecretBytes copyFrom(byte[] r0, com.google.crypto.tink.SecretKeyAccess r1) {
            if (r1 == 0) goto Lc
            com.google.crypto.tink.util.SecretBytes r1 = new com.google.crypto.tink.util.SecretBytes
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            r1.<init>(r0)
            return r1
        Lc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess required"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.util.SecretBytes randomBytes(int r1) {
            com.google.crypto.tink.util.SecretBytes r0 = new com.google.crypto.tink.util.SecretBytes
            byte[] r1 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r1)
            r0.<init>(r1)
            return r0
    }

    public boolean equalsSecretBytes(com.google.crypto.tink.util.SecretBytes r2) {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.bytes
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.util.Bytes r2 = r2.bytes
            byte[] r2 = r2.toByteArray()
            boolean r2 = java.security.MessageDigest.isEqual(r0, r2)
            return r2
    }

    public int size() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.bytes
            int r0 = r0.size()
            return r0
    }

    public byte[] toByteArray(com.google.crypto.tink.SecretKeyAccess r2) {
            r1 = this;
            if (r2 == 0) goto L9
            com.google.crypto.tink.util.Bytes r2 = r1.bytes
            byte[] r2 = r2.toByteArray()
            return r2
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "SecretKeyAccess required"
            r2.<init>(r0)
            throw r2
    }
}
