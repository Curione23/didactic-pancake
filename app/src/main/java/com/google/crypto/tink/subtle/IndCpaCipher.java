package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public interface IndCpaCipher {
    byte[] decrypt(byte[] r1) throws java.security.GeneralSecurityException;

    byte[] encrypt(byte[] r1) throws java.security.GeneralSecurityException;
}
