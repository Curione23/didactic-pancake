package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class Random {
    private static final java.lang.ThreadLocal<java.security.SecureRandom> localRandom = null;


    static {
            com.google.crypto.tink.subtle.Random$1 r0 = new com.google.crypto.tink.subtle.Random$1
            r0.<init>()
            com.google.crypto.tink.subtle.Random.localRandom = r0
            return
    }

    private Random() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.security.SecureRandom access$000() {
            java.security.SecureRandom r0 = newDefaultSecureRandom()
            return r0
    }

    private static java.security.SecureRandom newDefaultSecureRandom() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextLong()
            return r0
    }

    public static byte[] randBytes(int r1) {
            byte[] r1 = new byte[r1]
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = com.google.crypto.tink.subtle.Random.localRandom
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            r0.nextBytes(r1)
            return r1
    }

    public static final int randInt() {
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = com.google.crypto.tink.subtle.Random.localRandom
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            int r0 = r0.nextInt()
            return r0
    }

    public static final int randInt(int r1) {
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = com.google.crypto.tink.subtle.Random.localRandom
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            int r1 = r0.nextInt(r1)
            return r1
    }
}
