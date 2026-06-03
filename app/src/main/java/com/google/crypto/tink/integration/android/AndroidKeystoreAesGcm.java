package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidKeystoreAesGcm implements com.google.crypto.tink.Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 100;
    private static final java.lang.String TAG = "AndroidKeystoreAesGcm";
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final javax.crypto.SecretKey key;

    static {
            return
    }

    public AndroidKeystoreAesGcm(java.lang.String r4) throws java.security.GeneralSecurityException, java.io.IOException {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            r1 = 0
            r0.load(r1)
            java.security.Key r0 = r0.getKey(r4, r1)
            javax.crypto.SecretKey r0 = (javax.crypto.SecretKey) r0
            r3.key = r0
            if (r0 == 0) goto L18
            return
        L18:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Keystore cannot load the key with ID: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    AndroidKeystoreAesGcm(java.lang.String r3, java.security.KeyStore r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.security.Key r4 = r4.getKey(r3, r0)
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            r2.key = r4
            if (r4 == 0) goto Lf
            return
        Lf:
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Keystore cannot load the key with ID: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private byte[] decryptInternal(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = 12
            r0.<init>(r1, r6, r2, r3)
            java.lang.String r1 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            r2 = 2
            javax.crypto.SecretKey r4 = r5.key
            r1.init(r2, r4, r0)
            r1.updateAAD(r7)
            int r7 = r6.length
            int r7 = r7 - r3
            byte[] r6 = r1.doFinal(r6, r3, r7)
            return r6
    }

    private byte[] encryptInternal(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            int r0 = r9.length
            r1 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r1) goto L2f
            int r0 = r9.length
            int r0 = r0 + 28
            byte[] r0 = new byte[r0]
            java.lang.String r1 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r7 = javax.crypto.Cipher.getInstance(r1)
            r1 = 1
            javax.crypto.SecretKey r2 = r8.key
            r7.init(r1, r2)
            r7.updateAAD(r10)
            int r4 = r9.length
            r6 = 12
            r3 = 0
            r1 = r7
            r2 = r9
            r5 = r0
            r1.doFinal(r2, r3, r4, r5, r6)
            byte[] r9 = r7.getIV()
            r10 = 12
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r0, r1, r10)
            return r0
        L2f:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "plaintext too long"
            r9.<init>(r10)
            throw r9
    }

    private static void sleepRandomAmount() {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc
        Lc:
            return
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 28
            if (r0 < r1) goto L1e
            byte[] r4 = r3.decryptInternal(r4, r5)     // Catch: java.security.GeneralSecurityException -> La java.security.ProviderException -> Lc javax.crypto.AEADBadTagException -> L1c
            return r4
        La:
            r0 = move-exception
            goto Ld
        Lc:
            r0 = move-exception
        Ld:
            java.lang.String r1 = com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm.TAG
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            sleepRandomAmount()
            byte[] r4 = r3.decryptInternal(r4, r5)
            return r4
        L1c:
            r4 = move-exception
            throw r4
        L1e:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "ciphertext too short"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            byte[] r4 = r3.encryptInternal(r4, r5)     // Catch: java.security.GeneralSecurityException -> L5 java.security.ProviderException -> L7
            return r4
        L5:
            r0 = move-exception
            goto L8
        L7:
            r0 = move-exception
        L8:
            java.lang.String r1 = com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm.TAG
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            sleepRandomAmount()
            byte[] r4 = r3.encryptInternal(r4, r5)
            return r4
    }
}
